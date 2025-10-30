package com.company.netsdk.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.company.NetSDK.CB_fTimeDownLoadPosCallBack;
import com.company.NetSDK.FinalVar;
import com.company.NetSDK.NET_RECORDFILE_INFO;
import com.company.NetSDK.NET_TIME;
import com.company.netsdk.R;
import com.company.netsdk.common.ToolKits;
import com.company.netsdk.module.DownLoadRecordFileModule;
import com.company.netsdk.module.LivePreviewModule;
import com.company.netsdk.module.PlayBackModule;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by 32940 on 2017/6/28.
 */
public class DownLoadRecordFileActivity extends AppCompatActivity implements View.OnClickListener{
    DownLoadRecordFileModule downLoadRecordFileModule;
    LivePreviewModule mLivePreviewModule;
    NetSDKApplication app;
    AlertDialog.Builder builder;

    Spinner mChnSpinner;
    Spinner mStreamSpinner;

    ///日期时间控件
    DatePicker mDatePicker;
    TimePicker mTimePicker;
    ///日期时间控件弹窗
    View mLayoutView;
    AlertDialog timeDialog;

    ///日期时间显示文本控件
    TextView mTextViewStartDate;
    TextView mTextViewEndDate;
    TextView mTextViewStartTime;
    TextView mTextViewEndTime;

    ///进度显示控件
    TextView mTextView;
    TextView mTextViewProgress;
    SeekBar mSeekBar;

    Button mDownloadButton;
    Button mDownloadByDatatypeButton;
    DownLoadPosCallBack cbPosDownload;
    NET_TIME selectTime = new NET_TIME();
    NET_TIME startTime = new NET_TIME();
    NET_TIME endTime = new NET_TIME();

    boolean bDownloadFlag = false;
    private final int DOWNLOADING = 0x11;
    private final int DOWNLOAD_COMPLETED = 0x12;
    private final int DOWNLOAD_START_DATE_TIME = 1;
    private final int DOWNLOAD_END_DATE_TIME = 2;
    private int downloadTimeId = 0;

    Handler mHandler = new Handler(Looper.getMainLooper()){
        @Override
        public void handleMessage(Message msg){
            switch (msg.what){
                case DOWNLOADING:   ///用于接收下载进度
                    mTextViewProgress.setText("(" + msg.arg1 + "%)");
                    mSeekBar.setProgress(msg.arg2);
                    break;
                case DOWNLOAD_COMPLETED:   ///用于接收判断是否下载完成的信息
                    mSeekBar.setProgress(msg.arg2);
                    mTextViewProgress.setText("(100%)");
                    mTextView.setText(R.string.download_complete_progress);

                    downLoadRecordFileModule.stopDownLoadRecord();
                    setDownloadStatus(false);
                    mTextView.setText(R.string.download_complete_progress);
                    mDownloadButton.setText(R.string.start_download);
                    builder = new AlertDialog.Builder(DownLoadRecordFileActivity.this);
                    builder.setMessage(R.string.download_completed);
                    builder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.show();
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_record_file);
        setTitle(R.string.activity_function_list_download_record);

        app = (NetSDKApplication)getApplication();
        cbPosDownload = new DownLoadPosCallBack();
        downLoadRecordFileModule = new DownLoadRecordFileModule(this);
        mLivePreviewModule = new LivePreviewModule(this);

        // 添加返回键
        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setHomeButtonEnabled(false);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        setupView();
    }

    private void setupView(){
        mChnSpinner = (Spinner)findViewById(R.id.channel_spinner);
        mChnSpinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,
                                mLivePreviewModule.getChannelList()));
        mChnSpinner.setSelection(0);

        mStreamSpinner = (Spinner)findViewById(R.id.stream_spinner);
        mStreamSpinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,
                                    downLoadRecordFileModule.getStreamTypeList()));
        mStreamSpinner.setSelection(0);

        mTextViewStartDate = (TextView)findViewById(R.id.download_start_date);
        mTextViewStartTime = (TextView)findViewById(R.id.download_start_time);
        mTextViewStartDate.setOnClickListener(this);
        mTextViewStartTime.setOnClickListener(this);

        mTextViewEndDate = (TextView)findViewById(R.id.download_end_date);
        mTextViewEndTime = (TextView)findViewById(R.id.download_end_time);
        mTextViewEndDate.setOnClickListener(this);
        mTextViewEndTime.setOnClickListener(this);

        mLayoutView = View.inflate(DownLoadRecordFileActivity.this, R.layout.date_time_setting, null);
        mDatePicker = (DatePicker)mLayoutView.findViewById(R.id.date_set_picker);
        mTimePicker = (TimePicker)mLayoutView.findViewById(R.id.time_set_picker);
        mTimePicker.setIs24HourView(true);

        mTextView = (TextView)findViewById(R.id.down_textview);
        mTextViewProgress = (TextView)findViewById(R.id.download_progress);
        mSeekBar = (SeekBar)findViewById(R.id.download_seekbar);
        mSeekBar.setProgress(0);
        mSeekBar.setEnabled(false);

        mDownloadButton = (Button)findViewById(R.id.download_button);
        mDownloadButton.setOnClickListener(this);

        mDownloadByDatatypeButton = (Button)findViewById(R.id.download_by_datatype_button);
        mDownloadByDatatypeButton.setOnClickListener(this);

        initDownloadTime();
        createTimeDialog();
    }

    public void initDownloadTime() {
        Calendar calendar = Calendar.getInstance();
        java.util.Date date = new java.util.Date();
        calendar.setTime(date);

        startTime.dwYear = calendar.get(Calendar.YEAR);
        startTime.dwMonth = calendar.get(Calendar.MONTH) + 1;
        startTime.dwDay = calendar.get(Calendar.DAY_OF_MONTH);
        startTime.dwHour = calendar.get(Calendar.HOUR_OF_DAY);
        startTime.dwMinute = calendar.get(Calendar.MINUTE);;
        startTime.dwSecond = 0;

       copyTime(endTime, startTime);

        mTextViewStartDate.setText(new SimpleDateFormat("yyyy-MM-dd").format(date));
        mTextViewStartTime.setText(new SimpleDateFormat("HH:mm").format(date));

        mTextViewEndDate.setText(new SimpleDateFormat("yyyy-MM-dd").format(date));
        mTextViewEndTime.setText(new SimpleDateFormat("HH:mm").format(date));
    }

    ///日期时间弹窗以及下载按钮监听
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.download_start_date:
            case R.id.download_start_time:
                selectDownloadTime(DOWNLOAD_START_DATE_TIME);
                break;
            case R.id.download_end_date:
            case R.id.download_end_time:
                selectDownloadTime(DOWNLOAD_END_DATE_TIME);
                break;
            case R.id.download_button:
                if(!bDownloadFlag) {
                    mTextView.setText(R.string.download_progress);
                    mTextViewProgress.setText("(0%)");
                    ToolKits.writeLog("开始时间：" + startTime);
                    ToolKits.writeLog("结束时间：" + endTime);
                    if(downLoadRecordFileModule.startDownLocadRecord(app.getLoginHandle(), mChnSpinner.getSelectedItemPosition(), mStreamSpinner.getSelectedItemPosition(), startTime, endTime, cbPosDownload)) {
                        setDownloadStatus(true);
                        ToolKits.showMessage(DownLoadRecordFileActivity.this, getString(R.string.start_download));
                    } else {
                        if (downLoadRecordFileModule.isNoRecord()) {
                            Toast.makeText(DownLoadRecordFileActivity.this,getString(R.string.no_record_found),Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(DownLoadRecordFileActivity.this,getString(R.string.download_failed),Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    downLoadRecordFileModule.stopDownLoadRecord();
                    setDownloadStatus(false);
                    mTextView.setText(R.string.download_stop_progress);
                }
                break;
            case R.id.download_by_datatype_button:
                showListDialog();
                break;
            default:
                break;
        }
    }

    public void setDownloadStatus(boolean bDownloading) {
        bDownloadFlag = bDownloading;
        if (bDownloadFlag) {
            mDownloadButton.setText(R.string.stop_download);
            mTextView.setText(R.string.downloading_progress);
        }else {
            mDownloadButton.setText(R.string.start_download);
        }
        mChnSpinner.setEnabled(!bDownloadFlag);
        mStreamSpinner.setEnabled(!bDownloadFlag);
    }

    public void selectDownloadTime(int downloadId) {
        if(downLoadRecordFileModule.lDownloadHandle != 0) {
            ToolKits.showMessage(DownLoadRecordFileActivity.this, getString(R.string.please_first_stop_download));
            return;
        }
        downloadTimeId = downloadId;

        if (downloadTimeId == DOWNLOAD_START_DATE_TIME) {
            copyTime(selectTime, startTime);
        }else {
            copyTime(selectTime, endTime);
        }

        ///初始化控件、监听
        initDate((int)selectTime.dwYear, (int)selectTime.dwMonth-1, (int)selectTime.dwDay);
        initTime((int)selectTime.dwHour, (int)selectTime.dwMinute);

        ///弹窗时间控件
        timeDialog.show();
    }

    @Override
    protected void onResume() {
        // while onResume we should logout the device.
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        downLoadRecordFileModule.stopDownLoadRecord();
        downLoadRecordFileModule = null;
    }

    // 下载进度回调
    public class DownLoadPosCallBack implements CB_fTimeDownLoadPosCallBack {
        @Override
        public void invoke(long lPlayHandle, int dwTotalSize, int dwDownLoadSize, int index, NET_RECORDFILE_INFO recordfileinfo) {
            mSeekBar.setMax(dwTotalSize);
            ///下载完成后的操作处理
            if(dwDownLoadSize == -1) {
                Message msgmax = mHandler.obtainMessage(DOWNLOAD_COMPLETED);
                msgmax.arg2 = dwTotalSize;
                mHandler.sendMessage(msgmax);
                ToolKits.writeLog("下载完成, current time = " + new Date(System.currentTimeMillis()));
            }else {
                int pos = Math.min(100 * dwDownLoadSize / dwTotalSize, 100);
                Message msg = mHandler.obtainMessage(DOWNLOADING);
                msg.arg1 = pos;  ///文本进度
                msg.arg2 = dwDownLoadSize;  ///进度条进度
                mHandler.sendMessage(msg);
                ToolKits.writeLog("下载大小/文件总大小 : " + dwDownLoadSize + " / " + dwTotalSize + " 下载进度 : " +  pos);
            }
        }
    }

    ///年月日初始化、监听
    private void initDate(int dwyear, int dwmonth, int dwday) {
        mDatePicker.init(dwyear, dwmonth, dwday, new DatePicker.OnDateChangedListener() {
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                selectTime.dwYear = year;
                selectTime.dwMonth = monthOfYear+1;
                selectTime.dwDay = dayOfMonth;
            }
        });
    }

    ///时分初始化监听
    private void initTime(int dwhour, int dwminute) {
        mTimePicker.setCurrentHour(dwhour);
        mTimePicker.setCurrentMinute(dwminute);

        mTimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                selectTime.dwHour = hourOfDay;
                selectTime.dwMinute = minute;
            }
        });
    }

    private void createTimeDialog() {
        timeDialog = new android.app.AlertDialog.Builder(DownLoadRecordFileActivity.this)
                .setTitle(getString(R.string.select_time_continer))
                .setView(mLayoutView)
                .setPositiveButton(getString(R.string.confirm), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        String monthStr = formatTime(selectTime.dwMonth);
                        String dayStr = formatTime(selectTime.dwDay);
                        String hourStr = formatTime(selectTime.dwHour);
                        String minuteStr = formatTime(selectTime.dwMinute);

                        if (downloadTimeId == DOWNLOAD_START_DATE_TIME) {
                            copyTime(startTime,selectTime);
                            mTextViewStartDate.setText(String.valueOf(selectTime.dwYear) + "-" + monthStr + "-" + dayStr);
                            mTextViewStartTime.setText(hourStr + ":" + minuteStr);
                        }else {
                            copyTime(endTime,selectTime);
                            mTextViewEndDate.setText(String.valueOf(selectTime.dwYear) + "-" + monthStr + "-" + dayStr);
                            mTextViewEndTime.setText(hourStr + ":" + minuteStr);
                        }
                        dialog.cancel();
                    }
                })
                .setNegativeButton(getString(R.string.cancel), null).create();
    }

    private void copyTime(NET_TIME dst, NET_TIME src) {
        dst.dwYear = src.dwYear;
        dst.dwMonth = src.dwMonth;
        dst.dwDay = src.dwDay;
        dst.dwHour = src.dwHour;
        dst.dwMinute = src.dwMinute;
        dst.dwSecond = src.dwSecond;
    }

    private String formatTime(long t) {
        if (t < 10) {
            return "0" + String.valueOf(t);
        }
        return String.valueOf(t);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }

    private void showListDialog() {
        final String[] items = { "Private stream","GBPS stream","TS stream","MP4 stream","H264&H265 stream","FLV stream","PS stream" };
        AlertDialog.Builder listDialog =
                new AlertDialog.Builder(DownLoadRecordFileActivity.this);
        listDialog.setTitle(R.string.datatype_choose);
        listDialog.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int streamType) {
                // which 下标从0开始
                // ...To-do
                downLoadRecordFileModule.startDownloadByDataType(app.getLoginHandle(), mChnSpinner.getSelectedItemPosition(), streamType, startTime, endTime, cbPosDownload);

            }
        });
        listDialog.show();
    }
}
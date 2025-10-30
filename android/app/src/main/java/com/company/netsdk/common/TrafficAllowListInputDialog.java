package com.company.netsdk.common;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.company.NetSDK.NET_TIME;
import com.company.netsdk.R;

import java.util.Calendar;

public class TrafficAllowListInputDialog extends Dialog implements DialogInterface.OnClickListener {

    private Button commitBtn;
    private TextView titleTv;
    private TextView carNumTv;
    private TextView ownerTv;
    private TextView startTv;
    private TextView endTv;
    private TextView authTv;
    private EditText carNumEt;
    private EditText ownerEt;
    private EditText startEt;
    private EditText endEt;
    private RadioGroup authRg;
    private RadioButton authRbY;
    private RadioButton authRbN;
    private String szCarNum;
    private String szOwner;
    private String szStart;
    private String szEnd;
    private boolean bAuth;


    private Context context;
    private View view;
    private TrafficAllowListInfo tempData;
    private OnTrafficAllowListInputDialogListener onTrafficAllowListInputDialogListener;


    public TrafficAllowListInputDialog(@NonNull Context context) {
        super(context, R.style.NormalDialogStyle);
        this.context = context;
        this.getWindow().setBackgroundDrawableResource(R.drawable.dialog_shape);
//        this.onTrafficAllowListInputDialogListener = onTrafficAllowListInputDialogListener;
    }
    public TrafficAllowListInputDialog(@NonNull Context context,@NonNull String szCarNum, @NonNull String szOwner,
                                       @NonNull String szStart, @NonNull  String szEnd, @NonNull  boolean bAuth) {
        super(context, R.style.NormalDialogStyle);
        this.context = context;
        this.szCarNum = szCarNum;
        this.szOwner = szOwner;
        this.szStart = szStart;
        this.szEnd = szEnd;
        this.bAuth = bAuth;
        this.getWindow().setBackgroundDrawableResource(R.drawable.dialog_shape);
    }
    public void setOnTrafficAllowListInputDialogListener(OnTrafficAllowListInputDialogListener onTrafficAllowListInputDialogListener) {
        this.onTrafficAllowListInputDialogListener = onTrafficAllowListInputDialogListener;
    }

    public TrafficAllowListInputDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        this.context = context;
    }

    protected TrafficAllowListInputDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        this.context = context;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.traffic_allow_list_input_dialog);
        //按空白处不能取消动画
        setCanceledOnTouchOutside(true);
        //初始化界面控件
        initView();
        //初始化界面数据
        initData();
        //初始化界面控件的事件
        initEvent();
    }
    /**
     * 初始化界面控件
     */
    private void initView() {
        carNumTv = (TextView) findViewById(R.id.car_num_tv);
        ownerTv = (TextView) findViewById(R.id.owner_tv);
        startTv = (TextView) findViewById(R.id.start_time_tv);
        endTv = (TextView) findViewById(R.id.end_time_tv);
        authTv = (TextView) findViewById(R.id.auth_tv);
        carNumEt = (EditText) findViewById(R.id.car_num_et);
        ownerEt = (EditText) findViewById(R.id.owner_et);
        startEt = (EditText) findViewById(R.id.start_time_et);
        endEt = (EditText) findViewById(R.id.end_time_et);
        authRg = (RadioGroup) findViewById(R.id.auth_rg);
        authRbY = (RadioButton) findViewById(R.id.auth_rb_y);
        authRbN = (RadioButton) findViewById(R.id.auth_rb_n);
        commitBtn = (Button) findViewById(R.id.commit_btn);
        view = findViewById(R.id.traffic_allow_list_input_dialog);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        WindowManager wm =  this.getWindow().getWindowManager();
        int width = wm.getDefaultDisplay().getWidth();
        layoutParams.width = width - 100;
        view.setLayoutParams(layoutParams);

        if(startEt.getText().toString().trim().equals("")){
            startEt.setText(ToolKits.getCurrentNetTime());
        }
        startEt.setKeyListener(null);
        startEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NET_TIME tmpTime = new NET_TIME();
                tmpTime.parseTime2Min(startEt.getText().toString().trim());
                CalendarDialog calendarDialog = new CalendarDialog(context,(int)tmpTime.dwYear,
                        (int)tmpTime.dwMonth,(int)tmpTime.dwDay,(int)tmpTime.dwHour,(int)tmpTime.dwMinute);
                calendarDialog.setOnCalendarDialogListener(new CalendarDialog.OnCalendarDialogListener() {
                    @Override
                    public void getIntentData(int year, int month, int day, int hour, int minute) {
                        startEt.setText(year+"/"+month+"/"+day+" "+hour+":"+minute);
                        calendarDialog.dismiss();
                    }
                });
                calendarDialog.show();
            }
        });

        if(endEt.getText().toString().trim().equals("")){
            endEt.setText(ToolKits.getCurrentNetTime());
        }
        endEt.setKeyListener(null);
        endEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NET_TIME tmpTime = new NET_TIME();
                tmpTime.parseTime2Min(endEt.getText().toString().trim());
                CalendarDialog calendarDialog = new CalendarDialog(context,(int)tmpTime.dwYear,
                        (int)tmpTime.dwMonth,(int)tmpTime.dwDay,(int)tmpTime.dwHour,(int)tmpTime.dwMinute);
                calendarDialog.setOnCalendarDialogListener(new CalendarDialog.OnCalendarDialogListener() {
                    @Override
                    public void getIntentData(int year, int month, int day, int hour, int minute) {
                        endEt.setText(year+"/"+month+"/"+day+" "+hour+":"+minute);
                        calendarDialog.dismiss();
                    }
                });
                calendarDialog.show();
            }
        });
    }
    /**
     * 初始化界面控件的显示数据
     */
    private void initData() {
        //如果用户自定了title和message
        if (szCarNum != null) {
            carNumEt.setText(szCarNum);
        }
        if (szOwner != null) {
            ownerEt.setText(szOwner);
        }
        //如果设置按钮的文字
        if (szStart != null) {
            startEt.setText(szStart);
        }
        if (szEnd != null) {
            endEt.setText(szEnd);
        }
        if (bAuth) {
            authRg.check(authRbY.getId());
        } else {
            authRg.check(authRbN.getId());
        }
    }
    /**
     * 初始化界面的确定监听器
     */
    private void initEvent() {
        //设置确定按钮被点击后，向外界提供监听
        commitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radioRst;
                if(R.id.auth_rb_y == authRg.getCheckedRadioButtonId()){
                    radioRst = "true";
                } else {
                    radioRst = "false";
                }
                tempData = new TrafficAllowListInfo(ownerEt.getText().toString(),carNumEt.getText().toString(),
                        startEt.getText().toString(),endEt.getText().toString(),radioRst);
                onTrafficAllowListInputDialogListener.getIntentData(tempData);

            }
        });

    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        onTrafficAllowListInputDialogListener.getIntentData(tempData);
    }


    public interface OnTrafficAllowListInputDialogListener {
        void getIntentData(TrafficAllowListInfo data); //接口中的方法，传入一个整型
    }

    public void setCarNumUnEdit(){
        this.carNumEt.setKeyListener(null);
//        this.carNumEt.setTextColor(0x7F7F7F);
        this.carNumEt.setTextColor(Color.GRAY);
//        this.carNumEt.setBackgroundColor(0x7F7F7F);
    }
}

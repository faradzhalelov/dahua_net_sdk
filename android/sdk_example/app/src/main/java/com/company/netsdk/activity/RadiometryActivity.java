package com.company.netsdk.activity;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.company.NetSDK.CB_fRadiometryAttachCB;
import com.company.NetSDK.NET_POINT;
import com.company.NetSDK.NET_RADIOMETRY_DATA;
import com.company.netsdk.R;
import com.company.netsdk.common.CoordinateInputDialog;
import com.company.netsdk.common.ToolKits;
import com.company.netsdk.module.RadiometryModule;

import java.util.ArrayList;

public class RadiometryActivity extends AppCompatActivity implements View.OnClickListener{
    private final String TAG = "RadiometryActivity";
    RadiometryModule mRadiometryModule;
    Spinner radiometryChannel;
    TextView radiometryLogList;
    ScrollView radiometryLog;
    Button btnAttach;
    Resources res;
    NET_RADIOMETRY_DATA tmpData = new NET_RADIOMETRY_DATA();
    private StringBuilder radiometryLogBuilder = new StringBuilder();

    public class Test_CB_fRadiometryAttachCB implements
            CB_fRadiometryAttachCB {
        @Override
        public void invoke(long lAttachHandle, NET_RADIOMETRY_DATA pBuf, int nBufLen) {
            ToolKits.writeLog("Tets_CB_fRadiometryAttachCB called");
            ToolKits.writeLog("lAttachHandle = " + lAttachHandle);
            ToolKits.writeLog("nBufLen = " + nBufLen);
            Message msg = mHandler.obtainMessage(0x01);;
            msg.obj = pBuf;
            mHandler.sendMessage(msg);
            tmpData = ToolKits.deepCopy(pBuf);
        }
    }

    Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg){
            switch (msg.what) {
                case 0x01:
                    NET_RADIOMETRY_DATA data = (NET_RADIOMETRY_DATA)msg.obj;
                    radiometryLogBuilder.append(res.getString(R.string.width) + ":" + data.stMetaData.nWidth + "\n");
                    radiometryLogBuilder.append(res.getString(R.string.height) + ":" + data.stMetaData.nHeight + "\n");
                    radiometryLogBuilder.append(res.getString(R.string.channel) + ":" + data.stMetaData.nChannel + "\n");
                    radiometryLogBuilder.append(res.getString(R.string.data_length) + ":" + data.stMetaData.nLength + "\n");
                    radiometryLogBuilder.append(res.getString(R.string.time) + ":" + data.stMetaData.stTime.toString() + "\n");
                    radiometryLogBuilder.append(res.getString(R.string.sensor_type) + ":" + new String(data.stMetaData.szSensorType).trim() + "\n");
                    radiometryLogBuilder.append("\n");
                    radiometryLogList.setText(radiometryLogBuilder.toString());
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiometry);
        setTitle(R.string.activity_function_list_radiometry);
        mRadiometryModule = new RadiometryModule(this);
        res = this.getResources();
        setupView();
    }
    private void setupView(){
        radiometryLogList = (TextView) findViewById(R.id.tv_radiometry_log_list);
        radiometryLog = findViewById(R.id.sv_radiometry_log_list);
        btnAttach = findViewById(R.id.btn_radiometry_attach);
        ((Button) findViewById(R.id.btn_get_random_region_temper)).setOnClickListener(this);
        ((Button) findViewById(R.id.btn_radiometry_attach)).setOnClickListener(this);
        ((Button) findViewById(R.id.btn_radiometry_fetch)).setOnClickListener(this);
        ((Button) findViewById(R.id.btn_radiometry_data_parse)).setOnClickListener(this);
        radiometryChannel = (Spinner)findViewById(R.id.spinner_radiometry_channel);
        initializeSpinner(radiometryChannel,(ArrayList)mRadiometryModule.getChannelList()).setSelection(0);
    }
    private Spinner initializeSpinner(final Spinner spinner, ArrayList array){
        spinner.setSelection(0,true);
        spinner.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,array));
        return spinner;
    }
    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.btn_get_random_region_temper:{
                Log.d(TAG, "button GetRandomRegionTemper clicked");
                CoordinateInputDialog coordinateInputDialog = new CoordinateInputDialog(this);
                coordinateInputDialog.setOnCoordinateInputDialogListener(new CoordinateInputDialog.OnCoordinateInputDialogListener() {
                    @Override
                    public void getIntentData(NET_POINT[] data) {
                        // 入参
                        radiometryLogBuilder.append(mRadiometryModule.getRandomRegionTemper(radiometryChannel.getSelectedItemPosition(),data));
                        radiometryLogBuilder.append("\n");
                        radiometryLogList.setText(radiometryLogBuilder.toString());
                        coordinateInputDialog.dismiss();
                    }
                });
                coordinateInputDialog.show();
                break;
            }
            case R.id.btn_radiometry_attach:{
                Log.d(TAG, "button RadiometryAttach clicked");
                if(!btnAttach.getText().equals(getString(R.string.radiometry_attach))){
                    radiometryLogBuilder.append(mRadiometryModule.radiometryDetach());
                    btnAttach.setText(R.string.radiometry_attach);
                    radiometryChannel.setEnabled(true);
                }else {
                    String tmpRst = mRadiometryModule.radiometryAttach(radiometryChannel.getSelectedItemPosition(), new Test_CB_fRadiometryAttachCB());
                    radiometryLogBuilder.append(tmpRst);
                    if(!tmpRst.contains(res.getString(R.string.failed))){
                        btnAttach.setText(R.string.radiometry_detach);
                        radiometryChannel.setEnabled(false);
                    }
                }
                radiometryLogBuilder.append("\n");
                radiometryLogList.setText(radiometryLogBuilder.toString());
                break;
            }
            case R.id.btn_radiometry_fetch:{
                Log.d(TAG, "button RadiometryFetch clicked");
                radiometryLogBuilder.append(mRadiometryModule.radiometryFetch(radiometryChannel.getSelectedItemPosition()));
                radiometryLogBuilder.append("\n");
                radiometryLogList.setText(radiometryLogBuilder.toString());
                break;
            }
            case R.id.btn_radiometry_data_parse:{
                Log.d(TAG, "button RadiometryDataParse clicked");
                radiometryLogBuilder.append(mRadiometryModule.radiometryDataParse(this.getApplicationContext(), tmpData));
                radiometryLogBuilder.append("\n");
                radiometryLogList.setText(radiometryLogBuilder.toString());
                break;
            }
            default:
                break;
        }
        radiometryLog.smoothScrollTo(0, radiometryLogList.getBottom());
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}

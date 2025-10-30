package com.company.netsdk.activity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.company.NetSDK.NET_OUT_FIND_NEXT_RECORD_PARAM;
import com.company.NetSDK.NET_TIME;
import com.company.NetSDK.NET_TRAFFIC_LIST_RECORD;
import com.company.netsdk.R;
import com.company.netsdk.activity.MotionDetectConfig.MotionDetectTimeSetActivity;
import com.company.netsdk.activity.MotionDetectConfig.MotionDetectTimeShowActivity;
import com.company.netsdk.common.ToolKits;
import com.company.netsdk.common.TrafficAllowListInfo;
import com.company.netsdk.common.TrafficAllowListInputDialog;
import com.company.netsdk.module.TrafficAllowListModule;
import com.lingber.mycontrol.datagridview.DataGridView;
import com.lingber.mycontrol.datagridview.LingberUtil;

import java.util.ArrayList;
import java.util.List;

public class TrafficAllowListActivity extends AppCompatActivity implements View.OnClickListener{

    private final String TAG = "TrafficAllowListActivity";
    TrafficAllowListModule mTrafficAllowListModule;
    DataGridView dataGridView;
    Button mCreate;
    Button mDelete;
    Button mUpdate;
    Button mQuery;
    Button mClear;
    TextView mInputPlate;
    List<TrafficAllowListInfo> dataSource;
    List<TrafficAllowListInfo> selectedData;
    NET_TRAFFIC_LIST_RECORD tempData;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic_allow_list);
        setTitle(R.string.title_traffic_allow_list);
        mTrafficAllowListModule = new TrafficAllowListModule(this);

        // 添加返回键
        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setHomeButtonEnabled(false);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        setupView();

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }

    private void setupView(){
//        ((Button) findViewById(R.id.subscribeBtn)).setOnClickListener(this);
        dataGridView = (DataGridView) findViewById(R.id.datagridview);
        mCreate = (Button) findViewById(R.id.btn_create);
        mDelete = (Button) findViewById(R.id.btn_delete);
        mUpdate = (Button) findViewById(R.id.btn_update);
        mQuery = (Button) findViewById(R.id.btn_query);
        mClear = (Button) findViewById(R.id.btn_clear);
        mInputPlate = (TextView) findViewById(R.id.input_data);
        mCreate.setOnClickListener(this);
        mDelete.setOnClickListener(this);
        mUpdate.setOnClickListener(this);
        mQuery.setOnClickListener(this);
        mClear.setOnClickListener(this);

        dataSource = new ArrayList();

        dataGridView.setColunms(4);
//        dataGridView.setRowHeight(100);
        dataGridView.setHeaderHeight(100);
        dataGridView.setHeaderContentByStringId(new int[]{R.string.str_num,R.string.str_owner,R.string.str_plate,R.string.str_is_open});
        dataGridView.setFieldNames(new String[]{"nRecordNo","szMasterOfCar","szPlateNumber","bAuthorityEnable"});
        dataGridView.setColunmWeight(new float[]{2,3,4,2});
        dataGridView.setCellContentView(new Class[]{TextView.class,TextView.class,TextView.class,TextView.class});
        dataGridView.setDataSource(dataSource);
        dataGridView.setSelectedMode(1);
        dataGridView.setSlidable(true);
        dataGridView.setFlipOverEnable(false, null, getFragmentManager());
        dataGridView.setSortIsEnabled(new int[]{0}, true);
        dataGridView.initDataGridView();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.btn_query:{
//                Toast.makeText(this, "你点击了查询按钮，输入为\"" + mInputPlate.getText().toString() + "\"", Toast.LENGTH_SHORT).show();
                List<TrafficAllowListInfo> record = mTrafficAllowListModule.queryExOpn(mInputPlate.getText().toString().trim());
                if(null != record && record.size() > 0){
                    Toast.makeText(this, R.string.str_query_successful, Toast.LENGTH_SHORT).show();
                    dataSource.clear();
                    System.out.println("record.length = " + record.size());
                    dataSource = record;
                    for(int i = 0; i < dataSource.size(); i ++){
                        System.out.println(dataSource.get(i).toString());
                    }
                    updateList(dataGridView); // 更新所有数据

                    int resid = getResources().getIdentifier("header_sort_icon_item" + 0, "id", dataGridView.getContext().getPackageName());
                    View dgv = findViewById(R.id.datagridview).findViewById(resid);
                    float rotation = dgv.getRotation();
                    if (rotation == 180.0F) {
                        LingberUtil.objectSort(dataGridView.getPageDatas(), "nRecordNo", "desc");
                    } else {
                        LingberUtil.objectSort(dataGridView.getPageDatas(), "nRecordNo", "asce");
                    }
                } else {
                    Toast.makeText(this, R.string.str_query_failed, Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.btn_delete:{
//                Toast.makeText(this, "你点击了查询按钮，输入为\"" + mInputPlate.getText().toString() + "\"", Toast.LENGTH_SHORT).show();
                selectedData = dataGridView.getSelectedRowsData();

                if(null != selectedData && selectedData.size() > 0){

                    if(mTrafficAllowListModule.deleteOpn(Integer.parseInt(selectedData.get(0).getnRecordNo()))){
                        Toast.makeText(this, R.string.str_delete_successful, Toast.LENGTH_SHORT).show();
                        //刷新数据
                        dataSource.clear();
                        dataSource = mTrafficAllowListModule.queryExOpn(mInputPlate.getText().toString().trim());
//                    for(int i = 0; i < dataSource.size(); i ++){
//                        System.out.println(dataSource.get(i).toString());
//                    }

                        updateList(dataGridView); // 更新所有数据
                    } else {
                        Toast.makeText(this, R.string.str_delete_failed + " " + ToolKits.getLastError(), Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(this, R.string.str_item_unselect, Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.btn_clear: {
//                Toast.makeText(this, "你点击了查询按钮，输入为\"" + mInputPlate.getText().toString() + "\"", Toast.LENGTH_SHORT).show();
                if (mTrafficAllowListModule.clearOpn()){
                    Toast.makeText(this, R.string.str_clear_successful, Toast.LENGTH_SHORT).show();
                    //刷新数据
                    dataSource.clear();
                    dataSource = mTrafficAllowListModule.queryExOpn(mInputPlate.getText().toString().trim());
                    updateList(dataGridView); // 更新所有数据
                } else {
                    Toast.makeText(this, R.string.str_clear_failed + " " + ToolKits.getLastError(), Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.btn_update: {
                selectedData = dataGridView.getSelectedRowsData();

                if(null != selectedData && selectedData.size() > 0){
                    String tempCarNum = selectedData.get(0).getSzPlateNumber();
                    String tempOwner = selectedData.get(0).getSzMasterOfCar();
                    String tempStart = selectedData.get(0).getStBeginTime();
                    String tempEnd = selectedData.get(0).getStCancelTime();
                    boolean tempAuth = false;
                    if(selectedData.get(0).getbAuthorityEnable().equals(String.valueOf(true))){
                        tempAuth = true;
                    }
                    TrafficAllowListInputDialog trafficAllowListInputDialog = new TrafficAllowListInputDialog(this, tempCarNum, tempOwner, tempStart, tempEnd, tempAuth);

                    trafficAllowListInputDialog.setOnTrafficAllowListInputDialogListener(new TrafficAllowListInputDialog.OnTrafficAllowListInputDialogListener() {
                        @Override
                        public void getIntentData(TrafficAllowListInfo data) {
                            //todo 车牌车主字符相关校验
                            if(!ToolKits.checkStrByteLength(data.getSzPlateNumber(),1,31)){
                                Toast.makeText(context, R.string.str_plate_num_length_err, Toast.LENGTH_SHORT).show();
                                return;
                            }
                            if(ToolKits.hasSpecialChar(data.getSzPlateNumber())){
                                Toast.makeText(context,  R.string.str_plate_num_special_char, Toast.LENGTH_SHORT).show();
                                return;
                            }
                            if(!ToolKits.checkStrByteLength(data.getSzMasterOfCar(),0,15)){
                                Toast.makeText(context,  R.string.str_car_owner_length_err, Toast.LENGTH_SHORT).show();
                                return;
                            }
                            tempData = new NET_TRAFFIC_LIST_RECORD();
                            tempData.nRecordNo = Integer.parseInt(selectedData.get(0).getnRecordNo());
                            System.arraycopy(data.getSzPlateNumber().getBytes(), 0, tempData.szPlateNumber, 0, data.getSzPlateNumber().getBytes().length);
                            System.arraycopy(data.getSzMasterOfCar().getBytes(), 0, tempData.szMasterOfCar, 0, data.getSzMasterOfCar().getBytes().length);
                            tempData.stBeginTime.parseTime2Min(data.getStBeginTime());
                            tempData.stCancelTime.parseTime2Min(data.getStCancelTime());
                            //todo 时间校验
                            if(!tempData.stCancelTime.biggerThan(tempData.stBeginTime)){
                                Toast.makeText(context, R.string.str_start_time_bigger, Toast.LENGTH_SHORT).show();
                                return;
                            }
                            if(data.getbAuthorityEnable().equals(String.valueOf(true))){
                                tempData.stAuthrityTypes[0].bAuthorityEnable = true;
                                tempData.nAuthrityNum = 1;
                                tempData.stAuthrityTypes[0].emAuthorityType = 1;
                            }
                            if(mTrafficAllowListModule.modifyOpn(tempData)){
                                Toast.makeText(context, R.string.str_update_successful, Toast.LENGTH_SHORT).show();
                                //刷新数据
                                dataSource.clear();
                                dataSource = mTrafficAllowListModule.queryExOpn(mInputPlate.getText().toString().trim());

                                updateList(dataGridView); // 更新所有数据
                            } else {
                                Toast.makeText(context, R.string.str_update_failed + " " + ToolKits.getLastError(), Toast.LENGTH_SHORT).show();
                            }

                            trafficAllowListInputDialog.dismiss();
                        }
                    });
//                    trafficAllowListInputDialog
                    trafficAllowListInputDialog.show();
//                    trafficAllowListInputDialog.setCarNumUnEdit();


                } else {
                    Toast.makeText(this, R.string.str_item_unselect, Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.btn_create: {
                TrafficAllowListInputDialog trafficAllowListInputDialog = new TrafficAllowListInputDialog(this);
                trafficAllowListInputDialog.setOnTrafficAllowListInputDialogListener(new TrafficAllowListInputDialog.OnTrafficAllowListInputDialogListener() {
                    @Override
                    public void getIntentData(TrafficAllowListInfo data) {
                        tempData = new NET_TRAFFIC_LIST_RECORD();
                        //todo 车牌车主字符相关校验
                        if(!ToolKits.checkStrByteLength(data.getSzPlateNumber(),1,31)){
                            Toast.makeText(context, R.string.str_plate_num_length_err, Toast.LENGTH_SHORT).show();
                            return;
                        }
                        if(ToolKits.hasSpecialChar(data.getSzPlateNumber())){
                            Toast.makeText(context,  R.string.str_plate_num_special_char, Toast.LENGTH_SHORT).show();
                            return;
                        }
                        if(!ToolKits.checkStrByteLength(data.getSzMasterOfCar(),0,15)){
                            Toast.makeText(context,  R.string.str_car_owner_length_err, Toast.LENGTH_SHORT).show();
                            return;
                        }

                        System.arraycopy(data.getSzPlateNumber().getBytes(), 0, tempData.szPlateNumber, 0, data.getSzPlateNumber().getBytes().length);
                        System.arraycopy(data.getSzMasterOfCar().getBytes(), 0, tempData.szMasterOfCar, 0, data.getSzMasterOfCar().getBytes().length);


                        tempData.stBeginTime.parseTime2Min(data.getStBeginTime());
                        tempData.stCancelTime.parseTime2Min(data.getStCancelTime());
                        //todo 时间校验
                        if(!tempData.stCancelTime.biggerThan(tempData.stBeginTime)){
                            Toast.makeText(context, R.string.str_start_time_bigger, Toast.LENGTH_SHORT).show();
                            return;
                        }
                        if(data.getbAuthorityEnable().equals(String.valueOf(true))){
                            tempData.stAuthrityTypes[0].bAuthorityEnable = true;
                            tempData.nAuthrityNum = 1;
                            tempData.stAuthrityTypes[0].emAuthorityType = 1;
                        }
                        if(mTrafficAllowListModule.createOpn(tempData)){
                            Toast.makeText(context, R.string.str_create_successful, Toast.LENGTH_SHORT).show();
                            //刷新数据
                            dataSource.clear();
                            dataSource = mTrafficAllowListModule.queryExOpn(mInputPlate.getText().toString().trim());

                            updateList(dataGridView); // 更新所有数据
                        } else {
                            Toast.makeText(context, R.string.str_create_failed + " " + ToolKits.getLastError(), Toast.LENGTH_SHORT).show();
                        }

                        trafficAllowListInputDialog.dismiss();
                    }
                });
                trafficAllowListInputDialog.show();
                break;
            }
            default:
                break;
        }
    }

    private void updateList(DataGridView dataGridView){
        dataGridView.setDataSource(dataSource);
        dataGridView.updateAll(); // 更新所有数据

        int resid = getResources().getIdentifier("header_sort_icon_item" + 0, "id", dataGridView.getContext().getPackageName());
        View dgv = findViewById(R.id.datagridview).findViewById(resid);
        float rotation = dgv.getRotation();
        if (rotation == 180.0F) {
            LingberUtil.objectSort(dataGridView.getPageDatas(), "nRecordNo", "desc");
        } else {
            LingberUtil.objectSort(dataGridView.getPageDatas(), "nRecordNo", "asce");
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}

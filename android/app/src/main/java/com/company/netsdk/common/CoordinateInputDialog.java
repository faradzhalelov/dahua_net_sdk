package com.company.netsdk.common;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.company.NetSDK.NET_POINT;
import com.company.netsdk.R;

public class CoordinateInputDialog extends Dialog implements DialogInterface.OnClickListener{
    private Button confirmBtn;
    private EditText xCoordinateEt1;
    private EditText yCoordinateEt1;
    private EditText xCoordinateEt2;
    private EditText yCoordinateEt2;
    private EditText xCoordinateEt3;
    private EditText yCoordinateEt3;
    private EditText xCoordinateEt4;
    private EditText yCoordinateEt4;

    Resources res;
    private Context context;
    private View view;
    private NET_POINT[] tempData;
    private OnCoordinateInputDialogListener onCoordinateInputDialogListener;

    public CoordinateInputDialog(@NonNull Context context) {
        super(context, R.style.NormalDialogStyle);
        this.context = context;
        this.res = context.getResources();
        this.getWindow().setBackgroundDrawableResource(R.drawable.dialog_shape);
    }

    public void setOnCoordinateInputDialogListener(OnCoordinateInputDialogListener onCoordinateInputDialogListener) {
        this.onCoordinateInputDialogListener = onCoordinateInputDialogListener;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coordinate_input_dialog);
        //按空白处不能取消动画
        setCanceledOnTouchOutside(true);
        //初始化界面控件
        initView();
        //初始化界面数据
        initData();
        //初始化界面控件的事件
        initEvent();
    }
    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        onCoordinateInputDialogListener.getIntentData(tempData);
    }

    private void initView() {
        xCoordinateEt1 = (EditText) findViewById(R.id.et_x_coordinate_1);
        yCoordinateEt1 = (EditText) findViewById(R.id.et_y_coordinate_1);
        xCoordinateEt2 = (EditText) findViewById(R.id.et_x_coordinate_2);
        yCoordinateEt2 = (EditText) findViewById(R.id.et_y_coordinate_2);
        xCoordinateEt3 = (EditText) findViewById(R.id.et_x_coordinate_3);
        yCoordinateEt3 = (EditText) findViewById(R.id.et_y_coordinate_3);
        xCoordinateEt4 = (EditText) findViewById(R.id.et_x_coordinate_4);
        yCoordinateEt4 = (EditText) findViewById(R.id.et_y_coordinate_4);
        confirmBtn = (Button) findViewById(R.id.confirm_btn);
        ToolKits.limitEditTextNumberRange(xCoordinateEt1,0,8191);
        ToolKits.limitEditTextNumberRange(yCoordinateEt1,0,8191);
        ToolKits.limitEditTextNumberRange(xCoordinateEt2,0,8191);
        ToolKits.limitEditTextNumberRange(yCoordinateEt2,0,8191);
        ToolKits.limitEditTextNumberRange(xCoordinateEt3,0,8191);
        ToolKits.limitEditTextNumberRange(yCoordinateEt3,0,8191);
        ToolKits.limitEditTextNumberRange(xCoordinateEt4,0,8191);
        ToolKits.limitEditTextNumberRange(yCoordinateEt4,0,8191);
        view = findViewById(R.id.coordinate_input_dialog);
    }
    /**
     * 初始化界面控件的显示数据
     */
    private void initData() {
        //null
    }
    /**
     * 初始化界面的确定监听器
     */
    private void initEvent() {
        //设置确定按钮被点击后，向外界提供监听
        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempData = new NET_POINT[4];
                for(int i = 0; i < 4; i ++){
                    tempData[i] = new NET_POINT();
                }
                if(!xCoordinateEt1.getText().toString().equals("") && !yCoordinateEt1.getText().toString().equals("") &&
                   !xCoordinateEt2.getText().toString().equals("") && !yCoordinateEt2.getText().toString().equals("") &&
                   !xCoordinateEt3.getText().toString().equals("") && !yCoordinateEt3.getText().toString().equals("") &&
                   !xCoordinateEt4.getText().toString().equals("") && !yCoordinateEt4.getText().toString().equals(""))
                {
                    tempData[0].nx = Integer.parseInt(xCoordinateEt1.getText().toString());
                    tempData[0].ny = Integer.parseInt(yCoordinateEt1.getText().toString());
                    tempData[1].nx = Integer.parseInt(xCoordinateEt2.getText().toString());
                    tempData[1].ny = Integer.parseInt(yCoordinateEt2.getText().toString());
                    tempData[2].nx = Integer.parseInt(xCoordinateEt3.getText().toString());
                    tempData[2].ny = Integer.parseInt(yCoordinateEt3.getText().toString());
                    tempData[3].nx = Integer.parseInt(xCoordinateEt4.getText().toString());
                    tempData[3].ny = Integer.parseInt(yCoordinateEt4.getText().toString());
                    onCoordinateInputDialogListener.getIntentData(tempData);
                } else {
                    Toast.makeText(context, res.getString(R.string.input_error_hint), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


    public interface OnCoordinateInputDialogListener {
        void getIntentData(NET_POINT[] data); //接口中的方法，传入一个整型
    }

}

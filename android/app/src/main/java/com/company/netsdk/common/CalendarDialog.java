package com.company.netsdk.common;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.company.netsdk.R;

import java.util.Calendar;

public class CalendarDialog extends Dialog implements DialogInterface.OnClickListener {

    private int year;

    private int month;

    private int day;

    private int hour;

    private int minute;

    private Button calendarCommit;

    private DatePicker datePicker;

    private TimePicker timePicker;
    private Context context;
    private View view;
    private CalendarDialog.OnCalendarDialogListener onCalendarDialogListener;


    public CalendarDialog(@NonNull Context context, int year, int month, int day, int hour, int minute) {
        super(context, R.style.NormalDialogStyle);
        this.context = context;
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.getWindow().setBackgroundDrawableResource(R.drawable.dialog_shape);
        this.onCalendarDialogListener = onCalendarDialogListener;
    }

    public void setOnCalendarDialogListener(CalendarDialog.OnCalendarDialogListener onCalendarDialogListener) {
        this.onCalendarDialogListener = onCalendarDialogListener;
    }

    public CalendarDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        this.context = context;
    }

    protected CalendarDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        this.context = context;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_dialog);
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
        view = findViewById(R.id.traffic_allow_list_input_dialog);
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        calendarCommit = (Button) findViewById(R.id.calendarCommit);
        timePicker = (TimePicker) findViewById(R.id.timePicker);
    }
    /**
     * 初始化界面控件的显示数据
     */
    private void initData() {
        //数据初始化
        datePicker.updateDate(year,month,day);
        timePicker.setHour(hour);
        timePicker.setMinute(minute);
        //获取当前日期/时间
//        Calendar calendar = Calendar.getInstance();
//        if(year == 0) year = calendar.get(Calendar.YEAR);
//        if(month == 0) month = calendar.get(Calendar.MONTH);
//        if(day == 0) day = calendar.get(Calendar.DAY_OF_MONTH);
//        if(hour == 0) hour = calendar.get(Calendar.HOUR_OF_DAY);
//        if(minute == 0) minute = calendar.get(Calendar.MINUTE);
    }
    /**
     * 初始化界面的确定监听器
     */
    private void initEvent() {
        //设置确定按钮被点击后，向外界提供监听
        //为DatePicker添加监听事件
        datePicker.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                CalendarDialog.this.year = year;
                CalendarDialog.this.month =monthOfYear ;
                CalendarDialog.this.day = dayOfMonth;
            }
        });
        timePicker.setIs24HourView(true);
        //TimePicker选择监听器
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                CalendarDialog.this.hour = hourOfDay;
                CalendarDialog.this.minute = minute;
            }
        });
        //设置确定按钮被点击后，向外界提供监听
        calendarCommit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCalendarDialogListener.getIntentData(year,month,day,hour,minute);
            }
        });

    }




    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        onCalendarDialogListener.getIntentData(year,month,day,hour,minute);
    }


    public interface OnCalendarDialogListener {
        void getIntentData(int year, int month, int day, int hour, int minute); //接口中的方法，传入一个整型
    }
}

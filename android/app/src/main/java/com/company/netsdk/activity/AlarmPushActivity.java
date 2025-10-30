package com.company.netsdk.activity;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.company.netsdk.R;
import com.company.netsdk.common.ClearEditText;
import com.company.netsdk.common.DialogProgress;
import com.company.netsdk.common.PushHelper;
import com.company.netsdk.common.ToolKits;
import com.company.netsdk.module.AlarmPushModule;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

public class AlarmPushActivity extends AppCompatActivity {
    private static final String TAG = "AlarmPushActivity";
    private boolean isPush = false;
    private SharedPreferences mSharedPrefs;
    private AlarmPushModule mAlarmPushModule;
    private Button btnSubAlarm;
    private Button btnUnSubAlarm;
    private DialogProgress mDialogProgress;
    private ClearEditText mDevicanameEditText;
    private String mDevicename;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_push);
        setTitle(R.string.activity_function_list_alarm_push);
        mAlarmPushModule = new AlarmPushModule(this);
        // 添加返回键
        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setHomeButtonEnabled(false);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        setupView();

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    private void setupView() {
        mDialogProgress = new DialogProgress(this);
        mDevicanameEditText = (ClearEditText)findViewById(R.id.editTextDeviceName);
        btnSubAlarm = (Button)findViewById(R.id.buttonSubAlarm);
        btnUnSubAlarm = (Button)findViewById(R.id.buttonUnSubAlarm);

        btnSubAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPush = true;
                mDevicename = mDevicanameEditText.getText().toString();
                new AlarmPushTask().execute();
            }
        });

        btnUnSubAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPush = false;
                new AlarmPushTask().execute();
            }
        });
    }

    private class AlarmPushTask extends AsyncTask<String, Integer, Boolean> {
        @Override
        protected void onPreExecute(){
            super.onPreExecute();
            mDialogProgress.setMessage(getString(R.string.waiting));
            mDialogProgress.setSpinnerType(DialogProgress.FADED_ROUND_SPINNER);
            mDialogProgress.setCancelable(false);
            mDialogProgress.show();
        }
        @Override
        protected Boolean doInBackground(String... params) {
            if (isPush) {
                return mAlarmPushModule.subscribe(mDevicename);
            }else {
                return mAlarmPushModule.unsubscribe();
            }
        }

        @Override
        protected void onPostExecute(Boolean result){
            mDialogProgress.dismiss();
            ToolKits.showMessage(AlarmPushActivity.this, getString(mAlarmPushModule.getResId()));
        }
    }
}

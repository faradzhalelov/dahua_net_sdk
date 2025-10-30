package com.company.netsdk.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.company.NetSDK.CB_fAnalyzerDataCallBack;
import com.company.NetSDK.DEV_EVENT_ACCESS_CTL_INFO;
import com.company.NetSDK.DEV_EVENT_ALARM_INFO;
import com.company.NetSDK.DEV_EVENT_CITIZEN_PICTURE_COMPARE_INFO;
import com.company.NetSDK.DEV_EVENT_CROSSREGION_INFO;
import com.company.NetSDK.DEV_EVENT_FACEDETECT_INFO;
import com.company.NetSDK.DEV_EVENT_FACERECOGNITION_INFO;
import com.company.NetSDK.DEV_EVENT_FLOATINGOBJECT_DETECTION_INFO;
import com.company.NetSDK.DEV_EVENT_TRAFFICJUNCTION_INFO;
import com.company.NetSDK.DEV_EVENT_TRAFFIC_MANUALSNAP_INFO;
//import com.company.NetSDK.DEV_EVENT_TRAFFIC_NONMOTOR_OVERLOAD_INFO;
import com.company.NetSDK.DEV_EVENT_TRAFFIC_NONMOTOR_OVERLOAD_INFO;
import com.company.NetSDK.DEV_EVENT_TRAFFIC_NONMOTOR_RUN_REDLIGHT_INFO;
import com.company.NetSDK.DEV_EVENT_TRAFFIC_NONMOTOR_WITHOUTSAFEHAT_INFO;
//import com.company.NetSDK.DEV_EVENT_TRAFFIC_NON_MOTOR_RETROGRADE_INFO;
import com.company.NetSDK.DEV_EVENT_TRAFFIC_NON_MOTOR_RETROGRADE_INFO;
import com.company.NetSDK.DEV_EVENT_TRAFFIC_PEDESTRAINRUNREDLIGHT_INFO;
import com.company.NetSDK.DEV_EVENT_WATER_LEVEL_DETECTION_INFO;
import com.company.NetSDK.FinalVar;
import com.company.netsdk.R;
import com.company.netsdk.common.ToolKits;
import com.company.netsdk.module.RealLoadPictureModule;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class RealLoadPictureActivity extends AppCompatActivity implements View.OnClickListener {
    private final String TAG = "RealLoadPictureActivity";
    TextView mEventInfo;
    ImageView mEventPicture;
    Spinner mSelectChannel;
    RealLoadPictureModule mRealLoadPictureModule;
    CB_fAnalyzerDataCallBack callBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_load_picture);
        setTitle(R.string.activity_function_list_real_load_picture);
        mRealLoadPictureModule = new RealLoadPictureModule(this);
        callBack = new fAnalyzerDataCallBack();
        setupView();
    }

    private void setupView(){
        ((Button) findViewById(R.id.subscribeBtn)).setOnClickListener(this);
        mEventInfo = (TextView) findViewById(R.id.event_info);
        mEventPicture = (ImageView)findViewById(R.id.event_picture_view);
        mSelectChannel = (Spinner)findViewById(R.id.select_channel);
        initializeSpinner(mSelectChannel,(ArrayList)mRealLoadPictureModule.getChannelList()).setSelection(0);
    }

    int mIndex = 0;
    Handler mHandler = new Handler(Looper.myLooper()){
        @Override
        public void handleMessage(Message msg){
            if (msg.obj !=null){
                switch (msg.what) {
                    case FinalVar.EVENT_IVS_TRAFFICJUNCTION: // 车牌识别
                    {
                        mEventInfo.append((String) msg.obj);
                        break;
                    }
                    case FinalVar.EVENT_IVS_TRAFFIC_MANUALSNAP: // 交通手动抓拍事件
                    {
                        byte[] data = (byte[]) msg.obj;
                        Bitmap bitmap = BitmapFactory.decodeByteArray(data, 0, data.length);
                        if (bitmap != null) {
                            Bitmap newBmp = zoomBitmap(bitmap, mEventPicture.getWidth(), mEventPicture.getHeight());
                            mEventPicture.setImageBitmap(newBmp);
                        }
//                        savePicture(data, data.length, "TrafficManualSnap");
                        break;
                    }
                    case FinalVar.EVENT_IVS_FACEDETECT: // 人脸检测
                    {
                        byte[] data = (byte[]) msg.obj;
                        Bitmap bitmap = BitmapFactory.decodeByteArray(data, 0, data.length);
                        if (bitmap != null) {
                            Bitmap newBmp = zoomBitmap(bitmap, mEventPicture.getWidth(), mEventPicture.getHeight());
                            mEventPicture.setImageBitmap(newBmp);
                        }
                        savePicture(data, data.length, "Face_Detect");
                        break;
                    }
                    case FinalVar.EVENT_IVS_CROSSREGIONDETECTION: // 区域入侵
                    {
                        mEventInfo.append((String)msg.obj);
                        break;
                    }
                    case FinalVar.EVENT_IVS_FLOATINGOBJECT_DETECTION: // 漂浮物检测
                    {
                        mEventInfo.append((String)msg.obj);
                        break;
                    }
                    case FinalVar.EVENT_IVS_WATER_LEVEL_DETECTION: // 水位检测
                    {
                        mEventInfo.append((String)msg.obj);
                        break;
                    }
//                    case FinalVar.EVENT_IVS_TRAFFIC_NON_MOTOR_RETROGRADE: // 区域入侵
//                    {
//                        mEventInfo.append((String)msg.obj);
//                        break;
//                    }
//                    case FinalVar.EVENT_IVS_TRAFFIC_NONMOTOR_OVERLOAD:
//                    {
//                        mEventInfo.append((String)msg.obj);
//                        break;
//                    }
                    case FinalVar.EVENT_IVS_TRAFFIC_NONMOTOR_WITHOUTSAFEHAT:
                    {
                        mEventInfo.append((String)msg.obj);
                        break;
                    }
                    case FinalVar.EVENT_IVS_TRAFFIC_NONMOTOR_RUN_REDLIGHT:
                    {
                        mEventInfo.append((String)msg.obj);
                        break;
                    }
                    case FinalVar.EVENT_IVS_TRAFFIC_PEDESTRAINRUNREDLIGHT:
                    {
                        mEventInfo.append((String)msg.obj);
                        break;
                    }
                    default:
                        break;
                }
            }
        }
    };

    int nGroupId = 0;
    public class fAnalyzerDataCallBack implements CB_fAnalyzerDataCallBack {
        @Override
        public void invoke(long lAnalyzerHandle, int dwAlarmType, Object alarmInfo, byte pBuffer[], int dwBufSize, int nSequence, int reserved) {
            ToolKits.writeLog("Received IVS event ");
            switch (dwAlarmType) {
                case FinalVar.EVENT_IVS_TRAFFICJUNCTION: // 车牌识别
                {
                    ToolKits.writeLog("EVENT_IVS_FACEDETECT");
                    DEV_EVENT_TRAFFICJUNCTION_INFO eventObj = (DEV_EVENT_TRAFFICJUNCTION_INFO) alarmInfo;
                    String eventInfo = eventObj.UTC.toStringTime() + " " + new String(eventObj.stTrafficCar.szPlateNumber) + " Speed:" + eventObj.stTrafficCar.nSpeed;
                    Message msg = mHandler.obtainMessage(dwAlarmType);
                    msg.obj = "[ " + mIndex + " ]" + eventInfo + "\n";
                    mHandler.sendMessage(msg);
                    break;
                }
                case FinalVar.EVENT_IVS_TRAFFIC_MANUALSNAP: // 交通手动抓拍事件
                {
                    ToolKits.writeLog("EVENT_IVS_TRAFFIC_MANUALSNAP");
                    DEV_EVENT_TRAFFIC_MANUALSNAP_INFO eventObj = (DEV_EVENT_TRAFFIC_MANUALSNAP_INFO) alarmInfo;
                    byte []msgBuf = new byte[dwBufSize];
                    System.arraycopy(pBuffer, 0, msgBuf, 0, dwBufSize);
                    Message msg = mHandler.obtainMessage(dwAlarmType);
                    msg.obj = msgBuf;
                    msg.arg1 = nSequence;
                    mHandler.sendMessage(msg);
                    break;
                }
                case FinalVar.EVENT_IVS_FACEDETECT: // 人脸检测 (同一个 group id 第一张为全景图、第二张为人脸图)
                {
                    ToolKits.writeLog("EVENT_IVS_FACEDETECT");
                        DEV_EVENT_FACEDETECT_INFO eventObj = (DEV_EVENT_FACEDETECT_INFO) alarmInfo;
                    if (eventObj.stuObject.nRelativeID != nGroupId) {    // 全景图
                        nGroupId = eventObj.stuObject.nObjectID;
                    } else {     // 人脸图
                        byte []msgBuf = new byte[dwBufSize];
                        System.arraycopy(pBuffer, 0, msgBuf, 0, dwBufSize);
                        Message msg = mHandler.obtainMessage(dwAlarmType);
                        msg.obj = msgBuf;
                        msg.arg1 = nSequence;
                        mHandler.sendMessage(msg);
                    }
                    break;
                }
                case FinalVar.EVENT_IVS_FACERECOGNITION:  ///< 目标识别事件
                {
                    ToolKits.writeLog("EVENT_IVS_FACERECOGNITION");

                    DEV_EVENT_FACERECOGNITION_INFO eventObj = (DEV_EVENT_FACERECOGNITION_INFO) alarmInfo;

                    /////////////// 保存全景图 ///////////////////
                    if(eventObj.bGlobalScenePic) {
                        byte[] globalBuffer = new byte[eventObj.stuGlobalScenePicInfo.dwFileLenth];
                        System.arraycopy(pBuffer, eventObj.stuGlobalScenePicInfo.dwOffSet, globalBuffer, 0, globalBuffer.length);
                        savePicture(globalBuffer, globalBuffer.length, "FaceRecognition_Global");
                    }

                    /////////////// 保存人脸图 /////////////////////////
                    if(eventObj.stuObject.stPicInfo.dwFileLenth > 0) {
                        byte[] personBuffer = new byte[eventObj.stuObject.stPicInfo.dwFileLenth];
                        System.arraycopy(pBuffer, eventObj.stuObject.stPicInfo.dwOffSet, personBuffer, 0, personBuffer.length);
                        savePicture(personBuffer, personBuffer.length, "FaceRecognition_Person");
                    }

                    break;
                }
                case FinalVar.EVENT_IVS_CITIZEN_PICTURE_COMPARE: // 人证比对事件
                {
                    ToolKits.writeLog("人证比对事件");

                    DEV_EVENT_CITIZEN_PICTURE_COMPARE_INFO citizenInfo = (DEV_EVENT_CITIZEN_PICTURE_COMPARE_INFO)alarmInfo;
                    ToolKits.writeLog(citizenInfo.toString());

                    // 拍摄图片
                    String strSavePath = "/mnt/sdcard/NetSDK/";
                    String strFileName = "SnapPic_" + citizenInfo.dbPTS +".jpg";
                    if (ToolKits.createFile(strSavePath, strFileName)) {
                        ToolKits.writeLog("strFileName SnapPic :" + strFileName);
                        FileOutputStream fileStream;
                        try {
                            fileStream = new FileOutputStream(strFileName, true);
                            fileStream.write(pBuffer, citizenInfo.stuImageInfo[0].dwOffSet, citizenInfo.stuImageInfo[0].dwFileLenth);
                            fileStream.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    // 证件照片
                    strFileName = "CitizenPic_" + citizenInfo.dbPTS +".jpg";
                    if (ToolKits.createFile(strSavePath, strFileName)) {
                        ToolKits.writeLog("strFileName CitizenPic :" + strFileName);
                        FileOutputStream fileStream;
                        try {
                            fileStream = new FileOutputStream(strFileName, true);
                            fileStream.write(pBuffer, citizenInfo.stuImageInfo[1].dwOffSet, citizenInfo.stuImageInfo[1].dwFileLenth);
                            fileStream.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                }
                case FinalVar.EVENT_ALARM_MOTIONDETECT:  ///< 视频移动侦测事件
                {
                    DEV_EVENT_ALARM_INFO eventObj = (DEV_EVENT_ALARM_INFO) alarmInfo;
                    ToolKits.writeLog("EVENT_ALARM_MOTIONDETECT " + eventObj.UTC.toStringTime() + " " + eventObj.stuFileInfo.bFileType + " " + eventObj.stuFileInfo.stuFileTime.toStringTime());
                    if (dwBufSize > 0) {
                        savePicture(pBuffer, dwBufSize, "Motion_Detect");
                    }
                    break;
                }
                case FinalVar.EVENT_IVS_ACCESS_CTL:  ///< 门禁事件
                {
                    DEV_EVENT_ACCESS_CTL_INFO eventObj = (DEV_EVENT_ACCESS_CTL_INFO) alarmInfo;
                    ToolKits.writeLog("DEV_EVENT_ACCESS_CTL_INFO UTC:" + eventObj.UTC.toStringTime() + " OpenMethod:" + eventObj.emOpenMethod + " EventType:" + eventObj.emEventType);
                    if (dwBufSize > 0) {
                        savePicture(pBuffer, dwBufSize, "Access_Ctl");
                    }
                    break;
                }
                case FinalVar.EVENT_IVS_CROSSREGIONDETECTION:  ///< 区域入侵事件
                {
                    ToolKits.writeLog("EVENT_IVS_CROSSREGIONDETECTION");
                    DEV_EVENT_CROSSREGION_INFO eventObj = (DEV_EVENT_CROSSREGION_INFO) alarmInfo;
                    String eventInfo ="EVENT_IVS_CROSSREGIONDETECTION : " + eventObj.UTC.toStringTime() + " ChannelID:" + eventObj.nChannelID + " EventID:" + eventObj.nEventID;
                    Message msg = mHandler.obtainMessage(dwAlarmType);
                    msg.obj = "[ " + mIndex + " ]" + eventInfo + "\n";
                    mHandler.sendMessage(msg);
                    break;
                }
                case FinalVar.EVENT_IVS_FLOATINGOBJECT_DETECTION:  ///< 漂浮物检测事件
                {
                    DEV_EVENT_FLOATINGOBJECT_DETECTION_INFO eventObj = (DEV_EVENT_FLOATINGOBJECT_DETECTION_INFO) alarmInfo;
                    String eventInfo ="EVENT_IVS_FLOATINGOBJECT_DETECTION : " +  eventObj.UTC.toStringTime() + " ChannelID:" + eventObj.nChannelID + " EventID:" + eventObj.nEventID;
                    Message msg = mHandler.obtainMessage(dwAlarmType);
                    msg.obj = "[ " + mIndex + " ]" + eventInfo + "\n";
                    mHandler.sendMessage(msg);
                    break;
                }
                case FinalVar.EVENT_IVS_WATER_LEVEL_DETECTION:  ///< 水位检测事件
                {
                    DEV_EVENT_WATER_LEVEL_DETECTION_INFO eventObj = (DEV_EVENT_WATER_LEVEL_DETECTION_INFO) alarmInfo;
                    String eventInfo ="EVENT_IVS_WATER_LEVEL_DETECTION : " +  eventObj.UTC.toStringTime() + " ChannelID:" + eventObj.nChannelID + " EventID:" + eventObj.nEventID;
                    Message msg = mHandler.obtainMessage(dwAlarmType);
                    msg.obj = "[ " + mIndex + " ]" + eventInfo + "\n";
                    mHandler.sendMessage(msg);
                    break;
                }
                case FinalVar.EVENT_IVS_TRAFFIC_NON_MOTOR_RETROGRADE:  ///< 非机动车逆行事件
                {
                    DEV_EVENT_TRAFFIC_NON_MOTOR_RETROGRADE_INFO eventObj = (DEV_EVENT_TRAFFIC_NON_MOTOR_RETROGRADE_INFO) alarmInfo;
                    String eventInfo ="非机动车逆行报警：EVENT_IVS_TRAFFIC_NON_MOTOR_RETROGRADE UTC:" + eventObj.UTC.toStringTime() + " Event ID:" + eventObj.nEventID;
                    Message msg = mHandler.obtainMessage(dwAlarmType);
                    msg.obj = "[ " + mIndex + " ]" + eventInfo + "\n";
                    mHandler.sendMessage(msg);
                    /////////////// 非机动车信息 ///////////////////
                    for(int i = 0; i < eventObj.stuNonMotor.nNumOfCycling; i ++) {
                        ToolKits.writeLog("Sex:" + eventObj.stuNonMotor.stuRiderList[i].emSex + " Age:" + eventObj.stuNonMotor.stuRiderList[i].nAge);
                        ToolKits.writeLog("HasHat:" + eventObj.stuNonMotor.stuRiderList[i].emHasHat + " Mask:" + eventObj.stuNonMotor.stuRiderList[i].emMask);
                    }

                    /////////////// 保存非机动车截图 /////////////////////////
                    if(eventObj.stuNonMotor.stuImage.uLength > 0) {
                        byte[] personBuffer = new byte[eventObj.stuNonMotor.stuImage.uLength];
                        System.arraycopy(pBuffer, eventObj.stuNonMotor.stuImage.uOffset, personBuffer, 0, personBuffer.length);
                        savePicture(personBuffer, personBuffer.length, "NonMotorRetrograde_MotorPic");
                    }
                    ///////////////// 保存全景图 ///////////////////
                    if(eventObj.stuNonMotor.stuSceneImage.nLength > 0) {
                        byte[] personBuffer = new byte[eventObj.stuNonMotor.stuSceneImage.nLength];
                        System.arraycopy(pBuffer, eventObj.stuNonMotor.stuSceneImage.nOffSet, personBuffer, 0, personBuffer.length);
                        savePicture(personBuffer, personBuffer.length, "NonMotorRetrograde_FullPic");
                    }
                    ///////////////// 保存人脸全景图 ///////////////////
                    if(eventObj.stuNonMotor.stuFaceSceneImage.nLength > 0) {
                        byte[] personBuffer = new byte[eventObj.stuNonMotor.stuFaceSceneImage.nLength];
                        System.arraycopy(pBuffer, eventObj.stuNonMotor.stuFaceSceneImage.nOffSet, personBuffer, 0, personBuffer.length);
                        savePicture(personBuffer, personBuffer.length, "NonMotorRetrograde_FacePic");
                    }
                    break;
                }
                case FinalVar.EVENT_IVS_TRAFFIC_NONMOTOR_OVERLOAD:  ///<非机动车超载事件
                {
                    DEV_EVENT_TRAFFIC_NONMOTOR_OVERLOAD_INFO eventObj = (DEV_EVENT_TRAFFIC_NONMOTOR_OVERLOAD_INFO) alarmInfo;
                    String eventInfo = "非机动车超载报警：EVENT_IVS_TRAFFIC_NONMOTOR_OVERLOAD UTC:" + eventObj.UTC.toStringTime() + " Event ID:" + eventObj.nEventID;
                    Message msg = mHandler.obtainMessage(dwAlarmType);
                    msg.obj = "[ " + mIndex + " ]" + eventInfo + "\n";
                    mHandler.sendMessage(msg);
                    /////////////// 非机动车信息 ///////////////////
                    for(int i = 0; i < eventObj.stuNonMotor.nNumOfCycling; i ++) {
                        ToolKits.writeLog("Sex:" + eventObj.stuNonMotor.stuRiderList[i].emSex + " Age:" + eventObj.stuNonMotor.stuRiderList[i].nAge);
                        ToolKits.writeLog("HasHat:" + eventObj.stuNonMotor.stuRiderList[i].emHasHat + " Mask:" + eventObj.stuNonMotor.stuRiderList[i].emMask);
                    }

                    /////////////// 保存非机动车截图 /////////////////////////
                    if(eventObj.stuNonMotor.stuImage.uLength > 0) {
                        byte[] personBuffer = new byte[eventObj.stuNonMotor.stuImage.uLength];
                        System.arraycopy(pBuffer, eventObj.stuNonMotor.stuImage.uOffset, personBuffer, 0, personBuffer.length);
                        savePicture(personBuffer, personBuffer.length, "NonMotorOverLoad_MotorPic");
                    }
                    ///////////////// 保存全景图 ///////////////////
                    if(eventObj.stuNonMotor.stuSceneImage.nLength > 0) {
                        byte[] personBuffer = new byte[eventObj.stuNonMotor.stuSceneImage.nLength];
                        System.arraycopy(pBuffer, eventObj.stuNonMotor.stuSceneImage.nOffSet, personBuffer, 0, personBuffer.length);
                        savePicture(personBuffer, personBuffer.length, "NonMotorOverLoad_FullPic");
                    }
                    ///////////////// 保存人脸全景图 ///////////////////
                    if(eventObj.stuNonMotor.stuFaceSceneImage.nLength > 0) {
                        byte[] personBuffer = new byte[eventObj.stuNonMotor.stuFaceSceneImage.nLength];
                        System.arraycopy(pBuffer, eventObj.stuNonMotor.stuFaceSceneImage.nOffSet, personBuffer, 0, personBuffer.length);
                        savePicture(personBuffer, personBuffer.length, "NonMotorOverLoad_FacePic");
                    }
                    break;
                }
                case FinalVar.EVENT_IVS_TRAFFIC_NONMOTOR_WITHOUTSAFEHAT:  ///<非机动车未戴头盔事件
                {
                    DEV_EVENT_TRAFFIC_NONMOTOR_WITHOUTSAFEHAT_INFO eventObj = (DEV_EVENT_TRAFFIC_NONMOTOR_WITHOUTSAFEHAT_INFO) alarmInfo;
                    String eventInfo = "非机动车未戴头盔报警：EVENT_IVS_TRAFFIC_NONMOTOR_WITHOUTSAFEHAT UTC:" + eventObj.UTC.toStringTime() + " Event ID:" + eventObj.nEventID;
                    Message msg = mHandler.obtainMessage(dwAlarmType);
                    msg.obj = "[ " + mIndex + " ]" + eventInfo + "\n";
                    mHandler.sendMessage(msg);
                    /////////////// 非机动车信息 ///////////////////
                    for(int i = 0; i < eventObj.stuNonMotor.nNumOfCycling; i ++) {
                        ToolKits.writeLog("Sex:" + eventObj.stuNonMotor.stuRiderList[i].emSex + " Age:" + eventObj.stuNonMotor.stuRiderList[i].nAge);
                        ToolKits.writeLog("HasHat:" + eventObj.stuNonMotor.stuRiderList[i].emHasHat + " Mask:" + eventObj.stuNonMotor.stuRiderList[i].emMask);
                    }

                    /////////////// 保存非机动车截图 /////////////////////////
                    if(eventObj.stuNonMotor.stuImage.uLength > 0) {
                        byte[] personBuffer = new byte[eventObj.stuNonMotor.stuImage.uLength];
                        System.arraycopy(pBuffer, eventObj.stuNonMotor.stuImage.uOffset, personBuffer, 0, personBuffer.length);
                        savePicture(personBuffer, personBuffer.length, "NoSafeHat_MotorPic");
                    }
                    ///////////////// 保存全景图 ///////////////////
                    if(eventObj.stuNonMotor.stuSceneImage.nLength > 0) {
                        byte[] personBuffer = new byte[eventObj.stuNonMotor.stuSceneImage.nLength];
                        System.arraycopy(pBuffer, eventObj.stuNonMotor.stuSceneImage.nOffSet, personBuffer, 0, personBuffer.length);
                        savePicture(personBuffer, personBuffer.length, "NoSafeHat_FullPic");
                    }
                    ///////////////// 保存人脸全景图 ///////////////////
                    if(eventObj.stuNonMotor.stuFaceSceneImage.nLength > 0) {
                        byte[] personBuffer = new byte[eventObj.stuNonMotor.stuFaceSceneImage.nLength];
                        System.arraycopy(pBuffer, eventObj.stuNonMotor.stuFaceSceneImage.nOffSet, personBuffer, 0, personBuffer.length);
                        savePicture(personBuffer, personBuffer.length, "NoSafeHat_FacePic");
                    }
                    break;
                }
                case FinalVar.EVENT_IVS_TRAFFIC_NONMOTOR_RUN_REDLIGHT:  ///<非机动车闯红灯事件
                {
                    DEV_EVENT_TRAFFIC_NONMOTOR_RUN_REDLIGHT_INFO eventObj = (DEV_EVENT_TRAFFIC_NONMOTOR_RUN_REDLIGHT_INFO) alarmInfo;
                    String eventInfo = "非机动车闯红灯报警：EVENT_IVS_TRAFFIC_NONMOTOR_RUN_REDLIGHT UTC:" + eventObj.UTC.toStringTime() + " Event ID:" + eventObj.nEventID;
                    Message msg = mHandler.obtainMessage(dwAlarmType);
                    msg.obj = "[ " + mIndex + " ]" + eventInfo + "\n";
                    mHandler.sendMessage(msg);
                    /////////////// 非机动车信息 ///////////////////
                    for(int i = 0; i < eventObj.stuNonMotor.nNumOfCycling; i ++) {
                        ToolKits.writeLog("Sex:" + eventObj.stuNonMotor.stuRiderList[i].emSex + " Age:" + eventObj.stuNonMotor.stuRiderList[i].nAge);
                        ToolKits.writeLog("HasHat:" + eventObj.stuNonMotor.stuRiderList[i].emHasHat + " Mask:" + eventObj.stuNonMotor.stuRiderList[i].emMask);
                    }

                    /////////////// 保存非机动车截图 /////////////////////////
                    if(eventObj.stuNonMotor.stuImage.uLength > 0) {
                        byte[] personBuffer = new byte[eventObj.stuNonMotor.stuImage.uLength];
                        System.arraycopy(pBuffer, eventObj.stuNonMotor.stuImage.uOffset, personBuffer, 0, personBuffer.length);
                        savePicture(personBuffer, personBuffer.length, "RunRedLight_MotorPic");
                    }
                    ///////////////// 保存全景图 ///////////////////
                    if(eventObj.stuNonMotor.stuSceneImage.nLength > 0) {
                        byte[] personBuffer = new byte[eventObj.stuNonMotor.stuSceneImage.nLength];
                        System.arraycopy(pBuffer, eventObj.stuNonMotor.stuSceneImage.nOffSet, personBuffer, 0, personBuffer.length);
                        savePicture(personBuffer, personBuffer.length, "RunRedLight_FullPic");
                    }
                    ///////////////// 保存人脸全景图 ///////////////////
                    if(eventObj.stuNonMotor.stuFaceSceneImage.nLength > 0) {
                        byte[] personBuffer = new byte[eventObj.stuNonMotor.stuFaceSceneImage.nLength];
                        System.arraycopy(pBuffer, eventObj.stuNonMotor.stuFaceSceneImage.nOffSet, personBuffer, 0, personBuffer.length);
                        savePicture(personBuffer, personBuffer.length, "RunRedLight_FacePic");
                    }
                    break;
                }
                case FinalVar.EVENT_IVS_TRAFFIC_PEDESTRAINRUNREDLIGHT:  /// 行人闯红灯事件
                {
                    DEV_EVENT_TRAFFIC_PEDESTRAINRUNREDLIGHT_INFO eventObj = (DEV_EVENT_TRAFFIC_PEDESTRAINRUNREDLIGHT_INFO) alarmInfo;
                    String eventInfo = "行人闯红灯报警：EVENT_IVS_TRAFFIC_PEDESTRAINRUNREDLIGHT UTC:" + eventObj.UTC.toStringTime() + " Event ID:" + eventObj.nEventID;
                    Message msg = mHandler.obtainMessage(dwAlarmType);
                    msg.obj = "[ " + mIndex + " ]" + eventInfo + "\n";
                    mHandler.sendMessage(msg);
                    /////////////// 行人信息 ///////////////////
                    ToolKits.writeLog("nObjectID:" + eventObj.stuObject.nObjectID + " szObjectType:" + new String(eventObj.stuObject.szObjectType).trim());
                    /////////////// 保存物体截图 /////////////////////////
//                    if (eventObj.stuObject.stPicInfo.dwFileLenth > 0) {
//                        byte[] personBuffer = new byte[eventObj.stuObject.stPicInfo.dwFileLenth];
//                        System.arraycopy(pBuffer, eventObj.stuObject.stPicInfo.dwOffSet, personBuffer, 0, personBuffer.length);
//                        savePicture(personBuffer, personBuffer.length, "RunLight_PersonPic");
//                    }
                    if (dwBufSize > 0) {
                        savePicture(pBuffer, dwBufSize, "RunLight_PersonPic");
                    }
                }
                default:
                    break;
            }
        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.subscribeBtn:
                if (!mRealLoadPictureModule.isRealLoading()) {
                    if (mRealLoadPictureModule.realLoadPicture(mSelectChannel.getSelectedItemPosition(), callBack)) {
                        mSelectChannel.setEnabled(false);
                        ((Button)v).setText(R.string.stop_real_load_picture);
                    }else {
                        Toast.makeText(this, getString(R.string.info_failed), Toast.LENGTH_SHORT).show();
                    }
                }else {
                    mRealLoadPictureModule.stopRealLoadPicture();
                    mSelectChannel.setEnabled(true);
                    ((Button)v).setText(R.string.real_load_picture);
                }
                break;
            default:
                break;
        }
    }

    public Bitmap zoomBitmap(Bitmap bitmap, int w, int h) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();

        float scaleWidth = ((float)w)/width;
        float scaleHeight = ((float)h)/height;
        matrix.postScale(scaleWidth, scaleHeight);

        Bitmap newBmp = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);

        return newBmp;
    }

    // 保存图片
    private void savePicture(byte pBuf[], int RevLen, String tag) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(new Date());
        String strFileName = getExternalFilesDir(null).getAbsolutePath()+"/"+ tag + "-" + time.replace(":","-").replace(" ", "_") + ".jpg";
        ToolKits.writeLog("FileName:"+strFileName);
        if (strFileName.equals(""))
            return;

        FileOutputStream fileStream = null;
        try {
            fileStream = new FileOutputStream(strFileName, true);

            fileStream.write(pBuf, 0, RevLen);
            fileStream.flush();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(null != fileStream) {
                    fileStream.close();
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

    private Spinner initializeSpinner(final Spinner spinner, ArrayList array){
        spinner.setSelection(0,true);
        spinner.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,array));
        return spinner;
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        mRealLoadPictureModule.stopRealLoadPicture();
        mRealLoadPictureModule = null;
    }
}

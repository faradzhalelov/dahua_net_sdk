package com.company.netsdk.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.Surface;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.company.NetSDK.*;
import com.company.PlaySDK.IPlaySDK;
import com.company.PlaySDK.IPlaySDKCallBack;
import com.company.PlaySDK.IPlaySDKCallBack.fRecordErrorCallBack;
import com.company.netsdk.activity.IPLoginActivity;
import com.company.netsdk.activity.NetSDKApplication;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.company.NetSDK.FinalVar.EVENT_IVS_CROSSLINEDETECTION;
import static com.company.NetSDK.NET_EM_RTMP_MANAGER_STREAM_TYPE.NET_EM_RTMP_MANAGER_STREAM_TYPE_MAINCODE_STREAM;
import static java.lang.Thread.sleep;

//import java.io.FileWriter;
//import android.util.Log;


@SuppressLint("UseValueOf")
public class TestInterfaceActivity extends ListActivity {
	public interface ListFunctionInterface {
		public void listFun();
	};
	int parameter = 1;
	private List<ListFunctionInterface> listFunctions = new ArrayList<ListFunctionInterface>();
	private List<String> testList = new ArrayList<String>();
	private long lanalyHandle = 0;
	public static final String DISCONNECTED_BROAST = "disconnected_callback";
	public static final String AUTOCONNECTED_BROAST = "autoconnected_callback";

	private long __LoginHandle = NetSDKApplication.getInstance().getLoginHandle();
	private int  _waittime = 3000;
	private int  groupId = 0;

	private void addFunctionToList(String listItemName, ListFunctionInterface interfaceFunction)
	{
		listFunctions.add(interfaceFunction);
		testList.add(listItemName);
	}

	/////////////////////////////////////////////在这里新增列表项/////////////////////////////////////
	private void generFunctionList()
	{
		addFunctionToList("TestGetAlarmRegionOutputState", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestGetAlarmRegionOutputState();
			}
		});
		addFunctionToList("TestGetAlarmRegionBypassMode", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestGetAlarmRegionBypassMode();
			}
		});
		addFunctionToList("TestGetAlarmRegionAreaZones", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestGetAlarmRegionAreaZones();
			}
		});
		addFunctionToList("FindRecordTrafficRedList", new ListFunctionInterface() {
			public void listFun() {
				FindRecordTrafficRedList();
			}
		});
		addFunctionToList("FindRecordTrafficRedListVague", new ListFunctionInterface() {
			public void listFun() {
				FindRecordTrafficRedListVague();
			}
		});

		addFunctionToList("HDVR_VSPConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				HDVR_VSPConfig();
			}
		});
		addFunctionToList("QueryRecordingDetails", new ListFunctionInterface() {
			@Override
			public void listFun() {
				QueryRecordingDetails();
			}
		});
		addFunctionToList("CfgRecordConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				CfgRecordConfig();
			}
		});
		addFunctionToList("VideoColorConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				VideoColorConfig();
			}
		});
		addFunctionToList("MediaGlobalConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				MediaGlobalConfig();
			}
		});
		addFunctionToList("TestGetVideoInputInfo", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestGetVideoInputInfo();
			}
		});
		addFunctionToList("TestLoadPic1", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestLoadPic1 ();
			}
		});
		addFunctionToList("QueryRecordFileEx", new ListFunctionInterface() {
			@Override
			public void listFun() {
				QueryRecordFileEx();
			}
		});
		addFunctionToList("TestGetWorkModeCaps", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestGetWorkModeCaps();
			}
		});
		addFunctionToList("querySmartEncodeCaps", new ListFunctionInterface() {
			@Override
			public void listFun() {
				querySmartEncodeCaps();
			}
		});
		addFunctionToList("TestInitDevSetLocalityConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestInitDevSetLocalityConfig();
			}
		});
		addFunctionToList("TestOpenStrobe", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestOpenStrobe();
			}
		});
		addFunctionToList("TestCloseStrobe", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestCloseStrobe();
			}
		});
		addFunctionToList("TestSetParkInfo", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestSetParkInfo();
			}
		});
		addFunctionToList("TestSetParkControlInfo", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestSetParkControlInfo();
			}
		});
		addFunctionToList("setFaceServiceState", new ListFunctionInterface() {
			@Override
			public void listFun() {
				setFaceServiceState();
			}
		});
		addFunctionToList("getFaceServiceState", new ListFunctionInterface() {
			@Override
			public void listFun() {
				getFaceServiceState();
			}
		});
		addFunctionToList("RemoveFaceServiceState", new ListFunctionInterface() {
			@Override
			public void listFun() {
				RemoveFaceServiceState();
			}
		});
		addFunctionToList("ClearFaceServiceState", new ListFunctionInterface() {
			@Override
			public void listFun() {
				ClearFaceServiceState();
			}
		});
		addFunctionToList("UpdateFaceServiceState", new ListFunctionInterface() {
			@Override
			public void listFun() {
				UpdateFaceServiceState();
			}
		});
		addFunctionToList("VideoInColorInfoConfig_Normal", new ListFunctionInterface() {
			@Override
			public void listFun() {
				VideoInColorInfoConfig_Normal();
			}
		});
		addFunctionToList("VideoInColorInfoConfig_Day", new ListFunctionInterface() {
			@Override
			public void listFun() {
				VideoInColorInfoConfig_Day();
			}
		});
		addFunctionToList("VideoInColorInfoConfig_Night", new ListFunctionInterface() {
			@Override
			public void listFun() {
				VideoInColorInfoConfig_Night();
			}
		});
		addFunctionToList("TestSomething", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestSomething();
			}
		});
		addFunctionToList("getMaxMemoryInfo", new ListFunctionInterface(){
			@Override
			public void listFun(){
				getMaxMemoryInfo();
			}
		});
		addFunctionToList("TestTransmitInfo", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestTransmitInfo();
			}
		});
		addFunctionToList("TestQueryPTZCaps", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestQueryPTZCaps();
			}
		});
		addFunctionToList("TestSnapPicFromRecord", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestSnapPicFromRecord();
			}
		});
		addFunctionToList("TestSnapPicFromRecord", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestSnapPicFromRecord();
			}
		});
		addFunctionToList("TestSetLocalMode", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestSetLocalMode();
			}
		});
		addFunctionToList("WorkModeConfig", new ListFunctionInterface(){
			@Override
			public void listFun(){
				WorkModeConfig();
			}
		});
		addFunctionToList("TestBatchAppendFaceRecognition", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestBatchAppendFaceRecognition();
			}
		});
		addFunctionToList("TestGetFaceRecognitionAppendToken", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestGetFaceRecognitionAppendToken();
			}
		});
		addFunctionToList("StartListenEx1", new ListFunctionInterface(){
			@Override
			public void listFun(){
				StartListenEx1();
			}
		});
		addFunctionToList("WlanConfig", new ListFunctionInterface(){
			@Override
			public void listFun(){
				WlanConfig();
			}
		});

		addFunctionToList("GetandSetPAASConfig", new ListFunctionInterface(){
			@Override
			public void listFun(){
				GetandSetPAASConfig();
			}
		});

		addFunctionToList("QueryPTZInfo", new ListFunctionInterface(){
			@Override
			public void listFun(){
					QueryPTZInfo();
			}
		});

		addFunctionToList("QueryPTZLocation", new ListFunctionInterface(){
			@Override
			public void listFun(){
				QueryPTZLocation();
			}
		});

		addFunctionToList("AttachPTZStatusProc", new ListFunctionInterface(){
			@Override
			public void listFun(){
				AttachPTZStatusProc();
			}
		});

		addFunctionToList("DetachPTZStatusProc", new ListFunctionInterface(){
			@Override
			public void listFun(){
				DetachPTZStatusProc();
			}
		});

		addFunctionToList("AttachVideoAnalyseTrackProc", new ListFunctionInterface() {
			public void listFun() {
				AttachVideoAnalyseTrackProc();
			}
		});
		addFunctionToList("DetachVideoAnalyseTrackProc", new ListFunctionInterface() {
			public void listFun() {
				DetachVideoAnalyseTrackProc();
			}
		});
		addFunctionToList("PushTestinHEMA", new ListFunctionInterface(){
			@Override
			public void listFun(){
				PushTestinHEMA();
			}
		});
		addFunctionToList("GetSoftwareVersion", new ListFunctionInterface(){
			@Override
			public void listFun(){
				GetSoftwareVersion();
			}
		});
        addFunctionToList("FindFileEx_MotionDetect", new ListFunctionInterface(){
            @Override
            public void listFun(){
				FindFileEx_MotionDetect();
            }
        });
		addFunctionToList("QueryDeviceLog", new ListFunctionInterface(){
			@Override
			public void listFun(){
				QueryDeviceLog();
			}
		});
		addFunctionToList("QueryChannelName", new ListFunctionInterface(){
			@Override
			public void listFun(){
				QueryChannelName();
			}
		});
		addFunctionToList("GetDevWifiListInfo", new ListFunctionInterface(){
			@Override
			public void listFun(){
				GetDevWifiListInfo();
			}
		});
		addFunctionToList("TestLoadPic1", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestLoadPic1();
			}
		});
		addFunctionToList("AddOnvifUser", new ListFunctionInterface(){
			@Override
			public void listFun(){
				AddOnvifUser();
			}
		});
		addFunctionToList("GetMobilePusherNotificationCfg", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetMobilePusherNotificationCfg();
			}
		});
		addFunctionToList("GetMobileSubscribeAllCfg", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetMobileSubscribeAllCfg();
			}
		});
		// 录像下载
		addFunctionToList("DownloadByDataType", new ListFunctionInterface() {
			@Override
			public void listFun() {
				DownloadByDataType();
			}
		});
		addFunctionToList("QueryWlanAccessPoint", new ListFunctionInterface(){
			@Override
			public void listFun(){
				QueryWlanAccessPoint();
			}
		});
		addFunctionToList("ModifyOnvifUserPassword", new ListFunctionInterface(){
			@Override
			public void listFun(){
				ModifyOnvifUserPassword();
			}
		});
		addFunctionToList("GetPushInfosRTMPManager", new ListFunctionInterface(){
			@Override
			public void listFun(){
				GetPushInfosRTMPManager();
			}
		});
		addFunctionToList("TestRecordFlie", new ListFunctionInterface() {
			public void listFun() {
				TestRecordFlie();
			}
		});
		addFunctionToList("SetCoaxialControlIO_Light", new ListFunctionInterface() {
			@Override
			public void listFun() {
				SetCoaxialControlIO_Light();
			}
		});
		addFunctionToList("SetCoaxialControlIO_Speaker", new ListFunctionInterface() {
			@Override
			public void listFun() {
				SetCoaxialControlIO_Speaker();
			}
		});
		addFunctionToList("StartPlayAudio", new ListFunctionInterface() {
			@Override
			public void listFun() {
				StartPlayAudio();
			}
		});
		addFunctionToList("TestDownloadRecordbyIPlaySDK", new ListFunctionInterface() {
			public void listFun() {
				TestDownloadRecordbyIPlaySDK();
//				TestDownloadRecordbyIPlaySDK2();
			}
		});

		addFunctionToList("TestSearchDev", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestSearchDev();
			}
		});
		addFunctionToList("TestRemoveAllRTMP", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestRemoveAllRTMP();
			}
		});
        addFunctionToList("TestManualSnap", new ListFunctionInterface() {
            public void listFun() {
                TestManualSnap();
            }
        });
		addFunctionToList("TestUserOperation", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestUserOperation();
			}
		});
		addFunctionToList("TestUserOperation2", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestUserOperation2();
			}
		});
		addFunctionToList("TestRecordState", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestRecordState();
			}
		});
		addFunctionToList("MatrixGetCameras", new ListFunctionInterface() {
			@Override
			public void listFun() {
				MatrixGetCameras();
			}
		});
		addFunctionToList("RecordDownloadSpeedConfig", new ListFunctionInterface() {
			public void listFun() {
				RecordDownloadSpeedConfig();
			}
		});
		addFunctionToList("PrintStackTraceLog", new ListFunctionInterface() {
            public void listFun() {
                PrintStackTraceLog();
            }
        });
		addFunctionToList("EncodeInfoConfig", new ListFunctionInterface() {
			public void listFun() {
				EncodeInfoConfig();
			}
		});
		addFunctionToList("channelConfig", new ListFunctionInterface() {
			public void listFun() {
				channelConfig();
			}
		});
		addFunctionToList("DetachRTMPManager", new ListFunctionInterface() {
			public void listFun() {
				DetachRTMPManager();
			}
		});
		addFunctionToList("ModifyOnvifUserPassword", new ListFunctionInterface() {
			public void listFun() {
				ModifyOnvifUserPassword();
			}
		});
//		addFunctionToList("RTMPpause", new ListFunctionInterface() {
//			public void listFun() {
//				RTMPpause();
//			}
//		});
//		addFunctionToList("RTMPresume", new ListFunctionInterface() {
//			public void listFun() {
//				RTMPresume();
//			}
//		});
		addFunctionToList("RTMPadd", new ListFunctionInterface() {
			public void listFun() {
				RTMPaddLive();
			}
		});
		addFunctionToList("RTMPremove", new ListFunctionInterface() {
			public void listFun() {
				RTMPremove();
			}
		});
		addFunctionToList("RTMPgetcaps", new ListFunctionInterface() {
			public void listFun() {
				RTMPgetcaps();
			}
		});
		addFunctionToList("RTMPstart", new ListFunctionInterface() {
			public void listFun() {
				RTMPstart();
			}
		});
		addFunctionToList("RTMPstop", new ListFunctionInterface() {
			public void listFun() {
				RTMPstop();
			}
		});
		addFunctionToList("AttachStatusRTMPManagerLive", new ListFunctionInterface() {
			public void listFun() {
				AttachStatusRTMPManagerLive();
			}
		});
		addFunctionToList("AttachStatusRTMPManagerRecord", new ListFunctionInterface() {
			public void listFun() {
				AttachStatusRTMPManagerRecord();
			}
		});
		addFunctionToList("InitDevAccountByPort", new ListFunctionInterface(){
			@Override
			public void listFun(){
				InitDevAccountByPort();
			}
		});
		addFunctionToList("ResetPwdByPort", new ListFunctionInterface(){
			@Override
			public void listFun(){
				ResetPwdByPort();
			}
		});
		addFunctionToList("GetDescriptionForResetPwdByPort", new ListFunctionInterface(){
			@Override
			public void listFun(){
				GetDescriptionForResetPwdByPort();
			}
		});

		addFunctionToList("QueryUserRights", new ListFunctionInterface() {
			@Override
			public void listFun() {
				new Thread(new Runnable() {

					public void run() {
						QueryUserRights();
					}
				}).start();
			}
		});
		addFunctionToList("TestopenLog", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestopenLog();
			}
		});
		addFunctionToList("InsertCardServiceState", new ListFunctionInterface() {
			public void listFun() {
				setCardServiceState();
			}
		});
		addFunctionToList("GetCardServiceState", new ListFunctionInterface() {
			public void listFun() {
				getCardServiceState();
			}
		});
		addFunctionToList("UpdateCardServiceState", new ListFunctionInterface() {
			public void listFun() {
				UpdateCardServiceState();
			}
		});
		addFunctionToList("RemoveCardServiceState", new ListFunctionInterface() {
			public void listFun() {
				RemoveCardServiceState();
			}
		});
		addFunctionToList("ClearCardServiceState", new ListFunctionInterface() {
			public void listFun() {
				ClearCardServiceState();
			}
		});
		addFunctionToList("InsertUserServiceState", new ListFunctionInterface() {
			public void listFun() {
				setUserServiceState();
			}
		});
		addFunctionToList("GetUserServiceState", new ListFunctionInterface() {
			public void listFun() {
				getUserServiceState();
			}
		});
		addFunctionToList("RemoveUserServiceState", new ListFunctionInterface() {
			public void listFun() {
				RemoveUserServiceState();
			}
		});
		addFunctionToList("ClearUserServiceState", new ListFunctionInterface() {
			public void listFun() {
				ClearUserServiceState();
			}
		});
		addFunctionToList("QueryRecordFile", new ListFunctionInterface() {
			public void listFun() {
				QueryRecordFile();
			}
		});

		addFunctionToList("Realplay", new ListFunctionInterface() {
			@Override
			public void listFun() {
				RealPlayByDataType();
			}
		});

        addFunctionToList("DoorBellConfig", new ListFunctionInterface(){
                @Override
                public void listFun(){
                    DoorBellConfig();
                }
            });
        addFunctionToList("QueryUserRights", new ListFunctionInterface(){
			@Override
			public void listFun(){
                QueryUserRights();
			}
		});

		addFunctionToList("MobileSubscribeDelete", new ListFunctionInterface(){
			@Override
			public void listFun(){
				MobileSubscribeDelete();
			}
		});

		addFunctionToList("TestQueryDevState1", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestQueryDevState1();
			}
		});
		addFunctionToList("speakerConfig", new ListFunctionInterface(){
			@Override
			public void listFun(){
				speakerConfig();
			}
		});

		addFunctionToList("RealLoadPicEx", new ListFunctionInterface(){
			@Override
			public void listFun(){
				RealLoadPicEx();
			}
		});
        addFunctionToList("OrganizationNode", new ListFunctionInterface() {
            @Override
            public void listFun() {
                OrganizationNode();
            }
        });
        addFunctionToList("ElectricLens", new ListFunctionInterface() {
            @Override
            public void listFun() {
                ElectricLens();
            }
        });
        addFunctionToList("CaiNaioNetwork", new ListFunctionInterface() {
			@Override
			public void listFun() {
				CaiNaioNetwork();
			}
		});
        addFunctionToList("LinkageConfig", new ListFunctionInterface() {
            @Override
            public void listFun() {
                LinkageConfig();
            }
        });
        addFunctionToList("ScadaOperate", new ListFunctionInterface() {
			@Override
			public void listFun() {
				ScadaOperate();
			}
		});
		addFunctionToList("BuildingConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				BuildingConfig();
			}
		});
		addFunctionToList("VideoTalkPhoneGeneralConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				VideoTalkPhoneGeneralConfig();
			}
		});
		addFunctionToList("AccessCtlPwdOperate", new ListFunctionInterface() {
			@Override
			public void listFun() {
				AccessCtlPwdOperate();
			}
		});
        addFunctionToList("AttachVideoStatSummary", new ListFunctionInterface() {
            @Override
            public void listFun() {
                AttachVideoStatSummary();
            }
        });


		addFunctionToList("QrcodeOpenDoor", new ListFunctionInterface() {
			@Override
			public void listFun() {
				QrcodeOpenDoor();
			}
		});
		addFunctionToList("FaceRecognition", new ListFunctionInterface() {
			@Override
			public void listFun() {
				FaceRecognition();
			}
		});
		addFunctionToList("开启雨刷", new ListFunctionInterface() {
			@Override
			public void listFun() {
				PTZControl.ptzControlLamp(NetSDKApplication.getInstance().getLoginHandle(), 0, (byte)1);
			}
		});
		addFunctionToList("关闭雨刷", new ListFunctionInterface() {
			@Override
			public void listFun() {
				PTZControl.ptzControlLamp(NetSDKApplication.getInstance().getLoginHandle(), 0, (byte)0);
			}
		});
		addFunctionToList("TransmitInfoForWeb", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TransmitInfoForWeb();
			}
		});
		addFunctionToList("VTOConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				VTOConfig();
			}
		});
		addFunctionToList("GetCoaxialControlIOStatus", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetCoaxialControlIOStatus();
			}
		});
		addFunctionToList("GetRemoteLowRateWPANCaps", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetRemoteLowRateWPANCaps();
			}
		});
		addFunctionToList("GetCoaxialSensorInfo", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetCoaxialSensorInfo();
			}
		});
		addFunctionToList("BackLightConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				BackLightConfig();
			}
		});
		addFunctionToList("QueryLowRateWpan", new ListFunctionInterface() {
			@Override
			public void listFun() {
				QueryLowRateWpan();
			}
		});
		addFunctionToList("QueryProductDifinition", new ListFunctionInterface() {
			@Override
			public void listFun() {
				QueryProductDifinition();
			}
		});
		addFunctionToList("GetDevWlanList", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetDevWlanList();
			}
		});
		addFunctionToList("XVROperate", new ListFunctionInterface() {
			@Override
			public void listFun() {
				XVROperate();
			}
		});
		addFunctionToList("NASFunction", new ListFunctionInterface() {
			@Override
			public void listFun() {
				NASFunction();
			}
		});
        addFunctionToList("QueryIvsEventInfo", new ListFunctionInterface() {
            @Override
            public void listFun() {
                QueryIvsEventInfo();
            }
        });
        addFunctionToList("CrosslineRuleConfig", new ListFunctionInterface() {
            @Override
            public void listFun() {
                CrosslineRuleConfig();
            }
        });
		addFunctionToList("LocalExtAalarmConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				LocalExtAalarmConfig();
			}
		});
		addFunctionToList("PictureTitleConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				PictureTitleConfig();
			}
		});
        addFunctionToList("QueryNetInterface", new ListFunctionInterface() {
            @Override
            public void listFun() {
				QueryNetInterface();
            }
        });
		addFunctionToList("StoragePointConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				StoragePointConfig();
			}
		});
		addFunctionToList("ControlRecord", new ListFunctionInterface(){
			@Override
			public void listFun(){
				ControlRecord();
			}
		});
		addFunctionToList("QueryActiveAllUserInfo", new ListFunctionInterface(){
			@Override
			public void listFun(){
				QueryActiveAllUserInfo();
			}
		});
        addFunctionToList("TestDMSS", new ListFunctionInterface(){
            @Override
            public void listFun(){
                TestDMSS();
            }
        });
		addFunctionToList("queryRecordStatus", new ListFunctionInterface(){
			@Override
			public void listFun(){
				queryRecordStatus();
			}
		});
		addFunctionToList("TestAlarmRegion", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestAlarmRegion();
			}
		});

		addFunctionToList("CustomTitleConfig", new ListFunctionInterface(){
			@Override
			public void listFun(){
				CustomTitleConfig();
			}
		});
		addFunctionToList("getRemoteDevice", new ListFunctionInterface(){
			@Override
			public void listFun(){
				getRemoteDevice();
			}
		});


		addFunctionToList("AudioAndVideoEncrypt", new ListFunctionInterface() {
			@Override
			public void listFun() {
				AudioAndVideoEncrypt();
			}
		});
		addFunctionToList("LetrackRuleConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				LetrackRuleConfig();
			}
		});
		addFunctionToList("CoaxialLightConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				CoaxialLightConfig();
			}
		});
		addFunctionToList("PirAlarmParaConfigm", new ListFunctionInterface() {
			@Override
			public void listFun() {
				PirAlarmParaConfigm();
			}
		});
		addFunctionToList("LightGlobalConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				LightGlobalConfig();
			}
		});
		addFunctionToList("VideoInExposureInfoConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				VideoInExposureInfoConfig();
			}
		});
		addFunctionToList("NASConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				NASConfig();
			}
		});
		addFunctionToList("QueryHDDState", new ListFunctionInterface() {
			@Override
			public void listFun() {
				QueryHDDState();
			}
		});
		addFunctionToList("QueryVideoAnalyseInfo", new ListFunctionInterface() {
			@Override
			public void listFun() {
				QueryVideoAnalyseInfo();
			}
		});

		addFunctionToList("GetUserManageCaps", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetUserManageCaps();
			}
		});
		addFunctionToList("GetWireLessDevSignal", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetWireLessDevSignal();
			}
		});
		addFunctionToList("SetCoaxialControlIO", new ListFunctionInterface() {
			@Override
			public void listFun() {
				SetCoaxialControlIO();
			}
		});
		addFunctionToList("GetCoaxialControlIOCaps", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetCoaxialControlIOCaps();
			}
		});
		addFunctionToList("ChannelNameNewConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				ChannelNameNewConfig();
			}
		});
		addFunctionToList("ChannelNameOldConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				ChannelNameOldConfig();
			}
		});
		addFunctionToList("TimeTitleConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TimeTitleConfig();
			}
		});
		addFunctionToList("ChannelTitleConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				ChannelTitleConfig();
			}
		});
		addFunctionToList("ControlAlarmOut", new ListFunctionInterface() {
			@Override
			public void listFun() {
				ControlAlarmOut();
			}
		});
		addFunctionToList("ExAlarmBoxInfoConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				ExAlarmBoxInfoConfig();
			}
		});
		addFunctionToList("QueryExAlarmBoxCaps", new ListFunctionInterface() {
			@Override
			public void listFun() {
				QueryExAlarmBoxCaps();
			}
		});
		addFunctionToList("QueryExAlarmChannels", new ListFunctionInterface() {
			@Override
			public void listFun() {
				QueryExAlarmChannels();
			}
		});
		addFunctionToList("GetAlarmOutState", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetAlarmOutState();
			}
		});
		addFunctionToList("AlarmOutConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				AlarmOutConfig();
			}
		});
		addFunctionToList("ExAlarmOutConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				ExAlarmOutConfig();
			}
		});
		addFunctionToList("GetChannelsState", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetChannelsState();
			}
		});
		addFunctionToList("GetComPortDeviceChannelInfo", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetComPortDeviceChannelInfo();
			}
		});
		addFunctionToList("FindGroupInfo", new ListFunctionInterface() {
			@Override
			public void listFun() {
				FindGroupInfo();
			}
		});
		addFunctionToList("RainBrushMode", new ListFunctionInterface() {
			@Override
			public void listFun() {
				RainBrushMode();
			}
		});
		addFunctionToList("RemoveRemoteFiles", new ListFunctionInterface() {
			@Override
			public void listFun() {
				RemoveRemoteFiles();
			}
		});
		addFunctionToList("DropBoxTokenConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				DropBoxTokenConfig();
			}
		});

		addFunctionToList("InitDevAccount", new ListFunctionInterface() {
			@Override
			public void listFun() {
				InitDevAccount();
			}
		});
		addFunctionToList("InitDevAccountByIP", new ListFunctionInterface() {
			@Override
			public void listFun() {
				InitDevAccountByIP();
			}
		});

		addFunctionToList("AppLanguageInfoConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				AppLanguageInfoConfig();
			}
		});

		addFunctionToList("SetGPSStatus", new ListFunctionInterface() {
			@Override
			public void listFun() {
				SetGPSStatus();
			}
		});

		addFunctionToList("ArmScheduleInfoConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				ArmScheduleInfoConfig();
			}
		});

		addFunctionToList("NetCfgExConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				NetCfgExConfig();
			}
		});

		addFunctionToList("QueryStorageInfo", new ListFunctionInterface() {
			@Override
			public void listFun() {
				QueryStorageInfo();
			}
		});

		addFunctionToList("LocalExAlarmConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				LocalExAlarmConfig();
			}
		});

		addFunctionToList("NetMonitorAbortConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				NetMonitorAbortConfig();
			}
		});

		addFunctionToList("ExAlarmInputConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				ExAlarmInputConfig();
			}
		});

		addFunctionToList("VideoImageInfoConfig", new ListFunctionInterface() {
			public void listFun() {
				VideoImageInfoConfig();
			}
		});
		addFunctionToList("BlueToothRecord", new ListFunctionInterface() {
			public void listFun() {
				BlueToothRecord();
			}
		});
		addFunctionToList("QrcodeRecord", new ListFunctionInterface() {
			public void listFun() {
				QrcodeRecord();
			}
		});
		addFunctionToList("AttachDeviceDiscovery", new ListFunctionInterface() {
			public void listFun() {
				AttachDeviceDiscovery();
			}
		});
		addFunctionToList("StartDeviceDiscovery", new ListFunctionInterface() {
			public void listFun() {
				StartDeviceDiscovery();
			}
		});

		addFunctionToList("StopDeviceDiscovery", new ListFunctionInterface() {
			public void listFun() {
				StopDeviceDiscovery();
			}
		});

		addFunctionToList("DetachDeviceDiscovery", new ListFunctionInterface() {
			public void listFun() {
				DetachDeviceDiscovery();
			}
		});

		addFunctionToList("GetPwdSpecification", new ListFunctionInterface() {
			public void listFun() {
				GetPwdSpecification();
			}
		});

		addFunctionToList("Upgrade", new ListFunctionInterface() {
			public void listFun() {
				Upgrade();
			}
		});

		addFunctionToList("VedioInOptionsConfig", new ListFunctionInterface() {
			public void listFun() {
				VedioInOptionsConfig();
			}
		});

		addFunctionToList("CarCoacnConfig", new ListFunctionInterface() {
			public void listFun() {
				CarCoacnConfig();
			}
		});

		addFunctionToList("GetAuthClassifyList", new ListFunctionInterface() {
			public void listFun() {
				GetAuthClassifyList();
			}
		});

		addFunctionToList("ShootingRuleConfig", new ListFunctionInterface() {
			public void listFun() {
				ShootingRuleConfig();
			}
		});

		addFunctionToList("InitDevAccess", new ListFunctionInterface() {
			public void listFun() {
				InitDevAccess();
			}
		});

    	addFunctionToList("QueryUpgradeState", new ListFunctionInterface() {
		public void listFun() {
			QueryUpgradeState();
		}
		});

		addFunctionToList("VSPCaysConfig", new ListFunctionInterface() {
			public void listFun() {
				VSPCaysConfig();
			}
		});

		addFunctionToList("TestFindFileRecord", new ListFunctionInterface() {
			public void listFun() {
				TestFindFileRecord();
			}
		});

		addFunctionToList("TestFindTrafficCar", new ListFunctionInterface() {
			public void listFun() {
				TestFindTrafficCar();
			}
		});

		addFunctionToList("TestPtz", new ListFunctionInterface() {
			public void listFun() {
				TestPtz();
			}
		});


		addFunctionToList("ControlSmartSwitch", new ListFunctionInterface() {
			@Override
			public void listFun() {
				ControlSmartSwitch();
			}
		});

		addFunctionToList("ReleaseAlaram", new ListFunctionInterface() {
			@Override
			public void listFun() {
				ReleaseAlaram();
			}
		});

		addFunctionToList("MatchTwoFaceImage", new ListFunctionInterface() {
			public void listFun() {
				MatchTwoFaceImage();
			}
		});

		addFunctionToList("AttachAIOFileProc", new ListFunctionInterface() {
			public void listFun() {
				AttachAIOFileProc();
			}
		});
		addFunctionToList("TestNetPolicy", new ListFunctionInterface() {
			public void listFun() {
				TestNetPolicy();
			}
		});

		addFunctionToList("UploadRemoteFile", new ListFunctionInterface() {
			public void listFun() {
				UploadRemoteFile();
			}
		});
		addFunctionToList("DownloadRemoteFile", new ListFunctionInterface() {
			public void listFun() {
				DownloadRemoteFile();
			}
		});
		addFunctionToList("OperateMonitorWall", new ListFunctionInterface() {
			public void listFun() {
				OperateMonitorWall();
			}
		});

		addFunctionToList("MonitorWall", new ListFunctionInterface() {
			@Override
			public void listFun() {
				MonitorWall();
			}
		});

		addFunctionToList("QueryBackupDev", new ListFunctionInterface(){
			@Override
			public void listFun(){
				QueryBackupDev();
			}
		});

		addFunctionToList("QueryComposite", new ListFunctionInterface(){
			@Override
			public void listFun(){
				QueryComposite();
			}
		});

		// 自由开窗
		addFunctionToList("SplitWindow ", new ListFunctionInterface() {
			@Override
			public void listFun() {
				SplitWindow ();
			}
		});



		addFunctionToList("TestOperateSplit", new ListFunctionInterface() {
			public void listFun() {
				TestOperateSplit();
			}
		});

		addFunctionToList("NTPConfig", new ListFunctionInterface() {
			public void listFun() {
				NTPConfig();
			}
		});

		addFunctionToList("TestCourseRecord", new ListFunctionInterface() {
			public void listFun() {
				TestCourseRecord();
			}
		});

		addFunctionToList("ModifyLowRateWPAN", new ListFunctionInterface() {
			public void listFun() {
				ModifyLowRateWPAN();
			}
		});

		addFunctionToList("RomoveLowRateWPAN", new ListFunctionInterface() {
			public void listFun() {
				RomoveLowRateWPAN();
			}
		});

		addFunctionToList("OpenDoor", new ListFunctionInterface() {
			public void listFun() {
				OpenDoor();
			}
		});

		addFunctionToList("AddLowRateWLAN", new ListFunctionInterface() {
			public void listFun() {
				AddLowRateWLAN();
			}
		});

		addFunctionToList("QueryWirelessDevState", new ListFunctionInterface() {
			public void listFun() {
				QueryWirelessDevState();
			}
		});

		addFunctionToList("QueryCodeIDState", new ListFunctionInterface() {
			public void listFun() {
				QueryCodeIDState();
			}
		});

        addFunctionToList("TestMail", new ListFunctionInterface() {
            @Override
            public void listFun() {
				TestMail();
            }
        });

		addFunctionToList("CloudUpgrader", new ListFunctionInterface() {
			@Override
			public void listFun() {
				CloudUpgrader();
			}
		});

		addFunctionToList("DVRIPConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				DVRIPConfig();
			}
		});

		addFunctionToList("SearchAndConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				SearchAndConfig();
			}
		});

		addFunctionToList("EmailConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				EmailConfig();
			}
		});

		addFunctionToList("SmartEncodeConfig", new ListFunctionInterface(){
			@Override
			public void listFun() {
				SmartEncodeConfig();
			}
		});




		addFunctionToList("SnapPictureToFile", new ListFunctionInterface(){
			@Override
			public void listFun(){
				SnapPictureToFile();
			}
		});

		addFunctionToList("FindNumberStat", new ListFunctionInterface(){
			@Override
			public void listFun(){
				FindNumberStat();
			}
		});

		addFunctionToList("TestChannelName", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestChannelName();
			}
		});

		addFunctionToList("TestCommConfig", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestCommConfig();
			}
		});

		addFunctionToList("TestFindFile", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestFindFile();
			}
		});
		addFunctionToList("StartListenEx", new ListFunctionInterface(){
			@Override
			public void listFun(){
				StartListenEx();
			}
		});

		addFunctionToList("TestTalk", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestTalk();
			}
		});






		addFunctionToList("TestStatisticFlux", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestStatisticFlux();
			}
		});

		addFunctionToList("TestIO", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestIO();
			}
		});

		addFunctionToList("TestKeyFrame", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestKeyFrame();
			}
		});

		addFunctionToList("TestComm", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestComm();
			}
		});

		addFunctionToList("TestDevConfig", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestDevConfig();
			}
		});

		addFunctionToList("TestDevTime", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestDevTime();
			}
		});



		addFunctionToList("TestRecord", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestRecord();
			}
		});

		addFunctionToList("TestAlm", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestAlm();
			}
		});

		addFunctionToList("TestQueryDev", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestQueryDev();
			}
		});

		addFunctionToList("TestPtz", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestPtz();
			}
		});

		addFunctionToList("TestFileBurned", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestFileBurned();
			}
		});

		addFunctionToList("TestQProdDef", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestQProdDef();
			}
		});

		addFunctionToList("TestMatrix", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestMatrix();
			}
		});

		addFunctionToList("TestCfgEncode", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestCfgEncode();
			}
		});

		addFunctionToList("TestDevState", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestDevState();
			}
		});

		addFunctionToList("TestControlDev", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestControlDev();
			}
		});

		addFunctionToList("IntelBrass", new ListFunctionInterface(){
			@Override
			public void listFun(){
				IntelBrass();
			}
		});



		addFunctionToList("AttachCameraState", new ListFunctionInterface(){
			@Override
			public void listFun(){
				AttachCameraState();
			}
		});





		addFunctionToList("testGetBypass", new ListFunctionInterface(){
			@Override
			public void listFun(){
				testGetBypass();
			}
		});


		addFunctionToList("TestGetActiveDefenceInfo", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestGetActiveDefenceInfo();
			}
		});

		addFunctionToList("TestQueryBurnDevInfo", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestQueryBurnDevInfo();
			}
		});

		addFunctionToList("QueryBurnSessionNum", new ListFunctionInterface() {
			@Override
			public void listFun() {
				QueryBurnSessionNum();
			}
		});

		// 测试刻录相关功能
		addFunctionToList("BurnFunction", new ListFunctionInterface() {
			@Override
			public void listFun() {
				BurnFunction();
			}
		});

		// 测试庭审主机相关配置
		addFunctionToList("TestCourtHearingConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestCourtHearingConfig();
			}
		});

		// 测试庭审主机相关接口
		addFunctionToList("TestCourtHearingInterface", new ListFunctionInterface() {
			@Override
			public void listFun() {
				TestCourtHearingInterface();
			}
			});

		// 公安智能项目
		addFunctionToList("VideoAnalyseSourceConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				VideoAnalyseSourceConfig();
			}
		});

		// 四川移动看店配置
		addFunctionToList("VSP_SCYDKDConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				VSP_SCYDKDConfig();
			}
		});

		// 录像下载
		addFunctionToList("DownloadByTime", new ListFunctionInterface() {
			@Override
			public void listFun() {
				DownloadByTime();
			}
		});

		//获取录播状态
		addFunctionToList("GetRecordState",new ListFunctionInterface(){
			public void listFun() {
				GetRecordState();
			}
		});
		//录播主机复合操作
		addFunctionToList("RecordedOperateComposite",new ListFunctionInterface(){
			public void listFun() {
				RecordedOperateComposite();
			}

		});
		addFunctionToList("SetDetectorWorkMode",new ListFunctionInterface(){
			@Override
			public void listFun() {
				SetDetectorWorkMode();
			}
		});
		//上传文件
		addFunctionToList("StartUploadRemoteFile",new ListFunctionInterface(){
			@Override
			public void listFun() {
				StartUploadRemoteFile();
			}
		});
		//停止上传文件
		addFunctionToList("StopUploadRemoteFile",new ListFunctionInterface(){
			@Override
			public void listFun() {
				StopUploadRemoteFile();
			}
		});

		//
		addFunctionToList("EncodeConfig",new ListFunctionInterface(){
			@Override
			public void listFun() {
				EncodeConfig();
			}
		});
		//DMSS接入智能锁新增接口测试
		addFunctionToList("SetLowRateWPANPower",new ListFunctionInterface(){
			@Override
			public void listFun() {
				SetLowRateWPANPower();
			}
		});
		//DMSS接入智能锁
		addFunctionToList("SetSmartLockUsername",new ListFunctionInterface(){
			@Override
			public void listFun() {
				SetSmartLockUsername();
			}
		});
		addFunctionToList("GetSmartLockRegisterInfo",new ListFunctionInterface(){
			@Override
			public void listFun() {
				GetSmartLockRegisterInfo();
			}
		});
		addFunctionToList("MatrixAddCamerasByDevice",new ListFunctionInterface(){
			@Override
			public void listFun() {
				MatrixAddCamerasByDevice();
			}
		});
		addFunctionToList("AudioInputVolumeConfig",new ListFunctionInterface(){
			@Override
			public void listFun() {
				AudioInputVolumeConfig();
			}
		});
		addFunctionToList("AudioOutputVolumeConfig",new ListFunctionInterface(){
			@Override
			public void listFun() {
				AudioOutputVolumeConfig();
			}
		});
		addFunctionToList("InitAccount",new ListFunctionInterface(){

			@Override
			public void listFun() {
				InitAccount();
			}

		});
		addFunctionToList("ResetWebPwd",new ListFunctionInterface(){

			@Override
			public void listFun() {
				ResetWebPwd();
			}

		});
		addFunctionToList("GetUnifiedStatus",new ListFunctionInterface(){

			@Override
			public void listFun() {
				GetUnifiedStatusTest();
			}

		});
		addFunctionToList("queueUnifiedinfcollectCaps",new ListFunctionInterface(){

			@Override
			public void listFun() {
				queueUnifiedinfcollectCapsTest();
			}

		});
		addFunctionToList("devAudioDecodegetCaps",new ListFunctionInterface(){

			@Override
			public void listFun() {
				devAudioDecodegetCaps();
			}

		});
		//
		addFunctionToList("AttachLowRateWPANTest",new ListFunctionInterface(){

			@Override
			public void listFun() {
				AttachLowRateWPANTest();
			}

		});

		addFunctionToList("ModifyLowRateWPAN", new ListFunctionInterface() {
			public void listFun() {
				ModifyLowRateWPAN();
			}
		});

		addFunctionToList("RomoveLowRateWPAN", new ListFunctionInterface() {
			public void listFun() {
				RomoveLowRateWPAN();
			}
		});

		addFunctionToList("AddLowRateWLAN", new ListFunctionInterface() {
			public void listFun() {
				AddLowRateWLAN();
			}
		});

		addFunctionToList("QueryLowRateWPAN", new ListFunctionInterface() {
			public void listFun() {
				QueryLowRateWPAN();
			}
		});

		addFunctionToList("QueryCodeIDState", new ListFunctionInterface() {
			public void listFun() {
				QueryCodeIDState();
			}
		});

		addFunctionToList("SetDetectorWorkMode",new ListFunctionInterface(){
			@Override
			public void listFun() {
				SetDetectorWorkMode();
			}
		});

		//DMSS接入智能锁新增接口测试
		addFunctionToList("SetLowRateWPANPower",new ListFunctionInterface(){
			@Override
			public void listFun() {
				SetLowRateWPANPower();
			}
		});

		addFunctionToList("QueryAccessoryStatus",new ListFunctionInterface(){
			@Override
			public void listFun() {
				QueryAccessoryStatus();
			}
		});

		addFunctionToList("DSTConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				DSTConfig();
			}
		});

		//NTP
		addFunctionToList("NTPConfig", new ListFunctionInterface() {
			public void listFun() {
				NTPConfig();
			}
		});

		//CommunicationList
		addFunctionToList("TestCommunicationList", new ListFunctionInterface() {
			public void listFun() {
				CommunicationList();
			}
		});

		//CommunicationList
		addFunctionToList("AccessPointConfig", new ListFunctionInterface() {
			public void listFun() {
				AccessPointConfig();
			}
		});

		addFunctionToList("MobilePushNotify", new ListFunctionInterface(){
			@Override
			public void listFun(){
				MobilePushNotify();
			}
		});

		addFunctionToList("TestFindFaceInfo", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestFindFaceInfo();
			}
		});

		addFunctionToList("TestopenLog", new ListFunctionInterface(){
			@Override
			public void listFun(){
				TestopenLog();
			}
		});

		addFunctionToList("VideoInLighting", new ListFunctionInterface(){
			@Override
			public void listFun(){
				VideoInLighting();
			}
		});

		addFunctionToList("Lighting_V2", new ListFunctionInterface(){
			@Override
			public void listFun(){
				Lighting_V2();
			}
		});

		addFunctionToList("GetLightingControlCaps", new ListFunctionInterface(){
			@Override
			public void listFun(){
				GetLightingControlCaps();
			}
		});

		addFunctionToList("MonitorWallSceneFunction", new ListFunctionInterface() {
			@Override
			public void listFun() {
				MonitorWallSceneFunction();
			}
		});

		addFunctionToList("GetDevCaps_AudioOutputCaps", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetDevCaps_AudioOutputCaps();
			}
		});

		addFunctionToList("MobileSubscribe", new ListFunctionInterface(){
			@Override
			public void listFun(){
				MobileSubscribe();
			}
		});
		addFunctionToList("GetMobileSubscribeCfg", new ListFunctionInterface(){
			@Override
			public void listFun(){
				GetMobileSubscribeCfg();
			}
		});
		addFunctionToList("MobileSubscribeCfg", new ListFunctionInterface(){
			@Override
			public void listFun(){
				MobileSubscribeCfg();
			}
		});

		addFunctionToList("AddMobilePushNotify", new ListFunctionInterface(){
			@Override
			public void listFun(){
				AddMobilePushNotify();
			}
		});

		addFunctionToList("GetHumanRadioCaps", new ListFunctionInterface(){
			@Override
			public void listFun(){
				GetHumanRadioCaps();
			}
		});
		addFunctionToList("RadioRegulatorConfig", new ListFunctionInterface(){
			@Override
			public void listFun(){
				RadioRegulatorConfig();
			}
		});

		addFunctionToList("StopListen", new ListFunctionInterface(){
			@Override
			public void listFun(){
				StopListen();
			}
		});
		addFunctionToList("StopLoadPic", new ListFunctionInterface(){
			@Override
			public void listFun(){
				StopLoadPic();
			}
		});
		addFunctionToList("ModifyDevicPassword", new ListFunctionInterface(){
			@Override
			public void listFun(){
				ModifyDevicPassword();
			}
		});

		addFunctionToList("QueryPTZInfo",new ListFunctionInterface(){

			@Override
			public void listFun() {
				QueryPTZInfo();
			}

		});
		addFunctionToList("QueryEventManagerInfo",new ListFunctionInterface(){

			@Override
			public void listFun() {
				QueryEventManagerInfo();
			}

		});

		addFunctionToList("UnableLinkageTimeSection",new ListFunctionInterface(){

			@Override
			public void listFun() {
				UnableLinkageTimeSection();
			}

		});
		addFunctionToList("FindRecordAccessCtl",new ListFunctionInterface(){

			@Override
			public void listFun() {
				FindRecordAccessCtl();
			}

		});
		addFunctionToList("FindMarkFile_SetMarkFile",new ListFunctionInterface(){

			@Override
			public void listFun() {
				FindMarkFile_SetMarkFile();
			}

		});
		addFunctionToList("GetMobilePusherEventList",new ListFunctionInterface(){

			@Override
			public void listFun() {
				GetMobilePusherEventList();
			}

		});
		addFunctionToList("CheckCloudUpgrader",new ListFunctionInterface() {

					@Override
					public void listFun() {
						CheckCloudUpgrader();
					}
				});

		addFunctionToList("GetIFrameData",new ListFunctionInterface(){
			@Override
			public void listFun() {
				GetIFrameData();
			}
		});
		addFunctionToList("RemoteCollectDevInfo",new ListFunctionInterface(){
			@Override
			public void listFun() {
				RemoteCollectDevInfo();
			}
		});
		addFunctionToList("RemoteDeviceInfogetCaps",new ListFunctionInterface(){
			@Override
			public void listFun() {
				RemoteDeviceInfogetCaps();
			}
		});
		addFunctionToList("RelayState",new ListFunctionInterface(){
			@Override
			public void listFun() {
				RelayState();
			}
		});
		addFunctionToList("GetRemoteCollectDevInfo",new ListFunctionInterface(){

			@Override
			public void listFun() {
				GetRemoteCollectDevInfo();
			}

		});

	    addFunctionToList("StartRemoteCollectToFile",new ListFunctionInterface(){

			@Override
			public void listFun() {
				StartRemoteCollectToFile();
			}

		});
		addFunctionToList("StopRemoteCollectToFile",new ListFunctionInterface(){

			@Override
			public void listFun() {
				StopRemoteCollectToFile();
			}

		});
		addFunctionToList("RemotePreUploadFile",new ListFunctionInterface(){

			@Override
			public void listFun() {
				RemotePreUploadFile();
			}

		});
		addFunctionToList("StartRemoteUploadFile",new ListFunctionInterface(){

			@Override
			public void listFun() {
				StartRemoteUploadFile();
			}

		});
		addFunctionToList("StopRemoteUploadFile",new ListFunctionInterface(){

			@Override
			public void listFun() {
				StopRemoteUploadFile();
			}

		});
		addFunctionToList("WlanCaps",new ListFunctionInterface(){

			@Override
			public void listFun() {
				WlanCaps();
			}

		});
		addFunctionToList("SetWlanConfigInfo",new ListFunctionInterface(){

			@Override
			public void listFun() {
				SetWlanConfigInfo();
			}

		});
		addFunctionToList("WifiInstallParamConfig", new ListFunctionInterface(){
			@Override
			public void listFun(){
				WifiInstallParamConfig();
			}
		});
		addFunctionToList("FindMarkFile",new ListFunctionInterface(){

			@Override
			public void listFun() {
				FindMarkFile();
			}

		});
		addFunctionToList("VideoTalkPhoneGeneralConfig",new ListFunctionInterface(){

			@Override
			public void listFun() {
				VideoTalkPhoneGeneralConfig();
			}

		});
		addFunctionToList("getMonitorWallCollections",new ListFunctionInterface(){

			@Override
			public void listFun() {
				getMonitorWallCollections();
			}

		});
		addFunctionToList("FindRecordAccessMobilePushResult",new ListFunctionInterface(){

			@Override
			public void listFun() {
				FindRecordAccessMobilePushResult();
			}

		});
		addFunctionToList("GetMobilePusherCaps", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetMobilePusherCaps();
			}
		});
		addFunctionToList("addPerson", new ListFunctionInterface() {
			@Override
			public void listFun() {
				addPerson();
			}
		});
		addFunctionToList("PTZTour", new ListFunctionInterface(){
			@Override
			public void listFun(){
				PTZTour();
			}
		});
		addFunctionToList("AutoScan", new ListFunctionInterface(){
			@Override
			public void listFun(){
				AutoScan();
			}
		});
		addFunctionToList("GoToPreset", new ListFunctionInterface(){
			@Override
			public void listFun(){
				GoToPreset();
			}
		});
		addFunctionToList("ptzControlPresetAdd", new ListFunctionInterface(){
			@Override
			public void listFun(){
				ptzControlPresetAdd();
			}
		});
		addFunctionToList("ptzControlPresetDelete", new ListFunctionInterface(){
			@Override
			public void listFun(){
				ptzControlPresetDelete();
			}
		});
		addFunctionToList("PTZPointLoopControl", new ListFunctionInterface(){
			@Override
			public void listFun(){
				PTZPointLoopControl();
			}
		});
		addFunctionToList("PTZPointLoopControlStart", new ListFunctionInterface(){
			@Override
			public void listFun(){
				PTZPointLoopControlStart();
			}
		});
		addFunctionToList("PTZPointLoopControlStop", new ListFunctionInterface(){
			@Override
			public void listFun(){
				PTZPointLoopControlStop();
			}
		});
		addFunctionToList("PTZSetModeStart", new ListFunctionInterface(){
			@Override
			public void listFun(){
				PTZSetModeStart();
			}
		});
		addFunctionToList("PTZSetModeStop", new ListFunctionInterface(){
			@Override
			public void listFun(){
				PTZSetModeStop();
			}
		});
		addFunctionToList("PTZRunMode", new ListFunctionInterface(){
			@Override
			public void listFun(){
				PTZRunMode();
			}
		});
		addFunctionToList("PTZStopMode", new ListFunctionInterface(){
			@Override
			public void listFun(){
				PTZStopMode();
			}
		});
		addFunctionToList("PTZDeleteMode", new ListFunctionInterface(){
			@Override
			public void listFun(){
				PTZDeleteMode();
			}
		});
		addFunctionToList("PtzSetScanLimitLeft", new ListFunctionInterface(){
			@Override
			public void listFun(){
				PtzSetScanLimitLeft();
			}
		});
		addFunctionToList("PtzSetScanLimitRight", new ListFunctionInterface(){
			@Override
			public void listFun(){
				PtzSetScanLimitRight();
			}
		});
		addFunctionToList("PtzStartScan", new ListFunctionInterface(){
			@Override
			public void listFun(){
				PtzStartScan();
			}
		});
		addFunctionToList("PtzStopScan", new ListFunctionInterface(){
			@Override
			public void listFun(){
				PtzStopScan();
			}
		});
		addFunctionToList("PTZAddLoop", new ListFunctionInterface(){
			@Override
			public void listFun(){
				PTZAddLoop();
			}
		});
		addFunctionToList("PTZDeleteLoop", new ListFunctionInterface(){
			@Override
			public void listFun(){
				PTZDeleteLoop();
			}
		});
		addFunctionToList("PTZCloseLoop", new ListFunctionInterface(){
			@Override
			public void listFun(){
				PTZCloseLoop();
			}
		});
		addFunctionToList("SetRedirLocal", new ListFunctionInterface() {
			@Override
			public void listFun() {
				SetRedirLocal();
			}
		});
		addFunctionToList("CancelRedirLocal", new ListFunctionInterface() {
			@Override
			public void listFun() {
				CancelRedirLocal();
			}
		});
		addFunctionToList("GetDebugInfo", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetDebugInfo();
			}
		});
		addFunctionToList("GetDebugInfoCaps", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetDebugInfoCaps();
			}
		});
		addFunctionToList("AttachDebugInfo", new ListFunctionInterface() {
			@Override
			public void listFun() {
				AttachDebugInfo();
			}
		});
		addFunctionToList("DetachDebugInfo", new ListFunctionInterface() {
			@Override
			public void listFun() {
				DetachDebugInfo();
			}
		});
		addFunctionToList("DebugInfoRedirect", new ListFunctionInterface() {
			@Override
			public void listFun() {
				DebugInfoRedirect();
			}
		});
		addFunctionToList("GetSnifferCaps", new ListFunctionInterface() {
			@Override
			public void listFun() {
				GetSnifferCaps();
			}
		});
		addFunctionToList("获取抓包状态", new ListFunctionInterface() {
			@Override
			public void listFun() {
				getSnifferInfo();
			}
		});

		addFunctionToList("开始抓包", new ListFunctionInterface() {
			@Override
			public void listFun() {
				startSniffer();
			}
		});
		addFunctionToList("停止抓包", new ListFunctionInterface() {
			@Override
			public void listFun() {
				stopSniffer();
			}
		});

		addFunctionToList("订阅抓包数据", new ListFunctionInterface() {
			@Override
			public void listFun() {
				attachSniffer();
			}
		});
		addFunctionToList("退订抓包数据", new ListFunctionInterface() {
			@Override
			public void listFun() {
				dettachSniffer();
			}
		});
		addFunctionToList("QueryDevInfoCheckStartInfo", new ListFunctionInterface() {
			@Override
			public void listFun() {
				QueryDevInfoCheckStartInfo();
			}
		});
		addFunctionToList("QueryDevInfoGetFuncTypeListInfo", new ListFunctionInterface() {
			@Override
			public void listFun() {
				QueryDevInfoGetFuncTypeListInfo();
			}
		});
		addFunctionToList("Config_SmartMotionDetect", new ListFunctionInterface() {
			@Override
			public void listFun() {
				Config_SmartMotionDetect();
			}
		});
		addFunctionToList("QuerySystemStatus", new ListFunctionInterface() {
			@Override
			public void listFun() {
				QuerySystemStatusInfo();
			}
		});
		addFunctionToList("Face", new ListFunctionInterface() {
			@Override
			public void listFun() {
				Face();
			}
		});
		addFunctionToList("QuerySMDRecordInfo", new ListFunctionInterface() {
			@Override
			public void listFun() {
				QuerySMDRecordInfo();
			}
		});
		addFunctionToList("CrossRegionRuleConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				CrossRegionRuleConfig();
			}
		});
		addFunctionToList("VideoEncoderoi", new ListFunctionInterface() {
			@Override
			public void listFun() {
				VideoEncoderoi();
			}
		});
		addFunctionToList("FaceSnapShot", new ListFunctionInterface() {
			@Override
			public void listFun() {
				FaceSnapShot();
			}
		});
		addFunctionToList("ModifyUserPassword", new ListFunctionInterface() {
			@Override
			public void listFun() {
				ModifyUserPassword();
			}
		});
		addFunctionToList("AddUser", new ListFunctionInterface() {
			@Override
			public void listFun() {
				AddUser();
			}
		});
		addFunctionToList("LightingV2", new ListFunctionInterface() {
			@Override
			public void listFun() {
				LightingV2();
			}
		});
		addFunctionToList("EncodeVideo", new ListFunctionInterface() {
			@Override
			public void listFun() {
				EncodeVideo();
			}
		});
		addFunctionToList("VspOnvif", new ListFunctionInterface() {
			@Override
			public void listFun() {
				VspOnvif();
			}
		});
		addFunctionToList("AnalyseGlobalConfig", new ListFunctionInterface() {
			@Override
			public void listFun() {
				AnalyseGlobalConfig();
			}
		});
		addFunctionToList("VideoInFaceAutoExposure", new ListFunctionInterface() {
			@Override
			public void listFun() {
				VideoInFaceAutoExposure();
			}
		});
	}

    private BroadcastReceiver dynamicReceiver   = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if(intent.getAction().equals(DISCONNECTED_BROAST)){

              ToolKits.writeLog("DISCONNECTED_BROAST lanalyHandle:" + lanalyHandle);
               if(lanalyHandle != 0)
               {
            	   INetSDK.StopLoadPic(lanalyHandle);
            	   lanalyHandle = 0;
               }
            }
            else if(intent.getAction().equals(AUTOCONNECTED_BROAST)) {
            	 ToolKits.writeLog("DISCONNECTED_BROAST AUTOCONNECTED_BROAST:" + lanalyHandle);
            	 DevicePicUpload cbProc = new DevicePicUpload();
	        		lanalyHandle = INetSDK.RealLoadPictureEx(
	        				__LoginHandle, 0, FinalVar.EVENT_IVS_ALL, true, cbProc, 0);
            }
        }};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		generFunctionList();
		ToolKits.verifyStoragePermissions(TestInterfaceActivity.this);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, testList);
		setListAdapter(adapter);

		IntentFilter dynamicFilter = new IntentFilter();
		dynamicFilter.addAction(DISCONNECTED_BROAST);
		dynamicFilter.addAction(AUTOCONNECTED_BROAST);
        registerReceiver(dynamicReceiver, dynamicFilter);  // 注册自定义动态广播消息*/
	}

	@Override
	protected void onDestroy()
	{
		super.onDestroy();
		unregisterReceiver(dynamicReceiver);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		return true;
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		ListFunctionInterface function = listFunctions.get(position);
		if(function != null)
		{
			function.listFun();
		}
		super.onListItemClick(l, v, position, id);
	}

	void testGetBypass() {
		new ToolKits.SimpleAsyncTask<Integer>() {
			 @Override
			    protected void onPreExecute() {
			            super.onPreExecute();
			    }

			     @Override
			      protected  Integer doInBackground(Void... params)
			     {
			 		NET_DEVSTATE_GET_BYPASS stuBypass = new NET_DEVSTATE_GET_BYPASS();

			 		// 如果要查询本地通道，就初始化如下字段
					stuBypass.nLocalCount = 5;
					stuBypass.pnLocal = new int[stuBypass.nLocalCount];
					for (int i = 0; i < stuBypass.nLocalCount; i++)
					{
						stuBypass.pnLocal[i] = i;
					}
					stuBypass.pemLocal = new int[stuBypass.nLocalCount];

					// 如果要查询扩展通道，就初始化如下字段
					stuBypass.nExtendedCount = 4;
					stuBypass.pnExtended = new int[stuBypass.nExtendedCount];
					for (int i = 0; i < stuBypass.nExtendedCount; i++)
					{
						stuBypass.pnExtended[i] = i;
					}
					stuBypass.pemExtended = new int[stuBypass.nExtendedCount];

					try {
						boolean bRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_GET_BYPASS, stuBypass, 5000);
						if (bRet)
						{
							for (int i = 0; i < stuBypass.nLocalCount; i++)
							{
								ToolKits.writeErrorLog("channel" + stuBypass.pnLocal[i] + " is " + stuBypass.pemLocal[i]);
							}
							for (int i = 0; i < stuBypass.nExtendedCount; i++)
							{
								ToolKits.writeErrorLog("extchannel" + stuBypass.pnExtended[i] + " is " + stuBypass.pemExtended[i]);
							}
						}
						else
						{
							ToolKits.writeErrorLog("query bypass state err:" );
							return -1;
						}
					}
					catch (Exception e) {
						e.printStackTrace();
					}
			        return 0;
			     }
			     @Override
			     protected void onPostExecute(Integer result) {
			    	 ToolKits.writeLog("SimpleAsyncTask result: " + result);
			      }
		}.execute();
	}

	void TestGetActiveDefenceInfo()
	{
		new ToolKits.SimpleAsyncTask<Integer>() {
			 @Override
			    protected void onPreExecute() {
			            super.onPreExecute();
			    }

			     @Override
			      protected  Integer doInBackground(Void... params)
			     {
			    	 NET_ACTIVATEDDEFENCEAREA stuActiveDefence = new NET_ACTIVATEDDEFENCEAREA();

			    	 // 如果要查询本地通道，就初始化如下字段
			    	 stuActiveDefence.nAlarmInCount = 8;
			    	 stuActiveDefence.nRetAlarmInCount = 0;
			    	 stuActiveDefence.pstuAlarmInDefenceAreaInfo = new NET_ACTIVATEDDEFENCEAREA_INFO[stuActiveDefence.nAlarmInCount];
			    	 for (int i = 0; i < stuActiveDefence.nAlarmInCount; i++)
			    	 {
			    		 stuActiveDefence.pstuAlarmInDefenceAreaInfo[i] = new NET_ACTIVATEDDEFENCEAREA_INFO();
			    	 }

			    	 // 如果要查询扩展通道，就初始化如下字段
			    	 stuActiveDefence.nExAlarmInCount = 2;
			    	 stuActiveDefence.nRetExAlarmInCount = 0;
			    	 stuActiveDefence.pstuExAlarmInDefenceAreaInfo = new NET_ACTIVATEDDEFENCEAREA_INFO[stuActiveDefence.nExAlarmInCount];
			    	 for (int i = 0; i < stuActiveDefence.nExAlarmInCount; i++)
			    	 {
			    		 stuActiveDefence.pstuExAlarmInDefenceAreaInfo[i] = new NET_ACTIVATEDDEFENCEAREA_INFO();
			    	 }

			    	 try {
						boolean bRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_ACTIVATEDDEFENCEAREA, stuActiveDefence, 5000);
						if (bRet)
						{
							for (int i = 0; i < stuActiveDefence.nRetAlarmInCount; i++)
							{
								ToolKits.writeErrorLog("activated defence[" + i + "] is " + stuActiveDefence.pstuAlarmInDefenceAreaInfo[i].nChannel);
								ToolKits.writeLog("activated time: " + stuActiveDefence.pstuAlarmInDefenceAreaInfo[i].stuActivationTime.toString());
							}
							for (int i = 0; i < stuActiveDefence.nRetExAlarmInCount; i++)
							{
								ToolKits.writeErrorLog("activated extdefence[" + i + "] is " + stuActiveDefence.pstuExAlarmInDefenceAreaInfo[i].nChannel);
							}
						}
						else
						{
							ToolKits.writeErrorLog("query active defence state err:" );
							return -1;
						}
			    	 }
			    	 catch (Exception e) {
			    		 e.printStackTrace();
			    	 }

			        return 0;
			     }
			     @Override
			     protected void onPostExecute(Integer result) {
			    	 ToolKits.writeLog("SimpleAsyncTask result: " + result);
			      }
		}.execute();
	}

	void TestCommConfig() {
		CFG_COMMGROUP_INFO m_stCommInfo = new CFG_COMMGROUP_INFO();
		m_stCommInfo.nCommNum = 4;
		int channelID = 0;
		if (ToolKits.GetDevConfig(FinalVar.CFG_CMD_COMM, m_stCommInfo,
				__LoginHandle, channelID
				, 1024)) {
			ToolKits.showMessage(this, "Get Config Success");

		} else {
			ToolKits.showMessage(this, "Get Config Failed");
		}
	}

	void TestQueryDevState1(){
		NET_DOOR_STATUS_INFO door_status_info = new NET_DOOR_STATUS_INFO();
			door_status_info.nChannel = 1;
			boolean bRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_DOOR_STATE, door_status_info, 5000);
			if (bRet)
			{
					ToolKits.writeLog("eminfo = " + door_status_info.emStateType);
			}
			else
			{
				ToolKits.writeErrorLog("query bypass state err:" );

			}
	}


	public void TestSetParkControlInfo() {
		// Input param
		NET_IN_SET_PARK_CONTROL_INFO stIn = new NET_IN_SET_PARK_CONTROL_INFO();
		stIn.nBroadcastInfoNum = 1;
		stIn.nScreenShowInfoNum = 1;
		stIn.stuBroadcastInfo[0].emTextType = EM_BROADCAST_TEXT_TYPE.EM_BROADCAST_TEXT_TYPE_TIME;
		System.arraycopy("12:21:00".getBytes(), 0, stIn.stuBroadcastInfo[0].szText, 0, "12:21:00".getBytes().length);
		stIn.stuScreenShowInfo[0].nScreenNo = 1;
		stIn.stuScreenShowInfo[0].nRollSpeed = 1;
		stIn.stuScreenShowInfo[0].emTextColor = EM_SCREEN_TEXT_COLOR.EM_SCREEN_TEXT_COLOR_GREEN;
		stIn.stuScreenShowInfo[0].emTextType = EM_SCREEN_TEXT_TYPE.EM_SCREEN_TEXT_TYPE_LOCAL_TIME;

		// Output param
		NET_OUT_SET_PARK_CONTROL_INFO stOut = new NET_OUT_SET_PARK_CONTROL_INFO();
		if(INetSDK.ControlDeviceEx(__LoginHandle, CtrlType.SDK_CTRL_SET_PARK_CONTROL_INFO, stIn, stOut, 3000)) {
			ToolKits.writeLog("ControlDeviceEx Succeed!");
		} else {
			ToolKits.writeErrorLog("ControlDeviceEx Failed!");
			ToolKits.writeErrorLog("GetLastError:" + INetSDK.GetLastError());
		}

	}

	void TestFindFile() {
		NET_TIME stBegin = new NET_TIME();
		stBegin.dwYear = 2014;
		stBegin.dwMonth = 12;
		stBegin.dwDay = 12;
		NET_TIME stEnd = new NET_TIME();
		stEnd.dwYear = 2014;
		stEnd.dwMonth = 12;
		stEnd.dwDay = 12;
		stEnd.dwHour = 23;
		stEnd.dwMinute = 59;
		stEnd.dwSecond = 59;
		int channelID = 0;

		MEDIAFILE_FACE_DETECTION_PARAM stQueryPar = new MEDIAFILE_FACE_DETECTION_PARAM();
		stQueryPar.nChannelID = channelID;
		stQueryPar.stuStartTime = stBegin;
		stQueryPar.stuEndTime = stEnd;
		stQueryPar.emPicType = EM_FACEPIC_TYPE.NET_FACEPIC_TYPE_SMALL;
		stQueryPar.bDetailEnable = false;
		long lRetQuery = INetSDK.FindFileEx(__LoginHandle,
				EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FACE_DETECTION, stQueryPar,
				5000);
		MEDIAFILE_FACE_DETECTION_INFO stQueryFile[] = new MEDIAFILE_FACE_DETECTION_INFO[5];
		for (int i = 0; i < 5; i++) {
			stQueryFile[i] = new MEDIAFILE_FACE_DETECTION_INFO();
		}
		int nFileCount = INetSDK.FindNextFileEx(lRetQuery,
				EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FACE_DETECTION, stQueryFile,
				5000);
		boolean zRet = INetSDK.FindCloseEx(lRetQuery);
		if (!zRet) {
			ToolKits.writeErrorLog("FindCloseEx failed");
		}
	}

	// 查询人脸信息记录集
	void TestFindFaceInfo() {
		ToolKits.writeLog("Enter TestFindFaceInfo.");
		NET_TIME stBegin = new NET_TIME();
		stBegin.dwYear = 2019;
		stBegin.dwMonth = 9;
		stBegin.dwDay = 16;
		NET_TIME stEnd = new NET_TIME();
		stEnd.dwYear = 2019;
		stEnd.dwMonth = 9;
		stEnd.dwDay = 16;
		stEnd.dwHour = 23;
		stEnd.dwMinute = 59;
		stEnd.dwSecond = 59;
		int channelID = 1;

		MEDIAFILE_FACERECOGNITION_PARAM stQueryPar = new MEDIAFILE_FACERECOGNITION_PARAM();
		stQueryPar.nChannelId = channelID;
		stQueryPar.nAlarmType = 1;
		stQueryPar.stStartTime = stBegin;
		stQueryPar.stEndTime = stEnd;
		stQueryPar.abPersonInfoEx = true;
		stQueryPar.stPersonInfoEx.bAgeEnable = true;

		stQueryPar.stPersonInfoEx.nAgeRange[0] = 1;
		stQueryPar.stPersonInfoEx.nAgeRange[1] = 30;
		stQueryPar.stPersonInfoEx.bySex = 1;
		stQueryPar.bSimilaryRangeEnable = true;
		stQueryPar.nSimilaryRange[0] = 1;
		stQueryPar.nSimilaryRange[1] = 100;
		long lRetQuery = INetSDK.FindFileEx(__LoginHandle,
				EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FACE, stQueryPar,
				5000);
		if (lRetQuery == 0)
		{
			ToolKits.writeLog("lRetQuery = 0");
			return;
		}
		MEDIAFILE_FACERECOGNITION_INFO stQueryFile[] = new MEDIAFILE_FACERECOGNITION_INFO[2];
		for (int i = 0; i < 2; i++) {
			stQueryFile[i] = new MEDIAFILE_FACERECOGNITION_INFO();
		}
		int nFileCount = INetSDK.FindNextFileEx(lRetQuery,
				EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FACE, stQueryFile,
				5000);
		if(nFileCount > 0)
		{
			for(int j = 0; j < nFileCount; j++){
				SDK_IN_DOWNLOAD_REMOTE_FILE stIn = new SDK_IN_DOWNLOAD_REMOTE_FILE();

				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String time = format.format(new Date());
				stIn.pszFileDst = getExternalFilesDir(null).getAbsolutePath()+"/"+ "ObjectPic" + "-" + time.replace(":","-").replace(" ", "_")  + "-" + j + ".jpg";

				if (stIn.pszFileDst.equals("")) {
					boolean zRet = INetSDK.FindCloseEx(lRetQuery);
					if (!zRet) {
						ToolKits.writeErrorLog("FindCloseEx failed");
					}
					return;
				}

				stIn.pszFileName = new String(stQueryFile[j].stObjectPic.szFilePath).trim();

				SDK_OUT_DOWNLOAD_REMOTE_FILE stOut = new SDK_OUT_DOWNLOAD_REMOTE_FILE();

				if (INetSDK.DownloadRemoteFile(NetSDKApplication.getInstance().getLoginHandle(), stIn, stOut, 4000)) {
					ToolKits.writeLog("下载成功！");
				}else {
					ToolKits.writeErrorLog("下载失败！");
				}
				if (stQueryFile[j].bGlobalScenePic) {
					SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String time1 = format.format(new Date());
					stIn.pszFileDst = getExternalFilesDir(null).getAbsolutePath() + "/" + "Global" + "-" + time1.replace(":", "-").replace(" ", "_") + "-" + j + ".jpg";

					if (stIn.pszFileDst.equals("")) {
						boolean zRet = INetSDK.FindCloseEx(lRetQuery);
						if (!zRet) {
							ToolKits.writeErrorLog("FindCloseEx failed");
						}
						return;
					}

					stIn.pszFileName = new String(stQueryFile[j].stGlobalScenePic.szFilePath).trim();
					SDK_OUT_DOWNLOAD_REMOTE_FILE stOut1 = new SDK_OUT_DOWNLOAD_REMOTE_FILE();

					if (INetSDK.DownloadRemoteFile(NetSDKApplication.getInstance().getLoginHandle(), stIn, stOut1, 4000)) {
						ToolKits.writeLog("下载成功！");
					} else {
						ToolKits.writeErrorLog("下载失败！");
					}
				}
			}

		}
		boolean zRet = INetSDK.FindCloseEx(lRetQuery);
		if (!zRet) {
			ToolKits.writeErrorLog("FindCloseEx failed");
		}


	}

	void TestFindFileRecord() {
		long hLogin = __LoginHandle;
		int channel = 0;
		NET_TIME stTimeStart = new NET_TIME();
		stTimeStart.dwYear = 2016;
		stTimeStart.dwMonth = 12;
		stTimeStart.dwDay = 23;
		stTimeStart.dwHour = 0;

		NET_TIME stTimeEnd = new NET_TIME();
		stTimeEnd.dwYear = 2016;
		stTimeEnd.dwMonth = 12;
		stTimeEnd.dwDay = 23;
		stTimeEnd.dwHour = 12;

		boolean bTime = false;
		int nWaitTime = 5000;

		long lFind = INetSDK.FindFile(hLogin, channel, 9, null, stTimeStart, stTimeEnd, bTime, nWaitTime);
		if (0 == lFind) {
			ToolKits.writeErrorLog("FindFile");
			return;
		}

		NET_RECORDFILE_INFO stuFile = new NET_RECORDFILE_INFO();
		int fileNum = 0;
		int nRet =0;
		do {

			nRet = INetSDK.FindNextFile(lFind, stuFile);
			if (nRet < 0) {
				break;
			}

			fileNum ++;
			System.out.println(stuFile.ch);
		}while(nRet > 0);

		System.out.println("fileNum " + fileNum);
		INetSDK.FindClose(lFind);
	}

	void getMaxMemoryInfo(){
		Runtime rt = Runtime.getRuntime();
		long maxMemory = rt.maxMemory();
		ToolKits.writeLog("MaxMemory:" + Long.toString(maxMemory/(1024*1024)));
		ActivityManager activityManager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
		ToolKits.writeLog("MemoryClass:" + Long.toString(activityManager.getMemoryClass()));
		ToolKits.writeLog("LargeMemoryClass:" + Long.toString(activityManager.getLargeMemoryClass()));
	}

	void TestFindTrafficCar() {
		int type = EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_TRAFFICCAR;
		MEDIA_QUERY_TRAFFICCAR_PARAM stuParam = new MEDIA_QUERY_TRAFFICCAR_PARAM(1);

		//通道号  -1代表所有通道
		stuParam.nChannelID = -1;

		 //文件类型 0:任意类型, 1:jpg图片, 2:dav文件
		stuParam.nMediaType = 1;

	    //设置 文件标志, 0xFF-使用nFileFlagEx, 0-表示所有录像, 1-定时文件, 2-手动文件, 3-事件文件, 4-重要文件, 5-合成文件
	    stuParam.byFileFlag = 0;

	    //设置 是否需要在查询过程中随意跳转，0-不需要，1-需要
	    stuParam.byRandomAccess = 1;

		//查询相应车道信息  -1代表所有车道
		stuParam.byLane = -1;

		//查询车开往的方向  -1代表所有方向
		stuParam.nDirection = -1;

		// 设置 开始时间
		stuParam.StartTime.dwYear   = 2016;
	    stuParam.StartTime.dwMonth  = 12;
	    stuParam.StartTime.dwDay    = 1;
	    stuParam.StartTime.dwHour   = 10;
	    stuParam.StartTime.dwMinute = 0;
	    stuParam.StartTime.dwSecond = 0;

	    // 设置 结束时间
	    stuParam.EndTime.dwYear   = 2016;
	    stuParam.EndTime.dwMonth  = 12;
	    stuParam.EndTime.dwDay    = 7;
	    stuParam.EndTime.dwHour   = 10;
	    stuParam.EndTime.dwMinute = 30;
	    stuParam.EndTime.dwSecond = 0;

	    stuParam.nEventTypeNum = 1; // 设置需要查询的违章事件类型个数
	    stuParam.pEventTypes[0] = FinalVar.EVENT_IVS_TRAFFICJUNCTION;

	    // 设置查询类型 获取查询句柄
		long hFind = INetSDK.FindFileEx(__LoginHandle, type, stuParam, 3000);
		if (hFind == 0) {
			ToolKits.writeErrorLog("Failed to Find File");
			return;
		}

		// 每次获取的违章数量
		int nMaxConut = 10;

		MEDIAFILE_TRAFFICCAR_INFO[] pMediaFileInfo = new MEDIAFILE_TRAFFICCAR_INFO[nMaxConut];
		for (int i = 0; i < pMediaFileInfo.length; ++i) {
			pMediaFileInfo[i] = new MEDIAFILE_TRAFFICCAR_INFO();
		}

		//循环查询
		int nCurCount = 0;
		while(true)
		{
			// 查询, nRetCount为返回的查询个数
			int nRetCount = INetSDK.FindNextFileEx(hFind, nMaxConut, pMediaFileInfo, 3000);
			if (nRetCount < 0)
			{
				ToolKits.writeErrorLog("FindNextFileEx failed!");
                break;
			}

			for (int j = 0; j < nRetCount; j++)
			{
				//更多信息输出，可以查看结构体MEDIAFILE_TRAFFICCAR_INFO_EX中的MEDIAFILE_TRAFFICCAR_INFO
                MEDIAFILE_TRAFFICCAR_INFO info = pMediaFileInfo[j];
                ToolKits.writeLog("-------------------------[ "+ (j + nCurCount * nMaxConut) +" ]---------------------------");
                ToolKits.writeLog("通道号: " + info.ch);
                ToolKits.writeLog("违章类型: " + info.nEvents[0]);
                ToolKits.writeLog("车道号: " + info.byLane);
                String plateNumber = new String(info.szPlateNumber).trim();
                ToolKits.writeLog("车牌号码: " + plateNumber);
                ToolKits.writeLog("车牌颜色: " + new String(info.szPlateColor).trim());
                ToolKits.writeLog("车牌类型: " + new String(info.szPlateType).trim());
                ToolKits.writeLog("车身颜色: " + new String(info.szVehicleColor).trim());
                ToolKits.writeLog("事件组ID: " + info.nGroupID);
                ToolKits.writeLog("该组ID抓怕张数: " + info.byCountInGroup);
                ToolKits.writeLog("该组ID抓怕索引: " + info.byIndexInGroup);
			}

			if(nRetCount < nMaxConut)
			{
				break;
			}
			else
			{
				nCurCount++;
			}
		}

		INetSDK.FindCloseEx(hFind);
	}

	//订阅报警事件
	void StartListenEx() {
		boolean zRet;

//		NET_ROAD_LIST_INFO stRoadList = new NET_ROAD_LIST_INFO();
//		zRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_GET_ROAD_LIST, stRoadList, 5000);

		INetSDK.SetDVRMessCallBack(new TestMessageCallBack());
		zRet = INetSDK.StartListenEx(__LoginHandle);    // 订阅报警


		// INetSDK.StopListen(__LoginHandle);    // 取消订阅
	}

	//报警回调
	public class TestMessageCallBack1 implements CB_fMessageCallBack {
		@Override
		public boolean invoke(int lCommand, long lLoginID, Object obj,
							  String pchDVRIP, int nDVRPort) {
			ToolKits.writeLog("回调触发，收到的事件码为：" + lCommand);
			if (FinalVar.SDK_ALARM_FRONTDISCONNECT == lCommand) {  // 前端ipc断网报警
				ALARM_FRONTDISCONNET_INFO stInfo = (ALARM_FRONTDISCONNET_INFO) obj;
				ToolKits.writeLog("ALARM_FRONTDISCONNET_INFO");
				ToolKits.writeLog("nChannelID : " + stInfo.nChannelID);
				ToolKits.writeLog("nAction : " + stInfo.nAction);
				ToolKits.writeLog("stuTime : " + stInfo.stuTime.toString());
				ToolKits.writeLog("szIpAddress : " + new String(stInfo.szIpAddress));
			} else if(FinalVar.SDK_ALARM_NO_DISK == lCommand) { //无硬盘报警
				ALARM_NO_DISK_INFO stInfo = (ALARM_NO_DISK_INFO)obj;

				ToolKits.writeLog("无硬盘报警!");
				ToolKits.writeLog("Time:" + stInfo.stuTime.toString());
				ToolKits.writeLog("dwAction:" + stInfo.dwAction);   // 0:Start, 1:Stop
			} else if(FinalVar.SDK_DISKFULL_ALARM_EX == lCommand) {  // 硬盘满报警，数据为1个字节，1为有硬盘满报警，0为无报警。 HDD full alarm
				byte[] diskFull = (byte[]) obj;
				ToolKits.writeLog("length1 : " + diskFull.length);
				if (diskFull[0] == 0) {
					ToolKits.writeLog("no alarm");
				} else if (diskFull[0] == 1) {
					ToolKits.writeLog("HDD full alarm");
				}
			} else if(FinalVar.SDK_DISKERROR_ALARM_EX == lCommand) { // 坏硬盘报警，数据为32个字节，每个字节表示一个硬盘的故障报警状态，1为有报警，0为无报警。  HDD malfunction alarm
				byte[] diskFull = (byte[]) obj;
				ToolKits.writeLog("length2 : " + diskFull.length);
				for (int i = 0; i < diskFull.length; i++) {
					if (diskFull[i] == 0) {
						ToolKits.writeLog("no alarm");
					} else if (diskFull[i] == 1) {
						ToolKits.writeLog("alarm");
					}
				}
			} else if(FinalVar.SDK_ALARM_ALARM_EX == lCommand) { // 外部报警，数据字节数与设备报警通道个数相同，每个字节表示一个报警通道的报警状态，1为有报警，0为无报警。
				byte[] alarmEx = (byte[]) obj;
				ToolKits.writeLog("length2 : " + alarmEx.length);
				for (int i = 0; i < alarmEx.length; i++) {
					if (alarmEx[i] == 0) {
						ToolKits.writeLog("no alarm");
					} else if (alarmEx[i] == 1) {
						ToolKits.writeLog("alarm");
					}
				}
			} else if(FinalVar.SDK_MOTION_ALARM_EX == lCommand) { // 动态检测报警，数据字节数与设备视频通道个数相同，每个字节表示一个视频通道的动态检测报警状态，1为有报警，0为无报警。
				byte[] motionEx = (byte[]) obj;
				ToolKits.writeLog("length2 : " + motionEx.length);
				for (int i = 0; i < motionEx.length; i++) {
					if (motionEx[i] == 0) {
						ToolKits.writeLog("no alarm");
					} else if (motionEx[i] == 1) {
						ToolKits.writeLog("alarm");
					}
				}
			} else if(FinalVar.SDK_NEW_SOUND_DETECT_ALARM_EX == lCommand) { // 新音频检测报警
				SDK_NEW_SOUND_ALARM_STATE soundAlarm = (SDK_NEW_SOUND_ALARM_STATE) obj;
				ToolKits.writeLog("channelcount : " + soundAlarm.channelcount);
				for(int i = 0; i < soundAlarm.channelcount; i ++){
					ToolKits.writeLog("channel : " + soundAlarm.SoundAlarmInfo[i].channel);
					ToolKits.writeLog("volume : " + soundAlarm.SoundAlarmInfo[i].volume);
					ToolKits.writeLog("alarmType : " + soundAlarm.SoundAlarmInfo[i].alarmType);
				}
			} else if(FinalVar.SDK_ALARM_SPEED_LIMIT == lCommand) { // 新音频检测报警
				ALARM_SPEED_LIMIT soundAlarm = (ALARM_SPEED_LIMIT) obj;
				ToolKits.writeLog("SDK_ALARM_SPEED_LIMIT : 限速报警 " );

			} else if(FinalVar.SDK_ALARM_LEFUNCTION_STATUS_SYNC == lCommand) { // App界面显示设备某些特定的状态变化事件
				ALARM_LEFUNCTION_STATUS_SYNC_INFO syncInfo  = (ALARM_LEFUNCTION_STATUS_SYNC_INFO) obj;
				ToolKits.writeLog("SDK_ALARM_LEFUNCTION_STATUS_SYNC : App界面显示设备某些特定的状态变化事件 " );
				ToolKits.writeLog("nAction = " + syncInfo.nAction);
				ToolKits.writeLog("nChannel = " + syncInfo.nChannel);
				ToolKits.writeLog("stuUTC = " + syncInfo.stuUTC.toStringTime());
				ToolKits.writeLog("emFunction = " + syncInfo.emFunction);
				ToolKits.writeLog("szName = " + new String(syncInfo.szName).trim());
	 			ToolKits.writeLog("bStatus = " + syncInfo.bStatus);
			} else if(FinalVar.SDK_ALARM_TRAFFIC_VEHICLE_POSITION == lCommand) { // 车辆位置事件
				ALARM_TRAFFIC_VEHICLE_POSITION positionInfo  = (ALARM_TRAFFIC_VEHICLE_POSITION) obj;
				ToolKits.writeLog("SDK_ALARM_TRAFFIC_VEHICLE_POSITION : 车辆位置事件 " );
				ToolKits.writeLog("nAction = " + positionInfo.nAction);
				ToolKits.writeLog("szEventName = " + new String(positionInfo.szEventName).trim());
				ToolKits.writeLog("nObjectID = " + positionInfo.nObjectID);
				ToolKits.writeLog("szPlateNumber = " + new String(positionInfo.szPlateNumber).trim());
				ToolKits.writeLog("nPosition = " + positionInfo.nPosition);
				ToolKits.writeLog("byOpenStrobeState = " + positionInfo.byOpenStrobeState);
				ToolKits.writeLog("nPlateConfidence = " + positionInfo.nPlateConfidence);
				ToolKits.writeLog("szPlateColor = " + new String(positionInfo.szPlateColor).trim());
				ToolKits.writeLog("nVehicleConfidence = " + positionInfo.nVehicleConfidence);
				ToolKits.writeLog("szPlateType = " + new String(positionInfo.szPlateType).trim());
				ToolKits.writeLog("emVehicleHeadDirection = " + positionInfo.emVehicleHeadDirection);
				ToolKits.writeLog("emVehiclePosition = " + positionInfo.emVehiclePosition);
				ToolKits.writeLog("emDrivingDirection = " + positionInfo.emDrivingDirection);
			} else if(FinalVar.SDK_ALARM_AUDIO_ANOMALY == lCommand) { // 音频异常事件
				ALARM_AUDIO_ANOMALY audioInfo  = (ALARM_AUDIO_ANOMALY) obj;
				ToolKits.writeLog("SDK_ALARM_AUDIO_ANOMALY : 音频异常事件 " );
				ToolKits.writeLog("dwAction = " + audioInfo.dwAction);
				ToolKits.writeLog("dwChannelID = " + audioInfo.dwChannelID);
				ToolKits.writeLog("nDecibel = " + audioInfo.nDecibel);
				ToolKits.writeLog("nFrequency = " + audioInfo.nFrequency);
			} else if(FinalVar.SDK_ALARM_AUDIO_MUTATION == lCommand) { // 声强突变事件
				ALARM_AUDIO_MUTATION audioInfo  = (ALARM_AUDIO_MUTATION) obj;
				ToolKits.writeLog("SDK_ALARM_AUDIO_MUTATION : 声强突变事件 " );
				ToolKits.writeLog("dwAction = " + audioInfo.dwAction);
				ToolKits.writeLog("dwChannelID = " + audioInfo.dwChannelID);
			} else if(FinalVar.SDK_EVENT_CROSSLINE_DETECTION  == lCommand) { // 警戒线事件
				ALARM_EVENT_CROSSLINE_INFO eventInfo  = (ALARM_EVENT_CROSSLINE_INFO) obj;
				ToolKits.writeLog("SDK_EVENT_CROSSLINE_DETECTION : 警戒线事件 " );
				ToolKits.writeLog("nChannelID = " + eventInfo.nChannelID);
				ToolKits.writeLog("PTS = " + eventInfo.PTS);
				ToolKits.writeLog("UTC = " + eventInfo.UTC.toStringTime());
				ToolKits.writeLog("nEventID = " + eventInfo.nEventID);
				ToolKits.writeLog("nEventAction = " + eventInfo.nEventAction);
				ToolKits.writeLog("emCrossDirection = " + eventInfo.emCrossDirection);
				ToolKits.writeLog("nOccurrenceCount = " + eventInfo.nOccurrenceCount);
				ToolKits.writeLog("nLevel = " + eventInfo.nLevel);
				ToolKits.writeLog("bIsObjectInfo = " + eventInfo.bIsObjectInfo);
				if(eventInfo.bIsObjectInfo){
					ToolKits.writeLog("stuObject = " + eventInfo.stuObject.toString());
					for(int i = 0; i < eventInfo.nRetObjectNum; i ++){
						ToolKits.writeLog("stuObjects[" + i+ "] = " + eventInfo.stuObjects[i].toString());
					}
				}
			} else if(FinalVar.SDK_EVENT_CROSSREGION_DETECTION == lCommand) { // 警戒区事件
				ALARM_EVENT_CROSSREGION_INFO eventInfo  = (ALARM_EVENT_CROSSREGION_INFO) obj;
				ToolKits.writeLog("SDK_EVENT_CROSSREGION_DETECTION : 警戒区事件 " );
				ToolKits.writeLog("nChannelID = " + eventInfo.nChannelID);
				ToolKits.writeLog("PTS = " + eventInfo.PTS);
				ToolKits.writeLog("UTC = " + eventInfo.UTC.toStringTime());
				ToolKits.writeLog("nEventID = " + eventInfo.nEventID);
				ToolKits.writeLog("nEventAction = " + eventInfo.nEventAction);
				ToolKits.writeLog("emDirection = " + eventInfo.emDirection);
				ToolKits.writeLog("emActionType = " + eventInfo.emActionType);
				ToolKits.writeLog("nOccurrenceCount = " + eventInfo.nOccurrenceCount);
				ToolKits.writeLog("nLevel = " + eventInfo.nLevel);
				ToolKits.writeLog("bIsObjectInfo = " + eventInfo.bIsObjectInfo);
				if(eventInfo.bIsObjectInfo){
					ToolKits.writeLog("stuObject = " + eventInfo.stuObject.toString());
					for(int i = 0; i < eventInfo.nRetObjectNum; i ++){
						ToolKits.writeLog("stuObjects[" + i+ "] = " + eventInfo.stuObjects[i].toString());
					}
				}
			} else if(FinalVar.SDK_ALARM_SMARTMOTION_HUMAN == lCommand) { // 智能视频移动侦测事件(人)
				ALARM_SMARTMOTION_HUMAN_INFO alarmInfo  = (ALARM_SMARTMOTION_HUMAN_INFO) obj;
				ToolKits.writeLog("SDK_ALARM_SMARTMOTION_HUMAN : 智能视频移动侦测事件(人) " );
				ToolKits.writeLog("nChannelID = " + alarmInfo.nChannelID);
				ToolKits.writeLog("UTC = " + alarmInfo.UTC.toStringTime());
				ToolKits.writeLog("PTS = " + alarmInfo.PTS);
				ToolKits.writeLog("nEventID = " + alarmInfo.nEventID);
				ToolKits.writeLog("nEventAction = " + alarmInfo.nEventAction);

				ToolKits.writeLog("nSmartRegionNum = " + alarmInfo.nSmartRegionNum);
				for(int i = 0; i < alarmInfo.nSmartRegionNum; i ++){
					ToolKits.writeLog("stuSmartRegion[" + i + "] = " + alarmInfo.stuSmartRegion[i].toString());
				}
				ToolKits.writeLog("nHumanObjectNum = " + alarmInfo.nHumanObjectNum);
				for(int i = 0; i < alarmInfo.nHumanObjectNum; i ++){
					ToolKits.writeLog("stuHumanObject[" + i + "] = " + alarmInfo.stuHumanObject[i].toString());
				}
			} else if(FinalVar.SDK_ALARM_SMARTMOTION_VEHICLE == lCommand) { // 智能视频移动侦测事件(车)
				ALARM_SMARTMOTION_VEHICLE_INFO alarmInfo  = (ALARM_SMARTMOTION_VEHICLE_INFO) obj;
				ToolKits.writeLog("SDK_ALARM_SMARTMOTION_VEHICLE : 智能视频移动侦测事件(车) " );
				ToolKits.writeLog("nChannelID = " + alarmInfo.nChannelID);
				ToolKits.writeLog("UTC = " + alarmInfo.UTC.toStringTime());
				ToolKits.writeLog("PTS = " + alarmInfo.PTS);
				ToolKits.writeLog("nEventID = " + alarmInfo.nEventID);
				ToolKits.writeLog("nEventAction = " + alarmInfo.nEventAction);

				ToolKits.writeLog("nSmartRegionNum = " + alarmInfo.nSmartRegionNum);
				for(int i = 0; i < alarmInfo.nSmartRegionNum; i ++){
					ToolKits.writeLog("stuSmartRegion[" + i + "] = " + alarmInfo.stuSmartRegion[i].toString());
				}
				ToolKits.writeLog("nVehicleObjectNum = " + alarmInfo.nVehicleObjectNum);
				for(int i = 0; i < alarmInfo.nVehicleObjectNum; i ++){
					ToolKits.writeLog("stuVehicleObject[" + i + "] = " + alarmInfo.stuVehicleObject[i].toString());
				}
			} else if(FinalVar.SDK_NEW_SOUND_DETECT_ALARM_EX == lCommand) { // 新音频检测报警
				SDK_NEW_SOUND_ALARM_STATE alarmInfo  = (SDK_NEW_SOUND_ALARM_STATE) obj;
				ToolKits.writeLog("SDK_NEW_SOUND_DETECT_ALARM_EX : 新音频检测报警 " );
				ToolKits.writeLog("channelcount = " + alarmInfo.channelcount);
				for(int i = 0; i < alarmInfo.channelcount; i ++){
					ToolKits.writeLog("channel[" + i + "] = " + alarmInfo.SoundAlarmInfo[i].channel);
					ToolKits.writeLog("volume[" + i + "] = " + alarmInfo.SoundAlarmInfo[i].volume);
					ToolKits.writeLog("alarmType[" + i + "] = " + alarmInfo.SoundAlarmInfo[i].alarmType);
					ToolKits.writeLog("byState[" + i + "] = " + alarmInfo.SoundAlarmInfo[i].byState);
				}
			} else if(FinalVar.SDK_ALARM_FACE_FEATURE_ABSTRACT == lCommand) { // 人脸特征向量重建结果事件
				ALARM_FACE_FEATURE_ABSTRACT_INFO alarmInfo  = (ALARM_FACE_FEATURE_ABSTRACT_INFO) obj;
				ToolKits.writeLog("SDK_ALARM_FACE_FEATURE_ABSTRACT : 人脸特征向量重建结果事件 " );
				ToolKits.writeLog("nEventID = " + alarmInfo.nEventID);
				ToolKits.writeLog("UTC = " + alarmInfo.UTC.toStringTime());
				ToolKits.writeLog("PTS = " + alarmInfo.PTS);
				ToolKits.writeLog("nRetAbstractInfo = " + alarmInfo.nRetAbstractInfo);
				for(int i = 0; i < alarmInfo.nRetAbstractInfo; i ++){
					ToolKits.writeLog("emAbstractState[" + i + "] = " + alarmInfo.stuAbstractInfo[i].emAbstractState);
					ToolKits.writeLog("nProcess[" + i + "] = " + alarmInfo.stuAbstractInfo[i].nProcess);
					ToolKits.writeLog("szUID[" + i + "] = " + new String(alarmInfo.stuAbstractInfo[i].szUID).trim());
					ToolKits.writeLog("szGroupId[" + i + "] = " + new String(alarmInfo.stuAbstractInfo[i].szGroupId).trim());
					ToolKits.writeLog("nSucceedCnt[" + i + "] = " + alarmInfo.stuAbstractInfo[i].nSucceedCnt);
					ToolKits.writeLog("nFailedCnt[" + i + "] = " + alarmInfo.stuAbstractInfo[i].nFailedCnt);
					ToolKits.writeLog("emFeatureError[" + i + "] = " + alarmInfo.stuAbstractInfo[i].emFeatureError);
					ToolKits.writeLog("nToken[" + i + "] = " + alarmInfo.stuAbstractInfo[i].nToken);
				}
			} else if(FinalVar.SDK_ALARM_GESTURE_DETECTION == lCommand) { // 手势检测事件
				ALARM_GESTURE_DETECTION_INFO alarmInfo  = (ALARM_GESTURE_DETECTION_INFO) obj;
				ToolKits.writeLog("SDK_ALARM_GESTURE_DETECTION : 手势检测事件 " );
				ToolKits.writeLog("nChannelID = " + alarmInfo.nChannelID);
				ToolKits.writeLog("nAction = " + alarmInfo.nAction);
				ToolKits.writeLog("szName = " + new String(alarmInfo.szName).trim());
				ToolKits.writeLog("szClass = " + new String(alarmInfo.szClass).trim());
				ToolKits.writeLog("dbPTS = " + alarmInfo.dbPTS);
				ToolKits.writeLog("stuUTC = " + alarmInfo.stuUTC.toStringTime());
				ToolKits.writeLog("nUTCMS = " + alarmInfo.nUTCMS);
				ToolKits.writeLog("nEventID = " + alarmInfo.nEventID);
				ToolKits.writeLog("stuGestureInfo.nCount = " + alarmInfo.stuGestureInfo.nCount);
				ToolKits.writeLog("stuGestureInfo.szType = " + new String(alarmInfo.stuGestureInfo.szType).trim());
				ToolKits.writeLog("nGroupID = " + alarmInfo.nGroupID);
				ToolKits.writeLog("nCountInGroup = " + alarmInfo.nCountInGroup);
				ToolKits.writeLog("nIndexInGroup = " + alarmInfo.nIndexInGroup);
			} else if(FinalVar.SDK_ALARM_ACCESS_CTL_EVENT == lCommand) { // 门禁事件
				ALARM_ACCESS_CTL_EVENT_INFO alarmInfo  = (ALARM_ACCESS_CTL_EVENT_INFO) obj;
				ToolKits.writeLog("SDK_ALARM_ACCESS_CTL_EVENT : 门禁事件 " );
				ToolKits.writeLog("nDoor = " + alarmInfo.nDoor);
				ToolKits.writeLog("szDoorName = " + new String(alarmInfo.szDoorName).trim());
				ToolKits.writeLog("szCardNo = " + new String(alarmInfo.szCardNo).trim());
				ToolKits.writeLog("szUserID = " + new String(alarmInfo.szUserID).trim());
				ToolKits.writeLog("emEventType = " + alarmInfo.emEventType);
				ToolKits.writeLog("stuTime = " + alarmInfo.stuTime.toString());
				ToolKits.writeLog("emCardType = " + alarmInfo.emCardType);
				ToolKits.writeLog("emOpenMethod = " + alarmInfo.emOpenMethod);
				ToolKits.writeLog("bStatus = " + alarmInfo.bStatus);
				ToolKits.writeLog("nErrorCode = " + alarmInfo.nErrorCode);
			}
			return true;
		}
	}
	//订阅报警事件
	void StartListenEx1() {

		INetSDK.SetDVRMessCallBack(new TestMessageCallBack1());
		boolean bRet = INetSDK.StartListenEx(__LoginHandle);    // 订阅报警
		if(bRet)
		{
			ToolKits.writeLog("StartListenEx success");
		}
	}
	//取消订阅报警事件
	void StopListen()
	{
		if(__LoginHandle != 0)
		{
			INetSDK.StopListen(__LoginHandle);
		}
	}


	void TestTalk() {
		String strLog = "";

		strLog += "\nTesting SetDeviceMode...";
		boolean zRet = INetSDK.SetDeviceMode(__LoginHandle,
				EM_USEDEV_MODE.SDK_TALK_CLIENT_MODE, null);
		strLog += zRet;

		strLog += "\nTesting StartTalkEx...";
		long lServiceH = INetSDK.StartTalkEx(__LoginHandle,
				new TestpfAudioDataCallBack());
		strLog += lServiceH;

		strLog += "\nTesting TalkSendData...";
		int nRet = INetSDK.TalkSendData(lServiceH, null);
		strLog += nRet;

		strLog += "\nTesting StopTalkEx...";
		zRet = INetSDK.StopTalkEx(lServiceH);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestBatchAppendFaceRecognition(){
		NET_IN_BATCH_APPEND_FACERECONGNITION stIn = new NET_IN_BATCH_APPEND_FACERECONGNITION(2);
		String nameA = "Cloud";
		String nameB = "Tifa";
		String idA = "114514";
		String idB = "1919810";
		System.arraycopy(nameA.getBytes(), 0, stIn.pstPersonInfo[0].szPersonName, 0, nameA.getBytes().length);
		System.arraycopy(nameB.getBytes(), 0, stIn.pstPersonInfo[1].szPersonName, 0, nameB.getBytes().length);
		System.arraycopy(idA.getBytes(), 0, stIn.pstPersonInfo[0].szID, 0, idA.getBytes().length);
		System.arraycopy(idB.getBytes(), 0, stIn.pstPersonInfo[1].szID, 0, idB.getBytes().length);
		stIn.pstPersonInfo[0].bySex = 1;
		stIn.pstPersonInfo[1].bySex = 2;
		stIn.pstPersonInfo[0].byAge = 22;
		stIn.pstPersonInfo[1].byAge = 19;
		stIn.pstPersonInfo[0].wFacePicNum = 1;
		stIn.pstPersonInfo[1].wFacePicNum = 1;
		stIn.stuInfo.nToken = 1;
		//工具类，获取图片数据流
		byte[] photoDataA = ToolKits.GetPictureData("/sdcard/test2.jpg");
		byte[] photoDataB = ToolKits.GetPictureData("/sdcard/timg.jpg");
		//入参的图片数据流，仅一个byte数组，需把图片拼接后传入，并填写正确的nOutFacePhotoLen
		stIn.nBufferLen = photoDataA.length + photoDataB.length;
		stIn.pstPersonInfo[0].szFacePicInfo[0].dwOffSet = 0;
		stIn.pstPersonInfo[0].szFacePicInfo[0].dwFileLenth = photoDataA.length;
		stIn.pstPersonInfo[1].szFacePicInfo[0].dwOffSet = photoDataA.length;
		stIn.pstPersonInfo[1].szFacePicInfo[0].dwFileLenth = photoDataB.length;
		System.arraycopy("1".getBytes(), 0, stIn.pstPersonInfo[0].szGroupID, 0, "1".getBytes().length);
		System.arraycopy("1".getBytes(), 0, stIn.pstPersonInfo[1].szGroupID, 0, "1".getBytes().length);
		stIn.pBuffer = new byte[stIn.nBufferLen + 1];
		//拼接流程，将图片拼入入参的pFacePhoto中，此处图方便所以传了两张相同的图片
		System.arraycopy(photoDataA, 0, stIn.pBuffer, 0, photoDataA.length);
		System.arraycopy(photoDataB, 0, stIn.pBuffer, photoDataA.length, photoDataB.length);


		NET_OUT_BATCH_APPEND_FACERECONGNITION stOut = new NET_OUT_BATCH_APPEND_FACERECONGNITION(2);

		boolean bRet = INetSDK.BatchAppendFaceRecognition(__LoginHandle, stIn, stOut, 5000);

		if(!bRet){
			ToolKits.writeErrorLog("BatchAppendFaceRecognition Failed!!");
		}else{
			ToolKits.writeLog("BatchAppendFaceRecognition Succeed!!");
			ToolKits.writeLog("nResultNum = " + stOut.nResultNum);
			for(int i = 0; i < stOut.nResultNum; i ++){
				ToolKits.writeLog("pstResultInfo[" + i + "]-------------------");
				ToolKits.writeLog("nUID = " + stOut.pstResultInfo[i].nUID);
				ToolKits.writeLog("dwErrorCode = " + stOut.pstResultInfo[i].dwErrorCode);
				ToolKits.writeLog("szUID2 = " + new String(stOut.pstResultInfo[i].szUID2).trim());
			}
		}
	}

	void TestGetFaceRecognitionAppendToken(){
		NET_IN_GET_FACE_RECOGNITION_APPEND_TOKEN stIn = new NET_IN_GET_FACE_RECOGNITION_APPEND_TOKEN();
		NET_OUT_GET_FACE_RECOGNITION_APPEND_TOKEN stOut = new NET_OUT_GET_FACE_RECOGNITION_APPEND_TOKEN();

		boolean bRet = INetSDK.GetFaceRecognitionAppendToken(__LoginHandle, stIn, stOut, 5000);

		if(!bRet){
			ToolKits.writeErrorLog("GetFaceRecognitionAppendToken Failed!!");
		}else{
			ToolKits.writeLog("GetFaceRecognitionAppendToken Succeed!!");
			ToolKits.writeLog("nToken = " + stOut.nToken);
		}
	}

	void GetPushInfosRTMPManager(){
		NET_IN_RTMP_MANAGER_GETPUSHINFOS stIn = new NET_IN_RTMP_MANAGER_GETPUSHINFOS();
		NET_OUT_RTMP_MANAGER_GETPUSHINFOS stOut = new NET_OUT_RTMP_MANAGER_GETPUSHINFOS();

		boolean bRet = INetSDK.GetPushInfosRTMPManager(__LoginHandle, stIn, stOut, 5000);

		if(!bRet){
			ToolKits.writeErrorLog("GetPushInfosRTMPManager Failed!!");
		}else{
			ToolKits.writeLog("GetPushInfosRTMPManager Succeed!!");
			ToolKits.writeLog("nPushInfosNum = " + stOut.nPushInfosNum);
			for(int i = 0; i < stOut.nPushInfosNum; i ++){
				ToolKits.writeLog("-------------------");
				ToolKits.writeLog("nPushId = " + stOut.stuPushInfos[i].nPushId);
				ToolKits.writeLog("emType = " + stOut.stuPushInfos[i].emType);
				ToolKits.writeLog("emStatus = " + stOut.stuPushInfos[i].emStatus);
			}
		}
	}
	void TestRemoveAllRTMP(){
		NET_IN_RTMP_MANAGER_GETPUSHINFOS stIn = new NET_IN_RTMP_MANAGER_GETPUSHINFOS();
		NET_OUT_RTMP_MANAGER_GETPUSHINFOS stOut = new NET_OUT_RTMP_MANAGER_GETPUSHINFOS();

		boolean bRet = INetSDK.GetPushInfosRTMPManager(__LoginHandle, stIn, stOut, 5000);

		if(!bRet){
			ToolKits.writeErrorLog("GetPushInfosRTMPManager Failed!!");
		}else{
			ToolKits.writeLog("GetPushInfosRTMPManager Succeed!!");
			for(int i = 0; i < stOut.nPushInfosNum; i ++){
				RTMPremove(stOut.stuPushInfos[i].nPushId);
			}
		}
	}

	void TestInitDevSetLocalityConfig(){
		NET_IN_INIT_DEVICE_SET_LOCALITY_CONFIG_INFO stIn = new NET_IN_INIT_DEVICE_SET_LOCALITY_CONFIG_INFO();
		NET_OUT_INIT_DEVICE_SET_LOCALITY_CONFIG_INFO stOut = new NET_OUT_INIT_DEVICE_SET_LOCALITY_CONFIG_INFO();
		String Mac = "00:12:34:56:78:9a";
		String CountryCode = "US";
		System.arraycopy(Mac.getBytes(), 0, stIn.szMac, 0, Mac.getBytes().length);
		System.arraycopy(CountryCode.getBytes(), 0, stIn.szCountry, 0, CountryCode.getBytes().length);

		boolean bRet = INetSDK.InitDevSetLocalityConfig(stIn, stOut, 5000, "192.168.1.103");

		if(!bRet){
			ToolKits.writeErrorLog("InitDevSetLocalityConfig Failed!!");
		}else{
			ToolKits.writeLog("InitDevSetLocalityConfig Succeed!!");
		}
	}

	void TestUserOperation2() {
		String strLog = "";

		USER_MANAGE_INFO_EX stManaInfo = new USER_MANAGE_INFO_EX();

		strLog += "\nTesting QueryUserInfoEx...";
		boolean zRet = INetSDK.QueryUserInfoEx(
				__LoginHandle, stManaInfo, 5000);
		strLog += zRet;
		for(int i = 0 ; i < stManaInfo.dwUserNum; i ++){
			ToolKits.writeLog("USER " + i + "->");
			ToolKits.writeLog("		name = " + new String(stManaInfo.userList[i].name).trim());
			ToolKits.writeLog("		passWord = " + new String(stManaInfo.userList[i].passWord).trim());
			ToolKits.writeLog("		memo = " + new String(stManaInfo.userList[i].memo).trim());

		}

		strLog += "\nTesting OperateUserInfoEx...";

		/**
		 * 序列化方式进行深拷贝
		 * */
		USER_INFO_EX oldInfo = (USER_INFO_EX)copy(stManaInfo.userList[0]);
		USER_INFO_EX newInfo = (USER_INFO_EX)copy(stManaInfo.userList[0]);
		char[] oldPWD ="admin1234".toCharArray();
		char[] newPWD = "admin321".toCharArray();
		System.arraycopy(oldPWD, 0, oldInfo.passWord, 0, oldPWD.length);
		System.arraycopy(newPWD, 0, newInfo.passWord, 0, newPWD.length);
//		stUpdated.userList[3].passWord = "admin123".toCharArray();
//		stManaInfo.userList[3].passWord = "admin1234".toCharArray();
		zRet = INetSDK.OperateUserInfoEx(__LoginHandle, 6,
				newInfo, oldInfo, 5000);
		strLog += zRet;
		if(!zRet)	ToolKits.writeErrorLog("ERROR : "+INetSDK.GetLastError());


		ToolKits.showMessage(this, strLog);
	}

	void PushTestinHEMA(){
		while(true){
			TestDownloadRecordbyIPlaySDK();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			GetSoftwareVersion();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	void GetSoftwareVersion(){
		NET_IN_GET_SOFTWAREVERSION_INFO stIn = new NET_IN_GET_SOFTWAREVERSION_INFO();
		NET_OUT_GET_SOFTWAREVERSION_INFO stOut = new NET_OUT_GET_SOFTWAREVERSION_INFO();
		if(INetSDK.GetSoftwareVersion(__LoginHandle,stIn,stOut,10000)){
			ToolKits.writeLog("GetSoftwareVersion Succeeed, stOut.szVersion = " + new String(stOut.szVersion).trim());
			ToolKits.writeLog("GetSoftwareVersion Succeeed, stOut.szWebVersion = " + stOut.stuBuildDate.toString());
			ToolKits.writeLog("GetSoftwareVersion Succeeed, stOut.szWebVersion = " + new String(stOut.szWebVersion).trim());
			ToolKits.writeLog("GetSoftwareVersion Succeeed, stOut.szSecurityVersion = " + new String(stOut.szSecurityVersion).trim());
		}else{
			ToolKits.writeErrorLog("GetSoftwareVersion failed");
		}
	}

	void TestDownloadRecordbyIPlaySDK() {
		//IPlaySDK.PLAYSetPrintLogSwitch(1);
		/**设定录像开始时间**/
		NET_TIME beginTime = new NET_TIME();
		beginTime.dwYear = 2022;
		beginTime.dwMonth = 3;
		beginTime.dwDay = 10;
		beginTime.dwHour = 12;
		beginTime.dwMinute = 00;
		/**设定录像结束时间**/
		NET_TIME endTime = new NET_TIME();
		endTime.dwYear = 2022;
		endTime.dwMonth = 3;
		endTime.dwDay = 10;
		endTime.dwHour = 12;
		endTime.dwMinute = 05;
		/**PLAYSDK库获取空闲端口**/
		final int gPlayPort = IPlaySDK.PLAYGetFreePort();
		final String recFileName = "/storage/emulated/0/downloadbytime.dav";
		int channelID = 0;
		/**转码结束回调，转码结束时会触发**/
		class fileEndCB implements IPlaySDKCallBack.fpFileEndCBFun {
			@Override
			public void invoke(int nPort, long puserData) {
				final int gPlayPort = nPort;
				new Thread(new Runnable() {
					@Override
					public void run() {
						/**停止转码并释放端口**/
						IPlaySDK.PLAYStopDataRecord(gPlayPort);
						IPlaySDK.PLAYStop(gPlayPort);
						IPlaySDK.PLAYCloseStream(gPlayPort);
						IPlaySDK.PLAYReleasePort(gPlayPort);
						ToolKits.writeLog("StreamConvert Succeed !!");
					}
				}).start();
			}
		}
		class fTestRecordErrorCallBack implements fRecordErrorCallBack{
			@Override
			public void invoke(int gPort, long pUserData) {
				ToolKits.writeLog("nPort = " + gPort + " and pUserData = " + pUserData);
			}
		}
		class Test_CB_fDataCallBack2 implements CB_fDataCallBack {
			@Override
			public int invoke(long lRealHandle, int dwDataType, byte buffer[], int dwBufferSize) {
				ToolKits.writeLog("lRealHandle = " + lRealHandle + ", dwDataType = " + dwDataType + ", dwBufferSize = " + dwBufferSize);
				return 0;
			}
		}
		class Test_CB_fTimeDownLoadPosCallBack1 implements CB_fTimeDownLoadPosCallBack {
			@Override
			public void invoke(final long lPlayHandle, int dwTotalSize, int dwDownLoadSize, int index, NET_RECORDFILE_INFO recordfileinfo) {
				// -1 == dwDownLoadSize 下载结束
				if(-1 == dwDownLoadSize) {

					new Thread(new Runnable() {
						@Override
						public void run() {
//							ToolKits.writeLog("in CallBack, lPlayHandle = " + lPlayHandle);
							if(INetSDK.StopDownload(lPlayHandle)){
//							INetSDK.StopDownload(0);
								ToolKits.writeLog("DownLoad Completed!!!" + "lDownloadHandle = " + lPlayHandle);
								/**下载结束后调用转码接口**/
								IPlaySDK.PLAYOpenFile(gPlayPort,recFileName);
								IPlaySDK.PLAYSetFileEndCallBack(gPlayPort,new fileEndCB(),0);
								/**0表示原始视频流；1表示转换成AVI格式；2表示转换成ASF格式；3分段保存文件，5表示MP4文件**/
								IPlaySDK.PLAYStartDataRecord(gPlayPort, "/storage/emulated/0/downloadbytime.mp4",5,new fTestRecordErrorCallBack(),0);
								IPlaySDK.PLAYPlay(gPlayPort, (Surface) null);
								ToolKits.writeLog("Start Stream Convertor ..");
							}else{
								ToolKits.writeLog("StopDownload failed!!!");
							}
						}
					}).start();
				}
			}
		}
		/**下载接口**/
		ToolKits.writeLog("Start Download Record!!!");
		/**下载接口**/
		long lDownloadHandle = INetSDK.DownloadByTimeEx(__LoginHandle, channelID, EM_QUERY_RECORD_TYPE.EM_RECORD_TYPE_ALL,
				beginTime, endTime, recFileName, new Test_CB_fTimeDownLoadPosCallBack1(), new Test_CB_fDataCallBack2(), null);
		ToolKits.writeLog("before download, lDownloadHandle = " + lDownloadHandle);
		if(lDownloadHandle != 0){
			ToolKits.writeLog("StartDownloadRecord succeed!!!");
		}else{
			ToolKits.writeLog("StartDownloadRecord failed!!!" + INetSDK.GetLastError());
		}
	}
	void TestDownloadRecord() {
		/**设定录像开始时间**/
		NET_TIME beginTime = new NET_TIME();
		beginTime.dwYear = 2022;
		beginTime.dwMonth = 10;
		beginTime.dwDay = 5;
		beginTime.dwHour = 13;
		beginTime.dwMinute = 00;
		/**设定录像结束时间**/
		NET_TIME endTime = new NET_TIME();
		endTime.dwYear = 2022;
		endTime.dwMonth = 10;
		endTime.dwDay = 5;
		endTime.dwHour = 13;
		endTime.dwMinute = 10;
		final String recFileName = "/storage/emulated/0/downloadbytime1.dav";
		int channelID = 0;
		class Test_CB_fDataCallBack2 implements CB_fDataCallBack {
			@Override
			public int invoke(long lRealHandle, int dwDataType, byte buffer[], int dwBufferSize) {
				ToolKits.writeLog("lRealHandle = " + lRealHandle + ", dwDataType = " + dwDataType + ", dwBufferSize = " + dwBufferSize);
				return 0;
			}
		}
		class Test_CB_fTimeDownLoadPosCallBack1 implements CB_fTimeDownLoadPosCallBack {
			@Override
			public void invoke(final long lPlayHandle, int dwTotalSize, int dwDownLoadSize, int index, NET_RECORDFILE_INFO recordfileinfo) {
				// -1 == dwDownLoadSize 下载结束
				if(-1 == dwDownLoadSize) {
					new Thread(new Runnable() {
						@Override
						public void run() {
							if(INetSDK.StopDownload(lPlayHandle)){
								ToolKits.writeLog("DownLoad Completed!!!" + "lDownloadHandle = " + lPlayHandle);
							}else{
								ToolKits.writeLog("StopDownload failed!!!");
							}
						}
					}).start();
				}
			}
		}
		/**下载接口**/
		if(INetSDK.DownloadByTimeEx(__LoginHandle, channelID, EM_QUERY_RECORD_TYPE.EM_RECORD_TYPE_ALL,
				beginTime, endTime, recFileName, new Test_CB_fTimeDownLoadPosCallBack1(), new Test_CB_fDataCallBack2(), null) != 0){
			ToolKits.writeLog("StartDownloadRecord succeed!!!");
		}else{
			ToolKits.writeLog("StartDownloadRecord failed!!!" + INetSDK.GetLastError());
		}
	}
	void TestUserOperation() {
		String strLog = "";

		USER_MANAGE_INFO_EX stManaInfo = new USER_MANAGE_INFO_EX();

		strLog += "\nTesting QueryUserInfoEx...";
		boolean zRet = INetSDK.QueryUserInfoEx(
				__LoginHandle, stManaInfo, 5000);
		strLog += zRet;
		for(int i = 0 ; i < stManaInfo.dwUserNum; i ++){
			ToolKits.writeLog("USER " + i + "->");
			ToolKits.writeLog("		name = " + new String(stManaInfo.userList[i].name).trim());
			ToolKits.writeLog("		passWord = " + new String(stManaInfo.userList[i].passWord).trim());
			ToolKits.writeLog("		memo = " + new String(stManaInfo.userList[i].memo).trim());
		}

		strLog += "\nTesting OperateUserInfoEx...";
		/**
		 * 序列化方式进行深拷贝
		 * */
		USER_INFO_EX newInfo = (USER_INFO_EX)copy(stManaInfo.userList[3]);
		char[] newMemo = "Updated by rosetta".toCharArray();
		System.arraycopy(newMemo, 0, newInfo.memo, 0, newMemo.length);
//		stUpdated.userList[3].passWord = "admin123".toCharArray();
//		stManaInfo.userList[3].passWord = "admin1234".toCharArray();
		zRet = INetSDK.OperateUserInfoEx(__LoginHandle, 5,
				newInfo, stManaInfo.userList[3], 5000);
		if(!zRet)	ToolKits.writeErrorLog("ERROR : "+INetSDK.GetLastError());
		ToolKits.showMessage(this, strLog);
	}
	void TestQueryLog() {
		String strLog = "";

		SDK_NEWLOG_ITEM stLogs[] = new SDK_NEWLOG_ITEM[3];
		for (int i = 0; i < stLogs.length; i++) {
			stLogs[i] = new SDK_NEWLOG_ITEM();
		}
		Integer stRetCount = new Integer(0);
		Integer stReserved = new Integer(0);

		boolean zRet = INetSDK.QueryLogEx(__LoginHandle,
				SDK_LOG_QUERY_TYPE.SDKLOG_ALL, stLogs, stRetCount, stReserved, 5000);
		if(zRet) {
			ToolKits.writeLog("Count :　" + stRetCount.intValue());
			for(int i=0; i<stRetCount.intValue(); i++) {
				ToolKits.writeLog("Type :　" + stLogs[i].type);
			}
		}
		stReserved = Integer.valueOf(1);
		zRet = INetSDK.QueryLogEx(__LoginHandle,
				SDK_LOG_QUERY_TYPE.SDKLOG_ALL, stLogs, stRetCount, stReserved, 5000);

		ToolKits.showMessage(this, strLog);
	}

	void TestRecordState() {
		// 查询录像状态
		byte buf[] = new byte[32];
		Integer stRet = Integer.valueOf(0);
		boolean zRet = INetSDK.QueryRecordState(__LoginHandle, buf, stRet, 3000);
		if(zRet) {
			ToolKits.writeLog("QueryRecordState Succeed! " + stRet.intValue());
			for(int i = 0; i < stRet.intValue(); i++) {
				if(buf[i] == 0) {
					ToolKits.writeLog("通道" + i + ": 不录像");
				} else if (buf[i] == 1) {
					ToolKits.writeLog("通道" + i + ": 手动录像");
				} else if (buf[i] == 2) {
					ToolKits.writeLog("通道" + i + ": 自动录像");
				}
			}
		} else {
			ToolKits.writeErrorLog("QueryRecordState Failed!" );
		}

		// 设置录像状态
		zRet = false;
		byte bufIn[] = new byte[16];
		for (int i = 0; i < 16; i++) {
			bufIn[i] = buf[i];
		}
		zRet = INetSDK.SetupRecordState(__LoginHandle, bufIn);
		if(zRet) {
			ToolKits.writeLog("SetupRecordState Succeed!");
		} else {
			ToolKits.writeErrorLog("SetupRecordState Failed!" );
		}


		//////////////////////////// 开始/停止录像//////////////////////////////////////
		// 获取
		AV_CFG_RecordMode[] recordMode = new AV_CFG_RecordMode[20];
		for(int i=0; i<stRet.intValue(); i++) {
			recordMode[i] = new AV_CFG_RecordMode();
		}

		for(int i=0; i<stRet.intValue(); i++) {
			boolean bRecordModeGet = ToolKits. GetDevConfig(FinalVar.CFG_CMD_RECORDMODE,  recordMode[i],
					__LoginHandle, i, 1024*1024*2);
			if(bRecordModeGet) {
			ToolKits.writeLog("通道" + i + "的录像模式：" + recordMode[i].nMode + "\n" +
							  "辅码流录像模式：" + recordMode[i].nModeExtra1);
			} else {
			ToolKits.writeErrorLog("GetRecordMode Failed!" );
			}
			// 设置，开始、关闭录像
//			recordMode[i].nMode = 1;
//			recordMode[i].nModeExtra1 = 2;

			boolean bRecordModeSet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_RECORDMODE, recordMode[i],
									__LoginHandle, i, 1024*1024*2);
			if(bRecordModeSet) {
			ToolKits.writeLog("SetRecordMode Succeed!");
			} else {
			ToolKits.writeErrorLog("SetRecordMode Failed!" );
			}
		}


		CFG_DEVRECORDGROUP_INFO devRecordGroup = new CFG_DEVRECORDGROUP_INFO();

		boolean bdevRecordGroupGet = ToolKits. GetDevConfig(FinalVar.CFG_CMD_DEVRECORDGROUP,  devRecordGroup,
									__LoginHandle, -1, 1024*1024*2);
		if(bdevRecordGroupGet) {
				ToolKits.writeLog("通道个数：" + devRecordGroup.nChannelNum);
				for(int i=0; i<devRecordGroup.nChannelNum; i++) {
					ToolKits.writeLog("设备名称：" + devRecordGroup.stuDevRecordInfo[i].byStatus);
					ToolKits.writeLog("存储路径：" + devRecordGroup.stuDevRecordInfo[i].szStoragePosition);
				}
		} else {
			ToolKits.writeErrorLog("GetDevRecordGroup Failed!" );
		}
		// 设置录像状态
//		String devNameString = "666";
//		String chnNameString = "888";
//		System.arraycopy(devNameString.getBytes(), 0, devRecordGroup.stuDevRecordInfo[0].szDevName, 0, devNameString.getBytes().length);
//		System.arraycopy(chnNameString.getBytes(), 0, devRecordGroup.stuDevRecordInfo[0].szChannelName, 0, chnNameString.getBytes().length);
//
		boolean bdevRecordGroupSet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_DEVRECORDGROUP, devRecordGroup,
										__LoginHandle, -1, 1024*1024*2);
		if(bdevRecordGroupSet) {
			ToolKits.writeLog("SetDevRecordGroup Succeed!");
		} else {
			ToolKits.writeErrorLog("SetDevRecordGroup Failed!" );
		}
	}

	void TestStatisticFlux() {
		String strLog = "";

		strLog += "\nTesting GetStatiscFlux...";
		int nRet = INetSDK.GetStatiscFlux(__LoginHandle, 0);
		strLog += nRet;
		strLog += "\nTesting SetMaxFlux...";
		boolean zRet = INetSDK.SetMaxFlux(__LoginHandle,
				(short) 1024);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestIO() {
//		String strLog = "";
//
//		ALARM_CONTROL stInCtr[] = new ALARM_CONTROL[16];
//		for (int i = 0; i < 16; i++) {
//			stInCtr[i] = new ALARM_CONTROL();
//		}
//		Integer stIOCount = new Integer(0);
//		strLog += "\nTesting QueryIOControlState...";
//		boolean zRet = INetSDK.QueryIOControlState(
//				__LoginHandle, SDK_IOTYPE.SDK_ALARMINPUT,
//				stInCtr, stIOCount, 3000);
//		strLog += zRet;
//		strLog += "\nTesting IOControl...";
//		zRet = INetSDK.IOControl(__LoginHandle,
//				SDK_IOTYPE.SDK_ALARMINPUT, stInCtr);
//		strLog += zRet;
//
//		ToolKits.showMessage(this, strLog);

		int emType = SDK_IOTYPE.SDK_ALARM_TRIGGER_MODE;
		Integer nIOCount = Integer.valueOf(0);

		boolean bRet = INetSDK.QueryIOControlState(__LoginHandle, emType, null, nIOCount, 3000);

		if(bRet) {
			ToolKits.writeLog("通道个数 ： " + nIOCount.intValue());
		} else {
			ToolKits.writeErrorLog("查询通道个数失败！" );
		}

		TRIGGER_MODE_CONTROL[] objArr = new TRIGGER_MODE_CONTROL[nIOCount.intValue()];
		for(int i = 0; i < nIOCount.intValue(); i++) {
			objArr[i] = new TRIGGER_MODE_CONTROL();
		}

		boolean bRet1 = INetSDK.QueryIOControlState(__LoginHandle, emType, objArr, nIOCount, 3000);

		if(bRet1) {
			ToolKits.writeLog("触发方式个数 ：" + nIOCount.intValue());
		} else {
			ToolKits.writeErrorLog("查询触发方式失败！" );
		}
	}


	void TestKeyFrame() {
		String strLog = "";
		int channelID = 0;
		strLog += "\nTesting MakeKeyFrame...";
		boolean zRet = INetSDK.MakeKeyFrame(__LoginHandle,
				channelID, 0);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestComm() {
		String strLog = "";

		SDK_COMM_STATE stParam = new SDK_COMM_STATE();
		strLog += "\nTesting QueryTransComParams...";
		boolean zRet = INetSDK.QueryTransComParams(
				__LoginHandle, 0, stParam, 3000);
		strLog += zRet;

		TestfTransComCallBack stCb = new TestfTransComCallBack();
		strLog += "\nTesting CreateTransComChannel...";
		long lHandle = INetSDK.CreateTransComChannel(
				__LoginHandle, 0, 115200, 4, 1, 1, stCb);
		strLog += lHandle;

		byte data[] = new byte[8];
		data[0] = 'a';
		data[1] = 'b';
		data[2] = 'c';
		data[3] = 'd';
		data[4] = 'e';
		data[5] = 'f';
		data[6] = 'g';
		data[7] = 'h';
		strLog += "\nTesting SendTransComData...";
		zRet = INetSDK.SendTransComData(lHandle, data, 8);
		strLog += zRet;

		strLog += "\nTesting DestroyTransComChannel...";
		zRet = INetSDK.DestroyTransComChannel(lHandle);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	// 图像通道属性配置
	public void EncodeInfoConfig() {
		String szCommandrule = FinalVar.CFG_CMD_ENCODE;
		CFG_ENCODE_INFO encodeInfo = new CFG_ENCODE_INFO();

		boolean bRet1 = false;
		Integer error = new Integer(0);
		char szBuffer[] = new char[10*1024*1024];

		if(INetSDK.GetNewDevConfig( __LoginHandle, szCommandrule , 0, szBuffer,10*1024*1024,error,10000) )
		{
			if( INetSDK.ParseData(szCommandrule ,szBuffer , encodeInfo , null ) )
			{
				bRet1 = true;
			}
			else
			{
				ToolKits.writeErrorLog("Parse " + szCommandrule + " Config Failed!");
				bRet1 = false;
			}
		}
		else
		{
			ToolKits.writeErrorLog("Get" + szCommandrule + " Config Failed!");
			bRet1 = false;
		}
		// 获取
//		boolean bRet1 = ToolKits.GetDevConfig(szCommandrule, encodeInfo, __LoginHandle, 0, 10*1024*1024);
		if(bRet1) {
			ToolKits.writeLog("GetNewDevConfig Succeed!" + "\n" +
					"通道ID：" + encodeInfo.nChannelID );
			ToolKits.writeLog("音频压缩模式： " + String.format("%x", encodeInfo.stuMainStream[0].stuAudioFormat.emCompression));
			encodeInfo.stuMainStream[0].stuAudioFormat.emCompression = 1;

			boolean bRet2 = false;
			Integer restart = new Integer(0);
			char szBuffer2[] = new char[2*1024*1024];
			for(int i=0; i<2*1024*1024; i++)szBuffer[i]=0;

			if(INetSDK.PacketData(szCommandrule, encodeInfo, szBuffer, 2*1024*1024))
			{
				if( INetSDK.SetNewDevConfig(__LoginHandle,szCommandrule , 0 , szBuffer, 2*1024*1024, error, restart, 10000))
				{
					bRet2 = true;
				}
				else
				{
					ToolKits.writeErrorLog("Set " + szCommandrule + " Config Failed!");
					bRet2 = false;
				}
			}
			else
			{
				ToolKits.writeErrorLog("Packet " + szCommandrule + " Config Failed!");
				bRet2 = false;
			}
			if(bRet2) {
				ToolKits.writeLog("setNewDevConfig Succeed!");
			} else {
				ToolKits.writeErrorLog("setNewDevConfig Failed!" );
			}
		} else {
			ToolKits.writeErrorLog("GetNewDevConfig Failed!" );
		}
	}

	// 录像下载速度配置
	public void WorkModeConfig() {
		NET_CFG_WORK_MODE_INFO stIn = new NET_CFG_WORK_MODE_INFO();
		int channel = -1;  // 通道号
		boolean bRet = false;
		bRet = INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_WORK_MODE, channel, stIn, 3000, null);
		// 获取
		if (bRet) {
			ToolKits.writeLog("GetConfig NET_EM_CFG_WORK_MODE Succeed!");
			ToolKits.writeLog("nWorkModeNum : " + stIn.nWorkModeNum);
			for(int i = 0; i < stIn.nWorkModeNum; i ++){
				ToolKits.writeLog("stuWorkMode[" + i + "].emMode = " + stIn.stuWorkMode[i].emMode);
				ToolKits.writeLog("stuWorkMode[" + i + "].nPirPeriod = " + stIn.stuWorkMode[i].stuModeParam.nPirPeriod);
				ToolKits.writeLog("stuWorkMode[" + i + "].nPirRecordTime = " + stIn.stuWorkMode[i].stuModeParam.nPirRecordTime);
				ToolKits.writeLog("stuWorkMode[" + i + "].nWhiteLight = " + stIn.stuWorkMode[i].stuModeParam.nWhiteLight);
				ToolKits.writeLog("stuWorkMode[" + i + "].szResolution = " + new String(stIn.stuWorkMode[i].stuModeParam.szResolution).trim());
				stIn.stuWorkMode[i].emMode ++;
				stIn.stuWorkMode[i].stuModeParam.nPirPeriod ++;
				stIn.stuWorkMode[i].stuModeParam.nPirRecordTime ++;
				stIn.stuWorkMode[i].stuModeParam.nWhiteLight ++;
				String tmp = new String(stIn.stuWorkMode[i].stuModeParam.szResolution).trim() + "add1";
				System.arraycopy(tmp.getBytes(),0, stIn.stuWorkMode[i].stuModeParam.szResolution, 0, tmp.getBytes().length);
				if(stIn.stuWorkMode[i].emMode > 5) stIn.stuWorkMode[i].emMode = -1;
			}
			if(INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_WORK_MODE, channel, stIn, 3000, null, null)) {
				ToolKits.writeLog("SetConfig NET_EM_CFG_WORK_MODE Succeed!");
			} else {
				ToolKits.writeErrorLog("SetConfig NET_EM_CFG_WORK_MODE Failed!" );
			}
		} else {
			ToolKits.writeErrorLog("GetConfig NET_EM_CFG_WORK_MODE Failed!" );
		}

	}


	// 录像下载速度配置
	public void RecordDownloadSpeedConfig() {
		NET_CFG_RECORD_DOWNLOAD_SPEED_ALL_INFO stIn = new NET_CFG_RECORD_DOWNLOAD_SPEED_ALL_INFO();
		int channel = -1;  // 通道号
		boolean bRet = false;
		bRet = INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_RECORD_DOWNLOAD_SPEED_ALL, channel, stIn, 3000, null);
		// 获取
		if (bRet) {
			ToolKits.writeLog("GetConfig Succeed!");
			ToolKits.writeLog("emSpeed : " + stIn.emSpeed);
		} else {
			ToolKits.writeErrorLog("GetConfig Failed!" );
		}

		if(stIn.emSpeed != NET_EM_DOWNLOAD_SPEED.NET_EM_DOWNLOAD_SPEED_4096)	stIn.emSpeed = NET_EM_DOWNLOAD_SPEED.NET_EM_DOWNLOAD_SPEED_4096;
		else stIn.emSpeed = NET_EM_DOWNLOAD_SPEED.NET_EM_DOWNLOAD_SPEED_2048;

		if(bRet){
			if(INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_RECORD_DOWNLOAD_SPEED_ALL, channel, stIn, 3000, null, null)) {
				ToolKits.writeLog("SetConfig Succeed!");
			} else {
				ToolKits.writeErrorLog("SetConfig Failed!" );
			}
		}

	}

	void TestDevConfig() {
		boolean zRet;
		int channelID = 0;
		Integer stRet = new Integer(0);
		SDK_DVR_VIDEOOSD_CFG stVideoOsdCfg[] = new SDK_DVR_VIDEOOSD_CFG[1];
		stVideoOsdCfg[0] = new SDK_DVR_VIDEOOSD_CFG();
		zRet = INetSDK.GetDevConfig(__LoginHandle,
				FinalVar.SDK_DEV_VIDEO_OSD_CFG,
				channelID, stVideoOsdCfg, stRet, 3000);

		zRet = false;
		byte[] name = new byte[64];
		System.arraycopy(name, 0, stVideoOsdCfg[0].StOSDTitleOpt[0].SzOSD_Name, 0, name.length);
		String strnameString = "dahua";
		System.arraycopy(strnameString.getBytes(), 0, stVideoOsdCfg[0].StOSDTitleOpt[0].SzOSD_Name, 0, strnameString.getBytes().length);
		zRet = INetSDK.SetDevConfig(__LoginHandle,
				FinalVar.SDK_DEV_VIDEO_OSD_CFG, channelID, stVideoOsdCfg, 3000);
		if(zRet) {
			ToolKits.writeLog("Succeed-------------------------");
		} else {
			ToolKits.writeErrorLog("" );
		}
/*
		Integer stRet = new Integer(0);
		SDKDEV_WLAN_INFO stCfg[] = new SDKDEV_WLAN_INFO[1];
		stCfg[0] = new SDKDEV_WLAN_INFO();
		zRet = INetSDK.GetDevConfig(__LoginHandle,
				FinalVar.SDK_DEV_WLAN_CFG, 0, stCfg, stRet, 3000);
		if(zRet){
		ToolKits.writeLog("Get Wlan Succeed!");
		ToolKits.writeLog("SSID：" + new String(stCfg[0].szSSID).trim());
		} else {
		ToolKits.writeErrorLog("Get Wlan Failed!" );
		}

		stCfg[0].nEncryption = 7;
		System.arraycopy("IPC-GYL".getBytes(), 0, stCfg[0].szSSID, 0, "IPC-GYL".getBytes().length);
		System.arraycopy("88668866".getBytes(), 0, stCfg[0].szKeys[0], 0, "88668866".getBytes().length);
		System.arraycopy("88668866".getBytes(), 0, stCfg[0].szWPAKeys, 0, "88668866".getBytes().length);
		zRet = INetSDK.SetDevConfig(__LoginHandle,
				FinalVar.SDK_DEV_WLAN_CFG, channelID, stCfg, 3000);
		if (!zRet) {
			ToolKits.writeErrorLog("error, ");
		}

		Integer stRet1 = new Integer(0);
		SDKDEV_WLAN_DEVICE_LIST stCfg1[] = new SDKDEV_WLAN_DEVICE_LIST[1];
		stCfg1[0] = new SDKDEV_WLAN_DEVICE_LIST();
		zRet = INetSDK.GetDevConfig(__LoginHandle,
				FinalVar.SDK_DEV_WLAN_DEVICE_CFG, 0, stCfg1, stRet1, 3000);
		if(zRet){
		ToolKits.writeLog("Get Wlan Succeed!");
		ToolKits.writeLog("SSID：" + new String(stCfg1[0].lstWlanDev[0].szSSID).trim());
		} else {
		ToolKits.writeErrorLog("Get Wlan Failed!" );
		}

//		Integer stRet = new Integer(0);
//		SDKDEV_WIRELESS_ROUTING_CFG stVideoOsdCfg[] = new SDKDEV_WIRELESS_ROUTING_CFG[1];
//		stVideoOsdCfg[0] = new SDKDEV_WIRELESS_ROUTING_CFG();
//		zRet = INetSDK.GetDevConfig(__LoginHandle,
//				FinalVar.SDK_DEV_WIRELESS_ROUTING_CFG, -1, stVideoOsdCfg, stRet, 3000);
//		if(zRet){
//			ToolKits.writeLog("Get Routing Succeed!");
//			ToolKits.writeLog("网关：" + new String(stVideoOsdCfg[0].szGateWay).trim());
//			ToolKits.writeLog("子网掩码：" + new String(stVideoOsdCfg[0].szSubMark).trim());
//		} else {
//			ToolKits.writeErrorLog("Get Routing Failed!" );
//		}
//		zRet = false;
//		String gateWay = "172.9.3.0";
//		System.arraycopy(gateWay.getBytes(), 0, stVideoOsdCfg[0].szGateWay, 0, gateWay.getBytes().length);
//		String subMark = "255.255.255.0";
//		System.arraycopy(subMark.getBytes(), 0, stVideoOsdCfg[0].szSubMark, 0, subMark.getBytes().length);
//		zRet = INetSDK.SetDevConfig(__LoginHandle,
//				FinalVar.SDK_DEV_WIRELESS_ROUTING_CFG, -1, stVideoOsdCfg, 3000);
//		if(zRet){
//			ToolKits.writeLog("Set Routing Succeed!");
//		} else {
//			ToolKits.writeErrorLog("Set Routing Failed!" );
//		}   */
	}

	void TestChannelName() {
		byte name[] = new byte[16 * 32];
		Integer stRet = new Integer(0);
		boolean zRet = INetSDK.QueryChannelName(
				__LoginHandle, name, stRet, 1000);
		zRet = INetSDK.SetupChannelName(__LoginHandle, name);

		SDK_CHANNEL_OSDSTRING stOSDStr = new SDK_CHANNEL_OSDSTRING();
		stOSDStr.bEnable = true;
		stOSDStr.dwPosition[0] = 1;
		stOSDStr.dwPosition[1] = 3;
		stOSDStr.szStrings[0][0] = 'a';
		stOSDStr.szStrings[0][1] = 'b';
		stOSDStr.szStrings[0][2] = 'c';
		stOSDStr.szStrings[1][0] = 'd';
		stOSDStr.szStrings[1][1] = 'e';
		stOSDStr.szStrings[1][2] = 'f';
		int channelID = 0;
		zRet = INetSDK.SetupChannelOsdString(__LoginHandle,
				channelID, stOSDStr);
	}

	void TestDevTime() {
		NET_TIME stNetTime = new NET_TIME();
		boolean bRet = INetSDK.QueryDeviceTime(
				__LoginHandle, stNetTime, 2000);
		if(bRet) {
			ToolKits.writeLog(stNetTime.toString());
		}
		stNetTime.dwYear = 2018;
		stNetTime.dwMonth = 1;
		stNetTime.dwDay = 27;
		stNetTime.dwHour = 10;
		stNetTime.dwMinute = 14;
		stNetTime.dwSecond = 50;

		boolean zRet = INetSDK.SetupDeviceTime(__LoginHandle,
				stNetTime);
		if(zRet) {
			ToolKits.writeLog("SetupDeviceTime Succeed!");
		} else {
			ToolKits.writeErrorLog("SetupDeviceTime Failed!" );
		}

	}

	void TestSearchDev() {
		ToolKits.writeLog("Start Search Device");

		boolean bRet;
		TestfSearchDevicesCB stCb = new TestfSearchDevicesCB();
//		//stCb.invoke();
//		long lRet = INetSDK.StartSearchDevices(stCb);
//		if (lRet == 0 ) {
//			ToolKits.writeErrorLog("Failed to start search device");
//		}
//
//		int cnt = 0;
//		while(true) {
//			try {
//				sleep(6000);
//				cnt++;
//				ToolKits.writeLog("当前：" + cnt);
//				if(cnt > 10) {
//					INetSDK.StopSearchDevices(lRet);
//					ToolKits.writeLog("Stop Search Devices");
//					break;
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//
//
//		bRet = INetSDK.StopSearchDevices(lRet);



		DEVICE_IP_SEARCH_INFO stIpInfo = new DEVICE_IP_SEARCH_INFO();
		stIpInfo.nIpNum = 1;
		System.arraycopy("172.29.7.149".getBytes(), 0, stIpInfo.szIP[0], 0,
				"172.29.7.149".getBytes().length);
//		System.arraycopy("172.23.29.160".getBytes(), 0, stIpInfo.szIP[1], 0,
//				"172.23.12.160".getBytes().length);
//		System.arraycopy("172.23.29.221".getBytes(), 0, stIpInfo.szIP[2], 0,
//				"172.23.12.221".getBytes().length);
		ToolKits.writeLog("Start Search Devices By IP");
		bRet = INetSDK.SearchDevicesByIPs(stIpInfo, stCb, 3000);

	}

	void TestDecode() {
		String strLog = "";

		TestfMessDataCallBack stCb = new TestfMessDataCallBack();
		strLog += "\nTesting SetOperateCallBack...";
		boolean zRet = INetSDK.SetOperateCallBack(
				__LoginHandle, stCb);
		strLog += zRet;

		TestfDecPlayBackPosCallBack stPlBkCb = new TestfDecPlayBackPosCallBack();
		strLog += "\nTesting SetDecPlaybackPos...";
		zRet = INetSDK.SetDecPlaybackPos(__LoginHandle,
				stPlBkCb);
		strLog += zRet;

		DEV_DECODER_INFO stInfo = new DEV_DECODER_INFO();
		strLog += "\nTesting QueryDecoderInfo...";
		zRet = INetSDK.QueryDecoderInfo(__LoginHandle,
				stInfo, 3000);
		strLog += zRet;

		int nDecoderId = 0;
		DEV_ENCODER_INFO stEncDev = new DEV_ENCODER_INFO();
		String sIp = "172.28.2.99";
		String sUser = "admin";
		System.arraycopy(sIp.toCharArray(), 0, stEncDev.szDevIp, 0,
				sIp.length());
		System.arraycopy(sUser.toCharArray(), 0, stEncDev.szDevUser, 0,
				sUser.length());
		System.arraycopy(sUser.toCharArray(), 0, stEncDev.szDevPwd, 0,
				sUser.length());
		stEncDev.wDevPort = 37777;
		stEncDev.nDevChannel = 0;
		stEncDev.nStreamType = 0;
		stEncDev.bDevChnEnable = 1;
		stEncDev.byConnType = 0;
		stEncDev.byWorkMode = 0;
		strLog += "\nTesting SwitchDecTVEncoder...";
		long lOperateHandle = INetSDK.SwitchDecTVEncoder(
				__LoginHandle, nDecoderId, stEncDev);
		strLog += lOperateHandle;

		DEC_PLAYBACK_FILE_PARAM stFilePara = new DEC_PLAYBACK_FILE_PARAM();
		System.arraycopy(sIp.toCharArray(), 0, stFilePara.szDevIp, 0,
				sIp.length());
		stFilePara.wDevPort = 37777;
		stFilePara.bDevChnEnable = 1;
		stFilePara.byDecoderID = (byte) nDecoderId;
		System.arraycopy(sUser.toCharArray(), 0, stFilePara.szDevUser, 0,
				sUser.length());
		System.arraycopy(sUser.toCharArray(), 0, stFilePara.szDevPwd, 0,
				sUser.length());

		NET_TIME stBegin = new NET_TIME();
		stBegin.dwYear = 2013;
		stBegin.dwMonth = 1;
		stBegin.dwDay = 1;
		NET_TIME stEnd = new NET_TIME();
		stEnd.dwYear = 2013;
		stEnd.dwMonth = 1;
		stEnd.dwDay = 1;
		int channelID = 0;
		long lFindHandle = INetSDK.FindFile(__LoginHandle,
				channelID, 0, null, stBegin, stEnd,
				false, 3000);
		NET_RECORDFILE_INFO stFile = new NET_RECORDFILE_INFO();
		INetSDK.FindNextFile(lFindHandle, stFile);
		zRet = INetSDK.FindClose(lFindHandle);
		stFilePara.stuRecordInfo = stFile;

		strLog += "\nTesting DecTVPlayback...";
		long lPlBkFile = INetSDK.DecTVPlayback(
				__LoginHandle, nDecoderId,
				DEC_PLAYBACK_MODE.Dec_By_Device_File, stFilePara);
		strLog += lPlBkFile;

		strLog += "\nTesting CtrlDecPlayback...";
		zRet = INetSDK
				.CtrlDecPlayback(__LoginHandle, nDecoderId,
						DEC_CTRL_PLAYBACK_TYPE.Dec_Playback_Pause, 10, 1000);
		strLog += zRet;

		int nMonitorId = 1;
		int nSplitNum = 4;
		byte bChn[] = new byte[4];
		bChn[0] = 0;
		bChn[1] = 1;
		bChn[2] = 2;
		bChn[3] = 3;
		strLog += "\nTesting CtrlDecTVScreen...";
		long lRetHandle = INetSDK.CtrlDecTVScreen(
				__LoginHandle, nMonitorId, true, nSplitNum,
				bChn, 4);
		strLog += lRetHandle;

		DEV_DECCHANNEL_STATE stDecChnSta = new DEV_DECCHANNEL_STATE();
		strLog += "\nTesting QueryDecChannelFlux...";
		zRet = INetSDK.QueryDecChannelFlux(__LoginHandle,
				nDecoderId, stDecChnSta, 1000);
		strLog += zRet;

		DEV_DECODER_TV stTVInfo = new DEV_DECODER_TV();
		strLog += "\nTesting QueryDecoderTVInfo...";
		zRet = INetSDK.QueryDecoderTVInfo(__LoginHandle,
				nDecoderId, stTVInfo, 3000);
		strLog += zRet;

		DEV_ENCODER_INFO stEncInfo = new DEV_ENCODER_INFO();
		strLog += "\nTesting QueryDecEncoderInfo...";
		zRet = INetSDK.QueryDecEncoderInfo(__LoginHandle,
				nDecoderId, stEncInfo, 3000);
		strLog += zRet;

		byte bArr[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		strLog += "\nTesting SetDecTVOutEnable...";
		zRet = INetSDK.SetDecTVOutEnable(__LoginHandle,
				bArr, 9, 3000);
		strLog += zRet;

		byte byChns[] = { 4, 5, 6, 7 };
		strLog += "\nTesting AddTourCombin...";
		int iAddTour = INetSDK.AddTourCombin(__LoginHandle,
				nMonitorId, nSplitNum, byChns, 4, 1000);
		strLog += iAddTour;

		strLog += "\nTesting SetTourCombin...";
		zRet = INetSDK.SetTourCombin(__LoginHandle,
				nMonitorId, iAddTour, nSplitNum, byChns, 4, 1000);
		strLog += zRet;

		DEC_COMBIN_INFO stDecComb = new DEC_COMBIN_INFO();
		strLog += "\nTesting QueryTourCombin...";
		zRet = INetSDK.QueryTourCombin(__LoginHandle,
				nMonitorId, iAddTour, stDecComb, 1000);
		strLog += zRet;

		DEC_TOUR_COMBIN stDecTour = new DEC_TOUR_COMBIN();
		strLog += "\nTesting QueryDecoderTour...";
		zRet = INetSDK.QueryDecoderTour(__LoginHandle,
				nMonitorId, stDecTour, 1000);
		strLog += zRet;

		strLog += "\nTesting SetDecoderTour...";
		zRet = INetSDK.SetDecoderTour(__LoginHandle,
				nMonitorId, stDecTour, 1000);
		strLog += zRet;

		strLog += "\nTesting CtrlDecoderTour...";
		zRet = INetSDK.CtrlDecoderTour(__LoginHandle,
				nMonitorId, DEC_CTRL_TOUR_TYPE.Dec_Tour_Start, 1000);
		strLog += zRet;

		strLog += "\nTesting DelTourCombin...";
		zRet = INetSDK.DelTourCombin(__LoginHandle,
				nMonitorId, iAddTour, 1000);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestRecord() {
		String strLog = "";

		NET_TIME stTime = new NET_TIME();
		stTime.dwYear = 2013;
		stTime.dwMonth = 12;
		NET_RECORD_STATUS stStatus = new NET_RECORD_STATUS();
		strLog += "\nTesting QueryRecordStatus...";

		int channelID = 0;
		boolean zRet = INetSDK.QueryRecordStatus(
				__LoginHandle,
				channelID, 0, stTime, null, stStatus,
				3000);
		strLog += zRet;

		NET_TIME stTimeB = new NET_TIME();
		stTimeB.dwYear = 2013;
		stTimeB.dwMonth = 12;
		stTimeB.dwDay = 1;
		NET_TIME stTimeE = new NET_TIME();
		stTimeE.dwYear = 2013;
		stTimeE.dwMonth = 12;
		stTimeE.dwDay = 31;
		BOOL_RET bRet = new BOOL_RET();
		strLog += "\nTesting QueryRecordTime...";
		zRet = INetSDK.QueryRecordTime(__LoginHandle,
				channelID, 0, stTimeB, stTimeE, null,
				bRet, 3000);
		strLog += zRet;

		NET_RECORDFILE_INFO stRecFileInfo[] = new NET_RECORDFILE_INFO[16];
		for (int i = 0; i < 16; i++) {
			stRecFileInfo[i] = new NET_RECORDFILE_INFO();
		}
		Integer stCount = new Integer(0);
		strLog += "\nTesting QuickQueryRecordFile...";
		zRet = INetSDK.QuickQueryRecordFile(__LoginHandle,
				channelID, 0, stTimeB, stTimeE, null,
				stRecFileInfo, stCount, 3000, false);
		strLog += zRet;

		NET_FURTHEST_RECORD_TIME stFurTime = new NET_FURTHEST_RECORD_TIME(16);
		strLog += "\nTesting QueryFurthestRecordTime...";
		zRet = INetSDK.QueryFurthestRecordTime(
				__LoginHandle, 0, null, stFurTime, 3000);
		strLog += zRet;

		byte bArrState[] = new byte[16];
		Integer stRetLen = new Integer(0);
		strLog += "\nTesting QueryExtraRecordState...";
		zRet = INetSDK.QueryExtraRecordState(__LoginHandle,
				bArrState, stRetLen, 3000);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestAlm() {
		String strLog = "";

		strLog += "\nTesting AlarmReset...";
		int channelID = 0;
		boolean zRet = INetSDK.AlarmReset(__LoginHandle, -1,
				channelID, null, 3000);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestQueryDev() {
		String strLog = "";
		SDK_PRODUCTION_DEFNITION stProd = new SDK_PRODUCTION_DEFNITION();

		boolean zRetTemp = INetSDK.QueryProductionDefinition(
				__LoginHandle, stProd, 3000);
		if (!zRetTemp)
		{
			strLog += "\nFailed to query definition.....";
			ToolKits.showMessage(this, strLog);

			return;
		}

		int nVideoInChannel = stProd.nVideoInChannel;


		Integer stIntRet = new Integer(0);
		Integer stIntRetLen = new Integer(0);
		strLog += "\nTesting QueryRemotDevState...";
		int channelID = 0;
		for (int i=0; i<nVideoInChannel; i++)
		{
			boolean zRet = INetSDK.QueryRemotDevState(
						__LoginHandle,
						FinalVar.SDK_DEVSTATE_ONLINE,
						channelID, stIntRet,
						stIntRetLen, 3000);

			strLog += zRet;
			strLog += "\nThe remote ipc state on channel:";

			if (1 == stIntRet)
			{
				strLog += "Online";
			}
			else
			{
				strLog += "OffLine";
			}

			ToolKits.showMessage(this, strLog);
		}

		/*SDK_CARD_QUERY_EN stQuery = new SDK_CARD_QUERY_EN();
		strLog += "\nTesting QuerySystemInfo...";
		zRet = INetSDK.QuerySystemInfo(__LoginHandle,
				SDK_SYS_ABILITY.ABILITY_CARD_QUERY, stQuery, 3000);
		strLog += zRet;

		char cBuf[] = new char[512];
		Integer stErr = new Integer(0);
		strLog += "\nTesting QueryNewSystemInfo...";
		zRet = INetSDK.QueryNewSystemInfo(__LoginHandle,
				"magicBox.getCPUUsage", channelID,
				cBuf, stErr, 3000);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);*/

		// 查询门禁组数
    	CFG_CAP_ACCESSCONTROL accessCtr = new CFG_CAP_ACCESSCONTROL();
    	String szCommand = FinalVar.CFG_CAP_CMD_ACCESSCONTROLMANAGER;
    	char szOutBuffer[] = new char[1024];
    	Integer stError = new Integer(0);
    	boolean bQu = INetSDK.QueryNewSystemInfo(__LoginHandle, szCommand, 0, szOutBuffer, stError, 5000);

    	if(bQu) {
    		bQu = INetSDK.ParseData(szCommand, szOutBuffer, accessCtr, null);
    		if(bQu){
    			ToolKits.writeLog("门禁组数：" + accessCtr.nAccessControlGroups);
    		} else {
    			ToolKits.writeErrorLog("ParseData Failed!" );
    		}
    	} else {
    		ToolKits.writeErrorLog("QueryNewSystemInfo Failed!" );
    	}
	}

	void TestPtz() {
		String strLog = "";

		PTZ_OPT_ATTR stArrt = new PTZ_OPT_ATTR();
		strLog += "\nTesting GetPtzOptAttr...";
		boolean zRet = INetSDK.GetPtzOptAttr(__LoginHandle,
				0, stArrt, 3000);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestLoadPic() {
		String strLog = "";
		int channelID = 0;
		 TestfAnalyzerDataCallBack stCb = new TestfAnalyzerDataCallBack();
		strLog += "\nTesting RealLoadPicture...";
		long lRealLoad = INetSDK.RealLoadPicture(
				__LoginHandle,
				channelID, FinalVar.EVENT_IVS_ALL,
				stCb);
		strLog += lRealLoad;

		strLog += "\nTesting StopLoadPic...";
		boolean zRet = INetSDK.StopLoadPic(lRealLoad);
		strLog += zRet;

		boolean zNeeded = true;
		strLog += "\nTesting RealLoadPictureEx...";
		lRealLoad = INetSDK.RealLoadPictureEx(__LoginHandle,
				channelID, FinalVar.EVENT_IVS_ALL,
				zNeeded, stCb, null);
		strLog += lRealLoad;

		strLog += "\nTesting StopLoadPic...";
		zRet = INetSDK.StopLoadPic(lRealLoad);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}
	private long _RealLoadHandle1 = 0;

	//订阅智能事件
	void TestLoadPic1() {
		String strLog = "";
		int channelID = 0;
		TestfAnalyzerDataCallBack stCb = new TestfAnalyzerDataCallBack();

		boolean zNeeded = true;
		_RealLoadHandle1 = INetSDK.RealLoadPictureEx(__LoginHandle,
				channelID, FinalVar.EVENT_IVS_ALL,
				zNeeded, stCb, null);
		if(_RealLoadHandle1 != 0)
		{
			ToolKits.writeLog("RealLoadPictureEx success");
		}
		else {
			ToolKits.writeLog("RealLoadPictureEx failed,LastError:" + INetSDK.GetLastError());
		}
	}
	//取消订阅智能事件
	void StopLoadPic()
	{
		if (_RealLoadHandle1 != 0)
		{
			boolean bRet = INetSDK.StopLoadPic(_RealLoadHandle1);
			if (bRet)
			{
				ToolKits.writeLog("StopLoadPic success");
			}
			else
			{
				ToolKits.writeLog("StopLoadPic failed, LastError:" + INetSDK.GetLastError());
			}
		}
	}

	void TestFileBurned() {
		String strLog = "";

		boolean zRet;
		/*
		 * SDK_BURNING_DEVINFO stBurnDevInfo = new SDK_BURNING_DEVINFO(); strLog
		 * += "\nTesting QueryDevState..."; zRet = INetSDK.QueryDevState(
		 * __LoginHandle, INetSDK.SDK_DEVSTATE_BURNING_DEV,
		 * stBurnDevInfo, 1000); strLog += zRet;
		 */

		NET_IN_FILEBURNED_START stInStart = new NET_IN_FILEBURNED_START();
		stInStart.szMode = "append";
		stInStart.szDeviceName = "/dev/sda"; // stBurnDevInfo.stDevs[0].dwDriverName.toString();
		stInStart.szFilename = "/mnt/sdcard/NetSDK/collectorsdk.bat";
		stInStart.cbBurnPos = new TestfBurnFileCallBack();
		NET_OUT_FILEBURNED_START stOutStart = new NET_OUT_FILEBURNED_START();
		strLog += "\nTesting StartUploadFileBurned...";
		long lFileBurned = INetSDK.StartUploadFileBurned(
				__LoginHandle, stInStart, stOutStart, 1000);
		strLog += lFileBurned;

		strLog += "\nTesting StartUploadFileBurned...";
		zRet = INetSDK.SendFileBurned(lFileBurned);
		strLog += zRet;

		strLog += "\nTesting StopUploadFileBurned...";
		zRet = INetSDK.StopUploadFileBurned(lFileBurned);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestQProdDef() {
		String strLog = "";

		SDK_PRODUCTION_DEFNITION stProd = new SDK_PRODUCTION_DEFNITION();
		strLog += "\nTesting QueryProductionDefinition...";
		boolean zRet = INetSDK.QueryProductionDefinition(
				__LoginHandle, stProd, 1000);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestMatrix() {
		String strLog = "";

		SDK_MATRIX_CARD_LIST stCardList = new SDK_MATRIX_CARD_LIST();
		/*		boolean zRet = INetSDK.QueryMatrixCardInfo(
				__LoginHandle, stCardList, 3000);

		for (int i = 0; i < stCardList.nCount; i++) {
			ToolKits.writeLog("Inchannel" + stCardList.stuCards[i].nAudioInChn);
		}

		SDK_SPLIT_CAPS stCaps = new SDK_SPLIT_CAPS();
		zRet = INetSDK.GetSplitCaps(__LoginHandle,
				stCardList.stuCards[0].nVideoDecChnMin, stCaps, 1000);   // 通道号必须是最小值
*/
		SDK_SPLIT_MODE_INFO stMode = new SDK_SPLIT_MODE_INFO();
		stMode.emSplitMode = SDK_SPLIT_MODE.SDK_SPLIT_4;
		boolean zRet = INetSDK.SetSplitMode(__LoginHandle,
				stCardList.stuCards[0].nVideoDecChnMin, stMode, 1000);
		if(zRet) {
			ToolKits.writeLog("SetSplitMode Succeed!");
		} else {
			ToolKits.writeErrorLog("SetSplitMode Failed!" );
		}
		boolean bRet = INetSDK.GetSplitMode(__LoginHandle,
				stCardList.stuCards[0].nVideoDecChnMin, stMode, 1000);
		if(bRet) {
			ToolKits.writeLog("GetSplitMode Succeed!" + stMode.emSplitMode);
		} else {
			ToolKits.writeErrorLog("GetSplitMode Failed!" );
		}

/*		SDK_SPLIT_SOURCE stSplitSrc[] = new SDK_SPLIT_SOURCE[16];
		for (int i = 0; i < 16; i++) {
			stSplitSrc[i] = new SDK_SPLIT_SOURCE();
		}
		Integer stRetCount = new Integer(0);
		zRet = INetSDK.GetSplitSource(__LoginHandle,
				stCardList.stuCards[0].nVideoDecChnMin, -1, stSplitSrc,
				stRetCount, 1000);

		zRet = INetSDK.SetSplitSource(__LoginHandle,
				stCardList.stuCards[0].nVideoDecChnMin, -1, stSplitSrc,
				stRetCount.intValue(), 1000);

		ToolKits.showMessage(this, strLog);*/
	}

	void TestCfgEncode() {
		SDKDEV_SYSTEM_ATTR_CFG stSystemArr[] = new SDKDEV_SYSTEM_ATTR_CFG[1];
		stSystemArr[0] = new SDKDEV_SYSTEM_ATTR_CFG();
		Integer stRet = new Integer(0);
		boolean zRet = INetSDK.GetDevConfig(__LoginHandle,
				FinalVar.SDK_DEV_DEVICECFG, -1, stSystemArr, stRet, 3000);
		if (zRet) {
			CFG_ENCODE_INFO stEncInfo[] = new CFG_ENCODE_INFO[stSystemArr[0].byVideoCaptureNum];
			CFG_DSPENCODECAP_INFO stDspEncCap[] = new CFG_DSPENCODECAP_INFO[stSystemArr[0].byVideoCaptureNum];
			// CFG_RECORD_INFO stRecord[] = new
			// CFG_RECORD_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_ALARMIN_INFO stAlarmIn[] = new
			// CFG_ALARMIN_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_NETALARMIN_INFO stNetAlarmIn[] = new
			// CFG_NETALARMIN_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_MOTION_INFO stMotion[] = new
			// CFG_MOTION_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_SHELTER_INFO stShelter[] = new
			// CFG_SHELTER_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_VIDEOLOST_INFO stLossDetect[] = new
			// CFG_VIDEOLOST_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_STORAGENOEXIST_INFO[] stStorageNotExist = new
			// CFG_STORAGENOEXIST_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_STORAGEFAILURE_INFO[] stStorageFailure = new
			// CFG_STORAGEFAILURE_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_STORAGELOWSAPCE_INFO[] stStorageLowSpace = new
			// CFG_STORAGELOWSAPCE_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_NETABORT_INFO[] stNetAbort = new
			// CFG_NETABORT_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_IPCONFLICT_INFO[] stIPConflict = new
			// CFG_IPCONFLICT_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_WATERMARK_INFO[] stWaterMark = new
			// CFG_WATERMARK_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_ANALYSERULES_INFO[] stVideoAnalyseRule = new
			// CFG_ANALYSERULES_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_RAINBRUSH_INFO[] stRainBrush = new
			// CFG_RAINBRUSH_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_DEV_DISPOSITION_INFO[] stGeneral = new
			// CFG_DEV_DISPOSITION_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_ATMMOTION_INFO[] stFetchMoneyOverTime = new
			// CFG_ATMMOTION_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_DEVICESTATUS_INFO[] stDeviceStatus = new
			// CFG_DEVICESTATUS_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_IPSERVER_STATUS[] stIpsServer = new
			// CFG_IPSERVER_STATUS[stSystemArr.byVideoCaptureNum];
			// CFG_VIDEOENCODEROI_INFO[] stVideoEncodeROI = new
			// CFG_VIDEOENCODEROI_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_RTSP_INFO_OUT[] stRTSP = new
			// CFG_RTSP_INFO_OUT[stSystemArr.byVideoCaptureNum];
			// CFG_VIDEODIAGNOSIS_GLOBAL[] stVideoDiagnosisGlobal = new
			// CFG_VIDEODIAGNOSIS_GLOBAL[stSystemArr.byVideoCaptureNum];
			// CFG_TRAFFIC_WORKSTATE_INFO[] stWorkState = new
			// CFG_TRAFFIC_WORKSTATE_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_STORAGEGROUP_INFO[] stStorageDevGroup = new
			// CFG_STORAGEGROUP_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_RECORDTOGROUP_INFO[] stRecordToGroup = new
			// CFG_RECORDTOGROUP_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_ANALYSERULES_INFO[] stIVSFramRule = new
			// CFG_ANALYSERULES_INFO[stSystemArr.byVideoCaptureNum];
			// CFG_METADATA_SERVER[] stMetaDataServer = new
			// CFG_METADATA_SERVER[stSystemArr.byVideoCaptureNum];
//			 AV_CFG_RecordMode[] stRecordMode = new
//			 AV_CFG_RecordMode[stSystemArr.byVideoCaptureNum];
			// AV_CFG_VideoOutAttr[] stVideoOut = new
			// AV_CFG_VideoOutAttr[stSystemArr.byVideoCaptureNum];
//			 AV_CFG_RemoteDevice[] stRemoteDevice = new
//			 AV_CFG_RemoteDevice[stSystemArr.byVideoCaptureNum];
			// AV_CFG_RemoteChannel[] stRemoteChannel = new
			// AV_CFG_RemoteChannel[stSystemArr.byVideoCaptureNum];
			// AV_CFG_RemoteChannel[] stRaid = new
			// AV_CFG_RemoteChannel[stSystemArr.byVideoCaptureNum];
			// AV_CFG_RecordSource[] stRecordSource = new
			// AV_CFG_RecordSource[stSystemArr.byVideoCaptureNum];
			// AV_CFG_StorageGroup[] stStorageGroup = new
			// AV_CFG_StorageGroup[stSystemArr.byVideoCaptureNum];
			// AV_CFG_Language[] stLanguage = new
			// AV_CFG_Language[stSystemArr.byVideoCaptureNum];
			// AV_CFG_AccessFilter[] stAccessFilter = new
			// AV_CFG_AccessFilter[stSystemArr.byVideoCaptureNum];
			// AV_CFG_AutoMaintain[] stAutoMaintain = new
			// AV_CFG_AutoMaintain[stSystemArr.byVideoCaptureNum];
			// CFG_NAS_INFO_EX[] stNAS = new
			// CFG_NAS_INFO_EX[stSystemArr.byVideoCaptureNum];
			AV_CFG_ChannelName stChnName[] = new AV_CFG_ChannelName[stSystemArr[0].byVideoCaptureNum];

			for (int i = 0; i < stSystemArr[0].byVideoCaptureNum; i++) {
				stEncInfo[i] = new CFG_ENCODE_INFO();
				stDspEncCap[i] = new CFG_DSPENCODECAP_INFO();
				// stRecord[i] = new CFG_RECORD_INFO();
				// stAlarmIn[i] = new CFG_ALARMIN_INFO();
				// stNetAlarmIn[i] = new CFG_NETALARMIN_INFO();
				// stLossDetect[i] = new CFG_VIDEOLOST_INFO();
				// stStorageNotExist[i] = new CFG_STORAGENOEXIST_INFO();
				// stStorageFailure[i] = new CFG_STORAGEFAILURE_INFO();
				// stStorageLowSpace[i] = new CFG_STORAGELOWSAPCE_INFO();
				// stNetAbort[i] = new CFG_NETABORT_INFO();
				// stIPConflict[i] = new CFG_IPCONFLICT_INFO();
				// stWaterMark[i] = new CFG_WATERMARK_INFO();
				// stVideoAnalyseRule[i] = new CFG_ANALYSERULES_INFO();
				// stRainBrush[i] = new CFG_RAINBRUSH_INFO();
				// stFetchMoneyOverTime[i] = new CFG_ATMMOTION_INFO();
				// stDeviceStatus[i] = new CFG_DEVICESTATUS_INFO();
				// stVideoEncodeROI[i] = new CFG_VIDEOENCODEROI_INFO();
				// stRTSP[i] = new CFG_RTSP_INFO_OUT();
				// stVideoDiagnosisGlobal[i] = new CFG_VIDEODIAGNOSIS_GLOBAL();
				// stWorkState[i] = new CFG_TRAFFIC_WORKSTATE_INFO();
				// stStorageDevGroup[i] = new CFG_STORAGEGROUP_INFO(2048);
				// stRecordToGroup[i] = new CFG_RECORDTOGROUP_INFO();
				// stMetaDataServer[i] = new CFG_METADATA_SERVER();
				// stRecordMode[i] = new AV_CFG_RecordMode();
				// stVideoOut[i] = new AV_CFG_VideoOutAttr();
				// stRemoteDevice[i] = new AV_CFG_RemoteDevice(8);
				// stRemoteChannel[i] = new AV_CFG_RemoteChannel();
				// stRaid[i] = new AV_CFG_RemoteChannel();
				// stRecordSource[i] = new AV_CFG_RecordSource();
				// stStorageGroup[i] = new AV_CFG_StorageGroup();
				// stLanguage[i] = new AV_CFG_Language();
				// stAccessFilter[i] = new AV_CFG_AccessFilter();
				// stAutoMaintain[i] = new AV_CFG_AutoMaintain();
				// stNAS[i] = new CFG_NAS_INFO_EX();
				// stMotion[i] = new CFG_MOTION_INFO();
				// stShelter[i] = new CFG_SHELTER_INFO();
				stChnName[i] = new AV_CFG_ChannelName();
			}

			for (int i = 0; i < stSystemArr[0].byVideoCaptureNum; i++) {
				boolean zRetEnc;

				SDKDEV_DSP_ENCODECAP stDspCap = new SDKDEV_DSP_ENCODECAP();
				zRetEnc = INetSDK.QueryDevState(
						__LoginHandle,
						FinalVar.SDK_DEVSTATE_DSP, stDspCap, 3000);
				if (!zRetEnc) {
					zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_ENCODE,
							stEncInfo[i], __LoginHandle, i,
							4096);
					if (!zRetEnc) {
						ToolKits.showErrorMessage(this, "GetDevConfig failed, "
								+ FinalVar.CFG_CMD_ENCODE + ", chn: " + i);
					} else {
						zRetEnc = ToolKits.SetDevConfig(
								FinalVar.CFG_CMD_ENCODE, stEncInfo[i],
								__LoginHandle, i, 4096);
					}
				}
				// NAS
				/*
				 * zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_NASEX,
				 * stNAS[i], __LoginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_NASEX + ", chn: "
				 * + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_NASEX, stNAS[i],
				 * __LoginHandle, i, 4096); }
				 */
				/*
				 * //AutoMaintain zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_AUTOMAINTAIN,
				 * stAutoMaintain[i], __LoginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_AUTOMAINTAIN +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_AUTOMAINTAIN,
				 * stAutoMaintain[i], __LoginHandle, i,
				 * 4096); }
				 */
				/*
				 * //AccessFilter zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_ACCESSFILTER,
				 * stAccessFilter[i], __LoginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_ACCESSFILTER +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_ACCESSFILTER,
				 * stAccessFilter[i], __LoginHandle, i,
				 * 4096); }
				 */
				/*
				 * //Language zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_LANGUAGE,
				 * stLanguage[i], __LoginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_LANGUAGE +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_LANGUAGE,
				 * stLanguage[i], __LoginHandle, i, 4096); }
				 */
				/*
				 * //StorageGroup zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_STORAGEGROUP,
				 * stStorageGroup[i], __LoginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_STORAGEGROUP +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_STORAGEGROUP,
				 * stStorageGroup[i], __LoginHandle, i,
				 * 4096); }
				 */
				/*
				 * //RecordSource zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_RECORDSOURCE,
				 * stRecordSource[i], __LoginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_RECORDSOURCE +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_RECORDSOURCE,
				 * stRecordSource[i], __LoginHandle, i,
				 * 4096); }
				 */
				/*
				 * //Raid zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_RAID,
				 * stRaid[i], __LoginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_RAID + ", chn: " +
				 * i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_RAID, stRaid[i],
				 * __LoginHandle, i, 4096); }
				 */
				/*
				 * //RemoteChannel zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_REMOTECHANNEL,
				 * stRemoteChannel[i], __LoginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_REMOTECHANNEL +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_REMOTECHANNEL,
				 * stRemoteChannel[i], __LoginHandle, i,
				 * 4096); }
				 */
				/*
				 * //RemoteDevice zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_REMOTEDEVICE,
				 * stRemoteDevice[i], __LoginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_REMOTEDEVICE +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_REMOTEDEVICE,
				 * stRemoteDevice[i], __LoginHandle, i,
				 * 4096); }
				 */
				/*
				 * //VideoOut zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEOOUT,
				 * stVideoOut[i], __LoginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_VIDEOOUT +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEOOUT,
				 * stVideoOut[i], __LoginHandle, i, 4096); }
				 */
				/*
				 * //RecordMode zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_RECORDMODE,
				 * stRecordMode[i], __LoginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_RECORDMODE +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_RECORDMODE,
				 * stRecordMode[i], __LoginHandle, i, 4096);
				 * }
				 */
				/*
				 * //MetaDataServer zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_MD_SERVER,
				 * stMetaDataServer[i], __LoginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_MD_SERVER +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_MD_SERVER,
				 * stMetaDataServer[i], __LoginHandle, i,
				 * 4096); }
				 */
				/*
				 * //IVSFramRule zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_IVSFRAM_RULE,
				 * stIVSFramRule[i], __LoginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_IVSFRAM_RULE +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_IVSFRAM_RULE,
				 * stIVSFramRule[i], __LoginHandle, i, 4096);
				 * }
				 */
				/*
				 * //RecordToGroup zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_RECORDTOGROUP,
				 * stRecordToGroup[i], __LoginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_RECORDTOGROUP +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_RECORDTOGROUP,
				 * stRecordToGroup[i], __LoginHandle, i,
				 * 4096); }
				 */
				/*
				 * zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_HDVR_DSP,
				 * stDspEncCap[i], __LoginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_HDVR_DSP +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_HDVR_DSP,
				 * stDspEncCap[i], __LoginHandle, i, 4096); }
				 *
				 * zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_RECORD,
				 * stRecord[i], __LoginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_RECORD + ", chn: "
				 * + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_RECORD, stRecord[i],
				 * __LoginHandle, i, 4096); }
				 *
				 * zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_ALARMINPUT,
				 * stAlarmIn[i], __LoginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_ALARMINPUT +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_ALARMINPUT,
				 * stAlarmIn[i], __LoginHandle, i, 4096); }
				 */

				/*
				 * //NetAlarm zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_NETALARMINPUT,
				 * stNetAlarmIn[i], __LoginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_NETALARMINPUT +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_NETALARMINPUT,
				 * stNetAlarmIn[i], __LoginHandle, i, 4096);
				 * }
				 */
				/*
				 * //LossDetect stLossDetect[i].nChannelID = i; zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEOLOST,
				 * stLossDetect[i], __LoginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_VIDEOLOST +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEOLOST,
				 * stLossDetect[i], __LoginHandle, i, 4096);
				 * }
				 */
				/*
				 * //StorageNotExist //stStorageNotExist[i].bEnable = true;
				 * zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_STORAGENOEXIST,
				 * stStorageNotExist[i], __LoginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_STORAGENOEXIST +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_STORAGENOEXIST,
				 * stStorageNotExist[i], __LoginHandle, i,
				 * 4096); }
				 */
				/*
				 * //StorageFailure zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_STORAGEFAILURE,
				 * stStorageFailure[i], __LoginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_STORAGEFAILURE +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_STORAGEFAILURE,
				 * stStorageFailure[i], __LoginHandle, i,
				 * 4096); }
				 */
				/*
				 * //StorageLowSpace zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_STORAGELOWSAPCE,
				 * stStorageLowSpace[i], __LoginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_STORAGELOWSAPCE +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_STORAGELOWSAPCE,
				 * stStorageLowSpace[i], __LoginHandle, i,
				 * 4096); }
				 */
				/*
				 * //NetAbort zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_NETABORT,
				 * stNetAbort[i], __LoginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_NETABORT +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_NETABORT,
				 * stNetAbort[i], __LoginHandle, i, 4096); }
				 */
				/*
				 * //IPConflict zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_IPCONFLICT,
				 * stIPConflict[i], __LoginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_IPCONFLICT +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_IPCONFLICT,
				 * stIPConflict[i], __LoginHandle, i, 4096);
				 * }
				 */
				/*
				 * //WaterMark zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_WATERMARK,
				 * stWaterMark[i], __LoginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_WATERMARK +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_WATERMARK,
				 * stWaterMark[i], __LoginHandle, i, 4096); }
				 */
				/*
				 * //VideoAnalyseRule zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_ANALYSERULE,
				 * stVideoAnalyseRule[i], __LoginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_ANALYSERULE +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_ANALYSERULE,
				 * stVideoAnalyseRule[i], __LoginHandle, i,
				 * 4096); }
				 */
				/*
				 * //RainBrush stRainBrush[i].bEnable = true; zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_RAINBRUSH,
				 * stRainBrush[i], __LoginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_RAINBRUSH +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_RAINBRUSH,
				 * stRainBrush[i], __LoginHandle, i, 4096); }
				 */
				/*
				 * //General zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_DEV_GENERRAL,
				 * stGeneral[i], __LoginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_DEV_GENERRAL +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_DEV_GENERRAL,
				 * stGeneral[i], __LoginHandle, i, 4096); }
				 */
				/*
				 * //FetchMoneyOverTime zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_ATMMOTION,
				 * stFetchMoneyOverTime[i], __LoginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_ATMMOTION +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_ATMMOTION,
				 * stFetchMoneyOverTime[i], __LoginHandle, i,
				 * 4096); }
				 */
				/*
				 * //DeviceStatus zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_DEVICESTATUS,
				 * stDeviceStatus[i], __LoginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_DEVICESTATUS +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_DEVICESTATUS,
				 * stDeviceStatus[i], __LoginHandle, i,
				 * 4096); }
				 */
				/*
				 * //IpsServer zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_IPSSERVER,
				 * stIpsServer[i], __LoginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_IPSSERVER +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_IPSSERVER,
				 * stIpsServer[i], __LoginHandle, i, 4096); }
				 */
				/*
				 * //VideoEncodeROI zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEOENCODEROI,
				 * stVideoEncodeROI[i], __LoginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_VIDEOENCODEROI +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEOENCODEROI,
				 * stVideoEncodeROI[i], __LoginHandle, i,
				 * 4096); }
				 */
				/*
				 * //RTSP zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_RTSP,
				 * stRTSP[i], __LoginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_RTSP + ", chn: " +
				 * i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_RTSP, stRTSP[i],
				 * __LoginHandle, i, 4096); }
				 */
				/*
				 * //VideoDiagnosisGlobal zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEODIAGNOSIS_GLOBAL,
				 * stVideoDiagnosisGlobal[i], __LoginHandle,
				 * i, 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " +
				 * FinalVar.CFG_CMD_VIDEODIAGNOSIS_GLOBAL + ", chn: " + i); }
				 * else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEODIAGNOSIS_GLOBAL,
				 * stVideoDiagnosisGlobal[i], __LoginHandle,
				 * i, 4096); }
				 */
				/*
				 * //WorkState zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_TRAFFIC_WORKSTATE,
				 * stWorkState[i], __LoginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_TRAFFIC_WORKSTATE
				 * + ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_TRAFFIC_WORKSTATE,
				 * stWorkState[i], __LoginHandle, i, 4096); }
				 */
				/*
				 * //StorageDevGroup zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_STORAGEDEVGROUP,
				 * stStorageDevGroup[i], __LoginHandle, i,
				 * 4096); if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_STORAGEDEVGROUP +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_STORAGEDEVGROUP,
				 * stStorageDevGroup[i], __LoginHandle, i,
				 * 4096); }
				 */

				/*
				 * zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEOLOST,
				 * stLossDetect[i], __LoginHandle, i, 4096);
				 * if (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_VIDEOLOST +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEOLOST,
				 * stLossDetect[i], __LoginHandle, i, 4096);
				 * }
				 */

				/*
				 * zRetEnc =
				 * ToolKits.GetDevConfig(FinalVar.CFG_CMD_MOTIONDETECT,
				 * stMotion[i], __LoginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_MOTIONDETECT +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_MOTIONDETECT,
				 * stMotion[i], __LoginHandle, i, 4096); }
				 *
				 * zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEOBLIND,
				 * stShelter[i], __LoginHandle, i, 4096); if
				 * (!zRetEnc) { ToolKits.showErrorMessage(this,
				 * "GetDevConfig failed, " + FinalVar.CFG_CMD_VIDEOBLIND +
				 * ", chn: " + i); } else { zRetEnc =
				 * ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEOBLIND,
				 * stShelter[i], __LoginHandle, i, 4096); }
				 */

				zRetEnc = ToolKits
						.GetDevConfig(FinalVar.CFG_CMD_CHANNELTITLE,
								stChnName[i], __LoginHandle,
								i, 4096);
				if (!zRetEnc) {
					ToolKits.showErrorMessage(this, "GetDevConfig failed, "
							+ FinalVar.CFG_CMD_CHANNELTITLE + ", chn: " + i);
				} else {
					String strName = new String(stChnName[i].szName);
					zRetEnc = ToolKits.SetDevConfig(
							FinalVar.CFG_CMD_CHANNELTITLE, stChnName[i],
							__LoginHandle, i, 4096);
				}
			}
		}
	}

	void TestDevState() {

		final int numChannel = NetSDKApplication.getInstance().getDeviceInfo().nChanNum;

		// 耗时处理建议异步去做，不要在UI线程处理
		new ToolKits.SimpleAsyncTask<Integer>() {
			 @Override
			    protected void onPreExecute() {
			            super.onPreExecute();
			    }

			     @Override
			      protected  Integer doInBackground(Void... params) {
			    		String strLog = "";
			    	 	strLog += "\nTesting the state of the remote IPC...";

			    		for (int i = 0; i < numChannel; i++)
			    		{
			    		    boolean zRet = false;
			    		    SDKDEV_VIRTUALCAMERA_STATE_INFO stDevVirtualCam = new SDKDEV_VIRTUALCAMERA_STATE_INFO();
			    		    stDevVirtualCam.nChannelID = i;
			    			zRet = INetSDK.QueryDevState(
			    								__LoginHandle,
			    								FinalVar.SDK_DEVSTATE_VIRTUALCAMERA,
			    								stDevVirtualCam,
			    								3000);

			    			if ((stDevVirtualCam.szDeviceType[0] != 0) && (true == zRet))
			    			{
			    				strLog += "\nThe state of the remote ipc on channel ";
				    			strLog += i;
				    			strLog += " is ";

				    			if (CONNECT_STATE.CONNECT_STATE_UNCONNECT == stDevVirtualCam.emConnectState)
				    			{
				    				strLog += "offLine";
				    			}
				    			else if (CONNECT_STATE.CONNECT_STATE_CONNECTING == stDevVirtualCam.emConnectState)
				    			{
				    				strLog += "connceting";
				    			}
				    			else if (CONNECT_STATE.CONNECT_STATE_CONNECTED == stDevVirtualCam.emConnectState)
				    			{
				    				strLog += "onLine";
				    			}
				    			else
				    			{
				    				strLog += "stateError";
				    			}
						    	ToolKits.writeLog(strLog);
						    	strLog = "";
			    			}
			    		}
			    		return 0;

			     }
			     @Override
			     protected void onPostExecute(Integer result) {

			      }
		}.execute();

	}

	void TestTransmitInfo(){

		String strLog = "";

		strLog += "\nTesting TransmitInfo...";

		NET_IN_ATTACH_TRANSMIT_INFO pstInParam=new NET_IN_ATTACH_TRANSMIT_INFO();

		CB_fAsyncTransmitInfoCallBack cbTransmitInfo=
				new TestfAsyncTransmitInfoCallBack();
		pstInParam.cbTransmitInfo=cbTransmitInfo;

		pstInParam.szInJsonBuffer = new byte[256];
		pstInParam.dwInJsonBufferSize = 256;

		String paramsJson = "{\"method\": \"Things.attach\",\"Params\": {\"DeviceID\": \"2\",\"ProductID\": \"001\",\"Topics\": [\"*\"]}}";

		System.arraycopy(paramsJson.getBytes(), 0, pstInParam.szInJsonBuffer, 0, paramsJson.getBytes().length);

		NET_OUT_ATTACH_TRANSMIT_INFO pstOutParam=new NET_OUT_ATTACH_TRANSMIT_INFO();

		pstOutParam.dwOutBufferSize =  1024;
		pstOutParam.szOutBuffer = new byte[1024];

		long lAttachHandle
				= INetSDK.AttachTransmitInfo(__LoginHandle, pstInParam, pstOutParam, 5000);

		if(lAttachHandle==0){
			ToolKits.writeErrorLog("AttachTransmitInfo Failed!" );
			return;
		}else {
			ToolKits.writeLog("AttachTransmitInfo success!" );
		}
		strLog += "\nTesting AttachTransmitInfo...";


		byte[] jsonBy=new byte[pstOutParam.dwOutJsonLen];
		System.arraycopy(pstOutParam.szOutBuffer,0,jsonBy,0,jsonBy.length);
		String jsonStr = new String(jsonBy);

		// 当请阅某一主题时会返回一个SID，这个ID用于用户取消订阅或者管理上报的数据。
		// 返回示例 {session': '36jk8pWoa07dea792692606585', 'params': {'SID': 11}, 'result': True, 'id': 13}
		JSONObject json = null;
		String sid = null;
		try {
			json = new JSONObject(jsonStr);
			JSONObject params = json.getJSONObject("params");
			sid = params.getString("SID");
		} catch (JSONException e) {
			e.printStackTrace();
		}


		NET_IN_DETACH_TRANSMIT_INFO inputDetach=new NET_IN_DETACH_TRANSMIT_INFO();

		paramsJson = "{\"params\": {\"SID\": "+ sid +"}, \"method\": \"Things.detach\"}";

		inputDetach.szInJsonBuffer = new byte[256];
		inputDetach.dwInJsonBufferSize = 256;

		System.arraycopy(paramsJson.getBytes(), 0, inputDetach.szInJsonBuffer, 0, paramsJson.getBytes().length);

		NET_OUT_DETACH_TRANSMIT_INFO outputDetach=new NET_OUT_DETACH_TRANSMIT_INFO();

		outputDetach.szOutBuffer = new byte[256];
		outputDetach.dwOutBufferSize = 256;

		boolean isSuccess
				= INetSDK.DetachTransmitInfo(lAttachHandle, inputDetach, outputDetach, 5000);
		if(isSuccess){
			ToolKits.writeLog("DetachTransmitInfo success!" );
		}else {
			ToolKits.writeErrorLog("DetachTransmitInfo Failed!" );
		}

		ToolKits.showMessage(this, strLog);

	}

	void TestReboot() {
		String strLog = "";

		strLog += "\nTesting RebootDev...";
		boolean zRet = INetSDK.RebootDev(__LoginHandle);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}

	void TestShutDown() {
		String strLog = "";

		strLog += "\nTesting ShutDownDev...";
		boolean zRet = INetSDK.ShutDownDev(__LoginHandle);
		strLog += zRet;

		ToolKits.showMessage(this, strLog);
	}


	void TestQueryPTZCaps(){
		CFG_PTZ_PROTOCOL_CAPS_INFO eventManager = new CFG_PTZ_PROTOCOL_CAPS_INFO();
		String szCommand = FinalVar.CFG_CAP_CMD_PTZ;
		char szOutBuffer[] = new char[4096];
		Integer stError = new Integer(0);
		int nChannelID = 2;
		if (INetSDK.QueryNewSystemInfo(__LoginHandle, szCommand, nChannelID, szOutBuffer, stError, 5000)) {
			ToolKits.writeLog("QueryPTZCaps Succeed!");
			if (INetSDK.ParseData(szCommand, szOutBuffer, eventManager, null)) {
				ToolKits.writeLog("ParseData Succeed!" );
				ToolKits.writeLog("bWiper = " + eventManager.bWiper);
				ToolKits.writeLog("bAux = " + eventManager.bAux);
				if(eventManager.bAux){
					for(int i = 0; i < eventManager.szAuxs.length; i ++){
						ToolKits.writeLog("szAux[" + i + "] = " + new String(eventManager.szAuxs[i]).trim());
					}
				}
				ToolKits.writeLog("bPan = " + eventManager.bPan);
				ToolKits.writeLog("bTile = " + eventManager.bTile);
				ToolKits.writeLog("bZoom = " + eventManager.bZoom);
				ToolKits.writeLog("bIris = " + eventManager.bIris);
				ToolKits.writeLog("bPreset = " + eventManager.bPreset);
				ToolKits.writeLog("bRemovePreset = " + eventManager.bRemovePreset);
				ToolKits.writeLog("nUnSupportDirections = " + eventManager.nUnSupportDirections);
				for(int i = 0; i < eventManager.nUnSupportDirections; i ++){
					ToolKits.writeLog("emUnSupportDirections["+ i + "] = " + eventManager.emUnSupportDirections[i]);
				}
			}else {
				ToolKits.writeErrorLog("ParseData Failed!" );
			}
		} else {
			ToolKits.writeErrorLog("QueryPTZCaps Failed!" );
		}
	}

	void TestNewKeyBoard(int type) {
		NKB_PARAM stPram = new NKB_PARAM();
		stPram.bAddressCode = (byte) 0xFF;

		stPram.bKeyStatus = 0;
		boolean zRet = INetSDK.ControlDevice(__LoginHandle,
				type, stPram, 3000);
		stPram.bKeyStatus = 1;
		zRet = INetSDK.ControlDevice(__LoginHandle, type,
				stPram, 3000);
	}

	void TestOpenStrobe() {
		NET_CTRL_OPEN_STROBE stPram = new NET_CTRL_OPEN_STROBE();
		stPram.nChannelId = 0;
		System.arraycopy("A666".getBytes(), 0, stPram.szPlateNumber, 0, "A666".getBytes().length);
		stPram.emOpenType = EM_OPEN_STROBE_TYPE.EM_OPEN_STROBE_TYPE_MANUAL;
		boolean zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_CTRL_OPEN_STROBE, stPram, 3000);
		if(zRet){
			ToolKits.writeLog("TestOpenStrobe Succeed!!");
		}else{
			ToolKits.writeErrorLog("TestOpenStrobe Failed!!");
		}
	}

	void TestCloseStrobe() {
		NET_CTRL_CLOSE_STROBE stPram = new NET_CTRL_CLOSE_STROBE();
		stPram.nChannelId = 0;
		boolean zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_CTRL_CLOSE_STROBE, stPram, 3000);
		if(zRet){
			ToolKits.writeLog("TestCloseStrobe Succeed!!");
		}else{
			ToolKits.writeErrorLog("TestCloseStrobe Failed!!");
		}
	}

	void TestSetParkInfo() {
		NET_CTRL_SET_PARK_INFO stPram = new NET_CTRL_SET_PARK_INFO();
		stPram.nParkTime = 5;
		System.arraycopy("A666".getBytes(), 0, stPram.szPlateNumber, 0, "A666".getBytes().length);
		boolean zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_CTRL_SET_PARK_INFO, stPram, 3000);
		if(zRet){
			ToolKits.writeLog("TestSetParkInfo Succeed!!");
		}else{
			ToolKits.writeErrorLog("TestSetParkInfo Failed!!");
		}
	}

	void TestControlDev() {
		boolean zRet;

		// zRet = INetSDK.ControlDevice(__LoginHandle,
		// CtrlType.SDK_CTRL_REBOOT, null, 3000);

		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_KEYBOARD_ENTER, null, 3000);
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_KEYBOARD_ESC, null, 3000);
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_KEYBOARD_UP, null, 3000);
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_KEYBOARD_DOWN, null, 3000);
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_KEYBOARD_LEFT, null, 3000);
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_KEYBOARD_RIGHT, null, 3000);
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_KEYBOARD_REC, null, 3000);
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_KEYBOARD_PLAY, null, 3000);
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_KEYBOARD_STOP, null, 3000);
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_KEYBOARD_SLOW, null, 3000);
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_KEYBOARD_FAST, null, 3000);
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_KEYBOARD_PREW, null, 3000);
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_KEYBOARD_NEXT, null, 3000);
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_KEYBOARD_FN1, null, 3000);
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_KEYBOARD_FN2, null, 3000);

		// new network keyboard
		// keyboard login
		NKB_PARAM stPram = new NKB_PARAM();
		stPram.bAddressCode = (byte) 0xFF;
		stPram.bKeyStatus = 1;
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_KEYBOARD_LOGIN, stPram, 3000);

		TestNewKeyBoard(CtrlType.SDK_KEYBOARD_PLAY);
		TestNewKeyBoard(CtrlType.SDK_KEYBOARD_ESC);
		TestNewKeyBoard(CtrlType.SDK_KEYBOARD_ENTER);
		TestNewKeyBoard(CtrlType.SDK_KEYBOARD_ONE);
		TestNewKeyBoard(CtrlType.SDK_KEYBOARD_NINE);
		TestNewKeyBoard(CtrlType.SDK_KEYBOARD_REC);

		stPram.bExtern1 = 5;
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_KEYBOARD_CHNNEL, stPram, 3000);
	}

	// 设置布撤防和旁路状态
	void IntelBrass() {
		boolean zRet;

		// 设置布撤防 [撤防不会失败;有报警源输入,布防失败;有报警联动，布防失败]
		CTRL_ARM_DISARM_PARAM stParam = new CTRL_ARM_DISARM_PARAM();
		stParam.bState = 0;
		stParam.szDevPwd = new String("admin");
		stParam.emSceneMode = NET_SCENE_MODE.NET_SCENE_MODE_INDOOR;
		stParam.szDevID = null;
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_CTRL_ARMED, stParam, 3000);
    	if(zRet) {
    		ToolKits.writeLog("Set Disarm Succeed!");
    	} else {
    		ToolKits.writeErrorLog("Set Disarm Failed!" );
    	}

//		NET_CTRL_ALARM_SUBSYSTEM_SETACTIVE stSubsystem = new NET_CTRL_ALARM_SUBSYSTEM_SETACTIVE();
//		stSubsystem.nChannelId = 0;
//		stSubsystem.bActive = true;
//		zRet = INetSDK
//				.ControlDevice(__LoginHandle,
//						CtrlType.SDK_CTRL_ALARM_SUBSYSTEM_ACTIVE_SET,
//						stSubsystem, 3000);

    	// 设置旁路状态
		NET_CTRL_SET_BYPASS stBypass = new NET_CTRL_SET_BYPASS();
		stBypass.szDevPwd = new String("admin");
		stBypass.emMode = NET_BYPASS_MODE.NET_BYPASS_MODE_NORMAL;
		stBypass.pnLocal = new int[] { 0, 1 };
		stBypass.nLocalCount = stBypass.pnLocal.length;
		stBypass.pnExtended = new int[] { 0, 1 };
		stBypass.nExtendedCount = stBypass.pnExtended.length;
		zRet = INetSDK.ControlDevice(__LoginHandle,
				CtrlType.SDK_CTRL_SET_BYPASS, stBypass, 3000);
    	if(zRet) {
    		ToolKits.writeLog("Set Bypass Succeed!");
    	} else {
    		ToolKits.writeErrorLog("Set Bypass Failed!" );
    	}

//		CTRL_ARM_DISARM_PARAM_EX stCtrlArmParamEx = new CTRL_ARM_DISARM_PARAM_EX();
//		stCtrlArmParamEx.stuIn.emState = NET_ALARM_MODE.NET_ALARM_MODE_ARMING;
//		stCtrlArmParamEx.stuIn.szDevPwd = "admin";
//		stCtrlArmParamEx.stuIn.emSceneMode = NET_SCENE_MODE.NET_SCENE_MODE_INDOOR;
//		zRet = INetSDK.ControlDevice(__LoginHandle,
//				CtrlType.SDK_CTRL_ARMED_EX, stCtrlArmParamEx, 5000);
//
//		CFG_ALARMOUT_INFO stCfgAlarmOutInfo = new CFG_ALARMOUT_INFO();
//		zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_ALARMOUT,
//				stCfgAlarmOutInfo, __LoginHandle,
//				channelID, 10240);
//		zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_ALARMOUT,
//				stCfgAlarmOutInfo, __LoginHandle,
//				channelID, 10240);
//
//		CFG_DEFENCE_AREA_DELAY_INFO stCfgDefenceAreaDelay = new CFG_DEFENCE_AREA_DELAY_INFO();
//		zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_DEFENCE_AREA_DELAY,
//				stCfgDefenceAreaDelay, __LoginHandle, -1,
//				10240);
//		zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_DEFENCE_AREA_DELAY,
//				stCfgDefenceAreaDelay, __LoginHandle, -1,
//				10240);
//
//		CFG_ALARMBELL_INFO stAlarmBell = new CFG_ALARMBELL_INFO();
//		zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_ALARMBELL, stAlarmBell,
//				__LoginHandle,
//				channelID, 10240);
//		zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_ALARMBELL, stAlarmBell,
//				__LoginHandle,
//				channelID, 10240);
//
//		ALARMCTRL_PARAM stOut = new ALARMCTRL_PARAM();
//		stOut.nAlarmNo = 0;
//		stOut.nAction = 1;
//		zRet = INetSDK.ControlDevice(__LoginHandle,
//				CtrlType.SDK_TRIGGER_ALARM_OUT, stOut, 3000);
//
//		NET_CTRL_ALARMBELL stBell = new NET_CTRL_ALARMBELL();
//		stBell.nChannelID = 0;
//		zRet = INetSDK.ControlDevice(__LoginHandle,
//				CtrlType.SDK_CTRL_START_ALARMBELL, stBell, 3000);
//		zRet = INetSDK.ControlDevice(__LoginHandle,
//				CtrlType.SDK_CTRL_STOP_ALARMBELL, stBell, 3000);
//
//		INetSDK.SetDVRMessCallBack(new TestMessageCallBack());
//		Integer stProVer = new Integer(0);
//		zRet = INetSDK.QueryDevState(__LoginHandle,
//				FinalVar.SDK_DEVSTATE_PROTOCAL_VER, stProVer, 1000);
//		if (zRet) {
//			if (stProVer.intValue() < 5) {
//				zRet = INetSDK.StartListen(__LoginHandle);
//				if (!zRet) {
//					ToolKits.showErrorMessage(this, "StartListen failed");
//					return;
//				}
//			} else {
//				zRet = INetSDK.StartListenEx(__LoginHandle);
//				if (!zRet) {
//					ToolKits.showErrorMessage(this, "StartListenEx failed");
//					return;
//				}
//			}
//
//			zRet = INetSDK.StopListen(__LoginHandle);
//		}
	}

	void MobileSubscribe() {
		/* --------------SetMobileSubscribe接口测试----------------------*/
		String strRegisterID = "REGISTER_ID"; // mobile id registration on google GCM service
		String strDevId = "DEVICE_ID"; // you can use this id to discriminate event msg come different device
		String strUser = "YOUR_API_KEY_HERE"; // API Key, get from google service
		String strUserEx = "YOUR_API_KEY_HERE"; // API Key, get from google service
		String strAuthServerAddr = "https://www.google.com/accounts/ClientLogin";
		String strPushServerAddr = "https://android.googleapis.com/gcm/send";
		String strMainAddr = "https://android.googleapis.com/gcm/send";


		NET_MOBILE_PUSH_NOTIFY stNotify = new NET_MOBILE_PUSH_NOTIFY(1);
		stNotify.emServerType = EM_MOBILE_SERVER_TYPE.EM_MOBILE_SERVER_TYPE_ANDROID;
		stNotify.nPeriodOfValidity = 500646880; // subscribing period, unit s

		System.arraycopy(strRegisterID.getBytes(), 0, stNotify.szRegisterID, 0, strRegisterID.getBytes().length);

		System.arraycopy(strDevId.getBytes(), 0, stNotify.szDevID, 0, strDevId.getBytes().length);

		System.arraycopy(strAuthServerAddr.getBytes(), 0, stNotify.szAuthServerAddr, 0, strAuthServerAddr.getBytes().length);
		stNotify.nAuthServerPort = 443;

		System.arraycopy(strPushServerAddr.getBytes(), 0, stNotify.szPushServerAddr, 0, strPushServerAddr.getBytes().length);
		stNotify.nPushServerPort = 443;

		System.arraycopy(strMainAddr.getBytes(), 0, stNotify.stuPushServerMain.szAddress, 0, strMainAddr.getBytes().length);
		stNotify.stuPushServerMain.nPort = 443;

		System.arraycopy(strUser.getBytes(), 0, stNotify.szUser, 0, strUser.getBytes().length);
		stNotify.bUserEx = true;
		System.arraycopy(strUserEx.getBytes(), 0, stNotify.szUserEx, 0, strUserEx.getBytes().length);


		stNotify.pstuSubscribes[0].nCode = FinalVar.EVENT_ALARM_MOTIONDETECT; // which event need to be subcribe
		stNotify.pstuSubscribes[0].emSubCode = EM_EVENT_SUB_CODE.EM_EVENT_SUB_CODE_UNKNOWN;
		stNotify.pstuSubscribes[0].nChnNum = 1; // number of channels
		stNotify.pstuSubscribes[0].nIndexs[0] = 0; // channel index

		Integer stuErr = new Integer(0);
		Integer stuRes = new Integer(0);
		boolean zSet = INetSDK.SetMobileSubscribe(__LoginHandle, stNotify, stuErr, stuRes, 5000);
		if (!zSet) {
			ToolKits.writeErrorLog("SetMobileSubscribe failed");
		} else {
			ToolKits.writeLog("SetMobileSubscribe Succeed!");
		}
	}

	void GetMobileSubscribeCfg() {

		NET_MOBILE_PUSH_NOTIFY_CFG stuIn = new NET_MOBILE_PUSH_NOTIFY_CFG(1);
		String strRegisterID = "REGISTER_ID"; // this is a mobile id registration on google GCM service
		String strAppID = "com_company_Demo";
		System.arraycopy(strRegisterID.getBytes(), 0, stuIn.szRegisterID, 0, strRegisterID.getBytes().length);
		System.arraycopy(strAppID.getBytes(), 0, stuIn.szAppID, 0, strAppID.getBytes().length);
		Integer stuErr = new Integer(0);
		boolean zSet = INetSDK.GetMobileSubscribeCfg(__LoginHandle, stuIn, stuErr, 5000);
		if (!zSet) {
			ToolKits.writeErrorLog("GetMobileSubscribeCfg failed");
		} else {
			ToolKits.writeLog("GetMobileSubscribeCfg Succeed!, bUserEx is " + stuIn.bUserEx + ",szUser is " + new String(stuIn.szUser).trim() + ",szUserEx is " + new String(stuIn.szUserEx).trim());
		}
	}

	// 手机订阅推送信息StartListenEx
	void MobileSubscribeCfg() {
		/*-----------------SetMobileSubscribeCfg接口测试-----------------*/
		String strRegisterID = "REGISTER_ID"; // this is a mobile id registration on google GCM service
		String strAppID = "com_company_Demo";
		String strDevId = "DEVICE_ID"; // you can use this id to discriminate event msg come different device
		String strUser = "YOUR_API_KEY_HERE"; // API Key, get from google service
		String strUserEx = "YOUR_API_KEY_HERE"; // API Key, get from google service
		String strAuthServerAddr = "https://www.google.com/accounts/ClientLogin";
		String strPushServerAddr = "https://android.googleapis.com/gcm/send";
		String strMainAddr = "https://android.googleapis.com/gcm/send";
		String strNumber = "110";
		String szIndexsExt = "222";

		NET_MOBILE_PUSH_NOTIFY_CFG stNotifyCfg = new NET_MOBILE_PUSH_NOTIFY_CFG(1);
		stNotifyCfg.emServerType = EM_MOBILE_SERVER_TYPE.EM_MOBILE_SERVER_TYPE_ANDROID;
		stNotifyCfg.nPeriodOfValidity = 500646880; // subscribing period, unit s

		System.arraycopy(strRegisterID.getBytes(), 0, stNotifyCfg.szRegisterID, 0, strRegisterID.getBytes().length);

		System.arraycopy(strAppID.getBytes(), 0, stNotifyCfg.szAppID, 0, strAppID.getBytes().length);

		System.arraycopy(strDevId.getBytes(), 0, stNotifyCfg.szDevID, 0, strDevId.getBytes().length);

		System.arraycopy(strAuthServerAddr.getBytes(), 0, stNotifyCfg.szAuthServerAddr, 0, strAuthServerAddr.getBytes().length);
		stNotifyCfg.nAuthServerPort = 443;

		System.arraycopy(strPushServerAddr.getBytes(), 0, stNotifyCfg.szPushServerAddr, 0, strPushServerAddr.getBytes().length);
		stNotifyCfg.nPushServerPort = 443;

		System.arraycopy(strMainAddr.getBytes(), 0, stNotifyCfg.stuPushServerMain.szAddress, 0, strMainAddr.getBytes().length);
		stNotifyCfg.stuPushServerMain.nPort = 443;

		System.arraycopy(strUser.getBytes(), 0, stNotifyCfg.szUser, 0, strUser.getBytes().length);
		stNotifyCfg.bUserEx = true;
		System.arraycopy(strUserEx.getBytes(), 0, stNotifyCfg.szUserEx, 0, strUserEx.getBytes().length);
		if(stNotifyCfg.nSubScribeMax > 0){
			stNotifyCfg.pstuSubscribes[0].nCode = FinalVar.EVENT_ALARM_MOTIONDETECT; // which event need to be subcribe
			stNotifyCfg.pstuSubscribes[0].emSubCode = EM_EVENT_SUB_CODE.EM_EVENT_SUB_CODE_UNKNOWN;
			stNotifyCfg.pstuSubscribes[0].nChnNum = 1; // number of channels
			stNotifyCfg.pstuSubscribes[0].nIndexs[0] = 1; // channel index
			System.arraycopy(strNumber.getBytes(), 0, stNotifyCfg.pstuSubscribes[0].szNumber, 0, strNumber.getBytes().length);

			System.arraycopy(szIndexsExt.getBytes(), 0, stNotifyCfg.pstuSubscribes[0].szIndexsExt[0], 0, szIndexsExt.getBytes().length);

			ToolKits.writeLog("szIndexsExt：" + new String(stNotifyCfg.pstuSubscribes[0].szIndexsExt[0]).trim());
		}

		Integer stuErr = new Integer(0);
		Integer stuRes = new Integer(0);
		boolean zSet = INetSDK.SetMobileSubscribeCfg(__LoginHandle, stNotifyCfg, stuErr, stuRes, 5000);
		if (!zSet) {
			ToolKits.writeErrorLog("SetMobileSubscribeCfg failed");
		}
		else
		{
			ToolKits.writeErrorLog("SetMobileSubscribeCfg success");
		}
	}

	// 删除手机订阅推送信息
	void MobileSubscribeDelete() {
		/*String strRegisterID = "szRegisterID"; // this is a mobile id registration on google GCM service
		String strAppID = "com.company.Demo";
		String strAuthServerAddr = "https://www.google.com/accounts/ClientLogin";
		String strPushServerAddr = "https://cellphonepush.quickddns.com/gcm/send";
		String strMainAddr = "https://android.googleapis.com/gcm/send";
		String strRedirectAddr = ""; // not used
		String strDevName = "Device01_NVR"; // device name
		String strDevID = "468101c5"; // device id
		String strUser = ""; // API Key get from google service
		String strPsw = ""; //
		String strCertificate = ""; //is used just on iOS
		String strSecretKey = ""; // not used

		Integer stuErr = new Integer(0);
		Integer stuRes = new Integer(0);

		NET_MOBILE_PUSH_NOTIFY_CFG stNotifyCfg = new NET_MOBILE_PUSH_NOTIFY_CFG(0);
		System.arraycopy(strRegisterID.getBytes(), 0, stNotifyCfg.szRegisterID, 0, strRegisterID.getBytes().length);
		System.arraycopy(strAppID.getBytes(), 0, stNotifyCfg.szAppID, 0, strAppID.getBytes().length);
		stNotifyCfg.emServerType = EM_MOBILE_SERVER_TYPE.EM_MOBILE_SERVER_TYPE_ANDROID;
		stNotifyCfg.emPushGatewayType = EM_PUSH_GATEWAY_TYPE.EM_PUSH_GATEWAY_TYPE_APPLE_PUSH;
		stNotifyCfg.nPeriodOfValidity = 500646880;
		System.arraycopy(strAuthServerAddr.getBytes(), 0, stNotifyCfg.szAuthServerAddr, 0, strAuthServerAddr.getBytes().length);
		stNotifyCfg.nAuthServerPort = 443;
		System.arraycopy(strPushServerAddr.getBytes(), 0, stNotifyCfg.szPushServerAddr, 0, strPushServerAddr.getBytes().length);
		stNotifyCfg.nPushServerPort = 443;
		System.arraycopy(strMainAddr.getBytes(), 0, stNotifyCfg.stuPushServerMain.szAddress, 0, strMainAddr.getBytes().length);
		stNotifyCfg.stuPushServerMain.nPort = 443;
		System.arraycopy(strRedirectAddr.getBytes(), 0, stNotifyCfg.stuPushRedirectServer.szAddress, 0, strRedirectAddr.getBytes().length);
		stNotifyCfg.stuPushRedirectServer.nPort = 2006;
		System.arraycopy(strDevName.getBytes(), 0, stNotifyCfg.szDevName, 0, strDevName.getBytes().length);
		System.arraycopy(strDevID.getBytes(), 0, stNotifyCfg.szDevID, 0, strDevID.getBytes().length);
		System.arraycopy(strUser.getBytes(), 0, stNotifyCfg.szUser, 0, strUser.getBytes().length);
		System.arraycopy(strPsw.getBytes(), 0, stNotifyCfg.szPassword, 0, strPsw.getBytes().length);
		System.arraycopy(strCertificate.getBytes(), 0, stNotifyCfg.szCertificate, 0, strCertificate.getBytes().length);
		System.arraycopy(strSecretKey.getBytes(), 0, stNotifyCfg.szSecretKey, 0, strSecretKey.getBytes().length);

		boolean zSet = INetSDK.SetMobileSubscribeCfg(__LoginHandle, stNotifyCfg, stuErr, stuRes, 5000);
		if (!zSet) {
			ToolKits.writeErrorLog("SetMobileSubscribeCfg failed");
		}*/

		/*-----------------DelMobileSubscribe-----------------------*/
		String strRegisterID = "szRegisterID";
		NET_MOBILE_PUSH_NOTIFY_DEL stIn = new NET_MOBILE_PUSH_NOTIFY_DEL();
		System.arraycopy(strRegisterID.getBytes(), 0, stIn.szRegisterID, 0, strRegisterID.getBytes().length);
		NET_OUT_DELETECFG stOut = new NET_OUT_DELETECFG();
		boolean zDel = INetSDK.DelMobileSubscribe(
				__LoginHandle, stIn, stOut, 5000);
		if (!zDel) {
			ToolKits.writeErrorLog("DelMobileSubscribe failed");
		} else {
			ToolKits.writeLog("DelMobilePushNotify Succeed!");
		}
	}
	/**
	 * 获取手机推送支持能力
	 */
	public void GetMobilePusherCaps() {
		/*
		 * 入参
		 */
		NET_IN_GET_MOBILE_PUSHER_CAPS stIn = new NET_IN_GET_MOBILE_PUSHER_CAPS();

		/*
		 * 出参
		 */
		NET_OUT_GET_MOBILE_PUSHER_CAPS stOut = new NET_OUT_GET_MOBILE_PUSHER_CAPS();

		if(INetSDK.GetMobilePusherCaps(__LoginHandle, stIn, stOut, 5000)) {
			ToolKits.writeLog("设备是否支持设置手机报警推送使能:" + stOut.bEnablePush);
			ToolKits.writeLog("设备是否支持添加推送订阅:" + stOut.bAddNotification);
			ToolKits.writeLog("设备是否支持取消推送订阅:" + stOut.bDelNotification);
			ToolKits.writeLog("DMSS手机推送,是否支持优先级:" + stOut.bSupportPriority);
			ToolKits.writeLog("是否支持订制时间段内推送: " + stOut.bPushEventSchedule);
			ToolKits.writeLog("bVTOPushErrorCode: " + stOut.bVTOPushErrorCode);
			ToolKits.writeLog("bSupportGetPushConfig: " + stOut.bSupportGetPushConfig);
		} else {
			ToolKits.writeErrorLog("获取手机推送支持能力失败!");
			ToolKits.writeLog("错误码：0x80000000|" + (INetSDK.GetLastError() & 0x7fffffff));
		}
	}

	public void GetMobilePusherNotificationCfg() {

		NET_IN_GET_MOBILE_PUSHER_NOTIFICATION_INFO stuIn = new NET_IN_GET_MOBILE_PUSHER_NOTIFICATION_INFO();
		stuIn.emFindMode = EM_MOBILE_PUSHER_NOTIFICATION_TYPE.EM_MOBILE_PUSHER_NOTIFICATION_TYPE_ALL;
		String appID = "111";
		System.arraycopy(appID.getBytes(), 0, stuIn.szAppID, 0, appID.getBytes().length);
		String registerID  ="222";
		System.arraycopy(registerID.getBytes(), 0, stuIn.szRegisterID, 0, registerID.getBytes().length);
		NET_OUT_GET_MOBILE_PUSHER_NOTIFICATION_INFO stuOut = new NET_OUT_GET_MOBILE_PUSHER_NOTIFICATION_INFO(4, 2);
		boolean bRet = INetSDK.GetMobilePusherNotificationCfg(__LoginHandle, stuIn, stuOut, 5000);
		if(bRet)
		{
			ToolKits.writeLog("nRetNotificationNum:" + stuOut.nRetNotificationNum);
			for(int i = 0; i < stuOut.nRetNotificationNum; i++)
			{
				ToolKits.writeLog("stuOut.pstuMobilePusherNotificationCfg[" + i +"]");
				ToolKits.writeLog("szRegisterID" + new String(stuOut.pstuMobilePusherNotificationCfg[i].szRegisterID).trim());
				ToolKits.writeLog("szAppID" + new String(stuOut.pstuMobilePusherNotificationCfg[i].szAppID).trim());
				ToolKits.writeLog("emServerType:" + stuOut.pstuMobilePusherNotificationCfg[i].emServerType);
				ToolKits.writeLog("emPushGatewayType:" + stuOut.pstuMobilePusherNotificationCfg[i].emPushGatewayType);
				ToolKits.writeLog("nPeriodOfValidity:" + stuOut.pstuMobilePusherNotificationCfg[i].nPeriodOfValidity);
				ToolKits.writeLog("szAuthServerAddr:" + new String(stuOut.pstuMobilePusherNotificationCfg[i].szAuthServerAddr).trim());
				ToolKits.writeLog("nAuthServerPort:" + stuOut.pstuMobilePusherNotificationCfg[i].nAuthServerPort);
				ToolKits.writeLog("szDevName:" + new String(stuOut.pstuMobilePusherNotificationCfg[i].szDevName).trim());
				ToolKits.writeLog("szDevID:" + new String(stuOut.pstuMobilePusherNotificationCfg[i].szDevID).trim());
				ToolKits.writeLog("szUser:" + new String(stuOut.pstuMobilePusherNotificationCfg[i].szUser).trim());
				ToolKits.writeLog("szCertificate:" + new String(stuOut.pstuMobilePusherNotificationCfg[i].szCertificate).trim());
				ToolKits.writeLog("szSecretKey:" + new String(stuOut.pstuMobilePusherNotificationCfg[i].szSecretKey).trim());
				ToolKits.writeLog("szBindingUserName:" + new String(stuOut.pstuMobilePusherNotificationCfg[i].szBindingUserName).trim());
				ToolKits.writeLog("nSubScribeNum:" + stuOut.pstuMobilePusherNotificationCfg[i].nSubScribeNum);
				for(int j = 0; j < stuOut.pstuMobilePusherNotificationCfg[i].nSubScribeNum; j++)
				{
					ToolKits.writeLog("pstuSubscribes[" + j +"]");
					ToolKits.writeLog("pstuSubscribes-szCode:" + new String(stuOut.pstuMobilePusherNotificationCfg[i].pstuSubscribes[j].szCode).trim());
					ToolKits.writeLog("pstuSubscribes-szSubCode:" + new String(stuOut.pstuMobilePusherNotificationCfg[i].pstuSubscribes[j].szSubCode).trim());
					ToolKits.writeLog("nChnNum:" + stuOut.pstuMobilePusherNotificationCfg[i].pstuSubscribes[j].nChnNum);

					ToolKits.writeLog("pstuSubscribes-szNumber:" + new String(stuOut.pstuMobilePusherNotificationCfg[i].pstuSubscribes[j].szNumber).trim());
					ToolKits.writeLog("pstuSubscribes-szSound:" + new String(stuOut.pstuMobilePusherNotificationCfg[i].pstuSubscribes[j].szSound).trim());
					ToolKits.writeLog("pstuSubscribes-szIndexsExt[0]:" + new String(stuOut.pstuMobilePusherNotificationCfg[i].pstuSubscribes[j].szIndexsExt[0]).trim());
					ToolKits.writeLog("pstuSubscribes-szIndexsExt[1]:" + new String(stuOut.pstuMobilePusherNotificationCfg[i].pstuSubscribes[j].szIndexsExt[1]).trim());
				}
				ToolKits.writeLog("stuPushServerMain.szAddress:" + new String(stuOut.pstuMobilePusherNotificationCfg[i].stuPushServerMain.szAddress).trim());
				ToolKits.writeLog("stuPushServerMain.nPort:" + stuOut.pstuMobilePusherNotificationCfg[i].stuPushServerMain.nPort);
			}
			ToolKits.writeLog("GetMobilePusherNotificationCfg success");
		}
		else
		{
			ToolKits.writeLog("GetMobilePusherNotificationCfg failed,LastError:" + INetSDK.GetLastError());
		}
	}

	public void GetMobileSubscribeAllCfg() {

		NET_MOBILE_SUBSCRIBE_ALL_CFG_INFO stuMobileSubscribeAllCfg = new NET_MOBILE_SUBSCRIBE_ALL_CFG_INFO(4, 2);
		Integer err = new Integer(0);
		boolean bRet = INetSDK.GetMobileSubscribeAllCfg(__LoginHandle,stuMobileSubscribeAllCfg, err, 5000);
		if(bRet)
		{
			ToolKits.writeLog("GetMobileSubscribeAllCfg success");
			ToolKits.writeLog("nRetMobileSubscribeNum:" + stuMobileSubscribeAllCfg.nRetMobileSubscribeNum);
			for(int i = 0; i < stuMobileSubscribeAllCfg.nRetMobileSubscribeNum; i++)
			{
				ToolKits.writeLog("stuOut.pstuMobileSubscribe[" + i +"]");
				ToolKits.writeLog("stuOut.pstuMobilePusherNotificationCfg[" + i +"]");
				ToolKits.writeLog("szRegisterID" + new String(stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].szRegisterID).trim());
				ToolKits.writeLog("szAppID" + new String(stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].szAppID).trim());
				ToolKits.writeLog("emServerType:" + stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].emServerType);
				ToolKits.writeLog("emPushGatewayType:" + stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].emPushGatewayType);
				ToolKits.writeLog("nPeriodOfValidity:" + stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].nPeriodOfValidity);
				ToolKits.writeLog("szAuthServerAddr:" + new String(stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].szAuthServerAddr).trim());
				ToolKits.writeLog("nAuthServerPort:" + stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].nAuthServerPort);
				ToolKits.writeLog("szDevName:" + new String(stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].szDevName).trim());
				ToolKits.writeLog("szDevID:" + new String(stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].szDevID).trim());
				ToolKits.writeLog("szUser:" + new String(stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].szUser).trim());
				ToolKits.writeLog("szCertificate:" + new String(stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].szCertificate).trim());
				ToolKits.writeLog("szSecretKey:" + new String(stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].szSecretKey).trim());
				ToolKits.writeLog("szBindingUserName:" + new String(stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].szBindingUserName).trim());
				ToolKits.writeLog("nSubScribeNum:" + stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].nSubScribeNum);
				for(int j = 0; j < stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].nSubScribeNum; j++)
				{
					ToolKits.writeLog("pstuSubscribes[" + j +"]");
					ToolKits.writeLog("pstuSubscribes-szCode:" + new String(stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].pstuSubscribes[j].szCode).trim());
					ToolKits.writeLog("pstuSubscribes-szSubCode:" + new String(stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].pstuSubscribes[j].szSubCode).trim());
					ToolKits.writeLog("nChnNum:" + stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].pstuSubscribes[j].nChnNum);

					ToolKits.writeLog("pstuSubscribes-szNumber:" + new String(stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].pstuSubscribes[j].szNumber).trim());
					ToolKits.writeLog("pstuSubscribes-szSound:" + new String(stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].pstuSubscribes[j].szSound).trim());
					ToolKits.writeLog("pstuSubscribes-szIndexsExt[0]:" + new String(stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].pstuSubscribes[j].szIndexsExt[0]).trim());
					ToolKits.writeLog("pstuSubscribes-szIndexsExt[1]:" + new String(stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].pstuSubscribes[j].szIndexsExt[1]).trim());
				}
				ToolKits.writeLog("stuPushServerMain.szAddress:" + new String(stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].stuPushServerMain.szAddress).trim());
				ToolKits.writeLog("stuPushServerMain.nPort:" + stuMobileSubscribeAllCfg.pstuMobileSubscribe[i].stuPushServerMain.nPort);
			}
		}
	}

	void GetSnifferCaps(){
		NET_IN_GET_SNIFFER_CAP stuIn = new NET_IN_GET_SNIFFER_CAP();
		NET_OUT_GET_SNIFFER_CAP stuOut = new NET_OUT_GET_SNIFFER_CAP();
		boolean bRet = INetSDK.GetSnifferCaps(__LoginHandle, stuIn, stuOut, 5000);
		if(bRet)
		{
			ToolKits.writeLog("GetSnifferCaps success,bRemoteCap:" + stuOut.bRemoteCap);
		}
		else
		{
			ToolKits.writeLog("GetSnifferCaps failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void SetRedirLocal(){
		NET_IN_DBGINFO_SET_REDIR_LOCAL stuIn = new NET_IN_DBGINFO_SET_REDIR_LOCAL();
		NET_OUT_DBGINFO_SET_REDIR_LOCAL stuOut = new NET_OUT_DBGINFO_SET_REDIR_LOCAL();
		boolean bRet = INetSDK.OperateDebugInfo(__LoginHandle, EM_DBGINFO_OP_TYPE.EM_DBGINFO_OP_REDIR_SET_LOCAL, stuIn, stuOut, 5000);
		if(bRet)
		{
			ToolKits.writeLog("OperateDebugInfo EM_DBGINFO_OP_REDIR_SET_LOCAL success");
		}
		else
		{
			ToolKits.writeLog("OperateDebugInfo EM_DBGINFO_OP_REDIR_SET_LOCAL failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void CancelRedirLocal(){
		NET_IN_DBGINFO_CANCEL_REDIR_LOCAL stuIn = new NET_IN_DBGINFO_CANCEL_REDIR_LOCAL();
		NET_OUT_DBGINFO_CANCEL_REDIR_LOCAL stuOut = new NET_OUT_DBGINFO_CANCEL_REDIR_LOCAL();
		boolean bRet = INetSDK.OperateDebugInfo(__LoginHandle, EM_DBGINFO_OP_TYPE.EM_DBGINFO_OP_REDIR_CANCEL_LOCAL, stuIn, stuOut, 5000);
		if(bRet)
		{
			ToolKits.writeLog("OperateDebugInfo EM_DBGINFO_OP_REDIR_CANCEL_LOCAL success");
		}
		else
		{
			ToolKits.writeLog("OperateDebugInfo EM_DBGINFO_OP_REDIR_CANCEL_LOCAL failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void GetDebugInfo(){
		NET_IN_DBGINFO_GET_INFO stuIn = new NET_IN_DBGINFO_GET_INFO();
		NET_OUT_DBGINFO_GET_INFO stuOut = new NET_OUT_DBGINFO_GET_INFO();
		boolean bRet = INetSDK.OperateDebugInfo(__LoginHandle, EM_DBGINFO_OP_TYPE.EM_DBGINFO_OP_GET_INFO, stuIn, stuOut, 5000);
		if(bRet)
		{
			ToolKits.writeLog("OperateDebugInfo EM_DBGINFO_OP_GET_INFO success,emStatus:" + stuOut.emStatus);
			ToolKits.writeLog("nRetFileCount:" + stuOut.nRetFileCount);
			for(int i = 0; i < stuOut.nRetFileCount;++i)
			{
				ToolKits.writeLog("第" + i + "组");
				ToolKits.writeLog("nFileSize:" + stuOut.stuFile[i].nFileSize);
				ToolKits.writeLog("szFilePath:" + new String(stuOut.stuFile[i].szFilePath).trim());
			}
		}
		else
		{
			ToolKits.writeLog("OperateDebugInfo EM_DBGINFO_OP_GET_INFO failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void InitDevAccountByPort(){
//		public boolean initDevAccount(DEVICE_NET_INFO_EX mDeviceInfo, String username, String password, String mInitPhoneOrMail) {
//			boolean bRet = false;
//
//			NET_IN_INIT_DEVICE_ACCOUNT_BY_PORT stuIn = new NET_IN_INIT_DEVICE_ACCOUNT_BY_PORT();
//			NET_OUT_INIT_DEVICE_ACCOUNT_BY_PORT stuOut = new NET_OUT_INIT_DEVICE_ACCOUNT_BY_PORT();
//			// mac地址
//			System.arraycopy(mDeviceInfo.szMac, 0, stuIn.szMac, 0, mDeviceInfo.szMac.length);
//
//			// 用户名
//			System.arraycopy(username.getBytes(), 0, stuIn.szUserName, 0, username.getBytes().length);
//
//			// 密码，必须字母与数字结合，8位以上，否则设备不识别
//			System.arraycopy(password.getBytes(), 0, stuIn.szPwd, 0, password.getBytes().length);
//
//			if((mDeviceInfo.byPwdResetWay >> 1 & 0x01) == 0) {    // 手机号
//				System.arraycopy(mInitPhoneOrMail.getBytes(), 0, stuIn.szCellPhone, 0, mInitPhoneOrMail.getBytes().length);
//			} else if((mDeviceInfo.byPwdResetWay >> 1 & 0x01) == 1) {  // 邮箱
//				System.arraycopy(mInitPhoneOrMail.getBytes(), 0, stuIn.szMail, 0, mInitPhoneOrMail.getBytes().length);
//			}
//
//			//  密码重置方式, 设备搜索返回的
//			stuIn.byPwdResetWay = mDeviceInfo.byPwdResetWay;
//
//			stuIn.nPort = 37820;
//
//			// 设备初始化状态,根据搜索返回的
////		stuIn.byInitStatus = device_net_info_ex.byInitStatus;
//
//			bRet = INetSDK.InitDevAccountByPort(stuIn, stuOut, 5000, "172.23.12.56");
//			if(bRet)
//			{
//				ToolKits.writeLog("InitDevAccountByPort success");
//			}
//			else
//			{
//				ToolKits.writeLog("InitDevAccountByPort failed,LastError:" + INetSDK.GetLastError());
//			}
//
//			return bRet;
//		}


	}
	void ResetPwdByPort(){
		NET_IN_RESET_PWD_BY_PORT stuIn = new NET_IN_RESET_PWD_BY_PORT();
		NET_OUT_RESET_PWD_BY_PORT stuOut = new NET_OUT_RESET_PWD_BY_PORT();
		// 设备mac地址
		String mac = "6c:1c:71:11:05:e5";
		System.arraycopy(mac.getBytes(), 0, stuIn.szMac, 0, mac.getBytes().length);

		// 用户名
		String usrName = "admin";
		System.arraycopy(usrName.getBytes(), 0, stuIn.szUserName, 0, usrName.getBytes().length);

		// 密码
		String pwd = "admin123";
		System.arraycopy(pwd.getBytes(), 0, stuIn.szPwd, 0, pwd.getBytes().length);



		System.arraycopy("de31ba4c".getBytes(), 0, stuIn.szSecurity, 0, "de31ba4c".getBytes().length);

//		System.arraycopy("wobuxiang@jiaban.com".getBytes(), 0, stuIn.szSecurity, 0, "wobuxiang@jiaban.com".getBytes().length);


		stuIn.nPort = 37820;

		stuIn.byPwdResetWay = 0;

		String phone = "13675873439";
		System.arraycopy(phone.getBytes(), 0, stuIn.szContact, 0, phone.getBytes().length);

		stuIn.bSetContact = true;

		boolean bRet = INetSDK.ResetPwdByPort(stuIn, stuOut, 5000, "172.23.12.56");
		if(bRet)
		{
			ToolKits.writeLog("ResetPwdByPort success");
		}
		else
		{
			ToolKits.writeLog("ResetPwdByPort failed,LastError:" + INetSDK.GetLastError());
		}
	}
	private void bytesToImageFile(byte[] bytes) {
		try {
			File file = new File("/storage/emulated/0/aaa.jpeg");
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(bytes, 0, bytes.length);
			fos.flush();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    void TestFaceOpenDoor(){
        NET_IN_FACE_OPEN_DOOR stuIn = new NET_IN_FACE_OPEN_DOOR();
        stuIn.nChannel = 0;
        stuIn.emCompareResult = EM_COMPARE_RESULT.EM_COMPARE_RESULT_NOTINDATABASE;
        //字段按需下发
        NET_OUT_FACE_OPEN_DOOR stuOut = new NET_OUT_FACE_OPEN_DOOR();
        boolean bRet = INetSDK.FaceOpenDoor(__LoginHandle, stuIn, stuOut, 5000);
        if(bRet){
            ToolKits.writeLog("FaceOpenDoor succeed!");
        } else {
            ToolKits.writeLog("FaceOpenDoor failed,LastError:" + INetSDK.GetLastError());
        }
    }

	void TestGetVideoInputInfo(){
		NET_IN_GET_VIDEO_INPUT_INFO stuIn = new NET_IN_GET_VIDEO_INPUT_INFO();
		stuIn.emType = EM_GET_VIDEO_INPUT_TYPE.EM_GET_VIDEO_INPUT_TYPE_BANDWIDTH;//必填枚举，出参的类型由枚举决定
		NET_OUT_GET_VIDEO_INPUT_INFO stuOut = new NET_OUT_GET_VIDEO_INPUT_INFO();
		stuOut.pInfo = new NET_VIDEO_INPUT_BANDWIDTH_INFO();
		boolean bRet = INetSDK.GetVideoInputInfo(__LoginHandle, stuIn, stuOut, 5000);
		if(bRet)
		{
			NET_VIDEO_INPUT_BANDWIDTH_INFO result = (NET_VIDEO_INPUT_BANDWIDTH_INFO)stuOut.pInfo;//将出参的Object转换为枚举对应结构体
			ToolKits.writeLog("GetVideoInputInfo EM_GET_VIDEO_INPUT_TYPE_BANDWIDTH success!");
			ToolKits.writeLog("stuOut.dbBandWidthLeft = " + result.dbBandWidthLeft);
			ToolKits.writeLog("stuOut.dbBandWidthLimit = " + result.dbBandWidthLimit);
		}
		else
		{
			ToolKits.writeLog("GetVideoInputInfo EM_GET_VIDEO_INPUT_TYPE_BANDWIDTH failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void GetDescriptionForResetPwdByPort(){
		NET_IN_DESCRIPTION_FOR_RESET_PWD_BY_PORT stuIn = new NET_IN_DESCRIPTION_FOR_RESET_PWD_BY_PORT();
		NET_OUT_DESCRIPTION_FOR_RESET_PWD_BY_PORT stuOut = new NET_OUT_DESCRIPTION_FOR_RESET_PWD_BY_PORT(359);
		NET_FACE_PIC_INFO face = new NET_FACE_PIC_INFO();
		// 设备mac地址
		String mac = "6c:1c:71:11:05:e5";
		System.arraycopy(mac.getBytes(), 0, stuIn.szMac, 0, mac.getBytes().length);

		// 用户名
		String usrName = "admin";
		System.arraycopy(usrName.getBytes(), 0, stuIn.szUserName, 0, usrName.getBytes().length);

//		stuIn.byInitStatus = device_net_info_ex.byInitStatus;

		stuIn.nPort = 37820;

		boolean bRet = INetSDK.GetDescriptionForResetPwdByPort(stuIn, stuOut, 5000, "172.23.12.56");
		if(bRet)
		{
			ToolKits.writeLog("GetDescriptionForResetPwdByPort success");
			ToolKits.writeLog("pQrCode = " + stuOut.pQrCode);
			ToolKits.writeLog("pQrCode = " + new String(stuOut.pQrCode).trim());
			ToolKits.writeLog("QrCodeLen = " + stuOut.nQrCodeLen);
			ToolKits.writeLog("QrCodeLen = " + stuOut.nQrCodeLenRet);
//			NET_IN_RESET_PWD_BY_PORT stuIn1 = new NET_IN_RESET_PWD_BY_PORT();
//			NET_OUT_RESET_PWD_BY_PORT stuOut1 = new NET_OUT_RESET_PWD_BY_PORT();
//			// 设备mac地址
//			String mac1 = "6c:1c:71:11:05:e5";
//			System.arraycopy(mac.getBytes(), 0, stuIn1.szMac, 0, mac.getBytes().length);
//
//			// 用户名
//			String usrName1 = "admin";
//			System.arraycopy(usrName.getBytes(), 0, stuIn1.szUserName, 0, usrName.getBytes().length);
//
//			// 密码
//			String pwd = "admin123";
//			System.arraycopy(pwd.getBytes(), 0, stuIn1.szPwd, 0, pwd.getBytes().length);
//
//
//
//			stuIn1.szSecurity = stuOut.pQrCode;
//
////		System.arraycopy("wobuxiang@jiaban.com".getBytes(), 0, stuIn.szSecurity, 0, "wobuxiang@jiaban.com".getBytes().length);
//
//
//			stuIn1.nPort = 37820;
//
//			stuIn1.byPwdResetWay = 0;
//
////			String phone = "13675873439";
////			System.arraycopy(phone.getBytes(), 0, stuIn1.szContact, 0, phone.getBytes().length);
//
//			stuIn1.bSetContact = false;
//
//			boolean bRet1 = INetSDK.ResetPwdByPort(stuIn1, stuOut1, 5000, "172.23.12.56");
//			if(bRet1)
//			{
//				ToolKits.writeLog("ResetPwdByPort success");
//			}
//			else
//			{
//				ToolKits.writeLog("ResetPwdByPort failed,LastError:" + INetSDK.GetLastError());
//			}
		}
		else
		{
			ToolKits.writeLog("GetDescriptionForResetPwdByPort failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void GetDebugInfoCaps(){
		NET_IN_DBGINFO_GET_CAPS stuIn = new NET_IN_DBGINFO_GET_CAPS();
		NET_OUT_DBGINFO_GET_CAPS stuOut = new NET_OUT_DBGINFO_GET_CAPS();
		boolean bRet = INetSDK.OperateDebugInfo(__LoginHandle, EM_DBGINFO_OP_TYPE.EM_DBGINFO_OP_GET_CAPS, stuIn, stuOut, 5000);
		if(bRet)
		{
			ToolKits.writeLog("OperateDebugInfo EM_DBGINFO_OP_GET_INFO success,bSupportRedir:" + stuOut.bSupportRedir);
		}
		else
		{
			ToolKits.writeLog("OperateDebugInfo EM_DBGINFO_OP_GET_INFO failed,LastError:" + INetSDK.GetLastError());
		}
	}

	public class Test_CB_fDebugInfoCallBack implements
			CB_fDebugInfoCallBack {
		@Override
		public void invoke(long lAttchHandle, byte pBuffer[], int dwBufSize){
			FileOutputStream fileStream;
			try {
				fileStream = new FileOutputStream(Environment.getExternalStorageDirectory().getPath() + "/DebugInfo.txt", true);
				fileStream.write(pBuffer,0,dwBufSize);
				fileStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			ToolKits.writeLog("Test_CB_fDebugInfoCallBack");
		}
	}
	private long lAttachDebugInfoHandle = 0;
	void AttachDebugInfo(){
		NET_IN_ATTACH_DBGINFO stuIn = new NET_IN_ATTACH_DBGINFO();
		stuIn.emLevel = EM_DBGINFO_LEVEL.EM_DBGINFO_LEVEL_DEBUG;
		stuIn.pCallBack = new Test_CB_fDebugInfoCallBack();
		NET_OUT_ATTACH_DBGINFO stuOut = new NET_OUT_ATTACH_DBGINFO();
		lAttachDebugInfoHandle = INetSDK.AttachDebugInfo(__LoginHandle, stuIn, stuOut, 5000);
		if(lAttachDebugInfoHandle != 0)
		{
			ToolKits.writeLog("AttachDebugInfo success,handle:" + lAttachDebugInfoHandle);
		}
		else
		{
			ToolKits.writeLog("AttachDebugInfo failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void DetachDebugInfo(){
		if(lAttachDebugInfoHandle != 0) {
			boolean bRet = INetSDK.DetachDebugInfo(lAttachDebugInfoHandle);
			if (bRet) {
				ToolKits.writeLog("DetachDebugInfo success,handle:AttachDebugInfoHandle");
			} else {
				ToolKits.writeLog("DetachDebugInfo failed,LastError:" + INetSDK.GetLastError());
			}
		}
	}


	public void DebugInfoRedirect() {
		// 获取
		NET_CFG_DEBUGINFO_REDIR_INFO msg = new NET_CFG_DEBUGINFO_REDIR_INFO();
		int nType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_DEBUGINFO_REDIR;
		int nChannelID = -1;

		if(INetSDK.GetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null)) {
			ToolKits.writeLog("Get NET_EM_CFG_DEBUGINFO_REDIR Succe" +
					"ed!");
			ToolKits.writeLog("bEnable:" + msg.bEnable);
			msg.bEnable = true;
			if(INetSDK.SetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null, null)) {
				ToolKits.writeLog("Set NET_CFG_NETWORK_SNIFFER_INFO Succeed!");
				NET_CFG_DEBUGINFO_REDIR_INFO msg1 = new NET_CFG_DEBUGINFO_REDIR_INFO();
				if(INetSDK.GetConfig(__LoginHandle, nType, nChannelID, msg1, _waittime, null)) {
					ToolKits.writeLog("bEnable:" + msg1.bEnable);
				}
			} else {
				ToolKits.writeErrorLog("Set NET_EM_CFG_DEBUGINFO_REDIR Failed!, error is" + INetSDK.GetLastError());
			}
		} else {
			ToolKits.writeErrorLog("Get NET_EM_CFG_DEBUGINFO_REDIR Failed!,error is" + INetSDK.GetLastError());
		}
	}

	/**
	 *获取抓包状态
	 */
	private void getSnifferInfo(){
		SDK_IN_GET_SNIFFER_INFO inParam=new SDK_IN_GET_SNIFFER_INFO();
		String strNetInterface = "eth0";
		inParam.pszNetInterface = new byte[64];
		ToolKits.StringToByteArray(strNetInterface,inParam.pszNetInterface);
		SDK_OUT_GET_SNIFFER_INFO outParam=new SDK_OUT_GET_SNIFFER_INFO(10);
		boolean result=INetSDK.GetSnifferInfo(__LoginHandle,inParam,outParam,5000);
		if(result){
			ToolKits.writeLog("GetSnifferInfo success");
		}
		else{
			ToolKits.writeLog("GetSnifferInfo failed,LastError:" + INetSDK.GetLastError());
		}
	}
	private long startHandler;
	private long attachHandler;
	/**
	 * 开始抓包
	 */
	private void startSniffer(){

		SDK_IN_START_SNIFFER inParam=new SDK_IN_START_SNIFFER();
		String strNetInterface = "eth0";
		inParam.pszNetInterface = new byte[16];
		ToolKits.StringToByteArray(strNetInterface,inParam.pszNetInterface);
		String strPath = "/mnt/sdcard/123.pcap";
		inParam.pszPath = new byte[64];
		ToolKits.StringToByteArray(strPath,inParam.pszPath);
		//String strFilter = "tcp port 37777";
		//inParam.pszFilter = new byte[64];
		//ToolKits.StringToByteArray(strFilter,inParam.pszFilter);
		inParam.nCaptureTime = 10;
		inParam.nSaveType = 1;
//		inParam.bFilterEx = true;
//		inParam.stuFilterEx.nMaxElemet = 1;
//		inParam.stuFilterEx.nFilterType = 1;
//		inParam.stuFilterEx.stuElemets[0].nDstPort = 37778;
//		inParam.stuFilterEx.stuElemets[0].nSrcPort = 37777;
//		String strSrcIP = "10.4.3.70";
//		ToolKits.StringToByteArray(strSrcIP,inParam.stuFilterEx.stuElemets[0].szSrcIP);
//		String strDstIP = "10.4.3.70";
//		ToolKits.StringToByteArray(strDstIP,inParam.stuFilterEx.stuElemets[0].szDstIP);
//		inParam.stuFilterEx.stuElemets[0].emProtocol = EM_SNIFFER_FILTER_PROTOCOL.EM_SNIFFER_FILTER_PROTOCOL_TCP;
		SDK_OUT_START_SNIFFER outParam = new SDK_OUT_START_SNIFFER();
		startHandler = INetSDK.StartSniffer(__LoginHandle,inParam,outParam,3000);
		if(startHandler != 0)
		{
			ToolKits.writeLog("StartSniffer success");
		}
		else
		{
			ToolKits.writeLog("StartSniffer failed,LastError:" + INetSDK.GetLastError());
		}
	}
	// 停止抓包
	private void stopSniffer(){

		boolean bRet = INetSDK.StopSniffer(__LoginHandle, startHandler);
		if(bRet)
		{
			ToolKits.writeLog("StopSniffer success");
		}
		else
		{
			ToolKits.writeLog("StopSniffer failed,LastError:" + INetSDK.GetLastError());
		}
	}
	/**
	 * 订阅抓包数据
	 */

	public class DefaultAttachSniffer implements CB_fAttachSniffer{
		@Override
		public void invoke(long lAttchHandle, byte[] pBuffer, int dwBufSize) {
			FileOutputStream fileStream;
			try {
				fileStream = new FileOutputStream(Environment.getExternalStorageDirectory().getPath() + "/Sniffer.pcap", true);
				fileStream.write(pBuffer,0,dwBufSize);
				fileStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			ToolKits.writeLog("DefaultAttachSniffer,dwBufSize:" + dwBufSize);
		}
	}
	private void attachSniffer(){

		NET_IN_ATTACH_SNIFFER inParam=new NET_IN_ATTACH_SNIFFER();
		inParam.cbSniffer = new DefaultAttachSniffer();
		NET_OUT_ATTACH_SNIFFER outParam=new NET_OUT_ATTACH_SNIFFER();
		attachHandler=INetSDK.AttachSniffer(__LoginHandle,inParam,outParam,3000);
		if(attachHandler==0){
			ToolKits.writeLog("AttachSniffer failed,LastError: "+ INetSDK.GetLastError());
		}else{
			ToolKits.writeLog("AttachSniffer success");
		}
	}

	/**
	 * 退订抓包数据
	 */
	private void dettachSniffer(){
		boolean result=INetSDK.DetachSniffer(attachHandler);
		if(result){
			ToolKits.writeLog("DetachSniffer success");
		}else{
			ToolKits.writeLog("DetachSniffer failed,LastError: "+ INetSDK.GetLastError());
		}
	}

	// Turn on/off the White Light
	public void SetCoaxialControlIO_Light() {
		/**Obtain the White Light state**/
		int nType = FinalVar.NET_COAXIAL_CONTROL_IO_STATUS;
		int nChannel = 0;
		// Input param
		NET_IN_GET_COAXIAL_CONTROL_IO_STATUS stIn0 = new NET_IN_GET_COAXIAL_CONTROL_IO_STATUS();
		stIn0.nChannel = nChannel; // Channel

		// Output param
		NET_OUT_GET_COAXIAL_CONTROL_IO_STATUS stOut0 = new NET_OUT_GET_COAXIAL_CONTROL_IO_STATUS();

		if(INetSDK.GetDevCaps(__LoginHandle, nType, stIn0, stOut0, 5000)) {
			ToolKits.writeLog("Light State: " + stOut0.emWhiteLight);
		} else {
			ToolKits.writeErrorLog("GetDevCaps Failed!" );
		}
		/**Turn on/off the White Light**/
		// Input param
		NET_IN_CONTROL_COAXIAL_CONTROL_IO stIn = new NET_IN_CONTROL_COAXIAL_CONTROL_IO();
		stIn.nChannel = nChannel; 	// channel
		stIn.nInfoCount = 1;  // IO info num

		stIn.stInfo[0].emType = EM_COAXIAL_CONTROL_IO_TYPE.EM_COAXIAL_CONTROL_IO_TYPE_LIGHT;  // IO control type
		stIn.stInfo[0].emMode = EM_COAXIAL_CONTROL_IO_TRIGGER_MODE.EM_COAXIAL_CONTROL_IO_TRIGGER_MODE_MANUAL_TRIGGER;  // IO trigger mode
		if(stOut0.emWhiteLight == EM_COAXIAL_CONTROL_IO_STATUS.EM_COAXIAL_CONTROL_IO_STATUS_ON){
			stIn.stInfo[0].emSwicth = EM_COAXIAL_CONTROL_IO_SWITCH.EM_COAXIAL_CONTROL_IO_SWITCH_CLOSE;
		}else if(stOut0.emWhiteLight == EM_COAXIAL_CONTROL_IO_STATUS.EM_COAXIAL_CONTROL_IO_STATUS_OFF){
			stIn.stInfo[0].emSwicth = EM_COAXIAL_CONTROL_IO_SWITCH.EM_COAXIAL_CONTROL_IO_SWITCH_OPEN;
		}else{
			ToolKits.writeLog("ControlDeviceEx Failed,WhiteLight State Unknow !");
			return;
		}
		// Output param
		NET_OUT_CONTROL_COAXIAL_CONTROL_IO stOut = new NET_OUT_CONTROL_COAXIAL_CONTROL_IO();
		if(INetSDK.ControlDeviceEx(__LoginHandle, CtrlType.SDK_CTRL_COAXIAL_CONTROL_IO, stIn, stOut, 3000)) {
			ToolKits.writeLog("ControlDeviceEx Succeed!");
		} else {
			ToolKits.writeErrorLog("ControlDeviceEx Failed!");
			ToolKits.writeErrorLog("GetLastError:" + INetSDK.GetLastError());
		}
	}

	//turn on/off the Alarm Bell
	public void SetCoaxialControlIO_Speaker() {
		/**Obtain the Speaker state**/
		int nType = FinalVar.NET_COAXIAL_CONTROL_IO_STATUS;
		int nChannel = 0;
		// Input param
		NET_IN_GET_COAXIAL_CONTROL_IO_STATUS stIn0 = new NET_IN_GET_COAXIAL_CONTROL_IO_STATUS();
		stIn0.nChannel = nChannel; // channel

		// Output param
		NET_OUT_GET_COAXIAL_CONTROL_IO_STATUS stOut0 = new NET_OUT_GET_COAXIAL_CONTROL_IO_STATUS();

		if(INetSDK.GetDevCaps(__LoginHandle, nType, stIn0, stOut0, 5000)) {
			ToolKits.writeLog("Speaker State: " + stOut0.emSpeaker);
		} else {
			ToolKits.writeErrorLog("GetDevCaps Failed!" );
		}

		/**turn on/off the Speaker**/
		// Input param
		NET_IN_CONTROL_COAXIAL_CONTROL_IO stIn = new NET_IN_CONTROL_COAXIAL_CONTROL_IO();
		stIn.nChannel = nChannel; 	// channel
		stIn.nInfoCount = 1;  // IO info num

		stIn.stInfo[0].emType = EM_COAXIAL_CONTROL_IO_TYPE.EM_COAXIAL_CONTROL_IO_TYPE_SPEAKER;  // IO control type
		stIn.stInfo[0].emMode = EM_COAXIAL_CONTROL_IO_TRIGGER_MODE.EM_COAXIAL_CONTROL_IO_TRIGGER_MODE_MANUAL_TRIGGER;  // IO trigger mode
		if(stOut0.emSpeaker == EM_COAXIAL_CONTROL_IO_STATUS.EM_COAXIAL_CONTROL_IO_STATUS_ON){
			stIn.stInfo[0].emSwicth = EM_COAXIAL_CONTROL_IO_SWITCH.EM_COAXIAL_CONTROL_IO_SWITCH_CLOSE;
		}else if(stOut0.emSpeaker == EM_COAXIAL_CONTROL_IO_STATUS.EM_COAXIAL_CONTROL_IO_STATUS_OFF){
			stIn.stInfo[0].emSwicth = EM_COAXIAL_CONTROL_IO_SWITCH.EM_COAXIAL_CONTROL_IO_SWITCH_OPEN;
		}else{
			ToolKits.writeLog("ControlDeviceEx Failed,Speaker State Unknow !");
			return;
		}

		// Output param
		NET_OUT_CONTROL_COAXIAL_CONTROL_IO stOut = new NET_OUT_CONTROL_COAXIAL_CONTROL_IO();
		if(INetSDK.ControlDeviceEx(__LoginHandle, CtrlType.SDK_CTRL_COAXIAL_CONTROL_IO, stIn, stOut, 3000)) {
			ToolKits.writeLog("ControlDeviceEx Succeed!");
		} else {
			ToolKits.writeErrorLog("ControlDeviceEx Failed!");
			ToolKits.writeErrorLog("GetLastError:" + INetSDK.GetLastError());
		}

	}

	//play Audio file
	public void StartPlayAudio() {
		//param
		NET_CTRL_START_PLAYAUDIO audioCfg = new NET_CTRL_START_PLAYAUDIO();
		//path of the audio file(include path and file name)
		String audioPath = "/usr/data/audiofiles/audios/Action Held - Abflug.wav";
		char[] file = audioPath.toCharArray();
		System.arraycopy(file, 0, audioCfg.szAudioPath, 0, file.length);

		if (!INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_START_PLAYAUDIO, audioCfg, 3000))
		{
			ToolKits.writeErrorLog("playAudio failed");
		}else{
			ToolKits.writeLog("playAudio succeed");
		}
	}

	public void QueryDevInfoCheckStartInfo() {

		NET_IN_DEV_VARIABLE_CAPS_MANAGER_CHECK_START_INFO stIn = new NET_IN_DEV_VARIABLE_CAPS_MANAGER_CHECK_START_INFO();
		stIn.nChannel = 0;
		stIn.nPtzPresetNum = 2;
		stIn.nPtzPresetID[0] = 125;
		stIn.nPtzPresetID[1] = 20;
		stIn.emFuncType = EM_DEV_VARIABLE_CARS_MANAGER_FUNC_TYPE.EM_DEV_VARIABLE_CARS_MANAGER_FUNC_TYPE_SMART_MOTION;
		NET_CFG_SMART_MOTION_DETECT pStuSmartMotionDetect = new NET_CFG_SMART_MOTION_DETECT();
		pStuSmartMotionDetect.bEnable = true;
		stIn.pFuncTypeInfo = pStuSmartMotionDetect;

		NET_OUT_DEV_VARIABLE_CAPS_MANAGER_CHECK_START_INFO stOut = new NET_OUT_DEV_VARIABLE_CAPS_MANAGER_CHECK_START_INFO(2);

		boolean bRet = INetSDK.QueryDevInfo(__LoginHandle, FinalVar.NET_QUERY_DEV_VARIABLE_CAPS_MANAGER_CHECK_START, stIn, stOut, null, 3000);
		if (!bRet)
		{
			ToolKits.writeErrorLog("QueryDevInfoCheckStartInfo failed,LastError:" + INetSDK.GetLastError());
			return;
		}
		ToolKits.writeLog("QueryDevInfoCheckStartInfo success.");

	}

	public void QueryDevInfoGetFuncTypeListInfo() {

		NET_IN_DEV_VARIABLE_CAPS_MANAGER_GET_FUNC_TYPE_LIST_INFO stIn = new NET_IN_DEV_VARIABLE_CAPS_MANAGER_GET_FUNC_TYPE_LIST_INFO();
		NET_OUT_DEV_VARIABLE_CAPS_MANAGER_GET_FUNC_TYPE_LIST_INFO stOut = new NET_OUT_DEV_VARIABLE_CAPS_MANAGER_GET_FUNC_TYPE_LIST_INFO();

		boolean bRet = INetSDK.QueryDevInfo(__LoginHandle, FinalVar.NET_QUERY_DEV_VARIABLE_CAPS_MANAGER_GET_FUNC_TYPE_LIST, stIn, stOut, null, 3000);
		if (!bRet)
		{
			ToolKits.writeErrorLog("QueryDevInfoGetFuncTypeListInfo failed,LastError:" + INetSDK.GetLastError());
			return;
		}
		ToolKits.writeLog("QueryDevInfoGetFuncTypeListInfo success.");

	}

	public void Config_SmartMotionDetect() {
		NET_CFG_SMART_MOTION_DETECT cfgData = new NET_CFG_SMART_MOTION_DETECT();
		int emCfgOpType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_SMART_MOTION_DETECT;
		int nChannelID = 0;

		// 获取
		if(INetSDK.GetConfig(__LoginHandle, emCfgOpType, nChannelID, cfgData, _waittime, null)) {
			ToolKits.writeLog("bEnable:" + cfgData.bEnable);
			ToolKits.writeLog("emMotionDetectSensitivityLevel:" + cfgData.emMotionDetectSensitivityLevel);
			ToolKits.writeLog("bHuman:" + cfgData.stuMotionDetectObject.bHuman);
			ToolKits.writeLog("bVehicle:" + cfgData.stuMotionDetectObject.bVehicle);
			cfgData.bEnable = true;
			cfgData.emMotionDetectSensitivityLevel = EM_SMART_MOTION_DETECT_SENSITIVITY_LEVEL.EM_SMART_MOTION_DETECT_SENSITIVITY_LEVEL_LOW;
			cfgData.stuMotionDetectObject.bHuman = false;
			cfgData.stuMotionDetectObject.bVehicle = false;
			// 设置
			boolean bRet = INetSDK.SetConfig(__LoginHandle, emCfgOpType, nChannelID, cfgData, _waittime, null, null);
			if(bRet)
			{
				ToolKits.writeLog("SetConfig success");
			}
			else
			{
				ToolKits.writeLog("SetConfig failed,LastError:" + INetSDK.GetLastError());
			}

		}
		else
		{
			ToolKits.writeLog("GetConfig failed,LastError:" + INetSDK.GetLastError());
		}

	}



	void AddMobilePushNotify() {
		NET_IN_ADD_MOBILE_PUSHER_NOTIFICATION stuIn = new NET_IN_ADD_MOBILE_PUSHER_NOTIFICATION(2);
		NET_OUT_ADD_MOBILE_PUSHER_NOTIFICATION stuOut = new NET_OUT_ADD_MOBILE_PUSHER_NOTIFICATION();
		String strRegisterID = "szRegisterID";
		System.arraycopy(strRegisterID.getBytes(), 0, stuIn.szRegisterID, 0,
				strRegisterID.getBytes().length);

		String strAppID = "szAppID";
		System.arraycopy(strAppID.getBytes(), 0, stuIn.szAppID, 0,
				strAppID.getBytes().length);

		stuIn.emServerType = 2;
		stuIn.emPushGatewayType = 3;
		stuIn.nPeriodOfValidity = 100;

		String strAuthServerAddr = "https://www.google.com/accounts/ClientLogin";
		System.arraycopy(strAuthServerAddr.getBytes(), 0, stuIn.szAuthServerAddr, 0,
				strAuthServerAddr.getBytes().length);

		stuIn.nAuthServerPort = 443;

		String strMainAddr = "https://fcm.googleapis.com/fcm/send";
		System.arraycopy(strMainAddr.getBytes(), 0, stuIn.stuPushServerMain.szAddress, 0,
				strMainAddr.getBytes().length);

		stuIn.stuPushServerMain.nPort = 2001;

		String strPushServerAddr = "https://fcm.googleapis.com/fcm/send";
		System.arraycopy(strPushServerAddr.getBytes(), 0, stuIn.szPushServerAddr, 0,
				strPushServerAddr.getBytes().length);

		stuIn.nPushServerPort = 2002;

		String strDevName = "szDevName";
		System.arraycopy(strDevName.getBytes(), 0, stuIn.szDevName, 0,
				strDevName.getBytes().length);

		String strDevID = "szDevID";
		System.arraycopy(strDevID.getBytes(), 0, stuIn.szDevID, 0,
				strDevID.getBytes().length);

		String strUser = "admin";
		System.arraycopy(strUser.getBytes(), 0, stuIn.szUser, 0,
				strUser.getBytes().length);
		stuIn.bUserEx = true;
		String strUserEx = "admin243rkjwegfmlkermngkmnbkfdjgi4ekjr90i5t04ewigofdsjgvkdsjmngkdfjgikfdujgirtujgifdjbkfdnbkjfhkdfjlkdjh0eorjgosdjfkljhgkdsjhkd111";
		System.arraycopy(strUserEx.getBytes(), 0, stuIn.szUserEx, 0,
				strUserEx.getBytes().length);

		String strCertificate = "szCertificate";
		System.arraycopy(strCertificate.getBytes(), 0, stuIn.szCertificate, 0,
				strCertificate.getBytes().length);

		String strSecretKey = "szSecretKey";
		System.arraycopy(strSecretKey.getBytes(), 0, stuIn.szSecretKey, 0,
				strSecretKey.getBytes().length);

		stuIn.nSubScribeNum = 2;
		String strVideoMotion = "VideoMotion";
		System.arraycopy(strVideoMotion.getBytes(), 0, stuIn.pstuSubscribes[0].szCode, 0,
				strVideoMotion.getBytes().length);

		String strFaceComparision = "FaceComparision";
		System.arraycopy(strFaceComparision.getBytes(), 0, stuIn.pstuSubscribes[1].szCode, 0,
				strFaceComparision.getBytes().length);


		stuIn.pstuSubscribes[0].nChnNum = 2;
		stuIn.pstuSubscribes[1].nChnNum = 2;
		for (int i = 0; i < 2; i++) {
			stuIn.pstuSubscribes[0].nIndexs[i] = i;
			stuIn.pstuSubscribes[1].nIndexs[i] = i;
		}

		NET_CUSTOM_TILTER_OF_FACE_COMPARISION stuCustomTilterOfFaceComparision = new NET_CUSTOM_TILTER_OF_FACE_COMPARISION();
		stuCustomTilterOfFaceComparision.nRegisterGroupCount = 2;
		stuCustomTilterOfFaceComparision.stuRegisterGroup[0].nIndex = 1;
		stuCustomTilterOfFaceComparision.stuRegisterGroup[0].nGroupCount = 1;
		stuCustomTilterOfFaceComparision.stuRegisterGroup[1].nIndex = 1;
		stuCustomTilterOfFaceComparision.stuRegisterGroup[1].nGroupCount = 1;
		String strGroup = "Group1";
		System.arraycopy( strGroup.getBytes(), 0,stuCustomTilterOfFaceComparision.stuRegisterGroup[0].szGroup[0], 0, strGroup.getBytes().length);
		String strGroup2 = "Group2";
		System.arraycopy( strGroup2.getBytes(), 0,stuCustomTilterOfFaceComparision.stuRegisterGroup[1].szGroup[0], 0, strGroup2.getBytes().length);

		stuIn.pstuSubscribes[1].pstuCustomFilter = stuCustomTilterOfFaceComparision;
		for(int j = 0; j < 7; j++) {
			stuIn.stuAllEventPushTime[j][0].bEnable = 1;
			stuIn.stuAllEventPushTime[j][0].iBeginHour = 0;
			stuIn.stuAllEventPushTime[j][0].iBeginMin = 0;
			stuIn.stuAllEventPushTime[j][0].iBeginSec = 0;
			stuIn.stuAllEventPushTime[j][0].iEndHour = 10;
			stuIn.stuAllEventPushTime[j][0].iEndMin = 0;
			stuIn.stuAllEventPushTime[j][0].iEndSec = 0;

			stuIn.stuAllEventPushTime[j][1].bEnable = 1;
			stuIn.stuAllEventPushTime[j][1].iBeginHour = 16;
			stuIn.stuAllEventPushTime[j][1].iBeginMin = 0;
			stuIn.stuAllEventPushTime[j][1].iBeginSec = 0;
			stuIn.stuAllEventPushTime[j][1].iEndHour = 23;
			stuIn.stuAllEventPushTime[j][1].iEndMin = 59;
			stuIn.stuAllEventPushTime[j][1].iEndSec = 59;
		}

			//NET_SUBSCRIBE_INFO_EX      *pstuSubscribes;                         // 订阅类型,由用户申请内存，大小为sizeof(NET_SUBSCRIBE_INFO)*nSubScribeMax
			//stuIn.pstuSubscribes.
			boolean zSet = INetSDK.AddMobilePusherNotification(__LoginHandle, stuIn, stuOut, 5000);
			if (zSet) {
				ToolKits.writeLog("AddMobilePusherNotification success.");
			} else {
				ToolKits.writeLog("AddMobilePusherNotification failed,error is" + INetSDK.GetLastError());
			}

	}

	void MobilePushNotify() {
		String strRegisterID = "szRegisterID";
		String strAppID = "szAppID";
		String strAuthServerAddr = "szAuthServerAddr";
		String strPushServerAddr = "szPushServerAddr";
		String strMainAddr = "stuPushServerMain.szAddress";
		String strRedirectAddr = "stuPushRedirectServer.szAddress";
		String strDevName = "szDevName";
		String strDevID = "szDevID";
		String strUser = "admin";
		String strPsw = "admin";
		String strCertificate = "szCertificate";
		String strSecretKey = "szSecretKey";
		String strNumber = "12345678901";
		String strSound = "music.caf";
		Integer stuErr = new Integer(0);
		Integer stuRes = new Integer(0);

		NET_MOBILE_PUSH_NOTIFY stNotify = new NET_MOBILE_PUSH_NOTIFY(2);
		System.arraycopy(strRegisterID.getBytes(), 0, stNotify.szRegisterID, 0,
				strRegisterID.getBytes().length);
		stNotify.emServerType = EM_MOBILE_SERVER_TYPE.EM_MOBILE_SERVER_TYPE_ANDROID;
		stNotify.nPeriodOfValidity = 100;
		System.arraycopy(strAuthServerAddr.getBytes(), 0,
				stNotify.szAuthServerAddr, 0,
				strAuthServerAddr.getBytes().length);
		stNotify.nAuthServerPort = 2000;
		System.arraycopy(strPushServerAddr.getBytes(), 0,
				stNotify.szPushServerAddr, 0,
				strPushServerAddr.getBytes().length);
		stNotify.nPushServerPort = 2002;
		System.arraycopy(strMainAddr.getBytes(), 0,
				stNotify.stuPushServerMain.szAddress, 0,
				strMainAddr.getBytes().length);
		stNotify.stuPushServerMain.nPort = 2004;
		System.arraycopy(strRedirectAddr.getBytes(), 0,
				stNotify.stuPushRedirectServer.szAddress, 0,
				strRedirectAddr.getBytes().length);
		stNotify.stuPushRedirectServer.nPort = 2006;
		System.arraycopy(strDevName.getBytes(), 0, stNotify.szDevName, 0,
				strDevName.getBytes().length);
		System.arraycopy(strDevID.getBytes(), 0, stNotify.szDevID, 0,
				strDevID.getBytes().length);
		System.arraycopy(strUser.getBytes(), 0, stNotify.szUser, 0,
				strUser.getBytes().length);
		System.arraycopy(strPsw.getBytes(), 0, stNotify.szPassword, 0,
				strPsw.getBytes().length);
		System.arraycopy(strCertificate.getBytes(), 0, stNotify.szCertificate,
				0, strCertificate.getBytes().length);
		System.arraycopy(strSecretKey.getBytes(), 0, stNotify.szSecretKey, 0,
				strSecretKey.getBytes().length);
		stNotify.pstuSubscribes[0].nCode = FinalVar.EVENT_ALARM_MOTIONDETECT;
		stNotify.pstuSubscribes[0].emSubCode = EM_EVENT_SUB_CODE.EM_EVENT_SUB_CODE_UNKNOWN;
		stNotify.pstuSubscribes[0].nChnNum = 2;
		stNotify.pstuSubscribes[0].nIndexs[0] = 1;
		stNotify.pstuSubscribes[0].nIndexs[1] = 2;

		String ipAddr = "172.23.3.191";
		System.arraycopy(ipAddr.getBytes(), 0, stNotify.pstuSubscribes[0].szIndexsExt[0], 0, ipAddr.getBytes().length);


		stNotify.pstuSubscribes[1].nCode = FinalVar.EVENT_ALARM_MOTIONDETECT;
		stNotify.pstuSubscribes[1].emSubCode = EM_EVENT_SUB_CODE.EM_EVENT_SUB_CODE_UNKNOWN;
		stNotify.pstuSubscribes[1].nChnNum = 1;
		stNotify.pstuSubscribes[1].nIndexs[0] = 3;
		System.arraycopy(ipAddr.getBytes(), 0, stNotify.pstuSubscribes[1].szIndexsExt[0], 0, ipAddr.getBytes().length);


		boolean zSet = INetSDK.SetMobilePushNotify(
				__LoginHandle, stNotify, stuErr, stuRes,
				5000);
		if (!zSet) {
			ToolKits.writeErrorLog("SetMobilePushNotify failed");
		}

		NET_MOBILE_PUSH_NOTIFY_CFG_DEL stInCfg = new NET_MOBILE_PUSH_NOTIFY_CFG_DEL();
		System.arraycopy(strRegisterID.getBytes(), 0, stInCfg.szRegisterID, 0,
				strRegisterID.getBytes().length);
		System.arraycopy(strAppID.getBytes(), 0, stInCfg.szAppID, 0,
				strAppID.getBytes().length);
		NET_OUT_DELETECFG stOutCfg = new NET_OUT_DELETECFG();
		boolean zDel = INetSDK.DelMobilePushNotifyCfg(__LoginHandle,
				stInCfg, stOutCfg, 5000);
		if (!zDel) {
			ToolKits.writeErrorLog("DelMobilePushNotifyCfg failed");
		}
	}
	public void Valor_QueryPrivacyInfo() {
//		int _waitTime = 3000;
		Integer retLen = new Integer(0);
		SDKDEV_VIDEOCOVER_CFG[] videoCovers = new SDKDEV_VIDEOCOVER_CFG[1];
		videoCovers[0] = new SDKDEV_VIDEOCOVER_CFG();

		if (INetSDK.GetDevConfig(__LoginHandle, FinalVar.SDK_DEV_VIDEO_COVER, 0, videoCovers, retLen, 3000)) {
				ToolKits.writeLog("Fetched privacy windows succeed");
		} else {
			ToolKits.writeLog("Failed fetching privacy windows");
		}
	}

	// 查询无线网络接入点信息
	void GetDeviceInfoAll() {
//		boolean zRet;
//
//		SDK_IN_MATRIX_GET_CAMERAS stCamerasIn = new SDK_IN_MATRIX_GET_CAMERAS();
//		SDK_OUT_MATRIX_GET_CAMERAS stCamerasOut = new SDK_OUT_MATRIX_GET_CAMERAS(50);
//		zRet = INetSDK.MatrixGetCameras(__LoginHandle, stCamerasIn, stCamerasOut, 5000);
//		if (!zRet) {
//			ToolKits.writeErrorLog("MatrixGetCameras failed");
//		} else {
//			int nCount = stCamerasOut.nRetCameraCount < stCamerasOut.nMaxCameraCount ? stCamerasOut.nRetCameraCount : stCamerasOut.nMaxCameraCount;
//			for (int i = 0; i < nCount; i++) {
//				ToolKits.writeLog(stCamerasOut.pstuCameras[i].nUniqueChannel
//						+ ": "
//						+ new String(stCamerasOut.pstuCameras[i].szDevID)
//						+ " "
//						+ new String(
//								stCamerasOut.pstuCameras[i].stuRemoteDevice.szDevType)
//						+ " "
//						+ new String(
//								stCamerasOut.pstuCameras[i].stuRemoteDevice.szDevName)
//						+ " "
//						+ new String(
//								stCamerasOut.pstuCameras[i].stuRemoteDevice.szIp)
//						+ " "
//						+ new String(
//								stCamerasOut.pstuCameras[i].stuRemoteDevice.szUser));
//			}
//		}
//
//		NET_IN_GET_CAMERA_STATEINFO getIn = new NET_IN_GET_CAMERA_STATEINFO();
//		getIn.bGetAllFlag = true;
//		NET_OUT_GET_CAMERA_STATEINFO getOut = new NET_OUT_GET_CAMERA_STATEINFO(256);
//		zRet = INetSDK.QueryDevInfo(__LoginHandle,
//				FinalVar.NET_QUERY_GET_CAMERA_STATE, getIn, getOut, null, 5000);
//		if (!zRet) {
//			ToolKits.writeErrorLog("QueryDevInfo, NET_QUERY_GET_CAMERA_STATE failed");
//		}


//		NET_IN_GET_DEVICE_INFO_ALL stDevInfoAllIn = new NET_IN_GET_DEVICE_INFO_ALL();
//		NET_OUT_GET_DEVICE_INFO_ALL stDevInfoAllOut = new NET_OUT_GET_DEVICE_INFO_ALL(20);
//		zRet = INetSDK.QueryDevInfo(__LoginHandle,
//				FinalVar.NET_QUERY_DEV_REMOTE_DEVICE_INFO_ALL, stDevInfoAllIn,
//				stDevInfoAllOut, null, 5000);
//		if (!zRet) {
//			ToolKits.writeErrorLog("QueryDevInfo, NET_QUERY_DEV_REMOTE_DEVICE_INFO_ALL failed");
//		} else {
//			for (int i = 0; i < stDevInfoAllOut.pstuInfo.length; i++) {
//				ToolKits.writeLog((i + 1) + ": "
//						+ new String(stDevInfoAllOut.pstuInfo[i].szDevType));
//			}
//		}


//		NET_IN_GET_DEVICE_INFO stDevInfoIn = new NET_IN_GET_DEVICE_INFO();
//		System.arraycopy("172.11.9.17".getBytes(), 0,
//				stDevInfoIn.szAttributeIP, 0, "172.11.9.17".getBytes().length);
//		stDevInfoIn.nAttributePort = 37777;
//		System.arraycopy("admin".getBytes(), 0,
//				stDevInfoIn.szAttributeUsername, 0, "admin".getBytes().length);
//		System.arraycopy("admin".getBytes(), 0,
//				stDevInfoIn.szAttributePassword, 0, "admin".getBytes().length);
//		System.arraycopy("Dahua".getBytes(), 0,
//				stDevInfoIn.szAttributeManufacturer, 0,
//				"Dahua".getBytes().length);
//		NET_OUT_GET_DEVICE_INFO stDevInfoOut = new NET_OUT_GET_DEVICE_INFO();
//		zRet = INetSDK.QueryDevInfo(__LoginHandle,
//				FinalVar.NET_QUERY_DEV_REMOTE_DEVICE_INFO, stDevInfoIn,
//				stDevInfoOut, null, 5000);
//		if (!zRet) {
//			ToolKits.writeErrorLog("QueryDevInfo, NET_QUERY_DEV_REMOTE_DEVICE_INFO failed");
//		}
	}

	public class Tets_CB_fCameraStateCallBack implements
			CB_fCameraStateCallBack {
		@Override
		public void invoke(long lLoginID, long lAttachHandle,
				final NET_CB_CAMERASTATE pBuf) {
			ToolKits.writeLog("lLoginID = " + lLoginID + ", lAttachHandle = "
					+ lAttachHandle + ", nChannel = " + pBuf.nChannel
					+ ", emConnectState = " + pBuf.emConnectState);
		}
	}

	// 订阅摄像头状态
	void AttachCameraState() {
		NET_IN_CAMERASTATE stIn = new NET_IN_CAMERASTATE(1);
		stIn.pChannels[0] = -1;
		stIn.cbCamera = new Tets_CB_fCameraStateCallBack();
		NET_OUT_CAMERASTATE stOut = new NET_OUT_CAMERASTATE();
		long lAttach = INetSDK.AttachCameraState(
				__LoginHandle, stIn, stOut, 3000);
		ToolKits.writeLog("AttachCameraState lAttach: " +  lAttach);
		try {
			sleep(30000); // 仅仅作为测试
		} catch (Exception e) {
			e.printStackTrace();
		}
		boolean zRet = INetSDK.DetachCameraState(lAttach);
		ToolKits.writeLog("DetachCameraState zRet: " + zRet);
	}

	// 设置设备地址信息
	public void SetDevicePosition() {
		String strLog = "";

		NET_IN_SET_DEVICE_POSITION stuIn = new NET_IN_SET_DEVICE_POSITION();
		String strPos = "hangzhou-china";
		System.arraycopy(strPos.getBytes(), 0, stuIn.szPosition, 0,
				strPos.length());

		NET_OUT_SET_DEVICE_POSITION stuOut = new NET_OUT_SET_DEVICE_POSITION();

		if (INetSDK.SetDevicePosition(__LoginHandle, stuIn,
				stuOut, 5000)) {
			// set ok
			strLog += "Set device position to ";
			strLog += stuIn.szPosition;
			strLog += " ok";
			ToolKits.writeLog(strLog);
		} else {
			// set failed
			int nErr = INetSDK.GetLastError();
			strLog += "Set device position to ";
			strLog += stuIn.szPosition;
			strLog += " err";
			ToolKits.writeLog(strLog);
		}
	}

	// 获取设备地址信息
	public void GetDevicePosition() {
		NET_IN_GET_DEVICE_POSITION pstuIn = new NET_IN_GET_DEVICE_POSITION();
		NET_OUT_GET_DEVICE_POSITION pstuOut = new NET_OUT_GET_DEVICE_POSITION();

		if (INetSDK.GetDevicePosition(__LoginHandle, pstuIn,
				pstuOut, 5000)) {
			// get ok
		} else {
			// get failed
			int nErr = INetSDK.GetLastError();
		}
	}

	// 按照时间类型抓图
	public void SnapPictureByEvent() {
		NET_IN_SNAP_BY_EVENT pstuIn = new NET_IN_SNAP_BY_EVENT();
		NET_OUT_SNAP_BY_EVENT pstuOut = new NET_OUT_SNAP_BY_EVENT();

		if (INetSDK.SnapPictureByEvent(__LoginHandle,
				pstuIn, pstuOut, 5000)) {
			// snap ok
		} else {
			// snap failed
			int nErr = INetSDK.GetLastError();
		}
	}

	public class DevicePicUpload implements CB_fAnalyzerDataCallBack {

		int cnt = 0;

		@Override
		public void invoke(long lAnalyzerHandle, int dwAlarmType,
				Object alarmInfo, byte pBuffer[], int dwBufSize,
				int nSequence, int reserved) {
			cnt ++;
			ToolKits.writeLog("事件[" + cnt + "]已接收，事件码为 " + dwAlarmType);
			switch (dwAlarmType) {
				case  FinalVar.EVENT_IVS_CROSSREGIONDETECTION : {
					ToolKits.writeLog("区域入侵事件");

					DEV_EVENT_CROSSREGION_INFO crossregion_Info = (DEV_EVENT_CROSSREGION_INFO)alarmInfo;
					ToolKits.writeLog(crossregion_Info.toString());
					ToolKits.writeLog("通道号:" + crossregion_Info.nChannelID);
					ToolKits.writeLog("事件名称:" + crossregion_Info.szName);
					ToolKits.writeLog("时间戳（单位毫秒）:" + crossregion_Info.PTS);
					ToolKits.writeLog("事件ID:" + crossregion_Info.nEventID);

					String strFileName = "";
					if (ToolKits.createFile("/mnt/sdcard/NetSDK/", "CrossRegion.jpg")) {
						strFileName = "/mnt/sdcard/NetSDK/CrossRegion.jpg";
					}
					if ("" != strFileName) {
						FileOutputStream fileStream;
						try {
							ToolKits.writeLog("nOffSet:" + 0 + "nLength:" + dwBufSize );
							fileStream = new FileOutputStream(strFileName, true);
							fileStream.write(pBuffer, 0, dwBufSize);
							fileStream.close();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					break;
				}
				default:
					System.out.println("其他事件--------------------"+ dwAlarmType);
					break;
			}

			return;
		}
	}

	// 智能订阅
	public void RealLoadPicEx() {

		new ToolKits.SimpleAsyncTask<Integer>() {
			 @Override
			    protected void onPreExecute() {
			            super.onPreExecute();
			    }

			     @Override
			      protected  Integer doInBackground(Void... params) {

					 // 实时图片接收缓冲大小（字节为单位）
					 NET_PARAM para = new NET_PARAM();
					 para.nPicBufSize = 8*1024*1024;
					 INetSDK.SetNetworkParam(para);

			    	 DevicePicUpload cbProc = new DevicePicUpload();
		        		lanalyHandle = INetSDK.RealLoadPictureEx(
		        				__LoginHandle, 0, FinalVar.EVENT_IVS_ALL, true, cbProc, 0);
		        		if (lanalyHandle != 0) {
		        				ToolKits.writeLog(" 手动抓拍触发0通道");
		        			try {
		        				sleep(10);
		        			} catch (Exception e) {
		        				e.printStackTrace();
		        			}
		        			//INetSDK.StopLoadPic(lHandle);
		        		} else {
		        			ToolKits.writeErrorLog("RealLoadPictureEx Failed.");
		        		}

			        	return 0;
			     }
			     @Override
			     protected void onPostExecute(Integer result) {
			    	 ToolKits.writeLog("SimpleAsyncTask result: " + result);
			      }
		}.execute();

	}

	public class TestfGpsInfoCallBack implements CB_fSubcribeGPSCallBack {
		@Override
		public void invoke(long lLoginID, GPS_Info gpsInfo) {
			ToolKits.writeLog("TestfGpsInfoCallBack");
		}
	}

	// GPS信息订阅
	public void SubcribeGPS() {
		TestfGpsInfoCallBack stCb = new TestfGpsInfoCallBack();
		INetSDK.SetSubcribeGPSCallBack(stCb);

		// 订阅
		INetSDK.SubcribeGPS(__LoginHandle, true, 3000, 3);

		try {
			sleep(10);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 取消订阅
		INetSDK.SubcribeGPS(__LoginHandle, false, 0, 0);
	}

	// 车载相关配置,
	public void AboutVehicleConfig() {

		int nChannel = 0;
		SDKDEV_ABOUT_VEHICLE_CFG stOut[] = new SDKDEV_ABOUT_VEHICLE_CFG[1];
		stOut[0] = new SDKDEV_ABOUT_VEHICLE_CFG();
		Integer nRetLen = new Integer(0);
		boolean bRet = INetSDK.GetDevConfig(__LoginHandle,
				FinalVar.SDK_DEV_ABOUT_VEHICLE_CFG, nChannel, stOut, nRetLen,
				3000);
		if (!bRet) {
			return;
		}

		bRet = INetSDK.SetDevConfig(__LoginHandle,
				FinalVar.SDK_DEV_ABOUT_VEHICLE_CFG, nChannel, stOut, 5000);
		if (bRet) {
			//
		} else {
			//
		}
	}

	public class TestfBurnFileCallBack implements CB_fBurnFileCallBack {
		@Override
		public void invoke(long lLoginID, long lUploadHandle, int nTotalSize,
				int nSendSize) {
			ToolKits.writeLog("TestfBurnFileCallBack");
		}
	}



	public void GetDevWifiListInfo(){
		NET_IN_GET_DEV_WIFI_LIST stIn = new NET_IN_GET_DEV_WIFI_LIST();
		NET_OUT_GET_DEV_WIFI_LIST stOut = new NET_OUT_GET_DEV_WIFI_LIST();
		stIn.nPort = 37777;
		String devIp = "10.35.228.136";
		System.arraycopy(devIp.getBytes(), 0, stIn.szDevIP, 0, devIp.length());
		if(INetSDK.GetDevWifiListInfo(stIn,stOut,10000)){
			ToolKits.writeLog("WlanDevCount = "+ stOut.nWlanDevCount);
			for(int i = 0; i < stOut.nWlanDevCount; i ++){
				ToolKits.writeLog("szMacAddr : " + new String(stOut.stuWlanDev[i].szMacAddr));
				ToolKits.writeLog("szSSID : " + new String(stOut.stuWlanDev[i].szSSID));
				ToolKits.writeLog("byWifiType : " + stOut.stuWlanDev[i].byWifiType);
			}
		}

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

	public class TestfAnalyzerDataCallBack implements CB_fAnalyzerDataCallBack {
		@Override
		public void invoke(long lAnalyzerHandle, int dwAlarmType,
				Object pAlarmInfo, byte pBuffer[], int dwBufSize,
				int nSequence, int reserved) {
			ToolKits.writeLog("TestfAnalyzerDataCallBack");
			ToolKits.writeLog("dwAlarmType = " + dwAlarmType);
			switch (dwAlarmType) {
				case FinalVar.EVENT_IVS_SNAPMANUAL: {
					DEV_EVENT_SNAPMANUAL eventObj = (DEV_EVENT_SNAPMANUAL) pAlarmInfo;
					ToolKits.writeLog("SNAPMANUAL事件：DEV_EVENT_SNAPMANUAL UTC:" + eventObj.UTC.toStringTime() + ",szName:" + new String(eventObj.szName).trim());
					break;
				}
				case FinalVar.EVENT_IVS_ACCESS_CTL:  ///< 门禁事件
				{
					DEV_EVENT_ACCESS_CTL_INFO eventObj = (DEV_EVENT_ACCESS_CTL_INFO) pAlarmInfo;
					ToolKits.writeLog("DEV_EVENT_ACCESS_CTL_INFO UTC:" + eventObj.UTC.toStringTime() + " OpenMethod:" + eventObj.emOpenMethod + " EventType:" + eventObj.emEventType);
					if (dwBufSize > 0) {
						savePicture(pBuffer, dwBufSize, "Access_Ctl");
					}
					ToolKits.writeLog("class = " + new String(eventObj.szClassNumberEx).trim());
					break;
				}
				case FinalVar.EVENT_IVS_ANATOMY_TEMP_DETECT: {
					DEV_EVENT_ANATOMY_TEMP_DETECT_INFO eventObj = (DEV_EVENT_ANATOMY_TEMP_DETECT_INFO) pAlarmInfo;
					ToolKits.writeLog("温度异常报警：EVENT_IVS_ANATOMY_TEMP_DETECT UTC:" + eventObj.UTC.toStringTime() + ",nAction" + eventObj.nAction + ",szName:" + new String(eventObj.szName).trim());
					//保存可见光全景图
					if(eventObj.stVisSceneImage.nLength > 0)
					{
						byte[] VisSceneImage = new byte[eventObj.stVisSceneImage.nLength];
						System.arraycopy(pBuffer, eventObj.stVisSceneImage.nOffset, VisSceneImage, 0, VisSceneImage.length);
						savePicture(VisSceneImage, VisSceneImage.length, "1AnatomyTempDetect_VisSceneImage");
					}
					//保存热成像全景图
					if(eventObj.stThermalSceneImage.nLength > 0)
					{
						byte[] ThermalSceneImage = new byte[eventObj.stThermalSceneImage.nLength];
						System.arraycopy(pBuffer, eventObj.stThermalSceneImage.nOffset, ThermalSceneImage, 0, ThermalSceneImage.length);
						savePicture(ThermalSceneImage, ThermalSceneImage.length, "1AnatomyTempDetect_ThermalSceneImage");
					}
					break;
				}
				case FinalVar.EVENT_IVS_CROSSREGIONDETECTION: {
					DEV_EVENT_CROSSREGION_INFO eventObj = (DEV_EVENT_CROSSREGION_INFO) pAlarmInfo;
					ToolKits.writeLog("区域入侵：EVENT_IVS_CROSSREGIONDETECTION UTC:" + eventObj.UTC.toStringTime() + ",szName:" + new String(eventObj.szName).trim());
					//保存可见光全景图
//					if(eventObj..nLength > 0)
//					{
//						byte[] VisSceneImage = new byte[eventObj.stVisSceneImage.nLength];
//						System.arraycopy(pBuffer, eventObj.stVisSceneImage.nOffset, VisSceneImage, 0, VisSceneImage.length);
//						savePicture(VisSceneImage, VisSceneImage.length, "1AnatomyTempDetect_VisSceneImage");
//					}
//					//保存热成像全景图
//					if(eventObj.stThermalSceneImage.nLength > 0)
//					{
//						byte[] ThermalSceneImage = new byte[eventObj.stThermalSceneImage.nLength];
//						System.arraycopy(pBuffer, eventObj.stThermalSceneImage.nOffset, ThermalSceneImage, 0, ThermalSceneImage.length);
//						savePicture(ThermalSceneImage, ThermalSceneImage.length, "1AnatomyTempDetect_ThermalSceneImage");
//					}
					break;
				}
				case FinalVar.EVENT_IVS_FACERECOGNITION:  ///< 目标识别事件
				{
					DEV_EVENT_FACERECOGNITION_INFO eventObj = (DEV_EVENT_FACERECOGNITION_INFO) pAlarmInfo;
					ToolKits.writeLog("目标识别报警：EVENT_IVS_FACERECOGNITION UTC:" + eventObj.UTC.toStringTime() + "face data dbTemperature:" + eventObj.stuFaceData.dbTemperature);

					/////////////// 保存全景图 ///////////////////
					if(eventObj.bGlobalScenePic) {
						byte[] globalBuffer = new byte[eventObj.stuGlobalScenePicInfo.dwFileLenth];
						System.arraycopy(pBuffer, eventObj.stuGlobalScenePicInfo.dwOffSet, globalBuffer, 0, globalBuffer.length);
						savePicture(globalBuffer, globalBuffer.length, "1FaceRecognition_Global");
					}

					/////////////// 保存人脸图 /////////////////////////
					if(eventObj.stuObject.stPicInfo.dwFileLenth > 0) {
						byte[] personBuffer = new byte[eventObj.stuObject.stPicInfo.dwFileLenth];
						System.arraycopy(pBuffer, eventObj.stuObject.stPicInfo.dwOffSet, personBuffer, 0, personBuffer.length);
						savePicture(personBuffer, personBuffer.length, "1FaceRecognition_Person");
					}
					///////////////// 保存底库图 ///////////////////
					if(eventObj.stuCandidatesEx[0].stPersonInfo.wFacePicNum > 0)
					{
						byte[] FacePicBuffer = new byte[eventObj.stuCandidatesEx[0].stPersonInfo.szFacePicInfo[0].dwFileLenth];
						System.arraycopy(pBuffer, eventObj.stuCandidatesEx[0].stPersonInfo.szFacePicInfo[0].dwOffSet, FacePicBuffer, 0, FacePicBuffer.length);
						savePicture(FacePicBuffer, FacePicBuffer.length, "1FaceRecognition_FacePic");

					}

					break;
				}
				case FinalVar.EVENT_IVS_TRAFFIC_NON_MOTOR_RETROGRADE:  ///< 非机动车逆行事件
				{
					DEV_EVENT_TRAFFIC_NON_MOTOR_RETROGRADE_INFO eventObj = (DEV_EVENT_TRAFFIC_NON_MOTOR_RETROGRADE_INFO) pAlarmInfo;
					ToolKits.writeLog("非机动车逆行报警：EVENT_IVS_TRAFFIC_NON_MOTOR_RETROGRADE UTC:" + eventObj.UTC.toStringTime() + " Event ID:" + eventObj.nEventID);
					/////////////// 非机动车信息 ///////////////////
					for(int i = 0; i < eventObj.stuNonMotor.nNumOfCycling; i ++) {
						ToolKits.writeLog("Sex:" + eventObj.stuNonMotor.stuRiderList[i].emSex + " Age:" + eventObj.stuNonMotor.stuRiderList[i].nAge);
						ToolKits.writeLog("Sex:" + eventObj.stuNonMotor.stuRiderList[i].emHasHat + " Age:" + eventObj.stuNonMotor.stuRiderList[i].emMask);
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
					DEV_EVENT_TRAFFIC_NONMOTOR_OVERLOAD_INFO eventObj = (DEV_EVENT_TRAFFIC_NONMOTOR_OVERLOAD_INFO) pAlarmInfo;
					ToolKits.writeLog("非机动车超载报警：EVENT_IVS_TRAFFIC_NONMOTOR_OVERLOAD UTC:" + eventObj.UTC.toStringTime() + " Event ID:" + eventObj.nEventID);
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
					DEV_EVENT_TRAFFIC_NONMOTOR_WITHOUTSAFEHAT_INFO eventObj = (DEV_EVENT_TRAFFIC_NONMOTOR_WITHOUTSAFEHAT_INFO) pAlarmInfo;
					ToolKits.writeLog("非机动车未戴头盔报警：EVENT_IVS_TRAFFIC_NONMOTOR_WITHOUTSAFEHAT UTC:" + eventObj.UTC.toStringTime() + " Event ID:" + eventObj.nEventID);
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
					DEV_EVENT_TRAFFIC_NONMOTOR_RUN_REDLIGHT_INFO eventObj = (DEV_EVENT_TRAFFIC_NONMOTOR_RUN_REDLIGHT_INFO) pAlarmInfo;
					ToolKits.writeLog("非机动车闯红灯报警：EVENT_IVS_TRAFFIC_NONMOTOR_RUN_REDLIGHT UTC:" + eventObj.UTC.toStringTime() + " Event ID:" + eventObj.nEventID);
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
					DEV_EVENT_TRAFFIC_PEDESTRAINRUNREDLIGHT_INFO eventObj = (DEV_EVENT_TRAFFIC_PEDESTRAINRUNREDLIGHT_INFO) pAlarmInfo;
					ToolKits.writeLog("行人闯红灯报警：EVENT_IVS_TRAFFIC_PEDESTRAINRUNREDLIGHT UTC:" + eventObj.UTC.toStringTime() + " Event ID:" + eventObj.nEventID);
					/////////////// 行人信息 ///////////////////
					ToolKits.writeLog("nObjectID:" + eventObj.stuObject.nObjectID + " szObjectType:" + new String(eventObj.stuObject.szObjectType).trim());

					/////////////// 行人图 ///////////////////
					if(eventObj.stuObject.stPicInfo.dwFileLenth > 0) {
						byte[] personBuffer = new byte[eventObj.stuObject.stPicInfo.dwFileLenth];
						System.arraycopy(pBuffer, eventObj.stuObject.stPicInfo.dwOffSet, personBuffer, 0, personBuffer.length);
						savePicture(personBuffer, personBuffer.length, "RunLight_PersonFacePic");
					}
					/////////////// 保存物体截图 /////////////////////////
					if (dwBufSize > 0) {
						savePicture(pBuffer, dwBufSize, "RunLight_PersonPic");
					}
					break;
				}
				case FinalVar.EVENT_IVS_TRAFFIC_RETROGRADE:  /// 行人闯红灯事件
				{
					DEV_EVENT_TRAFFIC_RETROGRADE_INFO eventObj = (DEV_EVENT_TRAFFIC_RETROGRADE_INFO) pAlarmInfo;
					ToolKits.writeLog("逆行（非机动车）：EVENT_IVS_TRAFFIC_RETROGRADE UTC:" + eventObj.UTC.toStringTime() + " Event ID:" + eventObj.nEventID);
					/////////////// 行人信息 ///////////////////
					ToolKits.writeLog("nObjectID:" + eventObj.stuObject.nObjectID + " szObjectType:" + new String(eventObj.stuObject.szObjectType).trim());
					/////////////// 保存物体截图 /////////////////////////
					if (dwBufSize > 0) {
						savePicture(pBuffer, dwBufSize, "RetroGrade_CommPic");
					}
					/////////////// 保存非机动车截图 /////////////////////////
					if(eventObj.stuNonMotor.stuImage.uLength > 0) {
						byte[] personBuffer = new byte[eventObj.stuNonMotor.stuImage.uLength];
						System.arraycopy(pBuffer, eventObj.stuNonMotor.stuImage.uOffset, personBuffer, 0, personBuffer.length);
						savePicture(personBuffer, personBuffer.length, "RetroGrade_MotorPic");
					}
					///////////////// 保存全景图 ///////////////////
					if(eventObj.stuNonMotor.stuSceneImage.nLength > 0) {
						byte[] personBuffer = new byte[eventObj.stuNonMotor.stuSceneImage.nLength];
						System.arraycopy(pBuffer, eventObj.stuNonMotor.stuSceneImage.nOffSet, personBuffer, 0, personBuffer.length);
						savePicture(personBuffer, personBuffer.length, "RetroGrade_MotorFullPic");
					}
					break;
				}
				case FinalVar.EVENT_ALARM_SMARTMOTION_HUMAN:  /// 智能事件移动侦测（人）
				{
					DEV_EVENT_SMARTMOTION_HUMAN_INFO eventObj = (DEV_EVENT_SMARTMOTION_HUMAN_INFO) pAlarmInfo;
					ToolKits.writeLog(" 智能事件移动侦测（人）：EVENT_ALARM_SMARTMOTION_HUMAN UTC:" + eventObj.UTC.toStringTime() + " Event ID:" + eventObj.nEventID);
					/////////////// 区域信息 ///////////////////
					for(int i = 0; i < eventObj.nSmartRegionNum; i ++){
						ToolKits.writeLog("SmartRegion["+i+"]:");
						ToolKits.writeLog("nRegionID:" + eventObj.stuSmartRegion[i].nRegionID + " szObjectType:" + new String(eventObj.stuSmartRegion[i].szRegionName).trim());
					}
					/////////////// 对象信息 ///////////////////
					for(int i = 0; i < eventObj.nHumanObjectNum; i ++){
						ToolKits.writeLog("HumanObject["+i+"]:");
						ToolKits.writeLog("nHumanID:" + eventObj.stuHumanObject[i].nHumanID + " stuRect:" + eventObj.stuHumanObject[i].stuRect.toString());
					}
					break;
				}
				case FinalVar.EVENT_ALARM_SMARTMOTION_VEHICLE:  /// 智能事件移动侦测（车）
				{
					DEV_EVENT_SMARTMOTION_VEHICLE_INFO eventObj = (DEV_EVENT_SMARTMOTION_VEHICLE_INFO) pAlarmInfo;
					ToolKits.writeLog(" 智能事件移动侦测（车）：EVENT_ALARM_SMARTMOTION_VEHICLE UTC:" + eventObj.UTC.toStringTime() + " Event ID:" + eventObj.nEventID);
					/////////////// 区域信息 ///////////////////
					for(int i = 0; i < eventObj.nSmartRegionNum; i ++){
						ToolKits.writeLog("SmartRegion["+i+"]:");
						ToolKits.writeLog("nRegionID:" + eventObj.stuSmartRegion[i].nRegionID + " szObjectType:" + new String(eventObj.stuSmartRegion[i].szRegionName).trim());
					}
					/////////////// 对象信息 ///////////////////
					for(int i = 0; i < eventObj.nVehicleObjectNum; i ++){
						ToolKits.writeLog("VehicleObject["+i+"]:");
						ToolKits.writeLog("nVehicleID:" + eventObj.stuVehicleObject[i].nVehicleID + " stuRect:" + eventObj.stuVehicleObject[i].stuRect.toString());
					}
					break;
				}
				default:
					break;
			}

		}
	}

	public class TestfAsyncTransmitInfoCallBack  implements  CB_fAsyncTransmitInfoCallBack {


		@Override
		public int invoke(long lAttachHandle, NET_CB_TRANSMIT_INFO net_cb_transmit_info) {
			ToolKits.writeLog("TestfAsyncTransmitInfoCallBack");
			return 0;
		}
	}

	public class TestfDecPlayBackPosCallBack implements
			CB_fDecPlayBackPosCallBack {
		@Override
		public void invoke(long lLoginID, int nEncoderID, int dwTotalSize,
				int dwPlaySize) {
			ToolKits.writeLog("TestfDecPlayBackPosCallBack");
		}
	}

	public class TestfMessDataCallBack implements CB_fMessDataCallBack {
		@Override
		public void invoke(long lCommand, NET_CALLBACK_DATA lpData) {
			ToolKits.writeLog("TestfMessDataCallBack");
		}
	}

	public class TestfSnapRev implements CB_fSnapRev {
		@Override
		public void invoke(long lLoginID, byte pBuf[], int RevLen,
				int EncodeType, int CmdSerial) {
			ToolKits.writeLog("TestfSnapRev");
		}
	}

	public class TestfSearchDevicesCB implements CB_fSearchDevicesCB {
		@Override
		public void invoke(DEVICE_NET_INFO_EX pDevNetInfo) {
			ToolKits.writeLog("TestfSearchDevicesCB");
			ToolKits.writeLog(new String(pDevNetInfo.szIP).trim());
			ToolKits.writeLog(new String(pDevNetInfo.szSerialNo).trim());
//			if(new String(pDevNetInfo.szSerialNo))
		}
	}


	public class TestfTransComCallBack implements CB_fTransComCallBack {
		@Override
		public void invoke(long lLoginID, long lTransComChannel,
				byte pBuffer[], int dwBufSize) {
			ToolKits.writeLog("TestfTransComCallBack");
		}
	}

	public class TestMessageCallBack implements CB_fMessageCallBack {
		@Override
		public boolean invoke(int lCommand, long lLoginID, Object obj,
				String pchDVRIP, int nDVRPort) {
			ToolKits.writeLog("TestMessageCallBack");
			ToolKits.writeLog("lCommand ： " + lCommand);

			if(FinalVar.SDK_ALARM_JABLOTRON_ALARM == lCommand) {  // 客户报警产品
				ALARM_JABLOTRONALARM_INFO stInfo = (ALARM_JABLOTRONALARM_INFO)obj;

				ToolKits.writeLog("通道号:" + stInfo.nChannelID);
				ToolKits.writeLog("事件动作:" + stInfo.nAction);  // 事件动作,1表示持续性事件开始, 2表示持续性事件结束
				ToolKits.writeLog("事件名称:" + new String(stInfo.szName).trim());
				ToolKits.writeLog("事件类型:" + stInfo.emAlarmType);
				ToolKits.writeLog("防区号:" + stInfo.nDefenceZone);  // 防区号,1~15
				ToolKits.writeLog("时间:" + stInfo.stuTime.toString());
			} else if(FinalVar.SDK_ALARM_NO_DISK == lCommand) {
				ALARM_NO_DISK_INFO stInfo = (ALARM_NO_DISK_INFO)obj;

				ToolKits.writeLog("无硬盘报警!");
				ToolKits.writeLog("Time:" + stInfo.stuTime.toString());
				ToolKits.writeLog("dwAction:" + stInfo.dwAction);   // 0:Start, 1:Stop
			} else if(FinalVar.SDK_DISKFULL_ALARM_EX == lCommand) {  // 硬盘满报警，数据为1个字节，1为有硬盘满报警，0为无报警。 HDD full alarm
				byte[] diskFull = (byte[]) obj;
				ToolKits.writeLog("length1 : " + diskFull.length);
				if (diskFull[0] == 0) {
					ToolKits.writeLog("no alarm");
				} else if (diskFull[0] == 1) {
					ToolKits.writeLog("HDD full alarm");
				}
			} else if(FinalVar.SDK_DISKERROR_ALARM_EX == lCommand) { // 坏硬盘报警，数据为32个字节，每个字节表示一个硬盘的故障报警状态，1为有报警，0为无报警。  HDD malfunction alarm
				byte[] diskFull = (byte[]) obj;
				ToolKits.writeLog("length2 : " + diskFull.length);
				for (int i = 0; i < diskFull.length; i++) {
					if (diskFull[i] == 0) {
						ToolKits.writeLog("no alarm");
					} else if (diskFull[i] == 1) {
						ToolKits.writeLog("alarm");
					}
				}
			} else if(FinalVar.SDK_ALARM_DISK == lCommand) {  // 硬盘报警   alarm of disk
				ALARM_DISK_INFO stInfo = (ALARM_DISK_INFO) obj;

				ToolKits.writeLog("State" + stInfo.nHDDState);  // 0: Unknown, 1: Running, 2: Offline, 3: Warning, 4: Failed
			} else if(FinalVar.SDK_ALARM_DISK_FLUX == lCommand) {  // 硬盘数据异常事件   disk flux abnormal
				ALARM_DISK_FLUX stInfo = (ALARM_DISK_FLUX)obj;

				ToolKits.writeLog("dwAction:" + stInfo.dwAction);
				ToolKits.writeLog("data flux:" + stInfo.dwDataFlux);  // KB
				ToolKits.writeLog("Time:" + stInfo.stuTime.toString());
			} else if(FinalVar.SDK_ALARM_WIFI_SEARCH == lCommand) {  // 获取到周围环境中WIFI设备上报事件
				ALARM_WIFI_SEARCH_INFO stInfo = (ALARM_WIFI_SEARCH_INFO)obj;

				ToolKits.writeLog("获取到周围环境中WIFI设备上报事件");
			} else if(FinalVar.SDK_ALARM_CGIRECORD == lCommand) {
				ALARM_CGIRECORD stInfo = (ALARM_CGIRECORD)obj;
				ToolKits.writeLog("cgi触发手动录像 \n nAction = " + stInfo.nAction);
				ToolKits.writeLog("nChannelID = " + stInfo.nChannelID);
				ToolKits.writeLog("dbPTS = " + stInfo.dbPTS);
				ToolKits.writeLog("nEventID = " + stInfo.nEventID);
				ToolKits.writeLog("stuTime = " + stInfo.stuTime.toStringTime());
				ToolKits.writeLog("stuStartTime = " + stInfo.stuStartTime.toStringTime());
				ToolKits.writeLog("stuStopTime = " + stInfo.stuStopTime.toStringTime());
			} else if(FinalVar.SDK_ALARM_AIO_APP_CONFIG_EVENT == lCommand) {
				ALARM_AIO_APP_CONFIG_EVENT_INFO stInfo = (ALARM_AIO_APP_CONFIG_EVENT_INFO)obj;
				ToolKits.writeLog("szAddress = " + new String(stInfo.szAddress));
			} else if (FinalVar.SDK_ALARM_ARMMODE_CHANGE_EVENT == lCommand) {
				ALARM_ARMMODE_CHANGE_INFO stInfo = (ALARM_ARMMODE_CHANGE_INFO) obj;
				ToolKits.writeLog("布撤防状态改变事件 : " + "\n" + "emTriggerMode:" + stInfo.emTriggerMode);
			} else if (FinalVar.SDK_ALARM_BYPASSMODE_CHANGE_EVENT == lCommand) {
				ALARM_BYPASSMODE_CHANGE_INFO stInfo = (ALARM_BYPASSMODE_CHANGE_INFO) obj;
				ToolKits.writeLog("旁路状态变化事件 : " + "\n" + "emTriggerMode:" + stInfo.emTriggerMode);
			} else if(FinalVar.SDK_ALARM_ALARM_EX2 == lCommand) {
				ALARM_ALARM_INFO_EX2 stInfo = (ALARM_ALARM_INFO_EX2) obj;
				ToolKits.writeLog("本地报警事件 : " + "\n" + "emSenseType:" + stInfo.emSenseType);
			} else if (FinalVar.SDK_ALARM_ALARMCLEAR == lCommand) {
				ALARM_ALARMCLEAR_INFO stInfo = (ALARM_ALARMCLEAR_INFO) obj;
				ToolKits.writeLog("消警事件 : " + "\n" + "bEventAction:" + stInfo.bEventAction);
			}
			// 上传中盟失败数据个数（对应结构体ALARM_UPLOADPIC_FAILCOUNT_INFO）
			else if (FinalVar.SDK_ALARM_UPLOADPIC_FAILCOUNT == lCommand) {
				ALARM_UPLOADPIC_FAILCOUNT_INFO stInfo = (ALARM_UPLOADPIC_FAILCOUNT_INFO) obj;
				ToolKits.writeLog("TestMessageCallBack SDK_ALARM_UPLOADPIC_FAILCOUNT: "
						 + "failCount: " + stInfo.nFailCount);
			} else if (FinalVar.SDK_ALARM_UPLOAD_PIC_FAILED == lCommand) {
				ALARM_UPLOAD_PIC_FAILED_INFO stInfo = (ALARM_UPLOAD_PIC_FAILED_INFO)obj;
				ToolKits.writeLog("SDK_ALARM_UPLOAD_PIC_FAILED, action = " + stInfo.nAction);
			} else if (FinalVar.SDK_ALARM_HEATIMG_TEMPER == lCommand) {
				ALARM_HEATIMG_TEMPER_INFO stInfo = (ALARM_HEATIMG_TEMPER_INFO)obj;
				ToolKits.writeLog("测温点温度异常 SDK_ALARM_HEATIMG_TEMPER, action = " + stInfo.nAction);
			} else if (FinalVar.SDK_ALARM_BETWEENRULE_TEMP_DIFF == lCommand) {
				ALARM_BETWEENRULE_DIFFTEMPER_INFO stInfo = (ALARM_BETWEENRULE_DIFFTEMPER_INFO)obj;
				ToolKits.writeLog("规则间温差异常 SDK_ALARM_BETWEENRULE_TEMP_DIFF, action = " + stInfo.nAction);
			} else if (FinalVar.SDK_ALARM_HOTSPOT_WARNING == lCommand) {
				ALARM_HOTSPOT_WARNING_INFO stInfo = (ALARM_HOTSPOT_WARNING_INFO)obj;
				ToolKits.writeLog("热点异常 SDK_ALARM_HOTSPOT_WARNING, action = " + stInfo.nAction);
			} else if (FinalVar.SDK_ALARM_COLDSPOT_WARNING == lCommand) {
				ALARM_COLDSPOT_WARNING_INFO stInfo = (ALARM_COLDSPOT_WARNING_INFO)obj;
				ToolKits.writeLog("冷点异常 SDK_ALARM_COLDSPOT_WARNING, action = " + stInfo.nAction);
			} else if (FinalVar.SDK_ALARM_FIREWARNING_INFO == lCommand) {
				ALARM_FIREWARNING_INFO_DETAIL stInfo = (ALARM_FIREWARNING_INFO_DETAIL)obj;
				ToolKits.writeLog("火情事件信息 SDK_ALARM_FIREWARNING_INFO, nChannel = " + stInfo.nChannel);
				for (int i = 0; i < stInfo.nWarningInfoCount; i ++) {
					ToolKits.writeLog("Count = " + i +"SDK_ALARM_FIREWARNING_INFO, nPresetId = " + stInfo.stuFireWarningInfo[i].nPresetId);
				}
			} else if (FinalVar.SDK_ALARM_FIREWARNING == lCommand) {
				ALARM_FIREWARNING_INFO stInfo = (ALARM_FIREWARNING_INFO)obj;
				ToolKits.writeLog("着火点报警事件 SDK_ALARM_FIREWARNING, nChannel = " + stInfo.nChannel);
				ToolKits.writeLog("着火点报警事件  SDK_ALARM_FIREWARNING, nState = " + stInfo.nState);
			} else if (FinalVar.SDK_ALARM_FACE_OVERHEATING == lCommand) {
				ALARM_FACE_OVERHEATING_INFO stInfo = (ALARM_FACE_OVERHEATING_INFO)obj;
				ToolKits.writeLog("温度预 SDK_ALARM_FACE_OVERHEATING, nRelativeId = " + stInfo.nRelativeId);
				ToolKits.writeLog("温度预 SDK_ALARM_FACE_OVERHEATING, nTemperatureUnit = " + stInfo.nTemperatureUnit);
				ToolKits.writeLog("温度预 SDK_ALARM_FACE_OVERHEATING, fTemperature = " + stInfo.fTemperature);
			}
			//DMSS接入智能锁
			else if(FinalVar.SDK_ALARM_ACCESS_CTL_NOT_CLOSE == lCommand){
				ALARM_ACCESS_CTL_NOT_CLOSE_INFO stInfo = (ALARM_ACCESS_CTL_NOT_CLOSE_INFO)obj;
				ToolKits.writeLog("NotClosed nAction = " + stInfo.nAction);
				ToolKits.writeLog("NotClosed nDoor = " + stInfo.nDoor);
				ToolKits.writeLog("NotClosed szDoorName = " + new String(stInfo.szDoorName));
				ToolKits.writeLog("NotClosed stuTime = " + + stInfo.stuTime.dwHour+":"+stInfo.stuTime.dwMinute+":"+stInfo.stuTime.dwSecond);
			}else if(FinalVar.SDK_ALARM_ACCESS_CTL_BREAK_IN == lCommand){
				ALARM_ACCESS_CTL_BREAK_IN_INFO stInfo = (ALARM_ACCESS_CTL_BREAK_IN_INFO)obj;
				ToolKits.writeLog("NotClosed nDoor = " + stInfo.nDoor);
				ToolKits.writeLog("NotClosed szDoorName = " + new String(stInfo.szDoorName));
				ToolKits.writeLog("NotClosed stuTime = " + stInfo.stuTime.toString());
			}else if(FinalVar.SDK_ALARM_ACCESS_CTL_MALICIOUS == lCommand){
				ALARM_ACCESS_CTL_MALICIOUS stInfo = (ALARM_ACCESS_CTL_MALICIOUS)obj;
				ToolKits.writeLog("Malicious emMethod = " + stInfo.emMethod);
				ToolKits.writeLog("Malicious szSerialNum = " + new String(stInfo.szSerialNum));
			}else if(FinalVar.SDK_ALARM_ACCESS_CTL_USERID_REGISTER == lCommand){
				ALARM_ACCESS_CTL_USERID_REGISTER stInfo = (ALARM_ACCESS_CTL_USERID_REGISTER)obj;
				ToolKits.writeLog("UserID Register emMethod = " + stInfo.emMethod);
				ToolKits.writeLog("UserID Register szSerialNum = " + new String(stInfo.szSerialNum));
				ToolKits.writeLog("UserID Register nAction = "+stInfo.nAction);
				ToolKits.writeLog("UserID Register stuTime = " + stInfo.stuTime.dwHour+":"+stInfo.stuTime.dwMinute+":"+stInfo.stuTime.dwSecond);
			}else if(FinalVar.SDK_ALARM_ACCESS_CTL_REVERSELOCK == lCommand){
				ALARM_ACCESS_CTL_REVERSELOCK stInfo = (ALARM_ACCESS_CTL_REVERSELOCK)obj;
				ToolKits.writeLog("ReverseLock emMethod = " + stInfo.emMethod);
				ToolKits.writeLog("ReverseLock szSN = " + new String(stInfo.szSerialNum));
				ToolKits.writeLog("ReverseLock nAction = "+stInfo.nAction);
				ToolKits.writeLog("ReverseLock stuTime = " + stInfo.stuTime.dwHour+":"+stInfo.stuTime.dwMinute+":"+stInfo.stuTime.dwSecond);
			}else if(FinalVar.SDK_ALARM_ACCESS_CTL_USERID_DELETE == lCommand){
				ALARM_ACCESS_CTL_USERID_DELETE stInfo = (ALARM_ACCESS_CTL_USERID_DELETE)obj;
				ToolKits.writeLog("UserID Delete emMethod = " + stInfo.emMethod);
				ToolKits.writeLog("UserID Delete szSN = " + new String(stInfo.szSerialNum));
				ToolKits.writeLog("UserID Delete nAction = "+stInfo.nAction);
				ToolKits.writeLog("UserID Delete stuTime = " + stInfo.stuTime.dwHour+":"+stInfo.stuTime.dwMinute+":"+stInfo.stuTime.dwSecond);
			}else if(FinalVar.SDK_ALARM_ACCESS_DOOR_BELL == lCommand){
				ALARM_ACCESS_DOOR_BELL_INFO stInfo = (ALARM_ACCESS_DOOR_BELL_INFO)obj;
				ToolKits.writeLog("Door Bell SN = " + new String(stInfo.szWirelessDevSN));
				ToolKits.writeLog("Door Bell szName = " + new String(stInfo.szName));
				ToolKits.writeLog("Door Bell nAction = "+stInfo.nChannelID);
				ToolKits.writeLog("Door Bell stuTime = " + stInfo.stuTime.dwHour+":"+stInfo.stuTime.dwMinute+":"+stInfo.stuTime.dwSecond);
			}else if(FinalVar.SDK_ALARM_ACCESS_FACTORY_RESET == lCommand){
				ALARM_ACCESS_FACTORY_RESET_INFO stInfo = (ALARM_ACCESS_FACTORY_RESET_INFO)obj;
				ToolKits.writeLog("Factory Reset SN = " + new String(stInfo.szSmartLockSN));
				ToolKits.writeLog("Factory Reset stuTime = " + stInfo.stuTime.dwHour+":"+stInfo.stuTime.dwMinute+":"+stInfo.stuTime.dwSecond);
			}else if(FinalVar.SDK_ALARM_INPUT_SOURCE_SIGNAL == lCommand){  // 报警输入源信号事件
				ALARM_INPUT_SOURCE_SIGNAL_INFO stInfo = (ALARM_INPUT_SOURCE_SIGNAL_INFO)obj;
				ToolKits.writeLog("报警输入源信号事件 ： ");
				ToolKits.writeLog("nChannelID : " + stInfo.nChannelID);
				ToolKits.writeLog("nAction : " + stInfo.nAction);
				ToolKits.writeLog("stuTime : " + stInfo.stuTime.toString());
			} else if (FinalVar.SDK_ALARM_BOX_ALARM == lCommand) {
				ALARM_BOX_ALARM_INFO info = (ALARM_BOX_ALARM_INFO)obj;
				ToolKits.writeLog("报警盒子本地报警: " + info.toString());
			}else if (FinalVar.SDK_ALARM_NASFILE_STATUS == lCommand) {
				ALARM_NASFILE_STATUS_INFO stInfo = (ALARM_NASFILE_STATUS_INFO)obj;
				ToolKits.writeLog("NAS文件状态事件 ： ");
				ToolKits.writeLog("任务类型: " + stInfo.emTaskType);
				ToolKits.writeLog("任务状态: " + stInfo.emTaskState);
			}
			return true;
		}
	}

	public class TestServiceCallBack implements CB_fServiceCallBack {
		@Override
		public int invoke(long lHandle, String pIp, short wPort, int lCommand,
				Object pParam) {
			ToolKits.writeLog("TestServiceCallBack");
			return 0;
		}
	}

	public class TestfAttachVKCallBack implements CB_fAttachVK {
		@Override
		public void invoke(long lLoginID, long lAttachHandle,
				int nChannelID, NET_VKINFO pstVKInfo) {
			ToolKits.writeLog("TestfAttachVKCallBack");

			return;
		}
	}

	public class TestpfAudioDataCallBack implements CB_pfAudioDataCallBack {
		@Override
		public void invoke(long lTalkHandle, byte pDataBuf[], byte byAudioFlag) {
			ToolKits.writeLog("TestpfAudioDataCallBack");
		}
	}

	public class TestfAttachLowRateWPANCallBack  implements CB_fAttachLowRateWPANCB {
		//public void invoke(long lLoginID, long lAttachHandle, final NET_CODEID_INFO pBuf,  int emError);
		@Override
		public void invoke(long lLoginID, long lAttachHandle, NET_CODEID_INFO pBuf, int emError) {
			ToolKits.writeLog("TestfAttachLowRateWPANCallBack");
			ToolKits.writeLog("nWirelessId:" + pBuf.nWirelessId + "emType:" + pBuf.emType);
			//public long nWirelessId;
			//public int emType;
			//public byte[] szName = new byte[8];
			//public boolean bEnable;
			//public byte[] szCustomName = new byte[64];
			//public int nChannel;
			//public int emMode;
			//public int emSenseMethod;
			//public byte[] szSerialNumber = new byte[32];
		}
	}

	//打印堆栈信息
    void PrintStackTraceLog(){
	    for(StackTraceElement i : Thread.currentThread().getStackTrace()){
	        ToolKits.writeLog("Stack --> " + i);
        }
    }

	// 随便测点
	void TestSomething() {
		String str1 = new String();
		byte[] bt = new byte[440];
		ToolKits.writeLog("When null byte to String , its length  = " + new String(bt).length());
		ToolKits.writeLog("When null byte to String , its trim length  = " + new String(bt).trim().length());
		ToolKits.writeLog("null String length  = " + str1.length());
	}

	// 获取操作员用户名
	void GetOperatorName() {
		NET_IN_GET_OPERATOR_NAME  stInGetOperatorName = new NET_IN_GET_OPERATOR_NAME();
		NET_OUT_GET_OPERATOR_NAME stOutGetOperatorName = new NET_OUT_GET_OPERATOR_NAME();
		boolean bSuccess = INetSDK.GetOperatorName(__LoginHandle, stInGetOperatorName, stOutGetOperatorName, 3000);
		try {
			String strName = new String(stOutGetOperatorName.szOpearatorName);
			ToolKits.writeLog("GetOperatorName bSuccess: " + bSuccess + "name: " + strName);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	// 获取设备刻录信息， 这些接口不要在UI线程中处理，放到子线程处理
	void TestQueryBurnDevInfo()
	{
		new ToolKits.SimpleAsyncTask<Integer>() {
			 @Override
			    protected void onPreExecute() {
			            super.onPreExecute();
			    }
			     @Override
			      protected  Integer doInBackground(Void... params)
			     {
			    	 try {
			    		SDK_BURNING_DEVINFO burnDevInfo = new SDK_BURNING_DEVINFO();
						boolean bRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_BURNING_DEV, burnDevInfo, 5000);
						if (bRet)
						{
							ToolKits.writeLog("query burn dev info success");
							ToolKits.writeLog("burn dev devnum: " + burnDevInfo.dwDevNum);
							for(int i = 0; i < burnDevInfo.dwDevNum; i++)
							{
								ToolKits.writeLog("burn info:  busType: " + burnDevInfo.stDevs[i].dwBusType +
								" driverType: " + burnDevInfo.stDevs[i].dwDriverType + " remainSpace: " + burnDevInfo.stDevs[i].dwRemainSpace +
								" totalSpace: " + burnDevInfo.stDevs[i].dwTotalSpace + " driverName: " +
								 new String(burnDevInfo.stDevs[i].dwDriverName));
							}
						}
						else
						{
							ToolKits.writeErrorLog("query burn dev info err:" );
							return -1;
						}
			    	 }
			    	 catch (Exception e) {
			    		 e.printStackTrace();
			    	 }

			        return 0;
			     }
			     @Override
			     protected void onPostExecute(Integer result) {
			    	 ToolKits.writeLog("SimpleAsyncTask result: " + result);
			      }
		}.execute();
	}

	// 取刻录会话总数， 这些接口不要在UI线程中处理，放到子线程处理
	void QueryBurnSessionNum()
	{
		new ToolKits.SimpleAsyncTask<Integer>() {
			 @Override
			    protected void onPreExecute() {
			            super.onPreExecute();
			    }
			     @Override
			      protected  Integer doInBackground(Void... params)
			     {
			    	 try {
			    		Integer nBurnSessionm = new Integer(0);
						boolean bRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_BURN_SESSION_NUM, nBurnSessionm, 5000);
						if (bRet)
						{
							ToolKits.writeLog("query burn session num success num: " + nBurnSessionm);
						}
						else
						{
							ToolKits.writeErrorLog("query burn session num err:" );
							return -1;
						}
			    	 }
			    	 catch (Exception e) {
			    		 e.printStackTrace();
			    	 }
			        return 0;
			     }
			     @Override
			     protected void onPostExecute(Integer result) {
			    	 ToolKits.writeLog("SimpleAsyncTask result: " + result);
			      }
		}.execute();
	}

	// 测试刻录相关功能（开始/停止刻录会话  开始/停止 刻录，暂停/恢复刻录), 这些接口不要在UI线程中处理，放到子线程处理
	void BurnFunction()
	{
		new ToolKits.SimpleAsyncTask<Integer>() {
			 @Override
			    protected void onPreExecute() {
			            super.onPreExecute();
			    }
			     @Override
			      protected  Integer doInBackground(Void... params)
			     {
			    	 try {

			    		 //////////////////////打开刻录会话/////////////////////////////////////////////
			    		 NET_IN_START_BURN_SESSION stuInStartBurnSession = new NET_IN_START_BURN_SESSION();
			    		 stuInStartBurnSession.nSessionID = 0; // 从0开始

			    		 NET_OUT_START_BURN_SESSION stuOutStartBurnSession = new NET_OUT_START_BURN_SESSION();
						 long lBurnSession = INetSDK.StartBurnSession(__LoginHandle, stuInStartBurnSession,
								 stuOutStartBurnSession, 3000);
						 if(lBurnSession != 0) {
							 ToolKits.writeLog("StartBurnSession result: " + lBurnSession);
						 } else {
							 ToolKits.writeErrorLog("StartBurnSession Failed!" );
						 }


						 //  获取刻录状态
						 NET_IN_BURN_GET_STATE stuInBurnGetState = new  NET_IN_BURN_GET_STATE();
						 NET_OUT_BURN_GET_STATE stuOutBurnGetState = new NET_OUT_BURN_GET_STATE();
						 boolean bBurnGetState = INetSDK.BurnGetState(lBurnSession, stuInBurnGetState, stuOutBurnGetState, 3000);
						 if(bBurnGetState)
						 {
							 ToolKits.writeLog("BurnGetState 刻录状态: " + stuOutBurnGetState.emState + " 刻录错误码: "
									 + stuOutBurnGetState.emErrorCode + " 有无盘刻录: " + stuOutBurnGetState.emExtMode);
						 } else {
							 ToolKits.writeErrorLog("BurnGetState Failed!" );
						 }


						 ///////////////////////////////////监听刻录状态/////////////////////////////////////////////////////
						 NET_IN_ATTACH_STATE stuInAttachState = new NET_IN_ATTACH_STATE();
						 stuInAttachState.lBurnSession  = lBurnSession;
						 stuInAttachState.cbAttachState = new CB_fAttachBurnStateCB() {
							 @Override
							 public void invoke(long lLoginID, long lAttachHandle, final long lBurnSession, NET_OUT_BURN_GET_STATE burnState)
							 {
								 ToolKits.writeLog("call back burn state emState: " + burnState.emState + "emErrorCode: " + burnState.emErrorCode
										  + "lBurnSession: " + lBurnSession);

								 // 当刻录状态为run的时候，可以做打点，暂停/恢复。停止刻录等操作
								 if(NET_BURN_STATE.BURN_STATE_BURNING == burnState.emState)
								 {

									 new Thread(new Runnable() {
							            	@Override
							            	public void run() {
							            		Looper.prepare();

/*							            		 ////////////////////////////打点，重点标记///////////////////////////////////////
							            	     NET_IN_BURN_MARK_TAG stuInBurnMarkTag = new NET_IN_BURN_MARK_TAG();
												 stuInBurnMarkTag.szDescInfo = "mark tag";
												 NET_OUT_BURN_MARK_TAG stuOutBurnMarkTag = new NET_OUT_BURN_MARK_TAG();

												 boolean bMarkTag = INetSDK.BurnMarkTag(lBurnSession, stuInBurnMarkTag, stuOutBurnMarkTag, 3000);
												 ToolKits.writeLog("mark tag result: " + bMarkTag);*/


//												 /////////////////////////////////暂停刻录//////////////////////////////////////
//												 boolean bPauseBurn = INetSDK.PauseBurn(lBurnSession, true);
//												 ToolKits.writeLog("Pause burn result: " + bPauseBurn);
//
//												 /////////////////////////////////恢复刻录//////////////////////////////////////
//												 boolean bRestore = INetSDK.PauseBurn(lBurnSession, false);
//												 ToolKits.writeLog("restore burn result: " + bRestore);

							            		Looper.loop();
							            	}
							            }).start();
								 }
							 }
						 };

						 NET_OUT_ATTACH_STATE stuOutAttachState = new NET_OUT_ATTACH_STATE();
						 long lAttachHandle =  INetSDK.AttachBurnState(__LoginHandle, stuInAttachState, stuOutAttachState, 3000);
						 if(lAttachHandle != 0) {
							 ToolKits.writeLog("AttachBurnState Succeed!");
						 } else {
							 ToolKits.writeErrorLog("AttachBurnState Failed!" );
						 }


						///////////////////////////////////刻录字幕/////////////////////////////////////////
						String strCmdJudicature = FinalVar.CFG_CMD_JUDICATURE;
						CFG_JUDICATURE_INFO judicatureInfo = new CFG_JUDICATURE_INFO();
						// 获取
						boolean bJudicatureGet = ToolKits.GetDevConfig(strCmdJudicature, judicatureInfo, __LoginHandle, -1, 1024*1024*2);
						if(bJudicatureGet) {
							ToolKits.writeLog("GetJudicature Succeed!" + judicatureInfo.nCustomCase + "\n");
							for(int i=0; i<judicatureInfo.nCustomCase; i++) {
								ToolKits.writeLog("使能：" + judicatureInfo.bCustomCase);
								ToolKits.writeLog("案件名称：" + new String(judicatureInfo.stuCustomCases[i].szCaseTitle).trim());
								ToolKits.writeLog("案件内容：" + new String(judicatureInfo.stuCustomCases[i].szCaseContent).trim());
							}
						} else {
							ToolKits.writeErrorLog("GetJudicature Failed!" +INetSDK.GetLastError());
						}
						// 设置
						judicatureInfo.bCustomCase = true;  // TRUE:自定义案件信息////FALSE: 上边szCaseNo等字段有效,用于获取案件编号
						judicatureInfo.nCustomCase = 8; // 在bCustomCase重定义为true时，需要设置

						judicatureInfo.stuCustomCases[1].bCaseNoOsdEn = true;

						for(int i = 0; i < FinalVar.MAX_OSD_TITLE_LEN; i++) {
							judicatureInfo.stuCustomCases[1].szCaseTitle[i] = 0;
						}


						String szCaseTitle2 = "ab";
						System.arraycopy(szCaseTitle2.getBytes(), 0, judicatureInfo.stuCustomCases[1].szCaseTitle, 0, szCaseTitle2.getBytes().length);

						for(int j = 0; j < FinalVar.MAX_OSD_SUMMARY_LEN; j++) {
							judicatureInfo.stuCustomCases[1].szCaseContent[j] = 0;
						}

						String caseContent2 = "12";
						System.arraycopy(caseContent2.getBytes(), 0, judicatureInfo.stuCustomCases[1].szCaseContent, 0, caseContent2.getBytes().length);


						boolean bJudicatureSet = ToolKits.SetDevConfig(strCmdJudicature, judicatureInfo, __LoginHandle, -1, 1024*1024*2);
						if(bJudicatureSet) {
							ToolKits.writeLog("SetJudicature Succeed!");
						} else {
							ToolKits.writeErrorLog("SetJudicature Failed!" );
						}


						/////////////////////////////////// 设置字幕叠加（刻录字幕后，设备自动叠加，这个不需要）///////////////////////////////////////////////
						String strCmdvideoWidget = FinalVar.CFG_CMD_VIDEOWIDGET;
						AV_CFG_VideoWidget videoWidget = new AV_CFG_VideoWidget();
						// 获取
						boolean bvideoWidgetGet = ToolKits.GetDevConfig(strCmdvideoWidget, videoWidget, __LoginHandle, 0, 1024*1024*2);
						if(bvideoWidgetGet) {
							ToolKits.writeLog("GetvideoWidget Succeed!" + "\n" + videoWidget.stuTimeTitle.bEncodeBlend + videoWidget.stuTimeTitle.bEncodeBlendExtra1);
						} else {
							ToolKits.writeErrorLog("GetvideoWidget Failed!" +INetSDK.GetLastError());
						}


						// 设置

						videoWidget.nCustomTitleNum = 1;
						videoWidget.stuCustomTitle[0].bPreviewBlend = true;
						String string = "123456";
						System.arraycopy(string.getBytes(), 0, videoWidget.stuCustomTitle[0].szText, 0, string.getBytes().length);
						boolean bvideoWidgetSet = ToolKits.SetDevConfig(strCmdvideoWidget, videoWidget, __LoginHandle, 0, 1024*1024*2);
						if(bvideoWidgetSet) {
							ToolKits.writeLog("SetvideoWidget Succeed!");
						} else {
							ToolKits.writeErrorLog("SetvideoWidget Failed!" );
						}

						 //////////////////////////////////////开始刻录/////////////////////////////////////
						 NET_IN_START_BURN	 stuInStartBurn = new NET_IN_START_BURN();
						 stuInStartBurn.nDevMask |= (1 << 1); //从0开始，这里刻录设备第2个有效(每位代表是否有效)

						 stuInStartBurn.nChannelCount = 1;
						 stuInStartBurn.szChannels[0] = 1;  //这里测试只第2个通道

						 stuInStartBurn.emMode = NET_BURN_MODE.BURN_MODE_SYNC;
						 stuInStartBurn.emPack = NET_BURN_RECORD_PACK.BURN_PACK_DHAV;
						 stuInStartBurn.emExtMode = NET_BURN_EXTMODE.BURN_EXTMODE_NORMAL;  // 设置有盘/无盘

						 NET_OUT_START_BURN stuOutStartBurn = new NET_OUT_START_BURN();

						 boolean bStartBurn = INetSDK.StartBurn(lBurnSession, stuInStartBurn, stuOutStartBurn, 3000);
						 if(bStartBurn) {
							 ToolKits.writeLog("StartBurn result: " + bStartBurn);
						 } else {
							 ToolKits.writeErrorLog("StartBurn Failed!" );
						 }

						 Thread.currentThread().sleep(20 * 1000, 0);

					    /////////////////////////////////停止刻录//////////////////////////////////////
						boolean bStopBurn = INetSDK.StopBurn(lBurnSession);
						ToolKits.writeLog("StopBurn result: " + bStopBurn);

                         /////////////////////////////////取消监听刻录状态/////////////////////////////////////////////////////
						 boolean bDetachBurnState =  INetSDK.DetachBurnState(lAttachHandle);
						 ToolKits.writeLog("DetachBurnState result: " + bDetachBurnState);

						 ///////////////////////////////关闭刻录会话//////////////////////////////////////
						 boolean bStopBurnSession = INetSDK.StopBurnSession(lBurnSession);
						 ToolKits.writeLog("StopBurnSession result: " + bStopBurnSession);

					    ///////////////////////////////////////////获取主机时间///////////////////////////////////////////
						NET_TIME pDeviceTime = new NET_TIME();
						boolean bQueryDevTime = INetSDK.QueryDeviceTime(__LoginHandle, pDeviceTime, 5000);
						if(bQueryDevTime) {
							ToolKits.writeLog("时间：" + pDeviceTime);
						} else {
							ToolKits.writeErrorLog("QueryDeviceTime Failed!" );
						}
			    	 }
			    	 catch (Exception e) {
			    		 e.printStackTrace();
			    	 }
			        return 0;
			     }
			     @Override
			     protected void onPostExecute(Integer result) {
			    	 ToolKits.writeLog("SimpleAsyncTask result: " + result);
			      }
		}.execute();
	}

	//测试庭审主机配置
	void TestCourtHearingConfig()
	{

		new ToolKits.SimpleAsyncTask<Integer>() {
			 @Override
			    protected void onPreExecute() {
			            super.onPreExecute();
			    }
			     @Override
			      protected  Integer doInBackground(Void... params)
			     {
			    	 try {
			    		 int nChannelNum = NetSDKApplication.getInstance().getDeviceInfo().nChanNum & 0xff;
			    		 ToolKits.writeLog("TestCourtHearingConfig nChannelNum: " + nChannelNum);

			    		 boolean bRet = false;

			    			/////////////////////////一键静音的配置/////////////////////////////////

							CFG_AUDIO_MATRIX_SILENCE stuAudioMatrixSilence = new CFG_AUDIO_MATRIX_SILENCE(5);

				    		 bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_AUDIO_MATRIX_SILENCE, stuAudioMatrixSilence,
				    				__LoginHandle, 0,  1024 * 10);

							if (bRet)
							{
								ToolKits.writeLog("get audio matrix  silence success : " + bRet);

								stuAudioMatrixSilence.nMaxInputListCount = 1;
								stuAudioMatrixSilence.nRetInputListCountOut = 1;
								stuAudioMatrixSilence.pstSilenceInputChn[0].nMatrix = 0;
								stuAudioMatrixSilence.pstSilenceInputChn[0].nOutChannel = 0;
								stuAudioMatrixSilence.pstSilenceInputChn[0].nInputChnConut = 2;
								stuAudioMatrixSilence.pstSilenceInputChn[0].snInputChannel[0] = 1;
								stuAudioMatrixSilence.pstSilenceInputChn[0].snInputChannel[1] = 2;
								bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_AUDIO_MATRIX_SILENCE, stuAudioMatrixSilence,
					    				__LoginHandle, 0, 1024 * 10);
								ToolKits.writeErrorLog("set audio matrix  silence bRet: "  + bRet);

							}
							else
							{
								ToolKits.writeErrorLog("get audio matrix  silence err: " );
							}

							///////////////////一键静音控制接口////////////////////////////////////

							bRet = false;
							NET_IN_AUDIO_MATRIX_SILENCE stuInAudioMatrixSilence = new NET_IN_AUDIO_MATRIX_SILENCE(1);
							stuInAudioMatrixSilence.bEnable = true;
							stuInAudioMatrixSilence.stSlienceChannel[0].nMatrix = 0;
							stuInAudioMatrixSilence.stSlienceChannel[0].nOutChannel = 2;
							stuInAudioMatrixSilence.stSlienceChannel[0].nOutPutChannel[0] = 0;
							stuInAudioMatrixSilence.stSlienceChannel[0].nOutPutChannel[1] = 1;

							NET_OUT_AUDIO_MATRIX_SILENCE stuOutAudioMatrixSilence = new NET_OUT_AUDIO_MATRIX_SILENCE();

							bRet = INetSDK.ControlDeviceEx(__LoginHandle, CtrlType.SDK_CTRL_AUDIO_MATRIX_SILENCE, stuInAudioMatrixSilence,
									stuOutAudioMatrixSilence, 3000);
							ToolKits.writeErrorLog("ControlDeviceEx audio matrix silence bRet: "  + bRet);

			    		 /*
			    		 /////////////////////////////////////////////语言激励配置////////////////////////////////////////////////////
			    		 CFG_AUDIO_SPIRIT stuAudioSpirit = new CFG_AUDIO_SPIRIT(nChannelNum);


			    		boolean bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_AUDIO_SPIRIT, stuAudioSpirit,
			    				__LoginHandle, -1, 2048);

						if (bRet)
						{
							ToolKits.writeLog("get audio spirit config success " + " bEnable: " + stuAudioSpirit.bEnable +
									" nAudioLimit: " + stuAudioSpirit.nAudioLimit +  " nDelayTime " +
									stuAudioSpirit.nDelayTime);


							bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_AUDIO_SPIRIT, stuAudioSpirit,
				    				__LoginHandle, -1, 2048);
							ToolKits.writeErrorLog("set audio spirit config result bRet: "  + bRet);

						}
						else
						{
							ToolKits.writeErrorLog("get audio spirit config err: " );
						}


						/////////////////////////////////////合成通道配置//////////////////////////////////////////////////////////////
						CFG_COMPOSE_CHANNEL stuCompseChannel = new CFG_COMPOSE_CHANNEL();

				    		 bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_COMPOSE_CHANNEL, stuCompseChannel,
				    				__LoginHandle, 0, 2048);

							if (bRet)
							{
								ToolKits.writeLog("get commpose channel success ");

								bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_COMPOSE_CHANNEL, stuCompseChannel,
					    				__LoginHandle, 0, 2048);
								ToolKits.writeErrorLog("set commpose channe bRet: "  + bRet);

							}
							else
							{
								ToolKits.writeErrorLog("get commpose channel err: " );
							}

						 ///////////////////////////////////////////查询下位矩阵输出通道名称/////////////////////////////////////////////////////////////////
						 //下位矩阵配置
							CFG_LOWER_MATRIX_LIST stuLowerMatrixList = new CFG_LOWER_MATRIX_LIST();

				    		 bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_LOWER_MATRIX, stuLowerMatrixList,
				    				__LoginHandle, -1, 2048);

							if (bRet)
							{
								ToolKits.writeLog("get lower matrix success ");

								bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_LOWER_MATRIX, stuLowerMatrixList,
					    				__LoginHandle, -1, 2048);
								ToolKits.writeErrorLog("set lower matrix bRet: "  + bRet);

							}
							else
							{
								ToolKits.writeErrorLog("get lower matrix err: " );
							}*/

						//////////////////////////////////////////////////////////////////////////////////////////////////
						return bRet ? 1 : 0;

			    	 }
			    	 catch (Exception e) {
			    		 e.printStackTrace();
			    	 }
			        return 0;
			     }
			     @Override
			     protected void onPostExecute(Integer result) {
			    	 ToolKits.writeLog("SimpleAsyncTask result: " + result);
			      }
		}.execute();
	}

	// 测试庭审主机相关接口
	void TestCourtHearingInterface()
	{
		new ToolKits.SimpleAsyncTask<Integer>() {
			 @Override
			    protected void onPreExecute() {
			            super.onPreExecute();
			    }
			     @Override
			      protected  Integer doInBackground(Void... params)
			     {
			    	 try {

			    		 boolean bRet = false;

			    			//////////////////////////////////////查询一级输出切换能力///////////////////////////////////////////
				    		SDK_SPLIT_CAPS splitCaps = new  SDK_SPLIT_CAPS();
				    		bRet = INetSDK.GetSplitCaps(__LoginHandle, 1, splitCaps, 3000);
				    		if(bRet)
				    		{
				    			for(int i = 0; i < splitCaps.nModeCount; i++)
				    			{
				    				ToolKits.writeLog("GetSplitCaps ["+ i +  "] emSplitMode: " + splitCaps.emSplitMode[i]);
				    			}
				    			for(int i =0 ; i < splitCaps.nInputChannelCount; i++)
				    			{
				    				ToolKits.writeLog("GetSplitCaps i =   "+ i  +   " szInputChannels: " + splitCaps.szInputChannels[i]);
				    			}
				    		}else {
				    			ToolKits.writeErrorLog("GetSplitCaps Failed!" );
				    		}

				    		bRet = false;
				    		////////////////////////////////////查询分割模式/////////////////////////////////////////////
				    		SDK_SPLIT_MODE_INFO splitModeInfo = new SDK_SPLIT_MODE_INFO();
				    		bRet = INetSDK.GetSplitMode(__LoginHandle, 1, splitModeInfo, 3000);
				    		if(bRet)
				    		{
				    			ToolKits.writeLog("GetSplitMode emSplitMode: " + splitModeInfo.emSplitMode + "\n" +
				    							  " nGroupID: " + splitModeInfo.nGroupID + "\n" +
				    							  "dwDisplayType:" +  splitModeInfo.dwDisplayType+ "\n");
				    		} else {
				    			ToolKits.writeErrorLog("GetSplitMode Failed!" );
				    		}

				    		// SetSplitMode已经封装，但 设备不支持，

				    		///////////////////////////////////查询显示源/////////////////////////////////////////////////////////
//				    		bRet = false;
//				    		int nChannel = 0; // 输出通道号
//				    		int nWindow = -1; // 输出通道对应的窗口号， -1表示所有窗口
//				    		int nMaxSplitSource = 10;
//				    		Integer nRetCount= Integer.valueOf(0);
//				    		SDK_SPLIT_SOURCE szStuSplitSource[] = new SDK_SPLIT_SOURCE[nMaxSplitSource];
//				    		for(int i = 0; i < nMaxSplitSource; i++)
//				    		{
//				    			szStuSplitSource[i] = new SDK_SPLIT_SOURCE();
//				    		}
//				    		bRet = INetSDK.GetSplitSource(__LoginHandle, nChannel, nWindow, szStuSplitSource, nRetCount, 3000);
//				    		if(bRet) {
//				    			ToolKits.writeLog("GetSplitSource  result: " + bRet + " nRetCount: " + nRetCount.intValue());
//				    		} else {
//				    			ToolKits.writeErrorLog("GetSplitSource Failed!" );
//				    		}


				    		// 设置显示源 SetSplitSource已经封装，但设备不支持

				    		////////////////////////////////////设置显示源, 支持同时设置多个窗口///////////////////////////////////////
							NET_IN_SPLIT_SET_MULTI_SOURCE stuInSplitSetMulitSource = new NET_IN_SPLIT_SET_MULTI_SOURCE(2);
							stuInSplitSetMulitSource.emCtrlType = EM_VIDEO_OUT_CTRL_TYPE.EM_VIDEO_OUT_CTRL_CHANNEL;
							stuInSplitSetMulitSource.nChannel   = 1;
							stuInSplitSetMulitSource.bSplitModeEnable = true;
							stuInSplitSetMulitSource.emSplitMode = SDK_SPLIT_MODE.SDK_SPLIT_2;   // 要大于窗口数量nWindowCount
							stuInSplitSetMulitSource.nGroupID    = 0;  // 分割分组号,由 GetSplitMode 获得

							stuInSplitSetMulitSource.nWindowCount  = 2; // 窗口数量
							//
							stuInSplitSetMulitSource.szWindows[0] = 0;
							String DeviceID = "Unique";
							System.arraycopy(DeviceID.getBytes(), 0,stuInSplitSetMulitSource.szStuSources[1].szDeviceID, 0,
									DeviceID.getBytes().length);

							stuInSplitSetMulitSource.szStuSources[0].bEnable    = true;
							stuInSplitSetMulitSource.szStuSources[0].nInterval  = 0;
							stuInSplitSetMulitSource.szStuSources[0].nVideoChannel = 0;
							stuInSplitSetMulitSource.szStuSources[0].nStreamType  = 0;
							//
							stuInSplitSetMulitSource.szWindows[1] = 0;
							String DeviceID1 = "Unique";
							System.arraycopy(DeviceID1.getBytes(), 0,stuInSplitSetMulitSource.szStuSources[1].szDeviceID, 0,
									DeviceID1.getBytes().length);

							stuInSplitSetMulitSource.szStuSources[1].bEnable    = true;
							stuInSplitSetMulitSource.szStuSources[1].nInterval  = 0;
							stuInSplitSetMulitSource.szStuSources[1].nVideoChannel = 0;
							stuInSplitSetMulitSource.szStuSources[1].nStreamType  = 0;
				    		NET_OUT_SPLIT_SET_MULTI_SOURCE stuOutSplitSetMulitSource = new NET_OUT_SPLIT_SET_MULTI_SOURCE();
				    		bRet = INetSDK.SplitSetMultiSource(__LoginHandle, stuInSplitSetMulitSource,
				    				stuOutSplitSetMulitSource, 3000);
				    		if(bRet) {
				    			ToolKits.writeLog("SplitSetMultiSource Succeed!");
				    		} else {
				    			ToolKits.writeErrorLog("SplitSetMultiSource Failed!" );
				    		}


				    		/////////////////////////////配置下位矩阵切换////////////////////////////////
				    		NET_IN_MATRIX_SWITCH stuMatrixSwitchIn = new NET_IN_MATRIX_SWITCH(1, 1);
				    	    int nInChannel = 1;
				    	    int nOutChannel = 1;

				    	    stuMatrixSwitchIn.emSplitMode = SDK_SPLIT_MODE.SDK_SPLIT_6;
				    	    stuMatrixSwitchIn.szOutputChannels[0] = nOutChannel;
				    	    stuMatrixSwitchIn.szInputChannels[0] = nInChannel;

				    	    NET_OUT_MATRIX_SWITCH stuMatrixSwitchOut = new NET_OUT_MATRIX_SWITCH();
				    	    bRet = false;
				    	    bRet = INetSDK.MatrixSwitch(__LoginHandle, stuMatrixSwitchIn, stuMatrixSwitchOut, 3000);
				    	    if(bRet) {
				    	    	ToolKits.writeLog("MatrixSwitch bRet:" + bRet);
				    	    }else {
				    			ToolKits.writeErrorLog("MatrixSwitch Failed!" );
				    		}

/*
				    	    //////////// 查询外接设备//////////////////////////////////////////////////////
				    	    NET_EXTERNAL_DEVICE stuExternalDev = new NET_EXTERNAL_DEVICE();
				    	    bRet = INetSDK.QueryDevState(__LoginHandle,
									FinalVar.SDK_DEVSTATE_EXTERNAL_DEVICE, stuExternalDev, 5000);
				    	    if (bRet)
				    	    {
				    	    	ToolKits.writeLog("query external device info success ");
				    	    	ToolKits.writeLog("device type:" + stuExternalDev.emType + "  device id:" + stuExternalDev.szDevID
				    	    			 + "  device name:" + stuExternalDev.szDevName);
				    	    }

				    		//////////// 时序器操作//////////////////////////////////////////////////////

				    	    ////////////////////////////////////////////////红外面板模板配置/////////////////////////////////////////

				    	    CFG_INFRARED_BOARD_TEMPLATE_GROUP stuInfraredBoardTemplateGroup = new CFG_INFRARED_BOARD_TEMPLATE_GROUP();

				    		 bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_INFRARED_BOARD_TEMPLATE, stuInfraredBoardTemplateGroup,
				    				__LoginHandle, 0, 2048);

							if (bRet)
							{
								ToolKits.writeLog("get infrared board template group success ");

								bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_INFRARED_BOARD_TEMPLATE, stuInfraredBoardTemplateGroup,
					    				__LoginHandle, 0, 2048);
								ToolKits.writeErrorLog("set infrared board template group succes bRet: "  + bRet);

							}
							else
							{
								ToolKits.writeErrorLog("get infrared board template group  err: " );
							}

							 ///////////////////////////////////////////////////////////红外面板配置///////////////////

							CFG_INFRARED_BOARD_GROUP stuInfraredBoardTGroup = new CFG_INFRARED_BOARD_GROUP();

				    		 bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_INFRARED_BOARD, stuInfraredBoardTGroup,
				    				__LoginHandle, 0, 2048);

							if (bRet)
							{
								ToolKits.writeLog("get infrared board  group success nBoardNum: " + stuInfraredBoardTGroup.nBoardNum);

								bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_INFRARED_BOARD, stuInfraredBoardTGroup,
					    				__LoginHandle, 0, 2048);
								ToolKits.writeErrorLog("set infrared board  group succes bRet: "  + bRet);

							}
							else
							{
								ToolKits.writeErrorLog("get infrared board  group  err: " );
							}

							//////////////////////////////////////红外按键控制/////////////////////////////////////
						    NET_CTRL_INFRARED_KEY_PARAM stCtrlInfraredKeyParam = new NET_CTRL_INFRARED_KEY_PARAM();
						    stCtrlInfraredKeyParam.nChannel = 0;
						    stCtrlInfraredKeyParam.nKey     = 1;
						    boolean bControl = INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_INFRARED_KEY, stCtrlInfraredKeyParam, 3000);
						    ToolKits.writeErrorLog("ControlDevice infrared key  bRet: "  + bRet);

						    /////////////////////////////////////上下位矩阵输出关系恢复/////////////////////////////////////////
						    ////////保存上下位矩阵输出关系///////////////
						    NET_CTRL_MATRIX_SAVE_SWITCH stuMatrixSwitchSave = new NET_CTRL_MATRIX_SAVE_SWITCH();
						    stuMatrixSwitchSave.pszName = "up-lower1";
						    bControl = INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_MATRIX_SAVE_SWITCH, stuMatrixSwitchSave, 3000);
						    if (bControl)
						    {
						    	ToolKits.writeLog("ControlDevice matrix  switch save success. Name: " + stuMatrixSwitchSave.pszName);
						    	//////////恢复上下位矩阵输出关系/////////////////
						    	NET_CTRL_MATRIX_RESTORE_SWITCH stuMatrixSwitchRestore = new NET_CTRL_MATRIX_RESTORE_SWITCH();
						    	stuMatrixSwitchRestore.pszName = "up-lower1";
						    	bControl = INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTR_MATRIX_RESTORE_SWITCH, stuMatrixSwitchRestore, 3000);
						    	if (bControl)
						    	{
						    		ToolKits.writeLog("ControlDevice matrix  switch restore success. Name: " + stuMatrixSwitchSave.pszName);
						    	}
						    	else
						    	{
						    		ToolKits.writeErrorLog("ControlDevice matrix  switch restore  err: "  );
						    	}
						    }
						    else
						    {
						    	ToolKits.writeErrorLog("ControlDevice matrix  switch save  err: "  );
						    }*/


			    		 /*// 查询下位矩阵输入输出通道数
			    		 // 查询产品定义
			    		 SDK_PRODUCTION_DEFNITION stuProductionDefnition = new SDK_PRODUCTION_DEFNITION();
			    		 bRet = INetSDK.QueryProductionDefinition(__LoginHandle, stuProductionDefnition, 3000);
			    		 ToolKits.writeLog("QueryProductionDefinition result: " + bRet);

			    		 if(bRet)
			    		 {
			    			 for(int i = 0; i < FinalVar.SDK_MAX_LOWER_MITRIX_NUM; i++)
			    			 {
			    				 ToolKits.writeLog("QueryProductionDefinition zLowerMatrixInputChannels i =  " + i + " inputChannel: " +
			    						 stuProductionDefnition.szLowerMatrixInputChannels[i]);
			    			 }
			    			 for(int i = 0; i < FinalVar.SDK_MAX_LOWER_MITRIX_NUM; i++)
			    			 {
			    				 ToolKits.writeLog("QueryProductionDefinition zLowerMatrixInputChannels i =  " + i + " OutputChannel: " +
			    						 stuProductionDefnition.szLowerMatrixOutputChannels[i]);
			    			 }
			    		 }
			    		 bRet = false;
			    		///////////////////////////////查询输入通道      获取所有有效显示源////////////////////////////////////////////////

			    	    SDK_IN_MATRIX_GET_CAMERAS stuInMatrixGetCameras = new SDK_IN_MATRIX_GET_CAMERAS();
			    	    SDK_OUT_MATRIX_GET_CAMERAS stuOutMatrixGetCameras = new SDK_OUT_MATRIX_GET_CAMERAS(50, 20);
			    	    bRet = INetSDK.MatrixGetCameras(__LoginHandle, stuInMatrixGetCameras, stuOutMatrixGetCameras, 3000);
			    	    ToolKits.writeLog("MatrixGetCameras result: " + bRet);

			    	    if(bRet)
			    	    {
			    	    	 ToolKits.writeLog("MatrixGetCameras nRetCameraCount: " + stuOutMatrixGetCameras.nRetCameraCount  + " nRealChannelCount: " +
			    	    			 stuOutMatrixGetCameras.nRealChannelCount);

			    	    }*/

						//////////////////////////////////////////////////////////////////////////////////////////////////
						return bRet ? 1 : 0;

			    	 }
			    	 catch (Exception e) {
			    		 e.printStackTrace();
			    	 }
			        return 0;
			     }
			     @Override
			     protected void onPostExecute(Integer result) {
			    	 ToolKits.writeLog("SimpleAsyncTask result: " + result);
			      }
		}.execute();
	}

	// 视频分析资源配置
	void VideoAnalyseSourceConfig() {
		boolean zRet;

		int channelID = 0;
		CFG_ANALYSESOURCE_INFO stSrcInfo = new CFG_ANALYSESOURCE_INFO(32);
		zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_ANALYSESOURCE, stSrcInfo, __LoginHandle, channelID, 10240);
		if(zRet) {

			// 设置
			String strPath = "EFC/f2895162c1c14825bac8fe69f5ef574d.dav"/*"EFC/d6c089ca7e184c98aaed2628d26bf08c.dav"*/;
			stSrcInfo.bEnable = true;
			stSrcInfo.nChannelID = channelID;
			stSrcInfo.abDeviceInfo = false;
			stSrcInfo.emSourceType = CFG_VIDEO_SOURCE_TYPE.CFG_VIDEO_SOURCE_FILESTREAM;
			stSrcInfo.stuSourceFile.emFileType = CFG_SOURCE_FILE_TYPE.CFG_SOURCE_FILE_RECORD;
			System.arraycopy(strPath.getBytes(), 0, stSrcInfo.stuSourceFile.szFilePath, 0, strPath.length());
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_ANALYSESOURCE, stSrcInfo, __LoginHandle, channelID, 10240);

		}
	}

	// 订阅智能分析进度
	public void AttachVideoAnalyseState() {
		boolean zRet;

		NET_IN_ATTACH_VIDEOANALYSE_STATE stAttachIn = new NET_IN_ATTACH_VIDEOANALYSE_STATE();
		stAttachIn.nChannleId = 0;
		NET_OUT_ATTACH_VIDEOANALYSE_STATE stAttachOut = new NET_OUT_ATTACH_VIDEOANALYSE_STATE();
		zRet = INetSDK.AttachVideoAnalyseState(__LoginHandle, stAttachIn, new Test_CB_fVideoAnalyseState(), stAttachOut, 5000);

		NET_CTRL_START_VIDEO_ANALYSE stStartAnalyse = new NET_CTRL_START_VIDEO_ANALYSE();
		stStartAnalyse.nChannelId = 0;
		zRet = INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_START_VIDEO_ANALYSE, stStartAnalyse, 5000);

		try {
			sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 停止视频智能分析
		NET_CTRL_STOP_VIDEO_ANALYSE stStopAnalyse = new NET_CTRL_STOP_VIDEO_ANALYSE();
		stStopAnalyse.nChannelId = 0;
		zRet = INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_STOP_VIDEO_ANALYSE, stStopAnalyse, 5000);

		// 取消订阅
		zRet = INetSDK.DetachVideoAnalyseState(stAttachOut.lAttachHandle);;
	}

	// 视频输入颜色配置
	void VideoColorConfig() {
		AV_CFG_ChannelVideoColor info = new AV_CFG_ChannelVideoColor();
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEOCOLOR, info, __LoginHandle, 0, 10240);
		if (!zRet) {
			ToolKits.writeErrorLog("GetDevConfig failed, " + FinalVar.CFG_CMD_VIDEOCOLOR);
		} else {
			ToolKits.writeLog("GetDevConfig succeed, " + FinalVar.CFG_CMD_VIDEOCOLOR);
			for(int i = 0; i < info.nColorNum; i ++){
				ToolKits.writeLog("stuColor[" + i + "].nBrightness =  " + info.stuColor[i].nBrightness);
				ToolKits.writeLog("stuColor[" + i + "].nSaturation =  " + info.stuColor[i].nSaturation);
				ToolKits.writeLog("stuColor[" + i + "].nContrast =  " + info.stuColor[i].nContrast);
				ToolKits.writeLog("stuColor[" + i + "].nHue =  " + info.stuColor[i].nHue);
				info.stuColor[i].nBrightness++;
				info.stuColor[i].nSaturation++;
				info.stuColor[i].nContrast++;
				info.stuColor[i].nHue++;
			}

			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEOCOLOR, info, __LoginHandle, 0, 10240);
			if (!zRet) {
				ToolKits.writeErrorLog("SetDevConfig failed, " + FinalVar.CFG_CMD_VIDEOCOLOR);
			}else{
				ToolKits.writeLog("SetDevConfig succeed, " + FinalVar.CFG_CMD_VIDEOCOLOR);
			}
		}
	}

	//
	void HDVR_VSPConfig() {

		CFG_DSPENCODECAP_INFO info = new CFG_DSPENCODECAP_INFO();

		boolean result = false;
		Integer error = new Integer(0);
		char szBuffer[] = new char[10240];

		if(INetSDK.GetNewDevConfig( __LoginHandle, FinalVar.CFG_CMD_HDVR_DSP , 0, szBuffer,10240,error,10000) )
		{
			if( INetSDK.ParseData(FinalVar.CFG_CMD_HDVR_DSP ,szBuffer , info , null ) )
			{
				ToolKits.writeLog("GetDevConfig succeed, " + FinalVar.CFG_CMD_VIDEOCOLOR);
				ToolKits.writeLog("dwVideoStandardMask =  " + info.dwVideoStandardMask);
				ToolKits.writeLog("dwStreamCap =  " + info.dwStreamCap);
				result = true;
			}
			else
			{
				ToolKits.writeErrorLog("Parse " + FinalVar.CFG_CMD_HDVR_DSP + " Config Failed!");
				result = false;
			}
		}
		else
		{
			ToolKits.writeErrorLog("Get" + FinalVar.CFG_CMD_HDVR_DSP + " Config Failed!");
			result = false;
		}
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_HDVR_DSP, info, __LoginHandle, 0, 10240);
		if (!zRet) {
			ToolKits.writeErrorLog("GetDevConfig failed, " + FinalVar.CFG_CMD_VIDEOCOLOR);
		} else {
			ToolKits.writeLog("GetDevConfig succeed, " + FinalVar.CFG_CMD_VIDEOCOLOR);
			ToolKits.writeLog("dwVideoStandardMask =  " + info.dwVideoStandardMask);
			ToolKits.writeLog("dwStreamCap =  " + info.dwStreamCap);
		}
//
//		CFG_ENCODE_INFO info2 = new CFG_ENCODE_INFO();
//		boolean zRet2 = ToolKits.GetDevConfig(FinalVar.CFG_CMD_ENCODE, info2, __LoginHandle, 0, 10240);
//		if (!zRet2) {
//			ToolKits.writeErrorLog("GetDevConfig failed, " + FinalVar.CFG_CMD_ENCODE);
//		} else {
//			ToolKits.writeLog("GetDevConfig succeed, " + FinalVar.CFG_CMD_ENCODE);
//			ToolKits.writeLog("nValidCountExtraStream =  " + info2.nValidCountExtraStream);
//		}

	}



	// 四川移动看店启迪平台接入配置
	void VSP_SCYDKDConfig() {
		CFG_VSP_SCYDKD_INFO info = new CFG_VSP_SCYDKD_INFO();
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_VSP_SCYDKD, info, __LoginHandle, -1, 10240);
		if (!zRet) {
			ToolKits.showErrorMessage(this, "GetDevConfig failed, " + FinalVar.CFG_CMD_VSP_SCYDKD);
		} else {
			System.arraycopy("admin".getBytes(), 0, info.szUserName, 0, "admin".length());
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_VSP_SCYDKD, info, __LoginHandle, -1, 10240);
			if (!zRet) {
				ToolKits.showErrorMessage(this, "SetDevConfig failed, " + FinalVar.CFG_CMD_VSP_SCYDKD);
			}
		}
	}

	// 合成通道配置  庭审主机使用，证物切换功能
	public void ComposeLinkageConfig() {
		CFG_COMPOSE_CHANNEL info2 = new CFG_COMPOSE_CHANNEL();
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_COMPOSE_LINKAGE, info2, __LoginHandle, 0, 10240);
		if (!zRet) {
			ToolKits.showErrorMessage(this, "GetDevConfig failed, " + FinalVar.CFG_CMD_COMPOSE_LINKAGE);
		} else {
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_COMPOSE_LINKAGE, info2, __LoginHandle, 0, 10240);
			if (!zRet) {
				ToolKits.showErrorMessage(this, "SetDevConfig failed, " + FinalVar.CFG_CMD_COMPOSE_LINKAGE);
			}
		}
	}

	// 查询外接设备信息
	public void QueryExternalDeviceInfo() {
		NET_EXTERNAL_DEVICE device[] = new NET_EXTERNAL_DEVICE[8];
		for (int i = 0; i < device.length; i++) {
			device[i] = new NET_EXTERNAL_DEVICE();
		}
		boolean zRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_EXTERNAL_DEVICE, device, 3000);
		if (zRet) {
			for (int i = 0; i < device.length; i++) {
				if (device[i].emType == NET_EXT_DEV_TYPE.EXT_DEV_UNKNOWN) {
					break;
				}

				if (device[i].emType == NET_EXT_DEV_TYPE.EXT_DEV_SEQUENCE_POWER) {
					int n = 0;
					for (int j = 0; j < device[i].szDevID.length; j++) {
						if (device[i].szDevID[j] != 0) {
							n++;
						} else {
							break;
						}
					}

					// 获取电源时序器能力
					NET_IN_CAP_SEQPOWER stIn = new NET_IN_CAP_SEQPOWER();
					stIn.pszDeviceID = new String(device[i].szDevID, 0, n);
					NET_OUT_CAP_SEQPOWER stOut = new NET_OUT_CAP_SEQPOWER();
					zRet = INetSDK.GetDevCaps(__LoginHandle, FinalVar.NET_DEV_CAP_SEQPOWER, stIn, stOut, 3000);
					if (zRet) {
						ToolKits.writeLog("nChannelNum = " + stOut.nChannelNum);
					}
				}
			}
		}
	}

	// 查询录象状态详细信息
	public void QueryRecordingDetails() {
		NET_RECORD_STATE_DETAIL record = new NET_RECORD_STATE_DETAIL();
		boolean zRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_RECORDING_DETAIL, record, 3000);
		if (zRet) {
			ToolKits.writeLog("QueryDevState-SDK_DEVSTATE_RECORDING_DETAIL succeed!");
			ToolKits.writeLog("bMainStream = " + record.bMainStream);
			ToolKits.writeLog("bExtraStream1 = " + record.bExtraStream1);
			ToolKits.writeLog("bExtraStream2 = " + record.bExtraStream2);
			ToolKits.writeLog("bExtraStream3 = " + record.bExtraStream3);
		} else {
			ToolKits.writeErrorLog("QueryDevState-SDK_DEVSTATE_RECORDING_DETAIL failed!");
		}
	}

	// 录像策略设置和查询
	void CfgRecordConfig() {
		boolean bRet = false;
		String szCommand = FinalVar.CFG_CMD_RECORD;
		CFG_RECORD_INFO recordInfo = new CFG_RECORD_INFO();

		// 获取
		bRet = ToolKits.GetDevConfig(szCommand, recordInfo, __LoginHandle, 0, 2*1024*1024);
		if(bRet) {
			ToolKits.writeLog("GetNewDevConfig-CFG_CMD_RECORD Succeed!" );
			ToolKits.writeLog("nPreRecTime = " + recordInfo.nPreRecTime);
			ToolKits.writeLog("bHolidayEn = " + recordInfo.bHolidayEn);
			recordInfo.nPreRecTime ++;
			recordInfo.bHolidayEn = !recordInfo.bHolidayEn;
			boolean bRet2 = ToolKits.SetDevConfig(szCommand, recordInfo, __LoginHandle, 0, 2*1024*1024);
			if(bRet2) {
				ToolKits.writeLog("setNewDevConfig-CFG_CMD_RECORD Succeed!");
			} else {
				ToolKits.writeErrorLog("setNewDevConfig-CFG_CMD_RECORD Failed!" );
			}
		} else {
			ToolKits.writeErrorLog("GetNewDevConfig-CFG_CMD_RECORD Failed!" );
		}
	}

	// 球机机芯日夜配置
	void VideoInDayNightConfig() {
		boolean bRet = false;
		String szCommand = FinalVar.CFG_CMD_VIDEOIN_DAYNIGHT;
		CFG_VIDEOIN_DAYNIGHT_INFO daynightInfo = new CFG_VIDEOIN_DAYNIGHT_INFO();

		// 获取
		bRet = ToolKits.GetDevConfig(szCommand, daynightInfo, __LoginHandle, 0, 2*1024*1024);
		if(bRet) {
			ToolKits.writeLog("GetNewDevConfig-CFG_CMD_VIDEOIN_DAYNIGHT Succeed!" );
			for(int i = 0; i < daynightInfo.stuSection.length; i ++){
				ToolKits.writeLog("daynightInfo[" + i + "].nDelay = " + daynightInfo.stuSection[i].nDelay);
				ToolKits.writeLog("daynightInfo[" + i + "].nMode = " + daynightInfo.stuSection[i].nMode);
				ToolKits.writeLog("daynightInfo[" + i + "].nSensitivity = " + daynightInfo.stuSection[i].nSensitivity);
				ToolKits.writeLog("daynightInfo[" + i + "].nType = " + daynightInfo.stuSection[i].nType);
				daynightInfo.stuSection[i].nDelay ++;
				daynightInfo.stuSection[i].nMode ++;
				daynightInfo.stuSection[i].nSensitivity ++;
				daynightInfo.stuSection[i].nType ++;
			}
			boolean bRet2 = ToolKits.SetDevConfig(szCommand, daynightInfo, __LoginHandle, 0, 2*1024*1024);
			if(bRet2) {
				ToolKits.writeLog("setNewDevConfig-CFG_CMD_VIDEOIN_DAYNIGHT Succeed!");
			} else {
				ToolKits.writeErrorLog("setNewDevConfig-CFG_CMD_VIDEOIN_DAYNIGHT Failed!" );
			}
		} else {
			ToolKits.writeErrorLog("GetNewDevConfig-CFG_CMD_VIDEOIN_DAYNIGHT Failed!" );
		}
	}

	//  媒体组件全局配置
	void MediaGlobalConfig() {
		NET_MEDIA_GLOBAL_INFO cfgData = new NET_MEDIA_GLOBAL_INFO();
		int emCfgOpType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_MEDIA_GLOBAL;
		int nChannelID = -1;

		// 获取
		if(INetSDK.GetConfig(__LoginHandle, emCfgOpType, nChannelID, cfgData, _waittime, null)) {
			ToolKits.writeLog("GetConfig-NET_EM_CFG_MEDIA_GLOBAL Succeed!" );
			ToolKits.writeLog("bLogEncode = " + cfgData.bLogEncode);
			ToolKits.writeLog("bLogRecord = " + cfgData.bLogRecord);
			ToolKits.writeLog("dwPacketSize = " + cfgData.dwPacketSize);
			ToolKits.writeLog("nPacketType = " + cfgData.nPacketType);
			// 设置
			cfgData.bLogEncode = !cfgData.bLogEncode;
			cfgData.bLogRecord = !cfgData.bLogRecord;
			cfgData.dwPacketSize ++;
			cfgData.nPacketType ++;
			if(INetSDK.SetConfig(__LoginHandle, emCfgOpType, nChannelID, cfgData, _waittime, null, null)){
				ToolKits.writeLog("SetConfig-NET_EM_CFG_MEDIA_GLOBAL Succeed!");
			}else{
				ToolKits.writeErrorLog("SetConfig-NET_EM_CFG_MEDIA_GLOBAL Failed!" );
			}
		}else{
			ToolKits.writeErrorLog("GetConfig-NET_EM_CFG_MEDIA_GLOBAL Failed!" );
		}
	}

	void DownloadByTime() {
		NET_TIME beginTime = new NET_TIME();
		beginTime.dwYear = 2016;
		beginTime.dwMonth = 2;
		beginTime.dwDay = 23;

		NET_TIME endTime = new NET_TIME();
		endTime.dwYear = 2016;
		endTime.dwMonth = 2;
		endTime.dwDay = 23;
		endTime.dwHour = 0;
		endTime.dwMinute = 30;

		String recFileName = "/sdcard/NetSDK/downloadbytime.dav";
		int channelID = 0;
//		long lDownload = INetSDK.DownloadByTimeEx2(__LoginHandle, channelID, EM_QUERY_RECORD_TYPE.EM_RECORD_TYPE_ALL,
//				beginTime, endTime, recFileName, new Test_CB_fTimeDownLoadPosCallBack(), new Test_CB_fDataCallBack(), SC_TYPE.SC_NONE, null);
		long lDownload = INetSDK.DownloadByTimeEx(__LoginHandle, channelID, EM_QUERY_RECORD_TYPE.EM_RECORD_TYPE_ALL,
				beginTime, endTime, recFileName, new Test_CB_fTimeDownLoadPosCallBack(), new Test_CB_fDataCallBack(), null);

		// 未下载完，想重新下载，下载前 要  INetSDK.StopDownload(lDownload);
//		if (0 != lDownload) {
//			try {
//				Thread.sleep(60000 * 5);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			INetSDK.StopDownload(lDownload);
//		}
	}

	public class Test_CB_fTimeDownLoadPosCallBack implements CB_fTimeDownLoadPosCallBack {
		@Override
		public void invoke(long lPlayHandle, int dwTotalSize, int dwDownLoadSize, int index, NET_RECORDFILE_INFO recordfileinfo) {
			ToolKits.writeLog("lPlayHandle = " + lPlayHandle + ", dwTotalSize = " + dwTotalSize + ", dwDownLoadSize = " + dwDownLoadSize);
			// -1 == dwDownLoadSize 下载结束
			if(-1 == dwDownLoadSize) {
				INetSDK.StopDownload(lDownloadHandle);
				ToolKits.writeLog("DownLoad Completed!!!" + "lDownloadHandle = " + lDownloadHandle);
			}
		}
	}

	public class Test_CB_fDataCallBack implements CB_fDataCallBack {
		@Override
		public int invoke(long lRealHandle, int dwDataType, byte buffer[], int dwBufferSize) {

			// 如果需要转码，把这里的buffer和dwBufferSize传给转码库接口
			//ToolKits.writeLog("lRealHandle = " + lRealHandle + ", dwDataType = " + dwDataType + ", dwBufferSize = " + dwBufferSize);
			return 0;
		}
	}

	public class Test_CB_fVideoAnalyseState implements CB_fVideoAnalyseState {
		@Override
		public int invoke(long lAttachHandle, NET_VIDEOANALYSE_STATE pAnalyseStateInfos, Object pReserved) {
			ToolKits.writeLog("Test_CB_fVideoAnalyseState, dwProgress = " + pAnalyseStateInfos.dwProgress);
			return 0;
		}
	}

	public class Test_CB_fAnalyzerDataCallBack implements CB_fAnalyzerDataCallBack {
		@Override
		public void invoke(long lAnalyzerHandle, int dwAlarmType, Object alarmInfo, byte pBuffer[], int dwBufSize, int nSequence, int reserved) {
			ToolKits.writeLog("Received IVS event ");
			if (FinalVar.EVENT_IVS_FACEDETECT == dwAlarmType) { // 目标识别
				ToolKits.writeLog("EVENT_IVS_FACEDETECT");
			} else if (FinalVar.EVENT_IVS_TRAFFICJUNCTION == dwAlarmType) { // 车牌识别
				ToolKits.writeLog("EVENT_IVS_TRAFFICJUNCTION");
			}
		}
	}

	// 查询视频统计信息
	void FindNumberStat() {
		NET_IN_FINDNUMBERSTAT startIn = new NET_IN_FINDNUMBERSTAT();
		startIn.nChannelID = 0;
		startIn.nGranularityType = 1;
		startIn.nWaittime = 3000;
		startIn.stStartTime.dwYear = 2015;
		startIn.stStartTime.dwMonth = 12;
		startIn.stStartTime.dwDay = 1;
		startIn.stEndTime.dwYear = 2015;
		startIn.stEndTime.dwMonth = 12;
		startIn.stEndTime.dwDay = 14;
		NET_OUT_FINDNUMBERSTAT startOut = new NET_OUT_FINDNUMBERSTAT();
		long lFindHandle = INetSDK.StartFindNumberStat(__LoginHandle, startIn, startOut);
		if (lFindHandle != 0 && startOut.dwTotalCount > 0) {
			int nCount = startOut.dwTotalCount;
			int nStep = 10; // 根据实际业务设置
			int nLoop = nCount / nStep;
			for (int i = 0; i < nLoop + 1; i++) {
				NET_IN_DOFINDNUMBERSTAT doIn = new NET_IN_DOFINDNUMBERSTAT();
				doIn.nBeginNumber = i * nStep;
				doIn.nCount = (i == nLoop) ? (nCount - doIn.nBeginNumber) : nStep;
				doIn.nWaittime = 3000;
				NET_OUT_DOFINDNUMBERSTAT doOut = new NET_OUT_DOFINDNUMBERSTAT(nStep);
				int nRet = INetSDK.DoFindNumberStat(lFindHandle, doIn, doOut);
				if (nRet < 0) {
					ToolKits.writeErrorLog("DoFindNumberStat failed");
				}
				//doOut.nCount 把 doOut.pstuNumberStat[i].nEnteredSubTotal 和 doOut.pstuNumberStat[i].nExitedSubtotal 输出
			}

			boolean bRet = INetSDK.StopFindNumberStat(lFindHandle);
			if (!bRet) {
				ToolKits.writeErrorLog("DoFindNumberStat failed");
			}

		}
	}

	/**
	 * stop RTMP
	 */
	public void RTMPstop(int PushId) {
		// 命令类型
		int emtype = NET_EM_RTMP_MANAGER_OPER_TYPE.NET_EM_RTMP_MANAGER_OPER_TYPE_STOP;

		/*
		 * 入参
		 */
		NET_IN_RTMP_MANAGER_STOP stIn = new NET_IN_RTMP_MANAGER_STOP();
		stIn.nPushId = PushId;
		/*
		 * 出参
		 */
		NET_OUT_RTMP_MANAGER_STOP stOut = new NET_OUT_RTMP_MANAGER_STOP();
		if(INetSDK.OperateRTMPManager(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("RTMP暂停成功");
			ToolKits.writeLog("error Code = " + stOut.emErrCode);
		} else {
			ToolKits.writeErrorLog("RTMP暂停失败");
		}
	}

	/**
	 * stop RTMP
	 */
	public void RTMPstop() {
		// 命令类型
		int emtype = NET_EM_RTMP_MANAGER_OPER_TYPE.NET_EM_RTMP_MANAGER_OPER_TYPE_STOP;

		/*
		 * 入参
		 */
		NET_IN_RTMP_MANAGER_STOP stIn = new NET_IN_RTMP_MANAGER_STOP();
		stIn.nPushId = 9;
		/*
		 * 出参
		 */
		NET_OUT_RTMP_MANAGER_STOP stOut = new NET_OUT_RTMP_MANAGER_STOP();
		if(INetSDK.OperateRTMPManager(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("RTMP暂停成功");
			ToolKits.writeLog("error Code = " + stOut.emErrCode);
		} else {
			ToolKits.writeErrorLog("RTMP暂停失败");
		}
	}

	/**
	 * setSpeed RTMP
	 */
	public void RTMPsetSpeed(int nPushId,int nSpeed) {
		// 命令类型
		int emtype = NET_EM_RTMP_MANAGER_OPER_TYPE.NET_EM_RTMP_MANAGER_OPER_TYPE_SET_SPEED;

		/*
		 * 入参
		 */
		NET_IN_RTMP_MANAGER_SET_SPEED stIn = new NET_IN_RTMP_MANAGER_SET_SPEED();
		stIn.nPushId = nPushId;
		stIn.dbSpeed = nSpeed;
		/*
		 * 出参
		 */
		NET_OUT_RTMP_MANAGER_SET_SPEED stOut = new NET_OUT_RTMP_MANAGER_SET_SPEED();
		if(INetSDK.OperateRTMPManager(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("RTMP设置速度成功");
			ToolKits.writeLog("error Code = " + stOut.emErrCode);
		} else {
			ToolKits.writeErrorLog("RTMP设置速度失败");
		}
	}

	/**
	 * resume RTMP
	 */
	public void RTMPresume(int nPushId) {
		// 命令类型
		int emtype = NET_EM_RTMP_MANAGER_OPER_TYPE.NET_EM_RTMP_MANAGER_OPER_TYPE_RESUME;

		/*
		 * 入参
		 */
		NET_IN_RTMP_MANAGER_RESUME stIn = new NET_IN_RTMP_MANAGER_RESUME();
		stIn.nPushId = nPushId;
		/*
		 * 出参
		 */
		NET_OUT_RTMP_MANAGER_RESUME stOut = new NET_OUT_RTMP_MANAGER_RESUME();
		if(INetSDK.OperateRTMPManager(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("RTMP恢复成功");
			ToolKits.writeLog("error Code = " + stOut.emErrCode);
		} else {
			ToolKits.writeErrorLog("RTMP恢复失败");
		}
	}

	/**
	 * pause RTMP
	 */
	public void RTMPpause(int nPushId) {
		// 命令类型
		int emtype = NET_EM_RTMP_MANAGER_OPER_TYPE.NET_EM_RTMP_MANAGER_OPER_TYPE_PAUSE;

		/*
		 * 入参
		 */
		NET_IN_RTMP_MANAGER_PAUSE stIn = new NET_IN_RTMP_MANAGER_PAUSE();
		stIn.nPushId = nPushId;
		/*
		 * 出参
		 */
		NET_OUT_RTMP_MANAGER_PAUSE stOut = new NET_OUT_RTMP_MANAGER_PAUSE();
		if(INetSDK.OperateRTMPManager(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("RTMP暂停成功");
			ToolKits.writeLog("error Code = " + stOut.emErrCode);
		} else {
			ToolKits.writeErrorLog("RTMP暂停失败");
		}
	}

	/**
	 * start RTMP
	 */
	public void RTMPstart(int pushID) {
		// 命令类型
		int emtype = NET_EM_RTMP_MANAGER_OPER_TYPE.NET_EM_RTMP_MANAGER_OPER_TYPE_START;

		/*
		 * 入参
		 */
		NET_IN_RTMP_MANAGER_START stIn = new NET_IN_RTMP_MANAGER_START();
		stIn.nPushId = pushID;
		/*
		 * 出参
		 */
		NET_OUT_RTMP_MANAGER_START stOut = new NET_OUT_RTMP_MANAGER_START();
		if(INetSDK.OperateRTMPManager(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("RTMP开始成功");
			ToolKits.writeLog("error Code = " + stOut.emErrCode);
		} else {
			ToolKits.writeErrorLog("RTMP开始失败");
		}
	}

	/**
	 * start RTMP
	 */
	public void RTMPstart() {
		// 命令类型
		int emtype = NET_EM_RTMP_MANAGER_OPER_TYPE.NET_EM_RTMP_MANAGER_OPER_TYPE_START;

		/*
		 * 入参
		 */
		NET_IN_RTMP_MANAGER_START stIn = new NET_IN_RTMP_MANAGER_START();
		stIn.nPushId = 9;
		/*
		 * 出参
		 */
		NET_OUT_RTMP_MANAGER_START stOut = new NET_OUT_RTMP_MANAGER_START();
		if(INetSDK.OperateRTMPManager(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("RTMP开始成功");
			ToolKits.writeLog("error Code = " + stOut.emErrCode);
		} else {
			ToolKits.writeErrorLog("RTMP开始失败");
		}
	}

	/**
	 * getcaps RTMP
	 */
	public void RTMPgetcaps() {
		// 命令类型
		int emtype = NET_EM_RTMP_MANAGER_OPER_TYPE.NET_EM_RTMP_MANAGER_OPER_TYPE_GETCAPS;

		/*
		 * 入参
		 */
		NET_IN_RTMP_MANAGER_GETCAPS stIn = new NET_IN_RTMP_MANAGER_GETCAPS();

		/*
		 * 出参
		 */
		NET_OUT_RTMP_MANAGER_GETCAPS stOut = new NET_OUT_RTMP_MANAGER_GETCAPS();
		if(INetSDK.OperateRTMPManager(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("RTMP获取成功");
			ToolKits.writeLog("nMaxLive = " + stOut.nMaxLive);
			ToolKits.writeLog("nMaxRecord = " + stOut.nMaxRecord);
		} else {
			ToolKits.writeErrorLog("RTMP获取失败");
		}
	}

	/**
	 * remove RTMP
	 */
	public void RTMPremove(int pushID) {
		// 命令类型
		int emtype = NET_EM_RTMP_MANAGER_OPER_TYPE.NET_EM_RTMP_MANAGER_OPER_TYPE_REMOVE;

		/*
		 * 入参
		 */
		NET_IN_RTMP_MANAGER_REMOVE stIn = new NET_IN_RTMP_MANAGER_REMOVE();
		stIn.nPushId = pushID;

		/*
		 * 出参
		 */
		NET_OUT_RTMP_MANAGER_REMOVE stOut = new NET_OUT_RTMP_MANAGER_REMOVE();
		if(INetSDK.OperateRTMPManager(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("RTMP移除成功");
			ToolKits.writeLog("error Code = " + stOut.emErrCode);
		} else {
			ToolKits.writeErrorLog("RTMP移除失败");
		}
	}

	/**
	 * add ONVIF User
	 */
	public void AddOnvifUser() {

		/*
		 * 入参
		 */
		NET_IN_ADD_ONVIF_USER_INFO stIn = new NET_IN_ADD_ONVIF_USER_INFO();
		String username = "rosetta1234";
		String pwd = "admin321";
		System.arraycopy(username.getBytes(), 0, stIn.szName, 0, username.getBytes().length);
		System.arraycopy(pwd.getBytes(), 0, stIn.szPassword, 0, pwd.getBytes().length);
		stIn.emGroupType = EM_GROUP_TYPE.EM_GROUP_TYPE_USER;
		/*
		 * 出参
		 */
		NET_OUT_ADD_ONVIF_USER_INFO stOut = new NET_OUT_ADD_ONVIF_USER_INFO();
		if(INetSDK.AddOnvifUser(__LoginHandle, stIn, stOut, 4000)) {
			ToolKits.writeLog("AddOnvifUser成功");
		} else {
			ToolKits.writeErrorLog("AddOnvifUser失败");
		}
	}

	/**
	 * change ONVIF password
	 */
	public void ModifyOnvifUserPassword() {

		/*
		 * 入参
		 */
		NET_IN_MODIFYONVIF_PASSWORD_INFO stIn = new NET_IN_MODIFYONVIF_PASSWORD_INFO();
		String username = "admin";
		String pwd = "admin321";
		String oldpwd = "zng12345";
		System.arraycopy(username.getBytes(), 0, stIn.szName, 0, username.getBytes().length);
		System.arraycopy(pwd.getBytes(), 0, stIn.szPwd, 0, pwd.getBytes().length);
		System.arraycopy(oldpwd.getBytes(), 0, stIn.szPwdOld, 0, oldpwd.getBytes().length);

		/*
		 * 出参
		 */
		NET_OUT_MODIFYONVIF_PASSWORD_INFO stOut = new NET_OUT_MODIFYONVIF_PASSWORD_INFO();
		if(INetSDK.ModifyOnvifUserPassword(__LoginHandle, stIn, stOut, 4000)) {
			ToolKits.writeLog("modifyOnvifPassword成功");
		} else {
			ToolKits.writeErrorLog("modifyOnvifPassword失败");
		}
	}

	/**
	 * remove RTMP
	 */
	public void RTMPremove() {
		// 命令类型
		int emtype = NET_EM_RTMP_MANAGER_OPER_TYPE.NET_EM_RTMP_MANAGER_OPER_TYPE_REMOVE;

		/*
		 * 入参
		 */
		NET_IN_RTMP_MANAGER_REMOVE stIn = new NET_IN_RTMP_MANAGER_REMOVE();
		stIn.nPushId = 5;

		/*
		 * 出参
		 */
		NET_OUT_RTMP_MANAGER_REMOVE stOut = new NET_OUT_RTMP_MANAGER_REMOVE();
		if(INetSDK.OperateRTMPManager(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("RTMP移除成功");
			ToolKits.writeLog("error Code = " + stOut.emErrCode);
		} else {
			ToolKits.writeErrorLog("RTMP移除失败");
		}
	}

	/**
	 * add RTMP
	 */
	public int RTMPaddLive() {
		// 命令类型
		int emtype = NET_EM_RTMP_MANAGER_OPER_TYPE.NET_EM_RTMP_MANAGER_OPER_TYPE_ADD;

		/*
		 * 入参
		 */
		NET_IN_RTMP_MANAGER_ADD stIn = new NET_IN_RTMP_MANAGER_ADD();
		stIn.emType = NET_EM_RTMP_MANAGER_ADD_TYPE.NET_EM_RTMP_MANAGER_ADD_TYPE_LIVE_STREAM;
		stIn.stuLiveStream.emStreamType = NET_EM_RTMP_MANAGER_STREAM_TYPE_MAINCODE_STREAM;
		stIn.stuLiveStream.nChannel = 0;
		String szUrl = "rtmp://10.33.11.105:1935/live/livestream0";
		System.arraycopy(szUrl.getBytes(), 0, stIn.szUrl, 0, szUrl.getBytes().length);

		/*
		 * 出参
		 */
		NET_OUT_RTMP_MANAGER_ADD stOut = new NET_OUT_RTMP_MANAGER_ADD();
		if(INetSDK.OperateRTMPManager(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("RTMP添加成功");
			ToolKits.writeLog("push ID = " + stOut.nPushId);
			ToolKits.writeLog("error Code = " + stOut.emErrCode);
		} else {
			ToolKits.writeErrorLog("RTMP添加失败");
		}
		return stOut.nPushId;
	}
	/**
	 * add RTMP
	 */
	public int RTMPaddRecord() {
		// 命令类型
		int emtype = NET_EM_RTMP_MANAGER_OPER_TYPE.NET_EM_RTMP_MANAGER_OPER_TYPE_ADD;

		/*
		 * 入参
		 */
		NET_IN_RTMP_MANAGER_ADD stIn = new NET_IN_RTMP_MANAGER_ADD();
		stIn.emType = NET_EM_RTMP_MANAGER_ADD_TYPE.NET_EM_RTMP_MANAGER_ADD_TYPE_RECORD_STREAM;
		stIn.stuRecordStream.emStreamType = NET_EM_RTMP_MANAGER_STREAM_TYPE_MAINCODE_STREAM;
		stIn.stuRecordStream.nChannel = 0;
		String szStartTime = "2021-11-1 11:00:00";
		System.arraycopy(szStartTime.getBytes(), 0, stIn.stuRecordStream.szStartTime, 0, szStartTime.getBytes().length);
		String szEndTime = "2021-11-1 14:00:00";
		System.arraycopy(szEndTime.getBytes(), 0, stIn.stuRecordStream.szEndTime, 0, szEndTime.getBytes().length);

		String szUrl = "rtmp://10.33.11.105:1935/live/livestream1";
		System.arraycopy(szUrl.getBytes(), 0, stIn.szUrl, 0, szUrl.getBytes().length);

		/*
		 * 出参
		 */
		NET_OUT_RTMP_MANAGER_ADD stOut = new NET_OUT_RTMP_MANAGER_ADD();
		if(INetSDK.OperateRTMPManager(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("RTMP添加成功");
			ToolKits.writeLog("push ID = " + stOut.nPushId);
			ToolKits.writeLog("error Code = " + stOut.emErrCode);
		} else {
			ToolKits.writeErrorLog("RTMP添加失败");
		}
		return stOut.nPushId;
	}
	public void DetachRTMPManager(){
		NET_IN_RTMP_MANAGER_DETACH_STATUS stuIn1 = new NET_IN_RTMP_MANAGER_DETACH_STATUS();
		NET_OUT_RTMP_MANAGER_DETACH_STATUS stuOut1 = new NET_OUT_RTMP_MANAGER_DETACH_STATUS();
		// 取消订阅
		if(INetSDK.DetachStatusRTMPManager(lAttachHandle,stuIn1,stuOut1) >= 0){
			ToolKits.writeLog("DetachStatusRTMPManager Succeed!");
		}else{
			ToolKits.writeErrorLog("DetachStatusRTMPManager Failed");
		}
	}

	public class Test_CB_fVideoAnalyseTrackProc implements CB_fVideoAnalyseTrackProc {

		@Override
		public void invoke(long l, NET_VIDEO_ANALYSE_TRACK_PROC net_video_analyse_track_proc) {
			ToolKits.writeLog("CallBack Received=========================================");
			ToolKits.writeLog("ChannelID = " + net_video_analyse_track_proc.nChannelId);
			ToolKits.writeLog("TrackObjectNum = " + net_video_analyse_track_proc.nTrackObjectNum);
			if(net_video_analyse_track_proc.nTrackObjectNum > 0){
				for(int i = 0; i < net_video_analyse_track_proc.nTrackObjectNum; i ++){
					ToolKits.writeLog("TrackObject Num[" + i + "]:");
					ToolKits.writeLog("szObjectUUID = " + new String(net_video_analyse_track_proc.stuTrackObject[i].szObjectUUID).trim());
					ToolKits.writeLog("nObjectTypeNum = " + net_video_analyse_track_proc.stuTrackObject[i].nObjectTypeNum);
					for(int j = 0; j < net_video_analyse_track_proc.stuTrackObject[i].nObjectTypeNum; j ++){
						ToolKits.writeLog("emObjectType[" + j + "] = " + net_video_analyse_track_proc.stuTrackObject[i].emObjectType[j]);
					}
					ToolKits.writeLog("stuBoundingBox = " + net_video_analyse_track_proc.stuTrackObject[i].stuBoundingBox.toString());
				}
			}
		}
	}

	// 订阅外部轨迹
	public void AttachVideoAnalyseTrackProc() {

		NET_IN_ATTACH_VIDEO_ANALYSE_TRACK_PROC stAttachIn = new NET_IN_ATTACH_VIDEO_ANALYSE_TRACK_PROC();
		stAttachIn.nChannelId = 0;
		stAttachIn.cbVideoAnalyseTrackProc = new Test_CB_fVideoAnalyseTrackProc();
		NET_OUT_ATTACH_VIDEO_ANALYSE_TRACK_PROC stAttachOut = new NET_OUT_ATTACH_VIDEO_ANALYSE_TRACK_PROC();
		Integer k = 5000;
		lAttachHandle = INetSDK.AttachVideoAnalyseTrackProc(__LoginHandle, stAttachIn, stAttachOut, k);
		if(lAttachHandle != 0){
			ToolKits.writeLog("AttachVideoAnalyseTrackProc Succeed!" + lAttachHandle);
		}else{
			ToolKits.writeErrorLog("AttachVideoAnalyseTrackProc Failed");
		}
	}

	public void DetachVideoAnalyseTrackProc(){
		// 取消订阅
		if(INetSDK.DetachVideoAnalyseTrackProc(lAttachHandle)){
			ToolKits.writeLog("DetachVideoAnalyseTrackProc Succeed!");
		}else{
			ToolKits.writeErrorLog("DetachVideoAnalyseTrackProc Failed");
		}
	}

	// 订阅云台状态
	public void AttachPTZStatusProc() {
		NET_IN_PTZ_STATUS_PROC stIn = new NET_IN_PTZ_STATUS_PROC();
		stIn.nChannel = 0;
		stIn.cbPTZStatusProc = new Test_CB_fPTZStatusCallBack();
		NET_OUT_PTZ_STATUS_PROC stOut = new NET_OUT_PTZ_STATUS_PROC();
		lAttachHandle = INetSDK.AttachPTZStatusProc(
				__LoginHandle, stIn, stOut, 5000);
		if(lAttachHandle > 0 )
		{
			ToolKits.writeLog("AttachPTZStatusProc lAttach: " +  lAttachHandle);
		}
		else
		{
			ToolKits.writeErrorLog("AttachPTZStatusProc failed");
		}
		return;
	}

	public void DetachPTZStatusProc(){
		// 取消订阅
		if(INetSDK.DetachPTZStatusProc(lAttachHandle)){
			ToolKits.writeLog("DetachPTZStatusProc Succeed!");
		}else{
			ToolKits.writeErrorLog("DetachPTZStatusProc Failed");
		}
	}

	public Set pushSet;
	// 订阅RTMP
	public void AttachStatusRTMPManagerLive() {
		int pushid = RTMPaddLive();
		NET_IN_RTMP_MANAGER_ATTACH_STATUS stuIn = new NET_IN_RTMP_MANAGER_ATTACH_STATUS();
		stuIn.nPushId = pushid;

		stuIn.cbRTMPAttachStatusCallBack = new CB_fRTMPAttachStatusCallBack() {

			public int invoke(long lAttachHandle, NET_CB_RTMP_STATUS_INFO pstStatus) {
				ToolKits.writeLog("RTMP Callback nSID: " + pstStatus.nSID
						+ " stuInfo Structure: " + pstStatus.stuInfo.toString());
				return pstStatus.nSID;
			}
		};

		NET_OUT_RTMP_MANAGER_ATTACH_STATUS stuOut = new NET_OUT_RTMP_MANAGER_ATTACH_STATUS();
		long lAttachHandle = INetSDK.AttachStatusRTMPManager(__LoginHandle, stuIn, stuOut, 5000);
		if(lAttachHandle != 0) {
			ToolKits.writeLog("AttachStatusRTMPManager Succeed!");
		} else {
			ToolKits.writeErrorLog("AttachStatusRTMPManager Failed" );
		}
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// do nothing
		}
		RTMPstart(stuIn.nPushId);
//		try {
//			sleep(1000);
//		} catch (InterruptedException e) {
//			// do nothing
//		}
//		RTMPstop(stuIn.nPushId);
//		try {
//			sleep(3000);
//		}catch (InterruptedException e) {
//			// do nothing
//		}

		NET_IN_RTMP_MANAGER_DETACH_STATUS stuIn1 = new NET_IN_RTMP_MANAGER_DETACH_STATUS();
		NET_OUT_RTMP_MANAGER_DETACH_STATUS stuOut1 = new NET_OUT_RTMP_MANAGER_DETACH_STATUS();
		// 取消订阅
		if(INetSDK.DetachStatusRTMPManager(lAttachHandle,stuIn1,stuOut1) >= 0){
			ToolKits.writeLog("DetachStatusRTMPManager Succeed!");
		}else{
			ToolKits.writeErrorLog("DetachStatusRTMPManager Failed" );
		}
//		RTMPremove(stuIn.nPushId);
	}
	// 订阅RTMP
	public void AttachStatusRTMPManagerRecord() {
		/**测能否推流到云端的话，保留添加开始和订阅推流，其他均注释掉即可**/
		int pushid = 0;
		pushid = RTMPaddRecord();
		if(pushid != 0){
			NET_IN_RTMP_MANAGER_ATTACH_STATUS stuIn = new NET_IN_RTMP_MANAGER_ATTACH_STATUS();
			stuIn.nPushId = pushid;

			stuIn.cbRTMPAttachStatusCallBack = new CB_fRTMPAttachStatusCallBack() {

				public int invoke(long lAttachHandle, NET_CB_RTMP_STATUS_INFO pstStatus) {
					ToolKits.writeLog("RTMP Callback nSID: " + pstStatus.nSID
							+ " stuInfo Structure: " + pstStatus.stuInfo.toString());
					return pstStatus.nSID;
				}
			};

			NET_OUT_RTMP_MANAGER_ATTACH_STATUS stuOut = new NET_OUT_RTMP_MANAGER_ATTACH_STATUS();
			long lAttachHandle = INetSDK.AttachStatusRTMPManager(__LoginHandle, stuIn, stuOut, 5000);
			if(lAttachHandle != 0) {
				ToolKits.writeLog("AttachStatusRTMPManager Succeed!");
			} else {
				ToolKits.writeErrorLog("AttachStatusRTMPManager Failed" );
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// do nothing
			}
			RTMPstart(stuIn.nPushId);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// do nothing
			}
//			RTMPpause(stuIn.nPushId);
//			try {
//				sleep(1000);
//			} catch (InterruptedException e) {
//				// do nothing
//			}
//			RTMPresume(stuIn.nPushId);
//			try {
//				sleep(1000);
//			} catch (InterruptedException e) {
//				// do nothing
//			}
			RTMPsetSpeed(stuIn.nPushId,8);
//			try {
//				sleep(1000);
//			} catch (InterruptedException e) {
//				// do nothing
//			}
//			RTMPstop(stuIn.nPushId);
//			try {
//				sleep(1000);
//			}catch (InterruptedException e) {
//				// do nothing
//			}
//
//			NET_IN_RTMP_MANAGER_DETACH_STATUS stuIn1 = new NET_IN_RTMP_MANAGER_DETACH_STATUS();
//			NET_OUT_RTMP_MANAGER_DETACH_STATUS stuOut1 = new NET_OUT_RTMP_MANAGER_DETACH_STATUS();
//			// 取消订阅
//			if(INetSDK.DetachStatusRTMPManager(lAttachHandle,stuIn1,stuOut1) >= 0){
//				ToolKits.writeLog("DetachStatusRTMPManager Succeed!");
//			}else{
//				ToolKits.writeErrorLog("DetachStatusRTMPManager Failed" );
//			}
//			try {
//				sleep(1000);
//			}catch (InterruptedException e) {
//				// do nothing
//			}
//			RTMPremove(stuIn.nPushId);
		}

	}
	// 订阅人流统计信息
	public void AttachVideoStatSummary() {

		NET_IN_ATTACH_VIDEOSTAT_SUM stuIn = new NET_IN_ATTACH_VIDEOSTAT_SUM();
		stuIn.nChannel = 0;
		stuIn.cbVideoStatSum = new CB_fVideoStatSumCallBack() {

			public void invoke(long lAttachHandle, NET_VIDEOSTAT_SUMMARY pstSummary, int dwBufLen) {
				ToolKits.writeLog("VideoStatSum Callback Time: " + pstSummary.stuTime
						+ " stuEnteredSubtotal: " + pstSummary.stuEnteredSubtotal.toString()
						+ " stuEnteredSubtotal: " + pstSummary.stuExitedSubtotal.toString()
						+ " RetExit Man Num: " + pstSummary.nRetExitManNum
						+ " nInsideTodayPig: " + pstSummary.nInsideTodayPig
						+ " nInsideTotalPig: " + pstSummary.nInsideTotalPig
						+ " nPigStayStatCount: " + pstSummary.nPigStayStatCount
						+ " dwBufLen: " + dwBufLen);
				for(int i = 0; i < pstSummary.nPigStayStatCount; i ++){
					ToolKits.writeLog("stuPigStayStatInfo["+i+"].stuEnterTime = " + pstSummary.stuPigStayStatInfo[i].stuEnterTime.toString());
					ToolKits.writeLog("stuPigStayStatInfo["+i+"].stuExitTime = " + pstSummary.stuPigStayStatInfo[i].stuExitTime.toString());
				}
				if (pstSummary.nRetExitManNum > 0) {
					ToolKits.writeLog("VideoStatSum Callback Current Reserve Info of First Exit Man"
							+ " Enter Time: " + pstSummary.stuExitManStayInfo[0].stuEnterTime
							+ " Exit  Time: " + pstSummary.stuExitManStayInfo[0].stuExitTime);
				}
			}
		};

		NET_OUT_ATTACH_VIDEOSTAT_SUM stuOut = new NET_OUT_ATTACH_VIDEOSTAT_SUM();
		lAttachHandle = INetSDK.AttachVideoStatSummary(__LoginHandle, stuIn, stuOut, 3000);
		if(lAttachHandle != 0) {
			ToolKits.writeLog("AttachVideoStatSummary Succeed!");
		} else {
			ToolKits.writeErrorLog("AttachVideoStatSummary Failed" );
		}
	}
	// 取消订阅
	void DetachVideoStatSummary(){
		if(INetSDK.DetachVideoStatSummary(lAttachHandle)) {
			ToolKits.writeLog("DetachVideoStatSummary Succeed!");
		} else {
			ToolKits.writeErrorLog("DetachVideoStatSummary Failed" );
		}
	}
	// 同步录像抓图接口，从录像文件中抓取指定时刻的一帧图片，将图片数据返回给用户
	void TestSnapPicFromRecord() {
		NET_IN_SNAP_PIC_FROM_REC stIn = new NET_IN_SNAP_PIC_FROM_REC();
		NET_OUT_SNAP_PIC_FROM_REC stOut = new NET_OUT_SNAP_PIC_FROM_REC(1024 * 1024);

		stIn.nChannel = 0;
		stIn.nStreamType = 1;
		stIn.stuTime.setTime(2022, 2, 28, 15, 20, 00);
		if (!INetSDK.SnapPicFromRecord(__LoginHandle, stIn, stOut, 3000)) {
			ToolKits.writeErrorLog("SnapPicFromRecord failed");
		} else {
			ToolKits.writeLog("SnapPicFromRecord succeed");
			savePicture(stOut.pPicBuf, stOut.nRetLen, "SnapPicFromRecord");
		}
	}

	// 抓图同步接口,将图片数据直接返回给用户
	void SnapPictureToFile() {
		String name = "/sdcard/NetSDK/123.jpg";

		NET_IN_SNAP_PIC_TO_FILE_PARAM stIn = new NET_IN_SNAP_PIC_TO_FILE_PARAM();
		NET_OUT_SNAP_PIC_TO_FILE_PARAM stOut = new NET_OUT_SNAP_PIC_TO_FILE_PARAM(1024 * 1024);

		stIn.stuParam.Channel = NetSDKApplication.getInstance().getDeviceInfo().nChanNum-1;
		stIn.stuParam.Quality = 3;
		stIn.stuParam.ImageSize = 1;
		stIn.stuParam.mode = 0;
		stIn.stuParam.InterSnap = 5;
		stIn.stuParam.CmdSerial = 100;
		System.arraycopy(name.getBytes(), 0, stIn.szFilePath, 0, name.getBytes().length);
		if (!INetSDK.SnapPictureToFile(__LoginHandle, stIn, stOut, 3000)) {
			ToolKits.writeErrorLog("SnapPictureToFile failed");
		}
	}

	// Smart H264编码方式配置
	void SmartEncodeConfig() {
		ToolKits.writeLog("TestSmartEncodeCfg");
		CFG_SMART_ENCODE_INFO stCfgs = new CFG_SMART_ENCODE_INFO();
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_SMART_ENCODE, stCfgs, __LoginHandle, 0, 10240);
		if (zRet) {
			ToolKits.writeLog("bSmartH264 : " + stCfgs.bSmartH264);
			stCfgs.bSmartH264 = !stCfgs.bSmartH264;
			zRet = false;
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_SMART_ENCODE, stCfgs, __LoginHandle, 0, 10240);
			if (zRet)
			{
				ToolKits.writeLog("SmartH264 SetDevConfig OK !");
			}
		}
	}

	// 邮件发送配置
	void EmailConfig() {
		ToolKits.writeLog("TestEmailCfg");
		CFG_EMAIL_INFO stCfgs = new CFG_EMAIL_INFO();
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_EMAIL, stCfgs, __LoginHandle, -1, 10240);
		if (zRet) {
			ToolKits.writeLog("bEnable : " + stCfgs.bEnable);
			String address = new String(stCfgs.szAddress, 0, 4);
			ToolKits.writeLog("Address : " + address);

			for (int i = 0; i < stCfgs.nRetReciversNum; ++i)
			{
				ToolKits.writeLog("szReceivers : " + stCfgs.szReceivers[i]);
			}

			ToolKits.writeLog("stuHealthReport->nInterval " + stCfgs.stuHealthReport.nInterval);

			// test for set dev config
			stCfgs.bEnable = !stCfgs.bEnable;
			stCfgs.stuHealthReport.nInterval = 60;
//
			String UserName = new String(stCfgs.szUserName, 0, stCfgs.szUserName.length);
			ToolKits.writeLog("UserName : " + UserName);

			zRet = false;
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_EMAIL, stCfgs, __LoginHandle, -1, 10240);
			if (zRet)
			{
				ToolKits.writeLog("Email SetDevConfig OK !");
			}
		}
	}

	// 搜索无线设备扩展配置
	void SearchAndConfig() {
		boolean bRet;

		// 打开设备软AP，不需要登录，进行搜索设备，回调函数中获取到设备IP
		TestfSearchDevicesCB stCb = new TestfSearchDevicesCB();
		long lRet = INetSDK.StartSearchDevices(stCb);
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		bRet = INetSDK.StopSearchDevices(lRet);   // 回调函数里面搜索到设备之后，启线程调用该接口停止搜索

		// 利用上面搜索到的设备IP，调用登录接口进行登录（LiveActivity.java），获取设备的SSID列表
		SDKDEV_WLAN_DEVICE_LIST_EX stListEx[] = new SDKDEV_WLAN_DEVICE_LIST_EX[1];
		stListEx[0] = new SDKDEV_WLAN_DEVICE_LIST_EX();
		Integer stIntRet = new Integer(0);
		bRet = INetSDK.GetDevConfig(__LoginHandle, FinalVar.SDK_DEV_WLAN_DEVICE_CFG_EX, -1, stListEx, stIntRet, 5000);
		if (bRet) {
			for (int i = 0; i < stListEx[0].bWlanDevCount; i++) {
				String strSSID = new String(stListEx[0].lstWlanDev[i].szSSID);   // 把szSSID最后面的那些0去掉，可以解决乱码问题
				ToolKits.writeLog(strSSID);
			}

//			// 选择上面的一个SSID，配置参数
//			SDKDEV_WLAN_INFO stCfg[] = new SDKDEV_WLAN_INFO[1];
//			stCfg[0] = new SDKDEV_WLAN_INFO();
//			int channelID = 0;
//			bRet = INetSDK.GetDevConfig(__LoginHandle,
//					FinalVar.SDK_DEV_WLAN_CFG, channelID, stCfg, stIntRet, 5000);
//			stCfg[0].nEncryption = 7;
//			stCfg[0].byConnectedFlag = 1;
//			stCfg[0].szSSID = new byte[36];
//			stCfg[0].szKeys[0] = new byte[32];
//			stCfg[0].szKeys[1] = new byte[32];
//			stCfg[0].szKeys[2] = new byte[32];
//			stCfg[0].szKeys[3] = new byte[32];
//			stCfg[0].szWPAKeys = new byte[128];
//			System.arraycopy("IPC-GYL".getBytes(), 0, stCfg[0].szSSID, 0, "IPC-GYL".getBytes().length);
//			System.arraycopy("66886688".getBytes(), 0, stCfg[0].szKeys[0], 0, "66886688".getBytes().length);
//			System.arraycopy("66886688".getBytes(), 0, stCfg[0].szWPAKeys, 0, "66886688".getBytes().length);
//			bRet = INetSDK.SetDevConfig(__LoginHandle,
//					FinalVar.SDK_DEV_WLAN_CFG, channelID, stCfg, 3000);
//			if (!bRet) {
//				ToolKits.writeErrorLog("error, ");
//			}
		}
	}

	// 网络协议配置
	void DVRIPConfig() {
		CFG_DVRIP_INFO stCfgs = new CFG_DVRIP_INFO();
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_DVRIP, stCfgs, __LoginHandle, -1, 10240);
		if (zRet) {
			ToolKits.writeLog("nUDPPort : " + stCfgs.nUDPPort);
			String address = new String(stCfgs.szMCASTAddress, 0, 13);
			ToolKits.writeLog("Address : " + address);

			for (int i = 0; i < stCfgs.nRegistersNum; ++i)
			{
				ToolKits.writeLog("stuRegisters : " + stCfgs.stuRegisters[i].nServersNum);
			}

			ToolKits.writeLog("emStreamPolicy " + stCfgs.emStreamPolicy);

			// test for set dev config
			stCfgs.nUDPPort = stCfgs.nUDPPort;
            stCfgs.nRegistersNum = 1;
            stCfgs.stuRegisters[0].bEnable = true;
            stCfgs.stuRegisters[0].nServersNum = 1;
            ToolKits.StringToByteArray("10.10.10.10", stCfgs.stuRegisters[0].stuServers[0].szAddress);
            stCfgs.stuRegisters[0].stuServers[0].nPort = 123;
            ToolKits.StringToByteArray("123456", stCfgs.stuRegisters[0].szDeviceID); // 主动注册回调序列号
            zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_DVRIP, stCfgs, __LoginHandle, -1, 10240);
			if (zRet)
			{
				ToolKits.writeLog("DVRIP SetDevConfig OK !");
			}
		}
	}

	// 控制启动设备升级,由设备独立完成升级过程,不需要传输升级文件
	void CloudUpgrader() {
		// query devtype
		CFG_DEV_DISPOSITION_INFO devtype = new CFG_DEV_DISPOSITION_INFO();
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_DEV_GENERRAL, devtype, __LoginHandle, -1, 10240);
		if (zRet) {
			String type = ToolKits.ByteArrayToString(devtype.szMachineName);
			if (null != type) {
				ToolKits.writeLog(type);
				if (!type.equals("LHV2008")) {
					return;
				}
			}
		}

		// check new firmware
		SDKDEV_UPGRADE_STATE_INFO upgrade_info = new SDKDEV_UPGRADE_STATE_INFO();
		boolean retCheck = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_GET_UPGRADE_STATE, upgrade_info, 10 * 1000);
		if (retCheck) {
			int state = upgrade_info.nState;
			switch (state) {
					case 0: //None
						ToolKits.writeLog("No newer firmware");
						break;
					case 1: //Regular
						// upgrader
						boolean retUpgrader = INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_UPGRADE_DEVICE, null, 10 * 1000);
				        if (retUpgrader) {
				        	ToolKits.writeLog("Upgrader success");
				        } else {
				        	ToolKits.writeErrorLog("Upgrader failed");
				        }
				        break;
					default:
						break;
			}
		} else {
			ToolKits.writeErrorLog("QueryDevState failed");
		}
	}

	// 测试邮件
    void TestMail() {
        NET_IN_TEST_MAIL stuIn = new NET_IN_TEST_MAIL();
        NET_OUT_TEST_MAIL stuOut = new NET_OUT_TEST_MAIL();
        if (INetSDK.ControlDeviceEx(__LoginHandle, CtrlType.SDK_CTRL_TEST_MAIL, stuIn, stuOut, 10 * 1000)) {
            ToolKits.writeLog("Test Mail sucess");
        }else {
            ToolKits.writeErrorLog("Test Mail failed");
        }
    }

    // 增加无线设备
    void AddLowRateWLAN() {
    	NET_CTRL_LOWRATEWPAN_ADD stuIn = new NET_CTRL_LOWRATEWPAN_ADD();
    	stuIn.stuCodeIDInfo.nWirelessId = 2;
    	stuIn.stuCodeIDInfo.bEnable = true;
    	stuIn.stuCodeIDInfo.emType = NET_WIRELESS_DEVICE_TYPE.NET_WIRELESS_DEVICE_TYPE_MAGNETOMER;
    	stuIn.stuCodeIDInfo.emMode = EM_WIRELESS_DEVICE_MODE.EM_WIRELESS_DEVICE_MODE_NORMAL;
    	stuIn.stuCodeIDInfo.emSenseMethod = EM_CODEID_SENSE_METHOD_TYPE.EM_CODEID_SENSE_METHOD_TYPE_DOOR_MAGNETISM;

    	String customNameString = new String("app.test");
    	String snString = new String("app.test");
    	System.arraycopy(customNameString.getBytes(), 0, stuIn.stuCodeIDInfo.szCustomName, 0, customNameString.length());
    	System.arraycopy(snString.getBytes(), 0, stuIn.stuCodeIDInfo.szSerialNumber, 0, snString.length());

        if (INetSDK.ControlDeviceEx(__LoginHandle, CtrlType.SDK_CTRL_LOWRATEWPAN_ADD, stuIn, null, 10 * 1000)) {
            ToolKits.writeLog("Add low rate WLAN sucess");
        }else {
            ToolKits.writeErrorLog("Add low rate WLAN failed");
        }
    }

	/**
	 * 获取Encode能力
	 */
	public void QueryEncodeCap() {
		CFG_ENCODECAP msg = new CFG_ENCODECAP();
		char szOutBuffer[] = new char[1024];
		Integer stError = new Integer(0);
		boolean bQN = INetSDK.QueryNewSystemInfo(__LoginHandle, FinalVar.CFG_CMD_ENCODE_GETCAPS, 0, szOutBuffer, stError, 5000);
		if (bQN) {
			bQN = INetSDK.ParseData(FinalVar.CFG_CMD_ENCODE_GETCAPS, szOutBuffer, msg, null);
			if (!bQN) {
				ToolKits.writeErrorLog("ParseData EncodeCap.getCaps error");
			}
			ToolKits.writeLog("ChannelNum = " + msg.nChannelNum);
			for(int i = 0; i < msg.nChannelNum; i ++){
				ToolKits.writeLog("stuVideoEncodeCap[" + i + "].nMaxCIFFrame = " + msg.stuVideoEncodeCap[i].nMaxCIFFrame);
				ToolKits.writeLog("stuVideoEncodeCap[" + i + "].nMaxEncodeAudios = " + msg.stuVideoEncodeCap[i].nMaxEncodeAudios);
				ToolKits.writeLog("stuVideoEncodeCap[" + i + "].nMinCIFFrame = " + msg.stuVideoEncodeCap[i].nMinCIFFrame);
			}
			ToolKits.writeLog("emPreviewMode = " + msg.emPreviewMode);
			ToolKits.writeLog("nSplitModeNum = " + msg.nSplitModeNum);
			for(int i = 0; i < msg.nSplitModeNum; i ++) ToolKits.writeLog("anSplitMode["+ i +"] = " + msg.anSplitMode[i]);
			ToolKits.writeLog("nAudioFrequenceCount = " + msg.nAudioFrequenceCount);
			for(int i = 0; i < msg.nAudioFrequenceCount; i ++) ToolKits.writeLog("nAudioFrequence["+ i +"] = " + msg.nAudioFrequence[i]);
		} else {
			ToolKits.writeErrorLog("QueryNewSystemInfo EncodeCap.getCaps error");
		}
	}

	/**
	 * 获取LowRateWPAN能力
	 */
	public void QueryLowRateWpan() {
		CFG_CAP_LOWRATEWPAN msg = new CFG_CAP_LOWRATEWPAN();
		char szOutBuffer[] = new char[1024];
		Integer stError = new Integer(0);
		boolean bQN = INetSDK.QueryNewSystemInfo(__LoginHandle, FinalVar.CFG_CAP_CMD_LOWRATEWPAN, 0, szOutBuffer, stError, 5000);
		if (bQN) {
			bQN = INetSDK.ParseData(FinalVar.CFG_CAP_CMD_LOWRATEWPAN, szOutBuffer, msg, null);
			if (!bQN) {
				ToolKits.writeErrorLog("ParseData LowRateWPAN.getCaps error");
			}

			ToolKits.writeLog("最大分页查询的对码条数:" + msg.nMaxPageSize);
			ToolKits.writeLog("获取支持的433网关数目, 0表示不支持无线设备:" + msg.n433GatewayCount);
		} else {
			ToolKits.writeErrorLog("QueryNewSystemInfo LowRateWPAN.getCaps error");
		}
	}

	/**
	 * 查询接入设备信息
	 */
	public void QueryProductDifinition() {
		CFG_PRODUCT_DEFINITION_INFO msg = new CFG_PRODUCT_DEFINITION_INFO();
		char szOutBuffer[] = new char[1024 * 8];
		Integer stError = new Integer(0);
		boolean bQN = INetSDK.QueryNewSystemInfo(__LoginHandle, FinalVar.CFG_CAP_CMD_PRODUCTDEFINITION, 0, szOutBuffer, stError, 5000);
		if (bQN) {
			bQN = INetSDK.ParseData(FinalVar.CFG_CAP_CMD_PRODUCTDEFINITION, szOutBuffer, msg, null);
			if (!bQN) {
				ToolKits.writeErrorLog("ParseData magicBox.getProductDefinition error");
			}

			ToolKits.writeLog("设备支持的报警数量:" + msg.nCoaxialAlarmCount);

			// 同轴报警类型
			// 0:未知
			// 1:同轴自带外部报警
			// 2:同轴自带动检报警
			// 3:同轴自带电压报警
			// 4:同轴网关防区传感器报警
			// 5:同轴网关报警喇叭
			// 6:同轴温度报警
			// 7:同轴湿度报警
			for(int i = 0; i < msg.nCoaxialAlarmCount; i++) {
				ToolKits.writeLog("设备支持的报警:" + msg.emCoaxialAlarm[i]);
			}
		} else {
			ToolKits.writeErrorLog("QueryNewSystemInfo magicBox.getProductDefinition error");
		}
	}

    /**
     * 查询无线设备列表及外设使能状态
     */
    void QueryCodeIDState() {
    	new Thread(new Runnable() {

			public void run() {
				/// 获取总条数
		    	NET_GET_CODEID_COUNT stuCount = new NET_GET_CODEID_COUNT();
		    	if (!INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_GET_CODEID_COUNT, stuCount, 10*1000)) {
		    		ToolKits.writeErrorLog("Get CodeID Count failed");
		    		return;
		    	}

		    	NET_GET_CODEID_LIST stuList = new NET_GET_CODEID_LIST(20/*GetMaxPage()*/);
		    	stuList.nStartIndex = 0;

		    	/// 按页查找
		    	do {
		    		if (!INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_GET_CODEID_LIST, stuList, 10*1000)) {
		    			ToolKits.writeErrorLog("INetSDK.QueryDevState SDK_DEVSTATE_GET_CODEID_LIST error");
		    		}

		    		for (int i = 0; i < stuList.nRetCodeIDNum; ++i) {
		    			ToolKits.writeLog("SerialNO " + new String(stuList.pstuCodeIDInfo[i].szSerialNumber).trim());
		    		}

		    		stuList.nStartIndex += stuList.nQueryNum;
		    	}while(stuList.nStartIndex < 20 /*GetMaxPage()*/);
			}
		}).start();
    }

    /**
     * 查询无线设备状态
     */
    void QueryWirelessDevState() {

    	NET_GET_WIRELESS_DEVICE_STATE stuMsg = new NET_GET_WIRELESS_DEVICE_STATE(20/*GetMaxPage()*/);
    	stuMsg.nStartIndex = 0;

    	/// 按页查找
    	do {
    		if (!INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_GET_WIRESSLESS_STATE, stuMsg, 10*1000)) {
    			ToolKits.writeErrorLog("INetSDK.QueryDevState SDK_DEVSTATE_GET_CODEID_LIST error");
    		}

    		for (int i = 0; i < stuMsg.nRetQueryNum; ++i) {
    			ToolKits.writeLog("SerialNO " + new String(stuMsg.pstuDeviceInfo[i].szSerialNumber).trim());
    		}

    		stuMsg.nStartIndex += stuMsg.nQueryNum;
    	}while(stuMsg.nStartIndex < 20 /*GetMaxPage()*/);
    }

    /**
     * 门禁系统，开锁
     */
    void OpenDoor() {
    	NET_CTRL_ACCESS_OPEN stuIn = new NET_CTRL_ACCESS_OPEN();
		stuIn.nChannelID = 0; // 通道号
		if (INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_ACCESS_OPEN, stuIn, 10 * 1000)) {
            ToolKits.writeLog("Test Open Door sucess");
        }else {
            ToolKits.writeErrorLog("Test Open Door failed");
        }
    }

    /**
     * 报警盒子，删除指定的设备
     */
    void RomoveLowRateWPAN() {
    	NET_CTRL_LOWRATEWPAN_REMOVE stuIn = new NET_CTRL_LOWRATEWPAN_REMOVE();
    	stuIn.nWirelessId = 20160608;
    	System.arraycopy("SN: Test".getBytes(), 0, stuIn.szSerialNumber, 0, "SN: Test".length());
    	if (INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_LOWRATEWPAN_REMOVE, stuIn, 10 * 1000)) {
            ToolKits.writeLog("Test Romove Device sucess");
        }else {
            ToolKits.writeErrorLog("Test Romove Device failed");
        }
    }

	// 修改无线设备信息
    void ModifyLowRateWPAN() {
    	NET_CTRL_LOWRATEWPAN_MODIFY stuIn = new NET_CTRL_LOWRATEWPAN_MODIFY();
    	System.arraycopy("Test".getBytes(), 0, stuIn.stuCodeIDInfo.szName, 0, "Test".length());
    	stuIn.stuCodeIDInfo.bEnable = true;

    	if (INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_LOWRATEWPAN_MODIFY, stuIn, 10 * 1000)) {
            ToolKits.writeLog("Test Modify Device sucess");
        }else {
            ToolKits.writeErrorLog("Test Modify Device failed");
        }
    }

    /**
     * 教学录播:
     * 	设置课程录像模式
     * 	获取课程录像模式
     *  获取导播预览通道号
     *  录播操作参考  TestRecordState
     *  获取软件版本
     *
     *  录播主机通道绑定关系配置
     *  查询录播录像文件
     */
    void TestCourseRecord() {
    	boolean bRet = false;

       	// 获取教室录像信息
    	int nType = EM_COURSERECORD_OPERATE_TYPE.EM_COURSERECORDE_TYPE_GET_INFO;
    	NET_IN_COURSERECORD_GETINFO inGetinfo = new NET_IN_COURSERECORD_GETINFO();
    	inGetinfo.nClassRoomID = 0;
    	NET_OUT_COURSERECORD_GETINFO outGetinfo = new NET_OUT_COURSERECORD_GETINFO();
    	bRet = INetSDK.OperateCourseRecordManager(__LoginHandle, nType, inGetinfo, outGetinfo, 4000);
    	if(bRet) {
    		ToolKits.writeLog("逻辑通道数量 : " + outGetinfo.nChannelNum);
    		for(int i = 0; i < outGetinfo.nChannelNum; i++) {
    			ToolKits.writeLog("" + outGetinfo.nCanRecord[i]);
    		}
    	}else {
    		ToolKits.writeErrorLog("Get Failed!" );
    	}

    	// 设置教室录像信息
    	bRet = false;
    	nType = EM_COURSERECORD_OPERATE_TYPE.EM_COURSERECORDE_TYPE_SET_INFO;
    	NET_IN_COURSERECORD_SETINFO inSetinfo = new NET_IN_COURSERECORD_SETINFO();
    	inSetinfo.nClassRoomID = 0;
    	inSetinfo.nChannelNum = 64;
    	inSetinfo.nCanRecord[0] = 0;
    	NET_OUT_COURSERECORD_SETINFO outSetinfo = new NET_OUT_COURSERECORD_SETINFO();
    	bRet = INetSDK.OperateCourseRecordManager(__LoginHandle, nType, inSetinfo, outSetinfo, 4000);
    	if(bRet) {
    		ToolKits.writeLog("Set Succeed!");
    	} else {
    		ToolKits.writeErrorLog("Set Failed!" );
    	}

    	// 将录像信息更新到time时的信息
    	bRet = false;
    	nType = EM_COURSERECORD_OPERATE_TYPE.EM_COURSERECORDE_TYPE_UPDATE_INFO;
    	NET_IN_COURSERECORD_UPDATE_INFO inUpdate = new NET_IN_COURSERECORD_UPDATE_INFO();
    	inUpdate.nClassRoomID = 0;
    	inUpdate.stuTime.dwYear = 2017;
    	inUpdate.stuTime.dwMonth = 1;
    	inUpdate.stuTime.dwDay = 13;
    	inUpdate.stuTime.dwHour = 11;
    	inUpdate.stuTime.dwMinute = 11;
    	inUpdate.stuTime.dwSecond = 11;
    	NET_OUT_COURSERECORD_UPDATE_INFO outUpdate = new NET_OUT_COURSERECORD_UPDATE_INFO();
    	bRet = INetSDK.OperateCourseRecordManager(__LoginHandle, nType, inUpdate, outUpdate, 4000);
    	if(bRet) {
    		ToolKits.writeLog("Update Succeed!");
    	} else {
    		ToolKits.writeErrorLog("Update Failed!" );
    	}

    	// 获取当前课程教室已录制时间
    	bRet = false;
    	nType = EM_COURSERECORD_OPERATE_TYPE.EM_COURSERECORDE_TYPE_GET_TIME;
    	NET_IN_COURSERECORD_GET_TIME inGettime = new NET_IN_COURSERECORD_GET_TIME();
    	inGettime.nClassRoomID = 0;
    	NET_OUT_COURSERECORD_GET_TIME outGettime = new NET_OUT_COURSERECORD_GET_TIME();
    	bRet = INetSDK.OperateCourseRecordManager(__LoginHandle, nType, inGettime, outGettime, 4000);
    	if(bRet) {
    		ToolKits.writeLog("GetTime Succeed!" + "\n" + "已录制时间 : " + outGettime.nTime);
    	} else {
    		ToolKits.writeErrorLog("GetTime Failed!" );
    	}


       	// 控制组合通道与逻辑通道
    	int typelock = EM_COURSECOMPOSITE_OPERATE_TYPE.EM_COURSECOMPOSITE_TYPE_LOCK_CONTROL;
    	NET_IN_COURSECOMPOSITE_LOCK_CONTROL inLock_CONTROL = new NET_IN_COURSECOMPOSITE_LOCK_CONTROL();
    	inLock_CONTROL.bLock = false;
    	inLock_CONTROL.nClassRoomID = 1;
    	inLock_CONTROL.nLogicChannel = 1;
    	NET_OUT_COURSECOMPOSITE_LOCK_CONTROL outLock_CONTROL = new NET_OUT_COURSECOMPOSITE_LOCK_CONTROL();

    	bRet = INetSDK.OperateCourseCompositeChannel(__LoginHandle, typelock, inLock_CONTROL, outLock_CONTROL, 4000);
    	if(bRet) {
    		ToolKits.writeLog("Lock Control Succeed!");
    	} else {
    		ToolKits.writeErrorLog("Lock Control Failed!" );
    	}

    	// 获取组合通道与逻辑通道的锁定信息
    	bRet = false;
    	int typeget = EM_COURSECOMPOSITE_OPERATE_TYPE.EM_COURSECOMPOSITE_TYPE_GET_LOCKINFO;
    	NET_IN_COURSECOMPOSITE_GET_LOCKINFO inGet_LOCKINFO = new NET_IN_COURSECOMPOSITE_GET_LOCKINFO();
    	inGet_LOCKINFO.nClassRoomID = 1;
    	inGet_LOCKINFO.nLogicChannel = 1;
    	NET_OUT_COURSECOMPOSITE_GET_LOCKINFO outGet_LOCKINFO = new NET_OUT_COURSECOMPOSITE_GET_LOCKINFO();
      	bRet = INetSDK.OperateCourseCompositeChannel(__LoginHandle, typeget, inGet_LOCKINFO, outGet_LOCKINFO, 4000);
      	if(bRet) {
      		ToolKits.writeLog("Get LockInfo Succeed! bState = " + outGet_LOCKINFO.bState);
      	} else {
      		ToolKits.writeErrorLog("Get LockInfo Failed!" );
      	}


	    	// 获取组合通道信息
	      	bRet = false;
	    	int typeget1 = EM_COURSECOMPOSITE_OPERATE_TYPE.EM_COURSECOMPOSITE_TYPE_GET_INFO;
	    	NET_IN_COURSECOMPOSITE_GET_INFO inGet_INFO = new NET_IN_COURSECOMPOSITE_GET_INFO();
	    	inGet_INFO.nClassRoomId = 1;
	    	NET_OUT_COURSECOMPOSITE_GET_INFO outGet_INFO = new NET_OUT_COURSECOMPOSITE_GET_INFO();

	    	bRet = INetSDK.OperateCourseCompositeChannel(__LoginHandle, typeget1, inGet_INFO, outGet_INFO, 4000);
	    	if(bRet) {
	    		ToolKits.writeLog("Get Info Succeed!" + "\n" + "录制模式：" + outGet_INFO.stuChannelInfo.nCompositeChannelMode+
	    				";nChannelNum:"+outGet_INFO.stuChannelInfo.nChannelNum+";CourseName:"+new String(outGet_INFO.stuChannelInfo.szCourseName));

	    	} else {
	    		ToolKits.writeErrorLog("Get Info Failed!" );
	    	}

	    	outGet_INFO.stuChannelInfo.nCompositeChannelMode = -2;
	    	// 设置组合通道信息
	    	bRet = false;
	    	int typeset = EM_COURSECOMPOSITE_OPERATE_TYPE.EM_COURSECOMPOSITE_TYPE_SET_INFO;
	    	NET_IN_COURSECOMPOSITE_SET_INFO inSet_INFO = new NET_IN_COURSECOMPOSITE_SET_INFO();
	      	inSet_INFO.nClassRoomId = 1;
	    	inSet_INFO.stuChannelInfo = outGet_INFO.stuChannelInfo;
	    	NET_OUT_COURSECOMPOSITE_SET_INFO outSet_INFO = new NET_OUT_COURSECOMPOSITE_SET_INFO();

	    	bRet = INetSDK.OperateCourseCompositeChannel(__LoginHandle, typeset, inSet_INFO, outSet_INFO, 4000);
	    	if(bRet) {
	    		ToolKits.writeLog("Set Info Succeed!");
	    	} else {
	    		ToolKits.writeErrorLog("Set Info Failed!" );
	    	}

    	// 将组合通道信息更新到time时的信息
    	int typeupdate = EM_COURSECOMPOSITE_OPERATE_TYPE.EM_COURSECOMPOSITE_TYPE_UPDATE_INFO;
    	NET_IN_COURSECOMPOSITE_UPDATE_INFO inUpdate_INFO = new NET_IN_COURSECOMPOSITE_UPDATE_INFO();
    	inUpdate_INFO.nClassRoomId = 1;
    	inUpdate_INFO.stuTime.dwYear = 2017;
    	inUpdate_INFO.stuTime.dwMonth = 1;
    	inUpdate_INFO.stuTime.dwDay = 6;
    	inUpdate_INFO.stuTime.dwHour = 0;
    	inUpdate_INFO.stuTime.dwMinute = 0;
    	inUpdate_INFO.stuTime.dwSecond = 0;
    	NET_OUT_COURSECOMPOSITE_UPDATE_INFO outUpdate_INFO = new NET_OUT_COURSECOMPOSITE_UPDATE_INFO();

    	bRet = INetSDK.OperateCourseCompositeChannel(__LoginHandle, typeupdate, inUpdate_INFO, outUpdate_INFO, 4000);
    	if(bRet) {
    		ToolKits.writeLog("Update Succeed!");
    	} else {
    		ToolKits.writeErrorLog("Update Failed!" );
    	}


    	// 设置: 注意如果重复设置相同的录像模式，设备将会返回失败
    	NET_IN_SET_COURSE_RECORD_MODE pInBuf = new NET_IN_SET_COURSE_RECORD_MODE();
    	pInBuf.emRecordMode = 1; // 普通模式
    	NET_OUT_SET_COURSE_RECORD_MODE pOutBuf = new NET_OUT_SET_COURSE_RECORD_MODE();
    	if(INetSDK.SetCourseRecordMode(__LoginHandle, pInBuf, pOutBuf, 10*1000)) {
    		ToolKits.writeLog("SetCourseRecordMode Success");
    	}
    	else {
    		ToolKits.writeLog("SetCourseRecordMode Failed");
    	}

    	// 获取
    	NET_IN_GET_COURSE_RECORD_MODE getModeIn = new NET_IN_GET_COURSE_RECORD_MODE();
    	NET_OUT_GET_COURSE_RECORD_MODE getModeOut = new NET_OUT_GET_COURSE_RECORD_MODE();

    	if(INetSDK.GetCourseRecordMode(__LoginHandle, getModeIn, getModeOut, 10*1000)) {
    		ToolKits.writeLog("GetCourseRecordMode Success" + "Mode " + getModeOut.emRecordMode);
    	}
    	else {
    		ToolKits.writeLog("GetCourseRecordMode Failed");
    	}

    	// 获取软件版本
    	SDKDEV_VERSION_INFO info = new SDKDEV_VERSION_INFO();
    	bRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_SOFTWARE, info, 10*1000);
    	if (bRet) {
    		ToolKits.writeLog("QueryDevState" + "SV: " + new String(info.szSoftWareVersion).trim());
    		ToolKits.writeLog("QueryDevState" + "szDevSerialNo: " + new String(info.szDevSerialNo).trim());
    		int buildData = info.dwSoftwareBuildDate;

    		int day = buildData & 0xff;
    		buildData >>= 8;
    		int month = buildData & 0xff;
    		int year = buildData >> 8;

    		ToolKits.writeLog("QueryDevState" + "BuildData: " + year + "-" +month + "-" + day);
    	}
    	else {
    		ToolKits.writeLog("QueryDevState  SDK_DEVSTATE_SOFTWARE Failed");
    	}

    	// 开启关闭录播
    	NET_IN_SET_COURSE_RECORD_STATE InMsg = new NET_IN_SET_COURSE_RECORD_STATE();
    	InMsg.nAction = 0;
    	InMsg.nChannel = 0;

    	NET_OUT_SET_COURSE_RECORD_STATE OutMsg = new NET_OUT_SET_COURSE_RECORD_STATE();
    	bRet = INetSDK.SetCourseRecordState(__LoginHandle, InMsg, OutMsg, 10*1000);
    	if (bRet) {
    		ToolKits.writeLog("SetCoureRecordState Success");
    	}
    	else {
    		ToolKits.writeLog("SetCoureRecordState Failed");
    	}

    	// 录播主机通道绑定关系配置
    	CFG_COURSE_CHANNELBIND_INFO stCfgs = new CFG_COURSE_CHANNELBIND_INFO();
		boolean bCfgs = ToolKits.GetDevConfig(FinalVar.CFG_CMD_COURSE_CHANNELBIND, stCfgs, __LoginHandle, -1, 10240);
		if (bCfgs) {
			// 当配置时需要停止录播
			bCfgs = ToolKits.SetDevConfig(FinalVar.CFG_CMD_COURSE_CHANNELBIND, stCfgs, __LoginHandle, -1, 10240);
			if (bCfgs)
			{
				ToolKits.writeLog("CHANNELBIND SetDevConfig OK ! " + stCfgs);
			}
		}

		// 查询录播录像文件
		NET_IN_QUERY_COURSEMEDIA_FILEOPEN  stuInOpen = new NET_IN_QUERY_COURSEMEDIA_FILEOPEN();
	    stuInOpen.stuStartTime.dwYear = 2016;
	    stuInOpen.stuStartTime.dwMonth = 12;
	    stuInOpen.stuStartTime.dwDay = 22;
	    stuInOpen.stuStartTime.dwHour = 16;
	    stuInOpen.stuStartTime.dwMinute = 0;
	    stuInOpen.stuStartTime.dwSecond = 0;

	    stuInOpen.stuEndTime.dwYear = 2016;
	    stuInOpen.stuEndTime.dwMonth = 12;
	    stuInOpen.stuEndTime.dwDay = 22;
	    stuInOpen.stuEndTime.dwHour = 18;
	    stuInOpen.stuEndTime.dwMinute = 0;
	    stuInOpen.stuEndTime.dwSecond = 0;
	    NET_OUT_QUERY_COURSEMEDIA_FILEOPEN stuOutOpen = new NET_OUT_QUERY_COURSEMEDIA_FILEOPEN();

	    if(INetSDK.OpenQueryCourseMediaFile(__LoginHandle, stuInOpen, stuOutOpen,5000)) {
	    	ToolKits.writeLog("ntotalNum : " + stuOutOpen.ntotalNum + "\n" +
	    				      "nfindID : " + stuOutOpen.nfindID);
	    } else {
	    	ToolKits.writeErrorLog("Failed" );
	    }

	    if (stuOutOpen.ntotalNum > 0) {
		    NET_IN_QUERY_COURSEMEDIA_FILE stuInDo = new NET_IN_QUERY_COURSEMEDIA_FILE();
		    stuInDo.nfindID = stuOutOpen.nfindID;
		    stuInDo.nOffset = 0;
		    stuInDo.nCount = 20;
		    NET_OUT_QUERY_COURSEMEDIA_FILE stuOutDo = new NET_OUT_QUERY_COURSEMEDIA_FILE();

		    if(INetSDK.DoQueryCourseMediaFile(__LoginHandle, stuInDo, stuOutDo, 20000)) {

		    	ToolKits.writeLog("查询到的个数 : " + stuOutDo.nCountResult);

		    	for(int i=0; i<stuOutDo.nCountResult; i++) {
			    	ToolKits.writeLog("ID: " + stuOutDo.stuCourseMediaFile[i].nID +
			    					  "通道数量：" + stuOutDo.stuCourseMediaFile[i].nChannelNum);

			    	for(int m=0; m<16; m++) {
			    		for(int n=0; n<16; n++){
			    			ToolKits.writeLog("Record Info:" + "\n" + stuOutDo.stuCourseMediaFile[i].stuRecordInfo[m][n].stuStartTime + "\n" +
			    					          stuOutDo.stuCourseMediaFile[i].stuRecordInfo[m][n].stuEndTime);
			    		}
			    	}
		    	}
		    }else {
		    	ToolKits.writeErrorLog("Failed2" );
		    }
	    }
	    NET_IN_QUERY_COURSEMEDIA_FILECLOSE stuInColse = new NET_IN_QUERY_COURSEMEDIA_FILECLOSE();
	    NET_OUT_QUERY_COURSEMEDIA_FILECLOSE stuOutColse = new NET_OUT_QUERY_COURSEMEDIA_FILECLOSE();
	    stuInColse.nFindID = stuOutOpen.nfindID;

	    INetSDK.CloseQueryCourseMediaFile(__LoginHandle, stuInColse, stuOutColse,2000);
    }

	/**
	 * 区域配置
	 */
	public void DSTConfig() {
		AV_CFG_Locales msg = new AV_CFG_Locales();

		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_LOCALS, msg, __LoginHandle, -1, 10240);
		if (zRet) {
			ToolKits.writeLog("时间格式 : " + new String( msg.szTimeFormat).trim());
			ToolKits.writeLog("夏令时使能 :" + msg.bDSTEnable);
			ToolKits.writeLog("开始时间 : " + msg.stuDstStart.toString());
			ToolKits.writeLog("结束时间 : " + msg.stuDstEnd.toString());

			// 设置
			msg.bDSTEnable = true;
			msg.stuDstEnd.nDay = 3;
			zRet = false;
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_LOCALS, msg, __LoginHandle, -1, 10240);
			if (zRet)
			{
				ToolKits.writeLog("NTP SetDevConfig OK !");
			}
		}
	}


	/**
     * NTP配置
     */
    void NTPConfig() {
    	CFG_NTP_INFO stCfgs = new CFG_NTP_INFO();
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_NTP, stCfgs, __LoginHandle, -1, 10240);
		if (zRet) {
			ToolKits.writeLog("bEnable : " + stCfgs.bEnable);
			ToolKits.writeLog("Address : " + new String(stCfgs.szAddress).trim());

			// 设置
			stCfgs.bEnable = true;
			String timeZone = new String("BeiJing");
			System.arraycopy(timeZone.getBytes(), 0, stCfgs.szTimeZoneDesc, 0, timeZone.getBytes().length);

			// 备用服务器
			for(int i = 0; i < stCfgs.nSandbyServerNum; ++i ) {
				ToolKits.writeLog("i " + i + "Port " + stCfgs.stuStandbyServer[i].nPort);
			}

			zRet = false;
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_NTP, stCfgs, __LoginHandle, -1, 10240);
			if (zRet)
			{
				ToolKits.writeLog("NTP SetDevConfig OK !");
			}
		}
    }

	/**
	 *
	 */
	void TestRecordFlie() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				QueryRecordFile();
			}
		}).start();
		new Thread(new Runnable() {
			int temp = 1;
			Integer temp0 = 1;
			long lastCheckMillis = 0;
			@Override
			public void run() {
				while (true) {
					try {
						sleep(1000);
					} catch (Exception e) {
						break;
					}

					long now = System.currentTimeMillis();
					if (now - lastCheckMillis > 10000) {
						lastCheckMillis = now;
					}
					ToolKits.writeLog("temp0:"+temp0+" temp:"+temp);
					if (temp != temp0) {
						ToolKits.writeLog("get into error integer");
						break;
					}
				}

			}
		}).start();


	}


    /**
     * 视频分割操作类型
     */
    void TestOperateSplit() {
    	long lLoginID = __LoginHandle;
    	int emType = -1;
    	int nWaitTime = 5000;
    	boolean bRet = false;
    	Object inParam;
    	Object outParam;

    	/// 1. 设置背景图片
//    	NET_IN_SPLIT_SET_BACKGROUND inParam = new NET_IN_SPLIT_SET_BACKGROUND();
//    	inParam.bEnable = true;
//    	inParam.nChannel = 1;
//    	inParam.pszFileName = new String("SetBackGround");
//
//    	NET_OUT_SPLIT_SET_BACKBROUND outParam = new NET_OUT_SPLIT_SET_BACKBROUND();
//
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_SET_BACKGROUND;

    	/// 2. 获取背景图片
//    	NET_IN_SPLIT_GET_BACKGROUND inParam = new NET_IN_SPLIT_GET_BACKGROUND();
//    	NET_OUT_SPLIT_GET_BACKGROUND outParam = new NET_OUT_SPLIT_GET_BACKGROUND();
//
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_GET_BACKGROUND;

    	/// 3. 设置预拉流源
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_SET_PREPULLSRC;
//    	NET_IN_SPLIT_SET_PREPULLSRC inParam = new NET_IN_SPLIT_SET_PREPULLSRC(2);
//    	NET_OUT_SPLIT_SET_PREPULLSRC outParam = new NET_OUT_SPLIT_SET_PREPULLSRC(2);

    	/// 4. 设置源边框高亮使能开关
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_SET_HIGHLIGHT;
//    	NET_IN_SPLIT_SET_HIGHLIGHT inParam = new NET_IN_SPLIT_SET_HIGHLIGHT();
//    	NET_OUT_SPLIT_SET_HIGHLIGHT outParam = new NET_OUT_SPLIT_SET_HIGHLIGHT();

    	/// 5. 调整窗口Z序
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_SET_ZORDER;
//    	NET_IN_SPLIT_SET_ZORDER inParam = new NET_IN_SPLIT_SET_ZORDER();
//    	inParam.nChannel = 0;
//    	NET_OUT_SPLIT_SET_ZORDER outParam = new NET_OUT_SPLIT_SET_ZORDER(5);

    	/// 6. 窗口轮巡控制
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_SET_TOUR;
//    	inParam = new NET_IN_SPLIT_SET_TOUR();
//    	outParam = new NET_OUT_SPLIT_SET_TOUR();
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

    	/// 7. 获取窗口轮巡状态
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_GET_TOUR_STATUS;
//    	inParam = new NET_IN_SPLIT_GET_TOUR_STATUS();
//    	outParam = new NET_OUT_SPLIT_GET_TOUR_STATUS(5);
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

    	/// 8. 获取屏内窗口信息
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_GET_SCENE;
//    	inParam = new NET_IN_SPLIT_GET_SCENE();
//    	outParam = new NET_OUT_SPLIT_GET_SCENE(5);
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

    	/// 9. 批量开窗
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_OPEN_WINDOWS;
//    	inParam = new NET_IN_SPLIT_OPEN_WINDOWS(5);
//    	outParam = new NET_OUT_SPLIT_OPEN_WINDOWS(5);
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

    	/// 10. 设置工作模式
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_SET_WORK_MODE;
//    	inParam = new NET_IN_SPLIT_SET_WORK_MODE();
//    	outParam = new NET_OUT_SPLIT_SET_WORK_MODE();
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

    	/// 11. 获取播放器实例
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_GET_PLAYER;
//    	inParam = new NET_IN_SPLIT_GET_PLAYER();
//    	outParam = new NET_OUT_SPLIT_GET_PLAYER();
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

    	/// 12. 设置窗口工作模式
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_WM_OPERATE_SET_WORK_MODE;
//    	inParam = new NET_IN_WM_SET_WORK_MODE();
//    	outParam = new NET_OUT_WM_SET_WORK_MODE();
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

    	/// 13. 获取窗口工作模式
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_WM_OPERATE_GET_WORK_MODE;
//    	inParam = new NET_IN_WM_GET_WORK_MODE();
//    	outParam = new NET_OUT_WM_GET_WORK_MODE();
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

    	/// 14. 批量关窗
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_SPLIT_OPERATE_CLOSE_WINDOWS;
//    	inParam = new NET_IN_SPLIT_CLOSE_WINDOWS(5);
//    	outParam = new NET_OUT_SPLIT_CLOSE_WINDOWS(5);
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

    	/// 15. 设置输出屏的鱼眼矫正规则
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_WM_OPERATE_SET_FISH_EYE_PARAM;
//    	inParam = new NET_IN_WM_SET_FISH_EYE_PARAM(5);
//    	outParam = new NET_OUT_WM_SET_FISH_EYE_PARAM();
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

    	/// 16. 设置窗口走廊模式
//    	emType = NET_SPLIT_OPERATE_TYPE.NET_WM_OPERATE_SET_CORRIDOR_MODE;
//    	inParam = new NET_IN_WM_SET_CORRIDOR_MODE();
//    	outParam = new NET_OUT_WM_SET_CORRIDOR_MODE();
//    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
//    	if (bRet) {
//    		ToolKits.writeLog("OperateSplit OK !!!");
//    	}
//    	else{
//    		ToolKits.writeErrorLog("Failed to OperateSplit");
//    	}

    	/// 17. 获取窗口走廊模式
    	emType = NET_SPLIT_OPERATE_TYPE.NET_WM_OPERATE_GET_CORRIDOR_MODE;
    	inParam = new NET_IN_WM_GET_CORRIDOR_MODE();
    	outParam = new NET_OUT_WM_GET_CORRIDOR_MODE();
    	bRet = INetSDK.OperateSplit(lLoginID, emType, inParam, outParam, nWaitTime);
    	if (bRet) {
    		ToolKits.writeLog("OperateSplit OK !!!");
    	}
    	else{
    		ToolKits.writeErrorLog("Failed to OperateSplit");
    	}
    }


	public class TestDownLoadPosCallBack implements CB_fDownLoadPosCallBack {
		@Override
		public void invoke(long lPlayHandle, int dwTotalSize, int dwDownLoadSize) {
			ToolKits.writeLog("dwDownLoadSize = " + dwDownLoadSize + "   dwTotalSize = " + dwTotalSize + "\n");
			int count = 0;
			if(-1 == dwDownLoadSize) {
				INetSDK.StopDownload(lDownloadHandle);
				ToolKits.writeLog("DownLoad Completed!!!" + "lDownloadHandle = " + lDownloadHandle);
			}
		}
	}
	private long lDownloadHandle;
    TestDownLoadPosCallBack cbUser = new TestDownLoadPosCallBack();
    int downCount = 0;
    /**
     * 查询备份设备详细信息
     */
 	public void QueryBackupDev()
 	{
 		// 1.查询设备信息
		SDKDEV_BACKUP_LIST backupDevList = new SDKDEV_BACKUP_LIST();
		boolean aRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_BACKUP_DEV, backupDevList, 5000);
		if (aRet)
		{
			ToolKits.writeLog("query backup dev list succeed" + backupDevList.nBackupDevNum + "/" + backupDevList.szBackupDevNames[0]);

			// 2.查询设备详细信息
			SDKDEV_BACKUP_INFO backupDevInfo = new SDKDEV_BACKUP_INFO();
			System.arraycopy(backupDevList.szBackupDevNames[0], 0, backupDevInfo.szName, 0, backupDevList.szBackupDevNames[0].length);
			boolean bRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_BACKUP_DEV_INFO, backupDevInfo, 5000);
			if(bRet) {
				ToolKits.writeLog("query backup dev info succeed" + backupDevInfo.szName + backupDevInfo.byType + backupDevInfo.byBus
						+ backupDevInfo.nCapability + backupDevInfo.nRemain + backupDevInfo.szDirectory);
			}

			// 查询录像文件信息
			int nChannelId = 0;
			int nRecordFileType = 4;   // 庭审里，按案件查询，为4;  查询录像设为0； 查询图片设为9
			NET_TIME stTimeStart = new NET_TIME();
			stTimeStart.dwYear = 2016;
			stTimeStart.dwMonth = 12;
			stTimeStart.dwDay = 1;
			stTimeStart.dwHour = 12;
			stTimeStart.dwMinute = 0;
			stTimeStart.dwSecond = 0;

			NET_TIME stTimeEnd = new NET_TIME();
			stTimeEnd.dwYear = 2016;
			stTimeEnd.dwMonth = 12;
			stTimeEnd.dwDay = 1;
			stTimeEnd.dwHour = 17;
			stTimeEnd.dwMinute = 0;
			stTimeEnd.dwSecond = 0;

			NET_RECORDFILE_INFO[] stFileInfo =  new NET_RECORDFILE_INFO[20]; //数组大小是查询的录像等的最大值
			for(int i=0; i<stFileInfo.length; i++) {
				stFileInfo[i] = new NET_RECORDFILE_INFO();
			}

			String cardID = null;  // 在庭审项目里，是自定义里的案件内容， 查询其他设为null
			Integer nFileCount = new Integer(0);

			boolean cRet = INetSDK.QueryRecordFile(__LoginHandle, nChannelId, nRecordFileType, stTimeStart, stTimeEnd, cardID, stFileInfo, nFileCount, 5000, false);
			if(cRet) {
				ToolKits.writeLog("QueryRecordFile  Succeed!" + nFileCount.intValue() + "\n");
			}

			// 开始备份
			BACKUP_RECORD backRecord = new BACKUP_RECORD();
			System.arraycopy(backupDevList.szBackupDevNames[0], 0, backRecord.szDeviceName, 0, backRecord.szDeviceName.length);
			backRecord.nRecordNum = 1;
			for(int i=0; i < stFileInfo.length; i++) {
				backRecord.stuRecordInfo[i] = stFileInfo[i];
			}
			backRecord.stuRecordInfo[0].ch = stFileInfo[0].ch;
			System.arraycopy(stFileInfo[0].filename, 0, backRecord.stuRecordInfo[0].filename, 0, backRecord.stuRecordInfo[0].filename.length);
			backRecord.stuRecordInfo[0].size = stFileInfo[0].size;
			backRecord.stuRecordInfo[0].starttime= stFileInfo[0].starttime;
			backRecord.stuRecordInfo[0].endtime = stFileInfo[0].endtime;
			backRecord.stuRecordInfo[0].driveno = stFileInfo[0].driveno;
			backRecord.stuRecordInfo[0].startcluster = stFileInfo[0].startcluster;
			backRecord.stuRecordInfo[0].nRecordFileType = stFileInfo[0].nRecordFileType;
			backRecord.stuRecordInfo[0].bImportantRecID = stFileInfo[0].bImportantRecID;
			backRecord.stuRecordInfo[0].bHint = stFileInfo[0].bHint;
			backRecord.stuRecordInfo[0].bRecType = stFileInfo[0].bRecType;

			boolean dRet = INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_BACKUP_START, backRecord, 10000);
			if(dRet) {
				ToolKits.writeLog("BackupStart Succeed!");
			} else {
				ToolKits.writeErrorLog("BackupStart Failed!" );
			}

			// 5.查看备份进度
			SDKDEV_BACKUP_FEEDBACK backupfeedback = new SDKDEV_BACKUP_FEEDBACK();
			System.arraycopy(backupDevList.szBackupDevNames[0], 0, backupfeedback.szName, 0, backupDevList.szBackupDevNames[0].length);
			boolean eRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_BACKUP_FEEDBACK, backupfeedback, 5000);
		    if(eRet) {
		    	ToolKits.writeLog("FeedBack Succeed!" + backupfeedback.nCapability + "----" + backupfeedback.nRemain);
		    } else {
		    	ToolKits.writeErrorLog("FeedBack Failed!" );
		    }
		}
 	}

	// 查询录像/下载录像
	public void QueryRecorFile_DownloadRecord() {
		// 刻录配置
//		String strCmdJudicature = FinalVar.CFG_CMD_JUDICATURE;
//		CFG_JUDICATURE_INFO judicatureInfo = new CFG_JUDICATURE_INFO();
//		// 获取
//		boolean bJudicatureGet = ToolKits.GetDevConfig(strCmdJudicature, judicatureInfo, __LoginHandle, -1, 1024*1024*2);
//		if(bJudicatureGet) {
//			ToolKits.writeLog("GetJudicature Succeed!" + "\n" + judicatureInfo.nCustomCase + "\n" +
//					"案件名称：" + new String(judicatureInfo.stuCustomCases[1].szCaseTitle).trim() +
//					"案件内容：" + new String(judicatureInfo.stuCustomCases[1].szCaseContent).trim() + "\n");
//		} else {
//			ToolKits.writeErrorLog("GetJudicature Failed!" +INetSDK.GetLastError());
//		}


		// 查询录像文件信息
		int nChannelId = 0;
		int nRecordFileType = 4;   // 庭审里，按案件查询，为4;  查询录像设为0； 查询图片设为9
		NET_TIME stTimeStart = new NET_TIME();
		stTimeStart.dwYear = 2016;
		stTimeStart.dwMonth = 12;
		stTimeStart.dwDay = 1;
		stTimeStart.dwHour = 12;
		stTimeStart.dwMinute = 0;
		stTimeStart.dwSecond = 0;

		NET_TIME stTimeEnd = new NET_TIME();
		stTimeEnd.dwYear = 2016;
		stTimeEnd.dwMonth = 12;
		stTimeEnd.dwDay = 1;
		stTimeEnd.dwHour = 17;
		stTimeEnd.dwMinute = 0;
		stTimeEnd.dwSecond = 0;

		NET_RECORDFILE_INFO[] stFileInfo =  new NET_RECORDFILE_INFO[20]; //数组大小是查询的录像等的最大值
		for(int i=0; i<stFileInfo.length; i++) {
			stFileInfo[i] = new NET_RECORDFILE_INFO();
		}

		String cardID = null;  // 在庭审项目里，是自定义里的案件内容， 查询其他设为null
		Integer nFileCount = new Integer(0);

		boolean cRet = INetSDK.QueryRecordFile(__LoginHandle, nChannelId, nRecordFileType, stTimeStart, stTimeEnd, cardID, stFileInfo, nFileCount, 5000, false);
		if(cRet) {
			ToolKits.writeLog("QueryRecordFile  Succeed!" + nFileCount.intValue() + "\n");
		}


		INetSDK.StopDownload(lDownloadHandle);

		downCount = nFileCount.intValue();
		// 按文件下载(录像一个一个下载)
		for(int j = 0; j < downCount; j++) {
			String filePathName = "/mnt/sdcard/DownNetSDK/" + j + ".dav";
			lDownloadHandle = INetSDK.DownloadByRecordFile(__LoginHandle, stFileInfo[j], filePathName, cbUser);

			if(lDownloadHandle != 0) {
				ToolKits.writeLog("DownloadByRecordFile Succeed!" + "lDownloadHandle = " + lDownloadHandle);
			} else {
				ToolKits.writeErrorLog("DownloadByRecordFile Failed!" );
			}
		}
	}

 	/**
     * 融合屏通道信息
     */
    public void QueryComposite()
	{
        // 1.查询融合屏通道信息
		SDK_COMPOSITE_CHANNEL compositeDevInfo = new SDK_COMPOSITE_CHANNEL();
		boolean bRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_COMPOSITE_CHN, compositeDevInfo, 5000);
		if (bRet)
		{
			ToolKits.writeLog("query composite dev info success" + compositeDevInfo);
		}
		else
		{
			ToolKits.writeErrorLog("query composite dev info err:" );
		}
		// 2.测试融合屏配置
/*    	String name = "dahua00";
    	String wallName = "dahuaWall00";
    	String strCmd = FinalVar.CFG_CMD_SPLICESCREEN;
    	AV_CFG_SpliceScreen stParseData = new AV_CFG_SpliceScreen();
    	int nBufferLen = 64 * 1024;
    	boolean zRet = ToolKits.GetDevConfig(strCmd, stParseData, __LoginHandle, -1, nBufferLen);
    	if(zRet) {
    		ToolKits.writeLog("QueryConfig Succeed!" + "szName=" + new String(stParseData.szName) + "; szWallName=" + new String(stParseData.szWallName) +
    				      "; nBlockID=" + String.valueOf(stParseData.nBlockID) +  "; nTop=" +String.valueOf(stParseData.stuRect.nTop) + "; nBottom=" + String.valueOf(stParseData.stuRect.nBottom)
    				       + "; nLeft=" + String.valueOf(stParseData.stuRect.nLeft) + "; nRight=" + String.valueOf(stParseData.stuRect.nRight));

        	System.arraycopy(name.getBytes(), 0, stParseData.szName, 0, name.getBytes().length);
        	System.arraycopy(wallName.getBytes(), 0, stParseData.szWallName, 0, wallName.getBytes().length);
        	stParseData.nBlockID = 1;
        	stParseData.stuRect.nTop = 25;
        	stParseData.stuRect.nBottom = 25;
        	stParseData.stuRect.nLeft = 25;
        	stParseData.stuRect.nRight = 25;
        	boolean bRet = ToolKits.SetDevConfig(strCmd, stParseData, __LoginHandle, 0, nBufferLen);
        	if(bRet) {
        		ToolKits.writeLog("SetConfig Succeed!");
        	} else {
        		ToolKits.writeErrorLog("SetConfig Failed!" );
        	}
    	}else{
    		ToolKits.writeErrorLog("QueryConfig Failed!" );
    	}*/



        // 3.CFG_CMD_DVRIP//  Get //"DVRIP" GetSpliceScreen

/*    	String szID = "55555";
    	String adress = "111.3.16.45";
    	String strCmd = FinalVar.CFG_CMD_DVRIP;
       	CFG_DVRIP_INFO stParseData = new CFG_DVRIP_INFO();
       	int nBufferLen = 64 * 1024;
    	boolean zRet = ToolKits.GetDevConfig(strCmd, stParseData, __LoginHandle, 0, nBufferLen);
    	if(zRet) {
    		ToolKits.writeLog("ConfigGet Succeed!" + String.valueOf(stParseData.nTcpPort) + "; " + String.valueOf(stParseData.nSSLPort) + ";" + String.valueOf(stParseData.nUDPPort) + ";" + String.valueOf(stParseData.nRegistersNum));

    		stParseData.stuRegisters[0].bEnable = !stParseData.stuRegisters[0].bEnable;
    		System.arraycopy(szID.getBytes(), 0, stParseData.stuRegisters[0].szDeviceID , 0, szID.getBytes().length);
    		stParseData.stuRegisters[0].stuServers[0].nPort = 37006;
    		System.arraycopy(adress.getBytes(), 0, stParseData.stuRegisters[0].stuServers[0].szAddress, 0, adress.getBytes().length);

    		boolean bRet = ToolKits.SetDevConfig(strCmd, stParseData, __LoginHandle, 0, nBufferLen);
    		if(bRet) {
        		ToolKits.writeLog("ConfigSet Succeed!");
    		}else {
    			ToolKits.writeErrorLog("ConfigSet Failed!" );
    		}
    	} else {
    		ToolKits.writeErrorLog("ConfigGet Failed!" );
    	}*/
    }

    /**
     * 自由开窗
     */
    public void SplitWindow()
 	{
    	// 1.自由开窗
 		SDK_IN_SPLIT_OPEN_WINDOW inOpenWindow = new SDK_IN_SPLIT_OPEN_WINDOW();
     	inOpenWindow.nChannel = 0;
     	inOpenWindow.stuRect.left = 20;
     	inOpenWindow.stuRect.right = 20;
     	inOpenWindow.stuRect.top = 20;
     	inOpenWindow.stuRect.bottom = 20;
     	inOpenWindow.bDirectable = true;
     	SDK_OUT_SPLIT_OPEN_WINDOW outOpenWindow = new SDK_OUT_SPLIT_OPEN_WINDOW();
//     	outOpenWindow.nWindowID = 1;
//     	outOpenWindow.nZOrder = 1;

    	    boolean zRet = INetSDK.OpenSplitWindow(__LoginHandle, inOpenWindow, outOpenWindow, 5000);
			if (zRet)
			{
				ToolKits.writeLog("OpenSplitWindow Succeed!" + inOpenWindow + outOpenWindow);

			} else {
				ToolKits.writeErrorLog("OpenSplitWindow Failed!" );
			}

 		// 2.自由关窗
/* 	    SDK_IN_SPLIT_CLOSE_WINDOW inCloseWindow = new SDK_IN_SPLIT_CLOSE_WINDOW();
 	    inCloseWindow.nChannel = 0;
 	    inCloseWindow.nWindowID = 1;
       	SDK_OUT_SPLIT_CLOSE_WINDOW  outCloseWindow = new  SDK_OUT_SPLIT_CLOSE_WINDOW();

 	    boolean zRet = INetSDK.CloseSplitWindow(__LoginHandle, inCloseWindow, outCloseWindow, 5000);
 		if (zRet)
 		{
 				ToolKits.writeLog("CloseSplitWindow Succeed!" + inCloseWindow + outCloseWindow);

 		} else {
 				ToolKits.writeErrorLog("CloseSplitWindow Failed!" );

 		}*/

        // 3.设置窗口位置
/*		SDK_IN_SPLIT_SET_RECT inSetRect = new SDK_IN_SPLIT_SET_RECT();
     	inSetRect.nChannel = 0;
     	inSetRect.nWindowID = 1;
     	inSetRect.stuRect.left = 20;
     	inSetRect.stuRect.right = 20;
     	inSetRect.stuRect.top = 20;
     	inSetRect.stuRect.bottom = 20;
     	inSetRect.bDirectable = false;
     	SDK_OUT_SPLIT_SET_RECT outSetRect = new SDK_OUT_SPLIT_SET_RECT();

     	boolean zRet = INetSDK.SetSplitWindowRect(__LoginHandle, inSetRect, outSetRect, 5000);
		if (zRet)
		{
			ToolKits.writeLog("SetSplitWindowRect Succeed!" );

		} else {
			ToolKits.writeErrorLog("SetSplitWindowRect Failed!" );

		}*/

        // 4.设置窗口次序
/* 		SDK_IN_SPLIT_SET_TOP_WINDOW inSetTop = new SDK_IN_SPLIT_SET_TOP_WINDOW();
     	inSetTop.nChannel = 0;
     	inSetTop.nWindowID = 1;
     	SDK_OUT_SPLIT_SET_TOP_WINDOW outSetTop = new SDK_OUT_SPLIT_SET_TOP_WINDOW(10);
     	outSetTop.pZOders[0].nWindowID = 22222;
     	outSetTop.pZOders[0].nZOrder = 1;
     	outSetTop.nMaxWndCount = 10;
     	outSetTop.nWndCount = 6;

     	boolean zRet = INetSDK.SetSplitTopWindow(__LoginHandle, inSetTop, outSetTop, 5000) ;
		if (zRet)
		{
			ToolKits.writeLog("SetSplitTopWindow Succeed!" );

		} else {
			ToolKits.writeErrorLog("SetSplitTopWindow Failed!" );
		}*/

        // 5.获取当前显示的所有窗口信息
/* 	   	SDK_IN_SPLIT_GET_WINDOWS inGetWindow = new SDK_IN_SPLIT_GET_WINDOWS();
     	SDK_OUT_SPLIT_GET_WINDOWS outGetWindow = new SDK_OUT_SPLIT_GET_WINDOWS();
     	boolean zRet = INetSDK.GetSplitWindowsInfo(__LoginHandle, inGetWindow, outGetWindow, 5000); 						if (zRet)
		{
    		   ToolKits.writeLog("GetSplitWindow Succeed!" + "inGetWindow:" + inGetWindow + "outGetWindow:" + outGetWindow);
		} else {
			ToolKits.writeErrorLog("GetSplitWindow Failed!" );
		}*/
 	}

    /**
     *  矩阵相关接口测试
     *  	1. 电视墙配置		CFG_CMD_MONITORWALL, AV_CFG_MonitorWall
     */
    public void MonitorWall() {
    	long hHandle = __LoginHandle;
    	int nWaitTime = 5000;
    	boolean bRet = false;
    	long hAttach = 0;

//    	/// 1. 电视墙配置
//    	AV_CFG_MonitorWall monitorWall = new AV_CFG_MonitorWall();
//    	String strCmd = FinalVar.CFG_CMD_MONITORWALL;
//    	bRet = ToolKits.GetDevConfig(strCmd, monitorWall, hHandle, -1, 1024*1024*2);
//    	if (!bRet) {
//    		ToolKits.writeErrorLog("Failed to Get CFG_CMD_MONITORWALL");
//    		return;
//    	}
//    	else {
//    		ToolKits.writeLog("Successed to Get CFG_CMD_MONITORWALL");
//		}

//    	AV_CFG_MonitorWall[] mw = new AV_CFG_MonitorWall[18];
//    	for (int i = 0; i < mw.length; i++) {
//			mw[i] = new AV_CFG_MonitorWall();
//		}
//
//    	boolean result = false;
//    	int nBufferLen = 2*1024*1024;
//    	Integer error = new Integer(0);
//        char szBuffer[] = new char[nBufferLen];
//        int nChn = -1;
//        Integer count = new Integer(0);
//        String strCmd = FinalVar.CFG_CMD_MONITORWALL;
//        if(INetSDK.GetNewDevConfig( hHandle, strCmd , nChn, szBuffer,nBufferLen, error, 10000) )
//        {
//         	if( INetSDK.ParseData(strCmd ,szBuffer , mw , count ) )
//         	{
//         		result = true;
//         		ToolKits.writeLog("Has Configure " + count);
//
//         		result = INetSDK.PacketData(strCmd, mw, szBuffer, nBufferLen);
//         		if (result) {
//         			Integer errorInteger = new Integer(0);
//         			Integer restartInteger = new Integer(0);
//         			INetSDK.SetNewDevConfig(hHandle, strCmd, -1, szBuffer, nBufferLen, errorInteger, restartInteger, 10000);
//         		}
//         	}
//         }

    	/// 1.1 Remote Device
//   	AV_CFG_RemoteDevice remoteDevice = new AV_CFG_RemoteDevice(128);
//    	String strCmd = FinalVar.CFG_CMD_REMOTEDEVICE;
//    	bRet = ToolKits.GetDevConfig(strCmd, remoteDevice, hHandle, -1, 1024*1024*2);
//    	if (!bRet) {
//    		ToolKits.writeErrorLog("Failed to Get CFG_CMD_REMOTEDEVICE, ");
//    		return;
//    	}
//    	else {
//    		ToolKits.writeLog("Successed to Get CFG_CMD_REMOTEDEVICE, ");
//		}
//
//    	AV_CFG_RemoteDevice[] mw = new AV_CFG_RemoteDevice[18];
//    	for (int i = 0; i < mw.length; i++) {
//			mw[i] = new AV_CFG_RemoteDevice(128);
//		}
//
//    	boolean result = false;
//    	int nBufferLen = 2*1024*1024;
//    	Integer error = new Integer(0);
//        char szBuffer[] = new char[nBufferLen];
//        int nChn = -1;
//        Integer count = new Integer(0);
//        String strCmdEx = FinalVar.CFG_CMD_REMOTEDEVICE;
//        if(INetSDK.GetNewDevConfig( hHandle, strCmdEx , nChn, szBuffer, nBufferLen, error, 10000) )
//        {
//         	if( INetSDK.ParseData(strCmd ,szBuffer , mw , count ) )
//         	{
//         		result = true;
//         		ToolKits.writeLog("Has Configure " + count);
//         		result = INetSDK.PacketData(strCmd, mw, szBuffer, nBufferLen);
//         		if (result) {
//         			Integer errorInteger = new Integer(0);
//         			Integer restartInteger = new Integer(0);
//         			INetSDK.SetNewDevConfig(hHandle, strCmd, -1, szBuffer, nBufferLen, errorInteger, restartInteger, 10000);
//         		}
//         	}
//         }

    	/// 2. 获取窗口位置，针对自由开窗窗口
//    	SDK_IN_SPLIT_GET_RECT pInParam = new SDK_IN_SPLIT_GET_RECT();
//    	SDK_OUT_SPLIT_GET_RECT pOutParam = new SDK_OUT_SPLIT_GET_RECT();
//    	bRet = INetSDK.GetSplitWindowRect(hHandle, pInParam, pOutParam, nWaitTime);
//    	if (!bRet) {
//    		ToolKits.writeErrorLog("Failed to GetSplitWindowRect");
//    	}

    	/// 3. 设置获取显示源 , 参考  TestMatrix
    	/// 4. 获取电视墙预案
//    	SDK_IN_WM_GET_COLLECTIONS inGetCollections = new SDK_IN_WM_GET_COLLECTIONS();
//    	SDK_OUT_WM_GET_COLLECTIONS outGetCollections = new SDK_OUT_WM_GET_COLLECTIONS(10);
//    	bRet = INetSDK.GetMonitorWallCollections(hHandle, inGetCollections, outGetCollections, nWaitTime);
//    	if (!bRet) {
//    		ToolKits.writeErrorLog("Failed to GetMonitorWallCollections");
//    	}

    	/// 5. 加载预案
//    	SDK_IN_WM_LOAD_COLLECTION inLoaCollection = new SDK_IN_WM_LOAD_COLLECTION();
//    	inLoaCollection.pszName = new String("TestCollection");
//    	SDK_OUT_WM_LOAD_COLLECTION outLoaCollection = new SDK_OUT_WM_LOAD_COLLECTION();
//    	bRet = INetSDK.LoadMonitorWallCollection(hHandle, inLoaCollection, outLoaCollection, nWaitTime);
//    	if (!bRet) {
//    		ToolKits.writeErrorLog("Failed to LoadMonitorWallCollection");
//    	}

    	/// 6. 保存预案.
//    	SDK_IN_WM_SAVE_COLLECTION inSaveCollection = new SDK_IN_WM_SAVE_COLLECTION();
//    	inSaveCollection.pszName = new String("TestSaveCollection");
//    	SDK_OUT_WM_SAVE_COLLECTION outSaveCollection = new SDK_OUT_WM_SAVE_COLLECTION();
//    	bRet = INetSDK.SaveMonitorWallCollection(hHandle, inSaveCollection, outSaveCollection, nWaitTime);
//    	if (!bRet) {
//    		ToolKits.writeErrorLog("Failed to SaveMonitorWallCollection");
//    	}

    	/// 7. 预案重命名
//    	SDK_IN_WM_RENAME_COLLECTION inRenameCollection = new SDK_IN_WM_RENAME_COLLECTION();
//    	inRenameCollection.pszOldName = new String("OldName");
//    	inRenameCollection.pszNewName = new String("NewName");
//    	SDK_OUT_WM_RENAME_COLLECTION outRenameCollection =  new SDK_OUT_WM_RENAME_COLLECTION();
//    	bRet = INetSDK.RenameMonitorWallCollection(hHandle, inRenameCollection, outRenameCollection, nWaitTime);
//    	if (!bRet) {
//    		ToolKits.writeErrorLog("Failed to SaveMonitorWallCollection");
//    	}

    	/// 8. 获取电视墙场景
//    	SDK_IN_MONITORWALL_GET_SCENE inGetScene = new SDK_IN_MONITORWALL_GET_SCENE();
//    	inGetScene.nMonitorWallID = 0;
//    	SDK_OUT_MONITORWALL_GET_SCENE outGetScene = new SDK_OUT_MONITORWALL_GET_SCENE();
//    	outGetScene.stuScene = new SDK_MONITORWALL_SCENE(20, 20, 5, 5);
//    	bRet = INetSDK.MonitorWallGetScene(hHandle, inGetScene, outGetScene, nWaitTime);
//    	if (!bRet)
//    	{
//    		ToolKits.writeErrorLog("Failed to MonitorWallGetScene");
//    	}
//
//    	ToolKits.writeLog("szName" + new String(outGetScene.szName).trim());

    	/// 9. 设置电视墙场景
//    	SDK_IN_MONITORWALL_SET_SCENE inSetScene = new SDK_IN_MONITORWALL_SET_SCENE();
//    	inSetScene.stuScene = outGetScene.stuScene;
//    	SDK_OUT_MONITORWALL_SET_SCENE outSetScene = new SDK_OUT_MONITORWALL_SET_SCENE();
//    	bRet = INetSDK.MonitorWallSetScene(hHandle, inSetScene, outSetScene, nWaitTime);
//    	if (!bRet)
//    	{
//    		ToolKits.writeErrorLog("Failed to MonitorWallSetScene");
//    	}

    	/// 10. 设置窗口轮巡显示源
//    	NET_IN_GET_TOUR_SOURCE inTourSource = new NET_IN_GET_TOUR_SOURCE();
//    	NET_OUT_GET_TOUR_SOURCE outTourSource = new NET_OUT_GET_TOUR_SOURCE(20, 5);
//    	bRet = INetSDK.GetTourSource(hHandle, inTourSource, outTourSource, nWaitTime);
//    	if (!bRet)
//    	{
//    		ToolKits.writeErrorLog("Failed to GetTourSource");
//    	}

//    	NET_IN_SET_TOUR_SOURCE inSetTourSource = new NET_IN_SET_TOUR_SOURCE(5);
//    	NET_OUT_SET_TOUR_SOURCE outSetTourSource = new NET_OUT_SET_TOUR_SOURCE();
//
//    	bRet = INetSDK.SetTourSource(hHandle, inSetTourSource, outSetTourSource, nWaitTime);
//    	if (!bRet)
//    	{
//    		ToolKits.writeErrorLog("Failed to SetTourSource");
//    	}

    	/// 11. 音频输出模式
//    	SDK_IN_GET_AUDIO_OUTPUT inGetAudio  = new SDK_IN_GET_AUDIO_OUTPUT();
//    	SDK_OUT_GET_AUDIO_OUTPUT outGetAudio = new SDK_OUT_GET_AUDIO_OUTPUT(5);
//    	bRet = INetSDK.GetSplitAudioOuput(hHandle, inGetAudio, outGetAudio, nWaitTime);
//    	if (!bRet)
//    	{
//    		ToolKits.writeErrorLog("Failed to GetSplitAudioOuput");
//    	}

//    	SDK_IN_SET_AUDIO_OUTPUT inSetAudio =  new SDK_IN_SET_AUDIO_OUTPUT();
//    	SDK_OUT_SET_AUDIO_OUTPUT outSetAudio = new SDK_OUT_SET_AUDIO_OUTPUT();
//    	bRet = INetSDK.SetSplitAudioOuput(hHandle, inSetAudio, outSetAudio, nWaitTime);
//    	if (!bRet)
//    	{
//    		ToolKits.writeErrorLog("Failed to SetSplitAudioOuput");
//    	}

    	/// 12. 订阅轮巡状态
//    	NET_IN_ATTACH_SPLIT_TOUR inSplitTour = new NET_IN_ATTACH_SPLIT_TOUR();
//    	inSplitTour.cbStatus = new CB_fTourStatusCallBack() {
//			public void invoke(long lLoginID, long lAttachHandle,
//					NET_SPLIT_TOUR_STATUS_INFO pstStatus) {
//				ToolKits.writeLog("invoke of split tour: " + pstStatus.stuSource.nAudioChannel);
//			}
//    	};
//    	inSplitTour.nChannel = 0;
//    	NET_OUT_ATTACH_SPLIT_TOUR outSplitTour = new NET_OUT_ATTACH_SPLIT_TOUR();
//    	hAttach = INetSDK.AttachSplitTour(hHandle, inSplitTour, outSplitTour, nWaitTime);
//    	if (0 == hAttach){
//    		ToolKits.writeErrorLog("Failed to attach split tour");
//    	}
    	// 取消订阅
    	//INetSDK.DetachSplitTour(hHandle);

    	/// 13. 订阅预案轮巡状态
    	NET_IN_WM_ATTACH_TOUR inWall = new NET_IN_WM_ATTACH_TOUR();
    	inWall.nMonitorWallID = 0;
    	inWall.cbStatus = new CB_fMonitorWallTourStatusCallBack() {

			public void invoke(long lLoginID, long lAttachHandle, NET_WM_TOUR_STATUS_INFO pstStatus) {
				ToolKits.writeLog("Succeed to attach monitorWall tour: " + pstStatus.emStatus);
			}
    	};
    	NET_OUT_WM_ATTACH_TOUR outWall = new NET_OUT_WM_ATTACH_TOUR();
    	long hAttachMonitorWall = INetSDK.MonitorWallAttachTour(hHandle, inWall, outWall, nWaitTime);
    	if(hAttachMonitorWall != 0) {
    		ToolKits.writeLog("MonitorWallAttachTour Succeed!");
    	} else {
    		ToolKits.writeErrorLog("MonitorWallAttachTour Failed" );
    	}

    	// 取消订阅
//    	INetSDK.MonitorWallDetachTour(hAttachMonitorWall);

    	/// 14. 电视墙开关
//    	SDK_IN_WM_POWER_CTRL inCtrlPower = new SDK_IN_WM_POWER_CTRL();
//    	inCtrlPower.bPowerOn = true;
//    	inCtrlPower.nMonitorWallID = 1;
//    	inCtrlPower.nTVID = -1;
//    	inCtrlPower.pszBlockID = null;
//    	SDK_OUT_WM_POWER_CTRL outCtrlPower = new SDK_OUT_WM_POWER_CTRL();
//    	bRet = INetSDK.PowerControl(hHandle, inCtrlPower, outCtrlPower, nWaitTime);
    }

	// 电视墙相关接口
    void OperateMonitorWall()
    {
    	long lLoginID = __LoginHandle;
    	int nWaitTime = 5000;
    	boolean bRet = false;
    	int emType = -1;
    	Object pInParam;
    	Object pOutParam;

    	/// 0. 添加电视墙, 对应 NET_IN_MONITORWALL_ADD 和 NET_OUT_MONITORWALL_ADD
//    	emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_ADD;
//    	pInParam = new NET_IN_MONITORWALL_ADD(5, 5);
//    	pOutParam = new NET_OUT_MONITORWALL_ADD();
//    	bRet = INetSDK.OperateMonitorWall(lLoginID, emType, pInParam, pOutParam, nWaitTime);

    	/// 1. 预案轮巡控制, 对应 NET_IN_CTRL_COLLECTIONTOUR 和  NET_OUT_CTRL_COLLECTIONTOUR
//    	emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_CTRL_TOUR;
//    	pInParam = new NET_IN_CTRL_COLLECTIONTOUR();
//    	pOutParam = new NET_OUT_CTRL_COLLECTIONTOUR();
//    	bRet = INetSDK.OperateMonitorWall(lLoginID, emType, pInParam, pOutParam, nWaitTime);

    	/// 2. 获取矩阵当前状态, 对应 NET_IN_MONITORWALL_GET_STATUS 和  NET_OUT_MONITORWALL_GET_STATUS
//    	emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_GET_STATUS;
//    	pInParam = new NET_IN_MONITORWALL_GET_STATUS();
//    	pOutParam = new NET_OUT_MONITORWALL_GET_STATUS();
//    	bRet = INetSDK.OperateMonitorWall(lLoginID, emType, pInParam, pOutParam, nWaitTime);

    	/// 3. 设置预案时间表, 对应 NET_IN_MONITORWALL_SET_COLL_SCHD 和 NET_OUT_MONITORWALL_SET_COLL_SCHD
    	emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_SET_COLL_SCHD;
    	pInParam = new NET_IN_MONITORWALL_SET_COLL_SCHD();
    	pOutParam = new NET_OUT_MONITORWALL_SET_COLL_SCHD();
    	bRet = INetSDK.OperateMonitorWall(lLoginID, emType, pInParam, pOutParam, nWaitTime);

    	/// 4. 获取预案时间表, 对应 NET_IN_MONITORWALL_GET_COLL_SCHD 和 NET_OUT_MONITORWALL_GET_COLL_SCHD
    	emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_GET_COLL_SCHD;
    	pInParam = new NET_IN_MONITORWALL_GET_COLL_SCHD();
    	pOutParam = new NET_OUT_MONITORWALL_GET_COLL_SCHD();
    	/// 5. 删除电视墙, 对应 NET_IN_MONITORWALL_REMOVE 和 NET_OUT_MONITORWALL_REMOVE
    	emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_REMOVE;
    	pInParam = new NET_IN_MONITORWALL_REMOVE();
    	pOutParam = new NET_OUT_MONITORWALL_REMOVE();
    	bRet = INetSDK.OperateMonitorWall(lLoginID, emType, pInParam, pOutParam, nWaitTime);

    	/// 6. 设置使能, 对应 NET_IN_MONITORWALL_SET_ENABLE 和 NET_OUT_MONITORWALL_SET_ENABLE
    	emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_SET_ENABLE;
    	pInParam = new NET_IN_MONITORWALL_SET_ENABLE();
    	pOutParam = new NET_OUT_MONITORWALL_SET_ENABLE();
    	bRet = INetSDK.OperateMonitorWall(lLoginID, emType, pInParam, pOutParam, nWaitTime);

    	/// 7. 获取使能, 对应 NET_IN_MONITORWALL_GET_ENABLE 和 NET_OUT_MONITORWALL_GET_ENABLE
    	emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_GET_ENABLE;
    	pInParam = new NET_IN_MONITORWALL_GET_ENABLE();
    	pOutParam = new NET_OUT_MONITORWALL_GET_ENABLE();
    	bRet = INetSDK.OperateMonitorWall(lLoginID, emType, pInParam, pOutParam, nWaitTime);

    	/// 8. 电视墙是否存在, 对应 NET_IN_MONITORWALL_NAME_EXIST 和 NET_OUT_MONITORWALL_NAME_EXIST
    	emType = NET_MONITORWALL_OPERATE_TYPE.NET_MONITORWALL_OPERATE_NAME_EXIST;
    	pInParam = new NET_IN_MONITORWALL_NAME_EXIST();
    	pOutParam = new NET_OUT_MONITORWALL_NAME_EXIST();
    	bRet = INetSDK.OperateMonitorWall(lLoginID, emType, pInParam, pOutParam, nWaitTime);
    }

    public void TestManualSnap(){

        NET_IN_MANUAL_SNAP stuIn = new NET_IN_MANUAL_SNAP();

        stuIn.nChannel = 0;

        String FTP = "/storage/emulated/0/ok.jpg";//图片存储路径

        System.arraycopy(FTP.getBytes(), 0, stuIn.szFilePath, 0, FTP.getBytes().length);

        NET_OUT_MANUAL_SNAP stuOut = new NET_OUT_MANUAL_SNAP();

        boolean lManualInfoHandle = INetSDK.ManualSnap(__LoginHandle, stuIn, stuOut, 30000);

        if(lManualInfoHandle != false)

        {

            ToolKits.writeLog("szFilePath = " + stuIn.szFilePath);
			ToolKits.writeLog("pRcvBuf = " + stuOut.pRcvBuf);
            ToolKits.writeLog("nRcvBufLen = " + stuOut.nRetBufLen);
			ToolKits.writeLog("emEncodeType = " + stuOut.emEncodeType);
            ToolKits.writeLog("TestManualSnap success,handle:" + lManualInfoHandle);

        }

        else

        {

            ToolKits.writeLog("TestManualSnap failed,LastError:" + INetSDK.GetLastError());

        }

    }

    // 热成像相关接口
    void ThermoGraphy() {
    	long lLoginID = __LoginHandle;
    	int nWaitTime = 5000;
    	boolean bRet = false;
    	int nQueryType = -1;

    	/// 1. 查询测温度的参数值
    	nQueryType = FinalVar.NET_QUERY_DEV_RADIOMETRY_POINT_TEMPER;
    	NET_IN_RADIOMETRY_GETPOINTTEMPER inGetpointtemper = new NET_IN_RADIOMETRY_GETPOINTTEMPER();
    	NET_OUT_RADIOMETRY_GETPOINTTEMPER outGetpointtemper = new NET_OUT_RADIOMETRY_GETPOINTTEMPER();
    	bRet = INetSDK.QueryDevInfo(lLoginID, nQueryType, inGetpointtemper, outGetpointtemper, null, nWaitTime);
    	if (!bRet) {
    		ToolKits.writeErrorLog("Query Point Temper Failed!");
    	}
    	else {
    		ToolKits.writeLog("TemperAver: " +outGetpointtemper.stPointTempInfo.fTemperAver);
    	}

    	/// 2. 查询测温项的参数值
    	nQueryType = FinalVar.NET_QUERY_DEV_RADIOMETRY_TEMPER;
    	NET_IN_RADIOMETRY_GETTEMPER inGettemper = new NET_IN_RADIOMETRY_GETTEMPER();
    	NET_OUT_RADIOMETRY_GETTEMPER outGettemper = new NET_OUT_RADIOMETRY_GETTEMPER();

    	bRet = INetSDK.QueryDevInfo(lLoginID, nQueryType, inGettemper, outGettemper, null, nWaitTime);
    	if (!bRet) {
    		ToolKits.writeErrorLog("Query Temper Failed!");
    	}
    	else {
    		ToolKits.writeLog("TemperAver: " +outGettemper.stTempInfo.fTemperAver);
    	}
    }

	// 注册升级文件处理回调函数原形
	public class Test_CB_fAttachAIOFileprocCB implements CB_fAttachAIOFileprocCB {
       private String filePath = new String("/mnt/sdcard/NetSDK/");
       private String fileDav;
       private String strFileName;

       @Override
       public void invoke(long lAttachHandle, NET_CB_AIOFILEPROC pBuf,
              byte[] pbFileBuf, int nFileLen) {
           // TODO Auto-generated method stub
           ToolKits.writeLog("emStatus " + pBuf.emStatus);
           ToolKits.writeLog("emType " + pBuf.emType);
           ToolKits.writeLog("dwLength" + pBuf.dwLength);
           ToolKits.writeLog("nFileLen" + nFileLen);

           // 开始上传时，建文件夹
	       if(pBuf.emStatus == 1) {
	        	try {
	        	   // 判断输出的文件类型
	 	           if(pBuf.emType == 1) {
	 	              fileDav = new String("callback.zip");
	 	           } else if(pBuf.emType == 2){
	 	              fileDav = new String("callback.apk");
	 	           }

	 	           // 创建文件
					/*
	 	    	   if (createFile(filePath, fileDav)) {
			           strFileName = filePath + fileDav;
		    	   }
	 	    	   */
	 	    	   // 创建一个具有指定strFileName文件中写入数据的输出文件流
				   m_Fout = new FileOutputStream(strFileName);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
	       }

           if (null != m_Fout) {
                try {
            	   // 输出缓存
                   m_Fout.write(pbFileBuf);
                } catch (Exception e) {
                   e.printStackTrace();
                }

                // 传输结束
	            if (pBuf.emStatus == 3) {
	        	   ToolKits.writeLog("upoload end!");
	        	   try {
	        		 // 关闭输出文件流
					 m_Fout.close();
					 m_Fout = null;
	        	   } catch (IOException e) {
					 e.printStackTrace();
	        	   }
		        }
           }
       }
	}

	private Test_CB_fAttachAIOFileprocCB aioFilecb = new Test_CB_fAttachAIOFileprocCB();
	private static FileOutputStream m_Fout;
	private long lAttachHandle = 0;
	public void AttachAIOFileProc() {

		long lLoginID = __LoginHandle;
		int nWaitTime = 5000;

    	// 注销升级文件
		if(lAttachHandle != 0) {
			if(INetSDK.detachAIOFileproc(lAttachHandle)) {
				ToolKits.writeLog("detachAIOFileproc succeed!" + "lAttachHandle = " + lAttachHandle);
			}
		}

		// 注册升级文件
		NET_IN_ATTACH_AIO inAio = new NET_IN_ATTACH_AIO();
		inAio.cbNotify = aioFilecb;
		NET_OUT_ATTACH_AIO outAio = new NET_OUT_ATTACH_AIO();
		lAttachHandle = INetSDK.attachAIOFileProc(lLoginID, inAio, outAio, nWaitTime);
    	if(lAttachHandle != 0)	{
    		ToolKits.writeLog("Succeed!" + "lAttachHandle:" + lAttachHandle);
    	}
	}

	// 设置NVR广告
	public void SetAIOAdvert() {
		NET_IN_SET_ADVERT inAdvert = new NET_IN_SET_ADVERT();
		inAdvert.emAction = NET_EM_ADVERT_ACTION.NET_EM_ADVERT_ACTION_START; //start
		//inAdvert.emAction = NET_EM_ADVERT_ACTION.NET_EM_ADVERT_ACTION_STOP; // stop
		inAdvert.nSpeed = 10;
		inAdvert.emPosition = NET_EM_ADVERT_POSITION.NET_EM_ADVERT_POSITION_MIDDLE;
		NET_OUT_SET_ADVERT outAdvert = new NET_OUT_SET_ADVERT();
		long lRet = INetSDK.SetAIOAdvert(__LoginHandle, inAdvert, outAdvert, 3000);
		if(lRet != 0) {
			ToolKits.writeLog("SetAdvert Succeed!");
		} else {
			ToolKits.writeErrorLog("SetAdvert Failed" );
		}
	}

	// NVR截屏
	public void AIOScreen() {
		NET_IN_AIO_SCREEN inScreen  = new NET_IN_AIO_SCREEN();
		NET_OUT_AIO_SCREEN outScreen = new NET_OUT_AIO_SCREEN();
		long lZet = INetSDK.AIOScreen(__LoginHandle, inScreen, outScreen, 3000);
		if(lZet != 0){
			ToolKits.writeLog("AIOScreen Succeed!" + "outScreen.szName = " + outScreen.szName);
		} else {
			ToolKits.writeErrorLog("AIOScreen Failed!" );
		}
	}

	// AIOAppConfig参数设置
	public void AIOAppConfig() {
		CFG_AIO_APP_CONFIG_INFO aioAppConfigInfo = new CFG_AIO_APP_CONFIG_INFO();
		String strCmd = FinalVar.CFG_CMD_AIO_APP_CONFIG;
		boolean bRet = ToolKits.GetDevConfig(strCmd, aioAppConfigInfo, __LoginHandle, -1, 1024*1024*2);
		if (!bRet) {
			ToolKits.writeErrorLog("Failed to AioAppConfigInfo!" );
		}
		else {
			ToolKits.writeLog("Successed to AioAppConfigInfo! \n" + new String(aioAppConfigInfo.szAddress).trim() + "\n");
		}


		boolean bRet1 = ToolKits.SetDevConfig(strCmd, aioAppConfigInfo, __LoginHandle, -1, 1024*1024*2);
		if(bRet1) {
			ToolKits.writeLog("Successed to AioAppConfigInfo! \n" + new String(aioAppConfigInfo.szAddress).trim());
		} else {
			ToolKits.writeErrorLog("Failed to AioAppConfigInfo!" );
		}
	}

	// 同步文件上传
	void UploadRemoteFile() {
    	boolean bRet = false;

		// 文件上传
    	SDK_IN_UPLOAD_REMOTE_FILE inUploadFile = new SDK_IN_UPLOAD_REMOTE_FILE();
    	inUploadFile.pszFileDst = new String("TestNetSDK.apk");
    	inUploadFile.pszFolderDst = new String("/mnt/lv/ReservedNAS/");
    	inUploadFile.pszFileSrc = new String("/mnt/sdcard/TestNetSDK.apk");
    	inUploadFile.nPacketLen = 512;
    	SDK_OUT_UPLOAD_REMOTE_FILE outUploadFile = new SDK_OUT_UPLOAD_REMOTE_FILE();

    	bRet = INetSDK.UploadRemoteFile(__LoginHandle, inUploadFile, outUploadFile, 4000);
    	if (bRet) {
    		ToolKits.writeLog("upload Remote ok");
    	}else {
    		ToolKits.writeErrorLog("upload Remote Error");
    		return;
    	}
    }

	// 文件下载, 只适用于小文件
	public void DownloadRemoteFile() {
		SDK_IN_DOWNLOAD_REMOTE_FILE inDFile = new SDK_IN_DOWNLOAD_REMOTE_FILE();

		inDFile.pszFileDst = new String(getExternalFilesDir(null).getAbsolutePath()+"/"+ "02.jpg");	//Local path

		inDFile.pszFileName = new String("/mnt/sd/2022-03-09/001/jpg/14/55/53[M][0@0][0].jpg");			//Device's document path
		SDK_OUT_DOWNLOAD_REMOTE_FILE outDFile = new SDK_OUT_DOWNLOAD_REMOTE_FILE();

		boolean bRet = INetSDK.DownloadRemoteFile(__LoginHandle, inDFile, outDFile, 4000);
		if (bRet) {
			ToolKits.writeLog("download path = " + inDFile.pszFileDst);
			ToolKits.writeLog("download remote ok");
		}else {
			ToolKits.writeErrorLog("download Remote Error");
		}
	}

	// 人脸对比
	void MatchTwoFaceImage() {
		String oriSDKPath = Environment.getExternalStorageDirectory().toString();  // 获取原始图片在SD卡里的路径
		String compSDKPath = Environment.getExternalStorageDirectory().toString(); // 获取对比图片在SD卡里的路径

		String oriImage = oriSDKPath + "/" + "1.jpg";
		String compImage = compSDKPath + "/" +  "2.jpg";

		Bitmap oribm = BitmapFactory.decodeFile(oriImage);   // 读取原始图片
		Bitmap compbm = BitmapFactory.decodeFile(compImage); // 读取对比图片

		NET_MATCH_TWO_FACE_IN matchTwoFaceIn = new NET_MATCH_TWO_FACE_IN();

		// 原始图片的宽高
		matchTwoFaceIn.stuOriginalImage.dwWidth  = oribm.getWidth();
		matchTwoFaceIn.stuOriginalImage.dwHeight = oribm.getHeight();

		// 对比图片的宽高
		matchTwoFaceIn.stuCompareImage.dwWidth = compbm.getWidth();
		matchTwoFaceIn.stuCompareImage.dwHeight = compbm.getHeight();

		matchTwoFaceIn.OriginalImageName = oriImage;   // 原始图片在手机里的路径
		matchTwoFaceIn.compareImageName = compImage;   // 对比图片在手机里的路径

		NET_MATCH_TWO_FACE_OUT matchTwoFaceOut = new NET_MATCH_TWO_FACE_OUT();

		boolean bRet = INetSDK.MatchTwoFaceImage(__LoginHandle, matchTwoFaceIn, matchTwoFaceOut, 5000);

		if(bRet) {
			ToolKits.writeLog("Match Two Face Succeed!" + (matchTwoFaceOut.nSimilarity)/100 + "原图宽高：" + oribm.getWidth() + "-" + oribm.getHeight() + "/ 对比图宽高：" + compbm.getWidth() + "-" + compbm.getHeight());   // 输出相似度
		} else {
			ToolKits.writeErrorLog("Match Two Face Failed!" );
		}
	}

	// 打靶相机智能规则
	void ShootingRuleConfig() {
		boolean bRet = false;
		String szCommand = FinalVar.CFG_CMD_ANALYSERULE;
		CFG_ANALYSERULES_INFO analyserules = new CFG_ANALYSERULES_INFO(10);

		// 获取
		bRet = ToolKits.GetDevConfig(szCommand, analyserules, __LoginHandle, 0, 2*1024*1024);
		if(bRet) {
			ToolKits.writeLog("GetNewDevConfig Succeed!" + "\n" +
							  "事件规则个数：" + analyserules.nRuleCount );

			for(int i = 0; i < analyserules.nRuleCount; i++) {
				ToolKits.writeLog("智能事件类型: " + String.format("%x", analyserules.pRuleBuf[i].dwRuleType));
				ToolKits.writeLog("事规则编号：" + analyserules.pRuleBuf[i].stuRuleCommInfo.bRuleId);
				ToolKits.writeLog("规则所属的场景：" + analyserules.pRuleBuf[i].stuRuleCommInfo.emClassType);

				if(analyserules.pRuleBuf[i].dwRuleType == FinalVar.EVENT_IVS_SHOOTINGSCORERECOGNITION) {

					CFG_IVS_SHOOTINGSCORERECOGNITION_INFO ivsShooting = (CFG_IVS_SHOOTINGSCORERECOGNITION_INFO)analyserules.pIvsRuleBuf[i];

					ToolKits.writeLog("规则名称：" + new String(ivsShooting.szRuleName).trim() + "\n" +
								      "规则使能: " + ivsShooting.bRuleEnable + "\n" +
									  "相应物体类型个数 : " + ivsShooting.nObjectTypeNum +
									  "弹孔口径 ：" + ivsShooting.nCaliber);

					for(int j = 0; j < ivsShooting.nObjectTypeNum; j++) {
						ToolKits.writeLog("相应物体类型列表：" + new String(ivsShooting.szObjectTypes[j]).trim());
					}

					// 配置
					ivsShooting.bRuleEnable = true;
					if(ivsShooting.nCaliber == 0) {
						ivsShooting.nCaliber = 1;
					} else if(ivsShooting.nCaliber == 1){
						ivsShooting.nCaliber = 2;
					} else {
						ivsShooting.nCaliber = 0;
					}
				}
			}

			boolean bRet2 = ToolKits.SetDevConfig(szCommand, analyserules, __LoginHandle, 0, 2*1024*1024);
			if(bRet2) {
				ToolKits.writeLog("setNewDevConfig Succeed!");
			} else {
				ToolKits.writeErrorLog("setNewDevConfig Failed!" );
			}
		} else {
			ToolKits.writeErrorLog("GetNewDevConfig Failed!" );
		}
	}

	// 查询门禁状态
	public void QueryDoorState() {
		NET_DOOR_STATUS_INFO doorstatus = new NET_DOOR_STATUS_INFO();
		boolean bRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_DOOR_STATE, doorstatus, 3000);
		if(bRet) {
			ToolKits.writeLog("Query DoorStatus Succeed!" + "\n" + doorstatus.nChannel + "\n" + doorstatus.emStateType);
		} else {
			ToolKits.writeErrorLog("Query DoorStatus Failed!" );
		}
	}

	// 查询录像状态
	public void QueryRecordState() {
		int nType = FinalVar.SDK_DEVSTATE_RECORDING;
		byte[] devRecord = new byte[16];
		boolean bRet = INetSDK.QueryDevState(__LoginHandle, nType, devRecord, 5000);
		if(bRet) {
			ToolKits.writeLog("QueryDevice Succeed!");
			for(int i=0; i<16; i++) {
				ToolKits.writeLog(i + " : " + devRecord[i]);
			}
		} else {
			ToolKits.writeErrorLog("QueryDevice Failed!" );
		}
	}

	// 普通配置
	public void GeneralConfig() {
		String strCmd = FinalVar.CFG_CMD_DEV_GENERRAL;
		CFG_DEV_DISPOSITION_INFO devDisposition = new CFG_DEV_DISPOSITION_INFO();
		boolean bRet = ToolKits.GetDevConfig(strCmd, devDisposition, __LoginHandle, 0, 1024*1024*2);
		if (!bRet) {
			ToolKits.writeErrorLog("Failed to GetDevDisposition!" );
		}
		else {
			ToolKits.writeLog("Succeed to GetDevDisposition" + "\n" + devDisposition.nLocalNo + "\n" +
					new String(devDisposition.szMachineName).trim() + "\n" +
					new String(devDisposition.szMachineAddress).trim() + "\n" +
					devDisposition.nLockLoginTimes + "\n");

			// 设置
			bRet = false;
			bRet = ToolKits.SetDevConfig(strCmd, devDisposition, __LoginHandle, 0, 1024*1024*2);
			if(bRet) {
				ToolKits.writeLog("Succeed to SetDevDisposition");
			} else {
				ToolKits.writeErrorLog("Failed to SetDevDisposition" );
			}
		}
	}

	// 物体的检测模块配置
	public void AnalyseModuleConfig() {
		CFG_ANALYSEMODULES_INFO modules = new CFG_ANALYSEMODULES_INFO();
		String strCmdmodule = FinalVar.CFG_CMD_ANALYSEMODULE;
		boolean bRet = ToolKits.GetDevConfig(strCmdmodule, modules, __LoginHandle, 0, 1024*1024*2);
		if (!bRet) {
			ToolKits.writeErrorLog("Failed to GetModules!" );
		}
		else {
			ToolKits.writeLog("Succeed to GetModules" + "\n" +
					"检测模块数 : " + modules.nMoudlesNum + "\n");
			for(int i = 0 ; i < modules.nMoudlesNum; i++) {
				ToolKits.writeLog("检测区域顶点数 : " + modules.stuModuleInfo[i].nDetectRegionPoint + "\n" + "检测区域 : " + "\n");
				for(int j = 0; j < modules.stuModuleInfo[i].nDetectRegionPoint; j++) {
					ToolKits.writeLog(modules.stuModuleInfo[i].stuDetectRegion[j].nX + "\n" +
							modules.stuModuleInfo[i].stuDetectRegion[j].nY + "\n");
				}
			}
		}
	}

	// 智能跟踪规则配置
	public void LetrackRuleConfig() {
		String szCommandrule = FinalVar.CFG_CMD_ANALYSERULE;
		CFG_ANALYSERULES_INFO analyserule = new CFG_ANALYSERULES_INFO(100);

		// 获取
		boolean bRet1 = ToolKits.GetDevConfig(szCommandrule, analyserule, __LoginHandle, 0, 10*1024*1024);
		if(bRet1) {
			ToolKits.writeLog("GetNewDevConfig Succeed!" + "\n" +
					"事件规则个数：" + analyserule.nRuleCount );

			for(int i = 0; i < analyserule.nRuleCount; i++) {
				ToolKits.writeLog("事件类型: " + String.format("%x", analyserule.pRuleBuf[0].dwRuleType));
				ToolKits.writeLog("事规则编号：" + analyserule.pRuleBuf[i].stuRuleCommInfo.bRuleId);
				ToolKits.writeLog("规则所属的场景：" + analyserule.pRuleBuf[i].stuRuleCommInfo.emClassType);

				if(analyserule.pRuleBuf[i].dwRuleType == FinalVar.EVENT_IVS_LETRACK) {
					CFG_IVS_LETRACK_INFO ivsLretack = (CFG_IVS_LETRACK_INFO)analyserule.pIvsRuleBuf[i];
					ToolKits.writeLog("规则名称：" + new String(ivsLretack.szRuleName).trim() + "\n" +
							"规则使能: " + ivsLretack.bRuleEnable);

					// 配置
					if(ivsLretack.bRuleEnable == true) {
						ivsLretack.bRuleEnable = false;
					} else {
						ivsLretack.bRuleEnable = true;
					}
					for(int m=0; m<FinalVar.WEEK_DAY_NUM; m++){
						for(int n=0; n<FinalVar.MAX_REC_TSECT_EX; n++){
							ivsLretack.stuTimeSection[m][n].dwRecordMask = 22; // 录像掩码
							ivsLretack.stuTimeSection[m][n].nBeginHour = 1;
							ivsLretack.stuTimeSection[m][n].nBeginMin = 0;
							ivsLretack.stuTimeSection[m][n].nBeginSec = 0;
							ivsLretack.stuTimeSection[m][n].nEndHour = 11;
							ivsLretack.stuTimeSection[m][n].nEndMin = 1;
							ivsLretack.stuTimeSection[m][n].nEndSec = 1;
						}
					}
				}
			}

			boolean bRet2 = ToolKits.SetDevConfig(szCommandrule, analyserule, __LoginHandle, 0, 2*1024*1024);
			if(bRet2) {
				ToolKits.writeLog("setNewDevConfig Succeed!");
			} else {
				ToolKits.writeErrorLog("setNewDevConfig Failed!" );
			}
		} else {
			ToolKits.writeErrorLog("GetNewDevConfig Failed!" );
		}
	}

	// 物联网红外检测配置
	public void IOT_InfraredDetectConfig() {
		CFG_IOT_INFRARED_DETECT_INFO ioInfraredtDetect = new CFG_IOT_INFRARED_DETECT_INFO();
		String strCmddetect = FinalVar.CFG_CMD_IOT_INFRARED_DETECT;

		// 获取
		boolean bRet = ToolKits.GetDevConfig(strCmddetect, ioInfraredtDetect, __LoginHandle, -1, 1024*1024*2);
		if (!bRet) {
			ToolKits.writeErrorLog("Failed to GetInfraredtDetect!" );
		}
		else {
			ToolKits.writeLog("Successed to GetInfraredtDetect! \n" + ioInfraredtDetect.nDetectRadius + "\n");
			for(int i=0; i<FinalVar.MAX_AREA_COUNT; i++) {
				ToolKits.writeLog("获取的：" + ioInfraredtDetect.bEnable[i] + "\n" );
			}

			// 设置
			bRet = false;
			ioInfraredtDetect.bEnable[0] = true;
			ioInfraredtDetect.nDetectRadius = 15;
			bRet = ToolKits.SetDevConfig(strCmddetect, ioInfraredtDetect, __LoginHandle, -1, 1024*1024*2);
			if(bRet) {
				ToolKits.writeLog("Successed to SetInfraredtDetect! \n" + ioInfraredtDetect.nDetectRadius + "\n" + ioInfraredtDetect.bEnable[0]);
			} else {
				ToolKits.writeErrorLog("Failed to SetInfraredtDetect!" );
			}
		}
	}

	// 物联网录像联动配置
	public void IOT_RecordHandleConfig() {
		CFG_IOT_RECORD_HANDLE_INFO iotRecordHandle = new CFG_IOT_RECORD_HANDLE_INFO();
		String strCmdrecord = FinalVar.CFG_CMD_IOT_RECORD_HANDLE;

		// 获取
		boolean bRet = ToolKits.GetDevConfig(strCmdrecord, iotRecordHandle, __LoginHandle, -1, 1024*1024*2);
		if (!bRet) {
			ToolKits.writeErrorLog("Failed to GetRecordHandle!");
		}
		else {
			ToolKits.writeLog("Successed to GetRecordHandle! \n");
			ToolKits.writeLog("获取的：" + iotRecordHandle.bEnable + "\n" + iotRecordHandle.nRecordTime + "\n");

			// 设置
			bRet = false;
			iotRecordHandle.bEnable = true;
			iotRecordHandle.nRecordTime = 25;
			bRet = ToolKits.SetDevConfig(strCmdrecord, iotRecordHandle, __LoginHandle, -1, 1024*1024*2);
			if(bRet) {
				ToolKits.writeLog("Successed to SetRecordHandle! \n");
				ToolKits.writeLog("设置的：" + iotRecordHandle.bEnable + "\n" + iotRecordHandle.nRecordTime + "\n");
			} else {
				ToolKits.writeErrorLog("Failed to SetRecordHandle!");
			}
		}
	}

	// 物联网抓图联动配置
	public void IOT_SnapHandleConfig() {
		CFG_IOT_SNAP_HANDLE_INFO iotSnapHandle = new CFG_IOT_SNAP_HANDLE_INFO();
		String strCmdsnap = FinalVar.CFG_CMD_IOT_SNAP_HANDLE;

		// 获取
		boolean bRet = ToolKits.GetDevConfig(strCmdsnap, iotSnapHandle, __LoginHandle, -1, 1024*1024*2);
		if (!bRet) {
			ToolKits.writeErrorLog("Failed to GetSnapHandle!");
		}
		else {
			ToolKits.writeLog("Successed to GetSnapHandle! \n");
			ToolKits.writeLog("获取的：" + iotSnapHandle.bEnable + "\n" + iotSnapHandle.nSnapNum + "\n");

			// 设置
			bRet = false;
			iotSnapHandle.bEnable = true;
			iotSnapHandle.nSnapNum = 6;
			bRet = ToolKits.SetDevConfig(strCmdsnap, iotSnapHandle, __LoginHandle, -1, 1024*1024*2);
			if(bRet) {
				ToolKits.writeLog("Successed to SetSnapHandle! \n");
				ToolKits.writeLog("设置的：" + iotSnapHandle.bEnable + "\n" + iotSnapHandle.nSnapNum + "\n");
			} else {
				ToolKits.writeErrorLog("Failed to SetSnapHandle!");
			}
		}
	}

	// 获取门铃列表
	public void GetRingFileList() {
		NET_IN_GET_RINGFILELIST inGetRingfilelist = new NET_IN_GET_RINGFILELIST();
		NET_OUT_GET_RINGFILELIST outGetRingfilelist = new NET_OUT_GET_RINGFILELIST();

		boolean bRet = INetSDK.GetRingFileList(__LoginHandle, inGetRingfilelist, outGetRingfilelist, 3000);
		if(bRet) {
			ToolKits.writeLog("文件个数：" + outGetRingfilelist.nRingFileNum + "\n" );
			for(int i=0; i<outGetRingfilelist.nRingFileNum; i++) {
				ToolKits.writeLog(i + " : " + new String(outGetRingfilelist.szRingFileList[i]).trim());
			}
		} else {
			ToolKits.writeErrorLog("GetRingFileList Failed!");
		}
	}

	// Qsee 门铃音量和铃声配置
	public void DoorBellSoundConfig() {
		CFG_DOOR_BELLSOUND_INFO doorSound = new CFG_DOOR_BELLSOUND_INFO();
		String strCmdbell = FinalVar.CFD_CMD_DOORBELLSOUND;
		// 获取
		boolean bRet = ToolKits.GetDevConfig(strCmdbell, doorSound, __LoginHandle, -1, 1024*1024*2);
		if (!bRet) {
			ToolKits.writeErrorLog("Failed to GetDoorSound!");
			return;
		}
		else {
			ToolKits.writeLog("Successed to GetDoorSound! \n");
			ToolKits.writeLog(doorSound.bSilenceEnable + "\n" + doorSound.nRingVolume + "\n");
			ToolKits.writeLog(new String(doorSound.szRingFile).trim());

			// 设置
			bRet = false;
			doorSound.bSilenceEnable = true;
			doorSound.nRingVolume = 60;
			String Ring = "f_test";
			for (int i = 0; i < doorSound.szRingFile.length; i++) {
				doorSound.szRingFile[i] = 0;
			}
			System.arraycopy(Ring.getBytes(), 0, doorSound.szRingFile, 0, Ring.getBytes().length);
			bRet = ToolKits.SetDevConfig(strCmdbell, doorSound, __LoginHandle, -1, 1024*1024*2);
			if(bRet) {
				ToolKits.writeLog("Successed to SetDoorSound! \n");
				ToolKits.writeLog(doorSound.bSilenceEnable + "\n" + doorSound.nRingVolume + "\n");
				ToolKits.writeLog(new String(doorSound.szRingFile).trim());

			} else {
				ToolKits.writeErrorLog("Failed to SetDoorSound!");
			}
		}
	}

    /**
     * 网络自适应
     */
    void TestNetPolicy() {
    	long lLoginHandle = __LoginHandle;
    	long lPlayHandle = 0;
    	int nWaitTime = 3000;
    	boolean bRet = false;

    	/// 1. 码流缓冲策略
    	// lPlayHandle 为 拉流返回的句柄
    	// lPlayHandle = INetSDK.StartRealPlay(lLoginHandle, -1, SDK_RealPlayType.SDK_RType_Realplay, null, nWaitTime);
    	if (0 != lPlayHandle) {
        	NET_IN_BUFFER_POLICY policy = new NET_IN_BUFFER_POLICY();
        	policy.emRealPlayType = SDK_RealPlayType.SDK_RType_Realplay_Test; // 自适应测试码流
        	policy.nPolicy = 1; // 流畅

        	bRet = INetSDK.SetRealplayBufferPolicy(lPlayHandle, policy, nWaitTime);
        	if (!bRet) {
        		ToolKits.writeErrorLog("Failed to Set");
        	}
    	}

    	/// 2. Https 服务配置
    	CFG_HTTPS_INFO cmdObject = new CFG_HTTPS_INFO();
    	String strCmd = FinalVar.CFG_CMD_HTTPS;
    	bRet = ToolKits.GetDevConfig(strCmd, cmdObject, lLoginHandle, -1, 1024*10);
    	if (!bRet) {
    		ToolKits.writeErrorLog("Failed to GetHttps");
    	}else {
    		cmdObject.bEnable = true;
    		System.arraycopy("China".getBytes(), 0, cmdObject.szCountry, 0, "China".length());

    		ToolKits.SetDevConfig(strCmd, cmdObject, lLoginHandle, -1, 1024*10);
    	}

    	/// 3. 网络自适应编码配置(接口调用同上2)
    	///    -> strCmd = CFG_CMD_NETAUTOADAPTORENCODE
    	///    -> cmdObject = CFG_NET_AUTO_ADAPT_ENCODE
    	CFG_NET_AUTO_ADAPT_ENCODE cmdObjectEncode = new CFG_NET_AUTO_ADAPT_ENCODE();
    	String strCmdEncode = FinalVar.CFG_CMD_NETAUTOADAPTORENCODE;
    	bRet = ToolKits.GetDevConfig(strCmdEncode, cmdObjectEncode, lLoginHandle, -1, 1024*10);
    	if (!bRet) {
    		ToolKits.writeErrorLog("Failed to Get auto");
    	}else {
    		bRet = ToolKits.SetDevConfig(strCmdEncode, cmdObjectEncode, lLoginHandle, -1, 1024*10);
    		if (!bRet) {
    			ToolKits.writeErrorLog("Failed to auto");
    		}
    	}

    	/// 4. 获取编码自适应编码能力
    	///    -> szCommand = CFG_CAP_CMD_ADAPTENCODE
    	///    -> cmdObject =  CFG_CAP_ADAPT_ENCODE_INFO

		Integer stErr = new Integer(0);
		String szCommand = FinalVar.CFG_CAP_CMD_ADAPTENCODE;
		char[] szOutBuffer = new char[1024*10];
		CFG_CAP_ADAPT_ENCODE_INFO stuCaps = new CFG_CAP_ADAPT_ENCODE_INFO();
		bRet = INetSDK.QueryNewSystemInfo(lLoginHandle, szCommand, NetSDKApplication.getInstance().getDeviceInfo().nChanNum, szOutBuffer, stErr, nWaitTime);
		if (bRet) {
			bRet = INetSDK.ParseData(szCommand, szOutBuffer, stuCaps, null);
			if (!bRet) {
				ToolKits.writeErrorLog(" CFG_CAP_CMD_ADAPTENCODE error");
			}
		}
    }

    // 报警消除
    void ReleaseAlaram() {
    	long lLoginHandle = __LoginHandle;
    	int nWaitTime = 3000;

    	NET_CTRL_CLEAR_ALARM info = new NET_CTRL_CLEAR_ALARM();
        info.emAlarmType = NET_ALARM_TYPE.NET_ALARM_ALL; // 所有报警
        info.nChannelID = -1; // 所有通道

        boolean bRet = INetSDK.ControlDevice(lLoginHandle, CtrlType.SDK_CTRL_CLEAR_ALARM, info, nWaitTime);
        if (!bRet) {
        	ToolKits.writeErrorLog(" release error");
        }
    }

	// 查询智能插座信息
	public void QuerySmartSwitchInfo() {
		/// 获取电量信息
		NET_IN_SMART_SWITCH_INFO stInSwitch = new NET_IN_SMART_SWITCH_INFO();
		NET_OUT_SMART_SWITCH_INFO stOutSwitch = new NET_OUT_SMART_SWITCH_INFO();

		String sn = "my_test_sn";
		System.arraycopy(sn.getBytes(), 0, stInSwitch.szSerialNumber, 0, sn.length());

		boolean bRet = INetSDK.QueryDevInfo(__LoginHandle, FinalVar.NET_QUERY_SMART_SWITCH_INFO, stInSwitch, stOutSwitch, null, 3000);
		if (!bRet)
		{
			ToolKits.writeErrorLog("Smart Switch");
			return;
		}

		ToolKits.writeLog("State: " +stOutSwitch.bSwitchEable);
		ToolKits.writeLog("Current Power: " + stOutSwitch.dbCurrentPower);
		ToolKits.writeLog("History Power: " + stOutSwitch.dbHistoryPowerUsed);
		ToolKits.writeLog("Today Power: " + stOutSwitch.dbTodayPowerUsed);
		for (int i = 0; i < 31 && (stOutSwitch.dbMonthPowerUsed[i] != 0.0); ++i)
		{
			ToolKits.writeLog("Month ["+ i + 1+"] Power： " +stOutSwitch.dbMonthPowerUsed[i]);
		}
	}

	// 控制智能开关
    void ControlSmartSwitch() {
        NET_IN_CONTROL_SMART_SWITCH stInCtl = new NET_IN_CONTROL_SMART_SWITCH();
        stInCtl.bEnable = true;
        stInCtl.nDelayTime = 45;

        String ctrlSN = "Control SN";
        System.arraycopy(ctrlSN.getBytes(), 0, stInCtl.szSerialNumber, 0, ctrlSN.length());

        NET_OUT_CONTROL_SMART_SWITCH stOutCtl = new NET_OUT_CONTROL_SMART_SWITCH();
        boolean bRetCtrl = INetSDK.ControlDeviceEx(__LoginHandle, CtrlType.SDK_CTRL_CONTROL_SMART_SWITCH, stInCtl, stOutCtl, 5000);
        if (!bRetCtrl)
        {
            ToolKits.writeErrorLog("Ctrl Smart Switch");
        }
    }

	// 查询SD卡信息(IPC类产品)
	public void QueryDevStateSDCard() {
		SDK_HARDDISK_STATE mDiskState = new SDK_HARDDISK_STATE();
		if(INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_SD_CARD, mDiskState, 5000)) {
			ToolKits.writeLog("dwDiskNum : " + mDiskState.dwDiskNum);
			for(int i=0; i<mDiskState.dwDiskNum; i++) {
				ToolKits.writeLog("dwVolume : " + mDiskState.stDisks[i].dwVolume);
				ToolKits.writeLog("dwFreeSpace : " + mDiskState.stDisks[i].dwFreeSpace);
				ToolKits.writeLog("dwStatus : " + mDiskState.stDisks[i].dwStatus);
				ToolKits.writeLog("bDiskNum : " + mDiskState.stDisks[i].bDiskNum);
				ToolKits.writeLog("bSubareaNum : " + mDiskState.stDisks[i].bSubareaNum);
				ToolKits.writeLog("bSignal : " + mDiskState.stDisks[i].bSignal);
			}
		}

		// 硬盘管理
		DISKCTRL_PARAM param = new DISKCTRL_PARAM();
		param.nIndex = 0;
		param.ctrlType = 0;
		param.stuDisk = mDiskState.stDisks[0];
		if(INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_DISK, param, 4000)) {
			ToolKits.writeLog("Succeed!");
		} else {
			ToolKits.writeErrorLog("Failed!" );
		}
	}

	// 开机向导流程，接入公网、在线升级检测等功能
    void InitDevAccess(){
		boolean bRet = false;
    	//开机向导流程，接入公网、在线升级检测等功能
    	NET_IN_INIT_DEVICE_ACCESS inInitAccess = new NET_IN_INIT_DEVICE_ACCESS();
    	String mac = "3c:ef:8c:ed:d4:1a";
    	System.arraycopy(mac.getBytes(), 0, inInitAccess.szMac, 0, mac.getBytes().length);
    	String name = "admin";
    	System.arraycopy(name.getBytes(), 0, inInitAccess.szUserName, 0, name.getBytes().length);
    	String passwd = "admin";
    	System.arraycopy(passwd.getBytes(), 0, inInitAccess.szPwd, 0, passwd.getBytes().length);

    	inInitAccess.byNetAccess = 0;
    	inInitAccess.byUpgradeCheck = 0;

    	NET_OUT_INIT_DEVICE_ACCESS outInitAccess = new NET_OUT_INIT_DEVICE_ACCESS();

    	bRet = INetSDK.InitDevAccess(inInitAccess, outInitAccess, 10000, null);
    	if(bRet) {
    		ToolKits.writeLog("InitDevAccess Succeed!");
    	} else {
    		ToolKits.writeErrorLog("InitDevAccess Failed!" );
    	}
    }

	// 格式化备份设备
	public void FormatDevice() {
		// 获取存储设备名称
		boolean bRet = false;
		SDK_STORAGE_DEVICE_NAME[] pstuNames = new SDK_STORAGE_DEVICE_NAME[10];
		for(int i=0; i<pstuNames.length; i++) {
			pstuNames[i] = new SDK_STORAGE_DEVICE_NAME();
		}

		Integer pnRetCount = new Integer(0);
		bRet = INetSDK.GetStorageDeviceNames(__LoginHandle, pstuNames, pnRetCount, 3000);

		if(bRet) {
			ToolKits.writeLog("存储设备数量 : " + pnRetCount);
			for(int i=0; i<pnRetCount; i++) {
				ToolKits.writeLog("存储设备名称 = " + new String(pstuNames[i].szName).trim());

				// 格式化备份设备
				String devicesName = new String(pstuNames[i].szName).trim();
				char[] charNme = devicesName.toCharArray();//new char[devicesName.getBytes().length];
				if(INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_BACKUP_FORMAT, charNme, 5000)) {
					ToolKits.writeLog("格式化成功");
				} else {
					ToolKits.writeErrorLog("格式化失败");
				}
			}
		}
	}

	// 格式化分区
	public void FormatPatition() {
		// 获取存储设备名称
		boolean bRet = false;
		SDK_STORAGE_DEVICE_NAME[] pstuNames = new SDK_STORAGE_DEVICE_NAME[10];
		for(int i=0; i<pstuNames.length; i++) {
			pstuNames[i] = new SDK_STORAGE_DEVICE_NAME();
		}

		Integer pnRetCount = new Integer(0);
		bRet = INetSDK.GetStorageDeviceNames(__LoginHandle, pstuNames, pnRetCount, 3000);

		if(bRet) {
			ToolKits.writeLog("存储设备数量 : " + pnRetCount);
			for (int i = 0; i < pnRetCount; i++) {
				ToolKits.writeLog("存储设备名称 = " + new String(pstuNames[i].szName).trim());

				// 格式化备份设备
				String devicesName = new String(pstuNames[i].szName).trim();
				char[] charNme = devicesName.toCharArray();//new char[devicesName.getBytes().length];
				if (INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_BACKUP_FORMAT, charNme, 5000)) {
					ToolKits.writeLog("格式化成功");
				} else {
					ToolKits.writeErrorLog("格式化失败");
				}

				// 获取文件系统格式
				bRet = false;
				String pszDevName = new String(pstuNames[i].szName).trim();

				SDK_STORAGE_DEVICE pDevice = new SDK_STORAGE_DEVICE();
				bRet = INetSDK.GetStorageDeviceInfo(__LoginHandle, pszDevName, pDevice, 5000);
				if (bRet) {
					ToolKits.writeLog("分区数量：" + pDevice.nPartitionNum);
					for (int j = 0; j < pDevice.nPartitionNum; j++) {
						ToolKits.writeLog("文件系统格式：" + new String(pDevice.stuPartitions[j].szFileSystem).trim());

						// 格式化
						bRet = false;
						int type = CtrlType.SDK_CTRL_FORMAT_PATITION;
						SDK_FORMAT_PATITION formatPattion = new SDK_FORMAT_PATITION();
						formatPattion.pszStorageName = new String(pstuNames[i].szName).trim();// 存储设备名称
						formatPattion.pszPatitionName = new String(pstuNames[i].szName).trim(); // 分区名称
						formatPattion.pszFileSystem = new String(pDevice.stuPartitions[j].szFileSystem).trim();
						bRet = INetSDK.ControlDevice(__LoginHandle, type, formatPattion, 5000);
						if (bRet) {
							ToolKits.writeLog("Format Succeed!");
						} else {
							ToolKits.writeErrorLog("Format Failed!" );
						}
					}
				} else {
					ToolKits.writeErrorLog("GetStorageDeviceInfo Failed" );
				}
			}
		}
	}

    // 公安一所平台接入配置
    void VSPCaysConfig() {
    	// 获取
    	CFG_VSP_GAYS_INFO cmdObject = new CFG_VSP_GAYS_INFO();
    	if(ToolKits.GetDevConfig(FinalVar.CFG_CMD_VSP_GAYS, cmdObject, __LoginHandle,
    			-1, 1024*1024)) {
			ToolKits.writeLog("设备国际ID: " + new String(cmdObject.szDeviceId).trim());
			ToolKits.writeLog("设备密码: " + new String(cmdObject.szPassword).trim());
			ToolKits.writeLog("服务器ID: " + new String(cmdObject.szSipSvrId).trim());
			ToolKits.writeLog("服务器IP: " + new String(cmdObject.szSipSvrIp).trim());
			ToolKits.writeLog("服务器端口: " + cmdObject.nSipSvrPort);
			ToolKits.writeLog("域名: " + new String(cmdObject.szDomain).trim());

			// 设置
			System.out.println(cmdObject.bEnable);
			cmdObject.bEnable = !cmdObject.bEnable;
			ToolKits.SetDevConfig(FinalVar.CFG_CMD_VSP_GAYS, cmdObject, __LoginHandle,
					-1, 1024*1024);
		}
    }
	private static class RealDataCallBackHolder {
		private static final Test_CB_fDataCallBackEx realDataCB = new Test_CB_fDataCallBackEx();
	}

	public static final Test_CB_fDataCallBackEx getInstance() {
		return RealDataCallBackHolder.realDataCB;
	}

	private static class Test_CB_fDataCallBackEx implements CB_fRealDataCallBackEx{
		public Test_CB_fDataCallBackEx() {
		}

		@Override
		public void invoke(long lRealHandle,int dwDataType, byte buffer[], int dwBufferSize, int param) {
			Thread runThread=Thread.currentThread();
			ToolKits.writeLog("DHThread Name = " + runThread.getName());
			ToolKits.writeLog("DHThread Id = " + runThread.getId());
			// 如果需要转码，把这里的buffer和dwBufferSize传给转码库接口
			if (dwDataType == EM_REAL_DATA_TYPE.EM_REAL_DATA_TYPE_PS  + FinalVar.NET_DATA_CALL_BACK_VALUE){
				FileOutputStream fileStream;
				try {
					fileStream = new FileOutputStream("storage/emulated/0/SaveFile-mp4.dav", true);
					fileStream.write(buffer,0,dwBufferSize);
					fileStream.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				ToolKits.writeLog("Realplaybydatatype callback");
				return;
			}
			//ToolKits.writeLog("lRealHandle = " + lRealHandle + ", dwDataType = " + dwDataType + ", dwBufferSize = " + dwBufferSize);
			return;
		}
	}

	public void RealPlayByDataType(){
		NET_IN_REALPLAY_BY_DATA_TYPE in =  new  NET_IN_REALPLAY_BY_DATA_TYPE();
		in.szSavedFileName  =   "storage/emulated/0/SaveFile-mp4.dav";
		in.rType = SDK_RealPlayType.SDK_RType_Realplay_0;
		in.emDataType  = EM_REAL_DATA_TYPE.EM_REAL_DATA_TYPE_PS;
		in.nChannelID  =  0;
		in.cbRealData  =  new  Test_CB_fDataCallBackEx();
		NET_OUT_REALPLAY_BY_DATA_TYPE out =  new  NET_OUT_REALPLAY_BY_DATA_TYPE();
		long handle = INetSDK.RealPlayByDataType(__LoginHandle, in, out,  5000);
		if (handle != 0){
			ToolKits.writeLog("CALL INetSDK.RealPlayByDataType success");
		}else{
			ToolKits.writeLog("CALL INetSDK.RealPlayByDataType failed,error is:"+(INetSDK.GetLastError()));
		}

		if(INetSDK.PauseDownload(handle, true)){
			ToolKits.writeLog("Call PauseDownload success");
		}else{
			ToolKits.writeLog("Call PauseDownload failed");
		}
		//开始下载
		if(INetSDK.PauseDownload(handle, false)){
			ToolKits.writeLog("Call PauseDownload success");
		}else{
			ToolKits.writeLog("Call PauseDownload failed");
		}
	}


	public static class fDisplayCB implements IPlaySDKCallBack.fDisplayCBFun{
		public fDisplayCB() {
		}

		@Override
		public void invoke(int i, byte[] bytes, int i1, int i2, int i3, int i4, int i5, long l) {
		}
	}




	public class Test_CB_fDataCallBack1 implements CB_fDataCallBack {
		@Override
		public int invoke(long lRealHandle, int dwDataType, byte buffer[], int dwBufferSize) {
			if (dwDataType == EM_REAL_DATA_TYPE.EM_REAL_DATA_TYPE_PS + FinalVar.NET_DATA_CALL_BACK_VALUE )
			{
				FileOutputStream fileStream;
				try {
					fileStream = new FileOutputStream(getExternalFilesDir(null).getAbsolutePath() + "/callback-mp4.dav", true);
					fileStream.write(buffer,0,dwBufferSize);
					fileStream.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				ToolKits.writeLog("DownloadByDataType callback");
				return 1;
			}
			return 0;
		}
	}
	public void DownloadByDataType(){
		NET_TIME stTimeStart = new NET_TIME();
		stTimeStart.dwYear = 2022;
		stTimeStart.dwMonth = 3;
		stTimeStart.dwDay = 10;
		stTimeStart.dwHour = 12;
		stTimeStart.dwMinute = 00;
		NET_TIME stTimeEnd = new NET_TIME();
		stTimeEnd.dwYear = 2022;
		stTimeEnd.dwMonth = 3;
		stTimeEnd.dwDay = 10;
		stTimeEnd.dwHour = 12;
		stTimeEnd.dwMinute = 5;

		NET_IN_DOWNLOAD_BY_DATA_TYPE stuIn = new NET_IN_DOWNLOAD_BY_DATA_TYPE();
		stuIn.nChannelID = 0;
		stuIn.emDataType = EM_REAL_DATA_TYPE.EM_REAL_DATA_TYPE_PS;
		stuIn.emRecordType = EM_QUERY_RECORD_TYPE.EM_RECORD_TYPE_ALL;
		stuIn.stStartTime = stTimeStart;
		stuIn.stStopTime = stTimeEnd;
		stuIn.cbDownLoadPos =  new Test_CB_fTimeDownLoadPosCallBack();
		stuIn.fDownLoadDataCallBack = new Test_CB_fDataCallBack1();
		stuIn.szSavedFileName	= "/storage/emulated/0/SaveFile-mp4.dav";
		ToolKits.writeLog("szSavedFileName:"+stuIn.szSavedFileName.trim());
		NET_OUT_DOWNLOAD_BY_DATA_TYPE stuOut = new NET_OUT_DOWNLOAD_BY_DATA_TYPE();
//		long FileRet = ;

		long FileRet = INetSDK.DownloadByDataType(__LoginHandle, stuIn, stuOut, 5000);

		if(FileRet != 0)
		{
			ToolKits.writeLog("Call DownloadByDataType success");
		}
		else
		{
			ToolKits.writeLog("DownloadByDataType failed,error is:"+(INetSDK.GetLastError()));
		}

//		if(INetSDK.PauseDownload(FileRet, true)){
//			ToolKits.writeLog("Call PauseDownload success");
//		}else{
//			ToolKits.writeLog("Call PauseDownload failed");
//		}
//		//开始下载
//		if(INetSDK.PauseDownload(FileRet, false)){
//			ToolKits.writeLog("Call PauseDownload success");
//		}else{
//			ToolKits.writeLog("Call PauseDownload failed");
//		}

	}


	// 查询升级状态
    void QueryUpgradeState() {
    	NET_IN_UPGRADE_STATE stIn = new NET_IN_UPGRADE_STATE();
    	NET_OUT_UPGRADE_STATE stOut = new NET_OUT_UPGRADE_STATE();

        boolean bRet = INetSDK.QueryDevInfo(__LoginHandle, FinalVar.NET_QUERY_UPGRADE_STATE, stIn, stOut, null, _waittime);
        if (!bRet) {
            ToolKits.writeErrorLog("check upgrade state");
            return;
        } else {
			ToolKits.writeLog("szOldVersion " + new String(stOut.szOldVersion).trim());
			ToolKits.writeLog("szNewVersion " + new String(stOut.szNewVersion).trim());
			ToolKits.writeLog("emState " + stOut.emState);
			ToolKits.writeLog("emType " + stOut.emType);
			ToolKits.writeLog("nProgress " + stOut.nProgress);
		}
    }

    // 报警网关语音配置
    void AlarmSoundConfig() {
   	   	NET_ALARM_SOUND_INFO cfgData = new NET_ALARM_SOUND_INFO();
    	int emCfgOpType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_ALARM_SOUND;
    	int nChannelID = -1;

		// 获取
    	if(INetSDK.GetConfig(__LoginHandle, emCfgOpType, nChannelID, cfgData, _waittime, null)) {
			ToolKits.writeLog("alarm effect " + cfgData.emSoundEffect);

			// 设置
			cfgData.emSoundEffect = EM_ALARM_SOUND_EFFECT.EM_ALARM_SOUND_EFFECT_MUTE;
			INetSDK.SetConfig(__LoginHandle, emCfgOpType, nChannelID, cfgData, _waittime, null, null);
		}
    }

    // 获取权限类型信息列表
	public void GetAuthClassifyList() {
    	NET_IN_GET_AUTHORITY_INFO_LIST stIn = new NET_IN_GET_AUTHORITY_INFO_LIST();
    	NET_OUT_GET_AUTHORITY_INFO_LIST stOut = new NET_OUT_GET_AUTHORITY_INFO_LIST();

    	boolean bRet = INetSDK.GetAuthClassifyList(__LoginHandle, stIn, stOut, 5000);

    	if(bRet){
    		ToolKits.writeLog("GetAuthClassifyList Succeed!" + "\n" + "返回的权限类型信息个数 : " + stOut.nRetAuthInfoCount);
    		for(int i=0; i<stOut.nRetAuthInfoCount; i++){
    			ToolKits.writeLog("主权限类型 : " + stOut.stuAuthInfo[i].emMainAuthority);
    			ToolKits.writeLog("子权限类型 : " + stOut.stuAuthInfo[i].emSubAuthority);
    			ToolKits.writeLog("通道号 : " + stOut.stuAuthInfo[i].nChannel);
    		}
    	} else {
    		ToolKits.writeErrorLog("GetAuthClassifyList Failed!" );
    	}
    }

	// 获取LowRateWPAN能力
	public void QueryLowRateWPAN() {
		CFG_CAP_LOWRATEWPAN capLowratewpan = new CFG_CAP_LOWRATEWPAN();
		char szOutBuffer[] = new char[1024];
		Integer error = Integer.valueOf(0);
		boolean bRet = INetSDK.QueryNewSystemInfo(__LoginHandle, FinalVar.CFG_CAP_CMD_LOWRATEWPAN, 0, szOutBuffer, error, 3000);
		if(bRet) {
			bRet = false;
			bRet = INetSDK.ParseData(FinalVar.CFG_CAP_CMD_LOWRATEWPAN, szOutBuffer, capLowratewpan, null);
			if(bRet){
				ToolKits.writeLog("最大分页查询的对码条数：" + capLowratewpan.nMaxPageSize);
			} else {
				ToolKits.writeErrorLog("ParseData Failed!" );
			}
		} else {
			ToolKits.writeErrorLog("QueryNewSystemInfo Failed!" );
		}
	}

	//音频输入输出大小调节
	public void speakerConfig() {
		boolean bRet = false;

		NET_AUDIOOUT_VOLUME_INFO stu = new NET_AUDIOOUT_VOLUME_INFO();

		bRet = INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_AUDIOOUT_VOLUME, -1, stu, 3000, null);
		if(bRet) {
			ToolKits.writeLog("GetOutSpeaker Succeed!" + "\n" + "nVolume：" + stu.nVolume);

			stu.nVolume = 100;
			bRet = INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_AUDIOOUT_VOLUME, -1, stu, 3000, null, null);
			if (bRet)
			{
				ToolKits.writeLog("SetOutSpeaker Succeed!" + "\n" + "nVolume：" + stu.nVolume);
			}
			else {
				ToolKits.writeLog("SetOutSpeaker failed!" + "\n");
			}
		}
		else
		{
			ToolKits.writeLog("GetOutSpeaker failed!");
		}

		NET_AUDIOIN_VOLUME_INFO stu1 = new NET_AUDIOIN_VOLUME_INFO();
		bRet = INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_AUDIOIN_VOLUME, -1, stu1, 3000, null);
		if(bRet) {
			ToolKits.writeLog("GetInSpeaker Succeed!" + "\n" + "nVolume：" + stu1.nVolume);

			stu1.nVolume = 100;
			bRet = INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_AUDIOIN_VOLUME, -1, stu1, 3000, null, null);
			if (bRet)
			{
				ToolKits.writeLog("GetInSpeaker Succeed!" + "\n" + "nVolume：" + stu1.nVolume);
			}
			else {
				ToolKits.writeLog("GetInSpeaker failed!" + "\n");
			}
		}
		else
		{
			ToolKits.writeLog("GetInSpeaker failed!");
		}


	}

	// WiFi服务端配置
	public void AccessPointConfig() {
		boolean bRet = false;
		NET_NETAPP_ACCESSPOINT netApp = new NET_NETAPP_ACCESSPOINT(10);

		// 获取
		bRet = INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_ACCESS_POINT, -1, netApp, 3000, null);
		if(bRet){
			ToolKits.writeLog("GetNetApp  Succeed!" + "\n" + "AP有效个数：" + netApp.nValidAPNum);
			for(int i=0; i<netApp.nValidAPNum; i++) {
				ToolKits.writeLog("网卡配置名 :" + netApp.stuAccessPoints[i].emAccessPointName);
				ToolKits.writeLog("有效工作模式个数 :" + netApp.stuAccessPoints[i].nValidPatternNum);
				for(int j=0; j<netApp.stuAccessPoints[i].nValidPatternNum; j++) {
					ToolKits.writeLog("工作模式 :" + netApp.stuAccessPoints[i].stuWorkPattern[j].emWorkPatternType);
					ToolKits.writeLog("WIFI网卡使能开关 :" + netApp.stuAccessPoints[i].stuWorkPattern[j].bEnable);
					ToolKits.writeLog("是否隐藏SSID :" + netApp.stuAccessPoints[i].stuWorkPattern[j].bHideSSID);
					ToolKits.writeLog("SSID :" + new String(netApp.stuAccessPoints[i].stuWorkPattern[j].szSSID).trim());
					ToolKits.writeLog("网络名称 :" + new String(netApp.stuAccessPoints[i].stuWorkPattern[j].szSSID).trim());
					ToolKits.writeLog("网络连接模式 :" + netApp.stuAccessPoints[i].stuWorkPattern[j].emLinkMode);
					ToolKits.writeLog("过滤配置-是否开启过滤功能 :" + netApp.stuAccessPoints[i].stuWorkPattern[j].stuFilter.bEnable);
					ToolKits.writeLog("过滤配置-最大Wifi设备连接个数 :" + netApp.stuAccessPoints[i].stuWorkPattern[j].stuFilter.nMaxAccessNum);
					ToolKits.writeLog("过滤配置-返回的地址个数 :" + netApp.stuAccessPoints[i].stuWorkPattern[j].stuFilter.nRetListNum);
				}
			}

			ToolKits.showMessage(TestInterfaceActivity.this, "Current SSID:" + new String(netApp.stuAccessPoints[0].stuWorkPattern[0].szSSID).trim());

			// 设置
			bRet = false;
			//netApp.nValidAPNum = 1;
			//netApp.stuAccessPoints[0].emAccessPointName = EM_ACCESSPOINT_NAME.EM_ACCESSPOINT_NAME_ETH2;
			//netApp.stuAccessPoints[0].nValidPatternNum = 1;
			//netApp.stuAccessPoints[0].stuWorkPattern[0].bHideSSID = true;

			String ssid = "01234567890123456789012345678901234";
			ToolKits.showMessage(TestInterfaceActivity.this, "Change  SSID to:" + ssid);
			//System.arraycopy(ssid.getBytes(), 0, netApp.stuAccessPoints[0].stuWorkPattern[0].szSSID, 0, ssid.getBytes().length);
			//netApp.stuAccessPoints[0].stuWorkPattern[0].emWorkPatternType = EM_WORKPATTERN.EM_WORKPATTERN_5G; // EM_WORKPATTERN_2_4G    EM_WORKPATTERN_5G
			//netApp.stuAccessPoints[0].stuWorkPattern[0].stuFilter.bEnable = true;
			//netApp.stuAccessPoints[0].stuWorkPattern[0].stuFilter.nMaxListNum = 10;
			bRet = INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_ACCESS_POINT, -1, netApp, 3000, null, null);
			if(bRet){
				ToolKits.showMessage(TestInterfaceActivity.this, "save success!");
			} else {
				int nErr = INetSDK.GetLastError() & 0x7fffffff;
				ToolKits.writeLog("GetLastError :" + nErr);
				ToolKits.showMessage(TestInterfaceActivity.this, "save failed!");
			}
		} else {
			ToolKits.showMessage(TestInterfaceActivity.this, "GetNetApp failed!");
		}
	}

	// 铁路记录配置
	public void CarCoacnConfig() {
		NET_DEV_CAR_COACH_INFO devCarCoach = new NET_DEV_CAR_COACH_INFO();
		boolean bRet = INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_DEV_CAR_COACH, -1, devCarCoach, 3000, null, null);
		if(bRet){
			ToolKits.writeLog("SetDevCar  Succeed!");
		} else {
			ToolKits.writeErrorLog("SetDevCar Failed!" );
		}

		bRet = false;
		bRet = INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_DEV_CAR_COACH, -1, devCarCoach, 3000, null);
		if(bRet){
			ToolKits.writeLog("GetDevCar  Succeed!");
		} else {
			ToolKits.writeErrorLog("GetDevCar Failed!" );
		}
	}

	// 查找下载动检图片
	void FindFileEx_MotionDetect(){
		boolean bRet = false;
		// 获取动检图片信息
		NET_IN_MEDIA_QUERY_FILE infile = new NET_IN_MEDIA_QUERY_FILE();
		infile.stuStartTime.dwYear = 2022;
		infile.stuStartTime.dwMonth = 3;
		infile.stuStartTime.dwDay = 15;
		infile.stuStartTime.dwHour = 7;
		infile.stuStartTime.dwMinute = 00;
		infile.stuStartTime.dwSecond = 00;

		infile.stuEndTime.dwYear = 2022;
		infile.stuEndTime.dwMonth = 3;
		infile.stuEndTime.dwDay = 15;
		infile.stuEndTime.dwHour = 23;
		infile.stuEndTime.dwMinute = 00;
		infile.stuEndTime.dwSecond = 00;

		infile.szDirs = "";
		infile.nMediaType = 0;				//文件类型 0:任意类型, 1:jpg图片, 2:dav文件
		infile.nChannelID = 0;				//通道号， -1表示所有通道
//		infile.nEventLists[0] = FinalVar.EVENT_IVS_ALL;
//		infile.nEventCount = 1;


		long lFindHandle = INetSDK.FindFileEx(__LoginHandle, EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FILE, infile, 30000);
		if(lFindHandle != 0){
			ToolKits.writeLog("FindFileEx Succeed!");
		} else {
			ToolKits.writeErrorLog("FindFileEx Failed!" );
		}

		NET_OUT_MEDIA_QUERY_FILE[] outfile = new NET_OUT_MEDIA_QUERY_FILE[10];
		for (int i = 0; i < 10; i++) {
			outfile[i] = new NET_OUT_MEDIA_QUERY_FILE();
		}

		int nCount = 0;
		int nMaxCount = 10;
		int nRetCount = 0;
		while(true) {
			nRetCount = INetSDK.FindNextFileEx(lFindHandle, EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FILE, outfile, 10000);
			if(nRetCount <= 0) {
				ToolKits.writeErrorLog("FindNextFileEx Failed!" );
				return;
			}

			for(int i = 0; i < nRetCount; i++){
				ToolKits.writeLog("---------------[ " + (i + nMaxCount * nCount) +"] -----------------");
				ToolKits.writeLog("文件路径：" + new String(outfile[i].szFilePath).trim());
				ToolKits.writeLog("文件类型:" + outfile[i].byFileType);
				ToolKits.writeLog("StartTime:" + outfile[i].stuStartTime.toString());
				ToolKits.writeLog("EndTime:" + outfile[i].stuStartTime.toString());
				ToolKits.writeLog("EventType[0]:" + outfile[i].nEventLists[0]);
				ToolKits.writeLog("EventType[1]:" + outfile[i].nEventLists[1]);
				ToolKits.writeLog("nEventCount:" + outfile[i].nEventCount);

			}

			if(nRetCount < nMaxCount) {
				break;
			} else {
				nCount++;
			}
		}
		INetSDK.FindCloseEx(lFindHandle);
	}


	// 获取标记录像信息 和 设置标记文件
    void FindMarkFile_SetMarkFile(){
    	boolean bRet = false;
    	// 获取标记录像信息
    	NET_IN_MEDIA_QUERY_FILE infile = new NET_IN_MEDIA_QUERY_FILE();
    	infile.stuStartTime.dwYear = 2020;
    	infile.stuStartTime.dwMonth = 4;
    	infile.stuStartTime.dwDay = 5;
    	infile.stuStartTime.dwHour = 0;
    	infile.stuStartTime.dwMinute = 45;
    	infile.stuStartTime.dwSecond = 22;

    	infile.stuEndTime.dwYear = 2020;
    	infile.stuEndTime.dwMonth = 4;
    	infile.stuEndTime.dwDay = 5;
    	infile.stuEndTime.dwHour = 11;
    	infile.stuEndTime.dwMinute = 48;
    	infile.stuEndTime.dwSecond = 32;

		infile.szDirs = "";
    	infile.nMediaType = 2;
    	infile.nChannelID = 2;
    	infile.byVideoStream = 1;

    	long lFindHandle = INetSDK.FindFileEx(__LoginHandle, EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FILE_EX, infile, 30000);
    	if(lFindHandle != 0){
    		ToolKits.writeLog("FindFileEx Succeed!");
    	} else {
    		ToolKits.writeErrorLog("FindFileEx Failed!" );
    	}

    	NET_OUT_MEDIA_QUERY_FILE[] outfile = new NET_OUT_MEDIA_QUERY_FILE[10];
		for (int i = 0; i < 10; i++) {
			outfile[i] = new NET_OUT_MEDIA_QUERY_FILE();
		}

		int nCount = 0;
		int nMaxCount = 10;
		int nRetCount = 0;
		while(true) {
			nRetCount = INetSDK.FindNextFileEx(lFindHandle, nMaxCount, outfile, 10000);
			if(nRetCount <= 0) {
				ToolKits.writeErrorLog("FindNextFileEx Failed!" );
				return;
			}

    		for(int i = 0; i < nRetCount; i++){
				ToolKits.writeLog("---------------[ " + (i + nMaxCount * nCount) +"] -----------------");
				ToolKits.writeLog("文件路径：" + new String(outfile[i].szFilePath).trim());
    			ToolKits.writeLog("文件类型:" + outfile[i].byFileType);

    			ToolKits.writeLog("事件总数：" + outfile[i].nEventCount);
    			for(int j=0; j<outfile[i].nEventCount; j++){
    				ToolKits.writeLog("事件：" + outfile[i].nEventLists[j]);
    			}

    			ToolKits.writeLog("文件摘要信息数：" + outfile[i].nFileSummaryNum);
    			for(int j=0; j<outfile[i].nFileSummaryNum; j++){
    				ToolKits.writeLog("摘要内容：" + new String(outfile[i].stFileSummaryInfo[j].szKey).trim());
    			}

    			ToolKits.writeLog("文件标志总数：" + outfile[i].nFalgCount);
    			for(int j=0; j<outfile[i].nFalgCount; j++) {
					ToolKits.writeLog("标志文件：" + outfile[i].emFalgLists[j]);
				}
				ToolKits.writeLog("emFileState：" + outfile[i].emFileState);
				ToolKits.writeLog("szWorkDir：" + new String(outfile[i].szWorkDir).trim());
    		}

			if(nRetCount < nMaxCount) {
				break;
			} else {
				nCount++;
			}
    	}

    	INetSDK.FindCloseEx(lFindHandle);


    	// 按文件标记
    	bRet = false;
    	for(int i = 0; i < nRetCount; i++) {
    		NET_IN_SET_MARK_FILE inMarkFile = new NET_IN_SET_MARK_FILE();
	    	inMarkFile.emLockMode = EM_MARKFILE_MODE.EM_MARK_FILE_BY_NAME_MODE;  // 通过文件名方式对录像加锁
	    	inMarkFile.emFileNameMadeType = EM_MARKFILE_NAMEMADE_TYPE.EM_MARKFILE_NAMEMADE_DEFAULT; // 默认方式：需要用户传递录像文件名参数szFilename

	    	inMarkFile.byImportantRecID = 1; // 0:false清除;   1:true 标记

        	String nameString = new String(outfile[i].szFilePath);
        	System.arraycopy(nameString.getBytes(), 0, inMarkFile.szFilename, 0, nameString.getBytes().length);

        	NET_OUT_SET_MARK_FILE outMarkFile = new NET_OUT_SET_MARK_FILE();
        	bRet = INetSDK.SetMarkFile(__LoginHandle, inMarkFile, outMarkFile, 3000);
        	if(bRet){
        		ToolKits.writeLog("SetMarkFile Succeed!");
        	} else {
        		ToolKits.writeErrorLog("SetMarkFile Failed!" );
        	}
    	}
    }

	// 获取标记录像信息 和 设置标记文件
	void FindFileExEvent(){
		boolean bRet = false;
		// 获取标记录像信息
		NET_IN_MEDIA_QUERY_FILE infile = new NET_IN_MEDIA_QUERY_FILE();
		infile.stuStartTime.dwYear = 2019;
		infile.stuStartTime.dwMonth = 11;
		infile.stuStartTime.dwDay = 26;
		infile.stuStartTime.dwHour = 0;
		infile.stuStartTime.dwMinute = 00;
		infile.stuStartTime.dwSecond = 0;

		infile.stuEndTime.dwYear = 2019;
		infile.stuEndTime.dwMonth = 11;
		infile.stuEndTime.dwDay = 28;
		infile.stuEndTime.dwHour = 23;
		infile.stuEndTime.dwMinute = 59;
		infile.stuEndTime.dwSecond = 59;

		infile.szDirs = "";
		infile.nMediaType = 0;
		infile.nChannelID = 0;
		infile.byVideoStream = 1;

		infile.stuEventInfo[0].nEvent = 1;
		infile.stuEventInfo[0].arrayObejctType[0] = 4;
		infile.stuEventInfo[0].nObjectCount = 1;
		infile.nEventInfoCount = 1;
		infile.nEventCount = 1;

		long lFindHandle = INetSDK.FindFileEx(__LoginHandle, EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FILE_EX, infile, 3000);
		if(lFindHandle != 0){
			ToolKits.writeLog("FindFileEx Succeed!");
		} else {
			ToolKits.writeErrorLog("FindFileEx Failed!" );
		}

		NET_OUT_MEDIA_QUERY_FILE[] outfile = new NET_OUT_MEDIA_QUERY_FILE[10];
		for (int i = 0; i < 10; i++) {
			outfile[i] = new NET_OUT_MEDIA_QUERY_FILE();
		}

		int nCount = 0;
		int nMaxCount = 10;
		int nRetCount = 0;
		while(true) {
			nRetCount = INetSDK.FindNextFileEx(lFindHandle, EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FILE_EX, outfile, 10000);
			if(nRetCount <= 0) {
				ToolKits.writeErrorLog("FindNextFileEx Failed!" );
				return;
			}

			for(int i = 0; i < nRetCount; i++){
				ToolKits.writeLog("---------------[ " + (i + nMaxCount * nCount) +"] -----------------");
				ToolKits.writeLog("文件路径：" + new String(outfile[i].szFilePath).trim());
				ToolKits.writeLog("文件类型:" + outfile[i].byFileType);

				ToolKits.writeLog("事件总数：" + outfile[i].nEventCount);
				for(int j=0; j<outfile[i].nEventCount; j++){
					ToolKits.writeLog("事件：" + outfile[i].nEventLists[j]);
				}

				ToolKits.writeLog("文件摘要信息数：" + outfile[i].nFileSummaryNum);
				for(int j=0; j<outfile[i].nFileSummaryNum; j++){
					ToolKits.writeLog("摘要内容：" + new String(outfile[i].stFileSummaryInfo[j].szKey).trim());
				}

				ToolKits.writeLog("文件标志总数：" + outfile[i].nFalgCount);
				for(int j=0; j<outfile[i].nFalgCount; j++) {
					ToolKits.writeLog("标志文件：" + outfile[i].emFalgLists[j]);
				}
			}

			if(nRetCount < nMaxCount) {
				break;
			} else {
				nCount++;
			}
		}

		INetSDK.FindCloseEx(lFindHandle);

	}

	// 设备属性配置(获取录像打包时间)
	public void GetDeviceSystemInfo() {
		SDKDEV_SYSTEM_ATTR_CFG[] systemAttr = new SDKDEV_SYSTEM_ATTR_CFG[1];
		systemAttr[0] = new SDKDEV_SYSTEM_ATTR_CFG();
		Integer interAttr = Integer.valueOf(0);
		boolean bRet = INetSDK.GetDevConfig(__LoginHandle, FinalVar.SDK_DEV_DEVICECFG, -1, systemAttr, interAttr, 3000);
		if(bRet) {
			ToolKits.writeLog("byRecordLen = " + systemAttr[0].byRecordLen);
			ToolKits.writeLog("byVideoCaptureNum = " + systemAttr[0].byVideoCaptureNum);
		} else {
			ToolKits.writeErrorLog("GetRecordLen Failed!" );
		}
	}

	// 通道名称配置(老接口)
	public void ChannelNameOldConfig() {
		boolean bRet = false;
		AV_CFG_ChannelName[] channelName = new AV_CFG_ChannelName[16]; // 数组长度为视频口数量最大值
		for(int i=0; i < 16; i++) {
			channelName[i] = new AV_CFG_ChannelName();
		}
		for(int i=0; i < 16; i++) {
			bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_CHANNELTITLE, channelName[i], __LoginHandle, i, 2048);
			if(bRet) {
				ToolKits.writeLog("GetChannelName Succeed!" + "  " + channelName[i].nSerial + " " + new String(channelName[i].szName).trim());
			} else {
				ToolKits.writeErrorLog("GetChannelName Failed!" );
			}
		}

		bRet = false;
		String Name = "666656789012";  // 要12位
		ToolKits.writeLog(Name.getBytes().length + "  /  " + channelName[0].szName.length);
		System.arraycopy(Name.getBytes(), 0, channelName[0].szName, 0, Name.getBytes().length);
		bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_CHANNELTITLE, channelName[0], __LoginHandle, 0, 2048);
		if(bRet) {

			ToolKits.writeLog("SetChannelName Succeed!");
		} else {
			ToolKits.writeErrorLog("SetChannelName Failed!" );

		}
	}

	public void GetMobilePusherEventList()
	{
		NET_IN_GET_MOBILE_PUSHER_EVNET_LIST stuIn= new NET_IN_GET_MOBILE_PUSHER_EVNET_LIST();
		stuIn.nChannelNum = 1;
		stuIn.nChannel[0] = -1;

		NET_OUT_GET_MOBILE_PUSHER_EVNET_LIST stuOut = new NET_OUT_GET_MOBILE_PUSHER_EVNET_LIST(2);
		stuOut.nMaxEventlistNum = 2;
		boolean bRet = INetSDK.GetMobilePusherEventList(__LoginHandle, stuIn, stuOut, 5000);
		if(bRet)
		{
			ToolKits.writeLog("GetMobilePusherEventList success");
			ToolKits.writeLog("name" + new String(stuOut.pMobilePusherEventlist[0].stuMobilePusherEvent[0].szCode).trim());
		}
		else
		{
			ToolKits.writeLog("GetMobilePusherEventList failed");
		}

	}

	public void  FindRecordAccessCtl() {
		//模糊查询，可以查询所有信息
		NET_IN_FIND_RECORD_PARAM infindRecord = new NET_IN_FIND_RECORD_PARAM();
		FIND_RECORD_ACCESSCTLCARDREC_CONDITION_EX recordcondition = new FIND_RECORD_ACCESSCTLCARDREC_CONDITION_EX();  //条件
		recordcondition.stStartTime.dwYear = 2020;
		recordcondition.stStartTime.dwMonth = 3;
		recordcondition.stStartTime.dwDay = 31;
		recordcondition.stEndTime.dwYear = 2020;
		recordcondition.stEndTime.dwMonth = 4;
		recordcondition.stEndTime.dwMonth = 1;
		recordcondition.stEndTime.dwHour = 23;
		recordcondition.stEndTime.dwMinute = 59;
		recordcondition.stEndTime.dwSecond = 59;
		infindRecord.emType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESSCTLCARDREC_EX;
		infindRecord.pQueryCondition = recordcondition;
		NET_OUT_FIND_RECORD_PARAM outfindRecord = new NET_OUT_FIND_RECORD_PARAM();
		if(INetSDK.FindRecord(__LoginHandle, infindRecord, outfindRecord, 5000)) {
			int doNextCount = 0;
			int item = 0;
			while(true) {
				int nCount = 10;
				NET_IN_FIND_NEXT_RECORD_PARAM infindNextRecord = new NET_IN_FIND_NEXT_RECORD_PARAM();
				infindNextRecord.lFindeHandle = outfindRecord.lFindeHandle;
				infindNextRecord.nFileCount = nCount;
				infindNextRecord.emType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESSCTLCARDREC_EX;

				NET_RECORDSET_ACCESS_CTL_CARDREC[] listRecord = new NET_RECORDSET_ACCESS_CTL_CARDREC[10];   //数组大小，代表可以查询的记录信息最大值
				for(int m=0; m<10; m++) {
					listRecord[m] = new NET_RECORDSET_ACCESS_CTL_CARDREC();
				}

				NET_OUT_FIND_NEXT_RECORD_PARAM outfindNextRecord = new NET_OUT_FIND_NEXT_RECORD_PARAM();
				outfindNextRecord.nMaxRecordNum = nCount;
				outfindNextRecord.pRecordList = listRecord;

				int retCount = INetSDK.FindNextRecord(infindNextRecord, outfindNextRecord, 5000);
				if(retCount != 0) {
					ToolKits.writeLog("查到的个数：" + outfindNextRecord.nRetRecordNum);
					for(int i=0; i<outfindNextRecord.nRetRecordNum; i++) {

						item = i + doNextCount * nCount;
						ToolKits.writeLog("ManTemperature is "+ listRecord[0].stuManTemperatureInfo.fCurrentTemperature);

					}

					if(outfindNextRecord.nRetRecordNum < nCount) {
						break;
					} else {
						doNextCount++;
					}

				} else {
					ToolKits.writeErrorLog("FindNextRecord Failed!" );
					break;
				}
			}
			ToolKits.writeLog("查询到的总个数：" + (item + 1));
		} else {
			ToolKits.writeErrorLog("FindRecord Failed!" );
		}

		if(INetSDK.FindRecordClose(outfindRecord.lFindeHandle))
		{
			ToolKits.writeLog("FindRecordClose success!" );
		}
	}

	public void  FindRecordAccessMobilePushResult() {
		//模糊查询，可以查询所有信
		NET_IN_FIND_RECORD_PARAM infindRecord = new NET_IN_FIND_RECORD_PARAM();
		FIND_RECORD_ACCESS_MOBILE_PUSH_RESULT_INFO_CONDITION recordcondition = new FIND_RECORD_ACCESS_MOBILE_PUSH_RESULT_INFO_CONDITION();  //条件
		recordcondition.emFindPushResultType = EM_FIND_VTO_PUSH_RESULT_TYPE.EM_FIND_VTO_PUSH_RESULT_TYPE_ALL;
		infindRecord.emType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESS_MOBILE_PUSH_RESULT;
		infindRecord.pQueryCondition = recordcondition;
		NET_OUT_FIND_RECORD_PARAM outfindRecord = new NET_OUT_FIND_RECORD_PARAM();
		if(INetSDK.FindRecord(__LoginHandle, infindRecord, outfindRecord, 5000)) {
			int doNextCount = 0;
			int item = 0;
			while(true) {
				int nCount = 10;
				NET_IN_FIND_NEXT_RECORD_PARAM infindNextRecord = new NET_IN_FIND_NEXT_RECORD_PARAM();
				infindNextRecord.lFindeHandle = outfindRecord.lFindeHandle;
				infindNextRecord.nFileCount = nCount;
				infindNextRecord.emType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESS_MOBILE_PUSH_RESULT;

				NET_RECORD_ACCESS_MOBILE_PUSH_RESULT_INFO[] listRecord = new NET_RECORD_ACCESS_MOBILE_PUSH_RESULT_INFO[10];   //数组大小，代表可以查询的记录信息最大值
				for(int m=0; m<10; m++) {
					listRecord[m] = new NET_RECORD_ACCESS_MOBILE_PUSH_RESULT_INFO();
				}

				NET_OUT_FIND_NEXT_RECORD_PARAM outfindNextRecord = new NET_OUT_FIND_NEXT_RECORD_PARAM();
				outfindNextRecord.nMaxRecordNum = nCount;
				outfindNextRecord.pRecordList = listRecord;

				int retCount = INetSDK.FindNextRecord(infindNextRecord, outfindNextRecord, 5000);
				if(retCount != 0) {
					ToolKits.writeLog("查到的个数：" + outfindNextRecord.nRetRecordNum);
					for(int i=0; i<outfindNextRecord.nRetRecordNum; i++) {

						item = i + doNextCount * nCount;
						ToolKits.writeLog("nRecNo is "+ listRecord[0].nRecNo);

					}

					if(outfindNextRecord.nRetRecordNum < nCount) {
						break;
					} else {
						doNextCount++;
					}

				} else {
					ToolKits.writeErrorLog("FindNextRecord Failed!" );
					break;
				}
			}
			ToolKits.writeLog("查询到的总个数：" + (item + 1));
		} else {
			ToolKits.writeErrorLog("FindRecord Failed!" );
		}

		if(INetSDK.FindRecordClose(outfindRecord.lFindeHandle))
		{
			ToolKits.writeLog("FindRecordClose success!" );
		}
	}


	// 补光灯配置(老接口)
	public void Lighting_V2() {
		boolean bRet = false;
		CFG_LIGHTING_V2_INFO Lighting_V2 = new CFG_LIGHTING_V2_INFO(); // 数组长度为视频口数量最大值

		bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_LIGHTING_V2, Lighting_V2, __LoginHandle, 0, 20480);
		if(bRet) {
			ToolKits.writeLog("GetLighting_V2 Succeed!" + "  " + Lighting_V2.nChannel);
		} else {
			ToolKits.writeErrorLog("Get Lighting_V2 Failed!, error is " + INetSDK.GetLastError());
			return;
		}

		bRet = false;
		if(Lighting_V2.anDNLightInfo[0].anLightInfo[0].emMode == EM_CFG_LC_MODE.EM_CFG_LC_MODE_FORCEON )
		{
			Lighting_V2.anDNLightInfo[0].anLightInfo[0].emMode = EM_CFG_LC_MODE.EM_CFG_LC_MODE_OFF;
		}
		else
		{
			Lighting_V2.anDNLightInfo[0].anLightInfo[0].emMode = EM_CFG_LC_MODE.EM_CFG_LC_MODE_FORCEON;
		}


		Lighting_V2.anDNLightInfo[0].anLightInfo[0].emLightType = EM_CFG_LC_LIGHT_TYPE.EM_CFG_LC_LIGHT_TYPE_WIHTELIGHT;


		bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_LIGHTING_V2, Lighting_V2, __LoginHandle, 0, 20480);
		if(bRet) {

			ToolKits.writeLog("Lighting_V2 Succeed!");
		} else {
			ToolKits.writeErrorLog("Lighting_V2 Failed!error is " + INetSDK.GetLastError());
			return;

		}

		CFG_LIGHTING_V2_INFO Lighting_V2New = new CFG_LIGHTING_V2_INFO(); // 数组长度为视频口数量最大值

		bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_LIGHTING_V2, Lighting_V2New, __LoginHandle, 0, 20480);
		if(bRet) {
			ToolKits.writeLog("GetLighting_V2New Succeed!" + "  " + Lighting_V2New.nChannel);
		} else {
			ToolKits.writeErrorLog("Get Lighting_V2New Failed!, error is " + INetSDK.GetLastError());
		}
	}


	// 通道名称配置(新接口)
	public void ChannelNameNewConfig() {
		NET_ENCODE_CHANNELTITLE_INFO stIn = new NET_ENCODE_CHANNELTITLE_INFO();
		int channel = 0;  // 通道号

		// 获取
		if (INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_ENCODE_CHANNELTITLE, channel, stIn, 3000, null)) {
			ToolKits.writeLog("szChannelName : " + new String(stIn.szChannelName).trim());
		} else {
			ToolKits.writeErrorLog("Get Faile" );
		}

		String channelName = "dahua123";
		ToolKits.StringToByteArray(channelName, stIn.szChannelName);     // 通道名称
		if(INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_ENCODE_CHANNELTITLE, channel, stIn, 3000, null, null)) {
			ToolKits.writeLog("Set Succeed!");
		} else {
			ToolKits.writeErrorLog("Set Faile" );
		}
	}

	public void testLogOut(){

        if(INetSDK.Logout(1)){
            ToolKits.writeLog("LogOut successful,Login Handle 1");
        }else{
            ToolKits.writeErrorLog("LogOut failed,Login Handle 1");
        }

        if(INetSDK.Logout(2)){
            ToolKits.writeLog("LogOut successful,Login Handle 2");
        }else{
            ToolKits.writeErrorLog("LogOut failed,Login Handle 2");
        }

        if(INetSDK.Logout(3)){
            ToolKits.writeLog("LogOut successful,Login Handle 3");
        }else{
            ToolKits.writeErrorLog("LogOut failed,Login Handle 3");
        }

        if(INetSDK.Logout(__LoginHandle)){
            ToolKits.writeLog("LogOut successful,Login Handle is right");
        }else{
            ToolKits.writeErrorLog("LogOut failed,Login Handle is right");
        }
        if(INetSDK.Logout(__LoginHandle)){
            ToolKits.writeLog("LogOut successful,Login Handle is right");
        }else{
            ToolKits.writeErrorLog("LogOut failed,Login Handle is right");
        }

    }

	// 按时间日志查询
	public void QueryDeviceLog() {
		QUERY_DEVICE_LOG_PARAM deviceLogParam = new QUERY_DEVICE_LOG_PARAM();
		deviceLogParam.emLogType = SDK_LOG_QUERY_TYPE.SDKLOG_ALL;
		deviceLogParam.stuStartTime.dwYear = 2022;

		deviceLogParam.stuStartTime.dwMonth = 4;
		deviceLogParam.stuStartTime.dwDay = 20;
		deviceLogParam.stuStartTime.dwHour = 11;
		deviceLogParam.stuStartTime.dwMinute = 0;
		deviceLogParam.stuStartTime.dwSecond = 0;

		deviceLogParam.stuEndTime.dwYear = 2022;
		deviceLogParam.stuEndTime.dwMonth = 4;
		deviceLogParam.stuEndTime.dwDay = 21;
		deviceLogParam.stuEndTime.dwHour = 15;
		deviceLogParam.stuEndTime.dwMinute = 0;
		deviceLogParam.stuEndTime.dwSecond = 0;

		deviceLogParam.nStartNum = 0;
		deviceLogParam.nEndNum = 5;
		deviceLogParam.nLogStuType = 1; // 0:表示SDK_DEVICE_LOG_ITEM；1:表示 SDK_DEVICE_LOG_ITEM_EX
		deviceLogParam.nChannelID = 0;
		Integer recLogNum = new Integer(0);
		SDK_DEVICE_LOG_ITEM[] deviceLogItem = new SDK_DEVICE_LOG_ITEM[deviceLogParam.nEndNum - deviceLogParam.nStartNum + 5];
		for(int i = 0; i < deviceLogParam.nEndNum - deviceLogParam.nStartNum + 5; i++){
			deviceLogItem[i] = new SDK_DEVICE_LOG_ITEM();
		}
		SDK_DEVICE_LOG_ITEM_EX[] deviceLogItemEx = new SDK_DEVICE_LOG_ITEM_EX[deviceLogParam.nEndNum - deviceLogParam.nStartNum + 5];
		for(int i = 0; i < deviceLogParam.nEndNum - deviceLogParam.nStartNum + 5; i++){
			deviceLogItemEx[i] = new SDK_DEVICE_LOG_ITEM_EX();
		}
		boolean bRet = INetSDK.QueryDeviceLog(__LoginHandle, deviceLogParam, deviceLogItemEx, recLogNum, 5000);
		if(bRet) {
			ToolKits.writeLog("QueryDeviceLog Succeed!" + "\n" + "日志条数：" + recLogNum );
			for(int i=0; i<recLogNum; i++){
				ToolKits.writeLog("日志类型：" + deviceLogItemEx[i].nLogType);
				ToolKits.writeLog("具体的操作内容：" + new String(deviceLogItemEx[i].szOperation).trim());
				ToolKits.writeLog("详细日志信息描述：" + new String(deviceLogItemEx[i].szDetailContext).trim());
				ToolKits.writeLog("日期：20" + deviceLogItemEx[i].stuOperateTime.year + "-" +
						deviceLogItemEx[i].stuOperateTime.month + "-" +
						deviceLogItemEx[i].stuOperateTime.day + "  " +
						deviceLogItemEx[i].stuOperateTime.hour + ":" +
						deviceLogItemEx[i].stuOperateTime.minute + ":" +
						deviceLogItemEx[i].stuOperateTime.second);
			}
		} else {
			ToolKits.writeErrorLog("QueryDeviceLog Failed!" );
		}
	}

	//
	//
	public void AnalyseGlobalConfig() {
		// 获取
		CFG_ANALYSEGLOBAL_INFO analyseglobal = new CFG_ANALYSEGLOBAL_INFO(10, 10);
		boolean bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_ANALYSEGLOBAL, analyseglobal, __LoginHandle, 0, 2*1024*1024);
		if(bRet) {
			ToolKits.writeLog("type = " + new String(analyseglobal.szSceneType).trim());
			ToolKits.writeLog("nCamHeight = " + analyseglobal.stuDriveAssistant.nCamHeight);
			ToolKits.writeLog("nCamToCarHead = " + analyseglobal.stuDriveAssistant.nCamToCarHead);
			ToolKits.writeLog("CenterPoint.x = " + analyseglobal.stuDriveAssistant.stuCenterPoint.nx);
			ToolKits.writeLog("CenterPoint.y = " + analyseglobal.stuDriveAssistant.stuCenterPoint.ny);
			// 设置
			analyseglobal.stuDriveAssistant.nCamHeight += 1;
			analyseglobal.stuDriveAssistant.nCamToCarHead += 1;
			analyseglobal.stuDriveAssistant.stuCenterPoint.nx += 1;
			analyseglobal.stuDriveAssistant.stuCenterPoint.ny += 1;
			bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_ANALYSEGLOBAL, analyseglobal, __LoginHandle, 0, 2*1024*1024);
			if(bRet) {
				ToolKits.writeLog("Set CFG_CMD_ANALYSEGLOBAL Succeed!");
			} else {
				ToolKits.writeErrorLog("Set CFG_CMD_ANALYSEGLOBAL Failed!" );
			}
		} else {
			ToolKits.writeErrorLog("GetFaceRecognition Failed!" );
		}
	}

	// 动态检测设置：动态检测功能的开与关
	public void MotionDetectConfig() {
		CFG_MOTION_INFO motion = new CFG_MOTION_INFO();
		motion.nChannelID = 0;
		motion.bEnable = true;
		boolean bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_MOTIONDETECT, motion, __LoginHandle, 0, 2048);
		if(bRet) {
			ToolKits.writeLog("SetMotionDetect Succeed!");
		} else {
			ToolKits.writeErrorLog("SetMotionDetect Failed!" );
		}
	}

	// 恢复出厂设置(恢复设备的默认设置新协议,指定什么配置，恢复什么配置)
	public void RestoreDefault() {
		NET_CTRL_RESTORE_DEFAULT restore = new NET_CTRL_RESTORE_DEFAULT();
		String cfgname = "Network&&IPv6&&VideoInSensor&&Multicast&&Web&&Https&&DVRIP&&VideoStandard&&VSP_GAYS&&DeviceInfo&&Telnet&&WLan";
		restore.szCfgNames = cfgname;
		boolean bRet = INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_RESTOREDEFAULT_EX, restore, 3000);
		if(bRet) {
			ToolKits.writeLog("RestoreDefault Succeed!");
		} else {
			ToolKits.writeErrorLog("RestoreDefault Failed!" );
		}
	}

	// 恢复出厂设置(恢复除指定配置外的其他配置为默认)
	public void RestoreExcept() {
		NET_CTRL_RESTORE_EXCEPT restore = new NET_CTRL_RESTORE_EXCEPT();
		String cfgname = "Network&&IPv6&&VideoInSensor&&Multicast&&Web&&Https&&DVRIP&&VideoStandard&&VSP_GAYS&&DeviceInfo&&Telnet&&WLan";
		System.arraycopy(cfgname.getBytes(), 0, restore.szCfgName, 0, cfgname.getBytes().length);
		boolean bRet = INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_RESTORE_EXCEPT, restore, 3000);
		if(bRet) {
			ToolKits.writeLog("RestoreDefault Succeed!");
		} else {
			ToolKits.writeErrorLog("RestoreDefault Failed!" );
		}
	}

	// 电子防抖：电子防抖功能的开与关
	public void VideoInStableConfig() {
		NET_VIDEOIN_STABLE_INFO stable = new NET_VIDEOIN_STABLE_INFO();
		stable.emCfgType = NET_EM_CONFIG_TYPE.NET_EM_CONFIG_NORMAL;  // 配置类型,获取和设置时都要指定
		stable.emStableType = NET_EM_STABLE_TYPE.NET_EM_STABLE_ELEC; // NET_EM_STABLE_TYPE.NET_EM_STABLE_OFF 关闭
		boolean bRet = INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_VIDEOIN_STABLE, -1, stable, 3000, null, null);
		if(bRet){
			ToolKits.writeLog("SetStableElec Succeed!");
		} else {
			ToolKits.writeErrorLog("SetStableElec Failed!" );
		}
	}

	// 强光抑制：强光抑制功能的开与关
	public void VideoInBackLightConfig() {
		NET_VIDEOIN_BACKLIGHT_INFO backlight = new NET_VIDEOIN_BACKLIGHT_INFO();
		backlight.emCfgType = NET_EM_CONFIG_TYPE.NET_EM_CONFIG_NORMAL;  // 配置类型,获取和设置时都要指定
		backlight.emBlackMode = NET_EM_BACK_MODE.NET_EM_BACKLIGHT_MODE_GLAREINHIBITION; // NET_EM_BACK_MODE.NET_EM_BACKLIGHT_MODE_OFF 关闭
		backlight.nGlareInhibition = 10;
		boolean bRet = INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_VIDEOIN_BACKLIGHT, -1, backlight, 3000, null, null);
		if(bRet) {
			ToolKits.writeLog("SetBackLight Succeed!");
		} else {
			ToolKits.writeErrorLog("SetBackLight Failed!" );
		}
	}

	// 版本信息：获取设备的版本信息，包括 设备型号、硬件版本、软件版本、序列号
	public void QueryDeviceSoftWare() {
		SDKDEV_VERSION_INFO version = new SDKDEV_VERSION_INFO();
		boolean bRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_SOFTWARE, version, 5000);
		if(bRet) {
			ToolKits.writeLog("QueryVersion Succeed!");
			ToolKits.writeLog("设备型号：" + new String(version.szDevType).trim());
			ToolKits.writeLog("硬件版本：" + new String(version.szHardwareVersion).trim());
			ToolKits.writeLog("软件版本：" + new String(version.szSoftWareVersion).trim());
			ToolKits.writeLog("序列号：" + new String(version.szDevSerialNo).trim());
		} else {
			ToolKits.writeErrorLog("QueryVersion Failed!" );
		}
	}

	/**
	 * 录播主机状态获取
	 **/
    void GetRecordState(){
    	boolean bResult = false;
    	NET_IN_GET_RECORD_STATE recStateIn = new NET_IN_GET_RECORD_STATE();
    	recStateIn.nChannel = 51;
		NET_OUT_GET_RECORD_STATE recStateOut = new NET_OUT_GET_RECORD_STATE();
		bResult = INetSDK.GetRecordState(__LoginHandle, recStateIn, recStateOut, 5000);
		if (!bResult) {
			ToolKits.writeErrorLog("GetRecordState failed");
		} else {
			ToolKits.writeLog("INetSDK.GetRecordState return state:" + recStateOut.bState);
		}
    }

	/**
	 * 录播主机复合操作
	 */
    void RecordedOperateComposite(){
    	showCompositeOperationDialog();
    	}

    	private void showCompositeOperationDialog(){
	    final String items[] = {"Operate add","Operate delete",
			   				   "Operate get","Operate modify"};
	    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    builder.setItems(items, new DialogInterface.OnClickListener() {
		   @Override
		   public void onClick(DialogInterface arg0, int arg1) {
			switch(arg1){
			case 0:
				addMode();
				break;
			case 1:
				deleteMode();
				break;
			case 2:
				getMode();
				break;
			case 3:
				modifyMode();
				break;
			}
		}
	    });
	    builder.setPositiveButton("TestCompoleted", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				arg0.dismiss();
			}
	    });
	    builder.setCancelable(false);
	    builder.create().show();
    }

   private void addMode(){
	   NET_IN_COURSECOMPOSITE_CHANNEL_MODE_ADD stuIn = new NET_IN_COURSECOMPOSITE_CHANNEL_MODE_ADD();
	   stuIn.nCount = 2;
	   for(int i=0;i<stuIn.nCount;i++){
			stuIn.stModeInfo[i].nWindowNum = 2;
			System.arraycopy("xxxx".getBytes(),0,stuIn.stModeInfo[i].szName, 0, "xxxx".getBytes().length);
			for(int j=0;j<stuIn.stModeInfo[i].nWindowNum;++j){
				stuIn.stModeInfo[i].stWindows[j].nLogicChannel = (i + 1) * (j * 3);
				stuIn.stModeInfo[i].stWindows[j].nZOrder = 2;
				stuIn.stModeInfo[i].stWindows[j].stRect.left = 50;
				stuIn.stModeInfo[i].stWindows[j].stRect.top = 50;
				stuIn.stModeInfo[i].stWindows[j].stRect.right = 250;
				stuIn.stModeInfo[i].stWindows[j].stRect.bottom = 250;
			}
	   }

		NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_ADD stuOut = new NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_ADD();
		boolean result = INetSDK.OperateCourseCompositeChannelMode(__LoginHandle,
				NET_COURSECOMPOSITE_MODE_OPERATE_TYPE.NET_COURSECOMPOSITE_MODE_ADD, stuIn, stuOut, 5000);
		if(result){
			for(int i=0;i<stuOut.nCount;++i){
				ToolKits.writeLog("nMode:"+String.valueOf(stuOut.stResult[i].nMode)+
						"returnCode:"+stuOut.stResult[i].nReturnCode);
			}
		}else{
			ToolKits.writeLog("OperateCouseCompositeChannelMode add failed.error is:"+(INetSDK.GetLastError()&0x7fffffff));
		}
	}

	private void deleteMode(){
		NET_IN_COURSECOMPOSITE_CHANNEL_MODE_DELETE stuIn = new NET_IN_COURSECOMPOSITE_CHANNEL_MODE_DELETE();
		stuIn.nModeNum = 2;
		stuIn.nMode[0] = -7;
		stuIn.nMode[1] = -8;

		NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_DELETE stuOut = new NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_DELETE();
		boolean result = INetSDK.OperateCourseCompositeChannelMode(__LoginHandle,
				NET_COURSECOMPOSITE_MODE_OPERATE_TYPE.NET_COURSECOMPOSITE_MODE_DELETE, stuIn, stuOut, 5000);
		if(result){
			ToolKits.writeLog("nReturnNum is:"+stuOut.nReturnNum);
			for(int i=0;i<stuOut.nReturnNum;i++){
				ToolKits.writeLog("returnCode:"+stuOut.nReturnCode[i]);
			}
		}else{
			ToolKits.writeLog("OperateCouseCompositeChannelMode delete failed.error is:"+(INetSDK.GetLastError()&0x7fffffff));
		}
	}

	private void modifyMode(){
		NET_IN_COURSECOMPOSITE_CHANNEL_MODE_MODIFY stuIn = new NET_IN_COURSECOMPOSITE_CHANNEL_MODE_MODIFY();
		stuIn.nModeNum = 2;
		for(int i=0;i<stuIn.nModeNum;i++){
			stuIn.nMode[i] = -7 - i;
			System.arraycopy("yyyy".getBytes(),0,stuIn.stModeInfo[i].szName, 0, "yyyy".getBytes().length);
			stuIn.stModeInfo[i].nWindowNum = 2;
			for(int j=0;j<stuIn.stModeInfo[i].nWindowNum;++j){
				stuIn.stModeInfo[i].stWindows[j].nZOrder = 10;
				stuIn.stModeInfo[i].stWindows[j].nLogicChannel = 20;
			}
		}
		NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_MODIFY stuOut = new NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_MODIFY();
		boolean bRet = INetSDK.OperateCourseCompositeChannelMode(__LoginHandle,
				NET_COURSECOMPOSITE_MODE_OPERATE_TYPE.NET_COURSECOMPOSITE_MODE_MODIFY, stuIn, stuOut, 5000);
		if(bRet){
			ToolKits.writeLog("modify number:"+stuOut.nReturnNum);
			for(int i=0;i<stuOut.nReturnNum;i++){
				ToolKits.writeLog("nReturnCode:"+stuOut.nReturnCode[i]);
			}
		}else{
			ToolKits.writeLog("recorded modify failed.error is:"+(INetSDK.GetLastError()&0x7fffffff));
		}

	}

	// 录播主机组合通道模式操作(获取模式)
	private void getMode(){
		NET_IN_COURSECOMPOSITE_CHANNEL_MODE_GET stuIn= new NET_IN_COURSECOMPOSITE_CHANNEL_MODE_GET();
		stuIn.nCount = 10;

		NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_GET stuOut = new NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_GET();
		boolean bRet = INetSDK.OperateCourseCompositeChannelMode(__LoginHandle,
				NET_COURSECOMPOSITE_MODE_OPERATE_TYPE.NET_COURSECOMPOSITE_MODE_GET, stuIn, stuOut, 5000);

		if(bRet){
			ToolKits.writeLog("getmode number is:"+stuOut.nReturnNum);
			for(int i=0;i<stuOut.nReturnNum;i++){
				ToolKits.writeLog("nMode:" + stuOut.nMode[i] + ";szName:"+new String(stuOut.stModeInfo[i].szName));
			}
		}else{
			ToolKits.writeLog("OperateCouseCompositeChannelMode get  failed.error is:"+(INetSDK.GetLastError()&0x7fffffff));
		}

	}

	// 视频输入前端选项
	public void VedioInOptionsConfig() {
		int channel = 10;
		CFG_VIDEO_IN_OPTIONS[] stCfgs = new CFG_VIDEO_IN_OPTIONS[channel];
		for ( int i = 0; i <  stCfgs.length; ++i) {
			stCfgs[i] =  new CFG_VIDEO_IN_OPTIONS();
		}

		boolean result = false;
		int nBufferLen = 4*1024*1024;
		Integer error = new Integer(0);
		char szBuffer[] = new char[nBufferLen];
		int nChn = -1;
		Integer count = new Integer(0);
		String strCmd = FinalVar.CFG_CMD_VIDEOINOPTIONS;

		// 获取
		if(INetSDK.GetNewDevConfig(__LoginHandle, strCmd , nChn, szBuffer,nBufferLen, error, 10000) )
		{
			if( INetSDK.ParseData(strCmd ,szBuffer , stCfgs , count ) )
			{
				result = true;
				ToolKits.writeLog("Has Configure " + count
						+"\n byWhiteBalance - "+ stCfgs[0].byWhiteBalance
						);

				// 设置
				result = INetSDK.PacketData(strCmd, stCfgs, szBuffer, nBufferLen);
				if (result) {
					Integer errorInteger = new Integer(0);
					Integer restartInteger = new Integer(0);
					INetSDK.SetNewDevConfig(__LoginHandle, strCmd, -1, szBuffer, nBufferLen, errorInteger, restartInteger, 10000);
				}
			}
		 }
	}
	public void  TestGetAlarmRegionMode(){
		{
			NET_IN_GET_ALARMMODE stuIn = new NET_IN_GET_ALARMMODE();
			NET_OUT_GET_ALARMMODE stuOut = new NET_OUT_GET_ALARMMODE();
			if (INetSDK.GetAlarmRegionInfo(__LoginHandle, NET_EM_GET_ALARMREGION_INFO.NET_EM_GET_ALARMREGION_INFO_ARMMODE, stuIn, stuOut, 5000)) {
				ToolKits.writeLog("GetAlarmRegionInfo success.");
				ToolKits.writeLog("nArmModeRet:" + stuOut.nArmModeRet);
				for(int i = 0; i < stuOut.nArmModeRet; i++){
					ToolKits.writeLog("nArmModeRet:" + stuOut.stuArmMode[i].emArmState);
				}
				NET_IN_SET_ALARMMODE stuIn2 = new NET_IN_SET_ALARMMODE();
				stuIn2.nAreaNum = 3;
				stuIn2.emArmType = EM_ARM_TYPE.EM_ARM_TYPE_DISARMING;
				for(int i = 0; i < 3; i++){
					stuIn2.arrAreas[i] = i + 1;
				}
				byte[] src = {49,50,51,53};
				System.arraycopy(src,0,stuIn2.szPwd,0,src.length);
				NET_OUT_SET_ALARMMODE stuOut2 = new NET_OUT_SET_ALARMMODE();
				if(INetSDK.SetAlarmRegionInfo(__LoginHandle, NET_EM_SET_ALARMREGION_INFO.NET_EM_SET_ALARMREGION_INFO_ARMMODE,stuIn2,stuOut2,5000)){
					ToolKits.writeLog("SetAlarmRegionInfo success.");
				} else {
					ToolKits.writeErrorLog("SetAlarmRegionInfo failed.");
				}
			} else {
				ToolKits.writeErrorLog("GetAlarmRegionInfo failed.");
			}
		}

	}

	public void  TestGetAlarmRegionAreaZones(){
		{
			NET_IN_GET_AREAZONES stuIn = new NET_IN_GET_AREAZONES();
			stuIn.nAreaNum = 1;
			for(int i = 0; i < stuIn.nAreaNum; i++){
				stuIn.arrArea[i] = i;
			}
			NET_OUT_GET_AREAZONES stuOut = new NET_OUT_GET_AREAZONES();
			if (INetSDK.GetAlarmRegionInfo(__LoginHandle, NET_EM_GET_ALARMREGION_INFO.NET_EM_GET_ALARMREGION_INFO_AREAZONES, stuIn, stuOut, 5000)) {
				ToolKits.writeLog("GetAlarmRegionInfo success.");
				ToolKits.writeLog("nAreaRet:" + stuOut.nAreaRet);
				for(int i = 0; i < stuOut.nAreaRet; i++){
					ToolKits.writeLog("nZoneRet:" + stuOut.stuAreaInfo[i].nZoneRet);
				}
			} else {
				ToolKits.writeErrorLog("GetAlarmRegionInfo failed.");
			}
		}

	}

	public void  TestGetAlarmRegionBypassMode(){
		{
			NET_IN_GET_BYPASSMODE stuIn = new NET_IN_GET_BYPASSMODE();
			stuIn.nZoneNum = 72;
			for(int i = 0; i < stuIn.nZoneNum; i++){
				stuIn.arrZones[i] = i + 1;
			}
			NET_OUT_GET_BYPASSMODE stuOut = new NET_OUT_GET_BYPASSMODE();
			if (INetSDK.GetAlarmRegionInfo(__LoginHandle, NET_EM_GET_ALARMREGION_INFO.NET_EM_GET_ALARMREGION_INFO_BYPASSMODE, stuIn, stuOut, 5000)) {
				ToolKits.writeLog("GetAlarmRegionInfo success.");
				ToolKits.writeLog("nAreaRet:" + stuOut.nZoneRet);
				for(int i = 0; i < stuOut.nZoneRet; i++){
					ToolKits.writeLog("nZoneRet:" + stuOut.arrModes[i]);
				}
			} else {
				ToolKits.writeErrorLog("GetAlarmRegionInfo failed.");
			}
		}

	}

	public void  TestGetAlarmRegionAreaStatus(){
		{
			NET_IN_GET_AREAS_STATUS stuIn = new NET_IN_GET_AREAS_STATUS();
			stuIn.emType = 1;

			NET_OUT_GET_AREAS_STATUS stuOut = new NET_OUT_GET_AREAS_STATUS();
			if (INetSDK.GetAlarmRegionInfo(__LoginHandle, NET_EM_GET_ALARMREGION_INFO.NET_EM_GET_ALARMREGION_INFO_AREASTATUS, stuIn, stuOut, 5000)) {
				ToolKits.writeLog("GetAlarmRegionInfo success.");
				ToolKits.writeLog("nAreaRet:" + stuOut.nAreaRet);
				for(int i = 0; i < stuOut.nAreaRet; i++){
					ToolKits.writeLog("nZoneRet:" + stuOut.stuAreaStatus[i].nZoneRet);
				}
			} else {
				ToolKits.writeErrorLog("GetAlarmRegionInfo failed.");
			}
		}

	}

	public void  TestGetAlarmRegionOutputState(){
		{
			NET_IN_GET_OUTPUT_STATE stuIn = new NET_IN_GET_OUTPUT_STATE();
			stuIn.emType = 1;

			NET_OUT_GET_OUTPUT_STATE stuOut = new NET_OUT_GET_OUTPUT_STATE();
			if (INetSDK.GetAlarmRegionInfo(__LoginHandle, NET_EM_GET_ALARMREGION_INFO.NET_EM_GET_ALARMREGION_INFO_OUTPUTSTATE, stuIn, stuOut, 5000)) {
				ToolKits.writeLog("GetAlarmRegionInfo success.");
				ToolKits.writeLog("nAreaRet:" + stuOut.nStateRet);
				for(int i = 0; i < stuOut.nStateRet; i++){
					ToolKits.writeLog("nZoneRet:" + stuOut.arrStates[i]);
				}
			} else {
				ToolKits.writeErrorLog("GetAlarmRegionInfo failed.");
			}
		}

	}
	// 设置探测器工作模式
	private void SetDetectorWorkMode(){
		NET_CTRL_LOWRATEWPAN_SETWORKMODE stuIn = new NET_CTRL_LOWRATEWPAN_SETWORKMODE();
		NET_CTRL_LOWRATEWPAN_REMOVEALL stuInRm = new NET_CTRL_LOWRATEWPAN_REMOVEALL();
		NET_CTRL_LOWRATEWPAN_ADD stuInAdd = new NET_CTRL_LOWRATEWPAN_ADD();
		stuIn.nMode = 1;

		boolean bResult = INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_LOWRATEWPAN_SETWORKMODE, stuIn, 5000);
	//	boolean bResult = INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_LOWRATEWPAN_REMOVEALL, stuInRm, 1000);
	//	boolean bResult = INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_LOWRATEWPAN_ADD, stuInAdd, 5000);
		if(bResult){
			ToolKits.showMessage(this, "set the Detector working mode successful..");
		}else{
			ToolKits.writeLog("Set the Detector working mode failed the error code is :"+(INetSDK.GetLastError()&0x7fffffff));
		}
	}

	// 开始异步文件上传
	private void StartUploadRemoteFile(){
		long lLoginHandle = __LoginHandle;
		long bRet = 0;

		// 文件上传
		SDK_IN_UPLOAD_REMOTE_FILE inUploadFile = new SDK_IN_UPLOAD_REMOTE_FILE();
		inUploadFile.pszFileDst = new String("test.bmp");
		inUploadFile.pszFolderDst = new String("/mnt/lv/SystemPrimaryNAS/PhotoNAS/admin");
		inUploadFile.pszFileSrc = new String("/mnt/sdcard/test.bmp");
		inUploadFile.nPacketLen = 1024*8;
		SDK_OUT_UPLOAD_REMOTE_FILE outUploadFile = new SDK_OUT_UPLOAD_REMOTE_FILE();

		bRet = INetSDK.StartUploadRemoteFile(lLoginHandle, inUploadFile, outUploadFile,new CB_fUploadFileCallBack(){

			@Override
			public void invoke(long lUploadFileHandler, int nTotalSize,
					int nSendSize, long dwUser) {
				ToolKits.writeLog("nTotalSize:"+nTotalSize+"; nSendSize:"+nSendSize);
			}

		});
		if (bRet>0) {
			ToolKits.writeLog("upload Remote ok");
		}else {
			ToolKits.writeErrorLog("upload Remote Error"+(INetSDK.GetLastError()&0x7fffffff));
			return;
		}
	}

	// 停止异步文件上传
	private void StopUploadRemoteFile(){
		boolean result = INetSDK.StopUploadRemoteFile(__LoginHandle);
		if(result){
			ToolKits.writeLog("stop successfully");
		}else{
			ToolKits.showErrorMessage(this, "Error");
			ToolKits.writeErrorLog("Stop Upload Remote File Error"+(INetSDK.GetLastError()&0x7fffffff));
		}
	}

	// 图像通道属性配置
	private void EncodeConfig(){
		CFG_ENCODE_INFO stEncInfo = new CFG_ENCODE_INFO();
		boolean zRetEnc = false;
		if (!zRetEnc) {
			zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_ENCODE,
					stEncInfo, __LoginHandle, 0,
					1024*1024);
			if (!zRetEnc) {
				ToolKits.showErrorMessage(this, "GetDevConfig failed, "
						+ FinalVar.CFG_CMD_ENCODE + ";Error:"+(INetSDK.GetLastError()&0x7fffffff));
			} else {
				zRetEnc = ToolKits.SetDevConfig(
						FinalVar.CFG_CMD_ENCODE, stEncInfo,
						__LoginHandle, 0, 1024*1024);
				if(!zRetEnc){
					ToolKits.showErrorMessage(this, "CFG_CMD_ENCODE failed");
				}else{
					ToolKits.writeLog("CFG_CMD_ENCODE successfully");
				}
			}
		}
	}

	// 定时录像配置
	public void RecordConfig() {
		CFG_RECORD_INFO stRecord = new CFG_RECORD_INFO();
		boolean zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_RECORD,stRecord, __LoginHandle, 0, 1024*1024);
		if(!zRetEnc) {
			ToolKits.showErrorMessage(this,"GetDevConfig failed, " + FinalVar.CFG_CMD_RECORD );
		} else {
			zRetEnc =ToolKits.SetDevConfig(FinalVar.CFG_CMD_RECORD, stRecord,__LoginHandle, 0, 1024*1024);
			if(!zRetEnc){
				ToolKits.showErrorMessage(this,"SetDevConfig failed, " + FinalVar.CFG_CMD_RECORD );
			}else{
				ToolKits.writeLog(FinalVar.CFG_CMD_RECORD +"  successfully");
			}
		}
	}

	// 网络存储服务器配置
	public void NASConfig() {
		CFG_NAS_INFO_EX stNAS = new CFG_NAS_INFO_EX();
		// 获取
		boolean zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_NASEX,stNAS, __LoginHandle, 0, 1024*1024);
		if(!zRetEnc) {
			ToolKits.showErrorMessage(this,"GetDevConfig failed, " + FinalVar.CFG_CMD_NASEX + "ErrorCode:"+(INetSDK.GetLastError()&0x7fffffff));
		} else {

			// 设置
			if(stNAS.nVersion == 0) {
				ToolKits.writeLog("nProtocol:" + stNAS.stuNasOld.nProtocol);
				stNAS.stuNasOld.nProtocol = 0; //FTP
			} else {
				if(stNAS.stuNasGroup.nNasNum > 0) {
					ToolKits.writeLog("nnProtocol:" + stNAS.stuNasGroup.stuNasInfo[0].nPortocol);
					stNAS.stuNasGroup.stuNasInfo[0].nPortocol = 0; // FTP ,只设置一个
				}
			}
			zRetEnc =ToolKits.SetDevConfig(FinalVar.CFG_CMD_NASEX, stNAS,__LoginHandle, 0, 1024*1024);
			if(zRetEnc){
				ToolKits.writeLog(FinalVar.CFG_CMD_NASEX +" is successfully");
				Toast.makeText(this, "Set NAS Succeed!", Toast.LENGTH_SHORT).show();;
			}else{
				ToolKits.showErrorMessage(this,"SetDevConfig failed, " + FinalVar.CFG_CMD_NASEX + "ErrorCode:"+(INetSDK.GetLastError()&0x7fffffff));
				Toast.makeText(this, "Set NAS failed!" + "ErrorCode:"+(INetSDK.GetLastError()&0x7fffffff), Toast.LENGTH_SHORT).show();;
			}
		}
	}

	// 录像存储点映射配置
	public void StoragePointConfig() {
		CFG_RECORDTOSTORAGEPOINT_INFO stRecStorage = new CFG_RECORDTOSTORAGEPOINT_INFO();
		// 获取
		boolean zRetEnc = ToolKits.GetDevConfig(FinalVar.CFG_CMD_RECORD_STORAGEPOINT,stRecStorage, __LoginHandle, 0, 1024*1024);
		if(!zRetEnc) {
			ToolKits.showErrorMessage(this,"GetDevConfig failed, " + FinalVar.CFG_CMD_RECORD_STORAGEPOINT + "ErrorCode:"+(INetSDK.GetLastError()&0x7fffffff));
		} else {
			// 设置
			for(int i = 0; i < stRecStorage.nStoragePointNum; i++) {
				if(stRecStorage.stStoragePoints[i].emStoragePointType ==  EM_STORAGEPOINT_TYPE.EM_STORAGE_TIMINGRECORD ||       // 定时录像存储点类型
					stRecStorage.stStoragePoints[i].emStoragePointType == EM_STORAGEPOINT_TYPE.EM_STORAGE_VIDEODETECTRECORD || // 视频检测录像存储点类型
					stRecStorage.stStoragePoints[i].emStoragePointType == EM_STORAGEPOINT_TYPE.EM_STORAGE_ALARMRECORD ) {       // 报警录像存储点类型

					ToolKits.writeLog("nLocalDir:" + stRecStorage.stStoragePoints[i].nLocalDir);
					ToolKits.writeLog("szRemoteDir : " + new String(stRecStorage.stStoragePoints[i].szRemoteDir).trim());

					// nLocalDir  0：关闭本地录像    1：打开本地录像
					if(stRecStorage.stStoragePoints[i].nLocalDir == 1) {
						// 关闭 Local
						stRecStorage.stStoragePoints[i].nLocalDir = 0;
					} else {
						// 打开 Local
						stRecStorage.stStoragePoints[i].nLocalDir = 1;
					}

					// szRemoteDir  ""：关闭NAS      不为空：打开NAS
					if(!new String(stRecStorage.stStoragePoints[i].szRemoteDir).trim().equals("")) {
						// 关闭 NAS
						ToolKits.StringToByteArray("", stRecStorage.stStoragePoints[i].szRemoteDir);
					} else {
						// 打开 NAS
						ToolKits.StringToByteArray("ddd", stRecStorage.stStoragePoints[i].szRemoteDir);
					}
				}
			}
			zRetEnc =ToolKits.SetDevConfig(FinalVar.CFG_CMD_RECORD_STORAGEPOINT, stRecStorage,__LoginHandle, 0, 1024*1024);
			if(zRetEnc){
				ToolKits.writeLog(FinalVar.CFG_CMD_RECORD_STORAGEPOINT +" is successfully");
			}else{
				ToolKits.showErrorMessage(this,"SetDevConfig failed, " + FinalVar.CFG_CMD_RECORD_STORAGEPOINT + "ErrorCode:"+(INetSDK.GetLastError()&0x7fffffff));
			}
		}
	}

	/**
	 * 开始/停止录像
	 */
	public void ControlRecord() {
		// 获取
		AV_CFG_RecordMode recordMode = new AV_CFG_RecordMode();
		int channel = 0; // 通道号

		boolean bRet = ToolKits. GetDevConfig(FinalVar.CFG_CMD_RECORDMODE,  recordMode,
											   __LoginHandle, channel, 1024*1024*2);
		if(bRet) {
			ToolKits.writeLog("通道[" + channel + "]的主码流录像模式：" + recordMode.nMode + "\n" +
							  "通道[" + channel + "]的辅码流录像模式：" + recordMode.nModeExtra1 + "\n");
		} else {
			ToolKits.writeErrorLog("GetRecordMode Failed!" );
		}

		// 设置，开始、关闭录像， 0-自动录像，1-手动录像，2-关闭录像
		if(recordMode.nMode == 0) {
			recordMode.nMode = 1;
			recordMode.nModeExtra1 = 1;
		} else {
			recordMode.nMode = 0;
			recordMode.nModeExtra1 = 0;
		}

		boolean zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_RECORDMODE, recordMode,
										      __LoginHandle, channel, 1024*1024*2);
		if(zRet) {
			ToolKits.writeLog("SetRecordMode Succeed!");
		} else {
			ToolKits.writeErrorLog("SetRecordMode Failed!" );
		}
	}

	// DMSS接入智能锁设置功率接口
	private void SetLowRateWPANPower(){
		NET_IN_SET_LOWRATEWPAN_POWER stuIn = new NET_IN_SET_LOWRATEWPAN_POWER();
		stuIn.nPower = 10;
		System.arraycopy("AXJ07ZNSZ000049 ".getBytes(), 0, stuIn.szSmartLockNum, 0, "AXJ07ZNSZ000049 ".getBytes().length);
		NET_OUT_SET_LOWRATE_WPAN_POWER stuOut = new NET_OUT_SET_LOWRATE_WPAN_POWER();
		ToolKits.writeLog("sn:"+new String(stuIn.szSmartLockNum));
		boolean result = INetSDK.SetLowRateWPANPower(__LoginHandle, stuIn, stuOut, 5000);
		if(result){
			ToolKits.writeLog("INetSDK.SetLowRateWPANPower  Success! ");
		}else{
			int ErrorCode = INetSDK.GetLastError();
			ToolKits.writeErrorLog("INetSDK.SetLowRateWPANPower Failed the ErrorCode is "+(ErrorCode&0x7fffffff));
		}
	}

	private void QueryAccessoryStatus()
	{
		NET_GET_ACCESSORY_STATUS stuIn = new NET_GET_ACCESSORY_STATUS();
		NET_PTZ_PRESET_LIST ptzPreset1 = new NET_PTZ_PRESET_LIST(5);   // 5为初始化预置点列表数组
		//boolean bRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_EXALARMCHANNELS, ptzPreset1, 5000);
		boolean bRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_GET_ACCESSORY_STATUS, stuIn, 5000);
		if (bRet) {
			//public int nSNNum;
			//public byte[][] szSN = new byte[56][32];
			//public int nStatusNum;
			//public NET_STATUS_INFO[] stStatusInfo = new NET_STATUS_INFO[56];
			ToolKits.writeLog("QueryDevState_ACCESSORY_STATUS ok..");
			ToolKits.writeLog("nSNNum:" + stuIn.nSNNum + "nStatusNum:" + stuIn.nStatusNum);
		}
		else {
			ToolKits.writeLog("QueryDevState_ACCESSORY_STATUS failed..");
		}
	}
	private void CommunicationList()
	{
		int type = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_NETAPP_COMMUNICATION_LIST;
		NET_NETAPP_COMMUNICATION_LIST_CFG radarConfig = new NET_NETAPP_COMMUNICATION_LIST_CFG();

		// 获取
		if(INetSDK.GetConfig(__LoginHandle, type, -1, radarConfig, 5000, null)) {
			ToolKits.writeLog("nConmmunicationListNum：" + radarConfig.nConmmunicationListNum);
			for (int i = 0; i < radarConfig.nConmmunicationListNum; i++)
			{
				ToolKits.writeLog("szGroupName：" + new String(radarConfig.stuCommunication[i].szGroupName).trim());
				ToolKits.writeLog("nMembersNum：" + radarConfig.stuCommunication[i].nMembersNum);
				for (int j = 0; j < radarConfig.stuCommunication[i].nMembersNum; j++)
				{
					ToolKits.writeLog("szName：" + new String(radarConfig.stuCommunication[i].arrMembers[j].szName).trim());
					ToolKits.writeLog("szMobile：" + new String(radarConfig.stuCommunication[i].arrMembers[j].szMobile).trim());
					ToolKits.writeLog("szEmail：" + new String(radarConfig.stuCommunication[i].arrMembers[j].szEmail).trim());
					ToolKits.writeLog("szOrganization：" + new String(radarConfig.stuCommunication[i].arrMembers[j].szOrganization).trim());
				}
				{
					ToolKits.writeLog("emType：" + radarConfig.stuCommunication[i].stuNotifyInfo.emType);
					ToolKits.writeLog("bAlarmEvents：" + radarConfig.stuCommunication[i].stuNotifyInfo.bAlarmEvents);
					ToolKits.writeLog("bSystemEvents：" + radarConfig.stuCommunication[i].stuNotifyInfo.bSystemEvents);
					ToolKits.writeLog("bOperationEvents：" + radarConfig.stuCommunication[i].stuNotifyInfo.bOperationEvents);
				}
			}

			// 设置
			//radarConfig.bEnable = true;
			//radarConfig.bDahuaRadarEnable = true;
			//radarConfig.stuDhRadarConfig.nDetectMode = 1;
			if(INetSDK.SetConfig(__LoginHandle, type, -1, radarConfig, 5000, null, null)) {
				ToolKits.writeLog("CommunicationList SetConfig Succeed!");
			}
			else
			{
				ToolKits.writeLog("CommunicationList SetConfig failed!");
			}
		}
		else
		{
			ToolKits.writeLog("CommunicationList GetConfig failed!");
		}

	}
	// 智能锁修改用户信息
	private void SetSmartLockUsername(){
		NET_IN_SET_SMART_LOCK_USERNAME inParam = new NET_IN_SET_SMART_LOCK_USERNAME();
		System.arraycopy("1234567".getBytes(), 0, inParam.szName, 0, "1234567".getBytes().length);
		System.arraycopy("AXJ07ZNS123456B".getBytes(), 0, inParam.szSerialNumber, 0, "AXJ07ZNS123456B".getBytes().length);
		inParam.emType = 2;
		System.arraycopy("2".getBytes(), 0, inParam.szUserID, 0, "2".getBytes().length);
		NET_OUT_SET_SMART_LOCK_USERNAME outParam = new NET_OUT_SET_SMART_LOCK_USERNAME();
		boolean result = INetSDK.SetSmartLockUsername(__LoginHandle,inParam,outParam,3000);
		if(result){
			ToolKits.writeLog("SetSmartLockUsername ok..");
		}else{
			ToolKits.writeLog("SetSmartLockUsername failed:"+(INetSDK.GetLastError()&0x7fffffff));
		}
	}

	// 获取当前智能锁的注册用户信息
	public void GetSmartLockRegisterInfo() {
		NET_IN_GET_SMART_LOCK_REGISTER_INFO in_param_get = new NET_IN_GET_SMART_LOCK_REGISTER_INFO();
		in_param_get.nOffset = 0;
		System.arraycopy("AXJ07ZNS123456B".getBytes(), 0, in_param_get.szSerialNumber, 0, "AXJ07ZNS123456B".getBytes().length);
		NET_OUT_GET_SMART_LOCK_REGISTER_INFO out_get_param = new NET_OUT_GET_SMART_LOCK_REGISTER_INFO();
		boolean get = INetSDK.GetSmartLockRegisterInfo(__LoginHandle, in_param_get, out_get_param, 5000);
		if(get){
			ToolKits.writeLog("GetSmartLockRegisterInfo returnCount:"+out_get_param.nReturnCount+";totalCount:"+out_get_param.nTotalCount);
			String temp = "";
			for(int i=0;i<out_get_param.stuRegisterInfo.length;i++){
				temp+= new String((out_get_param.stuRegisterInfo[i].szName))+"  ;";
			}
			ToolKits.writeLog(temp);
		}else{
			ToolKits.writeErrorLog("GetSmartLockRegisterInfo failed:"+(INetSDK.GetLastError()&0x7fffffff));
		}
	}

	// 设备本地升级
	long lUpgradeID = 0;
	public void Upgrade() {
		int emType = EM_UPGRADE_TYPE.SDK_UPGRADE_BIOS_TYPE;
		String pchFileName = "/mnt/sdcard/NetSDK/DH_NVR2XHC-HDS2_Chn_V3.216.0000000.0.R.180831.bin";
		// 开始升级设备程序
		lUpgradeID = INetSDK.StartUpgradeEx(__LoginHandle, emType, pchFileName, cbUpgrade);
		if(lUpgradeID == 0) {
			ToolKits.writeErrorLog("StartUpgradeEx Failed!" );
		} else {
			// 发送数据
			if(INetSDK.SendUpgrade(lUpgradeID)) {
				ToolKits.writeLog("SendUpgrade Succeed!");
			} else {
				ToolKits.writeErrorLog("SendUpgrade Failed!" );
			}
		}
	}

	TestUpgradeCallBack cbUpgrade = new TestUpgradeCallBack();

    // nTotalSize = 0, nSendSize = -1 表示升级完成
    // nTotalSize = 0, nSendSize = -2 表示升级出错
    // nTotalSize = 0, nSendSize = -3 用户没有权限升级
    // nTotalSize = -1, nSendSize = XX 表示升级进度
    // nTotalSize = XX, nSendSize = XX 表示升级文件发送进度
	private class TestUpgradeCallBack implements CB_fUpgradeCallBack {
		@Override
		public void invoke(long lLoginID, long lUpgradeChannel, int nTotalSize,
				int nSendSize) {
			ToolKits.writeLog("nTotalSize : " + nTotalSize + " nSendSize : " + nSendSize);
			if(nTotalSize == 0) { // 知道确切结果则停止
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        INetSDK.StopUpgrade(lUpgradeID);
                    }
                }).start();
			}
		}
	}

	// 查询设备通道名称
	public void QueryChannelName() {
		boolean bRet = false;
		byte name[] = new byte[16 * 32];
		Integer stRet = new Integer(0);
		if(INetSDK.QueryChannelName(__LoginHandle, name, stRet, 1000)) {
			for(int i = 0; i < stRet.intValue(); i++) {
				ToolKits.writeLog("name" + new String(name).trim());
			}
		}else{
			ToolKits.writeErrorLog("QueryChannelName failed");
		}
	}

	// 获取密码规范，不用登陆设备
	public void GetPwdSpecification() {
		boolean bRet = false;
		NET_IN_PWD_SPECI inPwdSpeci = new NET_IN_PWD_SPECI();
		String mac = "90:02:91:45:99:99";
		System.arraycopy(mac.getBytes(), 0, inPwdSpeci.szMac, 0, mac.getBytes().length);

		NET_OUT_PWD_SPECI outPwdSpeci = new NET_OUT_PWD_SPECI();
		bRet = INetSDK.GetPwdSpecification(inPwdSpeci, outPwdSpeci, 10000, null);
		if(bRet) {
			ToolKits.writeLog("nMaxPwdLen : " + outPwdSpeci.nMaxPwdLen);
			ToolKits.writeLog("nMinPwdLen : " + outPwdSpeci.nMinPwdLen);
			ToolKits.writeLog("nCombine : " + outPwdSpeci.nCombine);
			ToolKits.writeLog("szType : " + new String(outPwdSpeci.szType).trim());
			ToolKits.writeLog("szCharList : " + new String(outPwdSpeci.szCharList).trim());
		} else {
			ToolKits.writeErrorLog("GetPwdSpecification Failed!" );
		}
	}

	// 图像旋转设置能力
	public void ImageControlCaps() {
		boolean bRet = false;
		int ntype = FinalVar.NET_VIDEO_IMAGECONTROL_CAPS;
		NET_IN_VIDEO_IMAGECONTROL_CAPS inImageCaps = new NET_IN_VIDEO_IMAGECONTROL_CAPS();
		inImageCaps.nChannel = 0;
		NET_OUT_VIDEO_IMAGECONTROL_CAPS outImageCaps = new NET_OUT_VIDEO_IMAGECONTROL_CAPS();
		bRet = INetSDK.GetDevCaps(__LoginHandle, ntype, inImageCaps, outImageCaps, 5000);
		if(bRet) {
			ToolKits.writeLog("bSupport : " + outImageCaps.bSupport);
			ToolKits.writeLog("bMirror : " + outImageCaps.bMirror);
			ToolKits.writeLog("bFlip : " + outImageCaps.bFlip);
			ToolKits.writeLog("bRotate90 : " + outImageCaps.bRotate90);
			ToolKits.writeLog("bFreeze : " + outImageCaps.bFreeze);
			ToolKits.writeLog("emStable : " + outImageCaps.emStable);

		} else {
			ToolKits.writeErrorLog("GetDevCaps Failed!" );
		}
	}

	// 用户管理能力
	public void GetUserManageCaps() {
		boolean bRet = false;
		int nType = FinalVar.NET_USER_MNG_CAPS;
		NET_IN_USER_MNG_GETCAPS inUserMng = new NET_IN_USER_MNG_GETCAPS();
		NET_OUT_USER_MNG_GETCAPS outUserMng = new NET_OUT_USER_MNG_GETCAPS();
		bRet = INetSDK.GetDevCaps(__LoginHandle, nType, inUserMng, outUserMng, 5000);
		if(bRet) {
			ToolKits.writeLog("bAccountLimitation : " + outUserMng.bAccountLimitation);
			ToolKits.writeLog("bIndividualAccessFilter : " + outUserMng.bIndividualAccessFilter);
			ToolKits.writeLog("dwMaxPageSize : " + outUserMng.dwMaxPageSize);
			ToolKits.writeLog("nMaxPwdLen : " + outUserMng.nMaxPwdLen);
			ToolKits.writeLog("nMinPwdLen : " + outUserMng.nMinPwdLen);
			ToolKits.writeLog("nCombine : " + outUserMng.nCombine);
			ToolKits.writeLog("szType : " + new String(outUserMng.szType).trim());
			ToolKits.writeLog("szCharList : " + new String(outUserMng.szCharList).trim());
		} else {
			ToolKits.writeErrorLog("GetDevCaps Failed!" );
		}
	}

	// 雷达配置
	public void RadarConfig() {
		int type = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_RADAR;
		DEV_RADAR_CONFIG radarConfig = new DEV_RADAR_CONFIG();

		// 获取
		if(INetSDK.GetConfig(__LoginHandle, type, 0, radarConfig, 5000, null)) {
			ToolKits.writeLog("雷达使能：" + radarConfig.bEnable);
			ToolKits.writeLog("雷达使能：" + radarConfig.bDahuaRadarEnable);
			ToolKits.writeLog("雷达方向：" + radarConfig.stuDhRadarConfig.nDetectMode);

			// 设置
			radarConfig.bEnable = true;
			radarConfig.bDahuaRadarEnable = true;
			radarConfig.stuDhRadarConfig.nDetectMode = 1;
			if(INetSDK.SetConfig(__LoginHandle, type, 0, radarConfig, 5000, null, null)) {
				ToolKits.writeLog("SetConfig Succeed!");
			}
		}
	}

	// 智能交通抓拍配置
	public void TrafficSnapshotConfig() {
		//限速、OSD信息获取/配置
		CFG_TRAFFICSNAPSHOT_INFO trafficshot = new CFG_TRAFFICSNAPSHOT_INFO();

		//获取
		if(ToolKits.GetDevConfig(FinalVar.CFG_CMD_INTELLECTIVETRAFFIC, trafficshot, __LoginHandle, 0, 1024*1024)) {
			ToolKits.writeLog("大小车限速是否有效 ： " + trafficshot.arstDetector[0].bSpeedLimitForSize);
			ToolKits.writeLog("小型车限速值 ： " + trafficshot.arstDetector[0].arnSmallCarSpeedLimit[0] + " / " +
					trafficshot.arstDetector[0].arnSmallCarSpeedLimit[1]);  //arstDetector下标是通道
			ToolKits.writeLog("大型车限速值 ： " + trafficshot.arstDetector[0].arnBigCarSpeedLimit[0] + " / " +
					trafficshot.arstDetector[0].arnBigCarSpeedLimit[1]);  //arstDetector下标是通道

			ToolKits.writeLog("OSD方案内容 : " + trafficshot.stOSD.nOSDContentScheme);
			ToolKits.writeLog("OSD叠加内容自定义排序个数 : " + trafficshot.stOSD.nOSDCustomSortNum);
			for(int i=0; i<trafficshot.stOSD.nOSDCustomSortNum; i++) {
				ToolKits.writeLog("具体叠加元素个数 : " + trafficshot.stOSD.stOSDCustomSorts[i].nElementNum);
				for(int j=0; j<trafficshot.stOSD.stOSDCustomSorts[i].nElementNum; j++) {
					ToolKits.writeLog("名称类型 : " + trafficshot.stOSD.stOSDCustomSorts[i].stElements[j].nNameType);
					ToolKits.writeLog("配置项名称 : " + trafficshot.stOSD.stOSDCustomSorts[i].stElements[j].szName);
				}
			}

			// 配置
			///////限速
			trafficshot.arstDetector[0].bSpeedLimitForSize = true;
			trafficshot.arstDetector[0].arnSmallCarSpeedLimit[0] = 0;
			trafficshot.arstDetector[0].arnSmallCarSpeedLimit[1] = 55;

			//////OSD信息叠加
			trafficshot.stOSD.nOSDCustomSortNum = 1;
			trafficshot.stOSD.stOSDCustomSorts[0].nElementNum = 1;

			///当nOSDContentScheme = 2; 且 nNameType = 0时，叠加信息才有效
			trafficshot.stOSD.nOSDContentScheme = 2; //0=未知, 1=Mask , 2=CustomizeSort
			trafficshot.stOSD.stOSDCustomSorts[0].stElements[0].nNameType = 0;
			String name = "%28"; //[时间日期:%年%月%日%时%分%秒]、[违法代码:%18]、[车牌号码:%09]、[道路方向:%64]、[道路代码:%68]、[车速:%05]、[车牌颜色:%58]、[设备编号:%28]、[欠速比:%66]、[车型:%34]、[车道号:%04]、[防伪码:%41]、[限速:%06]、[车身颜色:%12]、[鉴定证书编号:%42]、[通用自定义:%54]、[车道自定义:%55]
			System.arraycopy(name.getBytes(), 0, trafficshot.stOSD.stOSDCustomSorts[0].stElements[0].szName, 0, name.getBytes().length);  //用于设置叠加信息

			if(ToolKits.SetDevConfig(FinalVar.CFG_CMD_INTELLECTIVETRAFFIC, trafficshot, __LoginHandle, 0, 1024*1024)) {
				ToolKits.writeLog("SetDevConfig Succeed!");
			} else {
				ToolKits.writeErrorLog("SetDevConfig Failed!");
			}
		} else {
			ToolKits.writeErrorLog("GetDevConfig Failed!");
		}
	}

	// 智能交通全局配置（禁止名单使能）
	public void TrafficGlobalConfig() {
		///////////启用禁止名单////////////
		CFG_TRAFFICGLOBAL_INFO trafficglobal = new CFG_TRAFFICGLOBAL_INFO();
		//获取
		if(ToolKits.GetDevConfig(FinalVar.CFG_CMD_TRAFFICGLOBAL, trafficglobal, __LoginHandle, 0, 1024*1024)) {
			ToolKits.writeLog("禁止名单使能 : " + trafficglobal.bEnableBlackList);

			//设置
			trafficglobal.abEnableBlackList = true;
			trafficglobal.bEnableBlackList = true;
			if(ToolKits.SetDevConfig(FinalVar.CFG_CMD_TRAFFICGLOBAL, trafficglobal, __LoginHandle, 0, 1024*1024)) {
				ToolKits.writeLog("SetDevConfig Succeed!");
			} else {
				ToolKits.writeErrorLog("SetDevConfig Failed!");
			}
		} else {
			ToolKits.writeErrorLog("GetDevConfig Failed!");
		}
	}

	/**
	 * 交通允许名单查询(精确查找)、删除、修改
	 */
	public void FindRecordTrafficRedList() {
		///////////////允许名单查找、删除、修改//////////
		//精确查询,只能根据车牌查找一个
		int nNo = 0;
		FIND_RECORD_TRAFFICREDLIST_CONDITION recordcondition = new FIND_RECORD_TRAFFICREDLIST_CONDITION();  //条件
		String plateNumber = "京a";
		ToolKits.StringToByteArray(plateNumber, recordcondition.szPlateNumber);

		NET_IN_FIND_RECORD_PARAM infindRecord = new NET_IN_FIND_RECORD_PARAM();
		infindRecord.emType = EM_NET_RECORD_TYPE.NET_RECORD_TRAFFICREDLIST;
		infindRecord.pQueryCondition = recordcondition;
		NET_OUT_FIND_RECORD_PARAM outfindRecord = new NET_OUT_FIND_RECORD_PARAM();
		if(INetSDK.FindRecord(__LoginHandle, infindRecord, outfindRecord, 5000)) {
			int nCount = 1;
			NET_IN_FIND_NEXT_RECORD_PARAM infindNextRecord = new NET_IN_FIND_NEXT_RECORD_PARAM();
			infindNextRecord.lFindeHandle = outfindRecord.lFindeHandle;
			infindNextRecord.nFileCount = nCount;
			infindNextRecord.emType = EM_NET_RECORD_TYPE.NET_RECORD_TRAFFICREDLIST;

			NET_TRAFFIC_LIST_RECORD[] listRecord = new NET_TRAFFIC_LIST_RECORD[1];
			listRecord[0] = new NET_TRAFFIC_LIST_RECORD();

			NET_OUT_FIND_NEXT_RECORD_PARAM outfindNextRecord = new NET_OUT_FIND_NEXT_RECORD_PARAM();
			outfindNextRecord.nMaxRecordNum = nCount;
			outfindNextRecord.pRecordList = listRecord;

			int retCount = INetSDK.FindNextRecord(infindNextRecord, outfindNextRecord, 5000);
			if(retCount != 0) {
				ToolKits.writeLog("查到的个数：" + outfindNextRecord.nRetRecordNum);

				ToolKits.writeLog("查询到的记录号 : " + listRecord[0].nRecordNo);
				ToolKits.writeLog("车主姓名 : " + new String(listRecord[0].szMasterOfCar).trim());
				ToolKits.writeLog("车牌号 : " + new String(listRecord[0].szPlateNumber).trim());
				ToolKits.writeLog("布控类型 : " + listRecord[0].emControlType);

				nNo = listRecord[0].nRecordNo;


				///////////修改,需要通过精确查询查找记录号///////////
				NET_UPDATE_RECORD_INFO updateRecord = new NET_UPDATE_RECORD_INFO();
				updateRecord.pRecordInfo = listRecord[0];
				updateRecord.pRecordInfo.nRecordNo = nNo;  //之前查询到的记录号
				String sMasterCar = "22"; //车主姓名
				System.arraycopy(sMasterCar.getBytes(), 0, updateRecord.pRecordInfo.szMasterOfCar, 0, sMasterCar.getBytes().length);

				NET_IN_OPERATE_TRAFFIC_LIST_RECORD inOperateList1 = new NET_IN_OPERATE_TRAFFIC_LIST_RECORD();
				inOperateList1.emOperateType = EM_RECORD_OPERATE_TYPE.NET_TRAFFIC_LIST_UPDATE;
				inOperateList1.emRecordType = EM_NET_RECORD_TYPE.NET_RECORD_TRAFFICREDLIST;
				inOperateList1.pstOpreateInfo = updateRecord;
				NET_OUT_OPERATE_TRAFFIC_LIST_RECORD outOperateList1 = new NET_OUT_OPERATE_TRAFFIC_LIST_RECORD();
				if(INetSDK.OperateTrafficList(__LoginHandle, inOperateList1, outOperateList1, 5000)) {
					ToolKits.writeLog("UpdateRecord Succeed!");
				} else {
					ToolKits.writeErrorLog("UpdateRecord Failed!" );
				}

			} else {
				ToolKits.writeErrorLog("FindNextRecord Failed!" );
			}
		} else {
			ToolKits.writeErrorLog("FindRecord Failed!" );
		}

		INetSDK.FindRecordClose(outfindRecord.lFindeHandle);

		try {
			sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		///////////删除,需要通过精确查询查找记录号//////////
		NET_REMOVE_RECORD_INFO removeRecord = new NET_REMOVE_RECORD_INFO();
		removeRecord.nRecordNo = nNo;  //之前查询到的记录号

		NET_IN_OPERATE_TRAFFIC_LIST_RECORD inOperateList = new NET_IN_OPERATE_TRAFFIC_LIST_RECORD();
		inOperateList.emOperateType = EM_RECORD_OPERATE_TYPE.NET_TRAFFIC_LIST_REMOVE;
		inOperateList.emRecordType = EM_NET_RECORD_TYPE.NET_RECORD_TRAFFICREDLIST;
		inOperateList.pstOpreateInfo = removeRecord;
		NET_OUT_OPERATE_TRAFFIC_LIST_RECORD outOperateList = new NET_OUT_OPERATE_TRAFFIC_LIST_RECORD();
		if(INetSDK.OperateTrafficList(__LoginHandle, inOperateList, outOperateList, 5000)) {
			ToolKits.writeLog("RemoveRecord Succeed!");
		} else {
			ToolKits.writeErrorLog("RemoveRecord Failed!" );
		}

		//模糊查询，可以查询所有信息
		FindRecordTrafficRedListVague();
	}

	// 交通允许名单账户记录(模糊查询)
	public void  FindRecordTrafficRedListVague() {
		//模糊查询，可以查询所有信息
		FIND_RECORD_TRAFFICREDLIST_CONDITION recordcondition = new FIND_RECORD_TRAFFICREDLIST_CONDITION();  //条件
		String plateNumber = "";
		ToolKits.StringToByteArray(plateNumber, recordcondition.szPlateNumberVague);

		NET_IN_FIND_RECORD_PARAM infindRecord = new NET_IN_FIND_RECORD_PARAM();
		infindRecord.emType = EM_NET_RECORD_TYPE.NET_RECORD_TRAFFICREDLIST;
		infindRecord.pQueryCondition = recordcondition;
		NET_OUT_FIND_RECORD_PARAM outfindRecord = new NET_OUT_FIND_RECORD_PARAM();
		if(INetSDK.FindRecord(__LoginHandle, infindRecord, outfindRecord, 5000)) {
			int doNextCount = 0;
			int item = 0;
			while(true) {
				int nCount = 10;
				NET_IN_FIND_NEXT_RECORD_PARAM infindNextRecord = new NET_IN_FIND_NEXT_RECORD_PARAM();
				infindNextRecord.lFindeHandle = outfindRecord.lFindeHandle;
				infindNextRecord.nFileCount = nCount;
				infindNextRecord.emType = EM_NET_RECORD_TYPE.NET_RECORD_TRAFFICREDLIST;

				NET_TRAFFIC_LIST_RECORD[] listRecord = new NET_TRAFFIC_LIST_RECORD[200];   //数组大小，代表可以查询的记录信息最大值
				for(int m=0; m<200; m++) {
					listRecord[m] = new NET_TRAFFIC_LIST_RECORD();
				}

				NET_OUT_FIND_NEXT_RECORD_PARAM outfindNextRecord = new NET_OUT_FIND_NEXT_RECORD_PARAM();
				outfindNextRecord.nMaxRecordNum = nCount;
				outfindNextRecord.pRecordList = listRecord;

				int retCount = INetSDK.FindNextRecord(infindNextRecord, outfindNextRecord, 5000);
				if(retCount != 0) {
					ToolKits.writeLog("查到的个数：" + outfindNextRecord.nRetRecordNum);
					for(int i=0; i<outfindNextRecord.nRetRecordNum; i++) {

						item = i + doNextCount * nCount;
						ToolKits.writeLog("[" + item + "] 查询到的记录号 : " + listRecord[i].nRecordNo);
						ToolKits.writeLog("[" + item + "] 车主姓名 : " + new String(listRecord[i].szMasterOfCar).trim());
						ToolKits.writeLog("[" + item + "] 车牌号 : " + new String(listRecord[i].szPlateNumber).trim());
						ToolKits.writeLog("[" + item + "] 布控类型 : " + listRecord[i].emControlType);
					}

					if(outfindNextRecord.nRetRecordNum < nCount) {
						break;
					} else {
						doNextCount++;
					}

				} else {
					ToolKits.writeErrorLog("FindNextRecord Failed!" );
					break;
				}
			}
			ToolKits.writeLog("查询到的总个数：" + (item + 1));
		} else {
			ToolKits.writeErrorLog("FindRecord Failed!" );
		}

		INetSDK.FindRecordClose(outfindRecord.lFindeHandle);
	}

	// 按设备信息添加显示源
	private void MatrixAddCamerasByDevice(){
		SDK_IN_ADD_LOGIC_BYDEVICE_CAMERA   inParam = new SDK_IN_ADD_LOGIC_BYDEVICE_CAMERA(3);
		String temp = "DH12345678910";
		System.arraycopy(temp.getBytes(), 0, inParam.pszDeviceID, 0, temp.getBytes().length);
		for(int i=0;i<inParam.nCameraCount;i++){
			inParam.pCameras[i].nChannel = i+10;
			inParam.pCameras[i].nUniqueChannel = i+13;
		}
		SDK_OUT_ADD_LOGIC_BYDEVICE_CAMERA  outParam = new SDK_OUT_ADD_LOGIC_BYDEVICE_CAMERA(2);
		boolean result = INetSDK.MatrixAddCamerasByDevice(__LoginHandle,
								inParam,outParam, 4000);
		if(result){
			ToolKits.writeLog("out.nRetResultCount:"+outParam.nRetResultCount+";DeviceID:"+new String(outParam.szDeviceID)+"nUniqueChannel:"+
		outParam.pResults[0].nUniqueChannel+";failedCode:"+outParam.pResults[0].nFailedCode+";failedCode:"+outParam.pResults[1].nFailedCode);
			ToolKits.writeLog("successfully");
		}else{
			ToolKits.writeErrorLog("MatrixAddCameras Failed!" + (INetSDK.GetLastError()&0x7fffffff));
		}
	}

	// 音频输入音量
	private void AudioInputVolumeConfig() {
		CFG_AUDIO_INPUT_VOLUME inputVolume = new CFG_AUDIO_INPUT_VOLUME();

		// 获取
		boolean result = ToolKits.GetDevConfig(FinalVar.CFG_CMD_AUDIO_INPUT_VOLUME,
				inputVolume, __LoginHandle, -1, 1024*1024);
		if (result) {
			ToolKits.writeLog("nAudioInputCount:"+inputVolume.nAudioInputCount);
			for(int i=0;i<inputVolume.szAudioInputVolume.length;i++){
				ToolKits.writeLog("inputVolume:"+(inputVolume.szAudioInputVolume[i]&0xFF));
			}

			// 设置
			result = false;
			result = ToolKits.SetDevConfig(FinalVar.CFG_CMD_AUDIO_INPUT_VOLUME,
				inputVolume, __LoginHandle, -1, 1024*1024);
			if(result){
				ToolKits.writeLog("Set inputVolume Config Successfully");
			}else{
				ToolKits.writeErrorLog("Set inputVolume Config failed");
			}
		}else{
			ToolKits.writeErrorLog("Get inputVolume Config failed");
		}

	}

	// 音频输出音量
	public void AudioOutputVolumeConfig() {
		CFG_AUDIO_OUTPUT_VOLUME outputVolume = new CFG_AUDIO_OUTPUT_VOLUME();

		// 获取
		boolean result = ToolKits.GetDevConfig(FinalVar.CFG_CMD_AUDIO_OUTPUT_VOLUME,
				outputVolume, __LoginHandle, -1, 1024*1024);
		if (result) {
			ToolKits.writeLog("nAudioOutputCount:"+outputVolume.nAudioOutputCount);
			for(int i=0;i<outputVolume.szAudioOutputVolume.length;i++){
				ToolKits.writeLog("outputVolume:"+(outputVolume.szAudioOutputVolume[i]&0xFF));
			}

			// 设置
			result = false;
			result = ToolKits.SetDevConfig(FinalVar.CFG_CMD_AUDIO_OUTPUT_VOLUME,
					outputVolume, __LoginHandle, -1, 1024*1024);
			if(result){
				ToolKits.writeLog("Set outputVolume Config Successfully");
			}else{
				ToolKits.writeErrorLog("Set outputVolume Config failed");
			}
		}else{
			ToolKits.writeErrorLog("Get outputVolume Config failed");
		}
	}

	public class Test_fAttachDeviceDiscoveryCB implements CB_fAttachDeviceDiscoveryCB {
		@Override
		public void invoke(long lAttachHandle,
				NET_DEVICE_DISCOVERY_INFO pDeviceInfo, int nDeviceNum) {
			for(int i = 0; i < nDeviceNum; i++) {
				ToolKits.writeLog("-----szMachineName :" + new String(pDeviceInfo.szMachineName).trim() + "\n" +
						"szDeviceClass :" + new String(pDeviceInfo.szDeviceClass).trim() + "\n" +
						"szDeviceType :" + new String(pDeviceInfo.szDeviceType).trim() + "\n" +
						"szSerialNo :" + new String(pDeviceInfo.szSerialNo).trim() + "\n" +
						"szVersion :" + new String(pDeviceInfo.szVersion).trim() + "\n" +
						"szMac :" + new String(pDeviceInfo.szMac).trim() + "\n" +
						"szVendor :" + new String(pDeviceInfo.szVendor).trim() + "\n" +
						"szIPv4Address :" + new String(pDeviceInfo.szIPv4Address).trim() + "\n" +
						"szProtocol :" + new String(pDeviceInfo.szProtocol).trim() + "\n");
			}
		}
	}
	Test_fAttachDeviceDiscoveryCB cbNotify = new Test_fAttachDeviceDiscoveryCB();

	long lDeviceDiscoveryHandle = 0;

	// 注册设备搜索（三代搜索协议）
	public void AttachDeviceDiscovery() {
		NET_IN_ATTACH_DEVICE_DISCOVERY pInAttach = new NET_IN_ATTACH_DEVICE_DISCOVERY();
		pInAttach.emSubClassID = EM_NET_DEVICE_DISCOVERY_SUBCLASSID_TYPE.EM_NET_DEVICE_DISCOVERY_SUBCLASSID_TYPE_ONVIF;
		NET_OUT_ATTACH_DEVICE_DISCOVERY pOutAttach = new NET_OUT_ATTACH_DEVICE_DISCOVERY();
		lDeviceDiscoveryHandle = INetSDK.AttachDeviceDiscovery(__LoginHandle, pInAttach, pOutAttach, cbNotify, 5000);
		if(lDeviceDiscoveryHandle != 0) {
			ToolKits.writeLog("-----AttachDeviceDiscovery Succeed!");
		} else {
			ToolKits.writeErrorLog("-----AttachDeviceDiscovery Failed!" );
		}
	}


	// 根据事件查询录像
	void FindFileEx_byEvent(){
		boolean bRet = false;
		// 获取标记录像信息
		NET_IN_MEDIA_QUERY_FILE infile = new NET_IN_MEDIA_QUERY_FILE();
		infile.stuStartTime.dwYear = 2020;
		infile.stuStartTime.dwMonth = 4;
		infile.stuStartTime.dwDay = 5;
		infile.stuStartTime.dwHour = 0;
		infile.stuStartTime.dwMinute = 45;
		infile.stuStartTime.dwSecond = 22;

		infile.stuEndTime.dwYear = 2020;
		infile.stuEndTime.dwMonth = 4;
		infile.stuEndTime.dwDay = 5;
		infile.stuEndTime.dwHour = 11;
		infile.stuEndTime.dwMinute = 48;
		infile.stuEndTime.dwSecond = 32;

		infile.szDirs = "";
		infile.nMediaType = 2;
		infile.nChannelID = 2;
		infile.byVideoStream = 1;
		infile.nEventCount = 1; //查询事件数量
		infile.nEventLists[0] = EVENT_IVS_CROSSLINEDETECTION;

		long lFindHandle = INetSDK.FindFileEx(__LoginHandle, EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FILE_EX, infile, 30000);
		if(lFindHandle != 0){
			ToolKits.writeLog("FindFileEx Succeed!");
		} else {
			ToolKits.writeErrorLog("FindFileEx Failed!" );
		}

		NET_OUT_MEDIA_QUERY_FILE[] outfile = new NET_OUT_MEDIA_QUERY_FILE[10];
		for (int i = 0; i < 10; i++) {
			outfile[i] = new NET_OUT_MEDIA_QUERY_FILE();
		}

		int nCount = 0;
		int nMaxCount = 10;
		int nRetCount = 0;
		while(true) {
			nRetCount = INetSDK.FindNextFileEx(lFindHandle, nMaxCount, outfile, 10000);
			if(nRetCount <= 0) {
				ToolKits.writeErrorLog("FindNextFileEx Failed!" );
				return;
			}

			for(int i = 0; i < nRetCount; i++){
				ToolKits.writeLog("---------------[ " + (i + nMaxCount * nCount) +"] -----------------");
				ToolKits.writeLog("文件路径：" + new String(outfile[i].szFilePath).trim());
				ToolKits.writeLog("文件类型:" + outfile[i].byFileType);

				ToolKits.writeLog("事件总数：" + outfile[i].nEventCount);
				for(int j=0; j<outfile[i].nEventCount; j++){
					ToolKits.writeLog("事件：" + outfile[i].nEventLists[j]);
				}

				ToolKits.writeLog("文件摘要信息数：" + outfile[i].nFileSummaryNum);
				for(int j=0; j<outfile[i].nFileSummaryNum; j++){
					ToolKits.writeLog("摘要内容：" + new String(outfile[i].stFileSummaryInfo[j].szKey).trim());
				}

				ToolKits.writeLog("文件标志总数：" + outfile[i].nFalgCount);
				for(int j=0; j<outfile[i].nFalgCount; j++) {
					ToolKits.writeLog("标志文件：" + outfile[i].emFalgLists[j]);
				}
				ToolKits.writeLog("emFileState：" + outfile[i].emFileState);
				ToolKits.writeLog("szWorkDir：" + new String(outfile[i].szWorkDir).trim());
			}

			if(nRetCount < nMaxCount) {
				break;
			} else {
				nCount++;
			}
		}

		INetSDK.FindCloseEx(lFindHandle);
	}

	void TestFindFile1() {
		NET_TIME stBegin = new NET_TIME();
		stBegin.dwYear = 2014;
		stBegin.dwMonth = 12;
		stBegin.dwDay = 12;
		NET_TIME stEnd = new NET_TIME();
		stEnd.dwYear = 2014;
		stEnd.dwMonth = 12;
		stEnd.dwDay = 12;
		stEnd.dwHour = 23;
		stEnd.dwMinute = 59;
		stEnd.dwSecond = 59;
		int channelID = 0;

		MEDIAFILE_FACE_DETECTION_PARAM stQueryPar = new MEDIAFILE_FACE_DETECTION_PARAM();
		stQueryPar.nChannelID = channelID;
		stQueryPar.stuStartTime = stBegin;
		stQueryPar.stuEndTime = stEnd;
		stQueryPar.emPicType = EM_FACEPIC_TYPE.NET_FACEPIC_TYPE_SMALL;
		stQueryPar.bDetailEnable = false;
		long lRetQuery = INetSDK.FindFileEx(__LoginHandle,
				EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FACE_DETECTION, stQueryPar,
				5000);
		MEDIAFILE_FACE_DETECTION_INFO stQueryFile[] = new MEDIAFILE_FACE_DETECTION_INFO[5];
		for (int i = 0; i < 5; i++) {
			stQueryFile[i] = new MEDIAFILE_FACE_DETECTION_INFO();
		}
		int nFileCount = INetSDK.FindNextFileEx(lRetQuery,
				EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FACE_DETECTION, stQueryFile,
				5000);
		boolean zRet = INetSDK.FindCloseEx(lRetQuery);
		if (!zRet) {
			ToolKits.writeErrorLog("FindCloseEx failed");
		}
	}

	// 查询人脸信息记录集
	void TestFindFaceInfo1() {
		ToolKits.writeLog("Enter TestFindFaceInfo.");
		NET_TIME stBegin = new NET_TIME();
		stBegin.dwYear = 2019;
		stBegin.dwMonth = 9;
		stBegin.dwDay = 16;
		NET_TIME stEnd = new NET_TIME();
		stEnd.dwYear = 2019;
		stEnd.dwMonth = 9;
		stEnd.dwDay = 16;
		stEnd.dwHour = 23;
		stEnd.dwMinute = 59;
		stEnd.dwSecond = 59;
		int channelID = 1;

		MEDIAFILE_FACERECOGNITION_PARAM stQueryPar = new MEDIAFILE_FACERECOGNITION_PARAM();
		stQueryPar.nChannelId = channelID;
		stQueryPar.nAlarmType = 1;
		stQueryPar.stStartTime = stBegin;
		stQueryPar.stEndTime = stEnd;
		stQueryPar.abPersonInfoEx = true;
		stQueryPar.stPersonInfoEx.bAgeEnable = true;

		stQueryPar.stPersonInfoEx.nAgeRange[0] = 1;
		stQueryPar.stPersonInfoEx.nAgeRange[1] = 30;
		stQueryPar.stPersonInfoEx.bySex = 1;
		stQueryPar.bSimilaryRangeEnable = true;
		stQueryPar.nSimilaryRange[0] = 1;
		stQueryPar.nSimilaryRange[1] = 100;
		long lRetQuery = INetSDK.FindFileEx(__LoginHandle,
				EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FACE, stQueryPar,
				5000);
		if (lRetQuery == 0)
		{
			ToolKits.writeLog("lRetQuery = 0");
			return;
		}
		MEDIAFILE_FACERECOGNITION_INFO stQueryFile[] = new MEDIAFILE_FACERECOGNITION_INFO[2];
		for (int i = 0; i < 2; i++) {
			stQueryFile[i] = new MEDIAFILE_FACERECOGNITION_INFO();
		}
		int nFileCount = INetSDK.FindNextFileEx(lRetQuery,
				EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FACE, stQueryFile,
				5000);
		if(nFileCount > 0)
		{
			for(int j = 0; j < nFileCount; j++){
				SDK_IN_DOWNLOAD_REMOTE_FILE stIn = new SDK_IN_DOWNLOAD_REMOTE_FILE();

				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String time = format.format(new Date());
				stIn.pszFileDst = getExternalFilesDir(null).getAbsolutePath()+"/"+ "ObjectPic" + "-" + time.replace(":","-").replace(" ", "_")  + "-" + j + ".jpg";

				if (stIn.pszFileDst.equals("")) {
					boolean zRet = INetSDK.FindCloseEx(lRetQuery);
					if (!zRet) {
						ToolKits.writeErrorLog("FindCloseEx failed");
					}
					return;
				}

				stIn.pszFileName = new String(stQueryFile[j].stObjectPic.szFilePath).trim();

				SDK_OUT_DOWNLOAD_REMOTE_FILE stOut = new SDK_OUT_DOWNLOAD_REMOTE_FILE();

				if (INetSDK.DownloadRemoteFile(NetSDKApplication.getInstance().getLoginHandle(), stIn, stOut, 4000)) {
					ToolKits.writeLog("下载成功！");
				}else {
					ToolKits.writeErrorLog("下载失败！");
				}
				if (stQueryFile[j].bGlobalScenePic) {
					SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String time1 = format.format(new Date());
					stIn.pszFileDst = getExternalFilesDir(null).getAbsolutePath() + "/" + "Global" + "-" + time1.replace(":", "-").replace(" ", "_") + "-" + j + ".jpg";

					if (stIn.pszFileDst.equals("")) {
						boolean zRet = INetSDK.FindCloseEx(lRetQuery);
						if (!zRet) {
							ToolKits.writeErrorLog("FindCloseEx failed");
						}
						return;
					}

					stIn.pszFileName = new String(stQueryFile[j].stGlobalScenePic.szFilePath).trim();
					SDK_OUT_DOWNLOAD_REMOTE_FILE stOut1 = new SDK_OUT_DOWNLOAD_REMOTE_FILE();

					if (INetSDK.DownloadRemoteFile(NetSDKApplication.getInstance().getLoginHandle(), stIn, stOut1, 4000)) {
						ToolKits.writeLog("下载成功！");
					} else {
						ToolKits.writeErrorLog("下载失败！");
					}
				}
			}

		}
		boolean zRet = INetSDK.FindCloseEx(lRetQuery);
		if (!zRet) {
			ToolKits.writeErrorLog("FindCloseEx failed");
		}


	}

	// 启动设备搜索
	public void StartDeviceDiscovery() {
		boolean bRet = false;
		NET_IN_START_DEVICE_DISCOVERY pInStart = new NET_IN_START_DEVICE_DISCOVERY();
		pInStart.emSubClassID = EM_NET_DEVICE_DISCOVERY_SUBCLASSID_TYPE.EM_NET_DEVICE_DISCOVERY_SUBCLASSID_TYPE_ONVIF;
		pInStart.nTimeOut = 30;
		NET_OUT_START_DEVICE_DISCOVERY pOutStart = new NET_OUT_START_DEVICE_DISCOVERY();
		bRet = INetSDK.StartDeviceDiscovery(__LoginHandle, pInStart, pOutStart, 5000);
		if(bRet) {
			ToolKits.writeLog("-----StartDeviceDiscovery Succeed!");
		} else {
			ToolKits.writeErrorLog("-----StartDeviceDiscovery Failed!" );
		}
	}


	// 停止设备搜索
	public void StopDeviceDiscovery() {
		boolean bRet = false;
		NET_IN_STOP_DEVICE_DISCOVERY pInStop = new NET_IN_STOP_DEVICE_DISCOVERY();
		pInStop.emSubClassID = EM_NET_DEVICE_DISCOVERY_SUBCLASSID_TYPE.EM_NET_DEVICE_DISCOVERY_SUBCLASSID_TYPE_ONVIF;
		NET_OUT_STOP_DEVICE_DISCOVERY pOutStop = new NET_OUT_STOP_DEVICE_DISCOVERY();
		bRet = INetSDK.StopDeviceDiscovery(__LoginHandle, pInStop, pOutStop, 5000);
		if(bRet) {
			ToolKits.writeLog("-----StopDeviceDiscovery Succeed!");
		} else {
			ToolKits.writeErrorLog("-----StopDeviceDiscovery Failed!" );
		}

	}

	// 注销设备搜索
	public void DetachDeviceDiscovery() {
		if(lDeviceDiscoveryHandle != 0) {
			INetSDK.DetachDeviceDiscovery(lDeviceDiscoveryHandle);
			lDeviceDiscoveryHandle = 0;
		}
	}

	// FTP上传配置
	public void FTPConfig() {
		//获取
		boolean bRet = false;
		SDKDEV_FTP_PROTO_CFG[] ftp = new SDKDEV_FTP_PROTO_CFG[1];
		ftp[0] = new SDKDEV_FTP_PROTO_CFG();
		Integer lpBytes = new Integer(0);

		// 获取
		bRet = INetSDK.GetDevConfig(__LoginHandle, FinalVar.SDK_DEV_FTP_PROTO_CFG, -1, ftp, lpBytes, 5000);
		if(bRet) {
			ToolKits.writeLog("szHostIp : " + new String(ftp[0].szHostIp).trim());
			ToolKits.writeLog("wHostPort : " + ftp[0].wHostPort);
			ToolKits.writeLog("szUserName : " + new String(ftp[0].szUserName).trim());
			ToolKits.writeLog("szPassword : " + new String(ftp[0].szPassword).trim());
			ToolKits.writeLog("FTP目录路径 : " + new String(ftp[0].szDirName).trim());

			// 设置
			bRet = false;
			String pwd = "admin123";
			System.arraycopy(pwd.getBytes(), 0, ftp[0].szPassword, 0, pwd.getBytes().length);
			bRet = INetSDK.SetDevConfig(__LoginHandle, FinalVar.SDK_DEV_FTP_PROTO_CFG, -1, ftp, 5000);
			if(bRet) {
				ToolKits.writeLog("Set FTP Succeed!");
			} else {
				ToolKits.writeErrorLog("Set FTP Failed!" );
			}
		} else {
			ToolKits.writeErrorLog("Get FTP Failed!" );
		}
	}

	// 蓝牙开门记录集（插入、更新、删除、清除）
	public void BlueToothRecord() {
		// 插入记录
		String username = "admin123";
		String pwd = "admin123";
		String mac = "admin123";
		String note = "admin123";
		NET_RECORD_ACCESS_BLUETOOTH_INFO stuInfoInsert = new NET_RECORD_ACCESS_BLUETOOTH_INFO();  // 蓝牙开门记录集信息
		System.arraycopy(username.getBytes(), 0, stuInfoInsert.szUserName, 0, username.getBytes().length);
		System.arraycopy(pwd.getBytes(), 0, stuInfoInsert.szPassword, 0, pwd.getBytes().length);
		System.arraycopy(mac.getBytes(), 0, stuInfoInsert.szMac, 0, mac.getBytes().length);
		System.arraycopy(note.getBytes(), 0, stuInfoInsert.szNote, 0, note.getBytes().length);

		NET_CTRL_RECORDSET_INSERT_PARAM stuParaInsert = new NET_CTRL_RECORDSET_INSERT_PARAM();
		stuParaInsert.stuCtrlRecordSetInfo.nType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESS_BLUETOOTH;
		stuParaInsert.stuCtrlRecordSetInfo.pBuf = stuInfoInsert;
		if(INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_RECORDSET_INSERT, stuParaInsert, 3000)) {
			ToolKits.writeLog("----------- nRecNo : " + stuParaInsert.stuCtrlRecordSetResult.nRecNo);
		} else {
			ToolKits.writeErrorLog("----------- Insert Failed!" );
		}

		// 更新记录
		NET_RECORD_ACCESS_BLUETOOTH_INFO stuInfoUpdate = new NET_RECORD_ACCESS_BLUETOOTH_INFO();  // 蓝牙开门记录集信息
		stuInfoUpdate.nRecNo = stuParaInsert.stuCtrlRecordSetResult.nRecNo; // 需要修改的记录集编号
		System.arraycopy("654321".getBytes(), 0, stuInfoUpdate.szPassword, 0, "654321".getBytes().length);

		NET_CTRL_RECORDSET_PARAM stuUpdate = new NET_CTRL_RECORDSET_PARAM();
		stuUpdate.nType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESS_BLUETOOTH;
		stuUpdate.pBuf = stuInfoUpdate;
		if(INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_RECORDSET_UPDATE, stuUpdate, 3000)) {
			ToolKits.writeLog("----------- Update Succeed!");
		} else {
			ToolKits.writeErrorLog("----------- Update Failed!" );
		}

		// 删除记录，只需要下发记录集编号
		// 记录集编号
		Integer recordNo = new Integer(5);

		NET_CTRL_RECORDSET_PARAM stuRemove = new NET_CTRL_RECORDSET_PARAM();
		stuRemove.nType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESS_BLUETOOTH;

		// 新增\更新\查询\导入时,为记录集信息缓存,详见 EM_NET_RECORD_TYPE 注释,由用户申请内存，长度为nBufLen
		// 删除时,为存放记录集编号的内存地址(类型为int*)
		stuRemove.pBuf = recordNo;
		if(INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_RECORDSET_REMOVE, stuRemove, 3000)) {
			ToolKits.writeLog("----------- Remove Succeed!");
		} else {
			ToolKits.writeErrorLog("----------- Remove Failed!" );
		}

		// 清理记录，只需要下发type
		NET_CTRL_RECORDSET_PARAM stuClear = new NET_CTRL_RECORDSET_PARAM();
		stuClear.nType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESS_BLUETOOTH;;
		if(INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_RECORDSET_CLEAR, stuClear, 3000)) {
			ToolKits.writeLog("----------- Remove Succeed!");
		} else {
			ToolKits.writeErrorLog("----------- Remove Failed!" );
		}
	}

	// 二维码开门记录集（插入、更新、删除、清除）
	public void QrcodeRecord() {
		// 插入记录
		NET_RECORD_ACCESSQRCODE_INFO stuInfoInsert = new NET_RECORD_ACCESSQRCODE_INFO();  // 蓝牙开门记录集信息
		System.arraycopy("123456".getBytes(), 0, stuInfoInsert.szQRCode, 0, "123456".getBytes().length);
		stuInfoInsert.nLeftTimes = 10;
		// 有效开始时间
		stuInfoInsert.stuStartTime.dwYear = 2017;
		stuInfoInsert.stuStartTime.dwMonth = 9;
		stuInfoInsert.stuStartTime.dwDay = 12;
		stuInfoInsert.stuStartTime.dwHour = 11;
		stuInfoInsert.stuStartTime.dwMinute = 0;
		stuInfoInsert.stuStartTime.dwSecond = 0;

		// 有效结束时间
		stuInfoInsert.stuEndTime.dwYear = 2017;
		stuInfoInsert.stuEndTime.dwMonth = 9;
		stuInfoInsert.stuEndTime.dwDay = 13;
		stuInfoInsert.stuEndTime.dwHour = 11;
		stuInfoInsert.stuEndTime.dwMinute = 0;
		stuInfoInsert.stuEndTime.dwSecond = 0;

		NET_CTRL_RECORDSET_INSERT_PARAM stuParaInsert = new NET_CTRL_RECORDSET_INSERT_PARAM();
		stuParaInsert.stuCtrlRecordSetInfo.nType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESSQRCODE;
		stuParaInsert.stuCtrlRecordSetInfo.pBuf = stuInfoInsert;
		if(INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_RECORDSET_INSERT, stuParaInsert, 3000)) {
			ToolKits.writeLog("----------- nRecNo : " + stuParaInsert.stuCtrlRecordSetResult.nRecNo);
		} else {
			ToolKits.writeErrorLog("----------- Insert Failed!" );
		}

		// 更新记录
		NET_RECORD_ACCESSQRCODE_INFO stuInfoUpdate = new NET_RECORD_ACCESSQRCODE_INFO();  // 蓝牙开门记录集信息
		stuInfoUpdate.nRecNo = stuParaInsert.stuCtrlRecordSetResult.nRecNo;   // 需要修改的记录集编号
		System.arraycopy("654321".getBytes(), 0, stuInfoUpdate.szQRCode, 0, "654321".getBytes().length);

		NET_CTRL_RECORDSET_PARAM stuUpdate = new NET_CTRL_RECORDSET_PARAM();
		stuUpdate.nType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESSQRCODE;
		stuUpdate.pBuf = stuInfoUpdate;
		if(INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_RECORDSET_UPDATE, stuUpdate, 3000)) {
			ToolKits.writeLog("----------- Update Succeed!");
		} else {
			ToolKits.writeErrorLog("----------- Update Failed!" );
		}

		// 删除记录，只需要下发记录集编号
		// 记录集编号
		Integer recordNo = new Integer(5);

		NET_CTRL_RECORDSET_PARAM stuRemove = new NET_CTRL_RECORDSET_PARAM();
		stuRemove.nType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESSQRCODE;

		// 新增\更新\查询\导入时,为记录集信息缓存,详见 EM_NET_RECORD_TYPE 注释,由用户申请内存，长度为nBufLen
		// 删除时,为存放记录集编号的内存地址(类型为int*)
		stuRemove.pBuf = recordNo;
		if(INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_RECORDSET_REMOVE, stuRemove, 3000)) {
			ToolKits.writeLog("----------- Remove Succeed!");
		} else {
			ToolKits.writeErrorLog("----------- Remove Failed!" );
		}

		// 清理记录，只需要下发type
		NET_CTRL_RECORDSET_PARAM stuClear = new NET_CTRL_RECORDSET_PARAM();
		stuClear.nType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESSQRCODE;;
		if(INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_RECORDSET_CLEAR, stuClear, 3000)) {
			ToolKits.writeLog("----------- Remove Succeed!");
		} else {
			ToolKits.writeErrorLog("----------- Remove Failed!" );
		}
	}

	// 图像属性配置
	public void VideoImageInfoConfig() {
		NET_VIDEOIN_IMAGE_INFO wideoImage = new NET_VIDEOIN_IMAGE_INFO();
		wideoImage.emCfgType = NET_EM_CONFIG_TYPE.NET_EM_CONFIG_DAYTIME ; // 配置类型，获取和设置时都要制定(有些设备是不需要设置的)
		int channel = -1;

		// 获取
		if (INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_VIDEOIN_IMAGE_OPT, channel, wideoImage, 3000, null)) {
			ToolKits.writeLog("配置类型 ：" + wideoImage.emCfgType);
			ToolKits.writeLog("是否开启画面镜像功能 ：" + wideoImage.bMirror);
			ToolKits.writeLog("是否开启画面翻转功能 ：" + wideoImage.bFlip);
			ToolKits.writeLog("nRotate90 ：" + wideoImage.nRotate90);

			// 设置
			wideoImage.bFlip = true;
			if(INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_VIDEOIN_IMAGE_OPT, channel, wideoImage, 3000, null, null)) {
				ToolKits.writeLog("Set Succeed!");
			} else {
				ToolKits.writeErrorLog("Set Faile" );
			}
		}
		else {
			ToolKits.writeLog("Get Faile!");
			ToolKits.writeLog("错误码：0x80000000|" + (INetSDK.GetLastError() & 0x7fffffff));
		}
	}

	// 网络预览中断事件配置
	public void NetMonitorAbortConfig() {
	    CFG_NET_MONITOR_ABORT_INFO cfg = new CFG_NET_MONITOR_ABORT_INFO();
		// 获取
		if(ToolKits.GetDevConfig(FinalVar.CFG_CMD_NET_MONITOR_ABORT, cfg, __LoginHandle, 1, 10 * 1024)) {
		    ToolKits.writeLog(cfg.toString());

			// 设置
			if(cfg.bEnable == false) {
				cfg.bEnable = true;
			} else {
				cfg.bEnable = false;
			}
			if(ToolKits.SetDevConfig(FinalVar.CFG_CMD_NET_MONITOR_ABORT, cfg, __LoginHandle, 1, 10 * 1024)) {
				ToolKits.writeLog("Set Succeed!");
			}
		}
	}

	// 扩展报警输入配置
	public void ExAlarmInputConfig() {
		CFG_EXALARMINPUT_INFO cfg = new CFG_EXALARMINPUT_INFO();

		// 获取
		if(ToolKits.GetDevConfig(FinalVar.CFG_CMD_EXALARMINPUT, cfg, __LoginHandle, 1, 10 * 1024)) {
			ToolKits.writeLog(cfg.toString());

			// 设置
			if(cfg.stuAlarmIn.bEnable == false) {
				cfg.stuAlarmIn.bEnable = true;
			} else {
				cfg.stuAlarmIn.bEnable = false;
			}
			if(ToolKits.SetDevConfig(FinalVar.CFG_CMD_EXALARMINPUT, cfg, __LoginHandle, 1, 10 * 1024)) {
				ToolKits.writeLog("Set Succeed!");
			}
		}
	}

	// 本地扩展报警配置
	public void LocalExAlarmConfig() {
		CFG_LOCAL_EXT_ALARME_INFO cfg = new CFG_LOCAL_EXT_ALARME_INFO();

		// 获取
		if (ToolKits.GetDevConfig(FinalVar.CFG_CMD_LOCAL_EXT_ALARM, cfg, __LoginHandle, 1, 1024*32)) {
			ToolKits.writeLog(cfg.toString());

			// 设置
			if (!ToolKits.SetDevConfig(FinalVar.CFG_CMD_LOCAL_EXT_ALARM, cfg, __LoginHandle, 1, 1024*32)) {
				ToolKits.writeErrorLog("Failed to Set DevConfig.");
			}
		}
	}

	// 查询扩展报警盒子报警输入和报警输出的关系
	public void QueryExAlarmChannels() {
		int alarmInCount = 64;  // 扩展模块报警输入通道个数,需用户指定查询个数
		int alarmOutCount = 24; // 扩展模块报警输出通道个数,需用户指定查询个数
		NET_EXALARMCHANNELS exalarmchannels = new NET_EXALARMCHANNELS(alarmInCount, alarmOutCount);

		boolean bRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_EXALARMCHANNELS, exalarmchannels, 5000);
		if(bRet) {
			ToolKits.writeLog("扩展模块报警输入通道返回个数 : " + exalarmchannels.nRetExAlarmInCount);
			ToolKits.writeLog("扩展模块报警输出通道返回个数 : " + exalarmchannels.nRetExAlarmOutCount);

			int incount = exalarmchannels.nRetExAlarmInCount > alarmInCount? alarmInCount:exalarmchannels.nRetExAlarmInCount;
			int outcount = exalarmchannels.nRetExAlarmOutCount > alarmOutCount? alarmOutCount:exalarmchannels.nRetExAlarmOutCount;

			ToolKits.writeLog("输入 ： " + incount);
			for(int i = 0; i < incount; i++ ) {
				ToolKits.writeLog("nExAlarmBoxNum ： " + exalarmchannels.pstuExAlarmInInfo[i].nExAlarmBoxNum);
				ToolKits.writeLog("nChannelNum ： " + exalarmchannels.pstuExAlarmInInfo[i].nChannelNum);
				ToolKits.writeLog("szChannelName ： " + new String(exalarmchannels.pstuExAlarmInInfo[i].szChannelName).trim());
			}

			ToolKits.writeLog("输出 ： " + outcount);
			for(int i = 0; i < outcount; i++ ) {
				ToolKits.writeLog("nExAlarmBoxNum ： " + exalarmchannels.pstuExAlarmOutInfo[i].nExAlarmBoxNum);
				ToolKits.writeLog("nChannelNum ： " + exalarmchannels.pstuExAlarmOutInfo[i].nChannelNum);
				ToolKits.writeLog("szChannelName ： " +  new String(exalarmchannels.pstuExAlarmOutInfo[i].szChannelName).trim());
			}
		}
	}

	// 网络扩展配置
	public void NetCfgExConfig() {
		boolean bRet = false;
		int dwCommand = FinalVar.SDK_DEV_NETCFG_EX;
		SDKDEV_NET_CFG_EX[] netCfg = new SDKDEV_NET_CFG_EX[1];
		netCfg[0] = new SDKDEV_NET_CFG_EX();

		// 获取
		Integer lpBytesReturned = new Integer(0);
		bRet = INetSDK.GetDevConfig(__LoginHandle, dwCommand, 0, netCfg, lpBytesReturned, 3000);
		if(bRet){
			ToolKits.writeLog("nEtherNetNum : " + netCfg[0].nEtherNetNum);
			for(int i=0; i<netCfg[0].nEtherNetNum; i++) {
				ToolKits.writeLog("sDevIPAddr : " + new String(netCfg[0].stEtherNet[i].sDevIPAddr).trim());
				ToolKits.writeLog("sDevIPMask : " + new String(netCfg[0].stEtherNet[i].sDevIPMask).trim());
				ToolKits.writeLog("sGatewayIP : " + new String(netCfg[0].stEtherNet[i].sGatewayIP).trim());
				ToolKits.writeLog("byMACAddr : " + new String(netCfg[0].stEtherNet[i].byMACAddr).trim());
			}
			ToolKits.writeLog("sHostIPAddr : " + new String(netCfg[0].struDns.sHostIPAddr).trim());
			ToolKits.writeLog("wTcpPort : " + netCfg[0].wTcpPort);
			ToolKits.writeLog("wUdpPort : " + netCfg[0].wUdpPort);
			ToolKits.writeLog("wHttpPort : " + netCfg[0].wHttpPort);
			ToolKits.writeLog("wHttpsPort : " + netCfg[0].wHttpsPort);

			// 设置
			String ipAddr = "172.29.2.137";
			System.arraycopy(ipAddr.getBytes(), 0, netCfg[0].stEtherNet[0].sDevIPAddr, 0, ipAddr.getBytes().length);

			String ipMask = "255.255.0.0";
			System.arraycopy(ipMask.getBytes(), 0, netCfg[0].stEtherNet[0].sDevIPMask, 0, ipMask.getBytes().length);

			String ipGateway = "172.29.0.2";
			System.arraycopy(ipGateway.getBytes(), 0, netCfg[0].stEtherNet[0].sGatewayIP, 0, ipGateway.getBytes().length);

			String dns = "255.255.1.1";
			System.arraycopy(dns.getBytes(), 0, netCfg[0].struDns.sHostIPAddr, 0, dns.getBytes().length);
			netCfg[0].wTcpPort = 37777;
			netCfg[0].wUdpPort = 37777;
			netCfg[0].wHttpPort = 80;
			netCfg[0].wHttpsPort = 443;
			bRet = false;
			bRet = INetSDK.SetDevConfig(__LoginHandle, dwCommand, 0, netCfg, 3000);
			if(bRet) {
				ToolKits.writeLog("SetDevConfig Succeed!");
			} else {
				ToolKits.writeErrorLog("SetDevConfig Failed!" );
			}
		} else {
			ToolKits.writeErrorLog("GetDevConfig Failed!" );
		}
	}

	// 网络配置
	public void NetWorkConfig() {
		int chn = 0; // 通道号
		CFG_NETWORK_INFO network = new CFG_NETWORK_INFO();

		// 获取
		if(ToolKits.GetDevConfig(FinalVar.CFG_CMD_NETWORK, network, __LoginHandle, chn, 2*1024*1024)) {
			ToolKits.writeLog("网卡数量 : " + network.nInterfaceNum);
			for(int i = 0; i < network.nInterfaceNum; i++) {
				ToolKits.writeLog("是否开启DHCP :" + network.stuInterfaces[i].bDhcpEnable);
			}

			// 设置
			if(ToolKits.SetDevConfig(FinalVar.CFG_CMD_NETWORK, network, __LoginHandle, chn, 2*1024*1024)) {
				ToolKits.writeLog("Set Succed!");
			}
		}
	}

	// RTSP的配置
	public void RTSPConfig() {
		int chn = 0; // 通道号
		CFG_RTSP_INFO_OUT rtsp = new CFG_RTSP_INFO_OUT();

		// 获取
		if(ToolKits.GetDevConfig(FinalVar.CFG_CMD_RTSP, rtsp, __LoginHandle, chn, 2*1024*1024)) {
			ToolKits.writeLog("nPort :" + rtsp.nPort);

			// 设置
			rtsp.nPort = 666;
			if(ToolKits.SetDevConfig(FinalVar.CFG_CMD_RTSP, rtsp, __LoginHandle, chn, 2*1024*1024)) {
				ToolKits.writeLog("Set Succed!");
			}
		}
	}
	/**
	 * 修改设备IP
	 */
	public void ModifyDevice() {
		DEVICE_NET_INFO_EX device = new DEVICE_NET_INFO_EX();
		device.iIPVersion = 4;    // ipv4   还是 ipv6 ，不可少
		String mac = "e0:50:8b:e3:55:f7";
		System.arraycopy(mac.getBytes(), 0, device.szMac, 0, mac.getBytes().length); // mac地址，不可少

		String ipAddr = "172.23.3.191";
		System.arraycopy(ipAddr.getBytes(), 0, device.szIP, 0, ipAddr.getBytes().length);

		String ipMask = "255.255.255.0";
		System.arraycopy(ipMask.getBytes(), 0, device.szSubmask, 0, ipMask.getBytes().length);

		String ipGateway = "172.23.1.1";
		System.arraycopy(ipGateway.getBytes(), 0, device.szGateway, 0, ipGateway.getBytes().length);

		if(INetSDK.ModifyDevice(device, 10000)) {
			ToolKits.writeLog("ModifyDevice Succeed!");
		}else {
			ToolKits.writeErrorLog("ModifyDevice Failed!" );
		}
	}

	/**
	 * 自动布撤防计划配置
	 */
	public void ArmScheduleInfoConfig() {
		NET_CFG_ARMSCHEDULE_INFO armscheduleInfo = new NET_CFG_ARMSCHEDULE_INFO();
		int channel = -1;   // 此配置没通道概念，所以通道要设为 -1
		if (INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_ARMSCHEDULE, channel, armscheduleInfo, 3000, null)) {
			ToolKits.writeLog("bEnable ：" + armscheduleInfo.bEnable);
			for(int i = 0; i < FinalVar.SDK_N_SCHEDULE_TSECT; i++) {
				for(int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
					ToolKits.writeLog("bEnable:" + armscheduleInfo.stuTimeSection[i][j].bEnable);
					ToolKits.writeLog(armscheduleInfo.stuTimeSection[i][j].iBeginHour + ":" +
							armscheduleInfo.stuTimeSection[i][j].iBeginMin + ":" +
							armscheduleInfo.stuTimeSection[i][j].iBeginSec + "-" +
							armscheduleInfo.stuTimeSection[i][j].iEndHour + ":" +
							armscheduleInfo.stuTimeSection[i][j].iEndMin + ":" +
							armscheduleInfo.stuTimeSection[i][j].iEndSec
					);
				}
			}

			// 设置
			armscheduleInfo.stuTimeSection[0][0].iBeginHour = 1;
			armscheduleInfo.stuTimeSection[0][0].iBeginMin = 1;
			armscheduleInfo.stuTimeSection[0][0].iBeginSec = 1;
			armscheduleInfo.stuTimeSection[0][0].iEndHour = 2;
			armscheduleInfo.stuTimeSection[0][0].iEndMin = 2;
			armscheduleInfo.stuTimeSection[0][0].iEndSec = 2;
			armscheduleInfo.bEnable = true;

			if(INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_ARMSCHEDULE, channel, armscheduleInfo, 3000, null, null)) {
				ToolKits.writeLog("Set Succeed!");
			} else {
				ToolKits.writeErrorLog("Set Faile" );
			}
		} else {
			ToolKits.writeErrorLog("Get Faile" );
		}
	}

	// 设置GPS状态信息
	public void SetGPSStatus() {
		NET_IN_SET_GPS_STATUS pInParam = new NET_IN_SET_GPS_STATUS();
		NET_OUT_SET_GPS_STATUS pOutParam = new NET_OUT_SET_GPS_STATUS();

		pInParam.bEnable = true;
		pInParam.nChannel = 0;
		pInParam.stGPSInfo.emDateSource = EM_DATE_SOURCE.EM_DATE_SOURCE_GPS; // 数据来源

		pInParam.stGPSInfo.dbLongitude = 320.175694; // 经度(单位是度,范围0-360度)
		pInParam.stGPSInfo.dbLatitude = 110.35325;  // 纬度(单位是度,范围0-180度)
		pInParam.stGPSInfo.dbAltitude = 9999.9;   // 高度(单位:米)
		pInParam.stGPSInfo.dbSpeed = 40.00;     // 速度(单位:km/H)
		pInParam.stGPSInfo.dbBearing = 45.3;   // 方向角(单位:度)
		pInParam.stGPSInfo.emAntennasStatus = NET_THREE_STATUS_BOOL.BOOL_STATUS_TRUE;      // 天线状态(0:坏 1:好)
		pInParam.stGPSInfo.emPositioningResult = NET_THREE_STATUS_BOOL.BOOL_STATUS_TRUE;  // 定位状态(0:不定位 1:定位)
		pInParam.stGPSInfo.nSatelliteCount = 1;  // 卫星个数
		pInParam.stGPSInfo.emWorkStatus = NET_GPS_WORK_STATUS.EM_DIFFERENTIAL_POSITIONING; // 工作状态
		pInParam.stGPSInfo.nAlarmCount = 2; // 报警个数
		pInParam.stGPSInfo.nAlarmState[0] = 1; // 发生的报警位置,值可能多个
		pInParam.stGPSInfo.nAlarmState[1] = 21;
		pInParam.stGPSInfo.dbHDOP = 2; // 水平精度因子

		// 时间
		pInParam.stGPSInfo.stuLocalTime.dwYear = 2017;
		pInParam.stGPSInfo.stuLocalTime.dwMonth = 11;
		pInParam.stGPSInfo.stuLocalTime.dwDay = 1;
		pInParam.stGPSInfo.stuLocalTime.dwHour = 10;
		pInParam.stGPSInfo.stuLocalTime.dwMinute = 0;
		pInParam.stGPSInfo.stuLocalTime.dwSecond = 0;

		if(INetSDK.SetGPSStatus(__LoginHandle, pInParam, pOutParam, 5000)) {
			ToolKits.writeLog("SetGPSStatus Succeed!");
		} else {
			ToolKits.writeErrorLog("SetGPSStatus Failed!");
		}
	}

	/**
	 * 手机推送消息的翻译目标语言配置
	 */
	public void AppLanguageInfoConfig() {
		// 通过获取得到设备支持的语言列表
		CFG_APP_EVENT_LANGUAGE_INFO appLanguageInfo = new CFG_APP_EVENT_LANGUAGE_INFO();

		if(ToolKits.GetDevConfig(FinalVar.CFG_CMD_APP_EVENT_LANGUAGE, appLanguageInfo, __LoginHandle, -1, 2*1024*1024)) {
			ToolKits.writeLog("emCurrLanguage :" + appLanguageInfo.emCurrLanguage);
			ToolKits.writeLog("nSupportLanguageCount :" + appLanguageInfo.nSupportLanguageCount);
			for(int i = 0; i < appLanguageInfo.nSupportLanguageCount; i++) {
				ToolKits.writeLog("emLanguage :" + appLanguageInfo.emLanguage[i]);
			}
		}

		// 根据获取的语言列表，选择其中一种语言设置
		if(appLanguageInfo.emCurrLanguage == appLanguageInfo.emLanguage[0]) {
			appLanguageInfo.emCurrLanguage = appLanguageInfo.emLanguage[1];
		} else if(appLanguageInfo.emCurrLanguage == appLanguageInfo.emLanguage[1]) {
			appLanguageInfo.emCurrLanguage = appLanguageInfo.emLanguage[2];
		} else if(appLanguageInfo.emCurrLanguage == appLanguageInfo.emLanguage[2]) {
			appLanguageInfo.emCurrLanguage = appLanguageInfo.emLanguage[0];
		}

		if(ToolKits.SetDevConfig(FinalVar.CFG_CMD_APP_EVENT_LANGUAGE, appLanguageInfo, __LoginHandle, -1, 2*1024*1024)) {
			ToolKits.writeLog("Set Succed!");
		}
	}

	/**
	 * 根据设备ip初始化账户(组播初始化),初始化之前，要通过设备搜索判断设备是否可以初始化
	 */
	public void InitDevAccount() {
		// 初始化账号
		boolean bRet = false;
		NET_IN_INIT_DEVICE_ACCOUNT inInit = new NET_IN_INIT_DEVICE_ACCOUNT();
		String macAdd = "4c:11:bf:9b:ac:d7";
		System.arraycopy(macAdd.getBytes(), 0, inInit.szMac, 0, macAdd.getBytes().length);
		String username = "admin";
		System.arraycopy(username.getBytes(), 0, inInit.szUserName, 0, username.getBytes().length);
		String password = "admin";
		System.arraycopy(password.getBytes(), 0, inInit.szPwd, 0, password.getBytes().length);
		String cellphone = "15967112475";
		System.arraycopy(cellphone.getBytes(), 0, inInit.szCellPhone, 0, cellphone.getBytes().length);

		///具体看结构体注释
		inInit.byPwdResetWay = 1; //设备搜索到的,必须与搜索到的一致

		NET_OUT_INIT_DEVICE_ACCOUNT outInit = new NET_OUT_INIT_DEVICE_ACCOUNT();

		bRet = INetSDK.InitDevAccount(inInit, outInit, 5000, null);
		if(bRet) {
			ToolKits.writeLog("InitDevAccount Succeed!");
		} else {
			ToolKits.writeErrorLog("InitDevAccount Failed!" );
		}
	}

	/**
	 * 根据设备ip初始化账户(单播初始化)，初始化之前，要通过设备搜索判断设备是否可以初始化
	 */
	public void InitDevAccountByIP() {
		boolean bRet = false;
		NET_IN_INIT_DEVICE_ACCOUNT inInit = new NET_IN_INIT_DEVICE_ACCOUNT();
		String macAdd = "e0:50:8b:e3:55:f7";
		System.arraycopy(macAdd.getBytes(), 0, inInit.szMac, 0, macAdd.getBytes().length);

		String username = "admin";
		System.arraycopy(username.getBytes(), 0, inInit.szUserName, 0, username.getBytes().length);

		String password = "admin123";  // 必须字母与数字结合，8位以上，否则设备不识别
		System.arraycopy(password.getBytes(), 0, inInit.szPwd, 0, password.getBytes().length);

		String cellphone = "15967112475";
		System.arraycopy(cellphone.getBytes(), 0, inInit.szCellPhone, 0, cellphone.getBytes().length);

		String mail = "123@qq.com";
		System.arraycopy(mail.getBytes(), 0, inInit.szMail, 0, mail.getBytes().length);

		///具体看结构体注释
		inInit.byPwdResetWay = 1; //设备搜索到的,必须与搜索到的一致

		NET_OUT_INIT_DEVICE_ACCOUNT outInit = new NET_OUT_INIT_DEVICE_ACCOUNT();

		String szDeviceIP = "192.168.3.46"; // 搜索到的设备ip，跟mac地址对应
		bRet = INetSDK.InitDevAccountByIP(inInit, outInit, 5000, null, szDeviceIP);
		if(bRet) {
			ToolKits.writeLog("InitDevAccountByIP Succeed!");
		} else {
			ToolKits.writeErrorLog("InitDevAccountByIP Failed!" );
		}
	}

	// Dropbox Token 配置
	public void DropBoxTokenConfig() {
		CFG_DROPBOXTOKEN_INFO dropBox = new CFG_DROPBOXTOKEN_INFO();

		if(ToolKits.GetDevConfig(FinalVar.CFG_CMD_DROPBOXTOKEN, dropBox, __LoginHandle, -1, 2*1024*1024)) {
			ToolKits.writeLog("szDropBoxToken : " + new String(dropBox.szDropBoxToken).trim());

			// 如果在获取的基础上进行配置，需要将szDropBoxToken置空；
			String str = "ZD5vAilWJawAAAAAAAAAt";
			ToolKits.StringToByteArray(str,dropBox.szDropBoxToken );

			if(ToolKits.SetDevConfig(FinalVar.CFG_CMD_DROPBOXTOKEN, dropBox, __LoginHandle, -1, 2*1024*1024)) {
				ToolKits.writeLog("SetDevConfig Succeed!");
			} else {
				ToolKits.writeErrorLog("SetDevConfig Failed!");
			}
		} else {
			ToolKits.writeErrorLog("GetDevConfig Failed!");
		}
	}

	/**
	 * 获取云台预置点列表
	 */
	public void GetPtzPresetList() {
		boolean bRet = false;
		int nType = FinalVar.SDK_DEVSTATE_PTZ_PRESET_LIST;
		// 先获取返回的预置点个数
		NET_PTZ_PRESET_LIST ptzPreset1 = new NET_PTZ_PRESET_LIST(5);   // 5为初始化预置点列表数组

		bRet = INetSDK.QueryDevState(__LoginHandle, nType, ptzPreset1, 3000);
		if(bRet) {
			ToolKits.writeLog("dwRetPresetNum : " + ptzPreset1.dwRetPresetNum);

			// 在获取返回的预置点个数的基础上，获取预置点列表
			bRet = false;
			NET_PTZ_PRESET_LIST ptzPreset2 = new NET_PTZ_PRESET_LIST(ptzPreset1.dwRetPresetNum);
			bRet = INetSDK.QueryDevState(__LoginHandle, nType, ptzPreset2, 3000);
			if(bRet) {
				for(int i = 0; i < ptzPreset2.dwRetPresetNum; i++) {
					ToolKits.writeLog("nIndex : " + ptzPreset2.pstuPtzPorsetList[i].nIndex);
					ToolKits.writeLog("szName : " + new String(ptzPreset2.pstuPtzPorsetList[i].szName).trim());
				}
			}
		} else {
			ToolKits.writeErrorLog("Get PTZ Preset Failed!" );
		}
	}

	/**
	 *  云台开机动作设置
	 */
	public void PtzPowerUp() {
		boolean bRet = false;
		String strCmd = FinalVar.CFG_CMD_PTZ_POWERUP;
		int chn = 0;
		CFG_PTZ_POWERUP_INFO ptzPowerInfo = new CFG_PTZ_POWERUP_INFO();

		// 获取
		bRet = ToolKits.GetDevConfig(strCmd, ptzPowerInfo, __LoginHandle, chn, 2* 1024 *1024);
		if(bRet) {
			ToolKits.writeLog("bEnable : " + ptzPowerInfo.bEnable);
			ToolKits.writeLog("nFunction : " + ptzPowerInfo.nFunction);
			ToolKits.writeLog("nScanId : " + ptzPowerInfo.nScanId);
			ToolKits.writeLog("nPresetId : " + ptzPowerInfo.nPresetId);
			ToolKits.writeLog("nPatternId : " + ptzPowerInfo.nPatternId);
			ToolKits.writeLog("nTourId : " + ptzPowerInfo.nTourId);
		} else {
			ToolKits.writeErrorLog("Get Failed!" );
		}

		// 设置
		bRet = false;
		ptzPowerInfo.bEnable = true;
		bRet = ToolKits.SetDevConfig(strCmd, ptzPowerInfo, __LoginHandle, chn, 2* 1024 *1024);
		if(bRet) {
			ToolKits.writeLog("Set Succeed!");
		} else {
			ToolKits.writeErrorLog("Set Failed!" );
		}
	}

	// 删除文件或目录
	public void RemoveRemoteFiles() {
		SDK_IN_REMOVE_REMOTE_FILES stIn = new SDK_IN_REMOVE_REMOTE_FILES(2);
		stIn.pszPath[0] = "/sdcard/11.dav";
		stIn.pszPath[1] = "/sdcard/22.dav";
		SDK_OUT_REMOVE_REMOTE_FILES stOut = new SDK_OUT_REMOVE_REMOTE_FILES();
		boolean bRet = INetSDK.RemoveRemoteFiles(__LoginHandle,stIn, stOut, 5000);
		if(bRet) {
			ToolKits.writeLog("RemoveRemoteFiles Succeed!");
		} else {
			ToolKits.writeErrorLog("RemoveRemoteFiles Failed!" );
		}
	}

	// 雨刷模式相关配置
	public void RainBrushMode() {
		CFG_RAINBRUSHMODE_INFO info = new CFG_RAINBRUSHMODE_INFO();
		// 获取
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_RAINBRUSHMODE, info, __LoginHandle, -1, 10240);
		if (!zRet) {
			ToolKits.showErrorMessage(this, "GetDevConfig failed, " );
		} else {
			ToolKits.writeLog("emMode : " + info.emMode);
			ToolKits.writeLog("emEnableMode : " + info.emEnableMode);
			ToolKits.writeLog("nPort : " + info.nPort);
			ToolKits.writeLog("nSensitivity : " + info.nSensitivity);

			// 设置
			info.nSensitivity = 3;
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_RAINBRUSHMODE, info, __LoginHandle, -1, 10240);
			if (!zRet) {
				ToolKits.showErrorMessage(this, "SetDevConfig failed, " );
			}
		}
	}


	public  void TestSetLocalMode(){

		if(INetSDK.SetLocalMode(__LoginHandle,EM_LOCAL_MODE.EM_LOCAL_PLAY_FLAG_MODE,1)){
			ToolKits.writeLog("SetLocalMode Succeed!");
		}else{
			ToolKits.writeErrorLog("SetLocalMode failed!");
		}
	}

	// 查询目标识别人脸库的信息
	public void FindGroupInfo() {
		// 入参
		NET_IN_FIND_GROUP_INFO stIn = new NET_IN_FIND_GROUP_INFO();
//		String groupId = "1"; // 人员ID
//		System.arraycopy(groupId.getBytes(), 0, stIn.szGroupId, 0, groupId.getBytes().length);    // 此参数不填，就是查询所有的信息

		// 出参
		NET_OUT_FIND_GROUP_INFO stOut = new NET_OUT_FIND_GROUP_INFO(10);   // 需要设备人员组最大个数

		if(INetSDK.FindGroupInfo(__LoginHandle, stIn, stOut, 5000)) {
			ToolKits.writeLog("nRetGroupNum : " + stOut.nRetGroupNum);

			for(int i = 0; i < stOut.nRetGroupNum; i++) {
				ToolKits.writeLog("szGroupId : " + new String(stOut.pGroupInfos[i].szGroupId).trim());
				ToolKits.writeLog("szGroupName : " + new String(stOut.pGroupInfos[i].szGroupName).trim());
			}
		} else {
			ToolKits.writeErrorLog("FindGroupInfo Failed!");
		}
	}
	// 获取在线设备（扩展报警盒子）状态
	public void GetComPortDeviceChannelInfo() {
		// 入参
		NET_IN_GET_COM_PORT_DEVICE_CHANNEL_INFO stIn = new NET_IN_GET_COM_PORT_DEVICE_CHANNEL_INFO();
		stIn.emDeviceType = EM_COM_PORT_DEVICE_TYPE.EM_COM_PORT_DEVICE_TYPE_EXALARMBOX;     // 扩展报警盒子
		// 出参
		int maxOnlineDeviceCount = 10; // 在线的设备的最大个数, 自己设置
		NET_OUT_GET_COM_PORT_DEVICE_CHANNEL_INFO stOut = new NET_OUT_GET_COM_PORT_DEVICE_CHANNEL_INFO(maxOnlineDeviceCount);
		if(INetSDK.GetComPortDeviceChannelInfo(__LoginHandle, stIn, stOut, 5000)) {
			ToolKits.writeLog("设备数目(包括不在线和在线的) : " + stOut.nDeviceCount);
			ToolKits.writeLog("设备返回的当前在线的设备数量 : " + stOut.nRetOnlineDeviceCount);

			// 当前在线的设备的通道索引数组
			int nMinOnlineDeviceCount = maxOnlineDeviceCount >= stOut.nRetOnlineDeviceCount ? stOut.nRetOnlineDeviceCount : maxOnlineDeviceCount;
			for(int i = 0; i < nMinOnlineDeviceCount; i++) {
				ToolKits.writeLog("在线设备通道 ： " + stOut.pOnlineChannel[i]);
			}
		} else {
			ToolKits.writeErrorLog("GetComPortDeviceChannelInfo Failed!");
		}
	}

	// 扩展报警输出配置
	public void ExAlarmOutConfig() {
		// 获取
		boolean bRet = false;
		for(int i = 0; i < 24; i++) {
			CFG_EXALARMOUTPUT_INFO exAlarmOutput = new CFG_EXALARMOUTPUT_INFO();
			bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_EXALARMOUTPUT, exAlarmOutput, __LoginHandle, i, 10240);
			if (!bRet) {
				ToolKits.writeErrorLog("GetDevConfig failed!");
			} else {
				ToolKits.writeLog("报警通道名称 : " + new String(exAlarmOutput.szChnName).trim());
				ToolKits.writeLog("输出模式 : " + exAlarmOutput.nOutputMode);

				// 设置
				bRet = false;
				bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_EXALARMOUTPUT, exAlarmOutput, __LoginHandle, i, 10240);
				if (!bRet) {
					ToolKits.writeErrorLog("SetDevConfig failed!");
				} else {
					ToolKits.writeLog("SetDevConfig Succeed!");
				}
			}
		}
	}

	// 报警输出通道配置
	public void AlarmOutConfig() {
		for (int i = 0; i < 24; i++) {
			// 获取
			CFG_ALARMOUT_INFO stCfgAlarmOutInfo = new CFG_ALARMOUT_INFO();
			if (ToolKits.GetDevConfig(FinalVar.CFG_CMD_ALARMOUT, stCfgAlarmOutInfo, __LoginHandle, i, 10240)) {

				ToolKits.writeLog("报警通道号 : " + stCfgAlarmOutInfo.nChannelID);
				ToolKits.writeLog("报警通道名称 : " + new String(stCfgAlarmOutInfo.szChnName).trim());
				ToolKits.writeLog("输出类型 : " + new String(stCfgAlarmOutInfo.szOutputType).trim());
				ToolKits.writeLog("输出模式 : " + stCfgAlarmOutInfo.nOutputMode);

				// 设置
				if (ToolKits.SetDevConfig(FinalVar.CFG_CMD_ALARMOUT, stCfgAlarmOutInfo, __LoginHandle, i, 10240)) {
					ToolKits.writeLog("Set AlarmOut Succeed!");
				} else {
					ToolKits.writeErrorLog("Set AlarmOut Failed!");
				}
			}else{
				ToolKits.writeErrorLog("Get AlarmOut Failed!");
			}
		}
	}

	// 设置报警状态
	public void ControlAlarmOut() {
		ALARMCTRL_PARAM stOut = new ALARMCTRL_PARAM();
		stOut.nAlarmNo = 0;
		stOut.nAction = 1;   // 1：触发报警,0：停止报警

		if(INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_TRIGGER_ALARM_OUT, stOut, 3000)) {
			ToolKits.showMessage(this, "设置触发报警成功");
		} else {
			ToolKits.showErrorMessage(this, "设置触发报警失败");
		}

		stOut.nAction = 0;   // 1：触发报警,0：停止报警
		if(INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_TRIGGER_ALARM_OUT, stOut, 3000)) {
			ToolKits.showMessage(this, "设置停止报警成功");
		} else {
			ToolKits.showErrorMessage(this, "设置停止报警失败");
		}

	}

	// 扩展模块报警输出通道
	public void GetChannelsState() {
		int minCount = 0;
		int alarmInCount = 16; 		// 报警输入个数,由用户指定
		int alarmOutCount = 16;    // 报警输出个数,由用户指定
		int alarmBellCount = 16;   // 警号个数,由用户指定
		int exAlarmInCount = 16;   // 扩展模块报警输入个数,由用户指定
		int exAlarmOutCount = 16;  // 扩展模块报警输出个数,由用户指定

		NET_CLIENT_ALARM_CHANNELS_STATE alarmChannelState = new NET_CLIENT_ALARM_CHANNELS_STATE(alarmInCount, alarmOutCount ,alarmBellCount, exAlarmInCount, exAlarmOutCount);
		alarmChannelState.emType = NET_ALARM_CHANNEL_TYPE.NET_ALARM_CHANNEL_TYPE_EXALARMOUT;  // 查询报警通道的类型

		if(INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE, alarmChannelState, 3000)) {
			minCount = alarmInCount <= alarmChannelState.nAlarmInRetCount? alarmInCount : alarmChannelState.nAlarmInRetCount;
			for(int i = 0; i < minCount; i++) {
				ToolKits.writeLog("报警输入状态：" + alarmChannelState.pbAlarmInState[i]);
			}

			minCount = alarmOutCount <= alarmChannelState.nAlarmOutRetCount? alarmOutCount : alarmChannelState.nAlarmOutRetCount;
			for(int i = 0; i < minCount; i++) {
				ToolKits.writeLog("报警输出状态：" + alarmChannelState.pbAlarmOutState[i]);
			}

			minCount = alarmBellCount <= alarmChannelState.nAlarmBellRetCount? alarmBellCount : alarmChannelState.nAlarmBellRetCount;
			for(int i = 0; i < minCount; i++) {
				ToolKits.writeLog("警号状态 ：" + alarmChannelState.pbAlarmBellState[i]);
			}

			minCount = exAlarmInCount <= alarmChannelState.nExAlarmInRetCount? exAlarmInCount : alarmChannelState.nExAlarmInRetCount;
			for(int i = 0; i < minCount; i++) {
				ToolKits.writeLog("扩展模块报警输入状态数 ：" + alarmChannelState.pbExAlarmInState[i]);
				ToolKits.writeLog("扩展模块报警输入有效通道的位置 ：" + alarmChannelState.pnExAlarmInDestionation[i]);
			}

			minCount = exAlarmOutCount <= alarmChannelState.nExAlarmOutRetCount? exAlarmOutCount : alarmChannelState.nExAlarmOutRetCount;
			for(int i = 0; i < minCount; i++) {
				ToolKits.writeLog("扩展模块报警输出状态数 ：" + alarmChannelState.pbExAlarmOutState[i]);
				ToolKits.writeLog("扩展模块报警输出有效通道的位置 ：" + alarmChannelState.pnExAlarmOutDestionation[i]);
			}
		} else {
			ToolKits.writeErrorLog("QueryDevState Alarm Channel State Failed!");
		}
	}

	// 获得每个报警输出端口的状态, 由 QueryExAlarmChannels() 获取报警输出通道个数
	public void GetAlarmOutState() {
		//入参
		NET_IN_GET_ALARM_OUT_STATE stIn = new NET_IN_GET_ALARM_OUT_STATE();

		// 出参
		NET_OUT_GET_ALARM_OUT_STATE stOut = new NET_OUT_GET_ALARM_OUT_STATE();

		if(INetSDK.GetAlarmOutState(__LoginHandle, stIn, stOut, 3000)) {
			for(int i = 0; i < 32; i++) {
				ToolKits.writeLog("输出端口状态 : " + stOut.nState[i]);   // 输出端口状态, 0表示没有, 1表示有
			}
		}
	}

	// 获取扩展报警盒能力集, QueryExAlarmChannels()获取通道个数，
	public void QueryExAlarmBoxCaps() {
		int chn = 0;  // 通道
		CFG_CAP_EXALARMBOX_INFO alarmBox = new CFG_CAP_EXALARMBOX_INFO();
		String szCommand = FinalVar.CFG_CAP_CMD_EXALARMBOX;
		char szOutBuffer[] = new char[1024];
		Integer stError = new Integer(0);

		boolean bRet = INetSDK.QueryNewSystemInfo(__LoginHandle, szCommand, chn, szOutBuffer, stError, 5000);
		if(bRet) {
			boolean bQu = INetSDK.ParseData(szCommand, szOutBuffer, alarmBox, null);
			if(bQu){
				ToolKits.writeLog("扩展报警模块输入个数：" + alarmBox.nAlarmInCount);
				ToolKits.writeLog("扩展报警模块输出个数：" + alarmBox.nAlarmOutCount);
			} else {
				ToolKits.writeErrorLog("ParseData Failed!" );
			}
		} else {
			ToolKits.writeErrorLog("QueryNewSystemInfo Failed!" );
		}
	}

	// 扩展模块报警盒配置
	public void ExAlarmBoxInfoConfig() {
		// 获取
		boolean bRet = false;
		for(int i = 0; i < 24; i++) {
			CFG_EXALARMBOX_INFO exAlarmBox = new CFG_EXALARMBOX_INFO();
			bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_EXALARMBOX, exAlarmBox, __LoginHandle, i, 10240);
			if (!bRet) {
				ToolKits.writeErrorLog("GetDevConfig failed!");
			} else {
				ToolKits.writeLog("使能开关 : " + exAlarmBox.bEnable);
				ToolKits.writeLog("协议名称 : " + new String(exAlarmBox.szProtocolName).trim());
				ToolKits.writeLog("使用的串口端口号 : " + exAlarmBox.nPort);
				ToolKits.writeLog("设备地址 : " + exAlarmBox.nAddress);
				ToolKits.writeLog("串口属性 : " + exAlarmBox.stuCommAttr.byDataBit + "-" + exAlarmBox.stuCommAttr.byStopBit + "-" + exAlarmBox.stuCommAttr.byParity + "-" + exAlarmBox.stuCommAttr.byBaudRate);

				// 设置
				bRet = false;
				bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_EXALARMBOX, exAlarmBox, __LoginHandle, i, 10240);
				if (!bRet) {
					ToolKits.writeErrorLog("SetDevConfig failed!");
				} else {
					ToolKits.writeLog("SetDevConfig Succeed!");
				}
			}
		}
	}

	// 叠加通道标题属性配置
	public void ChannelTitleConfig() {
		NET_OSD_CHANNEL_TITLE stIn = new NET_OSD_CHANNEL_TITLE();
		stIn.emOsdBlendType = NET_EM_OSD_BLEND_TYPE.NET_EM_OSD_BLEND_TYPE_MAIN; // 叠加类型
		int channel = 0;  // 通道号

		// 获取
		if (INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_CHANNELTITLE, channel, stIn, 3000, null)) {
			ToolKits.writeLog(stIn.toString());
		} else {
			ToolKits.writeErrorLog("Get Faile" );
		}

		// 设置
		stIn.bEncodeBlend = true;  // 是否叠加
		if(INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_CHANNELTITLE, channel, stIn, 3000, null, null)) {
			ToolKits.writeLog("Set Succeed!");
		} else {
			ToolKits.writeErrorLog("Set Faile" );
		}
	}

	// 叠加时间标题属性配置
	public void TimeTitleConfig() {
		NET_OSD_TIME_TITLE stIn = new NET_OSD_TIME_TITLE();
		stIn.emOsdBlendType = NET_EM_OSD_BLEND_TYPE.NET_EM_OSD_BLEND_TYPE_MAIN; // 叠加类型,不管是获取还是设置都要设置该字段
		int channel = 0;  // 通道号

		// 获取
		if (INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_TIMETITLE, channel, stIn, 3000, null)) {
			ToolKits.writeLog(stIn.toString());
		} else {
			ToolKits.writeErrorLog("Get Faile" );
		}

		// 设置
		stIn.bEncodeBlend = true;  // 是否叠加
		stIn.bShowWeek = true;     // 是否显示星期
		if(INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_TIMETITLE, channel, stIn, 3000, null, null)) {
			ToolKits.writeLog("Set Succeed!");
		} else {
			ToolKits.writeErrorLog("Set Faile" );
		}
	}

	// 叠加自定义标题属性配置
	public void CustomTitleConfig() {
		NET_OSD_CUSTOM_TITLE stIn = new NET_OSD_CUSTOM_TITLE();
		stIn.emOsdBlendType = NET_EM_OSD_BLEND_TYPE.NET_EM_OSD_BLEND_TYPE_MAIN; // 叠加类型,不管是获取还是设置都要设置该字段
		int channel = 0;  // 通道号

		// 获取
		if (INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_CUSTOMTITLE, channel, stIn, 3000, null)) {
			ToolKits.writeLog(stIn.toString());
			for (int i = 0; i < stIn.nCustomTitleNum; i++) {
				ToolKits.writeLog("NET_CUSTOM_TITLE_INFO{num=" + i + ", bEncodeBlend=" + stIn.stuCustomTitle[i].bEncodeBlend + ", szText=" + new String(stIn.stuCustomTitle[i].szText) + '}');
			}
		} else {
			ToolKits.writeErrorLog("Get Faile" );
		}

		stIn.stuCustomTitle[0].bEncodeBlend = true;
		String title = "小舟从此逝，江海寄余生！";
		Arrays.fill(stIn.stuCustomTitle[0].szText, (byte) 0);
		System.arraycopy(title.getBytes(), 0, stIn.stuCustomTitle[0].szText, 0, title.getBytes().length);

		if(INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_CUSTOMTITLE, channel, stIn, 3000, null, null)) {
			ToolKits.writeLog("Set Succeed!");
		} else {
			ToolKits.writeErrorLog("Set Faile" );
		}
	}

	// 发送同轴IO控制命令
	public void SetCoaxialControlIO() {
		// 入参
		NET_IN_CONTROL_COAXIAL_CONTROL_IO stIn = new NET_IN_CONTROL_COAXIAL_CONTROL_IO();
		stIn.nChannel = 0; 	// 通道号
		stIn.nInfoCount = 2;  // 同轴IO信息个数

		stIn.stInfo[0].emType = EM_COAXIAL_CONTROL_IO_TYPE.EM_COAXIAL_CONTROL_IO_TYPE_LIGHT;  // 同轴IO控制类型
		stIn.stInfo[0].emSwicth = EM_COAXIAL_CONTROL_IO_SWITCH.EM_COAXIAL_CONTROL_IO_SWITCH_OPEN;  // 同轴IO控制开关
		stIn.stInfo[0].emMode = EM_COAXIAL_CONTROL_IO_TRIGGER_MODE.EM_COAXIAL_CONTROL_IO_TRIGGER_MODE_MANUAL_TRIGGER;  // 同轴IO触发方式

		stIn.stInfo[1].emType = EM_COAXIAL_CONTROL_IO_TYPE.EM_COAXIAL_CONTROL_IO_TYPE_LIGHT;  // 同轴IO控制类型
		stIn.stInfo[1].emSwicth = EM_COAXIAL_CONTROL_IO_SWITCH.EM_COAXIAL_CONTROL_IO_SWITCH_OPEN;  // 同轴IO控制开关
		stIn.stInfo[1].emMode = EM_COAXIAL_CONTROL_IO_TRIGGER_MODE.EM_COAXIAL_CONTROL_IO_TRIGGER_MODE_MANUAL_TRIGGER;  // 同轴IO触发方式

		// 出参
		NET_OUT_CONTROL_COAXIAL_CONTROL_IO stOut = new NET_OUT_CONTROL_COAXIAL_CONTROL_IO();
		if(INetSDK.ControlDeviceEx(__LoginHandle, CtrlType.SDK_CTRL_COAXIAL_CONTROL_IO, stIn, stOut, 3000)) {
			ToolKits.writeLog("ControlDeviceEx Succeed!");
		} else {
			ToolKits.writeErrorLog("ControlDeviceEx Failed!");
		}
	}

	// 获取同轴IO控制能力
	public void GetCoaxialControlIOCaps() {
		int nType = FinalVar.NET_COAXIAL_CONTROL_IO_CAPS;
		// 入参
		NET_IN_GET_COAXIAL_CONTROL_IO_CAPS stIn = new NET_IN_GET_COAXIAL_CONTROL_IO_CAPS();
		stIn.nChannel = 0; // 通道号

		// 出参
		NET_OUT_GET_COAXIAL_CONTROL_IO_CAPS stOut = new NET_OUT_GET_COAXIAL_CONTROL_IO_CAPS();

		if(INetSDK.GetDevCaps(__LoginHandle, nType, stIn, stOut, 5000)) {
			ToolKits.writeLog("bSupportControlLight : " + stOut.bSupportControlLight);
			ToolKits.writeLog("bSupportControlSpeaker : " + stOut.bSupportControlSpeaker);
		} else {
			ToolKits.writeErrorLog("GetDevCaps Failed!" );
		}
	}

	// 获取补光灯能力
	public void GetLightingControlCaps() {
		int nType = FinalVar.NET_LIGHTINGCONTROL_CAPS;
		// 入参
		NET_IN_LIGHTINGCONTROL_CAPS stIn = new NET_IN_LIGHTINGCONTROL_CAPS();
		stIn.nChannel = 0; // 通道号

		// 出参
		NET_OUT_LIGHTINGCONTROL_CAPS stOut = new NET_OUT_LIGHTINGCONTROL_CAPS();

		if(INetSDK.GetDevCaps(__LoginHandle, nType, stIn, stOut, 5000)) {
			ToolKits.writeLog("bSupport : " + stOut.bSupport);
			ToolKits.writeLog("emConfigVersion : " + stOut.emConfigVersion);
		} else {
			ToolKits.writeErrorLog("GetDevCaps Failed!" );
		}
	}

	// 获取无线设备信号强度
	public void GetWireLessDevSignal() {
		int type = CtrlType.SDK_CTRL_LOWRATEWPAN_GETWIRELESSDEVSIGNAL;
		NET_IN_CTRL_LOWRATEWPAN_GETWIRELESSDEVSIGNAL inWireSignal = new NET_IN_CTRL_LOWRATEWPAN_GETWIRELESSDEVSIGNAL();
		inWireSignal.nStartIndex = 0; // 开始的索引号，从0开始
		inWireSignal.nDevStateNum = 10;   // 本次获取的设备状态条数

		NET_OUT_CTRL_LOWRATEWPAN_GETWIRELESSDEVSIGNAL outWireSignal = new NET_OUT_CTRL_LOWRATEWPAN_GETWIRELESSDEVSIGNAL();
		if(INetSDK.ControlDeviceEx(__LoginHandle, type, inWireSignal, outWireSignal, 3000)) {
			ToolKits.writeLog("获取无线设备数量:" + outWireSignal.nWirelessDevNum);

			for(int i = 0; i < outWireSignal.nWirelessDevNum; i++) {
				ToolKits.writeLog("设备序列号：" + outWireSignal.stuDevSignal[i].szDevSN);
				ToolKits.writeLog("无线信号强度百分比：" + outWireSignal.stuDevSignal[i].unSignal + "\n");
			}
		} else {
			ToolKits.writeErrorLog("GetWireLessDevSignal Failed!" );
		}
	}

	// 视频输入颜色配置
	public void VideoInColorInfoConfig_Day() {
		// 获取
		NET_VIDEOIN_COLOR_INFO msg = new NET_VIDEOIN_COLOR_INFO();
		msg.emCfgType = NET_EM_CONFIG_TYPE.NET_EM_CONFIG_DAYTIME;    // 配置类型，获取和设置时都要制定
		int nType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_VIDEOIN_COLOR;
		int nChannelID = -1;

		if(INetSDK.GetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null)) {
			ToolKits.writeLog("配置类型:" + msg.emCfgType);
			ToolKits.writeLog("亮度:" + msg.nBrightness);
			ToolKits.writeLog("对比度:" + msg.nContrast);
			ToolKits.writeLog("饱和度:" + msg.nSaturation);
			ToolKits.writeLog("伽马值:" + msg.nGamma);
			ToolKits.writeLog("色彩:" + msg.emColorStyle);

			// 设置
			msg.emCfgType = NET_EM_CONFIG_TYPE.NET_EM_CONFIG_DAYTIME;    // 配置类型，获取和设置时都要制定
			if(msg.emColorStyle < 3){
				msg.emColorStyle ++;
			} else {
				msg.emColorStyle = 0;
			}
			if(msg.nBrightness < 100){
				msg.nBrightness ++;
			} else {
				msg.nBrightness = 0;
			}
			if(msg.nSaturation < 100){
				msg.nSaturation ++;
			} else {
				msg.nSaturation = 0;
			}
			if(INetSDK.SetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null, null)) {
				ToolKits.writeLog("Set VideoIn Color Succeed!");
			} else {
				ToolKits.writeErrorLog("Set VideoIn Color Failed!");
			}
		} else {
			ToolKits.writeErrorLog("Get VideoIn Color Failed!");
		}
	}

	// 视频输入颜色配置
	public void VideoInColorInfoConfig_Night() {
		// 获取
		NET_VIDEOIN_COLOR_INFO msg = new NET_VIDEOIN_COLOR_INFO();
		msg.emCfgType = NET_EM_CONFIG_TYPE.NET_EM_CONFIG_NIGHT;    // 配置类型，获取和设置时都要制定
		int nType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_VIDEOIN_COLOR;
		int nChannelID = -1;

		if(INetSDK.GetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null)) {
			ToolKits.writeLog("配置类型:" + msg.emCfgType);
			ToolKits.writeLog("亮度:" + msg.nBrightness);
			ToolKits.writeLog("对比度:" + msg.nContrast);
			ToolKits.writeLog("饱和度:" + msg.nSaturation);
			ToolKits.writeLog("伽马值:" + msg.nGamma);
			ToolKits.writeLog("色彩:" + msg.emColorStyle);

			// 设置
			msg.emCfgType = NET_EM_CONFIG_TYPE.NET_EM_CONFIG_NIGHT;    // 配置类型，获取和设置时都要制定
			if(msg.emColorStyle < 3){
				msg.emColorStyle ++;
			} else {
				msg.emColorStyle = 0;
			}
			if(msg.nBrightness < 100){
				msg.nBrightness ++;
			} else {
				msg.nBrightness = 0;
			}
			if(msg.nSaturation < 100){
				msg.nSaturation ++;
			} else {
				msg.nSaturation = 0;
			}
			if(INetSDK.SetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null, null)) {
				ToolKits.writeLog("Set VideoIn Color Succeed!");
			} else {
				ToolKits.writeErrorLog("Set VideoIn Color Failed!");
			}
		} else {
			ToolKits.writeErrorLog("Get VideoIn Color Failed!");
		}
	}

	// 视频输入颜色配置
	public void VideoInColorInfoConfig_Normal() {
		// 获取
		NET_VIDEOIN_COLOR_INFO msg = new NET_VIDEOIN_COLOR_INFO();
		msg.emCfgType = NET_EM_CONFIG_TYPE.NET_EM_CONFIG_NORMAL;    // 配置类型，获取和设置时都要制定
		int nType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_VIDEOIN_COLOR;
		int nChannelID = -1;

		if(INetSDK.GetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null)) {
			ToolKits.writeLog("配置类型:" + msg.emCfgType);
			ToolKits.writeLog("亮度:" + msg.nBrightness);
			ToolKits.writeLog("对比度:" + msg.nContrast);
			ToolKits.writeLog("饱和度:" + msg.nSaturation);
			ToolKits.writeLog("伽马值:" + msg.nGamma);
			ToolKits.writeLog("色彩:" + msg.emColorStyle);

			// 设置
			msg.emCfgType = NET_EM_CONFIG_TYPE.NET_EM_CONFIG_NORMAL;    // 配置类型，获取和设置时都要制定
			if(msg.emColorStyle < 3){
				msg.emColorStyle ++;
			} else {
				msg.emColorStyle = 0;
			}
			if(msg.nBrightness < 100){
				msg.nBrightness ++;
			} else {
				msg.nBrightness = 0;
			}
			if(msg.nSaturation < 100){
				msg.nSaturation ++;
			} else {
				msg.nSaturation = 0;
			}
			if(INetSDK.SetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null, null)) {
				ToolKits.writeLog("Set VideoIn Color Succeed!");
			} else {
				ToolKits.writeErrorLog("Set VideoIn Color Failed!");
			}
		} else {
			ToolKits.writeErrorLog("Get VideoIn Color Failed!");
		}
	}
	/**
	 * 视频分析能力集：比如 场景名称
	 */
	public void QueryVideoAnalyseInfo() {
		int nChn = 0; // 通道号
		Integer stErr = new Integer(0);
		String szCommand = FinalVar.CFG_CAP_CMD_VIDEOANALYSE;   // 频分析能力集
		char[] szOutBuffer = new char[1024*10];
		CFG_CAP_ANALYSE_INFO msg = new CFG_CAP_ANALYSE_INFO();
		if (INetSDK.QueryNewSystemInfo(__LoginHandle, szCommand, nChn, szOutBuffer, stErr, 4000)) {
			boolean bRet = INetSDK.ParseData(szCommand, szOutBuffer, msg, null);
			if (!bRet) {
				ToolKits.writeErrorLog(" CFG_CAP_CMD_ADAPTENCODE error");
			} else {
				for(int i = 0; i < msg.nSupportedSceneNum; i++) {
					ToolKits.writeLog("场景 : " + new String(msg.szSceneName[i]).trim());
				}
			}
		}
	}

	/**
	 * 查询硬盘状态
	 */
	public void QueryHDDState() {
		boolean bRet = false;
		SDK_HARDDISK_STATE msg = new SDK_HARDDISK_STATE();
		bRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_DISK, msg, 3000);
		if(bRet) {
			for(int i = 0; i < msg.dwDiskNum; i++) {
				// 倒序解析，7~4位，对应bit0~3， 低四位的值表示硬盘的状态，0-休眠,1-活动,2-故障等
				byte[] b = ToolKits.getByteArray(msg.stDisks[i].dwStatus);

				for(int j = 0; j < b.length; j++) {
					ToolKits.writeLog(" " + b[j]);
				}

				if(b[b.length - 1] == 1) {
					ToolKits.writeLog("活动");
				} else if(b[b.length - 2] == 1) {
					ToolKits.writeLog("故障");
				} else if(b[b.length - 1] == 0 && b[b.length - 2] == 0) {
					ToolKits.writeLog("休眠");
				}
			}
		}
	}

	// 获取编码能力：比如音频使能
	public void GetEncodeCaps() {
		// Get encode
		CFG_ENCODE_INFO encodeInfo = new CFG_ENCODE_INFO();
		int channel = 0;
		if(!ToolKits.GetDevConfig(FinalVar.CFG_CMD_ENCODE, encodeInfo, __LoginHandle, channel, 1024 * 1024 * 2)){
			ToolKits.writeErrorLog("GetDevConfig for CFG_CMD_ENCODE falied in initEncodeData..");
		}

		// 将 CFG_ENCODE_INFO 转为 char[]
		char[] cJson = new char[1024 * 1024 * 2];
		if (!INetSDK.PacketData(FinalVar.CFG_CMD_ENCODE, encodeInfo, cJson, 1024 * 1024 * 2)) {
			ToolKits.writeErrorLog("PacketData Failed!");
		}

		// 获取能力
		int ntype = FinalVar.NET_ENCODE_CFG_CAPS;
		// 入参
		NET_IN_ENCODE_CFG_CAPS stIn = new NET_IN_ENCODE_CFG_CAPS();
		stIn.nChannelId = channel;  // 通道号
		stIn.nStreamType = 0;  // 码流类型，0：主码流；1：辅码流1；2：辅码流2；3：辅码流3；4：抓图码流
		stIn.pchEncodeJson = ToolKits.getBytes(cJson);

		// 出参
		NET_OUT_ENCODE_CFG_CAPS stOut = new NET_OUT_ENCODE_CFG_CAPS();
		boolean bRet = INetSDK.GetDevCaps(__LoginHandle, ntype, stIn, stOut, 5000);
		if(bRet) {
			// 入参是主码流，获取到的就是 主码流配置对应能力
			ToolKits.writeLog("");
		} else {
			ToolKits.writeErrorLog("GetDevCaps Failed!" );
		}
	}

	// 曝光配置
	public void VideoInExposureInfoConfig() {
		int nMaxExposureNum = 5;   // 配置最大个数
		String cmdStr = FinalVar.CFG_CMD_VIDEOIN_EXPOSURE;

		CFG_VIDEOIN_EXPOSURE_INFO videoInExposureInfo = new CFG_VIDEOIN_EXPOSURE_INFO(nMaxExposureNum);

		int chn = 0;
		// 获取
		if(ToolKits.GetDevConfig(cmdStr, videoInExposureInfo , __LoginHandle, chn, 1024 * 1024)) {
			ToolKits.writeLog("\n" + "返回的配置个数:" + videoInExposureInfo.dwRetExposureNum);

			int count = videoInExposureInfo.dwMaxExposureNum > videoInExposureInfo.dwRetExposureNum ? videoInExposureInfo.dwRetExposureNum : videoInExposureInfo.dwMaxExposureNum;

			for(int j = 0; j < count; j++) {
				ToolKits.writeLog("曝光模式:" + videoInExposureInfo.pstuVideoInExposure[j].byExposureMode);
				ToolKits.writeLog("曝光补偿:" + videoInExposureInfo.pstuVideoInExposure[j].byCompensation);
				ToolKits.writeLog("慢曝光:" + videoInExposureInfo.pstuVideoInExposure[j].bySlowAutoExposure);
				ToolKits.writeLog("慢曝光等级:" + videoInExposureInfo.pstuVideoInExposure[j].bySlowSpeed);
				ToolKits.writeLog("曝光速度等级:" + videoInExposureInfo.pstuVideoInExposure[j].byExposureSpeed);
				ToolKits.writeLog("自动曝光时间下限:" + videoInExposureInfo.pstuVideoInExposure[j].fValue1);
				ToolKits.writeLog("自动曝光时间上限:" + videoInExposureInfo.pstuVideoInExposure[j].fValue2);
			}


			// 设置  byExposureMode： 0 自动； 4 手动     i: 0白天，1夜晚，2普通
			for(int i = 0; i < count; i++) {
				if(videoInExposureInfo.pstuVideoInExposure[i].byExposureMode == 0) {
					videoInExposureInfo.pstuVideoInExposure[i].byExposureMode = 4;
				} else if(videoInExposureInfo.pstuVideoInExposure[i].byExposureMode == 4){
					videoInExposureInfo.pstuVideoInExposure[i].byExposureMode =0;
				}
			}

			if(ToolKits.SetDevConfig(cmdStr, videoInExposureInfo , __LoginHandle, chn, 1024 * 1024)) {
				ToolKits.writeLog("Set Exposure Succeed!");
			}
		}
	}

	// 指示灯控制配置
	public void LightGlobalConfig() {
		String cmdStr = FinalVar.CFG_CMD_LIGHT_GLOBAL;

		CFG_LIGHT_GLOBAL light = new CFG_LIGHT_GLOBAL();

			int chn = -1;
		// 获取
		if(ToolKits.GetDevConfig(cmdStr, light , __LoginHandle, chn, 1024 * 1024)) {

			for(int j = 0; j < light.nLightGlobalCount; j++) {
				ToolKits.writeLog("bLightEnable:" + light.bLightEnable[j]);
			}


			if(light.bLightEnable[0]) {
				light.bLightEnable[0] = false;
			} else{
				light.bLightEnable[0] = true;
			}

			if(ToolKits.SetDevConfig(cmdStr, light , __LoginHandle, chn, 1024 * 1024)) {
				ToolKits.writeLog("Set LightGlobal Succeed!");
			}
		}
	}

	// 白光灯视频通道配置
	public void CoaxialLightConfig() {
		NET_CFG_COAXIAL_LIGHT_INFO cfgData = new NET_CFG_COAXIAL_LIGHT_INFO();
		int emCfgOpType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_COAXIAL_LIGHT;
		int nChannelID = -1;

		if(INetSDK.GetConfig(__LoginHandle, emCfgOpType, nChannelID, cfgData, 3000, null)) {
			ToolKits.writeLog("bEnable " + cfgData.bEnable);

			for(int i = 0; i < FinalVar.SDK_TSCHE_DAY_NUM; i++) {
				for(int j = 0; j < FinalVar.SDK_TSCHE_SEC_NUM; j++) {
					ToolKits.writeLog("stuTimeSection : " + cfgData.stuTimeSection[i][j].toStartString() + "   " +  cfgData.stuTimeSection[i][j].toEndString());
				}
			}

			INetSDK.SetConfig(__LoginHandle, emCfgOpType, nChannelID, cfgData, 3000, null, null);
		} else {
			ToolKits.writeErrorLog("GetConfig Failed!");
		}
	}

	// PIR配置
	public void PirAlarmParaConfigm() {
		//////////// 获取PIR配置 ////////////////
		// 入参
		NET_IN_GET_PIR_ALARM_PARAM inGet = new NET_IN_GET_PIR_ALARM_PARAM();
		inGet.nChannel = 0; // 通道号

		// 出参
		NET_OUT_GET_PIR_ALARM_PARAM outGet = new NET_OUT_GET_PIR_ALARM_PARAM();

		if(INetSDK.GetPirAlarmParam(__LoginHandle, inGet, outGet, 3000)) {
			ToolKits.writeLog("bEnable:" + outGet.stPirAlarmInfo.bEnable);
			for(int i = 0; i < outGet.stPirAlarmInfo.nDetectWindowCount; i++) {
				ToolKits.writeLog("stDetectWindow:" + outGet.stPirAlarmInfo.stDetectWindow[i].toString());
			}
			ToolKits.writeLog("stPirLink:" + outGet.stPirAlarmInfo.stPirLink.toString());


			///////////// 设置PIR配置 ///////////////
			if(outGet.stPirAlarmInfo.bEnable) {
				outGet.stPirAlarmInfo.bEnable = false;
			} else {
				outGet.stPirAlarmInfo.bEnable = true;
			}

			// 入参
			NET_IN_SET_PIR_ALARM_PARAM inSet = new NET_IN_SET_PIR_ALARM_PARAM();
			inSet.nChannel = 0; // 通道号
			inSet.stPirAlarmInfo = outGet.stPirAlarmInfo;

			// 出参
			NET_OUT_SET_PIR_ALARM_PARAM outSet = new NET_OUT_SET_PIR_ALARM_PARAM();

			if(INetSDK.SetPirAlarmParam(__LoginHandle, inSet, outSet, 3000)) {
				ToolKits.writeLog("SetPirAlarmParam Succeed!");
			} else {
				ToolKits.writeErrorLog("SetPirAlarmParam Failed!");
			}


		} else {
			ToolKits.writeErrorLog("GetPirAlarmParam Failed!");
		}
	}

	// 查询设备通道信息，判断 是 cvi 还是 ipc
	public void QueryDevChannelInfo() {
		NET_DEV_CHN_COUNT_INFO channelInfo = new NET_DEV_CHN_COUNT_INFO();
		if(INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_DEV_CHN_COUNT, channelInfo, 3000)) {
			//  如果 nCurLocal = 4，那么CVI通道就是 0~3；    如果 nCurRemote = 4， 那么ipc通道就是 4 ~ 7
			ToolKits.writeLog("CVI通道:" + channelInfo.stuVideoIn.nCurLocal);       // 表示前N个是CVI通道
			ToolKits.writeLog("IPC通道:" + channelInfo.stuVideoIn.nCurRemote);      // 表示N ~ N+X 个通道是IPC通道
		}
	}

	public void ResetPassword()
	{
		NET_IN_DESCRIPTION_FOR_RESET_PWD stIn = new NET_IN_DESCRIPTION_FOR_RESET_PWD();
		// 设备mac地址
		String mac = "E0:50:8B:69:A7:DD";
		System.arraycopy(mac.getBytes(), 0, stIn.szMac, 0, mac.getBytes().length);

		// 用户名
		String usrName = "admin";
		System.arraycopy(usrName.getBytes(), 0, stIn.szUserName, 0, usrName.getBytes().length);

		// 设备初始化状态,根据搜索返回的
		stIn.byInitStatus = (byte)-122;

		/**
		 * 出参
		 */

		// 二维码信息长度，用户需要自己设置
		int nQrCodeLen = 1024;
		NET_OUT_DESCRIPTION_FOR_RESET_PWD stOut = new NET_OUT_DESCRIPTION_FOR_RESET_PWD(nQrCodeLen);

		if(INetSDK.GetDescriptionForResetPwd(stIn, stOut, 10000, null)) {
			ToolKits.writeLog("预留手机号:" + new String(stOut.szCellPhone).trim());
			ToolKits.writeLog("预留邮箱:" + new String(stOut.szMailAddr).trim());
			ToolKits.writeLog("维码信息:" + new String(stOut.pQrCode).trim());
		} else {
			ToolKits.writeErrorLog("GetDescriptionForResetPwd Failed!");
		}

	}

	public  void queueUnifiedinfcollectCapsTest()
	{
		boolean bRet = false;
		NET_IN_UNIFIEDINFOCOLLECT_CAPS stIn = new NET_IN_UNIFIEDINFOCOLLECT_CAPS();
		NET_OUT_UNIFIEDINFOCOLLECT_CAPS stOut = new NET_OUT_UNIFIEDINFOCOLLECT_CAPS();
		bRet = INetSDK.GetDevCaps(__LoginHandle, FinalVar.NET_UNIFIEDINFOCOLLECT_CAPS, stIn, stOut, 3000);
		if(bRet) {
			ToolKits.writeLog("queueUnifiedinfcollectCapsTest Succeed!");
			ToolKits.writeLog("bSupportUnifiedInfoCollect：" +stOut.bSupportUnifiedInfoCollect + "\n");

		} else {
			ToolKits.writeErrorLog("queueUnifiedinfcollectCapsTest Failed!");
		}
	}
// 获取电池相机的工作模式能力
	public void TestGetWorkModeCaps(){

		boolean bRet = false;
		NET_IN_GET_WORK_MODE_CAPS pInParam=new NET_IN_GET_WORK_MODE_CAPS();
		NET_OUT_GET_WORK_MODE_CAPS pOutParam=new NET_OUT_GET_WORK_MODE_CAPS();
		//获取电池相机的工作模式能力
		bRet = INetSDK.GetWorkModeCaps(__LoginHandle, pInParam, pOutParam,5000);
		if(bRet) {
			ToolKits.writeLog("GetWorkModeCaps Succeed!");
			ToolKits.writeLog("bSupportWorkMode：" + pOutParam.bSupportWorkMode);
			ToolKits.writeLog("nWorkModesCount：" + pOutParam.nWorkModesCount);
		//EM_WORK_MODE
			int[] emWorkModes
					= pOutParam.emWorkModes;

			for(int i=0;i<emWorkModes.length;i++){
				ToolKits.writeLog("emWorkModes["+i+"]:" + emWorkModes[i]);
			}

		} else {
			ToolKits.writeErrorLog("devAudioDecodegetCaps Failed!");
		}


	}

	public void querySmartEncodeCaps()
	{
		boolean bRet = false;
		NET_IN_SMART_ENCODE_CAPS stIn = new NET_IN_SMART_ENCODE_CAPS(2);
		stIn.nChannel = 0;
		NET_OUT_SMART_ENCODE_CAPS stOut = new NET_OUT_SMART_ENCODE_CAPS(4);

		bRet = INetSDK.QueryDevInfo(__LoginHandle, FinalVar.NET_QUERY_SMART_ENCODE_CAPS, stIn, stOut, null, 3000);

		if(bRet) {
			ToolKits.writeLog("stIn = " + stIn.toString());
			ToolKits.writeLog("stOut = " + stOut.toString());
		} else {
			ToolKits.writeErrorLog("QueryDevInfo Failed!");
		}
	}


	public void devAudioDecodegetCaps()
	{
		boolean bRet = false;
		NET_IN_SUPPORT_GET_AUDIO_DECODE_CAPS pInParam = new NET_IN_SUPPORT_GET_AUDIO_DECODE_CAPS();

		NET_OUT_SUPPORT_GET_AUDIO_DECODE_CAPS pOutParam = new  NET_OUT_SUPPORT_GET_AUDIO_DECODE_CAPS();

		//获取设备是否支持音频解码能力获取, pInBuf =NET_IN_SUPPORT_GET_AUDIO_DECODE_CAPS* ,pOutBuf=NET_OUT_SUPPORT_GET_AUDIO_DECODE_CAPS*
		bRet = INetSDK.GetDevCaps(__LoginHandle,FinalVar.NET_SUPPORT_GET_AUDIO_DECODE_CAPS, pInParam, pOutParam,5000);//    NET_SUPPORT_GET_AUDIO_DECODE_CAPS
		if(bRet) {
			ToolKits.writeLog("devAudioDecodegetCaps Succeed!");
			ToolKits.writeLog("szVersion：" + pOutParam.bSupport );

		} else {
			ToolKits.writeErrorLog("devAudioDecodegetCaps Failed!");
		}

		NET_IN_AUDIO_DECODE_CAPS inStoregeDevInfos = new NET_IN_AUDIO_DECODE_CAPS();
		inStoregeDevInfos.nChannel = 0;
		inStoregeDevInfos.emSourceType = 0;
		NET_OUT_AUDIO_DECODE_CAPS mOutStorageDevInfo = new NET_OUT_AUDIO_DECODE_CAPS();
		//// 获取音频解码能力集, pInBuf = NET_IN_AUDIO_DECODE_CAPS*, pOutBuf = NET_OUT_AUDIO_DECODE_CAPS*
		bRet = INetSDK.QueryDevInfo(__LoginHandle, FinalVar.NET_QUERY_AUDIO_DECODE_CAPS, inStoregeDevInfos, mOutStorageDevInfo, null, 3000);
		if(bRet) {
			ToolKits.writeLog("QueryDevInfo Succeed!");
			ToolKits.writeLog("nFormatsRet：" + mOutStorageDevInfo.nFormatsRet );

		} else {
			ToolKits.writeErrorLog("QueryDevInfo Failed!");
		}
	}


	public void RemoteDeviceInfogetCaps() {
		boolean bRet = false;
		NET_IN_REMOTE_COLLECT_DEVINFO_CAPS pInParam = new NET_IN_REMOTE_COLLECT_DEVINFO_CAPS();

		NET_OUT_REMOTE_COLLECT_DEVINFO_CAPS pOutParam = new NET_OUT_REMOTE_COLLECT_DEVINFO_CAPS();

		bRet = INetSDK.GetDevCaps(__LoginHandle, FinalVar.NET_REMOTE_COLLECT_DEVINFO_CAPS, pInParam, pOutParam, 5000);//    NET_SUPPORT_GET_AUDIO_DECODE_CAPS
		if (bRet) {
			ToolKits.writeLog("RemoteDeviceInfogetCaps Succeed!");
			ToolKits.writeLog("bSupportRemoteCollectSniffer：" + pOutParam.bSupportRemoteCollectSniffer);
			ToolKits.writeLog("bSupportRemoteCollectLog：" + pOutParam.bSupportRemoteCollectLog);

		} else {
			ToolKits.writeErrorLog("RemoteDeviceInfogetCaps Failed!");
		}
	}


	public void GetRemoteCollectDevInfo() {
		boolean bRet = false;
		NET_IN_GET_REMOTE_COLLECT_DEV_INFO pInParam = new NET_IN_GET_REMOTE_COLLECT_DEV_INFO();
		pInParam.nChannel = 0;

		NET_OUT_GET_REMOTE_COLLECT_DEV_INFO pOutParam = new NET_OUT_GET_REMOTE_COLLECT_DEV_INFO();

		bRet = INetSDK.GetRemoteCollectDevInfo(__LoginHandle, pInParam, pOutParam, 5000);
		if (bRet) {
			ToolKits.writeLog("GetRemoteCollectDevInfo Succeed!");
			ToolKits.writeLog("nInfoNum：" + pOutParam.nInfoNum);
			ToolKits.writeLog("szFilePath：" + new String(pOutParam.stuInfos[0].stuFileInfos[0].szFilePath).trim());
			NET_IN_DOWNLOAD_PIECE_FILE pInParam1 = new NET_IN_DOWNLOAD_PIECE_FILE();
			pInParam1.nOffSet = 0;
			pInParam1.nNeedLength = 2*1024*1024;
			System.arraycopy(pOutParam.stuInfos[0].stuFileInfos[0].szFilePath, 0, pInParam1.szFileName, 0, 259);
			NET_OUT_DOWNLOAD_PIECE_FILE pOutParam1 = new NET_OUT_DOWNLOAD_PIECE_FILE(2*1024*1024);

			bRet = INetSDK.DownloadPieceFile(__LoginHandle, pInParam1, pOutParam1, 5000);
			if (bRet) {
				ToolKits.writeLog("DownloadPieceFile Succeed!");

			} else {
				ToolKits.writeErrorLog("GetRemoteCollectDevInfo Failed!");
			}
		} else {
			ToolKits.writeErrorLog("GetRemoteCollectDevInfo Failed!");
		}
	}

	private long StartRemoteCollectToFileHnadle = 0;
	public void StartRemoteCollectToFile() {
		boolean bRet = false;
		NET_IN_START_REMOTE_COLLECT_TO_FILE pInParam = new NET_IN_START_REMOTE_COLLECT_TO_FILE();
		pInParam.nChannel = 0;
		pInParam.nRuleNum = 2;
		pInParam.stuRules[0].emType = NET_EM_REMOTE_COLLECT_TYPE.NET_EM_REMOTE_COLLECT_TYPE_LOG;
		pInParam.stuRules[0].emLevel = NET_EM_REMOTE_COLLECT_LOG_LEVEL.NET_EM_REMOTE_COLLECT_LOG_LEVEL_TRACE;

		pInParam.stuRules[1].emType = NET_EM_REMOTE_COLLECT_TYPE.NET_EM_REMOTE_COLLECT_TYPE_CAPTURE;
		String szNetworkCard = "eth0";
		System.arraycopy(szNetworkCard.getBytes(), 0, pInParam.stuRules[1].szNetworkCard, 0,szNetworkCard.getBytes().length);
		pInParam.stuRules[1].emSrcPortFilter = NET_EM_PROT_FILTER_TYPE.NET_EM_PROT_FILTER_TYPE_EXCLUDE;
		pInParam.stuRules[1].nSrcPortNum = 1;
		pInParam.stuRules[1].nSrcPorts[0] = 37777;
		pInParam.stuRules[1].emDstPortFilter = NET_EM_PROT_FILTER_TYPE.NET_EM_PROT_FILTER_TYPE_INCLUDE;
		pInParam.stuRules[1].nDstPortNum = 1;
		pInParam.stuRules[1].nDstPorts[0] = 37777;

		NET_OUT_START_REMOTE_COLLECT_TO_FILE pOutParam = new NET_OUT_START_REMOTE_COLLECT_TO_FILE();

		StartRemoteCollectToFileHnadle = INetSDK.StartRemoteCollectToFile(__LoginHandle, pInParam, pOutParam, 5000);
		if (StartRemoteCollectToFileHnadle!=0) {
			ToolKits.writeLog("StartRemoteCollectToFile Succeed!,StartRemoteCollectToFileHnadle:" + StartRemoteCollectToFileHnadle);

		} else {
			ToolKits.writeErrorLog("StartRemoteCollectToFile Failed!");
		}
	}

	public void StopRemoteCollectToFile() {
		if (StartRemoteCollectToFileHnadle != 0) {
			ToolKits.writeLog("StopRemoteCollectToFile,StartRemoteCollectToFileHnadle:" + StartRemoteCollectToFileHnadle);
			boolean bRet = INetSDK.StopRemoteCollectToFile(StartRemoteCollectToFileHnadle);
			if (bRet) {
				ToolKits.writeLog("StopRemoteCollectToFile Succeed!");
			} else {
				ToolKits.writeErrorLog("StopRemoteCollectToFile Failed!");
			}
		}
	}

	public void RemotePreUploadFile() {
		boolean bRet = false;
		NET_IN_REMOTE_SPEAK_CAPS pInParam = new NET_IN_REMOTE_SPEAK_CAPS();
		pInParam.nChannelNum = 1;
		pInParam.nChannels[0] = 2;
		NET_OUT_REMOTE_SPEAK_CAPS pOutParam = new NET_OUT_REMOTE_SPEAK_CAPS(2);
		pOutParam.nMaxCapNum = 2;

		bRet = INetSDK.GetDevCaps(__LoginHandle, FinalVar.NET_REMOTE_SPEAK_CAPS, pInParam, pOutParam, 5000);//    NET_REMOTE_SPEAK_CAPS
		if (bRet) {
			ToolKits.writeLog("RemoteSpeackCaps Succeed!");
			ToolKits.writeLog("RemoteSpeackCaps：" + pOutParam.nRetCapNum);
			ToolKits.writeLog("RemoteSpeackCaps：pOutParam.pstuCaps[0].stuAudioPlayPaths[0].szPath:" + new String(pOutParam.pstuCaps[0].stuAudioPlayPaths[0].szPath).trim()
					+ ",bSupportUpload:" +pOutParam.pstuCaps[0].stuAudioPlayPaths[0].bSupportUpload + ",nMaxFileUploadNum:" +pOutParam.pstuCaps[0].stuAudioPlayPaths[0].nMaxFileUploadNum + ",nMaxUploadFileSize:" + pOutParam.pstuCaps[0].stuAudioPlayPaths[0].nMaxUploadFileSize);

		} else {
			ToolKits.writeErrorLog("RemoteSpeackCaps Failed!");
			return;
		}
		if (pOutParam.nRetCapNum == 0)
		{
			return;
		}
		NET_IN_REMOTE_PREUPLOAD_FILE pInParam1 = new NET_IN_REMOTE_PREUPLOAD_FILE();
		pInParam1.nChannel = 2;
		String strpath = getExternalFilesDir(null).getAbsolutePath() + "/detection.wav";
		String strName = "detection.wav";
		System.arraycopy(strpath.getBytes(), 0, pInParam1.szFileSrc, 0, strpath.getBytes().length);
		System.arraycopy(strName.getBytes(), 0, pInParam1.szFileNameDst, 0, strName.getBytes().length);

		System.arraycopy(pOutParam.pstuCaps[0].stuAudioPlayPaths[0].szPath, 0, pInParam1.szFolderDst, 0, pOutParam.pstuCaps[0].stuAudioPlayPaths[0].szPath.length);

		NET_OUT_REMOTE_PREUPLOAD_FILE pOutParam1 = new NET_OUT_REMOTE_PREUPLOAD_FILE();

		bRet = INetSDK.RemotePreUploadFile(__LoginHandle, pInParam1, pOutParam1, 5000);
		if (bRet) {
			ToolKits.writeLog("RemotePreUploadFile Succeed!");
			ToolKits.writeLog("bContinue2Upload：" + pOutParam1.bContinue2Upload);
			ToolKits.writeLog("emType:" + pOutParam1.emType);

		} else {
			ToolKits.writeErrorLog("RemotePreUploadFile Failed!");
		}
	}
	public class TestUploadFile implements CB_fRemoteUploadFileCallBack {
		@Override
		public void invoke(long lRemoteUploadFileID, int nTotalSize,int nSendSize, int emStatus) {
			ToolKits.writeLog("TestUploadFile success,lRemoteUploadFileID:" + lRemoteUploadFileID + "nTotalSize:" + nTotalSize + "nSendSize:" + nSendSize + "emStatus:" + emStatus);
		}
	}
	private long StartRemoteUploadFileHnadle = 0;
	public void StartRemoteUploadFile() {
		boolean bRet = false;
		NET_IN_REMOTE_SPEAK_CAPS pInParam = new NET_IN_REMOTE_SPEAK_CAPS();
		pInParam.nChannelNum = 1;
		pInParam.nChannels[0] = 2;
		NET_OUT_REMOTE_SPEAK_CAPS pOutParam = new NET_OUT_REMOTE_SPEAK_CAPS(1);

		bRet = INetSDK.GetDevCaps(__LoginHandle, FinalVar.NET_REMOTE_SPEAK_CAPS, pInParam, pOutParam, 5000);//    NET_REMOTE_SPEAK_CAPS
		if (bRet) {
			ToolKits.writeLog("RemoteSpeackCaps Succeed!");
			ToolKits.writeLog("RemoteSpeackCaps：" + pOutParam.nRetCapNum);

		} else {
			ToolKits.writeErrorLog("RemoteSpeackCaps Failed!");
		}

		NET_IN_REMOTE_UPLOAD_FILE pInParam1 = new NET_IN_REMOTE_UPLOAD_FILE();
		pInParam1.nChannel = 2;
		String strpath = getExternalFilesDir(null).getAbsolutePath() + "/detection.wav";
		String strName = "detection.wav";
		System.arraycopy(strpath.getBytes(), 0, pInParam1.szFileSrc, 0, strpath.getBytes().length);
		System.arraycopy(strName.getBytes(), 0, pInParam1.szFileNameDst, 0, strName.getBytes().length);
		System.arraycopy(pOutParam.pstuCaps[0].stuAudioPlayPaths[0].szPath, 0, pInParam1.szFolderDst, 0, pOutParam.pstuCaps[0].stuAudioPlayPaths[0].szPath.length);
		pInParam1.cbUploadFile = new TestUploadFile();
		pInParam1.nPacketLen = 0;

		NET_OUT_REMOTE_UPLOAD_FILE pOutParam1 = new NET_OUT_REMOTE_UPLOAD_FILE();

		StartRemoteUploadFileHnadle = INetSDK.StartRemoteUploadFile(__LoginHandle, pInParam1, pOutParam1, 5000);
		if (StartRemoteUploadFileHnadle!=0) {
			ToolKits.writeLog("StartRemoteUploadFile Succeed!,StartRemoteCollectToFileHnadle:" + StartRemoteUploadFileHnadle);

		} else {
			ToolKits.writeErrorLog("StartRemoteUploadFile Failed!");
		}
	}

	public void StopRemoteUploadFile() {
		if (StartRemoteUploadFileHnadle != 0) {
			ToolKits.writeLog("StopRemoteUploadFile,StartRemoteUploadFileHnadle:" + StartRemoteUploadFileHnadle);
			boolean bRet = INetSDK.StopRemoteUploadFile(StartRemoteUploadFileHnadle);
			if (bRet) {
				ToolKits.writeLog("StopRemoteUploadFile Succeed!");
			} else {
				ToolKits.writeErrorLog("StopRemoteUploadFile Failed!");
			}
		}
	}

	public void WlanCaps(){
		boolean bRet = false;
		NET_IN_WLAN_CAPS_INFO pInParam = new NET_IN_WLAN_CAPS_INFO();
		NET_OUT_WLAN_CAPS_INFO pOutParam = new NET_OUT_WLAN_CAPS_INFO();

		bRet = INetSDK.GetDevCaps(__LoginHandle, FinalVar.NET_WLAN_CAPS, pInParam, pOutParam, 5000);//    NET_REMOTE_SPEAK_CAPS
		if (bRet) {
			ToolKits.writeLog("WlanCaps Succeed!");
			ToolKits.writeLog("WlanCaps：" + pOutParam.bIgnoreNetCardToConn);
			ToolKits.writeLog("nRetWifiCapsNum：" + pOutParam.nRetWifiCapsNum);
			ToolKits.writeLog("emWifiCaps[0]：" + pOutParam.emWifiCaps[0]);

		} else {
			ToolKits.writeErrorLog("WlanCaps Failed!");
			return;
		}
	}

	public void SetWlanConfigInfo(){
		boolean bRet = false;
		NET_IN_WLAN_CONFIG_INFO pInParam = new NET_IN_WLAN_CONFIG_INFO();
		String BSSID = "12";
		System.arraycopy(BSSID.getBytes(), 0, pInParam.szBSSID, 0, BSSID.getBytes().length);

		String SSID = "12";
		System.arraycopy(SSID.getBytes(), 0, pInParam.szSSID, 0, SSID.getBytes().length);

		String key1 = "12";
		System.arraycopy(key1.getBytes(), 0, pInParam.szKeys[0], 0, key1.getBytes().length);

		String key2 = "12";
		System.arraycopy(key2.getBytes(), 0, pInParam.szKeys[1], 0, key2.getBytes().length);
		pInParam.nChannel = 0;
		pInParam.nKeyID = 0;
		pInParam.emEncryption = EM_WLAN_ENCRYPTION_TYPE.EM_ENCRYPTION_TYPE_AUTO;
		NET_OUT_WLAN_CONFIG_INFO pOutParam = new NET_OUT_WLAN_CONFIG_INFO();

		bRet = INetSDK.SetWlanConfigInfo(__LoginHandle, pInParam, pOutParam, 5000);
		if (bRet) {
			ToolKits.writeLog("SetWlanConfigInfo Succeed!");

		} else {
			ToolKits.writeErrorLog("SetWlanConfigInfo Failed!");
			return;
		}
	}

	public void WifiInstallParamConfig() {
		// 获取
		NET_CFG_WIFI_INSTALL_PARAM msg = new NET_CFG_WIFI_INSTALL_PARAM();
		int nType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_WIFI_INSTALL_PARAM;
		int nChannelID = -1;

		if(INetSDK.GetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null)) {
			ToolKits.writeLog("Get WifiInstallParamConfig Succeed!");
			ToolKits.writeLog("szCountry:" + new String(msg.szCountry).trim());
			ToolKits.writeLog("emMountMode:" + msg.emMountMode);

			// 设置
			System.arraycopy("CA".getBytes(), 0, msg.szCountry, 0, "CA".getBytes().length);
			ToolKits.writeLog("set szCountry:" + new String(msg.szCountry).trim());
			if(msg.emMountMode ==  EM_MOUNT_MODE.EM_MOUNT_MODE_INDOOR)
			{
				msg.emMountMode = EM_MOUNT_MODE.EM_MOUNT_MODE_OUTDOOR;
			}
			else if (msg.emMountMode ==  EM_MOUNT_MODE.EM_MOUNT_MODE_OUTDOOR) {
				msg.emMountMode = EM_MOUNT_MODE.EM_MOUNT_MODE_INDOOR;
			}
			else {
				msg.emMountMode = EM_MOUNT_MODE.EM_MOUNT_MODE_INDOOR;
			}

			if(INetSDK.SetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null, null)) {
				ToolKits.writeLog("Set WifiInstallParamConfig Succeed!");
				NET_CFG_WIFI_INSTALL_PARAM msg1 = new NET_CFG_WIFI_INSTALL_PARAM();
				if(INetSDK.GetConfig(__LoginHandle, nType, nChannelID, msg1, _waittime, null)) {
					ToolKits.writeLog("Get WifiInstallParamConfig Succeed!");
					ToolKits.writeLog("get szCountry:" + new String(msg.szCountry).trim());
					ToolKits.writeLog("emMountMode:" + msg.emMountMode);
				}
			} else {
				ToolKits.writeErrorLog("Set WifiInstallParamConfig Failed!, error is" + INetSDK.GetLastError());
			}
		} else {
			ToolKits.writeErrorLog("Get WifiInstallParamConfig Failed!,error is" + INetSDK.GetLastError());
		}
	}

	void VideoTalkPhoneGeneralConfig(){
		CFG_VIDEO_TALK_PHONE_GENERAL stCfg = new CFG_VIDEO_TALK_PHONE_GENERAL();

		/**
		 *
		 * 获取
		 */
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEO_TALK_PHONE_GENERAL, stCfg, __LoginHandle, -1, 10240);
		if (zRet) {

			ToolKits.writeLog("CFG_CMD_VIDEO_TALK_PHONE_GENERAL success,bLeaveMessageUpload:" + stCfg.bLeaveMessageUpload + ",nMaxLeaveWordTime:" + stCfg.stuTimeLimit[0].nMaxLeaveWordTime);
			if(stCfg.bLeaveMessageUpload == true)
			{
				stCfg.bLeaveMessageUpload = false;
			}
			else
			{
				stCfg.bLeaveMessageUpload = true;
			}
			stCfg.stuTimeLimit[0].nMaxLeaveWordTime += 1;
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEO_TALK_PHONE_GENERAL, stCfg, __LoginHandle, -1, 10240);
			if(zRet)
			{
				ToolKits.writeLog("SetDevConfig-CFG_CMD_VIDEO_TALK_PHONE_GENERAL success");
			}
			else
			{
				ToolKits.writeLog("SetDevConfig-CFG_CMD_VIDEO_TALK_PHONE_GENERAL failed");
			}
		}
		else{
			ToolKits.writeLog("GetDevConfig-CFG_CMD_VIDEO_TALK_PHONE_GENERAL failed");
		}
	}

	void FindMarkFile() {
		String logFile = getExternalFilesDir(null).getAbsolutePath() + "/sdk.log";    // 手机或者平板可访问的存储路径
		LOG_SET_PRINT_INFO logInfo = new LOG_SET_PRINT_INFO();
		logInfo.bSetPrintStrategy = false;
		logInfo.nPrintStrategy = 0; // 0 - Saved as file. 1 - show log in the console.
		logInfo.bSetFilePath = true;
		System.arraycopy(logFile.getBytes(), 0, logInfo.szLogFilePath, 0, logFile.length());

		INetSDK.LogOpen(logInfo);

		boolean bRet = false;
		// 获取标记录像信息
		NET_IN_MEDIA_QUERY_FILE infile = new NET_IN_MEDIA_QUERY_FILE();
		infile.stuStartTime.dwYear = 2020;
		infile.stuStartTime.dwMonth = 5;
		infile.stuStartTime.dwDay = 1;
		infile.stuStartTime.dwHour = 0;
		infile.stuStartTime.dwMinute = 0;
		infile.stuStartTime.dwSecond = 0;

		infile.stuEndTime.dwYear = 2020;
		infile.stuEndTime.dwMonth = 5;
		infile.stuEndTime.dwDay = 27;
		infile.stuEndTime.dwHour = 23;
		infile.stuEndTime.dwMinute = 59;
		infile.stuEndTime.dwSecond = 59;

		infile.szDirs = "";
		infile.nMediaType = 2;
		infile.nChannelID = 0;
		infile.byVideoStream = 1;

		long lFindHandle = INetSDK.FindFileEx(__LoginHandle, EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FILE, infile, 30000);
		if (lFindHandle != 0) {
			ToolKits.writeLog("FindFileEx Succeed!");
		} else {
			ToolKits.writeErrorLog("FindFileEx Failed!");
		}

		NET_OUT_MEDIA_QUERY_FILE[] outfile = new NET_OUT_MEDIA_QUERY_FILE[10];
		for (int i = 0; i < 10; i++) {
			outfile[i] = new NET_OUT_MEDIA_QUERY_FILE();
		}

		int nCount = 0;
		int nMaxCount = 10;
		int nRetCount = 0;
		while (true) {
			nRetCount = INetSDK.FindNextFileEx(lFindHandle, EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_FILE, outfile, 10000);
			if (nRetCount <= 0) {
				ToolKits.writeErrorLog("FindNextFileEx Failed!,LastError:" +INetSDK.GetLastError());
				return;
			}

			for (int i = 0; i < nRetCount; i++) {
				ToolKits.writeLog("---------------[ " + (i + nMaxCount * nCount) + "] -----------------");
				ToolKits.writeLog("文件路径：" + new String(outfile[i].szFilePath).trim());
				ToolKits.writeLog("文件类型:" + outfile[i].byFileType);

				ToolKits.writeLog("事件总数：" + outfile[i].nEventCount);
				for (int j = 0; j < outfile[i].nEventCount; j++) {
					ToolKits.writeLog("事件：" + outfile[i].nEventLists[j]);
				}

				ToolKits.writeLog("文件摘要信息数：" + outfile[i].nFileSummaryNum);
				for (int j = 0; j < outfile[i].nFileSummaryNum; j++) {
					ToolKits.writeLog("摘要内容：" + new String(outfile[i].stFileSummaryInfo[j].szKey).trim());
				}

				ToolKits.writeLog("文件标志总数：" + outfile[i].nFalgCount);
				for (int j = 0; j < outfile[i].nFalgCount; j++) {
					ToolKits.writeLog("标志文件：" + outfile[i].emFalgLists[j]);
				}
				ToolKits.writeLog("outfile[" + i +"]:" + new String(outfile[i].szThumbnail).trim());
			}

			if (nRetCount <= nMaxCount) {
				break;
			} else {
				nCount++;
			}
		}

		INetSDK.FindCloseEx(lFindHandle);
	}
	public void getMonitorWallCollections()
	{
		SDK_IN_WM_GET_COLLECTIONS sdk_in_wm_get_collections = new SDK_IN_WM_GET_COLLECTIONS();
		sdk_in_wm_get_collections.nMonitorWallID = 0;
		SDK_OUT_WM_GET_COLLECTIONS sdk_out_wm_get_collections = new SDK_OUT_WM_GET_COLLECTIONS(5);
		boolean getMonitorWallCollections = INetSDK.GetMonitorWallCollections(__LoginHandle, sdk_in_wm_get_collections, sdk_out_wm_get_collections, 3000);
		if (getMonitorWallCollections)
		{
			ToolKits.writeLog("GetMonitorWallCollections success");
			ToolKits.writeLog("sdk_out_wm_get_collections.pCollections[0].stuBlocks[0].szCompositeID).trim():" + new String(sdk_out_wm_get_collections.pCollections[0].stuBlocks[0].szCompositeID).trim());
		}
		else
		{
			ToolKits.writeLog("GetMonitorWallCollections failed,lasterror:" + INetSDK.GetLastError());
		}

	}

	public void AttachLowRateWPANTest()
	{
		NET_IN_ATTACH_LOWRATEWPAN pInParam = new NET_IN_ATTACH_LOWRATEWPAN();
		pInParam.cbAttachLowRateWPANCB = new TestfAttachLowRateWPANCallBack();

		NET_OUT_ATTACH_LOWRATEWPAN pOutParam = new  NET_OUT_ATTACH_LOWRATEWPAN();
		// NET_IN_ATTACH_LOWRATEWPAN pInParam, NET_OUT_ATTACH_LOWRATEWPAN
		long lRet = 0;
		//CLIENT_NET_API LLONG CALL_METHOD CLIENT_AttachLowRateWPAN(LLONG lLoginID, const NET_IN_ATTACH_LOWRATEWPAN* pstInParam, NET_OUT_ATTACH_LOWRATEWPAN* pstOutParam, int nWaitTime = 3000);

		lRet = INetSDK.AttachLowRateWPAN(__LoginHandle,pInParam,pOutParam, 5000);
		if(lRet != 0) {
			ToolKits.writeLog("AttachLowRateWPANTest Succeed!");
		} else {
			ToolKits.writeErrorLog("AttachLowRateWPANTest Failed!");
		}
	}

	public void GetUnifiedStatusTest()
	{
		boolean bRet = false;
		NET_IN_UNIFIEDINFOCOLLECT_GET_DEVSTATUS pInParam = new NET_IN_UNIFIEDINFOCOLLECT_GET_DEVSTATUS();

		NET_OUT_UNIFIEDINFOCOLLECT_GET_DEVSTATUS pOutParam = new  NET_OUT_UNIFIEDINFOCOLLECT_GET_DEVSTATUS();
		bRet = INetSDK.GetUnifiedStatus(__LoginHandle,pInParam, pOutParam, 5000);
		if(bRet) {
			ToolKits.writeLog("GetUnifiedStatusTest Succeed!");
			ToolKits.writeLog("szVersion：" + new String(pOutParam.szVersion).trim() + "\n" +
					"emTamperState: " + pOutParam.emTamperState + "\n"
			);

		} else {
			ToolKits.writeErrorLog("GetUnifiedStatusTest Failed!");
		}
	}

	 // 初始化账户
	// web初始化，需要调用下面的俩个方法。
	 public void InitAccount() {
		 InitAccountSDK();
		 InitAccountWeb();
	 }

	public void InitAccountSDK() {
		boolean bRet = false;
		NET_IN_INIT_ACCOUNT inInit = new NET_IN_INIT_ACCOUNT();
		String username = "admin";
		System.arraycopy(username.getBytes(), 0, inInit.szUser, 0, username.getBytes().length);

		String password = "admin123";
		System.arraycopy(password.getBytes(), 0, inInit.szPwd, 0, password.getBytes().length);

		String mac = "3c:ef:8c:f8:31:89";
		System.arraycopy(mac.getBytes(), 0, inInit.szMac, 0, mac.getBytes().length);

		inInit.emAccountType = EM_ACCOUNT_TYPE.EM_ACCOUNT_TYPE_SDK;

		NET_OUT_INIT_ACCOUNT outInit = new NET_OUT_INIT_ACCOUNT();

		bRet = INetSDK.InitAccount(inInit, outInit, 5000, null);
		if(bRet) {
			ToolKits.writeLog("Init SDK Account Succeed!");
		} else {
			ToolKits.writeErrorLog("Init SDK Account Failed!");
		}
	}

	public void InitAccountWeb() {
		boolean bRet = false;
		NET_IN_INIT_ACCOUNT inInit = new NET_IN_INIT_ACCOUNT();
		String username = "admin";
		System.arraycopy(username.getBytes(), 0, inInit.szUser, 0, username.getBytes().length);

		String password = "admin123";
		System.arraycopy(password.getBytes(), 0, inInit.szPwd, 0, password.getBytes().length);

		String mac = "3c:ef:8c:f8:31:89";
		System.arraycopy(mac.getBytes(), 0, inInit.szMac, 0, mac.getBytes().length);

		inInit.emAccountType = EM_ACCOUNT_TYPE.EM_ACCOUNT_TYPE_WEB;

		NET_OUT_INIT_ACCOUNT outInit = new NET_OUT_INIT_ACCOUNT();

		bRet = INetSDK.InitAccount(inInit, outInit, 5000, null);
		if(bRet) {
			ToolKits.writeLog("Init WEB Account Succeed!");
		} else {
			ToolKits.writeErrorLog("Init WEB Account Failed!");
		}
	}

	// 重置WEB密码
	public void ResetWebPwd() {
		boolean bRet = false;
		NET_IN_REST_WEB_PWD inInit = new NET_IN_REST_WEB_PWD();
		String username = "admin";
		System.arraycopy(username.getBytes(), 0, inInit.szWebUser, 0, username.getBytes().length);
		String password = "admin12";
		System.arraycopy(password.getBytes(), 0, inInit.szWebPwd, 0, password.getBytes().length);

		NET_OUT_REST_WEB_PWD outInit = new NET_OUT_REST_WEB_PWD();

		bRet = INetSDK.ResetWebPwd(__LoginHandle, inInit, outInit, 15000);
		if(bRet) {
			ToolKits.writeLog("ResetWebPwd Succeed!");
		} else {
			ToolKits.writeErrorLog("ResetWebPwd Failed!");
		}
	}

	// 查询设备的存储模块信息列表
	public void QueryStorageInfo() {
		NET_IN_STORAGE_DEV_INFOS inStoregeDevInfos = new NET_IN_STORAGE_DEV_INFOS();
		inStoregeDevInfos.emVolumeType = NET_VOLUME_TYPE.VOLUME_TYPE_ALL;
		NET_OUT_STORAGE_DEV_INFOS mOutStorageDevInfo = new NET_OUT_STORAGE_DEV_INFOS();
		boolean nRet = INetSDK.QueryDevInfo(__LoginHandle, FinalVar.NET_QUERY_DEV_STORAGE_INFOS, inStoregeDevInfos, mOutStorageDevInfo, null, 3000);
		for (int i = 0; i < mOutStorageDevInfo.nDevInfosNum; i++) {

			long total = new Long(mOutStorageDevInfo.stuStoregeDevInfos[i].nTotalSpace);
			ToolKits.writeLog("total space " + mOutStorageDevInfo.stuStoregeDevInfos[i].nTotalSpace + "double " + total/1024.0/1024.0);
			ToolKits.writeLog("free space " + mOutStorageDevInfo.stuStoregeDevInfos[i].nFreeSpace);
		}
	}

	// 警戒线规则配置
	public void CrosslineRuleConfig() {
		boolean bRet = false;
		String szCommand = FinalVar.CFG_CMD_ANALYSERULE;
		CFG_ANALYSERULES_INFO analyserules = new CFG_ANALYSERULES_INFO(10);

		// 获取
		bRet = ToolKits.GetDevConfig(szCommand, analyserules, __LoginHandle, 0, 10 * 1024 * 1024);
		if(bRet) {
			ToolKits.writeLog("GetNewDevConfig Succeed!" + "\n" +
					"事件规则个数：" + analyserules.nRuleCount);

			for (int i = 0; i < analyserules.nRuleCount; i++) {
				ToolKits.writeLog("智能事件类型: " + analyserules.pRuleBuf[i].dwRuleType);
				ToolKits.writeLog("事规则编号：" + analyserules.pRuleBuf[i].stuRuleCommInfo.bRuleId);
				ToolKits.writeLog("规则所属的场景：" + analyserules.pRuleBuf[i].stuRuleCommInfo.emClassType);

				if (analyserules.pRuleBuf[i].dwRuleType == EVENT_IVS_CROSSLINEDETECTION) {

					CFG_CROSSLINE_INFO msg = (CFG_CROSSLINE_INFO) analyserules.pIvsRuleBuf[i];

					ToolKits.writeLog("规则名称：" + new String(msg.szRuleName).trim() + "\n" +
							"规则使能: " + msg.bRuleEnable + "\n");

					ToolKits.writeLog("跟踪使能:" + msg.bTrackEnable);

					if (msg.nDirection == 0) {
						ToolKits.writeLog("检测方向:由左至右");
					} else if (msg.nDirection == 1) {
						ToolKits.writeLog("检测方向:由右至左");
					} else if (msg.nDirection == 2) {
						ToolKits.writeLog("检测方向:由左至右 和 由右至左 都可以");
					}

					ToolKits.writeLog("警戒线坐标(规则框)：");
					for (int j = 0; j < msg.nDetectLinePoint; j++) {
						ToolKits.writeLog("X:" + msg.stuDetectLine[j].nX);
						ToolKits.writeLog("Y:" + msg.stuDetectLine[j].nY + "\n");
					}

					if (msg.bSizeFileter) {
						if (msg.stuSizeFileter.bFilterMinSizeEnable) {
							ToolKits.writeLog("物体最小尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuFilterMinSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuFilterMinSize.nHeight);
						}

						if (msg.stuSizeFileter.bFilterMaxSizeEnable)
							ToolKits.writeLog("物体最大尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuFilterMaxSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuFilterMaxSize.nHeight);

						if(msg.stuSizeFileter.abMinAreaSize) {
							ToolKits.writeLog("最小面积矩形框尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuMinAreaSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuMinAreaSize.nHeight);
						}

						if(msg.stuSizeFileter.abMaxAreaSize) {
							ToolKits.writeLog("最大面积矩形框尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuMaxAreaSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuMaxAreaSize.nHeight);
						}

						if(msg.stuSizeFileter.abMinRatioSize) {
							ToolKits.writeLog("最小宽高比矩形框尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuMinRatioSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuMinRatioSize.nHeight);
						}

						if(msg.stuSizeFileter.abMaxRatioSize) {
							ToolKits.writeLog("最大宽高比矩形框尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuMaxRatioSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuMaxRatioSize.nHeight);
						}
					}

					// 配置在此处

				}
			}

			// 配置
			boolean bRet2 = ToolKits.SetDevConfig(szCommand, analyserules, __LoginHandle, 0, 10 * 1024 * 1024);
			if (bRet2) {
				ToolKits.writeLog("setNewDevConfig Succeed!");
			} else {
				ToolKits.writeErrorLog("setNewDevConfig Failed!" );
			}
		} else {
			ToolKits.writeErrorLog("GetNewDevConfig Failed!" );
		}
	}

	public static long GetFileSize(String filePath) {
		File f = new File(filePath);
		if (f.exists() && f.isFile()) {
			return f.length();
		}
		else
		{
			return 0;
		}
	}

	public static void addPerson() {
		String groupId = "1";
		String personName = "周润发";
		String birthdays = "1976-10-13";
		int sex =1;
		int idType = 1;
		String idNo = "235258965485248565";
		String imagePath = Environment.getExternalStorageDirectory().getPath() + "/1.JPG";


				/**
                 * 入参
                 */
		NET_IN_OPERATE_FACERECONGNITIONDB stIn = new NET_IN_OPERATE_FACERECONGNITIONDB();
		// 添加人员信息和人脸样本，如果人员已经存在，图片数据和原来的数据合并
		stIn.emOperateType = EM_OPERATE_FACERECONGNITIONDB_TYPE.NET_FACERECONGNITIONDB_ADD;

		// 使用人员扩展信息
		stIn.bUsePersonInfoEx = true;

		// 人脸库ID
		System.arraycopy(groupId.getBytes(), 0, stIn.stPersonInfoEx.szGroupID, 0, groupId.getBytes().length);

		// 人员名称
		System.arraycopy(personName.getBytes(), 0, stIn.stPersonInfoEx.szPersonName, 0, personName.getBytes().length);

		// 生日
		if(!birthdays.isEmpty()) {
			String[] birthday = birthdays.split("-");

			stIn.stPersonInfoEx.wYear = (short)Integer.parseInt(birthday[0]);
			stIn.stPersonInfoEx.byMonth = (byte)Integer.parseInt(birthday[1]);
			stIn.stPersonInfoEx.byDay = (byte)Integer.parseInt(birthday[2]);
		}

		// 性别,1-男,2-女,作为查询条件时,此参数填0,则表示此参数无效
		stIn.stPersonInfoEx.bySex = (byte)sex;

		// 证件类型，0-未知，1-证件，2-护照
		stIn.stPersonInfoEx.byIDType = (byte)idType;

		// 证件号
		System.arraycopy(idNo.getBytes(), 0, stIn.stPersonInfoEx.szID, 0, idNo.getBytes().length);

		// 图片信息
		if(!imagePath.isEmpty()) {
			// 人脸图片数据
			stIn.pBuffer = imagePath;

			// 图片张数
			stIn.stPersonInfoEx.wFacePicNum = 1;

			// 图片大小
			stIn.stPersonInfoEx.szFacePicInfo[0].dwFileLenth = (int)GetFileSize(imagePath);

			// 图片偏移量
			stIn.stPersonInfoEx.szFacePicInfo[0].dwOffSet = 0;
		}
		/**
		 * 出参
		 */
		NET_OUT_OPERATE_FACERECONGNITIONDB stOut = new NET_OUT_OPERATE_FACERECONGNITIONDB();

		if(INetSDK.OperateFaceRecognitionDB(NetSDKApplication.getInstance().getLoginHandle(), stIn, stOut, 4000)) {
			// 添加成功后，设备会返回人员唯一标识符  szUID
			ToolKits.writeLog("人员唯一标识符：" + new String(stOut.szUID).trim());
		} else {
			ToolKits.writeErrorLog("添加人员失败！");
		}
	}
	// 警戒区规则配置
	public void CrossRegionRuleConfig() {
		boolean bRet = false;
		String szCommand = FinalVar.CFG_CMD_ANALYSERULE;
		CFG_ANALYSERULES_INFO analyserules = new CFG_ANALYSERULES_INFO(10);

		// 获取
		bRet = ToolKits.GetDevConfig(szCommand, analyserules, __LoginHandle, 0, 10 * 1024 * 1024);
		if(bRet) {
			ToolKits.writeLog("GetNewDevConfig Succeed!" + "\n" +
					"事件规则个数：" + analyserules.nRuleCount);

			for (int i = 0; i < analyserules.nRuleCount; i++) {
				ToolKits.writeLog("智能事件类型: " + analyserules.pRuleBuf[i].dwRuleType);
				ToolKits.writeLog("事规则编号：" + analyserules.pRuleBuf[i].stuRuleCommInfo.bRuleId);
				ToolKits.writeLog("规则所属的场景：" + analyserules.pRuleBuf[i].stuRuleCommInfo.emClassType);

				if (analyserules.pRuleBuf[i].dwRuleType == FinalVar.EVENT_IVS_CROSSREGIONDETECTION) {

					CFG_CROSSREGION_INFO msg = (CFG_CROSSREGION_INFO) analyserules.pIvsRuleBuf[i];

					ToolKits.writeLog("msg :" + msg);
					ToolKits.writeLog("pIvsRuleBuf :" + analyserules.pIvsRuleBuf[i]);

					ToolKits.writeLog("规则名称：" + new String(msg.szRuleName).trim() + "\n" +
							"规则使能: " + msg.bRuleEnable + "\n");

					ToolKits.writeLog("跟踪使能:" + msg.bTrackEnable);

					if (msg.nDirection == 0) {
						ToolKits.writeLog("检测方向:进入");
					} else if (msg.nDirection == 1) {
						ToolKits.writeLog("检测方向:离开");
					} else if (msg.nDirection == 2) {
						ToolKits.writeLog("检测方向:进入 和 离开 都可以");
					}

					for(int j = 0; j < msg.nActionType; j++) {
						if(msg.bActionType[j] == 0) {
							ToolKits.writeLog("检测动作 ： 出现");
						} else if(msg.bActionType[j] == 1) {
							ToolKits.writeLog("检测动作 ： 消失");
						} else if(msg.bActionType[j] == 2) {
							ToolKits.writeLog("检测动作 ： 在区域内");
						} else if(msg.bActionType[j] == 3) {
							ToolKits.writeLog("检测动作 ： 穿越区域");
						}
					}
					ToolKits.writeLog("检测动作列表:" + new String(msg.bActionType).trim());

					ToolKits.writeLog("警戒区坐标(规则框)：");
					for (int j = 0; j < msg.nDetectRegionPoint; j++) {
						ToolKits.writeLog("X:" + msg.stuDetectRegion[j].nX);
						ToolKits.writeLog("Y:" + msg.stuDetectRegion[j].nY + "\n");
					}

					if (msg.bSizeFileter) {
						if (msg.stuSizeFileter.bFilterMinSizeEnable) {
							ToolKits.writeLog("物体最小尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuFilterMinSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuFilterMinSize.nHeight);
						}

						if (msg.stuSizeFileter.bFilterMaxSizeEnable)
							ToolKits.writeLog("物体最大尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuFilterMaxSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuFilterMaxSize.nHeight);

						if(msg.stuSizeFileter.abMinAreaSize) {
							ToolKits.writeLog("最小面积矩形框尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuMinAreaSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuMinAreaSize.nHeight);
						}

						if(msg.stuSizeFileter.abMaxAreaSize) {
							ToolKits.writeLog("最大面积矩形框尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuMaxAreaSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuMaxAreaSize.nHeight);
						}

						if(msg.stuSizeFileter.abMinRatioSize) {
							ToolKits.writeLog("最小宽高比矩形框尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuMinRatioSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuMinRatioSize.nHeight);
						}

						if(msg.stuSizeFileter.abMaxRatioSize) {
							ToolKits.writeLog("最大宽高比矩形框尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuMaxRatioSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuMaxRatioSize.nHeight);
						}
					}

					// 配置在此处

				}
				else if (analyserules.pRuleBuf[i].dwRuleType == EVENT_IVS_CROSSLINEDETECTION) {

					CFG_CROSSLINE_INFO msg = (CFG_CROSSLINE_INFO) analyserules.pIvsRuleBuf[i];

					ToolKits.writeLog("规则名称：" + new String(msg.szRuleName).trim() + "\n" +
							"规则使能: " + msg.bRuleEnable + "\n");

					ToolKits.writeLog("跟踪使能:" + msg.bTrackEnable);

					if (msg.nDirection == 0) {
						ToolKits.writeLog("检测方向:由左至右");
					} else if (msg.nDirection == 1) {
						ToolKits.writeLog("检测方向:由右至左");
					} else if (msg.nDirection == 2) {
						ToolKits.writeLog("检测方向:由左至右 和 由右至左 都可以");
					}

					ToolKits.writeLog("警戒线坐标(规则框)：");
					for (int j = 0; j < msg.nDetectLinePoint; j++) {
						ToolKits.writeLog("X:" + msg.stuDetectLine[j].nX);
						ToolKits.writeLog("Y:" + msg.stuDetectLine[j].nY + "\n");
					}

					if (msg.bSizeFileter) {
						if (msg.stuSizeFileter.bFilterMinSizeEnable) {
							ToolKits.writeLog("物体最小尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuFilterMinSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuFilterMinSize.nHeight);
						}

						if (msg.stuSizeFileter.bFilterMaxSizeEnable)
							ToolKits.writeLog("物体最大尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuFilterMaxSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuFilterMaxSize.nHeight);

						if(msg.stuSizeFileter.abMinAreaSize) {
							ToolKits.writeLog("最小面积矩形框尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuMinAreaSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuMinAreaSize.nHeight);
						}

						if(msg.stuSizeFileter.abMaxAreaSize) {
							ToolKits.writeLog("最大面积矩形框尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuMaxAreaSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuMaxAreaSize.nHeight);
						}

						if(msg.stuSizeFileter.abMinRatioSize) {
							ToolKits.writeLog("最小宽高比矩形框尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuMinRatioSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuMinRatioSize.nHeight);
						}

						if(msg.stuSizeFileter.abMaxRatioSize) {
							ToolKits.writeLog("最大宽高比矩形框尺寸(宽/高)：" + (int) msg.stuSizeFileter.stuMaxRatioSize.nWidth + "/" +
									(int) msg.stuSizeFileter.stuMaxRatioSize.nHeight);
						}
					}

					// 配置在此处

				}
				else if(analyserules.pRuleBuf[i].dwRuleType == FinalVar.EVENT_IVS_WORKCLOTHES_DETECT)  //已调试
				{
					CFG_WORKCLOTHES_DETECT_INFO msg = (CFG_WORKCLOTHES_DETECT_INFO) analyserules.pIvsRuleBuf[i];
					ToolKits.writeLog("规则名称：" + new String(msg.szRuleName).trim() + "\n" +
							"规则使能: " + msg.bRuleEnable + "\n");
				}
				else if(analyserules.pRuleBuf[i].dwRuleType == FinalVar.EVENT_IVS_WORKSTATDETECTION)   //已调试
				{
					CFG_WORKSTATDETECTION_INFO msg = (CFG_WORKSTATDETECTION_INFO) analyserules.pIvsRuleBuf[i];
					ToolKits.writeLog("规则名称：" + new String(msg.szRuleName).trim() + "\n" +
							"规则使能: " + msg.bRuleEnable + "\n");

				}
				else if(analyserules.pRuleBuf[i].dwRuleType == FinalVar.EVENT_IVS_SMART_KITCHEN_CLOTHES_DETECTION)   //已调试
				{
					CFG_SMART_KITCHEN_CLOTHES_DETECTION msg = (CFG_SMART_KITCHEN_CLOTHES_DETECTION) analyserules.pIvsRuleBuf[i];
					ToolKits.writeLog("规则名称：" + new String(msg.szRuleName).trim() + "\n" +
							"规则使能: " + msg.bRuleEnable + "\n");

				}
				else if(analyserules.pRuleBuf[i].dwRuleType == FinalVar.EVENT_IVS_NUMBERSTAT)   //已调试
				{
					CFG_NUMBERSTAT_INFO msg = (CFG_NUMBERSTAT_INFO) analyserules.pIvsRuleBuf[i];
					ToolKits.writeLog("规则名称：" + new String(msg.szRuleName).trim() + "\n" +
							"规则使能: " + msg.bRuleEnable + "\n");

				}
				else if(analyserules.pRuleBuf[i].dwRuleType == FinalVar.EVENT_IVS_FACEDETECT)
				{
					CFG_FACEDETECT_INFO msg = (CFG_FACEDETECT_INFO) analyserules.pIvsRuleBuf[i];
					ToolKits.writeLog("规则名称：" + new String(msg.szRuleName).trim() + "\n" +
							"规则使能: " + msg.bRuleEnable + "\n");
				}else if(analyserules.pRuleBuf[i].dwRuleType == FinalVar.EVENT_IVS_FACEANALYSIS)
				{
					CFG_FACEANALYSIS_INFO msg = (CFG_FACEANALYSIS_INFO) analyserules.pIvsRuleBuf[i];
					ToolKits.writeLog("规则名称：" + new String(msg.szRuleName).trim() + "\n" +
							"规则使能: " + msg.bRuleEnable + "\n");
					msg.bRuleEnable = false;
					msg.stuEventHandler.bSnapshotEn = false;
					analyserules.pIvsRuleBuf[i] = msg;
				}
			}

			// 配置
			boolean bRet2 = ToolKits.SetDevConfig(szCommand, analyserules, __LoginHandle, 0, 10 * 1024 * 1024);
			if (bRet2) {
				ToolKits.writeLog("setNewDevConfig Succeed!");
			} else {
				ToolKits.writeErrorLog("setNewDevConfig Failed!" );
			}
		} else {
			ToolKits.writeErrorLog("GetNewDevConfig Failed!" );
		}
	}

	public void VideoEncoderoi(){
		CFG_VIDEOENCODEROI_INFO stCfgs = new CFG_VIDEOENCODEROI_INFO();
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEOENCODEROI, stCfgs, __LoginHandle, -1, 10240);
		if (zRet) {
			stCfgs.byQuality += 1;
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEOENCODEROI, stCfgs, __LoginHandle, -1, 10240);
			if (zRet)
			{
				ToolKits.writeLog("Set VideoEncoderoi success !");
			}
		}
	}

	public void FaceSnapShot(){
		NET_CFG_FACESNAPSHOT_INFO msg = new NET_CFG_FACESNAPSHOT_INFO();
		int channel = 0;  // 通道号
		if (INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_FACESNAPSHOT, channel, msg, 3000, null)) {
			ToolKits.writeLog("Get NET_EM_CFG_FACESNAPSHOT success");
			msg.emSnapPolicy = EM_FACE_SNAP_POLICY.EM_FACE_SNAP_POLICY_REALTIME;  //  实时抓拍模式
			if(INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_FACESNAPSHOT, channel, msg, 3000, null, null)) {
				ToolKits.writeLog("Set NET_EM_CFG_FACESNAPSHOT success");
			} else {
				ToolKits.writeLog("Set NET_EM_CFG_FACESNAPSHOT failed,LastError:" + INetSDK.GetLastError());
			}
		} else {
			ToolKits.writeLog("Get NET_EM_CFG_FACESNAPSHOT failed,LastError:" + INetSDK.GetLastError());
		}
	}

	public void VideoInFaceAutoExposure(){
		NET_CFG_VIDEOIN_FACE_AUTOEXPOSURE_INFO msg = new NET_CFG_VIDEOIN_FACE_AUTOEXPOSURE_INFO();
		int channel = 0;  // 通道号
		if (INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_VIDEOIN_FACE_AUTOEXPOSURE, channel, msg, 3000, null)) {
			ToolKits.writeLog("Get NET_EM_CFG_VIDEOIN_FACE_AUTOEXPOSURE success");
			if(INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_VIDEOIN_FACE_AUTOEXPOSURE, channel, msg, 3000, null, null)) {
				ToolKits.writeLog("Set NET_EM_CFG_VIDEOIN_FACE_AUTOEXPOSURE success");
			} else {
				ToolKits.writeLog("Set NET_EM_CFG_VIDEOIN_FACE_AUTOEXPOSURE failed,LastError:" + INetSDK.GetLastError());
			}
		} else {
			ToolKits.writeLog("Get NET_EM_CFG_VIDEOIN_FACE_AUTOEXPOSURE failed,LastError:" + INetSDK.GetLastError());
		}
	}
		public Object copy(Object old) {
			Object clazz = null;
			try {
				//写入字节流
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos);
				oos.writeObject(old);
				//读取字节流
				ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
				ObjectInputStream ois = new ObjectInputStream(bais);
				clazz = (Object) ois.readObject();
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			return clazz;
		}
	//修改用户密码
	public void ModifyUserPassword(){
		USER_MANAGE_INFO_NEW stManaNew = new USER_MANAGE_INFO_NEW();
		boolean bRet = INetSDK.QueryUserInfoNew(__LoginHandle, stManaNew, 5000);
		if(bRet){
			ToolKits.writeLog("QueryUserInfoNew success");
			for (int i = 0; i < stManaNew.dwUserNum; i++) {
				String queryUserName = new String(stManaNew.userList[i].name).trim();
				if (queryUserName.equals("admin".trim())) {
					/**
					 * 序列化方式进行深拷贝
					 * */
					USER_INFO_NEW oldInfo = (USER_INFO_NEW)copy(stManaNew.userList[i]);
					USER_INFO_NEW newInfo = (USER_INFO_NEW)copy(stManaNew.userList[i]);
					char[] oldPWD ="admin123".toCharArray();
					char[] newPWD = "admin1234".toCharArray();
					System.arraycopy(oldPWD, 0, oldInfo.passWord, 0, oldPWD.length);
					System.arraycopy(newPWD, 0, newInfo.passWord, 0, newPWD.length);
					bRet = INetSDK.OperateUserInfoNew(__LoginHandle, 6, newInfo, oldInfo, 5000);
					if(bRet){
						ToolKits.writeLog("OperateUserInfoNew-modify user password success.");
					}else{
						ToolKits.writeLog("OperateUserInfoNew-modify user password failed,LastError:" + INetSDK.GetLastError());
					}
				}
			}
		}else{
			ToolKits.writeLog("QueryUserInfoNew failed,LastError:" + INetSDK.GetLastError());
		}
	}

	// 增加用户
	public void AddUser(){
		USER_MANAGE_INFO_NEW stManaNew = new USER_MANAGE_INFO_NEW();
		boolean bRet = INetSDK.QueryUserInfoNew(__LoginHandle, stManaNew, 5000);
		if(bRet) {
			USER_INFO_NEW info = new USER_INFO_NEW();
			info.dwID = stManaNew.dwUserNum + 1;
			info.dwGroupID = stManaNew.groupListEx[0].dwID; // 我选择了其中一个用户组
			System.arraycopy("Test".toCharArray(), 0, info.name, 0, "Test".toCharArray().length);
			System.arraycopy("admin123".toCharArray(), 0, info.passWord, 0, "admin123".toCharArray().length);
			System.arraycopy("111".toCharArray(), 0, info.memo, 0, "111".toCharArray().length);
			info.dwRightNum = 14;
			for (int i = 0; i < info.dwRightNum; i ++){
				info.rights[i] = i + 1;
			}

			bRet = INetSDK.OperateUserInfoNew(__LoginHandle,3, info, null, 5000);
			if(bRet){
				ToolKits.writeLog("OperateUserInfoNew-add user success.");
			}else{
				ToolKits.writeLog("OperateUserInfoNew-add user failed,LastError:" + INetSDK.GetLastError());
			}

		}

	}

	// 补光灯配置(老接口)
	public void LightingV2() {
		boolean bRet = false;
		CFG_LIGHTING_V2_INFO Lighting_V2 = new CFG_LIGHTING_V2_INFO(); // 数组长度为视频口数量最大值

		bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_LIGHTING_V2, Lighting_V2, __LoginHandle, 0, 20480);
		if(bRet) {
			ToolKits.writeLog("GetLighting_V2 Succeed!" + "  " + Lighting_V2.nChannel);
		} else {
			ToolKits.writeErrorLog("Get Lighting_V2 Failed!, error is " + INetSDK.GetLastError());
			return;
		}

		bRet = false;
		if(Lighting_V2.anDNLightInfo[0].anLightInfo[0].emMode == EM_CFG_LC_MODE.EM_CFG_LC_MODE_MANUAL )
		{
			Lighting_V2.anDNLightInfo[0].anLightInfo[0].emMode = EM_CFG_LC_MODE.EM_CFG_LC_MODE_OFF;
		}
		else
		{
			Lighting_V2.anDNLightInfo[0].anLightInfo[0].emMode = EM_CFG_LC_MODE.EM_CFG_LC_MODE_MANUAL;
		}


		bRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_LIGHTING_V2, Lighting_V2, __LoginHandle, 0, 20480);
		if(bRet) {

			ToolKits.writeLog("Lighting_V2 Succeed!");
		} else {
			ToolKits.writeErrorLog("Lighting_V2 Failed!error is " + INetSDK.GetLastError());
			return;

		}

		CFG_LIGHTING_V2_INFO Lighting_V2New = new CFG_LIGHTING_V2_INFO(); // 数组长度为视频口数量最大值

		bRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_LIGHTING_V2, Lighting_V2New, __LoginHandle, 0, 20480);
		if(bRet) {
			ToolKits.writeLog("GetLighting_V2New Succeed!" + "  " + Lighting_V2New.nChannel);
		} else {
			ToolKits.writeErrorLog("Get Lighting_V2New Failed!, error is " + INetSDK.GetLastError());
		}
	}

	public void EncodeVideo(){
		NET_ENCODE_VIDEO_INFO msg = new NET_ENCODE_VIDEO_INFO();
		msg.emFormatType = NET_EM_FORMAT_TYPE.EM_FORMAT_MAIN_NORMAL;		//选择码流类型
		int channel = 0;  // 通道号
		if (INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_ENCODE_VIDEO, channel, msg, 3000, null)) {
			ToolKits.writeLog("Get NET_EM_CFG_ENCODE_VIDEO success");
			msg.emImageQuality = NET_EM_IMAGE_QUALITY.EM_IMAGE_QUALITY_Q100;	//设置画质
			msg.nIFrameInterval = 50;		//设置I帧间隔
			if(INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_ENCODE_VIDEO, channel, msg, 3000, null, null)) {
				ToolKits.writeLog("Set NET_EM_CFG_ENCODE_VIDEO success");
			} else {
				ToolKits.writeLog("Set NET_EM_CFG_ENCODE_VIDEO failed,LastError:" + INetSDK.GetLastError());
			}
		} else {
			ToolKits.writeLog("Get NET_EM_CFG_ENCODE_VIDEO failed,LastError:" + INetSDK.GetLastError());
		}
	}

	public void VspOnvif(){
		NET_CFG_VSP_ONVIF_INFO msg = new NET_CFG_VSP_ONVIF_INFO();
		int channel = -1;  // 通道号
		if (INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_VSP_ONVIF, channel, msg, 3000, null)) {
			ToolKits.writeLog("Get NET_EM_CFG_VSP_ONVIF success");
			if(INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_VSP_ONVIF, channel, msg, 3000, null, null)) {
				ToolKits.writeLog("Set NET_EM_CFG_VSP_ONVIF success");
			} else {
				ToolKits.writeLog("Set NET_EM_CFG_VSP_ONVIF failed,LastError:" + INetSDK.GetLastError());
			}
		} else {
			ToolKits.writeLog("Get NET_EM_CFG_VSP_ONVIF failed,LastError:" + INetSDK.GetLastError());
		}

	}
	// 音视频加密
	public void AudioAndVideoEncrypt() {
		boolean bRet = false;

		// 订阅VK
		NET_IN_ATTACH_VK stAttachIn = new NET_IN_ATTACH_VK();
		stAttachIn.nChannelID = 0;
		stAttachIn.cbAttachVK = new TestfAttachVKCallBack();

		NET_OUT_ATTACH_VK stAttachOut = new NET_OUT_ATTACH_VK();

		long lAttachHandle = INetSDK.AttachVK(__LoginHandle, stAttachIn, stAttachOut, 5000);
		if (lAttachHandle != 0) {
			ToolKits.writeLog("AttachVK Succeed!");
		} else {
			ToolKits.writeErrorLog("AttachVK Failed!");
		}

		{	// 获取VK
			NET_IN_GET_VKINFO stIn = new NET_IN_GET_VKINFO();
			stIn.nChannelID = 0;

			NET_OUT_GET_VKINFO stOut = new NET_OUT_GET_VKINFO();

			bRet = INetSDK.GetVK(__LoginHandle, stIn, stOut, 5000);
			if (bRet) {
				ToolKits.writeLog("GetVK Succeed!");
			} else {
				ToolKits.writeErrorLog("GetVK Failed!");
			}
		}

		{	// 更新VK
			NET_IN_UPDATE_VKINFO stIn = new NET_IN_UPDATE_VKINFO();
			stIn.nChannelID = 0;
			NET_OUT_UPDATE_VKINFO stOut = new NET_OUT_UPDATE_VKINFO();
			bRet = INetSDK.UpdateVK(__LoginHandle, stIn, stOut, 5000);
			if (bRet) {
				ToolKits.writeLog("UpdateVK Succeed!");
			} else {
				ToolKits.writeErrorLog("UpdateVK Failed!");
			}
		}

		{	// 获取媒体文件加密能力集
			NET_IN_GET_MEDIA_ENCRYPT_CAPS stIn = new NET_IN_GET_MEDIA_ENCRYPT_CAPS();
			stIn.nChannelOffset = 0;
			stIn.nChannelCount = 2;
			NET_OUT_GET_MEDIA_ENCRYPT_CAPS stOut = new NET_OUT_GET_MEDIA_ENCRYPT_CAPS(2);

			bRet = INetSDK.GetMediaEncryptCaps(__LoginHandle, stIn, stOut, 5000);
			if (bRet) {
				ToolKits.writeLog("GetMediaEncryptCaps Succeed!");
				for (int i = 0; i < stOut.nRetCapsInfoCount; ++i)
				{
					ToolKits.writeLog("是否支持码流加密:" + (stOut.pstuCapsInfo[i].bSupport? "支持":"不支持"));
				}
			} else {
				ToolKits.writeErrorLog("GetMediaEncryptCaps Failed!");
			}
		}

		{    // 获取录像加密密码
			NET_IN_GET_RECORD_FILE_PASSWORD stIn = new NET_IN_GET_RECORD_FILE_PASSWORD();
			String fileName = "password.txt";
			System.arraycopy(fileName.getBytes(), 0, stIn.szFileName, 0, fileName.getBytes().length);

			NET_OUT_GET_RECORD_FILE_PASSWORD stOut = new NET_OUT_GET_RECORD_FILE_PASSWORD();

			bRet = INetSDK.GetRecordFilePassword(__LoginHandle, stIn, stOut, 5000);
			if (bRet) {
				ToolKits.writeLog("GetRecordFilePassword Succeed!");
				ToolKits.writeLog("password:" + new String(stOut.szPassword));
			} else {
				ToolKits.writeErrorLog("GetRecordFilePassword Failed!");
			}
		}

		try {  // 取消订阅VK
			if (lAttachHandle != 0) {
				sleep(10000);
				INetSDK.DetachVK(lAttachHandle, 5000);
				ToolKits.writeLog("DetachVK Devices");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	public class TestfLogOpen implements CB_fSDKLogCallBack {
		@Override
		public int invoke(byte[] szLogBuffer, int nLogSize) {

			FileOutputStream fileStream;
			try {
				ToolKits.writeLog(getExternalFilesDir(null).getAbsolutePath() + "/sdk1.log");
				fileStream = new FileOutputStream(getExternalFilesDir(null).getAbsolutePath() + "/sdk1.log", true);
				fileStream.write(szLogBuffer,0,nLogSize);
				fileStream.close();
			} catch (Exception e) {
			e.printStackTrace();
			}

			ToolKits.writeLog(getExternalFilesDir(null).getAbsolutePath());

			return 1;
		}
	}

	/// Open SDK log
	/// 打开 SDK 日志
	public boolean  TestopenLog() {

		String logFile = "/storage/emulated/0/sdk.log";
		LOG_SET_PRINT_INFO logInfo = new LOG_SET_PRINT_INFO();
		logInfo.bSetPrintStrategy = true;
		logInfo.nPrintStrategy = 1; // 0 - Saved as file. 1 - show log in the console.
		logInfo.bSetFilePath = true;
		System.arraycopy(logFile.getBytes(), 0, logInfo.szLogFilePath, 0, logFile.length());
		logInfo.cbSDKLogCallBack = new TestfLogOpen();
		ToolKits.writeLog("logopen");
		return INetSDK.LogOpen(logInfo);
	}

	public void VideoInLighting() {
		// 获取
		NET_VIDEOIN_LIGHTING_INFO msg = new NET_VIDEOIN_LIGHTING_INFO();
		int nType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_VIDEOIN_LIGHTING;
		int nChannelID = 0;

		if(INetSDK.GetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null)) {
			ToolKits.writeLog("Get VideoInLighting Succeed!");

			ToolKits.writeLog("emLightMode:" + msg.emLightMode);
			ToolKits.writeLog("nCorrection:" + msg.nCorrection);
			ToolKits.writeLog("nSensitive:" + msg.nSensitive);
			ToolKits.writeLog("nNearLight:" + msg.nNearLight);
			ToolKits.writeLog("nFarLight:" + msg.nFarLight);
			if (msg.emLightMode == NET_EM_LIGHTING_MODE.NET_EM_LIGHTING_AUTO)
			{
				msg.emLightMode = NET_EM_LIGHTING_MODE.NET_EM_LIGHTING_OFF;
			}
			else
			{
				msg.emLightMode = NET_EM_LIGHTING_MODE.NET_EM_LIGHTING_AUTO;

			}
			msg.nCorrection ++;
			msg.nSensitive ++;
			msg.nNearLight ++;
			msg.nFarLight ++;

			if(INetSDK.SetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null, null)) {
				ToolKits.writeLog("Set VideoInLighting Succeed!");
				NET_VIDEOIN_LIGHTING_INFO msg1 = new NET_VIDEOIN_LIGHTING_INFO();
				if(INetSDK.GetConfig(__LoginHandle, nType, nChannelID, msg1, _waittime, null)) {
					ToolKits.writeLog("Get1 VideoInLighting Succeed!");
					ToolKits.writeLog("emLightMode:" + msg1.emLightMode);
					ToolKits.writeLog("nCorrection:" + msg1.nCorrection);
					ToolKits.writeLog("nSensitive:" + msg1.nSensitive);
					ToolKits.writeLog("nNearLight:" + msg1.nNearLight);
					ToolKits.writeLog("nFarLight:" + msg1.nFarLight);
				}
			} else {
				ToolKits.writeErrorLog("Set VideoInLighting Failed!, error is" + INetSDK.GetLastError());
			}
		} else {
			ToolKits.writeErrorLog("Get VideoInLighting Failed!,error is" + INetSDK.GetLastError());
		}
	}

	public void RelayState() {
		// 获取
		NET_CFG_RELAY_STATE_INFO msg = new NET_CFG_RELAY_STATE_INFO();
		int nType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_RELAY_STATE;
		int nChannelID = 0;

		if(INetSDK.GetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null)) {
			ToolKits.writeLog("Get NET_EM_CFG_RELAY_STATE Succeed!");

			ToolKits.writeLog("nAddress:" + msg.nAddress);
			ToolKits.writeLog("emState:" + msg.emState);

			if (msg.emState == EM_RELAY_STATE_TYPE.EM_RELAY_STATE_TYPE_UNKNOWN)
			{
				msg.emState= EM_RELAY_STATE_TYPE.EM_RELAY_STATE_TYPE_OPEN;
			}
			else if (msg.emState == EM_RELAY_STATE_TYPE.EM_RELAY_STATE_TYPE_OPEN)
			{
				msg.emState= EM_RELAY_STATE_TYPE.EM_RELAY_STATE_TYPE_CLOSE;
			}
			else if(msg.emState == EM_RELAY_STATE_TYPE.EM_RELAY_STATE_TYPE_CLOSE)
			{
				msg.emState= EM_RELAY_STATE_TYPE.EM_RELAY_STATE_TYPE_OPEN;
			}
			msg.nAddress ++;
			if(INetSDK.SetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null, null)) {
				ToolKits.writeLog("Set NET_EM_CFG_RELAY_STATE Succeed!");
				NET_CFG_RELAY_STATE_INFO msg1 = new NET_CFG_RELAY_STATE_INFO();
				if(INetSDK.GetConfig(__LoginHandle, nType, nChannelID, msg1, _waittime, null)) {
					ToolKits.writeLog("Get1 NET_EM_CFG_RELAY_STATE Succeed!");
					ToolKits.writeLog("nAddress:" + msg.nAddress);
					ToolKits.writeLog("emState:" + msg.emState);
				}
			} else {
				ToolKits.writeErrorLog("Set NET_EM_CFG_RELAY_STATE Failed!, error is" + INetSDK.GetLastError());
			}
		} else {
			ToolKits.writeErrorLog("Get NET_EM_CFG_RELAY_STATE Failed!,error is" + INetSDK.GetLastError());
		}
	}


	public class Test_CB_fPTZStatusCallBack implements
			CB_fPTZStatusProcCallBack {
		@Override
		public void invoke(long lLoginID, long lAttachHandle, Object pBuf, int nBufLen) {
			SDK_PTZ_LOCATION_INFO stuInfo = (SDK_PTZ_LOCATION_INFO)pBuf;
			ToolKits.writeLog("nPTZPan = " + stuInfo.nPTZPan + ", nPTZTilt = "
					+ stuInfo.nPTZTilt + ", bState = " + stuInfo.bState
					+ ", bZoomState = " + stuInfo.bZoomState + ", nZoomValue = " + stuInfo.nZoomValue
					+ ", nPTZZoom = " + stuInfo.nPTZZoom + ", bFocusState = " + stuInfo.bFocusState + ", fFocusPosition = " + stuInfo.fFocusPosition);
		}
	}

	// 云升级
	public void CheckCloudUpgrader() {

		NET_IN_CHECK_CLOUD_UPGRADER stuIn = new NET_IN_CHECK_CLOUD_UPGRADER();
		/**
		 * 0: 直连升级服务器检测
		 * 1: 通过代理服务器检测
		 * 2: 获取缓存的检测结果
		 */
		stuIn.nWay = 1;

		/**
		 * 设置代理服务器地址，当nWay为1时，stProxy才有意义
		 */
		String strIp = "10.34.3.70";
		System.arraycopy(strIp.getBytes(), 0, stuIn.stProxy.szIP, 0, strIp.getBytes().length);
		stuIn.stProxy.nPort = 37777;


		NET_OUT_CHECK_CLOUD_UPGRADER stuOut = new NET_OUT_CHECK_CLOUD_UPGRADER();
		boolean bRet = INetSDK.CheckCloudUpgrader(__LoginHandle, stuIn, stuOut, 5000);
		if (bRet)
		{
			ToolKits.writeLog("CheckCloudUpgrader success");
			ToolKits.writeLog("emState = " + stuOut.emState);
			ToolKits.writeLog("emPackageType = " + stuOut.emPackageType);
			ToolKits.writeLog("szOldVersion = " + new String(stuOut.szOldVersion));
			ToolKits.writeLog("szNewVersion = " + new String(stuOut.szNewVersion));
		}
		{
			ToolKits.writeLog("CheckCloudUpgrader failed,LastError:" + INetSDK.GetLastError());
		}
	}

	public void CheckandExecuteCloudUpgrader() {


		NET_IN_CHECK_CLOUD_UPGRADER stuIn = new NET_IN_CHECK_CLOUD_UPGRADER();
		/**
		 * 0: 直连升级服务器检测
		 * 1: 通过代理服务器检测
		 * 2: 获取缓存的检测结果
		 */
		stuIn.nWay = 1;

		/**
		 * 设置代理服务器地址，当nWay为1时，stProxy才有意义
		 */
		String strIp = "10.34.3.70";
		System.arraycopy(strIp.getBytes(), 0, stuIn.stProxy.szIP, 0, strIp.getBytes().length);
		stuIn.stProxy.nPort = 37777;


		NET_OUT_CHECK_CLOUD_UPGRADER stuOut = new NET_OUT_CHECK_CLOUD_UPGRADER();
		boolean bRet = INetSDK.CheckCloudUpgrader(__LoginHandle, stuIn, stuOut, 5000);
		if (bRet)
		{
			ToolKits.writeLog("CheckCloudUpgrader success");
			ToolKits.writeLog("emState = " + stuOut.emState);
			ToolKits.writeLog("emPackageType = " + stuOut.emPackageType);
			ToolKits.writeLog("szOldVersion = " + new String(stuOut.szOldVersion));
			ToolKits.writeLog("szNewVersion = " + new String(stuOut.szNewVersion));
		}
		{
			ToolKits.writeLog("CheckCloudUpgrader failed,LastError:" + INetSDK.GetLastError());
		}

		NET_IN_EXECUTE_CLOUD_UPGRADER stuInUp = new NET_IN_EXECUTE_CLOUD_UPGRADER();

		NET_OUT_EXECUTE_CLOUD_UPGRADER stuOutUp = new NET_OUT_EXECUTE_CLOUD_UPGRADER();
		boolean bRet1 = INetSDK.ExecuteCloudUpgrader(__LoginHandle, stuInUp, stuOutUp, 5000);
		if (bRet1)
		{
			ToolKits.writeLog("ExecuteCloudUpgrader success");
		}
		{
			ToolKits.writeLog("ExecuteCloudUpgrader failed,LastError:" + INetSDK.GetLastError());
		}
	}

	public void ExecuteCloudUpgrader() {

		NET_IN_EXECUTE_CLOUD_UPGRADER stuIn = new NET_IN_EXECUTE_CLOUD_UPGRADER();
		stuIn.nWay = 1;
		String strIp = "10.34.3.70";
		System.arraycopy(strIp.getBytes(), 0, stuIn.stProxy.szIP, 0, strIp.getBytes().length);
		NET_OUT_EXECUTE_CLOUD_UPGRADER stuOut = new NET_OUT_EXECUTE_CLOUD_UPGRADER();
		boolean bRet = INetSDK.ExecuteCloudUpgrader(__LoginHandle, stuIn, stuOut, 5000);
		if (bRet)
		{
			ToolKits.writeLog("ExecuteCloudUpgrader success");
		}
		{
			ToolKits.writeLog("ExecuteCloudUpgrader failed,LastError:" + INetSDK.GetLastError());
		}
	}

	public void GetCloudUpgraderState() {

		NET_IN_GET_CLOUD_UPGRADER_STATE stuIn = new NET_IN_GET_CLOUD_UPGRADER_STATE();
		NET_OUT_GET_CLOUD_UPGRADER_STATE stuOut = new NET_OUT_GET_CLOUD_UPGRADER_STATE();

		boolean bRet = INetSDK.GetCloudUpgraderState(__LoginHandle, stuIn, stuOut, 5000);
		if (bRet)
		{
			ToolKits.writeLog("GetCloudUpgraderState success");
		}
		{
			ToolKits.writeLog("GetCloudUpgraderState failed,LastError:" + INetSDK.GetLastError());
		}
	}
	public void RemoteCollectDevInfo() {
		boolean bRet = false;
		NET_IN_REMOTE_COLLECT_DEVINFO_CAPS pInParam = new NET_IN_REMOTE_COLLECT_DEVINFO_CAPS();
		NET_OUT_REMOTE_COLLECT_DEVINFO_CAPS pOutParam = new  NET_OUT_REMOTE_COLLECT_DEVINFO_CAPS();

		bRet = INetSDK.GetDevCaps(__LoginHandle,FinalVar.NET_REMOTE_COLLECT_DEVINFO_CAPS, pInParam, pOutParam,5000);//    NET_SUPPORT_GET_AUDIO_DECODE_CAPS
		if(bRet) {
			ToolKits.writeLog("NET_REMOTE_COLLECT_DEVINFO_CAPS Succeed!");
			ToolKits.writeLog("bSupportRemoteCollectSniffer：" + pOutParam.bSupportRemoteCollectSniffer );
			ToolKits.writeLog("bSupportRemoteCollectLog：" + pOutParam.bSupportRemoteCollectLog );

		} else {
			ToolKits.writeErrorLog("NET_REMOTE_COLLECT_DEVINFO_CAPS Failed!");
		}
	}


	// 获取所有有效显示源
	public void MatrixGetCameras() {
		// 入参
		SDK_IN_MATRIX_GET_CAMERAS stIn = new SDK_IN_MATRIX_GET_CAMERAS();

		// 出参
		SDK_OUT_MATRIX_GET_CAMERAS stOut = new SDK_OUT_MATRIX_GET_CAMERAS(32, 64);

		if(INetSDK.MatrixGetCameras(__LoginHandle, stIn, stOut, 4000)) {
			//ToolKits.writeLog("stOut:" + stOut.toString());
			ToolKits.writeLog("nRetCameraCount:" + stOut.nRetCameraCount);
			ToolKits.writeLog("nRealChannelCount:" + stOut.nRealChannelCount);
			for(int i = 0; i < stOut.nRetCameraCount; i++) {
				ToolKits.writeLog("nChannelID(远程通道号):" + stOut.pstuCameras[i].nChannelID);
				ToolKits.writeLog("nUniqueChannel(本地通道号):" + stOut.pstuCameras[i].nUniqueChannel);
				ToolKits.writeLog("emChannelType:" + stOut.pstuCameras[i].emChannelType);
				if(!stOut.pstuCameras[i].stuRemoteDevice.bEnable) {
					ToolKits.writeLog("该通道没有连接设备");
				} else {
					ToolKits.writeLog("该通道有连接设备");
					ToolKits.writeLog("szDevName:" + new String(stOut.pstuCameras[i].stuRemoteDevice.szDevName).trim());
					ToolKits.writeLog("szIp:" + new String(stOut.pstuCameras[i].stuRemoteDevice.szIp).trim());
					ToolKits.writeLog("szSerialNo:" + new String(stOut.pstuCameras[i].stuRemoteDevice.szSerialNo).trim());
				}
			}
		} else {
			ToolKits.writeErrorLog("MatrixGetCameras Failed.");
		}
	}

	// 获取设备的前端信息
	public void getRemoteDevice() {
		// nChanNum为通道号
		AV_CFG_RemoteDevice[] msg = new AV_CFG_RemoteDevice[NetSDKApplication.getInstance().getDeviceInfo().nChanNum];
		for(int i = 0; i < NetSDKApplication.getInstance().getDeviceInfo().nChanNum; i++) {
			msg[i] = new AV_CFG_RemoteDevice(64);
		}
		ToolKits.writeLog("nChanNum:" + NetSDKApplication.getInstance().getDeviceInfo().nChanNum);

		for(int i = 0; i < NetSDKApplication.getInstance().getDeviceInfo().nChanNum; i++) {
			int channelID = i;
			if (ToolKits.GetDevConfig(FinalVar.CFG_CMD_REMOTEDEVICE, msg[i],
									  __LoginHandle, channelID, 1024 * 1024)) {
				ToolKits.writeLog("通道" + i + "的信息：");
				ToolKits.writeLog("bEnable:" + msg[i].bEnable);
				ToolKits.writeLog("szIP:" + new String(msg[i].szIP).trim());
				ToolKits.writeLog("szSerial:" + new String(msg[i].szSerial).trim());

			} else {
				ToolKits.showMessage(this, "Get Config Failed");
			}
		}
	}

	// 查询无线网络接入点信息, 目前支持的无线个数增加到128
	private void QueryWlanAccessPoint() {
		/*
		 * 入参
 		 */
		NET_IN_WLAN_ACCESSPOINT stIn = new NET_IN_WLAN_ACCESSPOINT();

		// 需要获取信息的无线网络名称,为空时搜索所有网络
		String ssid = "";
		System.arraycopy(ssid.getBytes(), 0, stIn.szSSID, 0, ssid.getBytes().length);

		//  网卡名称, 为空时, 默认为eth2
		String name = "";
		System.arraycopy(name.getBytes(), 0, stIn.szName, 0, name.getBytes().length);

		// 出参
		NET_OUT_WLAN_ACCESSPOINT stOut = new NET_OUT_WLAN_ACCESSPOINT();

		if(INetSDK.QueryDevInfo(__LoginHandle,FinalVar.NET_QUERY_WLAN_ACCESSPOINT, stIn, stOut, null, 5000)) {
			ToolKits.writeLog("无线网络接入点个数: " + stOut.nCount);

			for(int i = 0; i < stOut.nCount; i++) {
				ToolKits.writeLog("无线网络名称:" + new String(stOut.stuInfo[i].szSSID).trim());
				ToolKits.writeLog("信号强度(范围0-100):" + stOut.stuInfo[i].nStrength);
				ToolKits.writeLog("认证模式:" + stOut.stuInfo[i].nAuthMode);
				ToolKits.writeLog("加密模式:" +stOut.stuInfo[i].nEncrAlgr);
			}
		} else {
			ToolKits.writeErrorLog("查询无线网络接入点信息失败.");
		}
	}

	// 搜索到的无线设备扩展配置列表
	private void GetDevWlanList() {
		SDKDEV_WLAN_DEVICE_LIST_EX stListEx[] = new SDKDEV_WLAN_DEVICE_LIST_EX[1];
		stListEx[0] = new SDKDEV_WLAN_DEVICE_LIST_EX();
		Integer stIntRet = new Integer(0);

		if(INetSDK.GetDevConfig(__LoginHandle, FinalVar.SDK_DEV_WLAN_DEVICE_CFG_EX, -1, stListEx, stIntRet, 5000)) {
			ToolKits.writeLog("搜索到的无线设备个数:" + (stListEx[0].bWlanDevCount & 0xff));

			for(int i = 0; i < (stListEx[0].bWlanDevCount & 0xff); i++) {
				ToolKits.writeLog("无线网络名称:" + new String(stListEx[0].lstWlanDev[i].szSSID).trim());
				ToolKits.writeLog("信号强度(dbm):" + stListEx[0].lstWlanDev[i].nRSSIQuality);
				ToolKits.writeLog("mac地址:" + new String(stListEx[0].lstWlanDev[i].szMacAddr).trim());
				ToolKits.writeLog("认证模式:" + (stListEx[0].lstWlanDev[i].byAuthMode & 0xff));
				ToolKits.writeLog("加密模式:" + (stListEx[0].lstWlanDev[i].byEncrAlgr & 0xff));
			}
		}
	}

	public void channelConfig() {
		int baseLimitStream = 1024;
		SDKDEV_CHANNEL_CFG[] channelCfg = new SDKDEV_CHANNEL_CFG[1];
		channelCfg[0] = new SDKDEV_CHANNEL_CFG();
			Integer  ret=new Integer(0);
		if (INetSDK.GetDevConfig(__LoginHandle, FinalVar.SDK_DEV_CHANNELCFG, 0, channelCfg, ret, 5000)) {
			PrintStackTraceLog();
			ToolKits.writeLog("GetDevConfig CHANNELCFG success");

			SDK_VIDEOENC_OPT[] sdk_videoenc_opts = channelCfg[0].stMainVideoEncOpt;
			boolean isNeedSetPic = false;
			for(SDK_VIDEOENC_OPT opt : sdk_videoenc_opts) {
				ToolKits.writeLog("byAudioEnable = " + opt.byAudioEnable);
				ToolKits.writeLog("byEncodeMode = " + opt.byEncodeMode);
				ToolKits.writeLog("wFormatTag = " + opt.wFormatTag);
			}
			for (int i = 0; i < channelCfg[0].stMainVideoEncOpt.length; i ++) {


				if(channelCfg[0].stMainVideoEncOpt[i].byAudioEnable == 0) channelCfg[0].stMainVideoEncOpt[i].byAudioEnable = 1;
				else channelCfg[0].stMainVideoEncOpt[i].byAudioEnable = 0;
				channelCfg[0].stMainVideoEncOpt[i].wFormatTag = 4;
				channelCfg[0].stMainVideoEncOpt[i].byEncodeMode = 7;
				isNeedSetPic = true;

			}

			if (isNeedSetPic) {
				boolean b = INetSDK.SetDevConfig(__LoginHandle, FinalVar.SDK_DEV_CHANNELCFG, 0, channelCfg,  5000);
				if (b) {
					ToolKits.writeLog("SetDevConfig CHANNELCFG success");
				} else {
					ToolKits.writeLog("SetDevConfig CHANNELCFG error" + ToolKits.getLastError());
				}
			}
		}
	}

	// 搜索到的无线设备扩展配置列表
	private void GetDevWlanListEx() {
		SDKDEV_WLAN_DEVICE_LIST_EX2 stListEx[] = new SDKDEV_WLAN_DEVICE_LIST_EX2[1];
		stListEx[0] = new SDKDEV_WLAN_DEVICE_LIST_EX2();
		Integer stIntRet = new Integer(0);

		if(INetSDK.GetDevConfig(__LoginHandle, FinalVar.SDK_DEV_WLAN_DEVICE_CFG_EX2, -1, stListEx, stIntRet, 5000)) {
			ToolKits.writeLog("搜索到的无线设备个数:" + (stListEx[0].bWlanDevCount & 0xff));
//
//            for(int i = 0; i < (stListEx[0].bWlanDevCount & 0xff); i++) {
//                ToolKits.writeLog("无线网络名称:" + new String(stListEx[0].lstWlanDev[i].szSSID).trim());
//                ToolKits.writeLog("信号强度(dbm):" + stListEx[0].lstWlanDev[i].nRSSIQuality);
//                ToolKits.writeLog("mac地址:" + new String(stListEx[0].lstWlanDev[i].szMacAddr).trim());
//                ToolKits.writeLog("认证模式:" + (stListEx[0].lstWlanDev[i].byAuthMode & 0xff));
//                ToolKits.writeLog("加密模式:" + (stListEx[0].lstWlanDev[i].byEncrAlgr & 0xff));
//            }
		}
	}

	// WLAN配置
	void WlanConfig() {
		CFG_NETAPP_WLAN stCfg = new CFG_NETAPP_WLAN();

		/**
		 * 获取
		 */
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_WLAN, stCfg, __LoginHandle, -1, 10240);
		if (zRet) {
			for(int i = 0; i < stCfg.nNum; i ++){
				CFG_WLAN_INFO stWlan = stCfg.stuWlanInfo[i];
				ToolKits.writeLog("szWlanName = " + new String(stWlan.szWlanName).trim() + "=====================================");
				ToolKits.writeLog("bEnable = " + stWlan.bEnable);
				for(int j = 0; j < 4; j ++){
					ToolKits.writeLog("szKeys[" + j + "] = " + new String(stWlan.szKeys[j]).trim());
				}
			}
			/**
			 * 设置
			 */
			//设置wifi名称
//			String WlanSSID = "TP-LINK";
//			System.arraycopy(WlanSSID.getBytes(),0, stCfg.stuWlanInfo[0].szSSID, 0, WlanSSID.getBytes().length);
//
//			//设置wifi密码
//			String mWlanPwd = "admin";
//			System.arraycopy(mWlanPwd.getBytes(),0, stCfg.stuWlanInfo[0].szKeys[0], 0, mWlanPwd.getBytes().length);
//
//			//设置wlan加密方式,// 加密模式, 0: off, 1: on, 2: WEP-OPEN, 3: WEP-SHARED, 4: WPA-TKIP, 5: WPA-PSK-TKIP,
//			// 6: WPA2-TKIP, 7: WPA2-PSK-TKIP, 8: WPA-AES, 9: WPA-PSK-AES, 10: WPA2-AES, 11: WPA2-PSK-AES
//			stCfg.stuWlanInfo[0].nEncryption = 4;
//
//			stCfg.stuWlanInfo[0].bEnable = true;  		 // WIFI网卡使能开关
//			stCfg.stuWlanInfo[0].bConnectEnable = true; // 手动连接开关, TRUE手动连接, FALSE手动断开
//			stCfg.stuWlanInfo[0].nKeyID = 0;              // 秘钥索引, 取值0~3
//			stCfg.stuWlanInfo[0].bKeyFlag = false;       // 密码是否已经设置
//			stCfg.stuWlanInfo[0].bLinkEnable = true;     // 自动连接开关, TRUE不自动连接, FALSE自动连接, IPC无意义
//
//			//设置DNS
//			System.arraycopy("8.8.8.8".getBytes(), 0, stCfg.stuWlanInfo[0].stuNetwork.szDnsServers[0], 0, "8.8.8.8".getBytes().length);
//			System.arraycopy("8.8.4.4".getBytes(), 0, stCfg.stuWlanInfo[0].stuNetwork.szDnsServers[1], 0, "8.8.4.4".getBytes().length);
//			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_WLAN, stCfg, __LoginHandle, -1, 10240);
		}
	}

	void PTZTour() {
		CFG_PTZTOUR_INFO stCfg = new CFG_PTZTOUR_INFO();
		int nChannel = 0;
		/**
		 * 获取
		 */
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_PTZTOUR, stCfg, __LoginHandle, nChannel, 1024*1024);
		if (zRet) {
			ToolKits.writeLog("Get CFG_CMD_PTZTOUR success");
			ToolKits.writeLog("stCfg.nCount" + stCfg.nCount);
			for(int i = 0; i < stCfg.nCount; i++ )
			{
				ToolKits.writeLog("第" + i + "组stTours数据");
				ToolKits.writeLog("bEnable:" + stCfg.stTours[i].bEnable);
				ToolKits.writeLog("szName:" + new String(stCfg.stTours[i].szName).trim());
				ToolKits.writeLog("nPresetsNum:" + stCfg.stTours[i].nPresetsNum);
				for(int j = 0; j < stCfg.stTours[i].nPresetsNum;j++)
				{
					ToolKits.writeLog("stPresets[" + j + "].nPresetID:" + stCfg.stTours[i].stPresets[j].nPresetID);
					ToolKits.writeLog("stPresets[" + j + "].nDuration:" + stCfg.stTours[i].stPresets[j].nDuration);
					ToolKits.writeLog("stPresets[" + j + "].nSpeed:" + stCfg.stTours[i].stPresets[j].nSpeed);
				}
			}
			// 根据项目来决定设置啥参数，在这只是测试demo，不是实际项目代码
			if(stCfg.nCount > 0)
			{
				stCfg.stTours[0].bEnable =! stCfg.stTours[0].bEnable;
				if( stCfg.stTours[0].nPresetsNum > 0)
				{
					stCfg.stTours[0].stPresets[0].nPresetID ++;
					stCfg.stTours[0].stPresets[0].nDuration++;
					stCfg.stTours[0].stPresets[0].nSpeed++;
				}
			}
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_PTZTOUR, stCfg, __LoginHandle, nChannel, 1024*1024);
			if(zRet)
			{
				ToolKits.writeLog("Set CFG_CMD_PTZTOUR success");
			}
		}
	}


	public void AutoScan() {
		NET_CFG_AUTOSCAN_INFO msg = new NET_CFG_AUTOSCAN_INFO(2);
		int nType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_AUTOSCAN;
		int nChannelID = 0;

		if(INetSDK.GetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null)) {
			ToolKits.writeLog("Get NET_EM_CFG_AUTOSCAN Succeed!");
			ToolKits.writeLog("nRetScanInfoNum:" + msg.nRetScanInfoNum);
			for(int i = 0; i < msg.nRetScanInfoNum; i++)
			{
				ToolKits.writeLog("第" + i + "组线扫信息");
				ToolKits.writeLog("szName:" + new String(msg.pAutoScanInfos[i].szName).trim());
				ToolKits.writeLog("bLeftEnable:" + msg.pAutoScanInfos[i].bLeftEnable);
				ToolKits.writeLog("bRightEnable:" + msg.pAutoScanInfos[i].bRightEnable);
				ToolKits.writeLog("nScanSpeed:" + msg.pAutoScanInfos[i].nScanSpeed);
			}

			// 设置
			if(msg.pAutoScanInfos[0].nScanSpeed > 0 && msg.pAutoScanInfos[0].nScanSpeed < 7) {
				msg.pAutoScanInfos[0].nScanSpeed += 1;
			}
			else {
				msg.pAutoScanInfos[0].nScanSpeed = 1;
			}
			msg.pAutoScanInfos[0].bRightEnable =! msg.pAutoScanInfos[0].bRightEnable;
			msg.pAutoScanInfos[0].bLeftEnable =! msg.pAutoScanInfos[0].bLeftEnable;
			msg.nMaxScanInfoNum = 2;
			if(INetSDK.SetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null, null)) {
				ToolKits.writeLog("Set NET_EM_CFG_AUTOSCAN Succeed!");
			} else {
				ToolKits.writeErrorLog("Set NET_EM_CFG_AUTOSCAN Failed!, error is" + INetSDK.GetLastError());
			}
		} else {
			ToolKits.writeErrorLog("Get NET_EM_CFG_AUTOSCAN Failed!,error is" + INetSDK.GetLastError());
		}
	}

	void ptzControlPresetDelete() {
		byte param2 = 5;
		int nChannel = 0;
		boolean bRet = INetSDK.SDKPTZControl(__LoginHandle, nChannel, SDK_PTZ_ControlType.SDK_PTZ_POINT_DEL_CONTROL, (byte) 0, param2, (byte) 0, false);
		if(bRet) {
			ToolKits.writeLog("SDKPTZControl success,command:SDK_PTZ_POINT_DEL_CONTROL");
		}
	}

	void ptzControlPresetAdd() {
		byte param2 = 5;
		int nChannel = 0;
		boolean bRet = INetSDK.SDKPTZControl(__LoginHandle, nChannel, SDK_PTZ_ControlType.SDK_PTZ_POINT_SET_CONTROL, (byte) 0, param2, (byte) 0, false);
		if(bRet) {
			ToolKits.writeLog("SDKPTZControl success,command:SDK_PTZ_POINT_SET_CONTROL");
		}
	}

	void GoToPreset(){
		int nChannel = 0;
		PTZ_CONTROL_GOTOPRESET stuInfo = new PTZ_CONTROL_GOTOPRESET();
		stuInfo.nPresetIndex = 1;   // 预置点编号
		stuInfo.stuSpeed.fPositionX = (float)0.5;
		stuInfo.stuSpeed.fPositionY = (float)0.5;
		stuInfo.stuSpeed.fZoom = (float)0.5;
		boolean bRet = INetSDK.SDKPTZControlEx2(__LoginHandle, nChannel, SDK_EXTPTZ_ControlType.SDK_EXTPTZ_GOTOPRESET, 0, 0, 0, false,stuInfo);
		if(bRet)
		{
			ToolKits.writeLog("SDKPTZControlEx2-SDK_EXTPTZ_GOTOPRESET success");
		}
		else
		{
			ToolKits.writeLog("SDKPTZControlEx2-SDK_EXTPTZ_GOTOPRESET failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void PTZPointLoopControl(){
		//parm1和parm2均为0，parm3:76表示开始,99表示自动,96表示停止
		int nChannel = 0;
		byte param3 = 99;
		boolean bRet = INetSDK.SDKPTZControl(__LoginHandle, nChannel, SDK_PTZ_ControlType.SDK_PTZ_POINT_LOOP_CONTROL, (byte)0, (byte)0, param3, false);
		if(bRet)
		{
			ToolKits.writeLog("SDKPTZControl-SDK_PTZ_POINT_LOOP_CONTROL success");
		}
		else
		{
			ToolKits.writeLog("SDKPTZControl-SDK_PTZ_POINT_LOOP_CONTROL failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void PTZPointLoopControlStart(){
		//parm1和parm2均为0，parm3:76表示开始,99表示自动,96表示停止
		int nChannel = 0;
		byte param3 = 76;
		boolean bRet = INetSDK.SDKPTZControl(__LoginHandle, nChannel, SDK_PTZ_ControlType.SDK_PTZ_POINT_LOOP_CONTROL, (byte)0, (byte)0, param3, false);
		if(bRet)
		{
			ToolKits.writeLog("SDKPTZControl-SDK_PTZ_POINT_LOOP_CONTROL success");
		}
		else
		{
			ToolKits.writeLog("SDKPTZControl-SDK_PTZ_POINT_LOOP_CONTROL failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void PTZPointLoopControlStop(){
		//parm1和parm2均为0，parm3:76表示开始,99表示自动,96表示停止
		int nChannel = 0;
		byte param3 = 96;
		boolean bRet = INetSDK.SDKPTZControl(__LoginHandle, nChannel, SDK_PTZ_ControlType.SDK_PTZ_POINT_LOOP_CONTROL, (byte)0, (byte)0, param3, false);
		if(bRet)
		{
			ToolKits.writeLog("SDKPTZControl-SDK_PTZ_POINT_LOOP_CONTROL success");
		}
		else
		{
			ToolKits.writeLog("SDKPTZControl-SDK_PTZ_POINT_LOOP_CONTROL failed,LastError:" + INetSDK.GetLastError());
		}
	}


	void PTZSetModeStart(){
		int nChannel = 0;
		int param1 = 1;   // 有效值为1-5
		boolean bRet = INetSDK.SDKPTZControlEx(__LoginHandle, nChannel, SDK_EXTPTZ_ControlType.SDK_EXTPTZ_SETMODESTART, param1, 0, 0, false);
		if(bRet)
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_SETMODESTART success");
		}
		else
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_SETMODESTART failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void PTZSetModeStop(){
		int nChannel = 0;
		int param1 = 1;   // 有效值为1-5
		boolean bRet = INetSDK.SDKPTZControlEx(__LoginHandle, nChannel, SDK_EXTPTZ_ControlType.SDK_EXTPTZ_SETMODESTOP, param1, 0, 0, false);
		if(bRet)
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_SETMODESTOP success");
		}
		else
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_SETMODESTOP failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void PTZRunMode(){
		int nChannel = 0;
		int param1 = 1;   // 有效值为1-5
		boolean bRet = INetSDK.SDKPTZControlEx(__LoginHandle, nChannel, SDK_EXTPTZ_ControlType.SDK_EXTPTZ_RUNMODE, param1, 0, 0, false);
		if(bRet)
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_RUNMODE success");
		}
		else
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_RUNMODE failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void PTZStopMode(){
		int nChannel = 0;
		int param1 = 1;   // 有效值为1-5
		boolean bRet = INetSDK.SDKPTZControlEx(__LoginHandle, nChannel, SDK_EXTPTZ_ControlType.SDK_EXTPTZ_STOPMODE, param1, 0, 0, false);
		if(bRet)
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_STOPMODE success");
		}
		else
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_STOPMODE failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void PTZDeleteMode(){
		int nChannel = 0;
		int param1 = 1;   // 有效值为1-5
		boolean bRet = INetSDK.SDKPTZControlEx(__LoginHandle, nChannel, SDK_EXTPTZ_ControlType.SDK_EXTPTZ_DELETEMODE, param1, 0, 0, false);
		if(bRet)
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_DELETEMODE success");
		}
		else
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_DELETEMODE failed,LastError:" + INetSDK.GetLastError());
		}
	}
	void PtzSetScanLimitLeft() {
		int param1 = 1;  // 线扫线路（1-5）
		int nChannel = 0;
		boolean bRet = INetSDK.SDKPTZControlEx(__LoginHandle, nChannel, SDK_EXTPTZ_ControlType.SDK_EXTPTZ_SETLEFTBORDER, param1, 0, 0, false);
		if(bRet)
		{
			ToolKits.writeLog("SDKPTZControlEx2-SDK_EXTPTZ_SETLEFTBORDER left success");
		}
		else
		{
			ToolKits.writeLog("SDKPTZControlEx2-SDK_EXTPTZ_SETLEFTBORDER left failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void PtzSetScanLimitRight() {
		int param1 = 1;  // 线扫线路（1-5）
		int nChannel = 0;
		boolean bRet = INetSDK.SDKPTZControlEx(__LoginHandle, nChannel, SDK_EXTPTZ_ControlType.SDK_EXTPTZ_SETRIGHTBORDER, param1, 0, 0, false);
		if(bRet)
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_SETRIGHTBORDER right success");
		}
		else
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_SETRIGHTBORDER right failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void PtzStartScan() {
		int param1 = 1;  // 线扫线路（1-5）
		int nChannel = 0;
		boolean bRet = INetSDK.SDKPTZControlEx(__LoginHandle, nChannel, SDK_EXTPTZ_ControlType.SDK_EXTPTZ_STARTLINESCAN, param1, 0, 0, false);
		if(bRet)
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_STARTLINESCAN success");
		}
		else
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_STARTLINESCAN failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void PtzStopScan() {
		int param1 = 1;  // 线扫线路（1-5）
		int nChannel = 0;
		boolean bRet = INetSDK.SDKPTZControlEx(__LoginHandle, nChannel, SDK_EXTPTZ_ControlType.SDK_EXTPTZ_CLOSELINESCAN, param1, 0, 0, false);
		if(bRet)
		{
			ToolKits.writeLog("SDKPTZControlEx2-SDK_EXTPTZ_CLOSELINESCAN success");
		}
		else
		{
			ToolKits.writeLog("SDKPTZControlEx2-SDK_EXTPTZ_CLOSELINESCAN failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void PTZAddLoop(){
		int nChannel = 0;
		int param1 = 1;   // 巡航路线，０-7
		int param2 = 1;   // 预置点
		boolean bRet = INetSDK.SDKPTZControlEx(__LoginHandle, nChannel, SDK_EXTPTZ_ControlType.SDK_EXTPTZ_ADDTOLOOP, param1, param2, 0, false);
		if(bRet)
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_ADDTOLOOP success");
		}
		else
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_ADDTOLOOP failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void PTZDeleteLoop(){
		int nChannel = 0;
		int param1 = 1;   // 巡航路线，０-7
		int param2 = 1;   // 预置点
		boolean bRet = INetSDK.SDKPTZControlEx(__LoginHandle, nChannel, SDK_EXTPTZ_ControlType.SDK_EXTPTZ_DELFROMLOOP, param1, param2, 0, false);
		if(bRet)
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_DELFROMLOOP success");
		}
		else
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_DELFROMLOOP failed,LastError:" + INetSDK.GetLastError());
		}
	}

	void PTZCloseLoop(){
		int nChannel = 0;
		int param1 = 1;   // 巡航路线，０-7
		boolean bRet = INetSDK.SDKPTZControlEx(__LoginHandle, nChannel, SDK_EXTPTZ_ControlType.SDK_EXTPTZ_CLOSELOOP, param1, 0, 0, false);
		if(bRet)
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_CLOSELOOP success");
		}
		else
		{
			ToolKits.writeLog("SDKPTZControlEx-SDK_EXTPTZ_CLOSELOOP failed,LastError:" + INetSDK.GetLastError());
		}
	}

	// 配置软AP
	private void SetDevWlan() {
		SDKDEV_WLAN_INFO stCfg[] = new SDKDEV_WLAN_INFO[1];
		stCfg[0] = new SDKDEV_WLAN_INFO();
		boolean bRet;
		stCfg[0].nEncryption = 4;       // 加密；0：off,2：WEP64bit,3：WEP128bit, 4:WPA-PSK-TKIP, 5: WPA-PSK-CCMP
		stCfg[0].byConnectedFlag = 1;  // 0: 无连接, 1: 连接

		// SSID
		String ssid = "";
		System.arraycopy(ssid.getBytes(), 0, stCfg[0].szSSID, 0, ssid.getBytes().length);

		// 密码，可以设置四组
		String key = "admin";
		System.arraycopy(key.getBytes(), 0, stCfg[0].szKeys[0], 0, key.getBytes().length);

		// nEncryption为4、5时使用,传128长度,不用结束符
		String wpaKey = "122";
		if(stCfg[0].nEncryption == 4 || stCfg[0].nEncryption == 5) {
			System.arraycopy(wpaKey.getBytes(), 0, stCfg[0].szWPAKeys, 0, wpaKey.getBytes().length);
		}

		if(INetSDK.SetDevConfig(__LoginHandle, FinalVar.SDK_DEV_WLAN_CFG, -1, stCfg, 5000)) {
			ToolKits.writeLog("设置成功.");
		} else {
			ToolKits.writeErrorLog("配置失败.");
		}
	}

	public void  TestAlarmRegion(){
        {
            NET_IN_GET_ALARMCAPS stuIn = new NET_IN_GET_ALARMCAPS();
            NET_OUT_GET_ALARMCAPS stuOut = new NET_OUT_GET_ALARMCAPS();
            if (INetSDK.GetAlarmRegionInfo(__LoginHandle, NET_EM_GET_ALARMREGION_INFO.NET_EM_GET_ALARMREGION_INFO_ALARMCAPS, stuIn, stuOut, 5000)) {
                ToolKits.writeLog("GetAlarmRegionInfo success.");
                ToolKits.writeLog("nSire:" + stuOut.nSiren + " nAlarmIn:" + stuOut.nAlarmIn + " nAlarmOut:" + stuOut.nAlarmOut + " nRemoteControl:" + stuOut.nRemoteControl);
            } else {
                ToolKits.writeErrorLog("GetAlarmRegionInfo failed.");
            }
        }

        {
            NET_IN_SET_OUTPUT_STATE stuIn = new NET_IN_SET_OUTPUT_STATE();
            NET_OUT_SET_OUTPUT_STATE stuOut = new NET_OUT_SET_OUTPUT_STATE();
            stuIn.emType = EM_OUTPUT_TYPE.EM_OUTPUT_TYPE_ALARMOUT;
            stuIn.nChannel = 0;
            stuIn.action = true;
            if (INetSDK.SetAlarmRegionInfo(__LoginHandle, NET_EM_SET_ALARMREGION_INFO.NET_EM_SET_ALARMREGION_INFO_OUTPUTSTATE, stuIn, stuOut, 5000)) {
                ToolKits.writeLog("SetAlarmRegionInfo success.");
            } else {
                ToolKits.writeErrorLog("SetAlarmRegionInfo failed.");
            }
        }
	}

	/**
	 * 查询某月的各天是否存在录像文件
	 */
	public void queryRecordStatus() {
		NET_TIME queryTime = new NET_TIME();
		queryTime.dwYear = 2018;
		queryTime.dwMonth = 8;

		NET_RECORD_STATUS status = new NET_RECORD_STATUS();
		if (INetSDK.QueryRecordStatus(__LoginHandle, 0, 0, queryTime, null, status, 5000))
		{
			for (int i = 0; i < status.flag.length; i++)
			{
				ToolKits.writeLog("" + status.flag[i]);
			}
		} else {
			ToolKits.writeErrorLog("Query Failed.");
		}
	}

	public void  TestDMSS(){

		// Get SIM Status
		NET_IN_SIMINFO_GET_SIMSTATE stuIn = new NET_IN_SIMINFO_GET_SIMSTATE();
		NET_OUT_SIMINFO_GET_SIMSTATE stuOut = new NET_OUT_SIMINFO_GET_SIMSTATE();
		stuIn.emMode = EM_WIRELESS_MODE.EM_WIRELESS_3G;
		if (INetSDK.GetMobileSIMInfo(__LoginHandle, EM_SIMINFO_TYPE.EM_SIMINFO_TYPE_GET_SIMState, stuIn, stuOut, 5000)) {
			ToolKits.writeLog("GetMobileSIMInfo success.");
			ToolKits.writeLog("SIM state:" + stuOut.emMode);
		}else {
			ToolKits.writeLog("GetMobileSIMInfo failed.");
		}

		// Query Power Status
		NET_POWER_STATUS stuPowerStatus = new NET_POWER_STATUS();
		if (INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_POWER_STATE, stuPowerStatus, 5000)) {
			ToolKits.writeLog("QueryDevState power state success.");
			ToolKits.writeLog("power state bEnable:" + stuPowerStatus.bEnable + " nCount:" + stuPowerStatus.nCount);
		}else {
			ToolKits.writeLog("QueryDevState power state failed.");
		}

		// Get/Set SDK_DEV_SMSACTIVATION_CFG(SDKDEV_SMSACTIVATION_CFG)   SDK_DEV_DIALINACTIVATION_CFG(SDKDEV_DIALINACTIVATION_CFG)  are similar to Get/Set SDK_DEV_MMS_CFG(SDKDEV_MMS_CFG)
		SDKDEV_MMS_CFG stuMMS[] = new SDKDEV_MMS_CFG[1];
		stuMMS[0] = new SDKDEV_MMS_CFG();
		Integer error = new Integer(0);
		if(INetSDK.GetDevConfig(__LoginHandle, FinalVar.SDK_DEV_MMS_CFG, -1, stuMMS, error, 5000)) {
			ToolKits.writeLog("GetDevConfig DEV_MMS_CFG success. enable:" + stuMMS[0].dwEnable + " type:" + stuMMS[0].byType + " title:" + new String(stuMMS[0].SZTitle).trim());
		}else {
			ToolKits.writeLog("GetDevConfig DEV_MMS_CFG failed.");
		}
		stuMMS[0].dwEnable = 1;
		String title = "MMS TITLE";
		java.util.Arrays.fill(stuMMS[0].SZTitle, (byte) 0x00);
		System.arraycopy(title.getBytes(), 0, stuMMS[0].SZTitle,0,title.getBytes().length);
		if(INetSDK.SetDevConfig(__LoginHandle, FinalVar.SDK_DEV_MMS_CFG, -1, stuMMS, 5000)) {
			if(INetSDK.GetDevConfig(__LoginHandle, FinalVar.SDK_DEV_MMS_CFG, -1, stuMMS, error, 5000)) {
				ToolKits.writeLog("GetDevConfig DEV_MMS_CFG success. enable:" + stuMMS[0].dwEnable + " type:" + stuMMS[0].byType + " title:" + new String(stuMMS[0].SZTitle).trim());
			}
		}else {
			ToolKits.writeLog("SetDevConfig DEV_MMS_CFG failed.");
		}

		SDKDEV_SMSACTIVATION_CFG stuSMS[] = new SDKDEV_SMSACTIVATION_CFG[1];
		stuSMS[0] = new SDKDEV_SMSACTIVATION_CFG();
		if(INetSDK.GetDevConfig(__LoginHandle, FinalVar.SDK_DEV_SMSACTIVATION_CFG, -1, stuSMS, error, 5000)) {
			ToolKits.writeLog("GetDevConfig DEV_SMSACTIVATION_CFG success. dwEnable:" + stuSMS[0].dwEnable + " SenderNum:" + stuSMS[0].dwSenderNum);
		}else {
			ToolKits.writeLog("GetDevConfig DEV_SMSACTIVATION_CFG failed.");
		}

		SDKDEV_DIALINACTIVATION_CFG stuDialin[] = new SDKDEV_DIALINACTIVATION_CFG[1];
		stuDialin[0] = new SDKDEV_DIALINACTIVATION_CFG();
		if(INetSDK.GetDevConfig(__LoginHandle, FinalVar.SDK_DEV_DIALINACTIVATION_CFG, -1, stuDialin, error, 5000)) {
			ToolKits.writeLog("GetDevConfig DEV_DIALINACTIVATION_CFG success. dwEnable:" + stuDialin[0].dwEnable + " CallerNum:" + stuDialin[0].dwCallerNum);
		}else {
			ToolKits.writeLog("GetDevConfig DEV_DIALINACTIVATION_CFG failed.");
		}
	}

	/**
	 * 得到所有活动的用户信息
	 */
	public void QueryActiveAllUserInfo() {
		CFG_ACTIVEALLUSER_INFO msg = new CFG_ACTIVEALLUSER_INFO();
		char szOutBuffer[] = new char[1024 * 4];
		Integer stError = new Integer(0);
		boolean bQN = INetSDK.QueryNewSystemInfo(__LoginHandle, FinalVar.CFG_USERMANAGER_ACTIVEUSER, -1, szOutBuffer, stError, 5000);
		if (bQN) {
			bQN = INetSDK.ParseData(FinalVar.CFG_USERMANAGER_ACTIVEUSER, szOutBuffer, msg, null);
			if (!bQN) {
				ToolKits.writeErrorLog("INetSDK.ParseData CFG_USERMANAGER_ACTIVEUSER error");
			} else {
				ToolKits.writeLog("活动用户个数为:" + msg.nCount);

				for(int i = 0; i < msg.nCount; i++) {
					ToolKits.writeLog("活动用户ID:" + msg.stuActiveUserInfo[i].nUserID);
					ToolKits.writeLog("用户名:" + new String(msg.stuActiveUserInfo[i].szUser).trim());
					ToolKits.writeLog("用户所在组名:" + new String(msg.stuActiveUserInfo[i].szGroupName).trim());
					ToolKits.writeLog("用户所在组等级:" + msg.stuActiveUserInfo[i].nGroupLevel);
					ToolKits.writeLog("客户端类型:" + new String(msg.stuActiveUserInfo[i].szClientType).trim());
					ToolKits.writeLog("客户端IP地址:" + new String(msg.stuActiveUserInfo[i].szClientAddr).trim());
					ToolKits.writeLog("用户登录时间:" + msg.stuActiveUserInfo[i].stuLoginTime.toString() + "\n");
				}
			}
		} else {
			ToolKits.writeErrorLog("INetSDK.QueryNewSystemInfo CFG_USERMANAGER_ACTIVEUSER error");
		}
	}

	// query ivs event info
    public void QueryIvsEventInfo(){
		boolean bRet = false;
		// set ivs event info query parameter
		MEDIAFILE_IVS_EVENT_PARAM stuInParam = new MEDIAFILE_IVS_EVENT_PARAM();

        stuInParam.nChannelID = 0;		// channel

		// start time
        stuInParam.stuStartTime.dwYear = 2018;
        stuInParam.stuStartTime.dwMonth = 9;
        stuInParam.stuStartTime.dwDay = 27;
        stuInParam.stuStartTime.dwHour = 11;
        stuInParam.stuStartTime.dwMinute = 00;
        stuInParam.stuStartTime.dwSecond = 0;

		// end time
        stuInParam.stuEndTime.dwYear = 2018;
        stuInParam.stuEndTime.dwMonth = 9;
        stuInParam.stuEndTime.dwDay = 29;
        stuInParam.stuEndTime.dwHour = 17;
        stuInParam.stuEndTime.dwMinute = 0;
        stuInParam.stuEndTime.dwSecond = 0;

        stuInParam.nMediaType = 0;			// any file type
        stuInParam.nVideoStream = 1;		// master video stream

        // rule

        //stuInParam.nRuleType = FinalVar.EVENT_IVS_ALL;
        //stuInParam.nEventCount = 0;

        stuInParam.nRuleType = EVENT_IVS_CROSSLINEDETECTION;
        // stuInParam.nRuleType = FinalVar.EVENT_IVS_CROSSREGIONDETECTION;
        stuInParam.nEventCount = 1;
        stuInParam.nEventLists[0] = EVENT_IVS_CROSSLINEDETECTION;
       // stuInParam.nEventLists[0] = FinalVar.EVENT_IVS_CROSSREGIONDETECTION;


        //stuInParam.nIvsObjectNum = 1;
        //stuInParam.emIvsObject[0] = EM_MEDIAFILE_IVS_OBJECT.EM_MEDIAFILE_IVS_HUMAN;

        // stuInParam.nIvsObjectNum = 0;

        long lFindHandle = INetSDK.FindFileEx(__LoginHandle, EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_IVS_EVENT, stuInParam, 30000);
		if(lFindHandle != 0){
			ToolKits.writeLog("FindFileEx Succeed!");
		} else {
			ToolKits.writeErrorLog("FindFileEx Failed!" );
            return;
		}

        MEDIAFILE_IVS_EVENT_INFO[] outfile = new MEDIAFILE_IVS_EVENT_INFO[10];
		for (int i = 0; i < outfile.length; i++) {
			outfile[i] = new MEDIAFILE_IVS_EVENT_INFO();
		}

		int nCount = 0;
		int nMaxCount = outfile.length;
		int nRetCount = 0;
		while(true) {
			nRetCount = INetSDK.FindNextFileEx(lFindHandle, EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_IVS_EVENT, outfile, 10000);
			if(nRetCount <= 0) {
				ToolKits.writeErrorLog("FindNextFileEx Failed!" );
				return;
			}

			for(int i = 0; i < nRetCount; i++){
				ToolKits.writeLog("---------------[ " + (i + nMaxCount * nCount) +"] -----------------");
				ToolKits.writeLog("file path：" + new String(outfile[i].szFilePath).trim());
				ToolKits.writeLog("media type: " + outfile[i].nMediaType);
                ToolKits.writeLog("event action type: " + outfile[i].emAction);
                ToolKits.writeLog("object type corresponding to rule: " + outfile[i].emIvsObject);

                ToolKits.writeLog("event image info：length[" + outfile[i].stuEventImageInfo.nImageLength + "] path[" +
                        new String(outfile[i].stuEventImageInfo.szImagePath).trim() + "]");
			}

			if(nRetCount <= nMaxCount) {
				break;
			} else {
				nCount++;
			}
		}

		INetSDK.FindCloseEx(lFindHandle);
	}


	// query ivs event info
	public void QuerySMDRecordInfo(){
		boolean bRet = false;
		// set ivs event info query parameter
		MEDIAFILE_SMD_RECORD_FILE_PARAM stuInParam = new MEDIAFILE_SMD_RECORD_FILE_PARAM();

		stuInParam.nChannelID = 0;		// channel
		stuInParam.nSmdRecordTypeNum = 2;
		for (int i=0; i<stuInParam.nSmdRecordTypeNum; i++)
		{
			stuInParam.emSmdRecordType[i] = EM_SMD_RECORD_TYPE.EM_SMD_RECORD_HUMAN;
		}

		// start time
		stuInParam.stuBeginTime.dwYear = 2021;
		stuInParam.stuBeginTime.dwMonth = 3;
		stuInParam.stuBeginTime.dwDay = 12;
		stuInParam.stuBeginTime.dwHour = 0;
		stuInParam.stuBeginTime.dwMinute = 00;
		stuInParam.stuBeginTime.dwSecond = 0;

		// end time
		stuInParam.stuEndTime.dwYear = 2021;
		stuInParam.stuEndTime.dwMonth = 3;
		stuInParam.stuEndTime.dwDay = 16;
		stuInParam.stuEndTime.dwHour = 23;
		stuInParam.stuEndTime.dwMinute = 59;
		stuInParam.stuEndTime.dwSecond = 59;


		long lFindHandle = INetSDK.FindFileEx(__LoginHandle, EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_SMD_RECORD_FILE, stuInParam, 30000);
		if(lFindHandle != 0){
			ToolKits.writeLog("FindFileEx Succeed!");
		} else {
			ToolKits.writeErrorLog("FindFileEx Failed!" );
			return;
		}

		MEDIAFILE_SMD_RECORD_FILE_INFO[] outfile = new MEDIAFILE_SMD_RECORD_FILE_INFO[10];
		for (int i = 0; i < outfile.length; i++) {
			outfile[i] = new MEDIAFILE_SMD_RECORD_FILE_INFO();
		}

		int nCount = 0;
		int nMaxCount = outfile.length;
		int nRetCount = 0;
		while(true) {
			nRetCount = INetSDK.FindNextFileEx(lFindHandle, EM_FILE_QUERY_TYPE.SDK_FILE_QUERY_SMD_RECORD_FILE, outfile, 10000);
			if(nRetCount <= 0) {
				ToolKits.writeErrorLog("FindNextFileEx Failed!" );
				return;
			}

			for(int i = 0; i < nRetCount; i++){
				ToolKits.writeLog("---------------[ " + (i + nMaxCount * nCount) +"] -----------------");
				ToolKits.writeLog("file path：" + new String(outfile[i].szFilePath).trim());
			}

			if(nRetCount <= nMaxCount) {
				break;
			} else {
				nCount++;
			}
		}

		INetSDK.FindCloseEx(lFindHandle);
	}
	/**
	 * 查询网络接口信息
	 */
    public void  QueryNetInterface() {
        SDKDEV_NETINTERFACE_INFO[] stuNetInterface = new SDKDEV_NETINTERFACE_INFO[FinalVar.SDK_MAX_NETINTERFACE_NUM];
        for (int i = 0 ; i < stuNetInterface.length; ++i) {
            stuNetInterface[i] = new SDKDEV_NETINTERFACE_INFO();
        }
        Integer validCount = new Integer(0);
        boolean bRet = INetSDK.QueryDevStateEx(__LoginHandle, FinalVar.SDK_DEVSTATE_NETINTERFACE, stuNetInterface, 5000, validCount);
        if (bRet) {

			ToolKits.writeLog("网卡个数:" + validCount.intValue());

			for(int i = 0; i < validCount.intValue(); i++) {
				ToolKits.writeLog("网卡名:" + new String(stuNetInterface[i].szName).trim());
			}
        } else {
            ToolKits.writeErrorLog("QueryDevState failed.");
        }
    }

	// 乐橙云注册配置
	public void GetandSetPAASConfig() {
		NET_CFG_VSP_PAAS_INFO msg = new NET_CFG_VSP_PAAS_INFO();
		int channel = -1;  // 通道号,必填-1

		/*
		 * 获取
		 */
		if (INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_VSP_PAAS, channel, msg, 3000, null)) {
			ToolKits.writeLog("Get NET_EM_CFG_VSP_PAAS Config Succeed !");
			ToolKits.writeLog("bEnable = " + msg.bEnable);
			ToolKits.writeLog("szSN = " + new String(msg.szSN).trim());
			ToolKits.writeLog("szRsServerIP = " + new String(msg.szRsServerIP).trim());
			ToolKits.writeLog("szCheckCode = " + new String(msg.szCheckCode).trim());
			ToolKits.writeLog("bOnline = " + msg.bOnline);

			//改值后设置
			msg.bEnable = !msg.bEnable;
			msg.bOnline = !msg.bOnline;


			if(INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_VSP_PAAS, channel, msg, 3000, null, null)) {
				ToolKits.writeLog("Set NET_EM_CFG_VSP_PAAS Config Succeed !");
			} else {
				ToolKits.writeErrorLog("Set NET_EM_CFG_VSP_PAAS Config Failed !" );
			}
		} else {
			ToolKits.writeErrorLog("Get NET_EM_CFG_VSP_PAAS Config Failed !" );
		}
	}

	SDK_PTZ_LOCATION_INFO tmp = new SDK_PTZ_LOCATION_INFO();
	/**
	 * 查询PTZ当前状态
	 */
	public void  QueryPTZLocation() {
		SDK_PTZ_LOCATION_INFO stuInfo = new SDK_PTZ_LOCATION_INFO();
		boolean bRet = INetSDK.QueryDevState(__LoginHandle, FinalVar.SDK_DEVSTATE_PTZ_LOCATION, stuInfo, 5000);
		if (bRet) {
			if(stuInfo.nChannelID != tmp.nChannelID) ToolKits.writeLog("nChannelID changed = " + (stuInfo.nChannelID - tmp.nChannelID));
			if(stuInfo.nPTZPan != tmp.nPTZPan) ToolKits.writeLog("nPTZPan changed = " + (stuInfo.nPTZPan - tmp.nPTZPan));
			if(stuInfo.nPTZTilt != tmp.nPTZTilt) ToolKits.writeLog("nPTZTilt changed = " + (stuInfo.nPTZTilt - tmp.nPTZTilt));
			if(stuInfo.nPTZZoom != tmp.nPTZZoom) ToolKits.writeLog("nPTZZoom changed = " + (stuInfo.nPTZZoom - tmp.nPTZZoom));
			if(stuInfo.nZoomValue != tmp.nZoomValue) ToolKits.writeLog("nZoomValue changed = " + (stuInfo.nZoomValue - tmp.nZoomValue));
			if(stuInfo.fFocusPosition != tmp.fFocusPosition) ToolKits.writeLog("fFocusPosition changed = " + (stuInfo.fFocusPosition - tmp.fFocusPosition));
			if(stuInfo.stuAbsPosition.nPosX != tmp.stuAbsPosition.nPosX) ToolKits.writeLog("ABSnPosX changed = " + (stuInfo.stuAbsPosition.nPosX - tmp.stuAbsPosition.nPosX));
			if(stuInfo.stuAbsPosition.nPosY != tmp.stuAbsPosition.nPosY) ToolKits.writeLog("ABSnPosY changed = " + (stuInfo.stuAbsPosition.nPosY - tmp.stuAbsPosition.nPosY));
			if(stuInfo.stuAbsPosition.nZoom != tmp.stuAbsPosition.nZoom) ToolKits.writeLog("ABSnZoom changed = " + (stuInfo.stuAbsPosition.nZoom - tmp.stuAbsPosition.nZoom));
			if(stuInfo.nFocusMapValue != tmp.nFocusMapValue) ToolKits.writeLog("nFocusMapValue changed = " + (stuInfo.nFocusMapValue - tmp.nFocusMapValue));
			if(stuInfo.nZoomMapValue != tmp.nZoomMapValue) ToolKits.writeLog("nZoomMapValue changed = " + (stuInfo.nZoomMapValue - tmp.nZoomMapValue));
			tmp = stuInfo;
		} else {
			ToolKits.writeErrorLog("QueryDevState failed.");
		}
	}

	/**
	 * 获取物理链路状态， 先用 QueryNetInterface() 查询网卡名称
	 * @param name 网卡名
     */
	public void QueryAppLinkStat(String name) {
		/*
		 * 入参
		 */
		NET_IN_NETAPP_LINK_STATUS stuIn = new NET_IN_NETAPP_LINK_STATUS();

		Integer stError = new Integer(0);
		System.arraycopy(name.getBytes(), 0, stuIn.szEthName, 0, name.getBytes().length);

		/**
		 * 出参
		 */
		NET_OUT_NETAPP_LINK_STATUS stuOut = new NET_OUT_NETAPP_LINK_STATUS();

		if (INetSDK.QueryNetStat(__LoginHandle, EM_NET_QUERY_TYPE.NET_APP_LINK_STAT, stuIn, stuOut, stError, 5000)) {
			ToolKits.writeLog("QueryNetStat success.");
			ToolKits.writeLog("bWorking:" + stuOut.bWorking + " bIPConflict:" + stuOut.bIPConflict);
		} else {
			ToolKits.writeErrorLog("QueryNetStat failed.");
		}
	}

	// 图片标题属性配置， 先获取，再设置
	public void PictureTitleConfig() {
		NET_OSD_PICTURE_TITLE msg = new NET_OSD_PICTURE_TITLE();
		msg.emOsdBlendType = NET_EM_OSD_BLEND_TYPE.NET_EM_OSD_BLEND_TYPE_MAIN; // 码流叠加类型,不管是获取还是设置都要设置该字段
		int channel = 0;  // 通道号

		/*
		 *获取
		 */
		if (INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_PICTURETITLE, channel, msg, 3000, null)) {
			ToolKits.writeLog("是否叠加:" + msg.bEncodeBlend);

			/*
			 *设置
			 */
			if(msg.bEncodeBlend) {
				msg.bEncodeBlend = false;  // 取消图片
			} else {
				msg.bEncodeBlend = true;  // 叠加图片
			}

			if(INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_PICTURETITLE, channel, msg, 3000, null, null)) {
				ToolKits.writeLog("Set Succeed!");
			} else {
				ToolKits.writeErrorLog("Set Faile" );
			}
		} else {
			ToolKits.writeErrorLog("Get Faile" );
		}
	}

	/**
	 * 报警盒子配置，通道号从0开始
	 */
	public void LocalExtAalarmConfig() {
		NET_LOCAL_EXT_ALARM_INFO msg = new NET_LOCAL_EXT_ALARM_INFO();
		int channel = 0;  // 通道号

		/*
		 *获取
		 */
		if (INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_LOCAL_EXT_ALARM, channel, msg, 3000, null)) {
			ToolKits.writeLog("使能:" + msg.bEnable);
			ToolKits.writeLog("报警通道名称:" + new String(msg.szName).trim());

			/*
			 *设置
			 */
			if(msg.bEnable) {
				msg.bEnable = false;
			} else {
				msg.bEnable = true;
			}
			if(INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_LOCAL_EXT_ALARM, channel, msg, 3000, null, null)) {
				ToolKits.writeLog("Set Succeed!");
			} else {
				ToolKits.writeErrorLog("Set Faile" );
			}
		} else {
			ToolKits.writeErrorLog("Get Faile" );
		}
	}

	// 获取分区状态
	public void NASGetLogicVolumeStatus() {
		// 入参
		NET_IN_NAS_GETLOGICVOLUMESTATUS stIn = new NET_IN_NAS_GETLOGICVOLUMESTATUS();

		// 出参
		NET_OUT_NAS_GETLOGICVOLUMESTATUS stOut = new NET_OUT_NAS_GETLOGICVOLUMESTATUS();

		if(INetSDK.NASGetLogicVolumeStatus(__LoginHandle, stIn, stOut, 5000)) {
			ToolKits.writeLog("分区状态:" + stOut.emLVStatus);

			for(int i = 0; i < stOut.nRetLvNameNum; i++) {
				ToolKits.writeLog("分区名称:" + new String(stOut.szLvName[i]).trim());
			}
		} else {
			ToolKits.writeErrorLog("获取分区状态失败！");
		}
	}

	// 订阅分区修复状态
	private long _attachNASHandle = 0;
	public void AttachNASRepairState() {
		// 入参
		NET_IN_ATTACH_NAS_REPAIRSTATE stIn = new NET_IN_ATTACH_NAS_REPAIRSTATE();
		stIn.cbLVRepairState = NASRepairStateCallBack.getInstance();

		// 出参
		NET_OUT_ATTACH_NAS_REPAIRSTATE stOut = new NET_OUT_ATTACH_NAS_REPAIRSTATE();

		_attachNASHandle = INetSDK.AttachNASRepairState(__LoginHandle, stIn, stOut, 5000);
		if(_attachNASHandle != 0) {
			ToolKits.writeLog("Attach Succeed!");
		} else {
			ToolKits.writeErrorLog("Attach Failed!");
		}
	}

	private static class NASRepairStateCallBack implements CB_fLVRepairStateCallBack {
		private NASRepairStateCallBack() {}

		private static class NASRepairStateCallBackHolder {
			private static NASRepairStateCallBack instance = new NASRepairStateCallBack();
		}

		public static NASRepairStateCallBack getInstance() {
			return NASRepairStateCallBackHolder.instance;
		}

		@Override
		public void invoke(long lAttachHandle, NET_LV_STATE pBuf) {
			ToolKits.writeLog("修复状态:" + pBuf.emLVRepairStatus);
			for(int i = 0; i < pBuf.nRetLvNameNum; i++) {
				ToolKits.writeLog("分区名称:" + new String(pBuf.szLvName[i]).trim());
			}
		}
	}

	// 取消订阅分区修复状态
	public void DetachNASRepairState() {
		if(_attachNASHandle != 0) {
			if(INetSDK.DetachNASRepairState(_attachNASHandle))
			{
				ToolKits.writeLog("DetachNASRepairState success");
			}
			_attachNASHandle = 0;
		}
	}


	// 订阅电视墙场景
	private long _attachMonitorWallSceneHandle = 0;
	public void AttachMonitorWallScene() {
		// 入参
		NET_IN_ATTACH_MONITOR_WALL_SCENE stIn = new NET_IN_ATTACH_MONITOR_WALL_SCENE();
		stIn.nMonitorWallID = 0;
		stIn.cbMonitorWallScene = MonitorWallSceneCallback.getInstance();

		// 出参
		NET_OUT_ATTACH_MONITOR_WALL_SCENE stOut = new NET_OUT_ATTACH_MONITOR_WALL_SCENE();

		_attachMonitorWallSceneHandle = INetSDK.AttachMonitorWallScene(__LoginHandle, stIn, stOut, 5000);
		if(_attachMonitorWallSceneHandle != 0) {
			ToolKits.writeLog("Attach Succeed!");
		} else {
			ToolKits.writeErrorLog("Attach Failed!");
		}
	}

	private static class MonitorWallSceneCallback implements CB_fMonitorWallScene {
		private MonitorWallSceneCallback() {}

		private static class MonitorWallSceneCallbackHolder {
			private static MonitorWallSceneCallback instance = new MonitorWallSceneCallback();
		}

		public static MonitorWallSceneCallback getInstance() {
			return MonitorWallSceneCallbackHolder.instance;
		}

		@Override
		public void invoke(long lAttachHandle, NET_CB_MONITOR_WALL_SCENE pBuf) {
			ToolKits.writeLog("szCurrentCollectionName:" + new String(pBuf.szCurrentCollectionName).trim());
		}
	}

	// 取消订阅电视墙场景
	public void DetachMonitorWallScene() {
		if(_attachMonitorWallSceneHandle != 0) {
			INetSDK.DetachMonitorWallScene(_attachMonitorWallSceneHandle);
			_attachMonitorWallSceneHandle = 0;
		}
	}

	// 配置隐私空间信息
	public void NASFileSetUserAuthInfo() {
		// 入参
		NET_IN_SET_USER_AUTH_INFO stIn = new NET_IN_SET_USER_AUTH_INFO();
		// 密码
		String passwd = "admin123";
		System.arraycopy(passwd.getBytes(), 0, stIn.szPassword, 0, passwd.getBytes().length);

		// 密码提示问题
		String passwdHint = "12345678912";
		System.arraycopy(passwdHint.getBytes(), 0, stIn.szPasswordHint, 0, passwdHint.getBytes().length);

		// 手机号，可选
		String phone = "12345678912";
		System.arraycopy(phone.getBytes(), 0, stIn.szPhoneNo, 0, phone.getBytes().length);

		// 邮箱，可选
		String email = "1233@163.com";
		System.arraycopy(email.getBytes(), 0, stIn.szEmail, 0, email.getBytes().length);

		// 出参
		NET_OUT_SET_USER_AUTH_INFO stOut = new NET_OUT_SET_USER_AUTH_INFO();

		if(INetSDK.NASFileSetUserAuthInfo(__LoginHandle, stIn, stOut, 3000)) {
			ToolKits.writeLog("配置隐私空间信息成功.");
		} else {
			ToolKits.writeErrorLog("配置隐私空间信息失败.");
		}
	}

	// 修改隐私空间密码
	public void NASFileModifyPassword() {
		// 入参
		NET_IN_MODIFY_PASSWORD stIn = new NET_IN_MODIFY_PASSWORD();
		// 旧密码
		String oldPasswd = "admin123";
		System.arraycopy(oldPasswd.getBytes(), 0, stIn.szOldPassword, 0, oldPasswd.getBytes().length);

		// 新密码
		String newPasswd = "admin123";
		System.arraycopy(newPasswd.getBytes(), 0, stIn.szNewPassword, 0, newPasswd.getBytes().length);

		// 密码提示问题
		String passwdHint = "12345678912";
		System.arraycopy(passwdHint.getBytes(), 0, stIn.szPasswordHint, 0, passwdHint.getBytes().length);

		// 出参
		NET_OUT_MODIFY_PASSWORD stOut = new NET_OUT_MODIFY_PASSWORD();

		if(INetSDK.NASFileModifyPassword(__LoginHandle, stIn, stOut, 3000)) {
			ToolKits.writeLog("修改隐私空间密码成功.");
		} else {
			ToolKits.writeErrorLog("修改隐私空间密码失败.");
		}
	}

	// 鉴权密码功能
	public void NASFileAuthenticate() {
		// 入参
		NET_IN_AUTHENTICATE stIn = new NET_IN_AUTHENTICATE();
		// 验证密码
		String passwd = "admin123";
		System.arraycopy(passwd.getBytes(), 0, stIn.szPassword, 0, passwd.getBytes().length);

		// 出参
		NET_OUT_AUTHENTICATE stOut = new NET_OUT_AUTHENTICATE();

		if(INetSDK.NASFileAuthenticate(__LoginHandle, stIn, stOut, 3000)) {
			ToolKits.writeLog("鉴权密码成功.");
		} else {
			ToolKits.writeErrorLog("鉴权密码失败.");
		}
	}

	// NAS功能
	public void NASFunction() {
		String[] items = {"获取分区状态",
						  "订阅分区修复状态",
						  "取消订阅分区修复状态",
						  "配置隐私空间信息",
						  "修改隐私空间密码",
						  "鉴权密码功能"};

		AlertDialog.Builder dialog = new AlertDialog.Builder(this);
		dialog.setItems(items, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				switch (which) {
					case 0:
						NASGetLogicVolumeStatus();
						break;
					case 1:
						AttachNASRepairState();
						break;
					case 2:
						DetachNASRepairState();
						break;
					case 3:
						NASFileSetUserAuthInfo();
						break;
					case 4:
						NASFileModifyPassword();
						break;
					case 5:
						NASFileAuthenticate();
						break;
				}
			}
		});
		dialog.create().show();;
	}

	// 电视墙场景功能
	public void MonitorWallSceneFunction() {
		String[] items = {
				"订阅电视墙场景功能",
				"取消订阅电视墙场景功能",
				};

		AlertDialog.Builder dialog = new AlertDialog.Builder(this);
		dialog.setItems(items, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				switch (which) {
					case 0:
						AttachMonitorWallScene();
						break;
					case 1:
						DetachMonitorWallScene();
						break;
				}
			}
		});
		dialog.create().show();;
	}

	public void XVROperate() {
		String[] items = {"开启警号",
						  "关闭警号",
						  "开启无线警号",
						  "关闭无线警号",
		                  "获取可采集的传感器列表"};

		AlertDialog dialog = new AlertDialog.Builder(this)
				.setItems(items, new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						switch (which) {
							case 0:
								AlarmBellControl(CtrlType.SDK_CTRL_START_ALARMBELL);
								break;
							case 1:
								AlarmBellControl(CtrlType.SDK_CTRL_STOP_ALARMBELL);
								break;
							case 2:
								StartLowRateWPANAlarmBell();
								break;
							case 3:
								StopLowRateWPANAlarmBell();
								break;
							case 4:
								GetSensorCollectSupportList();
								break;
						}
					}
				}).show();
	}


	public void GetDevCaps_AudioOutputCaps() {
		int nType = FinalVar.NET_AUDIO_OUTPUT_CAPS;
		// 入参
		NET_IN_AUDIO_OUTPUT_CAPS stIn = new NET_IN_AUDIO_OUTPUT_CAPS();
		stIn.nChannel = 0; // 通道号

		// 出参
		NET_OUT_AUDIO_OUTPUT_CAPS stOut = new NET_OUT_AUDIO_OUTPUT_CAPS();

		if(INetSDK.GetDevCaps(__LoginHandle, nType, stIn, stOut, 5000)) {
			ToolKits.writeLog("nLineOut : " + stOut.stuType.nLineOut);
			ToolKits.writeLog("nSpeaker : " + stOut.stuType.nSpeaker);
		} else {
			ToolKits.writeErrorLog("GetDevCaps Failed!" );
		}
	}

	public void GetHumanRadioCaps() {

		// 入参
		NET_IN_GET_HUMAN_RADIO_CAPS stIn = new NET_IN_GET_HUMAN_RADIO_CAPS();
		stIn.nChannel = 1; // 通道号
		// 出参
		NET_OUT_GET_HUMAN_RADIO_CAPS stOut = new NET_OUT_GET_HUMAN_RADIO_CAPS();

		if(INetSDK.GetHumanRadioCaps(__LoginHandle, stIn, stOut, 5000)) {
			ToolKits.writeLog("GetHumanRadioCaps success,bSupportRegulatorAlarm : " + stOut.bSupportRegulatorAlarm);

		} else {
			ToolKits.writeErrorLog("GetHumanRadioCaps Failed!" );
		}
	}

	/**
	 * 开启/关闭警号
	 * @param nType 开启:CtrlType.SDK_CTRL_START_ALARMBELL   关闭:CtrlType.SDK_CTRL_STOP_ALARMBELL
     */
	public void AlarmBellControl(int nType) {
		NET_CTRL_ALARMBELL alarmbell = new NET_CTRL_ALARMBELL();
		alarmbell.nChannelID = 0;    // 通道号(0开始)

		if(INetSDK.ControlDevice(__LoginHandle, nType, alarmbell, 4000)) {
			ToolKits.writeLog("成功!");
		} else {
			ToolKits.writeErrorLog("失败!");
		}
	}

	/**
	 * 开启无线警号
	 */
	public void StartLowRateWPANAlarmBell() {
		// 入参
		NET_IN_START_REMOTELOWRATEWPAN_ALARMBELL stIn = new NET_IN_START_REMOTELOWRATEWPAN_ALARMBELL();
		stIn.nChannelID = 0;   // 通道号

		// 出参
		NET_OUT_START_REMOTELOWRATEWPAN_ALARMBELL stOut = new NET_OUT_START_REMOTELOWRATEWPAN_ALARMBELL();

		if(INetSDK.ControlDeviceEx(__LoginHandle, CtrlType.SDK_CTRL_START_REMOTELOWRATEWPAN_ALARMBELL,
									stIn, stOut, 4000)) {
			ToolKits.writeLog("开启无线警号成功!");
		} else {
			ToolKits.writeErrorLog("开启无线警号失败!");
		}
	}

	/**
	 * 关闭无线警号
	 */
	public void StopLowRateWPANAlarmBell() {
		// 入参
		NET_IN_STOP_REMOTELOWRATEWPAN_ALARMBELL stIn = new NET_IN_STOP_REMOTELOWRATEWPAN_ALARMBELL();
		stIn.nChannelID = 0;   // 通道号

		// 出参
		NET_OUT_STOP_REMOTELOWRATEWPAN_ALARMBELL stOut = new NET_OUT_STOP_REMOTELOWRATEWPAN_ALARMBELL();

		if(INetSDK.ControlDeviceEx(__LoginHandle, CtrlType.SDK_CTRL_STOP_REMOTELOWRATEWPAN_ALARMBELL,
				stIn, stOut, 4000)) {
			ToolKits.writeLog("关闭无线警号成功!");
		} else {
			ToolKits.writeErrorLog("关闭无线警号失败!");
		}
	}

	/**
	 * 获取可采集的传感器列表
	 */
	public void GetSensorCollectSupportList() {
		// 入参
		NET_IN_GET_SENSOR_COLLECT_SUPPORT_LIST stIn = new NET_IN_GET_SENSOR_COLLECT_SUPPORT_LIST();

		// 出参
		NET_OUT_GET_SENSOR_COLLECT_SUPPORT_LIST stOut = new NET_OUT_GET_SENSOR_COLLECT_SUPPORT_LIST();

		if(INetSDK.GetSensorCollectSupportList(__LoginHandle, stIn, stOut, 4000)) {
			for(int i = 0; i < stOut.nCount; i++) {
				ToolKits.writeLog("传感器传输介质:" + stOut.stInfo[i].emMediaType);
				ToolKits.writeLog("接入点序号:" + stOut.stInfo[i].nAPIndex);
				ToolKits.writeLog("报警通道号:" + stOut.stInfo[i].nAlarmChannel);
				ToolKits.writeLog("无线设备类型:" + stOut.stInfo[i].emDeviceType);
				ToolKits.writeLog("传感器类型:" + stOut.stInfo[i].emSensorType + "\n");
			}
		} else {
			ToolKits.writeErrorLog("获取可采集的传感器列表失败.");
		}
	}

	/**
	 * 环境光线配置
	 */
	void BackLightConfig() {
		CFG_VIDEOIN_BACKLIGHT_INFO msg = new CFG_VIDEOIN_BACKLIGHT_INFO();
		int channel = 0;
		boolean zRet = ToolKits.GetDevConfig(FinalVar.CFG_CMD_VIDEOIN_BACKLIGHT, msg, __LoginHandle, channel, 10240);
		if (zRet) {
			// 0-白天1-夜晚 2-普通
			for(int i = 0; i < FinalVar.BACKLIGHT_CONFIG_COUNT; i++) {
				ToolKits.writeLog("背光模式 : " + msg.stuVideoInBackLight[i].emMode);
				ToolKits.writeLog("背光补偿模式 : " + msg.stuVideoInBackLight[i].emBacklightMode);

				ToolKits.writeLog("背光补偿区域 : " + msg.stuVideoInBackLight[i].stuBacklightRegion.nLeft + " " +
														msg.stuVideoInBackLight[i].stuBacklightRegion.nTop + " " +
														msg.stuVideoInBackLight[i].stuBacklightRegion.nRight + " " +
														msg.stuVideoInBackLight[i].stuBacklightRegion.nBottom);

				ToolKits.writeLog("宽动态 : " + msg.stuVideoInBackLight[i].nWideDynamicRange);
				ToolKits.writeLog("强光抑制 : " + msg.stuVideoInBackLight[i].nGlareInhibition);
				ToolKits.writeLog("SSA对比度调节模式 : " + msg.stuVideoInBackLight[i].emInitensityMode);
				ToolKits.writeLog("SSA手动调整强度值 : " + msg.stuVideoInBackLight[i].nIntensity);
			}


			// 设置
			// 背光补偿模式，当emMode == EM_BACKLIGHT_BACKLIGHT时有效
			// 背光补偿区域，当emBacklightMode == EM_BACKLIGHT_REGION时有效
			// 宽动态值，emMode == EM_BACKLIGHT_WIDEDYNAMIC时有效
			// 强光抑制，emMode == EM_BACKLIGHT_GLAREINHIBITION时有效
			// SSA对比度调节模式，emMode==EM_BACKLIGHT_SSA时有效
			// SSA手动调整强度值，emInitensityMode==EM_INTENSITY_MANUAL时有效
			for(int i = 0; i < FinalVar.BACKLIGHT_CONFIG_COUNT; i++) {
				msg.stuVideoInBackLight[i].emMode = EM_VIDEOIN_BACKLIGHT_MODE.EM_BACKLIGHT_BACKLIGHT;
				msg.stuVideoInBackLight[i].emBacklightMode = EM_BACKLIGHT_MODE.EM_BACKLIGHT_REGION;
			}

			zRet = false;
			zRet = ToolKits.SetDevConfig(FinalVar.CFG_CMD_VIDEOIN_BACKLIGHT, msg, __LoginHandle, channel, 10240);
			if (zRet)
			{
				ToolKits.writeLog("BackLight SetDevConfig OK !");
			}
		}
	}

	/**
	 * 获取设备能力
	 */
	public void GetRemoteLowRateWPANCaps() {
		/*
		 * 入参
		 */
		NET_IN_GET_REMOTELOWRATEWPAN_CAPS stIn = new NET_IN_GET_REMOTELOWRATEWPAN_CAPS();
		stIn.nChannelCount = 2;   // 实际要获取的视频通道个数

		// 视频通道号
		stIn.stChannels[0] = 0;
		stIn.stChannels[1] = 1;

		/*
		 * 出参
		 */
		NET_OUT_GET_REMOTELOWRATEWPAN_CAPS stOut = new NET_OUT_GET_REMOTELOWRATEWPAN_CAPS();


		if(INetSDK.GetRemoteLowRateWPANCaps(__LoginHandle, stIn, stOut, 5000)) {
			ToolKits.writeLog("实际返回的通道个数:" + stOut.nRetChannelCount);
			for(int i = 0; i < stOut.nRetChannelCount; i++) {
				ToolKits.writeLog("设备是否支持无线网关:" + stOut.stCaps[i].bSupportWirelessGateway);
			}

			ToolKits.writeLog("实际返回的结果个数:" + stOut.nRetCodeCount);
			for(int i = 0; i < stOut.nRetCodeCount; i++) {
				ToolKits.writeLog("每个视频通道的返回结果:" + stOut.stReturnCode[i]);   // 参考 EM_RETURN_CODE_TYPE, 0-位置， 1-成功， 2-失败， 3-超时
			}
		} else {
			ToolKits.writeErrorLog("获取设备能力失败.");
		}
	}

	/**
	 * 获取接入的传感器信息
	 */
	public void GetCoaxialSensorInfo() {
		/*
		 * 入参
		 */
		NET_IN_GET_COAXIAL_SENSOR_INFO stIn = new NET_IN_GET_COAXIAL_SENSOR_INFO();
		stIn.nChannel = -1;   // 视频通道, -1表示全部通道

		/*
		 * 出参
		 */
		NET_OUT_GET_COAXIAL_SENSOR_INFO stOut = new NET_OUT_GET_COAXIAL_SENSOR_INFO();

		if(INetSDK.GetCoaxialSensorInfo(__LoginHandle, stIn, stOut, 5000)) {
			ToolKits.writeLog("返回的传感器ID数量:" + stOut.nRetCount);

			for(int i = 0; i < stOut.nRetCount; i++) {
				ToolKits.writeLog("传感器是否在线:" + stOut.stSensorInfo[i].bIsOnLine);
				ToolKits.writeLog("报警通道名称:" + new String(stOut.stSensorInfo[i].szAlarmName).trim());
				ToolKits.writeLog("传感器大类:" + stOut.stSensorInfo[i].emSensorClass); //参考 EM_SENSOR_CLASS_TYPE
				ToolKits.writeLog("传感器序列号:" + new String(stOut.stSensorInfo[i].szSN).trim());
			}
		} else {
			ToolKits.writeErrorLog("获取接入的传感器信息失败.");
		}
	}

	/**
	 * 获取XVR声光报警状态
	 */
	public void GetCoaxialControlIOStatus() {
		boolean bRet = false;
		int nType = FinalVar.NET_COAXIAL_CONTROL_IO_STATUS;

		/**
		 * 入参
		 */
		NET_IN_GET_COAXIAL_CONTROL_IO_STATUS stIn = new NET_IN_GET_COAXIAL_CONTROL_IO_STATUS();
		stIn.nChannel = 0;  // 通道号

		/**
		 * 出参
		 */
		NET_OUT_GET_COAXIAL_CONTROL_IO_STATUS stOut = new NET_OUT_GET_COAXIAL_CONTROL_IO_STATUS();

		bRet = INetSDK.GetDevCaps(__LoginHandle, nType, stIn, stOut, 5000);
		if(bRet) {
			ToolKits.writeLog("白光灯操作类型 : " + stOut.emWhiteLight);   // 参考 EM_COAXIAL_CONTROL_IO_STATUS
			ToolKits.writeLog("喇叭操作类型 : " + stOut.emSpeaker);        // 参考 EM_COAXIAL_CONTROL_IO_STATUS
		} else {
			ToolKits.writeErrorLog("GetDevCaps Failed!" );
		}
	}

	// 前端相机警号配置
	void AlarmBellConfig() {
		NET_CFG_REMOTE_ALARM_BELL_INFO msg = new NET_CFG_REMOTE_ALARM_BELL_INFO();
		int emCfgOpType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_REMOTE_ALARM_BELL;
		int nChannelID = -1;

		// 获取
		if(INetSDK.GetConfig(__LoginHandle, emCfgOpType, nChannelID, msg, _waittime, null)) {
			ToolKits.writeLog("alarm emMode: " + msg.emMode);   // 参考枚举  EM_ALARM_OUT_MODE

			// 设置
			msg.emMode = EM_ALARM_OUT_MODE.EM_ALARM_OUT_MODE_AUTO;
			INetSDK.SetConfig(__LoginHandle, emCfgOpType, nChannelID, msg, _waittime, null, null);
		}
	}

	// SIP配置，该配置是全局的，不区分通道, 通道号填-1
	void SipConfig() {
		NET_CFG_SIPSERVER_INFO msg = new NET_CFG_SIPSERVER_INFO();
		int emCfgOpType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_SIP;
		int nChannelID = -1;

		// 获取
		if(INetSDK.GetConfig(__LoginHandle, emCfgOpType, nChannelID, msg, _waittime, null)) {
			ToolKits.writeLog(msg.toString());

			// 设置
			INetSDK.SetConfig(__LoginHandle, emCfgOpType, nChannelID, msg, _waittime, null, null);
		}
	}

	// VTH中远程IPC配置, 该配置是全局的，不区分通道, 通道号填-1， 10 * 1024是内存大小，如果发解析失败，需要增大
	void VTHRemoteIPCInfoConfig() {
		String cmd = FinalVar.CFG_CMD_VTH_REMOTE_IPC_INFO;
		int channel = -1;

		CFG_VTH_REMOTE_IPC_INFO msg = new CFG_VTH_REMOTE_IPC_INFO();

		/*
		 * 获取
		 */
		if(ToolKits.GetDevConfig(cmd, msg, __LoginHandle, channel, 10 * 1024)) {
			for(int i = 0; i < msg.nRemoteIPCNum; i++) {
				ToolKits.writeLog(msg.stuCfgRemoteIpcInfo[i].toString());
			}

			/*
			 * 设置
			 */
			if(ToolKits.SetDevConfig(cmd, msg, __LoginHandle, channel, 10 * 1024)) {
				ToolKits.writeLog("Set CFG_CMD_VTH_REMOTE_IPC_INFO Succeed!");
			} else {
				ToolKits.writeErrorLog("Set CFG_CMD_VTH_REMOTE_IPC_INFO Failed!");
			}
		}
	}

	// VTO呼叫配置，该配置是全局的，不区分通道, 通道号填-1
	void VTOCallConfig() {
		String cmd = FinalVar.CFG_CMD_VTO_CALL;
		int channel = -1;

		CFG_VTO_CALL_INFO msg = new CFG_VTO_CALL_INFO();

		/*
		 * 获取
		 */
		if(ToolKits.GetDevConfig(cmd, msg, __LoginHandle, channel, 5 * 1024)) {
			ToolKits.writeLog(msg.toString());

			/*
			 * 设置
			 */
			if(ToolKits.SetDevConfig(cmd, msg, __LoginHandle, channel, 5 * 1024)) {
				ToolKits.writeLog("Set CFG_CMD_VTO_CALL Succeed!");
			} else {
				ToolKits.writeErrorLog("Set CFG_CMD_VTO_CALL Failed!");
			}
		}
	}

	// VTO楼层配置，该配置是全局的，不区分通道, 通道号填-1
	void BuildingConfig() {
		String cmd = FinalVar.CFG_CMD_BUILDING;
		int channel = -1;

		CFG_BUILDING_INFO msg = new CFG_BUILDING_INFO();

		/*
		 * 获取
		 */
		if(ToolKits.GetDevConfig(cmd, msg, __LoginHandle, channel, 5 * 1024)) {
			ToolKits.writeLog(msg.toString());

			/*
			 * 设置
			 */
			if(ToolKits.SetDevConfig(cmd, msg, __LoginHandle, channel, 5 * 1024)) {
				ToolKits.writeLog("Set CFG_CMD_BUILDING Succeed!");
			} else {
				ToolKits.writeErrorLog("Set CFG_CMD_BUILDING Failed!");
			}
		}
	}

	// VTO基本信息，该配置是全局的，不区分通道, 通道号填-1
	void VTOBasicInfoConfig() {
		String cmd = FinalVar.CFG_CMD_VTO_BASIC_INFO;
		int channel = -1;

		CFG_VTO_BASIC_INFO msg = new CFG_VTO_BASIC_INFO();

		/*
		 * 获取
		 */
		if(ToolKits.GetDevConfig(cmd, msg, __LoginHandle, channel, 5 * 1024)) {
			ToolKits.writeLog(msg.toString());

			/*
			 * 设置
			 */
			if(ToolKits.SetDevConfig(cmd, msg, __LoginHandle, channel, 5 * 1024)) {
				ToolKits.writeLog("Set CFG_CMD_VTO_BASIC_INFO Succeed!");
			} else {
				ToolKits.writeErrorLog("Set CFG_CMD_VTO_BASIC_INFO Failed!");
			}
		}
	}

	// 视频对讲电话基础配置，不区分通道, 通道号填-1
	void VideoTalkPhoneBasicConfig() {
		String cmd = FinalVar.CFG_CMD_VIDEO_TALK_PHONE_BASIC;
		int channel = -1;

		CFG_VIDEO_TALK_PHONE_BASIC_INFO msg = new CFG_VIDEO_TALK_PHONE_BASIC_INFO();

		/*
		 * 获取
		 */
		if(ToolKits.GetDevConfig(cmd, msg, __LoginHandle, channel, 5 * 1024)) {
			ToolKits.writeLog(msg.toString());

			/*
			 * 设置
			 */
			if(ToolKits.SetDevConfig(cmd, msg, __LoginHandle, channel, 5 * 1024)) {
				ToolKits.writeLog("Set VideoTalkPhoneBasic Succeed!");
			} else {
				ToolKits.writeErrorLog("Set VideoTalkPhoneBasic Failed!");
			}
		}
	}

	// 门禁配置
	void AccessEventConfig() {
		String cmd = FinalVar.CFG_CMD_ACCESS_EVENT;
		int channel = -1;		//通道号

		CFG_ACCESS_EVENT_INFO msg = new CFG_ACCESS_EVENT_INFO();

		/*
		 * 获取
		 */
		if(ToolKits.GetDevConfig(cmd, msg, __LoginHandle, channel, 4 * 1024)) {
			ToolKits.writeLog("Get AccessEvent Succeed!");
			ToolKits.writeLog("msg.emstate = " + msg.emState);
			/**如需修改配置，请在此处进行**/
			msg.emState = CFG_ACCESS_STATE.ACCESS_STATE_OPENALWAYS;
			/*
			 * 设置
			 */
			if(ToolKits.SetDevConfig(cmd, msg, __LoginHandle, channel, 4 * 1024)) {
				ToolKits.writeLog("Set AccessEvent Succeed!");
			} else {
				ToolKits.writeErrorLog("Set AccessEvent Failed!");
			}
		} else {
			ToolKits.writeErrorLog("Get VideoTalkPhoneBasic Failed!");
		}
	}

	public void VTOConfig() {
		String[] items = {"sip配置",
						  "VTH中远程IPC配置",
						  "VTO呼叫配置",
						  "VTO楼层配置",
						  "VTO基本信息",
						  "视频对讲电话基础配置"};

		AlertDialog dialog = new AlertDialog.Builder(this)
				.setItems(items, new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						switch (which) {
							case 0:
								SipConfig();
								break;
							case 1:
								VTHRemoteIPCInfoConfig();
								break;
							case 2:
								VTOCallConfig();
								break;
							case 3:
								BuildingConfig();
								break;
							case 4:
								VTOBasicInfoConfig();
								break;
							case 5:
								VideoTalkPhoneBasicConfig();
								break;
						}
					}
				}).show();
	}

	public void TransmitInfoForWeb() {

		String msg = "{\"method\":\"configManager.setConfig\",\"params\":{\"table\":{\"-\":{\"ServerType\":\"Android\",\"PeriodOfValidity\":1471228928,\"AuthServerAddr\":\"https:\\/\\/www.google.com\\/accounts\\/ClientLogin\",\"AuthServerPort\":443,\"PushServerAddr\":\"https:\\/\\/fcmcellphonepush.ecosightsecurity.com\\/fcm\\/send\",\"PushServerPort\":443,\"PushServerMain\":{\"Address\":\"https:\\/\\/fcmcellphonepush.ecosightsecurity.com\\/fcm\\/send\",\"Port\":443},\"User\":\"\",\"Certificate\":\"\",\"SecretKey\":\"\",\"DevName\":\"LHV8AB3A0BD5\",\"DevID\":\"7de14b29-d5db-427b-a69c-d03d8287c51b\",\"Subscribes\":[{\"Code\":\"VideoMotion\",\"SubCode\":null,\"Indexs\":[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]},{\"Code\":\"StorageFailure\",\"SubCode\":null},{\"Code\":\"StorageNotExist\",\"SubCode\":null},{\"Code\":\"AlarmLocal\",\"SubCode\":null,\"Indexs\":[0,1,2,3]},{\"Code\":\"StorageLowSpace\",\"SubCode\":null},{\"Code\":\"VideoBlind\",\"SubCode\":null,\"Indexs\":[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]}]}},\"name\":\"MobilePushNotification\",\"channel\":-1}}";
//		String msg = "{\"object\":6,\"method\":\"windowManager.setMode\",\"params\":{\"window\":0,\"mode\":\"Split4\"}}";

		byte[] stInbytes = new byte[msg.getBytes().length];
		byte[] stOutbytes = new byte[32 * 1024];

		System.arraycopy(msg.getBytes(), 0, stInbytes, 0, msg.getBytes().length);

		ToolKits.writeLog("msg:" + new String(stInbytes).trim());

		if(INetSDK.TransmitInfoForWeb(__LoginHandle, stInbytes, stOutbytes, 5000)) {
			ToolKits.writeLog("TransmitInfoForWeb Succeed!");
		} else {
			ToolKits.writeErrorLog("TransmitInfoForWeb Failed!");
		}
	}

	public void TransmitInfoForWebEx() {
		/**
		 * 入参
		 */
		NET_IN_TRANSMIT_INFO stIn = new NET_IN_TRANSMIT_INFO();
		stIn.emType = NET_TRANSMIT_INFO_TYPE.NET_TRANSMIT_INFO_TYPE_F6;
		stIn.szInJsonBuffer = new byte[256];
		stIn.dwInJsonBufferSize = 256;
		byte[] stIn1 = new byte[256];
		byte[] stOut1 = new byte[32 * 1024];
		String msg = "{\"method\":\"configManager.getConfig\",\"params\":{\"name\":\"VideoAnalyseRule[1]\"}}";
		System.arraycopy(msg.getBytes(), 0, stIn.szInJsonBuffer, 0, msg.getBytes().length);
		System.arraycopy(msg.getBytes(), 0, stIn1, 0, msg.getBytes().length);
		/**
		 * 出参
		 */
		NET_OUT_TRANSMIT_INFO stOut = new NET_OUT_TRANSMIT_INFO();
		stOut.dwOutBufferSize = 32 * 1024;
		stOut.szOutBuffer = new byte[32 * 1024];

		if(INetSDK.TransmitInfoForWeb(__LoginHandle, stIn1, stOut1, 5000)) {
			ToolKits.writeLog("TransmitInfoForWeb Succeed! : " + new String(stOut.szOutBuffer).trim());
		} else {
			ToolKits.writeErrorLog("TransmitInfoForWeb Failed!");
		}
	}

	public void FaceRecognition() {
		String[] items = {"查询人脸库", "添加人脸库", "修改人脸库", "删除人脸库",
						  "查询布控","布控", "撤控",
						  "查询人员","添加人员", "修改人员", "删除人员", "下载图片",
						  "订阅", "取消订阅"};

		AlertDialog dialog = new AlertDialog.Builder(this)
				.setItems(items, new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						switch (which) {
							case 0: {
								// 查询人脸库
								String groupId = "";
								FaceRecognition.findGroup(groupId);
								break;
							}
							case 1: {
								// 添加人脸库
								String groupName = "Android测试";
								FaceRecognition.addGroup(groupName);
								break;
							}
							case 2: {
								// 修改人脸库
								String groupId = "6";
								String groupName = "Android测试7";
								FaceRecognition.modifyGroup(groupName, groupId);
								break;
							}
							case 3: {
								// 删除人脸库
								String groupId = "17";
								FaceRecognition.deleteGroup(groupId);
								break;
							}
							case 4: {
								// 查询布控
								String groupId = "8";
								FaceRecognition.findDisposition(groupId);
								break;
							}
							case 5: {
								// 布控
								String groupId = "8";
								int[][] msg = new int[][] {{0, 60}, {1, 60}, {2, 60}, {3, 60}};
								FaceRecognition.putDisposition(groupId, msg);
								break;
							}
							case 6: {
								// 撤控
								String groupId = "8";
								int[] channels = new int[]{0, 2};
								FaceRecognition.delDisposition(groupId, channels);
								break;
							}
							case 7: {
								// 查询人员
								String groupId = "3";
								String birthdayStartTime = "";
								String birthdayEndTime = "";
								String personName = "";
								int sex = 0;
								int idType = 0;
								String idNo = "";
								FaceRecognition.findPerson(groupId, birthdayStartTime, birthdayEndTime, personName, sex, idType, idNo);
								break;
							}
							case 8: {
								// 添加人员
								String groupId = "8";
								String personName = "usa聚会的进口量";
								String birthdays = "2019-1-10";
								int sex = 1;
								int idType = 1;
								String idNo = "556554555";
								String imagePath = "/mnt/sdcard/girl.JPG";
								FaceRecognition.addPerson(groupId, personName, birthdays, sex, idType, idNo, imagePath);
								break;
							}
							case 9: {
								// 修改人员
								String groupId = "8";
								String uid = "5272";
								String personName = "数控技术看";
								String birthdays = "2019-1-12";
								int sex = 1;
								int idType = 1;
								String idNo = "556554555";
								String imagePath = "/mnt/sdcard/girl.JPG";
								FaceRecognition.modifyPerson(groupId, uid, personName, birthdays, sex, idType, idNo, imagePath);
								break;
							}
							case 10: {
								// 删除人员
								String groupId = "8";
								String uid = "5279";
								FaceRecognition.deletePerson(groupId, uid);
								break;
							}
							case 11: {
								// 下载图片
								String downloadPath = "/mnt/mtd/database/FaceRecognition/FaceDetect/8/5282.jpg";
								FaceRecognition.downloadPicture(downloadPath);
								break;
							}
							case 12: {
								// 订阅
								FaceRecognition.realLoadPicture();
								break;
							}
							case 13: {
								// 取消订阅
								FaceRecognition.stopRealLoadPic();
								break;
							}
						}
					}
				}).show();
	}

	public void QrcodeOpenDoor() {
		String[] items = {"设置加密信息", "生成加密的二维码信息"};

		AlertDialog dialog = new AlertDialog.Builder(this)
				.setItems(items, new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						switch (which) {
							case 0:
								setQrcodeDecode();
								break;
							case 1:
								EncryptString();
								break;
						}
					}
				}).show();
	}

	String UserID = new String("123A");
	String CardID = new String("666");

	/**
	 * 设置人脸信息
	 */
	public void setFaceServiceState() {
		// 命令类型
		int emtype = NET_EM_ACCESS_CTL_FACE_SERVICE.NET_EM_ACCESS_CTL_FACE_SERVICE_INSERT;

		/*
		 * 入参，确认插入的人脸信息数量
		 */
		NET_IN_ACCESS_FACE_SERVICE_INSERT stIn = new NET_IN_ACCESS_FACE_SERVICE_INSERT(1);
		//入参UserID，必填
		System.arraycopy("12345".getBytes(), 0, stIn.pFaceInfo[0].szUserID, 0, "12345".getBytes().length);
		//必填，填false
		stIn.pFaceInfo[0].bFaceDataExEnable = false;
		//设置人脸图的大小，需大于等于图片的实际大小，必填，下发几张就填几个
		stIn.pFaceInfo[0].nInFacePhotoLen[0] = 14000;
		stIn.pFaceInfo[0].nInFacePhotoLen[1] = 14000;
		//下发图片的张数
		stIn.pFaceInfo[0].nFacePhoto = 2;
		//图片路径
		String photoPath = "/sdcard/test2.jpg";
		//工具类，获取图片数据流
		byte[] photoData = ToolKits.GetPictureData(photoPath);
		//入参的图片数据流，仅一个byte数组，需把图片拼接后传入，并填写正确的nOutFacePhotoLen
		stIn.pFaceInfo[0].pFacePhoto = new byte[photoData.length * 2];
		//拼接流程，将图片拼入入参的pFacePhoto中，此处图方便所以传了两张相同的图片
		System.arraycopy(photoData, 0, stIn.pFaceInfo[0].pFacePhoto, 0, photoData.length);
		System.arraycopy(photoData, 0, stIn.pFaceInfo[0].pFacePhoto, photoData.length, photoData.length);
		//必填，图片的实际长度，需小于等于对应的nInFacePhotoLen
		stIn.pFaceInfo[0].nOutFacePhotoLen[0] = photoData.length;
		stIn.pFaceInfo[0].nOutFacePhotoLen[1] = photoData.length;
		ToolKits.writeLog("lenth = " + stIn.pFaceInfo[0].pFacePhoto.length);
		/*
		 * 出参
		 */
		NET_OUT_ACCESS_FACE_SERVICE_INSERT stOut = new NET_OUT_ACCESS_FACE_SERVICE_INSERT(1);
		if(INetSDK.OperateAccessFaceService(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("人脸信息SET成功");
		} else {
			ToolKits.writeErrorLog("人脸信息SET失败");
		}
	}

	/**
	 * 获取人脸信息
	 */
	public void getFaceServiceState() {
		// 命令类型
		int emtype = NET_EM_ACCESS_CTL_FACE_SERVICE.NET_EM_ACCESS_CTL_FACE_SERVICE_GET;

		/*
		 * 入参，查询的用户数量，以及用户id
		 */
		NET_IN_ACCESS_FACE_SERVICE_GET stIn = new NET_IN_ACCESS_FACE_SERVICE_GET();
		stIn.nUserNum = 1;
		System.arraycopy("12345".getBytes(), 0, stIn.szUserID[0], 0, "12345".getBytes().length);
		/*
		 * 出参
		 */
		NET_OUT_ACCESS_FACE_SERVICE_GET stOut = new NET_OUT_ACCESS_FACE_SERVICE_GET(1);
		stOut.pFaceInfo[0].bFaceDataExEnable = false;
		//为待会查询到的图片申请空间，单个byte数组，默认能查询到5张图，建议申请足够的大小
		stOut.pFaceInfo[0].pFacePhoto = new byte[5*200000];
		//同样，为查询到的数据申请足够的空间，需大于对应的nOutFacePhotoLen
		for(int i = 0; i < 5; i ++){
			stOut.pFaceInfo[0].nInFacePhotoLen[i] = 200000;
		}
		if(INetSDK.OperateAccessFaceService(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("人脸信息GET成功");
			//获取到数据后，将数据流通过nOutFacePhotoLen参数从pFacePhoto一一分离
			//tmpInt，用于记录每个图片文件起始位置下标
			int tmpInt = 0;
			for(int i = 0; i < stOut.pFaceInfo[0].nOutFacePhotoLen.length; i ++){
				ToolKits.writeLog("nOutFacePhotoLen[" + i + "] = " + stOut.pFaceInfo[0].nOutFacePhotoLen[i]);
				if(stOut.pFaceInfo[0].nOutFacePhotoLen[i] > 0){
					//为分离出的图片临时申请空间
					byte[] receivePic = new byte[stOut.pFaceInfo[0].nOutFacePhotoLen[i]];
					//分离至申请的空间中
					System.arraycopy(stOut.pFaceInfo[0].pFacePhoto, tmpInt, receivePic, 0, stOut.pFaceInfo[0].nOutFacePhotoLen[i]);
					//工具类，将byte流转换为文件保存至本地
					ToolKits.byte2image(receivePic,"/storage/emulated/0/Android/data/com.company.netsdk/files/output" + i + ".jpg");
					ToolKits.writeLog("picture " + i + " saved !");
					//更新
					tmpInt += stOut.pFaceInfo[0].nOutFacePhotoLen[i];
				}
			}
		} else {
			ToolKits.writeErrorLog("人脸信息GET失败");
		}
	}

	/**
	 * 更新人脸信息
	 */
	public void UpdateFaceServiceState() {
		// 命令类型
		int emtype = NET_EM_ACCESS_CTL_FACE_SERVICE.NET_EM_ACCESS_CTL_FACE_SERVICE_UPDATE;

		/*
		 * 入参
		 */
		NET_IN_ACCESS_FACE_SERVICE_UPDATE stIn = new NET_IN_ACCESS_FACE_SERVICE_UPDATE(1);
		System.arraycopy("12345".getBytes(), 0, stIn.pFaceInfo[0].szUserID, 0, "12345".getBytes().length);
		stIn.pFaceInfo[0].stuUpdateTime.setTime(2222,2,2,22,22,22);
		stIn.pFaceInfo[0].bFaceDataExEnable = false;
		stIn.pFaceInfo[0].nInFacePhotoLen[0] = 20000;
		stIn.pFaceInfo[0].nInFacePhotoLen[1] = 200000;

		stIn.pFaceInfo[0].nFacePhoto = 2;
		String photoPath = "/sdcard/test2.jpg";

		String photoPath2 = "/sdcard/timg3.jpg";

		byte[] photoData = ToolKits.GetPictureData(photoPath);
		byte[] photoData2 = ToolKits.GetPictureData(photoPath2);
		stIn.pFaceInfo[0].pFacePhoto = new byte[220000];
		System.arraycopy(photoData, 0, stIn.pFaceInfo[0].pFacePhoto, 0, photoData.length);
		System.arraycopy(photoData2, 0, stIn.pFaceInfo[0].pFacePhoto, photoData.length, photoData2.length);

		stIn.pFaceInfo[0].nOutFacePhotoLen[0] = photoData.length;
		stIn.pFaceInfo[0].nOutFacePhotoLen[1] = photoData2.length;
		ToolKits.writeLog("lenth = " + stIn.pFaceInfo[0].pFacePhoto.length);

		/*
		 * 出参
		 */
		NET_OUT_ACCESS_FACE_SERVICE_UPDATE stOut = new NET_OUT_ACCESS_FACE_SERVICE_UPDATE(1);
		if(INetSDK.OperateAccessFaceService(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("人脸信息UPDATE成功");
		} else {
			ToolKits.writeErrorLog("人脸信息UPDATE失败");
		}
	}

	/**
	 * 删除人脸信息
	 */
	public void RemoveFaceServiceState() {
		// 命令类型
		int emtype = NET_EM_ACCESS_CTL_FACE_SERVICE.NET_EM_ACCESS_CTL_FACE_SERVICE_REMOVE;

		/*
		 * 入参
		 */
		NET_IN_ACCESS_FACE_SERVICE_REMOVE stIn = new NET_IN_ACCESS_FACE_SERVICE_REMOVE();
		stIn.nUserNum = 1;
		System.arraycopy(UserID.getBytes(), 0, stIn.szUserID[0], 0, UserID.getBytes().length);
		/*
		 * 出参
		 */
		NET_OUT_ACCESS_FACE_SERVICE_REMOVE stOut = new NET_OUT_ACCESS_FACE_SERVICE_REMOVE(1);
		if(INetSDK.OperateAccessFaceService(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("人脸信息REMOVE成功");
		} else {
			ToolKits.writeErrorLog("人脸信息REMOVE失败");
		}
	}

	/**
	 * 清空人脸信息
	 */
	public void ClearFaceServiceState() {
		// 命令类型
		int emtype = NET_EM_ACCESS_CTL_FACE_SERVICE.NET_EM_ACCESS_CTL_FACE_SERVICE_CLEAR;

		/*
		 * 入参
		 */
		NET_IN_ACCESS_FACE_SERVICE_CLEAR stIn = new NET_IN_ACCESS_FACE_SERVICE_CLEAR();
		/*
		 * 出参
		 */
		NET_OUT_ACCESS_FACE_SERVICE_CLEAR stOut = new NET_OUT_ACCESS_FACE_SERVICE_CLEAR();
		if(INetSDK.OperateAccessFaceService(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("人脸信息CLEAR成功");
		} else {
			ToolKits.writeErrorLog("人脸信息CLEAR失败");
		}
	}

	/**
	 * 设置卡片信息
	 */
	public void setCardServiceState() {
		// 命令类型
		int emtype = NET_EM_ACCESS_CTL_CARD_SERVICE.NET_EM_ACCESS_CTL_CARD_SERVICE_INSERT;

		/*
		 * 入参
		 */
		NET_IN_ACCESS_CARD_SERVICE_INSERT stIn = new NET_IN_ACCESS_CARD_SERVICE_INSERT(1);
		System.arraycopy(UserID.getBytes(), 0, stIn.pCardInfo[0].szUserID, 0, UserID.getBytes().length);
		System.arraycopy(CardID.getBytes(), 0, stIn.pCardInfo[0].szCardNo, 0, CardID.getBytes().length);
		stIn.pCardInfo[0].emType = NET_ACCESSCTLCARD_TYPE.NET_ACCESSCTLCARD_TYPE_VIP;
		/*
		 * 出参
		 */
		NET_OUT_ACCESS_CARD_SERVICE_INSERT stOut = new NET_OUT_ACCESS_CARD_SERVICE_INSERT(2);
		if(INetSDK.OperateAccessCardService(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("卡片信息SET成功");
		} else {
			ToolKits.writeErrorLog("卡片信息SET失败");
		}
	}

	/**
	 * 获取卡片信息
	 */
	public void getCardServiceState() {
		// 命令类型
		int emtype = NET_EM_ACCESS_CTL_CARD_SERVICE.NET_EM_ACCESS_CTL_CARD_SERVICE_GET;

		/*
		 * 入参
		 */
		NET_IN_ACCESS_CARD_SERVICE_GET stIn = new NET_IN_ACCESS_CARD_SERVICE_GET();
		stIn.nCardNum = 1;
		System.arraycopy(CardID.getBytes(), 0, stIn.szCardNo[0], 0, CardID.getBytes().length);
		/*
		 * 出参
		 */
		NET_OUT_ACCESS_CARD_SERVICE_GET stOut = new NET_OUT_ACCESS_CARD_SERVICE_GET(1);
		//stOut.pFailCode[0] = 1;
		if(INetSDK.OperateAccessCardService(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("卡片信息GET成功");
			ToolKits.writeLog(stOut.pCardInfo[0].toString());
		} else {
			ToolKits.writeErrorLog("卡片信息GET失败");
		}
	}

	/**
	 * 更新卡片信息
	 */
	public void UpdateCardServiceState() {
		// 命令类型
		int emtype = NET_EM_ACCESS_CTL_CARD_SERVICE.NET_EM_ACCESS_CTL_CARD_SERVICE_UPDATE;

		/*
		 * 入参
		 */
		NET_IN_ACCESS_CARD_SERVICE_UPDATE stIn = new NET_IN_ACCESS_CARD_SERVICE_UPDATE(1);
		System.arraycopy(UserID.getBytes(), 0, stIn.pCardInfo[0].szUserID, 0, UserID.getBytes().length);
		String key = "666";
		System.arraycopy(key.getBytes(), 0, stIn.pCardInfo[0].szCardNo, 0, key.getBytes().length);
		stIn.pCardInfo[0].emType = NET_ACCESSCTLCARD_TYPE.NET_ACCESSCTLCARD_TYPE_GUEST;
		/*
		 * 出参
		 */
		NET_OUT_ACCESS_CARD_SERVICE_UPDATE stOut = new NET_OUT_ACCESS_CARD_SERVICE_UPDATE(1);
		if(INetSDK.OperateAccessCardService(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("卡片信息UPDATE成功");
		} else {
			ToolKits.writeErrorLog("卡片信息UPDATE失败");
		}
	}

	/**
	 * 删除卡片信息
	 */
	public void RemoveCardServiceState() {
		// 命令类型
		int emtype = NET_EM_ACCESS_CTL_CARD_SERVICE.NET_EM_ACCESS_CTL_CARD_SERVICE_REMOVE;

		/*
		 * 入参
		 */
		NET_IN_ACCESS_CARD_SERVICE_REMOVE stIn = new NET_IN_ACCESS_CARD_SERVICE_REMOVE();
		stIn.nCardNum = 1;
		System.arraycopy(CardID.getBytes(), 0, stIn.szCardNo[0], 0, CardID.getBytes().length);
		/*
		 * 出参
		 */
		NET_OUT_ACCESS_CARD_SERVICE_REMOVE stOut = new NET_OUT_ACCESS_CARD_SERVICE_REMOVE(1);
		if(INetSDK.OperateAccessCardService(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("卡片信息REMOVE成功");
		} else {
			ToolKits.writeErrorLog("卡片信息REMOVE失败");
		}
	}

	/**
	 * 清空卡片信息
	 */
	public void ClearCardServiceState() {
		// 命令类型
		int emtype = NET_EM_ACCESS_CTL_CARD_SERVICE.NET_EM_ACCESS_CTL_CARD_SERVICE_CLEAR;

		/*
		 * 入参
		 */
		NET_IN_ACCESS_CARD_SERVICE_CLEAR stIn = new NET_IN_ACCESS_CARD_SERVICE_CLEAR();
		/*
		 * 出参
		 */
		NET_OUT_ACCESS_CARD_SERVICE_CLEAR stOut = new NET_OUT_ACCESS_CARD_SERVICE_CLEAR();
		if(INetSDK.OperateAccessCardService(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("卡片信息CLEAR成功");
		} else {
			ToolKits.writeErrorLog("卡片信息CLEAR失败");
		}
	}

	/**
	 * 设置用户信息
	 */
	public void setUserServiceState() {
		// 命令类型
		int emtype = NET_EM_ACCESS_CTL_USER_SERVICE.NET_EM_ACCESS_CTL_USER_SERVICE_INSERT;

		/*
		 * 入参
		 */
		NET_IN_ACCESS_USER_SERVICE_INSERT stIn = new NET_IN_ACCESS_USER_SERVICE_INSERT(1);
		stIn.pUserInfo[0].bFirstEnter = true;
		stIn.pUserInfo[0].emAuthority = NET_ATTENDANCE_AUTHORITY.NET_ATTENDANCE_AUTHORITY_ADMINISTRATORS;
		stIn.pUserInfo[0].bFloorNoEx2Valid = true;
		stIn.pUserInfo[0].bFloorNoExValid = true;
		stIn.pUserInfo[0].bHealthStatus = true;
		stIn.pUserInfo[0].bUseNameEx = true;
		stIn.pUserInfo[0].emSex = NET_ACCESSCTLCARD_SEX.NET_ACCESSCTLCARD_SEX_MALE;
		stIn.pUserInfo[0].emTestItems = EM_TEST_ITEMS.EM_TEST_ITEMS_HANDTWOFEET_TEST;
		stIn.pUserInfo[0].emTypeOfCertificate = EM_TYPE_OF_CERTIFICATE.EM_TYPE_OF_CERTIFICATE_IDCARD;
		stIn.pUserInfo[0].emUserType = NET_ENUM_USER_TYPE.NET_ENUM_USER_TYPE_VIP;
		stIn.pUserInfo[0].nDoorNum = 1;
		stIn.pUserInfo[0].nDoors[0] = 1;
		stIn.pUserInfo[0].nFirstEnterDoorsNum = 1;
		stIn.pUserInfo[0].nFirstEnterDoors[0] = 2;
		stIn.pUserInfo[0].stuBirthDay.setTime(2021,8,25,17,23,30);
		stIn.pUserInfo[0].pstuFloorsEx2[0].nFloorNumEx2 = 7;
		String key = "123A";
		System.arraycopy(UserID.getBytes(), 0, stIn.pUserInfo[0].szUserID, 0, UserID.getBytes().length);
		/*
		 * 出参
		 */
		NET_OUT_ACCESS_USER_SERVICE_INSERT stOut = new NET_OUT_ACCESS_USER_SERVICE_INSERT(1);
		if(INetSDK.OperateAccessUserService(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("用户信息SET成功");
		} else {
			ToolKits.writeErrorLog("用户信息SET失败");
		}
	}

	/**
	 * 移除用户信息
	 */
	public void RemoveUserServiceState() {
		// 命令类型
		int emtype = NET_EM_ACCESS_CTL_USER_SERVICE.NET_EM_ACCESS_CTL_USER_SERVICE_REMOVE;

		/*
		 * 入参
		 */
		NET_IN_ACCESS_USER_SERVICE_REMOVE stIn = new NET_IN_ACCESS_USER_SERVICE_REMOVE();
		stIn.nUserNum = 1;
		System.arraycopy(UserID.getBytes(), 0, stIn.szUserID[0], 0, UserID.getBytes().length);
		/*
		 * 出参
		 */
		NET_OUT_ACCESS_USER_SERVICE_REMOVE stOut = new NET_OUT_ACCESS_USER_SERVICE_REMOVE(1);
		if(INetSDK.OperateAccessUserService(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("用户信息DEL成功");
		} else {
			ToolKits.writeErrorLog("用户信息DEL失败");
		}
	}

	/**
	 * 清除用户信息
	 */
	public void ClearUserServiceState() {
		// 命令类型
		int emtype = NET_EM_ACCESS_CTL_USER_SERVICE.NET_EM_ACCESS_CTL_USER_SERVICE_CLEAR;

		/*
		 * 入参
		 */
		NET_IN_ACCESS_USER_SERVICE_CLEAR stIn = new NET_IN_ACCESS_USER_SERVICE_CLEAR();

		NET_OUT_ACCESS_USER_SERVICE_CLEAR stOut = new NET_OUT_ACCESS_USER_SERVICE_CLEAR();
		if(INetSDK.OperateAccessUserService(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("用户信息CLEAR成功");
		} else {
			ToolKits.writeErrorLog("用户信息CLEAR失败");
		}
	}

	/**
	 * 获取用户信息
	 */
	public void getUserServiceState() {
		// 命令类型
		int emtype = NET_EM_ACCESS_CTL_USER_SERVICE.NET_EM_ACCESS_CTL_USER_SERVICE_GET;

		/*
		 * 入参
		 */
		NET_IN_ACCESS_USER_SERVICE_GET stIn = new NET_IN_ACCESS_USER_SERVICE_GET();
		stIn.nUserNum = 1;
		String key = "123A";
		System.arraycopy(UserID.getBytes(), 0, stIn.szUserID[0], 0, UserID.getBytes().length);
		/*
		 * 出参
		 */
		NET_OUT_ACCESS_USER_SERVICE_GET stOut = new NET_OUT_ACCESS_USER_SERVICE_GET(1);
		if(INetSDK.OperateAccessUserService(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("用户信息GET成功");
			ToolKits.writeLog(stOut.pUserInfo[0].toString());
		} else {
			ToolKits.writeErrorLog("用户信息GET失败");
		}
	}

	/**
	 * 设置加密信息
	 */
	public void setQrcodeDecode() {
		// 命令类型
		int emtype = NET_EM_ACCESS_CTL_MANAGER.NET_EM_ACCESS_CTL_SET_QRCODEDECODE_INFO;

		/*
		 * 入参
		 */
		NET_IN_SET_QRCODE_DECODE_INFO stIn = new NET_IN_SET_QRCODE_DECODE_INFO();

		// 加密方式，目前只支持 AES-256
		stIn.emCipher = NET_ENUM_QRCODE_CIPHER.NET_ENUM_QRCODE_CIPHER_AES256;

		// 秘钥， 必须32位，用户自己定义，用于二维码加密
		// 但是加密密钥变化的周期不能小于1天；因为访客拿到二维码的时候，最长可能会使用二维码一天的，所以如果变化，最少一天以上再变
		String key = "0123456789ABCDEF0123456789ABCDEF";
		System.arraycopy(key.getBytes(), 0, stIn.szKey, 0, key.getBytes().length);

		/*
		 * 出参
		 */
		NET_OUT_SET_QRCODE_DECODE_INFO stOut = new NET_OUT_SET_QRCODE_DECODE_INFO();
		if(INetSDK.OperateAccessControlManager(__LoginHandle,emtype, stIn, stOut, 4000)) {
			ToolKits.writeLog("设置二维码的解码信息成功");
		} else {
			ToolKits.writeErrorLog("设置二维码的解码信息失败");
		}
	}

	/**
	 * 生成加密的二维码信息
	 */
	public void EncryptString() {
    	/*
    	 * 入参
    	 */
		NET_IN_ENCRYPT_STRING stIn = new NET_IN_ENCRYPT_STRING();
		// 卡号
		String card = "ABCD1234";
		System.arraycopy(card.getBytes(), 0, stIn.szCard, 0, card.getBytes().length);

		// 秘钥, 必须32位，setQrcodeDecode()里的密钥一样
		String key = "0123456789ABCDEF0123456789ABCDEF";
		System.arraycopy(key.getBytes(), 0, stIn.szKey, 0, key.getBytes().length);

    	/*
    	 * 出参
    	 */
		NET_OUT_ENCRYPT_STRING stOut = new NET_OUT_ENCRYPT_STRING();

		if(INetSDK.EncryptString(stIn, stOut, 4000)) {
			ToolKits.writeLog("加密后的字符串:" + new String(stOut.szEncryptString).trim());
		}
	}



	/**
	 * 门禁密码的增、删、改、查
	 */
	public void AccessCtlPwdOperate() {
		String[] items = {"门禁密码增加", "门禁密码修改", "门禁密码删除", "门禁密码清空", "门禁密码查询"};
		AlertDialog dialog = new AlertDialog.Builder(this)
				.setItems(items, new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						switch (which) {
							case 0:
								AccessPwdAdd();
								break;
							case 1:
								AccessPwdUpdate();
								break;
							case 2:
								AccessPwdRemove();
								break;
							case 3:
								AccessPwdClear();
								break;
							case 4:
								FindAccessPwd();
								break;
						}
					}
				}).show();
	}

	int nRecordNo = 0;

	public void AccessPwdAdd() {
		nRecordNo = 0;
		/**
		 * 门禁密码信息
		 */
		NET_RECORDSET_ACCESS_CTL_PWD msg = new NET_RECORDSET_ACCESS_CTL_PWD();
		// 用户ID
		String userId = "0102";
		System.arraycopy(userId.getBytes(), 0, msg.szUserID, 0, userId.getBytes().length);

		// 开门密码
		String openDoorPwd = "12345";
		System.arraycopy(openDoorPwd.getBytes(), 0, msg.szDoorOpenPwd, 0, openDoorPwd.getBytes().length);

		/// 以下字段可以固定
		msg.nDoorNum = 2; // 门个数 表示双门控制器
		msg.sznDoors[0] = 0; // 表示第一个门有权限
		msg.sznDoors[1] = 1; // 表示第二个门有权限
		msg.nTimeSectionNum = 2; // 与门数对应
		msg.nTimeSectionIndex[0] = 255; // 表示第一个门全天有效
		msg.nTimeSectionIndex[1] = 255; // 表示第二个门全天有效

		// 开始有效时间
		msg.stuValidStartTime.setTime(2019, 3, 13, 0, 0, 0);

		// 结束有效时间
		msg.stuValidEndTime.setTime(2019, 3, 18, 0, 0, 0);

		// 有效次数
		msg.nValidCounts = 100;

		/**
		 *
		 */
		NET_CTRL_RECORDSET_INSERT_PARAM insert = new NET_CTRL_RECORDSET_INSERT_PARAM();
		insert.stuCtrlRecordSetInfo.nType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESSCTLPWD;  // 记录集类型，此处是门禁密码类型
		insert.stuCtrlRecordSetInfo.pBuf = msg;

		if(INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_RECORDSET_INSERT, insert, 5000)) {
			nRecordNo = insert.stuCtrlRecordSetResult.nRecNo;
			ToolKits.writeLog("----------- 门禁密码记录集编号 : " + nRecordNo);
		} else {
			ToolKits.writeErrorLog("----------- 插入门禁密码记录集失败!" );
		}
	}

	public void AccessPwdUpdate() {
		/**
		 * 门禁密码信息
		 */
		NET_RECORDSET_ACCESS_CTL_PWD msg = new NET_RECORDSET_ACCESS_CTL_PWD();
		// 需要修改的门禁密码的记录集编号
		msg.nRecNo = nRecordNo;

		// 用户ID
		String userId = "0102";
		System.arraycopy(userId.getBytes(), 0, msg.szUserID, 0, userId.getBytes().length);

		// 开门密码
		String openDoorPwd = "123456";
		System.arraycopy(openDoorPwd.getBytes(), 0, msg.szDoorOpenPwd, 0, openDoorPwd.getBytes().length);

		/// 以下字段可以固定
		msg.nDoorNum = 2; // 门个数 表示双门控制器
		msg.sznDoors[0] = 0; // 表示第一个门有权限
		msg.sznDoors[1] = 1; // 表示第二个门有权限
		msg.nTimeSectionNum = 2; // 与门数对应
		msg.nTimeSectionIndex[0] = 255; // 表示第一个门全天有效
		msg.nTimeSectionIndex[1] = 255; // 表示第二个门全天有效

		// 开始有效时间
		msg.stuValidStartTime.setTime(2019, 3, 13, 0, 0, 0);

		// 结束有效时间
		msg.stuValidEndTime.setTime(2019, 3, 18, 0, 0, 0);

		// 有效次数
		msg.nValidCounts = 100;

		/**
		 *
		 */
		NET_CTRL_RECORDSET_PARAM update = new NET_CTRL_RECORDSET_PARAM();
		update.nType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESSCTLPWD;  // 记录集类型，此处是门禁密码类型
		update.pBuf = msg;

		if(INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_RECORDSET_UPDATE, update, 5000)) {
			ToolKits.writeLog("----------- 修改门禁密码记录集成功");
		} else {
			ToolKits.writeErrorLog("----------- 修改门禁密码记录集失败!" );
		}
	}

	public void AccessPwdRemove() {
		NET_CTRL_RECORDSET_PARAM remove = new NET_CTRL_RECORDSET_PARAM();
		remove.nType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESSCTLPWD;  // 记录集类型，此处是门禁密码类型

		// 新增\更新\查询\导入时,为记录集信息缓存,详见 EM_NET_RECORD_TYPE 注释,由用户申请内存，长度为nBufLen
		// 删除时,为存放记录集编号的内存地址(类型为int*)
		remove.pBuf = new Integer(nRecordNo);

		if(INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_RECORDSET_REMOVE, remove, 5000)) {
			ToolKits.writeLog("----------- 删除门禁密码记录集成功!");
		} else {
			ToolKits.writeErrorLog("----------- 删除门禁密码记录集失败!" );
		}
	}

	public void AccessPwdClear() {
		// 清理记录，只需要下发type
		NET_CTRL_RECORDSET_PARAM clear = new NET_CTRL_RECORDSET_PARAM();
		clear.nType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESSCTLPWD; // 记录集类型，此处是门禁密码类型

		if(INetSDK.ControlDevice(__LoginHandle, CtrlType.SDK_CTRL_RECORDSET_CLEAR, clear, 5000)) {
			ToolKits.writeLog("-----------清空门禁密码记录集成功!");
		} else {
			ToolKits.writeErrorLog("----------- 清空门禁密码记录集失败!" );
		}
	}

	public void FindAccessPwd() {
		/**
		 * 查询条件
		 */
		FIND_RECORD_ACCESSCTLPWD_CONDITION recordCondition = new FIND_RECORD_ACCESSCTLPWD_CONDITION();
		// 用户ID
		String userId = "0102";
		System.arraycopy(userId.getBytes(), 0, recordCondition.szUserID, 0, userId.getBytes().length);

		/**
		 * FindRecord 查询入参
		 */
		NET_IN_FIND_RECORD_PARAM inFind= new NET_IN_FIND_RECORD_PARAM();
		inFind.emType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESSCTLPWD; // 要查询的记录集类型，此处是门禁密码类型
		inFind.pQueryCondition = recordCondition;

		/**
		 * FindRecord 查询出参
		 */
		NET_OUT_FIND_RECORD_PARAM outFind = new NET_OUT_FIND_RECORD_PARAM();

		if(INetSDK.FindRecord(__LoginHandle, inFind, outFind, 5000)) {

			int nIndex = 0;       // 索引，查询的个数，从0开始
			int doNextCount = 0;  // 循环查询的次数
			int nMaxCount = 10;   // 每次查询的最大个数

			while(true) {
				/**
				 * 查询到的信息结构体
				 */
				NET_RECORDSET_ACCESS_CTL_PWD[] records = new NET_RECORDSET_ACCESS_CTL_PWD[nMaxCount];   //数组大小，代表可以查询的记录信息最大值
				for(int m = 0; m < nMaxCount; m++) {
					records[m] = new NET_RECORDSET_ACCESS_CTL_PWD();
				}

				/**
				 * FindNextRecord 接口入参
				 */
				NET_IN_FIND_NEXT_RECORD_PARAM inFindNext = new NET_IN_FIND_NEXT_RECORD_PARAM();
				// 查询句柄
				inFindNext.lFindeHandle = outFind.lFindeHandle;

				// 当前想查询的记录条数
				inFindNext.nFileCount = nMaxCount;

				// 要查询的记录集类型，此处是门禁密码类型
				inFindNext.emType = EM_NET_RECORD_TYPE.NET_RECORD_ACCESSCTLPWD;

				/**
				 * FindNextRecord 接口出参
				 */
				NET_OUT_FIND_NEXT_RECORD_PARAM outFindNext = new NET_OUT_FIND_NEXT_RECORD_PARAM();
				// 申请内存，每次最大查的个数
				outFindNext.nMaxRecordNum = nMaxCount;
				outFindNext.pRecordList = records;

				int retCount = INetSDK.FindNextRecord(inFindNext, outFindNext, 5000);
				if(retCount != 0) {
					ToolKits.writeLog("每次查到的个数：" + outFindNext.nRetRecordNum);
					for(int i = 0; i < outFindNext.nRetRecordNum; i++) {
						nIndex = i + doNextCount * nMaxCount;
						ToolKits.writeLog("[" + nIndex + "] 记录号 : " + records[i].nRecNo);
						ToolKits.writeLog("[" + nIndex + "] 用户ID : " + new String(records[i].szUserID).trim());
						ToolKits.writeLog("[" + nIndex + "] 开门密码 : " + new String(records[i].szDoorOpenPwd).trim());
						ToolKits.writeLog("\n");
					}

					if(outFindNext.nRetRecordNum < nMaxCount) {
						break;
					} else {
						doNextCount++;
					}

				} else {
					ToolKits.writeErrorLog("FindNextRecord Failed!" );
					break;
				}
			}
		} else {
			ToolKits.writeErrorLog("FindRecord Failed!" );
		}

		// 关闭查找
		INetSDK.FindRecordClose(outFind.lFindeHandle);
	}

	public void ScadaOperate() {
		String[] items = {"欠压报警", "获取站点实时数据", "获取当前所接入控制器设备列表和状态", "查询控制器历史统计数据", "控制器配置信息"};
		AlertDialog dialog = new AlertDialog.Builder(this)
				.setItems(items, new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						switch (which) {
							case 0:
								SCADA.startListen();
								break;
							case 1:
								SCADA.getScadaInfoByID();
								break;
							case 2:
								SCADA.getSCADADeviceStatus();
								break;
							case 3:
								SCADA.findScadaData();
								break;
							case 4:
								SCADA.controllerSiteConfig();
								break;
						}
					}
				}).show();
	}

    public void LinkageConfig() {

        String[] items = {"布撤防配置", "获取设备报警联动能力"};
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0: {
                                NET_CFG_DISABLE_LINKAGE stuCfg = new NET_CFG_DISABLE_LINKAGE();
                                if (INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_DISABLE_LINKAGE, -1, stuCfg, 5000, null)) {
                                    ToolKits.writeLog("Before Set Disable linkage switch " + stuCfg.bEnable);
                                    stuCfg.bEnable = !stuCfg.bEnable;
                                    if (INetSDK.SetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_DISABLE_LINKAGE, -1, stuCfg, 5000, null, null)) {
                                        if (INetSDK.GetConfig(__LoginHandle, NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_DISABLE_LINKAGE, -1, stuCfg, 5000, null)) {
                                            ToolKits.writeLog("After Set Disable linkage switch " + stuCfg.bEnable);
                                        } else {
                                            ToolKits.writeErrorLog("After Set Get NET_EM_CFG_DISABLE_LINKAGE Failed!");
                                        }
                                    } else {
                                        ToolKits.writeErrorLog("Set NET_EM_CFG_DISABLE_LINKAGE Failed!");
                                    }
                                } else {
                                    ToolKits.writeErrorLog("First Time Get NET_EM_CFG_DISABLE_LINKAGE Failed!");
                                }
                                break;
                            }
                            case 1: {
                                CFG_CAP_EVENTMANAGER_INFO eventManager = new CFG_CAP_EVENTMANAGER_INFO();
                                String szCommand = FinalVar.CFG_CAP_CMD_EVENTMANAGER;
                                char szOutBuffer[] = new char[1024];
                                Integer stError = new Integer(0);
                                if (INetSDK.QueryNewSystemInfo(__LoginHandle, szCommand, 0, szOutBuffer, stError, 5000)) {
                                    if (INetSDK.ParseData(szCommand, szOutBuffer, eventManager, null)) {
                                        ToolKits.writeLog("支持哪些联动项一键撤防：" + eventManager.nSupportDisableLinkage);
                                    }else {
                                        ToolKits.writeErrorLog("ParseData Failed!" );
                                    }
                                } else {
                                    ToolKits.writeErrorLog("QueryNewSystemInfo Failed!" );
                                }
                                break;
                            }
                        }
                    }
                }).show();
    }

    void VideoConfig() {
        SDKDEV_AUTOMT_CFG[] stuCfg = new SDKDEV_AUTOMT_CFG[1];
        stuCfg[0] = new SDKDEV_AUTOMT_CFG();
        Integer nReturnLen = new Integer(0);
        if (!INetSDK.GetDevConfig(__LoginHandle, FinalVar.SDK_DEV_AUTOMTCFG, -1,
                stuCfg, nReturnLen, 5000)) {
            ToolKits.writeErrorLog("GetDevConfig NET_DEV_DEVICECFG Failed!");
        }else {
            ToolKits.writeLog(" byAutoDeleteFilesTime(0~31，天为单位，0表示永不过期):" + stuCfg[0].byAutoDeleteFilesTime);

            stuCfg[0].byAutoDeleteFilesTime = 6; // 6天后
            if (!INetSDK.SetDevConfig(__LoginHandle, FinalVar.SDK_DEV_AUTOMTCFG, -1, stuCfg, 5000)) {
                ToolKits.writeErrorLog("SetDevConfig NET_DEV_DEVICECFG Failed!");
            }
        }
    }

	public void CaiNaioNetwork() {
		String[] items = {"固件升级", "主动注册配置", "获取录像存储天数", "IPC上下线通知", "NTP服务配置"};
		 new AlertDialog.Builder(this)
				.setItems(items, new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						switch (which) {
							case 0:
								Upgrade();
								break;
							case 1:
                                DVRIPConfig();
								break;
                            case 2:
                                VideoConfig();
                                break;
                            case 3:
                                AttachCameraState();
                                break;
                            case 4:
                                NTPConfig();
                                break;
						}
					}
				}).show();
	}

    public void ElectricLens() {
		{
			NET_IN_GETLENSINFO stuIn = new NET_IN_GETLENSINFO();
			NET_OUT_GETLENSINFO stuOut = new NET_OUT_GETLENSINFO();

			stuIn.nChannel = 0;
			if (!INetSDK.GetLensInfo(__LoginHandle, stuIn, stuOut, 5000)) {
				ToolKits.writeErrorLog("GetLensInfo Failed!");
			}

			ToolKits.writeLog("镜头类型" + stuOut.emLensType);
		}

        {
            NET_IN_ADJUSTRELATIVELENSFOCUS stuIn = new NET_IN_ADJUSTRELATIVELENSFOCUS();
            NET_OUT_ADJUSTRELATIVELENSFOCUS stuOut = new NET_OUT_ADJUSTRELATIVELENSFOCUS();

            stuIn.nChannel = 0;
            stuIn.stuCmdInfo.emLensAction = EM_LENS_ACTION.EM_LENS_ACTION_SINGLE_STEP;
            if (!INetSDK.AdjustRelativeLensFocus(__LoginHandle, stuIn, stuOut, 5000)) {
                ToolKits.writeErrorLog("AdjustRelativeLensFocus Failed!");
            }
        }
	}

	public void LowRateWPAN() {

		NET_IN_ATTACH_LOWRATEWPAN stuIn = new NET_IN_ATTACH_LOWRATEWPAN();
		NET_OUT_ATTACH_LOWRATEWPAN stuOut = new NET_OUT_ATTACH_LOWRATEWPAN();

		stuIn.cbAttachLowRateWPANCB = new CB_fAttachLowRateWPANCB() {

			public void invoke(long lLoginID, long lAttachHandle, final NET_CODEID_INFO pBuf,  int emError) {
				ToolKits.writeLog("LowRateWPAN Callback SerialNumber : " + new String(pBuf.szSerialNumber)
						+ " Name: " + new String(pBuf.szName));
			}
		};

		long lAttachWPANHandle  = INetSDK.AttachLowRateWPAN(__LoginHandle , stuIn, stuOut, 5000); // 订阅
		if (lAttachWPANHandle == 0) {
			ToolKits.writeErrorLog("AttachLowRateWPAN Failed!");
		}

//		INetSDK.DetachLowRateWPAN(lAttachWPANHandle); // 取消订阅
	}

	// 组织目录管理
	void OrganizationNode() {

        final String path = ".";  // 路径

        String[] items = {"添加", "设置", "获取", "删除"};
        new AlertDialog.Builder(this)
                .setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {

                            case 0: { /// 1. 增加节点
                                SDK_IN_ORGANIZATION_ADD_NODES stuIn = new SDK_IN_ORGANIZATION_ADD_NODES(2);
                                SDK_OUT_ORGANIZATION_ADD_NODES stuOut = new SDK_OUT_ORGANIZATION_ADD_NODES(2);

                                stuIn.pszPath = path;  // 路径

                                stuIn.pstuNodes[0].nPosition = -1; // 插入位置, -1-开始, -2-末尾, 0~n
                                stuIn.pstuNodes[0].stuNode.nNodeType = 0; // 节点类型, 0-逻辑对象, 1-目录
                                ToolKits.StringToByteArray("HangZhou", stuIn.pstuNodes[0].stuNode.stuLogicObject.szName); // 别名
                                ToolKits.StringToByteArray("Camera", stuIn.pstuNodes[0].stuNode.stuLogicObject.szType);    // 逻辑对象类型
                                ToolKits.StringToByteArray("dev123", stuIn.pstuNodes[0].stuNode.stuLogicObject.szDevID); // 逻辑对象所属设备ID
                                ToolKits.StringToByteArray("5002", stuIn.pstuNodes[0].stuNode.stuLogicObject.szControlID); // 逻辑对象所属设备ID
                                stuIn.pstuNodes[0].stuNode.stuLogicObject.nChannel = 0;    // 通道号

                                stuIn.pstuNodes[1].nPosition = -2; // 插入位置, -1-开始, -2-末尾, 0~n
                                stuIn.pstuNodes[1].stuNode.nNodeType = 1; // 节点类型, 0-逻辑对象, 1-目录
                                ToolKits.StringToByteArray("HangZhou", stuIn.pstuNodes[1].stuNode.stuDirectory.szName); // 目录名称
                                ToolKits.StringToByteArray("5001", stuIn.pstuNodes[1].stuNode.stuDirectory.szControlID);    // 控制编号（代表目录）

                                boolean bRet = INetSDK.OrganizationAddNodes(__LoginHandle, stuIn, stuOut, 5000);
                                if (!bRet) {
                                    ToolKits.writeErrorLog("OrganizationAddNodes Failed!");
                                } else {
                                    for (int i = 0; i < stuOut.nRetResultCount; ++i) {
                                        ToolKits.writeLog("Add Node[" + i + "] Path:" + new String(stuOut.pstuResults[i].szPath).trim() + " Result:" + stuOut.pstuResults[i].bResult);
                                    }
                                }
                            }
                            break;
                            case 1: {  /// 2. 设置节点
                                SDK_IN_ORGANIZATION_SET_NODE stuIn = new SDK_IN_ORGANIZATION_SET_NODE();
                                SDK_OUT_ORGANIZATION_SET_NODE stuOut = new SDK_OUT_ORGANIZATION_SET_NODE();

                                stuIn.pszPath = path;  // 路径
                                stuIn.stuNode.nNodeType = 1; // 节点类型, 0-逻辑对象, 1-目录
                                ToolKits.StringToByteArray("SuZhou", stuIn.stuNode.stuDirectory.szName); // 目录名称
                                ToolKits.StringToByteArray("5003", stuIn.stuNode.stuDirectory.szControlID);    // 控制编号（代表目录）

                                boolean bRet = INetSDK.OrganizationSetNode(__LoginHandle, stuIn, stuOut, 5000);
                                if (!bRet) {
                                    ToolKits.writeErrorLog("OrganizationSetNode Failed!");
                                } else {
                                    ToolKits.writeLog("OrganizationSetNode Success!");
                                }
                            }
                            break;
                            case 2: { /// 3. 获取节点
                                SDK_IN_ORGANIZATION_GET_NODES stuIn = new SDK_IN_ORGANIZATION_GET_NODES();
                                SDK_OUT_ORGANIZATION_GET_NODES stuOut = new SDK_OUT_ORGANIZATION_GET_NODES(3);

                                stuIn.pszPath = path;  // 路径
                                stuIn.nLevel = 1;   // 级别, 0-本级, 1-下一级

                                boolean bRet = INetSDK.OrganizationGetNodes(__LoginHandle, stuIn, stuOut, 5000);
                                if (!bRet) {
                                    ToolKits.writeErrorLog("OrganizationGetNodes Failed!");
                                } else {
                                    ToolKits.writeLog("OrganizationGetNodes Success!");
                                    for (int i = 0; i < stuOut.nRetNodeCount; ++i) {
                                        ToolKits.writeLog("Get Node[" + i + "] Type:" + stuOut.pstuNodes[i].nNodeType);
                                    }
                                }
                            }
                            break;
                            case 3: {   /// 4. 删除节点
                                SDK_IN_ORGANIZATION_DELETE_NODES stuIn = new SDK_IN_ORGANIZATION_DELETE_NODES(1);
                                SDK_OUT_ORGANIZATION_DELETE_NODES stuOut = new SDK_OUT_ORGANIZATION_DELETE_NODES();

                                ToolKits.StringToByteArray(path, stuIn.pstuPath[0].szPath);
                                boolean bRet = INetSDK.OrganizationDeleteNodes(__LoginHandle, stuIn, stuOut, 5000);
                                if (!bRet) {
                                    ToolKits.writeErrorLog("OrganizationDeleteNodes Failed!");
                                } else {
                                    ToolKits.writeLog("OrganizationDeleteNodes Success!");
                                }
                            }
                            break;
                        }
                    }
                }).show();
    }

	boolean QueryUserRights() {
		NET_IN_QUERYUSER_RIGHT stuIn = new NET_IN_QUERYUSER_RIGHT();
		NET_OUT_QUERYUSER_RIGHT stuOut = new NET_OUT_QUERYUSER_RIGHT();

		Map<Integer, String> rightMap = new HashMap<>();
		if (INetSDK.QueryUserRights(__LoginHandle, stuIn, stuOut, 3000)) {
			ToolKits.writeLog("QueryUserRights Success!");
			ToolKits.writeLog("dwRightNum:" + stuOut.dwRightNum);
			ToolKits.writeLog("user dwRightNum:" + stuOut.userInfo.dwRightNum);
			ToolKits.writeLog("user name:" + String.valueOf(stuOut.userInfo.name).trim() + " id " + stuOut.userInfo.dwID);

			for (int i = 0; i <  stuOut.dwRightNum; ++i) {
				ToolKits.writeLog("rightlist memo:" + String.valueOf(stuOut.rightList[i].memo).trim());
				//rightMap.put(stuOut.rightList[i].dwID, new String(stuOut.rightList[i].name).trim());
			}

			// TODO send objectRightName
//            String objectRightName = "12345";
//			for (int i = 0; i < stuOut.userInfo.dwRightNum; ++i) {
//                String rightName = rightMap.get(stuOut.userInfo.rights[i]);
//                if (rightName != null && rightName.equals(objectRightName)) {
//                    return true;
//                }
//            }
		}else {
			ToolKits.writeErrorLog("QueryUserRights Failed!");
		}
		return false;
	}

	// DoorBell Config
	void DoorBellConfig() {
        NET_CFG_DOORBELL_EXTERNALDOORBELL cfgData = new NET_CFG_DOORBELL_EXTERNALDOORBELL();
		int emCfgOpType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_DOORBELL_EXTERNALDOORBELL;
		int nChannelID = -1;

		// Get
		if(INetSDK.GetConfig(__LoginHandle, emCfgOpType, nChannelID, cfgData, _waittime, null)) {
			ToolKits.writeLog("DoorBell Enable " + cfgData.bEnable + " Type " + cfgData.emDoorBellType);

			// Set
            cfgData.bEnable = true;
            cfgData.emDoorBellType = NET_EM_DOORBELL_TYPE.NET_EM_DOORBELL_MECHANICAL;
			INetSDK.SetConfig(__LoginHandle, emCfgOpType, nChannelID, cfgData, _waittime, null, null);
		}
	}
	void ModifyDevicPassword()
	{
		NET_IN_MODIFY_REMOTEDEVICE_PASSWORD stuIn = new NET_IN_MODIFY_REMOTEDEVICE_PASSWORD();
		stuIn.nChannel=2;

		ToolKits.StringToByteArray("admin", stuIn.szUserName);
		ToolKits.StringToByteArray("admin1234", stuIn.szOldPassword);
		ToolKits.StringToByteArray("admin123", stuIn.szNewPassword);
		NET_OUT_MODIFY_REMOTEDEVICE_PASSWORD stuOut = new NET_OUT_MODIFY_REMOTEDEVICE_PASSWORD();
		boolean succeed = INetSDK.ModifyRemoteDevicePassword(__LoginHandle,stuIn, stuOut,5000);
		if(succeed)
		{
			ToolKits.writeLog("ModifyFrontDevicePassword success");
		}
		else
		{
			ToolKits.writeLog("ModifyFrontDevicePassword failed,lasterror:" + INetSDK.GetLastError());
		}

	}

	public void QueryPTZInfo() {
		CFG_PTZ_PROTOCOL_CAPS_INFO msg = new CFG_PTZ_PROTOCOL_CAPS_INFO();
		char szOutBuffer[] = new char[1024 * 10];
		Integer stError = new Integer(0);
		boolean bQN = INetSDK.QueryNewSystemInfo(__LoginHandle, FinalVar.CFG_CAP_CMD_PTZ, 0, szOutBuffer, stError, 5000);
		if (bQN) {
			bQN = INetSDK.ParseData(FinalVar.CFG_CAP_CMD_PTZ, szOutBuffer, msg, null);
			if (!bQN) {
				ToolKits.writeErrorLog("INetSDK.ParseData CFG_CAP_CMD_PTZ error");
			} else {
				ToolKits.writeLog("bWiper is :" + msg.bWiper);
				ToolKits.writeLog("bAux is :" + msg.bAux);
				ToolKits.writeLog("szAuxs[0]:" + new String(msg.szAuxs[0]).trim());
				ToolKits.writeLog("szAuxs[1]:" + new String(msg.szAuxs[1]).trim());
			}
		} else {
			ToolKits.writeErrorLog("INetSDK.QueryNewSystemInfo CFG_CAP_CMD_PTZ error");
		}
	}
	public void GetIFrameData() {
		NET_IN_GET_I_FRAME_DATA_FROM_STORAGE_VIDEO stuIn = new NET_IN_GET_I_FRAME_DATA_FROM_STORAGE_VIDEO();
		stuIn.nChannel = 1;
		stuIn.stuTime.dwYear = 2020;
		stuIn.stuTime.dwMonth = 4;
		stuIn.stuTime.dwDay = 23;
		stuIn.stuTime.dwHour = 9;
		stuIn.stuTime.dwMinute = 40;
		stuIn.stuTime.dwSecond = 0;

		NET_OUT_GET_I_FRAME_DATA_FROM_STORAGE_VIDEO stuOut = new NET_OUT_GET_I_FRAME_DATA_FROM_STORAGE_VIDEO(6*1024*1024);
		stuOut.nBufferLen = 6*1024*1024;
		boolean bRet = INetSDK.GetIFrameDataFromStorageVideo(__LoginHandle, stuIn, stuOut, 5000);
		if(bRet)
		{
			ToolKits.writeLog("GetIFrameData success");
		}
		else
		{
			ToolKits.writeErrorLog("GetIFrameData failed,error:" + INetSDK.GetLastError());
		}

	}


	public void QueryEventManagerInfo() {
		CFG_CAP_EVENTMANAGER_INFO msg = new CFG_CAP_EVENTMANAGER_INFO();
		char szOutBuffer[] = new char[1024 * 10];
		Integer stError = new Integer(0);
		boolean bQN = INetSDK.QueryNewSystemInfo(__LoginHandle, FinalVar.CFG_CAP_CMD_EVENTMANAGER, 0, szOutBuffer, stError, 5000);
		if (bQN) {
			bQN = INetSDK.ParseData(FinalVar.CFG_CAP_CMD_EVENTMANAGER, szOutBuffer, msg, null);
			if (!bQN) {
				ToolKits.writeErrorLog("INetSDK.ParseData CFG_CAP_CMD_EVENTMANAGER error");
			} else {
				ToolKits.writeLog("nSupportDisableLinkageTimeSection is :" + msg.nSupportDisableLinkageTimeSection);

			}
		} else {
			ToolKits.writeErrorLog("INetSDK.QueryNewSystemInfo CFG_CAP_CMD_EVENTMANAGER error");
		}
	}



	public void UnableLinkageTimeSection() {
		// 获取
		NET_CFG_DISABLE_LINKAGE_TIME_SECTION msg = new NET_CFG_DISABLE_LINKAGE_TIME_SECTION();
		int nType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_DISABLE_LINKAGE_TIME_SECTION;
		int nChannelID = -1;

		if(INetSDK.GetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null)) {
			ToolKits.writeLog("Get UnableLinkageTimeSection Succeed!");

			ToolKits.writeLog("bEnable:" + msg.bEnable);

			if(msg.bEnable)
			{
				msg.bEnable = false;
			}
			else
			{
				msg.bEnable = true;
			}

			if(INetSDK.SetConfig(__LoginHandle, nType, nChannelID, msg, _waittime, null, null)) {
				ToolKits.writeLog("Set DisableLinkageTimeSection Succeed!");
				NET_CFG_DISABLE_LINKAGE_TIME_SECTION msg1 = new NET_CFG_DISABLE_LINKAGE_TIME_SECTION();
				if(INetSDK.GetConfig(__LoginHandle, nType, nChannelID, msg1, _waittime, null)) {
					ToolKits.writeLog("Get1 DisableLinkageTimeSection Succeed!");
					ToolKits.writeLog("bEnable:" + msg.bEnable);
				}
			} else {
				ToolKits.writeErrorLog("Set DisableLinkageTimeSection Failed!, error is" + INetSDK.GetLastError());
			}
		} else {
			ToolKits.writeErrorLog("Get DisableLinkageTimeSection Failed!,error is" + INetSDK.GetLastError());
		}
	}



	// DoorBell Config
	void RadioRegulatorConfig() {
		NET_CFG_RADIO_REGULATOR cfgData = new NET_CFG_RADIO_REGULATOR();
		int emCfgOpType = NET_EM_CFG_OPERATE_TYPE.NET_EM_CFG_RADIO_REGULATOR;
		int nChannelID = 1;

		// Get
		boolean bRet = INetSDK.GetConfig(__LoginHandle, emCfgOpType, nChannelID, cfgData, _waittime, null);

		if(bRet)
		{
			ToolKits.writeLog("Get RadioRegulatorConfig success,Enable " + cfgData.bEnable);

			// Set
			cfgData.bEnable =!cfgData.bEnable;
			bRet = INetSDK.SetConfig(__LoginHandle, emCfgOpType, nChannelID, cfgData, _waittime, null, null);
			if (bRet)
			{
				ToolKits.writeLog("Set RadioRegulatorConfig success");
			}
			else
			{
				ToolKits.writeLog("Set RadioRegulatorConfig failed");
			}

		}
		else
		{
			ToolKits.writeLog("Get RadioRegulatorConfig failed,Error:"+ INetSDK.GetLastError());
		}

	}

	void QuerySystemStatusInfo() {
		SDK_SYSTEM_STATUS pIn = new SDK_SYSTEM_STATUS();
		if(INetSDK.QuerySystemStatus(__LoginHandle, pIn, 10000)) {
			Log.e("result", "success");
			String i = new String(pIn.pstuTemp.stuTemps[0].szName).trim();
			String j = String.valueOf(pIn.pstuPower.nBatteryNum);
			ToolKits.writeLog("ncount = " + j);
		} else {
			Log.e("result", "failed");
		}
	}
	private final int PROGRESS_FINISH = 0x10;
	public class Test_CB_fFaceFindStateCallBack implements
			CB_fFaceFindStateCallBack {
		@Override
		public void invoke(long lLoginID, long lAttachHandle, NET_CB_FACE_FIND_STATE pstStates, int nStateNum) {
			ToolKits.writeLog("lLoginID = " + lLoginID + ", lAttachHandle = "
					+ lAttachHandle + ", nProgress = " + pstStates.nProgress);
			if( pstStates.nProgress == 100){
				Message msg1 = mHandler.obtainMessage(PROGRESS_FINISH);
				mHandler.sendMessage(msg1);
			}
		}
	}

	Handler mHandler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
				case PROGRESS_FINISH:
					ToolKits.writeLog("PROGRESS_FINISH");
					INetSDK.DetachFaceFindState(g_lAttachHandle);
					g_lAttachHandle = 0;
					int nFindCount = 20;
					DoFind(nFindCount);
					break;
				default:
					break;
			}
		}
	};
	public long mFindHandle = 0;
	public long g_lAttachHandle = 0;
	void DoFind(int nCount){
		// 这里我一次查了20条记录，如果需要查询更多记录，可以多次调用DoFindFaceRecognition接口，但nBeginNum字段需要做偏移，比如第一次是nBeginNum=0，如果第二次查询，nBeginNum就为20，当stDoFindOut.nCadidateExNum小于stDoFindIn.nCount，表示查询记录结束
		NET_IN_DOFIND_FACERECONGNITION stDoFindIn = new NET_IN_DOFIND_FACERECONGNITION();
		stDoFindIn.lFindHandle = mFindHandle;  // 查询句柄
		stDoFindIn.nCount = nCount;              // 当前想查询的记录条数，一次最多只能查询20条记录
		stDoFindIn.nBeginNum = 0;
		stDoFindIn.emDataType = EM_NEEDED_PIC_RETURN_TYPE.EM_NEEDED_PIC_TYPE_HTTP_URL;
		NET_OUT_DOFIND_FACERECONGNITION stDoFindOut = new NET_OUT_DOFIND_FACERECONGNITION(100 * 1024 * 1024);
		stDoFindOut.bUseCandidatesEx = true;
		// 每次查询个数是多少，就需要初始化多少个 pszFilePath， 最大20
		for (int i = 0; i < 20; i++) {
			stDoFindOut.stuCandidatesEx[i].stPersonInfo.szFacePicInfo[0].pszFilePath = new byte[256];  // 必须填256
		}
		boolean bRet = INetSDK.DoFindFaceRecognition(stDoFindIn, stDoFindOut, 5000);
		if (bRet) {
			for (int i = 0; i < stDoFindOut.nCadidateExNum; ++i) {
				ToolKits.writeLog("PersonName:" + new String(stDoFindOut.stuCandidatesEx[i].stPersonInfo.szPersonName).trim());
				ToolKits.writeLog("FilePath:" + new String(stDoFindOut.stuCandidatesEx[i].stPersonInfo.szFacePicInfo[0].pszFilePath).trim());


				SDK_IN_DOWNLOAD_REMOTE_FILE inDFile = new SDK_IN_DOWNLOAD_REMOTE_FILE();
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String time = format.format(new Date());
				inDFile.pszFileDst = getExternalFilesDir(null).getAbsolutePath()+"/"+ "Pic" + "-" + time.replace(":","-").replace(" ", "_")  + "-" + i + ".jpg";
				inDFile.pszFileName = new String(stDoFindOut.stuCandidatesEx[i].stPersonInfo.szFacePicInfo[0].pszFilePath).trim();
				SDK_OUT_DOWNLOAD_REMOTE_FILE outDFile = new SDK_OUT_DOWNLOAD_REMOTE_FILE();

				bRet = INetSDK.DownloadRemoteFile(__LoginHandle, inDFile, outDFile, 4000);
				if (bRet) {
					ToolKits.writeLog("DownloadRemoteFile success");
				} else {
					ToolKits.writeLog("DownloadRemoteFile failed, error is :" + INetSDK.GetLastError());
				}
			}
		}
	}

	void Face(){
		// 查询目标识别结果
		NET_IN_STARTFIND_FACERECONGNITION stuIn = new NET_IN_STARTFIND_FACERECONGNITION();
		stuIn.bPersonEnable = true;
		stuIn.stPersonInfoEx.bySex = 0;
		stuIn.pBuffer = new byte[100*1024*1024];
		stuIn.stFilterInfo.szRange[0] = EM_FACE_DB_TYPE.NET_FACE_DB_TYPE_BLACKLIST; // 例子是查询人脸库，客户根据自己需求去填写,由于是人脸库，所以只有一张图
		stuIn.stMatchOptions.nSimilarity = 55;
		stuIn.stFilterInfo.stStartTime.dwYear = 2020;
		stuIn.stFilterInfo.stStartTime.dwMonth = 9;
		stuIn.stFilterInfo.stStartTime.dwDay = 18;
		stuIn.stFilterInfo.stStartTime.dwHour = 0;
		stuIn.stFilterInfo.stStartTime.dwMinute = 0;
		stuIn.stFilterInfo.stStartTime.dwSecond = 0;
		stuIn.stFilterInfo.stEndTime.dwYear = 2020;
		stuIn.stFilterInfo.stEndTime.dwMonth = 9;
		stuIn.stFilterInfo.stEndTime.dwDay = 18;
		stuIn.stFilterInfo.stEndTime.dwHour = 23;
		stuIn.stFilterInfo.stEndTime.dwMinute = 59;
		stuIn.stFilterInfo.stEndTime.dwSecond = 59;


		//建立文件对象
		File file=new File(Environment.getExternalStorageDirectory().getPath()  + "/1.jpg");
		int nBufferLen = 0;
		try
		{
			//建立链接
			FileInputStream fileInputStream=new FileInputStream(file);

			int n=0;
			while (n!=-1) //当n不等于-1,则代表未到末尾
			{
				n=fileInputStream.read(stuIn.pBuffer);//返回实际读取到字节数组中的字节数
				nBufferLen += n;
			}
			fileInputStream.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("文件不存在或者文件不可读或者文件是目录");
		}
		catch (IOException e)
		{
			System.out.println("读取过程存在异常");
		}
		stuIn.nBufferLen = nBufferLen + 1;
		stuIn.stPerson.wFacePicNum = 1;	// 例子是查询人脸库，客户根据自己需求去填写,由于是人脸库，所以只有一张图
		stuIn.stPerson.szFacePicInfo[0].dwFileLenth = stuIn.nBufferLen;
		NET_OUT_STARTFIND_FACERECONGNITION stuOut = new NET_OUT_STARTFIND_FACERECONGNITION();
		if(!INetSDK.StartFindFaceRecognition(__LoginHandle, stuIn, stuOut, 5000)) {
			ToolKits.writeErrorLog("StartFindFaceRecognition 查询失败！");
			return;
		}
		mFindHandle = stuOut.lFindHandle;
		if (-1 == stuOut.nTotalCount)
		{
			NET_IN_FACE_FIND_STATE stuInFindState = new NET_IN_FACE_FIND_STATE(1);
			NET_OUT_FACE_FIND_STATE stuOutFindState = new NET_OUT_FACE_FIND_STATE();
			stuInFindState.nTokens[0] = stuOut.nToken;
			stuInFindState.cbFaceFindStateCallBack = new Test_CB_fFaceFindStateCallBack();

			g_lAttachHandle = INetSDK.AttachFaceFindState(__LoginHandle, stuInFindState, stuOutFindState, 5000);
			if (0 == g_lAttachHandle)
			{
				ToolKits.writeLog("AttachFaceFindState failed,LastError:" + INetSDK.GetLastError());
				INetSDK.StopFindFaceRecognition(stuOut.lFindHandle);
				stuOut.lFindHandle = 0;
				mFindHandle = 0;
				return;
			}
			else
			{
				ToolKits.writeLog("AttachFaceFindState success");
			}
		}
		else{
			// 一次最多查询20条
			DoFind(20);
		}

		INetSDK.StopFindFaceRecognition(mFindHandle);
		mFindHandle = 0;

	}

	public void QueryRecordFile() {

		// 查询录像文件信息
		int nChannelId = 0;
		NET_TIME stTimeStart = new NET_TIME();
		stTimeStart.dwYear = 2022;
		stTimeStart.dwMonth = 4;
		stTimeStart.dwDay = 11;
		stTimeStart.dwHour = 12;

		NET_TIME stTimeEnd = new NET_TIME();
		stTimeEnd.dwYear = 2022;
		stTimeEnd.dwMonth = 4;
		stTimeEnd.dwDay = 11;
		stTimeEnd.dwHour = 14;


		NET_RECORDFILE_INFO[] stFileInfo = new NET_RECORDFILE_INFO[20]; //数组大小是查询的录像等的最大值
		for (int i = 0; i < stFileInfo.length; i++) {
			stFileInfo[i] = new NET_RECORDFILE_INFO();
		}

		String cardID = null;
		Integer nFileCount = new Integer(0);
		//boolean queryResult = INetSDK.QueryRecordFile(loginInfo.loginHandler, 0,  EM_QUERY_RECORD_TYPE.EM_RECORD_TYPE_ALL, startTime, endTime, "", recordFileInfos, 1, 5000, false);
		boolean cRet = INetSDK.QueryRecordFile(__LoginHandle, nChannelId, EM_QUERY_RECORD_TYPE.EM_RECORD_TYPE_ALL, stTimeStart, stTimeEnd, "", stFileInfo, nFileCount, 5000, false);
		if (cRet) {
			ToolKits.showMessage(this, "QueryRecordFile-EM_RECORD_TYPE_ALL Succeed，文件个数：" + nFileCount.intValue() + "\n");
			for(int i = 0; i < nFileCount.intValue(); i++)
			{
				ToolKits.writeLog("文件开始时间：" + stFileInfo[i].starttime.toString());
				ToolKits.writeLog("文件结束时间：" + stFileInfo[i].endtime.toString());
				ToolKits.writeLog("文件类型（0表示普通录象；1表示报警录象；2表示移动检测；3表示卡号录象；4表示图片）：" + stFileInfo[i].nRecordFileType);
			}
		}
		else
		{
			ToolKits.showMessage(this, "QueryRecordFile-EM_RECORD_TYPE_ALL failed,LastError:" +INetSDK.GetLastError());
			ToolKits.writeLog("QueryRecordFile-EM_RECORD_TYPE_ALL failed,LastError:" +INetSDK.GetLastError());
		}

	}

	public void QueryRecordFileEx() {

		// 查询录像文件信息
		int nChannelId = 0;
		NET_TIME stTimeStart = new NET_TIME();
		stTimeStart.dwYear = 2022;
		stTimeStart.dwMonth = 10;
		stTimeStart.dwDay = 10;
		stTimeStart.dwHour = 0;

		NET_TIME stTimeEnd = new NET_TIME();
		stTimeEnd.dwYear = 2022;
		stTimeEnd.dwMonth = 10;
		stTimeEnd.dwDay = 12;
		stTimeEnd.dwHour = 0;

		NET_IN_QUERY_RECORD_FILE_EX stIn = new NET_IN_QUERY_RECORD_FILE_EX();
		NET_OUT_QUERY_RECORD_FILE_EX stOut = new NET_OUT_QUERY_RECORD_FILE_EX(5);

		stIn.stuStartTime = stTimeStart;
		stIn.stuEndTime = stTimeEnd;
		stIn.nChannelId = nChannelId;
		stIn.emRecordFileType = EM_QUERY_RECORD_TYPE.EM_RECORD_TYPE_ALL;

		boolean cRet = INetSDK.QueryRecordFileEx(__LoginHandle, stIn, stOut, 5000);
		if (cRet) {
			ToolKits.writeLog("QueryRecordFileEx-EM_RECORD_TYPE_ALL Succeed，文件个数：" + stOut.nFileCount + " ");
			ToolKits.writeLog("   最大长度：" + stOut.nMaxlen + "\n");
			for(int i = 0; i <stOut.nFileCount; i++)
			{
				ToolKits.writeLog("第" + i + "个文件信息:");
				ToolKits.writeLog("   文件开始时间：" + stOut.pstuFileinfo[i].stuRecordFileInfo.starttime.toString());
				ToolKits.writeLog("   文件结束时间：" + stOut.pstuFileinfo[i].stuRecordFileInfo.endtime.toString());
				for(int j = 0; j < stOut.pstuFileinfo[i].nFlagCount; j ++){
					ToolKits.writeLog("   文件标志[" + j + "]：" + stOut.pstuFileinfo[i].emFlagsList[j]);
				}
				for(int j = 0; j < stOut.pstuFileinfo[i].nEventCount; j ++){
					ToolKits.writeLog("   事件列表[" + j + "]：" + stOut.pstuFileinfo[i].nEventLists[j]);
				}
			}
		}
		else
		{
			ToolKits.showMessage(this, "QueryRecordFileEx-EM_RECORD_TYPE_ALL failed,LastError:" +INetSDK.GetLastError());
			ToolKits.writeLog("QueryRecordFileEx-EM_RECORD_TYPE_ALL failed,LastError:" +INetSDK.GetLastError());
		}
	}
}

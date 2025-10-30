package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Alarm message callback function original shape
 * \else
 * 消息回调函数原型
 * \endif
 */
public interface CB_fMessageCallBack {

	/**
	 * \if ENGLISH_LANG
	 * Alarm message callback function original shape
	 * @param lCommand recall type,as pBuf 
	 * @param lLoginID  login handle, value form {@link INetSDK#LoginEx}or{@link INetSDK#Login}
	 * @param obj receive alarm data buffering,based on called monitoring interface and lCommand value differ,filled data differ\n
	 * if called monitoring interface is StartListen lCommand value may be:
	 * <table>
	 * <tr><td>lCommand</td><td>pBuf</td></tr>
	 * <tr><td>SDK_COMM_ALARM</td><td>data is 1 NET_CLIENT_STATE structure .</td></tr>
	 * <tr><td>SDK_SHELTER_ALARM</td><td>data is 16 byte, each byte means 1 video channel mask alarm status,1 is has alarm,0 is no alarm </td></tr>
	 * <tr><td>SDK_DISK_FULL_ALARM</td><td>data is 1个DWORD value,1 means hard disk full ,0 means hard disk unfull </td></tr>
	 * <tr><td>SDK_DISK_ERROR_ALARM	</td><td>data is one DWORD value,by means up to 32 hard disk malfunction alarm,each is 1 means has alarm, is 0 means no alarm </td></tr>
	 * <tr><td>SDK_SOUND_DETECT_ALARM</td><td>data is 16 byte, each byte means 1 video channel audio alarm status,1 is has alarm,0 is no alarm </td></tr>
	 * <tr><td>SDK_ALARM_DECODER_ALARM</td><td>data is 16 byte, each byte means 1 alarm decoder channel alarm status,1 is has alarm ,0 is no alarm </td></tr>
	 * </table>
	 * \n
	 * 如果调用的侦听接口为StartListenEx,则lCommand的可能值是:
	 * <table>
	 * <tr><td>lCommand</td><td>pBuf</td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EXdata</td><td>byte and device alarm channel number are same , each byte means 1 alarm channel alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_MOTION_ALARM_EXdata</td><td>byte and device video channel number are same , each byte means 1 video channel dynamic detection alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_VIDEOLOST_ALARM_EX</td><td>data byte and device video channel number are same , each byte means 1 video channel video loss alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_SHELTER_ALARM_EX</td><td>data byte and device video channel number are same , each byte means 1 video channel mask (black screen) alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_SOUND_DETECT_ALARM_EX</td><td>data is 16 byte , each byte means 1 video channel audio detection alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_DISKFULL_ALARM_EX</td><td>data is 1 byte ,1 is has hard disk full alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_DISKERROR_ALARM_EX</td><td>data is 32 byte , each byte means 1 hard disk malfunction alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_ENCODER_ALARM_EX	</td><td>data is 16 byte,each byte means 1 channel encoder status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_REBOOT_EVENT_EX</td><td>device reboot event,when user perform config, some need device to reboot as valid,when receive this event,may call to reboot interface to reboot device. </td></tr>
	 * <tr><td>SDK_URGENCY_ALARM_EX</td><td>emergency alarm,data is 16 byte,each byte means 1 channel encoder status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_WIRELESS_ALARM_EX</td><td>wireless alarm,data is 16 byte , each byte means 1 channel encoder status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_NEW_SOUND_DETECT_ALARM_EX</td><td>new audio detection alarm,alarm info structure as SDK_NEW_SOUND_ALARM_STATE. </td></tr>
	 * <tr><td>SDK_ALARM_DECODER_ALARM_EX</td><td>alarm decoder alarm , alarm structure as ALARM_DECODER_ALARM. </td></tr>
	 * <tr><td>SDK_DECODER_DECODE_ABILITY</td><td>decoder: decoder insufficient capacity alarm , 1 byte ,0:normal decode 1: means exceed decode capacity. </td></tr>
	 * <tr><td>SDK_FDDI_DECODER_ABILITY</td><td>fibre-optical encoder status alarm , structure as ALARM_FDDI_ALARM. </td></tr>
	 * <tr><td>SDK_PANORAMA_SWITCH_ALARM_EX</td><td>scene change alarm , data is 16 byte , each byte means 1 channel encoder status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_LOSTFOCUS_ALARM_EX</td><td>focus loss alarm , data is 16 byte , each byte means 1 channel encoder status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_OEMSTATE_EX</td><td>oem newsstand status ,type is BYTE. </td></tr>
	 * <tr><td>SDK_DSP_ALARM_EX</td><td>DSP alarm ,type is DSP_ALARM. </td></tr>
	 * <tr><td>SDK_ATMPOS_BROKEN_EX</td><td>atm and pos device device disconnect alarm , type is BYTE, 0:disconnected 1:connected. </td></tr>
	 * <tr><td>SDK_RECORD_CHANGED_EX</td><td>record status change alarm , data is ALARM_RECORDING_CHANGED. structure group  </td></tr>
	 * <tr><td>SDK_CONFIG_CHANGED_EX</td><td>config change alarm ,pBuf is vacant . </td></tr>
	 * <tr><td>SDK_DEVICE_REBOOT_EX</td><td>device reboot alarm ,pBuf is vacant . </td></tr>
	 * <tr><td>SDK_PTZ_LOCATION_EXPTZ</td><td>positioning info ALARM_PTZ_LOCATION_INFO.</td></tr> 
	 * <tr><td>ALARM_WINGDING_INFO</td><td>coil/car detector malfucntion alarm ALARM_WINGDING_INFO.</td></tr> 
	 * <tr><td>SDK_TRAF_CONGESTION_ALARM_EX</td><td>bust traffic alarm (traffic is abnormal)ALARM_TRAF_CONGESTION_INFO.</td></tr> 
	 * <tr><td>SDK_TRAF_EXCEPTION_ALARM_EX</td><td>abnormal traffic alarm (traffic flow close to 0 or abnormal vacant closed)ALARM_TRAF_EXCEPTION_INFO.</td></tr> 
	 * <tr><td>SDK_EQUIPMENT_FILL_ALARM_EX</td><td>backlight device malfunction alarm ALARM_EQUIPMENT_FILL_INFO.</td></tr> 
	 * <tr><td>SDK_ALARM_ARM_DISARM_STATE</td><td>alarm arm/disarm status ALARM_EQUIPMENT_FILL_INFO.</td></tr> 
	 * <tr><td>SDK_ALARM_ACC_POWEROFF ACC</td><td>outage alarm , type is DWORD 0:ACC electric 1:ACC outage </td></tr>
	 * <tr><td>SDK_ALARM_3GFLOW_EXCEED</td><td>3G flow exceend threshold value alarm SDKDEV_3GFLOW_EXCEED_STATE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_SPEED_LIMIT</td><td>limit alarm ALARM_SPEED_LIMIT </td></tr>
	 * <tr><td>SDK_ALARM_VEHICLE_INFO_UPLOAD</td><td>mobile user info uploadALARM_VEHICLE_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_STATIC_ALARM_EX</td><td>data byte and device video channel number are same , each byte means 1 video channel 静态 detection alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_PTZ_LOCATION_EXPTZ</td><td>positioning info SDK_PTZ_LOCATION_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CARD_RECORD_UPLOAD</td><td>card NO. record uploadALARM_CARD_RECORD_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_ALARM_ATM_INFO_UPLOAD</td><td>ATM trade info uploadALARM_ATM_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_ALARM_ENCLOSURE</td><td>electronic fence alarm ALARM_ENCLOSURE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_SIP_STATESIP</td><td>status alarm ALARM_SIP_STATE </td></tr>
	 * <tr><td>SDK_ALARM_RAID_STATE	</td><td>RAID abnormal alarm ALARM_RAID_INFO</td></tr>
	 * <tr><td>SDK_ALARM_CROSSING_SPEED_LIMIT</td><td>speed limit alarm ALARM_SPEED_LIMIT </td></tr>
	 * <tr><td>SDK_ALARM_OVER_LOADING</td><td>overload alarm ALARM_OVER_LOADING </td></tr>
	 * <tr><td>SDK_ALARM_HARD_BRAKING</td><td>quick brake alarm ALARM_HARD_BRAKING </td></tr>
	 * <tr><td>SDK_ALARM_SMOKE_SENSOR</td><td>smoke alarm ALARM_SMOKE_SENSOR </td></tr>
	 * <tr><td>SDK_ALARM_TRAFFIC_LIGHT_FAULT</td><td>traffic light malfucntion alarm ALARM_TRAFFIC_LIGHT_FAULT </td></tr>
	 * <tr><td>SDK_ALARM_TRAFFIC_FLUX_STAT</td><td>traffic flow statistics alarm ALARM_TRAFFIC_FLUX_LANE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CAMERA_MOVE</td><td>camera shift alarm eventALARM_CAMERA_MOVE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DETAILEDMOTION</td><td>dynamic detection alarm report infoALARM_DETAILEDMOTION_CHNL_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_FAILURE</td><td>albormal storage alarm , data is ALARM_STORAGE_FAILURE structure group  </td></tr>
	 * <tr><td>SDK_ALARM_FRONTDISCONNECT</td><td>front end IPC offline alarm ALARM_FRONTDISCONNET_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EX_REMOTE</td><td>remote external alarm ALARM_REMOTE_ALARM_INFO </td></tr>
	 * <tr><td>SDK_ALARM_BATTERYLOWPOWER</td><td>low battery alarm ALARM_BATTERYLOWPOWER_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TEMPERATURE</td><td>over heat alarm ALARM_TEMPERATURE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TIREDDRIVE</td><td>fatigue driving alarm ALARM_TIREDDRIVE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_LOST_RECORD</td><td>record loss event alarm ALARM_LOST_RECORD </td></tr>
	 * <tr><td>SDK_ALARM_HIGH_CPUCPU</td><td>over used event alarm ALARM_HIGH_CPU </td></tr>
	 * <tr><td>SDK_ALARM_LOST_NETPACKET</td><td>net send data loss event alarm ALARM_LOST_NETPACKET </td></tr>
	 * <tr><td>SDK_ALARM_HIGH_MEMORY</td><td>memory over used event alarm ALARM_HIGH_MEMORY </td></tr>
	 * <tr><td>SDK_LONG_TIME_NO_OPERATION</td><td>WEB user long time no operation event( no ectension info) </td></tr>
	 * <tr><td>SDK_BLACKLIST_SNAP</td><td>block list snapshot SDK_BLACKLIST_SNAP_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISK</td><td>HDD alarmALARM_DISK_INFO </td></tr>
	 * <tr><td>SDK_ALARM_FILE_SYSTEM</td><td>file system alarmALARM_FILE_SYSTEM_INFO </td></tr>
	 * <tr><td>SDK_ALARM_IVS</td><td>intelligent alarmALARM_IVS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_GOODS_WEIGHT_UPLOADload</td><td>reportALARM_GOODS_WEIGHT_UPLOAD_INFO </td></tr>
	 * <tr><td>SDK_ALARM_GOODS_WEIGHT</td><td>load info alarmALARM_GOODS_WEIGHT_INFO </td></tr>
	 * <tr><td>SDK_GPS_STATUS</td><td>GPSNET_GPS_STATUS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISKBURNED_FULL</td><td>HDD write alarmALARM_DISKBURNED_FULL_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_LOW_SPACE</td><td>storage no spaceALARM_STORAGE_LOW_SPACE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISK_FLUX</td><td>abnormalALARM_DISK_FLUX </td></tr>
	 * <tr><td>SDK_ALARM_NET_FLUX</td><td>abnormalALARM_NET_FLUX </td></tr>
	 * <tr><td>SDK_ALARM_FAN_SPEED</td><td>fan abnormalALARM_FAN_SPEED </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_FAILURE_EX</td><td>storage errorALARM_STORAGE_FAILURE_EX </td></tr>
	 * <tr><td>SDK_ALARM_RECORD_FAILED</td><td>record abnormalALARM_RECORD_FAILED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_BREAK_DOWN</td><td>storage crashALARM_STORAGE_BREAK_DOWN_INFO </td></tr>
	 * <tr><td>SDK_ALARM_VIDEO_ININVALID</td><td>video in failedALARM_VIDEO_ININVALID_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EX2</td><td>local of alarm_input channel eventALARM_ALARM_INFO_EX2 </td></tr>
	 * <tr><td>SDK_ALARM_POWERFAULT</td><td>powerfault envetALARM_POWERFAULT_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CHASSISINTRUDED</td><td>chaiisintruded eventALARM_CHASSISINTRUDED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARMEXTENDED</td><td>extended alarm_input channel event ALARM_ALARMEXTENDED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TALKING_INVITE</td><td>device invite talking eventALARM_TALKING_INVITE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ARMMODE_CHANGE_EVENT</td><td>device's armmode changed eventALARM_ARMMODE_CHANGE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_BYPASSMODE_CHANGE_EVENT</td><td>defence area bypassmode changed eventALARM_BYPASSMODE_CHANGE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_NOT_CLOS</td><td>Eaccess not close eventALARM_ACCESS_CTL_NOT_CLOSE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_BREAK_IN</td><td>break in eventALARM_ACCESS_CTL_BREAK_IN_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_REPEAT_ENTER</td><td>repeat enter eventALARM_ACCESS_CTL_REPEAT_ENTER_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_DURESS</td><td>duress swing card eventALARM_ACCESS_CTL_DURESS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_EVENT</td><td>access eventALARM_ACCESS_CTL_EVENT_INFO </td></tr>
	 * </table>
	 * some operation asynchronous recall event, lCommand value may be:
	 * <table>
	 * <tr><td>command</td><td>xplanation</td></tr>
	 * <tr><td>SDK_CONFIG_RESULT_EVENT_EX</td><td>data is change config return code,return structure as DEV_SET_RESULT. </td></tr>
	 * <tr><td>SDK_REBOOT_EVENT_EX</td><td>device reboot event； if reboot command not sent,current change will bot be valid immediately </td></tr>
	 * <tr><td>SDK_AUTO_TALK_START_EX</td><td>device actively invite to bidirectional talk. </td></tr>
	 * <tr><td>SDK_AUTO_TALK_STOP_EX</td><td>device actively stop bidirectional talk. </td></tr>
	 * <tr><td>SDK_CONFIG_CHANGE_EX	</td><td>device config changed. </td></tr>
	 * <tr><td>SDK_IPSEARCH_EVENT_EX</td><td>IP search event,return character string format as: DevName::Manufacturer::MAC::IP::Port::DevType::POEPort::SubMask::GateWay&& </td></tr>
	 * <tr><td>SDK_AUTO_RECONNECT_FAILD</td><td>auto reconnection failed event,retun to 1 int model data , means reconnection failed return code, as Logininterface login wrong code explanation </td></tr>
	 * <tr><td>SDK_REALPLAY_FAILD_EVENT</td><td>monitor invalid event,retunr structure DEV_PLAY_RESULT </td></tr>
	 * <tr><td>SDK_PLAYBACK_FAILD_EVENT</td><td>playback failed event,return structure DEV_PLAY_RESULT </td></tr>
	 * <tr><td>SDK_ALARM_AIO_APP_CONFIG_EVENT</td><td>AIO alarm event,return structure ALARM_AIO_APP_CONFIG_EVENT_INFO </td></tr>
	 * </table>
	 * @param pchDVRIP 设备IP
	 * @param nDVRPort 设备端口
	 * \else
	 * 消息回调函数
	 * @param lCommand 回调类型,具体见下pBuf的说明
	 * @param lLoginID  {@link INetSDK#LoginEx}或者{@link INetSDK#Login}的返回值
	 * @param obj 接收报警数据的缓存,根据调用的侦听接口和lCommand值不同,填充的数据不同 
	 * 如果调用的侦听接口为 StartListen,则lCommand的可能值是:
	 * <table>
	 * <tr><td>lCommand</td><td>pBuf</td></tr>
	 * <tr><td>SDK_COMM_ALARM</td><td>数据为一个NET_CLIENT_STATE结构体.</td></tr>
	 * <tr><td>SDK_SHELTER_ALARM</td><td>数据为16个字节,每个字节表示一个视频通道的遮挡报警状态,1为有报警,0为无报警.</td></tr>
	 * <tr><td>SDK_DISK_FULL_ALARM</td><td>数据为1个DWORD值,1表示硬盘满,0表示硬盘未满.</td></tr>
	 * <tr><td>SDK_DISK_ERROR_ALARM</td><td>数据为1个DWORD值,按位表示最多32个硬盘的故障报警,每位为1表示有报警,为0表示无报警.</td></tr>
	 * <tr><td>SDK_SOUND_DETECT_ALARM</td><td>数据为16个字节,每个字节表示一个视频通道的音频报警状态,1为有报警,0为无报警.</td></tr>
	 * <tr><td>SDK_ALARM_DECODER_ALARM</td><td>数据为16个字节,每个字节表示一个报警解码器通道的报警状态,1为有报警,0为无报警.</td></tr>
	 * </table>
	 * \n
	 * 如果调用的侦听接口为 StartListenEx,则lCommand的可能值是:
	 * <table>
	 * <tr><td>lCommand</td><td>pBuf</td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EX</td><td>数据字节数与设备报警通道个数相同,每个字节表示一个报警通道的报警状态,1为有报警,0为无报警. </td></tr>
	 * <tr><td>SDK_MOTION_ALARM_EX</td><td>数据字节数与设备视频通道个数相同,每个字节表示一个视频通道的动态检测报警状态,1为有报警,0为无报警. </td></tr>
	 * <tr><td>SDK_VIDEOLOST_ALARM_EX</td><td>数据字节数与设备视频通道个数相同,每个字节表示一个视频通道的视频丢失报警状态,1为有报警,0为无报警. </td></tr>
	 * <tr><td>SDK_SHELTER_ALARM_EX	</td><td>数据字节数与设备视频通道个数相同,每个字节表示一个视频通道的遮挡(黑屏)报警状态,1为有报警,0为无报警. </td></tr>
	 * <tr><td>SDK_SOUND_DETECT_ALARM_EX</td><td>数据为16个字节,每个字节表示一个视频通道的音频检测报警状态,1为有报警,0为无报警. </td></tr>
	 * <tr><td>SDK_DISKFULL_ALARM_EX</td><td>数据为1个字节,1为有硬盘满报警,0为无报警. </td></tr>
	 * <tr><td>SDK_DISKERROR_ALARM_EX</td><td>数据为32个字节,每个字节表示一个硬盘的故障报警状态,1为有报警,0为无报警.</td></tr> 
	 * <tr><td>SDK_ENCODER_ALARM_EX	</td><td>数据为16个字节,每个字节表示一个通道编码器状态,1为有报警,0为无报警. </td></tr>
	 * <tr><td>SDK_REBOOT_EVENT_EX</td><td>设备重启事件,用户进行一些配置时,有些需要设备重启才能生效,当收到此事件,可以调用重启接口重启设备. </td></tr>
	 * <tr><td>SDK_URGENCY_ALARM_EX	</td><td>紧急报警,数据为16个字节,每个字节表示一个通道编码器状态,1为有报警,0为无报警. </td></tr>
	 * <tr><td>SDK_WIRELESS_ALARM_EX</td><td>无线报警,数据为16个字节,每个字节表示一个通道编码器状态,1为有报警,0为无报警. </td></tr>
	 * <tr><td>SDK_NEW_SOUND_DETECT_ALARM_EX</td><td>新音频检测报警,报警信息的结构体见  SDK_NEW_SOUND_ALARM_STATE . </td></tr>
	 * <tr><td>SDK_ALARM_DECODER_ALARM_EX</td><td>报警解码器报警,报警结构体见  ALARM_DECODER_ALARM . </td></tr>
	 * <tr><td>SDK_DECODER_DECODE_ABILITY</td><td>解码器:解码器能力不足报警, 一个字节,0:能正常解码 1:表示超出解码能力. </td></tr>
	 * <tr><td>SDK_FDDI_DECODER_ABILITY</td><td>光纤编码器状态报警,结构体见ALARM_FDDI_ALARM. </td></tr>
	 * <tr><td>SDK_PANORAMA_SWITCH_ALARM_EX</td><td>切换场景报警,数据为16个字节,每个字节表示一个通道编码器状态,1为有报警,0为无报警. </td></tr>
	 * <tr><td>SDK_LOSTFOCUS_ALARM_EX</td><td>失去焦点报警,数据为16个字节,每个字节表示一个通道编码器状态,1为有报警,0为无报警. </td></tr>
	 * <tr><td>SDK_OEMSTATE_EX</td><td>oem报停状态,类型为BYTE. </td></tr>
	 * <tr><td>SDK_DSP_ALARM_EXDSP</td><td>报警,类型为DSP_ALARM. </td></tr>
	 * <tr><td>SDK_ATMPOS_BROKEN_EX	</td><td>atm和pos机断开报警,类型为BYTE, 0:连接断开 1:连接正常. </td></tr>
	 * <tr><td>SDK_RECORD_CHANGED_EX</td><td>录像状态变化报警,数据为ALARM_RECORDING_CHANGED.的结构体数组 </td></tr>
	 * <tr><td>SDK_CONFIG_CHANGED_EX</td><td>配置发生变化报警,pBuf为空. </td></tr>
	 * <tr><td>SDK_DEVICE_REBOOT_EX</td><td>设备重启报警,pBuf为空. </td></tr>
	 * <tr><td>SDK_PTZ_LOCATION_EX</td><td>云台定位信息 ALARM_PTZ_LOCATION_INFO. </td></tr>
	 * <tr><td>SDK_WINGDING_ALARM_EX</td><td>线圈/车检器故障报警 ALARM_WINGDING_INFO. </td></tr>
	 * <tr><td>SDK_TRAF_CONGESTION_ALARM_E</td><td>X交通阻塞报警(车辆出现异常停止或者排队) ALARM_TRAF_CONGESTION_INFO </td></tr>. 
	 * <tr><td>SDK_TRAF_EXCEPTION_ALARM_EX</td><td>交通异常报警(交通流量趋于0或异常空闲) ALARM_TRAF_EXCEPTION_INFO </td></tr>. 
	 * <tr><td>SDK_EQUIPMENT_FILL_ALARM_EX</td><td>补光设备故障报警ALARM_EQUIPMENT_FILL_INFO. </td></tr>
	 * <tr><td>SDK_ALARM_ARM_DISARM_STATE</td><td>报警布撤防状态ALARM_EQUIPMENT_FILL_INFO. </td></tr>
	 * <tr><td>SDK_ALARM_ACC_POWEROFF</td><td>ACC断电报警,类型为DWORD 0:ACC通电 1:ACC断电 </td></tr>
	 * <tr><td>SDK_ALARM_3GFLOW_EXCEED</td><td>3G流量超出阈值报警  SDKDEV_3GFLOW_EXCEED_STATE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_SPEED_LIMIT</td><td>限速报警ALARM_SPEED_LIMIT </td></tr>
	 * <tr><td>SDK_ALARM_VEHICLE_INFO_UPLOAD</td><td>车载自定义信息上传ALARM_VEHICLE_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_STATIC_ALARM_EX</td><td>数据字节数与设备视频通道个数相同,每个字节表示一个视频通道的静态检测报警状态,1为有报警,0为无报警. </td></tr>
	 * <tr><td>SDK_PTZ_LOCATION_EX</td><td>云台定位信息 SDK_PTZ_LOCATION_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CARD_RECORD_UPLOAD</td><td>卡号录像信息上传 ALARM_CARD_RECORD_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_ALARM_ATM_INFO_UPLOADATM</td><td>交易信息上传 ALARM_ATM_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_ALARM_ENCLOSURE</td><td>电子围栏报警 ALARM_ENCLOSURE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_SIP_STATE</td><td>SIP状态报警  ALARM_SIP_STATE </td></tr>
	 * <tr><td>SDK_ALARM_RAID_STATE</td><td>RAID异常报警 ALARM_RAID_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CROSSING_SPEED_LIMIT</td><td>路口限速报警 ALARM_SPEED_LIMIT </td></tr>
	 * <tr><td>SDK_ALARM_OVER_LOADING</td><td>超载报警 ALARM_OVER_LOADING </td></tr>
	 * <tr><td>SDK_ALARM_HARD_BRAKING</td><td>急刹车报警 ALARM_HARD_BRAKING </td></tr>
	 * <tr><td>SDK_ALARM_SMOKE_SENSOR</td><td>烟感报警 ALARM_SMOKE_SENSOR </td></tr>
	 * <tr><td>SDK_ALARM_TRAFFIC_LIGHT_FAULT</td><td>交通灯故障报警 ALARM_TRAFFIC_LIGHT_FAULT </td></tr>
	 * <tr><td>SDK_ALARM_TRAFFIC_FLUX_STAT</td><td>交通流量统计报警 ALARM_TRAFFIC_FLUX_LANE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CAMERA_MOVE</td><td>摄像机移位报警事件 ALARM_CAMERA_MOVE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DETAILEDMOTION</td><td>详细动检报警上报信息 ALARM_DETAILEDMOTION_CHNL_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_FAILURE</td><td>存储异常报警,数据为 ALARM_STORAGE_FAILURE 的结构体数组 </td></tr>
	 * <tr><td>SDK_ALARM_FRONTDISCONNECT</td><td>前端IPC断网报警 ALARM_FRONTDISCONNET_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EX_REMOTE</td><td>远程外部报警 ALARM_REMOTE_ALARM_INFO </td></tr>
	 * <tr><td>SDK_ALARM_BATTERYLOWPOWER</td><td>电池电量低报警 ALARM_BATTERYLOWPOWER_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TEMPERATURE</td><td>温度异常报警 ALARM_TEMPERATURE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TIREDDRIVE</td><td>疲劳驾驶报警 ALARM_TIREDDRIVE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_LOST_RECORD</td><td>丢录像事件报警 ALARM_LOST_RECORD </td></tr>
	 * <tr><td>SDK_ALARM_HIGH_CPU</td><td>CPU占用率过高事件报警 ALARM_HIGH_CPU </td></tr>
	 * <tr><td>SDK_ALARM_LOST_NETPACKET</td><td>网络发送数据丢包事件报警 ALARM_LOST_NETPACKET </td></tr>
	 * <tr><td>SDK_ALARM_HIGH_MEMORY</td><td>内存占用率过高事件报警 ALARM_HIGH_MEMORY </td></tr>
	 * <tr><td>SDK_LONG_TIME_NO_OPERATIONWEB</td><td>用户长时间无操作事件(无扩展信息) </td></tr>
	 * <tr><td>SDK_BLACKLIST_SNAP</td><td>禁止名单车辆抓拍事件 SDK_BLACKLIST_SNAP_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISK</td><td>硬盘报警 ALARM_DISK_INFO数组 </td></tr>
	 * <tr><td>SDK_ALARM_FILE_SYSTEM</td><td>文件系统报警 ALARM_FILE_SYSTEM_INFO数组 </td></tr>
	 * <tr><td>SDK_ALARM_IVS</td><td>智能报警事件 ALARM_IVS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_GOODS_WEIGHT_UPLOAD</td><td>货重信息上报 ALARM_GOODS_WEIGHT_UPLOAD_INFO </td></tr>
	 * <tr><td>SDK_ALARM_GOODS_WEIGHT</td><td>货重信息报警 ALARM_GOODS_WEIGHT_INFO </td></tr>
	 * <tr><td>SDK_GPS_STATUSGPS</td><td>定位信息 NET_GPS_STATUS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISKBURNED_FULL</td><td>硬盘刻录满报警 ALARM_DISKBURNED_FULL_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_LOW_SPACE</td><td>存储容量不足事件 ALARM_STORAGE_LOW_SPACE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISK_FLUX</td><td>硬盘数据异常事件 ALARM_DISK_FLUX </td></tr>
	 * <tr><td>SDK_ALARM_NET_FLUX</td><td>网络数据异常事件 LARM_NET_FLUX </td></tr>
	 * <tr><td>SDK_ALARM_FAN_SPEED</td><td>扇转速异常事件 ALARM_FAN_SPEED </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_FAILURE_EX</td><td>存储错误报警 ALARM_STORAGE_FAILURE_EX </td></tr>
	 * <tr><td>SDK_ALARM_RECORD_FAILED</td><td>录像异常报警 ALARM_RECORD_FAILED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_BREAK_DOWN</td><td>存储崩溃事件 ALARM_STORAGE_BREAK_DOWN_INFO </td></tr>
	 * <tr><td>SDK_ALARM_VIDEO_ININVALID</td><td>视频输入通道失效事件(例:配置的视频输入通道码流,超出设备处理能力)ALARM_VIDEO_ININVALID_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EX2</td><td>本地报警输入通道事件,返回结构体 ALARM_ALARM_INFO_EX2 </td></tr>
	 * <tr><td>SDK_ALARM_POWERFAULT</td><td>电源故障事件,返回结构体 ALARM_POWERFAULT_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CHASSISINTRUDED</td><td>防拆事件,返回结构体 ALARM_CHASSISINTRUDED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARMEXTENDED</td><td>扩展报警输入通道事件 ALARM_ALARMEXTENDED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TALKING_INVITE</td><td>设备邀请平台对讲事件 ALARM_TALKING_INVITE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ARMMODE_CHANGE_EVENT</td><td>设备布防模式变化事件 ALARM_ARMMODE_CHANGE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_BYPASSMODE_CHANGE_EVENT</td><td>防区旁路状态变化事件 ALARM_BYPASSMODE_CHANGE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_NOT_CLOSE</td><td>门禁未关事件 ALARM_ACCESS_CTL_NOT_CLOSE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_BREAK_IN</td><td>闯入事件 ALARM_ACCESS_CTL_BREAK_IN_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_REPEAT_ENTER</td><td>反复进入事件ALARM_ACCESS_CTL_REPEAT_ENTER_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_DURESS</td><td>胁迫卡刷卡事件 ALARM_ACCESS_CTL_DURESS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_EVENT</td><td>门禁事件 ALARM_ACCESS_CTL_EVENT_INFO </td></tr>
	 * <tr><td>SDK_ALARM_AIO_APP_CONFIG_EVENT</td><td>AIO报警事件 ALARM_AIO_APP_CONFIG_EVENT_INFO </td></tr>
	 * </table>
	 * 一些操作的异步回调事件,则lCommand的可能值是:
	 * <table>
	 * <tr><td>命令</td><td>说明</td></tr>
	 * <tr><td>SDK_CONFIG_RESULT_EVENT_EX</td><td>数据为修改配置的返回码,返回结构体见DEV_SET_RESULT. </td></tr>
	 * <tr><td>SDK_REBOOT_EVENT_EX</td><td>设备重启事件:如果未发送重启命令,当前修改的配置不会立即生效 </td></tr>
	 * <tr><td>SDK_AUTO_TALK_START_EX</td><td>设备主动邀请开始语音对讲. </td></tr>
	 * <tr><td>SDK_AUTO_TALK_STOP_EX</td><td>设备主动停止语音对讲. </td></tr>
	 * <tr><td>SDK_CONFIG_CHANGE_EX</td><td>设备配置发生改变. </td></tr>
	 * <tr><td>SDK_IPSEARCH_EVENT_EX</td><td>IP搜索事件,返回字符串格式如下:DevName::Manufacturer::MAC::IP::Port::DevType::POEPort::SubMask::GateWay&& </td></tr>
	 * <tr><td>SDK_AUTO_RECONNECT_FAILD</td><td>自动重连失败事件,返回一个int型数据,表示重连失败返回码,具体参见 Login接口的登录错误码说明 </td></tr>
	 * <tr><td>SDK_REALPLAY_FAILD_EVENT</td><td>预览失败事件,返回结构体  DEV_PLAY_RESULT </td></tr>
	 * <tr><td>SDK_PLAYBACK_FAILD_EVENT</td><td>回放失败事件,返回结构体  DEV_PLAY_RESULT </td></tr>
	 * </table>
	 * @param pchDVRIP 设备IP
	 * @param nDVRPort 设备端口
	 * \endif
	 */
	public boolean invoke(int lCommand, long lLoginID, Object obj, String pchDVRIP, int nDVRPort);

}

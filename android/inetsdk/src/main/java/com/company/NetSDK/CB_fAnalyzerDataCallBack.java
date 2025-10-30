package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Intelligent analysis data callback
 * \else
 * 智能分析数据回调
 * \endif
 */
public interface CB_fAnalyzerDataCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Intelligent analysis data callback
	 * @param lAnalyzerHandle return from {@link INetSDK#RealLoadPicture}
	 * @param dwAlarmType intelligent analysis type
	 * <table>
	 * <tr><td>EVENT_IVS_ALL</td><td>all alarm info will be uploaded, detailed as follows</td></tr>
	 * <tr><td>EVENT_IVS_CROSSLINEDETECTION</td><td>data is one DEV_EVENT_CROSSLINE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_CROSSREGIONDETECTION</td><td>data is one DEV_EVENT_CROSSREGION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_PASTEDETECTION	</td><td>data is one DEV_EVENT_PASTE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_LEFTDETECTION</td><td>data is one DEV_EVENT_LEFT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_ANIMAL_DETECTION</td><td>data is one DEV_EVENT_ANIMAL_DETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_STAYDETECTION</td><td>data is one DEV_EVENT_STAY_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_WANDERDETECTION</td><td>data is one DEV_EVENT_WANDER_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_PRESERVATION</td><td>data is one DEV_EVENT_PRESERVATION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_MOVEDETECTION</td><td>data is one DEV_EVENT_MOVE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TAILDETECTION</td><td>data is one DEV_EVENT_TAIL_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_RIOTERDETECTION</td><td>data is one DEV_EVENT_RIOTERL_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_FIREDETECTION</td><td>data is one DEV_EVENT_FIRE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_SMOKEDETECTION</td><td>data is one DEV_EVENT_SMOKE_INFO structure.</td></tr> 
	 * <tr><td>EVENT_IVS_FIGHTDETECTION</td><td>data is one DEV_EVENT_FIGHT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_FLOWSTAT</td><td>data is one DEV_EVENT_FLOWSTAT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_NUMBERSTAT</td><td>data is one DEV_EVENT_NUMBERSTAT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_CAMERACOVERDDETECTION </td><td>  </td></tr> 
	 * <tr><td>EVENT_IVS_CAMERAMOVEDDETECTION </td><td>  </td></tr> 
	 * <tr><td>EVENT_IVS_VIDEOABNORMALDETECTION</td><td>data is one DEV_EVENT_VIDEOABNORMALDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_VIDEOBADDETECTION</td><td>  </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFICCONTROL</td><td>data is one DEV_EVENT_TRAFFICCONTROL_INFO structure.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFICACCIDENT</td><td>data is one DEV_EVENT_TRAFFICACCIDENT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFICJUNCTION</td><td>data is one DEV_EVENT_TRAFFICJUNCTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFICGATE</td><td>data is one DEV_EVENT_TRAFFICGATE_INFO structure.</td></tr>
	 * <tr><td>EVENT_TRAFFICSNAPSHOT</td><td>data is one DEV_EVENT_TRAFFICSNAPSHOT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_FACEDETECT	</td><td>data is one DEV_EVENT_FACEDETECT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFICJAM	</td><td>data is one DEV_EVENT_TRAFFICJAM_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_RUNREDLIGHT</td><td>data is one DEV_EVENT_TRAFFIC_RUNREDLIGHT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_OVERLINE</td><td>data is one DEV_EVENT_TRAFFIC_OVERLINE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_RETROGRADE</td><td>data is one DEV_EVENT_TRAFFIC_RETROGRADE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_TURNLEFT</td><td>data is one DEV_EVENT_TRAFFIC_TURNLEFT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_TURNRIGHT</td><td>data is one DEV_EVENT_TRAFFIC_TURNRIGHT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_UTURN	</td><td>data is one DEV_EVENT_TRAFFIC_UTURN_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_OVERSPEED</td><td>data is one DEV_EVENT_TRAFFIC_OVERSPEED_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_UNDERSPEED</td><td>data is one DEV_EVENT_TRAFFIC_UNDERSPEED_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_PARKING</td><td>data is one DEV_EVENT_TRAFFIC_PARKING_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_WRONGROUTE</td><td>data is one DEV_EVENT_TRAFFIC_WRONGROUTE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_CROSSLANE</td><td>data is one DEV_EVENT_TRAFFIC_CROSSLANE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_OVERYELLOWLINE	</td><td>data is one DEV_EVENT_TRAFFIC_OVERYELLOWLINE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_DRIVINGONSHOULDER	</td><td>data is one DEV_EVENT_TRAFFIC_DRIVINGONSHOULDER_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_YELLOWPLATEINLANE	</td><td>data is one DEV_EVENT_TRAFFIC_YELLOWPLATEINLANE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_PEDESTRAINPRIORITY </td><td>data is one DEV_EVENT_TRAFFIC_PEDESTRAINPRIORITY_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_CROSSFENCEDETECTION</td><td>data is one DEV_EVENT_CROSSFENCEDETECTION_INFO structure
	 * <tr><td>EVENT_IVS_ELECTROSPARKDETECTION</td><td>data is one DEV_EVENT_ELECTROSPARK_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_NOPASSING</td><td>data is one DEV_EVENT_TRAFFIC_NOPASSING_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_ABNORMALRUNDETECTION</td><td>data is one DEV_EVENT_ABNORMALRUNDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_RETROGRADEDETECTION</td><td>data is one DEV_EVENT_RETROGRADEDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_INREGIONDETECTION</td><td>data is one DEV_EVENT_INREGIONDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TAKENAWAYDETECTION</td><td>data is one DEV_EVENT_TAKENAWAYDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_PARKINGDETECTION</td><td>data is one DEV_EVENT_PARKINGDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_FACERECOGNITION</td><td>data is one DEV_EVENT_FACERECOGNITION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_MANUALSNAP</td><td>data is one DEV_EVENT_TRAFFIC_MANUALSNAP_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_FLOWSTATE</td><td>data is one DEV_EVENT_TRAFFIC_FLOWSTAT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_STAY</td><td>data is one DEV_EVENT_TRAFFIC_STAY_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_VEHICLEINROUTE</td><td>data is one DEV_EVENT_TRAFFIC_VEHICLEINROUTE_INFO structure.</td></tr>
	 * <tr><td>EVENT_ALARM_MOTIONDETECT</td><td>  </td></tr>
	 * <tr><td>EVENT_ALARM_LOCALALARM</td><td>data is one DEV_EVENT_ALARM_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_PSRISEDETECTION</td><td>data is one DEV_EVENT_PSRISEDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_TOLLGATE</td><td>  </td></tr>
	 * <tr><td>EVENT_IVS_DENSITYDETECTION</td><td>data is one DEV_EVENT_DENSITYDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_VIDEODIAGNOSIS</td><td> </td></tr>  
	 * <tr><td>EVENT_IVS_QUEUEDETECTION</td><td>data is one DEV_EVENT_QUEUEDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_VEHICLEINBUSROUTE</td><td>data is one DEV_EVENT_TRAFFIC_VEHICLEINBUSROUTE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_BACKING</td><td>data is one DEV_EVENT_IVS_TRAFFIC_BACKING_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_AUDIO_ABNORMALDETECTION</td><td>data is one DEV_EVENT_IVS_AUDIO_ABNORMALDETECTION_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_RUNYELLOWLIGHT</td><td>data is one DEV_EVENT_TRAFFIC_RUNYELLOWLIGHT_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_CLIMBDETECTION</td><td>data is one DEV_EVENT_IVS_CLIMB_INFO structure.</td></tr> 
	 * <tr><td>EVENT_IVS_LEAVEDETECTION</td><td>data is one DEV_EVENT_IVS_LEAVE_INFO structure.</td></tr>	
	 * <tr><td>EVENT_IVS_TRAFFIC_PARKINGONYELLOWBOX</td><td>data is one DEV_EVENT_TRAFFIC_PARKINGONYELLOWBOX_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_PARKINGSPACEPARKING</td><td>data is one DEV_EVENT_TRAFFIC_PARKINGSPACEPARKING_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_PARKINGSPACENOPARKING</td><td>data is one DEV_EVENT_TRAFFIC_PARKINGSPACENOPARKING_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_PEDESTRAIN</td><td>data is one DEV_EVENT_TRAFFIC_PEDESTRAIN_INFO structure.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_THROW</td><td>data is one DEV_EVENT_TRAFFIC_THROW_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_IDLE</td><td>data is one DEV_EVENT_TRAFFIC_IDLE_INFO structure.</td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_ALL</td><td>all event start with traffic，each event correspond to the above declaration structure</td></tr>
	 * </table>
	 * @param pAlarmInfo receive intelligent analysis event info,based on different dwAlarmType value，filled info differ 
	 * @param pBuffer intelligent image info 
	 * @param dwBufSize intelligent image info size 
	 * @param nSequence means status of the same uploaded image, when it is 0, it appears first time. When it is 2, it appears last time or appears once. When it is 1, it will appear again. 
	 * @param reserved int nState = (int) reserved means current call data status; when it is 1, it means current data is real time; when it is 1, it means current recall data is offline; when it is 2, it means offline data send structure 
	 * \else
	 * 智能分析数据回调函数
	 * @param lAnalyzerHandle {@link INetSDK#RealLoadPicture}的返回值
	 * @param dwAlarmType 智能分析类型 
	 * <table>
	 * <tr><td>EVENT_IVS_ALL</td><td>所有报警信息都会上传，详见下面注释 </td></tr> 
	 * <tr><td>EVENT_IVS_CROSSLINEDETECTION</td><td>数据为一个 DEV_EVENT_CROSSLINE_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_CROSSREGIONDETECTION</td><td>数据为一个 DEV_EVENT_CROSSREGION_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_PASTEDETECTION	</td><td>数据为一个 DEV_EVENT_PASTE_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_LEFTDETECTION</td><td>数据为一个 DEV_EVENT_LEFT_INFO 结构体.</td></tr>
	 * <tr><td>EVENT_IVS_ANIMAL_DETECTION</td><td>数据为一个 DEV_EVENT_ANIMAL_DETECTION_INFO 结构体.</td></tr>
	 * <tr><td>EVENT_IVS_STAYDETECTION</td><td>数据为一个 DEV_EVENT_STAY_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_WANDERDETECTION</td><td>数据为一个 DEV_EVENT_WANDER_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_PRESERVATION</td><td>数据为一个 DEV_EVENT_PRESERVATION_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_MOVEDETECTION</td><td>数据为一个 DEV_EVENT_MOVE_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TAILDETECTION</td><td>数据为一个 DEV_EVENT_TAIL_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_RIOTERDETECTION</td><td>数据为一个 DEV_EVENT_RIOTERL_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_FIREDETECTION</td><td>数据为一个 DEV_EVENT_FIRE_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_SMOKEDETECTION</td><td>数据为一个 DEV_EVENT_SMOKE_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_FIGHTDETECTION</td><td>数据为一个 DEV_EVENT_FIGHT_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_FLOWSTAT</td><td>数据为一个 DEV_EVENT_FLOWSTAT_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_NUMBERSTAT</td><td>数据为一个 DEV_EVENT_NUMBERSTAT_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_CAMERACOVERDDETECTION</td><td>  </td></tr>  
	 * <tr><td>EVENT_IVS_CAMERAMOVEDDETECTION </td><td>  </td></tr> 
	 * <tr><td>EVENT_IVS_VIDEOABNORMALDETECTION</td><td>数据为一个 DEV_EVENT_VIDEOABNORMALDETECTION_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_VIDEOBADDETECTION </td><td>  </td></tr>   
	 * <tr><td>EVENT_IVS_TRAFFICCONTROL</td><td>数据为一个 DEV_EVENT_TRAFFICCONTROL_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFICACCIDENT</td><td>数据为一个 DEV_EVENT_TRAFFICACCIDENT_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFICJUNCTION</td><td>数据为一个 DEV_EVENT_TRAFFICJUNCTION_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFICGATE</td><td>数据为一个 DEV_EVENT_TRAFFICGATE_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_TRAFFICSNAPSHOT</td><td>数据为一个 DEV_EVENT_TRAFFICSNAPSHOT_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_FACEDETECT</td><td>数据为一个 DEV_EVENT_FACEDETECT_INFO 结构体. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFICJAM</td><td>数据为一个 DEV_EVENT_TRAFFICJAM_INFO 结构体. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_RUNREDLIGHT</td><td>数据为一个 DEV_EVENT_TRAFFIC_RUNREDLIGHT_INFO 结构体. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_OVERLINE</td><td>数据为一个 DEV_EVENT_TRAFFIC_OVERLINE_INFO 结构体. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_RETROGRADE</td><td>数据为一个 DEV_EVENT_TRAFFIC_RETROGRADE_INFO 结构体. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_TURNLEFT</td><td>数据为一个 DEV_EVENT_TRAFFIC_TURNLEFT_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_TURNRIGHT</td><td>数据为一个 DEV_EVENT_TRAFFIC_TURNRIGHT_INFO 结构体. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_UTURN	</td><td>数据为一个 DEV_EVENT_TRAFFIC_UTURN_INFO 结构体. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_OVERSPEED</td><td>数据为一个 DEV_EVENT_TRAFFIC_OVERSPEED_INFO 结构体. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_UNDERSPEED</td><td>数据为一个 DEV_EVENT_TRAFFIC_UNDERSPEED_INFO 结构体. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_PARKING</td><td>数据为一个 DEV_EVENT_TRAFFIC_PARKING_INFO 结构体. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_WRONGROUTE</td><td>数据为一个 DEV_EVENT_TRAFFIC_WRONGROUTE_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_CROSSLANE</td><td>数据为一个 DEV_EVENT_TRAFFIC_CROSSLANE_INFO 结构体. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_OVERYELLOWLINE</td><td>数据为一个 DEV_EVENT_TRAFFIC_OVERYELLOWLINE_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_DRIVINGONSHOULDER</td><td>数据为一个 DEV_EVENT_TRAFFIC_DRIVINGONSHOULDER_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_YELLOWPLATEINLANE</td><td>数据为一个 DEV_EVENT_TRAFFIC_YELLOWPLATEINLANE_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_PEDESTRAINPRIORITY</td><td>数据为一个 DEV_EVENT_TRAFFIC_PEDESTRAINPRIORITY_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_CROSSFENCEDETECTION</td><td>数据为一个 DEV_EVENT_CROSSFENCEDETECTION_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_ELECTROSPARKDETECTION</td><td>数据为一个 DEV_EVENT_ELECTROSPARK_INFO 结构体. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_NOPASSING</td><td>数据为一个 DEV_EVENT_TRAFFIC_NOPASSING_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_ABNORMALRUNDETECTION</td><td>数据为一个 DEV_EVENT_ABNORMALRUNDETECTION_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_RETROGRADEDETECTION</td><td>数据为一个 DEV_EVENT_RETROGRADEDETECTION_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_INREGIONDETECTION</td><td>数据为一个 DEV_EVENT_INREGIONDETECTION_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TAKENAWAYDETECTION</td><td>数据为一个 DEV_EVENT_TAKENAWAYDETECTION_INFO 结构体. </td></tr>
	 * <tr><td>EVENT_IVS_PARKINGDETECTION</td><td>数据为一个 DEV_EVENT_PARKINGDETECTION_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_FACERECOGNITION</td><td>数据为一个 DEV_EVENT_FACERECOGNITION_INFO 结构体. </td></tr>
	 * <tr><td>EVENT_IVS_TRAFFIC_MANUALSNAP</td><td>数据为一个 DEV_EVENT_TRAFFIC_MANUALSNAP_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_FLOWSTATE</td><td>数据为一个 DEV_EVENT_TRAFFIC_FLOWSTAT_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_STAY</td><td>数据为一个 DEV_EVENT_TRAFFIC_STAY_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_VEHICLEINROUTE</td><td>数据为一个 DEV_EVENT_TRAFFIC_VEHICLEINROUTE_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_ALARM_MOTIONDETECT </td><td>  </td></tr>   
	 * <tr><td>EVENT_ALARM_LOCALALARM</td><td>数据为一个 DEV_EVENT_ALARM_INFO结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_PSRISEDETECTION</td><td>数据为一个 DEV_EVENT_PSRISEDETECTION_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_TOLLGATE  
	 * <tr><td>EVENT_IVS_DENSITYDETECTION</td><td>数据为一个 DEV_EVENT_DENSITYDETECTION_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_VIDEODIAGNOSIS </td><td>  </td></tr>   
	 * <tr><td>EVENT_IVS_QUEUEDETECTION	</td><td>数据为一个 DEV_EVENT_QUEUEDETECTION_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_VEHICLEINBUSROUTE	</td><td>数据为一个 DEV_EVENT_TRAFFIC_VEHICLEINBUSROUTE_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_BACKING</td><td>数据为一个 DEV_EVENT_IVS_TRAFFIC_BACKING_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_AUDIO_ABNORMALDETECTION</td><td>数据为一个 DEV_EVENT_IVS_AUDIO_ABNORMALDETECTION_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_RUNYELLOWLIGHT</td><td>数据为一个 DEV_EVENT_TRAFFIC_RUNYELLOWLIGHT_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_CLIMBDETECTION	</td><td>数据为一个 DEV_EVENT_IVS_CLIMB_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_LEAVEDETECTION	</td><td>数据为一个 DEV_EVENT_IVS_LEAVE_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_PARKINGONYELLOWBOX	</td><td>数据为一个 DEV_EVENT_TRAFFIC_PARKINGONYELLOWBOX_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_PARKINGSPACEPARKING</td><td>数据为一个 DEV_EVENT_TRAFFIC_PARKINGSPACEPARKING_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_PARKINGSPACENOPARKING</td><td>数据为一个 DEV_EVENT_TRAFFIC_PARKINGSPACENOPARKING_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_PEDESTRAIN</td><td>数据为一个 DEV_EVENT_TRAFFIC_PEDESTRAIN_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_THROW</td><td>数据为一个 DEV_EVENT_TRAFFIC_THROW_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_IDLE</td><td>数据为一个 DEV_EVENT_TRAFFIC_IDLE_INFO 结构体.</td></tr> 
	 * <tr><td>EVENT_IVS_TRAFFIC_ALL</td><td>所有以traffic开头的事件，每个事件对应以上声明的结构体 </td></tr>
	 * </table>
	 * @param pAlarmInfo 接收智能分析事件的信息，根据dwAlarmType值不同，填充的数据不同 
	 * @param pBuffer 智能图片信息 
	 * @param dwBufSize 智能图片信息大小
	 * @param nSequence 表示上传的同一张图片情况，为0时表示是第一次出现，为2表示最后一次出现或仅出现一次，为1表示此次之后还有 
	 * @param reserved int nState=(int*)reserved 表示当前回调数据的状态, 为0表示当前数据为实时数据，为1表示当前回调数据是离线数据，为2时表示离线数据传送结束 
	 * \endif
	 */
	public void invoke(long lAnalyzerHandle, int dwAlarmType, Object pAlarmInfo, 
			byte pBuffer[], int dwBufSize, int nSequence, int reserved);
}

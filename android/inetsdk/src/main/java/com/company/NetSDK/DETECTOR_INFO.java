package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Detector configuration
 * \else
 * 车检器配置
 * \endif
 */
public class DETECTOR_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Breaking info, low bit to high bit means, 0-normal, 1-RunRedLight, 2-OverLine, 3-Retrograde, 4-UnderSpeed, 5-OverSpeed, 6-OverLine, 7-YellowPlateInLane,8-RunYellowLight,9-Illegal Lane Occupation,10-Unfasten seat belt;11-Driver Smoke,12-Driver Call
	 * \else
	 * 类型掩码,从低位到高位依次是：0-正常,1-闯红灯,2-压线,3-逆行,4-欠速,5-超速,6-有车占道,7-黄牌占道 ,8-闯黄灯 ,9-占公交车道, 10-不系安全带, 11-驾驶员抽烟, 12-驾驶员打电话
	 * \endif
	 */
    public int                	nDetectBreaking;                  
    														
	/**
	 * \if ENGLISH_LANG
	 * Coil info
	 * \else
	 * 线圈配置数组
	 * \endif
	 */
    public COILCONFIG_INFO[]    arstCoilCfg = new COILCONFIG_INFO[FinalVar.MAX_COILCONFIG];     
    
	/**
	 * \if ENGLISH_LANG
	 * Road number,	1-16, 0 is not used
	 * \else
	 * 车道号, 1-16 ; 0表示不启用
	 * \endif
	 */
    public int				    nRoadwayNumber;				 
    
	/**
	 * \if ENGLISH_LANG
	 * Road direction,	0-south to north, 1-west south to east north, 2-east, 3-west north to east south, 4-north to south, 5-east north to west south, 6-east to west, 7-east south to west north, 8-ignore
	 * \else
	 * 车道方向（车开往的方向）,	0-南向北, 1-西南向东北, 2-东, 3-西北向东南, 4-北向南, 5-东北向西南, 6-东向西, 7-东南向西北, 8-忽略
	 * \endif
	 */
    public int                  nRoadwayDirection;                
    
	/**
	 * \if ENGLISH_LANG
	 * Gate picture number,0 means not use,1~3,means use this number picture
	 * \else
	 * 卡口图片序号	表示将电警中的某一张图片作为卡口图片（共三张），0表示不采用，1~3,表示采用对应序号的图片
	 * \endif
	 */
    public int                  nRedLightCardNum;                 
    
	/**
	 * \if ENGLISH_LANG
	 * Coil number	1-3
	 * \else
	 * 线圈个数	1-3
	 * \endif
	 */
    public int                  nCoilsNumber;                  
    
	/**
	 * \if ENGLISH_LANG
	 * Operation type, 0-gate and electronical police, 1-electronical police, 2-gate
	 * \else
	 * 业务模式,	0-卡口电警,1-电警,2-卡口
	 * \endif
	 */
    public int                  nOperationType;                    
    
	/**
	 * \if ENGLISH_LANG
	 * Distance between coils, 0-1000, cm
	 * \else
	 * 两两线圈的间隔	范围0-1000，单位为厘米
	 * \endif
	 */
	public int[]                arnCoilsDistance = new int[3];              
	
	/**
	 * \if ENGLISH_LANG
	 * Coils width 0~200, cm
	 * \else
	 * 每个线圈的宽度	0~200cm
	 * \endif
	 */
	public int                  nCoilsWidth;                    
	
	/**
	 * \if ENGLISH_LANG
	 * Small car speed limit. 0~255km/h
	 * \else
	 * 小型车辆速度下限和上限	0~255km/h，不启用大小车限速时作为普通车辆限速
	 * \endif
	 */
	public int[]                arnSmallCarSpeedLimit = new int[2];          
	
	/**
	 * \if ENGLISH_LANG
	 * Big car speed limit. 0~255km/h 
	 * \else
	 * 大型车辆速度下限和上限	0~255km/h，启用大小车限速时有效
	 * \endif
	 */
	public int[]				arnBigCarSpeedLimit = new int[2];          
	
	/**
	 * \if ENGLISH_LANG
	 * Over speed margin, km/h
	 * \else
	 * 限高速宽限值	单位：km/h
	 * \endif
	 */
	public int				    nOverSpeedMargin;			   
	
	/**
	 * \if ENGLISH_LANG
	 * Big car over speed margin, km/h 
	 * \else
	 * 大车限高速宽限值	单位：km/h，启用大小车限速时有效
	 * \endif
	 */
	public int                  nBigCarOverSpeedMargin;           
	
	/**
	 * \if ENGLISH_LANG
	 * Under speed margin, km/h
	 * \else
	 * 限低速宽限值	单位：km/h
	 * \endif
	 */
	public int				    nUnderSpeedMargin;			     
	
	/**
	 * \if ENGLISH_LANG
	 * Big car under speed margin, km/h 
	 * \else
	 * 大车限低速宽限值	单位：km/h，启用大小车限速时有效
	 * \endif
	 */
	public int                  nBigCarUnderSpeedMargin;           
	
	/**
	 * \if ENGLISH_LANG
	 * Big and small car speed limimt enable
	 * \else
	 * 是否启用大小车限速
	 * \endif
	 */
	public boolean              bSpeedLimitForSize;               
	
	/**
	 * \if ENGLISH_LANG
	 * Mask retrograde enable
	 * \else
	 * 逆行是否视为行为
	 * \endif
	 */
	public boolean			    bMaskRetrograde;				     
	
	/**
	 * \if ENGLISH_LANG
	 * DrivingDirection: for example,"Approach" means driving direction,where the car is more near;"Leave"-means where if mor far to the car,The scend and third param means the location of the driving direction, Overspeed  percentage, Snapshot taken when exceed speed limit
	 * \else
	 * "DrivingDirection" : 行驶方向, "Approach"-上行，即车辆离设备部署点越来越近；"Leave"-下行，即车辆离设备部署点越来越远，第二和第三个参数分别代表上行和,下行的两个地点，UTF-8编码
	 * \endif
	 */
	public byte[][]             szDrivingDirection = new byte[3][FinalVar.MAX_DRIVINGDIRECTION]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Overspeed  percentage, Snapshot taken when exceed speed limit
	 * \else
	 * 超速百分比，超过限速百分比后抓拍
	 * \endif
	 */
	public int                  nOverPercentage;                  
	
	/**
	 * \if ENGLISH_LANG
	 * Detailed plan Index. Refer to pack environment local.png for definition. The working area is depending on the string of {@link CFG_TRAFFICSNAPSHOT_INFO#abSchemeRange}.
	 * \else
	 * 具体的方案Index,具体方案含义参参考打包环境local.png;根据{@link CFG_TRAFFICSNAPSHOT_INFO#abSchemeRange}.字段区分作用范围
	 * \endif
	 */
	public int                  nCarScheme;                       
	
	/**
	 * \if ENGLISH_LANG
	 * Same as above, For none ANPR (Auto Plate Number Recognition)use only
	 * \else
	 * 同上，非卡口使用
	 * \endif
	 */
	public int                  nSigScheme;                       
	
	/**
	 * \if ENGLISH_LANG
	 * The validity of lane, can only capture is valid
	 * \else
	 * 车道是否有效，只有有效时才抓拍
	 * \endif
	 */
	public boolean              bEnable;                          
	
	/**
	 * \if ENGLISH_LANG
	 * Yellow plate max and min speed, range 0~255km/h
	 * \else
	 * 黄牌车限速上限和下限, 范围0~255km/h
	 * \endif
	 */
	public int[]				nYellowSpeedLimit = new int[2];			 
	
	/**
	 * \if ENGLISH_LANG
	 * Working section 0 normal 1 high way
	 * \else
	 * 工作路段 0 普通公路 1 高速公路
	 * \endif
	 */
	public int				    nRoadType;						
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot mode, 0-all snapshot, 1-overspeed, 2-retrogradation snapshot
	 * \else
	 * 抓拍模式 0-全部抓拍 1-超速抓拍 2-逆向抓拍
	 * \endif
	 */
	public int				    nSnapMode;						 
	
	/**
	 * \if ENGLISH_LANG
	 * Delay snapshot scheme, 0-make DelaySnapshotDistance, 1-use DelayTime
	 * \else
	 * 延时抓拍方案, 0-使DelaySnapshotDistance，1-使用DelayTime
	 * \endif
	 */
	public int                  nDelayMode;						
	
	/**
	 * \if ENGLISH_LANG
	 * Delay snapshot time run red light 3rd snapshot location distance to last coil time, unit is ms
	 * \else
	 * 延时抓拍时间 闯红灯第三张抓拍位置距离最后一个线圈的时间，单位毫秒
	 * \endif
	 */
	public int                  nDelayTime;						 
	
	/**
	 * \if ENGLISH_LANG
	 * Trigger mode,  0-in coil trigger, 1-out coil trigger, 2-exit/enter snapshot, 3-off
	 * \else
	 * 触发模式 , 0-入线圈触发, 1-出线圈触发, 2-出入都抓拍, 3-关闭
	 * \endif
	 */
	public int				    nTriggerMode;					 
	
	/**
	 * \if ENGLISH_LANG
	 * Speed error, in coil 2 and in coil 3 speed different, if actual different is greater than this value, then speed is invalid, otherwise use average speed 0-20
	 * \else
	 * 速度误差值，进线圈2与进线圈3之间的速度误差值，若实际误差大于或等于该值，视速度无效，否则取平均速度 0-20
	 * \endif
	 */
	public int			        nErrorRange;						
	
	/**
	 * \if ENGLISH_LANG
	 * Speed calibration coefficient, as measured value times this coefficient 
	 * \else
	 * 速度校正系数，即速度值为测出的值乘以该系数 
	 * \endif
	 */
	public double			    dSpeedCorrection;				
	
	/**
	 * \if ENGLISH_LANG
	 * Corresponding lane directionneed to report vehicle direction,nDirection[0] 0--null 1--right ; nDirection[1] 0--null 1--opposite	
	 * \else
	 * 相对车道方向需要上报车辆行驶方向,nDirection[0] 0--空 1--正向 ; nDirection[1] 0--空 1--反向	
	 * \endif
	 */
	public int[]                nDirection = new int[2];                   
	
	/**
	 * \if ENGLISH_LANG
	 * self defined parking space number(for parking)
	 * \else
	 * 自定义车位号（停车场用）
	 * \endif
	 */
	public byte[]               szCustomParkNo = new byte[FinalVar.CFG_COMMON_STRING_32 + 1]; 
	
	public DETECTOR_INFO() {
		for(int i=0; i<FinalVar.MAX_COILCONFIG; i++) {
			arstCoilCfg[i] = new COILCONFIG_INFO();
		}
	}
}

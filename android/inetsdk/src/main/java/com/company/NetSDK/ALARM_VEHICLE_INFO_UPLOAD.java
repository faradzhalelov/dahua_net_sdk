package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * vehicle info uploading, the corresponding interface {@link INetSDK#QueryDevState},the corrseponding command {@link FinalVar#SDK_DEVSTATE_VIHICLE_INFO_UPLOAD}
 * \else
 * 车载自定义信息上传, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_VIHICLE_INFO_UPLOAD}
 * \endif
 */
public class ALARM_VEHICLE_INFO_UPLOAD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * type: DriverCheck ,Driver check in or check out
	 * \else
	 * 信息类别: DriverCheck：司机签入签出
	 * \endif
	 */
	public byte                szType[] = new byte[FinalVar.SDK_VEHICLE_TYPE_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Check in, Check out
	 * \else
	 * 签入：CheckIn、签出：CheckOut  
	 * \endif
	 */
	public byte                szCheckInfo[] = new byte[FinalVar.SDK_VEHICLE_INFO_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Driver NO. string
	 * \else
	 * 司机工号字符串
	 * \endif
	 */
	public byte                szDirverNO[] = new byte[FinalVar.SDK_VEHICLE_DRIVERNO_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * 报警发生时间
	 * \endif
	 */
	public SDKDEVTIME           stTime = new SDKDEVTIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * 0-real time 1-to fill 
	 * \else
	 * 0-实时 1-补传 
	 * \endif
	 */
	public byte                bOffline;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device software version information. Corresponding to interface {@link INetSDK#QueryDevState}
 * \else
 * 设备软件版本信息，对应接口 {@link INetSDK#QueryDevState}
 * \endif
 */
public class SDKDEV_VERSION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * SN
	 * \else
	 * 序列号
	 * \endif
	 */
	public byte				szDevSerialNo[] = new byte[FinalVar.SDK_DEV_SERIALNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device type. See enumeration {@link NET_DEVICE_TYPE}. Please refer to {@link SDKDEV_SYSTEM_ATTR_CFG}  
	 * \else
	 * 设备类型，见枚举 {@link NET_DEVICE_TYPE},参见 {@link SDKDEV_SYSTEM_ATTR_CFG} 
	 * \endif
	 */
	public byte				byDevType;
	
	/**
	 * \if ENGLISH_LANG
	 * Device detailed type. String format. It may bu null.
	 * \else
	 * 设备详细型号，字符串格式，可能为空
	 * \endif
	 */
	public byte				szDevType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Protocol version No. 
	 * \else
	 * 协议版本号
	 * \endif
	 */
	public int				nProtocalVer;
	
	/**
	 * \if ENGLISH_LANG
	 * Software version 
	 * \else
	 * 软件版本 
	 * \endif
	 */
	public byte				szSoftWareVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Software version build date 
	 * \else
	 * 软件版本编译日期
	 * \endif
	 */
	public int				dwSoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Dsp software version 
	 * \else
	 * 从片版本信息，字符串格式，可能为空
	 * \endif
	 */
	public byte				szPeripheralSoftwareVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Dsp software version build date 
	 * \else
	 * 从片版本编译日期
	 * \endif
	 */
	public int				dwPeripheralSoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Not in use now 
	 * \else
	 * 地理信息定位芯片版本信息，字符串格式，可能为空
	 * \endif
	 */
	public byte				szGeographySoftwareVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 地理信息定位芯片版本编译日期
	 * \endif
	 */
	public int				dwGeographySoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Hadrware version 
	 * \else
	 * 硬件版本
	 * \endif
	 */
	public byte				szHardwareVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Not in use now 
	 * \else
	 * 现在没有使用 
	 * \endif
	 */
	public int				dwHardwareDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Web version 
	 * \else
	 * web版本 
	 * \endif
	 */
	public byte				szWebVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Web version build date 
	 * \else
	 * web版本编译日期 
	 * \endif
	 */
	public int				dwWebBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Device detailed type. String format. It may be null.
	 * \else
	 * 设备详细型号,字符串格式,可能为空
	 * \endif
	 */
	public byte[]			szDetailType = new byte[FinalVar.MAX_COMMON_STRING_64];
}

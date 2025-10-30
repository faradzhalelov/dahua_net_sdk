package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#SnapPictureToFile} port input parameter
* \else
* {@link INetSDK#SnapPictureToFile} 接口输入参数
* \endif
*/
public class NET_IN_SNAP_PIC_TO_FILE_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * snapshot parameter, mode field is only snapshot for once, fail to support timed or continuous snapshot; except mobile DVR, other devices only support snapshot frequency of one snapshot per second
	 * \else
	 * 抓图参数, 其中mode字段仅一次性抓图, 不支持定时或持续抓图; 除了车载DVR, 其他设备仅支持每秒一张的抓图频率
	 * \endif
	 */
	public SNAP_PARAMS stuParam = new SNAP_PARAMS();               
	
	 /**
	 * \if ENGLISH_LANG
	 * write in file address
	 * \else
	 * 写入文件的地址
	 * \endif
	 */
	public byte        szFilePath[] = new byte[FinalVar.MAX_PATH];   
}

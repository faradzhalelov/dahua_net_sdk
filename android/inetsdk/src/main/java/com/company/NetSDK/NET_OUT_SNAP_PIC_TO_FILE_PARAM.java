package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#SnapPictureToFile} port output parameter
* \else
* {@link INetSDK#SnapPictureToFile} 接口输出参数
* \endif
*/
public class NET_OUT_SNAP_PIC_TO_FILE_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * picture content, user memory allocation, memory size is dwPicBufLen
	 * \else
	 * 图片内容,用户分配内存
	 * \endif
	 */
	public byte      szPicBuf[];               
	
	 /**
	 * \if ENGLISH_LANG
	 * picture content memory size, unit: byte
	 * \else
	 * 图片内容内存大小, 单位:字节
	 * \endif
	 */
	public int       dwPicBufLen;            
	
	 /**
	 * \if ENGLISH_LANG
	 * returned picture size, unit:byte
	 * \else
	 * 返回的图片大小, 单位:字节
	 * \endif
	 */
	public int       dwPicBufRetLen;         
	
	public NET_OUT_SNAP_PIC_TO_FILE_PARAM(int nBufMax) {
		dwPicBufLen = nBufMax;
		szPicBuf = new byte[dwPicBufLen];
	}
}

package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* event type, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_UPLOAD_PIC_FAILED} (break rules data upload failed) data description
* \else
* 事件类型, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_UPLOAD_PIC_FAILED} (数据上传失败事件)对应的数据描述信息
* \endif
*/
public class ALARM_UPLOAD_PIC_FAILED_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * 0:upload failed, 1:upload success after failed
	 * \else
	 * 0:检测到数据上传失败, 1:数据上传失败后第一次上传成功
	 * \endif
	 */
	public int                      nAction;                        
}

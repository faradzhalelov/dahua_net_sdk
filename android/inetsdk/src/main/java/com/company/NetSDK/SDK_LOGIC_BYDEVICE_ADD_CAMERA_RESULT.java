package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * result info.
 * \else
 * 添加视频源结果信息
 * \endif
 */
public class SDK_LOGIC_BYDEVICE_ADD_CAMERA_RESULT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;       
	
	/**
	 * \if ENGLISH_LANG
	 * UniqueChannel
	 * \else
	 * 统一编号
	 * \endif
	 */
	public               int                nUniqueChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * FaileCode 0-Success,  1-unsupport
	 * \else
	 * 失败码，0 - 成功，  1 - 通道不支持设置.
	 * \endif
	 */
	public               int                nFailedCode;

}

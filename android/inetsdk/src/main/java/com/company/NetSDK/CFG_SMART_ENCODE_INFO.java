package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Smart H264 encode, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_SMART_ENCODE}
 * \else
 * 新增Smart264 编码方式, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_SMART_ENCODE}
 * \endif
 */
public class CFG_SMART_ENCODE_INFO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * is key set of SmartH264
	 * \else
	 * 标识是否开启SmartH264
	 * \endif
	 */
	public boolean 		bSmartH264;

	@Override
	public String toString() {
		return "CFG_SMART_ENCODE_INFO{" +
				"bSmartH264=" + bSmartH264 +
				'}';
	}
}

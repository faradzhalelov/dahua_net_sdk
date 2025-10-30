package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 485 Decoder Configuration
 * \else
 * 485解码器配置
 * \endif
 */
public class SDK_485_CFG implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Com Attributes
	 * \else
	 * 串口属性
	 * \endif
	 */
	public SDK_COMM_PROP        struComm = new SDK_COMM_PROP();
	
	/**
	 * \if ENGLISH_LANG
	 * Protocol type,corresponding to the subscriptof "Protocol List(Refer to {@link SDKDEV_COMM_CFG})
	 * \else
	 * 协议类型，对应"协议名列表(参考 {@link SDKDEV_COMM_CFG})下标
	 * \endif
	 */
	public byte                wProtocol;
	
	/**
	 * \if ENGLISH_LANG
	 * 0-Compatible,local PTZ 1-Remote network PTZ({@link DEV_ENCODER_CFG})
	 * \else
	 * 0-兼容，本地云台 1-远程网络云台,通过能力查询({@link DEV_ENCODER_CFG}) 
	 * \endif
	 */
	public byte                bPTZType;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder Address；0 - 255
	 * \else
	 * 解码器地址；0 - 255 
	 * \endif
	 */
	public byte                wDecoderAddress;
	
	/**
	 * \if ENGLISH_LANG
	 * Martix ID
	 * \else
	 * 矩阵号
	 * \endif
	 */
	public byte                byMartixID;
}

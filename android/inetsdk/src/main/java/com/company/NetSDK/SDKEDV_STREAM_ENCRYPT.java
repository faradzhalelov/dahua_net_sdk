package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * stream encrypt configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_STREAM_ENCRYPT_CFG}
 * \else
 * 码流加密配置信息, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_STREAM_ENCRYPT_CFG}
 * \endif
 */
public class SDKEDV_STREAM_ENCRYPT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * encrypt algorithm type:00: AES,01:DES,02: 3DES
	 * \else
	 * 加密算法类型：00: AES、01:DES、02: 3DES
	 * \endif
	 */
	public byte                    byEncrptAlgoType;

	/**
	 * \if ENGLISH_LANG
	 * encrypt algorithm param
	 * \else
	 * 加密算法参数
	 * \endif
	 */
	public ALGO_PARAM_INFO         stuEncrptAlgoparam = new ALGO_PARAM_INFO();

	/**
	 * \if ENGLISH_LANG
	 * each channel's encrypt key's info
	 * \else
	 * 各通道的密钥信息
	 * \endif
	 */
	public ENCRYPT_KEY_INFO        stuEncryptKeys[] = new ENCRYPT_KEY_INFO[32];

	/**
	 * \if ENGLISH_LANG
	 * encrpt plan enable
	 * \else
	 * 加密计划使能
	 * \endif
	 */
	public byte                    byEncrptPlanEnable;

	/**
	 * \if ENGLISH_LANG
	 * encrpt plan beginning time
	 * \else
	 * 加密计划的开始时间
	 * \endif
	 */
	public NET_TIME                stuPreTime = new NET_TIME();
    
    public SDKEDV_STREAM_ENCRYPT() {
    	for (int i = 0; i < 32; i++) {
    		stuEncryptKeys[i] = new ENCRYPT_KEY_INFO();
    	}
    }
}

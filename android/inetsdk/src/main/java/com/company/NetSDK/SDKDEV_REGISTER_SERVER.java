package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Auto register service
 * \else
 * 主动注册服务
 * \endif
 */
public class SDKDEV_REGISTER_SERVER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Max IP amount supported.
	 * \else
	 * 支持的最大ip数
	 * \endif
	 */
	public byte                bServerNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Registration server IP, port info.
	 * \else
	 * 注册服务器ip，端口信息.
	 * \endif
	 */
	public SDKDEV_SERVER_INFO   lstServer[] = new SDKDEV_SERVER_INFO[FinalVar.SDK_MAX_REGISTER_SERVER_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * 使能
	 * \endif
	 */
    public byte                bEnable;
    
    /**
	 * \if ENGLISH_LANG
	 * Device ID
	 * \else
	 * 设备id
	 * \endif
	 */
    public byte                szDeviceID[] = new byte[32];
    
    public SDKDEV_REGISTER_SERVER() {
    	for (int i = 0; i < FinalVar.SDK_MAX_REGISTER_SERVER_NUM; i++) {
    		lstServer[i] = new SDKDEV_SERVER_INFO();
    	}
    }
}

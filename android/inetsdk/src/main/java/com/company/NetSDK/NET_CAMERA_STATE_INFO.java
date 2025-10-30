package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * camera channel info
 * \else
 * 摄像机通道信息
 * \endif
 */
public class NET_CAMERA_STATE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * camera channel number, -1 means invalid channel number
	 * \else
	 * 摄像机通道号, -1表示通道号无效
	 * \endif
	 */
    public int                     nChannel;           
    
    /**
     * \if ENGLISH_LANG
     * connection state, refer to {@link EM_CAMERA_STATE_TYPE}
     * \else
     * 连接状态, 取值参考 {@link EM_CAMERA_STATE_TYPE}
     * \endif
     */
    public int                     emConnectionState;  
}

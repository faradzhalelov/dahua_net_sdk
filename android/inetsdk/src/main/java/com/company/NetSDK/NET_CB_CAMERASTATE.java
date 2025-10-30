package com.company.NetSDK;

import java.io.Serializable;

public class NET_CB_CAMERASTATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * channel
	 * \else
	 * 通道
	 * \endif
	 */
	public int                 nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * connect state, see {@link CONNECT_STATE}
	 * \else
	 * 连接状态，查看 {@link CONNECT_STATE}
	 * \endif
	 */
    public int                 emConnectState;
}

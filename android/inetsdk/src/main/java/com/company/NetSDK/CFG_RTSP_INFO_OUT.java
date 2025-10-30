package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * RTSP Configuration Structure
 * \else
 * RTSP的配置结构体
 * \endif
 */
public class CFG_RTSP_INFO_OUT implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * 整个功能是否使能
	 * \endif
	 */
	public boolean 			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * RTSP Port 
	 * \else
	 * RTSP服务端口
	 * \endif
	 */
	public int				nPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * Rtp Start Port 
	 * \else
	 * RTP起始端口
	 * \endif
	 */
	public int				nRtpStartPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * nRtp End Port 
	 * \else
	 * RTP结束端口
	 * \endif
	 */
	public int				nRtpEndPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * RtspOverHttp Enable 
	 * \else
	 * RtspOverHttp使能
	 * \endif
	 */
	public boolean			bHttpEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * RtspOverHttp Port 
	 * \else
	 * RtspOverHttp端口
	 * \endif
	 */
	public int				nHttpPort;
}

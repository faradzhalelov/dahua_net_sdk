package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * decoder tour configuration
 * \else
 * 解码轮巡配置
 * \endif
 */
public class SDKDEV_DECODER_TOUR_SINGLE_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Front-end device's ip.Such as"10.7.5.21". Support retention of the domain name, end by '\0'.
	 * \else
	 * 前端设备ip.例如"10.7.5.21". 保留对域名的支持.需要以'\0'结束.
	 * \endif
	 */
	public byte        szIP[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Front-end device's port.(0, 65535).
	 * \else
	 * 前端设备端口.(0, 65535).
	 * \endif
	 */
	public int         nPort;

	/**
	 * \if ENGLISH_LANG
	 * front-end device's Request channel [1, 16].
	 * \else
	 * 请求前端设备通道[1, 16].
	 * \endif
	 */
	public int         nPlayChn;

	/**
	 * \if ENGLISH_LANG
	 * front-end device's Stream type, 0:main; 1:sub.
	 * \else
	 * 请求前端码流类型, 0:主码流; 1:辅码流.
	 * \endif
	 */
	public int         nPlayType;

	/**
	 * \if ENGLISH_LANG
	 * front-end device's user name,end by '\0'.
	 * \else
	 * 登陆前端设备的用户名,需要以'\0'结束.
	 * \endif
	 */
	public byte        szUserName[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * front-end device's Password,end by '\0'.
	 * \else
	 * 登陆前端设备的密码,需要以'\0'结束.
	 * \endif
	 */
	public byte        szPassword[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * Round tour interval [10, 120],s.
	 * \else
	 * 轮巡间隔时间[10, 120],单位秒.
	 * \endif
	 */
	public int         nInterval;

	/**
	 * \if ENGLISH_LANG
	 * device's factory, enum see {@link IPC_TYPE}
	 * \else
	 * 目标设备厂商, 枚举 详见 {@link IPC_TYPE}
	 * \endif
	 */
	public int       nManuFactory;

	/**
	 * \if ENGLISH_LANG
	 * device's http port
	 * \else
	 * 目标设备的端口(Http端口)
	 * \endif
	 */
	public int        nHttpPport;

	/**
	 * \if ENGLISH_LANG
	 * device's rtsp port
	 * \else
	 * 目标设备的端口(Rtsp端口)
	 * \endif
	 */
	public int        nRtspPort;

	/**
	 * \if ENGLISH_LANG
	 * service type -1:auto,0:TCP;1:UDP;2:Multicast
	 * \else
	 * 服务类型, -1: auto, 0：TCP；1：UDP；2：组播
	 * \endif
	 */
	public byte        byServiceType;
}

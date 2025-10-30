package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Encoder information
 * \else
 * 连接的编码器信息
 * \endif
 */
public class DEV_ENCODER_INFO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * IP address of Front-end DVR 
	 * \else
	 * 前端DVR的IP地址
	 * \endif
	 */
	public byte			szDevIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port of Front-end DVR
	 * \else
	 * 前端DVR的端口号
	 * \endif
	 */
	public int				wDevPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder channel enable
	 * \else
	 * 解码通道使能
	 * \endif
	 */
	public byte			bDevChnEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * The corresponding channel number decoder
	 * \else
	 * 对应解码通道号
	 * \endif
	 */
	public byte			byDecoderID;
	
	/**
	 * \if ENGLISH_LANG
	 * User Name
	 * \else
	 * 用户名
	 * \endif
	 */
	public byte			szDevUser[] = new byte[FinalVar.SDK_USER_NAME_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * 密码
	 * \endif
	 */
	public byte			szDevPwd[]	= new byte[FinalVar.SDK_USER_PSW_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Channel Number
	 * \else
	 * 通道号
	 * \endif
	 */
	public int				nDevChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Stream type; 0:Main Stream, 1:Sub-stream
	 * \else
	 * 码流类型，0：主码流；1：辅码流1; 2:snap; 3: 辅码流2
	 * \endif
	 */
	public int				nStreamType;
	
	/**
	 * \if ENGLISH_LANG
	 * -1: auto, 0:TCP, 1:UDP, 2:Multicast
	 * \else
	 * -1: auto, 0：TCP；1：UDP；2：组播
	 * \endif
	 */	
	public byte			byConnType;
	
	/**
	 * \if ENGLISH_LANG
	 * 0:Direct Connect, 1:transmit
	 * \else
	 * 0：直连；1：转发
	 * \endif
	 */
	public byte			byWorkMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Listening port services, for transmit
	 * \else
	 * 指示侦听服务的端口，转发时有效
	 * \endif
	 */
	public int				wListenPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Protocol type
	 * 0:compatible with each other
	 * 1:private 2nd protocol
	 * 2:private system integration protocol
	 * 3:private DSS protocol
	 * 4:private rtsp protocol
	 * \else
	 * 协议类型
	 * 0:兼容以前
	 * 1:私有二代协议
	 * 2:私有系统集成协议
	 * 3:私有DSS协议
	 * 4:私有rtsp协议
	 * \endif
	 */
	public int				dwProtoType;
																
	/**
	 * \if ENGLISH_LANG
	 * Front device name
	 * \else
	 * 前端设备名称
	 * \endif
	 */
	public byte			szDevName[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * video source type:0-SD,1-HD	
	 * \else
	 * 该解码通道当前视频源类型:0-标清(SD),1-高清(HD),注:设备支持高清通道才有效		
	 * \endif
	 */
	public byte            byVideoInType;
	
	/**
	 * \if ENGLISH_LANG
	 * szDevIp extended, IP or domain name
	 * \else
	 * szDevIp扩展，前端DVR的IP地址(可以输入域名)
	 * \endif
	 */
	public byte			szDevIpEx[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * snap mode(when nStreamType==2 effective) 0:That request a frame,1:Time to send a request
	 * \else
	 * 抓图模式(nStreamType==2时有效) 0：表示请求一帧,1：表示定时发送请求
	 * \endif
	 */
	public byte            bySnapMode;
	
	/**
	 * \if ENGLISH_LANG
	 * The target device manufacturers,See the enum struct EM_IPC_TYPE
	 * \else
	 * 目标设备的生产厂商,具体参考EM_IPC_TYPE类
	 * \endif
	 */
	public byte            byManuFactory;
	
	/**
	 * \if ENGLISH_LANG
	 * The target device's device type,0:IPC
	 * \else
	 * 目标设备的设备类型,0:IPC
	 * \endif
	 */
	public byte            byDeviceType;
	
	/**
	 * \if ENGLISH_LANG
	 * The target device's decode policy
	 * 0:LatencyLevel3 1:LatencyLevel2
	 * 2:LatencyLevel1 3:MiddleLevel
	 * 4:FluencyLevel3 5:FluencyLevel2
	 * 6:FluencyLevel1
	 * \else
	 * 目标设备的解码策略
	 * 0:兼容以前
	 * 1:实时等级高 
	 * 2:实时等级中
	 * 3:实时等级低
	 *  4:默认等级
	 *  5:流畅等级高 
	 *  6:流畅等级中
	 *  7:流畅等级低
	 * \endif
	 */
	public byte            byDecodePolicy;
	
	/**
	 * \if ENGLISH_LANG
	 * http port 0-65535
	 * \else
	 * Http端口号,0-65535
	 * \endif
	 */
	public int             dwHttpPort;
	
	/**
	 * \if ENGLISH_LANG
	 * RTSP port 0-65535
	 * \else
	 * Rtsp端口号,0-65535
	 * \endif
	 */
	public int             dwRtspPort;
	
	/**
	 * \if ENGLISH_LANG
	 * remote channel name
	 * \else
	 * 远程通道名称, 只有读取到的名称不为空时才可以修改该通道的名称
	 * \endif
	 */
	public byte			szChnName[] = new byte[32];
}

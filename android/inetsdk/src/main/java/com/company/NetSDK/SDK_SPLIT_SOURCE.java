package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Display source
 * \else
 * 显示源
 * \endif
 */
public class SDK_SPLIT_SOURCE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * 使能
	 * \endif
	 */
	public boolean			    bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * IP, null means there is no setup.
	 * \else
	 * IP, 空表示没有设置
	 * \endif
	 */
	public byte			    szIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * User name
	 * \else
	 * 用户名
	 * \endif
	 */
	public byte			    szUser[] = new byte[FinalVar.SDK_USER_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * 密码
	 * \endif
	 */
	public byte			    szPwd[] = new byte[FinalVar.SDK_USER_PSW_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Port
	 * \else
	 * 端口
	 * \endif
	 */
	public int			    	nPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * 通道号
	 * \endif
	 */
	public int				    nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Video bit stream. -1-auto, 0-main stream, 1-extra stream 1, 2-extra stream 2, 3-extra stream 3
	 * \else
	 * 视频码流, -1-自动, 0-主码流, 1-辅码流1, 2-辅码流2, 3-辅码流3, 4-snap, 5-预览
	 * \endif
	 */
	public int				    nStreamType;
	
	/**
	 * \if ENGLISH_LANG
	 * Definition, 0-standard definition, 1-high definition
	 * \else
	 * 清晰度, 0-标清, 1-高清
	 * \endif
	 */
	public int				    nDefinition;
	
	/**
	 * \if ENGLISH_LANG
	 * Protocol type， value corresponding to {@link SDK_DEVICE_PROTOCOL}
	 * \else
	 * 协议类型. 值对应类 {@link SDK_DEVICE_PROTOCOL}
	 * \endif
	 */
	public int					emProtocol;
	
	/**
	 * \if ENGLISH_LANG
	 * Device name
	 * \else
	 * 设备名称
	 * \endif
	 */
	public byte			    szDevName[] = new byte[FinalVar.SDK_DEVICE_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Video input channel amount
	 * \else
	 * 视频输入通道数
	 * \endif
	 */
	public int					nVideoChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio input channel amount
	 * \else
	 * 音频输入通道数
	 * \endif
	 */
	public int					nAudioChannel;

	/**
	 * \if ENGLISH_LANG
	 * Decoder or not.
	 * \else
	 * 是否是解码器
	 * \endif
	 */
	public boolean				bDecoder;
	
	/**
	 * \if ENGLISH_LANG
	 * 0:TCP;1:UDP;2:multicast
	 * \else
	 * -1: auto, 0：TCP；1：UDP；2：组播
	 * \endif
	 */
	public byte				byConnType;
	
	/**
	 * \if ENGLISH_LANG
	 * 0:connect directly; 1:transfer 
	 * \else
	 * 0：直连；1：转发
	 * \endif
	 */
	public byte				byWorkMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Isten port, valid with transfer; when byConnType is multicast, it is multiport
	 * \else
	 * 指示侦听服务的端口，转发时有效; byConnType为组播时，则作为多播端口
	 * \endif
	 */
	public int				wListenPort;
	
	/**
	 * \if ENGLISH_LANG
	 * SzDevIp extension, front DVR Ip address (enter domain name)
	 * \else
	 * szDevIp扩展，前端DVR的IP地址(可以输入域名)
	 * \endif
	 */
	public byte				szDevIpEx[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot mode (valid when nStreamType==4) 0: request for single frame, 1: sechdule sending request
	 * \else
	 * 抓图模式(nStreamType==4时有效) 0：表示请求一帧,1：表示定时发送请求
	 * \endif
	 */
	public byte				bySnapMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Target device manufacturer. Refer to {@link EM_IPC_TYPE} for detailed information.
	 * \else
	 * 目标设备的生产厂商, 具体参考{@link EM_IPC_TYPE}
	 * \endif
	 */
	public byte				byManuFactory;
	
	/**
	 * \if ENGLISH_LANG
	 * Target device type, 0:IPC
	 * \else
	 * 目标设备的设备类型, 0:IPC
	 * \endif
	 */
	public byte				byDeviceType;
	
	/**
	 * \if ENGLISH_LANG
	 * Target device decode policy, 0:compatible with previous  
	 * 1:real time level high 2: real time level medium
	 * 3: real time level low 4: default level 
	 * 5: fluency level high 6: fluency level medium
	 * 7: fluency level low
	 * \else
	 * 目标设备的解码策略, 0:兼容以前	
	 * 1:实时等级高  2:实时等级中	
	 * 3:实时等级低  4:默认等级	
	 * 5:流畅等级高  6:流畅等级中	
	 * 7:流畅等级低
	 * \endif
	 */
	public byte				byDecodePolicy;
	
	/**
	 * \if ENGLISH_LANG
	 * Http port number, 0-65535
	 * \else
	 * Http端口号, 0-65535
	 * \endif
	 */
	public int					dwHttpPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Rtsp port number, 0-65535
	 * \else
	 * Rtsp端口号, 0-65535
	 * \endif
	 */
	public int					dwRtspPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote channel name, modifiable only when name read is not vacant
	 * \else
	 * 远程通道名称, 只有读取到的名称不为空时才可以修改该通道的名称
	 * \endif
	 */
	public byte				szChnName[] = new byte[FinalVar.SDK_DEVICE_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Multicast IP address. Valid only when byConnType is multicast
	 * \else
	 * 多播IP地址, byConnType为组播时有效
	 * \endif
	 */
	public byte				szMcastIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device ID, ""-null, "Local"  "Remote"
	 * \else
	 * 设备ID, ""-null, "Local"-本地通道, "Remote"-远程通道, 或者填入具体的RemoteDevice中的设备ID
	 * \endif
	 */
	public byte				szDeviceID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Is remote channel or not(read only)
	 * \else
	 * 是否远程通道(只读)
	 * \endif
	 */
	public boolean				bRemoteChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote channel ID (read only), effective when bRemoteChannel=TRUE
	 * \else
	 * 远程通道ID(只读), bRemoteChannel=TRUE时有效
	 * \endif
	 */
	public int 				nRemoteChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Type of device, such as IPC, DVR, NVR and so on
	 * \else
	 * 设备类型, 如IPC, DVR, NVR等
	 * \endif
	 */
	public byte				szDevClass[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device specific type, such as IPC-HF3300
	 * \else
	 * 设备具体型号, 如IPC-HF3300
	 * \endif
	 */
	public byte				szDevType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Main stream url, effective when byManuFactory = SDK_IPC_OTHER
	 * \else
	 * 主码流url地址, byManuFactory为 SDK_IPC_OTHER时有效
	 * \endif
	 */
	public byte				szMainStreamUrl[] = new byte[FinalVar.MAX_PATH];
	
	/**
	 * \if ENGLISH_LANG
	 * Extra stream url, effective when byManuFactory = SDK_IPC_OTHER
	 * \else
	 * 辅码流url地址, byManuFactory为 SDK_IPC_OTHER 时有效
	 * \endif
	 */
	public byte				szExtraStreamUrl[] = new byte[FinalVar.MAX_PATH];
	
	/**
	 * \if ENGLISH_LANG
	 * Unique channel ID, read only
	 * \else
	 * 设备内统一编号的唯一通道号, 只读
	 * \endif
	 */
	public int					nUniqueChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Ssascade authemyication, effective when device ID = Local/Cascade/SerialNo,  SerialNo is device seral no.
	 * \else
	 * 级联认证信息, 设备ID为Local/Cascade/SerialNo时有效, 其中SerialNo是设备序列号
	 * \endif
	 */
	public SDK_CASCADE_AUTHENTICATOR stuCascadeAuth = new SDK_CASCADE_AUTHENTICATOR();
	
	/**
	 * \if ENGLISH_LANG
	 * 0-normal video source, 1- alarm video source
	 * \else
	 * 0-普通视频源, 1-报警视频源
	 * \endif
	 */
	public int                 nHint; 
	
	/**
	 * \if ENGLISH_LANG
	 * back main stream address quantity
	 * \else
	 * 备用主码流地址数量
	 * \endif
	 */
	public int                 nOptionalMainUrlCount; 
	
	/**
	 * \if ENGLISH_LANG
	 * backup main stream address list
	 * \else
	 * 备用主码流地址列表
	 * \endif
	 */
	public byte                szOptionalMainUrls[][] = new byte[FinalVar.SDK_MAX_OPTIONAL_URL_NUM][FinalVar.MAX_PATH]; 
	
	/**
	 * \if ENGLISH_LANG
	 * backup sub stream address quantity
	 * \else
	 * 备用辅码流地址数量
	 * \endif
	 */
	public int                 nOptionalExtraUrlCount; 
	
	/**
	 * \if ENGLISH_LANG
	 * backup sub stream address list
	 * \else
	 * 备用辅码流地址列表
	 * \endif
	 */
	public byte                szOptionalExtraUrls[][] = new byte[FinalVar.SDK_MAX_OPTIONAL_URL_NUM][FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 * tour time intertval	unit：second
	 * \else
	 * 轮巡时间间隔	单位：秒
	 * \endif
	 */
	public int                 nInterval;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 用户名
	 * \endif
	 */
	public byte                szUserEx[] = new byte[FinalVar.SDK_NEW_USER_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 密码
	 * \endif
	 */
	public byte                szPwdEx[] = new byte[FinalVar.SDK_NEW_USER_PSW_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * type of pushstream,effective when byConnType is TCP-Push or UDP-Push 
	 * \else
	 * 推流方式的码流类型,只有byConnType为TCP-Push或UDP-Push才有该字段
	 * \endif
	 * @see EM_SRC_PUSHSTREAM_TYPE
	 */
	public int 				   emPushStream;           

}

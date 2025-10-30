package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Public security 1 platform input config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_VSP_GAYS}
 * \else
 * 平台接入配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_VSP_GAYS}
 * \endif
 */
public class CFG_VSP_GAYS_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 *  Enable or not
	 * \else
	 * 是否使能，TRUE使能，FALSE不使能
	 * \endif
	 */
	public boolean bEnable; 
   
	/**
	 * \if ENGLISH_LANG
	 * SIP server no.
	 * \else
	 * SIP服务器编号	字符串（24位）
	 * \endif
	 */
	public byte[] szSipSvrId = new byte[FinalVar.CFG_COMMON_STRING_64]; 
    
	/**
	 * \if ENGLISH_LANG
	 * SIP domain
	 * \else
	 * SIP域	字符串（128位）
	 * \endif
	 */
	public byte[] szDomain = new byte[FinalVar.CFG_COMMON_STRING_256]; 
    
	/**
	 * \if ENGLISH_LANG
	 * SIP server IP
	 * \else
	 * SIP服务器IP	字符串（16位）
	 * \endif
	 */
	public byte[] szSipSvrIp = new byte[FinalVar.CFG_COMMON_STRING_32]; 
    
	/**
	 * \if ENGLISH_LANG
	 * Device no.
	 * \else
	 * 设备编号，也是注册用户名	字符串（24位）
	 * \endif
	 */
	public byte[] szDeviceId = new byte[FinalVar.CFG_COMMON_STRING_64]; 
    
	/**
	 * \if ENGLISH_LANG
	 * Registration password
	 * \else
	 * 注册密码,密文	字符串（24位）
	 * \endif
	 */
	public byte[] szPassword = new byte[FinalVar.CFG_COMMON_STRING_64]; 
    
	/**
	 * \if ENGLISH_LANG
	 * Local SIP server port
	 * \else
	 * 本地SIP服务端口
	 * \endif
	 */
	public short nLocalSipPort;
    
	/**
	 * \if ENGLISH_LANG
	 * SIP server port	no symbol short whole 
	 * \else
	 * SIP服务器端口	无符号短整型
	 * \endif
	 */
	public short nSipSvrPort;
    
	/**
	 * \if ENGLISH_LANG
	 * Registration validity
	 * \else
	 * 注册有效期	整型
	 * \endif
	 */
	public int nSipRegExpires; 
    
	/**
	 * \if ENGLISH_LANG
	 * Beat period
	 * \else
	 *  心跳周期	整型
	 * \endif
	 */
	public int nKeepAliveCircle;
    
	/**
	 * \if ENGLISH_LANG
	 * Max beat overtime times
	 * \else
	 *  最大心跳超时次数	整型
	 * \endif
	 */
	public int nMaxTimeoutTimes;
    
	/**
	 * \if ENGLISH_LANG
	 * District code
	 * \else
	 * 行政区划代码	字符串（24位）
	 * \endif
	 */
	public byte[] szCivilCode = new byte[FinalVar.CFG_COMMON_STRING_64]; 
    
	/**
	 * \if ENGLISH_LANG
	 * Input module recognition code
	 * \else
	 * 接入模块识别码, 字符串（24位）
	 * \endif
	 */
	public byte[] szIntervideoID = new byte[FinalVar.CFG_COMMON_STRING_64];
    
	/**
	 * \if ENGLISH_LANG
	 * Channel no.
	 * \else
	 * 通道数
	 * \endif
	 */
	public short nChannelSum;
    
	/**
	 * \if ENGLISH_LANG
	 * External alarm input number
	 * \else
	 * 外部报警输入数	无符号短整型
	 * \endif
	 */
	public short nAlarmInSum; 
    
	/**
	 * \if ENGLISH_LANG
	 * Chanel related info
	 * \else
	 * 通道相关信息数组，有效个数同 channelSum
	 * \endif
	 */
	public CFG_VSP_GAYS_CHANNEL_INFO[] stuChannelInfo = new CFG_VSP_GAYS_CHANNEL_INFO[FinalVar.MAX_VIDEO_CHANNEL_NUM];  
    
	/**
	 * \if ENGLISH_LANG
	 * Alarm related info
	 * \else
	 * 报警相关信息数组，有效个数同 alarmInSum
	 * \endif
	 */
	public CFG_VSP_GAYS_ALARM_INFO[] stuAlarmInfo = new CFG_VSP_GAYS_ALARM_INFO[FinalVar.MAX_ALARM_CHANNEL_NUM];    

    public CFG_VSP_GAYS_INFO() {
    	
    	for (int i = 0; i < stuChannelInfo.length; ++i) {
    		stuChannelInfo[i] = new CFG_VSP_GAYS_CHANNEL_INFO();
    	}
    	
    	for (int j = 0; j < stuAlarmInfo.length; ++j) {
    		stuAlarmInfo[j] = new CFG_VSP_GAYS_ALARM_INFO();
    	}
    	
    }
    
    
}

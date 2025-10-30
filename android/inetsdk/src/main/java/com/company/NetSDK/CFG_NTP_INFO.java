package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Time Synchronization Server Configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_NTP}
 * \else
 * 时间同步服务器配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_NTP}
 * \endif
 */
public class CFG_NTP_INFO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable switch 
	 * \else
	 * 使能开关
	 * \endif
	 */
	public boolean				bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * NTP IP address or network name of NTP Server
	 * \else
	 * NTP服务器  IP地址或网络名
	 * \endif
	 */
	public byte[]				szAddress = new byte[FinalVar.MAX_ADDRESS_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port number of NTP Server
	 * \else
	 * 端口号
	 * \endif
	 */
	public int					nPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Update cycle, in minutes.
	 * \else
	 * 更新周期，单位为分钟. 0表示不校时
	 * \endif
	 */
	public int					nUpdatePeriod; 
	
	/**
	 * \if ENGLISH_LANG
	 * Time zone, refer to {@link EM_CFG_TIME_ZONE_TYPE}
	 * \else
	 * 时区, 取值参考 {@link EM_CFG_TIME_ZONE_TYPE}
	 * \endif
	 */
	public int					emTimeZoneType;
	
	/**
	 * \if ENGLISH_LANG
	 * Time zone description
	 * \else
	 * 时区描述
	 * \endif
	 */
	public byte[]				szTimeZoneDesc = new byte[FinalVar.MAX_NAME_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * The number of standby NTP servers
	 * \else
	 * 实际备用NTP服务器个数
	 * \endif
	 */
	public int                 nSandbyServerNum;   
	
	/**
	 * \if ENGLISH_LANG
	 * Standby NTP Servers
	 * \else
	 * 备选NTP服务器地址
	 * \endif
	 */
    public CFG_NTP_SERVER[]      stuStandbyServer = new CFG_NTP_SERVER[FinalVar.MAX_NTP_SERVER];   
    
    public CFG_NTP_INFO() {
    	for (int i = 0; i < FinalVar.MAX_NTP_SERVER; ++i) {
    		stuStandbyServer[i] = new CFG_NTP_SERVER();
    	}
    }
}

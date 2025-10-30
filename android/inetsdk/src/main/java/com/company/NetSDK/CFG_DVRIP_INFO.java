package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * network protocol configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_DVRIP}
 * \else
 * 网络协议配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_DVRIP}
 * \endif
 */
public class CFG_DVRIP_INFO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * TCP server port,1025~65535
	 * \else
	 * TCP服务端口,1025~65535
	 * \endif
	 */
	public int                 nTcpPort;                           
	
	/**
	 * \if ENGLISH_LANG
	 * SSL server port,1025~65535
	 * \else
	 * SSL服务端口,1025~65535
	 * \endif
	 */
	public int                 nSSLPort;                           
	
	/**
	 * \if ENGLISH_LANG
	 * UDP server port,1025~65535
	 * \else
	 * UDP服务端口,1025~65535
	 * \endif
	 */
	public int                 nUDPPort;                           
	
	/**
	 * \if ENGLISH_LANG
	 * max connections 
	 * \else
	 * 最大连接数 
	 * \endif
	 */
	public int                 nMaxConnections;                    
	
	/**
	 * \if ENGLISH_LANG
	 * multicast enable
	 * \else
	 * 组播使能
	 * \endif
	 */
	public boolean             bMCASTEnable;                       
	
	/**
	 * \if ENGLISH_LANG
	 * multicast port
	 * \else
	 * 组播端口号
	 * \endif
	 */
	public int                 nMCASTPort;                         
	
	/**
	 * \if ENGLISH_LANG
	 * multicast address
	 * \else
	 * 组播地址
	 * \endif
	 */
	public byte                szMCASTAddress[] = new byte[FinalVar.MAX_ADDRESS_LEN];    
	
	/**
	 * \if ENGLISH_LANG
	 * number of initiative register configuration
	 * \else
	 * 主动注册配置个数
	 * \endif
	 */
	public int                 nRegistersNum;                      
	
	/**
	 * \if ENGLISH_LANG
	 * initiative register configuration
	 * \else
	 * 主动注册配置 
	 * \endif
	 */
	public CFG_REGISTER_SERVER_INFO stuRegisters[] = new CFG_REGISTER_SERVER_INFO[FinalVar.MAX_REGISTER_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Bit stream strategy when bandwitch is insufficient, refer to {@link EM_STREAM_POLICY}
	 * \else
	 * 带宽不足时码流策略, 对应 {@link EM_STREAM_POLICY}
	 * \endif
	 */
    public int    			   emStreamPolicy;                     
    
    public CFG_DVRIP_INFO() {
    	for (int i = 0; i < FinalVar.MAX_REGISTER_NUM; ++i) {
    		stuRegisters[i] =  new CFG_REGISTER_SERVER_INFO();
    	}
    }
}

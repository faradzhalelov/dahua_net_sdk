package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Remote Host Configuration
 * \else
 * 远程主机配置
 * \endif
 */
public class SDK_REMOTE_HOST implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Connection enabled
	 * \else
	 * 连接使能
	 * \endif
	 */
	public byte                byEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Currently only useful for PPPoE server
	 * <table>
	 * <tr><td>0</td><td>In the wired network card dialing</td></tr>
	 * <tr><td>1</td><td>In the wired Wireless card dialing</td></tr>
	 * </table>
	 * \else
	 * 目前只对于PPPoE服务器有用
	 * <table>
	 * <tr><td>0</td><td>在有线网卡拨号</td></tr>
	 * <tr><td>1</td><td>在无线网卡上拨号</td></tr>
	 * </table>
	 * \endif
	 */
	public byte                byAssistant;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote host port
	 * \else
	 * 远程主机端口
	 * \endif
	 */
	public int                wHostPort;
	
	/**
	 * \if ENGLISH_LANG
	 * IP address of the remote host
	 * \else
	 * 远程主机IP地址
	 * \endif
	 */
	public byte                sHostIPAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * The user name of the remote host
	 * \else
	 * 远程主机用户名
	 * \endif
	 */
	public byte                sHostUser[] = new byte[FinalVar.SDK_MAX_HOST_NAMELEN];
	
	/**
	 * \if ENGLISH_LANG
	 * The user password of the remote host
	 * \else
	 * 远程主机密码
	 * \endif
	 */
	public byte                sHostPassword[] = new byte[FinalVar.SDK_MAX_HOST_PSWLEN];
}

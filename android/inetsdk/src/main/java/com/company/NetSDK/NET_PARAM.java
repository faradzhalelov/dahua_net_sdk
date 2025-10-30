package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The corresponding parameter when setting log in
 * \else
 * 设置登入时的相关参数
 * \endif
 */
public class NET_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Waiting time(unit is ms), 0:default 5000ms.
	 * \else
	 * 等待超时时间(毫秒为单位)，为0默认5000ms
	 * \endif
	 */
	public int					nWaittime;
	
	/**
	 * \if ENGLISH_LANG
	 * Connection timeout value(Unit is ms), 0:default 1500ms.
	 * \else
	 * 连接超时时间(毫秒为单位)，为0默认1500ms
	 * \endif
	 */
	public int					nConnectTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Connection trial times(Unit is ms), 0:default 1.
	 * \else
	 * 连接尝试次数，为0默认1次
	 * \endif
	 */
	public int					nConnectTryNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Sub-connection waiting time(Unit is ms), 0:default 10ms.
	 * \else
	 * 子连接之间的等待时间(毫秒为单位)，为0默认10ms
	 * \endif
	 */
	public int					nSubConnectSpaceTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Access to device information timeout, 0:default 1000ms.
	 * \else
	 * 获取设备信息超时时间，为0默认1000ms
	 * \endif
	 */
	public int					nGetDevInfoTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Each connected to receive data buffer size(Bytes), 0:default 250*1024
	 * \else
	 * 每个连接接收数据缓冲大小(字节为单位)，为0默认250*1024
	 * \endif
	 */
	public int					nConnectBufSize;
	
	/**
	 * \if ENGLISH_LANG
	 * Access to sub-connect information timeout(Unit is ms), 0:default 1000ms.
	 * \else
	 * 获取子连接信息超时时间(毫秒为单位)，为0默认1000ms
	 * \endif
	 */
	public int					nGetConnInfoTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Timeout value of search video (unit ms), default 3000ms
	 * \else
	 * 按时间查询录像文件的超时时间(毫秒为单位),为0默认为3000ms
	 * \endif
	 */
	public int                  nSearchRecordTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Dislink disconnect time,0:default 60000ms
	 * \else
	 * 检测子链接断线等待时间(毫秒为单位)，为0默认为60000ms
	 * \endif
	 */
	public int                  nsubDisconnetTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Net type, 0-LAN, 1-WAN
	 * \else
	 * 网络类型, 0-LAN, 1-WAN
	 * \endif
	 */
	public byte					byNetType;
	
	/**
	 * \if ENGLISH_LANG
	 * Playback data from the receive buffer size(m),when value = 0,default 4M
	 * \else
	 * 回放数据接收缓冲大小（M为单位），为0默认为4M
	 * \endif
	 */
	public byte                 byPlaybackBufSize;

	/**
	 * \if ENGLISH_LANG
	 * Pulse detect offline time(second) .When it is 0, the default setup is 60s, and the min time is 2s
	 * \else
	 * 心跳检测断线时间(单位为秒),为0默认为60s,最小时间为2s
	 * \endif
	 */
	public byte                bDetectDisconnTime;

	/**
	 * \if ENGLISH_LANG
	 * Pulse send out interval(second). When it is 0, the default setup is 10s, the min internal is 2s.
	 * \else
	 * 心跳包发送间隔(单位为秒),为0默认为10s,最小间隔为2s
	 * \endif
	 */
	public byte                bKeepLifeInterval;
	        
	/**
	 * \if ENGLISH_LANG
	 * actual pictures of the receive buffer size(byte)when value = 0,default 2*1024*1024
	 * \else
	 * 实时图片接收缓冲大小（字节为单位），为0默认为2*1024*1024
	 * \endif
	 */
	public int                  nPicBufSize;             		 
}

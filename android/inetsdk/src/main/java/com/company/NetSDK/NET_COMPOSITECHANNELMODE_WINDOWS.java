package com.company.NetSDK;
import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CourseCompositeChannelMode window info
 * \else
 * 录播主机窗口信息
 * \endif
 */
public final class NET_COMPOSITECHANNELMODE_WINDOWS implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * window coordinate
	 * \else
	 * 窗口坐标, 采用8192坐标体系
	 * \endif
	 */
	public  SDK_RECT   stRect = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * logic channel, -1 means this window not bind channel
	 * \else
	 * 逻辑通道号, 为-1表示此窗口没有绑定通道
	 * \endif
	 */
	public int   nLogicChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Z order
	 * \else
	 * Z序
	 * \endif
	 */
	public int   nZOrder;
	
	
}

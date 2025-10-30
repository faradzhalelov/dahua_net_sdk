package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#SetMarkFileByTime} input param
 * \else
 * 接口{@link INetSDK#SetMarkFileByTime}输入参数
 * \endif
 */
public class NET_IN_SET_MARK_FILE_BY_TIME implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * the channel ID you want to lock, begin at 0, when the filed is -1,  it means all channels
	 * \else
	 * 需要锁定的通道号,从0开始,元素为-1时,表示全通道。
	 * \endif
	 */
    public int                 nChannel;                            
    
	/**
	 * \if ENGLISH_LANG
	 * start time
	 * \else
	 * 开始时间
	 * \endif
	 */
    public NET_TIME_EX         stuStartTime = new NET_TIME_EX();                        
    
	/**
	 * \if ENGLISH_LANG
	 * end time
	 * \else
	 * 结束时间
	 * \endif
	 */
    public NET_TIME_EX         stuEndTime = new NET_TIME_EX();                           
    
	/**
	 * \if ENGLISH_LANG
	 * action tag 	true : tag, false : clear
	 * \else
	 * 标记动作	true : 标记, false : 清除
	 * \endif
	 */
    public boolean             bFlag;                               
}

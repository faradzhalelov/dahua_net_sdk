package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#GetMarkInfo} output param
 * \else
 * 接口{@link INetSDK#GetMarkInfo}输出参数
 * \endif
 */
public class NET_OUT_GET_MARK_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * total capacity (unit M)
	 * \else
	 * 总容量（单位M）
	 * \endif
	 */
    public int                 nTotalSpace; 
    
	/**
	 * \if ENGLISH_LANG
	 * locked capacity of the video unit M 
	 * \else
	 * 录像被锁定的容量 单位M
	 * \endif
	 */
    public int                 nMarkSpace;  
}

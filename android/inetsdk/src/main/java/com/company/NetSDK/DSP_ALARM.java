package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Privacy mask info
 * \else
 * DSP报警
 * \endif
 */
public class DSP_ALARM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0:DSP normal;1:DSP abnormal
	 * \else
	 * 0,DSP正常 1,DSP异常
	 * \endif
	 */
	public boolean                bError;
	
 	/**
	 * \if ENGLISH_LANG
	 * Use bit to stand for. 0=there is no error. Other value=there error.(For each alarm, there is one valid bit.)
	 * <pre>
	 * bit 	DSP alarm 
	 * 1 	bit DSP load failed  
	 * 2 	bit DSP error 
	 * 3 	bit Wrong format  
	 * 4 	bit Does not support current resolution 
	 * 5 	bit Does not support current data format. 
	 * 6 	bit Can not find I frame. 
	 * </pre>
	 * \else
	 * 按位表示，非0表示有此错误，0表示没有。(目前每次报警只有一位有效)
	 * <pre>
	 * bit 	DSP报警
	 * 1  	DSP加载失败 
	 * 2  	DSP错误
	 * 3  	制式不对 
	 * 4  	分辨率不支持
	 * 5  	数据格式不支持
	 * 6  	找不到I帧
	 * </pre>
	 * \endif
	 */
	public int               dwErrorMask;
	
 	/**
	 * \if ENGLISH_LANG
	 * Use bit to stand for. The decoded channel No. of alarm. dwErrorMask is DSP error. It is valid when there is wrong format, system does not support current resolution, data format
	 * \else
	 * 按位表示，报警的解码通道号，dwErrorMask为DSP错误，制式不对，分辨率不支持，数据格式不支持时此项有效
	 * \endif
	 */
	public int               dwDecChnnelMask;
	
 	/**
	 * \if ENGLISH_LANG
	 * Use bit to stand for. The decode channel No. of alarm for 33-64-channel. dwErrorMask is DSP error. It is valid when there is wrong format, system does not support current resolution, data format.
	 * \else
	 * 按位表示,33-64通道的报警的解码通道号, dwErrorMask为DSP错误，制式不对，分辨率不支持，数据格式不支持时此项有效
	 * \endif
	 */
	public int               dwDecChnnelMask1;
}

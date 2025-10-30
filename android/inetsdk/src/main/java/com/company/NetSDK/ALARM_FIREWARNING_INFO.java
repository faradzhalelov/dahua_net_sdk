package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* thermal kindling point alarm, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_FIREWARNING}
* \else
* 热成像着火点报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_FIREWARNING}
* \endif
*/
public class ALARM_FIREWARNING_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * 0-start, 1-stop
	 * \else
	 * 0 - 开始,1 - 结束,-1:无意义
	 * \endif
	 */
    public int                 nState;                             
    
	 /**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * 对应视频通道号
	 * \endif
	 */
    public int                 nChannel;                           
}

package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* firewarning event info, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_FIREWARNING_INFO}
* \else
* 热成像火情的报警信息上报事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_FIREWARNING_INFO}
* \endif
*/
public class ALARM_FIREWARNING_INFO_DETAIL implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * 视频通道号
	 * \endif
	 */
    public int                 		nChannel;                    
    
	 /**
	 * \if ENGLISH_LANG
	 * warning info count
	 * \else
	 * 报警信息个数
	 * \endif
	 */
    public int				   		nWarningInfoCount;			 
    
	 /**
	 * \if ENGLISH_LANG
	 * warning info
	 * \else
	 * 具体报警信息
	 * \endif
	 */
    public NET_FIREWARNING_INFO 	stuFireWarningInfo[] = new NET_FIREWARNING_INFO[FinalVar.MAX_FIREWARNING_INFO_NUM]; 

    public ALARM_FIREWARNING_INFO_DETAIL() {
    	for(int i = 0; i < FinalVar.MAX_FIREWARNING_INFO_NUM; ++i) {
        	stuFireWarningInfo[i] = new NET_FIREWARNING_INFO();
    	}
    }
}

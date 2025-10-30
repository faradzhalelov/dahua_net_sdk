package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Set pre stream input parameter
* \else
* 设置预拉流源输入参数
* \endif
*/
public class NET_IN_SPLIT_SET_PREPULLSRC implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * video output channel	
	 * \else
	 * 视频输出通道
	 * \endif
	 */
    public int             nChannel;                   
    
	 /**
	 * \if ENGLISH_LANG
	 * window no.
	 * \else
	 * 窗口号
	 * \endif
	 */
    public int             nWindow;                    
    
	 /**
	 * \if ENGLISH_LANG
	 * pre stream source quantity
	 * \else
	 * 预拉流源数量
	 * \endif
	 */
    public int             nSrcCount;                  
    
	 /**
	 * \if ENGLISH_LANG
	 * re stream source info,the space application by the user, applt to sizeof(SDK_SPLIT_SOURCE)*nSrcCount
	 * \else
	 * 预拉流源信息,由用户申请内存，大小为sizeof(SDK_SPLIT_SOURCE)*nSrcCount
	 * \endif
	 */
    public SDK_SPLIT_SOURCE[] pSources;                  
	
    public NET_IN_SPLIT_SET_PREPULLSRC(int sourceCount){
    	this.nSrcCount = sourceCount;
    	pSources = new SDK_SPLIT_SOURCE[sourceCount];
    	for (int i = 0; i < sourceCount; ++i) {
    		pSources[i] = new SDK_SPLIT_SOURCE();
    	}
    } 
}

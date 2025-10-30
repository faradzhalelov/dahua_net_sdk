package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#AttachVideoAnalyseState} Interface output parameters
* \else
* 接口 {@link INetSDK#AttachVideoAnalyseState} 接口输出参数
* \endif
*/
public class NET_OUT_ATTACH_VIDEOANALYSE_STATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * Analysis of the progress of the analysis progress handle that uniquely identifies a particular channel
	 * \else
	 * 分析进度句柄，唯一标识某一通道的分析进度
	 * \endif
	 */
	public long              lAttachHandle;         
}

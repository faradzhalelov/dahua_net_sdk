package com.company.NetSDK;

import java.io.Serializable;

public class NET_VIDEOANALYSE_STATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * Analysis of progress, 0-100
	 * \else
	 * 分析进度，0-100
	 * \endif
	 */
	public int            dwProgress;                        
	
	 /**
	 * \if ENGLISH_LANG
	 * Channel Status,Running":Run, "Stop":Stop, "NoStart":Not started, "Failed":failed, "Successed":successed
	 * \else
	 * 通道状态,Running"：运行，"Stop"：停止，"NoStart"：未启动，"Failed"：失败，"Successed"：成功
	 * \endif
	 */
	public byte             szState[] = new byte[FinalVar.SDK_COMMON_STRING_64];      
	
	 /**
	 * \if ENGLISH_LANG
	 * Error code
	 * \else
	 * 错误码
	 * \endif
	 */
	public byte             szFailedCode[] = new byte[FinalVar.SDK_COMMON_STRING_64]; 
}

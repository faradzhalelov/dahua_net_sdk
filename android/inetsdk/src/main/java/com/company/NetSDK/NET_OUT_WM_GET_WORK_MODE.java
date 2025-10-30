package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Get window working mode output parameter, corresponding to {@link NET_SPLIT_OPERATE_TYPE#NET_WM_OPERATE_GET_WORK_MODE}
* \else
* 获取窗口工作模式输出参数, 对应 {@link NET_SPLIT_OPERATE_TYPE#NET_WM_OPERATE_GET_WORK_MODE}
* \endif
*/
public class NET_OUT_WM_GET_WORK_MODE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * Window working mode, refer to {@link NET_WM_WORK_MODE}
	 * \else
	 * 窗口工作模式,取值参考 {@link NET_WM_WORK_MODE}
	 * \endif
	 */
    public int       emMode;                         
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * local preview split parameter, corresponding to interface {@link INetSDK#ControlDevice}, corresponding to command {@link CtrlType#SDK_DEVICE_LOCALPREVIEW_SLIPT}
 * \else
 * 控制设备端本地预览分割参数, 对应接口 {@link INetSDK#ControlDevice}, 对应命令 {@link CtrlType#SDK_DEVICE_LOCALPREVIEW_SLIPT}
 * \endif
 */
public class DEVICE_LOCALPREVIEW_SLIPT_PARAMETER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * split mode
	 * \else
	 * 分割模式，见设备端本地预览支持的分割模式
	 * \endif
	 */
	public int                 nSliptMode;
	
	/**
	 * \if ENGLISH_LANG
	 * split num, start with 1
	 * \else
	 * 当前要预览的子分割,从1开始
	 * \endif
	 */
	public int                 nSubSliptNum;
}

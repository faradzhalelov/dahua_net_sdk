package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#CtrlDecTVScreen} Port serial number
 * \else
 * {@link INetSDK#CtrlDecTVScreen} 接口参数
 * \endif
 */
public class SDK_CTRL_DECTV_SCREEN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 分割模式
	 * \endif
	 */
	public int             nSplitType;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number, when dwDisplayType = {@link SDK_SPLIT_DISPLAY_TYPE#SDK_SPLIT_DISPLAY_TYPE_GENERAL} is valid
	 * \else
	 * 显示通道,dwDisplayType = {@link SDK_SPLIT_DISPLAY_TYPE#SDK_SPLIT_DISPLAY_TYPE_GENERAL}时有效,调用者分配的内存长度不能小于nSplitType的大小
	 * \endif
	 */
	public byte[]          pEncoderChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number, when dwDisplayType ={@link  SDK_SPLIT_DISPLAY_TYPE#SDK_SPLIT_DISPLAY_TYPE_PIP} is valid
	 * \else
	 * 输入通道组号,dwDisplayType ={@link  SDK_SPLIT_DISPLAY_TYPE#SDK_SPLIT_DISPLAY_TYPE_PIP}时表示画中画显示类型下有效；
	 * \endif
	 */
	public byte            byGroupNo;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number, refer to {@link SDK_SPLIT_DISPLAY_TYPE}
	 * \else
	 * 显示类型；具体见 {@link SDK_SPLIT_DISPLAY_TYPE}（注释各模式下显示内容由"PicInPic"决定, 各模式下显示内容按NVD旧有规则决定（即DisChn字段决定）。兼容，没有这一个项时，默认为普通显示类型,即"General"）
	 * \endif
	 */
	public int             dwDisplayType;
}

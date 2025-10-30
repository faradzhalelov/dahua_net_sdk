package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Split mode info
 * \else
 * 一屏幕的分割模式信息
 * \endif
 */
public class SDK_SPLIT_MODE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Split mode，value corresponding to {@link SDK_SPLIT_MODE} 
	 * \else
	 * 分割模式, 值对应类 {@link SDK_SPLIT_MODE} 
	 * \endif
	 */
	public int         		emSplitMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Group SN
	 * \else
	 * 分组序号
	 * \endif
	 */
	public int					nGroupID;
	
	/**
	 * \if ENGLISH_LANG
	 * Display type, look for {@link SDK_SPLIT_DISPLAY_TYPE}
	 * \else
	 * 显示类型；具体见 {@link SDK_SPLIT_DISPLAY_TYPE}（注释各模式下显示内容由"PicInPic"决定, 各模式下显示内容按NVD旧有规则决定（即DisChn字段决定）。兼容，没有这一个项时，默认为普通显示类型,即"General"）
	 * \endif
	 */
	public int	                dwDisplayType;
}

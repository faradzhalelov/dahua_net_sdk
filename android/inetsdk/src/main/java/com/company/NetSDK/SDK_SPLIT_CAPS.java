package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Split capability
 * \else
 * 分割能力
 * \endif
 */
public class SDK_SPLIT_CAPS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The split amount supported
	 * \else
	 * 支持的分割模式数量
	 * \endif
	 */
	public int					nModeCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The split mode supported， corresponding to {@link SDK_SPLIT_MODE}
	 * \else
	 * 支持的分割模式,取值参考 {@link SDK_SPLIT_MODE}
	 * \endif
	 */
	public int					emSplitMode[] = new int[FinalVar.SDK_MAX_SPLIT_MODE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Max display source allocation amount
	 * \else
	 * 最大显示源配置数
	 * \endif
	 */
	public int				    nMaxSourceCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of free window support
	 * \else
	 * 支持的最大自由开窗数目
	 * \endif
	 */
	public int					nFreeWindowCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Support collection
	 * \else
	 * 是否支持区块收藏
	 * \endif
	 */
	public boolean				bCollectionSupported;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number, refer to {@link SDK_SPLIT_DISPLAY_TYPE}
	 * \else
	 * 掩码表示多个显示类型，具体见 {@link SDK_SPLIT_DISPLAY_TYPE}（注释各模式下显示内容由"PicInPic"决定, 各模式下显示内容按NVD旧有规则决定（即DisChn字段决定）。兼容，没有这一个项时，默认为普通显示类型,即"General"）
	 * \endif
	 */
	public int              	dwDisplayType;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 画中画支持的分割模式数量
	 * \endif
	 */
	public int					nPIPModeCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number， corresponding to {@link SDK_SPLIT_MODE}
	 * \else
	 * 画中画支持的分割模式,取值参考 {@link SDK_SPLIT_MODE}
	 * \endif
	 */
	public int					emPIPSplitMode[] = new int[FinalVar.SDK_MAX_SPLIT_MODE_NUM];
	
	
	/**
	 * \if ENGLISH_LANG
	 * supported input channel
	 * \else
	 * 支持的输入通道
	 * \endif
	 */
	 public int                szInputChannels[] = new int[FinalVar.SDK_SPLIT_INPUT_NUM];  
	 
	/**
	 * \if ENGLISH_LANG
	 *  supported input channel quantity, 0 means no input channel limit
	 * \else
	 * 支持的输入通道个数, 0表示没有输入通道限制
	 * \endif
	*/
	 public int					nInputChannelCount; 

	 /**
	 * \if ENGLISH_LANG
	 * enable split mode quantity
	 * \else
	 * 启动分割模式数量
	 * \endif
	 */
	 
	 public int					nBootModeCount;
	 
	 /**
	 * \if ENGLISH_LANG
	 * support enable default video split mode. refer to {@link SDK_SPLIT_MODE}，value corresponding to SDK_SPLIT_MODE
	 * \else
	 * 支持的启动默认画面分割模式, 取值参考 {@link SDK_SPLIT_MODE}
	 * \endif
	 */
	 public int					emBootMode[] = new int[FinalVar.SDK_MAX_SPLIT_MODE_NUM];
	 
	 
}

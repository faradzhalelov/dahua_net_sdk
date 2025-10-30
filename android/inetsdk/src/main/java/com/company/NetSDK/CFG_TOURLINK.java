package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Tour activation config
 * \else
 * 轮巡联动配置
 * \endif
 */
public class CFG_TOURLINK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Tour enable
	 * \else
	 * 轮巡使能
	 * \endif
	 */
	public boolean				bEnable;

	/**
	 * \if ENGLISH_LANG
	 * Tour split mode, refer to {@link CFG_SPLITMODE}
	 * \else
	 * 轮巡时的分割模式, 取值参考 {@link CFG_SPLITMODE}
	 * \endif
	 */
	public int				    emSplitMode;

	/**
	 * \if ENGLISH_LANG
	 * Tour channel no.list
	 * \else
	 * 轮巡通道号列表
	 * \endif
	 */
	public int[]			    nChannels = new int[FinalVar.MAX_VIDEO_CHANNEL_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Tour channel quantity
	 * \else
	 * 轮巡通道数量
	 * \endif
	 */
	public int			        nChannelCount;
}

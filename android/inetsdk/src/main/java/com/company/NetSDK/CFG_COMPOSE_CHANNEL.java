package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Synthetic channel configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_COMPOSE_CHANNEL}
 * \else
 *  合成通道配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_COMPOSE_CHANNEL}
 * \endif
 */
public class CFG_COMPOSE_CHANNEL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Segmentation mode, refer to {@link CFG_SPLITMODE}
	 * \else
	 * 分割模式, 取值参考 {@link CFG_SPLITMODE}
	 * \endif
	 */
	public int	emSplitMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Each child window display content  in segmentation mode 
	 * \else
	 * 割模式下的各子窗口显示内容
	 * \endif
	 */
	public int szChannelCombination[] = new int[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Split Window Number
	 * \else
	 * 分割窗口数量
	 * \endif
	 */
	public int				nChannelCount;
	
}

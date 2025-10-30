package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Areas collection
 * \else
 * 区块收藏
 * \endif
 */
public class SDK_BLOCK_COLLECTION implements Serializable {
	/**
	 *
	 */
	private static final long				serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Split mode
	 * \else
	 * 分割模式
	 * \endif
	 */
	public int								emSplitMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Window info array
	 * \else
	 * 窗口信息数组
	 * \endif
	 */
	public SDK_WINDOW_COLLECTION 			stuWnds[] = new SDK_WINDOW_COLLECTION[FinalVar.SDK_MAX_SPLIT_WINDOW];
	
	/**
	 * \if ENGLISH_LANG
	 * Count of window
	 * \else
	 * 窗口数量
	 * \endif
	 */
	public int								nWndsCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Favorites name
	 * \else
	 * 收藏夹名称
	 * \endif
	 */
	public byte								szName[] = new byte[FinalVar.SDK_DEVICE_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 输出通道号, 包括拼接屏
	 * \endif
	 */
	public int								nScreen;

	/**
	 * \if ENGLISH_LANG
	 * splicing video wall ID
	 * \else
	 * 拼接屏ID
	 * \endif
	 */
	public byte								szCompositeID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];

	/**
	 * \if ENGLISH_LANG
	 * Split OSD
	 * \else
	 * 拼接区OSD叠加信息
	 * \endif
	 */
	public NET_SPLIT_OSD         			stuSplitOsd[] = new NET_SPLIT_OSD[20];

	/**
	 * \if ENGLISH_LANG
	 * Background information of mosaic area.Currently only used for plan acquisition
	 * \else
	 * 拼接区底图信息，目前仅预案获取时使用
	 * \endif
	 */
	public NET_SCREEEN_BACKGROUD			stuScreenBackground = new NET_SCREEEN_BACKGROUD();
	
	public SDK_BLOCK_COLLECTION() {
		for (int i=0 ; i<FinalVar.SDK_MAX_SPLIT_WINDOW; i++) {
			stuWnds[i] = new SDK_WINDOW_COLLECTION();
		}
		for (int i = 0; i < 20; i++) {
			stuSplitOsd[i] = new NET_SPLIT_OSD();
		}
	}
}

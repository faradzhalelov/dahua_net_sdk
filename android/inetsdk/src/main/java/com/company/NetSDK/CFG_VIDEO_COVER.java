package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Cover
 * \else
 * 多区域遮挡配置
 * \endif
 */
public class CFG_VIDEO_COVER implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Total Blocks
	 * \else
	 * 支持的遮挡块数
	 * \endif
	 */
	public int                  nTotalBlocks;						

	/**
	 * \if ENGLISH_LANG
	 * Current Blocks 
	 * \else
	 * 已设置的块数
	 * \endif
	 */
	public int					nCurBlocks;							

	/**
	 * \if ENGLISH_LANG
	 * Cover Block 
	 * \else
	 * 覆盖的区域
	 * \endif
	 */
	public CFG_COVER_INFO		stuCoverBlock[] = new CFG_COVER_INFO[FinalVar.MAX_VIDEO_COVER_NUM];	
	
	public CFG_VIDEO_COVER() {
		for (int i = 0; i < FinalVar.MAX_VIDEO_COVER_NUM; i++) {
			stuCoverBlock[i] = new CFG_COVER_INFO();
		}
	}
}

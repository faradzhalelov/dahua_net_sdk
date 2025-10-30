package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Multiple-zone privacy mask configuration
 * \else
 * 多区域遮挡配置
 * \endif
 */
public class SDKDEV_VIDEOCOVER_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel name
	 * \else
	 * 通道名
	 * \endif
	 */
	public byte                szChannelName[] = new byte[FinalVar.SDK_CHAN_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask zone amount supported
	 * \else
	 * 支持的遮挡块数
	 * \endif
	 */
	public byte                bTotalBlocks;
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask zones have been set.
	 * \else
	 * 已设置的遮挡块数
	 * \endif
	 */
	public byte                bCoverCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask zone
	 * \else
	 * 覆盖的区域
	 * \endif
	 */
    public VIDEO_COVER_ATTR    CoverBlock[] = new VIDEO_COVER_ATTR[FinalVar.SDK_MAX_VIDEO_COVER_NUM];
    
    public SDKDEV_VIDEOCOVER_CFG() {
    	for (int i = 0; i < FinalVar.SDK_MAX_VIDEO_COVER_NUM; i++) {
    		CoverBlock[i] = new VIDEO_COVER_ATTR();
    	}
    }
}

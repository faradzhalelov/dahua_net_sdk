package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Plan of monitor wall
 * \else
 * 电视墙预案 
 * \endif
 */
public class SDK_MONITORWALL_COLLECTION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Name
	 * \else
	 * 电视墙预案名称
	 * \endif
	 */
	public byte				szName[] = new byte[FinalVar.SDK_DEVICE_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Area array
	 * \else
	 * 区块数组
	 * \endif
	 */
	public SDK_BLOCK_COLLECTION	stuBlocks[] = new SDK_BLOCK_COLLECTION[FinalVar.SDK_MAX_BLOCK_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Area count
	 * \else
	 * 区块数量
	 * \endif
	 */
	public int					nBlocksCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Control ID
	 * \else
	 * 控制ID
	 * \endif
	 */
	public byte				szControlID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];

	/**
	 * \if ENGLISH_LANG
	 * plan type,{@link EM_SAVE_COLLECTION_TYPE}
	 * \else
	 * 预案类型,{@link EM_SAVE_COLLECTION_TYPE}
	 * \endif
	 */
	public int					emType;

	public SDK_MONITORWALL_COLLECTION() {
		for (int i = 0; i < stuBlocks.length; i++) {
			stuBlocks[i] = new SDK_BLOCK_COLLECTION();
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetMonitorWallCollections} 's interface output param(get plan infomation of monitor wall)
 * \else
 * {@link INetSDK#GetMonitorWallCollections} 接口输出参数(获取电视墙预案信息)
 * \endif
 */
public class SDK_OUT_WM_GET_COLLECTIONS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Plan of monitor wall array
	 * \else
	 * 电视墙预案数组
	 * \endif
	 */
	public SDK_MONITORWALL_COLLECTION pCollections[];
	
	/**
	 * \if ENGLISH_LANG
	 * Array size
	 * \else
	 * 电视墙预案数组大小
	 * \endif
	 */
	public int					nMaxCollectionsCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Max count of plan
	 * \else
	 * 电视墙预案数量
	 * \endif
	 */
	public int					nCollectionsCount;
	
	public SDK_OUT_WM_GET_COLLECTIONS(int nMax) {
		nMaxCollectionsCount = nMax;
		pCollections = new SDK_MONITORWALL_COLLECTION[nMax];
		for (int i = 0; i < nMaxCollectionsCount; i++) {
			pCollections[i] = new SDK_MONITORWALL_COLLECTION();
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The first recording time
 * \else
 * 最早录像时间
 * \endif
 */
public class NET_FURTHEST_RECORD_TIME implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel amount
	 * \else
	 * 通道数目
	 * \endif
	 */
	public int					nChnCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The first recording time, valid value is 0 to (nChnCount-1).If there is no video, the first recording time is 0.
	 * \else
	 * 最早录像时间,有效值为前面0 到 (nChnCount-1)个.如果某通道没有录象的话，最早录象时间全为0
	 * \endif
	 */
	public NET_TIME			stuFurthestTime[] = new NET_TIME[16];
	
	/**
	 * \if ENGLISH_LANG
	 * when channel >16,use this field.means pStuFurthestTimeAll memory size.
	 * \else
	 * 当通道个数大于16时，使用。表示下面pStuFurthestTimeAll这块内存大小。
	 * \endif
	 */
	public int					dwFurthestTimeAllSize;
	
	/**
	 * \if ENGLISH_LANG
	 * when channel >16,use this field.need user apply, memory size(nChnCount*sizeof(NET_TIME)).
	 * \else
	 * 当通道个数大于16时，使用。此部分内存需要用户申请,申请大小为(通道个数*sizeof(NET_TIME))。
	 * \endif
	 */
	public NET_TIME			pStuFurthestTimeAll[];
	
	/**
	 * \if ENGLISH_LANG
	 * Reserved words
	 * \else
	 * 保留字段
	 * \endif
	 */
	public byte				bReserved[] = new byte[376];			 
	
	public NET_FURTHEST_RECORD_TIME(int nMaxChnNum)
	{
		nChnCount = nMaxChnNum; 
		for (int i = 0; i < 16; i++)
		{
			stuFurthestTime[i] = new NET_TIME();
		}
		
		pStuFurthestTimeAll = new NET_TIME[nChnCount];
		for (int j = 0; j < nChnCount; j++)
		{
			pStuFurthestTimeAll[j] = new NET_TIME();
		}
	}
}

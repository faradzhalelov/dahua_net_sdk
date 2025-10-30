package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * cadidate person info
 * \else
 * 候选人员信息
 * \endif
 */
public class CANDIDATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * person info
	 * \else
	 * 人员信息
	 * \endif
	 */
	public FACERECOGNITION_PERSON_INFO  stPersonInfo = new FACERECOGNITION_PERSON_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * similarity
	 * \else
	 * 和查询图片的相似度,百分比表示，1~100
	 * \endif
	 */
	public byte                         bySimilarity;
	
	/**
	 * \if ENGLISH_LANG
	 * Range officer's database, refer to {@link EM_FACE_DB_TYPE}
	 * \else
	 * 人员所属数据库范围, 取值参考 {@link EM_FACE_DB_TYPE}
	 * \endif
	 */
	public byte                         byRange;
	
	/**
	 * \if ENGLISH_LANG
	 * When byRange historical database effectively, which means that the query time staff appeared
	 * \else
	 * 当byRange为历史数据库时有效，表示查询人员出现的时间
	 * \endif
	 */
	public NET_TIME                     stTime = new NET_TIME(); 
	
	/**
	 * \if ENGLISH_LANG
	 * When byRange historical database effectively, which means that people place a query appears
	 * \else
	 * 当byRange为历史数据库时有效，表示查询人员出现的地点
	 * \endif
	 */
	public byte                         szAddress[] = new byte[FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 * Is hit, means the result face has compare result in database
	 * \else
	 * 是否有识别结果,指这个检测出的目标在库中有没有比对结果
	 * \endif
	 */
	public boolean                      bIsHit;

	/**
	 * \if ENGLISH_LANG
	 * Scene Image
	 * \else
	 * 目标全景图
	 * \endif
	 */
	public SDK_PIC_INFO_EX3              stuSceneImage = new SDK_PIC_INFO_EX3();

	/**
	 * \if ENGLISH_LANG
	 * ChannelId
	 * \else
	 * 通道号
	 * \endif
	 */
	public int							 nChannelID;

	@Override
	public String toString() {
		return "CANDIDATE_INFO{" +
				"stPersonInfo=" + stPersonInfo +
				", bySimilarity=" + bySimilarity +
				", byRange=" + byRange +
				", stTime=" + stTime +
				", szAddress=" + Arrays.toString(szAddress) +
				", bIsHit=" + bIsHit +
				", stuSceneImage=" + stuSceneImage +
				", nChannelID=" + nChannelID +
				'}';
	}
}

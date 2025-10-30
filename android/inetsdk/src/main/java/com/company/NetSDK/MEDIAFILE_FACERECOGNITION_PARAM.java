package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_FACE}  Corresponding target recognition service search parameter
 * \else
 * {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_FACE} 对应的目标识别服务查询参数
 * \endif
 */
public class MEDIAFILE_FACERECOGNITION_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * start time
	 * \else
	 * 开始时间
	 * \endif
	 */
	public NET_TIME            stStartTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * closing time
	 * \else
	 * 结束时间
	 * \endif
	 */
	public NET_TIME            stEndTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * Place to support fuzzy matching
	 * \else
	 * 地点，支持模糊匹配
	 * \endif
	 */
	public byte                szMachineAddress[] = new byte[FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 * To query the type of alarm, see {@link EM_FACERECOGNITION_ALARM_TYPE}
	 * \else
	 * 待查询报警类型，详见 {@link EM_FACERECOGNITION_ALARM_TYPE}
	 * \endif
	 */
	public int                 nAlarmType;

	/**
	 * \if ENGLISH_LANG
	 * staff info is valid or not
	 * \else
	 * 人员信息是否有效
	 * \endif
	 */
	public boolean                abPersonInfo;

	/**
	 * \if ENGLISH_LANG
	 * staff info
	 * \else
	 * 人员信息
	 * \endif
	 */
	public FACERECOGNITION_PERSON_INFO stPersonInfo = new FACERECOGNITION_PERSON_INFO();

	/**
	 * \if ENGLISH_LANG
	 * channel no.
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                 nChannelId;

	/**
	 * \if ENGLISH_LANG
	 * staff group
	 * \else
	 * 人员组数
	 * \endif
	 */
	public int                 nGroupIdNum;

	/**
	 * \if ENGLISH_LANG
	 * staff group ID
	 * \else
	 * 人员组ID
	 * \endif
	 */
	public byte                szGroupId[][] = new byte[FinalVar.MAX_GOURP_NUM][FinalVar.SDK_COMMON_STRING_64];

	/**
	 * \if ENGLISH_LANG
	 * stPersonInfoEx is valid or not
	 * \else
	 * 人员信息扩展是否有效
	 * \endif
	 */
	public boolean            abPersonInfoEx;

	/**
	 * \if ENGLISH_LANG
	 * expansion of personnel information
	 * \else
	 * 人员信息扩展
	 * \endif
	 */
	public FACERECOGNITION_PERSON_INFOEX	stPersonInfoEx = new FACERECOGNITION_PERSON_INFOEX();

	/**
	 * \if ENGLISH_LANG
	 * similaryRange enable
	 * \else
	 * 相似度是否有效
	 * \endif
	 */
	public boolean				bSimilaryRangeEnable;

	/**
	 * \if ENGLISH_LANG
	 * similaryRange
	 * \else
	 * 相似度范围
	 * \endif
	 */
	public int				nSimilaryRange[] = new int[2];

}

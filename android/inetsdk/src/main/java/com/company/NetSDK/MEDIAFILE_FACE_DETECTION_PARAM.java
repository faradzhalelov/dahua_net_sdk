package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_FACE_DETECTION} corresponding target recognition service search parameter
 * \else
 * {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_FACE_DETECTION} 对应的目标识别服务查询参数
 * \endif
 */
public class MEDIAFILE_FACE_DETECTION_PARAM implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * channel no.
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                 nChannelID;

	/**
	 * \if ENGLISH_LANG
	 * start time
	 * \else
	 * 起始时间
	 * \endif
	 */
	public NET_TIME            stuStartTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * end time
	 * \else
	 * 结束时间
	 * \endif
	 */
	public NET_TIME            stuEndTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * picture type，see {@link EM_FACEPIC_TYPE}
	 * \else
	 * 图片类型，详见  {@link EM_FACEPIC_TYPE}
	 * \endif
	 */
	public int     emPicType;

	/**
	 * \if ENGLISH_LANG
	 * if has detailed info
	 * \else
	 * 是否有详细信息
	 * \endif
	 */
	public boolean                bDetailEnable;

	/**
	 * \if ENGLISH_LANG
	 * parameter detailed info
	 * \else
	 * 参数详细信息
	 * \endif
	 */
	public MEDIAFILE_FACE_DETECTION_DETAIL_PARAM stuDetail = new MEDIAFILE_FACE_DETECTION_DETAIL_PARAM();

	/**
	 * \if ENGLISH_LANG
	 *  sex，{@link EM_DEV_EVENT_FACEDETECT_SEX_TYPE}
	 * \else
	 *  性别类型，{@link EM_DEV_EVENT_FACEDETECT_SEX_TYPE}
	 * \endif
	 */
	public int					emSex;

	/**
	 * \if ENGLISH_LANG
	 *  age range is enabled
	 * \else
	 *  是否指定年龄段
	 * \endif
	 */
	public boolean					bAgeEnable;

	/**
	 * \if ENGLISH_LANG
	 *  age range
	 * \else
	 *  年龄范围
	 * \endif
	 */
	public int					nAgeRange[] = new int[2];

	/**
	 * \if ENGLISH_LANG
	 *  invalid number in array emEmotion, 0 means all emotion
	 * \else
	 *  目标特征数组有效个数,与 emFeature 结合使用, 如果为0则表示查询所有表情
	 * \endif
	 */
	public int					nEmotionValidNum;

	/**
	 * \if ENGLISH_LANG
	 *  human emotion，{@link EM_DEV_EVENT_FACEDETECT_FEATURE_TYPE}
	 * \else
	 *  目标特征数组,与 byFeatureValidNum 结合使用，{@link EM_DEV_EVENT_FACEDETECT_FEATURE_TYPE}
	 * \endif
	 */
	public int					emEmotion[] = new int[FinalVar.SDK_MAX_FACEDETECT_FEATURE_NUM];

	/**
	 * \if ENGLISH_LANG
	 *  wear glasses info，{@link EM_FACEDETECT_GLASSES_TYPE}
	 * \else
	 *  是否戴眼镜，{@link EM_FACEDETECT_GLASSES_TYPE}
	 * \endif
	 */
	public int					emGlasses;

	/**
	 * \if ENGLISH_LANG
	 *  wear mask info，{@link EM_MASK_STATE_TYPE}
	 * \else
	 *  是否带口罩，{@link EM_MASK_STATE_TYPE}
	 * \endif
	 */
	public int					emMask;

	/**
	 * \if ENGLISH_LANG
	 *  beard info，{@link EM_BEARD_STATE_TYPE}
	 * \else
	 *  是否有胡子，{@link EM_BEARD_STATE_TYPE}
	 * \endif
	 */
	public int					emBeard;

	/**
	 * \if ENGLISH_LANG
	 *  0-all;1-Stranger mode unable only;2-Stranger mode enable only
	 * \else
	 *  0-都查询；1-仅查未开启陌生人模式；2-仅查开启陌生人模式
	 * \endif
	 */
	public int					nIsStranger;

	/**
	 * \if ENGLISH_LANG
	 *  TRUE means only deliver stuStartTimeRealUTC and stuEndTimeRealUTC (do not deliver stuStartTime, stuEndTime), FALSE means deliver only stuStartTime, stuEndTime (do not deliver stuStartTimeRealUTC and stuEndTimeRealUTC)
	 * \else
	 *  为TRUE表示仅下发stuStartTimeRealUTC和stuEndTimeRealUTC(不下发stuStartTime, stuEndTime), 为FALSE表示仅下发stuStartTime, stuEndTime(不下发stuStartTimeRealUTC和stuEndTimeRealUTC)
	 * \endif
	 */
	public boolean					bOnlySupportRealUTC;

	/**
	 * \if ENGLISH_LANG
	 *  UTC start time (standard UTC time), paired with stuEndTimeRealUTC, mutually exclusive with (stuStartTime, stuEndTime)
	 * \else
	 *  UTC开始时间(标准UTC时间), 与stuEndTimeRealUTC配对使用，与(stuStartTime, stuEndTime)互斥
	 * \endif
	 */
	public NET_TIME					stuStartTimeRealUTC = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 *  UTC end time (standard UTC time), paired with stuStartTimeRealUTC, mutually exclusive with (stuStartTime, stuEndTime)
	 * \else
	 *  UTC结束时间(标准UTC时间), 与stuStartTimeRealUTC配对使用，与(stuStartTime, stuEndTime)互斥
	 * \endif
	 */
	public NET_TIME					stuEndTimeRealUTC = new NET_TIME();
}

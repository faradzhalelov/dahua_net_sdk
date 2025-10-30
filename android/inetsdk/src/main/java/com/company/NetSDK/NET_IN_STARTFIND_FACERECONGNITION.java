package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#StartFindFaceRecognition} input parameter
 * \else
 * {@link INetSDK#StartFindFaceRecognition} 接口输入参数
 * \endif
 */
public class NET_IN_STARTFIND_FACERECONGNITION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Personnel information query is valid
     * \else
     * 人员信息查询条件是否有效
     * \endif
     */
    public boolean                bPersonEnable;

    /**
     * \if ENGLISH_LANG
     * Personnel information query
     * \else
     * 人员信息查询条件
     * \endif
     */
    public FACERECOGNITION_PERSON_INFO stPerson = new FACERECOGNITION_PERSON_INFO();

    /**
     * \if ENGLISH_LANG
     * Target Matching Options
     * \else
     * 目标匹配选项
     * \endif
     */
    public NET_FACE_MATCH_OPTIONS stMatchOptions = new NET_FACE_MATCH_OPTIONS();

    /**
     * \if ENGLISH_LANG
     * Query filters
     * \else
     * 查询过滤条件
     * \endif
     */
    public NET_FACE_FILTER_CONDTION stFilterInfo = new NET_FACE_FILTER_CONDTION();

    /**
     * \if ENGLISH_LANG
     * Picture binary data
     * \else
     * 图片二进制数据
     * \endif
     */
    public byte[]                pBuffer;

    /**
     * \if ENGLISH_LANG
     * Picture binary data len
     * \else
     * 图片的缓冲数据长度
     * \endif
     */
    public int                  nBufferLen;
    /**
     * \if ENGLISH_LANG
     * Channel ID
     * \else
     * 通道号
     * \endif
     */
    public int                 nChannelID;

    /**
     * \if ENGLISH_LANG
     * use stPersonInfoEx when bUsePersonInfoEx is true, otherwise use stPersonInfo
     * \else
     * 人员信息查询条件是否有效, 并使用扩展结构体
     * \endif
     */
    public boolean				bPersonExEnable;

    /**
     * \if ENGLISH_LANG
     * expansion of personnel information. when bPersonExEnable is true， valid
     * \else
     * 人员信息扩展，bPersonExEnable为true时，有效
     * \endif
     */
    public FACERECOGNITION_PERSON_INFOEX	stPersonInfoEx = new FACERECOGNITION_PERSON_INFOEX();

    /**
     * \if ENGLISH_LANG
     * the count of small picture ID
     * \else
     * 小图ID数量
     * \endif
     */
    public int					nSmallPicIDNum;

    /**
     * \if ENGLISH_LANG
     * small picture ID
     * \else
     * 小图ID
     * \endif
     */
    public int					nSmallPicID[] = new int[FinalVar.MAX_SMALLPIC_NUM];

}

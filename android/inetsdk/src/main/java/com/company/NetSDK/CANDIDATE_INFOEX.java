package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the expansion of candidate information
 * \else
 * 当前目标匹配到的候选对象信息
 * \endif
 */
public class CANDIDATE_INFOEX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Extend of person info
     * \else
     * 人员信息扩展，
     * 布控（禁止名单）库,指布控库中人员信息；
     * 历史库,指历史库中人员信息；
     * 报警库,指布控库的人员信息
     * \endif
     */
    public FACERECOGNITION_PERSON_INFOEX  stPersonInfo = new FACERECOGNITION_PERSON_INFOEX();

    /**
     * \if ENGLISH_LANG
     * Similarity in comparison with query image, expressed in percentage, 1~100
     * \else
     * 和查询图片的相似度,百分比表示,1~100
     * \endif
     */
    public byte                         bySimilarity;

    /**
     * \if ENGLISH_LANG
     * Range officer's database, see EM_FACE_DB_TYPE
     * \else
     * 人员所属数据库范围,详见EM_FACE_DB_TYPE
     * \endif
     */
    public byte                         byRange;

    /**
     * \if ENGLISH_LANG
     * When byRange historical database effectively, which means that the query time staff appeared
     * \else
     * 当byRange为历史数据库时有效,表示查询人员出现的时间
     * \endif
     */
    public NET_TIME                     stTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * When byRange historical database effectively, which means that people place a query appears
     * \else
     * 当byRange为历史数据库时有效,表示查询人员出现的地点
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
    public boolean                         bIsHit;

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

    /**
     * \if ENGLISH_LANG
     * File path
     * \else
     * 文件路径
     * \endif
     */
    public byte            			 szFilePathEx[] = new byte[256];

}

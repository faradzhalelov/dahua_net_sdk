package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief inside object info
 * \else
 * @brief 物品信息
 * \endif
 */
public class NET_INSIDE_OBJECT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  danger grade,{@link EM_DANGER_GRADE_TYPE}
     * \else
     * 物品危险等级,{@link EM_DANGER_GRADE_TYPE}
     * \endif
     */
    public int					emDangerGrade;

    /**
     * \if ENGLISH_LANG
     *  inside object type,{@link EM_INSIDE_OBJECT_TYPE}
     * \else
     * 物品类型,{@link EM_INSIDE_OBJECT_TYPE}
     * \endif
     */
    public int					emObjType;

    /**
     * \if ENGLISH_LANG
     *  Similarity
     * \else
     * 相似度
     * \endif
     */
    public int					nSimilarity;

    /**
     * \if ENGLISH_LANG
     *  bounding Box
     * \else
     * 包围盒
     * \endif
     */
    public NET_RECT					stuBoundingBox = new NET_RECT();

    /**
     * \if ENGLISH_LANG
     *  Custom item type, emObjType is EM_INSIDE_OBJECT_UNKNOWN used 
     * \else
     * 自定义物品类型，emObjType为 EM_INSIDE_OBJECT_UNKNOWN 时使用
     * \endif
     */
    public byte					szObjectType[] = new byte[32];

}
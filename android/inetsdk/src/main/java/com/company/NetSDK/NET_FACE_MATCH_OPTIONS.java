package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Target Matching Options
 * \else
 * 目标匹配选项
 * \endif
 */
public class NET_FACE_MATCH_OPTIONS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Important level 1 to 10 staff, the higher the number the more important (check important level greater than or equal to this level of staff)
     * \else
     * 人员重要等级    1~10,数值越高越重要,(查询重要等级大于等于此等级的人员)
     * \endif
     */
    public int                  nMatchImportant;

    /**
     * \if ENGLISH_LANG
     * Target comparison mode, see {@link EM_FACE_COMPARE_MODE}
     * \else
     * 目标比对模式,详见 {@link EM_FACE_COMPARE_MODE}
     * \endif
     */
    public int                  emMode;

    /**
     * \if ENGLISH_LANG
     * Target the number of regional
     * \else
     * 目标区域个数
     * \endif
     */
    public int                 nAreaNum;

    /**
     * \if ENGLISH_LANG
     * Regional groupings of people face is {@link EM_FACE_COMPARE_MODE#NET_FACE_COMPARE_MODE_AREA} effective when emMode
     * refer to {@link EM_FACE_AREA_TYPE}
     * \else
     * 目标区域组合,emMode为 {@link EM_FACE_COMPARE_MODE#NET_FACE_COMPARE_MODE_AREA} 时有效
     * 参考 {@link EM_FACE_AREA_TYPE}
     * \endif
     */
    public int                szAreas[] = new int[FinalVar.MAX_FACE_AREA_NUM];

    /**
     * \if ENGLISH_LANG
     * Recognition accuracy (ranging from 1 to 10, with the value increases, the detection accuracy is improved, the detection rate of decline. Minimum value of 1 indicates the detection speed priority, the maximum is 10, said detection accuracy preferred. Temporarily valid only for face detection)
     * \else
     * 识别精度(取值1~10,随着值增大,检测精度提高,检测速度下降。最小值为1 表示检测速度优先,最大值为10表示检测精度优先。 暂时只对目标检测有效)
     * \endif
     */
    public int                 nAccuracy;

    /**
     * \if ENGLISH_LANG
     * Similarity (must be greater than the degree of acquaintance before the report; expressed as a percentage, from 1 to 100)
     * \else
     * 相似度(必须大于该相识度才报告;百分比表示,1~100)
     * \endif
     */
    public int                 nSimilarity;

    /**
     * \if ENGLISH_LANG
     * Reported the largest number of candidate (based on similarity to sort candidates to take the maximum number of similarity report)
     * \else
     * 报告的最大候选个数(根据相似度进行排序,取相似度最大的候选人数报告)
     * \endif
     */
    public int                 nMaxCandidate;
}

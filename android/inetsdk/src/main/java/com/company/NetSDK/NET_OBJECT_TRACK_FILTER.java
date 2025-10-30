package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Target trajectory filtering rules
 * \else
 * @brief 目标轨迹过滤规则
 * \endif
 */
public class NET_OBJECT_TRACK_FILTER implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of target filtering rule coordinate points
     * \else
     *  目标过滤规则坐标点个数
     * \endif
     */
    public int					nDetectRuleCount;

    /**
     * \if ENGLISH_LANG
     *  Target filtering rule coordinate point set
     * \else
     *  目标过滤规则坐标点集合
     * \endif
     */
    public NET_POINT					stuDetectRule[] = new NET_POINT[32];

    /**
     * \if ENGLISH_LANG
     *  Rule type, 0, within the region, the DetectRule field is used to describe the coordinates of each vertex in the irregular region, 1, passing through a line, the DetectRule field is used to describe the line segment points, and the Direction field represents the direction in which the target passes through
     * \else
     *  规则类型, 0,区域内,DetectRule字段为描述不规则区域的各顶点坐标, 1,过线,DetectRule字段为描述线段点，并且Direction字段表示目标经过方向
     * \endif
     */
    public int					nRuleType;

    /**
     * \if ENGLISH_LANG
     *  Detection direction, 1: "LeftToRight", 2: "RightToLeft", 3: "Both", when the RuleType field value is 1, this field is valid
     * \else
     *  检测方向, 1:"LeftToRight", 2:"RightToLeft", 3:"Both", 当RuleType字段值为1时，该字段有效
     * \endif
     */
    public int					nDirection;

    public NET_OBJECT_TRACK_FILTER() {
        for(int i = 0; i < 32; i ++) {
            this.stuDetectRule[i] = new NET_POINT();
        }
    }
}
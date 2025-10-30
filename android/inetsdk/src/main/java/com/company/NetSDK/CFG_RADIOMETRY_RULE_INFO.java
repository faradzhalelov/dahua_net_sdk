package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief temperature rule configuration structure
 * \else
 * @brief 测温规则配置结构
 * \endif
 */
public class CFG_RADIOMETRY_RULE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  rule number
     * \else
     *  规则个数
     * \endif
     */
    public int					nCount;

    /**
     * \if ENGLISH_LANG
     *  Temperature Monitoring rule
     * \else
     *  测温规则
     * \endif
     */
    public CFG_RADIOMETRY_RULE					stRule[] = new CFG_RADIOMETRY_RULE[512];

    /**
     * \if ENGLISH_LANG
     *  Temperature Monitoring rule-EX
     * \else
     *  测温规则-扩展新增的字段
     * \endif
     */
    public CFG_RADIOMETRY_RULE_EX					stRuleEx[] = new CFG_RADIOMETRY_RULE_EX[512];

    public CFG_RADIOMETRY_RULE_INFO() {
        for(int i = 0; i < 512; i ++){
            stRule[i] = new CFG_RADIOMETRY_RULE();
            stRuleEx[i] = new CFG_RADIOMETRY_RULE_EX();
        }
    }
}
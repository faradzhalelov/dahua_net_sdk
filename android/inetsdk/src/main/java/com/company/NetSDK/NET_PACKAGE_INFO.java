package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief package info
 * \else
 * @brief 包裹信息
 * \endif
 */
public class NET_PACKAGE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  danger grade of the package, highest danger grade is displayed if the package has multiple danger grades,{@link EM_DANGER_GRADE_TYPE}
     * \else
     * 包裹危险等级, 一个包裹内有多个危险等级显示最高危等级,{@link EM_DANGER_GRADE_TYPE}
     * \endif
     */
    public int					emDangerGrade;

}
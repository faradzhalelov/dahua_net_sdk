package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief compare result
 * \else
 * @brief 比对结果
 * \endif
 */
public class EM_COMPARE_RESULT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_COMPARE_RESULT_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  success
     * \else
     *  成功
     * \endif
     */
    public static final int					EM_COMPARE_RESULT_SUCCESS = 0;

    /**
     * \if ENGLISH_LANG
     *  other error
     * \else
     *  其他错误
     * \endif
     */
    public static final int					EM_COMPARE_RESULT_OTHERERROR = 1;

    /**
     * \if ENGLISH_LANG
     *  not in face database
     * \else
     *  不在目标库中
     * \endif
     */
    public static final int					EM_COMPARE_RESULT_NOTINDATABASE = 2;

    /**
     * \if ENGLISH_LANG
     *  exceed enter times in single day
     * \else
     *  超过单日进门次数限制
     * \endif
     */
    public static final int					EM_COMPARE_RESULT_EXCEED_SINGLE_DAY_ENTER_TIMES = 3;

    /**
     * \if ENGLISH_LANG
     *  no enter record, leave fail
     * \else
     *  无进门记录，离开失败
     * \endif
     */
    public static final int					EM_COMPARE_RESULT_NO_ENTER_RECORD_LEAVE_FAIL = 4;

    /**
     * \if ENGLISH_LANG
     *  area full
     * \else
     *  区域人员已满
     * \endif
     */
    public static final int					EM_COMPARE_RESULT_AREA_FULL = 5;

    /**
     * \if ENGLISH_LANG
     *  repeat enter check fail(no normal exit record, but enter again)
     * \else
     *  防反潜验证失败(没有正常出门记录再次进门)
     * \endif
     */
    public static final int					EM_COMPARE_RESULT_REPEATENTER_CHECK_FAIL = 6;

}

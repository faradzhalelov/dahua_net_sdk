package com.company.NetSDK;

import java.io.Serializable;

/**
 * Created by 29875 on 2019/8/26.
 */
public class NET_OUT_ALARMBOXMANAGER_CAPS implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * max box number
     * \else
     * 最大支持几个盒子
     * \endif
     */
    public int								nMaxBoxNumber;

    /**
     * \if ENGLISH_LANG
     * max alarm in per box
     * \else
     * 每个盒子支持最大报警输入个数
     * \endif
     */
    public int								nMaxInputPerBox;

    /**
     * \if ENGLISH_LANG
     * max alarm out per box
     * \else
     * 每个盒子支持最大报警输出个数
     * \endif
     */
    public int								nMaxOutputPerBox;
}

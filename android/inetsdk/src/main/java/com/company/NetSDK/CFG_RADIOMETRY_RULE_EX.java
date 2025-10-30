package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Temperature Monitoring ruleEX
 * \else
 * @brief 测温规则扩展
 * \endif
 */
public class CFG_RADIOMETRY_RULE_EX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Black Body Temp,The accuracy is 0.1, and the actual value is increased by 10 times; For example, the display is 38 degrees, and the actual value is 380; If you need to set 39 degrees, for example, this value needs to be passed in 390
     * \else
     *  标定黑体温度，精度0.1，实际值扩大了10倍；比如显示是38度，实际该值获取的是380；如果需要设置39度，如该值需要传入390。
     * \endif
     */
    public int					nBlackBodyTemp;

}
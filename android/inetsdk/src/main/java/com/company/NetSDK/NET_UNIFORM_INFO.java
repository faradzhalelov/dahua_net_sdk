package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Status information of uniform related attributes
 * \else
 * @brief 制服相关属性状态信息
 * \endif
 */
public class NET_UNIFORM_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether wearing uniform, 0: Unknown, 1: None, 2: Yes, 3: No uniform of the specified color exists
     * \else
     *  是否有穿着制服, 0: 未知, 1: 没有, 2: 有, 3:不存在指定颜色制服
     * \endif
     */
    public int					nHasUniform;

    /**
     * \if ENGLISH_LANG
     *  Uniform Color,{@link EM_CLOTHES_COLOR}
     * \else
     *  制服颜色,{@link EM_CLOTHES_COLOR}
     * \endif
     */
    public int					emUniformColor;

}
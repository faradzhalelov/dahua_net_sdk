package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * @brief UTC时间
 * \endif
 */
public class NET_UTCTIME implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  utc
     * \else
     *  utc时间
     * \endif
     */
    public int					utc;

    /**
     * \if ENGLISH_LANG
     *  tolerance, allows the setting time to be seconds away from the current time without modification; set:valid
     * \else
     *  容差，表示容许设置时间和当前差多少秒内不做修改 (下发时用到)
     * \endif
     */
    public int					tolerance;

}
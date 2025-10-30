package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Temperature Monitoring rule local parameter config
 * \else
 * @brief 测温规则本地参数配置
 * \endif
 */
public class CFG_RADIOMETRY_LOCALPARAM implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  enable local config or not
     * \else
     *  是否启用本地配置
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  target radiation coefficient, floating poing number
     * \else
     *  目标辐射系数	浮点数 0~1
     * \endif
     */
    public float					fObjectEmissivity;

    /**
     * \if ENGLISH_LANG
     *  target distance	
     * \else
     *  目标距离	
     * \endif
     */
    public int					nObjectDistance;

    /**
     * \if ENGLISH_LANG
     *  target reflection temperature
     * \else
     *  目标反射温度
     * \endif
     */
    public int					nRefalectedTemp;

}
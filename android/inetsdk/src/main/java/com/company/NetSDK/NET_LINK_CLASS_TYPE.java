package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Linkage business category options
 * \else
 * @brief 联动业务大类选项
 * \endif
 */
public class NET_LINK_CLASS_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The channel number of the business to be cascaded
     * \else
     * 待级联的业务所在通道号
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     * Business categories to be cascaded，{@link EM_SCENE_CLASS_TYPE}
     * \else
     * 待级联的业务大类，{@link EM_SCENE_CLASS_TYPE}
     * \endif
     */
    public int					emClassType;

    /**
     * \if ENGLISH_LANG
     * Resvered
     * \else
     * 预留字段
     * \endif
     */
    public byte					szResvered[] = new byte[252];

}
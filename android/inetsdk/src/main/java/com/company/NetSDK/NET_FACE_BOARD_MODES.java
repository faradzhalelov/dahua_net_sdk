package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Mode specific capability
 * \else
 * @brief 模式具体能力
 * \endif
 */
public class NET_FACE_BOARD_MODES implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Mode name: Clock mode  GP: work card mode
     * \else
     *  模式名称  Clock：时钟模式 GP：工牌模式
     * \endif
     */
    public byte					szName[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Template type ID there may be multiple templates in the same mode
     * \else
     *  模板类型ID 同一种模式下可能有多种模板
     * \endif
     */
    public int					nTypes;

}

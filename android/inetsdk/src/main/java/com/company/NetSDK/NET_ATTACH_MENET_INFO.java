package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief attachement info
 * \else
 * @brief 车内饰品信息
 * \endif
 */
public class NET_ATTACH_MENET_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  attachment type,{@link EM_ATTACHMENT_TYPE}
     * \else
     *  车内物品类型,{@link EM_ATTACHMENT_TYPE}
     * \endif
     */
    public int					emAttachMentType;

}
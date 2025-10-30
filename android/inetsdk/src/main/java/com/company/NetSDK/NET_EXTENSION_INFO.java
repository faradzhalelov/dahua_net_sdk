package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Extension info
 * \else
 * 事件扩展信息
 * \endif
 */
public class NET_EXTENSION_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Chinese standard event ID
     * \else
     * 国标事件ID
     * \endif
     */
    public byte                szEventID[] = new byte[FinalVar.MAX_EVENT_ID_LEN];
}

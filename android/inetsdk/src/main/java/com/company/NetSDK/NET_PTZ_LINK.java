package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * pos ptz link
 * \else
 * 云台联动项
 * \endif
 */
public class NET_PTZ_LINK implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * ptz link type, refer to {@link EM_PTZ_LINK_TYPE}
     * \else
     * 云台联动类型, 参考 {@link EM_PTZ_LINK_TYPE}
     * \endif
     */
    public int		                emType;

    /**
     * \if ENGLISH_LANG
     * link param 1
     * \else
     * 联动参数1
     * \endif
     */
    public int						nParam1;

    /**
     * \if ENGLISH_LANG
     * link param 2
     * \else
     * 联动参数2
     * \endif
     */
    public int						nParam2;

    /**
     * \if ENGLISH_LANG
     * link param 3
     * \else
     * 联动参数3
     * \endif
     */
    public int						nParam3;

    /**
     * \if ENGLISH_LANG
     * ptz link channelID
     * \else
     * 所联动云台通道
     * \endif
     */
    public int						nChannelID;
}

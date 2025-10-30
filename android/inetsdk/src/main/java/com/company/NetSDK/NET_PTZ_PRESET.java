package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ preset
 * \else
 * 云台预置点
 * \endif
 */
public class NET_PTZ_PRESET implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * no.
     * \else
     * 编号
     * \endif
     */
    public int                     nIndex;

    /**
     * \if ENGLISH_LANG
     * name
     * \else
     * 名称
     * \endif
     */
    public byte[]                    szName = new byte[FinalVar.PTZ_PRESET_NAME_LEN];
}

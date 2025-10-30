package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetDevCaps}NET_REMOTE_SPEAK_CAPS output param
 * \else
 *  {@link INetSDK#GetDevCaps}NET_REMOTE_SPEAK_CAPS 出参
 * \endif
 */
public class NET_OUT_REMOTE_SPEAK_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * ret Caps number
     * \else
     * 实际返回的能力集个数
     * \endif
     */
    public int						nRetCapNum;

    /**
     * \if ENGLISH_LANG
     * Caps list
     * \else
     * 能力集
     * \endif
     */
    public NET_SPEAK_CAPS[]						pstuCaps;

    /**
     * \if ENGLISH_LANG
     * max cap num
     * \else
     * 用户分配的最大能力集数组个数
     * \endif
     */
    public int						nMaxCapNum;

    public NET_OUT_REMOTE_SPEAK_CAPS(int nMaxCapNum) {
        this.nMaxCapNum = nMaxCapNum;
        pstuCaps = new NET_SPEAK_CAPS[nMaxCapNum];
        for (int i = 0; i < nMaxCapNum; i++) {
            pstuCaps[i] = new NET_SPEAK_CAPS();
        }
    }

}

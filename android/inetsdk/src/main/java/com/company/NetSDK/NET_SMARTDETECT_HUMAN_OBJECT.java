package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * object info of smart motion detection about human
 * \else
 * 智能动检(人)对象信息
 * \endif
 */
public class NET_SMARTDETECT_HUMAN_OBJECT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 人动检ID
     * \endif
     */
    public int				nHumanID;

    /**
     * \if ENGLISH_LANG
     * object ID about human
     * \else
     * 人的位置
     * \endif
     */
    public NET_RECT			stuRect = new NET_RECT();

    @Override
    public String toString() {
        return "NET_SMARTDETECT_HUMAN_OBJECT{" +
                "nHumanID=" + nHumanID +
                ", stuRect=" + stuRect.toString() +
                '}';
    }
}

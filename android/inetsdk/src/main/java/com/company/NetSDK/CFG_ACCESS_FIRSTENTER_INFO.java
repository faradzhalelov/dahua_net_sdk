package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Calibrate Time
 * \else
 * 时间段
 * \endif
 */
public class CFG_ACCESS_FIRSTENTER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Within certain period, only when user with first card right passes verification, other users can swipe card (Cardand so on) to enter, TRUE enable FALSE off
     * \else
     * 在指定的时间,只有拥有首卡权限的用户验证通过后，其他的用户才能刷卡(信息等)进入，TRUE 使能 FALSE 关闭
     * \endif
     */
    public boolean             bEnable;
    /**
     * \if ENGLISH_LANG
     * First card right verification passed accesscontrol status,refer to CFG_ACCESS_FIRSTENTER_STATUS
     * \else
     * 首卡权限验证通过后的门禁状态，参考CFG_ACCESS_FIRSTENTER_STATUS
     * \endif
     */
    public int                   emStatus;

    /**
     * \if ENGLISH_LANG
     * Need first card verification period, value as channel no.
     * \else
     * 需要首卡验证的时间段, 值为通道号
     * \endif
     */
    public int                   nTimeIndex;
}

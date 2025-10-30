package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Fan status
 * \else
 * 风扇状态
 * \endif
 */
public class SDK_FAN_STATUS implements Serializable {
    /**
     *
     */
    private static final long       serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * Search succeeded or not
     * \else
     * 查询是否成功
     * \endif
     */
    public boolean                  bEnable;
    /**
     * \if ENGLISH_LANG
     * Fan amount
     * \else
     * 风扇数量
     * \endif
     */
    public int                      nCount;
    /**
     * \if ENGLISH_LANG
     * Fan info
     * \else
     * 风扇信息
     * \endif
     */
    public SDK_FAN_INFO stuFans[] = new SDK_FAN_INFO[16];

    public SDK_FAN_STATUS() {
        for (int i = 0; i < 16; i++) {
            stuFans[i] = new SDK_FAN_INFO();
        }
    }

}

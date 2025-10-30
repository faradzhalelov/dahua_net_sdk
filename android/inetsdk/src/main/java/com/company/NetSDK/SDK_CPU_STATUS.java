package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CPU status
 * \else
 * CPU状态
 * \endif
 */
public class SDK_CPU_STATUS implements Serializable {
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
     * CPU amount
     * \else
     * CPU数量
     * \endif
     */
    public int                      nCount;
    /**
     * \if ENGLISH_LANG
     * CPU info
     * \else
     * CPU信息
     * \endif
     */
    public SDK_CPU_INFO stuCPUs[] = new SDK_CPU_INFO[16];

    public SDK_CPU_STATUS() {
        for(int i = 0; i < 16; i++) {
            stuCPUs[i] = new SDK_CPU_INFO();
        }
    }



}

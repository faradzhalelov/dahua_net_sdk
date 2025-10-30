package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PIR config info
 * \else
 * PIR配置信息
 * \endif
 */
public class NET_PIR_ALARM_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * enable
     * \else
     * 使能
     * \endif
     */
    public boolean				 bEnable;

    /**
     * \if ENGLISH_LANG
     * PIR Detect Window count
     * \else
     * PIR检测区域个数
     * \endif
     */
    public int						nDetectWindowCount;

    /**
     * \if ENGLISH_LANG
     * PIR Detect window
     * \else
     * PIR检测区域
     * \endif
     */
    public NET_DETECT_WINDOW_IFNO[]	 stDetectWindow = new NET_DETECT_WINDOW_IFNO[FinalVar.MAX_DETECT_WINDOW];

    /**
     * \if ENGLISH_LANG
     * PIR alarm link
     * \else
     * 报警联动信息
     * \endif
     */
    public NET_PIR_LINK_INFO		 stPirLink = new NET_PIR_LINK_INFO();

    public NET_PIR_ALARM_INFO() {
        for(int i = 0; i < FinalVar.MAX_DETECT_WINDOW; i++) {
            stDetectWindow[i] = new NET_DETECT_WINDOW_IFNO();
        }
    }
}

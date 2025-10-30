package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * IPC supporting app display working mode Corresponding enumeration NET_EM_CFG_WORK_MODE
 * \else
 * IPC配套APP显示工作模式 对应枚举 NET_EM_CFG_WORK_MODE
 * \endif
 */
public class NET_CFG_WORK_MODE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Number of working modes
     * \else
     * 工作模式个数
     * \endif
     */
    public int nWorkModeNum;

    /**
     * \if ENGLISH_LANG
     * Work mode Subscript video channel number
     * \else
     * 工作模式 下标视频通道号
     * \endif
     */
    public NET_WORK_MODE stuWorkMode[] = new NET_WORK_MODE[16];

    public NET_CFG_WORK_MODE_INFO() {
        for (int i = 0; i < 16; i++) {
            this.stuWorkMode[i] = new NET_WORK_MODE();
        }
    }

    public NET_CFG_WORK_MODE_INFO(int nWorkModeNum) {
        this.nWorkModeNum = nWorkModeNum;
        for (int i = 0; i < nWorkModeNum; i++) {
            this.stuWorkMode[i] = new NET_WORK_MODE();
        }
    }
}

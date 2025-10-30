package com.company.NetSDK;

import java.io.Serializable;



/**
 * \if ENGLISH_LANG
 * {@link INetSDK#StartRemoteCollectToFile} input param
 * \else
 * {@link INetSDK#StartRemoteCollectToFile} 接口输入参数
 * \endif
 */
public class NET_IN_START_REMOTE_COLLECT_TO_FILE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel id,start from 0
     * \else
     * 通道号, 从0开始
     * \endif
     */
    public int                 nChannel;

    /**
     * \if ENGLISH_LANG
     * The list of collect rule
     * \else
     * 设备采集规则信息
     * \endif
     */
    public NET_REMOTE_COLLECT_TO_FILE_RULE                 stuRules[] = new NET_REMOTE_COLLECT_TO_FILE_RULE[8];

    /**
     * \if ENGLISH_LANG
     * The number of collect rule
     * \else
     * 设备采集规则数量
     * \endif
     */
    public int                 nRuleNum;

    public NET_IN_START_REMOTE_COLLECT_TO_FILE() {
        for (int i = 0; i < 8; i++) {
            stuRules[i] = new NET_REMOTE_COLLECT_TO_FILE_RULE();
        }
    }
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#GetRemoteLowRateWPANCaps} output parameter
 * \else
 * {@link INetSDK#GetRemoteLowRateWPANCaps}接口出参
 * \endif
 */
public class NET_OUT_GET_REMOTELOWRATEWPAN_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Return Channel Count
     * \else
     * 实际返回的通道个数
     * \endif
     */
    public int									nRetChannelCount;

    /**
     * \if ENGLISH_LANG
     * Device Caps
     * \else
     * 设备能力
     * \endif
     */
    public NET_REMOTE_LOW_RATE_WPAN_CAPS[]		stCaps = new NET_REMOTE_LOW_RATE_WPAN_CAPS[FinalVar.MAX_VIDEO_CHANNEL_COUNT];

    /**
     * \if ENGLISH_LANG
     * Return Code Count
     * \else
     * 实际返回的结果个数
     * \endif
     */
    public int									nRetCodeCount;

    /**
     * \if ENGLISH_LANG
     * Return Code, refer to {@link EM_RETURN_CODE_TYPE}
     * \else
     * 每个视频通道的返回结果, 参考 {@link EM_RETURN_CODE_TYPE}
     * \endif
     */
    public int[]					          stReturnCode = new int[FinalVar.MAX_VIDEO_CHANNEL_COUNT];

    public NET_OUT_GET_REMOTELOWRATEWPAN_CAPS() {
        for(int i = 0; i < FinalVar.MAX_VIDEO_CHANNEL_COUNT; i++) {
            stCaps[i] = new NET_REMOTE_LOW_RATE_WPAN_CAPS();
        }
    }
}

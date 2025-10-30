package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Get Encoding Capability set
 * \else
 * @brief 编码能力集
 * \endif
 */
public class CFG_ENCODECAP implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The Actual Number of Channels
     * \else
     *  实际通道数
     * \endif
     */
    public int					nChannelNum;

    /**
     * \if ENGLISH_LANG
     *  Each Channel Encoding Capability Information Array
     * \else
     *  各通道编码能力信息数组
     * \endif
     */
    public CFG_VIDEO_ENCODECAP					stuVideoEncodeCap[] = new CFG_VIDEO_ENCODECAP[FinalVar.MAX_VIDEO_CHANNEL_NUM];

    /**
     * \if ENGLISH_LANG
     *  Multi-screen preview mode,{@link CFG_EM_PREVIEW_MODE}
     * \elss
     *  多画面预览工作模式,{@link CFG_EM_PREVIEW_MODE}
     * \endif
     */
    public int					emPreviewMode;

    /**
     * \if ENGLISH_LANG
     *  Effective multi-screen preview window division number of species
     * \else
     *  有效的多画面预览窗口分割种类数
     * \endif
     */
    public int					nSplitModeNum;

    /**
     * \if ENGLISH_LANG
     *  Multi-screen preview window division number information, which can be 1, 4, 6, 8, 9, 16, 25, 36 ...
     * \else
     *  多画面预览窗口分割数信息, 可以为1, 4, 6, 8, 9, 16, 25, 36...
     * \endif
     */
    public int					anSplitMode[] = new int[FinalVar.MAX_PREVIEW_MODE_SPLIT_TYPE_NUM];

    /**
     * \if ENGLISH_LANG
     *  Supported Audio Coding Sampling Rate
     * \else
     *  支持的音频编码采样率
     * \endif
     */
    public int					nAudioFrequence[] = new int[16];

    /**
     * \if ENGLISH_LANG
     *  Actual Number of Audio Coding Sampling Rates Supported
     * \else
     *  支持的音频编码采样率的实际个数
     * \endif
     */
    public int					nAudioFrequenceCount;

    public CFG_ENCODECAP() {
        for(int i = 0; i < FinalVar.MAX_VIDEO_CHANNEL_NUM; i ++){
            this.stuVideoEncodeCap[i] = new CFG_VIDEO_ENCODECAP();
        }
    }
}

package com.company.NetSDK;
import java.io.Serializable;

public class NET_IN_AUDIO_DECODE_CAPS implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel id
     * \else
     * 通道号
     * \endif
     */
    public int		nChannel;

    /**
     * \if ENGLISH_LANG
     * data type
     * \else
     * 数据流源类型
     * \endif
     */
    public int		emSourceType;
}

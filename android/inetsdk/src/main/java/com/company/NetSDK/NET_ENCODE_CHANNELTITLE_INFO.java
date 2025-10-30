package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * channel title info
 * \else
 * 通道名称配置
 * \endif
 */
public class NET_ENCODE_CHANNELTITLE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel title
     * \else
     * 通道名称
     * \endif
     */
    public byte[]				szChannelName = new byte[FinalVar.MAX_CHANNEL_NAME_LEN];

    @Override
    public String toString() {
        return "NET_ENCODE_CHANNELTITLE_INFO{" +
                "szChannelName=" + Arrays.toString(szChannelName) +
                '}';
    }
}

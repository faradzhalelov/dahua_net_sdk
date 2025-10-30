package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Smart encode caps
 * \else
 * Smart编码使能
 * \endif
 */
public class SMART_ENCODE_CAPS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  1: supports open encode locate P frame function; 1: not support Smart encode; 2: not support encode
     * \else
     *  1支持开启编码重定位P帧功能；0不支持Smart编码(但能输出普通码流)；-1不支持编码(比如主码流分辨率过大，导致资源不足，辅码流2不能编码，但降低主码流分辨率，辅2可以正常编码)
     * \endif
     */
    public int					nSmartEncodeCap;

    @Override
    public String toString() {
        return "SMART_ENCODE_CAPS_INFO{" +
                "nSmartEncodeCap=" + nSmartEncodeCap +
                '}';
    }
}

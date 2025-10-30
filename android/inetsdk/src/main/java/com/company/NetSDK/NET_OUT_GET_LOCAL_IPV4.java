package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#GetLocalIPv4} output param
 * \else
 * 接口{@link INetSDK#GetLocalIPv4}输出参数
 * \endif
 */
public class NET_OUT_GET_LOCAL_IPV4 implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * IPv4 Address
     * \else
     * 存放IPv4的缓存区，不能为空
     * \endif
     */
    public byte[][] szIPv4 = new byte[32][FinalVar.SDK_MAX_IPADDRV4_LEN];

    /**
     * \if ENGLISH_LANG
     * IPv4 valid number
     * \else
     * 实际返回有效IPv4个数
     * \endif
     */
    public int nValidNum;
}

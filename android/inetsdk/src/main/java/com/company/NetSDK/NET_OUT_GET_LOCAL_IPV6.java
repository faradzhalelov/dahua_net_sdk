package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#GetLocalIPv6} output param
 * \else
 * 接口{@link INetSDK#GetLocalIPv6}输出参数
 * \endif
 */
public class NET_OUT_GET_LOCAL_IPV6 implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * IPv6 Address
     * \else
     * 存放IPv6的缓存区，不能为空
     * \endif
     */
    public byte[][] szIPv6 = new byte[32][FinalVar.SDK_MAX_IPADDRV6_LEN];

    /**
     * \if ENGLISH_LANG
     * IPv6 valid number
     * \else
     * 实际返回有效IPv6个数
     * \endif
     */
    public int nValidNum;
}

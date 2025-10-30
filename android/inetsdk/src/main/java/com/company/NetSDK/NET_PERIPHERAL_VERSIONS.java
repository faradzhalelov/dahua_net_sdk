package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *　Peripheral version
 * \else
 * 设备的外设软件版本
 * \endif
 */
public class NET_PERIPHERAL_VERSIONS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Peripheral version
     * \else
     * 对应外设的版本信息
     * \endif
     */
    public byte                        szVersion[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Peripheral type,refer to {@link EM_PERIPHERAL_TYPE}
     * \else
     * 外设类型,参考{@link EM_PERIPHERAL_TYPE}
     * \endif
     */
    public int          emPeripheralType;

    /**
     * \if ENGLISH_LANG
     * The compilation date of the corresponding peripheral version, accurate to days
     * \else
     * 对应外设版本的编译日期，精确到天,
     * \endif
     */
    public byte                        szBuildDate[] = new byte[24];


}

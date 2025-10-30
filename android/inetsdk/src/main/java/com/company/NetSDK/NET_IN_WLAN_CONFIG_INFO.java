package com.company.NetSDK;

import java.io.Serializable;



/**
 * \if ENGLISH_LANG
 * {@link INetSDK#SetWlanConfigInfo}input parameter
 * \else
 * {@link INetSDK#SetWlanConfigInfo} 接口输入参数
 * \endif
 */
public class NET_IN_WLAN_CONFIG_INFO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Set MAC address
     * \else
     * 设置MAC地址
     * \endif
     */
    public byte             szBSSID[] = new byte[18];

    /**
     * \if ENGLISH_LANG
     * Network name
     * \else
     * 网络名称
     * \endif
     */
    public byte             szSSID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Channel
     * \else
     * 通道
     * \endif
     */
    public int              nChannel;

    /**
     * \if ENGLISH_LANG
     * Corresponding to the first dimension subscript of WEP password array, the device will take the array value according to the subscript
     * \else
     * 对应WEP密码数组第一维下标，设备端会根据下标取数组值
     * \endif
     */
    public int              nKeyID;

    /**
     * \if ENGLISH_LANG
     * Encryption method，refer to {@link EM_WLAN_ENCRYPTION_TYPE}
     * \else
     * 加密方式,取值参考 {@link EM_WLAN_ENCRYPTION_TYPE}
     * \endif
     */
    public int              emEncryption;

    /**
     * \if ENGLISH_LANG
     * WEP password array
     * For example, using ASCII type password, 64 bit encryption uses 5 alphanumeric characters, 128 encryption uses 13 alphanumeric characters (0-9, A-Z, A-Z)
     * If a hexadecimal password is used, 10 alphanumeric characters are used for 64 bit encryption, and 26 alphanumeric characters (0-9, A-F) are used for 128 encryption
     * \else
     * WEP密码数组
     * 如使用ASCII类型的密码，64位加密使用5个字母数字字符，128为加密使用13个字母数字字符（0-9，a-z，A-Z）
     * 如果使用16进制的密码，64位加密使用10个字母数字字符，128为加密使用26个字母数字字符（0-9，A-F）
     * \endif
     */
    public byte               szKeys[][] = new byte[4][128];
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Reboot type
 * \else
 * 重启类型
 * \endif
 */
public class DEV_VARIABLE_CARS_MANAGER_REBOOT_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int DEV_VARIABLE_CARS_MANAGER_REBOOT_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * No reboot
     * \else
     * 不重启
     * \endif
     */
    public static final int DEV_VARIABLE_CARS_MANAGER_REBOOT_TYPE_NO_REBOOT = 0;

    /**
     * \if ENGLISH_LANG
     * Reboot
     * \else
     * 重启
     * \endif
     */
    public static final int DEV_VARIABLE_CARS_MANAGER_REBOOT_TYPE_REBOOT = 1;
}

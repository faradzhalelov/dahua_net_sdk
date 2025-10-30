package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *
 * \else
 * 手机登陆过滤可选方式,参数int,按照类型进行|或操作。
 * \endif
 */
public class EM_OPTTYPE_MOBILE_TYPE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 设备属性
     * \endif
     */
    public final static int OPTTYPE_MOBILE_DEVICE_ATTR = 0x00000001;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 设备序列号
     * \endif
     */
    public final static int OPTTYPE_MOBILE_DEVICE_SN = 0x00000002;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 硬盘信息
     * \endif
     */
    public final static int OPTTYPE_MOBILE_DISK_INFO = 0x00000004;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 数字通道个数
     * \endif
     */
    public final static int OPTTYPE_MOBILE_DIGITAL_NUM = 0x00000008;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 报警输入输出
     * \endif
     */
    public final static int OPTTYPE_MOBILE_ALARM_IO = 0x00000010;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 能力集
     * \endif
     */
    public final static int OPTTYPE_MOBILE_DEVICE_ABILITY = 0x00000020;


    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 查询软件版本信息APP优化
     * \endif
     */
    public final static int OPTTYPE_MOBILE_STATE_SOFTWARE = 0x00001000;
}

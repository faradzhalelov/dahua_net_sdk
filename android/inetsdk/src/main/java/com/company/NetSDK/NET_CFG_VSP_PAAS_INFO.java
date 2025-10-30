package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * lecheng cloud register config{@link  NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_VSP_PAAS}
 * \else
 * LC云注册配置 对应枚举 {@link  NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_VSP_PAAS}
 * \endif
 */
public class NET_CFG_VSP_PAAS_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * enable
     * \else
     * 接入使能,可用于WEB端获取/设置接入使能
     * \endif
     */
    public boolean							bEnable;

    /**
     * \if ENGLISH_LANG
     * whether online
     * \else
     * 是否在线标识,可用于判断设备是否与平台建立正常连接
     * \endif
     */
    public boolean							bOnline;

    /**
     * \if ENGLISH_LANG
     * register server IP
     * \else
     * 注册服务器地址
     * \endif
     */
    public byte							szRsServerIP[] = new byte[FinalVar.SDK_MAX_IPADDR_EX_LEN];

    /**
     * \if ENGLISH_LANG
     * register server port
     * \else
     * 注册服务器端口
     * \endif
     */
    public int							    nRsServerPort;

    /**
     * \if ENGLISH_LANG
     * device SN
     * \else
     * 设备序列号
     * \endif
     */
    public byte							szSN[] = new byte[FinalVar.SDK_DEV_SERIALNO_LEN];

    /**
     * \if ENGLISH_LANG
     * device check code
     * \else
     * 设备验证码
     * \endif
     */
    public byte							szCheckCode[] = new byte[FinalVar.SDK_DEV_SERIALNO_LEN];

    /**
     * \if ENGLISH_LANG
     * register type,refer to {@link NET_EM_REGISTER_TYPE}
     * \else
     * 注册类型,具体值意义参考{@link NET_EM_REGISTER_TYPE}
     * \endif
     */
    public int			emType;

}

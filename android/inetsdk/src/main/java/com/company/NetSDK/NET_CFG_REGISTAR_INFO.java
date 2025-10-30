package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Registar server info
 * \else
 * @brief 注册服务器配置信息
 * \endif
 */
public class NET_CFG_REGISTAR_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  name of registar server,exclusive
     * \else
     *  注册服务器名称，唯一
     * \endif
     */
    public byte					szRegistarName[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     *  type of registar server  {@link NET_EM_REGISTAR_SERVER_TYPE}
     * \else
     *  注册服务器类型   {@link NET_EM_REGISTAR_SERVER_TYPE}
     * \endif
     */
    public int					emServerType;

    /**
     * \if ENGLISH_LANG
     *  enable to registar
     * \else
     *  是否注册
     * \endif
     */
    public boolean					bRegistarEnable;

    /**
     * \if ENGLISH_LANG
     *  registar address
     * \else
     *  注册地址
     * \endif
     */
    public byte					szAddress[] = new byte[FinalVar.SDK_MAX_IPADDR_EX_LEN];

    /**
     * \if ENGLISH_LANG
     *  registar port
     * \else
     *  注册端口
     * \endif
     */
    public int					nPort;

    /**
     * \if ENGLISH_LANG
     *  registar password
     * \else
     *  注册密码
     * \endif
     */
    public byte					szPassword[] = new byte[FinalVar.MAX_COMMON_STRING_64];

}
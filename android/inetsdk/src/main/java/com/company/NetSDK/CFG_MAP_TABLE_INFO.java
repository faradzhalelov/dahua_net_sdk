package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief mapping table information
 * \else
 * @brief 映射表信息
 * \endif
 */
public class CFG_MAP_TABLE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  enable switch
     * \else
     *  使能开关
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  service name, OldUPnP implementation depends on this field
     * \else
     *  服务名称，OldUPnP实现依赖该字段
     * \endif
     */
    public byte					szServiceName[] = new byte[FinalVar.CFG_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     *  service type,{@link EM_SERVICE_TYPE}
     * \else
     *  服务类型,{@link EM_SERVICE_TYPE}
     * \endif
     */
    public int					emServiceType;

    /**
     * \if ENGLISH_LANG
     *  protocol type,{@link EM_PROTOCOL_TYPE}
     * \else
     *  协议类型,{@link EM_PROTOCOL_TYPE}
     * \endif
     */
    public int					emProtocol;

    /**
     * \if ENGLISH_LANG
     *  internal port
     * \else
     *  内部端口
     * \endif
     */
    public int					nInnerPort;

    /**
     * \if ENGLISH_LANG
     *  external port
     * \else
     *  外部端口
     * \endif
     */
    public int					nOuterPort;

}

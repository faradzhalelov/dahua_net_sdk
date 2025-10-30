package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief net app capacity
 * \else
 * @brief 网络应用能力集
 * \endif
 */
public class CFG_CAP_NETAPP implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  card count
     * \else
     *  网卡数量
     * \endif
     */
    public int					nNetCardCount;

    /**
     * \if ENGLISH_LANG
     *  number of net type
     * \else
     *  网络类型个数
     * \endif
     */
    public int					nNetTypeNumber;

    /**
     * \if ENGLISH_LANG
     *  net type, "PPPoE","WIFI","3G","LAN"
     * \else
     *  具体网络类型, "PPPoE"，"WIFI"，"3G"，"LAN"
     * \endif
     */
    public byte					szNetType[][] = new byte[FinalVar.MAX_NET_TYPE_NUM][FinalVar.MAX_NET_TYPE_LEN];

}
package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief state record set info
 * \else
 * @brief 状态记录记录集信息
 * \endif
 */
public class NET_RECORD_REGISTER_USER_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  record set no., read-only
     * \else
     *  记录集编号,只读
     * \endif
     */
    public int					nRecNo;

    /**
     * \if ENGLISH_LANG
     *  create time
     * \else
     *  创建时间
     * \endif
     */
    public NET_TIME					stuCreateTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  user ID
     * \else
     *  用户ID
     * \endif
     */
    public byte					szUserID[] = new byte[FinalVar.SDK_MAX_USERID_LEN];

    /**
     * \if ENGLISH_LANG
     *  online or not
     * \else
     *  是否在线
     * \endif
     */
    public boolean					bOnline;

    /**
     * \if ENGLISH_LANG
     *  network address
     * \else
     *  网络地址
     * \endif
     */
    public byte					szAddress[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];

    /**
     * \if ENGLISH_LANG
     *  port no.  
     * \else
     *  端口号
     * \endif
     */
    public int					nPort;

    /**
     * \if ENGLISH_LANG
     *  audio talk status ,{@link EM_REGISTER_USER_STATE}
     * \else
     *  语音对讲状态,{@link EM_REGISTER_USER_STATE}
     * \endif
     */
    public int					emVideoTalkState;

    /**
     * \if ENGLISH_LANG
     *  online time
     * \else
     *  上线时间
     * \endif
     */
    public NET_TIME					stuOnlineTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  offline time
     * \else
     *  下线时间
     * \endif
     */
    public NET_TIME					stuOfflineTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  device type,{@link EM_REGISTER_USER_STATE_DEV_TYPE}
     * \else
     *  设备类型,{@link EM_REGISTER_USER_STATE_DEV_TYPE}
     * \endif
     */
    public int					emDevType;

    /**
     * \if ENGLISH_LANG
     *  whether support lock,{@link EM_REGISTER_USER_STATE_SUPPORTLOCK_TYPE}
     * \else
     *  是否支持锁,{@link EM_REGISTER_USER_STATE_SUPPORTLOCK_TYPE}
     * \endif
     */
    public int					emSupportLock;

    /**
     * \if ENGLISH_LANG
     *  Monitor State,{@link NET_MONITORSTATE_TYPE}
     * \else
     *  预览状态,{@link NET_MONITORSTATE_TYPE}
     * \endif
     */
    public int					emMonitorState;

}
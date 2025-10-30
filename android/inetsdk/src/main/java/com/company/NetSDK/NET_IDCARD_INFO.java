package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief IDCard info
 * \else
 * @brief 证件信息
 * \endif
 */
public class NET_IDCARD_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  IDCard message type,{@link EM_IDCARD_MSG_TYPE}
     * \else
     *  证件消息类型,{@link EM_IDCARD_MSG_TYPE}
     * \endif
     */
    public int					emIDCardMsgType;

    /**
     * \if ENGLISH_LANG
     *  card name
     * \else
     *  姓名
     * \endif
     */
    public byte					szCitizenName[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  sex,{@link EM_CITIZENIDCARD_SEX_TYPE}
     * \else
     *  性别,{@link EM_CITIZENIDCARD_SEX_TYPE}
     * \endif
     */
    public int					emSexType;

    /**
     * \if ENGLISH_LANG
     *  0 invalid data 
     * \else
     *  0 无效数据
     * \endif
     */
    public int					nMZ;

    /**
     * \if ENGLISH_LANG
     *  birthday
     * \else
     *  生日（年月日有效）
     * \endif
     */
    public NET_TIME					stuBirthday = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  address
     * \else
     *  住址
     * \endif
     */
    public byte					szAddress[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  card id
     * \else
     *  证件号
     * \endif
     */
    public byte					szCitizenID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  authority
     * \else
     *  签发机关
     * \endif
     */
    public byte					szAuthority[] = new byte[48];

    /**
     * \if ENGLISH_LANG
     *  begin valid time(year month day valid)
     * \else
     *  有效期限起始日期（年月日有效）
     * \endif
     */
    public NET_TIME					stuBeginValidTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  end valid time(year month day valid)
     * \else
     *  有效期限截止日期（年月日有效）
     * \endif
     */
    public NET_TIME					stuEndValidTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  event group id
     * \else
     *  事件组ID	,用于标示不同事件的对同一动作的关联
     * \endif
     */
    public int					nEventGroupID;

}

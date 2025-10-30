package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief No Information of Event in Storage Group
 * \else
 * @brief 存储组不存在事件信息
 * \endif
 */
public class ALARM_STORAGE_NOT_EXIST_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  0:start 1:stop
     * \else
     * 0:开始 1:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  Storage Droup Name
     * \else
     * 在录像或抓图存储点中设置但不存在的组
     * \endif
     */
    public byte					szGroup[] = new byte[FinalVar.SDK_STORAGE_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     *  the Time of Event triggering)
     * \else
     * 事件触发时间
     * \endif
     */
    public NET_TIME					stuTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  GPS info 
     * \else
     * GPS信息
     * \endif
     */
    public NET_GPS_STATUS_INFO					stGPSStatus = new NET_GPS_STATUS_INFO();

}
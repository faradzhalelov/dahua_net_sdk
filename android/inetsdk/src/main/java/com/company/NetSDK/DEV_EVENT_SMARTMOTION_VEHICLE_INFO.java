package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Corresponding to data block description of event type EVENT_ALARM_SMARTMOTION_VEHICLE(smart video motion detection event about vehicle)
 * \else
 * 事件类型EVENT_ALARM_SMARTMOTION_VEHICLE(智能视频移动侦测事件(车))对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_SMARTMOTION_VEHICLE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel ID
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  event action, 0 means pulse event, 1 means continuous event begin, 2 means continuous event end;
     * \else
     *  1:开始 2:停止
     * \endif
     */
    public int					nAction;

    /**
     * \if ENGLISH_LANG
     *  event name
     * \else
     *  事件名称
     * \endif
     */
    public byte					szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  PTS
     * \else
     *  时间戳(单位是毫秒)
     * \endif
     */
    public double					PTS;

    /**
     * \if ENGLISH_LANG
     *  UTC
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  event ID   
     * \else
     *  事件ID   
     * \endif
     */
    public int					nEventID;

    /**
     * \if ENGLISH_LANG
     *  region info of smart motion detection
     * \else
     *  智能动检区域信息
     * \endif
     */
    public NET_MOTIONDETECT_REGION_INFO					stuSmartRegion[] = new NET_MOTIONDETECT_REGION_INFO[32];

    /**
     * \if ENGLISH_LANG
     *  count of smart motion detection region
     * \else
     *  智能动检区域个数
     * \endif
     */
    public int					nSmartRegionNum;

    /**
     * \if ENGLISH_LANG
     *  count of smart motion detection objects about vehicle
     * \else
     *  智能动检(车)对象个数
     * \endif
     */
    public int					nVehicleObjectNum;

    /**
     * \if ENGLISH_LANG
     *  object info of smart motion detection about vehicle
     * \else
     *  智能动检(车)对象信息
     * \endif
     */
    public NET_SMARTDETECT_VEHICLE_OBJECT					stuVehicleObject[] = new NET_SMARTDETECT_VEHICLE_OBJECT[64];

    public DEV_EVENT_SMARTMOTION_VEHICLE_INFO(){
        for(int i = 0; i < 32; ++i)
        {
            stuSmartRegion[i] = new NET_MOTIONDETECT_REGION_INFO();
        }
        for(int j = 0; j < 64; ++j)
        {
            stuVehicleObject[j] = new NET_SMARTDETECT_VEHICLE_OBJECT();
        }
    }

}

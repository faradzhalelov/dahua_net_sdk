package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * basic wifi info
 * \else
 * 搜索到的wifi基本信息
 * \endif
 */
public class NET_WIFI_BASIC_INFO  implements Serializable {
    private static final long serialVersionUID = -3854390583258818419L;

    /**
     * \if ENGLISH_LANG
     *  start time of this notification period,
     *  indicates the same period; if device number notified in one notification is over the max value,
     *  several notification is needed.this value indicates the same notification period.
     * \else
     *  本周期上报的起始时间，为同一上报周期的标识；
     *  当同一上报周期内设备总数超过单次上报数量上限时需要多次上报事件，该值作为同一上报周期内多次上报事件的标识码；
     * \endif
     */
    public       int  nPeriodUTC;

    /**
     * \if ENGLISH_LANG
     *  the device sum notified during this period,several notifications during the same period have the same value.
     * \else
     *  本周期上报的wifi总数，同一上报周期内的事件中的该值均应为本周期上报的wifi总数
     * \endif
     */
    public       int  nDeviceSum;

    /**
     * \if ENGLISH_LANG
     *  device number in one notification,the value should be the same as nWifiNum in struct ALARM_WIFI_SEARCH_INFO,
     *   several notifications during the same period sum up to nCurDeviceCount
     * \else
     *  本次事件上报的Wifi设备数量，应与ALARM_WIFI_SEARCH_INFO结构体中的nWifiNum值一致；同一上报周期内该值的累积总数与nDeviceSum一致。
     * \endif
     */
    public       int  nCurDeviceCount;

}

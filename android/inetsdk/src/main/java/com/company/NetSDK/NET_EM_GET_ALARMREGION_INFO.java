package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Type of get operate
 * \else
 * 获取的操作类型
 * \endif
 */
public class NET_EM_GET_ALARMREGION_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int NET_EM_GET_ALARMREGION_INFO_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Get alarm capability	 {@link INetSDK#GetAlarmRegionInfo}:(pstuInParam: {@link NET_IN_GET_ALARMCAPS}    pstuOutParam: {@link NET_OUT_GET_ALARMCAPS} )
     * \else
     * 获取防区能力，	此时{@link INetSDK#GetAlarmRegionInfo}接口中的pstuInParam类型为 {@link NET_IN_GET_ALARMCAPS}， pstuOutParam类型为 {@link NET_OUT_GET_ALARMCAPS}
     * \endif
     */
    public static final int NET_EM_GET_ALARMREGION_INFO_ALARMCAPS = 1;

    /**
     * \if ENGLISH_LANG
     * Get arm mode		{@link INetSDK#GetAlarmRegionInfo}:(pstuInParam: {@link NET_IN_GET_ALARMMODE}  pstuOutParam: {@link NET_OUT_GET_ALARMMODE} )
     * \else
     * 获取布防状态，	此时{@link INetSDK#GetAlarmRegionInfo}接口中的pstuInParam类型为{@link NET_IN_GET_ALARMMODE}， pstuOutParam类型为{@link NET_OUT_GET_ALARMMODE}
     * \endif
     */
    public static final int NET_EM_GET_ALARMREGION_INFO_ARMMODE = 2;

    /**
     * \if ENGLISH_LANG
     * Get bypass mode		{@link INetSDK#GetAlarmRegionInfo}:(pstuInParam: {@link NET_IN_GET_BYPASSMODE}    pstuOutParam: {@link NET_OUT_GET_BYPASSMODE})
     * \else
     * 获取旁路状态，	此时{@link INetSDK#GetAlarmRegionInfo}接口中的pstuInParam类型为{@link NET_IN_GET_BYPASSMODE}， pstuOutParam类型为{@link NET_OUT_GET_BYPASSMODE}
     * \endif
     */
    public static final int NET_EM_GET_ALARMREGION_INFO_BYPASSMODE = 3;

    /**
     * \if ENGLISH_LANG
     * Get area zones	 {@link INetSDK#GetAlarmRegionInfo}:(pstuInParam: {@link NET_IN_GET_AREAZONES}    pstuOutParam: {@link NET_OUT_GET_AREAZONES} )
     * \else
     * 获取区域防区，	此时{@link INetSDK#GetAlarmRegionInfo}接口中的pstuInParam类型为 {@link NET_IN_GET_AREAZONES}， pstuOutParam类型为 {@link NET_OUT_GET_AREAZONES}
     * \endif
     */
    public static final int NET_EM_GET_ALARMREGION_INFO_AREAZONES = 4;

    /**
     * \if ENGLISH_LANG
     * Get all in slots		{@link INetSDK#GetAlarmRegionInfo}:(pstuInParam: {@link NET_IN_GET_ALLINSLOTS}  pstuOutParam: {@link NET_OUT_GET_ALLINSLOTS} )
     * \else
     * 获取所有的报警防区，	此时{@link INetSDK#GetAlarmRegionInfo}接口中的pstuInParam类型为{@link NET_IN_GET_ALLINSLOTS}， pstuOutParam类型为{@link NET_OUT_GET_ALLINSLOTS}
     * \endif
     */
    public static final int NET_EM_GET_ALARMREGION_INFO_ALLINSLOTS = 5;

    /**
     * \if ENGLISH_LANG
     * Get all out slots		{@link INetSDK#GetAlarmRegionInfo}:(pstuInParam: {@link NET_IN_GET_ALLOUTSLOTS}    pstuOutParam: {@link NET_OUT_GET_ALLOUTSLOTS})
     * \else
     * 获取所有的报警输出，	此时{@link INetSDK#GetAlarmRegionInfo}接口中的pstuInParam类型为{@link NET_IN_GET_ALLOUTSLOTS}， pstuOutParam类型为{@link NET_OUT_GET_ALLOUTSLOTS}
     * \endif
     */
    public static final int NET_EM_GET_ALARMREGION_INFO_ALLOUTSLOTS = 6;

    /**
     * \if ENGLISH_LANG
     * Get zone connection status	{@link INetSDK#GetAlarmRegionInfo}:(pstuInParam: {@link NET_IN_GET_CONNECTIONSTATUS}    pstuOutParam: {@link NET_OUT_GET_CONNECTIONSTATUS} )
     * \else
     * 获取防区连接状态，	此时{@link INetSDK#GetAlarmRegionInfo}接口中的pstuInParam类型为 {@link NET_IN_GET_CONNECTIONSTATUS}， pstuOutParam类型为 {@link NET_OUT_GET_CONNECTIONSTATUS}
     * \endif
     */
    public static final int NET_EM_GET_ALARMREGION_INFO_ZONECONNECTIONSSTATUS = 7;

    /**
     * \if ENGLISH_LANG
     * Get area status		{@link INetSDK#GetAlarmRegionInfo}:(pstuInParam: {@link NET_IN_GET_AREAS_STATUS}  pstuOutParam: {@link NET_OUT_GET_AREAS_STATUS} )
     * \else
     * 获取区域状态，	此时{@link INetSDK#GetAlarmRegionInfo}接口中的pstuInParam类型为{@link NET_IN_GET_AREAS_STATUS}， pstuOutParam类型为{@link NET_OUT_GET_AREAS_STATUS}
     * \endif
     */
    public static final int NET_EM_GET_ALARMREGION_INFO_AREASTATUS = 8;

    /**
     * \if ENGLISH_LANG
     * Get output state		{@link INetSDK#GetAlarmRegionInfo}:(pstuInParam: {@link NET_IN_GET_OUTPUT_STATE}    pstuOutParam: {@link NET_OUT_GET_OUTPUT_STATE})
     * \else
     * 获取输出状态，	此时{@link INetSDK#GetAlarmRegionInfo}接口中的pstuInParam类型为{@link NET_IN_GET_OUTPUT_STATE}， pstuOutParam类型为{@link NET_OUT_GET_OUTPUT_STATE}
     * \endif
     */
    public static final int NET_EM_GET_ALARMREGION_INFO_OUTPUTSTATE = 9;

    /**
     * \if ENGLISH_LANG
     * Get zones trouble	{@link INetSDK#GetAlarmRegionInfo}:(pstuInParam: {@link NET_IN_GET_ZONES_TROUBLE}    pstuOutParam: {@link NET_OUT_GET_ZONES_TROUBLE} )
     * \else
     * 获取防区故障信息，	此时{@link INetSDK#GetAlarmRegionInfo}接口中的pstuInParam类型为 {@link NET_IN_GET_ZONES_TROUBLE}， pstuOutParam类型为 {@link NET_OUT_GET_ZONES_TROUBLE}
     * \endif
     */
    public static final int NET_EM_GET_ALARMREGION_INFO_ZONESTROUBLE = 10;
}

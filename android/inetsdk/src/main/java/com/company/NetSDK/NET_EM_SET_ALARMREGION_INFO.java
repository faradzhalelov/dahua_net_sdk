package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Type of set operate
 * \else
 * 设置的操作类型
 * \endif
 */
public class NET_EM_SET_ALARMREGION_INFO implements Serializable {

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
    public static final int NET_EM_SET_ALARMREGION_INFO_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Set arm mode	{@link INetSDK#SetAlarmRegionInfo}:(pstuInParam: {@link NET_IN_SET_ALARMMODE}    pstuOutParam: {@link NET_OUT_SET_ALARMMODE} )
     * \else
     * 设置布防模式，此时{@link INetSDK#SetAlarmRegionInfo}接口中的pstuInParam类型为 {@link NET_IN_SET_ALARMMODE}， pstuOutParam类型为 {@link NET_OUT_SET_ALARMMODE}
     * \endif
     */
    public static final int NET_EM_SET_ALARMREGION_INFO_ARMMODE = 1;

    /**
     * \if ENGLISH_LANG
     * Set bypass mode	{@link INetSDK#SetAlarmRegionInfo}:(pstuInParam: {@link NET_IN_SET_BYPASSMODE}  pstuOutParam: {@link NET_OUT_SET_BYPASSMODE} )
     * \else
     * 设置旁路模式，此时{@link INetSDK#SetAlarmRegionInfo}接口中的pstuInParam类型为{@link NET_IN_SET_BYPASSMODE}， pstuOutParam类型为{@link NET_OUT_SET_BYPASSMODE}
     * \endif
     */
    public static final int NET_EM_SET_ALARMREGION_INFO_BYPASSMODE = 2;

    /**
     * \if ENGLISH_LANG
     * Set output state {@link INetSDK#SetAlarmRegionInfo}:(pstuInParam: {@link NET_IN_SET_OUTPUT_STATE}    pstuOutParam: {@link NET_OUT_SET_OUTPUT_STATE})
     * \else
     * 设置输出状态，此时{@link INetSDK#SetAlarmRegionInfo}接口中的pstuInParam类型为{@link NET_IN_SET_OUTPUT_STATE}， pstuOutParam类型为{@link NET_OUT_SET_OUTPUT_STATE}
     * \endif
     */
    public static final int NET_EM_SET_ALARMREGION_INFO_OUTPUTSTATE = 3;
}

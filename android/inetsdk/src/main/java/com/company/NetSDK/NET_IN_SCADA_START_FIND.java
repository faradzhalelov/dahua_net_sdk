package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#StartFindSCADA} input parameter
 * \else
 * {@link INetSDK#StartFindSCADA} 接口入参
 * \endif
 */
public class NET_IN_SCADA_START_FIND implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * start time, must provide
     * \else
     * 开始时间, 必填
     * \endif
     */
    public NET_TIME           stuStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * to set the end time, TRUE: must provide stuEndTime, FLASE: do not limit the end time
     * \else
     * 是否限制结束时间, TRUE: 必填stuEndTime, FLASE: 不限制结束时间
     * \endif
     */
    public boolean           bEndTime;

    /**
     * \if ENGLISH_LANG
     * end time
     * \else
     * 结束时间
     * \endif
     */
    public NET_TIME           stuEndTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * DeviceID, must provide
     * \else
     * DeviceID, 必填
     * \endif
     */
    public byte[]            szDeviceID = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * spot ID, must provide
     * \else
     * 监测点位ID, 必填
     * \endif
     */
    public byte[]            szID = new byte[FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * IDs count
     * \else
     * 监测点ID数组长度
     * \endif
     */
    public  int			   nIDsNum;

    /**
     * \if ENGLISH_LANG
     * spot ID, extend
     * \else
     * 预览点ID号数组，SDT离网供电扩展字段
     * \endif
     */
    public byte              szIDs[][] = new byte[32][FinalVar.SDK_COMMON_STRING_32];
}

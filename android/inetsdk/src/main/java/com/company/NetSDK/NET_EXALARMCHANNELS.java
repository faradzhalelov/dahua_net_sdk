package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#QueryDevState} input parameter, corresponding to command {@link FinalVar#SDK_DEVSTATE_EXALARMCHANNELS}
 * \else
 * {@link INetSDK#QueryDevState} 接口输入参数, 对应命令 {@link FinalVar#SDK_DEVSTATE_EXALARMCHANNELS}
 * \endif
 */
public class NET_EXALARMCHANNELS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * extension  module alarm input channel quantity, need user search
     * \else
     * 扩展模块报警输入通道个数,需用户指定查询个数
     * \endif
     */
    public int                         nExAlarmInCount;

    /**
     * \if ENGLISH_LANG
     * extension  module alarm input channel return quantity
     * \else
     * 扩展模块报警输入通道返回个数
     * \endif
     */
    public int                         nRetExAlarmInCount;

    /**
     * \if ENGLISH_LANG
     * extension  module alarm input channel info, the space application by the user, apply to sizeof(NET_EXALARMCHANNELS_INFO)*nExAlarmInCount
     * \else
     * 扩展模块报警输入通道信息, 由用户申请内存，大小为sizeof(NET_EXALARMCHANNELS_INFO)*nExAlarmInCount
     * \endif
     */
    public NET_EXALARMCHANNELS_INFO[]   pstuExAlarmInInfo;

    /**
     * \if ENGLISH_LANG
     * extension  module alarm output channel quantity, need user to search
     * \else
     * 扩展模块报警输出通道个数,需用户指定查询个数
     * \endif
     */
    public int                         nExAlarmOutCount;

    /**
     * \if ENGLISH_LANG
     * extension  module alarm output channel return quantity
     * \else
     * 扩展模块报警输出通道返回个数
     * \endif
     */
    public int                         nRetExAlarmOutCount;

    /**
     * \if ENGLISH_LANG
     * extension  module alarm output channel info, the space application by the user, apply to sizeof(NET_EXALARMCHANNELS_INFO)*nExAlarmOutCount
     * \else
     * 扩展模块报警输出通道信息, 由用户申请内存，大小为sizeof(NET_EXALARMCHANNELS_INFO)*nExAlarmOutCount
     * \endif
     */
    public NET_EXALARMCHANNELS_INFO[]   pstuExAlarmOutInfo;

    public NET_EXALARMCHANNELS(int nExAlarmInCount, int nExAlarmOutCount) {
        this.nExAlarmInCount = nExAlarmInCount;
        this.pstuExAlarmInInfo = new NET_EXALARMCHANNELS_INFO[nExAlarmInCount];
        for(int i = 0; i < nExAlarmInCount; i++) {
            this.pstuExAlarmInInfo[i] = new NET_EXALARMCHANNELS_INFO();
        }

        this.nExAlarmOutCount = nExAlarmOutCount;
        this.pstuExAlarmOutInfo = new NET_EXALARMCHANNELS_INFO[nExAlarmOutCount];
        for(int i = 0; i < nExAlarmOutCount; i++) {
            this.pstuExAlarmOutInfo[i] = new NET_EXALARMCHANNELS_INFO();
        }
    }
}

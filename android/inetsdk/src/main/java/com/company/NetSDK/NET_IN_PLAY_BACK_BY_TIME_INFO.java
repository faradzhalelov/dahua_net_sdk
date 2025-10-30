package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * record play back parameter in
 * \else
 * 录像回放入参信息
 * \endif
 */
public class NET_IN_PLAY_BACK_BY_TIME_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * start time
     * \else
     * 开始时间
     * \endif
     */
    public NET_TIME                stStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * stop time
     * \else
     * 结束时间
     * \endif
     */
    public NET_TIME            stStopTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * download pos
     * \else
     * 进度回调
     * \endif
     */
    public CB_fDownLoadPosCallBack  cbDownLoadPos;


    /**
     * \if ENGLISH_LANG
     * download data callback
     * \else
     * 数据回调
     * \endif
     */
    public CB_fDataCallBack       fDownLoadDataCallBack;

    /**
     * \if ENGLISH_LANG
     * play direction,0:playback, 1:reverse
     * \else
     * 播放方向, 0:正放; 1:倒放;
     * \endif
     */
    public int                 nPlayDirection;

    /**
     * \if ENGLISH_LANG
     * wait time,used in reverse
     * \else
     * 接口超时时间, 目前倒放使用
     * \endif
     */
    public int                  nWaittime;

    /**
     * \if ENGLISH_LANG
     * Event info
     * \else
     * 事件信息
     * \endif
     */
    public EVENT_INFO[]               pstuEventInfo;

    /**
     * \if ENGLISH_LANG
     * pstuEventInfo num,max is 16
     * \else
     * pstuEventInfo 个数，最大为 16
     * \endif
     */
    public int                  nEventInfoCount;

    public NET_IN_PLAY_BACK_BY_TIME_INFO(int nEventInfoCount)
    {
        this.nEventInfoCount = nEventInfoCount;
        pstuEventInfo = new EVENT_INFO[nEventInfoCount];
        for(int i=0; i< nEventInfoCount; ++i) {
            pstuEventInfo[i] = new EVENT_INFO();
        }
    }
}

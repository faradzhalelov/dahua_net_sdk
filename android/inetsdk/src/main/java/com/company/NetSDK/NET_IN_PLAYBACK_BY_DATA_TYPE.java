package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief PlayBack By stream Data Type (in param)
 * \else
 * @brief 开始回放并指定回调数据格式 入参
 * \endif
 */
public class NET_IN_PLAYBACK_BY_DATA_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel id
     * \else
     *  通道编号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  start time 
     * \else
     *  开始时间
     * \endif
     */
    public NET_TIME					stStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  stop time
     * \else
     *  结束时间
     * \endif
     */
    public NET_TIME					stStopTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  play handle
     * \else
     *  播放窗格, 可为NULL
     * \endif
     */
//    public HWND					hWnd;

    /**
     * \if ENGLISH_LANG
     *  function prototype of play back progress 
     * \else
     *  进度回调
     * \endif
     */
    public CB_fDownLoadPosCallBack					cbDownLoadPos;

    /**
     * \if ENGLISH_LANG
     *  pos user
     * \else
     *  进度回调用户信息
     * \endif
     */
    public long					dwPosUser;

    /**
     * \if ENGLISH_LANG
     *  Playback data callback function prototype
     * \else
     *  数据回调
     * \endif
     */
    public CB_fDataCallBack					fDownLoadDataCallBack;

    /**
     * \if ENGLISH_LANG
     *  stream data type ,{@link EM_REAL_DATA_TYPE}
     * \else
     *  回调的数据类型 ,{@link EM_REAL_DATA_TYPE}
     * \endif
     */
    public int					emDataType;

    /**
     * \if ENGLISH_LANG
     *  date user
     * \else
     *  数据回调用户信息
     * \endif
     */
    public long					dwDataUser;

    /**
     * \if ENGLISH_LANG
     *  Playback direction, 0:normal; 1:reverse;
     * \else
     *  播放方向, 0:正放; 1:倒放;
     * \endif
     */
    public int					nPlayDirection;

    /**
     * \if ENGLISH_LANG
     *  audio data type,{@link EM_AUDIO_DATA_TYPE}
     * \else
     *  音频类型,{@link EM_AUDIO_DATA_TYPE}
     * \endif
     */
    public int					emAudioType;

    /**
     * \if ENGLISH_LANG
     *  realplay data callbackExtension(With time stamp, frame type)
     * \else
     *  数据回调（扩展带时间戳，帧类型）
     * \endif
     */
    //    由于历史遗留原因(回调的Ref直接用dwUser保存传递),该字段暂无法实现
    //    public CB_fDataCallBackEx					fDownLoadDataCallBackEx;

}
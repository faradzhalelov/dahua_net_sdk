package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * Video talk call general config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_VIDEO_TALK_PHONE_GENERAL}
 * \else
 * 视频对讲电话通用配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig}, 对应命令{@link FinalVar#CFG_CMD_VIDEO_TALK_PHONE_GENERAL}
 * \endif
 */
public class CFG_VIDEO_TALK_PHONE_GENERAL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * ring file path
     * \else
     * 铃声文件路径
     * \endif
     */
    public byte[]                              szRingFile = new byte[FinalVar.MAX_PATH];

    /**
     * \if ENGLISH_LANG
     * ring volume, 0-100
     * \else
     * 铃音音量, 0-100
     * \endif
     */
    public int                                 nRingVolume;

    /**
     * \if ENGLISH_LANG
     * call volume, 0-100
     * \else
     * 通话音量, 0-100
     * \endif
     */
    public int                                 nTalkVolume;

    /**
     * \if ENGLISH_LANG
     * DND start time
     * \else
     * 免扰开始时间
     * \endif
     */
    public CFG_NET_TIME                        stuDisableRingStartTime = new CFG_NET_TIME();

    /**
     * \if ENGLISH_LANG
     * DND end time
     * \else
     * 免扰结束时间
     * \endif
     */
    public CFG_NET_TIME                        stuDisableRingEndTime = new CFG_NET_TIME();

    /**
     * \if ENGLISH_LANG
     * each element correspond to one remote device type, currently only VTS is valid, 0-VTH,1-VTO,2-VTS
     * \else
     * 每个元素对应一种远程设备类型，当前只有VTS有效, 0-VTH,1-VTO,2-VTS
     * \endif
     */
    public  CFG_VIDEO_TALK_TIME_LIMIT[]        stuTimeLimit = new CFG_VIDEO_TALK_TIME_LIMIT[EM_CFG_VT_TYPE.EM_CFG_VT_TYPE_MAX];

    /**
     * \if ENGLISH_LANG
     * monitoring max length, overt time auto end, 1-600 min
     * \else
     * 预览最大时长，超时自动结束, 1-600分钟
     * \endif
     */
    public int                                 nMaxMonitorTime;

    /**
     * \if ENGLISH_LANG
     * record max length, overtime auto end, 15-300s
     * \else
     * 录像最大时长，超时自动结束, 15-300秒
     * \endif
     */
    public int                                 nMaxRecordTime;

    /**
     * \if ENGLISH_LANG
     * call link snapshot enable, after snapshot upload path see config item RecordStoragePoint EventSnapShot
     * \else
     * 呼叫联动抓图使能, 抓图后上传路径见配置项 "RecordStoragePoint"(对应命令 {@link FinalVar#CFG_CMD_RECORD_STORAGEPOINT}) 的 EventSnapShot
     * \endif
     */
    public boolean                            bSnapEnable;

    /**
     * \if ENGLISH_LANG
     * call ring enable
     * \else
     * 呼叫铃声使能
     * \endif
     */
    public boolean                            bRingSoundEnable;

    /**
     * \if ENGLISH_LANG
     * ring file of indoor me called by indoor unit
     * \else
     * 室内机被室内机呼叫的铃声文件
     * \endif
     */
    public byte[]                             szVthRingFile = new byte[FinalVar.CFG_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * ring volume of indoor unit called by indoor unit
     * \else
     * 室内机被室内机呼叫铃声音量
     * \endif
     */
    public int                                nVthRingVolume;

    /**
     * \if ENGLISH_LANG
     * leave message sound enable
     * \else
     * 留影留言提示声使能
     * \endif
     */
    public boolean                           bLeaveMsgSoundEnable;

    /**
     * \if ENGLISH_LANG
     * whether silence or not
     * \else
     * 是否静音
     * \endif
     */
    public boolean                           bSilenceEnable;

    /**
     * \if ENGLISH_LANG
     * monitoring max length of IPC, overtime auto end, 0-10 hour,
     * \else
     * IPC预览最大时长，超时自动结束，0-10小时,单位为秒
     * \endif
     */
    public int                                nMaxMonitorIPCTime;

    /**
     * \if ENGLISH_LANG
     * disturbance-free time use. when system time changes, add it
     * \else
     * 免扰时间使用，当系统时间改变的时候,增加这个时间来产生新的免扰结束时间,单位秒
     * \endif
     */
    public int                                nReviseTime;

    /**
     * \if ENGLISH_LANG
     * upload talk record or not
     * \else
     * 呼叫记录是否上传
     * \endif
     */
    public boolean                           bTalkRecordUpload;

    /**
     * \if ENGLISH_LANG
     * call snapshot count, 1-5
     * \else
     * 呼叫抓拍图片张数，1-5张
     * \endif
     */
    public int                                nSnapShotCount;

    /**
     * \if ENGLISH_LANG
     * whether to accept remote control operation or not, TRUE: the intelligent home equipment and arm or disarm acti
     * \else
     * 是否接受远程控制操作, true时,在客户端可远程操作设备上智能家居设备、设备的布撤防动作
     * \endif
     */
    public boolean                           bRemoteControl;


    /**
     * \if ENGLISH_LANG
     * whether the message record is open or not
     * \else
     * 留言记录是否开启
     * \endif
     */
    public boolean                           bLeaveMessageEnable;

    /**
     * \if ENGLISH_LANG
     * upload message record or not
     * \else
     * 留言记录是否上传
     * \endif
     */
    public boolean                           bLeaveMessageUpload;

    /**
     * \if ENGLISH_LANG
     * whether the local video is open or not
     * \else
     * 本地视频是否开启
     * \endif
     */
    public boolean                           bLocalVideoEnable;

    /**
     * \if ENGLISH_LANG
     * publish information overlay enable
     * \else
     * 公告信息叠加使能控制
     * \endif
     */
    public boolean                            bPublishInfoOverlayingEnable;

    public CFG_VIDEO_TALK_PHONE_GENERAL() {
        for(int i = 0; i < EM_CFG_VT_TYPE.EM_CFG_VT_TYPE_MAX; i++) {
            stuTimeLimit[i] = new CFG_VIDEO_TALK_TIME_LIMIT();
        }
    }
}

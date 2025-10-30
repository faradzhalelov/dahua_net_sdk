package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  SIP server info
 * \else
 * SIP服务器信息
 * \endif
 */
public class NET_SIP_SERVER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Server access enbale option,refer to{@link EM_SERVER_OPTION}
     * \else
     * 单个平台接入启动选项,参考{@link EM_SERVER_OPTION}
     * \endif
     */
    public int			emServerOption;

    /**
     * \if ENGLISH_LANG
     * SIP server ID
     * \else
     * SIP服务器编号
     * \endif
     */
    public byte						szSipSvrId[] = new byte[FinalVar.MAX_SIP_SVR_ID_LEN];

    /**
     * \if ENGLISH_LANG
     * SIP domain
     * \else
     * SIP域
     * \endif
     */
    public byte						szDomain[] = new byte[FinalVar.MAX_SIP_DOMAIN_LEN];

    /**
     * \if ENGLISH_LANG
     * SIP server IP
     * \else
     * SIP服务器IP
     * \endif
     */
    public byte						szSipSvrIp[] = new byte[FinalVar.MAX_SIP_SVR_IP_LEN];

    /**
     * \if ENGLISH_LANG
     * Device ID or User name
     * \else
     * 设备编号
     * \endif
     */
    public byte						szDeviceId[] = new byte[FinalVar.MAX_SIP_SERVER_DEVICE_ID_LEN];

    /**
     * \if ENGLISH_LANG
     * Password
     * \else
     * 注册密码
     * \endif
     */
    public byte						szPassword[] = new byte[FinalVar.MAX_REG_PASSWORD_LEN];

    /**
     * \if ENGLISH_LANG
     * Local SIP port
     * \else
     * 本地SIP服务端口
     * \endif
     */
    public short				nLocalSipPort;

    /**
     * \if ENGLISH_LANG
     * SIP server port
     * \else
     * SIP服务器端口
     * \endif
     */
    public short				nSipSvrPort;

    /**
     * \if ENGLISH_LANG
     * SIP register validity,Unit:second
     * \else
     * 注册有效期,单位:秒
     * \endif
     */
    public int				nSipRegExpires;

    /**
     * \if ENGLISH_LANG
     * Re-registration interval after failed registration,Unit:second
     * \else
     * 注册失败后重新注册间隔,单位:秒
     * \endif
     */
    public int				nRegInterval;

    /**
     * \if ENGLISH_LANG
     * Keep alive circle,Unit:second
     * \else
     * 心跳周期,单位:秒
     * \endif
     */
    public int				nKeepAliveCircle;

    /**
     * \if ENGLISH_LANG
     * Max timeout times
     * \else
     * 最大心跳超时次数
     * \endif
     */
    public int				nMaxTimeoutTimes;

    /**
     * \if ENGLISH_LANG
     * Civil code
     * \else
     * 行政区划代码
     * \endif
     */
    public byte						szCivilCode[] = new byte[FinalVar.MAX_CIVIL_CODE_LEN];

    /**
     * \if ENGLISH_LANG
     * Intervideo ID
     * \else
     * 接入模块识别码
     * \endif
     */
    public byte						szIntervideoID[] = new byte[FinalVar.MAX_INTERVIDEO_ID_LEN];

    /**
     * \if ENGLISH_LANG
     * Channel info num, it can depend on channel num by Login get
     * \else
     * 通道信息个数,可以根据登陆时获取的通道数为准
     * \endif
     */
    public int				nChannelInfoNum;

    /**
     * \if ENGLISH_LANG
     * Return channel info num
     * \else
     * 实际返回的通道号信息个数
     * \endif
     */
    public int				nRetChannelInfoNum;

    /**
     * \if ENGLISH_LANG
     * Channel info
     * \else
     * 通道相关信息
     * \endif
     */
    public NET_CHANNEL_INFO[] pstuChannnelInfo;

    /**
     * \if ENGLISH_LANG
     * Alarm info num, max value is 640
     * \else
     * 报警信息个数,最大值为640
     * \endif
     */
    public int				nAlarmInfoNum;

    /**
     * \if ENGLISH_LANG
     * Return alarm info num
     * \else
     * 实际返回的报警通道信息个数
     * \endif
     */
    public int				nRetAlarmInfoNum;

    /**
     * \if ENGLISH_LANG
     * Alarm info
     * \else
     * 报警通道相关信息
     * \endif
     */
    public NET_ALARM_INFO[] pstuAlarmInfo;

    /**
     * \if ENGLISH_LANG
     * Audio output channel info num, max value is 181
     * \else
     * 音频输出通道相关信息个数,最大值为181
     * \endif
     */
    public int				nAudioOutputChnInfoNum;

    /**
     * \if ENGLISH_LANG
     * Return audio output channel info num
     * \else
     * 实际返回的音频输出通道信息个数
     * \endif
     */
    public int				nRetAudioOutputChnInfoNum;

    /**
     * \if ENGLISH_LANG
     * Audio output channel info
     * \else
     * 音频输出通道相关信息
     * \endif
     */
    public NET_AUDIO_OUTPUT_CHANNEL_INFO[] pstuAudioOutputChnInfo;

    public NET_SIP_SERVER_INFO(int nChannelInfoNum, int nAlarmInfoNum, int nAudioOutputChnInfoNum){
        this.nChannelInfoNum = nChannelInfoNum;
        pstuChannnelInfo = new NET_CHANNEL_INFO[nChannelInfoNum];
        for(int i = 0; i < nChannelInfoNum; ++i){
            pstuChannnelInfo[i] = new NET_CHANNEL_INFO();
        }
        this.nAlarmInfoNum = nAlarmInfoNum;
        pstuAlarmInfo = new NET_ALARM_INFO[nAlarmInfoNum];
        for(int i = 0; i < nAlarmInfoNum; ++i){
            pstuAlarmInfo[i] = new NET_ALARM_INFO();
        }
        this.nAudioOutputChnInfoNum = nAudioOutputChnInfoNum;
        pstuAudioOutputChnInfo = new NET_AUDIO_OUTPUT_CHANNEL_INFO[nAudioOutputChnInfoNum];
        for(int i = 0; i < nAudioOutputChnInfoNum; ++i){
            pstuAudioOutputChnInfo[i] = new NET_AUDIO_OUTPUT_CHANNEL_INFO();
        }

    }


}

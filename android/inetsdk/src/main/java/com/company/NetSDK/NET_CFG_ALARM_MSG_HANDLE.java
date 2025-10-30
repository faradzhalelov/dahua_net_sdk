package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event handler
 * \else
 * 报警联动
 * \endif
 */
public class NET_CFG_ALARM_MSG_HANDLE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Whether Support Channel Count
     * \else
     * 是否支持通道数量
     * \endif
     */
    public boolean                				abChannelCount;

    /**
     * \if ENGLISH_LANG
     * Whether Support AlarmOut Count
     * \else
     * 是否支持报警输出数量
     * \endif
     */
    public boolean                				abAlarmOutCount;

    /**
     * \if ENGLISH_LANG
     * Whether Support RecordMask
     * \else
     * 是否支持录像通道
     * \endif
     */
    public boolean								abRecordMask;

    /**
     * \if ENGLISH_LANG
     * Whether Support RecordEnable
     * \else
     * 是否支持录像使能
     * \endif
     */
    public boolean								abRecordEnable;

    /**
     * \if ENGLISH_LANG
     * Whether Support RecordLatch
     * \else
     * 是否支持录像延时
     * \endif
     */
    public boolean								abRecordLatch;

    /**
     * \if ENGLISH_LANG
     * Whether Support AlarmOutMask
     * \else
     * 是否支持报警输出通道
     * \endif
     */
    public boolean								abAlarmOutMask;

    /**
     * \if ENGLISH_LANG
     * Whether Support AlarmOut Enable
     * \else
     * 是否支持报警输出使能
     * \endif
     */
    public boolean								abAlarmOutEn;

    /**
     * \if ENGLISH_LANG
     * Whether Support AlarmOut Latch
     * \else
     * 是否支持报警输出延时
     * \endif
     */
    public boolean								abAlarmOutLatch;

    /**
     * \if ENGLISH_LANG
     * Whether Support ExAlarmOut Mask
     * \else
     * 是否支持扩展报警输出通道
     * \endif
     */
    public boolean								abExAlarmOutMask;

    /**
     * \if ENGLISH_LANG
     * Whether Support ExAlarmOut Enable
     * \else
     * 是否支持扩展报警输出使能
     * \endif
     */
    public boolean								abExAlarmOutEn;

    /**
     * \if ENGLISH_LANG
     * Whether Support PTZ Link Enable
     * \else
     * 是否支持云台联动使能
     * \endif
     */
    public boolean								abPtzLinkEn;

    /**
     * \if ENGLISH_LANG
     * Whether Support Tour Mask
     * \else
     * 是否支持轮巡掩码
     * \endif
     */
    public boolean								abTourMask;

    /**
     * \if ENGLISH_LANG
     * Whether Support Tour Enable
     * \else
     * 是否支持轮巡使能
     * \endif
     */
    public boolean								abTourEnable;

    /**
     * \if ENGLISH_LANG
     * Whether Support Snapshot
     * \else
     * 是否支持快照
     * \endif
     */
    public boolean								abSnapshot;

    /**
     * \if ENGLISH_LANG
     * Whether Support Snapshot Enable
     * \else
     * 是否支持快照使能
     * \endif
     */
    public boolean								abSnapshotEn;

    /**
     * \if ENGLISH_LANG
     * Whether Support Snapshot Period, Snap a picture every sceond
     * \else
     * 是否支持帧间隔，每隔多少帧抓一张图片
     * \endif
     */
    public boolean								abSnapshotPeriod;

    /**
     * \if ENGLISH_LANG
     * Whether Support Snapshot Times
     * \else
     * 是否支持连拍次数
     * \endif
     */
    public boolean								abSnapshotTimes;

    /**
     * \if ENGLISH_LANG
     * Whether Support Local Message Box prompt
     * \else
     * 是否支持本地消息框提示
     * \endif
     */
    public boolean								abTipEnable;

    /**
     * \if ENGLISH_LANG
     * Whether Support Send Mail Enable
     * \else
     * 是否支持发送邮件
     * \endif
     */
    public boolean								abMailEnable;

    /**
     * \if ENGLISH_LANG
     * Whether Support Upload to the alarm center server
     * \else
     * 是否支持上传到报警中心服务器
     * \endif
     */
    public boolean								abMessageEnable;

    /**
     * \if ENGLISH_LANG
     * Whether Support Beep Enable
     * \else
     * 是否支持蜂鸣
     * \endif
     */
    public boolean								abBeepEnable;

    /**
     * \if ENGLISH_LANG
     * Whether Support Voice Enable
     * \else
     * 是否支持语音提示
     * \endif
     */
    public boolean								abVoiceEnable;

    /**
     * \if ENGLISH_LANG
     * Whether Support Matrix Mask
     * \else
     * 是否支持联动视频矩阵掩码
     * \endif
     */
    public boolean								abMatrixMask;

    /**
     * \if ENGLISH_LANG
     * Whether Support Matrix Enable
     * \else
     * 是否支持联动视频矩阵使能
     * \endif
     */
    public boolean								abMatrixEnable;

    /**
     * \if ENGLISH_LANG
     * Whether Support Event Latch
     * \else
     * 是否支持联动开始延时时间
     * \endif
     */
    public boolean								abEventLatch;

    /**
     * \if ENGLISH_LANG
     * Whether Support Log Enable
     * \else
     * 是否支持日志使能
     * \endif
     */
    public boolean								abLogEnable;

    /**
     * \if ENGLISH_LANG
     * Whether Support Delay
     * \else
     * 是否支持报警延时
     * \endif
     */
    public boolean								abDelay;

    /**
     * \if ENGLISH_LANG
     * Whether Support Add Message to video
     * \else
     * 是否支持叠加提示字幕到视频
     * \endif
     */
    public boolean								abVideoMessageEn;

    /**
     * \if ENGLISH_LANG
     * Whether Support Send MMS Enable
     * \else
     * 是否支持发送短消息
     * \endif
     */
    public boolean								abMMSEnable;

    /**
     * \if ENGLISH_LANG
     * Whether Support Message to Net Enable
     * \else
     * 是否支持消息上传给网络使能
     * \endif
     */
    public boolean								abMessageToNetEn;

    /**
     * \if ENGLISH_LANG
     * Whether Support TourSplit
     * \else
     * 是否支持换面分割轮巡
     * \endif
     */
    public boolean								abTourSplit;

    /**
     * \if ENGLISH_LANG
     * Whether Support Snapshot Title Enable
     * \else
     * 是否支持叠加图片标题使能
     * \endif
     */
    public boolean								abSnapshotTitleEn;

    /**
     * \if ENGLISH_LANG
     * Whether Support PTZ Link Enable
     * \else
     * 是否支持云台联动使能
     * \endif
     */
    public boolean                				abPtzLinkEx;

    /**
     * \if ENGLISH_LANG
     * Whether Support Add Snapshot Title
     * \else
     * 是否支持叠加图片标题
     * \endif
     */
    public boolean                				abSnapshotTitle;

    /**
     * \if ENGLISH_LANG
     * Whether Support Mail Detail
     * \else
     * 是否支持邮件详情
     * \endif
     */
    public boolean                				abMailDetail;

    /**
     * \if ENGLISH_LANG
     * Whether Support Add Video Title Enable, MainStream
     * \else
     * 是否支持叠加视频标题，主要指主码流
     * \endif
     */
    public boolean                				abVideoTitleEn;

    /**
     * \if ENGLISH_LANG
     * Whether Support Video Title
     * \else
     * 是否支持视频标题内容
     * \endif
     */
    public boolean                				abVideoTitle;

    /**
     * \if ENGLISH_LANG
     * Whether Support Tour
     * \else
     * 是否支持轮巡
     * \endif
     */
    public boolean                				abTour;

    /**
     * \if ENGLISH_LANG
     * Whether Support Specifies the KeyWords that need to be Written to the DB in the event details
     * \else
     * 是否支持指定事件详细信息里需要写到数据库的关键字
     * \endif
     */
    public boolean                				abDBKeys;

    /**
     * \if ENGLISH_LANG
     * Whether Support Add JPEG Summary
     * \else
     * 是否支持叠加到JPEG图片的摘要信息
     * \endif
     */
    public boolean                				abJpegSummary;

    /**
     * \if ENGLISH_LANG
     * Whether Support Flash Enable
     * \else
     * 是否支持补光灯使能
     * \endif
     */
    public boolean                				abFlashEn;

    /**
     * \if ENGLISH_LANG
     * Whether Support Flash Latch
     * \else
     * 是否支持补光灯延时
     * \endif
     */
    public boolean                				abFlashLatch;

    /**
     * \if ENGLISH_LANG
     * Whether Support Audio File Name
     * \else
     * 是否支持联动语音文件绝对路径
     * \endif
     */
    public boolean								abAudioFileName;

    /**
     * \if ENGLISH_LANG
     * Whether Support AlarmBell Enable
     * \else
     * 是否支持警号使能
     * \endif
     */
    public boolean								abAlarmBellEn;

    /**
     * \if ENGLISH_LANG
     * Whether Support Access Control Enable
     * \else
     * 是否支持门禁控制使能
     * \endif
     */
    public boolean								abAccessControlEn;

    /**
     * \if ENGLISH_LANG
     * Whether Support Access Control
     * \else
     * 是否支持门禁控制
     * \endif
     */
    public boolean								abAccessControl;

    /**
     * \if ENGLISH_LANG
     * Whether Support TalkBack
     * \else
     * 是否支持语音呼叫
     * \endif
     */
    public boolean								abTalkBack;

    /**
     * \if ENGLISH_LANG
     * Whether Support PSTN Alarm Server
     * \else
     * 是否支持电话报警中心
     * \endif
     */
    public boolean								abPSTNAlarmServer;

    /**
     * \if ENGLISH_LANG
     * Whether Support AlarmBell Latch
     * \else
     * 是否支持警号输出延时
     * \endif
     */
    public boolean								abAlarmBellLatch;

    /**
     * \if ENGLISH_LANG
     * Whether Support PlayTimes
     * \else
     * 是否支持联动语音播放次数
     * \endif
     */
    public boolean                                abPlayTimes;

    /**
     * \if ENGLISH_LANG
     * Whether Support Reboot enable
     * \else
     * 是否支持重启使能
     * \endif
     */
    public boolean                                abReboot;

    /**
     * \if ENGLISH_LANG
     * Whether Support BeepTime
     * \else
     * 是否支持蜂鸣时长
     * \endif
     */
    public boolean                                abBeepTime;

    /**
     * \if ENGLISH_LANG
     * Alarm Time Section
     * \else
     * 事件响应时间表
     * \endif
     */
    public NET_CFG_TIME_SCHEDULE				stuTimeSection = new NET_CFG_TIME_SCHEDULE();

    /**
     * \if ENGLISH_LANG
     * The video channel of the device
     * \else
     * 设备的视频通道数
     * \endif
     */
    public int									nChannelCount;

    /**
     * \if ENGLISH_LANG
     * The alarm output amount of the device
     * \else
     * 设备的报警输出个数
     * \endif
     */
    public int									nAlarmOutCount;

    /**
     * \if ENGLISH_LANG
     * Subnet mask of the recording channel(use the bit to represent)
     * \else
     * 录像通道掩码(按位)
     * \endif
     */
    public int[]							    dwRecordMask = new int[FinalVar.CFG_MAX_CHANNEL_COUNT];

    /**
     * \if ENGLISH_LANG
     * Record enable
     * \else
     * 录像使能
     * \endif
     */
    public boolean							bRecordEnable;

    /**
     * \if ENGLISH_LANG
     * Record delay time(s)
     * \else
     * 录像延时时间(秒)
     * \endif
     */
    public int									nRecordLatch;

    /**
     * \if ENGLISH_LANG
     * ubnet mask of alarm output channel
     * \else
     * 报警输出通道掩码
     * \endif
     */
    public int[]								dwAlarmOutMask = new int[FinalVar.CFG_MAX_CHANNEL_COUNT];

    /**
     * \if ENGLISH_LANG
     * Alarm output enable
     * \else
     * 报警输出使能
     * \endif
     */
    public boolean							bAlarmOutEn;

    /**
     * \if ENGLISH_LANG
     * Alarm output delay time (s)
     * \else
     * 报警输出延时时间(秒)
     * \endif
     */
    public int									nAlarmOutLatch;

    /**
     * \if ENGLISH_LANG
     * Subnet mask of extension alarm output channel
     * \else
     * 扩展报警输出通道掩码
     * \endif
     */
    public int[]								 dwExAlarmOutMask = new int[FinalVar.CFG_MAX_CHANNEL_COUNT];

    /**
     * \if ENGLISH_LANG
     * Extension alarm output enable
     * \else
     * 扩展报警输出使能
     * \endif
     */
    public boolean							 bExAlarmOutEn;

    /**
     * \if ENGLISH_LANG
     * PTZ activation item
     * \else
     * 云台联动项		//这个参数并没有被解析，应该是被扩展替代
     * \endif
     */
    public NET_CFG_PTZ_LINK[]					stuPtzLink = new NET_CFG_PTZ_LINK[FinalVar.CFG_MAX_VIDEO_CHANNEL_NUM];

    /**
     * \if ENGLISH_LANG
     * PTZ activation enable
     * \else
     * 云台联动使能
     * \endif
     */
    public boolean							bPtzLinkEn;

    /**
     * \if ENGLISH_LANG
     * Subnet mask of tour channel
     * \else
     * 轮询通道掩码
     * \endif
     */
    public int[]							  dwTourMask = new int[FinalVar.CFG_MAX_CHANNEL_COUNT];

    /**
     * \if ENGLISH_LANG
     * Tour enable
     * \else
     * 轮询使能
     * \endif
     */
    public boolean							bTourEnable;

    /**
     * \if ENGLISH_LANG
     * Snapshot channel subnet mask
     * \else
     * 快照通道号掩码
     * \endif
     */
    public int[]								dwSnapshot = new int[FinalVar.CFG_MAX_CHANNEL_COUNT];

    /**
     * \if ENGLISH_LANG
     * Snapshot enable
     * \else
     * 快照使能
     * \endif
     */
    public boolean							bSnapshotEn;

    /**
     * \if ENGLISH_LANG
     * Snapshot period(s)
     * \else
     * 连拍周期(秒)
     * \endif
     */
    public int									nSnapshotPeriod;

    /**
     * \if ENGLISH_LANG
     * Snapshot times
     * \else
     * 连拍次数
     * \endif
     */
    public int									nSnapshotTimes;

    /**
     * \if ENGLISH_LANG
     * Local prompt dialogue box
     * \else
     * 本地消息框提示
     * \endif
     */
    public boolean								bTipEnable;

    /**
     * \if ENGLISH_LANG
     * Send out emali. The image is sent out as the attachment.
     * \else
     * 发送邮件，如果有图片，作为附件
     * \endif
     */
    public boolean								bMailEnable;

    /**
     * \if ENGLISH_LANG
     * Upload to the alarm server
     * \else
     * 上传到报警服务器
     * \endif
     */
    public boolean								bMessageEnable;

    /**
     * \if ENGLISH_LANG
     * Buzzer
     * \else
     * 蜂鸣
     * \endif
     */
    public boolean								bBeepEnable;

    /**
     * \if ENGLISH_LANG
     * Audio prompt
     * \else
     * 语音提示
     * \endif
     */
    public boolean								bVoiceEnable;

    /**
     * \if ENGLISH_LANG
     * The Linkage Audio play times,bVoiceEnable=TRUE is effective
     * \else
     * 联动语音播放次数bVoiceEnable=TRUE时生效
     * \endif
     */
    public int                                   nPlayTimes;

    /**
     * \if ENGLISH_LANG
     * Subnet mask of the activated video channel
     * \else
     * 联动视频矩阵通道掩码
     * \endif
     */
    public int[]								  dwMatrixMask = new int[FinalVar.CFG_MAX_CHANNEL_COUNT];

    /**
     * \if ENGLISH_LANG
     * Activate the video matrix
     * \else
     * 联动视频矩阵
     * \endif
     */
    public boolean							  bMatrixEnable;

    /**
     * \if ENGLISH_LANG
     * Activation delay time (s),0-15
     * \else
     * 联动开始延时时间(秒)，0－15
     * \endif
     */
    public int									  nEventLatch;

    /**
     * \if ENGLISH_LANG
     * Record log or not
     * \else
     * 是否记录日志
     * \endif
     */
    public boolean							 bLogEnable;

    /**
     * \if ENGLISH_LANG
     * Delay first and then becomes valid when set. Unit is second.
     * \else
     * 设置时先延时再生效，单位为秒
     * \endif
     */
    public int									nDelay;

    /**
     * \if ENGLISH_LANG
     * Overlay the prompt character to the video. The overlay character includes the event type, channel number. The unit is second.
     * \else
     * 叠加提示字幕到视频。叠加的字幕包括事件类型，通道号，秒计时。
     * \endif
     */
    public boolean							bVideoMessageEn;

    /**
     * \if ENGLISH_LANG
     * Enable MMS
     * \else
     * 发送彩信使能
     * \endif
     */
    public boolean							bMMSEnable;

    /**
     * \if ENGLISH_LANG
     * Send the message to the network enable
     * \else
     * 消息上传给网络使能
     * \endif
     */
    public boolean							bMessageToNetEn;

    /**
     * \if ENGLISH_LANG
     * Tour split mod 0: 1tour; 1: 8tour
     * \else
     * 轮巡时的分割模式 0: 1画面; 1: 8画面
     * \endif
     */
    public int									nTourSplit;

    /**
     * \if ENGLISH_LANG
     * Enble osd
     * \else
     * 是否叠加图片标题
     * \endif
     */
    public boolean							bSnapshotTitleEn;

    /**
     * \if ENGLISH_LANG
     * PTZ link configuration number
     * \else
     * 云台配置数
     * \endif
     */
    public int                 				nPtzLinkExNum;

    /**
     * \if ENGLISH_LANG
     * PTZ extend information
     * \else
     * 扩展云台信息
     * \endif
     */
    public NET_PTZ_LINK[] 						stuPtzLinkEx = new NET_PTZ_LINK[FinalVar.CFG_MAX_VIDEO_CHANNEL_NUM];

    /**
     * \if ENGLISH_LANG
     * Number of picture title
     * \else
     * 图片标题内容数
     * \endif
     */
    public int                 				nSnapTitleNum;

    /**
     * \if ENGLISH_LANG
     * Picture title content
     * \else
     * 图片标题内容
     * \endif
     */
    public NET_CFG_EVENT_TITLE[] 				stuSnapshotTitle = new NET_CFG_EVENT_TITLE[FinalVar.CFG_MAX_VIDEO_CHANNEL_NUM];

    /**
     * \if ENGLISH_LANG
     * Mail detial
     * \else
     * 邮件详细内容
     * \endif
     */
    public NET_CFG_MAIL_DETAIL 				stuMailDetail = new NET_CFG_MAIL_DETAIL();

    /**
     * \if ENGLISH_LANG
     * Whether overlay video title, mainly refers to the main stream
     * \else
     * 是否叠加视频标题，主要指主码流
     * \endif
     */
    public boolean                			bVideoTitleEn;

    /**
     * \if ENGLISH_LANG
     * Video title num
     * \else
     * 视频标题内容数目
     * \endif
     */
    public int                 				nVideoTitleNum;

    /**
     * \if ENGLISH_LANG
     * Video title
     * \else
     * 视频标题内容
     * \endif
     */
    public NET_CFG_EVENT_TITLE[] 				stuVideoTitle = new NET_CFG_EVENT_TITLE[FinalVar.CFG_MAX_VIDEO_CHANNEL_NUM];

    /**
     * \if ENGLISH_LANG
     * Tour num
     * \else
     * 轮询联动数目
     * \endif
     */
    public int                 				nTourNum;

    /**
     * \if ENGLISH_LANG
     * Tour configuration
     * \else
     * 轮询联动配置
     * \endif
     */
    public NET_CFG_TOURLINK[]    				stuTour = new NET_CFG_TOURLINK[FinalVar.CFG_MAX_VIDEO_CHANNEL_NUM];

    /**
     * \if ENGLISH_LANG
     * Specify the db keyword on the number of effective
     * \else
     * 指定数据库关键字的有效数
     * \endif
     */
    public int                 				nDBKeysNum;

    /**
     * \if ENGLISH_LANG
     * The specify event detail information need write the BD keyword
     * \else
     * 指定事件详细信息里需要写到数据库的关键字
     * \endif
     */
    public byte[][]                			szDBKeys = new byte[FinalVar.CFG_MAX_DBKEY_NUM][FinalVar.CFG_MAX_CHANNELNAME_LEN];

    /**
     * \if ENGLISH_LANG
     * The summary information of the jpeg image
     * \else
     * 叠加到JPEG图片的摘要信息
     * \endif
     */
    public byte[]                				byJpegSummary = new byte[FinalVar.CFG_MAX_SUMMARY_LEN];

    /**
     * \if ENGLISH_LANG
     * Whether enable flash
     * \else
     * 是否使能补光灯
     * \endif
     */
    public boolean                			bFlashEnable;

    /**
     * \if ENGLISH_LANG
     * Flash delay time (s),the time range:[10,300]
     * \else
     * 补光灯延时时间(秒),延时时间范围：[10,300]
     * \endif
     */
    public int                 				nFlashLatch;

    /**
     * \if ENGLISH_LANG
     * The Absolute Path to the Linkage Audio Files
     * \else
     * 联动语音文件绝对路径
     * \endif
     */
    public byte[]								szAudioFileName = new byte[FinalVar.MAX_PATH];

    /**
     * \if ENGLISH_LANG
     * Warning Signal Enable
     * \else
     * 警号使能
     * \endif
     */
    public boolean							bAlarmBellEn;

    /**
     * \if ENGLISH_LANG
     * Entrance Guard Enable
     * \else
     * 门禁使能
     * \endif
     */
    public boolean							bAccessControlEn;

    /**
     * \if ENGLISH_LANG
     * Class Number of Entrance Guard
     * \else
     * 门禁组数
     * \endif
     */
    public int								   dwAccessControl;

    /**
     * \if ENGLISH_LANG
     * Entrance Guard Linkage Operation Information
     * \else
     * 门禁联动操作信息
     * \endif
     */
    public int[]		                      emAccessControlType = new int[FinalVar.CFG_MAX_ACCESSCONTROL_NUM];

    /**
     * \if ENGLISH_LANG
     * Voice Call Linkage Information
     * \else
     * 语音呼叫联动信息
     * \endif
     */
    public NET_CFG_TALKBACK_INFO			  stuTalkback = new NET_CFG_TALKBACK_INFO();

    /**
     * \if ENGLISH_LANG
     * Telephone Alarm Center Linkage Information
     * \else
     * 电话报警中心联动信息
     * \endif
     */
    public NET_CFG_PSTN_ALARM_SERVER			stuPSTNAlarmServer = new NET_CFG_PSTN_ALARM_SERVER();

    /**
     * \if ENGLISH_LANG
     * Police no. output delay time(10-300 s)
     * \else
     * 警号输出延时时间(10-300秒)
     * \endif
     */
    public int									nAlarmBellLatch;

    /**
     * \if ENGLISH_LANG
     * Rebot Enable,TRUE:enable FALSE:unenble
     * \else
     * 重启使能TRUE:使能 FALSE:不使能
     * \endif
     */
    public boolean                                bReboot;

    /**
     * \if ENGLISH_LANG
     * The Max Beep Time:3600，0 Stand for persistent buzz
     * \else
     * 蜂鸣时长最大值为3600，0代表持续蜂鸣
     * \endif
     */
    public int                                 nBeepTime;

    public NET_CFG_ALARM_MSG_HANDLE() {
        for(int i = 0; i < FinalVar.CFG_MAX_VIDEO_CHANNEL_NUM; i++) {
            stuPtzLink[i] = new NET_CFG_PTZ_LINK();
            stuPtzLinkEx[i] = new NET_PTZ_LINK();
            stuSnapshotTitle[i] = new NET_CFG_EVENT_TITLE();
            stuVideoTitle[i] = new NET_CFG_EVENT_TITLE();
            stuTour[i] = new NET_CFG_TOURLINK();
        }
    }
}

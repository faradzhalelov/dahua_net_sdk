package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * Alarm Linkage Structure
 * \else
 * 报警联动信息
 * \endif
 */
public class CFG_ALARM_MSG_HANDLE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * handling ability 
	 * \else
	 * 能力
	 * \endif
	 */
	
	public boolean				  abRecordMask;
	public boolean				  abRecordEnable;
	public boolean				  abRecordLatch;
	public boolean				  abAlarmOutMask;
	public boolean				  abAlarmOutEn;
	public boolean				  abAlarmOutLatch;
	public boolean				  abExAlarmOutMask;
	public boolean				  abExAlarmOutEn;
	public boolean				  abPtzLinkEn;
	public boolean				  abTourMask;
	public boolean				  abTourEnable;
	public boolean				  abSnapshot;
	public boolean				  abSnapshotEn;
	public boolean				  abSnapshotPeriod;
	public boolean				  abSnapshotTimes;
	public boolean				  abTipEnable;
	public boolean				  abMailEnable;
	public boolean				  abMessageEnable;
	public boolean				  abBeepEnable;
	public boolean				  abVoiceEnable;
	public boolean				  abMatrixMask;
	public boolean				  abMatrixEnable;
	public boolean				  abEventLatch;
	public boolean				  abLogEnable;
	public boolean				  abDelay;
	public boolean				  abVideoMessageEn;
	public boolean				  abMMSEnable;
	public boolean				  abMessageToNetEn;
	public boolean				  abTourSplit;
	public boolean				  abSnapshotTitleEn;

	public boolean              abChannelCount;
	public boolean              abAlarmOutCount;
	public boolean              abPtzLinkEx;
	public boolean              abSnapshotTitle;
	public boolean              abMailDetail;
	public boolean              abVideoTitleEn;
	public boolean              abVideoTitle;
	public boolean              abTour;
	public boolean              abDBKeys;
	public boolean              abJpegSummary;
	public boolean              abFlashEn;
	public boolean              abFlashLatch;
	

	/**
	 * \if ENGLISH_LANG
	 * Device Video Channel Count
	 * \else
	 * 设备的视频通道数
	 * \endif
	 */
	public int					nChannelCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Device Alarm Output Count 
	 * \else
	 * 设备的报警输出个数
	 * \endif
	 */
	public int					nAlarmOutCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Record Channl Mask(By Bits)
	 * \else
	 * 录像通道掩码(按位)
	 * \endif
	 */
	public int					dwRecordMask[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * Record Enable
	 * \else
	 * 录像使能
	 * \endif
	 */
	public boolean				bRecordEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Record Delay Time(Second) 
	 * \else
	 * 录像延时时间(秒)
	 * \endif
	 */
	public int					nRecordLatch;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Output Channel Mask 
	 * \else
	 * 报警输出通道掩码
	 * \endif
	 */
	public int					dwAlarmOutMask[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * Record Output Enable 
	 * \else
	 * 报警输出使能
	 * \endif
	 */
	public boolean				bAlarmOutEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Output Delay Time(Time)
	 * \else
	 * 报警输出延时时间(秒)
	 * \endif
	 */
	public int					nAlarmOutLatch;
	
	/**
	 * \if ENGLISH_LANG
	 * External Alarm Output Channel Mask 
	 * \else
	 * 扩展报警输出通道掩码
	 * \endif
	 */
	public int					dwExAlarmOutMask[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * External Alarm Output Enable 
	 * \else
	 * 扩展报警输出使能
	 * \endif
	 */
	public boolean				bExAlarmOutEn;
	
	/**
	 * \if ENGLISH_LANG
	 * PTZ Linkage 
	 * \else
	 * 云台联动项
	 * \endif
	 */
	public CFG_PTZ_LINK			stuPtzLink[] = new CFG_PTZ_LINK[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * PTZ Linkage Enable 
	 * \else
	 * 云台联动使能
	 * \endif
	 */
	public boolean				bPtzLinkEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Tour Channel Mask 
	 * \else
	 * 轮询通道掩码
	 * \endif
	 */
	public int					dwTourMask[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * Tour Enable 
	 * \else
	 * 轮询使能
	 * \endif
	 */
	public boolean				bTourEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot Channel No. Mask 
	 * \else
	 * 快照通道号掩码
	 * \endif
	 */
	public int					dwSnapshot[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot Enable 
	 * \else
	 * 快照使能
	 * \endif
	 */
	public boolean				bSnapshotEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot Period(Second) 
	 * \else
	 * 连拍周期(秒)
	 * \endif
	 */
	public int					nSnapshotPeriod;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot Times 	
	 * \else
	 * 连拍次数
	 * \endif
	 */
	public int					nSnapshotTimes;
	
	/**
	 * \if ENGLISH_LANG
	 * Local News Prompt 
	 * \else
	 * 本地消息框提示
	 * \endif
	 */
	public boolean				bTipEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Send Email，Picture As Attach 
	 * \else
	 * 发送邮件，如果有图片，作为附件
	 * \endif
	 */
	public boolean				bMailEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Upload to Alarm Server 
	 * \else
	 * 上传到报警服务器
	 * \endif
	 */
	public boolean				bMessageEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Beep 
	 * \else
	 * 蜂鸣
	 * \endif
	 */
	public boolean				bBeepEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Voice Prompt 
	 * \else
	 * 语音提示
	 * \endif
	 */
	public boolean				bVoiceEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Linkage Video Matrix Channel Mask 
	 * \else
	 * 联动视频矩阵通道掩码
	 * \endif
	 */
	public int					dwMatrixMask[] = new int[FinalVar.MAX_CHANNEL_COUNT];
	
	/**
	 * \if ENGLISH_LANG
	 * Linkage Video Matrix 
	 * \else
	 * 联动视频矩阵
	 * \endif
	 */
	public boolean				bMatrixEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Linkage Start Delay Time，s is the Unit 0-15 
	 * \else
	 * 联动开始延时时间(秒)，0－15
	 * \endif
	 */
	public int					nEventLatch;
	
	/**
	 * \if ENGLISH_LANG
	 * If Record Log 
	 * \else
	 * 是否记录日志
	 * \endif
	 */
	public boolean				bLogEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Delay Then Take Effect When Setting，Unit is Second 
	 * \else
	 * 设置时先延时再生效，单位为秒
	 * \endif
	 */
	public int					nDelay;
	
	/**
	 * \if ENGLISH_LANG
	 * Overlay Tip Tile To Video。Overlay Tile Includes Event Type，Channel No.，Count By Second
	 * \else
	 * 叠加提示字幕到视频。叠加的字幕包括事件类型，通道号，秒计时。
	 * \endif
	 */
	public boolean				bVideoMessageEn;
	
	/**
	 * \if ENGLISH_LANG
	 * MMS Enable 
	 * \else
	 * 发送彩信使能
	 * \endif
	 */
	public boolean				bMMSEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Message Send To Network Enable
	 * \else
	 * 消息上传给网络使能
	 * \endif
	 */
	public boolean				bMessageToNetEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Touring Split Mode 0: 1 Picture; 1: 8Picture 
	 * \else
	 * 轮巡时的分割模式 0: 1画面; 1: 8画面
	 * \endif
	 */
	public int					nTourSplit;
	
	/**
	 * \if ENGLISH_LANG
	 * If Overlay Snapshot Title 
	 * \else
	 * 是否叠加图片标题
	 * \endif
	 */
	public boolean				bSnapshotTitleEn;
	
	/**
	 * \if ENGLISH_LANG
	 * PTZ config 
	 * \else
	 * 云台配置数
	 * \endif
	 */
	public int                  nPtzLinkExNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Extension PTZ 
	 * \else
	 * 扩展云台信息
	 * \endif
	 */
	public CFG_PTZ_LINK_EX     	stuPtzLinkEx[] = new CFG_PTZ_LINK_EX[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Picture title content no.
	 * \else
	 * 图片标题内容数
	 * \endif
	 */
	public int                  nSnapTitleNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture title content 
	 * \else
	 * 图片标题内容
	 * \endif
	 */
	public CFG_EVENT_TITLE     	stuSnapshotTitle[] = new CFG_EVENT_TITLE[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * email detail 
	 * \else
	 * 邮件详细内容
	 * \endif
	 */
	public CFG_MAIL_DETAIL     	stuMailDetail = new CFG_MAIL_DETAIL();
	
	/**
	 * \if ENGLISH_LANG
	 * overlay video title or not, for main stream 
	 * \else
	 * 是否叠加视频标题，主要指主码流
	 * \endif
	 */
	public boolean              bVideoTitleEn;
	
	/**
	 * \if ENGLISH_LANG
	 * video title content no. 
	 * \else
	 * 视频标题内容数目
	 * \endif
	 */
	public int                  nVideoTitleNum;
	
	/**
	 * \if ENGLISH_LANG
	 * video title content 
	 * \else
	 * 视频标题内容
	 * \endif
	 */
	public CFG_EVENT_TITLE     	stuVideoTitle[] = new CFG_EVENT_TITLE[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * tour activation number 
	 * \else
	 * 轮询联动数目
	 * \endif
	 */
	public int                  nTourNum;
	
	/**
	 * \if ENGLISH_LANG
	 * tour avtivation config 
	 * \else
	 * 轮询联动配置
	 * \endif
	 */
	public CFG_TOURLINK        	stuTour[] = new CFG_TOURLINK[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * specify data library releted no. 
	 * \else
	 * 指定数据库关键字的有效数
	 * \endif
	 */
	public int                  nDBKeysNum;
	
	/**
	 * \if ENGLISH_LANG
	 * specify event detail needed data library key 
	 * \else
	 * 指定事件详细信息里需要写到数据库的关键字
	 * \endif
	 */
	public byte                 szDBKeys[][] = new byte[FinalVar.MAX_DBKEY_NUM][FinalVar.MAX_CHANNELNAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * overlay to JPEG summary 
	 * \else
	 * 叠加到JPEG图片的摘要信息
	 * \endif
	 */
	public byte                 byJpegSummary[] = new byte[FinalVar.MAX_SUMMARY_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * compensate light or not 
	 * \else
	 * 是否使能补光灯
	 * \endif
	 */
	public boolean              bFlashEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * light compensation delay(s), delay range：[10,300] 
	 * \else
	 * 补光灯延时时间(秒),延时时间范围：[10,300]
	 * \endif
	 */
	public int                  nFlashLatch;
	
	public boolean				abAudioFileName;
	public boolean				abAlarmBellEn;
	public boolean				abAccessControlEn;
	public boolean				abAccessControl;
	
	/**
	 * \if ENGLISH_LANG
	 * The Absolute Path to the Linkage Audio Files 
	 * \else
	 * 联动语音文件绝对路径
	 * \endif
	 */
	public byte[]				szAudioFileName = new byte[FinalVar.MAX_PATH];
	
	/**
	 * \if ENGLISH_LANG
	 * Warning Signal Enable 
	 * \else
	 * 警号使能
	 * \endif
	 */
	public boolean				bAlarmBellEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Entrance Guard Enable 
	 * \else
	 * 门禁使能
	 * \endif
	 */
	public boolean				bAccessControlEn; 
	
	/**
	 * \if ENGLISH_LANG
	 * Class Number of Entrance Guard 
	 * \else
	 * 门禁组数
	 * \endif
	 */
	public int					dwAccessControl; 
	
	/**
	 * \if ENGLISH_LANG
	 * Entrance Guard Linkage Operation Information, refer to {@link EM_CFG_ACCESSCONTROLTYPE}
	 * \else
	 * 门禁联动操作信息, 取值参考 {@link EM_CFG_ACCESSCONTROLTYPE}
	 * \endif
	 */
	public int[] 				emAccessControlType = new int[FinalVar.MAX_ACCESSCONTROL_NUM];
	
	public boolean				abTalkBack;	
	
	/**
	 * \if ENGLISH_LANG
	 * Voice Call Linkage Information
	 * \else
	 * 语音呼叫联动信息
	 * \endif
	 */
	public CFG_TALKBACK_INFO	stuTalkback = new CFG_TALKBACK_INFO();

	public boolean				abPSTNAlarmServer;

	/**
	 * \if ENGLISH_LANG
	 * Telephone Alarm Center Linkage Information
	 * \else
	 *  电话报警中心联动信息
	 * \endif
	 */
	public CFG_PSTN_ALARM_SERVER	stuPSTNAlarmServer = new CFG_PSTN_ALARM_SERVER();
	
	/**
	 * \if ENGLISH_LANG
	 * Event Response Timetable
	 * \else
	 * 事件响应时间表
	 * \endif
	 */
    public CFG_TIME_SCHEDULE       stuTimeSection = new CFG_TIME_SCHEDULE();

	/**
	 * \if ENGLISH_LANG
	 * bool				abAlarmBellLatch;
	 * \else
	 * bool				abAlarmBellLatch;
	 * \endif
	 */
	public boolean					abAlarmBellLatch;

	/**
	 * \if ENGLISH_LANG
	 *  Is the schedule ID valid
	 * \else
	 *  日程ID是否有效
	 * \endif
	 */
	public boolean					abScheduleID;

	/**
	 * \if ENGLISH_LANG
	 *  Schedule ID
	 * \else
	 *  日程ID
	 * \endif
	 */
	public short					nScheduleID;

	/**
	 * \if ENGLISH_LANG
	 *  Police no. output delay time(10-300 s)
	 * \else
	 *  警号输出延时时间(10-300秒)
	 * \endif
	 */
	public int					nAlarmBellLatch;

	/**
	 * \if ENGLISH_LANG
	 *    bool				abAudioPlayTimes;
	 * \else
	 *    bool				abAudioPlayTimes;
	 * \endif
	 */
	public boolean					abAudioPlayTimes;

	/**
	 * \if ENGLISH_LANG
	 *    bool				abAudioLinkTime;
	 * \else
	 *    bool				abAudioLinkTime;
	 * \endif
	 */
	public boolean					abAudioLinkTime;

	/**
	 * \if ENGLISH_LANG
	 *  times of linkage voice play
	 * \else
	 *  联动语音播放次数
	 * \endif
	 */
	public int					nAudioPlayTimes;

	/**
	 * \if ENGLISH_LANG
	 *  time of linkage voice play, uint:s
	 * \else
	 *  联动语音播放的时间, 单位：秒
	 * \endif
	 */
	public int					nAudioLinkTime;

	/**
	 * \if ENGLISH_LANG
	 *  is nAlarmOutTime valid
	 * \else
	 *  nAlarmOutTime 是否有效
	 * \endif
	 */
	public boolean					abAlarmOutTime;

	/**
	 * \if ENGLISH_LANG
	 *  alarm timeout,unit:second
	 * \else
	 *  报警输出持续时间,单位秒, 如果无此字段，按设备原来的方式实现
	 * \endif
	 */
	public int					nAlarmOutTime;

	/**
	 * \if ENGLISH_LANG
	 *  is nBeepTime valid
	 * \else
	 *  nBeepTime 是否有效
	 * \endif
	 */
	public boolean					abBeepTime;

	/**
	 * \if ENGLISH_LANG
	 *  beep time,unit:second,max value is 3600,0 means beep continuely
	 * \else
	 *  蜂鸣时长，单位秒，最大值为3600，0代表持续蜂鸣
	 * \endif
	 */
	public int					nBeepTime;
	
	public CFG_ALARM_MSG_HANDLE() {
		for (int i = 0; i < FinalVar.MAX_VIDEO_CHANNEL_NUM; i++) {
			stuPtzLink[i] = new CFG_PTZ_LINK();
			stuPtzLinkEx[i] = new CFG_PTZ_LINK_EX();
			stuSnapshotTitle[i] = new CFG_EVENT_TITLE();
			stuVideoTitle[i] = new CFG_EVENT_TITLE();
			stuTour[i] = new CFG_TOURLINK();
		}
	}

	@Override
	public String toString() {
		return "CFG_ALARM_MSG_HANDLE{" +
				"abRecordMask=" + abRecordMask +
				", abRecordEnable=" + abRecordEnable +
				", abRecordLatch=" + abRecordLatch +
				", abAlarmOutMask=" + abAlarmOutMask +
				", abAlarmOutEn=" + abAlarmOutEn +
				", abAlarmOutLatch=" + abAlarmOutLatch +
				", abExAlarmOutMask=" + abExAlarmOutMask +
				", abExAlarmOutEn=" + abExAlarmOutEn +
				", abPtzLinkEn=" + abPtzLinkEn +
				", abTourMask=" + abTourMask +
				", abTourEnable=" + abTourEnable +
				", abSnapshot=" + abSnapshot +
				", abSnapshotEn=" + abSnapshotEn +
				", abSnapshotPeriod=" + abSnapshotPeriod +
				", abSnapshotTimes=" + abSnapshotTimes +
				", abTipEnable=" + abTipEnable +
				", abMailEnable=" + abMailEnable +
				", abMessageEnable=" + abMessageEnable +
				", abBeepEnable=" + abBeepEnable +
				", abVoiceEnable=" + abVoiceEnable +
				", abMatrixMask=" + abMatrixMask +
				", abMatrixEnable=" + abMatrixEnable +
				", abEventLatch=" + abEventLatch +
				", abLogEnable=" + abLogEnable +
				", abDelay=" + abDelay +
				", abVideoMessageEn=" + abVideoMessageEn +
				", abMMSEnable=" + abMMSEnable +
				", abMessageToNetEn=" + abMessageToNetEn +
				", abTourSplit=" + abTourSplit +
				", abSnapshotTitleEn=" + abSnapshotTitleEn +
				", abChannelCount=" + abChannelCount +
				", abAlarmOutCount=" + abAlarmOutCount +
				", abPtzLinkEx=" + abPtzLinkEx +
				", abSnapshotTitle=" + abSnapshotTitle +
				", abMailDetail=" + abMailDetail +
				", abVideoTitleEn=" + abVideoTitleEn +
				", abVideoTitle=" + abVideoTitle +
				", abTour=" + abTour +
				", abDBKeys=" + abDBKeys +
				", abJpegSummary=" + abJpegSummary +
				", abFlashEn=" + abFlashEn +
				", abFlashLatch=" + abFlashLatch +
				", nChannelCount=" + nChannelCount +
				", nAlarmOutCount=" + nAlarmOutCount +
				", dwRecordMask=" + Arrays.toString(dwRecordMask) +
				", bRecordEnable=" + bRecordEnable +
				", nRecordLatch=" + nRecordLatch +
				", dwAlarmOutMask=" + Arrays.toString(dwAlarmOutMask) +
				", bAlarmOutEn=" + bAlarmOutEn +
				", nAlarmOutLatch=" + nAlarmOutLatch +
				", dwExAlarmOutMask=" + Arrays.toString(dwExAlarmOutMask) +
				", bExAlarmOutEn=" + bExAlarmOutEn +
				", stuPtzLink=" + Arrays.toString(stuPtzLink) +
				", bPtzLinkEn=" + bPtzLinkEn +
				", dwTourMask=" + Arrays.toString(dwTourMask) +
				", bTourEnable=" + bTourEnable +
				", dwSnapshot=" + Arrays.toString(dwSnapshot) +
				", bSnapshotEn=" + bSnapshotEn +
				", nSnapshotPeriod=" + nSnapshotPeriod +
				", nSnapshotTimes=" + nSnapshotTimes +
				", bTipEnable=" + bTipEnable +
				", bMailEnable=" + bMailEnable +
				", bMessageEnable=" + bMessageEnable +
				", bBeepEnable=" + bBeepEnable +
				", bVoiceEnable=" + bVoiceEnable +
				", dwMatrixMask=" + Arrays.toString(dwMatrixMask) +
				", bMatrixEnable=" + bMatrixEnable +
				", nEventLatch=" + nEventLatch +
				", bLogEnable=" + bLogEnable +
				", nDelay=" + nDelay +
				", bVideoMessageEn=" + bVideoMessageEn +
				", bMMSEnable=" + bMMSEnable +
				", bMessageToNetEn=" + bMessageToNetEn +
				", nTourSplit=" + nTourSplit +
				", bSnapshotTitleEn=" + bSnapshotTitleEn +
				", nPtzLinkExNum=" + nPtzLinkExNum +
				", stuPtzLinkEx=" + Arrays.toString(stuPtzLinkEx) +
				", nSnapTitleNum=" + nSnapTitleNum +
				", stuSnapshotTitle=" + Arrays.toString(stuSnapshotTitle) +
				", stuMailDetail=" + stuMailDetail +
				", bVideoTitleEn=" + bVideoTitleEn +
				", nVideoTitleNum=" + nVideoTitleNum +
				", stuVideoTitle=" + Arrays.toString(stuVideoTitle) +
				", nTourNum=" + nTourNum +
				", stuTour=" + Arrays.toString(stuTour) +
				", nDBKeysNum=" + nDBKeysNum +
				", szDBKeys=" + Arrays.toString(szDBKeys) +
				", byJpegSummary=" + Arrays.toString(byJpegSummary) +
				", bFlashEnable=" + bFlashEnable +
				", nFlashLatch=" + nFlashLatch +
				", abAudioFileName=" + abAudioFileName +
				", abAlarmBellEn=" + abAlarmBellEn +
				", abAccessControlEn=" + abAccessControlEn +
				", abAccessControl=" + abAccessControl +
				", szAudioFileName=" + Arrays.toString(szAudioFileName) +
				", bAlarmBellEn=" + bAlarmBellEn +
				", bAccessControlEn=" + bAccessControlEn +
				", dwAccessControl=" + dwAccessControl +
				", emAccessControlType=" + Arrays.toString(emAccessControlType) +
				", abTalkBack=" + abTalkBack +
				", stuTalkback=" + stuTalkback +
				", abPSTNAlarmServer=" + abPSTNAlarmServer +
				", stuPSTNAlarmServer=" + stuPSTNAlarmServer +
				", stuTimeSection=" + stuTimeSection +
				", abAlarmBellLatch=" + abAlarmBellLatch +
				", abScheduleID=" + abScheduleID +
				", nScheduleID=" + nScheduleID +
				", nAlarmBellLatch=" + nAlarmBellLatch +
				", abAudioPlayTimes=" + abAudioPlayTimes +
				", abAudioLinkTime=" + abAudioLinkTime +
				", nAudioPlayTimes=" + nAudioPlayTimes +
				", nAudioLinkTime=" + nAudioLinkTime +
				", abAlarmOutTime=" + abAlarmOutTime +
				", nAlarmOutTime=" + nAlarmOutTime +
				", abBeepTime=" + abBeepTime +
				", nBeepTime=" + nBeepTime +
				'}';
	}
}

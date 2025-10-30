package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm relay structure
 * \else
 * 报警联动扩展结构体
 * \endif
 */
public class SDK_MSG_HANDLE_EX implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Current alarm supporting methods, shown by bit mask
	 * Message triggered methods,multiple methods,including
	 * 0x00000001 - alarm upload
	 * 0x00000002 - triggering recording
	 * 0x00000004 - PTZ movement
	 * 0x00000008 - sending email
	 * 0x00000010 - local tour
	 * 0x00000020 - local tips
	 * 0x00000040 - alarm output
	 * 0x00000080 - ftp upload
	 * 0x00000100 - buzzer
	 * 0x00000200 - voice tips 
	 * 0x00000400 - snapshot
	 * \else
	 * 当前报警所支持的处理方式，按位掩码表示
	 * 消息处理方式，可以同时多种处理方式，包括
     * 0x00000001 - 报警上传
     * 0x00000002 - 联动录象
     * 0x00000004 - 云台联动
     * 0x00000008 - 发送邮件
     * 0x00000010 - 本地轮巡
     * 0x00000020 - 本地提示
     * 0x00000040 - 报警输出
     * 0x00000080 - Ftp上传
     * 0x00000100 - 蜂鸣
     * 0x00000200 - 语音提示
     * 0x00000400 - 抓图
	 * \endif
	 */
	public int               dwActionMask;

	/**
	 * \if ENGLISH_LANG
	 * Triggering action,shown by bit mask,concrete action parameter is shows in the configuration
	 * \else
	 * 触发动作，按位掩码表示，具体动作所需要的参数在各自的配置中体现
	 * \endif
	 */
	public int               dwActionFlag;
    
	/**
	 * \if ENGLISH_LANG
	 * Triggering alarm output channel,1 means triggering this output
	 * \else
	 * 报警触发的输出通道，报警触发的输出，为1表示触发该输出
	 * \endif
	 */
	public byte                byRelAlarmOut[] = new byte[FinalVar.SDK_MAX_ALARMOUT_NUM_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm lasting period
	 * \else
	 * 报警持续时间
	 * \endif
	 */
    public int               dwDuration;

    /**
	 * \if ENGLISH_LANG
	 * Record channel triggered by alarm,1 means triggering this channel
	 * \else
	 * 报警触发的录象通道，为1表示触发该通道
	 * \endif
	 */
    public byte                byRecordChannel[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM_EX];
    
    /**
	 * \if ENGLISH_LANG
	 * Recording period
	 * \else
	 * 录象持续时间
	 * \endif
	 */
    public int               dwRecLatch;

    /**
	 * \if ENGLISH_LANG
	 * Snapshot channel
	 * \else
	 * 抓图通道
	 * \endif
	 */
    public byte                bySnap[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM_EX];

    /**
	 * \if ENGLISH_LANG
	 * Tour channel
	 * \else
	 * 轮巡通道
	 * \endif
	 */
    public byte                byTour[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM_EX];

    /**
	 * \if ENGLISH_LANG
	 * PTZ movement
	 * \else
	 * 云台联动
	 * \endif
	 */
    public SDK_PTZ_LINK         struPtzLink[] = new SDK_PTZ_LINK[FinalVar.SDK_MAX_VIDEO_IN_NUM_EX];
    
    /**
	 * \if ENGLISH_LANG
	 * Event delay time, s for unit,range is 0~15,default is 0
	 * \else
	 * 联动开始延时时间，s为单位，范围是0~15，默认值是0
	 * \endif
	 */
    public int               dwEventLatch;

    /**
	 * \if ENGLISH_LANG
	 * Alarm trigerring wireless output,alarm output,1 for trigerring output
	 * \else
	 * 报警触发的无线输出通道，报警触发的输出，为1表示触发该输出
	 * \endif
	 */
    public byte                byRelWIAlarmOut[] = new byte[FinalVar.SDK_MAX_ALARMOUT_NUM_EX];
    
    /**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 
	 * \endif
	 */
    public byte                bMessageToNet;
    
    /**
	 * \if ENGLISH_LANG
	 * Message triggering alarm enabling
	 * \else
	 * 短信报警使能
	 * \endif
	 */
    public byte                bMMSEn;
    
    /**
	 * \if ENGLISH_LANG
	 * the number of sheets of drawings
	 * \else
	 * 短信发送抓图张数
	 * \endif
	 */
    public byte                bySnapshotTimes;
    
    /**
	 * \if ENGLISH_LANG
	 * Matrix output enable
	 * \else
	 * 矩阵使能
	 * \endif
	 */
    public byte                bMatrixEn;
    
    /**
	 * \if ENGLISH_LANG
	 * Matrix mask
	 * \else
	 * 矩阵掩码
	 * \endif
	 */
    public int               dwMatrix;
    
    /**
	 * \if ENGLISH_LANG
	 * Log enable,only used in WTN motion detection
	 * \else
	 * 日志使能，目前只有在WTN动态检测中使用
	 * \endif
	 */
    public byte                bLog;
    
    /**
	 * \if ENGLISH_LANG
	 * Snapshot frame interval. System can snapshot regularly at the interval you specify here. The snapshot amount in a period of time also has relationship with the snapshot frame rate. 0 means there is no interval, system just snapshot continuously.
	 * \else
	 * 抓图帧间隔，每隔多少帧抓一张图片，一定时间内抓拍的张数还与抓图帧率有关。0表示不隔帧，连续抓拍。
	 * \endif
	 */
    public byte                bSnapshotPeriod;
    
    /**
	 * \if ENGLISH_LANG
	 * Tour channel 32-63
	 * \else
	 * 轮巡通道 32-63路
	 * \endif
	 */
    public byte                byTour2[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM_EX];
    
    /**
	 * \if ENGLISH_LANG
	 * 0,picture,1,record
	 * \else
	 * 0，图片附件，1，录像附件
	 * \endif
	 */
    public byte                byEmailType;
    
    /**
	 * \if ENGLISH_LANG
	 * max record length,unit:MB
	 * \else
	 * 附件录像时的最大长度，单位MB
	 * \endif
	 */
    public byte                byEmailMaxLength;
    
    /**
	 * \if ENGLISH_LANG
	 * max time length, unit:second
	 * \else
	 * 附件是录像时最大时间长度，单位秒
	 * \endif
	 */
    public byte                byEmailMaxTime;
    
    public SDK_MSG_HANDLE_EX() {
    	for (int i = 0; i < FinalVar.SDK_MAX_VIDEO_IN_NUM_EX; i++) {
    		struPtzLink[i] = new SDK_PTZ_LINK();
    	}
    }
}

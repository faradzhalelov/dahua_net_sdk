package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm activation structure
 * \else
 * 报警联动结构体
 * \endif
 */
public class SDK_MSG_HANDLE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The current alarm processing support bitwise mask:
	 * Message processing manner, while a variety of treatment,Include
	 * <table>
	 * <tr><td>0x00000001</td><td>Alarm upload</td></tr>
	 * <tr><td>0x00000002</td><td>activation video</td></tr>
	 * <tr><td>0x00000004</td><td>PTZ activation</td></tr>
	 * <tr><td>0x00000008</td><td>Send Email</td></tr>
	 * <tr><td>0x00000010</td><td>Tour</td></tr>
	 * <tr><td>0x00000020</td><td>Local Tip</td></tr>
	 * <tr><td>0x00000040</td><td>Alarm output</td></tr>
	 * <tr><td>0x00000080</td><td>Ftp upload</td></tr>
	 * <tr><td>0x00000100</td><td>Buzzer</td></tr>
	 * <tr><td>0x00000200</td><td>Voice prompts</td></tr>
	 * <tr><td>0x00000400</td><td>Snoapshot</td></tr>
	 * </table>
	 * \else
	 * 当前报警所支持的处理方式，按位掩码表示:
	 * 消息处理方式，可以同时多种处理方式，包括
	 * <table>
	 * <tr><td>0x00000001</td><td>报警上传</td></tr>
	 * <tr><td>0x00000002</td><td>联动录象</td></tr>
	 * <tr><td>0x00000004</td><td>云台联动</td></tr>
	 * <tr><td>0x00000008</td><td>发送邮件</td></tr>
	 * <tr><td>0x00000010</td><td>本地轮巡</td></tr>
	 * <tr><td>0x00000020</td><td>本地提示</td></tr>
	 * <tr><td>0x00000040</td><td>报警输出</td></tr>
	 * <tr><td>0x00000080</td><td>Ftp上传</td></tr>
	 * <tr><td>0x00000100</td><td>蜂鸣</td></tr>
	 * <tr><td>0x00000200</td><td>语音提示</td></tr>
	 * <tr><td>0x00000400</td><td>抓图</td></tr>
	 * </table>
	 * \endif
	 */
	public int                 dwActionMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Trigger action, according to the bit mask indicates that the parameters needed by the specific operation is reflected in the respective configuration
	 * \else
	 * 触发动作，按位掩码表示，具体动作所需要的参数在各自的配置中体现
	 * \endif
	 */
	public int                 dwActionFlag;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm trigger output channel, alarm trigger output to trigger the output to 1
	 * \else
	 * 报警触发的输出通道，报警触发的输出，为1表示触发该输出
	 * \endif
	 */
	public byte                byRelAlarmOut[] = new byte[FinalVar.SDK_MAX_ALARMOUT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm duration time
	 * \else
	 * 报警持续时间
	 * \endif
	 */
    public int                 dwDuration;
    
    /**
	 * \if ENGLISH_LANG
	 * Activation video, alarm-triggered video channel for 1 to trigger the channel
	 * \else
	 * 联动录象，报警触发的录象通道，为1表示触发该通道
	 * \endif
	 */
    public byte                byRecordChannel[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * Record duration time.
	 * \else
	 * 录象持续时间.
	 * \endif
	 */
    public int                 dwRecLatch;
    
    /**
	 * \if ENGLISH_LANG
	 * Snapshot channel
	 * \else
	 * 抓图通道
	 * \endif
	 */
    public byte                bySnap[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * Tour channel
	 * \else
	 * 轮巡通道
	 * \endif
	 */
    public byte                byTour[] = new byte[FinalVar.SDK_MAX_VIDEO_IN_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * PTZ Activation
	 * \else
	 * 云台联动
	 * \endif
	 */
    public SDK_PTZ_LINK         struPtzLink[] = new SDK_PTZ_LINK[FinalVar.SDK_MAX_VIDEO_IN_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * Activation start delay time, s units, the range is from 0 to 15, the default value is 0
	 * \else
	 * 联动开始延时时间，s为单位，范围是0~15，默认值是0
	 * \endif
	 */
    public int               dwEventLatch;
    
    /**
	 * \if ENGLISH_LANG
	 * Activation start delay time, s units, the range is from 0 to 15, the default value is 0
	 * \else
	 * 联动开始延时时间，s为单位，范围是0~15，默认值是0
	 * \endif
	 */
    public byte                byRelWIAlarmOut[] = new byte[FinalVar.SDK_MAX_ALARMOUT_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * Message upload network
	 * \else
	 * 消息上传网络
	 * \endif
	 */
    public byte                bMessageToNet;
    
    /**
	 * \if ENGLISH_LANG
	 * Short message alarm enable
	 * \else
	 * 短信报警使能
	 * \endif
	 */
    public byte                bMMSEn;
    
    /**
	 * \if ENGLISH_LANG
	 * Short message send snopshot picture number
	 * \else
	 * 短信发送抓图张数
	 * \endif
	 */
    public byte                bySnapshotTimes;
    
    /**
	 * \if ENGLISH_LANG
	 * Matrix enable
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
    public int                 dwMatrix;
    
    /**
	 * \if ENGLISH_LANG
	 * Log enabled, only the WTN dynamic detection in use
	 * \else
	 * 日志使能，目前只有在WTN动态检测中使用
	 * \endif
	 */
    public byte                bLog;
    
    /**
	 * \if ENGLISH_LANG
	 * Capture frame interval, every how many frames to draw a picture, the number of sheets to capture a certain period of time with the capture frame rate. 0 means that not every frame, continuous capture
	 * \else
	 * 抓图帧间隔，每隔多少帧抓一张图片，一定时间内抓拍的张数还与抓图帧率有关。0表示不隔帧，连续抓拍
	 * \endif
	 */
    public byte                bSnapshotPeriod;
    
    /**
	 * \if ENGLISH_LANG
	 * 0,Image Attachment,1,Video Attachment
	 * \else
	 * 0，图片附件，1，录像附件
	 * \endif
	 */
    public byte                byEmailType;
    
    /**
	 * \if ENGLISH_LANG
	 * Annex Videorecording maximum length, the unit MB
	 * \else
	 * 附件录像时的最大长度，单位MB
	 * \endif
	 */
    public byte                byEmailMaxLength;
    
    /**
	 * \if ENGLISH_LANG
	 * Attached is the maximum length of time in the video,Unit is second
	 * \else
	 * 附件是录像时最大时间长度，单位秒
	 * \endif
	 */
    public byte                byEmailMaxTime;
    
    public SDK_MSG_HANDLE() {
    	for (int i = 0; i < FinalVar.SDK_MAX_VIDEO_IN_NUM; i++) {
    		struPtzLink[i] = new SDK_PTZ_LINK();
    	}
    }
}

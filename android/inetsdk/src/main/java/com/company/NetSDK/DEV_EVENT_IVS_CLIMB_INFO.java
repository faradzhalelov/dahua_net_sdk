package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event type {@link FinalVar#EVENT_IVS_CLIMBDETECTION} (climb check)corresponding data block description info
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_CLIMBDETECTION} (攀高检测事件)对应数据块描述信息
 * \endif
 */
public class DEV_EVENT_IVS_CLIMB_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel ID
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                 nChannelID;

	/**
	 * \if ENGLISH_LANG
	 * event name
	 * \else
	 * 事件名称
	 * \endif
	 */
	public byte                szName[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Time stamp(ms)
	 * \else
	 * 时间戳(单位是毫秒)
	 * \endif
	 */
	public double              PTS;

	/**
	 * \if ENGLISH_LANG
	 * Event occurred time
	 * \else
	 * 事件发生的时间
	 * \endif
	 */
	public NET_TIME_EX         UTC = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * event ID
	 * \else
	 * 事件ID
	 * \endif
	 */
	public int                 nEventID;

	/**
	 * \if ENGLISH_LANG
	 * Detected object
	 * \else
	 * 检测到的物体
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuObject = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * The corresponding file info of the event
	 * \else
	 * 事件对应文件信息
	 * \endif
	 */
	public SDK_EVENT_FILE_INFO  stuFileInfo = new SDK_EVENT_FILE_INFO();

	/**
	 * \if ENGLISH_LANG
	 * picture resolution
	 * \else
	 * 对应图片的分辨率
	 * \endif
	 */
	public SDK_RESOLUTION_INFO  stuResolution = new SDK_RESOLUTION_INFO();

	/**
	 * \if ENGLISH_LANG
	 * Acme amount of the rule detect zone
	 * \else
	 * 规则检测线顶点数
	 * \endif
	 */
	public int                 nDetectLineNum;

	/**
	 * \if ENGLISH_LANG
	 * Rule detect zone
	 * \else
	 * 规则检测线
	 * \endif
	 */
	public SDK_POINT            DetectLine[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_LINE_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Event operation.0=pulse event,1=begin of the durative event,2=end of the durative event;
	 * \else
	 * 事件动作，0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
	 * \endif
	 */
	public byte                bEventAction;

	/**
	 * \if ENGLISH_LANG
	 * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
	 * \else
	 * 图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
	 * \endif
	 */
	public byte                byImageIndex;

	/**
	 * \if ENGLISH_LANG
	 * event trigger accumilated times
	 * \else
	 * 事件触发累计次数
	 * \endif
	 */
	public int        nOccurrenceCount;
	
	public DEV_EVENT_IVS_CLIMB_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_DETECT_LINE_NUM; i++) {
			DetectLine[i] = new SDK_POINT();
    	}
	}
}

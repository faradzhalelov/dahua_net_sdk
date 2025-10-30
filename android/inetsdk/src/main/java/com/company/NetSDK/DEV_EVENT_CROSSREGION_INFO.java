package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of {@link FinalVar#EVENT_IVS_CROSSREGIONDETECTION}'s data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_CROSSREGIONDETECTION} (警戒区事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_CROSSREGION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ChannelId
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
	 * PTS(ms)
	 * \else
	 * 时间戳(单位是毫秒)
	 * \endif
	 */
	public double              PTS;
	
	/**
	 * \if ENGLISH_LANG
	 * the event happen time
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
     * have being detected object
     * \else
     * 检测到的物体
     * \endif
     */
    public SDK_MSG_OBJECT       stuObject = new SDK_MSG_OBJECT();
    
    /**
     * \if ENGLISH_LANG
     * event file info
     * \else
     * 事件对应文件信息
     * \endif
     */
    public SDK_EVENT_FILE_INFO  stuFileInfo = new SDK_EVENT_FILE_INFO();
    
    /**
     * \if ENGLISH_LANG
     * rule detect region
     * \else
     * 规则检测区域
     * \endif
     */
    public SDK_POINT            DetectRegion[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_REGION_NUM];
    
    /**
     * \if ENGLISH_LANG
     * rule detect region's point number
     * \else
     * 规则检测区域顶点数
     * \endif
     */
    public int                 nDetectRegionNum;
    
    /**
     * \if ENGLISH_LANG
     * object moving track
     * \else
     * 物体运动轨迹
     * \endif
     */
    public SDK_POINT            TrackLine[] = new SDK_POINT[FinalVar.SDK_MAX_TRACK_LINE_NUM];
    
    /**
     * \if ENGLISH_LANG
     * object moving track's point number
     * \else
     * 物体运动轨迹顶点数
     * \endif
     */
    public int                 nTrackLineNum;
    
    /**
     * \if ENGLISH_LANG
     * Event action,0 means pulse event,1 means continuous event's begin,2means continuous event's end;
     * \else
     * 事件动作，0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public byte                bEventAction;
    
    /**
     * \if ENGLISH_LANG
     * direction, 0-in, 1-out,2-apaer,3-leave
     * \else
     * 表示入侵方向, 0-进入, 1-离开，2-出现，3-消失
     * \endif
     */
    public byte                bDirection;
    
    /**
     * \if ENGLISH_LANG
     * action type,0-appear 1-disappear 2-in area 3-cross area
     * \else
     * 表示检测动作类型,0-出现 1-消失 2-在区域内 3-穿越区域
     * \endif
     */
    public byte                bActionType;
    
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
     * snap flags(by bit),0bit:"*",1bit:"Timing",2bit:"Manual",3bit:"Marked",4bit:"Event",5bit:"Mosaic",6bit:"Cutout"
     * \else
     * 抓图标志(按位),0位:"*",1位:"Timing",2位:"Manual",3位:"Marked",4位:"Event",5位:"Mosaic",6位:"Cutout"
     * \endif
     */
    public int               dwSnapFlagMask;
    
    /**
     * \if ENGLISH_LANG
     * the source device's index,-1 means data in invalid
     * \else
     * 事件源设备上的index,-1表示数据无效
     * \endif
     */
    public int                 nSourceIndex;
    
    /**
     * \if ENGLISH_LANG
     * the source device's sign(exclusive),field said local device does not exist or is empty
     * \else
     * 事件源设备唯一标识,字段不存在或者为空表示本地设备
     * \endif
     */
    public byte                szSourceDevice[] = new byte[FinalVar.MAX_PATH];
    
    /**
     * \if ENGLISH_LANG
     * event trigger times
     * \else
     * 事件触发累计次数
     * \endif
     */
    public int        nOccurrenceCount;

	/**
	 * \if ENGLISH_LANG
	 * Cargo Channel Info
	 * \else
	 * 事件触发累计次数
	 * \endif
	 */
	public NET_CUSTOM_INFO stuCustom = new NET_CUSTOM_INFO();

	/**
	 * \if ENGLISH_LANG
	 * Extension info
	 * \else
	 * 事件扩展信息
	 * \endif
	 */
	public NET_EXTENSION_INFO stuExtensionInfo = new NET_EXTENSION_INFO();

	/**
     * \if ENGLISH_LANG
     * Detect object amount
     * \else
     * 检测到的物体个数
     * \endif
     */
    public int                 nObjectNum;
    
    /**
     * \if ENGLISH_LANG
     * Detected object
     * \else
     * 检测到的物体
     * \endif
     */
    public SDK_MSG_OBJECT       stuObjectIDs[] = new SDK_MSG_OBJECT[FinalVar.SDK_MAX_OBJECT_LIST];
    
    /**
     * \if ENGLISH_LANG
     * Locus amount(Corresponding to the detected object amount.)
     * \else
     * 轨迹数(与检测到的物体个数对应)
     * \endif
     */
    public int                 nTrackNum;
    
    /**
     * \if ENGLISH_LANG
     * Locus info(Corresponding to the detected object)
     * \else
     * 轨迹信息(与检测到的物体对应)
     * \endif
     */
    public SDK_POLY_POINTS      stuTrackInfo[] = new SDK_POLY_POINTS[FinalVar.SDK_MAX_OBJECT_LIST];

	/**
	 * \if ENGLISH_LANG
	 * intelli comm info
	 * \else
	 * 智能报警事件公共信息
	 * \endif
	 */
	public EVENT_INTELLI_COMM_INFO     stuIntelliCommInfo = new EVENT_INTELLI_COMM_INFO();

    public DEV_EVENT_CROSSREGION_INFO() {
    	for (int i = 0; i < FinalVar.SDK_MAX_DETECT_REGION_NUM; i++) {
    		DetectRegion[i] = new SDK_POINT();
    	}
    	
    	for (int i = 0; i < FinalVar.SDK_MAX_TRACK_LINE_NUM; i++) {
    		TrackLine[i] = new SDK_POINT();
    	}
    	
    	for (int i = 0; i < FinalVar.SDK_MAX_OBJECT_LIST; i++) {
    		stuObjectIDs[i] = new SDK_MSG_OBJECT();
    		stuTrackInfo[i] = new SDK_POLY_POINTS();
    	}
    }
}

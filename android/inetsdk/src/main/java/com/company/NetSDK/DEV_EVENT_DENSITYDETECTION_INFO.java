package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event type {@link FinalVar#EVENT_IVS_DENSITYDETECTION} (Population amount detect) corresponding data block description info
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_DENSITYDETECTION} (人员密度检测)对应数据块描述信息
 * \endif
 */
public class DEV_EVENT_DENSITYDETECTION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                 nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Event name
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
	 * Event ID
	 * \else
	 * 事件ID
	 * \endif
	 */
    public int                 nEventID;
    
    /**
	 * \if ENGLISH_LANG
	 * Detected object amount
	 * \else
	 * 检测到的物体个数
	 * \endif
	 */
    public int                 nObjectNum;
    
    /**
	 * \if ENGLISH_LANG
	 * Detected object list
	 * \else
	 * 检测到的物体列表
	 * \endif
	 */
    public SDK_MSG_OBJECT       stuObjectIDs[] = new SDK_MSG_OBJECT[FinalVar.SDK_MAX_OBJECT_LIST];
    
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
	 * Acme amount of the rule detect zone
	 * \else
	 * 规则检测区域顶点数
	 * \endif
	 */
    public int                 nDetectRegionNum;
    
    /**
	 * \if ENGLISH_LANG
	 * Rule detect zone
	 * \else
	 * 规则检测区域
	 * \endif
	 */
    public SDK_POINT            DetectRegion[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_REGION_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * Snap flag(by bit).please refer to {@link NET_RESERVED_COMMON}
	 * \else
	 * 抓图标志(按位)，具体见 {@link NET_RESERVED_COMMON}
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
	 * event trigger accumilated times 
	 * \else
	 * 事件触发累计次数
	 * \endif
	 */
    public int        nOccurrenceCount;
    
    public DEV_EVENT_DENSITYDETECTION_INFO() {
    	for (int i = 0; i < FinalVar.SDK_MAX_OBJECT_LIST; i++) {
    		stuObjectIDs[i] = new SDK_MSG_OBJECT();
    	}
    	
    	for (int i = 0; i < FinalVar.SDK_MAX_DETECT_REGION_NUM; i++) {
    		DetectRegion[i] = new SDK_POINT();
    	}
    }
}

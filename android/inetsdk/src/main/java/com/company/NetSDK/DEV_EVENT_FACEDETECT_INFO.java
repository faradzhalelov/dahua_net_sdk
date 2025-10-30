package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of {@link FinalVar#EVENT_IVS_FACEDETECT}'s data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_FACEDETECT} (目标检测事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_FACEDETECT_INFO implements Serializable {
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
	 * Event action: 0 means pulse event,1 means continuous event's begin,2means continuous event's end;
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
	 * detect region point number
	 * \else
	 * 规则检测区域顶点数
	 * \endif
	 */
    public int                 nDetectRegionNum; 
    
    /**
	 * \if ENGLISH_LANG
	 * detect region
	 * \else
	 * 规则检测区域
	 * \endif
	 */
    public SDK_POINT            DetectRegion[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_REGION_NUM]; 
    
    /**
	 * \if ENGLISH_LANG
	 * flag(by bit),see {@link NET_RESERVED_COMMON}
	 * \else
	 * 抓图标志(按位)，具体见 {@link NET_RESERVED_COMMON}， 0位:"*",1位:"Timing",2位:"Manual",3位:"Marked",4位:"Event",5位:"Mosaic",6位:"Cutout"
	 * \endif
	 */
    public int               	dwSnapFlagMask;
    
    /**
	 * \if ENGLISH_LANG
	 * snapshot current face device address
	 * \else
	 * 抓拍当前目标的设备地址，如：滨康路37号
	 * \endif
	 */
    public byte                szSnapDevAddress[] = new byte[FinalVar.MAX_PATH]; 
    
    /**
	 * \if ENGLISH_LANG
	 * event trigger accumilated times 
	 * \else
	 * 事件触发累计次数
	 * \endif
	 */
    public int        			nOccurrenceCount;

	/**
	 * \if ENGLISH_LANG
	 * sex type
	 * \else
	 * 性别, 参考 {@link EM_DEV_EVENT_FACEDETECT_SEX_TYPE}
	 * \endif
	 */
	public int 				emSex;

	/**
	 * \if ENGLISH_LANG
	 * age, invalid if it is -1
	 * \else
	 * 年龄,-1表示该字段数据无效
	 * \endif
	 */
	public int                 nAge;

	/**
	 * \if ENGLISH_LANG
	 * valid number in array emFeature
	 * \else
	 * 目标特征数组有效个数,与 emFeature 结合使用
	 * \endif
	 */
	public int        			nFeatureValidNum;

	/**
	 * \if ENGLISH_LANG
	 * human face features
	 * \else
	 * 目标特征数组,与 nFeatureValidNum 结合使用, 参考 {@link EM_DEV_EVENT_FACEDETECT_FEATURE_TYPE}
	 * \endif
	 */
	public int[]    			emFeature = new int[FinalVar.SDK_MAX_FACEDETECT_FEATURE_NUM];

	/**
	 * \if ENGLISH_LANG
	 * number of stuFaces
	 * \else
	 * 指示stuFaces有效数量
	 * \endif
	 */
	public int                 nFacesNum;

	/**
	 * \if ENGLISH_LANG
	 * when nFacesNum > 0, stuObject invalid
	 * \else
	 * 多张目标时使用,此时没有Object
	 * \endif
	 */
	public NET_FACE_INFO[]     stuFaces = new NET_FACE_INFO[10];

	/**
	 * \if ENGLISH_LANG
	 * public info
	 * \else
	 * 智能事件公共信息
	 * \endif
	 */
	public EVENT_INTELLI_COMM_INFO     stuIntelliCommInfo = new EVENT_INTELLI_COMM_INFO();

	/**
	 * \if ENGLISH_LANG
	 * eyes state
	 * \else
	 * 眼睛状态, {@link EM_EYE_STATE_TYPE}
	 * \endif
	 */
	public int					emEye;

	/**
	 * \if ENGLISH_LANG
	 * mouth state
	 * \else
	 * 嘴巴状态 , 参考 {@link EM_MOUTH_STATE_TYPE}
	 * \endif
	 */
	public int					emMouth;

	/**
	 * \if ENGLISH_LANG
	 * mask state
	 * \else
	 * 口罩状态, 参考 {@link EM_MASK_STATE_TYPE}
	 * \endif
	 */
	public int 				emMask;

	/**
	 * \if ENGLISH_LANG
	 * beard state
	 * \else
	 * 胡子状态 , 参考 {@link EM_BEARD_STATE_TYPE}
	 * \endif
	 */
	public int					emBeard;

	/**
	 * \if ENGLISH_LANG
	 * Attractive value, -1: invalid, 0:no disringuish，range: 1-100, the higher
	 * \else
	 * 魅力值, -1表示无效, 0未识别，识别时范围1-100,得分高魅力高
	 * \endif
	 */
	public int					nAttractive;

	/**
	 * \if ENGLISH_LANG
	 * The unique identifier of the snap person to write to the database
	 * \else
	 * 抓拍人员写入数据库的唯一标识符
	 * \endif
	 */
	public byte[]				szUID = new byte[FinalVar.SDK_COMMON_STRING_32];

    public DEV_EVENT_FACEDETECT_INFO() {
    	for (int i = 0; i < FinalVar.SDK_MAX_DETECT_REGION_NUM; i++) {
    		DetectRegion[i] = new SDK_POINT();
    	}

		for(int i = 0; i < 10; i++) {
			stuFaces[i] = new NET_FACE_INFO();
		}
    }
}

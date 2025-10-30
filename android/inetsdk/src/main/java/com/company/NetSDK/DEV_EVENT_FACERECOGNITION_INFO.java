package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * the describe of {@link FinalVar#EVENT_IVS_FACERECOGNITION}'s data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_FACERECOGNITION} (目标识别)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_FACERECOGNITION_INFO implements Serializable {
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
	 * event ID
	 * \else
	 * 事件ID
	 * \endif
	 */
    public int                 nEventID;
    
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
     * have being detected object
     * \else
     * 检测到的物体
     * \endif
     */
    public SDK_MSG_OBJECT       stuObject = new SDK_MSG_OBJECT();
    
    /**
     * \if ENGLISH_LANG
     * candidate number
     * \else
     * 当前目标匹配到的候选对象数量
     * \endif
     */
    public int                 nCandidateNum;
    
    /**
     * \if ENGLISH_LANG
     * candidate info
     * \else
     * 当前目标匹配到的候选对象信息
     * \endif
     */
    public CANDIDATE_INFO      stuCandidates[] = new CANDIDATE_INFO[FinalVar.SDK_MAX_CANDIDATE_NUM];
    
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
     * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
     * \else
     * 图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
     * \endif
     */
    public byte                byImageIndex;
    
    /**
     * \if ENGLISH_LANG
     * The existence panorama
     * \else
     * 全景图是否存在
     * \endif
     */
    public boolean              bGlobalScenePic;
    
    /**
     * \if ENGLISH_LANG
     * Panoramic Photos
     * \else
     * 全景图片信息
     * \endif
     */
    public SDK_PIC_INFO         stuGlobalScenePicInfo = new SDK_PIC_INFO();
    
    /**
     * \if ENGLISH_LANG
     * Snapshot current target aadevice address
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
	 * intelligent things info
	 * \else
	 * 智能事件公共信息
	 * \endif
	 */
	public EVENT_INTELLI_COMM_INFO     stuIntelliCommInfo = new EVENT_INTELLI_COMM_INFO();

	/**
	 * \if ENGLISH_LANG
	 * the data of face
	 * \else
	 *  目标数据
	 * \endif
	 */
	public NET_FACE_DATA		stuFaceData = new NET_FACE_DATA();

	/**
	 * \if ENGLISH_LANG
	 * The unique identifier of the snap person to write to the database
	 * \else
	 * 抓拍人员写入数据库的唯一标识符
	 * \endif
	 */
	public byte[]				szUID = new byte[FinalVar.SDK_COMMON_STRING_32];

	/**
	 * \if ENGLISH_LANG
	 * Feature data information
	 * \else
	 * 特征值信息
	 * \endif
	 */
	public NET_FEATURE_VECTOR	stuFeatureVector = new NET_FEATURE_VECTOR();

	/**
	 * \if ENGLISH_LANG
	 * The version of the feature data algorithm
	 * \else
	 * 特征值算法版本
	 * \endif
	 */
	public byte[]				szFeatureVersion = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * he actual return number of stuCandidatesEx
	 * \else
	 * 当前目标匹配到的候选对象数量实际返回值
	 * \endif
	 */
	public int					nRetCandidatesExNum;

	/**
	 * \if ENGLISH_LANG
	 * the expansion of candidate information
	 * \else
	 * 当前目标匹配到的候选对象信息扩展
	 * \endif
	 */
	public CANDIDATE_INFOEX[]  stuCandidatesEx = new CANDIDATE_INFOEX[FinalVar.SDK_MAX_CANDIDATE_NUM];

	/**
	 * \if ENGLISH_LANG
	 *  szSerial UUID
	 * \else
	 *  级联物体ID唯一标识
	 * \endif
	 */
	public byte					szSerialUUID[] = new byte[22];

	/**
	 * \if ENGLISH_LANG
	 *  Target recognition project customization information
	 * \else
	 *  项目信息
	 * \endif
	 */
	public NET_CUSTOM_PROJECTS_INFO					stuCustomProjects = new NET_CUSTOM_PROJECTS_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  Smart retail, whether it conforms to the de duplication strategy (true: conforms to false: does not conform to)
	 * \else
	 *  智慧零售，是否符合去重策略（TRUE：符合 FALSE：不符合）
	 * \endif
	 */
	public boolean					bIsDuplicateRemove;

	/**
	 * \if ENGLISH_LANG
	 *  Alarm type for abnormal personnel situation in the driving training vehicle, 0: Unknown 1: Alarm for non driving school personnel 2: Alarm for no coach
	 * \else
	 *  驾培车内的人员情况异常报警类型, 0:未知 1: 非驾校人员报警 2: 无教练报警
	 * \endif
	 */
	public int					nAbTrainCondition;

	/**
	 * \if ENGLISH_LANG
	 *  image information array
	 * \else
	 *  图片信息数组
	 * \endif
	 */
	public NET_IMAGE_INFO_EX2					stuImageInfo[] = new NET_IMAGE_INFO_EX2[32];

	/**
	 * \if ENGLISH_LANG
	 *  the number of image information
	 * \else
	 *  图片信息个数
	 * \endif
	 */
	public int					nImageInfoNum;

	/**
	 * \if ENGLISH_LANG
	 *  Detected object supplementary field
	 * \else
	 *  检测到的物体补充字段
	 * \endif
	 */
	public SDK_MSG_OBJECT_SUPPLEMENT					stuObjectSupplement = new SDK_MSG_OBJECT_SUPPLEMENT();

	/**
	 * \if ENGLISH_LANG
	 *  0 - normal 1 - enable stranger mode
	 * \else
	 *  0-普通  1-开启陌生人模式
	 * \endif
	 */
	public int					nMode;

	/**
	 * \if ENGLISH_LANG
	 *  Thumbnail information of large image (Panorama)
	 * \else
	 *  大图（全景图）的缩略图信息
	 * \endif
	 */
	public SCENE_IMAGE_INFO					stuThumImageInfo = new SCENE_IMAGE_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  Human body picture information
	 * \else
	 *  人体图片信息
	 * \endif
	 */
	public SCENE_IMAGE_INFO					stuHumanImageInfo = new SCENE_IMAGE_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  ftp path for assocated video
	 * \else
	 *  违章关联视频FTP上传路径
	 * \endif
	 */
	public byte					szVideoPath[] = new byte[256];

	/**
	 * \if ENGLISH_LANG
	 *  Is it a high frequency alarm
	 * \else
	 *  是否是高频次报警
	 * \endif
	 */
	public boolean					bIsHighFrequencyAlarm;

	/**
	 * \if ENGLISH_LANG
	 *  Frequency alarm name, It is valid only when the value of bIshighfrequencylalarm field is TRUE, indicating the name of high-frequency alarm
	 * \else
	 *  频次报警名称, 当bIsHighFrequencyAlarm字段值为TRUE时才有效，表示高频次报警名称
	 * \endif
	 */
	public byte					szFrequencyAlarmName[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 *  Time stamp(ms)
	 * \else
	 *  时间戳(单位是毫秒)
	 * \endif
	 */
	public double					PTS;

	/**
	 * \if ENGLISH_LANG
	 *  Event types that trigger facial capture
	 * \else
	 *  触发人脸抓拍的事件类型
	 * \endif
	 */
	public byte					szSubCode[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 *  RegionCode
	 * \else
	 *  区域编码
	 * \endif
	 */
	public int					nRegionCode;

	/**
	 * \if ENGLISH_LANG
	 *  Time of event occurrence (standard UTC time)
	 * \else
	 *  事件发生的时间(标准UTC时间)
	 * \endif
	 */
	public NET_TIME_EX					stuRealUTC = new NET_TIME_EX();

	public DEV_EVENT_FACERECOGNITION_INFO() {
    	for (int i = 0; i < FinalVar.SDK_MAX_CANDIDATE_NUM; i++) {
    		stuCandidates[i] = new CANDIDATE_INFO();
			stuCandidatesEx[i] = new CANDIDATE_INFOEX();
    	}
		for (int i = 0; i < 32; i ++) {
			stuImageInfo[i] = new NET_IMAGE_INFO_EX2();
		}
    }

}

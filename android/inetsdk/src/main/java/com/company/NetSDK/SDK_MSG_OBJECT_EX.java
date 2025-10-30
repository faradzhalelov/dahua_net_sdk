package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video analysis object info expansion structure 
 * \else
 * 视频分析物体信息扩展结构体
 * \endif
 */
public class SDK_MSG_OBJECT_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * object ID, each ID means a exclusive object
	 * \else
	 * 物体ID,每个ID表示一个唯一的物体
	 * \endif
	 */
	public int                 nObjectID;

	/**
	 * \if ENGLISH_LANG
	 * object  type
	 * \else
	 * 物体类型
	 * \endif
	 */
	public byte                szObjectType[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * confidence coefficient (0~255)， value the bigger means  confidence coefficient the higher
	 * \else
	 * 置信度(0~255)，值越大表示置信度越高
	 * \endif
	 */
	public int                 nConfidence;

	/**
	 * \if ENGLISH_LANG
	 * object  motion :1:Appear 2:Move 3:Stay 4:Remove 5:Disappear 6:Split 7:Merge 8:Rename
	 * \else
	 * 物体动作:1:Appear 2:Move 3:Stay 4:Remove 5:Disappear 6:Split 7:Merge 8:Rename
	 * \endif
	 */
	public int                 nAction;

	/**
	 * \if ENGLISH_LANG
	 * box
	 * \else
	 * 包围盒
	 * \endif
	 */
	public SDK_RECT             BoundingBox = new SDK_RECT();

	/**
	 * \if ENGLISH_LANG
	 * object model center
	 * \else
	 * 物体型心
	 * \endif
	 */
	public SDK_POINT            Center = new SDK_POINT();

	/**
	 * \if ENGLISH_LANG
	 * polygon vertex number
	 * \else
	 * 多边形顶点个数
	 * \endif
	 */
	public int                 nPolygonNum;

	/**
	 * \if ENGLISH_LANG
	 * relatively accurate outline the polygon
	 * \else
	 * 较精确的轮廓多边形
	 * \endif
	 */
	public SDK_POINT            Contour[] = new SDK_POINT[FinalVar.SDK_MAX_POLYGON_NUM];

	/**
	 * \if ENGLISH_LANG
	 * means plate, vehicle body and etc. object major color；by byte means ，are red, green, blue and transparency , such as:RGB value is (0,255,0), transparency is 0, its value is 0x00ff0000.
	 * \else
	 * 表示车牌、车身等物体主要颜色；按字节表示，分别为红、绿、蓝和透明度,例如:RGB值为(0,255,0),透明度为0时, 其值为0x00ff0000.
	 * \endif
	 */
	public int               rgbaMainColor;

	/**
	 * \if ENGLISH_LANG
	 * same as SDK_MSG_OBJECT corresponding field
	 * \else
	 * 同SDK_MSG_OBJECT相应字段
	 * \endif
	 */
	public byte                szText[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * object sub type ，according to different object  types ，may use the following sub type ：
	 * \else
	 * 物体子类别，根据不同的物体类型，可以取以下子类型：
	 * \endif
	 */
	public byte                szObjectSubType[] = new byte[64];

	/**
	 * \if ENGLISH_LANG
	 * object corresponding to picture file info or not
	 * \else
	 * 是否有物体对应图片文件信息
	 * \endif
	 */
	public boolean                bPicEnble;

	/**
	 * \if ENGLISH_LANG
	 * object corresponding to picture info
	 * \else
	 * 物体对应图片信息
	 * \endif
	 */
	public SDK_PIC_INFO         stPicInfo = new SDK_PIC_INFO();

	/**
	 * \if ENGLISH_LANG
	 * snapshot recognition result or not
	 * \else
	 * 是否是抓拍张的识别结果
	 * \endif
	 */
	public boolean                bShotFrame;

	/**
	 * \if ENGLISH_LANG
	 * object  color (rgbaMainColor) usable or not
	 * \else
	 * 物体颜色(rgbaMainColor)是否可用
	 * \endif
	 */
	public boolean                bColor;

	/**
	 * \if ENGLISH_LANG
	 * lower color (rgbaLowerBodyColor) usable or not
	 * \else
	 * 下半身颜色(rgbaLowerBodyColor)是否可用
	 * \endif
	 */
	public byte                bLowerBodyColor;

	/**
	 * \if ENGLISH_LANG
	 * time means type ， see  {@link EM_TIME_TYPE} note
	 * \else
	 * 时间表示类型，详见 {@link EM_TIME_TYPE}说明
	 * \endif
	 */
	public byte                byTimeType;

	/**
	 * \if ENGLISH_LANG
	 * for video compression， current time stamp（object snapshot or recognition， attach this recognition frame in one vire frame or jpegpicture，this frame’s appearance time in original video）
	 * \else
	 * 针对视频浓缩，当前时间戳（物体抓拍或识别时，会将此识别智能帧附在一个视频帧或jpeg图片中，此帧所在原始视频中的出现时间）
	 * \endif
	 */
	public NET_TIME_EX         stuCurrentTime = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * start time stamp（object start appearance）
	 * \else
	 * 开始时间戳（物体开始出现时）
	 * \endif
	 */
	public NET_TIME_EX         stuStartTime = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * end time stamp（object last aapearance）
	 * \else
	 * 结束时间戳（物体最后出现时）
	 * \endif
	 */
	public NET_TIME_EX         stuEndTime = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * box(absolute coordinate)
	 * \else
	 * 包围盒(绝对坐标)
	 * \endif
	 */
	public SDK_RECT             stuOriginalBoundingBox = new SDK_RECT();

	/**
	 * \if ENGLISH_LANG
	 * LGO coordinate box
	 * \else
	 * 车标坐标包围盒
	 * \endif
	 */
	public SDK_RECT             stuSignBoundingBox = new SDK_RECT();

	/**
	 * \if ENGLISH_LANG
	 * current frame no.（snapshot this object frame）
	 * \else
	 * 当前帧序号（抓下这个物体时的帧）
	 * \endif
	 */
	public int               dwCurrentSequence;

	/**
	 * \if ENGLISH_LANG
	 * start frame no.（object start appearance frame no.）
	 * \else
	 * 开始帧序号（物体开始出现时的帧序号）
	 * \endif
	 */
	public int               dwBeginSequence;

	/**
	 * \if ENGLISH_LANG
	 * end frame no.（object disappearance frame no.）
	 * \else
	 * 结束帧序号（物体消逝时的帧序号）
	 * \endif
	 */
	public int               dwEndSequence;

	/**
	 * \if ENGLISH_LANG
	 * start file shift, unit: byte（object start appearance，video in original video file moves toward file origin）
	 * \else
	 * 开始时文件偏移, 单位: 字节（物体开始出现时，视频帧在原始视频文件中相对于文件起始处的偏移）
	 * \endif
	 */
	public long               nBeginFileOffset;

	/**
	 * \if ENGLISH_LANG
	 * End file shift, unit: byte（object disappearance，video in original video file moves toward file origin）
	 * \else
	 * 结束时文件偏移, 单位: 字节（物体消逝时，视频帧在原始视频文件中相对于文件起始处的偏移）
	 * \endif
	 */
	public long               nEndFileOffset;

	/**
	 * \if ENGLISH_LANG
	 * object  color similarity，take  value range ：0-100，group subscript value represents certain color ， see {@link EM_COLOR_TYPE}
	 * \else
	 * 物体颜色相似度，取值范围：0-100，数组下标值代表某种颜色，详见{@link EM_COLOR_TYPE}
	 * \endif
	 */
	public byte                byColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];

	/**
	 * \if ENGLISH_LANG
	 * upper object  color  similarity (object  type as human is valid )
	 * \else
	 * 上半身物体颜色相似度(物体类型为人时有效)
	 * \endif
	 */
	public byte                byUpperBodyColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];

	/**
	 * \if ENGLISH_LANG
	 * lower object  color  similarity (object  type as human is valid )
	 * \else
	 * 下半身物体颜色相似度(物体类型为人时有效)
	 * \endif
	 */
	public byte                byLowerBodyColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];

	/**
	 * \if ENGLISH_LANG
	 * related object ID
	 * \else
	 * 相关物体ID
	 * \endif
	 */
	public int                 nRelativeID;

	/**
	 * \if ENGLISH_LANG
	 * "ObjectType"is "Vehicle"or "Logo"， means LOGO lower brand，such as Audi A6L，since there are many brands，SDK shows this field in real-time,device filled as real.
	 * \else
	 * "ObjectType"为"Vehicle"或者"Logo"时，表示车标下的某一车系，比如奥迪A6L，由于车系较多，SDK实现时透传此字段,设备如实填写。
	 * \endif
	 */
	public byte				szSubText[] = new byte[20];

	/**
	 * \if ENGLISH_LANG
	 * Intrusion staff height，unit cm
	 * \else
	 * 入侵人员身高，单位cm
	 * \endif
	 */
	public int					nPersonStature;

	/**
	 * \if ENGLISH_LANG
	 * Staff intrusion direction
	 * \else
	 * 人员入侵方向
	 * \endif
	 */
	public int					emPersonDirection;

	/**
	 * \if ENGLISH_LANG
	 * Use direction same as rgbaMainColor,object  type as human is valid
	 * \else
	 * 使用方法同rgbaMainColor,物体类型为人时有效
	 * \endif
	 */
	public int               rgbaLowerBodyColor;
	
	public SDK_MSG_OBJECT_EX() {
		for (int i = 0; i < FinalVar.SDK_MAX_POLYGON_NUM; i++) {
			this.Contour[i] = new SDK_POINT();
    	}
	}
}

package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief Video analysis object info extension structure, extension version 2.
 * \else
 * @brief 视频分析物体信息扩展结构体, 扩展版本2
 * \endif
 */
public class SDK_MSG_OBJECT_EX2 implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Object ID. Each ID presents one object.
     * \else
     * 物体ID,每个ID表示一个唯一的物体
     * \endif
     */
    public int nObjectID;

    /**
     * \if ENGLISH_LANG
     * Object type
     * \else
     * 物体类型
     * \endif
     */
    public byte szObjectType[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Confiidence(0-255). The higher the value is, the higher the confidence is.
     * \else
     * 置信度(0~255),值越大表示置信度越高
     * \endif
     */
    public int nConfidence;

    /**
     * \if ENGLISH_LANG
     * Object operation. 1:Appear 2:Move 3:Stay 4:Remove 5:Disappear 6:Split 7:Merge 8:Rename
     * \else
     * 物体动作:1:Appear 2:Move 3:Stay 4:Remove 5:Disappear 6:Split 7:Merge 8:Rename
     * \endif
     */
    public int nAction;

    /**
     * \if ENGLISH_LANG
     * Surrounding rectangle
     * \else
     * 包围盒
     * \endif
     */
    public SDK_RECT BoundingBox = new SDK_RECT();

    /**
     * \if ENGLISH_LANG
     * Object size centre
     * \else
     * 物体型心
     * \endif
     */
    public SDK_POINT Center = new SDK_POINT();

    /**
     * \if ENGLISH_LANG
     * Top amount of the polygon
     * \else
     * 多边形顶点个数
     * \endif
     */
    public int nPolygonNum;

    /**
     * \if ENGLISH_LANG
     * Polygon of generaly accurate frame
     * \else
     * 较精确的轮廓多边形
     * \endif
     */
    public SDK_POINT Contour[] = new SDK_POINT[FinalVar.SDK_MAX_POLYGON_NUM];

    /**
     * \if ENGLISH_LANG
     * The plate and the vehicle body main color. Use byte to present: red, green, blue and transparent. When RGB value is (0,255,0), transparent is 0, the value is 0x00ff0000.
     * \else
     * 表示车牌、车身等物体主要颜色；按字节表示,分别为红、绿、蓝和透明度,例如:RGB值为(0,255,0),透明度为0时, 其值为0x00ff0000.
     * \endif
     */
    public int rgbaMainColor;

    /**
     * \if ENGLISH_LANG
     * The same as the string of the SDK_MSG_OBJECT
     * \else
     * 同SDK_MSG_OBJECT相应字段
     * \endif
     */
    public byte szText[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Object sub-type. It has the following sub-tyes.
     * \else
     * 物体子类别,根据不同的物体类型,可以取以下子类型：
     * \endif
     */
    public byte szObjectSubType[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * There is image file info of the corresponding object
     * \else
     * 是否有物体对应图片文件信息
     * \endif
     */
    public boolean bPicEnble;

    /**
     * \if ENGLISH_LANG
     * Image info of the object
     * \else
     * 物体对应图片信息
     * \endif
     */
    public SDK_PIC_INFO stPicInfo = new SDK_PIC_INFO();

    /**
     * \if ENGLISH_LANG
     * Has been snapped or not
     * \else
     * 是否是抓拍张的识别结果
     * \endif
     */
    public boolean bShotFrame;

    /**
     * \if ENGLISH_LANG
     * Object color (rgbaMainColor) is usable or not.
     * \else
     * 物体颜色(rgbaMainColor)是否可用
     * \endif
     */
    public boolean bColor;

    /**
     * \if ENGLISH_LANG
     * The lower part color (rgbaLowerBodyColor) is usable or not
     * \else
     * 下半身颜色(rgbaLowerBodyColor)是否可用
     * \endif
     */
    public byte bLowerBodyColor;

    /**
     * \if ENGLISH_LANG
     * Time type. Please refer to EM_TIME_TYPE.
     * \else
     * 时间表示类型,详见EM_TIME_TYPE说明
     * \endif
     */
    public byte byTimeType;

    /**
     * \if ENGLISH_LANG
     * For video synopsis. Current time stampl (When snap or recognize the object, use the recognition intelligent frame on one video frame or JPEG.  It is the appearing time of the frame on the original video. )
     * \else
     * 针对视频浓缩,当前时间戳（物体抓拍或识别时,会将此识别智能帧附在一个视频帧或jpeg图片中,此帧所在原始视频中的出现时间）
     * \endif
     */
    public NET_TIME_EX stuCurrentTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Start time stamp(When the object first appear )
     * \else
     * 开始时间戳（物体开始出现时）
     * \endif
     */
    public NET_TIME_EX stuStartTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * End time (When the object last appear )
     * \else
     * 结束时间戳（物体最后出现时）
     * \endif
     */
    public NET_TIME_EX stuEndTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Surrounding box(Absolute coordinates)
     * \else
     * 包围盒(绝对坐标)
     * \endif
     */
    public SDK_RECT stuOriginalBoundingBox = new SDK_RECT();

    /**
     * \if ENGLISH_LANG
     * Vehicle symbol surrounding box
     * \else
     * 车标坐标包围盒
     * \endif
     */
    public SDK_RECT stuSignBoundingBox = new SDK_RECT();

    /**
     * \if ENGLISH_LANG
     * Current frame SN(Frame when snap the object )
     * \else
     * 当前帧序号（抓下这个物体时的帧）
     * \endif
     */
    public int dwCurrentSequence;

    /**
     * \if ENGLISH_LANG
     * Start frame SN (The frame SN when the object start appearing)
     * \else
     * 开始帧序号（物体开始出现时的帧序号）
     * \endif
     */
    public int dwBeginSequence;

    /**
     * \if ENGLISH_LANG
     * End frame SN (The frame SN when the object disappering)
     * \else
     * 结束帧序号（物体消逝时的帧序号）
     * \endif
     */
    public int dwEndSequence;

    /**
     * \if ENGLISH_LANG
     * The file offset when start. Unit:byte. (When the object appearing, the video frame offset value comparing with the file start positon in the original video)
     * \else
     * 开始时文件偏移, 单位: 字节（物体开始出现时,视频帧在原始视频文件中相对于文件起始处的偏移）
     * \endif
     */
    public int nBeginFileOffset;

    /**
     * \if ENGLISH_LANG
     * The file offset when stop. Unit: byte. (When the object disappearing, the video frame offset value comparing with the file start position in the original video)
     * \else
     * 结束时文件偏移, 单位: 字节（物体消逝时,视频帧在原始视频文件中相对于文件起始处的偏移）
     * \endif
     */
    public int nEndFileOffset;

    /**
     * \if ENGLISH_LANG
     * Object color similarity level. The valur ranges from 0 to 100. The underline value of the array represents one color. Plase refer to EM_COLOR_TYPE.
     * \else
     * 物体颜色相似度,取值范围：0-100,数组下标值代表某种颜色,详见EM_COLOR_TYPE
     * \endif
     */
    public byte byColorSimilar[] = new byte[FinalVar.NET_COLOR_TYPE_MAX];

    /**
     * \if ENGLISH_LANG
     * The top body color similarity leve; (When the object is the human)
     * \else
     * 上半身物体颜色相似度(物体类型为人时有效)
     * \endif
     */
    public byte byUpperBodyColorSimilar[] = new byte[FinalVar.NET_COLOR_TYPE_MAX];

    /**
     * \if ENGLISH_LANG
     * The lower body color similarity leve; (When the object is the human)
     * \else
     * 下半身物体颜色相似度(物体类型为人时有效)
     * \endif
     */
    public byte byLowerBodyColorSimilar[] = new byte[FinalVar.NET_COLOR_TYPE_MAX];

    /**
     * \if ENGLISH_LANG
     * Related object ID
     * \else
     * 相关物体ID
     * \endif
     */
    public int nRelativeID;

    /**
     * \if ENGLISH_LANG
     * When "ObjectType" is "Vehicle" or "Logo", it represents one car series under the card symbol such as Audio A6L. Since there are too many card series, SDK use the network to realize COM transmission (szSubText) to realize this function.
     * \else
     * "ObjectType"为"Vehicle"或者"Logo"时,表示车标下的某一车系,比如奥迪A6L,由于车系较多,SDK实现时透传此字段,设备如实填写。
     * \endif
     */
    public byte szSubText[] = new byte[20];

    /**
     * \if ENGLISH_LANG
     * Intrusion person height. Unit is cm.
     * \else
     * 入侵人员身高,单位cm
     * \endif
     */
    public int nPersonStature;

    /**
     * \if ENGLISH_LANG
     * Intrusion person direction,{@link EM_MSG_OBJ_PERSON_DIRECTION}
     * \else
     * 人员入侵方向,{@link EM_MSG_OBJ_PERSON_DIRECTION}
     * \endif
     */
    public int emPersonDirection;

    /**
     * \if ENGLISH_LANG
     * The same usage as the rgbaMainColor, it is valid when the object type is human.
     * \else
     * 使用方法同rgbaMainColor,物体类型为人时有效
     * \endif
     */
    public int rgbaLowerBodyColor;

    /**
     * \if ENGLISH_LANG
     * Synopsis speed threshold. There are ten levels (1 to 10). 5 means only reserve the object of speed higher than 5. It is a relative unit.
     * \else
     * 浓缩速度域值,共分1~10共十个档位,5表示浓缩后只保留5以上速度的物体。是个相对单位
     * \endif
     */
    public int nSynopsisSpeed;

    /**
     * \if ENGLISH_LANG
     * Synopsis dimension threshold. There are ten levels (1 to 10). 3 means only reserve the object of speed higher than 3. It is a relative unit.
     * \else
     * 浓缩尺寸域值,共分1~10共十个档位,3表示浓缩后只保留3以上大小的物体。是个相对单位
     * \endif
     */
    public int nSynopsisSize;

    /**
     * \if ENGLISH_LANG
     * When it is True, filter the object moving direction.
     * \else
     * 为True时,对物体运动方向做过滤
     * \endif
     */
    public boolean bEnableDirection;

    /**
     * \if ENGLISH_LANG
     * Synopsis moving direction, start coordinates. The point coordinates [0,8191], it is valid when bEnableDirection is True.
     * \else
     * 浓缩运动方向,起始坐标点,点的坐标归一化到[0,8191]区间,bEnableDirection为True时有效
     * \endif
     */
    public SDK_POINT stuSynopsisStartLocation = new SDK_POINT();

    /**
     * \if ENGLISH_LANG
     * Synopsis moving direction, stop coordinates. The point coordinates [0,8191], it is valid when bEnableDirection is True.
     * \else
     * 浓缩运动方向,终止坐标点,点的坐标归一化到[0,8191]区间,bEnableDirection为True时有效
     * \endif
     */
    public SDK_POINT stuSynopsisEndLocation = new SDK_POINT();

}

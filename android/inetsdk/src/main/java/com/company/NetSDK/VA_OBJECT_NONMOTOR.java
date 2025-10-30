package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Nonmotor
 * \else
 * 非机动车对象
 * \endif
 */
public class VA_OBJECT_NONMOTOR implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Object id
     * \else
     * 物体ID,每个ID表示一个唯一的物体
     * \endif
     */
    public int							nObjectID;

    /**
     * \if ENGLISH_LANG
     * Non-motor type,{@link EM_CATEGORY_NONMOTOR_TYPE}
     * \else
     * 非机动车子类型,{@link EM_CATEGORY_NONMOTOR_TYPE}
     * \endif
     */
    public int	emCategory;

    /**
     * \if ENGLISH_LANG
     * BoundingBox Rect, 0~8192
     * \else
     * 包围盒， 非机动车矩形框，0~8191相对坐标
     * \endif
     */
    public SDK_RECT						stuBoundingBox = new SDK_RECT();

    /**
     * \if ENGLISH_LANG
     * BoundingBox Rect, absolute coordinates
     * \else
     * 包围盒， 非机动车矩形框，绝对坐标
     * \endif
     */
    public SDK_RECT						stuOriginalBoundingBox = new SDK_RECT();

    /**
     * \if ENGLISH_LANG
     * Non-motor color (RGBA value)
     * \else
     * 非机动车颜色, RGBA
     * \endif
     */
    public NET_COLOR_RGBA				stuMainColor = new NET_COLOR_RGBA();

    /**
     * \if ENGLISH_LANG
     * Non-motor color enumeration,{@link EM_OBJECT_COLOR_TYPE}
     * \else
     * 非机动车颜色, 枚举,{@link EM_OBJECT_COLOR_TYPE}
     * \endif
     */
    public int		emColor;

    /**
     * \if ENGLISH_LANG
     * Has image?
     * \else
     * 是否有抠图
     * \endif
     */
    public boolean						bHasImage;

    /**
     * \if ENGLISH_LANG
     * Image information
     * \else
     * 物体截图
     * \endif
     */
    public NET_NONMOTOR_PIC_INFO		stuImage = new NET_NONMOTOR_PIC_INFO();

    /**
     * \if ENGLISH_LANG
     * The number of rider
     * \else
     * 骑车人数量
     * \endif
     */
    public int							nNumOfCycling;

    /**
     * \if ENGLISH_LANG
     * The information of rider
     * \else
     * 骑车人特征,个数和nNumOfCycling关联
     * \endif
     */
    public NET_RIDER_INFO				stuRiderList[] = new NET_RIDER_INFO[FinalVar.MAX_RIDER_NUM];

    /**
     * \if ENGLISH_LANG
     * SceneImage
     * \else
     * 全景广角图
     * \endif
     */
    public SCENE_IMAGE_INFO			stuSceneImage = new SCENE_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     * Target SceneImage
     * \else
     * 目标全景广角图
     * \endif
     */
    public FACE_SCENE_IMAGE			stuFaceSceneImage = new FACE_SCENE_IMAGE();

    /**
     * \if ENGLISH_LANG
     * The number of face
     * \else
     * 检测到的目标数量
     * \endif
     */
    public int							nNumOfFace;

    /**
     * \if ENGLISH_LANG
     * Object speed, Unit:km/h
     * \else
     * 物体速度，单位为km/h
     * \endif
     */
    public float						fSpeed;

    /**
     * \if ENGLISH_LANG
     * Position info of non-motor feature data in binary data
     * \else
     * 非机动车特征值数据在二进制数据中的位置信息
     * \endif
     */
    public NET_NONMOTOR_FEATURE_VECTOR_INFO stuNonMotorFeatureVectorInfo = new NET_NONMOTOR_FEATURE_VECTOR_INFO();

    /**
     * \if ENGLISH_LANG
     * Non-motor feature data version,{@link EM_FEATURE_VERSION}
     * \else
     * 非机动车特征值版本号,{@link EM_FEATURE_VERSION}
     * \endif
     */
    public int          emNonMotorFeatureVersion;

    /**
     * \if ENGLISH_LANG
     * Plate info of nomotor
     * \else
     * 非机动车牌信息
     * \endif
     */
    public NET_NONMOTOR_PLATE_INFO     stuNomotorPlateInfo = new NET_NONMOTOR_PLATE_INFO();

    /**
     * \if ENGLISH_LANG
     * Center of object(not center of bounding box), 0-8191 relative coordinates, relative to large graph
     * \else
     * 物体型心(不是包围盒中心), 0-8191相对坐标, 相对于大图
     * \endif
     */
    public SDK_POINT                   stuObjCenter = new SDK_POINT();

    /**
     * \if ENGLISH_LANG
     * Location information of face characteristic value data in binary data
     * \else
     * 目标特征值数据在二进制数据中的位置信息
     * \endif
     */
    public NET_FACE_FEATURE_VECTOR_INFO    stuFaceFeatureVectorInfo = new NET_FACE_FEATURE_VECTOR_INFO();

    /**
     * \if ENGLISH_LANG
     * face feature version,{@link EM_FEATURE_VERSION}
     * \else
     * 目标特征值版本号,{@link EM_FEATURE_VERSION}
     * \endif
     */
    public int              emFaceFeatureVersion;

    /**
     * \if ENGLISH_LANG
     * Non motor vehicle type confidence
     * \else
     * 非机动车类型置信度
     * \endif
     */
    public int nCategoryConf;

    /**
     * \if ENGLISH_LANG
     * Non-motor feature data version-string
     * \else
     * 非机动车特征值版本号-字符串
     * \endif
     */
    public byte szNonMotorFeatureVersion[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Non Motor vehicle angle,{@link EM_OBJECT_NONMOTORANGLE_TYPE}
     * \else
     * 非机动车的角度,{@link EM_OBJECT_NONMOTORANGLE_TYPE}
     * \endif
     */
    public int emNonMotorAngle;

    /**
     * \if ENGLISH_LANG
     * Non Motor vehicle basket,{@link EM_OBJECT_BASKET_TYPE}
     * \else
     * 非机动车车篮,{@link EM_OBJECT_BASKET_TYPE}
     * \endif
     */
    public int emBasket;

    /**
     * \if ENGLISH_LANG
     * Non Motor vehicle StorageBox,{@link EM_OBJECT_STORAGEBOX_TYPE}
     * \else
     * 非机动车后备箱,{@link EM_OBJECT_STORAGEBOX_TYPE}
     * \endif
     */
    public int emStorageBox;

    /**
     * \if ENGLISH_LANG
     * Non motor vehicle integrity score, range [0,100]
     * \else
     * 非机动车完整度评分，范围[0,100]，越大越完整
     * \endif
     */
    public int nCompleteScore;

    /**
     * \if ENGLISH_LANG
     * The value range of non motor vehicle definition score is [1,100]
     * \else
     * 非机动车清晰度分值 取值范围为[1,100], 越大越清晰, 0为无效值
     * \endif
     */
    public int nClarityScore;

    /**
     * \if ENGLISH_LANG
     * The frame number of the target start
     * \else
     * 目标出现的帧号
     * \endif
     */
    public int nStartSequence;

    /**
     * \if ENGLISH_LANG
     * The frame number of the target end
     * \else
     * 目标消失的帧号
     * \endif
     */
    public int nEndSequence;

    /**
     * \if ENGLISH_LANG
     * Whether the whole non motor vehicle body and rider are falsely inspected, 0: No, 1: Yes
     * \else
     * 非机动车车身及骑手整体，是否虚检，0: 否，1: 是
     * \endif
     */
    public boolean bIsErrorDetect;

    /**
     * \if ENGLISH_LANG
     * Image imaging light source type,0:unknown, 1:visible imaging, 2:near infrared imaging(gray image), 3:thermal infrared imaging (pseudo color)
     * \else
     * 图像成像光源类型, 0:未知, 1:可见光成像, 2:近红外成像(灰度图), 3:热红外成像(伪彩色)
     * \endif
     */
    public int nImageLightType;

    /**
     * \if ENGLISH_LANG
     * Non motor vehicle comprehensive quality score, range [0,100], the larger the score, the better the quality
     * \else
     * 非机动车综合质量评分，范围[0,100]，越大质量越好
     * \endif
     */
    public int nAbsScore;

    /**
     * \if ENGLISH_LANG
     * Canopy (umbrella) type,{@link EM_RAIN_SHED_TYPE}
     * \else
     * 雨棚（伞）类型,{@link EM_RAIN_SHED_TYPE}
     * \endif
     */
    public int emRainShedType;

    /**
     * \if ENGLISH_LANG
     * Intelligent object global unique object identification
     * \else
     * 智能物体全局唯一物体标识
     * \endif
     */
    public byte szSerialUUID[] = new byte[22];

    public VA_OBJECT_NONMOTOR(){
        for(int i = 0; i< FinalVar.MAX_RIDER_NUM; i++){
            stuRiderList[i] = new NET_RIDER_INFO();
        }
    }

}

package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Target attributes info
 * \else
 * @brief 属性信息
 * \endif
 */
public class NET_FACE_ATTRIBUTE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Sex
     * \else
     *  性别
     * \endif
     */
    public int					emSex;

    /**
     * \if ENGLISH_LANG
     *  Age,-1 means invaild value
     * \else
     *  年龄,-1表示该字段数据无效
     * \endif
     */
    public int					nAge;

    /**
     * \if ENGLISH_LANG
     *  Feature valid num,used in combination with emFeature
     * \else
     *  目标特征数组有效个数,与 emFeature 结合使用
     * \endif
     */
    public int					nFeatureValidNum;

    /**
     * \if ENGLISH_LANG
     *  Feature,used in combination with nFeatureValidNum
     * \else
     *  目标特征数组,与 nFeatureValidNum 结合使用
     * \endif
     */
    public int[]					emFeatures = new int[FinalVar.SDK_MAX_FACEDETECT_FEATURE_NUM];

    /**
     * \if ENGLISH_LANG
     *  Eye state
     * \else
     *  眼睛状态
     * \endif
     */
    public int					emEye;

    /**
     * \if ENGLISH_LANG
     *  Mouth state
     * \else
     *  嘴巴状态
     * \endif
     */
    public int					emMouth;

    /**
     * \if ENGLISH_LANG
     *  Mask state
     * \else
     *  口罩状态
     * \endif
     */
    public int					emMask;

    /**
     * \if ENGLISH_LANG
     *  Beard state
     * \else
     *  胡子状态
     * \endif
     */
    public int					emBeard;

    /**
     * \if ENGLISH_LANG
     *  Attractive, 0 means undistingush,range:1-100
     * \else
     *  魅力值, 0未识别，识别时范围1-100,得分高魅力高
     * \endif
     */
    public int					nAttractive;

    /**
     * \if ENGLISH_LANG
     *  Bounding box(8192 coordinates)
     * \else
     *  包围盒(8192坐标系)
     * \endif
     */
    public NET_RECT					stuBoundingBox = new NET_RECT();

    /**
     * \if ENGLISH_LANG
     *  euler angle of Target in the capture picture, nPitch:pitch of the head, nYaw: yaw of the head, nRoll:roll of the head
     * \else
     *  目标在抓拍图片中的角度信息, nPitch:抬头低头的俯仰角, nYaw左右转头的偏航角, nRoll头在平面内左偏右偏的翻滚角
     * \endif
     */
    public NET_EULER_ANGLE					stuFaceCaptureAngle = new NET_EULER_ANGLE();

    /**
     * \if ENGLISH_LANG
     *  The quality of Target picture.The range is 0~10000 
     * \else
     *  目标抓拍质量分数,范围 0~10000 
     * \endif
     */
    public int					nFaceQuality;

    /**
     * \if ENGLISH_LANG
     *  The score of Target picture align.The range is 0~10000,-1 is invalid
     * \else
     *  目标对齐得分分数,范围 0~10000,-1为无效值
     * \endif
     */
    public int					nFaceAlignScore;

    /**
     * \if ENGLISH_LANG
     *  The score of Target picture clarity.The range is 0~10000,-1 is invalid
     * \else
     *  目标清晰度分数,范围 0~10000,-1为无效值
     * \endif
     */
    public int					nFaceClarity;

    /**
     * \if ENGLISH_LANG
     *  Center of Target(not center of bounding box), 0-8191 relative coordinates, relative to large graph
     * \else
     *  目标型心(不是包围盒中心), 0-8191相对坐标, 相对于大图
     * \endif
     */
    public NET_POINT					stuFaceCenter = new NET_POINT();

    /**
     * \if ENGLISH_LANG
     *  Glass type
     * \else
     *  是否戴眼镜
     * \endif
     */
    public int					emGlass;

    /**
     * \if ENGLISH_LANG
     *  degree of confidence about Target, range is [0,100]
     * \else
     *  目标检测置信度，取值0~100
     * \endif
     */
    public int					nFaceDetectConf;

    /**
     * \if ENGLISH_LANG
     *  Actual Target image size during algorithm Target analysis. 
     * \else
     *  算法目标分析时的实际目标图片尺寸, 宽高为0时无效
     * \endif
     */
    public NET_FACE_ORIGINAL_SIZE					stuOriginalSize = new NET_FACE_ORIGINAL_SIZE();

    /**
     * \if ENGLISH_LANG
     *  Target capture angle status
     * \else
     *  目标抓拍角度(Angle)状态
     * \endif
     */
    public int					arrAngleStatus[] = new int[3];

    /**
     * \if ENGLISH_LANG
     *  Target illumination value, range[0,255]
     * \else
     *  目标光照值,范围[0,255]
     * \endif
     */
    public int					nIlluminationScore;

    /**
     * \if ENGLISH_LANG
     *  Left eye occlusion confidence, range[0,100]
     * \else
     *  目标左眼遮挡置信度,范围[0,100]
     * \endif
     */
    public byte					nLeftEyeCoverConf;

    /**
     * \if ENGLISH_LANG
     *  Left cheek occlusion confidence, range[0,100]
     * \else
     *  目标左脸颊遮挡置信度,范围[0,100]
     * \endif
     */
    public byte					nLeftCheekCoverConf;

    /**
     * \if ENGLISH_LANG
     *  Confidence range of Target occlusion [0,100]
     * \else
     *  目标嘴巴遮挡置信度,范围[0,100]
     * \endif
     */
    public byte					nMouthCoverConf;

    /**
     * \if ENGLISH_LANG
     *  Confidence range of Target right eye occlusion[0,100]
     * \else
     *  目标右眼遮挡置信度,范围[0,100]
     * \endif
     */
    public byte					nRightEyeCoverConf;

    /**
     * \if ENGLISH_LANG
     *  Confidence range of Target right cheek occlusion[0,100]
     * \else
     *  目标右脸颊遮挡置信度,范围[0,100]
     * \endif
     */
    public byte					nRightCheekCoverConf;

    /**
     * \if ENGLISH_LANG
     *  Confidence range of facial chin occlusion[0,100]
     * \else
     *  目标下巴遮挡置信度,范围[0,100]
     * \endif
     */
    public byte					nChinCoverConf;

    /**
     * \if ENGLISH_LANG
     *  Target integrity evaluation Target, 0:incomplete, 1:complete
     * \else
     *  目标完整度评价 目标完整度评价，取值0和1 0为不完整（轮廓超出图像边界） 1为完整
     * \endif
     */
    public byte					nIsCompleteFace;

    /**
     * \if ENGLISH_LANG
     *  Saturation score range of Target image [0,100]
     * \else
     *  目标图片饱和度评分,范围[0,100]
     * \endif
     */
    public byte					nSaturationScore;

    /**
     * \if ENGLISH_LANG
     *  Confidence range of Target and forehead occlusion[0,100]
     * \else
     *  目标额头遮挡置信度,范围[0,100]
     * \endif
     */
    public byte					nBrowCoverConf;

    /**
     * \if ENGLISH_LANG
     *  Confidence range of Target nose occlusion [0,100]
     * \else
     *  目标鼻子遮挡置信度,范围[0,100]
     * \endif
     */
    public byte					nNoseCoverConf;

    /**
     * \if ENGLISH_LANG
     *  Age Segmentation
     * \else
     *  年龄段
     * \endif
     */
    public int					emAgeSeg;

}
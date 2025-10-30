package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * Scene capacity
 * \else
 * 场景能力
 * \endif
 */
public class CFG_CAP_SCENE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Scene Name
     * \else
     * 场景名称
     * \endif
     */
    public byte               szSceneName[] = new byte[FinalVar.MAX_PATH];

    /**
     * \if ENGLISH_LANG
     * Number of detection object type supported by the current rule type
     * \else
     * 当前规则类型支持的检测物体类型个数
     * \endif
     */
    public int                nSupportedObjectTypeNum;

    /**
     * \if ENGLISH_LANG
     * List of detection object type supported by the current rule type
     * \else
     * 当前规则类型支持的检测物体类型列表
     * \endif
     */
    public byte[][]           szObjectTypeName = new byte[FinalVar.MAX_OBJECT_LIST_SIZE][FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Supported rule number
     * \else
     * 支持的规则个数
     * \endif
     */
    public int                nSupportRules;

    /**
     * \if ENGLISH_LANG
     * Supported rule list
     * \else
     * 支持的规则列表
     * \endif
     */
    public SCENE_SUPPORT_RULE[] stSpportRules = new SCENE_SUPPORT_RULE[FinalVar.MAX_RULE_LIST_SIZE];

    ///////////////////////// 支持的模块参数 ////////////////////////////////////////////////////////////
    /**
     * \if ENGLISH_LANG
     * Support disturbance sensitivity  set up or not
     * \else
     * 是否支持扰动强度设置
     * \endif
     */
    public boolean               bDisturbance;

    /**
     * \if ENGLISH_LANG
     * Support anti-disturbance or not
     * \else
     * 是否支持去扰动处理
     * \endif
     */
    public boolean               bAntiDisturbance;

    /**
     * \if ENGLISH_LANG
     * Support backlight or not
     * \else
     * 是否支持逆光处理
     * \endif
     */
    public boolean               bBacklight;

    /**
     * \if ENGLISH_LANG
     * Support shadow or not
     * \else
     * 是否支持阴影处理
     * \endif
     */
    public boolean               bShadow;

    /**
     * \if ENGLISH_LANG
     * Support test accuracy
     * \else
     * 是否支持检测精度
     * \endif
     */
    public boolean               bAccuracy;

    /**
     * \if ENGLISH_LANG
     * Support step detection  or not
     * \else
     * 是否支持检测步长
     * \endif
     */
    public boolean               bMovingStep;

    /**
     * \if ENGLISH_LANG
     * Support zoom detect or not
     * \else
     * 是否支持检测缩放
     * \endif
     */
    public boolean               bScalingFactor;

    /**
     * \if ENGLISH_LANG
     * Support threshold Y or not
     * \else
     * 是否支持Y分量判定阈值
     * \endif
     */
    public boolean               bThresholdY;

    /**
     * \if ENGLISH_LANG
     * Support threshold UV or not
     * \else
     * 是否支持UV分量判定阈值
     * \endif
     */
    public boolean               bThresholdUV;

    /**
     * \if ENGLISH_LANG
     * Support edge detection to confirm threshold or not
     * \else
     * 是否支持边缘检测判定阈值
     * \endif
     */
    public boolean               bThresholdEdge;

    /**
     * \if ENGLISH_LANG
     * Support detecting balance or not
     * \else
     * 是否支持检测平衡
     * \endif
     */
    public boolean               bDetectBalance;

    /**
     * \if ENGLISH_LANG
     * Support algorithm SN or not
     * \else
     * 是否支持算法序号
     * \endif
     */
    public boolean               bAlgorithmIndex;

    /**
     * \if ENGLISH_LANG
     * Support high light process ( the  background parameter)
     * \else
     * 是否支持高光处理，即Backgroud参数
     * \endif
     */
    public boolean               bHighlight;

    /**
     * \if ENGLISH_LANG
     * Support object snapshot or not
     * \else
     * 是否支持物体抓图
     * \endif
     */
    public boolean               bSnapshot;

    /**
     * \if ENGLISH_LANG
     * Support detection region configuration or not
     * \else
     * 是否支持检测区域配置
     * \endif
     */
    public boolean               bDetectRegion;

    /**
     * \if ENGLISH_LANG
     * Support exclusion region configuration or not
     * \else
     * 是否支持排除区域配置
     * \endif
     */
    public boolean               bExcludeRegion;

    /**
     * \if ENGLISH_LANG
     * upport contour assistant track or not
     * \else
     * 是否支持轮廓辅助跟踪
     * \endif
     */
    public boolean               bContourAssistantTrack;

    ////////////////////////////////// 支持的场景参数 //////////////////////////////////////////////
    /**
     * \if ENGLISH_LANG
     * Support camera parameter or not
     * \else
     * 是否摄像头位置参数
     * \endif
     */
    public boolean               bCameraAspect;

    /**
     * \if ENGLISH_LANG
     * Support jitter parameter or not
     * \else
     * 是否支持抖动参数
     * \endif
     */
    public boolean               bJitter;

    /**
     * \if ENGLISH_LANG
     * Support dejitter parameter or not
     * \else
     * 是否支持去抖动处理参数
     * \endif
     */
    public boolean               bDejitter;

    /////////////////////////////////// 支持的标定能力集 ///////////////////////////////////////////
    /**
     * \if ENGLISH_LANG
     * Max calibration area number
     * \else
     * 最大标定区域个数
     * \endif
     */
    public int               nMaxCalibrateAreaNum;

    /**
     * \if ENGLISH_LANG
     * Calibration area capacity info number
     * \else
     * 标定区域能力信息个数
     * \endif
     */
    public int               nCalibrateAreaNum;

    /**
     * \if ENGLISH_LANG
     * Calibration area capacity info
     * \else
     * 标定区域能力信息
     * \endif
     */
    public CFG_CAP_CELIBRATE_AREA[] stCalibrateAreaCap = new CFG_CAP_CELIBRATE_AREA[FinalVar.MAX_CALIBRATEAREA_TYPE_NUM];

    /////////////////////////////////// 尺寸过滤器计量方式 /////////////////////////////////////////
    /**
     * \if ENGLISH_LANG
     * Support pixel measurement method or not
     * \else
     * 是否支持像素计量方式
     * \endif
     */
    public boolean              bPixel;

    /**
     * \if ENGLISH_LANG
     * Support real length measurement method or not
     * \else
     * 是否支持实际长度计量方式
     * \endif
     */
    public boolean              bMetric;

    /**
     * \if ENGLISH_LANG
     * Support measurement method with far and near-end calibration or not
     * \else
     * 是否支持远端近端标定后的像素计量方式
     * \endif
     */
    public boolean              bCalibratedPixel;

    /**
     * \if ENGLISH_LANG
     * Sub- Scene Types Supported by the Current Scene
     * \else
     * 当前场景下支持的子场景类型
     * \endif
     */
    public byte[][]              szSubType = new byte[FinalVar.MAX_SCENE_SUBTYPE_NUM][FinalVar.MAX_SCENE_SUBTYPE_LEN];

    /**
     * \if ENGLISH_LANG
     * Sub- Scene Types Number
     * \else
     * 子场景类型个数
     * \endif
     */
    public int               nSubTypeNum;

    /**
     * \if ENGLISH_LANG
     * Max rules supported by each class
     * \else
     * 每个大类支持的最大规则条数
     * \endif
     */
    public int				  nMaxRules;

    /**
     * \if ENGLISH_LANG
     * Support reconstruction background or not, default not support (false)
     * \else
     * 是否支持重建背景，默认不支持(false)
     * \endif
     */
    public boolean			  bSupportedSetModule;

    public CFG_CAP_SCENE() {
        for(int i = 0; i < FinalVar.MAX_RULE_LIST_SIZE; i++) {
            stSpportRules[i] = new SCENE_SUPPORT_RULE();
        }

        for(int i = 0; i < FinalVar.MAX_CALIBRATEAREA_TYPE_NUM; i++) {
            stCalibrateAreaCap[i] = new CFG_CAP_CELIBRATE_AREA();
        }
    }

    @Override
    public String toString() {
        return "CFG_CAP_SCENE{" +
                "szSceneName=" + Arrays.toString(szSceneName) +
                ", nSupportedObjectTypeNum=" + nSupportedObjectTypeNum +
                ", szObjectTypeName=" + Arrays.toString(szObjectTypeName) +
                ", nSupportRules=" + nSupportRules +
                ", stSpportRules=" + Arrays.toString(stSpportRules) +
                ", bDisturbance=" + bDisturbance +
                ", bAntiDisturbance=" + bAntiDisturbance +
                ", bBacklight=" + bBacklight +
                ", bShadow=" + bShadow +
                ", bAccuracy=" + bAccuracy +
                ", bMovingStep=" + bMovingStep +
                ", bScalingFactor=" + bScalingFactor +
                ", bThresholdY=" + bThresholdY +
                ", bThresholdUV=" + bThresholdUV +
                ", bThresholdEdge=" + bThresholdEdge +
                ", bDetectBalance=" + bDetectBalance +
                ", bAlgorithmIndex=" + bAlgorithmIndex +
                ", bHighlight=" + bHighlight +
                ", bSnapshot=" + bSnapshot +
                ", bDetectRegion=" + bDetectRegion +
                ", bExcludeRegion=" + bExcludeRegion +
                ", bContourAssistantTrack=" + bContourAssistantTrack +
                ", bCameraAspect=" + bCameraAspect +
                ", bJitter=" + bJitter +
                ", bDejitter=" + bDejitter +
                ", nMaxCalibrateAreaNum=" + nMaxCalibrateAreaNum +
                ", nCalibrateAreaNum=" + nCalibrateAreaNum +
                ", stCalibrateAreaCap=" + Arrays.toString(stCalibrateAreaCap) +
                ", bPixel=" + bPixel +
                ", bMetric=" + bMetric +
                ", bCalibratedPixel=" + bCalibratedPixel +
                ", szSubType=" + Arrays.toString(szSubType) +
                ", nSubTypeNum=" + nSubTypeNum +
                ", nMaxRules=" + nMaxRules +
                ", bSupportedSetModule=" + bSupportedSetModule +
                '}';
    }
}

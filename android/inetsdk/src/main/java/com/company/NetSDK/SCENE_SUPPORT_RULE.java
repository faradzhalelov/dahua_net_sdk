package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * Scene  rule supported
 * \else
 * 场景支持的规则
 * \endif
 */
public class SCENE_SUPPORT_RULE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Rule Type
     * \else
     * 规则类型
     * \endif
     */
    public int             	     dwSupportedRule;

    /**
     * \if ENGLISH_LANG
     * Supported object type number
     * \else
     * 支持的检测物体类型个数
     * \endif
     */
    public int               	    nSupportedObjectTypeNum;

    /**
     * \if ENGLISH_LANG
     * Supported object type list
     * \else
     * 支持的检测物体类型列表
     * \endif
     */
    public byte[][]              	szObjectTypeName = new byte[FinalVar.MAX_OBJECT_LIST_SIZE][FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Supported detection object action number
     * \else
     * 支持的检测物体动作个数
     * \endif
     */
    public int               	     nSupportedActionsNum;

    /**
     * \if ENGLISH_LANG
     * Supported detection object action list
     * \else
     * 支持的检测物体动作列表
     * \endif
     */
    public byte[][]              	 szSupportedActions = new byte[FinalVar.MAX_ACTION_LIST_SIZE][FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Supported detection type number
     * \else
     * 支持的检测类型个数
     * \endif
     */
    public int               	    nSupportedDetectTypeNum;

    /**
     * \if ENGLISH_LANG
     * Supported detection type list
     * \else
     * 支持的检测类型列表
     * \endif
     */
    public byte[][]              	szSupportedDetectTypes = new byte[FinalVar.MAX_ACTION_LIST_SIZE][FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Supported facial recognition type number
     * \else
     * 支持的目标检测类型个数
     * \endif
     */
    public int               	    nSupportFaceTypeNum;

    /**
     * \if ENGLISH_LANG
     * Supported facial recognition type list
     * \else
     * 支持的目标检测类型列表
     * \endif
     */
    public byte[][]              	szSupportFaceTypes = new byte[FinalVar.MAX_HUMANFACE_LIST_SIZE][FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Support trigger alarm position or not
     * \else
     * 是否支持触发报警位置
     * \endif
     */
    public boolean              	bTriggerPosition;

    /**
     * \if ENGLISH_LANG
     * Support trigger track or not
     * \else
     * 是否支持触发跟踪
     * \endif
     */
    public boolean			  	   bTriggerTrack;

    /**
     * \if ENGLISH_LANG
     * Supported setting face feature recognition enable or not
     * \else
     * 是否允许配置开启目标属性识别
     * \endif
     */
    public boolean			  	  bFaceDetection;

    /**
     * \if ENGLISH_LANG
     * Supported face feature type number
     * \else
     * 支持的目标属性类型个数
     * \endif
     */
    public int				  	  nSupportFeactureNum;

    /**
     * \if ENGLISH_LANG
     * Supported face feature type list, refer to {@link EM_FACEFEATURE_TYPE}
     * \else
     * 支持的目标属性类型列表, 参考 {@link EM_FACEFEATURE_TYPE}
     * \endif
     */
    public int[]	              emFeatureList = new int[FinalVar.MAX_FEATURE_LIST_SIZE];

    @Override
    public String toString() {
        return "SCENE_SUPPORT_RULE{" +
                "dwSupportedRule=" + dwSupportedRule +
                ", nSupportedObjectTypeNum=" + nSupportedObjectTypeNum +
                ", szObjectTypeName=" + Arrays.toString(szObjectTypeName) +
                ", nSupportedActionsNum=" + nSupportedActionsNum +
                ", szSupportedActions=" + Arrays.toString(szSupportedActions) +
                ", nSupportedDetectTypeNum=" + nSupportedDetectTypeNum +
                ", szSupportedDetectTypes=" + Arrays.toString(szSupportedDetectTypes) +
                ", nSupportFaceTypeNum=" + nSupportFaceTypeNum +
                ", szSupportFaceTypes=" + Arrays.toString(szSupportFaceTypes) +
                ", bTriggerPosition=" + bTriggerPosition +
                ", bTriggerTrack=" + bTriggerTrack +
                ", bFaceDetection=" + bFaceDetection +
                ", nSupportFeactureNum=" + nSupportFeactureNum +
                ", emFeatureList=" + Arrays.toString(emFeatureList) +
                '}';
    }
}

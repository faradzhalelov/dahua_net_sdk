package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Scene types under animal detection rules
 * \else
 * @brief 动物检测规则下的场景类型
 * \endif
 */
public class EM_DETECTION_SCENE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_DETECTION_SCENE_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Animal scene, which can detect animals, people and vehicles
     * \else
     *  兽类场景，可检测动物、人、车
     * \endif
     */
    public static final int					EM_DETECTION_SCENE_TYPE_ANIMAL = 1;

    /**
     * \if ENGLISH_LANG
     *  Bird scene, which can detect birds, people and vehicles
     * \else
     *  鸟类场景，可检测鸟类，人、车
     * \endif
     */
    public static final int					EM_DETECTION_SCENE_TYPE_BIRD = 2;

    /**
     * \if ENGLISH_LANG
     *  Pig scene, can detect pigs
     * \else
     *  猪类场景，可检测猪只
     * \endif
     */
    public static final int					EM_DETECTION_SCENE_TYPE_PIG = 3;

}
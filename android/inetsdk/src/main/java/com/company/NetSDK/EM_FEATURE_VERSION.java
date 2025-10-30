package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The type of feature version
 * \else
 * 特征值版本类型
 * \endif
 */
public class EM_FEATURE_VERSION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * unknwon
     * \else
     * 未知
     * \endif
     */
    public static final int EM_FEATURE_VERSION_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Face，large model，1.01.001
     * \else
     * 目标，大模型，1.01.001
     * \endif
     */
    public static final int EM_FEATURE_VERSION_FACE_LARGE_1_01_001 = 1;

    /**
     * \if ENGLISH_LANG
     * Face，large model，1.02.001
     * \else
     * 目标，大模型，1.02.001
     * \endif
     */
    public static final int EM_FEATURE_VERSION_FACE_LARGE_1_02_001 = 2;

    /**
     * \if ENGLISH_LANG
     * Face，large model，1.03.001
     * \else
     * 目标，大模型，1.03.001
     * \endif
     */
    public static final int EM_FEATURE_VERSION_FACE_LARGE_1_03_001 = 3;

    /**
     * \if ENGLISH_LANG
     * Face，large model，1.04.001
     * \else
     * 目标，大模型，1.04.001
     * \endif
     */
    public static final int EM_FEATURE_VERSION_FACE_LARGE_1_04_001 = 4;

    /**
     * \if ENGLISH_LANG
     *  Face，middle model，1.01.002
     * \else
     * 目标，中模型，1.01.002
     * \endif
     */
    public static final int EM_FEATURE_VERSION_FACE_MIDDLE_1_01_002 = 31;

    /**
     * \if ENGLISH_LANG
     * Face，middle model，1.02.002
     * \else
     * 目标，中模型，1.02.002
     * \endif
     */
    public static final int EM_FEATURE_VERSION_FACE_MIDDLE_1_02_002 = 32;

    /**
     * \if ENGLISH_LANG
     * Face，middle model，1.03.002
     * \else
     * 目标，中模型，1.03.002
     * \endif
     */
    public static final int EM_FEATURE_VERSION_FACE_MIDDLE_1_03_002 = 33;

    /**
     * \if ENGLISH_LANG
     * Face，middle model，1.04.002
     * \else
     * 目标，中模型，1.04.002
     * \endif
     */
    public static final int EM_FEATURE_VERSION_FACE_MIDDLE_1_04_002 = 34;

    /**
     * \if ENGLISH_LANG
     * Face，middle model, 1.09.002
     * \else
     * 目标，中模型，1.09.002
     * \endif
     */
    public static final int EM_FEATURE_VERSION_FACE_MIDDLE_1_09_002 = 39;

    /**
     * \if ENGLISH_LANG
     *  Face，small model，1.01.003
     * \else
     * 目标，小模型，1.01.003
     * \endif
     */
    public static final int EM_FEATURE_VERSION_FACE_SMALL_1_01_003 = 61;

    /**
     * \if ENGLISH_LANG
     * Face，small model，1.02.003
     * \else
     * 目标，小模型，1.02.003
     * \endif
     */
    public static final int EM_FEATURE_VERSION_FACE_SMALL_1_02_003 = 62;

    /**
     * \if ENGLISH_LANG
     *  Human and non-motor，no version
     * \else
     * 人和非机动车，全局无版本号
     * \endif
     */
    public static final int EM_FEATURE_VERSION_HUMAN_NONMOTOR = 91;

    /**
     * \if ENGLISH_LANG
     * Human and non-motor，global float，1.00.01
     * \else
     * 人和非机动车，全局浮点，1.00.01
     * \endif
     */
    public static final int EM_FEATURE_VERSION_HUMAN_NONMOTOR_FLOAT_1_00_01 = 92;

    /**
     * \if ENGLISH_LANG
     * Human and non-motor，global hash，1.00.01
     * \else
     * 人和非机动车，全局哈希，1.00.01
     * \endif
     */
    public static final int EM_FEATURE_VERSION_HUMAN_NONMOTOR_HASH_1_00_01 = 93;

    /**
     * \if ENGLISH_LANG
     *  Human and non-motor，global float，1.01.00
     * \else
     * 人和非机动车，全局浮点，1.01.00
     * \endif
     */
    public static final int EM_FEATURE_VERSION_HUMAN_NONMOTOR_FLOAT_1_01_00 = 94;

    /**
     * \if ENGLISH_LANG
     * Human and non-motor，global hash，1.01.00
     * \else
     * 人和非机动车，全局哈希，1.01.00
     * \endif
     */
    public static final int EM_FEATURE_VERSION_HUMAN_NONMOTOR_HASH_1_01_00 = 95;

    /**
     * \if ENGLISH_LANG
     * Human and non-motor, global float, 1.01.01
     * \else
     * 人和非机动车，全局浮点，1.01.01
     * \endif
     */
    public static final int EM_FEATURE_VERSION_HUMAN_NONMOTOR_FLOAT_1_01_01 = 96;

    /**
     * \if ENGLISH_LANG
     * Human and non-motor, global hash, 1.01.01
     * \else
     * 人和非机动车，全局哈希，1.01.01
     * \endif
     */
    public static final int EM_FEATURE_VERSION_HUMAN_NONMOTOR_HASH_1_01_01 = 97;

    /**
     * \if ENGLISH_LANG
     * Traffic，no version
     * \else
     * 机动车，全局无版本号
     * \endif
     */
    public static final int EM_FEATURE_VERSION_TRAFFIC = 121;

    /**
     * \if ENGLISH_LANG
     * Traffic，global float, 0
     * \else
     * 机动车，全局浮点版本号0
     * \endif
     */
    public static final int EM_FEATURE_VERSION_TRAFFIC_FLOAT = 122;

    /**
     * \if ENGLISH_LANG
     * Traffic，global float, 1.00.01
     * \else
     * 机动车，全局浮点版本号1.00.01
     * \endif
     */
    public static final int EM_FEATURE_VERSION_TRAFFIC_FLOAT_1_00_01 = 123;

    /**
     * \if ENGLISH_LANG
     * Traffic，global hash, 1.00.01
     * \else
     * 机动车，全局哈希版本号1.00.01
     * \endif
     */
    public static final int EM_FEATURE_VERSION_TRAFFIC_HASH_1_00_01 = 124;

    /**
     * \if ENGLISH_LANG
     * Traffic，global float, 1.00.02
     * \else
     * 机动车，全局浮点版本号1.00.02
     * \endif
     */
    public static final int EM_FEATURE_VERSION_TRAFFIC_FLOAT_1_00_02 = 125;

    /**
     * \if ENGLISH_LANG
     * Traffic，global hash, 1.00.02
     * \else
     * 机动车，全局哈希版本号1.00.02
     * \endif
     */
    public static final int EM_FEATURE_VERSION_TRAFFIC_HASH_1_00_02 = 126;

    /**
     * \if ENGLISH_LANG
     * ShangTang，face，1.5.0
     * \else
     * 目标，1.5.0
     * \endif
     */
    public static final int EM_FEATURE_VERSION_SHANGTANG_FACE_1_5_0 = 151;

    /**
     * \if ENGLISH_LANG
     * ShangTang，face，1.8.1
     * \else
     * 目标，1.8.1
     * \endif
     */
    public static final int EM_FEATURE_VERSION_SHANGTANG_FACE_1_8_1 = 152;

    /**
     * \if ENGLISH_LANG
     *ShangTang，face，2.1.3
     * \else
     * 目标，2.1.3
     * \endif
     */
    public static final int EM_FEATURE_VERSION_SHANGTANG_FACE_2_1_3 = 153;

    /**
     * \if ENGLISH_LANG
     * ShangTang，face，2.39.6
     * \else
     * 目标，2.39.6
     * \endif
     */
    public static final int EM_FEATURE_VERSION_SHANGTANG_FACE_2_39_6 = 154;

    /**
     * \if ENGLISH_LANG
     * ShangTang，face，2.39.7
     * \else
     * 目标，2.39.7
     * \endif
     */
    public static final int EM_FEATURE_VERSION_SHANGTANG_FACE_2_39_7 = 155;

    /**
     * \if ENGLISH_LANG
     *  ShangTang，face，2.39.8
     * \else
     * 目标，2.39.8
     * \endif
     */
    public static final int EM_FEATURE_VERSION_SHANGTANG_FACE_2_39_8 = 156;

    /**
     * \if ENGLISH_LANG
     *ShangTang，face，239
     * \else
     * 目标，239
     * \endif
     */
    public static final int EM_FEATURE_VERSION_SHANGTANG_FACE_239 = 157;

    /**
     * \if ENGLISH_LANG
     * ShangTang，face，242
     * \else
     * 目标，242
     * \endif
     */
    public static final int EM_FEATURE_VERSION_SHANGTANG_FACE_242 = 158;

    /**
     * \if ENGLISH_LANG
     * ShangTang，face，244
     * \else
     * 目标，244
     * \endif
     */
    public static final int EM_FEATURE_VERSION_SHANGTANG_FACE_244 = 159;

    /**
     * \if ENGLISH_LANG
     * ShangTang，face，245
     * \else
     * 目标，245
     * \endif
     */
    public static final int EM_FEATURE_VERSION_SHANGTANG_FACE_245 = 160;

    /**
     * \if ENGLISH_LANG
     * ShenMo，human/traffic/non-motor，2.4.2
     * \else
     * 目标/机动车/非机动车，2.4.2
     * \endif
     */
    public static final int EM_FEATURE_VERSION_SHENMO_HUMAN_TRAFFIC_NON_2_4_2 = 181;

    /**
     * \if ENGLISH_LANG
     * ShenMo，human/traffic/non-motor，2.5.7
     * \else
     * 目标/机动车/非机动车，2.5.7
     * \endif
     */
    public static final int EM_FEATURE_VERSION_SHENMO_HUMAN_TRAFFIC_NON_2_5_7 = 182;
}

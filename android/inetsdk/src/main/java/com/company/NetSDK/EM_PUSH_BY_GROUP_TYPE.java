package com.company.NetSDK;
import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  Group push capability set for events.At present, only FaceComparision events(EVENT_IVS_FACE_COMPARISION) support this capability
 * \else
 * 事件的组推送能力集，目前只有目标比对事件(EVENT_IVS_FACE_COMPARISION)支持该能力
 * \endif
 */
public class EM_PUSH_BY_GROUP_TYPE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Not involve
     * \else
     * 不涉及该能力
     * \endif
     */
    public static final int EM_PUSH_BY_GROUP_NOT_INVOLVE = 0;
    /**
     * \if ENGLISH_LANG
     * Support
     * \else
     * 支持组推送能力
     * \endif
     */
    public static final int EM_PUSH_BY_GROUP_SUPPORT = 1;
    /**
     * \if ENGLISH_LANG
     * Not support
     * \else
     * 不支持组推送能力
     * \endif
     */
    public static final int EM_PUSH_BY_GROUP_NOT_SUPPORT = 2;

}

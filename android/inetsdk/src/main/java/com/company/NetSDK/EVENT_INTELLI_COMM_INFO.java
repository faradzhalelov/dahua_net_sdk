package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * intelli event comm info
 * \else
 * 智能报警事件公共信息
 * \endif
 */
public class EVENT_INTELLI_COMM_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * class type, refer to {@link EM_CLASS_TYPE}
     * \else
     * 智能事件所属大类,参考 {@link EM_CLASS_TYPE}
     * \endif
     */
    public int		             emClassType;

    /**
     * \if ENGLISH_LANG
     * Preset ID
     * \else
     * 该事件触发的预置点，对应该设置规则的预置点
     * \endif
     */
    public int					nPresetID;

    @Override
    public String toString() {
        return "EVENT_INTELLI_COMM_INFO{" +
                "emClassType=" + emClassType +
                ", nPresetID=" + nPresetID +
                '}';
    }
}

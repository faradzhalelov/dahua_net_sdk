package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * the event of face feature reabstract(corresponding to SDK_ALARM_FACE_FEATURE_ABSTRACT)
 * \else
 * 目标特征向量重建结果事件(对应事件SDK_ALARM_FACE_FEATURE_ABSTRACT)
 * \endif
 */
public class ALARM_FACE_FEATURE_ABSTRACT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Event ID
     * \else
     *  事件ID
     * \endif
     */
    public int					nEventID;

    /**
     * \if ENGLISH_LANG
     *  Event occurrence time 
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  Time stamp (Unit:ms)
     * \else
     *  时间戳(单位是毫秒)
     * \endif
     */
    public double					PTS;

    /**
     * \if ENGLISH_LANG
     *  The actual number of the result info of reabstract
     * \else
     *  实际返回的目标特征向量重建结果个数
     * \endif
     */
    public int					nRetAbstractInfo;

    /**
     * \if ENGLISH_LANG
     *  The result info of reabstract
     * \else
     *  目标特征向量重建结果
     * \endif
     */
    public FACE_FEATURE_ABSTRACT_INFO					stuAbstractInfo[] = new FACE_FEATURE_ABSTRACT_INFO[FinalVar.MAX_ABSTRACT_INFO_NUM];

    public ALARM_FACE_FEATURE_ABSTRACT_INFO() {
        for(int i = 0; i < FinalVar.MAX_ABSTRACT_INFO_NUM; i ++){
            this.stuAbstractInfo[i] = new FACE_FEATURE_ABSTRACT_INFO();
        }
    }
}

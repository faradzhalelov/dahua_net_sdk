package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * result info of reabstract
 * \else
 * 目标特征向量重建结果信息
 * \endif
 */
public class FACE_FEATURE_ABSTRACT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  the state of reabstract,{@link EM_ABSTRACT_STATE}
     * \else
     *  计算特征向量结果,{@link EM_ABSTRACT_STATE}
     * \endif
     */
    public int					emAbstractState;

    /**
     * \if ENGLISH_LANG
     *  the process of reabstract
     * \else
     *  人员组重建进度,百分比
     * \endif
     */
    public int					nProcess;

    /**
     * \if ENGLISH_LANG
     *  user ID
     * \else
     *  重建完成的人员编号, IVSS支持
     * \endif
     */
    public byte					szUID[] = new byte[FinalVar.SDK_MAX_PERSON_ID_LEN];

    /**
     * \if ENGLISH_LANG
     *  group ID
     * \else
     *  重建完成的人员组ID, IPC支持
     * \endif
     */
    public byte					szGroupId[] = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     *  success num of modeling,for IPC
     * \else
     *  人员组建模成功的个数，IPC支持
     * \endif
     */
    public int					nSucceedCnt;

    /**
     * \if ENGLISH_LANG
     *  fail num of modeling,for IPC
     * \else
     *  人员组建模失败的个数，IPC支持
     * \endif
     */
    public int					nFailedCnt;

    /**
     * \if ENGLISH_LANG
     *  The error code of modeling (valid when FailedCnt > 0 ): for IPC,{@link EM_FEATURE_ERROR_CODE}
     * \else
     *  建模失败记录的错误原因(当FailedCnt大于0时有效)；IPC支持,{@link EM_FEATURE_ERROR_CODE}
     * \endif
     */
    public int					emFeatureError;

    /**
     * \if ENGLISH_LANG
     *  The token value of this face modeling is returned as it is when modeling, IPC support
     * \else
     *  该次目标建模的token值，建模时提供原样返回，IPC支持
     * \endif
     */
    public int					nToken;

}

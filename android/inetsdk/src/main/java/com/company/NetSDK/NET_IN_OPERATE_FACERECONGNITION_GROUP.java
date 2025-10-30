package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OperateFaceRecognitionGroup} input parameter
 * \else
 * {@link INetSDK#OperateFaceRecognitionGroup}接口输入参数
 * \endif
 */
public class NET_IN_OPERATE_FACERECONGNITION_GROUP implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * operation type, refer to {@linkl EM_OPERATE_FACERECONGNITION_GROUP_TYPE}
     * \else
     * 操作类型, 参考 {@linkl EM_OPERATE_FACERECONGNITION_GROUP_TYPE}
     * \endif
     */
    public int                  emOperateType;

    /**
     * \if ENGLISH_LANG
     * operation info
     * Add face group，if operate type is {@link EM_OPERATE_FACERECONGNITION_GROUP_TYPE#NET_FACERECONGNITION_GROUP_ADD},corresponding to {@link NET_ADD_FACERECONGNITION_GROUP_INFO}
     * Modify face group，if operate type is {@link EM_OPERATE_FACERECONGNITION_GROUP_TYPE#NET_FACERECONGNITION_GROUP_MODIFY},corresponding to {@link NET_MODIFY_FACERECONGNITION_GROUP_INFO}
     * Delete face group，if operate type is {@link EM_OPERATE_FACERECONGNITION_GROUP_TYPE#NET_FACERECONGNITION_GROUP_DELETE},corresponding to {@link NET_DELETE_FACERECONGNITION_GROUP_INFO}
     * \else
     * 相关操作信息,由用户申请内存，申请大小参照操作类型对应的结构体
     * 添加目标库，若操作类型为 {@link EM_OPERATE_FACERECONGNITION_GROUP_TYPE#NET_FACERECONGNITION_GROUP_ADD},对应结构体为 {@link NET_ADD_FACERECONGNITION_GROUP_INFO}
     * 修改目标库，若操作类型为 {@link EM_OPERATE_FACERECONGNITION_GROUP_TYPE#NET_FACERECONGNITION_GROUP_MODIFY},对应结构体为 {@link NET_MODIFY_FACERECONGNITION_GROUP_INFO}
     * 删除目标库，若操作类型为 {@link EM_OPERATE_FACERECONGNITION_GROUP_TYPE#NET_FACERECONGNITION_GROUP_DELETE},对应结构体为 {@link NET_DELETE_FACERECONGNITION_GROUP_INFO}
     * \endif
     */
    public Object               pOPerateInfo;
}

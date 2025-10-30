package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#FindGroupInfo} port input parameter
 * \else
 * {@link INetSDK#FindGroupInfo} 接口输入参数
 * \endif
 */
public class NET_IN_FIND_GROUP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * staff ID, SN staff, as null means search all staff group info
     * \else
     * 人员组ID,唯一标识一组人员,为空表示查询全部人员组信息
     * \endif
     */
    public byte                szGroupId[] = new byte[FinalVar.SDK_COMMON_STRING_64];
}

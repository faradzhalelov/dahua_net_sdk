package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * delete staff group info
 * \else
 * 删除人员组信息
 * \endif
 */
public class NET_DELETE_FACERECONGNITION_GROUP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * staff group ID, SN staff
     * \else
     * 人员组ID,唯一标识一组人员
     * \endif
     */
    public byte[]                szGroupId = new byte[FinalVar.SDK_COMMON_STRING_64];
}

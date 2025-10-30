package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * modify staff group info
 * \else
 * 修改人员组信息
 * \endif
 */
public class NET_MODIFY_FACERECONGNITION_GROUP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * staff group info
     * \else
     * 人员组信息
     * \endif
     */
    public NET_FACERECONGNITION_GROUP_INFO stuGroupInfo = new NET_FACERECONGNITION_GROUP_INFO();
}

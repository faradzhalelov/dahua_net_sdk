package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#FindGroupInfo} port output parameter
 * \else
 * {@link INetSDK#FindGroupInfo} 接口输出参数
 * \endif
 */
public class NET_OUT_FIND_GROUP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * staff group info , apply space by user, apply to sizeof(NET_FACERECONGNITION_GROUP_INFO)*nMaxGroupNum
     * \else
     * 人员组信息,由用户申请空间,大小为sizeof(NET_FACERECONGNITION_GROUP_INFO)*nMaxGroupNum
     * \endif
     */
    public NET_FACERECONGNITION_GROUP_INFO[]  pGroupInfos;

    /**
     * \if ENGLISH_LANG
     * current applied group size
     * \else
     * 当前申请的数组大小
     * \endif
     */
    public int                              nMaxGroupNum;

    /**
     * \if ENGLISH_LANG
     * device returned staff group number
     * \else
     * 设备返回的人员组个数
     * \endif
     */
    public int                              nRetGroupNum;

    public NET_OUT_FIND_GROUP_INFO(int nMaxGroupNum) {
        this.nMaxGroupNum = nMaxGroupNum;

        pGroupInfos = new NET_FACERECONGNITION_GROUP_INFO[nMaxGroupNum];
        for(int i = 0; i < nMaxGroupNum; i++) {
            pGroupInfos[i] = new NET_FACERECONGNITION_GROUP_INFO();
        }
    }
}

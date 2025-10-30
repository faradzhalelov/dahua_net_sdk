package com.company.NetSDK;

import java.io.Serializable;
public class NET_NETAPP_COMMUNICATION_LIST implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * group name,Non-repeatable naming
     * \else
     * 自定义组名,不可重复命名
     * \endif
     */
    public byte[]				szGroupName = new byte[FinalVar.MAX_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * 联系人个数
     * \else
     * 实际的通讯录配置个数
     * \endif
     */
    public int					nMembersNum;

    /**
     * \if ENGLISH_LANG
     * contact member info
     * \else
     *  联系人信息
     * \endif
     */
    public NET_MEMBERS_INFO arrMembers[] = new NET_MEMBERS_INFO[32];


    /**
     * \if ENGLISH_LANG
     * user group association notify info
     * \else
     *  用户组关联通知信息
     * \endif
     */
    public NET_NOTIFY_INFO stuNotifyInfo = new NET_NOTIFY_INFO();

    public NET_NETAPP_COMMUNICATION_LIST() {
        for (int i = 0; i < 32; ++i) {
            arrMembers[i] = new NET_MEMBERS_INFO();
        }
    }
}

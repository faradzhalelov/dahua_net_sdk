package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  input of insert or update user
 * \else
 *  新增或更新用户信息入参
 * \endif
 */
public class NET_IN_ACCESS_USER_SERVICE_INSERT implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  user number
     * \else
     * 用户信息数量
     * \endif
     */
    public int     nInfoNum;

    /**
     * \if ENGLISH_LANG
     *  user info
     * \else
     * 用户信息,内存由用户申请释放，申请大小不小于nInfoNum*sizeof(NET_ACCESS_USER_INFO)
     * \endif
     */
    public NET_ACCESS_USER_INFO[]     pUserInfo;

    public NET_IN_ACCESS_USER_SERVICE_INSERT(int nInfoNum) {
        this.nInfoNum = nInfoNum;
        pUserInfo = new NET_ACCESS_USER_INFO[nInfoNum];
        for(int i = 0; i < nInfoNum; i ++){
            this.pUserInfo[i] = new NET_ACCESS_USER_INFO();
        }
    }
}

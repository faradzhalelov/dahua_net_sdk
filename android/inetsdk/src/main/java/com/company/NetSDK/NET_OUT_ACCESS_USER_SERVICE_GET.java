package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  output param of Get user
 * \else
 *  获取用户信息出参
 * \endif
 */
public class NET_OUT_ACCESS_USER_SERVICE_GET implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  max number of return
     * \else
     * 查询返回的最大数量
     * \endif
     */
    public int     nMaxRetNum;

    /**
     * \if ENGLISH_LANG
     *  user info,larger than nUserNum*sizeof(NET_ACCESS_USER_INFO)
     * \else
     * 用户信息,内存由用户申请释放，申请大小不小于 nUserNum*sizeof(NET_ACCESS_USER_INFO)                                                                           // 返回个数同NET_IN_ACCESS_USER_SERVICE_GET中nUserNum
     * \endif
     */
    public NET_ACCESS_USER_INFO[]     pUserInfo;

    /**
     * \if ENGLISH_LANG
     *  errorcode when failed,return number is nUserNum in NET_IN_ACCESS_USER_SERVICE_GET
     * \else
     * 查询失败时，内存由用户申请释放,对应查询的每一项的结果，返回个数同NET_IN_ACCESS_USER_SERVICE_GET中nUserNum
     * \endif
     */
    public int     pFailCode[];

    public NET_OUT_ACCESS_USER_SERVICE_GET(int nMaxRetNum) {
        this.nMaxRetNum = nMaxRetNum;
        pFailCode = new int[nMaxRetNum];
        pUserInfo = new NET_ACCESS_USER_INFO[nMaxRetNum];
        for(int i = 0 ; i < nMaxRetNum; i ++){
            this.pUserInfo[i] = new NET_ACCESS_USER_INFO();
        }
    }
}


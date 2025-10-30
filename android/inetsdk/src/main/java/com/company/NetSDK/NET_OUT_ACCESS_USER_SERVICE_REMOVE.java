package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  output of remove user
 * \else
 *  删除指定ID人员信息出参
 * \endif
 */
public class NET_OUT_ACCESS_USER_SERVICE_REMOVE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  max return number,nUserNum in NET_IN_ACCESS_USER_SERVICE_REMOVE
     * \else
     * 返回的最大数量,不小于 NET_IN_ACCESS_USER_SERVICE_REMOVE中nUserNum
     * \endif
     */
    public int     nMaxRetNum;

    /**
     * \if ENGLISH_LANG
     *  errorcode when failed,return number is nUserNum in NET_IN_ACCESS_USER_SERVICE_REMOVE
     * \else
     * 插入失败时，内存由用户申请释放,对应插入的每一项的结果,返回个数同NET_IN_ACCESS_USER_SERVICE_REMOVE中nUserNum
     * \endif
     */
    public int     pFailCode[];

    public NET_OUT_ACCESS_USER_SERVICE_REMOVE(int nMaxRetNum) {
        this.nMaxRetNum = nMaxRetNum;
        this.pFailCode = new int[nMaxRetNum];
    }
}

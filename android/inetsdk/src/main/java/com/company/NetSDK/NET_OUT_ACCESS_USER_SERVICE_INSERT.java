package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  output param of insert or update user
 * \else
 *  新增或更新用户信息出参
 * \endif
 */
public class NET_OUT_ACCESS_USER_SERVICE_INSERT implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  max return number, nInfoNum of NET_IN_ACCESS_USER_SERVICE_INSERT plus
     * \else
     * 申请的最大返回的错误信息数量,不小于NET_IN_ACCESS_USER_SERVICE_INSERT中nInfoNum
     * \endif
     */
    public int     nMaxRetNum;

    /**
     * \if ENGLISH_LANG
     *  errorcode when insert failed,return number is nInfoNum of NET_IN_ACCESS_USER_SERVICE_INSER
     * \else
     * 用户分配释放内存,插入失败时，对应插入的每一项的结果,返回个数同NET_IN_ACCESS_USER_SERVICE_INSERT中nInfoNum
     * \endif
     */
    public int     pFailCode[];

    public NET_OUT_ACCESS_USER_SERVICE_INSERT(int nMaxRetNum) {
        this.nMaxRetNum = nMaxRetNum;
        this.pFailCode = new int[nMaxRetNum];
    }
}

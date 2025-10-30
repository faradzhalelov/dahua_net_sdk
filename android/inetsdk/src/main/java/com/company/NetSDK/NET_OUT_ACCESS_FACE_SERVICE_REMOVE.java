package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * the output param of removing face data(NET_EM_ACCESS_CTL_FACE_SERVICE_REMOVE)
 * \else
 * 删除多用户的多个目标信息输出参数(NET_EM_ACCESS_CTL_FACE_SERVICE_REMOVE)
 * \endif
 */
public class NET_OUT_ACCESS_FACE_SERVICE_REMOVE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  the max return number,not less than nUserNum in NET_IN_ACCESS_FACE_SERVICE_REMOVE
     * \else
     *  最大返回数量,不小于 NET_IN_ACCESS_FACE_SERVICE_REMOVE中的nUserNum
     * \endif
     */
    public int					nMaxRetNum;

    /**
     * \if ENGLISH_LANG
     *  user allocates memory.when remove failed,the result of each item removed,count is nUserNum in NET_IN_ACCESS_FACE_SERVICE_REMOVE
     * \else
     *  用户分配内存.删除失败时,对应删除的每一项的结果,返回个数同NET_IN_ACCESS_FACE_SERVICE_REMOVE中的nUserNum
     * \endif
     */
    public int[]					pFailCode;

    public NET_OUT_ACCESS_FACE_SERVICE_REMOVE() {
        pFailCode = new int[nMaxRetNum];
    }

    public NET_OUT_ACCESS_FACE_SERVICE_REMOVE(int nMaxRetNum) {
        this.nMaxRetNum = nMaxRetNum;
        pFailCode = new int[nMaxRetNum];
    }
}

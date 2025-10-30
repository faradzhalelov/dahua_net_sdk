package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * the output param of adding face data(NET_EM_ACCESS_CTL_FACE_SERVICE_INSERT)
 * \else
 * 添加目标记录信息输出参数(NET_EM_ACCESS_CTL_FACE_SERVICE_INSERT)
 * \endif
 */
public class NET_OUT_ACCESS_FACE_SERVICE_INSERT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  the max return number,not less than nFaceInfoNum in NET_IN_ACCESS_FACE_SERVICE_INSERT
     * \else
     *  最大返回数量,不小于 NET_IN_ACCESS_FACE_SERVICE_INSERT 中的nFaceInfoNum
     * \endif
     */
    public int					nMaxRetNum;

    /**
     * \if ENGLISH_LANG
     *  user allocates memory.when insert failed,the result of each item inserted,count is nFaceInfoNum in NET_IN_ACCESS_FACE_SERVICE_INSERT
     * \else
     *  用户分配内存,添加失败时,对应插入的每一项的结果,返回个数同NET_IN_ACCESS_FACE_SERVICE_INSERT中的nFaceInfoNum
     * \endif
     */
    public int[]					pFailCode;

    public NET_OUT_ACCESS_FACE_SERVICE_INSERT() {
        pFailCode = new int[nMaxRetNum];
    }

    public NET_OUT_ACCESS_FACE_SERVICE_INSERT(int nMaxRetNum) {
        this.nMaxRetNum = nMaxRetNum;
        pFailCode = new int[nMaxRetNum];
    }
}

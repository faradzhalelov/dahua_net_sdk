package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * the output param to update face data(NET_EM_ACCESS_CTL_FACE_SERVICE_UPDATE)
 * \else
 * 更新多用户多个目标记录信息输出参数(NET_EM_ACCESS_CTL_FACE_SERVICE_UPDATE)
 * \endif
 */
public class NET_OUT_ACCESS_FACE_SERVICE_UPDATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  the max return number,not less than nFaceInfoNum in NET_IN_ACCESS_FACE_SERVICE_UPDATE
     * \else
     *  最大返回数量,不小于 NET_IN_ACCESS_FACE_SERVICE_UPDATE中的nFaceInfoNum
     * \endif
     */
    public int					nMaxRetNum;

    /**
     * \if ENGLISH_LANG
     *  user allocates memory.when update failed,the result of each item updated,count is nFaceInfoNum in NET_IN_ACCESS_FACE_SERVICE_UPDATE
     * \else
     *  用户分配内存.更新失败时,对应更新的每一项的结果,返回个数同NET_IN_ACCESS_FACE_SERVICE_UPDATE中的nFaceInfoNum
     * \endif
     */
    public int[]					pFailCode;

    public NET_OUT_ACCESS_FACE_SERVICE_UPDATE() {
        pFailCode = new int[nMaxRetNum];
    }

    public NET_OUT_ACCESS_FACE_SERVICE_UPDATE(int nMaxRetNum) {
        this.nMaxRetNum = nMaxRetNum;
        pFailCode = new int[nMaxRetNum];
    }
}

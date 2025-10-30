package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * the out param of getting face data(NET_EM_ACCESS_CTL_FACE_SERVICE_GET)
 * \else
 * 批量获取多用户多个目标输出参数(NET_EM_ACCESS_CTL_FACE_SERVICE_GET)
 * \endif
 */
public class NET_OUT_ACCESS_FACE_SERVICE_GET implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  the max return number,not less than nUserNum in NET_IN_ACCESS_FACE_SERVICE_GET
     * \else
     *  最大返回数量,不小于 NET_IN_ACCESS_FACE_SERVICE_GET 中的 nUserNum
     * \endif
     */
    public int					nMaxRetNum;

    /**
     * \if ENGLISH_LANG
     *  face data,user allocates memory.count is nUserNum in NET_IN_ACCESS_FACE_SERVICE_GET,only return face data
     * \else
     *  目标数据,用户分配内存,返回个数同NET_IN_ACCESS_FACE_SERVICE_GET中的nUserNum,只返回的目标模版数据
     * \endif
     */
    public NET_ACCESS_FACE_INFO[]					pFaceInfo;

    /**
     * \if ENGLISH_LANG
     *  user allocates memory.when get failed,the result of each item get,count is nUserNum in NET_IN_ACCESS_FACE_SERVICE_GET
     * \else
     *  用户分配内存,获取失败时,对应获取的每一项的结果,返回个数同NET_IN_ACCESS_FACE_SERVICE_GET中的nUserNum
     * \endif
     */
    public int[]					pFailCode;

    public NET_OUT_ACCESS_FACE_SERVICE_GET() {
        pFaceInfo = new NET_ACCESS_FACE_INFO[nMaxRetNum];
        pFailCode = new int[nMaxRetNum];
        for(int i = 0; i < nMaxRetNum; i ++){
            pFaceInfo[i] = new NET_ACCESS_FACE_INFO();
        }
    }

    public NET_OUT_ACCESS_FACE_SERVICE_GET(int nMaxRetNum) {
        this.nMaxRetNum = nMaxRetNum;
        pFaceInfo = new NET_ACCESS_FACE_INFO[nMaxRetNum];
        pFailCode = new int[nMaxRetNum];
        for(int i = 0; i < nMaxRetNum; i ++){
            pFaceInfo[i] = new NET_ACCESS_FACE_INFO();
        }
    }
}

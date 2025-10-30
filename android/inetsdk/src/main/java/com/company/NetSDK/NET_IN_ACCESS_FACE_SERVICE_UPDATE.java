package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * the input param to update face data(NET_EM_ACCESS_CTL_FACE_SERVICE_UPDATE)
 * \else
 * 更新多用户多个目标记录信息输入参数(NET_EM_ACCESS_CTL_FACE_SERVICE_UPDATE)
 * \endif
 */
public class NET_IN_ACCESS_FACE_SERVICE_UPDATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  face info number
     * \else
     *  目标信息数量
     * \endif
     */
    public int					nFaceInfoNum;

    /**
     * \if ENGLISH_LANG
     *  face data,user allocates memory
     * \else
     *  目标数据,用户分配内存
     * \endif
     */
    public NET_ACCESS_FACE_INFO[]					pFaceInfo;

    public NET_IN_ACCESS_FACE_SERVICE_UPDATE() {
        pFaceInfo = new NET_ACCESS_FACE_INFO[nFaceInfoNum];
        for(int i = 0; i < nFaceInfoNum; i ++){
            pFaceInfo[i] = new NET_ACCESS_FACE_INFO();
        }
    }

    public NET_IN_ACCESS_FACE_SERVICE_UPDATE(int nFaceInfoNum) {
        this.nFaceInfoNum = nFaceInfoNum;
        pFaceInfo = new NET_ACCESS_FACE_INFO[nFaceInfoNum];
        for(int i = 0; i < nFaceInfoNum; i ++){
            pFaceInfo[i] = new NET_ACCESS_FACE_INFO();
        }
    }
}

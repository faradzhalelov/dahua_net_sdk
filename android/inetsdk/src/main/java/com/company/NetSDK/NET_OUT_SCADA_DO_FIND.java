package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#DoFindSCADA} output parameter
 * \else
 * {@link INetSDK#DoFindSCADA} 接口出参
 * \endif
 */
public class NET_OUT_SCADA_DO_FIND implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 用户分配内存的个数
     * \endif
     */
    public int	                          nMaxNum;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 本次查询到的个数
     * \endif
     */
    public int                           nRetNum;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 查询结果, 用户分配内存,大小为sizeof({@link NET_SCADA_POINT_BY_ID_INFO})*nMaxNum
     * \endif
     */
    public NET_SCADA_POINT_BY_ID_INFO[]  pstuInfo;

    public NET_OUT_SCADA_DO_FIND() {
        this.nMaxNum = 1;
        pstuInfo = new NET_SCADA_POINT_BY_ID_INFO[1];
        pstuInfo[0] = new NET_SCADA_POINT_BY_ID_INFO();
    }

    /**
     * @param nMaxNum 用户申请分配的内存的最大个数
     */
    public NET_OUT_SCADA_DO_FIND(int nMaxNum) {
        if(nMaxNum > 0) {
            this.nMaxNum = nMaxNum;
            pstuInfo = new NET_SCADA_POINT_BY_ID_INFO[nMaxNum];

            for(int i = 0; i < nMaxNum; i++) {
                pstuInfo[i] = new NET_SCADA_POINT_BY_ID_INFO();
            }
        } else {
            this.nMaxNum = 1;
            pstuInfo = new NET_SCADA_POINT_BY_ID_INFO[1];
            pstuInfo[0] = new NET_SCADA_POINT_BY_ID_INFO();
        }
    }
}

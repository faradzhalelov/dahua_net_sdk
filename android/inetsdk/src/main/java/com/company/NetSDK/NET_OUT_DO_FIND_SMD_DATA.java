package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_DoFindSMDData output param
 * \else
 * @brief 接口 CLIENT_DoFindSMDData 的输出参数
 * \endif
 */
public class NET_OUT_DO_FIND_SMD_DATA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Return the actual number of records
     * \else
     *  返回记录实际条数
     * \endif
     */
    public int					nFindInfoNum;

    /**
     * \if ENGLISH_LANG
     *  SMD data info
     * \else
     *  返回的记录，单次不超过1024
     * \endif
     */
    public NET_SMD_DATA_INFO					stuSMDDataInfo[] = new NET_SMD_DATA_INFO[1024];

    public NET_OUT_DO_FIND_SMD_DATA() {
        for(int i = 0; i < 1024; i ++){
            this.stuSMDDataInfo[i] = new NET_SMD_DATA_INFO();
        }
    }
}

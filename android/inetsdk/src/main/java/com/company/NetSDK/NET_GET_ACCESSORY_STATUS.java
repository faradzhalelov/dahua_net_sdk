package com.company.NetSDK;

import java.io.Serializable;
public class NET_GET_ACCESSORY_STATUS implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * accessory SN Number
     * \else
     * 配件序列号数组个数
     * \endif
     */
    public int                      nSNNum;
    /**
     * \if ENGLISH_LANG
     * accessory SN arr
     * \else
     * 配件序列号数组,一维数组
     * \endif
     */
    public byte                     szSN[][] = new byte[56][FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * num of status info arr
     * \else
     *  返回的状态信息数组个数
     * \endif
     */
    public int                      nStatusNum;

    /**
     * \if ENGLISH_LANG
     * status info arr
     * \else
     *  返回的状态信息数组
     * \endif
     */
    public NET_STATUS_INFO   stStatusInfo[] = new NET_STATUS_INFO[56];

    public NET_GET_ACCESSORY_STATUS()
    {
        for (int i = 0; i < stStatusInfo.length; ++i) {
            stStatusInfo[i] = new NET_STATUS_INFO();
        }
    }

}

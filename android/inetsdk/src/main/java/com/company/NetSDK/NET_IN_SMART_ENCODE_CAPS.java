package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;


/**
 * \if ENGLISH_LANG
 * query Smart encode caps input parameters
 * \else
 * 查询Smart编码能力集入参
 * \endif
 */
public class NET_IN_SMART_ENCODE_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel NO.
     * \else
     *  通道号
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  actural stream NO.
     * \else
     *  实际码流个数
     * \endif
     */
    public int					nStreamNum;

    /**
     * \if ENGLISH_LANG
     *  Smart encode information of each stream,if stream NO. is 3,array index 0,1,2 presents the encode information of main stream,sub stream 1,sub stream 2
     * \else
     *  每个码流对应的Smart编码信息，如果实际码流个数为3，则下标0、1、2分辨代表主码流、辅码流1、辅码流2的编码信息	
     * \endif
     */
    public SMART_ENCODE_INFO					stSmartEncodeInfo[] = new SMART_ENCODE_INFO[FinalVar.MAX_STREAM_NUM];

    public NET_IN_SMART_ENCODE_CAPS(int nStreamNum) {
        this.nStreamNum = nStreamNum;
        for(int i = 0; i < nStreamNum; i ++){
            this.stSmartEncodeInfo[i] = new SMART_ENCODE_INFO();
        }
    }

    @Override
    public String toString() {
        String tmpString = "[";
        for(int i = 0; i < nStreamNum; i ++){
            if(null != this.stSmartEncodeInfo[i])  tmpString += stSmartEncodeInfo[i].toString();
        }
        tmpString += "]";
        return "NET_IN_SMART_ENCODE_CAPS{" +
                "nChannel=" + nChannel +
                ", nStreamNum=" + nStreamNum +
                ", stSmartEncodeInfo=" + tmpString +
                '}';
    }
}

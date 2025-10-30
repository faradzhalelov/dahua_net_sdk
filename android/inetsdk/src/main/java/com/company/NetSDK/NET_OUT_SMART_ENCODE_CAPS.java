package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;


/**
 * \if ENGLISH_LANG
 * query Smart encode caps output parameters
 * \else
 * 查询Smart编码能力集出参
 * \endif
 */
public class NET_OUT_SMART_ENCODE_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Smart encode caps group number
     * \else
     *  Smart编码使能组个数
     * \endif
     */
    public int					nSmartEncodeCapsNum;

    /**
     * \if ENGLISH_LANG
     *  encode caps of ezch stream smart encode information
     * \else
     *  每个码流Smart编码信息对应编码使能。
     * \endif
     */
    public SMART_ENCODE_CAPS_INFO					stSmartEncodeCaps[] = new SMART_ENCODE_CAPS_INFO[FinalVar.MAX_STREAM_NUM];

    public NET_OUT_SMART_ENCODE_CAPS() {
        for(int i = 0; i < this.nSmartEncodeCapsNum; i ++){
            this.stSmartEncodeCaps[i] = new SMART_ENCODE_CAPS_INFO();
        }
    }

    public NET_OUT_SMART_ENCODE_CAPS(int nSmartEncodeCapsNum) {
        this.nSmartEncodeCapsNum = nSmartEncodeCapsNum;
        for(int i = 0; i < nSmartEncodeCapsNum; i ++){
            this.stSmartEncodeCaps[i] = new SMART_ENCODE_CAPS_INFO();
        }
    }

    @Override
    public String toString() {
        String tmpString = "[";
        for(int i = 0; i < nSmartEncodeCapsNum; i ++){
            if(null != this.stSmartEncodeCaps[i])  tmpString += stSmartEncodeCaps[i].toString();
        }
        tmpString += "]";
        return "NET_OUT_SMART_ENCODE_CAPS{" +
                "nSmartEncodeCapsNum=" + nSmartEncodeCapsNum +
                ", stSmartEncodeCaps=" + tmpString +
                '}';
    }
}

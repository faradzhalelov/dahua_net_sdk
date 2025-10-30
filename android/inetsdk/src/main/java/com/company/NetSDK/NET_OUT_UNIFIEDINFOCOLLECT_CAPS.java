package com.company.NetSDK;
import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetDevCaps} output param
 * \else
 * {@link INetSDK#GetDevCaps} 输出参数
 * \endif
 */
public class NET_OUT_UNIFIEDINFOCOLLECT_CAPS implements
        Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * whether support DMSS private protocol or not
     * \else
     * 是否支持DMSS专有协议
     * \endif
     */
    public boolean      bSupportUnifiedInfoCollect;     //
}

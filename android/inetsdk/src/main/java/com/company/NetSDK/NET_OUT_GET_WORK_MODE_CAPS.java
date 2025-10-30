package com.company.NetSDK;
import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * CLIENT_GetWorkModeCaps output parameter {@link INetSDK#GetWorkModeCaps}}
 * \else
 * CLIENT_GetWorkModeCaps 输出参数 {@link INetSDK#GetWorkModeCaps}
 * \endif
 */
public class NET_OUT_GET_WORK_MODE_CAPS implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * Whether the working mode is supported
     * \else
     * 是否支持工作模式
     * \endif
     */
    public  boolean									bSupportWorkMode;
    /**
     * \if ENGLISH_LANG
     * Number of working modes supported
     * \else
     * 具体支持的工作模式个数
     * \endif
     */
   public  int										nWorkModesCount;
    /**
     * \if ENGLISH_LANG
     * Specific supported working modes  , EM_WORK_MODE
     * \else
     * 具体支持的工作模式 ,  EM_WORK_MODE
     * \endif
     */
   public int[]							emWorkModes=new  int[8];

}

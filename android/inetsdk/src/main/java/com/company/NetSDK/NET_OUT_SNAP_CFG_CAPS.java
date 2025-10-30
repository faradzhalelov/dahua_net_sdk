package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief get snap config capbility output parameter
 * \else
 * @brief 抓图配置能力
 * \endif
 */
public class NET_OUT_SNAP_CFG_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  valid length of stuResolutionTypes array	 	 	 
     * \else
     *  支持的视频分辨率信息	 	 	 
     * \endif
     */
    public int					nResolutionTypeNum;

    /**
     * \if ENGLISH_LANG
     *    SDK_RESOLUTION_INFO  stuResolutionTypes[SDK_MAX_CAPTURE_SIZE_NUM];	 	 	 
     * \else
     *    SDK_RESOLUTION_INFO  stuResolutionTypes[SDK_MAX_CAPTURE_SIZE_NUM];	 	 	 
     * \endif
     */
    public SDK_RESOLUTION_INFO					stuResolutionTypes[] = new SDK_RESOLUTION_INFO[FinalVar.SDK_MAX_CAPTURE_SIZE_NUM];

    /**
     * \if ENGLISH_LANG
     *  valid length of nFramesPerSecList array		 	 	 
     * \else
     *  支持的帧率信息	 	 	 
     * \endif
     */
    public int					dwFramesPerSecNum;

    /**
     * \if ENGLISH_LANG
     *  -25:1f/25s;-24:1f/24s;-23:1f/23s;-22:1f/22s...
     * \else
     *  -25：25秒1帧；-24：24秒1帧；……	 	 	 
     * \endif
     */
    public int					nFramesPerSecList[] = new int[FinalVar.SDK_MAX_FPS_NUM];

    /**
     * \if ENGLISH_LANG
     *  valid length of nQualityList array	 	 	 
     * \else
     *  支持的画质信息	 	 	 
     * \endif
     */
    public int					dwQualityMun;

    /**
     * \if ENGLISH_LANG
     *  Image quality(1-6,6 means the best quality)
     * \else
     *  1-6档（6质量最高） 	 	 
     * \endif
     */
    public int					nQualityList[] = new int[FinalVar.SDK_MAX_QUALITY_NUM];

    /**
     * \if ENGLISH_LANG
     *  (Bit)0:activate scheduled snapshot,1:Manually activate snapshot	 	 	 
     * \else
     *  模式,按位：第一位：定时；第二位：手动。	 	 	 
     * \endif
     */
    public int					dwMode;

    /**
     * \if ENGLISH_LANG
     *  (Bit)0:BMP format,1:JPG format 	 	 
     * \else
     *  图片格式模式,按位：第一位：bmp；第二位：jpg。	 	 	 
     * \endif
     */
    public int					dwFormat;

    public NET_OUT_SNAP_CFG_CAPS() {
        for(int i = 0; i < FinalVar.SDK_MAX_CAPTURE_SIZE_NUM; i ++){
            this.stuResolutionTypes[i] = new SDK_RESOLUTION_INFO();
        }
    }
}

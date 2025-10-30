package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Channel title information
 * \else
 * @brief 通道标题信息
 * \endif
 */
public class NET_GBMODE_CHANNELTITLE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  OSD display position,{@link EM_TITLE_POSITON}
     * \else
     *  OSD显示位置,{@link EM_TITLE_POSITON}
     * \endif
     */
    public int					emPositon;

    /**
     * \if ENGLISH_LANG
     *  Text alignment mode, same value type as above
     * \else
     *  文本对齐方式，取值方式同上
     * \endif
     */
    public int					nTextAlign;

    /**
     * \if ENGLISH_LANG
     *  OSD enable status and text information, generally the array size of the top left corner is 1, the bottom left corner is 3, and the bottom right corner is 5
     * \else
     *  OSD使能状态及文本信息, 一般左上角数组大小为1，左下角大小为3，右下角大小为5
     * \endif
     */
    public NET_TITLE_OSD_INFO					stuOSD[] = new NET_TITLE_OSD_INFO[8];

    /**
     * \if ENGLISH_LANG
     *  OSD enable status and number of valid text information
     * \else
     *  OSD使能状态及文本信息有效个数;
     * \endif
     */
    public int					nOSDNum;
    
    public NET_GBMODE_CHANNELTITLE_INFO() {
    	for (int i = 0; i < stuOSD.length; i++) {
    		stuOSD[i] = new NET_TITLE_OSD_INFO();
		}
    }

}
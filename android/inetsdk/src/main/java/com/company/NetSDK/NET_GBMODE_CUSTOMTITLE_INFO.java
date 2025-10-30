package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Customized title information for top-left, bottom-left, and bottom-right corners
 * \else
 * @brief 自定义左上角、左下角及右下角标题信息
 * \endif
 */
public class NET_GBMODE_CUSTOMTITLE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  OSD display position
     * \else
     *  OSD显示位置
     * \endif
     */
    public byte					szPositon[] = new byte[16];

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
     *  OSD enable status and number of valid text information;
     * \else
     *  OSD使能状态及文本信息有效个数;
     * \endif
     */
    public int					nOSDNum;

    /**
     * \if ENGLISH_LANG
     *  OSD enable status and text information, generally the array size of the top left corner is 1, the bottom left corner is 3, and the bottom right corner is 5
     * \else
     *  OSD使能状态及文本信息, 一般左上角数组大小为1，左下角大小为3，右下角大小为5
     * \endif
     */
    public NET_TITLE_OSD_INFO					stuOSD[] = new NET_TITLE_OSD_INFO[8];
    
    public NET_GBMODE_CUSTOMTITLE_INFO() {
    	for (int i = 0; i < stuOSD.length; i++) {
    		stuOSD[i] = new NET_TITLE_OSD_INFO();
		}
    }

}
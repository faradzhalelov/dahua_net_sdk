package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Warning line intrusion direction
 * \else
 * 警戒线入侵方向
 * \endif
 */
public class NET_CROSSLINE_DIRECTION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *    EM_CROSSLINE_DIRECTION_UNKNOW = 0 , 
     * \else
     *    EM_CROSSLINE_DIRECTION_UNKNOW = 0 , 
     * \endif
     */
    public static final int					EM_CROSSLINE_DIRECTION_UNKNOW = 0;

    /**
     * \if ENGLISH_LANG
     * From left to right
     * \else
     * 左到右
     * \endif
     */
    public static final int					EM_CROSSLINE_DIRECTION_LEFT2RIGHT = 1;

    /**
     * \if ENGLISH_LANG
     * From right to left
     * \else
     * 右到左
     * \endif
     */
    public static final int					EM_CROSSLINE_DIRECTION_RIGHT2LEFT = 2;

    /**
     * \if ENGLISH_LANG
     *    EM_CROSSLINE_DIRECTION_ANY        ,   
     * \else
     *    EM_CROSSLINE_DIRECTION_ANY        ,   
     * \endif
     */
    public static final int					EM_CROSSLINE_DIRECTION_ANY = 3;

}

package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief  detailed information of video state
 * \else
 * @brief 录像状态详细信息
 * \endif
 */
public class NET_RECORD_STATE_DETAIL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The main stream, TRUE - are video, FALSE - not in the video 
     * \else
     *  主码流, TRUE-正在录像, FALSE-没在录像
     * \endif
     */
    public boolean					bMainStream;

    /**
     * \if ENGLISH_LANG
     *  Auxiliary stream 1, TRUE - are video, FALSE - not in the video 
     * \else
     *  辅码流1, TRUE-正在录像, FALSE-没在录像
     * \endif
     */
    public boolean					bExtraStream1;

    /**
     * \if ENGLISH_LANG
     *  Auxiliary stream 2, TRUE - are video, FALSE - not in the video 
     * \else
     *  辅码流2, TRUE-正在录像, FALSE-没在录像
     * \endif
     */
    public boolean					bExtraStream2;

    /**
     * \if ENGLISH_LANG
     *  Auxiliary stream 3, TRUE - are video, FALSE - not in the video 
     * \else
     *  辅码流3, TRUE-正在录像, FALSE-没在录像
     * \endif
     */
    public boolean					bExtraStream3;

}
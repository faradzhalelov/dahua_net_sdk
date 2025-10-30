package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Input param of interface CLIENT_AttachCrowdDistriMap
 * \else
 * @brief CLIENT_AttachCrowdDistriMap接口输入参数
 * \endif
 */
public class NET_IN_ATTACH_CROWDDISTRI_MAP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel ID
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  callback function of attach crowd distri map
     * \else
     *  订阅人群分布图实时统计信息回调函数
     * \endif
     */
    public CB_fCrowdDistriStream					cbCrowdDistriStream;

    /**
     * \if ENGLISH_LANG
     *  user data
     * \else
     *  用户数据
     * \endif
     */
    public long					dwUser;

}
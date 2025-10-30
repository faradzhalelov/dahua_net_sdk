package com.company.NetSDK;
import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * The filter of evnet FaceComparision
 * \else
 * 目标比对事件过滤器
 * \endif
 */

public class NET_REGISTER_GROUP implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel number, - 1 means subscription by library, channel is not distinguished, and it is a subset of indexes in mobilepushnotification
     * \else
     * 通道号,-1表示按库订阅，不区分通道,为MobilePushNotification 中indexs的子集
     * \endif
     */
    public int                      nIndex;

    /**
     * \if ENGLISH_LANG
     * Number of face database ID sets
     * \else
     * 目标库ID集合的数量
     * \endif
     */
    public int                      nGroupCount;

    /**
     * \if ENGLISH_LANG
     * Target database ID set
     * \else
     * 目标库ID集合
     * \endif
     */
    public byte[][]                      szGroup = new byte[64][64];
}

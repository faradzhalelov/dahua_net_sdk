package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  type of operate card
 * \else
 *  卡片信息操作类型
 * \endif
 */
public class NET_EM_ACCESS_CTL_CARD_SERVICE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  insert, pstInParam = {@link NET_IN_ACCESS_CARD_SERVICE_INSERT} , pstOutParam = {@link NET_OUT_ACCESS_CARD_SERVICE_INSERT}
     * \else
     * 添加, pstInParam = {@link NET_IN_ACCESS_CARD_SERVICE_INSERT} , pstOutParam = {@link NET_OUT_ACCESS_CARD_SERVICE_INSERT}
     * \endif
     */
    public static final int NET_EM_ACCESS_CTL_CARD_SERVICE_INSERT = 0;

    /**
     * \if ENGLISH_LANG
     *  get, pstInParam = {@link NET_IN_ACCESS_CARD_SERVICE_GET} , pstOutParam = {@link NET_OUT_ACCESS_CARD_SERVICE_GET}
     * \else
     * 获取, pstInParam = {@link NET_IN_ACCESS_CARD_SERVICE_GET} , pstOutParam = {@link NET_OUT_ACCESS_CARD_SERVICE_GET}
     * \endif
     */
    public static final int NET_EM_ACCESS_CTL_CARD_SERVICE_GET = 1;

    /**
     * \if ENGLISH_LANG
     *  update, pstInParam = {@link NET_IN_ACCESS_CARD_SERVICE_UPDATE} , pstOutParam = {@link NET_OUT_ACCESS_CARD_SERVICE_UPDATE}
     * \else
     * 更新, pstInParam = {@link NET_IN_ACCESS_CARD_SERVICE_UPDATE} , pstOutParam = {@link NET_OUT_ACCESS_CARD_SERVICE_UPDATE}
     * \endif
     */
    public static final int NET_EM_ACCESS_CTL_CARD_SERVICE_UPDATE = 2;

    /**
     * \if ENGLISH_LANG
     *  remove, pstInParam = {@link NET_IN_ACCESS_CARD_SERVICE_REMOVE} , pstOutParam = {@link NET_OUT_ACCESS_CARD_SERVICE_REMOVE}
     * \else
     * 删除, pstInParam = {@link NET_IN_ACCESS_CARD_SERVICE_REMOVE} , pstOutParam = {@link NET_OUT_ACCESS_CARD_SERVICE_REMOVE}
     * \endif
     */
    public static final int NET_EM_ACCESS_CTL_CARD_SERVICE_REMOVE = 3;

    /**
     * \if ENGLISH_LANG
     *  clear, pstInParam = {@link NET_IN_ACCESS_CARD_SERVICE_CLEAR} , pstOutParam = {@link NET_OUT_ACCESS_CARD_SERVICE_CLEAR}
     * \else
     * 清空, pstInParam = {@link NET_IN_ACCESS_CARD_SERVICE_CLEAR} , pstOutParam = {@link NET_OUT_ACCESS_CARD_SERVICE_CLEAR}
     * \endif
     */
    public static final int NET_EM_ACCESS_CTL_CARD_SERVICE_CLEAR = 4;

}

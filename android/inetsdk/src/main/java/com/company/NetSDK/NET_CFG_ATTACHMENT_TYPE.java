package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mail attachment type
 * \else
 * 邮件附件类型
 * \endif
 */
public class NET_CFG_ATTACHMENT_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Picture attachments
     * \else
     * 图片附件
     * \endif
     */
    public static final int NET_ATTACHMENT_TYPE_PIC = 0;

    /**
     * \if ENGLISH_LANG
     * video attachments
     * \else
     * 视频附件
     * \endif
     */
    public static final int NET_ATTACHMENT_TYPE_VIDEO = 1;

    /**
     * \if ENGLISH_LANG
     * the total number of attachment of types
     * \else
     * 附件类型总数
     * \endif
     */
    public static final int NET_ATTACHMENT_TYPE_NUM = 2;
}

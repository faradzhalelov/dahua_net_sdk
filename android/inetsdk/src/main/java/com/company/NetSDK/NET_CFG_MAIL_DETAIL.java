package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mail details
 * \else
 * 邮件详细内容
 * \endif
 */
public class NET_CFG_MAIL_DETAIL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Attachments type, refer to {@link NET_CFG_ATTACHMENT_TYPE}
     * \else
     * 附件类型, 参考 {@link NET_CFG_ATTACHMENT_TYPE}
     * \endif
     */
    public int		                    emAttachType;

    /**
     * \if ENGLISH_LANG
     * File cap size，unit:kB
     * \else
     * 文件大小上限，单位kB
     * \endif
     */
    public int							nMaxSize;

    /**
     * \if ENGLISH_LANG
     * Maximum recording time length，unit:s，valid for video
     * \else
     * 最大录像时间长度，单位秒，对video有效
     * \endif
     */
    public int							nMaxTimeLength;
}

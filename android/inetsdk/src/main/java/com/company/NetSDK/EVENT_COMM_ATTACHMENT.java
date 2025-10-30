package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * car attachment
 * \else
 * 车辆物件
 * \endif
 */
public class EVENT_COMM_ATTACHMENT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * attachment type, refer to {@link EM_COMM_ATTACHMENT_TYPE}
     * \else
     * 车辆物件类型, 取值参考 {@link EM_COMM_ATTACHMENT_TYPE}
     * \endif
     */
    public int                          emAttachmentType;

    /**
     * \if ENGLISH_LANG
     * coordinate
     * \else
     * 坐标
     * \endif
     */
    public NET_RECT                    stuRect = new NET_RECT();
}

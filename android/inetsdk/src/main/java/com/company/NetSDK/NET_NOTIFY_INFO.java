package com.company.NetSDK;

import java.io.Serializable;
public class NET_NOTIFY_INFO implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * notify type
     * \else
     * 通知类型
     * \endif
     */
    public int					emType;

    /**
     * \if ENGLISH_LANG
     * accept alarm event notify or not
     * \else
     * 是否接受报警事件的推送
     * \endif
     */
    public boolean					bAlarmEvents;

    /**
     * \if ENGLISH_LANG
     * accept system fault event notify or not
     * \else
     * 是否接受故障事件的推送
     * \endif
     */
    public boolean					bSystemEvents;

    /**
     * \if ENGLISH_LANG
     * accept operation event or not
     * \else
     * 是否接受操作事件的推送
     * \endif
     */
    public boolean					bOperationEvents;
}

package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * output arguments of {@link INetSDK#GetMobilePusherEventList}
 * \else
 * {@link INetSDK#GetMobilePusherEventList} 输出参数
 * \endif
 */
public class NET_OUT_GET_MOBILE_PUSHER_EVNET_LIST implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Max event list num
     * \else
     * 事件列表最大的数量
     * \endif
     */
    public int                  nMaxEventlistNum;

    /**
     * \if ENGLISH_LANG
     * Return  event list num
     * \else
     * 返回的事件列表数量
     * \endif
     */
    public int                  nRetEventlistNum;

    /**
     * \if ENGLISH_LANG
     * Event list pointer which needs allocat memory by users
     * \else
     * 事件列表的指针，需要用户申请
     * \endif
     */
    public NET_MOBILE_PUSHER_EVNET_LIST_INFO[]      pMobilePusherEventlist;

    public NET_OUT_GET_MOBILE_PUSHER_EVNET_LIST(int nMaxEventlistNum) {
        this.nMaxEventlistNum = nMaxEventlistNum;
        pMobilePusherEventlist = new NET_MOBILE_PUSHER_EVNET_LIST_INFO[nMaxEventlistNum];
        for(int i=0; i< nMaxEventlistNum; ++i) {
            pMobilePusherEventlist[i] = new NET_MOBILE_PUSHER_EVNET_LIST_INFO();
        }
    }

}

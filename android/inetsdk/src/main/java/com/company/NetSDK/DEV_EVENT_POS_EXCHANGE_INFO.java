package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding to data block description of event type {@link FinalVar#EVENT_IVS_POS_EXCHANGE}(POSExchange events)
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_POS_EXCHANGE} (POS机交易事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_POS_EXCHANGE_INFO implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel ID
     * \else
     * 通道号
     * \endif
     */
    public int                 nChannelID;

    /**
     * \if ENGLISH_LANG
     * event action, 0: Pulse, 1: Start, 2: Stop
     * \else
     * 0:脉冲 1:开始 2:停止
     * \endif
     */
    public int                 nAction;

    /**
     * \if ENGLISH_LANG
     * Event name
     * \else
     * 事件名称
     * \endif
     */
    public byte[]                szName = new byte[FinalVar.SDK_EVENT_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Time stamp(unit:ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double              dbPTS;

    /**
     * \if ENGLISH_LANG
     * Event occurred time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX         UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Event ID
     * \else
     * 事件ID
     * \endif
     */
    public int                 nEventID;

    /**
     * \if ENGLISH_LANG
     * Deal number
     * \else
     * 交易号
     * \endif
     */
    public byte[]				szDealNum = new byte[FinalVar.SDK_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * Card ID
     * \else
     * 卡号
     * \endif
     */
    public byte[]				szCardID = new byte[FinalVar.SDK_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * Item list count
     * \else
     * 商品清单数量
     * \endif
     */
    public int					nItemListCount;

    /**
     * \if ENGLISH_LANG
     * Item List, size is nItemListCount*sizeof(NET_POS_ITEM_INFO)
     * \else
     * 商品清单信息, 大小为nItemListCount*sizeof(NET_POS_ITEM_INFO)
     * \endif
     */
    public NET_POS_ITEM_INFO[]   pstItemList;

    /**
     * \if ENGLISH_LANG
     * Rect
     * \else
     * POS采集内容在视频上的叠加位置,矩形区域
     * \endif
     */
    public NET_RECT			stRect = new NET_RECT();

    /**
     * \if ENGLISH_LANG
     * OSD front color
     * \else
     * OSD前景颜色
     * \endif
     */
    public NET_COLOR_RGBA      stFrontColor = new NET_COLOR_RGBA();

    /**
     * \if ENGLISH_LANG
     * Font Size, unit:px
     * \else
     * 字体大小, 单位px
     * \endif
     */
    public int		nFontSize;

    public DEV_EVENT_POS_EXCHANGE_INFO() {

    }

    public DEV_EVENT_POS_EXCHANGE_INFO(int nItemListCount) {
        this();

        this.nItemListCount = nItemListCount;
        pstItemList = new NET_POS_ITEM_INFO[nItemListCount];
        for(int i = 0; i < nItemListCount; i++) {
            pstItemList[i] = new NET_POS_ITEM_INFO();
        }
    }
}

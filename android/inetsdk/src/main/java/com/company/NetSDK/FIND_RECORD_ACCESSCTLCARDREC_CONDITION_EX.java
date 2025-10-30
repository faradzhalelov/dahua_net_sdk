package com.company.NetSDK;
import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Query Conditions Of Access ctl card Records
 * \else
 * 门禁出入记录查询条件
 * \endif
 */
public class FIND_RECORD_ACCESSCTLCARDREC_CONDITION_EX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Enable card search
     * \else
     * 启用卡号查询
     * \endif
     */
    public boolean               bCardNoEnable;

    /**
     * \if ENGLISH_LANG
     * Card No
     * \else
     * 卡号
     * \endif
     */
    public byte                 szCardNo[] = new byte[FinalVar.SDK_MAX_CARDNO_LEN];

    /**
     * \if ENGLISH_LANG
     * Enable search by period
     * \else
     * 启用时间段查询
     * \endif
     */
    public boolean              bTimeEnable;

    /**
     * \if ENGLISH_LANG
     * Start time
     * \else
     * 起始时间
     * \endif
     */
    public NET_TIME              stStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * End time
     * \else
     * 结束时间
     * \endif
     */
    public NET_TIME              stEndTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * Order num
     * \else
     * 规则数
     * \endif
     */
    public int                   nOrderNum;

    public FIND_RECORD_ACCESSCTLCARDREC_ORDER       stuOrders[] = new FIND_RECORD_ACCESSCTLCARDREC_ORDER[FinalVar.MAX_ORDER_NUMBER];

    public FIND_RECORD_ACCESSCTLCARDREC_CONDITION_EX() {
        for (int i = 0; i < FinalVar.MAX_ORDER_NUMBER; i++) {
            stuOrders[i] = new FIND_RECORD_ACCESSCTLCARDREC_ORDER();
        }
    }

}

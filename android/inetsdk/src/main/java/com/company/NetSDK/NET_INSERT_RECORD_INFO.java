package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Increase the record operation
 * \else
 * @brief 增加记录操作
 * \endif
 */
public class NET_INSERT_RECORD_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Record the content information,the space application by the user,apply to sizeof(NET_TRAFFIC_LIST_RECORD)                    
     * \else
     *  记录内容信息,由用户分配内存，大小为sizeof(NET_TRAFFIC_LIST_RECORD)             
     * \endif
     */
    public NET_TRAFFIC_LIST_RECORD					pRecordInfo = new NET_TRAFFIC_LIST_RECORD();

}
package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * filter rules
 * \else
 * 抓包过滤规则
 * \endif
 */
public class NET_SNIFFER_FILTER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * the valid num of stuElemets
     * \else
     * 有效的stElementsge个数
     * \endif
     */
    public int                 nMaxElemet;

    /**
     * \if ENGLISH_LANG
     * filter elements
     * \else
     * 过滤五元组的数组
     * \endif
     */
    public NET_SNIFFER_FILTER_ELEMENT[] stuElemets = new NET_SNIFFER_FILTER_ELEMENT[8];
    /**
     *
     */
    /**
     * \if ENGLISH_LANG
     * 0: use all the section of NET_SNIFFER_FILTER_ELEMENT ; 1: use part of of NET_SNIFFER_FILTER_ELEMENT
     * \else
     * 0: 取上述全部五元组的或集作为过滤条件;
     * 1: 取上述五元组或非作为过滤条件。
     * \endif
     */
    public int                 nFilterType;

    public NET_SNIFFER_FILTER() {
        for (int i = 0; i < 8; i++) {
            stuElemets[i] = new NET_SNIFFER_FILTER_ELEMENT();
        }
    }
}

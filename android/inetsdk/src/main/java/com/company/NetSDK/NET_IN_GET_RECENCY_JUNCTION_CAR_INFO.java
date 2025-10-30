package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input parameter, the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_RECENCY_JNNCTION_CAR_INFO}
 * \else
 * 输入参数, 对应接口{@link INetSDK#QueryDevInfo},对应命令 {@link FinalVar#NET_QUERY_RECENCY_JNNCTION_CAR_INFO}
 * \endif
 */
public class NET_IN_GET_RECENCY_JUNCTION_CAR_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * snapshot channel no.
	 * \else
	 * 抓拍通道号
	 * \endif
	 */
    public int                  nChannel;
    
    /**
	 * \if ENGLISH_LANG
	 * get vehicle info type，newest or latest, refer to {@link NET_RECENCY_CAR_INFO}
	 * \else
	 * 获取车辆信息的类型，最新的还是最旧的, 取值参考 {@link NET_RECENCY_CAR_INFO}
	 * \endif
	 */
    public int    				emRecencyType;
    
    /**
	 * \if ENGLISH_LANG
	 * no. vehicle info, from 1，if it is 0, it alsomeans no. 1
	 * \else
	 * 第几个车辆信息,从1开始，如果为0也表示第1个
	 * \endif
	 */
    public int                  nIndex;
}

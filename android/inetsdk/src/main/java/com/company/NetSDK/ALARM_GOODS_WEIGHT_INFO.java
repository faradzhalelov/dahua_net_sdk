package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of good weight, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_GOODS_WEIGHT}
 * \else
 * 车载货重报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_GOODS_WEIGHT}
 * \endif
 */
public class ALARM_GOODS_WEIGHT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0-start, 1-stop
	 * \else
	 * 0-开始, 1-停止
	 * \endif
	 */
	public int          nAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0-greater than dwMaxGoodsWeight, 1-less than dwMinGoodsWeight, 2-the change greater than dwAlarmWeight
	 * \else
	 * 0-大于最大货重, 1-小于最小货重, 2-货重变化超过报警阈值
	 * \endif
	 */
	public int          nAlarmType;
	
 	/**
	 * \if ENGLISH_LANG
	 * good weight(kg)
	 * \else
	 * 当前货重(kg)
	 * \endif
	 */
	public int        dwGoodsWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * self weight(kg)
	 * \else
	 * 自重(kg)
	 * \endif
	 */
	public int        dwSelfWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * total weight(kg)
	 * \else
	 * 总重(kg)
	 * \endif
	 */
	public int        dwTotalWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * standard weight(kg)
	 * \else
	 * 核定货重(kg)
	 * \endif
	 */
	public int        dwStandardWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * weight scale
	 * \else
	 * 货重比例
	 * \endif
	 */
	public int        dwWeightScale;
	
 	/**
	 * \if ENGLISH_LANG
	 * the max(kg)
	 * \else
	 * 最大货重(kg)
	 * \endif
	 */
	public int        dwMaxGoodsWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * the min(kg)
	 * \else
	 * 最小货重(kg)
	 * \endif
	 */
	public int        dwMinGoodsWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * alarm of threshold(kg)
	 * \else
	 * 报警阈值(kg)
	 * \endif
	 */
	public int        dwAlarmWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * whight change when gather(kg)
	 * \else
	 * 采集时间间隔内货重变化(kg)
	 * \endif
	 */
	public int          nWeightChange;
	
 	/**
	 * \if ENGLISH_LANG
	 * gather time(s)
	 * \else
	 * 静止采集时间(s)
	 * \endif
	 */
	public int          nCheckTime;
}

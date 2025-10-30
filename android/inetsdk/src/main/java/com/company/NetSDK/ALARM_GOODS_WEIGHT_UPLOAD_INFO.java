package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * goods weight upload, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_GOODS_WEIGHT_UPLOAD}
 * \else
 * 车载货重信息上传, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_GOODS_WEIGHT_UPLOAD}
 * \endif
 */
public class ALARM_GOODS_WEIGHT_UPLOAD_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * goods weight(kg)
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
}

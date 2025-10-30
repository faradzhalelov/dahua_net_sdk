package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get active defence area, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_ACTIVATEDDEFENCEAREA}
 * \else
 * 获取激活防区, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_ACTIVATEDDEFENCEAREA}
 * \endif
 */
public class NET_ACTIVATEDDEFENCEAREA implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * search local alarm input channel quantity,  need user to specify
	 * \else
	 * 查询本地报警输入通道激活个数，需用户指定个数
	 * \endif
	 */
	public int nAlarmInCount;

	/**
	 * \if ENGLISH_LANG
	 * local alarm input channel actual activation quantity
	 * \else
	 * 本地报警输入通道实际激活个数
	 * \endif
	 */
	public int nRetAlarmInCount;
	
	/**
	 * \if ENGLISH_LANG
	 * local alarm input channel activated info
	 * \else
	 * 本地报警输入通道激活信息
	 * \endif
	 */
	public NET_ACTIVATEDDEFENCEAREA_INFO pstuAlarmInDefenceAreaInfo[];

	/**
	 * \if ENGLISH_LANG
	 * search extension module alarm input quantity. User specify
	 * \else
	 * 查询扩展模块报警输入通道个数，需用户指定个数
	 * \endif
	 */
	public int nExAlarmInCount;
	
	/**
	 * \if ENGLISH_LANG
	 * extension  module alarm input channel actual activation quantity
	 * \else
	 * 扩展模块报警输入通道实际激活个数
	 * \endif
	 */
	public int nRetExAlarmInCount;
	
	/**
	 * \if ENGLISH_LANG
	 * extend alarm input channel activated info
	 * \else
	 * 扩展报警输入通道激活信息
	 * \endif
	 */
	public NET_ACTIVATEDDEFENCEAREA_INFO pstuExAlarmInDefenceAreaInfo[];
}

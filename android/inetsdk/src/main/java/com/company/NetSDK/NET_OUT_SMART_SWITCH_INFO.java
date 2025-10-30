package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Query smart switch information output parameter, the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_SMART_SWITCH_INFO}
* \else
* 查询智能插座信息出参, 对应接口{@link INetSDK#QueryDevInfo},对应命令 {@link FinalVar#NET_QUERY_SMART_SWITCH_INFO}
* \endif
*/
public class NET_OUT_SMART_SWITCH_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * switch state , TRUE - on, FALSE - off
	 * \else
	 * 开关状态, TRUE 开, FALSE 关
	 * \endif
	 */
	public boolean                 bSwitchEable;                   
	
	 /**
	 * \if ENGLISH_LANG
	 * current power, unit: W 
	 * \else
	 * 及时功率, unit: W 
	 * \endif
	 */
	public double                  dbCurrentPower;                 
	
	 /**
	 * \if ENGLISH_LANG
	 * history power used, unit: kw/h
	 * \else
	 * 历史用电量, unit: kw/h
	 * \endif
	 */
	public double                  dbHistoryPowerUsed;             
	
	 /**
	 * \if ENGLISH_LANG
	 * today power used, unit: kw/h
	 * \else
	 * 当天用电量, unit: kw/h
	 * \endif
	 */
	public double                  dbTodayPowerUsed;              
	
	 /**
	 * \if ENGLISH_LANG
	 * month power userd, unit: kw/h
	 * \else
	 * 每月用电量, unit: kw/h
	 * \endif
	 */
	public double[]                dbMonthPowerUsed = new double[FinalVar.NET_MAX_MONTH_NUM];
}

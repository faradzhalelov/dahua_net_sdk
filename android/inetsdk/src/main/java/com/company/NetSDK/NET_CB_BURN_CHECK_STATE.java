package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link CB_fBurnCheckCallBack} parameter
 * \else
 * {@link CB_fBurnCheckCallBack} 参数
 * \endif
 */
public class NET_CB_BURN_CHECK_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Info Type
	 * "Checking": Calibrating
	 * "CheckResult": Result
	 * \else
	 * 消息类型
	 * "Checking": 校验中
	 * "CheckResult": 校验结果	
	 * \endif
	 */
	public char             	szType[] = new char[32];
																					 
	/**
	 * \if ENGLISH_LANG
	 * Result, for "CheckResult", TRUE-successful, FALSE-failed
	 * \else
	 * 校验结果, 用于"CheckResult", TRUE-成功, FALSE-失败
	 * \endif
	 */
	public boolean				bCheckResult;
	
	/**
	 * \if ENGLISH_LANG
	 * Progress, for "Checking", percentage, 0~100
	 * \else
	 * 校验进度, 用于"Checking", 百分比, 0~100
	 * \endif
	 */
	public byte				byProgress;
}

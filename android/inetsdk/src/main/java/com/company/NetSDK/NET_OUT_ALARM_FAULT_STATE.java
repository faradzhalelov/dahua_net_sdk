package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm Failure Status, Output Parameter
 * \else
 * 报警故障状态, 输出参数
 * \endif
 */
public class NET_OUT_ALARM_FAULT_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * 0: 未知, 1: 正常, 2:故障
	 * \endif
	 */
	public int             nConnectFaultState;

	/**
	 * \if ENGLISH_LANG
	 * Bell valid number
	 * \else
	 * 警号有效个数
	 * \endif
	 */
	public int             nBell;

	/**
	 * \if ENGLISH_LANG
	 * Bell failure status info 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * 警号故障状态信息 0: 未知, 1: 正常, 2:故障
	 * \endif
	 */
	public int             anBellState[] = new int[FinalVar.SDK_MAX_BELL_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Keyboard failure valid number
	 * \else
	 * 键盘故障有效个数
	 * \endif
	 */
	public int             nFaultKeyboard;

	/**
	 * \if ENGLISH_LANG
	 * Keyboard failure info 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * 键盘故障信息 0: 未知, 1: 正常, 2:故障
	 * \endif
	 */
	public int             anFaultKeyboard[] = new int[FinalVar.SDK_MAX_KEYBOARD_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Keyboard valid vandal-proof number
	 * \else
	 * 键盘有效防拆个数
	 * \endif
	 */
	public int             nTamperKeyboard;

	/**
	 * \if ENGLISH_LANG
	 * Keyboard vandal-proof info 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * 键盘防拆信息 0: 未知, 1: 正常, 2:故障
	 * \endif
	 */
	public int             anTamperKeyboard[] = new int[FinalVar.SDK_MAX_KEYBOARD_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Sensor valid short circuit number
	 * \else
	 * 传感器有效短路个数
	 * \endif
	 */
	public int             nShortOutSensor;

	/**
	 * \if ENGLISH_LANG
	 * Sensor short circuit info 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * 传感器短路信息 0: 未知, 1: 正常, 2:故障
	 * \endif
	 */
	public int             anShortOutSensor[] = new int[FinalVar.SDK_MAX_ALARMIN];

	/**
	 * \if ENGLISH_LANG
	 * Sensor valid vandal-proof number
	 * \else
	 * 传感器有效防拆个数
	 * \endif
	 */
	public int             nTamperSensor;

	/**
	 * \if ENGLISH_LANG
	 * Sensor vandal-proof info 0: Unknown, 1: Normal, 2:Failure
	 * \else
	 * 传感器防拆信息 0: 未知, 1: 正常, 2:故障
	 * \endif
	 */
	public int             anTamperSensor[] = new int[FinalVar.SDK_MAX_ALARMIN];
}
                                     

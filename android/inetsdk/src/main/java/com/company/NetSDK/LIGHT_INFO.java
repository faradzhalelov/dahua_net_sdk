package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of traffic light
 * \else
 * 交通灯故障报警
 * \endif
 */

public class LIGHT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * direction: 1-left,2-right,3-straight , 4-turn round
	 * \else
	 * 交通灯方向: 1-左行，2-右行，3-直行, 4-掉头
	 * \endif
	 */
	public byte               byDirection;
	
 	/**
	 * \if ENGLISH_LANG
	 * light state: 1-fault,2-normal
	 * \else
	 * 交通灯状态: 1-故障，2-正常
	 * \endif
	 */
	public byte               byState;
}

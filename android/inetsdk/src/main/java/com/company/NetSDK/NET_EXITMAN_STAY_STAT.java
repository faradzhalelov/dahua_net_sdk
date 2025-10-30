package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The stay time of the peoples left
 * \else
 * 离开人员的滞留时间信息
 * \endif
 */
public class NET_EXITMAN_STAY_STAT implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Time to enter the region
	 * \else
	 * 人员进入区域时间
	 * \endif
	 */
	public NET_TIME	stuEnterTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * Time to exit the region
	 * \else
	 * 人员离开区域时间
	 * \endif
	 */
	public NET_TIME	stuExitTime = new NET_TIME();
}

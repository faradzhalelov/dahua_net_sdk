package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#SetAlarmRegionInfo} emType is NET_EM_SET_ALARMREGION_INFO_ARMMODE output param
 * \else
 * 设置布防模式 输出参数。此时{@link INetSDK#SetAlarmRegionInfo}的emType参数为NET_EM_SET_ALARMREGION_INFO_ARMMODE
 * \endif
 */
public class NET_OUT_SET_ALARMMODE implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * result 0:succeed 1:failed
	 * \else
	 * 布防结果 0:成功 1:失败
	 * \endif
	 */
	public int                   nArmResult;

	/**
	 * \if ENGLISH_LANG
	 * failed area number
	 * \else
	 * 布防失败的区域个数
	 * \endif
	 */
	public int                   nFailedAreaRet;

	/**
	 * \if ENGLISH_LANG
	 * failed detail
	 * \else
	 * 布防失败的细节
	 * \endif
	 */
	public ARM_FAILED_DETAIL     stuFailedDetail[] = new ARM_FAILED_DETAIL[FinalVar.MAX_AREA_NUMBER];

	public NET_OUT_SET_ALARMMODE() {
		for (int i = 0; i < stuFailedDetail.length; ++i) {
			stuFailedDetail[i] = new ARM_FAILED_DETAIL();
		}
	}
}

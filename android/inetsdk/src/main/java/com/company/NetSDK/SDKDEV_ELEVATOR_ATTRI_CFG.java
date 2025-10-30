package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Lift running parameter configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_ELEVATOR_ATTRI_CFG}
 * \else
 * 电梯运行参数配置, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_ELEVATOR_ATTRI_CFG}
 * \endif
 */
public class SDKDEV_ELEVATOR_ATTRI_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Max floor. Min is 2.
	 * \else
	 * 最大楼层 最小2
	 * \endif
	 */
	public int    nMAXFloorNum;

	/**
	 * \if ENGLISH_LANG
	 * Stay verification time ranges from 5-60. It regards as stop current floor if keep this time period.
	 * \else
	 * 停靠判断时间,5-60；保持此时间长度认为是电梯停靠此楼层。
	 * \endif
	 */
	public int    nFloorDelayTime;

	/**
	 * \if ENGLISH_LANG
	 * The max time for the lift to go up/down a floor. It regars the lift is malfunction if the time is out of the threshold. The lift stopsa between two floors.
	 * \else
	 * 电梯上行或下行经过一层的最大时间，如果超过此时间，则认为电梯故障，轿厢停止了两层之间。
	 * \endif
	 */
	public int    nIntervalTime;
}

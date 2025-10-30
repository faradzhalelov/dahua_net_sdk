package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Normal COnfiguration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_DEV_GENERRAL}
 * \else
 * 普通配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_DEV_GENERRAL}
 * \endif
 */
public class CFG_DEV_DISPOSITION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 *  Device number,0~998
	 * \else
	 *  本机编号，主要用于遥控器区分不同设备	0~998
	 * \endif
	 */
	public int					nLocalNo;

	/**
	 * \if ENGLISH_LANG
	 *  Machine name
	 * \else
	 *  机器名称或编号
	 * \endif
	 */
	public byte					szMachineName[] = new byte[256];

	/**
	 * \if ENGLISH_LANG
	 *  Machine instal address,such as road number
	 * \else
	 *  机器部署地点即道路编码
	 * \endif
	 */
	public byte					szMachineAddress[] = new byte[256];

	/**
	 * \if ENGLISH_LANG
	 *  Machine group, it instal as null,
	 * \else
	 *  机器分组或叫设备所属单位	默认为空，用户可以将不同的设备编为一组，便于管理，可重复。
	 * \endif
	 */
	public byte					szMachineGroup[] = new byte[256];

	/**
	 * \if ENGLISH_LANG
	 *  The machine serial number exclusive
	 * \else
	 *  机器编号, 联网平台内唯一
	 * \endif
	 */
	public byte					szMachineID[] = new byte[64];

	/**
	 * \if ENGLISH_LANG
	 *  logon failed attempt times
	 * \else
	 *  登陆失败可尝试次数
	 * \endif
	 */
	public int					nLockLoginTimes;

	/**
	 * \if ENGLISH_LANG
	 *  login failed lock time
	 * \else
	 *  登陆失败锁定时间
	 * \endif
	 */
	public int					nLoginFailLockTime;

	/**
	 * \if ENGLISH_LANG
	 *  logon failed attempt times enable
	 * \else
	 *  登陆失败可尝试次数使能
	 * \endif
	 */
	public boolean					bLockLoginEnable;

	/**
	 * \if ENGLISH_LANG
	 *  activation time
	 * \else
	 *  启动时间
	 * \endif
	 */
	public CFG_DATA_TIME					stuActivationTime = new CFG_DATA_TIME();

	/**
	 * \if ENGLISH_LANG
	 *  Zeroing cycle, if the number of login attempts within the specified time does not exceed the number of attempts, the number of attempts will be reset to zero
	 * \else
	 *  清零周期，如果规定时间内登陆次数未超过可尝试次数，尝试次数清零
	 * \endif
	 */
	public int					nCheckDuration;

	/**
	 * \if ENGLISH_LANG
	 *  Whether to use local GUI locking policy
	 * \else
	 *  是否使用本地GUI锁定策略
	 * \endif
	 */
	public boolean					bUseLocalPolicy;

	/**
	 * \if ENGLISH_LANG
	 *  Local GUI locking policy
	 * \else
	 *  本地GUI锁定策略
	 * \endif
	 */
	public CFG_LOCAL_POLICY_INFO					stuLocalPolicy = new CFG_LOCAL_POLICY_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  Machine name
	 * \else
	 *  机器名称或编号
	 * \endif
	 */
	public byte					szMachineName1[] = new byte[256];

}
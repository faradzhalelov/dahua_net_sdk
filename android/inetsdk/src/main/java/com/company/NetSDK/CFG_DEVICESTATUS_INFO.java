package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device Status Info, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_SUBDEVICE}
 * the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_DEVICESTATUS}
 * \else
 * 设备状态信息, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_SUBDEVICE}
 * 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_DEVICESTATUS}
 * \endif
 */
public class CFG_DEVICESTATUS_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Power Num 
	 * \else
	 * 电源个数
	 * \endif
	 */
	public int			nPowerNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Power Status,1:Normal 2:Abnormal 3:Unknowm 
	 * \else
	 * 电源状态，1:正常 2:异常 3:未知
	 * \endif
	 */
	public byte[] 		byPowerStatuc = new byte[FinalVar.MAX_POWER_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * CPU Number 
	 * \else
	 * CPU个数
	 * \endif
	 */
	public int			nCPUNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * CPU Temperature 
	 * \else
	 * CPU温度
	 * \endif
	 */
	public int[]		nCPUTemperature = new int[FinalVar.MAX_CPU_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * Fan Number
	 * \else
	 * 风扇个数
	 * \endif
	 */
	public int			nFanNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Fan Rotato Speed 
	 * \else
	 * 风扇转速
	 * \endif
	 */
	public int[]		nRotatoSpeed = new int[FinalVar.MAX_FUN_NUM];
}

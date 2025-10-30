package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Code info
 * \else
 * 对码信息
 * \endif
 */
public class NET_CODEID_INFO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless ID
	 * \else
	 * 无线ID号
	 * \endif
	 */
	public long	nWirelessId;  
	
	/**
	 * \if ENGLISH_LANG
	 * The device type of wireless, refer to {@link NET_WIRELESS_DEVICE_TYPE}
	 * \else
	 * 无线设备类型, 取值参考 {@link NET_WIRELESS_DEVICE_TYPE}
	 * \endif
	 */
	public int	emType;
	
	/**
	 * \if ENGLISH_LANG
	 * User name
	 * \else
	 * 用户名
	 * \endif
	 */
	public byte[]	szName = new byte[FinalVar.SDK_USER_NAME_LENGTH];        
	
	/**
	 * \if ENGLISH_LANG
	 * If enable the device
	 * \else
	 * 是否启用了此设备
	 * \endif
	 */
	public boolean bEnable;                            
	
	/**
	 * \if ENGLISH_LANG
	 * Custom name
	 * \else
	 * 自定义名称
	 * \endif
	 */
	public byte[] szCustomName = new byte[FinalVar.SDK_COMMON_STRING_64];  
	
	/**
	 * \if ENGLISH_LANG
	 * It only to be valid when emType is {@link NET_WIRELESS_DEVICE_TYPE#NET_WIRELESS_DEVICE_TYPE_DEFENCE}
	 * \else 
	 * 无线防区的alarm通道号, Alarm配置的下标,只有 emType 为 {@link NET_WIRELESS_DEVICE_TYPE#NET_WIRELESS_DEVICE_TYPE_DEFENCE} 时此字段才有效。
	 * \endif
	 */
	public int	nChannel;                           
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless Device Mode, refer to {@link EM_WIRELESS_DEVICE_MODE}
	 * \else
	 * 无线设备工作模式, 取值参考 {@link EM_WIRELESS_DEVICE_MODE}
	 * \endif
	 */
	public int	emMode;                            
	
	/**
	 * \if ENGLISH_LANG
	 * The sense method, refer to {@link EM_CODEID_SENSE_METHOD_TYPE}
	 * \else
	 * 传感器方式, 取值参考 {@link EM_CODEID_SENSE_METHOD_TYPE}
	 * \endif
	 */
	public int	emSenseMethod;                      
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless Device SN
	 * \else
	 * 无线设备序列号
	 * \endif
	 */
	public byte[] szSerialNumber = new byte[FinalVar.SDK_WIRELESS_DEVICE_SERIAL_NUMBER_MAX_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Task ID
	 * \else
	 * 任务ID
	 * \endif
	 */
	public int                       nTaskID;

	/**
	 * \if ENGLISH_LANG
	 * Room number of intelligent lock
	 * \else
	 * 智能锁房间号
	 * \endif
	 */
	public byte                        szRoomNo[] = new byte[64];

	/**
	 * \if ENGLISH_LANG
	 * information number: 0 indicates unsupported fingerprints
	 * \else
	 * 信息数量:为0时表示不支持信息
	 * \endif
	 */
	public int                       nMaxFingerprints;

	/**
	 * \if ENGLISH_LANG
	 * cards number: 0 indicates unsupported cards
	 * \else
	 * 卡片数量:为0时表示不支持卡片
	 * \endif
	 */
	public int                       nMaxCards;

	/**
	 * \if ENGLISH_LANG
	 * password number: 0 indicates unsupported password
	 * \else
	 * 密码数量:为0时表示不支持密码
	 * \endif
	 */
	public int                       nMaxPwd;
}

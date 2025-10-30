package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * External device info, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_EXTERNAL_DEVICE}
 * \else
 * 外接设备信息, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_EXTERNAL_DEVICE}
 * \endif
 */
public class NET_EXTERNAL_DEVICE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * External device type, refer to {@link NET_EXT_DEV_TYPE}
	 * \else
	 * 外设类型, 取值参考 {@link NET_EXT_DEV_TYPE}
	 * \endif
	 */
	public int			   emType;
	
	/**
	 * \if ENGLISH_LANG
	 * External device ID.
	 * \else
	 * 设备ID，唯一编号
	 * \endif
	 */
	public byte				szDevID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * IR button name
	 * \else
	 * 设备名称
	 * \endif
	 */
	public byte				szDevName[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];
}

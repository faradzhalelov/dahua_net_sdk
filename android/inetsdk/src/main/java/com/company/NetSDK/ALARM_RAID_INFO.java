package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Query RAID state, 对应接口 {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_RAID_INFO}
 * \else
 * 查询RAID状态, the corresponding interface {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_RAID_INFO}
 * \endif
 */
public class ALARM_RAID_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * RAID number
	 * \else
	 * 上报的RAID个数   
	 * \endif
	 */
	public int              nRaidNumber;
	
 	/**
	 * \if ENGLISH_LANG
	 * RAID info
	 * \else
	 * 异常的RAID信息
	 * \endif
	 */
	public RAID_STATE_INFO  stuRaidInfo[] = new RAID_STATE_INFO[FinalVar.SDK_MAX_RAID_NUM];
	
	public ALARM_RAID_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_RAID_NUM; i++) {
			stuRaidInfo[i] = new RAID_STATE_INFO();
		}
	}
}

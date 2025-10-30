package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record-storage group corresponding info, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_RECORDTOGROUP}
 * \else
 * 录像-存储组 对应信息, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_RECORDTOGROUP}
 * \endif
 */
public class CFG_RECORDTOGROUP_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel Id 
	 * \else
	 * 通道号
	 * \endif
	 */
	public int				nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * 使能  
	 * \endif
	 */
	public boolean			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Storage Group Name, Read-only 
	 * \else
	 * 存储组名称, 只读
	 * \endif
	 */
	public byte[]			szGroupName = new byte[FinalVar.MAX_STORAGEGROUPNAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Storage GroupIndex(1~max group, 0 no group) 
	 * \else
	 * 存储组序号(1~最大盘组, 0则表示无对应盘组)，通过此参数与CFG_STORAGE_GROUP_INFO关联
	 * \endif
	 */
	public int				nGroupIndex;
}

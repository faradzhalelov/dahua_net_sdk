package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * RAID info
 * \else
 * RAID 信息
 * \endif
 */
public class SDK_STORAGE_RAID implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * level
	 * \else
	 * 等级
	 * \endif
	 */
    public int                 nLevel;                                     
    
	/**
	 * \if ENGLISH_LANG
	 * RAID state combination SDK_RAID_STATE_ACTIVE | SDK_RAID_STATE_DEGRADED
	 * \else
	 * RAID状态组合, 如 SDK_RAID_STATE_ACTIVE | SDK_RAID_STATE_DEGRADED
	 * \endif
	 */
    public int                 nState;                              
    
	/**
	 * \if ENGLISH_LANG
	 * member amount
	 * \else
	 * 成员数量
	 * \endif
	 */
    public int                 nMemberNum;                                 
    
	/**
	 * \if ENGLISH_LANG
	 * RAID member
	 * \else
	 * RAID成员
	 * \endif
	 */
    public byte[][]            szMembers = new byte[FinalVar.SDK_MAX_MEMBER_PER_RAID][FinalVar.SDK_STORAGE_NAME_LEN];   
    
	/**
	 * \if ENGLISH_LANG
	 * Sync percentage, 0~100, RAID status has"Recovering" or "Resyncing" valid
	 * \else
	 * 等同步百分比, 0~100, RAID状态中有"Recovering"或"Resyncing"时有效
	 * \endif
	 */
    public float               fRecoverPercent;                            
    
	/**
	 * \if ENGLISH_LANG
	 * Sync speed, unit MBps, RAID status has"Recovering" or "Resyncing" valid
	 * \else
	 * 同步速度, 单位MBps, RAID状态中有"Recovering"或"Resyncing"时有效
	 * \endif
	 */
    public float               fRecoverMBps;                               
    
	/**
	 * \if ENGLISH_LANG
	 * Sync remaining time, unit minute, RAID status has "Recovering" or "Resyncing" valid
	 * \else
	 * 同步剩余时间, 单位分钟, RAID状态中有"Recovering"或"Resyncing"时有效
	 * \endif
	 */
    public float               fRecoverTimeRemain;                         
    
	/**
	 * \if ENGLISH_LANG
	 * RAID member info
	 * \else
	 * RAID成员信息
	 * \endif
	 */
    public NET_RAID_MEMBER_INFO[]  stuMemberInfos = new NET_RAID_MEMBER_INFO[FinalVar.SDK_MAX_MEMBER_PER_RAID];    
    
    public SDK_STORAGE_RAID() {
    	for(int i = 0; i < FinalVar.SDK_MAX_MEMBER_PER_RAID; i++) {
    		stuMemberInfos[i] = new NET_RAID_MEMBER_INFO();
    	}
    }
}

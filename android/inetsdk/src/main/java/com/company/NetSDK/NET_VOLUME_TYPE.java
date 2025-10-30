package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * volume type enumeration
 * \else
 * 卷类型枚举
 * \endif
 */
public class NET_VOLUME_TYPE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * all volume
	 * \else
	 * 所有卷
	 * \endif
	 */
    public static final int VOLUME_TYPE_ALL 	     = 0;     
    
	/**
	 * \if ENGLISH_LANG
	 * physical volume
	 * \else
	 * 物理卷
	 * \endif
	 */
    public static final int VOLUME_TYPE_PHYSICAL     = 1;     
    
	/**
	 * \if ENGLISH_LANG
	 * Raid volume
	 * \else
	 * Raid卷
	 * \endif
	 */
    public static final int VOLUME_TYPE_RAID     	 = 2;     
    
	/**
	 * \if ENGLISH_LANG
	 * VG virtual volume
	 * \else
	 * VG虚拟卷组
	 * \endif
	 */
    public static final int VOLUME_TYPE_VOLUME_GROUP = 3;     
    
	/**
	 * \if ENGLISH_LANG
	 * iSCSI volume
	 * \else
	 * iSCSI卷
	 * \endif
	 */
    public static final int VOLUME_TYPE_ISCSI        = 4;      
    
	/**
	 * \if ENGLISH_LANG
	 * independent physical volume?ê?§this physical volume?ê?is not added into?ê? RAID?ê?virtual volume group?ê?
	 * \else
	 * 独立物理卷（这个物理盘,没有加入到, RAID,虚拟卷组等等组中）
	 * \endif
	 */
    public static final int VOLUME_TYPE_INVIDUAL_PHY = 5;     
    
	/**
	 * \if ENGLISH_LANG
	 * global hot spare volume
	 * \else
	 * 全局热备卷
	 * \endif
	 */
    public static final int VOLUME_TYPE_GLOBAL_SPARE = 6;      
    
    public static final int VOLUME_TYPE_MAX          = 7;
}

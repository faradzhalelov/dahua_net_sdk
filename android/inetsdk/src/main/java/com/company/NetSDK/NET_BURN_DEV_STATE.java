package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  burning device status
 * \else
 * 刻录设备状态
 * \endif
 */

public class NET_BURN_DEV_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ROM device ID
	 * \else
	 * 光驱设备ID
	 * \endif
	 */
	public  int		     nDeviceID;
	
	/**
	 * \if ENGLISH_LANG
	 * ROM devicename
	 * \else
	 * 光驱设备名称
	 * \endif
	 */
	public  byte		 szDevName[]    =  new byte[FinalVar.SDK_BURNING_DEV_NAMELEN];
	
	/**
	 * \if ENGLISH_LANG
	 * ROM total capacity, uni KB
	 * \else
	 * 光驱总容量, 单位KB
	 * \endif
	 */
    public	int           dwTotalSpace;
    
	/**
	 * \if ENGLISH_LANG
	 * ROM remaining capacity, unit KB
	 * \else
	 * 光驱剩余容量, 单位KB
	 * \endif
	 */
    public int            dwRemainSpace;

}

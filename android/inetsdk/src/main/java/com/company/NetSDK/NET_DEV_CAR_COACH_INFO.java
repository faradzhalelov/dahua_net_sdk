package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Railway record config
 * \else
 * 铁路记录信息
 * \endif
 */
public class NET_DEV_CAR_COACH_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * car no
	 * \else
	 * 车辆号
	 * \endif
	 */
    public byte[]                    szCarNo = new byte[FinalVar.MAX_CARNO_LEN];              
    
	/**
	 * \if ENGLISH_LANG
	 * coach no
	 * \else
	 * 车厢号
	 * \endif
	 */
    public byte[]                    szCoachNo = new byte[FinalVar.MAX_COACHNO_LEN];          
}

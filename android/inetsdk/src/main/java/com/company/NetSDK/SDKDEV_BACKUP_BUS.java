package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Interface type of backup device
 * \else
 * 备份设备接口类型
 * \endif
 */
public class SDKDEV_BACKUP_BUS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	 /**
  	 * \if ENGLISH_LANG
  	 * USB interface
  	 * \else
  	 * USB接口
  	 * \endif
  	 */
    public static final int              BB_USB = 0; 
    /**
     * \if ENGLISH_LANG
     * 1394 interface
     * \else
   	 * 1394接口
   	 * \endif
   	 */ 		
    public static final int              BB_1394 = 1;                       
    /**
     * \if ENGLISH_LANG
     *IDE interface
     * \else
   	 * IDE接口
   	 * \endif
   	 */ 
    public static final int              BB_IDE  = 2;                                
    /**
     * \if ENGLISH_LANG
     * ESATA interface
     * \else
   	 * ESATA接口
   	 * \endif
   	 */ 
    public static final int              BB_ESATA = 3;                              
}

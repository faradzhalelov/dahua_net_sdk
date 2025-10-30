package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Fish eye installation mode 
* \else
* 鱼眼安装模式
* \endif
*/
public class NET_FISHEYE_MOUNT_MODE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * unknown mode 
	 * \else
	 * 未知模式  
	 * \endif
	 */
    public  static final int NET_FISHEYE_MOUNT_MODE_UNKOWN = 0;                              
    
	 /**
	 * \if ENGLISH_LANG
	 * ceiling mode 
	 * \else
	 * 顶装模式 
	 * \endif
	 */
    public  static final int NET_FISHEYE_MOUNT_MODE_CEIL = 1;                         
    
	 /**
	 * \if ENGLISH_LANG
	 * wall mount mode  
	 * \else
	 * 壁装模式  
	 * \endif
	 */
    public  static final int NET_FISHEYE_MOUNT_MODE_WALL = 2;                          
    
	 /**
	 * \if ENGLISH_LANG
	 * ground mode  
	 * \else
	 * 地装模式 
	 * \endif
	 */
    public  static final int NET_FISHEYE_MOUNT_MODE_FLOOR = 3;                        
}

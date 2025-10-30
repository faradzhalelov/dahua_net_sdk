package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* set fish eye calibrate rule input parameters of output screen, corresponding to command {@link NET_SPLIT_OPERATE_TYPE#NET_WM_OPERATE_SET_FISH_EYE_PARAM}
* \else
* 设置输出屏的鱼眼矫正规则输入参数,对应命令 {@link NET_SPLIT_OPERATE_TYPE#NET_WM_OPERATE_SET_FISH_EYE_PARAM}
* \endif
*/
public class NET_IN_WM_SET_FISH_EYE_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * Output channel index or the virtual channel index of multi-screen display, it is valid when pszCompositeID =NULL
	 * \else
	 * 输出通道号或融合屏虚拟通道号, pszCompositeID为NULL时有效
	 * \endif
	 */
    public int                             nChannel;           
    
	 /**
	 * \if ENGLISH_LANG
	 * Multi-screen display ID
	 * \else
	 * 融合屏ID
	 * \endif
	 */
    public String                     	   pszCompositeID;      
    
	 /**
	 * \if ENGLISH_LANG
	 * window id
	 * \else
	 * 对应输出屏的窗口号
	 * \endif
	 */
    public int                             nWindowID;          

	 /**
	 * \if ENGLISH_LANG
	 * fish eye set mode, refer to {@link NET_FISHEYE_MOUNT_MODE}
	 * \else
	 * 鱼眼安装模式 ,取值参考 {@link NET_FISHEYE_MOUNT_MODE}
	 * \endif
	 */
    public int           					emMount;            
    
	 /**
	 * \if ENGLISH_LANG
	 * fish eye calibrate mode, refer to {@link NET_WM_FISHEYE_CALIBRATE_MODE}
	 * \else
	 * 鱼眼矫正模式 ,取值参考 {@link NET_WM_FISHEYE_CALIBRATE_MODE}
	 * \endif
	 */
    public int    							emCalibrate;        
    
	 /**
	 * \if ENGLISH_LANG
	 * initialize each picture 
	 * \else
	 * 模式初始化各画面信息  
	 * \endif
	 */
    public NET_WM_SET_FISHEYE_INIT_PARAM   stInitParam;          
    
	 /**
	 * \if ENGLISH_LANG
	 * mobile electronic PTZ zoom parameters
	 * \else
	 * 电子云台缩放移动参数
	 * \endif
	 */
    public NET_WM_SET_FISHEYE_EPTZ_PARAM	stEPtzParam;		
	
    public NET_IN_WM_SET_FISH_EYE_PARAM(int fishEyeRegionNum) {
		stInitParam = new NET_WM_SET_FISHEYE_INIT_PARAM(fishEyeRegionNum);
		stEPtzParam = new NET_WM_SET_FISHEYE_EPTZ_PARAM();		
	}
}

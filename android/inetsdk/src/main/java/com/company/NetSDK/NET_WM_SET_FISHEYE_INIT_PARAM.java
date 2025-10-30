package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Set Fisheye init parameter, used for switching mode to last status
* \else
* 模式初始化各画面信息,适用于模式切换恢复到上一次的状态
* \endif
*/
public class NET_WM_SET_FISHEYE_INIT_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * if True, using underside member to init; if FLASE, underside member is invaild; 
	 * \else
	 * 为TRUE时,使用以下成员进行初始化,为FALSE时以下成员无效
	 * \endif
	 */
    public boolean                         bUseRegion;         
    
	 /**
	 * \if ENGLISH_LANG
	 * Circular (Fisheye display mode with original, eg:1+3, 1+8 )
	 * \else
	 *  环形偏移(鱼眼显示模式中带原始图时有意义。如1+3、1+8等模式的1画面)
	 * \endif
	 */
    public int                             nCircular;          
    
	 /**
	 * \if ENGLISH_LANG
	 * Panorama (Fisheye display mode with panorama, eg:1P, 2P )
	 * \else
	 * 全景偏移(鱼眼显示模式带全景时有意义,如1P、2P等模式)
	 * \endif
	 */
    public int                             nPanorama;         
	
	 /**
	 * \if ENGLISH_LANG
	 *  FishEye region number
	 * \else
	 * 鱼眼矫正窗口区域参数个数(数组个数等于实际的矫正模式.如1+3,则有4个元素)
	 * \endif
	 */
    public int                             nFishEyeRegionNum;  
    
	 /**
	 * \if ENGLISH_LANG
	 * FishEye region parameter information
	 * \else
	 * 鱼眼矫正窗口区域参数信息
	 * \endif
	 */
    public NET_WM_FISH_EYE_REGION_PARAM[]    stFishEyeRegions = new NET_WM_FISH_EYE_REGION_PARAM[FinalVar.MAX_FISH_EYE_REGION_NUM];    
	
    public NET_WM_SET_FISHEYE_INIT_PARAM(int fishEyeRegionNum) {
		this.nFishEyeRegionNum = fishEyeRegionNum;
		for(int i = 0; i< fishEyeRegionNum; ++i) {
			stFishEyeRegions[i] = new NET_WM_FISH_EYE_REGION_PARAM();
		}
	}  
}

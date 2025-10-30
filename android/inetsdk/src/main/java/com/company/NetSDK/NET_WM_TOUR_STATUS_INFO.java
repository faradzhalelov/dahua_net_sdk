package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * tv wall scheme tour status info 
 * \else
 * 电视墙预案轮巡状态信息
 * \endif
 */
public class NET_WM_TOUR_STATUS_INFO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * tour status, refer to {@link EM_NET_WM_TOUR_STATUS}
	 * \else
	 * 轮巡状态,取值参考 {@link EM_NET_WM_TOUR_STATUS}
	 * \endif
	 */
	 public int	emStatus;          
	    
	/**
	 * \if ENGLISH_LANG
	 * scheme information
	 * \else
	 * 预案信息
	 * \endif
	 */
	 public SDK_MONITORWALL_SCENE    stuScene;
	 
	 // splitSceneCount:拼接屏场景数组大小; blockCount:显示区块数组大小; OutputCount:显示单元数组大小; windowCount:窗口信息数组大小
	 public NET_WM_TOUR_STATUS_INFO(int splitSceneCount, int blockCount, int OutputCount, int windowCount, int videoInputCount) {
		 stuScene = new SDK_MONITORWALL_SCENE(splitSceneCount, blockCount, OutputCount, windowCount, videoInputCount);
	 }
}


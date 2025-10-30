package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Mobile electronic PTZ zoom
* \else
* 电子云台缩放移动参数
* \endif
*/
public class NET_WM_SET_FISHEYE_EPTZ_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * operate type
	 * \else
	 * 操作类型(表示鱼眼云台控制时的arg1,表示是移动还是放大)
	 * \endif
	 */
	public int 							nOptWayType;		
	
	 /**
	 * \if ENGLISH_LANG
	 * samll window number
	 * \else
	 * 小窗口号(当前正在操作的小窗口号)
	 * \endif
	 */
	public int 							nOptWinNum; 		
	
	 /**
	 * \if ENGLISH_LANG
	 * operate data
	 * \else
	 * 操作数据(表示鱼眼云台控制时的数据大小。和OptWayType配合使用)
	 * \endif
	 */
	public int 							nOptWayData;		
}

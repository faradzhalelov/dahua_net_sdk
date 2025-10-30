package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Video split operation type
* \else
* 视频分割操作类型
* \endif
*/
public class NET_SPLIT_OPERATE_TYPE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * Set background, refer to {@link NET_IN_SPLIT_SET_BACKGROUND} and {@link NET_OUT_SPLIT_SET_BACKBROUND}
	 * \else
	 * 设置背景图片, 对应 {@link NET_IN_SPLIT_SET_BACKGROUND} 和 {@link NET_OUT_SPLIT_SET_BACKBROUND}
	 * \endif
	 */
	public static final int NET_SPLIT_OPERATE_SET_BACKGROUND = 0;          
	
	 /**
	 * \if ENGLISH_LANG
	 * get background, refer to {@link NET_IN_SPLIT_GET_BACKGROUND} and {@link NET_OUT_SPLIT_GET_BACKGROUND}
	 * \else
	 * 获取背景图片, 对应 {@link NET_IN_SPLIT_GET_BACKGROUND} 和 {@link NET_OUT_SPLIT_GET_BACKGROUND}
	 * \endif
	 */
	public static final int NET_SPLIT_OPERATE_GET_BACKGROUND = 1;           
	
	 /**
	 * \if ENGLISH_LANG
	 * set pre stream srouce, refer to {@link NET_IN_SPLIT_SET_PREPULLSRC} and {@link NET_OUT_SPLIT_SET_PREPULLSRC}
	 * \else
	 * 设置预拉流源, 对应 {@link NET_IN_SPLIT_SET_PREPULLSRC} 和 {@link NET_OUT_SPLIT_SET_PREPULLSRC}
	 * \endif
	 */
	public static final int NET_SPLIT_OPERATE_SET_PREPULLSRC = 2;           
	
	 /**
	 * \if ENGLISH_LANG
	 * set source frame brightness switch, refer to {@link NET_IN_SPLIT_SET_HIGHLIGHT} and {@link NET_OUT_SPLIT_SET_HIGHLIGHT}
	 * \else
	 * 设置源边框高亮使能开关, 对应 {@link NET_IN_SPLIT_SET_HIGHLIGHT} 和 {@link NET_OUT_SPLIT_SET_HIGHLIGHT}
	 * \endif
	 */
	public static final int NET_SPLIT_OPERATE_SET_HIGHLIGHT = 3;            
	
	 /**
	 * \if ENGLISH_LANG
	 * adjust window Z order, refer to {@link NET_IN_SPLIT_SET_ZORDER} and {@link NET_OUT_SPLIT_SET_ZORDER}
	 * \else
	 * 调整窗口Z序, 对应 {@link NET_IN_SPLIT_SET_ZORDER} 和 {@link NET_OUT_SPLIT_SET_ZORDER}
	 * \endif
	 */
	public static final int NET_SPLIT_OPERATE_SET_ZORDER = 4;              
	
	 /**
	 * \if ENGLISH_LANG
	 * window tour control, refer to {@link NET_IN_SPLIT_SET_TOUR} and {@link NET_OUT_SPLIT_SET_TOUR}
	 * \else
	 * 窗口轮巡控制, 对应 {@link NET_IN_SPLIT_SET_TOUR} 和 {@link NET_OUT_SPLIT_SET_TOUR}
	 * \endif
	 */
	public static final int NET_SPLIT_OPERATE_SET_TOUR = 5;                
	
	 /**
	 * \if ENGLISH_LANG
	 * Get window tour status, refer to {@link NET_IN_SPLIT_GET_TOUR_STATUS} and {@link NET_OUT_SPLIT_GET_TOUR_STATUS}
	 * \else
	 * 获取窗口轮巡状态, 对应 {@link NET_IN_SPLIT_GET_TOUR_STATUS} 和 {@link NET_OUT_SPLIT_GET_TOUR_STATUS}
	 * \endif
	 */
	public static final int NET_SPLIT_OPERATE_GET_TOUR_STATUS = 6;          
	
	 /**
	 * \if ENGLISH_LANG
	 * Get screen window info, refer to {@link NET_IN_SPLIT_GET_SCENE} and {@link NET_OUT_SPLIT_GET_SCENE}
	 * \else
	 * 获取屏内窗口信息, 对应 {@link NET_IN_SPLIT_GET_SCENE} 和 {@link NET_OUT_SPLIT_GET_SCENE}
	 * \endif
	 */
	public static final int NET_SPLIT_OPERATE_GET_SCENE = 7;              
	
	 /**
	 * \if ENGLISH_LANG
	 * batch window, refer to {@link NET_IN_SPLIT_OPEN_WINDOWS} and {@link NET_OUT_SPLIT_OPEN_WINDOWS}
	 * \else
	 * 批量开窗, 对应 {@link NET_IN_SPLIT_OPEN_WINDOWS} 和 {@link NET_OUT_SPLIT_OPEN_WINDOWS}
	 * \endif
	 */
	public static final int NET_SPLIT_OPERATE_OPEN_WINDOWS = 8;             
	
	 /**
	 * \if ENGLISH_LANG
	 * set work mode , refer to {@link NET_IN_SPLIT_SET_WORK_MODE} and {@link NET_OUT_SPLIT_SET_WORK_MODE}
	 * \else
	 * 设置工作模式, 对应 {@link NET_IN_SPLIT_SET_WORK_MODE} 和 {@link NET_OUT_SPLIT_SET_WORK_MODE}
	 * \endif
	 */
	public static final int NET_SPLIT_OPERATE_SET_WORK_MODE = 9;          
	
	 /**
	 * \if ENGLISH_LANG
	 * Get player example, refer to {@link NET_IN_SPLIT_GET_PLAYER} and {@link NET_OUT_SPLIT_GET_PLAYER}
	 * \else
	 * 获取播放器实例,对应 {@link NET_IN_SPLIT_GET_PLAYER} 和 {@link NET_OUT_SPLIT_GET_PLAYER}
	 * \endif
	 */
	public static final int NET_SPLIT_OPERATE_GET_PLAYER = 10;              
	
	 /**
	 * \if ENGLISH_LANG
	 * Set window working mode, refer to {@link NET_IN_WM_SET_WORK_MODE} and {@link NET_OUT_WM_SET_WORK_MODE}
	 * \else
	 * 设置窗口工作模式,对应 {@link NET_IN_WM_SET_WORK_MODE} 和 {@link NET_OUT_WM_SET_WORK_MODE}
	 * \endif
	 */
	public static final int NET_WM_OPERATE_SET_WORK_MODE = 11;            
	
	 /**
	 * \if ENGLISH_LANG
	 * Get window working mode, refer to {@link NET_IN_WM_GET_WORK_MODE} and {@link NET_OUT_WM_GET_WORK_MODE}
	 * \else
	 * 获取窗口工作模式,对应 {@link NET_IN_WM_GET_WORK_MODE} 和 {@link NET_OUT_WM_GET_WORK_MODE}
	 * \endif
	 */
	public static final int NET_WM_OPERATE_GET_WORK_MODE = 12;              
	
	 /**
	 * \if ENGLISH_LANG
	 * close batch windows, refer to {@link NET_IN_SPLIT_CLOSE_WINDOWS} and {@link NET_OUT_SPLIT_CLOSE_WINDOWS}
	 * \else
	 * 批量关窗, 对应 {@link NET_IN_SPLIT_CLOSE_WINDOWS} 和 {@link NET_OUT_SPLIT_CLOSE_WINDOWS}
	 * \endif
	 */
	public static final int NET_SPLIT_OPERATE_CLOSE_WINDOWS = 13;           
	
	 /**
	 * \if ENGLISH_LANG
	 * set the output rules of the fish eyes, refer to {@link NET_IN_WM_SET_FISH_EYE_PARAM} and {@link NET_OUT_WM_SET_FISH_EYE_PARAM}
	 * \else
	 * 设置输出屏的鱼眼矫正规则 , 对应 {@link NET_IN_WM_SET_FISH_EYE_PARAM} 和 {@link NET_OUT_WM_SET_FISH_EYE_PARAM}
	 * \endif
	 */
	public static final int NET_WM_OPERATE_SET_FISH_EYE_PARAM = 14;        
	
	 /**
	 * \if ENGLISH_LANG
	 * set the corridor mode of the window, refer to {@link NET_IN_WM_SET_CORRIDOR_MODE} and {@link NET_OUT_WM_SET_CORRIDOR_MODE}
	 * \else
	 * 设置窗口走廊模式，对应 {@link NET_IN_WM_SET_CORRIDOR_MODE}和 {@link NET_OUT_WM_SET_CORRIDOR_MODE}
	 * \endif
	 */
	public static final int NET_WM_OPERATE_SET_CORRIDOR_MODE = 15;		
	
	 /**
	 * \if ENGLISH_LANG
	 * get the corridor mode of the window, refer to {@link NET_IN_WM_GET_CORRIDOR_MODE} and {@link NET_OUT_WM_GET_CORRIDOR_MODE}
	 * \else
	 * 获取窗口走廊模式，对应 {@link NET_IN_WM_GET_CORRIDOR_MODE}和 {@link NET_OUT_WM_GET_CORRIDOR_MODE}
	 * \endif
	 */
	public static final int NET_WM_OPERATE_GET_CORRIDOR_MODE = 16;			
	
}

package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * a rain brush circle back and forth, the effective rainbrush mode configuration for manual mode, corresponding to {@link CtrlType#SDK_CTRL_RAINBRUSH_MOVECONTINUOUSLY}
 * \else
 * 雨刷来回循环刷,雨刷模式配置为手动模式时有效, 对应命令 {@link CtrlType#SDK_CTRL_RAINBRUSH_MOVECONTINUOUSLY}
 * \endif
 */

public class NET_CTRL_RAINBRUSH_MOVECONTINUOUSLY implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * rainbrush Index
	 * \else
	 * 雨刷的索引
	 * \endif
	 */
    public int             nChannel;       
    
	/**
	 * \if ENGLISH_LANG
	 * rainbrush interval
	 * \else
	 * 雨刷间隔
	 * \endif
	 */
    public int    		   nInterval;     
}

package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * a rain brush once back and forth, the effective rainbrush mode configuration for manual mode, corresponding to command {@link CtrlType#SDK_CTRL_RAINBRUSH_MOVEONCE}
 * \else
 * 雨刷来回刷一次,雨刷模式配置为手动模式时有效, 对应命令 {@link CtrlType#SDK_CTRL_RAINBRUSH_MOVEONCE}
 * \endif
 */
public class NET_CTRL_RAINBRUSH_MOVEONCE implements Serializable{
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
    public int 				nChannel; 
}

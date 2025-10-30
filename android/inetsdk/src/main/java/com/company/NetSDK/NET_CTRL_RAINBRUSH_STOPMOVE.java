package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * a rain brush stop, the effective rainbrush mode configuration for manual mode, corresponding to command {@link CtrlType#SDK_CTRL_RAINBRUSH_STOPMOVE}
 * \else
 * 雨刷停止刷,雨刷模式配置为手动模式时有效, 对应命令 {@link CtrlType#SDK_CTRL_RAINBRUSH_STOPMOVE}
 * \endif
 */
public class NET_CTRL_RAINBRUSH_STOPMOVE implements Serializable{
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
}

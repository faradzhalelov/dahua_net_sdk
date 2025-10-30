package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * command information
 * \else
 * 命令信息
 * \endif
 */
public class NET_CMD_INFO implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * zoom step length, minus sign indicates direction of reduction, when focus is not zero, zoom must be zero
	 * \else
	 * 变倍步长, 负数表示减量方向, focus非0时, zoom必须为0
	 * \endif
	 */
	public int                            nZoom;

	/**
	 * \if ENGLISH_LANG
	 * focus step length, minus sign indicates direction of reduction, when zoom is not zero, focus must be zero
	 * \else
	 * 聚焦步长, 负数表示减量方向, zoom非0时, focus必须为0
	 * \endif
	 */
	public int                            nFocus;

	/**
	 * \if ENGLISH_LANG
	 * lens action {@link EM_LENS_ACTION}
	 * \else
	 * 镜头行为 {@link EM_LENS_ACTION}
	 * \endif
	 */
	public int                 emLensAction;
}

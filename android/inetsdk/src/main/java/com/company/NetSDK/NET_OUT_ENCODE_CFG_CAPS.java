package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get device encode config corresponding capacity output parameter, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_ENCODE_CFG_CAPS}
 * \else
 * 获取设备编码配置对应能力输出参数, 对应接口{@link INetSDK#GetDevCaps},对应命令 {@link FinalVar#NET_ENCODE_CFG_CAPS}
 * \endif
 */
public class NET_OUT_ENCODE_CFG_CAPS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * main stream corresponding capacity
	 * \else
	 * 主码流配置对应能力
	 * \endif
	 */
	public NET_STREAM_CFG_CAPS stuMainFormatCaps[] = new NET_STREAM_CFG_CAPS[REC_TYPE.SDK_REC_TYPE_NUM]; 
	
	/**
	 * \if ENGLISH_LANG
	 * sub streamconfig corresponding capacity
	 * \else
	 * 辅码流配置对应能力
	 * \endif
	 */
	public NET_STREAM_CFG_CAPS stuExtraFormatCaps[] = new NET_STREAM_CFG_CAPS[FinalVar.SDK_N_ENCODE_AUX]; 
	
	/**
	 * \if ENGLISH_LANG
	 * sub stream config corresponding capacity
	 * \else
	 * 辅码流配置对应能力
	 * \endif
	 */
	public NET_STREAM_CFG_CAPS stuSnapFormatCaps[] = new NET_STREAM_CFG_CAPS[SNAP_TYPE.SNAP_TYP_NUM];

	/**
	 * \if ENGLISH_LANG
	 * number of main stream config
	 * \else
	 * 有效的主码流配置对应的能力个数
	 * \endif
	 */
	public int                 nMainFormCaps;

	/**
	 * \if ENGLISH_LANG
	 * number of Extra stream config
	 * \else
	 * 有效的辅码流配置对应的能力个数
	 * \endif
	 */
	public int                 nExtraFormCaps;

	/**
	 * \if ENGLISH_LANG
	 * number of snap stream config
	 * \else
	 * 有效的抓图码流配置对应的能力个数
	 * \endif
	 */
	public int                 nSnapFormatCaps;

	public NET_OUT_ENCODE_CFG_CAPS() {
		for (int i = 0; i < REC_TYPE.SDK_REC_TYPE_NUM; i++) {
			stuMainFormatCaps[i] = new NET_STREAM_CFG_CAPS();
		}
		
		for (int i = 0; i < FinalVar.SDK_N_ENCODE_AUX; i++) {
			stuExtraFormatCaps[i] = new NET_STREAM_CFG_CAPS();
		}
		
		for (int i = 0; i < SNAP_TYPE.SNAP_TYP_NUM; i++) {
			stuSnapFormatCaps[i] = new NET_STREAM_CFG_CAPS();
		}
	}
}

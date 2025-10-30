package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Capture network configuration
 * \else
 * 网络抓包配置
 * \endif
 */
public class SDK_SNIFFER_FRAME_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Each FRAME ID Options
	 * \else
	 * 每个FRAME ID 选项
	 * \endif
	 */
	public SDK_SNIFFER_FRAMEID    snifferFrameId = new SDK_SNIFFER_FRAMEID(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Each FRAME Corresponding to the contents of capture
	 * \else
	 * 每个FRAME对应的8个抓包内容
	 * \endif
	 */
	public SDK_SNIFFER_CONTENT    snifferContent[] = new SDK_SNIFFER_CONTENT[FinalVar.SDK_SNIFFER_CONTENT_NUM_EX]; 
	
	public SDK_SNIFFER_FRAME_EX() {
		for (int i = 0; i < FinalVar.SDK_SNIFFER_CONTENT_NUM_EX; i++) {
			snifferContent[i] = new SDK_SNIFFER_CONTENT();
		}
	}
}

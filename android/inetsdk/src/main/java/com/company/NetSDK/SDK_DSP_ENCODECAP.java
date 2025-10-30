package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DSP capacity description. Correspondign to interface {@link INetSDK#GetDevConfig}
 * \else
 * DSP能力描述，对应接口 {@link INetSDK#GetDevConfig}
 * \endif
 */
public class SDK_DSP_ENCODECAP implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Video format mask. Bit stands for the video format device supported.
	 * \else
	 * 视频制式掩码，按位表示设备能够支持的视频制式
	 * \endif
	 */
	public int				dwVideoStandardMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Resolution mask bit. Bit stands for the resolution setup devices supported.
	 * \else
	 * 分辨率掩码，按位表示设备能够支持的分辨率设置
	 * \endif
	 */
	public int				dwImageSizeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Encode mode mask bit. Bit stands for the encode mode devices supported.
	 * \else
	 * 编码模式掩码，按位表示设备能够支持的编码模式设置	
	 * \endif
	 */
	public int				dwEncodeModeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * The multiple-media function the devices supported \n
	 * The first bit:main stream \n
	 * The second bit:extra stream 1 \n
	 * The third bit:extra stream 2 \n
	 * The fifth bit: snapshot in .jpg format
	 * \else
	 * 按位表示设备支持的多媒体功能， \n
	 * 第一位表示支持主码流 \n
	 * 第二位表示支持辅码流1 \n
	 * 第三位表示支持辅码流2 \n
	 * 第五位表示支持jpg抓图
	 * \endif
	 */
	public int				dwStreamCap;
												
	/**
	 * \if ENGLISH_LANG
	 * When the main stream is the corresponding resolution, the supported extra stream resolution mask.
	 * \else
	 * 表示主码流为各分辨率时，支持的辅码流分辨率掩码。
	 * \endif
	 */
	public int				dwImageSizeMask_Assi[] = new int[8];
	
	/**
	 * \if ENGLISH_LANG
	 * The highest encode capacity DSP supported
	 * \else
	 * DSP支持的最高编码能力 
	 * \endif
	 */
	public int				dwMaxEncodePower;
	
	/**
	 * \if ENGLISH_LANG
	 * The max video channel amount each DSP supported.
	 * \else
	 * 每块DSP支持最多输入视频通道数 
	 * \endif
	 */
	public int				wMaxSupportChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Max encode bit setup in each DSP channel  are synchronized or not ;0:does not synchronized,1:synchronized
	 * \else
	 * DSP每通道的最大编码设置是否同步；0：不同步，1：同步
	 * \endif
	 */
	public int				wChannelMaxSetSync;
}

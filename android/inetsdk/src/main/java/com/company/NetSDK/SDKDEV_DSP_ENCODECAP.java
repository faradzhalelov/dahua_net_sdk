package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DSP ability to describe，the type of expansion，the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_DSP}
 * \else
 * DSP能力描述，扩展类型，对应接口 {@link INetSDK#QueryDevState}, 对应命令 {@link FinalVar#SDK_DEVSTATE_DSP}
 * \endif
 */
public class SDKDEV_DSP_ENCODECAP implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Video format mask bit device can support video format 
	 * \else
	 * 视频制式掩码，按位表示设备能够支持的视频制式
	 * \endif
	 */
	public int				dwVideoStandardMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Resolution mask，the device can support the resolution represented by bit 
	 * \else
	 * 分辨率掩码，按位表示设备能够支持的分辨率
	 * \endif
	 */
	public int				dwImageSizeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Encoding mode mask, the device can support the resolution represented by bit
	 * \else
	 * 编码模式掩码，按位表示设备能够支持的编码模式
	 * \endif
	 */
	public int				dwEncodeModeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Bit indicates the device supports multimedia features\n
	 * First expressed support for the main stream,\n
	 * Expressed support for auxiliary stream1,\n
	 * Expressed support for third place auxiliary stream2,\n
	 * Fifth expressed support for jpg shots
	 * \else
	 * 按位表示设备支持的多媒体功能\n
	 * 第一位表示支持主码流\n
	 * 第二位表示支持辅码流1\n
	 * 第三位表示支持辅码流2\n
	 * 第五位表示支持jpg抓图
	 * \endif
	 */
	public int				dwStreamCap;			

	/**
	 * \if ENGLISH_LANG
	 * Said that the main stream for each resolution,the auxiliary stream resolution mask support
	 * \else
	 * 表示主码流为各分辨率时，支持的辅码流分辨率掩码。
	 * \endif
	 */
	public int				dwImageSizeMask_Assi[] = new int[32];
	
	/**
	 * \if ENGLISH_LANG
	 * DSP support the highest coding capacity 
	 * \else
	 * DSP支持的最高编码能力 
	 * \endif
	 */
	public int				dwMaxEncodePower;
	
	/**
	 * \if ENGLISH_LANG
	 * Each DSP supports up to enter the number of video channels 
	 * \else
	 * 每块DSP支持最多输入视频通道数 
	 * \endif
	 */
	public short				wMaxSupportChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * DSP per channel encoding settings synchronization; 0: no sync, 1: Synchronous 
	 * \else
	 * DSP每通道的最大编码设置是否同步；0：不同步，1：同步
	 * \endif
	 */
	public short				wChannelMaxSetSync;
	
	/**
	 * \if ENGLISH_LANG
	 * The largest acquisition frame rate, resolution and dwVideoStandardMask corresponding bitwise
	 * \else
	 * 不同分辨率下的最大采集帧率，与dwVideoStandardMask按位对应.
	 * \endif
	 */
	public byte				bMaxFrameOfImageSize[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Symbol. The configuration shall meet the following requirements, otherwise the configuration is invalid.
	 * 0 Main stream encoding + auxiliary stream encoding capability <= encoding 
	 * 1 Main stream encoding + auxiliary stream encoding capability <= encoding 
	 * 2 The auxiliary stream coding capacity <= main-stream encoding capabilities 
	 * 3 Resolution <= resolution of the main stream of the auxiliary stream 
	 * 4 Framerate <= front-end video capture frame rate of the main stream and secondary stream 
	 * \else
	 * 标志，配置时要求符合下面条件，否则配置不能生效；
	 * 0 主码流的编码能力+辅码流的编码能力 <= 设备的编码能力 
	 * 1 主码流的编码能力+辅码流的编码能力 <= 设备的编码能力 
	 * 2 辅码流的编码能力 <= 主码流的编码能力 
	 * 3 辅码流的分辨率 <= 主码流的分辨率 
	 * 4 主码流和辅码流的帧率 <= 前端视频采集帧率 
	 * \endif
	 */
	public byte				bEncodeCap;
}

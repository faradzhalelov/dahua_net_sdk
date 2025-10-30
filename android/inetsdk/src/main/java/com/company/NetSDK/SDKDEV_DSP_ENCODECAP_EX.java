package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DSP extend capacity description. Corresponding to {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_DSP_EX}
 * \else
 * DSP扩展能力描述，对应接口 {@link INetSDK#QueryDevState}, 对应命令 {@link FinalVar#SDK_DEVSTATE_DSP_EX}
 * \endif
 */
public class SDKDEV_DSP_ENCODECAP_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * video format mask. Bit stands for the video format device supported.
	 * \else
	 * 视频制式掩码，按位表示设备能够支持的视频制式
	 * \endif
	 */
	public int               dwVideoStandardMask;

	/**
	 * \if ENGLISH_LANG
	 * Resolution mask bit. Bit stands for the resolution setup devices supported.
	 * \else
	 * 分辨率掩码，按位表示设备能够支持的分辨率
	 * \endif
	 */
	public int               dwImageSizeMask;

	/**
	 * \if ENGLISH_LANG
	 * Encode mode mask bit. Bit stands for the encode mode devices supported.
	 * \else
	 * 编码模式掩码，按位表示设备能够支持的编码模式
	 * \endif
	 */
	public int               dwEncodeModeMask;

	/**
	 * \if ENGLISH_LANG
	 * The multiple-media function the devices supported.
	 * The first bit:main stream
	 * The second bit:extra stream 1
	 * The third bit:extra stream 2
	 * The forth bit:extra stream 3
	 * The fifth bit: snapshot in .jpg format
	 * \else
	 * 按位表示设备支持的多媒体功能，
	 * 第一位表示支持主码流
	 *  第二位表示支持辅码流1
	 *  第三位表示支持辅码流2
	 *  第四位表示支持辅码流3
	 *  第五位表示支持jpg抓图
	 * \endif
	 */
	public int               dwStreamCap;

	/**
	 * \if ENGLISH_LANG
	 * When the main stream is the corresponding resolution, the supported extra stream resolution mask, the 0,1,2 member in the group correspond extra stream1,2,3
	 * \else
	 * 表示主码流为各分辨率时，支持的辅码流分辨率掩码, 数组中的0,1,2元素分别代表辅码流1,2,3
	 * \endif
	 */
	public int               dwImageSizeMask_Assi[][] = new int[3][64];
	/**
	 * \if ENGLISH_LANG
	 * The highest encode capacity DSP supported
	 * \else
	 * DSP支持的最高编码能力
	 * \endif
	 */
	public int               dwMaxEncodePower;

	/**
	 * \if ENGLISH_LANG
	 * The max video channel amount each DSP supported.
	 * \else
	 * 每块DSP支持最多输入视频通道数
	 * \endif
	 */
	public short                wMaxSupportChannel;

	/**
	 * \if ENGLISH_LANG
	 * Max encode bit setup in each DSP channel  are synchronized or not;0:do not synchronized,1:synchronized
	 * \else
	 * DSP每通道的最大编码设置是否同步；0：不同步，1：同步
	 * \endif
	 */
	public short                wChannelMaxSetSync;

	/**
	 * \if ENGLISH_LANG
	 * The max sampling frame rate in different resolution. Bit corresponding to the dwVideoStandardMask.
	 * \else
	 * 不同分辨率下的最大采集帧率，与dwVideoStandardMask按位对应
	 * \endif
	 */
	public byte                bMaxFrameOfImageSize[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Symbol. The configuration shall meet the following requirements, otherwise the configuration is invalid.
	 * 0:main stream encode capacity+extra stream encode capacity<= device encode capacity 
	 * 1:main stream encode capacity +extra stream encode capacity<= device encode capacity 
	 * Extra stream encode capacity <=main stream encode capacity 
	 * Extra stream resolution<=main stream resolution 
	 * Main stream resolution and extra stream resolution <=front-end video collection frame rate
	 * 2:N5 Device
	 * Extra stream encode capacity <=main stream encode capacity
	 * Query  the supported resolution and the corresponding maximum frame rate
	 * \else
	 * 标志，配置时要求符合下面条件，否则配置不能生效；
	 * 0：主码流的编码能力+辅码流的编码能力 <= 设备的编码能力，
	 *  1：主码流的编码能力+辅码流的编码能力 <= 设备的编码能力，
	 *  辅码流的编码能力 <= 主码流的编码能力，
	 *  辅码流的分辨率 <= 主码流的分辨率，
	 *  主码流和辅码流的帧率 <= 前端视频采集帧率
	 *  2：N5的计算方法
	 *  辅码流的分辨率 <= 主码流的分辨率
	 *  查询支持的分辨率和相应最大帧率
	 * \endif
	 */
	public byte                bEncodeCap;

	/**
	 * \if ENGLISH_LANG
	 * bit0-main stream, bit1-extra stream1, bit2-extra stream2
	 * \else
	 * 第0位表示主码流, 其它按位依次表示辅码流, 如第一位表示辅码流1,第二们表示辅码流2
	 * \endif
	 */
	public int               dwExtraStream;

	/**
	 * \if ENGLISH_LANG
	 * extra stream compression
	 * \else
	 * 每一个值表示对应辅码流的编码格式支持
	 * \endif
	 */
	public int               dwCompression[] = new int[3];
}

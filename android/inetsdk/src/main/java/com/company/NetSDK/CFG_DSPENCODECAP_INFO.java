package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * dsp Configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_HDVR_DSP}
 * \else
 * dsp配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_HDVR_DSP}
 * \endif
 */
public class CFG_DSPENCODECAP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Video Standard Mask,Video Standard Supported By Device Indicated By Bits 
	 * \else
	 * 视频制式掩码,按位表示设备能够支持的视频制式
	 * \endif
	 */
	public int				dwVideoStandardMask;	

	/**
	 * \if ENGLISH_LANG
	 * Resolution Mask,Resolution Supported By Device Indicated By Bits
	 * \else
	 * 分辨率掩码,按位表示设备能够支持的分辨率
	 * \endif
	 */
	public int				dwImageSizeMask;		

	/**
	 * \if ENGLISH_LANG
	 * Encode Mode Mask,Encode Mode Supported By Device Indicated By Bits
	 * \else
	 * 编码模式掩码,按位表示设备能够支持的编码模式
	 * \endif
	 */
	public int				dwEncodeModeMask;		

	/**
	 * \if ENGLISH_LANG
	 * Multimedia Function Supported By Device Indicated By Bits,First Bit Means Support Main Stream, Second Means Support Substream 1, Third Bit Means Support Main Stream 2, Fifth Bit Means Support jpg Snapshot 
	 * \else
	 * 按位表示设备支持的多媒体功能,\n
	 * 第一位表示支持主码流\n
	 * 第二位表示支持辅码流1\n
	 * 第三位表示支持辅码流2\n
	 * 第五位表示支持jpg抓图
	 * \endif
	 */
	public int				dwStreamCap;			


	/**
	 * \if ENGLISH_LANG
	 * Means when Main Stream Is Each Resolution,the Substream Resolution Mask Supported 
	 * \else
	 * 表示主码流为各分辨率时,支持的辅码流分辨率掩码
	 * \endif
	 */
	public int				dwImageSizeMask_Assi[] = new int[32];

	/**
	 * \if ENGLISH_LANG
	 * DSP Supported Max Encode Power 
	 * \else
	 * DSP支持的最高编码能力 
	 * \endif
	 */
	public int				dwMaxEncodePower;		

	/**
	 * \if ENGLISH_LANG
	 * Each DSP Supports Max Support Channel Num 
	 * \else
	 * 每块DSP支持最多输入视频通道数 
	 * \endif
	 */
	public int				wMaxSupportChannel;		

	/**
	 * \if ENGLISH_LANG
	 * DSP If Every Channel Max Encode Set Sync;0:Not Sync,1:Sync 
	 * \else
	 * DSP每通道的最大编码设置是否同步;0:不同步,1:同步
	 * \endif
	 */
	public int				wChannelMaxSetSync;		

	/**
	 * \if ENGLISH_LANG
	 * Max Collect Frame Rate Under Different Resolutions,Corresponding To dwVideoStandardMask By Bits 
	 * \else
	 * 不同分辨率下的最大采集帧率,与dwVideoStandardMask按位对应
	 * \endif
	 */
	public byte				bMaxFrameOfImageSize[] = new byte[256];

	/**
	 * \if ENGLISH_LANG
	 * Symbol,Need Meet the Demands Below When Configuration, Or Does Not Work; 
	 * <pre>
	 * 0:Main Stream Encode Capability+Substream Encode Capability >= Device Encode Capability 
	 * 1:Main Stream Encode Capability+Substream Encode Capability >= Device Encode Capability,
	 * Substream Encode Capability >= Main Stream Capability,Substream Resolution >= Main Stream Resolution,
	 * Main Stream and Substream Framerate >= Front End Video Collect Frame Rate
	 * 2:N5 Calculation,Substream Resolution >= Main Stream Resolution,Supported Check Resolution and Corresponding Max Frame Rate
	 * </pre>
	 * \else
	 * 标志,配置时要求符合下面条件,否则配置不能生效;
	 * <pre>
	 * 0:主码流的编码能力+辅码流的编码能力 <= 设备的编码能力,
	 * 1:主码流的编码能力+辅码流的编码能力 <= 设备的编码能力,
	 * 辅码流的编码能力 <= 主码流的编码能力,
	 * 辅码流的分辨率 <= 主码流的分辨率,
	 * 主码流和辅码流的帧率 <= 前端视频采集帧率
	 * 2:N5的计算方法
	 * 辅码流的分辨率 <= 主码流的分辨率
	 * 查询支持的分辨率和相应最大帧率
	 * </pre>
	 * \endif
	 */
	public byte				bEncodeCap;				


	/**
	 * \if ENGLISH_LANG
	 * bResolution Length 
	 * \else
	 * bResolution的长度
	 * \endif
	 */
	public byte				byResolutionNum;			

	/**
	 * \if ENGLISH_LANG
	 * bResolution_1 Length 
	 * \else
	 * bResolution_1的长度
	 * \endif
	 */
	public byte				byResolutionNum_1;		

	/**
	 * \if ENGLISH_LANG
	 * Main Stream,Index As Resolution,If Support This Resolution,Then bResolution[n]is Supported Max Frame Rate.Ortherwise0.
	 * \else
	 * 主码流,按照分辨率进行索引,如果支持该分辨率,则bResolution[n]等于支持的最大帧率.否则为0.
	 * \endif
	 */
	public byte				byResolution[] = new byte[256];								

	/**
	 * \if ENGLISH_LANG
	 * Substream 1,Same as The Main Stream Specification 
	 * \else
	 * 辅助码流1,同主码流说明.
	 * \endif
	 */
	public byte				byResolution_1[] = new byte[256];		

	/**
	 * \if ENGLISH_LANG
	 * Supported Resolution Array,See {@link CAPTURE_SIZE} 
	 * \else
	 * 支持的分辨率数组,参见 {@link CAPTURE_SIZE} 
	 * \endif
	 */
	public byte				byImageSize[] = new byte[256];		

	/**
	 * \if ENGLISH_LANG
	 * Means When Main Streams are Each Resolition,Wupported SubStream Resolution,Array Subscript Means Main Stream Support Resolition
	 * \else
	 * 表示主码流为各分辨率时,支持的辅码流分辨率,数组下标表示主码流所支持的分辨率值.
	 * \endif
	 */
	public byte				byImageSize_Assi[][] = new byte[256][256]; 
}

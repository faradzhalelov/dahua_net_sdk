package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Capture functional attributes structure
 * \else
 * 抓图功能属性结构体
 * \endif
 */
public class SDK_QUERY_SNAP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel amount 
	 * \else
	 * 通道号
	 * \endif
	 */
	public int					nChannelNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Resolution(Bit). Please refer to enumeration {@link CAPTURE_SIZE}
	 * \else
	 * 分辨率(按位)，具体查看枚举 {@link CAPTURE_SIZE}
	 * \endif
	 */
	public int					dwVideoStandardMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Valid length of Frequency[128] array
	 * \else
	 * Frequence[128]数组的有效长度
	 * \endif
	 */
	public int					nFramesCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Frame rate(value) 
	 * -25:1f/25s;-24:1f/24s;-23:1f/23s;-22:1f/23s
	 * ?-?-
	 * 0: invalid;1:1f/s;2:2f/s;3:13f/s
	 * 4:4f/s;5:5f/s;17:17f/s;18:18f/s
	 * 19:19f/s;20:20f/s
	 * ?-?-
	 * 25: 25f/s
	 * \else
	 * 帧率(按数值)
	 * -25：25秒1帧；-24：24秒1帧；-23：23秒1帧；-22：22秒1帧
	 * ……
	 * 0：无效；1：1秒1帧；2：1秒2帧；3：1秒3帧
	 * 4：1秒4帧；5：1秒5帧；17：1秒17帧；18：1秒18帧
	 * 19：1秒19帧；20：1秒20帧
	 * ……
	 * 25: 1秒25帧
	 * \endif
	 */
	public byte					Frames[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * valid length of SnapMode[16] array
	 * \else
	 * SnapMode[16]数组的有效长度
	 * \endif
	 */
	public int					nSnapModeCount;
	
	/**
	 * \if ENGLISH_LANG
	 * (value)0:activate scheduled snapshot,1:Manually activate snapshot
	 * \else
	 * (按数值)0：定时触发抓图，1：手动触发抓图
	 * \endif
	 */
	public byte					SnapMode[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Valid length of Format[16] array
	 * \else
	 * Format[16]数组的有效长度
	 * \endif
	 */
	public int					nPicFormatCount;
	
	/**
	 * \if ENGLISH_LANG
	 * (Value)0:BMP format,1:JPG format
	 * \else
	 * (按数值)0：BMP格式，1：JPG格式
	 * \endif
	 */
	public byte 				PictureFormat[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * valid length of Quality[32] array
	 * \else
	 * Quality[32]数组的有效长度
	 * \endif
	 */
	public int					nPicQualityCount;
	
	/**
	 * \if ENGLISH_LANG
	 * value
	 * 100:Image quality 100%;80:Image quality 80%;60:Image quality60%
	 * 50:Image quality50%;30:Image quality30%;10:Image quality10%
	 * \else
	 * 按数值
	 * 100：图象质量100%；80:图象质量80%；60:图象质量60%
	 * 50:图象质量50%；30:图象质量30%；10:图象质量10%
	 * \endif
	 */
	public byte 				PictureQuality[] = new byte[32];
}

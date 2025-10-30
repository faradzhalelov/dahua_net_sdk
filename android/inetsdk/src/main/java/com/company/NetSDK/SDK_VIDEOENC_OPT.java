package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Channel audio and video properties
 * \else
 * 通道音视频属性
 * \endif
 */
public class SDK_VIDEOENC_OPT implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * The Video Enable; 1: open, 0: Close
	 * \else
	 * 视频使能；1：打开，0：关闭
	 * \endif
	 */
	
	public byte				byVideoEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Stream Control; referring to the constant stream control "defined as follows:
	 * Definition			Numerical 
	 * SDK_CAPTURE_BRC_CBR	0 
	 * SDK_CAPTURE_BRC_VBR	1 
	 * \else
	 * 码流控制；参照常量"码流控制"定义
	 * \endif
	 */
	public byte				byBitRateControl;
	
	/**
	 * \if ENGLISH_LANG
	 * Frame rate
	 * \else
	 * 帧率
	 * \endif
	 */
	public byte				byFramesPerSec;
	
	/**
	 * \if ENGLISH_LANG
	 * Encode mode:please refer to constant Encode Mode definition
	 * \else
	 * 编码模式；参照常量"编码模式"定义
	 * \endif
	 */
	public byte				byEncodeMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Resolution:please refer to constant Resolution definition.
	 * \else
	 * 分辨率；参照常量"分辨率"定义
	 * \endif
	 */
	public byte				byImageSize;
	
	/**
	 * \if ENGLISH_LANG
	 * Level 1-6
	 * \else
	 * 将byImageQlty进行扩展，若byImageQlty为0，抓图配置的ImgQlty为10/30/50/60/80/100六个值，码流配置的ImgQlty值为1-6，兼容之前的1-6档次，若//ImgQltyType为1，则ImgQlty范围为0~100
	 * \endif
	 */
	public byte				byImageQlty;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 
	 * \endif
	 */
	public byte             byImageQltyType;
	
	/**
	 * \if ENGLISH_LANG
	 * Limit stream parameter
	 * \else
	 * 限码流参数
	 * \endif
	 */
	public int				wLimitStream;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable audio;1:open,0:close
	 * \else
	 * 音频使能；1：打开，0：关闭
	 * \endif
	 */
	public byte				byAudioEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio encode mode:0:G711A,1:PCM,2:G711U,3:AMR,4:AAC
	 * \else
	 * 音频编码类型: 0:G711A,1:PCM,2:G711U,3:AMR,4:AAC
	 * \endif
	 */
	public byte				wFormatTag;
	
	/**
	 * \if ENGLISH_LANG
	 * Track amount
	 * \else
	 * 声道数
	 * \endif
	 */
	public int				nChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Sampling depth 	
	 * \else
	 * 采样深度	
	 * \endif
	 */
	public int				wBitsPerSample;
	
	/**
	 * \if ENGLISH_LANG
	 * Enabling audio
	 * \else
	 * 音频叠加使能
	 * \endif
	 */
	public byte				bAudioOverlay;
	
	/**
	 * \if ENGLISH_LANG
	 * H.264 Profile rank(when byEncodeMode is h264, this value works ), see enmu struct {@link EM_H264_PROFILE_RANK}, when this value is 0, it means nothing
	 * \else
	 * H.264 Profile等级(当编码模式为H264时此参数值有效),参照枚举类型 {@link EM_H264_PROFILE_RANK}, 传0，兼容以前，表示该字段无效，不需要考虑级别。
	 * \endif
	 */
	public byte				bH264ProfileRank;
	
	/**
	 * \if ENGLISH_LANG
	 * Sampling rate
	 * \else
	 * 采样率
	 * \endif
	 */
	public int				nSamplesPerSec;
	
	/**
	 * \if ENGLISH_LANG
	 * 0-149. I frame interval amount. Describe the P frame amount between two I frames.
	 * \else
	 * I帧间隔帧数量，描述两个I帧之间的P帧个数，0-149
	 * \endif
	 */
	public byte				bIFrameInterval;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte				bScanMode;
}

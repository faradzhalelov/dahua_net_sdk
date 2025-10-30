package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The image channel properties structure
 * \else
 * 图像通道属性结构体
 * \endif
 */
public class SDKDEV_CHANNEL_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Noise and threshold,judicial burning equipment 
	 * \else
	 * 燥音的阀值,刻录设备使用
	 * \endif
	 */
	public byte				bNoise;
	
	/**
	 * \if ENGLISH_LANG
	 * (Mobile special demand)Mode 1(Image priority) mode 2(smooth priority) mode 3(custom) 
	 * \else
	 * (车载特殊需求)模式一(画质优先):录像分辨率采用4路D1.帧率2fps.码率128kbps(每小时225MB)
	 * 模式二(流畅优先):录像分辨率采用4路CIF.帧率12fps.码率256kbps(每小时550MB)
	 * 模式三(自定义)录像分辨率可以由用户自定义.限定最大能力为4CIF/25fps
	 * \endif
	 */
	public byte				bMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel name 
	 * \else
	 * 通道名称
	 * \endif
	 */
	public byte				szChannelName[] = new byte[FinalVar.SDK_CHAN_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Main stream 
	 * \else
	 * 主码流
	 * \endif
	 */
	public SDK_VIDEOENC_OPT		stMainVideoEncOpt[] = new SDK_VIDEOENC_OPT[REC_TYPE.SDK_REC_TYPE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Extra Stream 
	 * \else
	 * 辅码流
	 * \endif
	 */
	public SDK_VIDEOENC_OPT		stAssiVideoEncOpt[] = new SDK_VIDEOENC_OPT[FinalVar.SDK_N_ENCODE_AUX];
	
	/**
	 * \if ENGLISH_LANG
	 * Image color properties 
	 * \else
	 * 图象颜色属性
	 * \endif
	 */
	public SDK_COLOR_CFG		stColorCfg[] = new SDK_COLOR_CFG[FinalVar.SDK_N_COL_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * Time overplay properties 
	 * \else
	 * 时间叠加属性
	 * \endif
	 */
	public SDK_ENCODE_WIDGET	stTimeOSD = new SDK_ENCODE_WIDGET();
	
	/**
	 * \if ENGLISH_LANG
	 * Channel name overplay properties 
	 * \else
	 * 通道名叠加属性 
	 * \endif
	 */
	public SDK_ENCODE_WIDGET	stChannelOSD = new SDK_ENCODE_WIDGET();
	
	/**
	 * \if ENGLISH_LANG
	 * Occluded regions overplay Properties 
	 * \else
	 * 遮挡区域叠加属性
	 * \endif
	 */
	public SDK_ENCODE_WIDGET	stBlindCover[] = new SDK_ENCODE_WIDGET[FinalVar.SDK_N_COVERS];
	
	/**
	 * \if ENGLISH_LANG
	 * The area covered switch;As follows \n
	 * 0x00:Not cover.0x01:Only cover equipment local Preview.
	 * 0x10:Only cover the video and network preview.0x11:All are covered
	 * \else
	 * 区域遮盖开关;0x00:不使能遮盖.0x01:仅遮盖设备本地预览.0x10:仅遮盖录像及网络预览.0x11:都遮盖
	 * \endif
	 */
	public byte				byBlindEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Area covered mask,Section A: Equipment local preview, second place: video (and network preview). 
	 * \else
	 *  区域遮盖掩码;第一位:设备本地预览;第二位:录像(及网络预览)
	 * \endif
	 */
	public byte				byBlindMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Volume threshold (adjustable from 0 to 100) 
	 * \else
	 * 音量阀值(0~100可调)
	 * \endif
	 */
	public byte				bVolume;
	
	/**
	 * \if ENGLISH_LANG
	 * Volume threshold enable 
	 * \else
	 * 音量阀值使能
	 * \endif
	 */
	public byte				bVolumeEnable;

	public SDKDEV_CHANNEL_CFG() {
		for (int i = 0; i < REC_TYPE.SDK_REC_TYPE_NUM; i++) {
			stMainVideoEncOpt[i] = new SDK_VIDEOENC_OPT();
		}
		
		for (int i = 0; i < FinalVar.SDK_N_ENCODE_AUX; i++) {
			stAssiVideoEncOpt[i] = new SDK_VIDEOENC_OPT();
		}
		
		for (int i = 0; i < FinalVar.SDK_N_COL_TSECT; i++) {
			stColorCfg[i] = new SDK_COLOR_CFG();
		}
		
		for (int i = 0; i < FinalVar.SDK_N_COVERS; i++) {
			stBlindCover[i] = new SDK_ENCODE_WIDGET();
		}
	}
}

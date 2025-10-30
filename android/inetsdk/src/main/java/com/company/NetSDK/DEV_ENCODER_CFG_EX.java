package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * front end access configuratiion parameter expansion, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_ENCODER_CFG_EX}
 * \else
 * 前端接入配置参数信息扩展, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_ENCODER_CFG_EX}
 * \endif
 */
public class DEV_ENCODER_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * number of channel
	 * \else
	 * 数字通道个数
	 * \endif
	 */
	public int                 nChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * the front end of the every digital channel encoder information
	 * \else
	 * 各数字通道的前端编码器信息
	 * \endif
	 */
	public DEV_ENCODER_INFO    stuDevInfo[] = new DEV_ENCODER_INFO[128];
	
	/**
	 * \if ENGLISH_LANG
	 * maximum number of hd video(0 means not support)
	 * \else
	 * 数字通道中最多可支持高清视频个数(为0表示不支持高清设置)
	 * 注：如果支持高清设置，高清通道为0~N-1，若将N之后的数字通道设置为高清，有可能保存不成功
	 * \endif
	 */
	public byte                byHDAbility;
	
	/**
	 * \if ENGLISH_LANG
	 * support TV adjust,0:not support,1:support.
	 * \else
	 * 设备是否支持TV调节, 0:不支持 1:支持.
	 * \endif
	 */
	public byte                bTVAdjust;
	
	/**
	 * \if ENGLISH_LANG
	 * support tour or not, 0:not support, >0:the current number of device support
	 * \else
	 * 设备是否支持解码轮巡, 0:不支持 大于0:表示前端支持轮巡最大设备数.
	 * \endif
	 */
	public byte                bDecodeTour;
	
	/**
	 * \if ENGLISH_LANG
	 * support remote PTZ control
	 * \else
	 * 指示是否支持远程云台控制。
	 * \endif
	 */
	public byte                bRemotePTZCtl;
	
	public DEV_ENCODER_CFG_EX() {
		for (int i = 0; i < 128; i++) {
			stuDevInfo[i] = new DEV_ENCODER_INFO();
		}
	}
}

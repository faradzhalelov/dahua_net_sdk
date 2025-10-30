package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * atm:overlay set configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_ATM_OVERLAY_CFG_EX}
 * \else
 * atm:配置叠加设置, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_ATM_OVERLAY_CFG_EX}
 * \endif
 */
public class SDKDEV_ATM_OVERLAY_CONFIG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 1:Net, 2:Com, 3:Com422
	 * \else
	 * 1:Net(网络), 2:Com(串口), 3:Com422(串口422)
	 * \endif
	 */
	public int               dwDataSource;

	/**
	 * \if ENGLISH_LANG
	 * protocol name
	 * \else
	 * 协议名字，
	 * \endif
	 */
	public byte                szProtocol[] = new byte[33];

	/**
	 * \if ENGLISH_LANG
	 * overlay channel,the mask means: dwChannelMask[0] is channel 1,so on
	 * \else
	 * 叠加的通道号，掩码表示, dwChannelMask[0]表示0-31通道，依此类推。
	 * \endif
	 */
	public int               dwChannelMask[] = new int[8];

	/**
	 * \if ENGLISH_LANG
	 * 1:Preview(preview), 2:Encode(encode), 3:Preview&Encode(preview and encode)
	 * \else
	 * 1:Preview(预览叠加), 2:Encode(编码叠加), 3:Preview&Encode(预览和编码叠加)
	 * \endif
	 */
	public byte                bMode;

	/**
	 * \if ENGLISH_LANG
	 * 1:LeftTop, 2:LeftBottom , 3:RightTop , 4:RightBottom
	 * \else
	 * 1:LeftTop(左上), 2:LeftBottom(左下), 3:RightTop(右上), 4:RightBottom(右下)
	 * \endif
	 */
	public byte                bLocation;

	/**
	 * \if ENGLISH_LANG
	 * latch time,0~65535s
	 * \else
	 * 叠加显示延迟时间,卡号录像延时关闭时间,0~65535s
	 * \endif
	 */
	public int                 nLatchTime;

	/**
	 * \if ENGLISH_LANG
	 * number of key word
	 * \else
	 * 关键字个数
	 * \endif
	 */
	public byte                bRecordSrcKeyNum;

	/**
	 * \if ENGLISH_LANG
	 * key word
	 * \else
	 * 各视频通道对应数据源关键字(不同通道可以对应不同的数据源)
	 * \endif
	 */
	public int                 nRecordSrcKey[] = new int[256];
}

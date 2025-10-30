package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * atm: overlay configuration
 * \else
 * atm:配置叠加设置
 * \endif
 */
public class SDKDEV_ATM_OVERLAY_CONFIG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 1:Network, 2:Comm
	 * \else
	 * 1:Net(网络), 2:Com(串口), 3:Com422(串口422)
	 * \endif
	 */
	public int               dwDataSource;

	/**
	 * \if ENGLISH_LANG
	 * protocol name, from {@link SDKDEV_ATM_OVERLAY_GENERAL}
	 * \else
	 * 协议名字，由 {@link SDKDEV_ATM_OVERLAY_GENERAL}返回
	 * \endif
	 */
	public byte                szProtocol[] = new byte[33];

	/**
	 * \if ENGLISH_LANG
	 * channel mask
	 * \else
	 * 叠加的通道号，掩码表示。
	 * \endif
	 */
	public int               dwChannelMask;

	/**
	 * \if ENGLISH_LANG
	 * 1:Preview, 2:Encode, 3:Preview&Encode
	 * \else
	 * 1:Preview(预览叠加), 2:Encode(编码叠加), 3:Preview&Encode(预览和编码叠加)
	 * \endif
	 */
	public byte                bMode;

	/**
	 * \if ENGLISH_LANG
	 * 1:LeftTop, 2:LeftBottom, 3:RightTop, 4:RightBottom
	 * \else
	 * 1:LeftTop(左上), 2:LeftBottom(左下), 3:RightTop(右上), 4:RightBottom(右下)
	 * \endif
	 */
	public byte                bLocation;

	/**
	 * \if ENGLISH_LANG
	 * display latch time on overlay, instruct the video's close latch time, 0~65535
	 * \else
	 * 叠加显示延迟时间,卡号录像延时关闭时间,0~65535s
	 * \endif
	 */
	public int                 nLatchTime;

	/**
	 * \if ENGLISH_LANG
	 * key number
	 * \else
	 * 关键字个数
	 * \endif
	 */
	public byte                bRecordSrcKeyNum;

	/**
	 * \if ENGLISH_LANG
	 * key of channels
	 * \else
	 * 各视频通道对应数据源关键字(不同通道可以对应不同的数据源)
	 * \endif
	 */
	public int                 nRecordSrcKey[] = new int[32];
}

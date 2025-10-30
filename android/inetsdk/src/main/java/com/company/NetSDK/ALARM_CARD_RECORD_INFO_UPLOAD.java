package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mobile Custom Info Uploading Structure, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_CARD_RECORD_UPLOAD}
 * \else
 * 卡号录像信息上传, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_CARD_RECORD_UPLOAD}
 * \endif
 */
public class ALARM_CARD_RECORD_INFO_UPLOAD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                    nChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * Recording or not 
	 * \else
	 * 是否正在卡号录像
	 * \endif
	 */
	public boolean                bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Card No. Info 
	 * \else
	 * 卡号信息
	 * \endif
	 */
	public byte                   szCardInfo[] = new byte[FinalVar.SDK_MAX_CARD_INFO_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * The Card No. Effect of Starting Time 
	 * \else
	 * 该卡号生效起始时间
	 * \endif
	 */
	public NET_TIME               stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * Preview Overlay Enable 
	 * \else
	 * 预览叠加使能
	 * \endif
	 */
	public boolean                bPreviewOverlayEn;
	
 	/**
	 * \if ENGLISH_LANG
	 * Overlay Position,1-Upper Left，2-Lower Left，3-Upper Right，4-Lower Right 
	 * \else
	 * 叠加位置,1-左上，2-左下，3-右上，4-右下
	 * \endif
	 */
	public byte                   byOverlayPos;                       
}

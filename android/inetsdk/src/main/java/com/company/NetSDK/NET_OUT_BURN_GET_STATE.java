package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#BurnGetState} output param
 * \else
 * 接口 {@link INetSDK#BurnGetState}接口输出参数
 * \endif
 */
public class NET_OUT_BURN_GET_STATE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * burning status, corresponding to {@link NET_BURN_STATE}
	 * \else
	 *  刻录状态,取值参考 {@link NET_BURN_STATE}
	 * \endif
	 */
	public 	int emState;
	
	/**
	 * \if ENGLISH_LANG
	 *  burning error code, corresponding to {@link NET_BURN_ERROR_CODE}
	 * \else
	 *  刻录错误码,取值参考 {@link NET_BURN_ERROR_CODE}
	 * \endif
	 */
	public int  emErrorCode;       
	
	/**
	 * \if ENGLISH_LANG
	 *  burning device mask, by bit means multiple device group
	 * \else
	 *  刻录设备掩码, 按位表示多个刻录设备组合
	 * \endif
	 */
	public int  nDevMask;       
	      
	/**
	 * \if ENGLISH_LANG
	 *  burning error code
	 * \else
	 *  刻录通道数组
	 * \endif
	 */
	 public int              nChannels[] = new int[FinalVar.SDK_MAX_BURN_CHANNEL_NUM];
	 
	 /**
	 * \if ENGLISH_LANG
	 * burning channel number
	 * \else
	 *  刻录通道数
	 * \endif
	 */
	 public int                  nChannelCount; 
	 
	 /**
	 * \if ENGLISH_LANG
	 * burning mode， corresponding to {@link NET_BURN_MODE}
	 * \else
	 * 刻录模式,取值参考 {@link NET_BURN_MODE}
	 * \endif
	 */
	 public int 				 emMode;     
	  
	 /**
	 * \if ENGLISH_LANG
	 * urning stream format， corresponding to {@link NET_BURN_RECORD_PACK}
	 * \else
	 * 刻录流格式,取值参考 {@link NET_BURN_RECORD_PACK}
	 * \endif
	 */
	 public int					 emPack;        

	 /**
	 * \if ENGLISH_LANG
	 * current burning file no
	 * \else
	 * 当前刻录文件编号
	 * \endif
	 */
	 public int                  nFileIndex;        
	 
	 /**
	 * \if ENGLISH_LANG
	 * burning start time
	 * \else
	 * 刻录开始时间
	 * \endif
	 */
	 public NET_TIME             stuStartTime = new NET_TIME();
	 
	 /**
	 * \if ENGLISH_LANG
	 * burning device status
	 * \else
	 *  刻录设备状态
	 * \endif
	 */
	 public NET_BURN_DEV_STATE          stuDevState[] = new NET_BURN_DEV_STATE[FinalVar.SDK_MAX_BURNING_DEV_NUM]; 
	 
	 /**
	 * \if ENGLISH_LANG
	 * burning remain time, unit second, -1 means invalid
	 * \else
	 *  刻录剩余时间, 单位秒, -1代表无效
	 * \endif
	 */
	 public int                  nRemainTime;
	 
	 /**
	 * \if ENGLISH_LANG
	 * extra mode, refer to {@link NET_BURN_EXTMODE}, when emExtMode = BURN_EXTMODE_NODISK,stuDevState maybe invalid
	 * \else
	 *  扩展模式,取值参考  {@link NET_BURN_EXTMODE},当为无盘刻录时，stuDevState可能无效
	 * \endif
	 */
	 public int		             emExtMode;							
	 
	 public NET_OUT_BURN_GET_STATE()
	 {
		 for(int i = 0; i < FinalVar.SDK_MAX_BURNING_DEV_NUM; i++)
		 {
			 stuDevState[i] = new NET_BURN_DEV_STATE();
		 }
	 }
	 
}

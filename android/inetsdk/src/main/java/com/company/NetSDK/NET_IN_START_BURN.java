package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#StartBurn} input param
 * \else
 * {@link INetSDK#StartBurn} 接口输入参数
 * \endif
 */
public class NET_IN_START_BURN implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * burning device mask, by bit means multiple burning device group
	 * \else
	 * 刻录设备掩码, 按位表示多个刻录设备组合
	 * \endif
	 */
    public int                  nDevMask;           
    
    /**
	 * \if ENGLISH_LANG
	 * burning channel group
	 * \else
	 * 刻录通道数组
	 * \endif
	 */
    public int                  szChannels[] = new int[FinalVar.SDK_MAX_BURN_CHANNEL_NUM]; 
    
    /**
	 * \if ENGLISH_LANG
	 * burning channel group
	 * \else
	 * 刻录通道数
	 * \endif
	 */
    public int                  nChannelCount;                          
    
    /**
  	 * \if ENGLISH_LANG
  	 * burning mode，value corresponding to {@link NET_BURN_MODE}
  	 * \else
  	 * 刻录模式,取值参考 {@link NET_BURN_MODE}
  	 * \endif
  	 */
    public int        			emMode;          
    
    /**
  	 * \if ENGLISH_LANG
  	 * burning stream format，value corresponding to {@link NET_BURN_RECORD_PACK}
  	 * \else
  	 * 刻录流格式, 取值参考 {@link NET_BURN_RECORD_PACK}
  	 * \endif
  	 */
    public int 				    emPack;    
    
    /**
  	 * \if ENGLISH_LANG
  	 * Extension Burning mode, refer to {@link NET_BURN_EXTMODE}
  	 * \else
  	 * 刻录扩展模式, 取值参考 {@link NET_BURN_EXTMODE}
  	 * \endif
  	 */
     public int                emExtMode;                            
}

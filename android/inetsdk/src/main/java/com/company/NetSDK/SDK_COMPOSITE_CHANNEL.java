package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device composite channel information, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_COMPOSITE_CHN}
 * \else
 * 融合屏通道信息, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_COMPOSITE_CHN}
 * \endif
 */
public class SDK_COMPOSITE_CHANNEL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
    
    /**
	 * \if ENGLISH_LANG
	 * Monitor wall name
	 * \else
	 * 电视墙名称
	 * \endif
	 */
    public byte[]           szMonitorWallName = new byte[FinalVar.SDK_DEVICE_NAME_LEN];  
    
    /**
	 * \if ENGLISH_LANG
	 * Composite ID
	 * \else
	 * 融合屏ID
	 * \endif
	 */
    public byte[]           szCompositeID = new byte[FinalVar.SDK_DEV_ID_LEN_EX]; 
    
    /**
	 * \if ENGLISH_LANG
	 * Virtual channel
	 * \else
	 * 虚拟通道号
	 * \endif
	 */
    public int              nVirtualChannel;                     

}

package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* channel info
* \else
* 通道信息
* \endif
*/
public class NET_LOGIC_CHANNEL_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * classroom id
	 * \else
	 * 教室ID号
	 * \endif
	 */
    public int                      nRoomID;                        
    
	 /**
	 * \if ENGLISH_LANG
	 * logic channel id, refer to {@link NET_EM_LOGIC_CHANNEL}
	 * \else
	 * 逻辑通道号, 参看 {@link NET_EM_LOGIC_CHANNEL}
	 * \endif
	 */
    public int         				emLogicChannel;                 
}

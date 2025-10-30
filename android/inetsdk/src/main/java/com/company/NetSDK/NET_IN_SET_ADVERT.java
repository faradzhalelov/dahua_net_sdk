package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#SetAIOAdvert} input parameter(set NVR advert)
 * \else
 * {@link INetSDK#SetAIOAdvert} 接口输入参数(设置NVR广告)
 * \endif
 */

public class NET_IN_SET_ADVERT implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 *advert action, refer to {@link NET_EM_ADVERT_ACTION}
	 * \else
	 *广告播放,对应 {@link NET_EM_ADVERT_ACTION}
	 * \endif
	 */
    public int        			emAction;         

	/**
	 * \if ENGLISH_LANG
	 *advert roll speed.
	 * \else
	 *广告滚动速度.
	 * \endif
	 */
    public int					nSpeed;      
    
	/**
	 * \if ENGLISH_LANG
	 *advert position, refer to {@link NET_EM_ADVERT_POSITION}
	 * \else
	 *广告位置,对应  {@link NET_EM_ADVERT_POSITION}
	 * \endif
	 */
    public int				   emPosition;          
}

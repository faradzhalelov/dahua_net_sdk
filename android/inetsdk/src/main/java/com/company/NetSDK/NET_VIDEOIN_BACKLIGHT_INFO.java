package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * back light config of video
 * \else
 * 背光配置
 * \endif
 */
public class NET_VIDEOIN_BACKLIGHT_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * config type, you need set the value wether set or get config, refer to {@link NET_EM_CONFIG_TYPE}
	 * \else
	 * 配置类型，获取和设置时都要指定,取值参考{@link NET_EM_CONFIG_TYPE}
	 * \endif
	 */
	public int						emCfgType;			
	
	/**
	 * \if ENGLISH_LANG
	 * black mode, refer to {@link NET_EM_BACK_MODE}
	 * \else
	 * 背光模式,取值参考 {@link NET_EM_BACK_MODE}
	 * \endif
	 */
	public int						emBlackMode;			
	
	/**
	 * \if ENGLISH_LANG
	 * black light mode, refer to {@link NET_EM_BLACKLIGHT_MODE}
	 * \else
	 * 背光补偿模式,取值参考 {@link NET_EM_BLACKLIGHT_MODE}
	 * \endif
	 */
	public int						emBlackLightMode;		
	
	/**
	 * \if ENGLISH_LANG
	 * the region of black light
	 * \else
	 * 背光补偿区域  
	 * \endif
	 */
	public NET_RECT					stuBacklightRegion = new NET_RECT();     
	
	/**
	 * \if ENGLISH_LANG
	 * the value of widedynamic, it is valid when emBlackMode is {@link NET_EM_BACK_MODE#NET_EM_BACKLIGHT_MODE_WIDEDYNAMIC}
	 * \else
	 * 宽动态值，emBlackMode为{@link NET_EM_BACK_MODE#NET_EM_BACKLIGHT_MODE_WIDEDYNAMIC}时生效
	 * \endif
	 */
	public int						nWideDynamicRange;		
	
	/**
	 * \if ENGLISH_LANG
	 * the value of glareinhibition, it is valid when emBlackMode is {@link NET_EM_BACK_MODE#NET_EM_BACKLIGHT_MODE_GLAREINHIBITION}
	 * \else
	 * 强光抑制0-100，emBlackMode为{@link NET_EM_BACK_MODE#NET_EM_BACKLIGHT_MODE_GLAREINHIBITION}时生效
	 * \endif
	 */
	public int						nGlareInhibition;		
}

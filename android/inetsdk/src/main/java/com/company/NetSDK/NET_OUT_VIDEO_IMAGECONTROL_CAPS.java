package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * output paramer, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_VIDEO_IMAGECONTROL_CAPS}
 * \else
 * 出参, 对应接口 {@link INetSDK#GetDevCaps},对应命令 {@link FinalVar#NET_VIDEO_IMAGECONTROL_CAPS}
 * \endif
 */
public class NET_OUT_VIDEO_IMAGECONTROL_CAPS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * support Mirror or Flip or Rotate90 or not
	 * \else
	 * Mirror,Flip,Rotate90三者任一支持则true
	 * \endif
	 */
	public boolean							bSupport;						
	
	/**
	 * \if ENGLISH_LANG
	 * support mirror or not
	 * \else
	 * 是否支持画面镜像功能
	 * \endif
	 */
	public boolean							bMirror;						
	
	/**
	 * \if ENGLISH_LANG
	 * support flip or not
	 * \else
	 * 是否支持画面180翻转功能
	 * \endif
	 */
	public boolean							bFlip;							
	
	/**
	 * \if ENGLISH_LANG
	 * support rotate90 or not
	 * \else
	 * 支持的画面90/270度旋转
	 * \endif
	 */
	public boolean							bRotate90;						
	
	/**
	 * \if ENGLISH_LANG
	 * support freeze or not
	 * \else
	 * 是否支持图像冻结功能
	 * \endif
	 */
	public boolean							bFreeze;						 
	
	/**
	 * \if ENGLISH_LANG
	 * support stable or not, refer to {@link NET_EM_STABLE_CAPS_TYPE}
	 * \else
	 * 支持图像防抖的功能,取值参考{@link NET_EM_STABLE_CAPS_TYPE}
	 * \endif
	 */
	public int								emStable;						 
}

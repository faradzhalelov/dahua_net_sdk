package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * snap upload configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_SNAP_UPLOAD_CFG}
 * \else
 * 图片上传配置信息配置结构, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_SNAP_UPLOAD_CFG}
 * \endif
 */
public class SDKDEV_SNAP_UPLOAD_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the interval time of upload picture(s)
	 * \else
	 * 定时抓图图片上传间隔，单位秒
	 * \endif
	 */
	public int                 nUploadInterval;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video backup config parameter, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_BACKUP_VIDEO_FORMAT}
 * \else
 * 视频备份配置, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_BACKUP_VIDEO_FORMAT}
 * \endif
 */
public class SDKDEV_BACKUP_VIDEO_FORMAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * file type to backup, 0:dav, 1:asf
	 * \else
	 * 备份文件类型, 0:dav, 1:asf
	 * \endif
	 */
	public byte    backupVideoFormat;

	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * 备份密码
	 * \endif
	 */
	public byte    password[] = new byte[6];
}

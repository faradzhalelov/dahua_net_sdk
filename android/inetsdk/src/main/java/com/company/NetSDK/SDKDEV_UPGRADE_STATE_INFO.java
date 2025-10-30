package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * device program upgrade status, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_GET_UPGRADE_STATE}
 * \else
 * 获取设备升级状态, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_GET_UPGRADE_STATE}
 * \endif
 */
public class SDKDEV_UPGRADE_STATE_INFO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * 0:None- no update found, default status; 1:Regular-general upgrade; 2:Emergency-forced; 3:Upgrading-upgrading
	 * \else
	 * 0:None-没有检测到更新, 默认状态; 1:Regular-一般升级; 2:Emergency-强制升级; 3:Upgrading-升级中
	 * \endif
	 */
    public int                 nState;
	/**
	 * \if ENGLISH_LANG
	 * old version
	 * \else
	 * 旧版本
	 * \endif
	 */
    public byte                szOldVersion[] = new byte[FinalVar.UPDATE_VERSION_LEN];
	/**
	 * \if ENGLISH_LANG
	 * new version
	 * \else
	 * 新版本
	 * \endif
	 */
    public byte                szNewVersion[] = new byte[FinalVar.UPDATE_VERSION_LEN];
	/**
	 * \if ENGLISH_LANG
	 * progress
	 * \else
	 * 升级进度
	 * \endif
	 */
    public long                dwProgress;
}

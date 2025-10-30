package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Query upgrade-state output parameter, the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_UPGRADE_STATE}
 * \else
 * 查询升级状态出参, 对应接口{@link INetSDK#QueryDevInfo},对应命令 {@link FinalVar#NET_QUERY_UPGRADE_STATE}
 * \endif
 */
public class NET_OUT_UPGRADE_STATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * old version
	 * \else
	 * 旧版本号
	 * \endif
	 */
	public byte[] szOldVersion = new byte[FinalVar.SDK_COMMON_STRING_64]; 
	
	/**
	 * \if ENGLISH_LANG
	 * new version
	 * \else
	 * 新版本号
	 * \endif
	 */
	public byte[] szNewVersion = new byte[FinalVar.SDK_COMMON_STRING_64]; 
	
	/**
	 * \if ENGLISH_LANG
	 *  upgrade package and upgrade state, refer to  {@link EM_UPGRADE_STATE}
	 * \else
	 * 升级包和升级状态，取值参考 {@link EM_UPGRADE_STATE}
	 * \endif
	 */
	public int         emState;
	
	/**
	 * \if ENGLISH_LANG
	 * upgrade package type, refer to {@link EM_UPGRADE_PACKAGE_TYPE}
	 * \else
	 * 升级包类型, 取值参考 {@link EM_UPGRADE_PACKAGE_TYPE}
	 * \endif
	 */
	public int  emType; 
	
	/**
	 * \if ENGLISH_LANG
	 * progress of upgrading 0 - 100
	 * \else
	 * 升级进度, 0 ~ 100
	 * \endif
	 */
	public int nProgress;
}

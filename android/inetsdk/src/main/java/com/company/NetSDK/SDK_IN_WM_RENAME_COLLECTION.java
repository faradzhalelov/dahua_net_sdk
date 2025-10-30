package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#RenameMonitorWallCollection} 's interface input param(plan rename)
 * \else
 * {@link INetSDK#RenameMonitorWallCollection} 接口输入参数(预案重命名)
 * \endif
 */
public class SDK_IN_WM_RENAME_COLLECTION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Monitor wall ID
	 * \else
	 * 电视墙序号
	 * \endif
	 */
	public int					nMonitorWallID;
	
	/**
	 * \if ENGLISH_LANG
	 * Old name
	 * \else
	 * 原名称
	 * \endif
	 */
	public String				pszOldName;
	
	/**
	 * \if ENGLISH_LANG
	 * New name
	 * \else
	 * 新名称
	 * \endif
	 */
	public String				pszNewName;
}

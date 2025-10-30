package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#ControlDevice} interface, the corresponding command {@link CtrlType#SDK_CTRL_CLOSE_BURNER}
 * \else
 * {@link INetSDK#ControlDevice} 接口的 {@link CtrlType#SDK_CTRL_CLOSE_BURNER} 等 命令参数
 * \endif
 */
public class NET_CTRL_BURNERDOOR implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * cd name,like "/dev/sda"
	 * \else
	 * 光盘名称，如“/dev/sda”
	 * \endif
	 */
	public String       szBurnerName; 
	
	/**
	 * \if ENGLISH_LANG
	 * operate result
	 * \else
	 * 操作结果
	 * \endif
	 */
	public boolean      bResult; 
	
	/**
	 * \if ENGLISH_LANG
	 * Whether The Security Pop-up Drive, Data Save TRUE- pop Up Before, FALSE- Display)
	 * \else
	 * 是否安全弹出光驱, TRUE-弹出前做数据保存, FALSE-直接弹出
	 * \endif
	 */
	public boolean		bSafeEject; 
}

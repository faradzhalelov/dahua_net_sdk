package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record Mode, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_RECORDMODE}
 * \else
 * 录像模式, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_RECORDMODE}
 * \endif
 */
public class AV_CFG_RecordMode implements Serializable {

 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Record Mode, 0-Auto Record，1-Mannul Record，2-Shutdown Record 
	 * \else
	 * 录像模式, 0-自动录像，1-手动录像，2-关闭录像 
	 * \endif
	 */
	public int					nMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Sub stream 1 record mode, 0-auto, 1-manual, 2-OFF
	 * \else
	 * 辅码流1录像模式, 0-自动录像，1-手动录像，2-关闭录像
	 * \endif
	 */
	public int			        nModeExtra1;

	/**
	 * \if ENGLISH_LANG
	 * Sub stream 2 record mode, 0-auto, 1-manual, 2-OFF
	 * \else
	 * 辅码流2录像模式, 0-自动录像，1-手动录像，2-关闭录像
	 * \endif
	 */
	public int			        nModeExtra2;
}

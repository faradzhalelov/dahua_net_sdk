package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#attachAIOFileProc} input parameter
 * \else
 * 接口 {@link INetSDK#attachAIOFileProc} 输入参数
 * \endif
 */
public class NET_IN_ATTACH_AIO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Registration update file processing recall function, lAttachHandle is attachAIOFileProc return value
	 * \else
	 * 注册升级文件处理回调函数原形,lAttachHandle是 attachAIOFileProc返回值, 每次1条,pBuf->dwSize == nBufLen
	 * \endif
	 */
	public CB_fAttachAIOFileprocCB cbNotify;
	
}

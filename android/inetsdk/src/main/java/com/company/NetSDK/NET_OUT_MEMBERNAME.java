package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetMemberNames} output parameter
 * \else
 * {@link INetSDK#GetMemberNames} 输出参数
 * \endif
 */
public class NET_OUT_MEMBERNAME implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The error code device returns
	 * \else
	 * 设备返回的错误码
	 * \endif
	 */
	public int           nError;
	
	/**
	 * \if ENGLISH_LANG
	 * Device reboot or not
	 * \else
	 * 设备是否重启
	 * \endif
	 */
	public int           nRestart;
	
	/**
	 * \if ENGLISH_LANG
	 * Name amount. Fromt the capability set. Caller fill in.
	 * \else
	 * 名称个数 通过能力集得到，调用者填写
	 * \endif
	 */
	public int           nTotalNameCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The returned actual name amount
	 * \else
	 * 返回的实际名称个数
	 * \endif
	 */
	public int           nRetNameCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Name array. The caller apply for the memory. The amount is nTotalNameCount.
	 * \else
	 * 名称数组 调用者申请内存，个数是nTotalNameCount个
	 * \endif
	 */
	public NET_ARRAY[]   pstNames;
	
	public NET_OUT_MEMBERNAME(int nTotalNameCount, int nNameLen) {
		this.nTotalNameCount = nTotalNameCount;
		pstNames = new NET_ARRAY[nTotalNameCount];
		for (int i = 0; i < nTotalNameCount; i++) {
			pstNames[i] = new NET_ARRAY();
			pstNames[i].dwArrayLen = nNameLen;
			pstNames[i].pArray = new byte[nNameLen];
		}
	}
}

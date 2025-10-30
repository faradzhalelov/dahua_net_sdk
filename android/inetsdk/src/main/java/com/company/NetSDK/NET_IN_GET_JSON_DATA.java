package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetJsonData(NET_IN_GET_JSON_DATA)} input param
 * \else
 * {@link INetSDK#GetJsonData(NET_IN_GET_JSON_DATA)} 接口输入参数
 * \endif
 */
public class NET_IN_GET_JSON_DATA implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * The memory size allocated for pszInBuf
	 * \else
	 * pszInBuf申请内存大小
	 * \endif
	 */
    public int                 nMaxInBufLen;
    
	/**
	 * \if ENGLISH_LANG
	 * The memory size returned by pszInBuf
	 * \else
	 * pszInBuf返回内容大小
	 * \endif
	 */
    public int                 nRetInBufLen;
    
	/**
	 * \if ENGLISH_LANG
	 * The memory size allocated for pszOutBuf
	 * \else
	 * pszOutBuf申请内存大小
	 * \endif
	 */
    public int                 nMaxOutBufLen;

	/**
	 * \if ENGLISH_LANG
	 * The memory size returned by pszOutBuf
	 * \else
	 * pszOutBuf返回内容大小
	 * \endif
	 */
	public int                 nRetOutBufLen;

	/**
	 * \if ENGLISH_LANG
	 * The json content sent by the SDK, the memory is released by the user
	 * \else
	 * SDK下发json内容，内存由用户申请释放
	 * \endif
	 */
	public byte[]                 pszInBuf;

	/**
	 * \if ENGLISH_LANG
	 * The json content returned form the device, the memory is released by the user
	 * \else
	 * 设备返回json内容，内存由用户申请释放
	 * \endif
	 */
	public byte[]                 pszOutBuf;

	public NET_IN_GET_JSON_DATA(int nMaxInBufLen, int nMaxOutBufLen) {
		this.nMaxInBufLen = nMaxInBufLen;
		this.nMaxOutBufLen = nMaxOutBufLen;
		this.pszInBuf = new byte[nMaxInBufLen];
		this.pszOutBuf = new byte[nMaxOutBufLen];
	}
}

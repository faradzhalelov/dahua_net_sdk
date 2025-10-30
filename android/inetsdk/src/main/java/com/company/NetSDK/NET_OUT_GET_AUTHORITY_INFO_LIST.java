package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output param for authority info
 * \else
 * 获取权限类型信息（出参）
 * \endif
 */
public class NET_OUT_GET_AUTHORITY_INFO_LIST implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the returen num of authority info
	 * \else
	 * 返回的权限类型信息个数
	 * \endif
	 */
    public int nRetAuthInfoCount;                                          
    
	/**
	 * \if ENGLISH_LANG
	 * the data of authority info
	 * \else
	 * 返回的权限类型信息数据
	 * \endif
	 */
    public NET_AUTH_CLASSIFY_INFO[] stuAuthInfo = new NET_AUTH_CLASSIFY_INFO[FinalVar.NET_AUTHORITY_CLASS_MAX_NUM];
    
    public NET_OUT_GET_AUTHORITY_INFO_LIST() {
    	for(int i = 0; i< FinalVar.NET_AUTHORITY_CLASS_MAX_NUM; i++) {
    		stuAuthInfo[i] = new NET_AUTH_CLASSIFY_INFO();
    	}
    }
}

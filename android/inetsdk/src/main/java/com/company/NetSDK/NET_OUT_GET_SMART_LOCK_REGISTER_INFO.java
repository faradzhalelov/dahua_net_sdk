package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the output parameters of {@link INetSDK#GetSmartLockRegisterInfo}
 * \else
 * {@link INetSDK#GetSmartLockRegisterInfo}的出参
 * \endif
 */
public class NET_OUT_GET_SMART_LOCK_REGISTER_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * total user number
	 * \else
	 * 总的用户数量
	 * \endif
	 */
	public int nTotalCount;
	
	/**
	 * \if ENGLISH_LANG
	 * returned user count
	 * \else
	 * 实际返回的用户数量
	 * \endif
	 */
	public int nReturnCount;
	
	/**
	 * \if ENGLISH_LANG
	 * user register information
	 * \else
	 * 注册用户的信息
	 * \endif
	 */
	public NET_SMART_LOCK_REGISTER_INFO[] stuRegisterInfo = new NET_SMART_LOCK_REGISTER_INFO[FinalVar.MAX_NUMBER_REGISTER_INFO];
	
	public NET_OUT_GET_SMART_LOCK_REGISTER_INFO(){
		for(int i=0;i<stuRegisterInfo.length;i++){
			stuRegisterInfo[i] = new NET_SMART_LOCK_REGISTER_INFO();
		}
	}
	
}

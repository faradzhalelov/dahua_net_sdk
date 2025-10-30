package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * enum of coursemedia operate 
 * \else
 * 录播主机组合通道操作
 * \endif
 */

public class EM_COURSECOMPOSITE_OPERATE_TYPE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * control composite and logic channel lock or unlock， pInParam refer to {@link NET_IN_COURSECOMPOSITE_LOCK_CONTROL} pOutParam refer to {@link NET_OUT_COURSECOMPOSITE_LOCK_CONTROL}
	 * \else
	 * 控制组合通道与逻辑通道，pInParam 取值参考 {@link NET_IN_COURSECOMPOSITE_LOCK_CONTROL}  pOutParam取值参考 {@link NET_OUT_COURSECOMPOSITE_LOCK_CONTROL}
	 * \endif
	 */
	public static final int EM_COURSECOMPOSITE_TYPE_LOCK_CONTROL    = 0;    
	
	/**
	 * \if ENGLISH_LANG
	 * get composite and logic channel lock state， pInParam refer to {@link NET_IN_COURSECOMPOSITE_GET_LOCKSTATE} pOutParam refer to {@link NET_OUT_COURSECOMPOSITE_GET_LOCKSTATE}
	 * \else
	 * 获取组合通道与逻辑通道的锁定信息，pInParam 取值参考 {@link NET_IN_COURSECOMPOSITE_GET_LOCKSTATE}  pOutParam 取值参考 {@link NET_OUT_COURSECOMPOSITE_GET_LOCKSTATE}
	 * \endif
	 */
	public static final int EM_COURSECOMPOSITE_TYPE_GET_LOCKINFO   = 1;            
    
	 /**
	 * \if ENGLISH_LANG
	 * get Compositechannel info, pInParam refer to {@link NET_IN_COURSECOMPOSITE_GET_INFO} pOutParam refer to {@link NET_OUT_COURSECOMPOSITE_GET_INFO}
	 * \else
	 * 获取组合通道信息, pInParam 取值参考 {@link NET_IN_COURSECOMPOSITE_GET_INFO}  pOutParam 取值参考 {@link NET_OUT_COURSECOMPOSITE_GET_INFO}
	 * \endif
	 */
    public static final int EM_COURSECOMPOSITE_TYPE_GET_INFO       = 2;                       
    
	 /**
	 * \if ENGLISH_LANG
	 * set compositechannel info, pInParam refer to {@link NET_IN_COURSECOMPOSITE_SET_INFO} pOutParam refer to {@link NET_OUT_COURSECOMPOSITE_SET_INFO}
	 * \else
	 * 设置组合通道信息, pInParam 取值参考 {@link NET_IN_COURSECOMPOSITE_SET_INFO}  pOutParam 取值参考 {@link NET_OUT_COURSECOMPOSITE_SET_INFO}
	 * \endif
	 */
    public static final int EM_COURSECOMPOSITE_TYPE_SET_INFO       = 3;                       
    
	 /**
	 * \if ENGLISH_LANG
	 * update compositechannel info to time，pInParam refer to {@link NET_IN_COURSECOMPOSITE_UPDATE_INFO} pOutParam refer to {@link NET_OUT_COURSECOMPOSITE_UPDATE_INFO}
	 * \else
	 * 将组合通道信息更新到time时的信息，pInParam 取值参考 {@link NET_IN_COURSECOMPOSITE_UPDATE_INFO}  pOutParam 取值参考 {@link NET_OUT_COURSECOMPOSITE_UPDATE_INFO} 
	 * \endif
	 */
    public static final int EM_COURSECOMPOSITE_TYPE_UPDATE_INFO    = 4;                   

}

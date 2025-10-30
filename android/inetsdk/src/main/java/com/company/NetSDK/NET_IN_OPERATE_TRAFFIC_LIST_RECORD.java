package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input parameter of {@link INetSDK#OperateTrafficList}
 * \else
 * {@link INetSDK#OperateTrafficList}接口输入参数
 * \endif
 */
public class NET_IN_OPERATE_TRAFFIC_LIST_RECORD implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Black and allow list type operation, refer to {@link EM_RECORD_OPERATE_TYPE}
	 * \else
	 * 权限名单操作类型,取值参考 {@link EM_RECORD_OPERATE_TYPE}
	 * \endif
	 */
    public int    		emOperateType;  
    
	/**
	 * \if ENGLISH_LANG
	 * record type to operate, refer to {@link EM_NET_RECORD_TYPE}
	 * \else
	 * 要操作记录信息类型 ,取值参考 {@link EM_NET_RECORD_TYPE}
	 * \endif
	 */
    public int        	emRecordType;    
    
	/**
	 * \if ENGLISH_LANG
	 *  the space application by the user,please refer to emRecordType to ensure corresponding structure,then ensure memory size,corresponding to remove{@link NET_REMOVE_RECORD_INFO} / update{@link NET_UPDATE_RECORD_INFO}
	 * \else
	 * 由用户申请内存，参照操作记录信息类型，得到记录信息对应的结构体，进而确定对应的内存大小,对应  删除{@link NET_REMOVE_RECORD_INFO} / 更新{@link NET_UPDATE_RECORD_INFO}
	 * \endif
	 */
    public Object 		pstOpreateInfo; 
    
}

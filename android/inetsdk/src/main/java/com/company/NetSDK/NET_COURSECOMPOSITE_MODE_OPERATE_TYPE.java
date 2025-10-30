package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CourseCompositeChannelMode operate type
 * \else
 * 录播主机组合通道模式操作
 * \endif
 */
public class NET_COURSECOMPOSITE_MODE_OPERATE_TYPE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * add mode,	pInParam = {@link NET_IN_COURSECOMPOSITE_CHANNEL_MODE_ADD},	pOutParam = {@link NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_ADD}
	 * \else
	 * 添加模式,对应结构体pInParam = {@link NET_IN_COURSECOMPOSITE_CHANNEL_MODE_ADD},	 pOutParam = {@link NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_ADD}
	 * \endif
	 */
	public static final int NET_COURSECOMPOSITE_MODE_ADD = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * delete mode, pInParam = {@link NET_IN_COURSECOMPOSITE_CHANNEL_MODE_DELETE}, pOutParam = {@link NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_DELETE}
	 * \else
	 * 删除模式,对应结构体pInParam = {@link NET_IN_COURSECOMPOSITE_CHANNEL_MODE_DELETE}, pOutParam = {@link NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_DELETE}
	 * \endif
	 */
	public static final int NET_COURSECOMPOSITE_MODE_DELETE = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * modify mode, pInParam = {@link NET_IN_COURSECOMPOSITE_CHANNEL_MODE_MODIFY}, pOutParam = {@link NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_MODIFY}
	 * \else
	 * 修改模式,对应结构体pInParam = {@link NET_IN_COURSECOMPOSITE_CHANNEL_MODE_MODIFY}, pOutParam = {@link NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_MODIFY}
	 * \endif
	 */
	public static final int NET_COURSECOMPOSITE_MODE_MODIFY = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * get mode,	pInParam = {@link NET_IN_COURSECOMPOSITE_CHANNEL_MODE_GET},	   pOutParam = {@link NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_GET}
	 * \else
	 * 获取模式,对应结构体pInParam = {@link NET_IN_COURSECOMPOSITE_CHANNEL_MODE_GET},	 pOutParam = {@link NET_OUT_COURSECOMPOSITE_CHANNEL_MODE_GET}
	 * \endif
	 */
	public static final int NET_COURSECOMPOSITE_MODE_GET = 3;

}

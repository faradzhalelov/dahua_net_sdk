package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * result of add CourseCompositeChannelMode
 * \else
 * 录播主机添加模式返回信息
 * \endif
 */
public final class NET_COURSECOMPOSITE_CHANNEL_MODE_ADD_RESULT implements
		Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * mode, 0 invalid, 1 movie mode, 2 normal mode, 3 boutique mode, <0 mode
	 * \else
	 * 模式, 0 无效, 1 电影模式, 2 常态模式, 3 精品模式, 小于0 自定义模式
	 * \endif
	 */
	public int  nMode = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * return code: 1 success, 2 failure, 3 full, 4 resource lack
	 * \else
	 * 返回码, 1 成功, 2 失败, 3 已满, 4 资源不足
	 * \endif
	 */
	public int  nReturnCode = 0;

}

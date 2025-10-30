package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#AttachMission} input parameter
 * \else
 * {@link INetSDK#AttachMission} 接口输入参数
 * \endif
 */
public class NET_IN_ATTACH_MISSION_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * task type, refer to {@link EM_MISSION_TYPE}
	 * \else
	 * 任务类型, 取值参考 {@link EM_MISSION_TYPE}
	 * \endif
	 */
	public int emMissionType;            
}

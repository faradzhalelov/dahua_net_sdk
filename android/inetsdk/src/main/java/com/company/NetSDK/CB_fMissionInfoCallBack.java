package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * task info callback function
 * \else
 * 任务信息回调函数
 * \endif
 */
public interface CB_fMissionInfoCallBack {

	/**
	 * \if ENGLISH_LANG
	 * task info callback function
	 * @param lAttachHandle return from{@link INetSDK#AttachMission}
	 * @param dwType  Task type {@link EM_MISSION_TYPE }
	 * @param pMissionInfo Mission information
	 * @param pReserved  reserved
	 * \else
	 * 任务信息回调函数
	 * @param lAttachHandle {@link INetSDK#AttachMission}返回值
	 * @param dwType  任务类型 {@link EM_MISSION_TYPE}
	 * @param pMissionInfo 任务信息
	 * @param pReserved  保留
	 * \endif
	 */
	public void invoke(long lAttachHandle, int dwType, Object pMissionInfo, Object pReserved);
}

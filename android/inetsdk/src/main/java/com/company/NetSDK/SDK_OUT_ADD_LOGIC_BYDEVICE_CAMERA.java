package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#MatrixAddCamerasByDevice} interface output parameter
 * \else
 * {@link INetSDK#MatrixAddCamerasByDevice}接口输出参数
 * \endif
 */
public class SDK_OUT_ADD_LOGIC_BYDEVICE_CAMERA implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Device ID
	 * \else
	 * 设备ID
	 * \endif
	 */
	public                byte[]    szDeviceID           = new byte[FinalVar.SDK_DEV_ID_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * ResultCount
	 * \else
	 * 结果数组大小，用户填写
	 * \endif
	 */
	public                int       nMaxResultCount;
	
	/**
	 * \if ENGLISH_LANG
	 * return count
	 * \else
	 * 实际结果数量
	 * \endif
	 */
	public                int       nRetResultCount;
	
	/**
	 * \if ENGLISH_LANG
	 * result, the space application by the user,sizeof nMaxResultCount.
	 * \else
	 * 添加视频源结果数组，用户分配，大小为nMaxResultCount
	 * \endif
	 */
	public SDK_LOGIC_BYDEVICE_ADD_CAMERA_RESULT[]  pResults;
	
	public SDK_OUT_ADD_LOGIC_BYDEVICE_CAMERA(int maxResultCount){
		this.nMaxResultCount = maxResultCount;
		this.pResults = new SDK_LOGIC_BYDEVICE_ADD_CAMERA_RESULT[maxResultCount];
		for(int i=0;i<maxResultCount;i++){
			this.pResults[i] = new SDK_LOGIC_BYDEVICE_ADD_CAMERA_RESULT();
		}
	}
	
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input parameter of {@link INetSDK#MatrixAddCamerasByDevice}
 * \else
 * {@link INetSDK#MatrixAddCamerasByDevice}接口输入参数
 * \endif
 */
public class SDK_IN_ADD_LOGIC_BYDEVICE_CAMERA implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * device ID
	 * \else
	 * 设备ID
	 * \endif
	 */
	public       byte[]                         pszDeviceID       = new byte[FinalVar.SDK_DEV_ID_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * RemoteDevice infor.
	 * \else
	 * 远程设备信息
	 * \endif
	 */
	public       SDK_REMOTE_DEVICE              stuRemoteDevice   = new SDK_REMOTE_DEVICE();
	
	/**
	 * \if ENGLISH_LANG
	 * source video number
	 * \else
	 * 视频源信息数量
	 * \endif
	 */
	public       int                            nCameraCount;
	
	/**
	 * \if ENGLISH_LANG
	 * array of source video the space application by the user,sizeof(nCameraCount).
	 * \else
	 * 视频源信息数组，用户分配内存，大小为nCameraCount
	 * \endif
	 */
	public       SDK_LOGIC_BYDEVICE_ADD_CAMERA_PARAM[]  pCameras;
	
	
	public SDK_IN_ADD_LOGIC_BYDEVICE_CAMERA(int nCount){
		this.nCameraCount = nCount;
		this.pCameras = new SDK_LOGIC_BYDEVICE_ADD_CAMERA_PARAM[nCount];
		for(int i=0;i<nCount;i++){
			this.pCameras[i] = new SDK_LOGIC_BYDEVICE_ADD_CAMERA_PARAM();
		}
	}
	
}

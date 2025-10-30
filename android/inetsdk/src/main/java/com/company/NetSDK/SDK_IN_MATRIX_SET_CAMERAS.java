package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#MatrixSetCameras} interface input parameter
 * \else
 * {@link INetSDK#MatrixSetCameras}接口输入参数
 * \endif
 */
public class SDK_IN_MATRIX_SET_CAMERAS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * array the space application by the user,alloc.
	 * \else
	 * 显示源信息数组，用户分配。
	 * \endif
	 */
	public SDK_MATRIX_CAMERA_INFO[]       pstuCameras = null;
	
	/**
	 * \if ENGLISH_LANG
	 * size of source array
	 * \else
	 * 显示源数组大小。
	 * \endif
	 */
	public   int                        nCameraCount;
	
	public SDK_IN_MATRIX_SET_CAMERAS(int count){
		this.nCameraCount = count;
		this.pstuCameras = new SDK_MATRIX_CAMERA_INFO[this.nCameraCount];
		for(int i=0;i<this.nCameraCount;i++){
			this.pstuCameras[i] = new SDK_MATRIX_CAMERA_INFO();
		}
	}
	

}

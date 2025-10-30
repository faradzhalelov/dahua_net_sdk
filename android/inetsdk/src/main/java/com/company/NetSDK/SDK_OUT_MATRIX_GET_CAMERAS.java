package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#MatrixGetCameras} 's interface output param
 * \else
 * {@link INetSDK#MatrixGetCameras} 接口的输出参数
 * \endif
 */
public class SDK_OUT_MATRIX_GET_CAMERAS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * array
	 * \else
	 * 显示源信息数组, 用户分配内存
	 * \endif
	 */
	public SDK_MATRIX_CAMERA_INFO  pstuCameras[]; 
	
	/**
	 * \if ENGLISH_LANG
	 * size of source array
	 * \else
	 * 显示源数组大小
	 * \endif
	 */
    public int                     nMaxCameraCount; 
    
    /**
	 * \if ENGLISH_LANG
	 * valid number of pstuCameras
	 * \else
	 * 返回的显示源数量, pstuCameras的有效个数
	 * \endif
	 */
    public int                     nRetCameraCount; 
    
    /**
	 * \if ENGLISH_LANG
	 * the real channel number of device
	 * \else
	 * 设备实际通道个数
	 * \endif
	 */
    public int					   nRealChannelCount;				       
    
    public SDK_OUT_MATRIX_GET_CAMERAS(int nMaxCameraCount) {
    	this.nMaxCameraCount = nMaxCameraCount;
    	pstuCameras = new SDK_MATRIX_CAMERA_INFO[this.nMaxCameraCount];
    	for (int i = 0; i < this.nMaxCameraCount; i++) {
    		pstuCameras[i] = new SDK_MATRIX_CAMERA_INFO();
    	}
    }
    
    public SDK_OUT_MATRIX_GET_CAMERAS(int nMaxCameraCount, int nMaxVideoInputCount)
    {
    	if(nMaxCameraCount > 0)
    	{
    		this.nMaxCameraCount = nMaxCameraCount;
        	pstuCameras = new SDK_MATRIX_CAMERA_INFO[this.nMaxCameraCount];
        	for (int i = 0; i < this.nMaxCameraCount; i++) {
        		pstuCameras[i] = new SDK_MATRIX_CAMERA_INFO(nMaxVideoInputCount);
        	}
    	}
    }
}

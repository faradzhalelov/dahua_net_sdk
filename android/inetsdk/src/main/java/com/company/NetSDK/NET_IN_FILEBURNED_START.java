package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#StartUploadFileBurned} input param
 * \else
 * {@link INetSDK#StartUploadFileBurned} 输入参数
 * \endif
 */
public class NET_IN_FILEBURNED_START implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * type of upload,"append", append mode " FILE.zip ",filename be ignored
	 * \else
	 * 文件上传方式"append",追加模式,此时刻录文件名固定为" FILE.zip ",filename被忽略
	 * \endif
	 */
	public String         		szMode;   
	
	/**
	 * \if ENGLISH_LANG
	 * device name,example "/dev/sda"
	 * \else
	 * 光盘名称，如“/dev/sda”
	 * \endif
	 */
	public String         		szDeviceName;   
	
	/**
	 * \if ENGLISH_LANG
	 * local file name
	 * \else
	 * 本地文件名称
	 * \endif
	 */
	public String         		szFilename;     
	
	/**
	 * \if ENGLISH_LANG
	 * burn progress callback function
	 * \else
	 * 刻录进度回调
	 * \endif
	 */
	public CB_fBurnFileCallBack   cbBurnPos;                      
}

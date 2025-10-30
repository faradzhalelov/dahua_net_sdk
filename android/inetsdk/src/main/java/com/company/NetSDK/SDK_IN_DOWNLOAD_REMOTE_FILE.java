package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#DownloadRemoteFile} Interface Input Parameters (the file download)
* \else
* {@link INetSDK#DownloadRemoteFile} 接口输入参数(文件下载)
* \endif
*/
public class SDK_IN_DOWNLOAD_REMOTE_FILE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * File Name Needs to Download 
	 * \else
	 * 需要下载的文件名
	 * \endif
	 */
    public String         pszFileName;                    
    
	 /**
	 * \if ENGLISH_LANG
	 * File Path
	 * \else
	 * 存放文件路径
	 * \endif
	 */
    public String         pszFileDst;                     

}

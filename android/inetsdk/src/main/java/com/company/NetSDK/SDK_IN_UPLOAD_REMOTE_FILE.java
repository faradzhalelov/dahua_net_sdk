package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#UploadRemoteFile} 's interface input param(upload file to the device)
* \else
* {@link INetSDK#UploadRemoteFile} 接口输入参数(上传文件到设备)
* \endif
*/
public class SDK_IN_UPLOAD_REMOTE_FILE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * path of source file
	 * \else
	 * 源文件路径
	 * \endif
	 */
    public String         pszFileSrc;                     
    
	 /**
	 * \if ENGLISH_LANG
	 * path of goal file
	 * \else
	 * 目标文件路径
	 * \endif
	 */
    public String         pszFileDst;                     
    
	 /**
	 * \if ENGLISH_LANG
	 * target file path: may be NULL, NULL device use default path
	 * \else
	 * 目标文件夹路径：可为NULL, NULL时设备使用默认路径
	 * \endif
	 */
    public String         pszFolderDst;                   
    
	 /**
	 * \if ENGLISH_LANG
	 * file pack size(byte): 0 means not pack
	 * \else
	 * 文件分包大小(字节): 0表示不分包
	 * \endif
	 */
    public int        	  nPacketLen;                    
}

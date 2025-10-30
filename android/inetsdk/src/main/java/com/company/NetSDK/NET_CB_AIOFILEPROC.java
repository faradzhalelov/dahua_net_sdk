package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link CB_fAttachAIOFileprocCB} parameter
 * \else
 * {@link CB_fAttachAIOFileprocCB} 参数
 * \endif
 */

public class NET_CB_AIOFILEPROC implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * file transfer type,distinguish between start and end of file transfer. refer to {@link Net_EM_AIO_FILE_STATUS}
	 * \else
	 * 文件传输状态, 文件分段传输时区分开始和结束,对应 {@link Net_EM_AIO_FILE_STATUS}
	 * \endif
	 */
    public int      					emStatus;				
    
	/**
	 * \if ENGLISH_LANG
	 * file type, refer to {@link Net_EM_AIO_FILE_TYPE}
	 * \else
	 * 文件类型 ，对应 {@link Net_EM_AIO_FILE_TYPE}
	 * \endif
	 */
    public int		  				   emType;				

	/**
	 * \if ENGLISH_LANG
	 * file size, (byte)
	 * \else
	 * 文件大小, 单位: 字节
	 * \endif
	 */
    public int						   dwLength;		
}

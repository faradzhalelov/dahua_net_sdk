package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mail detail content
 * \else
 * 邮件详细内容
 * \endif
 */
public class CFG_MAIL_DETAIL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Attachment type, refer to {@link CFG_ATTACHMENT_TYPE}
	 * \else
	 * 附件类型, 取值参考 {@link CFG_ATTACHMENT_TYPE}
	 * \endif
	 */
	public int				   emAttachType;                 

	/**
	 * \if ENGLISH_LANG
	 * File upload limit，unit kB
	 * \else
	 * 文件大小上限，单位kB
	 * \endif
	 */
	public int                 nMaxSize;                     

	/**
	 * \if ENGLISH_LANG
	 * Max record length, unit is s，valid to video
	 * \else
	 * 最大录像时间长度，单位秒，对video有效
	 * \endif
	 */
	public int                 nMaxTimeLength;               
}

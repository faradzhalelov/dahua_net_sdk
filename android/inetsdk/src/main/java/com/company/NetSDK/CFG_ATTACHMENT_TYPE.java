package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mail Attachment Type
 * \else
 * 邮件附件类型
 * \endif
 */
public class CFG_ATTACHMENT_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Picture attachment
	 * \else
	 * 图片附件
	 * \endif
	 */
	public static final int ATTACHMENT_TYPE_PIC = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Video attachment
	 * \else
	 * 视频附件
	 * \endif
	 */
	public static final int ATTACHMENT_TYPE_VIDEO = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Attachment type total
	 * \else
	 * 附件类型总数
	 * \endif
	 */
	public static final int ATTACHMENT_TYPE_NUM = 2;							
}

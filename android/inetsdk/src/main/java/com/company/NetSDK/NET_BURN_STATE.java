package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * burning status
 * \else
 * 刻录状态
 * \endif
 */


public class NET_BURN_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * stop
	 * \else
	 * 停止
	 * \endif
	 */
	public static final int BURN_STATE_STOP 		= 0 ;
	
	/**
	 * \if ENGLISH_LANG
	 * stoping
	 * \else
	 * 停止中
	 * \endif
	 */
	public static final int BURN_STATE_STOPING 		= 1 ;
	
	/**
	 * \if ENGLISH_LANG
	 * initialize
	 * \else
	 * 初始化
	 * \endif
	 */
	public static final int BURN_STATE_INIT 		= 2 ;
	
	/**
	 * \if ENGLISH_LANG
	 * burning
	 * \else
	 * 刻录中
	 * \endif
	 */
	public static final int BURN_STATE_BURNING 		= 3 ;
	
	/**
	 * \if ENGLISH_LANG
	 * pause
	 * \else
	 * 暂停
	 * \endif
	 */
	public static final int BURN_STATE_PAUSE 		= 4 ;
	
	/**
	 * \if ENGLISH_LANG
	 * changing
	 * \else
	 * 换盘中
	 * \endif
	 */
	public static final int BURN_STATE_CHANGE_DISK 		= 5 ;
	
	/**
	 * \if ENGLISH_LANG
	 * attachment initialize
	 * \else
	 * 附件初始化
	 * \endif
	 */
	public static final int BURN_STATE_PREPARE_EXTRA_FILE 		= 6 ;
	
	/**
	 * \if ENGLISH_LANG
	 * attachment initialize
	 * \else
	 * 等待附件刻录
	 * \endif
	 */
	public static final int BURN_STATE_WAIT_EXTRA_FILE 		= 7 ;
	
	/**
	 * \if ENGLISH_LANG
	 * attachment burning
	 * \else
	 * 附件刻录中
	 * \endif
	 */
	public static final int BURN_STATE_UPLOAD_FILE_START 		= 8 ;
	
	/**
	 * \if ENGLISH_LANG
	 * detecting disk
	 * \else
	 * 检测光盘中
	 * \endif
	 */
	public static final int BURN_STATE_CHECKING_DISK 		= 9;
	
	/**
	 * \if ENGLISH_LANG
	 * disk is ready
	 * \else
	 * 光盘准备就绪
	 * \endif
	 */
	public static final int BURN_STATE_DISK_READY 		= 10 ;
}

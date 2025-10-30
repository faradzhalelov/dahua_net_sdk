package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Type of video search
 * \else
 * 录像查询类型
 * \endif
 */
public class EM_QUERY_RECORD_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * All the recorded video  
	 * \else
	 * 所有录像
	 * \endif
	 */
	public final static int EM_RECORD_TYPE_ALL              = 0;            
	
	/**
	 * \if ENGLISH_LANG
	 * The video of external alarm
	 * \else
	 * 外部报警录像
	 * \endif
	 */
	public final static int EM_RECORD_TYPE_ALARM            = 1;            
	
	/**
	 * \if ENGLISH_LANG
	 * The video of dynamic detection alarm
	 * \else
	 * 动态检测报警录像
	 * \endif
	 */
	public final static int EM_RECORD_TYPE_MOTION_DETECT    = 2;            
	
	/**
	 * \if ENGLISH_LANG
	 * All the alarmed video
	 * \else
	 * 所有报警录像
	 * \endif
	 */
	public final static int EM_RECORD_TYPE_ALARM_ALL        = 3;            
	
	/**
	 * \if ENGLISH_LANG
	 * query by the card number
	 * \else
	 * 卡号查询
	 * \endif
	 */
	public final static int EM_RECORD_TYPE_CARD             = 4;            
	
	/**
	 * \if ENGLISH_LANG
	 * query by condition
	 * \else
	 * 按条件查询
	 * \endif
	 */
	public final static int EM_RECORD_TYPE_CONDITION        = 5;            
	
	/**
	 * \if ENGLISH_LANG
	 * combination query
	 * \else
	 * 组合查询
	 * \endif
	 */
	public final static int EM_RECORD_TYPE_JOIN             = 6;            
	
	/**
	 * \if ENGLISH_LANG
	 * query pictures by the card number, ?used by HB-U、NVS
	 * \else
	 * 按卡号查询图片,HB-U、NVS等使用
	 * \endif
	 */
	public final static int EM_RECORD_TYPE_CARD_PICTURE     = 8;            
	
	/**
	 * \if ENGLISH_LANG
	 * query pictures, used by HB-U、NVS
	 * \else
	 * 查询图片,HB-U、NVS等使用
	 * \endif
	 */
	public final static int EM_RECORD_TYPE_PICTURE          = 9;            
	
	/**
	 * \if ENGLISH_LANG
	 * query by field
	 * \else
	 * 按字段查询
	 * \endif
	 */
	public final static int EM_RECORD_TYPE_FIELD            = 10;           
	
	/**
	 * \if ENGLISH_LANG
	 * Smart record search 
	 * \else
	 * 智能录像查询
	 * \endif
	 */
	public final static int EM_RECORD_TYPE_INTELLI_VIDEO   = 11;            
	
	/**
	 * \if ENGLISH_LANG
	 * query network data, used by Jinqiao Internet Bar
	 * \else
	 * 查询网络数据,金桥网吧等使用
	 * \endif
	 */
	public final static int EM_RECORD_TYPE_NET_DATA         = 15;           
	
	/**
	 * \if ENGLISH_LANG
	 * query the video of serial data
	 * \else
	 * 查询透明串口数据录像
	 * \endif
	 */
	public final static int EM_RECORD_TYPE_TRANS_DATA       = 16;           
	
	/**
	 * \if ENGLISH_LANG
	 * query the important video
	 * \else
	 * 查询重要录像
	 * \endif
	 */
	public final static int EM_RECORD_TYPE_IMPORTANT        = 17;           
	
	/**
	 * \if ENGLISH_LANG
	 * query the recording file
	 * \else
	 * 查询录音文件
	 * \endif
	 */
	public final static int EM_RECORD_TYPE_TALK_DATA        = 18;           
	
	/**
	 * \if ENGLISH_LANG
	 * query the pos record
	 * \else
	 * POS录像
	 * \endif
	 */
	public final static int EM_RECORD_TYPE_POS				= 19;
	
	/**
	 * \if ENGLISH_LANG
	 * invalid query type
	 * \else
	 * 无效的查询类型
	 * \endif
	 */    
	public final static int EM_RECORD_TYPE_INVALID          = 256;          
}

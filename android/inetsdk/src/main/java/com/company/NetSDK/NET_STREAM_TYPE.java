package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * video stream type
 * \else
 * 视频码流类型
 * \endif
 */
public class NET_STREAM_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Others
	 * \else
	 * 其它
	 * \endif
	 */
	public static final int NET_EM_STREAM_ERR = 0; 
	
	/**
	 * \if ENGLISH_LANG
	 * "Main"-Main stream
	 * \else
	 * "Main"-主码流
	 * \endif
	 */
	public static final int NET_EM_STREAM_MAIN = 1; 
	
	/**
	 * \if ENGLISH_LANG
	 * "Extra1"-Extra stream 1
	 * \else
	 * "Extra1"-辅码流1
	 * \endif
	 */
	public static final int NET_EM_STREAM_EXTRA_1 = 2; 
	
	/**
	 * \if ENGLISH_LANG
	 * "Extra2"-Extra stream 2
	 * \else
	 * "Extra2"-辅码流2
	 * \endif
	 */
	public static final int NET_EM_STREAM_EXTRA_2 = 3; 
	
	/**
	 * \if ENGLISH_LANG
	 * "Extra3"-Extra stream 3
	 * \else
	 * "Extra3"-辅码流3
	 * \endif
	 */
	public static final int NET_EM_STREAM_EXTRA_3 = 4; 
	
	/**
	 * \if ENGLISH_LANG
	 * "Snapshot"-Snap bit stream
	 * \else
	 * "Snapshot"-抓图码流
	 * \endif
	 */
	public static final int NET_EM_STREAM_SNAPSHOT = 5; 
	
	/**
	 * \if ENGLISH_LANG
	 * "Object"-Object stream
	 * \else
	 * "Object"-物体流
	 * \endif
	 */
	public static final int NET_EM_STREAM_OBJECT = 6; 
	
	/**
	 * \if ENGLISH_LANG
	 * "Auto"
	 * \else
	 * "Auto"-自动选择合适码流
	 * \endif
	 */
	public static final int NET_EM_STREAM_AUTO = 7; 
	
	/**
	 * \if ENGLISH_LANG
	 * "Preview"
	 * \else
	 * "Preview"-预览裸数据码流
	 * \endif
	 */
	public static final int NET_EM_STREAM_PREVIEW = 8; 
	
	/**
	 * \if ENGLISH_LANG
	 * No video stream (audio only)
	 * \else
	 * 无视频码流(纯音频)
	 * \endif
	 */
	public static final int NET_EM_STREAM_NONE = 9; 
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Play back mode for decoder
 * \else
 * 解码器回放方式
 * \endif
 */
public class DEC_PLAYBACK_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * by file mode
	 * \else
	 * 按文件方式
	 * \endif
	 */
	public static final int     Dec_By_Device_File = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * by time mode
	 * \else
	 * 按时间方式
	 * \endif
	 */
	public static final int     Dec_By_Device_Time = 1;
}

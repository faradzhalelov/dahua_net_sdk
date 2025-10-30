package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Data structure of channel video title overlay 
 * \else
 * 通道画面字幕叠加的数据结构
 * \endif
 */
public class SDK_CHANNEL_OSDSTRING implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * 使能
	 * \endif
	 */
	public boolean				bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Character position in each line. The value ranges from 1 to 9.Corresponding to the small keyboard. \n 
	 * 7upper left 	8upper		9upper right  \n 
	 * 4left			5middle 	6right  \n 
	 * 1down left		2down	    3down right  \n 
	 * \else
	 * 各行字符的位置　用1-9整数表示，与小键盘位置对应 \n 
	 * 7左上	8上		9右上 \n 
	 * 4左		5中		6右 \n 
	 * 1左下	2下		3右下 \n 
	 * \endif
	 */
	public int					dwPosition[] = new int[FinalVar.MAX_STRING_LINE_LEN];	 
	
	/**
	 * \if ENGLISH_LANG
	 * Max 6 lines. Each line max 20 bytes.
	 * \else
	 * 最多六行字符，每行最多20个字节
	 * \endif
	 */
	public char				szStrings[][] = new char[FinalVar.MAX_STRING_LINE_LEN][FinalVar.MAX_PER_STRING_LEN];	 
}

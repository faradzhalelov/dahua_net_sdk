package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * General long character ended with '\0'
 * \else
 * 通用变长字符串以‘\0’结束
 * \endif
 */
public class NET_ARRAY implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Buffer zone. Now the min value is 260 byte.Caller shall apply for the memory. The filling in data shall ended with '\0'. 
	 * \else
	 * 缓冲区 目前最小260字节，调用者申请内存 填充数据保证是'\0'结束
	 * \endif
	 */
	public byte[]             pArray;
	
	/**
	 * \if ENGLISH_LANG
	 * Buffer space length
	 * \else
	 * 缓冲空间长度
	 * \endif
	 */
	public int                dwArrayLen;                     
}

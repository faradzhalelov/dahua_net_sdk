package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the face matching candidates to the image file path
 * \else
 * 目标匹配到的候选对象图片文件路径
 * \endif
 */
public class NET_CANDIDAT_PIC_PATHS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * actual file amount
	 * \else
	 * 实际文件个数
	 * \endif
	 */
	public int                  nFileCount; 
	
	/**
	 * \if ENGLISH_LANG
	 * file information
	 * \else
	 * 文件信息
	 * \endif
	 */
	public SDK_PIC_INFO_EX       stFiles[] = new SDK_PIC_INFO_EX[FinalVar.SDK_MAX_PERSON_IMAGE_NUM];
	
	public NET_CANDIDAT_PIC_PATHS() {
		for (int i = 0; i < FinalVar.SDK_MAX_PERSON_IMAGE_NUM; i++) {
			stFiles[i] = new SDK_PIC_INFO_EX();
		}
	}
}

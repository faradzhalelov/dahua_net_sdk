package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * OSD Overlay Custom Sequence
 * \else
 * OSD叠加内容自定义排序
 * \endif
 */
public class OSD_CUSTOM_SORT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Detail Overlay Element
	 * \else
	 * 具体叠加元素
	 * \endif
	 */
    public OSD_CUSTOM_ELEMENT[]   stElements = new OSD_CUSTOM_ELEMENT[FinalVar.MAX_OSD_CUSTOM_SORT_ELEM_NUM];   
    
	/**
	 * \if ENGLISH_LANG
	 * Detail Overlay Element Number 
	 * \else
	 * 具体叠加元素个数
	 * \endif
	 */
    public int                   nElementNum;
    
    public OSD_CUSTOM_SORT() {
    	for(int i=0; i<FinalVar.MAX_OSD_CUSTOM_SORT_ELEM_NUM; i++) {
    		stElements[i] = new OSD_CUSTOM_ELEMENT();
    	}
    }
}

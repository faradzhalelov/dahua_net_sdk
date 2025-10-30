package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * OSD option
 * \else
 * OSD自定义项
 * \endif
 */
public class OSD_CUSTOM_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Detailed overlay element
	 * \else
	 * 具体叠加元素
	 * \endif
	 */
    public OSD_CUSTOM_GENERAL_INFO[]  stGeneralInfos = new OSD_CUSTOM_GENERAL_INFO[FinalVar.MAX_OSD_CUSTOM_GENERAL_NUM];     
    
	/**
	 * \if ENGLISH_LANG
	 * Detailed overlay element Number
	 * \else
	 * 具体叠加元素个数
	 * \endif
	 */
    public int                      nGeneralInfoNum;
    
    public OSD_CUSTOM_INFO() {
    	for(int i=0; i<FinalVar.MAX_OSD_CUSTOM_GENERAL_NUM; i++) {
    		stGeneralInfos[i] = new OSD_CUSTOM_GENERAL_INFO();
    	}
    }
}

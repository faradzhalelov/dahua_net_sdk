package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * type of pushstream
 * \else
 * 推流方式的码流类型
 * \endif
 */
public class EM_SRC_PUSHSTREAM_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * device automatic recognition according to bit stream head, default
	 * \else
	 * 设备端根据码流头自动识别，默认值
	 * \endif
	 */
    public static final int EM_SRC_PUSHSTREAM_AUTO = 0;        
    
    /**
     * \if ENGLISH_LANG
     * Hik private bit stream
     * \else
     * Hik私有码流
     * \endif
     */
    public static final int EM_SRC_PUSHSTREAM_HIKVISION = 1;   
    
    /**
     * \if ENGLISH_LANG
     * PS stream
     * \else
     * PS流
     * \endif
     */
    public static final int EM_SRC_PUSHSTREAM_PS = 2;          
    
    /**
     * \if ENGLISH_LANG
     * TS stream
     * \else
     * TS流
     * \endif
     */
    public static final int EM_SRC_PUSHSTREAM_TS = 3;          
    
    /**
     * \if ENGLISH_LANG
     * SVAC stream
     * \else
     * SVAC码流
     * \endif
     */
    public static final int EM_SRC_PUSHSTREAM_SVAC = 4;        
}

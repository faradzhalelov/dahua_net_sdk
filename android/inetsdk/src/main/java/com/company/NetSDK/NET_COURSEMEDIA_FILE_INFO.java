package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * record info
 * \else
 * 视频信息
 * \endif
 */
public class NET_COURSEMEDIA_FILE_INFO implements Serializable {
	private static final long serialVersionUID = 1L;    
    
    /**
     * \if ENGLISH_LANG
     * record info id，-1： have not record info
     * \else
     * 视频信息ID,-1表示无此记录
     * \endif
     */
    public int                      nID; 

    /**
     * \if ENGLISH_LANG
     * course info
     * \else
     * 课程信息
     * \endif
     */
    public NET_COURSE_INFO         stuCourseInfo = new NET_COURSE_INFO();        
    
    /**
     * \if ENGLISH_LANG
     * number of channel
     * \else
     * 通道数量
     * \endif
     */
    public int                     nChannelNum;                      
    
    /**
     * \if ENGLISH_LANG
     * number of video segments corresponding to the channel
     * \else
     * 对应通道的录像分段数
     * \endif
     */
    public int[]                   nRecordNum = new int[64];         
    
    /**
     * \if ENGLISH_LANG
     * record info, the first dimension subscript is the mapping channel number, the second dimension subscript is video segmentation.
     * \else
     * 录像信息，第一维下标为映射通道号，第二维为录像分段数
     * \endif
     */
    public NET_RECORD_INFO[][]    stuRecordInfo = new NET_RECORD_INFO[64][16];                            
 
    public NET_COURSEMEDIA_FILE_INFO() {
    	for (int i = 0; i < 64; ++i) {
    		for (int j = 0; j < 16; ++j) {
    			stuRecordInfo[i][j] = new NET_RECORD_INFO();
    		}
    	}
    }
}

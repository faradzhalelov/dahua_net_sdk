package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * record file info
 * \else
 * 录像文件信息
 * \endif
 */
public class NET_RECORD_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;    
    
    /**
     * \if ENGLISH_LANG
     * real channel
     * \else
     * 真实通道号
     * \endif
     */
    public int                      nRealChannel;            
    
    /**
     * \if ENGLISH_LANG
     * start time
     * \else
     * 查询开始时间
     * \endif
     */
    public NET_TIME                 stuStartTime = new NET_TIME();                      
    
    /**
     * \if ENGLISH_LANG
     * end time
     * \else
     * 查询结束时间
     * \endif
     */
    public NET_TIME                 stuEndTime = new NET_TIME();                        
    
    /**
     * \if ENGLISH_LANG
     * length of channel record file low 32 bits, 0 is no record file
     * \else
     * 通道录像文件总长度低32位,0表示此通道没录像 
     * \endif
     */
    public int                     nFileLen;                          
    
    /**
     * \if ENGLISH_LANG
     * length of channel record file top 32 bits
     * \else
     * 通道录像文件总长度高32位,与FileLen一起表示录像长度
     * \endif
     */
    public int                     nFileLenEx;                        
    
    /**
     * \if ENGLISH_LANG
     * record time
     * \else
     * 录像时长
     * \endif
     */
    public int                     nTime;                             
    
    /**
     * \if ENGLISH_LANG
     * file type, 0:clipping file, 1:origimal file
     * \else
     * 文件类型，0:裁减文件，1:原始文件
     * \endif
     */
    public int                     nFileType;

    /**
     * \if ENGLISH_LANG
     * Course record compression type,{@link EM_COURSE_RECORD_COMPRESSION_TYPE}
     * \else
     * 课程录像压缩类型,{@link EM_COURSE_RECORD_COMPRESSION_TYPE}
     * \endif
     */
    public int                     emCompression;
}

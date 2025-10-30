package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * composite channel info
 * \else
 * 组合通道信息
 * \endif
 */

public class NET_COMPOSITECHANNEL_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * course name
	 * \else
	 * 课程名称
	 * \endif
	 */
    public byte[]                        szCourseName = new byte[FinalVar.SDK_COMMON_STRING_128];     
    
	 /**
	 * \if ENGLISH_LANG
	 * teacher name
	 * \else
	 * 教师名称
	 * \endif
	 */
    public byte[]                        szTeacherName = new byte[FinalVar.SDK_COMMON_STRING_64];     
    
	 /**
	 * \if ENGLISH_LANG
	 * record mode, record mode 0:invalid;1:movie mode; 2:normal mode; 3:pick mode; <0:customer mode;
	 * \else
	 * 录制模式, 0:无效；1:电影模式； 2:常态模式； 3:精品模式； <0:用户自定义模式
	 * \endif
	 */
     public int         			    nCompositeChannelMode;                 
    
	 /**
	 * \if ENGLISH_LANG
	 * logic channel number
	 * \else
	 * 逻辑通道数量
	 * \endif
	 */
    public int                         nChannelNum;                            
    
	 /**
	 * \if ENGLISH_LANG
	 * unable to stream,number is logic channel id
	 * \else
	 * 是否能拉流，下标对应为逻辑通道号
	 * \endif
	 */
    public boolean[]                   bCanStream = new boolean[FinalVar.MAX_COURSE_LOGIC_CHANNEL];   
}

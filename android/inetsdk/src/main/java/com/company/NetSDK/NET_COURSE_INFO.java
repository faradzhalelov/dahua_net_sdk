package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * course info
 * \else
 * 课程信息
 * \endif
 */
public class NET_COURSE_INFO implements Serializable{
	private static final long serialVersionUID = 1L;    
    
    /**
     * \if ENGLISH_LANG
     * course name
     * \else
     * 课程名称
     * \endif
     */
    public byte[]                    szCourseName = new byte[FinalVar.SDK_COMMON_STRING_64];              
    
    /**
     * \if ENGLISH_LANG
     * teacher name
     * \else
     * 教师姓名
     * \endif
     */
    public byte[]                    szTeacherName = new byte[FinalVar.SDK_COMMON_STRING_64];            
    
    /**
     * \if ENGLISH_LANG
     * video synopsis
     * \else
     * 视频简介
     * \endif
     */
    public byte[]                    szIntroduction = new byte[FinalVar.SDK_COMMON_STRING_128];              
}

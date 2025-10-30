package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * open find course media record in parameter
 * \else
 * 开始查询课程视频信息入参
 * \endif
 */
public class NET_IN_QUERY_COURSEMEDIA_FILEOPEN implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * start time 
	 * \else
	 *  查询开始时间
	 * \endif
	 */
	public NET_TIME	stuStartTime = new NET_TIME();                     
   
	/**
	 * \if ENGLISH_LANG
	 * end time
	 * \else
	 * 查询结束时间
	 * \endif
	 */
	public NET_TIME stuEndTime = new NET_TIME();
    
	/**
	 * \if ENGLISH_LANG
	 * key word
	 * \else
	 * 查询关键字
	 * \endif
	 */
	public byte[] szKeyWord = new byte[FinalVar.SDK_COMMON_STRING_128];

	/**
	 * \if ENGLISH_LANG
	 * Query lock type,{@link EM_COURSE_LOCK_TYPE}
	 * \else
	 * 查询锁定类型{@link EM_COURSE_LOCK_TYPE}
	 * \endif
	 */
	public int emCourseLockType;

	/**
	 * \if ENGLISH_LANG
	 * Query course record type,{@link EM_COURSE_RECORD_TYPE}
	 * \else
	 * 查询课程录像类型,{@link EM_COURSE_RECORD_TYPE}
	 * \endif
	 */
	public int emCourseRecordType;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * configuration of course media channel bind, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_COURSE_CHANNELBIND}
 * \else
 *  录播主机物理通道号绑定关系配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_COURSE_CHANNELBIND}
 * \endif
 */
public class CFG_COURSE_CHANNELBIND_INFO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * physical channel of PPT bind，-1 express have no physical channel
	 * \else
	 *  PPT绑定的物理通道号，-1表示没有绑定
	 * \endif
	 */
	public int                             nPPT; 
    
    /**
     * \if ENGLISH_LANG
     * physical channel of Blackboard bind，-1 express have no physical channel
     * \else
     *  黑板绑定的物理通道号，-1表示没有绑定
     * \endif
     */
	public int                             nBlackboard; 
    
    /**
     * \if ENGLISH_LANG
     * physical channel of StudentFeature bind，-1 express have no physical channel
     * \else
     *  学生特写绑定的物理通道号，-1表示没有绑定
     * \endif
     */
	public int                             nStudentFeature; 
    
    /**
     * \if ENGLISH_LANG
     * physical channel of StudentFullview bind，-1 express have no physical channel
     * \else
     * 学生全景绑定的物理通道号，-1表示没有绑定
     * \endif
     */
	public int                             nStudentFullview;               
    
    /**
     * \if ENGLISH_LANG
     * physical channel of TeacherFeature bind，-1 express have no physical channel
     * \else
     *  教师特写绑定的物理通道号，-1表示没有绑定
     * \endif
     */
	public int                             nTeacherFeature; 
    
    /**
     * \if ENGLISH_LANG
     * physical channel of TeacherFullview bind，-1 express have no physical channel
     * \else
     *  教师全景绑定的物理通道号，-1表示没有绑定
     * \endif
     */
	public int                             nTeacherFullview;               
    
    /**
     * \if ENGLISH_LANG
     * physical channel of TeacherDetect bind，-1 express have no physical channel
     * \else
     *  教师检测绑定的物理通道号，-1表示没有绑定
     * \endif
     */
	public int                             nTeacherDetect;                 
    
    /**
     * \if ENGLISH_LANG
     * physical channel of BlackboardDetect bind，-1 express have no physical channel
     * \else
     * 板书检测绑定的物理通道号，-1表示没有绑定
     * \endif
     */
	public int                             nBlackboardDetect;              
}

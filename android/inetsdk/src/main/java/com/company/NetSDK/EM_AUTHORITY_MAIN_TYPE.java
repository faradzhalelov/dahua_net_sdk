package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the main authority
 * \else
 * 主权限类型
 * \endif
 */
public class EM_AUTHORITY_MAIN_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * 未知
	 * \endif
	 */
    public static final int EM_AUTHORITY_MAIN_TYPE_UNKNOWN = 0;           
    
	/**
	 * \if ENGLISH_LANG
	 * user manage
	 * \else
	 * 用户管理
	 * \endif
	 */
    public static final int EM_AUTHORITY_MAIN_TYPE_AUTH_USER_MAG = 1;      
    
	/**
	 * \if ENGLISH_LANG
	 * system config
	 * \else
	 * 系统设置
	 * \endif
	 */
    public static final int EM_AUTHORITY_MAIN_TYPE_AUTH_SYS_CFG = 2;        
    
	/**
	 * \if ENGLISH_LANG
	 * offline user
	 * \else
	 * 屏蔽用户
	 * \endif
	 */
    public static final int EM_AUTHORITY_MAIN_TYPE_AUTH_OFFLINE_USER = 3;   
    
	/**
	 * \if ENGLISH_LANG
	 * default and update
	 * \else
	 * 默认&升级
	 * \endif
	 */
    public static final int EM_AUTHORITY_MAIN_TYPE_AUTH_DF_UD = 4;        
    
	/**
	 * \if ENGLISH_LANG
	 * ptz control
	 * \else
	 * 云台控制
	 * \endif
	 */
    public static final int EM_AUTHORITY_MAIN_TYPE_AUTH_PTZ_CTR = 5;       
    
	/**
	 * \if ENGLISH_LANG
	 * system info
	 * \else
	 * 系统信息
	 * \endif
	 */
    public static final int EM_AUTHORITY_MAIN_TYPE_AUTH_SYS_INFO = 6;      
    
	/**
	 * \if ENGLISH_LANG
	 * manual control
	 * \else
	 * 手动控制
	 * \endif
	 */
    public static final int EM_AUTHORITY_MAIN_TYPE_AUTH_MANU_CTR = 7;      
    
	/**
	 * \if ENGLISH_LANG
	 * back up file
	 * \else
	 * 文件备份
	 * \endif
	 */
    public static final int EM_AUTHORITY_MAIN_TYPE_AUTH_BACKUP = 8;        
    
	/**
	 * \if ENGLISH_LANG
	 * color set
	 * \else
	 * 图像颜色
	 * \endif
	 */
    public static final int EM_AUTHORITY_MAIN_TYPE_AUTH_COLOR_SET = 9;     
    
	/**
	 * \if ENGLISH_LANG
	 * store config
	 * \else
	 * 存储管理
	 * \endif
	 */
    public static final int EM_AUTHORITY_MAIN_TYPE_AUTH_STORE_CFG = 10;     
    
	/**
	 * \if ENGLISH_LANG
	 * event config
	 * \else
	 * 事件设置
	 * \endif
	 */
    public static final int EM_AUTHORITY_MAIN_TYPE_AUTH_EVENT_CFG = 11;     
    
	/**
	 * \if ENGLISH_LANG
	 * net config
	 * \else
	 * 网络设置
	 * \endif
	 */
    public static final int EM_AUTHORITY_MAIN_TYPE_AUTH_NET_CFG = 12;       
    
	/**
	 * \if ENGLISH_LANG
	 * remote device
	 * \else
	 * 摄像头相关
	 * \endif
	 */
    public static final int EM_AUTHORITY_MAIN_TYPE_AUTH_RMT_DEVICE = 13;   
    
	/**
	 * \if ENGLISH_LANG
	 * delete log
	 * \else
	 * 删除日志
	 * \endif
	 */
    public static final int EM_AUTHORITY_MAIN_TYPE_AUTH_DEL_LOG = 14;      
    
	/**
	 * \if ENGLISH_LANG
	 * shut down device
	 * \else
	 * 关闭设备
	 * \endif
	 */
    public static final int EM_AUTHORITY_MAIN_TYPE_AUTH_SHUTDOWN = 15;      
}

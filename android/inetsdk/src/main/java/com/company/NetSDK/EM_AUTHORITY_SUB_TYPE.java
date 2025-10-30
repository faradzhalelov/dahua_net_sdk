package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the sub authority
 * \else
 * 子权限类型
 * \endif
 */
public class EM_AUTHORITY_SUB_TYPE implements Serializable {
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
	public static final int EM_AUTHORITY_SUB_TYPE_UNKNOWN = 0;                            
	
	/**
	 * \if ENGLISH_LANG
	 * shut down device
	 * \else
	 * 关闭设备
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_SHUT_DOWN = 1;                          
	
	/**
	 * \if ENGLISH_LANG
	 * monitor for all channel
	 * \else
	 * 实时预览所有通道
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_MONITOR = 2;                            
	
	/**
	 * \if ENGLISH_LANG
	 * monitor for some channel
	 * \else
	 * 实时预览通道
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_MONITOR_FOR_CHANNEL = 3;                
	
	/**
	 * \if ENGLISH_LANG
	 * replay for all channel
	 * \else
	 * 回放所有通道
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_REPLAY = 4;                             
	
	/**
	 * \if ENGLISH_LANG
	 * replay for some channel
	 * \else
	 * 回放通道
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_REPLAY_FOR_CHANNEL = 5;                  
	
	/**
	 * \if ENGLISH_LANG
	 * back up record file
	 * \else
	 * 录像文件备份
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_BACKUP = 6;                            
	
	/**
	 * \if ENGLISH_LANG
	 * manage the hard disk
	 * \else
	 * 硬盘管理
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_MHARDISK = 7;                           
	
	/**
	 * \if ENGLISH_LANG
	 * manage the PTZ(invalided if HasPtz is false)
	 * \else
	 * 云台的X、Y、Z的电机控制，此权限受产品定义的HasPtz控制，如HasPtz为false，此权限无效
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_MPTZ = 8;                               
	
	/**
	 * \if ENGLISH_LANG
	 * user account
	 * \else
	 * 用户帐号
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_ACCOUNT = 9;                           
	
	/**
	 * \if ENGLISH_LANG
	 * query log
	 * \else
	 * 日志查询
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_QUERY_LOG = 10;                           
	
	/**
	 * \if ENGLISH_LANG
	 * delete log
	 * \else
	 * 删除日志
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_DEL_LOG = 11;                           
	
	/**
	 * \if ENGLISH_LANG
	 * update system
	 * \else
	 * 升级系统
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_SYS_UPDATE = 12;                         
	
	/**
	 * \if ENGLISH_LANG
	 * auto maintain
	 * \else
	 * 自动维护
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_AUTO_MAINTAIN = 13;                      
	
	/**
	 * \if ENGLISH_LANG
	 * general config
	 * \else
	 * 普通设置
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_GENERAL_CONF = 14;                       
	
	/**
	 * \if ENGLISH_LANG
	 * encode config
	 * \else
	 * 编码设置
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_ENCODE_CONF = 15;                         
	
	/**
	 * \if ENGLISH_LANG
	 * record file mode
	 * \else
	 * 录像模式手动、自动设置(RecordMode配置)
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_RECORD = 16;                             
	
	/**
	 * \if ENGLISH_LANG
	 * record config
	 * \else
	 * 录像参数时间、文件格式等设置(Record配置)
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_RECORD_CONF = 17;                       
	
	/**
	 * \if ENGLISH_LANG
	 * com config
	 * \else
	 * 串口设置
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_COM_CONF = 18;                          
	
	/**
	 * \if ENGLISH_LANG
	 * net config
	 * \else
	 * 网络设置
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_NET_CONF = 19;                           
	
	/**
	 * \if ENGLISH_LANG
	 * alarm I/O config
	 * \else
	 * 报警输出IO配置
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_ALARM = 20;                              
	
	/**
	 * \if ENGLISH_LANG
	 * alarm config
	 * \else
	 * 报警设置
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_ALARM_CONF = 21;                         
	
	/**
	 * \if ENGLISH_LANG
	 * video config
	 * \else
	 * 视频动检遮挡丢失
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_VIDEO_CONFIG = 22;                        
	
	/**
	 * \if ENGLISH_LANG
	 * PTZ config
	 * \else
	 * 云台设置
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_PTZ_CONFIG = 23;                         
	
	/**
	 * \if ENGLISH_LANG
	 * video output config
	 * \else
	 * 视频输出配置
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_OUTPUT_CONFIG = 24;                      
	
	/**
	 * \if ENGLISH_LANG
	 * video input config
	 * \else
	 * 视频输入配置
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_VIDEO_INPUT_CONFIG = 25;                 
	
	/**
	 * \if ENGLISH_LANG
	 * default config
	 * \else
	 * 恢复默认
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_DEFAULT_CONFIG = 26;                     
	
	/**
	 * \if ENGLISH_LANG
	 * backup config
	 * \else
	 * 存储新增，导入导出配置
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_BK_CONFIG = 27;                           
	
	/**
	 * \if ENGLISH_LANG
	 * intelli config
	 * \else
	 * 智能配置
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_INTELLI_CONFIG = 28;                      
	
	/**
	 * \if ENGLISH_LANG
	 * add or remove remote device
	 * \else
	 * 添加删除远程设备
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_REMOTE_DEVICE = 29;                       
	
	/**
	 * \if ENGLISH_LANG
	 * atm
	 * \else
	 * 卡口叠加
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_ATM_POS = 30;                            
	
	/**
	 * \if ENGLISH_LANG
	 * kick user
	 * \else
	 * 踢除用户
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_OFFLINE_LOGINED_USER = 31;                
	
	/**
	 * \if ENGLISH_LANG
	 * audio
	 * \else
	 * 存储使用，语音投放
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_AUDIO_AUTH = 32;                          
	
	/**
	 * \if ENGLISH_LANG
	 * set spot
	 * \else
	 * 存储使用，视频矩阵
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_SPOT_SET = 33;                           
	
	/**
	 * \if ENGLISH_LANG
	 * set tv
	 * \else
	 * 存储使用，TV边距调节
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_TVSET = 34;                             
	
	/**
	 * \if ENGLISH_LANG
	 * manage IPSAN
	 * \else
	 * IPSAN管理
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_IPSAN= 35;                         
	
	/**
	 * \if ENGLISH_LANG
	 * config
	 * \else
	 * 存储使用，含义较模糊，不建议使用
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_CONFIG = 36;                             
	
	/**
	 * \if ENGLISH_LANG
	 * arming
	 * \else
	 * 布防
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_ARMING = 37;                              
	
	/**
	 * \if ENGLISH_LANG
	 * disarming
	 * \else
	 * 撤防
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_DISARM = 38;                             
	
	/**
	 * \if ENGLISH_LANG
	 * bypass fo all channel
	 * \else
	 * 旁路（所有通道）
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_BYPASS = 39;                           
	
	/**
	 * \if ENGLISH_LANG
	 * bypass fo some channel
	 * \else
	 * 旁路（部分通道）
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_BYPASS_PARTIAL = 40;                     
	
	/**
	 * \if ENGLISH_LANG
	 * alarm bell
	 * \else
	 * 警号输出
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_ALARM_BELL = 41;                         
	
	/**
	 * \if ENGLISH_LANG
	 * alarm config for some channel
	 * \else
	 * 消警（部分通道）
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_ALARM_CONFIRM_PARTIAL = 42;               
	
	/**
	 * \if ENGLISH_LANG
	 * defence config for some channel
	 * \else
	 * 防区配置（部分通道）
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_DEFENCE_CONFIG_PARTIAL = 43;             
	
	/**
	 * \if ENGLISH_LANG
	 * alarm output config for some channel
	 * \else
	 * 报警输出（部分通道）
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_ALARM_OUT_PARITAL = 44;                   
	
	/**
	 * \if ENGLISH_LANG
	 * talk
	 * \else
	 * 语音对讲
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_TALK = 45;                                
	
	/**
	 * \if ENGLISH_LANG
	 * wireless config
	 * \else
	 * 无线网配置
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_WIRELESS_CONFIG = 46;                   
	
	/**
	 * \if ENGLISH_LANG
	 * mobile config
	 * \else
	 * 移动业务配置
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_MOBILE_CONFIG = 47;                      
	
	/**
	 * \if ENGLISH_LANG
	 * audio detection config
	 * \else
	 * 音频检测配置
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_AUDIO_DETECT_CONFIG = 48;               
	
	/**
	 * \if ENGLISH_LANG
	 * net preview for some channel
	 * \else
	 * 预览通道
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_NET_PREVIEW_FOR_CHANNEL = 49;            

	/**
	 * \if ENGLISH_LANG
	 * reboot device
	 * \else
	 * 设备重启
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_REBOOT = 50;                              
	
	/**
	 * \if ENGLISH_LANG
	 * system lens
	 * \else
	 * 网络机芯没有云台，但需要控制变倍、聚焦、光圈等功能，增加此权限项
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_SYS_LENS = 51;                           
	
	/**
	 * \if ENGLISH_LANG
	 * rain brush config
	 * \else
	 * 雨刷配置
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_RAIN_BRUSH_CONFIG = 52;                 
	
	/**
	 * \if ENGLISH_LANG
	 * lighting config
	 * \else
	 * 灯光配置
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_LIGHTING_CONFIG = 53;                 
	
	/**
	 * \if ENGLISH_LANG
	 * access control for all channel
	 * \else
	 * 门禁控制（所有通道）
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_ACCESS_CONTROL = 54;                 
	
	/**
	 * \if ENGLISH_LANG
	 * access control for some channel
	 * \else
	 * 门禁控制（部分通道）
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_ACCESS_CONTROL_PARTIAL = 55;          
	
	/**
	 * \if ENGLISH_LANG
	 * decode tour
	 * \else
	 * 解码轮巡
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_DECODE_TOUR = 56;                        
	
	/**
	 * \if ENGLISH_LANG
	 * video out
	 * \else
	 * 视频输出
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_VIDEO_OUT = 57;                          
	
	/**
	 * \if ENGLISH_LANG
	 * ptz for some channel
	 * \else
	 * 云台控制通道
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_PTZ_FOR_CHANNEL = 58;                     
	
	/**
	 * \if ENGLISH_LANG
	 * modify languange
	 * \else
	 * 修改语言
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_MODIFY_LANGUANGE = 59;                   
	
	/**
	 * \if ENGLISH_LANG
	 * modify video
	 * \else
	 * 修改视频制式
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_MODIFY_VIDEO = 60;                      
	
	/**
	 * \if ENGLISH_LANG
	 * course record control
	 * \else
	 * 导播控制
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_COURSE_RECORD_CONTROL = 61;              
	
	/**
	 * \if ENGLISH_LANG
	 * course record schedule
	 * \else
	 * 查询课程表
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_COURSE_RECORD_SCHEDULE = 62;            
	
	/**
	 * \if ENGLISH_LANG
	 * course record modify schedule
	 * \else
	 * 修改课程表
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_COURSE_RECORD_MODIFY_SCHEDULE = 63;     
	
	/**
	 * \if ENGLISH_LANG
	 * course record intell param
	 * \else
	 * 录播智能参数
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_COURSE_RECORD_INTELL_PARAM = 64;         
	
	/**
	 * \if ENGLISH_LANG
	 * camera peripheral
	 * \else
	 * 摄像头外设，包含雨刷、风扇、加热器等
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_CAMERA_PERIPHERAL = 65;                 
	
	/**
	 * \if ENGLISH_LANG
	 * course record download media file
	 * \else
	 * 下载课程录像文件
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_COURSE_RECORD_DOWNLOAD_MEDIA_FILE = 66;   
	
	/**
	 * \if ENGLISH_LANG
	 * course record modify media file
	 * \else
	 * 修改课程录像文件
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_COURSE_RECORD_MODIFY_MEDIA_FILE = 67;    
	
	/**
	 * \if ENGLISH_LANG
	 * course record delete media file
	 * \else
	 * 删除课程录像文件
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_COURSE_RECORD_DELETE_MEDIA_FILE = 68;     
	
	/**
	 * \if ENGLISH_LANG
	 * course record backup to usb
	 * \else
	 * 备份课程录像文件到设备端的USB上，与Backup不能同时生效。
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_COURSE_RECORD_BACKUP_TO_USB = 69;        
	
	/**
	 * \if ENGLISH_LANG
	 * course record backup to ftp
	 * \else
	 * 备份课程录像文件到FTP服务器，与Backup不能同时生效。
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_COURSE_RECORD_BACKUP_TO_FTP = 70;        
	
	/**
	 * \if ENGLISH_LANG
	 * course record export account
	 * \else
	 * 导出用户信息，与Account不能同时生效。
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_COURSE_RECORD_EXPORT_ACCONUT = 71;        
	
	/**
	 * \if ENGLISH_LANG
	 * course record query account
	 * \else
	 * 查询账户，与Account不能同时生效。
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_COURSE_RECORD_QUERY_ACCOUNT = 72;        
	
	/**
	 * \if ENGLISH_LANG
	 * course record modify account
	 * \else
	 * 修改账户，与Account不能同时生效。
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_COURSE_RECORD_MODIFY_ACCOUNT = 73;      
	
	/**
	 * \if ENGLISH_LANG
	 * course record reset password
	 * \else
	 * 密码重置，与Account不能同时生效。
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_COURSE_RECORD_RESET_PASSWORD = 74;       
	
	/**
	 * \if ENGLISH_LANG
	 * course record authority
	 * \else
	 * 权限管理，与Account不能同时生效。
	 * \endif
	 */
	public static final int EM_AUTHORITY_SUB_TYPE_COURSE_RECORD_AUTHORITY = 75;            
}

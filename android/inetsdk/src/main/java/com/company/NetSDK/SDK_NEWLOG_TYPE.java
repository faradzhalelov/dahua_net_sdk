package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Extensive log type. Correponding to {@link INetSDK#QueryLogEx}, Condition (int nType = 1; parameter reserved = &nType)
 * \else
 * 扩展日志类型,对应{@link INetSDK#QueryLogEx}接口,条件(int nType = 1; 参数reserved = &nType)
 * \endif
 */
public class SDK_NEWLOG_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device reboot 
	 * \else
	 * 设备重启
	 * \endif
	 */
	public static final int SDK_NEWLOG_REBOOT = 0;   
	
	/**
	 * \if ENGLISH_LANG
	 * Shut down device
	 * \else
	 * 设备关机
	 * \endif
	 */
	public static final int SDK_NEWLOG_SHUT = 1;     
	
	public static final int SDK_NEWLOG_REPORTSTOP = 2;
	public static final int SDK_NEWLOG_REPORTSTART = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Device upgrade
	 * \else
	 * 设备升级
	 * \endif
	 */
	public static final int SDK_NEWLOG_UPGRADE = 4;  
	
	/**
	 * \if ENGLISH_LANG
	 * system time update
	 * \else
	 * 系统时间更新
	 * \endif
	 */
	public static final int SDK_NEWLOG_SYSTIME_UPDATE = 5;    
	
	/**
	 * \if ENGLISH_LANG
	 * GPS time update
	 * \else
	 * GPS时间更新
	 * \endif
	 */
	public static final int SDK_NEWLOG_GPS_TIME_UPDATE = 6;            

	/**
	 * \if ENGLISH_LANG
	 * Voice intercom, true representative open, false on behalf of the closed
	 * \else
	 * 语音对讲, true代表开启,false代表关闭    
	 * \endif
	 */
	public static final int SDK_NEWLOG_AUDIO_TALKBACK = 7;  
	
	/**
	 * \if ENGLISH_LANG
	 * Transparent transmission, true representative open, false on behalf of the closed	
	 * \else
	 * 透明传输, true代表开启,false代表关闭      
	 * \endif
	 */
	public static final int SDK_NEWLOG_COMM_ADAPTER = 8;  
	
	/**
	 * \if ENGLISH_LANG
	 * NTP
	 * \else
	 * 网络校时 
	 * \endif
	 */
	public static final int SDK_NEWLOG_NET_TIMING = 9;                          

	/**
	 * \if ENGLISH_LANG
	 * Save configuration
	 * \else
	 * 保存配置
	 * \endif
	 */
	public static final int SDK_NEWLOG_CONFSAVE = 256;
	
	/**
	 * \if ENGLISH_LANG
	 * Read configuration 
	 * \else
	 * 读取配置
	 * \endif
	 */
	public static final int SDK_NEWLOG_CONFLOAD = 257;  
	
	/**
	 * \if ENGLISH_LANG
	 * File system error 
	 * \else
	 * 文件系统错误
	 * \endif
	 */
	public static final int SDK_NEWLOG_FSERROR = 512;                    
	
	/**
	 * \if ENGLISH_LANG
	 * HDD write error
	 * \else
	 * 硬盘写错误
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_WERR = 513;                   
	
	/**
	 * \if ENGLISH_LANG
	 * HDD read error
	 * \else
	 * 硬盘读错误
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_RERR = 514; 
	
	/**
	 * \if ENGLISH_LANG
	 * Set HDD type
	 * \else
	 * 设置硬盘类型
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_TYPE = 515;  
	
	/**
	 * \if ENGLISH_LANG
	 * Format HDD
	 * \else
	 * 格式化硬盘
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_FORMAT = 516;     
	
	/**
	 * \if ENGLISH_LANG
	 * Current working HDD space is not sufficient
	 * \else
	 * 当前工作盘空间不足
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_NOSPACE = 517;  
	
	/**
	 * \if ENGLISH_LANG
	 * Set HDD type as read-write
	 * \else
	 * 设置硬盘类型为读写盘
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_TYPE_RW = 518;  
	
	/**
	 * \if ENGLISH_LANG
	 * Set HDD type as read-only
	 * \else
	 * 设置硬盘类型为只读盘    
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_TYPE_RO = 519;              
	
	/**
	 * \if ENGLISH_LANG
	 * Set HDD type as redundant 
	 * \else
	 * 设置硬盘类型为冗余盘
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_TYPE_RE = 520;      
	
	/**
	 * \if ENGLISH_LANG
	 * Set HDD type as snapshot
	 * \else
	 * 设置硬盘类型为快照盘
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_TYPE_SS = 521; 
	
	/**
	 * \if ENGLISH_LANG
	 * No HDD
	 * \else
	 * 无硬盘记录日志
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_NONE = 522;   
	
	/**
	 * \if ENGLISH_LANG
	 * No work HDD
	 * \else
	 * 无工作盘(没有读写盘)
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_NOWORKHDD = 523;         
	
	/**
	 * \if ENGLISH_LANG
	 * Set HDD type to backup HDD
	 * \else
	 * 设置硬盘类型为备份盘
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_TYPE_BK = 524; 
	
	/**
	 * \if ENGLISH_LANG
	 * Set HDD type to reserve subareas
	 * \else
	 * 设置硬盘类型为保留分区
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_TYPE_REVERSE = 525;  
	
	/**
	 * \if ENGLISH_LANG
	 * note the boot-strap's hard disk info
	 * \else
	 * 记录开机时的硬盘信息
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_START_INFO = 526;    
	
	/**
	 * \if ENGLISH_LANG
	 * note the disk number after the disk change
	 * \else
	 * 记录换盘后的工作盘号
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_WORKING_DISK = 527;    
	
	/**
	 * \if ENGLISH_LANG
	 * note other errors of disk
	 * \else
	 * 记录硬盘其它错误
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_OTHER_ERROR = 528;  
	
	/**
	 * \if ENGLISH_LANG
	 * there has some little errors on disk
	 * \else
	 * 硬盘存在轻微问题
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_SLIGHT_ERR = 529;  
	
	/**
	 * \if ENGLISH_LANG
	 * there has some serious errors on disk
	 * \else
	 *  硬盘存在严重问题
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_SERIOUS_ERR = 530;    
	
	/**
	 * \if ENGLISH_LANG
	 * the end of the alarm that current disk has no space left 
	 * \else
	 *  当前工作盘空间不足报警结束
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_NOSPACE_END = 531;                     

	/**
	 * \if ENGLISH_LANG
	 * Raid operation
	 * \else
	 * Raid操作
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_TYPE_RAID_CONTROL = 532;  
	
	/**
	 * \if ENGLISH_LANG
	 * excess temperature
	 * \else
	 * 温度异常
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_TEMPERATURE_HIGH = 533;     
	
	/**
	 * \if ENGLISH_LANG
	 * lower die temperature
	 * \else
	 * 温度过低
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_TEMPERATURE_LOW = 534;        
	
	/**
	 * \if ENGLISH_LANG
	 * remove eSATA
	 * \else
	 * 移除eSATA
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_ESATA_REMOVE = 535;                    

	/**
	 * \if ENGLISH_LANG
	 * External alarm begin 
	 * \else
	 * 外部输入报警开始
	 * \endif
	 */
	public static final int SDK_NEWLOG_ALM_IN = 768; 
	
	/**
	 * \if ENGLISH_LANG
	 * Network alarm input 
	 * \else
	 * 网络报警
	 * \endif
	 */
	public static final int SDK_NEWLOG_NETALM_IN = 769;     
	
	/**
	 * \if ENGLISH_LANG
	 * External input alarm stop 
	 * \else
	 * 外部输入报警停止
	 * \endif
	 */
	public static final int SDK_NEWLOG_ALM_END = 770;   
	
	/**
	 * \if ENGLISH_LANG
	 * Video loss alarm begin 
	 * \else
	 * 视频丢失报警开始
	 * \endif
	 */
	public static final int SDK_NEWLOG_LOSS_IN = 771;   
	
	/**
	 * \if ENGLISH_LANG
	 * Video loss alarm stop 
	 * \else
	 * 视频丢失报警结束
	 * \endif
	 */
	public static final int SDK_NEWLOG_LOSS_END = 772;            
	
	/**
	 * \if ENGLISH_LANG
	 * Motion detection alarm begin
	 * \else
	 * 动态检测报警开始
	 * \endif
	 */
	public static final int SDK_NEWLOG_MOTION_IN = 773;  
	
	/**
	 * \if ENGLISH_LANG
	 * Motion detection alarm stop 
	 * \else
	 * 动态检测报警结束
	 * \endif
	 */
	public static final int SDK_NEWLOG_MOTION_END = 774;  
	
	/**
	 * \if ENGLISH_LANG
	 * Annunciator alarm input 
	 * \else
	 * 报警器报警输入
	 * \endif
	 */
	public static final int SDK_NEWLOG_ALM_BOSHI = 775;  
	
	/**
	 * \if ENGLISH_LANG
	 * Network disconnected 
	 * \else
	 * 网络断开
	 * \endif
	 */
	public static final int SDK_NEWLOG_NET_ABORT = 776;   
	
	/**
	 * \if ENGLISH_LANG
	 * Network connection restore  
	 * \else
	 * 网络恢复
	 * \endif
	 */
	public static final int SDK_NEWLOG_NET_ABORT_RESUME = 777;    
	
	/**
	 * \if ENGLISH_LANG
	 * Encoder error
	 * \else
	 * 编码器故障
	 * \endif
	 */
	public static final int SDK_NEWLOG_CODER_BREAKDOWN = 778;  
	
	/**
	 * \if ENGLISH_LANG
	 * ncoder error restore 
	 * \else
	 * 编码器故障恢复
	 * \endif
	 */
	public static final int SDK_NEWLOG_CODER_BREAKDOWN_RESUME = 779;
	
	/**
	 * \if ENGLISH_LANG
	 * Camera masking 
	 * \else
	 * 视频遮挡
	 * \endif
	 */
	public static final int SDK_NEWLOG_BLIND_IN = 780;   
	
	/**
	 * \if ENGLISH_LANG
	 * Restore camera masking  
	 * \else
	 * 视频遮挡恢复
	 * \endif
	 */
	public static final int SDK_NEWLOG_BLIND_END = 781;      
	
	/**
	 * \if ENGLISH_LANG
	 * High temperature 
	 * \else
	 * 温度异常
	 * \endif
	 */
	public static final int SDK_NEWLOG_ALM_TEMP_HIGH = 782;     
	
	/**
	 * \if ENGLISH_LANG
	 * Low voltage 
	 * \else
	 * 电压过低
	 * \endif
	 */
	public static final int SDK_NEWLOG_ALM_VOLTAGE_LOW = 783;     
	
	/**
	 * \if ENGLISH_LANG
	 * Battery capacity is not sufficient  
	 * \else
	 * 电池容量不足
	 * \endif
	 */
	public static final int SDK_NEWLOG_ALM_BATTERY_LOW = 784;   
	
	/**
	 * \if ENGLISH_LANG
	 * ACC power off 
	 * \else
	 * ACC断电
	 * \endif
	 */
	public static final int SDK_NEWLOG_ALM_ACC_BREAK = 785;  
	
	public static final int SDK_NEWLOG_ALM_ACC_RES = 786;
	
	/**
	 * \if ENGLISH_LANG
	 * GPS signal lost
	 * \else
	 * GPS无信号
	 * \endif
	 */
	public static final int SDK_NEWLOG_GPS_SIGNAL_LOST = 787;    
	
	/**
	 * \if ENGLISH_LANG
	 * GPS signal resume
	 * \else
	 * GPS信号恢复
	 * \endif
	 */
	public static final int SDK_NEWLOG_GPS_SIGNAL_RESUME = 788;    
	
	/**
	 * \if ENGLISH_LANG
	 * 3G signal lost
	 * \else
	 * 3G无信号
	 * \endif
	 */
	public static final int SDK_NEWLOG_3G_SIGNAL_LOST = 789;   
	
	/**
	 * \if ENGLISH_LANG
	 * 3G signal resume
	 * \else
	 * 3G信号恢复
	 * \endif
	 */
	public static final int SDK_NEWLOG_3G_SIGNAL_RESUME = 790;                   

	/**
	 * \if ENGLISH_LANG
	 * IPC external alarms
	 * \else
	 * IPC外部报警
	 * \endif
	 */
	public static final int SDK_NEWLOG_ALM_IPC_IN = 791;      
	
	/**
	 * \if ENGLISH_LANG
	 * IPC external alarms recovery
	 * \else
	 * IPC外部报警恢复
	 * \endif
	 */
	public static final int SDK_NEWLOG_ALM_IPC_END = 792;         
	
	/**
	 * \if ENGLISH_LANG
	 * Broken network alarm
	 * \else
	 * 断网报警
	 * \endif
	 */
	public static final int SDK_NEWLOG_ALM_DIS_IN = 793;        
	
	/**
	 * \if ENGLISH_LANG
	 * Broken network alarm recovery
	 * \else
	 * 断网报警恢复
	 * \endif
	 */
	public static final int SDK_NEWLOG_ALM_DIS_END = 794;                        

	/**
	 * \if ENGLISH_LANG
	 * Wireless alarm begin
	 * \else
	 * 无线报警开始
	 * \endif
	 */
	public static final int SDK_NEWLOG_INFRAREDALM_IN = 928;   
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless alarm end
	 * \else
	 * 无线报警结束
	 * \endif
	 */
	public static final int SDK_NEWLOG_INFRAREDALM_END = 929;    
	
	/**
	 * \if ENGLISH_LANG
	 * IP conflict 
	 * \else
	 * IP冲突
	 * \endif
	 */
	public static final int SDK_NEWLOG_IPCONFLICT = 930;  
	
	/**
	 * \if ENGLISH_LANG
	 * IP restore 
	 * \else
	 * IP恢复
	 * \endif
	 */
	public static final int SDK_NEWLOG_IPCONFLICT_RESUME = 931;  
	
	/**
	 * \if ENGLISH_LANG
	 * SD Card insert 
	 * \else
	 * SD卡插入
	 * \endif
	 */
	public static final int SDK_NEWLOG_SDPLUG_IN = 932;   
	
	/**
	 * \if ENGLISH_LANG
	 * SD Card Pull-out 
	 * \else
	 * SD卡拔出
	 * \endif
	 */
	public static final int SDK_NEWLOG_SDPLUG_OUT = 933;  
	
	/**
	 * \if ENGLISH_LANG
	 * Failed to bind port
	 * \else
	 * 网络端口绑定失败
	 * \endif
	 */
	public static final int SDK_NEWLOG_NET_PORT_BIND_FAILED = 934;     
	
	/**
	 * \if ENGLISH_LANG
	 * Hard disk error beep reset
	 * \else
	 * 硬盘错误报警蜂鸣结束
	 * \endif
	 */
	public static final int SDK_NEWLOG_HDD_BEEP_RESET = 935;     
	
	/**
	 * \if ENGLISH_LANG
	 * MAC conflict
	 * \else
	 * MAC冲突
	 * \endif
	 */
	public static final int SDK_NEWLOG_MAC_CONFLICT = 936;      
	
	/**
	 * \if ENGLISH_LANG
	 * MAC conflict resume
	 * \else
	 * MAC冲突恢复
	 * \endif
	 */
	public static final int SDK_NEWLOG_MAC_CONFLICT_RESUME = 937;     
	
	/**
	 * \if ENGLISH_LANG
	 * alarm of output state
	 * \else
	 * 报警输出状态
	 * \endif
	 */
	public static final int SDK_NEWLOG_ALARM_OUT = 938;    
	
	/**
	 * \if ENGLISH_LANG
	 * RAID state change
	 * \else
	 * RAID状态变化事件 
	 * \endif
	 */
	public static final int SDK_NEWLOG_ALM_RAID_STAT_EVENT = 939;      
	
	/**
	 * \if ENGLISH_LANG
	 * fire alarm, smoke or temperature
	 * \else
	 * 火警报警,烟感或温度
	 * \endif
	 */
	public static final int SDK_NEWLOG_ABLAZE_ON = 940;          
	
	/**
	 * \if ENGLISH_LANG
	 * fire alarm resume
	 * \else
	 * 火警报警 恢复
	 * \endif
	 */
	public static final int SDK_NEWLOG_ABLAZE_OFF = 941;  
	
	/**
	 * \if ENGLISH_LANG
	 * alarm of pulse type
	 * \else
	 * 智能脉冲型报警
	 * \endif
	 */
	public static final int SDK_NEWLOG_INTELLI_ALARM_PLUSE = 942;   
	
	/**
	 * \if ENGLISH_LANG
	 * begin of alarm
	 * \else
	 * 智能报警开始
	 * \endif
	 */
	public static final int SDK_NEWLOG_INTELLI_ALARM_IN = 943;        
	
	/**
	 * \if ENGLISH_LANG
	 * end of alarm
	 * \else
	 * 智能报警结束
	 * \endif
	 */
	public static final int SDK_NEWLOG_INTELLI_ALARM_END = 944;  
	
	/**
	 * \if ENGLISH_LANG
	 * 3G signal scan
	 * \else
	 * 3G信号检测
	 * \endif
	 */
	public static final int SDK_NEWLOG_3G_SIGNAL_SCAN = 945; 
	
	/**
	 * \if ENGLISH_LANG
	 * GPS signal scan
	 * \else
	 * GPS信号检测
	 * \endif
	 */
	public static final int SDK_NEWLOG_GPS_SIGNAL_SCAN = 946;  
	
	/**
	 * \if ENGLISH_LANG
	 * Auto record 
	 * \else
	 * 自动录象
	 * \endif
	 */
	public static final int SDK_NEWLOG_AUTOMATIC_RECORD = 1024;  
	
	/**
	 * \if ENGLISH_LANG
	 * Manual record
	 * \else
	 * 手动录象开
	 * \endif
	 */
	public static final int SDK_NEWLOG_MANUAL_RECORD = 1025; 
	
	/**
	 * \if ENGLISH_LANG
	 * stop record
	 * \else
	 * 停止录象
	 * \endif
	 */
	public static final int SDK_NEWLOG_CLOSED_RECORD = 1026; 
	
	/**
	 * \if ENGLISH_LANG
	 * Log in
	 * \else
	 * 登录
	 * \endif
	 */
	public static final int SDK_NEWLOG_LOGIN = 1280;   
	
	/**
	 * \if ENGLISH_LANG
	 * Log off
	 * \else
	 * 注销
	 * \endif
	 */
	public static final int SDK_NEWLOG_LOGOUT = 1281;    
	
	/**
	 * \if ENGLISH_LANG
	 * Add user
	 * \else
	 * 添加用户
	 * \endif
	 */
	public static final int SDK_NEWLOG_ADD_USER = 1282;     
	
	/**
	 * \if ENGLISH_LANG
	 * Delete user
	 * \else
	 * 删除用户
	 * \endif
	 */
	public static final int SDK_NEWLOG_DELETE_USER = 1283;                       
	
	/**
	 * \if ENGLISH_LANG
	 * Modify user
	 * \else
	 * 修改用户
	 * \endif
	 */
	public static final int SDK_NEWLOG_MODIFY_USER = 1284;          
	
	/**
	 * \if ENGLISH_LANG
	 * Add user group 
	 * \else
	 * 添加用户组
	 * \endif
	 */
	public static final int SDK_NEWLOG_ADD_GROUP = 1285; 
	
	/**
	 * \if ENGLISH_LANG
	 * Delete user group 
	 * \else
	 * 删除用户组
	 * \endif
	 */
	public static final int SDK_NEWLOG_DELETE_GROUP = 1286;
	
	/**
	 * \if ENGLISH_LANG
	 * Modify user group 
	 * \else
	 * 修改用户组
	 * \endif
	 */
	public static final int SDK_NEWLOG_MODIFY_GROUP = 1287;     
	
	/**
	 * \if ENGLISH_LANG
	 * Network user login
	 * \else
	 * 网络用户登录
	 * \endif
	 */
	public static final int SDK_NEWLOG_NET_LOGIN = 1288;            
	
	/**
	 * \if ENGLISH_LANG
	 * Clear log 
	 * \else
	 * 清除日志
	 * \endif
	 */
	public static final int SDK_NEWLOG_CLEAR = 1536;                 
	
	/**
	 * \if ENGLISH_LANG
	 * Search log 
	 * \else
	 * 查询日志
	 * \endif
	 */
	public static final int SDK_NEWLOG_SEARCHLOG = 1537;           
	
	/**
	 * \if ENGLISH_LANG
	 * Search record  
	 * \else
	 * 录像查询
	 * \endif
	 */
	public static final int SDK_NEWLOG_SEARCH = 1792;        
	
	/**
	 * \if ENGLISH_LANG
	 * Record download
	 * \else
	 * 录像下载
	 * \endif
	 */
	public static final int SDK_NEWLOG_DOWNLOAD = 1793; 
	
	/**
	 * \if ENGLISH_LANG
	 * Record playback
	 * \else
	 * 录像回放
	 * \endif
	 */
	public static final int SDK_NEWLOG_PLAYBACK = 1794;      
	
	/**
	 * \if ENGLISH_LANG
	 * Backup recorded file 
	 * \else
	 * 备份录像文件
	 * \endif
	 */
	public static final int SDK_NEWLOG_BACKUP = 1795;  
	
	/**
	 * \if ENGLISH_LANG
	 * Failed to backup recorded file
	 * \else
	 * 备份录像文件失败
	 * \endif
	 */
	public static final int SDK_NEWLOG_BACKUPERROR = 1796;                        

	/**
	 * \if ENGLISH_LANG
	 * Real-time backup, that is, copy CD
	 * \else
	 * 实时备份,即光盘刻录
	 * \endif
	 */
	public static final int SDK_NEWLOG_BACK_UPRT = 1797; 
	
	/**
	 * \if ENGLISH_LANG
	 * CD copy
	 * \else
	 * 光盘复制
	 * \endif
	 */
	public static final int SDK_NEWLOG_BACKUPCLONE = 1798;              
	
	/**
	 * \if ENGLISH_LANG
	 * Manual  changed
	 * \else
	 * 手动换盘
	 * \endif
	 */
	public static final int SDK_NEWLOG_DISK_CHANGED = 1799;        
	
	/**
	 * \if ENGLISH_LANG
	 * image palyback
	 * \else
	 * 图片回放
	 * \endif
	 */
	public static final int SDK_NEWLOG_IMAGEPLAYBACK = 1800;    
	
	/**
	 * \if ENGLISH_LANG
	 * Lock the video
	 * \else
	 * 锁定录像
	 * \endif
	 */
	public static final int SDK_NEWLOG_LOCKFILE = 1801;      
	
	/**
	 * \if ENGLISH_LANG
	 * Unlock the video
	 * \else
	 * 解锁录像
	 * \endif
	 */
	public static final int SDK_NEWLOG_UNLOCKFILE = 1802;    
	
	/**
	 * \if ENGLISH_LANG
	 * Add log superposition of ATM card number
	 * \else
	 * ATM卡号叠加添加日志
	 * \endif
	 */
	public static final int SDK_NEWLOG_ATMPOS = 1803;                             

	/**
	 * \if ENGLISH_LANG
	 * Time update
	 * \else
	 * 时间更新
	 * \endif
	 */
	public static final int SDK_NEWLOG_TIME_UPDATE  = 2048;       
	
	/**
	 * \if ENGLISH_LANG
	 * remote diary 

	 * \else
	 * 远程日志 
	 * \endif
	 */
	public static final int SDK_NEWLOG_REMOTE_STATE = 2128;               

	public static final int SDK_NEWLOG_USER_DEFINE = 2304;
	
	public static final int SDK_NEWLOG_TYPE_NR = 10;        
	
}

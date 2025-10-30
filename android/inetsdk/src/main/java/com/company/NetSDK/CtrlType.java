package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Control type, the Corresponding interface {@link INetSDK#ControlDevice}
 * \else
 * 控制类型，对应接口 {@link INetSDK#ControlDevice}
 * \endif
 */
public class CtrlType implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Reboot device
	 * \else
	 * 重启设备
	 * \endif
	 */
	public static final int     SDK_CTRL_REBOOT = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Shut down device
	 * \else
	 * 关闭设备
	 * \endif
	 */
	public static final int     SDK_CTRL_SHUTDOWN = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * HDD management
	 * \else
	 * 硬盘管理
	 * \endif
	 */
	public static final int     SDK_CTRL_DISK = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Network keyboard
	 * \else
	 * 网络键盘
	 * \endif
	 */
	public static final int     SDK_KEYBOARD_POWER = 3;						
	public static final int     SDK_KEYBOARD_ENTER = 4;
	public static final int     SDK_KEYBOARD_ESC = 5;
	public static final int     SDK_KEYBOARD_UP = 6;
	public static final int     SDK_KEYBOARD_DOWN = 7;
	public static final int     SDK_KEYBOARD_LEFT = 8;
	public static final int     SDK_KEYBOARD_RIGHT = 9;
	public static final int     SDK_KEYBOARD_BTN0 = 10;
	public static final int     SDK_KEYBOARD_BTN1 = 11;
	public static final int     SDK_KEYBOARD_BTN2 = 12;
	public static final int     SDK_KEYBOARD_BTN3 = 13;
	public static final int     SDK_KEYBOARD_BTN4 = 14;
	public static final int     SDK_KEYBOARD_BTN5 = 15;
	public static final int     SDK_KEYBOARD_BTN6 = 16;
	public static final int     SDK_KEYBOARD_BTN7 = 17;
	public static final int     SDK_KEYBOARD_BTN8 = 18;
	public static final int     SDK_KEYBOARD_BTN9 = 19;
	public static final int     SDK_KEYBOARD_BTN10 = 20;
	public static final int     SDK_KEYBOARD_BTN11 = 21;
	public static final int     SDK_KEYBOARD_BTN12 = 22;
	public static final int     SDK_KEYBOARD_BTN13 = 23;
	public static final int     SDK_KEYBOARD_BTN14 = 24;
	public static final int     SDK_KEYBOARD_BTN15 = 25;
	public static final int     SDK_KEYBOARD_BTN16 = 26;
	public static final int     SDK_KEYBOARD_SPLIT = 27;
	public static final int     SDK_KEYBOARD_ONE = 28;
	public static final int     SDK_KEYBOARD_NINE = 29;
	public static final int     SDK_KEYBOARD_ADDR = 30;
	public static final int     SDK_KEYBOARD_INFO = 31;
	public static final int     SDK_KEYBOARD_REC = 32;
	public static final int     SDK_KEYBOARD_FN1 = 33;
	public static final int     SDK_KEYBOARD_FN2 = 34;
	public static final int     SDK_KEYBOARD_PLAY = 35;
	public static final int     SDK_KEYBOARD_STOP = 36;
	public static final int     SDK_KEYBOARD_SLOW = 37;
	public static final int     SDK_KEYBOARD_FAST = 38;
	public static final int     SDK_KEYBOARD_PREW = 39;
	public static final int     SDK_KEYBOARD_NEXT = 40;
	public static final int     SDK_KEYBOARD_JMPDOWN = 41;
	public static final int     SDK_KEYBOARD_JMPUP = 42;
	public static final int     SDK_KEYBOARD_10PLUS = 43;
	public static final int     SDK_KEYBOARD_SHIFT = 44;
	public static final int     SDK_KEYBOARD_BACK = 45;
	
	/**
	 * \if ENGLISH_LANG
	 * new network keyboard function
	 * \else
	 * 新网络键盘功能
	 * \endif
	 */
	public static final int     SDK_KEYBOARD_LOGIN = 46; 
	
	/**
	 * \if ENGLISH_LANG
	 * switch video channel
	 * \else
	 * 切换视频通道
	 * \endif
	 */
	public static final int     SDK_KEYBOARD_CHNNEL = 47; 
    
	/**
	 * \if ENGLISH_LANG
	 * Activate alarm input
	 * \else
	 * 触发报警输入
	 * \endif
	 */
	public static final int     SDK_TRIGGER_ALARM_IN = 100;
	
	/**
	 * \if ENGLISH_LANG
	 * Activate alarm output
	 * \else
	 * 触发报警输出
	 * \endif
	 */
	public static final int     SDK_TRIGGER_ALARM_OUT = 101;
	
	/**
	 * \if ENGLISH_LANG
	 * Matrix control
	 * \else
	 * 矩阵控制
	 * \endif
	 */
	public static final int     SDK_CTRL_MATRIX = 102;
	
	/**
	 * \if ENGLISH_LANG
	 * SD card control(for IPC series). Please refer to HDD control
	 * \else
	 * SD卡控制(IPC产品)参数同硬盘控制
	 * \endif
	 */
	public static final int     SDK_CTRL_SDCARD = 103;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:begin burning 
	 * \else
	 * 刻录机控制，开始刻录
	 * \endif
	 */
	public static final int     SDK_BURNING_START = 104;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:stop burning
	 * \else
	 * 刻录机控制，结束刻录
	 * \endif
	 */
	public static final int     SDK_BURNING_STOP = 105;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:overlay password(The string ended with '\0'. Max length is 8 bits. )
	 * \else
	 * 刻录机控制，叠加密码(以'\0'为结尾的字符串，最大长度8位)
	 * \endif
	 */
	public static final int     SDK_BURNING_ADDPWD = 106;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:overlay head title(The string ended with '\0'. Max length is 1024 bytes. Use '\n' to Enter.)
	 * \else
	 * 刻录机控制，叠加片头(以'\0'为结尾的字符串，最大长度1024字节，支持分行，行分隔符'\n')
	 * \endif
	 */
	public static final int     SDK_BURNING_ADDHEAD = 107;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:overlay dot to the burned information(No parameter)
	 * \else
	 * 刻录机控制，叠加打点到刻录信息(参数无)
	 * \endif
	 */
	public static final int     SDK_BURNING_ADDSIGN = 108;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:self-defined overlay (The string ended with '\0'. Max length is 1024 bytes. Use '\n' to Enter)
	 * \else
	 * 刻录机控制，自定义叠加(以'\0'为结尾的字符串，最大长度1024字节，支持分行，行分隔符'\n')
	 * \endif
	 */
	public static final int     SDK_BURNING_ADDCURSTOMINFO = 109;
	
	/**
	 * \if ENGLISH_LANG
	 * restore device default setup 
	 * \else
	 * 恢复设备的默认设置
	 * \endif
	 */
	public static final int     SDK_CTRL_RESTOREDEFAULT = 110;
	
	/**
	 * \if ENGLISH_LANG
	 * Activate device snapshot
	 * \else
	 * 触发设备抓图
	 * \endif
	 */
	public static final int     SDK_CTRL_CAPTURE_START = 111;
	
	/**
	 * \if ENGLISH_LANG
	 * Clear log
	 * \else
	 * 清除日志
	 * \endif
	 */
	public static final int     SDK_CTRL_CLEARLOG = 112;
	
	/**
	 * \if ENGLISH_LANG
	 * Activate wireless alarm (IPC series)
	 * \else
	 * 触发无线报警(IPC产品)
	 * \endif
	 */
	public static final int     SDK_TRIGGER_ALARM_WIRELESS = 200;
	
	/**
	 * \if ENGLISH_LANG
	 * Mark important record
	 * \else
	 * 标识重要录像文件
	 * \endif
	 */
	public static final int     SDK_MARK_IMPORTANT_RECORD = 201;
	
	/**
	 * \if ENGLISH_LANG
	 * Network hard disk partition
	 * \else
	 * 网络硬盘分区
	 * \endif
	 */
	public static final int     SDK_CTRL_DISK_SUBAREA = 202;
	
	/**
	 * \if ENGLISH_LANG
	 * Annex burning
	 * \else
	 * 刻录机控制，附件刻录.
	 * \endif
	 */
	public static final int     SDK_BURNING_ATTACH = 203;
	
	/**
	 * \if ENGLISH_LANG
	 * Burn Pause
	 * \else
	 * 刻录暂停
	 * \endif
	 */
	public static final int     SDK_BURNING_PAUSE = 204;
	
	/**
	 * \if ENGLISH_LANG
	 * Burn Resume
	 * \else
	 * 刻录继续
	 * \endif
	 */
	public static final int     SDK_BURNING_CONTINUE = 205;
	
	/**
	 * \if ENGLISH_LANG
	 * Burn Postponed
	 * \else
	 * 刻录顺延
	 * \endif
	 */
	public static final int     SDK_BURNING_POSTPONE = 206;
	
	/**
	 * \if ENGLISH_LANG
	 * OEM control
	 * \else
	 * 报停控制
	 * \endif
	 */
	public static final int     SDK_CTRL_OEMCTRL = 207;
	
	/**
	 * \if ENGLISH_LANG
	 * Start to device backup
	 * \else
	 * 设备备份开始
	 * \endif
	 */
	public static final int     SDK_BACKUP_START = 208;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop to device backup
	 * \else
	 * 设备备份停止
	 * \endif
	 */
	public static final int     SDK_BACKUP_STOP = 209;
	
	/**
	 * \if ENGLISH_LANG
	 * Add WIFI configuration manually for car device
	 * \else
	 * 车载手动增加WIFI配置
	 * \endif
	 */
	public static final int     SDK_VIHICLE_WIFI_ADD = 210;
	
	/**
	 * \if ENGLISH_LANG
	 * Delete WIFI configuration manually for car device
	 * \else
	 * 车载手动删除WIFI配置
	 * \endif
	 */
	public static final int     SDK_VIHICLE_WIFI_DEC = 211;
	
	/**
	 * \if ENGLISH_LANG
	 * Start to buzzer control 
	 * \else
	 * 蜂鸣器控制开始
	 * \endif
	 */
	public static final int     SDK_BUZZER_START = 212;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop to buzzer control
	 * \else
	 * 蜂鸣器控制结束
	 * \endif
	 */
	public static final int     SDK_BUZZER_STOP = 213;
	
	/**
	 * \if ENGLISH_LANG
	 * Reject User
	 * \else
	 * 剔除用户
	 * \endif
	 */
	public static final int     SDK_REJECT_USER = 214;
	
	/**
	 * \if ENGLISH_LANG
	 * Shield User
	 * \else
	 * 屏蔽用户
	 * \endif
	 */
	public static final int     SDK_SHIELD_USER = 215;
	
	/**
	 * \if ENGLISH_LANG
	 * Rain Brush 
	 * \else
	 * 智能交通, 雨刷控制 
	 * \endif
	 */
	public static final int     SDK_RAINBRUSH = 216;
	
	/**
	 * \if ENGLISH_LANG
	 * manual snap , refer to {@link MANUAL_SNAP_PARAMETER}
	 * \else
	 * 年智能交通, 手动抓拍, 取值参考 {@link MANUAL_SNAP_PARAMETER}
	 * \endif
	 */
	public static final int     SDK_MANUAL_SNAP = 217;
	
	/**
	 * \if ENGLISH_LANG
	 * manual ntp time adjust
	 * \else
	 * 手动NTP校时
	 * \endif
	 */
	public static final int     SDK_MANUAL_NTP_TIMEADJUST = 218;
	
	/**
	 * \if ENGLISH_LANG
	 * navigation info and note
	 * \else
	 * 导航信息和短消息
	 * \endif
	 */
	public static final int     SDK_NAVIGATION_SMS = 219;
	
	/**
	 * \if ENGLISH_LANG
	 * route info
	 * \else
	 * 路线点位信息
	 * \endif
	 */
	public static final int     SDK_CTRL_ROUTE_CROSSING = 220;
	
	/**
	 * \if ENGLISH_LANG
	 * backup device format
	 * \else
	 * 格式化备份设备
	 * \endif
	 */
	public static final int     SDK_BACKUP_FORMAT = 221;
	
	/**
	 * \if ENGLISH_LANG
	 * local preview split, refer to {@link DEVICE_LOCALPREVIEW_SLIPT_PARAMETER}
	 * \else
	 * 控制设备端本地预览分割, 取值参考 {@link DEVICE_LOCALPREVIEW_SLIPT_PARAMETER}
	 * \endif
	 */
	public static final int     SDK_DEVICE_LOCALPREVIEW_SLIPT = 222;
	
	/**
	 * \if ENGLISH_LANG
	 * RAID init
	 * \else
	 * RAID初始化
	 * \endif
	 */
	public static final int     SDK_CTRL_INIT_RAID = 223;
	
	/**
	 * \if ENGLISH_LANG
	 * RAID control
	 * \else
	 * RAID操作
	 * \endif
	 */
	public static final int     SDK_CTRL_RAID = 224;
	
	/**
	 * \if ENGLISH_LANG
	 * sapredisk control
	 * \else
	 * 热备盘操作
	 * \endif
	 */
	public static final int     SDK_CTRL_SAPREDISK = 225;
	
	/**
	 * \if ENGLISH_LANG
	 * wifi connect, refer to {@link WIFI_CONNECT}
	 * \else
	 * 手动发起WIFI连接, 取值参考 {@link WIFI_CONNECT}
	 * \endif
	 */
	public static final int     SDK_WIFI_CONNECT = 226;
	
	/**
	 * \if ENGLISH_LANG
	 * wifi disconnect, refer to {@link WIFI_CONNECT}
	 * \else
	 * 手动断开WIFI连接, 取值参考 {@link WIFI_CONNECT}
	 * \endif
	 */
	public static final int     SDK_WIFI_DISCONNECT = 227;
	
	/**
	 * \if ENGLISH_LANG
	 * Arm/disarm operation 
	 * \else
	 * 布撤防操作
	 * \endif
	 */
	public static final int     SDK_CTRL_ARMED = 228;
	
	/**
	 * \if ENGLISH_LANG
	 * IP modify, refer to {@link SDKCTRL_IPMODIFY_PARAM}
	 * \else
	 * 修改前端IP, 取值参考 {@link SDKCTRL_IPMODIFY_PARAM}
	 * \endif
	 */
	public static final int     SDK_CTRL_IP_MODIFY = 229;
	
	/**
	 * \if ENGLISH_LANG
	 * wps connect wifi, refer to {@link SDKCTRL_CONNECT_WIFI_BYWPS}
	 * \else
	 * wps连接wifi, 取值参考 {@link SDKCTRL_CONNECT_WIFI_BYWPS}
	 * \endif
	 */
	public static final int     SDK_CTRL_WIFI_BY_WPS = 230;
	
	/**
	 * \if ENGLISH_LANG
	 * format pattion, refer to {@link SDK_FORMAT_PATITION}
	 * \else
	 * 格式化分区, 取值参考 {@link SDK_FORMAT_PATITION}
	 * \endif
	 */
	public static final int     SDK_CTRL_FORMAT_PATITION = 231;
	
	/**
	 * \if ENGLISH_LANG
	 * eject storage device, refer to {@link SDK_EJECT_STORAGE_DEVICE}
	 * \else
	 * 手动卸载设备, 取值参考 {@link SDK_EJECT_STORAGE_DEVICE}
	 * \endif
	 */
	public static final int     SDK_CTRL_EJECT_STORAGE = 232;
	
	/**
	 * \if ENGLISH_LANG
	 * load storage device, refer to {@link SDK_LOAD_STORAGE_DEVICE}
	 * \else
	 * 手动装载设备， 取值参考 {@link SDK_LOAD_STORAGE_DEVICE}
	 * \endif
	 */
	public static final int     SDK_CTRL_LOAD_STORAGE = 233;
	
	/**
	 * \if ENGLISH_LANG
	 * close burner, need wait 6s, refer to {@link NET_CTRL_BURNERDOOR}
	 * \else
	 * 关闭刻录机光驱门,一般需要等6秒, 取值参考 {@link NET_CTRL_BURNERDOOR}
	 * \endif
	 */
	public static final int     SDK_CTRL_CLOSE_BURNER = 234;
	
	/**
	 * \if ENGLISH_LANG
	 * eject burner, need wait 4s， refer to {@link NET_CTRL_BURNERDOOR}
	 * \else
	 * 弹出刻录机光驱门, 一般需要等4秒, 取值参考 {@link NET_CTRL_BURNERDOOR}
	 * \endif
	 */
	public static final int     SDK_CTRL_EJECT_BURNER = 235;
	
	/**
	 * \if ENGLISH_LANG
	 * confirm alarm, refer to {@link NET_CTRL_CLEAR_ALARM}
	 * \else
	 * 消警, 取值参考 {@link NET_CTRL_CLEAR_ALARM}
	 * \endif
	 */
	public static final int     SDK_CTRL_CLEAR_ALARM = 236;
	
	/**
	 * \if ENGLISH_LANG
	 * Monitorwall_TV info, refer to {@link NET_CTRL_MONITORWALL_TVINFO} 
	 * \else
	 * 电视墙信息显示, 取值参考 {@link NET_CTRL_MONITORWALL_TVINFO} 
	 * \endif
	 */
	public static final int     SDK_CTRL_MONITORWALL_TVINFO = 237;
	
	/**
	 * \if ENGLISH_LANG
	 * start Intelligent VIDEO analysis, refer to {@link NET_CTRL_START_VIDEO_ANALYSE}
	 * \else
	 * 开始视频智能分析, 取值参考 {@link NET_CTRL_START_VIDEO_ANALYSE}
	 * \endif
	 */
	public static final int     SDK_CTRL_START_VIDEO_ANALYSE =   238; 
	
	/**
	 * \if ENGLISH_LANG
	 * STOP intelligent VIDEO analysis, refer to {@link NET_CTRL_STOP_VIDEO_ANALYSE}
	 * \else
	 * 停止视频智能分析, 取值参考 {@link NET_CTRL_STOP_VIDEO_ANALYSE}
	 * \endif
	 */
	public static final int     SDK_CTRL_STOP_VIDEO_ANALYSE =   239;
	
	/**
	 * \if ENGLISH_LANG
	 * Controlled start equipment upgrades, independently complete the upgrade process by the equipment do not need to upgrade file
	 * \else
	 * 控制启动设备升级,由设备独立完成升级过程,不需要传输升级文件
	 * \endif
	 */
	public static final int     SDK_CTRL_UPGRADE_DEVICE =   240;
	
	/**
	 * \if ENGLISH_LANG
	 * Multi-channel preview playback channel switching, refer to  {@link NET_CTRL_MULTIPLAYBACK_CHANNALES}
	 * \else
	 * 切换多通道预览回放的通道, 取值参考 {@link NET_CTRL_MULTIPLAYBACK_CHANNALES}
	 * \endif
	 */
	public static final int     SDK_CTRL_MULTIPLAYBACK_CHANNALES =   241;
	
	/**
	 * \if ENGLISH_LANG
	 * Turn on the switch power supply timing device output, refer to {@link NET_CTRL_SEQPOWER_PARAM}
	 * \else
	 * 电源时序器打开开关量输出口, 取值参考 {@link NET_CTRL_SEQPOWER_PARAM}
	 * \endif
	 */
	public static final int     SDK_CTRL_SEQPOWER_OPEN =   242;
	
	/**
	 * \if ENGLISH_LANG
	 * Close the switch power supply timing device output， refer to {@link NET_CTRL_SEQPOWER_PARAM} 
	 * \else
	 * 电源时序器关闭开关量输出口, 取值参考 {@link NET_CTRL_SEQPOWER_PARAM} 
	 * \endif
	 */
	public static final int     SDK_CTRL_SEQPOWER_CLOSE =   243;
	
	/**
	 * \if ENGLISH_LANG
	 * Power timing group open the switch quantity output, refer to {@link NET_CTRL_SEQPOWER_PARAM}
	 * \else
	 * 电源时序器打开开关量输出口组, 取值参考 {@link NET_CTRL_SEQPOWER_PARAM} 
	 * \endif
	 */
	public static final int     SDK_CTRL_SEQPOWER_OPEN_ALL =   244;
	
	/**
	 * \if ENGLISH_LANG
	 * Power sequence set close the switch quantity output, refer to {@link NET_CTRL_SEQPOWER_PARAM}
	 * \else
	 * 电源时序器关闭开关量输出口组, 取值参考 {@link NET_CTRL_SEQPOWER_PARAM} 
	 * \endif
	 */
	public static final int     SDK_CTRL_SEQPOWER_CLOSE_ALL =   245;
	
	/**
	 * \if ENGLISH_LANG
	 * PROJECTOR up, refer to {@link NET_CTRL_PROJECTOR_PARAM} 
	 * \else
	 * 投影仪上升, 取值参考 {@link NET_CTRL_PROJECTOR_PARAM} 
	 * \endif
	 */
	public static final int     SDK_CTRL_PROJECTOR_RISE =   246;
	
	/**
	 * \if ENGLISH_LANG
	 * PROJECTOR drop, refer to {@link NET_CTRL_PROJECTOR_PARAM} 
	 * \else
	 * 投影仪下降, 取值参考 {@link NET_CTRL_PROJECTOR_PARAM} M
	 * \endif
	 */
	public static final int     SDK_CTRL_PROJECTOR_FALL =   247;
	
	/**
	 * \if ENGLISH_LANG
	 * PROJECTOR stop, refer to {@link NET_CTRL_PROJECTOR_PARAM}
	 * \else
	 * 投影仪停止, 取值参考 {@link NET_CTRL_PROJECTOR_PARAM}
	 * \endif
	 */
	public static final int     SDK_CTRL_PROJECTOR_STOP =   248;
	
	/**
	 * \if ENGLISH_LANG
	 * INFRARED buttons, refer to {@link NET_CTRL_INFRARED_KEY_PARAM} 
	 * \else
	 * 红外按键, 取值参考 {@link NET_CTRL_INFRARED_KEY_PARAM}
	 * \endif
	 */
	public static final int     SDK_CTRL_INFRARED_KEY =   249;
	
	/**
	 * \if ENGLISH_LANG
	 * Device START playback of audio file, refer to {@link NET_CTRL_START_PLAYAUDIO} 
	 * \else
	 * 设备开始播放音频文件, 取值参考 {@link NET_CTRL_START_PLAYAUDIO}
	 * \endif
	 */
	public static final int     SDK_CTRL_START_PLAYAUDIO =   250;
	
	/**
	 * \if ENGLISH_LANG
	 * Equipment stop playback of audio file
	 * \else
	 * 设备停止播放音频文件
	 * \endif
	 */
	public static final int     SDK_CTRL_STOP_PLAYAUDIO =   251;
	
	/**
	 * \if ENGLISH_LANG
	 * open alarm, refer to {@link NET_CTRL_ALARMBELL} 
	 * \else
	 * 开启警号, 取值参考 {@link NET_CTRL_ALARMBELL}
	 * \endif
	 */
	public static final int     SDK_CTRL_START_ALARMBELL =   252;
	
	/**
	 * \if ENGLISH_LANG
	 * Close the warning signal, refer to {@link NET_CTRL_ALARMBELL} 
	 * \else
	 * 关闭警号, 取值参考 {@link NET_CTRL_ALARMBELL} 
	 * \endif
	 */
	public static final int     SDK_CTRL_STOP_ALARMBELL =   253;
	
	/**
	 * \if ENGLISH_LANG
	 * OPEN ACCESS control, refer to {@link NET_CTRL_ACCESS_OPEN} 
	 * \else
	 * 门禁控制-开门, 取值参考 {@link NET_CTRL_ACCESS_OPEN} 
	 * \endif
	 */
	public static final int     SDK_CTRL_ACCESS_OPEN =   254;
	
	/**
	 * \if ENGLISH_LANG
	 * Set BYPASS function, refer to {@link NET_CTRL_SET_BYPASS} 
	 * \else
	 * 设置旁路功能, 取值参考 {@link NET_CTRL_SET_BYPASS} 
	 * \endif
	 */
	public static final int     SDK_CTRL_SET_BYPASS =   255;
	
	/**
	 * \if ENGLISH_LANG
	 * Add records to record set number, refer to {@link NET_CTRL_RECORDSET_INSERT_PARAM} 
	 * \else
	 * 添加记录，获得记录集编号, 取值参考 {@link NET_CTRL_RECORDSET_INSERT_PARAM} 
	 * \endif
	 */
	public static final int     SDK_CTRL_RECORDSET_INSERT =   256;
	
	/**
	 * \if ENGLISH_LANG
	 * Update a record of the number, refer to {@link NET_CTRL_RECORDSET_PARAM} 
	 * \else
	 * 更新某记录集编号的记录, 取值参考 {@link NET_CTRL_RECORDSET_PARAM} 
	 * \endif
	 */
	public static final int     SDK_CTRL_RECORDSET_UPDATE =   257;
	
	/**
	 * \if ENGLISH_LANG
	 * According to the record set number to delete a record, refer to {@link NET_CTRL_RECORDSET_PARAM}
	 * \else
	 * 根据记录集编号删除某记录(只需要下发记录集编号), 取值参考 {@link NET_CTRL_RECORDSET_PARAM},
	 * \endif
	 */
	public static final int     SDK_CTRL_RECORDSET_REMOVE =   258;
	
	/**
	 * \if ENGLISH_LANG
	 * Remove all RECORDSET information, refer to {@link NET_CTRL_RECORDSET_PARAM} 
	 * \else
	 * 清除所有记录集信息, 取值参考 {@link NET_CTRL_RECORDSET_PARAM} 
	 * \endif
	 */
	public static final int     SDK_CTRL_RECORDSET_CLEAR =   259;
	
	/**
	 * \if ENGLISH_LANG
	 * Entrance guard control - CLOSE, refer to {@link NET_CTRL_ACCESS_CLOSE} 
	 * \else
	 * 门禁控制-关门, 取值参考 {@link NET_CTRL_ACCESS_CLOSE} 
	 * \endif
	 */
	public static final int     SDK_CTRL_ACCESS_CLOSE =   260;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm sub system activation setup, refer to {@link NET_CTRL_ALARM_SUBSYSTEM_SETACTIVE}
	 * \else
	 * 报警子系统激活设置, 取值参考 {@link NET_CTRL_ALARM_SUBSYSTEM_SETACTIVE} 
	 * \endif
	 */
	public static final int     SDK_CTRL_ALARM_SUBSYSTEM_ACTIVE_SET =   261;
	
	/**
	 * \if ENGLISH_LANG
	 * Unable device open gateway, refer to {@link NET_CTRL_FORBID_OPEN_STROBE}
	 * \else
	 * 禁止设备端开闸, 取值参考 {@link NET_CTRL_FORBID_OPEN_STROBE} 
	 * \endif
	 */
	public static final int     SDK_CTRL_FORBID_OPEN_STROBE =   262;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable gateway, refer to {@link NET_CTRL_OPEN_STROBE}
	 * \else
	 * 开启道闸, 取值参考 {@link NET_CTRL_OPEN_STROBE} 
	 * \endif
	 */
	public static final int     SDK_CTRL_OPEN_STROBE =   263;
	
	/**
	 * \if ENGLISH_LANG
	 * Talk no response, refer to {@link NET_CTRL_TALKING_REFUSE}
	 * \else
	 * 对讲拒绝接听, 取值参考 {@link NET_CTRL_TALKING_REFUSE} 
	 * \endif
	 */
	public static final int     SDK_CTRL_TALKING_REFUSE =   264;
	
	/**
	 * \if ENGLISH_LANG
	 * arm-disarm operation, {@link CTRL_ARM_DISARM_PARAM} upgrade，recommended, refer to {@link CTRL_ARM_DISARM_PARAM_EX}
	 * \else
	 * 布撤防操作, 对 {@link CTRL_ARM_DISARM_PARAM} 升级，建议用这个, 取值参考 {@link CTRL_ARM_DISARM_PARAM_EX}
	 * \endif
	 */
	public static final int     SDK_CTRL_ARMED_EX = 265;
	
	/**
	 * \if ENGLISH_LANG
	 * Net keyboard control， refer to {@link SDKCTRL_NET_KEYBOARD}
	 * \else
	 * 网络键盘控制, 取值参考 {@link SDKCTRL_NET_KEYBOARD} 
	 * \endif
	 */
    public static final int     SDK_CTRL_NET_KEYBOARD = 400;
    
    /**
	 * \if ENGLISH_LANG
	 * Open air conditioner, refer to {@link NET_CTRL_OPEN_AIRCONDITION}
	 * \else
	 * 打开空调, 取值参考 {@link NET_CTRL_OPEN_AIRCONDITION} 
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_OPEN = 401;
    
    /**
	 * \if ENGLISH_LANG
	 * Close air-conditione, refer to {@link NET_CTRL_CLOSE_AIRCONDITION}
	 * \else
	 * 关闭空调, 取值参考 {@link NET_CTRL_CLOSE_AIRCONDITION} 
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_CLOSE = 402;
    
    /**
	 * \if ENGLISH_LANG
	 * Set temperature, refer to {@link NET_CTRL_SET_TEMPERATURE} 
	 * \else
	 * 设定空调温度, 取值参考 {@link NET_CTRL_SET_TEMPERATURE} 
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_SET_TEMPERATURE = 403;
    
    /**
	 * \if ENGLISH_LANG
	 * Adjust temperature, refer to {@link NET_CTRL_ADJUST_TEMPERATURE}
	 * \else
	 * 调节空调温度, 取值参考 {@link NET_CTRL_ADJUST_TEMPERATURE} 
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_ADJUST_TEMPERATURE = 404;
    
    /**
	 * \if ENGLISH_LANG
	 * Set air work mode, refer to {@link NET_CTRL_ADJUST_TEMPERATURE}
	 * \else
	 * 设置空调工作模式, 取值参考 {@link NET_CTRL_ADJUST_TEMPERATURE} 
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_SETMODE = 405;
    
    /**
	 * \if ENGLISH_LANG
	 * Set fan mode, refer to {@link NET_CTRL_AIRCONDITION_SETMODE}
	 * \else
	 * 设置空调送风模式, 取值参考 {@link NET_CTRL_AIRCONDITION_SETMODE} 
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_SETWINDMODE = 406;
    
    /**
	 * \if ENGLISH_LANG
	 * Recover device default and set new protocol, refer to {@link NET_CTRL_RESTORE_DEFAULT}
	 * Recover config and use this enumeration first, if port failed,
	 * and GetLastError return NET_UNSUPPORTED, try again {@link SDK_CTRL_RESTOREDEFAULT} restore config
	 * \else
	 * 恢复设备的默认设置新协议, 取值参考 {@link NET_CTRL_RESTORE_DEFAULT} 
	 * 恢复配置优先使用该枚举，如果接口失败，
	 * 且GetLastError返回NET_UNSUPPORTED,再尝试使用{@link SDK_CTRL_RESTOREDEFAULT}恢复配置
	 * \endif
	 */
    public static final int     SDK_CTRL_RESTOREDEFAULT_EX  = 407;
    
    /**
	 * \if ENGLISH_LANG
	 * send event to device, refer to {@link NET_NOTIFY_EVENT_DATA} 
	 * \else
	 * 向设备发送事件, 取值参考 {@link NET_NOTIFY_EVENT_DATA} 
	 * \endif
	 */
    public static final int     SDK_CTRL_NOTIFY_EVENT = 408;
    
    /**
	 * \if ENGLISH_LANG
	 * mute alarm setup
	 * \else
	 * 无声报警设置
	 * \endif
	 */
    public static final int     SDK_CTRL_SILENT_ALARM_SET = 409;
    
    /**
	 * \if ENGLISH_LANG
	 * device start sound report, refer to {@link NET_CTRL_START_PLAYAUDIOEX}
	 * \else
	 * 设备开始语音播报, 取值参考 {@link NET_CTRL_START_PLAYAUDIOEX}  
	 * \endif
	 */
	public static final int     SDK_CTRL_START_PLAYAUDIOEX = 410;
	
	/**
	 * \if ENGLISH_LANG
	 * device stop sound report
	 * \else
	 * 设备停止语音播报,
	 * \endif
	 */
    public static final int     SDK_CTRL_STOP_PLAYAUDIOEX = 411;
    
    /**
	 * \if ENGLISH_LANG
	 * close gateway, refer to {@link NET_CTRL_CLOSE_STROBE}
	 * \else
	 * 关闭道闸, 取值参考 {@link NET_CTRL_CLOSE_STROBE} 
	 * \endif
	 */
    public static final int     SDK_CTRL_CLOSE_STROBE = 412;
    
    /**
	 * \if ENGLISH_LANG
	 * set parking reservation status, refer to {@link NET_CTRL_SET_ORDER_STATE}
	 * \else
	 * 设置车位预定状态, 取值参考 {@link NET_CTRL_SET_ORDER_STATE} 
	 * \endif
	 */
	public static final int     SDK_CTRL_SET_ORDER_STATE = 413;
	
	/**
	 * \if ENGLISH_LANG
	 * add record，get record collection no., refer to {@link NET_CTRL_RECORDSET_INSERT_PARAM}
	 * \else
	 * 添加记录，获得记录集编号, 取值参考 {@link NET_CTRL_RECORDSET_INSERT_PARAM} 
	 * \endif
	 */
	public static final int     SDK_CTRL_RECORDSET_INSERTEX = 414;
	
	/**
	 * \if ENGLISH_LANG
	 * update record set no.’s record, refer to {@link NET_CTRL_RECORDSET_PARAM}
	 * \else
	 * 更新某记录集编号的记录, 取值参考 {@link NET_CTRL_RECORDSET_PARAM} 
	 * \endif
	 */
    public static final int     SDK_CTRL_RECORDSET_UPDATEEX = 415;
    
    /**
	 * \if ENGLISH_LANG
	 * information collection, refer to {@link NET_CTRL_CAPTURE_FINGER_PRINT} 
	 * \else
	 * 信息采集, 取值参考 {@link NET_CTRL_CAPTURE_FINGER_PRINT} 
	 * \endif
	 */
    public static final int     SDK_CTRL_CAPTURE_FINGER_PRINT = 416;
    
    /**
	 * \if ENGLISH_LANG
	 * Parking lot entrance/exit controller LED setup, refer to {@link NET_CTRL_ECK_LED_SET_PARAM}
	 * \else
	 * 停车场出入口控制器LED设置, 取值参考 {@link NET_CTRL_ECK_LED_SET_PARAM} 
	 * \endif
	 */
	public static final int     SDK_CTRL_ECK_LED_SET = 417;
	
	/**
	 * \if ENGLISH_LANG
	 * Intelligent parking system in/out device IC card info import, refer to {@link NET_CTRL_ECK_IC_CARD_IMPORT_PARAM}
	 * \else
	 * 智能停车系统出入口机IC卡信息导入, 取值参考 {@link NET_CTRL_ECK_IC_CARD_IMPORT_PARAM} 
	 * \endif
	 */
    public static final int     SDK_CTRL_ECK_IC_CARD_IMPORT = 418;
    
    /**
	 * \if ENGLISH_LANG
	 * Intelligent parking system in/out device IC card info sync command, refer to {@link NET_CTRL_ECK_SYNC_IC_CARD_PARAM}, receive this command, device will delete original IC card info
	 * \else
	 * 智能停车系统出入口机IC卡信息同步指令, 取值参考 {@link NET_CTRL_ECK_SYNC_IC_CARD_PARAM} ，收到此指令后，设备删除原有IC卡信息
	 * \endif
	 */
    public static final int     SDK_CTRL_ECK_SYNC_IC_CARD = 419;
    
    /**
	 * \if ENGLISH_LANG
	 * Delete specific wireless device, refer to {@link NET_CTRL_LOWRATEWPAN_REMOVE}
	 * \else
	 * 删除指定无线设备, 取值参考 {@link NET_CTRL_LOWRATEWPAN_REMOVE} 
	 * \endif
	 */
    public static final int     SDK_CTRL_LOWRATEWPAN_REMOVE = 420;
    
    /**
	 * \if ENGLISH_LANG
	 * Modify wireless device info, refer to {@link NET_CTRL_LOWRATEWPAN_MODIFY}
	 * \else
	 * 修改无线设备信息, 取值参考 {@link NET_CTRL_LOWRATEWPAN_MODIFY}  
	 * \endif
	 */
    public static final int     SDK_CTRL_LOWRATEWPAN_MODIFY = 421;
    
    /**
	 * \if ENGLISH_LANG
	 * Set up the vehicle spot information of the machine at the passageway of the intelligent parking system, refer to {@link NET_CTRL_ECK_SET_PARK_INFO_PARAM}
	 * \else
	 * 智能停车系统出入口机设置车位信息, 取值参考 {@link NET_CTRL_ECK_SET_PARK_INFO_PARAM} 
	 * \endif
	 */
    public static final int     SDK_CTRL_ECK_SET_PARK_INFO = 422;
    
    /**
	 * \if ENGLISH_LANG
	 * hang up the video phone, refer to {@link NET_CTRL_VTP_DISCONNECT}  
	 * \else
	 * 挂断视频电话, 取值参考 {@link NET_CTRL_VTP_DISCONNECT} 
	 * \endif
	 */
	public static final int     SDK_CTRL_VTP_DISCONNECT = 423;
	
	public static final int     SDK_CTRL_UPDATE_FILES = 424;
	
	public static final int     SDK_CTRL_MATRIX_SAVE_SWITCH = 425;
	
	public static final int     SDK_CTR_MATRIX_RESTORE_SWITCH = 426;            
	
    /**
	 * \if ENGLISH_LANG
	 * call forwarding response, refer to {@link NET_CTRL_VTP_DIVERTACK} 
	 * \else
	 * 呼叫转发响应, 取值参考 {@link NET_CTRL_VTP_DIVERTACK}
	 * \endif
	 */
	public static final int     SDK_CTRL_VTP_DIVERTACK = 427;
	
    /**
	 * \if ENGLISH_LANG
	 * a rain brush once back and forth, refer to {@link NET_CTRL_RAINBRUSH_MOVEONCE}, the effective rainbrush mode configuration for manual mode
	 * \else
	 * 雨刷来回刷一次, 取值参考 {@link NET_CTRL_RAINBRUSH_MOVEONCE},雨刷模式配置为手动模式时有效
	 * \endif
	 */
    public static final int     SDK_CTRL_RAINBRUSH_MOVEONCE = 428;

    /**
	 * \if ENGLISH_LANG
	 * a rain brush circle back and forth, refer to {@link NET_CTRL_RAINBRUSH_MOVECONTINUOUSLY}, the effective rainbrush mode configuration for manual mode
	 * \else
	 * 雨刷来回循环刷, 取值参考 {@link NET_CTRL_RAINBRUSH_MOVECONTINUOUSLY},雨刷模式配置为手动模式时有效
	 * \endif
	 */
	public static final int     SDK_CTRL_RAINBRUSH_MOVECONTINUOUSLY = 429;
	
    /**
	 * \if ENGLISH_LANG
	 * a rain brushstop, refer to {@link NET_CTRL_RAINBRUSH_STOPMOVE}, the effective rainbrush mode configuration for manual mode
	 * \else
	 * 雨刷停止刷, 取值参考 {@link NET_CTRL_RAINBRUSH_STOPMOVE},雨刷模式配置为手动模式时有效
	 * \endif
	 */
	public static final int     SDK_CTRL_RAINBRUSH_STOPMOVE = 430;
	
	/**
  	 * \if ENGLISH_LANG
  	 * restore the configuration except the prescribed config   pInBuf = {@link NET_CTRL_RESTORE_EXCEPT}; pOutBuf = NULL
  	 * \else
  	 * 恢复除指定配置外的其他配置为默认   pInBuf = {@link NET_CTRL_RESTORE_EXCEPT}; pOutBuf = NULL
  	 * \endif
  	 */
    public static final int 	SDK_CTRL_RESTORE_EXCEPT			 = 435;

	/**
	 * \if ENGLISH_LANG
	 * Set park info, platform is set to camera,the content is used for the dot matrix display   pInBuf = {@link NET_CTRL_SET_PARK_INFO}; pOutBuf = NULL
	 * \else
	 * 设置停车信息，平台设置给相机，内容用于点阵屏显示   pInBuf = {@link NET_CTRL_SET_PARK_INFO}; pOutBuf = NULL
	 * \endif
	 */
	public static final int 	SDK_CTRL_SET_PARK_INFO			 = 436;

	/**
	 * \if ENGLISH_LANG
	 * clear the statistics for the period and start again from 0   pInBuf = {@link NET_CTRL_CLEAR_SECTION_STAT_INFO}; pOutBuf = NULL
	 * \else
	 * 清除当前时间段内人数统计信息, 重新从0开始计算   pInBuf = {@link NET_CTRL_CLEAR_SECTION_STAT_INFO}; pOutBuf = NULL
	 * \endif
	 */
	public static final int 	SDK_CTRL_CLEAR_SECTION_STAT			 = 437;

	/**
	 * \if ENGLISH_LANG
	 * access control - call lift   pInBuf = {@link NET_CTRL_ACCESS_CALL_LIFT}; pOutBuf = NULL
	 * \else
	 * 门禁控制-呼梯   pInBuf = {@link NET_CTRL_ACCESS_CALL_LIFT}; pOutBuf = NULL
	 * \endif
	 */
	public static final int 	SDK_CTRL_ACCESS_CALL_LIFT			 = 443;
	/************************************************************************
	 **          以下命令只在 ControlDeviceEx 上有效                       **
	 ***********************************************************************/
    /**
	 * \if ENGLISH_LANG
	 * Enable or unable thermal shutter, pInBuf = {@link NET_IN_THERMO_EN_SHUTTER}, pOutBuf= {@link NET_OUT_THERMO_EN_SHUTTER}
	 * \else
	 * 设置热成像快门启用/禁用, pInBuf = {@link NET_IN_THERMO_EN_SHUTTER} , pOutBuf= {@link NET_OUT_THERMO_EN_SHUTTER}
	 * \endif
	 */
    public static final int     SDK_CTRL_THERMO_GRAPHY_ENSHUTTER = 0x10000;     
    
    
    /**
	 * \if ENGLISH_LANG
	 * Set osd of ARGtemp_meas highlight, pInBuf = {@link NET_IN_RADIOMETRY_SETOSDMARK} , pOutBuf = {@link NET_OUT_RADIOMETRY_SETOSDMARK}
	 * \else
	 * 设置测温项的osd为高亮, pInBuf = {@link NET_IN_RADIOMETRY_SETOSDMARK} , pOutBuf = {@link NET_OUT_RADIOMETRY_SETOSDMARK}
	 * \endif
	 */
    public static final int     SDK_CTRL_RADIOMETRY_SETOSDMARK = 0x10001;   
    
    
    /**
	 * \if ENGLISH_LANG
	 * Enable audio record and get audio name, pInBuf = {@link NET_IN_AUDIO_REC_MNG_NAME} , pOutBuf = {@link NET_OUT_AUDIO_REC_MNG_NAME}
	 * \else
	 * 开启音频录音并得到录音名, pInBuf = {@link NET_IN_AUDIO_REC_MNG_NAME} , pOutBuf = {@link NET_OUT_AUDIO_REC_MNG_NAME}
	 * \endif
	 */
    public static final int     SDK_CTRL_AUDIO_REC_START_NAME = 0x10002;   
    
    
    /**
	 * \if ENGLISH_LANG
	 * Close audio file and return file name, pInBuf ,pInBuf = {@link NET_IN_AUDIO_REC_MNG_NAME} , pOutBuf = {@link NET_OUT_AUDIO_REC_MNG_NAME}
	 * \else
	 * 关闭音频录音并返回文件名称, pInBuf = {@link NET_IN_AUDIO_REC_MNG_NAME} , pOutBuf = {@link NET_OUT_AUDIO_REC_MNG_NAME}
	 * \endif
	 */
    public static final int     SDK_CTRL_AUDIO_REC_STOP_NAME = 0x10003;        
    
    
    /**
	 * \if ENGLISH_LANG
	 * Manual snap, pInBuf = {@link NET_IN_SNAP_MNG_SHOT} , pOutBuf = {@link NET_OUT_SNAP_MNG_SHOT}
	 * \else
	 * 即时抓图(又名手动抓图), pInBuf = {@link NET_IN_SNAP_MNG_SHOT} , pOutBuf = {@link NET_OUT_SNAP_MNG_SHOT}
	 * \endif
	 */
    public static final int     SDK_CTRL_SNAP_MNG_SNAP_SHOT = 0x10004;    
    
    
    /**
 	 * \if ENGLISH_LANG
 	 * Forcedly sync buffer data to the database and close the database, pInBuf = {@link NET_IN_LOG_MNG_CTRL} , pOutBuf = {@link NET_OUT_LOG_MNG_CTRL}
 	 * \else
 	 * 强制同步缓存数据到数据库并关闭数据库, pInBuf = {@link NET_IN_LOG_MNG_CTRL} , pOutBuf = {@link NET_OUT_LOG_MNG_CTRL}
 	 * \endif
 	 */
    public static final int     SDK_CTRL_LOG_STOP = 0x10005;   
    
    
    /**
 	 * \if ENGLISH_LANG
 	 * Resume database, pInBuf = {@link NET_IN_LOG_MNG_CTRL} , pOutBuf = {@link NET_OUT_LOG_MNG_CTRL}
 	 * \else
 	 * 恢复数据库, pInBuf = {@link NET_IN_LOG_MNG_CTRL} , pOutBuf = {@link NET_OUT_LOG_MNG_CTRL}
 	 * \endif
 	 */
    public static final int     SDK_CTRL_LOG_RESUME = 0x10006;   
    
    
    /**
 	 * \if ENGLISH_LANG
 	 * Add a POS device, pInBuf = {@link NET_IN_POS_ADD} , pOutBuf = {@link NET_OUT_POS_ADD}
 	 * \else
 	 * 增加一个Pos设备, pInBuf = {@link NET_IN_POS_ADD} , pOutBuf = {@link NET_OUT_POS_ADD}
 	 * \endif
 	 */
    public static final int     SDK_CTRL_POS_ADD = 0x10007;      
    
    
    /**
 	 * \if ENGLISH_LANG
 	 * Del a POS device, pInBuf = {@link NET_IN_POS_REMOVE} , pOutBuf = {@link NET_OUT_POS_REMOVE}
 	 * \else
 	 * 删除一个Pos设备, pInBuf = {@link NET_IN_POS_REMOVE} , pOutBuf = {@link NET_OUT_POS_REMOVE}
 	 * \endif
 	 */
    public static final int     SDK_CTRL_POS_REMOVE = 0x10008;       
    
    
    /**
  	 * \if ENGLISH_LANG
  	 * Del several POS device, pInBuf = {@link NET_IN_POS_REMOVE_MULTI} , pOutBuf = {@link NET_OUT_POS_REMOVE_MULTI}
  	 * \else
  	 * 批量删除Pos设备, pInBuf = {@link NET_IN_POS_REMOVE_MULTI} , pOutBuf = {@link NET_OUT_POS_REMOVE_MULTI}
  	 * \endif
  	 */
    public static final int     SDK_CTRL_POS_REMOVE_MULTI = 0x10009; 
    
    
    /**
  	 * \if ENGLISH_LANG
	 * Modify a POS device, pInBuf = {@link NET_IN_POS_ADD} , pOutBuf = {@link NET_OUT_POS_ADD}
	 * \else
  	 * 修改一个Pos设备, pInBuf = {@link NET_IN_POS_ADD} , pOutBuf = {@link NET_OUT_POS_ADD}
  	 * \endif
  	 */
    public static final int     SDK_CTRL_POS_MODIFY = 0x1000A;     
    
    
    /**
  	 * \if ENGLISH_LANG
  	 * Trigger alarm with sound, pInBuf = {@link NET_IN_SOUND_ALARM} , pOutBuf = {@link NET_OUT_SOUND_ALARM}
  	 * \else
  	 * 触发有声报警, pInBuf = {@link NET_IN_SOUND_ALARM} , pOutBuf = {@link NET_OUT_SOUND_ALARM}
  	 * \endif
  	 */ 
    public static final int     SDK_CTRL_SET_SOUND_ALARM = 0x1000B;       
    
    
    /**
  	 * \if ENGLISH_LANG
  	 * audiomatrix silence,pInBuf = {@link NET_IN_AUDIO_MATRIX_SILENCE}, pOutBuf = {@link NET_OUT_AUDIO_MATRIX_SILENCE}
  	 * \else
  	 * 音频矩阵一键静音控制, 对应pInBuf = {@link NET_IN_AUDIO_MATRIX_SILENCE}, pOutBuf = {@link NET_OUT_AUDIO_MATRIX_SILENCE}
  	 * \endif
  	 */ 
    public static final int 	SDK_CTRL_AUDIO_MATRIX_SILENCE = 0x1000C;	
    
    
    /**
  	 * \if ENGLISH_LANG
  	 * Add wireless device info, pInBuf = {@link NET_CTRL_LOWRATEWPAN_ADD} , pOutBUf = NULL
  	 * \else
  	 * 增加无线设备信息, 对应  pInBuf = {@link NET_CTRL_LOWRATEWPAN_ADD}, pOutBUf = NULL
  	 * \endif
  	 */
    public static final int     SDK_CTRL_LOWRATEWPAN_ADD = 0x10011;		
    
    
    /**
  	 * \if ENGLISH_LANG
  	 * remove all the wireless device info, pInBuf = {@link NET_CTRL_LOWRATEWPAN_REMOVEALL} , pOutBUf = NULL
  	 * \else
  	 * 删除所有的无线设备信息, 对应 pInBuf = {@link NET_CTRL_LOWRATEWPAN_REMOVEALL} , pOutBUf = NULL
  	 * \endif
  	 */
    public static final int 	SDK_CTRL_LOWRATEWPAN_REMOVEALL = 0x10012;		
    
    
    /**
  	 * \if ENGLISH_LANG
  	 * Test Mail, pInBuf = {@link NET_IN_TEST_MAIL} , pOutBUf = {@link NET_OUT_TEST_MAIL}
  	 * \else
  	 * 测试邮件, 对应 pInBuf = {@link NET_IN_TEST_MAIL}, pOutBuf = {@link NET_OUT_TEST_MAIL}
  	 * \endif
  	 */
    public static final int     SDK_CTRL_TEST_MAIL = 0x10014;       
    
    
    /**
  	 * \if ENGLISH_LANG
  	 * Control smart switch, pInBuf = {@link NET_IN_CONTROL_SMART_SWITCH} , pOutBUf = {@link NET_OUT_CONTROL_SMART_SWITCH}
  	 * \else
  	 * 控制智能开关,  pInBuf = {@link NET_IN_CONTROL_SMART_SWITCH} , pOutBUf = {@link NET_OUT_CONTROL_SMART_SWITCH}
  	 * \endif
  	 */
    public static final int 	SDK_CTRL_CONTROL_SMART_SWITCH = 0x10015;   
    
    /**
  	 * \if ENGLISH_LANG
  	 * Set the detector work mode, pInBuf = {@link NET_IN_CTRL_LOWRATEWPAN_SETWORKMODE} , pOutBUf = NULL
  	 * \else
  	 * 设置探测器的工作模式  pInBuf = {@link NET_IN_CTRL_LOWRATEWPAN_SETWORKMODE} ，pOutBuf = NULL
  	 * \endif
  	 */
    public static final int     SDK_CTRL_LOWRATEWPAN_SETWORKMODE = 0x10016;

	/**
	 * \if ENGLISH_LANG
	 * send coaxial IO control command, pInBuf = {@link NET_IN_CONTROL_COAXIAL_CONTROL_IO} , pOutBUf = {@link NET_OUT_CONTROL_COAXIAL_CONTROL_IO})
	 * \else
	 * 发送同轴IO控制命令(对应结构体pInBuf = {@link NET_IN_CONTROL_COAXIAL_CONTROL_IO}, pOutBUf = {@link NET_OUT_CONTROL_COAXIAL_CONTROL_IO})
	 * \endif
	 */
	public static final int     SDK_CTRL_COAXIAL_CONTROL_IO    = 0x10017;

	/**
	 * \if ENGLISH_LANG
	 * start wireless alarmbell, pInBuf = {@link NET_IN_START_REMOTELOWRATEWPAN_ALARMBELL} , pOutBUf = {@link NET_OUT_START_REMOTELOWRATEWPAN_ALARMBELL})
	 * \else
	 * 开启无线警号(对应结构体 pInBuf = {@link NET_IN_START_REMOTELOWRATEWPAN_ALARMBELL}, pOutBUf = {@link NET_OUT_START_REMOTELOWRATEWPAN_ALARMBELL})
	 * \endif
	 */
	public static final int     SDK_CTRL_START_REMOTELOWRATEWPAN_ALARMBELL = 0x10018;

	/**
	 * \if ENGLISH_LANG
	 * stop wireless alarmbell, pInBuf = {@link NET_IN_STOP_REMOTELOWRATEWPAN_ALARMBELL} , pOutBUf = {@link NET_OUT_STOP_REMOTELOWRATEWPAN_ALARMBELL})
	 * \else
	 * 关闭无线警号(对应结构体 pInBuf = {@link NET_IN_STOP_REMOTELOWRATEWPAN_ALARMBELL}, pOutBUf = {@link NET_OUT_STOP_REMOTELOWRATEWPAN_ALARMBELL})
	 * \endif
	 */
	public static final int     SDK_CTRL_STOP_REMOTELOWRATEWPAN_ALARMBELL = 0x10019;

	/**
	 * \if ENGLISH_LANG
	 *  Thermo FFC calibration, pInBuf = {@link NET_IN_THERMO_DO_FFC} , pOutBUf = {@link NET_OUT_THERMO_DO_FFC})
	 * \else
	 * 热成像FFC校准(对应结构体 pInBuf = {@link NET_IN_THERMO_DO_FFC}, pOutBUf = {@link NET_OUT_THERMO_DO_FFC})
	 * \endif
	 */
	public static final int     SDK_CTRL_THERMO_DO_FFC = 0x1001A;

	/**
	 * \if ENGLISH_LANG
	 * Set Park control info, pInBuf = {@link NET_IN_SET_PARK_CONTROL_INFO} , pOutBUf = {@link NET_OUT_SET_PARK_CONTROL_INFO})
	 * \else
	 * 设置停车控制信息(对应结构体 pInBuf = {@link NET_IN_SET_PARK_CONTROL_INFO}, pOutBUf = {@link NET_OUT_SET_PARK_CONTROL_INFO})
	 * \endif
	 */
	public static final int     SDK_CTRL_SET_PARK_CONTROL_INFO = 0x10020;

	/**********LowRateWPAN控制(0x10100-0x10150)***********************/
	/**
	 * \if ENGLISH_LANG
	 *  get Wireless Device Signal, pInBuf = {@link NET_IN_CTRL_LOWRATEWPAN_GETWIRELESSDEVSIGNAL},pOutBuf = {@link NET_OUT_CTRL_LOWRATEWPAN_GETWIRELESSDEVSIGNAL})
	 * \else
	 * 获取无线设备信号强度(对应结构体 pInBuf = {@link NET_IN_CTRL_LOWRATEWPAN_GETWIRELESSDEVSIGNAL},pOutBuf = {@link NET_OUT_CTRL_LOWRATEWPAN_GETWIRELESSDEVSIGNAL})
	 * \endif
	 */
	public static final int     SDK_CTRL_LOWRATEWPAN_GETWIRELESSDEVSIGNAL = 0x10100;
}

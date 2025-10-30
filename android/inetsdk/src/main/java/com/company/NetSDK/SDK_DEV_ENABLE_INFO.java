package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Supported Function List
 * \else
 * 设备支持功能列表
 * \endif
 */
public class SDK_DEV_ENABLE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Capability set, subscript: Enumeration values, Bit: Subfunction.
	 * <pre>
	 * Enumeration		values											Enumeration Definition Significance 
	 * 0				EN_FTP 											FTP,1:Transmit Records 2:Transmit Snapshot 
	 * 1 				EN_SMTP 										SMTP,1:Transmit Alarm Text Email 2:Transmit Alarm Image 3: Support Health mail 
	 * 2 				EN_NTP 											NTP:1:Adjust system time 
	 * 3 				EN_AUTO_MAINTAIN 								Automatic Maintenance :1:Reboot 2:Shutdown 3:Delete Files 
	 * 4	 			EN_VIDEO_COVER 									Cover-area :1:Multi area 
	 * 5 				EN_AUTO_REGISTER 								Auto Register :1:SDK auto login after registration 
	 * 6 				EN_DHCP 										DHCP :1:DHCP 
	 * 7 				EN_UPNP 										UPNP:1:UPNP 
	 * 8 				EN_COMM_SNIFFER 								COMM Sniffer :1: CommATM 
	 * 9 				EN_NET_SNIFFER 									Net Sniffer: 1: NetSniffer 
	 * 10 				EN_BURN 										Burn:1: Inquire burning status 
	 * 11 				EN_VIDEO_MATRIX 								Video Matrix:1: Support or not 2: Support SPOT Video Matrix or not 
	 * 12 				EN_AUDIO_DETECT 								Audio Detect:1: Support or not 
	 * 13 				EN_STORAGE_STATION 								Storage Station:1: Ftp Server(Ips) 2: SMB 3: NFS 4: ISCSI 16: DISK 17: U disk 
	 * 14 				EN_IPSSEARCH 									IPS storage search 按位:1: IPS storage search 
	 * 15 				EN_SNAP 										Snapshot:1: Resolution2: FPS3: Snap type 4: Format5: Quality 
	 * 16 				EN_DEFAULTNIC	 								Default NIC inquires: 1: Support 
	 * 17 				EN_SHOWQUALITY 									Show Quality Under CBR Mode: 1: Support 
	 * 18 				EN_CONFIG_IMEXPORT 								Config import and export: 1: Support 
	 * 19 				EN_LOG 											Log Query: 1: Support. 
	 * 20 				EN_SCHEDULE 									Record Settings: 1: Redundancy 2: Pre-record 3: Record Period. 
	 * 21 				EN_NETWORK_TYPE 								Network type: 1: Ethernet 2: Wlan3: CDMA/GPRS 4: CDMA/GPRS Multi NIC. 
	 * 22 				EN_MARK_IMPORTANTRECORD 						Mark Important Record: 1: Set Important Record Mark. 
	 * 23 				EN_ACFCONTROL 									ACF Control:1: Support ACF Control, 2: Support timing alarm ACF control(Does not support Motion Detect). 
	 * 24 				EN_MULTIASSIOPTION 								Multi Extra streams :1: Support three extra streams. 
	 * 25 				EN_DAVINCIMODULE 								Davinci Modle:1: Schedule handled separately 2: Standard I frame interval setting. 
	 * 26 				EN_GPS 											GPS:1: Gps. 
	 * 27 				EN_MULTIETHERNET 								Multi NIC Query:1: Support. 
	 * 28 				EN_LOGIN_ATTRIBUTE 								Login attribute: 1: Support Login attribute query. 
	 * 29 				EN_RECORD_GENERAL 								Record general:1: Normal Record；2: Alarm Record；3: Motion Detect Record；4: Local Storage；5: Remote Storage；6: Redundancy Storage；7: Local Emergency Storage. 
	 * 30 				EN_JSON_CONFIG 									Json Format Config:1: Support Json Format. 
	 * 31 				EN_HIDE_FUNCTION	 							Hide Function:1: Hide PTZ Function. 
	 * 32 				EN_DISK_DAMAGE 									Disk Damage Information:1: Query Disk Damage Information. 
	 * 33 				EN_PLAYBACK_SPEED_CTRL 							Playback Speed Control 1: Support fast playback. 
	 * 34 				EN_HOLIDAYSCHEDULE 								Holiday Schedule: 1,Support Holiday Schedule. 
	 * 35 				EN_FETCH_MONEY_TIMEOUT 							ATM Timeout. 
	 * 36 				EN_BACKUP_VIDEO_FORMAT 							Backup Format1:DAV, 2:ASF. 
	 * 37 				EN_QUERY_DISK_TYPE 								Query Disk Type. 
	 * 38 				EN_CONFIG_DISPLAY_OUTPUT 						Config disply output: 1:Image Split and Tour settings. 
	 * 39 				EN_SUBBITRATE_RECORD_CTRL 						Subbitrate Record Control1-Extra stream Recoding control. 
	 * 40 				EN_IPV6 										IPV6 Settings:1-IPV6 Settings. 
	 * 41 				EN_SNMP 										SNMP. 
	 * 42 				EN_QUERY_URL 									Query URL: 1-Query URL. 
	 * 43 				EN_ISCSI 										ISCSI. 
	 * 44 				EN_RAID 										Support Raid. 
	 * 45 				EN_HARDDISK_INFO 								Hard disk information F5 inquiry. 
	 * 46 				EN_PICINPIC 									Pic in Pic :1,Settings; 2,Preview, Record, Query, Download. 
	 * 47 				EN_PLAYBACK_SPEED_CTRL_SUPPORT 					EN_PLAYBACK_SPEED_CTRL . 
	 * 48 				EN_LF_XDEV 										Support 24, 32, 64 way LF-X serial 
	 * </pre>
	 * \else
	 * 功能列表能力集,下标对应上述的枚举值,按位表示子功能
	 * <pre>
	 * 枚举值 		枚举定义							代表意义 
	 * 0 		EN_FTP FTP						按位,1:传送录像文件 2:传送抓图文件 
	 * 1 		EN_SMTP SMTP					按位,1:报警传送文本邮件 2:报警传送图片 3:支持健康邮件功能 
	 * 2 		EN_NTP NTP						按位:1:调整系统时间 
	 * 3 		EN_AUTO_MAINTAIN				自动维护 按位:1:重启 2:关闭 3:删除文件 
	 * 4 		EN_VIDEO_COVER					区域遮挡 按位:1:多区域遮挡 
	 * 5 		EN_AUTO_REGISTER				主动注册 按位:1:注册后sdk主动登陆 
	 * 6 		EN_DHCP DHCP					按位:1:DHCP 
	 * 7 		EN_UPNP UPNP					按位:1:UPNP 
	 * 8 		EN_COMM_SNIFFER					串口抓包 按位:1: CommATM 
	 * 9 		EN_NET_SNIFFER					网络抓包 按位: 1: NetSniffer 
	 * 10 		EN_BURN							刻录功能 按位:1: 查询刻录状态 
	 * 11 		EN_VIDEO_MATRIX					视频矩阵 按位:1: 是否支持视频矩阵 2: 是否支持SPOT视频矩阵 
	 * 12 		EN_AUDIO_DETECT					音频检测 按位:1: 是否支持音频检测 
	 * 13 		EN_STORAGE_STATION				存储位置 按位:1: Ftp服务器(Ips) 2: SMB 3: NFS 4: ISCSI 16: DISK 17: U盘 
	 * 14 		EN_IPSSEARCH					IPS存储查询 按位:1: IPS存储查询 
	 * 15 		EN_SNAP							抓图 按位:1: 分辨率2: 帧率3: 抓图方式4: 抓图文件格式5: 图画质量 
	 * 16 		EN_DEFAULTNIC					支持默认网卡查询 按位: 1: 支持 
	 * 17 		EN_SHOWQUALITY					CBR模式下显示画质配置项 按位: 1: 支持 
	 * 18 		EN_CONFIG_IMEXPORT				配置导入导出功能能力 按位: 1: 支持. 
	 * 19 		EN_LOG							是否支持分页方式的日志查询 按位: 1: 支持. 
	 * 20 		EN_SCHEDULE						录像设置的一些能力 按位: 1: 冗余 2: 预录 3: 录像时间段. 
	 * 21 		EN_NETWORK_TYPE					网络类型 按位: 1: 以态网 2: 无线局域 3: CDMA/GPRS 4: CDMA/GPRS多网卡配置. 
	 * 22 		EN_MARK_IMPORTANTRECORD			标识重要录像 按位: 1: 设置重要录像标识. 
	 * 23 		EN_ACFCONTROL					活动帧率控制 按位:1: 支持活动帧率控制, 2: 支持定时报警类型活动帧率控制(不支持动检),该能力与ACF能力互斥. 
	 * 24 		EN_MULTIASSIOPTION				多路辅码流 按位:1: 支持三路辅码流. 
	 * 25 		EN_DAVINCIMODULE				组件化模块 按位:1: 时间表分开处理 2: 标准I帧间隔设置. 
	 * 26 		EN_GPS							GPS功能 按位:1: Gps定位功能. 
	 * 27 		EN_MULTIETHERNET				支持多网卡查询 按位:1: 支持. 
	 * 28 		EN_LOGIN_ATTRIBUTE				Login属性 按位:1: 支持Login属性查询. 
	 * 29 		EN_RECORD_GENERAL				录像相关 按位:1: 普通录像；2: 报警录像；3: 动态检测录像；4: 本地存储；5: 远程存储；6: 冗余存储；7: 本地紧急存储. 
	 * 30 		EN_JSON_CONFIG					Json格式配置 按位:1: 支持Json格式. 
	 * 31 		EN_HIDE_FUNCTION				屏蔽功能 按位:1: 屏蔽PTZ云台功能. 
	 * 32 		EN_DISK_DAMAGE					硬盘坏道信息支持能力 按位:1: 硬盘坏道信息查询支持能力. 
	 * 33 		EN_PLAYBACK_SPEED_CTRL			支持回放网传速度控制 按位:1: 支持回放加速. 
	 * 34 		EN_HOLIDAYSCHEDULE				支持假期时间段配置:按位:1,支持假期时间段配置. 
	 * 35 		EN_FETCH_MONEY_TIMEOUT			ATM取钱超时. 
	 * 36 		EN_BACKUP_VIDEO_FORMAT			备份支持的格式 按位:1:DAV, 2:ASF. 
	 * 37 		EN_QUERY_DISK_TYPE 				支持硬盘类型查询. 
	 * 38 		EN_CONFIG_DISPLAY_OUTPUT		支持设备显示输出(VGA等)配置 按位: 1:画面分割轮巡配置. 
	 * 39 		EN_SUBBITRATE_RECORD_CTRL		支持扩展码流录像控制设置 按位:1-辅码流录像控制设置. 
	 * 40 		EN_IPV6 						支持IPV6设置, 按位:1-IPV6配置. 
	 * 41 		EN_SNMP							SNMP(简单网络管理协议). 
	 * 42 		EN_QUERY_URL					支持获取设备URL地址, 按位: 1-查询配置URL地址. 
	 * 43 		EN_ISCSI						ISCSI(Internet小型计算机系统接口配置). 
	 * 44 		EN_RAID							支持Raid功能. 
	 * 45 		EN_HARDDISK_INFO				支持磁盘信息F5查询能. 
	 * 46 		EN_PICINPIC						支持画中画功能 按位:1,画中画设置; 2,画中画预览、录像存储、查询、下载. 
	 * 47 		EN_PLAYBACK_SPEED_CTRL_SUPPORT	同 EN_PLAYBACK_SPEED_CTRL,只为了兼容协议. 
	 * 48 		EN_LF_XDEV						支持24、32、64路LF-X系列,标注这类设备特殊的编码能力计算方式. 
	 * </pre>
	 * \endif
	 */
	public int IsFucEnable[] = new int[512];				
}

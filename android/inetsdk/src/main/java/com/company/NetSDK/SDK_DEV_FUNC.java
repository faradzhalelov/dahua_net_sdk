package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device support function list 
 * \else
 * 设备支持功能列表
 * \endif
 */
public class SDK_DEV_FUNC implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * FTP ，1：send record file 2：send snapshot file
	 * \else
	 * FTP 按位，1：传送录像文件 2：传送抓图文件
	 * \endif
	 */
	public static int EN_FTP = 0;							

	/**
	 * \if ENGLISH_LANG
	 * SMTP ，1：alarm send text mail 2：alarm send picture 3: support health mail
	 * \else
	 * SMTP 按位，1：报警传送文本邮件 2：报警传送图片 3:支持健康邮件功能
	 * \endif
	 */
	public static int EN_SMTP = 1;					

	/**
	 * \if ENGLISH_LANG
	 * NTP ：1：adjust system time
	 * \else
	 * NTP	按位：1：调整系统时间
	 * \endif
	 */
	public static int EN_NTP = 2;						

	/**
	 * \if ENGLISH_LANG
	 * Auto maintenance ：1：reboot 2：off 3:delete file
	 * \else
	 * 自动维护 按位：1：重启 2：关闭 3:删除文件
	 * \endif
	 */
	public static int EN_AUTO_MAINTAIN = 3;			

	/**
	 * \if ENGLISH_LANG
	 * Mask ：1：multi-area mask
	 * \else
	 * 区域遮挡 按位：1：多区域遮挡
	 * \endif
	 */
	public static int EN_VIDEO_COVER = 4;				

	/**
	 * \if ENGLISH_LANG
	 * Auto registration：1：after registration sdk auto register
	 * \else
	 * 主动注册	按位：1：注册后sdk主动登陆
	 * \endif
	 */
	public static int EN_AUTO_REGISTER = 5;			

	/**
	 * \if ENGLISH_LANG
	 * DHCP：1：DHCP
	 * \else
	 * DHCP	按位：1：DHCP
	 * \endif
	 */
	public static int EN_DHCP = 6;					

	/**
	 * \if ENGLISH_LANG
	 * UPNP：1：UPNP
	 * \else
	 * UPNP	按位：1：UPNP
	 * \endif
	 */
	public static int EN_UPNP = 7;					

	/**
	 * \if ENGLISH_LANG
	 * Serial snap：1:CommATM
	 * \else
	 * 串口抓包 按位：1:CommATM
	 * \endif
	 */
	public static int EN_COMM_SNIFFER = 8;			

	/**
	 * \if ENGLISH_LANG
	 * Net snap ： 1：NetSniffer
	 * \else
	 * 网络抓包 按位： 1：NetSniffer
	 * \endif
	 */
	public static int EN_NET_SNIFFER = 9;				

	/**
	 * \if ENGLISH_LANG
	 * Writing function：1：Search writing status
	 * \else
	 * 刻录功能 按位：1：查询刻录状态
	 * \endif
	 */
	public static int EN_BURN = 10;					

	/**
	 * \if ENGLISH_LANG
	 * Video matrix ：1：support video matrix 2: support SPOT video matrix 3: support HDMI video matrix
	 * \else
	 * 视频矩阵 按位：1：是否支持视频矩阵 2:是否支持SPOT视频矩阵 3:是否支持HDMI视频矩阵
	 * \endif
	 */
	public static int EN_VIDEO_MATRIX = 11;			

	/**
	 * \if ENGLISH_LANG
	 * Audio detect：1：support audio detect
	 * \else
	 * 音频检测 按位：1：是否支持音频检测
	 * \endif
	 */
	public static int EN_AUDIO_DETECT = 12;			

	/**
	 * \if ENGLISH_LANG
	 * Storage position：1：Ftp server(Ips) 2：SMB 3：NFS 4：ISCSI 16：DISK 17：USB
	 * \else
	 * 存储位置 按位：1：Ftp服务器(Ips) 2：SMB 3：NFS 4：ISCSI 16：DISK 17：U盘
	 * \endif
	 */
	public static int EN_STORAGE_STATION = 13;			

	/**
	 * \if ENGLISH_LANG
	 * IPS storage search：1：IPS storage search 
	 * \else
	 * IPS存储查询 按位：1：IPS存储查询	
	 * \endif
	 */
	public static int EN_IPSSEARCH = 14;				

	/**
	 * \if ENGLISH_LANG
	 * Snap  ：1：resolution2：frame rate3：snapshot4：snap file format5：quanlity
	 * \else
	 * 抓图  按位：1：分辨率2：帧率3：抓图方式4：抓图文件格式5：图画质量
	 * \endif
	 */
	public static int EN_SNAP = 15;					

	/**
	 * \if ENGLISH_LANG
	 * Support default net card search 1：support
	 * \else
	 * 支持默认网卡查询 按位 1：支持
	 * \endif
	 */
	public static int EN_DEFAULTNIC = 16;				

	/**
	 * \if ENGLISH_LANG
	 * CBR mode display quality config item 1: support
	 * \else
	 * CBR模式下显示画质配置项 按位 1:支持
	 * \endif
	 */
	public static int EN_SHOWQUALITY = 17;				

	/**
	 * \if ENGLISH_LANG
	 * Config import/export function 1: support
	 * \else
	 * 配置导入导出功能能力 按位 1:支持
	 * \endif
	 */
	public static int EN_CONFIG_IMEXPORT = 18;			

	/**
	 * \if ENGLISH_LANG
	 * Support page mode log search 1：support
	 * \else
	 * 是否支持分页方式的日志查询 按位 1：支持
	 * \endif
	 */
	public static int EN_LOG = 19;						

	/**
	 * \if ENGLISH_LANG
	 * Record setup some capacities 1:redundant 2:prerecord 3:record period
	 * \else
	 * 录像设置的一些能力 按位 1:冗余 2:预录 3:录像时间段
	 * \endif
	 */
	public static int EN_SCHEDULE = 20;				

	/**
	 * \if ENGLISH_LANG
	 * Net type 1: Ethernet 2: Wireless 3:CDMA/GPRS 4:CDMA/GPRS multi net card config
	 * \else
	 * 网络类型按位表示 1:以态网 2:无线局域 3:CDMA/GPRS 4:CDMA/GPRS多网卡配置
	 * \endif
	 */
	public static int EN_NETWORK_TYPE = 21;			

	/**
	 * \if ENGLISH_LANG
	 * Mark important record:1： set important record mark
	 * \else
	 * 标识重要录像 按位:1：设置重要录像标识
	 * \endif
	 */
	public static int EN_MARK_IMPORTANTRECORD = 22;	

	/**
	 * \if ENGLISH_LANG
	 * Active frame control：1：support active frame control, 2: support schedule alarm type frame control(not support motion detect), this capability and ACF are mutually exclusive
	 * \else
	 * 活动帧率控制 按位：1：支持活动帧率控制, 2:支持定时报警类型活动帧率控制(不支持动检),该能力与ACF能力互斥
	 * \endif
	 */
	public static int EN_ACFCONTROL = 23;				

	/**
	 * \if ENGLISH_LANG
	 * Multi-channel sub stream：1：support 3 channel sub stream, 2:support sub stream encode compression standalone setup
	 * \else
	 * 多路辅码流 按位：1：支持三路辅码流, 2:支持辅码流编码压缩格式独立设置
	 * \endif
	 */
	public static int EN_MULTIASSIOPTION = 24;			

	/**
	 * \if ENGLISH_LANG
	 * Component module：1，time schedule separate  2: standard I frame interval setup
	 * \else
	 * 组件化模块 按位：1，时间表分开处理 2:标准I帧间隔设置
	 * \endif
	 */
	public static int EN_DAVINCIMODULE = 25;			

	/**
	 * \if ENGLISH_LANG
	 * GPS：1：Gps
	 * \else
	 * GPS功能 按位：1：Gps定位功能
	 * \endif
	 */
	public static int EN_GPS = 26;                           

	/**
	 * \if ENGLISH_LANG
	 * Support multi-net card search 1：support
	 * \else
	 * 支持多网卡查询 按位 1：支持
	 * \endif
	 */
	public static int EN_MULTIETHERNET = 27;			

	/**
	 * \if ENGLISH_LANG
	 * Login property ：1：support Login property search
	 * \else
	 * Login属性 按位：1：支持Login属性查询
	 * \endif
	 */
	public static int EN_LOGIN_ATTRIBUTE = 28;               

	/**
	 * \if ENGLISH_LANG
	 * Record related：1，general；2：alarm；3：motion detect record；4：local storage；5：remote storage；6：redundant storage；7：local emergency storage；8：support main/sub stream remote storage
	 * \else
	 * 录像相关 按位：1，普通录像；2：报警录像；3：动态检测录像；4：本地存储；5：远程存储；6：冗余存储；7：本地紧急存储；8：支持区分主辅码流的远程存储
	 * \endif
	 */
	public static int EN_RECORD_GENERAL = 29;			

	/**
	 * \if ENGLISH_LANG
	 * Json format config:1 support Json format, 2: use F6 NAS config, 3: use F6 Raid config, 4：use F6 MotionDetect config, 5：completely support 3 generations config(V3)，via F6 command access
	 * \else
	 * Json格式配置:按位：1支持Json格式, 2: 使用F6的NAS配置, 3: 使用F6的Raid配置, 4：使用F6的MotionDetect配置, 5：完整支持三代配置(V3)，通过F6命令访问
	 * \endif
	 */
	public static int EN_JSON_CONFIG = 30;				

	/**
	 * \if ENGLISH_LANG
	 * shield function：1，shield PTZ , 2: shield 3G alive period
	 * \else
	 * 屏蔽功能：按位：1，屏蔽PTZ云台功能, 2: 屏蔽3G的保活时段功能
	 * \endif
	 */
	public static int EN_HIDE_FUNCTION = 31;			

	/**
	 * \if ENGLISH_LANG
	 * harddisk bad channel info support capacity:1，hard disk bad channel info search support capacity
	 * \else
	 * 硬盘坏道信息支持能力: 按位：1，硬盘坏道信息查询支持能力
	 * \endif
	 */
	public static int EN_DISK_DAMAGE = 32;                   

	/**
	 * \if ENGLISH_LANG
	 * Support playback net sending speed control:1，support playback speed up
	 * \else
	 * 支持回放网传速度控制:按位:1，支持回放加速
	 * \endif
	 */
	public static int EN_PLAYBACK_SPEED_CTRL = 33;		

	/**
	 * \if ENGLISH_LANG
	 * Support holiday period config:1，support holiday time period config
	 * \else
	 * 支持假期时间段配置:按位:1，支持假期时间段配置
	 * \endif
	 */
	public static int EN_HOLIDAYSCHEDULE = 34;			

	/**
	 * \if ENGLISH_LANG
	 * ATM takeout time out
	 * \else
	 * ATM取钱超时
	 * \endif
	 */
	public static int EN_FETCH_MONEY_TIMEOUT = 35;		

	/**
	 * \if ENGLISH_LANG
	 * Backup supported format，1:DAV, 2:ASF
	 * \else
	 * 备份支持的格式，按位：1:DAV, 2:ASF
	 * \endif
	 */
	public static int EN_BACKUP_VIDEO_FORMAT = 36;		

	/**
	 * \if ENGLISH_LANG
	 * Support hard disk type search
	 * \else
	 * 支持硬盘类型查询
	 * \endif
	 */
	public static int EN_QUERY_DISK_TYPE = 37;               

	/**
	 * \if ENGLISH_LANG
	 * Support device display output (VGA and etc.) config, 1:split tour config
	 * \else
	 * 支持设备显示输出（VGA等）配置,按位: 1:画面分割轮巡配置
	 * \endif
	 */
	public static int EN_CONFIG_DISPLAY_OUTPUT = 38;         

	/**
	 * \if ENGLISH_LANG
	 * Support extension stream record control setup,1-sub stream control setup
	 * \else
	 * 支持扩展码流录像控制设置, 按位：1-辅码流录像控制设置
	 * \endif
	 */
	public static int EN_SUBBITRATE_RECORD_CTRL = 39;        

	/**
	 * \if ENGLISH_LANG
	 * Support IPV6 setup,1-IPV6 config
	 * \else
	 * 支持IPV6设置, 按位：1-IPV6配置
	 * \endif
	 */
	public static int EN_IPV6 = 40;                          

	/**
	 * \if ENGLISH_LANG
	 * SNMP
	 * \else
	 * SNMP（简单网络管理协议）
	 * \endif
	 */
	public static int EN_SNMP = 41;                          

	/**
	 * \if ENGLISH_LANG
	 * Support to get device URL address, : 1-search config URL address
	 * \else
	 * 支持获取设备URL地址, 按位: 1-查询配置URL地址
	 * \endif
	 */
	public static int EN_QUERY_URL = 42;                     

	/**
	 * \if ENGLISH_LANG
	 * ISCSI
	 * \else
	 * ISCSI（Internet小型计算机系统接口配置）
	 * \endif
	 */
	public static int EN_ISCSI = 43;					

	/**
	 * \if ENGLISH_LANG
	 * Support Raid
	 * \else
	 * 支持Raid功能
	 * \endif
	 */
	public static int EN_RAID = 44;					

	/**
	 * \if ENGLISH_LANG
	 * Support disk infoF5 search
	 * \else
	 * 支持磁盘信息F5查询
	 * \endif
	 */
	public static int EN_HARDDISK_INFO = 45;			

	/**
	 * \if ENGLISH_LANG
	 * Support PIP function :1,PIP setup; 2,PIP preview, record storage, search, download;3, support PIP encode config and channel search
	 * \else
	 * 支持画中画功能 按位:1,画中画设置; 2,画中画预览、录像存储、查询、下载;3,支持画中画编码配置，同时支持画中画通道查询
	 * \endif
	 */
	public static int EN_PICINPIC = 46;                      

	/**
	 * \if ENGLISH_LANG
	 * EN_PLAYBACK_SPEED_CTRL ，for compatible protocol
	 * \else
	 * 同 EN_PLAYBACK_SPEED_CTRL ，只为了兼容协议
	 * \endif
	 */
	public static int EN_PLAYBACK_SPEED_CTRL_SUPPORT = 47;   

	/**
	 * \if ENGLISH_LANG
	 * Support 24, 32, 64-ch LF-X series，mark this type of device special encode capacity
	 * \else
	 * 支持24、32、64路LF-X系列，标注这类设备特殊的编码能力计算方式
	 * \endif
	 */
	public static int EN_LF_XDEV = 48;					

	/**
	 * \if ENGLISH_LANG
	 * F5 DSP encode capacity search
	 * \else
	 * F5 DSP编码能力查询
	 * \endif
	 */
	public static int EN_DSP_ENCODE_CAP = 49;			

	/**
	 * \if ENGLISH_LANG
	 * Multicast capacity search
	 * \else
	 * 组播能力查询
	 * \endif
	 */
	public static int EN_MULTICAST = 50;                     

	/**
	 * \if ENGLISH_LANG
	 * Net limit capacity search，1-net send stream size limit
	 * \else
	 * 网络限制能力查询，按位，1-网络发送码流大小限          
	 * \endif
	 */
	public static int EM_NET_LIMIT = 51;                                     

	/**
	 * \if ENGLISH_LANG
	 * Serial 422
	 * \else
	 * 串口422
	 * \endif
	 */
	public static int EM_COM422 = 52;                        

	/**
	 * \if ENGLISH_LANG
	 * Support three generations protocol frame（needlistMethod(),listService()），via F6 command access
	 * \else
	 * 是否支持三代协议框架（需要实现listMethod(),listService()），通过F6命令访问
	 * \endif
	 */
	public static int EM_PROTOCAL_FRAMEWORK = 53;		

	/**
	 * \if ENGLISH_LANG
	 * Write OSD overlay,  1- write OSD overlay config
	 * \else
	 * 刻录OSD叠加, 按位, 1-刻录OSD叠加配置
	 * \endif
	 */
	public static int EM_WRITE_DISK_OSD = 54;			

	/**
	 * \if ENGLISH_LANG
	 * Dynamic multi link, 1-request video data response
	 * \else
	 * 动态多连接, 按位, 1-请求视频数据应答
	 * \endif
	 */
	public static int EM_DYNAMIC_MULTI_CONNECT = 55;	

	/**
	 * \if ENGLISH_LANG
	 * Cloud service,1-support private cloud service
	 * \else
	 * 云服务,按位，1-支持私有云服务
	 * \endif
	 */
	public static int EM_CLOUDSERVICE = 56;                  

	/**
	 * \if ENGLISH_LANG
	 * Record info report, 1-record info auto report, 2-support record frame search
	 * \else
	 * 录像信息上报, 按位, 1-录像信息主动上报, 2-支持录像帧数查询
	 * \endif
	 */
	public static int EM_RECORD_INFO = 57;				

	/**
	 * \if ENGLISH_LANG
	 * Auto registration capacity，1-support dynamic auto registration
	 * \else
	 * 主动注册能力，按位，1-支持动态主动注册
	 * \endif
	 */
	public static int EN_DYNAMIC_REG = 58;
	
	/**
	 * \if ENGLISH_LANG
	 * Multi-channel preview playback，1-support multi-channel preview playback
	 * \else
	 * 多通道预览回放，按为,1-支持多通道预览回放
	 * \endif
	 */
	public static int EM_MULTI_PLAYBACK = 59;
	
	/**
	 * \if ENGLISH_LANG
	 * Encode channel, 1-support audio only channel
	 * \else
	 * 编码通道, 按位, 1-支持纯音频通道
	 * \endif
	 */
	public static int EN_ENCODE_CHN = 60;
}


package com.company.NetSDK;

import java.io.Serializable;

public class FinalVar implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;/**/

	/**
	 * \if ENGLISH_LANG
	 * max length of company name
	 * \else
	 * 单位名称最大长度
	 * \endif
	 */
	public static final int MAX_COMPANY_NAME_LEN = 200;

	/**
	 * \if ENGLISH_LANG
	 * Onvif user upper limit number
	 * \else
	 * Onvif用户上限个数
	 * \endif
	 */
	public static final int MAX_ONVIF_USER_NUM = 20;
	/**
	 * \if ENGLISH_LANG
	 * MAX length of path
	 * \else
	 * 通用字符串长度
	 * \endif
	 */
	public static final int MAX_PATH = 260;

	/**
	 * \if ENGLISH_LANG
	 * The maximum number of riders
	 * \else
	 * 骑车人数组上限
	 * \endif
	 */
	public static final int MAX_RIDER_NUM = 16;



	/**
	 * \if ENGLISH_LANG
	 * Device SN string length
	 * \else
	 * 设备序列号字符长度
	 * \endif
	 */
	public static final int SDK_SERIALNO_LEN = 48;

	/**
	 * \if ENGLISH_LANG
	 * Max HDD number
	 * \else
	 * 最大硬盘个数
	 * \endif
	 */
	public static final int SDK_MAX_DISKNUM = 256;

	/**
	 * \if ENGLISH_LANG
	 * Max SD card number
	 * \else
	 * 最大SD卡个数
	 * \endif
	 */
	public static final int SDK_MAX_SDCARDNUM = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max buner amount
	 * \else
	 * 最大刻录设备个数
	 * \endif
	 */
	public static final int SDK_MAX_BURNING_DEV_NUM = 32;

	/**
	 * \if ENGLISH_LANG
	 * Burner name max length
	 * \else
	 * 刻录设备名字最大长度
	 * \endif
	 */
	public static final int SDK_BURNING_DEV_NAMELEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * The max connnect count of SDK
	 * \else
	 * SDK最大连接数
	 * \endif
	 */
	public static final int SDK_MAX_LINK = 6;

	/**
	 * \if ENGLISH_LANG
	 * Access the maximum number of daily time-period
	 * \else
	 * 门禁每天分时时间段最大个数
	 * \endif
	 */
	public static final int MAX_DOOR_TIME_SECTION = 4;

	/**
	 * \if ENGLISH_LANG
	 * max sn len
	 * \else
	 * 最大设备序列号长度
	 * \endif
	 */
	public static final int CFG_MAX_SN_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max Order num
	 * \else
	 * 规则最大个数
	 * \endif
	 */
	public static final int MAX_ORDER_NUMBER							= 6;

	/**
	 * \if ENGLISH_LANG
	 * max address len
	 * \else
	 * 最大的地址长度
	 * \endif
	 */
	public static final int CFG_MAX_ACCESS_CONTROL_ADDRESS_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max channel amount
	 * \else
	 * 最大通道个数
	 * \endif
	 */
	public static final int SDK_MAX_CHANNUM = 16;

	/**
	 * \if ENGLISH_LANG
	 * decoder device max channel number
	 * \else
	 * 解码器最大通道数
	 * \endif
	 */
	public static final int SDK_MAX_DECODER_CHANNUM = 64;


	/**
	 * \if ENGLISH_LANG
	 * Max floor number
	 * \else
	 * 最大楼层数量
	 * \endif
	 */
	public static final int MAX_ACCESS_FLOOR_NUM = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max count of rooms
	 * \else
	 * 房间最大个数
	 * \endif
	 */
	public static final int MAX_ROOMNUM_COUNT = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max alarm input amount
	 * \else
	 * 最大报警输入个数
	 * \endif
	 */
	public static final int SDK_MAX_ALARMIN = 128;

	/**
	 * \if ENGLISH_LANG
	 * Max alarm output amount
	 * \else
	 * 最大报警输出个数
	 * \endif
	 */
	public static final int SDK_MAX_ALARMOUT = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max user right amount
	 * \else
	 * 用户权限个数上限
	 * \endif
	 */
	public static final int SDK_MAX_RIGHT_NUM = 100;

	/**
	 * \if ENGLISH_LANG
	 * Max target object information
	 * \else
	 * 最大目标物体信息个数
	 * \endif
	 */
	public static final int MAX_TARGET_OBJECT_NUM = 100;

	/**
	 * \if ENGLISH_LANG
	 * Max user group amount
	 * \else
	 * 用户组个数上限
	 * \endif
	 */
	public static final int SDK_MAX_GROUP_NUM = 20;

	/**
	 * \if ENGLISH_LANG
	 * Max user account amount
	 * \else
	 * 用户个数上限
	 * \endif
	 */
	public static final int SDK_MAX_USER_NUM = 200;

	/**
	 * \if ENGLISH_LANG
	 * The maximum number of detected object
	 * \else
	 * 检测到目标的最大个数
	 * \endif
	 */
	public static final int HDBJ_MAX_OBJECTS_NUM = 200;

	/**
	 * \if ENGLISH_LANG
	 * Right name length
	 * \else
	 * 权限名长度
	 * \endif
	 */
	public static final int SDK_RIGHT_NAME_LENGTH = 32;

	/**
	 * \if ENGLISH_LANG
	 * Right name length
	 * \else
	 * 最大路径长度
	 * \endif
	 */
	public static final int MAX_PATH_LEN	= 260;

	/**
	 * \if ENGLISH_LANG
	 * User name length
	 * \else
	 * 用户名长度
	 * \endif
	 */
	public static final int SDK_USER_NAME_LENGTH = 8;

	/**
	 * \if ENGLISH_LANG
	 * User password length
	 * \else
	 * 用户密码长度
	 * \endif
	 */
	public static final int SDK_USER_PSW_LENGTH = 8;

	/**
	 * \if ENGLISH_LANG
	 * Note length
	 * \else
	 * 备注长度
	 * \endif
	 */
	public static final int SDK_MEMO_LENGTH = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max string length
	 * \else
	 * 字符串长度
	 * \endif
	 */
	public static final int SDK_MAX_STRING_LEN = 128;

	/**
	 * \if ENGLISH_LANG
	 * Max six rows
	 * \else
	 * 最多六行
	 * \endif
	 */
	public static final int MAX_STRING_LINE_LEN = 6;

	/**
	 * \if ENGLISH_LANG
	 * Line max length
	 * \else
	 * 每行最大长度
	 * \endif
	 */
	public static final int MAX_PER_STRING_LEN = 20;

	/**
	 * \if ENGLISH_LANG
	 * The user name length the new mail structure supported
	 * \else
	 * 新的邮件结构体支持的用户名长度
	 * \endif
	 */
	public static final int SDK_MAX_MAIL_NAME_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * Password length the new mail structhre supported
	 * \else
	 * 新的邮件结构体支持的密码长度
	 * \endif
	 */
	public static final int SDK_MAX_MAIL_PSW_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * Speed limit string max length
	 * \else
	 * 限速类型字符串长度
	 * \endif
	 */
	public static final int SDK_SPEEDLIMIT_TYPE_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * Vehicle info type max length
	 * \else
	 * 车载自定义信息类型字符串长度
	 * \endif
	 */
	public static final int SDK_VEHICLE_TYPE_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * Vehicle info string max length
	 * \else
	 * 车载自定义信息字符串长度
	 * \endif
	 */
	public static final int SDK_VEHICLE_INFO_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * Driver no string max length
	 * \else
	 * 车载自定义信息司机工号字符串长度
	 * \endif
	 */
	public static final int SDK_VEHICLE_DRIVERNO_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max supported crossing num
	 * \else
	 * 最大点位
	 * \endif
	 */
	public static final int SDK_MAX_CROSSING_NUM = 128;

	/**
	 * \if ENGLISH_LANG
	 * Max crossing ID length
	 * \else
	 * 路口序列号最大长度
	 * \endif
	 */
	public static final int SDK_MAX_CROSSING_ID = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max card info length
	 * \else
	 * 卡号信息最大长度
	 * \endif
	 */
	public static final int SDK_MAX_CARD_INFO_LEN = 256;

	/**
	 * \if ENGLISH_LANG
	 * Extended max channel number
	 * \else
	 * 最大通道数扩展
	 * \endif
	 */
	public static final int SDK_MAX_CHANNUM_EX = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max number of IP for saerch
	 * \else
	 * 最大搜索IP个数
	 * \endif
	 */
	public static final int SDK_MAX_SAERCH_IP_NUM = 256;

	/**
	 * \if ENGLISH_LANG
	 * Hard disk type maximum length
	 * \else
	 * 硬盘型号最大长度
	 * \endif
	 */
	public static final int SDK_MAX_HARDDISK_TYPE_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * Hard disk serial maximum length
	 * \else
	 * 硬盘序列号最大长度
	 * \endif
	 */
	public static final int SDK_MAX_HARDDISK_SERIAL_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * Value of SIM maximum length
	 * \else
	 * SIM卡的值的最大长度
	 * \endif
	 */
	public static final int SDK_MAX_SIM_LEN = 16;

	/**
	 * \if ENGLISH_LANG
	 * Pick up SIM maximum number
	 * \else
	 * 车载SIM卡最大个数
	 * \endif
	 */
	public static final int SDK_MAX_SIM_NUM = 10;

	/**
	 * \if ENGLISH_LANG
	 * max MCU number
	 * \else
	 * 最大报警主机单片机个数
	 * \endif
	 */
	public static final int MAX_MCU_NUM = 10;

	/**
	 * \if ENGLISH_LANG
	 * Version maximum length
	 * \else
	 * 软件版本号最大长度
	 * \endif
	 */
	public static final int SDK_MAX_VERSION_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * Value of MDN maximum length
	 * \else
	 * MDN的值的最大长度
	 * \endif
	 */
	public static final int SDK_MAX_MDN_LEN = 36;

	/**
	 * \if ENGLISH_LANG
	 * Support the card number
	 * \else
	 * 支持的网卡个数
	 * \endif
	 */
	public static final int SDK_MAX_NETINTERFACE_NUM = 64;

	/**
	 * \if ENGLISH_LANG
	 * Length of event name
	 * \else
	 * 事件名称长度
	 * \endif
	 */
	public static final int SDK_EVENT_NAME_LEN = 128;

	/**
	 * \if ENGLISH_LANG
	 * Length of storage name
	 * \else
	 * 存储设备名称长度
	 * \endif
	 */
	public static final int SDK_STORAGE_NAME_LEN = 128;

	/**
	 * \if ENGLISH_LANG
	 * Carport liht maximum number
	 * \else
	 * 最大车位灯个数
	 * \endif
	 */
	public static final int SDK_MAX_CARPORTLIGHT_NUM = 4;

	/**
	 * \if ENGLISH_LANG
	 * Length of station name
	 * \else
	 * 车站站点名称长度
	 * \endif
	 */
	public static final int SDK_STATION_NAME_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * Version string max length
	 * \else
	 * 版本字符串最大长度
	 * \endif
	 */
	public static final int SDK_MAX_VERSION_STR = 64;

	/**
	 * \if ENGLISH_LANG
	 * General string length 8
	 * \else
	 * 通用字符串长度8
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_8 = 8;

	/**
	 * \if ENGLISH_LANG
	 * General string length 16
	 * \else
	 * 通用字符串长度16
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_16 = 16;

	/**
	 * \if ENGLISH_LANG
	 * General string length 32
	 * \else
	 * 通用字符串长度32
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_32 = 32;


	/**
	 * \if ENGLISH_LANG
	 * General string length 36
	 * \else
	 * 通用字符串长度36
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_36 = 36;

	/**
	 * \if ENGLISH_LANG
	 * General string length 64
	 * \else
	 * 通用字符串长度64
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_64 = 64;

	/**
	 * \if ENGLISH_LANG
	 * General string length 128
	 * \else
	 * 通用字符串长度128
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_128 = 128;

	/**
	 * \if ENGLISH_LANG
	 * General string length 256
	 * \else
	 * 通用字符串长度256
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_256 = 256;

	/**
	 * \if ENGLISH_LANG
	 * General string length 512
	 * \else
	 * 通用字符串长度512
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_512 = 512;

	/**
	 * \if ENGLISH_LANG
	 * General string length 1024
	 * \else
	 * 通用字符串长度 1024
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_1024 = 1024;

	/**
	 * \if ENGLISH_LANG
	 * General string length 2048
	 * \else
	 * 通用字符串长度 2048
	 * \endif
	 */
	public static final int SDK_COMMON_STRING_2048 = 2048;

	/**
	 * \if ENGLISH_LANG
	 * Max lower matrix number
	 * \else
	 * 最大下位矩阵数
	 * \endif
	 */
	public static final int SDK_MAX_LOWER_MITRIX_NUM = 16;

	/**
	 * \if ENGLISH_LANG
	 * Max writing channel number
	 * \else
	 * 最大刻录通道数
	 * \endif
	 */
	public static final int SDK_MAX_BURN_CHANNEL_NUM = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max remote storage area quantity
	 * \else
	 * 最大远程存储区块数量
	 * \endif
	 */
	public static final int SDK_MAX_NET_STRORAGE_BLOCK_NUM = 64;

	/**
	 * \if ENGLISH_LANG
	 * Case staff max quantity
	 * \else
	 * 案件人员最大数量
	 * \endif
	 */
	public static final int SDK_MAX_CASE_PERSON_NUM = 32;


	/**
	 * \if ENGLISH_LANG
	 * Max channel preview playback channel number
	 * \else
	 * 最大多通道预览回放通道数
	 * \endif
	 */
	public static final int SDK_MAX_MULTIPLAYBACK_CHANNEL_NUM = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max channel preview playback split mode number
	 * \else
	 * 最大多通道预览回放分割模式数
	 * \endif
	 */
	public static final int SDK_MAX_MULTIPLAYBACK_SPLIT_NUM = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max audio encode type number
	 * \else
	 * 最大语音编码类型个数
	 * \endif
	 */
	public static final int SDK_MAX_AUDIO_ENCODE_TYPE = 64;

	/**
	 * \if ENGLISH_LANG
	 * Access control name length
	 * \else
	 * 门禁名称长度
	 * \endif
	 */
	public static final int SDK_MAX_ACCESS_NAME_LEN = 64 ;

	/**
	 * \if ENGLISH_LANG
	 * Extension module alarm channel name length
	 * \else
	 * 扩展模块报警通道名称长度
	 * \endif
	 */
	public static final int SDK_MAX_EXALARMCHANNEL_NAME_LEN = 128;

	/**
	 * \if ENGLISH_LANG
	 * Call ID length
	 * \else
	 * 呼叫ID长度
	 * \endif
	 */
	public static final int MAX_CALL_ID_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max number of day and night light config
	 * \else
	 * 白天黑夜对应灯光配置最大个数
	 * \endif
	 */
	public static final int CFG_LC_LIGHT_CONFIG = 8;

	/**
	 * \if ENGLISH_LANG
	 * Light type max num
	 * \else
	 * 各类型灯光信息最大个数
	 * \endif
	 */
	public static final int LC_LIGHT_TYPE_NUM = 3;

	/**
	 * \if ENGLISH_LANG
	 * Light node num
	 * \else
	 * 模式数量
	 * \endif
	 */
	public static final int LC_LIGHT_MODE_NUM = 20;



	/**
	 * \if ENGLISH_LANG
	 * light's num of light group
	 * \else
	 * 灯光组灯光数量
	 * \endif
	 */
	public static final int CFG_LC_LIGHT_COUNT = 4;


	/**
	 * \if ENGLISH_LANG
	 * Custom deviceid length
	 * \else
	 * ID长度
	 * \endif
	 */
	public static final int SDK_DEV_CUSTOM_DEVICEID_LEN = 24;

	/**
	 * \if ENGLISH_LANG
	 * Mode supported by intelligent mixed light
	 * \else
	 * 智能混光灯支持的模式
	 * \endif
	 */
	public static final int SUPPORTED_AIMIX_LIGHT = 8;

	/**
	 * \if ENGLISH_LANG
	 * IPv4 address string length
	 * \else
	 * IPv4地址字符串长度
	 * \endif
	 */
	public static final int SDK_MAX_IPADDRV4_LEN = 16;
	/**
	 * \if ENGLISH_LANG
	 * IPv6 address string length
	 * \else
	 * IPv6地址字符串长度
	 * \endif
	 */
	public static final int SDK_MAX_IPADDRV6_LEN = 64;


	/**
	 * \if ENGLISH_LANG
	 * Detect versions max num
	 * \else
	 * 动检方案信息最大个数
	 * \endif
	 */
	public static final int MAX_DETECT_VERSION_NUM = 64;
	/**
	 * \if ENGLISH_LANG
	 * Detect versions max num
	 * \else
	 * 动检方案信息最大个数
	 * \endif
	 */
	public static final int MAX_BLIND_DETECT_VERSION_NUM = 64;

		/**
	 * \if ENGLISH_LANG
	 * Max color name length
	 * \else
	 * 最大颜色名长度
	 * \endif
	 */
	public static final int MAX_COLOR_NAME_LEN = 32;
	
	/**
	 * \if ENGLISH_LANG
	 * Max group ID length
	 * \else
	 * 最大布控组ID长度
	 * \endif
	 */
	public static final int  MAX_GROUP_ID_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max link group number
	 * \else
	 * 联动的布控组最大数量
	 * \endif
	 */
	public static final int  MAX_LINK_GROUP_NUM = 20;

	/**
	 * \if ENGLISH_LANG
	 * Max color HEX length
	 * \else
	 * 最大HEX颜色长度
	 * \endif
	 */
	public static final int  MAX_COLOR_HEX_LEN = 8;

	/***********************************************************************************************
	 * 						查询类型,对应{@link INetSDK#QueryDevState}接口					      **
	 ***********************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * Search general alarm status(including external alarm,video loss, motion detection)
	 * \else
	 * 查询普通报警状态(包括外部报警，视频丢失，动态检测)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_COMM_ALARM	            =     0x0001 ;

	/**
	 * \if ENGLISH_LANG
	 * Search camera masking alarm status
	 * \else
	 * 查询遮挡报警状态
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SHELTER_ALARM           =     0x0002 ;

	/**
	 * \if ENGLISH_LANG
	 * Search record status
	 * \else
	 * 查询录象状态
	 * \endif
	 */
	public static final int SDK_DEVSTATE_RECORDING               =     0x0003 ;

	/**
	 * \if ENGLISH_LANG
	 * Search HDD information, refer to {@link SDK_HARDDISK_STATE}
	 * \else
	 * 查询硬盘信息，对应 {@link SDK_HARDDISK_STATE}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DISK                    =     0x0004 ;

	/**
	 * \if ENGLISH_LANG
	 * Search system resources status
	 * \else
	 * 查询系统资源状态
	 * \endif
	 */
	public static final int SDK_DEVSTATE_RESOURCE                =     0x0005 ;

	/**
	 * \if ENGLISH_LANG
	 * Search channel bit stream
	 * \else
	 * 查询通道码流
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BITRATE                 =     0x0006 ;

	/**
	 * \if ENGLISH_LANG
	 * Search device connection status
	 * \else
	 * 查询设备连接状态
	 * \endif
	 */
	public static final int SDK_DEVSTATE_CONN                    =     0x0007 ;

	/**
	 * \if ENGLISH_LANG
	 * Search network protocol version number , pBuf = int*
	 * \else
	 * 查询网络协议版本号，pBuf = int*
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PROTOCAL_VER            =     0x0008 ;

	/**
	 * \if ENGLISH_LANG
	 * Search the audio talk format the device supported. refer to {@link SDKDEV_TALKFORMAT_LIST}
	 * \else
	 * 查询设备支持的语音对讲格式列表, 取值参考{@link SDKDEV_TALKFORMAT_LIST}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TALK_ECTYPE             =     0x0009 ;

	/**
	 * \if ENGLISH_LANG
	 * Search SD card information(FOR IPC series)
	 * \else
	 * 查询SD卡信息(IPC类产品)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SD_CARD                 =     0x000A ;

	/**
	 * \if ENGLISH_LANG
	 * Search burner information
	 * \else
	 * 查询刻录机信息
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BURNING_DEV             =     0x000B ;

	/**
	 * \if ENGLISH_LANG
	 * Search burning information
	 * \else
	 * 查询刻录进度
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BURNING_PROGRESS        =     0x000C ;

	/**
	 * \if ENGLISH_LANG
	 * Search the embedded platform the device supported
	 * \else
	 * 查询设备支持的接入平台
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PLATFORM                =     0x000D ;

	/**
	 * \if ENGLISH_LANG
	 * Search camera property information ( for IPC series), pBuf refer to {@link SDKDEV_CAMERA_INFO} ,there can be several structure.
	 * \else
	 * 查询摄像头属性信息(IPC类产品)，pBuf取值参考 {@link SDKDEV_CAMERA_INFO} ，可以有多个结构体
	 * \endif
	 */
	public static final int SDK_DEVSTATE_CAMERA                  =     0x000E ;

	/**
	 * \if ENGLISH_LANG
	 * Search device software version information
	 * \else
	 * 查询设备软件版本信息
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SOFTWARE                =     0x000F ;

	/**
	 * \if ENGLISH_LANG
	 * Search the audio type the device supported
	 * \else
	 * 查询设备支持的语音种类
	 * \endif
	 */
	public static final int SDK_DEVSTATE_LANGUAGE                =     0x0010 ;

	/**
	 * \if ENGLISH_LANG
	 * Search DSP capacity description, refer to {@link SDKDEV_DSP_ENCODECAP}
	 * \else
	 * 查询DSP能力描述, 取值参考 {@link SDKDEV_DSP_ENCODECAP}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DSP                     =     0x0011 ;

	/**
	 * \if ENGLISH_LANG
	 * Search OEM information
	 * \else
	 * 查询OEM信息
	 * \endif
	 */
	public static final int SDK_DEVSTATE_OEM                     =     0x0012 ;

	/**
	 * \if ENGLISH_LANG
	 * Search network running status information
	 * \else
	 * 查询网络运行状态信息
	 * \endif
	 */
	public static final int SDK_DEVSTATE_NET                     =     0x0013 ;

	/**
	 * \if ENGLISH_LANG
	 * Search function attributes(for IPC serirs)
	 * \else
	 * 查询设备类型
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TYPE                    =     0x0014 ;

	/**
	 * \if ENGLISH_LANG
	 * Search snapshot function attribute(For IPC series)
	 * \else
	 * 查询功能属性(IPC类产品)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SNAP                    =     0x0015 ;

	/**
	 * \if ENGLISH_LANG
	 * Query the first time and the recent video time
	 * \else
	 * 查询最早录像时间和最近录像时间
	 * \endif
	 */
	public static final int SDK_DEVSTATE_RECORD_TIME             =     0x0016 ;

	/**
	 * \if ENGLISH_LANG
	 * Query the wireless network signal strength, refer to {@link SDKDEV_WIRELESS_RSS_INFO}
	 * \else
	 * 查询无线网络信号强度, 取值参考 {@link SDKDEV_WIRELESS_RSS_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_NET_RSSI                =     0x0017 ;

	/**
	 * \if ENGLISH_LANG
	 * Burning options inquiry
	 * \else
	 * 查询附件刻录选项
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BURNING_ATTACH          =     0x0018 ;

	/**
	 * \if ENGLISH_LANG
	 * Query the list of backup device
	 * \else
	 * 查询备份设备列表
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BACKUP_DEV              =     0x0019 ;

	/**
	 * \if ENGLISH_LANG
	 * Query the backup device information
	 * \else
	 * 查询备份设备详细信息
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BACKUP_DEV_INFO         =     0x001a ;

	/**
	 * \if ENGLISH_LANG
	 * Backup rate of progress
	 * \else
	 * 备份进度反馈
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BACKUP_FEEDBACK         =     0x001b ;

	/**
	 * \if ENGLISH_LANG
	 * Query ATM trade type
	 * \else
	 * 查询ATM交易类型
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ATM_QUERY_TRADE         =     0x001c ;

	/**
	 * \if ENGLISH_LANG
	 * Query sip state
	 * \else
	 * 查询sip状态
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SIP                     =     0x001d ;

	/**
	 * \if ENGLISH_LANG
	 * Query wifi state of mobile DVR
	 * \else
	 * 查询车载wifi状态
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VICHILE_STATE           =     0x001e ;

	/**
	 * \if ENGLISH_LANG
	 * Query Email Function
	 * \else
	 * 查询邮件配置是否成功
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TEST_EMAIL              =     0x001f ;

	/**
	 * \if ENGLISH_LANG
	 * Query Hard Disk Information
	 * \else
	 * 查询硬盘smart信息
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SMART_HARD_DISK         =     0x0020 ;

	/**
	 * \if ENGLISH_LANG
	 * Query Snap Picture Function
	 * \else
	 * 查询抓图设置是否成功
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TEST_SNAPPICTURE        =     0x0021 ;

	/**
	 * \if ENGLISH_LANG
	 * Query static alarm state
	 * \else
	 * 查询静态报警状态
	 * \endif
	 */
	public static final int SDK_DEVSTATE_STATIC_ALARM            =     0x0022 ;

	/**
	 * \if ENGLISH_LANG
	 * Query submodule information
	 * \else
	 * 查询设备子模块信息
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SUBMODULE_INFO          =     0x0023 ;

	/**
	 * \if ENGLISH_LANG
	 * Query harddisk damage ability
	 * \else
	 * 查询硬盘坏道能力
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DISKDAMAGE              =     0x0024 ;

	/**
	 * \if ENGLISH_LANG
	 * Query device supported IPC ability, refer to {@link SDK_DEV_IPC_INFO}
	 * \else
	 * 查询设备支持的IPC能力, 取值参考 {@link SDK_DEV_IPC_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_IPC                     =     0x0025 ;

	/**
	 * \if ENGLISH_LANG
	 * Query alarm arm disarm state, refer to {@link ALARM_ARM_DISARM_STATE_INFO}
	 * \else
	 * 查询报警布撤防状态, 对应 {@link ALARM_ARM_DISARM_STATE_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARM_ARM_DISARM        =     0x0026 ;

	/**
	 * \if ENGLISH_LANG
	 * Query ACC power off state(return a DWORD type value, 1 means power off,0 means power on)
	 * \else
	 * 查询ACC断电报警状态(返回一个DWORD, 1表示断电，0表示通电)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ACC_POWEROFF_ALARM      =     0x0027 ;

	/**
	 * \if ENGLISH_LANG
	 * FTP server connect test
	 * \else
	 * 测试FTP服务器连接
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TEST_FTP_SERVER         =     0x0028 ;

	/**
	 * \if ENGLISH_LANG
	 * Query 3G Flow exceed state info, refer to  {@link SDKDEV_3GFLOW_EXCEED_STATE_INFO}
	 * \else
	 * 查询3G流量超出阈值状态, 取值参考 {@link SDKDEV_3GFLOW_EXCEED_STATE_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_3GFLOW_EXCEED           =     0x0029 ;

	/**
	 * \if ENGLISH_LANG
	 * Query 3G Flow info, refer to  {@link SDK_DEV_3GFLOW_INFO}
	 * \else
	 * 端查询3G网络流量信息, 取值参考 {@link SDK_DEV_3GFLOW_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_3GFLOW_INFO             =     0x002a ;

	/**
	 * \if ENGLISH_LANG
	 * Vihicle information uploading, refer to {@link ALARM_VEHICLE_INFO_UPLOAD}
	 * \else
	 * 车载自定义信息上传, 取值参考 {@link ALARM_VEHICLE_INFO_UPLOAD}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VIHICLE_INFO_UPLOAD     =     0x002b ;

	/**
	 * \if ENGLISH_LANG
	 * QSpeed limit alarm, refer to {@link ALARM_SPEED_LIMIT}
	 * \else
	 * 查询限速报警状态, 取值参考 {@link ALARM_SPEED_LIMIT}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SPEED_LIMIT             =     0x002c ;

	/**
	 * \if ENGLISH_LANG
	 * Query DSP expended cap, refer to {@link SDKDEV_DSP_ENCODECAP_EX}
	 * \else
	 * 查询DSP扩展能力描述, 取值参考 {@link SDKDEV_DSP_ENCODECAP_EX}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DSP_EX                  =     0x002d ;

	/**
	 * \if ENGLISH_LANG
	 * Query 3G module info, refer to {@link SDK_DEV_3GMODULE_INFO}
	 * \else
	 * 查询3G模块信息 , 取值参考 {@link SDK_DEV_3GMODULE_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_3GMODULE_INFO           =     0x002e ;

	/**
	 * \if ENGLISH_LANG
	 * Query multi DDNS status, refer to {@link SDK_DEV_MULTI_DDNS_INFO}
	 * \else
	 * 查询多DDNS状态信息, 取值参考 {@link SDK_DEV_MULTI_DDNS_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_MULTI_DDNS              =     0x002f ;

	/**
	 * \if ENGLISH_LANG
	 * Query Device URL info, refer to {@link SDK_DEV_URL_INFO}
	 * \else
	 * 查询设备配置URL信息, 取值参考 {@link SDK_DEV_URL_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_CONFIG_URL              =     0x0030 ;

	/**
	 * \if ENGLISH_LANG
	 * Query Hard key state, refer to {@link SDKDEV_HARDKEY_STATE}
	 * \else
	 * 查询HardKey状态, 取值参考 {@link SDKDEV_HARDKEY_STATE}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_HARDKEY                 =     0x0031 ;

	/**
	 * \if ENGLISH_LANG
	 * Query ISCSI path, refer to {@link SDKDEV_ISCSI_PATHLIST}
	 * \else
	 * 查询ISCSI路径列表, 取值参考 {@link SDKDEV_ISCSI_PATHLIST}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ISCSI_PATH              =     0x0032 ;

	/**
	 * \if ENGLISH_LANG
	 * Query local preview split capability, refer to {@link DEVICE_LOCALPREVIEW_SLIPT_CAP}
	 * \else
	 * 查询设备本地预览支持的分割模式, 取值参考 {@link DEVICE_LOCALPREVIEW_SLIPT_CAP}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DLPREVIEW_SLIPT_CAP     =     0x0033 ;

	/**
	 * \if ENGLISH_LANG
	 * Query wifi capablity, refer to {@link SDKDEV_WIFI_ROUTE_CAP}
	 * \else
	 * 查询无线路由能力信息, 取值参考 {@link SDKDEV_WIFI_ROUTE_CAP}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_WIFI_ROUTE_CAP          =     0x0034 ;

	/**
	 * \if ENGLISH_LANG
	 * Query device online state(return a DWORD value, 1-online, 0-offline)
	 * \else
	 * 查询设备的在线状态(返回一个DWORD, 1表示在线, 0表示断线)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ONLINE                  =     0x0035 ;

	/**
	 * \if ENGLISH_LANG
	 * Query ptz state, refer to {@link SDK_PTZ_LOCATION_INFO}
	 * \else
	 * 查询云台状态信息, 取值参考 {@link SDK_PTZ_LOCATION_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PTZ_LOCATION            =     0x0036 ;

	/**
	 * \if ENGLISH_LANG
	 * PQuery monitor state, refer to {@link SDKDEV_MONITOR_INFO}
	 * \else
	 * 画面预览辅助信息, 取值参考 {@link SDKDEV_MONITOR_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_MONITOR_INFO            =     0x0037 ;

	/**
	 * \if ENGLISH_LANG
	 * PQuery subdevcie(fan,cpu...) state, refer to {@link CFG_DEVICESTATUS_INFO}
	 * \else
	 * 查询子设备(电源, 风扇等)状态, 取值参考 {@link CFG_DEVCFG_DEVICESTATUS_INFOICESTATUS_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SUBDEVICE               =     0x0300 ;

	/**
	 * \if ENGLISH_LANG
	 * Query RAID state, refer to {@link ALARM_RAID_INFO}
	 * \else
	 * 查询RAID状态, 取值参考 {@link ALARM_RAID_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_RAID_INFO               =     0x0038 ;

	/**
	 * \if ENGLISH_LANG
	 * Test DDNS domain enable
	 * \else
	 * 测试DDNS域名是否可用
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TEST_DDNSDOMAIN         =     0x0039 ;

	/**
	 * \if ENGLISH_LANG
	 * Query virtual camera state, refer to {@link SDKDEV_VIRTUALCAMERA_STATE_INFO}
	 * \else
	 * 查询虚拟摄像头状态, 取值参考 {@link SDKDEV_VIRTUALCAMERA_STATE_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VIRTUALCAMERA           =     0x003a ;

	/**\
	 * \if ENGLISH_LANG
	 * Get device's state of video/coil module, refer to {@link SDKDEV_TRAFFICWORKSTATE_INFO}
	 * \else
	 * 获取设备工作视频/线圈模式状态等, 取值参考 {@link SDKDEV_TRAFFICWORKSTATE_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_TRAFFICWORKSTATE        =     0x003b ;

	/**
	 * \if ENGLISH_LANG
	 * Get camera move alarm state, refer to {@link ALARM_CAMERA_MOVE_INFO}
	 * \else
	 * 获取摄像机移位报警事件状态, 取值参考 {@link ALARM_CAMERA_MOVE_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARM_CAMERA_MOVE       =     0x003c ;

	/**
	 * \if ENGLISH_LANG
	 * Get external alarm, refer to {@link NET_CLIENT_ALARM_STATE}
	 * \else
	 * 获取外部报警状态, 取值参考 {@link NET_CLIENT_ALARM_STATE}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARM                   =     0x003e ;

	/**
	 * \if ENGLISH_LANG
	 * Get video loss alarm, refer to {@link NET_CLIENT_VIDEOLOST_STATE}
	 * \else
	 * 获取视频丢失报警状态, 取值参考 {@link NET_CLIENT_VIDEOLOST_STATE}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VIDEOLOST               =     0x003f ;

	/**
	 * \if ENGLISH_LANG
	 * Get motion alarm, refer to {@link NET_CLIENT_MOTIONDETECT_STATE}
	 * \else
	 * 获取动态监测报警状态, 取值参考 {@link NET_CLIENT_MOTIONDETECT_STATE}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_MOTIONDETECT            =     0x0040 ;

	/**
	 * \if ENGLISH_LANG
	 * Get detailed motion alarm, refer to {@link NET_CLIENT_DETAILEDMOTION_STATE}
	 * \else
	 * 获取详细的动态监测报警状态, 取值参考 {@link NET_CLIENT_DETAILEDMOTION_STATE}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DETAILEDMOTION          =     0x0041 ;

	/**
	 * \if ENGLISH_LANG
	 * Get vehicle device state, refer to {@link SDKDEV_VEHICLE_INFO}
	 * \else
	 * 获取车载自身各种硬件信息, 取值参考 {@link SDKDEV_VEHICLE_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VEHICLE_INFO            =     0x0042 ;

	/**
	 * \if ENGLISH_LANG
	 * Get blind alarm, refer to {@link NET_CLIENT_VIDEOBLIND_STATE}
	 * \else
	 * 获取视频遮挡报警状态, 取值参考 {@link NET_CLIENT_VIDEOBLIND_STATE}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VIDEOBLIND              =     0x0043 ;

	/**
	 * \if ENGLISH_LANG
	 * Query 3G state, refer to {@link SDKDEV_VEHICLE_3GMODULE}
	 * \else
	 * 查询3G模块相关信息, 取值参考 {@link SDKDEV_VEHICLE_3GMODULE}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_3GSTATE_INFO            =     0x0044 ;

	/**
	 * \if ENGLISH_LANG
	 * Query net interface, refer to {@link SDKDEV_NETINTERFACE_INFO}
	 * \else
	 * 查询网络接口信息, 取值参考 {@link SDKDEV_NETINTERFACE_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_NETINTERFACE            =     0x0045 ;

	/**
	 * \if ENGLISH_LANG
	 * Query picinpic channel(struct DWORD)
	 * \else
	 * 查询画中画通道号(对应DWORD数组)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PICINPIC_CHN            =     0x0046 ;

	/**
	 * \if ENGLISH_LANG
	 * Query splice screen, refer to {@link SDK_COMPOSITE_CHANNEL}
	 * \else
	 * 查询融合屏通道信息, 取值参考 {@link SDK_COMPOSITE_CHANNEL}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_COMPOSITE_CHN           =     0x0047 ;

	/**
	 * \if ENGLISH_LANG
	 * Query whole recording status(struct BOOL),as long as ther is a channel running,it indicates that the overall state
	 * \else
	 * 查询设备整体录像状态(对应BOOL), 只要有一个通道在录像，即为设备整体状态为录像
	 * \endif
	 */
	public static final int SDK_DEVSTATE_WHOLE_RECORDING         =     0x0048 ;

	/**
	 * \if ENGLISH_LANG
	 * Query whole encoding(struct BOOL),as long as ther is a channel running,it indicates that the overall state
	 * \else
	 * 查询设备整体编码状态(对应BOOL), 只要有一个通道在编码，即为设备整体状态为编码
	 * \endif
	 */
	public static final int SDK_DEVSTATE_WHOLE_ENCODING          =     0x0049 ;

	/**
	 * \if ENGLISH_LANG
	 * Query disk record time, pBuf refer to {@link DEV_DISK_RECORD_TIME}
	 * \else
	 * 查询设备硬盘录像时间信息, pBuf 取值参考 {@link DEV_DISK_RECORD_TIME}, 可以有多个结构体
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DISK_RECORDE_TIME       =     0x004a ;

	/**
	 * \if ENGLISH_LANG
	 * Whether have pop-up optical dirve, refer to {@link NET_DEVSTATE_BURNERDOOR}
	 * \else
	 * 是否已弹出刻录机光驱门, 取值参考 {@link NET_DEVSTATE_BURNERDOOR}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BURNER_DOOR             =     0x004b ;

	/**
	 * \if ENGLISH_LANG
	 * Get data validation process, refer to {@link NET_DEVSTATE_DATA_CHECK}
	 * \else
	 * 查询光盘数据校验进度, 取值参考 {@link NET_DEVSTATE_DATA_CHECK}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_GET_DATA_CHECK          =     0x004c ;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number, refer to {@link NET_ALARM_IN_CHANNEL}
	 * \else
	 * 查询报警输入通道信息, 取值参考 {@link NET_ALARM_IN_CHANNEL}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARM_IN_CHANNEL        =     0x004f ;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number, refer to {@link NET_ALARM_CHANNEL_COUNT}
	 * \else
	 * 查询报警通道数, 取值参考 {@link NET_ALARM_CHANNEL_COUNT}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARM_CHN_COUNT         =     0x0050 ;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number, refer to {@link SDK_OUT_PTZ_VIEW_RANGE_STATUS}
	 * \else
	 * 查询云台可视域状态, 取值参考 {@link SDK_OUT_PTZ_VIEW_RANGE_STATUS}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PTZ_VIEW_RANGE          =     0x0051 ;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number, refer to {@link NET_DEV_CHN_COUNT_INFO}
	 * \else
	 * 查询设备通道信息, 取值参考 {@link NET_DEV_CHN_COUNT_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DEV_CHN_COUNT           =     0x0052 ;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number, refer to {@link  DEV_RTSPURL_LIST}
	 * \else
	 * 查询设备支持的RTSP URL列表, 取值参考 {@link DEV_RTSPURL_LIST }
	 * \endif
	 */
	public static final int SDK_DEVSTATE_RTSP_URL                =     0x0053 ;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 查询设备登录的在线超时时间,返回一个BTYE,（单位：分钟） ,0表示不限制,非零正整数表示限制的分钟数
	 * \endif
	 */
	public static final int SDK_DEVSTATE_LIMIT_LOGIN_TIME        =     0x0054 ;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number, refer to {@link NET_GET_COMM_COUNT}
	 * \else
	 * 获取串口数, 取值参考 {@link NET_GET_COMM_COUNT}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_GET_COMM_COUNT          =     0x0055 ;

	/**
	 * \if ENGLISH_LANG
	 * Query recording status detail information, refer to {@link NET_RECORD_STATE_DETAIL}
	 * \else
	 * 查询录象状态详细信息, 取值参考 {@link NET_RECORD_STATE_DETAIL}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_RECORDING_DETAIL      = 0x0056;

	/**
	 * \if ENGLISH_LANG
	 * get state PTZ preset list, refer to {@link NET_PTZ_PRESET_LIST}
	 * \else
	 * 获取当前云台的预置点列表, 取值参考 {@link NET_PTZ_PRESET_LIST}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PTZ_PRESET_LIST       = 0x0057;

	/**
	 * \if ENGLISH_LANG
	 * exteral device information, refer to {@link NET_EXTERNAL_DEVICE}
	 * \else
	 * 外接设备信息, 取值参考 {@link NET_EXTERNAL_DEVICE}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_EXTERNAL_DEVICE       = 0x0058;

	/**
	 * \if ENGLISH_LANG
	 * get device upgrade state, refer to {@link SDKDEV_UPGRADE_STATE_INFO}
	 * \else
	 * 获取设备升级状态, 取值参考 {@link SDKDEV_UPGRADE_STATE_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_GET_UPGRADE_STATE     = 0x0059;

	/**
	 * \if ENGLISH_LANG
	 * get mulipalyback split, refer to {@link NET_MULTIPLAYBACK_SPLIT_CAP}
	 * \else
	 * 获取多通道预览分割能力, 取值参考 {@link NET_MULTIPLAYBACK_SPLIT_CAP}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_MULTIPLAYBACK_SPLIT_CAP = 0x005a;

	/**
	 * \if ENGLISH_LANG
	 * get burn session number(pBuf = int*)
	 * \else
	 * 获取刻录会话总数(pBuf = int*)
	 * \endif
	 */
	public static final int SDK_DEVSTATE_BURN_SESSION_NUM      = 0x005b;

	/**
	 * \if ENGLISH_LANG
	 * Search protective capsule status, refer to {@link ALARM_PROTECTIVE_CAPSULE_INFO}
	 * \else
	 * 查询防护舱状态, 取值参考 {@link ALARM_PROTECTIVE_CAPSULE_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PROTECTIVE_CAPSULE    = 0x005c;

	/**
	 * \if ENGLISH_LANG
	 * Query PTZ optical zoom value, refer to {@link SDK_OUT_PTZ_ZOOM_INFO}
	 * \else
	 * 查询云台获取光学变倍信息, 取值参考 {@link SDK_OUT_PTZ_ZOOM_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_PTZ_ZOOM_INFO    = 0x005e;

	/**
	 * \if ENGLISH_LANG
	 * Query power state, refer to {@link NET_POWER_STATUS}
	 * \else
	 * 查询电源状态, 取值参考 {@link NET_POWER_STATUS}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_POWER_STATE           = 0x0152;

	/**
	 * \if ENGLISH_LANG
	 * Query alarm channel state, refer to {@link NET_CLIENT_ALARM_CHANNELS_STATE}
	 * \else
	 * 查询报警通道状态, 取值参考 {@link NET_CLIENT_ALARM_CHANNELS_STATE}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE  = 0x153;

	/**
	 * \if ENGLISH_LANG
	 * Query alarm keyboard count connected on com, refer to {@link NET_ALARMKEYBOARD_COUNT}
	 * \else
	 * 查询串口上连接的报警键盘数, 取值参考 {@link NET_ALARMKEYBOARD_COUNT}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARMKEYBOARD_COUNT   = 0x0154;

	/**
	 * \if ENGLISH_LANG
	 * Query mapping relationship of extension alarm module channel, refer to {@link NET_EXALARMCHANNELS}
	 * \else
	 * 查询扩展报警模块通道映射关系, 取值参考 {@link NET_EXALARMCHANNELS}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_EXALARMCHANNELS       = 0x0155;

	/**
	 * \if ENGLISH_LANG
	 * Query channel bypass state, refer to {@link NET_DEVSTATE_GET_BYPASS}
	 * \else
	 * 查询通道旁路状态, 取值参考 {@link NET_DEVSTATE_GET_BYPASS}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_GET_BYPASS            = 0x0156;

	/**
	 * \if ENGLISH_LANG
	 * get active sector information, refer to {@link NET_ACTIVATEDDEFENCEAREA}
	 * \else
	 * 获取激活的防区信息, 取值参考 {@link NET_ACTIVATEDDEFENCEAREA}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ACTIVATEDDEFENCEAREA  = 0x0157;

	/**
	 * \if ENGLISH_LANG
	 * Query device recording information, refer to {@link NET_CTRL_RECORDSET_PARAM}
	 * \else
	 * 查询设备记录集信息, 取值参考 {@link NET_CTRL_RECORDSET_PARAM}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DEV_RECORDSET         = 0x0158;

	/**
	 * \if ENGLISH_LANG
	 * Query door access state, refer to {@link NET_DOOR_STATUS_INFO}
	 * \else
	 * 查询门禁状态, 取值参考 {@link NET_DOOR_STATUS_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DOOR_STATE            = 0x0159;

	/**
	 * \if ENGLISH_LANG
	 * analog alarm input channel mapping, refer to {@link NET_ANALOGALARM_CHANNELS}
	 * \else
	 * 模拟量报警输入通道映射关系, 取值参考 {@link NET_ANALOGALARM_CHANNELS}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ANALOGALARM_CHANNELS  = 0x1560;

	/**
	 * \if ENGLISH_LANG
	 * Get device supported sensor list, refer to {@link NET_SENSOR_LIST}
	 * \else
	 * 获取设备支持的传感器列表, 取值参考 {@link NET_SENSOR_LIST}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_GET_SENSORLIST        = 0x1561;

	/**
	 * \if ENGLISH_LANG
	 * Search switch alarm template channel mapping relation, refer to {@link NET_ALARM_CHANNELS}
	 * If device su not support search extension alarm module channel, may use this function to search extension channel logic channel no. and use as local alarm channel use
	 * \else
	 * 查询开关量报警模块通道映射关系, 取值参考 {@link NET_ALARM_CHANNELS}
	 * 如果设备不支持查询扩展报警模块通道,可以用该功能查询扩展通道的逻辑通道号，并当做本地报警通道使用
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARM_CHANNELS	= 0x1562;

	/**
	 * \if ENGLISH_LANG
	 * Get current system enabling status, refer to {@link NET_GET_ALARM_SUBSYSTEM_ACTIVATE_STATUES}
	 * \else
	 * 获取当前子系统启用状态, 取值参考 {@link NET_GET_ALARM_SUBSYSTEM_ACTIVATE_STATUES}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_GET_ALARM_SUBSYSTEM_ACTIVATESTATUS	= 0x1563;

	/**
	 * \if ENGLISH_LANG
	 * Get sub system status, refer to {@link NET_ALARM_SUBSYSTEM_STATE}
	 * \else
	 * 获取子系统状态, 取值参考 {@link NET_ALARM_SUBSYSTEM_STATE}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARMSUBSYSTEM_STATE  = 0x1565;

	/**
	 * \if ENGLISH_LANG
	 * Get failure status, refer to {@link NET_ALARM_FAULT_STATE}
	 * \else
	 * 获取故障状态, 取值参考 {@link NET_ALARM_FAULT_STATE}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ALARM_FAULT_STATE     = 0x1566;

	/**
	 * \if ENGLISH_LANG
	 * Get the current disarm, refer to {@link NET_ARM_MODE_INFO}
	 * \else
	 * 获取当前布防撤防模式, 取值参考 {@link NET_ARM_MODE_INFO}
	 * \endif
	 * @deprecated
	 */
	public static final int SDK_DEVSTATE_ARM_MODE_GET          = 0x1567;

	/**
	 * \if ENGLISH_LANG
	 * Get zone status(bypass status change event, local alarm event, alarm signal event status description is different, cannot mix, for specific device use only), refer to {@link NET_DEFENCE_STATE_INFO}
	 * \else
	 * 获取防区状态(和旁路状态变化事件、本地报警事件、报警信号源事件的状态描述有区别，不能混用，仅个别设备使用), 取值参考 {@link NET_DEFENCE_STATE_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DEFENCE_STATE         = 0x1567;

	/**
	 * \if ENGLISH_LANG
	 * Get spot chart path info, refer to {@link NET_SCADA_POINT_LIST_INFO}
	 * \else
	 * 获取点位表路径信息, 取值参考 {@link NET_SCADA_POINT_LIST_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SCADA_POINT_LIST      = 0x1569;

	/**
	 * \if ENGLISH_LANG
	 * Get monitor spot info, refer to {@link NET_SCADA_INFO}
	 * \else
	 * 获取监测点位信息, 取值参考 {@link NET_SCADA_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SCADA_INFO            = 0x156a;

	/**
	 * \if ENGLISH_LANG
	 * Get SCADA capacityset, refer to {@link NET_SCADA_CAPS}
	 * \else
	 * 获取SCADA能力集, 取值参考 {@link NET_SCADA_CAPS}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SCADA_CAPS            = 0x156b;

	/**
	 * \if ENGLISH_LANG
	 * Get successful code item number, refer to {@link NET_GET_CODEID_COUNT}
	 * \else
	 * 获取对码成功的总条数, 取值参考 {@link NET_GET_CODEID_COUNT}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_GET_CODEID_COUNT      = 0x156c;

	/**
	 * \if ENGLISH_LANG
	 * Search code info, refer to {@link NET_GET_CODEID_LIST}
	 * \else
	 * 查询对码信息, 取值参考 {@link NET_GET_CODEID_LIST}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_GET_CODEID_LIST       = 0x156d;

	/**
	 * \if ENGLISH_LANG
	 * Search analog channel data, refer to {@link NET_GET_ANALOGALARM_DATA}
	 * \else
	 * 查询模拟量通道数据, 取值参考 {@link NET_GET_ANALOGALARM_DATA}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ANALOGALARM_DATA      = 0x156e;

	/**
	 * \if ENGLISH_LANG
	 * Access the call state of the video phone, refer to {@link NET_GET_VTP_CALLSTATE}
	 * \else
	 * 获取视频电话呼叫状态, 取值参考 {@link NET_GET_VTP_CALLSTATE}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_VTP_CALLSTATE         = 0x156f;

	/**
	 * \if ENGLISH_LANG
	 * query point info by device id, refer to {@link NET_SCADA_INFO_BY_ID}
	 * \else
	 * 通过设备、获取监测点位信息, 取值参考 {@link NET_SCADA_INFO_BY_ID}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SCADA_INFO_BY_ID      = 0x1570;

	/**
	 * \if ENGLISH_LANG
	 * query scada device id, refer to {@link NET_SCADA_DEVICE_LIST}
	 * \else
	 * 获取当前主机所接入的外部设备ID, 取值参考 {@link NET_SCADA_DEVICE_LIST}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_SCADA_DEVICE_LIST     = 0x1571;

	/**
	 * \if ENGLISH_LANG
	 * Search device record set info, refer to {@link NET_CTRL_RECORDSET_PARAM}
	 * \else
	 * 查询设备记录集信息(带二进制数据), 取值参考 {@link NET_CTRL_RECORDSET_PARAM}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_DEV_RECORDSET_EX      = 0x1572;

	/**
	 * \if ENGLISH_LANG
	 * Get door locker software version, refer to {@link NET_ACCESS_LOCK_VER}
	 * \else
	 * 获取门锁软件版本号, 取值参考 {@link NET_ACCESS_LOCK_VER}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_ACCESS_LOCK_VER       = 0x1573;

	/**
	 * \if ENGLISH_LANG
	 * get monitorwall TV info, refer to {@link NET_CTRL_MONITORWALL_TVINFO}
	 * \else
	 * 获取电视墙显示信息, 取值参考 {@link NET_CTRL_MONITORWALL_TVINFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_MONITORWALL_TVINFO    = 0x1574;

	/**
	 * \if ENGLISH_LANG
	 * get all configuration of users's Pos devices, refer to {@link NET_POS_ALL_INFO}
	 * \else
	 * 获取所有用户可用Pos设备配置信息, 取值参考 {@link NET_POS_ALL_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_GET_ALL_POS           = 0x1575;

	/**
	 * \if ENGLISH_LANG
	 * get city and road code info, refer to {@link NET_ROAD_LIST_INFO}
	 * \else
	 * 获取城市及路段编码信息 取值参考 {@link NET_ROAD_LIST_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_GET_ROAD_LIST         = 0x1576;

	/**
	 * \if ENGLISH_LANG
	 * get wireless device work state, refer to {@link NET_GET_WIRELESS_DEVICE_STATE}
	 * \else
	 * 获取无线设备状态信息, 取值参考 {@link NET_GET_WIRELESS_DEVICE_STATE}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_GET_WIRESSLESS_STATE  = 0x1579;


	/**
	 * \if ENGLISH_LANG
	 *  get accessory status, refer to {@link NET_GET_ACCESSORY_STATUS}
	 * \else
	 * 获取配件状态{@link NET_GET_ACCESSORY_STATUS}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_GET_ACCESSORY_STATUS  = 0x157b;


	/**
	 * \if ENGLISH_LANG
	 *  get UPnP mapping status, refer to {@link NET_GET_UPNPSTATUS_INFO}
	 * \else
	 * 获取UPnP映射状态{@link NET_GET_UPNPSTATUS_INFO}
	 * \endif
	 */
	public static final int SDK_DEVSTATE_GET_UPNP_STATUS  = 0x157f;

	///////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * \if ENGLISH_LANG
	 * Mail address max length
	 * \else
	 * 邮件发(收)地址最大长度
	 * \endif
	 */
	public static final int SDK_MAX_MAIL_ADDR_LEN                = 128;

	/**
	 * \if ENGLISH_LANG
	 * Mail subject max length
	 * \else
	 * 邮件主题最大长度
	 * \endif
	 */
	public static final int SDK_MAX_MAIL_SUBJECT_LEN             = 64;

	/**
	 * \if ENGLISH_LANG
	 * IP Filtering configuration，IP
	 * \else
	 * IP过滤功能配置，IP
	 * \endif
	 */
	public static final int SDK_IPIFILTER_NUM                    = 200;

	/**
	 * \if ENGLISH_LANG
	 * IP Filtering configuration，IP
	 * \else
	 * IP过滤功能配置，IP
	 * \endif
	 */
	public static final int SDK_IPIFILTER_NUM_EX                 = 512;

	/**
	 * \if ENGLISH_LANG
	 * IP address string length
	 * \else
	 * IP地址字符串长度
	 * \endif
	 */
	public static final int SDK_MAX_IPADDR_LEN                   = 16;

	/**
	 * \if ENGLISH_LANG
	 * extension Ip address support IPV6
	 * \else
	 * 扩展IP地址字符串长度, 支持IPV6
	 * \endif
	 */
	public static final int SDK_MAX_IPADDR_LEN_EX                = 40;

	/**
	 * \if ENGLISH_LANG
	 * MACE address string length
	 * \else
	 * MAC地址字符串长度
	 * \endif
	 */
	public static final int SDK_MACADDR_LEN                      = 40;

	/**
	 * \if ENGLISH_LANG
	 * URL string length
	 * \else
	 * URL字符串长度
	 * \endif
	 */
	public static final int SDK_MAX_URL_LEN                      = 128;

	/**
	 * \if ENGLISH_LANG
	 * Device serial number max length
	 * \else
	 * 机器编号最大长度
	 * \endif
	 */
	public static final int SDK_MAX_DEV_ID_LEN                   = 48;

	/**
	 * \if ENGLISH_LANG
	 * Host name length
	 * \else
	 * 主机名长度
	 * \endif
	 */
	public static final int SDK_MAX_HOST_NAMELEN                 = 64;

	/**
	 * \if ENGLISH_LANG
	 * Password length
	 * \else
	 * 密码长度
	 * \endif
	 */
	public static final int SDK_MAX_HOST_PSWLEN                  = 32;

	/**
	 * \if ENGLISH_LANG
	 * Universal name string length
	 * \else
	 * 通用名字字符串长度
	 * \endif
	 */
	public static final int SDK_MAX_NAME_LEN                     = 16;

	/**
	 * \if ENGLISH_LANG
	 * Ethernet max amount
	 * \else
	 * 以太网口最大个数
	 * \endif
	 */
	public static final int SDK_MAX_ETHERNET_NUM                 = 2;

	/**
	 * \if ENGLISH_LANG
	 * Extended ethernet max amout
	 * \else
	 * 扩展以太网口最大个数
	 * \endif
	 */
	public static final int SDK_MAX_ETHERNET_NUM_EX              = 10;

	/**
	 * \if ENGLISH_LANG
	 * Serial number string length
	 * \else
	 * 序列号字符串长度
	 * \endif
	 */
	public static final int SDK_DEV_SERIALNO_LEN                 = 48;

	/**
	 * \if ENGLISH_LANG
	 * Device type string length
	 * \else
	 * 设备类型字符串长度
	 * \endif
	 */
	public static final int SDK_DEV_TYPE_LEN                     = 32;

	/**
	 * \if ENGLISH_LANG
	 * The days in one week
	 * \else
	 * 一周的天数
	 * \endif
	 */
	public static final int SDK_N_WEEKS                          = 7;

	/**
	 * \if ENGLISH_LANG
	 * Time period amount
	 * \else
	 * 通用时间段个数
	 * \endif
	 */
	public static final int SDK_N_TSECT                          = 6;

	/**
	 * \if ENGLISH_LANG
	 * Record period amount
	 * \else
	 * 录像时间段个数
	 * \endif
	 */
	public static final int SDK_N_REC_TSECT                      = 6;

	/**
	 * \if ENGLISH_LANG
	 * Color period amount
	 * \else
	 * 颜色时间段个数
	 * \endif
	 */
	public static final int SDK_N_COL_TSECT                      = 2;

	/**
	 * \if ENGLISH_LANG
	 * Channel name lengh. DVR DSP capacity limit. Max 32 bytes.
	 * \else
	 * 通道名长度，DVR DSP能力限制，最多32字节
	 * \endif
	 */
	public static final int SDK_CHAN_NAME_LEN                    = 32;

	/**
	 * \if ENGLISH_LANG
	 * Extra stream amount
	 * \else
	 * 扩展码流个数
	 * \endif
	 */
	public static final int SDK_N_ENCODE_AUX                     = 3;

	/**
	 * \if ENGLISH_LANG
	 * Max audio talk channel amount
	 * \else
	 * 最多对讲通道个数
	 * \endif
	 */
	public static final int SDK_N_TALK                           = 1;

	/**
	 * \if ENGLISH_LANG
	 * Privacy mask zone amount
	 * \else
	 * 遮挡区域个数
	 * \endif
	 */
	public static final int SDK_N_COVERS                         = 1;

	/**
	 * \if ENGLISH_LANG
	 * Max channel amount
	 * \else
	 * 最大通道个数
	 * \endif
	 */
	public static final int SDK_N_CHANNEL                        = 16;

	/**
	 * \if ENGLISH_LANG
	 * Alarm prompt period amount
	 * \else
	 * 报警提示时间段个数
	 * \endif
	 */
	public static final int SDK_N_ALARM_TSECT                    = 2;

	/**
	 * \if ENGLISH_LANG
	 * Alarm output ports max amount
	 * \else
	 * 报警输出口个数上限
	 * \endif
	 */
	public static final int SDK_MAX_ALARMOUT_NUM                 = 16;

	/**
	 * \if ENGLISH_LANG
	 * Audio input ports max amount
	 * \else
	 * 音频输入口个数上限
	 * \endif
	 */
	public static final int SDK_MAX_AUDIO_IN_NUM                 = 16;

	/**
	 * \if ENGLISH_LANG
	 * Video input ports max amount
	 * \else
	 * 视频输入口个数上限
	 * \endif
	 */
	public static final int SDK_MAX_VIDEO_IN_NUM                 = 16;

	/**
	 * \if ENGLISH_LANG
	 * Alarm input ports max amount
	 * \else
	 * 报警输入口个数上限
	 * \endif
	 */
	public static final int SDK_MAX_ALARM_IN_NUM                 = 16;

	/**
	 * \if ENGLISH_LANG
	 * HDD max amount. Now the value is 16.
	 * \else
	 * 硬盘个数上限，暂定为16
	 * \endif
	 */
	public static final int SDK_MAX_DISK_NUM                     = 16;

	/**
	 * \if ENGLISH_LANG
	 * Decoder(485) max amount
	 * \else
	 * 解码器(485)个数上限
	 * \endif
	 */
	public static final int SDK_MAX_DECODER_NUM                  = 16;

	/**
	 * \if ENGLISH_LANG
	 * 232 COM function max amount
	 * \else
	 * 232串口功能个数上限
	 * \endif
	 */
	public static final int SDK_MAX_232FUNCS                     = 10;

	/**
	 * \if ENGLISH_LANG
	 * 232 COM port max amount
	 * \else
	 * 232串口个数上限
	 * \endif
	 */
	public static final int SDK_MAX_232_NUM                      = 2;

	/**
	 * \if ENGLISH_LANG
	 * Extended 232 COM port max amount
	 * \else
	 * 扩展串口配置个数上限
	 * \endif
	 */
	public static final int SDK_MAX_232_NUM_EX                   = 16;

	/**
	 * \if ENGLISH_LANG
	 * Decoder protocol list max amount
	 * \else
	 * 解码器协议列表个数上限
	 * \endif
	 */
	public static final int SDK_MAX_DECPRO_LIST_SIZE             = 100;

	/**
	 * \if ENGLISH_LANG
	 * FTP file folder max length
	 * \else
	 * FTP文件目录最大长度
	 * \endif
	 */
	public static final int SDK_FTP_MAXDIRLEN                    = 240;

	/**
	 * \if ENGLISH_LANG
	 * Matrix output ports max amount
	 * \else
	 * 矩阵输出口最大个数
	 * \endif
	 */
	public static final int SDK_MATRIX_MAXOUT                    = 16;

	/**
	 * \if ENGLISH_LANG
	 * Matrix output ports max amount
	 * \else
	 * 矩阵输出组最大个数
	 * \endif
	 */
	public static final int SDK_TOUR_GROUP_NUM                   = 6;

	/**
	 * \if ENGLISH_LANG
	 * Ddns max amount the device supported
	 * \else
	 * 设备支持的ddns服务器最大个数
	 * \endif
	 */
	public static final int SDK_MAX_DDNS_NUM                     = 10;

	/**
	 * \if ENGLISH_LANG
	 * Ddns type and max string length
	 * \else
	 * ddns服务器类型，最大字符串长度
	 * \endif
	 */
	public static final int SDK_MAX_SERVER_TYPE_LEN              = 32;

	/**
	 * \if ENGLISH_LANG
	 * Ddns domain name and max string length
	 * \else
	 * ddns域名，最大字符串长度
	 * \endif
	 */
	public static final int SDK_MAX_DOMAIN_NAME_LEN              = 256;

	/**
	 * \if ENGLISH_LANG
	 * Ddns alias and max string length
	 * \else
	 * ddns服务器别名，最大字符串长度
	 * \endif
	 */
	public static final int SDK_MAX_DDNS_ALIAS_LEN               = 32;

	/**
	 * \if ENGLISH_LANG
	 * Ddns default domain, max sring length
	 * \else
	 * dns默认域名，最大字符串长度
	 * \endif
	 */
	public static final int SDK_MAX_DEFAULT_DOMAIN_LEN           = 60;

	/**
	 * \if ENGLISH_LANG
	 * Motion detection zone row amount
	 * \else
	 * 动态检测区域的行数
	 * \endif
	 */
	public static final int SDK_MOTION_ROW                       = 32;

	/**
	 * \if ENGLISH_LANG
	 * Motion detection zone column amount
	 * \else
	 * 动态检测区域的列数
	 * \endif
	 */
	public static final int SDK_MOTION_COL                       = 32;

	/**
	 * \if ENGLISH_LANG
	 * Static detection zone row amount
	 * \else
	 * 静态检测区域的行数
	 * \endif
	 */
	public static final int SDK_STATIC_ROW                       = 32;

	/**
	 * \if ENGLISH_LANG
	 * Static detection zone column amount
	 * \else
	 * 静态检测区域的列数
	 * \endif
	 */
	public static final int SDK_STATIC_COL                       = 32;

	/**
	 * \if ENGLISH_LANG
	 * FTP setup:user name max lengh
	 * \else
	 * FTP配置，用户名最大长度
	 * \endif
	 */
	public static final int SDK_FTP_USERNAME_LEN                 = 64;

	/**
	 * \if ENGLISH_LANG
	 * FTP setup:password max length
	 * \else
	 * FTP配置，密码最大长度
	 * \endif
	 */
	public static final int SDK_FTP_PASSWORD_LEN                 = 64;

	/**
	 * \if ENGLISH_LANG
	 * FTP setup:time periods in each day.
	 * \else
	 * FTP配置，每天时间段个数
	 * \endif
	 */
	public static final int SDK_TIME_SECTION                     = 2;

	/**
	 * \if ENGLISH_LANG
	 * FTP setup:file path max length
	 * \else
	 * FTP配置，文件路径名最大长度
	 * \endif
	 */
	public static final int SDK_FTP_MAX_PATH                     = 240;

	/**
	 * \if ENGLISH_LANG
	 * FTP setup:sub path max lenth
	 * \else
	 * FTP配置，文件路径名最大长度
	 * \endif
	 */
	public static final int SDK_FTP_MAX_SUB_PATH                 = 128;

	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup:channel ID
	 * \else
	 * 平台接入配置，UWT通道ID
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_UCOM_CHANID           = 32;

	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup:device ID
	 * \else
	 * 平台接入配置，UWT设备ID
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_UCOM_DEVID            = 32;

	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup:registration password
	 * \else
	 * 平台接入配置，UWT注册密码
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_UCOM_REGPSW           = 16;

	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup:user name
	 * \else
	 * 平台接入配置，UWT用户名
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_UCOM_USERNAME         = 32;

	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup: password
	 * \else
	 * 平台接入配置，UWT密码
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_UCOM_USERPSW          = 32;

	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup:ARGzx Netview IP
	 * \else
	 * 平台接入配置，ARGzxLWIP
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_NSS_IP                = 32;

	/**
	 * \if ENGLISH_LANG
	 * Serial Platform embedded setup:ARGzx Netview  serial
	 * \else
	 * 平台接入配置，ARGzxLWserial
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_NSS_SERIAL            = 32;

	/**
	 * \if ENGLISH_LANG
	 * User Platform embedded setup:ARGzx Netview user
	 * \else
	 * 平台接入配置，ARGzxLWuser
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_NSS_USER              = 32;

	/**
	 * \if ENGLISH_LANG
	 * Password Platform embedded setup:ARGzx Netview password
	 * \else
	 * 平台接入配置，ARGzxLWpassword
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_NSS_PWD               = 50;

	/**
	 * \if ENGLISH_LANG
	 * Privacy mask zones max amount
	 * \else
	 * 遮挡区域最大个数
	 * \endif
	 */
	public static final int SDK_MAX_VIDEO_COVER_NUM              = 16;

	/**
	 * \if ENGLISH_LANG
	 * Watermark data max length
	 * \else
	 * 水印图片数据最大长度
	 * \endif
	 */
	public static final int SDK_MAX_WATERMAKE_DATA               = 4096;

	/**
	 * \if ENGLISH_LANG
	 * Watermark text max length
	 * \else
	 * 水印文字最大长度
	 * \endif
	 */
	public static final int SDK_MAX_WATERMAKE_LETTER             = 128;

	/**
	 * \if ENGLISH_LANG
	 * Max searched wireless device amount
	 * \else
	 * 最多搜索出的无线设备个数
	 * \endif
	 */
	public static final int SDK_MAX_WLANDEVICE_NUM               = 10;

	/**
	 * \if ENGLISH_LANG
	 * Max searched wireless device amount
	 * \else
	 * 最多搜索出的无线设备个数
	 * \endif
	 */
	public static final int SDK_MAX_WLANDEVICE_NUM_EX            = 32;


	/**
	 * \if ENGLISH_LANG
	 * Max real searched wirele device amount
	 * \else
	 * 最多搜索出的无线设备个数
	 * \endif
	 */
	public static final int MAX_WLAN_DEVICE_NUM            = 128;

	/**
	 * \if ENGLISH_LANG
	 * Address length
	 * \else
	 * 地址长度
	 * \endif
	 */
	public static final int SDK_MAX_ALARM_NAME                   = 64;

	/**
	 * \if ENGLISH_LANG
	 * Auto registration server amount
	 * \else
	 * 主动注册服务器个数
	 * \endif
	 */
	public static final int SDK_MAX_REGISTER_SERVER_NUM          = 10;

	/**
	 * \if ENGLISH_LANG
	 * 6 FRAME ID options
	 * \else
	 * 6个FRAME ID 选项
	 * \endif
	 */
	public static final int SDK_SNIFFER_FRAMEID_NUM              = 6;

	/**
	 * \if ENGLISH_LANG
	 * 4 sniffer in each FRAME
	 * \else
	 * 每个FRAME对应的4个抓包内容
	 * \endif
	 */
	public static final int SDK_SNIFFER_CONTENT_NUM              = 4;

	/**
	 * \if ENGLISH_LANG
	 * 8 sniffer in each FRAME
	 * \else
	 * 每个FRAME对应的8个抓包内容
	 * \endif
	 */
	public static final int SDK_SNIFFER_CONTENT_NUM_EX           = 8;

	/**
	 * \if ENGLISH_LANG
	 * Protocol length
	 * \else
	 * 协议名字长度
	 * \endif
	 */
	public static final int SDK_SNIFFER_PROTOCOL_SIZE            = 20;

	/**
	 * \if ENGLISH_LANG
	 * 4 group sniffer setup
	 * \else
	 * 端口序号
	 * \endif
	 */
	public static final int SDK_MAX_PROTOCOL_NAME_LENGTH         = 20;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 4组抓包设置
	 * \endif
	 */
	public static final int SDK_SNIFFER_GROUP_NUM                = 4;

	/**
	 * \if ENGLISH_LANG
	 * Remote folder length
	 * \else
	 * 远程目录的长度
	 * \endif
	 */
	public static final int MAX_PATH_STOR                       = 240;

	/**
	 * \if ENGLISH_LANG
	 * New alarm upload time length
	 * \else
	 * 新的报警上传时间的长度
	 * \endif
	 */
	public static final int SDK_ALARM_OCCUR_TIME_LEN             = 40;

	/**
	 * \if ENGLISH_LANG
	 * Overlay name length. Now it supports 32-digit English and 16-digit Chinese
	 * \else
	 * 叠加的名称长度，目前支持32个英文，16个中文
	 * \endif
	 */
	public static final int SDK_VIDEO_OSD_NAME_NUM               = 64;

	/**
	 * \if ENGLISH_LANG
	 * The self-defined amount supported excluding time and channel
	 * \else
	 * 支持的自定义叠加的数目，不包含时间和通道
	 * \endif
	 */
	public static final int SDK_VIDEO_CUSTOM_OSD_NUM             = 8;

	/**
	 * \if ENGLISH_LANG
	 * Targeted initiatives to support the number of registration servers
	 * \else
	 * 支持定向主动注册服务器的个数
	 * \endif
	 */
	public static final int SDK_CONTROL_AUTO_REGISTER_NUM        = 100;

	/**
	 * \if ENGLISH_LANG
	 * Support the number of messages the recipient
	 * \else
	 * 支持短信接收者的个数
	 * \endif
	 */
	public static final int SDK_MMS_RECEIVER_NUM                 = 100;

	/**
	 * \if ENGLISH_LANG
	 * Support the number of SMS sender
	 * \else
	 * 支持短信发送者的个数
	 * \endif
	 */
	public static final int SDK_MMS_SMSACTIVATION_NUM            = 100;

	/**
	 * \if ENGLISH_LANG
	 * Support for dial-up number of the sender
	 * \else
	 * 支持拨号发送者的个数
	 * \endif
	 */
	public static final int SDK_MMS_DIALINACTIVATION_NUM         = 100;

	/**
	 * \if ENGLISH_LANG
	 * Alarm output amount max limit
	 * \else
	 * 报警输出口个数上限扩展
	 * \endif
	 */
	public static final int SDK_MAX_ALARMOUT_NUM_EX              = 32;

	/**
	 * \if ENGLISH_LANG
	 * Video input amount max limit
	 * \else
	 * 视频输入口个数上限扩展
	 * \endif
	 */
	public static final int SDK_MAX_VIDEO_IN_NUM_EX              = 32;

	/**
	 * \if ENGLISH_LANG
	 * Alarm input amount max limit
	 * \else
	 * 报警输入口个数上限
	 * \endif
	 */
	public static final int SDK_MAX_ALARM_IN_NUM_EX              = 32;

	/**
	 * \if ENGLISH_LANG
	 * IP or domain name length
	 * \else
	 * IP地址字符串长度
	 * \endif
	 */
	public static final int SDK_MAX_IPADDR_OR_DOMAIN_LEN         = 64;

	/**
	 * \if ENGLISH_LANG
	 * The upper limit number of object id that detected by device in intelligent analysis
	 * \else
	 * 智能分析设备检测到的物体ID个数上限
	 * \endif
	 */
	public static final int SDK_MAX_OBJECT_LIST                  = 16;

	/**
	 * \if ENGLISH_LANG
	 * The upper limit number of device rule in intelligent analysis
	 * \else
	 * 智能分析设备规则个数上限
	 * \endif
	 */
	public static final int SDK_MAX_RULE_LIST                    = 16;

	/**
	 * \if ENGLISH_LANG
	 * The max number of polygon's culmination
	 * \else
	 * 多边形最大顶点个数
	 * \endif
	 */
	public static final int SDK_MAX_POLYGON_NUM                  = 16;

	/**
	 * \if ENGLISH_LANG
	 * Rule detect line's max point number
	 * \else
	 * 规则检测线最大顶点数
	 * \endif
	 */
	public static final int SDK_MAX_DETECT_LINE_NUM              = 20;

	/**
	 * \if ENGLISH_LANG
	 * Rule detect region's max point number
	 * \else
	 * 规则检测区域最大顶点数
	 * \endif
	 */
	public static final int SDK_MAX_DETECT_REGION_NUM            = 20;

	/**
	 * \if ENGLISH_LANG
	 * Object moving track's max point number
	 * \else
	 * 物体运动轨迹最大顶点数
	 * \endif
	 */
	public static final int SDK_MAX_TRACK_LINE_NUM               = 20;

	/**
	 * \if ENGLISH_LANG
	 * Max candidate number
	 * \else
	 * 目标识别最大匹配数
	 * \endif
	 */
	public static final int SDK_MAX_CANDIDATE_NUM                = 50;

	/**
	 * \if ENGLISH_LANG
	 * Max image of ervery person
	 * \else
	 * 每个人员对应的最大目标图片数
	 * \endif
	 */
	public static final int SDK_MAX_PERSON_IMAGE_NUM             = 48;

	/**
	 * \if ENGLISH_LANG
	 * Max fance line number
	 * \else
	 * 围栏最大曲线数
	 * \endif
	 */
	public static final int SDK_MAX_FENCE_LINE_NUM               = 2;

	/**
	 * \if ENGLISH_LANG
	 * The max number of smart disk information
	 * \else
	 * 最多的smart信息个数
	 * \endif
	 */
	public static final int MAX_SMART_VALUE_NUM                 = 30;

	/**
	 * \if ENGLISH_LANG
	 * Device name length
	 * \else
	 * 机器名称长度
	 * \endif
	 */
	public static final int SDK_MACHINE_NAME_NUM                 = 64;

	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup, AMP,Device serial num length
	 * \else
	 * 平台接入配置，TDYG 设备序列号字符串长度
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_AMP_DEVICESERIAL      = 48;

	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup, AMP,Device Name length
	 * \else
	 * 平台接入配置，TDYG 设备名称字符串长度
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_AMP_DEVICENAME        = 16;

	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup, AMP,User Name Length
	 * \else
	 * 平台接入配置，TDYG 注册用户名字符串长度
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_AMP_USER              = 32;

	/**
	 * \if ENGLISH_LANG
	 * Platform embedded setup, AMP,password length
	 * \else
	 * 平台接入配置，TDYG 注册密码字符串长度
	 * \endif
	 */
	public static final int SDK_INTERVIDEO_AMP_PWD               = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max number of submodule infomation
	 * \else
	 * 最多子模块信息个数
	 * \endif
	 */
	public static final int MAX_SUBMODULE_NUM                   = 32;

	/**
	 * \if ENGLISH_LANG
	 * Traffic snapshot,the max car way number
	 * \else
	 * 交通抓拍，最大车道数
	 * \endif
	 */
	public static final int SDK_MAX_CARWAY_NUM                   = 8;

	/**
	 * \if ENGLISH_LANG
	 * One car way max time for snapshot
	 * \else
	 * 一个车道的最大抓拍张数
	 * \endif
	 */
	public static final int SDK_MAX_SNAP_SIGNAL_NUM              = 3;

	/**
	 * \if ENGLISH_LANG
	 * Max number of card
	 * \else
	 * 卡号的最大个数
	 * \endif
	 */
	public static final int SDK_MAX_CARD_NUM                     = 128;

	/**
	 * \if ENGLISH_LANG
	 * Max lenth of card infomation
	 * \else
	 * 每条卡号最长字符数
	 * \endif
	 */
	public static final int SDK_MAX_CARDINFO_LEN                 = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max supported controller number
	 * \else
	 * 最大支持控制器数目
	 * \endif
	 */
	public static final int SDK_MAX_CONTROLER_NUM                = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max control light group number
	 * \else
	 * 最多控制灯组数
	 * \endif
	 */
	public static final int SDK_MAX_LIGHT_NUM                    = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max Snmp read or write buffer
	 * \else
	 * snmp 读写数据长度
	 * \endif
	 */
	public static final int SDK_MAX_SNMP_COMMON_LEN              = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max DDNS state buffer
	 * \else
	 * DDNS 状态信息长度
	 * \endif
	 */
	public static final int SDK_MAX_DDNS_STATE_LEN               = 128;

	/**
	 * \if ENGLISH_LANG
	 * Max phone len
	 * \else
	 * 电话号码长度
	 * \endif
	 */
	public static final int SDK_MAX_PHONE_NO_LEN                 = 16;

	/**
	 * \if ENGLISH_LANG
	 * Max type len
	 * \else
	 * 导航类型或短信息类型长度
	 * \endif
	 */
	public static final int SDK_MAX_MSGTYPE_LEN                  = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max message len
	 * \else
	 * 导航和短信息长度
	 * \endif
	 */
	public static final int SDK_MAX_MSG_LEN                      = 256;

	/**
	 * \if ENGLISH_LANG
	 * Max drivingdirection len
	 * \else
	 * 行驶方向字符串长度
	 * \endif
	 */
	public static final int SDK_MAX_DRIVINGDIRECTION             = 256;

	/**
	 * \if ENGLISH_LANG
	 * Max snapshot count
	 * \else
	 * 多张图片抓拍个数
	 * \endif
	 */
	public static final int SDK_MAX_GRAB_INTERVAL_NUM            = 4;

	/**
	 * \if ENGLISH_LANG
	 * Max flash count
	 * \else
	 * 最多支持闪光灯个数
	 * \endif
	 */
	public static final int SDK_MAX_FLASH_NUM                    = 5;

	/**
	 * \if ENGLISH_LANG
	 * Max number of road in every channel
	 * \else
	 * 视频分析设备每个通道对应车道数上限
	 * \endif
	 */
	public static final int SDK_MAX_LANE_NUM                     = 8;

	/**
	 * \if ENGLISH_LANG
	 * Max ISCSI remote path number
	 * \else
	 * ISCSI远程目录最大数量
	 * \endif
	 */
	public static final int SDK_MAX_ISCSI_PATH_NUM               = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max wireless channel number
	 * \else
	 * 无线路由最大信道数
	 * \endif
	 */
	public static final int SDK_MAX_WIRELESS_CHN_NUM             = 256;

	/**
	 * \if ENGLISH_LANG
	 * Protocol 3 base value
	 * \else
	 * 三代协议版本基数
	 * \endif
	 */
	public static final int SDK_PROTOCOL3_BASE                   = 100;

	/**
	 * \if ENGLISH_LANG
	 * Prococol 3 support
	 * \else
	 * 只支持3代协议
	 * \endif
	 */
	public static final int SDK_PROTOCOL3_SUPPORT                = 11;

	/**
	 * \if ENGLISH_LANG
	 * Max channel mask
	 * \else
	 * 通道掩码最大值
	 * \endif
	 */
	public static final int SDK_MAX_CHANMASK                     = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max of compressed video configuration staff number
	 * \else
	 * 浓缩视频配置信息中标尺数上限
	 * \endif
	 */
	public static final int SDK_MAX_STAFF_NUM                    = 20;

	/**
	 * \if ENGLISH_LANG
	 * Max of compressed video configuration calibrate region
	 * \else
	 * 浓缩视频配置信息中标定区域数上限
	 * \endif
	 */
	public static final int SDK_MAX_CALIBRATEBOX_NUM             = 10;

	/**
	 * \if ENGLISH_LANG
	 * Max of compressed video configuration exclude region
	 * \else
	 * 浓缩视频配置信息中排除区域数上限
	 * \endif
	 */
	public static final int SDK_MAX_EXCLUDEREGION_NUM            = 10;

	/**
	 * \if ENGLISH_LANG
	 * Number of compressed video configuration poly line
	 * \else
	 * 浓缩视频配置信息中标尺线数
	 * \endif
	 */
	public static final int SDK_MAX_POLYLINE_NUM                 = 20;

	/**
	 * \if ENGLISH_LANG
	 * Color maximum number
	 * \else
	 * 最大颜色数目
	 * \endif
	 */
	public static final int SDK_MAX_COLOR_NUM                    = 16;

	/**
	 * \if ENGLISH_LANG
	 * Max number of  filter type
	 * \else
	 * 最大过滤种类个数
	 * \endif
	 */
	public static final int MAX_OBJFILTER_NUM                   = 16;

	/**
	 * \if ENGLISH_LANG
	 * String state length of compressed video
	 * \else
	 * 视频浓缩状态字符串长度
	 * \endif
	 */
	public static final int SDK_MAX_SYNOPSIS_STATE_NAME          = 64;

	/**
	 * \if ENGLISH_LANG
	 * The file number limit
	 * \else
	 * 视频浓缩相关原始文件按照路径查找时文件个数上限
	 * \endif
	 */
	public static final int SDK_MAX_SYNOPSIS_QUERY_FILE_COUNT    = 10;

	/**
	 * \if ENGLISH_LANG
	 * Length of SSID
	 * \else
	 * SSID长度
	 * \endif
	 */
	public static final int SDK_MAX_SSID_LEN                     = 36;

	/**
	 * \if ENGLISH_LANG
	 * Length of PIN
	 * \else
	 * PIN码长度
	 * \endif
	 */
	public static final int SDK_MAX_APPIN_LEN                    = 16;

	/**
	 * \if ENGLISH_LANG
	 * Length of net port
	 * \else
	 * 网口名称长度
	 * \endif
	 */
	public static final int SDK_NETINTERFACE_NAME_LEN            = 260;

	/**
	 * \if ENGLISH_LANG
	 * Length of net type
	 * \else
	 * 网络类型长度
	 * \endif
	 */
	public static final int SDK_NETINTERFACE_TYPE_LEN            = 260;

	/**
	 * \if ENGLISH_LANG
	 * Length of connect status
	 * \else
	 * 连接状态字符串长度
	 * \endif
	 */
	public static final int SDK_MAX_CONNECT_STATUS_LEN           = 260;

	/**
	 * \if ENGLISH_LANG
	 * Length of 3G mode support
	 * \else
	 * 3G支持的网络模式长度
	 * \endif
	 */
	public static final int SDK_MAX_MODE_LEN                     = 64;

	/**
	 * \if ENGLISH_LANG
	 * Number of 3G mode support
	 * \else
	 * 3G支持的网络模式个数
	 * \endif
	 */
	public static final int SDK_MAX_MODE_NUM                     = 64;

	/**
	 * \if ENGLISH_LANG
	 * max number of video compression types
	 * \else
	 * 视频编码格式最多种类个数
	 * \endif
	 */
	public static final int SDK_MAX_COMPRESSION_TYPES_NUM        = 16;

	/**
	 * \if ENGLISH_LANG
	 * Number of video resolution
	 * \else
	 * 视频分辨率个数
	 * \endif
	 */
	public static final int SDK_MAX_CAPTURE_SIZE_NUM             = 64;

	/**
	 * \if ENGLISH_LANG
	 * Length of node name
	 * \else
	 * 组织结构节点名称长度
	 * \endif
	 */
	public static final int SDK_NODE_NAME_LEN                    = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max number of point support
	 * \else
	 * 支持最大标定点数
	 * \endif
	 */
	public static final int MAX_CALIBPOINTS_NUM                 = 256;

	/**
	 * \if ENGLISH_LANG
	 * The maximum number display element attributes
	 * \else
	 * 显示单元属性最大数量
	 * \endif
	 */
	public static final int SDK_MAX_ATTR_NUM                     = 32;

	/**
	 * \if ENGLISH_LANG
	 * Length of cloud connect state
	 * \else
	 * 云注册连接状态信息长度
	 * \endif
	 */
	public static final int SDK_MAX_CLOUDCONNECT_STATE_LEN       = 128;

	/**
	 * \if ENGLISH_LANG
	 * max gateway control method
	 * \else
	 * 最大道闸控制方式
	 * \endif
	 */
	public static final int NET_CFG_MAX_CTRLTYPE_NUM                = 16;

	/**
	 * \if ENGLISH_LANG
	 * All snap car class count
	 * \else
	 * 所有车开闸种类个数
	 * \endif
	 */
	public static final int NET_MAX_ALL_SNAP_CAR_COUNT                = 32;

	/**
	 * \if ENGLISH_LANG
	 * IP entended maximum length
	 * \else
	 * 扩展IP地址最大长度
	 * \endif
	 */
	public static final int SDK_MAX_IPADDR_EX_LEN                = 128;

	/**
	 * \if ENGLISH_LANG
	 * Plate character length
	 * \else
	 * 车牌字符串长度
	 * \endif
	 */
	public static final int SDK_MAX_PLATE_NUMBER_LEN             = 32;

	/**
	 * \if ENGLISH_LANG
	 * Right list max number
	 * \else
	 * 权限列表最大个数
	 * \endif
	 */
	public static final int SDK_MAX_AUTHORITY_LIST_NUM           = 16;

	/**
	 * \if ENGLISH_LANG
	 * City name max length
	 * \else
	 * 城市名称最大长度
	 * \endif
	 */
	public static final int SDK_MAX_CITY_NAME_LEN                = 64;

	/**
	 * \if ENGLISH_LANG
	 * Province name max length
	 * \else
	 * 省份名称最大长度
	 * \endif
	 */
	public static final int SDK_MAX_PROVINCE_NAME_LEN            = 64;

	/**
	 * \if ENGLISH_LANG
	 * Staff ID max length
	 * \else
	 * 人员id最大长度
	 * \endif
	 */
	public static final int SDK_MAX_PERSON_ID_LEN                = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max face area number
	 * \else
	 * 最大目标区域个数
	 * \endif
	 */
	public static final int MAX_FACE_AREA_NUM                   = 8;

	/**
	 * \if ENGLISH_LANG
	 * Max face database number
	 * \else
	 * 最大目标数据库个数
	 * \endif
	 */
	public static final int MAX_FACE_DB_NUM                     = 8;

	/**
	 * \if ENGLISH_LANG
	 * Max event name
	 * \else
	 * 最长事件名
	 * \endif
	 */
	public static final int MAX_EVENT_NAME                      = 128;

	/**
	 * \if ENGLISH_LANG
	 * Max net card name
	 * \else
	 * 最大网卡名
	 * \endif
	 */
	public static final int SDK_MAX_ETH_NAME                     =  64;

	/**
	 * \if ENGLISH_LANG
	 * Staff name max length
	 * \else
	 * 人员名字最大长度
	 * \endif
	 */
	public static final int SDK_MAX_PERSON_NAME_LEN              = 64;

	/**
	 * \if ENGLISH_LANG
	 * Time table element number
	 * \else
	 * 时间表元素个数
	 * \endif
	 */
	public static final int SDK_N_SCHEDULE_TSECT                 = 8;

	/**
	 * \if ENGLISH_LANG
	 * URL max number
	 * \else
	 * URL最大个数
	 * \endif
	 */
	public static final int SDK_MAX_URL_NUM                      = 8;

	/**
	 * \if ENGLISH_LANG
	 * Max battery quantity
	 * \else
	 * 最大电池数量
	 * \endif
	 */
	public static final int SDK_BATTERY_NUM_MAX                  = 16;

	/**
	 * \if ENGLISH_LANG
	 * Max power quantity
	 * \else
	 * 最大电源数量
	 * \endif
	 */
	public static final int SDK_POWER_NUM_MAX                    = 16;

	/**
	 * \if ENGLISH_LANG
	 * Max audio file path length
	 * \else
	 * 最大音频文件路长度
	 * \endif
	 */
	public static final int SDK_MAX_AUDIO_PATH                   = 260;

	/**
	 * \if ENGLISH_LANG
	 * Max access control name length
	 * \else
	 * 最大门禁名称长度
	 * \endif
	 */
	public static final int SDK_MAX_DOORNAME_LEN                 = 128;

	/**
	 * \if ENGLISH_LANG
	 * Max access control name length
	 * \else
	 * 最大门禁密码长度
	 * \endif
	 */
	public static final int SDK_MAX_CARDPWD_LEN                  = 64;

	/**
	 * \if ENGLISH_LANG
	 * The max length of wireless device SN
	 * \else
	 * 无线设备序列号最大长度
	 * \endif
	 */
	public static final int NET_WIRELESS_DEVICE_SERIAL_NUMBER_MAX_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max fish eye installation mode number
	 * \else
	 * 最大鱼眼安装模式个数
	 * \endif
	 */
	public static final int  NET_MAX_FISHEYE_MOUNTMODE_NUM      = 4;

	/**
	 * \if ENGLISH_LANG
	 * Max fish eye correction mode numer
	 * \else
	 * 最大鱼眼矫正模式个数
	 * \endif
	 */
	public static final int  NET_MAX_FISHEYE_CALIBRATEMODE_NUM  = 16;

	/**
	 * \if ENGLISH_LANG
	 * Max fish eye electronic PTZ operation number
	 * \else
	 * 最大鱼眼电子云台操作个数
	 * \endif
	 */
	public static final int  NET_MAX_FISHEYE_EPTZCMD_NUM        = 64;

	/**
	 * \if ENGLISH_LANG
	 * Point Number in Pair
	 * \else
	 * 标定点对中的点数量
	 * \endif
	 */
	public static final int  POINT_NUM_IN_PAIR                  = 2;

	/**
	 * \if ENGLISH_LANG
	 * Point Max Quantity
	 * \else
	 * 标定点最大数量
	 * \endif
	 */
	public static final int  MAX_POINT_PAIR_NUM                 = 128;

	/**
	 * \if ENGLISH_LANG
	 * Max SIP server info num
	 * \else
	 * 最大的SIP服务器信息个数
	 * \endif
	 */
	public static final int  MAX_SIP_SERVER_NUM                 = 5;

	/**
	 * \if ENGLISH_LANG
	 * Max SIP server ID len
	 * \else
	 * 最大的SIP服务器ID长度
	 * \endif
	 */
	public static final int   MAX_SIP_SVR_ID_LEN				= 24;


	/**
	 * \if ENGLISH_LANG
	 * Max SIP domain len
	 * \else
	 * 最大的SIP域长度
	 * \endif
	 */
	public static final int   MAX_SIP_DOMAIN_LEN				= 128;

	/**
	 * \if ENGLISH_LANG
	 * Max SIP server IP len
	 * \else
	 * 最大的SIP服务器IP长度
	 * \endif
	 */
	public static final int   MAX_SIP_SVR_IP_LEN				= 128;

	/**
	 * \if ENGLISH_LANG
	 * Max device ID len
	 * \else
	 * 最大的设备编号长度
	 * \endif
	 */
	public static final int   MAX_SIP_SERVER_DEVICE_ID_LEN				= 24;

	/**
	 * \if ENGLISH_LANG
	 * Max register password len
	 * \else
	 * 最大的注册密码长度
	 * \endif
	 */
	public static final int   MAX_REG_PASSWORD_LEN				= 24;

	/**
	 * \if ENGLISH_LANG
	 * Max civil code len
	 * \else
	 * 最大的行政区划代码长度
	 * \endif
	 */
	public static final int   MAX_CIVIL_CODE_LEN				= 24;

	/**
	 * \if ENGLISH_LANG
	 * Max intervideo ID len
	 * \else
	 * 最大的接入模块识别码长度
	 * \endif
	 */
	public static final int   MAX_INTERVIDEO_ID_LEN				= 24;

	/**
	 * \if ENGLISH_LANG
	 * Max channel ID len
	 * \else
	 * 最大的通道编号长度
	 * \endif
	 */
	public static final int   MAX_CHANNEL_ID_LEN				= 24;

	/**
	 * \if ENGLISH_LANG
	 * Point Video Channel Number
	 * \else
	 * 标定点中的视频通道数
	 * \endif
	 */
	public static final int  CHANNEL_NUM_IN_POINT_GROUP         = 2;

	/**
	 * \if ENGLISH_LANG
	 * Point Group Max Quantity. Each two channel splicing requires one group of point.
	 * \else
	 * 标定点组最大数量, 每两个通道进行拼接需要一组标定点
	 * \endif
	 */
	public static final int  MAX_POINT_GROUP_NUM                = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max lane info number
	 * \else
	 * 最大车道信息数
	 * \endif
	 */
	public static final int  MAX_LANE_INFO_NUM                  = 32;

	/**
	 * \if ENGLISH_LANG
	 * Lane direction total
	 * \else
	 * 车道方向总数
	 * \endif
	 */
	public static final int  MAX_LANE_DIRECTION_NUM             = 8;

	/**
	 * \if ENGLISH_LANG
	 * TV wall max quantity
	 * \else
	 * 电视墙最大数量
	 * \endif
	 */
	public static final int  SDK_MAX_MONITORWALL_NUM             = 32;

	/**
	 * \if ENGLISH_LANG
	 * Alternate url maxquantity
	 * \else
	 * 备用url最大数量
	 * \endif
	 */
	public static final int  SDK_MAX_OPTIONAL_URL_NUM            = 8;

	/**
	 * \if ENGLISH_LANG
	 * Max channel amount
	 * \else
	 * 最大摄像机通道数
	 * \endif
	 */
	public static final int  SDK_MAX_CAMERA_CHANNEL_NUM         = 1024;

	/**
	 * \if ENGLISH_LANG
	 * Max file summary amount
	 * \else
	 * 最大文件摘要数
	 * \endif
	 */
	public static final int  MAX_FILE_SUMMARY_NUM               = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max audio encode amount
	 * \else
	 * 最大支持音频编码个数
	 * \endif
	 */
	public static final int  MAX_AUDIO_ENCODE_NUM               = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max Door Number
	 * \else
	 * 最大有权限门禁数目
	 * \endif
	 */
	public static final int SDK_MAX_DOOR_NUM                     = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max Time Section Number
	 * \else
	 * 最大有效时间段数目
	 * \endif
	 */
	public static final int SDK_MAX_TIMESECTION_NUM              = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max Card-Number Len
	 * \else
	 * 门禁卡号最大长度
	 * \endif
	 */
	public static final int SDK_MAX_CARDNO_LEN                   = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max User ID Len
	 * \else
	 * 门禁卡用户ID最大长度
	 * \endif
	 */
	public static final int SDK_MAX_USERID_LEN                    = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max QRCode len
	 * \else
	 * QRCode 最大长度
	 * \endif
	 */
	public static final int SDK_MAX_QRCODE_LEN			           = 128;

	/**
	 * \if ENGLISH_LANG
	 * User name length
	 * \else
	 * 用户名长度
	 * \endif
	 */
	public static final int     SDK_USER_NAME_LENGTH_EX 		   = 16;

	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * 密码
	 * \endif
	 */
	public static final int     SDK_USER_PSW_LENGTH_EX 			= 16;

	/**
	 * \if ENGLISH_LANG
	 * Max bell number
	 * \else
	 *  最大警号个数
	 * \endif
	 */
	public static final int     SDK_MAX_BELL_NUM 				   = 4;

	/**
	 * \if ENGLISH_LANG
	 * Max keyboard num
	 * \else
	 * 最大键盘数
	 * \endif
	 */
	public static final int     SDK_MAX_KEYBOARD_NUM  		       =  256;

	/**
	 * \if ENGLISH_LANG
	 * Max user right amount
	 * \else
	 * 用户权限个数上限
	 * \endif
	 */
	public static final int     SDK_NEW_MAX_RIGHT_NUM     	       = 1024;

	/**
	 * \if ENGLISH_LANG
	 * Max Alarm Sub System Number
	 * \else
	 * 最大报警子系统个数
	 * \endif
	 */
	public static final int 	SDK_MAX_ALARM_SUBSYSTEM_NUM        = 256;

	/**
	 * \if ENGLISH_LANG
	 * number of normal event
	 * \else
	 * 非智能事件数量
	 * \endif
	 */
	public static final int MAX_SUPPORT_EVENT_NUM = 10;

	/**
	 * \if ENGLISH_LANG
	 * number of intelligent scene
	 * \else
	 * 智能事件数量
	 * \endif
	 */
	public static final int MAX_SUPPORT_INTELLISCENE_NUM = 40;

	/**
	 * \if ENGLISH_LANG
	 * Max light setting information list number
	 * \else
	 * 灯光设置信息列表Z最大个数
	 * \endif
	 */
	public static final int MAX_LIGHTING_DETAIL_NUM = 16;

	/**
	 * \if ENGLISH_LANG
	 * Max lighting list number
	 * \else
	 * 灯列表最大个数
	 * \endif
	 */
	public static final int MAX_LIGHTING_NUM = 16;

	/**
	 * \if ENGLISH_LANG
	 * number of supported mode
	 * \else
	 * 灯光支持的模式数量
	 * \endif
	 */
	public static final int SUPPORTED_LC_COMPLEX_MODES = 3;

	/****************************************************************************************
	 ** 配置命令 对应 {@link INetSDK#GetDevConfig} 和 {@link INetSDK#SetDevConfig}接口    **
	 ****************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * Device property setup
	 * \else
	 * 设备属性配置
	 * \endif
	 */
	public static final int SDK_DEV_DEVICECFG			       = 0x0001;

	/**
	 * \if ENGLISH_LANG
	 * Network setup
	 * \else
	 * 网络配置
	 * \endif
	 */
	public static final int SDK_DEV_NETCFG				       = 0x0002;

	/**
	 * \if ENGLISH_LANG
	 * Video channel setup
	 * \else
	 * 图象通道配置
	 * \endif
	 */
	public static final int SDK_DEV_CHANNELCFG		           = 0x0003;

	/**
	 * \if ENGLISH_LANG
	 * Preview parameter setup
	 * \else
	 * 预览参数配置
	 * \endif
	 */
	public static final int SDK_DEV_PREVIEWCFG 			        = 0x0004;

	/**
	 * \if ENGLISH_LANG
	 * Record setup
	 * \else
	 * 录像配置
	 * \endif
	 */
	public static final int SDK_DEV_RECORDCFG			        = 0x0005;

	/**
	 * \if ENGLISH_LANG
	 * COM property setup
	 * \else
	 * 串口属性配置
	 * \endif
	 */
	public static final int SDK_DEV_COMMCFG				        = 0x0006;

	/**
	 * \if ENGLISH_LANG
	 * Alarm property setup
	 * \else
	 * 报警属性配置
	 * \endif
	 */
	public static final int SDK_DEV_ALARMCFG 			        = 0x0007;

	/**
	 * \if ENGLISH_LANG
	 * DVR time setup
	 * \else
	 * DVR时间配置
	 * \endif
	 */
	public static final int SDK_DEV_TIMECFG 				    = 0x0008;

	/**
	 * \if ENGLISH_LANG
	 * Audio talk parameter setup
	 * \else
	 * 对讲参数配置
	 * \endif
	 */
	public static final int SDK_DEV_TALKCFG				        = 0x0009;

	/**
	 * \if ENGLISH_LANG
	 * Auto matrix setup
	 * \else
	 * 自动维护配置
	 * \endif
	 */
	public static final int SDK_DEV_AUTOMTCFG			        = 0x000A;

	/**
	 * \if ENGLISH_LANG
	 * Local matrix control strategy setup
	 * \else
	 * 本机矩阵控制策略配置
	 * \endif
	 */
	public static final int SDK_DEV_VEDIO_MARTIX		        = 0x000B;

	/**
	 * \if ENGLISH_LANG
	 * Multiple ddns setup
	 * \else
	 * 多ddns服务器配置
	 * \endif
	 */
	public static final int SDK_DEV_MULTI_DDNS			        = 0x000C;

	/**
	 * \if ENGLISH_LANG
	 * Snapshot corresponding setup
	 * \else
	 * 抓图相关配置
	 * \endif
	 */
	public static final int SDK_DEV_SNAP_CFG			        = 0x000D;

	/**
	 * \if ENGLISH_LANG
	 * HTTP path setup
	 * \else
	 * HTTP路径配置
	 * \endif
	 */
	public static final int SDK_DEV_WEB_URL_CFG			        = 0x000E;

	/**
	 * \if ENGLISH_LANG
	 * FTP upload setup
	 * \else
	 * FTP上传配置
	 * \endif
	 */
	public static final int SDK_DEV_FTP_PROTO_CFG		       = 0x000F;

	/**
	 * \if ENGLISH_LANG
	 * Plaform embedded setup. Now the channel parameter represents the platform type.\n
	 * channel=4:Bell alcatel;channel=10:ARGzx Netview;channel=11:U CNC  channel = 51 AMP
	 * \else
	 * 平台接入配置，此时channel参数代表平台类型，
	 * channel=4： 代表贝尔阿尔卡特；channel=10：代表ARGzxLW；channel=11：代表UWT；channel=51：代表TDYG\n
	 * \endif
	 */
	public static final int SDK_DEV_INTERVIDEO_CFG		        = 0x0010;

	/**
	 * \if ENGLISH_LANG
	 * Privacy mask setup
	 * \else
	 * 区域遮挡配置
	 * \endif
	 */
	public static final int SDK_DEV_VIDEO_COVER			         = 0x0011;

	/**
	 * \if ENGLISH_LANG
	 * Transmission strategy. Video quality \ Fluency
	 * \else
	 * 传输策略配置，画质优先 \ 流畅性优先
	 * \endif
	 */
	public static final int SDK_DEV_TRANS_STRATEGY		          = 0x0012;

	/**
	 * \if ENGLISH_LANG
	 * Record download strategy setup:high-speed \ general download
	 * \else
	 * 录象下载策略配置，高速下载 \ 普通下载
	 * \endif
	 */
	public static final int SDK_DEV_DOWNLOAD_STRATEGY	            = 0x0013;

	/**
	 * \if ENGLISH_LANG
	 * Video watermark setup, refer to {@link SDKDEV_WATERMAKE_CFG}
	 * \else
	 * 图象水印配置，对应结构体 {@link SDKDEV_WATERMAKE_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_WATERMAKE_CFG		            = 0x0014;

	/**
	 * \if ENGLISH_LANG
	 * Wireless network setup
	 * \else
	 * 无线网络配置
	 * \endif
	 */
	public static final int SDK_DEV_WLAN_CFG				       = 0x0015;

	/**
	 * \if ENGLISH_LANG
	 * Search wireless device setup
	 * \else
	 * 搜索无线设备配置
	 * \endif
	 */
	public static final int SDK_DEV_WLAN_DEVICE_CFG		       = 0x0016;

	/**
	 * \if ENGLISH_LANG
	 * Auto register parameter setup
	 * \else
	 * 主动注册参数配置
	 * \endif
	 */
	public static final int SDK_DEV_REGISTER_CFG			      = 0x0017;

	/**
	 * \if ENGLISH_LANG
	 * Camera property setup
	 * \else
	 * 摄像头属性配置
	 * \endif
	 */
	public static final int SDK_DEV_CAMERA_CFG			          = 0x0018;

	/**
	 * \if ENGLISH_LANG
	 * IR alarm setup
	 * \else
	 * 红外报警配置
	 * \endif
	 */
	public static final int SDK_DEV_INFRARED_CFG 		          = 0x0019;

	/**
	 * \if ENGLISH_LANG
	 * Sniffer setup
	 * \else
	 * Sniffer抓包配置
	 * \endif
	 */
	public static final int SDK_DEV_SNIFFER_CFG			     = 0x001A;

	/**
	 * \if ENGLISH_LANG
	 * Mail setup
	 * \else
	 * 邮件配置
	 * \endif
	 */
	public static final int SDK_DEV_MAIL_CFG				    = 0x001B;

	/**
	 * \if ENGLISH_LANG
	 * DNS setup
	 * \else
	 * DNS服务器配置
	 * \endif
	 */
	public static final int SDK_DEV_DNS_CFG				     = 0x001C;

	/**
	 * \if ENGLISH_LANG
	 * NTP setup
	 * \else
	 * NTP配置
	 * \endif
	 */
	public static final int SDK_DEV_NTP_CFG				      = 0x001D;

	/**
	 * \if ENGLISH_LANG
	 * Audio detection setup
	 * \else
	 * 音频检测配置
	 * \endif
	 */
	public static final int SDK_DEV_AUDIO_DETECT_CFG		      = 0x001E;

	/**
	 * \if ENGLISH_LANG
	 * Storage position setup
	 * \else
	 * 存储位置配置
	 * \endif
	 */
	public static final int SDK_DEV_STORAGE_STATION_CFG        = 0x001F;

	/**
	 * \if ENGLISH_LANG
	 * PTZ operation property(It is invalid now. Please use GetPtzOptAttr to get PTZ operation property.)
	 * \else
	 * 云台操作属性(已经废除，请使用 GetPtzOptAttr 获取云台操作属性)
	 * \endif
	 */
	public static final int SDK_DEV_PTZ_OPT_CFG			      = 0x0020;

	/**
	 * \if ENGLISH_LANG
	 * Daylight Saving Time (DST)setup
	 * \else
	 * 夏令时配置
	 * \endif
	 */
	public static final int SDK_DEV_DST_CFG				      = 0x0021;

	/**
	 * \if ENGLISH_LANG
	 * Alarm centre setup
	 * \else
	 * 报警中心配置
	 * \endif
	 */
	public static final int SDK_DEV_ALARM_CENTER_CFG		     = 0x0022;

	/**
	 * \if ENGLISH_LANG
	 * VIdeo OSD setup
	 * \else
	 * 视频OSD叠加配置
	 * \endif
	 */
	public static final int SDK_DEV_VIDEO_OSD_CFG              = 0x0023;

	/**
	 * \if ENGLISH_LANG
	 * CDMA \ GPRS configuration
	 * \else
	 * CDMA \ GPRS网络配置
	 * \endif
	 */
	public static final int SDK_DEV_CDMAGPRS_CFG               = 0x0024;

	/**
	 * \if ENGLISH_LANG
	 * IP Filter configuration
	 * \else
	 * IP过滤配置
	 * \endif
	 */

	public static final int SDK_DEV_IPFILTER_CFG              = 0x0025;

	/**
	 * \if ENGLISH_LANG
	 * Talk encode configuration
	 * \else
	 * 语音对讲编码配置
	 * \endif
	 */
	public static final int SDK_DEV_TALK_ENCODE_CFG           = 0x0026;

	/**
	 * \if ENGLISH_LANG
	 * The length of the video package configuration, cprresponding to {@link SDKDEV_RECORD_PACKET_CFG}
	 * \else
	 * 录像打包长度配置,对应 {@link SDKDEV_RECORD_PACKET_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_RECORD_PACKET_CFG         = 0x0027;

	/**
	 * \if ENGLISH_LANG
	 * SMS MMS configuration
	 * \else
	 * 短信MMS配置
	 * \endif
	 */
	public static final int SDK_DEV_MMS_CFG               	    = 0x0028;

	/**
	 * \if ENGLISH_LANG
	 * SMS to activate the wireless connection configuration
	 * \else
	 * 短信激活无线连接配置
	 * \endif
	 */
	public static final int SDK_DEV_SMSACTIVATION_CFG	 	    = 0x0029;

	/**
	 * \if ENGLISH_LANG
	 * Dial-up activation of a wireless connection configuration
	 * \else
	 * 拨号激活无线连接配置
	 * \endif
	 */
	public static final int SDK_DEV_DIALINACTIVATION_CFG	    = 0x002A;

	/**
	 * \if ENGLISH_LANG
	 * Capture network configuration
	 * \else
	 * 网络抓包配置
	 * \endif
	 */
	public static final int SDK_DEV_SNIFFER_CFG_EX		 	= 0x0030;

	/**
	 * \if ENGLISH_LANG
	 * Download speed limit
	 * \else
	 * 下载速度限制
	 * \endif
	 */
	public static final int SDK_DEV_DOWNLOAD_RATE_CFG	 	    = 0x0031;

	/**
	 * \if ENGLISH_LANG
	 * Panorama switch alarm configuration
	 * \else
	 * 全景切换报警配置
	 * \endif
	 */
	public static final int SDK_DEV_PANORAMA_SWITCH_CFG	   = 0x0032;

	/**
	 * \if ENGLISH_LANG
	 * Lose focus alarm configuration
	 * \else
	 * 失去焦点报警配置
	 * \endif
	 */
	public static final int SDK_DEV_LOST_FOCUS_CFG		   = 0x0033;

	/**
	 * \if ENGLISH_LANG
	 * Alarm decoder configuration
	 * \else
	 * 报警解码器配置
	 * \endif
	 */
	public static final int SDK_DEV_ALARM_DECODE_CFG		   = 0x0034;

	/**
	 * \if ENGLISH_LANG
	 * Video output configuration
	 * \else
	 * 视频输出参数配置
	 * \endif
	 */
	public static final int SDK_DEV_VIDEOOUT_CFG             = 0x0035;

	/**
	 * \if ENGLISH_LANG
	 * Preset enable configuration
	 * \else
	 * 预制点使能配置
	 * \endif
	 */
	public static final int SDK_DEV_POINT_CFG			 	  = 0x0036;

	/**
	 * \if ENGLISH_LANG
	 * IP conflication configurationIp
	 * \else
	 * Ip冲突检测报警配置
	 * \endif
	 */
	public static final int SDK_DEV_IP_COLLISION_CFG     	  = 0x0037;

	/**
	 * \if ENGLISH_LANG
	 * OSD overlay enable configuration
	 * \else
	 * OSD叠加使能配置
	 * \endif
	 */
	public static final int SDK_DEV_OSD_ENABLE_CFG		  = 0x0038;

	/**
	 * \if ENGLISH_LANG
	 * Local alarm configuration，refer to {@link SDK_ALARMIN_CFG_EX}
	 * \else
	 * 本地报警配置, 取值参考 {@link SDK_ALARMIN_CFG_EX}
	 * \endif
	 */
	public static final int SDK_DEV_LOCALALARM_CFG 		   = 0x0039;

	/**
	 * \if ENGLISH_LANG
	 * Network alarm configuration，refer to {@link SDK_ALARMIN_CFG_EX}
	 * \else
	 * 网络报警配置, 取值参考 {@link SDK_ALARMIN_CFG_EX}
	 * \endif
	 */
	public static final int SDK_DEV_NETALARM_CFG 		       = 0x003A;

	/**
	 * \if ENGLISH_LANG
	 * Motion detection configuration，refer to {@link SDK_MOTION_DETECT_CFG_EX}
	 * \else
	 * 动检报警配置, 取值参考 {@link SDK_MOTION_DETECT_CFG_EX}
	 * \endif
	 */
	public static final int SDK_DEV_MOTIONALARM_CFG 		   = 0x003B;

	/**
	 * \if ENGLISH_LANG
	 * Video loss configuration，refer to {@link SDK_VIDEO_LOST_CFG_EX}
	 * \else
	 * 视频丢失报警配置, 取值参考 {@link SDK_VIDEO_LOST_CFG_EX}
	 * \endif
	 */
	public static final int SDK_DEV_VIDEOLOSTALARM_CFG 	   = 0x003C;

	/**
	 * \if ENGLISH_LANG
	 * Camera masking configuration，refer to {@link SDK_BLIND_CFG_EX}
	 * \else
	 * 视频遮挡报警配置, 取值参考 {@link SDK_BLIND_CFG_EX}
	 * \endif
	 */
	public static final int SDK_DEV_BLINDALARM_CFG 		   = 0x003D;

	/**
	 * \if ENGLISH_LANG
	 * HDD alarm configuration，refer to {@link SDK_DISK_ALARM_CFG_EX}
	 * \else
	 * 硬盘报警配置, 取值参考 {@link SDK_DISK_ALARM_CFG_EX}
	 * \endif
	 */
	public static final int SDK_DEV_DISKALARM_CFG 		 	   = 0x003E;

	/**
	 * \if ENGLISH_LANG
	 * Network disconnection alarm configuration，refer to {@link SDK_NETBROKEN_ALARM_CFG_EX}
	 * \else
	 * 网络中断报警配置, 取值参考 {@link SDK_NETBROKEN_ALARM_CFG_EX}
	 * \endif
	 */
	public static final int SDK_DEV_NETBROKENALARM_CFG 	   = 0x003F;

	/**
	 * \if ENGLISH_LANG
	 * Digital channel info of front encoders(Hybrid DVR use)，refer to {@link DEV_ENCODER_CFG}
	 * \else
	 * 数字通道的前端编码器信息(混合DVR使用), 取值参考 {@link DEV_ENCODER_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_ENCODER_CFG           	   = 0x0040;

	/**
	 * \if ENGLISH_LANG
	 * TV adjust configuration(Now the channel parameter represents the TV numble(from 0))，refer to {@link SDKDEV_TVADJUST_CFG}
	 * \else
	 * TV调节配置（channel代表TV号(0开始)), 取值参考 {@link SDKDEV_TVADJUST_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_TV_ADJUST_CFG           = 0x0041;

	/**
	 * \if ENGLISH_LANG
	 * about vehicle configuration
	 * \else
	 * 车载相关配置，
	 * \endif
	 */
	public static final int SDK_DEV_ABOUT_VEHICLE_CFG	 	   = 0x0042;

	/**
	 * \if ENGLISH_LANG
	 * ATM ability information
	 * \else
	 * 获取atm叠加支持能力信息
	 * \endif
	 */
	public static final int SDK_DEV_ATM_OVERLAY_ABILITY	 	 = 0x0043;

	/**
	 * \if ENGLISH_LANG
	 * ATM overlay configuration
	 * \else
	 * atm叠加配置，新atm特有
	 * \endif
	 */
	public static final int SDK_DEV_ATM_OVERLAY_CFG		 	= 0x0044;

	/**
	 * \if ENGLISH_LANG
	 * Decoder tour configuration
	 * \else
	 * 解码器解码轮巡配置
	 * \endif
	 */
	public static final int SDK_DEV_DECODER_TOUR_CFG		 	= 0x0045;

	/**
	 * \if ENGLISH_LANG
	 * SIP configuration
	 * \else
	 * SIP配置
	 * \endif
	 */
	public static final int SDK_DEV_SIP_CFG				 	= 0x0046;

	/**
	 * \if ENGLISH_LANG
	 * wifi ap configuration
	 * \else
	 * wifi ap配置
	 * \endif
	 */
	public static final int SDK_DEV_VICHILE_WIFI_AP_CFG	 	= 0x0047;

	/**
	 * \if ENGLISH_LANG
	 * Static
	 * \else
	 * 静态报警配置
	 * \endif
	 */
	public static final int SDK_DEV_STATICALARM_CFG      		= 0x0048;

	/**
	 * \if ENGLISH_LANG
	 * decode policy configuration(channel start with 0)，refer to {@link SDKDEV_DECODEPOLICY_CFG}
	 * \else
	 * 设备的解码策略配置(，channel为解码通道0开始), 取值参考 {@link SDKDEV_DECODEPOLICY_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_DECODE_POLICY_CFG     	= 0x0049;

	/**
	 * \if ENGLISH_LANG
	 * Device relative config，refer to {@link SDKDEV_MACHINE_CFG}
	 * \else
	 * 机器相关的配置, 取值参考 {@link SDKDEV_MACHINE_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_MACHINE_CFG				= 0x004A;

	/**
	 * \if ENGLISH_LANG
	 * MACconflication configuration，refer to {@link ALARM_MAC_COLLISION_CFG}
	 * \else
	 * MAC冲突检测配置, 取值参考 {@link ALARM_MAC_COLLISION_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_MAC_COLLISION_CFG    	 	= 0x004B;

	/**
	 * \if ENGLISH_LANG
	 * RTSP configuration, refer to {@link SDKDEV_RTSP_CFG}
	 * \else
	 * RTSP配置, 取值参考 {@link SDKDEV_RTSP_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_RTSP_CFG              		= 0x004C;

	/**
	 * \if ENGLISH_LANG
	 * 232 com card signal event configuration, refer to {@link COM_CARD_SIGNAL_LINK_CFG}
	 * \else
	 * 232串口卡号信号事件配置, 取值参考 {@link COM_CARD_SIGNAL_LINK_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_232_COM_CARD_CFG      	= 0x004E;

	/**
	 * \if ENGLISH_LANG
	 * 485 com card signal event configuration, refer to {@link COM_CARD_SIGNAL_LINK_CFG}
	 * \else
	 * 485串口卡号信号事件配置, 取值参考 {@link COM_CARD_SIGNAL_LINK_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_485_COM_CARD_CFG     	   = 0x004F;

	/**
	 * \if ENGLISH_LANG
	 * extend FTP upload setup, refer to {@link SDKDEV_FTP_PROTO_CFG_EX}
	 * \else
	 * FTP上传扩展配置, 取值参考 {@link SDKDEV_FTP_PROTO_CFG_EX}
	 * \endif
	 */
	public static final int SDK_DEV_FTP_PROTO_CFG_EX		    = 0x0050;

	/**
	 * \if ENGLISH_LANG
	 * SYSLOG remote server config, refer to {@link SDKDEV_SYSLOG_REMOTE_SERVER}
	 * \else
	 * SYSLOG 远程服务器配置, 取值参考 {@link SDKDEV_SYSLOG_REMOTE_SERVER}
	 * \endif
	 */
	public static final int SDK_DEV_SYSLOG_REMOTE_SERVER	    = 0x0051;

	/**
	 * \if ENGLISH_LANG
	 * Extended com configuration, refer to {@link SDKDEV_COMM_CFG_EX}
	 * \else
	 * 扩展串口属性配置, 取值参考 {@link SDKDEV_COMM_CFG_EX}
	 * \endif
	 */
	public static final int SDK_DEV_COMMCFG_EX            		= 0x0052;

	/**
	 * \if ENGLISH_LANG
	 * net card configuration, refer to {@link SDKDEV_NETCARD_CFG}
	 * \else
	 * 卡口信息配置, 取值参考 {@link SDKDEV_NETCARD_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_NETCARD_CFG           		 = 0x0053;

	/**
	 * \if ENGLISH_LANG
	 * Video backup format, refer to {@link SDKDEV_BACKUP_VIDEO_FORMAT}
	 * \else
	 * 视频备份格式配置, 取值参考 {@link SDKDEV_BACKUP_VIDEO_FORMAT}
	 * \endif
	 */
	public static final int SDK_DEV_BACKUP_VIDEO_FORMAT   	 = 0x0054;

	/**
	 * \if ENGLISH_LANG
	 * stream encrypt configuration, refer to {@link SDKEDV_STREAM_ENCRYPT}
	 * \else
	 * 码流加密配置, 取值参考 {@link SDKEDV_STREAM_ENCRYPT}
	 * \endif
	 */
	public static final int SDK_DEV_STREAM_ENCRYPT_CFG   		 = 0x0055;

	/**
	 * \if ENGLISH_LANG
	 * IP filter extended configuration, refer to {@link SDKDEV_IPIFILTER_CFG_EX}
	 * \else
	 * IP过滤配置扩展, 取值参考 {@link SDKDEV_IPIFILTER_CFG_EX}
	 * \endif
	 */
	public static final int SDK_DEV_IPFILTER_CFG_EX       	= 0x0056;

	/**
	 * \if ENGLISH_LANG
	 * configuration, refer to {@link SDKDEV_CUSTOM_CFG}
	 * \else
	 * 用户自定义配置, 取值参考 {@link SDKDEV_CUSTOM_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_CUSTOM_CFG            		 = 0x0057;

	/**
	 * \if ENGLISH_LANG
	 * Search wireless device extended setup, refer to {@link SDKDEV_WLAN_DEVICE_LIST_EX}
	 * \else
	 * 搜索无线设备扩展配置, 取值参考 {@link SDKDEV_WLAN_DEVICE_LIST_EX}
	 * \endif
	 */
	public static final int SDK_DEV_WLAN_DEVICE_CFG_EX    	= 0x0058;

	/**
	 * \if ENGLISH_LANG
	 * ACC power off configuration, refer to {@link SDKDEV_ACC_POWEROFF_CFG}
	 * \else
	 * ACC断线事件配置, 取值参考 {@link SDKDEV_ACC_POWEROFF_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_ACC_POWEROFF_CFG      	= 0x0059;

	/**
	 * \if ENGLISH_LANG
	 * explosion proof alarm configuration, refer to {@link SDKDEV_EXPLOSION_PROOF_CFG}
	 * \else
	 * 防爆盒报警事件配置, 取值参考 {@link SDKDEV_EXPLOSION_PROOF_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_EXPLOSION_PROOF_CFG   	= 0x005a;

	/**
	 * \if ENGLISH_LANG
	 * Network extended setup, refer to {@link SDKDEV_NET_CFG_EX}
	 * \else
	 * 网络扩展配置, 取值参考 {@link SDKDEV_NET_CFG_EX}
	 * \endif
	 */
	public static final int SDK_DEV_NETCFG_EX			 		= 0x005b;

	/**
	 * \if ENGLISH_LANG
	 * light control config, refer to {@link SDKDEV_LIGHTCONTROL_CFG}
	 * \else
	 * 灯光控制配置, 取值参考 {@link SDKDEV_LIGHTCONTROL_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_LIGHTCONTROL_CFG      	= 0x005c;

	/**
	 * \if ENGLISH_LANG
	 * 3G flow info config, refer to {@link SDKDEV_3GFLOW_INFO_CFG}
	 * \else
	 * 3G流量信息配置, 取值参考 {@link SDKDEV_3GFLOW_INFO_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_3GFLOW_CFG           		= 0x005d;

	/**
	 * \if ENGLISH_LANG
	 * IPv6 config, refer to {@link SDKDEV_IPV6_CFG}
	 * \else
	 * IPv6配置, 取值参考 {@link SDKDEV_IPV6_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_IPV6_CFG              	    = 0x005e;

	/**
	 * \if ENGLISH_LANG
	 * Snmp config, refer to {@link SDKDEV_NET_SNMP_CFG}
	 * \else
	 * Snmp配置,设置完成后需要重启设备, 取值参考 {@link SDKDEV_NET_SNMP_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_SNMP_CFG              		= 0x005f;

	/**
	 * \if ENGLISH_LANG
	 * snap control config, refer to {@link SDKDEV_SNAP_CONTROL_CFG}
	 * \else
	 * 抓图开关配置, 取值参考 {@link SDKDEV_SNAP_CONTROL_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_SNAP_CONTROL_CFG      	= 0x0060;

	/**
	 * \if ENGLISH_LANG
	 * GPS mode config, refer to {@link SDKDEV_GPS_MODE_CFG}
	 * \else
	 * GPS定位模式配置, 取值参考 {@link SDKDEV_GPS_MODE_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_GPS_MODE_CFG          		 = 0x0061;

	/**
	 * \if ENGLISH_LANG
	 * Snap upload config, refer to {@link SDKDEV_SNAP_UPLOAD_CFG}
	 * \else
	 * 图片上传配置信息, 取值参考 {@link SDKDEV_SNAP_UPLOAD_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_SNAP_UPLOAD_CFG       	= 0x0062;

	/**
	 * \if ENGLISH_LANG
	 * Speed limit config, refer to {@link SDKDEV_SPEED_LIMIT_CFG}
	 * \else
	 * 限速配置信息, 取值参考 {@link SDKDEV_SPEED_LIMIT_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_SPEED_LIMIT_CFG       	 = 0x0063;

	/**
	 * \if ENGLISH_LANG
	 * iSCSI config, need reboot, refer to {@link SDKDEV_ISCSI_CFG}
	 * \else
	 * iSCSI配置, 设置完成后需要重启设备, 取值参考 {@link SDKDEV_ISCSI_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_ISCSI_CFG			 		 = 0x0064;

	/**
	 * \if ENGLISH_LANG
	 * wifi config, refer to {@link SDKDEV_WIRELESS_ROUTING_CFG}
	 * \else
	 * 无线路由配置, 取值参考 {@link SDKDEV_WIRELESS_ROUTING_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_WIRELESS_ROUTING_CFG	 	 = 0x0065;

	/**
	 * \if ENGLISH_LANG
	 * enclosure config, refer to {@link SDKDEV_ENCLOSURE_CFG}
	 * \else
	 * 电子围栏配置, 取值参考 {@link SDKDEV_ENCLOSURE_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_ENCLOSURE_CFG         		 = 0x0066;

	/**
	 * \if ENGLISH_LANG
	 * enclosure version config, refer to {@link SDKDEV_ENCLOSURE_VERSION_CFG}
	 * \else
	 * 电子围栏版本号配置, 取值参考 {@link SDKDEV_ENCLOSURE_VERSION_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_ENCLOSURE_VERSION_CFG  	= 0x0067;

	/**
	 * \if ENGLISH_LANG
	 * Raid event config, refer to {@link SDKDEV_RAID_EVENT_CFG}
	 * \else
	 * Raid事件配置, 取值参考 {@link SDKDEV_RAID_EVENT_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_RIAD_EVENT_CFG         	= 0x0068;

	/**
	 * \if ENGLISH_LANG
	 * fire alarm config, refer to {@link SDKDEV_FIRE_ALARM_CFG}
	 * \else
	 * 火警报警配置, 取值参考 {@link SDKDEV_FIRE_ALARM_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_FIRE_ALARM_CFG            = 0x0069;

	/**
	 * \if ENGLISH_LANG
	 * local alarm name config(string like "Name1&&name2&&name3...")
	 * \else
	 * 本地名称报警配置(对应Name1&&name2&&name3...格式字符串)
	 * \endif
	 */
	public static final int SDK_DEV_LOCALALARM_NAME_CFG    	= 0x006a;

	/**
	 * \if ENGLISH_LANG
	 * urgency storage config, refer to {@link SDKDEV_URGENCY_RECORD_CFG}
	 * \else
	 * 紧急存储配置, 取值参考 {@link SDKDEV_URGENCY_RECORD_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_URGENCY_RECORD_CFG     	= 0x0070;

	/**
	 * \if ENGLISH_LANG
	 * elevator parameter config, refer to {@link SDKDEV_ELEVATOR_ATTRI_CFG}
	 * \else
	 * 电梯运行参数配置, 取值参考 {@link SDKDEV_ELEVATOR_ATTRI_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_ELEVATOR_ATTRI_CFG     	= 0x0071;

	/**
	 * \if ENGLISH_LANG
	 * TM overlay function. For latest ATM series product only, refer to {@link SDKDEV_ATM_OVERLAY_CONFIG_EX}
	 * \else
	 * atm叠加配置，新atm特有,支持大于32通道的设备, 取值参考 {@link SDKDEV_ATM_OVERLAY_CONFIG_EX}
	 * \endif
	 */
	public static final int SDK_DEV_ATM_OVERLAY_CFG_EX	  	= 0x0072;

	/**
	 * \if ENGLISH_LANG
	 * Support devices of 32-channel or higher, refer to {@link SDKDEV_MACFILTER_CFG}
	 * \else
	 * MAC过滤配置, 取值参考 {@link SDKDEV_MACFILTER_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_MACFILTER_CFG		  		= 0x0073;

	/**
	 * \if ENGLISH_LANG
	 * MAC filter config, refer to {@link SDKDEV_MACFILTER_CFG}
	 * \else
	 * MAC,IP过滤(要求ip,mac是一一对应的)配置, 取值参考 {@link SDKDEV_MACFILTER_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_MACIPFILTER_CFG		  	= 0x0074;

	/**
	 * \if ENGLISH_LANG
	 * MAC,IP filter config(need ip,mac one to one corresponding), refer to {@link SDKEDV_STREAM_ENCRYPT}
	 * \else
	 * 码流加密(加密计划)配置, 取值参考 {@link SDKEDV_STREAM_ENCRYPT}
	 * \endif
	 */
	public static final int SDK_DEV_STREAM_ENCRYPT_TIME_CFG  = 0x0075;

	/**
	 * \if ENGLISH_LANG
	 * stream encrypt(encryot plan), refer to {@link SDKDEV_LIMIT_BIT_RATE}
	 * \else
	 * 限码流配置, 取值参考 {@link SDKDEV_LIMIT_BIT_RATE}
	 * \endif
	 */
	public static final int SDK_DEV_LIMIT_BIT_RATE_CFG    	= 0x0076;

	/**
	 * \if ENGLISH_LANG
	 * limit bit rate config, refer to {@link SDKDEV_SNAP_CFG_EX}
	 * \else
	 * 抓图相关配置扩展, 取值参考 {@link SDKDEV_SNAP_CFG_EX}
	 * \endif
	 */
	public static final int SDK_DEV_SNAP_CFG_EX			  	= 0x0077;

	/**
	 * \if ENGLISH_LANG
	 * snap extern config, refer to {@link SDKDEV_DECODER_URL_CFG}
	 * \else
	 * 解码器url配置, 取值参考 {@link SDKDEV_DECODER_URL_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_DECODER_URL_CFG		 	= 0x0078;

	/**
	 * \if ENGLISH_LANG
	 * decoder url config, refer to {@link SDKDEV_TOUR_ENABLE_CFG}
	 * \else
	 * 轮巡使能配置, 取值参考 {@link SDKDEV_TOUR_ENABLE_CFG}
	 * \endif
	 */
	public static final int SDK_DEV_TOUR_ENABLE_CFG		 	= 0x0079;

	/**
	 * \if ENGLISH_LANG
	 * wifi ap extern config, refer to {@link SDKDEV_VEHICLE_WIFI_AP_CFG_EX}
	 * \else
	 * wifi ap配置扩展, 取值参考 {@link SDKDEV_VEHICLE_WIFI_AP_CFG_EX}
	 * \endif
	 */
	public static final int SDK_DEV_VICHILE_WIFI_AP_CFG_EX  	= 0x007a;

	/**
	 * \if ENGLISH_LANG
	 * encoder extern config, refer to {@link DEV_ENCODER_CFG_EX}
	 * \else
	 * 数字通道的前端编码器信息扩展, 取值参考 {@link DEV_ENCODER_CFG_EX}
	 * \endif
	 */
	public static final int SDK_DEV_ENCODER_CFG_EX           = 0x007b;


    /**
     * \if ENGLISH_LANG
     * Search wireless device extended setup, refer to {@link SDKDEV_WLAN_DEVICE_LIST_EX2}
     * \else
     * 搜索无线设备扩展配置, 取值参考 {@link SDKDEV_WLAN_DEVICE_LIST_EX2}
     * \endif
     */
    public static final int SDK_DEV_WLAN_DEVICE_CFG_EX2    	= 0x0088;

	public static final int SDK_DEV_USER_END_CFG			   = 1000;



	/********************************************************************************************
	 * 					扩展报警类型，对应接口 {@link INetSDK#StartListenEx}				    *
	 ********************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * External alarm
	 * \else
	 * 外部报警，数据字节数与设备报警通道个数相同，每个字节表示一个报警通道的报警状态，1为有报警，0为无报警。
	 * \endif
	 */
	public static final int SDK_ALARM_ALARM_EX                  = 0x2101;

	/**
	 * \if ENGLISH_LANG
	 * Motion detection alarm, 1:alarm   0:no alarm
	 * \else
	 * 动态检测报警，数据字节数与设备视频通道个数相同，每个字节表示一个视频通道的动态检测报警状态，1为有报警，0为无报警。
	 * \endif
	 */
	public static final int SDK_MOTION_ALARM_EX                 = 0x2102;

	/**
	 * \if ENGLISH_LANG
	 * Video loss alarm
	 * \else
	 * 视频丢失报警，数据字节数与设备视频通道个数相同，每个字节表示一个视频通道的视频丢失报警状态，1为有报警，0为无报警。
	 * \endif
	 */
	public static final int SDK_VIDEOLOST_ALARM_EX             = 0x2103;

	/**
	 * \if ENGLISH_LANG
	 * Camera masking alarm
	 * \else
	 * 视频遮挡报警，数据字节数与设备视频通道个数相同，每个字节表示一个视频通道的遮挡(黑屏)报警状态，1为有报警，0为无报警.
	 * \endif
	 */
	public static final int SDK_SHELTER_ALARM_EX               = 0x2104;

	/**
	 * \if ENGLISH_LANG
	 * Audio detection alarm
	 * \else
	 * 音频检测报警，数据为16个字节，每个字节表示一个视频通道的音频检测报警状态，1为有报警，0为无报警。
	 * \endif
	 */
	public static final int SDK_SOUND_DETECT_ALARM_EX          = 0x2105;

	/**
	 * \if ENGLISH_LANG
	 * HDD full alarm
	 * \else
	 * 硬盘满报警，数据为1个字节，1为有硬盘满报警，0为无报警。
	 * \endif
	 */
	public static final int SDK_DISKFULL_ALARM_EX              = 0x2106;

	/**
	 * \if ENGLISH_LANG
	 * HDD malfunction alarm
	 * \else
	 * 坏硬盘报警，数据为32个字节，每个字节表示一个硬盘的故障报警状态，1为有报警，0为无报警。
	 * \endif
	 */
	public static final int SDK_DISKERROR_ALARM_EX             = 0x2107;

	/**
	 * \if ENGLISH_LANG
	 * Encoder alarm
	 * \else
	 * 编码器报警，数据为16个字节，每个字节表示一个通道编码器状态，1为有报警，0为无报警。
	 * \endif
	 */
	public static final int SDK_ENCODER_ALARM_EX               = 0x210A;

	/**
	 * \if ENGLISH_LANG
	 * Emergency alarm
	 * \else
	 * 紧急报警，数据为16个字节，每个字节表示一个通道编码器状态，1为有报警，0为无报警。
	 * \endif
	 */
	public static final int SDK_URGENCY_ALARM_EX               = 0x210B;

	/**
	 * \if ENGLISH_LANG
	 * Wireless alarm
	 * \else
	 * 无线报警，数据为16个字节，每个字节表示一个通道编码器状态，1为有报警，0为无报警。
	 * \endif
	 */
	public static final int SDK_WIRELESS_ALARM_EX              = 0x210C;

	/**
	 * \if ENGLISH_LANG
	 * ew auido detection alarm, refer to {@link SDK_NEW_SOUND_ALARM_STATE}
	 * \else
	 * 新音频检测报警, 取值参考 {@link SDK_NEW_SOUND_ALARM_STATE}
	 * \endif
	 */
	public static final int SDK_NEW_SOUND_DETECT_ALARM_EX      = 0x210D;

	/**
	 * \if ENGLISH_LANG
	 * Alarm decoder alarm, refer to {@link ALARM_DECODER_ALARM}
	 * \else
	 * 报警解码器报警, 取值参考 {@link ALARM_DECODER_ALARM}
	 * \endif
	 */
	public static final int SDK_ALARM_DECODER_ALARM_EX         = 0x210E;

	/**
	 * \if ENGLISH_LANG
	 * NVD:Decoding capacity
	 * \else
	 * 解码器：解码能力报警，数据为一个字节，0：能正常解码 1：表示超出解码能力。
	 * \endif
	 */
	public static final int SDK_DECODER_DECODE_ABILITY         = 0x210F;

	/**
	 * \if ENGLISH_LANG
	 * Fiber encoder alarm
	 * \else
	 * 光纤编码器状态报警，报警信息的结构体见 ALARM_FDDI_ALARM
	 * \endif
	 */
	public static final int SDK_FDDI_DECODER_ABILITY           = 0x2110;

	/**
	 * \if ENGLISH_LANG
	 * Panorama switch alarm
	 * \else
	 * 切换场景报警，数据为16个字节，每个字节表示一个通道编码器状态，1为有报警，0为无报警。
	 * \endif
	 */
	public static final int SDK_PANORAMA_SWITCH_ALARM_EX       = 0x2111;

	/**
	 * \if ENGLISH_LANG
	 * Lost focus alarm
	 * \else
	 * 失去焦点报警，数据为16个字节，每个字节表示一个通道编码器状态，1为有报警，0为无报警。
	 * \endif
	 */
	public static final int SDK_LOSTFOCUS_ALARM_EX             = 0x2112;

	/**
	 * \if ENGLISH_LANG
	 * oem state
	 * \else
	 * oem报停状态，数据为 1 BYTE。
	 * \endif
	 */
	public static final int SDK_OEMSTATE_EX                    = 0x2113;

	/**
	 * \if ENGLISH_LANG
	 * DSP alarm
	 * \else
	 * DSP报警，报警信息的结构体见 DSP_ALARM
	 * \endif
	 */
	public static final int SDK_DSP_ALARM_EX                   = 0x2114;

	/**
	 * \if ENGLISH_LANG
	 * atm and pos disconnection alarm, 0:disconnection 1:connection
	 * \else
	 * atm和pos机断开报警, 数据为 1 BYTE，0：连接断开 1：连接正常
	 * \endif
	 */
	public static final int SDK_ATMPOS_BROKEN_EX               = 0x2115;

	/**
	 * \if ENGLISH_LANG
	 * Record state changed alarm
	 * \else
	 * 录像状态变化报警，报警信息为 ALARM_RECORDING_CHANGED 数组
	 * \endif
	 */
	public static final int SDK_RECORD_CHANGED_EX              = 0x2116;

	/**
	 * \if ENGLISH_LANG
	 * Device config changed alarm
	 * \else
	 * 配置发生变化报警，数据 无
	 * \endif
	 */
	public static final int SDK_CONFIG_CHANGED_EX              = 0x2117;

	/**
	 * \if ENGLISH_LANG
	 * Device rebooting alarm
	 * \else
	 * 设备重启报警，数据 无
	 * \endif
	 */
	public static final int SDK_DEVICE_REBOOT_EX               = 0x2118;

	/**
	 * \if ENGLISH_LANG
	 * CoilFault alarm, refer to {@link ALARM_WINGDING_INFO}
	 * \else
	 * 线圈/车检器故障报警, 取值参考 {@link ALARM_WINGDING_INFO}
	 * \endif
	 */
	public static final int SDK_WINGDING_ALARM_EX              = 0x2119;

	/**
	 * \if ENGLISH_LANG
	 * traffic congestion alarm, refer to {@link ALARM_TRAF_CONGESTION_INFO}
	 * \else
	 * 交通阻塞报警(车辆出现异常停止或者排队), 取值参考 {@link ALARM_TRAF_CONGESTION_INFO}
	 * \endif
	 */
	public static final int SDK_TRAF_CONGESTION_ALARM_EX       = 0x211A;

	/**
	 * \if ENGLISH_LANG
	 * traffic exception alarm, refer to {@link ALARM_TRAF_EXCEPTION_INFO}
	 * \else
	 * 交通异常报警(交通流量趋于0或异常空闲), 取值参考 {@link ALARM_TRAF_EXCEPTION_INFO}
	 * \endif
	 */
	public static final int SDK_TRAF_EXCEPTION_ALARM_EX        = 0x211B;

	/**
	 * \if ENGLISH_LANG
	 * FlashFault alarm, refer to {@link ALARM_EQUIPMENT_FILL_INFO}
	 * \else
	 * 补光设备故障报警, 取值参考 {@link ALARM_EQUIPMENT_FILL_INFO}
	 * \endif
	 */
	public static final int SDK_EQUIPMENT_FILL_ALARM_EX        = 0x211C;

	/**
	 * \if ENGLISH_LANG
	 * alarm arm disarm, refer to {@link ALARM_EQUIPMENT_FILL_INFO}
	 * \else
	 * 报警布撤防状态, 取值参考 {@link ALARM_EQUIPMENT_FILL_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ARM_DISARM_STATE         = 0x211D;

	/**
	 * \if ENGLISH_LANG
	 * ACC power off alarm
	 * \else
	 * ACC断电报警，数据为 DWORD 0：ACC通电 1：ACC断电
	 * \endif
	 */
	public static final int SDK_ALARM_ACC_POWEROFF             = 0x211E;

	/**
	 * \if ENGLISH_LANG
	 * Alarm of 3G flow exceed, refer to {@link SDKDEV_3GFLOW_EXCEED_STATE_INFO}
	 * \else
	 * 3G流量超出阈值报警, 取值参考 {@link SDKDEV_3GFLOW_EXCEED_STATE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_3GFLOW_EXCEED            = 0x211F;

	/**
	 * \if ENGLISH_LANG
	 * Speed limit alarm, refer to {@link ALARM_SPEED_LIMIT}
	 * \else
	 * 限速报警, 取值参考 {@link ALARM_SPEED_LIMIT}
	 * \endif
	 */
	public static final int SDK_ALARM_SPEED_LIMIT              = 0x2120;

	/**
	 * \if ENGLISH_LANG
	 * Vehicle information uploading, refer to {@link ALARM_VEHICLE_INFO_UPLOAD}
	 * \else
	 * 车载自定义信息上传, 取值参考 {@link ALARM_VEHICLE_INFO_UPLOAD}
	 * \endif
	 */
	public static final int SDK_ALARM_VEHICLE_INFO_UPLOAD      = 0x2121;

	/**
	 * \if ENGLISH_LANG
	 * Static detection alarm
	 * \else
	 * 静态检测报警，数据字节数与设备视频通道个数相同，每个字节表示一个视频通道的静态检测报警状态，1为有报警，0为无报警。
	 * \endif
	 */
	public static final int SDK_STATIC_ALARM_EX                = 0x2122;

	/**
	 * \if ENGLISH_LANG
	 * ptz location info, refer to {@link ALARM_PTZ_LOCATION_INFO}
	 * \else
	 * 云台定位信息, 取值参考 {@link ALARM_PTZ_LOCATION_INFO}
	 * \endif
	 */
	public static final int SDK_PTZ_LOCATION_EX                = 0x2123;

	/**
	 * \if ENGLISH_LANG
	 * card record info, refer to {@link ALARM_CARD_RECORD_INFO_UPLOAD}
	 * \else
	 * 卡号录像信息上传, 取值参考 {@link ALARM_CARD_RECORD_INFO_UPLOAD}
	 * \endif
	 */
	public static final int SDK_ALARM_CARD_RECORD_UPLOAD       = 0x2124;

	/**
	 * \if ENGLISH_LANG
	 * ATM trade info, refer to {@link ALARM_ATM_INFO_UPLOAD}
	 * \else
	 * ATM交易信息上传, 取值参考 {@link ALARM_ATM_INFO_UPLOAD}
	 * \endif
	 */
	public static final int SDK_ALARM_ATM_INFO_UPLOAD          = 0x2125;

	/**
	 * \if ENGLISH_LANG
	 * enclosure alarm, refer to {@link ALARM_ENCLOSURE_INFO}
	 * \else
	 * 电子围栏报警, 取值参考 {@link ALARM_ENCLOSURE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ENCLOSURE                = 0x2126;

	/**
	 * \if ENGLISH_LANG
	 * SIP state alarm, refer to {@link ALARM_SIP_STATE}
	 * \else
	 * SIP状态报警, 取值参考 {@link ALARM_SIP_STATE}
	 * \endif
	 */
	public static final int SDK_ALARM_SIP_STATE                = 0x2127;

	/**
	 * \if ENGLISH_LANG
	 * RAID state alarm, refer to {@link ALARM_RAID_INFO}
	 * \else
	 * RAID异常报警, 取值参考 {@link ALARM_RAID_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_RAID_STATE               = 0x2128;

	/**
	 * \if ENGLISH_LANG
	 * crossing speed limit alarm, refer to {@link ALARM_SPEED_LIMIT}
	 * \else
	 * 路口限速报警, 取值参考 {@link ALARM_SPEED_LIMIT}
	 * \endif
	 */
	public static final int SDK_ALARM_CROSSING_SPEED_LIMIT     = 0x2129;

	/**
	 * \if ENGLISH_LANG
	 * over loading alarm, refer to {@link ALARM_OVER_LOADING}
	 * \else
	 * 超载报警, 取值参考 {@link ALARM_OVER_LOADING}
	 * \endif
	 */
	public static final int SDK_ALARM_OVER_LOADING             = 0x212A;

	/**
	 * \if ENGLISH_LANG
	 * hard brake alarm, refer to {@link ALARM_HARD_BRAKING}
	 * \else
	 * 急刹车报警, 取值参考 {@link ALARM_HARD_BRAKING}
	 * \endif
	 */
	public static final int SDK_ALARM_HARD_BRAKING             = 0x212B;

	/**
	 * \if ENGLISH_LANG
	 * smoke sensor alarm, refer to {@link ALARM_SMOKE_SENSOR}
	 * \else
	 * 烟感报警, 取值参考 {@link ALARM_SMOKE_SENSOR}
	 * \endif
	 */
	public static final int SDK_ALARM_SMOKE_SENSOR             = 0x212C;

	/**
	 * \if ENGLISH_LANG
	 * traffic light fault alarm, refer to {@link ALARM_TRAFFIC_LIGHT_FAULT}
	 * \else
	 * 交通灯故障报警, 取值参考 {@link ALARM_TRAFFIC_LIGHT_FAULT}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_LIGHT_FAULT      = 0x212D;

	/**
	 * \if ENGLISH_LANG
	 * traffic flux alarm, refer to {@link ALARM_TRAFFIC_FLUX_LANE_INFO}
	 * \else
	 * 交通流量统计报警, 取值参考 {@link ALARM_TRAFFIC_FLUX_LANE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_FLUX_STAT        = 0x212E;

	/**
	 * \if ENGLISH_LANG
	 * camera move alarm, refer to {@link ALARM_CAMERA_MOVE_INFO}
	 * \else
	 * 摄像机移位报警事件, 取值参考 {@link ALARM_CAMERA_MOVE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_CAMERA_MOVE              = 0x212F;

	/**
	 * \if ENGLISH_LANG
	 * detailed motion alarm, refer to {@link ALARM_DETAILEDMOTION_CHNL_INFO}
	 * \else
	 * 详细动检报警上报信息, 取值参考 {@link ALARM_DETAILEDMOTION_CHNL_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_DETAILEDMOTION           = 0x2130;

	/**
	 * \if ENGLISH_LANG
	 * storage failure alarm, refer to {@link ALARM_STORAGE_FAILURE}
	 * \else
	 * 存储异常报警, 取值参考 {@link ALARM_STORAGE_FAILURE}
	 * \endif
	 */
	public static final int SDK_ALARM_STORAGE_FAILURE          = 0x2131;

	/**
	 * \if ENGLISH_LANG
	 * front IPC disconnect alarm, refer to {@link ALARM_FRONTDISCONNET_INFO}
	 * \else
	 * 前端IPC断网报警, 取值参考 {@link ALARM_FRONTDISCONNET_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_FRONTDISCONNECT          = 0x2132;

	/**
	 * \if ENGLISH_LANG
	 * remote external alarm, refer to {@link ALARM_REMOTE_ALARM_INFO}
	 * \else
	 * 远程外部报警, 取值参考 {@link ALARM_REMOTE_ALARM_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ALARM_EX_REMOTE          = 0x2133;

	/**
	 * \if ENGLISH_LANG
	 *  battery low power alarm, refer to {@link ALARM_BATTERYLOWPOWER_INFO}
	 * \else
	 * 电池电量低报警, 取值参考 {@link ALARM_BATTERYLOWPOWER_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BATTERYLOWPOWER          = 0x2134;

	/**
	 * \if ENGLISH_LANG
	 * temperature alarm, refer to {@link ALARM_TEMPERATURE_INFO}
	 * \else
	 * 温度异常报警, 取值参考 {@link ALARM_TEMPERATURE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_TEMPERATURE              = 0x2135;

	/**
	 * \if ENGLISH_LANG
	 * tired drive alarm, refer to {@link ALARM_TIREDDRIVE_INFO}
	 * \else
	 * 疲劳驾驶报警, 取值参考 {@link ALARM_TIREDDRIVE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_TIREDDRIVE               = 0x2136;

	/**
	 * \if ENGLISH_LANG
	 *  Alarm of record loss, refer to {@link ALARM_LOST_RECORD}
	 * \else
	 * 丢录像事件报警, 取值参考 {@link ALARM_LOST_RECORD}
	 * \endif
	 */
	public static final int SDK_ALARM_LOST_RECORD              = 0x2137;

	/**
	 * \if ENGLISH_LANG
	 * Alarm of High CPU Occupancy rate, refer to {@link ALARM_HIGH_CPU}
	 * \else
	 * CPU占用率过高事件报警, 取值参考 {@link ALARM_HIGH_CPU}
	 * \endif
	 */
	public static final int SDK_ALARM_HIGH_CPU                 = 0x2138;

	/**
	 * \if ENGLISH_LANG
	 * Alarm of net package loss, refer to {@link ALARM_LOST_NETPACKET}
	 * \else
	 * 网络发送数据丢包事件报警, 取值参考 {@link ALARM_LOST_NETPACKET}
	 * \endif
	 */
	public static final int SDK_ALARM_LOST_NETPACKET           = 0x2139;

	/**
	 * \if ENGLISH_LANG
	 * Alarm of high memory occupancy rate, refer to {@link ALARM_HIGH_MEMORY}
	 * \else
	 * 内存占用率过高事件报警, 取值参考 {@link ALARM_HIGH_MEMORY}
	 * \endif
	 */
	public static final int SDK_ALARM_HIGH_MEMORY              = 0x213A;

	/**
	 * \if ENGLISH_LANG
	 * WEB user have no operation for long time (no extended info)
	 * \else
	 * WEB用户长时间无操作事件（无扩展信息）
	 * \endif
	 */
	public static final int SDK_LONG_TIME_NO_OPERATION         = 0x213B;

	/**
	 * \if ENGLISH_LANG
	 * block list snap, refer to {@link SDK_BLACKLIST_SNAP_INFO}
	 * \else
	 * 禁止名单车辆抓拍事件, 取值参考 {@link SDK_BLACKLIST_SNAP_INFO}
	 * \endif
	 */
	public static final int SDK_BLACKLIST_SNAP                 = 0x213C;

	/**
	 * \if ENGLISH_LANG
	 * alarm of disk, refer to {@link ALARM_DISK_INFO}
	 * \else
	 * 硬盘报警, 取值参考 {@link ALARM_DISK_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_DISK                     = 0x213E;

	/**
	 * \if ENGLISH_LANG
	 * alarm of file system, refer to {@link ALARM_FILE_SYSTEM_INFO}
	 * \else
	 * 文件系统报警, 取值参考 {@link ALARM_FILE_SYSTEM_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_FILE_SYSTEM              = 0x213F;

	/**
	 * \if ENGLISH_LANG
	 * alarm of ivs, refer to {@link ALARM_IVS_INFO}
	 * \else
	 * 智能报警事件, 取值参考 {@link ALARM_IVS_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_IVS                      = 0x2140;

	/**
	 * \if ENGLISH_LANG
	 * goods weight, refer to {@link ALARM_GOODS_WEIGHT_UPLOAD_INFO}
	 * \else
	 * 货重信息上报, 取值参考 {@link ALARM_GOODS_WEIGHT_UPLOAD_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_GOODS_WEIGHT_UPLOAD      = 0x2141;

	/**
	 * \if ENGLISH_LANG
	 * alarm of goods weight, refer to {@link ALARM_GOODS_WEIGHT_INFO}
	 * \else
	 * 货重信息报警, 取值参考 {@link ALARM_GOODS_WEIGHT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_GOODS_WEIGHT             = 0x2142;

	/**
	 * \if ENGLISH_LANG
	 * GPS orientation info, refer to {@link NET_GPS_STATUS_INFO}
	 * \else
	 * GPS定位信息, 取值参考 {@link NET_GPS_STATUS_INFO}
	 * \endif
	 */
	public static final int SDK_GPS_STATUS                     = 0x2143;

	/**
	 * \if ENGLISH_LANG
	 * alarm disk burned full, refer to {@link ALARM_DISKBURNED_FULL_INFO}
	 * \else
	 * 硬盘刻录满报警, 取值参考 {@link ALARM_DISKBURNED_FULL_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_DISKBURNED_FULL          = 0x2144;

	/**
	 * \if ENGLISH_LANG
	 * storage low space, refer to {@link ALARM_STORAGE_LOW_SPACE_INFO}
	 * \else
	 * 存储容量不足事件, 取值参考 {@link ALARM_STORAGE_LOW_SPACE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_STORAGE_LOW_SPACE        = 0x2145;

	/**
	 * \if ENGLISH_LANG
	 * disk flux abnormal, refer to {@link ALARM_DISK_FLUX}
	 * \else
	 * 硬盘数据异常事件, 取值参考 {@link ALARM_DISK_FLUX}
	 * \endif
	 */
	public static final int SDK_ALARM_DISK_FLUX                = 0x2160;

	/**
	 * \if ENGLISH_LANG
	 * net flux abnormal, refer to {@link ALARM_NET_FLUX}
	 * \else
	 * 网络数据异常事件, 取值参考 {@link ALARM_NET_FLUX}
	 * \endif
	 */
	public static final int SDK_ALARM_NET_FLUX                 = 0x2161;

	/**
	 * \if ENGLISH_LANG
	 * fan speed abnormal, refer to {@link ALARM_FAN_SPEED}
	 * \else
	 * 风扇转速异常事件, 取值参考 {@link ALARM_FAN_SPEED}
	 * \endif
	 */
	public static final int SDK_ALARM_FAN_SPEED                = 0x2162;

	/**
	 * \if ENGLISH_LANG
	 * storage mistake, refer to {@link ALARM_STORAGE_FAILURE_EX}
	 * \else
	 * 存储错误报警, 取值参考 {@link ALARM_STORAGE_FAILURE_EX}
	 * \endif
	 */
	public static final int SDK_ALARM_STORAGE_FAILURE_EX       = 0x2163;

	/**
	 * \if ENGLISH_LANG
	 * record abnormal, refer to {@link ALARM_RECORD_FAILED_INFO}
	 * \else
	 * 录像异常报警, 取值参考 {@link ALARM_RECORD_FAILED_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_RECORD_FAILED            = 0x2164;

	/**
	 * \if ENGLISH_LANG
	 * storage break down, refer to {@link ALARM_STORAGE_BREAK_DOWN_INFO}
	 * \else
	 * 存储崩溃事件, 取值参考 {@link ALARM_STORAGE_BREAK_DOWN_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_STORAGE_BREAK_DOWN       = 0x2165;

	/**
	 * \if ENGLISH_LANG
	 * video input channel invalid, refer to {@link ALARM_VIDEO_ININVALID_INFO}
	 * \else
	 * 视频输入通道失效事件（例：配置的视频输入通道码流，超出设备处理能力）, 取值参考 {@link ALARM_VIDEO_ININVALID_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_VIDEO_ININVALID          = 0x2166;

	/**
	 * \if ENGLISH_LANG
	 * vehicle turnover arm event, refer to {@link ALARM_VEHICEL_TURNOVER_EVENT_INFO}
	 * \else
	 * 车辆侧翻报警事件, 取值参考 {@link ALARM_VEHICEL_TURNOVER_EVENT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_VEHICLE_TURNOVER         = 0x2167;

	/**
	 * \if ENGLISH_LANG
	 * vehicle collision event, refer to {@link ALARM_VEHICEL_COLLISION_EVENT_INFO}
	 * \else
	 * 车辆撞车报警事件, 取值参考 {@link ALARM_VEHICEL_COLLISION_EVENT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_VEHICLE_COLLISION        = 0x2168;

	/**
	 * \if ENGLISH_LANG
	 * vehicle confirm information event, refer to {@link ALARM_VEHICEL_CONFIRM_INFO}
	 * \else
	 * 车辆上传信息事件, 取值参考 {@link ALARM_VEHICEL_CONFIRM_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_VEHICLE_CONFIRM          = 0x2169;

	/**
	 * \if ENGLISH_LANG
	 * vehicle camero large angle event, refer to {@link ALARM_VEHICEL_LARGE_ANGLE}
	 * \else
	 * 车载摄像头大角度扭转事件, 取值参考 {@link ALARM_VEHICEL_LARGE_ANGLE}
	 * \endif
	 */
	public static final int SDK_ALARM_VEHICLE_LARGE_ANGLE      = 0x2170;

	/**
	 * \if ENGLISH_LANG
	 * device talking invite event, refer to {@link ALARM_TALKING_INVITE_INFO}
	 * \else
	 * 设备请求对方发起对讲事件, 取值参考 {@link ALARM_TALKING_INVITE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_TALKING_INVITE           = 0x2171;

	/**
	 * \if ENGLISH_LANG
	 * local alarm event, refer to {@link ALARM_ALARM_INFO_EX2}
	 * \else
	 * 本地报警事件, 取值参考 {@link ALARM_ALARM_INFO_EX2}
	 * \endif
	 */
	public static final int SDK_ALARM_ALARM_EX2                = 0x2175;

	/**
	 * \if ENGLISH_LANG
	 * video timing detecting event, refer to {@link ALARM_VIDEO_TIMING}
	 * \else
	 * 视频定时检测事件, 取值参考 {@link ALARM_VIDEO_TIMING}
	 * \endif
	 */
	public static final int SDK_ALARM_VIDEO_TIMING             = 0x2176;

	/**
	 * \if ENGLISH_LANG
	 * COM event, refer to {@link ALARM_COMM_PORT_EVENT_INFO}
	 * \else
	 * 串口事件, 取值参考 {@link ALARM_COMM_PORT_EVENT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_COMM_PORT                = 0x2177;

	/**
	 * \if ENGLISH_LANG
	 * audio anomaly event, refer to {@link ALARM_AUDIO_ANOMALY}
	 * \else
	 * 音频异常事件, 取值参考 {@link ALARM_AUDIO_ANOMALY}
	 * \endif
	 */
	public static final int SDK_ALARM_AUDIO_ANOMALY            = 0x2178;

	/**
	 * \if ENGLISH_LANG
	 * audio mutation event, refer to {@link ALARM_AUDIO_MUTATION}
	 * \else
	 * 声强突变事件, 取值参考 {@link ALARM_AUDIO_MUTATION}
	 * \endif
	 */
	public static final int SDK_ALARM_AUDIO_MUTATION           = 0x2179;

	/**
	 * \if ENGLISH_LANG
	 * Tyre information report event, refer to {@link EVENT_TYRE_INFO}
	 * \else
	 * 轮胎信息上报事件, 取值参考 {@link EVENT_TYRE_INFO}
	 * \endif
	 */
	public static final int SDK_EVENT_TYREINFO                 = 0x2180;

	/**
	 * \if ENGLISH_LANG
	 * Redundant power supplies abnormal alarm, refer to {@link ALARM_POWER_ABNORMAL_INFO}
	 * \else
	 * 冗余电源异常报警, 取值参考 {@link ALARM_POWER_ABNORMAL_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_POWER_ABNORMAL           = 0x2181;

	/**
	 * \if ENGLISH_LANG
	 * On-board equipment active offline events, refer to {@link EVENT_REGISTER_OFF_INFO}
	 * \else
	 * 车载设备主动下线事件, 取值参考 {@link EVENT_REGISTER_OFF_INFO}
	 * \endif
	 */
	public static final int SDK_EVENT_REGISTER_OFF             = 0x2182;

	/**
	 * \if ENGLISH_LANG
	 * No hard disk alarm, refer to {@link ALARM_NO_DISK_INFO}
	 * \else
	 * 无硬盘报警, 取值参考 {@link ALARM_NO_DISK_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_NO_DISK                  = 0x2183;

	/**
	 * \if ENGLISH_LANG
	 * The fall alarm, refer to {@link ALARM_FALLING_INFO}
	 * \else
	 * 跌落事件报警, 取值参考 {@link ALARM_FALLING_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_FALLING                  = 0x2184;

	/**
	 * \if ENGLISH_LANG
	 * Protective capsule event, refer to {@link ALARM_PROTECTIVE_CAPSULE_INFO}
	 * \else
	 * 防护舱事件, 取值参考 {@link ALARM_PROTECTIVE_CAPSULE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_PROTECTIVE_CAPSULE       = 0x2185;

	/**
	 * \if ENGLISH_LANG
	 * Call Non-response alarm, refer to {@link ALARM_NO_RESPONSE_INFO}
	 * \else
	 * 呼叫未应答警报, 取值参考 {@link ALARM_NO_RESPONSE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_NO_RESPONSE              = 0x2186;

	/**
	 * \if ENGLISH_LANG
	 * Config enable to change reported event, refer to {@link ALARM_CONFIG_ENABLE_CHANGE_INFO}
	 * \else
	 * 配置使能改变上报事件, 取值参考 {@link ALARM_CONFIG_ENABLE_CHANGE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_CONFIG_ENABLE_CHANGE     = 0x2187;

	/**
	 * \if ENGLISH_LANG
	 * CrossLine Event, refer to {@link ALARM_EVENT_CROSSLINE_INFO}
	 * \else
	 * 警戒线事件, 取值参考 {@link ALARM_EVENT_CROSSLINE_INFO}
	 * \endif
	 */
	public static final int SDK_EVENT_CROSSLINE_DETECTION     = 0x2188;

	/**
	 * \if ENGLISH_LANG
	 * CrossRegion Event, refer to {@link ALARM_EVENT_CROSSREGION_INFO}
	 * \else
	 * 警戒区事件, 取值参考 {@link ALARM_EVENT_CROSSREGION_INFO}
	 * \endif
	 */
	public static final int SDK_EVENT_CROSSREGION_DETECTION     = 0x2189;

	/**
	 * \if ENGLISH_LANG
	 * Abandoned object event  (Corresponding to structure ALARM_EVENT_LEFT_INFO)
	 * \else
	 * 物品遗留事件(对应结构体 ALARM_EVENT_LEFT_INFO)
	 * \endif
	 */
	public static final int SDK_EVENT_LEFT_DETECTION            = 0x218a;

	/**
	 * \if ENGLISH_LANG
	 * Object move event  (Corresponding to structure ALARM_TAKENAWAY_DETECTION_INFO)
	 * \else
	 * 物品搬移事件(对应结构体 ALARM_TAKENAWAY_DETECTION_INFO)
	 * \endif
	 */
	public static final int SDK_EVENT_TAKENAWAYDETECTION            = 0x218d;

	/**
	 * \if ENGLISH_LANG
	 * Video motion detect event  (Corresponding to structure ALARM_MOTIONDETECT_INFO)
	 * \else
	 * 视频移动侦测事件(对应结构体 ALARM_MOTIONDETECT_INFO)
	 * \endif
	 */
	public static final int SDK_EVENT_MOTIONDETECT            = 0x218f;

	/**
	 * \if ENGLISH_LANG
	 * start listen interface finish asyn notify event, refer to {@link START_LISTEN_FINISH_RESULT_INFO }
	 * \else
	 * 订阅事件接口完成异步通知事件, 取值参考{@link START_LISTEN_FINISH_RESULT_INFO }
	 * \endif
	 */
	public static final int SDK_START_LISTEN_FINISH_EVENT        = 0x300c;

	/**
	 * \if ENGLISH_LANG
	 * Alarm Box channel event, refer to {@link ALARM_BOX_ALARM_INFO }
	 * \else
	 * 报警盒通道的触发报警事件, 取值参考 {@link ALARM_BOX_ALARM_INFO }
	 * \endif
	 */
	public static final int SDK_ALARM_BOX_ALARM = 0x300f;

	/**
	 * \if ENGLISH_LANG
	 * Smart video motion detection(human), refer to {@link ALARM_SMARTMOTION_HUMAN_INFO }
	 * \else
	 * 智能视频移动侦测事件(人), 取值参考 {@link ALARM_SMARTMOTION_HUMAN_INFO }
	 * \endif
	 */
	public static final int SDK_ALARM_SMARTMOTION_HUMAN = 0x3015;

	/**
	 * \if ENGLISH_LANG
	 * Smart video motion detection(vehicle), refer to {@link ALARM_SMARTMOTION_VEHICLE_INFO }
	 * \else
	 * 智能视频移动侦测事件(车), 取值参考 {@link ALARM_SMARTMOTION_VEHICLE_INFO }
	 * \endif
	 */
	public static final int SDK_ALARM_SMARTMOTION_VEHICLE = 0x3016;

	/**
	 * \if ENGLISH_LANG
	 * A storage group does not exist, refer to {@link ALARM_STORAGE_NOT_EXIST_INFO}
	 * \else
	 * 存储组不存在事件, 取值参考 {@link ALARM_STORAGE_NOT_EXIST_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_STORAGE_NOT_EXIST        = 0x3167;

	/**
	 * \if ENGLISH_LANG
	 * Network fault event, refer to {@link ALARM_NETABORT_INFO}
	 * \else
	 * 网络故障事件, 取值参考 {@link ALARM_NETABORT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_NET_ABORT                = 0x3169;

	/**
	 * \if ENGLISH_LANG
	 * IP conflict event, refer to {@link ALARM_IP_CONFLICT_INFO}
	 * \else
	 * IP冲突事件, 取值参考 {@link ALARM_IP_CONFLICT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_IP_CONFLICT              = 0x3170;

	/**
	 * \if ENGLISH_LANG
	 * MAC conflict event, refer to {@link ALARM_MAC_CONFLICT_INFO}
	 * \else
	 * MAC冲突事件, 取值参考 {@link ALARM_MAC_CONFLICT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_MAC_CONFLICT             = 0x3171;

	/**
	 * \if ENGLISH_LANG
	 * power fault event, refer to {@link ALARM_POWERFAULT_INFO}
	 * \else
	 * 电源故障事件, 取值参考 {@link ALARM_POWERFAULT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_POWERFAULT               = 0x3172;

	/**
	 * \if ENGLISH_LANG
	 * Chassis intrusion, tamper alarm events, refer to {@link ALARM_CHASSISINTRUDED_INFO}
	 * \else
	 * 机箱入侵(防拆)报警事件, 取值参考 {@link ALARM_CHASSISINTRUDED_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_CHASSISINTRUDED          = 0x3173;

	/**
	 * \if ENGLISH_LANG
	 * Native extension alarm events, refer to {@link ALARM_ALARMEXTENDED_INFO}
	 * \else
	 * 本地扩展报警事件, 取值参考 {@link ALARM_ALARMEXTENDED_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ALARMEXTENDED            = 0x3174;

	/**
	 * \if ENGLISH_LANG
	 * Cloth removal state change events, refer to {@link ALARM_ARMMODE_CHANGE_INFO}
	 * \else
	 * 布撤防状态变化事件, 取值参考 {@link ALARM_ARMMODE_CHANGE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ARMMODE_CHANGE_EVENT     = 0x3175;

	/**
	 * \if ENGLISH_LANG
	 * The bypass state change events, refer to {@link ALARM_BYPASSMODE_CHANGE_INFO}
	 * \else
	 * 旁路状态变化事件, 取值参考 {@link ALARM_BYPASSMODE_CHANGE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BYPASSMODE_CHANGE_EVENT  = 0x3176;

	/**
	 * \if ENGLISH_LANG
	 * Entrance guard did not close events, refer to {@link ALARM_ACCESS_CTL_NOT_CLOSE_INFO}
	 * \else
	 * 门禁未关事件, 取值参考 {@link ALARM_ACCESS_CTL_NOT_CLOSE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ACCESS_CTL_NOT_CLOSE     = 0x3177;

	/**
	 * \if ENGLISH_LANG
	 * break-in event, refer to {@link ALARM_ACCESS_CTL_BREAK_IN_INFO}
	 * \else
	 * 闯入事件, refer to {@link ALARM_ACCESS_CTL_BREAK_IN_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ACCESS_CTL_BREAK_IN      = 0x3178;

	/**
	 * \if ENGLISH_LANG
	 * access Again and again event, refer to {@link ALARM_ACCESS_CTL_REPEAT_ENTER_INFO}
	 * \else
	 * 反复进入事件, refer to {@link ALARM_ACCESS_CTL_REPEAT_ENTER_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ACCESS_CTL_REPEAT_ENTER  = 0x3179;

	/**
	 * \if ENGLISH_LANG
	 * Stress CARDS event, refer to {@link ALARM_ACCESS_CTL_DURESS_INFO}
	 * \else
	 * 胁迫卡刷卡事件, refer to {@link ALARM_ACCESS_CTL_DURESS_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ACCESS_CTL_DURESS        = 0x3180;

	/**
	 * \if ENGLISH_LANG
	 * Access event, refer to {@link ALARM_ACCESS_CTL_EVENT_INFO}
	 * \else
	 * 门禁事件, refer to {@link ALARM_ACCESS_CTL_EVENT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ACCESS_CTL_EVENT         = 0x3181;

	/**
	 * \if ENGLISH_LANG
	 * Emergency ALARM EX2, refer to {@link ALARM_URGENCY_ALARM_EX2}(upgrade {@link FinalVar#SDK_URGENCY_ALARM_EX}, Artificially triggered emergency, general processing is linked external communication function requests for help
	 * \else
	 * 紧急报警EX2, 取值参考 {@link ALARM_URGENCY_ALARM_EX2} (对{@link FinalVar#SDK_URGENCY_ALARM_EX}的升级, 人为触发的紧急事件, 一般处理是联动外部通讯功能请求帮助
	 * \endif
	 */
	public static final int SDK_URGENCY_ALARM_EX2              = 0x3182;

	/**
	 * \if ENGLISH_LANG
	 * Alarm input source signal events, refer to {@link ALARM_INPUT_SOURCE_SIGNAL_INFO}(as long as there is input will generate the event, whether to play the current mode, unable to block)
	 * \else
	 * 报警输入源信号事件, 取值参考 {@link ALARM_INPUT_SOURCE_SIGNAL_INFO} (只要有输入就会产生该事件, 不论防区当前的模式，无法屏蔽)
	 * \endif
	 */
	public static final int SDK_ALARM_INPUT_SOURCE_SIGNAL      = 0x3183;

	/**
	 * \if ENGLISH_LANG
	 * analog alarm, refer to {@link ALARM_ANALOGALARM_EVENT_INFO}
	 * \else
	 * 模拟量报警输入通道事件, 取值参考 {@link ALARM_ANALOGALARM_EVENT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ANALOGALARM_EVENT        = 0x3184;

	/**
	 * \if ENGLISH_LANG
	 * Access control status event, refer to {@link ALARM_ACCESS_CTL_STATUS_INFO}
	 * \else
	 * 门禁状态事件, 取值参考 {@link ALARM_ACCESS_CTL_STATUS_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ACCESS_CTL_STATUS        = 0x3185;

	/**
	 * \if ENGLISH_LANG
	 * Access control snapshot event, refer to {@link ALARM_ACCESS_SNAP_INFO}
	 * \else
	 * 门禁抓图事件, 取值参考 {@link ALARM_ACCESS_SNAP_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ACCESS_SNAP              = 0x3186;

	/**
	 * \if ENGLISH_LANG
	 * Cancel alarm, refer to {@link ALARM_ALARMCLEAR_INFO}
	 * \else
	 * 消警事件, 取值参考 {@link ALARM_ALARMCLEAR_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ALARMCLEAR               = 0x3187;

	/**
	 * \if ENGLISH_LANG
	 * CID event, refer to {@link ALARM_CIDEVENT_INFO}
	 * \else
	 * CID事件, 取值参考 {@link ALARM_CIDEVENT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_CIDEVENT                 = 0x3188;

	/**
	 * \if ENGLISH_LANG
	 *  Device hand up evnt, refer to {@link ALARM_TALKING_HANGUP_INFO}
	 * \else
	 * 设备主动挂断对讲事件, 取值参考 {@link ALARM_TALKING_HANGUP_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_TALKING_HANGUP           = 0x3189;

	/**
	 * \if ENGLISH_LANG
	 * Bank card evnt, refer to {@link ALARM_BANKCARDINSERT_INFO}
	 * \else
	 * 银行卡插卡事件, 取值参考 {@link ALARM_BANKCARDINSERT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BANKCARDINSERT           = 0x318a;

	/**
	 * \if ENGLISH_LANG
	 * Emergency call alarm event, refer to {@link ALARM_RCEMERGENCY_CALL_INFO}
	 * \else
	 * 紧急呼叫报警事件, 取值参考 {@link ALARM_RCEMERGENCY_CALL_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_RCEMERGENCY_CALL         = 0x318b;

	/**
	 * \if ENGLISH_LANG
	 * Multi-people group unlock event, refer to {@link ALARM_OPEN_DOOR_GROUP_INFO}
	 * \else
	 * 多人组合开门事件, 取值参考 {@link ALARM_OPEN_DOOR_GROUP_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_OPENDOORGROUP            = 0x318c;

	/**
	 * \if ENGLISH_LANG
	 * get information event, refer to {@link ALARM_CAPTURE_FINGER_PRINT_INFO}
	 * \else
	 * 获取信息事件, 取值参考 {@link ALARM_CAPTURE_FINGER_PRINT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_FINGER_PRINT             = 0x318d;

	/**
	 * \if ENGLISH_LANG
	 * card no. record event, refer to {@link ALARM_CARD_RECORD_INFO}
	 * \else
	 * 卡号录像事件, 取值参考 {@link ALARM_CARD_RECORD_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_CARD_RECORD              = 0x318e;

	/**
	 * \if ENGLISH_LANG
	 * sub system status change event, refer to {@link ALARM_SUBSYSTEM_STATE_CHANGE_INFO}
	 * \else
	 * 子系统状态改变事件, 取值参考 {@link ALARM_SUBSYSTEM_STATE_CHANGE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_SUBSYSTEM_STATE_CHANGE   = 0x318f;

	/**
	 * \if ENGLISH_LANG
	 * battery scheduled warning event, refer to {@link ALARM_BATTERYPOWER_INFO}
	 * \else
	 * 电池电量定时通知事件, 取值参考 {@link ALARM_BATTERYPOWER_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BATTERYPOWER_EVENT       = 0x3190;

	/**
	 * \if ENGLISH_LANG
	 * bell status event, refer to {@link ALARM_BELLSTATUS_INFO}
	 * \else
	 * 警号状态事件, 取值参考 {@link ALARM_BELLSTATUS_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BELLSTATUS_EVENT         = 0x3191;

	/**
	 * \if ENGLISH_LANG
	 * zone status change event, refer to {@link ALARM_DEFENCE_STATUS_CHANGE_INFO},arm/disarm change event, bypass event status have different definitions,The status via QueryDevState() port SDK_DEVSTATE_DEFENCE_STATE command get
	 * \else
	 * 防区状态变化事件, 取值参考 {@link ALARM_DEFENCE_STATUS_CHANGE_INFO}, ，和布防撤防变化事件、旁路状态变化事件中的状态定义不同，该状态通过QueryDevState()接口的SDK_DEVSTATE_DEFENCE_STATE命令获取
	 * \endif
	 */
	public static final int SDK_ALARM_DEFENCE_STATE_CHANGE_EVENT = 0x3192;

	/**
	 * \if ENGLISH_LANG
	 * ticket statistics info event, refer to {@link ALARM_TICKET_STATISTIC}
	 * \else
	 * 车票统计信息事件, 取值参考 {@link ALARM_TICKET_STATISTIC}
	 * \endif
	 */
	public static final int SDK_ALARM_TICKET_STATISTIC         = 0x3193;

	/**
	 * \if ENGLISH_LANG
	 * login failed event, refer to {@link ALARM_LOGIN_FAILIUR_INFO}
	 * \else
	 * 登陆失败事件, 取值参考 {@link ALARM_LOGIN_FAILIUR_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_LOGIN_FAILIUR            = 0x3194;

	/**
	 * \if ENGLISH_LANG
	 * expansion module offline event, refer to {@link ALARM_MODULE_LOST_INFO}
	 * \else
	 * 扩展模块掉线事件, 取值参考 {@link ALARM_MODULE_LOST_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_MODULE_LOST              = 0x3195;

	/**
	 * \if ENGLISH_LANG
	 * PSTN offline event, refer to {@link ALARM_PSTN_BREAK_LINE_INFO}
	 * \else
	 * PSTN掉线事件, 取值参考 {@link ALARM_PSTN_BREAK_LINE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_PSTN_BREAK_LINE          = 0x3196;

	/**
	 * \if ENGLISH_LANG
	 * analog alarm evnet(instant event), specific sensor trigger, refer to {@link ALARM_ANALOGPULSE_INFO}
	 * \else
	 * 模拟量报警事件(瞬时型事件), 特定传感器类型时才触发, 取值参考 {@link ALARM_ANALOGPULSE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ANALOG_PULSE             = 0x3197;

	/**
	 * \if ENGLISH_LANG
	 * task confirmation event, refer to {@link ALARM_MISSION_CONFIRM_INFO}
	 * \else
	 * 任务确认事件, 取值参考 {@link ALARM_MISSION_CONFIRM_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_MISSION_CONFIRM          = 0x3198;

	/**
	 * \if ENGLISH_LANG
	 * device to platform notice event, refer to {@link ALARM_DEVICE_MSG_NOTIFY_INFO}
	 * \else
	 * 设备向平台发通知的事件, 取值参考 {@link ALARM_DEVICE_MSG_NOTIFY_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_DEVICE_MSG_NOTIFY        = 0x3199;

	/**
	 * \if ENGLISH_LANG
	 * parking timeout event, refer to {@link ALARM_VEHICLE_STANDING_OVER_TIME_INFO}
	 * \else
	 * 停车超时报警, 取值参考 {@link ALARM_VEHICLE_STANDING_OVER_TIME_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_VEHICLE_STANDING_OVER_TIME = 0x319A;

	/**
	 * \if ENGLISH_LANG
	 * e-fence event, refer to {@link ALARM_ENCLOSURE_ALARM_INFO}
	 * \else
	 * 电子围栏事件, 取值参考 {@link ALARM_ENCLOSURE_ALARM_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ENCLOSURE_ALARM          = 0x319B;

	/**
	 * \if ENGLISH_LANG
	 * station detection event, refer to {@link ALARM_GUARD_DETECT_INFO}, one in station first report the start event and last on in station report stop event before leave
	 * \else
	 * 岗亭检测事件, 取值参考 {@link ALARM_GUARD_DETECT_INFO} ,此事件岗亭有第一个人时上报start事件，岗亭最后一个人离开时上报stop 事件
	 * \endif
	 */
	public static final int SDK_ALARM_GUARD_DETECT			  = 0x319C;

	/**
	 * \if ENGLISH_LANG
	 * station info update event, report if people in station, refer to {@link ALARM_GUARD_UPDATE_INFO}
	 * \else
	 * 岗亭信息更新事件，只要岗亭有人员出入就上报, 取值参考 {@link ALARM_GUARD_UPDATE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_GUARD_INFO_UPDATE		  = 0x319D;

	/**
	 * \if ENGLISH_LANG
	 * Node activation event, refer to {@link ALARM_NODE_ACTIVE_INFO}
	 * \else
	 * 节点激活事件, 取值参考 {@link ALARM_NODE_ACTIVE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_NODE_ACTIVE              = 0x319e;

	/**
	 * \if ENGLISH_LANG
	 * Video static detection event, refer to {@link ALARM_VIDEO_STATIC_INFO}
	 * \else
	 * 视频静态检测事件, 取值参考 {@link ALARM_VIDEO_STATIC_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_VIDEO_STATIC             = 0x319F;

	/**
	 * \if ENGLISH_LANG
	 *  Active registration device re-login event, refer to {@link ALARM_REGISTER_REONLINE_INFO}
	 * \else
	 * 主动注册设备重新登陆事件, 取值参考 {@link ALARM_REGISTER_REONLINE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_REGISTER_REONLINE        = 0x31a0;

	/**
	 * \if ENGLISH_LANG
	 * ISCSI alarm event, refer to {@link ALARM_ISCSI_STATUS_INFO}
	 * \else
	 * ISCSI告警事件, 取值参考 {@link ALARM_ISCSI_STATUS_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ISCSI_STATUS             = 0x31a1;

	/**
	 * \if ENGLISH_LANG
	 * detection collection device alarm event, refer to {@link ALARM_SCADA_DEV_INFO}
	 * \else
	 * 检测采集设备报警事件, 取值参考 {@link ALARM_SCADA_DEV_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_SCADA_DEV_ALARM          = 0x31a2;

	/**
	 * \if ENGLISH_LANG
	 * Sub device status, refer to {@link ALARM_AUXILIARY_DEV_STATE}
	 * \else
	 * 辅助设备状态, 取值参考 {@link ALARM_AUXILIARY_DEV_STATE}
	 * \endif
	 */
	public static final int SDK_ALARM_AUXILIARY_DEV_STATE      = 0x31a3;

	/**
	 * \if ENGLISH_LANG
	 * Parking swipe card event, refer to {@link ALARM_PARKING_CARD}
	 * \else
	 * 停车刷卡事件, 取值参考 {@link ALARM_PARKING_CARD}
	 * \endif
	 */
	public static final int SDK_ALARM_PARKING_CARD             = 0x31a4;

	/**
	 * \if ENGLISH_LANG
	 * Alarm transmit event, refer to {@link ALARM_PROFILE_ALARM_TRANSMIT_INFO}
	 * \else
	 * 报警传输事件, 取值参考 {@link ALARM_PROFILE_ALARM_TRANSMIT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_PROFILE_ALARM_TRANSMIT   = 0x31a5;

	/**
	 * \if ENGLISH_LANG
	 * Vehicle acc event, refer to {@link ALARM_VEHICLE_ACC_INFO}
	 * \else
	 * 车辆ACC报警事件, 取值参考 {@link ALARM_VEHICLE_ACC_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_VEHICLE_ACC              = 0x31a6;

	/**
	 * \if ENGLISH_LANG
	 * suspiciouscar event, refer to {@link ALARM_TRAFFIC_SUSPICIOUSCAR_INFO}
	 * \else
	 * 嫌疑车辆上报事件, 取值参考 {@link ALARM_TRAFFIC_SUSPICIOUSCAR_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_SUSPICIOUSCAR    = 0x31a7;

	/**
	 * \if ENGLISH_LANG
	 * the event of latch state, refer to {@link ALARM_ACCESS_LOCK_STATUS_INFO}
	 * \else
	 * 门锁状态事件, 取值参考 {@link ALARM_ACCESS_LOCK_STATUS_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ACCESS_LOCK_STATUS       = 0x31a8;

	/**
	 * \if ENGLISH_LANG
	 * Finace scheme event, refer to {@link ALARM_FINACE_SCHEME_INFO}
	 * \else
	 * 理财经办事件, 取值参考 {@link ALARM_FINACE_SCHEME_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_FINACE_SCHEME            = 0x31a9;

	/**
	 * \if ENGLISH_LANG
	 * Thermal temperature abnormal event alarm, refer to {@link ALARM_HEATIMG_TEMPER_INFO}
	 * \else
	 * 热成像测温点温度异常报警事件, 取值参考 {@link ALARM_HEATIMG_TEMPER_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_HEATIMG_TEMPER           = 0x31aa;

	/**
	 * \if ENGLISH_LANG
	 * Device cancel bidirectional talk query event, refer to {@link ALARM_TALKING_IGNORE_INVITE_INFO}
	 * \else
	 * 设备取消对讲请求事件, 取值参考 {@link ALARM_TALKING_IGNORE_INVITE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_TALKING_IGNORE_INVITE    = 0x31ab;

	/**
	 * \if ENGLISH_LANG
	 * Vehicle Abrupt-turn event, refer to {@link ALARM_BUS_SHARP_TURN_INFO}
	 * \else
	 * 车辆急转事件, 取值参考 {@link ALARM_BUS_SHARP_TURN_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BUS_SHARP_TURN           = 0x31ac;

	/**
	 * \if ENGLISH_LANG
	 * vehicle abrupt stop event, refer to {@link ALARM_BUS_SCRAM_INFO}
	 * \else
	 * 车辆急停事件, 取值参考 {@link ALARM_BUS_SCRAM_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BUS_SCRAM                = 0x31ad;

	/**
	 * \if ENGLISH_LANG
	 * Vehicle abrupt speed up event, refer to {@link ALARM_BUS_SHARP_ACCELERATE_INFO}
	 * \else
	 * 车辆急加速事件, 取值参考 {@link ALARM_BUS_SHARP_ACCELERATE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BUS_SHARP_ACCELERATE     = 0x31ae;

	/**
	 * \if ENGLISH_LANG
	 * Vehicle abrupt slow down event, refer to {@link ALARM_BUS_SHARP_DECELERATE_INFO}
	 * \else
	 * 车辆急减速事件, 取值参考 {@link ALARM_BUS_SHARP_DECELERATE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BUS_SHARP_DECELERATE     = 0x31af;

	/**
	 * \if ENGLISH_LANG
	 * A&C data operation event, refer to {@link ALARM_ACCESS_CARD_OPERATE_INFO}
	 * \else
	 * 门禁卡数据操作事件, 取值参考 {@link ALARM_ACCESS_CARD_OPERATE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ACCESS_CARD_OPERATE      = 0x31b0;

	/**
	 * \if ENGLISH_LANG
	 * Policeman check in event, refer to {@link ALARM_POLICE_CHECK_INFO}
	 * \else
	 * 警员签到事件, 取值参考 {@link ALARM_POLICE_CHECK_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_POLICE_CHECK             = 0x31b1;

	/**
	 * \if ENGLISH_LANG
	 * Network alarm event, refer to {@link ALARM_NET_INFO}
	 * \else
	 * 网络报警事件, 取值参考 {@link ALARM_NET_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_NET                      = 0x31b2;

	/**
	 * \if ENGLISH_LANG
	 * New file event, refer to {@link ALARM_NEW_FILE_INFO}
	 * \else
	 * 新文件事件, 取值参考 {@link ALARM_NEW_FILE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_NEW_FILE                 = 0x31b3;

	/**
	 * \if ENGLISH_LANG
	 * Thermal fire position, refer to {@link ALARM_FIREWARNING_INFO}
	 * \else
	 * 热成像着火点事件 , 取值参考 {@link ALARM_FIREWARNING_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_FIREWARNING              = 0x31b5;

	/**
	 * \if ENGLISH_LANG
	 * Record loss event , refer to {@link ALARM_RECORD_LOSS_INFO}the HDD is OK, delete results from misoperation.
	 * \else
	 * 录像丢失事件, 取值参考 {@link ALARM_RECORD_LOSS_INFO} ,指硬盘完好的情况下,发生误删等原因引起
	 * \endif
	 */
	public static final int SDK_ALARM_RECORD_LOSS              = 0x31b6;

	/**
	 * \if ENGLISH_LANG
	 * Frame loss event, refer to {@link ALARM_VIDEO_FRAME_LOSS_INFO}. it results from poor network environment or insufficient encode capability
	 * \else
	 * 视频丢帧事件, 取值参考 {@link ALARM_VIDEO_FRAME_LOSS_INFO} ,比如网络不好或编码能力不足引起的丢帧
	 * \endif
	 */
	public static final int SDK_ALARM_VIDEO_FRAME_LOSS         = 0x31b7;

	/**
	 * \if ENGLISH_LANG
	 * Abnormal record results from HDD volume, refer to {@link ALARM_RECORD_VOLUME_FAILURE_INFO}
	 * \else
	 * 由保存录像的磁盘卷发生异常,引起的录像异常, 取值参考 {@link ALARM_RECORD_VOLUME_FAILURE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_RECORD_VOLUME_FAILURE    = 0x31b8;

	/**
	 * \if ENGLISH_LANG
	 * Image upload completion event, refer to {@link EVENT_SNAP_UPLOAD_INFO}
	 * \else
	 * 图上传完成事件, 取值参考 {@link EVENT_SNAP_UPLOAD_INFO}
	 * \endif
	 */
	public static final int SDK_EVENT_SNAP_UPLOAD              = 0x31b9;

	/**
	 * \if ENGLISH_LANG
	 * Audio detect event, refer to {@link ALARM_AUDIO_DETECT}
	 * \else
	 * 音频检测事件, 取值参考 {@link ALARM_AUDIO_DETECT}
	 * \endif
	 */
	public static final int SDK_ALARM_AUDIO_DETECT             = 0x31ba;

	/**
	 * \if ENGLISH_LANG
	 * Failure data amount during the image upload process, refer to {@link ALARM_UPLOADPIC_FAILCOUNT_INFO}
	 * \else
	 * 上传失败数据个数, 取值参考 {@link ALARM_UPLOADPIC_FAILCOUNT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_UPLOADPIC_FAILCOUNT      = 0x31bb;

	/**
	 * \if ENGLISH_LANG
	 * POS management event, refer to {@link ALARM_POS_MANAGE_INFO}
	 * \else
	 * POS管理事件事件, 取值参考 {@link ALARM_POS_MANAGE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_POS_MANAGE               = 0x31bc;

	/**
	 * \if ENGLISH_LANG
	 * remote control status, refer to {@link ALARM_REMOTE_CTRL_STATUS}
	 * \else
	 * 无线遥控器状态事件, 取值参考 {@link ALARM_REMOTE_CTRL_STATUS}
	 * \endif
	 */
	public static final int SDK_ALARM_REMOTE_CTRL_STATUS       = 0x31bd;

	/**
	 * \if ENGLISH_LANG
	 * desuetude, passenger card check, refer to {@link ALARM_PASSENGER_CARD_CHECK}
	 * \else
	 * 废弃, 乘客刷卡事件, 取值参考 {@link ALARM_PASSENGER_CARD_CHECK}
	 * \endif
	 */
	public static final int SDK_ALARM_PASSENGER_CARD_CHECK     = 0x31be;

	/**
	 * \if ENGLISH_LANG
	 * Sound event, refer to {@link ALARM_SOUND}
	 * \else
	 * 声音事件, 取值参考 {@link ALARM_SOUND}
	 * \endif
	 */
	public static final int SDK_ALARM_SOUND                    = 0x31bf;

	/**
	 * \if ENGLISH_LANG
	 * Lock break event, refer to {@link ALARM_LOCK_BREAK_INFO}
	 * \else
	 * 撬锁事件, 取值参考 {@link ALARM_LOCK_BREAK_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_LOCK_BREAK               = 0x31c0;

	/**
	 * \if ENGLISH_LANG
	 * Human Inside event, refer to {@link ALARM_HUMAN_INSIDE_INFO}
	 * \else
	 * 舱内有人事件, 取值参考 {@link ALARM_HUMAN_INSIDE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_HUMAN_INSIDE             = 0x31c1;

	/**
	 * \if ENGLISH_LANG
	 * Human tumble Inside, refer to {@link ALARM_HUMAN_TUMBLE_INSIDE_INFO}
	 * \else
	 * 舱内有人摔倒事件, 取值参考 {@link ALARM_HUMAN_TUMBLE_INSIDE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_HUMAN_TUMBLE_INSIDE      = 0x31c2;

	/**
	 * \if ENGLISH_LANG
	 * Lock entry trigger event, refer to {@link ALARM_DISABLE_LOCKIN_INFO}
	 * \else
	 * 闭锁进门按钮触发事件, 取值参考 {@link ALARM_DISABLE_LOCKIN_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_DISABLE_LOCKIN           = 0x31c3;

	/**
	 * \if ENGLISH_LANG
	 * Lock go out trigger, refer to {@link ALARM_DISABLE_LOCKOUT_INFO}
	 * \else
	 * 闭锁出门按钮触发事件, 取值参考 {@link ALARM_DISABLE_LOCKOUT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_DISABLE_LOCKOUT          = 0x31c4;

	/**
	 * \if ENGLISH_LANG
	 * break rules data upload failed , refer to {@link ALARM_UPLOAD_PIC_FAILED_INFO}
	 * \else
	 * 数据上传失败事件, 取值参考 {@link ALARM_UPLOAD_PIC_FAILED_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_UPLOAD_PIC_FAILED        = 0x31c5;

	/**
	 * \if ENGLISH_LANG
	 * flow meter info event, refer to {@link ALARM_FLOW_METER_INFO}
	 * \else
	 * 水流量计信息上报时间, 取值参考 {@link ALARM_FLOW_METER_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_FLOW_METER               = 0x31c6;

	/**
	 * \if ENGLISH_LANG
	 * search around wifi device, refer to {@link ALARM_WIFI_SEARCH_INFO}
	 * \else
	 * 获取到周围环境中WIFI设备上报事件, 取值参考 {@link ALARM_WIFI_SEARCH_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_WIFI_SEARCH              = 0x31c7;

	/**
	 * \if ENGLISH_LANG
	 * lowpower of wirelessdevice, refer to {@link ALARM_WIRELESSDEV_LOWPOWER_INFO}
	 * \else
	 * 获取无线设备低电量上报事件, 取值参考 {@link ALARM_WIRELESSDEV_LOWPOWER_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_WIRELESSDEV_LOWPOWER     = 0x31C8;

	/**
	 * \if ENGLISH_LANG
	 * Ptz Diagnoses event, refer to {@link ALARM_PTZ_DIAGNOSES_INFO}
	 * \else
	 * 云台诊断事件, 取值参考 {@link ALARM_PTZ_DIAGNOSES_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_PTZ_DIAGNOSES			   = 0x31c9;

	/**
	 * \if ENGLISH_LANG
	 * flash light fault event, refer to {@link ALARM_FLASH_LIGHT_FAULT_INFO}
	 * \else
	 * 爆闪灯(闪光灯)报警事件 , 取值参考 {@link ALARM_FLASH_LIGHT_FAULT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_FLASH_LIGHT_FAULT        = 0x31ca;

	/**
	 * \if ENGLISH_LANG
	 * stroboscopic light fault event, refer to {@link ALARM_STROBOSCOPIC_LIGTHT_FAULT_INFO}
	 * \else
	 * 频闪灯报警事件 , 取值参考 {@link ALARM_STROBOSCOPIC_LIGTHT_FAULT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_STROBOSCOPIC_LIGTHT_FAULT = 0x31cb;

	/**
	 * \if ENGLISH_LANG
	 * NumberStat event, refer to {@link ALARM_HUMAN_NUMBER_STATISTIC_INFO}
	 * \else
	 * 人数量/客流量统计事件, 取值参考 {@link ALARM_HUMAN_NUMBER_STATISTIC_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_HUMAM_NUMBER_STATISTIC   = 0x31cc;

	/**
	 * \if ENGLISH_LANG
	 * Video unfocus , refer to {@link ALARM_VIDEOUNFOCUS_INFO}
	 * \else
	 * 视频虚焦报警, 取值参考 {@link ALARM_VIDEOUNFOCUS_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_VIDEOUNFOCUS             = 0x31ce;

	/**
	 * \if ENGLISH_LANG
	 * Video recond buffer drop frame event, refer to {@link ALARM_BUF_DROP_FRAME_INFO}
	 * \else
	 * 录像缓冲区丢帧事件, 取值参考 {@link ALARM_BUF_DROP_FRAME_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BUF_DROP_FRAME           = 0x31cd;

	/**
	 * \if ENGLISH_LANG
	 * Abnormal event when main broad'version and sub broad'version different, refer to {@link ALARM_DOUBLE_DEV_VERSION_ABNORMAL_INFO}
	 * \else
	 * 双控设备主板与备板之间版本信息不一致异常事件, 取值参考 {@link ALARM_DOUBLE_DEV_VERSION_ABNORMAL_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_DOUBLE_DEV_VERSION_ABNORMAL = 0x31cf;

	/**
	 * \if ENGLISH_LANG
	 * Switch with main and sub, refer to {@link ALARM_DCSSWITCH_INFO}
	 * \else
	 * 主备切换事件 集群切换报警 , 取值参考 {@link ALARM_DCSSWITCH_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_DCSSWITCH                 = 0x31d0;

	/**
	 * \if ENGLISH_LANG
	 * Radar connect state, refer to {@link ALARM_RADAR_CONNECT_STATE_INFO}
	 * \else
	 * 雷达状态事件, 取值参考 {@link ALARM_RADAR_CONNECT_STATE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_RADAR_CONNECT_STATE       = 0x31d1;

	/**
	 * \if ENGLISH_LANG
	 * Defence arming status change, refer to {@link ALARM_DEFENCE_ARMMODECHANGE_INFO}
	 * \else
	 * 防区布撤防状态改变事件, 取值参考 {@link ALARM_DEFENCE_ARMMODECHANGE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_DEFENCE_ARMMODE_CHANGE    = 0x31d2;

	/**
	 * \if ENGLISH_LANG
	 * Subsystem arming status change, refer to {@link ALARM_SUBSYSTEM_ARMMODECHANGE_INFO}
	 * \else
	 * 子系统布撤防状态改变事件, 取值参考 {@link ALARM_SUBSYSTEM_ARMMODECHANGE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_SUBSYSTEM_ARMMODE_CHANGE  = 0x31d3;

	/**
	 * \if ENGLISH_LANG
	 * infrared detection information event, refer to {@link ALARM_RFID_INFO}
	 * \else
	 * 红外线检测信息事件, 取值参考 {@link ALARM_RFID_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_RFID_INFO                 = 0x31d4;

	/**
	 * \if ENGLISH_LANG
	 * smoke detection, refer to {@link ALARM_SMOKE_DETECTION}
	 * \else
	 * 烟雾报警事件, 取值参考 {@link ALARM_SMOKE_DETECTION}
	 * \endif
	 */
	public static final int SDK_ALARM_SMOKE_DETECTION           = 0x31d5;

	/**
	 * \if ENGLISH_LANG
	 * TemperatureDifference Between Rule, refer to {@link ALARM_BETWEENRULE_DIFFTEMPER_INFO}
	 * \else
	 * 热成像规则间温差异常报警, 取值参考 {@link ALARM_BETWEENRULE_DIFFTEMPER_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BETWEENRULE_TEMP_DIFF     = 0x31d6;

	/**
	 * \if ENGLISH_LANG
	 * Traffic picture analyse, refer to {@link ALARM_PIC_ANALYSE_INFO}
	 * \else
	 * 图片二次分析事件, 取值参考 {@link ALARM_PIC_ANALYSE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_PIC_ANALYSE	    = 0x31d7;

	/**
	 * \if ENGLISH_LANG
	 * Hotspot warning, refer to {@link ALARM_HOTSPOT_WARNING_INFO}
	 * \else
	 * 热成像热点异常报警, 取值参考 {@link ALARM_HOTSPOT_WARNING_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_HOTSPOT_WARNING           = 0x31d8;

	/**
	 * \if ENGLISH_LANG
	 * coldspot warning, refer to {@link ALARM_COLDSPOT_WARNING_INFO}
	 * \else
	 * 热成像冷点异常报警, 取值参考 {@link ALARM_COLDSPOT_WARNING_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_COLDSPOT_WARNING          = 0x31d9;

	/**
	 * \if ENGLISH_LANG
	 * firewarning, refer to {@link ALARM_FIREWARNING_INFO_DETAIL}
	 * \else
	 * 热成像火情的报警信息上报, 取值参考 {@link ALARM_FIREWARNING_INFO_DETAIL}
	 * \endif
	 */
	public static final int SDK_ALARM_FIREWARNING_INFO			= 0x31da;

	/**
	 * \if ENGLISH_LANG
	 * face overheating, refer to {@link ALARM_FACE_OVERHEATING_INFO}
	 * \else
	 * 热成像人体温度异常预警, 取值参考 {@link ALARM_FACE_OVERHEATING_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_FACE_OVERHEATING  	    = 0x31db;

	/**
	 * \if ENGLISH_LANG
	 * Sensor abnormal, refer to {@link ALARM_SENSOR_ABNORMAL_INFO}
	 * \else
	 * 探测器异常报警, 取值参考 {@link ALARM_SENSOR_ABNORMAL_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_SENSOR_ABNORMAL           = 0X31dc;

	/**
	 * \if ENGLISH_LANG
	 * detection, refer to {@link ALARM_PATIENTDETECTION_INFO}
	 * \else
	 * 预览活动状态报警事件, 取值参考 {@link ALARM_PATIENTDETECTION_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_PATIENTDETECTION          = 0x31de;

	/**
	 * \if ENGLISH_LANG
	 * radar high speed detection, refer to {@link ALARM_RADAR_HIGH_SPEED_INFO}
	 * \else
	 * 雷达监测超速报警事件, 取值参考 {@link ALARM_RADAR_HIGH_SPEED_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_RADAR_HIGH_SPEED          = 0x31df;

	/**
	 * \if ENGLISH_LANG
	 * Polling Alarm, refer to {@link ALARM_POLLING_ALARM_INFO}
	 * \else
	 * 设备巡检报警事件, 取值参考 {@link ALARM_POLLING_ALARM_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_POLLING_ALARM             = 0x31e0;

	/**
	 * \if ENGLISH_LANG
	 * the alarm event for ITC_HWS000, refer to {@link ALARM_ITC_HWS000}
	 * \else
	 * 虚点测速仪设备事件与报警, 取值参考 {@link ALARM_ITC_HWS000}
	 * \endif
	 */
	public static final int SDK_ALARM_ITC_HWS000                = 0x31e1;

	/**
	 * \if ENGLISH_LANG
	 * Traffic Strobe State, refer to {@link ALARM_TRAFFICSTROBESTATE_INFO}
	 * \else
	 * 道闸栏状态事件, 取值参考 {@link ALARM_TRAFFICSTROBESTATE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFICSTROBESTATE        = 0x31e2;

	/**
	 * \if ENGLISH_LANG
	 * telephone number check event, refer to {@link ALARM_TELEPHONE_CHECK_INFO}
	 * \else
	 * 手机号码上报事件, 取值参考 {@link ALARM_TELEPHONE_CHECK_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_TELEPHONE_CHECK           = 0X31e3;

	/**
	 * \if ENGLISH_LANG
	 * Paste Detection, refer to {@link ALARM_PASTE_DETECTION_INFO}
	 * \else
	 * 贴条事件, 取值参考 {@link ALARM_PASTE_DETECTION_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_PASTE_DETECTION           = 0x31e4;

	/**
	 * \if ENGLISH_LANG
	 * the alarm event for Shooting, refer to {@link ALARM_PIC_SHOOTINGSCORERECOGNITION_INFO}
	 * \else
	 * 打靶像机事件, 取值参考 {@link ALARM_PIC_SHOOTINGSCORERECOGNITION_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_SHOOTINGSCORERECOGNITION  = 0x31e5;

	/**
	 * \if ENGLISH_LANG
	 * the alarm event for swipe overtime, refer to {@link ALARM_SWIPE_OVERTIME_INFO}
	 * \else
	 * 超时未刷卡事件, 取值参考 {@link ALARM_SWIPE_OVERTIME_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_SWIPEOVERTIME             = 0X31e6;

	/**
	 * \if ENGLISH_LANG
	 * the alarm event for driving without card, refer to {@link ALARM_DRIVING_WITHOUTCARD_INFO}
	 * \else
	 * 无卡驾驶事件, 取值参考 {@link ALARM_DRIVING_WITHOUTCARD_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_DRIVING_WITHOUTCARD       = 0X31e7;

	/**
	 * \if ENGLISH_LANG
	 * red light event, refer to {@link ALARM_TRAFFIC_PEDESTRIAN_RUN_REDLIGHT_DETECTION_INFO}
	 * \else
	 * 闯红灯事件, 取值参考 {@link ALARM_TRAFFIC_PEDESTRIAN_RUN_REDLIGHT_DETECTION_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_PEDESTRIAN_RUN_REDLIGHT_DETECTION = 0x31e8;

	/**
	 * \if ENGLISH_LANG
	 * the alarm event for fight detection, refer to {@link NET_ALARM_FIGHTDETECTION}
	 * \else
	 * 斗殴事件, 取值参考 {@link NET_ALARM_FIGHTDETECTION}
	 * \endif
	 */
	public static final int SDK_ALARM_FIGHTDETECTION			= 0x31e9;

	/**
	 * \if ENGLISH_LANG
	 * the alarm event for 4G over flow threshold, refer to {@link NET_ALARM_OIL_4G_OVERFLOW_INFO}
	 * \else
	 * 4G流量超过阈值的报警事件, 取值参考 {@link NET_ALARM_OIL_4G_OVERFLOW_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_OIL_4G_OVERFLOW		    = 0x31ea;

	/**
	 * \if ENGLISH_LANG
	 * VTO access identify, refer to {@link NET_ALARM_ACCESSIDENTIFY}
	 * \else
	 * VTO目标识别事件, 取值参考 {@link NET_ALARM_ACCESSIDENTIFY}
	 * \endif
	 */
	public static final int SDK_ALARM_ACCESSIDENTIFY			= 0X31eb;

	/**
	 * \if ENGLISH_LANG
	 * the alarm event for Abnormal power switcher, refer to {@link DEV_ALRAM_POWERSWITCHER_INFO}
	 * \else
	 * 供电电源开关状态异常报警事件, 取值参考 {@link DEV_ALRAM_POWERSWITCHER_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_POWER_SWITCHER_ALARM      = 0x31ec;

	/**
	 * \if ENGLISH_LANG
	 * the alarm event for scene change, refer to {@link ALARM_PIC_SCENECHANGE_INFO}
	 * \else
	 * 场景变更事件, 取值参考 {@link ALARM_PIC_SCENECHANGE_INFO} ,原来是VideoAbnormalDetection的SceneChange子事件，因需求变更，改为单独事件类型
	 * \endif
	 */
	public static final int SDK_ALARM_SCENNE_CHANGE_ALARM       = 0x31ed;

	/**
	 * \if ENGLISH_LANG
	 * the alarm event for WIFI virtual information, refer to {@link ALARM_WIFI_VIRTUALINFO_SEARCH_INFO}
	 * \else
	 * WIFI虚拟身份上报事件, 取值参考 {@link ALARM_WIFI_VIRTUALINFO_SEARCH_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_WIFI_VIRTUALINFO_SEARCH   = 0x31ef;

	/**
	 * \if ENGLISH_LANG
	 * traffic overspeed event, refer to {@link ALARM_TRAFFIC_OVERSPEED_INFO}
	 * \else
	 * 超速事件, 取值参考 {@link ALARM_TRAFFIC_OVERSPEED_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_OVERSPEED		    = 0x31f0;

	/**
	 * \if ENGLISH_LANG
	 * traffic underspeed event, refer to {@link ALARM_TRAFFIC_UNDERSPEED_INFO}
	 * \else
	 * 欠速事件, 取值参考 {@link ALARM_TRAFFIC_UNDERSPEED_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_UNDERSPEED		= 0x31f1;

	/**
	 * \if ENGLISH_LANG
	 * traffic pedestrain event, refer to {@link ALARM_TRAFFIC_PEDESTRAIN_INFO}
	 * \else
	 * 交通行人事件, 取值参考 {@link ALARM_TRAFFIC_PEDESTRAIN_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_PEDESTRAIN		= 0x31f2;

	/**
	 * \if ENGLISH_LANG
	 * traffic jam event, refer to {@link ALARM_TRAFFIC_JAM}
	 * \else
	 * 交通拥堵事件, 取值参考 {@link ALARM_TRAFFIC_JAM}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_JAM			    = 0x31f3;

	/**
	 * \if ENGLISH_LANG
	 * traffic parking event, refer to {@link ALARM_TRAFFIC_PARKING_INFO}
	 * \else
	 * 停车事件, 取值参考 {@link ALARM_TRAFFIC_PARKING_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_PARKING		    = 0x31f4;

	/**
	 * \if ENGLISH_LANG
	 * traffic throw event, refer to {@link ALARM_TRAFFIC_THROW_INFO}
	 * \else
	 * 交通抛洒物品事件, 取值参考 {@link ALARM_TRAFFIC_THROW_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_THROW			    = 0x31f5;

	/**
	 * \if ENGLISH_LANG
	 * traffic retrograde event, refer to {@link ALARM_TRAFFIC_RETROGRADE_INFO}
	 * \else
	 * 逆行事件, 取值参考 {@link ALARM_TRAFFIC_RETROGRADE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_RETROGRADE		= 0x31f6;

	/**
	 * \if ENGLISH_LANG
	 * VTS state update, refer to {@link ALARM_VTSTATE_UPDATE_INFO}
	 * \else
	 * VTS状态上报, 取值参考 {@link ALARM_VTSTATE_UPDATE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_VTSTATE_UPDATE			= 0x31f7;

	/**
	 * \if ENGLISH_LANG
	 * the alarm event for call no answer, under directly connected, refer to {@link NET_ALARM_CALL_NO_ANSWERED_INFO}
	 * \else
	 * 直连情况下，呼叫无答应事件, 取值参考 {@link NET_ALARM_CALL_NO_ANSWERED_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_CALL_NO_ANSWERED          = 0x31f8;

	/**
	 * \if ENGLISH_LANG
	 * User Lock Alarm Event, refer to {@link ALARM_USER_LOCK_EVENT_INFO}
	 * \else
	 * 用户锁定报警事件, 取值参考 {@link ALARM_USER_LOCK_EVENT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_USER_LOCK_EVENT		    = 0x31f9;

	/**
	 * \if ENGLISH_LANG
	 * retrogade dection event, refer to {@link ALARM_RETROGRADE_DETECTION_INFO}
	 * \else
	 * 人员逆行事件, 取值参考 {@link ALARM_RETROGRADE_DETECTION_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_RETROGRADE_DETECTION	    = 0x31fa;

	/**
	 * \if ENGLISH_LANG
	 * AIO App config event, refer to {@link ALARM_AIO_APP_CONFIG_EVENT_INFO}
	 * \else
	 * AIO报警事件, 取值参考 {@link ALARM_AIO_APP_CONFIG_EVENT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_AIO_APP_CONFIG_EVENT	    = 0x31fb;

	/**
	 * \if ENGLISH_LANG
	 * Open door with malice; Corresponding to {@link ALARM_ACCESS_CTL_MALICIOUS}
	 * \else
	 * 恶意开门事件；对应结构体 {@link ALARM_ACCESS_CTL_MALICIOUS}
	 * \endif
	 */
	public static final int SDK_ALARM_ACCESS_CTL_MALICIOUS            = 0x3215;

	/**
	 * \if ENGLISH_LANG
	 * UserID Register; Corresponding to {@link ALARM_ACCESS_CTL_USERID_REGISTER}
	 * \else
	 * 用户已注册事件；对应结构体 {@link ALARM_ACCESS_CTL_USERID_REGISTER}
	 * \endif
	 */
	public static final int SDK_ALARM_ACCESS_CTL_USERID_REGISTER	  = 0x3216;

	/**
	 * \if ENGLISH_LANG
	 * ReverseLock alarm; Corresponding to {@link ALARM_ACCESS_CTL_REVERSELOCK}
	 * \else
	 * 锁体状态信息变化事件，对应结构体 {@link ALARM_ACCESS_CTL_REVERSELOCK}
	 * \endif
	 */
	public static final int SDK_ALARM_ACCESS_CTL_REVERSELOCK           = 0x3217;

	/**
	 * \if ENGLISH_LANG
	 *  UserID delete; Corresponding to {@link ALARM_ACCESS_CTL_USERID_DELETE}
	 * \else
	 * 删除用户事件；对应结构体{@link ALARM_ACCESS_CTL_USERID_DELETE}
	 * \endif
	 */
	public static final int SDK_ALARM_ACCESS_CTL_USERID_DELETE         = 0x3218;

	/**
	 * \if ENGLISH_LANG
	 * door bell; Corresponding to {@link ALARM_ACCESS_DOOR_BELL_INFO}
	 * \else
	 * 门铃响铃事件；对应结构体{@link ALARM_ACCESS_DOOR_BELL_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ACCESS_DOOR_BELL                 = 0x3219;

	/**
	 * \if ENGLISH_LANG
	 * Wireless device restore settings; Corresponding to {@link ALARM_ACCESS_FACTORY_RESET_INFO}
	 * \else
	 * 门锁恢复出厂设置事件；对应结构体{@link ALARM_ACCESS_FACTORY_RESET_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ACCESS_FACTORY_RESET             = 0x321a;


	/**
	 * \if ENGLISH_LANG
	 * alarm of regional population statistics ; Corresponding to {@link ALARM_MAN_NUM_INFO}
	 * \else
	 * 立体视觉区域内人数统计报警；对应结构体{@link ALARM_MAN_NUM_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_MAN_NUM_DETECTION             = 0x3223;


	/**
	 * \if ENGLISH_LANG
	 *  alarm of Tired Physiological crossponding to {@link ALARM_TIRED_PHYSIOLOGICAL}
	 * \else
	 * 生理疲劳事件 对应 {@link ALARM_TIRED_PHYSIOLOGICAL}
	 * \endif
	 */
	public static final int SDK_ALARM_TIRED_PHYSIOLOGICAL 				= 0x3234;

	/**
	 * \if ENGLISH_LANG
	 *  alarm of Calling When Driving crossponding to {@link ALARM_CALLING_WHEN_DRIVING}
	 * \else
	 *  开车打电话事件 对应 {@link ALARM_CALLING_WHEN_DRIVING}
	 * \endif
	 */
	public static final int SDK_ALARM_CALLING_WHEN_DRIVING				 =	0x3235;

	/**
	 * \if ENGLISH_LANG
	 *  alarm of Traffic Driver Smoking crossponding to {@link ALARM_TRAFFIC_DRIVER_SMOKING}
	 * \else
	 *  开车抽烟事件 对应 {@link .ALARM_TRAFFIC_DRIVER_SMOKING}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_DRIVER_SMOKING	 		=	0x3236;

	/**
	 * \if ENGLISH_LANG
	 *  alarm of Traffic Driver Lower Head crossponding to {@link  ALARM_TRAFFIC_DRIVER_LOWER_HEAD}
	 * \else
	 *  开车低头报警事件 对应{@link  ALARM_TRAFFIC_DRIVER_LOWER_HEAD}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_DRIVER_LOWER_HEAD 		=	0x3237;

	/**
	 * \if ENGLISH_LANG
	 *  alarm of Traffic Driver Look Around crossponding to {@link  ALARM_TRAFFIC_DRIVER_LOOK_AROUND}
	 * \else
	 *  开车左顾右盼报警事件 对应{@link  ALARM_TRAFFIC_DRIVER_LOOK_AROUND}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_DRIVER_LOOK_AROUND 		=	0x3238;

	/**
	 * \if ENGLISH_LANG
	 *  alarm of Traffic Driver Leave Post   crossponding to {@link ALARM_TRAFFIC_DRIVER_LEAVE_POST}
	 * \else
	 *  开车离岗报警事件对应 {@link ALARM_TRAFFIC_DRIVER_LEAVE_POST}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_DRIVER_LEAVE_POST 		=	0x3239;

	/**
	 * \if ENGLISH_LANG
	 *  alarm of Traffic Driver Yawn crossponding to {@link ALARM_TRAFFIC_DRIVER_YAWN}
	 * \else
	 *  开车打哈欠报警事件 对应 {@link ALARM_TRAFFIC_DRIVER_YAWN}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_DRIVER_YAWN			=	0x323a;

	/**
	 * \if ENGLISH_LANG
	 *  Vehicle Position Event crossponding to {@link ALARM_TRAFFIC_VEHICLE_POSITION}
	 * \else
	 *  车辆位置事件 对应 {@link ALARM_TRAFFIC_VEHICLE_POSITION}
	 * \endif
	 */
	public static final int SDK_ALARM_TRAFFIC_VEHICLE_POSITION      =  0x323c;

	/**
	 * \if ENGLISH_LANG
	 *  Video Blind Event crossponding to {@link ALARM_VIDEO_BLIND_INFO}
	 * \else
	 *  视频遮挡事件 对应 {@link ALARM_VIDEO_BLIND_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_VIDEOBLIND      =  0x323e;

	/**
	 * \if ENGLISH_LANG
	 * cgi triggered manual video, recording(Corresponding to {@link ALARM_CGIRECORD})
	 * \else
	 * cgi触发手动录像, (对应{@link ALARM_CGIRECORD})
	 * \endif
	 */
	public static final int SDK_ALARM_CGIRECORD                  		= 0x3251;

	/**
	 * \if ENGLISH_LANG
	 * user lock alarm event, recording(Corresponding to {@link ALARM_USERLOCK_INFO})
	 * \else
	 * 用户锁定报警事件,三代 (对应{@link ALARM_USERLOCK_INFO})
	 * \endif
	 */
	public static final int SDK_ALARM_USERLOCK                  		= 0x3300;

	/**
	 * \if ENGLISH_LANG
	 *  NAS file status; Corresponding to {@link ALARM_NASFILE_STATUS_INFO}
	 * \else
	 * NAS文件状态；对应结构体{@link ALARM_NASFILE_STATUS_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_NASFILE_STATUS         = 0x3302;

	/**
	 * \if ENGLISH_LANG
	 *  alarm of face feature abstract; Corresponding to {@link ALARM_FACE_FEATURE_ABSTRACT_INFO}
	 * \else
	 * 目标特征向量重建结果事件；对应结构体{@link ALARM_FACE_FEATURE_ABSTRACT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_FACE_FEATURE_ABSTRACT         = 0x3306;

	/**
	 * \if ENGLISH_LANG
	 *  Area arm mode change; Corresponding to {@link ALARM_AREAARM_MODECHANGE_INFO}
	 * \else
	 * 区域防区模式改变；对应结构体{@link ALARM_AREAARM_MODECHANGE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_AREAARM_MODECHANGE  	 = 0x330e;

	/**
	 * \if ENGLISH_LANG
	 *  Zone module lost; Corresponding to {@link ALARM_ZONEMODULE_LOST_INFO}
	 * \else
	 * 防区模块掉线；对应结构体{@link ALARM_ZONEMODULE_LOST_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ZONEMODULELOST         = 0x330f;

	/**
	 * \if ENGLISH_LANG
	 *  Area alarm; Corresponding to {@link ALARM_AREAALARM_INFO}
	 * \else
	 * 区域报警；对应结构体{@link ALARM_AREAALARM_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_AREAALARM        	 = 0x3310;

	/**
	 * \if ENGLISH_LANG
	 *  Zone open; Corresponding to {@link ALARM_ZONEOPEN_INFO}
	 * \else
	 * 防区打开；对应结构体{@link ALARM_ZONEOPEN_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ZONEOPEN         = 0x3311;

	/**
	 * \if ENGLISH_LANG
	 *  system tamper; Corresponding to {@link ALARM_SYSTEMTAMPER_INFO}
	 * \else
	 * 防拆事件；对应结构体{@link ALARM_SYSTEMTAMPER_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_SYSTEMTAMPER         = 0x3312;

	/**
	 * \if ENGLISH_LANG
	 *  alarm of coaxial alarm local; Corresponding to {@link ALARM_COAXIAL_ALARM_LOCAL_INFO}
	 * \else
	 * 同轴开关量报警事件；对应结构体{@link ALARM_COAXIAL_ALARM_LOCAL_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_COAXIAL_ALARM_LOCAL         = 0x3354;

	/**
	 * \if ENGLISH_LANG
	 *  alarm of NAS File Remove Status; Corresponding to {@link ALARM_NAS_FILE_REMOVE_STATUS_INFO}
	 * \else
	 * NAS文件删除状态事件；对应结构体{@link ALARM_NAS_FILE_REMOVE_STATUS_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_NAS_FILE_REMOVE_STATUS         = 0x3355;

	/**
	 * \if ENGLISH_LANG
	 *  alarm of NAS APK Install Request; Corresponding to {@link ALARM_NAS_APK_INSTALL_REQUEST_INFO}
	 * \else
	 * 请求设备安装APK事件；对应结构体{@link ALARM_NAS_APK_INSTALL_REQUEST_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_NAS_APK_INSTALL_REQUEST        = 0x3356;

	/**
	 * \if ENGLISH_LANG
	 *  alarm of NAS APK Install Status; Corresponding to {@link ALARM_NAS_APK_INSTALL_STATUS_INFO}
	 * \else
	 * 设备安装APK状态事件；对应结构体{@link ALARM_NAS_APK_INSTALL_STATUS_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_NAS_APK_INSTALL_STATUS         = 0x3357;

	/**
	 * \if ENGLISH_LANG
	 *  alarm of File Compress Status; Corresponding to {@link ALARM_FILE_COMPRESS_STATUS_INFO}
	 * \else
	 * 文件压缩解压状态事件；对应结构体{@link ALARM_FILE_COMPRESS_STATUS_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_FILE_COMPRESS_STATUS         = 0x3358;

	/**
	 * \if ENGLISH_LANG
	 *  alarm of QR code check; Corresponding to {@link ALARM_QR_CODE_CHECK_INFO}
	 * \else
	 * 二维码上报事件；对应结构体{@link ALARM_QR_CODE_CHECK_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_QR_CODE_CHECK         = 0x335A;

	/**
	 * \if ENGLISH_LANG
	 * alarm of Jablotron alarm(Corresponding to {@link ALARM_JABLOTRONALARM_INFO})
	 * \else
	 * 客户报警产品(对应结构体 {@link ALARM_JABLOTRONALARM_INFO})
	 * \endif
	 */
	public static final int SDK_ALARM_JABLOTRON_ALARM				  = 0x3434;


	/**
	 * \if ENGLISH_LANG
	 * The battery camera reaches the upper limit of the streaming preview time and shutdown notification event(Corresponding to {@link ALARM_TIME_TO_POWEROFF_INFO})
	 * \else
	 * 电池相机达到拉流预览时间上限关机通知事件(对应结构体 {@link ALARM_TIME_TO_POWEROFF_INFO})
	 * \endif
	 */
	public static final int SDK_ALARM_TIME_TO_POWEROFF				  = 0x3464;

	/**
	 * \if ENGLISH_LANG
	 * Non motor vehicle entering elevator event(corresponding to ALARM_NONMOTOR_ENTRYING_INFO)
	 * \else
	 * 非机动车进入电梯事件,对应结构体 {@link ALARM_NONMOTOR_ENTRYING_INFO})
	 * \endif
	 */
	public static final int SDK_ALARM_NONMOTOR_ENTRYING				  = 0x3474;

	/**
	 * \if ENGLISH_LANG
	 * animal detection event. corresponding to{@link ALARM_ANIMAL_DETECTION_INFO}
	 * \else
	 * 动物检测事件,对应结构体 {@link ALARM_ANIMAL_DETECTION_INFO})
	 * \endif
	 */
	public static final int SDK_ALARM_ANIMAL_DETECTION				  = 0x3487;

	/**
	 * \if ENGLISH_LANG
	 * Gesture detection event (corresponding to{@link ALARM_GESTURE_DETECTION_INFO})
	 * \else
	 * 手势检测事件 {@link ALARM_GESTURE_DETECTION_INFO})
	 * \endif
	 */
	public static final int SDK_ALARM_GESTURE_DETECTION     = 0x3492;

	/**
	 * \if ENGLISH_LANG
	 * The app interface displays some specific state change events of the device (corresponding to{@link ALARM_LEFUNCTION_STATUS_SYNC_INFO})
	 * \else
	 * App界面显示设备某些特定的状态变化事件 {@link ALARM_LEFUNCTION_STATUS_SYNC_INFO})
	 * \endif
	 */
	public static final int SDK_ALARM_LEFUNCTION_STATUS_SYNC     = 0x349A;

	/**
	 * \if ENGLISH_LANG
	 * Mini Radar alarm event (corresponding to{@link NET_ALARM_MINIINDOOR_RADAR_ALARM_INFO})
	 * \else
	 * Mini雷达报警事件 {@link NET_ALARM_MINIINDOOR_RADAR_ALARM_INFO})
	 * \endif
	 */
	public static final int SDK_ALARM_MINIINDOOR_RADAR_ALARM     = 0x34A7;

	/**
	 * \if ENGLISH_LANG
	 * Safety alarm event (corresponding to{@link NET_ALARM_SAFETY_ABNORMAL_INFO})
	 * \else
	 * 安全报警事件 {@link NET_ALARM_SAFETY_ABNORMAL_INFO})
	 * \endif
	 */
	public static final int SDK_ALARM_SAFETY_ABNORMAL     = 0x34AF;

	/**
	 * \if ENGLISH_LANG
	 * Intelli Module High Temp event (corresponding to{@link NET_ALARM_INTELLI_MODULE_HIGH_TEMP_INFO})
	 * \else
	 * 智能模块温度异常事件 {@link NET_ALARM_INTELLI_MODULE_HIGH_TEMP_INFO})
	 * \endif
	 */
	public static final int SDK_ALARM_INTELLI_MODULE_HIGH_TEMP     = 0x34BB;

	/**
	 * \if ENGLISH_LANG
	 * Intelli Module Offline event (corresponding to{@link NET_ALARM_INTELLI_MODULE_OFFLINE_INFO})
	 * \else
	 * 智能模块断线事件 {@link NET_ALARM_INTELLI_MODULE_OFFLINE_INFO})
	 * \endif
	 */
	public static final int SDK_ALARM_INTELLI_MODULE_OFFLINE     = 0x34BC;

	/**
	 * \if ENGLISH_LANG
	 * Trigger Mode Event (corresponding to{@link NET_ALARM_VEHICLE_TRIGGER_MODE_INFO})
	 * \else
	 * 触发模式事件 {@link NET_ALARM_VEHICLE_TRIGGER_MODE_INFO})
	 * \endif
	 */
	public static final int SDK_ALARM_VEHICLE_TRIGGER_MODE = 0x34E7;

	/**
	 * \if ENGLISH_LANG
	 * Push app on-board data event (corresponding to{@link NET_ALARM_POLICE_VEHICLE_DATA_PUSH_INFO})
	 * \else
	 * 推送app车载数据事件 {@link NET_ALARM_POLICE_VEHICLE_DATA_PUSH_INFO})
	 * \endif
	 */
	public static final int SDK_ALARM_POLICE_VEHICLE_DATA_PUSH = 0x34E8;

	/**
	 * \if ENGLISH_LANG
	 * Device factory reset event (corresponding to{@link NET_ALARM_DEV_FACTORY_RESET_INFO})
	 * \else
	 * 设备恢复出厂设置事件 {@link NET_ALARM_DEV_FACTORY_RESET_INFO})
	 * \endif
	 */
	public static final int SDK_ALARM_DEV_FACTORY_RESET = 0x34F9;

	/**
	 * \if ENGLISH_LANG
	 * Classroom Behavior Event (corresponding to{@link NET_ALARM_CLASSROOM_BEHAVIOR_INFO})
	 * \else
	 * 课堂行为分析事件 {@link NET_ALARM_CLASSROOM_BEHAVIOR_INFO}
	 * \endif
	 */
	public static final int  SDK_ALARM_CLASSROOM_BEHAVIOR =	0x350F;

	/**
	 * \if ENGLISH_LANG
	 *  event of device upgrade (corresponding to{@link ALARM_UPGRADE_STATE})
	 * \else
	 * 设备升级状态事件 {@link ALARM_UPGRADE_STATE}
	 * \endif
	 */
	public static final int SDK_ALARM_UPGRADE_STATE =  0x3232;

	/**
	 * \if ENGLISH_LANG
	 *   Elevator abnormal alarm event(corresponding to{@link NET_ALARM_ELEVATOR_ALARM_INFO})
	 * \else
	 * 电梯异常报警事件 {@link NET_ALARM_ELEVATOR_ALARM_INFO}
	 * \endif
	 */
	public static final int  SDK_ALARM_ELEVATOR_ALARM = 0x34F1;


	/****************************************************************************
	 * 						          事件类型									    *
	 ****************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * Modify the return code of the setup, refer to {@link DEV_SET_RESULT}
	 * \else
	 * 修改配置的返回码, 取值参考 {@link DEV_SET_RESULT}
	 * \endif
	 */
	public static final int SDK_CONFIG_RESULT_EVENT_EX         = 0x3000;

	/**
	 * \if ENGLISH_LANG
	 * Device reboot event. Current modification becomes valid unitl sending out the reboot command.
	 * \else
	 * 设备重启事件；如果未发送重启命令，当前修改的配置不会立即生效
	 * \endif
	 */
	public static final int SDK_REBOOT_EVENT_EX                = 0x3001;

	/**
	 * \if ENGLISH_LANG
	 * Device automatically invites to begin audio talk
	 * \else
	 * 设备主动邀请开始语音对讲
	 * \endif
	 */
	public static final int SDK_AUTO_TALK_START_EX             = 0x3002;

	/**
	 * \if ENGLISH_LANG
	 * Device actively stop audio talk
	 * \else
	 * 设备主动停止语音对讲
	 * \endif
	 */
	public static final int SDK_AUTO_TALK_STOP_EX              = 0x3003;

	/**
	 * \if ENGLISH_LANG
	 * Device setup changes.
	 * \else
	 * 设备配置发生改变
	 * \endif
	 */
	public static final int SDK_CONFIG_CHANGE_EX               = 0x3004;

	/**
	 * \if ENGLISH_LANG
	 * IP search event, the return value format is:DevName:::Manufacturer::MAC:: IP:: Port&& DevName:: Manufacturer::MAC:: IP:: Port&&
	 * \else
	 * IP搜索事件, 返回字符串格式如下:DevName::Manufacturer::MAC::IP::Port::DevType::POEPort::SubMask::GateWay&&DevName::Manufacturer::MAC::IP::Port::DevType::POEPort::SubMask::GateWay &&…
	 * \endif
	 */
	public static final int SDK_IPSEARCH_EVENT_EX              = 0x3005;

	/**
	 * \if ENGLISH_LANG
	 * reconnect failed
	 * \else
	 * 自动重连失败事件
	 * \endif
	 */
	public static final int SDK_AUTO_RECONNECT_FAILD           = 0x3006;

	/**
	 * \if ENGLISH_LANG
	 * real play failed, refer to {@link DEV_PLAY_RESULT}
	 * \else
	 * 预览失败事件, 取值参考 {@link DEV_PLAY_RESULT}
	 * \endif
	 */
	public static final int SDK_REALPLAY_FAILD_EVENT           = 0x3007;

	/**
	 * \if ENGLISH_LANG
	 * playback failed, refer to {@link DEV_PLAY_RESULT}
	 * \else
	 * 回放失败事件, 取值参考 {@link DEV_PLAY_RESULT}
	 * \endif
	 */
	public static final int SDK_PLAYBACK_FAILD_EVENT           = 0x3008;

	/**
	 * \if ENGLISH_LANG
	 * traffic real flow info , refer to {@link com.company.NetSDK.ALARM_IVS_TRAFFIC_REALFLOW_INFO}
	 * \else
	 * 交通实时流量信息事件, 取值参考 {@link com.company.NetSDK.ALARM_IVS_TRAFFIC_REALFLOW_INFO}
	 * \endif
	 */
	public static final int SDK_IVS_TRAFFIC_REALFLOWINFO       = 0x3009;

	/**
	 * \if ENGLISH_LANG
	 * Client end is out, refer to {@link com.company.NetSDK.DEV_CLIENT_ABORT_INFO}
	 * \else
	 * 客户端被踢出, 取值参考 {@link com.company.NetSDK.DEV_CLIENT_ABORT_INFO}
	 * \endif
	 */
	public static final int SDK_DEVICE_ABORT_EVENT             = 0x300a;

	/**
	 * \if ENGLISH_LANG
	 * failed to request talk, refer to {@link com.company.NetSDK.DEV_TALK_RESULT}
	 * \else
	 * 请求语音对讲失败, 取值参考 {@link com.company.NetSDK.DEV_TALK_RESULT}
	 * \endif
	 */
	public static final int SDK_TALK_FAILD_EVENT               = 0x300b;

	/**
	 * \if ENGLISH_LANG
	 * Switch screen event, refer to {@link SDK_SWITCH_SCREEN_INFO}
	 * \else
	 * 切换屏幕事件  取值参考 {@link SDK_SWITCH_SCREEN_INFO}
	 * \endif
	 */
	public static final int SDK_SWITCH_SCREEN                  = 0x3220;


	/**
	 * \if ENGLISH_LANG
	 * User name length
	 * \else
	 * 用户名长度
	 * \endif
	 */
	public static final int     SDK_NEW_USER_NAME_LENGTH	  = 128;

	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * 密码
	 * \endif
	 */
	public static final int     SDK_NEW_USER_PSW_LENGTH	     = 128;

	/**
	 * \if ENGLISH_LANG
	 * Signal interface name length
	 * \else
	 * 信号接口名称长度
	 * \endif
	 */
	public static final int     SDK_MATRIX_INTERFACE_LEN	 = 16;

	/**
	 * \if ENGLISH_LANG
	 * Matrix sub card max amount
	 * \else
	 * 矩阵子卡最大数量
	 * \endif
	 */
	public static final int     SDK_MATRIX_MAX_CARDS		= 128;

	/**
	 * \if ENGLISH_LANG
	 * The basic value of the PIP split mode
	 * \else
	 * 分割模式画中画的基础值
	 * \endif
	 */
	public static final int     SDK_SPLIT_PIP_BASE			= 1000;

	/**
	 * \if ENGLISH_LANG
	 * Max split matrix amount
	 * \else
	 * 最大分割模式数
	 * \endif
	 */
	public static final int     SDK_MAX_SPLIT_MODE_NUM	    = 64;

	/**
	 * \if ENGLISH_LANG
	 * Matrix max input channel amount
	 * \else
	 * 矩阵最大输入通道数
	 * \endif
	 */
	public static final int     SDK_MATRIX_MAX_CHANNEL_IN	= 1500;

	/**
	 * \if ENGLISH_LANG
	 * Matrix max output channel amount
	 * \else
	 * 矩阵最大输出通道数
	 * \endif
	 */
	public static final int     SDK_MATRIX_MAX_CHANNEL_OUT	= 256;

	/**
	 * \if ENGLISH_LANG
	 * Device name length
	 * \else
	 * 设备名称长度
	 * \endif
	 */
	public static final int     SDK_DEVICE_NAME_LEN			= 64;


	/**
	 * \if ENGLISH_LANG
	 * Max CPU amount
	 * \else
	 * 最大CPU数量
	 * \endif
	 */
	public static final int     SDK_MAX_CPU_NUM				= 16;

	/**
	 * \if ENGLISH_LANG
	 * Max fan amount
	 * \else
	 * 最大风扇数量
	 * \endif
	 */
	public static final int     SDK_MAX_FAN_NUM				= 16;

	/**
	 * \if ENGLISH_LANG
	 * Max power amount
	 * \else
	 * 最大电源数量
	 * \endif
	 */
	public static final int     SDK_MAX_POWER_NUM			= 16;

	/**
	 * \if ENGLISH_LANG
	 * Max battery amount
	 * \else
	 * 最大电池数量
	 * \endif
	 */
	public static final int 		SDK_MAX_BATTERY_NUM		= 16;

	/**
	 * \if ENGLISH_LANG
	 * Max temperature sensor amount
	 * \else
	 * 最大温度传感器数量
	 * \endif
	 */
	public static final int     SDK_MAX_TEMPERATURE_NUM		= 16;

	/**
	 * \if ENGLISH_LANG
	 * ISCSI Name length
	 * \else
	 * ISCSI名称长度
	 * \endif
	 */
	public static final int     SDK_MAX_ISCSI_NAME_LEN		= 128;

	/**
	 * \if ENGLISH_LANG
	 * Version info length
	 * \else
	 * 版本信息长度
	 * \endif
	 */
	public static final int     SDK_VERSION_LEN				= 64;

	/**
	 * \if ENGLISH_LANG
	 * Storage partition max number
	 * \else
	 * 存储分区最大数量
	 * \endif
	 */
	public static final int     SDK_MAX_STORAGE_PARTITION_NUM = 32;

	/**
	 * \if ENGLISH_LANG
	 * Mount length
	 * \else
	 * 挂载点长度
	 * \endif
	 */
	public static final int     SDK_STORAGE_MOUNT_LEN		= 64;

	/**
	 * \if ENGLISH_LANG
	 * File system name length
	 * \else
	 * 文件系统名称长度
	 * \endif
	 */
	public static final int     SDK_STORAGE_FILE_SYSTEM_LEN	= 16;

	/**
	 * \if ENGLISH_LANG
	 * RAID max members
	 * \else
	 * RAID成员最大数量
	 * \endif
	 */
	public static final int     SDK_MAX_MEMBER_PER_RAID		= 32;

	/**
	 * \if ENGLISH_LANG
	 * Device ID max length
	 * \else
	 * 设备ID最大长度
	 * \endif
	 */
	public static final int     SDK_DEV_ID_LEN_EX			= 128;

	/**
	 * \if ENGLISH_LANG
	 * Max number of block
	 * \else
	 * 最大区块数量
	 * \endif
	 */
	public static final int     SDK_MAX_BLOCK_NUM			= 32;

	/**
	 * \if ENGLISH_LANG
	 * Max number of package
	 * \else
	 * 最大包裹内物品个数
	 * \endif
	 */
	public static final int     MAX_INSIDEOBJECT_NUM			= 32;

	/**
	 * \if ENGLISH_LANG
	 * Max number of split window
	 * \else
	 * 最大分割窗口数量
	 * \endif
	 */
	public static final int     SDK_MAX_SPLIT_WINDOW	    = 128;

	/**
	 * \if ENGLISH_LANG
	 * Length of file type
	 * \else
	 * 文件类型长度
	 * \endif
	 */
	public static final int     SDK_FILE_TYPE_LEN			= 64;

	/**
	 * \if ENGLISH_LANG
	 * Length of device ID
	 * \else
	 * 设备ID最大长度
	 * \endif
	 */
	public static final int     SDK_DEV_ID_LEN				= 128;

	/**
	 * \if ENGLISH_LANG
	 * Max length of device name
	 * \else
	 * 设备名称最大长度
	 * \endif
	 */
	public static final int     SDK_DEV_NAME_LEN		   = 128;

	/**
	 * \if ENGLISH_LANG
	 * Schedule the first dimension size, means days
	 * \else
	 * 时间表第一维大小, 表示天数
	 * \endif
	 */
	public static final int     SDK_TSCHE_DAY_NUM			= 8;

	/**
	 * \if ENGLISH_LANG
	 * Schedule the second dimension size, means time
	 * \else
	 * 时间表第二维大小, 表示时段数
	 * \endif
	 */
	public static final int     SDK_TSCHE_SEC_NUM			= 6;

	/**
	 * \if ENGLISH_LANG
	 * Event report info including max card number
	 * \else
	 * 事件上报信息包含最大卡片个
	 * \endif
	 */
	public static final int SDK_EVENT_MAX_CARD_NUM   	   = 16;

	/**
	 * \if ENGLISH_LANG
	 * Card name length
	 * \else
	 * 卡片名称长度
	 * \endif
	 */
	public static final int SDK_EVENT_CARD_LEN   	       = 36;

	/**
	 * \if ENGLISH_LANG
	 * Max count of man list
	 * \else
	 * 人员列表最大数量
	 * \endif
	 */
	public static final int MAX_MAN_LIST_COUNT = 64;


	/****************************************************************************
	 * 						智能分析事件类型									*
	 ****************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * Subscription all event
	 * \else
	 * 订阅所有事件
	 * \endif
	 */
	public static final int EVENT_IVS_ALL                       = 0x00000001 ;

	/**
	 * \if ENGLISH_LANG
	 * Cross line event, refer to {@link DEV_EVENT_CROSSLINE_INFO}；Video analyse rule configuration, Rule configuration refer to {@link CFG_CROSSLINE_INFO}
	 * \else
	 * 警戒线事件, 取值参考 {@link DEV_EVENT_CROSSLINE_INFO}； 视频分析事件规则配置,(警戒线事件)对应的规则配置,对应 {@link CFG_CROSSLINE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_CROSSLINEDETECTION        = 0x00000002 ;

	/**
	 * \if ENGLISH_LANG
	 * Cross region event, refer to {@link DEV_EVENT_CROSSREGION_INFO}，Video analyse rule configuration, Rule configuration refer to {@link CFG_CROSSREGION_INFO}
	 * \else
	 * 警戒区事件, 取值参考 {@link DEV_EVENT_CROSSREGION_INFO} ，视频分析事件规则配置,(警戒区事件)对应的规则配置,对应 {@link CFG_CROSSREGION_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_CROSSREGIONDETECTION      = 0x00000003 ;

	/**
	 * \if ENGLISH_LANG
	 * Past event, refer to {@link DEV_EVENT_PASTE_INFO}
	 * \else
	 * 贴条事件, 取值参考 {@link DEV_EVENT_PASTE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_PASTEDETECTION            = 0x00000004 ;

	/**
	 * \if ENGLISH_LANG
	 * Left event, refer to {@link DEV_EVENT_LEFT_INFO}
	 * \else
	 * 物品遗留事件, 取值参考 {@link DEV_EVENT_LEFT_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_LEFTDETECTION             = 0x00000005 ;

	/**
	 * \if ENGLISH_LANG
	 * Stay event, refer to {@link DEV_EVENT_STAY_INFO}
	 * \else
	 * 停留事件, 取值参考 {@link DEV_EVENT_STAY_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_STAYDETECTION             = 0x00000006 ;

	/**
	 * \if ENGLISH_LANG
	 * Wander event, refer to {@link DEV_EVENT_WANDER_INFO}
	 * \else
	 * 徘徊事件, 取值参考 {@link DEV_EVENT_WANDER_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_WANDERDETECTION           = 0x00000007 ;

	/**
	 * \if ENGLISH_LANG
	 * Reservation event, refer to {@link DEV_EVENT_PRESERVATION_INFO}
	 * \else
	 * 物品保全事件, 取值参考 {@link DEV_EVENT_PRESERVATION_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_PRESERVATION              = 0x00000008 ;

	/**
	 * \if ENGLISH_LANG
	 * Move event, refer to {@link DEV_EVENT_MOVE_INFO}
	 * \else
	 * 移动事件, 取值参考 {@link DEV_EVENT_MOVE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_MOVEDETECTION             = 0x00000009 ;

	/**
	 * \if ENGLISH_LANG
	 * Tail event, refer to {@link DEV_EVENT_TAIL_INFO}
	 * \else
	 * 尾随事件, 取值参考 {@link DEV_EVENT_TAIL_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TAILDETECTION             = 0x0000000A ;

	/**
	 * \if ENGLISH_LANG
	 * Rioter event, refer to {@link DEV_EVENT_RIOTERL_INFO}
	 * \else
	 * 聚众事件, 取值参考 {@link DEV_EVENT_RIOTERL_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_RIOTERDETECTION           = 0x0000000B ;

	/**
	 * \if ENGLISH_LANG
	 * Fire event, refer to {@link DEV_EVENT_FIRE_INFO}
	 * \else
	 * 火警事件, 取值参考 {@link DEV_EVENT_FIRE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_FIREDETECTION             = 0x0000000C ;

	/**
	 * \if ENGLISH_LANG
	 * Smoke event, refer to {@link DEV_EVENT_SMOKE_INFO}
	 * \else
	 * 烟雾报警事件, 取值参考 {@link DEV_EVENT_SMOKE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_SMOKEDETECTION            = 0x0000000D ;

	/**
	 * \if ENGLISH_LANG
	 * Fight event, refer to {@link DEV_EVENT_FLOWSTAT_INFO}
	 * \else
	 * 斗殴事件, 取值参考 {@link DEV_EVENT_FLOWSTAT_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_FIGHTDETECTION            = 0x0000000E ;

	/**
	 * \if ENGLISH_LANG
	 * Flow stat event, refer to {@link DEV_EVENT_FLOWSTAT_INFO}
	 * \else
	 * 流量统计事件, 取值参考 {@link DEV_EVENT_FLOWSTAT_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_FLOWSTAT                  = 0x0000000F ;

	/**
	 * \if ENGLISH_LANG
	 * Number stat event, refer to {@link DEV_EVENT_NUMBERSTAT_INFO},rule is {@link CFG_NUMBERSTAT_INFO}
	 * \else
	 * 数量统计事件, 取值参考 {@link DEV_EVENT_NUMBERSTAT_INFO}，对应规则为{@link CFG_NUMBERSTAT_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_NUMBERSTAT                = 0x00000010 ;

	/**
	 * \if ENGLISH_LANG
	 * Camera cover event
	 * \else
	 * 摄像头覆盖事件
	 * \endif
	 */
	public static final int EVENT_IVS_CAMERACOVERDDETECTION     = 0x00000011 ;

	/**
	 * \if ENGLISH_LANG
	 * Camera move event
	 * \else
	 * 摄像头移动事件
	 * \endif
	 */
	public static final int EVENT_IVS_CAMERAMOVEDDETECTION      = 0x00000012 ;

	/**
	 * \if ENGLISH_LANG
	 * Video abnormal event, refer to {@link DEV_EVENT_VIDEOABNORMALDETECTION_INFO}
	 * \else
	 * 视频异常事件, 取值参考 {@link DEV_EVENT_VIDEOABNORMALDETECTION_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_VIDEOABNORMALDETECTION    = 0x00000013 ;

	/**
	 * \if ENGLISH_LANG
	 * Video bad event
	 * \else
	 * 视频损坏事件
	 * \endif
	 */
	public static final int EVENT_IVS_VIDEOBADDETECTION         = 0x00000014 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic control event, refer to {@link DEV_EVENT_TRAFFICCONTROL_INFO}
	 * \else
	 * 交通管理事件, 取值参考 {@link DEV_EVENT_TRAFFICCONTROL_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFICCONTROL            = 0x00000015 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic accident event, refer to {@link DEV_EVENT_TRAFFICACCIDENT_INFO}
	 * \else
	 * 交通事故事件, 取值参考 {@link DEV_EVENT_TRAFFICACCIDENT_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFICACCIDENT           = 0x00000016 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic junction event, refer to {@link DEV_EVENT_TRAFFICJUNCTION_INFO}
	 * \else
	 * 交通路口事件----老规则, 取值参考 {@link DEV_EVENT_TRAFFICJUNCTION_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFICJUNCTION           = 0x00000017 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic gate event, refer to {@link DEV_EVENT_TRAFFICGATE_INFO}
	 * \else
	 * 交通卡口事件----老规则, 取值参考 {@link DEV_EVENT_TRAFFICGATE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFICGATE               = 0x00000018 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic snapshot, refer to {@link DEV_EVENT_TRAFFICSNAPSHOT_INFO}
	 * \else
	 * 端交通抓拍事件, 取值参考 {@link DEV_EVENT_TRAFFICSNAPSHOT_INFO}
	 * \endif
	 */
	public static final int EVENT_TRAFFICSNAPSHOT               = 0x00000019 ;

	/**
	 * \if ENGLISH_LANG
	 * Target detection, refer to {@link DEV_EVENT_FACEDETECT_INFO},rule config is {@link CFG_FACEDETECT_INFO}
	 * \else
	 * 目标检测事件, 取值参考 {@link DEV_EVENT_FACEDETECT_INFO},规则配置对应{@link CFG_FACEDETECT_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_FACEDETECT                = 0x0000001A ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic-Jam, refer to {@link DEV_EVENT_TRAFFICJAM_INFO}
	 * \else
	 * 交通拥堵事件, 取值参考 {@link DEV_EVENT_TRAFFICJAM_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFICJAM                = 0x0000001B ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic-RunRedLight, refer to {@link DEV_EVENT_TRAFFIC_RUNREDLIGHT_INFO}
	 * \else
	 * -闯红灯事件, 取值参考 {@link DEV_EVENT_TRAFFIC_RUNREDLIGHT_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_RUNREDLIGHT       = 0x00000100 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic-Overline, refer to {@link DEV_EVENT_TRAFFIC_OVERLINE_INFO}
	 * \else
	 * -压车道线事件, 取值参考 {@link DEV_EVENT_TRAFFIC_OVERLINE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_OVERLINE          = 0x00000101 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic-Retrograde, refer to {@link DEV_EVENT_TRAFFIC_RETROGRADE_INFO}
	 * \else
	 * -逆行事件, 取值参考 {@link DEV_EVENT_TRAFFIC_RETROGRADE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_RETROGRADE        = 0x00000102 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic-TurnLeft, refer to {@link DEV_EVENT_TRAFFIC_TURNLEFT_INFO}
	 * \else
	 * 左转, 取值参考 {@link DEV_EVENT_TRAFFIC_TURNLEFT_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_TURNLEFT          = 0x00000103 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic-TurnRight, refer to {@link DEV_EVENT_TRAFFIC_TURNRIGHT_INFO}
	 * \else
	 * 右转, 取值参考 {@link DEV_EVENT_TRAFFIC_TURNRIGHT_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_TURNRIGHT         = 0x00000104 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic-Uturn, refer to {@link DEV_EVENT_TRAFFIC_UTURN_INFO}
	 * \else
	 * 掉头, 取值参考 {@link DEV_EVENT_TRAFFIC_UTURN_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_UTURN             = 0x00000105 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic-Overspeed, refer to {@link DEV_EVENT_TRAFFIC_OVERSPEED_INFO}
	 * \else
	 * -超速, 取值参考 {@link DEV_EVENT_TRAFFIC_OVERSPEED_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_OVERSPEED         = 0x00000106 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic-Underspeed, refer to {@link DEV_EVENT_TRAFFIC_UNDERSPEED_INFO}
	 * \else
	 * -低速, 取值参考 {@link DEV_EVENT_TRAFFIC_UNDERSPEED_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_UNDERSPEED        = 0x00000107 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic-Parking, refer to {@link DEV_EVENT_TRAFFIC_PARKING_INFO}
	 * \else
	 * 停车, 取值参考 {@link DEV_EVENT_TRAFFIC_PARKING_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PARKING           = 0x00000108 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic-WrongRoute, refer to {@link DEV_EVENT_TRAFFIC_WRONGROUTE_INFO}
	 * \else
	 * -不按车道行驶, 取值参考 {@link DEV_EVENT_TRAFFIC_WRONGROUTE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_WRONGROUTE        = 0x00000109 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic-CrossLane, refer to {@link DEV_EVENT_TRAFFIC_CROSSLANE_INFO}
	 * \else
	 * 变道, 取值参考 {@link DEV_EVENT_TRAFFIC_CROSSLANE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_CROSSLANE         = 0x0000010A ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic-OverYellowLine, refer to {@link DEV_EVENT_TRAFFIC_OVERYELLOWLINE_INFO}
	 * \else
	 * -压黄线 , 取值参考 {@link DEV_EVENT_TRAFFIC_OVERYELLOWLINE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_OVERYELLOWLINE    = 0x0000010B ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic-DrivingOnShoulder, refer to {@link DEV_EVENT_TRAFFIC_DRIVINGONSHOULDER_INFO}
	 * \else
	 * -路肩行驶事件, 取值参考 {@link DEV_EVENT_TRAFFIC_DRIVINGONSHOULDER_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_DRIVINGONSHOULDER = 0x0000010C ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic-YellowPlateInLane, refer to {@link DEV_EVENT_TRAFFIC_YELLOWPLATEINLANE_INFO}
	 * \else
	 * -黄牌车占道事件, 取值参考 {@link DEV_EVENT_TRAFFIC_YELLOWPLATEINLANE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_YELLOWPLATEINLANE = 0x0000010E ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic offense-Pedestral has higher priority at the  crosswalk, refer to {@link DEV_EVENT_TRAFFIC_PEDESTRAINPRIORITY_INFO}
	 * \else
	 * -斑马线行人优先事件, 取值参考 {@link DEV_EVENT_TRAFFIC_PEDESTRAINPRIORITY_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PEDESTRAINPRIORITY = 0x0000010F ;

	/**
	 * \if ENGLISH_LANG
	 * Cross fence, refer to {@link DEV_EVENT_CROSSFENCEDETECTION_INFO}
	 * \else
	 * 翻越围栏事件, 取值参考 {@link DEV_EVENT_CROSSFENCEDETECTION_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_CROSSFENCEDETECTION       = 0x0000011F ;

	/**
	 * \if ENGLISH_LANG
	 * ElectroSpark event, refer to {@link DEV_EVENT_ELECTROSPARK_INFO}
	 * \else
	 * 电火花事件, 取值参考 {@link DEV_EVENT_ELECTROSPARK_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_ELECTROSPARKDETECTION     = 0X00000110 ;

	/**
	 * \if ENGLISH_LANG
	 * No passing, refer to {@link DEV_EVENT_TRAFFIC_NOPASSING_INFO}
	 * \else
	 * -禁止通行事件, 取值参考 {@link DEV_EVENT_TRAFFIC_NOPASSING_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_NOPASSING         = 0x00000111 ;

	/**
	 * \if ENGLISH_LANG
	 * Abnormal run, refer to {@link DEV_EVENT_ABNORMALRUNDETECTION_INFO}
	 * \else
	 * 异常奔跑事件, 取值参考 {@link DEV_EVENT_ABNORMALRUNDETECTION_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_ABNORMALRUNDETECTION      = 0x00000112 ;

	/**
	 * \if ENGLISH_LANG
	 * Retrograde, refer to {@link DEV_EVENT_RETROGRADEDETECTION_INFO}
	 * \else
	 * 人员逆行事件, 取值参考 {@link DEV_EVENT_RETROGRADEDETECTION_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_RETROGRADEDETECTION       = 0x00000113 ;

	/**
	 * \if ENGLISH_LANG
	 * In region detection, refer to {@link DEV_EVENT_INREGIONDETECTION_INFO}
	 * \else
	 * 区域内检测事件, 取值参考 {@link DEV_EVENT_INREGIONDETECTION_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_INREGIONDETECTION         = 0x00000114 ;

	/**
	 * \if ENGLISH_LANG
	 * Taking away things, refer to {@link DEV_EVENT_TAKENAWAYDETECTION_INFO}
	 * \else
	 * 物品搬移事件, 取值参考 {@link DEV_EVENT_TAKENAWAYDETECTION_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TAKENAWAYDETECTION        = 0x00000115 ;

	/**
	 * \if ENGLISH_LANG
	 * Parking, refer to {@link DEV_EVENT_PARKINGDETECTION_INFO}
	 * \else
	 * 非法停车事件, 取值参考 {@link DEV_EVENT_PARKINGDETECTION_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_PARKINGDETECTION          = 0x00000116 ;

	/**
	 * \if ENGLISH_LANG
	 * Target recognition, refer to {@link DEV_EVENT_FACERECOGNITION_INFO}
	 * \else
	 * 目标识别事件, 取值参考 {@link DEV_EVENT_FACERECOGNITION_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_FACERECOGNITION           = 0x00000117 ;

	/**
	 * \if ENGLISH_LANG
	 * Manual snap, refer to {@link DEV_EVENT_TRAFFIC_MANUALSNAP_INFO}
	 * \else
	 * 交通手动抓拍事件, 取值参考 {@link DEV_EVENT_TRAFFIC_MANUALSNAP_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_MANUALSNAP        = 0x00000118 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic flow state, refer to {@link DEV_EVENT_TRAFFIC_FLOW_STATE}
	 * \else
	 * 交通流量统计事件, 取值参考 {@link DEV_EVENT_TRAFFIC_FLOW_STATE}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_FLOWSTATE         = 0x00000119 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic stay, refer to {@link DEV_EVENT_TRAFFIC_STAY_INFO}
	 * \else
	 * 交通滞留事件, 取值参考 {@link DEV_EVENT_TRAFFIC_STAY_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_STAY              = 0x0000011A ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic vehicle route, refer to {@link DEV_EVENT_TRAFFIC_VEHICLEINROUTE_INFO}
	 * \else
	 * 有车占道事件, 取值参考 {@link DEV_EVENT_TRAFFIC_VEHICLEINROUTE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_VEHICLEINROUTE    = 0x0000011B ;

	/**
	 * \if ENGLISH_LANG
	 * Motion detect, refer to {@link DEV_EVENT_ALARM_INFO}
	 * \else
	 * 视频移动侦测事件, 取值参考 {@link DEV_EVENT_ALARM_INFO}
	 * \endif
	 */
	public static final int EVENT_ALARM_MOTIONDETECT            = 0x0000011C ;

	/**
	 * \if ENGLISH_LANG
	 * Local alarm, refer to {@link DEV_EVENT_ALARM_INFO}
	 * \else
	 * 外部报警事件, 取值参考 {@link DEV_EVENT_ALARM_INFO}
	 * \endif
	 */
	public static final int EVENT_ALARM_LOCALALARM              = 0x0000011D ;

	/**
	 * \if ENGLISH_LANG
	 * PS rise detect, refer to {@link DEV_EVENT_PSRISEDETECTION_INFO}
	 * \else
	 * 囚犯起身事件, 取值参考 {@link DEV_EVENT_PSRISEDETECTION_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_PSRISEDETECTION     = 0X0000011E ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic tollgate, refer to {@link DEV_EVENT_TRAFFICJUNCTION_INFO}
	 * \else
	 * -卡口事件----新规则, 取值参考 {@link DEV_EVENT_TRAFFICJUNCTION_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_TOLLGATE          = 0X00000120 ;

	/**
	 * \if ENGLISH_LANG
	 * Density detection of persons, refer to {@link DEV_EVENT_DENSITYDETECTION_INFO}
	 * \else
	 * 人员密集度检测, 取值参考 {@link DEV_EVENT_DENSITYDETECTION_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_DENSITYDETECTION          = 0x00000121 ;

	/**
	 * \if ENGLISH_LANG
	 * Video diagnosis result, refer to {@link NET_VIDEODIAGNOSIS_COMMON_INFO}, refer to {@link NET_REAL_DIAGNOSIS_RESULT}
	 * \else
	 * 视频诊断结果事件, 取值参考 {@link NET_VIDEODIAGNOSIS_COMMON_INFO} , 取值参考 {@link NET_REAL_DIAGNOSIS_RESULT}
	 * \endif
	 */
	public static final int EVENT_IVS_VIDEODIAGNOSIS            = 0X00000122 ;

	/**
	 * \if ENGLISH_LANG
	 * Queue detection, refer to {@link DEV_EVENT_QUEUEDETECTION_INFO}
	 * \else
	 * 排队检测报警事件, 取值参考 {@link DEV_EVENT_QUEUEDETECTION_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_QUEUEDETECTION            = 0x00000123 ;

	/**
	 * \if ENGLISH_LANG
	 * Take up in bus route, refer to {@link DEV_EVENT_TRAFFIC_VEHICLEINBUSROUTE_INFO}
	 * \else
	 * 占用公交车道事件, 取值参考 {@link DEV_EVENT_TRAFFIC_VEHICLEINBUSROUTE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_VEHICLEINBUSROUTE = 0x00000124 ;

	/**
	 * \if ENGLISH_LANG
	 * Illegal astern, refer to {@link DEV_EVENT_IVS_TRAFFIC_BACKING_INFO}
	 * \else
	 * 倒车事件, 取值参考 {@link DEV_EVENT_IVS_TRAFFIC_BACKING_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_BACKING           = 0x00000125 ;

	/**
	 * \if ENGLISH_LANG
	 * Audio abnormity, refer to {@link DEV_EVENT_IVS_AUDIO_ABNORMALDETECTION_INFO}
	 * \else
	 * 声音异常检测, 取值参考 {@link DEV_EVENT_IVS_AUDIO_ABNORMALDETECTION_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_AUDIO_ABNORMALDETECTION   = 0x00000126 ;

	/**
	 * \if ENGLISH_LANG
	 * Run yellow light, refer to {@link DEV_EVENT_TRAFFIC_RUNYELLOWLIGHT_INFO}
	 * \else
	 * -闯黄灯事件, 取值参考 {@link DEV_EVENT_TRAFFIC_RUNYELLOWLIGHT_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_RUNYELLOWLIGHT    = 0x00000127 ;

	/**
	 * \if ENGLISH_LANG
	 * Climb detection, refer to {@link DEV_EVENT_IVS_CLIMB_INFO}
	 * \else
	 * 攀高检测事件, 取值参考 {@link DEV_EVENT_IVS_CLIMB_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_CLIMBDETECTION            = 0x00000128 ;

	/**
	 * \if ENGLISH_LANG
	 * Leave detection, refer to {@link DEV_EVENT_IVS_LEAVE_INFO}
	 * \else
	 * 离岗检测事件, 取值参考 {@link DEV_EVENT_IVS_LEAVE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_LEAVEDETECTION            = 0x00000129 ;

	/**
	 * \if ENGLISH_LANG
	 * Parking on yellow box, refer to {@link DEV_EVENT_TRAFFIC_PARKINGONYELLOWBOX_INFO}
	 * \else
	 * 黄网格线抓拍事件, 取值参考 {@link DEV_EVENT_TRAFFIC_PARKINGONYELLOWBOX_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PARKINGONYELLOWBOX = 0x0000012A ;

	/**
	 * \if ENGLISH_LANG
	 * Parking space parking, refer to {@link DEV_EVENT_TRAFFIC_PARKINGSPACEPARKING_INFO}
	 * \else
	 * 车位有车事件, 取值参考 {@link DEV_EVENT_TRAFFIC_PARKINGSPACEPARKING_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PARKINGSPACEPARKING = 0x0000012B ;

	/**
	 * \if ENGLISH_LANG
	 * Parking space no parking, refer to {@link DEV_EVENT_TRAFFIC_PARKINGSPACENOPARKING_INFO}
	 * \else
	 * 车位无车事件, 取值参考 {@link DEV_EVENT_TRAFFIC_PARKINGSPACENOPARKING_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PARKINGSPACENOPARKING = 0x0000012C ;

	/**
	 * \if ENGLISH_LANG
	 * Passerby, refer to {@link DEV_EVENT_TRAFFIC_PEDESTRAIN_INFO}
	 * \else
	 * 交通行人事件, 取值参考 {@link DEV_EVENT_TRAFFIC_PEDESTRAIN_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PEDESTRAIN        = 0x0000012D ;

	/**
	 * \if ENGLISH_LANG
	 * Throw, refer to {@link DEV_EVENT_TRAFFIC_THROW_INFO}
	 * \else
	 * 交通抛洒物品事件, 取值参考 {@link DEV_EVENT_TRAFFIC_THROW_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_THROW             = 0x0000012E ;

	/**
	 * \if ENGLISH_LANG
	 * Idle, refer to {@link DEV_EVENT_TRAFFIC_IDLE_INFO}
	 * \else
	 * 交通空闲事件, 取值参考 {@link DEV_EVENT_TRAFFIC_IDLE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_IDLE              = 0x0000012F ;

	/**
	 * \if ENGLISH_LANG
	 * Mobile ACC outage alarm event, refer to {@link DEV_EVENT_ALARM_VEHICLEACC_INFO}
	 * \else
	 * 车载ACC断电报警事件, 取值参考 {@link DEV_EVENT_ALARM_VEHICLEACC_INFO}
	 * \endif
	 */
	public static final int EVENT_ALARM_VEHICLEACC              = 0x00000130 ;

	/**
	 * \if ENGLISH_LANG
	 * Vehicle side turn alarm event, refer to {@link DEV_EVENT_VEHICEL_ALARM_INFO}
	 * \else
	 * 车辆侧翻报警事件, 取值参考 {@link DEV_EVENT_VEHICEL_ALARM_INFO}
	 * \endif
	 */
	public static final int EVENT_ALARM_VEHICLE_TURNOVER        = 0x00000131 ;

	/**
	 * \if ENGLISH_LANG
	 * Vehicle collision alarm event, refer to {@link DEV_EVENT_VEHICEL_ALARM_INFO}
	 * \else
	 * 车辆撞车报警事件, 取值参考 {@link DEV_EVENT_VEHICEL_ALARM_INFO}
	 * \endif
	 */
	public static final int EVENT_ALARM_VEHICLE_COLLISION       = 0x00000132 ;

	/**
	 * \if ENGLISH_LANG
	 * Mobile camera rotate event
	 * \else
	 * 车载摄像头大角度扭转事件
	 * \endif
	 */
	public static final int EVENT_ALARM_VEHICLE_LARGE_ANGLE     = 0x00000133 ;

	/**
	 * \if ENGLISH_LANG
	 * Spot cross line event, refer to {@link DEV_EVENT_TRAFFIC_PARKINGSPACEOVERLINE_INFO}
	 * \else
	 * 车位压线事件, 取值参考 {@link DEV_EVENT_TRAFFIC_PARKINGSPACEOVERLINE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_PARKINGSPACEOVERLINE = 0x00000134 ;

	/**
	 * \if ENGLISH_LANG
	 * Multi scene switch event, refer to {@link DEV_EVENT_IVS_MULTI_SCENE_SWICH_INFO}
	 * \else
	 * 多场景切换事件, 取值参考 {@link DEV_EVENT_IVS_MULTI_SCENE_SWICH_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_MULTISCENESWITCH          = 0x00000135 ;

	/**
	 * \if ENGLISH_LANG
	 * Plate limit event, refer to {@link DEV_EVENT_TRAFFIC_RESTRICTED_PLATE}
	 * \else
	 * 受限车牌事件, 取值参考 {@link DEV_EVENT_TRAFFIC_RESTRICTED_PLATE}
	 * \endif
	 */
	public static final int EVENT_IVS_TRAFFIC_RESTRICTED_PLATE   =  0X00000136 ;

	/**
	 * \if ENGLISH_LANG
	 * Cross stop line event, refer to {@link DEV_EVENT_TRAFFIC_OVERSTOPLINE}
	 * \else
	 * 压停止线事件, 取值参考 {@link DEV_EVENT_TRAFFIC_OVERSTOPLINE}
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_OVERSTOPLINE          = 0x00000137 ;

	/**
	 * \if ENGLISH_LANG
	 * Traffic unfasten seat belt event, refer to {@link DEV_EVENT_TRAFFIC_WITHOUT_SAFEBELT}
	 * \else
	 * 交通未系安全带事件, 取值参考 {@link DEV_EVENT_TRAFFIC_WITHOUT_SAFEBELT}
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_WITHOUT_SAFEBELT      = 0x00000138 ;

	/**
	 * \if ENGLISH_LANG
	 * Driver smoking event, refer to {@link DEV_EVENT_TRAFFIC_DRIVER_SMOKING}
	 * \else
	 * 驾驶员抽烟事件, 取值参考 {@link DEV_EVENT_TRAFFIC_DRIVER_SMOKING}
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_DRIVER_SMOKING        = 0x00000139 ;

	/**
	 * \if ENGLISH_LANG
	 * Driver call event, refer to {@link DEV_EVENT_TRAFFIC_DRIVER_CALLING}
	 * \else
	 * 驾驶员打电话事件, 取值参考 {@link DEV_EVENT_TRAFFIC_DRIVER_CALLING}
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_DRIVER_CALLING        = 0x0000013A ;

	/**
	 * \if ENGLISH_LANG
	 * Pedestrain red light, (Corresponding to {@link DEV_EVENT_TRAFFIC_PEDESTRAINRUNREDLIGHT_INFO})
	 * \else
	 * 行人闯红灯事件(对应 {@link DEV_EVENT_TRAFFIC_PEDESTRAINRUNREDLIGHT_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_PEDESTRAINRUNREDLIGHT  = 0x0000013B;


	/**
	 * \if ENGLISH_LANG
	 * Object feature detection event
	 * \else
	 * 物体特征检测事件
	 * \endif
	 */
	public static final int  EVENT_IVS_OBJECT_DETECTION              = 0x00000141 ;

	/**
	 * \if ENGLISH_LANG
	 * Analog alarm channel event, refer to {@link DEV_EVENT_ALARM_ANALOGALRM_INFO}
	 * \else
	 * 模拟量报警通道的报警事件, 取值参考 {@link DEV_EVENT_ALARM_ANALOGALRM_INFO}
	 * \endif
	 */
	public static final int EVENT_ALARM_ANALOGALARM               =  0x00000150 ;

	/**
	 * \if ENGLISH_LANG
	 * Warning lineexpansion event
	 * \else
	 * 警戒线扩展事件
	 * \endif
	 */
	public static final int  EVENT_IVS_CROSSLINEDETECTION_EX			= 0x00000151 ;

	/**
	 * \if ENGLISH_LANG
	 * Normal Record
	 * \else
	 * 普通录像
	 * \endif
	 */
	public static final int  EVENT_ALARM_COMMON                      = 0x00000152 ;

	/**
	 * \if ENGLISH_LANG
	 * Video tampering event, refer to {@link DEV_EVENT_ALARM_VIDEOBLIND}
	 * \else
	 * 视频遮挡事件, 取值参考 {@link DEV_EVENT_ALARM_VIDEOBLIND}
	 * \endif
	 */
	public static final int  EVENT_ALARM_VIDEOBLIND                  = 0x00000153 ;

	/**
	 * \if ENGLISH_LANG
	 * Video loss event
	 * \else
	 * 视频丢失事件
	 * \endif
	 */
	public static final int  EVENT_ALARM_VIDEOLOSS                   = 0x00000154 ;

	/**
	 * \if ENGLISH_LANG
	 * Event of getting out bed detection, refer to {@link DEV_EVENT_GETOUTBED_INFO}
	 * \else
	 * 下床事件, 取值参考 {@link DEV_EVENT_GETOUTBED_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_GETOUTBEDDETECTION			= 0x00000155 ;

	/**
	 * \if ENGLISH_LANG
	 * Event of patrol detection, refer to {@link DEV_EVENT_PATROL_INFO}
	 * \else
	 * 巡逻检测事件, 取值参考 {@link DEV_EVENT_PATROL_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_PATROLDETECTION			    = 0x00000156 ;

	/**
	 * \if ENGLISH_LANG
	 * Event of on duty detection, refer to {@link DEV_EVENT_ONDUTY_INFO}
	 * \else
	 * 站岗检测事件, 取值参考 {@link DEV_EVENT_ONDUTY_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_ONDUTYDETECTION			    = 0x00000157 ;

	/**
	 * \if ENGLISH_LANG
	 *  Event of VTO do not answer calling request
	 * \else
	 * 门口机呼叫未响应事件
	 * \endif
	 */
	public static final int  EVENT_IVS_NOANSWERCALL			        = 0x00000158 ;

	/**
	 * \if ENGLISH_LANG
	 * Event of storage do not exist
	 * \else
	 * 存储组不存在事件
	 * \endif
	 */
	public static final int  EVENT_IVS_STORAGENOTEXIST              = 0x00000159 ;

	/**
	 * \if ENGLISH_LANG
	 * Event of storage space low
	 * \else
	 * 硬盘空间低报警事件
	 * \endif
	 */
	public static final int  EVENT_IVS_STORAGELOWSPACE              = 0x0000015A ;

	/**
	 * \if ENGLISH_LANG
	 * Event of storage failure
	 * \else
	 * 存储错误事件
	 * \endif
	 */
	public static final int  EVENT_IVS_STORAGEFAILURE               = 0x0000015B ;

	/**
	 * \if ENGLISH_LANG
	 *  Event of profile alarm transmit，refer to {@link DEV_EVENT_PROFILE_ALARM_TRANSMIT_INFO}
	 * \else
	 * 报警传输事件,取值参考{@link DEV_EVENT_PROFILE_ALARM_TRANSMIT_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_PROFILEALARMTRANSMIT         = 0x0000015C ;

	/**
	 * \if ENGLISH_LANG
	 * Event of picture info for alarm, refer to {@link DEV_EVENT_ALARM_PIC_INFO}
	 * \else
	 * 图片信息事件, 取值参考 {@link DEV_EVENT_ALARM_PIC_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_PICINFO                       = 0x00000161 ;

	/**
	 * \if ENGLISH_LANG
	 * Event of shooting score recognition, corresponding to event {@link DEV_EVENT_SHOOTING_SCORE_RECOGNITION_INFO}, corresponding to rule {@link CFG_IVS_SHOOTINGSCORERECOGNITION_INFO}
	 * \else
	 * 打靶像机事件,对应事件{@link DEV_EVENT_SHOOTING_SCORE_RECOGNITION_INFO},对应规则{@link CFG_IVS_SHOOTINGSCORERECOGNITION_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_SHOOTINGSCORERECOGNITION		= 0x0000016A ;

	/**
	 * \if ENGLISH_LANG
	 * Event of scene change, corresponding to event {@link DEV_ALRAM_SCENECHANGE_INFO}
	 * \else
	 * 场景变更事件,对应事件{@link DEV_ALRAM_SCENECHANGE_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_SCENE_CHANGE		= 0x0000016D ;
	/**
	 * \if ENGLISH_LANG
	 * Event of simple track(no event data)
	 * \else
	 * 简单跟踪事件(暂未有具体事件)
	 * \endif
	 */
	public static final int EVENT_IVS_LETRACK						= 0x0000016E ;

	/**
	 * \if ENGLISH_LANG
	 * Event of electrical power quality state of smart switch (no event data)
	 * \else
	 * 智能插座电量状态上报(暂未有具体事件)
	 * \endif
	 */
	public static final int EVENT_ALARM_EQSTATE                      = 0x00000171;

	/**
	 * \if ENGLISH_LANG
	 *  Event of IPC used by DVR/NVR,{@link DEV_EVENT_ALARM_IPC_INFO}
	 * \else
	 * DVR/NVR设备上的IPC报警(对应 {@link DEV_EVENT_ALARM_IPC_INFO})
	 * \endif
	 */
	public static final int EVENT_IVS_ALARM_IPC                      = 0x00000172;

	/**
	 * \if ENGLISH_LANG
	 *  Event of tumble detection,{@link DEV_EVENT_TUMBLE_DETECTION_INFO}
	 * \else
	 * 倒地报警事件(对应 {@link DEV_EVENT_TUMBLE_DETECTION_INFO})
	 * \endif
	 */
	public static final int EVENT_IVS_TUMBLE_DETECTION                      = 0x00000177;

	/**
	 * \if ENGLISH_LANG
	 * All event start with [TRAFFIC]
	 * EVENT_IVS_TRAFFICCONTROL -> EVENT_TRAFFICSNAPSHOT
	 * EVENT_IVS_TRAFFIC_RUNREDLIGHT -> EVENT_IVS_TRAFFIC_UNDERSPEED
	 * \else
	 * 所有以traffic开头的事件，目前指的是
	 * EVENT_IVS_TRAFFICCONTROL -> EVENT_TRAFFICSNAPSHOT
	 * EVENT_IVS_TRAFFIC_RUNREDLIGHT -> EVENT_IVS_TRAFFIC_UNDERSPEED
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_ALL                  = 0x000001FF ;

	/**
	 * \if ENGLISH_LANG
	 * All IVS events
	 * \else
	 * 所有智能分析事件
	 * \endif
	 */
	public static final int  EVENT_IVS_VIDEOANALYSE                 = 0x00000200 ;

	/**
	 * \if ENGLISH_LANG
	 * Vehicle Analyse, Corresponding to {@link DEV_EVENT_VEHICLEANALYSE}
	 * \else
	 * 车辆特征检测分析,对应 {@link DEV_EVENT_VEHICLEANALYSE}
	 * \endif
	 */
	public static final int  EVENT_IVS_VEHICLEANALYSE				= 0x00000202;

    /**
     * \if ENGLISH_LANG
     * Acccess control event, Corresponding to {@link DEV_EVENT_ACCESS_CTL_INFO}
     * \else
     * 门禁事件,对应 {@link DEV_EVENT_ACCESS_CTL_INFO}
     * \endif
     */
    public static final int  EVENT_IVS_ACCESS_CTL                    = 0x00000204;

	/**
	 * \if ENGLISH_LANG
	 * SnapManual event, Corresponding to {@link DEV_EVENT_SNAPMANUAL}
	 * \else
	 * SnapManual事件,对应 {@link DEV_EVENT_SNAPMANUAL}
	 * \endif
	 */
	public static final int  EVENT_IVS_SNAPMANUAL                    = 0x00000205;

	/**
	 * \if ENGLISH_LANG
	 * physiological fatigue driving events, Corresponding to {@link DEV_EVENT_TIREDPHYSIOLOGICAL_INFO}
	 * \else
	 * 生理疲劳驾驶事件,对应 {@link DEV_EVENT_TIREDPHYSIOLOGICAL_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_TIREDPHYSIOLOGICAL                    = 0x00000207;

	/**
	 * \if ENGLISH_LANG
	 * Event of comparison with ID and card picture(corresponding to {@link DEV_EVENT_CITIZEN_PICTURE_COMPARE_INFO})
	 * \else
	 * 人证比对事件(对应 {@link DEV_EVENT_CITIZEN_PICTURE_COMPARE_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_CITIZEN_PICTURE_COMPARE      = 0x00000209;

	/**
	 * \if ENGLISH_LANG
	 * Event of driver lower head(corresponding to {@link DEV_EVENT_TIREDLOWERHEAD_INFO})
	 * \else
	 * 开车低头报警事件(对应 {@link DEV_EVENT_TIREDLOWERHEAD_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_TIREDLOWERHEAD      = 0x0000020A;

	/**
	 * \if ENGLISH_LANG
	 * Event of driver look around(corresponding to {@link DEV_EVENT_DRIVERLOOKAROUND_INFO})
	 * \else
	 * 开车左顾右盼报警事件(对应 {@link DEV_EVENT_DRIVERLOOKAROUND_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_DRIVERLOOKAROUND      = 0x0000020B;

	/**
	 * \if ENGLISH_LANG
	 * Event of driver leave post(corresponding to {@link DEV_EVENT_DRIVERLEAVEPOST_INFO})
	 * \else
	 * 开车离岗报警事件(对应 {@link DEV_EVENT_DRIVERLEAVEPOST_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_DRIVERLEAVEPOST      = 0x0000020C;

	/**
	 * \if ENGLISH_LANG
	 * Event of regional population statistics(corresponding to {@link DEV_EVENT_MANNUM_DETECTION_INFO})
	 * \else
	 * 立体视觉区域内人数统计事件(对应 {@link DEV_EVENT_MANNUM_DETECTION_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_MAN_NUM_DETECTION      = 0x0000020E;

	/**
	 * \if ENGLISH_LANG
	 * Event of  driver yawn(corresponding to {@link DEV_EVENT_DRIVERYAWN_INFO})
	 * \else
	 * 开车打哈欠事件(对应 {@link DEV_EVENT_DRIVERYAWN_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_DRIVERYAWN      = 0x00000210;

	/**
	 * \if ENGLISH_LANG
	 * Event of call no answered
	 * \else
	 * 呼叫无答应事件
	 * \endif
	 */
	public static final int EVENT_IVS_CALLNOANSWERED					= 0x00000213;

	/**
	 * \if ENGLISH_LANG
	 * Event of ignore invite
	 * \else
	 * 无视邀请事件
	 * \endif
	 */
	public static final int  EVENT_IVS_IGNOREINVITE					= 0x00000214;

	/**
	 * \if ENGLISH_LANG
	 * Event of human trait,(Corresponding to {@link DEV_EVENT_HUMANTRAIT_INFO})
	 * \else
	 * 人体特征事件,(对应 {@link DEV_EVENT_HUMANTRAIT_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_HUMANTRAIT					= 0x00000215;

	/**
	 * \if ENGLISH_LANG
	 * alarm of Head detection
	 * \else
	 * LC人头检测事件,(对应 {@link DEV_EVENT_LE_HEADDETECTION_INFO})
	 * \endif
	 */
	public static final int  EVENT_ALARM_LE_HEADDETECTION			= 0x00000216;
	
	/**
	 * \if ENGLISH_LANG
	 * Event of face analysis，rule is {@link CFG_FACEANALYSIS_INFO}
	 * \else
	 * 目标分析事件,(对应规则 {@link CFG_FACEANALYSIS_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_FACEANALYSIS                 = 0x00000217;

	/**
	 * \if ENGLISH_LANG
	 * event of Yale token bad
	 * \else
	 * Yale token失效事件，只用于订阅手机推送
	 * \endif
	 */
	public static final int  EVENT_ALARM_YALE_DROPBOX_BADTOKEN   = 0X00000221;

	/**
	 * \if ENGLISH_LANG
	 * Rule config of X ray detection，{@link DEV_EVENT_XRAY_DETECTION_INFO}
	 * \else
	 * X光检测事件，{@link DEV_EVENT_XRAY_DETECTION_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_XRAY_DETECTION   = 0X00000223;

	/**
	 * \if ENGLISH_LANG
	 * Event of crowd detection(Corresponding to {@link DEV_EVENT_CROWD_DETECTION_INFO})
	 * \else
	 * 人群密度检测事件，{@link DEV_EVENT_CROWD_DETECTION_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_CROWDDETECTION   = 0X0000022C;

	/**
	 * \if ENGLISH_LANG
	 * Pedestrian Junction Event，{@link DEV_EVENT_PEDESTRIAN_JUNCTION_INFO}
	 * \else
	 * 行人卡口事件，{@link DEV_EVENT_PEDESTRIAN_JUNCTION_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_PEDESTRIAN_JUNCTION   = 0X00000230;

	/**
	 * \if ENGLISH_LANG
	 * Event of POS ExChange (Corresponding to  {@link DEV_EVENT_POS_EXCHANGE_INFO})
	 * \else
	 * POS机交易事件(对应 {@link DEV_EVENT_POS_EXCHANGE_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_POS_EXCHANGE				 = 0x00000236;

	/**
	 * \if ENGLISH_LANG
	 * Event of non-motor without safehat,corresponding to {@link DEV_EVENT_TRAFFIC_NONMOTOR_OVERLOAD_INFO}
	 * \else
	 * 非机动车超载事件 (对应 {@link DEV_EVENT_TRAFFIC_NONMOTOR_OVERLOAD_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_NONMOTOR_OVERLOAD = 0x0000024B;

	/**
	 * \if ENGLISH_LANG
	 * Event of non-motor without safehat,corresponding to {@link DEV_EVENT_TRAFFIC_NONMOTOR_WITHOUTSAFEHAT_INFO}
	 * \else
	 * 非机动车未戴安全帽事件 (对应 {@link DEV_EVENT_TRAFFIC_NONMOTOR_WITHOUTSAFEHAT_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_NONMOTOR_WITHOUTSAFEHAT = 0x0000024C;

	/**
	 * \if ENGLISH_LANG
	 * Lane Departure warnning(Corresponding to {@link DEV_EVENT_LANEDEPARTURE_WARNNING_INFO})
	 * \else
	 * 车道偏移预警(对应 {@link DEV_EVENT_LANEDEPARTURE_WARNNING_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_LANEDEPARTURE_WARNNING    = 0x00000251;

	/**
	 * \if ENGLISH_LANG
	 * Forward Collision Warnning(Corresponding to {@link DEV_EVENT_FORWARDCOLLISION_WARNNING_INFO})
	 * \else
	 * 前向碰撞预警(对应 {@link DEV_EVENT_FORWARDCOLLISION_WARNNING_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_FORWARDCOLLISION_WARNNING    = 0x00000252;

	/**
	 * \if ENGLISH_LANG
	 * Event of NonMotor hold umbrella(Corresponding to {@link DEV_EVENT_TRAFFIC_NONMOTOR_HOLDUMBRELLA_INFO})
	 * \else
	 * 非机动车装载伞具(对应 {@link DEV_EVENT_TRAFFIC_NONMOTOR_HOLDUMBRELLA_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_NONMOTOR_HOLDUMBRELLA    = 0x00000254;

	/**
	 * \if ENGLISH_LANG
	 * Event of FloatingObject detection(Corresponding to {@link DEV_EVENT_FLOATINGOBJECT_DETECTION_INFO})
	 * \else
	 * 漂浮物检测事件(对应 {@link DEV_EVENT_FLOATINGOBJECT_DETECTION_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_FLOATINGOBJECT_DETECTION    = 0x00000257;

	/**
	 * \if ENGLISH_LANG
	 * vent of Radar speed limit alarm(Corresponding to {@link DEV_EVENT_RADAR_SPEED_LIMIT_ALARM_INFO})
	 * \else
	 * 雷达限速报警事件(对应 {@link DEV_EVENT_RADAR_SPEED_LIMIT_ALARM_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_RADAR_SPEED_LIMIT_ALARM    = 0x0000025C;

 	/**
 	 * \if ENGLISH_LANG
	 * Event of Water level detection (Corresponding to {@link DEV_EVENT_WATER_LEVEL_DETECTION_INFO})
	 * \else
	 * 水位检测事件(对应 {@link DEV_EVENT_WATER_LEVEL_DETECTION_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_WATER_LEVEL_DETECTION    = 0x0000025D;

	/**
	 * \if ENGLISH_LANG
	 * Event of classroom behavior detection (Corresponding to {@link DEV_EVENT_CLASSROOM_BEHAVIOR_INFO})
	 * \else
	 * 课堂行为分析事件(对应 {@link DEV_EVENT_CLASSROOM_BEHAVIOR_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_CLASSROOM_BEHAVIOR    = 0x0000026A;

	/**
	 * \if ENGLISH_LANG
	 * Event of safe driving vehicle distance near alarm (Corresponding to {@link DEV_EVENT_VEHICLE_DISTANCE_NEAR_INFO})
	 * \else
	 * 安全驾驶车距过近报警事件(对应 {@link DEV_EVENT_VEHICLE_DISTANCE_NEAR_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_VEHICLE_DISTANCE_NEAR    = 0x0000026B;

	/**
	 * \if ENGLISH_LANG
	 * Event of traffic driver change alarm (Corresponding to {@link DEV_EVENT_TRAFFIC_DRIVER_CHANGE_INFO})
	 * \else
	 * 驾驶员变更报警事件(对应 {@link DEV_EVENT_TRAFFIC_DRIVER_CHANGE_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_DRIVER_CHANGE    = 0x0000026D;

	/**
	 * \if ENGLISH_LANG
	 * Event of work clothes(helmet/clothes)detection(Corresponding to {@link DEV_EVENT_WORKCLOTHES_DETECT_INFO}),rule structure is {@link CFG_WORKCLOTHES_DETECT_INFO}
	 * \else
	 * 工装(安全帽/工作服等)检测事件(对应 {@link DEV_EVENT_WORKCLOTHES_DETECT_INFO}), 对应规则的结构体是{@link CFG_WORKCLOTHES_DETECT_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_WORKCLOTHES_DETECT = 0x0000026E;

	/**
	 * \if ENGLISH_LANG
	 * infrared block,corresponding to {@link DEV_EVENT_INFRAREDBLOCK_INFO}
	 * \else
	 * 红外阻断事件，对应结构体{@link DEV_EVENT_INFRAREDBLOCK_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_INFRAREDBLOCK    = 0x00000275;

	/**
	 * \if ENGLISH_LANG
	 * smart motion human alarm,corresponding to {@link DEV_EVENT_SMARTMOTION_HUMAN_INFO}
	 * \else
	 * 智能视频移动侦测事件(人)，对应结构体{@link DEV_EVENT_SMARTMOTION_HUMAN_INFO}
	 * \endif
	 */
	public static final int  EVENT_ALARM_SMARTMOTION_HUMAN    = 0x00000279;

	/**
	 * \if ENGLISH_LANG
	 * smart motion vehicle alarm
	 * \else
	 * 智能视频移动侦测事件(车),只用于订阅手机推送
	 * \endif
	 */
	public static final int  EVENT_ALARM_SMARTMOTION_VEHICLE    = 0x0000027A;


	/**
	 * \if ENGLISH_LANG
	 * Event of car driving in or out(Corresponding to {@link DEV_EVENT_CAR_DRIVING_IN_OUT_INFO})
	 * \else
	 * 辆驶入驶出状态事件(对应 {@link DEV_EVENT_CAR_DRIVING_IN_OUT_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_CAR_DRIVING_IN_OUT = 0x0000027B;

	/**
	 * \if ENGLISH_LANG
	 * Event of parking spcae status(Corresponding to {@link DEV_EVENT_PARKINGSPACE_STATUS_INFO})
	 * \else
	 * 停车位状态事件(对应 {@link DEV_EVENT_PARKINGSPACE_STATUS_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_PARKINGSPACE_STATUS = 0x0000027C;

	/**
	 * \if ENGLISH_LANG
	 * Event violent throw detection(Corresponding to {@link DEV_EVENT_VIOLENT_THROW_DETECTION_INFO})
	 * \else
	 * 暴力抛物检测(对应 {@link DEV_EVENT_VIOLENT_THROW_DETECTION_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_VIOLENT_THROW_DETECTION = 0x0000027D;

	/**
	 * \if ENGLISH_LANG
	 * Event of TramCarSectionsDetection(Corresponding to {@link DEV_EVENT_TRAMCARSECTIONS_DETECTION_INFO})
	 * \else
	 * 矿车超挂报警事件(对应 {@link DEV_EVENT_TRAMCARSECTIONS_DETECTION_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAMCARSECTIONS_DETECTION	= 0x0000027E;


	/**
	 * \if ENGLISH_LANG
	 * Event of alarm box, only for mobile push
	 * \else
	 * 报警盒通道的触发报警事件, 目前只用于订阅手机推送
	 * \endif
	 */
	public static final int  EVENT_IVS_ALARM_BOX_ALARM = 0x0000027F;

	/**
	 * \if ENGLISH_LANG
	 * Event of face comparision, only for mobile push
	 * \else
	 * 目标比对事件, 专用于手机推送的目标识别事件, 目前只用于订阅手机推送
	 * \endif
	 */
	public static final int  EVENT_IVS_FACE_COMPARISION = 0x00000280;

	/**
	 * \if ENGLISH_LANG
	 * Event of animal detection{@link DEV_EVENT_ANIMAL_DETECTION_INFO}
	 * \else
	 * 动物检测事件{@link DEV_EVENT_ANIMAL_DETECTION_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_ANIMAL_DETECTION = 0x00000286;

	/**
	 * \if ENGLISH_LANG
	 * Event of Audio intensity,{@link DEV_EVENT_AUDIO_INTENSITY_INFO}
	 * \else
	 *  异常音事件(对应 {@link DEV_EVENT_AUDIO_INTENSITY_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_AUDIO_INTENSITY = 0x00000296;


	/**
	 * \if ENGLISH_LANG
	 * Event of Smart kitchen wearing detection(alarm for not wearing mask, chef's clothes whose color does not meet the requirements)，rule Corresponding to CFG_SMART_KITCHEN_CLOTHES_DETECTION)
	 * \else
	 * 智慧厨房穿着检测事件（对不戴口罩、厨师帽以及颜色不符合规定的厨师服进行报警）对应规则 {@link CFG_SMART_KITCHEN_CLOTHES_DETECTION}
	 * \endif
	 */
	public static final int  EVENT_IVS_SMART_KITCHEN_CLOTHES_DETECTION = 0x0000029D;

	/**
	 * \if ENGLISH_LANG
	 * Event of Intelligent detection of human body temperature,{@link DEV_EVENT_ANATOMY_TEMP_DETECT_INFO}
	 * \else
	 *  人体温智能检测事件(对应 {@link DEV_EVENT_ANATOMY_TEMP_DETECT_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_ANATOMY_TEMP_DETECT = 0x00000303;

	/**
	 * \if ENGLISH_LANG
	 * Event of non-motor vehicle access elevator,{@link DEV_EVENT_NONMOTOR_ENTRYING_INFO}
	 * \else
	 *  非机动车进入电梯(对应 {@link DEV_EVENT_NONMOTOR_ENTRYING_INFO})
	 * \endif
	 */
	public static final int  EVENT_IVS_NONMOTOR_ENTRYING = 0x0000030C;

	/**
	 * \if ENGLISH_LANG
	 * Event of traffic driver abnormal alarm,rule corresponding to {@link DEV_EVENT_TRAFFIC_DRIVER_ABNORMAL_INFO}
	 * \else
	 *  驾驶员异常报警事件,规则配置对应{@link DEV_EVENT_TRAFFIC_DRIVER_ABNORMAL_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_DRIVER_ABNORMAL = 0x0000026C;

	/**
	 * \if ENGLISH_LANG
	 * Event of work state detection,rule corresponding to {@link CFG_WORKSTATDETECTION_INFO}
	 * \else
	 *  作业统计事件,规则配置对应{@link CFG_WORKSTATDETECTION_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_WORKSTATDETECTION = 0x00000274;

	/**
	 * \if ENGLISH_LANG
	 * Event of traffic non-motor run redlight,corresponding to {@link DEV_EVENT_TRAFFIC_NONMOTOR_RUN_REDLIGHT_INFO}
	 * \else
	 * 非机动车闯红灯 (对应 {@link DEV_EVENT_TRAFFIC_NONMOTOR_RUN_REDLIGHT_INFO} )
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_NONMOTOR_RUN_REDLIGHT = 0x00000310;


	/**
	 * \if ENGLISH_LANG
	 * Event of Talk action,corresponding to {@link DEV_EVENT_DO_TALK_ACTION_INFO}
	 * \else
	 *  对讲动作事件,对应{@link DEV_EVENT_DO_TALK_ACTION_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_DO_TALK_ACTION = 0x00000323;


	/**
	 * \if ENGLISH_LANG
	 * Event of Talk action,corresponding to {@link DEV_EVENT_TRAFFIC_NON_MOTOR_RETROGRADE_INFO}
	 * \else
	 * 非机动车逆行事件,对应{@link DEV_EVENT_TRAFFIC_NON_MOTOR_RETROGRADE_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_NON_MOTOR_RETROGRADE = 0x00000328;

	/**
	 * \if ENGLISH_LANG
	 * Event of Object abnormal,corresponding to {@link DEV_EVENT_OBJECT_ABNORMAL_INFO}
	 * \else
	 * 目标异常事件,对应{@link DEV_EVENT_OBJECT_ABNORMAL_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_OBJECT_ABNORMAL = 0x00000340;

	/**
	 * \if ENGLISH_LANG
	 * Driving behavior analysis Blind spot detection,corresponding to {@link DEV_EVENT_BLIND_SPOT_DETECTION_INFO}
	 * \else
	 * 驾驶行为分析 盲点检测,对应{@link DEV_EVENT_BLIND_SPOT_DETECTION_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_DRIVE_BLIND_SPOT = 0x00000344;

	/**
	 * \if ENGLISH_LANG
	 * Not wearing seat belt alarm event,corresponding to {@link DEV_EVENT_TRAFFIC_DRIVER_NO_BELT_INFO}
	 * \else
	 *  未系安全带报警事件,对应{@link DEV_EVENT_TRAFFIC_DRIVER_NO_BELT_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_TRAFFIC_DRIVER_NO_BELT = 0x00000400;

	/**
	 * \if ENGLISH_LANG
	 * Human Animal Coexistence Event,corresponding to {@link DEV_EVENT_HUMAN_ANIMAL_COEXISTENCE_INFO}
	 * \else
	 *  人和动物检测事件,对应{@link DEV_EVENT_HUMAN_ANIMAL_COEXISTENCE_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_HUMAN_ANIMAL_COEXISTENCE = 0x00000411;

	/**
	 * \if ENGLISH_LANG
	 * Door opening and closing detection event,corresponding to {@link NET_DEV_EVENT_DOOR_STATE_DETECTION_INFO}
	 * \else
	 *  开关门检测事件,对应{@link NET_DEV_EVENT_DOOR_STATE_DETECTION_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_DOOR_STATE_DETECTION = 0x00000424;

	/**
	 * \if ENGLISH_LANG
	 * Cigarette case detection event,corresponding to {@link NET_DEV_EVENT_CIGARETTE_CASE_DETECTION_INFO}
	 * \else
	 *  烟盒检测事件,对应{@link NET_DEV_EVENT_CIGARETTE_CASE_DETECTION_INFO}
	 * \endif
	 */
	public static final int  EVENT_IVS_CIGARETTE_CASE_DETECTION = 0x00000450;


	/**
	 * \if ENGLISH_LANG
	 * Elevator Alarm event,corresponding to {@link NET_DEV_EVENT_ELEVATOR_ALARM_INFO}
	 * \else
	 *  电梯异常报警,对应{@link NET_DEV_EVENT_ELEVATOR_ALARM_INFO}
	 * \endif
	 */
	public static final int EVENT_IVS_ELEVATOR_ALARM = 0x00000494;

	/****************************************************************************
	 * 			 错误类型代号,对应{@link INetSDK#GetLastError}接口的返回值		*
	 ****************************************************************************/

	/**
	 * \if ENGLISH_LANG
	 * return
	 * \else
	 * 错误类型代号,对应{@link INetSDK#GetLastError}接口的返回值
	 * \endif
	 */

	/**
	 * \if ENGLISH_LANG
	 * No error
	 * \else
	 * 没有错误
	 * \endif
	 */
	public static final int NET_NOERROR= 0;

	/**
	 * \if ENGLISH_LANG
	 * Unknown error
	 * \else
	 * 未知错误
	 * \endif
	 */
	public static final int NET_ERROR= -1;

	/**
	 * \if ENGLISH_LANG
	 * Windows system error
	 * \else
	 * Windows系统出错
	 * \endif
	 */
	public static final int NET_SYSTEM_ERROR= (0x80000000|1);

	/**
	 * \if ENGLISH_LANG
	 * Protocol error it may result from network timeout
	 * \else
	 * 网络错误，可能是因为网络超时
	 * \endif
	 */
	public static final int NET_NETWORK_ERROR= (0x80000000|2);

	/**
	 * \if ENGLISH_LANG
	 * Device protocol does not match
	 * \else
	 * 设备协议不匹配
	 * \endif
	 */
	public static final int NET_DEV_VER_NOMATCH= (0x80000000|3);

	/**
	 * \if ENGLISH_LANG
	 * Handle is invalid
	 * \else
	 * 句柄无效
	 * \endif
	 */
	public static final int NET_INVALID_HANDLE= (0x80000000|4);

	/**
	 * \if ENGLISH_LANG
	 * Failed to open channel
	 * \else
	 * 打开通道失败
	 * \endif
	 */
	public static final int NET_OPEN_CHANNEL_ERROR= (0x80000000|5);

	/**
	 * \if ENGLISH_LANG
	 * Failed to close channel
	 * \else
	 * 关闭通道失败
	 * \endif
	 */
	public static final int NET_CLOSE_CHANNEL_ERROR= (0x80000000|6);

	/**
	 * \if ENGLISH_LANG
	 * User parameter is illegal
	 * \else
	 * 用户参数不合法
	 * \endif
	 */
	public static final int NET_ILLEGAL_PARAM= (0x80000000|7);

	/**
	 * \if ENGLISH_LANG
	 * SDK initialization error
	 * \else
	 * SDK初始化出错
	 * \endif
	 */
	public static final int NET_SDK_INIT_ERROR= (0x80000000|8);

	/**
	 * \if ENGLISH_LANG
	 * SDK clear error
	 * \else
	 * SDK清理出错
	 * \endif
	 */
	public static final int NET_SDK_UNINIT_ERROR= (0x80000000|9);

	/**
	 * \if ENGLISH_LANG
	 * Error occurs when apply for render resources.
	 * \else
	 * 申请render资源出错
	 * \endif
	 */
	public static final int NET_RENDER_OPEN_ERROR= (0x80000000|10);

	/**
	 * \if ENGLISH_LANG
	 * Error occurs when opening the decoder library
	 * \else
	 * 打开解码库出错
	 * \endif
	 */
	public static final int NET_DEC_OPEN_ERROR= (0x80000000|11);

	/**
	 * \if ENGLISH_LANG
	 * Error occurs when closing the decoder library
	 * \else
	 * 关闭解码库出错
	 * \endif
	 */
	public static final int NET_DEC_CLOSE_ERROR= (0x80000000|12);

	/**
	 * \if ENGLISH_LANG
	 * The detected channel number is 0 in multiple-channel preview.
	 * \else
	 * 多画面预览中检测到通道数为0
	 * \endif
	 */
	public static final int NET_MULTIPLAY_NOCHANNEL= (0x80000000|13);

	/**
	 * \if ENGLISH_LANG
	 * Failed to initialize record library
	 * \else
	 * 录音库初始化失败
	 * \endif
	 */
	public static final int NET_TALK_INIT_ERROR= (0x80000000|14);

	/**
	 * \if ENGLISH_LANG
	 * The record library has not been initialized
	 * \else
	 * 录音库未经初始化
	 * \endif
	 */
	public static final int NET_TALK_NOT_INIT= (0x80000000|15);

	/**
	 * \if ENGLISH_LANG
	 * Error occurs when sending out audio data
	 * \else
	 * 发送音频数据出错
	 * \endif
	 */
	public static final int	NET_TALK_SENDDATA_ERROR= (0x80000000|16);

	/**
	 * \if ENGLISH_LANG
	 * The real-time has been protected.
	 * \else
	 * 实时数据已经处于保存状态
	 * \endif
	 */
	public static final int NET_REAL_ALREADY_SAVING= (0x80000000|17);

	/**
	 * \if ENGLISH_LANG
	 * The real-time data has not been save.
	 * \else
	 * 未保存实时数据
	 * \endif
	 */
	public static final int NET_NOT_SAVING= (0x80000000|18);

	/**
	 * \if ENGLISH_LANG
	 * Error occurs when opening the file.
	 * \else
	 * 打开文件出错
	 * \endif
	 */
	public static final int NET_OPEN_FILE_ERROR= (0x80000000|19);

	/**
	 * \if ENGLISH_LANG
	 * Failed to enable PTZ to control timer.
	 * \else
	 * 启动云台控制定时器失败
	 * \endif
	 */
	public static final int NET_PTZ_SET_TIMER_ERROR= (0x80000000|20);

	/**
	 * \if ENGLISH_LANG
	 * Error occurs when verify returned data.
	 * \else
	 * 对返回数据的校验出错
	 * \endif
	 */
	public static final int NET_RETURN_DATA_ERROR= (0x80000000|21);

	/**
	 * \if ENGLISH_LANG
	 * There is no sufficient buffer.
	 * \else
	 * 没有足够的缓存
	 * \endif
	 */
	public static final int NET_INSUFFICIENT_BUFFER= (0x80000000|22);

	/**
	 * \if ENGLISH_LANG
	 * The current SDK does not support this fucntion.
	 * \else
	 * 当前SDK未支持该功能
	 * \endif
	 */
	public static final int NET_NOT_SUPPORTED= (0x80000000|23);

	/**
	 * \if ENGLISH_LANG
	 * There is no searched result.
	 * \else
	 * 查询不到录象
	 * \endif
	 */
	public static final int NET_NO_RECORD_FOUND= (0x80000000|24);

	/**
	 * \if ENGLISH_LANG
	 * You have no operation right.
	 * \else
	 * 无操作权限
	 * \endif
	 */
	public static final int NET_NOT_AUTHORIZED= (0x80000000|25);

	/**
	 * \if ENGLISH_LANG
	 * Can not operate right now.
	 * \else
	 * 暂时无法执行
	 * \endif
	 */
	public static final int NET_NOT_NOW= (0x80000000|26);

	/**
	 * \if ENGLISH_LANG
	 * There is no audio talk channel.
	 * \else
	 * 未发现对讲通道
	 * \endif
	 */
	public static final int NET_NO_TALK_CHANNEL= (0x80000000|27);

	/**
	 * \if ENGLISH_LANG
	 * There is no audio.
	 * \else
	 * 未发现音频
	 * \endif
	 */
	public static final int NET_NO_AUDIO= (0x80000000|28);

	/**
	 * \if ENGLISH_LANG
	 * The network SDK has not been initialized.
	 * \else
	 * 网络SDK未经初始化
	 * \endif
	 */
	public static final int NET_NO_INIT= (0x80000000|29);

	/**
	 * \if ENGLISH_LANG
	 * The download completed.
	 * \else
	 * 下载已结束
	 * \endif
	 */
	public static final int NET_DOWNLOAD_END= (0x80000000|30);

	/**
	 * \if ENGLISH_LANG
	 * There is no searched result.
	 * \else
	 * 查询结果为空
	 * \endif
	 */
	public static final int NET_EMPTY_LIST= (0x80000000|31);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get system property setup.
	 * \else
	 * 获取系统属性配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SYSATTR= (0x80000000|32);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get SN.
	 * \else
	 * 获取序列号失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SERIAL= (0x80000000|33);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get general property.
	 * \else
	 * 获取常规属性失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_GENERAL= (0x80000000|34);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get DSP capacity description.
	 * \else
	 * 获取DSP能力描述失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_DSPCAP= (0x80000000|35);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get network channel setup.
	 * \else
	 * 获取网络配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_NETCFG= (0x80000000|36);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get channel name.
	 * \else
	 * 获取通道名称失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_CHANNAME= (0x80000000|37);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get video property.
	 * \else
	 * 获取视频属性失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_VIDEO= (0x80000000|38);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get record setup
	 * \else
	 * 获取录象配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_RECORD= (0x80000000|39);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get decoder protocol name
	 * \else
	 * 获取解码器协议名称失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_PRONAME= (0x80000000|40);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get 232 COM function name.
	 * \else
	 * 获取232串口功能名称失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_FUNCNAME= (0x80000000|41);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get decoder property
	 * \else
	 * 获取解码器属性失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_485DECODER= (0x80000000|42);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get 232 COM setup
	 * \else
	 * 获取232串口配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_232COM= (0x80000000|43);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get external alarm input setup
	 * \else
	 * 获取外部报警输入配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_ALARMIN= (0x80000000|44);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get motion detection alarm
	 * \else
	 * 获取动态检测报警失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_ALARMDET= (0x80000000|45);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get device time
	 * \else
	 * 获取设备时间失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SYSTIME= (0x80000000|46);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get preview parameter
	 * \else
	 * 获取预览参数失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_PREVIEW= (0x80000000|47);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get audio maintenance setup
	 * \else
	 * 获取自动维护配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_AUTOMT= (0x80000000|48);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get video matrix setup
	 * \else
	 * 获取视频矩阵配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_VIDEOMTRX= (0x80000000|49);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get privacy mask zone setup
	 * \else
	 * 获取区域遮挡配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_COVER= (0x80000000|50);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get video watermark setup
	 * \else
	 * 获取图象水印配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_WATERMAKE= (0x80000000|51);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify general property
	 * \else
	 * 修改常规属性失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_GENERAL= (0x80000000|55);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify channel setup
	 * \else
	 * 修改网络配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_NETCFG= (0x80000000|56);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify channel name
	 * \else
	 * 修改通道名称失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_CHANNAME= (0x80000000|57);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify video channel
	 * \else
	 * 修改视频属性失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_VIDEO= (0x80000000|58);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify record setup
	 * \else
	 * 端修改录象配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_RECORD= (0x80000000|59);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify decoder property
	 * \else
	 * 修改解码器属性失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_485DECODER= (0x80000000|60);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify 232 COM setup
	 * \else
	 * 修改232串口配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_232COM= (0x80000000|61);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify external input alarm setup
	 * \else
	 * 修改外部输入报警配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_ALARMIN= (0x80000000|62);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify motion detection alarm setup
	 * \else
	 * 修改动态检测报警配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_ALARMDET= (0x80000000|63);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify device time
	 * \else
	 * 修改设备时间失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_SYSTIME= (0x80000000|64);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify preview parameter
	 * \else
	 * 修改预览参数失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_PREVIEW= (0x80000000|65);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify auto maintenance setup
	 * \else
	 * 修改自动维护配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_AUTOMT= (0x80000000|66);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify video matrix setup
	 * \else
	 * 修改视频矩阵配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_VIDEOMTRX= (0x80000000|67);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify privacy mask zone
	 * \else
	 * 修改区域遮挡配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_COVER= (0x80000000|68);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify video watermark setu
	 * \else
	 * 修改图象水印配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_WATERMAKE= (0x80000000|69);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify wireless network information
	 * \else
	 * 修改无线网络信息失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_WLAN= (0x80000000|70);

	/**
	 * \if ENGLISH_LANG
	 * Failed to select wireless network device
	 * \else
	 * 选择无线网络设备失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_WLANDEV= (0x80000000|71);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify the actively registration parameter setup.
	 * \else
	 * 修改主动注册参数配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_REGISTER= (0x80000000|72);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify camera property
	 * \else
	 * 修改摄像头属性配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_CAMERA= (0x80000000|73);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify IR alarm setup
	 * \else
	 * 修改红外报警配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_INFRARED= (0x80000000|74);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify audio alarm setup
	 * \else
	 * 修改音频报警配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_SOUNDALARM= (0x80000000|75);

	/**
	 * \if ENGLISH_LANG
	 * Failed to modify storage position setup
	 * \else
	 * 修改存储位置配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_STORAGE= (0x80000000|76);

	/**
	 * \if ENGLISH_LANG
	 * The audio encode port has not been successfully initialized.
	 * \else
	 * 音频编码接口没有成功初始化
	 * \endif
	 */
	public static final int NET_AUDIOENCODE_NOTINIT= (0x80000000|77);

	/**
	 * \if ENGLISH_LANG
	 * The data are too long.
	 * \else
	 *  数据过长
	 * \endif
	 */
	public static final int NET_DATA_TOOLONGH= (0x80000000|78);

	/**
	 * \if ENGLISH_LANG
	 * The device does not support current operation.
	 * \else
	 * 设备不支持该操作
	 * \endif
	 */
	public static final int NET_UNSUPPORTED= (0x80000000|79);

	/**
	 * \if ENGLISH_LANG
	 * Device resources is not sufficient.
	 * \else
	 * 设备资源不足
	 * \endif
	 */
	public static final int NET_DEVICE_BUSY= (0x80000000|80);

	/**
	 * \if ENGLISH_LANG
	 * The server has boot up
	 * \else
	 * 服务器已经启动
	 * \endif
	 */
	public static final int NET_SERVER_STARTED= (0x80000000|81);

	/**
	 * \if ENGLISH_LANG
	 * The server has not fully boot up
	 * \else
	 * 服务器尚未成功启动
	 * \endif
	 */
	public static final int NET_SERVER_STOPPED= (0x80000000|82);

	/**
	 * \if ENGLISH_LANG
	 * Input serial number is not correct.
	 * \else
	 * 输入序列号有误
	 * \endif
	 */
	public static final int NET_LISTER_INCORRECT_SERIAL= (0x80000000|83);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get HDD information.
	 * \else
	 * 获取硬盘信息失败
	 * \endif
	 */
	public static final int NET_QUERY_DISKINFO_FAILED= (0x80000000|84);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get connect session information.
	 * \else
	 * 获取连接Session信息
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SESSION= (0x80000000|85);

	/**
	 * \if ENGLISH_LANG
	 * The password you typed is incorrect. You have exceeded the maximum number of retries.
	 * \else
	 * 输入密码错误超过限制次数
	 * \endif
	 */
	public static final int NET_USER_FLASEPWD_TRYTIME= (0x80000000|86);

	/**
	 * \if ENGLISH_LANG
	 * Password is not correct
	 * \else
	 * 密码不正确
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_PASSWORD= (0x80000000|100);

	/**
	 * \if ENGLISH_LANG
	 * The account does not exist
	 * \else
	 * 帐户不存在
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_USER= (0x80000000|101);

	/**
	 * \if ENGLISH_LANG
	 * Time out for log in returned value.
	 * \else
	 * 等待登录返回超时
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_TIMEOUT= (0x80000000|102);

	/**
	 * \if ENGLISH_LANG
	 * The account has logged in
	 * \else
	 * 帐号已登录
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_RELOGGIN= (0x80000000|103);

	/**
	 * \if ENGLISH_LANG
	 * The account has been locked
	 * \else
	 *帐号已被锁定
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_LOCKED= (0x80000000|104);

	/**
	 * \if ENGLISH_LANG
	 * The account bas been in the block list
	 * \else
	 * 帐号已被列为禁止名单
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_BLACKLIST= (0x80000000|105);

	/**
	 * \if ENGLISH_LANG
	 * Resources are not sufficient. System is busy now.
	 * \else
	 * 资源不足，系统忙
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_BUSY= (0x80000000|106);

	/**
	 * \if ENGLISH_LANG
	 * Time out. Please check network and try again.
	 * \else
	 * 登录设备超时，请检查网络并重试
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_CONNECT= (0x80000000|107);

	/**
	 * \if ENGLISH_LANG
	 * Network connection failed.
	 * \else
	 * 网络连接失败
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_NETWORK= (0x80000000|108);

	/**
	 * \if ENGLISH_LANG
	 * Successfully logged in the device but can not create video channel. Please check network connection.
	 * \else
	 * 登录设备成功，但无法创建视频通道，请检查网络状况
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_SUBCONNECT= (0x80000000|109);

	/**
	 * \if ENGLISH_LANG
	 * Exceed the max connect number
	 * \else
	 * 超过最大连接数
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_MAXCONNECT= (0x80000000|110);

	/**
	 * \if ENGLISH_LANG
	 * Protocol 3 support
	 * \else
	 * 只支持3代协议
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_PROTOCOL3_ONLY= (0x80000000|111);

	/**
	 * \if ENGLISH_LANG
	 * There is no USB or USB info error
	 * \else
	 * 未插入U盾或U盾信息错误
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_UKEY_LOST= (0x80000000|112);

	/**
	 * \if ENGLISH_LANG
	 * Client-end IP address has no right to login
	 * \else
	 * 客户端IP地址没有登录权限
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_NO_AUTHORIZED= (0x80000000|113);

	/**
	 * \if ENGLISH_LANG
	 * user or password error
	 * \else
	 * 账号或密码错误
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_USER_OR_PASSOWRD= (0x80000000|117);

	/**
	 * \if ENGLISH_LANG
	 * cannot login because the device has not been init,please init the device and then login
	 * \else
	 * 设备尚未初始化，不能登录，请先初始化设备
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_DEVICE_NOT_INIT= (0x80000000|118);

	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library open audio.
	 * \else
	 * Render库打开音频出错
	 * \endif
	 */
	public static final int NET_RENDER_SOUND_ON_ERROR= (0x80000000|120);

	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library close audio
	 * \else
	 * Render库关闭音频出错
	 * \endif
	 */
	public static final int NET_RENDER_SOUND_OFF_ERROR= (0x80000000|121);

	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library control volume
	 * \else
	 * 端Render库控制音量出错
	 * \endif
	 */
	public static final int NET_RENDER_SET_VOLUME_ERROR= (0x80000000|122);

	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library set video parameter
	 * \else
	 * Render库设置画面参数出错
	 * \endif
	 */
	public static final int NET_RENDER_ADJUST_ERROR= (0x80000000|123);

	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library pause play
	 * \else
	 * Render库暂停播放出错
	 * \endif
	 */
	public static final int NET_RENDER_PAUSE_ERROR= (0x80000000|124);

	/**
	 * \if ENGLISH_LANG
	 * Render library snapshot error
	 * \else
	 * Render库抓图出错
	 * \endif
	 */
	public static final int NET_RENDER_SNAP_ERROR= (0x80000000|125);

	/**
	 * \if ENGLISH_LANG
	 * Render library stepper error
	 * \else
	 * Render库步进出错
	 * \endif
	 */
	public static final int NET_RENDER_STEP_ERROR= (0x80000000|126);

	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render library set frame rate.
	 * \else
	 * Render库设置帧率出错
	 * \endif
	 */
	public static final int NET_RENDER_FRAMERATE_ERROR= (0x80000000|127);

	/**
	 * \if ENGLISH_LANG
	 * Error occurs when Render lib setting show region
	 * \else
	 * Render库设置显示区域出错
	 * \endif
	 */
	public static final int NET_RENDER_DISPLAYREGION_ERROR= (0x80000000|128);

	/**
	 * \if ENGLISH_LANG
	 * Group name has been existed.
	 * \else
	 * 组名已存在
	 * \endif
	 */
	public static final int NET_GROUP_EXIST= (0x80000000|140);

	/**
	 * \if ENGLISH_LANG
	 * The group name does not exist.
	 * \else
	 * 组名不存在
	 * \endif
	 */
	public static final int	NET_GROUP_NOEXIST= (0x80000000|141);

	/**
	 * \if ENGLISH_LANG
	 * The group right exceeds the right list!
	 * \else
	 * 组的权限超出权限列表范围
	 * \endif
	 */
	public static final int NET_GROUP_RIGHTOVER= (0x80000000|142);

	/**
	 * \if ENGLISH_LANG
	 * The group can not be removed since there is user in it!
	 * \else
	 * 组下有用户，不能删除
	 * \endif
	 */
	public static final int NET_GROUP_HAVEUSER= (0x80000000|143);

	/**
	 * \if ENGLISH_LANG
	 * The user has used one of the group right. It can not be removed.
	 * \else
	 * 组的某个权限被用户使用，不能出除
	 * \endif
	 */
	public static final int NET_GROUP_RIGHTUSE= (0x80000000|144);

	/**
	 * \if ENGLISH_LANG
	 * New group name has been existed
	 * \else
	 * 新组名同已有组名重复
	 * \endif
	 */
	public static final int NET_GROUP_SAMENAME= (0x80000000|145);

	/**
	 * \if ENGLISH_LANG
	 * The user name has been existed
	 * \else
	 * 用户已存在
	 * \endif
	 */
	public static final int	NET_USER_EXIST= (0x80000000|146);

	/**
	 * \if ENGLISH_LANG
	 * The account does not exist.
	 * \else
	 * 用户不存在
	 * \endif
	 */
	public static final int NET_USER_NOEXIST= (0x80000000|147);

	/**
	 * \if ENGLISH_LANG
	 * User right exceeds the group right.
	 * \else
	 * 用户权限超出组权限
	 * \endif
	 */
	public static final int NET_USER_RIGHTOVER= (0x80000000|148);

	/**
	 * \if ENGLISH_LANG
	 * Reserved account. It does not allow to be modified.
	 * \else
	 * 保留帐号，不容许修改密码
	 * \endif
	 */
	public static final int NET_USER_PWD= (0x80000000|149);

	/**
	 * \if ENGLISH_LANG
	 * password is not correct
	 * \else
	 * 密码不正确
	 * \endif
	 */
	public static final int NET_USER_FLASEPWD= (0x80000000|150);

	/**
	 * \if ENGLISH_LANG
	 * Password is invalid
	 * \else
	 * 密码不匹配
	 * \endif
	 */
	public static final int NET_USER_NOMATCHING= (0x80000000|151);

	/**
	 * \if ENGLISH_LANG
	 * Account in use
	 * \else
	 *  账号正在使用中
	 * \endif
	 */
	public static final int NET_USER_INUSE= (0x80000000|152);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get network card setup.
	 * \else
	 * 获取网卡配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_ETHERNET= (0x80000000|300);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get wireless network information.
	 * \else
	 * 获取无线网络信息失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_WLAN= (0x80000000|301);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get wireless network device.
	 * \else
	 * 获取无线网络设备失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_WLANDEV= (0x80000000|302);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get actively registration parameter.
	 * \else
	 * 获取主动注册参数失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_REGISTER= (0x80000000|303);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get camera property
	 * \else
	 * 获取摄像头属性失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_CAMERA= (0x80000000|304);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get IR alarm setup
	 * \else
	 * 获取红外报警配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_INFRARED= (0x80000000|305);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get audio alarm setup
	 * \else
	 * 获取音频报警配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SOUNDALARM= (0x80000000|306);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get storage position
	 * \else
	 * 获取存储位置配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_STORAGE= (0x80000000|307);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get mail setup.
	 * \else
	 * 获取邮件配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_MAIL= (0x80000000|308);

	/**
	 * \if ENGLISH_LANG
	 * Can not set right now.
	 * \else
	 * 暂时无法设置
	 * \endif
	 */
	public static final int NET_CONFIG_DEVBUSY= (0x80000000|309);

	/**
	 * \if ENGLISH_LANG
	 * The configuration setup data are illegal.
	 * \else
	 * 配置数据不合法
	 * \endif
	 */
	public static final int NET_CONFIG_DATAILLEGAL= (0x80000000|310);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get DST setup
	 * \else
	 * 获取夏令时配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_DST= (0x80000000|311);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set DST
	 * \else
	 * 设置夏令时配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_DST= (0x80000000|312);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get video osd setup.
	 * \else
	 * 获取视频OSD叠加配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_VIDEO_OSD= (0x80000000|313);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set video osd
	 * \else
	 * 设置视频OSD叠加配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_VIDEO_OSD= (0x80000000|314);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get CDMA \ GPRS configuration
	 * \else
	 * 获取CDMA、GPRS网络配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_GPRSCDMA= (0x80000000|315);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set CDMA \ GPRS configuration
	 * \else
	 * 设置CDMA、GPRS网络配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_GPRSCDMA= (0x80000000|316);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get IP Filter configuration
	 * \else
	 * 获取IP过滤配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_IPFILTER= (0x80000000|317);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set IP Filter configuration
	 * \else
	 * 设置IP过滤配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_IPFILTER= (0x80000000|318);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get Talk Encode configuration
	 * \else
	 * 获取语音对讲编码配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_TALKENCODE= (0x80000000|319);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set Talk Encode configuration
	 * \else
	 * 设置语音对讲编码配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_TALKENCODE= (0x80000000|320);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get The length of the video package configuration
	 * \else
	 * 获取录像打包长度配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_RECORDLEN= (0x80000000|321);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set The length of the video package configuration
	 * \else
	 * 设置录像打包长度配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_RECORDLEN= (0x80000000|322);

	/**
	 * \if ENGLISH_LANG
	 * Not support Network hard disk partitionr
	 * \else
	 * 不支持网络硬盘分区
	 * \endif
	 */
	public static final int	NET_DONT_SUPPORT_SUBAREA= (0x80000000|323);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get the register server information
	 * \else
	 * 获取设备上主动注册服务器信息失败
	 * \endif
	 */
	public static final int	NET_ERROR_GET_AUTOREGSERVER= (0x80000000|324);

	/**
	 * \if ENGLISH_LANG
	 * Failed to control actively registration
	 * \else
	 * 主动注册重定向注册错误
	 * \endif
	 */
	public static final int	NET_ERROR_CONTROL_AUTOREGISTER= (0x80000000|325);

	/**
	 * \if ENGLISH_LANG
	 * Failed to disconnect actively registration
	 * \else
	 * 断开主动注册服务器错误
	 * \endif
	 */
	public static final int	NET_ERROR_DISCONNECT_AUTOREGISTER= (0x80000000|326);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get mms configuration
	 * \else
	 * 获取mms配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_MMS= (0x80000000|327);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set mms configuration
	 * \else
	 * 设置mms配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_MMS= (0x80000000|328);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get SMS configuration
	 * \else
	 * 获取短信激活无线连接配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_SMSACTIVATION= (0x80000000|329);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set SMS configuration
	 * \else
	 * 设置短信激活无线连接配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_SMSACTIVATION= (0x80000000|330);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get activation of a wireless connection
	 * \else
	 * 获取拨号激活无线连接配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_DIALINACTIVATION= (0x80000000|331);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set activation of a wireless connection
	 * \else
	 * 设置拨号激活无线连接配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_DIALINACTIVATION= (0x80000000|332);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get the parameter of video output
	 * \else
	 * 查询视频输出参数配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_VIDEOOUT= (0x80000000|333);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set the configuration of video output
	 * \else
	 * 设置视频输出参数配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_VIDEOOUT= (0x80000000|334);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get osd overlay enabling
	 * \else
	 * 获取osd叠加使能配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_OSDENABLE= (0x80000000|335);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set OSD overlay enabling
	 * \else
	 * 设置osd叠加使能配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_OSDENABLE= (0x80000000|336);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set digital input configuration of front encoders
	 * \else
	 * 设置数字通道前端编码接入配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_ENCODERINFO= (0x80000000|337);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get TV adjust configuration
	 * \else
	 * 获取TV调节配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_TVADJUST= (0x80000000|338);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set TV adjust configuration
	 * \else
	 * 设置TV调节配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_TVADJUST= (0x80000000|339);

	/**
	 * \if ENGLISH_LANG
	 * Failed to request to establish a connection
	 * \else
	 * 请求建立连接失败
	 * \endif
	 */
	public static final int NET_ERROR_CONNECT_FAILED= (0x80000000|340);

	/**
	 * \if ENGLISH_LANG
	 * Failed to request to upload burn files
	 * \else
	 * 请求刻录文件上传失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_BURNFILE= (0x80000000|341);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get capture configuration information
	 * \else
	 * 获取抓包配置信息失败
	 * \endif
	 */
	public static final int NET_ERROR_SNIFFER_GETCFG= (0x80000000|342);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set capture configuration information
	 * \else
	 * 设置抓包配置信息失败
	 * \endif
	 */
	public static final int NET_ERROR_SNIFFER_SETCFG= (0x80000000|343);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get download restrictions information
	 * \else
	 * 查询下载限制信息失败
	 * \endif
	 */
	public static final int NET_ERROR_DOWNLOADRATE_GETCFG= (0x80000000|344);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set download restrictions information
	 * \else
	 * 设置下载限制信息失败
	 * \endif
	 */
	public static final int NET_ERROR_DOWNLOADRATE_SETCFG= (0x80000000|345);

	/**
	 * \if ENGLISH_LANG
	 * Failed to query serial port parameters
	 * \else
	 * 查询串口参数失败
	 * \endif
	 */
	public static final int NET_ERROR_SEARCH_TRANSCOM= (0x80000000|346);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get the preset info
	 * \else
	 * 获取预制点信息错误
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_POINT= (0x80000000|347);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set the preset info
	 * \else
	 * 设置预制点信息错误
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_POINT= (0x80000000|348);

	/**
	 * \if ENGLISH_LANG
	 * SDK log out the device abnormally
	 * \else
	 * SDK没有正常登出设备
	 * \endif
	 */
	public static final int NET_SDK_LOGOUT_ERROR= (0x80000000|349);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get vehicle configuration
	 * \else
	 * 获取车载配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GET_VEHICLE_CFG= (0x80000000|350);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set vehicle configuration
	 * \else
	 * 设置车载配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SET_VEHICLE_CFG= (0x80000000|351);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get ATM overlay configuration
	 * \else
	 * 获取atm叠加配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GET_ATM_OVERLAY_CFG= (0x80000000|352);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set ATM overlay configuration
	 * \else
	 * 设置atm叠加配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SET_ATM_OVERLAY_CFG= (0x80000000|353);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get ATM overlay ability
	 * \else
	 * 获取atm叠加能力失败
	 * \endif
	 */
	public static final int NET_ERROR_GET_ATM_OVERLAY_ABILITY= (0x80000000|354);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get decoder tour configuration
	 * \else
	 * 获取解码器解码轮巡配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GET_DECODER_TOUR_CFG= (0x80000000|355);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set decoder tour configuration
	 * \else
	 * 设置解码器解码轮巡配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SET_DECODER_TOUR_CFG= (0x80000000|356);

	/**
	 * \if ENGLISH_LANG
	 * Failed to control decoder tour
	 * \else
	 * 控制解码器解码轮巡失败
	 * \endif
	 */
	public static final int NET_ERROR_CTRL_DECODER_TOUR= (0x80000000|357);

	/**
	 * \if ENGLISH_LANG
	 * Beyond the device supports for the largest number of user groups
	 * \else
	 * 超出设备支持最大用户组数目
	 * \endif
	 */
	public static final int NET_GROUP_OVERSUPPORTNUM= (0x80000000|358);

	/**
	 * \if ENGLISH_LANG
	 * Beyond the device supports for the largest number of users
	 * \else
	 * 超出设备支持最大用户数目
	 * \endif
	 */
	public static final int NET_USER_OVERSUPPORTNUM= (0x80000000|359);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get SIP configuration
	 * \else
	 * 获取SIP配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GET_SIP_CFG= (0x80000000|368);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set SIP configuration
	 * \else
	 * 设置SIP配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SET_SIP_CFG= (0x80000000|369);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get SIP capability
	 * \else
	 * 获取SIP能力失败
	 * \endif
	 */
	public static final int NET_ERROR_GET_SIP_ABILITY= (0x80000000|370);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get "WIFI ap' configuration
	 * \else
	 * 获取WIFI ap配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GET_WIFI_AP_CFG= (0x80000000|371);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set "WIFI ap" configuration
	 * \else
	 * 设置WIFI ap配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SET_WIFI_AP_CFG= (0x80000000|372);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get decode policy
	 * \else
	 * 获取解码策略配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GET_DECODE_POLICY= (0x80000000|373);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set decode policy
	 * \else
	 * 设置解码策略配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SET_DECODE_POLICY= (0x80000000|374);

	/**
	 * \if ENGLISH_LANG
	 * Refuse talk
	 * \else
	 * 拒绝对讲
	 * \endif
	 */
	public static final int NET_ERROR_TALK_REJECT= (0x80000000|375);

	/**
	 * \if ENGLISH_LANG
	 * Talk has opened by other client
	 * \else
	 * 对讲被其他客户端打开
	 * \endif
	 */
	public static final int NET_ERROR_TALK_OPENED= (0x80000000|376);

	/**
	 * \if ENGLISH_LANG
	 * Resource conflict
	 * \else
	 * 资源冲突
	 * \endif
	 */
	public static final int NET_ERROR_TALK_RESOURCE_CONFLICIT= (0x80000000|377);

	/**
	 * \if ENGLISH_LANG
	 * Unsupported encode type
	 * \else
	 * 不支持的语音编码格式
	 * \endif
	 */
	public static final int NET_ERROR_TALK_UNSUPPORTED_ENCODE= (0x80000000|378);

	/**
	 * \if ENGLISH_LANG
	 * No right
	 * \else
	 * 无权限
	 * \endif
	 */
	public static final int NET_ERROR_TALK_RIGHTLESS= (0x80000000|379);

	/**
	 * \if ENGLISH_LANG
	 * Request failed
	 * \else
	 * 请求对讲失败
	 * \endif
	 */
	public static final int NET_ERROR_TALK_FAILED= (0x80000000|380);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get device relative config
	 * \else
	 * 获取机器相关配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GET_MACHINE_CFG= (0x80000000|381);

	/**
	 * \if ENGLISH_LANG
	 * Failed to set device relative config
	 * \else
	 * 设置机器相关配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SET_MACHINE_CFG= (0x80000000|382);

	/**
	 * \if ENGLISH_LANG
	 * Get data failed
	 * \else
	 * 设备无法获取当前请求数据
	 * \endif
	 */
	public static final int NET_ERROR_GET_DATA_FAILED= (0x80000000|383);

	/**
	 * \if ENGLISH_LANG
	 * MAC validate failed
	 * \else
	 * MAC地址验证失败
	 * \endif
	 */
	public static final int NET_ERROR_MAC_VALIDATE_FAILED= (0x80000000|384);

	/**
	 * \if ENGLISH_LANG
	 * Failed to get server instance
	 * \else
	 * 获取服务器实例失败
	 * \endif
	 */
	public static final int NET_ERROR_GET_INSTANCE= (0x80000000|385);

	/**
	 * \if ENGLISH_LANG
	 * Generated json string is error
	 * \else
	 * 生成的jason字符串错误
	 * \endif
	 */
	public static final int NET_ERROR_JSON_REQUEST= (0x80000000|386);

	/**
	 * \if ENGLISH_LANG
	 * The responding json string is error
	 * \else
	 * 响应的jason字符串错误
	 * \endif
	 */
	public static final int NET_ERROR_JSON_RESPONSE= (0x80000000|387);

	/**
	 * \if ENGLISH_LANG
	 * The protocol version is lower than current version
	 * \else
	 * 协议版本低于当前使用的版本
	 * \endif
	 */
	public static final int NET_ERROR_VERSION_HIGHER= (0x80000000|388);

	/**
	 * \if ENGLISH_LANG
	 * Hotspare disk operation failed. The capacity is low
	 * \else
	 * 热备操作失败, 容量不足
	 * \endif
	 */
	public static final int NET_SPARE_NO_CAPACITY= (0x80000000|389);

	/**
	 * \if ENGLISH_LANG
	 * Display source is used by other output
	 * \else
	 * 显示源被其他输出占用
	 * \endif
	 */
	public static final int NET_ERROR_SOURCE_IN_USE= (0x80000000|390);

	/**
	 * \if ENGLISH_LANG
	 * Advanced users grab low-level user resource
	 * \else
	 * 高级用户抢占低级用户资源
	 * \endif
	 */
	public static final int NET_ERROR_REAVE= (0x80000000|391);

	/**
	 * \if ENGLISH_LANG
	 * Net forbid
	 * \else
	 * 禁止入网
	 * \endif
	 */
	public static final int NET_ERROR_NETFORBID= (0x80000000|392);

	/**
	 * \if ENGLISH_LANG
	 * Get MAC filter configuration error
	 * \else
	 * 获取MAC过滤配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_MACFILTER= (0x80000000|393);

	/**
	 * \if ENGLISH_LANG
	 * Set MAC filter configuration error
	 * \else
	 * 设置MAC过滤配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_MACFILTER= (0x80000000|394);

	/**
	 * \if ENGLISH_LANG
	 * Get IP/MAC filter configuration error
	 * \else
	 *  获取IP/MAC过滤配置失败
	 * \endif
	 */
	public static final int NET_ERROR_GETCFG_IPMACFILTER= (0x80000000|395);

	/**
	 * \if ENGLISH_LANG
	 * Set IP/MAC filter configuration error
	 * \else
	 * 设置IP/MAC过滤配置失败
	 * \endif
	 */
	public static final int NET_ERROR_SETCFG_IPMACFILTER= (0x80000000|396);

	/**
	 * \if ENGLISH_LANG
	 * Operation over time
	 * \else
	 * 当前操作超时
	 * \endif
	 */
	public static final int NET_ERROR_OPERATION_OVERTIME= (0x80000000|397);

	/**
	 * \if ENGLISH_LANG
	 * Senior validation failure
	 * \else
	 * 高级校验失败
	 * \endif
	 */
	public static final int NET_ERROR_SENIOR_VALIDATE_FAILED= (0x80000000|398);

	/**
	 * \if ENGLISH_LANG
	 * Device ID is not exist
	 * \else
	 * 设备ID不存在
	 * \endif
	 */
	public static final int NET_ERROR_DEVICE_ID_NOT_EXIST= (0x80000000|399);

	/**
	 * \if ENGLISH_LANG
	 * Unsupport operation
	 * \else
	 * 不支持当前操作
	 * \endif
	 */
	public static final int NET_ERROR_UNSUPPORTED= (0x80000000|400);

	/**
	 * \if ENGLISH_LANG
	 * Proxy dll load error
	 * \else
	 * 代理库加载失败
	 * \endif
	 */
	public static final int NET_ERROR_PROXY_DLLLOAD= (0x80000000|401);

	/**
	 * \if ENGLISH_LANG
	 * Proxy user parameter is not legal
	 * \else
	 * 代理用户参数不合法
	 * \endif
	 */
	public static final int NET_ERROR_PROXY_ILLEGAL_PARAM= (0x80000000|402);

	/**
	 * \if ENGLISH_LANG
	 * Handle invalid
	 * \else
	 * 代理句柄无效
	 * \endif
	 */
	public static final int NET_ERROR_PROXY_INVALID_HANDLE= (0x80000000|403);

	/**
	 * \if ENGLISH_LANG
	 * Login device error
	 * \else
	 * 代理登入前端设备失败
	 * \endif
	 */
	public static final int NET_ERROR_PROXY_LOGIN_DEVICE_ERROR= (0x80000000|404);

	/**
	 * \if ENGLISH_LANG
	 * Start proxy server error
	 * \else
	 * 启动代理服务失败
	 * \endif
	 */
	public static final int NET_ERROR_PROXY_START_SERVER_ERROR= (0x80000000|405);

	/**
	 * \if ENGLISH_LANG
	 * Request speak failed
	 * \else
	 * 请求喊话失败
	 * \endif
	 */
	public static final int NET_ERROR_SPEAK_FAILED= (0x80000000|406);

	/**
	 * \if ENGLISH_LANG
	 * Unsupport F6
	 * \else
	 * 设备不支持此F6接口调用
	 * \endif
	 */
	public static final int NET_ERROR_NOT_SUPPORT_F6= (0x80000000|407);

	/**
	 * \if ENGLISH_LANG
	 * Disk not ready
	 * \else
	 * 光盘未就绪
	 * \endif
	 */
	public static final int NET_ERROR_CD_UNREADY= (0x80000000|408);

	/**
	 * \if ENGLISH_LANG
	 * Directory inexists
	 * \else
	 * 目录不存在
	 * \endif
	 */
	public static final int NET_ERROR_DIR_NOT_EXIST= (0x80000000|409);

	/**
	 * \if ENGLISH_LANG
	 * Device does not support split mode
	 * \else
	 * 设备不支持的分割模式
	 * \endif
	 */
	public static final int NET_ERROR_UNSUPPORTED_SPLIT_MODE= (0x80000000|410);

	/**
	 * \if ENGLISH_LANG
	 * Open window parameter invalid
	 * \else
	 * 开窗参数不合法
	 * \endif
	 */
	public static final int NET_ERROR_OPEN_WND_PARAM= (0x80000000|411);

	/**
	 * \if ENGLISH_LANG
	 * Open window quantity over limit
	 * \else
	 * 开窗数量超过限制
	 * \endif
	 */
	public static final int NET_ERROR_LIMITED_WND_COUNT= (0x80000000|412);

	/**
	 * \if ENGLISH_LANG
	 * Request command and current mode not matched
	 * \else
	 * 请求命令与当前模式不匹配
	 * \endif
	 */
	public static final int NET_ERROR_UNMATCHED_REQUEST= (0x80000000|413);

	/**
	 * \if ENGLISH_LANG
	 * Render base enable HD image internal adjustment strategy error
	 * \else
	 * Render库启用高清图像内部调整策略出错
	 * \endif
	 */
	public static final int NET_RENDER_ENABLELARGEPICADJUSTMENT_ERROR = (0x80000000|414);

	/**
	 * \if ENGLISH_LANG
	 * Device fasiled to upgrade
	 * \else
	 * 设备升级失败
	 * \endif
	 */
	public static final int NET_ERROR_UPGRADE_FAILED                = (0x80000000|415);

	/**
	 * \if ENGLISH_LANG
	 * Target device not found
	 * \else
	 * 找不到目标设备
	 * \endif
	 */
	public static final int NET_ERROR_NO_TARGET_DEVICE              = (0x80000000|416);

	/**
	 * \if ENGLISH_LANG
	 * Target device not found
	 * \else
	 * 找不到目标设备
	 * \endif
	 */
	public static final int NET_ERROR_NO_VERIFY_DEVICE              = (0x80000000|417);

	/**
	 * \if ENGLISH_LANG
	 * No cascading right
	 * \else
	 * 无级联权限
	 * \endif
	 */
	public static final int NET_ERROR_CASCADE_RIGHTLESS             = (0x80000000|418);

	/**
	 * \if ENGLISH_LANG
	 * Low priority
	 * \else
	 * 低优先级
	 * \endif
	 */
	public static final int NET_ERROR_LOW_PRIORITY                  = (0x80000000|419);

	/**
	 * \if ENGLISH_LANG
	 * Remote device request time out
	 * \else
	 * 远程设备请求超时
	 * \endif
	 */
	public static final int NET_ERROR_REMOTE_REQUEST_TIMEOUT        = (0x80000000|420);

	/**
	 * \if ENGLISH_LANG
	 * Input source over max channel limit
	 * \else
	 * 输入源超出最大路数限制
	 * \endif
	 */
	public static final int NET_ERROR_LIMITED_INPUT_SOURCE          = (0x80000000|421);

	/**
	 * \if ENGLISH_LANG
	 * Failed to access folder
	 * \else
	 * 访问文件失败
	 * \endif
	 */
	public static final int NET_ERROR_VISITE_FILE                   = (0x80000000|510);

	/**
	 * \if ENGLISH_LANG
	 * Device is busy
	 * \else
	 * 设备忙
	 * \endif
	 */
	public static final int NET_ERROR_DEVICE_STATUS_BUSY            = (0x80000000|511);

	/**
	 * \if ENGLISH_LANG
	 * Fail to change the password
	 * \else
	 * 修改密码无权限
	 * \endif
	 */
	public static final int NET_USER_PWD_NOT_AUTHORIZED             = (0x80000000|512);

	/**
	 * \if ENGLISH_LANG
	 * Password strength is not enough
	 * \else
	 * 密码强度不够
	 * \endif
	 */
	public static final int NET_USER_PWD_NOT_STRONG                 = (0x80000000|513);

	/**
	 * \if ENGLISH_LANG
	 * No corresponding setup
	 * \else
	 * 没有对应的配置
	 * \endif
	 */
	public static final int NET_ERROR_NO_SUCH_CONFIG                = (0x80000000|514);

	/**
	 * \if ENGLISH_LANG
	 * Failed to record audio
	 * \else
	 * 录音失败
	 * \endif
	 */
	public static final int NET_ERROR_AUDIO_RECORD_FAILED          = (0x80000000|515);

	/**
	 * \if ENGLISH_LANG
	 * Failed to send out data
	 * \else
	 * 数据发送失败
	 * \endif
	 */
	public static final int NET_ERROR_SEND_DATA_FAILED              = (0x80000000|516);

	/**
	 * \if ENGLISH_LANG
	 * Abandoned port
	 * \else
	 * 废弃接口
	 * \endif
	 */
	public static final int NET_ERROR_OBSOLESCENT_INTERFACE        = (0x80000000|517);

	/**
	 * \if ENGLISH_LANG
	 * Internal buffer is not sufficient
	 * \else
	 * 内部缓冲不足
	 * \endif
	 */
	public static final int NET_ERROR_INSUFFICIENT_INTERAL_BUF     = (0x80000000|518);

	/**
	 * \if ENGLISH_LANG
	 * verify password when changing device IP
	 * \else
	 * 修改设备ip时,需要校验密码
	 * \endif
	 */
	public static final int NET_ERROR_NEED_ENCRYPTION_PASSWORD     = (0x80000000|519);

	/**
	 * \if ENGLISH_LANG
	 * deivce not support the record
	 * \else
	 * 设备不支持此记录集
	 * \endif
	 */
	public static final int NET_ERROR_NOSUPPORT_RECORD              = (0x80000000|520);

	/**
	 * \if ENGLISH_LANG
	 * Failed to serialize data
	 * \else
	 * 数据序列化错误
	 * \endif
	 */
	public static final int NET_ERROR_SERIALIZE_ERROR               = (0x80000000|1010);

	/**
	 * \if ENGLISH_LANG
	 * Failed to deserialize data
	 * \else
	 * 数据反序列化错误
	 * \endif
	 */
	public static final int NET_ERROR_DESERIALIZE_ERROR             = (0x80000000|1011);

	/**
	 * \if ENGLISH_LANG
	 * the wireless id is already existed
	 * \else
	 * 该无线ID已存在
	 * \endif
	 */
	public static final int NET_ERROR_LOWRATEWPAN_ID_EXISTED       = (0x80000000|1012);

	/**
	 * \if ENGLISH_LANG
	 * the wireless id limited
	 * \else
	 * 无线ID数量已超限
	 * \endif
	 */
	public static final int NET_ERROR_LOWRATEWPAN_ID_LIMIT         = (0x80000000|1013);

	/**
	 * \if ENGLISH_LANG
	 * add the wireless id abnormaly
	 * \else
	 * 无线异常添加
	 * \endif
	 */
	public static final int NET_ERROR_LOWRATEWPAN_ID_ABNORMAL      = (0x80000000|1014);

	/**
	 * \if ENGLISH_LANG
	 * encrypt data fail
	 * \else
	 * 加密数据失败
	 * \endif
	 */
	public static final int NET_ERROR_ENCRYPT						  = (0x80000000|1015);

	/**
	 * \if ENGLISH_LANG
	 * new password illegal
	 * \else
	 * 新密码不合规范
	 * \endif
	 */
	public static final int NET_ERROR_PWD_ILLEGAL					  = (0x80000000|1016);

	/**
	 * \if ENGLISH_LANG
	 * device is already init
	 * \else
	 * 设备已经初始化
	 * \endif
	 */
	public static final int NET_ERROR_DEVICE_ALREADY_INIT		  = (0x80000000|1017);

	/**
	 * \if ENGLISH_LANG
	 * security code check out fail
	 * \else
	 * 安全码错误
	 * \endif
	 */
	public static final int NET_ERROR_SECURITY_CODE				  = (0x80000000|1018);

	/**
	 * \if ENGLISH_LANG
	 * security code out of time
	 * \else
	 * 安全码超出有效期
	 * \endif
	 */
	public static final int NET_ERROR_SECURITY_CODE_TIMEOUT		  = (0x80000000|1019);

	/**
	 * \if ENGLISH_LANG
	 * get passwd specification fail
	 * \else
	 * 获取密码规范失败
	 * \endif
	 */
	public static final int NET_ERROR_GET_PWD_SPECI				  = (0x80000000|1020);

	/**
	 * \if ENGLISH_LANG
	 * no authority of operation
	 * \else
	 * 无权限进行该操作
	 * \endif
	 */
	public static final int NET_ERROR_NO_AUTHORITY_OF_OPERATION	  = (0x80000000|1021);

	/**
	 * \if ENGLISH_LANG
	 * decrypt data fail
	 * \else
	 * 解密数据失败
	 * \endif
	 */
	public static final int NET_ERROR_DECRYPT						  = (0x80000000|1022);

	/**
	 * \if ENGLISH_LANG
	 * 2D code check out fail
	 * \else
	 * 2D code校验失败
	 * \endif
	 */
	public static final int NET_ERROR_2D_CODE						  = (0x80000000|1023);

	/**
	 * \if ENGLISH_LANG
	 * invalid request
	 * \else
	 * 非法的RPC请求
	 * \endif
	 */
	public static final int NET_ERROR_INVALID_REQUEST			      = (0x80000000|1024);

	/**
	 * \if ENGLISH_LANG
	 * check request security failed, using local GUI reset password
	 * \else
	 * 校验请求安全码失败,可使用本地GUI方式重置密码
	 * \endif
	 */
	public static final int NET_ERROR_SECURITY_ERROR_SUPPORT_GUI     = (0x80000000|1104);

	/**
	 * \if ENGLISH_LANG
	 * check request security failed, using private APP or configtool reset password
	 * \else
	 * 校验请求安全码失败,可使用私有渠道APP、configtool工具重置密码
	 * \endif
	 */
	public static final int NET_ERROR_SECURITY_ERROR_SUPPORT_MULT     = (0x80000000|1105);

	/**
	 * \if ENGLISH_LANG
	 * check request security failed, using Web reset password
	 * \else
	 * 校验请求安全码失败,可登陆Web页面重置密码
	 * \endif
	 */
	public static final int NET_ERROR_SECURITY_ERROR_SUPPORT_UNIQUE     = (0x80000000|1106);

	/**
	 * \if ENGLISH_LANG
	 * streamconvertor defect
	 * \else
	 * 转码库缺失
	 * \endif
	 */
	public static final int NET_ERROR_STREAMCONVERTOR_DEFECT		    = (0x80000000|1107);

	/**
	 * \if ENGLISH_LANG
	 * generate safe code failed
	 * \else
	 * 调用私有加密库产生安全码失败
	 * \endif
	 */
	public static final int NET_ERROR_SECURITY_GENERATE_SAFE_CODE           = (0x80000000|1108);

	/**
	 * \if ENGLISH_LANG
	 * get contact failed
	 * \else
	 * 获取联系方式失败
	 * \endif
	 */
	public static final int NET_ERROR_SECURITY_GET_CONTACT             		  = (0x80000000|1109);

	/**
	 * \if ENGLISH_LANG
	 * get QR code information failed of reset passwd
	 * \else
	 * 获取重置密码的二维码信息失败
	 * \endif
	 */
	public static final int NET_ERROR_SECURITY_GET_QRCODE                   = (0x80000000|1110);

	/**
	 * \if ENGLISH_LANG
	 * device uninitialized, can't reset
	 * \else
	 * 设备未初始化,无法重置
	 * \endif
	 */
	public static final int NET_ERROR_SECURITY_CANNOT_RESET          		 = (0x80000000|1111);

	/**
	 * \if ENGLISH_LANG
	 * unsupported contact mode
	 * \else
	 * 不支持设置该种联系方式,如只支持设置手机号，却请求设置邮箱
	 * \endif
	 */
	public static final int NET_ERROR_SECURITY_NOT_SUPPORT_CONTACT_MODE      = (0x80000000|1112);

	/**
	 * \if ENGLISH_LANG
	 * server response time out
	 * \else
	 * 对端响应超时
	 * \endif
	 */
	public static final int NET_ERROR_SECURITY_RESPONSE_TIMEOUT      		   = (0x80000000|1113);

	/**
	 * \if ENGLISH_LANG
	 * had check AuthCode too much, forbid check
	 * \else
	 * 尝试校验AuthCode次数过多，禁止校验
	 * \endif
	 */
	public static final int NET_ERROR_SECURITY_AUTHCODE_FORBIDDEN    		 = (0x80000000|1114);


	/**
	 * \if ENGLISH_LANG
	 * (virtual transcode)login remote device failed
	 * \else
	 * (虚拟转码)登陆远程设备失败
	 * \endif
	 */
	public static final int NET_ERROR_TRANCODE_LOGIN_REMOTE_DEV    		 = (0x80000000|1115);

	/**
	 * \if ENGLISH_LANG
	 *  (virtual transcode)no free virtual channel
	 * \else
	 * (虚拟转码)没有可用的通道资源
	 * \endif
	 */
	public static final int NET_ERROR_TRANCODE_NOFREE_CHANNEL    		 = (0x80000000|1116);

	/**
	 * \if ENGLISH_LANG
	 *  VK info decrypt failed
	 * \else
	 * VK信息解密失败
	 * \endif
	 */
	public static final int NET_ERROR_VK_INFO_DECRYPT_FAILED    		 = (0x80000000|1117);

	/**
	 * \if ENGLISH_LANG
	 *  VK info deserial failed
	 * \else
	 * VK信息解析失败
	 * \endif
	 */
	public static final int NET_ERROR_VK_INFO_DESERIALIZE_FAILED    		 = (0x80000000|1118);

	/**
	 * \if ENGLISH_LANG
	 *  SDK GDPR ability not enable
	 * \else
	 * SDK GDPR功能未使能
	 * \endif
	 */
	public static final int NET_ERROR_GDPR_ABILITY_NOT_ENABLE    		 = (0x80000000|1119);

	/**
	 * \if ENGLISH_LANG
	 *  access control fast check:no authority
	 * \else
	 * 门禁快速复核:无权限
	 * \endif
	 */
	public static final int NET_ERROR_FAST_CHECK_NO_AUTH    		 = (0x80000000|1120);

	/**
	 * \if ENGLISH_LANG
	 *  access control fast check:file does not exist
	 * \else
	 * 门禁快速复核:文件不存在
	 * \endif
	 */
	public static final int NET_ERROR_FAST_CHECK_NO_FILE    		 = (0x80000000|1121);

	/**
	 * \if ENGLISH_LANG
	 *  access control fast check:fail to prepare file
	 * \else
	 * 门禁快速复核:文件准备失败
	 * \endif
	 */
	public static final int NET_ERROR_FAST_CHECK_FILE_FAIL    		 = (0x80000000|1122);

	/**
	 * \if ENGLISH_LANG
	 *  access control fast check:system is busy
	 * \else
	 * 门禁快速复核:系统忙
	 * \endif
	 */
	public static final int NET_ERROR_FAST_CHECK_BUSY    		 = (0x80000000|1123);

	/**
	 * \if ENGLISH_LANG
	 *  access control fast check:no password, and import is not allowed
	 * \else
	 * 门禁快速复核:未定义密码, 不允许导出
	 * \endif
	 */
	public static final int NET_ERROR_FAST_CHECK_NO_PASSWORD    		 = (0x80000000|1124);

	/**
	 * \if ENGLISH_LANG
	 *  access control fast import:fail to send access control data
	 * \else
	 * 门禁快速导入:发送门禁数据失败
	 * \endif
	 */
	public static final int NET_ERROR_IMPORT_ACCESS_SEND_FAILD    		 = (0x80000000|1125);

	/**
	 * \if ENGLISH_LANG
	 *  access control fast import:system is busy
	 * \else
	 * 门禁快速导入:系统忙, 已经有导入任务
	 * \endif
	 */
	public static final int NET_ERROR_IMPORT_ACCESS_BUSY    		 = (0x80000000|1126);

	/**
	 * \if ENGLISH_LANG
	 *  access control fast import:packet data check failed
	 * \else
	 * 门禁快速导入:数据包检验失败
	 * \endif
	 */
	public static final int NET_ERROR_IMPORT_ACCESS_DATAERROR    		 = (0x80000000|1127);

	/**
	 * \if ENGLISH_LANG
	 *  access control fast import:illegal packet data
	 * \else
	 * 门禁快速导入:数据包非法
	 * \endif
	 */
	public static final int NET_ERROR_IMPORT_ACCESS_DATAINVALID    		 = (0x80000000|1128);

	/**
	 * \if ENGLISH_LANG
	 *  access control fast import:fail to synchronization
	 * \else
	 * 门禁快速导入:同步失败,数据库无法生成
	 * \endif
	 */
	public static final int NET_ERROR_IMPORT_ACCESS_SYNC_FALID    		 = (0x80000000|1129);

	/**
	 * \if ENGLISH_LANG
	 *  access control fast import:data base is full
	 * \else
	 * 门禁快速导入:数据库已满, 无法导入
	 * \endif
	 */
	public static final int NET_ERROR_IMPORT_ACCESS_DBFULL    		 = (0x80000000|1130);

	/**
	 * \if ENGLISH_LANG
	 *  access control fast import:SD is full
	 * \else
	 * 门禁快速导入:存储空间已满, 无法导入
	 * \endif
	 */
	public static final int NET_ERROR_IMPORT_ACCESS_SDFULL    		 = (0x80000000|1131);

	/**
	 * \if ENGLISH_LANG
	 *  access control fast import:password error
	 * \else
	 * 门禁快速导入:导入压缩包密码不对
	 * \endif
	 */
	public static final int NET_ERROR_IMPORT_ACCESS_CIPHER_ERROR    		 = (0x80000000|1132);

	/**
	 * \if ENGLISH_LANG
	 *  invalid param
	 * \else
	 * 参数无效
	 * \endif
	 */
	public static final int NET_ERROR_INVALID_PARAM    		 = (0x80000000|1133);

	/**
	 * \if ENGLISH_LANG
	 *  invalid password
	 * \else
	 * 密码无效
	 * \endif
	 */
	public static final int NET_ERROR_INVALID_PASSWORD    		 = (0x80000000|1134);

	/**
	 * \if ENGLISH_LANG
	 *  invalid finger print
	 * \else
	 * 信息无效
	 * \endif
	 */
	public static final int NET_ERROR_INVALID_FINGERPRINT    		 = (0x80000000|1135);

	/**
	 * \if ENGLISH_LANG
	 *  invalid face
	 * \else
	 * 目标无效
	 * \endif
	 */
	public static final int NET_ERROR_INVALID_FACE    		 = (0x80000000|1136);

	/**
	 * \if ENGLISH_LANG
	 *  invalid card
	 * \else
	 * 卡无效
	 * \endif
	 */
	public static final int NET_ERROR_INVALID_CARD    		 = (0x80000000|1137);

	/**
	 * \if ENGLISH_LANG
	 *  invalid user
	 * \else
	 * 用户无效
	 * \endif
	 */
	public static final int NET_ERROR_INVALID_USER    		 = (0x80000000|1138);

	/**
	 * \if ENGLISH_LANG
	 *  device get sub service fail
	 * \else
	 * 能力集子服务获取失败
	 * \endif
	 */
	public static final int NET_ERROR_GET_SUBSERVICE    		 = (0x80000000|1139);

	/**
	 * \if ENGLISH_LANG
	 *  device get method fail
	 * \else
	 * 获取组件的方法集失败
	 * \endif
	 */
	public static final int NET_ERROR_GET_METHOD    		 = (0x80000000|1140);

	/**
	 * \if ENGLISH_LANG
	 *  device get sub caps fail
	 * \else
	 * 获取资源实体能力集失败
	 * \endif
	 */
	public static final int NET_ERROR_GET_SUBCAPS    		 = (0x80000000|1141);

	/**
	 * \if ENGLISH_LANG
	 *  up to insert limit
	 * \else
	 * 已达插入上限
	 * \endif
	 */
	public static final int NET_ERROR_UPTO_INSERT_LIMIT    		 = (0x80000000|1142);


	/**
	 * \if ENGLISH_LANG
	 *  up tp max insert rate
	 * \else
	 * 已达最大插入速度
	 * \endif
	 */
	public static final int NET_ERROR_UPTO_MAX_INSERT_RATE    		 = (0x80000000|1143);

	/**
	 * \if ENGLISH_LANG
	 *  erase finger print data fail
	 * \else
	 * 清除信息数据失败
	 * \endif
	 */
	public static final int NET_ERROR_ERASE_FINGERPRINT    		 = (0x80000000|1144);

	/**
	 * \if ENGLISH_LANG
	 *  erase face data fail
	 * \else
	 * 清除目标数据失败
	 * \endif
	 */
	public static final int NET_ERROR_ERASE_FACE    		 = (0x80000000|1145);

	/**
	 * \if ENGLISH_LANG
	 *  erase card data  fail
	 * \else
	 * 清除卡数据失败
	 * \endif
	 */
	public static final int NET_ERROR_ERASE_CARD    		 = (0x80000000|1146);

	/**
	 * \if ENGLISH_LANG
	 *  no record
	 * \else
	 * 没有记录
	 * \endif
	 */
	public static final int NET_ERROR_NO_RECORD    		 = (0x80000000|1147);

	/**
	 * \if ENGLISH_LANG
	 *  no more records
	 * \else
	 * 查找到最后，没有更多记录
	 * \endif
	 */
	public static final int NET_ERROR_NOMORE_RECORDS    		 = (0x80000000|1148);

	/**
	 * \if ENGLISH_LANG
	 *  record already exist
	 * \else
	 * 下发卡或信息时，数据重复
	 * \endif
	 */
	public static final int NET_ERROR_RECORD_ALREADY_EXISTS    		 = (0x80000000|1149);

	/**
	 * \if ENGLISH_LANG
	 *  exceed max finger print per user
	 * \else
	 * 超过个人最大信息记录数
	 * \endif
	 */
	public static final int NET_ERROR_EXCEED_MAX_FINGERPRINT_PERUSER    		 = (0x80000000|1150);

	/**
	 * \if ENGLISH_LANG
	 *  exceed max card per user
	 * \else
	 * 超过个人最大卡片记录数
	 * \endif
	 */
	public static final int NET_ERROR_EXCEED_MAX_CARD_PERUSER    		 = (0x80000000|1151);


	/**
	 * \if ENGLISH_LANG
	 *  exceed administrator limit
	 * \else
	 * 超过门禁管理员个数限制
	 * \endif
	 */
	public static final int NET_ERROR_EXCEED_ADMINISTRATOR_LIMIT    		 = (0x80000000|1152);

	/**
	 * \if ENGLISH_LANG
	 *  device not support high level security login
	 * \else
	 * 设备不支持高安全等级登录
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_DEVICE_NOT_SUPPORT_HIGHLEVEL_SECURITY_LOGIN    		 = (0x80000000|1153);

	/**
	 * \if ENGLISH_LANG
	 *  device only support high level security login
	 * \else
	 * 设备只支持高安全等级登录
	 * \endif
	 */
	public static final int NET_LOGIN_ERROR_DEVICE_ONLY_SUPPORT_HIGHLEVEL_SECURITY_LOGIN    		 = (0x80000000|1154);


	/**
	 * \if ENGLISH_LANG
	 *  current video channel is offline, play failed
	 * \else
	 * 表示此视频通道处于离线，拉流失败
	 * \endif
	 */
	public static final int NET_ERROR_VIDEO_CHANNEL_OFFLINE    		 = (0x80000000|1155);

	/**
	 * \if ENGLISH_LANG
	 * invalid channel
	 * \else
	 * 错误的通道号
	 * \endif
	 */
	public static final int ERR_INTERNAL_INVALID_CHANNEL              = 0x90001002;

	/**
	 * \if ENGLISH_LANG
	 * reopen channel failed
	 * \else
	 * 打开重复通道
	 * \endif
	 */
	public static final int ERR_INTERNAL_REOPEN_CHANNEL               = 0x90001003;

	/**
	 * \if ENGLISH_LANG
	 * create socket failed
	 * \else
	 * 创建socket失败
	 * \endif
	 */
	public static final int ERR_INTERNAL_CREATE_SOCKET               = 0x90002003;

	/**
	 * \if ENGLISH_LANG
	 * send data failed
	 * \else
	 * 发送消息失败
	 * \endif
	 */
	public static final int ERR_INTERNAL_SEND_DATA                   = 0x90002008;

	////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * \if ENGLISH_LANG
	 * the number of tour combination
	 * \else
	 * 轮巡组合个数
	 * \endif
	 */
	public static final int  DEC_COMBIN_NUM 	= 32;
	/**
	 * \if ENGLISH_LANG
	 * length of name
	 * \else
	 * 名称长度
	 * \endif
	 */
	public static final int  NAME_MAX_LEN  = 16;

	public static final int DECODER_OUT_SLOTS_MAX_NUM = 16;

	public static final int DECODER_IN_SLOTS_MAX_NUM = 16;

	public static final int MAX_ALARM_DECODER_NUM = 16;

	public static final int SDK_MAX_RAID_NUM = 16;

	public static final int SDK_MAX_USER_DEFINE_INFO = 1024;

	public static final int ALARM_MAX_NAME = 64;

	public static final int  MAX_CHANNEL_COUNT = 16;

	/**
	 * \if ENGLISH_LANG
	 * Max channel number 256
	 * \else
	 * 最大通道数256
	 * \endif
	 */
	public static final int  MAX_VIDEO_CHANNEL_NUM = 256;

	/**
	 * \if ENGLISH_LANG
	 * Max channel name length
	 * \else
	 * 最大通道名称长度
	 * \endif
	 */
	public static final int  MAX_CHANNELNAME_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max bit stream quantity
	 * \else
	 * 最大码流个数
	 * \endif
	 */
	public static final int  MAX_VIDEOSTREAM_NUM = 4;

	/**
	 * \if ENGLISH_LANG
	 * Max masked area quantity
	 * \else
	 * 最大遮挡区域个数
	 * \endif
	 */
	public static final int  MAX_VIDEO_COVER_NUM = 16;

	/**
	 * \if ENGLISH_LANG
	 * Day in a week
	 * \else
	 * 一周的天数
	 * \endif
	 */
	public static final int  WEEK_DAY_NUM = 7;

	/**
	 * \if ENGLISH_LANG
	 * Record period quantity
	 * \else
	 * 录像时间段个数
	 * \endif
	 */
	public static final int  MAX_REC_TSECT = 6;

	/**
	 * \if ENGLISH_LANG
	 * Record time extension quantity
	 * \else
	 * 录像时间段扩展个数
	 * \endif
	 */
	public static final int  MAX_REC_TSECT_EX = 10;

	/**
	 * \if ENGLISH_LANG
	 * Number watermark data max langth
	 * \else
	 * 数字水印数据最大长度
	 * \endif
	 */
	public static final int  MAX_WATERMARK_LEN = 4096;

	/**
	 * \if ENGLISH_LANG
	 * Motion detect rows
	 * \else
	 * 动态检测区域的行数
	 * \endif
	 */
	public static final int  MAX_MOTION_ROW = 32;

	/**
	 * \if ENGLISH_LANG
	 * Motion detect columns
	 * \else
	 * 动态检测区域的列数
	 * \endif
	 */
	public static final int  MAX_MOTION_COL = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max supported resolution quantity
	 * \else
	 * 最大支持的分辨率个数
	 * \endif
	 */
	public static final int  MAX_IMAGESIZE_NUM = 256;

	/**
	 * \if ENGLISH_LANG
	 * Max supported frame quantity
	 * \else
	 * 最大支持的帧率个数
	 * \endif
	 */
	public static final int  MAX_FPS_NUM = 1024;

	/**
	 * \if ENGLISH_LANG
	 * Max supported quality quantity
	 * \else
	 * 最大支持的画质个数
	 * \endif
	 */
	public static final int  MAX_QUALITY_NUM = 32;

	public static final int  MAX_QUALITY_REGION_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * Max address length
	 * \else
	 * 最大的地址长度
	 * \endif
	 */
	public static final int  MAX_ADDRESS_LEN= 256;

	/**
	 * \if ENGLISH_LANG
	 * Max username length
	 * \else
	 * 最大用户名长度
	 * \endif
	 */
	public static final int  MAX_USERNAME_LEN= 64;

	/**
	 * \if ENGLISH_LANG
	 * Max username length
	 * \else
	 * 最大用户名长度
	 * \endif
	 */
	public static final int   MAX_USER_NAME_LEN	= 128;

	/**
	 * \if ENGLISH_LANG
	 * Max group length
	 * \else
	 * 最大的组名长度
	 * \endif
	 */
	public static final int   MAX_GROUP_LEN	= 128;

	/**
	 * \if ENGLISH_LANG
	 * Max illegal ip length
	 * \else
	 * 最大的非法登陆IP长度
	 * \endif
	 */
	public static final int   MAX_ILLEGAL_LOGIN_IP_LEN	= 40;

	/**
	 * \if ENGLISH_LANG
	 * Max password length
	 * \else
	 * 最大密码长度
	 * \endif
	 */
	public static final int  MAX_PASSWORD_LEN= 64;

	/**
	 * \if ENGLISH_LANG
	 * Max password length
	 * \else
	 * 最大密码长度
	 * \endif
	 */
	public static final int   MAX_PWD_LEN = 128;

	/**
	 * \if ENGLISH_LANG
	 * Max phone number length
	 * \else
	 * 最大手机号长度
	 * \endif
	 */
	public static final int   MAX_CELL_PHONE_NUMBER_LEN	= 32;

	/**
	 * \if ENGLISH_LANG
	 * Max mail length
	 * \else
	 * 预留邮箱最大长度
	 * \endif
	 */
	public static final int   MAX_MAIL_LEN				= 64;

	/**
	 * \if ENGLISH_LANG
	 * platform send to mobile phone/max length of security code in mail
	 * \else
	 * 平台发送到预留手机/邮箱中安全码最大长度
	 * \endif
	 */
	public static final int   MAX_SECURITY_CODE_LEN	    = 16;

	/**
	 * \if ENGLISH_LANG
	 * Folder name string length
	 * \else
	 * 文件夹名字字符串长度
	 * \endif
	 */
	public static final int  MAX_DIRECTORY_LEN = 256;

	/**
	 * \if ENGLISH_LANG
	 * Net storage period quantity
	 * \else
	 * 网络存储时间段个数
	 * \endif
	 */
	public static final int  MAX_NAS_TIME_SECTION = 2;

	/**
	 * \if ENGLISH_LANG
	 * General name string length
	 * \else
	 * 通用名字字符串长度
	 * \endif
	 */
	public static final int  MAX_NAME_LEN = 128;

	/**
	 * \if ENGLISH_LANG
	 * Max scene numbers of the scene list
	 * \else
	 * 场景列表中最多支持的场景个数
	 * \endif
	 */
	public static final int	MAX_SCENE_TYPE_LIST_SIZE = 8;

	/**
	 * \if ENGLISH_LANG
	 * Decoder protocol list limit
	 * \else
	 * 解码器协议列表个数上限
	 * \endif
	 */
	public static final int  MAX_DECPRO_LIST_SIZE = 100;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported scene type limit
	 * \else
	 * 视频分析设备支持的场景类型列表个数上限
	 * \endif
	 */
	public static final int  MAX_SCENE_LIST_SIZE = 32;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported detection object type list limit
	 * \else
	 * 视频分析设备支持的检测物体类型列表个数上限
	 * \endif
	 */
	public static final int  MAX_OBJECT_LIST_SIZE = 16;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported rule list quantity limit
	 * \else
	 * 视频分析设备支持的规则列表个数上限
	 * \endif
	 */
	public static final int  MAX_RULE_LIST_SIZE = 128;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis device max detection module number
	 * \else
	 * 视频分析设备最大检测模块个数
	 * \endif
	 */
	public static final int  MAX_ANALYSE_MODULE_NUM = 16;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis device max rule number
	 * \else
	 *  视频分析设备最大规则个数
	 * \endif
	 */
	public static final int  MAX_ANALYSE_RULE_NUM = 32;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis device area top limit
	 * \else
	 * 视频分析设备区域顶点个数上限
	 * \endif
	 */
	public static final int  MAX_POLYGON_NUM = 20;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis device broken line top limit
	 * \else
	 * 视频分析设备折线顶点个数上限
	 * \endif
	 */
	public static final int  MAX_POLYLINE_NUM = 20;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis device vehicle size quantity limit
	 * \else
	 * 视频分析设备车辆大小个数上限
	 * \endif
	 */
	public static final int  MAX_VEHICLE_SIZE_LIST = 4;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis device vehicle type quantity limit
	 * \else
	 * 视频分析设备车辆类型个数上限
	 * \endif
	 */
	public static final int  MAX_VEHICLE_TYPE_LIST = 4;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis device plate type quantity limit
	 * \else
	 * 视频分析设备车牌类型个数上限
	 * \endif
	 */
	public static final int  MAX_PLATE_TYPE_LIST = 32;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis device each channel corresponding lane limit
	 * \else
	 * 视频分析设备每个通道对应车道数上限
	 * \endif
	 */
	public static final int  MAX_LANE_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis device each channel corresponding rule limit
	 * \else
	 * 视频分析设备每个通道对应的标尺数上限
	 * \endif
	 */
	public static final int  MAX_STAFF_NUM = 20;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis device mark area limit
	 * \else
	 * 视频分析设备标定区域的上限
	 * \endif
	 */
	public static final int  MAX_CALIBRATEAREA_NUM = 20;

	/**
	 * \if ENGLISH_LANG
	 * Intelligent analysis detection area need to exclude area quantity limit
	 * \else
	 * 智能分析检测区域中需要排除的区域个数上限
	 * \endif
	 */
	public static final int  MAX_EXCLUDEREGION_NUM = 10;

	/**
	 * \if ENGLISH_LANG
	 * Intelligent analysis calibration frame limit
	 * \else
	 *  智能分析校准框个数上限
	 * \endif
	 */
	public static final int  MAX_CALIBRATEBOX_NUM = 10;

	/**
	 * \if ENGLISH_LANG
	 * Intelligent analysis special detection area limit
	 * \else
	 * 智能分析特殊检测区域上限
	 * \endif
	 */
	public static final int  MAX_SPECIALDETECT_NUM = 10;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported target recognition type list limit
	 * \else
	 * 视频分析设备支持的目标检测类型列表个数上限
	 * \endif
	 */
	public static final int  MAX_HUMANFACE_LIST_SIZE = 8;

	/**
	 * \if ENGLISH_LANG
	 * Server type limit
	 * \else
	 * 服务类型上限
	 * \endif
	 */
	public static final int  MAX_SEVER_NUM = 16;

	/**
	 * \if ENGLISH_LANG
	 * Server name string size
	 * \else
	 * 服务名称字符串大小
	 * \endif
	 */
	public static final int  MAX_SERVER_NAME_LEN = 16;

	/**
	 * \if ENGLISH_LANG
	 * Power quantity limit
	 * \else
	 * 电源个数上限
	 * \endif
	 */
	public static final int  MAX_POWER_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * Fan quantity limit
	 * \else
	 * 风扇个数上限
	 * \endif
	 */
	public static final int  MAX_FUN_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * cpu quantity limit
	 * \else
	 * cpu个数上限
	 * \endif
	 */
	public static final int  MAX_CPU_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * HDD limit
	 * \else
	 * 硬盘上限
	 * \endif
	 */
	public static final int  MAX_HARDDISK_NUM = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max storage cabinet limit
	 * \else
	 * 最大存储柜上限
	 * \endif
	 */
	public static final int  MAX_TANK_NUM = 16;

	/**
	 * \if ENGLISH_LANG
	 * Max channel limit
	 * \else
	 * 最大通道数上限
	 * \endif
	 */
	public static final int  MAX_CHAN_NUM = 256;

	/**
	 * \if ENGLISH_LANG
	 * Max disk array limit
	 * \else
	 * 最大磁盘阵列上限
	 * \endif
	 */
	public static final int  MAX_RAID_NUM = 16;

	/**
	 * \if ENGLISH_LANG
	 * Max device limit
	 * \else
	 * 最大设备上限
	 * \endif
	 */
	public static final int  MAX_DEV_NUM = 16;

	/**
	 * \if ENGLISH_LANG
	 * Max storage pool limit
	 * \else
	 * 最大存储池上限
	 * \endif
	 */
	public static final int  MAX_STORAGEPOOL_NUM = 16;

	/**
	 * \if ENGLISH_LANG
	 * Max storage position limit
	 * \else
	 * 最大存储位置上限
	 * \endif
	 */
	public static final int  MAX_STRORAGEPOS_NUM = 16;

	/**
	 * \if ENGLISH_LANG
	 * Front device limit
	 * \else
	 * 前端设备上限
	 * \endif
	 */
	public static final int	 MAX_VIDEODEV_NUM = 256;

	/**
	 * \if ENGLISH_LANG
	 * Max remote device name length
	 * \else
	 * 最大远程设备名字长度
	 * \endif
	 */
	public static final int  MAX_REMOTEDEVICENAME_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max remote device quantity
	 * \else
	 * 最大远程设备数量
	 * \endif
	 */
	public static final int	 MAX_REMOTE_DEV_NUM = 64;

	/**
	 * \if ENGLISH_LANG
	 * Plate string suggested quantity limit
	 * \else
	 * 车牌字符暗示个数上限
	 * \endif
	 */
	public static final int  MAX_PLATEHINT_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * Traffic light quantity limit
	 * \else
	 * 交通灯个数上限
	 * \endif
	 */
	public static final int  MAX_LIGHT_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * Traffic light group limit
	 * \else
	 * 交通灯组个数上限
	 * \endif
	 */
	public static final int  MAX_LIGHTGROUP_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * Traffic light type limit
	 * \else
	 * 交通灯类型上限
	 * \endif
	 */
	public static final int  MAX_LIGHT_TYPE = 8;

	/**
	 * \if ENGLISH_LANG
	 * Traffic light direction limit
	 * \else
	 * 交通灯指示方向数上限
	 * \endif
	 */
	public static final int  MAX_LIGHT_DIRECTION = 8;

	/**
	 * \if ENGLISH_LANG
	 * Traffic intersection rule trigger mode limit
	 * \else
	 * 交通路口规则触发模式上限
	 * \endif
	 */
	public static final int  MAX_TRIGGERMODE_NUM = 32;

	/**
	 * \if ENGLISH_LANG
	 * ITC violation code length limit
	 * \else
	 * 智能代码长度上限
	 * \endif
	 */
	public static final int  MAX_VIOLATIONCODE = 16;

	/**
	 * \if ENGLISH_LANG
	 * ITC vehicle detector config limit
	 * \else
	 * 智能交通车检器配置上限
	 * \endif
	 */
	public static final int  MAX_DETECTOR = 6;

	/**
	 * \if ENGLISH_LANG
	 * ITC vehicle detector coil config limit
	 * \else
	 * 智能交通车检器线圈配置上限
	 * \endif
	 */
	public static final int  MAX_COILCONFIG = 3;

	/**
	 * \if ENGLISH_LANG
	 * TrafficSnapshot ITC device address
	 * \else
	 * TrafficSnapshot智能交通设备地址
	 * \endif
	 */
	public static final int  MAX_DEVICE_ADDRESS = 256;

	/**
	 * \if ENGLISH_LANG
	 * DepartmentITC device organization
	 * \else
	 * Department智能交通设备所属单位
	 * \endif
	 */
	public static final int  MAX_DEPARTMENT = 256;

	/**
	 * \if ENGLISH_LANG
	 * Road no. has 32 characters of number and letter.
	 * \else
	 * 道路编号	由32个数字和字母构成
	 * \endif
	 */
	public static final int  MAX_ROADWAYNO = 128;

	/**
	 * \if ENGLISH_LANG
	 * ITC violation code length limit
	 * \else
	 * 智能代码长度上限
	 * \endif
	 */
	public static final int  MAX_VIOLATIONCODE_DESCRIPT = 64;

	/**
	 * \if ENGLISH_LANG
	 * Direction string length
	 * \else
	 *  行驶方向字符串长度
	 * \endif
	 */
	public static final int  MAX_DRIVINGDIRECTION = 256;

	/**
	 * \if ENGLISH_LANG
	 * Max alive user info
	 * \else
	 * 最大活动用户信息数
	 * \endif
	 */
	public static final int  MAX_ACTIVEUSER_NUM = 64;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis device area top quantity limit
	 * \else
	 * 视频分析设备区域顶点个数上限
	 * \endif
	 */
	public static final int  MAX_POLYGON_NUM10 = 10;

	/**
	 * \if ENGLISH_LANG
	 * Video diagnosis type quantity limit
	 * \else
	 * 视频诊断类型个数上限
	 * \endif
	 */
	public static final int  MAX_VIDEODIAGNOSIS_DETECT_TYPE = 11;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported rule type list quantity limit
	 * \else
	 * 视频分析设备支持的规则的动作类型列表个数上限
	 * \endif
	 */
	public static final int  MAX_ACTION_LIST_SIZE = 16;

	/**
	 * \if ENGLISH_LANG
	 * Storage group buffer limit
	 * \else
	 * 存储组名称缓冲区上限
	 * \endif
	 */
	public static final int  MAX_STORAGEGROUPNAME_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * Mark area type limit
	 * \else
	 * 标定区域类型上限
	 * \endif
	 */
	public static final int  MAX_CALIBRATEAREA_TYPE_NUM = 4;

	/**
	 * \if ENGLISH_LANG
	 * Protocol name length
	 * \else
	 * 协议名称长度
	 * \endif
	 */
	public static final int  MAX_PROTOCOL_NAME_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max serial quantity
	 * \else
	 * 最大串口数量
	 * \endif
	 */
	public static final int	 MAX_COMM_NUM = 16;

	/**
	 * \if ENGLISH_LANG
	 * the max count of hightlight suppression mode
	 * \else
	 * 模式最大支持数
	 * \endif
	 */
	public static final int MAX_MODE_COUNT = 8;

	/**
	 * \if ENGLISH_LANG
	 * DNS max quantity
	 * \else
	 * DNS最大数量
	 * \endif
	 */
	public static final int  MAX_DNS_SERVER_NUM = 2;

	/**
	 * \if ENGLISH_LANG
	 * Max network quantity
	 * \else
	 * 最大网卡数量
	 * \endif
	 */
	public static final int  MAX_NETWORK_INTERFACE_NUM = 32;

	/**
	 * \if ENGLISH_LANG
	 * NVS max quantity
	 * \else
	 * 网络存储服务器最大数量
	 * \endif
	 */
	public static final int	 MAX_NAS_NUM = 16;

	/**
	 * \if ENGLISH_LANG
	 * Record storage mapping max quantity
	 * \else
	 * 录像存储点映射最大数量
	 * \endif
	 */
	public static final int  MAX_STORAGEPOINT_NUM = 32;

	/**
	 * \if ENGLISH_LANG
	 * Intelligent tracking scene max quantity
	 * \else
	 * 智能跟踪场景最大数量
	 * \endif
	 */
	public static final int  MAX_TRACKSCENE_NUM = 10;

	/**
	 * \if ENGLISH_LANG
	 * Traffic device status max quantity
	 * \else
	 * 交通设备状态最大个数
	 * \endif
	 */
	public static final int  MAX_STATUS_NUM = 16;

	/**
	 * \if ENGLISH_LANG
	 * Server supported max services
	 * \else
	 * 服务器支持的最大服务数
	 * \endif
	 */
	public static final int  MAX_SERVICE_NUM = 128;

	/**
	 * \if ENGLISH_LANG
	 * Database keyword max value
	 * \else
	 * 数据库关键字最大值
	 * \endif
	 */
	public static final int  MAX_DBKEY_NUM = 64;

	/**
	 * \if ENGLISH_LANG
	 * Overlay to JPEG summary info max length
	 * \else
	 * 叠加到JPEG图片的摘要信息最大长度
	 * \endif
	 */
	public static final int  MAX_SUMMARY_LEN = 1024;

	/**
	 * \if ENGLISH_LANG
	 * Motion detection supported video window value
	 * \else
	 * 动检支持的视频窗口值
	 * \endif
	 */
	public static final int  MAX_MOTION_WINDOW = 10;

	/**
	 * \if ENGLISH_LANG
	 * osd overlay content max length
	 * \else
	 * osd叠加内容最大长度
	 * \endif
	 */
	public static final int  MAX_OSD_SUMMARY_LEN = 256;

	/**
	 * \if ENGLISH_LANG
	 * osd overlay title max length
	 * \else
	 * osd叠加标题最大长度
	 * \endif
	 */
	public static final int  MAX_OSD_TITLE_LEN = 128;

	/**
	 * \if ENGLISH_LANG
	 * Custom judicial case max quantity
	 * \else
	 * 自定义案件最大个数
	 * \endif
	 */
	public static final int  MAX_CUSTOMCASE_NUM = 16;

	/**
	 * \if ENGLISH_LANG
	 * Main/sub tracking max global config number
	 * \else
	 * 主从式跟踪器最大全局配置数
	 * \endif
	 */
	public static final int  MAX_GLOBAL_MSTERSLAVE_NUM = 64;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis device supported detection object property type list quantity limit
	 * \else
	 * 视频分析设备支持的检测物体属性类型列表个数上限
	 * \endif
	 */
	public static final int  MAX_OBJECT_ATTRIBUTES_SIZE = 16;

	/**
	 * \if ENGLISH_LANG
	 * Device model length
	 * \else
	 * 设备型号长度
	 * \endif
	 */
	public static final int  MAX_MODEL_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max writing device quantity
	 * \else
	 * 最大刻录设备个数
	 * \endif
	 */
	public static final int  MAX_BURNING_DEV_NUM = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max net type quantity
	 * \else
	 * 最大网络类型个数
	 * \endif
	 */
	public static final int  MAX_NET_TYPE_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * Net type string length
	 * \else
	 * 网络类型字符串长度
	 * \endif
	 */
	public static final int  MAX_NET_TYPE_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * Device name
	 * \else
	 * 机器名称
	 * \endif
	 */
	public static final int  MAX_DEVICE_NAME_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * Device ID max length
	 * \else
	 * 设备ID最大长度
	 * \endif
	 */
	public static final int  MAX_DEV_ID_LEN_EX = 128;

	/**
	 * \if ENGLISH_LANG
	 * Month in a year
	 * \else
	 * 一年中月份数
	 * \endif
	 */
	public static final int  MONTH_OF_YEAR = 12;

	/**
	 * \if ENGLISH_LANG
	 * Server max quantity
	 * \else
	 * 服务器最大个数
	 * \endif
	 */
	public static final int  MAX_SERVER_NUM = 10;

	/**
	 * \if ENGLISH_LANG
	 * Auto registration config max quantity
	 * \else
	 * 主动注册配置最大个数
	 * \endif
	 */
	public static final int  MAX_REGISTER_NUM = 10;

	/**
	 * \if ENGLISH_LANG
	 * Single channel max speed change config quantity
	 * \else
	 * 单通道最大变速配置个数
	 * \endif
	 */
	public static final int  MAX_VIDEO_IN_ZOOM = 32;

	/**
	 * \if ENGLISH_LANG
	 * Video analysis global config scene max quantity
	 * \else
	 * 视频分析全局配置场景最大数量
	 * \endif
	 */
	public static final int	 MAX_ANALYSE_SCENE_NUM = 32;

	/**
	 * \if ENGLISH_LANG
	 * Each PTZ max config quantity
	 * \else
	 * 每个云台的最大配置数
	 * \endif
	 */
	public static final int	 MAX_CONFIG_NUM	= 32;

	/**
	 * \if ENGLISH_LANG
	 * General string length 8
	 * \else
	 * 通用字符串长度8
	 * \endif
	 */
	public static final int CFG_COMMON_STRING_8 = 8;

	/**
	 * \if ENGLISH_LANG
	 * General string length 16
	 * \else
	 * 通用字符串长度16
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_16 = 16;

	/**
	 * \if ENGLISH_LANG
	 * General string length 32
	 * \else
	 * 通用字符串长度32
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_32 = 32;

	/**
	 * \if ENGLISH_LANG
	 * General string length 64
	 * \else
	 * 通用字符串长度64
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_64 = 64;

	/**
	 * \if ENGLISH_LANG
	 * General string length 128
	 * \else
	 * 通用字符串长度128
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_128 = 128;

	/**
	 * \if ENGLISH_LANG
	 * General string length 256
	 * \else
	 * 通用字符串长度256
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_256 = 256;

	/**
	 * \if ENGLISH_LANG
	 * General string length 512
	 * \else
	 * 通用字符串长度512
	 * \endif
	 */
	public static final int  CFG_COMMON_STRING_512 = 512;


	/**
	 * \if ENGLISH_LANG
	 * Channel name length
	 * \else
	 * 通道名称长度
	 * \endif
	 */
	public static final int  AV_CFG_Channel_Name_Len = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max length of the channel name
	 * \else
	 * 通道名称最大长度
	 * \endif
	 */
	public static final int CFG_MAX_CHANNEL_NAME_LEN = 256;

	/**
	 * \if ENGLISH_LANG
	 * patrol path quantity
	 * \else
	 *  巡航路径数量
	 * \endif
	 */
	public static final int CFG_MAX_PTZTOUR_NUM = 64;

	/**
	 * \if ENGLISH_LANG
	 * patrol path included preset quantity
	 * \else
	 *  巡航路径包含的预置点数量
	 * \endif
	 */
	public static final int CFG_MAX_PTZTOUR_PRESET_NUM = 64;
	/**
	 * \if ENGLISH_LANG
	 * Monitor wall name length
	 * \else
	 * 电视墙名称长度
	 * \endif
	 */
	public static final int  AV_CFG_Monitor_Name_Len = 64;

	/**
	 * \if ENGLISH_LANG
	 * A week day
	 * \else
	 * 一周天数
	 * \endif
	 */
	public static final int  AV_CFG_Weekday_Num	= 7;

	/**
	 * \if ENGLISH_LANG
	 * Period quantity
	 * \else
	 * 时间段数量
	 * \endif
	 */
	public static final int  AV_CFG_Max_TimeSection = 6;

	/**
	 * \if ENGLISH_LANG
	 * Device ID length
	 * \else
	 * 设备ID长度
	 * \endif
	 */
	public static final int  AV_CFG_Device_ID_Len = 64;

	/**
	 * \if ENGLISH_LANG
	 * ip length
	 * \else
	 * ip长度
	 * \endif
	 */
	public static final int  AV_CFG_IP_Address_Len = 32;

	/**
	 * \if ENGLISH_LANG
	 * extern IP address string length, support IPv6
	 * \else
	 * 扩展IP地址字符串长度, 支持IPV6
	 * \endif
	 */
	public static final int  AV_CFG_IP_Address_Len_EX = 40;

	/**
	 * \if ENGLISH_LANG
	 * Username length
	 * \else
	 * 用户名长度
	 * \endif
	 */
	public static final int  AV_CFG_User_Name_Len = 64;

	/**
	 * \if ENGLISH_LANG
	 * Password length
	 * \else
	 * 密码长度
	 * \endif
	 */
	public static final int  AV_CFG_Password_Len = 64;

	/**
	 * \if ENGLISH_LANG
	 * Protocol name length
	 * \else
	 * 协议名长度
	 * \endif
	 */
	public static final int  AV_CFG_Protocol_Len = 32;

	/**
	 * \if ENGLISH_LANG
	 * SN length
	 * \else
	 * 序列号长度
	 * \endif
	 */
	public static final int  AV_CFG_Serial_Len = 32;

	/**
	 * \if ENGLISH_LANG
	 * Device type length
	 * \else
	 * 设备类型长度
	 * \endif
	 */
	public static final int  AV_CFG_Device_Class_Len = 16;

	/**
	 * \if ENGLISH_LANG
	 * Device detailed model length
	 * \else
	 * 设备具体型号长度
	 * \endif
	 */
	public static final int  AV_CFG_Device_Type_Len = 32;

	/**
	 * \if ENGLISH_LANG
	 * Device name
	 * \else
	 * 机器名称
	 * \endif
	 */
	public static final int  AV_CFG_Device_Name_Len = 128;

	/**
	 * \if ENGLISH_LANG
	 * Device deploy location
	 * \else
	 * 机器部署地点
	 * \endif
	 */
	public static final int  AV_CFG_Address_Len = 128;

	/**
	 * \if ENGLISH_LANG
	 * Group name length
	 * \else
	 * 分区名称
	 * \endif
	 */
	public static final int  AV_CFG_Group_Name_Len = 64;

	/**
	 * \if ENGLISH_LANG
	 * Path length
	 * \else
	 * 路径长度
	 * \endif
	 */
	public static final int  AV_CFG_Max_Path = 260;

	/**
	 * \if ENGLISH_LANG
	 * Max split window quantity
	 * \else
	 * 最大分割窗口数量
	 * \endif
	 */
	public static final int  AV_CFG_Max_Split_Window = 128;

	/**
	 * \if ENGLISH_LANG
	 * Each output channel max tour image favorite quantity
	 * \else
	 * 每个输出通道的最大轮训画面收藏数量
	 * \endif
	 */
	public static final int  AV_CFG_Monitor_Favorite_In_Channel = 64;

	/**
	 * \if ENGLISH_LANG
	 * Image favorite name length
	 * \else
	 * 画面收藏名称长度
	 * \endif
	 */
	public static final int  AV_CFG_Monitor_Favorite_Name_Len = 64;

	/**
	 * \if ENGLISH_LANG
	 * Image favorite max window quantity
	 * \else
	 * 画面收藏的最大窗口数量
	 * \endif
	 */
	public static final int  AV_CFG_Max_Monitor_Favorite_Window = 64;

	/**
	 * \if ENGLISH_LANG
	 * Split max group quantity
	 * \else
	 * 分割最大分组数量
	 * \endif
	 */
	public static final int  AV_CFG_Max_Split_Group = 64;

	/**
	 * \if ENGLISH_LANG
	 * Split mode max quantity
	 * \else
	 * 分割模式最大数量
	 * \endif
	 */
	public static final int  AV_CFG_Max_Split_Mode = 32;

	/**
	 * \if ENGLISH_LANG
	 * RAID name length
	 * \else
	 * RAID名称长度
	 * \endif
	 */
	public static final int  AV_CFG_Raid_Name_Len = 64;

	/**
	 * \if ENGLISH_LANG
	 * Single RAID included disk quantity
	 * \else
	 * 单个RAID包含磁盘数
	 * \endif
	 */
	public static final int  AV_CFG_Max_Rail_Member = 32;

	/**
	 * \if ENGLISH_LANG
	 * Main stream encode type quantity
	 * \else
	 * 主码流编码类型数
	 * \endif
	 */
	public static final int  AV_CFG_Max_Encode_Main_Format = 3;

	/**
	 * \if ENGLISH_LANG
	 * Sub stream encode type
	 * \else
	 * 辅码流编码类型数
	 * \endif
	 */
	public static final int  AV_CFG_Max_Encode_Extra_Format = 3;

	/**
	 * \if ENGLISH_LANG
	 * Snapshot encode type
	 * \else
	 * 抓图编码类型数
	 * \endif
	 */
	public static final int	 AV_CFG_Max_Encode_Snap_Format = 3;

	/**
	 * \if ENGLISH_LANG
	 * Each channel max video input color config quantity
	 * \else
	 * 每个通道最大视频输入颜色配置数量
	 * \endif
	 */
	public static final int  AV_CFG_Max_VideoColor = 24;

	/**
	 * \if ENGLISH_LANG
	 * Custom title name length
	 * \else
	 * 自定义标题名称长度
	 * \endif
	 */
	public static final int  AV_CFG_Custom_Title_Len = 1024;

	/**
	 * \if ENGLISH_LANG
	 * Custom title type length
	 * \else
	 * 自定义标题类型长度
	 * \endif
	 */
	public static final int  AV_CFG_Custom_TitleType_Len = 32;

	/**
	 * \if ENGLISH_LANG
	 * Encode area coverage max quantity
	 * \else
	 *  编码区域覆盖最大数量
	 * \endif
	 */
	public static final int  AV_CFG_Max_Video_Widget_Cover = 16;

	/**
	 * \if ENGLISH_LANG
	 * Encode object title max quantity
	 * \else
	 * 编码物件自定义标题最大数量
	 * \endif
	 */
	public static final int  AV_CFG_Max_Video_Widget_Custom_Title = 8;

	/**
	 * \if ENGLISH_LANG
	 * Encode object max number of sensor info
	 * \else
	 * 编码物件叠加传感器信息的最大数目
	 * \endif
	 */
	public static final int AV_CFG_Max_Video_Widget_Sensor_Info  = 2;

	/**
	 * \if ENGLISH_LANG
	 * max description number
	 * \else
	 * 叠加区域描述信息的最大个数
	 * \endif
	 */
	public static final int AV_CFG_Max_Description_Num = 4;

	/**
	 * \if ENGLISH_LANG
	 * The length of Device number
	 * \else
	 * 设备编号长度
	 * \endif
	 */
	public static final int  AV_CFG_DeviceNo_Len    = 32;

	/**
	 * \if ENGLISH_LANG
	 * Group note length
	 * \else
	 * 分组说明长度
	 * \endif
	 */
	public static final int  AV_CFG_Group_Memo_Len = 128;

	/**
	 * \if ENGLISH_LANG
	 * Max channel quantity
	 * \else
	 * 最大通道数量
	 * \endif
	 */
	public static final int  AV_CFG_Max_Channel_Num = 1024;

	/**
	 * \if ENGLISH_LANG
	 * Time format length
	 * \else
	 * 时间格式长度
	 * \endif
	 */
	public static final int  AV_CFG_Time_Format_Len = 32;

	/**
	 * \if ENGLISH_LANG
	 * Allow list quantity
	 * \else
	 * 允许名单数量
	 * \endif
	 */
	public static final int  AV_CFG_Max_White_List = 1024;

	/**
	 * \if ENGLISH_LANG
	 * block list quantity
	 * \else
	 * 禁止名单数量
	 * \endif
	 */
	public static final int  AV_CFG_Max_Black_List = 1024;

	/**
	 * \if ENGLISH_LANG
	 * Filter IP max length
	 * \else
	 * 过滤IP最大长度
	 * \endif
	 */
	public static final int  AV_CFG_Filter_IP_Len = 96;

	/**
	 * \if ENGLISH_LANG
	 * Channel storage rule max length, only channel part
	 * \else
	 * 通道存储规则最大长度, 仅通道部分
	 * \endif
	 */
	public static final int  AV_CFG_Max_ChannelRule = 32;

	/**
	 * \if ENGLISH_LANG
	 * Event keyword quantity
	 * \else
	 * 事件关键字数量
	 * \endif
	 */
	public static final int  AV_CFG_Max_DBKey_Num = 64;

	/**
	 * \if ENGLISH_LANG
	 * Event keyword length
	 * \else
	 * 事件关键字长度
	 * \endif
	 */
	public static final int  AV_CFG_DBKey_Len = 32;

	/**
	 * \if ENGLISH_LANG
	 * Summary length
	 * \else
	 * 摘要长度
	 * \endif
	 */
	public static final int  AV_CFG_Max_Summary_Len = 1024;

	/**
	 * \if ENGLISH_LANG
	 * Event title max length
	 * \else
	 * 事件标题最大数量
	 * \endif
	 */
	public static final int  AV_CFG_Max_Event_Title_Num = 32;

	/**
	 * \if ENGLISH_LANG
	 * Activation tour max quantity
	 * \else
	 * 联动轮巡最大数量
	 * \endif
	 */
	public static final int  AV_CFG_Max_Tour_Link_Num = 128;

	/**
	 * \if ENGLISH_LANG
	 * PIP split mode basic value
	 * \else
	 * 画中画分割模式基础值
	 * \endif
	 */
	public static final int  AV_CFG_PIP_BASE = 1000;

	/**
	 * \if ENGLISH_LANG
	 * DES key byte length
	 * \else
	 * DES密钥的字节长度
	 * \endif
	 */
	public static final int  DES_KEY_LEN = 8;

	/**
	 * \if ENGLISH_LANG
	 * 3DES key byte length
	 * \else
	 * 3DES密钥的个数
	 * \endif
	 */
	public static final int  DES_KEY_NUM = 3;

	/**
	 * \if ENGLISH_LANG
	 * AES key byte length
	 * \else
	 * AES密钥的字节长度
	 * \endif
	 */
	public static final int  AES_KEY_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * Time table element quantity
	 * \else
	 * 时间表元素个数
	 * \endif
	 */
	public static final int  MAX_TIME_SCHEDULE_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * Scene sub type string length
	 * \else
	 * 场景子类型字符串长度
	 * \endif
	 */
	public static final int MAX_SCENE_SUBTYPE_LEN               = 64 ;

	/**
	 * \if ENGLISH_LANG
	 * Scene sub type max quantity
	 * \else
	 * 场景子类型最大个数
	 * \endif
	 */
	public static final int MAX_SCENE_SUBTYPE_NUM               = 32 ;

	/**
	 * \if ENGLISH_LANG
	 * Single channel max focus config quantity
	 * \else
	 * 单通道最大聚焦配置个数
	 * \endif
	 */
	public static final int MAX_VIDEO_IN_FOCUS                  = 32 ;

	/**
	 * \if ENGLISH_LANG
	 * Max time period speed config quantity
	 * \else
	 * 最大时间段限速配置个数
	 * \endif
	 */
	public static final int MAX_TIMESPEEDLIMIT_NUM				= 16 ;

	/**
	 * \if ENGLISH_LANG
	 * Max audio prompt config quantity
	 * \else
	 * 最大语音提示配置个数
	 * \endif
	 */
	public static final int MAX_VOICEALERT_NUM					= 64 ;

	/**
	 * \if ENGLISH_LANG
	 * Max lower matrix quantity
	 * \else
	 * 最大下位矩阵数量
	 * \endif
	 */
	public static final int CFG_MAX_LOWER_MATRIX_NUM			= 16 ;

	/**
	 * \if ENGLISH_LANG
	 * Max lower matrix input channel quantity
	 * \else
	 * 最大下位矩阵输入通道数
	 * \endif
	 */
	public static final int CFG_MAX_LOWER_MATRIX_INPUT			= 64 ;

	/**
	 * \if ENGLISH_LANG
	 * Max lower matrix output channel quantity
	 * \else
	 * 最大下位矩阵输出通道数
	 * \endif
	 */
	public static final int CFG_MAX_LOWER_MATRIX_OUTPUT			= 32 ;

	/**
	 * \if ENGLISH_LANG
	 * max fish eye window number
	 * \else
	 * 最大鱼眼窗口数
	 * \endif
	 */
	public static final int CFG_MAX_FISHEYE_WINDOW_NUM          =     8;

	/**
	 * \if ENGLISH_LANG
	 * max fish eye mode number
	 * \else
	 * 最大鱼眼模式数
	 * \endif
	 */
	public static final int CFG_MAX_FISHEYE_MODE_NUM            =     8;

	/**
	 * \if ENGLISH_LANG
	 * Max IR panel template quantity
	 * \else
	 * 最大红外面板模板数量
	 * \endif
	 */
	public static final int CFG_MAX_INFRARED_BOARD_TEMPLATE_NUM = 16 ;

	/**
	 * \if ENGLISH_LANG
	 * Max IR panel button quantity
	 * \else
	 * 最大红外面板按键数量
	 * \endif
	 */
	public static final int	CFG_MAX_INFRARED_KEY_NUM			= 128;

	/**
	 * \if ENGLISH_LANG
	 * Max IR panel quantity
	 * \else
	 * 最大红外面板数量
	 * \endif
	 */
	public static final int	CFG_MAX_INFRARED_BOARD_NUM			= 16 ;

	/**
	 * \if ENGLISH_LANG
	 * The Maximum Number of Alarm Channels
	 * \else
	 * 最大报警通道数
	 * \endif
	 */
	public static final int	MAX_ALARM_CHANNEL_NUM				= 32;

	/**
	 * \if ENGLISH_LANG
	 * The Maximum Number of Alarm Protection Zone Type
	 * \else
	 * 最大报警防区类型数
	 * \endif
	 */
	public static final int	MAX_ALARM_DEFENCE_TYPE_NUM		    = 8;

	/**
	 * \if ENGLISH_LANG
	 * The Maximum Number of Alarm Sensors Way
	 * \else
	 * 最大报警感应器方式数
	 * \endif
	 */
	public static final int	MAX_ALARM_SENSE_METHOD_NUM			= 16;

	/**
	 * \if ENGLISH_LANG
	 * The Maximum Number of Protocol Support Extended Alarm Boxes
	 * \else
	 * 最大支持扩展报警盒协议数
	 * \endif
	 */
	public static final int	MAX_EXALARMBOX_PROTOCOL_NUM         = 8;

	/**
	 * \if ENGLISH_LANG
	 * The Maximum Number of Alarm Channels
	 * \else
	 * 最大报警通道数
	 * \endif
	 */
	public static final int	MAX_EXALARM_CHANNEL_NUM             = 256;

	/**
	 * \if ENGLISH_LANG
	 * The Maximum Number of Alarm Boxes
	 * \else
	 * 最大报警盒子数
	 * \endif
	 */
	public static final int	MAX_EXALARMBOX_NUM                  = 8;

	/**
	 * \if ENGLISH_LANG
	 * Max Mail Title Length
	 * \else
	 * 最大邮件标题长度
	 * \endif
	 */
	public static final int	MAX_MAILTITLE_LEN                   = 256;

	/**
	 * \if ENGLISH_LANG
	 * Max device encoding length
	 * \else
	 * 最大设备编码长度
	 * \endif
	 */
	public static final int	MAX_DEVICE_ID_LEN                   = 48;

	/**
	 * \if ENGLISH_LANG
	 * Max device description length
	 * \else
	 * 最大设备描述长度
	 * \endif
	 */
	public static final int	MAX_DEVICE_MARK_LEN                 = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max device brand length
	 * \else
	 * 最大设备品牌长度
	 * \endif
	 */
	public static final int	MAX_BRAND_NAME_LEN                  = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max serial address quantity
	 * \else
	 * 最大串口地址个数
	 * \endif
	 */
	public static final int	MAX_ADDRESS_NUM                     = 16;

	/**
	 * \if ENGLISH_LANG
	 * Max air conditioner device quantity
	 * \else
	 * 最大空调设备个数
	 * \endif
	 */
	public static final int	MAX_AIRCONDITION_NUM                = 16;

	/**
	 * \if ENGLISH_LANG
	 * Max collection quantity
	 * \else
	 * 最大预案数
	 * \endif
	 */
	public static final int	CFG_MAX_COLLECTION_NUM              = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max floor
	 * \else
	 * 最大楼层数
	 * \endif
	 */
	public static final int	MAX_FLOOR_NUM                       = 128;

	/**
	 * \if ENGLISH_LANG
	 * Max Seat
	 * \else
	 * 最大座位数
	 * \endif
	 */
	public static final int	MAX_SEAT_NUM                        = 8;

	/**
	 * \if ENGLISH_LANG
	 * Local device ID
	 * \else
	 * 本地设备ID
	 * \endif
	 */
	public static final String  AV_CFG_Local_Device_ID         = "Local";

	/**
	 * \if ENGLISH_LANG
	 * Remote device ID
	 * \else
	 * 远程设备ID
	 * \endif
	 */
	public static final String  AV_CFG_Remote_Devce_ID         = "Remote";

	/**
	 * \if ENGLISH_LANG
	 * Max lane number
	 * \else
	 * 车道最大个数
	 * \endif
	 */
	public static final int	MAX_LANE_CONFIG_NUMBER             = 32;

	/**
	 * \if ENGLISH_LANG
	 * Violation priority includes max violation number
	 * \else
	 * 优先级包含最大个数
	 * \endif
	 */
	public static final int	MAX_PRIORITY_NUMBER                = 256;

	/**
	 * \if ENGLISH_LANG
	 * Number of category type
	 * \else
	 * 子类别类型数
	 * \endif
	 */
	public static final int	MAX_CATEGORY_TYPE_NUMBER           = 128;

	/**
	 * \if ENGLISH_LANG
	 * Number of trigger mode
	 * \else
	 * 触发模式个数
	 * \endif
	 */
	public static final int	MAX_TRIGGER_MODE_NUMBER            = 64;

	/**
	 * \if ENGLISH_LANG
	 * max number of abnormal detect type
	 * \else
	 * 异常检测类型数
	 * \endif
	 */
	public static final int	MAX_ABNORMAL_DETECT_TYPE           = 32;

	/**
	 * \if ENGLISH_LANG
	 * max threshold counts
	 * \else
	 * 异常检测阙值最大个数
	 * \endif
	 */
	public static final int	MAX_ABNORMAL_THRESHOLD_LEN	       = 32;

	/**
	 * \if ENGLISH_LANG
	 * Touch screen calibration points
	 * \else
	 * 触摸屏校准点数
	 * \endif
	 */
	public static final int	TS_POINT_NUM                       = 3;

	/**
	 * \if ENGLISH_LANG
	 * Max len of filter ip
	 * \else
	 * 过滤IP最大长度
	 * \endif
	 */
	public static final int	CFG_FILTER_IP_LEN				   = 96;

	/**
	 * \if ENGLISH_LANG
	 * Max number in trust list
	 * \else
	 * 允许名单数量
	 * \endif
	 */
	public static final int	CFG_MAX_TRUST_LIST				   = 1024;

	/**
	 * \if ENGLISH_LANG
	 * Max number in banned list
	 * \else
	 * 禁止名单数量
	 * \endif
	 */
	public static final int	CFG_MAX_BANNED_LIST				   = 1024;

	/**
	 * \if ENGLISH_LANG
	 * the various VideoIn config protocols' time section number, by now, we have three: 'day', 'night', 'normal'
	 * \else
	 * VideoIn 系列协议时间段个数，目前有普通、白天、黑夜三种
	 * \endif
	 */
	public static final int	VIDEOIN_TSEC_NUM                   = 3;

	/**
	 * \if ENGLISH_LANG
	 * The Maximum Number of mosaic  Channel supported
	 * \else
	 * 单个通道支持的马赛克区域最大个数
	 * \endif
	 */
	public static final int	MAX_RECT_COUNT					   = 4;

	/**
	 * \if ENGLISH_LANG
	 * SSID max length
	 * \else
	 * SSID最大长度
	 * \endif
	 */
	public static final int	CFG_MAX_SSID_LEN                   = 36;


	 /**********************************************************************
	 *               fAnalyzerData 回调函数 dwDataType 类型定义                                *
	 ***********************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * Call analysis video info summary type, refer to {@link CFG_VIDEOSATA_SUMMARY_INFO}
	 * \else
	 * 回调解析视频信息摘要类型, 取值参考 {@link CFG_VIDEOSATA_SUMMARY_INFO}
	 * \endif
	 */
	public static final int     TYPE_CB_VIDEOSTAT =       0x1000000;

	/**
	 * \if ENGLISH_LANG
	 * Call analysis video input channel corresponding all event rule types, refer to {@link CFG_ANALYSERULES_INFO}
	 * \else
	 * 回调解析视频输入通道对应的所有事件规则类型, 取值参考 {@link CFG_ANALYSERULES_INFO}
	 * \endif
	 */
	public static final int     TYPE_CB_ANARULES =        0x1000001;

	/**
	 * \if ENGLISH_LANG
	 * Call analysis compressed video intelligent frame, refer to {@link SDK_MSG_OBJECT}
	 * \else
	 * 回调解析浓缩视频的智能帧, 取值参考 {@link SDK_MSG_OBJECT}
	 * \endif
	 */
	public static final int     TYPE_CB_VIDEOSYNOPSIS =   0x1000002;

	/**
	 * \if ENGLISH_LANG
	 * Call analysis traffic info, refer to {@link DEV_EVENT_TRAFFIC_FLOWSTAT_INFO}
	 * \else
	 * 回调解析交通流量信息, 取值参考 {@link DEV_EVENT_TRAFFIC_FLOWSTAT_INFO}
	 * \endif
	 */
	public static final int     TYPE_CB_TRAFFICFLOWINFO = 0x1000003;

	/**
	 * \if ENGLISH_LANG
	 * Call analysis traffic flow rule info, refer to {@link CFG_TRAFFIC_FLOWSTAT_INFO}
	 * \else
	 * 回调解析交通流量规则信息, 取值参考 {@link CFG_TRAFFIC_FLOWSTAT_INFO}
	 * \endif
	 */
	public static final int    TYPE_CB_TRAFFICFLOWRULE = 0x1000004;



	/*******************************************************************************************
	 ** 配置命令 对应 {@link INetSDK#GetNewDevConfig}和 {@link INetSDK#SetNewDevConfig}接口 **
	 ******************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * image channel property config, refer to {@link CFG_ENCODE_INFO}
	 * \else
	 * 图像通道属性配置, 取值参考 {@link CFG_ENCODE_INFO}
	 * \endif
	 */
	public static final String  CFG_CMD_ENCODE    = "Encode";

	/**
	 * \if ENGLISH_LANG
	 * timed recordconfig, refer to {@link CFG_RECORD_INFO}
	 * \else
	 * 定时录像配置, 取值参考 {@link CFG_RECORD_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_RECORD	 = "Record";

	/**
	 * \if ENGLISH_LANG
	 * external inputalarmconfig, refer to {@link CFG_ALARMIN_INFO}
	 * \else
	 * 外部输入报警配置, 取值参考 {@link CFG_ALARMIN_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ALARMINPUT	= "Alarm";

	/**
	 * \if ENGLISH_LANG
	 * network alarmconfig, refer to {@link CFG_NETALARMIN_INFO}
	 * \else
	 * 网络报警配置, 取值参考 {@link CFG_NETALARMIN_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_NETALARMINPUT    = "NetAlarm";

	/**
	 * \if ENGLISH_LANG
	 * dynamic detectionalarmconfig, refer to {@link CFG_MOTION_INFO}
	 * \else
	 * 动态检测报警配置, 取值参考 {@link CFG_MOTION_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_MOTIONDETECT    = "MotionDetect";

	/**
	 * \if ENGLISH_LANG
	 * video loss alarmconfig, refer to {@link CFG_VIDEOLOST_INFO}
	 * \else
	 * 视频丢失报警配置, 取值参考 {@link CFG_VIDEOLOST_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEOLOST	    = "LossDetect";

	/**
	 * \if ENGLISH_LANG
	 * video mask alarmconfig, refer to {@link CFG_SHELTER_INFO}
	 * \else
	 * 视频遮挡报警配置, 取值参考 {@link CFG_SHELTER_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEOBLIND	    = "BlindDetect";

	/**
	 * \if ENGLISH_LANG
	 * no storage device config, refer to {@link CFG_STORAGENOEXIST_INFO}
	 * \else
	 * 无存储设备报警配置, 取值参考 {@link CFG_STORAGENOEXIST_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_STORAGENOEXIST    = "StorageNotExist";

	/**
	 * \if ENGLISH_LANG
	 * storage device access mistake config, refer to {@link CFG_STORAGEFAILURE_INFO}
	 * \else
	 * 存储设备访问出错报警配置, 取值参考 {@link CFG_STORAGEFAILURE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_STORAGEFAILURE    = "StorageFailure";

	/**
	 * \if ENGLISH_LANG
	 * storage device low volume config, refer to {@link CFG_STORAGELOWSAPCE_INFO}
	 * \else
	 * 存储设备空间不足报警配置, 取值参考 {@link CFG_STORAGELOWSAPCE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_STORAGELOWSAPCE    = "StorageLowSpace";

	/**
	 * \if ENGLISH_LANG
	 * disconnected config, refer to {@link CFG_NETABORT_INFO}
	 * \else
	 * 网络断开报警配置, 取值参考 {@link CFG_NETABORT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_NETABORT	    = "NetAbort";

	/**
	 * \if ENGLISH_LANG
	 * IP conflict setting, refer to {@link CFG_IPCONFLICT_INFO}
	 * \else
	 * IP冲突报警配置, 取值参考 {@link CFG_IPCONFLICT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_IPCONFLICT	    = "IPConflict";

	/**
	 * \if ENGLISH_LANG
	 * snapshot, refer to {@link CFG_SNAPCAPINFO_INFO}
	 * \else
	 * 抓图能力查询, 取值参考 {@link CFG_SNAPCAPINFO_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_SNAPCAPINFO	    = "SnapInfo";

	/**
	 * \if ENGLISH_LANG
	 * network storage serverconfig, refer to {@link CFG_NAS_INFO}
	 * \else
	 * 网络存储服务器配置, 取值参考 {@link CFG_NAS_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_NAS			    = "NAS";

	/**
	 * \if ENGLISH_LANG
	 * PTZ config, refer to {@link CFG_PTZ_INFO}
	 * \else
	 * 云台配置, 取值参考 {@link CFG_PTZ_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_PTZ			    = "Ptz";

	/**
	 * \if ENGLISH_LANG
	 * PTZ schedule action config, refer to {@link CFG_PTZ_AUTOMOVE_INFO}
	 * \else
	 * 云台定时动作配置, 取值参考 {@link CFG_PTZ_AUTOMOVE_INFO}
	 * \endif
	 */
	public static final String	CFG_CMD_PTZ_AUTO_MOVEMENT   = "PtzAutoMovement";

	/**
	 * \if ENGLISH_LANG
	 * video water mark config, refer to {@link CFG_WATERMARK_INFO}
	 * \else
	 * 视频水印配置, 取值参考 {@link CFG_WATERMARK_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_WATERMARK	    = "WaterMark";

	/**
	 * \if ENGLISH_LANG
	 * video full analysis config, refer to {@link CFG_ANALYSEGLOBAL_INFO}
	 * \else
	 * 视频分析全局配置, 取值参考 {@link CFG_ANALYSEGLOBAL_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ANALYSEGLOBAL    = "VideoAnalyseGlobal";

	/**
	 * \if ENGLISH_LANG
	 * object's detection module config, refer to {@link CFG_ANALYSEMODULES_INFO}
	 * \else
	 * 物体的检测模块配置, 取值参考 {@link CFG_ANALYSEMODULES_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ANALYSEMODULE    = "VideoAnalyseModule";

	/**
	 * \if ENGLISH_LANG
	 * video analyzing rule config, refer to {@link CFG_ANALYSERULES_INFO}
	 * \else
	 * 视频分析规则配置, 取值参考 {@link CFG_ANALYSERULES_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ANALYSERULE	    = "VideoAnalyseRule";

	/**
	 * \if ENGLISH_LANG
	 * video analyzing resource config, refer to {@link CFG_ANALYSESOURCE_INFO}
	 * \else
	 * 视频分析资源配置, 取值参考 {@link CFG_ANALYSESOURCE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ANALYSESOURCE    = "VideoAnalyseSource";

	/**
	 * \if ENGLISH_LANG
	 * wiper config, refer to {@link CFG_RAINBRUSH_INFO}
	 * \else
	 * 雨刷配置, 取值参考 {@link CFG_RAINBRUSH_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_RAINBRUSH         = "RainBrush";

	/**
	 * \if ENGLISH_LANG
	 * ITC ,refer to {@link CFG_TRAFFICSNAPSHOT_INFO} for compatible with old protocol), please use {@link FinalVar#CFG_CMD_TRAFFICSNAPSHOT_MULTI}
	 * \else
	 * 智能交通抓拍(对应{@link CFG_TRAFFICSNAPSHOT_INFO},只为兼容老协议), 请使用 {@link FinalVar#CFG_CMD_TRAFFICSNAPSHOT_MULTI}
	 * \endif
	 */
	public static final String CFG_CMD_INTELLECTIVETRAFFIC   = "TrafficSnapshot";

	/**
	 * \if ENGLISH_LANG
	 * full intellifent traffic config, refer to {@link CFG_TRAFFICGLOBAL_INFO}
	 * \else
	 * 智能交通全局配置, 取值参考 {@link CFG_TRAFFICGLOBAL_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_TRAFFICGLOBAL     = "TrafficGlobal";

	/**
	 * \if ENGLISH_LANG
	 * normal config, refer to {@link CFG_DEV_DISPOSITION_INFO}
	 * \else
	 * 普通配置 , 取值参考 {@link CFG_DEV_DISPOSITION_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_DEV_GENERRAL      = "General";

	/**
	 * \if ENGLISH_LANG
	 * ATM expired config, refer to {@link CFG_ATMMOTION_INFO }
	 * \else
	 * ATM取款超时配置, 取值参考 {@link CFG_ATMMOTION_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ATMMOTION	    = "FetchMoneyOverTime";

	/**
	 * \if ENGLISH_LANG
	 * device status info, refer to {@link CFG_DEVICESTATUS_INFO}
	 * \else
	 * 设备状态信息, 取值参考 {@link CFG_DEVICESTATUS_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_DEVICESTATUS      = "DeviceStatus";

	/**
	 * \if ENGLISH_LANG
	 * extension info, refer to {@link CFG_HARDISKTANKGROUP_INFO}
	 * \else
	 * 扩展柜信息, 取值参考 {@link CFG_HARDISKTANKGROUP_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_HARDDISKTANK      = "HardDiskTank";

	/**
	 * \if ENGLISH_LANG
	 * Raid froup info, refer to {@link CFG_RAIDGROUP_INFO}
	 * \else
	 * Raid组信息, 取值参考 {@link CFG_RAIDGROUP_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_RAIDGROUP         = "RaidGroup";

	/**
	 * \if ENGLISH_LANG
	 * storage pool info, refer to {@link CFG_STORAGEPOOLGROUP_INFO}
	 * \else
	 * 存储池组信息, 取值参考 {@link CFG_STORAGEPOOLGROUP_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_STORAGEPOOLGROUP   = "StoragePoolGroup";

	/**
	 * \if ENGLISH_LANG
	 * file system group info, refer to {@link CFG_STORAGEPOSITIONGROUP_INFO}
	 * \else
	 * 文件系统组信息, 取值参考 {@link CFG_STORAGEPOSITIONGROUP_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_STORAGEPOSITIONGROUP    = "StoragePositionGroup";

	/**
	 * \if ENGLISH_LANG
	 * frong-end device group info, refer to {@link CFG_VIDEOINDEVGROUP_INFO}
	 * \else
	 * 前端设备组信息, 取值参考 {@link CFG_VIDEOINDEVGROUP_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEOINDEVGROUP   = "VideoInDevGroup";

	/**
	 * \if ENGLISH_LANG
	 * channelrecord group status, refer to {@link CFG_DEVRECORDGROUP_INFO}
	 * \else
	 * 通道录像组状态, 取值参考 {@link CFG_DEVRECORDGROUP_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_DEVRECORDGROUP    = "DevRecordGroup";

	/**
	 * \if ENGLISH_LANG
	 * service status, refer to {@link CFG_IPSERVER_STATUS}
	 * \else
	 * 服务状态, 取值参考 {@link CFG_IPSERVER_STATUS}
	 * \endif
	 */
	public static final String CFG_CMD_IPSSERVER         = "IpsServer";

	/**
	 * \if ENGLISH_LANG
	 * Spot vide matrix, refer to {@link CFG_SNAPSOURCE_INFO}
	 * \else
	 * 抓图源配置, 取值参考 {@link CFG_SNAPSOURCE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_SNAPSOURCE	     = "SnapSource";

	/**
	 * \if ENGLISH_LANG
	 * Private rador(json string only)
	 * \else
	 * 私有雷达配置(透传 json 串)
	 * \endif
	 */
	public static final String CFG_CMD_DHRADER           = "DahuaRadar";

	/**
	 * \if ENGLISH_LANG
	 * Private rader configuration (parse to C structure, {@link CFG_DAHUA_RADAR})
	 * \else
	 * 私有雷达配置（解析为结构体，对应 {@link CFG_DAHUA_RADAR}）
	 * \endif
	 */
	public static final String CFG_CMD_DHRADER_PP         = "DahuaRadar";

	/**
	 * \if ENGLISH_LANG
	 * Chuansu radar
	 * \else
	 * 雷达配置
	 * \endif
	 */
	public static final String CFG_CMD_TRANSRADER         = "TransRadar";

	/**
	 * \if ENGLISH_LANG
	 * Landun radar
	 * \else
	 * 雷达配置
	 * \endif
	 */
	public static final String CFG_CMD_LANDUNRADER        = "LanDunRadar";

	/**
	 * \if ENGLISH_LANG
	 * Landun coil
	 * \else
	 * 线圈配置
	 * \endif
	 */
	public static final String CFG_CMD_LANDUNCOILS        = "LanDunCoils";

	/**
	 * \if ENGLISH_LANG
	 * Spot vide matrix, refer to {@link CFG_VIDEO_MATRIX}
	 * \else
	 * Spot视屏矩阵, 取值参考 {@link CFG_VIDEO_MATRIX}
	 * \endif
	 */
	public static final String CFG_CMD_MATRIX_SPOT        = "SpotMatrix";

	/**
	 * \if ENGLISH_LANG
	 * every number channel dsp info, refer to {@link CFG_DSPENCODECAP_INFO}
	 * \else
	 * HDVR传每个数字通道的dsp信息 数字通道可以连IPC或DVR 也就是IPC或DVR的能力, 取值参考 {@link CFG_DSPENCODECAP_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_HDVR_DSP           = "DspEncodeCap";

	/**
	 * \if ENGLISH_LANG
	 * HDVR each digital channel connected device info
	 * \else
	 * HDVR传每个数字通道的所连设备的信息
	 * \endif
	 */
	public static final String CFG_CMD_HDVR_ATTR_CFG      = "SystemAttr";

	/**
	 * \if ENGLISH_LANG
	 * Holiday record plan, refer to {@link CFG_HOLIDAY_SCHEDULE}
	 * \else
	 * 假期录像计划, 取值参考 {@link CFG_HOLIDAY_SCHEDULE}
	 * \endif
	 */
	public static final String CFG_CMD_CHANNEL_HOLIDAY    = "HolidaySchedule";

	/**
	 * \if ENGLISH_LANG
	 * Health mail
	 * \else
	 * 健康邮件
	 * \endif
	 */
	public static final String CFG_CMD_HEALTH_MAIL        = "HealthMail";

	/**
	 * \if ENGLISH_LANG
	 * Camera move detect activation
	 * \else
	 * 摄像机移位侦测联动
	 * \endif
	 */
	public static final String CFG_CMD_CAMERAMOVE         = "IntelliMoveDetect";

	/**
	 * \if ENGLISH_LANG
	 * video splicing tour config, refer to {@link CFG_VIDEO_MATRIX}
	 * \else
	 * 视频分割轮巡配置, 取值参考 {@link CFG_VIDEO_MATRIX}
	 * \endif
	 */
	public static final String CFG_CMD_SPLITTOUR          = "SplitTour";

	/**
	 * \if ENGLISH_LANG
	 * video encode ROI(Region of Intrest)config,structure, refer to {@link CFG_VIDEOENCODEROI_INFO}
	 * \else
	 * 视频编码ROI(Region of Intrest)配置，取值参考{@link CFG_VIDEOENCODEROI_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEOENCODEROI     = "VideoEncodeROI";

	/**
	 * \if ENGLISH_LANG
	 * light inspection config, refer to {@link CFG_VIDEO_INMETERING_INFO}
	 * \else
	 * 测光配置, 取值参考 {@link CFG_VIDEO_INMETERING_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEO_INMETERING   = "VideoInMetering";

	/**
	 * \if ENGLISH_LANG
	 * traffic flow statistics config, refer to {@link CFG_TRAFFIC_FLOWSTAT_INFO}
	 * \else
	 * 交通流量统计配置, 取值参考 {@link CFG_TRAFFIC_FLOWSTAT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_TRAFFIC_FLOWSTAT   = "TrafficFlowStat";

	/**
	 * \if ENGLISH_LANG
	 * HDMI video matrix config
	 * \else
	 * HDMI视频矩阵配置
	 * \endif
	 */
	public static final String CFG_CMD_HDMIMATRIX          = "HDMIMatrix";

	/**
	 * \if ENGLISH_LANG
	 * videoinput front-end option, refer to {@link CFG_VIDEO_IN_OPTIONS}
	 * \else
	 * 视频输入前端选项, 取值参考 {@link CFG_VIDEO_IN_OPTIONS}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEOINOPTIONS	   = "VideoInOptions";

	/**
	 * \if ENGLISH_LANG
	 * RTSP的config, refer to {@link CFG_RTSP_INFO_IN} {@link CFG_RTSP_INFO_OUT}
	 * \else
	 * RTSP的配置, 取值参考 {@link CFG_RTSP_INFO_IN} {@link CFG_RTSP_INFO_OUT}
	 * \endif
	 */
	public static final String CFG_CMD_RTSP               = "RTSP";

	/**
	 * \if ENGLISH_LANG
	 * Traffic snapshot, refer to {@link CFG_TRAFFICSNAPSHOT_INFO}(deprecated, please use {@link FinalVar#CFG_CMD_TRAFFICSNAPSHOT_MULTI})
	 * \else
	 * 智能交通抓拍, 取值参考 {@link CFG_TRAFFICSNAPSHOT_INFO} (已废除，请使用 {@link FinalVar#CFG_CMD_TRAFFICSNAPSHOT_MULTI})
	 * \endif
	 * @deprecated
	 */
	public static final String CFG_CMD_TRAFFICSNAPSHOT    = "TrafficSnapshotNew";

	/**
	 * \if ENGLISH_LANG
	 * intelligent traffic snapshot, refer to {@link CFG_TRAFFICSNAPSHOT_NEW_INFO}
	 * \else
	 * 智能交通抓拍, 取值参考 {@link CFG_TRAFFICSNAPSHOT_NEW_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_TRAFFICSNAPSHOT_MULTI    = "TrafficSnapshotNew";

	/**
	 * \if ENGLISH_LANG
	 * multicast related config, refer to {@link CFG_MULTICASTS_INFO_IN} {@link CFG_MULTICASTS_INFO_OUT}
	 * \else
	 * 组播的相关配置, 取值参考 {@link CFG_MULTICASTS_INFO_IN} {@link CFG_MULTICASTS_INFO_OUT}
	 * \endif
	 */
	public static final String CFG_CMD_MULTICAST          = "Multicast";

	/**
	 * \if ENGLISH_LANG
	 * video diagnosis parameter list, refer to {@link CFG_VIDEODIAGNOSIS_PROFILE}
	 * \else
	 * 视频诊断参数表, 取值参考 {@link CFG_VIDEODIAGNOSIS_PROFILE}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEODIAGNOSIS_PROFILE     = "VideoDiagnosisProfile";

	/**
	 * \if ENGLISH_LANG
	 * video diagnosis task list, refer to {@link CFG_VIDEODIAGNOSIS_TASK}
	 * \else
	 * 视频诊断任务表, 取值参考 {@link CFG_VIDEODIAGNOSIS_TASK}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEODIAGNOSIS_TASK	        = "VideoDiagnosisTask";

	/**
	 * \if ENGLISH_LANG
	 * video diagnosis plan list, refer to {@link CFG_VIDEODIAGNOSIS_PROJECT}
	 * \else
	 * 视频诊断计划表, 取值参考 {@link CFG_VIDEODIAGNOSIS_PROJECT}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEODIAGNOSIS_PROJECT      = "VideoDiagnosisProject";

	/**
	 * \if ENGLISH_LANG
	 *  Video Diagnosis Real-time Schedule, refer to {@link CFG_VIDEODIAGNOSIS_REALPROJECT}
	 * \else
	 * 视频诊断实时计划表, 取值参考 {@link CFG_VIDEODIAGNOSIS_REALPROJECT}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEODIAGNOSIS_REALPROJECT      = "VideoDiagnosisRealProject";

	/**
	 * \if ENGLISH_LANG
	 * video full diagnosis list , refer to {@link CFG_VIDEODIAGNOSIS_GLOBAL}
	 * \else
	 * 视频诊断全局表, 取值参考 {@link CFG_VIDEODIAGNOSIS_GLOBAL}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEODIAGNOSIS_GLOBAL       = "VideoDiagnosisGlobal";

	/**
	 * \if ENGLISH_LANG
	 * video diagnosis task list, refer to {@link CFG_VIDEODIAGNOSIS_TASK}
	 * \else
	 * 视频诊断任务表, 取值参考 {@link CFG_VIDEODIAGNOSIS_TASK}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEODIAGNOSIS_TASK_ONE     = "VideoDiagnosisTask.x";

	/**
	 * \if ENGLISH_LANG
	 * device working status relatedconfig, refer to {@link CFG_TRAFFIC_WORKSTATE_INFO}
	 * \else
	 * 设备工作状态相关配置, 取值参考 {@link CFG_TRAFFIC_WORKSTATE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_TRAFFIC_WORKSTATE           = "WorkState";

	/**
	 * \if ENGLISH_LANG
	 * disk storage group config, refer to {@link CFG_STORAGEGROUP_INFO}
	 * \else
	 * 磁盘存储组配置, 取值参考 {@link CFG_STORAGEGROUP_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_STORAGEDEVGROUP             = "StorageDevGroup";

	/**
	 * \if ENGLISH_LANG
	 * record stored storage group config, refer to {@link CFG_RECORDTOGROUP_INFO}
	 * \else
	 * 录像存放的存储组配置, 取值参考 {@link CFG_RECORDTOGROUP_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_RECORDTOGROUP               = "RecordToGroup";

	/**
	 * \if ENGLISH_LANG
	 * intelligent tracking scene config, refer to {@link CFG_INTELLITRACKSCENE_INFO}
	 * \else
	 * 智能跟踪场景配置, 取值参考 {@link CFG_INTELLITRACKSCENE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_INTELLITRACKSCENE           = "IntelliTrackScene";

	/**
	 * \if ENGLISH_LANG
	 * intelligent frame rule config, refer to {@link CFG_ANALYSERULES_INFO}
	 * \else
	 * 智能帧规则配置, 取值参考 {@link CFG_ANALYSERULES_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_IVSFRAM_RULE                = "IVSFramRule";

	/**
	 * \if ENGLISH_LANG
	 * record storage point mapping config, refer to {@link CFG_RECORDTOSTORAGEPOINT_INFO}
	 * \else
	 * 录像存储点映射配置, 取值参考 {@link CFG_RECORDTOSTORAGEPOINT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_RECORD_STORAGEPOINT        = "RecordStoragePoint";

	/**
	 * \if ENGLISH_LANG
	 * source data serverconfig, refer to {@link CFG_METADATA_SERVER}
	 * \else
	 * 元数据服务器配置, 取值参考 {@link CFG_METADATA_SERVER}
	 * \endif
	 */
	public static final String CFG_CMD_MD_SERVER		         = "MetaDataServer";

	/**
	 * \if ENGLISH_LANG
	 * channel name, refer to {@link AV_CFG_ChannelName}
	 * \else
	 * 通道名称, 取值参考 {@link AV_CFG_ChannelName}
	 * \endif
	 */
	public static final String CFG_CMD_CHANNELTITLE    = "ChannelTitle";

	/**
	 * \if ENGLISH_LANG
	 * ration of camera sensitivity(corresponding to CFG_LIGHTING_V2_INFO)
	 * \else
	 * 全彩相机补光灯灵敏度配置(对应结构体CFG_LIGHTING_V2_INFO)
	 * \endif
	 */
	public static final String CFG_CMD_LIGHTING_V2    = "Lighting_V2";

	/**
	 * \if ENGLISH_LANG
	 * record mode, refer to {@link AV_CFG_RecordMode}
	 * \else
	 * 录像模式, 取值参考 {@link AV_CFG_RecordMode}
	 * \endif
	 */
	public static final String	CFG_CMD_RECORDMODE	    = "RecordMode";

	/**
	 * \if ENGLISH_LANG
	 * videooutput property, refer to {@link AV_CFG_VideoOutAttr}
	 * \else
	 * 视频输出属性, 取值参考 {@link AV_CFG_VideoOutAttr}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEOOUT	    = "VideoOut";

	/**
	 * \if ENGLISH_LANG
	 * remote device info, refer to {@link AV_CFG_RemoteDevice}
	 * \else
	 * 远程设备信息(与通道无关), 取值参考 {@link AV_CFG_RemoteDevice}
	 * \endif
	 */
	public static final String CFG_CMD_REMOTEDEVICE      = "RemoteDevice";

	/**
	 * \if ENGLISH_LANG
	 * remote channel, refer to {@link AV_CFG_RemoteChannel}
	 * \else
	 * 远程通道, 取值参考 {@link AV_CFG_RemoteChannel}
	 * \endif
	 */
	public static final String CFG_CMD_REMOTECHANNEL    = "RemoteChannel";

	/**
	 * \if ENGLISH_LANG
	 * image tour config, refer to {@link AV_CFG_MonitorTour}
	 * \else
	 * 画面轮训配置, 取值参考 {@link AV_CFG_MonitorTour}
	 * \endif
	 */
	public static final String CFG_CMD_MONITORTOUR	    = "MonitorTour";

	/**
	 * \if ENGLISH_LANG
	 * image favorite config, refer to {@link AV_CFG_MonitorCollection}
	 * \else
	 * 画面收藏配置, 取值参考 {@link AV_CFG_MonitorCollection}
	 * \endif
	 */
	public static final String CFG_CMD_MONITORCOLLECTION    = "MonitorCollection";

	/**
	 * \if ENGLISH_LANG
	 * image splicing display source config (deprecated), refer to {@link AV_CFG_ChannelDisplaySource}
	 * \else
	 * 画面分割显示源配置(废除，不建议使用), 取值参考 {@link AV_CFG_ChannelDisplaySource}
	 * \endif
	 * @deprecated
	 */
	public static final String CFG_CMD_DISPLAYSOURCE    = "DisplaySource";

	/**
	 * \if ENGLISH_LANG
	 * storage group config, refer to {@link AV_CFG_Raid}
	 * \else
	 * 存储卷组配置(与 通道无关), 取值参考 {@link AV_CFG_Raid}
	 * \endif
	 */
	public static final String CFG_CMD_RAID		    = "Raid";

	/**
	 * \if ENGLISH_LANG
	 * record source config, refer to {@link AV_CFG_RecordSource}
	 * \else
	 * 录像源配置, 取值参考 {@link AV_CFG_RecordSource}
	 * \endif
	 */
	public static final String CFG_CMD_RECORDSOURCE    = "RecordSource";

	/**
	 * \if ENGLISH_LANG
	 * videoinput color config, refer to {@link AV_CFG_ChannelVideoColor}
	 * \else
	 * 视频输入颜色配置, 取值参考 {@link AV_CFG_ChannelVideoColor}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEOCOLOR	    = "VideoColor";

	/**
	 * \if ENGLISH_LANG
	 * video encoding object config, refer to {@link AV_CFG_VideoWidget}
	 * \else
	 * 视频编码物件配置, 取值参考 {@link AV_CFG_VideoWidget}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEOWIDGET	    = "VideoWidget";

	/**
	 * \if ENGLISH_LANG
	 * storage group info, refer to {@link AV_CFG_StorageGroup}
	 * \else
	 * 存储组信息(与通道无关), 取值参考 {@link AV_CFG_StorageGroup}
	 * \endif
	 */
	public static final String CFG_CMD_STORAGEGROUP    = "StorageGroup";

	/**
	 * \if ENGLISH_LANG
	 * area config, refer to {@link AV_CFG_Locales}
	 * \else
	 * 区域配置, 取值参考 {@link AV_CFG_Locales}
	 * \endif
	 */
	public static final String CFG_CMD_LOCALS		    = "Locales";

	/**
	 * \if ENGLISH_LANG
	 * language selection, refer to {@link AV_CFG_Language}
	 * \else
	 * 语言选择, 取值参考 {@link AV_CFG_Language}
	 * \endif
	 */
	public static final String CFG_CMD_LANGUAGE	    = "Language";

	/**
	 * \if ENGLISH_LANG
	 * visit address filter, refer to {@link AV_CFG_AccessFilter}
	 * \else
	 * 访问地址过滤, 取值参考 {@link AV_CFG_AccessFilter}
	 * \endif
	 */
	public static final String CFG_CMD_ACCESSFILTER    = "AccessFilter";

	/**
	 * \if ENGLISH_LANG
	 * auto maintenance, refer to {@link AV_CFG_AutoMaintain}
	 * \else
	 * 自动维护, 取值参考 {@link AV_CFG_AutoMaintain}
	 * \endif
	 */
	public static final String CFG_CMD_AUTOMAINTAIN    = "AutoMaintain";

	/**
	 * \if ENGLISH_LANG
	 * remote device event process, refer to {@link AV_CFG_RemoteEvent}
	 * \else
	 * 远程设备事件处理, 取值参考 {@link AV_CFG_RemoteEvent}
	 * \endif
	 */
	public static final String CFG_CMD_REMOTEEVENT	    = "RemoteEvent";

	/**
	 * \if ENGLISH_LANG
	 * display wall config, refer to {@link AV_CFG_MonitorWall}
	 * \else
	 * 电视墙配置(与通道无关), 取值参考 {@link AV_CFG_MonitorWall}
	 * \endif
	 */
	public static final String CFG_CMD_MONITORWALL	    = "MonitorWall";

	/**
	 * \if ENGLISH_LANG
	 * mixing screen config, refer to {@link AV_CFG_SpliceScreen}
	 * \else
	 * 融合屏配置(与通道无关), 取值参考 {@link AV_CFG_SpliceScreen}
	 * \endif
	 */
	public static final String	CFG_CMD_SPLICESCREEN    = "VideoOutputComposite";

	/**
	 * \if ENGLISH_LANG
	 * temperature alarmconfig, refer to {@link AV_CFG_TemperatureAlarm}
	 * \else
	 * 温度报警配置(与通道无关), 取值参考 {@link AV_CFG_TemperatureAlarm}
	 * \endif
	 */
	public static final String CFG_CMD_TEMPERATUREALARM    = "TemperatureAlarm";

	/**
	 * \if ENGLISH_LANG
	 * fan speed alarmconfig, refer to {@link AV_CFG_FanSpeedAlarm}
	 * \else
	 * 风扇转速报警配置(与通道无关), 取值参考 {@link AV_CFG_FanSpeedAlarm}
	 * \endif
	 */
	public static final String	CFG_CMD_FANSPEEDALARM	    = "FanSpeedAlarm";

	/**
	 * \if ENGLISH_LANG
	 * record rotate config, refer to {@link AV_CFG_RecordBackup}
	 * \else
	 * 录像回传配置(与通道无关), 取值参考 {@link AV_CFG_RecordBackup}
	 * \endif
	 */
	public static final String CFG_CMD_RECORDBACKUP	    = "RecordBackupRestore";

	/**
	 * \if ENGLISH_LANG
	 * network config, refer to {@link CFG_NETWORK_INFO}
	 * \else
	 * 网络配置, 取值参考 {@link CFG_NETWORK_INFO}
	 * \endif
	 */
	public static final String	CFG_CMD_NETWORK			      = "Network";

	/**
	 * \if ENGLISH_LANG
	 * network storage serverconfig, multi-server, refer to {@link CFG_NAS_INFO_EX}
	 * \else
	 * 网络存储服务器配置, 多服务器, 取值参考 {@link CFG_NAS_INFO_EX}
	 * \endif
	 */
	public static final String CFG_CMD_NASEX			      = "NAS";

	/**
	 * \if ENGLISH_LANG
	 * LDAP config
	 * \else
	 * LDAP配置
	 * \endif
	 */
	public static final String CFG_CMD_LDAP                  = "LDAP";

	/**
	 * \if ENGLISH_LANG
	 * active directory config
	 * \else
	 * 活动目录配置
	 * \endif
	 */
	public static final String CFG_CMD_ACTIVE_DIR            = "ActiveDirectory";

	/**
	 * \if ENGLISH_LANG
	 * Compensation light config, refer to {@link CFG_FLASH_LIGHT}
	 * \else
	 * 补光灯配置, 取值参考 {@link CFG_FLASH_LIGHT}
	 * \endif
	 */
	public static final String CFG_CMD_FLASH                 = "FlashLight";

	/**
	 * \if ENGLISH_LANG
	 * Audio analysis rule config, refer to {@link CFG_ANALYSERULES_INFO}
	 * \else
	 * 音频分析规则配置, 取值参考 {@link CFG_ANALYSERULES_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_AUDIO_ANALYSERULE     = "AudioAnalyseRule";

	/**
	 * \if ENGLISH_LANG
	 * Judicial config, refer to {@link CFG_JUDICATURE_INFO}
	 * \else
	 * 刻录配置, 取值参考 {@link CFG_JUDICATURE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_JUDICATURE            = "Judicature";

	/**
	 * \if ENGLISH_LANG
	 * Mobile load config, refer to {@link CFG_GOOD_WEIGHT_INFO}
	 * \else
	 * 车载货重配置, 取值参考 {@link CFG_GOOD_WEIGHT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_GOODS_WEIGHT	        = "CQDTSet";

	/**
	 * \if ENGLISH_LANG
	 * Input channel config, refer to {@link CFG_VIDEO_IN_INFO}
	 * \else
	 * 输入通道配置, 取值参考 {@link CFG_VIDEO_IN_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEOIN			    = "VideoIn";

	/**
	 * \if ENGLISH_LANG
	 * Write dick encode plan, refer to {@link CFG_ENCODE_PLAN_INFO}
	 * \else
	 * 刻录光盘编码计划, 取值参考 {@link CFG_ENCODE_PLAN_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ENCODEPLAN            = "EncodePlan";

	/**
	 * \if ENGLISH_LANG
	 * Judicial PIP as group, refer to {@link CFG_PICINPIC_INFO}，compatible with single config according to length
	 * \else
	 * 画中画改为数组方式, 取值参考 {@link CFG_PICINPIC_INFO} ，兼容以前单个配置，根据长度区分
	 * \endif
	 */
	public static final String CFG_CMD_PICINPIC              = "PicInPic";

	/**
	 * \if ENGLISH_LANG
	 * Write full event config, refer to {@link CFG_BURNFULL_INFO}
	 * \else
	 * 刻录满事件配置, 取值参考 {@link CFG_BURNFULL_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_BURNFULL              = "BurnFull";

	/**
	 * \if ENGLISH_LANG
	 * Main/sub global config（correspinding）
	 * \else
	 * 主从式全局配置（对应）
	 * \endif
	 */
	public static final String CFG_CMD_MASTERSLAVE_GLOBAL    = "MasterSlaveTrackerGlobal";

	/**
	 * \if ENGLISH_LANG
	 * Video analysis global config, refer to {@link CFG_ANALYSEWHOLE_INFO}
	 * \else
	 * 视频分析整体配置, 取值参考 {@link CFG_ANALYSEWHOLE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ANALYSEWHOLE    = "VideoAnalyseWhole";

	/**
	 * \if ENGLISH_LANG
	 * Video input border config, refer to {@link CFG_VIDEO_IN_BOUNDARY}
	 * \else
	 * 视频输入边界配置, 取值参考 {@link CFG_VIDEO_IN_BOUNDARY}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEO_IN_BOUNDARY    = "VideoInBoundary";

	/**
	 * \if ENGLISH_LANG
	 * TV wall scheme, refer to {@link CFG_MONITORWALL_COLLECTION}
	 * \else
	 * 电视墙预案, 取值参考 {@link CFG_MONITORWALL_COLLECTION}
	 * \endif
	 */
	public static final String	CFG_CMD_MONITORWALL_COLLECTION    = "MonitorWallCollection";

	/**
	 * \if ENGLISH_LANG
	 * Analog matrix, refer to {@link CFG_ANALOG_MATRIX_INFO}
	 * \else
	 * 模拟矩阵, 取值参考 {@link CFG_ANALOG_MATRIX_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ANALOGMATRIX	    = "AnalogMatrix";

	/**
	 * \if ENGLISH_LANG
	 * Analog matrix protocol config, refer to {@link CFG_ANALOG_MATRIX_PROTOCOL}
	 * \else
	 * 模拟矩阵协议配置, 取值参考 {@link CFG_ANALOG_MATRIX_PROTOCOL}
	 * \endif
	 */
	public static final String CFG_CMD_ANALOG_MATRIX_PROTOCOL    = "AnalogMatrixProtocol";

	/**
	 * \if ENGLISH_LANG
	 * Video output title, refer to {@link CFG_VIDEO_OUT_TITLE}
	 * \else
	 * 视频输出标题, 取值参考 {@link CFG_VIDEO_OUT_TITLE}
	 * \endif
	 */
	public static final String	CFG_CMD_VIDEO_OUT_TITLE	    = "VideoOutputTitle";

	/**
	 * \if ENGLISH_LANG
	 * Hark disk data flow alarm config, refer to {@link CFG_DISK_FLUX_INFO}
	 * \else
	 * 硬盘数据流量报警配置, 取值参考 {@link CFG_DISK_FLUX_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_DISK_FLUX_ALARM	    = "DiskFluxAlarm";

	/**
	 * \if ENGLISH_LANG
	 * Net data flow alarm config, refer to {@link CFG_NET_FLUX_INFO}
	 * \else
	 * 网络数据流量报警配置, 取值参考 {@link CFG_NET_FLUX_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_NET_FLUX_ALARM	    = "NetFluxAlarm";

	/**
	 * \if ENGLISH_LANG
	 * Net protocol config, refer to {@link CFG_DVRIP_INFO}
	 * \else
	 * 网络协议配置, 取值参考 {@link CFG_DVRIP_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_DVRIP                 = "DVRIP";

	/**
	 * \if ENGLISH_LANG
	 * and camera corresponding area config, refer to {@link CFG_PARKINGSPACE_SCREEN_INFO}(element max value is {@link SDK_PRODUCTION_DEFNITION#nMaxParkingSpaceScreen})
	 * \else
	 * 和相机对接的区域屏配置, 取值参考 {@link CFG_PARKINGSPACE_SCREEN_INFO} (元素最大值是{@link SDK_PRODUCTION_DEFNITION#nMaxParkingSpaceScreen})
	 * \endif
	 */
	public static final String CFG_CMD_PARKINGSPACE_SCREEN   = "ParkingSpaceScreen";

	/**
	 * \if ENGLISH_LANG
	 * Spot setup, refer to {@link CFG_PARKINGSPACE_STATUS_INFO}(special spot and general spot setup)(element max value is {@link SDK_PRODUCTION_DEFNITION#nMaxRoadWays})
	 * \else
	 * 车位设置, 取值参考 {@link CFG_PARKINGSPACE_STATUS_INFO} (专有车位和普通车位设置)(元素最大值是{@link SDK_PRODUCTION_DEFNITION#nMaxRoadWays})
	 * \endif
	 */
	public static final String CFG_CMD_PARKINGSPACE_STATUS   = "ParkingSpaceCellStatus";

	/**
	 * \if ENGLISH_LANG
	 * Platform info, refer to {@link CFG_CLIENT_CUSTOM_INFO}
	 * \else
	 * 平台自定义信息, 取值参考 {@link CFG_CLIENT_CUSTOM_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_CLIENT_CUSTOM_DATA    = "ClientCustomData";

	/**
	 * \if ENGLISH_LANG
	 * Writing format config, refer to {@link CFG_BURN_RECORD_FORMAT}
	 * \else
	 * 刻录格式配置, 取值参考 {@link CFG_BURN_RECORD_FORMAT}
	 * \endif
	 */
	public static final String CFG_CMD_BURN_RECORD_FORMAT    = "BurnRecordFormat";

	/**
	 * \if ENGLISH_LANG
	 * Multi disk sync write, refer to {@link CFG_MULTIBURN_INFO}, each element means one group multi-disk sync writing and calibration
	 * \else
	 * 多光盘同步刻录, 取值参考 {@link CFG_MULTIBURN_INFO} , 每一个元素表示一组多光盘同步刻录及校验
	 * \endif
	 */
	public static final String CFG_CMD_MULTIBURN             = "MultiBurn";

	/**
	 * \if ENGLISH_LANG
	 * Encode encryption config info, refer to {@link CFG_ENCODE_ENCRYPT_CHN_INFO}
	 * \else
	 * 编码加密配置信息, 取值参考 {@link CFG_ENCODE_ENCRYPT_CHN_INFO}
	 * \endif
	 */
	public static final String	CFG_CMD_ENCODE_ENCRYPT	    = "EncodeEncrypt";

	/**
	 * \if ENGLISH_LANG
	 * PTZ channel zoom config, refer to {@link CFG_VIDEO_IN_ZOOM}
	 * \else
	 * 云台通道变倍配置, 取值参考 {@link CFG_VIDEO_IN_ZOOM}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEO_IN_ZOOM         = "VideoInZoom";

	/**
	 * \if ENGLISH_LANG
	 * Snapshot config, refer to {@link CFG_SNAP_INFO}
	 * \else
	 * 抓图配置, 取值参考 {@link CFG_SNAP_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_SNAP			    = "Snap";

	/**
	 * \if ENGLISH_LANG
	 * Net storage server limit config, refer to {@link CFG_REMOTE_STORAGELIMIT_GROUP}
	 * \else
	 * 网络存储服务器限制配置, 取值参考 {@link CFG_REMOTE_STORAGELIMIT_GROUP}
	 * \endif
	 */
	public static final String CFG_CMD_REMOTE_STORAGE_LIMIT      = "RemoteStorageLimit";

	/**
	 * \if ENGLISH_LANG
	 * Special usage directory custom, refer to {@link CFG_SPECIAL_DIR_INFO}
	 * \else
	 * 特殊用途目录定义, 取值参考 {@link CFG_SPECIAL_DIR_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_SPECIAL_DIR		    = "SpecialDirectoryDefine";

	/**
	 * \if ENGLISH_LANG
	 * After shut down delay auto boot up config, refer to {@link CFG_AUTO_STARTUP_DELAY_INFO}
	 * \else
	 * 关机后延时自动开机配置, 取值参考 {@link CFG_AUTO_STARTUP_DELAY_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_AUTO_STARTUP_DELAY    = "AutoStartupDelay";

	/**
	 * \if ENGLISH_LANG
	 * focus setup, refer to {@link CFG_VIDEO_IN_FOCUS}
	 * \else
	 * 聚焦设置, 取值参考 {@link CFG_VIDEO_IN_FOCUS}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEOIN_FOCUS          = "VideoInFocus";

	/**
	 * \if ENGLISH_LANG
	 * Encode self-adaptive config, refer to {@link CFG_ENCODE_ADAPT_INFO}
	 * \else
	 * 编码自适应配置, 取值参考 {@link CFG_ENCODE_ADAPT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ENCODE_ADAPT	          = "EncodeAdapt";

	/**
	 * \if ENGLISH_LANG
	 * Video analysis config, refer to {@link CFG_VIDEO_ANALYSE_CALIBRATEAREA}
	 * \else
	 * 视频分析标定配置, 取值参考 {@link CFG_VIDEO_ANALYSE_CALIBRATEAREA}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEOANALYSE_CALIBRATE   = "VideoAnalyseCalibrate";

	/**
	 * \if ENGLISH_LANG
	 * PTZ preset config, refer to {@link PTZ_PRESET_INFO}
	 * \else
	 * 云台预置点配置, 取值参考 {@link PTZ_PRESET_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_PTZ_PRESET             = "PtzPreset";

	/**
	 * \if ENGLISH_LANG
	 * Period speed limit config, refer to {@link CFG_TIMESPEEDLIMIT_LIST}
	 * \else
	 * 时间段限速值配置, 取值参考 {@link CFG_TIMESPEEDLIMIT_LIST}
	 * \endif
	 */
	public static final String CFG_CMD_TIMESPEEDLIMIT	    = "TimeSpeedLimit";

	/**
	 * \if ENGLISH_LANG
	 * Prompt config, refer to {@link CFG_VOICEALERT_LIST}
	 * \else
	 * 语音提示配置, 取值参考 {@link CFG_VOICEALERT_LIST}
	 * \endif
	 */
	public static final String CFG_CMD_VOICEALERT		    = "VoiceAlert";

	/**
	 * \if ENGLISH_LANG
	 * Audio spirit, refer to {@link CFG_AUDIO_SPIRIT}
	 * \else
	 * 语音激励, 取值参考 {@link CFG_AUDIO_SPIRIT}
	 * \endif
	 */
	public static final String CFG_CMD_AUDIO_SPIRIT	        = "AudioSpirit";

	/**
	 * \if ENGLISH_LANG
	 * Audio matrix silence config, refer to {@link CFG_AUDIO_MATRIX_SILENCE}
	 * \else
	 * 静音矩阵配置, 取值参考 {@link CFG_AUDIO_MATRIX_SILENCE}
	 * \endif
	 */
	public static final String CFG_CMD_AUDIO_MATRIX_SILENCE = "AudioMatrixSilence";

	/**
	 * \if ENGLISH_LANG
	 * Audio matrix config, refer to {@link CFG_AUDIO_MATRIX}
	 * \else
	 * 音频矩阵配置, 取值参考 {@link CFG_AUDIO_MATRIX}
	 * \endif
	 */
	public static final String CFG_CMD_AUDIO_MATRIX         = "AudioMatrixConfig";

	/**
	 * \if ENGLISH_LANG
	 * Combine channel config, refer to {@link CFG_COMPOSE_CHANNEL}
	 * \else
	 * 合成通道配置, 取值参考 {@link CFG_COMPOSE_CHANNEL}
	 * \endif
	 */
	public static final String CFG_CMD_COMPOSE_CHANNEL	    = "ComposeChannel";

	/**
	 * \if ENGLISH_LANG
	 * Synthetic Channel Configuration, Change exhibit, refer to {@link CFG_COMPOSE_CHANNEL}
	 * \else
	 * 合成通道配置  庭审主机使用，证物切换功能, 取值参考 {@link CFG_COMPOSE_CHANNEL}
	 * \endif
	 */
	public static final String CFG_CMD_COMPOSE_LINKAGE     = "ComposeLinkage";

	/**
	 * \if ENGLISH_LANG
	 * Lower matrix config, refer to {@link CFG_LOWER_MATRIX_LIST}
	 * \else
	 * 下位矩阵配置, 取值参考 {@link CFG_LOWER_MATRIX_LIST}
	 * \endif
	 */
	public static final String CFG_CMD_LOWER_MATRIX	      = "LowerMatrix";

	/**
	 * \if ENGLISH_LANG
	 * COM configuration, refer to {@link CFG_COMMGROUP_INFO}
	 * \else
	 * 串口配置, 取值参考 {@link CFG_COMMGROUP_INFO}
	 * \endif
	 */
	public static final String  CFG_CMD_COMM              = "Comm";

	/**
	 * \if ENGLISH_LANG
	 * CAN config, refer to {@link CFG_CANFILTER_LIST}
	 * \else
	 * CAN透传配置, 取值参考 {@link CFG_CANFILTER_LIST}
	 * \endif
	 */
	public static final String  CFG_CMD_CANFILTER         = "CANFilter";

	/**
	 * \if ENGLISH_LANG
	 * Device alive config, refer to {@link CFG_DEVICEKEEPALIVELIST}
	 * \else
	 * 设备保活配置, 取值参考 {@link CFG_DEVICEKEEPALIVELIST}
	 * \endif
	 */
	public static final String  CFG_CMD_DEVICEKEEPALIVE = "DeviceKeepAlive";

	/**
	 * \if ENGLISH_LANG
	 * Infrared Panel Template, refer to {@link CFG_INFRARED_BOARD_TEMPLATE_GROUP}
	 * \else
	 * 红外面板模板, 取值参考 {@link CFG_INFRARED_BOARD_TEMPLATE_GROUP}
	 * \endif
	 */
	public static final String CFG_CMD_INFRARED_BOARD_TEMPLATE	 = "InfraredBoardTemplate";

	/**
	 * \if ENGLISH_LANG
	 * Infrared Panel Template, refer to {@link CFG_INFRARED_BOARD_GROUP}
	 * \else
	 * 红外面板模板, 取值参考 {@link CFG_INFRARED_BOARD_GROUP}
	 * \endif
	 */
	public static final String CFG_CMD_INFRARED_BOARD		 = "InfraredBoard";

	/**
	 * \if ENGLISH_LANG
	 * Exposure Settings, refer to {@link CFG_VIDEOIN_EXPOSURE_INFO}
	 * \else
	 * 曝光设置, 取值参考 {@link CFG_VIDEOIN_EXPOSURE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEOIN_EXPOSURE     = "VideoInExposure";

	/**
	 * \if ENGLISH_LANG
	 * video in back light configuration, (Corresponding {@link CFG_VIDEOIN_BACKLIGHT_INFO})
	 * \else
	 * 环境光线配置, (对应{@link CFG_VIDEOIN_BACKLIGHT_INFO})
	 * \endif
	 */
	public static final String  CFG_CMD_VIDEOIN_BACKLIGHT     =  "VideoInBacklight";

	/**
	 * \if ENGLISH_LANG
	 * Entrance Guard Basic Configuration, refer to {@link CFG_ACCESS_GENERAL_INFO}
	 * \else
	 * 门禁基本配置, 取值参考 {@link CFG_ACCESS_GENERAL_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ACCESS_GENERAL       = "AccessControlGeneral";

	/**
	 * \if ENGLISH_LANG
	 * Entrance Guard Event Configuration, refer to {@link CFG_ACCESS_EVENT_INFO}
	 * \else
	 * 门禁事件配置, 取值参考 {@link CFG_ACCESS_EVENT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ACCESS_EVENT         = "AccessControl";

	/**
	 * \if ENGLISH_LANG
	 * Wi-Fi Settings, refer to {@link CFG_WIRELESS_INFO}
	 * \else
	 * 无线网络连接设置, 取值参考 {@link CFG_WIRELESS_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_WIRELESS			 = "Wireless";

	/**
	 * \if ENGLISH_LANG
	 * Alarm Server Configuration, refer to {@link CFG_ALARMCENTER_INFO}
	 * \else
	 * 报警服务器配置, 取值参考 {@link CFG_ALARMCENTER_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ALARMSERVER			 = "AlarmServer";

	/**
	 * \if ENGLISH_LANG
	 * Alarm Global Configuration, refer to {@link CFG_COMMGLOBAL_INFO}
	 * \else
	 * 报警全局配置, 取值参考 {@link CFG_COMMGLOBAL_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_COMMGLOBAL			 = "CommGlobal";

	/**
	 * \if ENGLISH_LANG
	 * Analog Alarm Channel Configuration, refer to {@link CFG_ANALOGALARM_INFO}
	 * \else
	 * 模拟量报警通道配置, 取值参考 {@link CFG_ANALOGALARM_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ANALOGALARM			 = "AnalogAlarm";

	/**
	 * \if ENGLISH_LANG
	 * Alarm Output Channel Configuration, refer to {@link CFG_ALARMOUT_INFO}
	 * \else
	 * 报警输出通道配置, 取值参考 {@link CFG_ALARMOUT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ALARMOUT			 = "AlarmOut";

	/**
	 * \if ENGLISH_LANG
	 * Time Synchronization Server, refer to {@link CFG_NTP_INFO}
	 * \else
	 * 时间同步服务器, 取值参考 {@link CFG_NTP_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_NTP					 = "NTP";

	/**
	 * \if ENGLISH_LANG
	 * Alarm configuration, refer to {@link CFG_ALARMBELL_INFO}
	 * \else
	 * 警号配置, 取值参考 {@link CFG_ALARMBELL_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ALARMBELL			 = "AlarmBell";

	/**
	 * \if ENGLISH_LANG
	 * Mobile Related Business Configuration, refer to {@link CFG_MOBILE_INFO}
	 * \else
	 * 移动相关业务配置, 取值参考 {@link CFG_MOBILE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_MOBILE				 = "Mobile";

	/**
	 * \if ENGLISH_LANG
	 * phone event notify, refer to {@link CFG_PHONEEVENTNOTIFY_INFO}
	 * \else
	 * 电话事件提醒, 取值参考 {@link CFG_PHONEEVENTNOTIFY_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_PHONEEVENTNOTIFY	 = "PhoneEventNotify";

	/**
	 * \if ENGLISH_LANG
	 * Telephone Alarm Center Configuration, refer to {@link CFG_PSTN_ALARM_CENTER_INFO}
	 * \else
	 * 电话报警中心配置, 取值参考 {@link CFG_PSTN_ALARM_CENTER_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_PSTN_ALARM_SERVER	 = "PSTNAlarmServer";

	/**
	 * \if ENGLISH_LANG
	 * Audio Output Volume, refer to {@link CFG_AUDIO_OUTPUT_VOLUME}
	 * \else
	 * 音频输出音量, 取值参考 {@link CFG_AUDIO_OUTPUT_VOLUME}
	 * \endif
	 */
	public static final String CFG_CMD_AUDIO_OUTPUT_VOLUME	 = "AudioOutputVolume";

	/**
	 * \if ENGLISH_LANG
	 * Audio Input Volume, refer to {@link CFG_AUDIO_INPUT_VOLUME}
	 * \else
	 * 音频输入音量, 取值参考 {@link CFG_AUDIO_INPUT_VOLUME}
	 * \endif
	 */
	public static final String CFG_CMD_AUDIO_INPUT_VOLUME    = "AudioInputVolume";

	/**
	 * \if ENGLISH_LANG
	 * the light of state control，refer to{@link CFG_LIGHT_GLOBAL}
	 * \else
	 * 状态等控制，取值参考{@link CFG_LIGHT_GLOBAL}
	 * \endif
	 */
	public static final String CFG_CMD_LIGHT_GLOBAL          = "LightGlobal";

	/**
	 * \if ENGLISH_LANG
	 * Alarm Keyboard Configuration, refer to {@link CFG_ALARMKEYBOARD_INFO}
	 * \else
	 * 报警键盘配置, 取值参考 {@link CFG_ALARMKEYBOARD_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ALARMKEYBOARD		 = "AlarmKeyboard";

	/**
	 * \if ENGLISH_LANG
	 * Power Failure Configuration, refer to {@link CFG_POWERFAULT_INFO}
	 * \else
	 * 电源故障配置, 取值参考 {@link CFG_POWERFAULT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_POWERFAULT			 = "PowerFault";

	/**
	 * \if ENGLISH_LANG
	 * Chassis Intrusion Alarm, refer to {@link CFG_CHASSISINTRUSION_INFO}
	 * \else
	 * 机箱入侵报警(防拆报警)配置, 取值参考 {@link CFG_CHASSISINTRUSION_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_CHASSISINTRUSION	 = "ChassisIntrusion";

	/**
	 * \if ENGLISH_LANG
	 * Extension Alarm Box Configuration, refer to {@link CFG_EXALARMBOX_INFO}
	 * \else
	 * 扩展报警盒配置 , 取值参考 {@link CFG_EXALARMBOX_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_EXALARMBOX			 = "ExAlarmBox";

	/**
	 * \if ENGLISH_LANG
	 * Extension Alarm Output Configuration, refer to {@link CFG_EXALARMOUTPUT_INFO}
	 * \else
	 * 扩展报警输出配置, 取值参考 {@link CFG_EXALARMOUTPUT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_EXALARMOUTPUT		 = "ExAlarmOut";

	/**
	 * \if ENGLISH_LANG
	 * Extension Alarm Input Configuration, refer to {@link CFG_EXALARMINPUT_INFO}
	 * \else
	 * 扩展报警输入配置, 取值参考 {@link CFG_EXALARMINPUT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_EXALARMINPUT		 = "ExAlarm";

	/**
	 * \if ENGLISH_LANG
	 * Entrance Guard Card Period of Time, refer to {@link CFG_ACCESS_TIMESCHEDULE_INFO}
	 * \else
	 * 门禁刷卡时间段, 取值参考 {@link CFG_ACCESS_TIMESCHEDULE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ACCESSTIMESCHEDULE	 = "AccessTimeSchedule";

	/**
	 * \if ENGLISH_LANG
	 * Emergency Configuration, refer to {@link CFG_URGENCY_INFO}
	 * \else
	 * 紧急事件配置, 取值参考 {@link CFG_URGENCY_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_URGENCY				 = "Emergency";

	/**
	 * \if ENGLISH_LANG
	 * The Sensor Sampling, refer to {@link CFG_SENSORSAMPLING_INFO}
	 * \else
	 * 传感器采样, 取值参考 {@link CFG_SENSORSAMPLING_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_SENSORSAMPLING		 = "SensorSampling";

	/**
	 * \if ENGLISH_LANG
	 * Ring Network Configuration, refer to {@link CFG_STP_INFO}
	 * \else
	 * 环网配置, 取值参考 {@link CFG_STP_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_STP					 = "STP";

	/**
	 * \if ENGLISH_LANG
	 * Alarm SubConfig, refer to {@link CFG_ALARM_SUBSYSTEM_INFO}
	 * \else
	 * 报警子系统配置, 取值参考 {@link CFG_ALARM_SUBSYSTEM_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ALARM_SUBSYSTEM		 = "AlarmSubSystem";

	/**
	 * \if ENGLISH_LANG
	 * Battery Power Min Config, refer to {@link CFG_BATTERY_LOW_POWER_INFO}
	 * \else
	 * 电池电量低配置, 取值参考 {@link CFG_BATTERY_LOW_POWER_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_BATTERY_LOW_POWER	 = "BatteryLowPowerAlarm";

	/**
	 * \if ENGLISH_LANG
	 * Snapshot Channel Activation External Config, refer to {@link CFG_SNAPLINKAGE_INFO}
	 * \else
	 * 抓图通道联动外设配置, 取值参考 {@link CFG_SNAPLINKAGE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_SNAPLIKAGE           = "SnapLinkage";

	/**
	 * \if ENGLISH_LANG
	 * Audio Input Config, refer to {@link CFG_AUDIO_INPUT}
	 * \else
	 * 音频输入配置, 取值参考 {@link CFG_AUDIO_INPUT}
	 * \endif
	 */
	public static final String CFG_CMD_AUDIOINPUT           = "AudioInput";

	/**
	 * \if ENGLISH_LANG
	 * Mail Sending Config, refer to {@link CFG_EMAIL_INFO}
	 * \else
	 * 邮件发送配置, 取值参考 {@link CFG_EMAIL_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_EMAIL				 = "Email";

	/**
	 * \if ENGLISH_LANG
	 * Send Offline File Config, refer to {@link TRAFFIC_TRANSFER_OFFLINE_INFO}
	 * \else
	 * 传输离线文件配置, 取值参考 {@link TRAFFIC_TRANSFER_OFFLINE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_TRAFFIC_TRANSFER_OFFLINE  = "TrafficTransferOffline";

	/**
	 * \if ENGLISH_LANG
	 * Order serial data config, refer to {@link CFG_DEVCOMM_SUBSCRIBE}
	 * \else
	 * 订阅串口数据配置, 取值参考 {@link CFG_DEVCOMM_SUBSCRIBE}
	 * \endif
	 */
	public static final String CFG_CMD_COMMSUBSCRIBE		 = "CommSubscribe";

	/**
	 * \if ENGLISH_LANG
	 * Vehicle status corresponding spot indicator, refer to {@link CFG_PARKINGSPACE_LIGHT_STATE}
	 * \else
	 * 车位状态对应的车位指示灯, 取值参考 {@link CFG_PARKINGSPACE_LIGHT_STATE}
	 * \endif
	 */
	public static final String CFG_CMD_PARKINGSPACE_LIGHT_STATE  = "ParkingSpaceLightState";

	/**
	 * \if ENGLISH_LANG
	 * Air conditioner device config, refer to {@link CFG_AIRCONDITION_INFO}
	 * \else
	 * 空调设备配置, 取值参考 {@link CFG_AIRCONDITION_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_AIRCONDITION		 = "AirCondition";

	/**
	 * \if ENGLISH_LANG
	 * Compression playback config, refer to {@link CFG_COMPRESS_PLAY_INFO}
	 * \else
	 * 压缩回放配置, 取值参考 {@link CFG_COMPRESS_PLAY_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_COMPRESS_PLAY        = "CompressPlay";

	/**
	 * \if ENGLISH_LANG
	 * VTO floor config, refer to {@link CFG_BUILDING_INFO}
	 * \else
	 * VTO楼层配置, 取值参考 {@link CFG_BUILDING_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_BUILDING             = "Building";

	/**
	 * \if ENGLISH_LANG
	 * VTO floor expansion config, refer to {@link CFG_BUILDING_EXTERNAL_INFO}
	 * \else
	 * VTO楼层扩展配置, 取值参考 {@link CFG_BUILDING_EXTERNAL_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_BUILDING_EXTERNAL    = "BuildingExternal";

	/**
	 * \if ENGLISH_LANG
	 * Dial rule, refer to {@link CFG_DIALRULE_INFO}
	 * \else
	 * 拨号规则, 取值参考 {@link CFG_DIALRULE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_DIALRULE             = "DialRule";

	/**
	 * \if ENGLISH_LANG
	 * Vehicle tank config, refer to {@link CFG_OIL_MASS_INFO}
	 * \else
	 * 车辆油箱配置, 取值参考 {@link CFG_OIL_MASS_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_OIL_MASS_INFO        = "OilMassInfo";

	/**
	 * \if ENGLISH_LANG
	 * Fish eye detailed info config, refer to {@link CFG_FISHEYE_DETAIL_INFO}
	 * \else
	 * 鱼眼详细信息配置, 取值参考 {@link CFG_FISHEYE_DETAIL_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_FISHEYE_INFO         = "FishEye";

	/**
	 * \if ENGLISH_LANG
	 * Platform issues call no-response transfer config list, refer to {@link CFG_VT_NOANSWER_FORWARD_INFO}
	 * \else
	 * 平台下发呼叫无应答转移配置列表, 取值参考 {@link CFG_VT_NOANSWER_FORWARD_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VTNOANSWER_FORWARD   = "VTNoAnswerForward";

	/**
	 * \if ENGLISH_LANG
	 * VTO call config, refer to {@link CFG_VTO_CALL_INFO}
	 * \else
	 * VTO呼叫配置, 取值参考 {@link CFG_VTO_CALL_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VTO_CALL             = "VTOCall";

	/**
	 * \if ENGLISH_LANG
	 * MAC conflict alarm config, refer to {@link CFG_MACCONFLICT_INFO}
	 * \else
	 * MAC冲突报警配置, 取值参考 {@link CFG_MACCONFLICT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_MACCONFLICT          = "MacConflict";

	/**
	 * \if ENGLISH_LANG
	 * Idle config, refer to {@link CFG_IDLE_MOTION_INFO}
	 * \else
	 * 空闲动作配置, 取值参考 {@link CFG_IDLE_MOTION_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_IDLEMOTION_INFO      = "IdleMotion";

	/**
	 * \if ENGLISH_LANG
	 * TV wall scheme tour config, refer to {@link CFG_MONITORWALL_COLLECTION_TOUR_INFO}
	 * \else
	 * 电视墙预案轮巡配置, 取值参考 {@link CFG_MONITORWALL_COLLECTION_TOUR_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_MONITORWALL_COLL_TOUR  = "MonitorWallCollectionTour";

	/**
	 * \if ENGLISH_LANG
	 * PSTN offline event config, refer to {@link CFG_PSTN_BREAK_LINE_INFO}
	 * \else
	 * PSTN断线事件配置, 取值参考 {@link CFG_PSTN_BREAK_LINE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_PSTN_BREAK_LINE      = "PSTNBreakLine";

	/**
	 * \if ENGLISH_LANG
	 * Network capture device config, refer to {@link CFG_NET_COLLECTION_INFO}
	 * \else
	 * 网络采集设备配置, 取值参考 {@link CFG_NET_COLLECTION_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_NET_COLLECTION       = "NetCollection";

	/**
	 * \if ENGLISH_LANG
	 * Virtual Slot node detailed physical device corresponding relation, refer to {@link CFG_ALARM_SLOT_BOND_INFO}
	 * \else
	 * 虚拟Slot节点与具体物理设备的对应关系, 取值参考 {@link CFG_ALARM_SLOT_BOND_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ALARM_SLOT_BOND      = "AlarmSlotBond";

	/**
	 * \if ENGLISH_LANG
	 * Gateway config, refer to {@link CFG_TRAFFICSTROBE_INFO}
	 * \else
	 * 道闸配置, 取值参考 {@link CFG_TRAFFICSTROBE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_TRAFFICSTROBE        = "TrafficStrobe";

	/**
	 * \if ENGLISH_LANG
	 * Intelligent traffic audio report config, refer to {@link CFG_TRAFFICVOICE_BROADCAST}
	 * \else
	 * 智能交通语音播报配置, 取值参考 {@link CFG_TRAFFICVOICE_BROADCAST}
	 * \endif
	 */
	public static final String CFG_CMD_TRAFFICVOICE         = "TrafficVoiceBroadcast";

	/**
	 * \if ENGLISH_LANG
	 * Oarking time config, refer to {@link CFG_STANDING_TIME_INFO}
	 * \else
	 * 停车时间配置, 取值参考 {@link CFG_STANDING_TIME_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_STANDING_TIME        = "StandingTime";

	/**
	 * \if ENGLISH_LANG
	 * E-fence alarm period config, refer to {@link CFG_ENCLOSURE_TIME_SCHEDULE_INFO}
	 * \else
	 * 电子围栏报警时间段配置, 取值参考 {@link CFG_ENCLOSURE_TIME_SCHEDULE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ENCLOSURE_TIME_SCHEDULE   = "EnclosureTimeSchedule";

	/**
	 * \if ENGLISH_LANG
	 * Parking lot entrance/exit controller config, refer to {@link CFG_ECKCONFIG_INFO}
	 * \else
	 * 停车场出入口控制器配置, 取值参考 {@link CFG_ECKCONFIG_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ECKCONFIG			 = "ECKConfig";

	/**
	 * \if ENGLISH_LANG
	 * Parking lot entrance/exit swiping card alarm event config, refer to {@link CFG_PARKING_CARD_INFO}
	 * \else
	 * 停车场出入口刷卡报警事件配置, 取值参考 {@link CFG_PARKING_CARD_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_PARKING_CARD         = "ParkingCard";

	/**
	 * \if ENGLISH_LANG
	 * Emergency call alarm event config, refer to {@link CFG_RCEMERGENCY_CALL_INFO}
	 * \else
	 * 紧急呼叫报警事件配置, 取值参考 {@link CFG_RCEMERGENCY_CALL_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_RCEMERGENCY_CALL      = "RCEmergencyCall";

	/**
	 * \if ENGLISH_LANG
	 * Lane info report config, refer to {@link CFG_LANES_STATE_REPORT}
	 * \else
	 * 车道信息上报配置, 取值参考 {@link CFG_LANES_STATE_REPORT}
	 * \endif
	 */
	public static final String CFG_CMD_LANES_STATE_REPORT    = "LanesStateReport";

	/**
	 * \if ENGLISH_LANG
	 * Multiple people multi-door combination config, refer to {@link CFG_OPEN_DOOR_GROUP_INFO}
	 * \else
	 * 多人多开门方式组合配置, 取值参考 {@link CFG_OPEN_DOOR_GROUP_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_OPEN_DOOR_GROUP      = "OpenDoorGroup";

	/**
	 * \if ENGLISH_LANG
	 * Unlock path collection or anti-passby path config, refer to {@link CFG_OPEN_DOOR_ROUTE_INFO}
	 * \else
	 * 开门路线集合，或称防反潜路线配置, 取值参考 {@link CFG_OPEN_DOOR_ROUTE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_OPEN_DOOR_ROUTE      = "OpenDoorRoute";

	/**
	 * \if ENGLISH_LANG
	 * Burning plan config, refer to {@link CFG_BURNPLAN_INFO}
	 * \else
	 * 刻录计划配置, 取值参考 {@link CFG_BURNPLAN_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_BURNPLAN             = "BurnPlan";

	/**
	 * \if ENGLISH_LANG
	 * Detect collection device config, refer to {@link CFG_SCADA_DEV_INFO}
	 * \else
	 * 检测采集设备配置, 取值参考 {@link CFG_SCADA_DEV_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_SCADA_DEV            = "SCADADev";

	/**
	 * \if ENGLISH_LANG
	 * Public security 1 platform input config, refer to {@link CFG_VSP_GAYS_INFO}
	 * \else
	 * 平台接入配置, 取值参考 {@link CFG_VSP_GAYS_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VSP_GAYS             = "VSP_GAYS";

	/**
	 * \if ENGLISH_LANG
	 * Audio detection alarm config, refer to {@link CFG_AUDIO_DETECT_INFO}
	 * \else
	 * 音频检测报警配置, 取值参考 {@link CFG_AUDIO_DETECT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_AUDIODETECT          = "AudioDetect";

	/**
	 * \if ENGLISH_LANG
	 * Guide screen config, refer to {@link CFG_GUIDESCREEN_INFO}
	 * \else
	 * 诱导屏系统配置, 取值参考 {@link CFG_GUIDESCREEN_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_GUIDESCREEN          = "GuideScreen";

	/**
	 * \if ENGLISH_LANG
	 * VTS call config, refer to {@link CFG_VTS_CALL_INFO}
	 * \else
	 * VTS呼叫配置, 取值参考 {@link CFG_VTS_CALL_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VTS_CALL_INFO        = "VTSCallInfo";

	/**
	 * \if ENGLISH_LANG
	 * The list of device config, refer to {@link CFG_DEV_LIST_INFO}
	 * \else
	 * 设备列表配置, 取值参考 {@link CFG_DEV_LIST_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_DEV_LIST             = "DevList";

	/**
	 * \if ENGLISH_LANG
	 * Calibrate matrix config info, refer to {@link CFG_CALIBRATE_MATRIX_INFO}
	 * \else
	 * 主从式跟踪器标定矩阵配置, 取值参考 {@link CFG_CALIBRATE_MATRIX_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_CALIBRATE_MATRIX     = "CalibrateMatrix";

	/**
	 * \if ENGLISH_LANG
	 * Defence area delay config, refer to {@link CFG_DEFENCE_AREA_DELAY_INFO}
	 * \else
	 * 防区延时配置, 取值参考 {@link CFG_DEFENCE_AREA_DELAY_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_DEFENCE_AREA_DELAY   = "DefenceAreaDelay";

	/**
	 * \if ENGLISH_LANG
	 * Thermal imaging camera property config, refer to {@link CFG_THERMOGRAPHY_INFO}
	 * \else
	 * 热成像摄像头属性配置, 取值参考 {@link CFG_THERMOGRAPHY_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_THERMO_GRAPHY		         = "ThermographyOptions";

	/**
	 * \if ENGLISH_LANG
	 * Thermal imaging ARGtemp_meas rule config, refer to {@link CFG_RADIOMETRY_RULE_INFO}
	 * \else
	 * 热成像测温规则配置, 取值参考 {@link CFG_RADIOMETRY_RULE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_THERMOMETRY_RULE	         = "ThermometryRule";

	/**
	 * \if ENGLISH_LANG
	 * Temperature statistics config, refer to {@link CFG_TEMP_STATISTICS_INFO}
	 * \else
	 * 温度统计配置, 取值参考 {@link CFG_TEMP_STATISTICS_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_TEMP_STATISTICS		     = "TemperatureStatistics";

	/**
	 * \if ENGLISH_LANG
	 * Thermal imaging ARGtemp_meas global config, refer to {@link CFG_THERMOMETRY_INFO}
	 * \else
	 * 热成像测温全局配置, 取值参考 {@link CFG_THERMOMETRY_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_THERMOMETRY			     = "HeatImagingThermometry";

	/**
	 * \if ENGLISH_LANG
	 * Thermal imaging flat field correction config, refer to {@link CFG_FLAT_FIELD_CORRECTION_INFO}
	 * \else
	 * 热成像平场聚焦校准配置, 取值参考 {@link CFG_FLAT_FIELD_CORRECTION_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_FLAT_FIELD_CORRECTION        = "FlatFieldCorrection";

	/**
	 * \if ENGLISH_LANG
	 * Thermal imaging local contrast enhancement config, refer to {@link CFG_LCE_STATE_INFO}
	 * \else
	 * 热成像自研机芯中摄像头属性的局部对比度增强配置, 取值参考 {@link CFG_LCE_STATE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_LCE_STATE                    = "LCEState";

	/**
	 * \if ENGLISH_LANG
	 * Configuration of lighting, refer to {@link CFG_LIGHTING_INFO}
	 * \else
	 * 灯光设置, 取值参考 {@link CFG_LIGHTING_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_LIGHTING                    = "Lighting";

	/**
	 * \if ENGLISH_LANG
	 * configuration of IOT infrared detection, refer to {@link CFG_IOT_INFRARED_DETECT_INFO}
	 * \else
	 * 物联网红外检测配置, 取值参考 {@link CFG_IOT_INFRARED_DETECT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_IOT_INFRARED_DETECT		 = "IOT_InfraredDetect";

	/**
	 * \if ENGLISH_LANG
	 * configuration of IOT record handle, refer to {@link CFG_IOT_RECORD_HANDLE_INFO}
	 * \else
	 * 物联网录像联动配置, 取值参考 {@link CFG_IOT_RECORD_HANDLE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_IOT_RECORD_HANDLE			 = "IOT_RecordHandle";

	/**
	 * \if ENGLISH_LANG
	 * configuration of IOT snap handle, refer to {@link CFG_IOT_SNAP_HANDLE_INFO}
	 * \else
	 * 物联网抓图联动配置, 取值参考 {@link CFG_IOT_SNAP_HANDLE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_IOT_SNAP_HANDLE			 = "IOT_SnapHandle";

	/**
	 * \if ENGLISH_LANG
	 * configuration of door bell sound, refer to {@link CFG_DOOR_BELLSOUND_INFO}
	 * \else
	 * 门铃配置, 取值参考 {@link CFG_DOOR_BELLSOUND_INFO}
	 * \endif
	 */
	public static final String CFD_CMD_DOORBELLSOUND               = "DoorBellSound";

	/**
	 * \if ENGLISH_LANG
	 * Rain brush mode, refer to {@link CFG_RAINBRUSHMODE_INFO}
	 * \else
	 * 雨刷模式相关配置, 取值参考 {@link CFG_RAINBRUSHMODE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_RAINBRUSHMODE               = "RainBrushMode";

	/**
	 * \if ENGLISH_LANG
	 * Lighting Schedule, refer to {@link CFG_LIGHTINGSCHEDULE_INFO}
	 * \else
	 * 灯光计划配, 取值参考 {@link CFG_LIGHTINGSCHEDULE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_LIGHTINGSCHEDULE            = "LightingS chedule";

	/**
	 * \if ENGLISH_LANG
	 * Emergency record for pull when there is someting wrong with pulling, refer to {@link CFG_EMERGENCY_RECORD_FOR_PULL_INFO}
	 * \else
	 * 紧急录像存储配置, 取值参考 {@link CFG_EMERGENCY_RECORD_FOR_PULL_INFO} ，用于客户端主动拉的方式。在客户端拉流存储异常之后，进行紧急录像存储
	 * \endif
	 */
	public static final String CFG_CMD_EMERGENCY_RECORD_FOR_PULL   = "EmergencyRecordForPull";

	/**
	 * \if ENGLISH_LANG
	 * Alarm shield rule, refer to {@link CFG_ALARM_SHIELD_RULE_INFO}
	 * \else
	 * 告警屏蔽规则, 取值参考 {@link CFG_ALARM_SHIELD_RULE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ALARM_SHIELD_RULE           = "AlarmShieldRule";

	/**
	 * \if ENGLISH_LANG
	 * Video in analyse rule, refer to {@link CFG_VIDEOIN_ANALYSE_RULE_INFO}
	 * \else
	 * 视频通道智能规则配置, 取值参考 {@link CFG_VIDEOIN_ANALYSE_RULE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEOIN_ANALYSERULE         = "VideoInAnalyseRule";

	/**
	 * \if ENGLISH_LANG
	 * Access work mode, refer to {@link CFG_ACCESS_WORK_MODE_INFO}
	 * \else
	 * 门锁工作模式(对应  数组), 取值参考 {@link CFG_ACCESS_WORK_MODE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_ACCESS_WORK_MODE            = "AccessWorkMode";

	/**
	 * \if ENGLISH_LANG
	 * Video talk call general config, refer to {@link CFG_VIDEO_TALK_PHONE_GENERAL}
	 * \else
	 * 视频对讲电话通用配置, 取值参考 {@link CFG_VIDEO_TALK_PHONE_GENERAL}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEO_TALK_PHONE_GENERAL    = "VideoTalkPhoneGeneral";

	/**
	 * \if ENGLISH_LANG
	 * Snapshot combination config, refer to {@link CFG_TRAFFIC_SNAP_MOSAIC_INFO}
	 * \else
	 * 抓图合成配置, 取值参考 {@link CFG_TRAFFIC_SNAP_MOSAIC_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_TRAFFIC_SNAP_MOSAIC         = "TrafficSnapMosaic";

	/**
	 * \if ENGLISH_LANG
	 * Scene snapshot setup, refer to {@link CFG_SCENE_SNAPSHOT_RULE_INFO}
	 * \else
	 * 场景抓拍设置, 取值参考 {@link CFG_SCENE_SNAPSHOT_RULE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_SCENE_SNAP_RULE             = "SceneSnapShotWithRule";

	/**
	 * \if ENGLISH_LANG
	 * TZ patrol path config, refer to {@link CFG_PTZTOUR_INFO}
	 * \else
	 * 云台巡航路径配置, 取值参考 {@link CFG_PTZTOUR_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_PTZTOUR                     = "PtzTour";

	/**
	 * \if ENGLISH_LANG
	 * VTO config, refer to {@link CFG_VTO_LIST}
	 * \else
	 * 门口机配置, 取值参考 {@link CFG_VTO_LIST}
	 * \endif
	 */
	public static final String CFG_CMD_VTO_INFO		            = "VTOInfo";

	/**
	 * \if ENGLISH_LANG
	 * Touch screen calibration config, refer to {@link CFG_TSPOINT_INFO}
	 * \else
	 * 触摸屏校准配置, 取值参考 {@link CFG_TSPOINT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_TS_POINT                    = "TSPoint";

	/**
	 * \if ENGLISH_LANG
	 * VTH no. info, refer to {@link CFG_VTH_NUMBER_INFO}
	 * \else
	 * 室内机号码信息, 取值参考 {@link CFG_VTH_NUMBER_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VTH_NUMBER_INFO             = "VTHNumberInfo";

	/**
	 * \if ENGLISH_LANG
	 * GPS config, refer to {@link CFG_GPS_INFO_ALL}
	 * \else
	 * GPS配置, 取值参考 {@link CFG_GPS_INFO_ALL}
	 * \endif
	 */
	public static final String CFG_CMD_GPS                         = "GPS";

	/**
	 * \if ENGLISH_LANG
	 * VTO basic info, refer to {@link CFG_VTO_BASIC_INFO}
	 * \else
	 * VTO基本信息, 取值参考 {@link CFG_VTO_BASIC_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VTO_BASIC_INFO		        = "VTOBasicInfo";

	/**
	 * \if ENGLISH_LANG
	 * Quick no. config, refer to {@link CFG_SHORTCUT_CALL_INFO}
	 * \else
	 * 快捷号配置, 取值参考 {@link CFG_SHORTCUT_CALL_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_SHORTCUT_CALL		        = "ShortcutCall";

	/**
	 * \if ENGLISH_LANG
	 * Record GPSLocation  version no., refer to {@link CFG_LOCATION_VER_INFO}
	 * \else
	 * 记录集GPSLocation的版本号, 取值参考 {@link CFG_LOCATION_VER_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_GPS_LOCATION_VER            = "GPSLocationVersion";

	/**
	 * \if ENGLISH_LANG
	 * Access filter, refer to {@link CFG_PARKING_SPACE_ACCESS_FILTER_INFO}
	 * \else
	 * 设备可访问地址过滤配置, 取值参考 {@link CFG_PARKING_SPACE_ACCESS_FILTER_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_PARKING_SPACE_ACCESS_FILTER = "ParkingSpaceAccessFilter";

	/**
	 * \if ENGLISH_LANG
	 * work time config, refer to {@link CFG_WORK_TIME_INFO}
	 * \else
	 * 工作时间配置, 取值参考 {@link CFG_WORK_TIME_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_WORK_TIME                   = "WorkTime";

	/**
	 * \if ENGLISH_LANG
	 * Parking Space Light Group config, refer to {@link CFG_PARKING_SPACE_LIGHT_GROUP_INFO_ALL}
	 * \else
	 * 车位指示灯本机配置, 取值参考 {@link CFG_PARKING_SPACE_LIGHT_GROUP_INFO_ALL}
	 * \endif
	 */
	public static final String CFG_CMD_PARKING_SPACE_LIGHT_GROUP   = "ParkingSpaceLightGroup";

	/**
	 * \if ENGLISH_LANG
	 * Custom audio, refer to {@link CFG_CUSTOM_AUDIO}
	 * \else
	 * 自定义音频配置, 取值参考 {@link CFG_CUSTOM_AUDIO}
	 * \endif
	 */
	public static final String CFG_CMD_CUSTOM_AUDIO                = "CustomAudio";

	/**
	 * \if ENGLISH_LANG
	 * configuration of search wifi device, refer to {@link CFG_WIFI_SEARCH_INFO}
	 * \else
	 * 设备通过wifi模块扫描周围无线设备配置, 取值参考 {@link CFG_WIFI_SEARCH_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_WIFI_SEARCH                 = "AroudWifiSearch";

	/**
	 * \if ENGLISH_LANG
	 * vehicle-mounted communication module 3G/4G auto change, refer to {@link CFG_G3G4AUTOCHANGE}
	 * \else
	 * 车载设备通信模块3G 4G自动切换, 取值参考 {@link CFG_G3G4AUTOCHANGE}
	 * \endif
	 */
	public static final String CFG_CMD_G3G4AUTOCHANGE              = "G3G4AutoChange";

	/**
	 * \if ENGLISH_LANG
	 * POS checkcode, refer to {@link CFG_CHECKCODE_INFO}
	 * \else
	 * 刷卡机校验码校验配置, 取值参考 {@link CFG_CHECKCODE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_CHECKCODE                   = "CheckCode";

	/**
	 * \if ENGLISH_LANG
	 * configuration of Sichuan Mobile keep an eye on shop, refer to {@link CFG_VSP_SCYDKD_INFO}
	 * \else
	 * 平台接入配置, 取值参考 {@link CFG_VSP_SCYDKD_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VSP_SCYDKD                  = "VSP_SCYDKD";

	/**
	 * \if ENGLISH_LANG
	 * day/night color change config, refer to {@link CFG_VIDEOIN_DAYNIGHT_INFO}
	 * \else
	 * 球机机芯日夜配置, 取值参考 {@link CFG_VIDEOIN_DAYNIGHT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEOIN_DAYNIGHT           = "VideoInDayNight";

	/**
	 * \if ENGLISH_LANG
	 * ptz power up action config, refer to {@link CFG_PTZ_POWERUP_INFO}
	 * \else
	 * 云台开机动作设置, 取值参考 {@link CFG_PTZ_POWERUP_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_PTZ_POWERUP                = "PowerUp";

	/**
	 * \if ENGLISH_LANG
	 * configuration of audio mix channel, refer to {@link CFG_AUDIO_MIX_CHANNEL_INFO_ALL}
	 * \else
	 * 配置定义每个纯音频通道的组成, 取值参考 {@link CFG_AUDIO_MIX_CHANNEL_INFO_ALL}
	 * \endif
	 */
	public static final String CFG_CMD_AUDIO_MIX_CHANNEL          = "AudioMixChannel";

	/**
	 * \if ENGLISH_LANG
	 * configuration of audio pitch,change pitch, refer to {@link CFG_AUDIO_TOUCH_INFO_ALL}
	 * \else
	 * 变音，对音调进行变化, 取值参考 {@link CFG_AUDIO_TOUCH_INFO_ALL}
	 * \endif
	 */
	public static final String CFG_CMD_AUDIO_TOUCH                = "AudioTouch";

	/**
	 * \if ENGLISH_LANG
	 * configuration of video mosaic, refer to {@link CFG_VIDEO_MOSAIC_INFO}
	 * \else
	 * 马赛克叠加配置, 取值参考 {@link CFG_VIDEO_MOSAIC_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEO_MOSAIC				= "VideoMosaic";

	/**
	 * \if ENGLISH_LANG
	 * configuration of VTH's remote IPC, refer to {@link CFG_VTH_REMOTE_IPC_INFO}
	 * \else
	 * VTH中远程IPC配置, 取值参考 {@link CFG_VTH_REMOTE_IPC_INFO} ，该配置是全局的，不区分通道
	 * \endif
	 */
	public static final String CFG_CMD_VTH_REMOTE_IPC_INFO        = "VTHRemoteIPCInfo";

	/**
	 * \if ENGLISH_LANG
	 * unFocusDetect alarm setup, refer to {@link CFG_UNFOCUSDETECT_INFO}
	 * \else
	 * 虚焦检测配置, 取值参考 {@link CFG_UNFOCUSDETECT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_UNFOCUSDETECT              = "UnFocusDetect";

	/**
	 * \if ENGLISH_LANG
	 * configuration of scene moved detect, refer to {@link CFG_MOVE_DETECT_INFO}
	 * \else
	 * 场景变更检测配置, 取值参考 {@link CFG_MOVE_DETECT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_MOVE_DETECT				= "MovedDetect";

	/**
	 * \if ENGLISH_LANG
	 * configuration of protection flood light, refer to {@link CFG_FLOODLIGHT_CONTROLMODE_INFO}
	 * \else
	 * 防护舱照明灯控制配置, 取值参考 {@link CFG_FLOODLIGHT_CONTROLMODE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_FLOODLIGHT                 = "Floodlight";

	/**
	 * \if ENGLISH_LANG
	 * configuration of protection airfan, refer to {@link CFG_AIRFAN_CONTROLMODE_INFO}
	 * \else
	 * 防护舱风扇控制配置, 取值参考 {@link CFG_AIRFAN_CONTROLMODE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_AIRFAN                     = "AirFan";

	/**
	 * \if ENGLISH_LANG
	 * configuration of WLAN, refer to {@link CFG_NETAPP_WLAN}
	 * \else
	 * WLAN配置, 取值参考 {@link CFG_NETAPP_WLAN}
	 * \endif
	 */
	public static final String CFG_CMD_WLAN                       = "WLan";

	/**
	 * \if ENGLISH_LANG
	 * Smart H264 code, refer to {@link CFG_SMART_ENCODE_INFO}
	 * \else
	 * Smart H264编码方式, 取值参考 {@link CFG_SMART_ENCODE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_SMART_ENCODE				= "SmartEncode";

	/**
	 * \if ENGLISH_LANG
	 * Course channel bind, refer to {@link CFG_COURSE_CHANNELBIND_INFO}
	 * \else
	 * 录播主机通道绑定关系配置, 取值参考 {@link CFG_COURSE_CHANNELBIND_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_COURSE_CHANNELBIND         = "CourseChannelBind";

	/**
	 * \if ENGLISH_LANG
	 * extend configuration of VTO call information, refer to {@link CFG_VTO_CALL_INFO_EXTEND}
	 * \else
	 * VTO呼叫配置扩展, 取值参考 {@link CFG_VTO_CALL_INFO_EXTEND}
	 * \endif
	 */
	public static final String CFD_CMD_VTO_CALL_INFO_EXTEND       = "VTOCallInfo";

	/**
	 * \if ENGLISH_LANG
	 * configuration of https server, refer to {@link CFG_HTTPS_INFO}
	 * \else
	 * Https服务配置, 取值参考 {@link CFG_HTTPS_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_HTTPS						= "Https";

	/**
	 * \if ENGLISH_LANG
	 * configuration of net auto adapt, refer to {@link CFG_NET_AUTO_ADAPT_ENCODE}
	 * \else
	 * 网络自适应编码配置, 取值参考 {@link CFG_NET_AUTO_ADAPT_ENCODE}
	 * \endif
	 */
	public static final String CFG_CMD_NETAUTOADAPTORENCODE		= "NetAutoAdaptEncode";

	/**
	 * \if ENGLISH_LANG
	 * configuration of the AOIAppConfig, refer to {@link CFG_AIO_APP_CONFIG_INFO}
	 * \else
	 * AIOAppConfig参数设置, 取值参考 {@link CFG_AIO_APP_CONFIG_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_AIO_APP_CONFIG				= "AIOAppConfig";

	/**
	 * \if ENGLISH_LANG
	 * configuration of App Event Language, refer to {@link CFG_APP_EVENT_LANGUAGE_INFO}
	 * \else
	 * 手机推送消息的翻译目标语言配置, 取值参考 {@link CFG_APP_EVENT_LANGUAGE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_APP_EVENT_LANGUAGE			= "AppEventLanguage";

	/**
	 * \if ENGLISH_LANG
	 * configuration of Dropbox Token( corresponding to {@link CFG_DROPBOXTOKEN_INFO})
	 * \else
	 *  Dropbox Token 配置( 对应结构体 {@link CFG_DROPBOXTOKEN_INFO})
	 * \endif
	 */
	public static final String CFG_CMD_DROPBOXTOKEN                = "DropBoxToken";

	/**
	 * \if ENGLISH_LANG
	 * configuration of Video Talk Phone Basic( corresponding to {@link CFG_VIDEO_TALK_PHONE_BASIC_INFO})
	 * \else
	 * 视频对讲电话基础配置, ( 对应结构体 {@link CFG_VIDEO_TALK_PHONE_BASIC_INFO})
	 * \endif
	 */
	public static final String CFG_CMD_VIDEO_TALK_PHONE_BASIC                = "VideoTalkPhoneBasic";

	/**
	 * \if ENGLISH_LANG
	 * configuration of UPnP( corresponding to {@link CFG_UPNP_INFO})
	 * \else
	 * UPnP配置, ( 对应结构体 {@link CFG_UPNP_INFO})
	 * \endif
	 */
	public static final String CFG_CMD_UPNP                = "UPnP";


	/***********************************************************************************************
	 **                 能力集命令  对应接口{@link INetSDK#QueryNewSystemInfo}                       **
	 ***********************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * Video analyze capability, refer to {@link CFG_CAP_ANALYSE_INFO}
	 * \else
	 * 视频分析能力集, 取值参考 {@link CFG_CAP_ANALYSE_INFO}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_VIDEOANALYSE   =   "devVideoAnalyse.getCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get back end device's online state, refer to {@link CFG_REMOTE_DEVICE_STATUS}
	 * \else
	 * 获取后端设备的的在线状态, 取值参考 {@link CFG_REMOTE_DEVICE_STATUS}
	 * \endif
	 */
	public static final String CFG_NETAPP_REMOTEDEVICE	   =   "netApp.getRemoteDeviceStatus"   ;

	/**
	 * \if ENGLISH_LANG
	 * Access equipment information, refer to {@link CFG_PRODUCT_DEFINITION_INFO}
	 * \else
	 * 接入设备信息，参考 {@link CFG_PRODUCT_DEFINITION_INFO}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_PRODUCTDEFINITION   =   "magicBox.getProductDefinition"   ;

	/**
	 * \if ENGLISH_LANG
	 * Device video analyze capability, refer to {@link CFG_CAP_DEVICE_ANALYSE_INFO}
	 * \else
	 * 设备智能分析能力, 兼容老设备, 取值参考 {@link CFG_CAP_DEVICE_ANALYSE_INFO}
	 * \endif
	 */
	public static final String CFG_DEVICE_CAP_CMD_VIDEOANALYSE   =   "intelli.getVideoAnalyseDeviceChannels"   ;

	/**
	 * \if ENGLISH_LANG
	 * Device video analyze capability, refer to {@link CFG_CAP_DEVICE_ANALYSE_INFO}
	 * \else
	 * 设备智能分析能力, 取值参考 {@link CFG_CAP_DEVICE_ANALYSE_INFO}
	 * \endif
	 */
	public static final String CFG_DEVICE_CAP_NEW_CMD_VIDEOANALYSE   =   "devVideoAnalyse.factory.getCollect"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get CPU number
	 * \else
	 * 获得CPU个数
	 * \endif
	 */
	public static final String CFG_CAP_CMD_CPU_COUNT    =   "magicBox.getCPUCount"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get CPU usage
	 * \else
	 * 获取CPU占用率
	 * \endif
	 */
	public static final String CFG_CAP_CMD_CPU_USAGE    =   "magicBox.getCPUUsage"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get memory info
	 * \else
	 * 获得内存容量
	 * \endif
	 */
	public static final String CFG_CAP_CMD_MEMORY_INFO    =   "magicBox.getMemoryInfo"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get device status, refer to {@link CFG_CAP_TRAFFIC_DEVICE_STATUS}
	 * \else
	 * 获取设备状态信息, 取值参考 {@link CFG_CAP_TRAFFIC_DEVICE_STATUS}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_DEVICE_STATE   =   "trafficSnap.getDeviceStatus"   ;

	/**
	 * \if ENGLISH_LANG
	 * The caps of video input, refer to {@link CFG_CAP_VIDEOINPUT_INFO}
	 * \else
	 * 视频输入能力集, 取值参考 {@link CFG_CAP_VIDEOINPUT_INFO}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_VIDEOINPUT   =   "devVideoInput.getCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get all active user info, refer to {@link CFG_ACTIVEALLUSER_INFO}
	 * \else
	 * 得到所有活动的用户信息, 取值参考 {@link CFG_ACTIVEALLUSER_INFO}
	 * \endif
	 */
	public static final String CFG_USERMANAGER_ACTIVEUSER      =   "userManager.getActiveUserInfoAll"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get video statistic summary info, refer to {@link CFG_VIDEOSATA_SUMMARY_INFO}
	 * \else
	 * 获取视频统计摘要信息, 取值参考 {@link CFG_VIDEOSATA_SUMMARY_INFO}
	 * \endif
	 */
	public static final String CFG_CAP_VIDEOSTAT_SUMMARY       =   "videoStatServer.getSummary"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get video diagnosis server capacity, refer to {@link CFG_VIDEODIAGNOSIS_CAPS_INFO}
	 * \else
	 * 获取视频诊断服务能力, 取值参考 {@link CFG_VIDEODIAGNOSIS_CAPS_INFO}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_VIDEODIAGNOSIS_SERVER   =   "videoDiagnosisServer.getCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get video diagnosis factory number, refer to {@link CFG_VIDEODIAGNOSIS_GETCOLLECT_INFO}
	 * \else
	 * 获取视频诊断通道数目, 取值参考 {@link CFG_VIDEODIAGNOSIS_GETCOLLECT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEODIAGNOSIS_GETCOLLECT            =   "videoDiagnosisServer.factory.getCollect"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get video diagnosis in process state, refer to {@link CFG_VIDEODIAGNOSIS_STATE_INFO}
	 * \else
	 * 获取视频诊断进行状态, 取值参考 {@link CFG_VIDEODIAGNOSIS_STATE_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEODIAGNOSIS_GETSTATE              =   "videoDiagnosisServer.getState"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get list of supported service from server, refer to {@link CFG_DEV_SERVICE_LIST}
	 * \else
	 * 获取服务器上支持的服务列表, 取值参考 {@link CFG_DEV_SERVICE_LIST}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_SERVICE_LIST                     =   "system.listService"   ;

	/**
	 * \if ENGLISH_LANG
	 * To obtain a list server up adn supported by server, refer to {@link CFG_CAP_EVENTHANDLER_INFO}
	 * \else
	 * 获取服务器报警联动能力集, 取值参考 {@link CFG_CAP_EVENTHANDLER_INFO}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_EVENTHANDLER      =   "capsManager.get&EventManagerEventHandler"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get alarm capacity, refer to {@link CFG_CAP_ALARM_INFO}
	 * \else
	 * 获取报警能力集, 取值参考 {@link CFG_CAP_ALARM_INFO}
	 * \endif
	 */
	public static final String CFG_CAP_ALARM                 =   "alarm.getAlarmCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get audio analyse capacity, refer to {@link CFG_CAP_AUDIO_ANALYSE_INFO}
	 * \else
	 * 获取音频分析能力集, 取值参考 {@link CFG_CAP_AUDIO_ANALYSE_INFO}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_AUDIO_ANALYSE     =   "devAudioAnalyse.getCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get channel number of main-sub tracker, refer to {@link CFG_MASTERSLAVETRACKER_INFO}
	 * \else
	 * 获取主从式跟踪器通道数目, 取值参考 {@link CFG_MASTERSLAVETRACKER_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_MASTERSLAVE_GETCOLLECT          =   "masterSlaveTracker.factory.getCollect"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get capacity of main-sub tracker, refer to {@link CFG_CAP_MASTERSLAVE_INFO}
	 * \else
	 * 获取主从式设备能力集, 取值参考 {@link CFG_CAP_MASTERSLAVE_INFO}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_MASTERSLAVE                 =   "capsManager.get&MasterSlaveTracker"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get focus status of lens, refer to {@link CFG_CAP_FOCUS_STATUS}
	 * \else
	 * 获取镜头聚焦状态信息, 取值参考 {@link CFG_CAP_FOCUS_STATUS}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_FOCUS_STATE	   =   "devVideoInput.getFocusStatus"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get capacity of net app, refer to {@link CFG_CAP_NETAPP}
	 * \else
	 * 获取网络应用能力集, 取值参考 {@link CFG_CAP_NETAPP}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_NETAPP            =   "netApp.getCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get cloud platform support information, refer to {@link CFG_CAP_PTZ_ENABLEINFO}
	 * \else
	 * 获取云台支持信息, 取值参考 {@link CFG_CAP_PTZ_ENABLEINFO}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_PTZ_ENABLE     =   "ptz.factory.instance"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get capacity of record manager, refer to {@link CFG_CAP_RECORD_INFO}
	 * \else
	 * 获取录像能力集, 取值参考 {@link CFG_CAP_RECORD_INFO}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_RECORD		   =   "recordManager.getCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get capacity of burn manager, refer to {@link CFG_CAP_BURN_MANAGER}
	 * \else
	 * 获取刻录管理能力集, 取值参考 {@link CFG_CAP_BURN_MANAGER}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_BURN_MANAGER      =   "BurnManager.getCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get PTZ capability config, refer to {@link CFG_PTZ_PROTOCOL_CAPS_INFO}
	 * \else
	 * 获取云台能力集, 取值参考 {@link CFG_PTZ_PROTOCOL_CAPS_INFO}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_PTZ     	   =   "ptz.getCurrentProtocolCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get Encoding Capability config, refer to {@link CFG_ENCODECAP}
	 * \else
	 * 获取编码能力集, 取值参考 {@link CFG_ENCODECAP}
	 * \endif
	 */
	public static final String CFG_CMD_ENCODE_GETCAPS        =   "encode.getCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Video Input Capability set extension, refer to {@link CFG_CAP_VIDEOINPUT_INFO_EX}
	 * \else
	 * 视频输入能力集扩展, 取值参考 {@link CFG_CAP_VIDEOINPUT_INFO_EX}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_VIDEOINPUT_EX     =   "devVideoInput.getCapsEx"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get Device Intelligent analysis mode, refer to {@link CFG_ANALYSE_MODE}
	 * \else
	 * 获取设备智能分析模式, 取值参考 {@link CFG_ANALYSE_MODE}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_ANALYSE_MODE      =   "intelli.getCaps.AnalyseMode"   ;

	/**
	 * \if ENGLISH_LANG
	 * The Ability to obtain equipment alarm linkage, refer to {@link CFG_CAP_EVENTMANAGER_INFO},The old agreement has been abolished,Please use the newly developed field
	 * \else
	 * 获取设备报警联动能力, 取值参考 {@link CFG_CAP_EVENTMANAGER_INFO} ,老协议已废除,新开发请使用该字段
	 * \endif
	 */
	public static final String CFG_CAP_CMD_EVENTMANAGER      =   "eventManager.getCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * The Ability to Obtain Documents, refer to {@link CFG_CAP_FILEMANAGER}
	 * \else
	 * 获取文件能力, 取值参考 {@link CFG_CAP_FILEMANAGER}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_FILEMANAGER	   =   "FileManager.getCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get the Log Service Capabilities, refer to {@link CFG_CAP_LOG}
	 * \else
	 * 获取日志服务能力, 取值参考 {@link CFG_CAP_LOG}
	 * \endif
	 */
	public static final String	CFG_CAP_CMD_LOG			   =   "log.getCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Speaker Play Capability, refer to {@link CFG_CAP_SPEAK}
	 * \else
	 * 扬声器播放能力, 取值参考 {@link CFG_CAP_SPEAK}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_SPEAK		   =   "speak.getCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Entrance Guard Capability, refer to {@link CFG_CAP_ACCESSCONTROL}
	 * \else
	 * 门禁能力, 取值参考 {@link CFG_CAP_ACCESSCONTROL}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_ACCESSCONTROLMANAGER   =   "accessControlManager.getCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get Extension Alarm Capability config, refer to {@link CFG_CAP_EXALARM_INFO}
	 * \else
	 * 获取扩展报警能力集, 取值参考 {@link CFG_CAP_EXALARM_INFO}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_EXALARM		   =   "alarm.getExAlarmCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get Extension Alarm Boxes Capability config, refer to {@link CFG_CAP_EXALARMBOX_INFO}
	 * \else
	 * 获取扩展报警盒能力集, 取值参考 {@link CFG_CAP_EXALARMBOX_INFO}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_EXALARMBOX	   =   "alarm.getExAlarmBoxCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get Query Records Capability config, refer to {@link CFG_CAP_RECORDFINDER_INFO}
	 * \else
	 * 获取查询记录能力集, 取值参考 {@link CFG_CAP_RECORDFINDER_INFO}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_RECORDFINDER   =   "RecordFinder.getCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Analog Alarm Input Channel Capacity, refer to {@link CFG_CAP_ANALOGALARM}
	 * \else
	 * 模拟量报警输入通道能力, 取值参考 {@link CFG_CAP_ANALOGALARM}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_ANALOGALARM	   =   "AnalogAlarm.getCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get LowRateWPAN capacity, refer to {@link CFG_CAP_LOWRATEWPAN}
	 * \else
	 * 获取LowRateWPAN能力, 取值参考 {@link CFG_CAP_LOWRATEWPAN}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_LOWRATEWPAN	   =   "LowRateWPAN.getCaps"   ;

	/**
	 * \if ENGLISH_LANG
	 * Get encode auto adapt capacity, refer to {@link CFG_CAP_ADAPT_ENCODE_INFO}
	 * \else
	 * 获取编码自适应编码能力, 取值参考 {@link CFG_CAP_ADAPT_ENCODE_INFO}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_ADAPTENCODE       =   "encode.getNAACaps";


	/**
	 * \if ENGLISH_LANG
	 * Get the device type, refer to {@link CFG_DEVICE_CLASS_INFO}
	 * \else
	 * 获取设备类型, 取值参考 {@link CFG_DEVICE_CLASS_INFO}
	 * \endif
	 */
	public static final String CFG_CAP_CMD_DEVICE_CLASS 			 =	"magicBox.getDeviceClass";

	/**
	 * \if ENGLISH_LANG
	 * video encode staff, refer to {@link CFG_VIDEO_WIDGET2_INFO}
	 * \else
	 * 视频编码物件配置, 取值参考 {@link CFG_VIDEO_WIDGET2_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_VIDEO_WIDGET2 = "VideoWidget2";
	
	/**
	 * \if ENGLISH_LANG
	 *  configuration of Privacy protection, refer to {@link CFG_SECURITY_ALARMS_PRIVACY}
	 * \else
	 * 隐私保护, 取值参考 {@link CFG_SECURITY_ALARMS_PRIVACY}
	 * \endif
	 */
	public static final String CFG_CMD_SECURITY_ALARMS_PRIVACY = "SecurityAlarmsPrivacy";

	/**
	 * \if ENGLISH_LANG
	 *  configuration of Net Monitor Abort, refer to {@link CFG_NET_MONITOR_ABORT_INFO}
	 * \else
	 * 网络预览中断事件配置  取值参考 {@link CFG_NET_MONITOR_ABORT_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_NET_MONITOR_ABORT = "NetMonitorAbort";

	/**
	 * \if ENGLISH_LANG
	 *  configuration of local extern alarm, refer to {@link CFG_LOCAL_EXT_ALARME_INFO}
	 * \else
	 * 本地扩展报警配置  取值参考 {@link CFG_LOCAL_EXT_ALARME_INFO}
	 * \endif
	 */
	public static final String CFG_CMD_LOCAL_EXT_ALARM = "LocalExtAlarm";




	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
  	/**
	 * \if ENGLISH_LANG
	 * Max length of backup file name
	 * \else
	 * 最大备份名称长度
	 * \endif
	 */
	public static final int SDK_MAX_BACKUP_NAME = 32;
	/**
	 * \if ENGLISH_LANG
	 * Max number of backup device
	 * \else
	 * 最大备份设备个数
	 * \endif
	 */
	public static final int SDK_MAX_BACKUPDEV_NUM = 16;
	/**
	 * \if ENGLISH_LANG
	 * Max number of backup file
	 * \else
	 * 最大备份文件个数
	 * \endif
	 */
	public static final int SDK_MAX_BACKUPRECORD_NUM = 1024;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 最大CAN个数
	 * \endif
	 */
	public static final int MAX_CAN_COUNT = 16;


	/**
	 * \if ENGLISH_LANG
	 * Max length of audio file path
	 * \else
	 * 最大音频文件路长度
	 * \endif
	 */
	public static final int SDK_MAX_AUDIO_PATH_1 = 260;
	/**
	 * \if ENGLISH_LANG
	 * the enum in EM_COLOR_TYPE
	 * \else
	 * EM_COLOR_TYPE内枚举，参考C代码单独取出作常量
	 * \endif
	 */
	public static final int NET_COLOR_TYPE_MAX = 8;
	public static final int NET_MAX_FRAMESEQUENCE_NUM     = 2;
	public static final int NET_MAX_TIMESTAMP_NUM         = 2;

	/**
	 * \if ENGLISH_LANG
	 * MAC filter configuration
	 * \else
	 * MAC过滤配置
	 * \endif
	 */
	public static final int SDK_MACFILTER_NUM             = 512;

	/**
	 * \if ENGLISH_LANG
	 * MAC, IP filter configuration
	 * \else
	 * MAC,IP过滤配置
	 * \endif
	 */
	public static final int SDK_MACIPFILTER_NUM           = 512;

	/**
	 * \if ENGLISH_LANG
	 * zone max number
	 * \else
	 * 防区最大个数
	 * \endif
	 */
	public static final int ARM_DISARM_ZONE_MAX           = 256;


	/***********************************************************************************************
	 ** 				设备能力类型, 对应接口{@link INetSDK#GetDevCaps}				          **
	 ***********************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * power timing capacity, pInBuf refer to {@link NET_IN_CAP_SEQPOWER}, pOutBuf refer to {@link NET_OUT_CAP_SEQPOWER}
	 * \else
	 * 电源时序器能力, pInBuf 取值参考 {@link NET_IN_CAP_SEQPOWER} , pOutBuf 取值参考 {@link NET_OUT_CAP_SEQPOWER}
	 * \endif
	 */
	public static final int NET_DEV_CAP_SEQPOWER            = 0x01;

	/**
	 * \if ENGLISH_LANG
	 * device encode config corresponding to capacity, pInBuf refer to {@link NET_IN_ENCODE_CFG_CAPS}, pOutBuf refer to {@link NET_OUT_ENCODE_CFG_CAPS}
	 * \else
	 * 设备编码配置对应能力, pInBuf 取值参考 {@link NET_IN_ENCODE_CFG_CAPS} , pOutBuf 取值参考 {@link NET_OUT_ENCODE_CFG_CAPS}
	 * \endif
	 */
	public static final int NET_ENCODE_CFG_CAPS             = 0x02;

	/**
	 * \if ENGLISH_LANG
	 * Fish eye capacity, pInBuf refer to {@link NET_IN_VIDEOIN_FISHEYE_CAPS}, pOutBuf refer to {@link NET_OUT_VIDEOIN_FISHEYE_CAPS}
	 * \else
	 * 鱼眼能力, pInBuf 取值参考 {@link NET_IN_VIDEOIN_FISHEYE_CAPS}, pOutBuf 取值参考 {@link NET_OUT_VIDEOIN_FISHEYE_CAPS}
	 * \endif
	 */
	public static final int NET_VIDEOIN_FISHEYE_CAPS        = 0x03;

	/**
	 * \if ENGLISH_LANG
	 * Get video detect device caps, pInBuf refer to {@link NET_IN_VIDEO_DETECT_CAPS}, pOutBuf refer to {@link NET_OUT_VIDEO_DETECT_CAPS}
	 * \else
	 * 获取视频检测输入能力集, pInBuf 取值参考 {@link NET_IN_VIDEO_DETECT_CAPS}, pOutBuf 取值参考 {@link NET_OUT_VIDEO_DETECT_CAPS}
	 * \endif
	 */
	public static final int NET_VIDEO_DETECT_CAPS = 0x05;

	/**
	 * \if ENGLISH_LANG
	 * Thermal imaging camera capability, pInBuf refer to {@link NET_IN_THERMO_GETCAPS}, pOutBuf refer to {@link NET_OUT_THERMO_GETCAPS}
	 * \else
	 * 热成像摄像头属性能力, pInBuf 取值参考 {@link NET_IN_THERMO_GETCAPS}, pOutBuf 取值参考 {@link NET_OUT_THERMO_GETCAPS}
	 * \endif
	 */
	public static final int NET_THERMO_GRAPHY_CAPS = 0x06;

	/**
	 * \if ENGLISH_LANG
	 * User manage capability, pInBuf refer to {@link NET_IN_USER_MNG_GETCAPS}, pOutBuf refer to {@link NET_OUT_USER_MNG_GETCAPS}
	 * \else
	 * 用户管理能力, pInBuf 取值参考 {@link NET_IN_USER_MNG_GETCAPS}, pOutBuf 取值参考 {@link NET_OUT_USER_MNG_GETCAPS}
	 * \endif
	 */
	public static final int NET_USER_MNG_CAPS    			 = 0x09;

	/**
	 * \if ENGLISH_LANG
	 * video image control capability, pInBuf refer to {@link NET_IN_VIDEO_IMAGECONTROL_CAPS}, pOutBuf refer to {@link NET_OUT_VIDEO_IMAGECONTROL_CAPS}
	 * \else
	 * 图像旋转设置能力, pInBuf 取值参考 {@link NET_IN_VIDEO_IMAGECONTROL_CAPS}, pOutBuf 取值参考 {@link NET_OUT_VIDEO_IMAGECONTROL_CAPS}
	 * \endif
	 */
	public static final int NET_VIDEO_IMAGECONTROL_CAPS		 = 0x10;

	/**
	 * \if ENGLISH_LANG
	 * query capabilities of snap config, pInBUf refer to {@link NET_IN_SNAP_CFG_CAPS}, pOutBuf refer to {@link NET_OUT_SNAP_CFG_CAPS}
	 * \else
	 * 设备抓图配置对应能力, pInBUf 取值参考 {@link NET_IN_SNAP_CFG_CAPS}, pOutBuf 取值参考 {@link NET_OUT_SNAP_CFG_CAPS}
	 * \endif
	 */
	public static final int NET_SNAP_CFG_CAPS                = 0x0c;

	/**
	 * \if ENGLISH_LANG
	 * query capabilities of VideoInput, pInBUf refer to {@link NET_IN_VIDEOIN_CAPS}, pOutBuf refer to {@link NET_OUT_VIDEOIN_CAPS}
	 * \else
	 * 设备视频输出能力, pInBUf 取值参考 {@link NET_IN_VIDEOIN_CAPS}, pOutBuf 取值参考 {@link NET_OUT_VIDEOIN_CAPS}
	 * \endif
	 */
	public static final int NET_VIDEOIN_CAPS                = 0x0d;

	/**
	 * \if ENGLISH_LANG
	 * video day night capability, pInBUf refer to {@link NET_IN_VIDEOIN_BACKLIGHT_CAPS}, pOutBuf refer to {@link NET_OUT_VIDEOIN_BACKLIGHT_CAPS}
	 * \else
	 * 背光设置能力, pInBUf 取值参考 {@link NET_IN_VIDEOIN_BACKLIGHT_CAPS}, pOutBuf 取值参考 {@link NET_OUT_VIDEOIN_BACKLIGHT_CAPS}
	 * \endif
	 */
	public static final int NET_VIDEOIN_BACKLIGHT_CAPS                = 0x13;

	/**
	 * \if ENGLISH_LANG
	 * video back light capability, pInBUf refer to {@link NET_IN_VIDEOIN_DAYNIGHT_CAPS}, pOutBuf refer to {@link NET_OUT_VIDEOIN_DAYNIGHT_CAPS}
	 * \else
	 * 球机机芯日夜设置能力, pInBUf 取值参考 {@link NET_IN_VIDEOIN_DAYNIGHT_CAPS}, pOutBuf 取值参考 {@link NET_OUT_VIDEOIN_DAYNIGHT_CAPS}
	 * \endif
	 */
	public static final int NET_VIDEOIN_DAYNIGHT_CAPS       = 0x15;
	/**
	 * \if ENGLISH_LANG
	 * Get coaxial IO control caps, pInBuf = {@link NET_IN_GET_COAXIAL_CONTROL_IO_CAPS}, pOutBuf = {@link NET_OUT_GET_COAXIAL_CONTROL_IO_CAPS}
	 * \else
	 * 获取同轴IO控制能力, pInBuf = {@link NET_IN_GET_COAXIAL_CONTROL_IO_CAPS}, pOutBuf = {@link NET_OUT_GET_COAXIAL_CONTROL_IO_CAPS}
	 * \endif
	 */
	public static final int NET_COAXIAL_CONTROL_IO_CAPS	  = 0x1e;

	/**
	 * \if ENGLISH_LANG
	 * Get Coaxial Control IO Status, pInBuf = {@link NET_IN_GET_COAXIAL_CONTROL_IO_STATUS}, pOutBuf = {@link NET_OUT_GET_COAXIAL_CONTROL_IO_STATUS}
	 * \else
	 * 获取同轴IO白光灯和喇叭状态, pInBuf = {@link NET_IN_GET_COAXIAL_CONTROL_IO_STATUS}, pOutBuf = {@link NET_OUT_GET_COAXIAL_CONTROL_IO_STATUS}
	 * \endif
	 */
	public static final int NET_COAXIAL_CONTROL_IO_STATUS	= 0x21;

	/**
	 * \if ENGLISH_LANG
	 * Get light caps(IPC/SD), pInBuf = {@link NET_IN_LIGHTINGCONTROL_CAPS}, pOutBuf = {@link NET_OUT_LIGHTINGCONTROL_CAPS}
	 * \else
	 * 获取补光灯能力(IPC/SD使用),pInBuf = {@link NET_IN_LIGHTINGCONTROL_CAPS}, pOutBuf = {@link NET_OUT_LIGHTINGCONTROL_CAPS}
	 * \endif
	 */
	public static final int NET_LIGHTINGCONTROL_CAPS	= 0x22;

	/**
	 * \if ENGLISH_LANG
	 * Get support DMSS private protocol caps, pInBuf = {@link NET_IN_SUPPORT_GET_AUDIO_DECODE_CAPS}, pOutBuf = {@link NET_OUT_SUPPORT_GET_AUDIO_DECODE_CAPS}
	 * \else
	 * 获取设备是否支持音频解码能力获取, pInBuf = {@link NET_IN_SUPPORT_GET_AUDIO_DECODE_CAPS}, pOutBuf = {@link NET_OUT_SUPPORT_GET_AUDIO_DECODE_CAPS}
	 * \endif
	 */
	// 获取设备是否支持音频解码能力获取,
	public static final int NET_SUPPORT_GET_AUDIO_DECODE_CAPS	= 0x23;

	// 获取设备是否支持DMSS专用协议能力,pInBuf = NET_IN_UNIFIEDINFOCOLLECT_CAPS*, pOutBuf = NET_OUT_UNIFIEDINFOCOLLECT_CAPS*
	public static final int NET_UNIFIEDINFOCOLLECT_CAPS	= 0x24;

	// 获取某个扩展报警盒的能力集, pInBuf = NET_IN_EXALARMBOX_CAPS*, pOutBuf = NET_OUT_EXALARMBOX_CAPS*
	public static final int  NET_EXALARMBOX_CAPS = 0x25;

	// 获取报警盒子管理器能力集，pInBuf = NET_IN_ALARMBOXMANAGER_CAPS*, pOutBuf = NET_OUT_ALARMBOXMANAGER_CAPS*
	public static final int  NET_ALARMBOXMANAGER_CAPS = 0x26;


	// 获取音频输入能力集, pInBuf = NET_IN_GET_AUDIO_DETECT_CAPS*, pOutBuf = NET_OUT_GET_AUDIO_DETECT_CAPS*
	public static final int NET_GET_AUDIO_DETECT_CAPS = 0x27;

	/**
	 * \if ENGLISH_LANG
	 * Get audio output caps, pInBuf = {@link NET_IN_AUDIO_OUTPUT_CAPS}, pOutBuf = {@link NET_OUT_AUDIO_OUTPUT_CAPS}
	 * \else
	 * 获取音频输出能力, pInBuf = {@link NET_IN_AUDIO_OUTPUT_CAPS}, pOutBuf = {@link NET_OUT_AUDIO_OUTPUT_CAPS}
	 * \endif
	 */
	public static final int NET_AUDIO_OUTPUT_CAPS = 0x34;

	/**
	 * \if ENGLISH_LANG
	 * Get remote collect device information caps, pInBuf = {@link NET_IN_REMOTE_COLLECT_DEVINFO_CAPS}, pOutBuf = {@link NET_OUT_REMOTE_COLLECT_DEVINFO_CAPS}
	 * \else
	 * 获取远程设备信息采集能力, pInBuf = {@link NET_IN_REMOTE_COLLECT_DEVINFO_CAPS}, pOutBuf = {@link NET_OUT_REMOTE_COLLECT_DEVINFO_CAPS}
	 * \endif
	 */
	public static final int NET_REMOTE_COLLECT_DEVINFO_CAPS = 0x36;

	/**
	 * \if ENGLISH_LANG
	 * Get remote speak caps, pInBuf = {@link NET_IN_REMOTE_SPEAK_CAPS}, pOutBuf = {@link NET_OUT_REMOTE_SPEAK_CAPS}
	 * \else
	 * 获取前端音频文件路径和能力集, pInBuf = {@link NET_IN_REMOTE_SPEAK_CAPS}, pOutBuf = {@link NET_OUT_REMOTE_SPEAK_CAPS}
	 * \endif
	 */
	public static final int NET_REMOTE_SPEAK_CAPS = 0x38;

	/**
	 * \if ENGLISH_LANG
	 * Get WLAN caps, pInBuf = {@link NET_IN_WLAN_CAPS_INFO}, pOutBuf = {@link NET_OUT_WLAN_CAPS_INFO}
	 * \else
	 * 获取WLAN能力集, pInBuf = {@link NET_IN_WLAN_CAPS_INFO}, pOutBuf = {@link NET_OUT_WLAN_CAPS_INFO}
	 * \endif
	 */
	public static final int NET_WLAN_CAPS = 0x39;
	/**
	 * \if ENGLISH_LANG
	 * Lighting mix solution caps, pInBuf = {@link NET_IN_LIGHTING_MIX_SOLUTION_CAPS}, pOutBuf = {@link NET_OUT_LIGHTING_MIX_SOLUTION_CAPS}
	 * \else
	 * 混光灯补光方案能力, pInBuf = {@link NET_IN_LIGHTING_MIX_SOLUTION_CAPS}, pOutBuf = {@link NET_OUT_LIGHTING_MIX_SOLUTION_CAPS}
	 * \endif
	 */
	public static final int NET_VIDEOIN_LIGHTING_MIX_SOLUTION_CAPS = 0x40;

	/***********************************************************************************************
	 ** 					设备信息类型，对应{@link INetSDK#QueryDevInfo}接口				      **
	 ***********************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * search device storage module name list , pInBuf refer to {@link NET_IN_STORAGE_DEV_NAMES}, pOutBuf refer to {@link NET_OUT_STORAGE_DEV_NAMES}
	 * \else
	 * 查询设备的存储模块名列表 , pInBuf 取值参考 {@link NET_IN_STORAGE_DEV_NAMES}, pOutBuf 取值参考 {@link NET_OUT_STORAGE_DEV_NAMES}
	 * \endif
	 */
	public static final int  NET_QUERY_DEV_STORAGE_NAMES           		= 0x01;

	/**
	 * \if ENGLISH_LANG
	 * search device storage info list, pInBuf refer to {@link NET_IN_STORAGE_DEV_INFOS}, pOutBuf refer to {@link NET_OUT_STORAGE_DEV_INFOS}
	 * \else
	 * 查询设备的存储模块信息列表, pInBuf 取值参考 {@link NET_IN_STORAGE_DEV_INFOS}, pOutBuf 取值参考 {@link NET_OUT_STORAGE_DEV_INFOS}
	 * \endif
	 */
	public static final int  NET_QUERY_DEV_STORAGE_INFOS            	= 0x02;

	/**
	 * \if ENGLISH_LANG
	 * search recent ANPR vehicle info port, pInBuf refer to {@link NET_IN_GET_RECENCY_JUNCTION_CAR_INFO}, pOutBuf refer to {@link NET_OUT_GET_RECENCY_JUNCTION_CAR_INFO}
	 * \else
	 * 查询最近的卡口车辆信息接口, pInBuf 取值参考 {@link NET_IN_GET_RECENCY_JUNCTION_CAR_INFO}, pOutBuf 取值参考 {@link NET_OUT_GET_RECENCY_JUNCTION_CAR_INFO}
	 * \endif
	 */
	public static final int  NET_QUERY_RECENCY_JNNCTION_CAR_INFO    	= 0x03;

	/**
	 * \if ENGLISH_LANG
	 * search lane info ,pInBuf refer to {@link NET_IN_GET_LANES_STATE}, pOutBuf refer to {@link NET_OUT_GET_LANES_STATE}
	 * \else
	 * 查询车道信息,pInBuf 取值参考 {@link NET_IN_GET_LANES_STATE}, pOutBuf 取值参考 {@link NET_OUT_GET_LANES_STATE}
	 * \endif
	 */
	public static final int  NET_QUERY_LANES_STATE                  	= 0x04;

	/**
	 * \if ENGLISH_LANG
	 * search Fish eye window info , pInBuf refer to {@link NET_IN_FISHEYE_WININFO}, pOutBuf refer to {@link NET_OUT_FISHEYE_WININFO}
	 * \else
	 * 查询鱼眼窗口信息 , pInBuf 取值参考 {@link NET_IN_FISHEYE_WININFO}, pOutBuf 取值参考 {@link NET_OUT_FISHEYE_WININFO}
	 * \endif
	 */
	public static final int  NET_QUERY_DEV_FISHEYE_WININFO          	= 0x05;

	/**
	 * \if ENGLISH_LANG
	 * search remote device info, pInBuf refer to {@link NET_IN_GET_DEVICE_INFO}, pOutBuf refer to {@link NET_OUT_GET_DEVICE_INFO}
	 * \else
	 * 查询远程设备信息, pInBuf 取值参考 {@link NET_IN_GET_DEVICE_INFO}, pOutBuf 取值参考 {@link NET_OUT_GET_DEVICE_INFO}
	 * \endif
	 */
	public static final int  NET_QUERY_DEV_REMOTE_DEVICE_INFO      		= 0x06;

	/**
	 * \if ENGLISH_LANG
	 * search all remote device info, pInBuf refer to {@link NET_IN_GET_DEVICE_INFO_ALL}, pOutBuf refer to {@link NET_OUT_GET_DEVICE_INFO_ALL}
	 * \else
	 * 查询所有远程设备信息, pInBuf 取值参考 {@link NET_IN_GET_DEVICE_INFO_ALL}, pOutBuf 取值参考 {@link NET_OUT_GET_DEVICE_INFO_ALL}
	 * \endif
	 * @deprecated
	 */
	public static final int  NET_QUERY_DEV_REMOTE_DEVICE_INFO_ALL       = 0x07;

	/**
	 * \if ENGLISH_LANG
	 * search system info , pInBuf refer to {@link NET_IN_SYSTEM_INFO}, pOutBuf refer to {@link NET_OUT_SYSTEM_INFO}
	 * \else
	 * 查询设备系统信息 , pInBuf 取值参考 {@link NET_IN_SYSTEM_INFO}, pOutBuf 取值参考 {@link NET_OUT_SYSTEM_INFO}
	 * \endif
	 */
	public static final int  NET_QUERY_SYSTEM_INFO       				 = 0x07;

	/**
	 * \if ENGLISH_LANG
	 * query active register device network connection , pInBuf refer to {@link NET_IN_REGDEV_NET_INFO}, pOutBuf refer to {@link NET_OUT_REGDEV_NET_INFO}
	 * \else
	 * 查询主动注册设备的网络连接 , pInBuf 取值参考 {@link NET_IN_REGDEV_NET_INFO}, pOutBuf 取值参考 {@link NET_OUT_REGDEV_NET_INFO}
	 * \endif
	 */
	public static final int NET_QUERY_REG_DEVICE_NET_INFO               = 0x08;

	/**
	 * \if ENGLISH_LANG
	 * query thermal preset info , pInBuf refer to {@link NET_IN_THERMO_GET_PRESET_INFO}, pOutBuf refer to {@link NET_OUT_THERMO_GET_PRESET_INFO}
	 * \else
	 * 查询热成像预设信息 , pInBuf 取值参考 {@link NET_IN_THERMO_GET_PRESET_INFO}, pOutBuf 取值参考 {@link NET_OUT_THERMO_GET_PRESET_INFO}
	 * \endif
	 */
	public static final int NET_QUERY_DEV_THERMO_GRAPHY_PRESET          = 0x09;

	/**
	 * \if ENGLISH_LANG
	 * query thermal ROI info, pInBuf refer to {@link NET_IN_THERMO_GET_OPTREGION}, pOutBuf refer to {@link NET_OUT_THERMO_GET_OPTREGION}
	 * \else
	 * 查询热成像感兴趣区域信息, pInBuf 取值参考 {@link NET_IN_THERMO_GET_OPTREGION}, pOutBuf 取值参考 {@link NET_OUT_THERMO_GET_OPTREGION}
	 * \endif
	 */
	public static final int NET_QUERY_DEV_THERMO_GRAPHY_OPTREGION       = 0x0a;

	/**
	 * \if ENGLISH_LANG
	 * query thermal external system info, pInBuf refer to {@link NET_IN_THERMO_GET_EXTSYSINFO}, pOutBuf refer to {@link NET_OUT_THERMO_GET_EXTSYSINFO}
	 * \else
	 * 查询热成像外部系统信息, pInBuf 取值参考 {@link NET_IN_THERMO_GET_EXTSYSINFO}, pOutBuf 取值参考 {@link NET_OUT_THERMO_GET_EXTSYSINFO}
	 * \endif
	 */
	public static final int NET_QUERY_DEV_THERMO_GRAPHY_EXTSYSINFO      = 0x0b;

	/**
	 * \if ENGLISH_LANG
	 * query the parameter value of ARGtemp_meas point, pInBuf refer to {@link NET_IN_RADIOMETRY_GETPOINTTEMPER}, pOutBuf refer to {@link NET_OUT_RADIOMETRY_GETPOINTTEMPER}
	 * \else
	 * 查询测温点的参数值, pInBuf 取值参考 {@link NET_IN_RADIOMETRY_GETPOINTTEMPER}, pOutBuf 取值参考 {@link NET_OUT_RADIOMETRY_GETPOINTTEMPER}
	 * \endif
	 */
	public static final int NET_QUERY_DEV_RADIOMETRY_POINT_TEMPER       = 0x0c;

	/**
	 * \if ENGLISH_LANG
	 * query parameter value of ARGtemp_meas item, pInBuf refer to {@link NET_IN_RADIOMETRY_GETTEMPER}, pOutBuf refer to {@link NET_OUT_RADIOMETRY_GETTEMPER}
	 * \else
	 * 查询测温项的参数值, pInBuf 取值参考 {@link NET_IN_RADIOMETRY_GETTEMPER}, pOutBuf 取值参考 {@link NET_OUT_RADIOMETRY_GETTEMPER}
	 * \endif
	 */
	public static final int NET_QUERY_DEV_RADIOMETRY_TEMPER             = 0x0d;

	/**
	 * \if ENGLISH_LANG
	 * query camera state, pInBuf refer to {@link NET_IN_GET_CAMERA_STATEINFO}, pOutBuf refer to {@link NET_OUT_GET_CAMERA_STATEINFO}
	 * \else
	 * 获取摄像机状态, pInBuf 取值参考 {@link NET_IN_GET_CAMERA_STATEINFO}, pOutBuf 取值参考 {@link NET_OUT_GET_CAMERA_STATEINFO}
	 * \endif
	 */
	public static final int NET_QUERY_GET_CAMERA_STATE                  = 0x0e;

	/**
	 * \if ENGLISH_LANG
	 * acquire remote communication audio coding mode, pInBuf refer to {@link NET_IN_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO}, pOutBuf refer to {@link NET_OUT_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO}
	 * \else
	 * 获取远程通道音频编码方式, pInBuf 取值参考 {@link NET_IN_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO} , pOutBuf 取值参考 {@link NET_OUT_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO}
	 * \endif
	 */
	public static final int NET_QUERY_GET_REMOTE_CHANNEL_AUDIO_ENCODE   = 0x0f;

	/**
	 * \if ENGLISH_LANG
	 * get comm port Info, pInBuf refer to {@link NET_IN_GET_COMM_PORT_INFO}, pOutBuf refer to {@link NET_OUT_GET_COMM_PORT_INFO}
	 * \else
	 * 获取设备串口信息, pInBuf 取值参考 {@link NET_IN_GET_COMM_PORT_INFO}, pOutBuf 取值参考 {@link NET_OUT_GET_COMM_PORT_INFO}
	 * \endif
	 */
	public static final int NET_QUERY_GET_COMM_PORT_INFO                = 0x10;

	/**
	 * \if ENGLISH_LANG
	 * query video linked channels for a single channel, pInBuf refer to {@link NET_IN_GET_LINKCHANNELS}, pOutBuf refer to {@link NET_OUT_GET_LINKCHANNELS}
	 * \else
	 * 查询某视频通道的关联通道列表, pInBuf 取值参考 {@link NET_IN_GET_LINKCHANNELS}, pOutBuf 取值参考 {@link NET_OUT_GET_LINKCHANNELS}
	 * \endif
	 */
	public static final int NET_QUERY_GET_LINKCHANNELS                  = 0x11;

	/**
	 * \if ENGLISH_LANG
	 * query video decode channel count statistics info, pInBuf refer to {@link NET_IN_GET_VIDEOOUTPUTCHANNELS}, pOutBuf refer to {@link NET_OUT_GET_VIDEOOUTPUTCHANNELS}
	 * \else
	 * 获取解码通道数量统计信息, pInBuf 取值参考 {@link NET_IN_GET_VIDEOOUTPUTCHANNELS}, pOutBuf 取值参考 {@link NET_OUT_GET_VIDEOOUTPUTCHANNELS}
	 * \endif
	 */
	public static final int NET_QUERY_GET_VIDEOOUTPUTCHANNELS           = 0x12;

	/**
	 * \if ENGLISH_LANG
	 * query video decode channel info, pInBuf refer to {@link NET_IN_GET_VIDEOINFO}, pOutBuf refer to {@link NET_OUT_GET_VIDEOINFO}
	 * \else
	 * 获取解码通道信息, pInBuf 取值参考 {@link NET_IN_GET_VIDEOINFO}, pOutBuf 取值参考 {@link NET_OUT_GET_VIDEOINFO}
	 * \endif
	 */
	public static final int NET_QUERY_GET_VIDEOINFO                     = 0x13;

	/**
	 * \if ENGLISH_LANG
	 * query all linked video channel groups, pInBuf refer to {@link NET_IN_GET_ALLLINKCHANNELS}, pOutBuf refer to {@link NET_OUT_GET_ALLLINKCHANNELS}
	 * \else
	 * 查询全部视频关联通道列表, pInBuf 取值参考 {@link NET_IN_GET_ALLLINKCHANNELS}, pOutBuf 取值参考 {@link NET_OUT_GET_ALLLINKCHANNELS}
	 * \endif
	 */
	public static final int NET_QUERY_GET_ALLLINKCHANNELS               = 0x14;

	/**
	 * \if ENGLISH_LANG
	 * query video channel info, pInBuf refer to {@link NET_IN_GET_VIDEOCHANNELSINFO}, pOutBuf refer to {@link NET_OUT_GET_VIDEOCHANNELSINFO}
	 * \else
	 * 查询视频通道信息,pInBuf 取值参考 {@link NET_IN_GET_VIDEOCHANNELSINFO}, pOutBuf 取值参考 {@link NET_OUT_GET_VIDEOCHANNELSINFO}
	 * \endif
	 */
	public static final int NET_QUERY_VIDEOCHANNELSINFO                 = 0x15;

	/**
	 * \if ENGLISH_LANG
	 * query traffic radar version, pInBuf refer to {@link NET_IN_TRAFFICRADAR_VERSION}, pOutBuf refer to {@link NET_OUT_TRAFFICRADAR_VERSION}
	 * \else
	 * 查询雷达设备版本, pInBuf 取值参考 {@link NET_IN_TRAFFICRADAR_VERSION}, pOutBuf 取值参考 {@link NET_OUT_TRAFFICRADAR_VERSION}
	 * \endif
	 */
	public static final int NET_QUERY_TRAFFICRADAR_VERSION              = 0x16;

	/**
	 * \if ENGLISH_LANG
	 * query all workgroups' names, pInBuf refer to {@link NET_IN_WORKGROUP_NAMES}, pOutBuf refer to {@link NET_OUT_WORKGROUP_NAMES}
	 * \else
	 * 查询所有的工作目录组名,pInBuf 取值参考 {@link NET_IN_WORKGROUP_NAMES}, pOutBuf 取值参考 {@link NET_OUT_WORKGROUP_NAMES}
	 * \endif
	 */
	public static final int NET_QUERY_WORKGROUP_NAMES                   = 0x17;

	/**
	 * \if ENGLISH_LANG
	 * query workgroup info, pInBuf refer to {@link NET_IN_WORKGROUP_INFO}, pOutBuf refer to {@link NET_OUT_WORKGROUP_INFO}
	 * \else
	 * 查询工作组信息,pInBuf 取值参考 {@link NET_IN_WORKGROUP_INFO}, pOutBuf 取值参考 {@link NET_OUT_WORKGROUP_INFO}
	 * \endif
	 */
	public static final int NET_QUERY_WORKGROUP_INFO                    = 0x18;

	/**
	 * \if ENGLISH_LANG
	 * query wlan access point info, pInBuf refer to {@link NET_IN_WLAN_ACCESSPOINT}, pOutBuf refer to {@link NET_OUT_WLAN_ACCESSPOINT}
	 * \else
	 * 查询无线网络接入点信息, pInBuf 取值参考 {@link NET_IN_WLAN_ACCESSPOINT}, pOutBuf 取值参考 {@link NET_OUT_WLAN_ACCESSPOINT}
	 * \endif
	 */
	public static final int NET_QUERY_WLAN_ACCESSPOINT                  = 0x19;

	/**
	 * \if ENGLISH_LANG
	 * query device GPS information, pInBuf refer to {@link NET_IN_DEV_GPS_INFO}, pOutBuf refer to {@link NET_OUT_DEV_GPS_INFO}
	 * \else
	 * 查询设备GPS信息,pInBuf 取值参考 {@link NET_IN_DEV_GPS_INFO}, pOutBuf 取值参考 {@link NET_OUT_DEV_GPS_INFO}
	 * \endif
	 */
	public static final int NET_QUERY_GPS_INFO						    = 0x1a;

	/**
	 * \if ENGLISH_LANG
	 * query IVS related remote device info, pInBuf refer to {@link NET_IN_IVS_REMOTE_DEV_INFO}, pOutBuf refer to {@link NET_OUT_IVS_REMOTE_DEV_INFO}
	 * \else
	 * 查询IVS的前端设备所关联的远程设备信息, pInBuf 取值参考 {@link NET_IN_IVS_REMOTE_DEV_INFO}, pOutBuf 取值参考 {@link NET_OUT_IVS_REMOTE_DEV_INFO}
	 * \endif
	 */
	public static final int NET_QUERY_IVS_REMOTE_DEVICE_INFO			= 0x1b;

	/**
	 * \if ENGLISH_LANG
	 * query smart switch info, pInBuf refer to {@link NET_IN_SMART_SWITCH_INFO},  pOutBuf refer to {@link NET_OUT_SMART_SWITCH_INFO}
	 * \else
	 * 查询智能插座信息, pInBuf 取值参考 {@link NET_IN_SMART_SWITCH_INFO},  pOutBuf 取值参考 {@link NET_OUT_SMART_SWITCH_INFO}
	 * \endif
	 */
	public static final int NET_QUERY_SMART_SWITCH_INFO                 = 0x1c;

	/**
	 * \if ENGLISH_LANG
	 * query upgrade state, pInBuf refer to {@link NET_IN_UPGRADE_STATE}, pOutBuf refer to {@link NET_OUT_UPGRADE_STATE}
	 * \else
	 * 查询升级状态信息, pInBuf 取值参考 {@link NET_IN_UPGRADE_STATE}, pOutBuf 取值参考 {@link NET_OUT_UPGRADE_STATE}
	 * \endif
	 */
	public static final int NET_QUERY_UPGRADE_STATE						= 0x1d;

	/**
	 * \if ENGLISH_LANG
	 * query audio input channel caps, pInBuf refer to {@link NET_IN_AUDIO_IN_CAPS}, pOutBuf refer to {@link NET_OUT_AUDIO_IN_CAPS}
	 * \else
	 * 查询音频输入通道能力集, pInBuf 取值参考 {@link NET_IN_AUDIO_IN_CAPS}, pOutBuf 取值参考 {@link NET_OUT_AUDIO_IN_CAPS}
	 * \endif
	 */
	public static final int NET_QUERY_AUDIO_IN_CAPS                     = 0x20;

	/**
	 * \if ENGLISH_LANG
	 * query Smart encode caps, pInBuf refer to {@link NET_IN_SMART_ENCODE_CAPS}, pOutBuf refer to {@link NET_OUT_SMART_ENCODE_CAPS}
	 * \else
	 * 查询Smart编码能力集, pInBuf 取值参考 {@link NET_IN_SMART_ENCODE_CAPS}, pOutBuf 取值参考 {@link NET_OUT_SMART_ENCODE_CAPS}
	 * \endif
	 */
	public static final int NET_QUERY_SMART_ENCODE_CAPS                     = 0x21;

	/**
	 * \if ENGLISH_LANG
	 * query audio decode caps, pInBuf refer to {@link NET_IN_AUDIO_DECODE_CAPS}, pOutBuf refer to {@link NET_OUT_AUDIO_DECODE_CAPS}
	 * \else
	 * 取音频解码能力集, pInBuf 取值参考 {@link NET_IN_AUDIO_DECODE_CAPS}, pOutBuf 取值参考 {@link NET_OUT_AUDIO_DECODE_CAPS}
	 * \endif
	 */
	public static final int NET_QUERY_AUDIO_DECODE_CAPS						= 0x25;

	/**
	 * \if ENGLISH_LANG
	 * Check whether the channel intelligent function can be turned on, pInBuf refer to {@link NET_IN_DEV_VARIABLE_CAPS_MANAGER_CHECK_START_INFO}, pOutBuf refer to {@link NET_OUT_DEV_VARIABLE_CAPS_MANAGER_CHECK_START_INFO}
	 * \else
	 * 检查通道智能功能是否可以开启, pInBuf 取值参考 {@link NET_IN_DEV_VARIABLE_CAPS_MANAGER_CHECK_START_INFO}, pOutBuf 取值参考 {@link NET_OUT_DEV_VARIABLE_CAPS_MANAGER_CHECK_START_INFO}
	 * \endif
	 */
	public static final int NET_QUERY_DEV_VARIABLE_CAPS_MANAGER_CHECK_START = 0x30;

	/**
	 * \if ENGLISH_LANG
	 * Get the list of all conflict resources of the device, pInBuf refer to {@link NET_IN_DEV_VARIABLE_CAPS_MANAGER_GET_FUNC_TYPE_LIST_INFO}, pOutBuf refer to {@link NET_OUT_DEV_VARIABLE_CAPS_MANAGER_GET_FUNC_TYPE_LIST_INFO}
	 * \else
	 * 获取设备所有冲突资源列表, pInBuf 取值参考 {@link NET_IN_DEV_VARIABLE_CAPS_MANAGER_GET_FUNC_TYPE_LIST_INFO}, pOutBuf 取值参考 {@link NET_OUT_DEV_VARIABLE_CAPS_MANAGER_GET_FUNC_TYPE_LIST_INFO}
	 * \endif
	 */
	public static final int NET_QUERY_DEV_VARIABLE_CAPS_MANAGER_GET_FUNC_TYPE_LIST = 0x31;

	/**
	 * \if ENGLISH_LANG
	 * Get the horizontal field of view parameters at different magnifications of the lens, pInBuf refer to {@link NET_IN_PTZBASE_GET_HFOV_VALUE}, pOutBuf refer to {@link NET_OUT_PTZBASE_GET_HFOV_VALUE}
	 * \else
	 * 获取镜头不同倍率下水平视场角参数, pInBuf 取值参考 {@link NET_IN_PTZBASE_GET_HFOV_VALUE}, pOutBuf 取值参考 {@link NET_OUT_PTZBASE_GET_HFOV_VALUE}
	 * \endif
	 */
	public static final int NET_QUERY_PTZBASE_GET_HFOV_VALUE = 0x39;

	/**
	 * \if ENGLISH_LANG
	 * Get the gps info of the center, pInBuf refer to {@link NET_IN_PTZBASE_GET_CENTER_GPS}, pOutBuf refer to {@link NET_OUT_PTZBASE_GET_CENTER_GPS}
	 * \else
	 * 获取中心位置GPS信息, pInBuf 取值参考 {@link NET_IN_PTZBASE_GET_CENTER_GPS}, pOutBuf 取值参考 {@link NET_OUT_PTZBASE_GET_CENTER_GPS}
	 * \endif
	 */
	public static final int NET_QUERY_PTZBASE_GET_CENTER_GPS = 0x3a;

	/**
	 * \if ENGLISH_LANG
	 * Obtain the angle parameters of the horizontal field of view at different magnification of the lens, pInBuf refer to {@link NET_IN_PTZBASE_GET_VFOV_VALUE}, pOutBuf refer to {@link NET_OUT_PTZBASE_GET_VFOV_VALUE}
	 * \else
	 * 获取镜头不同倍率下垂直视场角参数, pInBuf 取值参考 {@link NET_IN_PTZBASE_GET_VFOV_VALUE}, pOutBuf 取值参考 {@link NET_OUT_PTZBASE_GET_VFOV_VALUE}
	 * \endif
	 */
	public static final int NET_QUERY_PTZBASE_GET_VFOV_VALUE = 0x3f;

	/***********************************************************************************************
	 * 				订阅Bus状态对应事件上报,对应接口{@link INetSDK#AttachBusState}	              **
	 ***********************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * driver sign up event, refer to {@link ALARM_BUS_DRIVER_CHECK_INFO}
	 * \else
	 * 司机签到事件, 取值参考 {@link ALARM_BUS_DRIVER_CHECK_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BUS_DRIVER_CHECK         = 0x0001;

	/**
	 * \if ENGLISH_LANG
	 * in station event, refer to {@link ALARM_BUS_IMPORT_SITE_INFO}
	 * \else
	 * 进站事件, 取值参考 {@link ALARM_BUS_IMPORT_SITE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BUS_IMPORT_SITE          = 0x0002;

	/**
	 * \if ENGLISH_LANG
	 * out station event, refer to {@link ALARM_BUS_EXPORT_SITE_INFO}
	 * \else
	 * 离站事件, 取值参考 {@link ALARM_BUS_EXPORT_SITE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BUS_EXPORT_SITE          = 0x0003;

	/**
	 * \if ENGLISH_LANG
	 * Abnormal vehicle event, refer to {@link ALARM_BUS_ABNORMAL_INFO}
	 * \else
	 * 车辆异常事件, 取值参考 {@link ALARM_BUS_ABNORMAL_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BUS_ABNORMAL             = 0x0004;

	/**
	 * \if ENGLISH_LANG
	 * Unlock car door event, refer to {@link ALARM_VEHICLE_DOOR_OPEN_INFO}
	 * \else
	 * 车门打开事件, 取值参考 {@link ALARM_VEHICLE_DOOR_OPEN_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BUS_DOOR_OPEN            = 0x0005;

	/**
	 * \if ENGLISH_LANG
	 * Current mileage event, refer to {@link ALARM_BUS_CUR_MILEAGE_INFO}
	 * \else
	 * 当前里程事件, 取值参考 {@link ALARM_BUS_CUR_MILEAGE_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BUS_CUR_MILEAGE          = 0x0006;

	/**
	 * \if ENGLISH_LANG
	 * Current oil event, refer to {@link ALARM_BUS_CUR_OIL_INFO}
	 * \else
	 * 当前油耗情况事件, 取值参考 {@link ALARM_BUS_CUR_OIL_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BUS_CUR_OIL              = 0x0007;

	/**
	 * \if ENGLISH_LANG
	 * Low oil event, refer to {@link ALARM_BUS_LOW_OIL_INFO}
	 * \else
	 * 低油量报警事件, 取值参考 {@link ALARM_BUS_LOW_OIL_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BUS_LOW_OIL              = 0x0008;

	/**
	 * \if ENGLISH_LANG
	 * Passeger card check event, refer to {@link ALARM_PASSENGER_CARD_CHECK}
	 * \else
	 * 乘客刷卡事件, 取值参考 {@link ALARM_PASSENGER_CARD_CHECK}
	 * \endif
	 */
	public static final int SDK_ALARM_BUS_PASSENGER_CARD_CHECK = 0x0009;

	/**
	 * \if ENGLISH_LANG
	 * vehicle standing over time, refer to {@link ALARM_VEHICLE_STANDING_OVER_TIME_INFO}
	 * \else
	 * 停车超时事件, 取值参考 {@link ALARM_VEHICLE_STANDING_OVER_TIME_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_BUS_VEHICLE_STANDING_OVER_TIME = 0x000a;

	/**
	 * \if ENGLISH_LANG
	 * not work time, refer to {@link ALARM_DVRIVE_AFTER_WORK}
	 * \else
	 * 非工作时间事件, 取值参考 {@link ALARM_DVRIVE_AFTER_WORK}
	 * \endif
	 */
	public static final int SDK_ALARM_BUS_DRIVE_AFTER_WORK     = 0x000b;

	/**
	 * \if ENGLISH_LANG
	 * PAD shutdown event, refer to {@link ALARM_BUS_PAD_SHUTDOWN_INFO}; DVR notify PadShutdown event, PAD will delay shutdown automatically by receiving this event
	 * \else
	 * PAD关机事件, 取值参考 {@link ALARM_BUS_PAD_SHUTDOWN_INFO} , DVR上报PadShutdown消息, PAD收到后自动延时关机
	 * \endif
	 */
	public static final int SDK_ALARM_BUS_PAD_SHUTDOWN         = 0x000c;

	/**
	 * \if ENGLISH_LANG
	 * alarm of Intelligent detection of human body temperature, refer to {@link ALARM_ANATOMY_TEMP_DETECT_INFO};
	 * \else
	 * 人体温智能检测事件,取值参考 {@link ALARM_ANATOMY_TEMP_DETECT_INFO}
	 * \endif
	 */
	public static final int SDK_ALARM_ANATOMY_TEMP_DETECT         = 0x3454;

	/**
	 * \if ENGLISH_LANG
	 * alarm of Standard blackbody source exception refer to {@link ALARM_REGULATOR_ABNORMAL_INFO};
	 * \else
	 * 标准黑体源异常报警事件,取值参考 {@link ALARM_REGULATOR_ABNORMAL_INFO};
	 * \endif
	 */
	public static final int SDK_ALARM_REGULATOR_ABNORMAL         = 0x3455;

	/**
	 * \if ENGLISH_LANG
	 * alarm of storage format, refer to {@link ALARM_STORAGEFORMAT_INFO};
	 * \else
	 * 硬盘格式化事件,取值参考 {@link ALARM_STORAGEFORMAT_INFO};
	 * \endif
	 */
	public static final int SDK_ALARM_STORAGEFORMAT         = 0x345C;



	/********************************************************************************
	 * 				编码模式列表，用于与编码模式掩码进行与、或操作					*
	 ********************************************************************************/
	public static final int SDK_CAPTURE_COMP_DIVX_MPEG4     = 0x00000001;
	public static final int SDK_CAPTURE_COMP_MS_MPEG4       = 0x00000002;
	public static final int SDK_CAPTURE_COMP_MPEG2          = 0x00000004;
	public static final int SDK_CAPTURE_COMP_MPEG1          = 0x00000008;
	public static final int SDK_CAPTURE_COMP_H263           = 0x00000010;
	public static final int SDK_CAPTURE_COMP_MJPG           = 0x00000020;
	public static final int SDK_CAPTURE_COMP_FCC_MPEG4      = 0x00000040;
	public static final int SDK_CAPTURE_COMP_H264           = 0x00000080;
	public static final int SDK_CAPTURE_COMP_H265           = 0x00000100;


	public static final int MAX_REGISTER_ID_LEN              = (256);
	public static final int MAX_APP_ID_LEN                    = (256);
	public static final int MAX_URL_LEN                       = (1024);
	public static final int MAX_IOS_CERTIFICATE_LEN         = (1024 * 14);
	public static final int MAX_IOS_SECRET_KEY_LEN          = (512);
	public static final int MAX_MOBILE_CHANNEL_NUM          = (256);
	public static final int MAX_SCENE_COUNT                  = 8;
	public static final int UPDATE_VERSION_LEN               = 64;
	public static final int MAX_FISH_EYE_REGION_NUM    	  = 9;
	public static final int NET_RADIOMETRY_DOFIND_MAX  	  = 32;
	public static final int NET_VIDEOANALYSE_SCENES    	  = 32;
	public static final int NET_VIDEOANALYSE_RULES     	  = 64;
	public static final int MAX_IVS_EVENT_NUM    			  = 256;

	/**
	 * \if ENGLISH_LANG
	 * The Maximum OutPut Channels Of Each Audio Matrix
	 * \else
	 * 每个音频矩阵支持的最大输出通道数
	 * \endif
	 */
	public static final int SDK_MAX_AUDIO_MATRIX_OUTPUT     = 8;

	/**
	 * \if ENGLISH_LANG
	 * Max log path name length
	 * \else
	 * 日志路径名最大长度
	 * \endif
	 */
	public static final int  MAX_LOG_PATH_LEN               = 260;

	/**
	 * \if ENGLISH_LANG
	 * Target library max number
	 * \else
	 * 目标库最大个数
	 * \endif
	 */
	public static final int  MAX_GOURP_NUM                 =  128 ;

	/**
	 * \if ENGLISH_LANG
	 * max dev comm number
	 * \else
	 * 最大串口个
	 * \endif
	 */
	public static final int MAX_DEVCOMM_NUM 			   = 16;

	/**
	 * \if ENGLISH_LANG
	 * Judicial device level 2 switch level 1 split supported input channel
	 * \else
	 * 设备二级切换时第一级split支持的输入通道数
	 * \endif
	 *
	 */
	public static final int SDK_SPLIT_INPUT_NUM 		   = 256;


	/**
	 * \if ENGLISH_LANG
	 * The Maximum Audio Matrix Input Channels
	 * \else
	 * 音频矩阵最大输入通道数
	 * \endif
	 *
	 */
	public static final int CFG_MAX_AUDIO_MATRIX_INPUT     = 32;

	/**
	 * \if ENGLISH_LANG
	 * max to confirm event number
	 * \else
	 * 最大待确认的事件的个数
	 * \endif
	 *
	 */
	public static final int MAX_EVENT_TO_CONFIRM_NUM       = 8;

	/**
	 * \if ENGLISH_LANG
	 * TThe Max fire waring information
	 * \else
	 * 最大热成像着火点报警信息个数
	 * \endif
	 *
	 */
	public static final int MAX_FIREWARNING_INFO_NUM      = 4;

	/**
	 * \if ENGLISH_LANG
	 * TThe Max number of costomer, receive message
	 * \else
	 * 接收短信用户的最大数目
	 * \endif
	 */
	public static final int MAX_RECEIVER_NUM 		      = 100;

	 /**
	 * \if ENGLISH_LANG
	 * The max number of preview channel
	 * \else
	 * 最大导播预览的通道数量
	 * \endif
	 */
	public static final int MAX_PREVIEW_CHANNEL_NUM 	 = 64;

	 /**
	 * \if ENGLISH_LANG
	 * Maximum Number of Combination of Entrance Guard Operationl
	 * \else
	 * 最大门禁操作的组合数
	 * \endif
	 */
	public static final int MAX_ACCESSCONTROL_NUM 	     = 8;

	 /**
	 * \if ENGLISH_LANG
	 * The Maximum Number of  Alarm Call Servers
	 * \else
	 * 最大报警电话服务器数
	 * \endif
	 */
	public static final int MAX_PSTN_SERVER_NUM 		 = 8;

	 /**
	 * \if ENGLISH_LANG
	 * The Maximum Number of NTP Server
	 * \else
	 * 最大备用NTP服务器地址
	 * \endif
	 */
	public static final int MAX_NTP_SERVER 			    = 4;

	 /**
	 * \if ENGLISH_LANG
	 * IP address string length
	 * \else
	 * IP地址字符串长度
	 * \endif
	 */
	public static final int MAX_IP_ADDR_LEN 		    = 16;

	 /**
	 * \if ENGLISH_LANG
	 * TV max amount in the zone
	 * \else
	 * 区块中TV的最大数量
	 * \endif
	 */
	public static final int AV_CFG_Max_TV_In_Block      = 128;

	 /**
	 * \if ENGLISH_LANG
	 * The zone max amount in the video wall.
	 * \else
	 * 电视墙中区块的最大数量
	 * \endif
	 */
	public static final int AV_CFG_Max_Block_In_Wall    = 128;

	 /**
	 * \if ENGLISH_LANG
	 * Max collection quantity
	 * \else
	 * 最大预案数
	 * \endif
	 */
	public static final int SDK_MAX_COLLECTION_NUM      = 64;

	 /**
	 * \if ENGLISH_LANG
	 * Maximum Phone Number Length
	 * \else
	 * 电话号码最大长度
	 * \endif
	 */
	public static final int MAX_PHONE_NUMBER_LEN        = 32;

	 /**
	 * \if ENGLISH_LANG
	 * Place Names Length of Upstream and Downstream
	 * \else
	 * 上下行地点名长
	 * \endif
	 */
	public static final int CFG_FLOWSTAT_ADDR_NAME	    = 16;

	 /**
	 * \if ENGLISH_LANG
	 * max config 6 parking info
	 * \else
	 * 最多配置6个车位信息
	 * \endif
	 */
	public static final int MAX_PARKING_SPACE_NUM       = 6;

	 /**
	 * \if ENGLISH_LANG
	 * max count of area
	 * \else
	 * 最大区域个数
	 * \endif
	 */
	public static final int MAX_AREA_COUNT			    = 8;

	 /**
	 * \if ENGLISH_LANG
	 * 1 parking max corresponds to 16 shield zone
	 * \else
	 * 最大区域个数1个车位最多对应16个屏蔽区域
	 * \endif
	 */
	public static final int MAX_SHIELD_AREA_NUM         = 16;

	 /**
	 * \if ENGLISH_LANG
	 * max ring file num
	 * \else
	 * 最大门铃音频文件个数
	 * \endif
	 */
	public static final int MAX_RINGFILE_NUM            = 64;

	 /**
	 * \if ENGLISH_LANG
	 * max coursemedia logic channel number
	 * \else
	 * 录播主机最大逻辑通道数
	 * \endif
	 */
	public static final int MAX_COURSE_LOGIC_CHANNEL   = 64;

	 /**
	 * \if ENGLISH_LANG
	 * Universal String Length 8
	 * \else
	 * 通用字符串长度8
	 * \endif
	 */
	public static final int MAX_COMMON_STRING_8           = 8;

	 /**
	 * \if ENGLISH_LANG
	 * Universal String Length 16
	 * \else
	 * 通用字符串长度16
	 * \endif
	 */
	public static final int MAX_COMMON_STRING_16          = 16;

	 /**
	 * \if ENGLISH_LANG
	 * Universal String Length 32
	 * \else
	 * 通用字符串长度32
	 * \endif
	 */
	public static final int MAX_COMMON_STRING_32          = 32;

	 /**
	 * \if ENGLISH_LANG
	 * Universal String Length 64
	 * \else
	 * 通用字符串长度64
	 * \endif
	 */

	public static final int MAX_COMMON_STRING_64         = 64;

	/**
	 * \if ENGLISH_LANG
	 * Universal String Length 128
	 * \else
	 * 通用字符串长度128
	 * \endif
	 */
	public static final int MAX_COMMON_STRING_128         = 128;

	/**
	 * \if ENGLISH_LANG
	 * Universal String Length 256
	 * \else
	 * 通用字符串长度256
	 * \endif
	 */
	public static final int MAX_COMMON_STRING_256         = 256;

	/**
	 * \if ENGLISH_LANG
	 * Universal String Length 512
	 * \else
	 * 通用字符串长度512
	 * \endif
	 */
	public static final int MAX_COMMON_STRING_512       = 512;

	/**
	 * \if ENGLISH_LANG
	 * Universal String Length 2048
	 * \else
	 * 通用字符串长度2048
	 * \endif
	 */
	public static final int MAX_COMMON_STRING_2048         = 2048;

	 /**
	 * \if ENGLISH_LANG
	 * max number of user
	 * \else
	 * 最大查询用户个数
	 * \endif
	 */
	public static final int MAX_QUERY_USER_NUM         = 4;

	 /**
	 * \if ENGLISH_LANG
	 * the max of month nubmer
	 * \else
	 * 最大月份个数
	 * \endif
	 */
	public static final int NET_MAX_MONTH_NUM          = 31;

	 /**
	 * \if ENGLISH_LANG
	 * the max length of ipaddr  ipv4-mapped-on-ipv6
	 * \else
	 * IP地址字符串长度 支持 ipv4-mapped-on-ipv6
	 * \endif
	 */
	public static final int NET_IPADDRSTR_LEN          = 46;

	 /**
	 * \if ENGLISH_LANG
	 * the max of accesspoint number
	 * \else
	 * 最大AP个数
	 * \endif
	 */
	public static final int NET_MAX_AP_NUM             = 3;

	 /**
	 * \if ENGLISH_LANG
	 * the max of WEP password number
	 * \else
	 * 最大WEP密码个数
	 * \endif
	 */
	public static final int MAX_WEP_KEY_NUM            = 4;

	 /**
	 * \if ENGLISH_LANG
	 * the max length of car no
	 * \else
	 * 最大车辆号长度
	 * \endif
	 */
	public static final int MAX_CARNO_LEN              = 20;

	 /**
	 * \if ENGLISH_LANG
	 * the max length of coach no
	 * \else
	 * 最大车厢号长度
	 * \endif
	 */
	public static final int MAX_COACHNO_LEN            = 12;

	 /**
	 * \if ENGLISH_LANG
	 * the max of work pattern number
	 * \else
	 * 最大工作模式个数
	 * \endif
	 */
	public static final int MAX_WORKPATTERN_NUM        = 2;

	/**
	 * \if ENGLISH_LANG
	 * volume type upper limit
	 * \else
	 * 卷类型的最大上限
	 * \endif
	 */
	public static final int MAX_DEVICE_VOLUME_NUMS    = 128;

	 /**
	 * \if ENGLISH_LANG
	 * the max length of wireless device SN
	 * \else
	 * 无线设备序列号最大长度
	 * \endif
	 */
	public static final int SDK_WIRELESS_DEVICE_SERIAL_NUMBER_MAX_LEN = 32;



	/****************************************************************************
	 * 						           存储设备状态								    *
	 ****************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * physical disk offline status
	 * \else
	 * 物理硬盘脱机状态
	 * \endif
	 */
	public static final int  NET_STORAGE_DEV_OFFLINE                 = 0;

	/**
	 * \if ENGLISH_LANG
	 * physicali disk running ststus
	 * \else
	 * 物理硬盘运行状态
	 * \endif
	 */
	public static final int  NET_STORAGE_DEV_RUNNING                 = 1;

	/**
	 * \if ENGLISH_LANG
	 * RAID activity
	 * \else
	 * RAID活动
	 * \endif
	 */
	public static final int  NET_STORAGE_DEV_ACTIVE                  = 2;

	/**
	 * \if ENGLISH_LANG
	 * RAID sync
	 * \else
	 * RAID同步
	 * \endif
	 */
	public static final int  NET_STORAGE_DEV_SYNC                    = 3;

	/**
	 * \if ENGLISH_LANG
	 * RAID hotdevice(partial)
	 * \else
	 * RAID热备(局部)
	 * \endif
	 */
	public static final int  NET_STORAGE_DEV_SPARE                   = 4;

	/**
	 * \if ENGLISH_LANG
	 * RAID invalid
	 * \else
	 * RAID失效
	 * \endif
	 */
	public static final int  NET_STORAGE_DEV_FAULTY                  = 5;

	/**
	 * \if ENGLISH_LANG
	 * RAID re-build
	 * \else
	 * RAID重建
	 * \endif
	 */
	public static final int  NET_STORAGE_DEV_REBUILDING              = 6;

	/**
	 * \if ENGLISH_LANG
	 * RAID remove
	 * \else
	 * RAID移除
	 * \endif
	 */
	public static final int  NET_STORAGE_DEV_REMOVED                 = 7;

	/**
	 * \if ENGLISH_LANG
	 * RAID error
	 * \else
	 * RAID写错误
	 * \endif
	 */
	public static final int  NET_STORAGE_DEV_WRITE_ERROR             = 8;

	/**
	 * \if ENGLISH_LANG
	 * RAID need to be replaced
	 * \else
	 * RAID需要被替换
	 * \endif
	 */
	public static final int  NET_STORAGE_DEV_WANT_REPLACEMENT        = 9;

	/**
	 * \if ENGLISH_LANG
	 * RAID is replacement
	 * \else
	 * RAID是替代设备
	 * \endif
	 */
	public static final int  NET_STORAGE_DEV_REPLACEMENT             = 10;

	/**
	 * \if ENGLISH_LANG
	 * Global hotdevice
	 * \else
	 * 全局热备
	 * \endif
	 */
	public static final int  NET_STORAGE_DEV_GLOBAL_SPARE            = 11;

	/**
	 * \if ENGLISH_LANG
	 * Error, partial available
	 * \else
	 * 错误, 部分分区可用
	 * \endif
	 */
	public static final int  NET_STORAGE_DEV_ERROR                   = 12;

	/**
	 * \if ENGLISH_LANG
	 * The disk is single, originally is Raid sub disk, may auto add Raid after reboot
	 * \else
	 * 该盘目前是单盘, 原先是块Raid子盘, 有可能在重启后自动加入Raid
	 * \endif
	 */
	public static final int  NET_STORAGE_DEV_RAIDSUB                 = 13;

	/**
	 * \if ENGLISH_LANG
	 * the max num for authority type
	 * \else
	 * 用户权限类型最大值
	 * \endif
	 */
	public static final int NET_AUTHORITY_CLASS_MAX_NUM              = 256;

	/**
	 * \if ENGLISH_LANG
	 * card no. max domain quantity
	 * \else
	 * 卡号录像最大域数量
	 * \endif
	 */
	public static final int  MAX_CARD_RECORD_FIELD_NUM 			     = 16;

	/**
	 * \if ENGLISH_LANG
	 * windows info. max number
	 * \else
	 * 窗口信息最大数
	 * \endif
	 */
	public static final int NET_MAX_WINDOWS_NUMBER                   = 64;

	/**
	 * \if ENGLISH_LANG
	 *  max number of mode info
	 * \else
	 * 模式信息最大数
	 * \endif
	 */
	public static final int NET_MAX_MODE_NUMBER                      =  64;

	/**
	 * \if ENGLISH_LANG
	 * smart lock ;the max number of registered user information
	 * \else
	 * 智能锁注册用户的最大数量
	 * \endif
	 */
	public static final int MAX_NUMBER_REGISTER_INFO                   = 32;

	/**
	 * \if ENGLISH_LANG
	 * max len of special chars list in passwd specification
	 * \else
	 * 密码规范中密码特殊字符列表最大长度
	 * \endif
	 */
	public static final int MAX_PWD_SPEC_CHARS_ARRAY_LEN	 		   = 128;

	/**
	 * \if ENGLISH_LANG
	 * max len of basic chars list supported in passwd specification
	 * \else
	 * 密码规范中支持的基本字符类型列表最大长度
	 * \endif
	 */
	public static final int	MAX_PWD_BASIC_CHARS_ARRAY_LEN	 		  = 128;

	/**
	 * \if ENGLISH_LANG
	 * OSD Overlay Custom Sequence size
	 * \else
	 * OSD自定义排序大小
	 * \endif
	 */
	public static final int	MAX_OSD_CUSTOM_SORT_NUM                   = 8;

	/**
	 * \if ENGLISH_LANG
	 * Overlay Element Number
	 * \else
	 * 叠加元素个数
	 * \endif
	 */
	public static final int MAX_OSD_CUSTOM_SORT_ELEM_NUM  			  = 8;

	/**
	 * \if ENGLISH_LANG
	 * Detailed overlay element Number
	 * \else
	 * 具体叠加元素个数
	 * \endif
	 */
	public static final int MAX_OSD_CUSTOM_GENERAL_NUM    			 = 8;

	public static final int	MAX_CONF_CHAR 							     = 256;

	public static final int	MAX_OSD_CUSTOM_VALUE_LEN                 = 256;

	public static final int	MAX_PRE_POX_STR_LEN           			 = 32;
		/**
	 * \if ENGLISH_LANG
	 * The maximum Channels Number of audio input
	 * \else
	 * 音频输入最大通道数
	 * \endif
	 */
	public static final int MAX_AUDIO_INPUT_NUM                       = 32;

	/**
	 * \if ENGLISH_LANG
	 * The maximum Channels Number of audio output
	 * \else
	 * 音频输出最大通道数
	 * \endif
	 */
	public static final int MAX_AUDIO_OUTPUT_NUM                      = 16;

	/**
	 * \if ENGLISH_LANG
	 * The maximum Number of Light Global
	 * \else
	 * LC指示灯最大数
	 * \endif
	 */
	public static final int MAX_LIGHT_GLOBAL_NUM                      = 16;

	/**
	 * \if ENGLISH_LANG
	 * The maximum Length of DeviceID
	 * \else
	 * DeviceID最大长度
	 * \endif
	 */
	public static final int MAX_DEVICEID_LEN				 			 = 18;

	/**
	 * \if ENGLISH_LANG
	 * Max seat number
	 * \else
	 * 默认检测最大座驾个数
	 * \endif
	 */
	public static final int COMMON_SEAT_MAX_NUMBER       		    = 8;

	/**
	 * \if ENGLISH_LANG
	 * the max of car attachment number
	 * \else
	 * 最大车辆物件数量
	 * \endif
	 */
	public static final int NET_MAX_ATTACHMENT_NUM			       =  8;

	/**
	 * \if ENGLISH_LANG
	 *  the max of car AnnualInspection number
	 * \else
	 * 最大年检标识位置
	 * \endif
	 */
	public static final int NET_MAX_ANNUUALINSPECTION_NUM	       = 8	;

	/**
	 * \if ENGLISH_LANG
	 * the max of traffic event pic number
	 * \else
	 * 最大原始图片张数
	 * \endif
	 */
	public static final int NET_MAX_EVENT_PIC_NUM                  = 6;

	/**
	 * \if ENGLISH_LANG
	 * max length of car id
	 * \else
	 * RFID 电子车牌标签信息中卡号最大长度
	 * \endif
	 */
	public static final int MAX_RFIDELETAG_CARDID_LEN			 = 16;

	/**
	 * \if ENGLISH_LANG
	 * max length of date
	 * \else
	 * RFID 电子车牌标签信息中时间最大长度
	 * \endif
	 */
	public static final int MAX_RFIDELETAG_DATE_LEN		 	 	= 16;

	/**
	 * \if ENGLISH_LANG
	 * Max address length
	 * \else
	 * 最大地址长度
	 * \endif
	 */
	public static final int 	MAX_ADDRESS_LENGTH 				  = 256;


	/**
	 * \if ENGLISH_LANG
	 * Max username length
	 * \else
	 * 最大用户名长度
	 * \endif
	 */
	public static final int 	 MAX_USERNAME_LENGTH				  = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max password length
	 * \else
	 * 最大密码长度
	 * \endif
	 */
	public static final int 	MAX_PASSWORD_LENGTH				 =  64;

	/**
	 * \if ENGLISH_LANG
	 * max number of supported language
	 * \else
	 * 支持的最大语言个数
	 * \endif
	 */
	public static final int	MAX_SUPPORTED_LANGUAGE	        = 32;

	/**
	 * \if ENGLISH_LANG
	 * Length of PTZ preset name
	 * \else
	 * 云台预置点名称长度
	 * \endif
	 */
	public static final int PTZ_PRESET_NAME_LEN               = 64;

	/**
	 * \if ENGLISH_LANG
	 * max number of detected human face feature
	 * \else
	 * 目标特征最大个数
	 * \endif
	 */
	public static final int SDK_MAX_FACEDETECT_FEATURE_NUM   = 32;

	/**
	 * \if ENGLISH_LANG
	 * short for country
	 * \else
	 * 国家缩写长度
	 * \endif
	 */
	public static final int NET_COUNTRY_LENGTH		= 3	;

	/**
	 * \if ENGLISH_LANG
	 * comment length
	 * \else
	 * 备注信息长度
	 * \endif
	 */
	public static final int NET_COMMENT_LENGTH		= 100;

	/**
	 * \if ENGLISH_LANG
	 *  group id length
	 * \else
	 * group id 信息长度
	 * \endif
	 */
	public static final int NET_GROUPID_LENGTH		= 64;

	/**
	 * \if ENGLISH_LANG
	 * group name length
	 * \else
	 * group name 信息长度
	 * \endif
	 */
	public static final int NET_GROUPNAME_LENGTH		= 128;

	/**
	 * \if ENGLISH_LANG
	 * feature value length
	 * \else
	 * 目标特征 信息长度
	 * \endif
	 */
	public static final int NET_FEATUREVALUE_LENGTH	= 128;

	/**
	 * \if ENGLISH_LANG
	 * Max similarity count
	 * \else
	 * 最大目标对比库阈值个数
	 * \endif
	 */
	public static final int MAX_SIMILARITY_COUNT	  = 1024;

	/**
	 * \if ENGLISH_LANG
	 * max length of channel name
	 * \else
	 * 通道名称最大长度
	 * \endif
	 */
	public static final int MAX_CHANNEL_NAME_LEN    = 256;

	public static final int MAX_OUT_STATE_COUNT	  = 32;

	/**
	 * \if ENGLISH_LANG
	 * max count of coaxial IO control
	 * \else
	 * 同轴IO信息最大个数
	 * \endif
	 */
	public static final int MAX_COAXIAL_CONTROL_IO_COUNT	= 8;

	/**
	 * \if ENGLISH_LANG
	 * The max num of Wireless Device
	 * \else
	 * 无线设备最大数量
	 * \endif
	 */
	public static final int SDK_MAX_WIRELESS_DEV_NUM  = 80;

	/**
	 * \if ENGLISH_LANG
	 * Max supported size of combination scene
	 * \else
	 * 最大支持的场景组合项
	 * \endif
	 */
	public static final int MAX_SUPPORTED_COMP_SIZE   = 4;

	/**
	 * \if ENGLISH_LANG
	 * Video analyze supported face feature type max number
	 * \else
	 * 视频分析设备支持的目标属性列表个数上限
	 * \endif
	 */
	public static final int MAX_FEATURE_LIST_SIZE		= 32;

	/**
	 * \if ENGLISH_LANG
	 * Max number scene of combaination
	 * \else
	 * 每个组合项里最多支持的场景个数
	 * \endif
	 */
	public static final int MAX_SUPPORTED_COMP_DATA    = 8;

	/**
	 * \if ENGLISH_LANG
	 * Max count of detect window
	 * \else
	 * PIR检测区域最大个数
	 * \endif
	 */
	public static final int MAX_DETECT_WINDOW	= 4;

	/**
	 * \if ENGLISH_LANG
	 * Max NAS file num
	 * \else
	 * 最大的NAS文件个数
	 * \endif
	 */
	public static final int MAX_NASFILE_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * Max record file password len
	 * \else
	 * 最大的录像文件密码长度
	 * \endif
	 */
	public static final int MAX_RECORD_FILE_PASSWORD_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max title num
	 * \else
	 * 编码物件自定义标题最大数量
	 * \endif
	 */
	public static final int MAX_CUSTOM_TITLE_NUM = 8;

    /**
     * \if ENGLISH_LANG
     * Max pir param num
     * \else
     * pir参数最大个数
     * \endif
     */
    public static final int MAX_PIRPARAM_NUM = 10;

	/**
	 * \if ENGLISH_LANG
	 * Max phone id len
	 * \else
	 * 最大手机ID长度
	 * \endif
	 */
	public static final int MAX_PHONEID_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max event time len
	 * \else
	 * 最大事件时间长度
	 * \endif
	 */
	public static final int MAX_EVENTTIME_LEN = 20;

	/**
	 * \if ENGLISH_LANG
	 * Max log event num
	 * \else
	 * 最大日志事件个数
	 * \endif
	 */
	public static final int MAX_LOG_EVENT_NUM = 20;


	/**
	 * \if ENGLISH_LANG
	 * Max zone number
	 * \else
	 * 最大防区个数
	 * \endif
	 */
	public static final int MAX_ZONE_NUMBER = 72;

    /**
     * \if ENGLISH_LANG
     * Max area number
     * \else
     * 最大area数量
     * \endif
     */
    public static final int MAX_AREA_NUMBER = 8;

	/**
	 * \if ENGLISH_LANG
	 * Max area number Ex
	 * \else
	 * 最大area数量拓展
	 * \endif
	 */
	public static final int MAX_AREA_NUMBER_EX = 64;

    /**
	 * \if ENGLISH_LANG
	 * max len of IMSI
	 * \else
	 * IMSI值最大长度
	 * \endif
	 */
	public static final int MAX_IMSI_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * max len of ICCID
	 * \else
	 * ICCID值最大长度
	 * \endif
	 */
	public static final int MAX_ICCID_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max Chinese standard event ID len
	 * \else
	 * 国标事件ID最大长度
	 * \endif
	 */
	public static final int MAX_EVENT_ID_LEN = 52;

    /**
     * \if ENGLISH_LANG
     * Max Cargo Channel Num
     * \else
     * 最大货物通道数
     * \endif
     */
    public static final int MAX_CARGO_CHANNEL_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * max Logic volume name num
	 * \else
	 * 最大的分区名称个数
	 * \endif
	 */
	public static final int MAX_LV_NAME_NUM = 64;

	/**
	 * \if ENGLISH_LANG
	 * max Logic volume name len
	 * \else
	 * 最大的分区名称长度
	 * \endif
	 */
	public static final int MAX_LV_NAME_LEN = 128;

	/**
	 * \if ENGLISH_LANG
	 * Max local ext alarm name len
	 * \else
	 * 最大报警盒子的报警通道名称长度
	 * \endif
	 */
	public static final int MAX_LOCAL_EXT_ALARM_NAME_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * The Max Number of AccessControl
	 * \else
	 * 最大门禁操作的组合数
	 * \endif
	 */
	public static final int CFG_MAX_ACCESSCONTROL_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * The Max Length of the summary information superimposed on the JPEG picture
	 * \else
	 * 叠加到JPEG图片的摘要信息最大长度
	 * \endif
	 */
	public static final int CFG_MAX_SUMMARY_LEN = 1024;

	/**
	 * \if ENGLISH_LANG
	 * The Max Number of DBKey
	 * \else
	 * 数据库关键字最大值
	 * \endif
	 */
	public static final int CFG_MAX_DBKEY_NUM = 64;

	/**
	 * \if ENGLISH_LANG
	 * The Max Length of ChannelName
	 * \else
	 * 最大通道名称长度
	 * \endif
	 */
	public static final int CFG_MAX_CHANNELNAME_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * The Max Number of Video Channel is 256
	 * \else
	 * 最大通道数 256
	 * \endif
	 */
	public static final int CFG_MAX_VIDEO_CHANNEL_NUM = 256;

	/**
	 * \if ENGLISH_LANG
	 * The Max Number of Channel is 16
	 * \else
	 * 最大通道数 16
	 * \endif
	 */
	public static final int CFG_MAX_CHANNEL_COUNT = 16;

	/**
	 * \if ENGLISH_LANG
	 * The Max Number of PSTN Server
	 * \else
	 * 最大报警电话服务器数
	 * \endif
	 */
	public static final int  CFG_MAX_PSTN_SERVER_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * max count of senserID info
	 * \else
	 * 传感器ID数组最大个数
	 * \endif
	 */
	public static final int  MAX_SENSOR_ID_COUNT	= 256;

	/**
	 * \if ENGLISH_LANG
	 * Max count of coaxial alarm
	 * \else
	 * 同轴报警最大个数
	 * \endif
	 */
	public static final int  MAX_COAXIAL_ALARM_COUNT	 = 64;

	/**
	 * \if ENGLISH_LANG
	 * count of backlight configuration
	 * \else
	 * 光线环境配置个数
	 * \endif
	 */
	public static final int BACKLIGHT_CONFIG_COUNT	= 3;

	/**
	 * \if ENGLISH_LANG
	 * Max Count Of Video Channel
	 * \else
	 * 最大视频通道号
	 * \endif
	 */
	public static final int	MAX_VIDEO_CHANNEL_COUNT		= 128;

	/**
	 * \if ENGLISH_LANG
	 * Max Count Of Coaxial Sensor Info
	 * \else
	 * 传感器信息最大个数
	 * \endif
	 */
	public static final int	MAX_COAXIAL_SENSOR_INFO_COUNT		= 256;

	/**
	 * \if ENGLISH_LANG
	 * max Route number
	 * \else
	 * 最大路由数量
	 * \endif
	 */
	public static final int MAX_ROUTE_NUM   = 16;

	/**
	 * \if ENGLISH_LANG
	 * max remote IPC number
	 * \else
	 * 最大可配置的远程IPC个数
	 * \endif
	 */
	public static final int MAX_REMOTE_IPC_NUM = 64;

	/**
	 * \if ENGLISH_LANG
	 * max remote IPC IP address length
	 * \else
	 * 远程IPC IP地址最大长度
	 * \endif
	 */
	public static final int MAX_REMOTEIPCINFO_IPADDR_LEN        = 128;

	/**
	 * \if ENGLISH_LANG
	 * max remote IPC MAC address length
	 * \else
	 * 远程IPC MAC地址最大长度
	 * \endif
	 */
	public static final int MAX_REMOTEIPCINFO_MACADDR_LEN       = 64;

	/**
	 * \if ENGLISH_LANG
	 * max remote IPC username length
	 * \else
	 * 远程IPC用户名最大长度
	 * \endif
	 */
	public static final int MAX_REMOTEIPCINFO_USERNAME_LEN      = 128;

	/**
	 * \if ENGLISH_LANG
	 * max remote IPC password length
	 * \else
	 * 远程IPC密码最大长度
	 * \endif
	 */
	public static final int MAX_REMOTEIPCINFO_USERPSW_LENGTH    = 128;

	/**
	 * \if ENGLISH_LANG
	 * Audio channels array num of video
	 * \else
	 * 视频通道的伴音通道号列表数组的最大个数
	 * \endif
	 */
	public static final int MAX_AUDIOCHANNELS_ARRAY_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * Max feature state count
	 * \else
	 * 最大目标组建模状态个数
	 * \endif
	 */
	public static final int MAX_FEATURESTATE_NUM		     = 4;

	/**
	 * \if ENGLISH_LANG
	 * Max extension number of registered personnel information
	 * \else
	 * 注册人员信息扩展最大个数
	 * \endif
	 */
	public static final int SDK_MAX_CUSTOM_PERSON_INFO_NUM = 4;

	/**
	 * \if ENGLISH_LANG
	 * Max length of personnel extension information
	 * \else
	 * 人员扩展信息最大长度
	 * \endif
	 */
	public static final int SDK_MAX_PERSON_INFO_LEN    = 64;

	/**
	 * \if ENGLISH_LANG
	 * Max length of personnel extension information
	 * \else
	 * 最大小图张数
	 * \endif
	 */
	public static final int MAX_SMALLPIC_NUM	= 32;

	/**
	 * \if ENGLISH_LANG
	 * Max age num
	 * \else
	 * 最大年龄个数
	 * \endif
	 */
	public static final int MAX_AGE_NUM	 	= 2;

	/**
	 * \if ENGLISH_LANG
	 * Max emotion num
	 * \else
	 * 最大表情条件的个数
	 * \endif
	 */
	public static final int MAX_EMOTION_NUM	= 8;

	/**
	 * \if ENGLISH_LANG
	 * The max number of candidate information structure
	 * \else
	 * 候选信息结构体最大个数
	 * \endif
	 */
	public static final int MAX_FIND_COUNT  = 20;

	/**
	 * \if ENGLISH_LANG
	 * max local ip len
	 * \else
	 * 最大本地IP长度
	 * \endif
	 */
	public static final int MAX_LOCAL_IP_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * max spot path number
	 * \else
	 * 最大点位表路径个数
	 * \endif
	 */
	public static final int MAX_SCADA_POINT_LIST_INFO_NUM  = 256;

	/**
	 * \if ENGLISH_LANG
	 * max spot chart alarm number
	 * \else
	 * 最大点位表报警个数
	 * \endif
	 */
	public static final int MAX_SCADA_POINT_LIST_ALARM_INFO_NUM = 256;

	/**
	 * \if ENGLISH_LANG
	 * Max SCADADev config subscript number , as max channel
	 * \else
	 * 最大SCADADev配置下标个数, 即最大通道
	 * \endif
	 */
	public static final int MAX_SCADA_POINT_LIST_INDEX  = 8;

	/**
	 * \if ENGLISH_LANG
	 * max yx type spot number
	 * \else
	 *  最大遥信个数
	 * \endif
	 */
	public static final int MAX_SCADA_YX_NUM    = 128;

	/**
	 * \if ENGLISH_LANG
	 * max yc type spot number
	 * \else
	 * 最大遥测个数
	 * \endif
	 */
	public static final int MAX_SCADA_YC_NUM   = 128;

	/**
	 * \if ENGLISH_LANG
	 * max spot chart number
	 * \else
	 * 最大点表个数
	 * \endif
	 */
	public static final int MAX_SCADA_POINT_INFO_NUM   = 8;

	public static final int MAX_NET_SCADA_CAPS_TYPE = 16;
	public static final int MAX_NET_SCADA_CAPS_NAME = 16;

	/**
	 * \if ENGLISH_LANG
	 * Max count of spot id
	 * \else
	 * 最大检测点位ID个数
	 * \endif
	 */
	public static final int MAX_SCADA_ID_OF_SENSOR_NUM = 128;

	/**
	 * \if ENGLISH_LANG
	 * max contact len
	 * \else
	 * 接收安全码的联系方式最大长度
	 * \endif
	 */
	public static final int MAX_CONTACT_LEN             = 16;

	/**
	 * \if ENGLISH_LANG
	 * Maximum count of the peoples left
	 * \else
	 * 最大支持的离开人员数量
	 * \endif
	 */
	public static final int MAX_EXIT_MAN_NUM 			= 32;

	/**
	 * \if ENGLISH_LANG
	 * the max count of door number
	 * \else
	 * 最大门数量
	 * \endif
	 */
	public static final int MAX_ACCESSDOOR_NUM        = 128;

	public static final int MAX_INVITE_NUMBER_LIST	= 16;

	/**
	 * \if ENGLISH_LANG
	 * max class number len
	 * \else
	 * 最大班级长度
	 * \endif
	 */
	public static final int MAX_CLASS_NUMBER_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * max phone number len
	 * \else
	 * 最大电话长度
	 * \endif
	 */
	public static final int MAX_PHONENUMBER_LEN = 16;

    /**
     * \if ENGLISH_LANG
     * max access card name len
     * \else
     * 门禁卡命名最大长度
     * \endif
     */
    public static final int SDK_MAX_CARDNAME_LEN = 64;

    /**
     * \if ENGLISH_LANG
     * max companion card num
     * \else
     * 陪同者卡号最大个数
     * \endif
     */
    public static final int MAX_COMPANION_CARD_NUM = 6;

	/**
	 * \if ENGLISH_LANG
	 * dwDataType = NET_DATA_CALL_BACK_VALUE + emDataType
	 * dwDataType is the param in fRealDataCallBackEx and fDataCallBack
	 * emDataType is the enum in NET_IN_REALPLAY_BY_DATA_TYPE/NET_IN_PLAYBACK_BY_DATA_TYPE/NET_IN_DOWNLOAD_BY_DATA_TYPE
	 * \else
	 * 配合{@link EM_REAL_DATA_TYPE使用},码流转换后的数据回调函数(fRealDataCallBackEx,fDataCallBack)中的参数dwDataType的值,
	 * 为所转换的码流类型加上NET_DATA_CALL_BACK_VALUE,即dwDataType = NET_DATA_CALL_BACK_VALUE + emDataType
	 * 在回调函数中接受码流转换后的数据,必须要先判断 dwDataType 的值是否为 NET_DATA_CALL_BACK_VALUE和emDataType之和
	 * 另,EM_REAL_DATA_TYPE_PRIVATE不用做此判断
	 * \endif
	 */
	public static final int NET_DATA_CALL_BACK_VALUE = 1000;

	/**
	 * \if ENGLISH_LANG
	 * max len
	 * \else
	 * 最大自定义显示长度
	 * \endif
	 */
	public static final int MAX_CUSTOM_LEN = 128;

	/**
	 * \if ENGLISH_LANG
	 * max plate num length
	 * \else
	 * 最大车牌号码长度
	 * \endif
	 */
	public static final int MAX_PLATENUMBER_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * max plate num length
	 * \else
	 * 最大车牌号码长度
	 * \endif
	 */
	public static final int MAX_PLATE_NUMBER_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * max Car Owner's Name len
	 * \else
	 * 最大车主姓名长度
	 * \endif
	 */
	public static final int MAX_MASTER_OF_CAR_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * max user type len
	 * \else
	 * 最大用户类型长度
	 * \endif
	 */
	public static final int MAX_USER_TYPE_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * max park charge len
	 * \else
	 * 最大停车费长度
	 * \endif
	 */
	public static final int MAX_PARK_CHARGE_LEN = 32;

	/**
	 * \if ENGLISH_LANG
	 * max sub user type len
	 * \else
	 * 最大用户子类型长度
	 * \endif
	 */
	public static final int MAX_SUB_USER_TYPE_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * max remarks info len
	 * \else
	 * 最大备注信息长度
	 * \endif
	 */
	public static final int MAX_REMARKS_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * max resource len
	 * \else
	 * 最大资源文件长度
	 * \endif
	 */
	public static final int MAX_RESOURCE_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * MAX Stream Number
	 * \else
	 * 最大码流个数
	 * \endif
	 */
	public static final int MAX_STREAM_NUM = 4;

	/**
	 * \if ENGLISH_LANG
	 * max number of reabstract info
	 * \else
	 * 最大目标特征向量重建结果个数
	 * \endif
	 */
	public static final int MAX_ABSTRACT_INFO_NUM = 100;

	/**
	 * \if ENGLISH_LANG
	 * The largest multi-screen preview window dividing the number of species
	 * \else
	 * 最大多画面预览窗口分割种类数
	 * \endif
	 */
	public static final int MAX_PREVIEW_MODE_SPLIT_TYPE_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * max length of nFramesPerSecList array
	 * \else
	 * 最大支持的帧率个数
	 * \endif
	 */
	public static final int SDK_MAX_FPS_NUM = 128;

	/**
	 * \if ENGLISH_LANG
	 * max length of nQualityList array
	 * \else
	 * 最大支持的画质个数
	 * \endif
	 */
	public static final int SDK_MAX_QUALITY_NUM = 32;

	/**
	 * \if ENGLISH_LANG
	 * max exit man number
	 * \else
	 * 支持的最大的离开人数
	 * \endif
	 */
	public static final int MAX_EXITMAN_NUM = 32;

	/**
	 * \if ENGLISH_LANG
	 * Max zone number Extend
	 * \else
	 * 支持的最大的离开人数
	 * \endif
	 */
	public static final int MAX_ZONE_NUMBER_EX = 256;

	/**
	 * \if ENGLISH_LANG
	 * max radiometry temper number
	 * \else
	 * 最大温度统计信息个数
	 * \endif
	 */
	public static final int MAX_RADIOMETRY_TEMPER_NUM = 32;

	/**
	 * \if ENGLISH_LANG
	 * max coordinate number
	 * \else
	 * 最大坐标点个数
	 * \endif
	 */
	public static final int MAX_COORDINATE_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * Max number of attachment
	 * \else
	 * 最大订阅数量
	 * \endif
	 */
	public static final int MAX_ATTACHMENT_NUM = 8;

	/**
	 * \if ENGLISH_LANG
	 * PTZ Preset Name Length
	 * \else
	 * 云台预置点名称长度
	 * \endif
	 */
	public static final int MAX_PTZ_PRESET_NAME_LEN = 64;

	/**
	 * \if ENGLISH_LANG
	 * Maximum number of serial info
	 * \else
	 * 设备中可升级程序的最大个数
	 * \endif
	 */
	public static final int MAX_UPGRADER_SERIAL_INFO = 8;

	/**
	 * \if ENGLISH_LANG
	 * Max human trait event len
	 * \else
	 * 补充人体特征上报事件最大长度
	 * \endif
	 */
	public static final int MAX_HUMANTRAIT_EVENT_LEN = 36;

	/**
	 * \if ENGLISH_LANG
	 * custom title name len
	 * \else
	 * 自定义标题名称长度(扩充到1024)
	 * \endif
	 */
	public static final int CUSTOM_TITLE_LEN = 1024;
}

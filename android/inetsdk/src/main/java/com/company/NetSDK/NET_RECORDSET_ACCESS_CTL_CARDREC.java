package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access Control card Record Information
 * \else
 * 门禁刷卡记录记录集信息
 * \endif
 */
public class NET_RECORDSET_ACCESS_CTL_CARDREC implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Record Number,Read-Only
	 * \else
	 * 记录集编号，只读
	 * \endif
	 */
	public int			nRecNo; 
	
	/**
	 * \if ENGLISH_LANG
	 * Card Number
	 * \else
	 * 卡号
	 * \endif
	 */
	public byte			szCardNo[] 	= new byte[FinalVar.SDK_MAX_CARDNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * 密码
	 * \endif
	 */
	public byte			szPwd[] 	= new byte[FinalVar.SDK_MAX_CARDPWD_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Swing Card Time
	 * \else
	 * 刷卡时间
	 * \endif
	 */
	public NET_TIME		stuTime = new NET_TIME(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Swing Card Result,True is Succes,False is Fail
	 * \else
	 * 刷卡结果，TRUE表示成功，FALSE表示失败
	 * \endif
	 */
	public boolean		bStatus; 
	
	/**
	 * \if ENGLISH_LANG
	 * Open Door Method
	 * \else
	 * 开门方式
	 * 1:密码开锁
	 * 2:刷卡开锁
	 * 3:先刷卡后密码开锁
	 * 4:先密码后刷卡开锁
	 * 5:远程开锁，如通过室内机或者平台对门口机开锁
	 * 6:开锁按钮进行开锁
	 * \endif
	 */
	public int			emMethod;
	
	/**
	 * \if ENGLISH_LANG
	 * Door Number,That is {@link FinalVar#CFG_CMD_ACCESS_EVENT} Configure Array {@link CFG_ACCESS_EVENT_INFO} Subscript
	 * \else
	 * 门号，即 {@link FinalVar#CFG_CMD_ACCESS_EVENT} 配置 {@link CFG_ACCESS_EVENT_INFO} 的数组下标
	 * \endif
	 */
	public int			nDoor;

	/**
	 * \if ENGLISH_LANG
	 * User ID
	 * \else
	 * 用户ID
	 * \endif
	 */
	public byte 		szUserID[] = new byte[FinalVar.SDK_MAX_USERID_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Snap ftp URL
	 * \else
	 *  开锁抓拍上传的FTP地址
	 * \endif
	 */
	public byte 		szSnapFtpUrl[] = new byte[FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 *
	 * \else
	 * 读卡器ID
	 * \endif
	 */
	public byte 		szReaderID[] = new byte[FinalVar.SDK_COMMON_STRING_32];

	/**
	 * \if ENGLISH_LANG
	 * Card type,refer to NET_ACCESSCTLCARD_TYPE
	 * \else
	 * 卡类型，参考 NET_ACCESSCTLCARD_TYPE
	 * \endif
	 */
	public int			emCardType;

	/**
	 * \if ENGLISH_LANG
	 *  Reason of unlock failure, only because it is valid when bStatus is FALSE
	 * 0x00 no error
	 * 0x10 unauthorized
	 * 0x11 card lost or cancelled
	 * 0x12 no door right
	 * 0x13 unlock mode error
	 * 0x14 valid period error
	 * 0x15 anti sneak into mode
	 * 0x16 forced alarm not unlocked
	 * 0x17 door NC status
	 * 0x18 AB lock status
	 * 0x19 patrol card
	 * 0x1A device is under intrusion alarm status
	 * 0x20 period error
	 * 0x21 unlock period error in holiday period
	 * 0x30 first card right check required
	 * 0x40 card correct, input password error
	 * 0x41 card correct, input password timed out
	 * 0x42 card correct, input information error
	 * 0x43 card correct, input information timed out
	 * 0x44 information correct, input password error
	 * 0x45 information correct, input password timed out
	 * 0x50 group unlock sequence error
	 * 0x51 test required for group unlock
	 * 0x60 test passed, control unauthorized
	 * 0x61 card correct, input face error
	 * 0x62 card correct, input face timed out
	 * 0x63 repeat enter
	 * \else
	 * 开门失败的原因,仅在bStatus为FALSE时有效
	 * 0x00 没有错误
	 * 0x10 未授权
	 * 0x11 卡挂失或注销
	 * 0x12 没有该门权限
	 * 0x13 开门模式错误
	 * 0x14 有效期错误
	 * 0x15 防反潜模式
	 * 0x16 胁迫报警未打开
	 * 0x17 门常闭状态
	 * 0x18 AB互锁状态
	 * 0x19 巡逻卡
	 * 0x1A 设备处于闯入报警状态
	 * 0x20 时间段错误
	 * 0x21 假期内开门时间段错误
	 * 0x30 需要先验证有首卡权限的卡片
	 * 0x40 卡片正确,输入密码错误
	 * 0x41 卡片正确,输入密码超时
	 * 0x42 卡片正确,输入信息错误
	 * 0x43 卡片正确,输入信息超时
	 * 0x44 信息正确,输入密码错误
	 * 0x45 信息正确,输入密码超时
	 * 0x50 组合开门顺序错误
	 * 0x51 组合开门需要继续验证
	 * 0x60 验证通过,控制台未授权
	 * 0x61 卡片正确,目标错误
	 * 0x62 卡片正确,目标超时
	 * 0x63 重复进入
	 * \endif
	 */
	public int			nErrorCode;

	/**
	 * \if ENGLISH_LANG
	 * Record URL
	 * \else
	 * 刷卡录像的地址
	 * \endif
	 */
	public byte 		szRecordURL[] = new byte[FinalVar.MAX_COMMON_STRING_128];

	/**
	 * \if ENGLISH_LANG
	 * capture num
	 * \else
	 * 抓图的张数
	 * \endif
	 */
	public int			nNumbers;



	/**
	 * \if ENGLISH_LANG
	 * attendance state, refer to NET_ATTENDANCESTATE
	 * \else
	 * 考勤状态，参考 NET_ATTENDANCESTATE
	 * \endif
	 */
	public int 		emAttendanceState;

	/**
	 * \if ENGLISH_LANG
	 * Direction
	 * \else
	 * 开门方向
	 * \endif
	 */
	public int			emDirection;

	/**
	 * \if ENGLISH_LANG
	 * Class number
	 * \else
	 * 班级（考勤）
	 * \endif
	 */
	public byte 		szClassNumber[] = new byte[FinalVar.MAX_CLASS_NUMBER_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Phone number
	 * \else
	 * 电话（考勤）
	 * \endif
	 */
	public byte 		szPhoneNumber[] = new byte[FinalVar.MAX_PHONENUMBER_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Card name
	 * \else
	 * 卡命名
	 * \endif
	 */
	public byte 		szCardName[] = new byte[FinalVar.SDK_MAX_CARDNAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * wireless device serial number
	 * \else
	 * 智能锁序列号,无线配件需要该字段
	 * \endif
	 */
	public byte 		szSN[] = new byte[FinalVar.SDK_COMMON_STRING_32];

	/**
	 * \if ENGLISH_LANG
	 * man temperature info
	 * \else
	 * 人员温度信息
	 * \endif
	 */
	public NET_MAN_TEMPERATURE_INFO	stuManTemperatureInfo = new NET_MAN_TEMPERATURE_INFO();
}

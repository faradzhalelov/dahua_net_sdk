package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access Control Event, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_ACCESS_CTL_EVENT}
 * \else
 * 门禁事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_ACCESS_CTL_EVENT}
 * \endif
 */
public class ALARM_ACCESS_CTL_EVENT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Door Channel No.
	 * \else
	 * 门通道号
	 * \endif
	 */
	public int                         nDoor;
	
	/**
	 * \if ENGLISH_LANG
	 * Access Control Name
	 * \else
	 * 门禁名称
	 * \endif
	 */
	public byte                        szDoorName[] = new byte[FinalVar.SDK_MAX_DOORNAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Time
	 * \else
	 * 报警事件发生的时间
	 * \endif
	 */
	public NET_TIME                    stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Access Control Event Type, refer to {@link NET_ACCESS_CTL_EVENT_TYPE}
	 * \else
	 * 门禁事件类型,取值参考 {@link NET_ACCESS_CTL_EVENT_TYPE}
	 * \endif
	 */
	public int                         emEventType;
	
	/**
	 * \if ENGLISH_LANG
	 * Access Control Event Type
	 * \else
	 * 刷卡结果，TRUE表示成功，FALSE表示失败
	 * \endif
	 */
	public boolean                     bStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * Card Type, refer to {@link NET_ACCESSCTLCARD_TYPE}
	 * \else
	 * 卡类型,取值参考 {@link NET_ACCESSCTLCARD_TYPE}
	 * \endif
	 */
	public int                         emCardType;
	
	/**
	 * \if ENGLISH_LANG
	 * Unlock Method. refer to {@link NET_ACCESS_DOOROPEN_METHOD}
	 * \else
	 * 开门方式,取值参考 {@link NET_ACCESS_DOOROPEN_METHOD}
	 * \endif
	 */
	public int                         emOpenMethod;
	
	/**
	 * \if ENGLISH_LANG
	 * Card No.
	 * \else
	 * 卡号
	 * \endif
	 */
	public byte                        szCardNo[] = new byte[FinalVar.SDK_MAX_CARDNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * 密码
	 * \endif
	 */
	public byte                        szPwd[] = new byte[FinalVar.SDK_MAX_CARDPWD_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Reader ID
	 * \else
	 * 门读卡器ID
	 * \endif
	 */
	public byte                        szReaderID[] = new byte[FinalVar.SDK_COMMON_STRING_32];

	/**
	 * \if ENGLISH_LANG
	 * unlock user
	 * \else
	 * 开门用户
	 * \endif
	 */
	public byte                        szUserID[] = new byte[FinalVar.SDK_COMMON_STRING_64];

	/**
	 * \if ENGLISH_LANG
	 * snapshot picture storage address
	 * \else
	 * 抓拍照片存储地址
	 * \endif
	 */
	public byte                        szSnapURL[] = new byte[FinalVar.SDK_COMMON_STRING_256];

	/**
	 * \if ENGLISH_LANG
	 * Reason of unlock failure, only because it is valid when bStatus is FALSE
	 * \else
	 * 开门失败的原因,仅在bStatus为FALSE时有效
	 *     0x00 没有错误
	 *     0x10 未授权
	 *     0x11 卡挂失或注销
	 *     0x12 没有该门权限
	 *     0x13 开门模式错误
	 *     0x14 有效期错误
	 *     0x15 防反潜模式
	 *     0x16 胁迫报警未打开
	 *     0x17 门常闭状态
	 *     0x18 AB互锁状态
	 *     0x19 巡逻卡
	 *     0x1A 设备处于闯入报警状态
	 *     0x20 时间段错误
	 *     0x21 假期内开门时间段错误
	 *     0x30 需要先验证有首卡权限的卡片
	 *     0x40 卡片正确,输入密码错误
	 *     0x41 卡片正确,输入密码超时
	 *     0x42 卡片正确,输入信息错误
	 *     0x43 卡片正确,输入信息超时
	 *     0x44 信息正确,输入密码错误
	 *     0x45 信息正确,输入密码超时
	 *     0x50 组合开门顺序错误
	 *     0x51 组合开门需要继续验证
	 *     0x60 验证通过,控制台未授权
	 *     0x61 卡片正确,目标错误
	 *     0x62 卡片正确,目标超时
	 *     0x63 重复进入
	 *     0x64 未授权,需要后端平台识别
	 *     0x65 体温过高
	 *     0x66	未戴口罩
	 *     0x67 健康码获取失败
	 *     0x68 黄码禁止通行
	 *     0x69 红码禁止通行
	 *     0x6a 健康码无效
	 *     0x6b 绿码验证通过
	 *     0x70 获取健康码信息
	 * \endif
	 */
	public int                         nErrorCode;

	/**
	 * \if ENGLISH_LANG
	 * punching record number
	 * \else
	 * 刷卡记录集中的记录编号
	 * \endif
	 */
	public int                         nPunchingRecNo;

	/**
	 * \if ENGLISH_LANG
	 * pic Numbers
	 * \else
	 * 抓图张数
	 * \endif
	 */
	public int                         nNumbers;

	/**
	 * \if ENGLISH_LANG
	 * Card Status {@link NET_ACCESSCTLCARD_STATE}
	 * \else
	 * 卡状态 {@link NET_ACCESSCTLCARD_STATE}
	 * \endif
	 */
	public int                         emStatus;

	/**
	 * \if ENGLISH_LANG
	 *  wireless deivce serial number
	 * \else
	 * 智能锁序列号
	 * \endif
	 */
	public byte                        szSN[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * attend state {@link NET_ATTENDANCESTATE}
	 * \else
	 * 考勤状态 {@link NET_ATTENDANCESTATE}
	 * \endif
	 */
	public int                         emAttendanceState;

	/**
	 * \if ENGLISH_LANG
	 *  QRcode
	 * \else
	 * 二维码
	 * \endif
	 */
	public byte                        szQRCode[] = new byte[512];

	/**
	 * \if ENGLISH_LANG
	 *  Floor of Call Lift
	 * \else
	 * 呼梯楼层号
	 * \endif
	 */
	public byte                        szCallLiftFloor[] = new byte[16];

}

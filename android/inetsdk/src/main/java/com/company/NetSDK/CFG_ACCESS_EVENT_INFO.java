package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access event configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_ACCESS_EVENT }
 * \else
 * 门禁事件配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_ACCESS_EVENT }
 * \endif
 */
public class CFG_ACCESS_EVENT_INFO implements Serializable  {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel Name
     * \else
     * 门禁通道名称
     * \endif
     */
    public byte                             szChannelName[] = new byte[FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Access state,refer to {@link CFG_ACCESS_STATE}
     * \else
     * 门禁状态，参考 CFG_ACCESS_STATE
     * \endif
     */
    public int                                  emState;

    /**
     * \if ENGLISH_LANG
     * Access mode,refer to {@link CFG_ACCESS_MODE}
     * \else
     * 门禁模式,参考CFG_ACCESS_MODE
     * \endif
     */
    public int                                  emMode;

    /**
     * \if ENGLISH_LANG
     * Enable access level value, 0: active low (powered down start); 1: active high (power-up);
     * \else
     * 门禁使能电平值, 0:低电平有效(断电启动); 1:高电平有效(通电启动);
     * \endif
     */
    public int                                  nEnableMode;

    /**
     * \if ENGLISH_LANG
     * Event linkage screenshots can make
     * \else
     * 事件联动抓图使能
     * \endif
     */
    public  boolean                            bSnapshotEnable;

    /**
     * \if ENGLISH_LANG
     * The following are ability,from abDoorOpenMethod to abAutoRemoteCheck
     * \else
     * 从abDoorOpenMethod到abAutoRemoteCheck都是能力
     * \endif
     */

    public  boolean                            abDoorOpenMethod;

    public  boolean                            abUnlockHoldInterval;

    public  boolean                            abCloseTimeout;

    public  boolean                            abOpenAlwaysTimeIndex;

    public  boolean                            abCloseAlwaysTimeIndex;

    public  boolean                            abHolidayTimeIndex;

    public  boolean                            abBreakInAlarmEnable;

    public  boolean                            abRepeatEnterAlarmEnable;

    public  boolean                            abDoorNotClosedAlarmEnable;

    public  boolean                            abDuressAlarmEnable;

    public  boolean                            abDoorTimeSection;

    public  boolean                            abSensorEnable;

    public  boolean                            abFirstEnterEnable;

    public  boolean                            abRemoteCheck;

    public  boolean                            abRemoteDetail;

    public  boolean                            abHandicapTimeOut;

    public  boolean                            abCheckCloseSensor;

    public  boolean                            abAutoRemoteCheck;

    /**
     * \if ENGLISH_LANG
     * Open the door way,refer to{@link  CFG_DOOR_OPEN_METHOD}
     * \else
     * 开门方式,参考{@link  CFG_DOOR_OPEN_METHOD}
     * \endif
     */
    public int                                  emDoorOpenMethod;

    /**
     * \if ENGLISH_LANG
     * Lock hold time (automatic closing time), in milliseconds, [250, 20000]
     * \else
     * 门锁保持时间(自动关门时间),单位毫秒,[250, 20000]
     * \endif
     */
    public int                                  nUnlockHoldInterval;
    /**
     * \if ENGLISH_LANG
     * Closed timeout, more than threshold value are not closed will trigger the alarm, unit of seconds, [0999]; 0 means no detection timeout
     * \else
     * 关门超时时间, 超过阈值未关会触发报警，单位秒,[0,9999];0表示不检测超时
     * \endif
     */
    public int                                  nCloseTimeout;
    /**
     * \if ENGLISH_LANG
     * always open time period, subscript of CFG ACCESS_TIME SCHEDULEINFO array
     * \else
     * 常开时间段, 值为CFG_ACCESS_TIMESCHEDULE_INFO配置的数组下标
     * \endif
     */
    public int                                  nOpenAlwaysTimeIndex;
    /**
     * \if ENGLISH_LANG
     * always close time period, subscript of CFG ACCESS_TIME SCHEDULEINFO array
     * \else
     * 常关时间段, 值为CFG_ACCESS_TIMESCHEDULE_INFO配置的数组下标
     * \endif
     */
    public int                                  nCloseAlwaysTimeIndex;
    /**
     * \if ENGLISH_LANG
     * Within the holiday period, value of holiday record set record number, corresponding NET_RECORDSET_HOLIDAY nRecNo
     * \else
     * 假期内时间段, 值为假日记录集的记录编号，对应NET_RECORDSET_HOLIDAY的nRecNo
     * \endif
     */
    public int                                  nHolidayTimeRecoNo;
    /**
     * \if ENGLISH_LANG
     * Intrusion alarm enable
     * \else
     * 闯入报警使能
     * \endif
     */
    public boolean                             bBreakInAlarmEnable;
    /**
     * \if ENGLISH_LANG
     * Antisubmarine alarm enable
     * \else
     * 反潜报警使能
     * \endif
     */
    public boolean                             bRepeatEnterAlarm;
    /**
     * \if ENGLISH_LANG
     * The door is not closed alarm enable
     * \else
     * 门未关报警使能
     * \endif
     */
    public boolean                             bDoorNotClosedAlarmEnable;
    /**
     * \if ENGLISH_LANG
     * Duress alarm enable
     * \else
     * 胁迫报警使能
     * \endif
     */
    public boolean                             bDuressAlarmEnable;
    /**
     * \if ENGLISH_LANG
     * The information period of time to open the door
     * \else
     * 分时段开门信息
     * \endif
     */
    public CFG_DOOROPEN_TIMESECTION_INFO	stuDoorTimeSection[][] = new CFG_DOOROPEN_TIMESECTION_INFO[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_DOOR_TIME_SECTION];
    /**
     * \if ENGLISH_LANG
     * Magnetic enable
     * \else
     * 门磁使能
     * \endif
     */
    public boolean                             bSensorEnable;
    /**
     * \if ENGLISH_LANG
     * First card unlock info
     * \else
     * 首卡开门信息
     * \endif
     */
    public CFG_ACCESS_FIRSTENTER_INFO stuFirstEnterInfo  = new CFG_ACCESS_FIRSTENTER_INFO();
    /**
     * \if ENGLISH_LANG
     * Need platform verification, TRUE means when right verification is passed, you must pass platform verification before you can unlock, FALSE means when right verification is passed, you can unlock
     * \else
     * 是否需要平台验证, TRUE表示权限通过后必须要平台验证后才能开门, FALSE表示权限验证通过后可立即开门
     * \endif
     */
    public boolean                             bRemoteCheck;
    /**
     * \if ENGLISH_LANG
     * work with "bRemoteCheck", door will open or close after over time if remove check on platform side is not responsed
     * \else
     * 与bRemoteCheck配合使用, 如果远端验证未应答, 设定的设备超时时间到后, 是正常开门还是不开门
     * \endif
     */
    public CFG_REMOTE_DETAIL_INFO               stuRemoteDetail = new CFG_REMOTE_DETAIL_INFO();
    /**
     * \if ENGLISH_LANG
     * time out info for handicap
     * \else
     * 针对残障人士的开门参数
     * \endif
     */
    public CFG_HANDICAP_TIMEOUT_INFO            stuHandicapTimeOut = new CFG_HANDICAP_TIMEOUT_INFO();
    /**
     * \if ENGLISH_LANG
     * check the lock sensor or not before close
     * \else
     * 闭锁前是否检测门磁
     * \endif
     */
    public boolean                             bCloseCheckSensor;
    // true:则当开锁保持时间计时结束后，只有监测到有效门磁信号时，才可以恢复关闭锁的动作。
    // 反之，如果开锁保持时间已到，但未检测到有效门磁信号，则一直保持开锁状态；
    // false(默认):则直接按照设定的开锁保持时间进行开锁保持和恢复关闭的动作。

    /**
     * \if ENGLISH_LANG
     * remote check to open door, if enabled, controller will send "DH_ALARM_OPENDOORGROUP" event to notify platform whether to open door
     * \else
     * 开门远程验证, 如果开启, 在该时间段内, 设备通过多人组合开门事件通知到平台确认是否可以开门
     * \endif
     */
    public CFG_AUTO_REMOTE_CHECK_INFO           stuAutoRemoteCheck = new CFG_AUTO_REMOTE_CHECK_INFO();
    /**
     * \if ENGLISH_LANG
     * Enable local control, TRUE: enable, FALSE: unable
     * \else
     * 本地控制启用, TRUE  启用   FALSE 停用
     * \endif
     */
    public boolean                             bLocalControlEnable;
    /**
     * \if ENGLISH_LANG
     * Enable remote control, TRUE: enable, FALSE: unable
     * \else
     * 远程控制启用, TRUE  启用   FALSE 停用
     * \endif
     */
    public boolean                             bRemoteControlEnable;
    /**
     * \if ENGLISH_LANG
     * Sensor output delay, unit: sec, 0~10
     * \else
     * 传感器输出延时，超过此时间判断有人, 单位：秒。 0~10
     * \endif
     */
    public int                                  nSensorDelay;
    /**
     * \if ENGLISH_LANG
     * Detect sensitivity of human status, unit: sec, 0~300
     * \else
     * 人状态变化检测灵敏度,在此时间内，判断有人 单位： 秒。 0~300
     * \endif
     */
    public int                                  nHumanStatusSensitivity;
    /**
     * \if ENGLISH_LANG
     * Detect sensitivity of sensor itself, unit: %, 0~100
     * \else
     * 传感器本身的检测灵敏度  单位：%， 0~100
     * \endif
     */
    public int                                  nDetectSensitivity;
    /**
     * \if ENGLISH_LANG
     * latch enable
     * \else
     * 锁舌使能
     * \endif
     */
    public boolean                             bLockTongueEnable;
    /**
     * \if ENGLISH_LANG
     * AB lock line ,according to index, -1:invalid
     * \else
     * AB互锁路线与AB互锁的index对应；-1代表无效
     * \endif
     */
    public int                                  nABLockRoute;
    /**
     * \if ENGLISH_LANG
     * door not close reader alarm time, unit：sec
     * \else
     * 门未关超时读卡器报警, 单位：秒
     * \endif
     */
    public int                                nDoorNotClosedReaderAlarmTime;
    /**
     * \if ENGLISH_LANG
     * Enable this channel config,TRUE is enable,FALSE is unable
     * \else
     * 使能项,此通道配置是否启用,TRUE为使能,FALSE为关闭
     * \endif
     */
    public boolean                            bEnable;
    /**
     * \if ENGLISH_LANG
     * Wireless device SN,Only read
     * \else
     * 无线设备序列号,只获取，不能设置
     * \endif
     */
    public byte				                 szSN[] = new byte[FinalVar.CFG_MAX_SN_LEN];
    /**
     * \if ENGLISH_LANG
     * Close duration,Unit:second
     * \else
     * 门闭合时间,单位：秒
     * \endif
     */
    public int					                 nCloseDuration;
    /**
     * \if ENGLISH_LANG
     * Unlock reload interval,Unit:millisecond
     * \else
     * 开锁命令响应间隔时间,单位:毫秒
     * \endif
     */
    public int					                 nUnlockReloadInterval;
    /**
     * \if ENGLISH_LANG
     * protocol function of serial protocol, Valid when emAccessProtocol is CFG_EM_ACCESS_PROTOCOL_SERIAL
     * refer to {@Link CFG_EM_ACCESS_PROTOCOL}
     * \else
     * 门禁协议,参考CFG_EM_ACCESS_PROTOCOL
     * \endif
     */
    public int		                             emAccessProtocol;
    /**
     * \if ENGLISH_LANG
     * Event linkage screenshots can make,refer to CFG_EM_SERIAL_PROTOCOL_TYPE
     * \else
     * 串口协议下的具体协议功能,当emAccessProtocol为CFG_EM_ACCESS_PROTOCOL_SERIAL时有效,参考 CFG_EM_SERIAL_PROTOCOL_TYPE
     * \endif
     */
    public int	                                 emProtocolType;
    /**
     * \if ENGLISH_LANG
     * Access control Udp lock info,Valid when emAccessProtocol is CFG_EM_ACCESS_PROTOCOL_REMOTE
     * \else
     * 门禁udp开锁信息,当emAccessProtocol为CFG_EM_ACCESS_PROTOCOL_REMOTE时有效
     * \endif
     */
    public CFG_ACCESS_CONTROL_UDP_INFO	         stuAccessControlUdpInfo = new CFG_ACCESS_CONTROL_UDP_INFO();
    /**
     * \if ENGLISH_LANG
     * Entrance lock channel, Valid when emAccessProtocol is CFG_EM_ACCESS_PROTOCOL_REMOTE
     * \else
     * 门禁控制器下的子通道,当emAccessProtocol为CFG_EM_ACCESS_PROTOCOL_REMOTE时有效
     * \endif
     */
    public int				                     nEntranceLockChannel;
    /**
     * \if ENGLISH_LANG
     * Enable snap shot upload,TRUE is upload,FALSE is not upload
     * \else
     * 使能项,抓图是否上传,TRUE为抓图上传,FALSE为抓图不上传
     * \endif
     */
    public boolean                             bSnapshotUpload;
    /**
     * \if ENGLISH_LANG
     * snap upload pos,corresponding to NAS config index,NAS config is CFG_CMD_NASEX
     * \else
     * 抓图上传地址,对应的是NAS配置项的下标，NAS配置为CFG_CMD_NASEX
     * \endif
     */
    public int				                     nSnapUploadPos;
    /**
     * \if ENGLISH_LANG
     * enable to custompassword
     * \else
     * 是否启用个性化密码
     * \endif
     */
    public boolean                             bCustomPasswordEnable;
    /**
     * \if ENGLISH_LANG
     * repeat enter time,0~180s，0:unable
     * \else
     * 重复进入时间,0~180秒，0表示不启用
     * \endif
     */
    public int                                  nRepeatEnterTime;
    /**
     * \if ENGLISH_LANG
     * Card no convert,0:not convert,1:invert,2:HIDpro
     * \else
     * 卡号转换，0:不需要转换,1:字节取反,2:按HIDpro转换
     * \endif
     */
    public int                                  nCardNoConvert;
    /**
     * \if ENGLISH_LANG
     * enable to alarm of unauthorized maliciousdwip
     * \else
     * 未授权恶意刷卡事件使能
     * \endif
     */
    public boolean                             bUnAuthorizedMaliciousSwipEnable;
    /**
     * \if ENGLISH_LANG
     * enable to alarm of fakelocked
     * \else
     * 假锁报警使能
     * \endif
     */
    public boolean                             bFakeLockedAlarmEnable;

    public CFG_ACCESS_EVENT_INFO() {
        for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
            for (int j = 0; j < FinalVar.MAX_DOOR_TIME_SECTION; j++) {
                stuDoorTimeSection[i][j] = new CFG_DOOROPEN_TIMESECTION_INFO();
            }
        }
    }
}

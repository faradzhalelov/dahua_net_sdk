package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 *  User Info
 * \else
 * 	用户信息
 * \endif
 */
public class NET_ACCESS_USER_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  user ID
     * \else
     * 用户ID
     * \endif
     */
    public byte     szUserID[] = new byte[FinalVar.SDK_MAX_USERID_LEN];

    /**
     * \if ENGLISH_LANG
     *  user name
     * \else
     * 人员名称
     * \endif
     */
    public byte     szName[] = new byte[FinalVar.MAX_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     *  user type
     * \else
     * 用户类型
     * \endif
     */
    public int     emUserType;

    /**
     * \if ENGLISH_LANG
     *  user status, 0 normal, 1 freeze
     * \else
     * 用户状态, 0 正常, 1 冻结
     * \endif
     */
    public int     nUserStatus;

    /**
     * \if ENGLISH_LANG
     *  user times of guest
     * \else
     * 来宾卡的通行次数
     * \endif
     */
    public int     nUserTime;

    /**
     * \if ENGLISH_LANG
     *  CardID no
     * \else
     * 证件号码
     * \endif
     */
    public byte     szCitizenIDNo[] = new byte[FinalVar.MAX_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     *  UserID+password
     * \else
     * UserID+密码开门时密码
     * \endif
     */
    public byte     szPsw[] = new byte[FinalVar.SDK_MAX_CARDPWD_LEN];

    /**
     * \if ENGLISH_LANG
     *  door number
     * \else
     * 有效的门数目
     * \endif
     */
    public int     nDoorNum;

    /**
     * \if ENGLISH_LANG
     *  Privileged Door Number,That is CFG_CMD_ACCESS_EVENT Configure Array Subscript
     * \else
     * 有权限的门序号,即 CFG_CMD_ACCESS_EVENT 配置的数组下标
     * \endif
     */
    public int     nDoors[] = new int[FinalVar.SDK_MAX_DOOR_NUM];

    /**
     * \if ENGLISH_LANG
     *  the Number of Effective Open Time
     * \else
     * 有效的的开门时间段数目
     * \endif
     */
    public int     nTimeSectionNum;

    /**
     * \if ENGLISH_LANG
     *  Open Time Segment Index,That is CFG_ACCESS_TIMESCHEDULE_INFO Array subscript
     * \else
     * 开门时间段索引,即 CFG_ACCESS_TIMESCHEDULE_INFO 的数组下标
     * \endif
     */
    public int     nTimeSectionNo[] = new int[FinalVar.SDK_MAX_TIMESECTION_NUM];

    /**
     * \if ENGLISH_LANG
     *  the number of specialday
     * \else
     * 假日计划表示数量
     * \endif
     */
    public int     nSpecialDaysScheduleNum;

    /**
     * \if ENGLISH_LANG
     *  Open specialday index, That is NET_EM_CFG_ACCESSCTL_SPECIALDAYS_SCHEDULE Array subscript
     * \else
     * 假日计划标识, 即 NET_EM_CFG_ACCESSCTL_SPECIALDAYS_SCHEDULE 配置的下标
     * \endif
     */
    public int     nSpecialDaysSchedule[] = new int[FinalVar.MAX_ACCESSDOOR_NUM];

    /**
     * \if ENGLISH_LANG
     *  Valid Begin Time
     * \else
     * 开始有效期
     * \endif
     */
    public NET_TIME     stuValidBeginTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Valid End Time
     * \else
     * 结束有效期
     * \endif
     */
    public NET_TIME     stuValidEndTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  has first card or not
     * \else
     * 是否拥有首卡权限
     * \endif
     */
    public boolean     bFirstEnter;

    /**
     * \if ENGLISH_LANG
     *  has first card door number
     * \else
     * 拥有首用户权限的门数量
     * \endif
     */
    public int     nFirstEnterDoorsNum;

    /**
     * \if ENGLISH_LANG
     *  has first card door No,FirstEnter-1 means all channels
     * \else
     * 拥有首用户权限的门序号，bFirstEnter为TRUE时有效,-1表示全通道
     * \endif
     */
    public int     nFirstEnterDoors[] = new int[FinalVar.SDK_MAX_DOOR_NUM];

    /**
     * \if ENGLISH_LANG
     *  user authority
     * \else
     * 用户权限，可选
     * \endif
     */
    public int     emAuthority;

    /**
     * \if ENGLISH_LANG
     *  repeatenter timeout time
     * \else
     * 反潜超时时间
     * \endif
     */
    public int     nRepeatEnterRouteTimeout;

    /**
     * \if ENGLISH_LANG
     *  floor number
     * \else
     * 有效的楼层数量
     * \endif
     */
    public int     nFloorNum;

    /**
     * \if ENGLISH_LANG
     *  floor
     * \else
     * 楼层号
     * \endif
     */
    public byte     szFloorNo[][] = new byte[FinalVar.MAX_ACCESS_FLOOR_NUM][FinalVar.SDK_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     *  room number
     * \else
     * 房间个数
     * \endif
     */
    public int     nRoom;

    /**
     * \if ENGLISH_LANG
     *  room
     * \else
     * 房间号列表
     * \endif
     */
    public byte     szRoomNo[][] = new byte[FinalVar.MAX_ROOMNUM_COUNT][FinalVar.SDK_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     *  if szFloorNoEx is valid, TRUE:valid, else invalid
     * \else
     * szFloorNoEx 是否有效
     * \endif
     */
    public boolean     bFloorNoExValid;

    /**
     * \if ENGLISH_LANG
     *  floor number extended
     * \else
     * 有效的楼层数量扩展
     * \endif
     */
    public int     nFloorNumEx;

    /**
     * \if ENGLISH_LANG
     *  floor info
     * \else
     * 楼层号扩展
     * \endif
     */
    public byte     szFloorNoEx[][] = new byte[256][4];

    /**
     * \if ENGLISH_LANG
     *  class info
     * \else
     * 班级信息
     * \endif
     */
    public byte     szClassInfo[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     *  student num
     * \else
     * 学号
     * \endif
     */
    public byte     szStudentNo[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  card address
     * \else
     * 证件地址
     * \endif
     */
    public byte     szCitizenAddress[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  birth day (year month day are valid)
     * \else
     * 出生日期（年月日有效）
     * \endif
     */
    public NET_TIME     stuBirthDay = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  sex
     * \else
     * 性别
     * \endif
     */
    public int     emSex;

    /**
     * \if ENGLISH_LANG
     *  department
     * \else
     * 部门
     * \endif
     */
    public byte     szDepartment[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  site code
     * \else
     * 站点码
     * \endif
     */
    public byte     szSiteCode[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  PhoneNumber
     * \else
     * 手机号码
     * \endif
     */
    public byte     szPhoneNumber[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Default floor number (elevator control requirements)
     * \else
     * 默认楼层号
     * \endif
     */
    public byte     szDefaultFloor[] = new byte[8];

    /**
     * \if ENGLISH_LANG
     *  stuFloorsEx2 wheather valid
     * \else
     * 是否使用扩展结构体
     * \endif
     */
    public boolean     bFloorNoEx2Valid;

    /**
     * \if ENGLISH_LANG
     *  Floor number (extended again)
     * \else
     * 楼层号（再次扩展）
     * \endif
     */
    public NET_FLOORS_INFO[]     pstuFloorsEx2;

    /**
     * \if ENGLISH_LANG
     *  Personnel health status 
     * \else
     * 人员健康状态 
     * \endif
     */
    public boolean     bHealthStatus;

    /**
     * \if ENGLISH_LANG
     *  The number of valid verifications for the user's own door opening time
     * \else
     * 用户自身的开门时间段校验有效个数
     * \endif
     */
    public int     nUserTimeSectionsNum;

    /**
     * \if ENGLISH_LANG
     *  Check the user's own door opening time period
     * \else
     * 针对用户自身的开门时间段校验
     * \endif
     */
    public byte     szUserTimeSections[][] = new byte[6][20];

    /**
     * \if ENGLISH_LANG
     *  MZ
     * \else
     * MZ
     * \endif
     */
    public byte     szECType[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  type of certificate
     * \else
     * 证件类型
     * \endif
     */
    public int     emTypeOfCertificate;

    /**
     * \if ENGLISH_LANG
     *  Nationality or area code, in line with GB/T 2659-2000
     * \else
     * 国籍或所在地区代码，符合GB/T 2659-2000的规范
     * \endif
     */
    public byte     szCountryOrAreaCode[] = new byte[8];

    /**
     * \if ENGLISH_LANG
     *  Nationality or area name, in line with GB/T 2659-2000
     * \else
     * 国籍或所在地区名称，符合GB/T 2659-2000的规范
     * \endif
     */
    public byte     szCountryOrAreaName[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  The version number of the permanent residence permit
     * \else
     * 永久居住证的证件版本号
     * \endif
     */
    public byte     szCertificateVersionNumber[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  Application acceptance agency code
     * \else
     * 申请受理机关代码
     * \endif
     */
    public byte     szApplicationAgencyCode[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  issuing authority
     * \else
     * 签发机关
     * \endif
     */
    public byte     szIssuingAuthority[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  Start time of certificate validity
     * \else
     * 证件有效开始时间
     * \endif
     */
    public byte     szStartTimeOfCertificateValidity[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  End time of certificate validity
     * \else
     * 证件有效结束时间
     * \endif
     */
    public byte     szEndTimeOfCertificateValidity[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  Number of certificates issued
     * \else
     * 证件签发次数
     * \endif
     */
    public int     nSignNum;

    /**
     * \if ENGLISH_LANG
     *  Actual home address
     * \else
     * 实际家庭住址
     * \endif
     */
    public byte     szActualResidentialAddr[] = new byte[108];

    /**
     * \if ENGLISH_LANG
     *  Work class
     * \else
     * 工作班别
     * \endif
     */
    public byte     szWorkClass[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     *  Start time within valid time period
     * \else
     * 有效时间段内启动时间
     * \endif
     */
    public NET_TIME     stuStartTimeInPeriodOfValidity = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Test items
     * \else
     * 测试项目
     * \endif
     */
    public int     emTestItems;

    /**
     * \if ENGLISH_LANG
     *  Whether to use the szNameEx field
     * \else
     * szNameEx 是否有效，为TRUE时，使用szNameEx字段
     * \endif
     */
    public boolean     bUseNameEx;

    /**
     * \if ENGLISH_LANG
     *  Name extension
     * \else
     * 人员名称扩展
     * \endif
     */
    public byte     szNameEx[] = new byte[128];

    public NET_ACCESS_USER_INFO() {
        pstuFloorsEx2 = new NET_FLOORS_INFO[1];
        this.pstuFloorsEx2[0] = new NET_FLOORS_INFO();
    }

    @Override
    public String toString() {
        return "NET_ACCESS_USER_INFO{" +
                "szUserID=" + Arrays.toString(szUserID) +
                ", szName=" + Arrays.toString(szName) +
                ", emUserType=" + emUserType +
                ", nUserStatus=" + nUserStatus +
                ", nUserTime=" + nUserTime +
                ", szCardIDNo=" + Arrays.toString(szCitizenIDNo) +
                ", szPsw=" + Arrays.toString(szPsw) +
                ", nDoorNum=" + nDoorNum +
                ", nDoors=" + Arrays.toString(nDoors) +
                ", nTimeSectionNum=" + nTimeSectionNum +
                ", nTimeSectionNo=" + Arrays.toString(nTimeSectionNo) +
                ", nSpecialDaysScheduleNum=" + nSpecialDaysScheduleNum +
                ", nSpecialDaysSchedule=" + Arrays.toString(nSpecialDaysSchedule) +
                ", stuValidBeginTime=" + stuValidBeginTime +
                ", stuValidEndTime=" + stuValidEndTime +
                ", bFirstEnter=" + bFirstEnter +
                ", nFirstEnterDoorsNum=" + nFirstEnterDoorsNum +
                ", nFirstEnterDoors=" + Arrays.toString(nFirstEnterDoors) +
                ", emAuthority=" + emAuthority +
                ", nRepeatEnterRouteTimeout=" + nRepeatEnterRouteTimeout +
                ", nFloorNum=" + nFloorNum +
                ", szFloorNo=" + Arrays.toString(szFloorNo) +
                ", nRoom=" + nRoom +
                ", szRoomNo=" + Arrays.toString(szRoomNo) +
                ", bFloorNoExValid=" + bFloorNoExValid +
                ", nFloorNumEx=" + nFloorNumEx +
                ", szFloorNoEx=" + Arrays.toString(szFloorNoEx) +
                ", szClassInfo=" + Arrays.toString(szClassInfo) +
                ", szStudentNo=" + Arrays.toString(szStudentNo) +
                ", szCardAddress=" + Arrays.toString(szCitizenAddress) +
                ", stuBirthDay=" + stuBirthDay +
                ", emSex=" + emSex +
                ", szDepartment=" + Arrays.toString(szDepartment) +
                ", szSiteCode=" + Arrays.toString(szSiteCode) +
                ", szPhoneNumber=" + Arrays.toString(szPhoneNumber) +
                ", szDefaultFloor=" + Arrays.toString(szDefaultFloor) +
                ", bFloorNoEx2Valid=" + bFloorNoEx2Valid +
                ", pstuFloorsEx2=" + pstuFloorsEx2 +
                ", bHealthStatus=" + bHealthStatus +
                ", nUserTimeSectionsNum=" + nUserTimeSectionsNum +
                ", szUserTimeSections=" + Arrays.toString(szUserTimeSections) +
                ", szECType=" + Arrays.toString(szECType) +
                ", emTypeOfCertificate=" + emTypeOfCertificate +
                ", szCountryOrAreaCode=" + Arrays.toString(szCountryOrAreaCode) +
                ", szCountryOrAreaName=" + Arrays.toString(szCountryOrAreaName) +
                ", szCertificateVersionNumber=" + Arrays.toString(szCertificateVersionNumber) +
                ", szApplicationAgencyCode=" + Arrays.toString(szApplicationAgencyCode) +
                ", szIssuingAuthority=" + Arrays.toString(szIssuingAuthority) +
                ", szStartTimeOfCertificateValidity=" + Arrays.toString(szStartTimeOfCertificateValidity) +
                ", szEndTimeOfCertificateValidity=" + Arrays.toString(szEndTimeOfCertificateValidity) +
                ", nSignNum=" + nSignNum +
                ", szActualResidentialAddr=" + Arrays.toString(szActualResidentialAddr) +
                ", szWorkClass=" + Arrays.toString(szWorkClass) +
                ", stuStartTimeInPeriodOfValidity=" + stuStartTimeInPeriodOfValidity +
                ", emTestItems=" + emTestItems +
                ", bUseNameEx=" + bUseNameEx +
                ", szNameEx=" + Arrays.toString(szNameEx) +
                '}';
    }
}

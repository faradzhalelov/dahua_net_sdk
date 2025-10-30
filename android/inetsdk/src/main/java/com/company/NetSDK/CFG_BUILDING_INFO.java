package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * VTO floor config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_BUILDING}
 * \else
 * VTO楼层配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_BUILDING}
 * \endif
 */
public class CFG_BUILDING_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Issue no., range: 0 ~ 99
     * \else
     * 期号，范围：0 ~ 99
     * \endif
     */
    public byte                            szIssueNumber[] = new byte[FinalVar.CFG_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * Section no., range: 0 ~ 99
     * \else
     * 区号，范围：0 ~ 99
     * \endif
     */
    public byte                            szSectionNumber[] = new byte[FinalVar.CFG_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * Building no., range: 0 ~ 999
     * \else
     * 楼号，范围：0 ~ 999
     * \endif
     */
    public byte                            szBuildingNumber[] = new byte[FinalVar.CFG_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * Building unit no., range: 0 ~ 9
     * \else
     * 楼内单元号，范围：0 ~ 9
     * \endif
     */
    public byte                            szBuildingUnitNumber[] = new byte[FinalVar.CFG_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * Residence unit no., range: 0 ~ 999
     * \else
     * 小区单元编号，范围：0 ~ 999
     * \endif
     */
    public byte                            szSectionUnitNumber[] = new byte[FinalVar.CFG_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * Unit floor no., range: 0 ~ 99
     * \else
     * 单元楼层数，范围：0 ~ 99
     * \endif
     */
    public int                             nUnitFloorNumber;

    /**
     * \if ENGLISH_LANG
     * Room on one floor, range: 0 ~ 99
     * \else
     * 一层房间数，范围：0 ~ 99
     * \endif
     */
    public int                             nFloorPerRoomNumber;

    /**
     * \if ENGLISH_LANG
     * Create room no. enable
     * \else
     * 创建房间号使能
     * \endif
     */
    public boolean                          bCreateRoomEnable;

    /**
     * \if ENGLISH_LANG
     * System type, refer to {@link EM_CFG_BUILDING_SYSTEM_TYPE}
     * \else
     * 系统类型, 参考 {@link EM_CFG_BUILDING_SYSTEM_TYPE}
     * \endif
     */
    public int                             emSystemType;

    /**
     * \if ENGLISH_LANG
     * section enable
     * \else
     * 区号使能
     * \endif
     */
    public boolean                        bEnableSection;

    /**
     * \if ENGLISH_LANG
     * building bit number
     * \else
     * 楼号长度
     * \endif
     */
    public int                             nBuildingNumBit;

    /**
     * \if ENGLISH_LANG
     * total room number,max is 9999
     * \else
     * 房间总数，最大值为9999
     * \endif
     */
    public int                             nTotalRoomNumber;

    /**
     * \if ENGLISH_LANG
     * building name
     * \else
     * 门口机别名
     * \endif
     */
    public byte[]                          szBuildingName = new byte[FinalVar.CFG_COMMON_STRING_64];

    @Override
    public String toString() {
        return "CFG_BUILDING_INFO{" +
                "szIssueNumber=" + new String(szIssueNumber).trim() +
                ", szSectionNumber=" + new String(szSectionNumber).trim() +
                ", szBuildingNumber=" + new String(szBuildingNumber).trim() +
                ", szBuildingUnitNumber=" + new String(szBuildingUnitNumber).trim() +
                ", szSectionUnitNumber=" + new String(szSectionUnitNumber).trim() +
                ", nUnitFloorNumber=" + nUnitFloorNumber +
                ", nFloorPerRoomNumber=" + nFloorPerRoomNumber +
                ", bCreateRoomEnable=" + bCreateRoomEnable +
                ", emSystemType=" + emSystemType +
                ", bEnableSection=" + bEnableSection +
                ", nBuildingNumBit=" + nBuildingNumBit +
                ", nTotalRoomNumber=" + nTotalRoomNumber +
                ", szBuildingName=" + new String(szBuildingName).trim() +
                '}';
    }
}

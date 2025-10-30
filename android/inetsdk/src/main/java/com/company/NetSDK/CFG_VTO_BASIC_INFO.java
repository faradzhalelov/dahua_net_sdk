package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * VTO basic info config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_VTO_BASIC_INFO}
 * \else
 * VTO基本信息配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_VTO_BASIC_INFO}
 * \endif
 */
public class CFG_VTO_BASIC_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * VTO no.
     * \else
     * 门口机编号
     * \endif
     */
    public byte			     szNumber[] = new byte[FinalVar.AV_CFG_DeviceNo_Len];

    /**
     * \if ENGLISH_LANG
     * device type, refer to {@link NET_CFG_VTO_TYPE}
     * \else
     * 设备类型, 参考 {@link NET_CFG_VTO_TYPE}
     * \endif
     */
    public int                 emCfgVtoType;

    /**
     * \if ENGLISH_LANG
     * VTO type, 1 unit VTO 2 fence station, refer to {@link EM_CFG_VTO_TYPE}
     * \else
     * 门口机类型, 1单元门口机 2围墙机, 参考 {@link EM_CFG_VTO_TYPE}
     * \endif
     */
    public int                 emType;

    /**
     * \if ENGLISH_LANG
     * analog system version
     * \else
     * 模拟系统版本
     * \endif
     */
    public byte			    szAnalogVersion[] = new byte[FinalVar.CFG_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * target recognition 1 enable 2 unable
     * \else
     * 目标识别使 1开启 0关闭
     * \endif
     */
    public boolean			  bFaceDetect;

    /**
     * \if ENGLISH_LANG
     * VTO floor location Int32, 0 means invalid;  1,2, means level 1, 2;  -1, -2 means basement 1, 2
     * \else
     * VTO所在楼层位置 Int32, 0 表示无效;  1,2,…表示地上一层，二层;  -1,-2,…表示地下一层，二层
     * \endif
     */
    public int			        nPositon;

    @Override
    public String toString() {
        return"szNumber=" + new String(szNumber).trim() +
                ", emCfgVtoType=" + emCfgVtoType +
                ", emType=" + emType +
                ", szAnalogVersion=" + new String(szAnalogVersion).trim() +
                ", bFaceDetect=" + bFaceDetect +
                ", nPositon=" + nPositon;
    }
}

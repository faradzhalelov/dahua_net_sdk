package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * VTO call config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_VTO_CALL}
 * \else
 * VTO呼叫配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_VTO_CALL}
 * \endif
 */
public class CFG_VTO_CALL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Cross-zone network enable
     * \else
     * 跨区域联网使能
     * \endif
     */
    public boolean                            bAreaEnable;

    /**
     * \if ENGLISH_LANG
     * Zone encode
     * \else
     * 区域编码
     * \endif
     */
    public byte                            szAreaNumber[] = new byte[FinalVar.CFG_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * Middle no. call switch
     * \else
     * 中号呼叫开关
     * \endif
     */
    public boolean                            bMiddleNumberCallEnable;

    /**
     * \if ENGLISH_LANG
     * VTH middle no. prefix, fixed length 4 bits
     * \else
     * VTH中号前缀，固定长度4位
     * \endif
     */
    public byte                            szVTHMiddleNumberPrefix[] = new byte[FinalVar.CFG_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * VTH long no. prefix, fixed length 8 bits
     * \else
     * VTH长号前缀，固定长度8位
     * \endif
     */
    public byte                            szVTHLongNumberPrefix[] = new byte[FinalVar.CFG_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * VTO short no., fixed length 4 bits
     * \else
     * VTO短号，固定长度4位
     * \endif
     */
    public byte                            szVTOShortNumber[] = new byte[FinalVar.CFG_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * VTO middle no. prefix, fixed length 4 bits
     * \else
     * VTO中号前缀，固定长度4位
     * \endif
     */
    public byte                            szVTOMiddleNumberPrefix[] = new byte[FinalVar.CFG_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * VTO long no. prefix, fixed length 12 bits
     * \else
     * VTO长号前缀，固定长度12位
     * \endif
     */
    public byte                            szVTOLongNumbrPrefix[] = new byte[FinalVar.CFG_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * VTS long no., fixed length 18 bits
     * \else
     * VTS长号，固定长度18位
     * \endif
     */
    public byte                            szVTSLongNumber[] = new byte[FinalVar.CFG_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * Villa station call no.
     * \else
     * 别墅机呼叫号码
     * \endif
     */
    public byte                            szVillaCallVTHNum[] = new byte[FinalVar.CFG_COMMON_STRING_32];

    @Override
    public String toString() {
        return "bAreaEnable=" + bAreaEnable +
                ", szAreaNumber=" + new String(szAreaNumber).trim() +
                ", bMiddleNumberCallEnable=" + bMiddleNumberCallEnable +
                ", szVTHMiddleNumberPrefix=" + new String(szVTHMiddleNumberPrefix).trim() +
                ", szVTHLongNumberPrefix=" + new String(szVTHLongNumberPrefix).trim() +
                ", szVTOShortNumber=" + new String(szVTOShortNumber).trim() +
                ", szVTOMiddleNumberPrefix=" + new String(szVTOMiddleNumberPrefix).trim() +
                ", szVTOLongNumbrPrefix=" + new String(szVTOLongNumbrPrefix).trim() +
                ", szVTSLongNumber=" + new String(szVTSLongNumber).trim() +
                ", szVillaCallVTHNum=" + new String(szVillaCallVTHNum).trim();
    }
}

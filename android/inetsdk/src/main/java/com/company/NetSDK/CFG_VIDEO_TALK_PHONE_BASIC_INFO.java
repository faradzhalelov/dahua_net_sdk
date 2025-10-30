package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * configuration of Video Talk Phone Basic, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_VIDEO_TALK_PHONE_BASIC}
 * \else
 * 视频对讲电话基础配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig}, 对应命令{@link FinalVar#CFG_CMD_VIDEO_TALK_PHONE_BASIC}
 * \endif
 */
public class CFG_VIDEO_TALK_PHONE_BASIC_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Alarm output enable
     * \else
     * 呼叫联动报警输出使能
     * \endif
     */
    public boolean					bAlarmOutputEnable;

    /**
     * \if ENGLISH_LANG
     * No answer transfer platform enable
     * \else
     * 呼叫无应答转移平台使能
     * \endif
     */
    public boolean					bNoAnswerTransferPlatformEnable;

    /**
     * \if ENGLISH_LANG
     * Each call enable
     * \else
     * 户户通话使能
     * \endif
     */
    public boolean					bEachCallEnable;

    /**
     * \if ENGLISH_LANG
     * Auto answer enable
     * \else
     * 自动接听使能
     * \endif
     */
    public boolean					bAutoAnswerEnable;

    /**
     * \if ENGLISH_LANG
     * Invite number list count
     * \else
     * 主叫房间列表个数
     * \endif
     */
    public int						    nInviteNumberList;

    /**
     * \if ENGLISH_LANG
     * Invite number list
     * \else
     * 主叫房间列表
     * \endif
     */
    public byte[][]					szInviteNumberList = new byte[FinalVar.MAX_INVITE_NUMBER_LIST][FinalVar.CFG_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * VTO ring back enable
     * \else
     * 是否开启门口机回铃使能
     * \endif
     */
    public boolean                    bVTOCallSoundEnable;

    /**
     * \if ENGLISH_LANG
     * VTO ring back sound path
     * \else
     * 门口机回铃铃声路径
     * \endif
     */
    public byte[]                     szVTOCallSound = new byte[FinalVar.CFG_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * call enable
     * \else
     * 呼叫使能
     * \endif
     */
    public boolean                    bEnableCall;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * a rain brush circle back and forth, the effective rainbrush mode configuration for manual mode, corresponding to {@link CtrlType#SDK_CTRL_RAINBRUSH_MOVECONTINUOUSLY}
 * \else
 * 雨刷来回循环刷,雨刷模式配置为手动模式时有效, 对应命令 {@link CtrlType#SDK_CTRL_RAINBRUSH_MOVECONTINUOUSLY}
 * \endif
 */
public class NET_CTRL_ACCESS_CALL_LIFT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * rainbrush Index
     * \else
     * 通道号
     * \endif
     */
    public int              nChannelID;

    /**
     * \if ENGLISH_LANG
     * rainbrush interval
     * \else
     * 起始地址(楼层+房间号)
     * \endif
     */
    public byte[]	         szSrcFloor = new byte[FinalVar.MAX_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * rainbrush interval
     * \else
     * 目标地址(楼层+房间号)
     * \endif
     */
    public byte[]	         szDestFloor = new byte[FinalVar.MAX_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * The sense method, refer to {@link EM_CALLLIFT_CMD}
     * \else
     * 呼叫电梯命令, 取值参考 {@link EM_CALLLIFT_CMD}
     * \endif
     */
    public int	             emCallLiftCmd;

    /**
     * \if ENGLISH_LANG
     * The sense method, refer to {@link EM_CALLLIFT_ACTION}
     * \else
     * 呼叫电梯的方式, 取值参考 {@link EM_CALLLIFT_ACTION}
     * \endif
     */
    public int	             emCallLiftAction;
}

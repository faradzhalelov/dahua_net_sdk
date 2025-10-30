package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * call lift command
 * \else
 * 呼叫电梯命令
 * \endif
 */
public class EM_CALLLIFT_CMD implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_CALLLIFT_CMD_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     * call lift to one floor and open any other floors
     * \else
     * 呼叫电梯到某个楼层，并开放其它任何楼层数
     * \endif
     */
    public static final int EM_CALLLIFT_CMD_ANY_FLOOR = 0;

    /**
     * \if ENGLISH_LANG
     * call lift to one floor, user can only enter dest floor
     * \else
     * 呼叫电梯到某个楼层，用户进去后只能按目标楼层
     * \endif
     */
    public static final int EM_CALLLIFT_CMD_DEST_FLOOR = 1;
    /**
     * \if ENGLISH_LANG
     * call lift to one floor, need to swipe card, default lift running up
     * \else
     * 呼叫电梯到某个楼层后，还需要刷卡，电梯才能运行, 默认电梯上行
     * \endif
     */
    public static final int EM_CALLLIFT_CMD_CARD_UP = 2;

    /**
     * \if ENGLISH_LANG
     * call lift to one floor, not need to press button, lift will automatically run to dest floor
     * \else
     * 呼叫电梯到某个楼层,用户进去不用按钮，电梯会自动运行到目标楼层
     * \endif
     */
    public static final int EM_CALLLIFT_CMD_AUTO_FLOOR = 3;

    /**
     * \if ENGLISH_LANG
     * call lift to one floor, need to swipe card, default lift running down
     * \else
     * 呼叫电梯到某个楼层后，还需要刷卡，电梯才能运行, 默认电梯下行
     * \endif
     */
    public static final int EM_CALLLIFT_CMD_CARD_DOWN = 4;
}

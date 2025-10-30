package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief CLIENT_ControlDevice's param: SDK_CTRL_ACCESS_OPEN
 * \else
 * @brief CLIENT_ControlDevice接口的 SDK_CTRL_ACCESS_OPEN 命令参数
 * \endif
 */
public class NET_CTRL_ACCESS_OPEN implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel ID (start from 0)
     * \else
     * 通道号(0开始)
     * \endif
     */
    public int nChannelID;

    /**
     * \if ENGLISH_LANG
     * Target ID, NULL equals to not transmit
     * \else
     * 转发目标设备ID,为NULL表示不转发
     * \endif
     */
    public String szTargetID;

    /**
     * \if ENGLISH_LANG
     * remote user id
     * \else
     * 远程用户ID
     * \endif
     */
    public byte szUserID[] = new byte[FinalVar.MAX_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * open door type,{@link EM_OPEN_DOOR_TYPE}
     * \else
     * 开门方式,{@link EM_OPEN_DOOR_TYPE}
     * \endif
     */
    public int emOpenDoorType;

    /**
     * \if ENGLISH_LANG
     * open door direction,{@link EM_OPEN_DOOR_DIRECTION}
     * \else
     * 开门方向,{@link EM_OPEN_DOOR_DIRECTION}
     * \endif
     */
    public int emOpenDoorDirection;

    /**
     * \if ENGLISH_LANG
     * remote check code,{@link EM_REMOTE_CHECK_CODE}
     * \else
     * 远程权限验证结果,{@link EM_REMOTE_CHECK_CODE}
     * \endif
     */
    public int emRemoteCheckCode;

    /**
     * \if ENGLISH_LANG
     * Compatible fields
     * \else
     * 兼容字段
     * \endif
     */
    public byte szShortNumber[] = new byte[16];

}
package com.company.NetSDK;

import java.io.Serializable;

/**
 * Created by 29875 on 2019/8/8.
 */
public class NET_CFG_LE_LENS_MASK_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 镜头是否处在遮挡位置, TRUE:遮挡位, 无视频; FALSE:正常位置
     * \endif
     */
    public boolean                bEnable;

    /**
     * \if ENGLISH_LANG
     * Door Channel No.
     * \else
     * 有效的遮挡前云台位置坐标数组个数
     * \endif
     */
    public int             nValidLastPositionNum;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 字节对齐
     * \endif
     */
    public byte				byReserved[] = new byte[4];

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 遮挡前云台位置坐标数组, 记录遮挡前的云台位置, 恢复时回到该坐标
     * 第一个元素为水平角度，归一化到-1~1;第二个元素为垂直角度，归一化到-1~1;第三个元素为放大倍数，归一化到0~1。
     * 数组元素分别对应DH_PTZ_LOCATION_INFO中的pan、tilt、zoom,对应DH_DEVSTATE_PTZ_LOCATION枚举命令
     * 遮挡使能为FALSE时,无需填坐标
     * \endif
     */
    public double				dbLastPosition[] = new double[3];
}

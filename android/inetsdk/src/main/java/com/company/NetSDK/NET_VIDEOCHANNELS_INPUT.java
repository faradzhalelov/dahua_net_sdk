package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input channel info
 * \else
 * 输入通道信息
 * \endif
 */
public class NET_VIDEOCHANNELS_INPUT implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * thermo channel count in nThermography
     * \else
     * 热成像通道个数
     * \endif
     */
    public int                     nThermographyCount;

    /**
     * \if ENGLISH_LANG
     * thermo channel numbers
     * \else
     * 热成像通道的通道号
     * \endif
     */
    public int                     nThermography[] = new int[64];

    /**
     * \if ENGLISH_LANG
     * multi preview channel count in nMultiPreview
     * \else
     * 多画面预览通道个数
     * \endif
     */
    public int                     nMultiPreviewCount;

    /**
     * \if ENGLISH_LANG
     * multi preview channel numbers
     * \else
     * 多画面预览通道号
     * \endif
     */
    public int                     nMultiPreview[] = new int[4];

    /**
     * \if ENGLISH_LANG
     * PIP channel count in nPIP
     * \else
     * 画中画通道个数
     * \endif
     */
    public int                     nPIPCount;

    /**
     * \if ENGLISH_LANG
     * PIP channel numbers
     * \else
     * 画中画通道号
     * \endif
     */
    public int                     nPIP[] = new int[4];

    /**
     * \if ENGLISH_LANG
     * compress play channel count in nCompressPlay
     * \else
     * 二次压缩回放通道个数
     * \endif
     */
    public int                     nCompressPlayCount;

    /**
     * \if ENGLISH_LANG
     * compress play channel numbers
     * \else
     * 二次压缩回放通道号
     * \endif
     */
    public int                     nCompressPlay[] = new int[4];

    /**
     * \if ENGLISH_LANG
     * SD channel count in nSD
     * \else
     * 球机通道个数
     * \endif
     */
    public int						nSDCount;

    /**
     * \if ENGLISH_LANG
     * SD channel numbers
     * \else
     * 球机通道号
     * \endif
     */
    public int						nSD[] = new int[64];

    /**
     * \if ENGLISH_LANG
     * PTZ channel count
     * \else
     * 支持云台程序的通道数量
     * \endif
     */
    public int                     nPTZCount;

    /**
     * \if ENGLISH_LANG
     * PTZ channel numbers
     * \else
     * 支持云台程序的通道号
     * \endif
     */
    public short                   nPTZ[] = new short[64];

    /**
     * \if ENGLISH_LANG
     * FuseRadar channel count in nFuseRadar
     * \else
     * 支持融合雷达流，可见光叠加雷达流的通道数量
     * \endif
     */
    public int                     nFuseRadarCount;

    /**
     * \if ENGLISH_LANG
     * FuseRadar channel numbers
     * \else
     * 支持融合雷达流，可见光叠加雷达流的通道号
     * \endif
     */
    public int						nFuseRadar[] = new int[64];

    /**
     * \if ENGLISH_LANG
     * PureRadar channel count in nPureRadar
     * \else
     * 支持纯雷达流，无可见光的通道数量
     * \endif
     */
    public int                     nPureRadarCount;

    /**
     * \if ENGLISH_LANG
     * PureRadar channel numbers
     * \else
     * 支持纯雷达流，无可见光的通道号
     * \endif
     */
    public int						nPureRadar[] = new int[64];
}

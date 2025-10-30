package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief Device type
 * \else
 * @brief 设备类型
 * \endif
 */
public class NET_DEVICE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * NET_PRODUCT_NONE = 0,
     * \else
     * NET_PRODUCT_NONE = 0,
     * \endif
     */
    public static final int NET_PRODUCT_NONE = 0;

    /**
     * \if ENGLISH_LANG
     * Non real-time MACE
     * \else
     * 非实时MACE
     * \endif
     */
    public static final int NET_DVR_NONREALTIME_MACE = 1;

    /**
     * \if ENGLISH_LANG
     * Non real-time
     * \else
     * 非实时
     * \endif
     */
    public static final int NET_DVR_NONREALTIME = 2;

    /**
     * \if ENGLISH_LANG
     * Network video server
     * \else
     * 网络视频服务器
     * \endif
     */
    public static final int NET_NVS_MPEG1 = 3;

    /**
     * \if ENGLISH_LANG
     * MPEG1 2-ch DVR
     * \else
     * MPEG1二路录像机
     * \endif
     */
    public static final int NET_DVR_MPEG1_2 = 4;

    /**
     * \if ENGLISH_LANG
     * MPEG1 8-ch DVR
     * \else
     * MPEG1八路录像机
     * \endif
     */
    public static final int NET_DVR_MPEG1_8 = 5;

    /**
     * \if ENGLISH_LANG
     * MPEG4 8-ch DVR
     * \else
     * MPEG4八路录像机
     * \endif
     */
    public static final int NET_DVR_MPEG4_8 = 6;

    /**
     * \if ENGLISH_LANG
     * MPEG4 16-ch DVR
     * \else
     * MPEG4十六路录像机
     * \endif
     */
    public static final int NET_DVR_MPEG4_16 = 7;

    /**
     * \if ENGLISH_LANG
     * LB series DVR
     * \else
     * LB系列录像机
     * \endif
     */
    public static final int NET_DVR_MPEG4_SX2 = 8;

    /**
     * \if ENGLISH_LANG
     * GB  series DVR
     * \else
     * GB系列录像机
     * \endif
     */
    public static final int NET_DVR_MEPG4_ST2 = 9;

    /**
     * \if ENGLISH_LANG
     * HB  series DVR
     * \else
     * HB系列录像机               10
     * \endif
     */
    public static final int NET_DVR_MEPG4_SH2 = 10;

    /**
     * \if ENGLISH_LANG
     * GBE  series DVR
     * \else
     * GBE系列录像机
     * \endif
     */
    public static final int NET_DVR_MPEG4_GBE = 11;

    /**
     * \if ENGLISH_LANG
     * II network video server
     * \else
     * II代网络视频服务器
     * \endif
     */
    public static final int NET_DVR_MPEG4_NVSII = 12;

    /**
     * \if ENGLISH_LANG
     * New standard configuration protocol
     * \else
     * 新标准配置协议
     * \endif
     */
    public static final int NET_DVR_STD_NEW = 13;

    /**
     * \if ENGLISH_LANG
     * DDNS server
     * \else
     * DDNS服务器
     * \endif
     */
    public static final int NET_DVR_DDNS = 14;

    /**
     * \if ENGLISH_LANG
     * ATM series
     * \else
     * ATM机
     * \endif
     */
    public static final int NET_DVR_ATM = 15;

    /**
     * \if ENGLISH_LANG
     * 2nd non real-time NB series DVR
     * \else
     * 二代非实时NB系列机器
     * \endif
     */
    public static final int NET_NB_SERIAL = 16;

    /**
     * \if ENGLISH_LANG
     * LN  series
     * \else
     * LN系列产品
     * \endif
     */
    public static final int NET_LN_SERIAL = 17;

    /**
     * \if ENGLISH_LANG
     * BAV series
     * \else
     * BAV系列产品
     * \endif
     */
    public static final int NET_BAV_SERIAL = 18;

    /**
     * \if ENGLISH_LANG
     * SDIP series
     * \else
     * SDIP系列产品
     * \endif
     */
    public static final int NET_SDIP_SERIAL = 19;

    /**
     * \if ENGLISH_LANG
     * IPC series
     * \else
     * IPC系列产品                20
     * \endif
     */
    public static final int NET_IPC_SERIAL = 20;

    /**
     * \if ENGLISH_LANG
     * NVS B series
     * \else
     * NVS B系列
     * \endif
     */
    public static final int NET_NVS_B = 21;

    /**
     * \if ENGLISH_LANG
     * NVS H series
     * \else
     * NVS H系列
     * \endif
     */
    public static final int NET_NVS_C = 22;

    /**
     * \if ENGLISH_LANG
     * NVS S series
     * \else
     * NVS S系列
     * \endif
     */
    public static final int NET_NVS_S = 23;

    /**
     * \if ENGLISH_LANG
     * NVS E series
     * \else
     * NVS E系列
     * \endif
     */
    public static final int NET_NVS_E = 24;

    /**
     * \if ENGLISH_LANG
     * Search device type from QueryDevState. it is in string format
     * \else
     * 从QueryDevState中查询设备类型,以字符串格式
     * \endif
     */
    public static final int NET_DVR_NEW_PROTOCOL = 25;

    /**
     * \if ENGLISH_LANG
     * NVD
     * \else
     * 解码器
     * \endif
     */
    public static final int NET_NVD_SERIAL = 26;

    /**
     * \if ENGLISH_LANG
     * N5
     * \else
     * N5
     * \endif
     */
    public static final int NET_DVR_N5 = 27;

    /**
     * \if ENGLISH_LANG
     * HDVR
     * \else
     * 混合DVR
     * \endif
     */
    public static final int NET_DVR_MIX_DVR = 28;

    /**
     * \if ENGLISH_LANG
     * SVR series
     * \else
     * SVR系列
     * \endif
     */
    public static final int NET_SVR_SERIAL = 29;

    /**
     * \if ENGLISH_LANG
     * SVR-BS
     * \else
     * SVR-BS                     30
     * \endif
     */
    public static final int NET_SVR_BS = 30;

    /**
     * \if ENGLISH_LANG
     * NVR series
     * \else
     * NVR系列
     * \endif
     */
    public static final int NET_NVR_SERIAL = 31;

    /**
     * \if ENGLISH_LANG
     * N51
     * \else
     * N51
     * \endif
     */
    public static final int NET_DVR_N51 = 32;

    /**
     * \if ENGLISH_LANG
     * ITSE Intelligent Analysis Box
     * \else
     * ITSE 智能分析盒
     * \endif
     */
    public static final int NET_ITSE_SERIAL = 33;

    /**
     * \if ENGLISH_LANG
     * Intelligent traffic camera equipment
     * \else
     * 智能交通像机设备
     * \endif
     */
    public static final int NET_ITC_SERIAL = 34;

    /**
     * \if ENGLISH_LANG
     * radar speedometer HWS
     * \else
     * 雷达测速仪HWS
     * \endif
     */
    public static final int NET_HWS_SERIAL = 35;

    /**
     * \if ENGLISH_LANG
     * portable video record
     * \else
     * 便携式音视频录像机
     * \endif
     */
    public static final int NET_PVR_SERIAL = 36;

    /**
     * \if ENGLISH_LANG
     * IVS(intelligent video server series)
     * \else
     * IVS（智能视频服务器系列）
     * \endif
     */
    public static final int NET_IVS_SERIAL = 37;

    /**
     * \if ENGLISH_LANG
     * universal intelligent detect video server series
     * \else
     * 通用智能视频侦测服务器
     * \endif
     */
    public static final int NET_IVS_B = 38;

    /**
     * \if ENGLISH_LANG
     * target recognisation server
     * \else
     * 目标识别服务器
     * \endif
     */
    public static final int NET_IVS_F = 39;

    /**
     * \if ENGLISH_LANG
     * video quality diagnosis server
     * \else
     * 视频质量诊断服务器         40
     * \endif
     */
    public static final int NET_IVS_V = 40;

    /**
     * \if ENGLISH_LANG
     * matrix
     * \else
     * 矩阵
     * \endif
     */
    public static final int NET_MATRIX_SERIAL = 41;

    /**
     * \if ENGLISH_LANG
     * N52
     * \else
     * N52
     * \endif
     */
    public static final int NET_DVR_N52 = 42;

    /**
     * \if ENGLISH_LANG
     * N56
     * \else
     * N56
     * \endif
     */
    public static final int NET_DVR_N56 = 43;

    /**
     * \if ENGLISH_LANG
     * ESS
     * \else
     * ESS
     * \endif
     */
    public static final int NET_ESS_SERIAL = 44;

    /**
     * \if ENGLISH_LANG
     * number statistic server
     * \else
     * 人数统计服务器
     * \endif
     */
    public static final int NET_IVS_PC = 45;

    /**
     * \if ENGLISH_LANG
     * pc-nvr
     * \else
     * pc-nvr
     * \endif
     */
    public static final int NET_PC_NVR = 46;

    /**
     * \if ENGLISH_LANG
     * screen controller
     * \else
     * 大屏控制器
     * \endif
     */
    public static final int NET_DSCON = 47;

    /**
     * \if ENGLISH_LANG
     * network video storage server
     * \else
     * 网络视频存储服务器
     * \endif
     */
    public static final int NET_EVS = 48;

    /**
     * \if ENGLISH_LANG
     * an embedded intelligent video analysis system
     * \else
     * 嵌入式智能分析视频系统
     * \endif
     */
    public static final int NET_EIVS = 49;

    /**
     * \if ENGLISH_LANG
     * DVR-N6
     * \else
     * DVR-N6                     50
     * \endif
     */
    public static final int NET_DVR_N6 = 50;

    /**
     * \if ENGLISH_LANG
     * K-Lite Codec Pack
     * \else
     * 万能解码器
     * \endif
     */
    public static final int NET_UDS = 51;

    /**
     * \if ENGLISH_LANG
     * Bank alarm host
     * \else
     * 银行报警主机
     * \endif
     */
    public static final int NET_AF6016 = 52;

    /**
     * \if ENGLISH_LANG
     * Video network alarm host
     * \else
     * 视频网络报警主机
     * \endif
     */
    public static final int NET_AS5008 = 53;

    /**
     * \if ENGLISH_LANG
     * Network alarm host
     * \else
     * 网络报警主机
     * \endif
     */
    public static final int NET_AH2008 = 54;

    /**
     * \if ENGLISH_LANG
     * Alarm host series
     * \else
     * 报警主机系列
     * \endif
     */
    public static final int NET_A_SERIAL = 55;

    /**
     * \if ENGLISH_LANG
     * Access control series of products
     * \else
     * 门禁系列产品
     * \endif
     */
    public static final int NET_BSC_SERIAL = 56;

    /**
     * \if ENGLISH_LANG
     * NVS series product
     * \else
     * NVS系列产品
     * \endif
     */
    public static final int NET_NVS_SERIAL = 57;

    /**
     * \if ENGLISH_LANG
     * VTO series product
     * \else
     * VTO系列产品
     * \endif
     */
    public static final int NET_VTO_SERIAL = 58;

    /**
     * \if ENGLISH_LANG
     * VTNC series product
     * \else
     * VTNC系列产品
     * \endif
     */
    public static final int NET_VTNC_SERIAL = 59;

    /**
     * \if ENGLISH_LANG
     * TPC series product, it is the thermal device
     * \else
     * TPC系列产品, 即热成像设备  60
     * \endif
     */
    public static final int NET_TPC_SERIAL = 60;

    /**
     * \if ENGLISH_LANG
     * ASM series product
     * \else
     * 无线中继设备
     * \endif
     */
    public static final int NET_ASM_SERIAL = 61;

    /**
     * \if ENGLISH_LANG
     * VTS series product
     * \else
     * 管理机
     * \endif
     */
    public static final int NET_VTS_SERIAL = 62;

    /**
     * \if ENGLISH_LANG
     * Alarm host-ARC2016C
     * \else
     * 报警主机ARC2016C
     * \endif
     */
    public static final int NET_ARC2016C = 63;

    /**
     * \if ENGLISH_LANG
     * ASA Attendance machine
     * \else
     * 考勤机
     * \endif
     */
    public static final int NET_ASA = 64;

    /**
     * \if ENGLISH_LANG
     * Industry terminal walkie-talkie
     * \else
     * 行业对讲终端
     * \endif
     */
    public static final int NET_VTT_SERIAL = 65;

    /**
     * \if ENGLISH_LANG
     * Alarm column
     * \else
     * 报警柱
     * \endif
     */
    public static final int NET_VTA_SERIAL = 66;

    /**
     * \if ENGLISH_LANG
     * SIP Server
     * \else
     * SIP服务器
     * \endif
     */
    public static final int NET_VTNS_SERIAL = 67;

    /**
     * \if ENGLISH_LANG
     * Indoor unit
     * \else
     * 室内机
     * \endif
     */
    public static final int NET_VTH_SERIAL = 68;

    /**
     * \if ENGLISH_LANG
     * IVSS
     * \else
     * IVSS产品
     * \endif
     */
    public static final int NET_IVSS = 69;

    /**
     * \if ENGLISH_LANG
     * ASG
     * \else
     * 目标道闸
     * \endif
     */
    public static final int NET_ASG = 70;

    /**
     * \if ENGLISH_LANG
     * Radar series
     * \else
     * 雷达产品
     * \endif
     */
    public static final int NET_RADAR = 71;

    /**
     * \if ENGLISH_LANG
     * Radar SD
     * \else
     * 雷达系统
     * \endif
     */
    public static final int NET_RADAR_PTZ = 72;

    /**
     * \if ENGLISH_LANG
     * Radar IPC
     * \else
     * 摄像雷达
     * \endif
     */
    public static final int NET_RADAR_CAM = 73;

    /**
     * \if ENGLISH_LANG
     * lift controller
     * \else
     * 梯控设备
     * \endif
     */
    public static final int NET_ASE = 74;

    /**
     * \if ENGLISH_LANG
     * XRay Server
     * \else
     * 安检服务器
     * \endif
     */
    public static final int NET_XRAY_SERVER = 75;

    /**
     * \if ENGLISH_LANG
     * XRay Device
     * \else
     * 安检一体机
     * \endif
     */
    public static final int NET_XRAY_DEVICE = 76;

    /**
     * \if ENGLISH_LANG
     * Security Gate
     * \else
     * 安检门
     * \endif
     */
    public static final int NET_SECURITY_GATE = 77;

    /**
     * \if ENGLISH_LANG
     * Ethernet switch
     * \else
     * 以太网交换机
     * \endif
     */
    public static final int NET_TS = 78;

    /**
     * \if ENGLISH_LANG
     * Industrial camera
     * \else
     * 工牌相机
     * \endif
     */
    public static final int NET_GP = 79;

    /**
     * \if ENGLISH_LANG
     * Shangchao anti-theft antenna
     * \else
     *商超防盗天线
     * \endif
     */
    public static final int NET_EAS = 80;

    /**
     * \if ENGLISH_LANG
     * KVM Input Node
     * \else
     * KVM输入节点
     * \endif
     */
    public static final int NET_KVM_IN = 81;

    /**
     * \if ENGLISH_LANG
     * KVM Output node
     * \else
     * KVM输出节点
     * \endif
     */
    public static final int NET_KVM_OUT = 82;

    /**
     * \if ENGLISH_LANG
     * LED control system
     * \else
     * LED控制系统
     * \endif
     */
    public static final int NET_LCS = 83;

}
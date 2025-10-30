package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief device type
 * \else
 * @brief 设备类型
 * \endif
 */
public class NET_EM_DEVICE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unkonown
     * \else
     *  未知类型
     * \endif
     */
    public static final int					NET_EM_DEVICE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  camera
     * \else
     *  模拟摄像机
     * \endif
     */
    public static final int					NET_EM_DEVICE_CAMERA = 1;

    /**
     * \if ENGLISH_LANG
     *  dome
     * \else
     *  模拟球机
     * \endif
     */
    public static final int					NET_EM_DEVICE_DOME = 2;

    /**
     * \if ENGLISH_LANG
     *  matrix
     * \else
     *  模拟矩阵
     * \endif
     */
    public static final int					NET_EM_DEVICE_MATRIX = 3;

    /**
     * \if ENGLISH_LANG
     *  ipc
     * \else
     *  网络摄像机
     * \endif
     */
    public static final int					NET_EM_DEVICE_IPC = 4;

    /**
     * \if ENGLISH_LANG
     *  nvs
     * \else
     *  视频服务器
     * \endif
     */
    public static final int					NET_EM_DEVICE_NVS = 5;

    /**
     * \if ENGLISH_LANG
     *  SD
     * \else
     *  网络球机
     * \endif
     */
    public static final int					NET_EM_DEVICE_SD = 6;

    /**
     * \if ENGLISH_LANG
     *  ITES
     * \else
     *  智能存储盒
     * \endif
     */
    public static final int					NET_EM_DEVICE_ITSE = 7;

    /**
     * \if ENGLISH_LANG
     *  ITC
     * \else
     *  智能摄像机
     * \endif
     */
    public static final int					NET_EM_DEVICE_ITC = 8;

    /**
     * \if ENGLISH_LANG
     *  TPC
     * \else
     *  热成像摄像机
     * \endif
     */
    public static final int					NET_EM_DEVICE_TPC = 9;

    /**
     * \if ENGLISH_LANG
     *  DVR
     * \else
     *  数字硬盘录像机
     * \endif
     */
    public static final int					NET_EM_DEVICE_DVR = 10;

    /**
     * \if ENGLISH_LANG
     *  HDVR
     * \else
     *  混合型数字硬盘录像机
     * \endif
     */
    public static final int					NET_EM_DEVICE_HDVR = 11;

    /**
     * \if ENGLISH_LANG
     *  HCVR
     * \else
     *  高清CVI接口录像机
     * \endif
     */
    public static final int					NET_EM_DEVICE_HCVR = 12;

    /**
     * \if ENGLISH_LANG
     *  NVR
     * \else
     *  网络录像机
     * \endif
     */
    public static final int					NET_EM_DEVICE_NVR = 13;

    /**
     * \if ENGLISH_LANG
     *  PC NVR
     * \else
     *  工作在PC上的软件网络录像机
     * \endif
     */
    public static final int					NET_EM_DEVICE_PCNVR = 14;

    /**
     * \if ENGLISH_LANG
     *  NVD
     * \else
     *  网络解码器
     * \endif
     */
    public static final int					NET_EM_DEVICE_NVD = 15;

    /**
     * \if ENGLISH_LANG
     *  SNVD
     * \else
     *  软件网络解码器
     * \endif
     */
    public static final int					NET_EM_DEVICE_SNVD = 16;

    /**
     * \if ENGLISH_LANG
     *  UDS
     * \else
     *  万能解码器
     * \endif
     */
    public static final int					NET_EM_DEVICE_UDS = 17;

    /**
     * \if ENGLISH_LANG
     *  SVR
     * \else
     *  存储服务器式录像机
     * \endif
     */
    public static final int					NET_EM_DEVICE_SVR = 18;

    /**
     * \if ENGLISH_LANG
     *  M60/M70
     * \else
     *  视频综合平台
     * \endif
     */
    public static final int					NET_EM_DEVICE_M = 19;

    /**
     * \if ENGLISH_LANG
     *  IVS
     * \else
     *  IVS服务器
     * \endif
     */
    public static final int					NET_EM_DEVICE_IVS = 20;

    /**
     * \if ENGLISH_LANG
     *  VNC SERVER
     * \else
     *  虚拟网络服务器
     * \endif
     */
    public static final int					NET_EM_DEVICE_VNCSERVER = 21;

    /**
     * \if ENGLISH_LANG
     *  VNC CLIENT
     * \else
     *  虚拟网络客户端
     * \endif
     */
    public static final int					NET_EM_DEVICE_VNCCLIENT = 22;

    /**
     * \if ENGLISH_LANG
     *  DSCON
     * \else
     *  嵌入式多屏控制器
     * \endif
     */
    public static final int					NET_EM_DEVICE_DSCON = 23;

    /**
     * \if ENGLISH_LANG
     *  PC
     * \else
     *  通用个人计算机
     * \endif
     */
    public static final int					NET_EM_DEVICE_PC = 24;

    /**
     * \if ENGLISH_LANG
     *  EVS
     * \else
     *  网络视频存储服务器
     * \endif
     */
    public static final int					NET_EM_DEVICE_EVS = 25;

    /**
     * \if ENGLISH_LANG
     *  VCS
     * \else
     *  视频转码服务器
     * \endif
     */
    public static final int					NET_EM_DEVICE_VCS = 26;

    /**
     * \if ENGLISH_LANG
     *  ALARM, before 2015
     * \else
     *  报警主机, 15 年前
     * \endif
     */
    public static final int					NET_EM_DEVICE_A = 27;

    /**
     * \if ENGLISH_LANG
     *  ALARM, after 2015
     * \else
     *  报警主机, 15年后
     * \endif
     */
    public static final int					NET_EM_DEVICE_ARC = 28;

    /**
     * \if ENGLISH_LANG
     *  SDHNI
     * \else
     *  智能球机
     * \endif
     */
    public static final int					NET_EM_DEVICE_SDHNI = 29;

    /**
     * \if ENGLISH_LANG
     *  BSC
     * \else
     *  门禁主机
     * \endif
     */
    public static final int					NET_EM_DEVICE_BSC = 30;

    /**
     * \if ENGLISH_LANG
     *  BSR
     * \else
     *  门禁读卡器
     * \endif
     */
    public static final int					NET_EM_DEVICE_BSR = 31;

    /**
     * \if ENGLISH_LANG
     *  Media Gateway
     * \else
     *  媒体网关(接入安卓设备)
     * \endif
     */
    public static final int					NET_EM_DEVICE_MGATEWAY = 32;

    /**
     * \if ENGLISH_LANG
     *  VTO
     * \else
     *  智网门口机设备
     * \endif
     */
    public static final int					NET_EM_DEVICE_VTO = 33;

    /**
     * \if ENGLISH_LANG
     *  VTH
     * \else
     *  智网室内机设备
     * \endif
     */
    public static final int					NET_EM_DEVICE_VTH = 34;

    /**
     * \if ENGLISH_LANG
     *  VTT
     * \else
     *  可视对讲终端
     * \endif
     */
    public static final int					NET_EM_DEVICE_VTT = 35;

    /**
     * \if ENGLISH_LANG
     *  VTS
     * \else
     *  管理机
     * \endif
     */
    public static final int					NET_EM_DEVICE_VTS = 36;

    /**
     * \if ENGLISH_LANG
     *  VTNC
     * \else
     *  控制器
     * \endif
     */
    public static final int					NET_EM_DEVICE_VTNC = 37;

    /**
     * \if ENGLISH_LANG
     *  CE
     * \else
     *  消费类卡片机产品
     * \endif
     */
    public static final int					NET_EM_DEVICE_CE = 38;

    /**
     * \if ENGLISH_LANG
     *  MPT
     * \else
     *  手持终端
     * \endif
     */
    public static final int					NET_EM_DEVICE_MPT = 39;

    /**
     * \if ENGLISH_LANG
     *  ATM
     * \else
     *  金融ATM
     * \endif
     */
    public static final int					NET_EM_DEVICE_ATM = 40;

    /**
     * \if ENGLISH_LANG
     *  SHG
     * \else
     *  智网家庭网关
     * \endif
     */
    public static final int					NET_EM_DEVICE_SHG = 41;

    /**
     * \if ENGLISH_LANG
     *  ARM
     * \else
     *  防护舱控制器
     * \endif
     */
    public static final int					NET_EM_DEVICE_ARM = 42;

    /**
     * \if ENGLISH_LANG
     *  ASM
     * \else
     *  无线中继设备
     * \endif
     */
    public static final int					NET_EM_DEVICE_ASM = 43;

    /**
     * \if ENGLISH_LANG
     *  VTA
     * \else
     *  报警柱
     * \endif
     */
    public static final int					NET_EM_DEVICE_VTA = 44;

    /**
     * \if ENGLISH_LANG
     *  UAVGA
     * \else
     *  机载云台
     * \endif
     */
    public static final int					NET_EM_DEVICE_UAVGA = 45;

    /**
     * \if ENGLISH_LANG
     *  UAVR
     * \else
     *  一体化遥控器
     * \endif
     */
    public static final int					NET_EM_DEVICE_UAVR = 46;

    /**
     * \if ENGLISH_LANG
     *  Air Craft
     * \else
     *  无人机
     * \endif
     */
    public static final int					NET_EM_DEVICE_AIRCRAFT = 47;

    /**
     * \if ENGLISH_LANG
     *  UAVS
     * \else
     *  地面站
     * \endif
     */
    public static final int					NET_EM_DEVICE_UAVS = 48;

    /**
     * \if ENGLISH_LANG
     *  TPCSD
     * \else
     *  热成像云台摄像机
     * \endif
     */
    public static final int					NET_EM_DEVICE_TPCSD = 49;

    /**
     * \if ENGLISH_LANG
     *  TPCBF
     * \else
     *  热成像枪机
     * \endif
     */
    public static final int					NET_EM_DEVICE_TPCBF = 50;

    /**
     * \if ENGLISH_LANG
     *  Radar
     * \else
     *  雷达
     * \endif
     */
    public static final int					NET_EM_DEVICE_RADAR = 51;

    /**
     * \if ENGLISH_LANG
     *  Radar with SD
     * \else
     *  雷达系统
     * \endif
     */
    public static final int					NET_EM_DEVICE_RADAR_PTZ = 52;

    /**
     * \if ENGLISH_LANG
     *  Radar with IPC
     * \else
     *  摄像雷达
     * \endif
     */
    public static final int					NET_EM_DEVICE_RADAR_CAM = 53;

    /**
     * \if ENGLISH_LANG
     *  KVM input node
     * \else
     *  KVM输入节点
     * \endif
     */
    public static final int					NET_EM_DEVICE_KVM_IN = 54;

    /**
     * \if ENGLISH_LANG
     *  KVM output node
     * \else
     *  KVM输出节点
     * \endif
     */
    public static final int					NET_EM_DEVICE_KVM_OUT = 55;

    /**
     * \if ENGLISH_LANG
     *  IVSS
     * \else
     *  IVSS
     * \endif
     */
    public static final int					NET_EM_DEVICE_IVSS = 56;

}
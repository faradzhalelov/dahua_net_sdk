package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief Matrix sub card information
 * \else
 * @brief 矩阵子卡信息
 * \endif
 */
public class NET_MATRIX_CARDS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Main Server number, numbering from 0, including Main Server
     * \else
     * 主机号, 从0开始编号, 含主机
     * \endif
     */
    public int nHost;

    /**
     * \if ENGLISH_LANG
     * sub-card number, numbered from 0, including the main card
     * \else
     * 子卡号, 从0开始编号, 含主卡
     * \endif
     */
    public int nCard;

    /**
     * \if ENGLISH_LANG
     * Number of child Card Types
     * \else
     * 子卡类型个数
     * \endif
     */
    public int nTypeCount;

    /**
     * \if ENGLISH_LANG
     * SubCard Type,{@link EM_MATRIX_SUB_CARD_TYPE}
     * \else
     * 子卡类型,{@link EM_MATRIX_SUB_CARD_TYPE}
     * \endif
     */
    public int emType[] = new int[32];

    /**
     * \if ENGLISH_LANG
     * Definition
     * \else
     * 清晰度类型
     * \endif
     */
    public byte szDefinition[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Interface
     * \else
     * 子卡接口类型
     * \endif
     */
    public byte szInterface[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Video Input Number of Channels
     * \else
     * 视频输入通道数目
     * \endif
     */
    public int nVideoInputChannels;

    /**
     * \if ENGLISH_LANG
     * Number of Video Input Channel Port Type
     * \else
     * 视频输入通道接口类型个数
     * \endif
     */
    public int nVideoInputInterfaceTypeCount;

    /**
     * \if ENGLISH_LANG
     * Video Input Channel Port Type,{@link EM_VIDEO_INTERFACE_TYPE}
     * \else
     * 视频输入通道接口类型,{@link EM_VIDEO_INTERFACE_TYPE}
     * \endif
     */
    public int emVideoInputInterfaceType[] = new int[32];

    /**
     * \if ENGLISH_LANG
     * Video Input Logic Channel Number Start and End Value
     * \else
     * 视频输入逻辑通道号起止值
     * \endif
     */
    public int nVideoInputChannelsRange[] = new int[2];

    /**
     * \if ENGLISH_LANG
     * Audio Input Number of Channels
     * \else
     * 音频输入通道数目
     * \endif
     */
    public int nAudioInputChannels;

    /**
     * \if ENGLISH_LANG
     * Audio input logical Channel Number start and end values
     * \else
     * 音频输入逻辑通道号起止值
     * \endif
     */
    public int nAudioInputChannelsRange[] = new int[2];

    /**
     * \if ENGLISH_LANG
     * Video Output Number of Channels
     * \else
     * 视频输出通道数目
     * \endif
     */
    public int nVideoOutputChannels;

    /**
     * \if ENGLISH_LANG
     * Number of Video Output Channel Port Type
     * \else
     * 视频输出通道接口类型个数
     * \endif
     */
    public int nVideoOutputInterfaceTypeCount;

    /**
     * \if ENGLISH_LANG
     * Video Output Channel Port Type,{@link EM_VIDEO_INTERFACE_TYPE}
     * \else
     * 视频输出通道接口类型,{@link EM_VIDEO_INTERFACE_TYPE}
     * \endif
     */
    public int emVideoOutputInterfaceType[] = new int[32];

    /**
     * \if ENGLISH_LANG
     * Video Output Logic Channel Number Start and End Value
     * \else
     * 视频输出逻辑通道号起止值
     * \endif
     */
    public int nVideoOutputChannelsRange[] = new int[2];

    /**
     * \if ENGLISH_LANG
     * Audio Output Number of Channels
     * \else
     * 音频输出通道数目
     * \endif
     */
    public int nAudioOutputChannels;

    /**
     * \if ENGLISH_LANG
     * Audio output logic Channel Number start and end values
     * \else
     * 音频输出逻辑通道号起止值
     * \endif
     */
    public int nAudioOutputChannelsRange[] = new int[2];

    /**
     * \if ENGLISH_LANG
     * Number of Channels for Video Coding
     * \else
     * 视频编码通道数目
     * \endif
     */
    public int nVideoEncodeChannels;

    /**
     * \if ENGLISH_LANG
     * Start and end values of video encoding logic Channel Number
     * \else
     * 视频编码逻辑通道号起止值
     * \endif
     */
    public int nVideoEncodeChannelsRange[] = new int[2];

    /**
     * \if ENGLISH_LANG
     * Audio Encoding Number of Channels
     * \else
     * 音频编码通道数目
     * \endif
     */
    public int nAudioEncodeChannels;

    /**
     * \if ENGLISH_LANG
     * Start and end values of Audio encoding logic Channel Number
     * \else
     * 音频编码逻辑通道号起止值
     * \endif
     */
    public int nAudioEncodeChannelsRange[] = new int[2];

    /**
     * \if ENGLISH_LANG
     * Video Decoding Number of channel
     * \else
     * 视频解码通道数目
     * \endif
     */
    public int nVideoDecodeChannels;

    /**
     * \if ENGLISH_LANG
     * Video Decoding logical Channel start and end values
     * \else
     * 视频解码逻辑通道起止值
     * \endif
     */
    public int nVideoDecodeChannelsRange[] = new int[2];

    /**
     * \if ENGLISH_LANG
     * Audio Decoding Number of channel
     * \else
     * 音频解码通道数目
     * \endif
     */
    public int nAudioDecodeChannels;

    /**
     * \if ENGLISH_LANG
     * Audio Decoding logical Channel start and end values
     * \else
     * 音频解码逻辑通道起止值
     * \endif
     */
    public int nAudioDecodeChannelsRange[] = new int[2];

    /**
     * \if ENGLISH_LANG
     * Intelligent Analysis Number of Channels
     * \else
     * 智能分析通道数目
     * \endif
     */
    public int nVideoAnalyseChannels;

    /**
     * \if ENGLISH_LANG
     * Intelligent analysis of logical Channel Number start and end values
     * \else
     * 智能分析逻辑通道号起止值
     * \endif
     */
    public int nVideoAnalyseChannelsRange[] = new int[2];

    /**
     * \if ENGLISH_LANG
     * Number of Alarm Input Channel
     * \else
     * 报警输入通道数目
     * \endif
     */
    public int nAlarmInputChannels;

    /**
     * \if ENGLISH_LANG
     * Alarm Input Logic Channel Number Start and End Value
     * \else
     * 报警输入逻辑通道号起止值
     * \endif
     */
    public int nAlarmInputChannelsRange[] = new int[2];

    /**
     * \if ENGLISH_LANG
     * Number of Alarm Output Channel
     * \else
     * 报警输出通道数目
     * \endif
     */
    public int nAlarmOutputChannels;

    /**
     * \if ENGLISH_LANG
     * Alarm Output Logic Channel Number Start and End Value
     * \else
     * 报警输出逻辑通道号起止值
     * \endif
     */
    public int nAlarmOutputChannelsRange[] = new int[2];

    /**
     * \if ENGLISH_LANG
     * Number of sub card level connecting channels
     * \else
     * 子卡级联通道数
     * \endif
     */
    public int nCascadeChannels;

    /**
     * \if ENGLISH_LANG
     * Subcard level connectivity bandwidth, in Mbps units
     * \else
     * 子卡级联通道带宽, 单位Mbps
     * \endif
     */
    public int nCascadeChannelBitrate;

    /**
     * \if ENGLISH_LANG
     * Device IP address or domain name
     * \else
     * 设备IP地址或域名
     * \endif
     */
    public byte szAddress[] = new byte[40];

    /**
     * \if ENGLISH_LANG
     * Port number
     * \else
     * 端口号
     * \endif
     */
    public int nPort;

    /**
     * \if ENGLISH_LANG
     * Subnet Mask
     * \else
     * 子网掩码
     * \endif
     */
    public byte szMask[] = new byte[40];

    /**
     * \if ENGLISH_LANG
     * Gateway
     * \else
     * 网关
     * \endif
     */
    public byte szGateway[] = new byte[40];

    /**
     * \if ENGLISH_LANG
     * Mac address, colon+uppercase
     * \else
     * Mac地址，冒号+大写
     * \endif
     */
    public byte szMac[] = new byte[40];

    /**
     * \if ENGLISH_LANG
     * Number of serial ports
     * \else
     * 串口数目
     * \endif
     */
    public int nCommPorts;

    /**
     * \if ENGLISH_LANG
     * Starting and ending values of serial logic channel numbers
     * \else
     * 串口逻辑通道号起止值
     * \endif
     */
    public int nCommChannelsRange[] = new int[2];

    /**
     * \if ENGLISH_LANG
     * Sub card status: "Normal", "NoResponse", "NetAbort", "IPConflict", "Upgrading", "LinkStatusError", "AdapterLinkOff"
     * \else
     * 子卡状态: "Normal": 正常, "NoResponse": 无响应, "NetAbort": 网络掉线, "IPConflict": IP冲突, "Upgrading": 正在升级, "LinkStatusError": 链路状态异常, "AdapterLinkOff": 子板背板未插好
     * \endif
     */
    public byte szStatus[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Sub card mode
     * \else
     * 子卡模式
     * \endif
     */
    public byte szMode[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Subcard version information
     * \else
     * 子卡版本信息
     * \endif
     */
    public byte szVersion[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Sub card version compilation time
     * \else
     * 子卡版本编译时间
     * \endif
     */
    public NET_TIME stuBuildTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * Biso version information
     * \else
     * Biso版本信息
     * \endif
     */
    public byte szBiosVersion[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * Encoding card audio source type, 0: unknown, 1: only NORMAL, 3: NORMAL and HDMI
     * \else
     * 编码卡音频源类型, 0:未知, 1:只有NORMAL, 3:NORMAL及HDMI
     * \endif
     */
    public int nAudioType;

    /**
     * \if ENGLISH_LANG
     * Number of chips
     * \else
     * 芯片个数
     * \endif
     */
    public int nChipNum;

    /**
     * \if ENGLISH_LANG
     * Number of microcontroller version numbers
     * \else
     * 单片机版本号个数
     * \endif
     */
    public int nMCUVersionCount;

    /**
     * \if ENGLISH_LANG
     * Microcontroller version number
     * \else
     * 单片机版本号
     * \endif
     */
    public byte szMCUVersion[][] = new byte[10][32];

    /**
     * \if ENGLISH_LANG
     * Number of FPGA versions
     * \else
     * FPGA版本个数
     * \endif
     */
    public int nFPGAVersionCount;

    /**
     * \if ENGLISH_LANG
     * FPGA version
     * \else
     * FPGA版本
     * \endif
     */
    public byte szFPGAVersion[][] = new byte[10][32];

}
package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device port information
 * \else
 * 设备端口信息
 * \endif
 */
public class NET_NMPDEVPORT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;



    /**
     * \if ENGLISH_LANG
     * Device connection port number
     * \else
     * 设备连接端口号
     * \endif
     */
    public int			            dwLocalPortId;

    /**
     * \if ENGLISH_LANG
     * PoE status
     * \else
     * PoE状态
     * \endif
     */
    public int	            emPoEStatus;

    /**
     * \if ENGLISH_LANG
     * Device connection port description
     * \else
     * 设备连接端口描述
     * \endif
     */
    public byte			            szLocalPortDescr[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * Box ID of port
     * \else
     * 端口所在框ID
     * \endif
     */
    public int				            nChassisId;

    /**
     * \if ENGLISH_LANG
     * Slot ID of port
     * \else
     * 端口所在槽ID
     * \endif
     */
    public int				            nSlotId;

    /**
     * \if ENGLISH_LANG
     * Device port alias
     * \else
     * 设备端口别名
     * \endif
     */
    public byte			            szAliasName[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * Aggregation ID (0 means it does not belong to aggregation锟斤拷
     * \else
     * 聚合ID（0表示不属于聚合）
     * \endif
     */
    public int			            dwAggregationId;

    /**
     * \if ENGLISH_LANG
     * Port negotiation rate锟斤拷Unit锟斤拷mbps
     * \else
     * 端口协商速率，单位：mbps
     * \endif
     */
    public int			            dwSpeed;

    /**
     * \if ENGLISH_LANG
     * Port connection status
     * \else
     * 端口连接状态
     * \endif
     */
    public int	            emStatus;

    /**
     * \if ENGLISH_LANG
     * Port transport media
     * \else
     * 端口传输介质
     * \endif
     */
    public int	            emMedia;

    /**
     * \if ENGLISH_LANG
     * Port duplex status
     * \else
     * 端口双工状态
     * \endif
     */
    public int	            emDuplexMode;

    /**
     * \if ENGLISH_LANG
     * PoE power consumption
     * \else
     * PoE功耗
     * \endif
     */
    public float			            fPoEPower;

    /**
     * \if ENGLISH_LANG
     * Number of unicast received messages
     * \else
     * 单播接收报文数
     * \endif
     */
    public long			            dwInUcastPkts;

    /**
     * \if ENGLISH_LANG
     * Number of unicast messages send
     * \else
     * 单播发送报文数
     * \endif
     */
    public long			            dwOutUcastPkts;

    /**
     * \if ENGLISH_LANG
     * Number of broadcast received messages
     * \else
     * 广播接收报文数
     * \endif
     */
    public long			            dwInBroadcastPkts;

    /**
     * \if ENGLISH_LANG
     * Number of broadcast messages
     * \else
     * 广播发送报文数
     * \endif
     */
    public long			            dwOutBroadcastPkts;

    /**
     * \if ENGLISH_LANG
     * Number of messages received by multicast
     * \else
     * 组播接收报文数
     * \endif
     */
    public long			            dwInMulticastPkts;

    /**
     * \if ENGLISH_LANG
     * Number of multicast messages send
     * \else
     * 组播发送报文数
     * \endif
     */
    public long			            dwOutMulticastPkts;

    /**
     * \if ENGLISH_LANG
     * Number of packet loss received
     * \else
     * 接收丢包数
     * \endif
     */
    public long			            dwInDiscardPkts;

    /**
     * \if ENGLISH_LANG
     * Number of packet loss send
     * \else
     * 发送丢包数
     * \endif
     */
    public long			            dwOutDiscardPkts;

    /**
     * \if ENGLISH_LANG
     * Total number of received pause frames (- 1 indicates illegal value)
     * \else
     * 接收Pause帧总数（-1表示非法值）
     * \endif
     */
    public long			            nInPausePkts;

    /**
     * \if ENGLISH_LANG
     * Total number of pause frames sent (- 1 indicates illegal value)
     * \else
     * 发送Pause帧总数（-1表示非法值）
     * \endif
     */
    public long			            nOutPausePkts;

    /**
     * \if ENGLISH_LANG
     * Total number of packets filtered (- 1 indicates illegal value)
     * \else
     * 接收包过滤总包数（-1表示非法值）
     * \endif
     */
    public long			            nInFilterPkts;

    /**
     * \if ENGLISH_LANG
     * Total bytes received
     * \else
     * 接收包字节总数
     * \endif
     */
    public long			            dwInOctets;

    /**
     * \if ENGLISH_LANG
     * Total bytes send
     * \else
     * 发送包字节总数
     * \endif
     */
    public long			            dwOutOctets;

    /**
     * \if ENGLISH_LANG
     * Receive real time rate锟斤拷Unit锟斤拷Byte
     * \else
     * 接收实时速率，单位：Byte
     * \endif
     */
    public long			            dwInRate;

    /**
     * \if ENGLISH_LANG
     * Send real time rate锟斤拷Unit锟斤拷Byte
     * \else
     * 发送实时速率，单位：Byte
     * \endif
     */
    public long			            dwOutRate;

    /**
     * \if ENGLISH_LANG
     * Port traffic status
     * \else
     * 端口流量状态
     * \endif
     */
    public int	            emFlowStatus;

    /**
     * \if ENGLISH_LANG
     * Number of neighbor devices array
     * \else
     * 邻居设备数组个数
     * \endif
     */
    public int				            nRetNeighborsNum;

    /**
     * \if ENGLISH_LANG
     * Port enable status
     * \else
     * 端口开关状态
     * \endif
     */
    public int       emPortEnableStatus;

    /**
     * \if ENGLISH_LANG
     * Port bandwidth configuration status, 0 means self negotiation
     * \else
     * 端口带宽配置状态, 0 表示自协商
     * \endif
     */
    public int                        nPortSpeedStatus;

    /**
     * \if ENGLISH_LANG
     * Port duplex configuration mode
     * \else
     * 端口双工配置模式
     * \endif
     */
    public int         emPortDuplexMode;

    /**
     * \if ENGLISH_LANG
     * Port remote transmission switch status
     * \else
     * 端口远距离传输开关状态
     * \endif
     */
    public int     emPortDistanceStatus;

    /**
     * \if ENGLISH_LANG
     * Port flow control status
     * \else
     * 端口流控状态
     * \endif
     */
    public int         emPortFlowStatus;

    /**
     * \if ENGLISH_LANG
     * Port flow control enable status
     * \else
     * 端口流控使能状态
     * \endif
     */
    public int  emPortFlowEnable;

    /**
     * \if ENGLISH_LANG
     * Watchdog switch status
     * \else
     * 看门狗开关状态
     * \endif
     */
    public int    emPDaliveEnable;

    /**
     * \if ENGLISH_LANG
     * Port receive utilization, unit%
     * \else
     * 端口接收利用率，单位%
     * \endif
     */
    public int                        nInPortUsage;

    /**
     * \if ENGLISH_LANG
     * Port send utilization, unit%
     * \else
     * 端口发送利用率，单位%
     * \endif
     */
    public int                        nOutPortUsage;

    /**
     * \if ENGLISH_LANG
     * Port receive utilization threshold, unit%
     * \else
     * 端口接收利用率阈值，单位%
     * \endif
     */
    public int                        nInThreshold;

    /**
     * \if ENGLISH_LANG
     * Port send utilization threshold, unit%
     * \else
     * 端口发送利用率阈值，单位%
     * \endif
     */
    public int                        nOutThreshold;

    /**
     * \if ENGLISH_LANG
     * The number of bandwidth duplex capacity, that is, the number of effective elements of stuSpeedDuplexCap array
     * \else
     * 带宽双工能力个数, 即stuSpeedDuplexCap 数组的有效元素个数
     * \endif
     */
    public int                        nRetSpeedDuplexCap;


    /**
     * \if ENGLISH_LANG
     * 7-day peak receive rate of port, unit: byte
     * \else
     * 端口七天峰值接收速率，单位：Byte
     * \endif
     */
    public long                      nInTopRate;

    /**
     * \if ENGLISH_LANG
     * 7-day peak sending rate of port, unit: byte
     * \else
     * 端口七天峰值发送速率，单位：Byte
     * \endif
     */
    public long                      nOutTopRate;

}

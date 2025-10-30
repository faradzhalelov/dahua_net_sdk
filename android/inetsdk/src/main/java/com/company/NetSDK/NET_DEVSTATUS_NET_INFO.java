package com.company.NetSDK;
import java.io.Serializable;


public class NET_DEVSTATUS_NET_INFO implements
        Serializable{
    private static final long serialVersionUID = 1L;

    // wifi信号强度等级，0~5，0表示没有信号
    public int      nWifiIntensity;

    // wifi信号强度，单位dbm, 0~100,0表示没有信号
    public int      nWifiSignal;

    // 2g/3g/4g信号强度,单位dbm. 0~100, 0表示没有信号
    public int      nCellulSignal;

    // 2g/3g/4g信号强度等级,0~5, 0表示没有信号
    public int      nCellulIntensity;

    // 有线网连接状态
    public int      emEthState;

    // 蜂窝网络实际使用流量，单位：MB
    public int      n3Gflux;

    // 网络实际使用时长，单位：分钟
    public int      n3GfluxByTime;

}

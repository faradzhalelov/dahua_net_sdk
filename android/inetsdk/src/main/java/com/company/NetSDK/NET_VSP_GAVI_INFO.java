package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Register info
 * \else
 * 注册平台信息
 * \endif
 */
public class NET_VSP_GAVI_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Register platform IP address or network name. IP is space-time, no access
     * \else
     * 注册平台IP地址或网络名。IP为空时，不做接入
     * \endif
     */
    public byte                			szAddress[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Equipment login account
     * \else
     * 设备登陆帐号
     * \endif
     */
    public byte                			szUserId[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * Login password
     * \else
     * 登陆密码
     * \endif
     */
    public byte                			szPassword[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * Port number
     * \else
     * 注册平台端口号
     * \endif
     */
    public int                			nPort;

    /**
     * \if ENGLISH_LANG
     * connect enable
     * \else
     * 接入使能
     * \endif
     */
    public boolean							bEnable;

    /**
     * \if ENGLISH_LANG
     * keep alive time,[10,90],unit:s
     * \else
     * 会话保活周期，范围[10,90],单位秒
     * \endif
     */
    public int							nKeepAliveTime;

    /**
     * \if ENGLISH_LANG
     * max timeout times,[2,5]
     * \else
     * 最大超时次数，范围[2,5]
     * \endif
     */
    public int							nMaxTimeoutTimes;

    /**
     * \if ENGLISH_LANG
     * register interval,[30,300],unit:s
     * \else
     * 注册失败后重新注册随机时间上限，范围[30,300],单位秒
     * \endif
     */
    public int							nRegisterInterval;

    /**
     * \if ENGLISH_LANG
     * device id
     * \else
     * 注册设备ID
     * \endif
     */
    public byte							szDeviceID[] = new byte[24];

    /**
     * \if ENGLISH_LANG
     * channel info
     * \else
     * 通道信息
     * \endif
     */
    public NET_VSP_GAVI_CHANNEL_INFO[] pstuChannelInfo;

    /**
     * \if ENGLISH_LANG
     * num of pstuChannelInfo,same as the channel num of device
     * \else
     * pstuChannelInfo 个数，和通道数保持一致
     * \endif
     */
    public int							nChannelCount;

    /**
     * \if ENGLISH_LANG
     * the returned num of pstuChannelInfo
     * \else
     * 返回的 pstuChannelInfo 个数
     * \endif
     */
    public int							nChannelCountRet;

    /**
     * \if ENGLISH_LANG
     * current platform,refer to {@link EM_VSP_GAVI_PLATFORM_CODE}
     * \else
     * 当前平台,具体参考{@link EM_VSP_GAVI_PLATFORM_CODE}
     * \endif
     */
    public int		emPlatform;

    /**
     * \if ENGLISH_LANG
     * is online,can not modified
     * \else
     * 是否在线，不可修改
     * \endif
     */
    public boolean							bIsOnLine;

    /**
     * \if ENGLISH_LANG
     * Hik image server info, valid when emPlatform is EM_VSP_GAVI_PLATFORM_CODE_HKTDA_CLOUDSTORAGE
     * \else
     * Hik视图云存储服务器鉴权密钥信息，emPlatform 为 EM_VSP_GAVI_PLATFORM_CODE_HKTDA_CLOUDSTORAGE时有效
     * \endif
     */
    public NET_HKIMAGESERVER_INFO pHKImageServerInfo = new NET_HKIMAGESERVER_INFO();

    public NET_VSP_GAVI_INFO(int nChannelCount){
        this.nChannelCount = nChannelCount;
        pstuChannelInfo = new NET_VSP_GAVI_CHANNEL_INFO[nChannelCount];
        for(int i = 0; i < nChannelCount; ++i){
            pstuChannelInfo[i] = new NET_VSP_GAVI_CHANNEL_INFO();
        }
    }
}

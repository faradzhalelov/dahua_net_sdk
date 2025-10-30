package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Public security 1 platform input config info{@link NET_EM_CFG_VSP_GAYS_SERVER}
 * \else
 * 平台接入配置信息 对应枚举 {@link NET_EM_CFG_VSP_GAYS_SERVER}
 * \endif
 */
public class NET_CFG_VSP_GAYS_SERVER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * SIP server info num,not more than MAX_SIP_SERVER_NUM, Used in set Sip Server Info
     * \else
     * 下发SIP服务器信息的个数,不超过MAX_SIP_SERVER_NUM
     * \endif
     */
    public int					nSipServerInfoNum;

    /**
     * \if ENGLISH_LANG
     * SIP server info
     * \else
     * SIP服务器信息
     * \endif
     */
    public NET_SIP_SERVER_INFO				stuSipServerInfo[] = new NET_SIP_SERVER_INFO[FinalVar.MAX_SIP_SERVER_NUM];

    /**
     * \if ENGLISH_LANG
     * Return SIP server info num
     * \else
     * 获取到的实际返回SIP服务器信息个数
     * \endif
     */
    public int					nRetSipServerInfoNum;

    public NET_CFG_VSP_GAYS_SERVER_INFO(int nChannelInfoNum, int nAlarmInfoNum, int nAudioOutputChnInfoNum){
        for(int i = 0; i < FinalVar.MAX_SIP_SERVER_NUM; i++){
            stuSipServerInfo[i] = new NET_SIP_SERVER_INFO(nChannelInfoNum, nAlarmInfoNum, nAudioOutputChnInfoNum);
        }
    }

}

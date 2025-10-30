package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * CLIENT_GetPushInfosRTMPManager Interface output parameter
 * \else
 * CLIENT_GetPushInfosRTMPManager 接口出参
 * \endif
 */
public class NET_OUT_RTMP_MANAGER_GETPUSHINFOS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of information created for streaming task
     * \else
     *  已创建推流任务的信息个数
     * \endif
     */
    public int					nPushInfosNum;

    /**
     * \if ENGLISH_LANG
     *  Information of created streaming task
     * \else
     *  已创建推流任务的信息
     * \endif
     */
    public NET_RTMP_MANAGER_PUSHINFOS					stuPushInfos[] = new NET_RTMP_MANAGER_PUSHINFOS[32];

    public NET_OUT_RTMP_MANAGER_GETPUSHINFOS() {
        for(int i = 0; i < 32; i ++){
            stuPushInfos[i] = new NET_RTMP_MANAGER_PUSHINFOS();
        }
    }
}

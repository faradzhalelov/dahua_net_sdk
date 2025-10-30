package com.company.NetSDK;

import java.io.Serializable;




/**
 * \if ENGLISH_LANG
 * {@link INetSDK#StartRemoteUpgrade} input param
 * \else
 * {@link INetSDK#StartRemoteUpgrade} 接口输入参数
 * \endif
 */
public class NET_IN_START_REMOTE_UPGRADE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The number of list
     * \else
     * 需要升级的远程通道个数
     * \endif
     */
    public int                 nListNum;

    /**
     * \if ENGLISH_LANG
     * The list of channel information which need to upgrade
     * \else
     * 需要升级的远程通道信息
     * \endif
     */
    public NET_REMOTE_UPGRADE_CHNL_INFO[]						pstuList;

    /**
     * \if ENGLISH_LANG
     * The file path name of upgrade
     * \else
     * 升级文件名称
     * \endif
     */
    public byte             szFileName[] = new byte[256];


    /**
     * \if ENGLISH_LANG
     * The callback of remote upgrade
     * \else
     * 升级进度回调函数
     * \endif
     */
    public CB_fRemoteUpgradeCallBack cbRemoteUpgrade;

    public NET_IN_START_REMOTE_UPGRADE_INFO(int nListNum) {
        this.nListNum = nListNum;
        pstuList = new NET_REMOTE_UPGRADE_CHNL_INFO[nListNum];
        for (int i = 0; i < nListNum; i++) {
            pstuList[i] = new NET_REMOTE_UPGRADE_CHNL_INFO();
        }
    }

}

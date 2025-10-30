package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ preset list, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_PTZ_PRESET_LIST}
 * \else
 * 云台预置点列表, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_PTZ_PRESET_LIST}
 * \endif
 */
public class NET_PTZ_PRESET_LIST implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * preset max
     * \else
     * 预置点最大个数
     * \endif
     */
    public int                   dwMaxPresetNum;

    /**
     * \if ENGLISH_LANG
     * return preset quantity
     * \else
     * 返回预置点个数
     * \endif
     */
    public int                   dwRetPresetNum;

    /**
     * \if ENGLISH_LANG
     * preset list(apply according to max quantity),the space appliacation by the user,apply to sizeof(NET_PTZ_PRESET)*dwMaxPresetNum
     * \else
     * 预置点列表(入参需要根据最大个数申请内存),内存大小为sizeof(NET_PTZ_PRESET)*dwMaxPresetNum
     * \endif
     */
    public NET_PTZ_PRESET[]      pstuPtzPorsetList;

    public NET_PTZ_PRESET_LIST(int dwMaxPresetNum) {
        this.dwMaxPresetNum = dwMaxPresetNum;
        pstuPtzPorsetList = new NET_PTZ_PRESET[dwMaxPresetNum];
        for(int i = 0; i < dwMaxPresetNum; i++) {
            pstuPtzPorsetList[i] = new NET_PTZ_PRESET();
        }
    }
}

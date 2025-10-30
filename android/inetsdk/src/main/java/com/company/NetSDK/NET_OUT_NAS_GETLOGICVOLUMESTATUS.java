package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#NASGetLogicVolumeStatus} output parameter
 * \else
 *  接口 {@link INetSDK#NASGetLogicVolumeStatus} 接口输出参数
 * \endif
 */
public class NET_OUT_NAS_GETLOGICVOLUMESTATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * LV status, refer to {@link EM_LOGIC_VOLUME_STATUS}
     * \else
     * 分区状态, 參考 {@link EM_LOGIC_VOLUME_STATUS}
     * \endif
     */
    public int 		         emLVStatus;

    /**
     * \if ENGLISH_LANG
     * LV Name,Valid by {@link NET_OUT_NAS_GETLOGICVOLUMESTATUS#emLVStatus} is {@link EM_LOGIC_VOLUME_STATUS#EM_LOGIC_VOLUME_STATUS_LV_NEED_REPAIR} or {@link EM_LOGIC_VOLUME_STATUS#EM_LOGIC_VOLUME_STATUS_LV_REPAIRING}
     * \else
     * 分区名称,当 {@link NET_OUT_NAS_GETLOGICVOLUMESTATUS#emLVStatus} 是 {@link EM_LOGIC_VOLUME_STATUS#EM_LOGIC_VOLUME_STATUS_LV_NEED_REPAIR} 或 {@link EM_LOGIC_VOLUME_STATUS#EM_LOGIC_VOLUME_STATUS_LV_REPAIRING} 时有效
     * \endif
     */
    public byte[][]			 szLvName = new byte[FinalVar.MAX_LV_NAME_NUM][FinalVar.MAX_LV_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Return LV name num
     * \else
     * 返回的分区名称个数
     * \endif
     */
    public int					nRetLvNameNum;
}

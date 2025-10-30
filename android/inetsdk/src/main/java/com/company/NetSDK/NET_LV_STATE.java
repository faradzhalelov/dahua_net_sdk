package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * LV info
 * \else
 * 分区信息
 * \endif
 */
public class NET_LV_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * LV repair status，refer to {@link EM_LOGIC_VOLUME_REPAIR_STATUS}
     * \else
     * 修复状态, 参考 {@link EM_LOGIC_VOLUME_REPAIR_STATUS}
     * \endif
     */
    public int	                     emLVRepairStatus;

    /**
     * \if ENGLISH_LANG
     * LV name
     * \else
     * 分区名称
     * \endif
     */
    public byte[][]				 szLvName = new byte[FinalVar.MAX_LV_NAME_NUM][FinalVar.MAX_LV_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Return LV name num
     * \else
     * 返回的分区名称个数
     * \endif
     */
    public int						 nRetLvNameNum;
}

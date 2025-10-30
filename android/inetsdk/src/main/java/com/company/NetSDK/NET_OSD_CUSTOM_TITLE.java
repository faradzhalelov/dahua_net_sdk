package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Encode widget-User-defined title
 * \else
 * 编码物件-自定义标题
 * \endif
 */
public class NET_OSD_CUSTOM_TITLE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Overlay Type, should set the value whether getting config  or setting config, refer to {@link NET_EM_OSD_BLEND_TYPE}
     * \else
     * 叠加类型，不管是获取还是设置都要设置该字段,参考 {@link NET_EM_OSD_BLEND_TYPE}
     * \endif
     */
    public int                     emOsdBlendType;

    /**
     * \if ENGLISH_LANG
     * User-defined title amount
     * \else
     * 自定义标题数量
     * \endif
     */
    public int                      nCustomTitleNum;

    /**
     * \if ENGLISH_LANG
     * Background color
     * \else
     * 背景色
     * \endif
     */
    public NET_CUSTOM_TITLE_INFO[]    stuCustomTitle = new NET_CUSTOM_TITLE_INFO[FinalVar.MAX_CUSTOM_TITLE_NUM];

    public NET_OSD_CUSTOM_TITLE() {
        for (int i = 0; i < stuCustomTitle.length; i++) {
            stuCustomTitle[i] = new NET_CUSTOM_TITLE_INFO();
        }
    }

    @Override
    public String toString() {
        return "NET_OSD_CUSTOM_TITLE{" +
                "emOsdBlendType=" + emOsdBlendType +
                ", nCustomTitleNum=" + nCustomTitleNum +
                ", stuCustomTitle=" + stuCustomTitle +
                '}';
    }
}

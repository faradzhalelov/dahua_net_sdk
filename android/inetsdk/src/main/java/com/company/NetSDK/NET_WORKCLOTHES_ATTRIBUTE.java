package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Attribute of work clothes
 * \else
 * @brief 工作服属性
 * \endif
 */
public class NET_WORKCLOTHES_ATTRIBUTE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The state of work clothes,{@link EM_WORKCLOTHES_STATE}
     * \else
     *  工作服穿戴状态,{@link EM_WORKCLOTHES_STATE}
     * \endif
     */
    public int					emWorkClothesState;

    /**
     * \if ENGLISH_LANG
     *  Color of work clothes,{@link EM_CLOTHES_COLOR}
     * \else
     *  工作服颜色,{@link EM_CLOTHES_COLOR}
     * \endif
     */
    public int					emWorkClothColor;

    /**
     * \if ENGLISH_LANG
     *  Work clothes legal state,{@link EM_CLOTHES_LEGAL_STATE}
     * \else
     *  工作服合法状态,{@link EM_CLOTHES_LEGAL_STATE}
     * \endif
     */
    public int					emWorkClothesLegalState;

    /**
     * \if ENGLISH_LANG
     *  Number of Link Group Info
     * \else
     *  联动报警的工装库信息个数
     * \endif
     */
    public int					nLinkGroupInfoNum;

    /**
     * \if ENGLISH_LANG
     *  Link Group Info
     * \else
     *  联动报警的工装库信息
     * \endif
     */
    public NET_LINK_GROUP_INFO					pstuLinkGroupInfo[];

    /**
     * \if ENGLISH_LANG
     *  Trousers Color,{@link EM_CLOTHES_COLOR}
     * \else
     *  工作服裤子颜色,{@link EM_CLOTHES_COLOR}
     * \endif
     */
    public int					emTrousersColor;

    /**
     * \if ENGLISH_LANG
     *  Preferred solution, 0: Unknown, 1: Full body, 2: Upper body
     * \else
     *  优选方案, 0:未知,1:全身,2:上半身
     * \endif
     */
    public int					nCutoutPolicy;

    /**
     * \if ENGLISH_LANG
     *  Link group name
     * \else
     *  触发报警的工装库名称
     * \endif
     */
    public byte					szLinkGroupName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Link group ID
     * \else
     *  触发报警的工装库ID
     * \endif
     */
    public byte					szLinkGroupID[] = new byte[128];
    public NET_WORKCLOTHES_ATTRIBUTE() {
    }
    public NET_WORKCLOTHES_ATTRIBUTE(int nLinkGroupInfoNum) {
        this.nLinkGroupInfoNum = nLinkGroupInfoNum;
        this.pstuLinkGroupInfo = new NET_LINK_GROUP_INFO[nLinkGroupInfoNum];
        for(int i = 0; i < nLinkGroupInfoNum; i ++) {
            this.pstuLinkGroupInfo[i] = new NET_LINK_GROUP_INFO();
        }
    }
}
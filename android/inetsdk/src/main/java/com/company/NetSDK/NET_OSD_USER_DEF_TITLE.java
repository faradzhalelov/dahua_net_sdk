package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief User defined OSD title NET_EM_CFG_USER_DEF_TITLE
 * \else
 * @brief 用户自定义OSD标题 NET_EM_CFG_USER_DEF_TITLE
 * \endif
 */
public class NET_OSD_USER_DEF_TITLE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of custom titles
     * \else
     *  自定义标题数量
     * \endif
     */
    public int					nUserDefTitleNum;

    /**
     * \if ENGLISH_LANG
     *  Custom title
     * \else
     *  自定义标题
     * \endif
     */
    public NET_USER_DEF_TITLE_INFO					stuUserDefTitle[] = new NET_USER_DEF_TITLE_INFO[16];
    
    public NET_OSD_USER_DEF_TITLE() {
    	for (int i = 0; i < stuUserDefTitle.length; i++) {
    		stuUserDefTitle[i] = new NET_USER_DEF_TITLE_INFO();
		}
    }

}
package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetAutoRegisterState Output parameter
 * \else
 * @brief CLIENT_GetAutoRegisterState 出参
 * \endif
 */
public class NET_OUT_GET_AUTO_REGISTER_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of actively registered server information
     * \else
     *  主动注册服务器信息个数
     * \endif
     */
    public int					nCount;

    /**
     * \if ENGLISH_LANG
     *  Proactively register server information
     * \else
     *  主动注册服务器信息
     * \endif
     */
    public NET_AUTO_REGISTER_STATE					stuStates[] = new NET_AUTO_REGISTER_STATE[128];

    public NET_OUT_GET_AUTO_REGISTER_STATE(){
        for(int i=0;i<stuStates.length;i++){
            stuStates[i]=new NET_AUTO_REGISTER_STATE();
        }

    }

}
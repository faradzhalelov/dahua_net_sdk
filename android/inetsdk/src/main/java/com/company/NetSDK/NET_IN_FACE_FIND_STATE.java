package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CLIENT_AttachFaceFindState interface parameter in
 * \else
 * CLIENT_AttachFaceFindState接口输入参数
 * \endif
 */
public class NET_IN_FACE_FIND_STATE implements Serializable {
    /**
     *
     */
    private static final long           serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Search token. 0=subscribe all searched tasks
     * \else
     * 查询令牌数,为0时,表示订阅所有的查询任务
     * \endif
     */
    public int                          nTokenNum;
    /**
     * \if ENGLISH_LANG
     * Video synopsis task database main key ID
     * \else
     * 查询令牌,由用户申请内存
     * \endif
     */
    public int                          nTokens[];
    /**
     * \if ENGLISH_LANG
     * Call function
     * \else
     * 回调函数
     * \endif
     */
    public CB_fFaceFindStateCallBack    cbFaceFindStateCallBack;

    public NET_IN_FACE_FIND_STATE(int nTokenMaxNum){
        nTokenNum = nTokenMaxNum;
        nTokens = new int[nTokenMaxNum];
    }

}

package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetMatrixCardsInfo output parameters
 * \else
 * @brief CLIENT_GetMatrixCardsInfo 接口输出参数
 * \endif
 */
public class NET_OUT_GET_MATRIX_CARDS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of matrix sub card information
     * \else
     *  矩阵子卡信息个数
     * \endif
     */
    public int					nInfosCount;

    /**
     * \if ENGLISH_LANG
     *  Matrix sub card information
     * \else
     *  矩阵子卡信息
     * \endif
     */
    public NET_MATRIX_CARDS_INFO					stuInfos[] = new NET_MATRIX_CARDS_INFO[64];

    public NET_OUT_GET_MATRIX_CARDS_INFO() {
        for(int i = 0; i < 64; i ++){
            this.stuInfos[i] = new NET_MATRIX_CARDS_INFO();
        }
    }
}
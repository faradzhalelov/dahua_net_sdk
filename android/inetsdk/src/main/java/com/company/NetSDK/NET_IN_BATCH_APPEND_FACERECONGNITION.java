package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Input param of CLIENT_BatchAppendFaceRecognition
 * \else
 * CLIENT_BatchAppendFaceRecognition 接口输入参数
 * \endif
 */
public class NET_IN_BATCH_APPEND_FACERECONGNITION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  the number of persons which are appended to the face DB
     * \else
     *  需要添加的人员数量
     * \endif
     */
    public int					nPersonNum;

    /**
     * \if ENGLISH_LANG
     *  person info,memory is requested by user,and the size is nPersonNum * sizeof(FACERECOGNITION_PERSON_INFOEX)
     * \else
     *  人员信息，内存由用户申请，大小为nPersonNum * sizeof(FACERECOGNITION_PERSON_INFOEX)
     * \endif
     */
    public FACERECOGNITION_PERSON_INFOEX[]					pstPersonInfo;

    /**
     * \if ENGLISH_LANG
     *  picture buffer
     * \else
     *  缓冲地址
     * \endif
     */
    public byte[]					pBuffer;

    /**
     * \if ENGLISH_LANG
     *  length of picture buffer
     * \else
     *  缓冲数据长度
     * \endif
     */
    public int					nBufferLen;

    /**
     * \if ENGLISH_LANG
     *  Extended Information
     * \else
     *  扩展信息
     * \endif
     */
    public NET_MULTI_APPEND_EXTENDED_INFO					stuInfo = new NET_MULTI_APPEND_EXTENDED_INFO();

    public NET_IN_BATCH_APPEND_FACERECONGNITION(int nPersonNum) {
        this.nPersonNum = nPersonNum;
        this.pstPersonInfo = new FACERECOGNITION_PERSON_INFOEX[nPersonNum];
        for(int i = 0; i < nPersonNum; i ++){
            this.pstPersonInfo[i] = new FACERECOGNITION_PERSON_INFOEX();
        }
    }
}

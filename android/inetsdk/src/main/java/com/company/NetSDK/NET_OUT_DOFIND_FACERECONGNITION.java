package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#DoFindFaceRecognition} output parameter
 * \else
 * {@link INetSDK#DoFindFaceRecognition} 接口输出参数
 * \endif
 */
public class NET_OUT_DOFIND_FACERECONGNITION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The actual number of candidate information structure returned
     * \else
     * 实际返回的候选信息结构体个数
     * \endif
     */
    public int                 nCadidateNum;

    /**
     * \if ENGLISH_LANG
     * An array of candidate information
     * \else
     * 候选信息数组
     * \endif
     */
    public CANDIDATE_INFO      stCadidateInfo[] = new CANDIDATE_INFO[FinalVar.MAX_FIND_COUNT];

    /**
     * \if ENGLISH_LANG
     * Buffer address
     * \else
     * 图片缓存信息
     * \endif
     */
    public byte[]                pBuffer;

    /**
     * \if ENGLISH_LANG
     * Buffer data len
     * \else
     * 缓冲数据长度
     * \endif
     */
    public int                  nBufferLen;

    /**
     * \if ENGLISH_LANG
     * whether or not to use stuCandidatesEx，stuCandidatesEx is effective and stuCandidates is invalid when the bUseCandidatesEx is TRUE, otherwise, on the contrary
     * \else
     * 是否使用候选对象扩展结构体, 若为TRUE, 则表示使用stuCandidatesEx, 且stuCandidates无效, 否则相反
     * \endif
     */
    public boolean				bUseCandidatesEx;

    /**
     * \if ENGLISH_LANG
     * the actual return number of stuCandidatesEx
     * \else
     * 实际返回的候选信息结构体个数
     * \endif
     */
    public int 				nCadidateExNum;

    /**
     * \if ENGLISH_LANG
     * the expansion of candidate information
     * \else
     * 当前目标匹配到的候选对象信息, 实际返回个数同nCandidateNum
     * \endif
     */
    public CANDIDATE_INFOEX  stuCandidatesEx[] = new CANDIDATE_INFOEX[FinalVar.MAX_FIND_COUNT];

    public NET_OUT_DOFIND_FACERECONGNITION(int nBufferMaxLen) {
        for(int i = 0; i < FinalVar.MAX_FIND_COUNT; i++) {
            stCadidateInfo[i] = new CANDIDATE_INFO();
            stuCandidatesEx[i] = new CANDIDATE_INFOEX();
        }
        nBufferLen = nBufferMaxLen;
        pBuffer = new byte[nBufferMaxLen];
    }
}

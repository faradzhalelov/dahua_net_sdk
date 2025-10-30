package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetFaceDbVersion output param
 * \else
 * @brief CLIENT_GetFaceDbVersion 接口输出参数
 * \endif
 */
public class NET_OUT_GET_FACE_DB_VERSION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  target database version, target database version number is "0", if no target downloaded or device abnormal target not downloaded completely
     * \else
     *  目标库版本号, 没下发过目标或者设备异常目标未下载完全，目标库版本号为"0"
     * \endif
     */
    public byte					szFaceDbVersion[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Total number of files to download
     * \else
     *  总共需要下载的文件个数
     * \endif
     */
    public int					nTotalCount;

    /**
     * \if ENGLISH_LANG
     *  Number of files downloaded
     * \else
     *  已下载的文件个数
     * \endif
     */
    public int					nSuccessDCount;

    /**
     * \if ENGLISH_LANG
     *  Group ID
     * \else
     *  人员组ID
     * \endif
     */
    public byte					szGroupID[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  target Lib Info Count
     * \else
     *  设备其它人员组ID的目标库信息个数
     * \endif
     */
    public int					nFaceLibInfoExCount;

    /**
     * \if ENGLISH_LANG
     *  target Lib Info
     * \else
     *  设备其它人员组ID的目标库信息
     * \endif
     */
    public NET_FACE_LIB_INFO_EX					stuFaceLibInfoEx[] = new NET_FACE_LIB_INFO_EX[8];

    public NET_OUT_GET_FACE_DB_VERSION(){
        for(int i = 0; i < 8; i++) {
            stuFaceLibInfoEx[i] = new NET_FACE_LIB_INFO_EX();
        }
    }

}
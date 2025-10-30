package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief The client upload information
 * \else
 * @brief 客户端信息
 * \endif
 */
public class NET_UPLOAD_CLIENT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The id of clent, IPv4 address or MAC
     * \else
     *  平台客户端的标识，当前是IPv4地址或者MAC地址
     * \endif
     */
    public byte					szClientID[] = new byte[20];

    /**
     * \if ENGLISH_LANG
     *  The upload flag of clent,{@link EM_UPLOAD_FLAG}
     * \else
     *  平台上传标识,{@link EM_UPLOAD_FLAG}
     * \endif
     */
    public int					emUploadFlag;

    /**
     * \if ENGLISH_LANG
     *  The time to upload to clent
     * \else
     *  上传到平台的UTC时间
     * \endif
     */
    public NET_TIME					stuUploadTime = new NET_TIME();

}
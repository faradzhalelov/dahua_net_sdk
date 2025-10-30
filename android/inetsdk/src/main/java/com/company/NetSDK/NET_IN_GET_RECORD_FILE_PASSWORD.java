package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetRecordFilePassword} port input parameter
 * \else
 * {@link INetSDK#GetRecordFilePassword} 接口输入参数
 * \endif
 */
public class NET_IN_GET_RECORD_FILE_PASSWORD implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * media file name
     * \else
     * 录像文件名称
     * \endif
     */
    public byte                        szFileName[] = new byte[FinalVar.SDK_COMMON_STRING_256];
}

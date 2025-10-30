package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetRecordFilePassword} port output parameter
 * \else
 * {@link INetSDK#GetRecordFilePassword} 接口输出参数
 * \endif
 */
public class NET_OUT_GET_RECORD_FILE_PASSWORD implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * password
     * \else
     * 密码
     * \endif
     */
    public byte                        szPassword[] = new byte[FinalVar.MAX_RECORD_FILE_PASSWORD_LEN+1];
}

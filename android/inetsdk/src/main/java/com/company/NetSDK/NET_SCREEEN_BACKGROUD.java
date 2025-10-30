package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Background information of mosaic area
 * \else
 * 拼接区底图信息
 * \endif
 */
public class NET_SCREEEN_BACKGROUD implements Serializable {

    /**
     *
     */
    private static final long				serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Enable
     * \else
     * 底图是否开启
     * \endif
     */
    public boolean								bEnable;

    /**
     * \if ENGLISH_LANG
     * Background name, background is uploaded file, without path
     * \else
     * 底图名称,底图是已经上传的文件，不带路径名称
     * \endif
     */
    public byte                                 szName[] = new byte[130];

    /**
     * \if ENGLISH_LANG
     * Reserved
     * \else
     * 保留字节用
     * \endif
     */
    public byte                                 byReserved[] = new byte[130];

}

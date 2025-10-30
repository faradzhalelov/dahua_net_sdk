package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#DoFindFaceRecognition} input parameter
 * \else
 * {@link INetSDK#DoFindFaceRecognition} 接口输入参数
 * \endif
 */
public class NET_IN_DOFIND_FACERECONGNITION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Find handle
     * \else
     * 查询句柄
     * \endif
     */
    public long                 lFindHandle;

    /**
     * \if ENGLISH_LANG
     * Queries starting serial number
     * \else
     * 查询起始序号
     * \endif
     */
    public int                  nBeginNum;

    /**
     * \if ENGLISH_LANG
     * The current number of records you want to search for
     * \else
     * 当前想查询的记录条数
     * \endif
     */
    public int                  nCount;

    /**
     * \if ENGLISH_LANG
     * the format of the image returned in the query results, refer to {@link EM_NEEDED_PIC_RETURN_TYPE}
     * \else
     * 指定查询结果返回图片的格式, 参考 {@link EM_NEEDED_PIC_RETURN_TYPE}
     * \endif
     */
    public int	                 emDataType;
}

package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Asynchronous query results callback function prototype,
 * nError = 0 means query success,
 * nError = 1 said memory application failure,
 * nError = 2, timeout
 * nError = 3 said equipment return data validation is not through,
 * nError = 4 send query request failed
 * \else
 * 异步查询结果回调函数原形,
 * nError = 0 表示查询成功;
 * nError = 1 表示内存申请失败;
 * nError = 2 表示超时, 即超时时间内未查完指定时间段的情况, pFileinfos,nFileNum返回已查到的录像列表;
 * nError = 3 表示设备返回数据校验不通过;
 * nError = 4 发送查询请求失败
 * \endif
 */
public interface CB_fQueryRecordFileCallBackEx {

    /**
     * \if ENGLISH_LANG
     * Asynchronous query results callback function prototype
     * @param lQueryHandle return from{@link INetSDK#QueryRecordFile}
     * @param pFileinfos {@link NET_CB_DEVCOMMDATA}
     * @param nFileNum  File numbers
     * @param nError  Error code
     * \else
     * 异步查询录像文件回调接口
     * @param lQueryHandle {@link INetSDK#QueryRecordFile}返回值
     * @param pFileinfos 数据信息，{@link NET_RECORDFILE_INFO}
     * @param nFileNum  文件数量
     * @param nError  错误类型
     * \endif
     */
    public void invoke(long lQueryHandle, NET_RECORDFILE_INFOEX pFileinfos, int index, int nFileNum, int nError);
}

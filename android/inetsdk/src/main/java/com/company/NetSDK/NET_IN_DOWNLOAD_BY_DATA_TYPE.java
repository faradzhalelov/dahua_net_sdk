package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#DownloadByDataType} 's input param
 * \else
 * 开始下载并指定回调数据格式 {@link INetSDK#DownloadByDataType} 输入参数
 * \endif
 */
public class NET_IN_DOWNLOAD_BY_DATA_TYPE implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * 通道编号
	 * \endif
	 */
	public int                         nChannelID;

	/**
	 * \if ENGLISH_LANG
	 * record type {@link EM_QUERY_RECORD_TYPE}
	 * \else
	 * 录像类型 {@link EM_QUERY_RECORD_TYPE}
	 * \endif
	 */
	public int        emRecordType;

	/**
	 * \if ENGLISH_LANG
	 * download file path
	 * \else
	 * 下载的文件路径
	 * \endif
	 */
	public String szSavedFileName;

	/**
	 * \if ENGLISH_LANG
	 * start time
	 * \else
	 * 开始时间
	 * \endif
	 */
	public NET_TIME                    stStartTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * stop time
	 * \else
	 * 结束时间
	 * \endif
	 */
	public NET_TIME                    stStopTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * function prototype of download progress
	 * \else
	 * 进度回调
	 * \endif
	 */
	public CB_fTimeDownLoadPosCallBack    cbDownLoadPos;

	/**
	 * \if ENGLISH_LANG
	 * download data callback function prototype
	 * \else
	 * 数据回调
	 * \endif
	 */
	public CB_fDataCallBack               fDownLoadDataCallBack;

	/**
	 * \if ENGLISH_LANG
	 * stream data type {@link EM_REAL_DATA_TYPE}
	 * \else
	 * 回调的数据类型 {@link EM_REAL_DATA_TYPE}
	 * \endif
	 */
	public int           emDataType;
}

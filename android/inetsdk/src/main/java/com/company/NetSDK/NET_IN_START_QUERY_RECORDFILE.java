package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#StartQueryRecordFile} input param
 * \else
 * {@link INetSDK#StartQueryRecordFile} 接口输入参数
 * \endif
 */
public class NET_IN_START_QUERY_RECORDFILE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * To query the channel number
	 * \else
	 * 待查询通道号, 从0开始
	 * \endif
	 */
    public int                 nChannelId;                        
    
	 /**
	 * \if ENGLISH_LANG
	 * For video query types, refer to {@link EM_QUERY_RECORD_TYPE}
	 * \else
	 * 待查询录像类型, 详见类型 {@link EM_QUERY_RECORD_TYPE}
	 * \endif
	 */
    public int                 nRecordFileType;                   
    
	 /**
	 * \if ENGLISH_LANG
	 * Query stream type, 0 to advocate complementary code stream, 1 - the main stream, 2 - auxiliary stream
	 * \else
	 * 查询码流类型,0-主辅码流,1-主码流,2-辅码流
	 * \endif
	 */
    public int                 nStreamType;                       
    
	 /**
	 * \if ENGLISH_LANG
	 * Query starting time
	 * \else
	 * 查询起始时间
	 * \endif
	 */
    public NET_TIME            stStartTime = new NET_TIME();
    
	 /**
	 * \if ENGLISH_LANG
	 * Query the end time
	 * \else
	 * 查询结束时间
	 * \endif
	 */
    public NET_TIME            stEndTime = new NET_TIME();
    
	 /**
	 * \if ENGLISH_LANG
	 * card id information,the space application is 512 bytes by the user, if nRecordFileType is 4 or 5 or 10,memory is 256 at most, if nRecordFileType is 8,memory is 20 at most
	 * \else
	 * 卡号信息，仅当按照卡号查询时有效，由用户分配内存,如果nRecordFileType = 4或5或10,内存大小不超过256字节,如果nRecordFileType = 8,内存大小不超过20字节
	 * \endif
	 */
    public String              pchCardid;                         
    
	 /**
	 * \if ENGLISH_LANG
	 * Timeout waiting time, ms
	 * \else
	 * 超时等待时间,单位ms 
	 * \endif
	 */
    public int                 nWaitTime;                         
    
	 /**
	 * \if ENGLISH_LANG
	 * The query results callback function(Not Available，please use the Ex callback) 
	 * \else
	 * 查询结果回调函数(不可用,请使用拓展回调) 
	 * \endif
	 */
    public CB_fQueryRecordFileCallBack cbFunc;                   
    
	 /**
	 * \if ENGLISH_LANG
	 * userinfo
	 * \else
	 * 用户信息
	 * \endif
	 */
    public long                dwUser;                            
    
	 /**
	 * \if ENGLISH_LANG
	 * weather query by time
	 * \else
	 * 是否根据时间查询
	 * \endif
	 */
	public boolean			   bByTime;

	/**
	 * \if ENGLISH_LANG
	 *  Whether to combine video
	 * \else
	 *  查询结果是否合并录像文件
	 * \endif
	 */
	public int					emCombination;

	/**
	 * \if ENGLISH_LANG
	 *  Asynchronous query results callback function prototype(extend), Share dwuser with cbFunc
	 * \else
	 *  查询结果回调函数(扩展), 与非扩展回调cbFunc 共用dwUser
	 * \endif
	 */
	public CB_fQueryRecordFileCallBackEx					cbFuncEx;
}

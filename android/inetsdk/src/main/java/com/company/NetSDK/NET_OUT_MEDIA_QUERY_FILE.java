package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record info, corresponding to interface {@link INetSDK#FindNextFileEx}, corresponde to command {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_FILE}, search result
 * \else
 * 录像信息对应 {@link INetSDK#FindNextFileEx} 接口的  {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_FILE}命令查询结果
 * \endif
 */
public class NET_OUT_MEDIA_QUERY_FILE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID,from 0,-1 means search all
	 * \else
	 * 通道号从0开始，-1表示查询所有通道
	 * \endif
	 */
	public int					nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Start time
	 * \else
	 * 开始时间
	 * \endif
	 */
    public NET_TIME			stuStartTime = new NET_TIME();
    
	/**
	 * \if ENGLISH_LANG
	 * End time
	 * \else
	 * 结束时间
	 * \endif
	 */
    public NET_TIME			stuEndTime = new NET_TIME();
    
	/**
	 * \if ENGLISH_LANG
	 * Size of file
	 * \else
	 * 文件长度
	 * \endif
	 */
    public int					nFileSize;
    
	/**
	 * \if ENGLISH_LANG
	 * File type 1:jpg, 2: dav
	 * \else
	 * 文件类型 1:jpg图片, 2: dav
	 * \endif
	 */
    public byte				byFileType;
    
	/**
	 * \if ENGLISH_LANG
	 * Drive no.
	 * \else
	 * 磁盘号,该字段已废弃,后续开发使用 nDriveNo成员
	 * \endif
	 */
    public byte                byDriveNo;
    
	/**
	 * \if ENGLISH_LANG
	 * Cluster
	 * \else
	 * 簇号
	 * \endif
	 */
    public int      			nCluster;
    
	/**
	 * \if ENGLISH_LANG
	 * Path of file
	 * \else
	 * 文件路径
	 * \endif
	 */
    public char					szFilePath[] = new char[FinalVar.MAX_PATH];
    
    
    // ----------------------------------------------
    
	/**
	 * \if ENGLISH_LANG
	 * zone no.
	 * \else
	 * 分区号
	 * \endif
	 */
    public byte                	byPartition;            
    
	/**
	 * \if ENGLISH_LANG
	 * video stream 0-unknown  1-main 2-sub 1 3-sub 4-sub 
	 * \else
	 * 视频码流 0-未知 1-主码流 2-辅码流1 3-辅码流 4-辅码流 
	 * \endif
	 */
    public byte                 byVideoStream;          
    
	/**
	 * \if ENGLISH_LANG
	 * Link event list,see event intelligent analysis event type
	 * \else
	 * 关联的事件列表,事件类型列表,参见智能分析事件类型
	 * \endif
	 */
    public int[]                nEventLists = new int[FinalVar.MAX_IVS_EVENT_NUM]; 
    
	/**
	 * \if ENGLISH_LANG
	 * event total
	 * \else
	 * 事件总数
	 * \endif
	 */
    public int                  nEventCount;           
    
	/**
	 * \if ENGLISH_LANG
	 * record or snapshot file mark, refer to {@link EM_RECORD_SNAP_FLAG_TYPE} 
	 * \else
	 * 录像或抓图文件标志 ,取值参考 {@link EM_RECORD_SNAP_FLAG_TYPE} 
	 * \endif
	 */
    public int[]                emFalgLists = new int[EM_RECORD_SNAP_FLAG_TYPE.FLAG_TYPE_MAX]; 
    
	/**
	 * \if ENGLISH_LANG
	 * mark total
	 * \else
	 * 标志总数
	 * \endif
	 */
    public int                  nFalgCount;            
    
	/**
	 * \if ENGLISH_LANG
	 * disk driver number
	 * \else
	 * 磁盘号
	 * \endif
	 */
    public int        			nDriveNo;               
    
    //***********频浓缩文件相关信息**********************//
	/**
	 * \if ENGLISH_LANG
	 * Snap file path when pre-process the file
	 * \else
	 * 预处理文件提取到的快照	文件路径,支持HTTP,支持FTP; 支持服务器本地路径 :a)"C:/pic/1.jpg", b)"/mnt//2010/8/11/dav/15:40:50.jpg"
	 * \endif
	 */
    public byte[]				szSynopsisPicPath = new byte[FinalVar.SDK_COMMON_STRING_512];            
    
	/**
	 * \if ENGLISH_LANG
	 * Video synopsis max time. Unit is second.
	 * \else
	 * 支持浓缩视频最大时间长度,单位 秒
	 * \endif
	 */
    public int                 	nSynopsisMaxTime;                      
    
	/**
	 * \if ENGLISH_LANG
	 * Video synopsis min time. Unit is second. 
	 * \else
	 * 支持浓缩视频最小时间长度,单位 秒
	 * \endif
	 */
    public int                 	nSynopsisMinTime;                      
   
    //*********************文件摘要信息*************************//
	/**
	 * \if ENGLISH_LANG
	 * file summary number
	 * \else
	 * 文件摘要信息数
	 * \endif
	 */
    public int                     nFileSummaryNum;                               
    
	/**
	 * \if ENGLISH_LANG
	 * file summary info   
	 * \else
	 * 文件摘要信息   
	 * \endif
	 */
    public NET_FILE_SUMMARY_INFO[] stFileSummaryInfo = new NET_FILE_SUMMARY_INFO[FinalVar.MAX_FILE_SUMMARY_NUM];

	/**
	 * \if ENGLISH_LANG
	 * file state,{@link EM_VIDEO_FILE_STATE}
	 * \else
	 * 录像文件的状态,{@link EM_VIDEO_FILE_STATE}
	 * \endif
	 */
	public int 				emFileState;

	/**
	 * \if ENGLISH_LANG
	 * Storage directory of video files
	 * \else
	 * 录像文件的存储目录
	 * \endif
	 */
	public byte[]				szWorkDir = new byte[256];

	public byte szThumbnail[]        = new byte[260];

    public NET_OUT_MEDIA_QUERY_FILE() {
    	for(int i = 0; i < FinalVar.MAX_FILE_SUMMARY_NUM; i++) {
    		stFileSummaryInfo[i] = new NET_FILE_SUMMARY_INFO(); 
    	}
    }
}

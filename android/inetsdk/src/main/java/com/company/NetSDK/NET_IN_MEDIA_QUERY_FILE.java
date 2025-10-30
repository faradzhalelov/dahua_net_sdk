package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * record info, corresponding to interface {@link INetSDK#FindFileEx}, corresponde to {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_FACE}, search condition. support paths search in curent
 * \else
 * 录像信, 对应接口{@link INetSDK#FindFileEx}, 对应查询参数 {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_FACE}. 目前支持通过路径查询
 * \endif
 */
public class NET_IN_MEDIA_QUERY_FILE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * start time
	 * \else
	 * 开始时间
	 * \endif
	 */
	public NET_TIME         stuStartTime = new NET_TIME();               
	
	/**
	 * \if ENGLISH_LANG
	 * end time
	 * \else
	 * 结束时间
	 * \endif
	 */
	public NET_TIME         stuEndTime = new NET_TIME();             
	
	/**
	 * \if ENGLISH_LANG
	 * working directory list,can inquire multiple directory at a atime,separated by ";",example "/mnt/dvr/sda0;/mnt/dvr/sda1",if szDirs==null or szDirs == "" ,means search all
	 * \else
	 * 工作目录列表,一次可查询多个目录,为空表示查询所有目录。目录之间以分号分隔，如“/mnt/dvr/sda0;/mnt/dvr/sda1”,szDirs==null 或"" 表示查询所有
	 * \endif
	 */
	public String           szDirs;                 
	
	/**
	 * \if ENGLISH_LANG
	 * file info,0:any type,1:search jpg image,2:search dav
	 * \else
	 * 文件类型，0:查询任意类型,1:查询jpg图片,2:查询dav
	 * \endif
	 */
	public int				nMediaType;		        
	
	/**
	 * \if ENGLISH_LANG
	 * user total
	 * \else
	 * 用户名有效个数
	 * \endif
	 */
	public int				nUserCount;				
	
	/**
	 * \if ENGLISH_LANG
	 * user name
	 * \else
	 * 用户名
	 * \endif
	 */
	public byte[][] 		szUserName =  new byte[FinalVar.MAX_QUERY_USER_NUM][FinalVar.SDK_NEW_USER_NAME_LENGTH]; 
	
	/**
	 * \if ENGLISH_LANG
	 * result order, refer to {@link EM_RESULT_ORDER_TYPE}
	 * \else
	 * 查询结果排序方式, 取值参考 {@link EM_RESULT_ORDER_TYPE}
	 * \endif
	 */
	public int 				emResultOrder; 		
	
	//--------------------------------
    /**
	 * \if ENGLISH_LANG
	 * Channel start from 0, -1 means search all channel
	 * \else
	 * 通道号从0开始,-1表示查询所有通道
	 * \endif
	 */
    public int                 nChannelID;   
    
    /**
	 * \if ENGLISH_LANG
	 * event total 
	 * \else
	 * 事件总数
	 * \endif
	 */
    public int                 nEventCount;            
    
    /**
	 * \if ENGLISH_LANG
	 * Event type list, see intelligent analysis event type
	 * \else
	 * 事件类型列表,参见智能分析事件类型
	 * \endif
	 */
    public int []              nEventLists = new int[FinalVar.MAX_IVS_EVENT_NUM]; 
	
    /**
	 * \if ENGLISH_LANG
	 * video stream 0-unknown  1-main 2-sub 1 3-sub 2 4- sub 3 
	 * \else
	 * 视频码流 0-未知 1-主码流 2-辅码流1 3-辅码流2 4-辅码流3 
	 * \endif
	 */
	public byte                byVideoStream;         
	
	/**
	 * \if ENGLISH_LANG
	 * Record or snapshot file mark, not set mark to search all files, refer to {@link EM_RECORD_SNAP_FLAG_TYPE}
	 * \else
	 * 录像或抓图文件标志, 不设置标志表示查询所有文件, 取值参考 {@link EM_RECORD_SNAP_FLAG_TYPE}
	 * \endif
	 */
    public int[]     		  emFalgLists = new int[EM_RECORD_SNAP_FLAG_TYPE.FLAG_TYPE_MAX]; 
    
    /**
	 * \if ENGLISH_LANG
	 * total mark
	 * \else
	 * 标志总数
	 * \endif
	 */
    public int                 nFalgCount;             
    
    /**
	 * \if ENGLISH_LANG
	 * card no. record info, emFalgLists including card no. video is valid
	 * \else
	 * 卡号录像信息, emFalgLists包含卡号录像时有效
	 * \endif
	 */
    public NET_RECORD_CARD_INFO stuCardInfo = new NET_RECORD_CARD_INFO();

	/**
	 * \if ENGLISH_LANG
	 * Event info(customization),Valid by SDK_FILE_QUERY_FILE_EX
	 * \else
	 * 事件信息,当查询为 SDK_FILE_QUERY_FILE_EX 类型时有效
	 * \endif
	 */
	public EVENT_INFO[]               stuEventInfo = new EVENT_INFO[16];

	/**
	 * \if ENGLISH_LANG
	 * stuEventInfo num
	 * \else
	 * stuEventInfo 个数
	 * \endif
	 */
	public int                  nEventInfoCount;

	public NET_IN_MEDIA_QUERY_FILE()
	{
		for (int i = 0; i < 16; ++i)
		{
			stuEventInfo[i] = new EVENT_INFO();
		}
	}
	
}

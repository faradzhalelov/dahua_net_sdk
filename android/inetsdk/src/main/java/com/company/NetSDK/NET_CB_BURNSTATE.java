package com.company.NetSDK;

import java.io.Serializable;

public class NET_CB_BURNSTATE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * info type
	 * \else
	 * 消息类型
	 * "UploadFileStart"：可以开始附件上传
	 * "InitBurnDevice":初始化刻录设备
	 * "Burning":刻录中
	 * "BurnExtraFileStop"：刻录停止
	 * "BurnFilePause":刻录暂停
	 * "SpaceFull":刻录空间满
	 * "BurnFileError":刻录出错    
	 * \endif
	 */
    public String         szState;                        
       
	/**
	 * \if ENGLISH_LANG
	 * current burning file name, use to "UploadFileStart" start upload attachment info
	 * \else
	 * 当前刻录附件文件名,用于"UploadFileStart"开始附件上传消息
	 * \endif
	 */
    public String        szFileName;                     
    
	/**
	 * \if ENGLISH_LANG
	 * total capacity, unit KB, use to "Burning", display capacity or calculate progress
	 * \else
	 * 总容量,单位KB,用于"Burning"刻录中,显示容量或计算进度
	 * \endif
	 */
    public int           dwTotalSpace;                   
    
	/**
	 * \if ENGLISH_LANG
	 * free capacity, unit KB, useto "Burning"
	 * \else
	 * 剩余容量,单位KB,用于"Burning"刻录中
	 * \endif
	 */
    public int           dwRemainSpace;                  
    
	/**
	 * \if ENGLISH_LANG
	 * burning device name, use for different burning devices
	 * \else
	 * 刻录设备名称,用于区分不同的刻录设备
	 * \endif
	 */
    public String        szDeviceName;                   
    
	/**
	 * \if ENGLISH_LANG
	 * Burning remaining time. Unit is second. -1=invalid 
	 * \else
	 * 刻录剩余时间, 单位秒, -1代表无效
	 * \endif
	 */
    public int           nRemainTime;                    
}

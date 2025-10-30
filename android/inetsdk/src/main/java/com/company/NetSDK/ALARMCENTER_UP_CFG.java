package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The setup of alarm upload
 * \else
 * 报警上传的配置
 * \endif
 */
public class ALARMCENTER_UP_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable upload
	 * \else
	 * 上传使能
	 * \endif
	 */
	public byte                byEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm center listening port 
	 * \else
	 * 报警中心侦听端口
	 * \endif
	 */
	public short                wHostPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm center IP
	 * \else
	 * 报警中心IP
	 * \endif
	 */
    public byte                sHostIPAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
    
    /**
     * \if ENGLISH_LANG
     * Enable scheduled upload.Use it to upload IP or domain name to the centre.
     * \else
     * 定时上传使能，可以用来向中心上传IP或域名等
     * \endif
     */
    public int                 nByTimeEn;
    
    /**
     * \if ENGLISH_LANG
     * Set upload date 
     * "Never = 0", "Everyday = 1", "Sunday = 2", 
     * "Monday = 3", Tuesday = 4", "Wednesday = 5",
     * "Thursday = 6", "Friday = 7", "Saturday = 8"
     * \else
     * 设置上传日期  
     * "Never = 0", "Everyday = 1", "Sunday = 2", 
     * "Monday = 3", Tuesday = 4", "Wednesday = 5",
     * "Thursday = 6", "Friday = 7", "Saturday = 8"
     * \endif
     */
    public int                 nUploadDay;
    
    /**
     * \if ENGLISH_LANG
     * Set upload time ,[0~23]o'clock
     * \else
     * 设置上传时间 ,[0~23]点
     * \endif
     */
    public int                 nUploadHour;
}

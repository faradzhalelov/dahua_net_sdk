package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * WEB path configuration
 * \else
 * WEB路径配置
 * \endif
 */
public class SDKDEV_URL_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Snap or not
	 * \else
	 * 是否抓图
	 * \endif
	 */
	public boolean                bSnapEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Snap interval
	 * \else
	 * 抓图周期
	 * \endif
	 */
	public int                 iSnapInterval;
	
	/**
	 * \if ENGLISH_LANG
	 * HTTP host IP
	 * \else
	 * HTTP主机IP
	 * \endif
	 */
	public byte                szHostIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Host port
	 * \else
	 * 主机port
	 * \endif
	 */
    public short                wHostPort;
    
    /**
	 * \if ENGLISH_LANG
	 * Status message send out interval
	 * \else
	 * 状态消息发送间隔
	 * \endif
	 */
    public int                 iMsgInterval;
    
    /**
	 * \if ENGLISH_LANG
	 * Message status upload URL
	 * \else
	 * 状态消息上传URL
	 * \endif
	 */
    public byte                szUrlState[] = new byte[FinalVar.SDK_MAX_URL_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Picture upload Url 
	 * \else
	 * 图片上传Url 
	 * \endif
	 */
    public byte                szUrlImage[] = new byte[FinalVar.SDK_MAX_URL_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Device web SN
	 * \else
	 * 机器的web编号
	 * \endif
	 */
    public byte                szDevId[] = new byte[FinalVar.SDK_MAX_DEV_ID_LEN];
}

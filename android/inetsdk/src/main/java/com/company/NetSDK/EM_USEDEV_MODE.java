package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio talk way
 * \else
 * 对讲方式
 * \endif
 */
public class EM_USEDEV_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Set client-end mode to begin audio talk 
	 * \else
	 * 设置客户端方式进行语音对讲
	 * \endif
	 */
	public static final int     SDK_TALK_CLIENT_MODE = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Set server mode to begin audio talk
	 * \else
	 * 设置服务器方式进行语音对讲
	 * \endif
	 */
	public static final int     SDK_TALK_SERVER_MODE = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Set encode format for audio talk, corresponding to {@link SDKDEV_TALKDECODE_INFO}
	 * \else
	 * 设置语音对讲编码格式,对应 {@link SDKDEV_TALKDECODE_INFO}
	 * \endif
	 */
	public static final int     SDK_TALK_ENCODE_TYPE = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Set alarm subscribe way 
	 * \else
	 * 设置报警订阅方式
	 * \endif
	 */
	public static final int     SDK_ALARM_LISTEN_MODE = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Set user right to realize configuration management
	 * \else
	 * 设置通过权限进行配置管理
	 * \endif
	 */
	public static final int     SDK_CONFIG_AUTHORITY_MODE = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Set talking channel(0~MaxChannel-1)
	 * \else
	 * 设置对讲通道(0~MaxChannel-1)
	 * \endif
	 */
	public static final int     SDK_TALK_TALK_CHANNEL = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Set the stream type of the record for query(0-both main and extra stream,1-only main stream,2-only extra stream)  
	 * \else
	 * 设置待查询及按时间回放的录像码流类型(0-主辅码流,1-主码流,2-辅码流) 
	 * \endif
	 */
	public static final int     SDK_RECORD_STREAM_TYPE = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * Set speaking parameter,corresponding to {@link NET_SPEAK_PARAM}
	 * \else
	 * 设置语音对讲喊话参数，对应结构体  {@link NET_SPEAK_PARAM}
	 * \endif
	 */
	public static final int     SDK_TALK_SPEAK_PARAM = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * Set by time video playback and download the video file TYPE (see {@link NET_RECORD_TYPE})
	 * \else
	 * 设置按时间录像回放及下载的录像文件类型(详见 {@link NET_RECORD_TYPE})
	 * \endif
	 */
    public static final int     SDK_RECORD_TYPE = 8; 
    
    /**
	 * \if ENGLISH_LANG
	 * Set voice intercom parameters of three generations of equipment and the corresponding structure {@link NET_TALK_EX}
	 * \else
	 * 设置三代设备的语音对讲参数, 对应结构体 {@link NET_TALK_EX}
	 * \endif
	 */
    public static final int     SDK_TALK_MODE3 = 9;
    
    /**
	 * \if ENGLISH_LANG
	 * set real time playback function(0-off，1-on)
	 * \else
	 * 设置实时回放功能(0-关闭，1开启)
	 * \endif
	 */
    public static final int     SDK_PLAYBACK_REALTIME_MODE = 10; 
    
    /**
	 * \if ENGLISH_LANG
	 * Judge the voice intercom if it was a forwarding mode, (corresponding to {@link NET_TALK_TRANSFER_PARAM})
	 * \else
	 * 设置语音对讲是否为转发模式, 对应结构体 {@link NET_TALK_TRANSFER_PARAM}
	 * \endif
	 */
    public static final int     SDK_TALK_TRANSFER_MODE = 11; 
}

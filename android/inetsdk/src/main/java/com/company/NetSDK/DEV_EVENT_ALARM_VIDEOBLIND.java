package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * @brief 报警事件类型 EVENT_ALARM_VIDEOBLIND(视频遮挡报警)
 * \endif
 */
public class DEV_EVENT_ALARM_VIDEOBLIND implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  通道号
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  事件名称
     * \endif
     */
    public byte					szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  时间戳(单位是毫秒)
     * \endif
     */
    public double					PTS;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  事件ID        
     * \endif
     */
    public int					nEventID;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  事件发生的时间, (设备时间, 不一定是utc时间)
     * \endif
     */
    public NET_TIME_EX					stuTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  司机ID
     * \endif
     */
    public byte					szDriverID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  GPS信息
     * \endif
     */
    public NET_GPS_STATUS_INFO					stuGPSStatus = new NET_GPS_STATUS_INFO();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  关联视频FTP上传路径
     * \endif
     */
    public byte					szVideoPath[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  图片信息扩展
     * \endif
     */
    public NET_IMAGE_INFO_EX					stuImageInfo[] = new NET_IMAGE_INFO_EX[6];

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  图片信息扩展的个数
     * \endif
     */
    public int					nImageInfo;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  图片信息数组    
     * \endif
     */
    public NET_IMAGE_INFO_EX2					stuImageInfoEx2[] = new NET_IMAGE_INFO_EX2[32];

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  图片信息个数
     * \endif
     */
    public int					nImageInfoEx2Num;

    public DEV_EVENT_ALARM_VIDEOBLIND() {
        for(int i = 0; i < 6; i ++){
            this.stuImageInfo[i] = new NET_IMAGE_INFO_EX();
        }
        for(int i = 0; i < 32; i ++){
            this.stuImageInfoEx2[i] = new NET_IMAGE_INFO_EX2();
        }
    }
}

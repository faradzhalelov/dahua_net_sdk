package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input parameter, the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_GET_CAMERA_STATE}
 * \else
 * 入参, 对应接口{@link INetSDK#QueryDevInfo},对应命令 {@link FinalVar#NET_QUERY_GET_CAMERA_STATE}
 * \endif
 */
public class NET_IN_GET_CAMERA_STATEINFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * if it is to check all the cameras status, if the member is TRUE, then nChannels member is unnecessary to set.
	 * \else
	 * 是否查询所有摄像机状态,若该成员为 TRUE,则 nChannels 成员无需设置
	 * \endif
	 */
    public boolean                bGetAllFlag;                               
    
    /**
     * \if ENGLISH_LANG
     * the member is valid when bGetAllFlag is FALSE, which means valid number of nChannels member
     * \else
     * 该成员,bGetAllFlag 为 FALSE时有效,表示 nChannels 成员有效个数
     * \endif
     */
    public int                 nValidNum;                                  
    
    /**
     * \if ENGLISH_LANG
     * The member is valid when bGetAllFlag is FALSE, it is to fill in the channel numbers in turn which needs inquiry. 
     * \else
     * 该成员,bGetAllFlag 为 FALSE时有效,将需要查询的通道号依次填入
     * \endif
     */
    public int                 nChannels[] = new int[FinalVar.SDK_MAX_CAMERA_CHANNEL_NUM];       
}

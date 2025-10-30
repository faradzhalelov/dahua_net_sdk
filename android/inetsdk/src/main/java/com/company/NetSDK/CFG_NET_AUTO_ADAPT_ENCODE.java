package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * net auto adapt encode, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_NETAUTOADAPTORENCODE}
 * \else
 * 网络自适应编码配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_NETAUTOADAPTORENCODE}
 * \endif
 */
public class CFG_NET_AUTO_ADAPT_ENCODE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * main stream，0-General record,1-Motion detect,2-alarm record,only support General record
	 * \else
	 * 主码流，0－普通录像，1-动检录像，2－报警录像,暂只支持普通录像
	 * \endif
	 */
    public CFG_ADAPT_ENCODE_INFO[]    stuMainStream = new CFG_ADAPT_ENCODE_INFO[FinalVar.MAX_VIDEOSTREAM_NUM];	 
    
    /**
     * \if ENGLISH_LANG
     * Extra stream,0-Extra stream 1,1-Extra stream 2,2-Extra stream 
     * \else
     * 辅码流，0－辅码流1，1－辅码流2，2－辅码流3
     * \endif
     */
    public CFG_ADAPT_ENCODE_INFO[]	  stuExtraStream = new CFG_ADAPT_ENCODE_INFO[FinalVar.MAX_VIDEOSTREAM_NUM];    

	public CFG_NET_AUTO_ADAPT_ENCODE() {
		for (int i = 0; i < stuMainStream.length; i++) {
			stuExtraStream[i] = new CFG_ADAPT_ENCODE_INFO();
			stuMainStream[i] = new CFG_ADAPT_ENCODE_INFO();
		}
	}
}

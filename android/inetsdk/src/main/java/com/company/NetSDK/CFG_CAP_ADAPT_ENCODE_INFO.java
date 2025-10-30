package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get encode adapt caps, the corresponding interface {@link INetSDK#QueryNewSystemInfo},the corresponding command {@link FinalVar#CFG_CAP_CMD_ADAPTENCODE}
 * \else
 * 获取编码自适应能力, 对应接口{@link INetSDK#QueryNewSystemInfo},对应命令 {@link FinalVar#CFG_CAP_CMD_ADAPTENCODE}
 * \endif
 */
public class CFG_CAP_ADAPT_ENCODE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Main stream,0-General record,1-Motion detect,2-alarm record
	 * \else
	 * 主码流，0－普通录像，1-动检录像，2－报警录像
	 * \endif
	 */
    public CFG_CAP_ADAPT_ENCODE[]    stuMainStream = new CFG_CAP_ADAPT_ENCODE[FinalVar.MAX_VIDEOSTREAM_NUM];	    
    
	/**
	 * \if ENGLISH_LANG
	 * Extra stream,0-Extra stream 1,1-Extra stream 2,2-Extra stream 
	 * \else
	 * 辅码流，0－辅码流1，1－辅码流2，2－辅码流3
	 * \endif
	 */
    public CFG_CAP_ADAPT_ENCODE[]	 stuExtraStream = new CFG_CAP_ADAPT_ENCODE[FinalVar.MAX_VIDEOSTREAM_NUM];    

    public CFG_CAP_ADAPT_ENCODE_INFO() {
    	for (int i = 0; i < stuMainStream.length; i++) {
			stuExtraStream[i] = new CFG_CAP_ADAPT_ENCODE();
			stuMainStream[i] = new CFG_CAP_ADAPT_ENCODE();
		}
	}
}

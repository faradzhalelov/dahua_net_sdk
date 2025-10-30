package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* encode config
* \else
* 编码配置
* \endif
*/
public class CFG_ADAPT_ENCODE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * 1~100,1:smooth,100:quality priority 
	 * \else
	 * 编码I/P帧的平滑度，范围1~100,1表示平滑，100表示画质优先
	 * \endif
	 */
    public int	nIPSmoothness; 
    
	 /**
	 * \if ENGLISH_LANG
	 * enable auto adapt,only support extra stream
	 * \else
	 * 自适应调整使能,1开启 0关闭。主码流暂不支持此字段
	 * \endif
	 */
    public int	nAdjustEnable; 
}

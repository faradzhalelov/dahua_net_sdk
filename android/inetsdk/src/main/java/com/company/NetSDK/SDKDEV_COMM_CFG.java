package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The number of protocol decoder
 * \else
 * 串口配置结构体
 * \endif
 */
public class SDKDEV_COMM_CFG implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Serial port configuration structure
	 * \else
	 * 解码器协议个数
	 * \endif
	 */
	public int               dwDecProListNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Protocol name list
	 * \else
	 * 协议名列表
	 * \endif
	 */
	public byte                DecProName[][] = new byte[FinalVar.SDK_MAX_DECPRO_LIST_SIZE][FinalVar.SDK_MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * The current attributes of the respective decoders
	 * \else
	 * 各解码器当前属性
	 * \endif
	 */
	public SDK_485_CFG          stDecoder[] = new SDK_485_CFG[FinalVar.SDK_MAX_DECODER_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * 232 function of the number
	 * \else
	 * 232功能个数
	 * \endif
	 */
    public int               dw232FuncNameNum;
    
    /**
	 * \if ENGLISH_LANG
	 * Function name list
	 * \else
	 * 功能名列表
	 * \endif
	 */
    public byte                s232FuncName[][] = new byte[FinalVar.SDK_MAX_232FUNCS][FinalVar.SDK_MAX_NAME_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * 232 serial port each current properties
	 * \else
	 * 各232串口当前属性
	 * \endif
	 */
    public SDK_RS232_CFG        st232[] = new SDK_RS232_CFG[FinalVar.SDK_MAX_232_NUM];                                  // 各232串口当前属性
    
    public SDKDEV_COMM_CFG() {
    	for (int i = 0; i < FinalVar.SDK_MAX_DECODER_NUM; i++) {
    		stDecoder[i] = new SDK_485_CFG();
    	}
    	
    	for (int i = 0; i < FinalVar.SDK_MAX_232_NUM; i++) {
    		st232[i] = new SDK_RS232_CFG();
    	}
    }
}

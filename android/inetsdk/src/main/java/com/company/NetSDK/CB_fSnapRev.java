package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Snapshot callback function original shape 
 * \else
 * 抓图回调
 * \endif
 */
public interface CB_fSnapRev {
	/**
	 * \if ENGLISH_LANG
	 * Snapshot callback function original shape 
	 * @param lLoginID login handle,{@link INetSDK#LoginEx}or{@link INetSDK#Login}
	 * @param pBuf data pointer 
	 * @param RevLen data length(unit byte)
	 * @param EncodeType image encode type：0：mpeg4 I frame 
	 * @param CmdSerial operation NO.，not used in Synchronous capture conditions 
	 * \else
	 * 抓图回调
	 * @param lLoginID 登录句柄，{@link INetSDK#LoginEx}or{@link INetSDK#Login}
	 * @param pBuf 数据指针 
	 * @param RevLen 数据长度(单位字节)
	 * @param EncodeType 图片编码类型：0：mpeg4 I帧 
	 * @param CmdSerial 操作流水号，同步抓图的情况下用不上 
	 * \endif
	 */
	public void invoke(long lLoginID, byte pBuf[], int RevLen, int EncodeType, int CmdSerial);
}

package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Real-time monitor data callback function original shape
 * \else
 * 实时预览数据回调
 * \endif
 */
public interface CB_fRealDataCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Real-time monitor data callback function original shape
	 * @param lRealHandle handle, return from {@link INetSDK#RealPlay}
	 * @param dwDataType label recalled data type，onceset recall，The following 4 kinds of data are also callback, users may need to have the option of processing data 
	 * <table>
	 * <tr><td>dwDataType</td><td>pBuffer data type </td></tr>
	 * <tr><td>0</td><td>original data(identical with SaveRealData saved data)</td></tr>
	 * <tr><td>1</td><td>frame data</td></tr>
	 * <tr><td>2</td><td>frame data </td></tr>
	 * <tr><td>3</td><td>pcm audio data</td></tr>
	 * </table>
	 * @param pBuffer recal data，According to the data of different types each callback different length data, in addition to type 0, other data types are in the frame, each callback data of a frame 
	 * @param dwBufSize recall data length(unit byte)
	 * \else
	 * 实时预览数据回调函数
	 * @param lRealHandle 登录句柄, {@link INetSDK#RealPlay}的返回值
	 * @param dwDataType 回调出来的数据类型
	 * <table>
	 * <tr><td>dwDataType</td><td>pBuffer数据类型 </td></tr>
	 * <tr><td>0</td><td>原始数据(与SaveRealData保存的数据一致) </td></tr>
	 * <tr><td>1</td><td>帧数据 </td></tr>
	 * <tr><td>2</td><td>yuv数据 </td></tr>
	 * <tr><td>3</td><td>pcm音频数据 </td></tr>
	 * </table>
	 * @param pBuffer 回调数据，根据数据类型的不同每次回调不同的长度的数据，除类型0，其他数据类型都是按帧，每次回调一帧数据 
	 * @param dwBufSize 回调数据的长度(单位字节) 
	 * \endif
	 */
	public void invoke(long lRealHandle, int dwDataType, byte[] pBuffer, int dwBufSize);
}

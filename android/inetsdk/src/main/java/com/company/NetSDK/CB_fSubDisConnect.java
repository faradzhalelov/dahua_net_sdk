package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * The prototype of dynamic sub connection offline call function 
 * \else
 * 动态子连接断开回调函数原形
 * \endif
 */
public interface CB_fSubDisConnect {
	/**
	 * \if ENGLISH_LANG
	 * The prototype of dynamic sub connection offline call function 
	 * @param emInterfaceType interrace type
	 * <table>
	 * <tr><td>enumeration value</td><td>meaning</td></tr>
	 * <tr><td>SDK_INTERFACE_OTHER</td><td>unknown interface</td></tr>
	 * <tr><td>SDK_INTERFACE_REALPLAY</td><td>real time monitoring interface</td></tr>
	 * <tr><td>SDK_INTERFACE_PREVIEW</td><td>multi-image preview interface</td></tr>
	 * <tr><td>SDK_INTERFACE_PLAYBACK</td><td>playback interface</td></tr>
	 * <tr><td>SDK_INTERFACE_DOWNLOAD</td><td>download interface</td></tr>
	 * <tr><td>SDK_INTERFACE_REALLOADPIC</td><td>download intelligent image interface</td></tr>
	 * </table>
	 * @param bOnline Online or not 
	 * @param lOperateHandle interface returned operation handle,{@link INetSDK#RealPlay}
	 * @param lLoginID login handle, return from{@link INetSDK#LoginEx}or{@link INetSDK#Login}
	 * \else
	 * 动态子连接断开回调函数原形
	 * @param emInterfaceType 接口类型
	 * <table>
	 * <tr><td>枚举值 </td><td>含义 </td></tr>
	 * <tr><td>SDK_INTERFACE_OTHER</td><td>未知接口 </td></tr>
	 * <tr><td>SDK_INTERFACE_REALPLAY</td><td>实时预览接口 </td></tr>
	 * <tr><td>SDK_INTERFACE_PREVIEW</td><td>多画面预览接口 </td></tr>
	 * <tr><td>SDK_INTERFACE_PLAYBACK</td><td>回放接口 </td></tr>
	 * <tr><td>SDK_INTERFACE_DOWNLOAD</td><td>下载接口 </td></tr>
	 * <tr><td>SDK_INTERFACE_REALLOADPIC</td><td>下载智能图片接口 </td></tr>
	 * </table>
	 * @param bOnline 是否在线 
	 * @param lOperateHandle 接口返回的操作句柄,{@link INetSDK#RealPlay}
	 * @param lLoginID 登陆句柄, {@link INetSDK#LoginEx}or{@link INetSDK#Login}返回值
	 * \endif
	 */
	public void invoke(int emInterfaceType, boolean bOnline, long lOperateHandle, long lLoginID);
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Request monitoring or playback's return information, the corresponding command {@link FinalVar#SDK_REALPLAY_FAILD_EVENT}
 * \else
 * 请求预览或回放错误的返回信息, 对应命令 {@link FinalVar#SDK_REALPLAY_FAILD_EVENT}
 * \endif
 */
public class DEV_PLAY_RESULT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Result Code:
	 * <table>
	 * <tr><td>1</td><td>Without permission</td></tr>
	 * <tr><td>2</td><td>This operation is not supported</td></tr>
	 * <tr><td>3</td><td>No enough Resource</td></tr>
	 * <tr><td>4</td><td>Device can't obtain the requested data</td></tr>
	 * <tr><td>11</td><td>Senior user take over junior user's resource</td></tr>
	 * <tr><td>12</td><td>Prohibit access</td></tr>
	 * </table>
	 * \else
	 * 错误返回码:
	 * <table>
	 * <tr><td>1</td><td>无权限</td></tr>
	 * <tr><td>2</td><td>设备不支持此操作</td></tr>
	 * <tr><td>3</td><td>资源不足</td></tr>
	 * <tr><td>4</td><td>设备无法获取当前请求数据</td></tr>
	 * <tr><td>11</td><td>表示高级用户抢占低级用户资源</td></tr>
	 * <tr><td>12</td><td>禁止入网</td></tr>
	 * </table>
	 * \endif
	 */
	public int               dwResultCode;
	
	/**
	 * \if ENGLISH_LANG
	 * Handle value returned from Monitoring or playback monitor or playback handle
	 * \else
	 * 预览或回放接口返回的句柄值
	 * \endif
	 */
	public long              lPlayHandle;
}

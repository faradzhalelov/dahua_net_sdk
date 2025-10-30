package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * devices info type, corresponding to interface {@link INetSDK#StartFind} {@link INetSDK#DoFind} {@link INetSDK#StopFind}
 * \else
 * 设备信息类型,对应 {@link INetSDK#StartFind} {@link INetSDK#DoFind} {@link INetSDK#StopFind} 接口
 * \endif
 */
public class NET_FIND implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * thermal temperature query
	 * \else
	 * 热成像温度查询
	 * \endif 
	 * <table> 
	 * <tr><td>NET_IN_RADIOMETRY_STARTFIND / NET_OUT_RADIOMETRY_STARTFIND</td></tr>
	 * <tr><td>NET_IN_RADIOMETRY_DOFIND / NET_OUT_RADIOMETRY_DOFIND</td></tr>
	 * <tr><td>NET_IN_RADIOMETRY_STOPFIND / NET_OUT_RADIOMETRY_STOPFIND</td></tr>
	 * </table>
	 */
	public static final int NET_FIND_RADIOMETRY   = 0;
}

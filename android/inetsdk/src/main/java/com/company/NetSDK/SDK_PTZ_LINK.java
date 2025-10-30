package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ activation
 * \else
 * 云台联动
 * \endif
 */
public class SDK_PTZ_LINK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Type
	 * <table>
	 * <tr><td>iType</td><td>Type</td></tr>
	 * <tr><td>1</td><td>Preset point</td></tr>
	 * <tr><td>2</td><td>Point between cruise</td></tr>
	 * <tr><td>3</td><td>Mode</td></tr>
	 * </table>
	 * \else
	 * 类型
	 * <table>
	 * <tr><td>iType</td><td>类型</td></tr>
	 * <tr><td>1</td><td>预置点</td></tr>
	 * <tr><td>2</td><td>点间巡航</td></tr>
	 * <tr><td>3</td><td>模式</td></tr>
	 * </table>
	 * \endif
	 */
	public int                 iType;
	
	/**
	 * \if ENGLISH_LANG
	 * Value
	 * \else
	 * 值
	 * \endif
	 */
	public int                 iValue;
}

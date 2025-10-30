package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Returned Information for Modify device configuration, the corresponding command {@link FinalVar#SDK_CONFIG_RESULT_EVENT_EX}
 * \else
 * 修改设备配置返回信息, 对应命令 {@link FinalVar#SDK_CONFIG_RESULT_EVENT_EX}
 * \endif
 */
public class DEV_SET_RESULT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Type({@link INetSDK#GetDevConfig}and {@link INetSDK#SetDevConfig} type)
	 * \else
	 * 类型(即{@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig}的类型)
	 * \endif
	 */
	public int               dwType;
	
	/**
	 * \if ENGLISH_LANG
	 * Result code:
	 * <table>
	 * <tr><td>0</td><td>Success</td></tr>
	 * <tr><td>1</td><td>Failure</td></tr>
	 * <tr><td>2</td><td>Data Illegal</td></tr>
	 * <tr><td>3</td><td>Temporarily unable to set</td></tr>
	 * <tr><td>4</td><td>Without Permission</td></tr>
	 * </table>
	 * \else
	 * 返回码:
	 * <table>
	 * <tr><td>0</td><td>成功</td></tr>
	 * <tr><td>1</td><td>失败</td></tr>
	 * <tr><td>2</td><td>数据不合法</td></tr>
	 * <tr><td>3</td><td>暂时无法设置</td></tr>
	 * <tr><td>4</td><td>没有权限</td></tr>
	 * </table>
	 * \endif
	 */
	public int                wResultCode;
	
	/**
	 * \if ENGLISH_LANG
	 * Reboot Sign
	 * <table>
	 * <tr><td>0</td><td>No need to reboot</td></tr>
	 * <tr><td>1</td><td>Effective after reboot</td></tr>
	 * </table>
	 * \else
	 * 重启标志
	 * <table>
	 * <tr><td>0</td><td>不需要重启</td></tr>
	 * <tr><td>1</td><td>需要重启才生效</td></tr>
	 * </table>
	 * \endif
	 */
	public int                wRebootSign;
}

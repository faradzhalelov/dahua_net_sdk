package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * COMM Properties
 * \else
 * 串口基本属性
 * \endif
 */
public class SDK_COMM_PROP implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * DataBit：
	 * <table>
	 * <tr><td>0</td><td>5</td></tr>
	 * <tr><td>1</td><td>6</td></tr>
	 * <tr><td>2</td><td>7</td></tr>
	 * <tr><td>3</td><td>8</td></tr>
	 * </table>
	 * \else
	 * 数据位：
	 * <table>
	 * <tr><td>0</td><td>5</td></tr>
	 * <tr><td>1</td><td>6</td></tr>
	 * <tr><td>2</td><td>7</td></tr>
	 * <tr><td>3</td><td>8</td></tr> 
	 * </table>
	 * \endif
	 */
	public byte                byDataBit;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop Bit：
	 * <table>
	 * <tr><td>0</td><td>1Bit</td></tr>
	 * <tr><td>1</td><td>1.5Bits</td></tr>
	 * <tr><td>2</td><td>2Bits</td></tr>
	 * </table>
	 * \else
	 * 停止位：
	 * <table>
	 * <tr><td>0</td><td>1位</td></tr>
	 * <tr><td>1</td><td>1.5位</td></tr>
	 * <tr><td>2</td><td>2位</td></tr>
	 * </table>
	 * \endif
	 */
	public byte                byStopBit;
	
	/**
	 * \if ENGLISH_LANG
	 * Check Bit：
	 * <table>
	 * <tr><td>0</td><td>None</td></tr>
	 * <tr><td>1</td><td>Odd</td></tr>
	 * <tr><td>2</td><td>Even</td></tr>
	 * <tr><td>3</td><td>Sign Check</td></tr>
	 * <tr><td>4</td><td>Empty check</td></tr>
	 * </table>
	 * \else
	 * 校验位：
	 * <table>
	 * <tr><td>0</td><td>无校验</td></tr>
	 * <tr><td>1</td><td>奇校验</td></tr>
	 * <tr><td>2</td><td>偶校验</td></tr>
	 * <tr><td>3</td><td>标志校验</td></tr>
	 * <tr><td>4</td><td>空校验</td></tr>
	 * </table>
	 * \endif
	 */
	public byte                byParity;
	
	/**
	 * \if ENGLISH_LANG
	 * BaudRate：
	 * <table>
	 * <tr><td>0</td><td>300</td></tr>
	 * <tr><td>1</td><td>600</td></tr>
	 * <tr><td>2</td><td>1200</td></tr>
	 * <tr><td>3</td><td>2400</td></tr>
	 * <tr><td>4</td><td>4800</td></tr>
	 * <tr><td>5</td><td>9600</td></tr>
	 * <tr><td>6</td><td>19200</td></tr>
	 * <tr><td>7</td><td>38400</td></tr>
	 * <tr><td>8</td><td>57600</td></tr>
	 * <tr><td>9</td><td>115200</td></tr>
	 * </table>
	 * \else
	 * 波特率：
	 * <table>
	 * <tr><td>0</td><td>300</td></tr>
	 * <tr><td>1</td><td>600</td></tr>
	 * <tr><td>2</td><td>1200</td></tr>
	 * <tr><td>3</td><td>2400</td></tr>
	 * <tr><td>4</td><td>4800</td></tr>
	 * <tr><td>5</td><td>9600</td></tr>
	 * <tr><td>6</td><td>19200</td></tr>
	 * <tr><td>7</td><td>38400</td></tr>
	 * <tr><td>8</td><td>57600</td></tr>
	 * <tr><td>9</td><td>115200</td></tr>
	 * </table>
	 * \endif
	 */
	public byte                byBaudRate;
}

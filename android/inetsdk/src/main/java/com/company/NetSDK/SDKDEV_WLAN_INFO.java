package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Config wireless network info
 * \else
 * 配置无线网络信息
 * \endif
 */
public class SDKDEV_WLAN_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Wireless enable
	 * \else
	 * 无线使能
	 * \endif
	 */
	public int                 nEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * SSID
	 * \else
	 * SSID
	 * \endif
	 */
	public byte                szSSID[] = new byte[36];
	
	/**
	 * \if ENGLISH_LANG
	 * Connection mode；0：auto,1：adhoc,2：Infrastructure
	 * \else
	 * 连接模式；0：auto，1：adhoc，2：Infrastructure
	 * \endif
	 */
	public int                 nLinkMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Encryption mode
	 * <table>
	 * <tr><td>0</td><td>off</td></tr>
	 * <tr><td>2</td><td>WEP64bit</td></tr>
	 * <tr><td>3</td><td>WEP128bit</td></tr>
	 * <tr><td>4</td><td>WPA-PSK-TKIP</td></tr>
	 * <tr><td>5</td><td>WPA-PSK-CCMP</td></tr>
	 * </table>
	 * \else
	 * 加密方式
	 * <table>
	 * <tr><td>0</td><td>off</td></tr>
	 * <tr><td>2</td><td>WEP64bit</td></tr>
	 * <tr><td>3</td><td>WEP128bit</td></tr>
	 * <tr><td>4</td><td>WPA-PSK-TKIP</td></tr>
	 * <tr><td>5</td><td>WPA-PSK-CCMP</td></tr>
	 * </table> 
	 * \endif
	 */
	public int                 nEncryption;
	
	/**
	 * \if ENGLISH_LANG
	 * 0：Hex,1：ASCII
	 * \else
	 * 0：Hex，1：ASCII
	 * \endif
	 */
	public int                 nKeyType;
	
	/**
	 * \if ENGLISH_LANG
	 * SN
	 * \else
	 * 序号
	 * \endif
	 */
	public int                 nKeyID;
	
	/**
	 * \if ENGLISH_LANG
	 * 4 passwords
	 * \else
	 * 四组密码
	 * \endif
	 */
	public byte            szKeys[][] = new byte[4][32];
	
	/**
	 * \if ENGLISH_LANG
	 * When nEncryption is 4 or 5, send 128 length and no end symbol. 
	 * \else
	 * nEncryption为4、5时使用，传128长度，不用结束符。
	 * \endif
	 */
	public byte            szWPAKeys[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * Encryption type
	 * \else
	 * 加密类型
	 * \endif
	 */
    public int                 nKeyFlag;
    
    /**
	 * \if ENGLISH_LANG
	 * 0: no connection, 1:connected
	 * \else
	 * 0: 无连接, 1: 连接
	 * \endif
	 */
    public byte                byConnectedFlag; 
}

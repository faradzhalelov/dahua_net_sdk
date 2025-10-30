package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * atm: query overlay ability information
 * \else
 * atm:查询叠加相关能力信息
 * \endif
 */
public class SDKDEV_ATM_OVERLAY_GENERAL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * 1:Network, 2:Comm, 3:Network&Comm
	 * \else
	 * 按位, 位0:Net(网络), 位1:Com(串口), 位2:Com422(串口422)
	 * \endif
	 */
	public int               dwDataSource;
	
	/**
	 * \if ENGLISH_LANG
	 * protocol name
	 * \else
	 * 协议名字,最大长度32(保留一个结束符).
	 * \endif
	 */
	public byte                szProtocol[][] = new byte[32][33];
}

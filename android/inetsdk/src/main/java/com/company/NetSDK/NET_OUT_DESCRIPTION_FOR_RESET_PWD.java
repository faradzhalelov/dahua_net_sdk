package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get description reset and pwd output param
 * \else
 * 获取重置密码信息输出结构体
 * \endif
 */

public class NET_OUT_DESCRIPTION_FOR_RESET_PWD implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * cellphone
	 * \else
	 * 预留手机号
	 * \endif
	 */
	public byte[]					szCellPhone = new byte[FinalVar.MAX_CELL_PHONE_NUMBER_LEN];

	/**
	 * \if ENGLISH_LANG
	 * mail
	 * \else
	 * 预留邮箱
	 * \endif
	 */
	public byte[]					szMailAddr = new byte[FinalVar.MAX_MAIL_LEN];

	/**
	 * \if ENGLISH_LANG
	 * QR code
	 * \else
	 * 二维码信息,用户分配内存（当前二维码信息300~400Byte）：信息已加密，NetSKD不需要进行解密
	 * \endif
	 */
	public byte[]					pQrCode;

	/**
	 * \if ENGLISH_LANG
	 * QR code info length
	 * \else
	 * 用户分配的二维码信息长度（包括'\0'）
	 * \endif
	 */
	public int					  nQrCodeLen;

	/**
	 * \if ENGLISH_LANG
	 * QR code len device returns
	 * \else
	 * 设备返回的二维码信息长度
	 * \endif
	 */
	public int    				  nQrCodeLenRet;

	public NET_OUT_DESCRIPTION_FOR_RESET_PWD(int nQrCodeLen) {
		this.nQrCodeLen = nQrCodeLen;

		if(nQrCodeLen > 0) {
			pQrCode = new byte[nQrCodeLen];
		}
	}
}

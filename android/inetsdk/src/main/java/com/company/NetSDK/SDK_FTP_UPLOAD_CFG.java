package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * FTP Upload Configuration
 * \else
 * FTP上传配置
 * \endif
 */
public class SDK_FTP_UPLOAD_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public SDK_FTP_UPLOAD_CFG_INNER struPeriod[] = new SDK_FTP_UPLOAD_CFG_INNER[FinalVar.SDK_TIME_SECTION];
	
	public SDK_FTP_UPLOAD_CFG() {
		for (int i = 0; i < FinalVar.SDK_TIME_SECTION; i++) {
			struPeriod[i] = new SDK_FTP_UPLOAD_CFG_INNER();
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;


public class SDKDEV_SNIFFER_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public SDK_ATM_SNIFFER_CFG  SnifferConfig[] = new SDK_ATM_SNIFFER_CFG[4];
	
	public SDKDEV_SNIFFER_CFG() {
		for (int i = 0; i < 4; i ++ ) {
			SnifferConfig[i] = new SDK_ATM_SNIFFER_CFG();
		}
	}
}

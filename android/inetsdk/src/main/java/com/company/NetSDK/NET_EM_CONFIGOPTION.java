package com.company.NetSDK;

import java.io.Serializable;

public class NET_EM_CONFIGOPTION implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int NET_EM_CONFIGOPTION_OK = 0;
	public static final int NET_EM_CONFIGOPTION_NEEDRESTART = 1;
	public static final int NET_EM_CONFIGOPTION_NEEDREBOOT = 2;
	public static final int NET_EM_CONFIGOPTION_WRITEFILEERROR = 4;
	public static final int NET_EM_CONFIGOPTION_CAPSNOTSUPPORT = 8;
	public static final int NET_EM_CONFIGOPTION_VALIDATEFAILED = 16;
}

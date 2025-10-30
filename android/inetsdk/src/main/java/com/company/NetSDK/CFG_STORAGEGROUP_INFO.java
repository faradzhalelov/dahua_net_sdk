package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Storage Position Group Information, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_STORAGEDEVGROUP}
 * \else
 * 存储组信息, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_STORAGEDEVGROUP}
 * \endif
 */
public class CFG_STORAGEGROUP_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Storage Pool Name 
	 * \else
	 * 存储组名称
	 * \endif
	 */
	public byte[]				szGroupName = new byte[FinalVar.MAX_STORAGEGROUPNAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Disks Buffer 
	 * \else
	 * 物理磁盘序号缓冲区
	 * \endif
	 */
	public int					nBufSize;
	
 	/**
	 * \if ENGLISH_LANG
	 * Buffer Length 
	 * \else
	 * 缓冲区byDisks的长度
	 * \endif
	 */
	public byte[]				byDisks;
	
 	/**
	 * \if ENGLISH_LANG
	 * Disk Number 
	 * \else
	 * 存储组中的磁盘数
	 * \endif
	 */
	public int					nDiskNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Storage Group INdex (1~Maximum Number of Disks) 
	 * \else
	 * 存储组序号(1~最大硬盘数)
	 * \endif
	 */
	public int					nGoupIndex;
	
	public CFG_STORAGEGROUP_INFO(int nBufSize) {
		this.nBufSize = nBufSize;
		this.byDisks = new byte[nBufSize];
	}
}

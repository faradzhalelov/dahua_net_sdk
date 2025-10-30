package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * storage point info
 * \else
 * 存储点配置信息
 * \endif
 */
public class CFG_STORAGEPOINT_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * storage point type, refer to {@link EM_STORAGEPOINT_TYPE}
	 * \else
	 * 存储点类型 ,对应 {@link EM_STORAGEPOINT_TYPE}
	 * \endif
	 */
	public int emStoragePointType;
	
	/**
	 * \if ENGLISH_LANG
	 * local work directory name, vacancy means does not login the local-end. 
	 * \else
	 * 本地工作目录名称，空表示不录到本地
	 * \endif
	 */
	public byte  nLocalDir;
	
	/**
	 * \if ENGLISH_LANG
	 * real compress directory, vacancy means do not use real-time compression. 
	 * \else
	 * 实时压缩存储目录组，空表示不使用实时压缩存储
	 * \endif
	 */
	public byte[] szCompressDir = new byte[FinalVar.MAX_DIRECTORY_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * redundant work directory name, vacancy means there is no redundancy record.  
	 * \else
	 * 冗余工作目录组名称，空表示没有冗余录像
	 * \endif
	 */
	public byte[] szRedundantDir = new byte[FinalVar.MAX_DIRECTORY_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * remote work directory name, vacancy means  do not login the remote path. 
	 * \else
	 * 远程工作目录组名称，空表示不录到远程。
	 * \endif
	 */
	public byte[] szRemoteDir = new byte[FinalVar.MAX_DIRECTORY_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * After remote storage net failure resumed, automatically synchronize local data to remote storage or not 
	 * \else
	 * 远程存储网络故障恢复后，是否自动将本地存储的数据同步到远程存储。
	 * \endif
	 */
	public boolean  bAutoSync;
	
	/**
	 * \if ENGLISH_LANG
	 * Starting when net resumed,  it is the data synchronization period forward. 0 represents synchronize all data
	 * \else
	 * 从网络恢复的时刻开始，需要往前同步的数据事件范围，小时为单位，0表示同步所有数据。
	 * \endif
	 */
	public int nAutoSyncRange;
	
	/**
	 * \if ENGLISH_LANG
	 * When remote directory cannot be accessed, save to local directory or not  
	 * \else
	 * 远程目录无法访问时，是否保存到本地目录。
	 * \endif
	 */
	public boolean bLocalEmergency;
	
	/**
	 * \if ENGLISH_LANG
	 * Set to compress file before which date. 
	 * \else
	 * 设置将多少天之前的录像文件进行压缩。
	 * \endif
	 */
	public int nCompressBefore;
}

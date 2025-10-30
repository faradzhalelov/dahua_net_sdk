package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Storage position set structure.  Each channel set separately.Each channel can set several storage types including local,portableand remote storage.
 * \else
 * 存储位置设置结构体，每通道独立设置,每通道可以选择各种存储类型, 目前包括本地, 可移动, 远程存储.
 * \endif
 */
public class SDK_STORAGE_STATION_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Local storage mask. Use bit to represent.
	 * The first bit:system pre-record. The second bit:scheduled record. The third bit:motion detection record.
	 * The fourth bit:alarm record. The fifth bit:card record. The sixth bit:manual record.
	 * \else
	 * 本地存储掩码；按位表示：
	 * 第一位：系统预录，第二位：定时录像，第三位：动检录像，
	 * 第四位：报警录像，第五位：卡号录像，第六位：手动录像
	 * \endif
	 */
	public int               dwLocalMask;

	/**
	 * \if ENGLISH_LANG
	 * Moving storage mask. Storage mask such as local storage mask.
	 * \else
	 * 可移动存储掩码 存储掩码如本地存储掩码
	 * \endif
	 */
	public int               dwMobileMask;

	/**
	 * \if ENGLISH_LANG
	 * Remote storage type 0: Ftp  1: Smb
	 * \else
	 * 远程存储类型 0: Ftp  1: Smb
	 * \endif
	 */
	public int                 RemoteType;

	/**
	 * \if ENGLISH_LANG
	 * Remote storage mask.  Storage mask such as local storage mask.
	 * \else
	 * 远程存储掩码 存储掩码如本地存储掩码
	 * \endif
	 */
	public int               dwRemoteMask;

	/**
	 * \if ENGLISH_LANG
	 * Local storage mask when remote is abnormal
	 * \else
	 * 远程异常时本地存储掩码
	 * \endif
	 */
	public int               dwRemoteSecondSelLocal;

	/**
	 * \if ENGLISH_LANG
	 * Moving storage mask when remote is abnormal.
	 * \else
	 * 远程异常时可移动存储掩码
	 * \endif
	 */
	public int               dwRemoteSecondSelMobile;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote path. Its length is 240
	 * \else
	 * 远程目录, 其中长度为240
	 * \endif
	 */
	public byte                SubRemotePath[] = new byte[FinalVar.MAX_PATH_STOR];

	/**
	 * \if ENGLISH_LANG
	 * Function shield bit. Use bit to represent bit0 = 1:Shield sanpshot event activate storage position function.
	 * \else
	 * 功能屏蔽位，按位表示，bit0 = 1:屏蔽抓图事件触发存储位置功能
	 * \endif
	 */
	public int               dwFunctionMask;

	/**
	 * \if ENGLISH_LANG
	 * If synchronous mask; after remote storage network recovery, the local storage data will automatically synchronized to the remote storage.
	 * \else
	 * 是否同步掩码;远程存储网络故障恢复后，自动将本地存储的数据同步到远程存储。
	 * \endif
	 */
	public int               dwAutoSyncMask;

	/**
	 * \if ENGLISH_LANG
	 * the time for synchronous from the network synchronous time. In hour. 0:all data  1:data in one hour n:data in n hours
	 * \else
	 * 从网络恢复的时刻开始，需要往前同步的数据时间范围，小时为单位。0:同步所有数据  1:1小时内的数据 n:n小时内的数据
	 * \endif
	 */
	public byte                bAutoSyncRange;
}

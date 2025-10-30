package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the correspoding interface {@link INetSDK#ControlDevice}, the correspoding command {@link CtrlType#SDK_BACKUP_START}
 * \else
 * 对应接口  {@link INetSDK#ControlDevice}, 对应命令 {@link CtrlType#SDK_BACKUP_START}
 * \endif
 */
public class BACKUP_RECORD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * 备份设备名称
	 * \endif
	 */
	public byte				szDeviceName[] = new byte[FinalVar.SDK_MAX_BACKUP_NAME];
	
	/**
	 * \if ENGLISH_LANG
	 * number of records
	 * \else
	 * 备份记录数量
	 * \endif
	 */
	public int				nRecordNum;
	
	/**
	 * \if ENGLISH_LANG
	 * record information
	 * \else
	 * 备份记录信息
	 * \endif
	 */
	public NET_RECORDFILE_INFO stuRecordInfo[] = new NET_RECORDFILE_INFO[FinalVar.SDK_MAX_BACKUPRECORD_NUM];
	
	public BACKUP_RECORD() {
		for (int i = 0; i < FinalVar.SDK_MAX_BACKUPRECORD_NUM; i++) {
			stuRecordInfo[i] = new NET_RECORDFILE_INFO();
		}
	}
}

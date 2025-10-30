package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Burner progress 
 * \else
 * 刻录进度
 * \endif
 */
public class SDK_BURNING_PROGRESS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Burner status;0:ready to burn,1:burner typs is not correct. It does not match. 
	 * 2:there is no burner available,3:There is burning in process,4:Burner is not free(It is backup or buring or playback.) 
	 * \else
	 * 刻录机状态；0：可以刻录，1：刻录机类型不对，是一个非光盘设备，
	 * 2：未找到刻录机，3：有其它光盘在刻录，4：刻录机处于非空闲状态，即在备份、刻录或回放中
	 * \endif
	 */
	public byte				bBurning;
													 
	/**
	 * \if ENGLISH_LANG
	 * CD type;0:private file system,1:Portable HDD or flash disk,2:CD
	 * \else
	 * 盘片类型；0：私有文件系统，1：移动硬盘或U盘，2：光盘
	 * \endif
	 */
	public byte				bRomType;
	
	/**
	 * \if ENGLISH_LANG
	 * Operation type;0:free,1:backup,2:burning,3:playback from the cd 
	 * \else
	 * 操作类型；0：空闲，1：正在备份中，2：正在刻录中，3：正在进行光盘回放
	 * \endif
	 */
	public byte				bOperateType;
	
	/**
	 * \if ENGLISH_LANG
	 * Backup pr burning status:0:stop or end,1:start,2:error,3:full,4:initializing
	 * \else
	 * 备份或刻录过程状态；0-停止 1-开始 2-出错 3-满 4-结束 5-正在初始化 6-暂停 7-等待附件
	 * \endif
	 */
	public byte				bType;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin time 
	 * \else
	 * 开始时间
	 * \endif
	 */
	public NET_TIME			stTimeStart = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Burning time(second)
	 * \else
	 * 已刻录时间(秒)
	 * \endif
	 */
	public int				dwTimeElapse;
	
	/**
	 * \if ENGLISH_LANG
	 * Total space
	 * \else
	 * 光盘总容量
	 * \endif
	 */
	public int				dwTotalSpace;
	
	/**
	 * \if ENGLISH_LANG
	 * Free space
	 * \else
	 * 光盘剩余容量
	 * \endif
	 */
	public int				dwRemainSpace;
	
	/**
	 * \if ENGLISH_LANG
	 * Burned capacity 
	 * \else
	 *已刻录容量
	 * \endif
	 */
	public int				dwBurned;
	
	/**
	 * \if ENGLISH_LANG
	 * Reserved
	 * \else
	 * 保留
	 * \endif
	 */
	public int				dwStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * The burning channel mask 
	 * \else
	 * 正在刻录的通道掩码s
	 * \endif
	 */
	public int				wChannelMask;
}

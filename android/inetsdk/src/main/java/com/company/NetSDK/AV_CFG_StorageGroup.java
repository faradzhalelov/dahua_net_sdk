package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Storage group config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_STORAGEGROUP}
 * \else
 * 存储组配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_STORAGEGROUP}
 * \endif
 */
public class AV_CFG_StorageGroup implements Serializable { 	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Group name
	 * \else
	 * 分组名称
	 * \endif
	 */
	public byte[]		szName = new byte[FinalVar.AV_CFG_Group_Name_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Group note
	 * \else
	 * 分组说明
	 * \endif
	 */
	public byte[]		szMemo = new byte[FinalVar.AV_CFG_Group_Memo_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * File reserve time
	 * \else
	 * 文件保留时间
	 * \endif
	 */
	public int			nFileHoldTime;
	
 	/**
	 * \if ENGLISH_LANG
	 * Storage space is overlapped or not
	 * \else
	 * 存储空间满是否覆盖
	 * \endif
	 */
	public boolean		bOverWrite;
	
 	/**
	 * \if ENGLISH_LANG
	 * Record file path naming rule
	 * \else
	 * 录像文件路径命名规则
	 * \endif
	 */
	public byte[]		szRecordPathRule = new byte[FinalVar.AV_CFG_Max_Path];
	
 	/**
	 * \if ENGLISH_LANG
	 * Picture file path naming rule
	 * %y year, %M month, %d day, %h hour, %m minute, %s second, %c channel path
	 * If year month day hour minute second appear for two times, then first time means start time, second time means end time.
	 * \else
	 * 图片文件路径命名规则
	 * %y年, %M月, %d日, %h时, %m分, %s秒, %c通道路径
	 * 如果年月日时分秒出现两次, 第一次表示开始时间, 第二次表示结束时间
	 * \endif
	 */
	public byte[]		szPicturePathRule = new byte[FinalVar.AV_CFG_Max_Path];
	
 	/**
	 * \if ENGLISH_LANG
	 * Channel related config 
	 * \else
	 * 通道相关配置 
	 * \endif
	 */
	public AV_CFG_StorageGroupChannel[] stuChannels = new AV_CFG_StorageGroupChannel[FinalVar.AV_CFG_Max_Channel_Num];
	
 	/**
	 * \if ENGLISH_LANG
	 * Channel config number
	 * \else
	 * 通道配置数
	 * \endif
	 */
	public int			nChannelCount;
	
	public AV_CFG_StorageGroup() {
		for (int i = 0; i < FinalVar.AV_CFG_Max_Channel_Num; ++i) {
			this.stuChannels[i] = new AV_CFG_StorageGroupChannel();
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video wall, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_MONITORWALL}
 * \else
 * 电视墙, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_MONITORWALL}
 * \endif
 */
public class AV_CFG_MonitorWall implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * 名称
	 * \endif
	 */
	public byte[]		szName = new byte[FinalVar.AV_CFG_Monitor_Name_Len];
	
	/**
	 * \if ENGLISH_LANG
	 * Network row amount 
	 * \else
	 * 网络行数
	 * \endif
	 */
	public int			nLine; 
	
	/**
	 * \if ENGLISH_LANG
	 * Network column amount 
	 * \else
	 * 网格列数
	 * \endif
	 */
	public int			nColumn;
	
	/**
	 * \if ENGLISH_LANG
	 * Zone amount
	 * \else
	 * 区块数量
	 * \endif
	 */
	public int			nBlockCount; 
	
	/**
	 * \if ENGLISH_LANG
	 * Zone array
	 * \else
	 * 区块数组
	 * \endif
	 */
	public AV_CFG_MonitorWallBlock[] stuBlocks = new AV_CFG_MonitorWallBlock[FinalVar.AV_CFG_Max_Block_In_Wall];
    
	/**
	 * \if ENGLISH_LANG
	 * Unable or not, false-this TV wall is valid, true-The TV wall is invalid
	 * \else
	 * 是否禁用, 0-该电视墙有效, 1-该电视墙无效
	 * \endif
	 */
	public boolean                bDisable;                           
    
	/**
	 * \if ENGLISH_LANG
	 * TV wall description infomation
	 * \else
	 * 电视墙描述信息
	 * \endif
	 */
	public byte[]                szDesc = new byte[FinalVar.CFG_COMMON_STRING_256];     
	
	public AV_CFG_MonitorWall() {
		for (int i = 0; i < FinalVar.AV_CFG_Max_Block_In_Wall; ++i) {
			stuBlocks[i] =  new AV_CFG_MonitorWallBlock();
		}
	}
}

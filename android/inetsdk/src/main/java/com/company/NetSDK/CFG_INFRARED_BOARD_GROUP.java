package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Infrared panel group, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_INFRARED_BOARD}
 * \else
 * 红外面板组, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_INFRARED_BOARD}
 * \endif
 */
public class CFG_INFRARED_BOARD_GROUP implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * \if ENGLISH_LANG
	 * The number of infrared panel
	 * \else
	 * 红外面板数量
	 * \endif
	 */
	public int    nBoardNum;
	
	
	/**
	 * \if ENGLISH_LANG
	 *  Infrared panel information 
	 * \else
	 * 红外面板信息	
	 * \endif
	 */
	public CFG_INFRARED_BOARD stuBoards[] = new CFG_INFRARED_BOARD[FinalVar.CFG_MAX_INFRARED_BOARD_NUM];
	
	
	public CFG_INFRARED_BOARD_GROUP() {	
		for(int i = 0; i < FinalVar.CFG_MAX_INFRARED_BOARD_NUM; i++)
		{
			stuBoards[i] = new CFG_INFRARED_BOARD();
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * configuration of door bell sound, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFD_CMD_DOORBELLSOUND}
 * \else
 * 门铃配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFD_CMD_DOORBELLSOUND}
 * \endif
 */

public class CFG_DOOR_BELLSOUND_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * enable to silence true:yes false:no
	 * \else
	 * 是否静音true 静音false 不静音
	 * \endif
	 */
	public boolean                bSilenceEnable;                
	
	/**
	 * \if ENGLISH_LANG
	 *  ring volume ,rang 0 ~100
	 * \else
	 * 是铃声音量取值范围0~100
	 * \endif
	 */
    public int                    nRingVolume;                      
    
	/**
	 * \if ENGLISH_LANG
	 * ring file, now only support "A" "B" "C" three files, only can sellect one
	 * \else
	 * 铃声文件现在只支持"A","B","C"三个文件只能选择一个文件
	 * \endif
	 */
    public byte[]                 szRingFile = new byte[FinalVar.CFG_COMMON_STRING_64]; 
}

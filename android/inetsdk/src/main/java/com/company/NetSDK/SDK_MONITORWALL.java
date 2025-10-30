package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * tv wall config 
 * \else
 * 电视墙配置
 * \endif
 */
public class SDK_MONITORWALL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * name  
	 * \else
	 *  名称
	 * \endif
	 */
	public byte[]                  szName = new byte[FinalVar.SDK_DEV_NAME_LEN];       
    
	/**
	 * \if ENGLISH_LANG
	 * grid row
	 * \else
	 * 网格行数
	 * \endif
	 */
	public int                     nGridLine;                
    
	/**
	 * \if ENGLISH_LANG
	 * grid column 
	 * \else
	 * 网格列数
	 * \endif
	 */
	public int                     nGridColume; 
    
	/**
	 * \if ENGLISH_LANG
	 * display block group, user allocation nmemory
	 * \else
	 * 显示区块数组, 用户分配内存
	 * \endif
	 */
	public SDK_MONITORWALL_BLOCK[] pstuBlocks;
    
	/**
	 * \if ENGLISH_LANG
	 * display zone group size, user fill in
	 * \else
	 * 显示区块数组大小, 用户填写
	 * \endif
	 */
	public int                     nMaxBlockCount; 
    
	/**
	 * \if ENGLISH_LANG
	 * return display block quantity
	 * \else
	 * 返回的显示区块数量
	 * \endif
	 */
	public int                     nRetBlockCount; 
    
	/**
	 * \if ENGLISH_LANG
	 * unable or not, 0-tv wall is valid , 1-tv wall is invalid
	 * \else
	 * 是否禁用, 0-该电视墙有效, 1-该电视墙无效
	 * \endif
	 */
	public boolean                 bDisable; 
    
	/**
	 * \if ENGLISH_LANG
	 * tv wall description information
	 * \else
	 * 电视墙描述信息
	 * \endif
	 */
	public byte[]                  szDesc = new byte[FinalVar.SDK_COMMON_STRING_256];

	// blockCount:显示区块数组大小; OutputCount:显示单元数组大小
    public SDK_MONITORWALL(int blockCount, int OutputCount) {
    	this.nMaxBlockCount = blockCount;
    	pstuBlocks = new SDK_MONITORWALL_BLOCK[blockCount];
    	
    	for (int i = 0; i < blockCount; ++i) {
    		pstuBlocks[i] =  new SDK_MONITORWALL_BLOCK(OutputCount);
    	}
    }
}

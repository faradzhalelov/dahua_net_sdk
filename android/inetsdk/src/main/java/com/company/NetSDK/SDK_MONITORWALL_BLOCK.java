package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * TV wall display block
 * \else
 * 电视墙显示区块
 * \endif
 */
public class SDK_MONITORWALL_BLOCK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * block name 
	 * \else
	 * 区块名称
	 * \endif
	 */
    public byte[]                  szName = new byte[FinalVar.SDK_DEV_NAME_LEN];      
    
    /**
     * \if ENGLISH_LANG
     *  splicing video wall ID
     * \else
     * 拼接屏ID
     * \endif
     */
    public byte[]                  szCompositeID = new byte[FinalVar.SDK_DEV_ID_LEN];   
    
    /**
     * \if ENGLISH_LANG
     * control ID
     * \else
     * 控制ID
     * \endif
     */
    public byte[]                  szControlID = new byte[FinalVar.SDK_DEV_ID_LEN];    
    
    /**
     * \if ENGLISH_LANG
     * single display unit occupied grid column number
     * \else
     * 单个显示单元所占的网格列数
     * \endif
     */
    public int                     nSingleOutputWidth;
    
    /**
     * \if ENGLISH_LANG
     *  single display unit occupied grid row number
     * \else
     * 单个显示单元所占的网格行数
     * \endif
     */
    public int                     nSingleOutputHeight;            
    
    /**
     * \if ENGLISH_LANG
     * zone coordinate
     * \else
     * 区域坐标
     * \endif
     */
    public SDK_RECT                stuRect = new SDK_RECT();                        
    
    /**
     * \if ENGLISH_LANG
     * switch on time chart, first-dimension each element means sunday~saturday and holiday
     * \else
     * 开机时间表, 第一维各元素表示周日~周六和节假日
     * \endif
     */
    public SDK_TSECT[][]           stuPowerSchedule = new SDK_TSECT[FinalVar.SDK_TSCHE_DAY_NUM][FinalVar.SDK_TSCHE_SEC_NUM]; 
    
    /**
     * \if ENGLISH_LANG
     * display unit data,  user allocation memory
     * \else
     * 显示单元数组, 用户分配内存
     * \endif
     */
    public SDK_MONITORWALL_OUTPUT[] pstuOutputs;
    
    /**
     * \if ENGLISH_LANG
     * display unit group size,user fill in
     * \else
     * 显示单元数组大小, 用户填写
     * \endif
     */
    public int                     nMaxOutputCount; 
    
    /**
     * \if ENGLISH_LANG
     *  return display unit quantity
     * \else
     * 返回的显示单元数量
     * \endif
     */
    public int                     nRetOutputCount;                

    public SDK_MONITORWALL_BLOCK(int OutputCount) {
    	for(int i = 0; i < FinalVar.SDK_TSCHE_DAY_NUM; ++i) {
    		for(int j = 0; j < FinalVar.SDK_TSCHE_SEC_NUM; ++j) {	
    			stuPowerSchedule[i][j] = new SDK_TSECT();
    		}
    	}
    	
    	this.nMaxOutputCount = OutputCount;
    	pstuOutputs = new SDK_MONITORWALL_OUTPUT[OutputCount];
    	for(int k = 0; k < OutputCount; ++k) {
    		pstuOutputs[k] = new SDK_MONITORWALL_OUTPUT();
    	}
    }
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Judicature configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_JUDICATURE}
 * \else
 * 刻录配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_JUDICATURE}
 * \endif
 */
public class CFG_JUDICATURE_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Disk password, input the correct password is needed to play
	 * \else
	 * 光盘密码(废弃, 使用szPassword和nPasswordLen)
	 * \endif
	 */
	public byte[]                szDiskPassword = new byte[FinalVar.MAX_PASSWORD_LEN];  
	
	/**
	 * \if ENGLISH_LANG
	 * Case num
	 * \else
	 * 案件编号
	 * \endif
	 */
	public byte[]                szCaseNo = new byte[FinalVar.MAX_OSD_SUMMARY_LEN];     
	
	/**
	 * \if ENGLISH_LANG
	 * Case num enable
	 * \else
	 * 案件编号叠加使能
	 * \endif
	 */
	public boolean               bCaseNoOsdEn;                      
	
	/**
	 * \if ENGLISH_LANG
	 * Case title
	 * \else
	 * 案件名称
	 * \endif
	 */
	public byte[]                szCaseTitle = new byte[FinalVar.MAX_OSD_SUMMARY_LEN];  
	
	/**
	 * \if ENGLISH_LANG
	 * Case title enable
	 * \else
	 * 案件名称叠加使能
	 * \endif
	 */
	public boolean               bCaseTitleOsdEn;                   
	
	/**
	 * \if ENGLISH_LANG
	 * Officer
	 * \else
	 * 办案人员
	 * \endif
	 */
	public byte[]                szOfficer = new byte[FinalVar.MAX_OSD_SUMMARY_LEN];    
	
	/**
	 * \if ENGLISH_LANG
	 * Officer enable
	 * \else
	 * 办案人员叠加使能
	 * \endif
	 */
	public boolean               bOfficerOsdEn;                     
	
	/**
	 * \if ENGLISH_LANG
	 * Location
	 * \else
	 * 办案地点
	 * \endif
	 */
	public byte[]                szLocation = new byte[FinalVar.MAX_OSD_SUMMARY_LEN];   
	
	/**
	 * \if ENGLISH_LANG
	 * Location enable
	 * \else
	 * 办案地点叠加使能
	 * \endif
	 */
	public boolean               bLocationOsdEn;                    
	
	/**
	 * \if ENGLISH_LANG
	 * Related man
	 * \else
	 * 涉案人员
	 * \endif
	 */
	public byte[]                szRelatedMan = new byte[FinalVar.MAX_OSD_SUMMARY_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Related man enable
	 * \else
	 * 涉案人员叠加使能
	 * \endif
	 */
	public boolean               bRelatedManOsdEn;                  
	
	/**
	 * \if ENGLISH_LANG
	 * Disk num
	 * \else
	 * 光盘编号
	 * \endif
	 */
	public byte[]                szDiskNo = new byte[FinalVar.MAX_OSD_SUMMARY_LEN];     
	
	/**
	 * \if ENGLISH_LANG
	 * Disk num enable
	 * \else
	 * 光盘编号叠加使能
	 * \endif
	 */
	public boolean               bDiskNoOsdEn;                      

	/**
	 * \if ENGLISH_LANG
	 * TRUE:custom judicial case info ,FALSE: such as szCaseNo effective
	 * \else
	 * TRUE:自定义案件信息,FALSE: 上边szCaseNo等字段有效
	 * \endif
	 */
	public boolean               bCustomCase;                       
	
	/**
	 * \if ENGLISH_LANG
	 * Fact CFG_CUSTOMCASE number
	 * \else
	 * 实际CFG_CUSTOMCASE个数
	 * \endif
	 */
	public int                   nCustomCase;                       
	
	/**
	 * \if ENGLISH_LANG
	 * Custom judicial case info
	 * \else
	 * 自定义案件信息
	 * \endif
	 */
	public CFG_CUSTOMCASE[]      stuCustomCases = new CFG_CUSTOMCASE[FinalVar.MAX_CUSTOMCASE_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Disk facet date check configuration enable
	 * \else
	 * 光盘刻录数据校验配置 叠加使能
	 * \endif
	 */
	public boolean               bDataCheckOsdEn;                   
	
	/**
	 * \if ENGLISH_LANG
	 * Attach file enable
	 * \else
	 * 附件上传使能
	 * \endif
	 */
	public boolean               bAttachFileEn;                     
	
	/**
	 * \if ENGLISH_LANG
	 * Password, when burning CD, config password
	 * \else
	 * 密码, 刻录光盘时、配置读保护密码
	 * \endif
	 */
    public byte[]                szPassword = new byte[FinalVar.MAX_PASSWORD_LEN];      
    
	/**
	 * \if ENGLISH_LANG
	 * Password length
	 * \else
	 * 密码长度
	 * \endif
	 */
    public int                   nPasswordLen;                      
    
	/**
	 * \if ENGLISH_LANG
	 * Opening info overlay start time
	 * \else
	 * 片头信息叠加开始时间
	 * \endif
	 */
    public CFG_NET_TIME          stuStartTime = new CFG_NET_TIME();                     
    
	/**
	 * \if ENGLISH_LANG
	 * Opening info overlay time length, unit:minute
	 * \else
	 * 片头信息叠加时间长度，单位：分钟
	 * \endif
	 */
    public int                   nPeriod;                           
    
    public CFG_JUDICATURE_INFO() {
    	for(int i = 0; i < FinalVar.MAX_CUSTOMCASE_NUM; i++) {
    		stuCustomCases[i] = new CFG_CUSTOMCASE();
    	}
    }
}

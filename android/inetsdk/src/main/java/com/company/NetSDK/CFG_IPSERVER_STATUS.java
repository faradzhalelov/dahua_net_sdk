package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Service Statusthe corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_IPSSERVER}
 * \else
 * 服务状态, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_IPSSERVER}
 * \endif
 */
public class CFG_IPSERVER_STATUS implements Serializable { 	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Supported Server Num
	 * \else
	 * 提供的服务个数
	 * \endif
	 */
	public int			nSupportedServerNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Supported Server Name
	 * \else
	 * 提供的服务名称  
	 * \endif
	 */
	public byte[][]		szSupportServer = new byte[FinalVar.MAX_SEVER_NUM][FinalVar.MAX_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Svr Supported SubServer Info Num 
	 * \else
	 * Svr提供的子服务信息个数
	 * \endif
	 */
	public int 			nSvrSuppSubServerNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Svr Supported SubServer Info CMS DMS MTS SS RMS DBR
	 * \else
	 * Svr提供的子服务信息 CMS DMS	MTS	SS RMS DBR
	 * \endif
	 */
	public byte[][]		szSvrSuppSubServer = new byte[FinalVar.MAX_SEVER_NUM][FinalVar.MAX_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run 
	 * \else
	 * 0:未知 1:运行 2:未运行
	 * \endif
	 */
	public byte			byCMS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:未知 1:运行 2:未运行
	 * \endif
	 */
	public byte			byDMS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:未知 1:运行 2:未运行
	 * \endif
	 */
	public byte			byMTS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:未知 1:运行 2:未运行
	 * \endif
	 */
	public byte			bySS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:未知 1:运行 2:未运行
	 * \endif
	 */
	public byte			byRMS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:未知 1:运行 2:未运行
	 * \endif
	 */
	public byte			byDBR;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:未知 1:运行 2:未运行
	 * \endif
	 */
	public byte			bySvrd;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:未知 1:运行 2:未运行
	 * \endif
	 */
	public byte			byDataBase;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:未知 1:运行 2:未运行
	 * \endif
	 */
	public byte			byDataBased;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:未知 1:运行 2:未运行
	 * \endif
	 */
	public byte			byNtpServer;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:未知 1:运行 2:未运行
	 * \endif
	 */
	public byte			byNtpServerd;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:未知 1:运行 2:未运行
	 * \endif
	 */
	public byte			byPrivateII;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:未知 1:运行 2:未运行
	 * \endif
	 */
	public byte			byPrivateIId;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:未知 1:运行 2:未运行
	 * \endif
	 */
	public byte			bySAMBA;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:未知 1:运行 2:未运行
	 * \endif
	 */
	public byte			byNFS;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:未知 1:运行 2:未运行
	 * \endif
	 */
	public byte			byFTP;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:Unknown 1:Run 2:Not Run
	 * \else
	 * 0:未知 1:运行 2:未运行
	 * \endif
	 */
	public byte			byISCSI;
}

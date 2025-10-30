package	com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Visiting Sites Filter Structure, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_ACCESSFILTER}
 * \else
 * 访问地址过滤, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_ACCESSFILTER}
 * \endif
 */
public class AV_CFG_AccessFilter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * 使能
	 * \endif
	 */
	public boolean		bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Types, 0-Block List, 1-Allow list
	 * \else
	 * 类型, 0-禁止名单, 1-允许名单
	 * \endif
	 */
	public int			nType;
	
 	/**
	 * \if ENGLISH_LANG
	 * Allow list IP Amounts
	 * \else
	 * 允许名单IP数量
	 * \endif
	 */
	public int			nWhiteListNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Allow list
	 * \else
	 * 允许名单
	 * \endif
	 */
	public byte[][]		szWhiteList = new byte[FinalVar.AV_CFG_Max_White_List][FinalVar.AV_CFG_Filter_IP_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Block List IP OrIP Segment Block List 
	 * \else
	 * 禁止名单IP或IP段数量
	 * \endif
	 */
	public int			nBlackListNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Block List 
	 * \else
	 * 禁止名单
	 * \endif
	 */
	public byte[][]		szBlackList = new byte[FinalVar.AV_CFG_Max_Black_List][FinalVar.AV_CFG_Filter_IP_Len];
}

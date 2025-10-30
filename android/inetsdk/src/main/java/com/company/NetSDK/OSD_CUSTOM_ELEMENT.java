package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * OSD Detail Overlay Element
 * \else
 * OSD具体叠加元素
 * \endif
 */
public class OSD_CUSTOM_ELEMENT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Name Type,	0:szName text definition refer to szOSDOrder text definition item,1:"Name" text meanscustom item, no analysis
	 * \else
	 * 名称类型,	0:szName字段含义参照szOSDOrder字段定义的项, 1:"Name"字段表示自定义项，无需解析
	 * \endif
	 */
    public int  		nNameType;                      
    											          
	/**
	 * \if ENGLISH_LANG
	 * Item Name, nNameType=0 is valid :[time:%y%M%d%h%m%s]、[breaking code:%18]、[plate number:%09]、[road direction:%64]、[road code:%68]、[speed:%05]、[plate color:%58]、[device number:%28]、[underspeed ratio:%66]、[plate type:%34]、[road number:%04]、[anticounterfeit:%41]、[speed limit:%06]、[vehicle color:%12]、[certificate number:%42]、[commond customize:%54]、[road customize:%55]
	 * \else
	 * 该项名称, nNameType=0时有效 :[时间日期:%年%月%日%时%分%秒]、[违法代码:%18]、[车牌号码:%09]、[道路方向:%64]、[道路代码:%68]、[车速:%05]、[车牌颜色:%58]、[设备编号:%28]、[欠速比:%66]、[车型:%34]、[车道号:%04]、[防伪码:%41]、[限速:%06]、[车身颜色:%12]、[鉴定证书编号:%42]、[通用自定义:%54]、[车道自定义:%55]
	 * \endif
	 */
    public byte[] 		szName = new byte[FinalVar.MAX_OSD_CUSTOM_VALUE_LEN];                        
    
	/**
	 * \if ENGLISH_LANG
	 * Overlay Prefix String
	 * \else
	 * 叠加前缀字符串
	 * \endif
	 */
    public byte[] 		szPrefix = new byte[FinalVar.MAX_PRE_POX_STR_LEN];      
    
	/**
	 * \if ENGLISH_LANG
	 * Overlay Suffix String
	 * \else
	 * 叠加后缀字符串
	 * \endif
	 */
    public byte[] 		szPostfix = new byte[FinalVar.MAX_PRE_POX_STR_LEN];    
    
	/**
	 * \if ENGLISH_LANG
	 * Suffix Add Seperator Quantity
	 * \else
	 * 后面添加分隔符个数
	 * \endif
	 */
    public int  		nSeperaterCount;                   
}

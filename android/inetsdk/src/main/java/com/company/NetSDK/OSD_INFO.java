package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * OSD Property
 * \else
 * OSD属性
 * \endif
 */
public class OSD_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * OSD Black Border Property
	 * \else
	 * OSD黑边属性
	 * \endif
	 */
	public BLACK_REGION_INFO	stBackRegionInfo = new BLACK_REGION_INFO();	
	
	/**
	 * \if ENGLISH_LANG
	 * OSD property , 1=all OSD item public property , 2=each OSD item has one property
	 * \else
	 * OSD属性配置方案 0=未知 , 1=全体OSD项共用属性 , 2=每个OSD项一个属性
	 * \endif
	 */
	public int					nOSDAttrScheme;		    
	
	/**
	 * \if ENGLISH_LANG
	 * OSD Property Config Scheme Content
	 * \else
	 * OSD属性配置方案内容
	 * \endif
	 */
	public OSD_ATTR_SCHEME		stOSDAttrScheme = new OSD_ATTR_SCHEME();		
	
	/**
	 * \if ENGLISH_LANG
	 * OSD Overlay Custom Sequence
	 * \else
	 * OSD叠加内容自定义排序
	 * \endif
	 */
	public OSD_CUSTOM_SORT[]    stOSDCustomSorts = new OSD_CUSTOM_SORT[FinalVar.MAX_OSD_CUSTOM_SORT_NUM];    
	
	/**
	 * \if ENGLISH_LANG
	 * OSD Overlay Custom Sequence Number
	 * \else
	 * OSD叠加内容自定义排序个数
	 * \endif
	 */
	public int                  nOSDCustomSortNum;
	
	/**
	 * \if ENGLISH_LANG
	 * OSD red light time config 0=unknow,1=violation last ,2=all
	 * \else
	 * OSD红灯时间配置 0=未知,1=违法最后一张,2=所有张
	 * \endif
	 */
	public int                  nRedLightTimeDisplay;   
	
	/**
	 * \if ENGLISH_LANG
	 * OSD different item seperator
	 * \else
	 * OSD不同项之间的分隔符
	 * \endif
	 */
	public byte                 cSeperater;            

	/**
	 * \if ENGLISH_LANG
	 * OSD Order :[time:%y%M%d%h%m%s]、[breaking code:%18]、[plate number:%09]、[road direction:%64]、[road code:%68]、[speed:%05]、[plate color:%58]、[device number:%28]、[underspeed ratio:%66]、[plate type:%34]、[road number:%04]、[anticounterfeit:%41]、[speed limit:%06]、[vehicle color:%12]、[certificate number:%42]、[commond customize:%54]、[road customize:%55]
	 * \else
	 * OSD顺序 :[时间日期:%年%月%日%时%分%秒]、[违法代码:%18]、[车牌号码:%09]、[道路方向:%64]、[道路代码:%68]、[车速:%05]、[车牌颜色:%58]、[设备编号:%28]、[欠速比:%66]、[车型:%34]、[车道号:%04]、[防伪码:%41]、[限速:%06]、[车身颜色:%12]、[鉴定证书编号:%42]、[通用自定义:%54]、[车道自定义:%55]
	 * \endif
	 */
	public byte[]               szOSDOrder = new byte[FinalVar.MAX_CONF_CHAR];    
	
	/**
	 * \if ENGLISH_LANG
	 * 0=unknown, 1=Mask , 2=CustomizeSort
	 * \else
	 * 0=未知, 1=Mask , 2=CustomizeSort
	 * \endif
	 */
	public int                  nOSDContentScheme;     
	
	/**
	 * \if ENGLISH_LANG
	 * OSD option
	 * \else
	 * OSD自定义项
	 * \endif
	 */
	public OSD_CUSTOM_INFO      stOSDCustomInfo = new OSD_CUSTOM_INFO();       
	
	public OSD_INFO() {
		for(int i=0; i<FinalVar.MAX_OSD_CUSTOM_SORT_NUM; i++) {
			stOSDCustomSorts[i] = new OSD_CUSTOM_SORT();
		}
	}
}

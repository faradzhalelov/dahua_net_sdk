package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the config of uniform scene
 * \else
 * 统一场景配置,TypeList存在时配置此场景
 * \endif
 */
public class CFG_INTELLI_UNIFORM_SCENE implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * the sub type of traffic scene,"Gate" ,"Junction"  
	 * "Tunnel", "ParkingSpace" "Bridge""Freeway"
	 * \else
	 * 交通场景的子类型,"Gate" 卡口类型,"Junction" 路口类型 
	 * "Tunnel"隧道类型 , "ParkingSpace"车位检测类型
	 * "Bridge"桥梁类型
	 * "Freeway"高速公路类型       
	 * \endif
	 */
	public byte[]            szSubType = new byte[FinalVar.MAX_NAME_LEN];                     
	
	/**
	 * \if ENGLISH_LANG
	 * Plant hints chars number
	 * \else
	 * 车牌字符暗示个数
	 * \endif
	 */
	public int               nPlateHintNum;                                        
	
	/**
	 * \if ENGLISH_LANG
	 * Plant hints char info,when the pictrue was bad to recognize the plant,then it will use these hints for the plant,the litter index, the higher priority
	 * \else
	 * 车牌字符暗示数组，在拍摄图片质量较差车牌识别不确定时，根据此数组中的字符进行匹配，数组下标越小，匹配优先级越高
	 * \endif
	 */
	public byte[][]          szPlateHints = new byte[FinalVar.MAX_PLATEHINT_NUM][FinalVar.MAX_NAME_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Road number
	 * \else
	 * 车道数
	 * \endif
	 */
	public int               nLaneNum;                               				
	
	/**
	 * \if ENGLISH_LANG
	 * Road info
	 * \else
	 * 车道信息
	 * \endif
	 */
	public CFG_LANE[]        stuLanes = new CFG_LANE[FinalVar.MAX_LANE_NUM];        
	
	public CFG_INTELLI_UNIFORM_SCENE() {
		for(int i=0; i<FinalVar.MAX_LANE_NUM; i++) {
			stuLanes[i] = new CFG_LANE();
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * License Plate Type
 * \else
 * 车牌类型
 * \endif
 */
public class EM_NET_PLATE_TYPE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknow type
	 * \else
	 * 未知类型
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_UNKNOWN = 0;
    
	/**
	 * \if ENGLISH_LANG
	 * "Normal" Blue card black card
	 * \else
	 * "Normal" 蓝牌黑牌
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_NORMAL = 1;                              
    
	/**
	 * \if ENGLISH_LANG
	 * "Yellow" yellow card
	 * \else
	 * "Yellow" 黄牌
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_YELLOW = 2;                             
    
	/**
	 * \if ENGLISH_LANG
	 * "DoubleYellow" Double yellow back card
	 * \else
	 * "DoubleYellow" 双层黄尾牌
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_DOUBLEYELLOW = 3;                        
    
	/**
	 * \if ENGLISH_LANG
	 * "Police" Police card
	 * \else
	 * "Police" 警牌
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_POLICE = 4;                            
    
	/**
	 * \if ENGLISH_LANG
	 * "AD" AD card
	 * \else
	 * "AD" 武警牌
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_WJ = 5;
    
	/**
	 * \if ENGLISH_LANG
	 * "ML" ML plate
	 * \else
	 * "ML" ML号牌
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_OUTERGUARD = 6;
    
	/**
	 * \if ENGLISH_LANG
	 * "DoubleML" ML double
	 * \else
	 * "DoubleML" ML双层
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_DOUBLEOUTERGUARD = 7;
    
	/**
	 * \if ENGLISH_LANG
	 * "SAR" Hong Kong and Macao SAR plate	
	 * \else
	 * "SAR" 港澳特区号牌
	 * \endif
	 */
    public static final int  NET_PLATE_TYPE_SAR = 8;                                     
    
	/**
	 * \if ENGLISH_LANG
	 * "Trainning" Drivers Ed plate
	 * \else
	 * "Trainning" 教练车号牌
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_TRAINNING = 9;                           
    
	/**
	 * \if ENGLISH_LANG
	 * "Personal" Personality plate
	 * \else
	 * "Personal" 个性号牌
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_PERSONAL = 10;                            
    
	/**
	 * \if ENGLISH_LANG
	 * "Agri" Agri-using card
	 * \else
	 * "Agri" 农用牌
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_AGRI = 11;                               
    
	/**
	 * \if ENGLISH_LANG
	 * "Embassy" The embassy of plate
	 * \else
	 * "Embassy" 使馆号牌
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_EMBASSY = 12;                             
    
	/**
	 * \if ENGLISH_LANG
	 * "Moto" Motorcycle plate
	 * \else
	 * "Moto" 摩托车号牌
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_MOTO = 13;                               
    
	/**
	 * \if ENGLISH_LANG
	 * "Tractor" The tractor plate
	 * \else
	 * "Tractor" 拖拉机号牌
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_TRACTOR = 14;                            
    
	/**
	 * \if ENGLISH_LANG
	 * "OfficialCar " officer's car
	 * \else
	 * "OfficialCar " 公务车
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_OFFICIALCAR = 15;                         
    
	/**
	 * \if ENGLISH_LANG
	 * "PersonalCar" private car
	 * \else
	 * "PersonalCar" 私家车
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_PERSONALCAR = 16;                         
    
	/**
	 * \if ENGLISH_LANG
	 * "MLCar"  for ML use
	 * \else
	 * "MLCar"  ML用
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_WARCAR = 17;                              
    
	/**
	 * \if ENGLISH_LANG
	 * "Other" The other plate
	 * \else
	 * "Other" 其他号牌
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_OTHER = 18;                             
    
	/**
	 * \if ENGLISH_LANG
	 * "Civilaviation" Civilaviation
	 * \else
	 * "Civilaviation" 民航号牌
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_CIVILAVIATION = 19;                       
    
	/**
	 * \if ENGLISH_LANG
	 * "Black" 
	 * \else
	 * "Black" 黑牌
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_BLACK = 20;                               
    
	/**
	 * \if ENGLISH_LANG
	 * "PureNewEnergyMicroCar" pure new energy micro car
	 * \else
	 * "PureNewEnergyMicroCar" 纯电动新能源小车
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_PURENEWENERGYMICROCAR = 21;               
    
	/**
	 * \if ENGLISH_LANG
	 * "MixedNewEnergyMicroCar" mixed new energy micro car
	 * \else
	 * "MixedNewEnergyMicroCar" 混合新能源小车
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_MIXEDNEWENERGYMICROCAR = 22;              
    
	/**
	 * \if ENGLISH_LANG
	 * "PureNewEnergyLargeCar" pure new energy large car
	 * \else
	 * "PureNewEnergyLargeCar" 纯电动新能源大车
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_PURENEWENERGYLARGECAR = 23;               
    
	/**
	 * \if ENGLISH_LANG
	 * "MixedNewEnergyLargeCar" mixed new energy large car
	 * \else
	 * "MixedNewEnergyLargeCar" 混合新能源大车
	 * \endif
	 */
    public static final int NET_PLATE_TYPE_MIXEDNEWENERGYLARGECAR = 24;              
}

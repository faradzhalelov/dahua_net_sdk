package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Vehicle Type
 * \else
 * 车辆类型
 * \endif
 */
public class EM_NET_VEHICLE_TYPE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknown type
	 * \else
	 * 未知类型
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_UNKNOW = 0;                             
    
	/**
	 * \if ENGLISH_LANG
	 * "Motor"  Motor vehicles"	
	 * \else
	 * "Motor" 机动车 
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_MOTOR = 1;                               
    
	/**
	 * \if ENGLISH_LANG
	 * "Non-Motor"  non-Motor vehicles
	 * \else
	 * "Non-Motor" 非机动车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_NON_MOTOR = 2;                                
    
	/**
	 * \if ENGLISH_LANG
	 * "Bus" bus	
	 * \else
	 * "Bus"公交车     
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_BUS = 3;                                  
    
	/**
	 * \if ENGLISH_LANG
	 * "Bicycle" Bicycle	
	 * \else
	 * "Bicycle" 自行车  
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_BICYCLE = 4;                                 
    
	/**
	 * \if ENGLISH_LANG
	 * "Motorcycle"  Motorcycle
	 * \else
	 * "Motorcycle" 摩托车  
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_MOTORCYCLE = 5;                         
    
	/**
	 * \if ENGLISH_LANG
	 * "UnlicensedMotor": A motor vehicle without a license
	 * \else
	 * "UnlicensedMotor": 无牌机动车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_UNLICENSEDMOTOR = 6;                   
    
	/**
	 * \if ENGLISH_LANG
	 * "LargeCar"  LargeCar
	 * \else
	 * "LargeCar"  大型汽车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_LARGECAR = 7;                          
    
	/**
	 * \if ENGLISH_LANG
	 * "MicroCar"  MicroCar
	 * \else
	 * "MicroCar" 小型汽车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_MICROCAR = 8;                          
    
	/**
	 * \if ENGLISH_LANG
	 * "EmbassyCar"  EmbassyCa
	 * \else
	 * "EmbassyCar" 使馆汽车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_EMBASSYCAR = 9;                        
    
	/**
	 * \if ENGLISH_LANG
	 * "MarginalCar"  MarginalCar
	 * \else
	 * "MarginalCar" 领馆汽车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_MARGINALCAR = 10;                       
    
	/**
	 * \if ENGLISH_LANG
	 * "AreaoutCar"  AreaoutCar
	 * \else
	 * "AreaoutCar" 境外汽车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_AREAOUTCAR = 11;                         
    
	/**
	 * \if ENGLISH_LANG
	 * "ForeignCar"  ForeignCar
	 * \else
	 * "ForeignCar" 外籍汽车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_FOREIGNCAR = 12;                         
    
	/**
	 * \if ENGLISH_LANG
	 * "DualTriWheelMotorcycle"  Two or three rounds of motorcycle
	 * \else
	 * "DualTriWheelMotorcycle" 两、三轮摩托车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_DUALTRIWHEELMOTORCYCLE = 13;            
    
	/**
	 * \if ENGLISH_LANG
	 * "LightMotorcycle"  light motorcycle
	 * \else
	 * "LightMotorcycle" 轻便摩托车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_LIGHTMOTORCYCLE = 14;                    
    
	/**
	 * \if ENGLISH_LANG
	 * "EmbassyMotorcycle"  The embassy of the motorcycle
	 * \else
	 * "EmbassyMotorcycle" 使馆摩托车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_EMBASSYMOTORCYCLE = 15;                 
    
	/**
	 * \if ENGLISH_LANG
	 * "MarginalMotorcycle"  Consulate motorcycle
	 * \else
	 * "MarginalMotorcycle" 领馆摩托车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_MARGINALMOTORCYCLE = 16;                
    
	/**
	 * \if ENGLISH_LANG
	 * "AreaoutMotorcycle"  Outside the motorcycle
	 * \else
	 * "AreaoutMotorcycle" 境外摩托车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_AREAOUTMOTORCYCLE = 17;                 
    
	/**
	 * \if ENGLISH_LANG
	 * "ForeignMotorcycle"  Foreign motorcycle
	 * \else
	 * "ForeignMotorcycle" 外籍摩托车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_FOREIGNMOTORCYCLE = 18;                  
    
	/**
	 * \if ENGLISH_LANG
	 * "FarmTransmitCar"  agricultural vehicle
	 * \else
	 * "FarmTransmitCar" 农用运输车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_FARMTRANSMITCAR = 19;                   
    
	/**
	 * \if ENGLISH_LANG
	 * "Tractor" tractor
	 * \else
	 * "Tractor" 拖拉机
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_TRACTOR = 20;                            
    
	/**
	 * \if ENGLISH_LANG
	 * "Trailer"  trailer
	 * \else
	 * "Trailer"  挂车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_TRAILER = 21;                           
    
	/**
	 * \if ENGLISH_LANG
	 * "CoachCar"  Car coach
	 * \else
	 * "CoachCar" 教练汽车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_COACHCAR = 22;                          
    
	/**
	 * \if ENGLISH_LANG
	 * "CoachMotorcycle"  coach Motorcycle
	 * \else
	 * "CoachMotorcycle" 教练摩托车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_COACHMOTORCYCLE = 23;                   
    
	/**
	 * \if ENGLISH_LANG
	 * "TrialCar"  trial car 
	 * \else
	 * "TrialCar" 试验汽车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_TRIALCAR = 24;                          
    
	/**
	 * \if ENGLISH_LANG
	 * "TrialMotorcycle" Test motorcycle
	 * \else
	 * "TrialMotorcycle" 试验摩托车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_TRIALMOTORCYCLE = 25;                   
    
	/**
	 * \if ENGLISH_LANG
	 * "TemporaryEntryCar"  Temporary entry vehicle
	 * \else
	 * "TemporaryEntryCar" 临时入境汽车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_TEMPORARYENTRYCAR = 26;                
    
	/**
	 * \if ENGLISH_LANG
	 * "TemporaryEntryMotorcycle"  Temporary entry of motorcycle
	 * \else
	 * "TemporaryEntryMotorcycle" 临时入境摩托车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_TEMPORARYENTRYMOTORCYCLE = 27;          
    
	/**
	 * \if ENGLISH_LANG
	 * "TemporarySteerCar" Temporary driving car
	 * \else
	 * "TemporarySteerCar" 临时行驶车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_TEMPORARYSTEERCAR = 28;                  
    
	/**
	 * \if ENGLISH_LANG
	 * "PassengerCar" passenger car
	 * \else
	 * "PassengerCar" 客车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_PASSENGERCAR = 29;                      
    
	/**
	 * \if ENGLISH_LANG
	 * "LargeTruck" LargeTruck
	 * \else
	 * "LargeTruck" 大货车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_LARGETRUCK = 30;                     
    
	/**
	 * \if ENGLISH_LANG
	 * "MidTruck" MidTruck
	 * \else
	 * "MidTruck" 中货车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_MIDTRUCK = 31;                         
    
	/**
	 * \if ENGLISH_LANG
	 * "SaloonCar" SaloonCar
	 * \else
	 * "SaloonCar" 轿车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_SALOONCAR = 32;                         
    
	/**
	 * \if ENGLISH_LANG
	 * "Microbus" Microbus
	 * \else
	 * "Microbus" 面包车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_MICROBUS = 33;                          
    
	/**
	 * \if ENGLISH_LANG
	 * "MicroTruck" MicroTruck
	 * \else
	 * "MicroTruck" 小货车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_MICROTRUCK = 34;                        
    
	/**
	 * \if ENGLISH_LANG
	 * "Tricycle" Tricycle
	 * \else
	 * "Tricycle" 三轮车
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_TRICYCLE = 35;                           
    
	/**
	 * \if ENGLISH_LANG
	 * "Passerby" Passerby
	 * \else
	 * "Passerby" 行人
	 * \endif
	 */
    public static final int NET_VEHICLE_TYPE_PASSERBY = 36;                          
}

package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Type of category
 * \else
 * @brief 各类物体的子类型
 * \endif
 */
public class CFG_CATEGORY_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown type
     * \else
     *  未知类型
     * \endif
     */
    public static final int					CFG_CATEGORY_TYPE_UNKNOW = 0;

    /**
     * \if ENGLISH_LANG
     *  "Motor"         
     * \else
     *  "Motor" 机动车           
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_MOTOR = 1;

    /**
     * \if ENGLISH_LANG
     *  "Non-Motor"       
     * \else
     *  "Non-Motor"非机动车        
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_NON_MOTOR = 2;

    /**
     * \if ENGLISH_LANG
     *  "Bus"   
     * \else
     *  "Bus"公交车        
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_BUS = 3;

    /**
     * \if ENGLISH_LANG
     *  "Bicycle"     
     * \else
     *  "Bicycle" 自行车        
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_BICYCLE = 4;

    /**
     * \if ENGLISH_LANG
     *  "Motorcycle"     
     * \else
     *  "Motorcycle"摩托车        
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_MOTORCYCLE = 5;

    /**
     * \if ENGLISH_LANG
     *  "UnlicensedMotor"
     * \else
     *  "UnlicensedMotor": 无牌机动车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_UNLICENSEDMOTOR = 6;

    /**
     * \if ENGLISH_LANG
     *  "LargeCar"  
     * \else
     *  "LargeCar"  大型汽车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_LARGECAR = 7;

    /**
     * \if ENGLISH_LANG
     *  "MicroCar" 
     * \else
     *  "MicroCar" 小型汽车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_MICROCAR = 8;

    /**
     * \if ENGLISH_LANG
     *  "EmbassyCar" 
     * \else
     *  "EmbassyCar" 使馆汽车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_EMBASSYCAR = 9;

    /**
     * \if ENGLISH_LANG
     *  "MarginalCar" 
     * \else
     *  "MarginalCar" 领馆汽车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_MARGINALCAR = 10;

    /**
     * \if ENGLISH_LANG
     *  "AreaoutCar" 
     * \else
     *  "AreaoutCar" 境外汽车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_AREAOUTCAR = 11;

    /**
     * \if ENGLISH_LANG
     *  "ForeignCar" 
     * \else
     *  "ForeignCar" 外籍汽车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_FOREIGNCAR = 12;

    /**
     * \if ENGLISH_LANG
     *  "DualTriWheelMotorcycle"
     * \else
     *  "DualTriWheelMotorcycle"两、三轮摩托车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_DUALTRIWHEELMOTORCYCLE = 13;

    /**
     * \if ENGLISH_LANG
     *  "LightMotorcycle" 
     * \else
     *  "LightMotorcycle" 轻便摩托车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_LIGHTMOTORCYCLE = 14;

    /**
     * \if ENGLISH_LANG
     *  "EmbassyMotorcycle"
     * \else
     *  "EmbassyMotorcycle "使馆摩托车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_EMBASSYMOTORCYCLE = 15;

    /**
     * \if ENGLISH_LANG
     *  "MarginalMotorcycle"
     * \else
     *  "MarginalMotorcycle "领馆摩托车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_MARGINALMOTORCYCLE = 16;

    /**
     * \if ENGLISH_LANG
     *  "AreaoutMotorcycle" 
     * \else
     *  "AreaoutMotorcycle "境外摩托车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_AREAOUTMOTORCYCLE = 17;

    /**
     * \if ENGLISH_LANG
     *  "ForeignMotorcycle "
     * \else
     *  "ForeignMotorcycle "外籍摩托车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_FOREIGNMOTORCYCLE = 18;

    /**
     * \if ENGLISH_LANG
     *  "FarmTransmitCar" 
     * \else
     *  "FarmTransmitCar" 农用运输车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_FARMTRANSMITCAR = 19;

    /**
     * \if ENGLISH_LANG
     *  "Tractor"
     * \else
     *  "Tractor" 拖拉机
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_TRACTOR = 20;

    /**
     * \if ENGLISH_LANG
     *  "Trailer" 
     * \else
     *  "Trailer"  挂车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_TRAILER = 21;

    /**
     * \if ENGLISH_LANG
     *  "CoachCar"
     * \else
     *  "CoachCar"教练汽车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_COACHCAR = 22;

    /**
     * \if ENGLISH_LANG
     *  "CoachMotorcycle "
     * \else
     *  "CoachMotorcycle "教练摩托车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_COACHMOTORCYCLE = 23;

    /**
     * \if ENGLISH_LANG
     *  "TrialCar"
     * \else
     *  "TrialCar" 试验汽车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_TRIALCAR = 24;

    /**
     * \if ENGLISH_LANG
     *  "TrialMotorcycle "
     * \else
     *  "TrialMotorcycle "试验摩托车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_TRIALMOTORCYCLE = 25;

    /**
     * \if ENGLISH_LANG
     *  "TemporaryEntryCar"
     * \else
     *  "TemporaryEntryCar"临时入境汽车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_TEMPORARYENTRYCAR = 26;

    /**
     * \if ENGLISH_LANG
     *  "TemporaryEntryMotorcycle"
     * \else
     *  "TemporaryEntryMotorcycle"临时入境摩托车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_TEMPORARYENTRYMOTORCYCLE = 27;

    /**
     * \if ENGLISH_LANG
     *  "TemporarySteerCar"
     * \else
     *  "TemporarySteerCar"临时行驶车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_TEMPORARYSTEERCAR = 28;

    /**
     * \if ENGLISH_LANG
     *  "PassengerCar"
     * \else
     *  "PassengerCar" 客车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_PASSENGERCAR = 29;

    /**
     * \if ENGLISH_LANG
     *  "LargeTruck"
     * \else
     *  "LargeTruck" 大货车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_LARGETRUCK = 30;

    /**
     * \if ENGLISH_LANG
     *  "MidTruck"
     * \else
     *  "MidTruck" 中货车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_MIDTRUCK = 31;

    /**
     * \if ENGLISH_LANG
     *  "SaloonCar" 
     * \else
     *  "SaloonCar" 轿车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_SALOONCAR = 32;

    /**
     * \if ENGLISH_LANG
     *  "Microbus"
     * \else
     *  "Microbus"面包车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_MICROBUS = 33;

    /**
     * \if ENGLISH_LANG
     *  "MicroTruck"
     * \else
     *  "MicroTruck"小货车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_MICROTRUCK = 34;

    /**
     * \if ENGLISH_LANG
     *  "Tricycle"
     * \else
     *  "Tricycle"三轮车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_TRICYCLE = 35;

    /**
     * \if ENGLISH_LANG
     *  "Passerby"
     * \else
     *  "Passerby" 行人
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_PASSERBY = 36;

    /**
     * \if ENGLISH_LANG
     *  "OilTankTruck" 
     * \else
     *  "OilTankTruck" 油罐车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_OILTANKTRUCK = 37;

    /**
     * \if ENGLISH_LANG
     *  "TankCar" 
     * \else
     *  "TankCar" 槽罐车
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_TANKCAR = 38;

    /**
     * \if ENGLISH_LANG
     *  "SUV"
     * \else
     *  "SUV" SUV
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_SUV = 39;

    /**
     * \if ENGLISH_LANG
     *  "MPV"
     * \else
     *  "MPV" MPV
     * \endif
     */
    public static final int					CFG_CATEGORY_VEHICLE_TYPE_MPV = 40;

    /**
     * \if ENGLISH_LANG
     *  "Normal" 
     * \else
     *  "Normal" 蓝牌黑字
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_NORMAL = 41;

    /**
     * \if ENGLISH_LANG
     *  "Yellow"
     * \else
     *  "Yellow" 黄牌
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_YELLOW = 42;

    /**
     * \if ENGLISH_LANG
     *  "DoubleYellow" 
     * \else
     *  "DoubleYellow" 双层黄尾牌
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_DOUBLEYELLOW = 43;

    /**
     * \if ENGLISH_LANG
     *  "Police" 
     * \else
     *  "Police" 警牌
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_POLICE = 44;

    /**
     * \if ENGLISH_LANG
     *    CFG_CATEGORY_PLATE_TYPE_WJ,
     * \else
     *    CFG_CATEGORY_PLATE_TYPE_WJ,
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_WJ = 45;

    /**
     * \if ENGLISH_LANG
     *    CFG_CATEGORY_PLATE_TYPE_OUTERGUARD,
     * \else
     *    CFG_CATEGORY_PLATE_TYPE_OUTERGUARD,
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_OUTERGUARD = 46;

    /**
     * \if ENGLISH_LANG
     *    CFG_CATEGORY_PLATE_TYPE_DOUBLEOUTERGUARD,
     * \else
     *    CFG_CATEGORY_PLATE_TYPE_DOUBLEOUTERGUARD,
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_DOUBLEOUTERGUARD = 47;

    /**
     * \if ENGLISH_LANG
     *  "SAR"    
     * \else
     *  "SAR" 港澳特区号牌    
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_SAR = 48;

    /**
     * \if ENGLISH_LANG
     *  "Trainning" 
     * \else
     *  "Trainning" 教练车号牌
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_TRAINNING = 49;

    /**
     * \if ENGLISH_LANG
     *  "Personal" 
     * \else
     *  "Personal" 个性号牌
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_PERSONAL = 50;

    /**
     * \if ENGLISH_LANG
     *  "Agri"
     * \else
     *  "Agri" 农用牌
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_AGRI = 51;

    /**
     * \if ENGLISH_LANG
     *  "Embassy"
     * \else
     *  "Embassy" 使馆号牌
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_EMBASSY = 52;

    /**
     * \if ENGLISH_LANG
     *  "Moto" 
     * \else
     *  "Moto" 摩托车号牌
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_MOTO = 53;

    /**
     * \if ENGLISH_LANG
     *  "Tractor"
     * \else
     *  "Tractor" 拖拉机号牌
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_TRACTOR = 54;

    /**
     * \if ENGLISH_LANG
     *  "OfficialCar"
     * \else
     *  "OfficialCar" 公务车
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_OFFICIALCAR = 55;

    /**
     * \if ENGLISH_LANG
     *  "PersonalCar" 
     * \else
     *  "PersonalCar" 私家车
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_PERSONALCAR = 56;

    /**
     * \if ENGLISH_LANG
     *    CFG_CATEGORY_PLATE_TYPE_WARCAR, 
     * \else
     *    CFG_CATEGORY_PLATE_TYPE_WARCAR,
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_WARCAR = 57;

    /**
     * \if ENGLISH_LANG
     *  "Other" 
     * \else
     *  "Other" 其他号牌
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_OTHER = 58;

    /**
     * \if ENGLISH_LANG
     *  "Civilaviation" 
     * \else
     *  "Civilaviation" 民航号牌
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_CIVILAVIATION = 59;

    /**
     * \if ENGLISH_LANG
     *  "Black"
     * \else
     *  "Black" 黑牌
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_BLACK = 60;

    /**
     * \if ENGLISH_LANG
     *  "PureNewEnergyMicroCar" 
     * \else
     *  "PureNewEnergyMicroCar" 纯电动新能源小车
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_PURENEWENERGYMICROCAR = 61;

    /**
     * \if ENGLISH_LANG
     *  "MixedNewEnergyMicroCar" 
     * \else
     *  "MixedNewEnergyMicroCar" 混合新能源小车
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_MIXEDNEWENERGYMICROCAR = 62;

    /**
     * \if ENGLISH_LANG
     *  "PureNewEnergyLargeCar" 
     * \else
     *  "PureNewEnergyLargeCar" 纯电动新能源大车
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_PURENEWENERGYLARGECAR = 63;

    /**
     * \if ENGLISH_LANG
     *  "MixedNewEnergyLargeCar" 
     * \else
     *  "MixedNewEnergyLargeCar" 混合新能源大车
     * \endif
     */
    public static final int					CFG_CATEGORY_PLATE_TYPE_MIXEDNEWENERGYLARGECAR = 64;

}

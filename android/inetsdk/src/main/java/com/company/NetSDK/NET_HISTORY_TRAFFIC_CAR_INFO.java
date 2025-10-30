package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Vehicle Information
 * \else
 * @brief 机动车信息
 * \endif
 */
public class NET_HISTORY_TRAFFIC_CAR_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  non-motor vehicle unique identifier
     * \else
     *  非机动车唯一标识符
     * \endif
     */
    public byte					szUID[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  Bounding box (8192 coordinate system)
     * \else
     *  包围盒(8192坐标系)
     * \endif
     */
    public NET_RECT					stuBoundingBox = new NET_RECT();

    /**
     * \if ENGLISH_LANG
     *  license plate number
     * \else
     *  车牌号码
     * \endif
     */
    public byte					szPlateNumber[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  license plate type	
     * \else
     *  车牌类型	
     * \endif
     */
    public byte					szPlateType[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  license plate color
     * \else
     *  车牌颜色
     * \endif
     */
    public byte					szPlateColor[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  body color
     * \else
     *  车身颜色
     * \endif
     */
    public byte					szVehicleColor[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  vehicle type    
     * \else
     *  车辆类型    
     * \endif
     */
    public byte					szCategory[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  special vehicle
     * \else
     *  特种车辆
     * \endif
     */
    public byte					szSpecialCar[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  vehicle sign
     * \else
     *  车辆标识
     * \endif
     */
    public byte					szVehicleSign[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  vehicle sub-brand 
     * \else
     *  车辆子品牌 
     * \endif
     */
    public int					nSubBrand;

    /**
     * \if ENGLISH_LANG
     *  Vehicle year 
     * \else
     *  车辆年款 
     * \endif
     */
    public int					nBrandYear;

    /**
     * \if ENGLISH_LANG
     *  number of ornaments 
     * \else
     *  摆件数量 
     * \endif
     */
    public int					nFurnitureCount;

    /**
     * \if ENGLISH_LANG
     *  number of pendants 	
     * \else
     *  挂件数量 	
     * \endif
     */
    public int					nPendantCount;

    /**
     * \if ENGLISH_LANG
     *  Number of annual inspections
     * \else
     *  年检标数量
     * \endif
     */
    public int					nAnnualInspectionCount;

    /**
     * \if ENGLISH_LANG
     *  annual inspection order, 0: unknown 1: random 2: horizontal 3: vertical
     * \else
     *  年检标顺序, 0: 未知  1: 乱排  2: 横排  3: 竖排
     * \endif
     */
    public int					nAnnualInspectionShape;

    /**
     * \if ENGLISH_LANG
     *  main driver sunshade state,{@link NET_SUNSHADE_STATE}
     * \else
     *  主驾驶遮阳板状态,{@link NET_SUNSHADE_STATE}
     * \endif
     */
    public int					emSunShade;

    /**
     * \if ENGLISH_LANG
     *  copilot sunshade state,{@link NET_SUNSHADE_STATE}
     * \else
     *  副驾驶遮阳板状态,{@link NET_SUNSHADE_STATE}
     * \endif
     */
    public int					emSubSeatSunShade;

    /**
     * \if ENGLISH_LANG
     *  number of cards
     * \else
     *  卡片数量
     * \endif
     */
    public int					nCardCount;

    /**
     * \if ENGLISH_LANG
     *  main driver's seat belt,{@link NET_SAFEBELT_STATE}
     * \else
     *  主驾驶安全带,{@link NET_SAFEBELT_STATE}
     * \endif
     */
    public int					emSafeBelt;

    /**
     * \if ENGLISH_LANG
     *  is calling, 0: unknown 1: no 2: yes
     * \else
     *  是否在打电话, 0: 未知 1: 否 2: 是
     * \endif
     */
    public int					nCalling;

    /**
     * \if ENGLISH_LANG
     *  Whether the phone is playing, 0: unknown 1: no 2: yes
     * \else
     *  是否在玩手机, 0: 未知 1: 否 2: 是
     * \endif
     */
    public int					nPlayPhone;

    /**
     * \if ENGLISH_LANG
     *  smoking, 0: unknown 1: no 2: yes
     * \else
     *  是否在抽烟, 0: 未知 1: 否 2: 是
     * \endif
     */
    public int					nSmoking;

    /**
     * \if ENGLISH_LANG
     *  Is there anyone in the co-pilot, 0: unknown 1: no 2: yes	  
     * \else
     *  副驾驶是否有人, 0: 未知 1: 否 2: 是	  
     * \endif
     */
    public int					nSubSeatPeople;

    /**
     * \if ENGLISH_LANG
     *  passenger seat belt,{@link NET_SAFEBELT_STATE}
     * \else
     *  副驾驶安全带,{@link NET_SAFEBELT_STATE}
     * \endif
     */
    public int					emSubSeatSafeBelt;

    /**
     * \if ENGLISH_LANG
     *  whether to hold the baby, 0: unknown 1: no 2: yes
     * \else
     *  是否抱小孩, 0: 未知 1: 否 2: 是
     * \endif
     */
    public int					nHoldBaby;

    /**
     * \if ENGLISH_LANG
     *  whether there is a sunroof, 0: unknown 1: no 2: yes
     * \else
     *  是否有天窗, 0: 未知 1: 否 2: 是
     * \endif
     */
    public int					nSunroof;

    /**
     * \if ENGLISH_LANG
     *  whether there is a luggage rack, 0: unknown 1: no 2: yes
     * \else
     *  是否有行李架, 0: 未知 1: 否 2: 是
     * \endif
     */
    public int					nLuggageRack;

    /**
     * \if ENGLISH_LANG
     *  whether there is a vehicle crash, 0: unknown 1: no 2: yes
     * \else
     *  是否有车辆撞损, 0: 未知 1: 否 2: 是
     * \endif
     */
    public int					nVehicleCollision;

    /**
     * \if ENGLISH_LANG
     *  whether there is a print, 0: unknown 1: no 2: yes
     * \else
     *  是否有喷绘, 0: 未知 1: 否 2: 是
     * \endif
     */
    public int					nVehiclePrint;

    /**
     * \if ENGLISH_LANG
     *  whether there is a spare tire, 0: unknown 1: no 2: yes
     * \else
     *  是否有备胎, 0: 未知 1: 否 2: 是
     * \endif
     */
    public int					nBackupTire;

    /**
     * \if ENGLISH_LANG
     *  trunk status, 0: unknown 1: closed 2: open
     * \else
     *  后备箱状态, 0: 未知 1: 关闭 2: 打开
     * \endif
     */
    public int					nTrunk;

    /**
     * \if ENGLISH_LANG
     *  license plate defacement status, 0: unknown 1: normal 2: no plate 3: partially occluded/defaced 4: fully occluded/defaced
     * \else
     *  车牌污损状态, 0: 未知 1: 正常 2: 无牌 3: 部分遮挡/污损  4: 完全遮挡/污损
     * \endif
     */
    public int					nPlateAttribute;

    /**
     * \if ENGLISH_LANG
     *  Muck cover status, 0: Unknown 1: Covered 2: Uncovered empty 3: Uncovered full
     * \else
     *  渣土车遮盖状态, 0: 未知 1: 有遮盖 2: 无遮盖空载 3: 无遮盖满载 
     * \endif
     */
    public int					nMuskHide;

    /**
     * \if ENGLISH_LANG
     *  Motor vehicle picture information
     * \else
     *  机动车图片信息
     * \endif
     */
    public NET_PIC_INFO_EX					stuImage = new NET_PIC_INFO_EX();

    /**
     * \if ENGLISH_LANG
     *  Whether the vehicle is parked and pressed, 0: Unknown 1: Parking without pressing the wire 2: Parking when the wire is pressed
     * \else
     *  车辆停车是否压线, 0: 未知  1: 未压线停车 2: 压线停车 
     * \endif
     */
    public int					nPressParkingStatus;

}
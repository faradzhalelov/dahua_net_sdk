package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief The corresponding search criteria of  SDK_MEDIA_QUERY_TRAFFICCARtypedef struct
 * \else
 * @brief SDK_MEDIA_QUERY_TRAFFICCAR对应的查询条件
 * \endif
 */
public class MEDIA_QUERY_TRAFFICCAR_PARAM implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The channel number begins with 0. -1 is to search information of all channels .
     * \else
     *  通道号从0开始,-1表示查询所有通道
     * \endif
     */
    public int					nChannelID;

    /**
     * \if ENGLISH_LANG
     *  Start time 	
     * \else
     *  开始时间    
     * \endif
     */
    public NET_TIME					StartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  End time 
     * \else
     *  结束时间
     * \endif
     */
    public NET_TIME					EndTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  File type:0=search any type.1=search jpg file
     * \else
     *  文件类型,0:任意类型, 1:jpg图片, 2:dav文件
     * \endif
     */
    public int					nMediaType;

    /**
     * \if ENGLISH_LANG
     *  deprecated, to get same info, use pEventType instead
     * \else
     *  事件类型,详见"智能分析事件类型", 0:表示查询任意事件,此参数废弃,请使用pEventTypes
     * \endif
     */
    public int					nEventType;

    /**
     * \if ENGLISH_LANG
     *  Vehicle plate. "\0" is to search any plate number.
     * \else
     *  车牌号, "\0"则表示查询任意车牌号
     * \endif
     */
    public byte					szPlateNumber[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  The searched vehicle speed range. Max speed unit is km/h
     * \else
     *  查询的车速范围; 速度上限 单位: km/h
     * \endif
     */
    public int					nSpeedUpperLimit;

    /**
     * \if ENGLISH_LANG
     *  The searched vehicle speed range. Min speed unit is km/h
     * \else
     *  查询的车速范围; 速度下限 单位: km/h 
     * \endif
     */
    public int					nSpeedLowerLimit;

    /**
     * \if ENGLISH_LANG
     *  Search according to the speed or not.  TRUE: search according to the speed.nSpeedUpperLimit and nSpeedLowerLimit is valid.
     * \else
     *  是否按速度查询; TRUE:按速度查询,nSpeedUpperLimit和nSpeedLowerLimit有效。
     * \endif
     */
    public boolean					bSpeedLimit;

    /**
     * \if ENGLISH_LANG
     *  Illegal type:
     * \else
     *  违章类型：
     * \endif
     */
    public int					dwBreakingRule;

    /**
     * \if ENGLISH_LANG
     *  Plate type: "Unknown" =Unknown; "Normal"=Blue and black plate. "Yellow"=Yellow plate. "DoubleYellow"=Double-layer yellow plate 
     * \else
     *  车牌类型,"Unknown" 未知,"Normal" 蓝牌黑牌,"Yellow" 黄牌,"DoubleYellow" 双层黄尾牌,"Police" 警牌,"SAR" 港澳特区号牌,"Trainning" 教练车号牌
     * \endif
     */
    public byte					szPlateType[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  plate color, "Blue","Yellow", "White","Black"
     * \else
     *  车牌颜色, "Blue"蓝色,"Yellow"黄色, "White"白色,"Black"黑色
     * \endif
     */
    public byte					szPlateColor[] = new byte[16];

    /**
     * \if ENGLISH_LANG
     *  vehicle color:"White", "Black", "Red", "Yellow", "Gray", "Blue","Green"
     * \else
     *  车身颜色:"White"白色, "Black"黑色, "Red"红色, "Yellow"黄色, "Gray"灰色, "Blue"蓝色,"Green"绿色
     * \endif
     */
    public byte					szVehicleColor[] = new byte[16];

    /**
     * \if ENGLISH_LANG
     *  vehicle type:"Light-duty";"Medium"; "Oversize"
     * \else
     *  车辆大小类型:"Light-duty":小型车;"Medium":中型车; "Oversize":大型车; "Unknown": 未知
     * \endif
     */
    public byte					szVehicleSize[] = new byte[16];

    /**
     * \if ENGLISH_LANG
     *  id of event group(it works when >= 0)
     * \else
     *  事件组编号(此值>=0时有效)
     * \endif
     */
    public int					nGroupID;

    /**
     * \if ENGLISH_LANG
     *  lane number(it works when >= 0)
     * \else
     *  车道号(此值>=0时表示具体车道,-1表示所有车道,即不下发此字段)
     * \endif
     */
    public short					byLane;

    /**
     * \if ENGLISH_LANG
     *  file flag, 0xFF-use nFileFlagEx, 0-all record, 1-timing file, 2-manual, 3-event, 4-important, 5-mosaic
     * \else
     *  文件标志, 0xFF-使用nFileFlagEx, 0-表示所有录像, 1-定时文件, 2-手动文件, 3-事件文件, 4-重要文件, 5-合成文件
     * \endif
     */
    public byte					byFileFlag;

    /**
     * \if ENGLISH_LANG
     *  The need for random jumps in the query process, 0 - no need 1 - need
     * \else
     *  是否需要在查询过程中随意跳转,0-不需要,1-需要
     * \endif
     */
    public byte					byRandomAccess;

    /**
     * \if ENGLISH_LANG
     *  file flag, bit0-timing, bit1-manual, bit2-event, bit3-important, bit4-mosaic, 0xFFFFFFFF-all
     * \else
     *  文件标志, 按位表示: bit0-定时文件, bit1-手动文件, bit2-事件文件, bit3-重要文件, bit4-合成文件, bit5-禁止名单图片 0xFFFFFFFF-所有录像
     * \endif
     */
    public int					nFileFlagEx;

    /**
     * \if ENGLISH_LANG
     *  direction(to the direction of car)	0-north 1-northeast 2-east 3-southeast 4-south 5-southwest 6-west 7-northwest 8-unknown -1-all directions
     * \else
     *  车道方向（车开往的方向）    0-北 1-东北 2-东 3-东南 4-南 5-西南 6-西 7-西北 8-未知 -1-所有方向
     * \endif
     */
    public int					nDirection;

    /**
     * \if ENGLISH_LANG
     *  working directory list,can inquire multiple directory at a atime,separated by ";",example "/mnt/dvr/sda0;/mnt/dvr/sda1",if szDirs==null or szDirs == "" ,means search all
     * \else
     *  工作目录列表,一次可查询多个目录,为空表示查询所有目录。目录之间以分号分隔,如“/mnt/dvr/sda0;/mnt/dvr/sda1”,szDirs==null 或"" 表示查询所有
     * \endif
     */
    public String					szDirs = new String();

    /**
     * \if ENGLISH_LANG
     *  Check the event type to be an array of pointers, event type, see "intelligent analysis event type", if the query is NULL considered all events (buffer required to apply by the user)
     * \else
     *  待查询的事件类型数组指针,事件类型,详见"智能分析事件类型",若为NULL则认为查询所有事件（缓冲需由用户申请）
     * \endif
     */
    public int[]					pEventTypes;

    /**
     * \if ENGLISH_LANG
     *  Event Type array size
     * \else
     *  事件类型数组大小
     * \endif
     */
    public int					nEventTypeNum;

    /**
     * \if ENGLISH_LANG
     *  Device address, NULL indicates that the field does not work
     * \else
     *  设备地址, NULL表示该字段不起作用
     * \endif
     */
    public String					pszDeviceAddress = new String();

    /**
     * \if ENGLISH_LANG
     *  Machine deployment locations, NULL indicates that the field does not work
     * \else
     *  机器部署地点, NULL表示该字段不起作用
     * \endif
     */
    public String					pszMachineAddress = new String();

    /**
     * \if ENGLISH_LANG
     *  Vehicle identification, such as "Unknown" - unknown, "Audi" - Audi, "Honda" - Honda ... NULL indicates that the field does not work
     * \else
     *  车辆标识, 例如 "Unknown"-未知, "Audi"-奥迪, "Honda"-本田... NULL表示该字段不起作用
     * \endif
     */
    public String					pszVehicleSign = new String();

    /**
     * \if ENGLISH_LANG
     *  Specifies the sub-brand of vehicle,the real value can be found in a mapping table from the development manual
     * \else
     *  车辆子品牌 需要通过映射表得到真正的子品牌 映射表详见开发手册
     * \endif
     */
    public short					wVehicleSubBrand;

    /**
     * \if ENGLISH_LANG
     *  Specifies the model years of vehicle. the real value can be found in a mapping table from the development manual
     * \else
     *  车辆品牌年款 需要通过映射表得到真正的年款 映射表详见开发手册
     * \endif
     */
    public short					wVehicleYearModel;

    /**
     * \if ENGLISH_LANG
     *  Safe belt state,{@link EM_SAFE_BELT_STATE}
     * \else
     *  安全带状态,{@link EM_SAFE_BELT_STATE}
     * \endif
     */
    public int					emSafeBeltState;

    /**
     * \if ENGLISH_LANG
     *  Calling state,{@link EM_CALLING_STATE}
     * \else
     *  打电话状态,{@link EM_CALLING_STATE}
     * \endif
     */
    public int					emCallingState;

    /**
     * \if ENGLISH_LANG
     *  Attachment type,{@link EM_ATTACHMENT_TYPE}
     * \else
     *  车内饰品类型,{@link EM_ATTACHMENT_TYPE}
     * \endif
     */
    public int					emAttachMentType;

    /**
     * \if ENGLISH_LANG
     *  Car type,{@link EM_CATEGORY_TYPE}
     * \else
     *  车辆类型,{@link EM_CATEGORY_TYPE}
     * \endif
     */
    public int					emCarType;

    /**
     * \if ENGLISH_LANG
     *  parameter extension
     * \else
     *  参数扩展
     * \endif
     */
    public NET_MEDIA_QUERY_TRAFFICCAR_PARAM_EX					pstuTrafficCarParamEx = new NET_MEDIA_QUERY_TRAFFICCAR_PARAM_EX();

    /*Need Constructed Function!*/
    public MEDIA_QUERY_TRAFFICCAR_PARAM() {
    }

    public MEDIA_QUERY_TRAFFICCAR_PARAM(int nEventNum) {
        nEventTypeNum = nEventNum;
        pEventTypes = new int[nEventTypeNum];
    }
}
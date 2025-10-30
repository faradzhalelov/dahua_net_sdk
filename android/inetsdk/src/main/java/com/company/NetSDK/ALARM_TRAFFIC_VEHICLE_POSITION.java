package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Vehicle position alarm event(SDK_ALARM_TRAFFIC_VEHICLE_POSITION)
 * \else
 * 车辆位置报警事件(SDK_ALARM_TRAFFIC_VEHICLE_POSITION)
 * \endif
 */
public class ALARM_TRAFFIC_VEHICLE_POSITION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Event operation. 0=pulse event. 1=start. 2=stop
     * \else
     * 事件动作,0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public int nAction;

    /**
     * \if ENGLISH_LANG
     * Event Name
     * \else
     * 事件名称
     * \endif
     */
    public byte szEventName[] = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * Object ID
     * \else
     * 物体ID
     * \endif
     */
    public int nObjectID;

    /**
     * \if ENGLISH_LANG
     * car plate Number
     * \else
     * 车牌号
     * \endif
     */
    public byte szPlateNumber[] = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * The location of the license plate and bayonet(0:capture the distance between the bayonet and the license plate, >0:cross the snap line; <0:not over the capture line)
     * \else
     * 识别车牌与卡口抓拍线的相对距离(0为基准，表示视频抓拍卡口位置时的车牌距离；正数表示越过抓拍线；负数表示未越过抓拍线)
     * \endif
     */
    public int nPosition;

    /**
     * \if ENGLISH_LANG
     * Open status, see EM_OPEN_STROBE_STATE
     * \else
     * 开闸状态,具体请见 EM_OPEN_STROBE_STATE
     * \endif
     */
    public byte byOpenStrobeState;

    /**
     * \if ENGLISH_LANG
     * Plate confidence, [0, 255]
     * \else
     * 车牌置信度，范围[0, 255]
     * \endif
     */
    public int nPlateConfidence;

    /**
     * \if ENGLISH_LANG
     * Plate color
     * \else
     * 车牌颜色
     * \endif
     */
    public byte szPlateColor[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Plate type
     * \else
     * 车牌类型
     * \endif
     */
    public byte szPlateType[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Vehicle confidence,[0, 255]
     * \else
     * 车身置信度，范围[0, 255]
     * \endif
     */
    public int nVehicleConfidence;

    /**
     * \if ENGLISH_LANG
     * Vehicle head direction, EM_VEHICLE_HEAD_DIRECTION
     * \else
     * 车头朝向,用于抓拍时，判断当前车头是否正对着相机, EM_VEHICLE_HEAD_DIRECTION
     * \endif
     */
    public int emVehicleHeadDirection;

    /**
     * \if ENGLISH_LANG
     * Vehicle position, EM_VEHICLE_POSITION
     * \else
     * 抓拍车的位置, EM_VEHICLE_POSITION
     * \endif
     */
    public int emVehiclePosition;

    /**
     * \if ENGLISH_LANG
     * Driving direction, EM_VEHICLE_DRIVING_DIRECTION
     * \else
     * 车辆行驶方向(相对车道方向), EM_VEHICLE_DRIVING_DIRECTION
     * \endif
     */
    public int emDrivingDirection;

}

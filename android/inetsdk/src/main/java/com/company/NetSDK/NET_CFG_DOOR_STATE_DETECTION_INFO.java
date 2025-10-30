package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Rule configuration corresponding to EVENT INVS DOOR STATE DETECTION (door opening and closing detection event)
 * \else
 * @brief EVENT_IVS_DOOR_STATE_DETECTION(开关门检测事件)对应的规则配置
 * \endif
 */
public class NET_CFG_DOOR_STATE_DETECTION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Rule name, different rules cannot have duplicate names
     * \else
     *  规则名称,不同规则不能重名
     * \endif
     */
    public byte					szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Rule Enabling
     * \else
     *  规则使能
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  Number of corresponding object types
     * \else
     *  相应物体类型个数
     * \endif
     */
    public int					nObjectTypeNum;

    /**
     * \if ENGLISH_LANG
     *  List of corresponding object types
     * \else
     *  相应物体类型列表
     * \endif
     */
    public byte					szObjectTypes[][] = new byte[16][128];

    /**
     * \if ENGLISH_LANG
     *  Alarm linkage
     * \else
     *  报警联动
     * \endif
     */
    public NET_ALARM_MSG_HANDLE					stuEventHandler = new NET_ALARM_MSG_HANDLE();

    /**
     * \if ENGLISH_LANG
     *  Pan tilt preset point numbers 0~65535
     * \else
     *  云台预置点编号  0~65535
     * \endif
     */
    public int					nPtzPresetId;

    /**
     * \if ENGLISH_LANG
     *  Number of linked businesses
     * \else
     *  联动业务个数
     * \endif
     */
    public int					nLink;

    /**
     * \if ENGLISH_LANG
     *  Linkage business category options
     * \else
     *  联动业务大类选项
     * \endif
     */
    public NET_LINK_CLASS_TYPE					stuLinkClassType[] = new NET_LINK_CLASS_TYPE[16];

    /**
     * \if ENGLISH_LANG
     *  Enable tracking condition rules
     * \else
     *  跟踪条件规则使能
     * \endif
     */
    public boolean					bTrackEnable;

    /**
     * \if ENGLISH_LANG
     *  Number of top points in the detection area
     * \else
     *  检测区顶点数
     * \endif
     */
    public int					nDetectRegionNum;

    /**
     * \if ENGLISH_LANG
     *  detection zone
     * \else
     *  检测区
     * \endif
     */
    public NET_POINT_EX					stuDetectRegion[] = new NET_POINT_EX[20];

    /**
     * \if ENGLISH_LANG
     *  Auxiliary line (two points)
     * \else
     *  辅助线（两点)
     * \endif
     */
    public NET_POINT_EX					stuDetectLine[] = new NET_POINT_EX[2];

    /**
     * \if ENGLISH_LANG
     *  Rule specific size filters
     * \else
     *  规则特定的尺寸过滤器
     * \endif
     */
    public NET_CFG_SIZEFILTER_INFO					stuSizeFilter = new NET_CFG_SIZEFILTER_INFO();

    /**
     * \if ENGLISH_LANG
     *  Is the auxiliary line enabled. Corresponding to DetectLine.
     * \else
     *  是否开启辅助线。对应DetectLine。
     * \endif
     */
    public boolean					bDetectLineEnable;

    /**
     * \if ENGLISH_LANG
     *  Is door opening and closing abnormal detection enabled
     * \else
     *  是否开启开关门异常检测
     * \endif
     */
    public boolean					bDSEnable;

    /**
     * \if ENGLISH_LANG
     *  Is the door opening time too long detected
     * \else
     *  是否开启开门时间过长检测	
     * \endif
     */
    public boolean					bODEnable;

    /**
     * \if ENGLISH_LANG
     *  Minimum duration, in seconds (5s-60s)
     * \else
     *  最短持续时间, 单位:秒(5s-60s)
     * \endif
     */
    public int					nMinDuration;

    /**
     * \if ENGLISH_LANG
     *  Repeated alarm time, unit: seconds, range 0-3600
     * \else
     *  重复报警时间，单位：秒，范围0-3600
     * \endif
     */
    public int					nRepeatAlarmTime;

    /**
     * \if ENGLISH_LANG
     *  Sensitivity, the smaller the value, the lower the sensitivity, ranging from 1 to 10
     * \else
     *  灵敏度, 值越小灵敏度越低, 取值1-10
     * \endif
     */
    public int					nSensitivity;

    /**
     * \if ENGLISH_LANG
     *  Detect the status of the door, with 1 indicating the opening status and 0 indicating the closing status
     * \else
     *  检测门的状态，开门状态1表示，关门状态0表示
     * \endif
     */
    public int					nDoorState;

    /**
     * \if ENGLISH_LANG
     *  Opening the door for too long time/s, minimum 10s
     * \else
     *  开门过长时间/s,最小10s
     * \endif
     */
    public int					nLongTime;

    /**
     * \if ENGLISH_LANG
     *  The alarm for the door status is specified within a specified time period. If the door is opened or closed abnormally during the specified time period, an alarm is generated
     * \else
     *  门状态的报警指定时间段，在指定时间段开门或关门为异常，产生报警
     * \endif
     */
    public NET_CFG_TIME_SCHEDULE					stuDSTimeSection = new NET_CFG_TIME_SCHEDULE();

    /**
     * \if ENGLISH_LANG
     *  An alarm is generated when the door is opened for a specified time period and reaches LongTime
     * \else
     *  开门状态的报警指定时间段，在指定时间段开门达到LongTime，产生报警
     * \endif
     */
    public NET_CFG_TIME_SCHEDULE					stuODTimeSection = new NET_CFG_TIME_SCHEDULE();

    public NET_CFG_DOOR_STATE_DETECTION_INFO() {
        for(int i = 0; i < 16; i ++){
            stuLinkClassType[i] = new NET_LINK_CLASS_TYPE();
        }
        for(int i = 0; i < 20; i ++){
            stuDetectRegion[i] = new NET_POINT_EX();
        }
        for(int i = 0; i < 2; i ++){
            stuDetectLine[i] = new NET_POINT_EX();
        }
    }
}
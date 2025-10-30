package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record Information Type
 * \else
 * 记录集信息类型
 * \endif
 */
public class EM_NET_RECORD_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int NET_RECORD_UNKNOWN = 0;

	/**
	 * \if ENGLISH_LANG
	 * Traffic allow list account record, search criteria corresponding to {@link FIND_RECORD_TRAFFICREDLIST_CONDITION}, record info corresponding to {@link NET_TRAFFIC_LIST_RECORD}
	 * \else
	 * 交通允许名单账户记录,查询条件对应结构体 {@link FIND_RECORD_TRAFFICREDLIST_CONDITION},记录信息对应结构体 {@link NET_TRAFFIC_LIST_RECORD}
	 * \endif
	 */
    public static final int NET_RECORD_TRAFFICREDLIST = 1;                     
    
    /**
     * \if ENGLISH_LANG
     * Traffic block list account record, search criteria corresponding to {@link FIND_RECORD_TRAFFICREDLIST_CONDITION}, record info corresponding to {@link NET_TRAFFIC_LIST_RECORD}
     * \else
     * 交通禁止名单账号记录,查询条件对应结构体 {@link FIND_RECORD_TRAFFICREDLIST_CONDITION},记录信息对应结构体 {@link NET_TRAFFIC_LIST_RECORD}
     * \endif
     */
    public static final int NET_RECORD_TRAFFICBLACKLIST = 2;                       
    
    /**
     * \if ENGLISH_LANG
     * burning case record, search criteria corresponding to  {@link FIND_RECORD_BURN_CASE_CONDITION}, record info corresponding to {@link NET_BURN_CASE_INFO}
     * \else
     * 刻录案件记录,查询条件对应结构体 {@link FIND_RECORD_BURN_CASE_CONDITION},记录信息对应结构体 {@link NET_BURN_CASE_INFO}
     * \endif
     */
    public static final int NET_RECORD_BURN_CASE = 3;                       
    
    /**
     * \if ENGLISH_LANG
     * access control card, search criteria corresponding to {@link FIND_RECORD_ACCESSCTLCARD_CONDITION}, record info corresponding to {@link NET_RECORDSET_ACCESS_CTL_CARD}
     * \else
     * 门禁卡,查询条件对应结构体 {@link FIND_RECORD_ACCESSCTLCARD_CONDITION},记录信息对应结构体{@link NET_RECORDSET_ACCESS_CTL_CARD}
     * \endif
     */
    public static final int NET_RECORD_ACCESSCTLCARD = 4;                     
    
    /**
     * \if ENGLISH_LANG
     * access control password, search criteria corresponding to {@link FIND_RECORD_ACCESSCTLPWD_CONDITION}, record info corresponding to {@link NET_RECORDSET_ACCESS_CTL_PWD}
     * \else
     * 门禁密码,查询条件对应结构体 {@link FIND_RECORD_ACCESSCTLPWD_CONDITION},记录信息对应结构体{@link NET_RECORDSET_ACCESS_CTL_PWD}
     * \endif
     */
    public static final int NET_RECORD_ACCESSCTLPWD = 5;                            
    
    /**
     * \if ENGLISH_LANG
     * access control in/out record, search criteria corresponding to {@link FIND_RECORD_ACCESSCTLCARDREC_CONDITION}, record info corresponding to {@link NET_RECORDSET_ACCESS_CTL_CARDREC}
     * \else
     * 门禁出入记录,必须同时按卡号和时间段查询,建议用{@link EM_NET_RECORD_TYPE#NET_RECORD_ACCESSCTLCARDREC_EX}查询
     * 查询条件对应结构体 {@link FIND_RECORD_ACCESSCTLCARDREC_CONDITION},记录信息对应结构体 {@link NET_RECORDSET_ACCESS_CTL_CARDREC}
     * \endif
     */
    public static final int NET_RECORD_ACCESSCTLCARDREC = 6;                   
    
    /**
     * \if ENGLISH_LANG
     * holiday record set, search criteria corresponding to {@link FIND_RECORD_ACCESSCTLHOLIDAY_CONDITION}, record info corresponding to {@link NET_RECORDSET_HOLIDAY}
     * \else
     * 假日记录集,查询条件对应结构体 {@link FIND_RECORD_ACCESSCTLHOLIDAY_CONDITION},记录信息对应结构体 {@link NET_RECORDSET_HOLIDAY}
     * \endif
     */
    public static final int NET_RECORD_ACCESSCTLHOLIDAY = 7;                       
    
    /**
     * \if ENGLISH_LANG
     * search Traffic flow record, search criteria corresponding to {@link FIND_RECORD_TRAFFICFLOW_CONDITION}, record info corresponding to {@link NET_RECORD_TRAFFIC_FLOW_STATE}
     * \else
     * 查询交通流量记录,查询条件对应结构体 {@link FIND_RECORD_TRAFFICFLOW_CONDITION},记录信息对应结构体 {@link NET_RECORD_TRAFFIC_FLOW_STATE}
     * \endif
     */
    public static final int NET_RECORD_TRAFFICFLOW_STATE = 8;                 
    
    /**
     * \if ENGLISH_LANG
     * call record , search criteria corresponding to {@link FIND_RECORD_VIDEO_TALK_LOG_CONDITION}, record info corresponding to {@link NET_RECORD_VIDEO_TALK_LOG}
     * \else
     * 通话记录,查询条件对应结构体 {@link FIND_RECORD_VIDEO_TALK_LOG_CONDITION},记录信息对应结构体 {@link NET_RECORD_VIDEO_TALK_LOG}
     * \endif
     */
    public static final int NET_RECORD_VIDEOTALKLOG = 9;                    
    
    /**
     * \if ENGLISH_LANG
     * status record, search criteria corresponding to  {@link FIND_RECORD_REGISTER_USER_STATE_CONDITION}, record info corresponding to {@link NET_RECORD_REGISTER_USER_STATE}
     * \else
     * 状态记录,查询条件对应结构体 {@link FIND_RECORD_REGISTER_USER_STATE_CONDITION},记录信息对应结构体 {@link NET_RECORD_REGISTER_USER_STATE}
     * \endif
     */
    public static final int NET_RECORD_REGISTERUSERSTATE = 10;                    
    
    /**
     * \if ENGLISH_LANG
     * contact record , search criteria corresponding to {@link FIND_RECORD_VIDEO_TALK_CONTACT_CONDITION}, record info corresponding to {@link NET_RECORD_VIDEO_TALK_CONTACT}
     * \else
     * 联系人记录,查询条件对应结构体 {@link FIND_RECORD_VIDEO_TALK_CONTACT_CONDITION},记录信息对应结构体 {@link NET_RECORD_VIDEO_TALK_CONTACT}
     * \endif
     */
    public static final int NET_RECORD_VIDEOTALKCONTACT = 11;                   

    /**
     * \if ENGLISH_LANG
     * annountcement record, search criteria corresponding to {@link FIND_RECORD_ANNOUNCEMENT_CONDITION}, record info corresponding to {@link NET_RECORD_ANNOUNCEMENT_INFO}
     * \else
     * 公告记录,查询条件对应结构体 {@link FIND_RECORD_ANNOUNCEMENT_CONDITION},记录信息对应结构体 {@link NET_RECORD_ANNOUNCEMENT_INFO}
     * \endif
     */
	public static final int NET_RECORD_ANNOUNCEMENT = 12;						
														
	/**
	 * \if ENGLISH_LANG
	 * alarm record, search criteria corresponding to {@link FIND_RECORD_ALARMRECORD_CONDITION}, record info corresponding to {@link NET_RECORD_ALARMRECORD_INFO}
	 * \else
	 * 报警记录,查询条件对应结构体 {@link FIND_RECORD_ALARMRECORD_CONDITION},记录信息对应结构体 {@link NET_RECORD_ALARMRECORD_INFO}
	 * \endif
	 */													
	public static final int NET_RECORD_ALARMRECORD = 13;				
														
	/**
	 * \if ENGLISH_LANG
	 * Issue commodiy record, search criteria corresponding to {@link FIND_RECORD_COMMODITY_NOTICE_CONDITION}, record info corresponding to {@link NET_RECORD_COMMODITY_NOTICE}
	 * \else
	 * 下发商品记录,查询条件对应结构体 {@link FIND_RECORD_COMMODITY_NOTICE_CONDITION},记录信息对应结构体 {@link NET_RECORD_COMMODITY_NOTICE}
	 * \endif
	 */
    public static final int NET_RECORD_COMMODITYNOTICE = 14;                 
      
    /**
     * \if ENGLISH_LANG
     * Medical info, search criteria corresponding to {@link FIND_RECORD_HEALTH_CARE_NOTICE_CONDITION}, record info corresponding to {@link NET_RECORD_HEALTH_CARE_NOTICE}
     * \else
     * 就诊信息记录,查询条件对应结构体 {@link FIND_RECORD_HEALTH_CARE_NOTICE_CONDITION},记录信息对应结构体 {@link NET_RECORD_HEALTH_CARE_NOTICE}
     * \endif
     */
    public static final int NET_RECORD_HEALTHCARENOTICE = 15;                     

    /**
     * \if ENGLISH_LANG
     * access entry-exit record, can select some critera to search. Please replace {@link EM_NET_RECORD_TYPE#NET_RECORD_ACCESSCTLCARDREC}
     * search criteria corresponding to {@link FIND_RECORD_ACCESSCTLCARDREC_CONDITION_EX}, record info corresponding to {@link NET_RECORDSET_ACCESS_CTL_CARDREC}
     * \else
     * 门禁出入记录(可选择部分条件查询, 建议替代{@link EM_NET_RECORD_TYPE#NET_RECORD_ACCESSCTLCARDREC})
     * 查询条件对应结构体 {@link FIND_RECORD_ACCESSCTLCARDREC_CONDITION_EX},记录信息对应结构体 {@link NET_RECORDSET_ACCESS_CTL_CARDREC}
     * \endif
     */
    public static final int NET_RECORD_ACCESSCTLCARDREC_EX = 16;                                      

    /**
     * \if ENGLISH_LANG
     * GPS position information reocrd, support import and clear only, record info corresponding to {@link NET_RECORD_GPS_LOCATION_INFO}
     * \else
     * GPS位置信息记录, 只实现import和clear,记录信息对应结构体 {@link NET_RECORD_GPS_LOCATION_INFO}
     * \endif
     */
    public static final int NET_RECORD_GPS_LOCATION = 17;             

    /**
     * \if ENGLISH_LANG
     * resident info, search criteria corresponding to {@link FIND_RECORD_RESIDENT_CONDTION}, record info corresponding to {@link NET_RECORD_RESIDENT_INFO}
     * \else
     * 公租房租户信息,查询条件对应结构体 {@link FIND_RECORD_RESIDENT_CONDTION},记录信息对应结构体 {@link NET_RECORD_RESIDENT_INFO}
     * \endif
     */
	public static final int NET_RECORD_RESIDENT = 18;                                										

	/**
	 * \if ENGLISH_LANG
	 * sensor record, search criteria corresponding to {@link FIND_RECORD_SENSORRECORD_CONDITION}, record info corresponding to {@link NET_RECORD_SENSOR_RECORD}
	 * \else
	 * 监测量数据记录, 查询条件对应 结构体{@link FIND_RECORD_SENSORRECORD_CONDITION},记录信息对应结构体 {@link NET_RECORD_SENSOR_RECORD}
	 * \endif
	 */
	public static final int NET_RECORD_SENSORRECORD = 19;                           									
	
	/**
	 * \if ENGLISH_LANG
	 * AccessQRCode record , record info corresponding to {@link NET_RECORD_ACCESSQRCODE_INFO}
	 * \else
	 * 开门二维码记录集, 记录信息对应 结构体 {@link NET_RECORD_ACCESSQRCODE_INFO}
	 * \endif
	 */
	public static final int NET_RECORD_ACCESSQRCODE = 20;

	/**
	 * \if ENGLISH_LANG
	 * lectronic tag info record, Search criteria corresponding to structure {@link FIND_RECORD_ELECTRONICSTAG_CONDITION}, Record info corresponding to {@link NET_RECORD_ELECTRONICSTAG_INFO}
	 * \else
	 * 电子车牌查询, 查询条件对应 {@link FIND_RECORD_ELECTRONICSTAG_CONDITION} 结构体, 记录信息对应 {@link NET_RECORD_ELECTRONICSTAG_INFO} 结构体
	 * \endif
	 */
	public static final int NET_RECORD_ELECTRONICSTAG = 21;

	/**
	 * \if ENGLISH_LANG
	 * Access blue tooth record, Record info corresponding to structure {@link NET_RECORD_ACCESS_BLUETOOTH_INFO}
	 * \else
	 * 蓝牙开门记录集, 记录信息对应 {@link NET_RECORD_ACCESS_BLUETOOTH_INFO} 结构体
	 * \endif
	 */
	public static final int NET_RECORD_ACCESS_BLUETOOTH = 22;

	/**
	 * \if ENGLISH_LANG
	 * VTO device push information record, Record info corresponding to structure {@link NET_RECORD_ACCESS_MOBILE_PUSH_RESULT_INFO}
	 * \else
	 * VTO设备推送信息记录, 记录信息对应 {@link NET_RECORD_ACCESS_MOBILE_PUSH_RESULT_INFO} 结构体
	 * \endif
	 */
	public static final int NET_RECORD_ACCESS_MOBILE_PUSH_RESULT = 26;

}

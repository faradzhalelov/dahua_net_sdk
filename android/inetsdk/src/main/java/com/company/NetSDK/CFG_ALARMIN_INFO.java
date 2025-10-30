package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * External Alarm Configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_ALARMINPUT}
 * \else
 * 外部报警配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_ALARMINPUT}
 * \endif
 */
public class CFG_ALARMIN_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Channel No.(0 Start) 
	 * \else
	 * 报警通道号(0开始)
	 * \endif
	 */
	public int					nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable Switch 
	 * \else
	 * 使能开关
	 * \endif
	 */
	public boolean				bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Channel Name 
	 * \else
	 * 报警通道名称
	 * \endif
	 */
	public byte					szChnName[] = new byte[FinalVar.MAX_CHANNELNAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Sensor Name. 0:Normal Closed,1:Normal Open
	 * \else
	 * 报警器类型,0:常闭,1:常开
	 * \endif
	 */
	public int					nAlarmType;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Linkage 
	 * \else
	 * 报警联动
	 * \endif
	 */
	public CFG_ALARM_MSG_HANDLE stuEventHandler = new CFG_ALARM_MSG_HANDLE();
	
	/**
	 * \if ENGLISH_LANG
	 * Event Respond Time Section 
	 * \else
	 * 事件响应时间段
	 * \endif
	 */
	public CFG_TIME_SECTION		stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT];

	public boolean				abDevID;
	
	/**
	 * \if ENGLISH_LANG
	 * device ID 
	 * \else
	 * 设备ID
	 * \endif
	 */
	public byte					szDevID[] = new byte[FinalVar.MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * sensor trigger mode, 0: highly effective，1 low effective; sensor grounding or power，and group with nAlarmType 
	 * \else
	 * 传感器触发模式, 0:高有效,1低有效; 具体表现为传感器接地or电源,与nAlarmType组合使用
	 * \endif
	 */
	public int                  nPole;                                      
	                                                                
	/**
	 * \if ENGLISH_LANG
	 * sensor type, refer to {@link EM_SENSE_METHOD}
	 * \else
	 * 传感器感应方式, 取值参考 {@link EM_SENSE_METHOD}
	 * \endif
	 */
	public int				     emSense;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm enable control, refer to {@link EM_CTRL_ENABLE}
	 * \else
	 * 报警使能控制方式, 取值参考 {@link EM_CTRL_ENABLE}
	 * \endif
	 */
	public int                   emCtrl;
	
	/**
	 * \if ENGLISH_LANG
	 * delay disarm , in s,0~300,emCtrl value is {@link EM_CTRL_ENABLE#EM_CTRL_NORMAL} or {@link EM_CTRL_ENABLE#EM_CTRL_ALWAYS_EN} effective
	 * \else
	 * 延时撤防时间,单位为秒,0~300,emCtrl 值为 {@link EM_CTRL_ENABLE#EM_CTRL_NORMAL} 或 {@link EM_CTRL_ENABLE#EM_CTRL_ALWAYS_EN} 时有效.
	 * \endif
	 */
	public int                  nDisDelay;     
	
	/**
	 * \if ENGLISH_LANG
	 * DefenceArea Type , Specific Types Supported by Querying the Ability to Obtain, refer to {@link EM_CFG_DEFENCEAREATYPE}
	 * \else
	 * 防区类型, 具体支持的类型通过查询能力获得, 取值参考 {@link EM_CFG_DEFENCEAREATYPE}
	 * \endif 
	 */
	public int 					emDefenceAreaType;
	
	/**
	 * \if ENGLISH_LANG
	 * Delay Protection Time, DefenceArea Type is"Delay"(Delay DefenceArea)is Effective, Unit: Second,  Maximum Time by Querying the Ability to Obtain
	 * \else
	 * 延时布防时间, 防区类型为"Delay"(延时防区)时才有效, 单位: 秒, 最大时间通过查询能力获得    
	 * \endif 
	 */
	public int					nEnableDelay;
	
	/**
	 * \if ENGLISH_LANG
	 * Root address, -1 means invalid, 0 means local channel, 1 means connect to 1st serial extension channel, 2, 3...and so on
	 * \else
	 * 根地址, -1表示无效, 0表示本地通道, 1表示连接在第一个串口上的扩展通道, 2、3...以此类推
	 * \endif 
	 */
    public int                  nSlot; 
    
    /**
	 * \if ENGLISH_LANG
	 * 1st level cascading address, means connection to no.nSlot serial no.nLevel 1 detector or meter, -1 means invalid, from 0
	 * \else
	 * 第一级级联地址, 表示连接在第nSlot串口上的第nLevel1个探测器或仪表, -1表示无效, 从0开始
	 * \endif 
	 */
    public int                  nLevel1; 
   
    /**
	 * \if ENGLISH_LANG
	 *  Means if nLevel2 text exists
	 * \else
	 * 表示nLevel2字段是否存在
	 * \endif 
	 */
    public boolean              abLevel2; 
    
    /**
   	 * \if ENGLISH_LANG
   	 *  2rd level cascading address, means connected to no. nLevel1 meter's detector no., -1 means invalid, from 0
   	 * \else
   	 * 第二级级联地址, 表示连接在第nLevel1个的仪表上的探测器序号, -1表示无效, 从0开始
   	 * \endif 
   	 */
    public int                  nLevel2;
		
	public CFG_ALARMIN_INFO() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}

	@Override
	public String toString() {
		return "CFG_ALARMIN_INFO{" +
				"nChannelID=" + nChannelID +
				", bEnable=" + bEnable +
				", szChnName=" + Arrays.toString(szChnName) +
				", nAlarmType=" + nAlarmType +
				", stuEventHandler=" + stuEventHandler +
				", stuTimeSection=" + Arrays.toString(stuTimeSection) +
				", abDevID=" + abDevID +
				", szDevID=" + Arrays.toString(szDevID) +
				", nPole=" + nPole +
				", emSense=" + emSense +
				", emCtrl=" + emCtrl +
				", nDisDelay=" + nDisDelay +
				", emDefenceAreaType=" + emDefenceAreaType +
				", nEnableDelay=" + nEnableDelay +
				", nSlot=" + nSlot +
				", nLevel1=" + nLevel1 +
				", abLevel2=" + abLevel2 +
				", nLevel2=" + nLevel2 +
				'}';
	}
}

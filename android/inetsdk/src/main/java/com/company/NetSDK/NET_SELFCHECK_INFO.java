package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * device self-check info 
 * \else
 * 设备自检信息
 * \endif
 */
public class NET_SELFCHECK_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * alarm input channel number
	 * \else
	 * 报警输入通道数
	 * \endif
	 */
	public int               nAlarmIn;                 
	
	/**
	 * \if ENGLISH_LANG
	 * alarm output channel number   
	 * \else
	 * 报警输出通道数  
	 * \endif
	 */
	public int               nAlarmOut;                
	
	/**
	 * \if ENGLISH_LANG
	 * report time  
	 * \else
	 * 上报时间
	 * \endif
	 */
	public NET_TIME          stuTime = new NET_TIME();                  
	
	/**
	 * \if ENGLISH_LANG
	 * plate  
	 * \else
	 * 车牌
	 * \endif
	 */
    public byte              szPlateNo[] = new byte[FinalVar.SDK_MAX_PLATE_NUMBER_LEN]; 
    
	/**
	 * \if ENGLISH_LANG
	 * SIM card no.
	 * \else
	 * SIM卡号
	 * \endif
	 */
    public byte              szICCID[] = new byte[FinalVar.SDK_MAX_SIM_LEN];  
    
	/**
	 * \if ENGLISH_LANG
	 * position status,0-not position, 1-position   
	 * \else
	 * 定位状态，0-未定位，1-定位 
	 * \endif
	 */
    public byte              byOrientation;            
    
	/**
	 * \if ENGLISH_LANG
	 * ACC status,0-close 1-open  
	 * \else
	 * 未知 ACC 状态，0-关闭，1-打开
	 * \endif
	 */
    public byte              byACCState;              
    
	/**
	 * \if ENGLISH_LANG
	 * power on,0-normal, 1-disconnect, 2-less pressure, 3-over pressure  
	 * \else
	 * 常电状态，0-正常连接，1-断开，2-欠压，3-高压
	 * \endif
	 */
    public byte              byConstantElecState;      
    
	/**
	 * \if ENGLISH_LANG
	 * channel signal status, 0-normal, 1-unknown failure, 2-disaonnect, 3-short circuit  
	 * \else
	 * 通信信号状态，0-正常，1-未知故障，2-未接，3-短路
	 * \endif
	 */
    public byte              byAntennaState;           
    
    // 外部设备状态
	/**
	 * \if ENGLISH_LANG
	 * station announcer status, 0-disconnect, 1-normal, 2-abnormal  
	 * \else
	 * 报站器状态，0-未接，1-正常，2-异常
	 * \endif
	 */
    public byte              byReportStation;          
	/**
	 * \if ENGLISH_LANG
	 * dispatch status, 0-disconnect, 1-normal, 2-abnormal  
	 * \else
	 * 调度屏状态，0-未接，1-正常，2-异常
	 * \endif
	 */
    public byte              byControlScreen;          
    
	/**
	 * \if ENGLISH_LANG
	 * POS status, 0-disconnect, 1-normal, 2-abnormal  
	 * \else
	 * POS机状态，0-未接，1-正常，2-异常
	 * \endif
	 */
    public byte              byPOS;                    
    
	/**
	 * \if ENGLISH_LANG
	 * box status, 0-disconnect, 1-normal, 2-abnormal  
	 * \else
	 * 投币箱状态，0-未接，1-正常，2-异常
	 * \endif
	 */
    public byte              byCoinBox;                
    
    // 能力集
	/**
	 * \if ENGLISH_LANG
	 * schedule snapshot, TRUE-support, FALSE-not support  
	 * \else
	 * 定时抓图，TRUE-支持，FALSE-不支持
	 * \endif
	 */
    public boolean              bTimerSnap;               
    
	/**
	 * \if ENGLISH_LANG
	 * e-fence, TRUE-support, FALSE-not support  
	 * \else
	 * 电子围栏，TRUE-支持，FALSE-不支持
	 * \endif
	 */
    public boolean              bElectronEnclosure;       
    
	/**
	 * \if ENGLISH_LANG
	 * remote upgrade, TRUE-support, FALSE-not support     
	 * \else
	 * 远程升级，TRUE-支持，FALSE-不支持   
	 * \endif
	 */
    public boolean              bTeleUpgrade;             
    
	/**
	 * \if ENGLISH_LANG
	 * HDD status  
	 * \else
	 * 硬盘状态
	 * \endif
	 */
    public NET_HDD_STATE     stuHddStates[] = new NET_HDD_STATE[FinalVar.SDK_MAX_DISKNUM]; 
    
	/**
	 * \if ENGLISH_LANG
	 * HDD quantity  
	 * \else
	 * 硬盘个数
	 * \endif
	 */
    public int               nHddNum;                  
    
	/**
	 * \if ENGLISH_LANG
	 * AttachMission interface,channel status is a group, memory is applied by sdk internally, released by sdk intenally
	 * GetSelfCheckInfo interface, output param, memory is applied by the user, apply to sizeof(NET_CHANNLE_STATE)*nChannelMax  
	 * \else
	 * 通道状态，是一个数组， 
     * AttachMission接口，NET_MISSION_TYPE_SELFCHECK类型，回调函数，内存由SDK申请，SDK释放
     * GetSelfCheckInfo接口，出参，内存由用户申请，用户释放
	 * \endif
	 */
    public NET_CHANNLE_STATE pChannleState[];           
    
	/**
	 * \if ENGLISH_LANG
	 * channel quantity  
	 * \else
	 * 实际上报的通道个数
	 * \endif
	 */
    public int               nChannleNum;              
    
	/**
	 * \if ENGLISH_LANG
	 * pChannleState max counts mallcoed by caller  
	 * \else
	 * pChannleState内存的最大NET_CHANNLE_STATE个数
	 * \endif
	 */
    public int               nChannelMax;              
    
	/**
	 * \if ENGLISH_LANG
	 * PAD/DVR connection state, refer to {@link NET_PAD_CONNECT_STATE}
	 * \else
	 * PAD/DVR连接状态， 取值参考 {@link NET_PAD_CONNECT_STATE}
	 * \endif
	 */
    public int               emConnState;  
    
	/**
	 * \if ENGLISH_LANG
	 * Home key state , refer to {@link NET_HOME_STATE}
	 * \else
	 * Home键状态, 取值参考 {@link NET_HOME_STATE}
	 * \endif
	 */
    public int               emHomeState;  
    
    public NET_SELFCHECK_INFO(int nChnMaxNum) {
    	for (int i = 0; i < FinalVar.SDK_MAX_DISKNUM; i++) {
    		stuHddStates[i] = new NET_HDD_STATE();
    	}
    	
    	this.nChannelMax = nChnMaxNum;
    	pChannleState = new NET_CHANNLE_STATE[nChnMaxNum];
    	for (int i = 0; i < nChnMaxNum; i++) {
    		pChannleState[i] = new NET_CHANNLE_STATE();
    	}
    }
}

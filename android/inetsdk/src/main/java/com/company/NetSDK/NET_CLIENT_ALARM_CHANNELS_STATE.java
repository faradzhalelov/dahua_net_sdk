package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm channel state, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE}
 * \else
 * 报警通道状态, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE}
 * \endif
 */
public class NET_CLIENT_ALARM_CHANNELS_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The type of query alarm channel, refer to {@link NET_ALARM_CHANNEL_TYPE}
	 * \else
	 * 查询报警通道的类型, 取值参考 {@link NET_ALARM_CHANNEL_TYPE}
	 * \endif
	 */
	public int                         emType;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm input number, specified by the user 
	 * \else
	 * 报警输入个数，由用户指定
	 * \endif
	 */
	public int                         nAlarmInCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The number of returned alarm input 
	 * \else
	 * 报警输入个数，由用户指定
	 * \endif
	 */
	public int                         nAlarmInRetCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm state of input arrays, memory allocated by the user, each element represents a channel status, TRUE for input, FALSE for no input 
	 * \else
	 * 报警输入状态数组，由用户分配内存，每个元素表示一个通道状态,TRUE为有输入,FALSE为无输入
	 * \endif
	 */
	public boolean                     pbAlarmInState[];
	
	/**
	 * \if ENGLISH_LANG
	 * The number of alarm output,specified by the user 
	 * \else
	 * 报警输出个数，由用户指定
	 * \endif
	 */
    public int                         nAlarmOutCount;
    
    /**
     * \if ENGLISH_LANG
     * The number of alarm output 
     * \else
     * 报警输出个数
     * \endif
     */
    public int                         nAlarmOutRetCount;
    
    /**
     * \if ENGLISH_LANG
     * Alarm state of output arrays, memory allocated by the user, each element represents a channel status, TRUE for output, FALSE for no output 
     * \else
     * 报警输出状态数组，由用户分配内存，每个元素表示一个通道状态,TRUE为有输出,FALSE为输出
     * \endif
     */
    public boolean                     pbAlarmOutState[];
    
    /**
     * \if ENGLISH_LANG
     * Alarm Number,specified by the user 
     * \else
     * 警号个数，由用户指定
     * \endif
     */
    public int                         nAlarmBellCount;
    
    /**
     * \if ENGLISH_LANG
     * Returned Alarm Number 
     * \else
     * 警号返回个数
     * \endif
     */
    public int                         nAlarmBellRetCount;
    
    /**
     * \if ENGLISH_LANG
     * Alarm state array, allocate memory by the user, each element represents a channel status, TRUE for output, FALSE for no output
     * \else
     * 警号状态数组，由用户分配内存，每个元素表示一个通道状态,TRUE为有输出,FALSE为无输出
     * \endif
     */
    public boolean                     pbAlarmBellState[];
    
    /**
     * \if ENGLISH_LANG
     * Extension module alarm input number, specified by the user 
     * \else
     * 扩展模块报警输入个数，由用户指定
     * \endif
     */
    public int                         nExAlarmInCount;
    
    /**
     * \if ENGLISH_LANG
     * The number of returned extension module alarm input 
     * \else
     * 扩展模块报警输入返回个数
     * \endif
     */
    public int                         nExAlarmInRetCount;
    
    /**
     * \if ENGLISH_LANG
     * Extension module alarm input state array，Memory allocated by the user, each element represents a channel status, TRUE for output, FALSE for no output 
     * \else
     * 扩展模块报警输入状态数组，由用户分配内存，每个元素表示一个通道状态,TRUE为有输出,FALSE为无输出
     * \endif
     */
    public boolean                     pbExAlarmInState[];
    
    /**
     * \if ENGLISH_LANG
     * The location of the extension module alarm input effective channels 
     * \else
     * 扩展模块报警输入有效通道的位置
     * \endif
     */
    public int                         pnExAlarmInDestionation[];
    
    /**
     * \if ENGLISH_LANG
     * Extension module alarm output number, specified by the user
     * \else
     * 扩展模块报警输出个数，由用户指定
     * \endif
     */
    public int                         nExAlarmOutCount;
    
    /**
     * \if ENGLISH_LANG
     * Extension module alarm output number 
     * \else
     * 扩展模块报警输出个数
     * \endif
     */
    public int                         nExAlarmOutRetCount;
    
    /**
     * \if ENGLISH_LANG
     * Extension module alarm output state array，Memory allocated by the user, each element represents a channel status, TRUE for output, FALSE for no output 
     * \else
     * 扩展模块报警输出状态数组，由用户分配内存，每个元素表示一个通道状态,TRUE为有输出,FALSE为无输出
     * \endif
     */
    public boolean                     pbExAlarmOutState[];
    
    /**
     * \if ENGLISH_LANG
     * The location of the extension module alarm output effective channels
     * \else
     * 扩展模块报警输出有效通道的位置
     * \endif
     */
    public int                         pnExAlarmOutDestionation[];

	public NET_CLIENT_ALARM_CHANNELS_STATE(int nAlarmInCount, int nAlarmOutCount, int nAlarmBellCount, int nExAlarmInCount, int nExAlarmOutCount) {
		this.nAlarmInCount = nAlarmInCount;
		pbAlarmInState = new boolean[nAlarmInCount];

		this.nAlarmOutCount = nAlarmOutCount;
		pbAlarmOutState = new boolean[nAlarmOutCount];

		this.nAlarmBellCount = nAlarmBellCount;
		pbAlarmBellState = new boolean[nAlarmBellCount];

		this.nExAlarmInCount = nExAlarmInCount;
		pbExAlarmInState = new boolean[nExAlarmInCount];
		pnExAlarmInDestionation = new int[nExAlarmInCount];

		this.nExAlarmOutCount = nExAlarmOutCount;
		pbExAlarmOutState = new boolean[nExAlarmOutCount];
		pnExAlarmOutDestionation = new int[nExAlarmOutCount];
	}
}

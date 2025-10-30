package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The state of the alarm output channel configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_ALARMOUT}
 * \else
 * 报警输出通道的状态的配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_ALARMOUT}
 * \endif
 */
public class CFG_ALARMOUT_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm channel number (from zero)
	 * \else
	 * 报警通道号(0开始)
	 * \endif
	 */
	public int					nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm channel name
	 * \else
	 * 报警通道名称
	 * \endif
	 */
	public byte				szChnName[] = new byte[FinalVar.MAX_CHANNELNAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Output types, user-defined
	 * \else
	 * 输出类型, 用户自定义
	 * \endif
	 */
	public byte				szOutputType[] = new byte[FinalVar.MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Output mode, 0 - automatic alarm 1 - Forced Alarm 2 - Turn off the alarm
	 * \else
	 * 输出模式, 0-自动报警, 1-强制报警, 2-关闭报警
	 * \endif
	 */
	public int					nOutputMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Pulse mode output time, unit is second(0-255s)
	 * \else
	 * 脉冲模式输出时间, 单位为秒(0-255秒)
	 * \endif
	 */
	public int                 nPulseDelay;
	
	/**
	 * \if ENGLISH_LANG
	 * Root address, 0 means local channel, 1 means connection expansion channel on first serial, 2?￠3...and so on, -1 means invalid
	 * \else
	 * 根地址, 0表示本地通道, 1表示连接在第一个串口上的扩展通道, 2、3...以此类推, -1表示无效
	 * \endif
	 */
	public int                 nSlot;
	
	/**
	 * \if ENGLISH_LANG
	 * First level cascading address, means connected at no. nSlot serial no. nLevel1 sensor or meter, start from 0, -1 means invalid
	 * \else
	 * 第一级级联地址, 表示连接在第nSlot串口上的第nLevel1个探测器或仪表, 从0开始, -1表示无效
	 * \endif
	 */
	public int                 nLevel1;
	
	/**
	 * \if ENGLISH_LANG
	 * means nLevel2 field exists or not
	 * \else
	 * 表示nLevel2字段是否存在
	 * \endif
	 */
	public boolean                abLevel2;
	
	/**
	 * \if ENGLISH_LANG
	 * Second level cascading address, means connected at no. nLevel1 meter sensor no., start from 0
	 * \else
	 * 第二级级联地址, 表示连接在第nLevel1个的仪表上的探测器序号, 从0开始
	 * \endif
	 */
    public int                 nLevel2;
}

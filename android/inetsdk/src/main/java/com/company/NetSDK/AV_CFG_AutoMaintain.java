package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Auto Maintenance, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_AUTOMAINTAIN}
 * \else
 * 自动维护, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_AUTOMAINTAIN}
 * \endif
 */
public class AV_CFG_AutoMaintain implements Serializable {
	
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto Reboot Date, -1 Never, 0~6 Sunday~Saturday, 7 Everyday
	 * \else
	 * 自动重启日期, -1永不, 0~6周日~周六, 7每天
	 * \endif
	 */
	public int			nAutoRebootDay;
	
 	/**
	 * \if ENGLISH_LANG
	 * AUto Reboot Hour, 0~23 
	 * \else
	 * 自动重启小时, 0~23
	 * \endif
	 */
	public int			nAutoRebootHour;
	
 	/**
	 * \if ENGLISH_LANG
	 * AUto Reboot Minute, 0~59 
	 * \else
	 * 自动重启分钟, 0~59
	 * \endif
	 */
	public int			nAutoRebootMinute;
	
 	/**
	 * \if ENGLISH_LANG
	 * AUto Shutdown Date 
	 * \else
	 * 自动关机日期
	 * \endif
	 */
	public int			nAutoShutdownDay;
	
 	/**
	 * \if ENGLISH_LANG
	 * AUto Shutdown Hour 
	 * \else
	 * 自动关机小时
	 * \endif
	 */
	public int			nAutoShutdownHour;
	
 	/**
	 * \if ENGLISH_LANG
	 * AUto Shutdown Minute 
	 * \else
	 * 自动关机分钟
	 * \endif
	 */
	public int			nAutoShutdownMinute;
	
 	/**
	 * \if ENGLISH_LANG
	 * Auto Start Date 
	 * \else
	 * 自动启动日期
	 * \endif
	 */
	public int			nAutoStartupDay;
	
 	/**
	 * \if ENGLISH_LANG
	 * Auto Start Hour 
	 * \else
	 * 自动启动小时
	 * \endif
	 */
	public int			nAutoStartupHour;
	
 	/**
	 * \if ENGLISH_LANG
	 * Auto Start Minute 
	 * \else
	 * 自动启动分钟
	 * \endif
	 */
	public int			nAutoStartupMinute;
	
 	/**
	 * \if ENGLISH_LANG
	 * true means enable auto reboot，false means unable auto reboot
	 * \else
	 * true表示开启自动重启，false表示关闭自动重启
	 * \endif
	 */
	public boolean		bAutoRebootEnable;
}

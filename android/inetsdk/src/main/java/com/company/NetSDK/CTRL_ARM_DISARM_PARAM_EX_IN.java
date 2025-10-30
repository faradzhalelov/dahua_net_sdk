package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm arm/disarm control expansion input parameter
 * \else
 * 报警布撤防控制扩展输入参数
 * \endif
 */
public class CTRL_ARM_DISARM_PARAM_EX_IN implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * arm/disarm status, refer to {@link NET_ALARM_MODE}
	 * \else
	 * 布撤防状态, 取值参考 {@link NET_ALARM_MODE}
	 * \endif
	 */
	public int      emState; 
	
	/**
	 * \if ENGLISH_LANG
	 * user password
	 * \else
	 * 用户密码
	 * \endif
	 */
    public String         szDevPwd; 
    
    /**
     * \if ENGLISH_LANG
     * scene mode, refer to {@link NET_SCENE_MODE}
     * \else
     * 情景模式, 取值参考 {@link NET_SCENE_MODE}
     * \endif
     */
    public int      emSceneMode; 
    
    /**
     * \if ENGLISH_LANG
     * transfer target device ID, as NULL means not transfer
     * \else
     * 转发目标设备ID,为NULL表示不转发
     * \endif
     */
    public String         szDevID; 
}

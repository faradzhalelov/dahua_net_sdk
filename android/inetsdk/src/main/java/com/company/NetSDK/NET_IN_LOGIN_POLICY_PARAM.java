package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#LoginWithPolicy} input parameter
 * \else
 * {@link INetSDK#LoginWithPolicy} 入参
 * \endif
 */
public class NET_IN_LOGIN_POLICY_PARAM implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * device port
	 * \else
	 * 设备端口号
	 * \endif
	 */
	public int		            nDevicePort;
	
	/**
	 * \if ENGLISH_LANG
	 * device address
	 * \else
	 * 设备ip地址    
	 * \endif
	 */
	public String		        szDeviceIp;
	
	/**
	 * \if ENGLISH_LANG
	 * username
	 * \else
	 * 用户名   
	 * \endif
	 */
	public String		        szUserName;
	
	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * 用户密码
	 * \endif
	 */
	public String 		        szPassword;
    
	/**
	 * \if ENGLISH_LANG
	 * device support capability, refer to {@link EM_LOGIN_SPAC_CAP_TYPE}
	 * LoginWithPolicy only support EM_LOGIN_SPEC_CAP_TCP/ EM_LOGIN_SPEC_CAP_P2P / EM_LOGIN_SPEC_CAP_MOBILE
	 * \else
	 * 登陆类型目前仅支持 EM_LOGIN_SPEC_CAP_TCP / EM_LOGIN_SPEC_CAP_P2P / EM_LOGIN_SPEC_CAP_MOBILE {@link EM_LOGIN_SPAC_CAP_TYPE}
	 * \endif
	 */
	public int 					emSpecCap;
   
	/**
	 * \if ENGLISH_LANG
	 * Login Policy flag bit0 == 1 support fast login. sSerialNumber, nAlarmInPortNum, nAlarmOutPortNum is invalided
	 * in NET_DEVICEINFO_Ex
	 * \else
	 * 登录策略标志位; bit0 == 1 快速登录: 设备信息 序列号/报警输入/输出参数无效 
	 * \endif
	 */
	public int                  nLoginPolicyFlag;
 
	/**
	 * \if ENGLISH_LANG
	 * preview policy flag. bit0 == 1 not support PIP 
	 * \else
	 * 实时预览策略标志位; bit0 == 1 不支持画中画 
	 * \endif
	 */
	public int                  nPlayPolicyFlag;

	/**
	 * \if ENGLISH_LANG
	 * record playback and record query policy flag. bit0 == 1 not support PIP
	 * \else
	 * 录像回放和录像查询策略标志位; bit0 == 1 不查询画中画能力
	 * \endif
	 */
	public int                  nPlayBackPolicyFlag;
}

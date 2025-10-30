package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Remote Device Structure, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_REMOTEDEVICE}
 * \else
 * 远程设备, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_REMOTEDEVICE}
 * \endif
 */
public class AV_CFG_RemoteDevice implements Serializable { 	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * 使能
	 * \endif
	 */
	public boolean			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Device ID 
	 * \else
	 * 设备ID
	 * \endif
	 */
	public byte[]			szID = new byte[FinalVar.AV_CFG_Device_ID_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device IP 
	 * \else
	 * 设备IP
	 * \endif
	 */
	public byte[]			szIP = new byte[FinalVar.AV_CFG_IP_Address_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Port 
	 * \else
	 * 端口
	 * \endif
	 */
	public int				nPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * Protoco
	 * \else
	 * 协议类型
	 * \endif
	 */
	public byte[]			szProtocol = new byte[FinalVar.AV_CFG_Protocol_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Username 
	 * \else
	 * 用户名
	 * \endif
	 */
	public byte[]			szUser = new byte[FinalVar.AV_CFG_User_Name_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Password 
	 * \else
	 * 密码
	 * \endif
	 */
	public byte[]			szPassword = new byte[FinalVar.AV_CFG_Password_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Serial No.
	 * \else
	 * 设备序列号
	 * \endif
	 */
	public byte[]			szSerial = new byte[FinalVar.AV_CFG_Serial_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Class 
	 * \else
	 * 设备类型
	 * \endif
	 */
	public byte[]			szDevClass = new byte[FinalVar.AV_CFG_Device_Class_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Type 
	 * \else
	 * 设备型号
	 * \endif
	 */
	public byte[]			szDevType = new byte[FinalVar.AV_CFG_Device_Type_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Name 
	 * \else
	 * 机器名称
	 * \endif
	 */
	public byte[]			szName = new byte[FinalVar.AV_CFG_Device_Name_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Address 
	 * \else
	 * 机器部署地点
	 * \endif
	 */
	public byte[]			szAddress = new byte[FinalVar.AV_CFG_Address_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Group 
	 * \else
	 * 机器分组
	 * \endif
	 */
	public byte[]			szGroup = new byte[FinalVar.AV_CFG_Group_Name_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Definition, 0-Standard Definition, 1-High Definition 
	 * \else
	 * 清晰度, 0-标清, 1-高清
	 * \endif
	 */
	public int				nDefinition;
	
 	/**
	 * \if ENGLISH_LANG
	 * Video Channel Input Number 
	 * \else
	 * 视频输入通道数
	 * \endif
	 */
	public int				nVideoChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * Audio Channel Input Number 
	 * \else
	 * 音频输入通道数
	 * \endif
	 */
	public int				nAudioChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * Rtsp port no. 
	 * \else
	 * Rtsp端口号
	 * \endif
	 */
	public int				nRtspPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * Device input type 
	 * \else
	 * 设备接入类型
	 * \endif
	 */
	public byte[]			szVendor = new byte[FinalVar.MAX_PATH];
	
 	/**
	 * \if ENGLISH_LANG
	 * Video input channel，user apply for nMaxVideoInputs CFG_RemoteDeviceVideoInputSpace 
	 * \else
	 * 视频输入通道，用户申请 nMaxVideoInputs 个 CFG_RemoteDeviceVideoInput 空间
	 * \endif
	 */
	public CFG_RemoteDeviceVideoInput[]			pVideoInput;

	/**
	 * \if ENGLISH_LANG
	 * Maximum number of video input channels
	 * \else
	 * 视频输入通道最大数
	 * \endif
	 */
	public int				nMaxVideoInputs;

	/**
	 * \if ENGLISH_LANG
	 * number of video input channels returned
	 * \else
	 * 返回的视频输入通道数
	 * \endif
	 */
	public int				nRetVideoInputs;
	
 	/**
	 * \if ENGLISH_LANG
	 * http port
	 * \else
	 * http端口号
	 * \endif
	 */
	public int				nHttpPort;
	/**
	 * \if ENGLISH_LANG
	 * Version
	 * \else
	 * 设备软件版本
	 * \endif
	 */
	public byte				szVersion[] = new byte[32];

	public AV_CFG_RemoteDevice(int nMaxVideoInputs) {
		this.nMaxVideoInputs = nMaxVideoInputs;
		this.pVideoInput = new CFG_RemoteDeviceVideoInput[this.nMaxVideoInputs];
		for (int i = 0; i < this.nMaxVideoInputs; ++i) {
			this.pVideoInput[i] = new CFG_RemoteDeviceVideoInput();
		}
	}
}


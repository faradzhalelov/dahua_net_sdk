package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * System information
 * \else
 * 系统信息
 * \endif
 */
public class SDKDEV_SYSTEM_ATTR_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Version info 
	 * \else
	 * 版本信息
	 * \endif
	 */
	public SDK_VERSION_INFO		stVersion = new SDK_VERSION_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * DSP capacity description 
	 * \else
	 * DSP能力描述
	 * \endif
	 */
	public SDK_DSP_ENCODECAP	stDspEncodeCap = new SDK_DSP_ENCODECAP();
	
	/**
	 * \if ENGLISH_LANG
	 * SN
	 * \else
	 * 序列号
	 * \endif
	 */
	public byte				szDevSerialNo[] = new byte[FinalVar.SDK_DEV_SERIALNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device type, refer to {@link NET_DEVICE_TYPE}
	 * \else
	 * 设备类型, 取值参考 {@link NET_DEVICE_TYPE}
	 * \endif
	 */
	public byte				byDevType;
	
	/**
	 * \if ENGLISH_LANG
	 * Device detailed type. String format. It may be empty.
	 * <pre>
	 * Enumeration definition				Type 
	 * NET_DVR_NONREALTIME_MACE				Non real-time MACE 
	 * NET_DVR_NONREALTIME					Non real-time 
	 * NET_NVS_MPEG1						NVS 
	 * NET_DVR_MPEG1_2						MPEG1 2-channel DVR 
	 * NET_DVR_MPEG1_8						MPEG1 8-channel DVR 
	 * NET_DVR_MPEG4_8						MPEG4 8-channel DVR 
	 * NET_DVR_MPEG4_16						MPEG4 16-channel DVR 
	 * NET_DVR_MPEG4_SX2					LB series DVR 
	 * NET_DVR_MEPG4_ST2					GB series DVR 
	 * NET_DVR_MEPG4_SH2					HB series DVR 
	 * NET_DVR_MPEG4_GBE					GBE series DVR 
	 * NET_DVR_MPEG4_NVSII					II NVS 
	 * NET_DVR_STD_NEW						New standard configuration protocol 
	 * NET_DVR_DDNS							DDNS server 
	 * NET_DVR_ATM							ATM 
	 * NET_NB_SERIAL						The 2nd non real-time NB DVR 
	 * NET_LN_SERIAL						LN series DVR 
	 * NET_BAV_SERIAL						BAV series DVR 
	 * NET_SDIP_SERIAL						SDIP series DVR 
	 * NET_IPC_SERIAL						IPC series DVR 
	 * NET_NVS_B							NVS B series 
	 * NET_NVS_C							NVS H series 
	 * NET_NVS_S							NVS S series 
	 * NET_NVS_E							NVS E series 
	 * NET_DVR_NEW_PROTOCOL					Search device type from QueryDevState. By string format. 
	 * NET_NVD_SERIAL						Decoder 
	 * NET_DVR_N5							N5 
	 * NET_DVR_MIX_DVR						Hybrid dvr 
	 * NET_SVR_SERIAL						SVR series 
	 * NET_SVR_BS							SVR-BS 
	 * NET_NVR_SERIAL						NVR series 
	 * NET_DVR_N51							N51 
	 * NET_ITSE_SERIAL						ITSE intelligent analysis box 
	 * NET_ITC_SERIAL						ITS camera 
	 * NET_HWS_SERIAL						Radar speed measuring device 
	 * NET_PVR_SERIAL						PVR 
	 * NET_IVS_SERIAL						IVS（intelligent video server series） 
	 * NET_IVS_B							General intelligent video detect server 
	 * NET_IVS_F							Facial recognition server 
	 * NET_IVS_V							Video quality analysis server 
	 * NET_MATRIX_SERIAL					Matrix 
	 * NET_DVR_N52							N52 
	 * NET_DVR_N56							N56 
	 * NET_ESS_SERIAL						ESS 
	 * NET_IVS_PC							People counting server 
	 * </pre>
	 * \else
	 * 设备详细型号，字符串格式，可能为空
	 * 枚举定义								类型 
	 * NET_DVR_NONREALTIME_MACE				非实时MACE 
	 * NET_DVR_NONREALTIME					非实时 
	 * NET_NVS_MPEG1						网络视频服务器 
	 * NET_DVR_MPEG1_2						MPEG1二路录像机 
	 * NET_DVR_MPEG1_8						MPEG1八路录像机 
	 * NET_DVR_MPEG4_8						MPEG4八路录像机 
	 * NET_DVR_MPEG4_16						MPEG4十六路录像机 
	 * NET_DVR_MPEG4_SX2					LB系列录像机 
	 * NET_DVR_MEPG4_ST2					GB系列录像机 
	 * NET_DVR_MEPG4_SH2					HB系列录像机 
	 * NET_DVR_MPEG4_GBE					GBE系列录像机 
	 * NET_DVR_MPEG4_NVSII					II代网络视频服务器 
	 * NET_DVR_STD_NEW						新标准配置协议 
	 * NET_DVR_DDNS							DDNS服务器 
	 * NET_DVR_ATM							ATM机 
	 * NET_NB_SERIAL						二代非实时NB系列机器 
	 * NET_LN_SERIAL						LN系列产品 
	 * NET_BAV_SERIAL						BAV系列产品 
	 * NET_SDIP_SERIAL						SDIP系列产品 
	 * NET_IPC_SERIAL						IPC系列产品 
	 * NET_NVS_B							NVS B系列 
	 * NET_NVS_C							NVS H系列 
	 * NET_NVS_S							NVS S系列 
	 * NET_NVS_E							NVS E系列 
	 * NET_DVR_NEW_PROTOCOL					从QueryDevState中查询设备类型,以字符串格式。 
	 * NET_NVD_SERIAL						解码器。 
	 * NET_DVR_N5							N5 
	 * NET_DVR_MIX_DVR						混合dvr 
	 * NET_SVR_SERIAL						SVR系列 
	 * NET_SVR_BS							SVR-BS 
	 * NET_NVR_SERIAL						NVR系列 
	 * NET_DVR_N51							N51 
	 * NET_ITSE_SERIAL						ITSE 智能分析盒 
	 * NET_ITC_SERIAL						智能交通像机设备 
	 * NET_HWS_SERIAL						雷达测速仪HWS 
	 * NET_PVR_SERIAL						便携式音视频录像机 
	 * NET_IVS_SERIAL						IVS（智能视频服务器系列） 
	 * NET_IVS_B							通用智能视频侦测服务器 
	 * NET_IVS_F							目标识别服务器 
	 * NET_IVS_V							视频质量诊断服务器 
	 * NET_MATRIX_SERIAL					矩阵 
	 * NET_DVR_N52							N52 
	 * NET_DVR_N56							N56 
	 * NET_ESS_SERIAL						ESS 
	 * NET_IVS_PC							人数统计服务器 
	 * \endif
	 */
	public byte				szDevType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Video port amount
	 * \else
	 * 视频口数量
	 * \endif
	 */
	public byte				byVideoCaptureNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio port amount 
	 * \else
	 * 音频口数量
	 * \endif
	 */
	public byte				byAudioCaptureNum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * 对讲输入接口数量
	 * \endif
	 */
	public byte				byTalkInChanNum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * 对讲输出接口数量
	 * \endif
	 */
	public byte				byTalkOutChanNum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte				byDecodeChanNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm input port amount
	 * \else
	 * 报警输入口数
	 * \endif
	 */
	public byte				byAlarmInNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm output amount port
	 * \else
	 * 报警输出口数
	 * \endif
	 */
	public byte				byAlarmOutNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Network port amount 
	 * \else
	 * 网络口数
	 * \endif
	 */
	public byte				byNetIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * USB USB port amount
	 * \else
	 * USB口数量
	 * \endif
	 */
	public byte				byUsbIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * IDE amount
	 * \else
	 * IDE数量
	 * \endif
	 */
	public byte				byIdeIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * COM amount
	 * \else
	 * 串口数量
	 * \endif
	 */
	public byte				byComIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * LPT amount
	 * \else
	 * 并口数量
	 * \endif
	 */
	public byte				byLPTIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte				byVgaIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte				byIdeControlNum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte				byIdeControlType;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP, expansible description 
	 * \else
	 * NSP，扩展描述
	 * \endif
	 */
	public byte				byCapability;
	
	/**
	 * \if ENGLISH_LANG
	 * Video matrix output amount
	 * \else
	 * 视频矩阵输出口数
	 * \endif
	 */
	public byte				byMatrixOutNum;			
	
	/**
	 * \if ENGLISH_LANG
	 * Operate when HDD is full(overwrite/stop)
	 * \else
	 * 硬盘满处理方式(覆盖、停止)
	 * \endif
	 */
	public byte				byOverWrite;
	
	/**
	 * \if ENGLISH_LANG
	 * Video file Package length
	 * \else
	 * 录象打包长度
	 * \endif
	 */
	public byte				byRecordLen;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable  DTS or not  1--enable. 0--unable
	 * \else
	 * 是否实行夏令时 1-实行 0-不实行
	 * \endif
	 */
	public byte				byDSTEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Device serial number. Remote control can use this SN to control.
	 * \else
	 * 设备编号，用于遥控
	 * \endif
	 */
	public int					wDevNo;
	
	/**
	 * \if ENGLISH_LANG
	 * Video format
	 * \else
	 * 视频制式:0-PAL,1-NTSC
	 * \endif
	 */
	public byte				byVideoStandard;
	
	/**
	 * \if ENGLISH_LANG
	 * Date format
	 * \else
	 * 日期格式
	 * \endif
	 */
	public byte				byDateFormat;
	
	/**
	 * \if ENGLISH_LANG
	 * Date separator(0:".",1:"-",2:"/")
	 * \else
	 * 日期分割符(0："."，1："-"，2："/")
	 * \endif
	 */
	public byte				byDateSprtr;
	
	/**
	 * \if ENGLISH_LANG
	 * Time separator  (0-24H,1-12H)
	 * \else
	 * 时间格式 (0-24小时，1－12小时)
	 * \endif
	 */
	public byte				byTimeFmt;
	
	/**
	 * \if ENGLISH_LANG
	 * Please refer to {@link SDK_LANGUAGE_TYPE} for enumeration value
	 * \else
	 * 语言种类,枚举值详见  {@link SDK_LANGUAGE_TYPE}
	 * \endif
	 */
	public byte				byLanguage;
}

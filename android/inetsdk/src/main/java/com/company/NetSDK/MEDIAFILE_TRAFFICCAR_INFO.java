package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The media file information searched by {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_TRAFFICCAR}
 * \else
 * {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_TRAFFICCAR} 查询出来的media文件信息
 * \endif
 */

public class MEDIAFILE_TRAFFICCAR_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 *  Channel number
	 * \else
	 *  通道号
	 * \endif
	 */
	public int					ch;

	/**
	 * \if ENGLISH_LANG
	 *  File path
	 * \else
	 *  文件路径
	 * \endif
	 */
	public byte					szFilePath[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 *  File length,This field is discarded,please use the sizeEx
	 * \else
	 *  文件长度,该字段废弃，请使用sizeEx
	 * \endif
	 */
	public int					size;

	/**
	 * \if ENGLISH_LANG
	 *  Start time
	 * \else
	 *  开始时间
	 * \endif
	 */
	public NET_TIME					starttime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 *  End time
	 * \else
	 *  结束时间
	 * \endif
	 */
	public NET_TIME					endtime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 *  Working directory serial number
	 * \else
	 *  工作目录编号
	 * \endif
	 */
	public int					nWorkDirSN;

	/**
	 * \if ENGLISH_LANG
	 *  File type.  1:picture  2:video
	 * \else
	 *  文件类型  1:图片 2:视频
	 * \endif
	 */
	public byte					nFileType;

	/**
	 * \if ENGLISH_LANG
	 *  File location index
	 * \else
	 *  文件定位索引
	 * \endif
	 */
	public byte					bHint;

	/**
	 * \if ENGLISH_LANG
	 *  drive number
	 * \else
	 *  磁盘号
	 * \endif
	 */
	public byte					bDriveNo;

	/**
	 * \if ENGLISH_LANG
	 *  cluster number
	 * \else
	 *  簇号
	 * \endif
	 */
	public int					nCluster;

	/**
	 * \if ENGLISH_LANG
	 *  picture type or file flag, 0-Normal, 1-Mosaic, 2-Cutout. more flags information ref to MEDIAFILE_TRAFFICCAR_INFO_EX's filed emFalgLists
	 * \else
	 *  图片类型或文件标记, 0-普通, 1-合成, 2-抠图。更多文件标记信息请参考 MEDIAFILE_TRAFFICCAR_INFO_EX 的 emFalgLists 字段
	 * \endif
	 */
	public byte					byPictureType;

	/**
	 * \if ENGLISH_LANG
	 *  video stream 0-unknown  1-main 2-sub1 3-sub2 4-sub3
	 * \else
	 *  视频码流 0-未知 1-主码流 2-辅码流1 3-辅码流2 4-辅码流
	 * \endif
	 */
	public byte					byVideoStream;

	/**
	 * \if ENGLISH_LANG
	 *  accurate positioning No.
	 * \else
	 *  精确定位号
	 * \endif
	 */
	public byte					byPartition;

	/**
	 * \if ENGLISH_LANG
	 *  Vehicle plate number
	 * \else
	 *  车牌号码
	 * \endif
	 */
	public byte					szPlateNumber[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 *  Plate type: "Unknown" =Unknown; "Normal"=Blue and black plate. "Yellow"=Yellow plate. "DoubleYellow"=Double-layer yellow plate
	 * \else
	 *  号牌类型"Unknown" 未知; "Normal" 蓝牌黑牌; "Yellow" 黄牌; "DoubleYellow" 双层黄尾牌
	 * \endif
	 */
	public byte					szPlateType[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 *  Plate color:"Blue","Yellow", "White","Black"
	 * \else
	 *  车牌颜色:"Blue","Yellow", "White","Black"
	 * \endif
	 */
	public byte					szPlateColor[] = new byte[16];

	/**
	 * \if ENGLISH_LANG
	 *  Vehicle color:"White", "Black", "Red", "Yellow", "Gray", "Blue","Green"
	 * \else
	 *  车身颜色:"White", "Black", "Red", "Yellow", "Gray", "Blue","Green"
	 * \endif
	 */
	public byte					szVehicleColor[] = new byte[16];

	/**
	 * \if ENGLISH_LANG
	 *  Speed. The unit is Km/H
	 * \else
	 *  车速,单位Km/H
	 * \endif
	 */
	public int					nSpeed;

	/**
	 * \if ENGLISH_LANG
	 *  Activation event amount
	 * \else
	 *  关联的事件个数
	 * \endif
	 */
	public int					nEventsNum;

	/**
	 * \if ENGLISH_LANG
	 *  Activation event list. The number refers to the corresponding event. Please refer to Intelligent Analytics Event Type.
	 * \else
	 *  关联的事件列表,数组值表示相应的事件,详见"智能分析事件类型"
	 * \endif
	 */
	public int					nEvents[] = new int[32];

	/**
	 * \if ENGLISH_LANG
	 *  Detailed offense type subnet mask. The first bit means redlight offense, the second bit is illegal straight/left-turn/right-turn driving.
	 * \else
	 *  具体违章类型掩码,第一位:闯红灯; 第二位:不按规定车道行驶;
	 * \endif
	 */
	public int					dwBreakingRule;

	/**
	 * \if ENGLISH_LANG
	 *  Vehicle type:"Light-duty"=small;"Medium"=medium; "Oversize"=large
	 * \else
	 *  车辆大小类型:"Light-duty":小型车;"Medium":中型车; "Oversize":大型车
	 * \endif
	 */
	public byte					szVehicleSize[] = new byte[16];

	/**
	 * \if ENGLISH_LANG
	 *  Local or remote channel name
	 * \else
	 *  本地或远程的通道名称
	 * \endif
	 */
	public byte					szChannelName[] = new byte[FinalVar.SDK_CHAN_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 *  Local or remote device name
	 * \else
	 *  本地或远程设备名称
	 * \endif
	 */
	public byte					szMachineName[] = new byte[FinalVar.SDK_MAX_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 *  up limit of speed, km/h
	 * \else
	 *  速度上限 单位: km/h
	 * \endif
	 */
	public int					nSpeedUpperLimit;

	/**
	 * \if ENGLISH_LANG
	 *  lower limit of speed km/h
	 * \else
	 *  速度下限 单位: km/h
	 * \endif
	 */
	public int					nSpeedLowerLimit;

	/**
	 * \if ENGLISH_LANG
	 *  id of event group
	 * \else
	 *  事件里的组编号
	 * \endif
	 */
	public int					nGroupID;

	/**
	 * \if ENGLISH_LANG
	 *  total count of the event group
	 * \else
	 *  一个事件组内的抓拍张数
	 * \endif
	 */
	public byte					byCountInGroup;

	/**
	 * \if ENGLISH_LANG
	 *  the index of this event
	 * \else
	 *  一个事件组内的抓拍序号
	 * \endif
	 */
	public byte					byIndexInGroup;

	/**
	 * \if ENGLISH_LANG
	 *  lane number
	 * \else
	 *  车道,参见MEDIA_QUERY_TRAFFICCAR_PARAM
	 * \endif
	 */
	public byte					byLane;

	/**
	 * \if ENGLISH_LANG
	 *  snap time
	 * \else
	 *  抓拍时间
	 * \endif
	 */
	public NET_TIME					stSnapTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 *  direction,MEDIA_QUERY_TRAFFICCAR_PARAM
	 * \else
	 *  车道方向,参见MEDIA_QUERY_TRAFFICCAR_PARAM
	 * \endif
	 */
	public int					nDirection;

	/**
	 * \if ENGLISH_LANG
	 *  machine address
	 * \else
	 *  机器部署地点
	 * \endif
	 */
	public byte					szMachineAddress[] = new byte[FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 *  size of file extension, Support file length is greater than 4G,unit:Byte
	 * \else
	 *  文件长度扩展，支持文件长度大于4G，单位字节
	 * \endif
	 */
	public long					sizeEx;

}
package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Comment information
 * \else
 * 公共信息
 * \endif
 */
public class EVENT_COMM_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * NTP time sync status, refer to {@link EM_NTP_STATUS}
	 * \else
	 * NTP校时状态,取值参考 {@link EM_NTP_STATUS}
	 * \endif
	 */
	public int                  emNTPStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * driver info number
	 * \else
	 * 驾驶员信息数
	 * \endif
	 */
	public int                  nDriversNum;
	
	/**
	 * \if ENGLISH_LANG
	 * driver info data 
	 * \else
	 * 驾驶员信息数据
	 * \endif
	 */
	public SDK_MSG_OBJECT_EX    pstDriversInfo[];
	
	/**
	 * \if ENGLISH_LANG
	 * writing path for loacl disk or sd card, or write to default path if NULL
	 * \else
	 * 本地硬盘或者sd卡成功写入路径,为NULL时，路径不存在
	 * \endif
	 */
	public String               pszFilePath;
	
	/**
	 * \if ENGLISH_LANG
	 * ftp path
	 * \else
	 * 设备成功写到ftp服务器的路径
	 * \endif
	 */
	public String               pszFTPPath;
	
	/**
	 * \if ENGLISH_LANG
	 * ftp path for assocated video
	 * \else
	 * 当前接入需要获取当前的关联视频的FTP上传路径
	 * \endif
	 */
	public String               pszVideoPath;

	/**
	 * \if ENGLISH_LANG
	 * Seat info
	 * \else
	 * 驾驶位信息
	 * \endif
	 */
	public EVENT_COMM_SEAT[]			stCommSeat = new EVENT_COMM_SEAT[FinalVar.COMMON_SEAT_MAX_NUMBER];

	/**
	 * \if ENGLISH_LANG
	 * Car Attachment number
	 * \else
	 * 车辆物件个数
	 * \endif
	 */
	public int							nAttachmentNum;

	/**
	 * \if ENGLISH_LANG
	 * Car Attachment
	 * \else
	 * 车辆物件信息
	 * \endif
	 */
	public EVENT_COMM_ATTACHMENT[]		stuAttachment = new EVENT_COMM_ATTACHMENT[FinalVar.NET_MAX_ATTACHMENT_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Annual Inspection number
	 * \else
	 * 年检标志个数
	 * \endif
	 */
	public int							nAnnualInspectionNum;

	/**
	 * \if ENGLISH_LANG
	 * Annual Inspection
	 * \else
	 * 年检标志
	 * \endif
	 */
	public NET_RECT[]					stuAnnualInspection = new NET_RECT[FinalVar.NET_MAX_ANNUUALINSPECTION_NUM];

	/**
	 * \if ENGLISH_LANG
	 * The ratio of HC,unit,%/1000000
	 * \else
	 * HC所占比例，单位：%/1000000
	 * \endif
	 */
	public float                       fHCRatio;

	/**
	 * \if ENGLISH_LANG
	 * The ratio of NO,unit,%/1000000
	 * \else
	 * NO所占比例，单位：%/1000000
	 * \endif
	 */
	public float                       fNORatio;

	/**
	 * \if ENGLISH_LANG
	 * The percent of CO,unit,% ,range from 0 to 100
	 * \else
	 * CO所占百分比，单位：% 取值0~100
	 * \endif
	 */
	public float                       fCOPercent;

	/**
	 * \if ENGLISH_LANG
	 * The percent of CO2,unit: % ,range from 0 to 100
	 * \else
	 * CO2所占百分比，单位：% 取值0~100
	 * \endif
	 */
	public float                       fCO2Percent;

	/**
	 * \if ENGLISH_LANG
	 * The obscuration of light,unit,% ,range from 0 to 100
	 * \else
	 * 不透光度，单位：% 取值0~100
	 * \endif
	 */
	public float                       fLightObscuration;

	/**
	 * \if ENGLISH_LANG
	 * Original pictures info number
	 * \else
	 * 原始图片张数
	 * \endif
	 */
	public int                         nPictureNum;

	/**
	 * \if ENGLISH_LANG
	 * Original pictures info data
	 * \else
	 * 原始图片信息
	 * \endif
	 */
	public EVENT_PIC_INFO[]              stuPicInfos = new EVENT_PIC_INFO[FinalVar.NET_MAX_EVENT_PIC_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Temperature,unit: centigrade
	 * \else
	 * 温度值,单位摄氏度
	 * \endif
	 */
	public float                       fTemperature;

	/**
	 * \if ENGLISH_LANG
	 * Humidity,unit: %
	 * \else
	 * 相对湿度百分比值
	 * \endif
	 */
	public int                         nHumidity;

	/**
	 * \if ENGLISH_LANG
	 * Pressure,unit: Kpa
	 * \else
	 * 气压值,单位Kpa
	 * \endif
	 */
	public float                       fPressure;

	/**
	 * \if ENGLISH_LANG
	 * Wind force,unit: m/s
	 * \else
	 * 风力值,单位m/s
	 * \endif
	 */
	public float                       fWindForce;

	/**
	 * \if ENGLISH_LANG
	 * Wind direction,unit: degree,range:[0,360]
	 * \else
	 * 风向,单位度,范围:[0,360]
	 * \endif
	 */
	public int                         nWindDirection;

	/**
	 * \if ENGLISH_LANG
	 * Road gradient,unit: degree
	 * \else
	 * 道路坡度值,单位度
	 * \endif
	 */
	public float                       fRoadGradient;

	/**
	 * \if ENGLISH_LANG
	 * Acceleration,unit: m/s2
	 * \else
	 * 加速度值,单位:m/s2
	 * \endif
	 */
	public float                       fAcceleration;

	/**
	 * \if ENGLISH_LANG
	 * RFID electronics tag info
	 * \else
	 * RFID 电子车牌标签信息
	 * \endif
	 */
	public NET_RFIDELETAG_INFO			stuRFIDEleTagInfo = new NET_RFIDELETAG_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  Binarized plate matting
	 * \else
	 *  二值化车牌抠图
	 * \endif
	 */
	public EVENT_PIC_INFO					stuBinarizedPlateInfo = new EVENT_PIC_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  Vehicle body close-up matting
	 * \else
	 *  车身特写抠图
	 * \endif
	 */
	public EVENT_PIC_INFO					stuVehicleBodyInfo = new EVENT_PIC_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  Vehicle type inToll station
	 * \else
	 *  收费站车型分类
	 * \endif
	 */
	public int					emVehicleTypeInTollStation;

	/**
	 * \if ENGLISH_LANG
	 *  Snap Category
	 * \else
	 *  抓拍的类型，默认为机动车
	 * \endif
	 */
	public int					emSnapCategory;

	/**
	 * \if ENGLISH_LANG
	 *  Location code of license plate,default -1 indicates unrecognized
	 * \else
	 *  车牌所属地区代码,默认-1表示未识别
	 * \endif
	 */
	public int					nRegionCode;

	/**
	 * \if ENGLISH_LANG
	 *  Vehicle type by function
	 * \else
	 *  按功能划分的车辆类型
	 * \endif
	 */
	public int					emVehicleTypeByFunc;

	/**
	 * \if ENGLISH_LANG
	 *  Standard vehicle type
	 * \else
	 *  标准车辆类型
	 * \endif
	 */
	public int					emStandardVehicleType;

	/**
	 * \if ENGLISH_LANG
	 *  Count of extra plates
	 * \else
	 *  额外车牌数量
	 * \endif
	 */
	public int					nExtraPlateCount;

	/**
	 * \if ENGLISH_LANG
	 *  Extra plate number
	 * \else
	 *  额外车牌信息
	 * \endif
	 */
	public byte					szExtraPlateNumber[][] = new byte[3][32];

	/**
	 * \if ENGLISH_LANG
	 *  oversea vehicle category
	 * \else
	 *  海外车辆类型中的子类别
	 * \endif
	 */
	public int					emOverseaVehicleCategory;

	/**
	 * \if ENGLISH_LANG
	 *  Province
	 * \else
	 *  车牌所属国家的省、州等地区名
	 * \endif
	 */
	public byte					szProvince[] = new byte[64];

	/**
	 * \if ENGLISH_LANG
	 *  Radar Info
	 * \else
	 *  物体在雷达坐标系中的信息,单位：米，设备视角：右手方向为X轴正向，正前方为Y轴正向
	 * \endif
	 */
	public NET_EVENT_RADAR_INFO					stuRadarInfo = new NET_EVENT_RADAR_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  gps info
	 * \else
	 *  触发事件时物体的GPS信息
	 * \endif
	 */
	public NET_EVENT_GPS_INFO					stuGPSInfo = new NET_EVENT_GPS_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  Auxiliary license plate information
	 * \else
	 *  辅车牌信息，某些国家或地区一车多牌
	 * \endif
	 */
	public NET_EXTRA_PLATES					stuExtraPlates[] = new NET_EXTRA_PLATES[2];

	/**
	 * \if ENGLISH_LANG
	 *  Auxiliary license plate number
	 * \else
	 *  辅车牌有效个数
	 * \endif
	 */
	public int					nExtraPlatesCount;

	/**
	 * \if ENGLISH_LANG
	 * License plate recognition confidence
	 * \else
	 * 车牌识别置信度
	 * \endif
	 */
	public int					nPlateRecogniseConf;

	/**
	 * \if ENGLISH_LANG
	 * Vehicle attitude confidence
	 * \else
	 * 车辆姿态置信度
	 * \endif
	 */
	public int					nVecPostureConf;

	/**
	 * \if ENGLISH_LANG
	 * Vehicle Body color confidence
	 * \else
	 * 车身颜色置信度
	 * \endif
	 */
	public int					nVecColorConf;

	/**
	 * \if ENGLISH_LANG
	 * special vehicle recognition results confidence
	 * \else
	 * 特殊车辆识别结果置信度
	 * \endif
	 */
	public int					nSpecialVehConf;

	/**
	 * \if ENGLISH_LANG
	 * Is the motor vehicle at a large angle
	 * \else
	 * 机动车是否为大角度
	 * \endif
	 */
	public int					nIsLargeAngle;

	/**
	 * \if ENGLISH_LANG
	 * Has the current vehicle body ever been associated with a license plate
	 * \else
	 * 当前机动车车身是否曾经关联车牌
	 * \endif
	 */
	public int					nIsRelatedPlate;

	/**
	 * \if ENGLISH_LANG
	 * Vehicle detection confidence
	 * \else
	 * 机动车检测置信度
	 * \endif
	 */
	public int					nDetectConf;

	/**
	 * \if ENGLISH_LANG
	 * Motor vehicle definition score
	 * \else
	 * 机动车清晰度分值
	 * \endif
	 */
	public int					nClarity;

	/**
	 * \if ENGLISH_LANG
	 * Motor vehicle integrity score
	 * \else
	 * 机动车完整度评分
	 * \endif
	 */
	public int					nCompleteScore;

	/**
	 * \if ENGLISH_LANG
	 * Motor vehicle preference score
	 * \else
	 * 机动车优选分数
	 * \endif
	 */
	public int					nQeScore;

	/**
	 * \if ENGLISH_LANG
	 *  Floating point speed value in km/h
	 * \else
	 *  浮点型速度值，单位km/h
	 * \endif
	 */
	public float					fSpeedFloat;

	/**
	 * \if ENGLISH_LANG
	 *  Heading angle: output the angle of vehicle movement direction with due north direction as the reference; Range: 0~360, clockwise needle alignment, unit: degree;
	 * \else
	 *  航向角, 以正北方向为基准输出车辆运动方向同正北方向的角度; 范围 0~360，顺时针正,单位为度；
	 * \endif
	 */
	public double					dbHeadingAngle;

	/**
	 * \if ENGLISH_LANG
	 *  Driver num
	 * \else
	 *  车辆前排驾驶室人员数量
	 * \endif
	 */
	public int					nDriverNum;

	/**
	 * \if ENGLISH_LANG
	 *  Country
	 * \else
	 *  国家
	 * \endif
	 */
	public byte					szCountry[] = new byte[20];

	public EVENT_COMM_INFO() {
		for(int i = 0; i < FinalVar.COMMON_SEAT_MAX_NUMBER; i++) {
			this.stCommSeat[i] = new EVENT_COMM_SEAT();
		}

		for(int i = 0; i < FinalVar.NET_MAX_ATTACHMENT_NUM; i++) {
			this.stuAttachment[i] = new EVENT_COMM_ATTACHMENT();
		}

		for(int i = 0; i < FinalVar.NET_MAX_ANNUUALINSPECTION_NUM; i++) {
			this.stuAnnualInspection[i] = new NET_RECT();
		}

		for(int i = 0; i < FinalVar.NET_MAX_EVENT_PIC_NUM; i++) {
			this.stuPicInfos[i] = new EVENT_PIC_INFO();
		}
		for(int i = 0; i < 2; i++) {
			this.stuExtraPlates[i] = new NET_EXTRA_PLATES();
		}
	}
	public EVENT_COMM_INFO(int nDriversNum) {
		for(int i = 0; i < FinalVar.COMMON_SEAT_MAX_NUMBER; i++) {
			this.stCommSeat[i] = new EVENT_COMM_SEAT();
		}

		for(int i = 0; i < FinalVar.NET_MAX_ATTACHMENT_NUM; i++) {
			this.stuAttachment[i] = new EVENT_COMM_ATTACHMENT();
		}

		for(int i = 0; i < FinalVar.NET_MAX_ANNUUALINSPECTION_NUM; i++) {
			this.stuAnnualInspection[i] = new NET_RECT();
		}

		for(int i = 0; i < FinalVar.NET_MAX_EVENT_PIC_NUM; i++) {
			this.stuPicInfos[i] = new EVENT_PIC_INFO();
		}
		this.nDriversNum = nDriversNum;
		pstDriversInfo = new SDK_MSG_OBJECT_EX[nDriversNum];
		for(int i = 0; i < nDriversNum; i++) {
			this.pstDriversInfo[i] = new SDK_MSG_OBJECT_EX();
		}
		for(int i = 0; i < 2; i++) {
			this.stuExtraPlates[i] = new NET_EXTRA_PLATES();
		}
	}
}

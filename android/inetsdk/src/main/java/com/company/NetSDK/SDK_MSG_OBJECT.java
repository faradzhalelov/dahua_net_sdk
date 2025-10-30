package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * Struct of object info for video analysis, the corresponding command {@link FinalVar#TYPE_CB_VIDEOSYNOPSIS}
 * \else
 * 视频分析物体信息结构体, 对应命令 {@link FinalVar#TYPE_CB_VIDEOSYNOPSIS}
 * \endif
 */
public class SDK_MSG_OBJECT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Object ID,each ID represent a unique object
	 * \else
	 * 物体ID,每个ID表示一个唯一的物体
	 * \endif
	 */
	public int				nObjectID;
	
	/**
	 * \if ENGLISH_LANG
	 * Object type
	 * \else
	 * 物体类型
	 * \endif
	 */
	public byte				szObjectType[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * Confidence(0~255),a high value indicate a high confidence
	 * \else
	 * 置信度(0~255)，值越大表示置信度越高
	 * \endif
	 */
	public int				nConfidence;
	
	/**
	 * \if ENGLISH_LANG
	 * Object action:1:Appear 2:Move 3:Stay 4:Remove 5:Disappear 6:Split 7:Merge 8:Rename
	 * \else
	 * 物体动作:1:Appear 2:Move 3:Stay 4:Remove 5:Disappear 6:Split 7:Merge 8:Rename
	 * \endif
	 */
	public int				nAction;
	
	/**
	 * \if ENGLISH_LANG
	 * BoundingBox
	 * \else
	 * 包围盒
	 * \endif
	 */
	public SDK_RECT			BoundingBox = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * The shape center of the object
	 * \else
	 * 物体型心
	 * \endif
	 */
	public SDK_POINT			Center = new SDK_POINT();
	
	/**
	 * \if ENGLISH_LANG
	 * The number of culminations for the polygon
	 * \else
	 * 多边形顶点个数
	 * \endif
	 */
	public int				nPolygonNum;
	
	/**
	 * \if ENGLISH_LANG
	 * A polygon that have a exactitude figure
	 * \else
	 * 较精确的轮廓多边形
	 * \endif
	 */
	public SDK_POINT			Contour[] = new SDK_POINT[FinalVar.SDK_MAX_POLYGON_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * The main color of the object;the first byte indicate red value, as byte order as green, blue, transparence, for example:RGB(0,255,0),transparence = 0, rgbaMainColor = 0x00ff0000.
	 * \else
	 * 表示车牌、车身等物体主要颜色；按字节表示，分别为红、绿、蓝和透明度,例如:RGB值为(0,255,0),透明度为0时, 其值为0x00ff0000.
	 * \endif
	 */
	public int				rgbaMainColor;
	
	/**
	 * \if ENGLISH_LANG
	 * The interrelated text of object,such as number plate,container number
	 * <pre>
	 * "Unknown"
	 * "Audi"
	 * "Honda" 
	 * "Buick" 
	 * "Volkswagen" 
	 * "Toyota" 
	 * "BMW" 
	 * "Peugeot" 
	 * "Ford" 
	 * "Mazda" 
	 * "Nissan" 
	 * "Hyundai" 
	 * "Suzuki" 
	 * "Citroen" 
	 * "Benz"
	 * "BYD" 
	 * "Geely" 
	 * "Lexus"
	 * "Chevrolet"
	 * "Chery"
	 * "Kia"
	 * "Charade"
	 * "DF"
	 * "Naveco"
	 * "SGMW"
	 * "Jinbei"
	 * </pre>
	 * \else
	 * 物体上相关的带0结束符文本，比如车牌，集装箱号等等
	 * "ObjectType"为"Vehicle"或者"Logo"时（尽量使用Logo。Vehicle是为了兼容老产品）表示车标，支持：
	 * <pre>
	 * "Unknown"未知 
	 * "Audi" 奥迪
	 * "Honda" 本田
	 * "Buick" 别克
	 * "Volkswagen" 大众
	 * "Toyota" 丰田
	 * "BMW" 宝马
	 * "Peugeot" 标致
	 * "Ford" 福特
	 * "Mazda" 马自达
	 * "Nissan" 尼桑
	 * "Hyundai" 现代
	 * "Suzuki" 铃木
	 * "Citroen" 雪铁龙
	 * "Benz" 奔驰
	 * "BYD" 比亚迪
	 * "Geely" 吉利
	 * "Lexus" 雷克萨斯
	 * "Chevrolet" 雪佛兰
	 * "Chery" 奇瑞
	 * "Kia" 起亚
	 * "Charade" 夏利
	 * "DF" 东风
	 * "Naveco" 依维柯
	 * "SGMW" 五菱
	 * "Jinbei" 金杯
	 * </pre>
	 * \endif
	 */
	public byte				szText[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * object sub type,different object type has different sub type:\n
	 * Vehicle Category:"Unknown","Motor","Non-Motor","Bus","Bicycle","Motorcycle"\n
	 * Plate Category:"Unknown","mal","Yellow","DoubleYellow","Police","AD",\n
	 * "ML","DoubleML","SAR","Trainning"\n
	 * "Personal" ,"Agri","Embassy","Moto","Tractor","Other"\n
	 * HumanTarget Category:"Normal","HideEye","HideNose","HideMouth"
	 * \else
	 * 物体子类别，根据不同的物体类型，可以取以下子类型：
	 * Vehicle Category:"Unknown"  未知,"Motor" 机动车,"Non-Motor":非机动车,"Bus": 公交车,"Bicycle" 自行车,"Motorcycle":摩托车,"PassengerCar":客车,\n
	 * "LargeTruck":大货车,	"MidTruck":中货车,"SaloonCar":轿车,"Microbus":面包车,"MicroTruck":小货车,"Tricycle":三轮车,	"Passerby":行人	\n												
	 * Plate Category："Unknown" 未知,"Normal" 蓝牌黑牌,"Yellow" 黄牌,"DoubleYellow" 双层黄尾牌,"Police" 警牌"AD" 武警牌,\n
	 * "ML" ML号牌,"DoubleML" ML双层,"SAR" 港澳特区号牌,"Trainning" 教练车号牌\n
	 * "Personal" 个性号牌,"Agri" 农用牌,"Embassy" 使馆号牌,"Moto" 摩托车号牌,"Tractor" 拖拉机号牌,"Other" 其他号牌\n
	 * HumanTarget Category:"Normal" 普通目标,"HideEye" 眼部遮挡,"HideNose" 鼻子遮挡,"HideMouth" 嘴部遮挡
	 * \endif
	 */
	public byte                szObjectSubType[] = new byte[64];

	/**
	 * \if ENGLISH_LANG
	 * Specifies the sub-brand of vehicle,the real value can be found in a mapping table from the development manual
	 * \else
	 *  车辆子品牌 需要通过映射表得到真正的子品牌 映射表详见开发手册
	 * \endif
	 */
	public short                wSubBrand;

	/**
	 * \if ENGLISH_LANG
	 * Picture info enable
	 * \else
	 * 是否有物体对应图片文件信息
	 * \endif
	 */
	public boolean          	bPicEnble;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture info
	 * \else
	 * 物体对应图片信息
	 * \endif
	 */
	public SDK_PIC_INFO      	stPicInfo = new SDK_PIC_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Is shot frame
	 * \else
	 * 是否是抓拍张的识别结果
	 * \endif
	 */
	public boolean				bShotFrame;
	
	/**
	 * \if ENGLISH_LANG
	 * RgbaMainColor is enable
	 * \else
	 * 物体颜色(rgbaMainColor)是否可用
	 * \endif
	 */
	public boolean				bColor;
	
	/**
	 * \if ENGLISH_LANG
	 * time type, See {@link EM_TIME_TYPE} 
	 * \else
	 * 时间表示类型，详见  {@link EM_TIME_TYPE}
	 * \endif
	 */
	public byte            		byTimeType;
	
	/**
	 * \if ENGLISH_LANG
	 * In view of the video compression,current time(when object snap or reconfnition, the frame will be attached to the frame in a video or pictures,means the frame in the original video of the time)
	 * \else
	 * 针对视频浓缩，当前时间戳（物体抓拍或识别时，会将此识别智能帧附在一个视频帧或jpeg图片中，此帧所在原始视频中的出现时间）
	 * \endif
	 */
	public NET_TIME_EX			stuCurrentTime = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Strart time(object appearing for the first time)
	 * \else
	 * 开始时间戳（物体开始出现时）
	 * \endif
	 */
	public NET_TIME_EX			stuStartTime = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * End time(object appearing for the last time)
	 * \else
	 * 结束时间戳（物体最后出现时）
	 * \endif
	 */
	public NET_TIME_EX			stuEndTime = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Original bounding box(absolute coordinates)
	 * \else
	 * 包围盒(绝对坐标)
	 * \endif
	 */
	public SDK_RECT				stuOriginalBoundingBox = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Sign bounding box coordinate
	 * \else
	 * 车标坐标包围盒
	 * \endif
	 */
	public SDK_RECT             	stuSignBoundingBox = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 当前帧序号（抓下这个物体时的帧）
	 * \endif
	 */
	public int					dwCurrentSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 开始帧序号（物体开始出现时的帧序号）
	 * \endif
	 */
	public int					dwBeginSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 结束帧序号（物体消逝时的帧序号）
	 * \endif
	 */
	public int					dwEndSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 开始时文件偏移, 单位: 字节（物体开始出现时，视频帧在原始视频文件中相对于文件起始处的偏移）
	 * \endif
	 */
	public long					nBeginFileOffset;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 结束时文件偏移, 单位: 字节（物体消逝时，视频帧在原始视频文件中相对于文件起始处的偏移）
	 * \endif
	 */
	public long					nEndFileOffset;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 物体颜色相似度，取值范围：0-100，数组下标值代表某种颜色，详见EM_COLOR_TYPE
	 * \endif
	 */
	public byte                	byColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 上半身物体颜色相似度(物体类型为人时有效)
	 * \endif
	 */
	public byte                	byUpperBodyColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 下半身物体颜色相似度(物体类型为人时有效)
	 * \endif
	 */
	public byte                	byLowerBodyColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];

	/**
	 * \if ENGLISH_LANG
	 * ID of relative object
	 * \else
	 * 相关物体ID
	 * \endif
	 */
	public int                 nRelativeID;

	/**
	 * \if ENGLISH_LANG
	 *  "ObjectType"is "Vehicle" or "Logo",  means a certain brand under LOGO, such as Audi A6L, since there are so many brands, SDK sends this field in real-time ,device filled as real.
	 * \else
	 * "ObjectType"为"Vehicle"或者"Logo"时,表示车标下的某一车系,比如奥迪A6L,由于车系较多,SDK实现时透传此字段,设备如实填写。
	 * \endif
	 */
	public byte[]                szSubText = new byte[20];

	/**
	 * \if ENGLISH_LANG
	 * Specifies the model years of vehicle. the real value can be found in a mapping table from the development manual
	 * \else
	 * 车辆品牌年款 需要通过映射表得到真正的年款 映射表详见开发手册
	 * \endif
	 */
	public short                wBrandYear;

 	public SDK_MSG_OBJECT() {
 		for(int i=0 ; i<FinalVar.SDK_MAX_POLYGON_NUM ; i++) {
 			Contour[i] = new SDK_POINT();
 		}
 	}

	@Override
	public String toString() {
		return "SDK_MSG_OBJECT{" +
				"nObjectID=" + nObjectID +
				", szObjectType=" + new String(szObjectType).trim() +
				", nConfidence=" + nConfidence +
				", nAction=" + nAction +
				", BoundingBox=" + BoundingBox.toString() +
				", Center=" + Center.toString() +
				", nPolygonNum=" + nPolygonNum +
				", Contour=" + Arrays.toString(Contour) +
				", rgbaMainColor=" + rgbaMainColor +
				", szText=" + new String(szText).trim() +
				", szObjectSubType=" + new String(szObjectSubType).trim() +
				", wSubBrand=" + wSubBrand +
				", bPicEnble=" + bPicEnble +
				", stPicInfo=" + stPicInfo.toString() +
				", bShotFrame=" + bShotFrame +
				", bColor=" + bColor +
				", byTimeType=" + byTimeType +
				", stuCurrentTime=" + stuCurrentTime.toStringTime() +
				", stuStartTime=" + stuStartTime.toStringTime() +
				", stuEndTime=" + stuEndTime.toStringTime() +
				", stuOriginalBoundingBox=" + stuOriginalBoundingBox.toString() +
				", stuSignBoundingBox=" + stuSignBoundingBox.toString() +
				", dwCurrentSequence=" + dwCurrentSequence +
				", dwBeginSequence=" + dwBeginSequence +
				", dwEndSequence=" + dwEndSequence +
				", nBeginFileOffset=" + nBeginFileOffset +
				", nEndFileOffset=" + nEndFileOffset +
				", byColorSimilar=" + Arrays.toString(byColorSimilar) +
				", byUpperBodyColorSimilar=" + Arrays.toString(byUpperBodyColorSimilar) +
				", byLowerBodyColorSimilar=" + Arrays.toString(byLowerBodyColorSimilar) +
				", nRelativeID=" + nRelativeID +
				", szSubText=" + new String(szSubText).trim() +
				", wBrandYear=" + wBrandYear +
				'}';
	}
}

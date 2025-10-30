package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Different region all kinds of module type's configuration
 * \else
 * 不同区域各种类型物体的检测模块配置
 * \endif
 */

public class CFG_MODULE_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Module type,see "supported detect module type list"
	 * \else
	 * 默认物体类型,详见"支持的检测物体类型列表"
	 * \endif
	 */
	public byte[]				szObjectType = new byte[FinalVar.MAX_NAME_LEN];	
	
	/**
	 * \if ENGLISH_LANG
	 * Enable snap shot
	 * \else
	 * 是否对识别物体抓图
	 * \endif
	 */
	public boolean 				bSnapShot;		
	
	/**
	 * \if ENGLISH_LANG
	 * Sensitivity, 0-10,little value instruct high sensitivity
	 * \else
	 * 灵敏度,取值1-10，值越小灵敏度越低
	 * \endif
	 */
	public byte                 bSensitivity;    
	
	/**
	 * \if ENGLISH_LANG
	 * Measure mode enable
	 * \else
	 * 计量方式参数是否有效
	 * \endif
	 */
	public boolean              bMeasureModeEnable;      
	
	/**
	 * \if ENGLISH_LANG
	 * Measure mode,0-pixel,1-actual lenth, meter, 2- pixel that has set the near point and far point
	 * \else
	 * 计量方式,0-像素，不需要远端、近端标定, 1-实际长度，单位：米, 2-远端近端标定后的像素
	 * \endif
	 */
	public byte                 bMeasureMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Detect region point number
	 * \else
	 * 检测区域顶点数
	 * \endif
	 */
	public int					nDetectRegionPoint;		
	
	/**
	 * \if ENGLISH_LANG
	 * Detect region
	 * \else
	 * 检测区域
	 * \endif
	 */
	public CFG_POLYGON[]		stuDetectRegion = new CFG_POLYGON[FinalVar.MAX_POLYGON_NUM];	
	
	/**
	 * \if ENGLISH_LANG
	 * Track region point number
	 * \else
	 * 跟踪区域顶点数
	 * \endif
	 */
	public int					nTrackRegionPoint;	
	
	/**
	 * \if ENGLISH_LANG
	 * Track region 
	 * \else
	 * 跟踪区域
	 * \endif
	 */
	public CFG_POLYGON[]		stuTrackRegion = new CFG_POLYGON[FinalVar.MAX_POLYGON_NUM];		
	
	/**
	 * \if ENGLISH_LANG
	 * Filter type enable
	 * \else
	 * 过滤类型参数是否有效
	 * \endif
	 */
	public boolean              bFilterTypeEnable;     
	
	// ByArea,ByRatio仅作兼容，使用独立的ByArea和ByRatio选项代替 2012/03/06
	/**
	 * \if ENGLISH_LANG
	 * Filter type:0:"ByLength",1:"ByArea", 2"ByWidthHeight"
	 * \else
	 * 过滤类型:0:"ByLength",1:"ByArea", 2:"ByWidthHeight", 3:"ByRatio": 按照宽高比，宽度除以高度的结果小于某个值或者大于某个值的问题将被过滤掉。
	 * \endif
	 */
	public byte				    nFilterType;				
	
	/**
	 * \if ENGLISH_LANG
	 * Back ground enable
	 * \else
	 * 过滤类型参数是否有效
	 * \endif
	 */
	public boolean              bBackgroudEnable;                    
	
	/**
	 * \if ENGLISH_LANG
	 * Back ground type, 0-normal, 1- high light
	 * \else
	 * 区域的背景类型, 0-普通类型, 1-高光类型
	 * \endif
	 */
	public byte                 bBackgroud;                  
	
	/**
	 * \if ENGLISH_LANG
	 * Valid filter by size enabled parameter or not 
	 * \else
	 * 长宽过滤使能参数是否有效
	 * \endif
	 */
	public boolean              abBySize;       
	
	/**
	 * \if ENGLISH_LANG
	 * Filter by size enabled 
	 * \else
	 * 长宽过滤使能
	 * \endif
	 */
	public boolean              bBySize;     
	
	/**
	 * \if ENGLISH_LANG
	 * Module minmal size enable
	 * \else
	 * 物体最小尺寸参数是否有效
	 * \endif
	 */
	public boolean              bFilterMinSizeEnable;    
	
	/**
	 * \if ENGLISH_LANG
	 * Module maxmal size enable
	 * \else
	 * 物体最大尺寸参数是否有效
	 * \endif
	 */
	public boolean              bFilterMaxSizeEnable;  
	
	/**
	 * \if ENGLISH_LANG
	 * Module minmal size "ByLength": indecate width and height,"ByArea"width indecate area,height indecate nothing
	 * \else
	 * 物体最小尺寸 "ByLength"模式下表示宽高的尺寸，"ByArea"模式下宽表示面积，高无效。
	 * \endif
	 */
	public CFG_SIZE			    stuFilterMinSize = new CFG_SIZE();	
	
	/**
	 * \if ENGLISH_LANG
	 * Module maxmal size "ByLength": indecate width and height,"ByArea"width indecate area,height indecate nothing
	 * \else
	 * 物体最大尺寸 "ByLength"模式下表示宽高的尺寸，"ByArea"模式下宽表示面积，高无效。
	 * \endif
	 */
	public CFG_SIZE			    stuFilterMaxSize = new CFG_SIZE();		
	
	/**
	 * \if ENGLISH_LANG
	 * Exclude region number
	 * \else
	 * 排除区域数
	 * \endif
	 */
	public int                  nExcludeRegionNum;  
	
	/**
	 * \if ENGLISH_LANG
	 * Exclude region 
	 * \else
	 * 排除区域
	 * \endif
	 */
	public CFG_REGION[]         stuExcludeRegion = new CFG_REGION[FinalVar.MAX_EXCLUDEREGION_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Calibrate box number
	 * \else
	 * 校准框个数
	 * \endif
	 */
	public int                  nCalibrateBoxNum;   
	
	/**
	 * \if ENGLISH_LANG
	 * Calibrate box 
	 * \else
	 * 校准框(远端近端标定模式下有效)
	 * \endif
	 */
	public CFG_CALIBRATEBOX_INFO[]  stuCalibrateBoxs = new CFG_CALIBRATEBOX_INFO[FinalVar.MAX_CALIBRATEBOX_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Test accuracy enable
	 * \else
	 * 检测精度是否有效
	 * \endif
	 */
	public boolean              bAccuracy;              
	
	/**
	 * \if ENGLISH_LANG
	 * Test accuracy 
	 * \else
	 * 检测精度
	 * \endif
	 */
	public byte                 byAccuracy;                          // 检测精度
	
	/**
	 * \if ENGLISH_LANG
	 * Moving step enable    
	 * \else
	 * 算法移动步长是否有效
	 * \endif
	 */
	public boolean              bMovingStep;       
	
	/**
	 * \if ENGLISH_LANG
	 * Moving step 
	 * \else
	 * 算法移动步长
	 * \endif
	 */
	public byte                 byMovingStep;                        
	
	/**
	 * \if ENGLISH_LANG
	 * Scaling factor enable 
	 * \else
	 * 算法缩放因子是否有效
	 * \endif
	 */
	public boolean              bScalingFactor;					
	
	/**
	 * \if ENGLISH_LANG
	 * Scaling factor  
	 * \else
	 * 算法缩放因子
	 * \endif
	 */
	public byte                 byScalingFactor;						 

	/**
	 * \if ENGLISH_LANG
	 * Miss detect and error detect balance paramter is valid or not. parameter or not   
	 * \else
	 * 漏检和误检平衡参数是否有效
	 * \endif
	 */
	public boolean              abDetectBalance;
	
	/**
	 * \if ENGLISH_LANG
	 * Miss detect and error detect balance  0-compromise mode (default) 1-less miss detection  2- less error detection
	 * \else
	 * 漏检和误检平衡	0-折中模式(默认)1-漏检更少2-误检更少
	 * \endif
	 */
	public int					nDetectBalance;							 
	
	public boolean              abByRatio;
	public boolean              abMinRatio;
	public boolean              abMaxRatio;
	public boolean              abMinAreaSize;
	public boolean              abMaxAreaSize;
	
	/**
	 * \if ENGLISH_LANG
	 * Filter by W/H ratio or not. You can use ComplexSizeFilte to see it works or not. You can use  nFilterType at the same time.  
	 * \else
	 * 是否按宽高比过滤 通过能力ComplexSizeFilter判断是否可用 可以和nFilterType复用
	 * \endif
	 */
	public boolean              bByRatio;                                

	/**
	 * \if ENGLISH_LANG
	 * Min W/H ratio
	 * \else
	 * 最小宽高比
	 * \endif
	 */
	public double               dMinRatio;  
	
	/**
	 * \if ENGLISH_LANG
	 * Max W/H ratio
	 * \else
	 * 最大宽高比
	 * \endif
	 */
	public double               dMaxRatio;     
	
	/**
	 * \if ENGLISH_LANG
	 * Min area rectangle box    When  "measurement method" is "pixel", it represents its sizes of lengths; when "measurement method" is "far and near-end calibration mode", it represents the min sizes of lengths of standard box
	 * \else
	 * 最小面积矩形框尺寸 "计量方式"为"像素"时，表示最小面积矩形框的宽高尺寸；"计量方式"为"远端近端标定模式"时，表示基准框的最小宽高尺寸；
	 * \endif
	 */
	public CFG_SIZE             stuMinAreaSize = new CFG_SIZE(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Max area rectangle box, same as above
	 * \else
	 * 最大面积矩形框尺寸, 同上
	 * \endif
	 */
	public CFG_SIZE             stuMaxAreaSize = new CFG_SIZE();                           
	
	public boolean              abByArea;
	public boolean              abMinArea;
	public boolean              abMaxArea;
	public boolean              abMinRatioSize;
	public boolean              abMaxRatioSize;
	
	/**
	 * \if ENGLISH_LANG
	 * Filter by area ratio or not.You can use ComplexSizeFilte to see it works or not. You can use  nFilterType at the same time.    
	 * \else
	 * 是否按面积过滤 通过能力ComplexSizeFilter判断是否可用  可以和nFilterType复用
	 * \endif
	 */
	public boolean              bByArea;    
	
	/**
	 * \if ENGLISH_LANG
	 * Min area
	 * \else
	 * 最小面积
	 * \endif
	 */
	public float                nMinArea;   
	
	/**
	 * \if ENGLISH_LANG
	 * Max area
	 * \else
	 * 最大面积
	 * \endif
	 */
	public float                nMaxArea;  
	
	/**
	 * \if ENGLISH_LANG
	 * Min W/H ratio rectangle box size, min W/H ratio corresponding to sizes of lengths of rectangle box
	 * \else
	 * 最小宽高比矩形框尺寸，最小宽高比对应矩形框的宽高尺寸。
	 * \endif
	 */
	public CFG_SIZE             stuMinRatioSize = new CFG_SIZE(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Max W/H ratio rectangle box size
	 * \else
	 * 最大宽高比矩形框尺寸，同上
	 * \endif
	 */
	public CFG_SIZE             stuMaxRatioSize = new CFG_SIZE();                          
	
	/**
	 * \if ENGLISH_LANG
	 * Area calibration box number
	 * \else
	 * 面积校准框个数
	 * \endif
	 */
	public int                 nAreaCalibrateBoxNum;   
	
	/**
	 * \if ENGLISH_LANG
	 * Area calibration pane
	 * \else
	 * 面积校准框
	 * \endif
	 */
	public CFG_CALIBRATEBOX_INFO[]  stuAreaCalibrateBoxs = new CFG_CALIBRATEBOX_INFO[FinalVar.MAX_CALIBRATEBOX_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Ratio calibration pane number
	 * \else
	 * 比例校准框个数
	 * \endif
	 */
	public int                 nRatioCalibrateBoxs;   
	
	/**
	 * \if ENGLISH_LANG
	 * Ratio calibration pane 
	 * \else
	 * 比例校准框
	 * \endif
	 */
	public CFG_CALIBRATEBOX_INFO[]  stuRatioCalibrateBoxs = new CFG_CALIBRATEBOX_INFO[FinalVar.MAX_CALIBRATEBOX_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Turn on anti-disturbance module or not  
	 * \else
	 * 是否开启去扰动模块
	 * \endif
	 */
	public boolean             bAntiDisturbance;      
	
	/**
	 * \if ENGLISH_LANG
	 * There is backlight or not 
	 * \else
	 * 是否有逆光
	 * \endif
	 */
	public boolean             bBacklight; 
	
	/**
	 * \if ENGLISH_LANG
	 * There is shadow or not?
	 * \else
	 * 是否有阴影
	 * \endif
	 */
	public boolean             bShadow;   
	
	/**
	 * \if ENGLISH_LANG
	 * Turn on contour assistant track or not   For example, for facial identification, it can identify face by tracking human body  
	 * \else
	 * 是否开启轮廓辅助跟踪，例：在目标识别时可以通过跟踪人体来辅助识别目标
	 * \endif
	 */
	public boolean             bContourAssistantTrack;       
	
	/**
	 * \if ENGLISH_LANG
	 * PTZ preset, 0~255, 0=stationary scene, ignored preset.
	 * \else
	 * 云台预置点，0~255，0表示固定场景，忽略预置点。大于0表示在此预置点时模块有效
	 * \endif
	 */
	public int                 nPtzPresetId;                            

	/**
	 * \if ENGLISH_LANG
	 * Object specified filter number
	 * \else
	 * 物体特定的过滤器个数
	 * \endif
	 */
	public int                 nObjectFilterNum;   
	
	/**
	 * \if ENGLISH_LANG
	 * Object specified filter info
	 * \else
	 * 物体特定的过滤器信息
	 * \endif
	 */
	public CFG_OBJECT_SIZEFILTER_INFO[]  stObjectFilter = new CFG_OBJECT_SIZEFILTER_INFO[FinalVar.MAX_OBJECT_LIST_SIZE]; 

	public boolean             abObjectImageSize;    
	
	/**
	 * \if ENGLISH_LANG
	 * Ensure same size of object image, unit is pixel, nonsupport of decimal, take: >=0, 0 is automatic adjustion
	 * \else
	 * 保证物体图像尺寸相同,单位是像素,不支持小数，取值：>=0,  0 表示自动调整大小
	 * \endif
	 */
	public CFG_SIZE            stObjectImageSize = new CFG_SIZE();                       

	/**
	 * \if ENGLISH_LANG
	 * Special detect num
	 * \else
	 * 特殊检测区域个数
	 * \endif
	 */
	public int                 nSpecailDetectNum;   
	
	/**
	 * \if ENGLISH_LANG
	 * Special detect region info
	 * \else
	 * 特殊检测区信息
	 * \endif
	 */
	public CFG_SPECIALDETECT_INFO[]  stSpecialDetectRegions = new CFG_SPECIALDETECT_INFO[FinalVar.MAX_SPECIALDETECT_NUM];  

	/**
	 * \if ENGLISH_LANG
	 * Number of attributes in the need to identitu objects
	 * \else
	 * 需要识别物体的属性个数
	 * \endif
	 */
	public int        		   nAttribute;  
	
	/**
	 * \if ENGLISH_LANG
	 * need to identify the object's attribute list,"Category" "Size" "Color" "Speed" "Sign" ,"Action" 
	 * \else
	 * 需要识别物体的属性列表，“Category” 物体子类；“Size” 物体大小；“Color” 物体颜色；“Speed” 物体速度；“Sign” 物体标志，对车辆而言，指车标；“Action” 物体动作
	 * \endif
	 */
	public byte[][]            szAttributes = new byte[FinalVar.MAX_OBJECT_ATTRIBUTES_SIZE][FinalVar.MAX_NAME_LEN];   
	
	/**
	 * \if ENGLISH_LANG
	 * nPlateAnalyseMode enable
	 * \else
	 * nPlateAnalyseMode是否有效
	 * \endif
	 */
	public boolean             abPlateAnalyseMode;              
	
	/**
	 * \if ENGLISH_LANG
	 * License plate recognition model,0-only identify car license plate 1-only identify the rear license plate, 2-car license plate is preferred,3-the rear license plate is preferred
	 * \else
	 * 车牌识别模式，0-只识别车头牌照 1-只识别车尾牌照 2-车头牌照优先（场景中大部分车均是车头牌照）3-车尾牌照优先（场景中大部分车均是车尾牌照）
	 * \endif
	 */
	public int                 nPlateAnalyseMode;                       

    //szAttributes属性存在"Category"时生效
	/**
	 * \if ENGLISH_LANG
	 * The total number of category types    CFG_CATEGORY_TYPE   emCategoryType[MAX_CATEGORY_TYPE_NUMBER]; // Sub type information
	 * \else
	 * 需要识别物体的子类型总数
	 * \endif
	 */
    public int       		   nCategoryNum;      
    
	/**
	 * \if ENGLISH_LANG
	 * Category type, refer to {@link CFG_CATEGORY_TYPE}
	 * \else
	 * 子类型信息, 取值参考 {@link CFG_CATEGORY_TYPE}
	 * \endif
	 */
    public int[]   emCategoryType = new int[FinalVar.MAX_CATEGORY_TYPE_NUMBER];  
    
	/**
	 * \if ENGLISH_LANG
	 * the type of scene
	 * \else
	 * 检测区参数用于的场景类型
	 * \endif
	 */
	public byte[]			   szSceneType = new byte[FinalVar.CFG_COMMON_STRING_16];

	/**
	 * \if ENGLISH_LANG
	 *  Object type Length Filter, if new filter is specified, whichever is new
	 * \else
	 *  物体类型过滤器，如果指定新的过滤器以新的为准
	 * \endif
	 */
	public CFG_LENGTH_FILETER_INFO					stuLengthFilter = new CFG_LENGTH_FILETER_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  whether szSceneTypeEx is valid: TRUE, use szSceneTypeListEx
	 * \else
	 *  szSceneTypeEx 是否有效
	 * \endif
	 */
	public boolean					bSceneTypeEx;

	/**
	 * \if ENGLISH_LANG
	 *  extend of szSceneType
	 * \else
	 *  检测区参数用于的场景类型扩展
	 * \endif
	 */
	public byte					szSceneTypeEx[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Auxiliary ilne mode 0:unknown 1:midcourt line 2:side boundary
	 * \else
	 * 辅助线模式，开关门检测智能大类使用        0:未知 1:中线 2:边线
	 * \endif
	 */
	public int					nDetectLineMode;

	/**
	 * \if ENGLISH_LANG
	 * nDeviceLine num
	 * \else
	 * 警戒线数量
	 * \endif
	 */
	public int					nDetectLineNum;

	/**
	 * \if ENGLISH_LANG
	 * Caution line type,borser[0,8192]
	 * \else
	 * 警戒线折线类型，折线中每个端点的坐标归一化到[0,8192)区间。
	 * \endif
	 */
	public CFG_POLYGON					stuDetectLine[] = new CFG_POLYGON[20];
	public CFG_MODULE_INFO() {
		for(int i = 0; i < FinalVar.MAX_POLYGON_NUM; i++) {
			stuDetectRegion[i] = new CFG_POLYGON();
			stuTrackRegion[i] = new CFG_POLYGON();
		}
		
		for(int i = 0; i < FinalVar.MAX_EXCLUDEREGION_NUM; i++) {
			stuExcludeRegion[i] = new CFG_REGION();
		}
		
		for(int i = 0; i < FinalVar.MAX_CALIBRATEBOX_NUM; i++) {
			stuCalibrateBoxs[i] = new CFG_CALIBRATEBOX_INFO();
			stuAreaCalibrateBoxs[i] = new CFG_CALIBRATEBOX_INFO();
			stuRatioCalibrateBoxs[i] = new CFG_CALIBRATEBOX_INFO();
		}
		
		for(int i = 0; i < FinalVar.MAX_OBJECT_LIST_SIZE; i++) {
			stObjectFilter[i] = new CFG_OBJECT_SIZEFILTER_INFO();
		}
		
		for(int i = 0; i < FinalVar.MAX_SPECIALDETECT_NUM; i++) {
			stSpecialDetectRegions[i] = new CFG_SPECIALDETECT_INFO();
		}

		for(int i = 0; i < 20; i++) {
			stuDetectLine[i] = new CFG_POLYGON();
		}
	}
}

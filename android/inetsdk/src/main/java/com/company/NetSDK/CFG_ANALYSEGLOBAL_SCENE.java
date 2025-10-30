package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Global Configuration Scenes Video Analysis
 * \else
 * 视频分析全局配置场景
 * \endif
 */
public class CFG_ANALYSEGLOBAL_SCENE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Application Scenes,See"Scene List of Supported", refer to {@link EM_SCENE_TYPE}
	 * \else
	 * 应用场景,详见"支持的场景列表", 取值参考 {@link EM_SCENE_TYPE}
	 * \endif
	 */
	public byte[]				szSceneType = new byte[FinalVar.MAX_NAME_LEN];	
	
	
	/****************************************************************************
	 * 			以下为场景具体信息, 根据szSceneType决定哪个场景有效				*
	 ****************************************************************************/
	 /**
	 * \if ENGLISH_LANG
	 * FaceDetection
	 * \else
	 * 目标检测场景/目标识别检查  "FaceDetection"															
	 * \endif
	 */
	public	CFG_FACEDETECTION_SCENCE_INFO	stuFaceDetectionScene = new CFG_FACEDETECTION_SCENCE_INFO();  
	
	 /**
	 * \if ENGLISH_LANG
	 * Traffic
	 * \else
	 * 交通场景 "Traffic"	
	 * \endif
	 */
	public	CFG_TRAFFIC_SCENE_INFO			stuTrafficScene = new CFG_TRAFFIC_SCENE_INFO();		          														
	
	 /**
	 * \if ENGLISH_LANG
	 * Normal
	 * \else
	 * 普通场景/远景场景/中景场景/近景场景/室内场景/人数统计场景	"Normal"
	 * \endif
	 */
	public	CFG_NORMAL_SCENE_INFO			stuNormalScene = new CFG_NORMAL_SCENE_INFO();			    												
	
	 /**
	 * \if ENGLISH_LANG
	 * TrafficPatrol
	 * \else
	 * 交通巡视场景  "TrafficPatrol"
	 * \endif
	 */
	public	CFG_TRAFFIC_TOUR_SCENE_INFO		stuTrafficTourScene = new CFG_TRAFFIC_TOUR_SCENE_INFO();	  
	
	
	/**
	 * \if ENGLISH_LANG
	 * picture depth of field, refer to {@link EM_DEPTH_TYPE}
	 * \else
	 * 画面景深, 取值参考 {@link EM_DEPTH_TYPE}
	 * \endif
	 */ 
	public int		    		 emDepthType;
	
	/**
	 * \if ENGLISH_LANG
	 * preset positions of ptz,0~255
	 * \else
	 * 云台预置点编号，0~255
	 * \endif
	 */ 
	public int					nPtzPresetId;	


	/****************************************************************************
	 * 			                              以下是有多个大类业务的情况				            *
	 ****************************************************************************/
	 /**
	 * \if ENGLISH_LANG
	 * the count of scene
	 * \else
	 * 实际场景个数	
	 * \endif
	 */
	public int					nSceneListCount;						
	
	 /**
	 * \if ENGLISH_LANG
	 * the list of scene, The Following Information in Detail for Scene,According to szSceneTypeList to Decide which Scene is Effective
	 * \else
	 * 场景列别，同一视频通道下启用多个场景时，表示第2个之后的方案
	 * \endif
	 */
	public byte[][]				szSceneTypeList = 
								new byte[FinalVar.MAX_SCENE_TYPE_LIST_SIZE][FinalVar.CFG_COMMON_STRING_16];
																																																																			
	
	/****************************************************************************
	 * 			                                 多个大类业务时有效				                *
	 ****************************************************************************/
	 /**
	 * \if ENGLISH_LANG
	 * the config of uniform scene
	 * \else
	 * 统一场景配置
	 * \endif
	 */
	public CFG_INTELLI_UNIFORM_SCENE stuUniformScene = new CFG_INTELLI_UNIFORM_SCENE(); 				
																		
}

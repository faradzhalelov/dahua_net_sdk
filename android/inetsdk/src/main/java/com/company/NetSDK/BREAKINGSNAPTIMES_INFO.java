package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Breaking snap times
 * \else
 * 抓拍张数
 * \endif
 */
public class BREAKINGSNAPTIMES_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Normal
	 * \else
	 * 正常
	 * \endif
	 */
	public int               nNormal;                        
	
	/**
	 * \if ENGLISH_LANG
	 * Run redlight
	 * \else
	 * 闯红灯
	 * \endif
	 */
	public int               nRunRedLight;                   
	
	/**
	 * \if ENGLISH_LANG
	 * Over line
	 * \else
	 * 压线
	 * \endif
	 */
	public int			      nOverLine;						
	
	/**
	 * \if ENGLISH_LANG
	 * Over yellow line
	 * \else
	 * 压黄线
	 * \endif
	 */
	public int				  nOverYellowLine;			  	 
	
	/**
	 * \if ENGLISH_LANG
	 * Retrograde
	 * \else
	 * 逆向
	 * \endif
	 */
	public int				  nRetrograde;			    
	
	/**
	 * \if ENGLISH_LANG
	 * Under speed
	 * \else
	 * 欠速
	 * \endif
	 */
	public int				  nUnderSpeed;					   
	
	/**
	 * \if ENGLISH_LANG
	 * Over speed
	 * \else
	 * 超速
	 * \endif
	 */
	public int				  nOverSpeed;						
	
	/**
	 * \if ENGLISH_LANG
	 * Wrong runing route
	 * \else
	 * 有车占道
	 * \endif
	 */
	public int			      nWrongRunningRoute;				 
	
	/**
	 * \if ENGLISH_LANG
	 * Yellow plant in route
	 * \else
	 * 黄牌占道
	 * \endif
	 */
	public int			      nYellowInRoute;					 
	
	/**
	 * \if ENGLISH_LANG
	 * Special retrograde
	 * \else
	 * 特殊逆行
	 * \endif
	 */
	public int		    	  nSpecialRetrograde;				 
	
	/**
	 * \if ENGLISH_LANG
	 * Turn left
	 * \else
	 * 左转
	 * \endif
	 */
	public int			      nTurnLeft;						 
	
	/**
	 * \if ENGLISH_LANG
	 * Turn right
	 * \else
	 * 右转
	 * \endif
	 */
	public int			      nTurnRight;					
	
	/**
	 * \if ENGLISH_LANG
	 * Cross lane
	 * \else
	 * 变道
	 * \endif
	 */
	public int			      nCrossLane;						
	
	/**
	 * \if ENGLISH_LANG
	 * U_turn
	 * \else
	 * 调头
	 * \endif
	 */
	public int			      nU_Turn;						  
	
	/**
	 * \if ENGLISH_LANG
	 * Parking
	 * \else
	 * 停车
	 * \endif
	 */
	public int			      nParking;						    
	
	/**
	 * \if ENGLISH_LANG
	 *  Waiting area
	 * \else
	 * 进入待行区
	 * \endif
	 */
	public int               nWaitingArea;						
	
	/**
	 * \if ENGLISH_LANG
	 * Wrong route
	 * \else
	 * 不按车道行驶	
	 * \endif
	 */
	public int			      nWrongRoute;					    
	
	/**
	 * \if ENGLISH_LANG
	 * Parking space parkig
	 * \else
	 * 车位有车
	 * \endif
	 */
	public int               nParkingSpaceParking;             
	
	/**
	 * \if ENGLISH_LANG
	 * Parking space no parking
	 * \else
	 * 车位无车
	 * \endif
	 */
	public int               nParkingSpaceNoParking;           

	/**
	 * \if ENGLISH_LANG
	 * Run the Yellow Light
	 * \else
	 * 闯黄灯
	 * \endif
	 */
	public int               nRunYellowLight;					
	
	/**
	 * \if ENGLISH_LANG
	 * Illegal Parking
	 * \else
	 * 停留
	 * \endif
	 */
	public int               nStay;							
	
	/**
	 * \if ENGLISH_LANG
	 * Crosswalk Pedestrain Priority
	 * \else
	 * 斑马线行人优先
	 * \endif
	 */
	public int               nPedestrainPriority;	             
	
	/**
	 * \if ENGLISH_LANG
	 * Illegal Lane Occupation
	 * \else
	 * 占道
	 * \endif
	 */
	public int               nVehicleInBusRoute;               
	
	/**
	 * \if ENGLISH_LANG
	 * Illegal Back Up
	 * \else
	 * 倒车
	 * \endif
	 */
	public int               nBacking;                         
	
	/**
	 * \if ENGLISH_LANG
	 * Cross Stop Line
	 * \else
	 * 压停止线
	 * \endif
	 */
	public int				  nOverStopLine;					
	
	/**
	 * \if ENGLISH_LANG
	 * Yellow Grid Parking
	 * \else
	 * 黄网格线停车	
	 * \endif
	 */
	public int               nParkingOnYellowBox;           
	
	/**
	 * \if ENGLISH_LANG
	 * Limited Plate
	 * \else
	 * 受限车牌	
	 * \endif
	 */
	public int               nRestrictedPlate;					
	
	/**
	 * \if ENGLISH_LANG
	 * No Entry	
	 * \else
	 * 禁行
	 * \endif
	 */
	public int               nNoPassing;						 	
	
	/**
	 * \if ENGLISH_LANG
	 * Unfasten seat belt
	 * \else
	 * 不系安全带
	 * \endif
	 */
	public int               nWithoutSafeBelt;                  
	
	/**
	 * \if ENGLISH_LANG
	 * Driver smoking
	 * \else
	 * 驾驶员抽烟
	 * \endif
	 */
	public int               nDriverSmoking;                    
	
	/**
	 * \if ENGLISH_LANG
	 * Driver call
	 * \else
	 * 驾驶员打电话
	 * \endif
	 */
	public int               nDriverCalling;                   
	
	/**
	 * \if ENGLISH_LANG
	 * pedestrian run red light
	 * \else
	 * 行人闯红灯
	 * \endif
	 */
	public int               nPedestrianRunRedLight;           
	
	/**
	 * \if ENGLISH_LANG
	 * pass not in order
	 * \else
	 * 未按规定依次通行
	 * \endif
	 */
	public int               nPassNotInOrder;                  
}

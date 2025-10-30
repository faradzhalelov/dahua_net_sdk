package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * ViolationCode  Violation code configuration
 * \else
 * ViolationCode 代码配置表
 * \endif
 */
public class VIOLATIONCODE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Retrograde
	 * \else
	 * 逆行   
	 * \endif
	 */
	public byte[]                szRetrograde = new byte[FinalVar.MAX_VIOLATIONCODE];			       
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 描述信息   
	 * \endif
	 */
	public byte[]                szRetrogradeDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];              
	
	/**
	 * \if ENGLISH_LANG
	 * Display name
	 * \else
	 * 显示名称   
	 * \endif
	 */
	public byte[]                szRetrogradeShowName = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT]; 

	/**
	 * \if ENGLISH_LANG
	 * Retrograde - high speed way
	 * \else
	 * 逆行-高速公路   
	 * \endif
	 */
	public byte[]				szRetrogradeHighway = new byte[FinalVar.MAX_VIOLATIONCODE];		
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 描述信息   
	 * \endif
	 */
	public byte[]				szRetrogradeHighwayDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];	
	
	/**
	 * \if ENGLISH_LANG
	 * Run red light
	 * \else
	 * 闯红灯  
	 * \endif
	 */
	public byte[]                szRunRedLight = new byte[FinalVar.MAX_VIOLATIONCODE];			 
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 描述信息   
	 * \endif
	 */
	public byte[]                szRunRedLightDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];			  
	
	/**
	 * \if ENGLISH_LANG
	 * Cross lane
	 * \else
	 * 变道   
	 * \endif
	 */
	public byte[]                szCrossLane = new byte[FinalVar.MAX_VIOLATIONCODE];				
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 描述信息  
	 * \endif
	 */
	public byte[]                szCrossLaneDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];			   
	
	/**
	 * \if ENGLISH_LANG
	 * Violation lane change display name
	 * \else
	 * 变道显示名称   
	 * \endif
	 */
	public byte[]                szCrossLaneShowName = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];    

	/**
	 * \if ENGLISH_LANG
	 * Turn left
	 * \else
	 * 左转   
	 * \endif
	 */
	public byte[]                szTurnLeft = new byte[FinalVar.MAX_VIOLATIONCODE];				 
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 描述信息   
	 * \endif
	 */
	public byte[]                szTurnLeftDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];				  

	/**
	 * \if ENGLISH_LANG
	 * Turn right
	 * \else
	 * 右转   
	 * \endif
	 */
	public byte[]                szTurnRight = new byte[FinalVar.MAX_VIOLATIONCODE];				
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 描述信息   
	 * \endif
	 */
	public byte[]                szTurnRightDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];				

	/**
	 * \if ENGLISH_LANG
	 * U_turn
	 * \else
	 * 掉头   
	 * \endif
	 */
	public byte[]                szU_Turn = new byte[FinalVar.MAX_VIOLATIONCODE];				
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 描述信息   
	 * \endif
	 */
	public byte[]                szU_TurnDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];				 
	
	/**
	 * \if ENGLISH_LANG
	 * Display info 
	 * \else
	 * 显示信息   
	 * \endif
	 */
	public byte[]                szU_TurnShowName = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT]; 

	/**
	 * \if ENGLISH_LANG
	 * Jam
	 * \else
	 * 交通拥堵   
	 * \endif
	 */
	public byte[]                szJam = new byte[FinalVar.MAX_VIOLATIONCODE];					
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 描述信息   
	 * \endif
	 */
	public byte[]                szJamDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];					   
	
	/**
	 * \if ENGLISH_LANG
	 * Parking
	 * \else
	 * 停车   
	 * \endif
	 */
	public byte[]                szParking = new byte[FinalVar.MAX_VIOLATIONCODE];				
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 描述信息  
	 * \endif
	 */
	public byte[]                szParkingDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];		 	    
	
	/**
	 * \if ENGLISH_LANG
	 * Illegal parking display name
	 * \else
	 * 停车显示名称   
	 * \endif
	 */
	public byte[]                szParkingShowName = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];   

	// 超速 和 超速比例 只需且必须有一个配置
	/**
	 * \if ENGLISH_LANG
	 * Over speed
	 * \else
	 * 超速   
	 * \endif
	 */
	public byte[]                szOverSpeed = new byte[FinalVar.MAX_VIOLATIONCODE];				
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 描述信息   
	 * \endif
	 */
	public byte[]                szOverSpeedDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];				
	
	/**
	 * \if ENGLISH_LANG
	 * Over speed proportion code
	 * \else
	 * 超速比例代码   
	 * \endif
	 */
	public CFG_OVERSPEED_INFO[]  stOverSpeedConfig = new CFG_OVERSPEED_INFO[5];                       

	// 超速(高速公路) 和 超速比例(高速公路) 只需且必须有一个配置
	/**
	 * \if ENGLISH_LANG
	 * Over speed(high speed way)
	 * \else
	 * 超速-高速公路   
	 * \endif
	 */
	public byte[]                szOverSpeedHighway = new byte[FinalVar.MAX_VIOLATIONCODE];		
	
	/**
	 * \if ENGLISH_LANG
	 * Over speed-violation code
	 * \else
	 * 超速-描述信息   
	 * \endif
	 */
	public byte[]                szOverSpeedHighwayDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];	      	
	
	/**
	 * \if ENGLISH_LANG
	 * Over speed proportion code
	 * \else
	 * 超速比例代码   
	 * \endif
	 */
	public CFG_OVERSPEED_INFO[]  stOverSpeedHighwayConfig = new CFG_OVERSPEED_INFO[5];          

	// 欠速 和 欠速比例 只需且必须有一个配置
	/**
	 * \if ENGLISH_LANG
	 * Under speed
	 * \else
	 * 欠速   
	 * \endif
	 */
	public byte[]                szUnderSpeed = new byte[FinalVar.MAX_VIOLATIONCODE];	        
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 描述信息   
	 * \endif
	 */
	public byte[]                szUnderSpeedDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];	            
	
	/**
	 * \if ENGLISH_LANG
	 * Under speed proportion, diffrent under speed proportion has diffrent violation code
	 * \else
	 * 欠速配置信息	是一个数组，不同的欠速比代码不同，为空表示代码不区分超速比   
	 * \endif
	 */
	public CFG_OVERSPEED_INFO[]  stUnderSpeedConfig = new CFG_OVERSPEED_INFO[5];                            

	/**
	 * \if ENGLISH_LANG
	 * Over line
	 * \else
	 * 压线   
	 * \endif
	 */
	public byte[]                szOverLine = new byte[FinalVar.MAX_VIOLATIONCODE];				
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 描述信息   
	 * \endif
	 */
	public byte[]                szOverLineDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];			    	

	/**
	 * \if ENGLISH_LANG
	 * Cross line display name
	 * \else
	 * 压线显示名称   
	 * \endif
	 */
	public byte[]                szOverLineShowName = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];  

	/**
	 * \if ENGLISH_LANG
	 * Over yellow line
	 * \else
	 * 压黄线  
	 * \endif
	 */
	public byte[]                szOverYellowLine = new byte[FinalVar.MAX_VIOLATIONCODE];	    
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 描述信息   
	 * \endif
	 */
	public byte[]                szOverYellowLineDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];	    	

	/**
	 * \if ENGLISH_LANG
	 * Yellow in route
	 * \else
	 * 黄牌占道   
	 * \endif
	 */
	public byte[]                szYellowInRoute = new byte[FinalVar.MAX_VIOLATIONCODE];			                
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 黄牌占道描述信息   
	 * \endif
	 */
	public byte[]                szYellowInRouteDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];			
	
	/**
	 * \if ENGLISH_LANG
	 * Wrong route
	 * \else
	 * 不按车道行驶   
	 * \endif
	 */
	public byte[]                szWrongRoute = new byte[FinalVar.MAX_VIOLATIONCODE];			                
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 不按车道行驶描述信息   
	 * \endif
	 */
	public byte[]                szWrongRouteDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];				
	
	/**
	 * \if ENGLISH_LANG
	 * Driving on shoulder
	 * \else
	 * 路肩行驶   
	 * \endif
	 */
	public byte[]                szDrivingOnShoulder = new byte[FinalVar.MAX_VIOLATIONCODE];		                
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 路肩行驶描述信息   
	 * \endif
	 */
	public byte[]                szDrivingOnShoulderDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];		

	/**
	 * \if ENGLISH_LANG
	 * Normal passing
	 * \else
	 * 正常行驶   
	 * \endif
	 */
	public byte[]                szPassing = new byte[FinalVar.MAX_VIOLATIONCODE];                                
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 正常行驶描述信息   
	 * \endif
	 */
	public byte[]                szPassingDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];               	

	/**
	 * \if ENGLISH_LANG
	 * No passing
	 * \else
	 * 禁止行驶   
	 * \endif
	 */
	public byte[]                szNoPassing = new byte[FinalVar.MAX_VIOLATIONCODE];                             
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 禁止行驶描述信息  
	 * \endif
	 */
	public byte[]                szNoPassingDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT]; 				

	/**
	 * \if ENGLISH_LANG
	 * Fake plate
	 * \else
	 * 套牌   
	 * \endif
	 */
	public byte[]                szFakePlate = new byte[FinalVar.MAX_VIOLATIONCODE];                             
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 套牌描述信息   
	 * \endif
	 */
	public byte[]                szFakePlateDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT]; 				
	
	/**
	 * \if ENGLISH_LANG
	 * Parking space parking 
	 * \else
	 * 车位有车   
	 * \endif
	 */
	public byte[]                szParkingSpaceParking = new byte[FinalVar.MAX_VIOLATIONCODE];                   
	
	/**
	 * \if ENGLISH_LANG
	 * Description information in violation 
	 * \else
	 * 车位有车描述信息   
	 * \endif
	 */
	public byte[]                szParkingSpaceParkingDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT]; 		

	/**
	 * \if ENGLISH_LANG
	 * Parking space no parking
	 * \else
	 * 车位无车   
	 * \endif
	 */
	public byte[]                szParkingSpaceNoParking = new byte[FinalVar.MAX_VIOLATIONCODE];                 
	
	/**
	 * \if ENGLISH_LANG
	 * Description information in violation
	 * \else
	 * 车位无车描述信息    
	 * \endif
	 */
	public byte[]                szParkingSpaceNoParkingDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT]; 	
	
	/**
	 * \if ENGLISH_LANG
	 * Unfasten seat belt
	 * \else
	 * 不系安全带   
	 * \endif
	 */
	public byte[]                szWithoutSafeBelt = new byte[FinalVar.MAX_VIOLATIONCODE];                      
	
	/**
	 * \if ENGLISH_LANG
	 * Unfasten seat belt display name
	 * \else
	 * 不系安全带显示名称   
	 * \endif
	 */
	public byte[]                szWithoutSafeBeltShowName = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];      
	
	/**
	 * \if ENGLISH_LANG
	 * Unfasten seat belt violation description
	 * \else
	 * 不系安全带描述信息   
	 * \endif
	 */
    public byte[]                szWithoutSafeBeltDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT]; 	        

	/**
	 * \if ENGLISH_LANG
	 * Driver smaoking
	 * \else
	 * 驾驶员抽烟   
	 * \endif
	 */
    public byte[]                szDriverSmoking = new byte[FinalVar.MAX_VIOLATIONCODE];                          
    
	/**
	 * \if ENGLISH_LANG
	 * Driver smoking display name
	 * \else
	 * 驾驶员抽烟显示名称   
	 * \endif
	 */
    public byte[]                szDriverSmokingShowName = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];         
    
	/**
	 * \if ENGLISH_LANG
	 * Driver smoking with violation description
	 * \else
	 * 驾驶员抽烟带描述信息   
	 * \endif
	 */
    public byte[]                szDriverSmokingDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT]; 	         

	/**
	 * \if ENGLISH_LANG
	 * Driver  call
	 * \else
	 * 驾驶员打电话   
	 * \endif
	 */
    public byte[]                szDriverCalling = new byte[FinalVar.MAX_VIOLATIONCODE];                         
    
	/**
	 * \if ENGLISH_LANG
	 * Driver call display name
	 * \else
	 * 驾驶员打电话显示名称   
	 * \endif
	 */
    public byte[]                szDriverCallingShowName = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];         
    
	/**
	 * \if ENGLISH_LANG
	 * Driver call violation description
	 * \else
	 * 驾驶员打电话描述信息  
	 * \endif
	 */
    public byte[]                szDriverCallingDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT]; 	        
  
	/**
	 * \if ENGLISH_LANG
	 * violation backing
	 * \else
	 * 倒车   
	 * \endif
	 */
    public byte[]                szBacking = new byte[FinalVar.MAX_VIOLATIONCODE];                               
    
	/**
	 * \if ENGLISH_LANG
	 * violation backing display name
	 * \else
	 * 倒车显示名称   
	 * \endif
	 */
    public byte[]                szBackingShowName = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];	            
    
	/**
	 * \if ENGLISH_LANG
	 * violation backing description info 
	 * \else
	 * 倒车描述信息   
	 * \endif
	 */
    public byte[]                szBackingDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];                   

	/**
	 * \if ENGLISH_LANG
	 * illegal in lane
	 * \else
	 * 占道  
	 * \endif
	 */
    public byte[]                szVehicleInBusRoute = new byte[FinalVar.MAX_VIOLATIONCODE];                     
    
	/**
	 * \if ENGLISH_LANG
	 * illegal in lane display name
	 * \else
	 * 占道显示名称   
	 * \endif
	 */
    public byte[]                szVehicleInBusRouteShowName = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];    
    
	/**
	 * \if ENGLISH_LANG
	 * illegal in lane description info 
	 * \else
	 * 占道描述信息   
	 * \endif
	 */
    public byte[]                szVehicleInBusRouteDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];        

	/**
	 * \if ENGLISH_LANG
	 * pedestrian run red light
	 * \else
	 * 行人闯红灯   
	 * \endif
	 */
    public byte[]                szPedestrianRunRedLight = new byte[FinalVar.MAX_VIOLATIONCODE];                     
    
	/**
	 * \if ENGLISH_LANG
	 * pedestrian run red light display name
	 * \else
	 * 行人闯红灯显示名称   
	 * \endif
	 */
    public byte[]                szPedestrianRunRedLightShowName = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];    
    
	/**
	 * \if ENGLISH_LANG
	 * pedestrian run red light description info
	 * \else
	 * 行人闯红灯描述信息   
	 * \endif
	 */
    public byte[]                szPedestrianRunRedLightDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];        
    
	/**
	 * \if ENGLISH_LANG
	 * Pass not in order
	 * \else
	 * 未按规定依次通行   
	 * \endif
	 */
    public byte[]                szPassNotInOrder = new byte[FinalVar.MAX_VIOLATIONCODE];                            
    
	/**
	 * \if ENGLISH_LANG
	 * Pass not in order display name
	 * \else
	 * 未按规定依次通行显示名称
	 * \endif
	 */
    public byte[]                szPassNotInOrderShowName = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];           
    
	/**
	 * \if ENGLISH_LANG
	 * Pass not in order description info
	 * \else
	 * 未按规定依次通行描述信息
	 * \endif
	 */
    public byte[]                szPassNotInOrderDesc = new byte[FinalVar.MAX_VIOLATIONCODE_DESCRIPT];               

    public VIOLATIONCODE_INFO() {
    	for(int i=0; i<5; i++) {
    		stOverSpeedConfig[i] = new CFG_OVERSPEED_INFO();
    		stOverSpeedHighwayConfig[i] = new CFG_OVERSPEED_INFO();
    		stUnderSpeedConfig[i] = new CFG_OVERSPEED_INFO();
    	}
    }
}

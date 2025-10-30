package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Road info
 * \else
 * 车道信息
 * \endif
 */
public class CFG_LANE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Road ID
	 * \else
	 * 车道编号
	 * \endif
	 */
	public int                nLaneId;                           
	
	/**
	 * \if ENGLISH_LANG
	 * Road direction(where the car go),0-north 1-east north 2-east 3-east south 4-south 5-west south 6-west 7-west north
	 * \else
	 * 车道方向(车开往的方向),0-北 1-东北 2-东 3-东南 4-南 5-西南 6-西 7-西北
	 * \endif
	 */
	public int                nDirection;                        
	
	/**
	 * \if ENGLISH_LANG
	 * Left road line,acord the road left is left road line
	 * \else
	 * 左车道线，车道线的方向表示车道方向，沿车道方向左边的称为左车道线
	 * \endif
	 */
	public CFG_POLYLINE[]     stuLeftLine = new CFG_POLYLINE[FinalVar.MAX_POLYLINE_NUM];     
	
	/**
	 * \if ENGLISH_LANG
	 * Left road line number
	 * \else
	 * 左车道线顶点数
	 * \endif
	 */
	public int                nLeftLineNum;                      
	
	/**
	 * \if ENGLISH_LANG
	 * Right road line,acord the road right is right road line
	 * \else
	 * 右车道线，车道线的方向表示车道方向，沿车道方向右边的称为右车道线
	 * \endif
	 */
	public CFG_POLYLINE[]     stuRightLine = new CFG_POLYLINE[FinalVar.MAX_POLYLINE_NUM];    
	
	/**
	 * \if ENGLISH_LANG
	 * Right road line number
	 * \else
	 * 右车道线顶点数
	 * \endif
	 */
	public int                nRightLineNum;                     
	
	/**
	 * \if ENGLISH_LANG
	 * Left road line attribute,1 means white solid line, 2 means withe dotted line, 3 means yellow line
	 * \else
	 * 左车道线属性，1-表示白实线，2- 白虚线，3- 黄线
	 * \endif
	 */
	public int                nLeftLineType;                     
	
	/**
	 * \if ENGLISH_LANG
	 * Right road line attribute, 1 means white solid line, 2 means withe dotted line, 3 means yellow line
	 * \else
	 * 右车道线属性，1-表示白实线，2- 白虚线，3- 黄线
	 * \endif
	 */
	public int                nRightLineType;                    
	
	/**
	 * \if ENGLISH_LANG
	 * Road direction enable
	 * \else
	 * 车道行驶方向使能
	 * \endif
	 */
	public boolean            bDriveDirectionEnable;             
	
	/**
	 * \if ENGLISH_LANG
	 * Road direction number
	 * \else
	 * 车道行驶方向数 
	 * \endif
	 */
	public int                nDriveDirectionNum;                
	
	/**
	 * \if ENGLISH_LANG
	 * Road direction,"Straight","TurnLeft","TurnRight","U-Turn"
	 * \else
	 * 车道行驶方向，"Straight" 直行，"TurnLeft" 左转，"TurnRight" 右转,"U-Turn":掉头
	 * \endif
	 */
	public byte[][]           szDriveDirection = new byte[FinalVar.MAX_LIGHT_DIRECTION][FinalVar.MAX_NAME_LEN];  
	
	/**
	 * \if ENGLISH_LANG
	 * Road's stop line's point number
	 * \else
	 * 车道对应停止线顶点数
	 * \endif
	 */
	public int                nStopLineNum;                      
	
	/**
	 * \if ENGLISH_LANG
	 * Road's stop line
	 * \else
	 * 车道对应停止线
	 * \endif
	 */
	public CFG_POLYLINE[]     stuStopLine = new CFG_POLYLINE[FinalVar.MAX_POLYLINE_NUM]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Road's traffic light group id
	 * \else
	 * 车道对应的红绿灯组编号
	 * \endif
	 */
	public int                nTrafficLightNumber;              

	/**
	 * \if ENGLISH_LANG
	 * Detect capacity
	 * \else
	 * 对应能力集
	 * \endif
	 */
	public boolean            abDetectLine;                      
	
	public boolean            abPreLine;
	public boolean            abPostLine;
	public byte[]             byReserved = new byte[1];
	public int                nDetectLine;
	
	/**
	 * \if ENGLISH_LANG
	 * Road detect line
	 * \else
	 * 车道对应的检测线
	 * \endif
	 */
	public CFG_POLYLINE[]     stuDetectLine = new CFG_POLYLINE[FinalVar.MAX_POLYLINE_NUM];  
	
	public int                nPreLine;
	
	/**
	 * \if ENGLISH_LANG
	 * Road preline
	 * \else
	 * 车道对应的前置线
	 * \endif
	 */
	public CFG_POLYLINE[]     stuPreLine = new CFG_POLYLINE[FinalVar.MAX_POLYLINE_NUM];      
	
	public int                nPostLine;
	
	/**
	 * \if ENGLISH_LANG
	 * Road post line
	 * \else
	 * 车道对应的后置线
	 * \endif
	 */
	public CFG_POLYLINE[]     stuPostLine = new CFG_POLYLINE[FinalVar.MAX_POLYLINE_NUM];     
	
	/**
	 * \if ENGLISH_LANG
	 * Lane traffic information
	 * \else
	 * 车道流量信息
	 * \endif
	 */
	public CFG_TRAFFIC_FLOWSTAT_DIR_INFO stuTrafficFlowDir = new CFG_TRAFFIC_FLOWSTAT_DIR_INFO();	  
	
	/**
	 * \if ENGLISH_LANG
	 * the type of rank, refer to {@link EM_LANE_RANK_TYPE}
	 * \else
	 * 道路等级，用于车流量统计上报交通状态,对应 {@link EM_LANE_RANK_TYPE}
	 * \endif
	 */
	public int				  emRankType;					  
	
	public CFG_LANE() {
		for(int i=0; i<FinalVar.MAX_POLYLINE_NUM; i++) {
			stuLeftLine[i] = new CFG_POLYLINE();
		}
		
		for(int i=0; i<FinalVar.MAX_POLYLINE_NUM; i++) {
			stuRightLine[i] = new CFG_POLYLINE();
		}
		
		for(int i=0; i<FinalVar.MAX_POLYLINE_NUM; i++) {
			stuStopLine[i] = new CFG_POLYLINE();
		}
		
		for(int i=0; i<FinalVar.MAX_POLYLINE_NUM; i++) {
			stuDetectLine[i] = new CFG_POLYLINE();
		}
		
		for(int i=0; i<FinalVar.MAX_POLYLINE_NUM; i++) {
			stuPreLine[i] = new CFG_POLYLINE();
		}
		
		for(int i=0; i<FinalVar.MAX_POLYLINE_NUM; i++) {
			stuPostLine[i] = new CFG_POLYLINE();
		}
	}
}

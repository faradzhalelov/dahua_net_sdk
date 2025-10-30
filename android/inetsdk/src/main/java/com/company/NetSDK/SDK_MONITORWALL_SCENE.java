package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * tv wall scheme tour status info 
 * \else
 * 电视墙预案轮巡状态信息
 * \endif
 */
public class SDK_MONITORWALL_SCENE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * name of plan
	 * \else
	 * 当前预案名称
	 * \endif
	 */
    public byte[]                  szName = new byte[FinalVar.SDK_DEV_NAME_LEN];       
    
	 /**
	 * \if ENGLISH_LANG
	 * control ID
	 * \else
	 * 控制ID
	 * \endif
	 */
    public byte[]                  szControlID = new byte[FinalVar.SDK_DEV_ID_LEN];     
    
	 /**
	 * \if ENGLISH_LANG
	 * monitor wall configuration
	 * \else
	 * 电视墙配置    
	 * \endif
	 */
    public SDK_MONITORWALL         stuMonitorWall;                 
    
	 /**
	 * \if ENGLISH_LANG
	 * array of split scene,the space application by the user,apply to sizeof(SDK_SPLIT_SCENE)*nMaxSplitSceneCount
	 * \else
	 * 拼接屏场景信息数组, 用户分配内存，大小为sizeof(SDK_SPLIT_WINDOW)*nMaxWndCount
	 * \endif
	 */
    public SDK_SPLIT_SCENE[]       pstuSplitScene;                 
    
	 /**
	 * \if ENGLISH_LANG
	 * size of array
	 * \else
	 * 拼接屏场景数组大小, 用户填写
	 * \endif
	 */
    public int                     nMaxSplitSceneCount;            
    
	 /**
	 * \if ENGLISH_LANG
	 * return count
	 * \else
	 * 返回的拼接屏场景数量
	 * \endif
	 */
    public int                     nRetSplitSceneCount;            

    // splitSceneCount:拼接屏场景数组大小; blockCount:显示区块数组大小; OutputCount:显示单元数组大小; windowCount:窗口信息数组大小  
    public SDK_MONITORWALL_SCENE(int splitSceneCount, int blockCount, int OutputCount, int windowCount, int videoInputCount) {
    	stuMonitorWall = new SDK_MONITORWALL(blockCount, OutputCount);
    	
    	this.nMaxSplitSceneCount = splitSceneCount;
    	pstuSplitScene = new SDK_SPLIT_SCENE[splitSceneCount];
    	
    	for(int i = 0; i < splitSceneCount; ++i) {
    		pstuSplitScene[i] =  new SDK_SPLIT_SCENE(windowCount, videoInputCount);
    	}
    }
}

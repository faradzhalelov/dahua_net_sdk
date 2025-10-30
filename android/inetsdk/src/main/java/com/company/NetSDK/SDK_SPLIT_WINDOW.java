package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * info of split window
 * \else
 * 分割窗口信息
 * \endif
 */
public class SDK_SPLIT_WINDOW implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * 窗口是否有视频源
	 * \endif
	 */
    public boolean                 bEnable;                        
    
	 /**
	 * \if ENGLISH_LANG
	 * window ID
	 * \else
	 * 窗口ID
	 * \endif
	 */
    public int                     nWindowID;                      
    
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
	 * rect of window, effective when free split
	 * \else
	 * 窗口区域, 自由分割模式下有效
	 * \endif
	 */
    public SDK_RECT                stuRect = new SDK_RECT();                        
   
	 /**
	 * \if ENGLISH_LANG
	 * coordinate whether meet the conditions
	 * \else
	 * 坐标是否满足直通条件
	 * \endif
	 */
    public boolean                 bDirectable;                    
    
	 /**
	 * \if ENGLISH_LANG
	 * Z order
	 * \else
	 * 窗口Z次序
	 * \endif
	 */
    public int                     nZOrder;                        
    
	 /**
	 * \if ENGLISH_LANG
	 * source info
	 * \else
	 * 显示信息
	 * \endif
	 */
    public SDK_SPLIT_WND_SOURCE    stuSource;  
    
    public SDK_SPLIT_WINDOW(int videoInputCount) {
    	stuSource = new SDK_SPLIT_WND_SOURCE(videoInputCount);
    }
}

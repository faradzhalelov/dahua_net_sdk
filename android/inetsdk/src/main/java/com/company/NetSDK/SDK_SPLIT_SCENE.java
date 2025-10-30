package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * split scene
 * \else
 * 拼接屏场景
 * \endif
 */
public class SDK_SPLIT_SCENE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * 拼接屏ID
	 * \else
	 * composite ID
	 * \endif
	 */
	public byte[]				szCompositeID = new byte[FinalVar.SDK_DEV_ID_LEN];	
	
	 /**
	 * \if ENGLISH_LANG
	 * 控制ID
	 * \else
	 * control ID
	 * \endif
	 */
	public byte[]				szControlID = new byte[FinalVar.SDK_DEV_ID_LEN];	 
	
	 /**
	 * \if ENGLISH_LANG
	 * split mode, refer to {@link SDK_SPLIT_MODE}
	 * \else
	 * 分割模式, 取值参考 {@link SDK_SPLIT_MODE}
	 * \endif
	 */
	public int					emSplitMode;				
	
	 /**
	 * \if ENGLISH_LANG
	 * info of array,the space application by the user,apply to sizeof(SDK_SPLIT_WINDOW)*nMaxWndCount
	 * \else
	 * 窗口信息数组, 用户分配内存,大小为sizeof(SDK_SPLIT_WINDOW)*nMaxWndCount
	 * \endif
	 */
	public SDK_SPLIT_WINDOW[]	pstuWnds;						
	
	 /**
	 * \if ENGLISH_LANG
	 * size of array
	 * \else
	 * 窗口信息数组大小, 用户填写
	 * \endif
	 */
	public int					nMaxWndCount;					
	
	 /**
	 * \if ENGLISH_LANG
	 * return count
	 * \else
	 * 返回的窗口数量
	 * \endif
	 */
	public int					nRetWndCount;					
	
    // windowCount:窗口信息数组大小
	public SDK_SPLIT_SCENE(int windowCount, int videoInputCount) {
		this.nMaxWndCount = windowCount;
		pstuWnds = new SDK_SPLIT_WINDOW[windowCount];
		for(int i = 0; i < windowCount; ++i) {
			pstuWnds[i] = new SDK_SPLIT_WINDOW(videoInputCount);
		}
	}
}

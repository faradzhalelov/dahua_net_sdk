package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#DoFind} port {@link NET_FIND#NET_FIND_RADIOMETRY} command to output parameter
* \else
* {@link INetSDK#DoFind} 接口 {@link NET_FIND#NET_FIND_RADIOMETRY} 命令出参
* \endif
*/
public class NET_OUT_RADIOMETRY_DOFIND implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * actual query spot number
	 * \else
	 * 实际查询到的点数
	 * \endif
	 */
    public int                         nFound;                             
    
	 /**
	 * \if ENGLISH_LANG
	 * temperature statistics info 
	 * \else
	 * 温度统计信息
	 * \endif
	 */
    public NET_RADIOMETRY_QUERY[]      stInfo = new NET_RADIOMETRY_QUERY[FinalVar.NET_RADIOMETRY_DOFIND_MAX];  
	
    public NET_OUT_RADIOMETRY_DOFIND() {
    	for (int i = 0; i < stInfo.length; i++) {
			stInfo[i] = new NET_RADIOMETRY_QUERY();
		}
	}
}

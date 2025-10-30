package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetDevCaps} output param, corresponding to command {@link FinalVar#NET_VIDEOIN_CAPS}
 * \else
 * {@link INetSDK#GetDevCaps} 出参, 对应命令{@link FinalVar#NET_VIDEOIN_CAPS}
 * \endif
 */
public class NET_VIDEOIN_CONFLICT_CAPS implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable conflict
	 * \else
	 * 是否存在资源冲突项
	 * \endif
	 */
    public boolean                     bConflict;              
    
	/**
	 * \if ENGLISH_LANG
	 * Conflict Number
	 * \else
	 * 冲突项数量
	 * \endif
	 */
    public int                         nConflictNum;               
    
	/**
	 * \if ENGLISH_LANG
	 * Conflict 
	 * \else
	 * 冲突项
	 * \endif
	 */
    public NET_CONFLICT_TYPE[]         stuConflict = new NET_CONFLICT_TYPE[128];    
    
    public NET_VIDEOIN_CONFLICT_CAPS() {
    	for(int i = 0; i < 128; ++i) {
    		stuConflict[i] = new NET_CONFLICT_TYPE();
    	}
    }
}

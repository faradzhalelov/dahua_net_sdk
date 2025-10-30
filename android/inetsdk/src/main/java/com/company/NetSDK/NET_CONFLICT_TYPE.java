package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#GetDevCaps}, {@link FinalVar#NET_VIDEOIN_CAPS} command output param
 * \else
 * {@link INetSDK#GetDevCaps}接口, {@link FinalVar#NET_VIDEOIN_CAPS} 命令出参
 * \endif
 */
public class NET_CONFLICT_TYPE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * conflict 1, refer to {@link NET_ENUM_CONFLICT_TYPE}
	 * \else
	 * 冲突项1, 取值参考 {@link NET_ENUM_CONFLICT_TYPE}
	 * @see 
	 * \endif
	 */
    public int          emConflict1;                    
    
	/**
	 * \if ENGLISH_LANG
	 * conflict 2, refer to {@link NET_ENUM_CONFLICT_TYPE}
	 * \else
	 * 冲突项2, 取值参考 {@link NET_ENUM_CONFLICT_TYPE}
	 * \endif
	 */
    public int        emConflict2;            
}

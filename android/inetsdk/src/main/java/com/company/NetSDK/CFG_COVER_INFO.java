package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Cover Info
 * \else
 * 遮挡信息
 * \endif
 */
public class CFG_COVER_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Capability 
	 * \else
	 * 能力
	 * \endif
	 */
	public boolean				abBlockType;
	public boolean				abEncodeBlend;
	public boolean				abPreviewBlend;

	/**
	 * \if ENGLISH_LANG
	 * Covered Area Coordinate 
	 * \else
	 * 覆盖的区域坐标
	 * \endif
	 */
	public CFG_RECT				stuRect = new CFG_RECT();					

	/**
	 * \if ENGLISH_LANG
	 * Covered Color 
	 * \else
	 * 覆盖的颜色
	 * \endif
	 */
	public CFG_RGBA				stuColor = new CFG_RGBA();					

	/**
	 * \if ENGLISH_LANG
	 * Covering Type. 0-Black, 1-Mosaic
	 * \else
	 * 覆盖方式;0－黑块，1－马赛克
	 * \endif
	 */
	public int					nBlockType;					

	/**
	 * \if ENGLISH_LANG
	 * Encode Blend.1-Take Effect;0-No Effect
	 * \else
	 * 编码级遮挡;1－生效，0－不生效
	 * \endif
	 */
	public int					nEncodeBlend;				

	/**
	 * \if ENGLISH_LANG
	 * Preview Blend;1-Take Effect;0-No Effect
	 * \else
	 * 预览遮挡;1－生效，0－不生效
	 * \endif
	 */
	public int					nPreviewBlend;				
}

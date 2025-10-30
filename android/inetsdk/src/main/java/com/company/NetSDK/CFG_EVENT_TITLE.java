package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event title content structure
 * \else
 * 事件标题内容结构体
 * \endif
 */
public class CFG_EVENT_TITLE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * title content 
	 * \else
	 * 标题
	 * \endif
	 */
	public byte					szText[] = new byte[FinalVar.MAX_CHANNELNAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Title Upper left coordinate, use 0-8191  relative coordinate systemTie
	 * \else
	 * 标题左上角坐标, 采用0-8191相对坐标系
	 * \endif
	 */
	public CFG_POLYGON			stuPoint = new CFG_POLYGON();			

	/**
	 * \if ENGLISH_LANG
	 * Title width and height,use 0-8191  relative coordinate system，one or two item(s) is(are)0 means text self-adaptive to width-height
	 * \else
	 * 标题的宽度和高度,采用0-8191相对坐标系，某项或者两项为0表示按照字体自适应宽高
	 * \endif
	 */
	public CFG_SIZE     		stuSize = new CFG_SIZE();			

	/**
	 * \if ENGLISH_LANG
	 * Foreground color
	 * \else
	 * 前景颜色
	 * \endif
	 */
	public CFG_RGBA				stuFrontColor = new CFG_RGBA();		

	/**
	 * \if ENGLISH_LANG
	 * Background color
	 * \else
	 * 背景颜色
	 * \endif
	 */
	public CFG_RGBA				stuBackColor = new CFG_RGBA();		
}

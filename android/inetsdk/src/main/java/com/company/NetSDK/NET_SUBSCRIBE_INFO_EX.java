package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Subscrbie info
 * \else
 * 订阅类型
 * \endif
 */
public class NET_SUBSCRIBE_INFO_EX implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Event code
	 * \else
	 * 事件码
	 * \endif
	 */
	public byte                            szCode[] = new byte[FinalVar.MAX_COMMON_STRING_64];

	/**
	 * \if ENGLISH_LANG
	 * Sub Event code
	 * \else
	 * 事件子类型
	 * \endif
	 */
	public byte				            szSubCode[] = new byte[FinalVar.MAX_COMMON_STRING_64];

	/**
	 * \if ENGLISH_LANG
	 * channel aggregate
	 * \else
	 * 订阅的通道数量, 若无通道概念则为0
	 * \endif
	 */
	public int                             nChnNum;

	/**
	 * \if ENGLISH_LANG
	 * effective when attach "CallNoAnswered "
	 * \else
	 * 通道号集合
	 * \endif
	 */
	public int                             nIndexs[] = new int[FinalVar.MAX_MOBILE_CHANNEL_NUM];

	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 订阅"CallNoAnswered "事件时有效
	 * \endif
	 */
	public byte                            szNumber[] = new byte[FinalVar.SDK_COMMON_STRING_16];

	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 手机端收到此事件时播放需播放的声音文件
	 * \endif
	 */
	public byte                            szSound[] = new byte[FinalVar.SDK_COMMON_STRING_64];

	/**
	 * \if ENGLISH_LANG
	 * channel aggregate extension
	 * \else
	 * 通道号集合扩展
	 * \endif
	 */
	public byte				szIndexsExt[][] = new byte[FinalVar.SDK_COMMON_STRING_32][FinalVar.SDK_COMMON_STRING_16];

	/**
	 * \if ENGLISH_LANG
	 * Custom filter, the type decided by szCode.Other unsupported types are filled in NULL
	 * When szCode is "FaceComparision", the type is: NET_CUSTOM_TILTER_OF_FACE_COMPARISION (currently only supported)
	 * \else
	 * 过滤器, 由szCode的类型决定,其他未支持类型则填NULL
	 * 当szCode为"FaceComparision"时，如果用户需要目标过滤，类型为：NET_CUSTOM_TILTER_OF_FACE_COMPARISION(目前只支持这种)
	 * \endif
	 */
	public Object 	pstuCustomFilter;
}

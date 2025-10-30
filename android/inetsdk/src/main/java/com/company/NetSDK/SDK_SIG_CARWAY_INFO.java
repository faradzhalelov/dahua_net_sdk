package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Snapshot info
 * \else
 * 抓拍信息
 * \endif
 */
public class SDK_SIG_CARWAY_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Current car speed,km/h
	 * \else
	 * 当前车的速度，km/h
	 * \endif
	 */
	public short              snSpeed;
	
	/**
	 * \if ENGLISH_LANG
	 * Current car length, dm
	 * \else
	 * 当前车长,分米为单位
	 * \endif
	 */
	public short              snCarLength;
	
	/**
	 * \if ENGLISH_LANG
	 * Current red light time, s.ms
	 * \else
	 * 当前车道红灯时间,秒.毫秒
	 * \endif
	 */
	public float              fRedTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Current car way snapshot time, s.ms 
	 * \else
	 * 当前车道抓拍时间,秒.毫秒
	 * \endif
	 */
	public float              fCapTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Current snapshot Sequence
	 * \else
	 * 当前抓拍序号
	 * \endif
	 */
	public byte               bSigSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * current snapshot type
	 * 0: radar up speed limit;1: radar low speed limit;2: car detector up speed limit;3:car detector low speed limit
	 * 4: reverse;5: break red light;6: red light on;7: red light off;8: snapshot or traffic gate
	 * \else
	 * 当前车道的抓拍类型
	 * 0: 雷达高限速;1: 雷达低限速;2: 车检器高限速;3:车检器低限速
	 * 4: 逆向;5: 闯红灯;6: 红灯亮;7: 红灯灭;8: 全部抓拍或者卡口
	 * \endif
	 */
	public byte               bType;
	
	/**
	 * \if ENGLISH_LANG
	 * Breaking type :01:left turn;02:straight;03:right
	 * \else
	 * 闯红灯类型:01:左转红灯;02:直行红灯;03:右转红灯
	 * \endif
	 */
	public byte               bDirection;
	
	/**
	 * \if ENGLISH_LANG
	 * Current car way traffic light state,0: green, 1: red, 2: yellow
	 * \else
	 * 当前车道的红绿灯状态，0: 绿灯, 1: 红灯, 2: 黄灯
	 * \endif
	 */
	public byte               bLightColor;
	
	/**
	 * \if ENGLISH_LANG
	 * Snap flag from device
	 * \else
	 * 设备产生的抓拍标识
	 * \endif
	 */
	public byte               bSnapFlag[] = new byte[16];
}

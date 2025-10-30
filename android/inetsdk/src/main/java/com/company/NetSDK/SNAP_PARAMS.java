package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Snapshot parameter structure 
 * \else
 * 抓图参数结构体
 * \endif
 */
public class SNAP_PARAMS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Snapshot channel
	 * \else
	 * 抓图的通道
	 * \endif
	 */
	public int				Channel;
	
	/**
	 * \if ENGLISH_LANG
	 * Image quality:level 1 to level 6
	 * \else
	 * 画质；1~6
	 * \endif
	 */
	public int				Quality;
	
	/**
	 * \if ENGLISH_LANG
	 * Video size;0:QCIF,1:CIF,2:D1
	 * \else
	 * 画面大小；0：QCIF，1：CIF，2：D1
	 * \endif
	 */
	public int				ImageSize;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot mode;0:request one frame,1:send out requestion regularly,2: Request consecutively
	 * \else
	 * 抓图模式；0：表示请求一帧，1：表示定时发送请求，2：表示连续请求
	 * \endif
	 */
	public int				mode;
	
	/**
	 * \if ENGLISH_LANG
	 * Time unit is second.If mode=1, it means send out requestion regularly. The time is valid.
	 * \else
	 * 时间单位秒；若mode=1表示定时发送请求时，此时间有效
	 * \endif
	 */
	public int				InterSnap;
	
	/**
	 * \if ENGLISH_LANG
	 * Request serial number
	 * \else
	 * 请求序列号
	 * \endif
	 */
	public int				CmdSerial;
}

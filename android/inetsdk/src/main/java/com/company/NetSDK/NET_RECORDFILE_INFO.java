package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record file information
 * \else
 * 录像文件信息
 * \endif
 */
public class NET_RECORDFILE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel number
	 * \else
	 * 通道号
	 * \endif
	 */
	public int					ch;
	
	/**
	 * \if ENGLISH_LANG
	 * File name 
	 * \else
	 * 文件名
	 * \endif
	 */
	public char					filename[] = new char[128];
	
	/**
	 * \if ENGLISH_LANG
	 * File length 
	 * \else
	 * 文件长度
	 * \endif
	 */
	public int					size;
	
	/**
	 * \if ENGLISH_LANG
	 * Start time
	 * \else
	 * 开始时间
	 * \endif
	 */
	public NET_TIME				starttime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * End time 
	 * \else
	 * 结束时间
	 * \endif
	 */
	public NET_TIME				endtime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * HDD number 
	 * \else
	 * 磁盘号(区分网络录像和本地录像的类型，0－127表示本地录像,其中64表示光盘1，128表示网络录像)
	 * \endif
	 */
	public int					driveno;
	
	/**
	 * \if ENGLISH_LANG
	 * Initial cluster number 
	 * \else
	 * 起始簇号
	 * \endif
	 */
	public int					startcluster;
	
	/**
	 * \if ENGLISH_LANG
	 * Recorded file type  0:general record;1:alarm record ;2:motion detection;3:card number record ;4:image
	 * \else
	 * 录象文件类型  0：普通录象；1：报警录象；2：移动检测；3：卡号录象；4：图片
	 * \endif
	 */
	public byte					nRecordFileType;
	
	/**
	 * \if ENGLISH_LANG
	 * 0:general record 1:Important record
	 * \else
	 * 0:普通录像 1:重要录像
	 * \endif
	 */
	public byte                 bImportantRecID;
	
	/**
	 * \if ENGLISH_LANG
	 * Document Indexing, when nRecordFileType == 4(Picture), "bImportantRecID << 8 + bHint" is index 
	 * \else
	 * 文件定位索引, nRecordFileType == 4(图片)时, "bImportantRecID << 8 + bHint", 组成图片定位索引 
	 * \endif
	 */
	public byte                 bHint;
	
	/**
	 * \if ENGLISH_LANG
	 * 0-main stream record 1-sub1 stream record 2-sub2 stream record 3-sub3 stream record
	 * \else
	 * 0-主码流录像 1-辅码1流录像 2-辅码流2 3-辅码流3录像
	 * \endif
	 */
	public byte                 bRecType;


	/**
	 * \if ENGLISH_LANG
	 * the total number of file frames
	 * \else
	 * 文件总帧数
	 * \endif
	 */
	public int					framenum;
}

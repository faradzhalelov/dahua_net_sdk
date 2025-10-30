package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#SetMarkFile} input paramer
 * \else
 * 接口{@link INetSDK#SetMarkFile}入参
 * \endif
 */
public class NET_IN_SET_MARK_FILE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * mode of lock for record, refer to {@link EM_MARKFILE_MODE}
	 * \else
	 * 录像加锁方式,取值参考 {@link EM_MARKFILE_MODE}
	 * \endif
	 */
	public int	                    emLockMode;								
	
	/**
	 * \if ENGLISH_LANG
	 * way of create file name , refer to {@link EM_MARKFILE_NAMEMADE_TYPE}
	 * \else
	 * 文件名产生的方式,取值参考 {@link EM_MARKFILE_NAMEMADE_TYPE}
	 * \endif
	 */
	public int						emFileNameMadeType;						 
	
	/**
	 * \if ENGLISH_LANG
	 * channel ID
	 * \else
	 * 通道号
	 * \endif
	 */
    public int						nChannelID;								
    
	/**
	 * \if ENGLISH_LANG
	 * file name
	 * \else
	 * 文件名
	 * \endif
	 */
    public byte[]				    szFilename = new byte[FinalVar.MAX_PATH];	               
    
	/**
	 * \if ENGLISH_LANG
	 * the total number of file frames
	 * \else
	 * 文件总帧数
	 * \endif
	 */
    public int					    nFramenum;								
    
	/**
	 * \if ENGLISH_LANG
	 * File length 
	 * \else
	 * 文件长度
	 * \endif
	 */
    public int						nSize;									
    
	/**
	 * \if ENGLISH_LANG
	 * Start time 
	 * \else
	 * 开始时间
	 * \endif
	 */
    public NET_TIME					stuStartTime = new NET_TIME();							
    
	/**
	 * \if ENGLISH_LANG
	 * End time 
	 * \else
	 * 结束时间
	 * \endif
	 */
    public NET_TIME					stuEndTime = new NET_TIME();								
    
	/**
	 * \if ENGLISH_LANG
	 * HDD number
	 * \else
	 * 磁盘号(区分网络录像和本地录像的类型,0－127表示本地录像,其中64表示光盘1,128表示网络录像)
	 * \endif
	 */
    public int						nDriveNo;							
    
	/**
	 * \if ENGLISH_LANG
	 * Initial cluster number
	 * \else
	 * 起始簇号
	 * \endif
	 */
    public int						nStartCluster;							
    
	/**
	 * \if ENGLISH_LANG
	 * Recorded file type  0:general record;1:alarm record ;2:motion detection;3:card number record ;4:image;5:Smart record 
	 * \else
	 * 录象文件类型  0：普通录象；1：报警录象；2：移动检测；3：卡号录象；4：图片, 5: 智能录像
	 * \endif
	 */
    public byte						byRecordFileType;						
    
	/**
	 * \if ENGLISH_LANG
	 * 0:general record, 1:Important record
	 * \else
	 * 0:普通录像 1:重要录像
	 * \endif
	 */
    public byte						byImportantRecID;						
    
	/**
	 * \if ENGLISH_LANG
	 * Document Indexing
	 * \else
	 * 文件定位索引(nRecordFileType==4<图片>时,bImportantRecID<<8 +bHint ,组成图片定位索引 )
	 * \endif
	 */
    public byte						byHint;									
    
	/**
	 * \if ENGLISH_LANG
	 * 0-main stream record 1-sub1 stream record 2-sub2 stream record 3-sub3 stream record
	 * \else
	 * 0-主码流录像  1-辅码流1录像 2-辅码流2录像 3-辅码流3录像
	 * \endif
	 */
    public byte						byRecType;							
	
}

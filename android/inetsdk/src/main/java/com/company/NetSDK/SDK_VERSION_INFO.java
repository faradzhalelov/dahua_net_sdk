package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device software version information. The higher 16-bit means the main version number and low 16-bit means second version number
 * \else
 * 设备软件版本信息，高16位表示主版本号，低16位表示次版本号
 * \endif
 */
public class SDK_VERSION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Software version 
	 * \else
	 * 软件版本 
	 * \endif
	 */
	public int				dwSoftwareVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Software version compiled date 
	 * \else
	 * 软件版本编译日期 
	 * \endif
	 */
	public int				dwSoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Dsp Software version 
	 * \else
	 * dsp软件版本
	 * \endif
	 */
	public int				dwDspSoftwareVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Dsp Software version compiled date 
	 * \else
	 * dsp软件版本编译日期
	 * \endif
	 */
	public int				dwDspSoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Not used 
	 * \else
	 * 现在没有使用 
	 * \endif
	 */
	public int				dwPanelVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Not used 
	 * \else
	 * 现在没有使用 
	 * \endif
	 */
	public int				dwPanelSoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Hardware version 
	 * \else
	 * 硬件版本 
	 * \endif
	 */
	public int				dwHardwareVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Not used 
	 * \else
	 * 现在没有使用 
	 * \endif
	 */
	public int				dwHardwareDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Web version 
	 * \else
	 * web版本
	 * \endif
	 */
	public int				dwWebVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * The date of the web version of the compiler 
	 * \else
	 * web版本编译日期 
	 * \endif
	 */
	public int				dwWebBuildDate;
}

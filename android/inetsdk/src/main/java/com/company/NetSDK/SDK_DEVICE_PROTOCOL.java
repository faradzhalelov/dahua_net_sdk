package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device protocol type
 * \else
 * 设备协议类型
 * \endif
 */
public class SDK_DEVICE_PROTOCOL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Private 2nd protocol
	 * \else
	 * 私有2代协议
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_DAHUA2 = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Private 3rd protocol
	 * \else
	 * 私有3代协议
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_DAHUA3 = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Onvif
	 * \else
	 * Onvif
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_ONVIF = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Virtual network computer
	 * \else
	 * 虚拟网络计算机
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_VNC = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Private protocol of private    
	 * \else
	 * 私有私有协议      
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_PRIVATE = 100;
	
	/**
	 * \if ENGLISH_LANG
	 * Aebell
	 * \else
	 * AEBELL  
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_AEBELL = 101;
	
	/**
	 * \if ENGLISH_LANG
	 * Panasonic
	 * \else
	 * PANASONIC   
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_PANASONIC = 102;
	
	/**
	 * \if ENGLISH_LANG
	 * Sony
	 * \else
	 * SONY   
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_SONY = 103;
	
	/**
	 * \if ENGLISH_LANG
	 * Dynacolor 
	 * \else
	 * Dynacolor 
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_DYNACOLOR = 104;
	
	/**
	 * \if ENGLISH_LANG
	 * Tcsw
	 * \else
	 * Tcsw
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_TCWS = 105;
	
	/**
	 * \if ENGLISH_LANG
	 * Sansung
	 * \else
	 * Sansung
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_SAMSUNG = 106;
	
	/**
	 * \if ENGLISH_LANG
	 * YOKO  
	 * \else
	 * YOKO  
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_YOKO = 107;
	
	/**
	 * \if ENGLISH_LANG
	 * axis
	 * \else
	 * axis
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_AXIS = 108;
	
	/**
	 * \if ENGLISH_LANG
	 * Sanyo
	 * \else
	 * Sanyo
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_SANYO = 109;
	
	/**
	 * \if ENGLISH_LANG
	 * Bosch
	 * \else
	 * Bosch
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_BOSH = 110;
	
	/**
	 * \if ENGLISH_LANG
	 * Peclo	
	 * \else
	 * Peclo	
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_PECLO = 111;
	
	/**
	 * \if ENGLISH_LANG
	 * Provideo	
	 * \else
	 * Provideo	
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_PROVIDEO = 112;
	
	/**
	 * \if ENGLISH_LANG
	 * ACTi	
	 * \else
	 * ACTi	
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_ACTI = 113;
	
	/**
	 * \if ENGLISH_LANG
	 * Vivotek
	 * \else
	 * Vivotek
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_VIVOTEK = 114;
	
	/**
	 * \if ENGLISH_LANG
	 * Arecont 
	 * \else
	 * Arecont 
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_ARECONT = 115;
	
	/**
	 * \if ENGLISH_LANG
	 * PrivateEH
	 * \else
	 * PrivateEH
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_PRIVATEEH = 116;
	
	/**
	 * \if ENGLISH_LANG
	 * IMatek 
	 * \else
	 * IMatek 
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_IMATEK = 117;
	
	/**
	 * \if ENGLISH_LANG
	 * Shany
	 * \else
	 * Shany
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_SHANY = 118;
	
	/**
	 * \if ENGLISH_LANG
	 * VIDEOTREC
	 * \else
	 * VIDEOTREC
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_VIDEOTREC = 119;
	
	/**
	 * \if ENGLISH_LANG
	 * Ura
	 * \else
	 * Ura
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_URA = 120;
	
	/**
	 * \if ENGLISH_LANG
	 * Bticino
	 * \else
	 * Bticino
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_BITICINO = 121;
	
	/**
	 * \if ENGLISH_LANG
	 * Onvif's protocol type, same to SDK_PROTOCOL_ONVIF   
	 * \else
	 * Onvif协议类型, 同 SDK_PROTOCOL_ONVIF 
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_ONVIF2 = 122;
	
	/**
	 * \if ENGLISH_LANG
	 * Shepherd
	 * \else
	 * Shepherd
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_SHEPHERD = 123;
	
	/**
	 * \if ENGLISH_LANG
	 * Yaan
	 * \else
	 * Yaan
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_YAAN = 124;
	
	/**
	 * \if ENGLISH_LANG
	 * Airpop 
	 * \else
	 * Airpop 
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_AIRPOINT = 125;
	
	/**
	 * \if ENGLISH_LANG
	 * TYCO
	 * \else
	 * TYCO
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_TYCO = 126;
	
	/**
	 * \if ENGLISH_LANG
	 * Xunmei
	 * \else
	 * Xunmei
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_XUNMEI = 127;
	
	/**
	 * \if ENGLISH_LANG
	 * Hik
	 * \else
	 * Hik
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_HIKVISION = 128;
	
	/**
	 * \if ENGLISH_LANG
	 * LG 
	 * \else
	 * LG 
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_LG = 129;
	
	/**
	 * \if ENGLISH_LANG
	 * Aoqiman
	 * \else
	 * Aoqiman
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_AOQIMAN = 130;
	
	/**
	 * \if ENGLISH_LANG
	 * Baokang
	 * \else
	 * Baokang
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_BAOKANG = 131;
	
	/**
	 * \if ENGLISH_LANG
	 * Watchnet  
	 * \else
	 * Watchnet  
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_WATCHNET = 132;
	
	/**
	 * \if ENGLISH_LANG
	 * Xvision
	 * \else
	 * Xvision 
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_XVISION = 133;
	
	/**
	 * \if ENGLISH_LANG
	 * Fusitsu
	 * \else
	 * Fusitsu
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_FUSITSU = 134;
	
	/**
	 * \if ENGLISH_LANG
	 * Canon
	 * \else
	 * Canon
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_CANON = 135;
	
	/**
	 * \if ENGLISH_LANG
	 * GE
	 * \else
	 * GE
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_GE = 136;
	
	/**
	 * \if ENGLISH_LANG
	 * Basler
	 * \else
	 * Basler
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_Basler = 137;
	
	/**
	 * \if ENGLISH_LANG
	 * Patro
	 * \else
	 * Patro
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_Patro = 138;
	
	/**
	 * \if ENGLISH_LANG
	 * CPPLUS K series
	 * \else
	 * CPPLUS K系列
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_CPKNC = 139;
	
	/**
	 * \if ENGLISH_LANG
	 * CPPLUS R series
	 * \else
	 * CPPLUS R系列
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_CPRNC = 140;
	
	/**
	 * \if ENGLISH_LANG
	 * CPPLUS U series	
	 * \else
	 * CPPLUS U系列	
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_CPUNC = 141;
	
	/**
	 * \if ENGLISH_LANG
	 * CPPLUS IPC	
	 * \else
	 * cpplus oem 私有的ipc
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_CPPLUS = 142;
	
	/**
	 * \if ENGLISH_LANG
	 * Xunmeis,protocal is Onvif
	 * \else
	 * Xunmeis,实际协议为Onvif
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_XunmeiS = 143;
	
	/**
	 * \if ENGLISH_LANG
	 * GDDW
	 * \else
	 * GDDW
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_GDDW = 144;
	
	/**
	 * \if ENGLISH_LANG
	 * PSIA 
	 * \else
	 * PSIA 
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_PSIA = 145;
	
	/**
	 * \if ENGLISH_LANG
	 * GB2818
	 * \else
	 * GB2818
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_GB2818 = 146;
	
	/**
	 * \if ENGLISH_LANG
	 * GDYX
	 * \else
	 * GDYX
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_GDYX = 147;
	
	/**
	 * \if ENGLISH_LANG
	 * others
	 * \else
	 * 由用户自定义
	 * \endif
	 */
	public static final int     SDK_PROTOCOL_OTHER = 148;
}

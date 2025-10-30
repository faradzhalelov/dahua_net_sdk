package com.company.NetSDK;

import java.io.Serializable;

public class SDKDEV_CDMAGPRS_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless module enable
	 * \else
	 * 无线模块使能标志
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * Network type mask;Use bit to represent,The first bit:Automatic selection
	 * The second bit:TD-SCDMA network;The third bit:WCDMA network;
	 * The fourth bit:CDMA 1.x network;The fifth bit:GPRS network;The sixth bit:EVDO network
	 * The seventh bit:EVDO network;The eighth bit:WIFI network;
	 * \else
	 * 设备支持网络类型掩码;按位表示,第一位;自动选择;
	 * 第二位：TD-SCDMA网络；第三位：WCDMA网络;
	 * 第四位：CDMA 1.x网络;第五位：CDMA2000网络;第六位：GPRS网络;
	 * 第七位：EVDO网络;第八位：WIFI
	 * \endif
	 */
	public int               dwTypeMask;

	/**
	 * \if ENGLISH_LANG
	 * Types of wireless networks, refer to {@link EM_GPRSCDMA_NETWORK_TYPE}
	 * \else
	 * 当前的无线网络类型，取值参考  {@link EM_GPRSCDMA_NETWORK_TYPE}
	 * \endif
	 */
	public int               dwNetType;

	/**
	 * \if ENGLISH_LANG
	 * Access Point Name
	 * \else
	 * 接入点名称
	 * \endif
	 */
	public byte                szAPN[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Dial-up number
	 * \else
	 * 拨号号码
	 * \endif
	 */
	public byte                szDialNum[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Dial-up user name
	 * \else
	 * 拨号用户名
	 * \endif
	 */
	public byte                szUserName[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Dial-up Password
	 * \else
	 * 拨号密码
	 * \endif
	 */
	public byte                szPWD[] = new byte[128];
    
    /* 下面是设备的只读部分 */
	/**
	 * \if ENGLISH_LANG
	 * Wireless network registration status
	 * \else
	 * 无线网络注册状态
	 * \endif
	 */
	public boolean                iAccessStat;

	/**
	 * \if ENGLISH_LANG
	 * dial-up IP of Front-end equipment
	 * \else
	 * 前端设备拨号IP，字符串, 包括'\0'结束符共16byte
	 * \endif
	 */
	public byte                szDevIP[] = new byte[16];

	/**
	 * \if ENGLISH_LANG
	 * Dial-up mask of Front-end equipment
	 * \else
	 * 前端设备拨号子网掩码，字符串, 包括'\0'结束符共16byte
	 * \endif
	 */
	public byte                szSubNetMask[] = new byte[16];

	/**
	 * \if ENGLISH_LANG
	 * Dial-up Gateway of Front-end equipment
	 * \else
	 * 前端设备拨号网关，字符串, 包括'\0'结束符共16byte
	 * \endif
	 */
	public byte                szGateWay[] = new byte[16];
	
    /* 上面是设备的只读部分 */
	/**
	 * \if ENGLISH_LANG
	 * Keep-alive time
	 * \else
	 * 保活时间
	 * \endif
	 */
	public int                 iKeepLive;

	/**
	 * \if ENGLISH_LANG
	 * 3G dial period,valid time period,start dialing;beyond this period,shut the dial.
	 * \else
	 * 3G拨号时间段，有效时间段之内，开启拨号；有效时间段之外，关闭拨号。
	 * \endif
	 */
    public SDK_3G_TIMESECT      stSect[][] = new SDK_3G_TIMESECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_TSECT];
    
    /**
	 * \if ENGLISH_LANG
	 * Whether need to be active by voice or message
	 * \else
	 * 是否需要被语音或短信激活
	 * \endif
	 */
	public byte                byActivate;

	/**
	 * \if ENGLISH_LANG
	 * SIM(UIM) State: 1, 0 (read-only data) be occupied the 1 byte
	 * \else
	 * SIM(UIM)状态:存在1,不存在0  (只读数据) 占用Reserved的1个字节
	 * \endif
	 */
	public byte                bySimStat;

	/**
	 * \if ENGLISH_LANG
	 * identify mode
	 * \else
	 * 鉴权方式
	 * \endif
	 */
	public byte                szIdentify[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * PPP Dial-up,0- cut down ppp connect,1-ppp dial-up
	 * \else
	 * PPP拨号,0-断开ppp连接，1-ppp拨号
	 * \endif
	 */
	public boolean                bPPPEnable;

	/**
	 * \if ENGLISH_LANG
	 * PPP Dial-up statr(real only),see {@link EM_MOBILE_PPP_STATE}
	 * \else
	 * PPP拨号状态(只读)，具体含义见 {@link EM_MOBILE_PPP_STATE}
	 * \endif
	 */
	public byte                bPPPState;

	/**
	 * \if ENGLISH_LANG
	 * net card state(read only),see {@link EM_3GMOBILE_STATE}
	 * \else
	 * 网卡所处状态(只读)，具体含义见 {@link EM_3GMOBILE_STATE}
	 * \endif
	 */
	public byte                bNetCardState;

	/**
	 * \if ENGLISH_LANG
	 * physics card no.
	 * \else
	 * 物理卡号
	 * \endif
	 */
	public byte                szPhyCardNo[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * PIN show or not(read only), 0-don't support 1-show, 2-don't show
	 * \else
	 * PIN码是否显示(只读), 0-不支持, 1-显示, 2-不显示
	 * \endif
	 */
	public byte                byPinShow;

	/**
	 * \if ENGLISH_LANG
	 * PIN setting enable(read only), 0-unable, 1-enable
	 * \else
	 * PIN码设置使能(只读), 0-不使能, 1-使能
	 * \endif
	 */
	public byte                byPinEnable;

	/**
	 * \if ENGLISH_LANG
	 * the rest of pin setting number(read only), 0~3
	 * \else
	 * PIN码剩余设置次数(只读), 0~3
	 * \endif
	 */
	public byte                byPinCount;
	
    //-------------------------------以下字段设置dwSize后才有效------------------------------------
	/**
	 * \if ENGLISH_LANG
	 * value of PIN, a combination of letters or numbers
	 * \else
	 * PIN码值, 字母或数字的任意组合
	 * \endif
	 */
	public byte                szPinNo[] = new byte[16];
    
    public SDKDEV_CDMAGPRS_CFG() {
    	for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
    		for (int j = 0; j < FinalVar.SDK_N_TSECT; j++) {
    			stSect[i][j] = new SDK_3G_TIMESECT();
    		}
    	}
    }
}

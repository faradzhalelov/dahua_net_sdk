package com.company.NetSDK;

public class INetSDK
{
	static {
		LoadLibrarys();
	}
	public static void LoadLibrarys() {
		try {
			String strOSType =  System.getProperty("os.name");
			if (strOSType.contains("Window")) {
				System.loadLibrary("dhconfigsdk");
				System.loadLibrary("dhnetsdk");
				System.loadLibrary("jninetsdk");
			} else {
				String strVendor =  System.getProperty("java.vm.specification.vendor");
				if (strVendor.contains("Android")) {
					/*System.loadLibrary("json");
		    		System.loadLibrary("Infra");
		    		System.loadLibrary("Stream");
		    		System.loadLibrary("NetFramework");
					System.loadLibrary("StreamSvr");
		    		System.loadLibrary("avnetsdk");
					System.loadLibrary("ssl");
					System.loadLibrary("crypto");
					System.loadLibrary("curl");*/
		    		System.loadLibrary("netsdk");
		    		System.loadLibrary("configsdk");
		    		System.loadLibrary("jninetsdk");
				} else {
					System.loadLibrary("dhconfigsdk");
					System.loadLibrary("dhnetsdk");
					System.loadLibrary("jninetsdk");
				}
			}
		} catch(UnsatisfiedLinkError ulink) {    
	        ulink.printStackTrace();   
	    }
	}
	
	/**
	 * \if ENGLISH_LANG
	 * initialize SDK, call before all SDK function
	 * @param cbDisConnect object of interface {@link CB_fDisConnect}
	 * @return true:success, false:failed
	 * \else
	 * 初始化SDK, 在所有的SDK函数之前调用
	 * @param cbDisConnect 对象实现接口{@link CB_fDisConnect}
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#Cleanup}
	 */
	public static native boolean 		Init(CB_fDisConnect cbDisConnect);
	
	/**
	 * \if ENGLISH_LANG
	 * empty SDK, release occupied resource,call after all SDK functions
	 * @return 
	 * \else
	 * 清空SDK, 释放占用的资源,在所有的SDK函数之后调用
	 * @return 
	 * \endif
	 * @see {@link INetSDK#Init}
	 */
	public static native void 			Cleanup();
	
	/**
	 * \if ENGLISH_LANG
	 * Set re-connection callback function after disconnection. Internal SDK  auto connect again after disconnection 
	 * @param cbAutoConnect disconnet reconnected recall function {@link CB_fHaveReConnect}
	 * \else
	 * 设置断线重连成功回调函数,设置后SDK内部断线自动重连
	 * @param cbAutoConnect 断线重连成功的回调函数 {@link CB_fHaveReConnect}
	 * \endif
	 */ 
	public static native void 			SetAutoReconnect(CB_fHaveReConnect cbAutoConnect);
	
	/**
	 * \if ENGLISH_LANG
	 * Dynamic sub-set link disconnected callback function, the current monitoring and playback equipment SVR is a short connection
	 * @param cbSubDisConnect sub disconnection recall function {@link CB_fSubDisConnect}
	 * \else
	 * 设置动态子连接断线回调函数,目前SVR设备的预览和回放是短连接的
	 * @param cbSubDisConnect 对象实现接口 {@link CB_fSubDisConnect}
	 * \endif
	 */
	public static native void 			SetSubconnCallBack(CB_fSubDisConnect cbSubDisConnect);
	
	/**
	 * \if ENGLISH_LANG
	 * Return the function execution failure code
	 * @return wrong code list,_EC(x) means(0x80000000|x)
	 * <table>
	 * <tr><td>type</td><td>value</td><td>means meaning</td></tr>
	 * <tr><td>NET_NOERROR</td><td>0</td><td>no mistake</td></tr>
	 * <tr><td>NET_ERROR</td><td>-1</td><td>unknown mistake</td></tr>
	 * <tr><td>NET_SYSTEM_ERROR</td><td>_EC(1)</td><td>Windows system wrong</td></tr>
	 * <tr><td>NET_NETWORK_ERROR</td><td>_EC(2)</td><td>network mistake</td></tr> 
	 * <tr><td>NET_DEV_VER_NOMATCH</td><td>_EC(3)</td><td>device protocol unmatched</td></tr> 
	 * <tr><td>NET_INVALID_HANDLE</td><td>_EC(4)</td><td>invalid handle</td></tr> 
	 * <tr><td>NET_OPEN_CHANNEL_ERROR</td><td>_EC(5)</td><td>open channel failed</td></tr> 
	 * <tr><td>NET_CLOSE_CHANNEL_ERROR</td><td>_EC(6)</td><td>close channel failed</td></tr>
	 * <tr><td>NET_ILLEGAL_PARAM</td><td>_EC(7)</td><td>illegal user parameter</td></tr> 
	 * <tr><td>NET_SDK_INIT_ERROR</td><td>_EC(8)</td><td>SDK initialization wrong</td></tr> 
	 * <tr><td>NET_SDK_UNINIT_ERROR</td><td>_EC(9)</td><td>SDK cleanrance wrong</td></tr> 
	 * <tr><td>NET_RENDER_OPEN_ERROR</td><td>_EC(10)</td><td>apple render resource wrong</td></tr> 
	 * <tr><td>NET_DEC_OPEN_ERROR</td><td>_EC(11)</td><td>open decode wrong</td></tr>
	 * <tr><td>NET_DEC_CLOSE_ERROR</td><td>_EC(12)</td><td>close docode list wrong</td></tr>
	 * <tr><td>NET_MULTIPLAY_NOCHANNEL</td><td>_EC(13)</td><td>detected channel number is 0 in multiple window preview</td></tr> 
	 * <tr><td>NET_TALK_INIT_ERROR</td><td>_EC(14)</td><td>audio record initialization failed</td></tr>
	 * <tr><td>NET_TALK_NOT_INIT</td><td>_EC(15)</td><td>audio record uninitialized</td></tr> 
	 * <tr><td>NET_TALK_SENDDATA_ERROR</td><td>_EC(16)</td><td>audio data sent wrong</td></tr>
	 * <tr><td>NET_REAL_ALREADY_SAVING</td><td>_EC(17)</td><td>real time data are saved</td></tr>
	 * <tr><td>NET_NOT_SAVING</td><td>_EC(18)</td><td>unsaved real time data</td></tr>
	 * <tr><td>NET_OPEN_FILE_ERROR</td><td>_EC(19)</td><td>open file wrong</td></tr>
	 * <tr><td>NET_PTZ_SET_TIMER_ERROR</td><td>_EC(20)</td><td>open PTZ controllor failed</td></tr>
	 * <tr><td>NET_RETURN_DATA_ERROR</td><td>_EC(21)</td><td>returned data check wrong</td></tr>
	 * <tr><td>NET_INSUFFICIENT_BUFFER</td><td>_EC(22)</td><td>insufficient cache</td></tr>
	 * <tr><td>NET_NOT_SUPPORTED</td><td>_EC(23)</td><td>current SDK do not support the function</td></tr> 
	 * <tr><td>NET_NO_RECORD_FOUND</td><td>_EC(24)</td><td>no video searched</td></tr>
	 * <tr><td>NET_NOT_AUTHORIZED</td><td>_EC(25)</td><td>non authorized operation</td></tr>
	 * <tr><td>NET_NOT_NOW</td><td>_EC(26)</td><td>temporarilt not available</td></tr>
	 * <tr><td>NET_NO_TALK_CHANNEL</td><td>_EC(27)</td><td>no bidirectional channel found</td></tr>
	 * <tr><td>NET_NO_AUDIO</td><td>_EC(28)</td><td>no audio found</td></tr> 
	 * <tr><td>NET_NO_INIT</td><td>_EC(29)</td><td>network SDK not initialized</td></tr>
	 * <tr><td>NET_DOWNLOAD_END</td><td>_EC(30)</td><td>download ends</td></tr> 
	 * <tr><td>NET_EMPTY_LIST</td><td>_EC(31)</td><td>0 result found</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_SYSATTR</td><td>_EC(32)</td><td>receiving system settings invalid</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_SERIAL</td><td>_EC(33)</td><td>receiving serial number failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_GENERAL</td><td>_EC(34)</td><td>receiving generals failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_DSPCAP</td><td>_EC(35)</td><td>receiving DSP capability description failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_NETCFG</td><td>_EC(36)</td><td>receiving network config failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_CHANNAME</td><td>_EC(37)</td><td>receiving channel name failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_VIDEO</td><td>_EC(38)</td><td>receiving video property failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_RECORD</td><td>_EC(39)</td><td>receiving video config failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_PRONAME</td><td>_EC(40)</td><td>receiving decoder protocol name failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_FUNCNAME</td><td>_EC(41)</td><td>receiving232 serial function name failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_485DECODER</td><td>_EC(42)</td><td>receiving decoder property faileddecoderpropertyfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_232COM</td><td>_EC(43)</td><td>receiving 232 serial configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_ALARMIN</td><td>_EC(44)</td><td>receiving external alarm input configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_ALARMDET</td><td>_EC(45)</td><td>receiving dynamic detection alarm failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_SYSTIME</td><td>_EC(46)</td><td>receiving device time failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_PREVIEW</td><td>_EC(47)</td><td>receiving preview parameter failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_AUTOMT</td><td>_EC(48</td><td>receiving auto maintenance configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_VIDEOMTRX</td><td>_EC(49)</td><td>receiving video matrix configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_COVER</td><td>_EC(50)</td><td>receiving area mask configfailed</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_WATERMAKE</td><td>_EC(51)</td><td>receiving image watermark configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_GENERAL</td><td>_EC(55)</td><td>change general property failed</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_NETCFG</td><td>_EC(56)</td><td>change change network configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_CHANNAME</td><td>_EC(57)</td><td>change channel name failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_VIDEO</td><td>_EC(58)</td><td>change videoproperty failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_RECORD</td><td>_EC(59)</td><td>change record configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_485DECODER</td><td>_EC(60)</td><td>changedecoderpropertyfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_232COM</td><td>_EC(61)</td><td>change232serialconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_ALARMIN</td><td>_EC(62)</td><td>change external input alarm config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_ALARMDET</td><td>_EC(63)</td><td>change dynamix detection alarm config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_SYSTIME</td><td>_EC(64)</td><td>change device time failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_PREVIEW</td><td>_EC(65)</td><td>change preview parameter failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_AUTOMT</td><td>_EC(66)</td><td>change auto maintenance configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_VIDEOMTRX</td><td>_EC(67)</td><td>change video matrix config failed</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_COVER</td><td>_EC(68)</td><td>change area mask config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_WATERMAKE</td><td>_EC(69)</td><td>change image watermark configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_WLAN</td><td>_EC(70)</td><td>change wireless network info failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_WLANDEV</td><td>_EC(71)</td><td>select wireless network device failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_REGISTER</td><td>_EC(72)</td><td>change active registration parameter configfailed</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_CAMERA</td><td>_EC(73)</td><td>change camera property config failed</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_INFRARED</td><td>_EC(74)</td><td>change IR alarm config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_SOUNDALARM</td><td>_EC(75)</td><td>change audio alarm config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_STORAGE</td><td>_EC(76)</td><td>change storage location config failed</td></tr>
	 * <tr><td>NET_AUDIOENCODE_NOTINIT</td><td>_EC(77)</td><td>audio encode interface not successfully initialized</td></tr>
	 * <tr><td>NET_DATA_TOOLONGH</td><td>_EC(78)</td><td>data too long</td></tr>
	 * <tr><td>NET_UNSUPPORTED</td><td>_EC(79)</td><td>device not support the operation</td></tr>
	 * <tr><td>NET_DEVICE_BUSY</td><td>_EC(80)</td><td>device insufficient resource</td></tr>
	 * <tr><td>NET_SERVER_STARTED</td><td>_EC(81)</td><td>server started</td></tr>
	 * <tr><td>NET_SERVER_STOPPED </td><td>_EC(82)</td><td>server not started</td></tr>
	 * <tr><td>NET_LISTER_INCORRECT_SERIAL</td><td>_EC(83)</td><td>serial number input wrong</td></tr>
	 * <tr><td>NET_QUERY_DISKINFO_FAILED</td><td>_EC(84)</td><td>receiving hard disk info failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_SESSION</td><td>_EC(85)</td><td>receiving connect Session info</td></tr>
	 * <tr><td>NET_USER_FLASEPWD_TRYTIME</td><td>_EC(86)</td><td>wrong password input exceeds limit</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_PASSWORD</td><td>_EC(100)</td><td>wrong password</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_USER</td><td>_EC(101)</td><td>account not exist</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_TIMEOUT</td><td>_EC(102)</td><td>overtime of waiting</td></tr> 
	 * <tr><td>NET_LOGIN_ERROR_RELOGGIN</td><td>_EC(103)</td><td>account already login</td></tr> 
	 * <tr><td>NET_LOGIN_ERROR_LOCKED</td><td>_EC(104)</td><td>account locked</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_BLACKLIST</td><td>_EC(105)</td><td>account on block list</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_BUSY</td><td>_EC(106)</td><td>insufficient resource,system busy</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_CONNECT</td><td>_EC(107)</td><td>connect to main failed</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_NETWORK</td><td>_EC(108)</td><td>network connect failed</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_SUBCONNECT</td><td>_EC(109)</td><td>login device sAttachPTZStatusProcuccessfully, but cannot create video channel, please check network status</td></tr>
	 * <tr><td>NET_LOGIN_ERROR_MAXCONNECT</td><td>_EC(110)</td><td>exceeds max connections</td></tr>   
	 * <tr><td>NET_RENDER_SOUND_ON_ERROR</td><td>_EC(120)</td><td>Render list open audio wrong</td></tr>
	 * <tr><td>NET_RENDER_SOUND_OFF_ERROR</td><td>_EC(121)</td><td>Render list close audio wrong</td></tr>
	 * <tr><td>NET_RENDER_SET_VOLUME_ERROR</td><td>_EC(122)</td><td>Render list control volume wrong</td></tr>
	 * <tr><td>NET_RENDER_ADJUST_ERROR</td><td>_EC(123)</td><td>Render list set image parameter wrong</td></tr>
	 * <tr><td>NET_RENDER_PAUSE_ERROR</td><td>_EC(124)</td><td>Render list pause playing wrong</td></tr>
	 * <tr><td>NET_RENDER_SNAP_ERROR</td><td>_EC(125)</td><td>Render list snapshot wrong</td></tr>
	 * <tr><td>NET_RENDER_STEP_ERROR</td><td>_EC(126)</td><td>Render list fast play wrong</td></tr>
	 * <tr><td>NET_RENDER_FRAMERATE_ERROR</td><td>_EC(127)</td><td>Render list set frame rate wrong</td></tr>
	 * <tr><td>NET_GROUP_EXIST</td><td>_EC(140)</td><td>group name exists</td></tr>
	 * <tr><td>NET_GROUP_NOEXIST</td><td>_EC(141)</td><td>group name not exists</td></tr>
	 * <tr><td>NET_GROUP_RIGHTOVER</td><td>_EC(142)</td><td>group authority exceeds authorization range</td></tr>
	 * <tr><td>NET_GROUP_HAVEUSER</td><td>_EC(143)</td><td>all user in group, cannot be deleted</td></tr>
	 * <tr><td>NET_GROUP_RIGHTUSE</td><td>_EC(144)</td><td>user is using a certain authority of group, cannot eliminate</td></tr>
	 * <tr><td>NET_GROUP_SAMENAME</td><td>_EC(145)</td><td>new group name overplay with existing group</td></tr>
	 * <tr><td>NET_USER_EXIST</td><td>_EC(146)</td><td>user exists</td></tr>
	 * <tr><td>NET_USER_NOEXIST</td><td>_EC(147)</td><td>user not exists</td></tr>
	 * <tr><td>NET_USER_RIGHTOVER</td><td>_EC(148)</td><td>user authority exceeds group authority range</td></tr>
	 * <tr><td>NET_USER_PWD</td><td>_EC(149)</td><td>reserve account, cannot change password</td></tr>
	 * <tr><td>NET_USER_FLASEPWD</td><td>_EC(150)</td><td>password wrong</td></tr>
	 * <tr><td>NET_USER_NOMATCHING</td><td>_EC(151)</td><td>password not match</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_ETHERNET</td><td>_EC(300)</td><td>receiving network card config failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_WLAN</td><td>_EC(301)</td><td>receiving wireless network info failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_WLANDEV</td><td>_EC(302)</td><td>receiving wireless network device failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_REGISTER</td><td>_EC(303)</td><td>receiving active registeration parameter failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_CAMERA</td><td>_EC(304)</td><td>receiving camera propertyfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_INFRARED</td><td>_EC(305)</td><td>receiving IR alarmconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_SOUNDALARM</td><td>_EC(306)</td><td>receiving audio alarmconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_STORAGE</td><td>_EC(307)</td><td>receiving storage location configfailed</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_MAIL</td><td>_EC(308)</td><td>receiving mail config failed</td></tr> 
	 * <tr><td>NET_CONFIG_DEVBUSY</td><td>_EC(309)</td><td>temporarily not available</td></tr>
	 * <tr><td>NET_CONFIG_DATAILLEGAL</td><td>_EC(310)</td><td>config data illegal</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_DST</td><td>_EC(311)</td><td>receiving daylight saving time config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_DST</td><td>_EC(312)</td><td>set daylight saving time configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_VIDEO_OSD</td><td>_EC(313)</td><td>receivingvideo OSD superposition configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_VIDEO_OSD</td><td>_EC(314)</td><td>set video OSD superposition configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_GPRSCDMA</td><td>_EC(315)</td><td>receivingCDMA\\GPRSnetworkconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_GPRSCDMA</td><td>_EC(316)</td><td>setCDMA\\GPRS network config failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_IPFILTER</td><td>_EC(317)</td><td>receiving IP filter config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_IPFILTER</td><td>_EC(318)</td><td>setIP filter config failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_TALKENCODE</td><td>_EC(319)</td><td>receiving bidirectional talk encode config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_TALKENCODE</td><td>_EC(320)</td><td>set bidirectional talk encode configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_RECORDLEN</td><td>_EC(321)</td><td>receiving record package length configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_RECORDLEN</td><td>_EC(322)</td><td>setrecord package length configfailed</td></tr>
	 * <tr><td>NET_DONT_SUPPORT_SUBAREA</td><td>_EC(323)</td><td>not support network hard disk segmentation</td></tr>
	 * <tr><td>NET_ERROR_GET_AUTOREGSERVER</td><td>_EC(324)</td><td>receivingdevice active registration server info failed</td></tr>
	 * <tr><td>NET_ERROR_CONTROL_AUTOREGISTER</td><td>_EC(325)</td><td>active registration redirection registration mistake</td></tr>
	 * <tr><td>NET_ERROR_DISCONNECT_AUTOREGISTER</td><td>_EC(326)</td><td>disconnect active registration server mistake</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_MMS</td><td>_EC(327)</td><td>receivingmmsconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_MMS</td><td>_EC(328)</td><td>setmmsconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_SMSACTIVATION</td><td>_EC(329)</td><td>receiving sms activate wireless connection config failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_SMSACTIVATION</td><td>_EC(330)</td><td>setsms activate wireless connection config failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_DIALINACTIVATION</td><td>_EC(331)</td><td>receiving dial activate wireless connection configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_DIALINACTIVATION</td><td>_EC(332)</td><td>setdial activate wireless connection configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_VIDEOOUT</td><td>_EC(333)</td><td>search video output parameter configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_VIDEOOUT</td><td>_EC(334)</td><td>setvideo output parameter config failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_OSDENABLE</td><td>_EC(335)</td><td>receivingosd superposition enable configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_OSDENABLE</td><td>_EC(336)</td><td>setosdsuperposition enableconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_ENCODERINFO</td><td>_EC(337)</td><td>set digital channel front-end encode insertion configfailed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_TVADJUST</td><td>_EC(338)</td><td>receivingTV adjust configfailed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_TVADJUST</td><td>_EC(339)</td><td>setTV adjust configfailed</td></tr>
	 * <tr><td>NET_ERROR_CONNECT_FAILED</td><td>_EC(340)</td><td>requrest to create connection failed</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_BURNFILE</td><td>_EC(341)</td><td>request to upload burned file failed</td></tr>
	 * <tr><td>NET_ERROR_SNIFFER_GETCFG</td><td>_EC(342)</td><td>receiving snapshot config info failed</td></tr>
	 * <tr><td>NET_ERROR_SNIFFER_SETCFG</td><td>_EC(343)</td><td>set snapshot config info failed</td></tr>
	 * <tr><td>NET_ERROR_DOWNLOADRATE_GETCFG</td><td>_EC(344)</td><td>search download limit info failed</td></tr>
	 * <tr><td>NET_ERROR_DOWNLOADRATE_SETCFG</td><td>_EC(345)</td><td>set download limit info failed</td></tr>
	 * <tr><td>NET_ERROR_SEARCH_TRANSCOM</td><td>_EC(346)</td><td>search serial parameter failed</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_POINT</td><td>_EC(347)</td><td>receiving preset point info wrong</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_POINT</td><td>_EC(348)</td><td>set preset point info wrong</td></tr>
	 * <tr><td>NET_SDK_LOGOUT_ERROR</td><td>_EC(349)</td><td>SDK abnormal log out device</td></tr>
	 * <tr><td>NET_ERROR_GET_VEHICLE_CFG</td><td>_EC(350)</td><td>receiving mobile configfailed</td></tr>
	 * <tr><td>NET_ERROR_SET_VEHICLE_CFG</td><td>_EC(351)</td><td>set mobile configfailed</td></tr>
	 * <tr><td>NET_ERROR_GET_ATM_OVERLAY_CFG</td><td>_EC(352)</td><td>receivingatm superposition configfailed</td></tr>
	 * <tr><td>NET_ERROR_SET_ATM_OVERLAY_CFG</td><td>_EC(353)</td><td>setatm superposition configfailed</td></tr>
	 * <tr><td>NET_ERROR_GET_ATM_OVERLAY_ABILITY</td><td>_EC(354)</td><td>receivingatm superposition capability failed</td></tr>
	 * <tr><td>NET_ERROR_GET_DECODER_TOUR_CFG</td><td>_EC(355)</td><td>receivingdecoder decoding tour configfailed</td></tr>
	 * <tr><td>NET_ERROR_SET_DECODER_TOUR_CFG</td><td>_EC(356)</td><td>setdecoder decoding tour configfailed</td></tr>
	 * <tr><td>NET_ERROR_CTRL_DECODER_TOUR</td><td>_EC(357)</td><td>control decoder decoding tour failed</td></tr>
	 * <tr><td>NET_GROUP_OVERSUPPORTNUM</td><td>_EC(358)</td><td>exceed device max user groups supported</td></tr>
	 * <tr><td>NET_USER_OVERSUPPORTNUM</td><td>_EC(359)</td><td>exceed device max user groups supported</td></tr>
	 * <tr><td>NET_ERROR_GET_SIP_CFG</td><td>_EC(368)</td><td>receivingSIPconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_SET_SIP_CFG</td><td>_EC(369)</td><td>set SIP config failed</td></tr>
	 * <tr><td>NET_ERROR_GET_SIP_ABILITY</td><td>_EC(370)</td><td>receivingSIP capability failed</td></tr>
	 * <tr><td>NET_ERROR_GET_WIFI_AP_CFG</td><td>_EC(371)</td><td>receivingWIFI apconfigfailed</td></tr>
	 * <tr><td>NET_ERROR_SET_WIFI_AP_CFG</td><td>_EC(372)</td><td>setWIFI ap config failed</td></tr>
	 * <tr><td>NET_ERROR_GET_DECODE_POLICY</td><td>_EC(373)</td><td>receiving decoding strategy configfailed</td></tr>
	 * <tr><td>NET_ERROR_SET_DECODE_POLICY</td><td>_EC(374)</td><td>set decoding strategy configfailed</td></tr>
	 * <tr><td>NET_ERROR_TALK_REJECT</td><td>_EC(375)</td><td>refuse bidirectional talk</td></tr> 
	 * <tr><td>NET_ERROR_TALK_OPENED</td><td>_EC(376)</td><td>open by other client</td></tr>
	 * <tr><td>NET_ERROR_TALK_RESOURCE_CONFLICIT</td><td>_EC(377)</td><td>resource conflict</td></tr>
	 * <tr><td>NET_ERROR_TALK_UNSUPPORTED_ENCODE</td><td>_EC(378)</td><td>audio encoding format not supported</td></tr>
	 * <tr><td>NET_ERROR_TALK_RIGHTLESS</td><td>_EC(379)</td><td>not authorized</td></tr>
	 * <tr><td>NET_ERROR_TALK_FAILED</td><td>_EC(380)</td><td>request of bidirectional talk failed</td></tr>
	 * <tr><td>NET_ERROR_GET_MACHINE_CFG</td><td>_EC(381)</td><td>receiving device related configfailed</td></tr>
	 * <tr><td>NET_ERROR_SET_MACHINE_CFG</td><td>_EC(382)</td><td>set device related configfailed</td></tr>
	 * <tr><td>NET_ERROR_GET_DATA_FAILED</td><td>_EC(383)</td><td>device cannot receiving currently required data</td></tr>
	 * <tr><td>NET_ERROR_MAC_VALIDATE_FAILED</td><td>_EC(384)</td><td>MAC address inspection failed</td></tr>
	 * <tr><td>NET_ERROR_GET_INSTANCE</td><td>_EC(385)</td><td>receiving server example failed</td></tr>
	 * <tr><td>NET_ERROR_JSON_REQUEST</td><td>_EC(386)</td><td>generated jason character string wrong</td></tr>
	 * <tr><td>NET_ERROR_JSON_RESPONSE</td><td>_EC(387)</td><td>responded jason character string wrong</td></tr>
	 * <tr><td>NET_ERROR_VERSION_HIGHER</td><td>_EC(388)</td><td>protocol version older than current version in use</td></tr>
	 * <tr><td>NET_SPARE_NO_CAPACITY</td><td>_EC(389)</td><td>hot operation failed, insufficient space</td></tr>
	 * <tr><td>NET_ERROR_SOURCE_IN_USE</td><td>_EC(390)</td><td>display source is occulied by other output</td></tr>
	 * <tr><td>NET_ERROR_REAVE</td><td>_EC(391)</td><td>advanced user seize resouce of low-level user</td></tr>
	 * <tr><td>NET_ERROR_NETFORBID</td><td>_EC(392)</td><td>prohibit access</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_MACFILTER</td><td>_EC(393)</td><td>get MAC</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_MACFILTER</td><td>_EC(394)</td><td>MAC</td></tr>
	 * <tr><td>NET_ERROR_GETCFG_IPMACFILTER</td><td>_EC(395)</td><td>IP/MAC</td></tr>
	 * <tr><td>NET_ERROR_SETCFG_IPMACFILTER</td><td>_EC(396)</td><td>IP/MAC</td></tr>
	 * <tr><td>NET_ERROR_OPERATION_OVERTIME</td><td>_EC(397)</td><td>over time</td></tr>
	 * <tr><td>NET_ERROR_SENIOR_VALIDATE_FAILED</td><td>_EC(398)</td><td>failed</td></tr>
	 * <tr><td>NET_ERROR_DEVICE_ID_NOT_EXIST</td><td>_EC(399)</td><td>device ID not exist</td></tr>
	 * <tr><td>NET_ERROR_UNSUPPORTED</td><td>_EC(400)</td><td>not support</td></tr>
	 * <tr><td>NET_ERROR_SPEAK_FAILED</td><td>_EC(406)</td><td>failed</td></tr>
	 * <tr><td>NET_ERROR_NOT_SUPPORT_F6</td><td>_EC(407)</td><td>device no F6</td></tr>
	 * </table>
	 * \else
	 * 返回函数执行失败代码,在接口调用失败时使用,根据获得的值来确定调用出错原因
	 * @return 返回错误代码,格式为：0x80000000|x
	 * <table>
	 * <tr><td>类型</td><td>数值 </td><td>代表含义 </td></tr>
	 * <tr><td>NET_NOERROR</td><td>0</td><td>没有错误</td></tr> 
	 * <tr><td>NET_ERROR</td><td>-1</td><td>未知错误</td></tr> 
	 * <tr><td>NET_SYSTEM_ERROR</td><td>_EC(1)</td><td>Windows系统出错</td></tr> 
	 * <tr><td>NET_NETWORK_ERROR</td><td>_EC(2)</td><td>网络错误</td></tr> 
	 * <tr><td>NET_DEV_VER_NOMATCH</td><td>_EC(3)</td><td>设备协议不匹配 </td></tr>
	 * <tr><td>NET_INVALID_HANDLE</td><td>_EC(4)</td><td>句柄无效 </td></tr>
	 * <tr><td>NET_OPEN_CHANNEL_ERROR</td><td>_EC(5)</td><td>打开通道失败</td></tr> 
	 * <tr><td>NET_CLOSE_CHANNEL_ERROR</td><td>_EC(6)</td><td>关闭通道失败</td></tr> 
	 * <tr><td>NET_ILLEGAL_PARAM</td><td>_EC(7)</td><td>用户参数不合法 </td></tr>
	 * <tr><td>NET_SDK_INIT_ERROR</td><td>_EC(8)</td><td>SDK初始化出错</td></tr> 
	 * <tr><td>NET_SDK_UNINIT_ERROR</td><td>_EC(9)</td><td>SDK清理出错</td></tr> 
	 * <tr><td>NET_RENDER_OPEN_ERROR</td><td>_EC(10)</td><td>申请render资源出错</td></tr> 
	 * <tr><td>NET_DEC_OPEN_ERROR</td><td>_EC(11)</td><td>打开解码库出错</td></tr> 
	 * <tr><td>NET_DEC_CLOSE_ERROR</td><td>_EC(12)</td><td>关闭解码库出错</td></tr> 
	 * <tr><td>NET_MULTIPLAY_NOCHANNEL</td><td>_EC(13)</td><td>多画面预览中检测到通道数为0</td></tr> 
	 * <tr><td>NET_TALK_INIT_ERROR</td><td>_EC(14)</td><td>录音库初始化失败</td></tr> 
	 * <tr><td>NET_TALK_NOT_INIT</td><td>_EC(15)</td><td>录音库未经初始化 </td></tr>
	 * <tr><td>NET_TALK_SENDDATA_ERROR</td><td>_EC(16)</td><td>发送音频数据出错</td></tr> 
	 * <tr><td>NET_REAL_ALREADY_SAVING</td><td>_EC(17)</td><td>实时数据已经处于保存状态 </td></tr>
	 * <tr><td>NET_NOT_SAVING</td><td>_EC(18)</td><td>未保存实时数据</td></tr> 
	 * <tr><td>NET_OPEN_FILE_ERROR</td><td>_EC(19)</td><td>打开文件出错</td></tr> 
	 * <tr><td>NET_PTZ_SET_TIMER_ERROR</td><td>_EC(20)</td><td>启动云台控制定时器失败</td></tr> 
	 * <tr><td>NET_RETURN_DATA_ERROR</td><td>_EC(21)</td><td>对返回数据的校验出错</td></tr> 
	 * <tr><td>NET_INSUFFICIENT_BUFFER</td><td>_EC(22)</td><td>没有足够的缓存 </td></tr>
	 * <tr><td>NET_NOT_SUPPORTED</td><td>_EC(23)</td><td>当前SDK未支持该功能 </td></tr>
	 * <tr><td>NET_NO_RECORD_FOUND</td><td>_EC(24)</td><td>查询不到录象 </td></tr>
	 * <tr><td>NET_NOT_AUTHORIZED</td><td>_EC(25)</td><td>无操作权限 </td></tr>
	 * <tr><td>NET_NOT_NOW</td><td>_EC(26)</td><td>暂时无法执行 </td></tr>
	 * <tr><td>NET_NO_TALK_CHANNEL</td><td>_EC(27)</td><td>未发现对讲通道 </td></tr>
	 * <tr><td>NET_NO_AUDIO</td><td>_EC(28)</td><td>未发现音频 </td></tr>
	 * <tr><td>NET_NO_INIT</td><td>_EC(29)</td><td>网络SDK未经初始化 </td></tr>
	 * <tr><td>NET_DOWNLOAD_END</td><td>_EC(30)</td><td>下载已结束 </td></tr>
	 * <tr><td>NET_EMPTY_LIST</td><td>_EC(31)</td><td>查询结果为空 </td></tr>
	 * <tr><td>NET_ERROR_GETCFG_SYSATTR</td><td>_EC(32)</td><td>获取系统属性配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_SERIAL</td><td>_EC(33)</td><td>获取序列号失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_GENERAL</td><td>_EC(34)</td><td>获取常规属性失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_DSPCAP</td><td>_EC(35)</td><td>获取DSP能力描述失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_NETCFG</td><td>_EC(36)</td><td>获取网络配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_CHANNAME</td><td>_EC(37)</td><td>获取通道名称失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_VIDEO</td><td>_EC(38)</td><td>获取视频属性失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_RECORD</td><td>_EC(39)</td><td>获取录象配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_PRONAME</td><td>_EC(40)</td><td>获取解码器协议名称失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_FUNCNAME</td><td>_EC(41)</td><td>获取232串口功能名称失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_485DECODER</td><td>_EC(42)</td><td>获取解码器属性失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_232COM</td><td>_EC(43)</td><td>获取232串口配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_ALARMIN</td><td>_EC(44)</td><td>获取外部报警输入配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_ALARMDET</td><td>_EC(45)</td><td>获取动态检测报警失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_SYSTIME</td><td>_EC(46)</td><td>获取设备时间失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_PREVIEW</td><td>_EC(47)</td><td>获取预览参数失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_AUTOMT</td><td>_EC(48)</td><td>获取自动维护配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_VIDEOMTRX</td><td>_EC(49)</td><td>获取视频矩阵配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_COVER</td><td>_EC(50)</td><td>获取区域遮挡配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_WATERMAKE</td><td>_EC(51)</td><td>获取图象水印配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_GENERAL</td><td>_EC(55)</td><td>修改常规属性失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_NETCFG</td><td>_EC(56)</td><td>修改网络配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_CHANNAME</td><td>_EC(57)</td><td>修改通道名称失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_VIDEO</td><td>_EC(58)</td><td>修改视频属性失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_RECORD</td><td>_EC(59)</td><td>修改录象配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_485DECODER</td><td>_EC(60)</td><td>修改解码器属性失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_232COM</td><td>_EC(61)</td><td>修改232串口配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_ALARMIN</td><td>_EC(62)</td><td>修改外部输入报警配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_ALARMDET</td><td>_EC(63)</td><td>修改动态检测报警配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_SYSTIME</td><td>_EC(64)</td><td>修改设备时间失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_PREVIEW</td><td>_EC(65)</td><td>修改预览参数失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_AUTOMT</td><td>_EC(66)</td><td>修改自动维护配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_VIDEOMTRX</td><td>_EC(67)</td><td>修改视频矩阵配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_COVER</td><td>_EC(68)</td><td>修改区域遮挡配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_WATERMAKE</td><td>_EC(69)</td><td>修改图象水印配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_WLAN</td><td>_EC(70)</td><td>修改无线网络信息失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_WLANDEV</td><td>_EC(71)</td><td>选择无线网络设备失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_REGISTER</td><td>_EC(72)</td><td>修改主动注册参数配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_CAMERA</td><td>_EC(73)</td><td>修改摄像头属性配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_INFRARED</td><td>_EC(74)</td><td>修改红外报警配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_SOUNDALARM</td><td>_EC(75)</td><td>修改音频报警配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_STORAGE</td><td>_EC(76)</td><td>修改存储位置配置失败</td></tr> 
	 * <tr><td>NET_AUDIOENCODE_NOTINIT</td><td>_EC(77)</td><td>音频编码接口没有成功初始化 </td></tr>
	 * <tr><td>NET_DATA_TOOLONGH</td><td>_EC(78)</td><td>数据过长 </td></tr>
	 * <tr><td>NET_UNSUPPORTED</td><td>_EC(79)</td><td>设备不支持该操作 </td></tr>
	 * <tr><td>NET_DEVICE_BUSY</td><td>_EC(80)</td><td>设备资源不足 </td></tr>
	 * <tr><td>NET_SERVER_STARTED</td><td>_EC(81)</td><td>服务器已经启动 </td></tr>
	 * <tr><td>NET_SERVER_STOPPED </td><td>_EC(82)</td><td>服务器尚未成功启动 </td></tr>
	 * <tr><td>NET_LISTER_INCORRECT_SERIAL</td><td>_EC(83)</td><td>输入序列号有误 </td></tr>
	 * <tr><td>NET_QUERY_DISKINFO_FAILED</td><td>_EC(84)</td><td>获取硬盘信息失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_SESSION</td><td>_EC(85)</td><td>获取连接Session信息 
	 * <tr><td>NET_USER_FLASEPWD_TRYTIME</td><td>_EC(86)</td><td>输入密码错误超过限制次数 </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_PASSWORD</td><td>_EC(100)</td><td>密码不正确 </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_USER</td><td>_EC(101)</td><td>帐户不存在 </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_TIMEOUT</td><td>_EC(102)</td><td>等待登录返回超时 </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_RELOGGIN</td><td>_EC(103)</td><td>帐号已登录 </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_LOCKED</td><td>_EC(104)</td><td>帐号已被锁定 </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_BLACKLIST</td><td>_EC(105)</td><td>帐号已被列为禁止名单 </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_BUSY</td><td>_EC(106)</td><td>资源不足,系统忙 </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_CONNECT</td><td>_EC(107)</td><td>连接主机失败</td></tr> 
	 * <tr><td>NET_LOGIN_ERROR_NETWORK</td><td>_EC(108)</td><td>网络连接失败</td></tr> 
	 * <tr><td>NET_LOGIN_ERROR_SUBCONNECT</td><td>_EC(109)</td><td>登录设备成功,但无法创建视频通道,请检查网络状况 </td></tr>
	 * <tr><td>NET_LOGIN_ERROR_MAXCONNECT</td><td>_EC(110)</td><td>超过最大连接数  </td></tr>
	 * <tr><td>NET_RENDER_SOUND_ON_ERROR</td><td>_EC(120)</td><td>Render库打开音频出错</td></tr> 
	 * <tr><td>NET_RENDER_SOUND_OFF_ERROR</td><td>_EC(121)</td><td>Render库关闭音频出错</td></tr> 
	 * <tr><td>NET_RENDER_SET_VOLUME_ERROR</td><td>_EC(122)</td><td>Render库控制音量出错</td></tr> 
	 * <tr><td>NET_RENDER_ADJUST_ERROR</td><td>_EC(123)</td><td>Render库设置画面参数出错</td></tr> 
	 * <tr><td>NET_RENDER_PAUSE_ERROR</td><td>_EC(124)</td><td>Render库暂停播放出错</td></tr> 
	 * <tr><td>NET_RENDER_SNAP_ERROR</td><td>_EC(125)</td><td>Render库抓图出错</td></tr> 
	 * <tr><td>NET_RENDER_STEP_ERROR</td><td>_EC(126)</td><td>Render库步进出错</td></tr> 
	 * <tr><td>NET_RENDER_FRAMERATE_ERROR</td><td>_EC(127)</td><td>Render库设置帧率出错</td></tr> 
	 * <tr><td>NET_GROUP_EXIST</td><td>_EC(140)</td><td>组名已存在 </td></tr>
	 * <tr><td>NET_GROUP_NOEXIST</td><td>_EC(141)</td><td>组名不存在 </td></tr>
	 * <tr><td>NET_GROUP_RIGHTOVER</td><td>_EC(142)</td><td>组的权限超出权限列表范围 </td></tr>
	 * <tr><td>NET_GROUP_HAVEUSER</td><td>_EC(143)</td><td>组下有用户,不能删除 </td></tr>
	 * <tr><td>NET_GROUP_RIGHTUSE</td><td>_EC(144)</td><td>组的某个权限被用户使用,不能出除 </td></tr>
	 * <tr><td>NET_GROUP_SAMENAME</td><td>_EC(145)</td><td>新组名同已有组名重复 </td></tr>
	 * <tr><td>NET_USER_EXIST</td><td>_EC(146)</td><td>用户已存在 </td></tr>
	 * <tr><td>NET_USER_NOEXIST</td><td>_EC(147)</td><td>用户不存在 </td></tr>
	 * <tr><td>NET_USER_RIGHTOVER</td><td>_EC(148)</td><td>用户权限超出组权限 </td></tr>
	 * <tr><td>NET_USER_PWD</td><td>_EC(149)</td><td>保留帐号,不容许修改密码 </td></tr>
	 * <tr><td>NET_USER_FLASEPWD</td><td>_EC(150)</td><td>密码不正确 </td></tr>
	 * <tr><td>NET_USER_NOMATCHING</td><td>_EC(151)</td><td>密码不匹配 </td></tr>
	 * <tr><td>NET_ERROR_GETCFG_ETHERNET</td><td>_EC(300)</td><td>获取网卡配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_WLAN</td><td>_EC(301)</td><td>获取无线网络信息失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_WLANDEV</td><td>_EC(302)</td><td>获取无线网络设备失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_REGISTER</td><td>_EC(303)</td><td>获取主动注册参数失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_CAMERA</td><td>_EC(304)</td><td>获取摄像头属性失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_INFRARED</td><td>_EC(305)</td><td>获取红外报警配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_SOUNDALARM</td><td>_EC(306)</td><td>获取音频报警配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_STORAGE</td><td>_EC(307)</td><td>获取存储位置配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_MAIL</td><td>_EC(308)</td><td>获取邮件配置失败</td></tr> 
	 * <tr><td>NET_CONFIG_DEVBUSY</td><td>_EC(309)</td><td>暂时无法设置 </td></tr>
	 * <tr><td>NET_CONFIG_DATAILLEGAL</td><td>_EC(310)</td><td>配置数据不合法 </td></tr>
	 * <tr><td>NET_ERROR_GETCFG_DST</td><td>_EC(311)</td><td>获取夏令时配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_DST</td><td>_EC(312)</td><td>设置夏令时配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_VIDEO_OSD</td><td>_EC(313)</td><td>获取视频OSD叠加配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_VIDEO_OSD</td><td>_EC(314)</td><td>设置视频OSD叠加配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_GPRSCDMA</td><td>_EC(315)</td><td>获取CDMA、GPRS网络配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_GPRSCDMA</td><td>_EC(316)</td><td>设置CDMA、GPRS网络配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_IPFILTER</td><td>_EC(317)</td><td>获取IP过滤配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_IPFILTER</td><td>_EC(318)</td><td>设置IP过滤配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_TALKENCODE</td><td>_EC(319)</td><td>获取语音对讲编码配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_TALKENCODE</td><td>_EC(320)</td><td>设置语音对讲编码配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_RECORDLEN</td><td>_EC(321)</td><td>获取录像打包长度配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_RECORDLEN</td><td>_EC(322)</td><td>设置录像打包长度配置失败</td></tr> 
	 * <tr><td>NET_DONT_SUPPORT_SUBAREA</td><td>_EC(323)</td><td>不支持网络硬盘分区 </td></tr>
	 * <tr><td>NET_ERROR_GET_AUTOREGSERVER</td><td>_EC(324)</td><td>获取设备上主动注册服务器信息失败</td></tr> 
	 * <tr><td>NET_ERROR_CONTROL_AUTOREGISTER</td><td>_EC(325)</td><td>主动注册重定向注册错误</td></tr> 
	 * <tr><td>NET_ERROR_DISCONNECT_AUTOREGISTER</td><td>_EC(326)</td><td>断开主动注册服务器错误</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_MMS</td><td>_EC(327)</td><td>获取mms配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_MMS</td><td>_EC(328)</td><td>设置mms配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_SMSACTIVATION</td><td>_EC(329)</td><td>获取短信激活无线连接配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_SMSACTIVATION</td><td>_EC(330)</td><td>设置短信激活无线连接配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_DIALINACTIVATION</td><td>_EC(331)</td><td>获取拨号激活无线连接配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_DIALINACTIVATION</td><td>_EC(332)</td><td>设置拨号激活无线连接配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_VIDEOOUT</td><td>_EC(333)</td><td>查询视频输出参数配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_VIDEOOUT</td><td>_EC(334)</td><td>设置视频输出参数配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_OSDENABLE</td><td>_EC(335)</td><td>获取osd叠加使能配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_OSDENABLE</td><td>_EC(336)</td><td>设置osd叠加使能配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_ENCODERINFO</td><td>_EC(337)</td><td>设置数字通道前端编码接入配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_TVADJUST</td><td>_EC(338)</td><td>获取TV调节配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_TVADJUST</td><td>_EC(339)</td><td>设置TV调节配置失败</td></tr> 
	 * <tr><td>NET_ERROR_CONNECT_FAILED</td><td>_EC(340)</td><td>请求建立连接失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_BURNFILE</td><td>_EC(341)</td><td>请求刻录文件上传失败</td></tr> 
	 * <tr><td>NET_ERROR_SNIFFER_GETCFG</td><td>_EC(342)</td><td>获取抓包配置信息失败</td></tr> 
	 * <tr><td>NET_ERROR_SNIFFER_SETCFG</td><td>_EC(343)</td><td>设置抓包配置信息失败</td></tr> 
	 * <tr><td>NET_ERROR_DOWNLOADRATE_GETCFG</td><td>_EC(344)</td><td>查询下载限制信息失败</td></tr> 
	 * <tr><td>NET_ERROR_DOWNLOADRATE_SETCFG</td><td>_EC(345)</td><td>设置下载限制信息失败</td></tr> 
	 * <tr><td>NET_ERROR_SEARCH_TRANSCOM</td><td>_EC(346)</td><td>查询串口参数失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_POINT</td><td>_EC(347)</td><td>获取预制点信息错误</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_POINT</td><td>_EC(348)</td><td>设置预制点信息错误</td></tr> 
	 * <tr><td>NET_SDK_LOGOUT_ERROR</td><td>_EC(349)</td><td>SDK没有正常登出设备 </td></tr>
	 * <tr><td>NET_ERROR_GET_VEHICLE_CFG</td><td>_EC(350)</td><td>获取车载配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SET_VEHICLE_CFG</td><td>_EC(351)</td><td>设置车载配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GET_ATM_OVERLAY_CFG</td><td>_EC(352)</td><td>获取atm叠加配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SET_ATM_OVERLAY_CFG</td><td>_EC(353)</td><td>设置atm叠加配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GET_ATM_OVERLAY_ABILITY</td><td>_EC(354)</td><td>获取atm叠加能力失败</td></tr> 
	 * <tr><td>NET_ERROR_GET_DECODER_TOUR_CFG</td><td>_EC(355)</td><td>获取解码器解码轮巡配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SET_DECODER_TOUR_CFG</td><td>_EC(356)</td><td>设置解码器解码轮巡配置失败</td></tr> 
	 * <tr><td>NET_ERROR_CTRL_DECODER_TOUR</td><td>_EC(357)</td><td>控制解码器解码轮巡失败</td></tr> 
	 * <tr><td>NET_GROUP_OVERSUPPORTNUM</td><td>_EC(358)</td><td>超出设备支持最大用户组数目 </td></tr>
	 * <tr><td>NET_USER_OVERSUPPORTNUM</td><td>_EC(359)</td><td>超出设备支持最大用户数目 </td></tr>
	 * <tr><td>NET_ERROR_GET_SIP_CFG</td><td>_EC(368)</td><td>获取SIP配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SET_SIP_CFG</td><td>_EC(369)</td><td>设置SIP配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GET_SIP_ABILITY</td><td>_EC(370)</td><td>获取SIP能力失败</td></tr> 
	 * <tr><td>NET_ERROR_GET_WIFI_AP_CFG</td><td>_EC(371)</td><td>获取WIFI ap配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SET_WIFI_AP_CFG</td><td>_EC(372)</td><td>设置WIFI ap配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GET_DECODE_POLICY</td><td>_EC(373)</td><td>获取解码策略配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SET_DECODE_POLICY</td><td>_EC(374)</td><td>设置解码策略配置失败</td></tr> 
	 * <tr><td>NET_ERROR_TALK_REJECT</td><td>_EC(375)</td><td>拒绝对讲 </td></tr>
	 * <tr><td>NET_ERROR_TALK_OPENED</td><td>_EC(376)</td><td>对讲被其他客户端打开 </td></tr>
	 * <tr><td>NET_ERROR_TALK_RESOURCE_CONFLICIT</td><td>_EC(377)</td><td>资源冲突 </td></tr>
	 * <tr><td>NET_ERROR_TALK_UNSUPPORTED_ENCODE</td><td>_EC(378)</td><td>不支持的语音编码格式 </td></tr>
	 * <tr><td>NET_ERROR_TALK_RIGHTLESS</td><td>_EC(379)</td><td>无权限 </td></tr>
	 * <tr><td>NET_ERROR_TALK_FAILED</td><td>_EC(380)</td><td>请求对讲失败</td></tr> 
	 * <tr><td>NET_ERROR_GET_MACHINE_CFG</td><td>_EC(381)</td><td>获取机器相关配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SET_MACHINE_CFG</td><td>_EC(382)</td><td>设置机器相关配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GET_DATA_FAILED</td><td>_EC(383)</td><td>设备无法获取当前请求数据 </td></tr>
	 * <tr><td>NET_ERROR_MAC_VALIDATE_FAILED</td><td>_EC(384)</td><td>MAC地址验证失败</td></tr> 
	 * <tr><td>NET_ERROR_GET_INSTANCE</td><td>_EC(385)</td><td>获取服务器实例失败</td></tr> 
	 * <tr><td>NET_ERROR_JSON_REQUEST</td><td>_EC(386)</td><td>生成的jason字符串错误</td></tr> 
	 * <tr><td>NET_ERROR_JSON_RESPONSE</td><td>_EC(387)</td><td>响应的jason字符串错误</td></tr> 
	 * <tr><td>NET_ERROR_VERSION_HIGHER</td><td>_EC(388)</td><td>协议版本低于当前使用的版本 </td></tr>
	 * <tr><td>NET_SPARE_NO_CAPACITY</td><td>_EC(389)</td><td>热备操作失败, 容量不足</td></tr> 
	 * <tr><td>NET_ERROR_SOURCE_IN_USE</td><td>_EC(390)</td><td>显示源被其他输出占用 </td></tr>
	 * <tr><td>NET_ERROR_REAVE</td><td>_EC(391)</td><td>高级用户抢占低级用户资源 </td></tr>
	 * <tr><td>NET_ERROR_NETFORBID</td><td>_EC(392)</td><td>禁止入网 </td></tr>
	 * <tr><td>NET_ERROR_GETCFG_MACFILTER</td><td>_EC(393)</td><td>获取MAC过滤配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_MACFILTER</td><td>_EC(394)</td><td>设置MAC过滤配置失败</td></tr> 
	 * <tr><td>NET_ERROR_GETCFG_IPMACFILTER</td><td>_EC(395)</td><td>获取IP/MAC过滤配置失败</td></tr> 
	 * <tr><td>NET_ERROR_SETCFG_IPMACFILTER</td><td>_EC(396)</td><td>设置IP/MAC过滤配置失败</td></tr> 
	 * <tr><td>NET_ERROR_OPERATION_OVERTIME</td><td>_EC(397)</td><td>当前操作超时 </td></tr>
	 * <tr><td>NET_ERROR_SENIOR_VALIDATE_FAILED</td><td>_EC(398)</td><td>高级校验失败</td></tr> 
	 * <tr><td>NET_ERROR_DEVICE_ID_NOT_EXIST</td><td>_EC(399)</td><td>设备ID不存在 </td></tr>
	 * <tr><td>NET_ERROR_UNSUPPORTED</td><td>_EC(400)</td><td>不支持当前操作 </td></tr>
	 * <tr><td>NET_ERROR_SPEAK_FAILED</td><td>_EC(406)</td><td>请求喊话失败</td></tr> 
	 * <tr><td>NET_ERROR_NOT_SUPPORT_F6</td><td>_EC(407)</td><td>设备不支持此F6接口调用 </td></tr>
	 * </table>
	 * \endif
	 * @see 
	 */
	public static native  int  			GetLastError();
	
	/**
	 * \if ENGLISH_LANG
	 * Set device connection timeout value and trial times 
	 * @param nWaitTime client and device connection waiting time,ms 
	 * @param nTryTimes connection times
	 * \else
	 * 设置连接设备超时时间和尝试次数
	 * @param nWaitTime 客户端与设备的连接等待时间,毫秒级 
	 * @param nTryTimes 连接次数 
	 * \endif
	 */
	public static native  void  		SetConnectTime(int nWaitTime, int nTryTimes);
	
	/**
	 * \if ENGLISH_LANG
	 * Set log in network environment
	 * @param pNetParam net parameter structure pointer. as {@link NET_PARAM}
	 * @return true:success, false:failed
	 * \else
	 * 设置登陆网络环境
	 * @param pNetParam 网络参数结构体指针,详见 {@link NET_PARAM}
	 * \endif
	 */
	public static native  void  		SetNetworkParam(NET_PARAM pNetParam);

	/**
	 * \if ENGLISH_LANG
	 * Set device current utc extension interface
	 * @param lLoginID LoginHandle
	 * @param pDeviceTime UTC time. as {@link NET_UTCTIME}
	 * @return true:success, false:failed
	 * \else
	 * 设置设备当前UTC时间接口
	 * @param lLoginID 登录句柄
	 * @param pDeviceTime UTC时间,详见 {@link NET_UTCTIME}
	 * \endif
	 */
	public static native  boolean  		SetDeviceUTC(long lLoginID, NET_UTCTIME pDeviceTime);

	/**
	 * \if ENGLISH_LANG
	 * Get SDK version information 
	 * @return version NO. 
	 * \else
	 * 获取SDK的版本信息
	 * @return 版本号
	 * \endif
	 */
	public static native  int  			GetSDKVersion();
	
	/**
	 * \if ENGLISH_LANG
	 * Register to the device 
	 * @param pchDVRIP device IP 
	 * @param wDVRPort device port
	 * @param pchUserName username
	 * @param pchPassword user password
	 * @param lpDeviceInfo device info, as output parameter 
	 * @param nError (when function returns successfully, its value is meanless),return to login wrong code,as follows:
	 * <table>
	 * <tr><td>wrong code</td><td>meaning</td></tr> 
	 * <tr><td>1</td><td>wrong password</td></tr> 
	 * <tr><td>2</td><td>username not exist</td></tr> 
	 * <tr><td>3</td><td>login overtime</td></tr> 
	 * <tr><td>4</td><td>account already login</td></tr> 
	 * <tr><td>5</td><td>accoung locked</td></tr>  
	 * <tr><td>6</td><td>account on block list</td></tr>
	 * <tr><td>7</td><td>insufficient resource,system busy</td></tr> 
	 * <tr><td>8</td><td>sub-connection failed</td></tr>
	 * <tr><td>9</td><td>main connection failed</td></tr> 
	 * <tr><td>10</td><td>exceed max user connections </td></tr>
	 * </table>
	 * @return failed return to 0,successful return to device ID,after successfully login operation on device may correspond to designated device via this value (device handle). 
	 * \else
	 * 向设备注册
	 * @param pchDVRIP 设备IP 
	 * @param wDVRPort 设备端口 
	 * @param pchUserName 用户名
	 * @param pchPassword 用户密码
	 * @param lpDeviceInfo 设备信息,属于输出参数
	 * @param nError 返回登录错误码
	 * <table>
	 * <tr><td>错误码</td><td>代表含义 </td></tr>
	 * <tr><td>1</td><td>密码不正确 </td></tr>
	 * <tr><td>2</td><td>用户名不存在 </td></tr>
	 * <tr><td>3</td><td>登录超时 </td></tr>
	 * <tr><td>4</td><td>帐号已登录 </td></tr>
	 * <tr><td>5</td><td>帐号已被锁定  </td></tr>
	 * <tr><td>6</td><td>帐号被列为禁止名单  </td></tr>
	 * <tr><td>7</td><td> 资源不足,系统忙 </td></tr>
	 * <tr><td>8</td><td>子连接失败 </td></tr>
	 * <tr><td>9</td><td>主连接失败 </td></tr>
	 * <tr><td>10</td><td> 超过最大用户连接数 </td></tr>
	 * </table>
	 * @return 失败返回0,成功返回设备ID,登录成功之后对设备的操作都可以通过此值(设备句柄)对应到相应的设备 
	 * \endif
	 * @see {@link INetSDK#Logout}
	 */
	public static native  long  		Login(String pchDVRIP, int wDVRPort, String pchUserName, String pchPassword, NET_DEVICEINFO lpDeviceInfo, Integer nError);
	
	/**
	 * \if ENGLISH_LANG
	 * register user ro device's extension interface, support one user to appoint capacity supported by the device
	 * @param pchDVRIP device IP
	 * @param wDVRPort device port
	 * @param pchUserName username
	 * @param pchPassword userpassword
	 * @param nSpecCap device support capability, refer to {@link EM_LOGIN_SPAC_CAP_TYPE}
	 * @param pCapParam for nSpecCap complementary parameter,when nSpecCap = 2,pCapParam fill in device serial number character string(mobile dvrlogin) 
	 * @param lpDeviceInfo device info,as output parameter
	 * @param nError (when function returns successfully, its value is meanless),return to login wrong code,as follows:
	 * <table>
	 * <tr><td>wrong code</td><td>meaning</td></tr> 
	 * <tr><td>1</td><td>wrong password</td></tr> 
	 * <tr><td>2</td><td>username not exist </td></tr>
	 * <tr><td>3</td><td>login overtime</td></tr> 
	 * <tr><td>4</td><td>account already login </td></tr>
	 * <tr><td>5</td><td>accoung locked</td></tr>  
	 * <tr><td>6</td><td>account on block list</td></tr>
	 * <tr><td>7</td><td>insufficient resource,system busy </td></tr>
	 * <tr><td>8</td><td>sub-connection failed</td></tr> 
	 * <tr><td>9</td><td>main connection failed </td></tr>
	 * <tr><td>10</td><td>exceed max user connections</td></tr> 
	 * </table>
	 * @return failed return to 0,successful return to device ID,after login successfully operations on device may be corresponded to corresponding devices via this value (device handle). 
	 * \else
	 * 向设备注册--扩展
	 * @param pchDVRIP 设备IP 
	 * @param wDVRPort 设备端口 
	 * @param pchUserName 用户名
	 * @param pchPassword 用户密码
	 * @param nSpecCap 设备支持的能力，取值参考  {@link EM_LOGIN_SPAC_CAP_TYPE}
	 * @param pCapParam 对nSpecCap 的补充参数
	 * @param lpDeviceInfo 设备信息,属于输出参数
	 * @param nError 返回登录错误码
	 * <table>
	 * <tr><td>错误码</td><td>代表含义</td></tr> 
	 * <tr><td>1</td><td>密码不正确 </td></tr>
	 * <tr><td>2</td><td>用户名不存在 </td></tr>
	 * <tr><td>3</td><td>登录超时</td></tr>
	 * <tr><td>4</td><td>帐号已登录</td></tr>
	 * <tr><td>5</td><td>帐号已被锁定 </td></tr>
	 * <tr><td>6</td><td>帐号被列为禁止名单 </td></tr> 
	 * <tr><td>7</td><td>资源不足,系统忙</td></tr> 
	 * <tr><td>8</td><td>子连接失败 </td></tr>
	 * <tr><td>9</td><td>主连接失败 </td></tr>
	 * <tr><td>10</td><td> 超过最大用户连接数 </td></tr>
	 * </table>
	 * @return 失败返回0,成功返回设备ID,登录成功之后对设备的操作都可以通过此值(设备句柄)对应到相应的设备 
	 * \endif
	 * @see {@link INetSDK#Login}　{@link INetSDK#Logout}
	 */
	public static native long 			LoginEx(String pchDVRIP, int wDVRPort, String pchUserName, String pchPassword, int nSpecCap, Object pCapParam, NET_DEVICEINFO lpDeviceInfo, Integer nError);
	
	/**
	 * \if ENGLISH_LANG
	 * register user ro device's extension interface, support one user to appoint capacity supported by the device
	 * @param pchDVRIP device IP
	 * @param wDVRPort device port
	 * @param pchUserName username
	 * @param pchPassword userpassword
	 * @param emSpecCap device support capability, refer to {@link EM_LOGIN_SPAC_CAP_TYPE}
	 * @param pCapParam for nSpecCap complementary parameter,when nSpecCap = 2,pCapParam fill in device serial number character string(mobile dvrlogin) 
	 * @param lpDeviceInfo device info,as output parameter
	 * @param nError (when function returns successfully, its value is meanless),return to login wrong code,as follows:
	 * <table>
	 * <tr><td>wrong code</td><td>meaning</td></tr> 
	 * <tr><td>1</td><td>wrong password</td></tr> 
	 * <tr><td>2</td><td>username not exist </td></tr>
	 * <tr><td>3</td><td>login overtime</td></tr> 
	 * <tr><td>4</td><td>account already login </td></tr>
	 * <tr><td>5</td><td>accoung locked</td></tr>  
	 * <tr><td>6</td><td>account on block list</td></tr>
	 * <tr><td>7</td><td>insufficient resource,system busy </td></tr>
	 * <tr><td>8</td><td>sub-connection failed</td></tr> 
	 * <tr><td>9</td><td>main connection failed </td></tr>
	 * <tr><td>10</td><td>exceed max user connections</td></tr> 
	 * </table>
	 * @return failed return to 0,successful return to device ID,after login successfully operations on device may be corresponded to corresponding devices via this value (device handle). 
	 * \else
	 * 向设备注册--扩展
	 * @param pchDVRIP 设备IP 
	 * @param wDVRPort 设备端口 
	 * @param pchUserName 用户名
	 * @param pchPassword 用户密码
	 * @param emSpecCap 设备支持的能力，取值参考  {@link EM_LOGIN_SPAC_CAP_TYPE}
	 * @param pCapParam 对nSpecCap 的补充参数
	 * @param lpDeviceInfo 设备信息,属于输出参数
	 * @param nError 返回登录错误码
	 * <table>
	 * <tr><td>错误码</td><td>代表含义</td></tr> 
	 * <tr><td>1</td><td>密码不正确 </td></tr>
	 * <tr><td>2</td><td>用户名不存在 </td></tr>
	 * <tr><td>3</td><td>登录超时</td></tr>
	 * <tr><td>4</td><td>帐号已登录</td></tr>
	 * <tr><td>5</td><td>帐号已被锁定 </td></tr>
	 * <tr><td>6</td><td>帐号被列为禁止名单 </td></tr> 
	 * <tr><td>7</td><td>资源不足,系统忙</td></tr> 
	 * <tr><td>8</td><td>子连接失败 </td></tr>
	 * <tr><td>9</td><td>主连接失败 </td></tr>
	 * <tr><td>10</td><td> 超过最大用户连接数 </td></tr>
	 * </table>
	 * @return 失败返回0,成功返回设备ID,登录成功之后对设备的操作都可以通过此值(设备句柄)对应到相应的设备 
	 * \endif
	 * @see {@link INetSDK#Login}　{@link INetSDK#Logout}
	 */
	public static native long 			LoginEx2(String pchDVRIP, int wDVRPort, String pchUserName, String pchPassword, int emSpecCap, Object pCapParam, NET_DEVICEINFO_Ex lpDeviceInfo, Integer nError);

	/**
	 * \if ENGLISH_LANG
	 * Log out the device
	 * @param pstLoginParam input parameter
	 * @param lpDeviceInfo device info,as output parameter
	 * @param error return login error code,refer to{@link INetSDK#Login}
	 * @return failed return to 0,successful return to device ID,after login successfully operations on device may be corresponded to corresponding devices via this value (device handle).
	 * \else
	 * TLS加密策略登入扩展接口
	 * @param pstLoginParam 输入参数
	 * @param lpDeviceInfo  设备信息,属于输出参数
	 * @param error 返回登录错误码, 参考 {@link INetSDK#Login}
	 * @return 失败返回0,成功返回设备ID,登录成功之后对设备的操作都可以通过此值(设备句柄)对应到相应的设备
	 * \endif
	 * @see {@link INetSDK#Login}　
	 */
	public static native long		    LoginEx3( NET_LOGIN_PARAM pstLoginParam, NET_DEVICEINFO_Ex 	lpDeviceInfo, Integer error);

	public static native long			LoginWithPolicy(NET_IN_LOGIN_POLICY_PARAM pInParam, NET_OUT_LOGIN_POLICY_PARAM pOutParam, int nWaitTime);

	public static native long			LoginWithHighLevelSecurity(NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY pstInParam, NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY pstOutParam);

	public static native int			PostLoginTask(NET_IN_POST_LOGIN_TASK pInParam, NET_OUT_POST_LOGIN_TASK pOutParam);

	public static native int			CancelLoginTask(int  dwTaskID);
	/**
	 * \if ENGLISH_LANG
	 * Log out the device 
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @return successful return to TRUE,failed return to FALSE
	 * \else
	 * 退出设备
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#Login}　
	 */
	public static native boolean   		Logout(long lLoginID);

	/**
	 * \if ENGLISH_LANG
	 * New configuration interface, Search configuration information(using Json protocol, see configuration SDK)
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param szCommand command parameter, refer to ParseData 
	 * @param nChannelID channel NO.
	 * @param szOutBuffer output buffering 
	 * @param dwOutBufferSize output buffering size
	 * @param error wrong code 
	 * <table>
	 * <tr><td>0</td><td>successful</td></tr> 
	 * <tr><td>1</td><td>failed</td></tr> 
	 * <tr><td>2</td><td>illegal data</td></tr> 
	 * <tr><td>3</td><td>temporarily not available</td></tr> 
	 * <tr><td>4</td><td>not authorized </td></tr>
	 * </table>
	 * @param waittime overtime of wailing
	 * @return true:success, false:failed
	 * \else
	 * 新配置接口,查询配置信息(以Json格式)
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param szCommand 命令参数,详见 ParseData 
	 * @param nChannelID 通道号 
	 * @param szOutBuffer 输出缓冲 
	 * @param dwOutBufferSize 输出缓冲大小 
	 * @param error 错误码 
	 * <table>
	 * <tr><td>0</td><td>成功</td></tr> 
	 * <tr><td>1</td><td>失败 </td></tr>
	 * <tr><td>2</td><td>数据不合法 </td></tr>
	 * <tr><td>3</td><td>暂时无法设置</td></tr> 
	 * <tr><td>4</td><td>没有权限 </td></tr>
	 * </table>
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#ParseData}
	 */
	public static native  boolean  	GetNewDevConfig(long lLoginID, String szCommand, int nChannelID, char[] szOutBuffer, int dwOutBufferSize, Integer error, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * New configuration interface, Set configuration information(using Json protocol, see configuration SDK)
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param szCommand  please refer to ParseData
	 * @param nChannelID channel NO.
	 * @param szInBuffer input buffering
	 * @param dwInBufferSize input buffering size
	 * @param error worng code
	 * <table>
	 * <tr><td>0</td><td>successful</td></tr> 
	 * <tr><td>1</td><td>failed</td></tr> 
	 * <tr><td>2</td><td>illegal data </td></tr>
	 * <tr><td>3</td><td>temporarily not available </td></tr>
	 * <tr><td>4</td><td>not authorized</td></tr> 
	 * </table>
	 * @param restart reboot device after set config,1 is reboot,0 is not reboot
	 * @param waittime overtime of waiting  
	 * @return true:success, false:failed
	 * \else
	 * 新配置接口,设置配置信息(以Json格式)
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param szCommand  命令参数 详见 ParseData
	 * @param nChannelID 通道号 
	 * @param szInBuffer 输入缓冲 
	 * @param dwInBufferSize 输入缓冲大小 
	 * @param error 错误码
	 * <table>
	 * <tr><td>0</td><td>成功 </td></tr>
	 * <tr><td>1</td><td>失败 </td></tr>
	 * <tr><td>2</td><td> 数据不合法 </td></tr>
	 * <tr><td>3</td><td> 暂时无法设置 </td></tr>
	 * <tr><td>4</td><td> 没有权限 </td></tr>
	 * </table>
	 * @param restart 配置设置后是否需要重启设备,1表示需要重启,0表示不需要重启 
	 * @param waittime 等待时间  
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#PacketData}
	 */
	public static native  boolean  	SetNewDevConfig(long lLoginID, String szCommand, int nChannelID, char[] szInBuffer, long dwInBufferSize, Integer error, Integer restart, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * Delete configuration interface(Json format)
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaittime overtime of waiting 
	 * @return successful return to TRUE,failed return to FALSE
	 * \else
	 * 删除配置接口(Json格式)(pInParam, pOutParam内存由用户申请释放)
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaittime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native  boolean  	DeleteDevConfig(long lLoginID, NET_IN_DELETECFG pInParam, NET_OUT_DELETECFG pOutParam, int nWaittime);
	
	/**
	 * \if ENGLISH_LANG
	 * analyze to receive character string config info
	 * @param szCommand command parameter, as follows
	 * {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig} interface command
	 * <table>
	 * <tr><td>CFG_CMD_ENCODE</td><td>"Encode"</td><td>image channel property config,structure CFG_ENCODE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RECORD</td><td>"Record"</td><td>timed recordconfig,structure CFG_RECORD_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ALARMINPUT</td><td>"Alarm"</td><td>external inputalarmconfig,structure CFG_ALARMIN_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NETALARMINPUT</td><td>"NetAlarm"</td><td>network alarmconfig,structure CFG_NETALARMIN_INFO</td></tr> 
	 * <tr><td>CFG_CMD_MOTIONDETECT</td><td>"MotionDetect"</td><td>dynamic detectionalarmconfig,structure CFG_MOTION_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOLOST</td><td>"LossDetect"</td><td>video loss alarmconfig,structure CFG_VIDEOLOST_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOBLIND</td><td>"BlindDetect"</td><td>video mask alarmconfig,structure CFG_SHELTER_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGENOEXIST</td><td>"StorageNotExist"</td><td>no storage device config,structure CFG_STORAGENOEXIST_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEFAILURE</td><td>"StorageFailure"</td><td>storage device access mistake config,structure CFG_STORAGEFAILURE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGELOWSAPCE</td><td>"StorageLowSpace"</td><td>storage device low volume config,structure CFG_STORAGELOWSAPCE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NETABORT</td><td>"NetAbort"</td><td>disconnected config,structure CFG_NETABORT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_IPCONFLICT</td><td>"IPConflict"</td><td>IP conflict setting,structure CFG_IPCONFLICT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_SNAPCAPINFO</td><td>"SnapInfo"</td><td>snapshot ,structure CFG_SNAPCAPINFO_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NAS</td><td>"NAS"</td><td>network storage serverconfig,structure CFG_NAS_INFO</td></tr> 
	 * <tr><td>CFG_CMD_PTZ</td><td>"Ptz"</td><td>PTZ config,structure CFG_PTZ_INFO</td></tr> 
	 * <tr><td>CFG_CMD_WATERMARK</td><td>"WaterMark"</td><td>video water mark config,structure CFG_WATERMARK_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSEGLOBAL</td><td>"VideoAnalyseGlobal"</td><td>video full analysis config,structure CFG_ANALYSEGLOBAL_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSEMODULE</td><td>"VideoAnalyseModule"</td><td>object's detection module config,structure CFG_ANALYSEMODULES_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSERULE</td><td>"VideoAnalyseRule"</td><td>video analyzing rule config,structure CFG_ANALYSERULES_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSESOURCE</td><td>"VideoAnalyseSource"</td><td>video analyzing resource config,structure CFG_ANALYSESOURCE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RAINBRUSH</td><td>"RainBrush"</td><td>wiper config CFG_RAINBRUSH_INFO</td></tr> 
	 * <tr><td>CFG_CMD_TRAFFICGLOBAL</td><td>"TrafficGlobal"</td><td>full intellifent traffic config CFG_TRAFFICGLOBAL_INFO</td></tr> 
	 * <tr><td>CFG_CMD_DEV_GENERRAL</td><td>"General"</td><td>normal config CFG_DEV_DISPOSITION_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ATMMOTION</td><td>"FetchMoneyOverTime"</td><td>ATM expired config CFG_ATMMOTION_INFO</td></tr> 
	 * <tr><td>CFG_CMD_SNAPSOURCE</td><td>"SnapSource"</td><td>snapshot source config,structure CFG_SNAPSOURCE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_DEVICESTATUS</td><td>"DeviceStatus"</td><td>device status info CFG_DEVICESTATUS_INFO</td></tr> 
	 * <tr><td>CFG_CMD_HARDDISKTANK</td><td>"HardDiskTank"</td><td>extension info,structure CFG_HARDISKTANKGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RAIDGROUP</td><td>"RaidGroup"</td><td>Raid froup info,structure CFG_RAIDGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEPOOLGROUP</td><td>"StoragePoolGroup"</td><td>storage pool info,structure CFG_STORAGEPOOLGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEPOSITIONGROUP</td><td>"StoragePositionGroup"</td><td>file system group info,structure CFG_STORAGEPOSITIONGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOINDEVGROUP</td><td>"VideoInDevGroup"</td><td>frong-end device group info CFG_VIDEOINDEVGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_DEVRECORDGROUP</td><td>"DevRecordGroup"</td><td>channelrecord group status,structure CFG_DEVRECORDGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_IPSSERVER</td><td>"IpsServer"</td><td>service status,structure CFG_IPSERVER_STATUS </td></tr>
	 * <tr><td>CFG_CMD_MATRIX_SPOT</td><td>"SpotMatrix"</td><td>Spot vide matrix,structure CFG_VIDEO_MATRIX </td></tr>
	 * <tr><td>CFG_CMD_HDVR_DSP</td><td>"DspEncodeCap"</td><td>every number channel dsp info,structure CFG_DSPENCODECAP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_HDVR_DSP</td><td>"DspEncodeCap"</td><td>every number channel dsp info,structure CFG_DSPENCODECAP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_SPLITTOUR</td><td>"SplitTour"</td><td>video splicing tour config,structure CFG_VIDEO_MATRIX</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOENCODEROI</td><td>"VideoEncodeROI"</td><td>video encode ROI(Region of Intrest)config,structure CFG_VIDEOENCODEROI_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEO_INMETERING</td><td>"VideoInMetering"</td><td>light inspection config,structure CFG_VIDEO_INMETERING_INFO</td></tr> 
	 * <tr><td>CFG_CMD_TRAFFIC_FLOWSTAT</td><td>"TrafficFlowStat"</td><td>traffic flow statistics config,structure CFG_TRAFFIC_FLOWSTAT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOINOPTIONS</td><td>"VideoInOptions"</td><td>videoinput front-end option,structure CFG_VIDEO_IN_OPTIONS</td></tr> 
	 * <tr><td>CFG_CMD_RTSP</td><td>"RTSP"</td><td>RTSP config,structure CFG_RTSP_INFO_IN , CFG_RTSP_INFO_OUT</td></tr> 
	 * <tr><td>CFG_CMD_TRAFFICSNAPSHOT_MULTI</td><td>"TrafficSnapshotNew"</td><td>intelligent traffic snapshot CFG_TRAFFICSNAPSHOT_NEW_INFO</td></tr> 
	 * <tr><td>CFG_CMD_MULTICAST</td><td>"Multicast"</td><td>multicast related config,structure CFG_MULTICASTS_INFO_IN , CFG_MULTICASTS_INFO_OUT</td></tr> 
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_PROFILE</td><td>"VideoDiagnosisProfile"</td><td>video diagnosis parameter list,structure CFG_VIDEODIAGNOSIS_PROFILE</td></tr> 
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_TASK</td><td>"VideoDiagnosisTask"</td><td>video diagnosis task list,structure CFG_VIDEODIAGNOSIS_TASK </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_PROJECT</td><td>"VideoDiagnosisProject"</td><td>video diagnosis plan list CFG_VIDEODIAGNOSIS_PROJECT </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_GLOBAL</td><td>"VideoDiagnosisGlobal"</td><td>video full diagnosis list CFG_VIDEODIAGNOSIS_GLOBAL </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_TASK_ONE</td><td>"VideoDiagnosisTask.x"</td><td>video diagnosis task list CFG_VIDEODIAGNOSIS_TASK </td></tr>
	 * <tr><td>CFG_CMD_TRAFFIC_WORKSTATE</td><td>"WorkState"</td><td>device working status relatedconfig,structure CFG_TRAFFIC_WORKSTATE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEDEVGROUP</td><td>"StorageDevGroup"</td><td>disk storage group config,structure CFG_STORAGEGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RECORDTOGROUP</td><td>"RecordToGroup"</td><td>record stored storage group config,structure CFG_RECORDTOGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_INTELLITRACKSCENE</td><td>"IntelliTrackScene"</td><td>intelligent tracking scene config,structure CFG_INTELLITRACKSCENE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_IVSFRAM_RULE</td><td>"IVSFramRule"</td><td>intelligent frame rule config,structure CFG_ANALYSERULES_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RECORD_STORAGEPOINT</td><td>"RecordStoragePoint"</td><td>record storage point mapping config,structure CFG_RECORDTOSTORAGEPOINT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_MD_SERVER</td><td>"MetaDataServer"</td><td>source data serverconfig,structure CFG_METADATA_SERVER </td></tr>
	 * <tr><td>CFG_CMD_CHANNELTITLE</td><td>"ChannelTitle"</td><td>channel name AV_CFG_ChannelName </td></tr>
	 * <tr><td>CFG_CMD_RECORDMODE</td><td>"RecordMode"</td><td>record mode AV_CFG_RecordMode </td></tr>
	 * <tr><td>CFG_CMD_VIDEOOUT</td><td>"VideoOut"</td><td>videooutput property AV_CFG_VideoOutAttr </td></tr>
	 * <tr><td>CFG_CMD_REMOTEDEVICE</td><td>"RemoteDevice"</td><td>remote device info AV_CFG_RemoteDevice</td></tr> 
	 * <tr><td>CFG_CMD_REMOTECHANNEL</td><td>"RemoteChannel"</td><td>remote channel AV_CFG_RemoteChannel </td></tr>
	 * <tr><td>CFG_CMD_MONITORTOUR</td><td>"MonitorTour"</td><td>image tour config AV_CFG_MonitorTour </td></tr>
	 * <tr><td>CFG_CMD_MONITORCOLLECTION</td><td>"MonitorCollection"</td><td>image favorite config AV_CFG_MonitorCollection </td></tr>
	 * <tr><td>CFG_CMD_DISPLAYSOURCE</td><td>"DisplaySource"</td><td>image splicing display source config AV_CFG_ChannelDisplaySource </td></tr>
	 * <tr><td>CFG_CMD_RAID</td><td>"Raid"</td><td>storage group config AV_CFG_Raid </td></tr>
	 * <tr><td>CFG_CMD_RECORDSOURCE</td><td>"RecordSource"</td><td>record source config AV_CFG_RecordSource </td></tr>
	 * <tr><td>CFG_CMD_VIDEOCOLOR</td><td>"VideoColor"</td><td>videoinput color config AV_CFG_ChannelVideoColor </td></tr>
	 * <tr><td>CFG_CMD_VIDEOWIDGET</td><td>"VideoWidget"</td><td>video encoding object config AV_CFG_VideoWidget </td></tr>
	 * <tr><td>CFG_CMD_STORAGEGROUP</td><td>"StorageGroup"</td><td>storage group info AV_CFG_StorageGroup </td></tr>
	 * <tr><td>CFG_CMD_LOCALS</td><td>"Locales"</td><td>area config AV_CFG_Locales </td></tr>
	 * <tr><td>CFG_CMD_LANGUAGE</td><td>"Language"</td><td>language selection AV_CFG_Language </td></tr>
	 * <tr><td>CFG_CMD_ACCESSFILTER</td><td>"AccessFilter"</td><td>visit address filter AV_CFG_AccessFilter </td></tr>
	 * <tr><td>CFG_CMD_AUTOMAINTAIN</td><td>"AutoMaintain"</td><td>auto maintenance AV_CFG_AutoMaintain </td></tr>
	 * <tr><td>CFG_CMD_REMOTEEVENT</td><td>"RemoteEvent"</td><td>remote device event process AV_CFG_RemoteEvent </td></tr>
	 * <tr><td>CFG_CMD_MONITORWALL</td><td>"MonitorWall"</td><td>display wall config AV_CFG_MonitorWall </td></tr>
	 * <tr><td>CFG_CMD_SPLICESCREEN</td><td>"VideoOutputComposite"</td><td>mixing screen config AV_CFG_SpliceScreen </td></tr>
	 * <tr><td>CFG_CMD_TEMPERATUREALARM</td><td>"TemperatureAlarm"</td><td>temperature alarmconfig AV_CFG_TemperatureAlarm </td></tr>
	 * <tr><td>CFG_CMD_FANSPEEDALARM</td><td>"FanSpeedAlarm"</td><td>fan speed alarmconfig AV_CFG_FanSpeedAlarm </td></tr>
	 * <tr><td>CFG_CMD_RECORDBACKUP</td><td>"RecordBackupRestore.BitrateLimit"</td><td>record rotate config AV_CFG_RecordBackup </td></tr>
	 * <tr><td>CFG_CMD_RECORDBACKUPDEVICE</td><td>"RecordBackupRestore.BackupDevices"</td><td>record rotate backup device config AV_CFG_RemoteDevice </td></tr>
	 * <tr><td>CFG_CMD_COMM</td><td>"Comm"</td><td>serial config CFG_COMMGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NETWORK</td><td>"Network"</td><td>network config CFG_NETWORK_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NASEX</td><td>"NAS"</td><td>network storage serverconfig, multi-server CFG_NAS_GROUP_INFO_EX </td></tr>
	 * <tr><td>CFG_CMD_ALARMOUT</td><td>"AlarmOut"</td><td>alarmoutput channel config CFG_ALARMOUT_INFO</td></tr>  
	 * <tr><td>CFG_CMD_COMMGLOBAL</td><td>"CommGlobal"</td><td>global alarm config CFG_COMMGLOBAL_INFO</td></tr>  
	 * <tr><td>CFG_CMD_MOBILE</td><td>"Mobile"</td><td>mobile config CFG_MOBILE_INFO</td></tr>  
	 * <tr><td>CFG_CMD_NTP</td><td>"NTP"</td><td>time synchronization config CFG_NTP_INFO</td></tr>  
	 * <tr><td>CFG_CMD_PHONEEVENTNOTIFY</td><td>"PhoneEventNotify"</td><td>phone center notify config CFG_PHONEEVENTNOTIFY_INFO</td></tr>  
	 * <tr><td>CFG_CMD_WIRELESS</td><td>"Wireless"</td><td>wireless connect config CFG_WIRELESS_INFO</td></tr>  
	 * <tr><td>CFG_CMD_PSTN_ALARM_SERVER</td><td>"PSTNAlarmServer"</td><td>phone alarm center config CFG_PSTN_ALARM_CENTER_INFO</td></tr>  
	 * <tr><td>CFG_CMD_ACCESS_GENERAL</td><td>"AccessControlGeneral"</td><td>access control general config CFG_ACCESS_GENERAL_INFO</td></tr>  
	 * <tr><td>CFG_CMD_ACCESS_EVENT</td><td>"AccessControl"</td><td>access event config CFG_ACCESS_EVENT_INFO</td></tr>  
	 * <tr><td>CFG_CMD_AUDIO_SPIRIT</td><td>"AudioSpirit"</td><td>Voice Incentive(Corresponding CFG_AUDIO_SPIRIT)</td></tr>
	 * <tr><td>CFG_CMD_IOT_INFRARED_DETECT</td><td>"IOT_InfraredDetect"</td><td>configuration of IOT infrared detection(corresponding to CFG_IOT_INFRARED_DETECT_INFO)</td></tr>
	 * <tr><td>CFG_CMD_IOT_RECORD_HANDLE</td><td>"IOT_RecordHandle"</td><td>configuration of IOT record handle(corresponding to CFG_IOT_RECORD_HANDLE_INFO)</td></tr>
	 * <tr><td>CFG_CMD_IOT_SNAP_HANDLE</td><td>"IOT_SnapHandle"</td><td>configuration of IOT snap handle(corresponding to CFG_IOT_SNAP_HANDLE_INFO)</td></tr>
	 * <tr><td>CFD_CMD_DOORBELLSOUND</td><td>"DoorBellSound"</td><td>configuration of door bell sound(corresponding to CFG_DOOR_BELLSOUND_INFO)</td></tr>
	 * <tr><td>CFG_CMD_AIO_APP_CONFIG</td><td>"AIOAppConfig"</td><td>configuration of the AOIAppConfig(corresponding to CFG_AIO_APP_CONFIG_INFO)</td></tr>
	 * </table>
	 * {@link INetSDK#QueryNewSystemInfo} interface command
	 * <table>
	 * <tr><td>CFG_CAP_CMD_VIDEOANALYSE</td><td>"devVideoAnalyse.getCaps"</td><td>video analysis capacity collection,structure CFG_CAP_ANALYSE_INFO</td></tr> 
	 * <tr><td>CFG_NETAPP_REMOTEDEVICE</td><td>"netApp.getRemoteDeviceStatus"</td><td>receive rear device's online status,structure CFG_REMOTE_DEVICE_STATUS 
	 * <tr><td>CFG_DEVICE_CAP_NEW_CMD_VIDEOANALYSE</td><td>"devVideoAnalyse.factory.getCollect"</td><td>device intelligent analysis capacity,structure CFG_CAP_DEVICE_ANALYSE_INFO</td></tr> 
	 * <tr><td>CFG_CAP_CMD_DEVICE_STATE</td><td>"trafficSnap.getDeviceStatus"</td><td>receive external device status info,structure CFG_CAP_TRAFFIC_DEVICE_STATUS</td></tr> 
	 * <tr><td>CFG_CAP_CMD_VIDEOINPUT</td><td>"devVideoInput.getCaps"</td><td>videoinput capacity collection,structure CFG_CAP_VIDEOINPUT_INFO</td></tr> 
	 * <tr><td>CFG_USERMANAGER_ACTIVEUSER</td><td>"userManager.getActiveUserInfoAll"</td><td>receive all active users info,structure CFG_ACTIVEUSER_INFO</td></tr> 
	 * <tr><td>CFG_CAP_VIDEOSTAT_SUMMARY</td><td>"videoStatServer.getSummary"</td><td>receive video statistics summary,structure CFG_VIDEOSATA_SUMMARY_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_GETCOLLECT</td><td>"videoDiagnosisServer.factory.getCollect"</td><td>receive video disgnosis serving capacity,structure CFG_VIDEODIAGNOSIS_GETCOLLECT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_GETSTATE</td><td>"videoDiagnosisServer.getState"</td><td>receive video disgnosis channel quantity,structure CFG_VIDEODIAGNOSIS_STATE_INFO</td></tr> 
	 * <tr><td>CFG_CAP_CMD_VIDEODIAGNOSIS_SERVER</td><td>"videoDiagnosisServer.getCaps"</td><td>receive video disgnosis progress status,structure CFG_VIDEODIAGNOSIS_CAPS_INFO</td></tr> 
	 * <tr><td>CFG_CAP_CMD_EVENTMANAGER</td><td>"eventManager.getCaps"</td><td>get alarm event handler capacity , old structure is abolish,please use this structure if develop CFG_CAP_EVENTMANAGER_INFO</td></tr> 
	 * <tr><td>CFG_CAP_CMD_EXALARMBOX</td><td>"alarm.getExAlarmBoxCaps"</td><td>get externd alarm box capacity CFG_CAP_EXALARMBOX_INFO</td></tr> 
	 * <tr><td>CFG_CAP_CMD_EXALARM</td><td>"alarm.getExAlarmCaps"</td><td>get extend alarm capacity CFG_CAP_EXALARM_INFO</td></tr> 
	 * <tr><td>CFG_CAP_CMD_ACCESSCONTROLMANAGER</td><td>"accessControlManager.getCaps"</td><td>get access control manager capacity CFG_CAP_ACCESSCONTROL</td></tr> 
	 * <tr><td>CFG_CAP_CMD_FILEMANAGER</td><td>"FileManager.getCaps"</td><td>get file manager capacity CFG_CAP_FILEMANAGER</td></tr>
	 * <tr><td>CFG_CAP_CMD_RECORDFINDER</td><td>"RecordFinder.getCaps"</td><td>get record finder capacity CFG_CAP_RECORDFINDER_INFO</td></tr> 
	 * </table>
	 * @param szInBuffer input buffering,character config buffering
	 * @param stParseData output buffering,structure type refer to above chart
	 * @param pReserved reserve parameter
	 * @return true:success, false:failed
	 * \else
	 * 解析查询到的配置信息
	 * @param szCommand 命令参数
	 * {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig} 接口命令
	 * <table>
	 * <tr><td>CFG_CMD_ENCODE</td><td>"Encode"</td><td>图像通道属性配置,结构体  CFG_ENCODE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RECORD</td><td>"Record"</td><td>定时录像配置,结构体  CFG_RECORD_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ALARMINPUT</td><td>"Alarm"</td><td>外部输入报警配置,结构体  CFG_ALARMIN_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NETALARMINPUT</td><td>"NetAlarm"</td><td>网络报警配置,结构体  CFG_NETALARMIN_INFO</td></tr> 
	 * <tr><td>CFG_CMD_MOTIONDETECT</td><td>"MotionDetect"</td><td>动态检测报警配置,结构体  CFG_MOTION_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOLOST</td><td>"LossDetect"</td><td>视频丢失报警配置,结构体  CFG_VIDEOLOST_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOBLIND</td><td>"BlindDetect"</td><td>视频遮挡报警配置,结构体  CFG_SHELTER_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGENOEXIST</td><td>"StorageNotExist"</td><td>没有存储设备配置,结构体  CFG_STORAGENOEXIST_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEFAILURE</td><td>"StorageFailure"</td><td>存储设备访问出错配置,结构体  CFG_STORAGEFAILURE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGELOWSAPCE</td><td>"StorageLowSpace"</td><td>存储设备容量低配置,结构体  CFG_STORAGELOWSAPCE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NETABORT</td><td>"NetAbort"</td><td>网络断开配置,结构体  CFG_NETABORT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_IPCONFLICT</td><td>"IPConflict"</td><td>IP冲突设置,结构体  CFG_IPCONFLICT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_SNAPCAPINFO</td><td>"SnapInfo"</td><td>抓图能力,结构体  CFG_SNAPCAPINFO_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NAS</td><td>"NAS"</td><td>网络存储服务器配置,结构体  CFG_NAS_INFO</td></tr> 
	 * <tr><td>CFG_CMD_PTZ</td><td>"Ptz"</td><td>云台配置,结构体  CFG_PTZ_INFO</td></tr> 
	 * <tr><td>CFG_CMD_WATERMARK</td><td>"WaterMark"</td><td>视频水印配置,结构体 CFG_WATERMARK_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSEGLOBAL</td><td>"VideoAnalyseGlobal"</td><td>视频分析全局配置,结构体  CFG_ANALYSEGLOBAL_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSEMODULE</td><td>"VideoAnalyseModule"</td><td>物体的检测模块配置,结构体  CFG_ANALYSEMODULES_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSERULE</td><td>"VideoAnalyseRule"</td><td>视频分析规则配置,结构体  CFG_ANALYSERULES_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ANALYSESOURCE</td><td>"VideoAnalyseSource"</td><td>视频分析资源配置,结构体  CFG_ANALYSESOURCE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RAINBRUSH</td><td>"RainBrush"</td><td>雨刷配置  CFG_RAINBRUSH_INFO</td></tr> 
	 * <tr><td>CFG_CMD_TRAFFICGLOBAL</td><td>"TrafficGlobal"</td><td>智能交通全局配置 CFG_TRAFFICGLOBAL_INFO</td></tr> 
	 * <tr><td>CFG_CMD_DEV_GENERRAL</td><td>"General"</td><td>普通配置  CFG_DEV_DISPOSITION_INFO</td></tr> 
	 * <tr><td>CFG_CMD_ATMMOTION</td><td>"FetchMoneyOverTime"</td><td>ATM取款超时配置  CFG_ATMMOTION_INFO</td></tr> 
	 * <tr><td>CFG_CMD_SNAPSOURCE</td><td>"SnapSource"</td><td>抓图源配置,结构体  CFG_SNAPSOURCE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_DEVICESTATUS</td><td>"DeviceStatus"</td><td>设备状态信息  CFG_DEVICESTATUS_INFO</td></tr> 
	 * <tr><td>CFG_CMD_HARDDISKTANK</td><td>"HardDiskTank"</td><td>扩展柜信息,结构体  CFG_HARDISKTANKGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RAIDGROUP</td><td>"RaidGroup"</td><td>Raid组信息,结构体  CFG_RAIDGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEPOOLGROUP</td><td>"StoragePoolGroup"</td><td>存储池组信息,结构体  CFG_STORAGEPOOLGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEPOSITIONGROUP</td><td>"StoragePositionGroup"</td><td>文件系统组信息,结构体  CFG_STORAGEPOSITIONGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOINDEVGROUP</td><td>"VideoInDevGroup"</td><td>前端设备组信息  CFG_VIDEOINDEVGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_DEVRECORDGROUP</td><td>"DevRecordGroup"</td><td>通道录像组状态,结构体  CFG_DEVRECORDGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_IPSSERVER</td><td>"IpsServer"</td><td>服务状态,结构体  CFG_IPSERVER_STATUS</td></tr> 
	 * <tr><td>CFG_CMD_MATRIX_SPOT</td><td>"SpotMatrix"</td><td>Spot视屏矩阵,结构体  CFG_VIDEO_MATRIX </td></tr>
	 * <tr><td>CFG_CMD_HDVR_DSP</td><td>"DspEncodeCap"</td><td>每个数字通道的dsp信息,结构体  CFG_DSPENCODECAP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_HDVR_DSP</td><td>"DspEncodeCap"</td><td>每个数字通道的dsp信息,结构体  CFG_DSPENCODECAP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_SPLITTOUR</td><td>"SplitTour"</td><td>视频分割轮巡配置,结构体  CFG_VIDEO_MATRIX </td></tr>
	 * <tr><td>CFG_CMD_VIDEOENCODEROI</td><td>"VideoEncodeROI"</td><td>视频编码ROI(Region of Intrest)配置,结构体  CFG_VIDEOENCODEROI_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEO_INMETERING</td><td>"VideoInMetering"</td><td>测光配置,结构体  CFG_VIDEO_INMETERING_INFO</td></tr> 
	 * <tr><td>CFG_CMD_TRAFFIC_FLOWSTAT</td><td>"TrafficFlowStat"</td><td>交通流量统计配置,结构体  CFG_TRAFFIC_FLOWSTAT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOINOPTIONS</td><td>"VideoInOptions"</td><td>视频输入前端选项,结构体  CFG_VIDEO_IN_OPTIONS </td></tr>
	 * <tr><td>CFG_CMD_RTSP</td><td>"RTSP"</td><td>RTSP的配置,结构体  CFG_RTSP_INFO_IN , CFG_RTSP_INFO_OUT</td></tr> 
	 * <tr><td>CFG_CMD_TRAFFICSNAPSHOT_MULTI</td><td>"TrafficSnapshotNew"</td><td>智能交通抓拍 CFG_TRAFFICSNAPSHOT_NEW_INFO</td></tr> 
	 * <tr><td>CFG_CMD_MULTICAST</td><td>"Multicast"</td><td>组播的相关配置,结构体  CFG_MULTICASTS_INFO_IN , CFG_MULTICASTS_INFO_OUT</td></tr> 
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_PROFILE</td><td>"VideoDiagnosisProfile"</td><td>视频诊断参数表,结构体  CFG_VIDEODIAGNOSIS_PROFILE </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_TASK</td><td>"VideoDiagnosisTask"</td><td>视频诊断任务表,结构体  CFG_VIDEODIAGNOSIS_TASK</td></tr> 
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_PROJECT</td><td>"VideoDiagnosisProject"</td><td>视频诊断计划表  CFG_VIDEODIAGNOSIS_PROJECT</td></tr> 
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_GLOBAL</td><td>"VideoDiagnosisGlobal"</td><td>视频诊断全局表  CFG_VIDEODIAGNOSIS_GLOBAL </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_TASK_ONE</td><td>"VideoDiagnosisTask.x"</td><td>视频诊断任务表  CFG_VIDEODIAGNOSIS_TASK </td></tr>
	 * <tr><td>CFG_CMD_TRAFFIC_WORKSTATE</td><td>"WorkState"</td><td>设备工作状态相关配置,结构体  CFG_TRAFFIC_WORKSTATE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_STORAGEDEVGROUP</td><td>"StorageDevGroup"</td><td>磁盘存储组配置,结构体  CFG_STORAGEGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RECORDTOGROUP</td><td>"RecordToGroup"</td><td>录像存放的存储组配置,结构体  CFG_RECORDTOGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_INTELLITRACKSCENE</td><td>"IntelliTrackScene"</td><td>智能跟踪场景配置,结构体  CFG_INTELLITRACKSCENE_INFO</td></tr> 
	 * <tr><td>CFG_CMD_IVSFRAM_RULE</td><td>"IVSFramRule"</td><td>智能帧规则配置,结构体  CFG_ANALYSERULES_INFO</td></tr> 
	 * <tr><td>CFG_CMD_RECORD_STORAGEPOINT</td><td>"RecordStoragePoint"</td><td>录像存储点映射配置,结构体  CFG_RECORDTOSTORAGEPOINT_INFO</td></tr> 
	 * <tr><td>CFG_CMD_MD_SERVER</td><td>"MetaDataServer"</td><td>元数据服务器配置,结构体  CFG_METADATA_SERVER </td></tr>
	 * <tr><td>CFG_CMD_CHANNELTITLE</td><td>"ChannelTitle"</td><td>通道名称  AV_CFG_ChannelName </td></tr>
	 * <tr><td>CFG_CMD_RECORDMODE</td><td>"RecordMode"</td><td>录像模式  AV_CFG_RecordMode </td></tr>
	 * <tr><td>CFG_CMD_VIDEOOUT</td><td>"VideoOut"</td><td>视频输出属性  AV_CFG_VideoOutAttr </td></tr>
	 * <tr><td>CFG_CMD_REMOTEDEVICE</td><td>"RemoteDevice"</td><td>远程设备信息  AV_CFG_RemoteDevice </td></tr>
	 * <tr><td>CFG_CMD_REMOTECHANNEL</td><td>"RemoteChannel"</td><td>远程通道  AV_CFG_RemoteChannel </td></tr>
	 * <tr><td>CFG_CMD_MONITORTOUR</td><td>"MonitorTour"</td><td>画面轮训配置  AV_CFG_MonitorTour </td></tr>
	 * <tr><td>CFG_CMD_MONITORCOLLECTION</td><td>"MonitorCollection"</td><td>画面收藏配置  AV_CFG_MonitorCollection </td></tr>
	 * <tr><td>CFG_CMD_DISPLAYSOURCE</td><td>"DisplaySource"</td><td>画面分割显示源配置  AV_CFG_ChannelDisplaySource </td></tr>
	 * <tr><td>CFG_CMD_RAID</td><td>"Raid"</td><td>存储卷组配置  AV_CFG_Raid </td></tr>
	 * <tr><td>CFG_CMD_RECORDSOURCE</td><td>"RecordSource"</td><td>录像源配置  AV_CFG_RecordSource </td></tr>
	 * <tr><td>CFG_CMD_VIDEOCOLOR</td><td>"VideoColor"</td><td>视频输入颜色配置  AV_CFG_ChannelVideoColor</td></tr> 
	 * <tr><td>CFG_CMD_VIDEOWIDGET</td><td>"VideoWidget"</td><td>视频编码物件配置  AV_CFG_VideoWidget </td></tr>
	 * <tr><td>CFG_CMD_STORAGEGROUP</td><td>"StorageGroup"</td><td>存储组信息  AV_CFG_StorageGroup </td></tr>
	 * <tr><td>CFG_CMD_LOCALS</td><td>"Locales"</td><td>区域配置  AV_CFG_Locales </td></tr>
	 * <tr><td>CFG_CMD_LANGUAGE</td><td>"Language"</td><td>语言选择  AV_CFG_Language </td></tr>
	 * <tr><td>CFG_CMD_ACCESSFILTER</td><td>"AccessFilter"</td><td>访问地址过滤  AV_CFG_AccessFilter </td></tr>
	 * <tr><td>CFG_CMD_AUTOMAINTAIN</td><td>"AutoMaintain"</td><td>自动维护  AV_CFG_AutoMaintain </td></tr>
	 * <tr><td>CFG_CMD_REMOTEEVENT</td><td>"RemoteEvent"</td><td>远程设备事件处理   AV_CFG_RemoteEvent </td></tr>
	 * <tr><td>CFG_CMD_MONITORWALL</td><td>"MonitorWall"</td><td>电视墙配置  AV_CFG_MonitorWall </td></tr>
	 * <tr><td>CFG_CMD_SPLICESCREEN</td><td>"VideoOutputComposite"</td><td>融合屏配置  AV_CFG_SpliceScreen </td></tr>
	 * <tr><td>CFG_CMD_TEMPERATUREALARM</td><td>"TemperatureAlarm"</td><td>温度报警配置  AV_CFG_TemperatureAlarm </td></tr>
	 * <tr><td>CFG_CMD_FANSPEEDALARM</td><td>"FanSpeedAlarm"</td><td>风扇转速报警配置  AV_CFG_FanSpeedAlarm</td></tr>
	 * <tr><td>CFG_CMD_RECORDBACKUP</td><td>"RecordBackupRestore.BitrateLimit"</td><td>录像回传配置  AV_CFG_RecordBackup </td></tr>
	 * <tr><td>CFG_CMD_RECORDBACKUPDEVICE</td><td>"RecordBackupRestore.BackupDevices"</td><td>录像回传备用设备配置  AV_CFG_RemoteDevice </td></tr>
	 * <tr><td>CFG_CMD_COMM</td><td>"Comm"</td><td>串口配置  CFG_COMMGROUP_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NETWORK</td><td>"Network"</td><td>网络配置  CFG_NETWORK_INFO</td></tr> 
	 * <tr><td>CFG_CMD_NASEX</td><td>"NAS"</td><td>网络存储服务器配置, 多服务器  CFG_NAS_GROUP_INFO_EX </td></tr>
	 * <tr><td>CFG_CMD_ALARMOUT</td><td>"AlarmOut"</td><td>报警输出通道配置  CFG_ALARMOUT_INFO</td></tr>  
	 * <tr><td>CFG_CMD_COMMGLOBAL</td><td>"CommGlobal"</td><td>报警全局配置  CFG_COMMGLOBAL_INFO</td></tr>  
	 * <tr><td>CFG_CMD_MOBILE</td><td>"Mobile"</td><td>移动相关业务配置  CFG_MOBILE_INFO</td></tr>  
	 * <tr><td>CFG_CMD_NTP</td><td>"NTP"</td><td>时间同步服务器  CFG_NTP_INFO</td></tr>  
	 * <tr><td>CFG_CMD_PHONEEVENTNOTIFY</td><td>"PhoneEventNotify"</td><td>电话中心通知配置  CFG_PHONEEVENTNOTIFY_INFO</td></tr>  
	 * <tr><td>CFG_CMD_WIRELESS</td><td>"Wireless"</td><td>无线网络连接设置  CFG_WIRELESS_INFO</td></tr>  
	 * <tr><td>CFG_CMD_PSTN_ALARM_SERVER</td><td>"PSTNAlarmServer"</td><td>电话报警中心配置  CFG_PSTN_ALARM_CENTER_INFO</td></tr>  
	 * <tr><td>CFG_CMD_ACCESS_GENERAL</td><td>"AccessControlGeneral"</td><td>门禁基本配置  CFG_ACCESS_GENERAL_INFO</td></tr>  
	 * <tr><td>CFG_CMD_ACCESS_EVENT</td><td>"AccessControl"</td><td>门禁事件配置  CFG_ACCESS_EVENT_INFO</td></tr>  
	 * <tr><td>CFG_CMD_AUDIO_SPIRIT</td><td>"AudioSpirit"</td><td>语音激励(对应 CFG_AUDIO_SPIRIT)</td></tr> 
	 * <tr><td>CFG_CMD_IOT_INFRARED_DETECT</td><td>"IOT_InfraredDetect"</td><td>物联网红外检测配置(对应CFG_IOT_INFRARED_DETECT_INFO)</td></tr>
	 * <tr><td>CFG_CMD_IOT_RECORD_HANDLE</td><td>"IOT_RecordHandle"</td><td>物联网录像联动配置(对应CFG_IOT_RECORD_HANDLE_INFO)</td></tr>
	 * <tr><td>CFG_CMD_IOT_SNAP_HANDLE</td><td>"IOT_SnapHandle"</td><td>物联网抓图联动配置(对应CFG_IOT_SNAP_HANDLE_INFO)</td></tr>
	 * <tr><td>CFD_CMD_DOORBELLSOUND</td><td>"DoorBellSound"</td><td>门铃配置(对应 CFG_DOOR_BELLSOUND_INFO)</td></tr>
	 * <tr><td>CFG_CMD_AIO_APP_CONFIG</td><td>"AIOAppConfig"</td><td>AIOAppConfig参数设置(对应结构体 CFG_AIO_APP_CONFIG_INFO)</td></tr>
	 * </table>
	 * {@link INetSDK#QueryNewSystemInfo}接口命令
	 * <table>
	 * <tr><td>CFG_CAP_CMD_VIDEOANALYSE</td><td>"devVideoAnalyse.getCaps"</td><td>视频分析能力集,结构体 CFG_CAP_ANALYSE_INFO</td></tr> 
	 * <tr><td>CFG_NETAPP_REMOTEDEVICE</td><td>"netApp.getRemoteDeviceStatus"</td><td>获取后端设备的的在线状态,结构体  CFG_REMOTE_DEVICE_STATUS</td></tr> 
	 * <tr><td>CFG_DEVICE_CAP_NEW_CMD_VIDEOANALYSE</td><td>"devVideoAnalyse.factory.getCollect"</td><td>设备智能分析能力,结构体  CFG_CAP_DEVICE_ANALYSE_INFO</td></tr> 
	 * <tr><td>CFG_CAP_CMD_DEVICE_STATE</td><td>"trafficSnap.getDeviceStatus"</td><td>获取外接设备状态信息,结构体  CFG_CAP_TRAFFIC_DEVICE_STATUS</td></tr> 
	 * <tr><td>CFG_CAP_CMD_VIDEOINPUT</td><td>"devVideoInput.getCaps"</td><td>视频输入能力集,结构体  CFG_CAP_VIDEOINPUT_INFO </td></tr>
	 * <tr><td>CFG_USERMANAGER_ACTIVEUSER</td><td>"userManager.getActiveUserInfoAll"</td><td>得到所有活动的用户信息,结构体  CFG_ACTIVEUSER_INFO</td></tr> 
	 * <tr><td>CFG_CAP_VIDEOSTAT_SUMMARY</td><td>"videoStatServer.getSummary"</td><td>获取视频统计摘要信息,结构体  CFG_VIDEOSATA_SUMMARY_INFO </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_GETCOLLECT</td><td>"videoDiagnosisServer.factory.getCollect"</td><td>获取视频诊断通道数目,结构体  CFG_VIDEODIAGNOSIS_GETCOLLECT_INFO </td></tr>
	 * <tr><td>CFG_CMD_VIDEODIAGNOSIS_GETSTATE</td><td>"videoDiagnosisServer.getState"</td><td>获取视频诊断进行状态,结构体  CFG_VIDEODIAGNOSIS_STATE_INFO </td></tr>
	 * <tr><td>CFG_CAP_CMD_VIDEODIAGNOSIS_SERVER</td><td>"videoDiagnosisServer.getCaps"</td><td>获取视频诊断服务能力,结构体  CFG_VIDEODIAGNOSIS_CAPS_INFO </td></tr>
	 * <tr><td>CFG_CAP_CMD_EVENTMANAGER</td><td>"eventManager.getCaps"</td><td>获取设备报警联动能力,老协议已废除,新开发请使用该字段  CFG_CAP_EVENTMANAGER_INFO </td></tr>
	 * <tr><td>CFG_CAP_CMD_EXALARMBOX</td><td>"alarm.getExAlarmBoxCaps"</td><td>获取扩展报警盒能力集  CFG_CAP_EXALARMBOX_INFO </td></tr>
	 * <tr><td>CFG_CAP_CMD_EXALARM</td><td>"alarm.getExAlarmCaps"</td><td>获取扩展报警能力集  CFG_CAP_EXALARM_INFO </td></tr>
	 * <tr><td>CFG_CAP_CMD_ACCESSCONTROLMANAGER</td><td>"accessControlManager.getCaps"</td><td>门禁能力  CFG_CAP_ACCESSCONTROL </td></tr>
	 * <tr><td>CFG_CAP_CMD_FILEMANAGER</td><td>"FileManager.getCaps"</td><td>获取文件能力  CFG_CAP_FILEMANAGER </td></tr>
	 * <tr><td>CFG_CAP_CMD_RECORDFINDER</td><td>"RecordFinder.getCaps"</td><td>获取查询记录能力集  CFG_CAP_RECORDFINDER_INFO </td></tr>
	 * </table>
	 * @param szInBuffer 输入缓冲,字符配置缓冲 
	 * @param stParseData 解析后的结构体 
	 * @param pReserved 保留参数 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native  boolean  	ParseData(String szCommand, char[] szInBuffer, Object stParseData, Object pReserved);
	
	/**					
	 * \if ENGLISH_LANG
	 * package config info into character string
	 * @param szCommand command parameter,refer to ParseData
	 * @param stPacketData command parameter,refer to ParseData
	 * @param szOutBuffer output buffering 
	 * @param dwOutBufferSize output buffering size 
	 * @return true:success, false:failed
	 * \else
	 * 组成要设置的配置信息
	 * @param szCommand 命令参数,详见 ParseData
	 * @param stPacketData 带解析结构体
	 * @param szOutBuffer 输出缓冲 
	 * @param dwOutBufferSize 输出缓冲大小 
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#SetNewDevConfig}
	 * */
	public static native  boolean  	PacketData(String szCommand, Object stPacketData, char szOutBuffer[], int dwOutBufferSize);
	
	/**
	 * \if ENGLISH_LANG
	 * Search device status
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nType search info type
	 * <table>
	 * <tr><td>nType</td><td>search type</td><td>corresponding structure </td></tr>
	 * <tr><td>SDK_DEVSTATE_COMM_ALARMnormal</td><td>alarm status(include external alarm, dynamic detection, video loss)</td><td>NET_SDK_STATE support lower 16-ch or lower NET_SDK_STATE_EX support 32-ch or lower </td></tr> 
	 * <tr><td>SDK_DEVSTATE_SHELTER_ALARM</td><td>masked alarm status</td><td>16 byte</td></tr> 
	 * <tr><td>SDK_DEVSTATE_RECORDINGrecord</td><td>statu</td><td>16 byte </td></tr>
	 * <tr><td>SDK_DEVSTATE_RESOURCEsearch</td><td>systen resouce status</td><td>3 DWORD </td></tr>
	 * <tr><td>SDK_DEVSTATE_BITRATEsearch</td><td>cahnnel stream</td><td>channel x DWORD </td></tr>
	 * <tr><td>SDK_DEVSTATE_DISK</td><td>hard disk status</td><td>SDK_HARDDISK_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_PROTOCAL_VER</td><td>network protocol versionint </td></tr>
	 * <tr><td>SDK_DEVSTATE_TALK_ECTYPE</td><td>search device supported bidirectional talk format</td><td>SDKDEV_TALKFORMAT_LIST </td></tr>
	 * <tr><td>SDK_DEVSTATE_SD_CARD</td><td>search sd card info</td><td>SDK_SDCARD_STATE same as SDK_HARDDISK_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNING_DEV</td><td>search writer info</td><td>SDK_BURNING_DEVINFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNING_PROGRESS</td><td>search writing progress</td><td>SDK_BURNING_PROGRESS </td></tr>
	 * <tr><td>SDK_DEVSTATE_CAMERA</td><td>search camera property info</td><td>SDKDEV_CAMERA_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_SOFTWARE</td><td>device software info</td><td>SDKDEV_VERSION_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_LANGUAGE</td><td>device language support info</td><td>SDK_DEV_LANGUAGE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_DSP</td><td>search dsp capacity description</td><td>SDKDEV_DSP_ENCODECAP </td></tr>
	 * <tr><td>SDK_DEVSTATE_OEM</td><td>search oem info</td><td>SDKDEV_OEM_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_NET</td><td>search network operation status</td><td>SDKDEV_TOTAL_NET_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_TYPE</td><td>search device type character</td><td>string </td></tr>
	 * <tr><td>SDK_DEVSTATE_SNAP</td><td>search snapshot function peoperty(IPC products)</td><td>SDK_SNAP_ATTR_EN </td></tr>
	 * <tr><td>SDK_DEVSTATE_RECORD_TIME</td><td>search the earliest record time and recent record time</td><td>DEV_DISK_RECORD_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_NET_RSSI</td><td>search wireless network signel strength</td><td>SDKDEV_WIRELESS_RSS_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNING_ATTACH</td><td>search attachment writing option</td><td>BOOL </td></tr>
	 * <tr><td>SDK_DEVSTATE_BACKUP_DEV</td><td>search backup device detailed info</td><td>SDKDEV_BACKUP_LIST </td></tr>
	 * <tr><td>SDK_DEVSTATE_BACKUP_FEEDBACK</td><td>backup progress feedback</td><td>SDKDEV_BACKUP_FEEDBACK </td></tr>
	 * <tr><td>SDK_DEVSTATE_ATM_QUERY_TRADE</td><td>search ATM trade type</td><td>SDK_ATM_QUERY_TRADE </td></tr>
	 * <tr><td>SDK_DEVSTATE_SIP</td><td>searchsip status</td><td>SDKDEV_SIP_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_VICHILE_STATE</td><td>search mobile wifistatus</td><td>SDKDEV_VEHICLE_WIFI_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_EMAIL</td><td>search mail config successful or not</td><td>SDKDEV_FUNC_TEST </td></tr>
	 * <tr><td>SDK_DEVSTATE_SMART_HARD_DISK</td><td>search hard disk smartinfo</td><td>SDKDEV_SMART_HARDDISK </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_SNAPPICTURE</td><td>search snapshot setup susseccful or not</td><td>SDKDEV_FUNC_TEST </td></tr>
	 * <tr><td>SDK_DEVSTATE_STATIC_ALARM</td><td>search static alarm status</td><td>DWORD,each means one alarm channel </td></tr>
	 * <tr><td>SDK_DEVSTATE_SUBMODULE_INFO</td><td>search device sub module info</td><td>SDKDEV_SUBMODULE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_DISKDAMAGE</td><td>search hard disk damage capacity	</td><td>SDKDEV_DISKDAMAGE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_IPC</td><td>search device supported IPC capacity</td><td>SDK_DEV_IPC_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARM_ARM_DISARM</td><td>search alarm arm/disarm status	</td><td>ALARM_ARM_DISARM_STATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ACC_POWEROFF_ALARM</td><td>searchACC outage alarm status</td><td>return one DWORD, 1 outage,0 electric  </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_FTP_SERVER</td><td>test FTP server connection</td><td>SDKDEV_FTP_SERVER_TEST </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GFLOW_EXCEED</td><td>search3G flow exceed threshold status</td><td>SDKDEV_3GFLOW_EXCEED_STATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GFLOW_INFO	</td><td>search3G network flow info</td><td>SDK_DEV_3GFLOW_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIHICLE_INFO_UPLOAD	</td><td>monilr customized info upload</td><td>ALARM_VEHICLE_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_DEVSTATE_SPEED_LIMIT</td><td>search speed limit alarm status	</td><td>ALARM_SPEED_LIMIT </td></tr>
	 * <tr><td>SDK_DEVSTATE_DSP_EX</td><td>searchDSP extension capacity</td><td>description	SDKDEV_DSP_ENCODECAP_EX </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GMODULE_INFO</td><td>search3G module info</td><td>SDK_DEV_3GMODULE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_MULTI_DDNS</td><td>search multi-DDNSstatusinfo</td><td>SDK_DEV_MULTI_DDNS_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_CONFIG_URL</td><td>search device config URLinfo</td><td>SDK_DEV_URL_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_HARDKEY</td><td>searchHardKey</td><td>SDKDEV_HARDKEY_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_ISCSI_PATH</td><td>searchISCSI oath list</td><td>SDKDEV_ISCSI_PATHLIST </td></tr>
	 * <tr><td>SDK_DEVSTATE_DLPREVIEW_SLIPT_CAP</td><td>search device local preview supported splicing mode</td><td>DEVICE_LOCALPREVIEW_SLIPT_CAP </td></tr>
	 * <tr><td>SDK_DEVSTATE_WIFI_ROUTE_CAP</td><td>search wireless router info</td><td>SDKDEV_WIFI_ROUTE_CAP </td></tr>
	 * <tr><td>SDK_DEVSTATE_ONLINE</td><td>search device onlinestatusreturn one</td><td>DWORD, 1 online , 0 offline </td></tr>
	 * <tr><td>SDK_DEVSTATE_PTZ_LOCATION</td><td>search PTZ statusinfo</td><td>SDK_PTZ_LOCATION_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_MONITOR_INFO</td><td>image monitor assist info</td><td>SDKDEV_MONITOR_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_SUBDEVICE</td><td>search sub device</td><td>CFG_DEVICESTATUS_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_RAID_INFO</td><td>searchRAIDstatus</td><td>ALARM_RAID_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_DDNSDOMAIN</td><td>test DDNS domain name valid or not  </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIRTUALCAMERA</td><td>search vitual camera status</td><td>SDKDEV_VIRTUALCAMERA_STATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_TRAFFICWORKSTATE</td><td>receive device working video/coil mode status etc.	</td><td>SDKDEV_TRAFFICWORKSTATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARM_CAMERA_MOVE</td><td>receive camera lost alarm event status</td><td>ALARM_CAMERA_MOVE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARM</td><td>receive external alarm status</td><td>NET_SDK_ALARM_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIDEOLOST</td><td>receive video loss alarm status</td><td>NET_SDK_VIDEOLOST_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_MOTIONDETECT</td><td>receive dynamic detection alarm status	</td><td>NET_SDK_MOTIONDETECT_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_DETAILEDMOTION</td><td>receive detailed dynamic detection alarm status</td><td>NET_SDK_DETAILEDMOTION_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_VEHICLE_INFO</td><td>get mobile hardware</td><td>SDKDEV_VEHICLE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIDEOBLIND</td><td>get video mask</td><td>NET_SDK_VIDEOBLIND_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GSTATE_INFO</td><td>search 3G	</td><td>SDKDEV_VEHICLE_3GMODULE </td></tr>
	 * <tr><td>SDK_DEVSTATE_NETINTERFACE</td><td>search port</td><td>SDKDEV_NETINTERFACE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_PICINPIC_CHN</td><td>search PIP</td><td>DWORD group  </td></tr>
	 * <tr><td>SDK_DEVSTATE_COMPOSITE_CHN </td><td>search cubeless video wall channel</td><td>SDK_COMPOSITE_CHANNEL group </td></tr>
	 * <tr><td>SDK_DEVSTATE_WHOLE_RECORDING	</td><td>search video status</td><td>BOOL </td></tr>
	 * <tr><td>SDK_DEVSTATE_WHOLE_ENCODING</td><td>search encode status</td><td>BOOL </td></tr>
	 * <tr><td>SDK_DEVSTATE_DISK_RECORDE_TIME</td><td>search HDD time</td><td>DEV_DISK_RECORD_TIME group </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNER_DOOR	</td><td>eject CD</td><td>NET_DEVSTATE_BURNERDOOR </td></tr>
	 * <tr><td>SDK_DEVSTATE_GET_DATA_CHECK	</td><td>search parity</td><td>NET_DEVSTATE_DATA_CHECK </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE</td><td>search alarm channel state</td><td>NET_SDK_ALARM_CHANNELS_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_GET_BYPASS</td><td>search channel bypass state</td><td>NET_DEVSTATE_GET_BYPASS </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARMKEYBOARD_COUNT	</td><td>search alarm keyboard count</td><td>NET_ALARMKEYBOARD_COUNT </td></tr>
	 * <tr><td>SDK_DEVSTATE_ACTIVATEDDEFENCEAREA</td><td>search activated defenced area info</td><td>NET_ACTIVATEDDEFENCEAREA </td></tr>
	 * <tr><td>SDK_DEVSTATE_DEV_RECORDSET</td><td>search device record info</td><td>NET_CTRL_RECORDSET_PARAM </td></tr>
	 * <tr><td>SDK_DEVSTATE_DOOR_STATE</td><td>search access door state</td><td>NET_DOOR_STATUS_INFO </td></tr>
	 * </table> 
	 * @param pDevState output parameter,for returned data cache. based on different types, returned data structure vary
	 * @param waittime search status waiting time 
	 * @return true:success, false:failed
	 * \else
	 * 查询设备状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nType 查询信息类型
	 * <table>
	 * <tr><td>nType</td><td>查询类型</td><td>对应的结构体</td></tr>
	 * <tr><td>SDK_DEVSTATE_COMM_ALARM</td><td>普通报警状态(包括外部报警,动态检测,视频丢失)</td><td>NET_SDK_STATE 支持16路以下  NET_SDK_STATE_EX 支持32以下</td></tr>
	 * <tr><td>SDK_DEVSTATE_SHELTER_ALARM</td><td>遮挡报警状态</td><td>6字节 </td></tr>
	 * <tr><td>SDK_DEVSTATE_RECORDING</td><td>查询录像状态 </td><td>16字节 
	 * <tr><td>SDK_DEVSTATE_RESOURCE</td><td>查询系统资源状态</td><td>3个DWORD,第一个dword 0 表示小于CPU超过50% 1 表示大于50%,第二个表示TV,第三个表示VGA </td></tr>
	 * <tr><td>SDK_DEVSTATE_BITRATE</td><td>查询通道码流 </td><td> 通道数乘以DWORD </td></tr>
	 * <tr><td>SDK_DEVSTATE_DISK</td><td>硬盘状态</td><td> SDK_HARDDISK_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_PROTOCAL_VER</td><td>网络协议版本号 </td><td>int </td></tr>
	 * <tr><td>SDK_DEVSTATE_TALK_ECTYPE	</td><td>查询设备支持的语音对讲格式 </td><td>  SDKDEV_TALKFORMAT_LIST </td></tr>
	 * <tr><td>SDK_DEVSTATE_SD_CARD</td><td>查询sd卡信息</td><td> SDK_SDCARD_STATE 同 SDK_HARDDISK_STATE 结构体一样 </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNING_DEV	</td><td>查询刻录机信息</td><td>SDK_BURNING_DEVINFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNING_PROGRESS</td><td>查询刻录进度</td><td>SDK_BURNING_PROGRESS </td></tr>
	 * <tr><td>SDK_DEVSTATE_CAMERA</td><td>查询摄像头属性信息</td><td>SDKDEV_CAMERA_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_SOFTWARE</td><td>设备软件信息 </td><td> SDKDEV_VERSION_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_LANGUAGE</td><td>设备语言支持信息</td><td> SDK_DEV_LANGUAGE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_DSP</td><td>查询dsp能力描述 </td><td> SDKDEV_DSP_ENCODECAP </td></tr>
	 * <tr><td>SDK_DEVSTATE_OEM</td><td>查询oem信息</td><td>SDKDEV_OEM_INFO</td></tr>
	 * <tr><td>SDK_DEVSTATE_NET</td><td>查询网络运行状态信息</td><td>SDKDEV_TOTAL_NET_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_TYPE</td><td>查询设备类型</td><td>字符串 </td></tr>
	 * <tr><td>SDK_DEVSTATE_SNAP</td><td>查询抓图功能属性(IPC类产品)</td><td>SDK_SNAP_ATTR_EN </td></tr>
	 * <tr><td>SDK_DEVSTATE_RECORD_TIME</td><td>查询最早录像时间和最近录像时间</td><td>DEV_DISK_RECORD_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_NET_RSSI</td><td>查询无线网络信号强度</td><td>SDKDEV_WIRELESS_RSS_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNING_ATTACH</td><td>查询附件刻录选项  </td><td>BOOL </td></tr>
	 * <tr><td>SDK_DEVSTATE_BACKUP_DEV</td><td>查询备份设备列表 </td><td> SDKDEV_BACKUP_LIST </td></tr>
	 * <tr><td>SDK_DEVSTATE_BACKUP_DEV_INFO</td><td>查询备份设备详细信息 </td><td> SDKDEV_BACKUP_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_BACKUP_FEEDBACK</td><td>备份进度反馈</td><td>SDKDEV_BACKUP_FEEDBACK </td></tr>
	 * <tr><td>SDK_DEVSTATE_ATM_QUERY_TRADE</td><td>查询ATM交易类型 </td><td>SDK_ATM_QUERY_TRADE </td></tr>
	 * <tr><td>SDK_DEVSTATE_SIP</td><td>查询sip状态</td><td>SDKDEV_SIP_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_VICHILE_STATE</td><td>查询车载wifi状态 </td><td>SDKDEV_VEHICLE_WIFI_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_EMAIL</td><td>查询邮件配置是否成功 </td><td>SDKDEV_FUNC_TEST </td></tr>
	 * <tr><td>SDK_DEVSTATE_SMART_HARD_DISK	</td><td>查询硬盘smart信息</td><td>SDKDEV_SMART_HARDDISK </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_SNAPPICTURE</td><td>查询抓图设置是否成功</td><td>SDKDEV_FUNC_TEST </td></tr>
	 * <tr><td>SDK_DEVSTATE_STATIC_ALARM</td><td>查询静态报警状态 </td><td>DWORD,每一位表示一个报警通道 </td></tr>
	 * <tr><td>SDK_DEVSTATE_SUBMODULE_INFO</td><td>查询设备子模块信息 </td><td>SDKDEV_SUBMODULE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_DISKDAMAGE</td><td>查询硬盘坏道能力</td><td>SDKDEV_DISKDAMAGE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_IPC</td><td>查询设备支持的IPC能力</td><td>SDK_DEV_IPC_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARM_ARM_DISARM</td><td>查询报警布撤防状态 </td><td>ALARM_ARM_DISARM_STATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ACC_POWEROFF_ALARM</td><td>查询ACC断电报警状态 </td><td>返回一个DWORD, 1表示断电,0表示通电 </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_FTP_SERVER	</td><td>测试FTP服务器连接</td><td>SDKDEV_FTP_SERVER_TEST </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GFLOW_EXCEED</td><td>查询3G流量超出阈值状态</td><td>SDKDEV_3GFLOW_EXCEED_STATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GFLOW_INFO	</td><td>查询3G网络流量信息</td><td>SDK_DEV_3GFLOW_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIHICLE_INFO_UPLOAD</td><td>车载自定义信息上传</td><td>ALARM_VEHICLE_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_DEVSTATE_SPEED_LIMIT</td><td>查询限速报警状态</td><td> ALARM_SPEED_LIMIT </td></tr>
	 * <tr><td>SDK_DEVSTATE_DSP_EX</td><td>查询DSP扩展能力描述</td><td>SDKDEV_DSP_ENCODECAP_EX </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GMODULE_INFO</td><td>查询3G模块信息</td><td>SDK_DEV_3GMODULE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_MULTI_DDNS</td><td>查询多DDNS状态信息</td><td>SDK_DEV_MULTI_DDNS_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_CONFIG_URL</td><td>查询设备配置URL信息</td><td>SDK_DEV_URL_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_HARDKEY</td><td>查询HardKey</td><td>SDKDEV_HARDKEY_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_ISCSI_PATH</td><td>查询ISCSI路径列表 </td><td>SDKDEV_ISCSI_PATHLIST </td></tr>
	 * <tr><td>SDK_DEVSTATE_DLPREVIEW_SLIPT_CAP</td><td>查询设备本地预览支持的分割模式	</td><td>DEVICE_LOCALPREVIEW_SLIPT_CAP </td></tr>
	 * <tr><td>SDK_DEVSTATE_WIFI_ROUTE_CAP</td><td>查询无线路由能力信息 </td><td>SDKDEV_WIFI_ROUTE_CAP </td></tr>
	 * <tr><td>SDK_DEVSTATE_ONLINE</td><td>查询设备的在线状态</td><td> 返回一个DWORD, 1表示在线, 0表示断线 </td></tr>
	 * <tr><td>SDK_DEVSTATE_PTZ_LOCATION</td><td>查询云台状态信息 </td><td>SDK_PTZ_LOCATION_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_MONITOR_INFO</td><td>画面预览辅助信息</td><td>SDKDEV_MONITOR_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_SUBDEVICE</td><td>查询子设备</td><td>CFG_DEVICESTATUS_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_RAID_INFO</td><td>查询RAID状态</td><td>ALARM_RAID_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_TEST_DDNSDOMAIN</td><td>测试DDNS域名是否可用  </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIRTUALCAMERA</td><td>查询虚拟摄像头状态 </td><td>SDKDEV_VIRTUALCAMERA_STATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_TRAFFICWORKSTATE</td><td>获取设备工作视频/线圈模式状态等</td><td>SDKDEV_TRAFFICWORKSTATE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARM_CAMERA_MOVE</td><td>获取摄像机移位报警事件状态 </td><td>ALARM_CAMERA_MOVE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARM</td><td>获取外部报警状态</td><td>NET_SDK_ALARM_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIDEOLOST</td><td>获取视频丢失报警状态 N</td><td>ET_SDK_VIDEOLOST_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_MOTIONDETECT</td><td>获取动态监测报警状态</td><td> NET_SDK_MOTIONDETECT_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_DETAILEDMOTION</td><td>获取详细的动态监测报警状态	</td><td>NET_SDK_DETAILEDMOTION_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_VEHICLE_INFO</td><td>获取车载自身各种硬件信息 </td><td>SDKDEV_VEHICLE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_VIDEOBLIND</td><td>获取视频遮挡报警状态</td><td>NET_SDK_VIDEOBLIND_STATE </td></tr>
	 * <tr><td>SDK_DEVSTATE_3GSTATE_INFO</td><td>查询3G模块相关信息</td><td>SDKDEV_VEHICLE_3GMODULE </td></tr>
	 * <tr><td>SDK_DEVSTATE_NETINTERFACE</td><td>查询网络接口信息</td><td> SDKDEV_NETINTERFACE_INFO </td></tr>
	 * <tr><td>SDK_DEVSTATE_PICINPIC_CHN</td><td>查询画中画通道号 </td><td>DWORD数组  </td></tr>
	 * <tr><td>SDK_DEVSTATE_COMPOSITE_CHN</td><td>查询融合屏通道信息</td><td>SDK_COMPOSITE_CHANNEL数组 </td></tr>
	 * <tr><td>SDK_DEVSTATE_WHOLE_RECORDING	</td><td>查询设备整体录像状态 </td><td>BOOL </td></tr>
	 * <tr><td>SDK_DEVSTATE_WHOLE_ENCODING</td><td>查询设备整体编码状态 </td><td>BOOL </td></tr>
	 * <tr><td>SDK_DEVSTATE_DISK_RECORDE_TIME</td><td>查询设备硬盘录像时间信息	</td><td>DEV_DISK_RECORD_TIME数组 </td></tr>
	 * <tr><td>SDK_DEVSTATE_BURNER_DOOR</td><td>是否已弹出刻录机光驱</td><td>NET_DEVSTATE_BURNERDOOR</td></tr>
	 * <tr><td>SDK_DEVSTATE_GET_DATA_CHECK</td><td>查询光盘数据校验进度 </td><td>NET_DEVSTATE_DATA_CHECK </td></tr>
	 * <tr><td>SDK_DEVSTATE_ALL_ALARM_CHANNELS_STATE</td><td>查询报警通道状态</td><td>NET_SDK_ALARM_CHANNELS_STATE</td></tr>
	 * <tr><td>SDK_DEVSTATE_GET_BYPASS</td><td>查询通道旁路状态 </td><td>NET_DEVSTATE_GET_BYPASS</td></tr>
	 * <tr><td>SDK_DEVSTATE_ALARMKEYBOARD_COUNT</td><td>查询串口上连接的报警键盘数</td><td>NET_ALARMKEYBOARD_COUNT</td></tr>
	 * <tr><td>SDK_DEVSTATE_ACTIVATEDDEFENCEAREA</td><td>获取激活的防区信息 </td><td>NET_ACTIVATEDDEFENCEAREA</td></tr>
	 * <tr><td>SDK_DEVSTATE_DEV_RECORDSET</td><td>查询设备记录集信息 </td><td>NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_DEVSTATE_DOOR_STATE</td><td>查询门禁状态 </td><td>NET_DOOR_STATUS_INFO</td></tr>
	 * <tr><td>SDK_DEVSTATE_GET_UPGRADE_STATE</td><td>获取设备升级状态 </td><td>SDKDEV_UPGRADE_STATE_INFO</td></tr>
	 * </table> 
	 * @param pDevState 用于接收查询返回的数据的缓存
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native  boolean  	QueryDevState(long lLoginID, int nType, Object pDevState, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * Search device status-extend
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nType search info type，refer to QueryDevState
	 * @param pDevObject output parameter,for returned data cache. based on different types, returned data structure vary
	 * @param waittime search status waiting time 
	 * @param validCount return num.
	 * @return failed return to 0,successful return to real time monitoring ID(real time mnitoring handle),as parameter of related function
	 * \else 
	 * 查询设备状态-扩展
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nType 查询信息类型, 参考 QueryDevState
	 * @param pDevObject 用于接收查询返回的数据的缓存
	 * @param waittime 等待时间 
	 * @param validCount 查询返回的数量
	 * @return 失败返回0,成功返回实时预览ID(实时预览句柄),将作为相关函数的参数 
	 * \endif
	 */	
	public static native boolean 	QueryDevStateEx(long lLoginID, int nType, Object pDevObject, int waittime, Integer validCount);
	
	/**
	 * \if ENGLISH_LANG
	 * start real time monitoring
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelID real time monitor channel NO.(from 0)
	 * @return failed return to 0,successful return to real time monitoring ID(real time mnitoring handle),as parameter of related function
	 * \else 
	 * 开始实时预览
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelID 实时预览通道号(通道号从0开始) 
	 * @return 失败返回0,成功返回实时预览ID(实时预览句柄),将作为相关函数的参数 
	 * \endif
	 * @see {@link INetSDK#StopRealPlay}
	 */	
	public static native long          RealPlay(long lLoginID, int nChannelID);
	
	/**
	 * \if ENGLISH_LANG
	 * start real time monitoring or multi-image preview.for device support dual-stream, may select main tream or extra stream to monitor via setting RealPlayType parameter
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelID real time motoring channel NO.\n
	 * if rType is RType_Multiplay this parameter reserved. when rType is RType_Multiplay_1~RType_Multiplay_16,nChannelID determines preview image,if when RType_Multiplay_4,channel is 4 or 5 or 6 or 7 means preview 5th to 7th channel as four image preview 
	 * @param rType enumeration type,refer to SDK_RealPlayType
	 * @return failed return to 0,successful return to real time monitor ID(real time monitor handle),as parameter of related function. 
	 * \else
	 * 始实时预览--扩展
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelID 实时预览通道号,\n
	 * 如果rType为RType_Multiplay该参数保留\n
	 * 当rType为RType_Multiplay_1~RType_Multiplay_16时,nChannelID决定了预览的画面,\n
	 * 如当RType_Multiplay_4时,nChannelID为4、5、6、7其中一个值表示预览第5到第7通道的四画面预览 
	 * @param rType 枚举类型 详见  SDK_RealPlayType
	 * @return 失败返回0,成功返回实时预览ID(实时预览句柄),将作为相关函数的参数 
	 * \endif
	 * @see {@link INetSDK#StopRealPlayEx}
	 */
	public static native long          RealPlayEx(long lLoginID, int nChannelID, int rType);
	
	/**
	 * \if ENGLISH_LANG
	 * set real time monitor data recall,provide user with device data,when cbRealData is NULL, end recalling data
	 * @param lRealHandle return from {@link INetSDK#RealPlay}
	 * @param cbRealData recall function,for sending real time data from device
	 * @return true:success, false:failed
	 * \else
	 * 设置实时预览数据回调,给用户提供设备流出的数据,当cbRealData为NULL时结束回调数据
	 * @param lRealHandle {@link INetSDK#RealPlay}的返回值
	 * @param cbRealData 回调函数,用于传出设备流出的实时数据 
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#RealPlay}  {@link INetSDK#RealPlayEx}
	 */
	public static native boolean       SetRealDataCallBack(long lRealHandle, CB_fRealDataCallBack cbRealData);
	
	/**
	 * \if ENGLISH_LANG
	 * set real time data recall extension interface,as complementary to previous interface,add one recall data type label dwFlag,may select data to recall, do not recal unrecalled data,when seting is 0x1f, same with previoud interface,but also extend recall function
	 * @param lRealHandle return from {@link INetSDK#RealPlay}
	 * @param cbRealData recall function, for sending various real time data
	 * @param dwFlag by bit,may group.when it is 0x1f, recall the fine types,as:
	 * <table>
	 * <tr><td>dwFlag</td><td>data type </td></tr> 
	 * <tr><td>0x00000001</td><td>is equivalent with original data</td></tr> 
	 * <tr><td>0x00000002</td><td>is MPEG4/H264 standard data </td></tr>
	 * <tr><td>0x00000004</td><td>YUV data </td></tr>
	 * <tr><td>0x00000008</td><td>PCM data  </td></tr>
	 * <tr><td>0x00000010</td><td>original audio data  </td></tr>
	 * <tr><td>0x0000001f</td><td>above fime data type</td></tr>
	 * </table>
	 * \else
	 * 设置实时预览数据回调--扩展
	 * @param lRealHandle {@link INetSDK#RealPlay}的返回值
	 * @param cbRealData 回调函数,用于传出设备流出的实时数据 
	 * @param dwFlag 数据类型,是按位来的,可以组合,为0x1f时五种数据类型都回调
	 * <table>
	 * <tr><td>dwFlag</td><td>数据类型 </td></tr>
	 * <tr><td>0x00000001</td><td>等同原来的原始数据 </td></tr>
	 * <tr><td>0x00000002</td><td>是MPEG4/H264标准数据 </td></tr>
	 * <tr><td>0x00000004</td><td>YUV数据 </td></tr>
	 * <tr><td>0x00000008</td><td>PCM数据 </td></tr>
	 * <tr><td>0x00000010</td><td>原始音频数据 </td></tr>
	 * <tr><td>0x0000001f</td><td>以上五种数据类型 </td></tr>
	 * </table>
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#SetRealDataCallBack}  {@link INetSDK#RealPlay}  {@link INetSDK#RealPlayEx}
	 */
	public static native boolean       SetRealDataCallBackEx(long lRealHandle, CB_fRealDataCallBackEx cbRealData, int dwFlag);
	
	/**
	 * \if ENGLISH_LANG
	 * set device info recall function, to receive current device status info,not related with call sequence,SDK default not recall,this recall function must be subscribed by alarm info interface SDK_StartListen or CLENT_StartListenEx to be valid
	 * @param user info recall function,may recall device status,such as alarm status may be received via recall; when set to 0 means recall prohibit 
	 * @return 
	 * \else
	 * 设置消息回调函数
	 * @param user 消息回调函数,可以回调设备的状态,如报警状态可以通过此回调获取; 当设置为0时表示禁止回调 
	 * @return 无
	 * \endif
	 * @see  {@link INetSDK#StartListen}
	 */
	public static native void          SetDVRMessCallBack(CB_fMessageCallBack user);
	
	/**
	 * \if ENGLISH_LANG
	 * function meaning:network playback, indeed, user login one device, each channel may play one video at the same time, may not play multiple records of the channel.
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param recordFile record file info,only start time and end time required if play by time, fill in others with 0
	 * @param posUser progress recall function 
	 * @return successful return to network playback ID,ailed return to 0.
	 * \else
	 * 按文件方式回放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param recordFile 录像文件信息,当按时间播放时只需填充起始时间和结束时间,其他项填0 
	 * @param posUser 进度回调函数
	 * @return 成功返回网络回放ID,失败返回0
	 * \endif
	 */
	public static native long          PlayBackByRecordFile(long lLoginID, NET_RECORDFILE_INFO recordFile, CB_fDownLoadPosCallBack posUser);
	
	/**
	 * \if ENGLISH_LANG
	 * interface with file play extension and data recall, each channel may play one record at the same time, maynot play multiple records of the channel meantime.
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param recordFile record file info
	 * @param posUser progress recall parameter
	 * @param dataUser data recall function 
	 * @return successful return to network playback ID,failed return to 0. 
	 * \else
	 * 按文件方式回放-扩展
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param recordFile 录像文件信息 
	 * @param posUser 进度回调函数
	 * @param dataUser 数据回调函数 
	 * @return 成功返回网络回放ID,失败返回0 
	 * \endif
	 * @see Login PausePlayBack SeekPlayBac StopPlayBack GetPlayBackOsdTime StepPlayBack GetFramePlayBack SetFramePlayBack SlowPlayBack FastPlayBack 
	 */
	public static native long          PlayBackByRecordFileEx(long lLoginID, NET_RECORDFILE_INFO recordFile, CB_fDownLoadPosCallBack posUser, CB_fDataCallBack dataUser);
	
	/**
	 * \if ENGLISH_LANG
	 * network playback by time,each channel may play one record at the same time, maynot play multiple records of the channel meantime.
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelID image channel NO., from 0, must be assigned
	 * @param startTime start itme  
	 * @param stopTime ending time 
	 * @param posUser progess recall function, as SDK_PlayBackByRecordFile 
	 * @return successful return to network playback ID,failed return to 0. 
	 * \else
	 * 按时间方式回放 
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelID 图像通道号,从0开始,必须指定 
	 * @param startTime 开始时间 
	 * @param stopTime 结束时间
	 * @param posUser 进度回调函数
	 * @return 成功返回网络回放ID,失败返回0 
	 * \endif
	 * @see Login PausePlayBack SeekPlayBack StopPlayBack GetPlayBackOsdTime StepPlayBack GetFramePlayBack SetFramePlayBack SlowPlayBack FastPlayBack 
	 */
	public static native long          PlayBackByTime(long lLoginID, int nChannelID, NET_TIME startTime, NET_TIME stopTime, CB_fDownLoadPosCallBack posUser);
	
	/**
	 * \if ENGLISH_LANG
	 * extension interface with data recall and playback by time.
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelID image channel number, must be assigned
	 * @param startTime start time 
	 * @param stopTime 结end time 
	 * @param posUser progess recall function, as: SDK_PlayBackByRecordFile 
	 * @param dataUser data recall function, as: SDK_PlayBackByRecordFileEx 
	 * @return successful return to network playback ID,failed return to 0.
	 * \else
	 * 按时间方式回放-扩展
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelID 图像通道号,从0开始,必须指定 
	 * @param startTime 开始时间 
	 * @param stopTime 结束时间
	 * @param posUser 进度回调函数
	 * @param dataUser 数据回调函数
	 * @return 成功返回网络回放ID,失败返回0 
	 * \endif
	 * @see Login PausePlayBack SeekPlayBack StopPlayBack GetPlayBackOsdTime StepPlayBack GetFramePlayBack SetFramePlayBack SlowPlayBack FastPlayBack 
	 */
	public static native long          PlayBackByTimeEx(long lLoginID, int nChannelID, NET_TIME startTime, NET_TIME stopTime, CB_fDownLoadPosCallBack posUser, CB_fDataCallBack dataUser);

	/**
	 * \if ENGLISH_LANG
	 * extension interface with data recall and playback by time，support backward playback directly
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelID image channel number, must be assigned
	 * @param pstNetIn input param
	 * @param pstNetOut output param
	 * @return successful return to network playback ID,failed return to 0.
	 * \else
	 * 按时间方式回放--扩展第二版，支持直接倒放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelID 图像通道号,从0开始,必须指定
	 * @param pstNetIn 入参
	 * @param pstNetOut 出参
	 * @return 成功返回网络回放ID,失败返回0
	 * \endif
	 * @see Login PausePlayBack SeekPlayBack StopPlayBack GetPlayBackOsdTime StepPlayBack GetFramePlayBack SetFramePlayBack SlowPlayBack FastPlayBack
	 */
	public static native long          PlayBackByTimeEx2(long lLoginID, int nChannelID, NET_IN_PLAY_BACK_BY_TIME_INFO pstNetIn, NET_OUT_PLAY_BACK_BY_TIME_INFO pstNetOut);
	/**
	 * \if ENGLISH_LANG
	 * download video file by file, download via searched file info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param recordFile video file info pointer 
	 * @param sSavedFileName video file name to save, full path 
	 * @param posUser download progress recall function.download progress recall function parameter explanation: refer SDK_PlayBackByRecordFile 
	 * @return successful return to download ID,failed return to 0. 
	 * \else
	 * 按文件方式下载
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param recordFile 录像文件信息指针
	 * @param sSavedFileName 要保存的录像文件名,全路径
	 * @param posUser 下载进度回调函数
	 * @return 成功返回下载ID,失败返回0
	 * \endif
	 * @see {@link INetSDK#QueryRecordFile}  {@link INetSDK#StopDownload}  {@link INetSDK#GetDownloadPos}
	 */
	public static native long          DownloadByRecordFile(long lLoginID, NET_RECORDFILE_INFO recordFile, String sSavedFileName, CB_fDownLoadPosCallBack posUser);

	/**
	 * \if ENGLISH_LANG
	 * download video file by file, download via searched file info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param lpRecordFile video file info pointer
	 * @param sSavedFileName video file name to save, full path
	 * @param cbDownLoadPos download progress recall function.download progress recall function parameter explanation: refer SDK_PlayBackByRecordFile
	 * @param fDownLoadDataCallBack   data callback
	 * @param pReserved		Reserved
	 * @return successful return to download ID,failed return to 0.
	 * \else
	 * 按文件方式下载
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param lpRecordFile 录像文件信息指针
	 * @param sSavedFileName 要保存的录像文件名,全路径
	 * @param cbDownLoadPos 下载进度回调函数
	 * @param fDownLoadDataCallBack   下载的数据回调
	 * @param pReserved				保留字段
	 * @return 成功返回下载ID,失败返回0
	 * \endif
	 * @see {@link INetSDK#QueryRecordFile}  {@link INetSDK#StopDownload}  {@link INetSDK#GetDownloadPos}
	 */
	public static native long		  DownloadByRecordFileEx(long lLoginID, NET_RECORDFILE_INFO lpRecordFile, String sSavedFileName, CB_fDownLoadPosCallBack cbDownLoadPos, CB_fDataCallBack fDownLoadDataCallBack, Object pReserved);

	/**
	 * \if ENGLISH_LANG
	 * download by time, directly input designated channel start time and ending time to play downloaded video
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelId image channel number,start from 0
	 * @param nRecordFileType record type
	 * @param startTime start time
	 * @param stopTime ending time
	 * @param sSavedFileName video file name to save, full path
	 * @param userData download progress recall functiondownload progress recall function parameter explanation refer to SDK_PlayBackByRecordFile 
	 * @return successful return to download ID,failed return to 0. 
	 * \else
	 * 按时间下载
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelId 图像通道号,从0开始 
	 * @param nRecordFileType 录像文件类型, {@link INetSDK#QueryRecordFile} 接口中关于 nRecordFileType 的说明
	 * @param startTime 开始时间 
	 * @param stopTime 结束时间
	 * @param sSavedFileName 要保存的录像文件名,全路径
	 * @param userData 下载进度回调函数下载进度回调函数
	 * @return 成功返回下载ID,失败返回0
	 * \endif
	 * @see {@link INetSDK#StopDownload}  {@link INetSDK#GetDownloadPos}
	 */
	public static native long          DownloadByTime(long lLoginID, int nChannelId, int nRecordFileType, NET_TIME startTime, NET_TIME stopTime, String sSavedFileName, CB_fTimeDownLoadPosCallBack userData);
	
	public static native long          DownloadByTimeEx2(long lLoginID, int nChannelId, int nRecordFileType, NET_TIME tmStart, NET_TIME tmEnd, String sSavedFileName, CB_fTimeDownLoadPosCallBack cbTimeDownLoadPos, CB_fDataCallBack fDownLoadDataCallBack, int scType, Object pReserved);
	
	public static native long          DownloadByTimeEx(long lLoginID, int nChannelId, int nRecordFileType, NET_TIME tmStart, NET_TIME tmEnd, String sSavedFileName, CB_fTimeDownLoadPosCallBack cbTimeDownLoadPos, CB_fDataCallBack fDownLoadDataCallBack, Object pReserved);
	
	/**
	 * \if ENGLISH_LANG
	 * log search,support by page search (this interface is rarely supported by device)
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param queryParam  search log parameter 
	 * @param logBuffer return to log buffering area.returned log is one {@link SDK_DEVICE_LOG_ITEM} or {@link SDK_DEVICE_LOG_ITEM_EX} structure.
	 * @param recLogNum received log returned 
	 * @param waittime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 查询设备日志,以分页方式查询
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param queryParam  查询日志的参数返回日志缓冲区,返回的日志是一个 {@link SDK_DEVICE_LOG_ITEM} 或 {@link SDK_DEVICE_LOG_ITEM_EX} 结构体
	 * @param logBuffer pLogBuffer缓冲区的大小
	 * @param recLogNum 返回接收到的日志条数
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       QueryDeviceLog(long lLoginID, QUERY_DEVICE_LOG_PARAM queryParam, Object logBuffer[], Integer recLogNum, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * stop real time monitoring
	 * @param lRealHandle return from {@link INetSDK#RealPlay}
	 * @return true:success, false:failed
	 * \else
	 * 停止实时预览
	 * @param lRealHandle {@link INetSDK#RealPlay}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       StopRealPlay(long lRealHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * stop real time monitring or multi-image preview
	 * @param lRealHandle return from {@link INetSDK#RealPlay}
	 * @return true:success, false:failed
	 * \else
	 * 停止实时预览--扩展
	 * @param lRealHandle {@link INetSDK#RealPlay}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 	    StopRealPlayEx(long lRealHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * open audio, currently only support self-occupied method/ If before calling this function, audio has been turned on and hPlayHandle is different, then turn off original audio and open new audio；function is effective only when hWnd is effective.
	 * @param lRealHandle return from {@link com.company.NetSDK.INetSDK#RealPlay}
	 * @return true:success, false:failed
	 * \else
	 * 打开声音
	 * @param lRealHandle {@link com.company.NetSDK.INetSDK#RealPlay}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		OpenSound(long lRealHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * audio off
	 * @return true:success, false:failed
	 * \else
	 * 关闭声音
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#RealPlay}
	 */
	public static native boolean		CloseSound();
	
	/**
	 * \if ENGLISH_LANG
	 * set volume,Function is effective only when function's parameter hWnd which open hPlayHandle is effective
	 * @param lRealHandle return from {@link INetSDK#RealPlay}
	 * @param nVolume volume,range 0~100,0 min
	 * @return true:success, false:failed
	 * \else
	 * 设置音量
	 * @param lRealHandle {@link INetSDK#RealPlay}的返回值
	 * @param nVolume 音量值,范围0~100,0音量最小
	 * @return true:成功, false:失败
	 * \endif
	 * @see OpenSound CloseSound RealPlay RealPlayEx PlayBackByRecordFile PlayBackByRecordFileEx PlayBackByTime PlayBackByTimeEx 
	 */
	public static native boolean       SetVolume(long lRealHandle , int nVolume);
	
	/**
	 * \if ENGLISH_LANG
	 * stop downloading record file
	 * @param lFileHandle return from {@link INetSDK#DownloadByRecordFile}
	 * @return true:success, false:failed
	 * \else
	 * 停止录像下载
	 * @param lFileHandle {@link INetSDK#DownloadByRecordFile}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#DownloadByRecordFile}  {@link INetSDK#GetDownloadPos}   {@link INetSDK#DownloadByTime}
	 */
	public static native boolean 		StopDownload(long lFileHandle);

	/**
	 * \if ENGLISH_LANG
	 * pause downloading record file
	 * @param lFileHandle return from {@link INetSDK#DownloadByRecordFile}
	 * @param bPause true:pause download, false:continue download
	 * @return true:success, false:failed
	 * \else
	 * 暂停录像下载
	 * @param lFileHandle {@link INetSDK#DownloadByRecordFile}的返回值
	 * @param bPause true:暂停下载, false:开始下载
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#DownloadByRecordFile}  {@link INetSDK#GetDownloadPos}   {@link INetSDK#DownloadByTime}
	 */
	public static native boolean 		PauseDownload(long lFileHandle, boolean bPause);
	
	/**
	 * \if ENGLISH_LANG
	 * stop playback
	 * @param lPlayHandle  playback handle, as {@link INetSDK#PlayBackByRecordFile} return value
	 * @return true:success, false:failed
	 * \else
	 * 停止录像回放
	 * @param lPlayHandle  回放句柄,如 {@link INetSDK#PlayBackByRecordFile} 的返回值
	 * \endif
	 * @see {@link INetSDK#PlayBackByRecordFile} {@link INetSDK#PlayBackByRecordFileEx}  {@link INetSDK#PlayBackByTime}  {@link INetSDK#PlayBackByTimeEx}
	 */
	public static native boolean 		StopPlayBack(long lPlayHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * save image, snapshot displaying image. Parameter received by the function is valid only when function parameter hWnd to open image is valid. Otherwise, invalid.
	 * @param lPlayHandle  See Also return values of all interfaces listed 
	 * @param strPicFileName bitmap name, currently only support BMP
	 * @return true:success, false:failed
	 * \else
	 * 解码抓图
	 * @param lPlayHandle  列出的所有接口的返回值 
	 * @param strPicFileName
	 * @return true:成功, false:失败
	 * \endif
	 * @see RealPlay RealPlayEx PlayBackByRecordFile PlayBackByRecordFileEx PlayBackByTime PlayBackByTimeEx
	 */
	public static native boolean		CapturePicture(long lPlayHandle , String strPicFileName);


	/**
	 * \if ENGLISH_LANG
	 * receive download video current position,may use for non-real-time display interface of downloading progress, similar to download recall function
	 * @param lFileHandle {@link INetSDK#DownloadByRecordFile} return value
	 * @param nTotalSize  download total length,unit:KB
	 * @param nDownLoadSize  downloaded length,unit:KB 
	 * @return true:success, false:failed
	 * \else
	 * 查询录像下载进度
	 * @param lFileHandle {@link INetSDK#DownloadByRecordFile}的返回值
	 * @param nTotalSize  下载的总长度,单位:KB 
	 * @param nDownLoadSize  已下载的长度,单位:KB 
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#DownloadByRecordFile}  {@link INetSDK#StopDownload}  {@link INetSDK#DownloadByTime}
	 */
	public static native boolean		GetDownloadPos(long lFileHandle , Integer nTotalSize , Integer nDownLoadSize);
		
	/**
	 * \if ENGLISH_LANG
	 * start to save real time monitoring data,save data for frong end device's monitored image,forming record file,this data is original video data sent from device terminal
	 * @param lRealHandle  {@link INetSDK#RealPlay} return value
	 * @param strFileName  real time monitor and save file name 
	 * @return true:success, false:failed
	 * \else
	 * 保存数据为文件
	 * @param lRealHandle  {@link INetSDK#RealPlay}的返回值
	 * @param strFileName  实时预览保存文件名 
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#StopSaveRealData}  {@link INetSDK#RealPlay}  {@link INetSDK#RealPlayEx}
	 */
	public static native boolean 		SaveRealData(long lRealHandle, String strFileName);
	
	/**
	 * \if ENGLISH_LANG
	 * stop saving real time monitoring data,close saved file
	 * @param lRealHandle  {@link INetSDK#RealPlay}return value
	 * @return true:success, false:failed
	 * \else
	 * 结束保存数据为文件
	 * @param lRealHandle  {@link INetSDK#RealPlay}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#SaveRealData}  {@link INetSDK#RealPlay}   {@link INetSDK#RealPlayEx}
	 */
	public static native boolean 		StopSaveRealData(long lRealHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * start to update device program
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pchFileName uodate file name 
	 * @param cbUpgrade progress recall fcuntion
	 * @return successful return to update handle ID,failed return to 0
	 * \else
	 * 开始升级设备程序
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pchFileName 升级文件名 
	 * @param cbUpgrade 进度回调函数
	 * @return 成功返回升级句柄ID,失败返回0
	 * \endif
	 * @see {@link INetSDK#SendUpgrade}  {@link INetSDK#StopUpgrade}
	 */
	public static native long 			StartUpgrade(long lLoginID, String pchFileName, CB_fUpgradeCallBack cbUpgrade);
	
	/**
	 * \if ENGLISH_LANG
	 * start to sent update file
	 * @param lUpgradeID  update handle ID，return from {@link INetSDK#StartUpgrade}
	 * @return true:success, false:failed
	 * \else
	 * 发送数据
	 * @param lUpgradeID  升级句柄ID, {@link INetSDK#StartUpgrade} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#StartUpgrade}  {@link INetSDK#StopUpgrade}
	 */
	public static native boolean 		SendUpgrade(long lUpgradeID);
	
	/**
	 * \if ENGLISH_LANG
	 * stop epdating
	 * @param lUpgradeID update handle ID, return from {@link INetSDK#StartUpgrade}
	 * @return true:success, false:failed
	 * \else
	 * 结束升级设备程序
	 * @param lUpgradeID 升级句柄ID, {@link INetSDK#StartUpgrade} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 * @see  {@link INetSDK#StartUpgrade}  {@link INetSDK#SendUpgrade}
	 */
	public static native boolean 		StopUpgrade(long lUpgradeID);
	
	/**
	 * \if ENGLISH_LANG
	 * receive config member name interface
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input parameter 
	 * @param pOutParam output parameter 
	 * @param waittime waiting time 
	 * @return successful return to TRUE,failed return to FALSE,if insufficient input buffering area length return to FALSE.
	 * \else
	 * 获取配置成员名称接口
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数 
	 * @param pOutParam 输出参数 
	 * @param waittime 等待时间 
	 * @return 成功返回TRUE,失败返回FALSE,输入缓冲区长度不够也返回FALSE
	 * \endif
	 */
	public static native boolean 		GetMemberNames(long lLoginID, NET_IN_MEMBERNAME pInParam, NET_OUT_MEMBERNAME pOutParam, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * batch append persons, user malloc and free (pstInParam's and pstOutParam's) memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input parameter
	 * @param pOutParam output parameter
	 * @param waittime waiting time
	 * @return successful return to TRUE,failed return to FALSE,if insufficient input buffering area length return to FALSE.
	 * \else
	 * 添加多个人员信息和目标样本
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param waittime 等待时间
	 * @return 成功返回TRUE,失败返回FALSE,输入缓冲区长度不够也返回FALSE
	 * \endif
	 */
	public static native boolean 		BatchAppendFaceRecognition(long lLoginID, NET_IN_BATCH_APPEND_FACERECONGNITION pInParam, NET_OUT_BATCH_APPEND_FACERECONGNITION pOutParam, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * Get face import token
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input parameter
	 * @param pOutParam output parameter
	 * @param waittime waiting time
	 * @return successful return to TRUE,failed return to FALSE,if insufficient input buffering area length return to FALSE.
	 * \else
	 * 获取目标导入令牌
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param waittime 等待时间
	 * @return 成功返回TRUE,失败返回FALSE,输入缓冲区长度不够也返回FALSE
	 * \endif
	 */
	public static native boolean 		GetFaceRecognitionAppendToken(long lLoginID, NET_IN_GET_FACE_RECOGNITION_APPEND_TOKEN pInParam, NET_OUT_GET_FACE_RECOGNITION_APPEND_TOKEN pOutParam, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * set asynchronous recall function
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param cbMessData asynchronous recall function
	 * @return true:success, false:failed
	 * \else
	 * 设置异步回调函数
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param cbMessData asynchronous recall function
	 * @return true:成功, false:失败
	 * \endif
	 * @see NET_CALLBACK_DATA
	 */
	public static native boolean 		SetOperateCallBack(long lLoginID, CB_fMessDataCallBack cbMessData);
	
	/**
	 * \if ENGLISH_LANG
	 * control decoder TV display splicing
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nMonitorID TV ID
	 * @param bEnable enable 
	 * @param nSplitType  splicing method
	 * @param pEncoderChannel  encoder channel 
	 * @param nBufLen  pEncoderChannel length
	 * @return return value：0 means failed,others are handle.
	 * \else
	 * 控制解码器TV画面分割,接口为异步方式 nSplitType=-1时,pEncoderChannel为 {@link SDK_CTRL_DECTV_SCREEN} 类型,nBufLen无效,否则为byte数组,nBufLen数组长度
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nMonitorID TV的ID 
	 * @param bEnable 使能
	 * @param nSplitType  切割方式
	 * @param pEncoderChannel  编码器通道
	 * @param nBufLen  pEncoderChannel的长度
	 * @return 返回值：0表示失败,其它为句柄
	 * \endif
	 */
	public static native long 			CtrlDecTVScreen(long lLoginID, int nMonitorID, boolean bEnable, int nSplitType, Object pEncoderChannel, int nBufLen);
	
	/**
	 * \if ENGLISH_LANG
	 * control decoder TV display splicing switch
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nDecoderID decoder ID  
	 * @param lpEncoderInfo  connected decoder info
	 * @return 0 means failed,other values not equal to are successful,return one handle
	 * \else
	 * 解码器TV画面切换,接口为异步方式
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nDecoderID 解码器ID  
	 * @param lpEncoderInfo  连接的编码器信息
	 * @return 0表示失败,其它不等于0的值为成功,返回一个句柄
	 * \endif
	 */
	public static native long 			SwitchDecTVEncoder(long lLoginID, int nDecoderID, DEV_ENCODER_INFO lpEncoderInfo);
	
	/**
	 * \if ENGLISH_LANG
	 * search decoder info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param lpDecInfo decoder info 
	 * @param waittime search overtime
	 * @return true:success, false:failed
	 * \else
	 * 查询解码器信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param lpDecInfo 解码器信息
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		QueryDecoderInfo(long lLoginID, DEV_DECODER_INFO lpDecInfo, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search decoder current TV info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nMonitorID TV ID 
	 * @param lpMonitorInfo connected encoder info 
	 * @param waittime search overtime 
	 * @return true:success, false:failed
	 * \else
	 * 查询解码器当前TV信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nMonitorID TV的ID 
	 * @param lpMonitorInfo 连接的编码器信息
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		QueryDecoderTVInfo(long lLoginID, int nMonitorID, DEV_DECODER_TV lpMonitorInfo, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search decode channel info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nDecoderID encoder id
	 * @param lpEncoderInfo encoder info
	 * @param waittime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 查询解码通道信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nDecoderID 编码器id 
	 * @param lpEncoderInfo 编码器信息
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		QueryDecEncoderInfo(long lLoginID, int nDecoderID, DEV_ENCODER_INFO lpEncoderInfo, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * set decoder TV output enable
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pDecTVOutEnable enable group
	 * @param nBufLen pDecTVOutEnable length 
	 * @param waittime set ovetime
	 * @return true:success, false:failed
	 * \else
	 * 设置解码器TV输出使能
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pDecTVOutEnable 使能数组
	 * @param nBufLen pDecTVOutEnable的长度 
	 * @param waittime 设置超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		SetDecTVOutEnable(long lLoginID, byte pDecTVOutEnable[], int nBufLen, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * Add display grouping
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nMonitorID TV ID 
	 * @param nSplitType splicing method, one of 1,4,9,16 
	 * @param pEncoderChannnel encoder channel,add channel to tour
	 * @param nBufLen pEncoderChannnel  length 
	 * @param waittime overtime 
	 * @return back to display grouping,successful return to one of 0~32,failed return to -1.
	 * \else
	 * 增加画面组合
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nMonitorID TV的ID 
	 * @param nSplitType 切割方式,1,4,9,16 中一值
	 * @param pEncoderChannnel 编码器通道,增加到轮询中的通道
	 * @param nBufLen pEncoderChannnel的长度
	 * @param waittime 等待时间
	 * @return 返回组合画面号,成功的时候返回0~32之间的一个组合号,失败返回-1
	 * \endif
	 */
	public static native int     		AddTourCombin(long lLoginID, int nMonitorID, int nSplitType, byte pEncoderChannnel[], int nBufLen, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * delete display group
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nMonitorID TV ID
	 * @param nCombinID group id
	 * @param waittime overtime 
	 * @return true:success, false:failed
	 * \else
	 * 删除画面组合
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nMonitorID TV的ID
	 * @param nCombinID 组合id 
	 * @param waittime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		DelTourCombin(long lLoginID, int nMonitorID, int nCombinID, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * change image group
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nMonitorID TV ID 
	 * @param nCombinID group id
	 * @param nSplitType splicing method 
	 * @param pEncoderChannel encode channel,tou image's all channels 
	 * @param nBufLen  pEncoderChannnel length 
	 * @param waittime overtime
	 * @return true:success, false:failed
	 * \else
	 * 修改画面组合
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nMonitorID TV的ID 
	 * @param nCombinID 组合ID 
	 * @param nSplitType 切割方式
	 * @param pEncoderChannel 编码器通道,轮询画面的所有通道 
	 * @param nBufLen  pEncoderChannnel的长度
	 * @param waittime 等待时间
	 * @return true:成功, false:失败
	 * \endif	
	 */
	public static native boolean 		SetTourCombin(long lLoginID, int nMonitorID, int nCombinID, int nSplitType, byte pEncoderChannel[], int nBufLen, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search window group
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nMonitorID  TV ID
	 * @param nCombinID group ID
	 * @param lpDecCombinInfo  decoder window group info
	 * @param waittime overtime
	 * @return true:success, false:failed
	 * \else
	 * 查询画面组合,nCombinID范围0～32
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nMonitorID  TV的ID
	 * @param nCombinID 组合ID 
	 * @param lpDecCombinInfo  解码器画面组合信息
	 * @param waittime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		QueryTourCombin(long lLoginID, int nMonitorID, int nCombinID, DEC_COMBIN_INFO lpDecCombinInfo, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * set tour operation
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nMonitorID TV ID
	 * @param lpDecTourInfo  decoder tour info
	 * @param waittime overtime
	 * @return true:success, false:failed
	 * \else
	 * 设置轮巡操作
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nMonitorID TV的ID
	 * @param lpDecTourInfo  解码器轮巡信息
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		SetDecoderTour(long lLoginID, int nMonitorID, DEC_TOUR_COMBIN lpDecTourInfo, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * search tour operation
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nMonitorID TV ID
	 * @param lpDecTourInfo  decoder tour info
	 * @param waittime overtime
	 * @return true:success, false:failed
	 * \else
	 * 查询轮巡操作
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nMonitorID TV的ID
	 * @param lpDecTourInfo  解码器轮巡信息
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		QueryDecoderTour(long lLoginID, int nMonitorID, DEC_TOUR_COMBIN lpDecTourInfo, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * search current decode channel info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nDecoderID encoder id 
	 * @param lpChannelStateInfo decoding chaneel stream info
	 * @param waittime overtime
	 * @return true:success, false:failed
	 * \else
	 * 查询当前解码通道流信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nDecoderID 编码器id 
	 * @param lpChannelStateInfo 解码通道流信息
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		QueryDecChannelFlux(long lLoginID, int nDecoderID, DEV_DECCHANNEL_STATE lpChannelStateInfo, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * decoder control tour
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nMonitorID  TV ID
	 * @param nActionParam decoder playback control type
	 * <table>
	 * <tr><td>Dec_Tour_Stop</td><td>stop</td></tr> 
	 * <tr><td>Dec_Tour_Start</td><td>stop</td></tr> 
	 * <tr><td>Dec_Tour_Pause</td><td>pause</td></tr>
	 * <tr><td>Dec_Tour_Resume</td><td>resume</td></tr>
	 * </table>
	 * @param waittime overtime
	 * @return true:success, false:failed
	 * \else
	 * 解码器控制轮巡
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nMonitorID  TV的ID
	 * @param nActionParam 解码器回放控制类型
	 * <table>
	 * <tr><td>Dec_Tour_Stop</td><td>停止 </td></tr>
	 * <tr><td>Dec_Tour_Start</td><td>开始 </td></tr>
	 * <tr><td>Dec_Tour_Pause</td><td>暂停 </td></tr>
	 * <tr><td>Dec_Tour_Resume</td><td>恢复</td></tr>
	 * </table>
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		CtrlDecoderTour(long lLoginID, int nMonitorID, int nActionParam, int waittime );
	
	/**
	 * \if ENGLISH_LANG
	 * set playback progress recall function
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param cbPlaybackPos  playback progress recall function
	 * @return true:success, false:failed
	 * \else
	 * 设置回放进度回调函数
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param cbPlaybackPos  回放进度回调函数
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		SetDecPlaybackPos(long lLoginID, CB_fDecPlayBackPosCallBack cbPlaybackPos );

	/**
	 * \if ENGLISH_LANG
	 * decoder TV playback
	 * nPlaybackMode
	 * 0 = front-end device－by file method   {@link DEC_PLAYBACK_FILE_PARAM}
	 * 1 = front-end device－by time method  {@link DEC_PLAYBACK_TIME_PARAM}
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nDecoderID TV ID
	 * @param nPlaybackMode decoder playback type 
	 * @param objPlayBack playback parameter.by file method is {@link DEC_PLAYBACK_FILE_PARAM} , playback by time is  {@link DEC_PLAYBACK_TIME_PARAM}
	 * @return true:success, false:failed
	 * \else
	 * 解码器TV画面回放,接口为异步方式
	 * nPlaybackMode
	 * 0 = 前端设备－按文件方式   {@link DEC_PLAYBACK_FILE_PARAM}
	 * 1 = 前端设备－按时间方式  {@link DEC_PLAYBACK_TIME_PARAM}
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nDecoderID TV的ID
	 * @param nPlaybackMode 解码器回放类型
	 * @param objPlayBack 回放参数,按文件方式时为 {@link DEC_PLAYBACK_FILE_PARAM} ,按时间回放时为 {@link DEC_PLAYBACK_TIME_PARAM}
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native long 			DecTVPlayback(long lLoginID, int nDecoderID, int nPlaybackMode, Object objPlayBack);

	/**
	 * \if ENGLISH_LANG
	 * decoder TV display playback control
	 * nCtrlType\n
	 * 0 = drag\n
	 * 1 = play\n
	 * 2 = pause\n
	 * 3 = stop
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nDecoderID TV ID
	 * @param nCtrlType decoder playback control type, refer to {@link DEC_CTRL_PLAYBACK_TYPE}
	 * @param nValue control value 
	 * @param waittime overtime  
	 * @return true:success, false:failed
	 * \else
	 * 解码器TV画面回放控制
	 * nCtrlType\n
	 * 0 = 拖动\n
	 * 1 = 播放\n
	 * 2 = 暂停\n
	 * 3 = 停止
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nDecoderID TV的ID
	 * @param nCtrlType 解码器回放控制类型,详见 {@link DEC_CTRL_PLAYBACK_TYPE}
	 * @param nValue 控制值
	 * @param waittime 等待时间  
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		CtrlDecPlayback(long lLoginID, int nDecoderID, int nCtrlType, int nValue, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * Stop login
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @return true:success, false:failed
	 * \else
	 * 停止向设备注册
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		StopLogin(long lLoginID);
	
	/**
	 * \if ENGLISH_LANG
	 * multi-window preview,currently Private HB device do not support this function
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param hWnd multi-window preview,may set as 0. for non-displaying
	 * @return successful return to multi-window preview ID,failed return to 0.
	 * \else
	 * 多画面实时预览
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param hWnd 多画面预览窗口,可以设置为0,为不显示
	 * @return 成功返回多画面预览ID,失败返回0
	 * \endif
	 * @see {@link INetSDK#StopMultiPlay}
	 */
	public static native long 			MultiPlay(long lLoginID, Object hWnd);
	
	/**
	 * \if ENGLISH_LANG
	 * stop multi-image preview
	 * @param lMultiHandle  return from {@link INetSDK#MultiPlay}
	 * @return true:success, false:failed
	 * \else
	 * 停止多画面实时预览
	 * @param lMultiHandle  {@link INetSDK#MultiPlay}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 * @see MultiPlay 
	 */
	public static native boolean 		StopMultiPlay(long lMultiHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * search recorded or not on a certain day 
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelId  channel NO.
	 * @param nRecordFileType record file type 
	 * <table>
	 * <tr><td>value</td><td>record file type</td></tr>
	 * <tr><td>0</td><td>all record files </td></tr>
	 * <tr><td>1</td><td>external alarm </td></tr>
	 * <tr><td>2</td><td>dynamic detection alarm	</td></tr>
	 * <tr><td>3</td><td>all alarms </td></tr>
	 * <tr><td>4</td><td>card No. search   </td></tr>
	 * <tr><td>5 </td><td>group condition search </td></tr>
	 * </table>
	 * @param tmStart start time
	 * @param tmEnd end time
	 * @param pchCardid card No.(search type is card NO. search, valid, otherwise fill in NULL) 
	 * @param bResult output parameter,true is yes,false is no
	 * @param waittime search overtime
	 * @return true:success, false:failed
	 * \else
	 * 查询时间段内是否有录像文件
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelId  通道号
	 * @param nRecordFileType 录像文件类型
	 * <table>
	 * <tr><td>数值 </td><td>录象文件类型</td></tr>  
	 * <tr><td>0</td><td>所有录像文件</td></tr>  
	 * <tr><td>1</td><td>外部报警 </td></tr>
	 * <tr><td>2</td><td>动态检测报警 </td></tr>
	 * <tr><td>3</td><td>所有报警 </td></tr>
	 * <tr><td>4</td><td> 卡号查询  </td></tr>
	 * <tr><td>5</td><td>组合条件查询 </td></tr>
	 * </table>
	 * @param tmStart 起始时间
	 * @param tmEnd 结束时间
	 * @param pchCardid 卡号(查询类型为卡号查询时有效,其他情况填NULL) 
	 * @param bResult 输出参数,true表示有录像,false表示没有录像 
	 * @param waittime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		QueryRecordTime(long lLoginID, int nChannelId, int nRecordFileType, NET_TIME tmStart, NET_TIME tmEnd, String pchCardid, BOOL_RET bResult, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * control play direction--forward play or back play
	 * @param lPlayHandle playback handle,as {@link INetSDK#PlayBackByRecordFile} return value
	 * @param bBackward back play or not,when bBackward = TRUE back play,when bBackward = FALSE forward play 
	 * @return true:success, false:failed
	 * \else
	 * 控制播放方向--正放或者倒放
	 * @param lPlayHandle 回放句柄,如 {@link INetSDK#PlayBackByRecordFile} 的返回值
	 * @param bBackward 是否倒放,在 bBackward = TRUE 时倒放,在 bBackward = FALSE 时正放 
	 * @return true:成功, false:失败
	 * \endif
	 * @see PlayBackByRecordFile PlayBackByRecordFileEx PlayBackByTime PlayBackByTimeEx  
	 */
	public static native boolean 		PlayBackControlDirection(long lPlayHandle, boolean bBackward);
	
	/**
	 * \if ENGLISH_LANG
	 * real time upload intellifent analysis data-image, extension interface
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelID channel NO.
	 * @param dwAlarmType alarm type, {@link CB_fAnalyzerDataCallBack}
	 * @param bNeedPicFile subscribe image file or not,1-yes,return intelligent image info during recall function,0-no,not return intelligent image info during recall function(when image not needed, reduce network flow)
	 * @param cbAnalyzerData intelligent data analysis recall function,as RealLoadPicture 
	 * @param Reserved reserve perameter 
	 * @return subscribe alarm event info and event solution image info from device,these info are sent to users via interface parameter's recall function cbAnalyzerData. 
	 * \else
	 * 实时上传智能分析数据－图片(扩展接口,bNeedPicFile表示是否订阅图片文件,Reserved类型为  RESERVED_PARA )
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelID 通道号
	 * @param dwAlarmType 报警类型,参见 {@link CB_fAnalyzerDataCallBack}
	 * @param bNeedPicFile 是否订阅图片文件,1-订阅图片文件,在回调函数中会返回智能图片信息,0-不订阅图片文件,在回调函数中不会返回智能图片信息(在不需要图片信息时,可减少网络流量) 
	 * @param cbAnalyzerData 智能数据分析回调函数
	 * @param Reserved 保留参数
	 * @return 失败返回0,成功返回实时句柄,将作为相关函数的参数
	 * \endif
	 * @see {@link INetSDK#StopLoadPic}
	 */
	public static native long 			RealLoadPictureEx(long lLoginID, int nChannelID, int dwAlarmType, boolean bNeedPicFile, CB_fAnalyzerDataCallBack cbAnalyzerData , Object Reserved);
	
	/**
	 * \if ENGLISH_LANG
	 * download offline intelligent analysis data-image
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelID  channel NO.
	 * @param dwAlarmType  alarm type, {@link FinalVar#EVENT_IVS_ALL}
	 * @param lpStartTime  start time 
	 * @param lpEndTime  ending time 
	 * @param cbAnalyzerData  intelligent data analysis recall function,refer to RealLoadPicture 
	 * @return return to download handle
	 * \else
	 * 下载离线智能分析数据－图片
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelID  通道号
	 * @param dwAlarmType  报警类型,详见宏{@link FinalVar#EVENT_IVS_ALL}等宏定义
	 * @param lpStartTime  开始时间 
	 * @param lpEndTime  结束时间
	 * @param cbAnalyzerData  智能数据分析回调函数
	 * @return 返回下载句柄
	 * \endif
	 * @see {@link INetSDK#StopLoadPic}
	 */
	public static native long  			LoadOffLineFile(long lLoginID, int nChannelID, int dwAlarmType, NET_TIME_EX lpStartTime, NET_TIME_EX lpEndTime, CB_fAnalyzerDataCallBack cbAnalyzerData);

	/**
	 * \if ENGLISH_LANG
	 * stop uploading intelligent analysis data－image
	 * @param lAnalyzerHandle  {@link INetSDK#RealLoadPicture} return value
	 * @return true:success, false:failed
	 * \else
	 * 停止上传智能分析数据－图片
	 * @param lAnalyzerHandle  {@link INetSDK#RealLoadPicture} 返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		StopLoadPic(long lAnalyzerHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm reset
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param dwAlarmType Alarm Type
	 * @param nChannel Channel Id 
	 * @param pReserved Reserved
	 * @param nWaitTime Wait time
	 * @return true:success, false:failed
	 * \else
	 * 报警复位
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param dwAlarmType 扩展报警类型
	 * @param nChannel 通道号
	 * @param pReserved 保留
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#StartListenEx}
	 */
	public static native boolean 		AlarmReset(long lLoginID, int dwAlarmType, int nChannel, Object pReserved , int nWaitTime );

	/**
	 * \if ENGLISH_LANG
	 * set extra stream recording status
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pRSBuffer record status buffer, the total length is the channel number, the data definition in the buffer table as:\n
	 * 0:not record;1:manually record;2:auto record
	 * @param nRSBufferlen record status number, each channel is 1 byte 
	 * @param pReserved reserve parameter 
	 * @return true:success, false:failed
	 * \else
	 * 设置通道辅码流录像状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pRSBuffer 录像状态缓冲区,总长度为通道个数,0:不录像;1:手动录像;2:自动录像
	 * @param nRSBufferlen 录像状态个数,每一个通道为1个字节
	 * @param pReserved 保留参数 
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#QueryExtraRecordState}
	 */
	public static native boolean 		SetupExtraRecordState(long lLoginID, char pRSBuffer[], int nRSBufferlen, int pReserved);

	/**
	 * \if ENGLISH_LANG
	 * Camera focus control
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2} return value
	 * @param nChannelID Channel no.
	 * @param dwFocusCommand 0 as focus adjustment   1 as continuous  2 as auto, adjust focus to best position nFocus and nZoom invlaid
	 * @param dFocus Relative focus change speed its value is -1~1,0 means stop
	 * @param dZoom relative zoom speed its value is -1~1,0 means stop
	 * @param reserved Reserved
	 * @param waittime Waiting time 
	 * @return true:successful, false:failed
	 * \else
	 * 镜头聚焦控制
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelID 通道号
	 * @param dwFocusCommand 0为聚焦调节   1为连续聚焦调节  2为自动聚焦调节,调节焦点至最佳位置nFocus和nZoom无效
	 * @param dFocus 相对聚焦变化速率 其值为-1~1,0表示停止
	 * @param dZoom 相对变倍速率 其值为-1~1,0表示停止
	 * @param reserved 保留
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		FocusControl(long lLoginID, int nChannelID, long dwFocusCommand, double dFocus, double dZoom, int reserved , int waittime);

	
	/**
	 * \if ENGLISH_LANG
	 * turn off search handle
	 * @param lFindHandle {@link INetSDK#FindFileEx} return value
	 * @return true:success, false:failed
	 * \else
	 * 结束录像文件查找
	 * @param lFindHandle {@link INetSDK#FindFileEx} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean		FindCloseEx(long  lFindHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * stop downloading data
	 * @param lFileHandle  {@link INetSDK#DownloadMediaFile} return value
	 * @return true:success, false:failed
	 * \else
	 * 停止下载数据
	 * @param lFileHandle  {@link INetSDK#DownloadMediaFile}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		StopDownloadMediaFile(long  lFileHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * pause intelligent analysis data downloading
	 * @param lLoadHadle  loading handle, return from {@link INetSDK#DownloadMediaFile}
	 * @param bPause  pause downloading or not, TRUE means pause, FALSE means resume
	 * @return true:success, false:failed
	 * \else
	 * 暂停智能分析数据下载
	 * @param lLoadHadle  载入句柄 , {@link INetSDK#DownloadMediaFile} 的返回值
	 * @param bPause  是否暂停下载, TRUE表示暂停下载, FALSE表示恢复下载
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		PauseLoadPic(long lLoadHadle, boolean bPause);

	/**
	 * \if ENGLISH_LANG
	 * special interface,used to send web info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param szInBuffer  data sent to device
	 * @param szOutBuffer size of data sent to device
	 * @param waittime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * web透传接口
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param szInBuffer  传送给设备的数据
	 * @param szOutBuffer 设备返回给web的数据
	 * @param waittime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		TransmitInfoForWeb(long lLoginID, byte szInBuffer[], byte szOutBuffer[], int waittime);

	/**
	 * \if ENGLISH_LANG
	 * PTZ control
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelID  channel NO.
	 * @param dwPTZCommand support the following PTZ command 
	 * <table>
	 * <tr><td>operation type</td><td>function</td></tr>
	 * <tr><td>PTZ_UP_CONTROL</td><td>up</td></tr>
	 * <tr><td>PTZ_DOWN_CONTROL</td><td>down</td></tr>
	 * <tr><td>PTZ_LEFT_CONTROL</td><td>left</td></tr>
	 * <tr><td>PTZ_RIGHT_CONTROL</td><td>right </td></tr>
	 * <tr><td>PTZ_ZOOM_ADD_CONTROL	</td><td>zoom+ </td></tr>
	 * <tr><td>PTZ_ZOOM_DEC_CONTROL</td><td>zoom- </td></tr>
	 * <tr><td>PTZ_FOCUS_ADD_CONTROL</td><td>focus+ </td></tr>
	 * <tr><td>PTZ_FOCUS_DEC_CONTROL</td><td>focus-</td></tr> 
	 * <tr><td>PTZ_APERTURE_ADD_CONTROL </td><td>iris+</td></tr>
	 * <tr><td>PTZ_APERTURE_DEC_CONTROL</td><td>iris-</td></tr>   
	 * <tr><td>PTZ_POINT_MOVE_CONTROL</td><td>turn to preset point</td></tr>
	 * <tr><td>PTZ_POINT_SET_CONTROL</td><td>setup</td></tr>
	 * <tr><td>PTZ_POINT_DEL_CONTROL</td><td>delete </td></tr>
	 * <tr><td>PTZ_POINT_LOOP_CONTROL</td><td>point tour</td></tr>
	 * <tr><td>PTZ_LAMP_CONTROL</td><td>light wiper</td></tr>
	 * </table>
	 * @param dwStep progress/speed,range1~8,8 max effect,when operating preset point, dwStep is the value. 
	 * @param dwStop stop or not, effective to PTZ direction control, for other operations, this parameter should be filled with FALSE. 
	 * @return true:success, false:failed
	 * \else
	 * 通用云台控制
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelID  通道号
	 * @param dwPTZCommand 云台控制命令 
	 * <table>
	 * <tr><td>操作类型</td><td>功能 </td></tr>
	 * <tr><td>PTZ_UP_CONTROL</td><td>上 </td></tr>
	 * <tr><td>PTZ_DOWN_CONTROL</td><td>下 </td></tr>
	 * <tr><td>PTZ_LEFT_CONTROL	</td><td>左 </td></tr>
	 * <tr><td>PTZ_RIGHT_CONTROL</td><td>右 </td></tr>
	 * <tr><td>PTZ_ZOOM_ADD_CONTROL	</td><td>变倍+</td></tr>
	 * <tr><td>PTZ_ZOOM_DEC_CONTROL</td><td>变倍-</td></tr>
	 * <tr><td>PTZ_FOCUS_ADD_CONTROL</td><td>调焦+ </td></tr>
	 * <tr><td>PTZ_FOCUS_DEC_CONTROL</td><td>调焦-</td></tr> 
	 * <tr><td>PTZ_APERTURE_ADD_CONTROL</td><td>光圈+</td></tr>
	 * <tr><td>PTZ_APERTURE_DEC_CONTROL</td><td>光圈-</td></tr>
	 * <tr><td>PTZ_POINT_MOVE_CONTROL</td><td>转至预置点 </td></tr>
	 * <tr><td>PTZ_POINT_SET_CONTROL</td><td>设置 </td></tr>
	 * <tr><td>PTZ_POINT_DEL_CONTROL</td><td>删除 </td></tr>
	 * <tr><td>PTZ_POINT_LOOP_CONTROL</td><td>点间轮循 </td></tr>
	 * <tr><td>PTZ_LAMP_CONTROL</td><td>灯光雨刷 </td></tr>
	 * </table>
	 * @param dwStep 步进/速度,范围1~8,8控制效果最明显,操作预置点时dwStep为预置点值
	 * @param dwStop 是否停止,TRUE,表示停止对云台八方向操作及镜头操作命令有效,进行其他操作时,本参数应填充FALSE
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		PTZControl(long lLoginID, int nChannelID, int dwPTZCommand, int dwStep, boolean dwStop);
	
	/**
	 * \if ENGLISH_LANG
	 * extended PTZ control, enhance PTZ control over function; refer to interface file for detailed command definition and parameter effectiveness
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelID channel NO. 
	 * @param dwPTZCommand  PTZ Dome control command,compatible with {@link INetSDK#PTZControl} interface.param2 is equivalent to parameter dwStep,meanwhile extended to support the following functions
	 * <table>
	 * <tr><td>dwPTZCommand</td><td>function</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTTOP</td><td>upper left p1 horizontal speed, p2 vertical speed</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTTOP</td><td>upper right p1 horizontal speed, p2 vertical speed</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN</td><td>lower left p1 horizontal speed, p2 vertical speed</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN</td><td>lower right p1 horizontal speed, p2 vertical speed</td></tr>
	 * <tr><td>SDK_EXTPTZ_ADDTOLOOP</td><td>add preset point to tour p1 tour path p2 preset point value</td></tr>
	 * <tr><td>SDK_EXTPTZ_DELFROMLOOP</td><td>delete preset point in tour p1 tour path p2 preset point value</td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSELOOP</td><td>delete tour p1 tour path</td></tr>
	 * <tr><td>SDK_EXTPTZ_STARTPANCRUISE</td><td>start horizontal rotation </td></tr>
	 * <tr><td>SDK_EXTPTZ_STOPPANCRUISE</td><td>stop horizontal rotation</td></tr>
	 * <tr><td>SDK_EXTPTZ_SETLEFTBORDER</td><td>set left border</td></tr>
	 * <tr><td>SDK_EXTPTZ_SETRIGHTBORDER</td><td>set right border</td></tr>
	 * <tr><td>SDK_EXTPTZ_STARTLINESCAN</td><td>start to scan</td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSELINESCAN</td><td>stop scanning</td></tr>
	 * <tr><td>SDK_EXTPTZ_SETMODESTART</td><td>set mode start mode path</td></tr>
	 * <tr><td>SDK_EXTPTZ_SETMODESTOP</td><td>set mode end mode path</td></tr>
	 * <tr><td>SDK_EXTPTZ_RUNMODE</td><td>operation mode p1 mode path</td></tr>
	 * <tr><td>SDK_EXTPTZ_STOPMODE</td><td>stop mode p1 mode path </td></tr>
	 * <tr><td>SDK_EXTPTZ_DELETEMODE</td><td>delete mode p1 mode path</td></tr>
	 * <tr><td>SDK_EXTPTZ_REVERSECOMM</td><td>turn command</td></tr>
	 * <tr><td>SDK_EXTPTZ_FASTGOTO</td><td>quick positioning,p1horizontal coordinate,p2vertical coordinate,p3zoom</td></tr>
	 * <tr><td>SDK_EXTPTZ_AUXIOPEN
	 * </td><td>
	 * <pre>
	 * auxiliary switch on,p1 auxiliary point
	 * auxiliary point 23, backlight compensation
	 * auxiliary point 24, digital zoom enabled
	 * auxiliary point 27, night mode enable
	 * auxiliary point 41, camera luminance gain
	 * auxiliary point 43, preset point warning enabled
	 * </pre>
	 * </td></tr>
	 * <tr><td>SDK_EXTPTZ_AUXICLOSE
	 * </td><td>
	 * <pre>auxiliary point switch off ,p1auxiliary point
	 * auxiliary point 23, backlight compensation off
	 * auxiliary point 24, digital zoom off
	 * auxiliary point 27, night mode off
	 * auxiliary point 41, camera luminance reduction 
	 * auxiliary point 43, preset point warning off
	 * </pre>
	 * </td></tr>
	 * <tr><td>SDK_EXTPTZ_OPENMENU</td><td>open PTZ dome camera menu </td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSEMENU</td><td>menu off</td></tr> 
	 * <tr><td>SDK_EXTPTZ_MENUOK</td><td>menu confirm</td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUCANCEL</td><td>menu cancel </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUUP</td><td>menu up</td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUDOWN</td><td>menu down</td></tr>
	 * <tr><td>SDK_EXTPTZ_MENULEFT</td><td>menu left</td></tr>
	 * <tr><td>SDK_EXTPTZ_MENURIGHT</td><td>menu right</td></tr>
	 * <tr><td>SDK_EXTPTZ_ALARMHANDLE</td><td>alarm linkage PTZ</td></tr>
	 * <tr><td>SDK_EXTPTZ_MATRIXSWITCH</td><td>matrix switch</td></tr>
	 * <tr><td>SDK_EXTPTZ_LIGHTCONTROL</td><td>light controllor</td></tr>
	 * <tr><td>SDK_EXTPTZ_EXACTGOTO	</td><td>3D positioning</td></tr>
	 * <tr><td>SDK_EXTPTZ_RESETZERO	</td><td>3D positioning reset</td></tr>
	 * <tr><td>SDK_EXTPTZ_UP_TELE</td><td>up + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_DOWN_TELE</td><td>down + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFT_TELE</td><td>left + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHT_TELE</td><td>right + TELE </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTUP_TELE</td><td>leftup + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_TELE</td><td>leftdown + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_TELE</td><td>rightup + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_TELE</td><td>rightdown + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_UP_WIDE</td><td>up + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_DOWN_WIDE</td><td>down + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFT_WIDE</td><td>left + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHT_WIDE</td><td>right + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTUP_WIDE</td><td>leftup + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_WIDE</td><td>leftdown + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_WIDE</td><td>rightup + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_WIDE</td><td>rightdown + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_TOTAL</td><td>max command value</td></tr>
	 * </table>
	 * PTZ command dwPTZCommand and parameter(param1,param2,param3) relationship list
	 * <table>
	 * <tr><td>dwPTZCommand</td><td>function description</td><td>param1</td><td>param2</td><td>param3 </td></tr>
	 * <tr><td>SDK_PTZ_UP_CONTROL</td><td>up</td><td> </td><td>vertical speed(1-8)</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_DOWN_CONTROL</td><td>down</td><td> </td><td>vertical speed(1-8)</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_LEFT_CONTROL</td><td>left</td><td> </td><td>horizontal speed(1-8)</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_RIGHT_CONTROL</td><td>right</td><td> </td><td>horizontal speed(1-8)</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_ZOOM_ADD_CONTROL</td><td>zoom+</td><td> </td><td>speed</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_ZOOM_DEC_CONTROL</td><td>zoom-</td><td> </td><td>speed</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_FOCUS_ADD_CONTROL</td><td>focusing+</td><td> </td><td>speed</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_FOCUS_DEC_CONTROL</td><td>focusing-</td><td> </td><td>speed</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_APERTURE_ADD_CONTROL</td><td>iris+</td><td> </td><td>speed</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_POINT_MOVE_CONTROL</td><td>to preset point</td><td> </td><td>preset point value</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_POINT_SET_CONTROL</td><td>set</td><td> </td><td>preset point value</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_POINT_DEL_CONTROL</td><td>delete	</td><td> </td><td>	preset point value</td><td> </td></tr>
	 * <tr><td>SDK_PTZ_POINT_LOOP_CONTROL</td><td>tour among points</td><td> </td><td> </td><td>76:start,99:auto,96:stop</td></tr>
	 * <tr><td>SDK_PTZ_LAMP_CONTROL</td><td>light wiper</td><td>0x01on,x00off</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTTOP</td><td>leftup</td><td>vertical speed(1－8)	</td><td>horizontal speed(1－8)</td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTTOP</td><td>	rightup</td><td>vertical speed(1－8)</td><td>horizontal speed(1－8)</td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN</td><td>leftdown</td><td>vertical speed(1－8)</td><td>horizontal speed(1－8)</td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN</td><td>rightdown</td><td>vertical speed(1－8)</td><td>horizontal speed(1－8)</td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_ADDTOLOOP</td><td>add preset point into tour</td><td>tour path</td><td>preset point value</td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_DELFROMLOOP</td><td>delete preset point in tour</td><td>tour path</td><td>preset point value</td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSELOOP</td><td>delete tour</td><td>tour path</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_STARTPANCRUISE</td><td>start horizontal rotation</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_STOPPANCRUISE</td><td>stop horizontal rotation</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETLEFTBORDER</td><td>selt left border</td><td>line scan index(1-5)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTBORDER</td><td>set right border</td><td> line scan index(1-5)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_STARTLINESCAN</td><td>start scanning</td><td>line scan index(1-5) </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSELINESCAN</td><td>stop scanning </td><td>line scan index(1-5) </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETMODESTART</td><td>setting mode start</td><td>mode path</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETMODESTOP</td><td>setting mode end</td><td>mode path</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_RUNMODE</td><td>operation mode</td><td>mode path</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_STOPMODE</td><td>stop mode</td><td>mode path</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_DELETEMODE</td><td>delete mode</td><td>mode path</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_REVERSECOMM</td><td>turn command</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_FASTGOTO</td><td>quick positioning</td><td>horizontal coordinate</td><td>vertical coordinate</td><td>zoom</td></tr>
	 * <tr><td>SDK_EXTPTZ_AUXIOPEN</td><td>auxiliary switch on</td><td>auxiliary point</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_AUXICLOSE</td><td>auxiliary switch off</td><td>auxiliary point</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_OPENMENU</td><td>open PTZ dome camera menu</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSEMENU</td><td>turn off menu</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUOK</td><td>menu confirm</td><td> </td><td> /td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUCANCEL</td><td>menu cancel</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUUP</td><td>menu up</td><td> </td><td></td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUDOWN</td><td>menu down</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENULEFT</td><td>menu left</td><td> </td><td>	</td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENURIGHT</td><td>menuright</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_ALARMHANDLE</td><td>alarm linkage PTZ</td><td>alarn input channel</td><td>alarm linkage type1-preset point2-scan3-tour</td><td>linkage value,such as preset point number</td></tr>
	 * <tr><td>SDK_EXTPTZ_MATRIXSWITCH</td><td>matrix switch</td><td>monitor number(video output number)</td><td>video input number	</td><td>matrix number</td></tr>
	 * <tr><td>SDK_EXTPTZ_LIGHTCONTROL</td><td>light controllor</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_EXACTGOTO</td><td>3D positioning</td><td>horizontal angle(0~3600)</td><td>vertical coordinate(0~900)</td><td>zoom(1~128)</td></tr>
	 * <tr><td>SDK_EXTPTZ_RESETZERO</td><td>3D positioning reset</td><td> </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_UP_TELE</td><td>up + TELE</td><td>speed(1-8) </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_DOWN_TELE</td><td>down + TELE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFT_TELE</td><td>left + TELE	</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHT_TELE</td><td>right + TELE</td><td>speed(1-8) </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTUP_TELE</td><td>leftup + TELE	</td><td>speed(1-8) </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_TELE</td><td>leftdown + TELE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_TELE</td><td>rightup + TELE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_TELE</td><td>rightdown + TELE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_UP_WIDE</td><td>up + WIDE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_DOWN_WIDE</td><td>down + WIDE	</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFT_WIDE</td><td>left + WIDE	</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHT_WIDE</td><td>right + WIDE</td><td>speed(1-8) </td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTUP_WIDE</td><td>leftup + WIDE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_WIDE</td><td>leftdown + WIDE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_WIDE</td><td>rightup + WIDE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_WIDE</td><td>rightdown + WIDE</td><td>speed(1-8)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_TOTAL</td><td>max command value</td><td> </td><td> </td><td> </td></tr>
	 * </table>	
	 * @param param1 parameter1 details refer to above chart 
	 * @param param2 parameter2
	 * @param param3 parameter3
	 * @param dwStop  stop or not, effective to PTZ eight-directions operation and lens operation. During other operation, this parameter should fill in FALSE 
	 * @return successful return to TRUE,failed return to FALSE
	 * \else
	 * 私有云台控制
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelID 通道号
	 * @param dwPTZCommand  球机控制命令,详见  SDK_EXTPTZ_ControlType SDK_PTZ_ControlType SDK_EXTPTZ_ControlType 兼容 {@link INetSDK#PTZControl} 接口,param2相当于参数dwStep,同时扩展支持以下功能
	 * <table>
	 * <tr><td>dwPTZCommand</td><td>功能</td></tr> 
	 * <tr><td>SDK_EXTPTZ_LEFTTOP</td><td>左上 p1水平速度, p2垂直速度 </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTTOP</td><td>右上 p1水平速度, p2垂直速度 </td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN</td><td>左下p1水平速度, p2垂直速度 </td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN</td><td>右下p1水平速度, p2垂直速度 </td></tr>
	 * <tr><td>SDK_EXTPTZ_ADDTOLOOP</td><td>加入预置点到巡航 p1巡航线路 p2预置点值 </td></tr>
	 * <tr><td>SDK_EXTPTZ_DELFROMLOOP</td><td>删除巡航中预置点 p1巡航线路 p2预置点值 </td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSELOOP</td><td>清除巡航 p1巡航线路</td></tr> 
	 * <tr><td>SDK_EXTPTZ_STARTPANCRUISE</td><td>开始水平旋转 </td></tr>
	 * <tr><td>SDK_EXTPTZ_STOPPANCRUISE</td><td>停止水平旋转 </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETLEFTBORDER</td><td>设置左边界 </td><td>线扫线路(1-5)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETRIGHTBORDER</td><td>设置右边界 </td><td>线扫线路(1-5)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_STARTLINESCAN</td><td>开始线扫 </td><td>线扫线路(1-5)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSELINESCAN</td><td>停止线扫 </td><td>线扫线路(1-5)</td><td> </td><td> </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETMODESTART</td><td>设置模式开始 模式线路 </td></tr>
	 * <tr><td>SDK_EXTPTZ_SETMODESTOP</td><td>设置模式结束 模式线路 </td></tr>
	 * <tr><td>SDK_EXTPTZ_RUNMODE</td><td>运行模式 p1模式线路 </td></tr>
	 * <tr><td>SDK_EXTPTZ_STOPMODE</td><td>停止模式 p1模式线路  </td></tr>
	 * <tr><td>SDK_EXTPTZ_DELETEMODE</td><td>清除模式 p1模式线路 </td></tr>
	 * <tr><td>SDK_EXTPTZ_REVERSECOMM</td><td>翻转命令 </td></tr>
	 * <tr><td>SDK_EXTPTZ_FASTGOTO</td><td>快速定位,p1水平坐标,p2垂直坐标,p3变倍 </td></tr>
	 * <tr><td>SDK_EXTPTZ_AUXIOPEN</td><td>辅助开关开,p1辅助点;辅助点 23, 开背光补偿;辅助点 24, 开数字变倍能;辅助点 27, 开夜视功能;辅助点 41, 摄像机亮度增;辅助点 43, 开预置题显示</td></tr>
	 * <tr><td>SDK_EXTPTZ_AUXICLOSE</td><td>辅助开关关 ,p1辅助点;辅助点 23, 关背光补偿;辅助点 24, 关数字变倍能;辅助点 27, 关夜视功能;辅助点 41, 摄像机亮度减;辅助点 43, 关预置标题显示</td></tr>
	 * <tr><td>SDK_EXTPTZ_OPENMENU</td><td>打开球机菜单 </td></tr>
	 * <tr><td>SDK_EXTPTZ_CLOSEMENU</td><td>关闭菜单 </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUOK</td><td>菜单确定 </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUCANCEL</td><td>菜单取消 </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUUP</td><td>菜单上 </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENUDOWN</td><td>菜单下 </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENULEFT</td><td>菜单左 </td></tr>
	 * <tr><td>SDK_EXTPTZ_MENURIGHT</td><td>菜单右 </td></tr>
	 * <tr><td>SDK_EXTPTZ_ALARMHANDLE</td><td>报警联动云台 </td></tr>
	 * <tr><td>SDK_EXTPTZ_MATRIXSWITCH</td><td>矩阵切换 </td></tr>
	 * <tr><td>SDK_EXTPTZ_LIGHTCONTROL</td><td>灯光控制器 </td></tr>
	 * <tr><td>SDK_EXTPTZ_EXACTGOTO</td><td>三维精确定位 </td></tr>
	 * <tr><td>SDK_EXTPTZ_RESETZERO</td><td>三维定位重设零位 </td></tr>
	 * <tr><td>SDK_EXTPTZ_UP_TELE</td><td>上 + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_DOWN_TELE</td><td>下 + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFT_TELE</td><td>左 + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHT_TELE</td><td>右 + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTUP_TELE</td><td>左上 + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_TELE</td><td>左下 + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_TELE</td><td>右上 + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_TELE</td><td>右下 + TELE</td></tr>
	 * <tr><td>SDK_EXTPTZ_UP_WIDE</td><td>上 + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_DOWN_WIDE</td><td>下 + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFT_WIDE</td><td>左 + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHT_WIDE</td><td>右 + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTUP_WIDE</td><td>左上 + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_WIDE</td><td>左下 + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_WIDE</td><td>右上 + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_WIDE</td><td>右下 + WIDE</td></tr>
	 * <tr><td>SDK_EXTPTZ_TOTAL</td><td>最大命令值 </td></tr>
	 * </table>
	 * <table>
	 * 云台命令dwPTZCommand和参数(param1,param2,param3)之间的关系表
	 * <tr><td>dwPTZCommand						功能描述				param1							param2								param3 </td></tr>
	 * <tr><td>SDK_PTZ_UP_CONTROL</td><td>上</td><td> </td><td>垂直速度(1-8)</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_DOWN_CONTROL</td><td>下 </td><td> </td><td>垂直速度(1-8)</td><td> </td><td>
	 * <tr><td>SDK_PTZ_LEFT_CONTROL</td><td>左</td><td> </td><td> 水平速度(1-8) </td><td> </td><td> 
	 * <tr><td>SDK_PTZ_RIGHT_CONTROL</td><td>右	</td><td> </td><td>水平速度(1-8)</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_ZOOM_ADD_CONTROL</td><td>变倍+	</td><td> </td><td>倍速 </td><td> </td><td> 
	 * <tr><td>SDK_PTZ_ZOOM_DEC_CONTROL</td><td>变倍-	</td><td> </td><td>倍速  </td><td> </td><td>
	 * <tr><td>SDK_PTZ_FOCUS_ADD_CONTROL</td><td>调焦+</td><td> </td><td>倍速</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_FOCUS_DEC_CONTROL</td><td>调焦-</td><td> </td><td>倍速</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_APERTURE_ADD_CONTROL</td><td>光圈+</td><td> </td><td>倍速 </td><td> </td><td> 
	 * <tr><td>SDK_PTZ_POINT_MOVE_CONTROL</td><td>转至预置点</td><td> </td><td>预置点值</td><td> </td><td> 
	 * <tr><td>SDK_PTZ_POINT_SET_CONTROL</td><td>设置	</td><td> </td><td>预置点值</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_POINT_DEL_CONTROL</td><td>删除	</td><td> </td><td>预置点值</td><td> </td><td>  
	 * <tr><td>SDK_PTZ_POINT_LOOP_CONTROL</td><td>点间轮循</td><td> </td><td> </td><td>76:开始,99:自动,96:停止</td><td> 
	 * <tr><td>SDK_PTZ_LAMP_CONTROL	</td><td>灯光雨刷</td><td>0x01开启,x00关闭</td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_LEFTTOP</td><td>左上</td><td>垂直速度(1－8)	</td><td>水平速度(1－8)</td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_RIGHTTOP</td><td>右上</td><td>垂直速度(1－8)</td><td>水平速度(1－8)</td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN</td><td>左下 </td><td>垂直速度(1－8)</td><td>水平速度(1－8)</td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN</td><td>右下</td><td>垂直速度(1－8)</td><td>水平速度(1－8)</td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_ADDTOLOOP</td><td>加入预置点到巡航</td><td>巡航线路 </td><td>预置点值 </td><td> </td><td> 
	 * <tr><td>SDK_EXTPTZ_DELFROMLOOP</td><td>删除巡航中预置点</td><td> 巡航线路	</td><td>预置点值</td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_CLOSELOOP	</td><td>清除巡航</td><td> 巡航线路  </td><td> </td><td> </td><td> 
	 * <tr><td>SDK_EXTPTZ_STARTPANCRUISE</td><td>开始水平旋转 </td><td> </td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_STOPPANCRUISE</td><td>停止水平旋转</td><td> </td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_SETLEFTBORDER</td><td>设置左边界  </td><td> </td><td> </td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_RIGHTBORDER</td><td>设置右边界 </td><td> </td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_STARTLINESCAN	</td><td>开始线扫  </td><td> </td><td> </td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_CLOSELINESCAN	</td><td>停止线扫</td><td> </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_SETMODESTART</td><td>设置模式开始</td><td>模式线路(1-5)   </td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_SETMODESTOP</td><td>设置模式结束</td><td>模式线路(1-5</td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_RUNMODE</td><td>运行模式	</td><td>模式线路(1-5) </td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_STOPMODE</td><td>停止模式</td><td>模式线路(1-5) </td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_DELETEMODE</td><td>清除模式</td><td>模式线路(1-5)</td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_REVERSECOMM</td><td>翻转命令 </td><td> </td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_FASTGOTO</td><td>快速定位</td><td>水平坐标</td><td>垂直坐标 </td><td>变倍 
	 * <tr><td>SDK_EXTPTZ_AUXIOPEN</td><td>辅助开关开</td><td> 辅助点</td><td> </td><td> </td><td>
	 * <tr><td>SDK_EXTPTZ_AUXICLOSE</td><td>辅助开关关</td><td>辅助点</td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_OPENMENU</td><td>打开球机菜单</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_CLOSEMENU</td><td>关闭菜单</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_MENUOK</td><td>菜单确定</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_MENUCANCEL</td><td>菜单取消</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_MENUUP</td><td>菜单上  </td><td> </td><td> </td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_MENUDOWN</td><td>菜单下 </td><td> </td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_MENULEFT</td><td>菜单左 </td><td> </td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_MENURIGHT</td><td>菜单右</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_ALARMHANDLE</td><td>报警联动云台 </td><td>报警输入通道 </td><td>报警联动类型1-预置点2-线扫3-巡航</td><td>联动值,如预置点号 
	 * <tr><td>SDK_EXTPTZ_MATRIXSWITCH</td><td>矩阵切换</td><td>预览器号(视频输出号)</td><td>视频输入号</td><td>矩阵号 
	 * <tr><td>SDK_EXTPTZ_LIGHTCONTROL</td><td>灯光控制器</td><td> </td><td> </td><td> </td><td>    
	 * <tr><td>SDK_EXTPTZ_EXACTGOTO</td><td>三维精确定位</td><td>水平角度(0~3600)</td><td>垂直坐标(0~900)</td><td>变倍(1~128) 
	 * <tr><td>SDK_EXTPTZ_RESETZERO</td><td>三维定位重设零位  </td><td> </td><td> </td><td> </td><td>  
	 * <tr><td>SDK_EXTPTZ_UP_TELE</td><td>上 + TELE</td><td>速度(1-8)</td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_DOWN_TELE</td><td>下 + TELE</td><td>速度(1-8)</td><td> </td><td> </td><td>   
	 * <tr><td>SDK_EXTPTZ_LEFT_TELE</td><td>左 + TELE	</td><td>速度(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_RIGHT_TELE</td><td>右 + TELE</td><td>速度(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_LEFTUP_TELE</td><td>左上 + TELE</td><td>速度(1-8) </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_TELE</td><td>左下 + TELE</td><td> 速度(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_TELE</td><td>右上 + TELE	</td><td>速度(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_TELE</td><td>右下 + TELE</td><td>速度(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_UP_WIDE</td><td>上 + WIDE</td><td> 速度(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_DOWN_WIDE</td><td>下 + WIDE</td><td> 速度(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_LEFT_WIDE</td><td>左 + WIDE</td><td>速度(1-8) </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_RIGHT_WIDE</td><td>右 + WIDE</td><td>速度(1-8) </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_LEFTUP_WIDE</td><td>左上 + WIDE</td><td>速度(1-8) </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_LEFTDOWN_WIDE</td><td>左下 + WIDE</td><td> 速度(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_TIGHTUP_WIDE</td><td>右上 + WIDE</td><td>速度(1-8) </td><td> </td><td> </td><td>     
	 * <tr><td>SDK_EXTPTZ_RIGHTDOWN_WIDE</td><td>右下 + WIDE</td><td>速度(1-8)</td><td> </td><td> </td><td>      
	 * <tr><td>SDK_EXTPTZ_TOTAL</td><td>最大命令值 </td><td> </td><td> </td><td> </td><td>   
	 * </table>
	 * @param param1 参数1
	 * @param param2 参数2
	 * @param param3 参数3
	 * @param dwStop  是否停止,对云台八方向操作及镜头操作命令有效,进行其他操作时,本参数应填充FALSE 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		SDKPTZControl(long lLoginID, int nChannelID, int dwPTZCommand, byte param1, byte param2, byte param3, boolean dwStop);
	
	public static native boolean 		SDKPTZControlEx(long lLoginID, int nChannelID, int dwPTZCommand, int lParam1, int lParam2, int lParam3, boolean dwStop);

	/**
	 * \if ENGLISH_LANG
	 * extended PTZ control, enhance PTZ control over function; refer to interface file for detailed command definition and parameter effectiveness
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity}
	 * @param nChannelID channel NO.
	 * @param dwPTZCommand PTZ command
	 * support the following PTZ command,
	 * <table>
	 * <tr><td>type</td><td>description</td><td>lParam1</td><td>lParam2</td><td>lParam3</td><td>structure of para4</td></tr>
	 * <tr><td>SDK_EXTPTZ_GOTOPRESET</td><td>PTZ control command, at a certain speed to preset locus</td><td>value is 0</td><td>value is 0</td><td>value is 0</td><td>PTZ_CONTROL_GOTOPRESET</td></tr>
	  * </table>
	 * @param lParam1 parameter1 details refer to above chart
	 * @param lParam2 parameter2
	 * @param lParam3 parameter3
	 * @param dwStop  stop or not, effective to PTZ eight-directions operation and lens operation. During other operation, this parameter should fill in false
	 * @param param4 parameter4,refer to dwPTZCommand table
	 * @return successful return to true,failed return to false
	 * \else
	 * 私有云台控制
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity}
	 * @param nChannelID 通道号
	 * @param dwPTZCommand  球机控制命令,支持以下几种
	 * <table>
	 * <tr><td>type</td><td>描述 </td><td>lParam1</td><td>lParam2 </td><td>lParam3 </td><td>param4对应的结构体 </td></tr>
	 * <tr><td>SDK_EXTPTZ_GOTOPRESET</td><td>云台控制命令,以一定速度转到预置位点</td><td>lParam1值为0</td><td>lParam2值为0</td><td>lParam3值为0</td><td>PTZ_CONTROL_GOTOPRESET</td></tr>
	 * </table>
	 * @param lParam1 参数1
	 * @param lParam2 参数2
	 * @param lParam3 参数3
	 * @param dwStop  是否停止,对云台八方向操作及镜头操作命令有效,进行其他操作时,本参数应填充false
	 * @param param4 参数4，参考dwPTZCommand列表
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		SDKPTZControlEx2(long lLoginID, int nChannelID, int dwPTZCommand, long lParam1, long lParam2, long lParam3, boolean dwStop, Object param4);
	
	/**
	 * \if ENGLISH_LANG
	 * open video search handle
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelID channel NO.,start from 0 
	 * @param nRecordFileType  video file type, as follows: 
	 * <table>
	 * <tr><td>value</td><td>represent video file type</td></tr>
	 * <tr><td>0</td><td>all video files </td></tr>
	 * <tr><td>1</td><td>external alarm </td></tr>
	 * <tr><td>2</td><td>dynamic detection alarm </td></tr>
	 * <tr><td>3</td><td>all alarm</td></tr>
	 * <tr><td>4</td><td>card NO. search</td></tr>
	 * <tr><td>5</td><td>group condition search </td></tr>
	 * <tr><td>6</td><td>video location and offset length</td></tr>
	 * <tr><td>8</td><td>search image by card NO.(currently only HB-U and NVS special model device support)</td></tr>
	 * <tr><td>9</td><td>search image(currently only HB-U and NVS special model device support) </td></tr>
	 * <tr><td>10</td><td>search by text</td></tr>
	 * <tr><td>15</td><td>return to network data structure(Jinqiao internet cafe)</td></tr>
	 * <tr><td>16</td><td>search all transparent serial data video file</td></tr>
	 * </table>
	 * @param cardid card NO.,only offective in card NO. search,otherwise fill in NULL 
	 * @param time_start search video start time 
	 * @param time_end search video ending time 
	 * @param bTime search by time or not(currently ineffective,fill in false)
	 * @param waittime search overtime duration 
	 * @return successful return to search handle, failed return to 0.
	 * \else
	 * 开始查找录像文件
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelID 通道号,从0开始
	 * @param nRecordFileType  录像文件类型
	 * <table>
	 * <tr><td>值</td><td>代表录象文件类型 </td></tr>
	 * <tr><td><tr><td>0</td><td>所有录像文件 </td></tr>
	 * <tr><td>1</td><td>外部报警  </td></tr>
	 * <tr><td>2</td><td>动态检测报警 </td></tr>
	 * <tr><td>3</td><td>所有报警 </td></tr>
	 * <tr><td>4</td><td>卡号查询 </td></tr>
	 * <tr><td>5</td><td>组合条件查询 </td></tr>
	 * <tr><td>6</td><td>录像位置与偏移量长度 </td></tr>
	 * <tr><td>8</td><td>按卡号查询图片(目前仅HB-U和NVS特殊型号的设备支持) </td></tr>
	 * <tr><td>9</td><td>查询图片(目前仅HB-U和NVS特殊型号的设备支持)  </td></tr>
	 * <tr><td>10</td><td>按字段查询 </td></tr>
	 * <tr><td>15</td><td>返回网络数据结构(金桥网吧)</td></tr> 
	 * <tr><td>16</td><td>查询所有透明串数据录像文件 </td></tr>
	 * </table>
	 * @param cardid 卡号,只针对卡号查询有效,其他的情况填NULL 
	 * @param time_start 查询录像开始时间
	 * @param time_end 查询录像结束时间
	 * @param bTime 是否按时间查询(目前无效,填false)
	 * @param waittime 等待时间 
	 * @return 成功返回查询句柄,失败返回0
	 * \endif
	 * @see  {@link INetSDK#FindNextFile} {@link INetSDK#FindClose}
	 */
	public static native long          FindFile(long lLoginID, int nChannelID, int nRecordFileType, String cardid, NET_TIME time_start, NET_TIME time_end, boolean bTime, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search next video file record
	 * @param lFindHandle {@link INetSDK#FindFile} return value
	 * @param lpFindData video file record buffering, for exporting searched video file records 
	 * @return 1：successfully teke back one video record,0:video record exporting completes,-1:wrong parameter. 
	 * \else
	 * 查找录像文件
	 * @param lFindHandle {@link INetSDK#FindFile} 的返回值
	 * @param lpFindData 录像文件记录缓冲,用于输出查询到的录像文件记录
	 * @return 1：成功取回一条录像记录,0：录像记录已取完,-1：参数出错
	 * \endif
	 */
	public static native int           FindNextFile(long lFindHandle, NET_RECORDFILE_INFO lpFindData);
	
	/**
	 * \if ENGLISH_LANG
	 * turn off video search handle
	 * @param lFindHandle {@link INetSDK#FindFile} return value
	 * @return successful return to TRUE,failed return to FALSE. 
	 * \else
	 * 结束录像文件查找
	 * @param lFindHandle {@link INetSDK#FindFile} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       FindClose(long lFindHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * change play location, as drag to play
	 * @param lPlayHandle  playback handle,as {@link INetSDK#PlayBackByRecordFile} return value
	 * @param offsettime relative start shift time, unit second, its value is 0xffffffff时,invlia.
	 * @param offsetbyte relative start shift size, unit k, its value is 0xffffffff时,invlia.when offsettime valid,parameter invalid. offsetbyte=progress ratio*progress recall total file size 
	 * @return true:success, false:failed
	 * \else
	 * 定位录像回放起始点
	 * @param lPlayHandle  回放句柄,如 {@link INetSDK#PlayBackByRecordFile} 的返回值
	 * @param offsettime 相对开始处偏移时间,单位为秒,当其值为0xffffffff时,该参数无效
	 * @param offsetbyte 相对文件开始处偏移大小,单位为K,当其值为0xffffffff时,该参数无效；当offsettime有效的时候,此参数无意义offsetbyte=进度条比例*进度回调的总文件大小
	 * @return true:成功, false:失败
	 * \endif
	 * @see PlayBackByRecordFile PlayBackByRecordFileEx PlayBackByTime PlayBackByTimeEx StopPlayBack
	 */
	public static native boolean       SeekPlayBack(long lPlayHandle, int offsettime, int offsetbyte);
	
	/**
	 * \if ENGLISH_LANG
	 * network playback pause and resume playing.
	 * @param lPlayHandle playback handle,as {@link INetSDK#PlayBackByRecordFile} return value
	 * @param bPause network playback pause and resume playing parameter 1:pause,0:resume 
	 * @return true:success, false:failed
	 * \else
	 * 暂停或恢复录像回放
	 * @param lPlayHandle 回放句柄,如 {@link INetSDK#PlayBackByRecordFile} 的返回值
	 * @param bPause 网络回放暂停与恢复播放参数 1:暂停,0:恢复 
	 * @return true:成功, false:失败
	 * \endif
	 * @see PlayBackByRecordFile PlayBackByRecordFileEx PlayBackByTime PlayBackByTimeEx SeekPlayBack StopPlayBack
	 */
	public static native boolean       PausePlayBack(long lPlayHandle, boolean bPause);
	
	/**
	 * \if ENGLISH_LANG
	 * fast play,increase current frame one time, but not unlimited. Current max is 200 frame, if higher than, return to FALSE, No playback allowed with audio, slowplay is ok. This limit is enabled only when function parameter hWnd is effective when open image, otherwise not applicable, but need device to support playback speed control
	 * @param lPlayHandle playback handle,such as {@link INetSDK#PlayBackByRecordFile} return value
	 * @return true:success, false:failed
	 * \else
	 * 快进录像回放
	 * @param lPlayHandle 回放句柄,如 {@link INetSDK#PlayBackByRecordFile} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 * @see SlowPlayBack PlayBackByRecordFile PlayBackByRecordFileEx PlayBackByTime PlayBackByTimeEx
	 */
	public static native boolean       FastPlayBack(long lPlayHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * Slow play, will reduce the current frame rate one time, the slowest one frame per second, less than 1 FALSE is returned, in open image function parameter hWnd 0, equipment to support the playback speed control case, this function will take effect
	 * @param lPlayHandle playback handle,as {@link INetSDK#PlayBackByRecordFile} return value
	 * @return true:success, false:failed
	 * \else
	 * 慢进录像回放 
	 * @param lPlayHandle 回放句柄,如 {@link INetSDK#PlayBackByRecordFile} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#SlowPlayBack}  {@link INetSDK#PlayBackByRecordFile}  {@link INetSDK#PlayBackByRecordFileEx}  {@link INetSDK#PlayBackByTime}  {@link INetSDK#PlayBackByTimeEx}
	 */
	public static native boolean       SlowPlayBack(long lPlayHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * resume to normal speed
	 * @param lPlayHandle playback handle, return from {@link INetSDK#PlayBackByRecordFile}
	 * @return true:success, false:failed
	 * \else
	 * 恢复正常回放速度 
	 * @param lPlayHandle 回放句柄,如 {@link INetSDK#PlayBackByRecordFile}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#SlowPlayBack}  {@link INetSDK#PlayBackByRecordFile}  {@link INetSDK#PlayBackByRecordFileEx}  {@link INetSDK#PlayBackByTime}  {@link INetSDK#PlayBackByTimeEx}
	 */
	public static native boolean       NormalPlayBack(long lPlayHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * subscribe device info,received info recall from SetDVRMessCallBack's set value
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @return true:success, false:failed
	 * \else
	 * 开始监听报警
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#SetDVRMessCallBack}  {@link INetSDK#StopListen}
	 */
	public static native boolean       StartListen(long lLoginID);
	
	/**
	 * \if ENGLISH_LANG
	 * subscribe device info,received info call from SetDVRMessCallBack's set value
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @return true:success, false:failed
	 * \else
	 * 向设备订阅报警
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#SetDVRMessCallBack}  {@link INetSDK#StopListen}
	 */
	public static native boolean       StartListenEx(long lLoginID);
	
	/**
	 * \if ENGLISH_LANG
	 * stop monitoring a certain device
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @return true:success, false:failed
	 * \else
	 * 停止对某个设备侦听消息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#StartListen}  {@link INetSDK#StartListenEx}
	 */
	public static native boolean       StopListen(long lLoginID);
	
	/**
	 * \if ENGLISH_LANG
	 * start a port to monitor, be ready to connect devices 
	 * @param ip simulate to start service ip,if there is another network card, fill in 0,means monitoring the device IP 
	 * @param port  simulate to start service port NO. 
	 * @param timeOut  this parameter is invlid, can be random value 
	 * @param cbListen service recall, if there is device connect normally and initiate registration, inform users via the recall 
	 * @return not 0 means successful,0 means failed,may call {@link INetSDK#GetLastError} to receive detailed reason for the mistake.
	 * \else
	 * 开启监听
	 * @param ip 拟启动服务的ip,如果只有一个网卡,则填0,表示对本机ip进行侦听
	 * @param port  拟启动服务的端口号
	 * @param timeOut  此参数已无效,为任意值
	 * @param cbListen 服务回调,如有设备正常连接并发起注册,则通过该回调通知用户
	 * @return 非0成功,0失败,获取具体错误原因可调用 {@link INetSDK#GetLastError}
	 * \endif
	 */
	public static native long          ListenServer(String ip, short port, int timeOut, CB_fServiceCallBack cbListen);
	
	/**
	 * \if ENGLISH_LANG
	 * stop service
	 * @param lServerHandle  {@link INetSDK#ListenServer} return value
	 * @return true:success, false:failed
	 * \else
	 * 停止监听
	 * @param lServerHandle {@link INetSDK#ListenServer} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       StopListenServer(long lServerHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm upload function, start monitoring service, currently only achieved alarm monitoring function
	 * @param port  start monitoring port 
	 * @param ip bingding IP,if it is NULL, bing all legal IP in device
	 * @param timeOut server maintenance connection overtime 
	 * @param pfscb server info recall interface 
	 * @return successful return to server handle,failed return to 0. 
	 * \else
	 * 报警上传功能,启动服务
	 * @param port  启动监听的端口
	 * @param ip 绑定的IP,为NULL时绑定本机所有合法IP 
	 * @param timeOut 服务器维护连接的超时时间
	 * @param pfscb 服务器的消息回调接口 
	 * @return 成功返回服务器句柄,失败返回0
	 * \endif
	 * @see {@link INetSDK#StopService}
	 */
	public static native long          StartService(short port, String ip, int timeOut, CB_fServiceCallBack pfscb);
	
	/**
	 * \if ENGLISH_LANG
	 * stop port minitoring service
	 * @param lHandle  turn off server handle, {@link INetSDK#StartService} return value
	 * @return true:success, false:failed
	 * \else
	 * 停止服务 
	 * @param lHandle  要关闭的服务器的句柄,{@link INetSDK#StartService}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       StopService(long lHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * Set work pattern about talk mode、playback、power and so on
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType  enumeration value, refer to {@link EM_USEDEV_MODE}
	 * @param pValue when type is {@link EM_USEDEV_MODE#SDK_TALK_ENCODE_TYPE},this value is structure {@link SDKDEV_TALKDECODE_INFO} data \n
	 * when type is {@link EM_USEDEV_MODE#SDK_TALK_SPEAK_PARAM},this value is structure {@link NET_SPEAK_PARAM} data \n
	 * when type is {@link EM_USEDEV_MODE#SDK_RECORD_TYPE},this value is structure {@link NET_RECORD_TYPE} data \n
	 * when type is {@link EM_USEDEV_MODE#SDK_TALK_MODE3},this value is structure {@link NET_TALK_EX} data \n
	 * @return true:success, false:failed
	 * \else
	 * 设置语音对讲模式,客户端方式还是服务器方式
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType  枚举值,详见 {@link EM_USEDEV_MODE}
	 * @param pValue 当类型为 {@link EM_USEDEV_MODE#SDK_TALK_ENCODE_TYPE} 时,此值为结构体 {@link SDKDEV_TALKDECODE_INFO} 数据 \n
	 * 当类型为 {@link EM_USEDEV_MODE#SDK_TALK_SPEAK_PARAM} 时,此值为结构体 {@link NET_SPEAK_PARAM} 数据 \n
	 * 当类型为 {@link EM_USEDEV_MODE#SDK_RECORD_TYPE} 时,此值为结构体 {@link NET_RECORD_TYPE} 数据\n
	 * 当类型 {@link EM_USEDEV_MODE#SDK_TALK_MODE3} 时,此值为结构体 {@link NET_TALK_EX} 数据\n
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#QueryDevState}
	 */
	public static native boolean       SetDeviceMode(long lLoginID, int emType, Object pValue);
	
	/**
	 * \if ENGLISH_LANG
	 * require bidirectional talk from device
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pfcb user customized data recall interface
	 * @return successful return to device bidiractional talk handle,failed return to 0
	 * \else
	 * 打开语音对讲
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pfcb 用户自定义的数据回调接口
	 * @return 成功返回和设备对讲的句柄,失败返回0
	 * \endif
	 */
	public static native long          StartTalkEx(long lLoginID, CB_pfAudioDataCallBack pfcb);


	//
	public static native boolean	  GetTalkDirection(long lTalkHandle, EM_TALK_DIRECTION pDirection);
	/**
	 * \if ENGLISH_LANG
	 * send user's audio data to device,here info can be data called from StartTalkEx's recall interface
	 * @param lTalkHandle {@link INetSDK#StartTalkEx} return value
	 * @param pSendBuf audio data to be sent 
	 * @return successful return to data length sent actually to device, failed return to -1
	 * \else
	 * 发送语音数据到设备
	 * @param lTalkHandle {@link INetSDK#StartTalkEx}的返回值
	 * @param pSendBuf 要发送的音频数据
	 * @return 成功时返回实际传输给设备的数据长度,失败返回-1
	 * \endif
	 */
	public static native int           TalkSendData(long lTalkHandle, byte pSendBuf[]);
	
	/**
	 * \if ENGLISH_LANG
	 * stop bidirectional talk
	 * @param lTalkHandle  bidirectional talk handle {@link INetSDK#StartTalkEx} return value
	 * @return true:success, false:failed
	 * \else
	 * 停止语音对讲
	 * @param lTalkHandle  语音对讲句柄,{@link INetSDK#StartTalkEx}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       StopTalkEx(long lTalkHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * search log extension interface,independent search by type
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param logType log buffering area, refer to  {@link SDK_LOG_QUERY_TYPE} 
	 * @param pLogBuffer  log buffering area,if reserved is vacant,structure {@link SDK_LOG_ITEM}. reserved not vacant,return {@link SDK_NEWLOG_ITEM}
	 * @param nLogBufferlen returned log length(unit byte) 
	 * @param reserved when DWORD dwType = 1, reserved = &dwType,use XML format to search log.(currently only device model in LB-U support) 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * 查询设备日志, 扩展接口,可选择日志类型
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param logType 日志类型,见枚举 {@link SDK_LOG_QUERY_TYPE}
	 * @param pLogBuffer  日志缓冲区,如果 reserved 为空,结构体 {@link SDK_LOG_ITEM} ,reserved 不为空,返回 {@link SDK_NEWLOG_ITEM}
	 * @param nLogBufferlen 返回的日志长度(单位字节) 
	 * @param reserved 当DWORD dwType = 1, reserved = &dwType时,以XML格式查询日志信息(目前仅LB-U中的设备型号支持) 
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       QueryLogEx(long lLoginID, int logType, SDK_NEWLOG_ITEM pLogBuffer[], Integer nLogBufferlen, Integer reserved, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search record status
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pRSBuffer record status buffering area,total length no fewer than total channel number,return value meaning as follows. 
	 * @param nRSBufferlen return record status info length. each channel is 1 byte
	 * @param waittime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 查道通道录像状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pRSBuffer 录像状态缓冲区,总长度不能小于通道数, 0：不录像；1：手动录像；2：自动录像
	 * @param nRSBufferlen 返回录像状态信息长度,每一个通道为1个字节
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#SetupRecordState}
	 */
	public static native boolean       QueryRecordState(long lLoginID, byte pRSBuffer[], Integer nRSBufferlen, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * receive flow statistics, get flow between previous calls of this statistics flow. Each call set historical flow to 0
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param lPlayHandle paly ID,may be real time playing IDID,preview ID or network playback ID,when it is 0, recieve total flow of device 
	 * @return successful return to flow value,failed return to -1. 
	 * \else
	 * 获取通道码流
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param lPlayHandle  播放ID,可以是实时播放ID,预览ID或者是网络回放ID,当为0时得到设备的总流量 
	 * @return 成功返回流量值,失败返回-1
	 * \endif
	 */
	public static native int           GetStatiscFlux(long lLoginID, long lPlayHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * reboot front end device
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @return true:success, false:failed
	 * \else
	 * 重启设备
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       RebootDev(long lLoginID);
	
	/**
	 * \if ENGLISH_LANG
	 * turn off front end device
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @return true:success, false:failed
	 * \else
	 * 关闭设备
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       ShutDownDev(long lLoginID);
	
	/**
	 * \if ENGLISH_LANG
	 * remotely control device
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param type control type
	 * control parameter, depending on type(refer to  CtrlType):
	 * <table>
	 * <tr><td>type</td><td>description</td><td>structure </td></tr>      
	 * <tr><td>SDK_CTRL_REBOOT</td><td>reboot device</td><td>n/a</td></tr>
	 * <tr><td>SDK_CTRL_SHUTDOWN</td><td>device off</td><td>n/a</td></tr>
	 * <tr><td>SDK_CTRL_DISK</td><td>hard disk management</td><td>DISKCTRL_PARAM</td></tr>
	 * <tr><td>SDK_KEYBOARD_POWER<-->SDK_KEYBOARD_JMPUP</td><td>network keyboard</td><td>n/a</td></tr>
	 * <tr><td>SDK_TRIGGER_ALARM_IN</td><td>trigger alarm input</td><td>ALARMCTRL_PARAM</td></tr>
	 * <tr><td>SDK_TRIGGER_ALARM_OUT</td><td>trigger alarm output</td><td>ALARMCTRL_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_MATRIX</td><td>matrix control</td><td>MATRIXCTRL_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_SDCARD</td><td>SD card control(IPC product)parameter same with hard disk control</td><td>DISKCTRL_PARAM</td></tr>
	 * <tr><td>SDK_BURNING_START</td><td>writer control,start to write</td><td>BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_STOP</td><td>writer control,end writing</td><td>BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_ADDPWD</td><td>writer control, stack code (character string ending in'\0',max length is 8 digits)</td><td>char*</td></tr>
	 * <tr><td>SDK_BURNING_ADDHEAD</td><td>writer control,stack opening(character string ending in'\0',max length is 1023 bytes, support text wrap with'\n')</td><td>char*</td></tr>
	 * <tr><td>SDK_BURNING_ADDSIGN</td><td>writer control,stack dot to writing info</td><td>n/a  </td></tr>
	 * <tr><td>SDK_BURNING_ADDCURSTOMINFO</td><td>writer control,customized stack(character string ending in'\0',max length is 1023 bytes, support text wrap with'\n')s</td><td>char*</td></tr>
	 * <tr><td>SDK_BURNING_ATTACH</td><td>writer control,attachment writing</td><td>BURNING_PARM_ATTACH</td></tr>
	 * <tr><td>SDK_BURNING_PAUSE</td><td>writing pause</td><td>BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_CONTINUE</td><td>writing continue</td><td>BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_POSTPONE</td><td>writing postpone</td><td>BURNNG_PARM</td></tr>
	 * <tr><td>SDK_CTRL_OEMCTRL</td><td>stop control</td><td>BOOL*</td></tr>
	 * <tr><td>SDK_CTRL_RESTOREDEFAULT</td><td>restore default settings</td><td>DWORD*</td></tr>
	 * <tr><td>SDK_CTRL_CAPTURE_START</td><td>trigger snapshot</td><td>NET_SNAP_COMMANDINFO</td></tr>
	 * <tr><td>SDK_CTRL_CLEARLOG</td><td>delete log</td><td>SDK_LOG_QUERY_TYPE</td></tr>
	 * <tr><td>SDK_TRIGGER_ALARM_WIRELESS</td><td>trigger wireless alarm(IPC product)</td><td>ALARMCTRL_PARAM</td></tr>
	 * <tr><td>SDK_MARK_IMPORTANT_RECORD</td><td>mark important video file</td><td>NET_RECORDFILE_INFO</td></tr>
	 * <tr><td>SDK_CTRL_DISK_SUBAREA</td><td>network hard disk segmentation</td><td>DISKCTRL_SUBAREA</td></tr>
	 * <tr><td>SDK_BACKUP_START</td><td>device backup start</td><td>BACKUP_RECORD</td></tr>
	 * <tr><td>SDK_BACKUP_STOP</td><td> device backup stop</td><td>char*</td></tr>
	 * <tr><td>SDK_VIHICLE_WIFI_ADD</td><td>mobile manually add WIFI config</td><td>SDKDEV_VEHICLE_WIFI_CONFIG</td></tr>
	 * <tr><td>SDK_VIHICLE_WIFI_DEC</td><td>mobile manually delete WIFI config</td><td>SDKDEV_VEHICLE_WIFI_CONFIG</td></tr>
	 * <tr><td>SDK_BUZZER_START</td><td>buzzer control start</td><td>n/a</td></tr>
	 * <tr><td>SDK_BUZZER_STOP</td><td> buzzer control end</td><td>n/a</td></tr>
	 * <tr><td>SDK_REJECT_USER</td><td>reject user</td><td>SDKDEV_REJECT_USER</td></tr>
	 * <tr><td>SDK_SHIELD_USER</td><td>block user</td><td>SDKDEV_SHIELD_USER</td></tr>
	 * <tr><td>SDK_RAINBRUSH</td><td>intelligent traffic, windshield wiper control</td><td>n/a</td></tr>
	 * <tr><td>SDK_MANUAL_SNAP</td><td>intelligent traffic, manual snapshot</td><td>MANUAL_SNAP_PARAMETER</td></tr>
	 * <tr><td>SDK_MANUAL_NTP_TIMEADJUST</td><td>manual NTP calibration</td><td>n/a   </td></tr>   
	 * <tr><td>SDK_NAVIGATION_SMS</td><td>navigation info and sms</td><td>SDKDEV_NAVIGATION_SMSS</td></tr>
	 * <tr><td>SDK_CTRL_ROUTE_CROSSING</td><td>path info</td><td>ROUTE_CROSSING_INFO</td></tr>
	 * <tr><td>SDK_BACKUP_FORMAT</td><td>format backup device, backup device name character string</td><td>char*</td></tr>
	 * <tr><td>SDK_DEVICE_LOCALPREVIEW_SLIPT</td><td>control device port local preview splicing</td><td>DEVICE_LOCALPREVIEW_SLIPT_PARAMETER</td></tr>
	 * <tr><td>SDK_CTRL_INIT_RAID</td><td>RAID initialization,Raid name character string</td><td>char*</td></tr>
	 * <tr><td>SDK_CTRL_RAID RAID</td><td>RAID operation</td><td>CTRL_RAID_INFO</td></tr>
	 * <tr><td>SDK_CTRL_SAPREDISK</td><td>hot backup operation</td><td>CTRL_SPARE_DISK_INFO_A</td></tr>
	 * <tr><td>SDK_WIFI_CONNECT</td><td>manually initiate WIFI connection</td><td>WIFI_CONNECT</td></tr>
	 * <tr><td>SDK_WIFI_DISCONNECT</td><td> manually disconnect WIFI connection</td><td>WIFI_CONNECT</td></tr>
	 * <tr><td>SDK_CTRL_ACCESS_OPEN</td><td>access control-open/td><td>NET_CTRL_ACCESS_OPEN</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_INSERT</td><td>add records, get record set number</td><td>NET_CTRL_RECORDSET_INSERT_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_UPDATE</td><td>update recored</td><td>NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_REMOVE</td><td>remove recored</td><td>NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_CLEAR</td><td>clear all recored</td><td>NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_ACCESS_CLOSE</td><td>access control-close</td><td>NET_CTRL_ACCESS_CLOSE</td></tr>
	 * <tr><td>SDK_CTRL_STOP_ALARMBELL</td><td>manual stop alarmbell</td><td>NET_CTRL_ALARMBELL</td></tr>
	 * <tr><td>SDK_CTRL_START_ALARMBELL</td><td>manual start alarmbell </td><td>NET_CTRL_ALARMBELL</td></tr>
	 * <tr><td>SDK_CTRL_START_ALARMBELL</td><td>start to play audio's file </td><td>NET_CTRL_START_PLAYAUDIO</td></tr>
	 * <tr><td>SDK_CTRL_STOP_PLAYAUDIO</td><td>stop to play audio's file</td><td>NET_CTRL_START_PLAYAUDIO</td></tr>
	 * <tr><td>SDK_CTRL_ACCESS_OPEN</td><td>access control-forced to open</td><td>NET_CTRL_ACCESS_OPEN</td></tr>
	 * <tr><td>SDK_CTRL_CLEAR_ALARM</td><td>confirm alarm, and close</td><td>NET_CTRL_CLEAR_ALARM</td></tr>
	 * <tr><td>SDK_CTRL_ARMED</td><td>protecte or removal</td><td>CTRL_ARM_DISARM_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_SET_BYPASS</td><td>set bypass </td><td>NET_CTRL_SET_BYPASS</td></tr>
	 * </table>
	 * @param param
	 * @param waittime overtime of waiting device back 
	 * @return true:success, false:failed
	 * \else
	 * 设备控制
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param type 控制类型\n
	 * 控制参数,根据type不同而不同(参考  CtrlType):
	 * <table>
	 * <tr><td>type</td><td>描述  </td><td>结构体         </td></tr>
	 * <tr><td>SDK_CTRL_REBOOT</td><td>重启设备</td><td>  无</td></tr>
	 * <tr><td>SDK_CTRL_SHUTDOWN</td><td>关闭设备 </td><td> 无</td></tr>
	 * <tr><td>SDK_CTRL_DISK</td><td>硬盘管理 </td><td>DISKCTRL_PARAM</td></tr>
	 * <tr><td>SDK_KEYBOARD_POWER<-->SDK_KEYBOARD_JMPUP</td><td>网络键盘</td><td>无</td></tr>
	 * <tr><td>SDK_TRIGGER_ALARM_IN</td><td>触发报警输入</td><td> ALARMCTRL_PARAM</td></tr>
	 * <tr><td>SDK_TRIGGER_ALARM_OUT</td><td>触发报警输出 </td><td>ALARMCTRL_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_MATRIX</td><td>矩阵控制 </td><td>MATRIXCTRL_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_SDCARD</td><td>SD卡控制(IPC产品)参数同硬盘控制</td><td>DISKCTRL_PARAM</td></tr>
	 * <tr><td>SDK_BURNING_START</td><td>刻录机控制,开始刻录 </td><td>BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_STOP</td><td>刻录机控制,结束刻录</td><td> BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_ADDPWD</td><td>刻录机控制,叠加密码(以'\0'为结尾的字符串,最大长度8位)</td><td>char*</td></tr>
	 * <tr><td>SDK_BURNING_ADDHEAD</td><td>刻录机控制,叠加片头(以'\0'为结尾的字符串,最大长度1023字节,支持分行,行分隔符)</td><td>char*</td></tr>
	 * <tr><td>SDK_BURNING_ADDSIGN</td><td>刻录机控制,叠加打点到刻录信息 </td><td>无   </td></tr>
	 * <tr><td>SDK_BURNING_ADDCURSTOMINFO</td><td>刻录机控制,自定义叠加(以'\0'为结尾的字符串,最大长度1023字节,支持分行,行分隔符)</td><td>char*</td></tr>
	 * <tr><td>SDK_BURNING_ATTACH</td><td>刻录机控制,附件刻录</td><td> BURNING_PARM_ATTACH</td></tr>
	 * <tr><td>SDK_BURNING_PAUSE</td><td>录暂停</td><td> BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_CONTINUE</td><td>刻录继续  </td><td>BURNNG_PARM</td></tr>
	 * <tr><td>SDK_BURNING_POSTPONE</td><td>刻录顺延 </td><td> BURNNG_PARM</td></tr>
	 * <tr><td>SDK_CTRL_OEMCTRL</td><td>报停控制</td><td>BOOL*</td></tr>
	 * <tr><td>SDK_CTRL_RESTOREDEFAULT</td><td>恢复设备的默认设置 </td><td>DWORD*</td></tr>
	 * <tr><td>SDK_CTRL_CAPTURE_START</td><td>触发设备抓图</td><td> NET_SNAP_COMMANDINFO</td></tr>
	 * <tr><td>SDK_CTRL_CLEARLOG</td><td>清除日志</td><td>SDK_LOG_QUERY_TYPE</td></tr>
	 * <tr><td>SDK_TRIGGER_ALARM_WIRELESS</td><td>触发无线报警(IPC产品)</td><td> ALARMCTRL_PARAM</td></tr>
	 * <tr><td>SDK_MARK_IMPORTANT_RECORD</td><td>标识重要录像文件</td><td>NET_RECORDFILE_INFO</td></tr>
	 * <tr><td>SDK_CTRL_DISK_SUBAREA</td><td>网络硬盘分区</td><td>DISKCTRL_SUBAREA</td></tr>
	 * <tr><td>SDK_BACKUP_START</td><td> 设备备份开始</td><td>BACKUP_RECORD</td></tr>
	 * <tr><td>SDK_BACKUP_STOP</td><td> 设备备份停止</td><td>char*</td></tr>
	 * <tr><td>SDK_VIHICLE_WIFI_ADD</td><td>车载手动增加WIFI配置 </td><td>SDKDEV_VEHICLE_WIFI_CONFIG</td></tr>
	 * <tr><td>SDK_VIHICLE_WIFI_DEC </td><td> 车载手动删除WIFI配置  </td><td>SDKDEV_VEHICLE_WIFI_CONFIG</td></tr>
	 * <tr><td>SDK_BUZZER_START</td><td> 蜂鸣器控制开始  </td><td> 无</td></tr>
	 * <tr><td>SDK_BUZZER_STOP</td><td>蜂鸣器控制结束 </td><td>  无</td></tr>
	 * <tr><td>SDK_REJECT_USER</td><td>剔除用户</td><td>SDKDEV_REJECT_USER</td></tr>
	 * <tr><td>SDK_SHIELD_USER</td><td> 屏蔽用户</td><td>SDKDEV_SHIELD_USER</td></tr>
	 * <tr><td>SDK_RAINBRUSH</td><td>智能交通, 雨刷控制</td><td>无</td></tr>
	 * <tr><td>SDK_MANUAL_SNAP</td><td>智能交通, 手动抓拍 </td><td> MANUAL_SNAP_PARAMETER</td></tr>
	 * <tr><td>SDK_MANUAL_NTP_TIMEADJUST</td><td>手动NTP校时</td><td> 无 </td></tr>     
	 * <tr><td>SDK_NAVIGATION_SMS</td><td> 导航信息和短消息</td><td>SDKDEV_NAVIGATION_SMSS</td></tr>
	 * <tr><td>SDK_CTRL_ROUTE_CROSSING</td><td>路线点位信息</td><td> ROUTE_CROSSING_INFO</td></tr>
	 * <tr><td>SDK_BACKUP_FORMAT</td><td>格式化备份设备,备份设备名称字符串 </td><td>char*</td></tr>
	 * <tr><td>SDK_DEVICE_LOCALPREVIEW_SLIPT</td><td>控制设备端本地预览分割</td><td>  DEVICE_LOCALPREVIEW_SLIPT_PARAMETER</td></tr>
	 * <tr><td>SDK_CTRL_INIT_RAID</td><td>RAID初始化,Raid名称字符串 </td><td>char*</td></tr>
	 * <tr><td>SDK_CTRL_RAID RAID</td><td>操作</td><td>CTRL_RAID_INFO</td></tr>
	 * <tr><td>SDK_CTRL_SAPREDISK</td><td>热备盘操作  </td><td> CTRL_SPARE_DISK_INFO_A</td></tr>
	 * <tr><td>SDK_WIFI_CONNECT</td><td>手动发起WIFI连接 </td><td> WIFI_CONNECT</td></tr>
	 * <tr><td>SDK_WIFI_DISCONNECT</td><td>手动断开WIFI连接 </td><td>WIFI_CONNECT</td></tr>
	 * <tr><td>SDK_CTRL_ACCESS_OPEN </td><td>门禁控制-开门 </td><td> NET_CTRL_ACCESS_OPEN</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_INSERT</td><td>添加记录,获得记录集编号</td><td>  NET_CTRL_RECORDSET_INSERT_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_UPDATE</td><td>更新某记录集编号的记录  </td><td>NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_REMOVE</td><td>根据记录集编号删除某记录</td><td> NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_RECORDSET_CLEAR</td><td>清除所有记录集信息</td><td> NET_CTRL_RECORDSET_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_ACCESS_CLOSE</td><td>门禁控制-关门</td><td>NET_CTRL_ACCESS_CLOSE</td></tr>
	 * <tr><td>SDK_CTRL_STOP_ALARMBELL</td><td>手动关闭警号</td><td> NET_CTRL_ALARMBELL</td></tr>
	 * <tr><td>SDK_CTRL_START_ALARMBELL</td><td>手动开启警号</td><td> NET_CTRL_ALARMBELL</td></tr>
	 * <tr><td>SDK_CTRL_START_ALARMBELL</td><td>开始播放音频文件  </td><td>NET_CTRL_START_PLAYAUDIO</td></tr>
	 * <tr><td>SDK_CTRL_STOP_PLAYAUDIO</td><td>停止播放音频文件 </td><td>NET_CTRL_START_PLAYAUDIO</td></tr>
	 * <tr><td>SDK_CTRL_ACCESS_OPEN</td><td>门禁控制-强制开门 </td><td>NET_CTRL_ACCESS_OPEN</td></tr>
	 * <tr><td>SDK_CTRL_CLEAR_ALARM </td><td>消警 </td><td>NET_CTRL_CLEAR_ALARM</td></tr>
	 * <tr><td>SDK_CTRL_ARMED</td><td>布防撤防</td><td>CTRL_ARM_DISARM_PARAM</td></tr>
	 * <tr><td>SDK_CTRL_SET_BYPASS</td><td>设置旁路 </td><td>NET_CTRL_SET_BYPASS</td></tr>
	 * <tr><td>SDK_CTRL_RAINBRUSH_MOVEONCE</td><td>雨刷来回刷一次 </td><td>NET_CTRL_RAINBRUSH_MOVEONCE</td></tr>
	 * <tr><td>SDK_CTRL_RAINBRUSH_MOVECONTINUOUSLY</td><td>雨刷来回循环刷 </td><td>NET_CTRL_RAINBRUSH_MOVECONTINUOUSLY</td></tr>
	 * <tr><td>SDK_CTRL_RAINBRUSH_STOPMOVE</td><td>雨刷停止刷 </td><td>NET_CTRL_RAINBRUSH_STOPMOVE</td></tr>
	 * </table>
	 * @param param
	 * @param waittime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       ControlDevice(long lLoginID, int type, Object param, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * remotely control device-extend
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType control type, refer to 参考  {@link CtrlType}
	 * @param pInBuf device control input buffer
	 * @param pOutBuf device control output buffer
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 设备控制-扩展
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType 控制类型, 参考  {@link CtrlType}
	 * @param pInBuf 设备控制输入缓存 
	 * @param pOutBuf 设备控制输出缓存 
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       ControlDeviceEx(long lLoginID, int emType, Object pInBuf, Object pOutBuf, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * set record status
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pRSBuffer record status buffer, the total length is the channel number, the data definition in the buffer table as:
	 * 0 not record \n
	 * 1 manually record \n 
	 * 2 auto record \n
	 * @return true:success, false:failed
	 * \else
	 * 设置通道录像状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pRSBuffer 录像状态缓冲区,总长度为通道个数,  0：不录像；1：手动录像；2：自动录像
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#QueryRecordState}
	 */
	public static native boolean       SetupRecordState(long lLoginID, byte pRSBuffer[]);
	
	/**
	 * \if ENGLISH_LANG
	 * receive device IO status
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType IO tyoe,as {@link SDK_IOTYPE}
	 * @param objArr status buffering area,based on different IO type to different data structure group 
	 * @param nIOCount output parameter,received data IO quantity 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * 查询IO状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType IO类型,参见 {@link SDK_IOTYPE}
	 * @param objArr 状态缓冲区,根据不同的IO类型可以是不同的数据结构数组
	 * @param nIOCount 输出参数,取得状态的IO数量
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 * @see  {@link INetSDK#IOControl}
	 */
	public static native boolean       QueryIOControlState(long lLoginID, int emType, Object[] objArr, Integer nIOCount, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * set IO status,may set for one IO,also may set for multiples
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType IO type: refer to {@link SDK_IOTYPE}
	 * <table>
	 * <tr><td>emType</td><td>meaning</td><td>corresponding structure</td></tr>
	 * <tr><td>SDK_ALARMINPUT</td><td>control alarm input</td><td>ALARM_CONTROL </td></tr>
	 * <tr><td>SDK_ALARMOUTPUT</td><td>control alarm output</td><td>ALARM_CONTROL</td></tr>
	 * <tr><td>SDK_DECODER_ALARMOUT</td><td>control alarm decoder output</td><td>DECODER_ALARM_CONTROL </td></tr>
	 * <tr><td>SDK_ALARM_TRIGGER_MODE</td><td>alarm trigger method</td><td>TRIGGER_MODE_CONTROL</td></tr>
	 * </table>
	 * @param objArr status buffering area,group various among different IO types
	 * @return true:success, false:failed
	 * \else
	 * IO控制
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType IO类型, 参考 {@link SDK_IOTYPE}
	 * <table>
	 * <tr><td>emType</td><td>查询类型</td><td>  对应结构体 </td></tr>
	 * <tr><td>SDK_ALARMINPUT</td><td>报警输入是否已经打开</td><td>ALARM_CONTROL</td></tr> 
	 * <tr><td>SDK_ALARMOUTPUT</td><td>报警输出是否已经打开</td><td>ALARM_CONTROL </td></tr>
	 * <tr><td>SDK_DECODER_ALARMOUT</td><td>报警解码器输出	</td><td>DECODER_ALARM_CONTROL</td></tr> 
	 * <tr><td> SDK_ALARM_TRIGGER_MODE </td><td>报警触发方式 </td><td>TRIGGER_MODE_CONTROL </td></tr>
	 * </table>
	 * @param objArr 状态缓冲区,根据不同的IO类型可以是不同的数据结构数组
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       IOControl(long lLoginID, int emType, Object[] objArr);
	
	/**
	 * \if ENGLISH_LANG
	 * forced I frame interface
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelID channel id
	 * @param nSubChannel stream type,0-main stream 1-1 2-extra stream2 3 –extra stream 3
	 * @return true:success, false:failed
	 * \else
	 * 强制I帧
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelID 通道id 
	 * @param nSubChannel 码流类型,0-主码流 1-辅码流1 2-辅码流2 3 –辅码流3
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       MakeKeyFrame(long lLoginID, int nChannelID, int nSubChannel);
	
	/**
	 * \if ENGLISH_LANG
	 * search user info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param info user info buffering,should be sent into one USER_MANAGE_INFO structure pointer with allocated memory；return each user info USER_INFO password text is encrypted 
	 * @param waittime waiting time  
	 * @return true:success, false:failed
	 * \else
	 * 查询用户信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param info 用户信息缓存,应传进一个已分配好内存的USER_MANAGE_INFO结构指针；返回各用户信息USER_INFO中的password字段是加过密的
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		QueryUserInfo(long lLoginID, USER_MANAGE_INFO info, int waittime);
		
	/**
	 * \if ENGLISH_LANG
	 * search user info, extension interface, support 16 bit password length；as well as 8 bit username and 8 bit password length
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param info user info buffering,should send into an allocated memory {@link USER_MANAGE_INFO_EX} structure pointer, return to user info {@link USER_INFO_EX} password text is encrypted
	 * @param waittime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 查询用户信息--扩展
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param info 用户信息缓存,应传进一个已分配好内存的 {@link USER_MANAGE_INFO_EX} 结构指针, 返回各用户信息 {@link USER_INFO_EX} 中的password字段是加过密的
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#OperateUserInfoEx}
	 */
	public static native boolean       QueryUserInfoEx(long lLoginID, USER_MANAGE_INFO_EX info, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search user info, support up to 64-ch devices
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param info user info buffering,should send into an allocated memory  {@link USER_MANAGE_INFO_NEW} structure pointer, return to user info {@link USER_MANAGE_INFO_NEW} password text is encrypted
	 * @param waittime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 查询用户信息--最大支持64通道设备
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param info 用户信息缓存,应传进一个已分配好内存的 {@link USER_MANAGE_INFO_NEW} 结构指针, 返回各用户信息 {@link USER_MANAGE_INFO_NEW} 中的password字段是加过密的
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#OperateUserInfoNew}
	 */
	public static native boolean		QueryUserInfoNew(long lLoginID, USER_MANAGE_INFO_NEW info , int waittime);

	/**
	 * \if ENGLISH_LANG
	 * set user info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nOperateType operation types as follows:
	 * <table>
	 * <tr><td>value</td><td>peration type</td><td>opParam corresponding structure type</td><td>subParam corresponding structure type</td></tr>
	 * <tr><td>0</td><td>add user group</td><td>USER_GROUP_INFO</td><td> </td></tr>
	 * <tr><td>1</td><td>delete user group</td><td>USER_GROUP_INFO</td><td>  </td></tr>
	 * <tr><td>2</td><td>edit user group</td><td>USER_GROUP_INFO</td><td>USER_GROUP_INFO </td></tr>
	 * <tr><td>3</td><td>add user</td><td>USER_INFO</td><td> </td><td> </td></tr>
	 * <tr><td>4</td><td>delete user</td><td>USER_INFO</td><td>   </td></tr>
	 * <tr><td>5</td><td>edit user</td><td>USER_INFO</td><td>USER_INFO </td></tr>
	 * <tr><td>6</td><td>edit user password</td><td>USER_INFO</td><td>USER_INFO </td></tr>
	 * </table>
	 * @param opParam set user info's input buffering,具detaield as above nOperateType 
	 * @param subParam set user info's assist input buffering,when setting type is editing info, here should send original user info,details as above nOperateType 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * 操作设备用户
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nOperateType 操作类型
	 * <table>
	 * <tr><td>数值 </td><td>操作类型 </td><td>opParam对应结构体类型</td><td>subParam对应结构体类型 </td></tr>
	 * <tr><td>0</td><td>增加用户组</td><td>USER_GROUP_INFO</td><td>   </td></tr>
	 * <tr><td>1</td><td>删除用户组</td><td>USER_GROUP_INFO</td><td>  </td></tr>
	 * <tr><td>2</td><td>修改用户组</td><td>USER_GROUP_INFO</td><td>USER_GROUP_INFO </td></tr>
	 * <tr><td>3</td><td>增加用户</td><td>USER_INFO</td><td>   </td></tr>
	 * <tr><td>4</td><td>删除用户</td><td>USER_INFO</td><td>   </td></tr>
	 * <tr><td>5</td><td>修改用户</td><td>USER_INFO</td><td>USER_INFO </td></tr>
	 * <tr><td>6</td><td>修改用户密码</td><td> USER_INFO	</td><td>USER_INFO </td></tr>
	 * </table>
	 * @param opParam 设置用户信息的输入缓冲
	 * @param subParam 设置用户信息的辅助输入缓冲,当设置类型为修改信息的时候,此处应传进来部分原始用户信息
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#QueryUserInfo}
	 */
	public static native boolean       OperateUserInfo(long lLoginID, int nOperateType, Object opParam, Object subParam, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * set user info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nOperateType operation type, as OperateUserInfo
	 * @param opParam set user info's input buffering, details as above nOperateType 
	 * @param subParam set user info's assist input buffering, when setting type is editing info, here should send original user info, details as above nOperateType 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * 操作设备用户--扩展
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nOperateType 操作类型,同 OperateUserInfo
	 * @param opParam 置用户信息的输入缓冲
	 * @param subParam 设置用户信息的辅助输入缓冲,当设置类型为修改信息的时候,此处应传进来部分原始用户信息
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#QueryUserInfoEx}
	 */
	public static native boolean       OperateUserInfoEx(long lLoginID, int nOperateType, Object opParam, Object subParam, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * set user info, operation device user,max support 64-ch devices
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nOperateType operation type, as OperateUserInfo
	 * @param opParam set user info's input buffering, details as abovenOperateType 
	 * @param subParam set user info's assist input buffering, when setting type is editing info, here should send original user info, details as abovenOperateType 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * 操作设备用户--最大支持64通道设备
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nOperateType 操作类型,同 OperateUserInfo
	 * @param opParam 置用户信息的输入缓冲
	 * @param subParam 设置用户信息的辅助输入缓冲,当设置类型为修改信息的时候,此处应传进来部分原始用户信息
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#QueryUserInfoNew}
	 */
	public static native boolean       OperateUserInfoNew(long lLoginID, int nOperateType, Object opParam, Object subParam , int waittime);

	/**
	 * \if ENGLISH_LANG
	 * create transparent serial channel, change front-end device serial to transparent channel status
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param TransComType serial type 0:serial 1:485 port
	 * @param baudrate serial baud rate,1~8 as 1200,2400,4800,9600,19200,38400,57600,115200 respectively
	 * @param databits  serial data digit 4~8 represent 4~8 digits
	 * @param stopbits serial stop digit 1 represent 1 digit, 2 represent 1-5 digit(s), 3 represent 2 digits 
	 * @param parity serial inspection digit,1:odd,2:even,3: none 
	 * @param cbTransCom serial data recall, recall info sent from front-end device 
	 * @return true:success, false:failed
	 * \else
	 * 创建透明串口通道
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param TransComType 串口类型 0:串口1:485口 
	 * @param baudrate 串口的波特率,1~8分别表示1200,2400,4800,9600,19200,38400,57600,115200
	 * @param databits  串口的数据位4~8表示4位~8位 
	 * @param stopbits 串口的停止位1表示1位,2表示1.5位,3表示2位
	 * @param parity 串口的停止位1表示1位,2表示1.5位,3表示2位
	 * @param cbTransCom 串口数据回调,回调出前端设备发过来的信息
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#DestroyTransComChannel}  {@link INetSDK#SendTransComData}
	 */
	public static native long          CreateTransComChannel(long lLoginID, int TransComType, int baudrate, int databits, int stopbits, int parity, CB_fTransComCallBack cbTransCom);
	
	/**
	 * \if ENGLISH_LANG
	 * send transparent serial data, as sent data to front end data
	 * @param lTransComChannel transparent serial ID,  interface {@link INetSDK#CreateTransComChannel} return value
	 * @param pBuffer transparent serial data pointer to send 
	 * @param dwBufSize transparent serial data length to send(unit:byte)
	 * @return true:success, false:failed
	 * \else
	 * 透明串口发送数据
	 * @param lTransComChannel 透明串口ID,接口 {@link INetSDK#CreateTransComChannel} 返回值
	 * @param pBuffer 要发送的透明串口数据指针 
	 * @param dwBufSize 要发送的透时串口数据长度(单位:字节)
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#DestroyTransComChannel}
	 */
	public static native boolean       SendTransComData(long lTransComChannel, byte pBuffer[], int dwBufSize);
	
	/**
	 * \if ENGLISH_LANG
	 * close transparent channel
	 * @param lTransComChannel transparent serial ID, interface {@link INetSDK#CreateTransComChannel} return value
	 * @return true:success, false:failed
	 * \else
	 * 释放通明串口通道
	 * @param lTransComChannel 透明串口ID,接口 {@link INetSDK#CreateTransComChannel} 返回值
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#SendTransComData}
	 */
	public static native boolean       DestroyTransComChannel(long lTransComChannel);
	
	/**
	 * \if ENGLISH_LANG
	 * search serial status interface
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param TransComType serial type, 0:232;1:485
	 * @param pCommState serial status interface
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 查询透明串口状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param TransComType 串口类型0:232;485
	 * @param pCommState 串口状态接口体
	 * @param nWaitTime 等待超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       QueryTransComParams(long lLoginID, int TransComType, SDK_COMM_STATE pCommState, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * read device config info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param dwCommand device config command refer to config command 
	 * <table>
	 * <tr><td>dwCommand</td><td>dwCommand corresponding</td><td>structure</td></tr>
	 * <tr><td>SDK_DEV_DEVICECFG</td><td>receive device parameter</td><td>SDKDEV_SYSTEM_ATTR_CFG </td></tr>
	 * <tr><td>SDK_DEV_NETCFG</td><td>receive network parameter</td><td>DKDEV_NET_CFG </td></tr>
	 * <tr><td>SDK_DEV_CHANNELCFG</td><td>receive image channel parameter</td><td>if lChannel is -1,means receive all channels,return SDKDEV_CHANNEL_CFG[channel_num] if lChannel is between 0 and max channel,return SDKDEV_CHANNEL_CFG</td></tr>
	 * <tr><td>SDK_DEV_RECORDCFG</td><td>receive timed video parameter</td><td>if lChannel is -1,means receive all channels,return SDKDEV_RECORD_CFG[channel_num] if lChannel is between 0 and max channel,return SDKDEV_RECORD_CFG</td></tr>
	 * <tr><td>SDK_DEV_COMMCFG</td><td>receive serial parameterreceive serial parameter</td><td>SDKDEV_COMM_CFG </td></tr>
	 * <tr><td>SDK_DEV_ALARMCFG</td><td>receive alarm arm parameter	</td><td>SDKDEV_ALARM_SCHEDULE </td></tr>
	 * <tr><td>SDK_DEV_TIMECFG</td><td>receiveDVR time</td><td>NET_TIME</td></tr> 
	 * <tr><td>SDK_DEV_PREVIEWCFG</td><td>receive preview parameter</td><td>SDKDEV_PREVIEW_CFG </td></tr>
	 * <tr><td>SDK_DEV_AUTOMTCFG</td><td>receive auto maintenance config</td><td>SDKDEV_AUTOMT_CFG </td></tr>
	 * <tr><td>SDK_DEV_VEDIO_MARTIX</td><td>receive this matrix strategy config</td><td>SDKDEV_VIDEO_MATRIX_CFG </td></tr>
	 * <tr><td>SDK_DEV_MULTI_DDNS</td><td>receive multiple ddns servers config</td><td>SDKDEV_MULTI_DDNS_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNAP_CFG</td><td>receive snapshot config</td><td>SDKDEV_SNAP_CFG</td></tr> 
	 * <tr><td>SDK_DEV_WEB_URL_CFG</td><td>receivehttp path config</td><td>SDKDEV_URL_CFG </td></tr>
	 * <tr><td>SDK_DEV_FTP_PROTO_CFG</td><td>ftp opload config</td><td>SDKDEV_FTP_PROTO_CFG </td></tr>
	 * <tr><td>SDK_DEV_INTERVIDEO_CFG</td><td>platform input config,</td><td>lchannel means platform input type	lchannel=4,means bell platform,SDKDEV_INTERVIDEO_BELL_CFG. lchannel=10,means ARGzx platform,SDKDEV_INTERVIDEO_NSS_CFG lchannel=11,means u CNC,SDKDEV_INTERVIDEO_UCOM_CFG.</td></tr>
	 * <tr><td>SDK_DEV_VIDEO_COVER</td><td>area masked config</td><td>if lChannel if -1,means receive all channels,return SDKDEV_VIDEOCOVER_CFG[channel_num]. if lChannel is between 0 and max channel,return SDKDEV_VIDEOCOVER_CFG.</td></tr>
	 * <tr><td>SDK_DEV_TRANS_STRATEGY</td><td>transmission strategy config	</td><td>SDKDEV_TRANSFER_STRATEGY_CFG </td></tr>
	 * <tr><td>SDK_DEV_DOWNLOAD_STRATEGY</td><td>video download strategy config	</td><td>SDKDEV_DOWNLOAD_STRATEGY_CFG </td></tr>
	 * <tr><td>SDK_DEV_WATERMAKE_CFG</td><td>image watermark config</td><td>if lChannelis-1,means receive all channels,return SDKDEV_WATERMAKE_CFG[channel_num]. if lChannel is between 0 and max channel, return SDKDEV_WATERMAKE_CFG.</td></tr>
	 * <tr><td>SDK_DEV_WLAN_CFG</td><td>config wi-fi info</td><td>SDKDEV_WLAN_INFO </td></tr>
	 * <tr><td>SDK_DEV_WLAN_DEVICE_CFG</td><td>search wireless device</td><td>SDKDEV_WLAN_DEVICE_LIST </td></tr>
	 * <tr><td>SDK_DEV_REGISTER_CFG</td><td>actively register parameter config</td><td>SDKDEV_REGISTER_SERVER </td></tr>
	 * <tr><td>SDK_DEV_CAMERA_CFG</td><td>camera property config</td><td>if lChannel is-1,means receive all channels,returnSDKDEV_CAMERA_CFG[channel_num]. if lChannel is between 0 and max channel, returnSDKDEV_CAMERA_CFG.</td></tr>
	 * <tr><td>SDK_DEV_INFRARED_CFGIR</td><td>alarm parameter</td><td>SDK_INFRARED_CFG </td></tr>
	 * <tr><td>SDK_DEV_MAIL_CFG</td><td>mail config	</td><td>SDKDEV_MAIL_CFG </td></tr>
	 * <tr><td>SDK_DEV_DNS_CFG</td><td>DNS server config</td><td>SDKDEV_DNS_CFG </td></tr>
	 * <tr><td>SDK_DEV_NTP_CFG</td><td>NTP config</td><td>SDKDEV_NTP_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNIFFER_CFG</td><td>Sniffer snapshot config</td><td>SDKDEV_SNIFFER_CFG </td></tr>
	 * <tr><td>SDK_DEV_AUDIO_DETECT_CFG</td><td>audio detection alarm parameter</td><td>SDK_AUDIO_DETECT_CFG </td></tr>
	 * <tr><td>SDK_DEV_STORAGE_STATION_CFG</td><td>storage location config</td><td>if lChannelis-1,means receive all channels,return SDK_STORAGE_STATION_CFG[channel_num]. if lChannel is between 0 and max channel, return SDK_STORAGE_STATION_CFG.</td></tr>
	 * <tr><td>SDK_DEV_DST_CFG</td><td>daylight saving time config</td><td>SDKDEV_DST_CFG </td></tr>
	 * <tr><td>SDK_DEV_VIDEO_OSD_CFG</td><td>video OSD superposition config	</td><td>if lChannelis-1,means receive all channels,return SDK_DVR_VIDEOOSD_CFG[channel_num]. if lChannel is between 0 and max channel, return SDK_DVR_VIDEOOSD_CFG.</td></tr>
	 * <tr><td>SDK_DEV_ALARM_CENTER_CFG</td><td>alarm center config</td><td>ALARMCENTER_UP_CFG </td></tr>
	 * <tr><td>SDK_DEV_CDMAGPRS_CFG</td><td>CDMA \ GPRS network config</td><td>SDKDEV_CDMAGPRS_CFG </td></tr>
	 * <tr><td>SDK_DEV_IPFILTER_CFGIP</td><td>filter config	</td><td>SDKDEV_IPIFILTER_CFG </td></tr>
	 * <tr><td>SDK_DEV_TALK_ENCODE_CFG</td><td>bidirectional talk encode config</td><td>SDKDEV_TALK_ENCODE_CFG </td></tr>
	 * <tr><td>SDK_DEV_RECORD_PACKET_CFG</td><td>video packaging length config</td><td>SDKDEV_RECORD_PACKET_CFG </td></tr>
	 * <tr><td>SDK_DEV_MMS_CFG</td><td>sms MMSconfig</td><td>SDKDEV_MMS_CFG </td></tr>
	 * <tr><td>SDK_DEV_SMSACTIVATION_CFG</td><td>sms activate wireless connection config</td><td>SDKDEV_SMSACTIVATION_CFG </td></tr>
	 * <tr><td>SDK_DEV_DIALINACTIVATION_CFG</td><td>dial activate wireless connection config</td><td>SDKDEV_DIALINACTIVATION_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNIFFER_CFG_EX</td><td>network snapshot config</td><td>SDK_ATM_SNIFFER_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_DOWNLOAD_RATE_CFG</td><td>download speed limit</td><td>int </td></tr>
	 * <tr><td>SDK_DEV_PANORAMA_SWITCH_CFG</td><td>full scene switch alarm config</td><td>ALARM_PANORAMA_SWITCH_CFG </td></tr>
	 * <tr><td>SDK_DEV_LOST_FOCUS_CFG</td><td>focus loss alarm config</td><td>ALARM_LOST_FOCUS_CFG </td></tr>
	 * <tr><td>SDK_DEV_ALARM_DECODE_CFG	</td><td>alarm decoder config</td><td>SDK_ALARMDEC_CFG </td></tr>
	 * <tr><td>SDK_DEV_VIDEOOUT_CFG</td><td>video output parameter config</td><td>DEV_VIDEOOUT_INFO </td></tr>
	 * <tr><td>SDK_DEV_POINT_CFG</td><td>preset point enable config</td><td>SDKDEV_POINT_CFG </td></tr>
	 * <tr><td>SDK_DEV_IP_COLLISION_CFG	</td><td>Ip conflict detection alarm config</td><td>ALARM_IP_COLLISION_CFG </td></tr>
	 * <tr><td>SDK_DEV_OSD_ENABLE_CFGOSD</td><td>superposition enable config</td><td>SDKDEV_OSD_ENABLE_CFG </td></tr>
	 * <tr><td>SDK_DEV_LOCALALARM_CFG</td><td>local alarm config</td><td>SDK_ALARMIN_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_NETALARM_CFG</td><td>network alarm config</td><td>SDK_ALARMIN_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_MOTIONALARM_CFG</td><td>dynamic detection alarm confi</td><td>SDK_MOTION_DETECT_CFG_EX</td></tr> 
	 * <tr><td>SDK_DEV_VIDEOLOSTALARM_CFG</td><td>video loss alarm config</td><td>SDK_VIDEO_LOST_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_BLINDALARM_CFG</td><td>video mask alarm config</td><td>SDK_BLIND_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_DISKALARM_CFG</td><td>hard disk alarm config</td><td>SDK_DISK_ALARM_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_NETBROKENALARM_CFG</td><td>network outage alarm config</td><td>SDK_NETBROKEN_ALARM_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_ENCODER_CFG</td><td>front-end encoder info in digital channel</td><td>DEV_ENCODER_CFG </td></tr>
	 * <tr><td>SDK_DEV_TV_ADJUST_CFG</td><td>TV adjust config</td><td>SDKDEV_TVADJUST_CFG </td></tr>
	 * <tr><td>SDK_DEV_ABOUT_VEHICLE_CFG</td><td>mobile related config,Beijing bus use</td><td>SDKDEV_ABOUT_VEHICLE_CFG </td></tr>
	 * <tr><td>SDK_DEV_ATM_OVERLAY_ABILITY</td><td>receiveatm superposition support capability info</td><td>SDKDEV_ATM_OVERLAY_GENERAL</td></tr> 
	 * <tr><td>SDK_DEV_ATM_OVERLAY_CFG</td><td>atmsuperpositionconfig, new atm specifically own</td><td>SDKDEV_ATM_OVERLAY_CONFIG </td></tr>
	 * <tr><td>SDK_DEV_DECODER_TOUR_CFG</td><td>decoder tour config	</td><td>SDKDEV_DECODER_TOUR_CFG </td></tr>
	 * <tr><td>SDK_DEV_SIP_CFG</td><td>SIPconfig</td><td>SDKDEV_SIP_CFG </td></tr>
	 * <tr><td>SDK_DEV_VICHILE_WIFI_AP_CFG</td><td>WIFI APconfig</td><td>SDKDEV_VEHICLE_SINGLE_WIFI_AP_CFG </td></tr>
	 * <tr><td>SDK_DEV_STATICALARM_CFG</td><td>statis alarm config</td><td>SDK_STATIC_DETECT_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_DECODE_POLICY_CFG</td><td>device decoding strategy config</td><td>SDKDEV_DECODEPOLICY_CFG </td></tr>
	 * <tr><td>SDK_DEV_MACHINE_CFG</td><td>device related config</td><td>SDKDEV_MACHINE_CFG </td></tr>
	 * <tr><td>SDK_DEV_MAC_COLLISION_CFG</td><td>MAC conflict detection config</td><td>ALARM_MAC_COLLISION_CFG </td></tr>
	 * <tr><td>SDK_DEV_RTSP_CFG	RTSP</td><td>config</td><td>SDKDEV_RTSP_CFG </td></tr>
	 * <tr><td>SDK_DEV_232_COM_CARD_CFG	</td><td>232 serial card NO. signal event config</td><td>COM_CARD_SIGNAL_LINK_CFG </td></tr>
	 * <tr><td>SDK_DEV_485_COM_CARD_CFG	</td><td>485 serial card NO. signal event config</td><td>COM_CARD_SIGNAL_LINK_CFG </td></tr>
	 * <tr><td>SDK_DEV_FTP_PROTO_CFG_EX</td><td>FTP upload extension config	</td><td>SDKDEV_FTP_PROTO_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_SYSLOG_REMOTE_SERVER</td><td>SYSLOG remote server config</td><td>SDKDEV_SYSLOG_REMOTE_SERVER </td></tr>
	 * <tr><td>SDK_DEV_COMMCFG_EX</td><td>extension serial property config</td><td>SDKDEV_COMM_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_NETCARD_CFG</td><td>port info config	</td><td>SDKDEV_NETCARD_CFG </td></tr>
	 * <tr><td>SDK_DEV_BACKUP_VIDEO_FORMAT</td><td>video backup format config</td><td>SDKDEV_BACKUP_VIDEO_FORMAT </td></tr>
	 * <tr><td>SDK_DEV_STREAM_ENCRYPT_CFG</td><td>strean encryption config</td><td>SDKEDV_STREAM_ENCRYPT </td></tr>
	 * <tr><td>SDK_DEV_IPFILTER_CFG_EX</td><td>strean encryption config	</td><td>SDKDEV_IPIFILTER_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_CUSTOM_CFG</td><td>user customized config</td><td>SDKDEV_CUSTOM_CFG </td></tr>
	 * <tr><td>SDK_DEV_WLAN_DEVICE_CFG_EX</td><td>search wireless device extension config</td><td>SDKDEV_WLAN_DEVICE_LIST_EX </td></tr>
	 * <tr><td>SDK_DEV_ACC_POWEROFF_CFG</td><td>ACC outage event config</td><td>SDKDEV_ACC_POWEROFF_CFG </td></tr>
	 * <tr><td>SDK_DEV_EXPLOSION_PROOF_CFG</td><td>Explosion proof box alarm event config</td><td>SDKDEV_EXPLOSION_PROOF_CFG </td></tr>
	 * <tr><td>SDK_DEV_NETCFG_EX</td><td>network extension config</td><td>SDKDEV_NET_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_LIGHTCONTROL_CFG	</td><td>light control config</td><td>SDKDEV_LIGHTCONTROL_CFG </td></tr>
	 * <tr><td>SDK_DEV_3GFLOW_CFG</td><td>3G flow info config</td><td>SDKDEV_3GFLOW_INFO_CFG </td></tr>
	 * <tr><td>SDK_DEV_IPV6_CFG</td><td>IPv6config</td><td>SDKDEV_IPV6_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNMP_CFG</td><td>Snmpconfig</td><td>SDKDEV_NET_SNMP_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNAP_CONTROL_CFG</td><td>snapshot switch config</td><td>SDKDEV_SNAP_CONTROL_CFG </td></tr>
	 * <tr><td>SDK_DEV_GPS_MODE_CFGGPS</td><td>positioning mode config	</td><td>SDKDEV_GPS_MODE_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNAP_UPLOAD_CFG</td><td>image upload config info	</td><td>SDKDEV_SNAP_UPLOAD_CFG </td></tr>
	 * <tr><td>SDK_DEV_SPEED_LIMIT_CFG</td><td>speed limit config info 	</td><td>SDKDEV_SPEED_LIMIT_CFG </td></tr>
	 * <tr><td>SDK_DEV_ISCSI_CFG</td><td>iSCSIconfig</td><td>SDKDEV_ISCSI_CFG </td></tr>
	 * <tr><td>SDK_DEV_WIRELESS_ROUTING_CFG	</td><td>wireless router config</td><td>SDKDEV_WIRELESS_ROUTING_CFG </td></tr>
	 * <tr><td>SDK_DEV_ENCLOSURE_CFG</td><td>digital fence config</td><td>SDKDEV_ENCLOSURE_CFG </td></tr>
	 * <tr><td>SDK_DEV_ENCLOSURE_VERSION_CFG</td><td>igital fence version NO. config </td><td>SDKDEV_ENCLOSURE_VERSION_CFG </td></tr>
	 * <tr><td>SDK_DEV_RIAD_EVENT_CFG</td><td>Raid event config</td><td>SDKDEV_RAID_EVENT_CFG </td></tr>
	 * <tr><td>SDK_DEV_FIRE_ALARM_CFG</td><td>fir alarm config </td><td>SDKDEV_FIRE_ALARM_CFG </td></tr>
	 * <tr><td>SDK_DEV_LOCALALARM_NAME_CFG</td><td>local name</td><td>alarm configName1&&name2&&name3...format character string</td></tr>
	 * <tr><td>SDK_DEV_URGENCY_RECORD_CFG</td><td>emergency storage config</td><td>SDKDEV_URGENCY_RECORD_CFG </td></tr>
	 * <tr><td>SDK_DEV_ELEVATOR_ATTRI_CFG</td><td>elevator operation parameter config</td><td>SDKDEV_ELEVATOR_ATTRI_CFG </td></tr>
	 * <tr><td>SDK_DEV_ATM_OVERLAY_CFG_EX</td><td>	atm overlay	</td><td>SDKDEV_ATM_OVERLAY_CONFIG_EX </td></tr>
	 * <tr><td>SDK_DEV_MACFILTER_CFG</td><td>MAC filter	</td><td>SDKDEV_MACFILTER_CFG </td></tr>
	 * <tr><td>SDK_DEV_MACIPFILTER_CFG</td><td>MAC,IP filter</td><td>SDKDEV_MACIPFILTER_CFG </td></tr>
	 * <tr><td>SDK_DEV_STREAM_ENCRYPT_TIME_CFG</td><td>stream</td><td>SDKEDV_STREAM_ENCRYPT </td></tr>
	 * <tr><td>SDK_DEV_LIMIT_BIT_RATE_CFG</td><td>limit</td><td>SDKDEV_LIMIT_BIT_RATE </td></tr>
	 * <tr><td>SDK_DEV_SNAP_CFG_EX</td><td>snapshot </td><td>SDKDEV_SNAP_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_DECODER_URL_CFG</td><td>decoder url </td><td>SDKDEV_DECODER_URL_CFG </td></tr>
	 * <tr><td>SDK_DEV_TOUR_ENABLE_CFG</td><td>tour </td><td>SDKDEV_TOUR_ENABLE_CFG </td></tr>
	 * <tr><td>SDK_DEV_VICHILE_WIFI_AP_CFG_EX</td><td>wifi ap extension</td><td>SDKDEV_VEHICLE_WIFI_AP_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_ENCODER_CFG_EX</td><td>digital channel</td><td>EV_ENCODER_CFG_EX </td></tr>
	 * </table>
	 * @param lChannel channel NO.,if receive all channel data as 0xFFFFFFFF,if command do not need channel NO., this parameter is invalid 
	 * @param lpOutBuffer receiving data buffering pointer 
	 * @param lpBytesReturned actual received data length
	 * @param waittime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 查询配置信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param dwCommand 设备配置命令,不同dwCommand,lpOutBuffer对应的结构体将会不同,具体如下
	 * <table>
 	 * <tr><td>dwCommand</td><td>dwCommand含义 </td><td>对应结构体 </td></tr>
 	 * <tr><td>SDK_DEV_DEVICECFG</td><td>获取设备参数</td><td>SDKDEV_SYSTEM_ATTR_CFG </td></tr>
	 * <tr><td>SDK_DEV_NETCFG</td><td>获取网络参数 </td><td>SDKDEV_NET_CFG </td></tr>
	 * <tr><td>SDK_DEV_CHANNELCFG</td><td>获取图象通道参数</td><td>如果lChannel为-1,表示获取全部通道,返回SDKDEV_CHANNEL_CFG[channel_num] 如果lChannel为0到最大通道之间,返回<SDKDEV_CHANNEL_CFG 
	 * <tr><td>SDK_DEV_RECORDCFG</td><td>获取定时录像参数	如果lChannel为-1,表示获取全部通道,返回SDKDEV_RECORD_CFG[channel_num] 如 果lChannel为0到最大通道之间,返回SDKDEV_RECORD_CFG 
	 * <tr><td>SDK_DEV_COMMCFG</td><td>获取串口参数	</td><td>SDKDEV_COMM_CFG </td></tr>
	 * <tr><td>SDK_DEV_ALARMCFG</td><td>获取报警布防参数</td><td>SDKDEV_ALARM_SCHEDULE </td></tr>
	 * <tr><td>SDK_DEV_TIMECFG</td><td>获取DVR时间</td><td>NET_TIME </td></tr>
	 * <tr><td>SDK_DEV_PREVIEWCFG</td><td>获取预览参数</td><td>SDKDEV_PREVIEW_CFG </td></tr>
	 * <tr><td>SDK_DEV_AUTOMTCFG</td><td>获取自动维护配置	</td><td>SDKDEV_AUTOMT_CFG </td></tr>
	 * <tr><td>SDK_DEV_VEDIO_MARTIX</td><td>获取本机矩阵策略配置</td><td>SDKDEV_VIDEO_MATRIX_CFG </td></tr>
	 * <tr><td>SDK_DEV_MULTI_DDNS</td><td>获取多ddns服务器配置</td><td>SDKDEV_MULTI_DDNS_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNAP_CFG</td><td>获取抓图相关配置	</td><td>SDKDEV_SNAP_CFG </td></tr>
	 * <tr><td>SDK_DEV_WEB_URL_CFG</td><td>获取http路径配置	</td><td>SDKDEV_URL_CFG </td></tr>
	 * <tr><td>SDK_DEV_FTP_PROTO_CFG</td><td>ftp上传配置</td><td>SDKDEV_FTP_PROTO_CFG </td></tr>
	 * <tr><td>SDK_DEV_INTERVIDEO_CFG</td><td>平台介入配置,lchannel代表平台介入类型</td><td>lchannel=4,表示贝尔平台,SDKDEV_INTERVIDEO_BELL_CFG。lchannel=10,表示ARGzxLW平台,SDKDEV_INTERVIDEO_NSS_CFG lchannel=11,表示UWT,SDKDEV_INTERVIDEO_UCOM_CFG。</td></tr>
	 * <tr><td>SDK_DEV_VIDEO_COVER</td><td>区域遮挡配置	</td><td>如果lChannel为-1,表示获取全部通道,返回</td><td>SDKDEV_VIDEOCOVER_CFG[channel_num]。 如 果lChannel为0到最大通道之间,返回SDKDEV_VIDEOCOVER_CFG。 </td></tr>
	 * <tr><td>SDK_DEV_TRANS_STRATEGY</td><td>传输策略配置</td><td>SDKDEV_TRANSFER_STRATEGY_CFG </td></tr>
	 * <tr><td>SDK_DEV_DOWNLOAD_STRATEGY</td><td>录象下载策略配置	</td><td>SDKDEV_DOWNLOAD_STRATEGY_CFG </td></tr>
	 * <tr><td>SDK_DEV_WATERMAKE_CFG</td><td>图象水印配置</td><td>如果lChannel为-1,表示获取全部通道,返回SDKDEV_WATERMAKE_CFG[channel_num]。 如 果lChannel为0到最大通道之间,返回SDKDEV_WATERMAKE_CFG。 </td></tr>
	 * <tr><td>SDK_DEV_WLAN_CFG</td><td>配置无线网络信息</td><td>SDKDEV_WLAN_INFO </td></tr>
	 * <tr><td>SDK_DEV_WLAN_DEVICE_CFG</td><td>搜索无线设备</td><td>SDKDEV_WLAN_DEVICE_LIST </td></tr>
	 * <tr><td>SDK_DEV_REGISTER_CFG</td><td>主动注册参数配置</td><td>SDKDEV_REGISTER_SERVER </td></tr>
	 * <tr><td>SDK_DEV_CAMERA_CFG</td><td>摄像头属性配置</td><td>如果lChannel为-1,表示获取全部通道,返回SDKDEV_CAMERA_CFG[channel_num]。 如 果lChannel为0到最大通道之间,返回SDKDEV_CAMERA_CFG。 </td></tr>
	 * <tr><td>SDK_DEV_INFRARED_CFG</td><td>红外报警参数</td><td>SDK_INFRARED_CFG </td></tr>
	 * <tr><td>SDK_DEV_MAIL_CFG</td><td>邮件配置	</td><td>SDKDEV_MAIL_CFG </td></tr>
	 * <tr><td>SDK_DEV_DNS_CFG</td><td>DNS服务器配置</td><td>SDKDEV_DNS_CFG </td></tr>
	 * <tr><td>SDK_DEV_NTP_CFG</td><td>NTP配置</td><td>SDKDEV_NTP_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNIFFER_CFG</td><td>Sniffer抓包配置</td><td>SDKDEV_SNIFFER_CFG </td></tr>
	 * <tr><td>SDK_DEV_AUDIO_DETECT_CFG</td><td>音频检测报警参数</td><td>SDK_AUDIO_DETECT_CFG </td></tr>
	 * <tr><td>SDK_DEV_STORAGE_STATION_CFG</td><td>存储位置配置</td><td>如果lChannel为-1,表示获取全部通道,返回 SDK_STORAGE_STATION_CFG[channel_num]。 如 果lChannel为0到最大通道之间,返回 SDK_STORAGE_STATION_CFG。</td></tr> 
	 * <tr><td>SDK_DEV_DST_CFG</td><td>夏令时配置 </td><td>SDKDEV_DST_CFG </td></tr>
	 * <tr><td>SDK_DEV_VIDEO_OSD_CFG</td><td>视频OSD叠加配置 </td><td>如果lChannel为-1,表示获取全部通道,返回 SDK_DVR_VIDEOOSD_CFG[channel_num]。 如 果lChannel为0到最大通道之间,返回 SDK_DVR_VIDEOOSD_CFG。 </td></tr>
	 * <tr><td>SDK_DEV_ALARM_CENTER_CFG</td><td>报警中心配置 </td><td>ALARMCENTER_UP_CFG </td></tr>
	 * <tr><td>SDK_DEV_CDMAGPRS_CFG</td><td>CDMA、GPRS网络配置</td><td>SDKDEV_CDMAGPRS_CFG </td></tr>
	 * <tr><td>SDK_DEV_IPFILTER_CFGIP</td><td>过滤配置	</td><td>SDKDEV_IPIFILTER_CFG </td></tr>
	 * <tr><td>SDK_DEV_TALK_ENCODE_CFG</td><td>语音对讲编码配置</td><td>SDKDEV_TALK_ENCODE_CFG </td></tr>
	 * <tr><td>SDK_DEV_RECORD_PACKET_CFG</td><td>录像打包长度配置</td><td>SDKDEV_RECORD_PACKET_CFG </td></tr>
	 * <tr><td>SDK_DEV_MMS_CFG</td><td>短信MMS配置	</td><td>SDKDEV_MMS_CFG </td></tr>
	 * <tr><td>SDK_DEV_SMSACTIVATION_CFG</td><td>短信激活无线连接配置</td><td>SDKDEV_SMSACTIVATION_CFG </td></tr>
	 * <tr><td>SDK_DEV_DIALINACTIVATION_CFG	</td><td>拨号激活无线连接配置</td><td>SDKDEV_DIALINACTIVATION_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNIFFER_CFG_EX</td><td>网络抓包配置</td><td>SDK_ATM_SNIFFER_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_DOWNLOAD_RATE_CFG</td><td>下载速度限制</td><td>int </td></tr>
	 * <tr><td>SDK_DEV_PANORAMA_SWITCH_CFG</td><td>全景切换报警配置ALARM_PANORAMA_SWITCH_CFG </td></tr>
	 * <tr><td>SDK_DEV_LOST_FOCUS_CFG</td><td>失去焦点报警配置ALARM_LOST_FOCUS_CFG </td></tr>
	 * <tr><td>SDK_DEV_ALARM_DECODE_CFG</td><td>报警解码器配置</td><td>SDK_ALARMDEC_CFG </td></tr>
	 * <tr><td>SDK_DEV_VIDEOOUT_CFG</td><td>视频输出参数配置	</td><td>DEV_VIDEOOUT_INFO </td></tr>
	 * <tr><td>SDK_DEV_POINT_CFG</td><td>预制点使能配置 </td><td>SDKDEV_POINT_CFG </td></tr>
	 * <tr><td>SDK_DEV_IP_COLLISION_CFG</td><td>Ip冲突检测报警配置</td><td>ALARM_IP_COLLISION_CFG</td></tr> 
	 * <tr><td>SDK_DEV_OSD_ENABLE_CFGOSD</td><td>叠加使能配置</td><td>SDKDEV_OSD_ENABLE_CFG </td></tr>
	 * <tr><td>SDK_DEV_LOCALALARM_CFG</td><td>本地报警配置</td><td>SDK_ALARMIN_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_NETALARM_CFG</td><td>网络报警配置	</td><td>SDK_ALARMIN_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_MOTIONALARM_CFG</td><td>动检报警配置</td><td>SDK_MOTION_DETECT_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_VIDEOLOSTALARM_CFG</td><td>视频丢失报警配置 </td><td>SDK_VIDEO_LOST_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_BLINDALARM_CFG</td><td>视频遮挡报警配置 </td><td>SDK_BLIND_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_DISKALARM_CFG</td><td>硬盘报警配置 </td><td>SDK_DISK_ALARM_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_NETBROKENALARM_CFG</td><td>网络中断报警配置</td><td>SDK_NETBROKEN_ALARM_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_ENCODER_CFG</td><td>数字通道的前端编码器信息</td><td>DEV_ENCODER_CFG </td></tr>
	 * <tr><td>SDK_DEV_TV_ADJUST_CFGTV</td><td>调节配置 </td><td>SDKDEV_TVADJUST_CFG </td></tr>
	 * <tr><td>SDK_DEV_ABOUT_VEHICLE_CFG</td><td>车载相关配置,	</td><td>SDKDEV_ABOUT_VEHICLE_CFG </td></tr>
	 * <tr><td>SDK_DEV_ATM_OVERLAY_ABILITY</td><td>获取atm叠加支持能力信息</td><td>SDKDEV_ATM_OVERLAY_GENERAL </td></tr>
	 * <tr><td>SDK_DEV_ATM_OVERLAY_CFG</td><td>atm叠加配置,新atm特有	</td><td>SDKDEV_ATM_OVERLAY_CONFIG </td></tr>
	 * <tr><td>SDK_DEV_DECODER_TOUR_CFG</td><td>解码器解码轮巡配置 	</td><td>SDKDEV_DECODER_TOUR_CFG </td></tr>
	 * <tr><td>SDK_DEV_SIP_CFG</td><td>SIP配置	</td><td>SDKDEV_SIP_CFG </td></tr>
	 * <tr><td>SDK_DEV_VICHILE_WIFI_AP_CFG</td><td>WIFI AP配置</td><td>SDKDEV_VEHICLE_SINGLE_WIFI_AP_CFG </td></tr>
	 * <tr><td>SDK_DEV_STATICALARM_CFG</td><td>静态报警配置</td><td>SDK_STATIC_DETECT_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_DECODE_POLICY_CFG</td><td>设备的解码策略配置</td><td>SDKDEV_DECODEPOLICY_CFG </td></tr>
	 * <tr><td>SDK_DEV_MACHINE_CFG</td><td>机器相关的配置</td><td>SDKDEV_MACHINE_CFG </td></tr>
	 * <tr><td>SDK_DEV_MAC_COLLISION_CFG</td><td>MAC冲突检测配置	</td><td>ALARM_MAC_COLLISION_CFG </td></tr>
	 * <tr><td>SDK_DEV_RTSP_CFG	RTSP</td><td>配置	</td><td>SDKDEV_RTSP_CFG </td></tr>
	 * <tr><td>SDK_DEV_232_COM_CARD_CFG</td><td>232串口卡号信号事件配置</td><td>COM_CARD_SIGNAL_LINK_CFG </td></tr>
	 * <tr><td>SDK_DEV_485_COM_CARD_CFG</td><td>485串口卡号信号事件配置	</td><td>COM_CARD_SIGNAL_LINK_CFG </td></tr>
	 * <tr><td>SDK_DEV_FTP_PROTO_CFG_EX</td><td>FTP上传扩展配置	</td><td>SDKDEV_FTP_PROTO_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_SYSLOG_REMOTE_SERVER</td><td>YSLOG 远程服务器配置</td><td>SDKDEV_SYSLOG_REMOTE_SERVER </td></tr>
	 * <tr><td>SDK_DEV_COMMCFG_EX</td><td>扩展串口属性配置</td><td>SDKDEV_COMM_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_NETCARD_CFG</td><td>卡口信息配置	</td><td>SDKDEV_NETCARD_CFG </td></tr>
	 * <tr><td>SDK_DEV_BACKUP_VIDEO_FORMAT</td><td>视频备份格式配置</td><td>SDKDEV_BACKUP_VIDEO_FORMAT </td></tr>
	 * <tr><td>SDK_DEV_STREAM_ENCRYPT_CFG</td><td>码流加密配置	SDKEDV_STREAM_ENCRYPT </td></tr>
	 * <tr><td>SDK_DEV_IPFILTER_CFG_EXIP</td><td>过滤配置扩展</td><td>SDKDEV_IPIFILTER_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_CUSTOM_CFG</td><td>用户自定义配置</td><td>SDKDEV_CUSTOM_CFG </td></tr>
	 * <tr><td>SDK_DEV_WLAN_DEVICE_CFG_EX</td><td>搜索无线设备扩展配置</td><td>SDKDEV_WLAN_DEVICE_LIST_EX </td></tr>
	 * <tr><td>SDK_DEV_ACC_POWEROFF_CFG</td><td>ACC断线事件配置	</td><td>SDKDEV_ACC_POWEROFF_CFG </td></tr>
	 * <tr><td>SDK_DEV_EXPLOSION_PROOF_CFG</td><td>防爆盒报警事件配置</td><td>SDKDEV_EXPLOSION_PROOF_CFG </td></tr>
	 * <tr><td>SDK_DEV_NETCFG_EX</td><td>网络扩展配置</td><td>SDKDEV_NET_CFG_EX </td></tr>
	 * <tr><td>SDK_DEV_LIGHTCONTROL_CFG</td><td>灯光控制配置	</td><td>SDKDEV_LIGHTCONTROL_CFG </td></tr>
	 * <tr><td>SDK_DEV_3GFLOW_CFG</td><td>3G流量信息配置	</td><td>SDKDEV_3GFLOW_INFO_CFG</td></tr> 
	 * <tr><td>SDK_DEV_IPV6_CFG</td><td>IPv6配置	</td><td>SDKDEV_IPV6_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNMP_CFG</td><td>Snmp配置	</td><td>SDKDEV_NET_SNMP_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNAP_CONTROL_CFG</td><td>抓图开关配置 </td><td>SDKDEV_SNAP_CONTROL_CFG </td></tr>
	 * <tr><td>SDK_DEV_GPS_MODE_CFGGPS</td><td>定位模式配置</td><td>SDKDEV_GPS_MODE_CFG </td></tr>
	 * <tr><td>SDK_DEV_SNAP_UPLOAD_CFG</td><td>图片上传配置信息 </td><td>SDKDEV_SNAP_UPLOAD_CFG </td></tr>
	 * <tr><td>SDK_DEV_SPEED_LIMIT_CFG</td><td>限速配置信息 </td><td>SDKDEV_SPEED_LIMIT_CFG </td></tr>
	 * <tr><td>SDK_DEV_ISCSI_CFG</td><td>iSCSI配置 </td><td>SDKDEV_ISCSI_CFG </td></tr>
	 * <tr><td>SDK_DEV_WIRELESS_ROUTING_CFG</td><td>无线路由配置 </td><td>SDKDEV_WIRELESS_ROUTING_CFG </td></tr>
	 * <tr><td>SDK_DEV_ENCLOSURE_CFG</td><td>电子围栏配置 </td><td>SDKDEV_ENCLOSURE_CFG </td></tr>
	 * <tr><td>SDK_DEV_ENCLOSURE_VERSION_CFG</td><td>电子围栏版本号配置 </td><td>SDKDEV_ENCLOSURE_VERSION_CFG </td></tr>
	 * <tr><td>SDK_DEV_RIAD_EVENT_CFG</td><td>Raid事件配置 </td><td>SDKDEV_RAID_EVENT_CFG </td></tr>
	 * <tr><td>SDK_DEV_FIRE_ALARM_CFG</td><td>火警报警配置 </td><td>SDKDEV_FIRE_ALARM_CFG </td></tr>
	 * <tr><td>SDK_DEV_LOCALALARM_NAME_CFG</td><td>本地名称报警配置 </td><td>Name1&&name2&&name3...格式字符串 </td></tr>
	 * <tr><td>SDK_DEV_URGENCY_RECORD_CFG</td><td>紧急存储配置 </td><td>SDKDEV_URGENCY_RECORD_CFG </td></tr>
	 * <tr><td>SDK_DEV_ELEVATOR_ATTRI_CFG</td><td>电梯运行参数配置</td><td>SDKDEV_ELEVATOR_ATTRI_CFG</td></tr>
	 * <tr><td>SDK_DEV_ATM_OVERLAY_CFG_EX</td><td>atm叠加配置 </td><td>SDKDEV_ATM_OVERLAY_CONFIG_EX</td></tr>
	 * <tr><td>SDK_DEV_MACFILTER_CFGMAC</td><td>过滤配置 </td><td>SDKDEV_MACFILTER_CFG</td></tr>
	 * <tr><td>SDK_DEV_MACIPFILTER_CFG</td><td>MAC,IP过滤	</td><td>SDKDEV_MACIPFILTER_CFG</td></tr>
	 * <tr><td>SDK_DEV_STREAM_ENCRYPT_TIME_CFG</td><td>码流加密(加密计划)配置 SDKEDV_STREAM_ENCRYPT</td></tr>
	 * <tr><td>SDK_DEV_LIMIT_BIT_RATE_CFG</td><td>限码流配置 </td><td>SDKDEV_LIMIT_BIT_RATE</td></tr>
	 * <tr><td>SDK_DEV_SNAP_CFG_EX</td><td>抓图相关配置扩展 </td><td>SDKDEV_SNAP_CFG_EX</td></tr>
	 * <tr><td>SDK_DEV_DECODER_URL_CFG</td><td>解码器url配置 </td><td>SDKDEV_DECODER_URL_CFG</td></tr>
	 * <tr><td>SDK_DEV_TOUR_ENABLE_CFG</td><td>轮巡使能配置 </td><td>SDKDEV_TOUR_ENABLE_CFG</td></tr>
	 * <tr><td>SDK_DEV_VICHILE_WIFI_AP_CFG_EX</td><td>wifi ap配置扩展 </td><td>SDKDEV_VEHICLE_WIFI_AP_CFG_EX</td></tr>
	 * <tr><td>SDK_DEV_ENCODER_CFG_EX</td><td>数字通道的前端编码器信息扩展 </td><td>DEV_ENCODER_CFG_EX</td></tr>
	 * </table>
	 * @param lChannel 通道号,如果获取全部通道数据为0xFFFFFFFF,如果命令不需要通道号,该参数无效 
	 * @param lpOutBuffer 接受数据缓冲指针
	 * @param lpBytesReturned 实际收到数据的长度 
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 * @see  {@link INetSDK#SetDevConfig}
	 */
	public static native boolean       GetDevConfig(long lLoginID, int dwCommand, int lChannel, Object[] lpOutBuffer, Integer lpBytesReturned, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * set device config info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param dwCommand set device config command , can look for GetDevConfig
	 * @param lChannel channel NO., if set all channel data to 0xFFFFFFFF,if command do not need chaneel No.,this parameter invalid 
	 * @param lpInBuffer data buffering pointer 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * 设置配置信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param dwCommand 设备配置命,详见 GetDevConfig
	 * @param lChannel 通道号,如果获取全部通道数据为0xFFFFFFFF,如果命令不需要通道号,该参数无效 
	 * @param lpInBuffer 数据缓冲指针 
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#GetDevConfig}
	 */
	public static native boolean       SetDevConfig(long lLoginID, int dwCommand, int lChannel, Object[] lpInBuffer, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search device channel name
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pChannelName  channel name buffering area(normally channel length is 32 bytes,here neees allocation>=16*32 byte buffering) 
	 * @param nChannelCount total channels 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * 查询设备通道名称
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pChannelName  通道名缓冲区(一般每个通道名是32字节长,这里需分配>=16*32字节长度的缓冲) 
	 * @param nChannelCount 缓冲区长度,(单位字节)
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#SetupChannelName}
	 */
	public static native boolean       QueryChannelName(long lLoginID, byte pChannelName[], Integer nChannelCount, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * change channel name
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pbuf  channel name buffering 
	 * @return true:success, false:failed
	 * \else
	 * 设置设备通道名称
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pbuf  通道名称的缓冲
	 * @return true:成功, false:失败
	 * \endif
	 * @see  {@link INetSDK#QueryChannelName}
	 */
	public static native boolean       SetupChannelName(long lLoginID, byte pbuf[]);
	
	/**
	 * \if ENGLISH_LANG
	 * ser image superposition(not channel name)
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelNo  image channel NO. 
	 * @param struOsdString subtitles content 
	 * @return true:success, false:failed
	 * \else
	 * 设置设备通道字符叠加
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelNo  图像通道号
	 * @param struOsdString 字幕内容
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       SetupChannelOsdString(long lLoginID, int nChannelNo, SDK_CHANNEL_OSDSTRING struOsdString);
	
	/**
	 * \if ENGLISH_LANG
	 * ser image superposition(not channel name)
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pDeviceTime  received device time pointer  
	 * @param waittime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 查询设备当前时间
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pDeviceTime  接收的设备时间指针
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#SetupDeviceTime}
	 */
	public static native boolean       QueryDeviceTime(long lLoginID, NET_TIME pDeviceTime, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * ser image superposition(not channel name)
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuInParam  param in
	 * @param pstuOutParam  param out
	 * @param nWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 查询设备当前时间
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuInParam  入参结构体
	 * @param pstuOutParam  出参结构体
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#SetupDeviceTime}
	 */
	public static native boolean       GetPushInfosRTMPManager(long lLoginID, NET_IN_RTMP_MANAGER_GETPUSHINFOS pstuInParam, NET_OUT_RTMP_MANAGER_GETPUSHINFOS pstuOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * set device time
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pDeviceTime set device time pointer
	 * @return true:success, false:failed
	 * \else
	 * 设置设备当前时间
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pDeviceTime 设置的设备时间指针
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#QueryDeviceTime}
	 */
	public static native boolean       SetupDeviceTime(long lLoginID, NET_TIME pDeviceTime);
	
	/**
	 * \if ENGLISH_LANG
	 * set device limit stream
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param wFlux limit stram to set
	 * @return true:success, false:failed
	 * \else
	 * 设置设备限制码流
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param wFlux 要设置的限制码流
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       SetMaxFlux(long lLoginID, short wFlux);
	
	/**
	 * \if ENGLISH_LANG
	 * connect to DDNS server,search by device name IP
	 * @param pchDVRIP DDNSserver IP 
	 * @param wDVRPort DDNSserver port number 
	 * @param sDVRName device name to search
	 * @param sDVRSerialNumber  device serial number to search(currently not support,fill in 0) 
	 * @param sGetIP storage IP address pointer(allocation in application,32 byte long) 
	 * @return true:success, false:failed
	 * \else
	 * 通过设备名字或者设备序列号向DDNS服务器查询设备IP
	 * @param pchDVRIP DDNS服务器的IP 
	 * @param wDVRPort DDNS服务器的端口号
	 * @param sDVRName 所查询的设备名
	 * @param sDVRSerialNumber  设备名的长度,(单位字节)
	 * @param sGetIP 储存IP地址的指针( 应用程序中分配,32字节长) 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       GetDVRIPByResolveSvr(String pchDVRIP, short wDVRPort, byte sDVRName[], byte sDVRSerialNumber[], char sGetIP[]);
	
	/**
	 * \if ENGLISH_LANG
	 * asynchronism search IPC, NVS and etc in LAN, start to search device
	 * @param cbSearchDevices recall function
	 * @return successful return to handle,failed return to 0
	 * \else
	 * 异步搜索局域网内IPC、NVS等设备
	 * @param cbSearchDevices 回调函数
	 * @return 成功返回句柄,失败返回0
	 * \endif
	 * @see {@link INetSDK#StopSearchDevices}
	 */
	public static native long          StartSearchDevices(CB_fSearchDevicesCB cbSearchDevices);
	
	/**
	 * \if ENGLISH_LANG
	 * stop asynchronously searching LAN internal IPC,NVS and etc.
	 * @param lSearchHandle {@link INetSDK#StartSearchDevices}return value
	 * @return true:success, false:failed
	 * \else
	 * 停止异步搜索局域网内IPC、NVS等设备
	 * @param lSearchHandle {@link INetSDK#StartSearchDevices}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#StartSearchDevices}
	 */
	public static native boolean       StopSearchDevices(long lSearchHandle);

	/**
	 * \if ENGLISH_LANG
	 *
	 * @param pInBuf  input parameter
	 * @param pOutBuf  output parameter
	 * @return true:successful, false: failed
	 * \else
	 * 异步搜索设备
	 * @param pInBuf 输入参数
	 * @param pOutBuf 输出参数
	 * @return 成功返回句柄,失败返回0
	 * \endif
	 */
	public static native long          StartSearchDevicesEx(NET_IN_STARTSERACH_DEVICE pInBuf, NET_OUT_STARTSERACH_DEVICE pOutBuf);

	/**
	 * \if ENGLISH_LANG
	 * modify the IP address of device without login.
	 * @param pDevNetInfo edit device's input structure info
	 * @param dwWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 修改设备IP 
	 * @param pDevNetInfo 修改设备的输入结构体信息 
	 * @param dwWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#StartSearchDevices}  {@link INetSDK#StopSearchDevices}
	 */
	public static native boolean       ModifyDevice(DEVICE_NET_INFO_EX pDevNetInfo, int dwWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * cross net search deviceIP
	 * @param pIpSearchInfo devicesearchinfo
	 * @param cbSearchDevices recallfunction
	 * @param dwWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 通过IP查找设备
	 * @param pIpSearchInfo 设备搜索信息
	 * @param cbSearchDevices 回调函数
	 * @param dwWaitTime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       SearchDevicesByIPs(DEVICE_IP_SEARCH_INFO pIpSearchInfo, CB_fSearchDevicesCB cbSearchDevices, int dwWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * set snapshot recall function
	 * @param OnSnapRevMessage snapshot data recall function
	 * @return true:success, false:failed
	 * \else
	 * 设置抓图回调 
	 * @param OnSnapRevMessage 抓图数据回调函数
	 * @return 无
	 * \endif
	 */
	public static native void          SetSnapRevCallBack(CB_fSnapRev OnSnapRevMessage);
	
	/**
	 * \if ENGLISH_LANG
	 * snapshot request
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param par snapshot parameter structure 
	 * @return true:success, false:failed
	 * \else
	 * 抓图请求
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param par 抓图结构体
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       SnapPicture(long lLoginID, SNAP_PARAMS par);
	
	/**
	 * \if ENGLISH_LANG
	 * Writing and uploading start return this operation handle, please note cannot fAttachBurnStateCB call function
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}return value
	 * @param pstInParam  input parameter
	 * @param pstOutParam  output parameter
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed
	 * \else
	 * 刻录上传开始 返回此次上传操作句柄, 注意不能在 fAttachBurnStateCB 回调函数里面调用
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native long          StartUploadFileBurned(long lLoginID, NET_IN_FILEBURNED_START pstInParam, NET_OUT_FILEBURNED_START pstOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Writing and uploading file, please note cannot fAttachBurnStateCB  call function
	 * @param lUploadHandle {@link INetSDK#StartUploadFileBurned} return value
	 * @return true:successful, false: failed 
	 * \else
	 * 刻录上传文件,注意不能在 fAttachBurnStateCB 回调函数里面调用
	 * @param lUploadHandle {@link INetSDK#StartUploadFileBurned}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#StartUploadFileBurned}
	 */
	public static native boolean       SendFileBurned(long lUploadHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * Writing and uploading stop, this port cannot fBurnFileCallBack  call function
	 * @param lUploadHandle {@link INetSDK#StartUploadFileBurned} return value
	 * @return true:successful, false: failed 
	 * \else
	 * 刻录上传停止,此接口不能在 fBurnFileCallBack 回调函数中调用
	 * @param lUploadHandle {@link INetSDK#StartUploadFileBurned}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#StartUploadFileBurned}
	 */
	public static native boolean       StopUploadFileBurned(long lUploadHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * Registration update file processing
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2} return value
	 * @param pstInParam input parameter
	 * @param pstOutParam output parameter
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed
	 * \else
	 * 注册升级文件处理
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
    public static native long          attachAIOFileProc(long lLoginID, NET_IN_ATTACH_AIO pstInParam, NET_OUT_ATTACH_AIO pstOutParam, int nWaitTime);
															 													 
	/**
	 * \if ENGLISH_LANG
	 * Canclelatiuon of File Processing
	 * @param lAttachHandle {@link INetSDK#attachAIOFileProc} return value
	 * @return true:successful, false: failed 
	 * \else
	 * 注销文件处理
	 * @param lAttachHandle {@link INetSDK#attachAIOFileProc}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */														 
	public static native boolean       detachAIOFileproc(long lAttachHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * set NVR ad
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2} return value
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime waitting time
	 * @return true:successful, false: failed 
	 * \else
	 * 设置NVR广告
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */	
	public static native long 		   SetAIOAdvert(long lLoginID, NET_IN_SET_ADVERT pstInParam, NET_OUT_SET_ADVERT pstOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * NVR screen 
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2} return value
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime waitting time
	 * @return true:successful, false: failed 
	 * \else
	 * NVR截屏
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */	
	public static native long          AIOScreen(long lLoginID, NET_IN_AIO_SCREEN pstInParam, NET_OUT_AIO_SCREEN pstOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Listen writing calibration status
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2} return value
	 * @param pstInParam input parameter
	 * @param pstOutParam output parameter
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed
	 * \else
	 * 监听刻录校验状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#DetachBurnCheckState}
	 */
	public static native long          AttachBurnCheckState(long lLoginID, NET_IN_ATTACH_BURN_CHECK pstInParam, NET_OUT_ATTACH_BURN_CHECK pstOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Cancel listening writing calibration status,
	 * @param lAttachHandle {@link INetSDK#AttachBurnCheckState} return value
	 * @return true:successful, false: failed 
	 * \else
	 * 取消监听刻录校验状态,
	 * @param lAttachHandle {@link INetSDK#AttachBurnCheckState}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       DetachBurnCheckState(long lAttachHandle);

	/**
	 * \if ENGLISH_LANG
	 * Attach Gyro
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2} return value
	 * @param pstInParam input parameter
	 * @param pstOutParam output parameter
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed
	 * \else
	 * 订阅陀螺仪数据接口
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#DetachGyro}
	 */
	public static native long          AttachGyro(long lLoginID, NET_IN_ATTACH_GYRO pstInParam, NET_OUT_ATTACH_GYRO pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Detach Gyro
	 * @param lAttachHandle {@link INetSDK#AttachGyro} return value
	 * @return true:successful, false: failed
	 * \else
	 * 取消陀螺仪数据订阅接口
	 * @param lAttachHandle {@link INetSDK#AttachGyro}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       DetachGyro(long lAttachHandle);

	/**
	 * \if ENGLISH_LANG
	 * search product definition
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuProdDef device profuct definition
	 * @param nWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 查询产品定义
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuProdDef 设备产品定义
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       QueryProductionDefinition(long lLoginID, SDK_PRODUCTION_DEFNITION pstuProdDef, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * search matrix card info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuCardInfo input parameter 
	 * @param nWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 查询矩阵子卡信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuCardInfo 输入参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       QueryMatrixCardInfo(long lLoginID, SDK_MATRIX_CARD_LIST pstuCardInfo, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * search solicing capability
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannel output channel NO.
	 * @param pstuCaps channel splicing capability
	 * @param nWaitTime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * 查询分割能力
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannel 输出通道号 
	 * @param pstuCaps 通道分割能力
	 * @param nWaitTime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       GetSplitCaps(long lLoginID, int nChannel, SDK_SPLIT_CAPS pstuCaps, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * search display source
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannel output channel NO.
	 * @param nWindow windoe NO.
	 * @param pstuSplitSrc display source group number 
	 * @param pnRetCount returned display source quantity 
	 * @param nWaitTime  waiting time
	 * @return true:success, false:failed
	 * \else
	 * 查询显示源
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannel 输出通道号
	 * @param nWindow 窗口号 , 输出通道对应的窗口号， -1表示所有窗口
	 * @param pstuSplitSrc 显示源数组,用户申请内存 
	 * @param pnRetCount 返回的显示源数量
	 * @param nWaitTime  等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       GetSplitSource(long lLoginID, int nChannel, int nWindow, SDK_SPLIT_SOURCE pstuSplitSrc[], Integer pnRetCount, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * set display source
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannel output channel NO. 
	 * @param nWindow windoe NO. 
	 * @param pstuSplitSrc display source group 
	 * @param nSrcCount set display source quantity  
	 * @param nWaitTime  waiting time
	 * @return true:success, false:failed
	 * \else
	 * 设置显示源, 支持输出参数
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannel 输出通道号
	 * @param nWindow 窗口号
	 * @param pstuSplitSrc 显示源数组
	 * @param nSrcCount 设置的显示源数量 
	 * @param nWaitTime  等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       SetSplitSource(long lLoginID, int nChannel, int nWindow, SDK_SPLIT_SOURCE pstuSplitSrc[], int nSrcCount, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * search splicing mode
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannel output channel NO. 
	 * @param pstuSplitSrc splicing mode info
	 * @param nWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 查询分割模式
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannel 输出通道号
	 * @param pstuSplitSrc 分割模式信息,用户分配内存
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       GetSplitMode(long lLoginID, int nChannel, SDK_SPLIT_MODE_INFO pstuSplitSrc, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * set splicing mode
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannel output channel NO. 
	 * @param pstuSplitSrc  splicing mode info 
	 * @param nWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 设置分割模式
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannel 输出通道号
	 * @param pstuSplitSrc  分割模式信息
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       SetSplitMode(long lLoginID, int nChannel, SDK_SPLIT_MODE_INFO pstuSplitSrc, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * set window position
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam set window input 
	 * @param pOutParam set window output 
	 * @param nWaitTime wait 
	 * @return true:success, false:failed
	 * \else
	 * 设置窗口位置
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 设置窗口位置输入参数 
	 * @param pOutParam 设置窗口位置输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       SetSplitWindowRect(long lLoginID, SDK_IN_SPLIT_SET_RECT pInParam, SDK_OUT_SPLIT_SET_RECT pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * get window position
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam get window input 
	 * @param pOutParam get window output 
	 * @param nWaitTime wait 
	 * @return true:success, false:failed
	 * \else
	 * 获取窗口位置
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 获取窗口位置输入参数 
	 * @param pOutParam 获取窗口位置输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       GetSplitWindowRect(long lLoginID, SDK_IN_SPLIT_GET_RECT pInParam, SDK_OUT_SPLIT_GET_RECT pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * open
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam open input
	 * @param pOutParam open output
	 * @param nWaitTime wait
	 * @return true:success, false:failed
	 * \else
	 * 开窗
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 开窗输入参数
	 * @param pOutParam 开窗输出参数
	 * @param nWaitTime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#CloseSplitWindow}
	 */
	public static native boolean       OpenSplitWindow(long lLoginID, SDK_IN_SPLIT_OPEN_WINDOW pInParam, SDK_OUT_SPLIT_OPEN_WINDOW pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * receive PTZ device property
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param dwProtocolIndex PTZ protocol NO.
	 * @param lpOutBuffer return to PTZ property structure( {@link PTZ_OPT_ATTR} )buffering area
	 * @param waittime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 获取云台信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param dwProtocolIndex 云台协议号
	 * @param lpOutBuffer 返回云台属性结构体( {@link PTZ_OPT_ATTR} )的缓存区
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		GetPtzOptAttr(long lLoginID, int dwProtocolIndex, Object lpOutBuffer, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * close
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam parameter
	 * @param pOutParam parameter 
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * 关窗
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 关窗输入参数
	 * @param pOutParam 关窗输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#OpenSplitWindow }
	 */
	public static native boolean       CloseSplitWindow(long lLoginID, SDK_IN_SPLIT_CLOSE_WINDOW pInParam, SDK_OUT_SPLIT_CLOSE_WINDOW pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * sequence
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam set windoe input
	 * @param pOutParam set window output 
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * 设置窗口次序
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输出通道号
	 * @param pOutParam 窗口号 
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       SetSplitTopWindow(long lLoginID, SDK_IN_SPLIT_SET_TOP_WINDOW pInParam, SDK_OUT_SPLIT_SET_TOP_WINDOW pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * get current window
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam get current window input 
	 * @param pOutParam get current window output 
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * 获取当前显示的窗口信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 获取当前显示的窗口信息输入参数
	 * @param pOutParam 获取当前显示的窗口信息输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       GetSplitWindowsInfo(long lLoginID, SDK_IN_SPLIT_GET_WINDOWS pInParam, SDK_OUT_SPLIT_GET_WINDOWS pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Power control
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2} return value
	 * @param pInParam input parameter
	 * @param pOutParam output parameter
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed 
	 * \else
	 * 电源控制
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       PowerControl(long lLoginID, SDK_IN_WM_POWER_CTRL pInParam, SDK_OUT_WM_POWER_CTRL pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Load scheme
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2} return value
	 * @param pInParam input parameter
	 * @param pOutParam output parameter
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed 
	 * \else
	 * 载入预案
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#SaveMonitorWallCollection}
	 */
	public static native boolean       LoadMonitorWallCollection(long lLoginID, SDK_IN_WM_LOAD_COLLECTION pInParam, SDK_OUT_WM_LOAD_COLLECTION pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Save scheme
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2} return value
	 * @param pInParam input parameter
	 * @param pOutParam output parameter
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed 
	 * \else
	 * 保存预案
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#LoadMonitorWallCollection}
	 */
	public static native boolean       SaveMonitorWallCollection(long lLoginID, SDK_IN_WM_SAVE_COLLECTION pInParam, SDK_OUT_WM_SAVE_COLLECTION pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Get TV wall scheme
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2} return value
	 * @param pInParam input parameter
	 * @param pOutParam output parameter
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed 
	 * \else
	 * 获取电视墙预案
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       GetMonitorWallCollections(long lLoginID, SDK_IN_WM_GET_COLLECTIONS pInParam, SDK_OUT_WM_GET_COLLECTIONS pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * TV wall scheme rename
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2} return value
	 * @param pInParam input parameter
	 * @param pOutParam output parameter
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed 
	 * \else
	 * 电视墙预案重命名
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       RenameMonitorWallCollection(long lLoginID, SDK_IN_WM_RENAME_COLLECTION pInParam, SDK_OUT_WM_RENAME_COLLECTION pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Upload file
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nTransType type as follows: 
	 * <table>
	 * <tr><td>enumeration type</td><td>meaning </td></tr>
	 * <tr><td>SDK_DEV_UPGRADEFILETRANS_START </td><td>0x0000 开start update file uploading(corresponding structure SDKDEV_UPGRADE_FILE_INFO ) </td></tr>
	 * <tr><td>SDK_DEV_UPGRADEFILETRANS_SEND </td><td>0x0001send update file</td></tr>
	 * <tr><td>SDK_DEV_UPGRADEFILETRANS_STOP </td><td>0x0002 stop sending update file</td></tr>
	 * <tr><td>SDK_DEV_FILETRANS_STOP</td><td>0x002B stop file uploading</td></tr>
	 * <tr><td>SDK_DEV_FILETRANS_BURN</td><td>0x002C burned file upload</td></tr>
	 * </table>
	 * @param szInBuf nInBufLen is greater or equal to szInBuf structure size
	 * <table>
	 * <tr><td>enumeration type</td><td>represent meaning</td><td>szInBuf 
	 * <tr><td>SDK_DEV_FILETRANS_BURN</td><td>attached burned file upload</td><td>SDKDEV_BURNFILE_TRANS_CFG 
	 * <tr><td>SDK_DEV_FILETRANS_STOP</td><td>stop file uploading</td><td>LONG,detail as handle return after file upload 
	 * </table>
	 * @param dwUserData recall function,see follows 
	 * @param nWaitTime	overtime of waiting 
	 * @return true:success, false:failed
	 * \else
	 * 文件上传接口
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nTransType 接口传输文件类型
	 * <table>
	 * <tr><td>枚举类型</td><td>意义 </td></tr>
	 * <tr><td>SDK_DEV_UPGRADEFILETRANS_START</td><td>0x0000 开始升级文件上传(对应结构体 SDKDEV_UPGRADE_FILE_INFO ) </td></tr>
	 * <tr><td>SDK_DEV_UPGRADEFILETRANS_SEND</td><td>0x0001 发送升级文件 </td></tr>
	 * <tr><td>SDK_DEV_UPGRADEFILETRANS_STOP</td><td>0x0002 停止发送升级文件 </td></tr>
	 * <tr><td>SDK_DEV_FILETRANS_STOP 0x002B</td><td>停止文件上传 </td></tr>
	 * <tr><td>SDK_DEV_FILETRANS_BURN 0x002C</td><td>刻录文件上传 </td></tr>
	 * </table>
	 * @param szInBuf nInBufLen大于等于szInBuf结构体的大小
	 * <table>
	 * <tr><td>枚举类型</td><td>表示含义</td><td>szInBuf </td></tr>
	 * <tr><td>SDK_DEV_FILETRANS_BURN</td><td>附件刻录文件上传 </td><td>SDKDEV_BURNFILE_TRANS_CFG </td></tr>
	 * <tr><td>SDK_DEV_FILETRANS_STO</td><td>停止文件上传</td><td>LONG,具体为开始文件上传后返回的句柄 </td></tr>
	 * </table>
	 * @param dwUserData 回调函数
	 * @param nWaitTime 等待超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native long          FileTransmit(long lLoginID, int nTransType, char szInBuf[], CB_fTransFileCallBack dwUserData, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Set display source, support output parameter
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2} return value
	 * @param pInParam  input parameter
	 * @param pOutParam  output parameter
	 * @param nWaitTime overtime
	 * @return true:successful, false: failed 
	 * \else
	 * 设置显示源, 支持输出参数
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       SetSplitSourceEx(long lLoginID, NET_IN_SET_SPLIT_SOURCE pInParam, NET_OUT_SET_SPLIT_SOURCE pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Async device registration , nSpecCap = 0 as TCP method login,nSpecCap = 6 as login under main connection
	 * @param pchDVRIP  device IP 
	 * @param wDVRPort device port
	 * @param pchUserName username
	 * @param pchPassword username password
	 * @param nSpecCap device supported capacity
	 * @param pCapParam for nSpecCap  compensation parameter,nSpecCap = 2,pCapParam fill in device SN(mobile dvr login) 
	 * @param cbLogin async registration device call function
	 * @return true:successful, false: failed
	 * \else
	 * 异步向设备注册 , nSpecCap = 0为TCP方式下的登入,nSpecCap = 6为只建主连接下的登入
	 * @param pchDVRIP 设备IP 
	 * @param wDVRPort 设备端口
	 * @param pchUserName 用户名
	 * @param pchPassword 用户密码
	 * @param nSpecCap 设备支持的能力
	 * @param pCapParam 对nSpecCap 的补充参数,nSpecCap = 2时,pCapParam填充设备序列号字串(车载dvr登录) 
	 * @param cbLogin 异步注册设备回调函数
	 * @return true:成功, false:失败
	 * \endif
	 * @see {@link INetSDK#StopLogin}
	 */
	public static native long          StartLogin(String pchDVRIP, int wDVRPort, String pchUserName, String pchPassword, int nSpecCap, String pCapParam, CB_fHaveLogin cbLogin);
	
	/**
	 * \if ENGLISH_LANG
	 * turn on real time monitoring
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelID Real time monitoring channel number, \n
	 * if rType is RType_Multiplay retained the parameters.\n
	 * When rType is RType_Multiplay_1~RType_Multiplay_16, nChannelID determines the preview picture, \n
	 * such as when RType_Multiplay_4, channel 4 or 5 or 6 or 7 preview of fifth to seventh channels in the four picture preview 
	 * @param rType enumerated type, refer to {@link SDK_RealPlayType}
	 * @param dwUser real time monitor data recall function
	 * @param dwWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 打开实时预览--同步接口, 该dwUser需要同时实现fRealDataCallBackEx和fRealPlayDisConnect
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelID 实时预览通道号,如果rType为RType_Multiplay该参数保留当rType为RType_Multiplay_1~RType_Multiplay_16时,nChannelID决定了预览的画面,如当RType_Multiplay_4时,nChannelID为4、5、6、7其中一个值表示预览第5到第7通道的四画面预览
	 * @param rType 枚举类型,详见 {@link SDK_RealPlayType} 
	 * @param dwUser 实时预览数据回调函数
	 * @param dwWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native long          StartRealPlay(long lLoginID, int nChannelID, int rType, Object dwUser, int dwWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * search recorded or not on a certain day in a month
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelId channel NO. 
	 * @param nRecordFileType record file type 
	 * <table>
	 * <tr><td>0</td><td>all record file </td></tr>
	 * <tr><td>1</td><td>external alarm</td></tr>
	 * <tr><td>2</td><td>dynamic detection alarm </td></tr>
	 * <tr><td>3</td><td>all alarms</td></tr>
	 * <tr><td>4</td><td>card No. search   </td></tr>
	 * <tr><td>5</td><td>group condition search</td></tr>
	 * </table> 
	 * @param tmMonth month  
	 * @param pchCardid card NO.(search type is card NO. search, valid, otherwise fill in NULL)
	 * @param pRecordStatus status info or not on a certain day in a month 
	 * @param waittime search overtime length 
	 * @return true:success, false:failed
	 * \else
	 * 查询某月的各天是否存在录像文件
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelId 通道号
	 * @param nRecordFileType 录像文件类型
	 * <table>
	 * <tr><td>0 </td><td>所有录像文件  </td></tr>
	 * <tr><td>1</td><td> 外部报警 </td></tr>
	 * <tr><td>2</td><td> 动态检测报警 </td></tr>
	 * <tr><td>3 </td><td>所有报警 </td></tr>
	 * <tr><td>4</td><td> 卡号查询  </td></tr>
	 * <tr><td>5</td><td> 组合条件查询</td></tr>
	 * </table> 
	 * @param tmMonth 月份 
	 * @param pchCardid 卡号(查询类型为卡号查询时有效,其他情况填NULL) 
	 * @param pRecordStatus 某月的各天是否存在录像的状态信息 
	 * @param waittime 超时时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       QueryRecordStatus(long lLoginID, int nChannelId, int nRecordFileType, NET_TIME tmMonth, String pchCardid, NET_RECORD_STATUS pRecordStatus, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search record file
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelId channel ID,from 0
	 * @param nRecordFileType  record file type,as follows: 
	 * <table>
	 * <tr><td>value</td><td>record file type</td></tr>
	 * <tr><td>0</td><td>all record files </td></tr>
	 * <tr><td>1</td><td>external alarm</td></tr>
	 * <tr><td>2</td><td>dynamic detection alarm</td></tr>
	 * <tr><td>3</td><td>all alarms</td></tr>
	 * <tr><td>4</td><td>card No. search </td></tr>
	 * <tr><td>5</td><td>group condition search</td></tr>
	 * <tr><td>6</td><td>record location and shifting length</td></tr>
	 * <tr><td>8</td><td>search image by card No.(currently only HB-U mand NVS special model support)</td></tr>
	 * <tr><td>9</td><td>search image(currently only HB-U and NVS special model support) </td></tr>
	 * <tr><td>10</td><td>search by text</td></tr>
	 * <tr><td>15</td><td>return to network data structure</td></tr>
	 * <tr><td>16</td><td>search all transparent serial data record file</td></tr>
	 * </table>
	 * @param stTimeStart  record start time 
	 * @param stTimeEnd  record end time
	 * @param cardID cardID
	 * @param stFileInfo returned record file info, is one {@link NET_RECORDFILE_INFO} structure group
	 * @param nFileCount returned file number,as output parameter up to records when at full buffering;
	 * @param nWaitTime  waiting time 
	 * @param bTime  search by time or not(not availbe now)
	 * @return true:success, false:failed
	 * \else
	 * 查找录像文件
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelId 通道ID,从0开始 
	 * @param nRecordFileType  录像文件类型
	 * <table>
	 * <tr><td>数值</td><td>录象文件类型 </td></tr>
	 * <tr><td>0</td><td>所有录像文件  </td></tr>
	 * <tr><td>1</td><td>外部报警 </td></tr>
	 * <tr><td>2</td><td>动态检测报警 </td></tr>
	 * <tr><td>3</td><td>所有报警 </td></tr>
	 * <tr><td>4</td><td>卡号查询  </td></tr>
	 * <tr><td>5</td><td>组合条件查询 </td></tr>
	 * <tr><td>6</td><td>录像位置与偏移量长度 </td></tr>
	 * <tr><td>8</td><td>按卡号查询图片(目前仅HB-U和NVS特殊型号的设备支持) </td></tr>
	 * <tr><td>9</td><td>查询图片(目前仅HB-U和NVS特殊型号的设备支持)  </td></tr>
	 * <tr><td>10</td><td>按字段查询 </td></tr>
	 * <tr><td>15</td><td>返回网络数据结构(金桥网吧) </td></tr>
	 * <tr><td>16</td><td>查询所有透明串数据录像文件 </td></tr>
	 * </table>
	 * @param stTimeStart  录像开始时间 
	 * @param stTimeEnd  录像结束时间
	 * @param cardID 卡号
	 * @param stFileInfo 返回的录像文件信息
	 * @param nFileCount 返回的文件个数，属于输出参数最大只能查到缓冲满为止的录像记录; 
	 * @param nWaitTime  等待时间 
	 * @param bTime  是否按时间查(目前无效) 
	 * @return true:成功, false:失败
	 * \endif
	 * @see PlayBackByRecordFile PlayBackByRecordFileEx PausePlayBack SeekPlayBack StopPlayBack GetPlayBackOsdTime StepPlayBack GetFramePlayBack SetFramePlayBack SlowPlayBack FastPlayBack
	 */
	public static native boolean		QueryRecordFile(long lLoginID , int nChannelId , int nRecordFileType, NET_TIME stTimeStart , NET_TIME stTimeEnd , String cardID ,  
														NET_RECORDFILE_INFO stFileInfo[], Integer nFileCount , int nWaitTime , boolean bTime);

	/**
	 * \if ENGLISH_LANG
	 * Query all video files within a time period
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam 	Interface input parameters, memory resources are requested and released by the user
	 * @param pstOutParam  	Interface output parameters, memory resources are requested and released by the user
	 * @param nWaitTime  Interface timeout, in milliseconds
	 * @return true:success, false:failed
	 * \else
	 * 查询时间段内的所有录像文件
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 	接口输入参数, 内存资源由用户申请和释放
	 * @param pstOutParam  	接口输出参数, 内存资源由用户申请和释放
	 * @param nWaitTime  接口超时时间, 单位毫秒
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean		QueryRecordFileEx(long lLoginID , NET_IN_QUERY_RECORD_FILE_EX pstInParam , NET_OUT_QUERY_RECORD_FILE_EX pstOutParam , int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * interface of get video input information
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam 	Interface input parameters, memory resources are requested and released by the user
	 * @param pstOutParam  	Interface output parameters, memory resources are requested and released by the user
	 * @param nWaitTime  Interface timeout, in milliseconds
	 * @return true:success, false:failed
	 * \else
	 * 获取接入通道状态信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 	接口输入参数, 内存资源由用户申请和释放
	 * @param pstOutParam  	接口输出参数, 内存资源由用户申请和释放
	 * @param nWaitTime  接口超时时间, 单位毫秒
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean		GetVideoInputInfo(long lLoginID , NET_IN_GET_VIDEO_INPUT_INFO pstInParam , NET_OUT_GET_VIDEO_INPUT_INFO pstOutParam , int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *  remote open door
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam 	Interface input parameters, memory resources are requested and released by the user
	 * @param pstOutParam  	Interface output parameters, memory resources are requested and released by the user
	 * @param nWaitTime  Interface timeout, in milliseconds
	 * @return true:success, false:failed
	 * \else
	 * 远程认证开门（闸机）
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 	接口输入参数, 内存资源由用户申请和释放
	 * @param pstOutParam  	接口输出参数, 内存资源由用户申请和释放
	 * @param nWaitTime  接口超时时间, 单位毫秒
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean		FaceOpenDoor(long lLoginID , NET_IN_FACE_OPEN_DOOR pstInParam , NET_OUT_FACE_OPEN_DOOR pstOutParam , int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * quickly search record file in certain interval, if exceends 16, then only the earliest 16 records are available for view
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelId channel ID,from 0 
	 * @param nRecordFileType record file type,as:\n
	 * 0 all record file   \n
	 * 1 external alarm \n
	 * 2 dynamic detection alarm \n
	 * 3 all alarms \n
	 * 4 card number search \n
	 * 5 group condition search\n
	 * 6 record location and shift length\n
	 * 8 search image by card NO.(currently only HB-U and NVS special model support)\n
	 * 9 search image(currently only HB-U and NVS special model support) \n
	 * 10 search by text \n
	 * 15 return network data structure\n
	 * 16 search all transparent serial data record files
	 * @param time_start record start time 
	 * @param time_end record end time 
	 * @param cardid card No.,only for card NO. search,others fill in NULL 
	 * @param fileinfo returned record file info, is one {@link NET_RECORDFILE_INFO} structure group
	 * @param filecount returned file number,as output parameter up to records when at full buffering;
	 * @param waittime waiting time 
	 * @param bTime search by time or not(invlid now)
	 * @return true:success, false:failed
	 * \else
	 * 快速查询时间段内的录像文件,如果时间段内录像超过16条时,只返回时间最早的16段录像
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelId 通道ID,从0开始
	 * @param nRecordFileType 录像文件类型\n
	 * 0 所有录像文件  \n
	 * 1 外部报警 \n
	 * 2 动态检测报警 \n
	 * 3 所有报警 \n
	 * 4 卡号查询  \n
	 * 5 组合条件查询\n
	 * 6 录像位置与偏移量长度\n
	 * 8 按卡号查询图片(目前仅HB-U和NVS特殊型号的设备支持)\n
	 * 9 查询图片(目前仅HB-U和NVS特殊型号的设备支持)\n
	 * 10 按字段查询 \n
	 * 15 返回网络数据结构(金桥网吧) \n
	 * 16 查询所有透明串数据录像文件 
	 * @param time_start 录像开始时间
	 * @param time_end 录像结束时间
	 * @param cardid 卡号,只针对卡号查询有效,其他情况下可以填NULL 
	 * @param fileinfo 返回的录像文件信息,是一个 {@link NET_RECORDFILE_INFO}结构数组
	 * @param filecount 返回的文件个数,属于输出参数最大只能查到缓冲满为止的录像记录
	 * @param waittime 等待时间  
	 * @param bTime 是否按时间查(目前无效)
	 * @return true:成功, false:失败
	 * \endif
	 * @see PlayBackByRecordFile PlayBackByRecordFileEx PausePlayBack SeekPlayBack StopPlayBack GetPlayBackOsdTime StepPlayBack GetFramePlayBack SetFramePlayBack SlowPlayBack FastPlayBack
	 */
	public static native boolean       QuickQueryRecordFile(long lLoginID, int nChannelId, int nRecordFileType, NET_TIME time_start, NET_TIME time_end, 
            												String cardid, NET_RECORDFILE_INFO fileinfo[], Integer filecount, int waittime, boolean bTime);
	
	/**
	 * \if ENGLISH_LANG
	 * search the earliest record time
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nRecordFileType record type, refer to {@link INetSDK#QueryRecordFile}
	 * @param pchCardid card NO. search valid for card No. only,other searchs fill in NULL  
	 * @param pFurthrestTime return to the earliest record info structure 
	 * @param nWaitTime overtime of waiting 
	 * @return true:success, false:failed
	 * \else
	 * 查询最早录像时间
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nRecordFileType 录像类型,详见 {@link INetSDK#QueryRecordFile}
	 * @param pchCardid 卡号,只针对卡号查询有效,其他情况下可以填NULL 
	 * @param pFurthrestTime 返回最早录像信息结构体 
	 * @param nWaitTime 超时时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       QueryFurthestRecordTime(long lLoginID, int nRecordFileType, String pchCardid, NET_FURTHEST_RECORD_TIME pFurthrestTime, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * According to the file playback of video, support for wait sync playback request command, i.e. in until the device information, interface will return results, while adding a callback function callback the playback process interrupt event information
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param lpRecordFile record file info 
	 * @param cbDownLoadPos progress recall parameter
	 * @param fDownLoadDataCallBack  data recall function
	 * @param fDisConnectCallBack video monitoring disconnect recall function
	 * @param dwWaitTime waiting time 
	 * @return successful return to net playback ID,failed return to 0
	 * \else
	 * 按文件方式回放--回调回放中断事件
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param lpRecordFile 录像文件信息
	 * @param cbDownLoadPos 进度回调函数
	 * @param fDownLoadDataCallBack  数据回调函数
	 * @param fDisConnectCallBack 视频预览断开回调函数
	 * @param dwWaitTime 等待时间 
	 * @return 成功返回网络回放ID,失败返回0
	 * \endif
	 * @see PausePlayBack SeekPlayBack StopPlayBack GetPlayBackOsdTime StepPlayBack GetFramePlayBack SetFramePlayBack SlowPlayBack FastPlayBack
	 */
	public static native long          StartPlayBackByRecordFile(long lLoginID, NET_RECORDFILE_INFO lpRecordFile, CB_fDownLoadPosCallBack cbDownLoadPos, CB_fDataCallBack fDownLoadDataCallBack, CB_fRealPlayDisConnect fDisConnectCallBack, int dwWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * By the time the pattern playback, support for wait sync playback request command, i.e. in until the device information, interface will return results, while adding a callback function callback the playback process interrupt event information
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelID image channel NO.,must be appointed 
	 * @param lpStartTime start time 
	 * @param lpStopTime end time 
	 * @param cbDownLoadPos progress recall user parameter
	 * @param fDownLoadDataCallBack  data recall function
	 * @param fDisConnectCallBack  video monitoring disconnect recall function explanation 
	 * @param dwWaitTime waiting time 
	 * @return successful return to net playback ID, failed return to 0
	 * \else
	 * 按时间方式回放--回调回放中断事件
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelID 图像通道号,必须指定
	 * @param lpStartTime 开始时间
	 * @param lpStopTime 结束时间
	 * @param cbDownLoadPos 进度回调用户参数
	 * @param fDownLoadDataCallBack  数据回调函数
	 * @param fDisConnectCallBack  视频预览断开回调函数
	 * @param dwWaitTime 等待时间
	 * @return 成功返回网络回放ID,失败返回0
	 * \endif
	 * @see PausePlayBack SeekPlayBack StopPlayBack GetPlayBackOsdTime StepPlayBack GetFramePlayBack SetFramePlayBack SlowPlayBack FastPlayBack FramCotrolPlayBackByTime
	 */
	public static native long          StartPlayBackByTime(long lLoginID, int nChannelID, NET_TIME lpStartTime, NET_TIME lpStopTime, 
														   CB_fDownLoadPosCallBack cbDownLoadPos, CB_fDataCallBack fDownLoadDataCallBack, CB_fRealPlayDisConnect fDisConnectCallBack, int dwWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Video compreseed file playback 
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2} return value
	 * @param lpRecordFile input parameter,see {@link NET_SYNOPSISFILE_INFO}
	 * @param cbDownLoadPos call progress call function
	 * @param fDownLoadDataCallBack playback data call function
	 * @param dwUser user info
	 * @return true:successful, false: failed 
	 * \else
	 * 视频浓缩文件回放 
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param lpRecordFile 输入参数,详见 {@link NET_SYNOPSISFILE_INFO}
	 * @param cbDownLoadPos 回放进度回调函数
	 * @param fDownLoadDataCallBack 回放数据回调函数
	 * @param dwUser 用户信息
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native long          PlayBackBySynopsisFile(long lLoginID, NET_SYNOPSISFILE_INFO lpRecordFile, CB_fDownLoadPosCallBack cbDownLoadPos, CB_fDataCallBack fDownLoadDataCallBack, Object dwUser);
	
	/**
	 * \if ENGLISH_LANG
	 * search extra stream channel record status
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pRSBuffer record status buffering area,total length must be no lower than total channels. return value meaning as follows:
	 * <table>
	 * <tr><td>value</td><td>meaning</td></tr> 
	 * <tr><td>0</td><td>not record</td></tr> 
	 * <tr><td>1</td><td>manually record</td></tr> 
	 * <tr><td>2</td><td>auto record </td></tr>
	 * </table>
	 * @param nRSBufferlen return pRSBuffer buffering record status info length,each channel as 1 byte 
	 * @param waittime waiting time 
	 * @return true:success, false:failed
	 * \else
	 * 查道辅码流通道录像状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pRSBuffer 录像状态缓冲区,总长度不能小于通道数
	 * <table>
	 * <tr><td>数值</td><td>意义 </td></tr>
	 * <tr><td>0</td><td>为不录像 </td></tr>
	 * <tr><td>1</td><td>手动录像 </td></tr>
	 * <tr><td>2</td><td>为自动录像 </td></tr>
	 * </table>
	 * @param nRSBufferlen 返回pRSBuffer缓冲中录像状态信息长度,每一个通道为1个字节 
	 * @param waittime 等待时间  
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       QueryExtraRecordState(long lLoginID, byte pRSBuffer[], Integer nRSBufferlen, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * Search remote device status
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2} return value
	 * @param nType search type
	 * <table>
	 * <tr><td>Value</td><td>record file type </td></tr>
	 * <tr><td>0</td><td>All record files </td></tr>
	 * <tr><td>1</td><td>External alarm </td></tr>
	 * <tr><td>2</td><td>Motion detection alarm </td></tr>
	 * <tr><td>3</td><td>All alarms </td></tr>
	 * <tr><td>4</td><td>Card search </td></tr>
	 * <tr><td>5</td><td>Combined filter </td></tr>
	 * </table>
	 * @param nChannelID  Channel no.
	 * @param pRSBuffer Output parameter, corresponding to search type
	 * @param pRetLen  output content length
	 * @param waittime  waiting time 
	 * @return true:successful, false: failed 
	 * \else
	 * 查询远程设备状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nType 查询类型
	 * <table>
	 * <tr><td>数值</td><td>录象文件类型 </td></tr>
	 * <tr><td>0</td><td>所有录像文件  </td></tr>
	 * <tr><td>1</td><td>外部报警 </td></tr>
	 * <tr><td>2</td><td>动态检测报警 </td></tr>
	 * <tr><td>3</td><td>所有报警 </td></tr>
	 * <tr><td>4</td><td>卡号查询  </td></tr>
	 * <tr><td>5</td><td>组合条件查询 </td></tr>
	 * </table>
	 * @param nChannelID 通道号
	 * @param pRSBuffer 输出参数,与查询类型对应
	 * @param pRetLen 输出内容长度
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       QueryRemotDevState(long lLoginID, int nType, int nChannelID, Object pRSBuffer, Integer pRetLen, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search system info, different info have different data structure
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nSystemType search capacity type,as:
	 * <table>
	 * <tr><td>definition</td><td>capacity type</td><td>pSysInfoBuffer corresponding structure</td></tr>
	 * <tr><td>ABILITY_DYNAMIC_CONNECT</td><td>search dynamic multiple connection capacity</td><td>return one BOOL type,TRUE is support,FALSE is not support</td></tr>
	 * <tr><td>ABILITY_WATERMARK_CFG</td><td>water mark config capacity</td><td>SDK_WATERMAKE_EN </td></tr>
	 * <tr><td>ABILITY_WIRELESS_CFG	</td><td>wireless config capacity</td><td>SDK_WIRELESS_EN </td></tr>
	 * <tr><td>ABILITY_DEVALL_INFO</td><td>device capacity list </td><td>SDK_DEV_ENABLE_INFO </td></tr>
	 * <tr><td>ABILITY_CARD_QUERY</td><td>card No. search capacity</td><td>SDK_CARD_QUERY_EN </td></tr>
	 * <tr><td>ABILITY_MULTIPLAY</td><td>multi-window preview capacity</td><td>SDK_MULTIPLAY_EN </td></tr>
	 * <tr><td>ABILITY_QUICK_QUERY_CFG</td><td>quick search config capacity</td><td>SDK_QUICK_QUERY_CFG_EN </td></tr>
	 * <tr><td>ABILITY_INFRARED</td><td>wireless alarm capacity</td><td>SDK_WIRELESS_ALARM_INFO </td></tr>
	 * <tr><td>ABILITY_TRIGGER_MODE</td><td>alarm output trigger method capacity</td><td>return one int type.0 is support,<0 is not support</td></tr>
	 * <tr><td>ABILITY_DISK_SUBAREA</td><td>network hard disk segmentation capacity</td><td>SDK_DISK_SUBAREA_EN </td></tr>
	 * <tr><td>ABILITY_DSP_CFG</td><td>network DSP capacity</td><td>SDK_DSP_CFG </td></tr>
	 * <tr><td>ABILITY_STREAM_MEDIA</td><td>search SIP,RTSP capacity</td><td>SDK_STREAM_MEDIA_EN </td></tr>
	 * <tr><td>ABILITY_INTELLI_TRACKER</td><td>search intelligent tracking capacity</td><td>SDK_INTELLI_TRACKER_EN </td></tr>
	 * </table>
	 * @param pSysInfoBuffer received protocol buffering area 
	 * @param waittime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 查询系统能力信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nSystemType 查询能力类型
	 * <table>
	 * <tr><td>定义</td><td>能力类型	</td><td>pSysInfoBuffer对应结构体 </td></tr>
	 * <tr><td>ABILITY_DYNAMIC_CONNECT</td><td>查询动态多连接能力</td><td>返回一个BOOL类型,TRUE表示支持,FALSE表示不支持 </td></tr>
	 * <tr><td>ABILITY_WATERMARK_CFG</td><td>水印配置能力</td><td>SDK_WATERMAKE_EN </td></tr>
	 * <tr><td>ABILITY_WIRELESS_CFG</td><td>wireless配置能力</td><td>SDK_WIRELESS_EN </td></tr>
	 * <tr><td>ABILITY_DEVALL_INFO</td><td>设备的能力列表 </td><td>SDK_DEV_ENABLE_INFO </td></tr>
	 * <tr><td>ABILITY_CARD_QUERY</td><td>卡号查询能力</td><td>SDK_CARD_QUERY_EN </td></tr>
	 * <tr><td>ABILITY_MULTIPLAY</td><td>多画面预览能力 </td><td>SDK_MULTIPLAY_EN </td></tr>
	 * <tr><td>ABILITY_QUICK_QUERY_CFG</td><td>快速查询配置能力  </td><td>SDK_QUICK_QUERY_CFG_EN </td></tr>
	 * <tr><td>ABILITY_INFRARED</td><td>无线报警能力</td><td>SDK_WIRELESS_ALARM_INFO </td></tr>
	 * <tr><td>ABILITY_TRIGGER_MODE</td><td>报警输出触发方式能力 </td><td>返回一个int类型,0表示支持,<0表示不支持 </td></tr>
	 * <tr><td>ABILITY_DISK_SUBAREA</td><td>网络硬盘分区能力</td><td>SDK_DISK_SUBAREA_EN </td></tr>
	 * <tr><td>ABILITY_DSP_CFG</td><td>网络DSP能力 </td><td>SDK_DSP_CFG </td></tr>
	 * <tr><td>ABILITY_STREAM_MEDIA</td><td>查询SIP,RTSP能力  </td><td>SDK_STREAM_MEDIA_EN </td></tr>
	 * <tr><td>ABILITY_INTELLI_TRACKER</td><td>查询智能跟踪能力</td><td>SDK_INTELLI_TRACKER_EN </td></tr>
	 * </table>
	 * @param pSysInfoBuffer 接收的协议缓冲区
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       QuerySystemInfo(long lLoginID, int nSystemType, Object pSysInfoBuffer, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search system capacity info,by character string format
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param szCommand command parameter,as ParseData
	 * @param nChannelID channel number 
	 * @param szOutBuffer received protocol buffering area 
	 * @param error wrong number \n
	 * 0 successful\n
	 * 1 failed \n
	 * 2 illegal data \n
	 * 3 temporarily not available \n
	 * 4 not authorized 
	 * @param waittime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 新系统能力查询接口,查询系统能力信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param szCommand 命令参数,详见 ParseData
	 * @param nChannelID 通道号
	 * @param szOutBuffer 接收的协议缓冲区
	 * @param error 错误号\n
	 * 0 成功 \n
	 * 1 失败 \n
	 * 2 数据不合法 \n
	 * 3 暂时无法设置 \n
	 * 4 没有权限 
	 * @param waittime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       QueryNewSystemInfo(long lLoginID, String szCommand, int nChannelID, char szOutBuffer[], Integer error, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * New Search system capacity information extend interface(by Json)
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param szCommand command parameter,as ParseData
	 * @param nChannelID channel number
	 * @param szOutBuffer received protocol buffering area
	 * @param error wrong number \n
	 * 0 successful\n
	 * 1 failed \n
	 * 2 illegal data \n
	 * 3 temporarily not available \n
	 * 4 not authorized
	 * @param pstExtendInfo Extend data info, refer to param szCommand
	 * @param waittime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 新系统能力查询接口扩展，查询系统能力信息，入参新增扩展数据(以Json格式，具体见配置SDK)(szOutBuffer内存由用户申请释放)
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param szCommand 命令参数,详见 ParseData
	 * @param nChannelID 通道号
	 * @param szOutBuffer 接收的协议缓冲区
	 * @param error 错误号\n
	 * 0 成功 \n
	 * 1 失败 \n
	 * 2 数据不合法 \n
	 * 3 暂时无法设置 \n
	 * 4 没有权限
	 * @param pstExtendInfo 根据szCommand得出对应的扩展数据信息
	 * @param waittime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       QueryNewSystemInfoEx(long lLoginID, String szCommand, int nChannelID, char szOutBuffer[], Integer error, Object pstExtendInfo, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * set net update program for front end device
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType enumeration value, refer to {@link EM_UPGRADE_TYPE} 
	 * @param pchFileName need to update file name	
	 * @param cbUpgrade update progress recall function
	 * @return successful return to update handle ID,failed return to 0
	 * \else
	 * 开始升级设备程序--扩展
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType 枚举值,取值参考  {@link EM_UPGRADE_TYPE}
	 * @param pchFileName 要升级的文件名 	
	 * @param cbUpgrade 升级进度回调函数
	 * @return 成功返回升级句柄ID,失败返回0
	 * \endif
	 * @see {@link INetSDK#SendUpgrade}  {@link INetSDK#StopUpgrade}
	 */
	public static native long          StartUpgradeEx(long lLoginID, int emType, String pchFileName, CB_fUpgradeCallBack cbUpgrade);

	/**
	 * \if ENGLISH_LANG
	 * Begin upgrading device program--extensive,support large file  upgrade,for example G bytes file
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType enumeration value, refer to {@link EM_UPGRADE_TYPE}
	 * @param pchFileName need to update file name
	 * @param cbUpgradeEx update progress recall function
	 * @return successful return to update handle ID,failed return to 0
	 * \else
	 * 开始升级设备程序--扩展支持G以上文件升级
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType 枚举值,取值参考  {@link EM_UPGRADE_TYPE}
	 * @param pchFileName 要升级的文件名
	 * @param cbUpgradeEx 升级进度回调函数
	 * @return 成功返回升级句柄ID,失败返回0
	 * \endif
	 * @see {@link INetSDK#SendUpgrade}  {@link INetSDK#StopUpgrade}
	 */
	public static native long          StartUpgradeEx2(long lLoginID, int emType, String pchFileName, CB_fUpgradeCallBackEx cbUpgradeEx);

	/**
	 * \if ENGLISH_LANG
	 * search LAN device
	 * @param szBuf user open up buffering,used in receiving {@link DEVICE_NET_INFO} structure,search out several devices,and return these structures
	 * @param nRetNum szBuf buffering length 
	 * @param dwSearchTime search waiting time 
	 * @return true:success, false:failed
	 * \else
	 * 搜索局域网内IPC、NVS等设备
	 * @param szBuf 用户开辟缓存,用来接收 {@link DEVICE_NET_INFO} 结构体,查询到几个设备,就返回几个这样的结构体
	 * @param nRetNum szBuf缓存长度
	 * @param dwSearchTime 查询等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       SearchDevices(DEVICE_NET_INFO szBuf[], Integer nRetNum, int dwSearchTime);
	
	/**
	 * \if ENGLISH_LANG
	 * snapshot request extention interface
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param par
	 * @return true:success, false:failed
	 * \else
	 * 抓图请求
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param par
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       SnapPictureEx(long lLoginID, SNAP_PARAMS par);
	
	/**
	 * \if ENGLISH_LANG
	 * real time upload intelligent analyasis data－image
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelID channel NO. 
	 * @param dwAlarmType alarm type
	 * @param cbAnalyzerData  intelligent data analysis recall function
	 * @return intelligent data analysis recall function 
	 * \else
	 * 实时上传智能分析数据－图片
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelID 通道号
	 * @param dwAlarmType 报警类型
	 * @param cbAnalyzerData  智能数据分析回调函数
	 * @return 失败返回0,成功返回上传句柄,将作为相关函数的参数
	 * \endif
	 * @see {@link INetSDK#StopLoadPic}
	 */
	public static native long          RealLoadPicture(long lLoginID, int nChannelID, int dwAlarmType, CB_fAnalyzerDataCallBack cbAnalyzerData);
	
	/**
	 * \if ENGLISH_LANG
	 * search file by criteria
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType mediafile search criteria , refer to {@link EM_FILE_QUERY_TYPE}
	 * @param pQueryCondition criteria 
	 * @param waittime waiting time 
	 * @return successful return to search handle,failed return to 0. 
	 * \else
	 * 开始查找录像文件：返回值 0 失败, >0 查找句柄
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType media文件查询条件,参考 {@link EM_FILE_QUERY_TYPE}
	 * @param pQueryCondition 查询条件
	 * @param waittime 等待时间 
	 * @return 成功返回查询句柄,失败返回0
	 * \endif
	 * @see {@link INetSDK#FindNextFileEx}  {@link INetSDK#FindCloseEx}
	 */
	public static native long          FindFileEx(long lLoginID, int emType, Object pQueryCondition, int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * search media file
	 * @param lFindHandle {@link INetSDK#FindFileEx} return value
	 * @param emType mediafile search criteria , refer to {@link EM_FILE_QUERY_TYPE}
	 * @param pMediaFileInfo file record buffering, to export searched media file records
	 * @param waittime waiting time 
	 * @return return value as info items of searched media file return value lower than nFilecount as completion of file search in corresponding time interval. 
	 * \else
	 * 查找录像文件：返回值 :文件条数 < nFilecount 查询结束
	 * @param lFindHandle {@link INetSDK#FindFileEx}的返回值
	 * @param emType media文件查询条件,参考 {@link EM_FILE_QUERY_TYPE}
	 * @param pMediaFileInfo 文件记录缓冲,用于输出查询到的媒体文件记录
	 * @param waittime 等待时间 
	 * @return 返回值为查询到的媒体文件信息条数 返回值小于nFilecount则相应时间段内的文件查询完毕
	 * \endif
	 */
	public static native int           FindNextFileEx(long lFindHandle, int emType, Object pMediaFileInfo[], int waittime);
	
	/**
	 * \if ENGLISH_LANG
	 * download designated intelligent analysis data
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType  mediafile search criteria
	 * @param lpMediaFileInfo  media file info, in structure {@link MEDIAFILE_TRAFFICCAR_INFO}
	 * @param sSavedFileName  file name to save 
	 * @param cbDownLoadPos download recall function
	 * @return download function handle
	 * \else
	 * 下载指定的智能分析数据 - 图片
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType  查询条件
	 * @param lpMediaFileInfo  媒体文件信息,传的是结构体  {@link MEDIAFILE_TRAFFICCAR_INFO}
	 * @param sSavedFileName  文件保存名称 
	 * @param cbDownLoadPos 下载回调函数 
	 * @return 下载函数句柄
	 * \endif
	 * @see {@link INetSDK#StopDownloadMediaFile}
	 */
	public static native long          DownloadMediaFile(long lLoginID, int emType, Object lpMediaFileInfo, String sSavedFileName, CB_fDownLoadPosCallBack cbDownLoadPos);
	
	/**
	 * \if ENGLISH_LANG
	 * traffic snapshot--net trigger method
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nChannelID channel NO.
	 * @param pstInParam snapshot parameter
	 * @param pstOutParam snapshot return value
	 * @return true:success, false:failed
	 * \else
	 * 交通抓拍--网络触发方式
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nChannelID 通道号
	 * @param pstInParam 抓拍参数
	 * @param pstOutParam 抓拍返回值 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		TrafficSnapByNetwork(long lLoginID, int nChannelID, NET_IN_SNAPSHOT pstInParam, NET_OUT_SNAPSHOT pstOutParam);
	
	/**
	 * \if ENGLISH_LANG
	 * traffic snapshot--net trigger method
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nQueryType  Query Type
	 * @param InObject  Query In Param
	 * @param OutObject  Query Out Param
	 * @param ReservedObject  Query Reserved Param
	 * @param nWaitTime    waiting time
	 * @return true:success, false:failed
	 * \else
	 * 查询设备信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nQueryType 	查询类型
	 * @param InObject 查询输入参数
	 * @param OutObject  查询输出参数
	 * @param ReservedObject	保留参数
	 * @param nWaitTime  等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		 	QueryDevInfo(long lLoginID, int nQueryType, Object InObject , Object OutObject, Object ReservedObject  , int nWaitTime );
	
	/**
	 * \if ENGLISH_LANG
	 * start local recording function,recording collected audio data via StartTalkEx recall user,corresponding operation is {@link INetSDK#RecordStop}
	 * @return true:success, false:failed
	 * \else
	 * 启动本地录音功能,录音采集出来的音频数据通过 StartTalkEx 的回调函数回调给用户,对应操作是 {@link INetSDK#RecordStop}
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean		RecordStart();
	
	/**
	 * \if ENGLISH_LANG
	 * stop local recording,corresponding operation is {@link INetSDK#RecordStart}
	 * @return true:success, false:failed
	 * \else
	 * 停止本地录音,对应操作是 {@link INetSDK#RecordStart}
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		RecordStop();

	/**
	 * \if ENGLISH_LANG
	 * start PC record(to CLIENT_RecordStart()extend),corresponding operation is {@link INetSDK#RecordStop}
	 * @return true:success, false:failed
	 * \else
	 * 开始PC端录音(对CLIENT_RecordStart()扩展),对应操作是 {@link INetSDK#RecordStop}
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean		RecordStartEx(long lLoginID);

	/**
	 * \if ENGLISH_LANG
	 * get device caps
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param nType device type,refer to {@link FinalVar}
	 * @param pInBuf input param 
	 * @param pOutBuf output param 
	 * @param nWaitTime waitting time
	 * @return true:success, false:failed
	 * \else
	 * 获取设备能力
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param nType 设备能力类型,参考 {@link FinalVar}
	 * @param pInBuf 输入缓存
	 * @param pOutBuf 输出缓存
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        GetDevCaps(long lLoginID, int nType, Object pInBuf, Object pOutBuf, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * @param pAudioDataBuf 要求解码的音频数据内容
	 * @return true:success, false:failed
	 * \else
	 * 对输入的音频数据进行解码
	 * @param pAudioDataBuf 要求解码的音频数据内容
	 * @return 无
	 * \endif
	 */
	public static native void 			AudioDec(byte[] pAudioDataBuf);
	
	/**
	 * \if ENGLISH_LANG
	 * @param src 语音数据
	 * @param dest 编码后的数据
	 * @param srclen 语音数据长度 
	 * @return true:success, false:failed
	 * \else
	 * 语音采集后进行编码
	 * @param src 语音数据
	 * @param dest 编码后的数据
	 * @param srclen 语音数据长度 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native int           g711aEncode(byte src[], byte dest[], int srclen);
	
	/**
	 * \if ENGLISH_LANG
	 * @param src 语音数据
	 * @param dest 编码后的数据
	 * @param srclen 语音数据长度 
	 * @return true:success, false:failed
	 * \else
	 * 语音采集后进行编码
	 * @param src 语音数据
	 * @param dest 编码后的数据
	 * @param srclen 语音数据长度 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native int           g711uEncode(byte src[], byte dest[], int srclen);
	
	/**
	 * \if ENGLISH_LANG
	 * Subscribe to the video phone status information,user malloc memory of pInBuf and pOutBuf
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param dwAttachCb The callback function prototypes of subscribe to video phone
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 订阅视频电话状态信息,pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param dwAttachCb 订阅视频电话状态信息回调函数原型
	 * @param pOutParam  输出参数 
	 * @param nWaitTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native long          AttachVTPCallState(long lLoginID, NET_IN_VTP_CALL_STATE_ATTACH pInParam, CB_fVTPCallStateCallBack dwAttachCb, NET_OUT_VTP_CALL_STATE_ATTACH pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Unsubscribe video phone status information
	 * @param lCallStateHandle return invalue of interface {@link INetSDK#AttachVTPCallState}
	 * @return true:success, false:failed
	 * \else
	 * 取消订阅视频电话状态信息
	 * @param lCallStateHandle 接口 {@link INetSDK#AttachVTPCallState} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       DetachVTPCallState(long lCallStateHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * get all valid display source,user malloc and free (pInParam's and pOutParam's) memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam output param
	 * @param nWaitTime waiting
	 * @return true:success, false:failed
	 * \else
	 * 获取所有有效显示源,pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 等待时间 
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       MatrixGetCameras(long lLoginID, SDK_IN_MATRIX_GET_CAMERAS pInParam, SDK_OUT_MATRIX_GET_CAMERAS pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * open log function
	 * @param pstLogPrintInfo user malloc memory
	 * @return true:success, false:failed
	 * \else
	 * 打开日志功能
	 * @param pstLogPrintInfo 内存由用户申请释放
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       LogOpen(LOG_SET_PRINT_INFO pstLogPrintInfo);
	
	/**
	 * \if ENGLISH_LANG
	 * close log function
	 * @return true:success, false:failed
	 * \else
	 * 关闭日志功能
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       LogClose();
	
	/**
	 * \if ENGLISH_LANG
	 * set mobile push notification, use RegisterID to identify the config info,user malloc and free pstuCfg's memory
	 * @param lLoginID handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuCfg  configuration object
	 * @param nError   error code
	 * @param nRestart is need to restart device
	 * @param nWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 手机订阅推送信息, 使用RegisterID标识配置项,pstuCfg内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuCfg  配置入参对象
	 * @param nError   错误码
	 * @param nRestart 是否需要重启设备生效
	 * @param nWaitTime 等待超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       SetMobilePushNotify(long lLoginID, NET_MOBILE_PUSH_NOTIFY pstuCfg, Integer nError, Integer nRestart, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * delete mobile push notification, use RegisterID to identify the config info,user malloc and free memory of pstuIn and pstuOut
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuIn registerid and appid
	 * @param pstuOut error code and restart flag
	 * @param nWaitTime waiting time
	 * @returntrue:success, false:failed
	 * \else
	 * 删除手机订阅推送信息, 使用RegisterID标识配置项,pstuIn与pstuOut内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuIn registerid 和  appid
	 * @param pstuOut 错误码和重启标识
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       DelMobilePushNotify(long lLoginID, NET_MOBILE_PUSH_NOTIFY_DEL pstuIn, NET_OUT_DELETECFG pstuOut, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * set mobile push notification, use RegisterID to identify the config info,user malloc and free pstuCfg's memory 
	 * @param lLoginID handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuCfg  configuration object
	 * @param nError   error code
	 * @param nRestart is need to restart device
	 * @param nWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 手机订阅推送信息, 使用RegisterID标识配置项,pstuCfg内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuCfg  配置入参对象
	 * @param nError   错误码
	 * @param nRestart 是否需要重启设备生效
	 * @param nWaitTime 等待超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       SetMobileSubscribe(long lLoginID, NET_MOBILE_PUSH_NOTIFY pstuCfg, Integer nError, Integer nRestart, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * delete mobile push notification, use RegisterID to identify the config info,user malloc and free memory of pstuIn and pstuOut
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuIn registerid and appid
	 * @param pstuOut error code and restart flag
	 * @param nWaitTime waiting time
	 * @returntrue:success, false:failed
	 * \else
	 * 删除手机订阅推送信息, 使用RegisterID标识配置项,pstuIn与pstuOut内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuIn registerid 和  appid
	 * @param pstuOut 错误码和重启标识
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       DelMobileSubscribe(long lLoginID, NET_MOBILE_PUSH_NOTIFY_DEL pstuIn, NET_OUT_DELETECFG pstuOut, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * set mobile push notification config, use RegisterID+AppID to identify the info, AppID can't contain '.', use '_' instead
	 * @param lLoginID handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuCfg  configuration object
	 * @param nError   error code
	 * @param nRestart is need to restart device
	 * @param nWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 手机订阅推送信息, 使用RegisterID+AppID标识配置项，AppID内容不能带点号，点号可以用下划线代替
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuCfg  配置入参对象
	 * @param nError   错误码
	 * @param nRestart 是否需要重启设备生效
	 * @param nWaitTime 等待超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       SetMobileSubscribeCfg(long lLoginID, NET_MOBILE_PUSH_NOTIFY_CFG pstuCfg, Integer nError, Integer nRestart, int nWaitTime);


	// 
	/**
	 * \if ENGLISH_LANG
	 * get mobile push notification config, use RegisterID+AppID to identify the info, AppID cannot include ".", use "_" instead of ".",user malloc and free memory of pstuCfg
	 * @param lLoginID handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuCfg  configuration object
	 * @param nError   error code
	 * @param nWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 获取手机订阅推送信息, 使用RegisterID+AppID标识配置项,AppID内容不能带点号,点号可以用下划线代替,pstuCfg内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuCfg  配置入参对象
	 * @param nError   错误码
	 * @param nWaitTime 等待超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean  	   GetMobileSubscribeCfg(long lLoginID, NET_MOBILE_PUSH_NOTIFY_CFG  pstuCfg, Integer nError, int nWaitTime);



	/**
	 * \if ENGLISH_LANG
	 * delete mobile push notification config, use RegisterID+AppID to identify the info, AppID cannot include ".", use "_" instead of ".",user malloc and free memory of pstuIn and pstuOut
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuIn registerid and appid
	 * @param pstuOut error code and restart flag
	 * @param nWaitTime waiting time
	 * @returntrue:success, false:failed
	 * \else
	 * 删除手机订阅推送信息, 使用RegisterID+AppID标识配置项,AppID内容不能带点号,点号可以用下划线代替,pstuIn与pstuOut内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuIn registerid 和  appid
	 * @param pstuOut 错误码和重启标识
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean      DelMobileSubscribeCfg(long lLoginID, NET_MOBILE_PUSH_NOTIFY_CFG_DEL pstuIn, NET_OUT_DELETECFG pstuOut, int nWaitTime);

	/**   
	 * \if ENGLISH_LANG
	 * set mobile push notification config, use RegisterID+AppID to identify the info, AppID can't contain '.', use '_' instead
	 * @deprecated deprecated
	 * @param lLoginID handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuCfg  configuration object
	 * @param nError   error code
	 * @param nRestart is need to restart device
	 * @param nWaitTime waiting time
	 * @return true:success, false:failed
	 * \else
	 * 手机订阅推送信息, 使用RegisterID+AppID标识配置项，AppID内容不能带点号，点号可以用下划线代替
	 * @deprecated 废弃,由 SetMobileSubscribeCfg 替代
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuCfg  配置入参对象
	 * @param nError   错误码
	 * @param nRestart 是否需要重启设备生效
	 * @param nWaitTime 等待超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       SetMobilePushNotifyCfg(long lLoginID, NET_MOBILE_PUSH_NOTIFY_CFG pstuCfg, Integer nError, Integer nRestart, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * delete mobile push notification config, use RegisterID+AppID to identify the info, AppID can't contain '.', use '_' instead
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuIn registerid and appid
	 * @param pstuOut error code and restart flag
	 * @param nWaitTime waiting time
	 * @returntrue:success, false:failed
	 * \else
	 * 删除手机订阅推送信息, 使用RegisterID+AppID标识配置项，AppID内容不能带点号，点号可以用下划线代替
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuIn registerid 和  appid
	 * @param pstuOut 错误码和重启标识
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       DelMobilePushNotifyCfg(long lLoginID, NET_MOBILE_PUSH_NOTIFY_CFG_DEL pstuIn, NET_OUT_DELETECFG pstuOut, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Set optimize mode,user malloc and free pParam's memory,please refer to corresponding structure of emType
	 * @param emType refer to {@link EM_OPTIMIZE_TYPE}
	 * \else
	 * 设置最优化模式，pParam内存由用户申请释放，大小参照emType对应的结构体
	 * @param emType 取值参考 {@link EM_OPTIMIZE_TYPE} 
	 * \endif
	 */
	public static native boolean       SetOptimizeMode(int emType, Object pParam);

	/**
	 * \if ENGLISH_LANG
	 * Set GPS subscription callback function 
	 * @param cbGPSCallBack function，  for callBack gps infoNET_IN_SET_DEV_WIFI
	 * \else
	 * 设置GPS回调函数
	 * @param cbGPSCallBack 回调函数, 回调GPS信息
	 * \endif
	 */
	public static native void		  SetSubcribeGPSCallBack(CB_fSubcribeGPSCallBack cbGPSCallBack);

	/**
	 * \if ENGLISH_LANG
	 * GPS message subscription 
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param bStart start or stop
	 * @param keepTime 
	 * @param interTime
	 * @returntrue:success, false:failed
	 * \else
	 * GPS信息订阅
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param bStart 开启或者停止
	 * @param keepTime
	 * @param interTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 	 	SubcribeGPS(long lLoginID, boolean bStart, int keepTime, int interTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Set Device Position
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuIn position info
	 * @param pstuOut
	 * @param nWaitTime elapse time
	 * @return true:success, false:failed
	 * \else
	 * 设置设备地址信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuIn 要设置的位置信息
	 * @param pstuOut
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        SetDevicePosition(long lLoginID, NET_IN_SET_DEVICE_POSITION pstuIn, NET_OUT_SET_DEVICE_POSITION pstuOut, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Get Device Position
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuIn 
	 * @param pstuOut position info
	 * @param nWaitTime elapse time
	 * @return true:success, false:failed
	 * \else
	 * 设置设备地址信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuIn
	 * @param pstuOut 要设置的位置信息
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        GetDevicePosition(long lLoginID, NET_IN_GET_DEVICE_POSITION pstuIn, NET_OUT_GET_DEVICE_POSITION pstuOut, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Snap picture by event, cooperate with RealLoadPictureEx when start with "Manaul"
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuIn event info
	 * @param pstuOut 
	 * @param nWaitTime elapse time
	 * @return true:success, false:failed
	 * \else
	 * 设置设备地址信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuIn 事件的通道、类型等信息
	 * @param pstuOut
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        SnapPictureByEvent(long lLoginID, NET_IN_SNAP_BY_EVENT pstuIn, NET_OUT_SNAP_BY_EVENT pstuOut, int nWaitTime);
	
	//
	/**
	 * \if ENGLISH_LANG
	 * attach camera state
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime elapse time
	 * @return > 0 success, else failed
	 * \else
	 * 订阅摄像头状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return > 0成功，否则失败
	 * \endif
	 */
	public static native long           AttachCameraState(long lLoginID, NET_IN_CAMERASTATE pstInParam, NET_OUT_CAMERASTATE pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * stop detach camera state
	 * @param lAttachHandle, return from {@link INetSDK#AttachCameraState}
	 * @return true:success, false:failed
	 * \else
	 * 停止订阅摄像头状态
	 * @param lAttachHandle  {@link INetSDK#AttachCameraState} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        DetachCameraState(long lAttachHandle);
	 
	/**
	 * \if ENGLISH_LANG
	 * get operator name
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true:success, false:failed
	 * \else
	 * 获取操作员用户名
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		GetOperatorName(long lLoginID,  NET_IN_GET_OPERATOR_NAME pInParam, NET_OUT_GET_OPERATOR_NAME pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * open burning session, return to burning session handle
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime elapse time
	 * @return burning session handle, > 0 success, else failed
	 * \else
	 * 打开刻录会话
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return 刻录会话句柄 > 0成功，否则失败
	 * \endif
	 */
	
	public static native long  			StartBurnSession(long lLoginID, NET_IN_START_BURN_SESSION pstInParam, NET_OUT_START_BURN_SESSION pstOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * close burning session
	 * @param lBurnSession, return from {@link INetSDK#StartBurnSession}
	 * @return true:success, false:failed
	 * \else
	 * 关闭刻录会话
	 * @param lBurnSession  是 {@link INetSDK#StartBurnSession} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		StopBurnSession(long lBurnSession);
	
	/**
	 * \if ENGLISH_LANG
	 * start burning
	 * @param lBurnSession, return from {@link INetSDK#StartBurnSession}
	 * @param pstInParam 	   input param
	 * @param pstOutParam	   output param
	 * @param nWaitTime      elapse time
	 * @return true:success, false:failed
	 * \else
	 * 开始刻录
	 * @param lBurnSession  是 {@link INetSDK#StartBurnSession} 的返回值
	 * @param pstInParam	   输入参数
	 * @param pstOutParam   输出参数
	 * @param nWaitTime	   超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 	 StartBurn(long lBurnSession, NET_IN_START_BURN pstInParam, NET_OUT_START_BURN pstOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * stop burning
	 * @param lBurnSession, return from {@link INetSDK#StartBurnSession}
	 * @return true:success, false:failed
	 * \else
	 * 停止刻录
	 * @param lBurnSession  是 {@link INetSDK#StartBurnSession} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean   StopBurn(long lBurnSession);

	/**
	 * \if ENGLISH_LANG
	 * pause/recover burning
	 * @param lBurnSession   return from {@link INetSDK#StartBurnSession}
	 * @param bpause		   true-pause, false-restore
	 * @return true:success, false:failed
	 * \else
	 * 暂停/恢复刻录
	 * @param lBurnSession  是{@link INetSDK#StartBurnSession}的返回值
	 * @param bpause		   true-暂停, false-恢复
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean	   PauseBurn(long lBurnSession, boolean bpause);
	
	
	/**
	 * \if ENGLISH_LANG
	 * key mark
	 * @param lBurnSession, return from {@link INetSDK#StartBurnSession}
	 * @param pstInParam 	 input param
	 * @param pstOutParam	  output param
	 * @param nWaitTime  elapse time
	 * @return true:success, false:failed
	 * \else
	 * 重点标记
	 * @param lBurnSession  是 {@link INetSDK#StartBurnSession} 的返回值
	  * @param pstInParam	 输入参数
	 * @param pstOutParam	 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean	  BurnMarkTag(long lBurnSession, NET_IN_BURN_MARK_TAG pstInParam, NET_OUT_BURN_MARK_TAG pstOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * get burning status
	 * @param lBurnSession    return from {@link INetSDK#StartBurnSession}
	 * @param pstInParam 	input param
	 * @param pstOutParam	 output param
	 * @param nWaitTime  elapse time
	 * @return true:success, false:failed
	 * \else
	 * 获取刻录状态
	 * @param lBurnSession  是 {@link INetSDK#StartBurnSession}的返回值
	  * @param pstInParam	 输入参数
	 * @param pstOutParam	 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean	BurnGetState(long lBurnSession, NET_IN_BURN_GET_STATE pstInParam, NET_OUT_BURN_GET_STATE pstOutParam, int nWaitTime);
	
	
	/**
	 * \if ENGLISH_LANG
	 * a attach burn state
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime elapse time
	 * @return > 0 success, else failed
	 * \else
	 * 监听刻录状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return > 0成功，否则失败
	 * \endif
	 */
	public static native long		AttachBurnState(long lLoginID, NET_IN_ATTACH_STATE pstInParam, NET_OUT_ATTACH_STATE pstOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * cancel listening burning status
	 * @param lAttachHandle, return from {@link INetSDK#AttachBurnState}
	 * @return true:success, false:failed
	 * \else
	 * 取消监听刻录状态
	 * @param lAttachHandle  是 {@link INetSDK#AttachBurnState} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean    DetachBurnState(long lAttachHandle);

	/**
	 * \if ENGLISH_LANG
	 * serial data switch port,async get data
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaittime elapse time
	 * @return > 0 success, else failed
	 * \else
	 * 串口数据交互接口,异步获取数据
	 * @param lLoginID  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaittime 超时时间
	 * @return > 0成功，否则失败
	 * \endif
	 */
	public static native  long  	    ExChangeData(long lLoginID, NET_IN_EXCHANGEDATA pInParam,  NET_OUT_EXCHANGEDATA pOutParam, int nWaittime);

	/**
	 * \if ENGLISH_LANG
	 * a attach burn state
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam input param
	 * @param cbAttachCAN callback param
	 * @param pstOutParam output param
	 * @param nWaitTime elapse time
	 * @return > 0 success, else failed
	 * \else
	 * 监听CAN总线数据
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param cbAttachCAN 回调参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return > 0成功，否则失败
	 * \endif
	 */
    public static native  long  		AttachCAN(long lLoginID, NET_IN_ATTACH_CAN pstInParam, CB_fAttachCANCB cbAttachCAN, NET_OUT_ATTACH_CAN pstOutParam, int nWaitTime);
      
	/**
	 * \if ENGLISH_LANG
	 * cancel listen CAN bus data
	 * @param lAttachHandle, return from {@link INetSDK#AttachCAN}
	 * @return true:success, false:failed
	 * \else
	 * 取消监听CAN总线数据
	 * @param lAttachHandle  是 {@link INetSDK#AttachCAN} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native  boolean  		DetachCAN(long lAttachHandle);

	/**
	 * \if ENGLISH_LANG
	 * Subscribe to the alarm point information of mini radar
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime elapse time
	 * @return > 0 success, else failed
	 * \else
	 * 订阅mini雷达的报警点信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return > 0成功，否则失败
	 * \endif
	 */
	public static native  long  		AttachMiniRadarAlarmPointInfo(long lLoginID, NET_IN_MINI_RADAR_ALARMPOINTINFO pstInParam, NET_OUT_MINI_RADAR_ALARMPOINTINFO pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Unsubscribe the alarm point information of mini radar
	 * @param lAttachHandle, return from {@link INetSDK#AttachCAN}
	 * @return true:success, false:failed
	 * \else
	 * 取消订阅mini雷达的报警点信息
	 * @param lAttachHandle  是 {@link INetSDK#AttachCAN} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native  boolean  		DetachMiniRadarAlarmPointInfo(long lAttachHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * listen transparent serial data
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam input param
	 * @param jfAttachCOMCB callback param
	 * @param pstOutParam output param
	 * @param nWaitTime elapse time
	 * @return > 0 success, else failed
	 * \else
	 * 监听透明串口数据
	 * @param lLoginID  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param jfAttachCOMCB 回调参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return > 0成功，否则失败
	 * \endif
	 */
	public static native long           AttachDevComm(long lLoginID, NET_IN_ATTACH_DEVCOMM pstInParam, CB_fAttachDevCommCB jfAttachCOMCB, NET_OUT_ATTACH_DEVCOMM pstOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * cancel listen transparent serial data
	 * @param lAttachHandle, return from {@link INetSDK#AttachDevComm}
	 * @return true:success, false:failed
	 * \else
	 * 取消监听透明串口数据
	 * @param lAttachHandle  是{@link INetSDK#AttachDevComm}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        DetachDevComm(long lAttachHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * set display source, support multiple window at same time
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 设置显示源, 支持同时设置多个窗口
	 * @param lLoginID  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 	   SplitSetMultiSource(long lLoginID, NET_IN_SPLIT_SET_MULTI_SOURCE pInParam, NET_OUT_SPLIT_SET_MULTI_SOURCE pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * low matrix switch
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 下位矩阵切换
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean       MatrixSwitch(long lLoginID, NET_IN_MATRIX_SWITCH pInParam, NET_OUT_MATRIX_SWITCH pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * device control interface of shanghai bus ,contains control PAD shutdown and restart
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType refer to {@link NET_SPECIAL_CTRL_TYPE}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 设备控制接口，包括控制PAD关机和重启等
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType 取值参考  {@link NET_SPECIAL_CTRL_TYPE}
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean       ControlSpecialDevice(long lLoginID, int emType, Object pInParam, Object pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Get device self check info,user malloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 获取设备自检信息,pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean       GetSelfCheckInfo(long lLoginID, NET_IN_GET_SELTCHECK_INFO pInParam, NET_SELFCHECK_INFO pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * order Bus status, user malloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuInBus input param
	 * @param cbBusState status call function
	 * @param pstuOutBus output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 订阅Bus状态, pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuInBus 输入参数
	 * @param cbBusState 状态回调函数
	 * @param pstuOutBus 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native long          AttachBusState(long lLoginID, NET_IN_BUS_ATTACH pstuInBus, CB_fBusStateCallBack cbBusState, NET_OUT_BUS_ATTACH pstuOutBus, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * stop order Bus status
	 * @param lAttachHandle  return from {@link INetSDK#AttachBusState}
	 * @return true: success, false: failed
	 * \else
	 * 停止订阅Bus状态
	 * @param lAttachHandle {@link INetSDK#AttachBusState}的返回值
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean       DetachBusState(long lAttachHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * vehicle emergency alarm confirm, user malloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 车辆紧急报警确认, pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean       BusConfirmEvent(long lLoginID, NET_IN_BUS_CONFIRM_EVENT pInParam, NET_OUT_BUS_CONFIRM_EVENT pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * subscription task, user malloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true: success, false: failed
	 * \else
	 * 订阅任务, pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginEx} 或者 {@link INetSDK#Login}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native long       AttachSnap(long lLoginID, NET_IN_ATTACH_INTER_SNAP pInParam, NET_OUT_ATTACH_INTER_SNAP pOutParam);

	/**
	 * \if ENGLISH_LANG
	 * cancen subscription
	 * @param lAttachHandle  return from {@link INetSDK#AttachSnap}
	 * @return true: success, false: failed
	 * \else
	 * 取消任务订阅
	 * @param lAttachHandle  {@link INetSDK#AttachSnap}的返回值
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean       DetachSnap(long lAttachHandle);

	/**
	 * \if ENGLISH_LANG
	 * start find number state,user malloc and free (pstInParam's and pstOutParam's) memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginEx} or {@link INetSDK#Login}
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime waiting time
	 * @return true: success, false: failed
	 * \else
	 * 开始查询视频统计信息,pstInParam与pstOutParam内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginEx} 或者 {@link INetSDK#Login}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean          ManualSnap(long lLoginID, NET_IN_MANUAL_SNAP pstInParam, NET_OUT_MANUAL_SNAP pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * subscription task, user malloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginEx} or {@link INetSDK#Login}
	 * @param pInParam input param
	 * @param cbMissionInfofunc task info callback function
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 订阅任务, pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param cbMissionInfofunc 任务信息回调函数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean       AttachMission(long lLoginID, NET_IN_ATTACH_MISSION_PARAM pInParam, CB_fMissionInfoCallBack cbMissionInfofunc, NET_OUT_ATTACH_MISSION_PARAM pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * cancen subscription
	 * @param lAttachHandle  return from {@link INetSDK#AttachMission}
	 * @return true: success, false: failed
	 * \else
	 * 取消任务订阅
	 * @param lAttachHandle  {@link INetSDK#AttachMission}的返回值
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean       DetachMission(long lAttachHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * subscribe intelligent analysis porogress?ê?§for video analysis source is record file?ê?,user malloc and free (pstInParam's and pstOutParam's) memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam input param
	 * @param cbVideoAnalyseState Video analysis status callback function
	 * @param pstOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 订阅智能分析进度（适用于视频分析源为录像文件时）,pstInParam与pstOutParam内存由用户申请释放
	 * @param lLoginID    {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param cbVideoAnalyseState 视频分析状态回调函数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean       AttachVideoAnalyseState(long lLoginID, NET_IN_ATTACH_VIDEOANALYSE_STATE pstInParam, CB_fVideoAnalyseState cbVideoAnalyseState, NET_OUT_ATTACH_VIDEOANALYSE_STATE pstOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * stop subscription
	 * @param lAttachHandle  return from {@link INetSDK#AttachBusState}
	 * @return true: success, false: failed
	 * \else
	 * 停止订阅
	 * @param lAttachHandle  {@link INetSDK#AttachBusState}的返回值
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean       DetachVideoAnalyseState(long lAttachHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * start find number state,user malloc and free (pstInParam's and pstOutParam's) memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @return true: success, false: failed
	 * \else
	 * 开始查询视频统计信息,pstInParam与pstOutParam内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native long          StartFindNumberStat(long lLoginID, NET_IN_FINDNUMBERSTAT pstInParam, NET_OUT_FINDNUMBERSTAT pstOutParam);
	
	/**
	 * \if ENGLISH_LANG
	 * start find number state,user malloc and free (pstInParam's and pstOutParam's) memory
	 * @param lFindHandle login handle, return from {@link INetSDK#StartFindNumberStat}
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @return true: success, false: failed
	 * \else
	 * 开始查询视频统计信息,pstInParam与pstOutParam内存由用户申请释放
	 * @param lFindHandle    {@link INetSDK#StartFindNumberStat}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native int           DoFindNumberStat(long lFindHandle, NET_IN_DOFINDNUMBERSTAT pstInParam, NET_OUT_DOFINDNUMBERSTAT pstOutParam);
	
	/**
	 * \if ENGLISH_LANG
	 * stop find number state
	 * @param lFindHandle login handle, return from {@link INetSDK#StartFindNumberStat}
	 * @return true: success, false: failed
	 * \else
	 * 结束查询视频统计
	 * @param lFindHandle   {@link INetSDK#StartFindNumberStat}的返回值
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean       StopFindNumberStat(long lFindHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * Set GPS subscription callback function,user malloc and free memory of pInParam and  pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 抓图同步接口,将图片数据直接返回给用户,pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean       SnapPictureToFile(long lLoginID, NET_IN_SNAP_PIC_TO_FILE_PARAM pInParam, NET_OUT_SNAP_PIC_TO_FILE_PARAM pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Set Mode of Course Record
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInBuf input param
	 * @param pOutBuf output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 设置课程录像模式
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInBuf 输入参数
	 * @param pOutBuf 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 	   SetCourseRecordMode(long lLoginID, NET_IN_SET_COURSE_RECORD_MODE pInBuf, NET_OUT_SET_COURSE_RECORD_MODE pOutBuf, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get Mode of Course Record
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInBuf input param
	 * @param pOutBuf output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 获取课程录像模式
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInBuf 输入参数
	 * @param pOutBuf 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 	   GetCourseRecordMode(long lLoginID, NET_IN_GET_COURSE_RECORD_MODE pInBuf, NET_OUT_GET_COURSE_RECORD_MODE pOutBuf, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get chanel of Composite Preview
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInBuf input param
	 * @param pOutBuf output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 获取导播预览通道号
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInBuf  输入参数
	 * @param pOutBuf 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 * @deprecated
	 */
	public static native boolean 	   GetCompositePreviewChannel(long lLoginID, NET_IN_GET_COMPOSITE_PREVIEW_CHANNEL pInBuf, NET_OUT_GET_COMPOSITE_PREVIEW_CHANNEL pOutBuf, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * start or stop record
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInBuf input param
	 * @param pOutBuf output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 开启/关闭指定通道录像
	 * @param lLoginID  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInBuf 输入参数
	 * @param pOutBuf 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 	   SetCourseRecordState(long lLoginID, NET_IN_SET_COURSE_RECORD_STATE pInBuf, NET_OUT_SET_COURSE_RECORD_STATE pOutBuf, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * open find coursemedia record 
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInBuf input param
	 * @param pOutBuf output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 开始查询课程视频信息
	 * @param lLoginID  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInBuf 输入参数
	 * @param pOutBuf 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 	   OpenQueryCourseMediaFile(long lLoginID, NET_IN_QUERY_COURSEMEDIA_FILEOPEN pInBuf, NET_OUT_QUERY_COURSEMEDIA_FILEOPEN pOutBuf, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *  find coursemedia record 
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInBuf input param
	 * @param pOutBuf output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 *  查询课程视频信息
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInBuf 输入参数
	 * @param pOutBuf 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 	   DoQueryCourseMediaFile(long lLoginID, NET_IN_QUERY_COURSEMEDIA_FILE pInBuf, NET_OUT_QUERY_COURSEMEDIA_FILE pOutBuf, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * close find coursemedia record
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInBuf input param
	 * @param pOutBuf output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 *  关闭课程视频查询
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInBuf 输入参数
	 * @param pOutBuf 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 	   CloseQueryCourseMediaFile(long lLoginID, NET_IN_QUERY_COURSEMEDIA_FILECLOSE pInBuf, NET_OUT_QUERY_COURSEMEDIA_FILECLOSE pOutBuf, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * order tour status
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 订阅轮巡状态
	 * @param lLoginID  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native long			AttachSplitTour(long lLoginID, NET_IN_ATTACH_SPLIT_TOUR pInParam, NET_OUT_ATTACH_SPLIT_TOUR pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * stop detach tour status
	 * @param lAttachHandle, return from {@link INetSDK#AttachSplitTour}
	 * @return true:success, false:failed
	 * \else
	 * 停止订阅轮巡状态
	 * @param lAttachHandle  是 {@link INetSDK#AttachSplitTour} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean		DetachSplitTour(long lAttachHandle);

	/**
	 * \if ENGLISH_LANG
	 * subscribe PTZ metadata port
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuInPtzStatusProc input param
	 * @param pstuOutPtzStatusProc output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 订阅云台元数据接口
	 * @param lLoginID  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuInPtzStatusProc 输入参数
	 * @param pstuOutPtzStatusProc 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native long 			AttachPTZStatusProc(long lLoginID, NET_IN_PTZ_STATUS_PROC pstuInPtzStatusProc,  NET_OUT_PTZ_STATUS_PROC pstuOutPtzStatusProc, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * stop subscribe PTZ metadata port
	 * @param lAttachHandle, return from {@link INetSDK#AttachPTZStatusProc}
	 * @return true:success, false:failed
	 * \else
	 * 停止订阅云台元数据接口
	 * @param lAttachHandle  是 {@link INetSDK#AttachPTZStatusProc} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean			DetachPTZStatusProc(long lAttachHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * attach scheme tour status 
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 订阅预案轮巡状态
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native long			MonitorWallAttachTour(long lLoginID, NET_IN_WM_ATTACH_TOUR pInParam, NET_OUT_WM_ATTACH_TOUR pOutParam, int nWaitTime);
		
	/**
	 * \if ENGLISH_LANG
	 * stop detach scheme tour status 
	 * @param lAttachHandle, return from {@link INetSDK#MonitorWallAttachTour}
	 * @return true:success, false:failed
	 * \else
	 * 停止订阅预案轮巡状态
	 * @param lAttachHandle  是 {@link INetSDK#MonitorWallAttachTour} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean		MonitorWallDetachTour(long lAttachHandle);
	
	/**
	 * \if ENGLISH_LANG
	 * get scene of monitor wall ,user malloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 获取电视墙场景,pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 		MonitorWallGetScene(long lLoginID, SDK_IN_MONITORWALL_GET_SCENE pInParam, SDK_OUT_MONITORWALL_GET_SCENE pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * set scene of monitor wall ,user malloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 设置电视墙场景,pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 		MonitorWallSetScene(long lLoginID, SDK_IN_MONITORWALL_SET_SCENE pInParam, SDK_OUT_MONITORWALL_SET_SCENE pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * operate Monitor Wall,user malloc memory of pInParam and pOutParam,please refer to the corresponding structure of emType
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType refer to {@link NET_MONITORWALL_OPERATE_TYPE}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 电视墙操作,pInParam与pOutParam内存由用户申请释放,大小参照emType对应的结构体
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType 取值参考  {@link NET_MONITORWALL_OPERATE_TYPE}
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean		OperateMonitorWall(long lLoginID, int emType, Object pInParam, Object pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * video split operation,user malloc and free (pInParam's and pOutParam's)memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType refer to {@link NET_SPLIT_OPERATE_TYPE}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 视频分割操作(pInparam, pOutParam内存由用户申请释放)
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType 取值参考  {@link NET_SPLIT_OPERATE_TYPE}
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean		OperateSplit(long lLoginID,  int emType, Object pInParam, Object pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * get window tour display source,user malloc and free (pInParam's and pOutParam's)memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 获取窗口轮巡显示源(pInparam, pOutParam内存由用户申请释放)
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 		GetTourSource(long lLoginID, NET_IN_GET_TOUR_SOURCE pInParam, NET_OUT_GET_TOUR_SOURCE pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * set window tour display source,user malloc and free (pInParam's and pOutParam's)memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 设置窗口轮巡显示源(pInparam, pOutParam内存由用户申请释放)
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 		SetTourSource(long lLoginID, NET_IN_SET_TOUR_SOURCE pInParam, NET_OUT_SET_TOUR_SOURCE pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * get mode of audio output,user malloc and free (pInParam's and pOutParam's)memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 获取音频输出模式(pInparam, pOutParam内存由用户申请释放)
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean		GetSplitAudioOuput(long lLoginID, SDK_IN_GET_AUDIO_OUTPUT pInParam, SDK_OUT_GET_AUDIO_OUTPUT pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * set mode of audio output,user malloc and free (pInParam's and pOutParam's)memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 设置音频输出模式(pInparam, pOutParam内存由用户申请释放)
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean		SetSplitAudioOuput(long lLoginID, SDK_IN_SET_AUDIO_OUTPUT pInParam, SDK_OUT_SET_AUDIO_OUTPUT pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * start find information,user malloc memory of pInBuf and pOutBuf,please refer to emType to ensure structure,then ensure memory size
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType refer to {@link NET_FIND}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 开始查询信息（获取查询句柄）(pInBuf, pOutBuf内存由用户申请释放,根据emType对应的类型找到相应的结构体，进而确定申请内存大小)
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType 取值参考  {@link NET_FIND}
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean		StartFind(long lLoginID, int emType, Object pInParam, Object pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * find information,user malloc memory of pInBuf and pOutBuf,please refer to emType to ensure structure,then ensure memory size
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType refer to {@link NET_FIND}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 查询信息(pInBuf, pOutBuf内存由用户申请释放,根据emType对应的类型找到相应的结构体，进而确定申请内存大小
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType 取值参考 {@link NET_FIND}
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean		DoFind(long lLoginID, int emType, Object pInParam, Object pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * stop find information,user malloc memory of pInBuf and pOutBuf,please refer to emType to ensure structure,then ensure memory size
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType refer to {@link NET_FIND}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 停止查询信息（销毁查询句柄）(pInBuf, pOutBuf内存由用户申请释放,根据emType对应的类型找到相应的结构体，进而确定申请内存大小)
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType 取值参考 {@link NET_FIND}
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean		StopFind(long lLoginID, int emType, Object pInParam, Object pOutParam, int nWaitTime);	

	/**
	 * \if ENGLISH_LANG
	 * get course preview channel,user malloc and free memory of pInBuf and pOutBuf
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 获取真实预览通道号,pInBuf与pOutBuf内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean		GetRealPreviewChannel(long lLoginID, NET_IN_GET_REAL_PREVIEW_CHANNEL pInParam, NET_OUT_GET_REAL_PREVIEW_CHANNEL pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * get course media default real channel id,user malloc and free memory of pInBuf and pOutBuf
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 获取录播主机默认真实通道号,pInBuf与pOutBuf内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 		GetDefaultRealChannel(long lLoginID, NET_IN_GET_DEFAULT_REAL_CHANNEL pInParam, NET_OUT_GET_DEFAULT_REAL_CHANNEL pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * get course media logic channel id,user malloc and free memory of pInBuf and pOutBuf
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 获取录播主机逻辑通道号,pInBuf与pOutBuf内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 		GetLogicChannel(long lLoginID, NET_IN_GET_COURSE_LOGIC_CHANNEL pInParam, NET_OUT_GET_COURSE_LOGIC_CHANNEL pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * set blind of Real and logic channel ,user malloc and free memory of pInBuf and pOutBuf
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 设置逻辑通道号和真实通道号的绑定关系,pInBuf与pOutBuf内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean		SetBlindRealChannel(long lLoginID, NET_IN_SET_BLIND_REAL_CHANNEL pInParam, NET_OUT_SET_BLIND_REAL_CHANNEL pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * get course media input type,user malloc and free memory of pInBuf and pOutBuf
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 获取录播主机通道输入媒体介质,pInBuf与pOutBuf内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean		GetInputChannelMedia(long lLoginID, NET_IN_GET_INPUT_CHANNEL_MEDIA pInParam, NET_OUT_GET_INPUT_CHANNEL_MEDIA pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * by search filter search record,user malloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 按查询条件查询记录,pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean		FindRecord(long lLoginID, NET_IN_FIND_RECORD_PARAM pInParam, NET_OUT_FIND_RECORD_PARAM pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * search record :nFilecount: need search items,  return value as media file items  return value<nFilecountas corresponding period file search complete,user malloc memory of pInParam and pOutParam
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return return value as media file items
	 * \else
	 * 查找记录:nFilecount:需要查询的条数, 返回值为媒体文件条数 返回值<nFilecount则相应时间段内的文件查询完毕,pInParam与pOutParam内存由用户申请释放
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return 返回值为媒体文件条数
	 * \endif
	 */
	public static native int			FindNextRecord(NET_IN_FIND_NEXT_RECORD_PARAM pInParam, NET_OUT_FIND_NEXT_RECORD_PARAM pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * end record search
	 * @param lFindHandle Find Handle, return as {@link INetSDK#FindRecord}
	 * @return true: success, false: failed
	 * \else
	 * 结束记录查找
	 * @param lFindHandle 查询句柄， {@link INetSDK#FindRecord}的返回值
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean		FindRecordClose(long lFindHandle);

	/**
	 * \if ENGLISH_LANG
	 * sybcgribize fule upload,user malloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 同步文件上传, 只适用于小文件,pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean		UploadRemoteFile(long lLoginID, SDK_IN_UPLOAD_REMOTE_FILE pInParam, SDK_OUT_UPLOAD_REMOTE_FILE pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * remove file,user malloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 删除文件或目录
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean    RemoveRemoteFiles(long lLoginID, SDK_IN_REMOVE_REMOTE_FILES pInParam, SDK_OUT_REMOVE_REMOTE_FILES pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * file download, only for small file,user malloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 文件下载, 只适用于小文件,pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID r  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean		DownloadRemoteFile(long lLoginID, SDK_IN_DOWNLOAD_REMOTE_FILE pInParam, SDK_OUT_DOWNLOAD_REMOTE_FILE pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * set net AutoAdapt Encode policy,user malloc and free memory of pInBuf 
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 设置编码缓冲策略,pInBuf内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean		SetRealplayBufferPolicy(long lLoginID, NET_IN_BUFFER_POLICY pInParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * calculate the similarity of two face images,user malloc and free memory of pstInParam and pstOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 计算两张目标图片的相似度faceRecognitionServer.matchTwoTarget,pstInParam与pstOutParam内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 		MatchTwoFaceImage(long lLoginID, NET_MATCH_TWO_FACE_IN pInParam, NET_MATCH_TWO_FACE_OUT pOutParam, int nWaitTime);
		
	/**
	 * \if ENGLISH_LANG
	 * get ring file list 
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime elapse time
	 * @return true: success, false: failed
	 * \else
	 * 获取门铃音频文件列表
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean        GetRingFileList(long lLoginID, NET_IN_GET_RINGFILELIST pInParam, NET_OUT_GET_RINGFILELIST pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * Get storage device name list,user malloc memory of pstuNames
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuNames Storage device name array
	 * @param pnRetCount return number of storage device
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 获取存储设备名称列表,pstuNames内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuNames 存储设备名称数组
	 * @param pnRetCount 返回的存储设备数量 
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        GetStorageDeviceNames(long lLoginID, SDK_STORAGE_DEVICE_NAME[] pstuNames, Integer pnRetCount, int nWaitTime);

	
	/**
	 * \if ENGLISH_LANG
	 * Get storage device info,user malloc memory of pDevice
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pszDevName, Storage device name 
	 * @param pDevice, Storage device info
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 获取存储设备信息,pDevice内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pszDevName 存储设备名称
	 * @param pDevice 存储设备信息
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        GetStorageDeviceInfo(long lLoginID, String pszDevName, SDK_STORAGE_DEVICE pDevice, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * interface of coursemedia Operate
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emOperateType  refer to {@link EM_COURSECOMPOSITE_OPERATE_TYPE} 
	 * @param pInParam    emOperateType can sure structure
	 * @param pOutParam   emOperateType can sure structure
	 * @param nWaitTime  waitting time
	 * @return true:success, false:failed
	 * \else
	 * 课件媒体接口
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emOperateType 取值参考    {@link EM_COURSECOMPOSITE_OPERATE_TYPE} 
	 * @param pInParam  根据emOperateType，来确定哪个结构体
	 * @param pOutParam 根据emOperateType，来确定哪个结构体
	 * @param nWaitTime  超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        OperateCourseCompositeChannel(long lLoginID, int emOperateType, Object pInParam, Object pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * interface of operate coursemedia record info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emOperateType  refer to {@link EM_COURSERECORD_OPERATE_TYPE} 
	 * @param pInParam    emOperateType can sure structure
	 * @param pOutParam   emOperateType can sure structure
	 * @param nWaitTime  waitting time
	 * @return true:success, false:failed
	 * \else
	 * 录播主机录像信息操作接口
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emOperateType 取值参考    {@link EM_COURSERECORD_OPERATE_TYPE} 
	 * @param pInParam  根据emOperateType，来确定哪个结构体
	 * @param pOutParam 根据emOperateType，来确定哪个结构体
	 * @param nWaitTime  超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 	     OperateCourseRecordManager(long lLoginID, int emOperateType, Object pInParam, Object pOutParam, int nWaitTime);

	
	/**
	 * \if ENGLISH_LANG
	 * init device account
	 * @param pInitAccountIn   init device account input param 
	 * @param pInitAccountOut  init device account output param
	 * @param dwWaitTime overtime of waiting
	 * @param szLocalIp  local ip is NULL
	 * @return true:success, false:failed
	 * \else
	 * 初始化账户
	 * @param pInitAccountIn 初始化设备账户输入结构体
	 * @param pInitAccountOut 初始化设备账户输出结构体 
	 * @param dwWaitTime 超时等待时间
	 * @param szLocalIp 本地IP,设为NULL
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        InitDevAccount(NET_IN_INIT_DEVICE_ACCOUNT pInitAccountIn, NET_OUT_INIT_DEVICE_ACCOUNT pInitAccountOut, int dwWaitTime, String szLocalIp/* = NULL*/);

	/**
	 * \if ENGLISH_LANG
	 * init account by ip
	 * @param pInitAccountIn   init device account input param
	 * @param pInitAccountOut  init device account output param
	 * @param dwWaitTime overtime of waiting
	 * @param szLocalIp  local ip is NULL
	 * @param szDeviceIP device ip
	 * @return true:success, false:failed
	 * \else
	 * 根据设备IP初始化账户
	 * @param pInitAccountIn 初始化设备账户输入结构体
	 * @param pInitAccountOut 初始化设备账户输出结构体
	 * @param dwWaitTime 超时等待时间
	 * @param szLocalIp 本地IP,设为NULL
	 * @param szDeviceIP 设备ip
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        InitDevAccountByIP(NET_IN_INIT_DEVICE_ACCOUNT pInitAccountIn, NET_OUT_INIT_DEVICE_ACCOUNT pInitAccountOut, int dwWaitTime, String szLocalIp, String szDeviceIP);

	/**
	 * \if ENGLISH_LANG
	 * get reset info: phone number、mail、QR code
	 * @param pDescriptionIn   get description reset and pwd input param 
	 * @param pDescriptionOut  get description reset and pwd output param
	 * @param dwWaitTime overtime of waiting
	 * @param szLocalIp  local ip is NULL
	 * @return true:success, false:failed
	 * \else
	 * 获取重置信息:手机号、邮箱、二维码信息
	 * @param pDescriptionIn 获取重置密码信息输入结构体
	 * @param pDescriptionOut 获取重置密码信息输出结构体
	 * @param dwWaitTime 超时等待时间
	 * @param szLocalIp 本地IP，设为NULL
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        GetDescriptionForResetPwd(NET_IN_DESCRIPTION_FOR_RESET_PWD pDescriptionIn, NET_OUT_DESCRIPTION_FOR_RESET_PWD pDescriptionOut, int dwWaitTime, String szLocalIp/* = NULL*/);

	
	/**
	 * \if ENGLISH_LANG
	 * reset pwd
	 * @param pResetPwdIn   reset pwd input param
	 * @param pResetPwdOut  reset pwd output param
	 * @param dwWaitTime overtime of waiting
	 * @param szLocalIp  local ip is NULL
	 * @return true:success, false:failed
	 * \else
	 * 重置密码
	 * @param pResetPwdIn 重置密码输入结构体
	 * @param pResetPwdOut 重置密码输出结构体 
	 * @param dwWaitTime 超时等待时间
	 * @param szLocalIp 本地IP，设为NULL
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        ResetPwd(NET_IN_RESET_PWD pResetPwdIn, NET_OUT_RESET_PWD pResetPwdOut, int dwWaitTime, String szLocalIp/* = NULL*/);

	/**
	 * 初始化LC设备账户
	 */
	public static native boolean        InitDevAccountByPort(NET_IN_INIT_DEVICE_ACCOUNT_BY_PORT pResetPwdIn, NET_OUT_INIT_DEVICE_ACCOUNT_BY_PORT pResetPwdOut, int dwWaitTime, String szLocalIp/* = NULL*/);

	/**
	 * 重置密码输入结构体
	 */
	public static native boolean        ResetPwdByPort(NET_IN_RESET_PWD_BY_PORT pResetPwdIn, NET_OUT_RESET_PWD_BY_PORT pResetPwdOut, int dwWaitTime, String szLocalIp/* = NULL*/);

	/**
	 * 获取LC设备的重置信息:手机号、邮箱、二维码信息
	 */
	public static native boolean        GetDescriptionForResetPwdByPort(NET_IN_DESCRIPTION_FOR_RESET_PWD_BY_PORT pResetPwdIn, NET_OUT_DESCRIPTION_FOR_RESET_PWD_BY_PORT pResetPwdOut, int dwWaitTime, String szLocalIp/* = NULL*/);
	
	/**
	 * \if ENGLISH_LANG
	 * get contact info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam   get contact info input param
	 * @param pstOutParam  get contact info output param
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 获取联系方式
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 获取联系方式入参
	 * @param pstOutParam 获取联系方式出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        GetContact(long lLoginID, NET_IN_GET_CONTACT_INFO pstInParam, NET_OUT_GET_CONTACT_INFO pstOutParam, int nWaitTime);

	
	/**
	 * \if ENGLISH_LANG
	 * set contact info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam   get contact info input param
	 * @param pstOutParam  get contact info output param
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 设置联系方式
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 设置联系方式入参
	 * @param pstOutParam 设置联系方式出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        SetContact(long lLoginID, NET_IN_SET_CONTACT_INFO pstInParam, NET_OUT_SET_CONTACT_INFO pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get Configuration
	 * @param lLoginID lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emCfgOpType configu type {@link NET_EM_CFG_OPERATE_TYPE }
	 * @param nChannelID Channel ID
	 * @param cfgData configuration data
	 * @param nWaitTime overtime of waiting
	 * @param reserved reserved
	 * @return true:success, false:failed
	 * \else
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emCfgOpType 配置类型 {@link NET_EM_CFG_OPERATE_TYPE }
	 * @param nChannelID 通道ID 
	 * @param cfgData 配置信息
	 * @param nWaitTime 超时等待时间
	 * @param reserved 保留字段
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		GetConfig(long lLoginID, int emCfgOpType, int nChannelID, Object cfgData, int nWaitTime, Object reserved);

	/**
	 * \if ENGLISH_LANG
	 * Get Configuration
	 * @param lLoginID lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emCfgOpType configuration type, refer to {@link NET_EM_CFG_OPERATE_TYPE }
	 * @param nChannelID Channel ID
	 * @param cfgData configuration data
	 * @param nWaitTime overtime of waiting
	 * @param restart restart
	 * @param reserved reserved
	 * @return true:success, false:failed
	 * \else
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emCfgOpType 配置类型, 取值参考 {@link NET_EM_CFG_OPERATE_TYPE }
	 * @param nChannelID 通道ID
	 * @param cfgData 配置信息
	 * @param nWaitTime 超时等待时间
	 * @param restart 重启标志
	 * @param reserved 保留字段
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 		SetConfig(long lLoginID, int emCfgOpType, int nChannelID, Object cfgData, int nWaitTime, Object restart, Object reserved);

	/**
	 * \if ENGLISH_LANG
	 * mark video by time,user malloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam   get contact info input param
	 * @param pOutParam  get contact info output param
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 按时间标记录像，pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 入参
	 * @param pOutParam 出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        SetMarkFileByTime(long lLoginID, NET_IN_SET_MARK_FILE_BY_TIME pInParam, NET_OUT_SET_MARK_FILE_BY_TIME pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * mark video by time,user malloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam   get contact info input param
	 * @param pOutParam  get contact info output param
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 按文件标记录像，pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 入参
	 * @param pOutParam 出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean         SetMarkFile(long lLoginID, NET_IN_SET_MARK_FILE pInParam, NET_OUT_SET_MARK_FILE pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * acquire sign video info ,user malloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam   get contact info input param
	 * @param pOutParam  get contact info output param
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 获取标记录像信息,pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 入参
	 * @param pOutParam 出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        GetMarkInfo(long lLoginID, NET_IN_GET_MARK_INFO pInParam, NET_OUT_GET_MARK_INFO pOutParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * get the list of authority info,user malloc memory of pNetDataIn and pNetDataOut
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pNetDataIn   get contact info input param
	 * @param pNetDataOut  get contact info output param
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 获取权限类型信息列表,pNetDataIn与pNetDataOut由用户申请内存
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pNetDataIn 入参
	 * @param pNetDataOut 出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        GetAuthClassifyList(long lLoginID, NET_IN_GET_AUTHORITY_INFO_LIST pNetDataIn, NET_OUT_GET_AUTHORITY_INFO_LIST pNetDataOut, int nWaitTime);

	
	/**
	 * \if ENGLISH_LANG
	 * interface of get record state,user malloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam   get contact info input param
	 * @param pOutParam  get contact info output param
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 获取录像状态,pInParam与pOutParam由用户申请内存
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 入参
	 * @param pOutParam 出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
    public static native boolean        GetRecordState(long lLoginID,final NET_IN_GET_RECORD_STATE pInParam,NET_OUT_GET_RECORD_STATE pOutParam,int nWaitTime);

    
    /**
	 * \if ENGLISH_LANG
	 * interface of CourseCompositeChannelMode Operate,user malloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emOperateType {@link NET_COURSECOMPOSITE_MODE_OPERATE_TYPE}
	 * @param pInParam   get contact info input param
	 * @param pOutParam  get contact info output param
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 *  录播主机组合通道模式操作,pInParam与pOutParam由用户申请内存
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emOperateType {@link NET_COURSECOMPOSITE_MODE_OPERATE_TYPE}
	 * @param pInParam 入参
	 * @param pOutParam 出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean        OperateCourseCompositeChannelMode(long lLoginID,int emOperateType,Object pInParam,Object pOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Device access enable interface :
	 * @param pNetAccessIn   get contact info input param
	 * @param pNetAccessOut  get contact info output param
	 * @param dwWaitTime     overtime of waiting
	 * @param szLocalIp 	 local ip
	 * @return true:success, false:failed
	 * \else
	 * 设备接入使能接口：LC专用
	 * @param pNetAccessIn 入参
	 * @param pNetAccessOut 出参
	 * @param dwWaitTime 超时等待时间
	 * @param szLocalIp 本地IP
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       SetNetAccess(NET_IN_NETACCESS pNetAccessIn, NET_OUT_NETACCESS pNetAccessOut, int dwWaitTime, String szLocalIp);

	/**
	 * \if ENGLISH_LANG
	 * asynchronous upload,user malloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param cbUploadfile upload information callback 
	 * @return >0: success, <=0: failed
	 * \else
	 * 异步文件上传,pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param cbUploadfile 显示上传信息的异步回调函数
	 * @return >0:成功, <=0: 失败
	 * \endif
	 */
	public static native long           StartUploadRemoteFile(long lLoginID, SDK_IN_UPLOAD_REMOTE_FILE pInParam, SDK_OUT_UPLOAD_REMOTE_FILE pOutParam, CB_fUploadFileCallBack cbUploadfile);
	
	/**
	 * \if ENGLISH_LANG
	 * stop upload file
	 * @param lUploadFileHandle , return from {@link INetSDK#StartUploadRemoteFile}
	 * @return true: success, false: failed
	 * \else
	 * 停止上传文件
	 * @param lUploadFileHandle   {@link INetSDK#StartUploadRemoteFile} 返回值
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean        StopUploadRemoteFile(long lUploadFileHandle); 
	
	/**
	 * \if ENGLISH_LANG
	 * setting transmitted power
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam      input parameter
	 * @param pstOutParam     output parameter
	 * @param nWaitTime       overtime of waiting
	 * @return true: success, false: failed
	 * \else
	 * 设置发射功率
	 * @param lLoginID, {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean        SetLowRateWPANPower(long lLoginID, NET_IN_SET_LOWRATEWPAN_POWER pstInParam, NET_OUT_SET_LOWRATE_WPAN_POWER pstOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam      input parameter
	 * @param pstOutParam     output parameter
	 * @param nWaitTime       overtime of waiting
	 * @return true: success, false: failed
	 * \else
	 * 智能锁修改用户信息
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean        SetSmartLockUsername(long lLoginID,final NET_IN_SET_SMART_LOCK_USERNAME pstInParam,NET_OUT_SET_SMART_LOCK_USERNAME pstOutParam,int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * get register info of the user of smart lock
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam      input parameter
	 * @param pstOutParam     output parameter
	 * @param nWaitTime       overtime of waiting
	 * @return true: success, false: failed
	 * \else
	 * 获取当前智能锁的注册用户信息
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean        GetSmartLockRegisterInfo(long lLoginID, final NET_IN_GET_SMART_LOCK_REGISTER_INFO  pstInParam, NET_OUT_GET_SMART_LOCK_REGISTER_INFO pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * get passwd specification
	 * @param pstInParam     input para meter
	 * @param pstOutParam     output parameter
	 * @param nWaitTime       overtime of waiting
	 * @param szLocalIp local ip, is NULL
	 * @return true: success, false: failed
	 * \else
	 * 获取密码规范
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 超时等待时间
	 * @param szLocalIp 本地IP，设为NULL
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean       GetPwdSpecification(NET_IN_PWD_SPECI pstInParam, NET_OUT_PWD_SPECI pstOutParam, int nWaitTime, String szLocalIp);
	
	/**
	 * \if ENGLISH_LANG
	 * add logical device bydeviceinfo. user malloc and free (pInParam's and pOutParam's) memory
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam     input para meter
	 * @param pOutParam     output parameter
	 * @param nWaitTime       overtime of waiting
	 * @return true: success, false: failed
	 * \else
	 * 按设备信息添加显示源 。  pInParam 和pOutParam内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean       MatrixAddCamerasByDevice(long lLoginID, SDK_IN_ADD_LOGIC_BYDEVICE_CAMERA pInParam, SDK_OUT_ADD_LOGIC_BYDEVICE_CAMERA  pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * balck/allow list operation, user malloc and free (pstInParam's and pstOutParam's) memory
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam     input para meter 
	 * @param pstOutParam     output parameter 
	 * @param nWaitTime       overtime of waiting
	 * @return true: success, false: failed
	 * \else
	 * 按权限名单操作  pInParam 和pOutParam内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数 
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean      OperateTrafficList(long lLoginID, NET_IN_OPERATE_TRAFFIC_LIST_RECORD pstInParam, NET_OUT_OPERATE_TRAFFIC_LIST_RECORD pstOutParam, int nWaitTime);

	
	/**
	 * \if ENGLISH_LANG
	 * set display source. user malloc and free (pInParam's and pOutParam's) memory
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam     input parameter
	 * @param pOutParam     output parameter
	 * @param nWaitTime       overtime of waiting
	 * @return true: success, false: failed
	 * \else
	 * 设置显示源  pInParam 和pOutParam内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean       MatrixSetCameras(long lLoginID, SDK_IN_MATRIX_SET_CAMERAS pInParam, SDK_OUT_MATRIX_SET_CAMERAS pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Attach Device Discovery. user malloc and free (pInParam's and pOutParam's) memory
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam   input parameter 
	 * @param pOutParam  output parameter 
	 * @param nWaitTime  overtime of waiting
	 * @param cbNotify   callback function 
	 * @return true: success, false: failed
	 * \else
	 * 注册设备搜索  pInParam 和pOutParam内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam   输入参数
	 * @param pOutParam 输出参数
	 * @param cbNotify  回调函数
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native long          AttachDeviceDiscovery(long lLoginID, NET_IN_ATTACH_DEVICE_DISCOVERY pInParam, NET_OUT_ATTACH_DEVICE_DISCOVERY pOutParam, CB_fAttachDeviceDiscoveryCB cbNotify, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Detach Device Discovery
	 * @param lAttachHandle   return from {@link INetSDK#AttachDeviceDiscovery}
	 * @return true: success, false: failed
	 * \else
	 * 注销设备搜索
	 * @param lAttachHandle    {@link INetSDK#AttachDeviceDiscovery} 返回值
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 	   DetachDeviceDiscovery(long lAttachHandle);

	/**
	 * \if ENGLISH_LANG
	 * Attach RTMP Manager and Obtain Status
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam   input parameter
	 * @param pOutParam  output parameter
	 * @param nWaitTime  overtime of waiting
	 * @return lAttachStatusHandle
	 * \else
	 * 订阅推流状态变化及失败原因
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam   输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时等待时间
	 * @return lAttachStatusHandle
	 * \endif
	 */
	public static native long          AttachStatusRTMPManager(long lLoginID, NET_IN_RTMP_MANAGER_ATTACH_STATUS pInParam, NET_OUT_RTMP_MANAGER_ATTACH_STATUS pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Detach RTMP Manager and Obtain Status
	 * @param lAttachStatusHandle   return from {@link INetSDK#AttachStatusRTMPManager}
	 * @param pInParam   input parameter
	 * @param pOutParam  output parameter
	 * @param nWaitTime  overtime of waiting
	 * @return
	 * \else
	 * 取消订阅推流状态变化及失败原因
	 * @param lAttachStatusHandle    {@link INetSDK#AttachStatusRTMPManager} 返回值
	 * @param pInParam   输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时等待时间
	 * @return
	 * \endif
	 */
	public static native long 	   DetachStatusRTMPManager(long lAttachStatusHandle, NET_IN_RTMP_MANAGER_DETACH_STATUS pInParam, NET_OUT_RTMP_MANAGER_DETACH_STATUS pOutParam);

	/**
	 * \if ENGLISH_LANG
	 * RTMP Manager Operation Function
	 * @param lLoginID   return from {@link INetSDK#LoginWithHighLevelSecurity}
	 * @param emtype   refer to {@link NET_EM_RTMP_MANAGER}
	 * @param pstInParam   refer to {@link NET_EM_RTMP_MANAGER}
	 * @param pstOutParam   refer to {@link NET_EM_RTMP_MANAGER}
	 * @param nWaitTime   overtime of waiting
	 * @return true: success, false: failed
	 * \else
	 * RTMP推流操作接口
	 * @param lLoginID    {@link INetSDK#LoginWithHighLevelSecurity} 返回值
	 * @param emtype   参考 {@link NET_EM_RTMP_MANAGER}
	 * @param pstInParam   参考 {@link NET_EM_RTMP_MANAGER}
	 * @param pstOutParam   参考 {@link NET_EM_RTMP_MANAGER}
	 * @param nWaitTime   超时等待时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 	   OperateRTMPManager(long lLoginID,int emtype, Object pstInParam, Object pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Start Device Discovery. user malloc and free (pInParam's and pOutParam's) memory
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam     input parameter 
	 * @param pOutParam     output parameter 
	 * @param nWaitTime       overtime of waiting
	 * @return true: success, false: failed
	 * \else
	 * 启动设备搜索  pInParam 和pOutParam内存由用户申请释放
	 * @param lLoginID   {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数 
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 	   StartDeviceDiscovery(long lLoginID, NET_IN_START_DEVICE_DISCOVERY pInParam, NET_OUT_START_DEVICE_DISCOVERY pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Stop Device Discovery. user malloc and free (pInParam's and pOutParam's) memory
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam     input parameter 
	 * @param pOutParam     output parameter 
	 * @param nWaitTime       overtime of waiting
	 * @return true: success, false: failed
	 * \else
	 * 停止设备搜索  pInParam 和pOutParam内存由用户申请释放
	 * @param lLoginID    {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数 
	 * @param pOutParam 输出参数
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false: 失败
	 * \endif
	 */
	public static native boolean 	   StopDeviceDiscovery(long lLoginID, NET_IN_STOP_DEVICE_DISCOVERY pInParam, NET_OUT_STOP_DEVICE_DISCOVERY pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * init device account
	 * @param pInitAccessIn   boot wizard flow input parameters
	 * @param pInitAccessOut  boot wizard flow ouput parameters
	 * @param dwWaitTime overtime of waiting
	 * @param szLocalIp  local ip is NULL
	 * @return true:success, false:failed
	 * \else
	 * 开机向导流程，接入公网、在线升级检测等功能
	 * @param pInitAccessIn 开机向导流程入参
	 * @param pInitAccessOut 开机向导流程出参
	 * @param dwWaitTime 超时等待时间
	 * @param szLocalIp 本地IP,设为NULL
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       InitDevAccess(NET_IN_INIT_DEVICE_ACCESS pInitAccessIn, NET_OUT_INIT_DEVICE_ACCESS pInitAccessOut, int dwWaitTime, String szLocalIp);

	/**
	 * \if ENGLISH_LANG
	 * boot wizard flow, include function netaccess, upgradecheck with DeviceIP
	 * @param pInitAccessIn   boot wizard flow input parameters
	 * @param pInitAccessOut  boot wizard flow ouput parameters
	 * @param dwWaitTime overtime of waiting
	 * @param szLocalIp  local ip is NULL
	 * @param szDeviceIp device IP
	 * @return true:success, false:failed
	 * \else
	 * 开机向导流程，接入公网、在线升级检测等功能
	 * @param pInitAccessIn 开机向导流程入参
	 * @param pInitAccessOut 开机向导流程出参
	 * @param dwWaitTime 超时等待时间
	 * @param szLocalIp 本地IP,设为NULL
	 * @param szDeviceIp 设备IP
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       InitDevAccessByIp(NET_IN_INIT_DEVICE_ACCESS pInitAccessIn, NET_OUT_INIT_DEVICE_ACCESS pInitAccessOut, int dwWaitTime, String szLocalIp, String szDeviceIp);

	/**
	 * \if ENGLISH_LANG
	 * set GPS status information
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam   input parameters
	 * @param pOutParam  ouput parameters
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 设置GPS状态信息(pInParam, pOutParam内存由用户申请释放)
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 入参
	 * @param pOutParam 出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       SetGPSStatus(long lLoginID, NET_IN_SET_GPS_STATUS pInParam, NET_OUT_SET_GPS_STATUS pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * search target recognition staff group info ,user malloc and free (pstInParam's and pstOutParam's) memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam   input parameters
	 * @param pstOutParam  ouput parameters
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 查询目标识别人员组信息,pstInParam与pstOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 入参
	 * @param pstOutParam 出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       FindGroupInfo(long lLoginID,  NET_IN_FIND_GROUP_INFO pstInParam, NET_OUT_FIND_GROUP_INFO pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * target recognition staff group operation, including add, modify and delete, ,user malloc and free (pstInParam's and pstOutParam's) memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam   input parameters
	 * @param pstOutParam  ouput parameters
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 目标识别人员组操作（包括添加,修改和删除）,pstInParam与pstOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 入参
	 * @param pstOutParam 出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       OperateFaceRecognitionGroup(long lLoginID, NET_IN_OPERATE_FACERECONGNITION_GROUP pstInParam, NET_OUT_OPERATE_FACERECONGNITION_GROUP pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get the device channel info on com port,user malloc and free (pstInParam's and pstOutParam's) memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam   input parameters
	 * @param pstOutParam  ouput parameters
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 获取设备COM端口连接的设备通道信息,pstInParam 与 pstOutParam 由用户申请内存
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 入参
	 * @param pstOutParam 出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       GetComPortDeviceChannelInfo(long lLoginID, NET_IN_GET_COM_PORT_DEVICE_CHANNEL_INFO pstInParam, NET_OUT_GET_COM_PORT_DEVICE_CHANNEL_INFO pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get Alarm out state
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam   input parameters
	 * @param pstOutParam  ouput parameters
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 获得每个报警输出端口的状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 入参
	 * @param pstOutParam 出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean 	GetAlarmOutState(long lLoginID, NET_IN_GET_ALARM_OUT_STATE pstInParam, NET_OUT_GET_ALARM_OUT_STATE pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * interface of get PIR Alarm param
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam   input parameters
	 * @param pstOutParam  ouput parameters
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 获取PIR配置
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 入参
	 * @param pstOutParam 出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean    GetPirAlarmParam(long lLoginID, NET_IN_GET_PIR_ALARM_PARAM pstInParam, NET_OUT_GET_PIR_ALARM_PARAM pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * interface of set PIR Alarm param
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam   input parameters
	 * @param pstOutParam  ouput parameters
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 设置PIR配置
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 入参
	 * @param pstOutParam 出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean    SetPirAlarmParam(long lLoginID, NET_IN_SET_PIR_ALARM_PARAM pstInParam, NET_OUT_SET_PIR_ALARM_PARAM pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * init account
	 * @param pInitAccountIn   init account input parameters
	 * @param pInitAccountOut  init account output parameters
	 * @param nWaitTime overtime of waiting
	 * @param szLocalIp  local ip is NULL
	 * @return true:success, false:failed
	 * \else
	 * 初始化账户
	 * @param pInitAccountIn 初始化账户入参
	 * @param pInitAccountOut 初始化账户出参
	 * @param nWaitTime 超时等待时间
	 * @param szLocalIp 本地IP,设为NULL
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean    InitAccount(NET_IN_INIT_ACCOUNT pInitAccountIn, NET_OUT_INIT_ACCOUNT pInitAccountOut, int nWaitTime, String szLocalIp);

	/**
	 * \if ENGLISH_LANG
	 * reset web account
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam   reset web account input parameters
	 * @param pstOutParam  reset web account output parameters
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 重置web账户密码
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 重置WEB密码入参
	 * @param pstOutParam 重置WEB密码出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean    ResetWebPwd(long lLoginID, NET_IN_REST_WEB_PWD pstInParam, NET_OUT_REST_WEB_PWD pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * get media encrypt capability set
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam   get media encrypt capability set input parameters
	 * @param pstOutParam  get media encrypt capability set output parameters
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 获取媒体文件加密能力集
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 获取媒体文件加密能力集入参
	 * @param pstOutParam 获取媒体文件加密能力集出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean    GetMediaEncryptCaps(long lLoginID, NET_IN_GET_MEDIA_ENCRYPT_CAPS pstInParam, NET_OUT_GET_MEDIA_ENCRYPT_CAPS pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * get VK
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam   get VK input parameters
	 * @param pstOutParam  get VK output parameters
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 获取VK
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 获取VK入参
	 * @param pstOutParam 获取VK出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean    GetVK(long lLoginID, NET_IN_GET_VKINFO pstInParam, NET_OUT_GET_VKINFO pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * update VK
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam   update VK input parameters
	 * @param pstOutParam  update VK output parameters
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 更新VK
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 更新VK入参
	 * @param pstOutParam 更新VK出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean    UpdateVK(long lLoginID, NET_IN_UPDATE_VKINFO pstInParam, NET_OUT_UPDATE_VKINFO pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * attach VK
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam   attach VK input parameters
	 * @param pstOutParam  attach VK output parameters
	 * @param nWaitTime overtime of waiting
	 * @return failed return to 0,successful return to attach handle
	 * \else
	 * 订阅VK
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 订阅VK入参
	 * @param pstOutParam 订阅VK出参
	 * @param nWaitTime 超时等待时间
	 * @return 失败返回0,成功返回订阅句柄
	 * \endif
	 */
	public static native long    AttachVK( long lLoginID, NET_IN_ATTACH_VK pstInParam, NET_OUT_ATTACH_VK pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * detach VK
	 * @param lAttachHandle, return from {@link INetSDK#AttachVK}
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 取消订阅VK
	 * @param lAttachHandle  是 {@link INetSDK#AttachVK} 的返回值
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean		DetachVK( long lAttachHandle, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * get record file password
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam   get record file password input parameters
	 * @param pstOutParam  get record file password output parameters
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 获取录像加密密码
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 获取录像加密密码入参
	 * @param pstOutParam 获取录像加密密码出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean		GetRecordFilePassword(long lLoginID, NET_IN_GET_RECORD_FILE_PASSWORD pstInParam, NET_OUT_GET_RECORD_FILE_PASSWORD pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * set security key
	 * @param lPlayHandle, playback handle, as {@link INetSDK#PlayBackByRecordFile} return value
	 * @param szKey   security key
	 * @return true:success, false:failed
	 * \else
	 * 设置安全密钥(播放加密码流使用)
	 * @param lPlayHandle ,回放句柄,如 {@link INetSDK#PlayBackByRecordFile} 的返回值
	 * @param szKey 安全密钥
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean		SetSecurityKey(long lPlayHandle, byte[] szKey);

	/**
	 * \if ENGLISH_LANG
	 * open or close  privacy recover
	 * @param lPlayHandle, playback handle, as {@link INetSDK#PlayBackByRecordFile} return value
	 * @param bRecover   recover indicate, true: open, false: close
	 * @return true:success, false:failed
	 * \else
	 * 打开或者关闭隐私遮挡
	 * @param lPlayHandle ,回放句柄,如 {@link INetSDK#PlayBackByRecordFile} 的返回值
	 * @param bRecover 遮挡标示，true: 打开, false: 关闭
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean		SetPrivacyRecover( long lPlayHandle, boolean bRecover);

	/**
	 * \if ENGLISH_LANG
	 * init account by IP
	 * @param pInitAccountIn   init account by ip input parameters
	 * @param pInitAccountOut  init account  by ip output parameters
	 * @param nWaitTime overtime of waiting
	 * @param szLocalIp  local ip is NULL
	 * @param szDeviceIP  device ip
	 * @return true:success, false:failed
	 * \else
	 * 指定设备IP进行账号初始化
	 * @param pInitAccountIn 指定设备IP进行账号初始化入参
	 * @param pInitAccountOut 指定设备IP进行账号初始化出参
	 * @param nWaitTime 超时等待时间
	 * @param szLocalIp 本地IP,设为NULL
	 * @param szDeviceIP 设备IP
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean    InitAccountByIP(NET_IN_INIT_ACCOUNT pInitAccountIn, NET_OUT_INIT_ACCOUNT pInitAccountOut, int nWaitTime, String szLocalIp, String szDeviceIP);

	/**
	 * \if ENGLISH_LANG
	 * add mission
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam   add mission input parameters
	 * @param pstOutParam  add mission output parameters
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * 添加任务
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 添加任务入参
	 * @param pstOutParam 添加任务出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean    AddMission(long lLoginID, NET_IN_ADD_MISSION pstInParam, NET_OUT_ADD_MISSION pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * transmit info for web extend
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam   transmit info for web extend input parameters
	 * @param pstOutParam  transmit info for web extend output parameters
	 * @param nWaitTime overtime of waiting
	 * @return true:success, false:failed
	 * \else
	 * Web透传扩展接口
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam Web透传扩展接口入参
	 * @param pstOutParam Web透传扩展接口出参
	 * @param nWaitTime 超时等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean    TransmitInfoForWebEx(long lLoginID, NET_IN_TRANSMIT_INFO pstInParam, NET_OUT_TRANSMIT_INFO pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get operate of alarm region
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType Type of get operate, refer to 参考  {@link NET_EM_GET_ALARMREGION_INFO}
	 * @param pstuInParam Get operate of alarm region input param
	 * @param pstuOutParam Get operate of alarm region output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 报警主机获取操作
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType 获取的操作类型, 参考  {@link NET_EM_GET_ALARMREGION_INFO}
	 * @param pstuInParam 报警主机获取操作输入参数
	 * @param pstuOutParam 报警主机获取操作输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean			GetAlarmRegionInfo(long lLoginID,int emType, Object pstuInParam, Object pstuOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Set operate of alarm region
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType Type of set operate, refer to 参考  {@link NET_EM_SET_ALARMREGION_INFO}
	 * @param pstuInParam Set operate of alarm region input param
	 * @param pstuOutParam Set operate of alarm region output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 报警主机设置操作
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType 设置的操作类型, 参考  {@link NET_EM_SET_ALARMREGION_INFO}
	 * @param pstuInParam 报警主机设置操作输入参数
	 * @param pstuOutParam 报警主机设置操作输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean			SetAlarmRegionInfo(long lLoginID,int emType, Object pstuInParam, Object pstuOutParam, int nWaitTime);

    /**
     * \if ENGLISH_LANG
     * Get the SIMINFO of SIM card
     * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
     * @param emType Type of SIM info, refer to 参考  {@link EM_SIMINFO_TYPE}
     * @param pstuInParam Get the SIMINFO of SIM card input param
     * @param pstuOutParam Get the SIMINFO of SIM card output param
     * @param nWaitTime overtime of waiting device back
     * @return true:success, false:failed
     * \else
     * 获取SIM卡信息
     * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
     * @param emType SIM卡信息类型, 参考  {@link EM_SIMINFO_TYPE}
     * @param pstuInParam 获取SIM卡信息输入参数
     * @param pstuOutParam 获取SIM卡信息输出参数
     * @param nWaitTime 等待时间
     * @return true:成功, false:失败
     * \endif
     */
    public static native boolean			GetMobileSIMInfo(long lLoginID,int emType, Object pstuInParam, Object pstuOutParam, int nWaitTime);

    /**
     * \if ENGLISH_LANG
     * Real play by stream data type
     * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
     * @param pstuInParam Real play by stream data type input param
     * @param pstuOutParam Real play by stream data type output param
     * @param nWaitTime overtime of waiting device back
     * @return successful return to play Handle,failed return to 0.
     * \else
     * 开始实时预览并指定回调数据格式
     * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
     * @param pstuInParam 开始实时预览并指定回调数据格式输入参数
     * @param pstuOutParam 开始实时预览并指定回调数据格式输出参数
     * @param nWaitTime 等待时间
     * @return 成功返回playHandle,失败返回0
     * \endif
     */
    public static native long			RealPlayByDataType(long lLoginID, NET_IN_REALPLAY_BY_DATA_TYPE pstuInParam, NET_OUT_REALPLAY_BY_DATA_TYPE pstuOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Download record by stream data type
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuInParam Download record by stream data type input param
	 * @param pstuOutParam Download record by stream data type output param
	 * @param nWaitTime overtime of waiting device back
     * @return successful return to download ID,failed return to 0.
	 * \else
	 * 开始下载并指定回调数据格式
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuInParam 开始下载并指定回调数据格式输入参数
	 * @param pstuOutParam 开始下载并指定回调数据格式输出参数
	 * @param nWaitTime 等待时间
     * @return 成功返回下载ID,失败返回0
	 * \endif
	 */
	public static native long			DownloadByDataType(long lLoginID, NET_IN_DOWNLOAD_BY_DATA_TYPE pstuInParam, NET_OUT_DOWNLOAD_BY_DATA_TYPE pstuOutParam, int nWaitTime);

    /**
     * \if ENGLISH_LANG
     * Convert Stream File
     * @param srcPath src file path
     * @param dstPath dst file path
     * @param type convert file type {@link SC_TYPE}
     * @return true:success, false:failed
     * \else
     * 转换码流文件
     * @param srcPath 源文件路径
     * @param dstPath 目标文件路径
     * @param type 转换文件类型 参考{@link SC_TYPE}
     * @return true:成功, false:失败
     * \endif
     */
    public static native boolean		ConvertStreamFile(String srcPath, String dstPath, int type);

    /**
     * \if ENGLISH_LANG
     * Open Stream Convert File
     * @param filePath file path
     * @param type file type {@link SC_TYPE}
     * @return successful return to file Handle,failed return to 0.
     * \else
     * 打开码流转换文件
     * @param filePath 文件路径
     * @param type 文件类型 参考{@link SC_TYPE}
     * @return 成功返回句柄,失败返回0
     * \endif
     */
    public static native long		SC_OpenFile(String filePath, int type);

    /**
     * \if ENGLISH_LANG
     * Write to Convert Stream File
     * @param SCHandle handle, return from {@link INetSDK#SC_OpenFile}
     * @param data data
     * @param datalen data len
     * @return true:success, false:failed
     * \else
     * 写入转换码流文件
     * @param SCHandle 码流转换句柄 {@link INetSDK#SC_OpenFile}的返回值
     * @param data 数据
     * @param datalen 数据长度
     * @return true:成功, false:失败
     * \endif
     */
    public static native boolean		SC_InputData(long SCHandle, byte[] data, int datalen);

    /**
     * \if ENGLISH_LANG
     * Close Convert Stream File
     * @param SCHandle handle, return from {@link INetSDK#SC_OpenFile}
     * @return true:success, false:failed
     * \else
     * 关闭转换码流文件
     * @param SCHandle 码流转换句柄 {@link INetSDK#SC_OpenFile}的返回值
     * @return true:成功, false:失败
     * \endif
     */
    public static native boolean		SC_Close(long SCHandle);


	/**
	 * \if ENGLISH_LANG
	 * get net card info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType Card information types, refer to 参考  {@link EM_NET_QUERY_TYPE}
	 * @param pstuInParam Get net card info input param
	 * @param pstuOutParam Get net card info output param
      * @param nError   Error code
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 获取网卡信息
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType 网卡信息类型, 参考  {@link EM_NET_QUERY_TYPE}
	 * @param pstuInParam 获取网卡信息输入参数
	 * @param pstuOutParam 获取网卡信息输出参数
     * @param nError   错误码
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean			QueryNetStat(long lLoginID,int emType, Object pstuInParam, Object pstuOutParam, Integer nError, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get logic volume status
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 获取分区状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean          NASGetLogicVolumeStatus(long lLoginID, NET_IN_NAS_GETLOGICVOLUMESTATUS pstuInParam, NET_OUT_NAS_GETLOGICVOLUMESTATUS pstuOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Attach NAS repair state
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return successful return to file Handle,failed return to 0.
	 * \else
	 * 订阅分区修复状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return 成功返回句柄,失败返回0
	 * \endif
	 */
	public static native long             AttachNASRepairState(long lLoginID, NET_IN_ATTACH_NAS_REPAIRSTATE pstuInParam,  NET_OUT_ATTACH_NAS_REPAIRSTATE pstuOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Detach NAS repair state
	 * @param lAttachHandle login handle, return from {@link INetSDK#AttachNASRepairState}
	 * @return true:success, false:failed
	 * \else
	 * 取消订阅分区修复状态
	 * @param lAttachHandle {@link INetSDK#AttachNASRepairState} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean         DetachNASRepairState(long lAttachHandle);

	/**
	 * \if ENGLISH_LANG
	 * Set user auth info,the resource of pInParam and pOutParam is requested and released by user
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 配置隐私空间信息,pInParam和pOutParam内存由用户申请和释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean NASFileSetUserAuthInfo(long lLoginID, NET_IN_SET_USER_AUTH_INFO pstuInParam, NET_OUT_SET_USER_AUTH_INFO pstuOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Modify privacy space password,the resource of pInParam and pOutParam is requested and released by user
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 修改隐私空间密码,pInParam和pOutParam内存由用户申请和释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean NASFileModifyPassword(long lLoginID, NET_IN_MODIFY_PASSWORD pstuInParam, NET_OUT_MODIFY_PASSWORD pstuOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Authenticate password,the resource of pInParam and pOutParam is requested and released by user
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 鉴权密码功能,pInParam和pOutParam内存由用户申请和释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean NASFileAuthenticate(long lLoginID, NET_IN_AUTHENTICATE pstuInParam, NET_OUT_AUTHENTICATE pstuOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @param nWaitTime overtime of waiting device back
     * @return true:success, false:failed
	 * \else
	 * 检查云端是否有可升级软件
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean CloudUpgraderCheck(NET_IN_CLOUD_UPGRADER_CHECK pstuInParam, NET_OUT_CLOUD_UPGRADER_CHECK pstuOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @return successful return to file Handle,failed return to 0.
	 * \else
	 * 云下载升级软件
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @return 成功返回句柄,失败返回0
	 * \endif
	 */
	public static native long CloudUpgraderDownLoad(NET_IN_CLOUD_UPGRADER_DOWN pstuInParam, NET_OUT_CLOUD_UPGRADER_DOWN pstuOutParam);

	/**
	 * \if ENGLISH_LANG
	 *
	 * @param lDownloadHandle return from {@link INetSDK#CloudUpgraderDownLoad}
	 * @return true:success, false:failed
	 * \else
	 * 停止云下载
	 * @param lDownloadHandle {@link INetSDK#CloudUpgraderDownLoad}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean CloudUpgraderStop(long lDownloadHandle);

	/**
	 * \if ENGLISH_LANG
	 * modify Onvif user password,user malloc and free (pstInParam's and pstOutParam's) memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam  input param
	 * @param pstOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 修改 Onvif 用户密码,pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam  输入参数
	 * @param pstOutParam  输出参数
	 * @param nWaitTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean          ModifyOnvifUserPassword(long lLoginID, NET_IN_MODIFYONVIF_PASSWORD_INFO pstInParam, NET_OUT_MODIFYONVIF_PASSWORD_INFO pstOutParam, int nWaitTime);

	public static native boolean          AddOnvifUser(long lLoginID, NET_IN_ADD_ONVIF_USER_INFO pstInParam, NET_OUT_ADD_ONVIF_USER_INFO pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Set playback callback stream type
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emStreamType playback callback stream type {@link EM_PLAYBACK_STREAM_TYPE}
	 * @return true:success, false:failed
	 * \else
	 * 设置回放回调码流类型
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emStreamType 回放回调码流类型 {@link EM_PLAYBACK_STREAM_TYPE}
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean SetPlayBackStreamType(long lLoginID, int emStreamType);

    /**
     * \if ENGLISH_LANG
     * set real time monitor encrypt data recall,provide user with device data,when cbRealData is NULL, end recalling data
     * @param lRealHandle return from {@link INetSDK#RealPlay}
     * @param cbRealData recall function,for sending real time data from device
     * @return true:success, false:failed
     * \else
     * 设置实时预览加密数据回调,给用户提供设备流出的数据,当cbRealData为NULL时结束回调数据
     * @param lRealHandle {@link INetSDK#RealPlay}的返回值
     * @param cbRealData 回调函数,用于传出设备流出的实时数据
     * @return true:成功, false:失败
     * \endif
     * @see {@link INetSDK#RealPlay}  {@link INetSDK#RealPlayEx}
     */
    public static native boolean SetEncryptRealDataCallBack(long lRealHandle, CB_fEncryptRealDataCallBackEx cbRealData);

	/**
	 * \if ENGLISH_LANG
	 * Get Sensor Collect Support list, user mallloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 获取可采集的传感器列表, pInParam和pOutParam内存由用户申请和释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetSensorCollectSupportList(long lLoginID, NET_IN_GET_SENSOR_COLLECT_SUPPORT_LIST pInParam, NET_OUT_GET_SENSOR_COLLECT_SUPPORT_LIST pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 在线升级检查是否有可用升级包, pInParam和pOutParam内存由用户申请和释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean CheckCloudUpgrader(long lLoginID, NET_IN_CHECK_CLOUD_UPGRADER pInParam, NET_OUT_CHECK_CLOUD_UPGRADER pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 执行在线云升级, pInParam和pOutParam内存由用户申请和释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean ExecuteCloudUpgrader(long lLoginID, NET_IN_EXECUTE_CLOUD_UPGRADER pInParam, NET_OUT_EXECUTE_CLOUD_UPGRADER pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 获取在线升级状态, pInParam和pOutParam内存由用户申请和释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetCloudUpgraderState(long lLoginID, NET_IN_GET_CLOUD_UPGRADER_STATE pInParam, NET_OUT_GET_CLOUD_UPGRADER_STATE pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get RemoteLowRateWPAN Caps, user mallloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 获取设备能力, pInParam和pOutParam内存由用户申请和释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetRemoteLowRateWPANCaps(long lLoginID, NET_IN_GET_REMOTELOWRATEWPAN_CAPS pInParam, NET_OUT_GET_REMOTELOWRATEWPAN_CAPS pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get Coaxial Sensor Info, user mallloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 获取接入的传感器信息, pInParam和pOutParam内存由用户申请和释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetCoaxialSensorInfo(long lLoginID, NET_IN_GET_COAXIAL_SENSOR_INFO pInParam, NET_OUT_GET_COAXIAL_SENSOR_INFO pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get MObile Pusher Caps
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 获取手机推送支持能力
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetMobilePusherCaps(long lLoginID, NET_IN_GET_MOBILE_PUSHER_CAPS pInParam, NET_OUT_GET_MOBILE_PUSHER_CAPS pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Enable Mobile Pusher, user mallloc memory of pInParam and pOutParam
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 设置手机报警推送使能
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean EnablePushMobilePusher(long lLoginID, NET_IN_ENABLE_PUSH_MOBILE_PUSHER pInParam, NET_OUT_ENABLE_PUSH_MOBILE_PUSHER pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Add Mobile Pusher Notification
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 手机APP向设备添加一个推送订阅
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean AddMobilePusherNotification(long lLoginID, NET_IN_ADD_MOBILE_PUSHER_NOTIFICATION pInParam, NET_OUT_ADD_MOBILE_PUSHER_NOTIFICATION pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Delete Mobile Pusher Notification
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 手机APP向设备删除一个推送订阅
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean DelMobilePusherNotification(long lLoginID, NET_IN_DEL_MOBILE_PUSHER_NOTIFICATION pInParam, NET_OUT_DEL_MOBILE_PUSHER_NOTIFICATION pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * put disposition to target recognition, user malloc and free (pstInParam's and pstOutParam's) memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 以目标库的角度进行布控, pstInParam与pstOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean FaceRecognitionPutDisposition(long lLoginID, NET_IN_FACE_RECOGNITION_PUT_DISPOSITION_INFO pstInParam, NET_OUT_FACE_RECOGNITION_PUT_DISPOSITION_INFO pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * delete disposition from target recognition, user malloc and free (pstInParam's and pstOutParam's) memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 以目标库的角度进行撤控, pstInParam与pstOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean FaceRecognitionDelDisposition(long lLoginID, NET_IN_FACE_RECOGNITION_DEL_DISPOSITION_INFO pstInParam, NET_OUT_FACE_RECOGNITION_DEL_DISPOSITION_INFO pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * target recognition database info operation, including add and delete, ,user malloc and free (pstInParam's and pstOutParam's) memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 目标识别数据库信息操作（包括添加,修改和删除）,pstInParam与pstOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean OperateFaceRecognitionDB(long lLoginID, NET_IN_OPERATE_FACERECONGNITIONDB pstInParam, NET_OUT_OPERATE_FACERECONGNITIONDB pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * by filter search target recognition result ,user malloc and free (pstInParam's and pstOutParam's) memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 按条件查询目标识别结果 ,pstInParam与pstOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean StartFindFaceRecognition(long lLoginID, NET_IN_STARTFIND_FACERECONGNITION pstInParam, NET_OUT_STARTFIND_FACERECONGNITION pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * search target recognition result:nFilecount: need search item,  return value is media file item  return value<nFilecount then corresponding period file search complete(search max of 20 records each time)
	 * user malloc and free (pstInParam's and pstOutParam's) memory
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 查找目标识别结果:nFilecount:需要查询的条数, 返回值为媒体文件条数 返回值<nFilecount则相应时间段内的文件查询完毕(每次最多只能查询20条记录)
	 * pstInParam与pstOutParam内存由用户申请释放
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean DoFindFaceRecognition(NET_IN_DOFIND_FACERECONGNITION pstInParam, NET_OUT_DOFIND_FACERECONGNITION pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * end search
	 * @param lFindHandle Find handle
	 * @return true:success, false:failed
	 * \else
	 * 结束查询
	 * @param lFindHandle 查找句柄
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean StopFindFaceRecognition(long lFindHandle);

	/**
	 * \if ENGLISH_LANG
	 * interface of operate AccessControlManager
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emtype operate type of accesscontroller, refer to {@link NET_EM_ACCESS_CTL_MANAGER}
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 门禁控制器操作接口
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emtype 门禁控制器类型, 参考 {@link NET_EM_ACCESS_CTL_MANAGER}
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean OperateAccessControlManager(long lLoginID, int emtype, Object pstInParam, Object pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * interface of operate user info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emtype operate type of userinfo, refer to {@link NET_EM_ACCESS_CTL_USER_SERVICE}
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 门禁人员信息管理接口
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emtype 人员信息操作类型, 参考 {@link NET_EM_ACCESS_CTL_USER_SERVICE}
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean OperateAccessUserService(long lLoginID, int emtype, Object pstInParam, Object pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * interface of operate card info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emtype operate type of cardinfo, refer to {@link NET_EM_ACCESS_CTL_CARD_SERVICE}
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 门禁卡片信息管理接口
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emtype 卡片信息操作类型, 参考 {@link NET_EM_ACCESS_CTL_CARD_SERVICE}
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean OperateAccessCardService(long lLoginID, int emtype, Object pstInParam, Object pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * interface of operate face info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emtype operate type of faceinfo, refer to {@link NET_EM_ACCESS_CTL_FACE_SERVICE}
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 门禁目标信息管理接口
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emtype 目标信息操作类型, 参考 {@link NET_EM_ACCESS_CTL_FACE_SERVICE}
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean OperateAccessFaceService(long lLoginID, int emtype, Object pstInParam, Object pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 字符串加密接口 (pInParam, pOutParam内存由用户申请释放)
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean EncryptString(NET_IN_ENCRYPT_STRING pstInParam, NET_OUT_ENCRYPT_STRING pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 开始查询SCADA点位历史数据,pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native long StartFindSCADA(long lLoginID, NET_IN_SCADA_START_FIND pInParam, NET_OUT_SCADA_START_FIND pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *
	 * @param lFindHandle find handle, return from {@link INetSDK#StartFindSCADA}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 获取SCADA点位历史数据,pInParam与pOutParam内存由用户申请释放
	 * @param lFindHandle {@link INetSDK#StartFindSCADA} 的返回值
	 * @param pInParam 输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean DoFindSCADA(long lFindHandle, NET_IN_SCADA_DO_FIND pInParam, NET_OUT_SCADA_DO_FIND pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *
	 * @param lFindHandle find handle, return from {@link INetSDK#StartFindSCADA}
	 * @return true:success, false:failed
	 * \else
	 * 停止查询SCADA点位历史数据
	 * @param lFindHandle {@link INetSDK#StartFindSCADA} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean StopFindSCADA(long lFindHandle);


	/**
	 * \if ENGLISH_LANG
	 * subscribe video statistical summary,user malloc and free (pstInParam's and pstOutParam's) memory
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam  input param
	 * @param pstOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 订阅视频统计摘要信息,pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam  输入参数
	 * @param pstOutParam  输出参数
	 * @param nWaitTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native long          AttachVideoStatSummary(long lLoginID, NET_IN_ATTACH_VIDEOSTAT_SUM pstInParam, NET_OUT_ATTACH_VIDEOSTAT_SUM pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * unsubscribe video statistical summary
	 * @param lAttachHandle return invalue of interface {@link INetSDK#AttachVideoStatSummary}
	 * @return true:success, false:failed
	 * \else
	 * 取消订阅视频统计摘要信息
	 * @param lAttachHandle 接口 {@link INetSDK#AttachVideoStatSummary} 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean       DetachVideoStatSummary(long lAttachHandle);

	/**
	 * \if ENGLISH_LANG
	 * Get list of controller
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 获取控制器设备列表及状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean      GetSCADADeviceStatus(long lLoginID, NET_IN_GET_SCADA_STATUS pInParam, NET_OUT_GET_SCADA_STATUS pOutParam, int nWaitTime);


	// 获取设备状态, DMSS专用接口, pInParam与pOutParam内存由用户申请释放
	/**
	 * \if ENGLISH_LANG
	 * Get Dev Status, for DMSS only, the pInParam and pOutParam memorey must been new by Customer
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 获取设备状态, DMSS专用接口, pInParam与pOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean	 GetUnifiedStatus(long lLoginID, NET_IN_UNIFIEDINFOCOLLECT_GET_DEVSTATUS pInParam, NET_OUT_UNIFIEDINFOCOLLECT_GET_DEVSTATUS pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Order wireless code info port,user malloc memory of pstInBuf and pstOutBuf
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 订阅无线对码信息接口,pstInParam与pstOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native long	 AttachLowRateWPAN(long lLoginID, NET_IN_ATTACH_LOWRATEWPAN pInParam, NET_OUT_ATTACH_LOWRATEWPAN pOutParam, int nWaitTime);

    /**
     * \if ENGLISH_LANG
     * Cancel order wireless info port
     * @param lAttachHandle {@link INetSDK#AttachLowRateWPAN} return value
     * @return true:successful, false: failed
     * \else
     * 取消订阅无线对码信息接口
     * @param lAttachHandle {@link INetSDK#AttachLowRateWPAN}的返回值
     * @return true:成功, false:失败
     * \endif
     */
    public static native boolean       DetachLowRateWPAN(long lAttachHandle);

	/**
	 * \if ENGLISH_LANG
	 * get lens info,user malloc memory of pstInBuf and pstOutBuf
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 获取镜头信息接口,pstInParam与pstOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean	 GetLensInfo(long lLoginID, NET_IN_GETLENSINFO pInParam, NET_OUT_GETLENSINFO pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * adjustment of relative lens focus,user malloc memory of pstInBuf and pstOutBuf
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 相对焦距调节接口,pstInParam与pstOutParam内存由用户申请释放
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean	 AdjustRelativeLensFocus(long lLoginID, NET_IN_ADJUSTRELATIVELENSFOCUS pInParam, NET_OUT_ADJUSTRELATIVELENSFOCUS pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * set local mode
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType  input param {@link EM_LOCAL_MODE}
	 * @param nValue  value depend on emType
	 * @return true:success, false:failed
	 * \else
	 * 设置本地模式
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType  输入参数 {@link EM_LOCAL_MODE}
	 * @param nValue  值取决于emType
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean	 SetLocalMode(long lLoginID, int emType, Object nValue);

	public static native boolean	 GetGDPRVersion(long lLoginID, Integer nVersion, int nWaitTime);

    /**
     * \if ENGLISH_LANG
     * add nodes
     * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
     * @param pInParam  input param
     * @param pOutParam  output param
     * @param nWaitTime
     * @return true:success, false:failed
     * \else
     * 组织目录管理-添加节点
     * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
     * @param pInParam  输入参数
     * @param pOutParam  输出参数
     * @param nWaitTime
     * @return true:成功, false:失败
     * \endif
     */
    public static native boolean OrganizationAddNodes(long lLoginID, SDK_IN_ORGANIZATION_ADD_NODES pInParam, SDK_OUT_ORGANIZATION_ADD_NODES pOutParam, int nWaitTime);

    /**
     * \if ENGLISH_LANG
     * delete nodes
     * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
     * @param pInParam  input param
     * @param pOutParam  output param
     * @param nWaitTime
     * @return true:success, false:failed
     * \else
     * 组织目录管理-删除节点
     * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
     * @param pInParam  输入参数
     * @param pOutParam  输出参数
     * @param nWaitTime
     * @return true:成功, false:失败
     * \endif
     */
    public static native boolean OrganizationDeleteNodes(long lLoginID, SDK_IN_ORGANIZATION_DELETE_NODES pInParam, SDK_OUT_ORGANIZATION_DELETE_NODES pOutParam, int nWaitTime);

    /**
     * \if ENGLISH_LANG
     * get nodes
     * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
     * @param pInParam  input param
     * @param pOutParam  output param
     * @param nWaitTime
     * @return true:success, false:failed
     * \else
     * 组织目录管理-获取节点
     * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
     * @param pInParam  输入参数
     * @param pOutParam  输出参数
     * @param nWaitTime
     * @return true:成功, false:失败
     * \endif
     */
    public static native boolean OrganizationGetNodes(long lLoginID, SDK_IN_ORGANIZATION_GET_NODES pInParam, SDK_OUT_ORGANIZATION_GET_NODES pOutParam, int nWaitTime);

    /**
     * \if ENGLISH_LANG
     * set nodes
     * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
     * @param pInParam  input param
     * @param pOutParam  output param
     * @param nWaitTime
     * @return true:success, false:failed
     * \else
     * 组织目录管理-设置节点
     * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
     * @param pInParam  输入参数
     * @param pOutParam  输出参数
     * @param nWaitTime
     * @return true:成功, false:失败
     * \endif
     */
    public static native boolean OrganizationSetNode(long lLoginID, SDK_IN_ORGANIZATION_SET_NODE pInParam, SDK_OUT_ORGANIZATION_SET_NODE pOutParam, int nWaitTime);
	
		/**
	 * \if ENGLISH_LANG
	 * GDPR Enable
	 * @param bEnable
	 * \else
	 * GDPR使能全局开关
	 * @param bEnable
	 * \endif
	 */
	public static native void	 SetGDPREnable(boolean bEnable);


	/**
	 * \if ENGLISH_LANG
	 * query user right
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 查询用户权限
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean QueryUserRights(long lLoginID, NET_IN_QUERYUSER_RIGHT pInParam, NET_OUT_QUERYUSER_RIGHT pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * display private data
	 * @param lPlayHandle play handle, {@link INetSDK#RealPlay} or {@link INetSDK#RealPlayEx}
	 * @param bTrue Open or not
	 * @return true:success, false:failed
	 * \else
	 * 显示私有数据，例如规则框，规则框报警，移动侦测等
	 * @param lPlayHandle 播放句柄，{@link INetSDK#RealPlay} 或者 {@link INetSDK#RealPlayEx}的返回值
	 * @param bTrue 打开或关闭
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean RenderPrivateData(long lPlayHandle, boolean bTrue);

	public static native boolean GetDevWifiListInfo(NET_IN_GET_DEV_WIFI_LIST pInParam, NET_OUT_GET_DEV_WIFI_LIST pOutParam, int nWaitTime);

	public static native boolean SetDevWifiInfo(NET_IN_SET_DEV_WIFI pInParam, NET_OUT_SET_DEV_WIFI pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Attach monitor wall scene
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return handle
	 * \else
	 * 订阅电视墙场景
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return 句柄
	 * \endif
	 */
	public static native long AttachMonitorWallScene(long lLoginID, NET_IN_ATTACH_MONITOR_WALL_SCENE pInParam, NET_OUT_ATTACH_MONITOR_WALL_SCENE pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Detach monitor wall scene
	 * @param lAttachHandle  return from {@link INetSDK#AttachMonitorWallScene}
	 * @return true:success, false:failed
	 * \else
	 * 取消订阅电视墙场景
	 * @param lAttachHandle 接口返回值{@link INetSDK#AttachMonitorWallScene}
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean DetachMonitorWallScene(long lAttachHandle);

	/**
	 * \if ENGLISH_LANG
	 * Acquisition capability
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 获取能力级
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetHumanRadioCaps(long lLoginID, NET_IN_GET_HUMAN_RADIO_CAPS pInParam, NET_OUT_GET_HUMAN_RADIO_CAPS pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Modify remote device password
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 修改前端相机的登录密码
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean ModifyRemoteDevicePassword(long lLoginID, NET_IN_MODIFY_REMOTEDEVICE_PASSWORD pInParam, NET_OUT_MODIFY_REMOTEDEVICE_PASSWORD pOutParam, int nWaitTime);
	
		/**
	 * \if ENGLISH_LANG
	 * Get mobile pusher event list
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * \else
	 * 获取手机推送事件能力
	 *@param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetMobilePusherEventList(long lLoginID, NET_IN_GET_MOBILE_PUSHER_EVNET_LIST pInParam, NET_OUT_GET_MOBILE_PUSHER_EVNET_LIST pOutParam, int nWaitTime);


	/**
	 * \if ENGLISH_LANG
	 * 获取录像文件指定通道号和时间的最近的一帧I帧数据
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 获取录像文件指定通道号和时间的最近的一帧I帧数据
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetIFrameDataFromStorageVideo(long lLoginID,  NET_IN_GET_I_FRAME_DATA_FROM_STORAGE_VIDEO pInParam, NET_OUT_GET_I_FRAME_DATA_FROM_STORAGE_VIDEO pOutParam, int nWaitTime);
	/**
	 * \if ENGLISH_LANG
	 * web get config
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param szCommand  {@link NET_EM_CFG_OPERATE_TYPE }
	 * @param nChannelID  channel
	 * @param szOutBuffer config buffer
	 * @param error error code
	 * @param waittime wait time
	 *  @return true:success,false:failed
	 * \else
	 * web获取配置
	 *@param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param szCommand 配置类型 {@link NET_EM_CFG_OPERATE_TYPE }
	 * @param nChannelID 通道号
	 * @param szOutBuffer 配置缓存
	 * @param error 错误码
	 * @param waittime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetNewDevConfigForWeb(long lLoginID,  byte szCommand[], int nChannelID, byte szOutBuffer[], Integer error, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * web set config
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param szCommand  {@link NET_EM_CFG_OPERATE_TYPE }
	 * @param nChannelID  channel
	 * @param szInBuffer config data
	 * @param error error code
	 * @param restart  restart
	 * @param waittime wait time
	 *  @return true:success,false:failed
	 * \else
	 * web设置配置
	 *@param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param szCommand 配置类型 {@link NET_EM_CFG_OPERATE_TYPE }
	 * @param nChannelID 通道号
	 * @param szInBuffer 配置数据
	 * @param error 错误码
	 * @param restart 是否重置
	 * @param waittime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean SetNewDevConfigForWeb(long lLoginID, byte szCommand[], int nChannelID, byte szInBuffer[],Integer error, Integer restart, int waittime);
	/**
	 * \if ENGLISH_LANG
	 * Get remote collect device information
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam  input param
	 * @param pstOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 获取远程采集
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam  输入参数
	 * @param pstOutParam  输出参数
	 * @param nWaitTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetRemoteCollectDevInfo(long lLoginID, NET_IN_GET_REMOTE_COLLECT_DEV_INFO pstInParam, NET_OUT_GET_REMOTE_COLLECT_DEV_INFO pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Start remote collect to file
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return collect handle
	 * \else
	 * 开始文件方式远程采集设备信息接口
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return 采集句柄
	 * \endif
	 */
	public static native long StartRemoteCollectToFile(long lLoginID, NET_IN_START_REMOTE_COLLECT_TO_FILE pInParam, NET_OUT_START_REMOTE_COLLECT_TO_FILE pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get remote collect device information
	 * @param lCollectID collect ID, return from {@link INetSDK#StartRemoteCollectToFile}
	 * @return true:success, false:failed
	 * \else
	 * 获取远程采集
	 * @param lCollectID collect ID{@link INetSDK#StartRemoteCollectToFile} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean StopRemoteCollectToFile(long lCollectID);

	/**
	 * \if ENGLISH_LANG
	 * down load piece file,multiple triggers for subcontracting to download large files,each request specifies the file name and download offset
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 文件下载，多次触发分包下载大文件，每次请求指定文件名和下载偏移
	 *  @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return  true:成功, false:失败
	 * \endif
	 */
	public static native boolean DownloadPieceFile(long lLoginID, NET_IN_DOWNLOAD_PIECE_FILE pInParam, NET_OUT_DOWNLOAD_PIECE_FILE pOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * pre-upload remote file to remote device
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 通过存储设备远程预上传文件至前端设备,用于识别前端设备是否具备接收文件的条件
	 *  @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return  true:成功, false:失败
	 * \endif
	 */
	public static native boolean RemotePreUploadFile(long lLoginID, NET_IN_REMOTE_PREUPLOAD_FILE pInParam, NET_OUT_REMOTE_PREUPLOAD_FILE pOutParam,int nWaitTime);
	/**
	 * \if ENGLISH_LANG
	 * Start to upload remote file to remote device
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return collect handle
	 * \else
	 * 开始异步通过存储设备上传文件到前端设备
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return 采集句柄
	 * \endif
	 */
	public static native long StartRemoteUploadFile(long lLoginID, NET_IN_REMOTE_UPLOAD_FILE pInParam, NET_OUT_REMOTE_UPLOAD_FILE pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Stop to upload remote file to remote device
	 * @param lRemoteUploadFileID remote upload file ID, return from {@link INetSDK#StopRemoteUploadFile}
	 * @return true:success, false:failed
	 * \else
	 * 停止异步通过存储设备上传文件到前端设备
	 * @param lRemoteUploadFileID remote upload file ID,{@link INetSDK#StopRemoteUploadFile}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean StopRemoteUploadFile(long lRemoteUploadFileID);

	/**
	 * \if ENGLISH_LANG
	 * Set WLAN Config Info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 设置WLAN配置
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean SetWlanConfigInfo(long lLoginID, NET_IN_WLAN_CONFIG_INFO pInParam, NET_OUT_WLAN_CONFIG_INFO pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get remote upgrade state
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 获取远程升级状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetRemoteUpgradeState( long lLoginID, NET_IN_GET_REMOTEUPGRADE_STATE pInParam, NET_OUT_GET_REMOTEUPGRADE_STATE pOutParam, int nWaitTime );

	/**
	 * \if ENGLISH_LANG
	 * Start remote upgrade
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return upgrade handle
	 * \else
	 * 开始升级远程设备程序
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return 远程升级句柄
	 * \endif
	 */
	public static native long StartRemoteUpgrade(long lLoginID, NET_IN_START_REMOTE_UPGRADE_INFO pInParam, NET_OUT_START_REMOTE_UPGRADE_INFO pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Stop remote upgrade
	 * @param lUpgradeID remote upgrade handle, return from {@link INetSDK#StartRemoteUpgrade}
	 * @return true:success, false:failed
	 * \else
	 * 结束升级远程设备程序
	 * @param lUpgradeID 远程升级句柄,{@link INetSDK#StartRemoteUpgrade}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean StopRemoteUpgrade(long lUpgradeID);
	/**
	 * \if ENGLISH_LANG
	 * Get Cloud Upgrader State
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * 获取升级状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean CloudUpgraderGetState(long lLoginID, NET_IN_CLOUD_UPGRADER_GET_STATE pInParam, NET_OUT_CLOUD_UPGRADER_GET_STATE pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * The mobile app queries the device for the current configuration name and subscription configuration of the device
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * 手机APP向设备查询当前使用的配置名称，以及设备的订阅配置
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetMobilePusherNotificationCfg(long lLoginID, NET_IN_GET_MOBILE_PUSHER_NOTIFICATION_INFO pInParam, NET_OUT_GET_MOBILE_PUSHER_NOTIFICATION_INFO pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * get moblie all subcribe cfg info
	 * @param pstuCfg input param
	 * @param nError error value
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * 获取手机全部订阅推送信息
	 * @param pstuCfg  入参
	 * @param nError 错误码
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetMobileSubscribeAllCfg(long lLoginID, NET_MOBILE_SUBSCRIBE_ALL_CFG_INFO pstuCfg, Integer nError, int nWaitTime);
	/**
	 * \if ENGLISH_LANG
	 * get sniffer caps
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 *  获取抓包能力
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetSnifferCaps(long lLoginID, NET_IN_GET_SNIFFER_CAP pInParam, NET_OUT_GET_SNIFFER_CAP pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * remotely control device-extend
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emType control type, refer to 参考  {@link EM_DBGINFO_OP_TYPE}
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * 设备控制-扩展
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emType 控制类型, 参考  {@link EM_DBGINFO_OP_TYPE}
	 * @param pInParam 入参
	 * @param pOutParam 出参
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean OperateDebugInfo(long lLoginID, int emType, Object pInParam, Object pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Attach debug info
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return handle
	 * \else
	 * 订阅调试日志回调
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return 订阅句柄
	 * \endif
	 */
	public static native long AttachDebugInfo(long lLoginID, NET_IN_ATTACH_DBGINFO pInParam, NET_OUT_ATTACH_DBGINFO pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Detach debug info
	 * @param lAttachHanle attach debug info handle, return from {@link INetSDK#AttachDebugInfo}
	 * @return true:success, false:failed
	 * \else
	 * 订阅抓包数据
	 * @param lAttachHanle 订阅调试日志句柄，,{@link INetSDK#AttachDebugInfo}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean DetachDebugInfo(long lAttachHanle);

	/**
	 * \if ENGLISH_LANG
	 * get caught state
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return true:success, false:failed
	 * \else
	 * 获取抓包状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetSnifferInfo(long lLoginID,SDK_IN_GET_SNIFFER_INFO pInParam,SDK_OUT_GET_SNIFFER_INFO  pOutParam, int nWaitTime);
	/**
	 * \if ENGLISH_LANG
	 * attach sniffer
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return Attach handle
	 * \else
	 * 获取抓包状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return 订阅句柄
	 * \endif
	 */
	public static native long AttachSniffer(long lLoginID,NET_IN_ATTACH_SNIFFER pInParam,NET_OUT_ATTACH_SNIFFER pOutParam,int nWaitTime);
	/**
	 * \if ENGLISH_LANG
	 * detach sniffer
	 * @param lAttachHandle ,return from {@link INetSDK#AttachSniffer}
	 * @return true:success, false:failed
	 * \else
	 * 退订抓包数据
	 * @param lAttachHandle ,{@link INetSDK#AttachSniffer}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean DetachSniffer(long lAttachHandle);
	/**
	 * \if ENGLISH_LANG
	 * start caught
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return handle
	 * \else
	 * 开始抓包
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return 句柄
	 * \endif
	 */
	public static native long    StartSniffer(long lLoginID,SDK_IN_START_SNIFFER pInParam,SDK_OUT_START_SNIFFER pOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * stop caught
	 * @param lLoginID ,return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param lSnifferID ,return from {@link INetSDK#StartSniffer}
	 * @return true:success, false:failed
	 * \else
	 * 停止抓包
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param lSnifferID ,return from {@link INetSDK#StartSniffer}
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean StopSniffer(long lLoginID, long lSnifferID);

	/**
	 * \if ENGLISH_LANG
	 * search record items
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 查找记录条数
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean QueryRecordCount(NET_IN_QUEYT_RECORD_COUNT_PARAM pInParam, NET_OUT_QUEYT_RECORD_COUNT_PARAM pOutParam, int waittime);

	/**
	 * \if ENGLISH_LANG
	 * Setting internal control parameters 
	 * \else
	 * 设置内部控制参数
	 * \endif
	 */
	public static native boolean SetInternalControlParam(NET_INTERNAL_CONTROL_PARAM pInParam);

	/**
	 * \if ENGLISH_LANG
	 * modify deivce ip
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @return true:success, false:failed
	 * \else
	 * 修改设备IP
	 * @param lLoginID  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 入参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean QuerySystemStatus(long lLoginID, SDK_SYSTEM_STATUS pInParam, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * modify deivce ip
	 * @param pInBuf input param
	 * @param pOutBuf output param
	 * @return true:success, false:failed
	 * \else
	 * 修改设备IP
	 * @param pInBuf  入参
	 * @param pOutBuf 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean ModifyDeviceEx(NET_IN_MODIFY_IP pInBuf, NET_OUT_MODIFY_IP pOutBuf, int nWaitTime);
	
	/**
	 * \if ENGLISH_LANG
	 * set picture information
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return handle
	 * \else
	 * 订阅目标查询状态
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return 句柄
	 * \endif
	 */
	public static native long AttachFaceFindState(long lLoginID, NET_IN_FACE_FIND_STATE pInParam, NET_OUT_FACE_FIND_STATE pOutParam, int nWaitTime);
	/**
	 * \if ENGLISH_LANG
	 * detach face find state
	 * @param lAttachHandle ,return from {@link INetSDK#AttachFaceFindState}
	 * @return true:success, false:failed
	 * \else
	 * 取消订阅目标查询状态
	 * @param lAttachHandle ,{@link INetSDK#AttachFaceFindState}的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean DetachFaceFindState(long lAttachHandle);

	/**
	 * \if ENGLISH_LANG
	 * reset the system(clear user data and reboot to device init state)
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return handle
	 * \else
	 * 重置设备
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return 句柄
	 * \endif
	 */
	public static native boolean ResetSystem(long lLoginID, NET_IN_RESET_SYSTEM pInParam, NET_OUT_RESET_SYSTEM pOutParam, int nWaitTime);
	/**
	 * \if ENGLISH_LANG
	 * reset the system(clear user data and reboot to device init state)
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @param nWaitTime
	 * @return handle
	 * \else
	 * 重置设备
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @param nWaitTime
	 * @return 句柄
	 * \endif
	 */
	public static native boolean ResetSystemEx(long lLoginID, NET_IN_RESET_SYSTEM_EX pInParam, NET_OUT_RESET_SYSTEM_EX pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 *　get local ipv4
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @return true:success, false:failed
	 * \else
	 * 获取本机所有IPv4
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetLocalIPv4(NET_IN_GET_LOCAL_IPV4 pInParam, NET_OUT_GET_LOCAL_IPV4 pOutParam);

	/**
	 * \if ENGLISH_LANG
	 * set local ipv4,index start from 0,get by GetLocalIPv4 interface
	 * @param nIndex index
	 * @return true:success, false:failed
	 * \else
	 * 选择使用哪个IP。（使用szIPv4的下标，从0开始，由GetLocalIPv4获取）
	 * @param nIndex  下标
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean SetLocalIPv4(int nIndex);

	/**
	 * \if ENGLISH_LANG
	 *　get local ipv6
	 * @param pInParam  input param
	 * @param pOutParam  output param
	 * @return true:success, false:failed
	 * \else
	 * 获取本机所有IPv6
	 * @param pInParam  输入参数
	 * @param pOutParam  输出参数
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetLocalIPv6(NET_IN_GET_LOCAL_IPV6 pInParam, NET_OUT_GET_LOCAL_IPV6 pOutParam);

	/**
	 * \if ENGLISH_LANG
	 * set local ipv6,index start from 0,get by GetLocalIPv6 interface
	 * @param nIndex index
	 * @return true:success, false:failed
	 * \else
	 * 选择使用哪个IP。（使用szIPv6的下标，从0开始，由GetLocalIPv6获取）
	 * @param nIndex  下标
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean SetLocalIPv6(int nIndex);

	/**
	 * Get Software Version
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam  input param
	 * @param pstOutParam output param
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * 获取软件版本
	 * @param lLoginID  登录句柄  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 入参
	 * @param pstOutParam  出参
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 */
	public static native boolean GetSoftwareVersion(long lLoginID, NET_IN_GET_SOFTWAREVERSION_INFO pstInParam, NET_OUT_GET_SOFTWAREVERSION_INFO pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get login auth patch info
	 * @param pInParam  input param
	 * @param pOutParam output param
	 * @return success:true, failed:false
	 * \else
	 * 获取设备登录兼容补丁信息（VTO设备使用）
	 * @param pInParam  输入参数
	 * @param pOutParam 输出参数
	 * @return 成功返回true，失败返回false
	 * \endif
	 */
	public static native boolean		GetLoginAuthPatchInfo(long lLoginID, NET_IN_GET_LOGIN_AUTH_PATCH_INFO pInParam, NET_OUT_GET_LOGIN_AUTH_PATCH_INFO pOutParam);

	/**
	 * \if ENGLISH_LANG
	 * snap picture from record
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam output param
	 * @param nWaitTime wait time
	 * @return success:true, failed:false
	 * \else
	 * 同步录像抓图接口，从录像文件中抓取指定时刻的一帧图片，将图片数据返回给用户
	 * @param lLoginID  登录句柄  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam  输入参数
	 * @param pOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return 成功返回true，失败返回false
	 * \endif
	 */
	public static native boolean		SnapPicFromRecord(long lLoginID, NET_IN_SNAP_PIC_FROM_REC pInParam, NET_OUT_SNAP_PIC_FROM_REC pOutParam, int nWaitTime);

	/**
	 * Paging to get NMP device port information
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam  input param
	 * @param pOutParam output param
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * 分页获取NMP设备端口信息
	 * @param lLoginID  登录句柄  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 入参
	 * @param pOutParam  出参
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 */
	public static native boolean GetNMPPortInfoByPage(long lLoginID, NET_IN_GET_NMPPORT_BY_PAGE pInParam, NET_OUT_GET_NMPPORT_BY_PAGE pOutParam, int nWaitTime);

	/**
	 * Attach NMP device port status
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pInParam input param
	 * @param nWaitTime wait time
	 * @return Attach handle
	 * \else
	 * 订阅NMP 设备端口状态
	 * @param lLoginID  登录句柄  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pInParam 入参
	 * @param nWaitTime 等待时间
	 * @return 订阅句柄
	 */
	public static native long AttachNMPPortStatus(long lLoginID, NET_IN_ATTACH_NMP_PORT_STATUS pInParam, int nWaitTime);

	/**
	 * Detach NMP device port status
	 * @param lAttachHandle,lAttachHandle is returned by AttachNMPPortStatus
	 * @return true:success, false:failed
	 * \else
	 * 取消订阅NMP 设备端口状态
	 * @param lAttachHandle  lAttachHandle 为 AttachNMPPortStatus 接口返回值
	 * @return true:成功, false:失败
	 */
	public static native boolean DetachNMPPortStatus(long lAttachHandle);

	/**
	 * \if ENGLISH_LANG
	 * transmit info for asyn pure transmit
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam  input parameters
	 * @param pstOutParam output parameters
	 * @param nWaitTime overtime of waiting
	 * @return Attach handle  0:failed
	 * \else
	 * 异步纯透传订阅接口
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 异步纯透传订阅接口入参
	 * @param pstOutParam 异步纯透传订阅接口出参
	 * @param nWaitTime 超时等待时间
	 * @return 订阅句柄，为0表示失败
	 * \endif
	 */
	public static native long    AttachTransmitInfo(long lLoginID, NET_IN_ATTACH_TRANSMIT_INFO pstInParam, NET_OUT_ATTACH_TRANSMIT_INFO pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Attach external tracks
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam  input parameters
	 * @param pstOutParam output parameters
	 * @param nWaitTime overtime of waiting
	 * @return Attach handle  0:failed
	 * \else
	 * 外部轨迹订阅接口
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 外部轨迹订阅接口入参
	 * @param pstOutParam 外部轨迹订阅接口出参
	 * @param nWaitTime 超时等待时间
	 * @return 订阅句柄，为0表示失败
	 * \endif
	 */
	public static native long    AttachVideoAnalyseTrackProc(long lLoginID, NET_IN_ATTACH_VIDEO_ANALYSE_TRACK_PROC pstInParam, NET_OUT_ATTACH_VIDEO_ANALYSE_TRACK_PROC pstOutParam, int nWaitTime);

	/**
	 * Detach external tracks
	 * @param lAttachHandle,lAttachHandle is returned by AttachVideoAnalyseTrackProc
	 * @return true:success, false:failed
	 * \else
	 * 取消订阅外部轨迹
	 * @param lAttachHandle  lAttachHandle 为 AttachVideoAnalyseTrackProc 接口返回值
	 * @return true:成功, false:失败
	 */
	public static native boolean DetachVideoAnalyseTrackProc(long lAttachHandle);

	/**
	 * \if ENGLISH_LANG
	 * Set country code and video system interface
	 * @param pInitAccountIn   init account by ip input parameters
	 * @param pInitAccountOut  init account  by ip output parameters
	 * @param nWaitTime overtime of waiting
	 * @param szLocalIp  local ip
	 * @return true:success, false:failed
	 * \else
	 * 设置国家码，视频制式接口
	 * @param pInitAccountIn 指定设备IP进行账号初始化入参
	 * @param pInitAccountOut 指定设备IP进行账号初始化出参
	 * @param nWaitTime 超时等待时间
	 * @param szLocalIp 本地IP
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean    InitDevSetLocalityConfig(NET_IN_INIT_DEVICE_SET_LOCALITY_CONFIG_INFO pInitAccountIn, NET_OUT_INIT_DEVICE_SET_LOCALITY_CONFIG_INFO pInitAccountOut, int nWaitTime, String szLocalIp);


	/**
	 * \if ENGLISH_LANG
	 * Asynchronous pure transparent transmission unsubscribe interface
	 * @param  lAttachHandle    Asynchronous pure transparent transmission handle, that is, the return value of the CLIENT_AttachTransmitInfo interface
	 * @param   pInParam       Asynchronous pure transparent transmission unsubscribe interface input parameters
	 * @param  pOutParam      Asynchronous pure transparent transmission unsubscribe interface output parameters
	 * @param   nWaitTime     interface timeout
	 * @return true:success, false:failed
	 * \else
	 * 异步纯透传取消订阅接口
	 *参数定义	:
	 * @param lAttachHandle:  异步纯透传句柄，即CLIENT_AttachTransmitInfo接口的返回值
	 * @param pInParam:       异步纯透传取消订阅接口输入参数
	 * @param pOutParam       异步纯透传取消订阅接口输出参数
	 * @param nWaitTime       接口超时时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean  DetachTransmitInfo(long lAttachHandle, NET_IN_DETACH_TRANSMIT_INFO pInParam, NET_OUT_DETACH_TRANSMIT_INFO pOutParam, int nWaitTime);
	//------------------------------------------------------------------------

    /**
     * \if ENGLISH_LANG
     * Get working mode capability of battery camera
     *
     * @param lLoginID     login handle
     * @param pstuInParam  Interface input parameters, memory resources are requested and released by the user
     * @param pstuOutParam Interface output parameters, memory resources are requested and released by the user
     * @param nWaitTime    interface timeout
     * @param lLoginID     登录句柄
     * @param pstuInParam  接口输入参数, 内存资源由用户申请和释放
     * @param pstuOutParam 接口输出参数, 内存资源由用户申请和释放
     * @param nWaitTime    接口超时时间, 单位毫秒
     * @return TRUE表示成功, FALSE表示失败
     * \endif
     */
    public static native boolean GetWorkModeCaps(long lLoginID, NET_IN_GET_WORK_MODE_CAPS pstuInParam, NET_OUT_GET_WORK_MODE_CAPS pstuOutParam, int nWaitTime);

    /**
     * \if ENGLISH_LANG
     * find record backup restore task infos by condition,user malloc memory of pInParam and pOutParam
     * @param  lLoginID login handle
     * @param  pstuInParam   Interface input parameters, memory resources are requested and released by the user
     * @param  pstuOutParam  Interface output parameters, memory resources are requested and released by the user
     * @param  nWaitTime  interface timeout
     * @return true:success, false:failed
     * \else
     * 根据查询条件返回录像备份任务的信息表,pInParam与pOutParam内存由用户申请释放
     * @param lLoginID 登录句柄
     * @param pstuInParam 接口输入参数, 内存资源由用户申请和释放
     * @param pstuOutParam 接口输出参数, 内存资源由用户申请和释放
     * @param nWaitTime 接口超时时间, 单位毫秒
     * @return TRUE表示成功, FALSE表示失败
     * \endif
     */
    public static native boolean FindRecordBackupRestoreTaskInfos(long lLoginID, NET_IN_FIND_REC_BAK_RST_TASK pstuInParam, NET_OUT_FIND_REC_BAK_RST_TASK pstuOutParam, int nWaitTime);

    /**
     * \if ENGLISH_LANG
     * Set Exam Recording Plans
     * @param  lLoginID login handle
     * @param  pstuInParam   Interface input parameters, memory resources are requested and released by the user
     * @param  pstuOutParam  Interface output parameters, memory resources are requested and released by the user
     * @param  nWaitTime  interface timeout
     * @return true:success, false:failed
     * \else
     * 添加考试录像计划
     * @param lLoginID 登录句柄
     * @param pstuInParam 接口输入参数, 内存资源由用户申请和释放
     * @param pstuOutParam 接口输出参数, 内存资源由用户申请和释放
     * @param nWaitTime 接口超时时间, 单位毫秒
     * @return TRUE表示成功, FALSE表示失败
     * \endif
     */
    public static native boolean SetExamRecordingPlans(long lLoginID, NET_IN_SET_EXAM_RECORDING_PLANS pstuInParam, NET_OUT_SET_EXAM_RECORDING_PLANS pstuOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get IPC storage info
	 * @param  lLoginID login handle
	 * @param  pstuInParam   Interface input parameters, memory resources are requested and released by the user
	 * @param  pstuOutParam  Interface output parameters, memory resources are requested and released by the user
	 * @param  nWaitTime  interface timeout
	 * @return true:success, false:failed
	 * \else
	 * 获取IPC设备的存储信息
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数, 内存资源由用户申请和释放
	 * @param pstuOutParam 接口输出参数, 内存资源由用户申请和释放
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功, FALSE表示失败
	 * \endif
	 */
	public static native boolean GetDeviceAllInfo(long lLoginID, NET_IN_GET_DEVICE_AII_INFO pstuInParam, NET_OUT_GET_DEVICE_AII_INFO pstuOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get the ink screen display mode supported by the device and the number of styles in each mode
	 * @param  lLoginID login handle
	 * @param  pstuInParam   Interface input parameters, memory resources are requested and released by the user
	 * @param  pstuOutParam  Interface output parameters, memory resources are requested and released by the user
	 * @param  nWaitTime  interface timeout
	 * @return true:success, false:failed
	 * \else
	 * 获取设备支持的墨水屏显示模式和每种模式下的样式数目
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数, 内存资源由用户申请和释放
	 * @param pstuOutParam 接口输出参数, 内存资源由用户申请和释放
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功, FALSE表示失败
	 * \endif
	 */
	public static native boolean GetFaceBoardInkScreenCaps(long lLoginID, NET_IN_GET_INKSCREEN_CAPS_INFO pstuInParam, NET_OUT_GET_INKSCREEN_CAPS_INFO pstuOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get the current ink screen display mode and style of the device
	 * @param  lLoginID login handle
	 * @param  pstuInParam   Interface input parameters, memory resources are requested and released by the user
	 * @param  pstuOutParam  Interface output parameters, memory resources are requested and released by the user
	 * @param  nWaitTime  interface timeout
	 * @return true:success, false:failed
	 * \else
	 * 获取设备当前墨水屏显示模式和样式
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数, 内存资源由用户申请和释放
	 * @param pstuOutParam 接口输出参数, 内存资源由用户申请和释放
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功, FALSE表示失败
	 * \endif
	 */
	public static native boolean GetFaceBoardInkScreenConfig(long lLoginID, NET_IN_GET_INKSCREEN_CONFIG_INFO pstuInParam, NET_OUT_GET_INKSCREEN_CONFIG_INFO pstuOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Set the current ink screen display mode and style of the device
	 * @param  lLoginID login handle
	 * @param  pstuInParam   Interface input parameters, memory resources are requested and released by the user
	 * @param  pstuOutParam  Interface output parameters, memory resources are requested and released by the user
	 * @param  nWaitTime  interface timeout
	 * @return true:success, false:failed
	 * \else
	 * 设置设备当前墨水屏显示模式和样式
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数, 内存资源由用户申请和释放
	 * @param pstuOutParam 接口输出参数, 内存资源由用户申请和释放
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功, FALSE表示失败
	 * \endif
	 */
	public static native boolean SetFaceBoardInkScreenConfig(long lLoginID, NET_IN_SET_INKSCREEN_CONFIG_INFO pstuInParam, NET_OUT_SET_INKSCREEN_CONFIG_INFO pstuOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Async search period all record files
	 * @param  lLoginID login handle
	 * @param  pstuInParam   Interface input parameters, memory resources are requested and released by the user
	 * @param  pstuOutParam  Interface output parameters, memory resources are requested and released by the user
	 * @return true:success, false:failed
	 * \else
	 * 异步查询时间段内的所有录像文件(pInParam, pOutParam内存由用户申请释放)
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数, 内存资源由用户申请和释放
	 * @param pstuOutParam 接口输出参数, 内存资源由用户申请和释放
	 * @return TRUE表示成功, FALSE表示失败
	 * \endif
	 */
	public static native boolean StartQueryRecordFile(long lLoginID, NET_IN_START_QUERY_RECORDFILE pstuInParam, NET_OUT_START_QUERY_RECORDFILE pstuOutParam);

	/**
	 * \if ENGLISH_LANG
	 * Start to query SMD data
	 * @param  lLoginID login handle
	 * @param  pstuInParam   Interface input parameters, memory resources are requested and released by the user
	 * @param  pstuOutParam  Interface output parameters, memory resources are requested and released by the user
	 * @param  nWaitTime  interface timeout
	 * @return true:success, false:failed
	 * \else
	 * 开始查询SMD数据
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数, 内存资源由用户申请和释放
	 * @param pstuOutParam 接口输出参数, 内存资源由用户申请和释放
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功, FALSE表示失败
	 * \endif
	 */
	public static native boolean StartFindSMDData(long lLoginID, NET_IN_START_FIND_SMD_DATA pstuInParam, NET_OUT_START_FIND_SMD_DATA pstuOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Query SMD data by group
	 * @param  lLoginID login handle
	 * @param  pstuInParam   Interface input parameters, memory resources are requested and released by the user
	 * @param  pstuOutParam  Interface output parameters, memory resources are requested and released by the user
	 * @param  nWaitTime  interface timeout
	 * @return true:success, false:failed
	 * \else
	 * 分批查询SMD数据
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数, 内存资源由用户申请和释放
	 * @param pstuOutParam 接口输出参数, 内存资源由用户申请和释放
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功, FALSE表示失败
	 * \endif
	 */
	public static native boolean DoFindSMDData(long lLoginID, NET_IN_DO_FIND_SMD_DATA pstuInParam, NET_OUT_DO_FIND_SMD_DATA pstuOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Stop querying SMD data
	 * @param  lLoginID login handle
	 * @param  pstuInParam   Interface input parameters, memory resources are requested and released by the user
	 * @param  pstuOutParam  Interface output parameters, memory resources are requested and released by the user
	 * @param  nWaitTime  interface timeout
	 * @return true:success, false:failed
	 * \else
	 * 停止查询SMD数据
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数, 内存资源由用户申请和释放
	 * @param pstuOutParam 接口输出参数, 内存资源由用户申请和释放
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功, FALSE表示失败
	 * \endif
	 */
	public static native boolean StopFindSMDData(long lLoginID, NET_IN_STOP_FIND_SMD_DATA pstuInParam, NET_OUT_STOP_FIND_SMD_DATA pstuOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get a list of valid channels for a certain type of event
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 得到某类事件的有效通道列表
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetEventChannels(long lLoginID, NET_IN_EVENT_CHANNELS pInParam, NET_OUT_EVENT_CHANNELS pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get vendor
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 获取厂商
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetVendor(long lLoginID, NET_IN_GET_VENDOR_INFO pInParam, NET_OUT_GET_VENDOR_INFO pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get boot parameter
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 获取系统参数
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetBootParameter(long lLoginID, NET_IN_GET_BOOT_PARAMETER pInParam, NET_OUT_GET_BOOT_PARAMETER pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get the parameter value of the Temperature Monitoring area, user malloc and free memory of pInParam and pOutParam
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 获取测温区域的参数值, pInParam与pOutParam内存由用户申请释放
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean RadiometryGetRandomRegionTemper(long lLoginID, NET_IN_RADIOMETRY_RANDOM_REGION_TEMPER pInParam, NET_OUT_RADIOMETRY_RANDOM_REGION_TEMPER pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * heatmap data
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 获取热图数据
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetHeatMapsDirectly(long lLoginID, NET_IN_GET_HEATMAPS_INFO pInParam, NET_OUT_GET_HEATMAPS_INFO pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * subscribe temperature distribution data (heat map), user malloc and free memory of pInParam and pOutParam
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 订阅温度分布数据（热图）,pInParam与pOutParam内存由用户申请释放
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native long RadiometryAttach(long lLoginID, NET_IN_RADIOMETRY_ATTACH pInParam, NET_OUT_RADIOMETRY_ATTACH pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * radiometry data unachieving and conversion
	 * @param pRadiometryData [IN] radiometry data, obtained from fRadiometryAttachCB
	 * @param pGrayImg [IN, OUT] unachieved data, which is a grayscale image
	 * 							 you can pass NULL if this is not needed
	 *          				 you must ensure that the buffer is enough (no less than 'pixel number'*sizeof(unsigned short))
	 *         					 for each pixel, there is an unsigned short value representing the grayscale value (range: 0 ~ 16383)
	 *         					 and the ordering is top-left pixels in low memory address and lower-right pixels in high memory address
	 * @param pTempForPixels [IN, OUT] The temperature buffer for each pixel can not be empty
	 * 								   otherwise,it will fail to return
	 * 							       you must ensure that the buffer is enough (no less than 'pixel number'*sizeof(float))
	 *   						       for each pixel, there is a float value representing temperature at pixel position, in centigrade
	 *  						       and the ordering is top-left pixels in low memory address and lower-right pixels in high memory address
	 * @return true:success, false:failed
	 * \else
	 * 热图数据解压与转换接口
	 * @param pRadiometryData [IN] 热图数据， 由 fRadiometryAttachCB 获得
	 * @param pGrayImg [IN, OUT] 解压后的数据，是一张灰度图，
	 * 							 传空指针表示不需要此数据
	 * 							 用户需保证传入的缓冲区足够大（不小于 图像像素数*sizeof(unsigned short)）
	 * 							 每个像素对应一个 unsigned short 型数据，表示图像某个像素的热成像灰度（范围 0 ~ 16383）
	 * @param pTempForPixels [IN, OUT] 每个像素的温度数据
	 * 								   不能传空指针,否则,返回失败
	 * 								   用户需保证传入的缓冲区足够大（不小于 图像像素数*sizeof(float)）
	 * 								   每个像素对应一个 float 型数据，表示该像素位置的摄氏温度
	 * 								   低地址对应画面左上角，高地址对应画面右下角
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean RadiometryDataParse(NET_RADIOMETRY_DATA pRadiometryData, short[] pGrayImg, float[] pTempForPixels);

	/**
	 * \if ENGLISH_LANG
	 * cancel subscribing temperature distribution data, lAttachHandle is the returned value of CLIENT_RadiometryAttach
	 * @return true:success, false:failed
	 * \else
	 * 取消订阅温度分布数据,lAttachHandle是 CLIENT_RadiometryAttach 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean RadiometryDetach(long lAttachHandle);

	/**
	 * \if ENGLISH_LANG
	 * inform to start acquiring heat map data,user malloc and free memory of pInParam and pOutParam
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 通知开始获取热图数据,pInParam与pOutParam内存由用户申请释放
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean RadiometryFetch(long lLoginID, NET_IN_RADIOMETRY_FETCH pInParam, NET_OUT_RADIOMETRY_FETCH pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Obtain JSON data for SDK distribution and device response
	 * @param pstuParam input param
	 * @return true:success, false:failed
	 * \else
	 * 获取SDK下发以及设备回复的json数据
	 * @param pstuParam  入参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetJsonData(NET_IN_GET_JSON_DATA pstuParam);

	/**
	 * \if ENGLISH_LANG
	 * obtains the binding mode,user malloc and free memory of pInParam and pOutParam
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 获取绑定模式,pInParam与pOutParam内存由用户申请释放
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetBindMode(long lLoginID, NET_IN_GET_BIND_MODE_INFO pInParam, NET_OUT_GET_BIND_MODE_INFO pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Set the binding mode,user malloc and free memory of pInParam and pOutParam
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 设置绑定模式,pInParam与pOutParam内存由用户申请释放
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean SetBindMode(long lLoginID, NET_IN_SET_BIND_MODE_INFO pInParam, NET_OUT_SET_BIND_MODE_INFO pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Modify the course video information,user malloc and free memory of pInParam and pOutParam
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 修改课程视频信息,pInParam与pOutParam内存由用户申请释放
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean ModifyCoureMediaFile(long lLoginID, NET_IN_MODIFY_COURSE_MEDIA_FILE_INFO pInParam, NET_OUT_MODIFY_COURSE_MEDIA_FILE_INFO pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * The common channel is bound to the combined channel,user malloc and free memory of pInParam and pOutParam
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 普通通道绑定到此组合通道上,pInParam与pOutParam内存由用户申请释放
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean BindCourseCompositeChannel(long lLoginID, NET_IN_BIND_COURSE_COMPOSITR_CHANNEL_INFO pInParam, NET_OUT_BIND_COURSE_COMPOSITR_CHANNEL_INFO pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * check security code
	 * @param pstIn input param
	 * @param pstOut output param
	 * @param dwWaitTime wait time
	 * @param szLocalIp local IP
	 * @return true:success, false:failed
	 * \else
	 * 检验安全码
	 * @param pstIn  接口输入参数, 内存资源由用户申请和释放
	 * @param pstOut 接口输出参数, 内存资源由用户申请和释放
	 * @param dwWaitTime  接口超时时间, 单位毫秒
	 * @param szLocalIp 本地ip
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean CheckAuthCode(NET_IN_CHECK_AUTHCODE pstIn, NET_OUT_CHECK_AUTHCODE pstOut, int dwWaitTime, byte[] szLocalIp);

	/**
	 * \if ENGLISH_LANG
	 * setting upgrade pakcages url, than download upgrade pakcages from the url,user malloc and free memory of pInParam and pOutParam
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 设置升级包的URL,并从此下载地址下载升级包,pInParam与pOutParam内存由用户申请释放
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean Upgrader_SetUrl(long lLoginID, NET_IN_UPGRADER_SETURL pInParam, NET_OUT_UPGRADER_SETURL pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get country code and video system interface
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @param dwWaitTime Interface timeout in milliseconds
	 * @param szLocalIp Localtion IP
	 * @return true:success, false:failed
	 * \else
	 * 获取国家码，视频制式接口
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @param dwWaitTime 接口超时时间, 单位毫秒
	 * @param szLocalIp 本地IP
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean InitDevGetLocalityConfig(NET_IN_INIT_DEVICE_GET_LOCALITY_CONFIG_INFO pInParam, NET_OUT_INIT_DEVICE_GET_LOCALITY_CONFIG_INFO pOutParam, int dwWaitTime,byte[] szLocalIp);

	/**
	 * \if ENGLISH_LANG
	 * subscribe radiometry temper data, user malloc and free memory of pInParam and pOutParam
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return lAttachTemperHandle attachHandle
	 * \else
	 * 订阅测温温度数据,pInParam与pOutParam内存由用户申请释放
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return lAttachTemperHandle 处理句柄
	 * \endif
	 */
	public static native long RadiometryAttachTemper(long lLoginID, NET_IN_RADIOMETRY_ATTACH_TEMPER pInParam, NET_OUT_RADIOMETRY_ATTACH_TEMPER pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * cancel subscribing radiometry temper data, lAttachTemperHandle is the returned value of CLIENT_RadiometryAttachTemper
	 * @param lAttachTemperHandle lAttachTemperHandle attachHandle
	 * @return true:success, false:failed
	 * \else
	 * @param lAttachTemperHandle lAttachTemperHandle 处理句柄
	 * 取消订阅测温温度数据,lAttachTemperHandle是 CLIENT_RadiometryAttachTemper 的返回值
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean RadiometryDetachTemper(long lAttachTemperHandle);

	/**
	 * \if ENGLISH_LANG
	 * Attach crowd distri map info, user malloc and free memory of pInParam and pOutParam
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return lAttachHandle attachHandle
	 * \else
	 * 订阅人群分布图实时统计信息,pInParam与pOutParam内存由用户申请释放
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return lAttachHandle 处理句柄
	 * \endif
	 */
	public static native long AttachCrowdDistriMap(long lLoginID, NET_IN_ATTACH_CROWDDISTRI_MAP_INFO pInParam, NET_OUT_ATTACH_CROWDDISTRI_MAP_INFO pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Detach crowd distri map info, lAttachHandle is the returned value of CLIENT_AttachCrowdDistriMap
	 * @param lAttachHandle  attachHandle
	 * @return true:success, false:failed
	 * \else
	 * 取消订阅人群分布图实时统计信息,lAttachHandle是 CLIENT_AttachCrowdDistriMap 的返回值
	 * @param lAttachHandle  处理句柄
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean DetachCrowdDistriMap(long lAttachHandle);

	/**
	 * \if ENGLISH_LANG
	 * Ability to obtain the audience distribution map of the video channel, user malloc and free memory of pInParam and pOutParam
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 获取该视频通道人群分布图能力,pInParam与pOutParam内存由用户申请释放
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetCrowdDistriMapCaps(long lLoginID, NET_IN_GET_CROWD_DISTRIMAP_CAPS_INFO pInParam, NET_OUT_GET_CROWD_DISTRIMAP_CAPS_INFO pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get global and regional real-time population statistics of population distribution map, user malloc and free memory of pInParam and pOutParam
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 获取人群分布图全局和区域实时人数统计值,pInParam与pOutParam内存由用户申请释放
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetSummaryCrowdDistriMap(long lLoginID, NET_IN_GETSUMMARY_CROWDDISTRI_MAP_INFO pInParam, NET_OUT_GETSUMMARY_CROWDDISTRI_MAP_INFO pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * open decoding component, user malloc and free memory of pInParam and pOutParam
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 开启解码组件,pInParam与pOutParam内存由用户申请释放
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean StartDevAudioDecode(long lLoginID, NET_IN_START_DEV_AUDIO_DECODE_INFO pInParam, NET_OUT_START_DEV_AUDIO_DECODE_INFO pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Stop decoding component, user malloc and free memory of pInParam and pOutParam
	 * @param pInParam input param
	 * @param pOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 停止解码组件,pInParam与pOutParam内存由用户申请释放
	 * @param pInParam  入参
	 * @param pOutParam 出参
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean StopDevAudioDecode(long lLoginID, NET_IN_STOP_DEV_AUDIO_DECODE_INFO pInParam, NET_OUT_STOP_DEV_AUDIO_DECODE_INFO pOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Set SDK local parameters,In client_Init before calling,szInBuffer memory is released by user request,It stores the set information,See NET_EM_SDK_LOCAL_CFG_TYPE Type corresponds to structure
	 * @param emtype config type, refer to {@link NET_EM_SDK_LOCAL_CFG_TYPE}
	 * @param pstInParam input param
	 * @return true:success, false:failed
	 * \else
	 * 设置SDK本地参数,在CLIENT_Init之前调用，szInBuffer内存由用户申请释放，里面存放被设置的信息，具体见NET_EM_SDK_LOCAL_CFG_TYPE类型对应结构体
	 * @param emtype 配置类型, 参考 {@link NET_EM_SDK_LOCAL_CFG_TYPE}
	 * @param pstInParam 输入参数
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean SetSDKLocalCfg(int emtype, Object pstInParam);

	/**
	 * \if ENGLISH_LANG
	 * PlayBack By stream Data Type
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @return playHandle
	 * \else
	 * 指定回调数据格式  开始回放,  数据回调函数 fDownLoadDataCallBack 中得到的码流类型为 emDataType 所指定的类型
	 * @param pstInParam 输入参数
	 * @param pstInParam 输出参数
	 * @return 播放句柄
	 * \endif
	 */
	public static native long PlayBackByDataType(long lLoginID,NET_IN_PLAYBACK_BY_DATA_TYPE pstInParam,NET_OUT_PLAYBACK_BY_DATA_TYPE pstOutParam,int dwWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Sessionless time calibration without authentication
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 会话外校时，不鉴权
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean SetCurrentUTC(NET_IN_SET_CURRENT_UTC pstuInParam,NET_OUT_SET_CURRENT_UTC pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Set playback speed
	 * @param lPlayHandle play handle
	 * @param emSpeed speed, refer to {@link EM_PLAY_BACK_SPEED}
	 * @return true:success, false:failed
	 * \else
	 * 设置录像回放速度
	 * @param lPlayHandle 播放句柄
	 * @param emSpeed 速度, 参考 {@link EM_PLAY_BACK_SPEED}
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean SetPlayBackSpeed( long lPlayHandle,int emSpeed);

	/**
	 * \if ENGLISH_LANG
	 * Get the local time of the device without authentication
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 会话外获取设备本地时间，不鉴权
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean QueryDeviceTimeNoLogin(NET_IN_QUERY_DEVICETIME_NO_LOGIN pstuInParam,NET_OUT_QUERY_DEVICETIME_NO_LOGIN pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Obtain the power consumption of each port in the PoE network card
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 获取PoE网卡中各端口功耗
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean GetSwitchPoEPortPower(long lLoginID,NET_IN_GET_SWITCH_POE_PORT_POWER pstuInParam,NET_OUT_GET_SWITCH_POE_PORT_POWER pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Wake-up Device
	 * @param lChannelHandle lChannelHandle The service SDK handle is handled by the CLIENT_CreateLowPowerChannel interface returns
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 唤醒设备
	 * @param lChannelHandle lChannelHandle 低功耗业务句柄，由CLIENT_CreateLowPowerChannel接口返回
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean DoWakeUpLowPowerDevcie(long lChannelHandle,NET_IN_WAKE_UP_INFO pstuInParam,NET_OUT_WAKE_UP_INFO pstuOutParam);

	/**
	 * \if ENGLISH_LANG
	 * Refuse sleep
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 拒绝休眠
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean RefuseLowPowerDevSleep(long lLoginID,NET_IN_REFUSE_SLEEP_INFO pstuInParam,NET_OUT_REFUSE_SLEEP_INFO pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Create low power channel
	 * @param lSubBizHandle lChannelHandle 低功耗业务句柄，由CLIENT_CreateLowPowerChannel接口返回
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @return true:success, false:failed
	 * \else
	 * 唤醒设备
	 * @param lSubBizHandle 业务sdk句柄，由CLIENT_CreateSubBusinessModule接口返回
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean CreateLowPowerChannel(long lSubBizHandle,NET_IN_CREATE_LOW_POWER_CHANNEL pstuInParam,NET_OUT_CREATE_LOW_POWER_CHANNEL pstuOutParam);

	/**
	 * \if ENGLISH_LANG
	 * Destroy low power channel
	 * @param lChannelHandle lChannelHandle The service SDK handle is handled by the client_ CLIENT_CreateLowPowerChannel interface returns
	 * @return true:success, false:failed
	 * \else
	 * 销毁低功耗通道
	 * @param lChannelHandle lChannelHandle 低功耗业务句柄，由CLIENT_CreateLowPowerChannel接口返回
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean DestoryLowPowerChannel(long lChannelHandle);

	/**
	 * \if ENGLISH_LANG
	 * Modify routing information
	 * @param lLoginID Login handle
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return true:success, false:failed
	 * \else
	 * 修改路由信息
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean ModRouteInfo(long lLoginID,NET_IN_MOD_ROUTE_INFO pstuInParam,NET_OUT_MOD_ROUTE_INFO pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Add routing information
	 * @param lLoginID Login handle
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return true:success, false:failed
	 * \else
	 * 向路由表中增加一条路由信息
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean AddRouteInfo(long lLoginID,NET_IN_ADD_ROUTE_INFO pstuInParam,NET_OUT_ADD_ROUTE_INFO pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Delete routing information
	 * @param lLoginID Login handle
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return true:success, false:failed
	 * \else
	 * 从路由表中删除路由
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean DelRouteInfo(long lLoginID,NET_IN_DEL_ROUTE_INFO pstuInParam,NET_OUT_DEL_ROUTE_INFO pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Query routing information, lFindID is the search ID returned by the CLIENT_StartFindRoute interface
	 * @param lFindID Query Handler
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return true:success, false:failed
	 * \else
	 * 查询路由信息, lFindID为CLIENT_StartFindRoute接口返回的查找ID
	 * @param lFindID 查询句柄
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean DoFindRoute(long lFindID,NET_IN_DO_FIND_ROUTE pstuInParam,NET_OUT_DO_FIND_ROUTE pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Start searching for routing information
	 * @param lLoginID Login handle
	 * @param pstuInParam input param
	 * @param pstuOutParam output param
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return the query handle
	 * \else
	 * 开始查找路由信息
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 输入参数
	 * @param pstuOutParam 输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return 查询句柄
	 * \endif
	 */
	public static native long StartFindRoute(long lLoginID,NET_IN_START_FIND_ROUTE pstuInParam,NET_OUT_START_FIND_ROUTE pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Stop find, lFindID is the lookup ID returned by the CLIENT_StartFindRoute HandPrint interface
	 * @param lFindID Query Handler
	 * @return true:success, false:failed
	 * \else
	 * 结束信息查询, lFindID为CLIENT_StartFindRoute接口返回的查找ID
	 * @param lFindID 查询句柄
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean StopFindRoute(long lFindID);

	/**
	 * \if ENGLISH_LANG
	 * Calibrate the current floor when the elevator stops
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 当电梯停止时，标定当前楼层
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean CalibratElevatorFloorCounter(long lLoginID,NET_IN_CALIBRAT_ELEVATOR_FLOOR_COUNTER_INFO pstuInParam,NET_OUT_CALIBRAT_ELEVATOR_FLOOR_COUNTER_INFO pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Obtain sub card information
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 获取子卡信息
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean GetMatrixCardsInfo(long lLoginID,NET_IN_GET_MATRIX_CARDS_INFO pstuInParam,NET_OUT_GET_MATRIX_CARDS_INFO pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Transmit and receive interface for data on the electronic signboard subscription platform
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 电子班牌订阅平台上下行透传接口透传的内容
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native long AttachClassBrand(long lLoginID,NET_IN_ATTACH_CLASS_BRAND pstuInParam,NET_OUT_ATTACH_CLASS_BRAND pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Unsubscribe to the transmitted and received data on the platform
	 * @param lAttachHandle Login handle
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 取消订阅平台上下行透传接口透传的内容
	 * @param lAttachHandle 登录句柄
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean DetachClassBrand(long lAttachHandle);

	/**
	 * \if ENGLISH_LANG
	 * get update serial
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 从设备获取信息，用于向私有云确认是否有升级包
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean GetUpdateSerial(long lLoginID,NET_IN_UPGRADER_GETSERIAL pstuInParam,NET_OUT_UPGRADER_GETSERIAL pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Downstream passthrough interface for electronic signboard PAAS
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 电子班牌的paas下行透传接口
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean PaasDownsidePassthrough(long lLoginID,NET_IN_PAAS_DOWNSIDE_PASSTHROUGH pstuInParam,NET_OUT_PAAS_DOWNSIDE_PASSTHROUGH pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Add cruise preset points
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 增加巡航预置点
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean AddTourPoint(long lLoginID,NET_IN_ADD_TOUR_POINT pstuInParam,NET_OUT_ADD_TOUR_POINT pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Start Tour
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 开始巡航
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean PTZStartTour(long lLoginID,NET_IN_PTZ_START_TOUR pstuInParam,NET_OUT_PTZ_START_TOUR pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Downstream passthrough interface for electronic signboard PAAS
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * Stop Tour
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean PTZStopTour(long lLoginID,NET_IN_PTZ_STOP_TOUR pstuInParam,NET_OUT_PTZ_STOP_TOUR pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Clears cruise preset points
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 清除巡航预置点
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean RemoveTourPoint(long lLoginID,NET_IN_REMOVE_TOUR_POINT_INFO pstuInParam,NET_OUT_REMOVE_TOUR_POINT_INFO pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get the list of grouped channels in the current query session
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 获取当前查询会话中的分组通道列表
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean GetObjectFavoritesLibraryChannelsByGroup(long lLoginID,NET_IN_GET_OBJECT_FAVORITES_LIBRARY_CHANNELS_BYGROUP pstuInParam,NET_OUT_GET_OBJECT_FAVORITES_LIBRARY_CHANNELS_BYGROUP pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Collect target event records
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 收藏目标事件记录
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean MarkObjectFavoritesLibraryObjectRecords(long lLoginID,NET_IN_MARK_OBJECT_FAVORITES_LIBRARY_OBJECT_RECORDS pstuInParam,NET_OUT_MARK_OBJECT_FAVORITES_LIBRARY_OBJECT_RECORDS pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Cancel Favorite Target Event Record
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 取消收藏目标事件记录
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean UnmarkObjectFavoritesLibraryObjectRecords(long lLoginID,NET_IN_UNMARK_OBJECT_FAVORITES_LIBRARY_OBJECT_RECORDS pstuInParam,NET_OUT_UNMARK_OBJECT_FAVORITES_LIBRARY_OBJECT_RECORDS pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Check the bookmarking status of the target event record
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 检查目标事件记录的收藏状态
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean CheckObjectFavoritesLibraryMarkStatus(long lLoginID,NET_IN_CHECK_OBJECT_FAVORITES_LIBRARY_MARK_STATUS pstuInParam,NET_OUT_CHECK_OBJECT_FAVORITES_LIBRARY_MARK_STATUS pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Start searching for favorite content data by criteria
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 开始按条件，查找收藏夹内容数据
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native long StartFindObjectFavoritesLibrary(long lLoginID,NET_IN_START_FIND_OBJECT_FAVORITES_LIBRARY pstuInParam,NET_OUT_START_FIND_OBJECT_FAVORITES_LIBRARY pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Favorite Content Data, lFindID is the lookup ID returned by the CLIENT_StartFindObject FavoritesLibrary interface
	 * @param lFindID Find handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return returns the query handle
	 * \else
	 * 获取收藏夹内容数据, lFindID为CLIENT_StartFindObjectFavoritesLibrary接口返回的查找ID
	 * @param lFindID 查询句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return 返回查询句柄
	 * \endif
	 */
	public static native boolean DoFindObjectFavoritesLibrary(long lFindID,NET_IN_DO_FIND_OBJECT_FAVORITES_LIBRARY pstuInParam,NET_OUT_DO_FIND_OBJECT_FAVORITES_LIBRARY pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Stop find, LFindID is the lookup ID returned by the CLIENT_StartFindObjectFavoritesLibrary  interface
	 * @param lFindID find handle
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 停止查找收藏夹内容数据，清空查询会话, lFindID为CLIENT_StartFindObjectFavoritesLibrary接口返回的查找ID
	 * @param lFindID 查询句柄
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean StopFindObjectFavoritesLibrary(long lFindID);

	/**
	 * \if ENGLISH_LANG
	 * Begin querying network offline statistics data
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return Returns the control handle
	 * \else
	 * 开始查询断网统计数据
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return 返回控制句柄
	 * \endif
	 */
	public static native long StartFindOfflineStatistic(long lLoginID,NET_IN_START_FIND_OFFLINE_STATISTIC pstuInParam,NET_OUT_START_FIND_OFFLINE_STATISTIC pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get network offline statistics data
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 获取断网统计数据
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean DoFindOfflineStatistic(long lLoginID,NET_IN_DO_FIND_OFFLINE_STATISTIC pstuInParam,NET_OUT_DO_FIND_OFFLINE_STATISTIC pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Stop querying network offline statistics data
	 * @param lFindHandle Login handle
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 停止查询断网统计数据
	 * @param lFindHandle 查询句柄
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean StopFindOfflineStatistic(long lFindHandle);

	/**
	 * \if ENGLISH_LANG
	 * Start querying based on target trajectory filtering rules
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return 0 indicates failure, others indicates success
	 * \else
	 * 根据目标轨迹过滤规则，开始查询
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return 0表示失败 其他表示成功
	 * \endif
	 */
	public static native long StartFindObjectMediaFind(long lLoginID,NET_IN_START_FIND_OBJECT_MEDIA_FIND pstuInParam,NET_OUT_START_FIND_OBJECT_MEDIA_FIND pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Obtain video recording query results
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return TRUE indicates success, FALSE indicates failure
	 * \else
	 * 获取录像查询结果
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean FindObjectMediaFindFile(long lLoginID,NET_IN_FIND_OBJECT_MEDIA_FIND_FILE pstuInParam,NET_OUT_FIND_OBJECT_MEDIA_FIND_FILE pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get target event query results
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 获取目标事件查询结果
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean FindObjectMediaFindEvent(long lLoginID,NET_IN_FIND_OBJECT_MEDIA_FIND_EVENT pstuInParam,NET_OUT_FIND_OBJECT_MEDIA_FIND_EVENT pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Stop querying
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 停止查询
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean StopFindObjectMediaFind(long lLoginID,NET_IN_STOP_FIND_OBJECT_MEDIA_FIND pstuInParam,NET_OUT_STOP_FIND_OBJECT_MEDIA_FIND pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Stop querying
	 * @param lFindHandle Login handle
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 停止查询
	 * @param lFindHandle 查询句柄
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean StopFindAccessTimeSchedule(long lFindHandle);

	/**
	 * \if ENGLISH_LANG
	 * Obtain network application capability set
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 获取网络应用能力集
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean GetRemoteNetAppCaps(long lLoginID,NET_IN_GET_REMOTE_NETAPP_CAPS pstuInParam,NET_OUT_GET_REMOTE_NETAPP_CAPS pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Change user password
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 修改用户密码
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean ModifySecurityPasswordPlain(long lLoginID,NET_IN_MODIFY_SECURITY_PASSWORD_PLAIN_INFO pstuInParam,NET_OUT_MODIFY_SECURITY_PASSWORD_PLAIN_INFO pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * network application interface
	 * @param lLoginID login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param emtype operate type of faceinfo, refer to {@link EM_RPC_NETAPP_TYPE}
	 * @param pstInParam input param
	 * @param pstOutParam output param
	 * @param nWaitTime overtime of waiting device back
	 * @return true:success, false:failed
	 * \else
	 * 网络应用组件,公司内部定制接口
	 * @param lLoginID {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param emtype 人脸信息操作类型, 参考 {@link EM_RPC_NETAPP_TYPE}
	 * @param pstInParam 输入参数
	 * @param pstOutParam 输出参数
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 * \endif
	 */
	public static native boolean RPC_NetApp(long lLoginID, int emtype, Object pstInParam, Object pstOutParam, int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Set current elevator work information
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 设置当前电梯运行信息
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean SetElevatorWorkInfo(long lLoginID,NET_IN_SET_ELEVATOR_WORK_INFO pstuInParam,NET_OUT_SET_ELEVATOR_WORK_INFO pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Get all onvif user information
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 获取所有 Onvif 用户信息
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean GetOnvifUserInfoAll(long lLoginID,NET_IN_GETONVIF_USERINFO_ALL_INFO pstuInParam,NET_OUT_GETONVIF_USERINFO_ALL_INFO pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * One-key calibration for floors.
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 楼层一键标定
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean AutoCalibrate(long lLoginID,NET_IN_AUTO_CALIBRATE pstuInParam,NET_OUT_AUTO_CALIBRATE pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Retrieve the calibration status after sending the command for ElevatorFloorCounter.autoCalibrate.
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 获取ElevatorFloorCounter.autoCalibrate下发后的标定状态
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean GetCalibrateStatus(long lLoginID,NET_IN_GET_CALIBRATE_STATUS pstuInParam,NET_OUT_GET_CALIBRATE_STATUS pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Manually modify floor height and generate pressure differential information.
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 手动修改楼层高度并生成气压差信息
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean ModifyFloorHeight(long lLoginID,NET_IN_MODIFY_FLOOR_HEIGHT pstuInParam,NET_OUT_MODIFY_FLOOR_HEIGHT pstuOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Adds superposition text information
	 * @param lLoginID Login handle
	 * @param pstuInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pstuOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 添加叠加文本信息
	 * @param lLoginID 登录句柄
	 * @param pstuInParam 接口输入参数
	 * @param pstuOutParam 接口输出参数
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean AddOSDText(long lLoginID,NET_IN_ADD_OSD_TEXT_INFO pstuInParam,NET_OUT_ADD_OSD_TEXT_INFO pstuOutParam,int nWaitTime);

	/**
	 * Ability to obtain device web services
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam  input param
	 * @param pstOutParam output param
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * 获取设备web服务的能力
	 * @param lLoginID  登录句柄  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 入参
	 * @param pstOutParam  出参
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 */
	public static native boolean GetWebServiceCaps(long lLoginID, NET_IN_GET_WEB_SERVICE_CAPS pstInParam, NET_OUT_GET_WEB_SERVICE_CAPS pstOutParam, int nWaitTime);


	/**
	 * Upstream passthrough interface for electronic signboard PAAS
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam  input param
	 * @param pstOutParam output param
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * 电子班牌的paas上行透传接口
	 * @param lLoginID  登录句柄  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 入参
	 * @param pstOutParam  出参
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 */
	public static native boolean PaasUpsidePassthrough(long lLoginID, NET_IN_PAAS_UPSIDE_PASSTHROUGH pstInParam, NET_OUT_PAAS_UPSIDE_PASSTHROUGH pstOutParam, int nWaitTime);

	/**
	 * Get the online status of the private protocol active registration server
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam  input param
	 * @param pstOutParam output param
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * 获取私有协议主动注册服务器在线状态
	 * @param lLoginID  登录句柄  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 入参
	 * @param pstOutParam  出参
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 */
	public static native boolean GetAutoRegisterState(long lLoginID, NET_IN_GET_AUTO_REGISTER_STATE pstInParam, NET_OUT_GET_AUTO_REGISTER_STATE pstOutParam, int nWaitTime);

	/**
	 * The cloud platform sends back a ringtone through downlink transmission
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam  input param
	 * @param pstOutParam output param
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * 云平台下行透传回铃
	 * @param lLoginID  登录句柄  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 入参
	 * @param pstOutParam  出参
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 */
	public static native boolean OnRingVideoTalk2Cloud(long lLoginID, NET_IN_ONRING_VIDEO_TALK_2_CLOUD pstInParam, NET_OUT_ONRING_VIDEO_TALK_2_CLOUD pstOutParam, int nWaitTime);

	/**
	 * Downward suspension of cloud platform
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam  input param
	 * @param pstOutParam output param
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * 云平台下行挂断
	 * @param lLoginID  登录句柄  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 入参
	 * @param pstOutParam  出参
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 */
	public static native boolean HangupVideoTalk2Cloud(long lLoginID, NET_IN_HANGUP_VIDEO_TALK_2_CLOUD pstInParam, NET_OUT_HANGUP_VIDEO_TALK_2_CLOUD pstOutParam, int nWaitTime);

	/**
	 * Downward subscription
	 * @param lLoginID  login handle, return from {@link INetSDK#LoginWithHighLevelSecurity} or {@link INetSDK#LoginEx2}
	 * @param pstInParam  input param
	 * @param pstOutParam output param
	 * @param nWaitTime wait time
	 * @return true:success, false:failed
	 * \else
	 * 下行订阅
	 * @param lLoginID  登录句柄  {@link INetSDK#LoginWithHighLevelSecurity} 或者 {@link INetSDK#LoginEx2}的返回值
	 * @param pstInParam 入参
	 * @param pstOutParam  出参
	 * @param nWaitTime 等待时间
	 * @return true:成功, false:失败
	 */
	public static native long AttachVideoTalk2Cloud(long lLoginID, NET_IN_ATTACH_VIDEO_TALK_2_CLOUD pstInParam, NET_OUT_ATTACH_VIDEO_TALK_2_CLOUD pstOutParam, int nWaitTime);

	/**
	 * Cancel downlink subscription
	 * @param   lAttachHandle Subscription handle, return from {@link INetSDK#AttachVideoTalk2Cloud}
	 * @return true:success, false:failed
	 * \else
	 * 取消下行订阅
	 * @param   lAttachHandle 订阅句柄  {@link INetSDK#AttachVideoTalk2Cloud}的返回值
	 * @return true:成功, false:失败
	 */
	public static native boolean DetachVideoTalk2Cloud(long lAttachHandle);



	/**
	 * \if ENGLISH_LANG
	 * Get target database version
	 * @param lLoginID Login handle
	 * @param pInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 主动查询设备端目标库版本信息
	 * @param lLoginID 登录句柄
	 * @param pInParam 接口输入参数, 内存资源由用户申请和释放
	 * @param pOutParam 接口输出参数, 内存资源由用户申请和释放
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean GetFaceDbVersion(long lLoginID,NET_IN_GET_FACE_DB_VERSION pInParam,NET_OUT_GET_FACE_DB_VERSION pOutParam,int nWaitTime);

    /**
     * \if ENGLISH_LANG
     * Send the retransmit FTP server info
     * @param lLoginID Login handle
     * @param pInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
     * @param pOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
     * @param nWaitTime Timeout for the interface, in milliseconds
     * @return indicates success, FALSE indicates failure
     * \else
     * 下发补传视频ftp服务器信息
     * @param lLoginID 登录句柄
     * @param pInParam 接口输入参数, 内存资源由用户申请和释放
     * @param pOutParam 接口输出参数, 内存资源由用户申请和释放
     * @param nWaitTime 接口超时时间, 单位毫秒
     * @return TRUE表示成功 FALSE表示失败
     * \endif
     */
    public static native boolean SendFtpUploadServerInfo(long lLoginID,NET_IN_SEND_FTP_UPLOAD_SERVER_INFO pInParam,NET_OUT_SEND_FTP_UPLOAD_SERVER_INFO pOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Add task of download target data base
	 * @param lLoginID Login handle
	 * @param pInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return indicates success, FALSE indicates failure
	 * \else
	 * 添加目标库下载任务
	 * @param lLoginID 登录句柄
	 * @param pInParam 接口输入参数, 内存资源由用户申请和释放
	 * @param pOutParam 接口输出参数, 内存资源由用户申请和释放
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return TRUE表示成功 FALSE表示失败
	 * \endif
	 */
	public static native boolean AddFaceDbDownLoadTask(long lLoginID,NET_IN_ADD_FACEDB_DOWNLOAD_TASK pInParam,NET_OUT_ADD_FACEDB_DOWNLOAD_TASK pOutParam,int nWaitTime);

	/**
	 * \if ENGLISH_LANG
	 * Attach the result of downloading target data base
	 * @param lLoginID Login handle
	 * @param pInParam pstuInParam The input parameters for the interface, memory resources are allocated and released by the user
	 * @param pOutParam pstuOutParam The output parameters for the interface, memory resources are allocated and released by the user
	 * @param nWaitTime Timeout for the interface, in milliseconds
	 * @return handle
	 * \else
	 * 订阅目标库下载结果
	 * @param lLoginID 登录句柄
	 * @param pInParam 接口输入参数, 内存资源由用户申请和释放
	 * @param pOutParam 接口输出参数, 内存资源由用户申请和释放
	 * @param nWaitTime 接口超时时间, 单位毫秒
	 * @return 句柄
	 * \endif
	 */
	public static native long AttachFaceDbDownLoadResult(long lLoginID,NET_IN_ATTACH_FACEDB_DOWNLOAD_RESULT pInParam,NET_OUT_ATTACH_FACEDB_DOWNLOAD_RESULT pOutParam,int nWaitTime);

	/**
	 * Detach the result of downloading target data base
	 * @param   lAttachHandle Subscription handle, return from {@link INetSDK#AttachFaceDbDownLoadResult}
	 * @return true:success, false:failed
	 * \else
	 * 取消订阅目标库下载结果
	 * @param   lAttachHandle 订阅句柄  {@link INetSDK#AttachFaceDbDownLoadResult}的返回值
	 * @return true:成功, false:失败
	 */
	public static native boolean DetachFaceDbDownLoadResult(long lAttachHandle);
}

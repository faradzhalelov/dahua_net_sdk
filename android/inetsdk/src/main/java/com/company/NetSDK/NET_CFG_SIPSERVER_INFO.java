package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * sip configuration, the corresponding interface {@link INetSDK#GetConfig}/{@link INetSDK#SetConfig},the corresponding command {@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_SIP}
 * \else
 * sip配置,对应接口{@link INetSDK#GetConfig}/{@link INetSDK#SetConfig} 对应命令 {@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_SIP}
 * \endif
 */
public class NET_CFG_SIPSERVER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * accout name
     * \else
     * 账户名称
     * \endif
     */
    public byte                    szAccoutName[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * address of sip server
     * \else
     * sip服务器地址
     * \endif
     */
    public byte                    szAddres[] = new byte[FinalVar.SDK_MAX_IPADDR_EX_LEN];

    /**
     * \if ENGLISH_LANG
     * port of sip server
     * \else
     * sip服务器端口号
     * \endif
     */
    public int                     nPort;

    /**
     * \if ENGLISH_LANG
     * address of proxy server
     * \else
     * 代理服务器地址
     * \endif
     */
    public byte                    szProxyAdress[] = new byte[FinalVar.SDK_MAX_IPADDR_EX_LEN];

    /**
     * \if ENGLISH_LANG
     * id of proxy server
     * \else
     * 代理服务器ID
     * \endif
     */
    public byte                    szProxyID[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * port of proxy server
     * \else
     * 代理服务器端口号
     * \endif
     */
    public int                     nProxyPort;

    /**
     * \if ENGLISH_LANG
     * user id,it's usually cellphone number
     * \else
     * 用户ID，一般是电话号码
     * \endif
     */
    public byte                    szUserID[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * user type,0:SIP client,2:vto is the server,3:VTNC is the server
     * \else
     * 用户类型。0:SIP客户端,2:门口机做服务器,3:VTNC做服务器
     * \endif
     */
    public int                     nUserType;

    /**
     * \if ENGLISH_LANG
     * user authentication id
     * \else
     * 身份鉴别ID
     * \endif
     */
    public byte                    szAuthID[] = new byte[FinalVar.MAX_USER_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * user authentication password
     * \else
     * 身份鉴别密码
     * \endif
     */
    public byte                    szAuthPassword[] = new byte[FinalVar.MAX_PWD_LEN];

    /**
     * \if ENGLISH_LANG
     * address of STUN server
     * \else
     * UDP数据报简单穿越网络地址转换器服务器
     * \endif
     */
    public byte                    szSTUNServer[] = new byte[FinalVar.SDK_MAX_IPADDR_EX_LEN];

    /**
     * \if ENGLISH_LANG
     * register realm
     * \else
     * 注册域
     * \endif
     */
    public byte                    szRegisterRealm[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * expireation of register,unit:S
     * \else
     * 注册间隔时间，单位：秒
     * \endif
     */
    public int                     nRegExpiration;

    /**
     * \if ENGLISH_LANG
     * sip port of local
     * \else
     * 本地Sip端口
     * \endif
     */
    public int                     nSipPort;

    /**
     * \if ENGLISH_LANG
     * RTP port of local
     * \else
     * 本地RTP端口
     * \endif
     */
    public int                     nRTPPort;

    /**
     * \if ENGLISH_LANG
     * enable of unregister onreboot
     * \else
     * 重启删除注册信息使能
     * \endif
     */
    public boolean                    bUnregisterOnReboot;

    /**
     * \if ENGLISH_LANG
     * call number of default
     * \else
     * 默认呼叫号码
     * \endif
     */
    public byte                    szDefaultCallNumber[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * video stream type,0：main；1：extra1；2：extra2；3：extra3；
     * \else
     * 视频码流，码流类型,0：主码流；1：辅码流1；2：辅码流2；3：辅码流3；
     * \endif
     */
    public int                    nVideoStreamType;

    /**
     * \if ENGLISH_LANG
     * audio stream type,0：main；1：extra1；2：extra2；3：extra3；
     * \else
     * 音频码流，码流类型,0：主码流；1：辅码流1；2：辅码流2；3：辅码流3；
     * \endif
     */
    public int                    nAudioStreamType;

    /**
     * \if ENGLISH_LANG
     * sip enable of cross route
     * \else
     * 是否开启Sip跨路由功能
     * \endif
     */
    public boolean                    bRouteEnable;

    /**
     * \if ENGLISH_LANG
     * route number
     * \else
     * 路由器数量
     * \endif
     */
    public int                     nRouteCount;

    /**
     * \if ENGLISH_LANG
     * route address
     * \else
     * 路由地址
     * \endif
     */
    public byte                    szRouteAddress[][] = new byte[FinalVar.MAX_ROUTE_NUM][FinalVar.SDK_MAX_IPADDR_EX_LEN];

    /**
     * \if ENGLISH_LANG
     * username of login VTNC
     * \else
     * 登陆VTNC的用户名
     * \endif
     */
    public byte                    szSIPServerLoginUserName[] = new byte[FinalVar.MAX_USER_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * password of login VTNC
     * \else
     * 登录VTNC的密码
     * \endif
     */
    public byte                    szSIPServerLoginPWD[] = new byte[FinalVar.MAX_PWD_LEN];

    /**
     * \if ENGLISH_LANG
     * Enable of be Main VTO
     * \else
     * 是否是备用服务器使能
     * \endif
     */
    public boolean                    bMainVTO;

    /**
     * \if ENGLISH_LANG
     * address of redundancy sip server
     * \else
     * 备用sip服务器地址
     * \endif
     */
    public byte                    szRedundancyServer[] = new byte[FinalVar.SDK_MAX_IPADDR_EX_LEN];

    /**
     * \if ENGLISH_LANG
     * username of redundancy sip server
     * \else
     * 备用服务器登陆用户名
     * \endif
     */
    public byte                    szRedundancyUserName[] = new byte[FinalVar.MAX_USER_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * password of redundancy sip server
     * \else
     * 备用服务器登陆密码
     * \endif
     */
    public byte                    szRedundancyPassword[] = new byte[FinalVar.MAX_PWD_LEN];

    /**
     * \if ENGLISH_LANG
     * analog start number
     * \else
     * 模拟系统中支持的模拟室内机起始号码
     * \endif
     */
    public byte                    szAnalogNumberStart[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * analog end number
     * \else
     * 模拟系统中支持的模拟室内机结束号码
     * \endif
     */
    public byte                    szAnalogNumberEnd[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * User Enable
     * \else
     * 注册使能
     * \endif
     */
    public boolean					bUserEnable;

    @Override
    public String toString() {
        return "szAccoutName=" + new String(szAccoutName).trim() +
                ", szAddres=" + new String(szAddres).trim() +
                ", nPort=" + nPort +
                ", szProxyAdress=" + new String(szProxyAdress).trim() +
                ", szProxyID=" + new String(szProxyID).trim() +
                ", nProxyPort=" + nProxyPort +
                ", szUserID=" + new String(szUserID).trim() +
                ", nUserType=" + nUserType +
                ", szAuthID=" + new String(szAuthID).trim() +
                ", szAuthPassword=" + new String(szAuthPassword).trim() +
                ", szSTUNServer=" + new String(szSTUNServer).trim() +
                ", szRegisterRealm=" + new String(szRegisterRealm).trim() +
                ", nRegExpiration=" + nRegExpiration +
                ", nSipPort=" + nSipPort +
                ", nRTPPort=" + nRTPPort +
                ", bUnregisterOnReboot=" + bUnregisterOnReboot +
                ", szDefaultCallNumber=" + new String(szDefaultCallNumber).trim() +
                ", nVideoStreamType=" + nVideoStreamType +
                ", nAudioStreamType=" + nAudioStreamType +
                ", bRouteEnable=" + bRouteEnable +
                ", nRouteCount=" + nRouteCount +
                ", szSIPServerLoginUserName=" + new String(szSIPServerLoginUserName).trim() +
                ", szSIPServerLoginPWD=" + new String(szSIPServerLoginPWD).trim() +
                ", bMainVTO=" + bMainVTO +
                ", szRedundancyServer=" + new String(szRedundancyServer).trim() +
                ", szRedundancyUserName=" + new String(szRedundancyUserName).trim() +
                ", szRedundancyPassword=" + new String(szRedundancyPassword).trim() +
                ", szAnalogNumberStart=" + new String(szAnalogNumberStart).trim() +
                ", szAnalogNumberEnd=" + new String(szAnalogNumberEnd).trim() +
                ", bUserEnable=" + bUserEnable +
                ", szRouteAddress=" + Arrays.toString(szRouteAddress);
    }
}

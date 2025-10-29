/*************************************************************************
 ** 版权保留(C), 2001-2013, 浙江大华技术股份有限公司.
 ** 版权所有.
 **
 ** $Id$
 **
 ** 功能描述   : Proxy Client C适配层
 **
 ** 修改历史     : 2013年12月23日 zhu_long Modification
*************************************************************************/

#ifndef _DAHUA_P2P_PROXY_CLIENT_CWRAP_H_
#define _DAHUA_P2P_PROXY_CLIENT_CWRAP_H_

#include "Defs.h"

#ifdef WIN32
    typedef unsigned __int64 UINT64;
#else
    typedef unsigned long long UINT64;
#endif

#ifdef  __cplusplus
extern "C" {
#endif

///\brief 代理状态
typedef enum
{
    DHProxyStateUnauthorized,           ///< 服务认证失败（序列号非法、密钥错误）
    DHProxyStateForbidden,              ///< 服务禁止登陆（设备ID重复、服务器拒绝）
    DHProxyStateOffline,                ///< 服务离线
    DHProxyStateOnline,                 ///< 服务在线
    DHProxyStateRequestFail,            ///< 客户端请求失败
} DHProxyClientProxyState;

///\brief P2P通道状态
typedef enum
{
    DHP2PChannelStateInit,              ///< P2P通道初始化中
    DHP2PChannelStateActive,            ///< P2P通道已连通
    DHP2PChannelStateNonExist,          ///< P2P通道不存在
    DHP2PChannelStateUnauthorized,      ///< P2P通道鉴权失败
    DHP2PChannelDevPwdAuthFail,         ///< 设备登录密码校验失败
    DHP2PChannelDevSaltInvalid,         ///< 设备随机盐值不正确
    DHP2PChannelLimitedDevice,          ///< 受限设备
} DHProxyClientP2PChannelState;

///\brief 映射端口速率统计
typedef struct
{
    UINT64               recvBytes;     ///< 总接收字节KB
    UINT64               sendBytes;     ///< 总发送字节KB

    double               curRecvRate;   ///< 当前接收速率Kb/s
    double               curSendRate;   ///< 当前发送速率Kb/s

    double               lostRate;      ///< 丢包率
    double               liveTime;      ///< 通道活动时间(秒S)
} DHProxyClientMapPortRate;

///\brief 远程代理信息
typedef struct
{
    char                remoteId[64];      ///< 服务器ID
    char                remoteIp[64];      ///< 远程代理IP
    int                 remotePort;        ///< 远程代理端口
} DHProxyClientRemotePortInfo;

typedef enum
{
    DHP2POptionPortGuess,                 ///< 端口猜测选项 参数值: 0 关闭 1 开启
    DHP2POptionSetMTU,                    ///< MTU选项      参数值: 整数值
    DHP2POptionUPNP,                      ///< UPNP选项     参数值: 0 关闭 1 开启
    DHP2POptionRelay,                     ///< Relay选项  参数值: 0 不支持中转 1 支持中转
    DHP2POptionPTCPThreadNum,             ///< PTCP线程数目选项  参数值: 整数值    
    DHP2POptionRecvBufSize,               ///< P2P接收缓冲区大小，单位:字节
    DHP2POptionPTCPSendBuffer,            ///< PTCP发送缓冲区大小，单位:字节
    DHP2POptionPTCPRecvBuffer,            ///< PTCP接收缓冲区大小，单位:字节
    DHP2POptionSendBufSize,               ///< TCP发送缓冲区大小，单位:字节
    DHP2POptionLocal,                     ///< Local选项     参数值：0 不支持局域网连接 1 支持局域网连接
    DHP2POptionLinkSwitch,                ///< 链路切换选项  参数值: 0 关闭链路切换  1 支持链路切换,本选项只对代理客户端有效
    DHP2POptionRemoteCommand,             ///< 远程命令选项  参数值：0 关闭 1 开启
    DHP2POptionMultiHolePunch,            ///< 多重打洞选项  参数值: 0 关闭 1 开启, 默认开启
    DHP2POptionIceDefaultRange,           ///< ICE默认场景下的猜测范围
    DHP2POptionIceConeVsSymmRange,        ///< ICE圆锥型与对称型场景下的猜测范围
    DHP2POptionIceSymmVsSymmRange,        ///< ICE对称型与对称型场景下的猜测范围
    DHP2POptionLinkSwitchSpace,           ///< 链路切换间隔
    DHP2POptionP2P,                       ///< P2P打洞        参数值: 0 关闭 1 开启
    DHP2POptionTcpRelay,                  ///< Tcp转发选项    参数值: 0 关闭 1 开启
}DHProxyOption;


///\brief 日志级别
typedef enum
{
    DHProxyLogLevelSilent,                /// < 该级别不打印信息
    DHProxyLogLevelErr,                   /// < 致命错误
    DHProxyLogLevelWarning,               /// < 可能导致出错
    DHProxyLogLevelInfo,                  /// < 告知用户，当前运行状态
    DHProxyLogLevelTrace,                 /// < 调试信息
    DHProxyLogLevelDebug                  /// < 详细调试信息
}DHProxyLogLevel;

///\brief P2P监听的Socket Domain
enum DHP2PSockFamilyType
{
    DHP2PSockIPv4,                        ///< IPv4协议
    DHP2PSockIPv6,                        ///< IPv6协议
    DHP2PSockUnknown,                     ///< 未知协议
};

///\brief 句柄
typedef void*   ProxyClientHandler;

///\bried 客户端上报穿透信息回调
///\param deviceId    设备序列号
///\param deviceIp    设备端NAT后的IP
///\param devicePort  设备端NAT后的端口
///\param clientIp    客户端NAT后的IP
///\param clientPort  客户端NAT后的端口
///\param linkType    连接类型(0:局域网; 1:P2P; 2:udp转发; 3:tcp转发)
typedef void (* DHP2PTraversalInfoHandler)(const char *deviceId, const char *deviceIp, const int devicePort, const char *clientIp, const int clientPort, const int linkType);

///\brief 初始化
///\param[in]       svraddr  服务器IP(暂不支持域名)
///\param[in]       svrport  服务器端口
///\param[in]       passwd   密钥
///\return 0失败/其他，client句柄
///\note 如果使用UDP环回，必须设置包的最大长度，设置选项为DHP2POptionSetMTU，
///\     建议最大值不超过1400字节
TOU_API ProxyClientHandler DHProxyClientInit(const char* svrip, int svrport, const char* passwd);

///\brief 释放资源
///\param[in]       handler  实际client句柄
TOU_API void DHProxyClientRelease(ProxyClientHandler handler);

///\brief 通过远程代理打开映射(异步模式)
///\param[in]       handler  实际client句柄
///\param[in]       deviceId    远程代理ID
///\param[in]       targetPort  目标端口
///\param[in,out]   localPort   本地映射端口,为0由内部随机分配一个端口
///\return 0添加端口映射成功/-1添加端口映射失败
///\note 通道建立是否成功需调用DHProxyClientChannelstate接口查询
TOU_API int DHProxyClientAddPort(ProxyClientHandler handler,
                                 const char* deviceId, int targetPort, int *localPort);

///\brief 通过远程代理打开映射(异步模式)，带设备用户名、密码、随机盐值、设备P2P版本号
///\param[in]       handler  实际client句柄
///\param[in]       deviceId    远程代理ID
///\param[in]       targetPort  目标端口
///\param[in,out]   localPort   本地映射端口,为0由内部随机分配一个端口
///\return 0添加端口映射成功/-1添加端口映射失败
///\note 通道建立是否成功需调用DHProxyClientChannelstate接口查询
TOU_API int DHProxyClientAddPortEX(ProxyClientHandler handler, const char* deviceId, int targetPort, int *localPort,
                                 const char* devUserName, const char* devPassWord, const char* randSalt, const char* devP2PVersion);

///\brief 通过远程代理打开映射(同步模式)
///\param[in]       handler  实际client句柄
///\param[in]       deviceId    远程代理ID
///\param[in]       targetPort  目标端口
///\param[in,out]   localPort   本地映射端口,为0由内部随机分配一个端口
///\param[in]       timeOut     超时时间(单位:毫秒)
///\note timeOut为0， 则不设置超时时间, 直到有结果返回
///\return P2P通道状态
TOU_API DHProxyClientP2PChannelState DHProxyClientAddPortSync(ProxyClientHandler handler, 
        const char *deviceId, int targetPort, int *localPort, unsigned int timeOut);

///\brief 通过远程代理打开映射(同步模式)，带设备用户名、密码、随机盐值、设备P2P版本号
///\param[in]       handler  实际client句柄
///\param[in]       deviceId    远程代理ID
///\param[in]       targetPort  目标端口
///\param[in,out]   localPort   本地映射端口,为0由内部随机分配一个端口
///\param[in]       timeOut     超时时间(单位:毫秒)
///\note timeOut为0， 则不设置超时时间, 直到有结果返回
///\return P2P通道状态
TOU_API DHProxyClientP2PChannelState DHProxyClientAddPortSyncEX(ProxyClientHandler handler, const char *deviceId, int targetPort, int *localPort, 
                                     const char* devUserName, const char* devPassWord, const char* randSalt, const char* devP2PVersion, 
                                     unsigned int timeOut);

///\brief 通过远程代理打开映射(TcpRelay, 异步模式)
///\param[in]       handler  实际client句柄
///\param[in]       deviceId    远程代理ID
///\param[in]       targetPort  目标端口
///\param[in,out]   localPort   本地映射端口,为0由内部随机分配一个端口
///\return 0添加端口映射成功/-1添加端口映射失败
///\note 通道建立是否成功需调用DHProxyClientChannelstate接口查询
TOU_API int DHProxyClientAddTcpRelayPort(ProxyClientHandler handler,
        const char* deviceId, int targetPort, int *localPort);

///\brief 通过远程代理打开映射(TcpRelay, 异步模式)，带设备用户名、密码、随机盐值、设备P2P版本号
///\param[in]       handler  实际client句柄
///\param[in]       deviceId    远程代理ID
///\param[in]       targetPort  目标端口
///\param[in,out]   localPort   本地映射端口,为0由内部随机分配一个端口
///\return 0添加端口映射成功/-1添加端口映射失败
///\note 通道建立是否成功需调用DHProxyClientChannelstate接口查询
TOU_API int DHProxyClientAddTcpRelayPortEX(ProxyClientHandler handler, const char* deviceId, int targetPort, int *localPort, 
                                            const char* devUserName, const char* devPassWord, const char* randSalt, const char* devP2PVersion);

///\brief 通过远程代理打开映射(TcpRelay, 同步模式)
///\param[in]       handler  实际client句柄
///\param[in]       deviceId    远程代理ID
///\param[in]       targetPort  目标端口
///\param[in,out]   localPort   本地映射端口,为0由内部随机分配一个端口
///\param[in]       timeOut     超时时间(单位:毫秒)
///\note timeOut为0， 则不设置超时时间, 直到有结果返回
///\return 0通道建立成功/-1通道建立失败
TOU_API DHProxyClientP2PChannelState DHProxyClientAddTcpRelayPortSync(ProxyClientHandler handler, 
        const char *deviceId, int targetPort, int *localPort, unsigned int timeOut);

///\brief 通过远程代理打开映射(TcpRelay, 同步模式)，带设备用户名、密码、随机盐值、设备P2P版本号
///\param[in]       handler  实际client句柄
///\param[in]       deviceId    远程代理ID
///\param[in]       targetPort  目标端口
///\param[in,out]   localPort   本地映射端口,为0由内部随机分配一个端口
///\param[in]       timeOut     超时时间(单位:毫秒)
///\note timeOut为0， 则不设置超时时间, 直到有结果返回
///\return 0通道建立成功/-1通道建立失败
TOU_API DHProxyClientP2PChannelState DHProxyClientAddTcpRelayPortSyncEX(ProxyClientHandler handler, const char *deviceId, int targetPort, int *localPort, 
                                                const char* devUserName, const char* devPassWord, const char* randSalt, const char* devP2PVersion, 
                                                unsigned int timeOut);

///\brief 删除一个映射
///\param[in]   handler  实际client句柄
///\param[in]   port 本地映射端口
///\return 0成功/-1失败
TOU_API int DHProxyClientDelPort(ProxyClientHandler handler, int port);

///\brief 查询映射端口速率
///\param[in]   handler  实际client句柄
///\param[in]   port 本地映射端口
///\param[out]  rate 当前映射速率
///\return 0成功/-1失败
TOU_API int DHProxyClientQueryRate(ProxyClientHandler handler,
        int port, DHProxyClientMapPortRate *rate);

///\brief 查询映射端口的P2P通道状态
///\param[in]   handler  实际client句柄
///\param[in]   port 本地映射端口
///\param[out]  state 当前映射端口状态， @see DHProxyClientP2PChannelState
///\return 0成功/-1失败
TOU_API int DHProxyClientChannelstate(ProxyClientHandler handler, int port, int *state);

///\brief 获取当前代理客户端状态
///\param[in]   handler  实际client句柄
///\param[out]  state  当前代理客户端状态, @see DHProxyClientProxyState
///\return 0成功/-1失败
TOU_API int DHProxyClientState(ProxyClientHandler handler, int *state);

///\brief 查询远程代理服务器的状态
///\param[in]   handler  实际client句柄
///\param[in]   deviceId 远程代理ID
///\param[out]  state 当前代理服务器状态, @see DHProxyClientProxyState
///\return 0成功/-1失败
TOU_API int DHProxyClientServerState(ProxyClientHandler handler, const char* deviceId, int *state);

///\brief 查询远程代理服务器的信息
///\param[in]   handler  实际client句柄
///\param[in]   port  本地隐射端口
///\param[out]  info  远程代理服务器信息, @see DHProxyClientRemotePortInfo
///\return 0成功/-1失败
TOU_API int DHProxyClientQueryRemoetInfo(ProxyClientHandler handler, int port, DHProxyClientRemotePortInfo *info);

///\breif 初始化
///\param[in]       svraddr  服务器IP(暂不支持域名)
///\param[in]       svrport  服务器端口
///\param[in]       passwd   密钥
///\param[in]       username   用户名
///\param[in]       clientType 客户端类型
///\return 0失败/其他，client句柄
TOU_API ProxyClientHandler DHProxyClientInitWtihName(const char* svrip, int svrport, const char* passwd, const char *clientType, const char* username);

///\brief 设置Proxy选项
///\param[in]   handler  实际client句柄
///\param[in] option ProxyOption枚举
///\param[in] value 设置参数值
///\return 0 成功; -1 失败
///\note value设置 @see ProxyOption
TOU_API int DHProxySetOption(ProxyClientHandler handler, DHProxyOption option, int value);

///\brief 获取对应option的值
///\param[in] handler  实际client句柄
///\param[in] option ProxyOption枚举
///\return 返回设置的参数值: -1 失败; >=0 option的值 
TOU_API int DHProxyGetOption(ProxyClientHandler handler, DHProxyOption option);

///\brief 设置日志级别,高于该级别的日志不能输出
///\param[in] handler   实际client句柄
///\param[in] level     DHProxyLogLevel枚举
///\note level设置 @see DHProxyLogLevel
///\note 默认日志级别为 DHProxyLogLevelDebug
TOU_API void DHProxySetLogLevel(ProxyClientHandler handler, DHProxyLogLevel level);

///\brief 获取设备信息
///\param[in]      handler    实际client句柄
///\param[in]      deviceId   设备序列号
///\param[in]      bufferLen  存储设备信息的缓冲区长度
///\param[out]     deviceInfo 设备信息
///\param[in]      timeout    超时时间(ms)，默认为3000
///\return true成功/false失败
TOU_API bool DHProxyGetDeviceInfo(ProxyClientHandler handler, const char *deviceId, int bufferLen, char *deviceInfo, int timeout = 3000);

///\brief 注册上报穿透信息的回调
///\param[in]      handler         实际client句柄
///\param[in]      reportHandler   穿透信息上报的回调函数 @see DHP2PTraversalInfoHandler
///\note 该回调仅限于P2P向上层上报穿透信息
///\note 请勿在该回调中处理上层业务，防止阻塞P2P内部线程
TOU_API void DHProxyRegP2PTraversalInfoHandler(ProxyClientHandler handler, const DHP2PTraversalInfoHandler reportHandler);

///\brief 获取P2P监听的Socket Domain
///\param[in]      localPort    本地映射端口
///\param[out]     family       Socket Domain
///\return 成功/失败
TOU_API bool DHProxyGetSockFamily(ProxyClientHandler handler, int localPort, DHP2PSockFamilyType *family);


#ifdef  __cplusplus
}
#endif

#endif /* _DAHUA_P2P_PROXY_CLIENT_CWRAP_H_ */

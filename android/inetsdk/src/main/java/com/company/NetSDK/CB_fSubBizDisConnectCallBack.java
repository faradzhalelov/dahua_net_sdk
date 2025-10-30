package com.company.NetSDK;

/**
 * Created by 32940 on 2018/9/6.
 */
public interface CB_fSubBizDisConnectCallBack {

    /**
     * \if ENGLISH_LANG
     * Call back function of subbiz disconnect
     * @param lSubBizHandle Sub business module handle, it is retuened by CLIENT_CreateSubBusinessModule
     * @param lOperateHandle Operate handle
     * @param pstDisConnectInfo Call back info of disconnect
     * \else
     * 分压业务连接断线回调
     * @param lSubBizHandle 分压业务sdk句柄, 由CLIENT_CreateSubBusinessModule接口返回
     * @param lOperateHandle 业务句柄
     * @param pstDisConnectInfo 断线回调数据
     * \endif
     */
    public void invoke(long lSubBizHandle, long lOperateHandle, NET_SUBBIZ_DISCONNECT_CALLBACK pstDisConnectInfo);
}

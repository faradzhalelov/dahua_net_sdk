package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief RTMP config, corresponding enumeration NET_EM_CFG_RTMP
 * \else
 * @brief RTMP 配置
 * \endif
 */
public class NET_CFG_RTMP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * enable
     * \else
     * RTMP配置是否开启
     * \endif
     */
    public boolean bEnable;

    /**
     * \if ENGLISH_LANG
     * serve address
     * \else
     * RTMP服务器地址
     * \endif
     */
    public byte szAddr[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * serve port
     * \else
     * RTMP服务器端口
     * \endif
     */
    public int nPort;

    /**
     * \if ENGLISH_LANG
     * path
     * \else
     * 路径名
     * \endif
     */
    public byte szCustomPath[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * stream path
     * \else
     * 码流路径前缀:不同通道以后缀数字区分
     * \endif
     */
    public byte szStreamPath[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * the key to get url
     * \else
     * 获取RTMP地址时的Key
     * \endif
     */
    public byte szKey[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * main stream info, user allocates memory, size must be sizeof(NET_CHANNEL_RTMP_INFO) * nMainStream
     * \else
     * 主码流信息，用户分配内存，内存大小为 sizeof(NET_CHANNEL_RTMP_INFO) * nMainStream
     * \endif
     */
    public NET_CHANNEL_RTMP_INFO[] pstuMainStream;

    /**
     * \if ENGLISH_LANG
     * pstuMainStream's count
     * \else
     * pstuMainStream 个数
     * \endif
     */
    public int nMainStream;

    /**
     * \if ENGLISH_LANG
     * returned pstuMainStream's count(vailid when get config)
     * \else
     * 返回的 pstuMainStream 个数（获取配置时有效）
     * \endif
     */
    public int nMainStreamRet;

    /**
     * \if ENGLISH_LANG
     * extra1 stream info, user allocates memory, size must be sizeof(NET_CHANNEL_RTMP_INFO) * nExtra1Stream
     * \else
     * 辅码流1信息，用户分配内存，内存大小为 sizeof(NET_CHANNEL_RTMP_INFO) * nExtra1Stream
     * \endif
     */
    public NET_CHANNEL_RTMP_INFO[] pstuExtra1Stream;

    /**
     * \if ENGLISH_LANG
     * pstuExtra1Stream's count
     * \else
     * pstuExtra1Stream 个数
     * \endif
     */
    public int nExtra1Stream;

    /**
     * \if ENGLISH_LANG
     * returned pstuExtra1Stream's count(valid when get config)
     * \else
     * 返回的 nExtra1StreamRet 个数（获取配置时有效）
     * \endif
     */
    public int nExtra1StreamRet;

    /**
     * \if ENGLISH_LANG
     * extra2 stream info, user allocates memory, size must be sizeof(NET_CHANNEL_RTMP_INFO) * nExtra2Stream
     * \else
     * 辅码流2信息，用户分配内存，内存大小为 sizeof(NET_CHANNEL_RTMP_INFO) * nExtra2Stream
     * \endif
     */
    public NET_CHANNEL_RTMP_INFO[] pstuExtra2Stream;

    /**
     * \if ENGLISH_LANG
     * pstuExtra2Stream's count
     * \else
     * pstuExtra2Stream 个数
     * \endif
     */
    public int nExtra2Stream;

    /**
     * \if ENGLISH_LANG
     * returned pstuExtra2Stream's count(valid when get config)
     * \else
     * 返回的 nExtra2StreamRet 个数（获取配置时有效）
     * \endif
     */
    public int nExtra2StreamRet;

    public NET_CFG_RTMP_INFO(int nMainStream, int nExtra1Stream, int nExtra2Stream) {
        this.nMainStream = nMainStream;
        this.nExtra1Stream = nExtra1Stream;
        this.nExtra2Stream = nExtra2Stream;
        this.pstuMainStream = new NET_CHANNEL_RTMP_INFO[nMainStream];
        this.pstuExtra1Stream = new NET_CHANNEL_RTMP_INFO[nExtra1Stream];
        this.pstuExtra2Stream = new NET_CHANNEL_RTMP_INFO[nExtra2Stream];
        for(int i = 0; i < nMainStream; i ++){
            this.pstuMainStream[i] = new NET_CHANNEL_RTMP_INFO();
        }
        for(int i = 0; i < nExtra1Stream; i ++){
            this.pstuExtra1Stream[i] = new NET_CHANNEL_RTMP_INFO();
        }
        for(int i = 0; i < nExtra2Stream; i ++){
            this.pstuExtra2Stream[i] = new NET_CHANNEL_RTMP_INFO();
        }
    }
}

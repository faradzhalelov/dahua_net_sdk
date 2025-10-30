package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * CLIENT_SnapPicFromRecord out param
 * \else
 * CLIENT_SnapPicFromRecord 接口出参
 * \endif
 */
public class NET_OUT_SNAP_PIC_FROM_REC implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  picture buffer point,need user alloc memory
     * \else
     *  图片缓存指针,需要用户分配内存
     * \endif
     */
    public byte					pPicBuf[];

    /**
     * \if ENGLISH_LANG
     *  picture buffer size,need user input
     * \else
     *  图片缓存大小,需要用户填写
     * \endif
     */
    public int					nBufLen;

    /**
     * \if ENGLISH_LANG
     *  picture actual size
     * \else
     *  设备返回的图片数据大小
     * \endif
     */
    public int					nRetLen;

    /*Need Constructed Function!*/
    public NET_OUT_SNAP_PIC_FROM_REC(int nBufLen) {
        this.nBufLen = nBufLen;
        this.pPicBuf = new byte[nBufLen];
    }
}

package com.company.NetSDK;

import java.io.Serializable;


/**
 * 搜索OEM设备类型枚举
 */
public class NET_OUT_DESCRIPTION_FOR_RESET_PWD_BY_PORT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *  预留手机号
     */
    public byte					szCellPhone[] = new byte[FinalVar.MAX_CELL_PHONE_NUMBER_LEN];

    /**
     *  预留邮箱
     */
    public byte					szMailAddr[] = new byte[FinalVar.MAX_MAIL_LEN];

    /**
     *  二维码信息,用户分配内存（当前大小为360字节）
     */
    public byte[]					pQrCode;

    /**
     *  用户分配的二维码信息长度
     */
    public int					nQrCodeLen;

    /**
     *  设备返回的二维码信息长度
     */
    public int					nQrCodeLenRet;


    public NET_OUT_DESCRIPTION_FOR_RESET_PWD_BY_PORT(int nQrCodeLen) {
        this.nQrCodeLen = nQrCodeLen;

        if(nQrCodeLen > 0) {
            pQrCode = new byte[nQrCodeLen];
        }
    }
}

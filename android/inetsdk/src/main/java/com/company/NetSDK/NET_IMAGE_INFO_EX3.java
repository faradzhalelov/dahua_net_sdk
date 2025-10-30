package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief image information
 * \else
 * @brief 图片扩展信息
 * \endif
 */
public class NET_IMAGE_INFO_EX3 implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Picture type,{@link EM_IMAGE_TYPE_EX2}
     * \else
     * 图片类型,{@link EM_IMAGE_TYPE_EX2}
     * \endif
     */
    public int					emType;

    /**
     * \if ENGLISH_LANG
     *  Offset in the binary data block
     * \else
     * 在二进制数据块中的偏移
     * \endif
     */
    public int					nOffset;

    /**
     * \if ENGLISH_LANG
     *  Picture size, unit: byte
     * \else
     * 图片大小,单位:字节
     * \endif
     */
    public int					nLength;

    /**
     * \if ENGLISH_LANG
     *  Encryption key marking, distinguishing which length key to use, 0: using szEncryptKey, 1: using szEncryptLKey
     * \else
     * 加密密钥标记, 区分使用哪种长度密钥, 0: 使用 szEncryptKey, 1: 使用 szEncryptLKey
     * \endif
     */
    public int					nEncryptFlag;

    /**
     * \if ENGLISH_LANG
     *  Picture storage location
     * \else
     * 图片存储位置
     * \endif
     */
    public byte					szPath[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     *  The binary image encryption key is transmitted from the device after Base64 encoding, and the SDK does not perform decoding processing
     * \else
     * 二进制图片加密秘钥，设备传过来的是Base64编码之后的，SDK不做解码处理
     * \endif
     */
    public byte					szEncryptKey[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  The binary image encryption key is transmitted from the device after Base64 encoding, and the SDK does not perform decoding processing
     * \else
     * 二进制图片加密秘钥，设备传过来的是Base64编码之后的，SDK不做解码处理
     * \endif
     */
    public byte					szEncryptLKey[] = new byte[256];

}
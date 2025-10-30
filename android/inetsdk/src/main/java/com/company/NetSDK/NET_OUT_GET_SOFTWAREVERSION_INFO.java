package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetSoftwareVersion} port output parameter
 * \else
 * {@link INetSDK#GetSoftwareVersion} 接口输出参数
 * \endif
 */
public class NET_OUT_GET_SOFTWAREVERSION_INFO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * software version
     * \else
     * 软件版本
     * \endif
     */
    public byte                        szVersion[] = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * version build date,exact to the second
     * \else
     * 日期
     * \endif
     */
    public NET_TIME                    stuBuildDate = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * web version info
     * \else
     * web软件信息
     * \endif
     */
    public byte                        szWebVersion[] = new byte[FinalVar.SDK_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * security baseline version
     * \else
     * 安全基线版本
     * \endif
     */
    public byte                        szSecurityVersion[] = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * Peripheral number
     * \else
     * 返回的外设数量
     * \endif
     */
    public int                          nPeripheralNum;

    /**
     * \if ENGLISH_LANG
     * Peripheral version
     * \else
     * 设备的外设软件版本
     * \endif
     */
    public NET_PERIPHERAL_VERSIONS[]     stuPeripheralVersions = new NET_PERIPHERAL_VERSIONS[32];

    /**
     * \if ENGLISH_LANG
     * Algorithm training external code
     * \else
     * 算法训练对外代号
     * \endif
     */
    public byte    		szAlgorithmTrainingVersion[]=new byte[64];

    /**
     * \if ENGLISH_LANG
     * Mobile Web cloud matching version number for devices
     * \else
     * 设备mobileWeb上云匹配版本号
     * \endif
     */
    public byte   		szMobileWebVersion[]=new  byte[128];

    public NET_OUT_GET_SOFTWAREVERSION_INFO(){
        for(int i = 0; i < 32; ++i){
            stuPeripheralVersions[i] = new NET_PERIPHERAL_VERSIONS();
        }
    }


}

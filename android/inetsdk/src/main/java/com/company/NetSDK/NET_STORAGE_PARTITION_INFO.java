package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * @brief  设备存储分区信息
 * \endif
 */
public class NET_STORAGE_PARTITION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  partition error or not
     * \else
     *  分区是否异常
     * \endif
     */
    public boolean					bError;

    /**
     * \if ENGLISH_LANG
     *  partition type，{@link EM_PARTITION_TYPE}
     * \else
     *  分区属性类型，{@link EM_PARTITION_TYPE}
     * \endif
     */
    public int					emType;

    /**
     * \if ENGLISH_LANG
     *  partition storage, unit: byte
     * \else
     *  分区总空间，单位字节
     * \endif
     */
    public double					dTotalBytes;

    /**
     * \if ENGLISH_LANG
     * partition storage that already used
     * \else
     * 分区使用空间
     * \endif
     */
    public double					dUsedBytes;

    /**
     * \if ENGLISH_LANG
     * partition path
     * \else
     *  分区名字
     * \endif
     */
    public byte					szPath[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Is the partition being checked on the disk
     * \else
     *  分区是否在盘检
     * \endif
     */
    public  boolean				bFsChecking;

}

package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * @brief  设备存储信息
 * \endif
 */
public class NET_DEVICE_STORAGE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  device name
     * \else
     *  设备名称
     * \endif
     */
    public byte					szName[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  device support hot-plug or not
     * \else
     *  存储设备能否热插拔
     * \endif
     */
    public boolean					bSupportHotPlug;

    /**
     * \if ENGLISH_LANG
     *  life percent
     * \else
     *  寿命长度标识
     * \endif
     */
    public float					fLifePercent;

    /**
     * \if ENGLISH_LANG
     *  SD card Lock state，{@link EM_SD_LOCK_STATE}
     * \else
     *  SD卡加锁状态，{@link EM_SD_LOCK_STATE}
     * \endif
     */
    public int					emLockState;

    /**
     * \if ENGLISH_LANG
     *  SD card encrypt flag，{@link EM_SD_ENCRYPT_FLAG}
     * \else
     *  SD卡加密功能标识，{@link EM_SD_ENCRYPT_FLAG}
     * \endif
     */
    public int					emSDEncryptFlag;

    /**
     * \if ENGLISH_LANG
     *  Health type，{@link EM_STORAGE_HEALTH_TYPE}
     * \else
     *  健康状态标识，{@link EM_STORAGE_HEALTH_TYPE}
     * \endif
     */
    public int					emHealthType;

    /**
     * \if ENGLISH_LANG
     *  device state，{@link EM_STORAGE_DEVICE_STATUS}
     * \else
     *  存储设备状态，{@link EM_STORAGE_DEVICE_STATUS}
     * \endif
     */
    public int					emState;

    /**
     * \if ENGLISH_LANG
     *  storage partition info
     * \else
     *  分区的具体信息
     * \endif
     */
    public NET_STORAGE_PARTITION_INFO					stuPartitionInfo[] = new NET_STORAGE_PARTITION_INFO[12];

    /**
     * \if ENGLISH_LANG
     *  partition number
     * \else
     *  分区数量
     * \endif
     */
    public int					nPartition;

    public NET_DEVICE_STORAGE_INFO() {
        for(int i = 0; i < 12; i ++){
            this.stuPartitionInfo[i] = new NET_STORAGE_PARTITION_INFO();
        }
    }
}

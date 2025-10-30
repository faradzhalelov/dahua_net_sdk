package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief get NVR/IPC serial output parameter, use connect mode:direct
 * \else
 * @brief 获取云升级信息出参
 * \endif
 */
public class NET_OUT_UPGRADER_GETSERIAL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  serial info
     * \else
     *  云升级信息
     * \endif
     */
    public NET_UPGRADER_SERIAL_INO					stuSerialInfo[] = new NET_UPGRADER_SERIAL_INO[FinalVar.MAX_UPGRADER_SERIAL_INFO];

    /**
     * \if ENGLISH_LANG
     *  return serial count
     * \else
     *  返回个数
     * \endif
     */
    public int					nRetNum;

    public NET_OUT_UPGRADER_GETSERIAL() {
        for(int i = 0; i < FinalVar.MAX_UPGRADER_SERIAL_INFO; i ++){
            stuSerialInfo[i] = new NET_UPGRADER_SERIAL_INO();
        }
    }
}
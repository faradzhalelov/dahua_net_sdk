package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief radiometry query result info
 * \else
 * @brief 测温查询结果信息
 * \endif
 */
public class NET_RADIOMETRY_QUERY_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  record time
     * \else
     *  记录时间
     * \endif
     */
    public NET_TIME					stuTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  preset id
     * \else
     *  预置点编号
     * \endif
     */
    public int					nPresetId;

    /**
     * \if ENGLISH_LANG
     *  rule id
     * \else
     *  规则编号
     * \endif
     */
    public int					nRuleId;

    /**
     * \if ENGLISH_LANG
     *  query type
     * \else
     *  查询类型
     * \endif
     */
    public int					emQueryType;

    /**
     * \if ENGLISH_LANG
     *  query name
     * \else
     *  查询项名称
     * \endif
     */
    public byte					szName[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     *  query Temperature Monitoring coordinate
     * \else
     *  查询测温点坐标
     * \endif
     */
    public NET_POINT					stuCoordinate[] = new NET_POINT[FinalVar.MAX_COORDINATE_NUM];

    /**
     * \if ENGLISH_LANG
     *  channel number
     * \else
     *  通道号
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  temperature unit
     * \else
     *  温度单位
     * \endif
     */
    public int					emTemperatureUnit;

    /**
     * \if ENGLISH_LANG
     *  temper info
     * \else
     *  温度信息
     * \endif
     */
    public NET_QUERY_TEMPER_INFO					stuQueryTemperInfo = new NET_QUERY_TEMPER_INFO();

    public NET_RADIOMETRY_QUERY_INFO() {
        for(int i = 0; i < FinalVar.MAX_COORDINATE_NUM; i ++){
            this.stuCoordinate[i] = new NET_POINT();
        }
    }
}
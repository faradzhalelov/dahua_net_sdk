package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Size filter
 * \else
 * @brief 尺寸过滤器
 * \endif
 */
public class NET_CFG_SIZEFILTER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Calibration pane number
     * \else
     *  校准框个数
     * \endif
     */
    public int					nCalibrateBoxNum;

    /**
     * \if ENGLISH_LANG
     *  Calibration box (far and near-end calibration mode only)
     * \else
     *  校准框(远端近端标定模式下有效)
     * \endif
     */
    public NET_CFG_CALIBRATEBOX_INFO					stuCalibrateBoxs[] = new NET_CFG_CALIBRATEBOX_INFO[10];

    /**
     * \if ENGLISH_LANG
     *  Measurement mode enabled or not 
     * \else
     *  计量方式参数是否有效
     * \endif
     */
    public boolean					bMeasureModeEnable;

    /**
     * \if ENGLISH_LANG
     *  Measurement mode, 0-pixel, far and near-end calibration not necessary, 1- real length, unit: meter, 2- pixel after far and near-end calibration
     * \else
     *  计量方式,0-像素，不需要远端、近端标定, 1-实际长度，单位：米, 2-远端近端标定后的像素
     * \endif
     */
    public byte					bMeasureMode;

    /**
     * \if ENGLISH_LANG
     *  Filter type enabled or not 
     * \else
     *  过滤类型参数是否有效
     * \endif
     */
    public boolean					bFilterTypeEnable;

    /**
     * \if ENGLISH_LANG
     *  Filter type:0:"ByLength",1:"ByArea", 2"ByWidthHeight"
     * \else
     *  过滤类型:0:"ByLength",1:"ByArea", 2"ByWidthHeight"
     * \endif
     */
    public byte					bFilterType;

    /**
     * \if ENGLISH_LANG
     *  Min object size parameter is valid or not  
     * \else
     *  物体最小尺寸参数是否有效
     * \endif
     */
    public boolean					bFilterMinSizeEnable;

    /**
     * \if ENGLISH_LANG
     *  Max object size parameter is valid or not 
     * \else
     *  物体最大尺寸参数是否有效
     * \endif
     */
    public boolean					bFilterMaxSizeEnable;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public boolean					abByArea;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public boolean					abMinArea;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public boolean					abMaxArea;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public boolean					abMinAreaSize;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public boolean					abMaxAreaSize;

    /**
     * \if ENGLISH_LANG
     *  Filter by area or not. You can use ComplexSizeFilter to see it works or not. 
     * \else
     *  是否按面积过滤 通过能力ComplexSizeFilter判断是否可用
     * \endif
     */
    public boolean					bByArea;

    /**
     * \if ENGLISH_LANG
     *  Min object size      size of length ratio under "ByLength" Mode,size of area under "ByArea" mode, invalid height (size of standard box lengths under far and near-end calibration mode)
     * \else
     *  物体最小尺寸 "ByLength"模式下表示宽高的尺寸，"ByArea"模式下宽表示面积，高无效(远端近端标定模式下表示基准框的宽高尺寸)。
     * \endif
     */
    public NET_CFG_SIZE					stuFilterMinSize = new NET_CFG_SIZE();

    /**
     * \if ENGLISH_LANG
     *  Max object size size of length ratio under "ByLength" mode, size of area under "ByArea" mode", invalid height (size of standard box lengths under far and near-end calibration mode)
     * \else
     *  物体最大尺寸 "ByLength"模式下表示宽高的尺寸，"ByArea"模式下宽表示面积，高无效(远端近端标定模式下表示基准框的宽高尺寸)。
     * \endif
     */
    public NET_CFG_SIZE					stuFilterMaxSize = new NET_CFG_SIZE();

    /**
     * \if ENGLISH_LANG
     *  Min area
     * \else
     *  最小面积
     * \endif
     */
    public float					nMinArea;

    /**
     * \if ENGLISH_LANG
     *  Max area
     * \else
     *  最大面积
     * \endif
     */
    public float					nMaxArea;

    /**
     * \if ENGLISH_LANG
     *  Min area rectangle box.   When  "measurement method" is "pixel", it represents its sizes of lengths; when "measurement method" is "far and near-end calibration mode", it represents the min sizes of lengths of standard box
     * \else
     *  最小面积矩形框尺寸 "计量方式"为"像素"时，表示最小面积矩形框的宽高尺寸；"计量方式"为"远端近端标定模式"时，表示基准框的最小宽高尺寸；
     * \endif
     */
    public NET_CFG_SIZE					stuMinAreaSize = new NET_CFG_SIZE();

    /**
     * \if ENGLISH_LANG
     *  Max area rectangle box, same as above
     * \else
     *  最大面积矩形框尺寸, 同上
     * \endif
     */
    public NET_CFG_SIZE					stuMaxAreaSize = new NET_CFG_SIZE();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public boolean					abByRatio;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public boolean					abMinRatio;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public boolean					abMaxRatio;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public boolean					abMinRatioSize;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public boolean					abMaxRatioSize;

    /**
     * \if ENGLISH_LANG
     *  Filter by length ratio or not   . You can use ComplexSizeFilter to see it works or not. 
     * \else
     *  是否按宽高比过滤 通过能力ComplexSizeFilter判断是否可用
     * \endif
     */
    public boolean					bByRatio;

    /**
     * \if ENGLISH_LANG
     *  Min W/H ratio
     * \else
     *  最小宽高比
     * \endif
     */
    public double					dMinRatio;

    /**
     * \if ENGLISH_LANG
     *  Max W/H ratio
     * \else
     *  最大宽高比
     * \endif
     */
    public double					dMaxRatio;

    /**
     * \if ENGLISH_LANG
     *  Min W/H ratio rectangle box size, min W/H ratio corresponding to sizes of lengths of rectangle box
     * \else
     *  最小宽高比矩形框尺寸，最小宽高比对应矩形框的宽高尺寸。
     * \endif
     */
    public NET_CFG_SIZE					stuMinRatioSize = new NET_CFG_SIZE();

    /**
     * \if ENGLISH_LANG
     *  Max W/H ratio rectangle box size. See above information.
     * \else
     *  最大宽高比矩形框尺寸，同上
     * \endif
     */
    public NET_CFG_SIZE					stuMaxRatioSize = new NET_CFG_SIZE();

    /**
     * \if ENGLISH_LANG
     *  Area calibration box number
     * \else
     *  面积校准框个数
     * \endif
     */
    public int					nAreaCalibrateBoxNum;

    /**
     * \if ENGLISH_LANG
     *  Area calibration box
     * \else
     *  面积校准框
     * \endif
     */
    public NET_CFG_CALIBRATEBOX_INFO					stuAreaCalibrateBoxs[] = new NET_CFG_CALIBRATEBOX_INFO[10];

    /**
     * \if ENGLISH_LANG
     *  W/H calibration box number
     * \else
     *  宽高校准框个数
     * \endif
     */
    public int					nRatioCalibrateBoxs;

    /**
     * \if ENGLISH_LANG
     *  W/H calibration box number
     * \else
     *  宽高校准框
     * \endif
     */
    public NET_CFG_CALIBRATEBOX_INFO					stuRatioCalibrateBoxs[] = new NET_CFG_CALIBRATEBOX_INFO[10];

    /**
     * \if ENGLISH_LANG
     *  Valid filter by L/H ration parameter enabled or not 
     * \else
     *  长宽过滤使能参数是否有效
     * \endif
     */
    public boolean					abBySize;

    /**
     * \if ENGLISH_LANG
     *  L/W filter enabled
     * \else
     *  长宽过滤使能
     * \endif
     */
    public boolean					bBySize;

    public NET_CFG_SIZEFILTER_INFO() {
        for(int i = 0; i < 10; i ++){
            this.stuAreaCalibrateBoxs[i] = new NET_CFG_CALIBRATEBOX_INFO();
            this.stuCalibrateBoxs[i] = new NET_CFG_CALIBRATEBOX_INFO();
            this.stuRatioCalibrateBoxs[i] = new NET_CFG_CALIBRATEBOX_INFO();
        }
    }
}
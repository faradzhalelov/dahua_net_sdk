package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Encoding object - overlay sensor information - superimposed Description
 * \else
 *  编码物件-叠加传感器信息-叠加内容描述
 * \endif
 */
public class AV_CFG_VideoWidgetSensorInfo_Description implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Need to describe the sensor ID (analog alarm channel number) 
	 * \else
	 * 需要描述的传感器的ID(即模拟量报警通道号)
	 * \endif
	 */
	public int	nSensorID;
}

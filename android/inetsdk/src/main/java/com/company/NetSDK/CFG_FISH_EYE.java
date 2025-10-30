package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * fish eye configuration
 * \else
 * 鱼眼镜头配置
 * \endif
 */
public class CFG_FISH_EYE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * center point[0,8192]
	 * \else
	 * 鱼眼圆心坐标,范围[0,8192]
	 * \endif
	 */
	public CFG_POLYGON         stuCenterPoint = new CFG_POLYGON();
	
	/**
	 * \if ENGLISH_LANG
	 * radius [0,8192]
	 * \else
	 * 鱼眼半径大小,范围[0,8192]
	 * \endif
	 */
	public int        nRadius;
	
	/**
	 * \if ENGLISH_LANG
	 * direction[0,360.0]
	 * \else
	 * 镜头旋转方向,旋转角度[0,360.0]
	 * \endif
	 */
	public float               fDirection;
	
	/**
	 * \if ENGLISH_LANG
	 * place holder	1 roof loading,2 wall loading,3 earth loading.,default 1
	 * \else
	 * 镜头安装方式	1顶装，2壁装；3地装,默认1
	 * \endif
	 */
	public byte                byPlaceHolder;
	
	/**
	 * \if ENGLISH_LANG
	 * fish eye mode, refer to {@link CFG_CALIBRATE_MODE}
	 * \else
	 * 鱼眼矫正模式, 取值参考 {@link CFG_CALIBRATE_MODE}
	 * \endif
	 */
	public byte                byCalibrateMode;
}

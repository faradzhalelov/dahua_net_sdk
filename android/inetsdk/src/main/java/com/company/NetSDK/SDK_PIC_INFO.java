package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * Picture info
 * \else
 * 物体对应图片文件信息
 * \endif
 */
public class SDK_PIC_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Current picture file's offset in the binary file, byte
	 * \else
	 * 文件在二进制数据块中的偏移位置, 单位:字节
	 * \endif
	 */
	public int                dwOffSet;
	
	/**
	 * \if ENGLISH_LANG
	 * Current picture file's size, byte
	 * \else
	 * 文件大小, 单位:字节
	 * \endif
	 */
	public int                dwFileLenth;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture width, pixel
	 * \else
	 * 图片宽度, 单位:像素
	 * \endif
	 */
	public short                wWidth;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture high, pixel
	 * \else
	 * 图片高度, 单位:像素          
	 * \endif
	 */
	public short                wHeight;

	/**
	 * \if ENGLISH_LANG
	 * File path
	 * \else
	 * 文件路径
	 * \endif
	 */
	public byte[]             pszFilePath;


	/**
	 * \if ENGLISH_LANG
	 * When submit to the server, the algorithm has checked the image or not
	 * \else
	 * 图片是否算法检测出来的检测过的提交识别服务器时,则不需要再时检测定位抠图,1:检测过的,0:没有检测过
	 * \endif
	 */
	public byte            bIsDetected;

	/**
	 * \if ENGLISH_LANG
	 * The upper left corner of the figure is in the big picture. Absolute coordinates are used
	 * \else
	 * 小图左上角在大图的位置，使用绝对坐标系
	 * \endif
	 */
	public SDK_POINT		stuPoint = new SDK_POINT();

	@Override
	public String toString() {
		return "SDK_PIC_INFO{" +
				"dwOffSet=" + dwOffSet +
				", dwFileLenth=" + dwFileLenth +
				", wWidth=" + wWidth +
				", wHeight=" + wHeight +
				", pszFilePath=" + Arrays.toString(pszFilePath) +
				", bIsDetected=" + bIsDetected +
				", stuPoint=" + stuPoint.toString() +
				'}';
	}
}

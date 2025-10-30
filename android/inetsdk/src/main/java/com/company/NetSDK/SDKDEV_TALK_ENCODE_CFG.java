package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * audio talk configuration
 * \else
 * 语音对讲编码配置
 * \endif
 */
public class SDKDEV_TALK_ENCODE_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Compression type,value, refer to {@link SDK_TALK_CODING_TYPE},please set the compression type according to the mode the device supports
	 * \else
	 * 压缩格式，枚举值参考 {@link SDK_TALK_CODING_TYPE}，请根据设备支持的语音对讲类型设置压缩格式。
	 * \endif
	 */
	public int                 nCompression;

	/**
	 * \if ENGLISH_LANG
	 * Encode mode, value, 0 means not support the compression tyep
	 * Set the responding type according to compression type
	 * like AMR, please refer to {@link EM_ARM_ENCODE_MODE}
	 * \else
	 * 编码模式，枚举值，为0时表示该压缩格式不支持编码模式。
	 * 根据压缩格式可以设置对应的编码格式，如
	 * AMR详见{@link EM_ARM_ENCODE_MODE}
	 * \endif
	 */
	public int                 nMode;
}

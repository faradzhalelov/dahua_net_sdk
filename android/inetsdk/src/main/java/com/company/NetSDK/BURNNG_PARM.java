package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Burner control 
 * \else
 * 刻录控制
 * \endif
 */
public class BURNNG_PARM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel subnet mask. Bit means the channel to be burned.
	 * \else
	 * 通道掩码，按位表示要刻录的通道
	 * \endif
	 */
	public int					channelMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner subnet mask.  Use bit to represent according to the searched burner list 
	 * \else
	 * 刻录机掩码，根据查询到的刻录机列表，按位表示
	 * \endif
	 */
	public byte				devMask;
	
	/**
	 * \if ENGLISH_LANG
	 * PIP channel(Channel No.+32)
	 * \else
	 * 画中画通道(通道数+32)
	 * \endif
	 */
	public byte                bySpicalChannel;
}

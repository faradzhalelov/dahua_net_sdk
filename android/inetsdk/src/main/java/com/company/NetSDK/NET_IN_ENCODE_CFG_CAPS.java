package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get device encode config corresponding capacity input parameter, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_ENCODE_CFG_CAPS}
 * \else
 * 获取设备编码配置对应能力输入参数, 对应接口{@link INetSDK#GetDevCaps},对应命令 {@link FinalVar#NET_ENCODE_CFG_CAPS}
 * \endif
 */
public class NET_IN_ENCODE_CFG_CAPS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel no.
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                 nChannelId; 
	
	/**
	 * \if ENGLISH_LANG
	 * stream type，0：main stream；1：sub stream1；2：sub stream2；3：sub stream3；4：snapshot stream
	 * can be left unset, whatever value it is set, you get results of main stream, sub stream1 and snapshot stream
	 * \else
	 * 码流类型，0：主码流；1：辅码流1；2：辅码流2；3：辅码流3；4：抓图码流
	 * 此参数可以不填，不论指定什么类型，设备都返回主、辅、抓图码流的能力
	 * \endif
	 */
	public int                 nStreamType; 
	
	/**
	 * \if ENGLISH_LANG
	 * Encode config，cia calling configsdk.dll port PacketData to get
	 * correspondingsampling command is  {@link FinalVar#CFG_CMD_ENCODE}
	 * \else
	 * Encode配置，通过调用configsdk.dll中接口PacketData封装得到
	 * 对应的封装命令为  {@link FinalVar#CFG_CMD_ENCODE}
	 * \endif
	 */
	public byte                pchEncodeJson[];
}

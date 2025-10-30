package com.company.CodecSDK;

/* 音频处理数据结构                     */
public class AudioBuf {
	public byte			pData[];   /* 音频数据起始地址                     */
	public int			frequency;/* 采样频率，单位；Hz                   */
	public int			dataLen;  /* 数据长度，单位：字节                 */
	public int			depth;    /* 采样深度(精度)，单位：bit            */
	public int			offset;   /* 两个音频采样点之间的间隔，单位：字节 */
	public int			channels;   /* 通道数                               */
}

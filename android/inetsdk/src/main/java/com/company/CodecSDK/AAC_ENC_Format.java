package com.company.CodecSDK;

public class AAC_ENC_Format {
    public int		   frequency;  /* 输入采样频率，单位；Hz                               */
    public int		   channels;   /* 通道数                                               */
    public int		   bitRate;    /* 码率，码率低于采样率时，编码的结果基本相同，         */
						 /* 码率最大不能大于采样率的6倍                          */
					     /* 大于采样时音质比较好，一般取采样率两倍，单位：bips/s    */
}

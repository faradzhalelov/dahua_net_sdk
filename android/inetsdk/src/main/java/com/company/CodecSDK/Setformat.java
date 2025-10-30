package com.company.CodecSDK;

public class Setformat {
	public int 		outbits;              /* 编码的码率(支持8种码率输入)          */
									   /* 0 -- 4.75kbits/s  1 -- 5.15kbits.s   */
									   /* 2 -- 5.9kbits/s   3 -- 6.7kbits.s    */
									   /* 4 -- 7.4kbits/s   5 -- 7.95kbits.s   */
									   /* 6 -- 10.2kbits/s  7 -- 12.2kbits.s   */
	public int 		dtx;                  /* 是否开启不连续输入，静音压缩         */
										   /* 1 表示开启使能编码，0 表示不开启     */
									    /* 建议选 1                             */
}

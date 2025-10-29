/********************************************************************
*	File Name: 	        fsk.h	
*	Author:             qiao gang
*	Copyright 1992-2014, ZheJiang Dahua Technology Stock Co.Ltd.
* 						All Rights Reserved
*	Description:fsk算法
*	Created:	        2014:09:23  18:50
*	Revision Record:    
*********************************************************************/

#ifndef _FSK_H
#define _FSK_H

#ifdef __cplusplus
extern "C" {
#endif

/*----------------------------------------*/
#ifdef _WIN32

    #ifndef FSK_LIB_EXPORTS
        #ifdef FSK_EXPORTS
#define FSK_API    __declspec(dllexport)
        #else
#define FSK_API    __declspec(dllimport)
        #endif
    #else
#define FSK_API
    #endif

#else

#define FSK_API

#endif
/*----------------------------------------*/

#include "audio_typedef.h"

/* The type of API parameters */
#undef  IN
#undef  INOUT
#undef  OUT
#define IN
#define INOUT
#define OUT

/* return enum */
typedef enum
{
	FSK_RX_END           =  2, /* 收到完整一帧物理层数据或超时 */
	FSK_RX_START         =  1, /* 开始接收完整一帧的物理层数据 */
	/* 注意：接收端每次调用fsk_rx函数输入数据过多时，容易导致  */
	/* FSK_RX_END和FSK_RX_START返回值淹没                      */
	FSK_RUN_OK           =  0, /* 正确执行                     */
	FSK_ALLOC_FAILED     = -1, /* 分配内存失败                 */
	FSK_POINTER_NULL     = -2, /* 指针为空                     */
	FSK_IN_POINTER_NULL  = -3, /* 结构体内部指针为空           */
	FSK_IN_LEN_ERROR     = -4, /* 输入长度错误                 */
	FSK_IN_CH_ERROR      = -5, /* 输入通道数错误               */
	FSK_IN_DEPTH_ERROR   = -6, /* 输入采样精度错误             */
	FSK_IN_OFFSET_ERROR  = -7, /* 输入音频间隔错误             */
	FSK_FREQ_ERROR       = -8, /* 输入频率错误                 */
    FSK_IN_SIZE_ERROR    = -9, /* 输入大小错误                 */
    FSK_IN_RTX_ERROR     = -10,/* 输入发送接收标志错误         */
	FSK_OUT_OFFSET_ERROR = -11,/* 输出音频间隔错误             */
	FSK_DATA_RATE_ERROR  = -12,/* 数据收发速率错误             */
	FSK_RX_DATA_ERROR    = -13,/* 接收数据错误                 */
	FSK_TONE_ERROR       = -14,/* 当前采样率不支持背景音功能   */
	FSK_BASE_FREQ_ERROR  = -15,/* 基频设置错误                 */
	FSK_RX_ERROR         = -16 /* 数据接收出错                 */
} FSK_RESULT;

typedef struct
{
	WORD32 frequency;  /* 音频采样频率，单位：Hz                                                                                  */
	WORD32 base_freq;  /* 收发信号基频，具体设置建议如下：(注：接收端和发送端必须相等，该参数接收端和发送端都使用)                */
					   /* 44.1KHz及以上采样率：17000，使用不能被人听见的超声波传输数据，一般会同时打开背景提示音                  */
                       /*   32KHz及以下采样率：1000，使用可以被人听见的声音传输数据                                               */
	int    out_offset; /* 输出两个音频采样点之间的间隔，单位：字节，该参数仅发送端使用，接收端无需设置                            */
	int    data_rate;  /* 数据收发速率，单位：bps，建议设为300bps(注：接收端和发送端必须相等，该参数接收端和发送端都使用)         */
	int    fsk_ctrl;   /* 控制参数，按比特配置，具体定义如下：                                                                    */
                       /* bit-0  ：=0，接收端；=1，发送端                                                                         */
                       /* bit-2~1：=00，无背景提示音；=01，使用默认的背景提示音（布谷鸟背景音）。此时，frequency必须等于44.1KHz； */
					   /* =10：使用自定义的背景提示音。此时，frequency必须大于等于44.1KHz，且输入的自定义音频必须是16位的PCM数据；*/
                       /* =其它：保留值。背景音的间隔时间约为：送入发送函数的数据字节数*10/data_rate，单位：秒。该比特位仅发送端使*/
                       /* 用，接收端无需设置                                                                                      */
                       /* other bits：保留位                                                                                      */
    AudioBuf bg_music; /* 自定义背景提示音的输入音频结构体，仅发送端在配置为使用自定义背景提示音时使用，接收端无需设置            */
} Fsk_Format;

/********************************************************************
*	Funcname: 	    	fsk_init
*	Purpose:	fsk算法内存分配和初始化
*   InputParam:   INOUT Audio_Handle *phFsk:句柄
*   OutputParam:        
*   Return:             FSK_RESULT
*   Created:	        2014:09:23  18:28
*   Revision Record:    
*********************************************************************/
FSK_API FSK_RESULT fsk_init( INOUT Audio_Handle *phFsk );

/********************************************************************
*	Funcname: 	    	fsk_setFormat
*	Purpose:	设置fsk算法
*   InputParam:      IN Fsk_Format    *pFormat:fsk算法参数
*   OutputParam:    OUT Audio_Handle  hFsk
*   Return:             FSK_RESULT
*   Created:	        2014:09:23  18:32
*   Revision Record:    
*********************************************************************/
FSK_API FSK_RESULT fsk_setFormat( OUT Audio_Handle hFsk, IN Fsk_Format *pFormat );

/********************************************************************
*	Funcname: 	    	fsk_getSize
*	Purpose:	获取fsk_rx和fsk_tx函数输出缓冲内存大小，用于库的调用者提前开辟
*               pFskOutput和pAudioDst->pData对应的内存大小，单位：字节。
*               注意：1.该函数的返回值仅用于开辟内存，安全起见，返回值可能比实际值大一些。
*                     2.fsk_init函数和fsk_setFormat函数执行后，才能调用该函数。
*   InputParam:   INOUT Audio_Handle hFsk
*                    IN int          input_size:对于发送表示本次送入发送函数的数据字节数，即fsk_tx的输入参数inLen；
*                                               对于接收表示本次送入接收函数的PCM数据时长(单位：毫秒)
*                    IN int          rx_tx_flag:0-接收，1-发送
*   OutputParam:    OUT int         *pOutLen   :输出缓冲所需内存大小，单位：字节。对于发送表示pAudioDst->pData对应的内存大小；
*                                               对于接收表示pFskOutput对应的内存大小。
*   Return:             FSK_RESULT
*   Created:	        2015:08:06  17:09
*   Revision Record:    
*********************************************************************/
FSK_API FSK_RESULT fsk_getSize( OUT Audio_Handle hFsk, IN int input_size, IN int rx_tx_flag, OUT int *pOutSize );

/********************************************************************
*	Funcname: 	    	fsk_rx
*	Purpose:	fsk接收算法（出于传输效率考虑，收发过程未做校验，请自行在上层协议中加入校验字段）
*   InputParam:   INOUT Audio_Handle hFsk
*                    IN AudioBuf    *pAudioSrc :输入音频结构体指针
*   OutputParam:    OUT WORD8       *pFskOutput:输出接收结果
*                   OUT int         *pOutLen   :本次输出数据长度
*   Return:             FSK_RESULT
*   Created:	        2014:09:23  18:35
*   Revision Record:    
*********************************************************************/
FSK_API FSK_RESULT fsk_rx( INOUT Audio_Handle hFsk, IN AudioBuf *pAudioSrc, OUT UWORD8 *pFskOutput, OUT int *pOutLen );

/********************************************************************
*	Funcname: 	    	fsk_tx
*	Purpose:	fsk发送算法（出于传输效率考虑，收发过程未做校验，请自行在上层协议中加入校验字段）
*   InputParam:   INOUT Audio_Handle hFsk
*                    IN WORD8       *pFskInput:输入发送数据
*                    IN int          inLen    :输入发送数据字节数，有效值：1 - 32767
*   OutputParam:    OUT AudioBuf    *pAudioDst:输出音频结构体指针
*   Return:             FSK_RESULT
*   Created:	        2014:09:23  18:42
*   Revision Record:    
*********************************************************************/
FSK_API FSK_RESULT fsk_tx( INOUT Audio_Handle hFsk, IN UWORD8 *pFskInput, IN int inLen, OUT AudioBuf *pAudioDst );

/********************************************************************
*	Funcname: 	    	fsk_deInit
*	Purpose:	fsk算法内存销毁
*   InputParam:   INOUT Audio_Handle *phFsk
*   OutputParam:        
*   Return:             FSK_RESULT
*   Created:	        2014:09:23  18:31
*   Revision Record:    
*********************************************************************/
FSK_API FSK_RESULT fsk_deInit( INOUT Audio_Handle *phFsk );

#ifdef __cplusplus
}
#endif

#endif

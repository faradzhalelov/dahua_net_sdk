/********************************************************************
*	File Name: 	        audio_typedef.h	
*	Author:             qiao gang
*	Copyright 1992-2013, ZheJiang Dahua Technology Stock Co.Ltd.
* 						All Rights Reserved
*	Description:音频处理公用类型定义头文件
*	Created:	        2013:04:23  09:39
*	Revision Record:    
*********************************************************************/

#ifndef _AUDIO_TYPEDEF_H
#define _AUDIO_TYPEDEF_H

typedef   signed char        WORD8;
typedef unsigned char       UWORD8;
typedef   signed short       WORD16;
typedef unsigned short      UWORD16;
typedef   signed int         WORD32;
typedef unsigned int        UWORD32;

#ifdef _WIN32
typedef   signed __int64     WORD64;
typedef unsigned __int64    UWORD64;
#define INLINE_T            __inline
#else
typedef   signed long long   WORD64;
typedef unsigned long long  UWORD64;
#define INLINE_T            inline
#endif

typedef void* Audio_Handle;

typedef struct /* 音频处理数据结构 */
{
    void      *pData;    /* 音频数据起始地址                     */
    WORD32     frequency;/* 采样频率，单位：Hz                   */
    int        dataLen;  /* 数据长度，单位：字节                 */
    int        depth;    /* 采样深度(精度)，单位：bit            */
    int        offset;   /* 两个音频采样点之间的间隔，单位：字节 */
    int        channels; /* 通道数                               */
} AudioBuf;

#endif

//
//  PlayStream.hpp
//  NetSDK_Demo
//
//  Created by jiangcp on 2017/5/6.
//  Copyright © 2017年 NetSDK. All rights reserved.
//

#ifndef PlayStream_hpp
#define PlayStream_hpp

#include "playEx.h"
#include "netsdk.h"
#include <stdio.h>

class CPlayStream
{
public:
    CPlayStream();
    ~CPlayStream();
    BOOL StartPlay(HWND hPlayWnd,DWORD dwMode);
    BOOL InputData(PBYTE pBuf, DWORD nSize);
    BOOL SetPlaySpeed(float fspeed);
    BOOL SetPlayBackSpeed();
    BOOL PausePlay(bool bPause);
    void StopPlay();
    BOOL GetOSDTime(NET_TIME *pstuTime);
    BOOL SnapPicture(char *sFileName, tPicFormats ePicFormat);
private:
    int m_nPort;
    BOOL m_bHasStart;
};

#endif /* PlayStream_hpp */

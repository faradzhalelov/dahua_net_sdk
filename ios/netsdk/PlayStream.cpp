//
//  PlayStream.cpp
//  NetSDK_Demo
//
//  Created by jiangcp on 2017/5/6.
//  Copyright © 2017年 NetSDK. All rights reserved.
//

#include "PlayStream.hpp"

CPlayStream::CPlayStream()
{
    m_nPort = 0;
    m_bHasStart = FALSE;
}

CPlayStream::~CPlayStream()
{
    StopPlay();
}

BOOL CPlayStream::StartPlay(HWND hPlayWnd,DWORD dwMode)
{
    if (TRUE == m_bHasStart)
    {
        return FALSE;
    }
    
    PLAY_GetFreePort(&m_nPort);
    PLAY_SetStreamOpenMode(m_nPort, dwMode);
    PLAY_OpenStream(m_nPort, NULL, 0, 2*1024*1024);
    BOOL bRet = PLAY_Play(m_nPort, hPlayWnd);
    PLAY_PlaySoundShare(m_nPort);
    
    m_bHasStart = TRUE;
    return bRet;
}
BOOL CPlayStream::GetOSDTime(NET_TIME *pstuTime)
{
    if (NULL == pstuTime)
    {
        return FALSE;
    }
    
    if (!m_bHasStart)
    {
        return FALSE;
    }
    struct TimeInfo
    {
        int year;
        int month;
        int day;
        int hour;
        int minute;
        int second;
    } ti = {0};
    int retlen = 0;
    BOOL bRet = PLAY_QueryInfo(m_nPort, PLAY_CMD_GetTime, (char *)&ti, sizeof(TimeInfo), &retlen);
    
    pstuTime->dwYear = ti.year;
    pstuTime->dwMonth = ti.month;
    pstuTime->dwDay = ti.day;
    pstuTime->dwHour = ti.hour;
    pstuTime->dwMinute = ti.minute;
    pstuTime->dwSecond = ti.second;
    return bRet;
}

void CPlayStream::StopPlay()
{
    if (m_bHasStart)
    {
        
        PLAY_StopSound();
        PLAY_CleanScreen(m_nPort, 236/255.0, 236/255.0, 244/255.0, 1, 0);
        PLAY_Stop(m_nPort);
        PLAY_CloseStream(m_nPort);
        m_bHasStart = FALSE;
    }
}

BOOL CPlayStream::SetPlayBackSpeed()
{
    if (m_bHasStart)
    {
        return PLAY_SetPlaySpeed(m_nPort, 8.0);
    }
    
    return FALSE;
}

BOOL CPlayStream::SetPlaySpeed(float fspeed)
{
    if (m_bHasStart)
    {
        return PLAY_SetPlaySpeed(m_nPort, fspeed);
    }
    
    return FALSE;
}
BOOL CPlayStream::PausePlay(bool bPause)
{
    if (!m_bHasStart)
    {
        return FALSE;
    }
    
    if (true == bPause)
    {
        return PLAY_Pause(m_nPort, TRUE);
    }
    else
    {
        return PLAY_Pause(m_nPort, FALSE);
    }
}

BOOL CPlayStream::InputData(PBYTE pBuf, DWORD nSize)
{
    return PLAY_InputData(m_nPort, pBuf, nSize);
}

BOOL CPlayStream::SnapPicture(char *sFileName, tPicFormats ePicFormat)
{
    return PLAY_CatchPicEx(m_nPort, sFileName, ePicFormat);
}

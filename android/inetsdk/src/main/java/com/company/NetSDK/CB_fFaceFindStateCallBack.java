package com.company.NetSDK;

public interface CB_fFaceFindStateCallBack {
    public void invoke(long lLoginID, long lAttachHandle, NET_CB_FACE_FIND_STATE pstStates, int nStateNum);
}

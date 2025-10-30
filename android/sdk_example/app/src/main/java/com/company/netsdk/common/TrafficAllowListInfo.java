package com.company.netsdk.common;

import com.company.NetSDK.NET_TIME;

public class TrafficAllowListInfo {
    private String nRecordNo;
    private String szMasterOfCar;
    private String szPlateNumber;
    private String stBeginTime;
    private String stCancelTime;
    private String bAuthorityEnable;

    public TrafficAllowListInfo(String nRecordNo, String szMasterOfCar, String szPlateNumber, String stBeginTime, String stCancelTime, String bAuthorityEnable) {
        this.nRecordNo = nRecordNo;
        this.szMasterOfCar = szMasterOfCar;
        this.szPlateNumber = szPlateNumber;
        this.stBeginTime = stBeginTime;
        this.stCancelTime = stCancelTime;
        this.bAuthorityEnable = bAuthorityEnable;
    }

    public TrafficAllowListInfo(String szMasterOfCar, String szPlateNumber, String stBeginTime, String stCancelTime, String bAuthorityEnable) {
        this.szMasterOfCar = szMasterOfCar;
        this.szPlateNumber = szPlateNumber;
        this.stBeginTime = stBeginTime;
        this.stCancelTime = stCancelTime;
        this.bAuthorityEnable = bAuthorityEnable;
    }

    public String getnRecordNo() {
        return nRecordNo;
    }

    public void setnRecordNo(String nRecordNo) {
        this.nRecordNo = nRecordNo;
    }

    public String getSzMasterOfCar() {
        return szMasterOfCar;
    }

    public void setSzMasterOfCar(String szMasterOfCar) {
        this.szMasterOfCar = szMasterOfCar;
    }

    public String getSzPlateNumber() {
        return szPlateNumber;
    }

    public void setSzPlateNumber(String szPlateNumber) {
        this.szPlateNumber = szPlateNumber;
    }

    public String getStBeginTime() {
        return stBeginTime;
    }

    public void setStBeginTime(String stBeginTime) {
        this.stBeginTime = stBeginTime;
    }

    public String getStCancelTime() {
        return stCancelTime;
    }

    public void setStCancelTime(String stCancelTime) {
        this.stCancelTime = stCancelTime;
    }

    public String getbAuthorityEnable() {
        return bAuthorityEnable;
    }

    public void setbAuthorityEnable(String bAuthorityEnable) {
        this.bAuthorityEnable = bAuthorityEnable;
    }

    @Override
    public String toString() {
        return "TrafficAllowListInfo{" +
                "nRecordNo='" + nRecordNo + '\'' +
                ", szMasterOfCar='" + szMasterOfCar + '\'' +
                ", szPlateNumber='" + szPlateNumber + '\'' +
                ", stBeginTime='" + stBeginTime + '\'' +
                ", stCancelTime='" + stCancelTime + '\'' +
                ", bAuthorityEnable='" + bAuthorityEnable + '\'' +
                '}';
    }
}

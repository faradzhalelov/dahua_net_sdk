package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief SDK_MEDIA_QUERY_TRAFFICCAR_EX Check out the file information
 * \else
 * @brief SDK_MEDIA_QUERY_TRAFFICCAR_EX查询出来的文件信息
 * \endif
 */
public class MEDIAFILE_TRAFFICCAR_INFO_EX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Basic Information
     * \else
     *  基本信息
     * \endif
     */
    public MEDIAFILE_TRAFFICCAR_INFO					stuInfo = new MEDIAFILE_TRAFFICCAR_INFO();

    /**
     * \if ENGLISH_LANG
     *  Device Address
     * \else
     *  设备地址
     * \endif
     */
    public byte					szDeviceAddr[] = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     *  Vehicle identification, such as "Unknown" - unknown, "Audi" - Audi, "Honda" - Honda ..
     * \else
     *  车辆标识, 例如 "Unknown"-未知, "Audi"-奥迪, "Honda"-本田...
     * \endif
     */
    public byte					szVehicleSign[] = new byte[FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     *  self defined parking space number, for parking, 
     * \else
     *  自定义车位号（停车场用）
     * \endif
     */
    public byte					szCustomParkNo[] = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     *  Specifies the sub-brand of vehicle,the real value can be found in a mapping table from the development manual
     * \else
     *  车辆子品牌，需要通过映射表得到真正的子品牌
     * \endif
     */
    public short					wVehicleSubBrand;

    /**
     * \if ENGLISH_LANG
     *  Specifies the model years of vehicle. the real value can be found in a mapping table from the development manual
     * \else
     *  车辆年款，需要通过映射表得到真正的年款
     * \endif
     */
    public short					wVehicleYearModel;

    /**
     * \if ENGLISH_LANG
     *  corresponding to throughTime in electronic tag info
     * \else
     *  对应电子车牌标签信息中的过车时间(ThroughTime)
     * \endif
     */
    public NET_TIME					stuEleTagInfoUTC = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  record or snapshot file mark ,{@link EM_RECORD_SNAP_FLAG_TYPE}
     * \else
     *  录像或抓图文件标志 ,{@link EM_RECORD_SNAP_FLAG_TYPE}
     * \endif
     */
    public int					emFlagLists[] = new int[EM_RECORD_SNAP_FLAG_TYPE.FLAG_TYPE_MAX];

    /**
     * \if ENGLISH_LANG
     *  mark total
     * \else
     *  标志总数
     * \endif
     */
    public int					nFalgCount;

    /**
     * \if ENGLISH_LANG
     *  safe belt state,{@link EM_SAFE_BELT_STATE}
     * \else
     *  安全带状态,{@link EM_SAFE_BELT_STATE}
     * \endif
     */
    public int					emSafeBelSate;

    /**
     * \if ENGLISH_LANG
     *  calling state,{@link EM_CALLING_STATE}
     * \else
     *  打电话状态,{@link EM_CALLING_STATE}
     * \endif
     */
    public int					emCallingState;

    /**
     * \if ENGLISH_LANG
     *  the count of attachment
     * \else
     *  车内物品个数
     * \endif
     */
    public int					nAttachMentNum;

    /**
     * \if ENGLISH_LANG
     *  attachment info
     * \else
     *  车内物品信息
     * \endif
     */
    public NET_ATTACH_MENET_INFO					stuAttachMent[] = new NET_ATTACH_MENET_INFO[FinalVar.MAX_ATTACHMENT_NUM];

    /**
     * \if ENGLISH_LANG
     *  the country about the plate
     * \else
     *  车牌所属国家和地区
     * \endif
     */
    public byte					szCountry[] = new byte[FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     *  car type,{@link EM_CATEGORY_TYPE}
     * \else
     *  车辆类型,{@link EM_CATEGORY_TYPE}
     * \endif
     */
    public int					emCarType;

    /**
     * \if ENGLISH_LANG
     *  sun shade state,{@link NET_SUNSHADE_STATE}
     * \else
     *  遮阳板状态,{@link NET_SUNSHADE_STATE}
     * \endif
     */
    public int					emSunShadeState;

    /**
     * \if ENGLISH_LANG
     * smoking state,{@link EM_SMOKING_STATE}
     * \else
     *  是否抽烟,{@link EM_SMOKING_STATE}
     * \endif
     */
    public int					emSmokingState;

    /**
     * \if ENGLISH_LANG
     *  the count of annual inspections
     * \else
     *  年检标个数
     * \endif
     */
    public int					nAnnualInspection;

    /**
     * \if ENGLISH_LANG
     *  PictureID high 4 bytes
     * \else
     *  PictureID高四字节
     * \endif
     */
    public int					nPicIDHigh;

    /**
     * \if ENGLISH_LANG
     *  PictureID low 4 bytes
     * \else
     *  PictureID低四字节
     * \endif
     */
    public int					nPicIDLow;

    /**
     * \if ENGLISH_LANG
     *  The client 1 upload information
     * \else
     *  平台客户端1上传信息
     * \endif
     */
    public NET_UPLOAD_CLIENT_INFO					stuClient1 = new NET_UPLOAD_CLIENT_INFO();

    /**
     * \if ENGLISH_LANG
     *  The client 2 upload information
     * \else
     *  平台客户端2上传信息
     * \endif
     */
    public NET_UPLOAD_CLIENT_INFO					stuClient2 = new NET_UPLOAD_CLIENT_INFO();

    /**
     * \if ENGLISH_LANG
     *  Three places license plate
     * \else
     *  三地车牌
     * \endif
     */
    public byte					szExtraPlateNumber[][] = new byte[3][32];

    /**
     * \if ENGLISH_LANG
     *  Number of license plates	
     * \else
     *  车牌个数
     * \endif
     */
    public int					nExtraPlateNumberNum;

    /**
     * \if ENGLISH_LANG
     *   Vehicle entry time, time format: UTC time 
     * \else
     *   车辆进站时间，时间格式：UTC时间
     * \endif
     */
    public int					nEntranceTime;

    /**
     * \if ENGLISH_LANG
     *   Vehicle refueling time, time format: UTC time 
     * \else
     *   车辆加油时间，时间格式：UTC时间
     * \endif
     */
    public int					nOilTime;

    /**
     * \if ENGLISH_LANG
     *  Vehicle exit time, time format: UTC time 
     * \else
     *  车辆出站时间，时间格式：UTC时间
     * \endif
     */
    public int					nExitTime;

    /**
     * \if ENGLISH_LANG
     *  TRUE means only stuStartTimeRealUTC and stuEndTimeRealUTC are valid (only stuStartTimeRealUTC and stuEndTimeRealUTC are used), FALSE means only starttime and endtime are valid (only starttime and endtime are used, starttime and endtime are in MEDIAFILE_TRAFFICCAR_INFO)
     * \else
     *  为TRUE表示仅stuStartTimeRealUTC和stuEndTimeRealUTC有效(仅使用stuStartTimeRealUTC和stuEndTimeRealUTC), 为FALSE表示仅starttime和endtime有效(仅使用starttime和endtime, starttime和endtime在MEDIAFILE_TRAFFICCAR_INFO中)
     * \endif
     */
    public boolean					bRealUTC;

    /**
     * \if ENGLISH_LANG
     *  UTC start time (standard UTC time), paired with stuEndTimeRealUTC
     * \else
     *  UTC开始时间(标准UTC时间), 与stuEndTimeRealUTC配对使用
     * \endif
     */
    public NET_TIME					stuStartTimeRealUTC = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  UTC end time (standard UTC time), paired with stuStartTimeRealUTC
     * \else
     *  UTC结束时间(标准UTC时间), 与stuStartTimeRealUTC配对使用
     * \endif
     */
    public NET_TIME					stuEndTimeRealUTC = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * License plate picture information
     * \else
     * 车牌图片信息
     * \endif
     */
    public NET_PLATE_IMAGE_INFO					stuPlateImageInfo = new NET_PLATE_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     * car body picture information
     * \else
     * 车身图片信息
     * \endif
     */
    public NET_CARBODY_IMAGE_INFO					stuCarBodyImageInfo = new NET_CARBODY_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     * Plate code
     * \else
     * 车牌代码
     * \endif
     */
    public byte					szPlateCode[] = new byte[16];

    public MEDIAFILE_TRAFFICCAR_INFO_EX() {
        for(int i = 0; i < FinalVar.MAX_ATTACHMENT_NUM; i ++) {
            this.stuAttachMent[i] = new NET_ATTACH_MENET_INFO();
        }
    }
}
package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * expansion of personnel information
 * \else
 * 人员信息扩展
 * \endif
 */
public class FACERECOGNITION_PERSON_INFOEX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * person name
     * \else
     * 姓名
     * \endif
     */
    public byte                		szPersonName[] = new byte[FinalVar.SDK_MAX_PERSON_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * birth year, fill 0 is invalid, when is as a query condition
     * \else
     * 出生年,作为查询条件时,此参数填0,则表示此参数无效
     * \endif
     */
    public short                		wYear;

    /**
     * \if ENGLISH_LANG
     * birth month, fill 0 is invalid, when is as a query condition
     * \else
     * 出生月,作为查询条件时,此参数填0,则表示此参数无效
     * \endif
     */
    public byte                		byMonth;

    /**
     * \if ENGLISH_LANG
     * birth day, fill 0 is invalid, when is as a query condition
     * \else
     * 出生日,作为查询条件时,此参数填0,则表示此参数无效
     * \endif
     */
    public byte                		byDay;

    /**
     * \if ENGLISH_LANG
     * importance level,1~10,the higher value the higher level. fill 0 is invalid, when is as a query condition
     * \else
     * 人员重要等级,1~10,数值越高越重要,作为查询条件时,此参数填0,则表示此参数无效
     * \endif
     */
    public byte                		bImportantRank;

    /**
     * \if ENGLISH_LANG
     * sex, 0-man, 1-female. fill 0 is invalid, when is as a query condition
     * \else
     * 性别,1-男,2-女,作为查询条件时,此参数填0,则表示此参数无效
     * \endif
     */
    public byte                		bySex;

    /**
     * \if ENGLISH_LANG
     * the unicle ID for the person
     * \else
     * 人员唯一标示(证件号码,工号,或其他编号)
     * \endif
     */
    public byte                		szID[] = new byte[FinalVar.SDK_MAX_PERSON_ID_LEN];

    /**
     * \if ENGLISH_LANG
     * picture number
     * \else
     * 图片张数
     * \endif
     */
    public short                		wFacePicNum;

    /**
     * \if ENGLISH_LANG
     * picture info
     * \else
     * 当前人员对应的图片信息
     * \endif
     */
    public SDK_PIC_INFO         		szFacePicInfo[] = new SDK_PIC_INFO[FinalVar.SDK_MAX_PERSON_IMAGE_NUM];

    /**
     * \if ENGLISH_LANG
     * Personnel types, see {@link EM_PERSON_TYPE}
     * \else
     * 人员类型,详见 {@link EM_PERSON_TYPE}
     * \endif
     */
    public byte                		byType;

    /**
     * \if ENGLISH_LANG
     * Document types, see {@link EM_CERTIFICATE_TYPE}
     * \else
     * 证件类型,详见 {@link EM_CERTIFICATE_TYPE}
     * \endif
     */
    public byte                		byIDType;

    /**
     * \if ENGLISH_LANG
     * Whether wear glasses or not,0-unknown,1-not wear glasses,2-wear glasses
     * \else
     * 是否戴眼镜，0-未知 1-不戴 2-戴
     * \endif
     */
    public byte						byGlasses;

    /**
     * \if ENGLISH_LANG
     * Age,0 means unknown
     * \else
     * 年龄,0表示未知
     * \endif
     */
    public byte                		byAge;

    /**
     * \if ENGLISH_LANG
     * province
     * \else
     * 省份
     * \endif
     */
    public byte                		szProvince[] = new byte[FinalVar.SDK_MAX_PROVINCE_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * city
     * \else
     * 城市
     * \endif
     */
    public byte                		szCity[] = new byte[FinalVar.SDK_MAX_CITY_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * person unique ID
     * \else
     * 人员唯一标识符,首次由服务端生成,区别于ID字段, 修改,删除操作时必填
     * \endif
     */
    public byte                		szUID[] = new byte[FinalVar.SDK_MAX_PERSON_ID_LEN];

    /**
     * \if ENGLISH_LANG
     * country
     * \else
     * 国籍,符合ISO3166规范
     * \endif
     */
    public byte						szCountry[] = new byte[FinalVar.NET_COUNTRY_LENGTH];

    /**
     * \if ENGLISH_LANG
     * using person type: 0 using byType, 1 using CustomType
     * \else
     * 人员类型是否为自定义: 0 使用Type规定的类型 1 自定义,使用szCustomType字段
     * \endif
     */
    public byte						byIsCustomType;

    /**
     * \if ENGLISH_LANG
     * type of person
     * \else
     * 人员自定义类型
     * \endif
     */
    public byte						szCustomType[] = new byte[FinalVar.SDK_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * comment info
     * \else
     * 备注信息
     * \endif
     */
    public byte						szComment[] = new byte[FinalVar.NET_COMMENT_LENGTH];

    /**
     * \if ENGLISH_LANG
     * group ID
     * \else
     * 人员所属组ID
     * \endif
     */
    public byte						szGroupID[] = new byte[FinalVar.NET_GROUPID_LENGTH];

    /**
     * \if ENGLISH_LANG
     * group name
     * \else
     * 人员所属组名, 用户自己申请内存的情况时,
     * \endif
     */
    public byte						szGroupName[] = new byte[FinalVar.NET_GROUPNAME_LENGTH];

    /**
     * \if ENGLISH_LANG
     * Emotion, refer to {@link EM_DEV_EVENT_FACEDETECT_FEATURE_TYPE}
     * \else
     * 表情, 参考 {@link EM_DEV_EVENT_FACEDETECT_FEATURE_TYPE}
     * \endif
     */
    public int	                         emEmotion;

    /**
     * \if ENGLISH_LANG
     * home address of the person
     * \else
     * 注册人员家庭地址
     * \endif
     */
    public byte						szHomeAddress[] = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * glasses type, refer to {@link EM_GLASSES_TYPE}
     * \else
     * 眼镜类型, 参考 {@link EM_GLASSES_TYPE}
     * \endif
     */
    public int				             emGlassesType;

    /**
     * \if ENGLISH_LANG
     * eye state, refer to {@link EM_EYE_STATE_TYPE}
     * \else
     * 眼睛状态, 参考 {@link EM_EYE_STATE_TYPE}
     * \endif
     */
    public int			                 emEye;

    /**
     * \if ENGLISH_LANG
     * mouth state, refer to {@link EM_MOUTH_STATE_TYPE}
     * \else
     * 嘴巴状态, 参考 {@link EM_MOUTH_STATE_TYPE}
     * \endif
     */
    public int			                 emMouth;

    /**
     * \if ENGLISH_LANG
     * mask state, refer to {@link EM_MASK_STATE_TYPE}
     * \else
     * 口罩状态, 参考 {@link EM_MASK_STATE_TYPE}
     * \endif
     */
    public int 			             emMask;

    /**
     * \if ENGLISH_LANG
     * beard state, refer to {@link EM_BEARD_STATE_TYPE}
     * \else
     * 胡子状态, 参考 {@link EM_BEARD_STATE_TYPE}
     * \endif
     */
    public int			                 emBeard;

    /**
     * \if ENGLISH_LANG
     * attractive, -1:invalid, 0:unknown，1-100
     * \else
     * 魅力值, -1表示无效, 0未识别，识别时范围1-100,得分高魅力高
     * \endif
     */
    public int							nAttractive;

    /**
     * \if ENGLISH_LANG
     * person feature state, refr to {@link EM_PERSON_FEATURE_STATE}
     * \else
     * 人员建模状态, 参考 {@link EM_PERSON_FEATURE_STATE}
     * \endif
     */
    public int		                  emFeatureState;

    /**
     * \if ENGLISH_LANG
     * age range is enabled
     * \else
     * 是否指定年龄段
     * \endif
     */
    public boolean                		bAgeEnable;

    /**
     * \if ENGLISH_LANG
     * age range
     * \else
     * 年龄范围
     * \endif
     */
    public int                 		nAgeRange[] = new int[2];

    /**
     * \if ENGLISH_LANG
     * invalid number in array emEmotion, 0 means all emotion
     * \else
     * 目标特征数组有效个数,与 emFeature 结合使用, 如果为0则表示查询所有表情
     * \endif
     */
    public int							nEmotionValidNum;

    /**
     * \if ENGLISH_LANG
     * human emotion  set the query condition
     * refer to {@link EM_DEV_EVENT_FACEDETECT_FEATURE_TYPE}
     * \else
     * 目标特征数组,与 byFeatureValidNum 结合使用  设置查询条件的时候使用
     * 参考 {@link EM_DEV_EVENT_FACEDETECT_FEATURE_TYPE}
     * \endif
     */
    public int                      emEmotions[] = new int[FinalVar.SDK_MAX_FACEDETECT_FEATURE_NUM];

    /**
     * \if ENGLISH_LANG
     * extension number of registered personnel information
     * \else
     * 注册人员信息扩展个数
     * \endif
     */
    public int                		nCustomPersonInfoNum;

    /**
     * \if ENGLISH_LANG
     * extension of registered personnel information
     * \else
     * 注册人员信息扩展
     * \endif
     */
    public CUSTOM_PERSON_INFO        szCustomPersonInfo[] = new CUSTOM_PERSON_INFO[FinalVar.SDK_MAX_CUSTOM_PERSON_INFO_NUM];

    /**
     * \if ENGLISH_LANG
     * type of register face DB
     * \else
     * 注册库类型
     * \endif
     */
    public int                     emRegisterDbType;

    /**
     * \if ENGLISH_LANG
     * effective time
     * \else
     * 有效期时间
     * \endif
     */
    public NET_TIME                 stuEffectiveTime = new NET_TIME();
    //
    /**
     * \if ENGLISH_LANG
     * error code of person feature
     * \else
     *建模失败原因
     * \endif
     */
    public int                      emFeatureErrCode;

    /**
     * \if ENGLISH_LANG
     *  Number of face pictures
     * \else
     *  目标图片张数
     * \endif
     */
    public int					wFacePicNumEx;

    /**
     * \if ENGLISH_LANG
     *  The picture information corresponding to the current person. It is an extension of szFacePicInfo. This field will be used first in the future
     * \else
     *  当前人员对应的图片信息
     * \endif
     */
    public NET_FACE_PIC_INFO					szFacePicInfoEx[] = new NET_FACE_PIC_INFO[6];

    /**
     * \if ENGLISH_LANG
     *  Personnel characteristics information
     * \else
     *  人员特征信息
     * \endif
     */
    public NET_PERSON_FEATURE_VALUE_INFO					stuPersonFeatureValue = new NET_PERSON_FEATURE_VALUE_INFO();

    /**
     * \if ENGLISH_LANG
     *  person frozen status
     * \else
     *  人员冻结状态
     * \endif
     */
    public boolean					bFrozenStatus;

    /**
     * \if ENGLISH_LANG
     *  alarm frequency info
     * \else
     *  频次报警信息
     * \endif
     */
    public NET_PERSON_FREQUENCY_INFO					stuFrequencyInfo = new NET_PERSON_FREQUENCY_INFO();

    /**
     * \if ENGLISH_LANG
     *  The platform uniquely identifies the face field, which is different from UID . According to the capability of faceRecognitionServer.getCaps, IVSS supports UUID when the value of SupportIDFromServer is true.
     * \else
     *  平台唯一标识目标字段，区别于UID,IVSS根据faceRecognitionServer.getCaps能力，SupportIDFromServer值为true时，支持UUID有效
     * \endif
     */
    public byte					szUUID[] = new byte[64];

    public FACERECOGNITION_PERSON_INFOEX() {
        for(int i = 0; i < FinalVar.SDK_MAX_PERSON_IMAGE_NUM; i++) {
            szFacePicInfo[i] = new SDK_PIC_INFO();
        }

        for(int i = 0; i < FinalVar.SDK_MAX_CUSTOM_PERSON_INFO_NUM; i++) {
            szCustomPersonInfo[i] = new CUSTOM_PERSON_INFO();
        }

        for(int i = 0; i < 6; i++) {
            szFacePicInfoEx[i] = new NET_FACE_PIC_INFO();
        }
    }
}

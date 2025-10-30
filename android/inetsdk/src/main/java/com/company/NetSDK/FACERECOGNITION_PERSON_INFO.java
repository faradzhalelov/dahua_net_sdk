package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * person info
 * \else
 * 人员信息
 * \endif
 */
public class FACERECOGNITION_PERSON_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 *  name
	 * \else
	 * 姓名，此参数作废
	 * \endif
	 */
	public byte           	szPersonName[] 		= new byte[FinalVar.SDK_MAX_NAME_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * birth year
	 * \else
	 * 出生年，作为查询条件时，此参数填0，则表示此参数无效
	 * \endif
	 */
	public short				wYear;
	
	/**
	 * \if ENGLISH_LANG
	 * birth month
	 * \else
	 * 出生月，作为查询条件时，此参数填0，则表示此参数无效
	 * \endif
	 */
	public byte				byMonth; 
	
	/**
	 * \if ENGLISH_LANG
	 * birth day
	 * \else
	 * 出生日，作为查询条件时，此参数填0，则表示此参数无效
	 * \endif
	 */
	public byte				byDay; 
	
	/**
	 * \if ENGLISH_LANG
	 * the unicle ID for the person
	 * \else
	 * 人员唯一标示(证件号码，工号，或其他编号)
	 * \endif
	 */
	public byte      		szID[] 				= new byte[FinalVar.SDK_MAX_PERSON_ID_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * importance level,1~10,the higher value the higher level
	 * \else
	 * 人员重要等级,1~10，数值越高越重要，作为查询条件时，此参数填0，则表示此参数无效
	 * \endif
	 */
	public byte          	bImportantRank; 
	
	/**
	 * \if ENGLISH_LANG
	 * sex, 0-man, 1-female
	 * \else
	 * 性别，1-男，2-女，作为查询条件时，此参数填0，则表示此参数无效
	 * \endif
	 */
	public byte          	bySex; 
	
	/**
	 * \if ENGLISH_LANG
	 * picture number
	 * \else
	 * 图片张数
	 * \endif
	 */
	public short           	wFacePicNum;
	
	/**
	 * \if ENGLISH_LANG
	 * picture info
	 * \else
	 * 当前人员对应的图片信息
	 * \endif
	 */
	public SDK_PIC_INFO  	szFacePicInfo[] 	= new SDK_PIC_INFO[FinalVar.SDK_MAX_PERSON_IMAGE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Personnel types, see {@link EM_PERSON_TYPE}
	 * \else
	 * 人员类型，详见 {@link EM_PERSON_TYPE}
	 * \endif
	 */
	public byte          	byType; 
	
	/**
	 * \if ENGLISH_LANG
	 * Document types, see {@link EM_CERTIFICATE_TYPE}
	 * \else
	 * 证件类型，详见 {@link EM_CERTIFICATE_TYPE}
	 * \endif
	 */
	public byte            byIDType;

	/**
	 * \if ENGLISH_LANG
	 * Whether wear glasses or not,0-unknown,1-not wear glasses,2-wear glasses
	 * \else
	 * 是否戴眼镜，0-未知 1-不戴 2-戴
	 * \endif
	 */
	public byte			byGlasses;

	/**
	 * \if ENGLISH_LANG
	 * Age,0 means unknown
	 * \else
	 * 年龄,0表示未知
	 * \endif
	 */
	public byte            byAge;

	/**
	 * \if ENGLISH_LANG
	 * province
	 * \else
	 * 省份
	 * \endif
	 */
	public byte         	szProvince[] 		= new byte[FinalVar.SDK_MAX_PROVINCE_NAME_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * city
	 * \else
	 * 城市
	 * \endif
	 */
	public byte          	szCity[] 			= new byte[FinalVar.SDK_MAX_CITY_NAME_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Name, the name is too long due to the presence of 16 bytes can not be Storage problems, the increase in this parameter
	 * \else
	 * 姓名，因存在姓名过长，16字节无法存放问题，故增加此参数，
	 * \endif
	 */
	public byte          	szPersonNameEx[] 	= new byte[FinalVar.SDK_MAX_PERSON_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * person unique ID
	 * \else
	 * 人员唯一标识符,首次由服务端生成,区别于ID字段, 修改,删除操作时必填
	 * \endif
	 */
	public byte[]          szUID = new byte[FinalVar.SDK_MAX_PERSON_ID_LEN];

	/**
	 * \if ENGLISH_LANG
	 * country
	 * \else
	 * 国籍,符合ISO3166规范
	 * \endif
	 */
	public byte[]			szCountry = new byte[FinalVar.NET_COUNTRY_LENGTH];

	/**
	 * \if ENGLISH_LANG
	 * using person type: 0 using byType, 1 using szPersonName
	 * \else
	 * 人员类型是否为自定义: 0 使用Type规定的类型 1 自定义,使用szPersonName字段
	 * \endif
	 */
	public byte			byIsCustomType;

	/**
	 * \if ENGLISH_LANG
	 * comment info
	 * \else
	 * 备注信息
	 * \endif
	 */
	public String 			pszComment;

	/**
	 * \if ENGLISH_LANG
	 * Group ID
	 * \else
	 * 人员所属组ID
	 * \endif
	 */
	public String			pszGroupID;

	/**
	 * \if ENGLISH_LANG
	 * Group Name
	 * \else
	 * 人员所属组名
	 * \endif
	 */
	public String			pszGroupName;

	/**
	 * \if ENGLISH_LANG
	 * the face feature
	 * \else
	 * 目标特征
	 * \endif
	 */
	public String			pszFeatureValue;

	/**
	 * \if ENGLISH_LANG
	 * Emotion, refer to {@link EM_DEV_EVENT_FACEDETECT_FEATURE_TYPE}
	 * \else
	 * 表情, 参考 {@link EM_DEV_EVENT_FACEDETECT_FEATURE_TYPE}
	 * \endif
	 */
	public int				emEmotion;
	
	public FACERECOGNITION_PERSON_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_PERSON_IMAGE_NUM; i++) {
			szFacePicInfo[i] = new SDK_PIC_INFO();
		}
	}

	@Override
	public String toString() {
		return "FACERECOGNITION_PERSON_INFO{" +
				"szPersonName=" + Arrays.toString(szPersonName) +
				", wYear=" + wYear +
				", byMonth=" + byMonth +
				", byDay=" + byDay +
				", szID=" + Arrays.toString(szID) +
				", bImportantRank=" + bImportantRank +
				", bySex=" + bySex +
				", wFacePicNum=" + wFacePicNum +
				", szFacePicInfo=" + Arrays.toString(szFacePicInfo) +
				", byType=" + byType +
				", byIDType=" + byIDType +
				", byGlasses=" + byGlasses +
				", byAge=" + byAge +
				", szProvince=" + Arrays.toString(szProvince) +
				", szCity=" + Arrays.toString(szCity) +
				", szPersonNameEx=" + Arrays.toString(szPersonNameEx) +
				", szUID=" + Arrays.toString(szUID) +
				", szCountry=" + Arrays.toString(szCountry) +
				", byIsCustomType=" + byIsCustomType +
				", pszComment='" + pszComment + '\'' +
				", pszGroupID='" + pszGroupID + '\'' +
				", pszGroupName='" + pszGroupName + '\'' +
				", pszFeatureValue='" + pszFeatureValue + '\'' +
				", emEmotion=" + emEmotion +
				'}';
	}
}

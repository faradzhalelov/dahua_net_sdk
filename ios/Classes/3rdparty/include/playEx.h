#ifndef _PLAY_EX_H
#define _PLAY_EX_H

#include "play.h"

#ifdef	__cplusplus
extern "C" {
#endif

/***********************************************************************************************/
/* ��������																					   */
/***********************************************************************************************/

#define PIC_BMP_32                      0       // BMP32
#define PIC_BMP_24                      1       // BMP24

/* ��SVAC��� */
#define SVC_LAYER_BASE					0x0001	// SVAC������
#define SVC_LAYER_ENHANCE				0x0002	// SVAC��ǿ��
#define MAX_CUSTOM_EXT_COUNT            8
#define MAX_EXT_ROI_REGION_NUM          32		// ���ROI������չ�ĸ���    
#define MAX_EXT_EVENT_REGION_NUM        32		// ������¼���չ�ĸ���
#define MAX_EXT_ALERT_NUM               32		// ����ر�����չ�ĸ���
#define EXT_TYPE_ROI					0x0001  // ROI������չ
#define EXT_TYPE_TIME					0x0002  // ����ʱ����չ
#define EXT_TYPE_ALERT					0x0004  // ������չ
#define EXT_TYPE_EVENT					0x0008  // ����¼���չ
#define EXT_TYPE_AUTH					0x0010  // ��֤����
#define EXT_TYPE_CUSTOM					0x1000  // �Զ�����չ

/* ����΢SVAC��� */
#define ZXW_OSD_MAX_LEN					243     // ����΢OSD_DATA����ַ���
#define ZXW_OSD_TYPE_NUM				3       // ����΢OSD�����࣬Ŀǰ֧�����֣�ʱ�䡢ͨ�����ص��ע
#define MAX_CAR_RECORD_NUM				20		// �˶�����������ܽ�ͨԼ����һ�δ����������
#define CAR_PLATE_CHARACTERS			11		// �����ַ���
#define ID_NUMBER_CHAR					18		// ID�Ÿ���
#define ID_NAME_CHAR					30		// ID����������ַ���
#define ID_ARGNA_CHAR					24		// ���ַ���
#define ID_BD_CHAR						16		// ���������ַ���
#define ID_ADDRESS_CHAR					70		// ��ס��ַ�ַ���
#define ID_TIME_CHAR					19		// ʱ���ַ���
#define MAX_ID_CARD_NUM					20		// ��׼����δ�涨���Զ���ģ�������Ҫ�޸�
#define MAX_MAC_WIFI_NUM				100		// ���mac��ַ�ĸ������ö��������Ҫ�޸�
#define MAX_PG_NUM_RECORD				50		// ���Ŀ������������ö��������Ҫ�޸�

/***********************************************************************************************/
/* �ṹ�嶨��																				   */
/***********************************************************************************************/

/* ������Ϣ */
typedef struct __DATETIME_INFO
{
	unsigned int			nYear;			// ��
	unsigned int			nMonth;			// ��
	unsigned int			nDay;			// ��
	unsigned int			nHour;			// ʱ
	unsigned int			nMinute;		// ��
	unsigned int			nSecond;		// ��
	unsigned int			nMilliSecond;	// ����
}DATETIME_INFO;

/* ���븽����Ϣ */
typedef struct
{
	LONG			nVideoEncodeType;   // ��������
	LONG	        nDataLen;           // �������ݳ���
	char*           pUserData;          // ������Ϣ,���DEC_EXT_PARAM_SVAC����
	LONG	        nReserved[2];
}FRAME_DEC_EXT_INFO;

/* ��SVAC�������븽����Ϣ�Զ����ֶ� */
typedef struct
{
	unsigned char type;             // ��Ϣ����
	unsigned char length;           // ��Ϣ����
	unsigned char *pbuf;            // ��Ϣָ��
	unsigned char reserved[2];      // ����
}DEC_EXT_INFO_CUSTOM;

typedef struct
{
	unsigned char subtype;					  // subtypeΪ32,33,34ʱ����ʾ���ձ��ĵ����������н�����ͬһ��subtype����չ��Ϣ����ͬʱ������������ͬ����Ϣ����չ��Ϣ����ʱ����һ����չ��Ϣ���Ǹ���ǰһ����չ��Ϣ��
	unsigned char codeType;					  // �����ʽ����ǰ��0��ʹ�ã���ʾʹ��UTF-8����
	unsigned char alignType;				  // �����ʽ��0Ϊ����룬1Ϊ�Ҷ���
	unsigned char charSize;					  // �����С�������ر�ʾ
	unsigned char charType;					  // �ַ���ʽ��0Ϊ�׵׺ڱߣ�1Ϊ�ڵװױߣ�2Ϊ��ɫ���壬3Ϊ��ɫ����
	unsigned short top_pixel;				  // λ�ã������ر�ʾ 
	unsigned short left_pixel;				  // λ�ã������ر�ʾ 
	unsigned char len;						  // �ַ��� OSD_DATA��ռ�õ��ֽ��� 
	unsigned char res[3];					  // 3�������ֽ� 
	unsigned char OSD_DATA[ZXW_OSD_MAX_LEN];  // OSD �ַ����ݣ��䳤���� Len ȷ����֧��
											  // ���У�����'\n'Ϊ���У�'\0'Ϊ��������ͬʱҲ�ܵ��ַ����ȵ�Լ������OSD_DATA���
											  // ����Ϊ 243�ֽ�
}DEC_EXT_INFO_ZXW_OSD;

typedef struct
{
	unsigned char       m_iChannelID;         			// ������
	unsigned char  		m_cPlate[CAR_PLATE_CHARACTERS];	// ����
	unsigned char       m_iPlateColor;					// ������ɫ
	unsigned char       m_iPlateType;         			// ��������
	unsigned char 		m_iCarColor;          			// ������ɫ
	unsigned char   	m_iAlarmType;     				// ��������
	unsigned int     	m_iRedBeginTime;    			// ��ƿ�ʼʱ�䣬��λ��
	unsigned int     	m_iRedEndTime;      			// ��ƽ���ʱ�䣬��λ��
	unsigned char  		m_stCaptureTime[8];  			// �����¼��ľ���ʱ�� ��-��-��-����-ʱ-��-��-����

}DEC_EXT_INFO_CAR_RECORD;

typedef struct{
	unsigned char    id_number[ID_NUMBER_CHAR]; // ID�ţ�ASCII��ʾ�� u[8*18]
	unsigned char    reserve;                   // һ���ֽڳ��ȵı����ַ�
	unsigned char    name[ID_NAME_CHAR];        // GBK����
	unsigned short   ArgSx;                     // GBK����
	unsigned char    ArgNA[ID_ARGNA_CHAR];     //  GBK����
	unsigned char    bD[ID_BD_CHAR];            // ���á�2016-12-08����ASCII��ʾ��δʹ���ֽ�����
	unsigned char    address[ID_ADDRESS_CHAR];  // GBK����
	unsigned char    time[ID_TIME_CHAR];        // ��Ϣ����ʱ�䣬���á�2016-12-08 10:52:45����ASCII��ʾ
}DEC_EXT_INFO_ID_CARD;

typedef struct{
	unsigned char           mac[6];         // mac��ַ
	unsigned short          range;          // WIFI���õ�����ͷ�ľ��룬��λ����
}DEC_EXT_INFO_MAC_WIFI;

typedef struct{
	int object_id;                 // Ŀ��������
	int top;                       // ��Χ�������Ͻ�������
	int left;                      // ��Χ�������ϽǺ�����
	int bottom_diff;               // ��Χ�������½������������Ͻ�������Ĳ�ֵ
	int right_diff;                // ��Χ�������½Ǻ����������ϽǺ�����Ĳ�ֵ
	int bIsCrossLine;              // u(1)���Ƿ���Խ��澯��1����������0
	int nCrossLineRgn;             // u(5)��Ŀ������Խ���߶α��
	int bIsCrossNet;               // u(1)���Ƿ�������ָ澯��1����������0
	int nCrossNetRgn;              // u(3)��Ŀ����������������
	int nIsConverse;               // u(1)���Ƿ�������и澯��1����������0
	int nIndexConverse;            // u(2)��Ŀ����������������
}DEC_EXT_OBJECT_INFO;

typedef struct{
	unsigned char   ver0;			// 1���汾
	unsigned char   ver1;			// 2���汾
	int             rate_move_xy;	// �߶���λϵ��cs,�߶�ֵ���������csλ
	int             bit_width;		// �߶ȱ��������cn
	unsigned int    width;			// ԭʼͼ����
	unsigned int    height;			// ԭʼͼ��߶�
	unsigned int    reserve0;		// �����ֽ�
	unsigned int    reserve1;
	unsigned char   reserve2;   
	int             num_record;		// Ŀ���������
	DEC_EXT_OBJECT_INFO object_info[MAX_PG_NUM_RECORD]; // Ŀ����Ϣ
}DEC_EXT_INFO_PERIMETER_GUARD;

typedef struct
{
	int flags;                              // ��չ�������ͱ��

	int time_year;                          // ����ʱ����չ
	int time_month;
	int time_day;
	int time_hour;
	int time_minute;
	int time_second;
	int time_sec_fractional;
	int time_frame_num;

	int roi_region_num;                             // ROI������չ
	int roi_top_left_x[MAX_EXT_ROI_REGION_NUM];     // ROI�������Ͻ�����x����
	int roi_top_left_y[MAX_EXT_ROI_REGION_NUM];     // ROI�������Ͻ�����y����
	int roi_width[MAX_EXT_ROI_REGION_NUM];          // ROI������
	int roi_height[MAX_EXT_ROI_REGION_NUM];         // ROI����߶�

	int event_region_num;                           // ����¼���չ
	int event_num[MAX_EXT_EVENT_REGION_NUM];
	int event_region_event_id[MAX_EXT_EVENT_REGION_NUM][16];

	int alert_num;                                  // ��ر�����չ
	int alert_region_id[MAX_EXT_ALERT_NUM];
	int alert_event_id[MAX_EXT_ALERT_NUM];
	int alert_frame_num[MAX_EXT_ALERT_NUM];

	int *auth_buf[2];                               // ��֤����buf, auth_buf[0]�ǻ�������֤����, auth_buf[1]����ǿ����֤����
	int auth_len[2];                                // ��֤���ݳ���, ��������֤����ʱ������Ӧ������Ϊ 0
	int auth_signature_type[2];
	int auth_hash_hierarchy_flag[2];

	DEC_EXT_INFO_CUSTOM svac_ext_info_custom[MAX_CUSTOM_EXT_COUNT];			// ��չ
	DEC_EXT_INFO_ZXW_OSD svac_ext_info_zxw_osd[ZXW_OSD_TYPE_NUM];			// �������΢��OSD��Ϣ

	int	car_record_num;	                                                    // ��ų�����Ŀ
	DEC_EXT_INFO_CAR_RECORD svac_ext_info_car_record[MAX_CAR_RECORD_NUM];   // ��ų�����Ϣ

	int id_card_num;                                                        // ������֤����
	DEC_EXT_INFO_ID_CARD    svac_ext_info_id_card[MAX_ID_CARD_NUM];         // ������֤��Ϣ

	int mac_wifi_num;                                                       // ���mac��Ϣ����
	DEC_EXT_INFO_MAC_WIFI   svac_ext_info_mac_wifi[MAX_MAC_WIFI_NUM];       // ���wifi��Ϣ

	DEC_EXT_INFO_PERIMETER_GUARD svac_ext_info_perimeter_guard;             // ����ܽ�Ԥ����Ϣ

}DEC_EXT_PARAM_SVAC;

typedef struct 
{
	unsigned char  chExternsion_id;		// OSD��Ϣ��չ�ı��extenison_idӦ����0x12
	unsigned char  chExtension_length;	// ��ʾextension_length֮����չ�﷨Ԫ�س���
	unsigned char  chSub_type;			// ��ʾOSD��չ��Ϣ������
	unsigned char  chCode_type;			// ��ʾOSD�ַ��ı����ʽ��ֵΪ0ʱ����ʾʹ��UTF-8	
	unsigned char  chAlign_type;		// ��ʾOSD�ַ��Ķ����ʽ��0������롣1:�Ҷ���
	unsigned char  chChar_size;			// ��ʾOSD�ַ������С
	unsigned char  chChar_type;			// OSD�ַ��ַ���ʽ��0:�׵׺ڱ� 1:�ڵװٱ� 2:��ɫ 3����ɫ 4:�Զ���ɫ
	unsigned char  chTop_low8;			// top_low8��top_high8���һ��16λ�޷�������top��
	unsigned char  chTop_high8;			// ��ʾOSD�ַ���Ϣ�ϱ߽���ͼ�����е�λ�� 
	unsigned char  chLeft_low8;			// left_low8��left_high8���һ��16λ�޷���������
	unsigned char  chLeft_high8;		// ��ʾOSD�ַ���Ϣ��߽���ͼ�����е�λ��
	unsigned char  chLen;				//  ��ʾosd_dataռ�õ��ֽڳ��ȣ�ȡֵΪ0~243
	unsigned char  chRes[3];			
	unsigned char  chOsd_data[243];			// �ַ����ݣ�����Ϊlen�ֽ�
}DEC_EXT_SVAC2_OSD_INFO;

/* ��ǿ֧�ֵĹ��� */
typedef enum 
{
	IVSEFUNCTYPE_DENOISE = 0,		// ȥ��
	IVSEFUNCTYPE_LOWLIGHT,		// ���ն���ǿ
    IVSEFUNCTYPE_EE,                // ��Ե��
    IVSEFUNCTYPE_ACC,			    // ƫɫУ��
    IVSEFUNCTYPE_HR,	                // ȥ��
    IVSEFUNCTYPE_SLS,               // ǿ������
    IVSEFUNCTYPE_DEBLUR,            // ʧ��ģ�����
	IVSEFUNCTYPE_NUM			    // ֧����ǿ�Ĺ��ܸ���
}IVSEFUNCTYPE;

/* ��Ƶ��ǿ�㷨������� */
typedef struct
{
    IVSEFUNCTYPE eFuncType;				// ����ѡ��
    int			 nLevel;                // ����ȼ�����Χ[1-100),��Ӧ100���ȼ����Ե��ڣ�Ĭ��50��
}IVSEPARAMS;

/***********************************************************************************************/
/* �ӿ�																						   */
/***********************************************************************************************/

/************************************************************************/
//> �ļ�����
/************************************************************************/

/**
 * �ļ���ʼ������ʱ��ص�������
 *
 * @param[in] nPort		 ͨ����
 * @param[in] nStartTime �ļ���ʼʱ��.��1970��1��1��0��0��0�������
 * @param[in] nEndTime   �ļ�����ʱ��.��1970��1��1��0��0��0�������
 * @param[in] pUserData  �û�����
 */
typedef void (CALLBACK* fFileTimeDoneCBFun)(LONG nPort, DWORD nStarTime, DWORD nEndTime, void* pUserData);

/**
 * �����ļ���ʼ������ʱ��ص���
 *
 * @param[in] nPort			     ͨ����
 * @param[in] FileTimeDoneCBFun  �ص�����ָ��,����ΪNULL
 * @param[in] pUserData          �û��Զ������
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetFileTimeDoneCallBack(LONG nPort, fFileTimeDoneCBFun FileTimeCBFun, void* pUserData);

/**
 * ������ʱ�����ָ��λ��֮ǰ�Ĺؼ�֡λ�á�
 *
 * @param[in] nPort		ͨ����
 * @param[in] t			����ʱ��,���SYSTEMTIME.���õ�������ʱ����.ע����ִ�гɹ����ֵ�洢������I֡��ʱ���
 * @param[in] framePos  ���ҵ��Ĺؼ�֡���ļ�λ����Ϣ�ṹָ��,���PFRAME_POS.
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_GetKeyFramePosByAbsTime(LONG nPort, SYSTEMTIME* t, FRAME_POS* framePos);

/**
 * ������ʱ�����ָ��λ��֮��Ĺؼ�֡λ�á�
 *
 * @param[in] nPort		ͨ����
 * @param[in] t			����ʱ��,���SYSTEMTIME.���õ�������ʱ����.ע����ִ�гɹ����ֵ�洢������I֡��ʱ���
 * @param[in] framePos  ���ҵ��Ĺؼ�֡���ļ�λ����Ϣ�ṹָ��,���PFRAME_POS.
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_GetNextKeyFramePosByAbsTime(LONG nPort, SYSTEMTIME* t, FRAME_POS* framePos);

/**
 * ������ʱ�����ò���ʱ�䡣
 *
 * @param[in] nPort		ͨ����
 * @param[in] pDateTime	����ʱ��
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetPlayedAbsTime(LONG nPort, DATETIME_INFO *pDateTime);

/**
 * ���ļ�ƫ�����ò���λ�á�
 *
 * @param[in] nPort		    ͨ����
 * @param[in] nFileOffset	�ļ�ƫ��λ��
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetPlayPosByFileOffset(LONG nPort, UINT nFileOffset);

/**
 * ���������������Ȼص���
 *
 * @param[in] nPort				ͨ����
 * @param[in] IndexProgressCB	�ص�����
 * @param[in] pUser				�û�����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
typedef void (CALLBACK* fIndexProgressCB)(LONG nPort, float fProgress, void* pUserData);
PLAYSDK_API BOOL CALLMETHOD PLAY_SetFileIndexProgressCallBack(LONG nPort, fIndexProgressCB IndexProgressCB, void* pUser);


/**
 * ��ȡI֡������Ϣ��
 *
 * @param[in] nPort		ͨ����
 * @param[in] pBuffer	������ַ
 * @param[in] pSize		������С
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_GetIRefValue(LONG nPort, BYTE *pBuffer, DWORD *pSize);

/************************************************************************/
//> �������
/************************************************************************/

/**
 * ��ȡ��Ƶͨ��������
 *
 * @param[in]  nPort	 ͨ����
 * @param[out] pChannels �������[0-255]
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_GetAudioChannels(LONG nPort, DWORD* pChannels);
 
/**
 * ѡ����Ƶͨ����
 *
 * @param[in]  nPort	  ͨ����
 * @param[in] nChannelID  ��Ƶͨ����0��ʼ
 * @param[in] bFlag       TRUE��,FALSE�ر�
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_ChooseAudio(LONG nPort, DWORD nChannelID, BOOL bFlag);

/**
 * ��ȡ��Ƶͨ���򿪹ر�״̬��
 *
 * @param[in]  nPort	   ͨ����
 * @param[in]  nChannelID  ��Ƶͨ��[0-255]
 * @param[out] bFlag       TRUE��,FALSE�ر�
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_GetAudioChooseState(LONG nPort, DWORD nChannelID, BOOL* bFlag);

/**
 * ��������������Ƶ���ţ���������������Ƶ��Ч��
 *
 * @param[in]  nPort	   ͨ����
 * @param[in]  nChnNum     ����ͨ����0-��ͨ����1-��ͨ��
 * @param[in] bEnable      ʹ�� TRUE-���ã� FALSE-����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_EnableAudioChannel(LONG nPort, DWORD nChnNum, BOOL bEnable);

/************************************************************************/
//> ��ȡ���Ż������Ϣ
/************************************************************************/

/**
 * ��õ�ǰ֡�ʣ�֧��С����ʽ��
 *
 * @param[in] nPort ͨ����
 * @return float ��ǰ֡��
 */
PLAYSDK_API float CALLMETHOD PLAY_GetCurrentFrameRateEx(LONG nPort);

/**
 * ��ȡ���һ֡��Ӧ��YUV���ݡ�
 *
 * @param[in] nPort ͨ����
 * @param[in] pFrameDecodeInfo YUV������Ϣ
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_GetLastYUVFrame(LONG nPort, FRAME_DECODE_INFO* pFrameDecodeInfo);

/**
 * ¼��ص�������
 *
 * @param[in] nPort					ͨ����
 * @param[in] pFrameDecodeInfo      ����������Ƶ����
 * @param[in] pFrameInfo			ͼ���������Ϣ,��μ�FRAME_INFO�ṹ��
 * @param[in] pDecodeProcessInfo    ���ڴ洢���봦������ɵ�����
 * @param[in] pUserData				�û�����
 */
typedef struct 
{
	int nProcessType;			 // ��������, ��DECODE_DATA_PROCESS_TYPEö������
	unsigned char *pOutData;     // �������������ݵĵ�ַ
	unsigned int nOutDataLen;	 // �������������ݵĳ���
	unsigned int nOutDataBufLen; // �������������ݵ�buffer����
}DECODE_DATA_PROCESS_INFO;
typedef void (CALLBACK* fDecodeDataProcessCB)(LONG nPort, FRAME_DECODE_INFO* pFrameDecodeInfo, FRAME_INFO_EX* pFrameInfo, DECODE_DATA_PROCESS_INFO *pDecodeProcessInfo, void* pUserData);

/**
 * ��������ݻص��������������Ӧ���档
 *
 * @param[in] nPort            ͨ����
 * @param[in] nProcessType     ���ݴ�������, ���DECODE_DATA_PROCESS_TYPE����
 * @param[in] cbDecDataProcess ����ص�������ָ��
 * @param[in] pUserData        �û�����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
typedef enum
{
	NO_PROCESS = 0,				// �޴���
	PCM_MIX_PLAY = 1,			// ��Ƶ��������
}DECODE_DATA_PROCESS_TYPE;
PLAYSDK_API BOOL CALLMETHOD PLAY_SetDecodeDataProcessCallBack(LONG nPort, int nProcessType, fDecodeDataProcessCB cbDecDataProcess, void* pUserData);

/**
 * ����ǩ���ص�������
 *
 * @param[in] nPort		ͨ����
 * @param[in] nFrameID  ֡���
 * @param[in] bSuccess  У���Ƿ�ͨ��
 * @param[in] pUserData	�û�����
 */
typedef void (CALLBACK* fCheckDigitalSignCB)(LONG nPort, int nFrameID, BOOL bSuccess, void* pUserData);

/**
 * ��������ǩ���ص���
 *
 * @param[in] nPort            ͨ����
 * @param[in] pDigitalSignCB   ����ǩ���ص�����
 * @param[in] pUserData        �û�����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetDigitalSignCallBack(LONG nPort, fCheckDigitalSignCB pDigitalSignCB, void* pUserData);

/**
 * ����������Ϣ�ص������SVAC�����е�Щ�����Ϣ��
 *
 * @param[in] nPort            ͨ����
 * @param[in] DecInfoCallBack  ������Ϣ�ص��ص�����
 * @param[in] pUserData        �û�����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
typedef void (CALLBACK* fMultiFrameDecCallBack)(LONG nPort, LONG nStreamID, char* pData, LONG nLen, 
												FRAME_INFO* stFrameInfo, void* pUserData, LONG nReserved1);
PLAYSDK_API BOOL CALLMETHOD PLAY_SetMultiFrameDecCallBack(LONG nPort, fMultiFrameDecCallBack DecInfoCallBack, void* pUserData);

/**
 * ������֡��Ϣ�ص������SVAC������
 *
 * @param[in] nPort            ͨ����
 * @param[in] DecInfoCallBack  ��֡��Ϣ�ص��ص�����
 * @param[in] pUserData        �û�����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
typedef void (CALLBACK* fDecInfoCallBack)(LONG nPort, FRAME_DEC_EXT_INFO* pDecInfo, void* pUserData, LONG nReserved);
PLAYSDK_API BOOL CALLMETHOD PLAY_SetDecInfoCallBack(LONG nPort, fDecInfoCallBack DecInfoCallBack, void* pUserData);

/**
 * ������Ƶ��˽�ָ�ʹ�ܡ�
 *
 * @param[in] nPort            ͨ����
 * @param[in] bRecover		   TRUE ��Ƶ��˽�ָ�,FALSE ��Ƶ��˽�ڸ�
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetPrivacyRecover(LONG nPort, BOOL bRecover);

/************************************************************************/
//> ͼ�����
/************************************************************************/

/**
 * ������Ƶȥ���㷨���ܡ�
 *
 * @param[in] nPort            ͨ����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_StartDeHaze(LONG nPort);

/**
 * ������Ƶȥ�������
 *
 * @param[in] nPort            ͨ����
 * @param[in] ALightValue	   �趨�Ĵ�����ǿ��ֵ����Χ0-255
 * @param[in] AutoLightOn      �������Զ�Ѱ�Ҵ�����ǿ��0-�ر��Զ��������ֶ�, Ĭ��Ϊ1
 * @param[in] AutoRun          ����һֱ����ȥ���ܣ�0-�Զ��ж��Ƿ����첢ȥ��Ĭ��Ϊ1
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetDehazeParams(LONG nPort, int ALightValue, int AutoLightOn, int AutoRun);

/**
 * ֹͣ��Ƶȥ���㷨���ܡ�
 *
 * @param[in] nPort            ͨ����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_StopDeHaze(LONG nPort);

/**
 * ������Ƶ��ǿ�㷨���ܡ�
 *
 * @param[in] nPort            ͨ����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_StartIVSE(LONG nPort);

/**
 * ������Ƶ��ǿ���������Զ�ε��������ʹ�ö���IVSE��Ĺ��ܡ�
 *
 * @param[in] nPort            ͨ����
 * @param[in] pIVSEParams      IVSEPARAMS�ṹ�����
 * @param[in] bEnable          ��Ӧ��IVSEPARAMS�е�IVSEFUNCTYPE����ѡ�ʹ�ܿ���
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetIVSEParams(LONG nPort, IVSEPARAMS* pIVSEParams, BOOL bEnable);

/**
 * ֹͣ��Ƶ��ǿ�㷨���ܡ�
 *
 * @param[in] nPort            ͨ����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_StopIVSE(LONG nPort);

/**
 * ����ͼ���񻯴���
 *
 * @param[in] nPort           ͨ����
 * @param[in] level           ����ȼ�,0-�ر�,6-��ǿ,Ĭ�ϵȼ�4
 * @param[in] algMode         �㷨ģʽ,Ԥ���ӿ�,Ŀǰֻ֧��0
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_StartEdgeEnhance(LONG nPort, int level, int algMode);

/**
 * �ر�ͼ���񻯴���
 *
 * @param[in] nPort           ͨ����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_StopEdgeEnhance(LONG nPort);

/**
 * ������Ƶ������
 *
 * @param[in] nPort           ͨ����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_StartVideoStable(LONG nPort);

/**
 * �ر���Ƶ������
 *
 * @param[in] nPort           ͨ����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_StopVideoStable(LONG nPort);



#define MAX_REGION_NUM	32	// �����ο���Ŀ
typedef struct video_rect	// ���ο�
{
	int ulx;	// ���Ͻǵ�x����,����ͼ���߷ֱ���
	int uly;	// ���Ͻǵ�y����,����ͼ���߷ֱ���
	int lrx;	// ���½ǵ�x����,����ͼ���߷ֱ���
	int lry;	// ���½ǵ�y����,����ͼ���߷ֱ���
} VIDEO_RECT, *PVIDEO_RECT;

typedef enum mosaic_mode	// ������ģʽ
{
	MOSAIC_OFF = 0,			// ֹͣ�����˴���
	MOSAIC_ADJUST,			// ������λ�õ���,�����ڻ���������λ��ʵʱ����
	MOSAIC_TRANSFER			// ������ת¼������������ת¼����������Բ����л�����Ⱦ
} MOSAIC_MODE;

typedef struct mosaic_region	// �����˲ɼ�����
{
	int			nMosaicType;				// ���������ͣ�����������ģ���ȼ�������Ϊ������(���ص�),Խ��Խģ��
											// ����ȡֵΪ4��������������4,8,16,32,64...���Ϊͼ���� 
	int			nRegionNum;					// �����˾��ο���Ŀ
	VIDEO_RECT	pFaceRects[MAX_REGION_NUM];	// �����˾��ο���Ϣ
} MOSAIC_REGION, *PMOSAIC_REGION;

/**
 * �����˾��ο���Ϣ�ɼ��ӿڣ��˽ӿڸ���ȥ��ǰ��ͨ������Ƶ֡�����Ϣ��
 * ��ȡ������������Ϣ���ⲿ�������֡�������Ƿ���Ҫ�����˵���Ч����
 *
 * @param[out] nPort          ͨ����
 * @param[out] nFrameId       ��Ƶ֡���
 * @param[in]  pFaceRegion    ����ȡ����Ƶ֡������������Ϣ����Ҫ�ⲿ��д
 * @param[out] pUserData	  �û���Ϣ 
 */
typedef void (CALLBACK* fMosaicRegionInfo)(LONG nPort, int nFrameId, MOSAIC_REGION* pFaceRegion, void* pUserData); 

/**
 * ����ͼ�������˴���
 *
 * @param[in] nPort           ͨ����
 * @param[in] fMosaicInfo     ������������Ϣ�ɼ��ص������ڻ�ȡ��Ƶ֡����������
 * @param[in] pUserData		  �û���Ϣ 
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_StartMosaic(LONG nPort, MOSAIC_MODE mosaicMode, fMosaicRegionInfo fMosaicInfo, void* pUserData);

/**
 * �ر�ͼ�������˴���
 *
 * @param[in] nPort           ͨ����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_StopMosaic(LONG nPort);


/************************************************************************/
//> ͬ������
/************************************************************************/

/**
 * ��ͬ�����š�
 *
 * @return void*��ͬ�����ſ��ƾ�����ڵ���ͬ�����ſ��ƽӿ�ʱ��Ҫ����þ��������NULL��ʾʧ��
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API void* CALLMETHOD PLAY_OpenPlayGroup();

/**
 * ����Ѿ��򿪵�ͨ������Ƶ��ͬ���������С�
 *
 * @param[in] hPlayGroup  ͬ�����ž������PLAY_OpenPlayGroup����
 * @param[in] nPort       Ҫ����ͬ�����Ŷ��е�ͨ����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_AddToPlayGroup(void* hPlayGroup, LONG nPort);

/**
 * ��ͬ�����Ŷ�����ɾ��ָ��ͨ���š�
 *
 * @param[in] hPlayGroup  ͬ�����ž������PLAY_OpenPlayGroup����
 * @param[in] nPort       ��ͬ�����Ŷ�����ɾ����ͨ����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_DelFromPlayGroup(void* hPlayGroup, LONG nPort);

/**
 * �ӵ�ǰʱ������Ż򵹷š�
 *
 * @param[in] hPlayGroup  ͬ�����ž������PLAY_OpenPlayGroup����
 * @param[in] nDirection  ���ŷ��� 0��ʾ������1��ʾ����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetPlayGroupDirection(void* hPlayGroup, int nDirection);

/**
 * ���ò����ٶȡ�
 *
 * @param[in] hPlayGroup  ͬ�����ž������PLAY_OpenPlayGroup����
 * @param[in] fSpeed  �����ٶȣ���Χ[1/64~64.0]��С��1��ʾ���ţ�����1��ʾ���ţ��������ٶȽϿ�ʱ���ܻ��֡����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetPlayGroupSpeed(void* hPlayGroup, float fSpeed);

/**
 * ��ͣ�������
 *
 * @param[in] hPlayGroup  ͬ�����ž������PLAY_OpenPlayGroup����
 * @param[in] bPause TRUE��ͣ,FLASE�ָ�
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_PausePlayGroup(void* hPlayGroup, BOOL bPause);

/**
 * ��֡���š�
 *
 * @param[in] hPlayGroup  ͬ�����ž������PLAY_OpenPlayGroup����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_StepPlayGroup(void* hPlayGroup);

/**
 * ���þ���ʱ����ж�λ��
 *
 * @param[in] hPlayGroup  ͬ�����ž������PLAY_OpenPlayGroup����
 * @param[in] pstDateTime ����ʱ��
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SeekPlayGroup(void* hPlayGroup, DATETIME_INFO* pstDateTime);

/**
 * ��ѯ��ǰ�������ڲ��ŵ�ʱ�䡣
 *
 * @param[in]  hPlayGroup  ͬ�����ž������PLAY_OpenPlayGroup����
 * @param[out] pDateTime   ��ѯ��õ�ʱ��
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_QueryGroupPlayingTime(void* hPlayGroup,  DATETIME_INFO *pDateTime);

/**
 * �ر�ͬ�����ſ��ơ�
 *
 * @param[in] hPlayGroup  ͬ�����ž������PLAY_OpenPlayGroup����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_ClosePlayGroup(void* hPlayGroup);

/**
 * ����ͬ�����Ż�׼ͨ����
 *
 * @param[in] hPlayGroup  ͬ�����ž������PLAY_OpenPlayGroup����
 * @param[in] nPort  ͬ�����Ż�׼ͨ��
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetPlayGroupBaseChannel(void* hPlayGroup, LONG nPort);

/************************************************************************/
//> ����
/************************************************************************/

/* �������� */
typedef struct
{
	int   himg_width;                       // �����ͼ���
	int   himg_height;                      // �����ͼ���
	int   *zoom_list;						// ���������
	int   zoom_list_size;					// ���������λ����
}MHFPTZ_INITPARAM;

/* ���۽������� */
typedef struct 
{
	int radius;						// Ŀ������Բ�뾶��������Ϊ8192����ϵ
	int originX;					// Ŀ������ԲԲ��X��������Ϊ8192����
	int originY;					// Ŀ������ԲԲ��Y��������Ϊ8192����
	FISHEYE_SIZE srcSize;			// ��������Բ�Ŀ��
	FISHEYE_SIZE dstSize;			// �������ͼ�Ŀ��
	int winId;						// Ŀ�괰�ڵ�id
	FISHEYE_MOUNTMODE mountMode;    // ���۰�װģʽ
	FISHEYE_CALIBRATMODE calibMode; // ����ģʽ
	FISHEYE_REGIONPARAM regionParam;// ͨ��Fisheye_EptzUpdate ��FISHEYE_EPTZ_CMD_GET_CUR_REGION ���

}FISHRECTIFY_INFO;

/**
 * ��������������չ�ӿڡ�
 *
 * @param[in] nPort				ͨ����
 * @param[in] startType			�������ͣ���FISHEYE_START_TYPE����
 * @param[in] funcType			�������ܣ���FISHEYE_FUNC_TYPE����					
 * @param[in] ptzChannelParam	����������ʼ��ͨ��������startTypeΪ0ʱ��ptzChannelParam��NULL
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
typedef enum
{
    FISHEYE_ONLY_RECTIFY = 0,      // ֻ��������У��
    FISHEYE_RECTIFY_FPTZ,          // ͬʱ����������У��
    FISHEYE_ONLY_FPTZ,             // ֻ������������           
    FISHEYE_RECTIFY_180,           // 180�����۽���
}FISHEYE_START_TYPE;

typedef enum
{
    FISHEYE_FUNC_NONE = 0,              // Ĭ�ϲ�����
    FISHEYE_FUNC_ONLY_INTELLIGENT,      // ֻ��������֡����
    FISHEYE_FUNC_ONLY_CATCHPIC,         // ֻ����ץͼ          
    FISHEYE_FUNC_INTELLIGENT_CATCHPIC,  // ��������֡��ץͼ
}FISHEYE_FUNC_TYPE;
PLAYSDK_API BOOL CALLMETHOD PLAY_StartFisheyeEx(LONG nPort, int startType, int funcType, MHFPTZ_INITPARAM* ptzChannelParam);

/**
 * ��������������չ�ӿڣ�֧��һ�����
 *
 * @param[in] nPort				ͨ����
 * @param[in] startType			�������ͣ���FISHEYE_START_TYPE����
 * @param[in] funcType			�������ܣ���FISHEYE_FUNC_TYPE����								
 * @param[in] ptzChannelParam	����������ʼ��ͨ��������startTypeΪ0ʱ��ptzChannelParam��NULL
 * @param[in] ptzChannelNum	    ����������ʼ��ͨ����
 * @param[in] imgMaxOutput		���ͼ�����ķֱ���
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_StartFisheyeMPTZ(LONG nPort, int startType, int funcType, MHFPTZ_INITPARAM* ptzChannelParam, int ptzChannelNum, FISHEYE_SIZE* pImgMaxOutput);


/**
 * ��������ͼ�����꣬�����ԭʼ����ԲԲ�����ꡣ
 *
 * @param[in]  param		�������������FishRectify_Info
 * @param[in]  inrpt		����㣬8192����ϵ
 * @param[out] orpt			ת���������
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
PLAYSDK_API BOOL CALLMETHOD PLAY_FisheyeTrancFormCoordinate(FISHRECTIFY_INFO *param, FISHEYE_POINT2D* inrpt, FISHEYE_POINT2D *orpt);

/**
 * ��������ͼ�����꣬�����ԭʼ����ԲԲ�����ꡣ
 *
 * @param[in]     param		�������������FishRectify_Info
 * @param[in]     rpt1		����ͼ�ϵ�һ���㣬8192����ϵ
 * @param[in]     rpt2		����ͼ�ϵ�һ���㣬8192����ϵ
 * @param[in/out] in_num	�����ĵ����
 * @param[out]    fpts		��ֵ��õ��ĵ����У����������˵㣬8192����ϵ
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */		
PLAYSDK_API BOOL CALLMETHOD PLAY_FisheyeTrancFormCurve(FISHRECTIFY_INFO *param, FISHEYE_POINT2D* rpt1,FISHEYE_POINT2D* rpt2,int *in_num, FISHEYE_POINT2D *fpts);

/**
 * ����͸���ſ��Ƕȣ��ſ��ĽǶ�Խ����ʾ��ͼƬԽС��
 *
 * @param[in]     nPort		 ͨ����
 * @param[in]     nRegionNum ��ʾ�������,0~(MAX_DISPLAY_WND-1),���Ϊ0,�����õ�������ʾ����������
 * @param[in]     fFovy		 �ſ��ĽǶȴ�С(0-180)
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
PLAYSDK_API BOOL CALLMETHOD PLAY_SetStereoPerspectiveFovy(LONG nPort, DWORD nRegionNum, float fFovy);

/**
 * ����͸���ƶ��ľ��롣
 *
 * @param[in]     nPort		 ͨ����
 * @param[in]     nRegionNum ��ʾ�������,0~(MAX_DISPLAY_WND-1),���Ϊ0,�����õ�������ʾ����������
 * @param[in]     enMoveDicret		 �ƶ��ķ���
 * @param[in]     fDistancefDistance �ƶ��ľ���
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
typedef enum
{
	STEREO_EYE_NO_MOVE = -1,                // û���ƶ�
	STEREO_EYE_MOVE_BACK,                   // �����ƶ�
	STEREO_EYE_MOVE_RIGHT,                  // �����ƶ�
	STEREO_EYE_MOVE_TOP,                    // �����ƶ�
}STEREO_EYE_MOVE_DIRECTION;
PLAYSDK_API BOOL CALLMETHOD PLAY_SetStereoEyeMoveDistance(LONG nPort, DWORD nRegionNum, STEREO_EYE_MOVE_DIRECTION enMoveDicret, float fDistance);

/**
 * ����������ת�ĽǶȡ�
 *
 * @param[in]     nPort		 ͨ����
 * @param[in]     nRegionNum ��ʾ�������,0~(MAX_DISPLAY_WND-1),���Ϊ0,�����õ�������ʾ����������
 * @param[in]     fXOffset	 �����x����ת�ĽǶȣ�0-360�ȣ�
 * @param[in]     fYOffset   �����y����ת�ĽǶȣ�0-360�ȣ�
 * @param[in]     fZOffset   �����z����ת�ĽǶȣ�0-360�ȣ�
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
PLAYSDK_API BOOL CALLMETHOD PLAY_SetStereoRotate(LONG nPort, DWORD nRegionNum, float fXOffset, float fYOffset, float fZOffset);

/**
 * ����������ĽǶȡ�
 *
 * @param[in]     nPort		 ͨ����
 * @param[in]     nRegionNum ��ʾ�������,0~(MAX_DISPLAY_WND-1),���Ϊ0,�����õ�������ʾ����������
 * @param[in]     fXOffset	 �������������Ϊԭ�㣬��Z�ᣨ�������ͷ�����ߣ�˳ʱ����ת�ĽǶ�����(�Զ�Ϊ��λ)
 * @param[in]     fYOffset   �������������Ϊԭ�㣬��X��˳ʱ����ת�ĽǶ�����(�Զ�Ϊ��λ)
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
PLAYSDK_API BOOL CALLMETHOD PLAY_SetStereoView(LONG nPort, DWORD nRegionNum, float fXOffset, float fYOffset);

/**
 * ���ù۲��ģʽ��
 *
 * @param[in]     nPort		 ͨ����
 * @param[in]     nRegionNum ��ʾ�������,0~(MAX_DISPLAY_WND-1),���Ϊ0,�����õ�������ʾ����������
 * @param[in]     enStereoViewMode	ͨ���Ź۲��ģʽ����STEREO_VIEW_MODE
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
typedef enum
{
	STEREO_COMMON_VIEW,                     // ��ͨģʽ�����Կ�������ģ��
	STEREO_INNER_VIEW,                      // ���ӵ�ģʽ
}STEREO_VIEW_MODE;
PLAYSDK_API BOOL CALLMETHOD PLAY_SetStereoViewMode(LONG nPort, DWORD nRegionNum, STEREO_VIEW_MODE enStereoViewMode);

/**
 * ������ʾ��ģʽ��
 *
 * @param[in]     nPort	   ͨ����
 * @param[in]     mode     ģʽ����FISHEYE_CALIBRATMODE
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
PLAYSDK_API BOOL CALLMETHOD PLAY_SetCalibratMode(LONG nPort, FISHEYE_CALIBRATMODE mode);

typedef struct tagPointCloud
{
	float x;
	float y;
	float z;
	float intensity;//[0.0, 255.0]
} PointCloud3D;

typedef struct tagPoint3Df
{
	float x;
	float y;
	float z;
} Point3Df;

/**
 * @brief ���õ������ݲ��ҵ����ֵ��Χ
 * @param[in] nPort	       ͨ����
 * @param[in] nThreshold,��Χ���ֵ
 * @return BOOL,�ɹ�����TRUE��ʧ�ܷ���FALSE
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetClosestPointThreshold(LONG nPort,  float nThreshold);

/**
 * @brief �û������Ļ������ڵ��������в�������ĵ�����Ϣ��������������ϵ�е�����x,y,z�Լ�instensy
 * @param[in] nPort	       ͨ����
 * @param[in]     nRegionNum ��ʾ�������,0~(MAX_DISPLAY_WND-1),���Ϊ0,�����õ�������ʾ����������
 * @param[in] Inx,Iny ������ڴ�������Ϊԭ��Ĺ�һ���������귶Χ[-1,1]
 * @param[out] PointCloud �����ӽ�����ĵ�������
 * @return BOOL,�ɹ�����TRUE��ʧ�ܷ���FALSE����ʾδ�ҵ�
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_Get3DCoordScreenTransWorld(LONG nPort,DWORD nRegionNum, unsigned int InX, unsigned int InY, PointCloud3D* pointCloud);

/**
 * @brief �û����������Ϣ����ȡ��ǰ��ת��ƽ�ƵȲ����󣬴˵��2D��Ļ����
 * @param[in] nPort	       ͨ����
 * @param[in]     nRegionNum ��ʾ�������,0~(MAX_DISPLAY_WND-1),���Ϊ0,�����õ�������ʾ����������
 * @param[in] pointCloud 3D������Ϣ
 * @param[out] OutX��OutY ��Ļ����
 * @return BOOL,����TRUE���˽ӿ�һֱΪTRUE,��Ҫ�û�����OutX�Լ�OutY�ж��Ƿ���Ч
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_GetPointCoord3DTrans(LONG nPort,DWORD nRegionNum, Point3Df* pointCloud,unsigned int *OutX, unsigned int *OutY);

/**
 * @brief ������ת����
 * @param[in] nPort	       ͨ����
 * @param[in]     nRegionNum ��ʾ�������,0~(MAX_DISPLAY_WND-1),���Ϊ0,�����õ�������ʾ����������
 * @param[in] pointCloud ��ת����
 * @param[in] radius ���İ뾶
 * @return BOOL
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetRotationCenter(LONG nPort,DWORD nRegionNum, Point3Df* pointCenter);


/**
 * �����ļ���·���ı����ʽ��
 *
 * @param[in] nFileNameEncodeType �ļ��������ʽ
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note Ĭ��ansi���룬������ô˽ӿڣ��������ļ�����صĽӿھ��ᰴ�����õ����ͽ��в�����
 */
typedef enum
{
	FILE_NAME_ENCODE_ANSI,
    FILE_NAME_ENCODE_UTF8,
}FileNameEncodeType;
PLAYSDK_API BOOL CALLMETHOD PLAY_SetFileNameEncodeType(FileNameEncodeType nFileNameEncodeType);

/************************************************************************/
//> ץͼ
/************************************************************************/

/**
 * ��þ���ʱ��������ͼƬ��
 *
 * @param[in] filepath   ������ļ�·��
 * @param[in] time		 ����ʱ�䣬time��NULL��ص���һ֡
 * @param[in] fcbDec     ����ص�����
 * @param[in] pUserData  �û�����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_GetTimePicture(const char* filepath, struct tm* time, fDecCBFun fcbDec, void* pUserData);

/**
 * ͼ������תΪBMP��ʽ��
 *
 * @param[in] pBuf       ͼ������ָ��
 * @param[in] nSize		 ͼ�����ݴ�С
 * @param[in] nWidth     ͼ����
 * @param[in] nHeight    ͼ��߶�
 * @param[in] nType      �������� T_RGB32,T_UYVY��
 * @param[in] sFileName  Ҫ������ļ���,������.BMP��Ϊ��չ��
 * @param[in] nBmpType   BMP���� PIC_BMP_32��ʾBMP32,PIC_BMP_24��ʾBMP24
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_ConvertToBmpFileEx(char * pBuf,LONG nSize,LONG nWidth,LONG nHeight,LONG nType, char *sFileName,int nBmpType);

/************************************************************************/
//> ¼�ƻ�ת�빦��
/************************************************************************/

/**
 * ����Ԥ¼�Ļ�����
 *
 * @param[in] nPort ͨ����
 * @param[in] nTime Ԥ¼����ʱ�䣬��λ��
 * @param[in] tmpDirectory ��ʱ��Ԥ¼Ŀ¼
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetupPrepareTime(LONG nPort,int nTime,const char* tmpDirectory);

/**
 * ��ʼԤ¼��
 *
 * @param[in] nPort ͨ����
 * @param[in] pFileName ¼��λ��
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_StartPrepareRecord(LONG nPort,const char* pFileName);

/**
 * ֹͣԤ¼��
 *
 * @param[in] nPort ͨ����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_StopPrepareRecord(LONG nPort);

/**
 * ��ʼ��ֱ��ʵ�AVIת����
 *
 * @param[in] nPort ͨ����
 * @param[in] sFileName ¼����·��
 * @param[in] lWidth  Ŀ�Ŀ�
 * @param[in] lHeight Ŀ�ĸ�
 * @param[in] uiSegmentSize �ֶ�����ʱ�����÷ֿ���Ƶ��С�������÷ֶ�����ʱ����0����С��λΪM
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_StartAVIResizeConvert(LONG nPort, char *sFileName, LONG lWidth, LONG lHeight, unsigned int uiSegmentSize);

/**
 * ֹͣ��ֱ��ʵ�AVIת����
 *
 * @param[in] nPort ͨ����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_StopAVIResizeConvert(LONG nPort);

/**
 * ¼��ص�������
 *
 * @param[in] nPort     ͨ����
 * @param[in] pData     ����ָ��
 * @param[in] nDataLen  ���ݳ���
 * @param[in] nOffset   ����ʼ����ƫ��λ��, avi��ʽ���д,�ⲿ�谴�մ�ƫ����д�ļ�, -1��ʾ���ֶ���Ч
 * @param[in] pUserData �û�����
 */
typedef void (CALLBACK* fRecordDataCBFun)(LONG nPort, unsigned char* pData, int nDataLen, LONGLONG nOffset, void* pUserData);

/**
 * ��ʼ������¼��,ֻ����ģʽ����,��PLAY_Play֮����á�
 * avi/mp4֧�ֱ�ֱ���ת��, ����PLAY_ResolutionScale�ӿ�ʹ�á�
 *
 * @param[in] nPort      ͨ����
 * @param[in] sFileName  ¼���ļ���,����ļ������в����ڵ��ļ���,�ʹ������ļ���
 * @param[in] idataType  ȡֵDATA_RECORD_TYPE
 * @param[in] fListenter �ص�����
 * @param[in] pUserData  �û�����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_StartDataRecordEx(LONG nPort, char *sFileName, int idataType, fRecordDataCBFun fListenter, void* pUserData);

/**
 * �ֶ�¼����Ϣ�ص�������
 *
 * @param[in] nPort     ͨ����
 * @param[in] pSegmentFileName     �ֶ��ļ�����·��ָ��
 * @param[in] nFileSize  �ֶ��ļ����ȣ���λ:�ֽ�
 * @param[in] pUserData �û�����
 */
typedef void (CALLBACK* fSegmentRecordDataCBFun)(LONG nPort, char* pSegmentFileName, ULONGLONG nFileSize, void* pUserData);

/**
 * ���÷ֶ�����ת����Ϣ�����������PLAY_StartDataRecordExǰ������Ч
 *
 * @param[in] nPort      ͨ����
 * @param[in] uiSegmentSize �ֶ�����ʱ�����÷ֿ���Ƶ��С�������÷ֶ�����ʱ����0����С��λΪM
 * @param[in] fListenter �ص�����
 * @param[in] pUserData  �û�����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetSegmentRecordData(LONG nPort, unsigned int uiSegmentSize, fSegmentRecordDataCBFun fListenter, void* pUserData);

/************************************************************************/
//> ���뼰��ʾ����
/************************************************************************/

/**
 * ͼ�����ţ���֧���ֻ�ƽ̨��
 *
 * @param[in]  nPort	    ͨ����
 * @param[in]  scale		���ű���[1.0, 8.0]
 * @param[out] nRegionNum   ��ʾ�������
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_Scale(LONG nPort, float scale, DWORD nRegionNum);

/**
 * ͼ��ƽ�ƣ���֧���ֻ�ƽ̨��
 *
 * @param[in]  nPort	    ͨ����
 * @param[in]  x			x����ƽ�����꣬����ֵ		
 * @param[in]  y            y����ƽ�����꣬����ֵ
 * @param[in]  nRegionNum   ��ʾ�������
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_Translate(LONG nPort, float x, float y, DWORD nRegionNum);

/**
 * ͼ���һ������ƽ�ƣ����Ų�������֧���ֻ�ƽ̨��
 *
 * @param[in]  nPort	    ͨ����
 * @param[in]  nRegionNum   ��ʾ�������
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetIdentity(LONG nPort, DWORD nRegionNum);

/**
 * ��ȡ��ǰͼ������ֵ����֧���ֻ�ƽ̨��
 *
 * @param[in]  nPort	    ͨ����
 * @param[in]  nRegionNum   ��ʾ�������
 * @return float����ǰ����ϵ��
 */
PLAYSDK_API float CALLMETHOD PLAY_GetScale(LONG nPort, DWORD nRegionNum);

/**
 * ��ȡ��ǰx��ƽ�����꣬��֧���ֻ�ƽ̨��
 *
 * @param[in]  nPort	    ͨ����
 * @param[in]  nRegionNum   ��ʾ�������
 * @return float����ǰx��ƽ������
 */
PLAYSDK_API float CALLMETHOD PLAY_GetTranslateX(LONG nPort, DWORD nRegionNum);

/**
 * ��ȡ��ǰy��ƽ�����꣬��֧���ֻ�ƽ̨��
 *
 * @param[in]  nPort	    ͨ����
 * @param[in]  nRegionNum   ��ʾ�������
 * @return float����ǰy��ƽ������
 */
PLAYSDK_API float CALLMETHOD PLAY_GetTranslateY(LONG nPort, DWORD nRegionNum);

/**
 * �������ܣ���֧���ֻ���Macƽ̨��PLAY_Stopǰ������Ч��
 *
 * @param[in]  nPort	    ͨ����
 * @param[in]  red			rgb����
 * @param[in]  green	    rgb����
 * @param[in]  blue			rgb����
 * @param[in]  alpha	    alpha����
 * @param[in]  nRegionNum   ��ʾ�������
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_CleanScreen(LONG nPort, float red, float green, float blue, float alpha, DWORD nRegionNum);

/**
 * ѡ����ʾSVAC����SVC�Ļ��������ǿ�㡣
 *
 * @param[in]  nPort	    ͨ����
 * @param[in]  nFrameID		Ҫ��ʾ�Ĳ�(0: �����㣬1: ��ǿ��)
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_ChooseFrame(LONG nPort, LONG nFrameID);

/**
 * ʵ�������ֱ������ų�Ŀ�ķֱ�����Ⱦ��
 *
 * @param[in]  nPort	     ͨ����
 * @param[in]  nTargetWidth	 Ŀ�ķֱ��ʿ�
 * @param[in]  nTargetHeight Ŀ�ķֱ��ʸ�
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_ResolutionScale(LONG nPort, int nTargetWidth, int nTargetHeight);

/**
 * �����ļ������ų�����ˢ�����һ��GOP��
 *
 * @param[in]  nPort	     ͨ����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_Flush(LONG nPort);

/**
 * ���ò��Ż�������󻺳�֡����
 *
 * @param[in]  nPort	 ͨ����
 * @param[in]  nNum	     �������⣬�򻺳�֡��[2,12]�������Ӳ�⣬���򻺳�֡��[2,16]
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetDisplayBuf(LONG nPort,DWORD nNum);

/**
 * ���û�������ʾ����,�������ֲ��Ŵ���ʾ����ʾ���ڲ�������
 *
 * @param[in]  nPort	  ͨ����
 * @param[in]  nRegionNum ��ʾ�������,0~(MAX_DISPLAY_WND-1),���Ϊ0,�����õ�������ʾ����������
 * @param[in]  pSrcRect	  ��Ƶ����ֲ���ʾ����,��ΧΪ[0, ��Ƶ��][0, ��Ƶ��]
 * @param[in]  pDstRect	  ���ִ�����ʾ����,�ͻ�������
 * @param[in]  hDestWnd	  ��ʾ���ھ��
 * @param[in]  bEnable	  ��(����)��ر���ʾ����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetDisplayRegionEx(LONG nPort,DWORD nRegionNum, DISPLAYRECT *pSrcRect, DISPLAYRECT *pDstRect, HWND hDestWnd, BOOL bEnable);

/**
 * ���۽����ص�������
 *
 * @param[in] nPort		     ͨ����
 * @param[in] pBuf           ��ͨ������ָ��
 * @param[in] nSize          ��ͨ�����ݳ���
 * @param[in] nWidth	     ��ͨ��ͼ���
 * @param[in] nHeight	     ��ͨ��ͼ���
 * @param[in] pSecondBuf     ��ͨ������ָ��
 * @param[in] nSecondSize    ��ͨ�����ݳ���
 * @param[in] nSecondWidth	 ��ͨ��ͼ���
 * @param[in] nSecondHeight	 ��ͨ��ͼ���
 * @param[in] pUserData  �û�����
 */
typedef void (CALLBACK* fDoubleVisibleDecCBFun)(LONG nPort,char * pBuf, int nSize, int nWidth, int nHeight, 
													char* pSecondBuf, int nSecondSize, int nSecondWidth, int nSecondHeight, void* pUserData);
/**
 * �������۽����ص���
 *
 * @param[in] nPort		 ͨ����
 * @param[in] DataCBFun  �ص�����
 * @param[in] pUserData  �û�����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */												
PLAYSDK_API BOOL CALLMETHOD PLAY_SetDoubleVisibleDecCallBack(LONG nPort, fDoubleVisibleDecCBFun DataCBFun, void* pUserData);

/**
 * ����ƴ���㷨��
 *
 * @param[in] nPort	 ͨ����
 * @param[in] nMode  ģʽ��0��Ӧ����ģʽ��1��Ӧ1+3ģʽ��2��Ӧ1+5ģʽ, 3��Ӧ1+1ģʽ�����ӷŴ�
 *					 4��Ӧ1P+3, 5��Ӧ1P+6, 6��Ӧ1+1ģʽ�����ҵ�����, 7��Ӧ1+1ģʽ�����·�����
 *					 8��Ӧ1+3�����·�����ģʽ
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
PLAYSDK_API BOOL CALLMETHOD PLAY_SplitProc(LONG nPort, int nMode);

/**
 * ƴ���㷨��������Ҫ�Ŵ�ľ���λ�á�
 *
 * @param[in] nPort	 ͨ����
 * @param[in] pAreaRect  ���������������ʼ��ַ
 *			 ���nMode��0����ӦΪNULL
 *			 ���nMode��1���������Ĵ�СӦΪ3
 *			 ���nMode��2���������Ĵ�СӦΪ5 
 *			 ���nMode��3��6, 7���������Ĵ�СӦΪ2
 *			 ���nMode��4���������Ĵ�СӦΪ3
 *			 ���nMode��5���������Ĵ�СӦΪ6
 *			 ���nMode��8��������Ĵ�СӦΪ4
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
PLAYSDK_API BOOL CALLMETHOD PLAY_SplitProcUpdate(LONG nPort, DISPLAYRECT* pAreaRect);

/**
 * ��ʼ�����������ܿ⡣
 *
 * @param[in] nPort	 ͨ����
 * @param[in] kmcSvrIP    ip��ַ
 * @param[in] kmcSvrPort  �˿�
 * @param[in] macAddr     mac��ַ
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
PLAYSDK_API BOOL CALLMETHOD PLAY_InitThirdPartyLibrary(LONG nPort, const char* kmcSvrIP,int kmcSvrPort,const char* macAddr);

/**
 * ���ý������,�����������������롣
 *
 * @param[in] nPort	 ͨ����
 * @param[in] nStrategyType   
 *				16: ��ʾ����������frame����������ǰ����
 *				8 : ��ʾ�����������������ݲ�����Э�鵱�ɽ������
 *				0 : ��ʾ�����������������ݲ�����Э��������룬���������Ứ��
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
PLAYSDK_API BOOL CALLMETHOD PLAY_SetDecodeStrategy(LONG nPort, int nStrategyType);

/**
 * ������������չ�ӿڡ�
 *
 * @param[in] decryptHook  �ص������� 
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
enum ThirdDecryptType
{
	DECRYPT_KTJM = 4, // �������
	DECRYPT_SYJM,	  // ��Ԫ����
	DECRYPT_HZSD,     // ��ʦ���㷨
	DECRYPT_ZBQL,     // �б������㷨
	DECRYPT_COMPANY_TYPE_FRI = 0x80,//һ��������ǩ
	DECRYPT_COMPANY_TYPE_TRI,//����������ǩ

	ENCRYCRYPT_COMPANY_TYPE_FRI,//һ������
	DECRYPT_COMPANY_TYPE_TRI_PLAYBACK, //�طų�������������

	DECRYPT_COMPANY_TYPE_TELECOM,   //�е������ӽ���
	DECRYPT_COMPANY_TYPE_SYMBOLTEK, //��������
};

typedef struct 
{ 
	int    type;           // ��������������,���ThirdDecryptType
	BOOL (*Init)();		   // ��ʼ���ӿ�,ȫ�ֳ�ʼ��һ��
	BOOL (*DeInit)();	   // ����ʼ���ӿ�
	void* (*Open)();	   // �򿪽���ͨ��, ����ֵ����Ϊ��
	BOOL (*Decrypt)(void* handle, unsigned char* inData,  unsigned int inLen, unsigned char* outData, unsigned int* outLen);// ����, �Է���ֵ��Ҫ��(1�ɹ�0ʧ��)
	BOOL (*Close)(void* handle); // �رս���ͨ��
	BOOL (*SetParam)(void* handle, const void* pParam, unsigned int nParamLen);//�·���Կ
	BOOL (*DecryptEx)(void* handle, unsigned char* inData,  unsigned int inLen, unsigned char** outData,  unsigned int* outLen, FRAME_INFO_EX* pFrameInfo,  unsigned int*pulSignVerify);// ����, �Է���ֵ��Ҫ��(1�ɹ�0ʧ��)
	BOOL (*Encrypt)(void* handle, unsigned char* inData,  unsigned int inLen, unsigned char** outData,  unsigned int* outLen, FRAME_INFO_EX* pFrameInfo);//���ܣ��Է���ֵ��Ҫ��(1�ɹ�0ʧ��)
	void* (*OpenEx)(FRAME_INFO_EX* pFrameInfo); // �򿪽���ͨ��
	void* Reserved[62];
	unsigned char nReserved[64];
}ThirdDecryptHook;
PLAYSDK_API BOOL CALLMETHOD PLAY_Register3rdDecryptHook(ThirdDecryptHook* decryptHook);

/**
 * ����SVAC������Կ��
 *
 * @param[in] nPort	   ͨ����
 * @param[in] key      ��Կָ�� 
 * @param[in] key_len  ��Կ����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
PLAYSDK_API BOOL CALLMETHOD PLAY_SetDecodeKey(LONG nPort, const unsigned char *key, unsigned int key_len);

/************************************************************************/
//> ˽������
/************************************************************************/

/* �ļ���Ϣ֡ */
typedef struct __FILE_INFO_FRAME
{
	unsigned int		nFrameSubType;	  // ֡�����ͣ���������֡���¼�֡��
	DATETIME_INFO*		pstDateTimeStart; // ��ʼʱ��
	DATETIME_INFO*		pstDateTimeEnd;   // ����ʱ��
	unsigned char*		pFrameData;		  // ֡����
	unsigned int		nFrameDataLen;	  // ֡���ݳ���
} FILE_INFO_FRAME;

typedef struct __FILE_INFO_FRAME_SEARCH
{
#define PLAY_INFO_TYPE_MOTIONDECT     1    // ����
#define PLAY_INFO_TYPE_EVENT		  2    // �¼�
	unsigned int		nFileFrameType;	   // �������ͣ�������ϣ��� PLAYER_INFO_TYPE_MOTIONDECT | PLAYER_INFO_TYPE_EVENT
	DATETIME_INFO		stStartDataTime;   // ��ʼʱ��
	DATETIME_INFO		stEndDataTime;     // ����ʱ��
	DISPLAYRECT			rtDetectedRegion;  // �������еĶ����ⷶΧ������֡ʱ��Ч���������Ϊ0ʱ����ʾȫ��������
	DISPLAYRECT			rtTotal;		   // ������, ����֡ʱ��Ч
} FILE_INFO_FRAME_SEARCH;

typedef struct __FILE_INFO_IMAGE
{
	tPicFormats	   imageType;			   // ͼƬ������
	unsigned char* pPicBuf;				   // ͼƬ�Ļ���ָ��
	unsigned int   nPicBufLen;			   // ͼƬ�ĳ���
} FILE_INFO_IMAGE;

/**
 * �����ļ���Ϣ֡�ص�������
 */
typedef int (CALLBACK* fFileInfoFrameCBFun)(LONG nPort, FILE_INFO_IMAGE* pFileInfoImage, FILE_INFO_FRAME* pFileInfoFrame, void* pUserParam);
PLAYSDK_API BOOL CALLMETHOD	PLAY_SetFileInfoFrameCallback(LONG nPort, fFileInfoFrameCBFun fFileInfoFrame, tPicFormats imageType, void* pUserParam);

/**
 * �����ļ���Ϣ֡�������Ȼص�������
 */
typedef int (CALLBACK *fAnalyzePositionCBFun)(LONG nPort, DATETIME_INFO* pstDateTime, void* pUserParam);
PLAYSDK_API BOOL CALLMETHOD	PLAY_SetAnalyzePositionCallback(LONG nPort, fAnalyzePositionCBFun fAnalyzePosition, void* pUserParam);

/**
 * ��Ҫ�������������֮�󣬿�ʼ�ļ���Ϣ֡��⣬��������������
 */
PLAYSDK_API BOOL CALLMETHOD	PLAY_StartFileFrameDetect(LONG nPort, FILE_INFO_FRAME_SEARCH* pFileInfoFrameSearch);

/**
 * ��ֹ������
 */
PLAYSDK_API BOOL CALLMETHOD	PLAY_StopFileFrameDetect(LONG nPort);

/**
 * ��Ŀ��ƵԴ������Ϣ�ص�������
 *
 * @param[in] nPort		 ͨ����
 * @param[in] pSensor    ��Ŀ����ָ��, ��mSensor*nSensor��С
 * @param[in] mSensor    mԪ
 * @param[in] nSensor    nԪ
 * @param[in] nPicWidth  ������
 * @param[in] nPicHeight ������
 * @param[in] pUserData  �û�����
 */
typedef struct
{
	short leftTopX;
	short leftTopY;
	short rightBottomX;
	short rightBottomY;
}SensorInfo;
typedef void (CALLBACK* fSensorInfoCallBack)(LONG nPort, SensorInfo* pSensor, int mSensor, int nSensor, int nPicWidth, int nPicHeight, void* pUserData);

/**
 * ���ö�Ŀ��ƵԴ������Ϣ�ص���
 *
 * @param[in]  nPort	    ͨ����
 * @param[in]  pCallBack	�ص�����
 * @param[in]  pUserData    �û�����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetMultiSensorCallBack(LONG nPort, fSensorInfoCallBack pCallBack, void* pUserData);

/**
 * osd���ݻص�������
 *
 * @param[in] nPort		 ͨ����
 * @param[in] pBuf       ����ָ��
 * @param[in] nSize      ���ݳ���
 * @param[in] pUserData  �û�����
 */
typedef void (CALLBACK* fOSDInfoCallBackFun)(LONG nPort,char * pBuf,int nSize, void* pUserData);

/**
 * ����osd���ݻص���
 *
 * @param[in]  nPort	    ͨ����
 * @param[in]  OSDInfoFun	�ص�����
 * @param[in]  pUserData    �û�����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetOSDInfoCallBack(LONG nPort, fOSDInfoCallBackFun OSDInfoFun, void* pUserData);

/**
 * ����osd��Ϣ������YUV���ӣ���Windows��Ч��
 *
 * @param[in]  nPort	    ͨ����
 * @param[in]  pOSDInfo	    osd��Ϣ
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
#define OSD_ATTRIBUTE_FLAG_REGION   (1 << 0)
#define OSD_ATTRIBUTE_FLAG_EXTRA    (1 << 1)
#define OSD_ATTRIBUTE_FLAG_TIME	    (1 << 2)
#define MAX_REGION_NUMBER 128
typedef struct{
    unsigned int     attrflag;                    // ʹ�ܱ��
    unsigned char    region[MAX_REGION_NUMBER];   // ������Ϣ
    unsigned char    extra[MAX_REGION_NUMBER];    // ������Ϣ
    SYSTEMTIME       startTime;                   // ��ʼʱ��
}YUV_OSD_INFO;
PLAYSDK_API BOOL CALLMETHOD PLAY_SetYUVOSDInfo(LONG nPort, YUV_OSD_INFO* pOSDInfo);

/**
 * ����osd��Ϣ����ƽ̨��չ����������YUV����
 *
 * @param[in]  nPort	    ͨ����
 * @param[in]  pOSDInfo	    osd��Ϣ
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
typedef struct{
	int	x;							// ��ת������xλ��
	int	y;							// ��ת������yλ��
	unsigned int	r;				// osd������ɫr����Χ0-255
	unsigned int	g;				// osd������ɫg����Χ0-255
	unsigned int	b;				// osd������ɫb����Χ0-255
	unsigned int	alpha;			// osd����͸���ȣ���Χ0-255
	char			szOsdData[512];	// osd���ݣ�ʹ��utf-8����
	unsigned int	fontX;			// ������, ʹ��˽������ʱ��Ч
	unsigned int	fontY;			// ����߶�, ���512
	unsigned int	rotateAngle;	// ��ת�Ƕȣ���Χ0-359��
	char			coordinate8192; // 8192����ϵ, 0��ʾ��������x,y���������ֱ���, 1��ʾ����8192����ϵ
	char			reserved[15];	// �����ֶ�
} OsdDataInfo;

typedef struct{
	bool			bPrivateFont;	// �Ƿ���˽������
	char			fontPath[256];	// �����ļ�λ��
	unsigned int	osdCount;		// OSD�������������32��
	OsdDataInfo		osdList[32];	// OSD�б�
	char			reserved[64];	// �����ֶ�
}YUV_OSD_INFO_EX;
PLAYSDK_API BOOL CALLMETHOD PLAY_SetYUVOSDInfoEx(LONG nPort, YUV_OSD_INFO_EX* pOSDInfo);

/************************************************************************/
//> ����Ӳ��
/************************************************************************/
/**
 * ��ѯtag��Ϣ(Windows32ƽ̨)��
 *
 * @param[in] nDiskNo ���̺�
 * @param[in] pTagInfo �����ѯ����tag��Ϣ�����ⲿ�����ڴ�
 * @param[in] nMaxLen TAG_INFO�ṹ�ĸ���
 * @return DWORD����ѯ������Ŀ��
 */
typedef struct
{
	unsigned int    firstClusNo;
    USER_TIME       timeStamp; 
    unsigned int    channel;   
    int             state;
    int             duration;
    char            reserved1[12]; 
    char            tagName[160];
    char            userName[32];
    char            channelName[64];
    char            reserved2[128];
    unsigned int    partNo;           	
}TAG_INFO;
PLAYSDK_API DWORD CALLMETHOD PLAY_QueryTagInfo(LONG nDiskNo, TAG_INFO* pTagInfo, DWORD nMaxLen);

/**
 * ��ѯͨ����Ϣ(Windows32ƽ̨)��
 *
 * @param[in] nDiskNo ���̺�
 * @param[in] pChannelInfo �����ѯ����channel��Ϣ�����ⲿ�����ڴ�
 * @return DWORD����ѯ������Ŀ����������Ч��Ϣ����������Ч��Ϣ��Ŀ��channelTitleΪ�գ������ֽ�Ϊ0
 */
typedef struct
{
	char channelTitle[256];			//ͨ�����ƣ��ַ���
	char deviceip[36];				//Զ���豸��IP��ַ���ַ���
	unsigned int    remoteChannel;	//Զ��ͨ���ţ���0��ʼ
	char    reserved[216];			//����          	
}CHANNEL_INFO;
PLAYSDK_API DWORD CALLMETHOD PLAY_QueryChannelInfo(LONG nDiskNo, CHANNEL_INFO* pChannelInfo);

/************************************************************************/
//> ��׿Ӳ��ֱ���ض��ӿ�
/************************************************************************/
//OES��������ɻص�����JAVA�ϲ���ݻص�nTextureID����SurfaceTexture��Ӳ������Surface
typedef HWND (CALLBACK* fGLESTextureCallback)(int nTextureID, void* pUserData);/**
 * ����OES����ID�ص�
 *
 * @param[in]  nPort	 ͨ����
 * @param[in]  nRegionNum			����������ţ�Ĭ��Ϊ0
 * @param[in]  pfGLESTextureCB      �ص�����ָ��
 * @param[in]  pUserData			�û�����ָ��
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
PLAYSDK_API BOOL CALLMETHOD PLAY_SetGLESTextureCallBack(LONG nPort, fGLESTextureCallback pfGLESTextureCB, int nRegionNum, void* pUserData);
//����ģʽ���֧��16����ʾ����
#define FISHEYE_REGION 16
/**
 * �ⲿ�߳�����������Ⱦ�ӿ�
 *
 * @param[in]  nPort	 ͨ����
 * @param[in]  nX        ����left����
 * @param[in]  nY        ����top����
 * @param[in] nWidth     ���ڿ�
 * @param[in] nHeight    ���ڸ�
 * @param[in] nRegionNum ��ʾ������ţ�Ĭ��Ϊ0
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
PLAYSDK_API BOOL CALLMETHOD PLAY_OutsideRender(LONG nPort, int nX, int nY, int nWidth, int nHeight, unsigned int nRegionNum);


/************************************************************************/
//> ͨ������
/************************************************************************/

typedef enum GetSetType
{
	GRAPH   = 0x100,
	GRAPH_FORWARD_BACK_SWITCH_FRAMESEQ,		// ����ط��������޷��л���(ʱ���)
	GRAPH_IFRAME_COSTTIME_ADJUST_FLAG,		// ��I֡�����Ƿ�����Ӧ��������ʱ��,1:����(֡��*֡���),0:������(ԭʼ֡�ʲ���)
	SOURCE  = 0x200,
	DECODE  = 0x400,
	DECODE_ENGINE = 0x487,//���뷽ʽ������⣬Ӳ��
	DECODE_VIDEO_ENCODE_TYPE = 0x48E,//��Ƶ��������
	RENDER  = 0x800,
	RENDER_STEREO_PERSPECTIVE_FOVY,
	RENDER_STEREO_ROTATE_X,	
	RENDER_STEREO_ROTATE_Y,	
	RENDER_STEREO_ROTATE_Z,	
	RENDER_STEREO_EYE_MOVE_BACK,            // ��ǰ�ƶ�
	RENDER_STEREO_EYE_MOVE_RIGHT,           // �����ƶ�
	RENDER_STEREO_EYE_MOVE_TOP,             // �����ƶ�
	RENDER_CLEAR_SEAMLESS_SWITCH_FRAMELIST,	//����޷��л���Ƶ֡����
	RENDER_WEBWASM_AUDIO_BUFFER,			//�޲��js����Ƶ���Ż���
	METHOD  = 0x1000,
	CBMgr   = 0x2000,
	ARENDER = 0x4000,
    RECORDER = 0x8000,
    RECORDER_ENCODE_BITRATE,		//��������,��λkbit/s
	RECORDER_RESAMPLERATE,
	RECORDER_POWEROFF_EFFECT,
	RECORDER_ENCODE_GOPSIZE,		//����GOP��С,Ĭ��֡�ʵ�������С
	RECORDER_ENCODE_THREADNUM,		//�����߳���,���ӳ�ǿ���,Ĭ��1���߳�
	RECORDER_ENABLE_CACHE_SMARTI,   //����Smart�ؼ�֡,������ܱ��볡����ʱ��¼������Ƶ����
	RECORDER_ENCODE_QP,             //����qpֵ���Ե��ڱ�������, qpԽС����Խ��, qp��ΧΪ[0,51]
	RECORDER_ENABLE_DOUBLE_AUDIO_VIDEO,  //����˫�����ģʽ, ¼�Ʋ��Ŷ�����Ƶ�Ͳɼ�����Ƶ, ��Ҫ��PLAY_StartDataRecord֮ǰ����
	RECORDER_PRIVATE_HEADER_TYPE,		 //���÷�װ˽��ͷ���� 0:DAV 1:MYAV 2:LXAV 3:WMAV
	RECORDER_DISABLE_H264_REENCODE,		 //H264�������ƵԴ�Ƿ���Ҫ���±����� 0:���±���(Ĭ��) 1:������, ����DATA_RECORD_RESIZE_*����ʹ��
	RECORDER_DISABLE_H265_REENCODE,		 //H265�������ƵԴ�Ƿ���Ҫ���±����� 0:���±���(Ĭ��) 1:������, ����DATA_RECORD_RESIZE_*����ʹ��
}GetSetType;

/**
 * ����Int32������
 *
 * @param[in] nPort	   ͨ����
 * @param[in] type     ���� 
 * @param[in] val      ���Ͷ�Ӧ��ֵ
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
PLAYSDK_API BOOL CALLMETHOD PLAY_SetInt32(LONG nPort, GetSetType type, int val);

/**
 * ��ȡInt32������
 *
 * @param[in] nPort	     ͨ����
 * @param[in] type       ���� 
 * @param[out] pval      ���Ͷ�Ӧ��ֵ
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
PLAYSDK_API BOOL CALLMETHOD PLAY_GetInt32(LONG nPort, GetSetType type, int* pVal);

/**
 * ��ȡDouble������
 *
 * @param[in]  nPort	   ͨ����
 * @param[in]  nRegionNum  ��ʾ�������,0~(MAX_DISPLAY_WND-1),���Ϊ0,�����õ�������ʾ����������
 * @param[in]  type        ���� 
 * @param[out] pval        ���Ͷ�Ӧ��ֵ
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
PLAYSDK_API BOOL CALLMETHOD PLAY_GetDoubleRegion(LONG nPort, DWORD nRegionNum, GetSetType type, double* pVal);

/**
 * ���öԽ��Ƿ�����������������Ĭ�Ͽ�����IOSƽ̨����Ч
 *
 * @param[in]  bEnable  ΪTRUE��ʾ�򿪣�FALSE�ر�
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
PLAYSDK_API BOOL CALLMETHOD PLAY_SetSpeakerAutoEnable(BOOL bEnable);

/**
 * ���öԽ����������Ƿ����ļ����ԣ�Ĭ�Ϲرգ�Androidƽ̨����Ч
 *
 * @param[in]  bWriteData  ΪTRUE��ʾ��д�ļ���FALSE�ر�д�ļ�
 * @param[in] pConfigFilePath ������������㷨�����ļ�·�������ڲ�������
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
PLAYSDK_API BOOL CALLMETHOD PLAY_SetAecDebug(BOOL bWriteData, LPSTR pConfigFilePath);

/**
 * ����Ӳ����������ʹ�ܣ�Androidƽ̨����Ч
 *
 * @param[in] bEnable �Ƿ���Ӳ������������ΪTRUE��ʾ�򿪣�FALSE�رգ�Ĭ�Ϲر�
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_AecHardwareEnable(BOOL bEnable);

/**
 * ����,��֪����������װ��ʽ��
 *
 * @param[in] nPort ͨ����
 * @param[in] pFileHeadBuf �ļ�ͷ����
 * @param[in] nSize �ļ�ͷ����
 * @param[in] nBufPoolSize ���ò������д���������Ļ�������С����Χ��SOURCE_BUF_MIN~SOURCE_BUF_MAX
 * @param[in] nStreamType ������װ��ʽ,���STREAM_TYPE
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_OpenStreamEx(LONG nPort,PBYTE pFileHeadBuf,DWORD nSize,DWORD nBufPoolSize, DWORD nStreamType);

typedef enum
{
	PLAY_PARAM_RTP,					// RTP����
	PLAY_PARAM_RAWAUDIO = 9,		// ����Ƶ����(PCM��711������Ƶ��ʶ����)
	PLAY_PARAM_APPEND_VIDEO_PARAMSETS = 14, //������Ƶ������, ����RTP����ES��������ȡsdp�е�sps pps�������·�{��nal��ʽƴ��}
	PLAY_PARAM_SVAC2_FRI = 0x80,//һ������Ҫ�����
	PLAY_PARAM_SVAC2_TRI,//��������Ҫ�����
	PLAY_PARAM_SVAC2_FRI_ENCRYPT,//һ������
	PLAY_PARAM_SVAC2_TRI_PLAYBACK,//�طų�������������
	PLAY_PARAM_TELECOM_ENCRYPT,	  //�е������Ӽӽ���
	PLAY_PARAM_SYMBOLTEK_ENCRYPT, //��������
	PLAY_PARAM_SVAC2_SKF_ENCRYPT, //skf���ܵ�������Ҫ����ԭʼ������ز�����������дDECRYPT_PARAM

	PLAY_PARAM_DIAG_DEVICE_TIMEZONE = 0x90,//�����豸ʱ��
	PLAY_PARAM_DIAG_CLIENT_TIMEZONE,//���ÿͻ���ʱ��
}PLAY_PARAM_TYPE;

typedef struct
{
	unsigned int struct_size;
	unsigned int encode_type;				// ��������,���ENCODE_VIDEO_TYPE����
	unsigned int payload_type;				// ��������
	unsigned int audio_sample_rate;			// ������
	unsigned int audio_channels;			// ����
	unsigned int channel_count;				// ͨ����
	unsigned int channel_id;				// ͨ��ID
	unsigned int discard_flag;				// ������֡flag
	unsigned int audio_payload_type;		// ��Ƶ�غ�����
	unsigned int audio_encode_type;			// ��Ƶ�������ͣ����ENCODE_AUDIO_TYPE
	unsigned int deinter_lace;				// �⽻����Ϣ
	unsigned int frame_rate;				// ����֡��
}PLAY_RTP_PARSER_PARAM;

typedef struct
{
    unsigned int structSize;		// �ṹ���С
    unsigned int encodetype;		// ��Ƶ��������,���SP_ENCODE_AUDIO_TYPE
    unsigned int sampleRate;		// ������
    unsigned short bitsPerSample;	// ����λ��
    unsigned short channels;		// ����
    unsigned char reserved[8];		// �����ֶ�
}PLAY_RAWAUDIO_PARSER_PARAM;

/**
 * ����ͨ�ò���,��֪����������װ��ʽ��Ӧ�Ĳ�������
 *
 * @param[in] nParamType �����������PLAY_PARAM_TYPE
 * @param[in] pParam ���Ͷ�Ӧ�Ľṹ������
 * @param[in] nParamLen pParam�ṹ���С
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetParam(LONG nPort, int nParamType, const void* pParam, unsigned int nParamLen);

/**  
 * ���÷����ı�,��PLAY_RenderPrivateData(LONG nPort, BOOL bTrue, LONG nReserve)�ӿ�֮�����
 *
 * @param[in] language �����ı��ַ���
 * @return BOOL���ɹ�����true�����ɹ�����false
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetTranslateString(const char* language);

/**
 * ���ÿ���/�ر��������޷��л���
 *
 * @param[in] nPort	       ͨ����
 * @param[in] bEnable    ����/�ر�
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetSeamlessSwitch(LONG nPort, BOOL bEnable);

typedef enum
{
	VR_MODE_NONE = 0, //������VR
	VR_360,           //360��VR
	VR_180,           //180��VR
	VR_SEMI_360,      //360�Ȱ���VR
	VR_SEMI_180,      //180�Ȱ���VR
	VR_MODE_SIZE
}PANO_VR_MODE;

/**
 * ����ȫ��VRģʽ��
 *
 * @param[in] nPort	    ͨ����
 * @param[in] VRMode    VRģʽ
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetPanoVRMode(LONG nPort, PANO_VR_MODE VRMode);

 /**
 * @brief ���ڽ�ȫ��ͼ�е�����ӳ����VR��ͼ�µ�����
           p2DTransMatrix ��ȫ��ͼ�ϵ�����v = (x,y)ת��ΪVR�����ϵ�����v' = (x',y')
 * @param[in] nPort	       ͨ����
 * @param[in] nRegionNum ���ڱ�ţ����ڵ����ڵĳ�����ȡ0
 * @param[in] Inx,Iny ������ڴ������Ͻǵ�Ϊԭ�����������
 * @param[out] OutX,OutY ������ڴ�������Ϊԭ��Ĺ�һ������
 * @return BOOL,�ɹ�����TRUE��ʧ�ܷ���FALSE
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_GetVRCoord2DTrans(LONG nPort, DWORD nRegionNum, unsigned int InX, unsigned int InY, float* OutX, float* OutY);

/**
 * @brief ���ڽ�VR��ͼ�µ�����ӳ����ȫ��ͼ�е�����
 *            ��VR�����ϵ�����v = (x,y)ת��Ϊȫ��ͼ�ϵ�����v' = (x',y')
 * @param[in] nPort	       ͨ����
 * @param[in] nRegionNum ���ڱ�ţ����ڵ����ڵĳ�����ȡ0
 * @param[in] Inx,Iny ������ڴ�������Ϊԭ��Ĺ�һ���������귶Χ[-1,1]
 * @param[out] OutX,OutY ������ڴ������Ͻǵ�Ϊԭ�����������[0,winWidth],[0,winHeight]
 * @return BOOL,�ɹ�����TRUE��ʧ�ܷ���FALSE
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_GetVRCoord3DTrans(LONG nPort, DWORD nRegionNum, float InX, float InY, unsigned int* OutX, unsigned int* OutY);

/**
 * @brief ��ȡ��ǰ�Ѳ����������ܴ�С
 *
 * @param[in] nPort ͨ����
 * @return DWORD ��ǰ�Ѳ����������ܴ�С,��λ�ֽ�
 */
PLAYSDK_API DWORD CALLMETHOD PLAY_GetPlayedLength(LONG nPort); 

/**
 * �����Ƿ�֧�������MSEӲ����
 *
 * @param[in] bSupportH264MSE �Ƿ�֧��H264�����MSEӲ����
 * @param[in] bSupportH265MSE �Ƿ�֧��H265�����MSEӲ����
 * @return void
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetSupportWebMSE(LONG nPort, int bSupportH264MSE, int bSupportH265MSE);

/**
 * ����IOS�������·��
 *
 * @param[in] nPort	    ͨ����
 * @param[in] overrideType    ���·��
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 */
typedef enum
{
	AVAudioSession_InnerOverride = 0,	// �ɲ��ſ��ڲ�Ĭ�Ͽ������
	AVAudioSession_OutOverrideNone,		// �ⲿ����IOS AVAudioSession�������Ͳ
	AVAudioSession_OutOverrideSpeaker,  // �ⲿ����IOS AVAudioSession�����������
}AVAudioSession_OverrideType;
PLAYSDK_API BOOL CALLMETHOD PLAY_SetAVAudioSessionOverrideType(LONG nPort, AVAudioSession_OverrideType overrideType);

/************************************************************************/
//> ��Ч�ӿ�
/************************************************************************/

PLAYSDK_API BOOL CALLMETHOD PLAY_SetPandoraWaterMarkCallBack(LONG nPort, fGetWaterMarkInfoCallbackFunc pFunc, void* pUserData);
PLAYSDK_API BOOL CALLMETHOD PLAY_StartDeNoise(LONG nPort);
PLAYSDK_API BOOL CALLMETHOD PLAY_SetDeNoiseParams(LONG nPort, int nTemporal);
PLAYSDK_API BOOL CALLMETHOD PLAY_StopDeNoise(LONG nPort);
PLAYSDK_API BOOL CALLMETHOD PLAY_SetVideoPerTimer(int iVal);
PLAYSDK_API BOOL CALLMETHOD PLAY_GetVideoPerTimer(int* pVal);
PLAYSDK_API BOOL CALLMETHOD PLAY_InputVideoData(LONG nPort,PBYTE pBuf,DWORD nSize);
PLAYSDK_API BOOL CALLMETHOD PLAY_InputAudioData(LONG nPort,PBYTE pBuf,DWORD nSize);
typedef void (CALLBACK * fVerifyCBFun)(LONG nPort, FRAME_POS * pFilePos, DWORD bIsVideo, void* pUserData);
PLAYSDK_API BOOL CALLMETHOD PLAY_SetVerifyCallBack(LONG nPort, DWORD nBeginTime, DWORD nEndTime, fVerifyCBFun VerifyFun, void* pUserData);
typedef void (CALLBACK * fSourceBufCBFun)(LONG nPort,DWORD nBufSize, void* pUserData,void*pResvered);
PLAYSDK_API BOOL CALLMETHOD PLAY_SetSourceBufCallBack(LONG nPort,
													  DWORD nThreShold,
													  fSourceBufCBFun SourceBufCBFun,
													  void* pUserData,
													  void *pReserved);
PLAYSDK_API BOOL CALLMETHOD PLAY_ResetSourceBufFlag(LONG nPort);
PLAYSDK_API DWORD CALLMETHOD PLAY_GetDisplayBuf(LONG nPort);
PLAYSDK_API BOOL CALLMETHOD PLAY_SetDisplayType(LONG nPort,LONG nType);
PLAYSDK_API LONG CALLMETHOD PLAY_GetDisplayType(LONG nPort);
PLAYSDK_API BOOL CALLMETHOD PLAY_RefreshPlayEx(LONG nPort,DWORD nRegionNum);
PLAYSDK_API BOOL CALLMETHOD PLAY_CloseStreamEx(LONG nPort);
PLAYSDK_API BOOL CALLMETHOD PLAY_AdjustFluency(LONG nPort, int level);
PLAYSDK_API BOOL CALLMETHOD PLAY_SurfaceChange(LONG nPort, HWND hWnd);
typedef void (CALLBACK* fMultiFrameCallBack)(LONG nPort, LONG nStreamID, void* pUserData, LONG nReserved);
PLAYSDK_API BOOL CALLMETHOD PLAY_SetMultiFrameCallBack(LONG nPort, fMultiFrameCallBack MultiFrameCallBack, void* pUser);
PLAYSDK_API BOOL CALLMETHOD PLAY_SetRenderMode(LONG nPort, RenderType nMode);
typedef enum
{
	FISHSHOWMODE_WALL_PANORAMA = 0,       
	FISHSHOWMODE_CEIL_PANORAMA,          
	FISHSHOWMODE_CEIL_PANORAMA_TWO,       
	FISHSHOWMODE_FLOOR_PANORAMA,          
	FISHSHOWMODE_FLOOR_PANORAMA_TWO,      
	FISHSHOWMODE_ONE_O_THREE,            
	FISHSHOWMODE_CEIL_ONE_REGION = 10,    
	FISHSHOWMODE_CEIL_FOUR_REGION,        
	FISHSHOWMODE_ORIGINAL,               
	FISHSHOWMODE_WALL_ONE_REGION,         
	FISHSHOWMODE_WALL_FOUR_REGION,       
	FISHSHOWMODE_FLOOR_ONE_REGION,        
	FISHSHOWMODE_FLOOR_FOUR_REGION,       
	FISHSHOWMODE_WALL_ONE_O_THREE,	      
	FISHSHOWMODE_CEIL_ONE_O_THREE,	     
	FISHSHOWMODE_FLOOR_ONE_O_THREE,	     
}FISHSHOWMODES;
typedef enum
{
	FISHEPTZOPT_UPDATE_FOCUS,                   
	FISHEPTZOPT_ZOOM_IN,                        
	FISHEPTZOPT_ZOOM_OUT,                       
	FISHEPTZOPT_MOVE_UP,                       
	FISHEPTZOPT_MOVE_DOWN,                      
	FISHEPTZOPT_MOVE_LEFT,                      
	FISHEPTZOPT_MOVE_RIGHT,                     
	FISHEPTZOPT_AUTO_ROTATE_CLOCKWISE,          
	FISHEPTZOPT_AUTO_ROTATE_COUNTERCLOCKWISE,  
	FISHEPTZOPT_STOP_AUTO_ROTATE,				
	FISHEPTZOPT_GET_POSITION,					
	FISHEPTZOPT_SELECT_REGION_ZOOMIN_ON,       
	FISHEPTZOPT_SELECT_REGION_ZOOMIN_OFF,		
	FISHEPTZOPT_RESTORE_DEFAULT_LOCATION,		
}FISHEPTZOPTS;
PLAYSDK_API BOOL CALLMETHOD PLAY_SetFisheyeParams(LONG nPort, int nX, int nY, int nRadius, int nLensDirection, FISHSHOWMODES mode);
PLAYSDK_API BOOL CALLMETHOD PLAY_FisheyeGetPosition(LONG nPort, int row, int column, int *pX, int *pY);
PLAYSDK_API BOOL CALLMETHOD PLAY_OldFisheyeEptzUpdate(LONG nPort, int *pX, int *pY, int *pHAngle, int *pVAngle, FISHEPTZOPTS ops, int nWinNum,
													  int nZoomStep, int nPtStep, int nRotateStep);
PLAYSDK_API BOOL CALLMETHOD PLAY_FisheyeTrancFormTrackFrame(LONG nPort, void *ptrackframe,int track_frame_size);
PLAYSDK_API BOOL CALLMETHOD PLAY_InitDDraw(HWND hWnd);
PLAYSDK_API int	CALLMETHOD PLAY_GetCaps();
PLAYSDK_API DWORD CALLMETHOD PLAY_GetFileHeadLength();
PLAYSDK_API BOOL CALLMETHOD PLAY_RealeseDDraw();
PLAYSDK_API DWORD CALLMETHOD PLAY_GetDDrawDeviceTotalNums();
PLAYSDK_API BOOL CALLMETHOD PLAY_SetDDrawDevice(LONG nPort,DWORD nDeviceNum);
PLAYSDK_API BOOL CALLMETHOD PLAY_GetDDrawDeviceInfo(DWORD nDeviceNum,LPSTR  lpDriverDescription,DWORD nDespLen,LPSTR lpDriverName ,DWORD nNameLen,LONG *hhMonitor);
PLAYSDK_API int	CALLMETHOD PLAY_GetCapsEx(DWORD nDDrawDeviceNum);
PLAYSDK_API BOOL CALLMETHOD PLAY_ThrowBFrameNum(LONG nPort,DWORD nNum);
PLAYSDK_API BOOL CALLMETHOD PLAY_InitDDrawDevice();
PLAYSDK_API void CALLMETHOD PLAY_ReleaseDDrawDevice();
PLAYSDK_API BOOL CALLMETHOD PLAY_Back(LONG nPort);
PLAYSDK_API BOOL CALLMETHOD PLAY_SetDDrawDeviceEx(LONG nPort,DWORD nRegionNum,DWORD nDeviceNum);
PLAYSDK_API BOOL CALLMETHOD PLAY_SetOverlayMode(LONG nPort,BOOL bOverlay,COLORREF colorKey);
PLAYSDK_API LONG CALLMETHOD PLAY_GetOverlayMode(LONG nPort);
PLAYSDK_API COLORREF CALLMETHOD PLAY_GetColorKey(LONG nPort);
PLAYSDK_API BOOL CALLMETHOD PLAY_SetTimerType(LONG nPort,DWORD nTimerType,DWORD nReserved);
PLAYSDK_API BOOL CALLMETHOD PLAY_GetTimerType(LONG nPort,DWORD *pTimerType,DWORD *pReserved);
PLAYSDK_API BOOL CALLMETHOD PLAY_SetMDRange(LONG nPort,DISPLAYRECT* rc,DWORD nVauleBegin,DWORD nValueEnd,DWORD nType);
PLAYSDK_API BOOL CALLMETHOD PLAY_SetMDThreShold(LONG nPort, DWORD ThreShold);
PLAYSDK_API DWORD CALLMETHOD PLAY_GetMDPosition(LONG nPort, DWORD Direction, DWORD nFrame, DWORD* MDValue);
typedef void (CALLBACK *CutProgressFunc)(DWORD nPort, int iProgress, DWORD dwUser);
PLAYSDK_API BOOL CALLMETHOD PLAY_CutFileSegment(LONG nPort, 
												LONG lBeginTime, 
												LONG lEndTime, 
												CutProgressFunc pFunc, 
												char *sOutFilePath, 
												DWORD dwUser);
PLAYSDK_API BOOL CALLMETHOD PLAY_ChangeRate(LONG nPort, int rate);
PLAYSDK_API BOOL CALLMETHOD PLAY_SetDisplayScale(LONG nPort, float fScale, DWORD nRegionNum);
PLAYSDK_API BOOL CALLMETHOD PLAY_SetMemMinimized(LONG nPort);
PLAYSDK_API BOOL CALLMETHOD PLAY_EnableRecitfy(LONG nPort,BOOL bEnable);
//> ����Ϊ��Ч�ӿ�
/************************************************************************/

/*�켣��ṹ*/
typedef struct _IVS_POINT
{
	/*************************************************
	** �켣����������Ӿ��ε�����, ����X, Y��XSize, YSize����õ�
	** ������Ӿ�������left,top,right,bottom ����Ϊ(X-XSize, Y-YSize, X+XSize, Y+YSize)
	** The locus point is the center of the outer rectangle of the object
	** According to X,Y, XSize and YSize, the outer rectangle coordinates of the object are
	** (X-XSize, Y-YSize, X+XSize, Y+YSize)
	**************************************************/
	unsigned short x;
	unsigned short y;
	unsigned short xSize;
	unsigned short ySize;
}IVS_POINT;

//0x80�������԰�, �������Ͷ���
typedef enum
{
	IVS_TrafficVehicleUnknow = 0,		//δ֪
	IVS_TrafficVehiclePassengerCar,		//�ͳ�
	IVS_TrafficVehicleLargeTruck,		//�����
	IVS_TrafficVehicleMidTruck,			//�л���
	IVS_TrafficVehicleSaloonCar,		//�γ�
	IVS_TrafficVehicleMicrobus,			//�����
	IVS_TrafficVehicleMicroTruck,		//С����
	IVS_TrafficVehicleTricycle,			//���ֳ�
	IVS_TrafficVehicleMotor,			//Ħ�г�
	IVS_TrafficVehiclePasserby,			//����
	IVS_TrafficVehicleSuvMpv,			//SUV-MPV
	IVS_TrafficVehicleMidPassengerCar,	//�пͳ�
	IVS_TrafficVehicleTankCar,			//Σ��Ʒ����(���⳵��)
	IVS_TrafficVehicleSUV,				//SUV
	IVS_TrafficVehicleMPV,				//MPV
	IVS_TrafficVehicleBus,				//������
	IVS_TrafficVehiclePickup,			//Ƥ����
	IVS_TrafficVehicleMiniCarriage,		//΢�ͳ�
	IVS_TrafficVehicleOilTankTruck,		//�͹޳�(���⳵��)
	IVS_TrafficVehicleSlotTankCar,   	//�۹޳�(���⳵��)
	IVS_TrafficVehicleColdChainCar,   	//������(���⳵��)
	IVS_TrafficVehicleDregsCar,			//������(���⳵��)
	IVS_TrafficVehicleConcreteMixerTruck,	//���������賵(���⳵��)
	IVS_TrafficVehicleTaxi,             //���⳵(���⳵��)
	IVS_TrafficVehiclePolice,           //����(���⳵��)
	IVS_TrafficVehicleAmbulance,        //�Ȼ���(���⳵��)
	IVS_TrafficVehicleGeneral,          //��ͨ��(���⳵��)
	IVS_TrafficVehicleWateringCar,      //������(������ˮ��������������ɨ����)(���⳵��)
	IVS_TrafficVehicleReserved2,   		//����2(���⳵��)
	IVS_TrafficVehicleFireEngine,       //������(���⳵��)
	IVS_TrafficVehicleTractor,          //������(���⳵��)
	IVS_TrafficVehicleMachineshopTruck, //���̳�(���⳵��)
	IVS_TrafficVehiclePowerLotVehicle,  //�������ϳ�(���⳵��)
	IVS_TrafficVehicleSuctionSewageTruck,	//���۳�(���⳵��)
	IVS_TrafficNormalVehicleTankTruck,  	//��ͨ�޳�(���⳵��) 
	IVS_TrafficVehicleTwocycle,          	//���ֳ�
	IVS_TrafficVehicleSchoolBus,			//У��(���⳵��) 
	IVS_TrafficVehicleExcavator,			//�ھ�(���⳵��)
	IVS_TrafficVehicleBulldozer,			//������(���⳵��)
	IVS_TrafficVehicleCrane,				//����(���⳵��)
	IVS_TrafficVehiclePumptruck,			//�ó�(���⳵��)
	IVS_TrafficVehicleEscort,				//Ѻ�˳�(���⳵��)
	IVS_TrafficVehicleShovelLoader,			//����(���⳵��)
	IVS_TrafficVehiclePoultry	=  46,		//����(���⳵��)

	IVS_TrafficVehicleBicycle                    = 201, //���г�  
	IVS_TrafficVehicleVanTricycle        		= 202, //��ʽ���ֳ�
	IVS_TrafficVehicleMannedConvertibleTricycle   = 203, //���˳������ֳ�
	IVS_TrafficVehicleNoMannedConvertibleTricycle = 204, //�����˳������ֳ�
	IVS_TrafficVehicleElectricbike = 205, //���ֵ�ƿ��
} IVS_TRAFFIC_VEHICLE_TYPE;

//0x80�������԰�,64�ֽ�
typedef struct
{
	unsigned char colorVailed;	//��ɫ�Ƿ���Ч
	unsigned char carModel;		//����,���IVS_TRAFFIC_VEHICLE_TYPE
	unsigned short brand;		//Ʒ�Ƴ���

	unsigned char color_r;		//��ɫ��Ϣ, ��(��colorVailed�ֶ�Ϊ1ʱ��Ч)
	unsigned char color_g;		//��ɫ��Ϣ, ��(��colorVailed�ֶ�Ϊ1ʱ��Ч)
	unsigned char color_b;		//��ɫ��Ϣ, ��(��colorVailed�ֶ�Ϊ1ʱ��Ч)
	unsigned char color_a;		//��ɫ��Ϣ, ͸��(��colorVailed�ֶ�Ϊ1ʱ��Ч)

	unsigned short subbrand;	//��Ʒ��
	unsigned short year;		//���
	IVS_POINT windowPosition;//����λ��
	unsigned char nReliabilityOfVehicleBodyDetection;	//���������Ŷȣ�0��ʾ�㷨δ�ṩ��ȡֵ��ΧΪ1-100

	unsigned char reserved[43];	//Ԥ��
}IVS_TRAFFIC_ATTRIBUTE_80;

//0x81������Ա���԰�,64�ֽ�
typedef struct
{
	IVS_POINT mainPosition;		//����ʻλ
	IVS_POINT coPosition;		//����ʻλ
	unsigned char mainSafetyBelt;	//���ݰ�ȫ����Ϣ  0-Unknown 1-not 2-yes
	unsigned char coSafetyBelt;		//���ݰ�ȫ����Ϣ  0-Unknown 1-not 2-yes
	unsigned char mainSunvisor;		//������������Ϣ  0-Unknown 1-not 2-yes
	unsigned char coSunvisor;		//������������Ϣ  0-Unknown 1-not 2-yes
	unsigned char reserved[44];		//����
}IVS_TRAFFIC_ATTRIBUTE_81;

//0x82�����������԰�,256�ֽ�
typedef struct
{
	unsigned char plateEncode;		//���Ʊ���0-ASCII, 1-UCS-4LE
	unsigned char plateInfoLen;		//������Ϣ����
	unsigned char reserved[2];		//����
	unsigned char plateInfo[252];	//������Ϣ
}IVS_TRAFFIC_ATTRIBUTE_82;

//0x83��������
typedef enum
{
	IVS_TrafficPlateTypeUnknown = 0,	//δ֪
	IVS_TrafficPlateTypeNormal,			//����
	IVS_TrafficPlateTypeYellow,			//����
	IVS_TrafficPlateTypeDoubleYellow,	//˫���β��
	IVS_TrafficPlateTypePolice,			//����
	IVS_TrafficPlateTypeArmed,			//�侯�� (5)

	IVS_TrafficPlateTypeTrainning = 9,  //����������
	IVS_TrafficPlateTypePersonal,		//���Ժ��� (10)
	IVS_TrafficPlateTypeAgri,			//ũ����
	IVS_TrafficPlateTypeEmbassy,		//ʹ�ݺ���
	IVS_TrafficPlateTypeMoto,			//Ħ�г�����
	IVS_TrafficPlateTypeTractor,		//����������
	IVS_TrafficPlateTypeOther,			//��������  (15)
	IVS_TrafficPlateType02Type,			//02���Գ���
	IVS_TrafficPlateTypeNewEnergy,		//����Դ����
	IVS_TrafficPlateTypeEleMoto,		//�綯������
	IVS_TrafficPlateTypeEmergency,      //Ӧ������

	IVS_TrafficPlateTypeTemporary = 26,	  //��ʱ����
	IVS_TrafficPlateTypeElectricTricycle, //�綯���ֳ�

	IVS_TrafficPlateTypeNormalBlack = 39, //�й���ɫ����
	IVS_TrafficPlateTypeRed = 41,		  //����
	IVS_TrafficPlateTypeCyan = 42,		  //����
	IVS_TrafficPlateTypeWhite = 43,		  //����
	IVS_TrafficPlateTypeNewESmall = 44,	  //���綯����ԴС��
	IVS_TrafficPlateTypeNewELarge = 45,	  //���綯����Դ��
	IVS_TrafficPlateTypeMixedNewESmall = 46,	//�������ԴС��
	IVS_TrafficPlateTypeMixedNewELarge = 47,	//�������Դ��
	IVS_TrafficPlateTypeRiGang = 48,			//�ոֳ���
} IVS_TRAFFIC_PLATE_CATEGORY;

//0x83�����������԰�,64�ֽ�
typedef struct
{
	unsigned char colorVailed;		//��ɫ�Ƿ���Ч
	unsigned char reserved[3];		//����
	unsigned int color;				//��ɫ��ϢRGBA(��colorVailed�ֶ�Ϊ1ʱ��Ч)

	unsigned char strCountry[4];	//���ƹ����ַ���
	unsigned short plateType;		//��������, ���IVS_TRAFFIC_PLATE_CATEGORY����
	unsigned short plateWidth;		//�������ƻ���ľ��Կ��
	unsigned char  plateConfidence;	//�������Ŷ�
	unsigned char  reserved1[47];	//Ԥ��
}IVS_TRAFFIC_ATTRIBUTE_83;

//0x84����켣����Ϣ,512�ֽ�
typedef struct
{
	unsigned char fatherCount;		//��ID����,δʹ��
	unsigned char pointCount;		//�����ӹ켣�����
	unsigned char trackType;		//�켣����,0��ʾIVS����켣,1��ʾ��������켣
	unsigned char reserved;			//����

	IVS_POINT trackPoint[32];		//�켣����Ϣ
	unsigned int  fatherID[63];		//��ID�б�,δʹ��

}IVS_TRAFFIC_ATTRIBUTE_84;

//0x87Ŀ����ֲ��켣����,64�ֽ�
typedef struct
{
	IVS_POINT trackPoint;		//Ŀ���λ��(����8192����ϵ)
	unsigned short staytime;	//Ŀ������ʱ��,��λ��
	unsigned char reserved[54];
}IVS_TRAFFIC_ATTRIBUTE_87;

//0x90�Ŷ�����ʱ�����԰�
typedef struct
{
	unsigned int m_QueuingTime;        	//�Ŷ�����ʱ��,��λ��
	unsigned char reserved[12];    		//Ԥ��
}IVS_ATTRIBUTE_90;

//���԰�ʹ�ܱ�ʶ
#define IVS_ATTRIBUTE_FLAG_80	(1 << 0)
#define IVS_ATTRIBUTE_FLAG_81	(1 << 1)
#define IVS_ATTRIBUTE_FLAG_82	(1 << 2)
#define IVS_ATTRIBUTE_FLAG_83	(1 << 3)
#define IVS_ATTRIBUTE_FLAG_84	(1 << 4)
#define IVS_ATTRIBUTE_FLAG_87	(1 << 7)
#define IVS_ATTRIBUTE_FLAG_90	(1 << 16)

//�������԰��ṹ
typedef struct _IVS_OBJ_ATTR_UNIT
{
	unsigned int nAttrFlag;				// ���԰�ʹ�ܱ�ʶ,���IVS_ATTRIBUTE_FLAG_*
	unsigned int nAttrDataLen;			// ���԰�����
	unsigned char* pAttrBuf;			// ���԰�����, ��ʹ�ܱ�ʶ��ȡ��Ӧ���԰�
}IVS_OBJ_ATTR_UNIT;

typedef enum
{
	IVS_OBJECT_TYPE_ANYTHING = 0,  //δ֪(δ��������ʶ������)
	IVS_OBJECT_TYPE_HUMAN = 1,		//����
	IVS_OBJECT_TYPE_VEHICLE = 2,   //������
	IVS_OBJECT_TYPE_PLATE = 5,		//����
	IVS_OBJECT_TYPE_HUMAN_FACE = 6, //��FACE
	IVS_OBJECT_TYPE_ANIMAL = 8,	 //����		
	IVS_OBJECT_TYPE_NORMAL_OBJECT = 13,//��ͨ����(��ANYTHING�������Ǿ���������ʶ��ȷ�����˷ǳ�������ȷ������������)
	IVS_OBJECT_TYPE_NONMOTOR = 17,  //�ǻ�����
}IVS_OBJECT_TYPE;

//IVS����Ŀ��ṹ��
typedef struct _IVS_OBJ_INFO
{
	unsigned int classID;				// ҵ�����ID
	unsigned int objID;					// Ŀ��ID
	IVS_POINT trackPoint;				// �켣����Ϣ, Ŀ������(objType)Ϊ������ʱ��Ч���������(pointValidΪ1)ʱ��Ч

	unsigned char objType;				// Ŀ������,���IVS_OBJECT_TYPE����
	unsigned char pointValid;			// �����Ƿ����
	unsigned char operatorType;			// ���²�������,��������(1),��������켣��(2),ɾ������(3),��������켣(4)
	unsigned char reserved[29];			// �����ֶ�

	unsigned int		nAttrCount;		// Ŀ��Я�����԰�����
	IVS_OBJ_ATTR_UNIT*	pAttrData;		// ���԰�����
}IVS_OBJ_INFO;
/*
 * IVS����Ŀ��ص���������
 *
 * @param[in] pIVSBuf �ص�����ָ�룬���ݽṹ��IVS_OBJ_INFO
 * @param[in] nIVSBufLen ���ݳ���
 * @param[in] nFrameSeq  ��Ӧ����Ƶ֡���
 * @param[in] pReserved ��������,֡��Ϣ,ָ��FRAME_INFO_EX�ṹ
 * @param[in] pUserData �Զ������
 */
typedef void (CALLMETHOD *fIVSObjAttrCBFun)(char* pIVSBuf, LONG nIVSBufLen, LONG nFrameSeq, void* pReserved, void* pUserData);
/*
 * IVS����Ŀ��ص�����
 *
 * @param[in] nPort ͨ����
 * @param[in] pFunc �ص�����
 * @param[in] pUserData �Զ������
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetIVSObjAttrCBFun(LONG nPort, fIVSObjAttrCBFun pFunc, void* pUserData);

/**
 * ������������չ�ӿ�, ֧��Android5.0����ϵͳjava��Ӳ����, �ڳ�ʼ���׶�ע��(����������ǰ)
 *
 * @param[in] nPort �˿ں�   
 * @param[in] decodeHook ���õĽ��뺯��
 * @param[in] pUserData �û�����  
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */	
typedef struct
{
	int    nWidth;      // ͼ����
	int    nHeight;		// ͼ��߶�
	int    nCodecType;  // ��������  
	int    nFrameRate;  // ֡��
}DECODE_OPEN_PARAM;

typedef struct
{
	unsigned char*   pBitstream; // ���������׵�ַ
	int     nLength;			 // ������������
}DECODE_INPUT_PARAM;

typedef struct
{
	unsigned char*  data[3];   // ��Ž����YUV�ڴ��,�ڴ��ڲ������
	int    stride[3];	   // ������
	int    nWidth[3];	   // ���֡��
	int    nHeight[3];     // ���֡��
	int    nIsUseful;      // 0��ʾ��������� 1��ʾ��Ч
}DECODE_OUTPUT_PARAM;

typedef struct _ThirdDecodeHook
{ 
	BOOL (*Decoder_Open)(void* handle, DECODE_OPEN_PARAM* pFrameInfo);     // �򿪽�����
	BOOL (*Decoder_Decode)(void* handle, DECODE_INPUT_PARAM* pInParam , DECODE_OUTPUT_PARAM* pOutParam); // ����
	BOOL (*Decoder_Close)(void* handle); // �رս�����
	void* handle;  //�����������
	void* Reserved[64];
}ThirdDecodeHook;
PLAYSDK_API BOOL CALLMETHOD PLAY_RegisterDecodeHook(LONG nPort, ThirdDecodeHook* decodeHook);

/**
 * @brif ���������ֽṹ��
 */
 typedef struct profiled_window_mask
 {
 	char*			pMaskData;		    // ����λͼ���ݣ�R8��ʽ��ÿλ��ֵ��ΧΪ[0,255]  255��ȫ��͸����0Ϊȫ͸��
 	unsigned int	width;	            // ����λͼ���
 	unsigned int 	height;         	// ����λͼ�߶�
 }ProfieldWindowMask;

/*
 * ���δ��ڻ��ƹ��ܣ���֧��Windows��
 *
 * @param[in] nPort ͨ����
 * @param[in] bEnable TRUE�����δ��ڴ���FALSE�ر����δ��ڴ���
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_DrawProfiledWindow(LONG nPort, BOOL bEnable, ProfieldWindowMask* pMask);

/*
 * �����Ƿ����Զ�׷�ٹ���(��������)��
 *
 * @param[in] nPort ͨ����
 * @param[in] bEnable �Զ�����ʹ��
 * @param[in] MutiTargetTactic ��Ŀ������µĸ��ٲ��� 0���������٣�1������������������
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_EnableAutoTrack(LONG nPort, BOOL bEnable, int MutiTargetTactic);
//��Ϣ�ص���֪ͨ��ǰ�Ƿ��ڸ���״̬
typedef void (CALLMETHOD *fAutoTrackInfoCallbackFunc)(BOOL bEnable, void* pUserData);
/**
 * @brif �Զ���������ѡ��ṹ��
 */
 typedef struct auto_track_config
 {
	unsigned int	nTrackRegionNum;		//׷�ٴ��ں�
	HWND			nTrackHWnd;		//׷�ٴ��ھ��
	unsigned int	nGeneralViewRegionNum;		//ȫ�����ں�
	HWND			nGeneralViewHWnd; //ȫ�����ھ��
 	unsigned int 	nObjType;         	//Ŀ������
	fAutoTrackInfoCallbackFunc  pAutoTrackFunc;   //��Ϣ֪ͨ�ص�
	int				x;      //Ĭ��Ŀ��������������
	int				y;		
	int				xSize;	//Ĭ��Ŀ�����򳤿�/2
	int				ySize;
	int				minXSize; //����Ŀ����С�����򳤶�/2
	int				minYSize;//����Ŀ����С������߶�/2
	bool			bDrawIvs;//�߿����ʹ��
	int				nScale;//�߿�Ŵ���(1=1.1��,2=1.2����Ĭ��Ϊ1.8��)
	float			thresholdScale;	//�Ŵ󴥷���ֵ������Ĭ��0.5��
	void*			pUserData;			//�û�͸������
 }AutoTrackConfig;
/*
 * ���ô������ڵ��Զ�׷�ٹ���(�ֳ�)��
 *
 * @param[in] nPort ͨ����
 * @param[in] pTrackConfig ׷����������
 * @param[in] bEnable ʹ��
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetMutiWindowAutoTrack(LONG nPort, AutoTrackConfig* pAutoTrackConfig , BOOL bEnable);

/**
 * @brief  ������ϴ��ھ��
 * @param[in] nPort ͨ����   
 * @param[in] hDiagWnd �ⲿ��������ϴ���,һ������Ƶ�����ϲ�
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_SetDiagHwnd(LONG nPort,HWND hDiagWnd);

/**
 * @brief ������⹦��
 * @param[in] nPort ͨ����
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_OpenDiag(LONG nPort);

/**
 * @brief  ����ϴ��ڵ��ӵ���������
 * @param[in] nPort ͨ����
 * @param[in] nCurveType��������
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_DiagOverlayCurve(LONG nPort,int nCurveType);

/**
 * @brief �ر���Ϲ���
  * @param[in] nPort ͨ���� 
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_CloseDiag(LONG nPort);

/*
 * @brief ������ϱ���
  * @param[in] nPort ͨ����
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_DiagExportReport(LONG nPort,char* pPathName);


/**
 * ��Ƶ�������ܵĻص�������
 *
 * @param[in] nPort     ͨ����
 * @param[in] pData     ����ָ��
 * @param[in] nDataLen  ���ݳ���
 * @param[in] pUserData �û�����
 */
typedef void (CALLBACK* fVideoTwinsDataCBFun)(LONG nPort, unsigned char* pData, int nDataLen, void* pUserData);

//��Ƶ�����������ò���
struct VideoTwinsAlgorithmConfig
{
	int	 bUnDistort;	//ȥ����ʹ��
	char* UnDistortConfigInfo;

	int  b3DFusion;		//3D�ں�����ʹ��
	char* fusionConfigInfo;
	char* calibConfiginfo;

	int	cameraID[8]; //8·���ID
};

/**
 * ������Ƶ��������,��PLAY_Play֮����á�
 *
 * @param[in] nPort      ͨ����
 * @param[in] bEnable    ʹ��
 * @param[in] pAlCfg    �㷨���ò���
 * @param[in] fListenter �ص�����
 * @param[in] pUserData  �û�����
 * @return BOOL���ɹ�����TRUE��ʧ�ܷ���FALSE
 * @note �������ʧ�ܣ����Ե���PLAY_GetLastErrorEx�ӿڻ�ȡ�����롣
 */
PLAYSDK_API BOOL CALLMETHOD PLAY_EnableVideoTwins(LONG nPort, BOOL bEnable,VideoTwinsAlgorithmConfig* pAlCfg ,fVideoTwinsDataCBFun fListenter, void* pUserData);

#ifdef	__cplusplus
}
#endif

#endif



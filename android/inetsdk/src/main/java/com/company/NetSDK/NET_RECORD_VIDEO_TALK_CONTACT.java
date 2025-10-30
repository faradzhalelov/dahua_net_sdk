package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* contact record set info 
* \else
* 联系人记录记录集信息
* \endif
*/
public class NET_RECORD_VIDEO_TALK_CONTACT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * record  set no., read-only
	 * \else
	 * 记录集编号,只读
	 * \endif
	 */
    public int                                      nRecNo;                                 
    
	 /**
	 * \if ENGLISH_LANG
	 * create time
	 * \else
	 * 创建时间
	 * \endif
	 */
    public NET_TIME                                 stuCreateTime = new NET_TIME();                          
    
	 /**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * 名字
	 * \endif
	 */
    public byte[]                                   szFirstName = new byte[FinalVar.SDK_COMMON_STRING_32];      
    
	 /**
	 * \if ENGLISH_LANG
	 * last name
	 * \else
	 * 姓
	 * \endif
	 */
    public byte[]                                   szFamilyName = new byte[FinalVar.SDK_COMMON_STRING_32];      
    
	 /**
	 * \if ENGLISH_LANG
	 * visual talk short no.
	 * \else
	 * 可视对讲短号
	 * \endif
	 */
    public byte[]                                   szVTShortNumber = new byte[FinalVar.SDK_COMMON_STRING_16];   
    
	 /**
	 * \if ENGLISH_LANG
	 * visual talk middle no.
	 * \else
	 * 可视对讲中号
	 * \endif
	 */
    public byte[]                                   szVTMiddleNumber = new byte[FinalVar.SDK_COMMON_STRING_32];  
    
	 /**
	 * \if ENGLISH_LANG
	 * visual talk long no., or VTH analogue VTH SN
	 * \else
	 * 可视对讲长号,或VTH模拟室内机的序列号
	 * \endif
	 */
    public byte[]                                   szVTLongNumber = new byte[FinalVar.SDK_COMMON_STRING_64];    
    
	 /**
	 * \if ENGLISH_LANG
	 * visual talk network address
	 * \else
	 * 可视对讲网络地址
	 * \endif
	 */
    public byte[]                                   szVTNetAddress = new byte[FinalVar.SDK_MAX_IPADDR_LEN_EX];   
    
	 /**
	 * \if ENGLISH_LANG
	 * VTH link to VTO position
	 * \else
	 * 室内机关联的门口机位置
	 * \endif
	 */
    public byte[]                                   szVTOPosition = new byte[FinalVar.SDK_COMMON_STRING_64];     
    
	 /**
	 * \if ENGLISH_LANG
	 * visual talk analogue VTH input mode , refer to {@link EM_VIDEO_TALK_CONTACT_VTSLAVEBINDMODE}
	 * \else
	 * 可视对讲模拟室内机接入时的模式, 取值参考 {@link EM_VIDEO_TALK_CONTACT_VTSLAVEBINDMODE}
	 * \endif
	 */
    public int   									emVTSlaveBindMode;                      
    
	 /**
	 * \if ENGLISH_LANG
	 * visual talk analogue  VTH input distributor address
	 * \else
	 * 该字段已废弃,使用 nVTSubId
	 * \endif
	 * @deprecated
	 */
    public byte[]                                   szVTSlaveId = new byte[FinalVar.SDK_COMMON_STRING_32];       
    
	 /**
	 * \if ENGLISH_LANG
	 * visual talk analogue  VTH input distributor port
	 * \else
	 *  该字段已废弃,使用 nVTSubPort
	 * \endif
	 * @deprecated
	 */
    public byte[]                                   szVTSlavePort = new byte[FinalVar.SDK_COMMON_STRING_32];     
    
	 /**
	 * \if ENGLISH_LANG
	 * visual talk analogue VTH address
	 * \else
	 * 可视对讲模拟室内机的地址
	 * \endif
	 */
    public byte[]                                   szVTSlaveAddress = new byte[FinalVar.SDK_COMMON_STRING_64];  
    
	 /**
	 * \if ENGLISH_LANG
	 * nickname
	 * \else
	 * 昵称
	 * \endif
	 */
    public byte[]                                   szNickname = new byte[FinalVar.SDK_COMMON_STRING_64];        
    
	 /**
	 * \if ENGLISH_LANG
	 * note
	 * \else
	 * 备注
	 * \endif
	 */
    public byte[]                                   szNotes = new byte[FinalVar.SDK_COMMON_STRING_64];           
    
	 /**
	 * \if ENGLISH_LANG
	 * user type, refer to {@link EM_VIDEO_TALK_CONTACT_TYPE}
	 * \else
	 * 用户类型, 取值参考  {@link EM_VIDEO_TALK_CONTACT_TYPE}
	 * \endif
	 */
    public int              						emType;                                 
    
	 /**
	 * \if ENGLISH_LANG
	 * registration method, refer to  {@link EM_VIDEO_TALK_CONTACT_REGISTER_TYPE}
	 * \else
	 * 注册方式, 取值参考 {@link EM_VIDEO_TALK_CONTACT_REGISTER_TYPE}
	 * \endif
	 */
    public int                                      emRegisterType;                         
    
	 /**
	 * \if ENGLISH_LANG
	 * registration password
	 * \else
	 * 注册密码
	 * \endif
	 */
    public byte[]                                   szVTHPassword = new byte[FinalVar.SDK_COMMON_STRING_64];     
    
	 /**
	 * \if ENGLISH_LANG
	 * building no.
	 * \else
	 * 所属幢号
	 * \endif
	 */
    public byte[]                                   szVTOBuilding = new byte[FinalVar.SDK_COMMON_STRING_64];    
    
	 /**
	 * \if ENGLISH_LANG
	 * unit no.
	 * \else
	 * 所属单元号
	 * \endif
	 */
    public byte[]                                   szVTOUnit = new byte[FinalVar.SDK_COMMON_STRING_64];         
    
	 /**
	 * \if ENGLISH_LANG
	 * group
	 * \else
	 * 所属群组
	 * \endif
	 */
    public byte[]                                   szGroupNumber = new byte[FinalVar.SDK_COMMON_STRING_64];     
    
	 /**
	 * \if ENGLISH_LANG
	 * Visual simulation of indoor machine distributor address
	 * \else
	 * 可视对讲模拟室内机接入时的分配器地址
	 * \endif
	 */
    public int                                      nVTSlaveId;                             
    
	 /**
	 * \if ENGLISH_LANG
	 * Visual simulation of indoor machine distributor port
	 * \else
	 * 可视对讲模拟室内机接入时的分配器端口
	 * \endif
	 */
    public int                                      nVTSlavePort;                           

	

}

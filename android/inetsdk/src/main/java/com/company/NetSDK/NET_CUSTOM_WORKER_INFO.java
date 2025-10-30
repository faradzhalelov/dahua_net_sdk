package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Work Information
 * \else
 * @brief 工人信息
 * \endif
 */
public class NET_CUSTOM_WORKER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * 	Sex
     * \else
     * 	性别
     * \endif
     */
    public byte					szSex[] = new byte[8];

    /**
     * \if ENGLISH_LANG
     * 	Role
     * \else
     * 	角色
     * \endif
     */
    public byte					szRole[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * 	Project ID
     * \else
     * 	项目ID
     * \endif
     */
    public byte					szProjNo[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * 	Project Name
     * \else
     * 	项目名称
     * \endif
     */
    public byte					szProjName[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * 	Builder Name
     * \else
     * 	施工单位全称
     * \endif
     */
    public byte					szBuilderName[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * 	Builder ID
     * \else
     * 	施工单位ID
     * \endif
     */
    public byte					szBuilderID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * 	Builder Type
     * \else
     * 	施工单位类型
     * \endif
     */
    public byte					szBuilderType[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * 	Builder Type ID
     * \else
     * 	施工单位类别ID
     * \endif
     */
    public byte					szBuliderTypeID[] = new byte[8];

    /**
     * \if ENGLISH_LANG
     * 	Worker Picture ID
     * \else
     * 	人员照片ID
     * \endif
     */
    public byte					szPictureID[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * 	Contract ID
     * \else
     * 	原合同系统合同编号
     * \endif
     */
    public byte					szContractID[] = new byte[16];

    /**
     * \if ENGLISH_LANG
     * 	Worker Type ID
     * \else
     * 	工种ID
     * \endif
     */
    public byte					szWorkerTypeID[] = new byte[8];

    /**
     * \if ENGLISH_LANG
     * 	Worker Type Name
     * \else
     * 	工种名称
     * \endif
     */
    public byte					szWorkerTypeName[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * 	Person Status
     * \else
     * 	人员状态
     * \endif
     */
    public boolean					bPersonStatus;

    /**
     * \if ENGLISH_LANG
     * 	Is szProjNameEx valid When it is TRUE, szProjNameEx is valid
     * \else
     * 	szProjNameEx 是否有效，为TRUE时，szProjNameEx 有效
     * \endif
     */
    public boolean					bProjNameEx;

    /**
     * \if ENGLISH_LANG
     * 	Project name extension field
     * \else
     * 	项目名称扩展字段
     * \endif
     */
    public byte					szProjNameEx[] = new byte[256];

}

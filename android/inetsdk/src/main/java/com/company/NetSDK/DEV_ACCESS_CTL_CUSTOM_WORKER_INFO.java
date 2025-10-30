package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * worker info
 * \else
 * 人员信息
 * \endif
 */
public class DEV_ACCESS_CTL_CUSTOM_WORKER_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Sex {@link NET_ACCESSCTLCARD_SEX}
     * \else
     * 性别 {@link NET_ACCESSCTLCARD_SEX}
     * \endif
     */
    public int       emSex;

    /**
     * \if ENGLISH_LANG
     * Role
     * \else
     * 角色
     * \endif
     */
    public byte                        szRole[] = new byte[FinalVar.MAX_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 项目ID
     * \endif
     */
    public byte                        szProjectNo[] = new byte[FinalVar.MAX_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 项目名称
     * \endif
     */
    public byte                        szProjectName[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 施工单位全称
     * \endif
     */
    public byte                        szBuilderName[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 施工单位ID
     * \endif
     */
    public byte                        szBuilderID[] = new byte[FinalVar.MAX_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 施工单位类型
     * \endif
     */
    public byte                        szBuilderType[] = new byte[FinalVar.MAX_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 施工单位类别ID
     * \endif
     */
    public byte                        szBuilderTypeID[] = new byte[FinalVar.MAX_COMMON_STRING_8];

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 人员照片ID
     * \endif
     */
    public byte                        szPictureID[] = new byte[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 原合同系统合同编号
     * \endif
     */
    public byte                        szContractID[] = new byte[FinalVar.MAX_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 工种ID
     * \endif
     */
    public byte                        szWorkerTypeID[] = new byte[FinalVar.MAX_COMMON_STRING_8];

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 工种名称
     * \endif
     */
    public byte                        szWorkerTypeName[] = new byte[FinalVar.MAX_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     *
     * \else
     * 人员状态, TRUE:启用, FALSE:禁用
     * \endif
     */
    public boolean                        bPersonStatus;
}

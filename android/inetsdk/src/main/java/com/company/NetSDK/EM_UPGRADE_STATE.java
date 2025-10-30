package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief uprade package and uprade state
 * \else
 * @brief 升级包和升级状态
 * \endif
 */
public class EM_UPGRADE_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知状态
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  check none
     * \else
     *  没有检测到更新状态
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_NONE = 1;

    /**
     * \if ENGLISH_LANG
     *  package invalid
     * \else
     *  升级包不正确
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_INVALID = 2;

    /**
     * \if ENGLISH_LANG
     *  out of memory
     * \else
     *  内存不够
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_NOT_ENOUGH_MEMORY = 3;

    /**
     * \if ENGLISH_LANG
     *  downloading package
     * \else
     *  正在下载数据
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_DOWNLOADING = 4;

    /**
     * \if ENGLISH_LANG
     *  download failed
     * \else
     *  下载失败
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_DOWNLOAD_FAILED = 5;

    /**
     * \if ENGLISH_LANG
     *  download successed
     * \else
     *  下载成功
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_DOWNLOAD_SUCCESSED = 6;

    /**
     * \if ENGLISH_LANG
     *  preparing
     * \else
     *  准备升级
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_PREPARING = 7;

    /**
     * \if ENGLISH_LANG
     *  upgrading
     * \else
     *  升级中
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_UPGRADING = 8;

    /**
     * \if ENGLISH_LANG
     *  upgrade failed
     * \else
     *  升级失败
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_UPGRADE_FAILED = 9;

    /**
     * \if ENGLISH_LANG
     *  upgrade successed
     * \else
     *  升级成功
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_UPGRADE_SUCCESSED = 10;

    /**
     * \if ENGLISH_LANG
     *  upgrade cancelled
     * \else
     *  取消升级 
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_UPGRADE_CANCELLED = 11;

    /**
     * \if ENGLISH_LANG
     *  file unmatch
     * \else
     *  升级包不匹配
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_FILE_UNMATCH = 12;

    /**
     * \if ENGLISH_LANG
     *  feature engine unmatch
     * \else
     *  算法引擎不匹配
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_FEATURE_ENGINE_UNMATCH = 13;

    /**
     * \if ENGLISH_LANG
     *  The intelligent function of algorithm package does not match (new or deleted functions lead to function mismatch)
     * \else
     *  算法包智能功能不匹配(新增功能或者删除功能，导致功能不匹配)
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_FEATURE_FUNC_UNMATCH = 14;

    /**
     * \if ENGLISH_LANG
     *  Algorithm partition does not match, partition package is divided into: model, model + algorithm. At present, only packages of the same type can be upgraded
     * \else
     *  算法分区不匹配, 分区包分为：模型、模型+算法。 目前只能升级相同类型的包
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_FEATURE_PARTION_UNMATCH = 15;

    /**
     * \if ENGLISH_LANG
     *  network error
     * \else
     *  网络异常
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_NETWORK_ERROR = 16;

    /**
     * \if ENGLISH_LANG
     *  The file downloaded remotely does not match the hash value passed by seturl
     * \else
     *  远程下载的文件和setUrl传的哈希值不匹配
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_NETWORK_REMOTE_FILE_CHECK_FAILED = 17;

    /**
     * \if ENGLISH_LANG
     *  part upgrade
     * \else
     *  部分升级成功，导致不同芯片版本不匹配
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_PART_UPGRADED = 18;

    /**
     * \if ENGLISH_LANG
     *  Feature api unmatch
     * \else
     *  算法库对应的API协议头文件版本
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_FEATURE_API_UNMATCH = 19;

    /**
     * \if ENGLISH_LANG
     *  Feature sdk unmatch
     * \else
     *  算法库依赖的第三方SDK的版本
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_FEATURE_SDK_UNMATCH = 20;

    /**
     * \if ENGLISH_LANG
     *  Set URL
     * \else
     *  URL下载升级
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_SET_URL = 21;

    /**
     * \if ENGLISH_LANG
     *  OEM not compare
     * \else
     *  升级包是OEM版不能升级
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_OEM_NOT_COMPARE = 22;

    /**
     * \if ENGLISH_LANG
     *  Unmatch verison
     * \else
     *  升级包版本不匹配
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_UNMATCH_VERSION = 23;

    /**
     * \if ENGLISH_LANG
     *  LICENSE LANGUAGE ERROR
     * \else
     *  支持license防串货方案时，升级校验发现license文件中的语言字段不正确。
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_LICENSE_LANGUAGE_ERROR = 24;

    /**
     * \if ENGLISH_LANG
     *  LICENSE LANGUAGE NOT MATCH
     * \else
     *  支持license防串货方案时，升级校验发现license文件中的语言字段和升级包中的不匹配。
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_LICENSE_LANGUAGE_NOT_MATCH = 25;

    /**
     * \if ENGLISH_LANG
     *  SAME VERSION
     * \else
     *  当前要升级的程序版本和运行的版本一致，不需要在升级，也不能升级
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_SAME_VERSION = 26;

    /**
     * \if ENGLISH_LANG
     *  SAME AS OLD APP
     * \else
     *  应用程序版本相同，不需要升级（仅适用DHOP）
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_SAME_AS_OLD_APP = 27;

    /**
     * \if ENGLISH_LANG
     *  pausing
     * \else
     *  暂停下载数据
     * \endif
     */
    public static final int					EM_UPGRADE_STATE_PAUSING = 28;

}
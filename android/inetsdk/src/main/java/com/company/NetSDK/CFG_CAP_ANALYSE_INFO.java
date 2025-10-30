package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * Video analyze capability，the corresponding interface {@link INetSDK#QueryNewSystemInfo},the corresponding command {@link FinalVar#CFG_CAP_CMD_VIDEOANALYSE}
 * \else
 * 视频分析能力集，对应接口{@link INetSDK#QueryNewSystemInfo},对应命令 {@link FinalVar#CFG_CAP_CMD_VIDEOANALYSE}
 * \endif
 */
public class CFG_CAP_ANALYSE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Supported scene number
     * \else
     * 支持的场景个数
     * \endif
     */
    public int					    nSupportedSceneNum;

    /**
     * \if ENGLISH_LANG
     * Supported scene list
     * \else
     * 支持的场景列表
     * \endif
     */
    public byte[][]				szSceneName = new byte[FinalVar.MAX_SCENE_LIST_SIZE][FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Max analysis modules supported by each channel
     * \else
     * 每通道支持最大分析模块数
     * \endif
     */
    public int					    nMaxMoudles;

    /**
     * \if ENGLISH_LANG
     * Supported object type number
     * \else
     * 支持的检测物体类型个数
     * \endif
     */
    public int					    nSupportedObjectTypeNum;

    /**
     * \if ENGLISH_LANG
     * Supported object type list
     * \else
     * 支持的检测物体类型列表
     * \endif
     */
    public byte[][]				szObjectTypeName = new byte[FinalVar.MAX_OBJECT_LIST_SIZE][FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Max rules supported by each factory
     * \else
     * 每通道支持最大规则条数
     * \endif
     */
    public int					    nMaxRules;

    /**
     * \if ENGLISH_LANG
     * Supported event-type rule number
     * \else
     * 支持的事件类型规则个数
     * \endif
     */
    public int					    nSupportedRulesNum;

    /**
     * \if ENGLISH_LANG
     * Supported event-type rule list, event type, details in dhnetsdk.h "Intellgence analyze event type"
     * \else
     * 支持的事件类型规则列表，事件类型，详见dhnetsdk.h中"智能分析事件类型"
     * \endif
     */
    public int[]				    dwRulesType = new int[FinalVar.MAX_RULE_LIST_SIZE];

    /**
     * \if ENGLISH_LANG
     * Supported max staff number
     * \else
     * 支持的最大标尺个数
     * \endif
     */
    public int					    nMaxStaffs;

    /**
     * \if ENGLISH_LANG
     * Max point of line
     * \else
     * 折线最大顶点数
     * \endif
     */
    public int					    nMaxPointOfLine;

    /**
     * \if ENGLISH_LANG
     * Max point of region
     * \else
     * 区域最大顶点数
     * \endif
     */
    public int					    nMaxPointOfRegion;

    /**
     * \if ENGLISH_LANG
     * Max internal options
     * \else
     * 最大内部选项个数
     * \endif
     */
    public int                     nMaxInternalOptions;

    /**
     * \if ENGLISH_LANG
     * Support complex size filter or not   complex size filter employ independent area filter and aspect ratio filter parameter
     * \else
     * 是否支持复杂尺寸过滤器	复杂尺寸过滤器使用独立的面积过滤和宽高比过滤参数。
     * \endif
     */
    public boolean                bComplexSizeFilter;

    /**
     * \if ENGLISH_LANG
     * Support specified object filter or not
     * \else
     * 是否支持特定的物体过滤器
     * \endif
     */
    public boolean                bSpecifiedObjectFilter;

    /**
     * \if ENGLISH_LANG
     * Support max exclusion region number in module
     * \else
     * 支持模块中的最大排除区域个数
     * \endif
     */
    public int                     nMaxExcludeRegionNum;

    /**
     * \if ENGLISH_LANG
     * Max calibration box number in supported module
     * \else
     * 支持的模块中的最大校准框个数
     * \endif
     */
    public int                     nMaxCalibrateBoxNum;

    /**
     * \if ENGLISH_LANG
     * Min calibration box number in module
     * \else
     * 模块中至少需要设置的校准框个数
     * \endif
     */
    public int                     nMinCalibrateBoxNum;

    /**
     * \if ENGLISH_LANG
     * max support special region detection in module
     * \else
     * 模块中支持的最大特殊区域检测个数
     * \endif
     */
    public int                     nMaxSepcialDetectRegions;

    /**
     * \if ENGLISH_LANG
     * number of periods in the day
     * \else
     * 支持的每天的时间段个数
     * \endif
     */
    public int                     nSupportedTimeSectionNum;

    /**
     * \if ENGLISH_LANG
     * Support special attributes number detection area
     * \else
     * 支持的特殊检测区属性个数
     * \endif
     */
    public int                     nSpecialDetectPropertyNum;

    /**
     * \if ENGLISH_LANG
     * Support special testing area properties
     * \else
     * 支持的特殊检测区属性
     * \endif
     */
    public int[]			        nSupportedSpecialDetectPropertys = new int[EM_SEPCIALREGION_PROPERTY_TYPE.EM_SEPCIALREGION_PROPERTY_TYPE_NUM];

    /**
     * \if ENGLISH_LANG
     * Support video channel type choice  0 bit to 1 said support digital type, 1 bit to 1 said support	simulated type, 2 bit to 1 said support mix(digit and simulation)
     * \else
     * 支持的视频通道类型选择   第0位为1表示支持数字类型,第1位为1表示支持模拟类型,第2为1表示支持混合(数字和模拟)
     * \endif
     */
    public int				        nSupportedVideoChannelType;

    /**
     * \if ENGLISH_LANG
     * Whether to Support More Scene Switching
     * \else
     * 是否支持多场景切换
     * \endif
     */
    public boolean				    bSupportMultiSceneSwitch;

    /**
     * \if ENGLISH_LANG
     * Supported Scene capacity collection
     * \else
     * 支持的场景能力集
     * \endif
     */
    public CFG_VACAP_SUPPORTEDSCENES  stSupportScenes = new CFG_VACAP_SUPPORTEDSCENES();

    /**
     * \if ENGLISH_LANG
     * the counts of supported scene comparis
     * \else
     * 支持的场景组合项个数
     * \endif
     */
    public int 				    nSupportedComp;

    /**
     * \if ENGLISH_LANG
     * the list of supported scene comparis
     * \else
     * 支持的场景组合项列表
     * \endif
     */
    public CFG_SUPPORTED_COMP[] 	stuSupportedComp = new CFG_SUPPORTED_COMP[FinalVar.MAX_SUPPORTED_COMP_SIZE];

    /**
     * \if ENGLISH_LANG
     * 0-- Module/Rule should to set, 1 -- only Rule should to set
     * \else
     * 0 Module/Rule配置均要设置(默认，智能服务器), 1 仅Rule配置要设置(IPC/xVR)
     * \endif
     */
    public byte				    byFilterMask;

    /**
     * \if ENGLISH_LANG
     * the display type if camera angle, refer to {@link EM_DISPLAY_CAMERA_ANGLE_TYPE}
     * \else
     * 摄像头安装角度显示方式, 参考 {@link EM_DISPLAY_CAMERA_ANGLE_TYPE}
     * \endif
     */
    public int                     emDisCameraAngleType;

    public CFG_CAP_ANALYSE_INFO() {
        for(int i = 0; i < FinalVar.MAX_SUPPORTED_COMP_SIZE; i++) {
            stuSupportedComp[i] = new CFG_SUPPORTED_COMP();
        }
    }

    @Override
    public String toString() {
        return "CFG_CAP_ANALYSE_INFO{" +
                "nSupportedSceneNum=" + nSupportedSceneNum +
                ", szSceneName=" + Arrays.toString(szSceneName) +
                ", nMaxMoudles=" + nMaxMoudles +
                ", nSupportedObjectTypeNum=" + nSupportedObjectTypeNum +
                ", szObjectTypeName=" + Arrays.toString(szObjectTypeName) +
                ", nMaxRules=" + nMaxRules +
                ", nSupportedRulesNum=" + nSupportedRulesNum +
                ", dwRulesType=" + Arrays.toString(dwRulesType) +
                ", nMaxStaffs=" + nMaxStaffs +
                ", nMaxPointOfLine=" + nMaxPointOfLine +
                ", nMaxPointOfRegion=" + nMaxPointOfRegion +
                ", nMaxInternalOptions=" + nMaxInternalOptions +
                ", bComplexSizeFilter=" + bComplexSizeFilter +
                ", bSpecifiedObjectFilter=" + bSpecifiedObjectFilter +
                ", nMaxExcludeRegionNum=" + nMaxExcludeRegionNum +
                ", nMaxCalibrateBoxNum=" + nMaxCalibrateBoxNum +
                ", nMinCalibrateBoxNum=" + nMinCalibrateBoxNum +
                ", nMaxSepcialDetectRegions=" + nMaxSepcialDetectRegions +
                ", nSupportedTimeSectionNum=" + nSupportedTimeSectionNum +
                ", nSpecialDetectPropertyNum=" + nSpecialDetectPropertyNum +
                ", nSupportedSpecialDetectPropertys=" + Arrays.toString(nSupportedSpecialDetectPropertys) +
                ", nSupportedVideoChannelType=" + nSupportedVideoChannelType +
                ", bSupportMultiSceneSwitch=" + bSupportMultiSceneSwitch +
                ", stSupportScenes=" + stSupportScenes +
                ", nSupportedComp=" + nSupportedComp +
                ", stuSupportedComp=" + Arrays.toString(stuSupportedComp) +
                ", byFilterMask=" + byFilterMask +
                ", emDisCameraAngleType=" + emDisCameraAngleType +
                '}';
    }
}

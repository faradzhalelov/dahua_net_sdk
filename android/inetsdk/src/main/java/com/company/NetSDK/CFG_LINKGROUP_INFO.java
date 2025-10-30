package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *　Link group
 * \else
 * 联动的布控组
 * \endif
 */
public class CFG_LINKGROUP_INFO implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Group enable
     * \else
     * 布控组是否启用
     * \endif
     */
    public boolean 					bEnable;

    /**
     * \if ENGLISH_LANG
     * Group ID
     * \else
     * 布控组ID
     * \endif
     */
    public byte					szGroupID[] = new byte[FinalVar.MAX_GROUP_ID_LEN];

    /**
     * \if ENGLISH_LANG
     * Similarity
     * \else
     * 相似度阈值
     * \endif
     */
    public byte                	bySimilarity;

    /**
     * \if ENGLISH_LANG
     * Color name
     * \else
     * 事件触发时绘制目标框的颜色
     * \endif
     */
    public byte					szColorName[] = new byte[FinalVar.MAX_COLOR_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Show title
     * \else
     * 事件触发时规则框上是否显示报警标题
     * \endif
     */
    public boolean 					bShowTitle;

    /**
     * \if ENGLISH_LANG
     * Show plate
     * \else
     * 事件触发时是否显示比对面板
     * \endif
     */
    public boolean 					bShowPlate;

    /**
     * \if ENGLISH_LANG
     * Alarm event handler
     * \else
     * 报警联动
     * \endif
     */
    public CFG_ALARM_MSG_HANDLE 	stuEventHandler = new CFG_ALARM_MSG_HANDLE();


}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Stranger mode
 * \else
 * 陌生人布防模式
 * \endif
 */
public class CFG_STRANGERMODE_INFO implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Mode enable
     * \else
     * 模式是否启用
     * \endif
     */
    public boolean 					bEnable;

    /**
     * \if ENGLISH_LANG
     * Color HEX
     * \else
     * 事件触发时绘制目标框的颜色
     * \endif
     */
    public byte					szColorHex[] = new byte[FinalVar.MAX_COLOR_HEX_LEN];

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

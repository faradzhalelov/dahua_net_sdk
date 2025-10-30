package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ control extensive command
 * \else
 * 云台控制扩展命令
 * \endif
 */
public class SDK_EXTPTZ_ControlType implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Upper left
	 * \else
	 * 左上
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTTOP = 0x20;
	
	/**
	 * \if ENGLISH_LANG
	 * Upper right 
	 * \else
	 * 右上
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHTTOP = 0x21;
	
	/**
	 * \if ENGLISH_LANG
	 * Down left
	 * \else
	 * 左下
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTDOWN = 0x22;
	
	/**
	 * \if ENGLISH_LANG
	 * Down right 
	 * \else
	 * 右下
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHTDOWN = 0x23;
	
	/**
	 * \if ENGLISH_LANG
	 * Add preset to tour tour preset value
	 * \else
	 * 加入预置点到巡航 巡航线路 预置点值
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_ADDTOLOOP = 0x24;
	
	/**
	 * \if ENGLISH_LANG
	 * Delete preset in tour tour preset value
	 * \else
	 * 删除巡航中预置点 巡航线路 预置点值
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_DELFROMLOOP = 0x25;
	
	/**
	 * \if ENGLISH_LANG
	 * Delete tour
	 * \else
	 * 清除巡航 巡航线路
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_CLOSELOOP = 0x26;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin pan rotation	
	 * \else
	 * 开始水平旋转
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_STARTPANCRUISE = 0x27;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop pan rotation	
	 * \else
	 * 停止水平旋转
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_STOPPANCRUISE = 0x28;
	
	/**
	 * \if ENGLISH_LANG
	 * Set left limit	
	 * \else
	 * 设置左边界
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SETLEFTBORDER = 0x29;
	
	/**
	 * \if ENGLISH_LANG
	 * Set right limit	
	 * \else
	 * 设置右边界
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SETRIGHTBORDER = 0x2a;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin scanning	
	 * \else
	 * 开始线扫
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_STARTLINESCAN = 0x2b;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop scanning	
	 * \else
	 * 停止线扫
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_CLOSELINESCAN = 0x2c;
	
	/**
	 * \if ENGLISH_LANG
	 * Start mode	mode line	
	 * \else
	 * 设置模式开始	模式线路
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SETMODESTART = 0x2d;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop mode	mode line
	 * \else
	 * 设置模式结束	模式线路
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SETMODESTOP = 0x2e;						
	/**
	 * \if ENGLISH_LANG
	 * Enable mode	Mode line
	 * \else
	 * 运行模式	模式线路
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RUNMODE = 0x2f;							
	/**
	 * \if ENGLISH_LANG
	 * Unable mode	Mode line
	 * \else
	 * 停止模式	模式线路
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_STOPMODE = 0x30;							
	/**
	 * \if ENGLISH_LANG
	 * Delete mode	Mode line
	 * \else
	 * 清除模式	模式线路
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_DELETEMODE = 0x31;						
	/**
	 * \if ENGLISH_LANG
	 * Flip
	 * \else
	 * 翻转命令
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_REVERSECOMM = 0x32;						
	/**
	 * \if ENGLISH_LANG
	 * 3D position	X address(8192)	Y address(8192)	zoom(4)
	 * \else
	 * 快速定位 水平坐标(8192) 垂直坐标(8192) 变倍(4)
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_FASTGOTO = 0x33;							
	/**
	 * \if ENGLISH_LANG
	 * Auxiliary open	Auxiliary point	
	 * \else
	 * 辅助开关开 辅助点
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_AUXIOPEN = 0x34;							
	/**
	 * \if ENGLISH_LANG
	 * Auxiliary close	Auxiliary point
	 * \else
	 * 辅助开关关 辅助点
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_AUXICLOSE = 0x35;						
	/**
	 * \if ENGLISH_LANG
	 * Open dome menu 
	 * \else
	 * 打开球机菜单
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_OPENMENU = 0x36;					
	/**
	 * \if ENGLISH_LANG
	 * Close menu 
	 * \else
	 * 关闭菜单
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_CLOSEMENU = 0x37;						
	/**
	 * \if ENGLISH_LANG
	 * Confirm menu 
	 * \else
	 * 菜单确定
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENUOK = 0x38;							
	/**
	 * \if ENGLISH_LANG
	 * Cancel menu 
	 * \else
	 * 菜单取消
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENUCANCEL = 0x39;						
	/**
	 * \if ENGLISH_LANG
	 * Menu up 
	 * \else
	 * 菜单上
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENUUP = 0x3a;							
	/**
	 * \if ENGLISH_LANG
	 * Menu down
	 * \else
	 * 菜单下
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENUDOWN = 0x3b;							
	/**
	 * \if ENGLISH_LANG
	 * Menu left
	 * \else
	 * 菜单左
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENULEFT = 0x3c;							
	/**
	 * \if ENGLISH_LANG
	 * Menu right 
	 * \else
	 * 菜单右
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENURIGHT = 0x3d;						
	/**
	 * \if ENGLISH_LANG
	 * Alarm activate PTZ parm1:Alarm input channel;parm2:Alarm activation type  1-preset 2-scan 3-tour;parm 3:activation value,such as preset value.
	 * \else
	 * 报警联动云台 parm1：报警输入通道；parm2：报警联动类型1-预置点2-线扫3-巡航；parm3：联动值，如预置点号
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_ALARMHANDLE = 0x40;				
	/**
	 * \if ENGLISH_LANG
	 * Matrix switch parm1:monitor number(video output number);parm2:video input number;parm3:matrix number
	 * \else
	 * 矩阵切换 parm1：预览器号(视频输出号)；parm2：视频输入号；parm3：矩阵号
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MATRIXSWITCH = 0x41;				
	/**
	 * \if ENGLISH_LANG
	 * Light controller
	 * \else
	 * 灯光控制器
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LIGHTCONTROL = 0x42;						
	/**
	 * \if ENGLISH_LANG
	 * 3D accurately positioning parm1:Pan degree(0~3600); parm2: tilt coordinates(0~900); parm3:zoom(1~128)
	 * \else
	 * 三维精确定位 parm1：水平角度(0~3600)；parm2：垂直坐标(0~900)；parm3：变倍(1~128)
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_EXACTGOTO = 0x43;						
	/**
	 * \if ENGLISH_LANG
	 * Reset  3D positioning as zero
	 * \else
	 * 三维定位重设零位
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RESETZERO = 0x44;                        
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 绝对移动控制命令，param4对应结构PTZ_CONTROL_ABSOLUTELY
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MOVE_ABSOLUTELY = 0x45;                  
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 持续移动控制命令，param4对应结构PTZ_CONTROL_CONTINUOUSLY
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MOVE_CONTINUOUSLY = 0x46;                
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 云台控制命令，以一定速度转到预置位点，parm4对应结构PTZ_CONTROL_GOTOPRESET
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_GOTOPRESET = 0x47;                       
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 设置可视域(param4对应结构 PTZ_VIEW_RANGE_INFO)
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SET_VIEW_RANGE = 0x49;           	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 绝对聚焦(param4对应结构PTZ_FOCUS_ABSOLUTELY)
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_FOCUS_ABSOLUTELY = 0x4A;         	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 水平扇扫(param4对应PTZ_CONTROL_SECTORSCAN,param1、param2、param3无效)
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_HORSECTORSCAN = 0x4B;             
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 垂直扇扫(param4对应PTZ_CONTROL_SECTORSCAN,param1、param2、param3无效)
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_VERSECTORSCAN = 0x4C;             
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 设定绝对焦距、聚焦值,param1为焦距,范围:[0,255],param2为聚焦,范围:[0,255],param3、param4无效
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SET_ABS_ZOOMFOCUS = 0x4D;
	/**
	 * \if ENGLISH_LANG
	 * To restart the PTZ(param1,param2,param3,param4 are all invalid ,dwStop set to FALSE )
	 * \else
	 * 云台重启命令(param1、param2、param3 param4 均无效,dwStop设置为FALSE)
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RESTART = 0x51;
	/**
	 * \if ENGLISH_LANG
	 * Up + TELE param1=speed (1-8) 
	 * \else
	 * 上 + TELE param1=速度(1-8)，下同
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_UP_TELE = 0x70;					
	/**
	 * \if ENGLISH_LANG
	 * Down + TELE
	 * \else
	 * 下 + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_DOWN_TELE = 0x71;						
	/**
	 * \if ENGLISH_LANG
	 * Left + TELE
	 * \else
	 * 左 + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFT_TELE = 0x72;						
	/**
	 * \if ENGLISH_LANG
	 * Right + TELE
	 * \else
	 * 右 + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHT_TELE = 0x73;						
	/**
	 * \if ENGLISH_LANG
	 * Upper left + TELE
	 * \else
	 * 左上 + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTUP_TELE = 0x74;						
	/**
	 * \if ENGLISH_LANG
	 * Down left + TELE
	 * \else
	 * 左下 + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTDOWN_TELE = 0x75;					
	/**
	 * \if ENGLISH_LANG
	 * Upper right + TELE
	 * \else
	 * 右上 + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_TIGHTUP_TELE = 0x76;						
	/**
	 * \if ENGLISH_LANG
	 * Down right + TELE
	 * \else
	 * 右下 + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHTDOWN_TELE = 0x77;					
	/**
	 * \if ENGLISH_LANG
	 * Up + WIDE param1=speed (1-8) 
	 * \else
	 * 上 + WIDE param1=速度(1-8)，下同
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_UP_WIDE = 0x78;							
	/**
	 * \if ENGLISH_LANG
	 * Down + WIDE
	 * \else
	 * 下 + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_DOWN_WIDE = 0x79;						
	/**
	 * \if ENGLISH_LANG
	 * Left + WIDE
	 * \else
	 * 左 + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFT_WIDE = 0x7a;						
	/**
	 * \if ENGLISH_LANG
	 * Right + WIDE
	 * \else
	 * 右 + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHT_WIDE = 0x7b;						
	/**
	 * \if ENGLISH_LANG
	 * Upper left + WIDE
	 * \else
	 * 左上 + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTUP_WIDE = 0x7c;						
	/**
	 * \if ENGLISH_LANG
	 * Down left+ WIDE
	 * \else
	 * 左下 + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTDOWN_WIDE = 0x7d;					
	/**
	 * \if ENGLISH_LANG
	 * Upper right + WIDE
	 * \else
	 * 右上 + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_TIGHTUP_WIDE = 0x7e;
	/**
	 * \if ENGLISH_LANG
	 * Down right + WIDE
	 * \else
	 * 右下 + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHTDOWN_WIDE = 0x7f;
	/**
	 * \if ENGLISH_LANG
	 * Start PTZ control
	 * \else
	 * 开始云台控制
	 * \endif
	 */
	public static final int   SDK_EXTPTZ_START = 0X8C;
	/**
	 * \if ENGLISH_LANG
	 * Stop PTZ control
	 * \else
	 * 结束云台控制
	 * \endif
	 */
	public static final int   SDK_EXTPTZ_STOP = 0X8D;
	/**
	 * \if ENGLISH_LANG
	 * Max command value
	 * \else
	 * 最大命令值
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_TOTAL = 0x93;


}

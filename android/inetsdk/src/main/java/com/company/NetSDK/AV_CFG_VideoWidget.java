package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video encode widget config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_VIDEOWIDGET}
 * \else
 * 视频编码物件配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_VIDEOWIDGET}
 * \endif
 */
public class AV_CFG_VideoWidget implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel title
	 * \else
	 * 通道标题
	 * \endif
	 */
	public AV_CFG_VideoWidgetChannelTitle	stuChannelTitle = new AV_CFG_VideoWidgetChannelTitle();	

	/**
	 * \if ENGLISH_LANG
	 * Time title
	 * \else
	 * 时间标题
	 * \endif
	 */
	public AV_CFG_VideoWidgetTimeTitle		stuTimeTitle = new AV_CFG_VideoWidgetTimeTitle();

	/**
	 * \if ENGLISH_LANG
	 * Privacy mask zone amount
	 * \else
	 * 区域覆盖数量
	 * \endif
	 */
	public int								nConverNum;		

	/**
	 * \if ENGLISH_LANG
	 * Privacy mask zone
	 * \else
	 * 覆盖区域
	 * \endif
	 */
	public AV_CFG_VideoWidgetCover			stuCovers[] = new AV_CFG_VideoWidgetCover[FinalVar.AV_CFG_Max_Video_Widget_Cover];

	/**
	 * \if ENGLISH_LANG
	 *  Self-defined title amount
	 * \else
	 * 自定义标题数量
	 * \endif
	 */
	public int								nCustomTitleNum;	

	/**
	 * \if ENGLISH_LANG
	 * Self-defined title
	 * \else
	 * 自定义标题
	 * \endif
	 */
	public AV_CFG_VideoWidgetCustomTitle	stuCustomTitle[] = new AV_CFG_VideoWidgetCustomTitle[FinalVar.AV_CFG_Max_Video_Widget_Custom_Title];

	/**
	 * \if ENGLISH_LANG
	 * The number of sensor information overlay area
	 * \else
	 * 传感器信息叠加区域数目
	 * \endif
	 */
	public int								nSensorInfo;	
	
	/**
	 * \if ENGLISH_LANG
	 * Sensor information overlay zone information
	 * \else
	 * 传感器信息叠加区域信息
	 * \endif
	 */
	public AV_CFG_VideoWidgetSensorInfo		stuSensorInfo[] = new AV_CFG_VideoWidgetSensorInfo[FinalVar.AV_CFG_Max_Video_Widget_Sensor_Info];		
	
	/**
	 * \if ENGLISH_LANG
	 * Font size scale
	 * when fFontSizeScale≠0 , nFontSize not work
	 * when fFontSizeScale=0 , nFontSize work
	 * \else
	 * 叠加字体大小放大比例
	 * 当fFontSizeScale≠0时,nFontSize不起作用
     * 当fFontSizeScale=0时,nFontSize起作用
	 * \endif
	 */
	public double                           fFontSizeScale;            

	/**
	 * \if ENGLISH_LANG
	 * Main Stream Font Size(unit px),work with fFontSizeScale
	 * \else
	 * 叠加到主码流上的全局字体大小,单位 px.和fFontSizeScale共同作用
	 * \endif
	 */
	public int                        nFontSize;                
	/**
	 * \if ENGLISH_LANG
	 * Extra1 Stream Font Size(unit px)
	 * \else
	 * 叠加到辅码流1上的全局字体大小,单位 px
	 * \endif
	 */
	public int      nFontSizeExtra1;     
	/**
	 * \if ENGLISH_LANG
	 * Extra2 Stream Font Size(unit px)
	 * \else
	 * 叠加到辅码流2上的全局字体大小,单位 px
	 * \endif
	 */
	public int                        nFontSizeExtra2;        
	/**
	 * \if ENGLISH_LANG
	 * Extra3 Stream Font Size(unit px)
	 * \else
	 * 叠加到辅码流3上的全局字体大小,单位 px
	 * \endif
	 */
	public int                        nFontSizeExtra3;         
	/**
	 * \if ENGLISH_LANG
	 * SnapShot Font Size(unit px)
	 * \else
	 * 叠加到抓图流上的全局字体大小, 单位 px
	 * \endif
	 */
	public int                        nFontSizeSnapshot;      
	/**
	 * \if ENGLISH_LANG
	 * Merge SnapShot Font Size(unit px)
	 * \else
	 * 叠加到抓图流上合成图片的字体大小,单位 px
	 * \endif
	 */
	public int                        nFontSizeMergeSnapshot;  

	public AV_CFG_VideoWidget() {
		for (int i =0 ; i<FinalVar.AV_CFG_Max_Video_Widget_Cover;i++) {
			stuCovers[i] = new AV_CFG_VideoWidgetCover();
		}
		
		for (int i =0 ; i<FinalVar.AV_CFG_Max_Video_Widget_Custom_Title; i++) {
			stuCustomTitle[i] = new AV_CFG_VideoWidgetCustomTitle();
		}
		
		for (int i =0 ; i<FinalVar.AV_CFG_Max_Video_Widget_Sensor_Info; i++) {
			stuSensorInfo[i] = new AV_CFG_VideoWidgetSensorInfo();
		}
	}
}

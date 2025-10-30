package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Configure Automated Maintenance
 * \else
 * 自动维护配置
 * \endif
 */
public class SDKDEV_AUTOMT_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Automatic restart time
	 * <table>
	 * <tr><td>0</td><td>Never</td></tr>
	 * <tr><td>1</td><td>everyday</td></tr>
	 * <tr><td>2</td><td>everyweek</td></tr>
	 * <tr><td>3</td><td>Every Monday</td></tr>
	 * <tr><td>4</td><td>Every Tuesday</td></tr>
	 * <tr><td>5</td><td>Every Wednesday</td></tr>
	 * <tr><td>6</td><td>Every Thursday</td></tr>
	 * <tr><td>7</td><td>Every Friday</td></tr>
	 * <tr><td>8</td><td>Every Saturday</td></tr>
	 * </table> 
	 * \else
	 * 自动重启时间
	 * <table>
	 * <tr><td>0</td><td>从不</td></tr>
	 * <tr><td>1</td><td>每天</td></tr>
	 * <tr><td>2</td><td>每星期日</td></tr>
	 * <tr><td>3</td><td>每星期一</td></tr>
	 * <tr><td>4</td><td>每星期二</td></tr>
	 * <tr><td>5</td><td>每星期三</td></tr>
	 * <tr><td>6</td><td>每星期四</td></tr>
	 * <tr><td>7</td><td>每星期五</td></tr>
	 * <tr><td>8</td><td>每星期六</td></tr>
	 * </table>
	 * \endif
	 */
	public byte                byAutoRebootDay;
	
	/**
	 * \if ENGLISH_LANG
	 * (Restart point time)0：0, 1：1, ......, 23：23
	 * \else
	 * (重启时间点)0：0点， 1：1点， ......， 23：23点
	 * \endif
	 */
	public byte                byAutoRebootTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Automatically delete files；0：never,1：24 hours,2：48 hours,3：72 hours,4：96 hours,5：week,6：month
	 * \else
	 * 自动删除文件；0：从不，1：24小时，2：48小时，3：72小时，4：96小时，5：周，6：月
	 * \endif
	 */
	public byte                byAutoDeleteFilesTime;
}

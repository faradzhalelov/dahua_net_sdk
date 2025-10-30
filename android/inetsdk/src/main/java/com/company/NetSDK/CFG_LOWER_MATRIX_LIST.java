package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Lower matrix configurations, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_LOWER_MATRIX}
 * \else
 * 下位矩阵配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_LOWER_MATRIX}
 * \endif
 */
public class CFG_LOWER_MATRIX_LIST implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The number of lower matrix
	 * \else
	 * 下位矩阵数量
	 * \endif
	 */
	public int						nMatrixCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Lower matrix array
	 * \else
	 * 下位矩阵数组
	 * \endif
	 */
	public CFG_LOWER_MATRIX_INFO	stuMatrix[] = new CFG_LOWER_MATRIX_INFO[FinalVar.CFG_MAX_LOWER_MATRIX_NUM];
	
	public CFG_LOWER_MATRIX_LIST()
	{
		for(int i = 0; i < FinalVar.CFG_MAX_LOWER_MATRIX_NUM; i++)
		{
			stuMatrix[i] = new CFG_LOWER_MATRIX_INFO();
		}
	}
	
}

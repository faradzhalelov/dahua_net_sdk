package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * The file information of collected
 * \else
 * 远程采集文件信息
 * \endif
 */
public class NET_REMOTE_COLLECT_TO_FILE_RULE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Collect type,{@link NET_EM_REMOTE_COLLECT_TYPE}
     *
     * \else
     * 采集类型,{@link NET_EM_REMOTE_COLLECT_TYPE}
     * \endifa
     */
    public int                  emType;

    /**
     * \if ENGLISH_LANG
     * Log level,takes effect when emType is NET_EM_REMOTE_COLLECT_TYPE_LOG,{@link NET_EM_REMOTE_COLLECT_LOG_LEVEL}
     * \else
     * 日志级别，采集类型emType为NET_EM_REMOTE_COLLECT_TYPE_LOG生效,{@link NET_EM_REMOTE_COLLECT_LOG_LEVEL}
     * \endifa
     */
    public int                  emLevel;

    /**
     * \if ENGLISH_LANG
     * Network card name,takes effect when emType is NET_EM_REMOTE_COLLECT_TYPE_CAPTURE
     * \else
     * 网卡名称，采集类型emType为NET_EM_REMOTE_COLLECT_TYPE_CAPTURE时生效
     * \endifa
     */
    public byte                  szNetworkCard[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * The filter type of source port,{@link NET_EM_PROT_FILTER_TYPE}
     * \else
     * 源端口过滤方式,{@link NET_EM_PROT_FILTER_TYPE}
     * \endifa
     */
    public int                  emSrcPortFilter;

    /**
     * \if ENGLISH_LANG
     * The number of source port to filter
     * \else
     * 源端口过滤列表个数
     * \endifa
     */
    public int					  nSrcPortNum;

    /**
     * \if ENGLISH_LANG
     * The list of source port to filter,value range is [0,65535],takes effect when emType is NET_EM_REMOTE_COLLECT_TYPE_CAPTURE
     * \else
     * 源端口过滤列表，范围为[0,65535]，采集类型为抓包时生效，emType为NET_EM_REMOTE_COLLECT_TYPE_CAPTURE
     * \endifa
     */
    public int					  nSrcPorts[] = new int[16];

    /**
     * \if ENGLISH_LANG
     * The filter type of destination port,{@link NET_EM_PROT_FILTER_TYPE}
     * \else
     * 目标端口过滤方式,{@link NET_EM_PROT_FILTER_TYPE}
     * \endifa
     */
    public int					  emDstPortFilter;

    /**
     * \if ENGLISH_LANG
     * The number of destination port to filter
     * \else
     * 目标端口过滤列表个数
     * \endifa
     */
    public int					  nDstPortNum;

    /**
     * \if ENGLISH_LANG
     * The list of destination port to filter,value range is [0,65535],takes effect when emType is NET_EM_REMOTE_COLLECT_TYPE_CAPTURE
     * \else
     * 目标端口过滤列表，范围为[0,65535]，采集类型为抓包时生效,emType为NET_EM_REMOTE_COLLECT_TYPE_CAPTURE
     * \endifa
     */
    public int					  nDstPorts[] = new int[16];
}

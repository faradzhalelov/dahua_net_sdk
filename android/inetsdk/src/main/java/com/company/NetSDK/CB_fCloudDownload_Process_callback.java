package com.company.NetSDK;

/**
 * Created by 32940 on 2018/10/11.
 */
public interface CB_fCloudDownload_Process_callback {
    /**
     * cloud download process callback function
     * @param lDownHandle
     * @param emState cloud download state   0:unknown   1:download success(need to call {@link INetSDK#CloudUpgraderStop})  2:download failed(don't need to call {@link INetSDK#CloudUpgraderStop},it will keep trying) 3:downloading  4:no enough disk space
     * @param dwDownloadSpeed  Download speed
     * @param dwProgressPercentage progress percentage
     * \else
     * 云下载回调函数
     * @param lDownHandle
     * @param emState 云下载状态  0:未知   1:云下载成功(需要关闭句柄)  2:云下载失败(不需要关闭句柄，会不断尝试下载) 3:正在下载中  4:磁盘空间不足
     * @param dwDownloadSpeed 下载速度
     * @param dwProgressPercentage 下载进度百分比
     * \endif
     */
    public void invoke(long lDownHandle, int emState, double dwDownloadSpeed, int dwProgressPercentage);
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#SetInternalControlParam} input parameter
 * \else
 * {@link INetSDK#SetInternalControlParam}  入参
 * \endif
 */

public class NET_INTERNAL_CONTROL_PARAM implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Internal thread sleep interval, range [10, 100], unit:ms , default 10
     * \else
     * 内部线程睡眠间隔，范围[10, 100]，unit:ms，默认10
     * \endif
     */
    public int          nThreadSleepTime;

    /**
     * \if ENGLISH_LANG
     * When waiting for semaphore, internal thread sleep interval, range [10, 100], unit:ms , default 10
     * \else
     * 等待信号量时，内部线程睡眠间隔，范围[10, 100]，unit:ms，默认10
     * \endif
     */
    public int          nSemaphoreSleepTimePerLoop;


}

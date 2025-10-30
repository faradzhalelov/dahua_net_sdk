package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * log level
 * \else
 * 日志等级
 * \endif
 */
public class EM_DBGINFO_LEVEL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * No Print
     * \else
     * No Print
     * \endif
     */
    public static final int EM_DBGINFO_LEVEL_NOPRINT = 0;

    /**
     * \if ENGLISH_LANG
     * Fatal
     * \else
     * Fatal
     * \endif
     */
    public static final int EM_DBGINFO_LEVEL_FATAL = 1;

    /**
     * \if ENGLISH_LANG
     * Error
     * \else
     * Error
     * \endif
     */
    public static final int EM_DBGINFO_LEVEL_ERROR = 2;

    /**
     * \if ENGLISH_LANG
     * Warn
     * \else
     * Warn
     * \endif
     */
    public static final int EM_DBGINFO_LEVEL_WARN = 3;

    /**
     * \if ENGLISH_LANG
     * Info
     * \else
     * Info
     * \endif
     */
    public static final int EM_DBGINFO_LEVEL_INFO = 4;

    /**
     * \if ENGLISH_LANG
     * Trace
     * \else
     * Trace
     * \endif
     */
    public static final int EM_DBGINFO_LEVEL_TRACE = 5;

    /**
     * \if ENGLISH_LANG
     * Debug
     * \else
     * Debug
     * \endif
     */
    public static final int EM_DBGINFO_LEVEL_DEBUG = 6;
}

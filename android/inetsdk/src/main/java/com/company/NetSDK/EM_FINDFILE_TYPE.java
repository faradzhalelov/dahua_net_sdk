package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief find file type
 * \else
 * @brief 查询文件的类型
 * \endif
 */
public class EM_FINDFILE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     * 未知
     * \endif
     */
    public static final int					EM_FINDFILE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  picture
     * \else
     * 泛指图片
     * \endif
     */
    public static final int					EM_FINDFILE_JPG = 1;

    /**
     * \if ENGLISH_LANG
     *  video
     * \else
     * 泛指视频
     * \endif
     */
    public static final int					EM_FINDFILE_DAV = 2;

    /**
     * \if ENGLISH_LANG
     *  log info
     * \else
     * log信息
     * \endif
     */
    public static final int					EM_FINDFILE_LOG = 3;

    /**
     * \if ENGLISH_LANG
     *  gps info
     * \else
     * gps信息
     * \endif
     */
    public static final int					EM_FINDFILE_GPS = 4;

    /**
     * \if ENGLISH_LANG
     *  jpk info
     * \else
     * jpk信息,图片打包文件，指文件中存有多张图片的文件，该类型和jpg类型互斥，同一个查询条件里面不能既有jpg又有jpk
     * \endif
     */
    public static final int					EM_FINDFILE_JPK = 5;

    /**
     * \if ENGLISH_LANG
     *  MP4 info
     * \else
     * MP4信息,(因与二代协议不兼容删除mp4，用dav表示所有视频)无Types字段，且有DB字段，默认查询"jpg"类型
     * \endif
     */
    public static final int					EM_FINDFILE_MP4 = 6;

    /**
     * \if ENGLISH_LANG
     *  AUDIO info
     * \else
     * AUDIO信息,泛指音频
     * \endif
     */
    public static final int					EM_FINDFILE_AUDIO = 7;

}
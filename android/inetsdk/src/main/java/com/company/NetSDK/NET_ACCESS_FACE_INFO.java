package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;


/**
 * \if ENGLISH_LANG
 * target info
 * \else
 * 目标信息
 * \endif
 */
public class NET_ACCESS_FACE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  user ID
     * \else
     *  用户ID
     * \endif
     */
    public byte					szUserID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  count of target data,the max number is 20
     * \else
     *  目标模板数据个数,最大20
     * \endif
     */
    public int					nFaceData;

    /**
     * \if ENGLISH_LANG
     *  target data
     * \else
     *  目标模板数据
     * \endif
     */
    public byte					szFaceData[][] = new byte[20][2048];

    /**
     * \if ENGLISH_LANG
     *  target data length
     * \else
     *  目标模版数据大小
     * \endif
     */
    public int					nFaceDataLen[] = new int[20];

    /**
     * \if ENGLISH_LANG
     *  count of target photo,max size: 5
     * \else
     *  目标照片个数,不超过5个
     * \endif
     */
    public int					nFacePhoto;

    /**
     * \if ENGLISH_LANG
     *  the size of each photo used by the user
     * \else
     *  用户申请的每张图片的大小
     * \endif
     */
    public int					nInFacePhotoLen[] = new int[5];

    /**
     * \if ENGLISH_LANG
     *  the actual size of each photo
     * \else
     *  每张图片实际的大小
     * \endif
     */
    public int					nOutFacePhotoLen[] = new int[5];

    /**
     * \if ENGLISH_LANG
     *  target photo data,max size: 120K
     * \else
     *  目标照片数据,大小不超过200K
     * \endif
     */
    public byte[]					pFacePhoto;

    /**
     * \if ENGLISH_LANG
     *  Whether to use extended target template data
     * \else
     *  是否使用扩展目标模板数据
     * \endif
     */
    public boolean					bFaceDataExEnable;

    /**
     * \if ENGLISH_LANG
     *  Data size of the extended target template requested by the user
     * \else
     *  用户申请的扩展目标模板数据大小
     * \endif
     */
    public int					nMaxFaceDataLen[] = new int[20];

    /**
     * \if ENGLISH_LANG
     *  Actual target template data size
     * \else
     *  实际目标模板数据大小
     * \endif
     */
    public int					nRetFaceDataLen[] = new int[20];

    /**
     * \if ENGLISH_LANG
     *  Target template data extension field,When bFaceDataExEnable is valid, it is recommended to use the extension field pFaceDataEx
     * \else
     *  目标模板数据扩展字段 当bFaceDataExEnable有效时，建议使用扩展字段pFaceDataEx
     * \endif
     */
    public byte[]					pFaceDataEx;

    /**
     * \if ENGLISH_LANG
     *  Info UpdateTime,UTC time
     * \else
     *  目标信息更新时间,UTC时间
     * \endif
     */
    public NET_TIME					stuUpdateTime = new NET_TIME();

    @Override
    public String toString() {
        return "NET_ACCESS_FACE_INFO{" +
                "szUserID=" + new String(szUserID).trim() +
                ", nFaceData=" + nFaceData +
                ", szFaceData=" + Arrays.toString(szFaceData) +
                ", nFaceDataLen=" + Arrays.toString(nFaceDataLen) +
                ", nFacePhoto=" + nFacePhoto +
                ", nInFacePhotoLen=" + Arrays.toString(nInFacePhotoLen) +
                ", nOutFacePhotoLen=" + Arrays.toString(nOutFacePhotoLen) +
                ", pFacePhoto=" + Arrays.toString(pFacePhoto) +
                ", bFaceDataExEnable=" + bFaceDataExEnable +
                ", nMaxFaceDataLen=" + Arrays.toString(nMaxFaceDataLen) +
                ", nRetFaceDataLen=" + Arrays.toString(nRetFaceDataLen) +
                ", pFaceDataEx=" + Arrays.toString(pFaceDataEx) +
                ", stuUpdateTime=" + stuUpdateTime.toString() +
                '}';
    }
}

package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Picture type
 * \else
 * @brief 图片类型
 * \endif
 */
public class EM_IMAGE_TYPE_EX2 implements Serializable {
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
    public static final int					EM_IMAGE_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Panoramic wide angle
     * \else
     * 全景广角度
     * \endif
     */
    public static final int					EM_IMAGE_TYPE_SCENE_IMAGE = 1;

    /**
     * \if ENGLISH_LANG
     *  Large picture
     * \else
     * 大图
     * \endif
     */
    public static final int					EM_IMAGE_TYPE_GLOBAL_SCENE = 2;

    /**
     * \if ENGLISH_LANG
     *  Thumbnail of large image (panoramic image)
     * \else
     * 大图（全景图）的缩略图
     * \endif
     */
    public static final int					EM_IMAGE_TYPE_THUM_IMAGE = 3;

    /**
     * \if ENGLISH_LANG
     *  Panoramic image of human target
     * \else
     * 目标全景图
     * \endif
     */
    public static final int					EM_IMAGE_TYPE_FACE_SCENE_IMAGE = 4;

    /**
     * \if ENGLISH_LANG
     *  target image
     * \else
     * 目标图
     * \endif
     */
    public static final int					EM_IMAGE_TYPE_FACE_IMAGE = 5;

    /**
     * \if ENGLISH_LANG
     *  Human body image
     * \else
     * 人体图
     * \endif
     */
    public static final int					EM_IMAGE_TYPE_HUMAN_IMAGE = 6;

    /**
     * \if ENGLISH_LANG
     *  Human body image with the same picture as the optimal target
     * \else
     * 与最优目标同画面的人体图
     * \endif
     */
    public static final int					EM_IMAGE_TYPE_ALONG_WITH_FACE_HUMAN_IMAGE = 7;

    /**
     * \if ENGLISH_LANG
     *  A panoramic view of the human body in the same picture as the optimal target
     * \else
     * 与最优目标同画面人体的全景图
     * \endif
     */
    public static final int					EM_IMAGE_TYPE_ALONG_WITH_FACE_HUMAN_SCENE_IMAGE = 8;

    /**
     * \if ENGLISH_LANG
     *  Parking space cutout
     * \else
     * 车位抠图
     * \endif
     */
    public static final int					EM_IMAGE_TYPE_PARKING_IMAGE = 9;

    /**
     * \if ENGLISH_LANG
     *  Close-up cutout of car body
     * \else
     * 车身特写抠图
     * \endif
     */
    public static final int					EM_IMAGE_TYPE_BINARIZED_PLATE = 10;

    /**
     * \if ENGLISH_LANG
     *  Grid cutout
     * \else
     * 格口抠图
     * \endif
     */
    public static final int					EM_IMAGE_TYPE_DEPOSIT_IMAGE_INFO = 11;

    /**
     * \if ENGLISH_LANG
     *  Normal image, used when the image name is not defined
     * \else
     * 普通图，图片名称未定义情况使用
     * \endif
     */
    public static final int					EM_IMAGE_TYPE_IMAGE_INFO = 12;

}
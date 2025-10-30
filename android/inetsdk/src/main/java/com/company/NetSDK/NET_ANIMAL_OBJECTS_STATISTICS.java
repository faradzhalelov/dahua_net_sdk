package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Animal statistics
 * \else
 * 动物统计信息
 * \endif
 */
public class NET_ANIMAL_OBJECTS_STATISTICS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Total number of animals
     * \else
     * 动物总数
     * \endif
     */
    public int                 nAnimalsAmount;

    /**
     * \if ENGLISH_LANG
     *  animals type
     * \else
     *  动物类型
     * \endif
     */
    public VA_OBJECT_ANIMAL					stuAnimalTypes[] = new VA_OBJECT_ANIMAL[32];

    public NET_ANIMAL_OBJECTS_STATISTICS() {
        for(int i = 0; i < stuAnimalTypes.length; i ++){
            stuAnimalTypes[i] = new VA_OBJECT_ANIMAL();
        }
    }
}

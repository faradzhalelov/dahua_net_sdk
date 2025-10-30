package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * Scene list
 * \else
 * 场景列表
 * \endif
 */
public class CFG_VACAP_SUPPORTEDSCENES implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Supported scene number
     * \else
     * 支持的场景个数
     * \endif
     */
    public int                nScenes;

    /**
     * \if ENGLISH_LANG
     * Supported scene list
     * \else
     * 支持的场景列表
     * \endif
     */
    public CFG_CAP_SCENE[]      stScenes = new CFG_CAP_SCENE[FinalVar.MAX_SCENE_LIST_SIZE];

    public CFG_VACAP_SUPPORTEDSCENES() {
        for(int i = 0; i < FinalVar.MAX_SCENE_LIST_SIZE; i++) {
            stScenes[i] = new CFG_CAP_SCENE();
        }
    }

    @Override
    public String toString() {
        return "CFG_VACAP_SUPPORTEDSCENES{" +
                "nScenes=" + nScenes +
                ", stScenes=" + Arrays.toString(stScenes) +
                '}';
    }
}

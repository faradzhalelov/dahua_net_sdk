package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief the type of inside object
 * \else
 * @brief 物品类型
 * \endif
 */
public class EM_INSIDE_OBJECT_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     * 算法未识别物品
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Knife
     * \else
     * 刀具
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_KNIFE = 1;

    /**
     * \if ENGLISH_LANG
     *  BottleLiquid
     * \else
     * 瓶装液体
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_BOTTLELIQUID = 2;

    /**
     * \if ENGLISH_LANG
     *  Gun
     * \else
     * 枪支
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_GUN = 3;

    /**
     * \if ENGLISH_LANG
     *  Umbrella
     * \else
     * 雨伞
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_UMBRELLA = 4;

    /**
     * \if ENGLISH_LANG
     *  Phone
     * \else
     * 手机
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_PHONE = 5;

    /**
     * \if ENGLISH_LANG
     *  Notebook
     * \else
     * 笔记本
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_NOTEBOOK = 6;

    /**
     * \if ENGLISH_LANG
     *  Powerbank
     * \else
     * 充电宝
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_POWERBANK = 7;

    /**
     * \if ENGLISH_LANG
     *  Shoes
     * \else
     * 鞋子
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_SHOES = 8;

    /**
     * \if ENGLISH_LANG
     *  Rod
     * \else
     * 杠子
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_ROD = 9;

    /**
     * \if ENGLISH_LANG
     *  Metal
     * \else
     * 金属
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_METAL = 10;

    /**
     * \if ENGLISH_LANG
     *  Explosive
     * \else
     * 爆炸物
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_EXPLOSIVE = 11;

    /**
     * \if ENGLISH_LANG
     *  ContainerSpray
     * \else
     * 喷雾喷灌
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_CONTAINERSPRAY = 12;

    /**
     * \if ENGLISH_LANG
     *  ExplosiveFireworks
     * \else
     * 烟花爆竹
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_EXPLOSIVE_FIREWORKS = 13;

    /**
     * \if ENGLISH_LANG
     *  Lighter
     * \else
     * 打火机
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_LIGHTER = 14;

    /**
     * \if ENGLISH_LANG
     *  Stick
     * \else
     * 警棍
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_STICK = 15;

    /**
     * \if ENGLISH_LANG
     *  Brassknuckle
     * \else
     * 指虎
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_BRASSKNUCKLE = 16;

    /**
     * \if ENGLISH_LANG
     *  Handcuffs
     * \else
     * 手铐
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_HANDCUFFS = 17;

    /**
     * \if ENGLISH_LANG
     *  Ivory
     * \else
     * 象牙
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_IVORY = 18;

    /**
     * \if ENGLISH_LANG
     *  Book
     * \else
     * 书籍
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_BOOK = 19;

    /**
     * \if ENGLISH_LANG
     *  CD
     * \else
     * 光盘
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_CD = 20;

    /**
     * \if ENGLISH_LANG
     *  Hammers
     * \else
     * 锤子
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_HAMMERS = 21;

    /**
     * \if ENGLISH_LANG
     *  Pliers
     * \else
     * 钳子
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_PLIERS = 22;

    /**
     * \if ENGLISH_LANG
     *  Axe
     * \else
     * 斧头
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_AXE = 23;

    /**
     * \if ENGLISH_LANG
     *  Screwdriver
     * \else
     * 螺丝刀
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_SCREW_DRIVER = 24;

    /**
     * \if ENGLISH_LANG
     *  Wrench
     * \else
     * 扳手
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_WRENCH = 25;

    /**
     * \if ENGLISH_LANG
     *  Electric shock stick 
     * \else
     * 电击棍
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_ELECTRIC_SHOCK_STICK = 26;

    /**
     * \if ENGLISH_LANG
     *  Thermos
     * \else
     * 保温杯
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_THERMOS = 27;

    /**
     * \if ENGLISH_LANG
     *  Glass bottles
     * \else
     * 玻璃杯
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_GLASS_BOTTLES = 28;

    /**
     * \if ENGLISH_LANG
     *  Plastic bottle
     * \else
     * 塑料瓶
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_PLASTIC_BOTTLE = 29;

    /**
     * \if ENGLISH_LANG
     *  Ignition oil
     * \else
     * 打火机油
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_IGNITION_OIL = 30;

    /**
     * \if ENGLISH_LANG
     *  Nail polish
     * \else
     * 指甲油
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_NAIL_POLISH = 31;

    /**
     * \if ENGLISH_LANG
     *  Blunt instrument 
     * \else
     * 工具
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_BLUNT_INSTRUMENT = 32;

    /**
     * \if ENGLISH_LANG
     *  Scissors
     * \else
     * 剪刀
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_SCISSORS = 33;

    /**
     * \if ENGLISH_LANG
     *  Electronic
     * \else
     * 电子产品
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_ELECTRONIC = 34;

    /**
     * \if ENGLISH_LANG
     *  Pistol
     * \else
     *	手枪
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_PISTOL = 35;

    /**
     * \if ENGLISH_LANG
     *  Foldingknife
     * \else
     *	折叠刀
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_FOLDINGKNIFE = 36;

    /**
     * \if ENGLISH_LANG
     *  Sharpknife
     * \else
     *	尖刀
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_SHARPKNIFE = 37;

    /**
     * \if ENGLISH_LANG
     *  Kitchnknife
     * \else
     *	菜刀
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_KITCHENKNIFE = 38;

    /**
     * \if ENGLISH_LANG
     *  Utilityknife
     * \else
     *	美工刀
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_UTILITYKNIFE = 39;

    /**
     * \if ENGLISH_LANG
     *  Fireworks
     * \else
     *	烟花
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_FIREWORKS = 40;

    /**
     * \if ENGLISH_LANG
     *  Firecracker
     * \else
     *	爆竹
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_FIRECRACKER = 41;

    /**
     * \if ENGLISH_LANG
     *  powder
     * \else
     *	粉末
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_POWDER = 42;

    /**
     * \if ENGLISH_LANG
     *  ImpeneterableMaterals
     * \else
     *	难穿透物品
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_IMPENETERABLE_MATERALS = 43;

    /**
     * \if ENGLISH_LANG
     *  Cigarette
     * \else
     *	香烟
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_CIGARETTE = 44;

    /**
     * \if ENGLISH_LANG
     *  Battery
     * \else
     *	电池
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_BATTERY = 45;

    /**
     * \if ENGLISH_LANG
     *  GunParts
     * \else
     *	零部件
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_GUNPARTS = 46;

    /**
     * \if ENGLISH_LANG
     *  Match
     * \else
     * 火柴
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_MATCH = 47;

    /**
     * \if ENGLISH_LANG
     *  GunGrip
     * \else
     * 握把
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_GUNGRIP = 48;

    /**
     * \if ENGLISH_LANG
     *  GunMagazine
     * \else
     * 弹夹
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_GUNMAGAZINE = 49;

    /**
     * \if ENGLISH_LANG
     *  GunSleeve
     * \else
     * 套筒
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_GUNSLEEVE = 50;

    /**
     * \if ENGLISH_LANG
     *  GunBarrel
     * \else
     * 枪管
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_GUNBARREL = 51;

    /**
     * \if ENGLISH_LANG
     *  Bullet
     * \else
     * 子弹
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_BULLET = 52;

    /**
     * \if ENGLISH_LANG
     *  Grenade
     * \else
     * 手雷
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_GRENADE = 53;

    /**
     * \if ENGLISH_LANG
     *  CeramicSheet
     * \else
     * 陶瓷片
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_CERAMICSHEET = 54;

    /**
     * \if ENGLISH_LANG
     *  GlassSheet
     * \else
     * 玻璃片
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_GLASSSHEET = 55;

    /**
     * \if ENGLISH_LANG
     *  IpadBase
     * \else
     * IPAD底壳
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_IPADBASE = 56;

    /**
     * \if ENGLISH_LANG
     *  SlingShot
     * \else
     * 弹弓
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_SLINGSHOT = 57;

    /**
     * \if ENGLISH_LANG
     *  Drug
     * \else
     * 毒品
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_DRUG = 58;

    /**
     * \if ENGLISH_LANG
     *  ExplosivePackage
     * \else
     * 炸药包
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_EXPLOSIVEPACKAGE = 59;

    /**
     * \if ENGLISH_LANG
     *  CellBattery
     * \else
     * 纽扣电池
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_CELLBATTERY = 60;

    /**
     * \if ENGLISH_LANG
     *  LeadBattery
     * \else
     * 铅蓄电池
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_LEADBATTERY = 61;

    /**
     * \if ENGLISH_LANG
     *  MetalLighter
     * \else
     * 金属打火机
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_METALLIGHTER = 62;

    /**
     * \if ENGLISH_LANG
     *  CosmeticBottle
     * \else
     * 化妆瓶
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_COSMETICBOTTLE = 63;

    /**
     * \if ENGLISH_LANG
     *  ContainerCan
     * \else
     * 易拉罐
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_CONTAINERCAN = 64;

    /**
     * \if ENGLISH_LANG
     *  AirBottle
     * \else
     * 气罐
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_AIRBOTTLE = 65;

    /**
     * \if ENGLISH_LANG
     *  SquareKnife
     * \else
     * 方刀
     * \endif
     */
    public static final int					EM_INSIDE_OBJECT_SQUAREKNIFE = 66;

}
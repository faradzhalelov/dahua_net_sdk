package com.company.netsdk.common;

import com.company.netsdk.R;

public enum TemperatureUnit {

    UNKNOWN(-1, R.string.unknown),
    CENTIGRADE(0, R.string.centigrade),
    FAHRENHEIT(1, R.string.fahrenheit),
    KELVIN(2, R.string.kelvin);

    private int value;
    private int resId;

    private TemperatureUnit(int givenValue, int resId) {
        this.value = givenValue;
        this.resId = resId;
    }

    public int getResId() {
        return resId;
    }

    public int getValue() {
        return value;
    }

    public static int getResIdByValue(int givenValue) {
        for (TemperatureUnit enumType : TemperatureUnit.values()) {
            if (givenValue == enumType.getValue()) {
                return enumType.getResId();
            }
        }
        return TemperatureUnit.getResIdByValue(TemperatureUnit.UNKNOWN.value);
    }

}

package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/*
 * @创建者     wangb
 * @创建时间   2018/3/8 13:38
 * @描述       ${TODO}
 */

public class City extends DataSupport {

    private int id;

    private String cityName;

    private int cityCode;

    private int proviceId;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProviceId() {
        return proviceId;
    }

    public void setProviceId(int proviceId) {
        this.proviceId = proviceId;
    }
}

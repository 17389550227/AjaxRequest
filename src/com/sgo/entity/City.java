package com.sgo.entity;

/**
 * @author : sgo丶赵泽宏
 * @version : 1.0
 * @create : 2022/8/19 14:34
 * @Description :
 */
public class City {
    private int id;
    private String city;
    private int proId;

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", proId=" + proId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public City(int id, String city, int proId) {
        this.id = id;
        this.city = city;
        this.proId = proId;
    }
}

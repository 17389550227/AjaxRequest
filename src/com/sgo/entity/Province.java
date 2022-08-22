package com.sgo.entity;

/**
 * @author : sgo丶赵泽宏
 * @version : 1.0
 * @create : 2022/8/19 14:34
 * @Description :
 */
public class Province {
    private int id;
    private String shengfen;
    private String shenghui;
    private String jianchen;

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", shengfen='" + shengfen + '\'' +
                ", shenghui='" + shenghui + '\'' +
                ", jianchen='" + jianchen + '\'' +
                '}';
    }

    public Province(int id, String shengfen, String shenghui, String jianchen) {
        this.id = id;
        this.shengfen = shengfen;
        this.shenghui = shenghui;
        this.jianchen = jianchen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShengfen() {
        return shengfen;
    }

    public void setShengfen(String shengfen) {
        this.shengfen = shengfen;
    }

    public String getShenghui() {
        return shenghui;
    }

    public void setShenghui(String shenghui) {
        this.shenghui = shenghui;
    }

    public String getJianchen() {
        return jianchen;
    }

    public void setJianchen(String jianchen) {
        this.jianchen = jianchen;
    }
}

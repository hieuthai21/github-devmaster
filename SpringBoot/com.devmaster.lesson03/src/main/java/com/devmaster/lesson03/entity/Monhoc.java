package com.devmaster.lesson03.entity;

public class Monhoc {
    Long mamh;
    String tenmh;
    Long sotiet;

    public Monhoc(){
    }
    public Monhoc(Long makh, String tenmh, Long sotiet) {
        this.mamh = makh;
        this.tenmh = tenmh;
        this.sotiet = sotiet;
    }

    public String getTenmh() {
        return tenmh;
    }

    public void setTenmh(String tenmh) {
        this.tenmh = tenmh;
    }

    public Long getMamh() {
        return mamh;
    }

    public void setMamh(Long mamh) {
        this.mamh = mamh;
    }

    public Long getSotiet() {
        return sotiet;
    }

    public void setSotiet(Long sotiet) {
        this.sotiet = sotiet;
    }
}

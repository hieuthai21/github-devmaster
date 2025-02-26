package com.devmaster.lesson03.entity;

public class Khoa {
    long makh;
    String tenkh;
    public Khoa(long makh, String tenkh) {
        this.makh = makh;
        this.tenkh = tenkh;
    }
    public Khoa(){

    }
    public long getMakh() {
        return makh;
    }

    public void setMakh(long makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }
}

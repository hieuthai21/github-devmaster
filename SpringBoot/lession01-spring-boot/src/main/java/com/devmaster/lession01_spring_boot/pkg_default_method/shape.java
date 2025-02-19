package com.devmaster.lession01_spring_boot.pkg_default_method;

public interface shape {
    void draw();
    default void setColor(String color) {
        System.out.println("Vẽ hình với màr: "+color);
    }
}

package com.company;

public class Post {
    public static String Parcel;
    public static final String CONSTANT = "УкрПочта";

    public void parcelList(int i) {
        System.out.println("Прием посылок  " + i);
    }

    public void packingShipping(int i, long b) {
        System.out.println("Упаковать посылку " + i + "Количество поссылки " + b);
    }

    public static void post(int weight, int length, int height) {
        int Total = weight*length*height;
        System.out.println("Параметры посылки: " + Total);
    }
}


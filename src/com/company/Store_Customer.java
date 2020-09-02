package com.company;

public class Store_Customer {
    public String Product;
    public int Bonus;
    public static final String CONSTANT = "Майкл";

    public void product (int i) {
        System.out.println("Товары в корзине  " + i);
    }

    public void bonus(int i, long b) {
        System.out.println("Гривны " + i + "Копейки " + b);
    }
}
package com.company;

public class Seller {
    private String technics;

    public String getTechnics() {
        return technics;
    }

    public void setTechnics(String technics) {
        this.technics = technics;
    }

    public  String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String nameProduct;
    private int price;

    public void cashInPurse () {

    }
    public static final String CONSTANT = "Фокстрот";

    public void remainder (int rem){
        System.out.println("Сумма к оплате " + rem * price + "грн.");
    }
}

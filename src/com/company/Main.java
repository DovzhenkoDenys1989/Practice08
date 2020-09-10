package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Book French = new Book();
//        French.name = "Французкий";
//        French.Page = 50;
//        System.out.println("Книга" +" "+ French.name + " " + "состоит из "+ " " + French.Page + " " + "страниц");
        French.setName("Немецкий язык");
        French.setPage(50);
        French.flipping(5);
        French.chapter(3);
        French.defineChapter(2);
        Post.post(2, 5,4);

        System.out.println("Название книги" + " " + French.getName());
        System.out.println("Страниц в книге" + " " + French.getPage());

//        System.out.println("Клиент зашел в магазин и купил книгу " + Book.CONSTANT);
//        System.out.println( Post.CONSTANT + " " + "была доставщиком товара ");
//        System.out.println("Покупателя звали" + " " + Store_Customer.CONSTANT);
//        System.out.println("Продавцом был" + " " + Seller.CONSTANT);

          Seller computers = new Seller();
          computers.setTechnics("LG");
          computers.setNameProduct("L1500");
          computers.setPrice(10000);

          Seller tablet = new Seller();
          tablet.setTechnics("Lenovo");
          tablet.setNameProduct("Pro200");
          tablet.setPrice(3000);

          Seller telephone = new Seller();
          telephone.setTechnics("Apple");
          telephone.setNameProduct("X");
          telephone.setPrice(5000);

          computers.remainder(5);
          tablet.remainder(3);
          telephone.remainder(2);

        Scanner seller = new Scanner(System.in);
        System.out.println("Введите количество товаров для покупки: ");
        int purchase = seller.nextInt();
        System.out.println("Цена за " + purchase + " штук(и) составит: " + purchase * computers.getPrice() + " грн.");
        }
        }



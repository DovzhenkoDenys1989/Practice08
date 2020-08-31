package com.company;

public class Main {

    public static void main(String[] args) {
        Book French = new Book();
//        French.name = "Французкий";
//        French.Page = 50;
//        System.out.println("Книга" +" "+ French.name + " " + "состоит из "+ " " + French.Page + " " + "страниц");
        French.setName("Немецкий язык");
        French.setPage(50);
        System.out.println("Название книги" + " " + French.getName());
        System.out.println("Страниц в книге" + " " + French.getPage());

//        System.out.println("Клиент зашел в магазин и купил книгу " + Book.CONSTANT);
//        System.out.println( Post.CONSTANT + " " + "была доставщиком товара ");
//        System.out.println("Покупателя звали" + " " + Store_Customer.CONSTANT);
//        System.out.println("Продавцом был" + " " + Seller.CONSTANT);
    }
}

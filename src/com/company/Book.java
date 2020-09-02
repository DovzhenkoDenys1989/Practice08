package com.company;

public class Book {
    private int Page;

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int Chapter;
    public static final String CONSTANT = "English 2020";

    public void flipping () {
        System.out.println("Перелистнуть на страницу    ");
}

    public void flipping (int i) {
        System.out.println("Перелистнуть на страницу  "   +  i);}

    public void chapter (int i){
        System.out.println("Перелистнуть на главу " + i);
    }
    public void defineChapter (int i){
        System.out.println("Определить главу " + i);
    }

}






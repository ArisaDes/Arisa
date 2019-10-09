package com.bashtannikova.example;

import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Prestuplenie i nakazanie", 100);
        Book d2 = new Book("Voina i mir", 600);
        Book d3 = new Book("Argument");
        d3.setPage(40);
        System.out.println(d1);
        d1.intoPages();
        d2.intoPages();
        d3.intoPages();

    }
}

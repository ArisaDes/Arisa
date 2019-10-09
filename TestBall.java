package com.bashtannikova.example;

import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("Basketball", 7);
        Ball d2 = new Ball("Football", 5);
        Ball d3 = new Ball("Volleyball", 6);
        System.out.println(d1);
        d1.intoSize();
        d2.intoSize();
        d3.intoSize();

    }
}

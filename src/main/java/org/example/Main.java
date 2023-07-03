package org.example;


public class Main {

    public static void main(String[] args) {
        Cash cash = new Cash(100);
        cash.plus(50);
        cash.minus(100);
        cash.count();
    }


}
package com.everr.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input money:");
        int money = sc.nextInt();
        if (money > 2){
            System.out.println("dacan");

        }
        else {
            System.out.println("couhe");
        }
    }
}

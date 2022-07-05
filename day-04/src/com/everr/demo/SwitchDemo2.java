package com.everr.demo;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Systeml.in);
        System.out.println("input week:");
        int week = sc.nextInt();
        switch (week){
            case 1,2,3,4,5 -> System.out.println("work");
            case 6,7 -> System.out.println("happy");
            default -> System.out.println("error");


        }
    }

}

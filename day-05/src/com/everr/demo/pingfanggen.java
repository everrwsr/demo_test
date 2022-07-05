package com.everr.demo;

import java.util.Scanner;

public class pingfanggen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number:");
        //从一开始平方

        int a= sc.nextInt();
        for (int i=1;i<=a;i++){
            if (i*i==a){
                System.out.println(i+"jiushi"+a+"depingfanggen");
                break;
            }
            else if (i*i>=a){
                System.out.println(i+"jiushi"+a+"depingfanggen");
                break;

            }
        }
    }
}

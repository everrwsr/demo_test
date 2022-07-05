package com.everr.demo;

import java.util.Scanner;

public class zhishu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input :");
        boolean flag = true;
        int number = sc.nextInt();
        for (int i = 2; i <= number; i++) {
            //i依次表示范围内每个数字
            if(number %i ==0){
                flag = false;
//                System.out.println(number+"bushi");}

            }
        }
        if(flag){
            System.out.println(number+"shi");

        }
        else {
            System.out.println(number+"bushi");
        }

    }
}

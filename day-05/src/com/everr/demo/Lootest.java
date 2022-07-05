package com.everr.demo;

import java.util.Random;
import java.util.Scanner;

public class Lootest {
    public static void main(String[] args) {
        //1.随机数生成
        int count =0;
        Random r =new Random();
        int number = r.nextInt(100)+1;
//        System.out.println(number);
        //2.猜数字
        Scanner sc = new Scanner(System.in);
        while(true){
            count++;
        System.out.println("inpur guess number :");
        int guessNumber =sc.nextInt();
        if(guessNumber >number){
            System.out.println("da");

        } else if (guessNumber <number) {
            System.out.println("xiao");

        }
        else {
            System.out.println("yes");
            break;
        }

        }
    }

}

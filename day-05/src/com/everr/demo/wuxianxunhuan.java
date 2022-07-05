package com.everr.demo;

public class wuxianxunhuan {
    public static void main(String[] args) {
//        for (;;){
//            System.out.println("hello");
////        }
//        while(true){
////            System.out.println("hello");
//        for (int i =1 ; i<=5;i++){
//            System.out.println(i);
//            if (i==3){
//                break;
//            }
        for(int i =1; i<=100;i++){
            if(i%10==7 || i/10%10==7 || i%7 ==0){
                System.out.println("过");
                continue;
            }

            System.out.println(i);
        }
    }
}

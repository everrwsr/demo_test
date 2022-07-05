package com.everr.demo;

import java.util.Random;

public class ArayTest1 {
    public static void main(String[] args) {
        //1.定义数组
        int [] arr =new int[10];
        //2.把随机数存到数组中
        Random r =new Random();
        for (int i = 0; i < arr.length; i++) {
            int number =r.nextInt(100)+1;
            arr[i]=number;
            
        }
        int sum=0;
        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println("数组元素依次为：");
            System.out.println(arr[i]);
            sum+=arr[i];
        }
        int ave =sum/arr.length;
        System.out.println("和："+sum);
        System.out.println("平均数："+ ave);
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ave){
                count++;
            }

        }
        System.out.println("有"+count+"个数字比"+ave+"小");
    }
}

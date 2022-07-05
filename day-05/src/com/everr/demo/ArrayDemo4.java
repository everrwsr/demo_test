package com.everr.demo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] arr = {33, 23, 42, 54, 4};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(min);
    }


}

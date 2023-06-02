package com.java.nowcoder.childrens_day_2023;

import java.util.Scanner;

public class C {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        // 元素周期表
        double[] arr = new double[]{0,1.01,4.00,6.94,9.01,10.81,12.01,14.01,16.00,19.00,20.18,22.99,24.31,26.98,28.09,30.97,32.06,35.45,39.95,
                39.10,40.08,44.96,47.87,50.94,52.00,54.94,55.85,58.93,58.69,63.55,65.38,69.72,72.63,74.92,78.96,79.90,83.80
        };

        for (int i = 1; i <= 36; i ++) {
            System.out.printf("%.2f ", arr[i]);
        }
    }
}
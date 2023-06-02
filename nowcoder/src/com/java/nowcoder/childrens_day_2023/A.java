package com.java.nowcoder.childrens_day_2023;

import java.util.Scanner;

public class A {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();
        int cnt =  0;
        StringBuilder res  = new StringBuilder();
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= i; j ++) {
                res.append(j + "*" + i + "=");
                res.append(i * j + ",");
            }
        }
        for (int i = 0; i < res.length(); i ++) {
            if (res.charAt(i) == s.charAt(0)) cnt ++;
        }
        System.out.println(cnt);
    }
}
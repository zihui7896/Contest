package com.java.nowcoder.contest_74;

import java.util.Scanner;

public class A {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int[] arr = new int[]{2, 3, 5, 7};
        boolean st = false;
        for (int i = 0; i < 4; i ++) {
            if (x % arr[i] == 0) {
                st = true;
            }
        }
        if (st) System.out.println("YES");
        else System.out.println("NO");
    }
}
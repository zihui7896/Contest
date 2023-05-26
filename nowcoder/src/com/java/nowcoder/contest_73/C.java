package com.java.nowcoder.contest_73;

import java.util.Scanner;
import java.util.Arrays;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t -- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i ++) arr[i] = sc.nextInt();

            Arrays.sort(arr, 0, n);
            boolean st = false;
            for (int i = 0; i < n; i ++) {
                for (int j = 0; j < n; j ++) {
                    if (Math.abs(arr[i] - arr[j]) < Math.abs(i - j)) {
                        System.out.println("-1");
                        st = true;
                        break;
                    }
                }
                if (st) break;
            }
            if (!st) {
                for (int i = 0; i < n; i ++) System.out.println(arr[i] + " ");
            }
        }
    }
}
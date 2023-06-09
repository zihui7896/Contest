package com.java.nowcoder.contest_74;

import java.util.Scanner;

public class E {
    public static final int N = 100010;
    public static long[] h = new long[N];
    public static long[] arr = new long[N];

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t -- != 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt(), b = sc.nextInt();
            m --;
            for (int i = 0; i < n; i ++) h[i] = sc.nextLong();
            for (int i = 0; i < n; i ++) arr[i] = sc.nextLong();

            for (int i = 0; i < n; i ++) {
                if (h[i] + m  * arr[i] > k) {
                    long d = (k + 1) - h[i];
                    long c = m - (d + arr[i] - 1) / arr[i];
                    long p = (k + 1) - b;
                    long q = (p + arr[i] - 1) / arr[i];

                    System.out.print(b + c % q * arr[i] + " ");
                } else {
                    System.out.print(h[i] + m  * arr[i] + " ");
                }
            }
            System.out.println();

        }

    }
}
package com.contest.acw_106;

import java.util.Scanner;

public class B {
    public static final int N = 15;
    public static int[][] d = new int[N][N];


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j ++) {
                d[i][j] = sc.nextInt();
            }
        }

        for (int k = 0; k < n; k ++) {
            for (int i = 0; i < n; i ++) {
                for (int j = 0; j < n; j ++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j ++) {
                res = Math.max(res, d[i][j]);
            }
        }
        System.out.println(res);
    }
}
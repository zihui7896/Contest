package com.java.nowcoder.contest_74;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class C {
    public static final int N = 1010;
    public static int[][] arr = new int[N][N];

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t -- != 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            Set<Integer> set = new HashSet<Integer>();
            for (int i = 1; i <= n; i ++) {
                for (int j = 1; j <= m; j ++) {
                    arr[i][j] = sc.nextInt();
                    set.add(arr[i][j]);
                }
            }

            System.out.println(set.size());


        }
    }
}
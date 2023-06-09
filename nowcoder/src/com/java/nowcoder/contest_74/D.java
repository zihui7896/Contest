package com.java.nowcoder.contest_74;


import java.util.Arrays;
import java.util.Scanner;

public class D {
    public static final int N = 100010;
    public static int[] arr = new int[N];
    public static long[] b = new long[N];


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t -- != 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i ++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            int k = 0;
            for (int i = n - 1; i >= 0; i --) {
                if (arr[i] > 0) {
                    b[k ++] = (long)arr[i] * (n - i);
                }
            }
            long res = 0;
            Arrays.sort(b, 0, k);
            for (int i = k - 1, j = 0; i >= 0 && j < Math.min(n, m); j ++, i --){
                res += b[i];
            }
            System.out.println(sum - res);

        }
    }
}
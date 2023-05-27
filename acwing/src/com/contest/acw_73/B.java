package com.contest.acw_73;

import java.util.Scanner;

public class B {
    public static final int N = 5010;
    public static int[] arr = new int[N];
    public static int[] res = new int[N];


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i ++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i ++) {
            int id = 0, cnta = 0;
            int[] cnt = new int[n + 10];
            for (int j = i; j <= n; j ++) {

                cnt[arr[j]] ++;

                if (cnt[arr[j]] > cnta || (cnt[arr[j]] == cnta && id > arr[j] )) {
                    id = arr[j];
                    cnta = cnt[arr[j]];
                }

                res[id] ++;
            }
        }




        for (int i = 1; i <= n; i ++) System.out.print(res[i] + " ");
    }
}
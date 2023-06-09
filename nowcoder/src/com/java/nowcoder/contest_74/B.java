package com.java.nowcoder.contest_74;

import java.util.Scanner;

public class B {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t -- != 0) {
            int n = sc.nextInt();


            int sum = 0;
            for (int i = 1; i <= n / 2; i ++) {
                if (sum + i + i + 1 > n) break;
                sum += i;
                System.out.print(i + " ");
            }
            if (n - sum != 0) System.out.print(n - sum);
            System.out.println();
        }
    }
}
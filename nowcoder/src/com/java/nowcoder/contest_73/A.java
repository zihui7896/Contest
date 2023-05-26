package com.java.nowcoder.contest_73;

import java.util.Scanner;

public class A{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(n % 3 == 0 ? n : n / 3 * 3 + 3);
    }
}
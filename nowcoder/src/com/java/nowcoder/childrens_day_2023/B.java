package com.java.nowcoder.childrens_day_2023;

import java.util.Scanner;

public class B {
    // 求 n 个节点的树的最大团个数的期望。最大团的定义是选出最多的点，使得任意两点之间都有边。
    // 只有三种情况: 0(n=0); 1(n=1); 2(other)
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = -1;
        if (n == 0) res = 0;
        else if (n == 1) res = 1;
        else res = 2;

        System.out.println(res);
    }
}
package com.sbaws.product.java8;

import java.util.Scanner;

public class RecursionTest {

    static int checkPrime(int i, int num) {
        if (num == i)
            return 0;
        else if (num % i == 0)
            return 1;
        else {
            return checkPrime(i + 1, num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value::");
        int n = sc.nextInt();
        System.out.println("Prime Numbers between 1 to n are::");
        for (int i = 2; i <= n; i++) {
            if (checkPrime(2, i) == 0)
                System.out.println(i + "");
            sc.close();
        }
    }
}

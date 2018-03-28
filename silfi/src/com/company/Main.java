package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner show = new Scanner(System.in);
        System.out.println("Silfi Nur Amalia / 6706160043");
        System.out.print("Input : ");
        int n = show.nextInt();
        long fib[] = new long[n];
        long temp = 0;

        fib[0] = 1;
        fib[1] = 1;
        System.out.println(" ");
        System.out.println("Output : ");
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        for (int i = 0; i < n; i++) {
            temp = temp + fib[i];
        }
        System.out.println(temp);
    }
}

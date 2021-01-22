package com.hackerrank;

import java.util.Scanner;

public class Scribble {
    public static void main(String[] args) {
        System.out.print("\n");
        System.out.println("Untuk coret-coret dan test mekanisme program");
        System.out.print("\n");

        Scanner sysinpt = new Scanner(System.in);


        int k, i, m;

        System.out.print("Insert : ");
        k = sysinpt.nextInt();
        i = sysinpt.nextInt();






        m = (int) Math.pow(k, i);
        System.out.println(m);
    }
}

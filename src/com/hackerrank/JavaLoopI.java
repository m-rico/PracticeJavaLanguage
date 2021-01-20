package com.hackerrank;

import java.util.Scanner;

public class JavaLoopI {
    public static void main(String[] args) {

        System.out.println(" Practice Java Loop One");

        Scanner sysinpt = new Scanner(System.in);
        int N = sysinpt.nextInt();
        for(int d = 1; d <= 10; d++){
//            for (int k = d-1; k<=d;k++){
//                System.out.println(" this is value " + d);
//            }
//        int k = d - 1;
//        int result = d * k;
//            System.out.println(d + " x " + k + " = " + result);
            int k = N * d;
            System.out.println( "2 x " + d + " = " + k);
        }
    }
}

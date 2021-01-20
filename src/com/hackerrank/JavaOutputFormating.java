package com.hackerrank;

import java.util.Scanner;

public class JavaOutputFormating {
    public static void main(String[] args) {

        System.out.print("\n");
        System.out.println(" Java Output Formating");
        System.out.print("\n");

        Scanner sysinpt = new Scanner(System.in);

        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sysinpt.next();
            int x=sysinpt.nextInt();
            //Complete this line
            System.out.format("%-19s", s1);
            System.out.format("%03d%n", x);

        }

        System.out.println("================================");

    }
}

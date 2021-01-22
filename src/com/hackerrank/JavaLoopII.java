package com.hackerrank;

import java.util.Scanner;

public class JavaLoopII {
    public static void main(String[] args) {
        Scanner sysimpt = new Scanner(System.in);
        int t = sysimpt.nextInt();
        for(int i=0;i<t;i++){
            int a = sysimpt.nextInt();
            int b = sysimpt.nextInt();
            int n = sysimpt.nextInt();
            int dahyun = a;



            for (int k = 0; k<n;k++){
                int d = (int) Math.pow(t, k);
                dahyun += (d*b);
//                int r = (d*b);
//                int dcount = a + r;

                System.out.print(Integer.toString(dahyun) + " ");
            }
            System.out.print("\n");

        }

    }
}

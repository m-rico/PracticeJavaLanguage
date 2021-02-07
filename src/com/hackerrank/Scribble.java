package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Scribble {
    public static void main(String[] args) {

        System.out.println("Kim Dahyun");
        System.out.print("\n");

        int[][] arrayTwice = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.print("\n");
        printDubu(arrayTwice);

    }// batas main Method


    private static void printDubu(int[][] swag) {

        for (int k = 0; k < swag.length; k++){
            System.out.print("[");
            for (int i = 0; i < swag[k].length; i++) {

                System.out.print(i);

//                System.out.print(swag[i][k]);
//
//                if (i < swag.length - 1){
//                    System.out.print(",");
//                } else {
//                    System.out.print("]\n");
//                }
            }
        }



//        for (int k = 0; k < swag.length; k++) {
//            System.out.println());
//        }
    } // batas method printdubu


}


package com.driko;

import javax.security.auth.login.AccountNotFoundException;
import java.util.Arrays;

public class ArrayMultiDimensi {
    public static void main(String[] args) {
        System.out.println("Kim Dahyun");
        System.out.print("\n");

        //todo Array Multi dimensi

        // dengan assisgment
        System.out.println("print array menggunakan cara Assigment");
        int[][] arrayMYQueen = { {4, 5, 6}, {7, 8, 9} };
        System.out.println(Arrays.deepToString(arrayMYQueen));
        System.out.print("\n");


        // dengan deklarasi
        System.out.println("print array dengan menggunakan declaratd");
        int[][] arrayKimDahyun = new int[3][3];
        System.out.println("{");
        for (int k = 0; k < arrayKimDahyun.length; k++){
            System.out.print("{");
            for (int i = 0; i < arrayKimDahyun.length; i++){
                System.out.print(arrayKimDahyun[k][i] + ", ");
            }
            System.out.println("}");
        }
        System.out.println("}");


        // array baru

        int[][] arrayTwice = {
                {1,2,3},
                {3,4,5},
                {6,7,8}
        };

        System.out.print("\n");
        pintDubu(arrayTwice);


    }//batas Method main

    private static void pintDubu(int[][] swag){
        // penjelasan Foreach loop
        /*
            jadi jika for for (int[] baris : swag) maka artinya array 'baris' sama dengan array 'swag' kemudian loooing
            sebanyak jumlah dari length array 'swag' ( length dari array swag adalah 3 )
        */

        for (int[] baris : swag) {
            System.out.print("[");
            for (int angka : baris) {
                System.out.print(angka);
                int r = 0;
                int m = baris.length - 1;

                if (m <= swag.length ){
                    System.out.print("]");
                } else {
                    System.out.print("!");
                }
            }


        }


    }
}

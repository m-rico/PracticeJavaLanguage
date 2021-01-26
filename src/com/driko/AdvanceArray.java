package com.driko;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AdvanceArray {
    public static void main(String[] args) {
        System.out.println("Kim Dahyun");
        System.out.print("\n");

        /*
        ( Refrence atau acuan ) pada array dapat membuat 2 buah array memiliki isi variable yang sama.
        jadi ketika sebuah array memiliki variable int angkaSatu 1 sd 7 dan int angkaDua memiliki
        variable 9 sd 15, ketika dibuat perintah Array ( angkaSatu = angkaDua; ).
        maka array angkaSatu akan beralih ke array angkaDua ( Bukan mengCOPY melainkan berpindah ).

        uniknya meski kita memanggil array yang sudah direfrence di method lain,
        variablennya akan sama pada main methodnya


        */

        int[] arrayDahyun = {28, 5, 19, 98};
        int[] arrayRiko = {0, 0, 0, 0};

        System.out.println("Output Sebelum dilakukan Refrence");
        System.out.println("arrayDahyun " + Arrays.toString(arrayDahyun));
        System.out.println("arrayRiko " + Arrays.toString(arrayRiko));
        System.out.print("\n");
        System.out.println("Setelah dilakukan Refrence");

        arrayDahyun = arrayRiko;

        System.out.println("arrayDahyun = arrayRiko");
        System.out.print("\n");
        System.out.println("arrayDahyun " + Arrays.toString(arrayDahyun));
        System.out.println("arrayRiko " + Arrays.toString(arrayRiko));
    }
}

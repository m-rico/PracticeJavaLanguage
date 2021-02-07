package com.driko;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class BasicException {
    public static void main(String[] args) {
        System.out.println("Kim Dahyun");
        System.out.print("\n");

        int[] arraydubu = {1, 2, 3, 4, 5, 6, 7};


        Scanner sysinpt = new Scanner(System.in);
        System.out.print("masukkan index array yang dipilih : ");
        int chosed = sysinpt.nextInt();

//        int arraypic = arraydubu[chosed];
        System.out.print("\n");
        try {
            System.out.println("array yang dipilih " + arraydubu[chosed]);
        } catch (Exception error_exept){
            System.out.println(error_exept);
        }



    }
}

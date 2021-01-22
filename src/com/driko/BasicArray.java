package com.driko;

import java.io.PrintStream;

public class BasicArray {
    public static void main(String[] args) {

        /*
        (String[] args) merupakan sebuah Array Meskipun bukan merupakan sebuah data primitif
        singkatnya String merupakan class yang dibuat sebagai tipe data oleh Java
        */


              //Index =  0   1   2   3   4
              //         |   |   |   |   |
//        int darray[] = { 9, 10, 17, 20, 28 };
//
//        darray[2] = 11;
//
//        System.out.println(darray[2]);
//
//
//        // model lain dalam pembuatan array
//        double[] darrayt = {9, 10.1, 17.3, 20.7, 28.5};
//
//        darrayt[3] = 20.3;
//
//        System.out.println(darrayt[0]);
//                                 =       0           1        2       3        4        5         6          7          8
//                                 =       |           |        |       |        |        |         |          |          |
        String[] twice = new String[] {"Nayeon", "Jeongyeon", "Momo", "Sana", "Jihyo", "Mina", "MyQueen", "Chaeyoung", "Tzuyu"};

        twice[6] = "Dahyun";



//        for (int kim = 0; kim < 9; kim++) {
//            System.out.println(twice[kim]);
//        }

        // TODO Array menggunakan length
        /*
        Pada array biasanya anda harus memasukkan jumlah array sesuai dengan array yang ada,
        semisal ada array angka 1 sd 9 maka anda harus memanggil array dengan jumlah yang sama
        namun jumlahnya tidak berdasarkan index jadi index 0 tetap dihitung satu
        ------------------------------------------------------------------------------------------------------
        Index    =       0           1        2       3        4        5         6          7          8
                 =       |           |        |       |        |        |         |          |          |
        Array    =  {"Nayeon", "Jeongyeon", "Momo", "Sana", "Jihyo", "Mina", "MyQueen", "Chaeyoung", "Tzuyu"};
        ------------------------------------------------------------------------------------------------------

        kemudian bagaimana jika jumlahnya tidak diketahui atau anda ingin jumlahnya otomatis ?
        java memiliki atribut khusus untuk otomatisasi sebuah jumlah yaitu ( Length )
        seperti dibawah ini :
        */
/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        for (int kim = 0; kim < twice.length; kim++){
//            System.out.println(twice[kim]);
//        }
/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


        // TODO Array menggunakan For each

        /*
        For Each memungkinkan kita untuk melakukan looping otomatis (sesuai jumlah arraynya)
        tanpa menggunakan indeks. for each biasa digunakan ketika kita ingin melakukan looping tanpa mengambil
        indeksnya,


        */
/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        for (String queen : twice) {
            System.out.println(queen);
        }
/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    }
}

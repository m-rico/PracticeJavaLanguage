package com.driko;

import java.util.Arrays;

public class OperationArrays {
    public static void main(String[] args) {

        System.out.println("Kim Dahyun");
        System.out.print("\n");
        System.out.println("#|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||#");
        System.out.println("\t\t\t\t\t\t\tOperasi Pada Array");
        System.out.println("#|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||#");
        System.out.print("\n");

/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        int[] arrayTwice = {1, 2, 3, 4, 5, 6 ,7, 8, 9,};  // membuat int array dengan range 1 sd 9
        System.out.println(Arrays.toString(arrayTwice));  // mencetak array

        dahyun(arrayTwice);           //Print array menggunakan method dahyun yg telah dibuat sebelumnya

/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        /*
        Melakukan Copy pada sebuah array menggunakan loop for,

        */
/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.print("\n");
        System.out.println("#-----------------------------------#");
        System.out.println("Copy Array Standart menggunakan Loop");
        int[] arrayone = new int[9];                // membuat sebuah array kosomh
        for (int k=0; k<arrayTwice.length; k++){
            arrayone[k] = arrayTwice[k];

        }
        System.out.println(Arrays.toString(arrayone));

        System.out.print("\n");
        System.out.println("#-----------------------------------#");
        System.out.println("Copy Array Standart menggunakan copyOf");
        int[]   arraythree = new int[9];
        System.out.println(Arrays.toString(arrayTwice) + " will fill array ---> " + Arrays.toString(arraythree));
                arraythree = Arrays.copyOf(arrayTwice, 9);
        System.out.println(arraythree);
        System.out.println(Arrays.toString(arraythree));


        System.out.print("\n");
        System.out.println("#-----------------------------------#");
        System.out.println("Copy Array Standart menggunakan copyOfRange");
        int[] arrayfour = new int[9];
        System.out.println(arrayfour);
        System.out.println("Before = " + Arrays.toString(arrayfour) + " " + Arrays.toString(arrayTwice));
        arrayfour = Arrays.copyOfRange(arrayTwice,3, 7);
        System.out.println(Arrays.toString(arrayfour));


        System.out.print("\n");
        System.out.println("#-----------------------------------#");
        System.out.println("Operasi fill array");
        int[] arrayfive = new int[9];
        /* System out menggunakan method */ dahyun(arrayfive);


        Arrays.fill(arrayfive, 7);
        System.out.println(arrayfive);
        System.out.println(Arrays.toString(arrayfive));

        System.out.println();


        System.out.print("\n");
        System.out.println("#|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||#");
        System.out.println("\t\t\t\t\t\t\tOperasi Komparasi Array");
        System.out.println("#|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||#");
        System.out.print("\n");

        int[] arraysixteen = new int[9];

//        arraysixteen = Arrays.copyOf(arrayTwice, 9);
        arraysixteen = arrayTwice;

        System.out.println(" arrayTwice " + arrayTwice + " ---> " + Arrays.toString(arrayTwice));
        System.out.println(" arraysixteen " + arraysixteen + " ---> " + Arrays.toString(arraysixteen));
        System.out.print("\n");

        /*
        Diabwah ini contoh melakukan Komparasi atau perbandingan pada 2 buah array menggukanan if else
        dan operator pembanding ( == ). tidak direkonendasikan karna hasilnya selalu true;
        */
/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        System.out.println("Komparasi pada 2 buah array menggukanan if else dan operator pembanding ( == )");
//        if (arrayTwice == arraysixteen){
//            System.out.println(" ke 2 buah Array ini sama");
//        } else {
//            System.out.println(" ke 2 buah array ini berbeda");
//        }
//        System.out.print("\n");
/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


        /*



        */
/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("Komparasi pada 2 buah array menggukanan if else dan Attribute Array yang ada di JAVA");
        if (Arrays.equals(arrayfive, arrayTwice)){
            System.out.println(" ke 2 buah Array ini sama");
        } else {
            System.out.println(" ke 2 buah array ini berbeda");
        }
        System.out.print("\n");
/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


        /*
        membuat 2 buah array yang ingin di komparasi atau dibandingkan pertama arrayKim, kedua arrayDahyun
        kita tetapkan bahwa arrayKim berada disebelah kiri dan arrayDahyun ada disebelah kanan, maka :
                                            arrayKim --- arrayDahyun
                                            ( Kiri )      ( Kanan )
        jika (kiri) arrayKim lebih besar maka hasilnya : 1
        namun jika (kanan) arrayKim lebih besar maka hasilnya : -1
        dan jika hasilnya sama maka yang muncul adalah : 0
        */
/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//      Membuat Array baru untuk melakukan Komparasi

        System.out.println("melakukan perbandingan dengan attribute array ( Arrays.compare() )");
        int[] arrayKim = {1, 2, 3, 4, 5, 6, 7, 9, 9,};
        int[] arrayDahyun = {1, 2, 3, 4, 6, 6,7, 8, 9,};
        System.out.println(" arrayTwice " + arrayKim + " ---> " + Arrays.toString(arrayKim));
        System.out.println(" arraysixteen " + arrayDahyun + " ---> " + Arrays.toString(arrayDahyun));
        System.out.print("\n");

        System.out.println("Array manakah yang lebih besar ? ");
        System.out.println(Arrays.compare(arrayKim, arrayDahyun));
        System.out.print("\n");
/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        /*
        Melakukan Pengengecekan terhadap index mana yang berbeda hanya menunjukan index keberapa yang berbeda
        */
        System.out.println("melakukan pengecekan terhadap Index mana yang berbeda ");
        System.out.println(" arrayTwice " + arrayKim + " ---> " + Arrays.toString(arrayKim));
        System.out.println(" arraysixteen " + arrayDahyun + " ---> " + Arrays.toString(arrayDahyun));

        System.out.println(Arrays.mismatch(arrayKim, arrayDahyun));
/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        System.out.println("Melakukan sorting pada array");
        int[] arrayKimDahyun = {1, 6, 3, 8, 5, 4, 2, 9, 7};
        System.out.println(Arrays.toString(arrayKimDahyun));
        Arrays.sort(arrayKimDahyun);
        dahyun(arrayKimDahyun);         // Print out menggunakan method dahyun yang telah dibuat sebelumnya
        System.out.print("\n");

/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // memggunkam arrayKimDahyun yang telah disort sebelumnya
        System.out.println("melakukan search pada Arrays");
        int myqueen = Arrays.binarySearch(arrayKimDahyun,7);
        System.out.println(" hasil pencarian index array menggunakkan BinarySearch pada array ke -" + " " + myqueen);


    }// ini batas method main


    private static void dahyun(int[] dubu){

        System.out.println("menampilkan text didalam method dahyun");
        System.out.println("array -> " + Arrays.toString(dubu));
    }



}

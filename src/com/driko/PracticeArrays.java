package com.driko;

import java.util.Arrays;

public class PracticeArrays {
    public static void main(String[] args) {
        //Latihan arrays

        System.out.println("Kim Dahyun");
        System.out.print("\n");

        System.out.println("Latihan Arrays");
        System.out.print("\n");


        //Todo Latihan menjunmlahkan kedua buah array menggunakan Loop For

        int[] arrayKim = {3, 4, 9, 2, 1, 4, 6, 9, 3};
        int[] arrayDahyun = {7, 2, 3, 8, 6, 4, 5, 3, 3};

        int[] arrayKimDahyun = new int[arrayKim.length];

        System.out.println("#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#");
        System.out.println("Penjumlahan isi Array");
        System.out.println("arrayKim " + arrayKim + " ---> " + Arrays.toString(arrayKim));
        System.out.println("arrayDahyun " + arrayDahyun + " ---> " + Arrays.toString(arrayDahyun));

        for (int k = 0; k < arrayKimDahyun.length; k++){
            arrayKimDahyun[k] = arrayKim[k] + arrayDahyun[k];
        }


/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
/////// Opsional jika ingin menggunakan arrayKim sebagai hasil arrayKim + arrayDahyun

//        for (int k = 0; k < arrayKim.length; k++){
//            arrayKim[k] = arrayKim[k] + arrayDahyun[k];
//        }
//        System.out.println("hasil arrayKim + arrayDahyun : " + Arrays.toString(arrayKim));
/////// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



        System.out.println("-----------------------------------------------------------------");
        System.out.println("hasil arrayKim + arrayDahyun : " + Arrays.toString(arrayKimDahyun));
        System.out.println("#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#");
        System.out.print("\n");


        //Todo Menggabungkan 2 buah array

        System.out.println("#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#");
        System.out.println("menggabungkam 2 buah array");
        System.out.println("arrayKim" + arrayKim + " ---> " + Arrays.toString(arrayKim));
        System.out.println("arrayDahyun" + arrayDahyun + " ---> " + Arrays.toString(arrayDahyun));
        System.out.println("-----------------------------------------------------------------");
        kimDahyun(arrayKim, arrayDahyun);
        System.out.println("#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#");
        System.out.print("\n");



        //Todo Latihan mengurutkan array secara terbalik

        int[] arrayMyQueen = new int[arrayDahyun.length];

        Arrays.sort(arrayDahyun);

        // namaArray1 = Arrays.copyOf(namaArray2, Panjang index array yang ingin diCopy);
        arrayMyQueen = Arrays.copyOf(arrayDahyun, arrayDahyun.length);
        System.out.println("#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#");
        System.out.println("Mengurutkan Array Secara terbalik");
        System.out.println("sebelum di buffer : " + Arrays.toString(arrayMyQueen));

        for (int m = 0;  m < arrayDahyun.length; m++){
            arrayDahyun[m] = arrayMyQueen[(arrayMyQueen.length - 1) - m];
//            System.out.print(arrayDahyun[m] + ", ");
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Sesudah di buffer : " + Arrays.toString(arrayDahyun));
        System.out.println("#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#");

    }// batas method main










/////// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    /*
    Method umtuk melakukan penggabungan 2 buah array
    */
    private static void kimDahyun(int[] arrayM, int[] arrayRiko){

        /////// [] kurung siku pada array menandakan index dari array sementara kurung kurawal {} menandakan isi array

        int[] arraydubu = new int[arrayM.length + arrayRiko.length];

        for (int k = 0; k<arrayM.length; k++){
            arraydubu[k] = arrayM[k];

            }
        for (int r = 0; r<arrayRiko.length; r++){
            arraydubu[r + arrayM.length] = arrayRiko[r];
        }


        System.out.println("Hasil Gabung array : " + Arrays.toString(arraydubu));


    } // batas method kimDahyun
/////// iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii
}

package com.tasksolved;

public class ArrayMultiDimentionI {
    public static void main(String[] args) {
        System.out.println("Kim Dahyun");
        System.out.print("\n");

        /*
        //Todo Looping manual array Multi dimensi
        1. melooping assisgment array multidimensi secara manual dan dirapihkan
        2. membuat if else untuk merapihkan [] kurung siku dan koma pada looping angka array
        3. Bila perlu buat method untuk looping arrays
        */

        int[][] arraytwice = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        myqueen(arraytwice);

    } // end main method


    private static void myqueen(int[][] dubu){

        for (int[] baris : dubu){
            System.out.print("[ ");
            for (int kolom : baris){
                System.out.print(baris.length);
            }
        }


    }
}

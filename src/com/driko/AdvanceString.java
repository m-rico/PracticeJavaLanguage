package com.driko;

public class AdvanceString {
    public static void main(String[] args) throws Exception {
        System.out.println("\n Kim Dahyun \n\n");

        // Todo Pengenalan String
        /*
                perbedaan String dengan tipedata prinitif adalah karna string merupakan class atay method
                yang artinya banyak fungsi atau class helper yang bisa digunakan pada String.
                singkaynya :
                The String object is used to represent and manipulate a sequence of characters.
        */

        String kimString = "Dahyun";

        // create array char

        char[] arrayKimString = {'D', 'a', 'h', 'y', 'u', 'n'};
        int i = 0;
        int m = arrayKimString.length;


        System.out.println("Dengan String : " + kimString);
        System.out.print("Dengan array char : ");
        for (int k = 0; k < arrayKimString.length; k++){
            System.out.print(arrayKimString[k]);
        }
        System.out.print("\n");
        arrayKimString[0] = '\'';
        System.out.println("melakukan sort array char dengan index --> " + arrayKimString[0]);

        System.out.println("\n");
        arrayKimString.c                               
    }// end main method
}

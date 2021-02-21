package com.driko;

import java.time.Year;

public class AdvanceString {
    public static void main(String[] args) throws Exception {
        System.out.println("Kim Dahyun \n\n");

        // Todo Pengenalan String
        /*
                perbedaan String dengan tipedata prinitif adalah karna string merupakan class atay method
                yang artinya banyak fungsi atau class helper yang bisa digunakan pada String.
                singkaynya :
                The String object is used to represent and manipulate a sequence of characters.
        */

        //create String variable
        String kimString = "Dahyun";

        // create array char

        char[] arrayKimString = {'D', 'a', 'h', 'y', 'u', 'n'};
        System.out.print("Mencetak arrayKimString : ");
        System.out.println(arrayKimString);
        int i = 0;
        int m = arrayKimString.length;

        // melakukan print atau cetak terhadap array kim
        System.out.println("Dengan String : " + kimString); // menampilkan String array
        System.out.print("Dengan LOOP array char : ");

        //membentuk string menggunakan arrayString dengan metode For loop
        for (int k = 0; k < arrayKimString.length; k++){
            System.out.print(arrayKimString[k]);
        }
        System.out.print("\n");


        //merubah huruf pada arrayString
        System.out.println();
        arrayKimString[1] = '\'';
        System.out.print("Melakukan Replace pada arrayKimString : ");
        System.out.println(arrayKimString);


        // merubah string secara tidak langsung, karna string dijava bersifat inmutetable atau tidak bisa dirubah
        String  chose = kimString.charAt(0) + "\'" + kimString.substring(2,6);
        System.out.println("Melakukan Replace pada kimString : " + chose);
        System.out.println("\n");

        //memecah String array menggunakan Loop, berfungsi menyisipkan spasi diantara char pada array
        System.out.print("Memecah String menggunakan LOOP :");
        for (int r = 0; r <kimString.length(); r++){
            System.out.print(" ");
            System.out.print(kimString.charAt(r));
        }
        System.out.print("\n");

        //mengidentifikasi ArrayKimString kemudian mengubahnya menjadi hex
        int address = System.identityHashCode(arrayKimString);
        System.out.println("Mengubah arrayKimString menjadi hashcode : " + address);
        System.out.println("mengubah Hashcode arrayKimString menjadi Hex : " + Integer.toHexString(address));
        System.out.println("\n");



        //melakukan merubah Array menjadi Uppercase Dan Lower case
        String rd = "I Love Kim Dahyun";
        System.out.println("Default    : " + rd);
        System.out.println("Upper case : " + rd.toUpperCase());
        System.out.println("Lower case : " + rd.toLowerCase());
        System.out.println("\n");

        //melakukan Replace pada String
        System.out.println("Default         : " + rd);
        System.out.println(rd.replace("Love", "Really LOVE")); // mereplace tanpa menggunakan index
        System.out.println("Replace String  : " + rd);
        System.out.print("\n");


        //Melakukan Compare pada array dengan method .equals
        String km = "Dahyun";
        String dr = "Dahyun";
        ilove(km);
        System.out.print(" <Compare with> ");
        ilove(dr);
        System.out.print("\nCompare dengan Symbol operasi ==    : ");
        if(km == dr){
            System.out.println("String sama");
        }else {
            System.out.println("String berbeda");
        }
        System.out.print(" Comapre dengan method .qquals       : ");
                if (km.equals(dr)){
                    System.out.println("String sama");
                }else {
                    System.out.println("String berbeda");
                }


    }// end main method



    // membuat method compare

    private static void ilove(String jqk){
        int convrt = System.identityHashCode(jqk);
        System.out.print("| " + jqk + ", "+ Integer.toHexString(convrt) + " |");
    }
}


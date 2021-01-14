package com.driko;

public class NestedLoop {

    public static void main(String[] args) {

        //Deklarasikan Variable
        int k, i;


        for (k = 0; k < 5; k++){

//            System.out.println(" *");
            
            for (i = 0; i < k; i++) {
                System.out.print(" *");
            }



            System.out.printf("%n");
        }

        for (k = 0; k < 5; k++){

//            System.out.println(" *");

            for (i = 0; i < k; i++) {
                System.out.print(" *");
            }
            System.out.printf("%n");
        }


        for (int coloums = 0; coloums < 5; coloums++){
            for (int lines = 0; lines <= coloums; lines++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }

    }
}

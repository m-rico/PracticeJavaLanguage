package com.driko;

public class NestedLoop {

    public static void main(String[] args) {

        //Deklarasikan Variable
/*
        o
      ^/v
      / >
*/
        // Left Side


        /*

                    *
                  * *
                * * *
              * * * *
            * * * * *
              * * * *
                * * *
                  * *
                    *

         */



        for (int c = 0; c < 7 ; c++){


            for (int l = 0; l < 7 - c; l++) {
                System.out.print(" ");
            }

            for (int lt = 0; lt < c ; lt++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }

        for (int cb = 0; cb < 7 ; cb++){


            for (int lb = 0; lb < 7 - cb; lb++) {
                System.out.print(" ");
            }

            for (int ltb = 0; ltb < cb ; ltb++) {
                System.out.print(" *");
            }
            System.out.print("\n");

        }



        // Right Side

        /*

            *
            * *
            * * *
            * * * *
            * * * * *
            * * * *
            * * *
            * *
            *

        */



        for (int c = 0; c < 5; c++){

            for (int l = 0; l < c; l++) {
                System.out.print(" *");
            }
            System.out.printf("%n");
        }

        for (int coloums = 0; coloums < 5; coloums++){

            for (int lines = 0; lines < 5 - coloums; lines++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }

    }
}

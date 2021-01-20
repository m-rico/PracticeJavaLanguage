package com.driko;

public class TryNestedLoop {
    public static void main(String[] args) {

        // Left Side upper

        for (int c = 0; c <= 4; c++){
            int x;
            for (int k = c; k < 5; k++){
                System.out.print("  ");
            }
            for (int l = 0; l < c - 1; l++){
                System.out.print(" *");
            }
            for (int l = 0; l < c; l++) {
                System.out.print(" 1");
            }
            System.out.println(" ");
        }


        // left side lower

        for (int cd = 0; cd < 5; cd++){
            for (int kd = 0; kd< cd; kd++){
                System.out.print("  ");
            }
            for (int ld = cd; ld < 5; ld++){
                System.out.print(" 1");
            }
            for (int lines = 0; lines < 4 - cd; lines++) {
                System.out.print(" *");
            }

            System.out.println(" ");
        }
    }
}

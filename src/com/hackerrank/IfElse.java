package com.hackerrank;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class IfElse {
    public static void main (String[] args) throws IOException {
        System.out.print("\n");
        System.out.println(" Kim Dahyun");
        System.out.print("\n");

        int inpt;
        Scanner sysinpt;
        int kim;


        sysinpt = new Scanner(System.in);
        System.out.println("input : ");
        inpt = sysinpt.nextInt();

        kim = inpt % 2;

        if (kim == 1){
            System.out.println("weird");
        } else {

            if (inpt <= 5) {
                System.out.println(inpt + " not weird");
            } else if (inpt <= 20) {
                System.out.println(inpt + " weird");
            } else if (inpt > 20) {
                System.out.println(inpt + " not weird");
            }
        }

        FileInputStream inptstrm = new FileInputStream("dubu.txt");
        System.out.println(inptstrm.read());
    } // akhir dari method main
}
